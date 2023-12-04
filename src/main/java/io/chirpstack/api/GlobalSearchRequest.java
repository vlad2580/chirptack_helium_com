// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.GlobalSearchRequest}
 */
public final class GlobalSearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.GlobalSearchRequest)
    GlobalSearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GlobalSearchRequest.newBuilder() to construct.
  private GlobalSearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GlobalSearchRequest() {
    search_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GlobalSearchRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return InternalProto.internal_static_api_GlobalSearchRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return InternalProto.internal_static_api_GlobalSearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GlobalSearchRequest.class, Builder.class);
  }

  public static final int SEARCH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object search_ = "";
  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>string search = 1;</code>
   * @return The search.
   */
  @Override
  public String getSearch() {
    Object ref = search_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      search_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>string search = 1;</code>
   * @return The bytes for search.
   */
  @Override
  public com.google.protobuf.ByteString
      getSearchBytes() {
    Object ref = search_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      search_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private long limit_ = 0L;
  /**
   * <pre>
   * Max number of results to return.
   * </pre>
   *
   * <code>int64 limit = 2;</code>
   * @return The limit.
   */
  @Override
  public long getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private long offset_ = 0L;
  /**
   * <pre>
   * Offset offset of the result-set (for pagination).
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  @Override
  public long getOffset() {
    return offset_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(search_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, search_);
    }
    if (limit_ != 0L) {
      output.writeInt64(2, limit_);
    }
    if (offset_ != 0L) {
      output.writeInt64(3, offset_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(search_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, search_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, limit_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, offset_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GlobalSearchRequest)) {
      return super.equals(obj);
    }
    GlobalSearchRequest other = (GlobalSearchRequest) obj;

    if (!getSearch()
        .equals(other.getSearch())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEARCH_FIELD_NUMBER;
    hash = (53 * hash) + getSearch().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GlobalSearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalSearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalSearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalSearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalSearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GlobalSearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GlobalSearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GlobalSearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GlobalSearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GlobalSearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GlobalSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GlobalSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GlobalSearchRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.GlobalSearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.GlobalSearchRequest)
      GlobalSearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return InternalProto.internal_static_api_GlobalSearchRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return InternalProto.internal_static_api_GlobalSearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GlobalSearchRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.GlobalSearchRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      search_ = "";
      limit_ = 0L;
      offset_ = 0L;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return InternalProto.internal_static_api_GlobalSearchRequest_descriptor;
    }

    @Override
    public GlobalSearchRequest getDefaultInstanceForType() {
      return GlobalSearchRequest.getDefaultInstance();
    }

    @Override
    public GlobalSearchRequest build() {
      GlobalSearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GlobalSearchRequest buildPartial() {
      GlobalSearchRequest result = new GlobalSearchRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GlobalSearchRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.search_ = search_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.offset_ = offset_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GlobalSearchRequest) {
        return mergeFrom((GlobalSearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GlobalSearchRequest other) {
      if (other == GlobalSearchRequest.getDefaultInstance()) return this;
      if (!other.getSearch().isEmpty()) {
        search_ = other.search_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              search_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              limit_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              offset_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Object search_ = "";
    /**
     * <pre>
     * Search query.
     * </pre>
     *
     * <code>string search = 1;</code>
     * @return The search.
     */
    public String getSearch() {
      Object ref = search_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        search_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Search query.
     * </pre>
     *
     * <code>string search = 1;</code>
     * @return The bytes for search.
     */
    public com.google.protobuf.ByteString
        getSearchBytes() {
      Object ref = search_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        search_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Search query.
     * </pre>
     *
     * <code>string search = 1;</code>
     * @param value The search to set.
     * @return This builder for chaining.
     */
    public Builder setSearch(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      search_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Search query.
     * </pre>
     *
     * <code>string search = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearch() {
      search_ = getDefaultInstance().getSearch();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Search query.
     * </pre>
     *
     * <code>string search = 1;</code>
     * @param value The bytes for search to set.
     * @return This builder for chaining.
     */
    public Builder setSearchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      search_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <pre>
     * Max number of results to return.
     * </pre>
     *
     * <code>int64 limit = 2;</code>
     * @return The limit.
     */
    @Override
    public long getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * Max number of results to return.
     * </pre>
     *
     * <code>int64 limit = 2;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max number of results to return.
     * </pre>
     *
     * <code>int64 limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <pre>
     * Offset offset of the result-set (for pagination).
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     * @return The offset.
     */
    @Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * Offset offset of the result-set (for pagination).
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset offset of the result-set (for pagination).
     * </pre>
     *
     * <code>int64 offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      offset_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.GlobalSearchRequest)
  }

  // @@protoc_insertion_point(class_scope:api.GlobalSearchRequest)
  private static final GlobalSearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GlobalSearchRequest();
  }

  public static GlobalSearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlobalSearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<GlobalSearchRequest>() {
    @Override
    public GlobalSearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GlobalSearchRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GlobalSearchRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public GlobalSearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
