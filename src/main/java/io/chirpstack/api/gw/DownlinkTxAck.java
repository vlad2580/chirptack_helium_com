// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

/**
 * Protobuf type {@code gw.DownlinkTxAck}
 */
public final class DownlinkTxAck extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gw.DownlinkTxAck)
    DownlinkTxAckOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownlinkTxAck.newBuilder() to construct.
  private DownlinkTxAck(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownlinkTxAck() {
    gatewayIdLegacy_ = com.google.protobuf.ByteString.EMPTY;
    gatewayId_ = "";
    downlinkIdLegacy_ = com.google.protobuf.ByteString.EMPTY;
    items_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownlinkTxAck();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GatewayProto.internal_static_gw_DownlinkTxAck_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GatewayProto.internal_static_gw_DownlinkTxAck_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DownlinkTxAck.class, Builder.class);
  }

  public static final int GATEWAY_ID_LEGACY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString gatewayIdLegacy_;
  /**
   * <pre>
   * Gateway ID (deprecated).
   * </pre>
   *
   * <code>bytes gateway_id_legacy = 1;</code>
   * @return The gatewayIdLegacy.
   */
  @Override
  public com.google.protobuf.ByteString getGatewayIdLegacy() {
    return gatewayIdLegacy_;
  }

  public static final int GATEWAY_ID_FIELD_NUMBER = 6;
  private volatile Object gatewayId_;
  /**
   * <pre>
   * Gateway ID.
   * </pre>
   *
   * <code>string gateway_id = 6;</code>
   * @return The gatewayId.
   */
  @Override
  public String getGatewayId() {
    Object ref = gatewayId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      gatewayId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Gateway ID.
   * </pre>
   *
   * <code>string gateway_id = 6;</code>
   * @return The bytes for gatewayId.
   */
  @Override
  public com.google.protobuf.ByteString
      getGatewayIdBytes() {
    Object ref = gatewayId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      gatewayId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOWNLINK_ID_FIELD_NUMBER = 2;
  private int downlinkId_;
  /**
   * <pre>
   * Downlink ID.
   * </pre>
   *
   * <code>uint32 downlink_id = 2;</code>
   * @return The downlinkId.
   */
  @Override
  public int getDownlinkId() {
    return downlinkId_;
  }

  public static final int DOWNLINK_ID_LEGACY_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString downlinkIdLegacy_;
  /**
   * <pre>
   * Downlink ID (deprecated).
   * </pre>
   *
   * <code>bytes downlink_id_legacy = 4;</code>
   * @return The downlinkIdLegacy.
   */
  @Override
  public com.google.protobuf.ByteString getDownlinkIdLegacy() {
    return downlinkIdLegacy_;
  }

  public static final int ITEMS_FIELD_NUMBER = 5;
  private java.util.List<DownlinkTxAckItem> items_;
  /**
   * <pre>
   * Downlink frame items.
   * This list has the same length as the request and indicates which
   * downlink frame has been emitted of the requested list (or why it failed).
   * Note that at most one item has a positive acknowledgement.
   * </pre>
   *
   * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
   */
  @Override
  public java.util.List<DownlinkTxAckItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * Downlink frame items.
   * This list has the same length as the request and indicates which
   * downlink frame has been emitted of the requested list (or why it failed).
   * Note that at most one item has a positive acknowledgement.
   * </pre>
   *
   * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
   */
  @Override
  public java.util.List<? extends DownlinkTxAckItemOrBuilder>
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * Downlink frame items.
   * This list has the same length as the request and indicates which
   * downlink frame has been emitted of the requested list (or why it failed).
   * Note that at most one item has a positive acknowledgement.
   * </pre>
   *
   * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
   */
  @Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * Downlink frame items.
   * This list has the same length as the request and indicates which
   * downlink frame has been emitted of the requested list (or why it failed).
   * Note that at most one item has a positive acknowledgement.
   * </pre>
   *
   * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
   */
  @Override
  public DownlinkTxAckItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * Downlink frame items.
   * This list has the same length as the request and indicates which
   * downlink frame has been emitted of the requested list (or why it failed).
   * Note that at most one item has a positive acknowledgement.
   * </pre>
   *
   * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
   */
  @Override
  public DownlinkTxAckItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    if (!gatewayIdLegacy_.isEmpty()) {
      output.writeBytes(1, gatewayIdLegacy_);
    }
    if (downlinkId_ != 0) {
      output.writeUInt32(2, downlinkId_);
    }
    if (!downlinkIdLegacy_.isEmpty()) {
      output.writeBytes(4, downlinkIdLegacy_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(5, items_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gatewayId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, gatewayId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!gatewayIdLegacy_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, gatewayIdLegacy_);
    }
    if (downlinkId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, downlinkId_);
    }
    if (!downlinkIdLegacy_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, downlinkIdLegacy_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, items_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gatewayId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, gatewayId_);
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
    if (!(obj instanceof DownlinkTxAck)) {
      return super.equals(obj);
    }
    DownlinkTxAck other = (DownlinkTxAck) obj;

    if (!getGatewayIdLegacy()
        .equals(other.getGatewayIdLegacy())) return false;
    if (!getGatewayId()
        .equals(other.getGatewayId())) return false;
    if (getDownlinkId()
        != other.getDownlinkId()) return false;
    if (!getDownlinkIdLegacy()
        .equals(other.getDownlinkIdLegacy())) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    hash = (37 * hash) + GATEWAY_ID_LEGACY_FIELD_NUMBER;
    hash = (53 * hash) + getGatewayIdLegacy().hashCode();
    hash = (37 * hash) + GATEWAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGatewayId().hashCode();
    hash = (37 * hash) + DOWNLINK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDownlinkId();
    hash = (37 * hash) + DOWNLINK_ID_LEGACY_FIELD_NUMBER;
    hash = (53 * hash) + getDownlinkIdLegacy().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DownlinkTxAck parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DownlinkTxAck parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DownlinkTxAck parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DownlinkTxAck parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DownlinkTxAck parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DownlinkTxAck parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DownlinkTxAck parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DownlinkTxAck parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DownlinkTxAck parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DownlinkTxAck parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DownlinkTxAck parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DownlinkTxAck parseFrom(
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
  public static Builder newBuilder(DownlinkTxAck prototype) {
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
   * Protobuf type {@code gw.DownlinkTxAck}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gw.DownlinkTxAck)
      DownlinkTxAckOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GatewayProto.internal_static_gw_DownlinkTxAck_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GatewayProto.internal_static_gw_DownlinkTxAck_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DownlinkTxAck.class, Builder.class);
    }

    // Construct using io.chirpstack.api.gw.DownlinkTxAck.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      gatewayIdLegacy_ = com.google.protobuf.ByteString.EMPTY;

      gatewayId_ = "";

      downlinkId_ = 0;

      downlinkIdLegacy_ = com.google.protobuf.ByteString.EMPTY;

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GatewayProto.internal_static_gw_DownlinkTxAck_descriptor;
    }

    @Override
    public DownlinkTxAck getDefaultInstanceForType() {
      return DownlinkTxAck.getDefaultInstance();
    }

    @Override
    public DownlinkTxAck build() {
      DownlinkTxAck result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DownlinkTxAck buildPartial() {
      DownlinkTxAck result = new DownlinkTxAck(this);
      int from_bitField0_ = bitField0_;
      result.gatewayIdLegacy_ = gatewayIdLegacy_;
      result.gatewayId_ = gatewayId_;
      result.downlinkId_ = downlinkId_;
      result.downlinkIdLegacy_ = downlinkIdLegacy_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof DownlinkTxAck) {
        return mergeFrom((DownlinkTxAck)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DownlinkTxAck other) {
      if (other == DownlinkTxAck.getDefaultInstance()) return this;
      if (other.getGatewayIdLegacy() != com.google.protobuf.ByteString.EMPTY) {
        setGatewayIdLegacy(other.getGatewayIdLegacy());
      }
      if (!other.getGatewayId().isEmpty()) {
        gatewayId_ = other.gatewayId_;
        onChanged();
      }
      if (other.getDownlinkId() != 0) {
        setDownlinkId(other.getDownlinkId());
      }
      if (other.getDownlinkIdLegacy() != com.google.protobuf.ByteString.EMPTY) {
        setDownlinkIdLegacy(other.getDownlinkIdLegacy());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
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
              gatewayIdLegacy_ = input.readBytes();

              break;
            } // case 10
            case 16: {
              downlinkId_ = input.readUInt32();

              break;
            } // case 16
            case 34: {
              downlinkIdLegacy_ = input.readBytes();

              break;
            } // case 34
            case 42: {
              DownlinkTxAckItem m =
                  input.readMessage(
                      DownlinkTxAckItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 42
            case 50: {
              gatewayId_ = input.readStringRequireUtf8();

              break;
            } // case 50
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

    private com.google.protobuf.ByteString gatewayIdLegacy_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Gateway ID (deprecated).
     * </pre>
     *
     * <code>bytes gateway_id_legacy = 1;</code>
     * @return The gatewayIdLegacy.
     */
    @Override
    public com.google.protobuf.ByteString getGatewayIdLegacy() {
      return gatewayIdLegacy_;
    }
    /**
     * <pre>
     * Gateway ID (deprecated).
     * </pre>
     *
     * <code>bytes gateway_id_legacy = 1;</code>
     * @param value The gatewayIdLegacy to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayIdLegacy(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gatewayIdLegacy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Gateway ID (deprecated).
     * </pre>
     *
     * <code>bytes gateway_id_legacy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGatewayIdLegacy() {
      
      gatewayIdLegacy_ = getDefaultInstance().getGatewayIdLegacy();
      onChanged();
      return this;
    }

    private Object gatewayId_ = "";
    /**
     * <pre>
     * Gateway ID.
     * </pre>
     *
     * <code>string gateway_id = 6;</code>
     * @return The gatewayId.
     */
    public String getGatewayId() {
      Object ref = gatewayId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        gatewayId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Gateway ID.
     * </pre>
     *
     * <code>string gateway_id = 6;</code>
     * @return The bytes for gatewayId.
     */
    public com.google.protobuf.ByteString
        getGatewayIdBytes() {
      Object ref = gatewayId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        gatewayId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Gateway ID.
     * </pre>
     *
     * <code>string gateway_id = 6;</code>
     * @param value The gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gatewayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Gateway ID.
     * </pre>
     *
     * <code>string gateway_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGatewayId() {
      
      gatewayId_ = getDefaultInstance().getGatewayId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Gateway ID.
     * </pre>
     *
     * <code>string gateway_id = 6;</code>
     * @param value The bytes for gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gatewayId_ = value;
      onChanged();
      return this;
    }

    private int downlinkId_ ;
    /**
     * <pre>
     * Downlink ID.
     * </pre>
     *
     * <code>uint32 downlink_id = 2;</code>
     * @return The downlinkId.
     */
    @Override
    public int getDownlinkId() {
      return downlinkId_;
    }
    /**
     * <pre>
     * Downlink ID.
     * </pre>
     *
     * <code>uint32 downlink_id = 2;</code>
     * @param value The downlinkId to set.
     * @return This builder for chaining.
     */
    public Builder setDownlinkId(int value) {
      
      downlinkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Downlink ID.
     * </pre>
     *
     * <code>uint32 downlink_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownlinkId() {
      
      downlinkId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString downlinkIdLegacy_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Downlink ID (deprecated).
     * </pre>
     *
     * <code>bytes downlink_id_legacy = 4;</code>
     * @return The downlinkIdLegacy.
     */
    @Override
    public com.google.protobuf.ByteString getDownlinkIdLegacy() {
      return downlinkIdLegacy_;
    }
    /**
     * <pre>
     * Downlink ID (deprecated).
     * </pre>
     *
     * <code>bytes downlink_id_legacy = 4;</code>
     * @param value The downlinkIdLegacy to set.
     * @return This builder for chaining.
     */
    public Builder setDownlinkIdLegacy(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      downlinkIdLegacy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Downlink ID (deprecated).
     * </pre>
     *
     * <code>bytes downlink_id_legacy = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownlinkIdLegacy() {
      
      downlinkIdLegacy_ = getDefaultInstance().getDownlinkIdLegacy();
      onChanged();
      return this;
    }

    private java.util.List<DownlinkTxAckItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<DownlinkTxAckItem>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        DownlinkTxAckItem, DownlinkTxAckItem.Builder, DownlinkTxAckItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public java.util.List<DownlinkTxAckItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public DownlinkTxAckItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder setItems(
        int index, DownlinkTxAckItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder setItems(
        int index, DownlinkTxAckItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder addItems(DownlinkTxAckItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder addItems(
        int index, DownlinkTxAckItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder addItems(
        DownlinkTxAckItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder addItems(
        int index, DownlinkTxAckItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder addAllItems(
        Iterable<? extends DownlinkTxAckItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public DownlinkTxAckItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public DownlinkTxAckItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public java.util.List<? extends DownlinkTxAckItemOrBuilder>
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public DownlinkTxAckItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          DownlinkTxAckItem.getDefaultInstance());
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public DownlinkTxAckItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, DownlinkTxAckItem.getDefaultInstance());
    }
    /**
     * <pre>
     * Downlink frame items.
     * This list has the same length as the request and indicates which
     * downlink frame has been emitted of the requested list (or why it failed).
     * Note that at most one item has a positive acknowledgement.
     * </pre>
     *
     * <code>repeated .gw.DownlinkTxAckItem items = 5;</code>
     */
    public java.util.List<DownlinkTxAckItem.Builder>
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        DownlinkTxAckItem, DownlinkTxAckItem.Builder, DownlinkTxAckItemOrBuilder>
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            DownlinkTxAckItem, DownlinkTxAckItem.Builder, DownlinkTxAckItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:gw.DownlinkTxAck)
  }

  // @@protoc_insertion_point(class_scope:gw.DownlinkTxAck)
  private static final DownlinkTxAck DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DownlinkTxAck();
  }

  public static DownlinkTxAck getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownlinkTxAck>
      PARSER = new com.google.protobuf.AbstractParser<DownlinkTxAck>() {
    @Override
    public DownlinkTxAck parsePartialFrom(
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

  public static com.google.protobuf.Parser<DownlinkTxAck> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DownlinkTxAck> getParserForType() {
    return PARSER;
  }

  @Override
  public DownlinkTxAck getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
