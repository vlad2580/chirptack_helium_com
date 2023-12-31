// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.CreateApiKeyRequest}
 */
public final class CreateApiKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CreateApiKeyRequest)
    CreateApiKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateApiKeyRequest.newBuilder() to construct.
  private CreateApiKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateApiKeyRequest() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateApiKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return InternalProto.internal_static_api_CreateApiKeyRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return InternalProto.internal_static_api_CreateApiKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CreateApiKeyRequest.class, Builder.class);
  }

  public static final int API_KEY_FIELD_NUMBER = 1;
  private ApiKey apiKey_;
  /**
   * <pre>
   * The API key to create.
   * </pre>
   *
   * <code>.api.ApiKey api_key = 1;</code>
   * @return Whether the apiKey field is set.
   */
  @Override
  public boolean hasApiKey() {
    return apiKey_ != null;
  }
  /**
   * <pre>
   * The API key to create.
   * </pre>
   *
   * <code>.api.ApiKey api_key = 1;</code>
   * @return The apiKey.
   */
  @Override
  public ApiKey getApiKey() {
    return apiKey_ == null ? ApiKey.getDefaultInstance() : apiKey_;
  }
  /**
   * <pre>
   * The API key to create.
   * </pre>
   *
   * <code>.api.ApiKey api_key = 1;</code>
   */
  @Override
  public ApiKeyOrBuilder getApiKeyOrBuilder() {
    return apiKey_ == null ? ApiKey.getDefaultInstance() : apiKey_;
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
    if (apiKey_ != null) {
      output.writeMessage(1, getApiKey());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApiKey());
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
    if (!(obj instanceof CreateApiKeyRequest)) {
      return super.equals(obj);
    }
    CreateApiKeyRequest other = (CreateApiKeyRequest) obj;

    if (hasApiKey() != other.hasApiKey()) return false;
    if (hasApiKey()) {
      if (!getApiKey()
          .equals(other.getApiKey())) return false;
    }
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
    if (hasApiKey()) {
      hash = (37 * hash) + API_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getApiKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CreateApiKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateApiKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateApiKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateApiKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateApiKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateApiKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateApiKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateApiKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateApiKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CreateApiKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateApiKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateApiKeyRequest parseFrom(
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
  public static Builder newBuilder(CreateApiKeyRequest prototype) {
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
   * Protobuf type {@code api.CreateApiKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CreateApiKeyRequest)
      CreateApiKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return InternalProto.internal_static_api_CreateApiKeyRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return InternalProto.internal_static_api_CreateApiKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CreateApiKeyRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.CreateApiKeyRequest.newBuilder()
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
      apiKey_ = null;
      if (apiKeyBuilder_ != null) {
        apiKeyBuilder_.dispose();
        apiKeyBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return InternalProto.internal_static_api_CreateApiKeyRequest_descriptor;
    }

    @Override
    public CreateApiKeyRequest getDefaultInstanceForType() {
      return CreateApiKeyRequest.getDefaultInstance();
    }

    @Override
    public CreateApiKeyRequest build() {
      CreateApiKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CreateApiKeyRequest buildPartial() {
      CreateApiKeyRequest result = new CreateApiKeyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(CreateApiKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.apiKey_ = apiKeyBuilder_ == null
            ? apiKey_
            : apiKeyBuilder_.build();
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof CreateApiKeyRequest) {
        return mergeFrom((CreateApiKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CreateApiKeyRequest other) {
      if (other == CreateApiKeyRequest.getDefaultInstance()) return this;
      if (other.hasApiKey()) {
        mergeApiKey(other.getApiKey());
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
              input.readMessage(
                  getApiKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private ApiKey apiKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ApiKey, ApiKey.Builder, ApiKeyOrBuilder> apiKeyBuilder_;
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     * @return Whether the apiKey field is set.
     */
    public boolean hasApiKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     * @return The apiKey.
     */
    public ApiKey getApiKey() {
      if (apiKeyBuilder_ == null) {
        return apiKey_ == null ? ApiKey.getDefaultInstance() : apiKey_;
      } else {
        return apiKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public Builder setApiKey(ApiKey value) {
      if (apiKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiKey_ = value;
      } else {
        apiKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public Builder setApiKey(
        ApiKey.Builder builderForValue) {
      if (apiKeyBuilder_ == null) {
        apiKey_ = builderForValue.build();
      } else {
        apiKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public Builder mergeApiKey(ApiKey value) {
      if (apiKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          apiKey_ != null &&
          apiKey_ != ApiKey.getDefaultInstance()) {
          getApiKeyBuilder().mergeFrom(value);
        } else {
          apiKey_ = value;
        }
      } else {
        apiKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public Builder clearApiKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      apiKey_ = null;
      if (apiKeyBuilder_ != null) {
        apiKeyBuilder_.dispose();
        apiKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public ApiKey.Builder getApiKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getApiKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    public ApiKeyOrBuilder getApiKeyOrBuilder() {
      if (apiKeyBuilder_ != null) {
        return apiKeyBuilder_.getMessageOrBuilder();
      } else {
        return apiKey_ == null ?
            ApiKey.getDefaultInstance() : apiKey_;
      }
    }
    /**
     * <pre>
     * The API key to create.
     * </pre>
     *
     * <code>.api.ApiKey api_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ApiKey, ApiKey.Builder, ApiKeyOrBuilder>
        getApiKeyFieldBuilder() {
      if (apiKeyBuilder_ == null) {
        apiKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ApiKey, ApiKey.Builder, ApiKeyOrBuilder>(
                getApiKey(),
                getParentForChildren(),
                isClean());
        apiKey_ = null;
      }
      return apiKeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.CreateApiKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:api.CreateApiKeyRequest)
  private static final CreateApiKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateApiKeyRequest();
  }

  public static CreateApiKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApiKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateApiKeyRequest>() {
    @Override
    public CreateApiKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateApiKeyRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CreateApiKeyRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public CreateApiKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

