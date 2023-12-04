// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.DeviceQueueItem}
 */
public final class DeviceQueueItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.DeviceQueueItem)
    DeviceQueueItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceQueueItem.newBuilder() to construct.
  private DeviceQueueItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceQueueItem() {
    id_ = "";
    devEui_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceQueueItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DeviceProto.internal_static_api_DeviceQueueItem_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DeviceProto.internal_static_api_DeviceQueueItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DeviceQueueItem.class, Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object id_ = "";
  /**
   * <pre>
   * ID (UUID).
   * This is automatically generated on enqueue.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @Override
  public String getId() {
    Object ref = id_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID (UUID).
   * This is automatically generated on enqueue.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    Object ref = id_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEV_EUI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object devEui_ = "";
  /**
   * <pre>
   * Device EUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 2;</code>
   * @return The devEui.
   */
  @Override
  public String getDevEui() {
    Object ref = devEui_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      devEui_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Device EUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 2;</code>
   * @return The bytes for devEui.
   */
  @Override
  public com.google.protobuf.ByteString
      getDevEuiBytes() {
    Object ref = devEui_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      devEui_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIRMED_FIELD_NUMBER = 3;
  private boolean confirmed_ = false;
  /**
   * <pre>
   * Confirmed.
   * </pre>
   *
   * <code>bool confirmed = 3;</code>
   * @return The confirmed.
   */
  @Override
  public boolean getConfirmed() {
    return confirmed_;
  }

  public static final int F_PORT_FIELD_NUMBER = 4;
  private int fPort_ = 0;
  /**
   * <pre>
   * FPort (must be &gt; 0).
   * </pre>
   *
   * <code>uint32 f_port = 4;</code>
   * @return The fPort.
   */
  @Override
  public int getFPort() {
    return fPort_;
  }

  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Data.
   * Or use the json_object field when a codec has been configured.
   * </pre>
   *
   * <code>bytes data = 5;</code>
   * @return The data.
   */
  @Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int OBJECT_FIELD_NUMBER = 6;
  private com.google.protobuf.Struct object_;
  /**
   * <pre>
   * Only use this when a codec has been configured that can encode this
   * object to bytes.
   * </pre>
   *
   * <code>.google.protobuf.Struct object = 6;</code>
   * @return Whether the object field is set.
   */
  @Override
  public boolean hasObject() {
    return object_ != null;
  }
  /**
   * <pre>
   * Only use this when a codec has been configured that can encode this
   * object to bytes.
   * </pre>
   *
   * <code>.google.protobuf.Struct object = 6;</code>
   * @return The object.
   */
  @Override
  public com.google.protobuf.Struct getObject() {
    return object_ == null ? com.google.protobuf.Struct.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * Only use this when a codec has been configured that can encode this
   * object to bytes.
   * </pre>
   *
   * <code>.google.protobuf.Struct object = 6;</code>
   */
  @Override
  public com.google.protobuf.StructOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.google.protobuf.Struct.getDefaultInstance() : object_;
  }

  public static final int IS_PENDING_FIELD_NUMBER = 7;
  private boolean isPending_ = false;
  /**
   * <pre>
   * Is pending.
   * This is set to true when the downlink is pending.
   * </pre>
   *
   * <code>bool is_pending = 7;</code>
   * @return The isPending.
   */
  @Override
  public boolean getIsPending() {
    return isPending_;
  }

  public static final int F_CNT_DOWN_FIELD_NUMBER = 8;
  private int fCntDown_ = 0;
  /**
   * <pre>
   * Downlink frame-counter.
   * This is set when the payload has been sent as downlink.
   * </pre>
   *
   * <code>uint32 f_cnt_down = 8;</code>
   * @return The fCntDown.
   */
  @Override
  public int getFCntDown() {
    return fCntDown_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devEui_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, devEui_);
    }
    if (confirmed_ != false) {
      output.writeBool(3, confirmed_);
    }
    if (fPort_ != 0) {
      output.writeUInt32(4, fPort_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(5, data_);
    }
    if (object_ != null) {
      output.writeMessage(6, getObject());
    }
    if (isPending_ != false) {
      output.writeBool(7, isPending_);
    }
    if (fCntDown_ != 0) {
      output.writeUInt32(8, fCntDown_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devEui_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, devEui_);
    }
    if (confirmed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, confirmed_);
    }
    if (fPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, fPort_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
    }
    if (object_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getObject());
    }
    if (isPending_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isPending_);
    }
    if (fCntDown_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, fCntDown_);
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
    if (!(obj instanceof DeviceQueueItem)) {
      return super.equals(obj);
    }
    DeviceQueueItem other = (DeviceQueueItem) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getDevEui()
        .equals(other.getDevEui())) return false;
    if (getConfirmed()
        != other.getConfirmed()) return false;
    if (getFPort()
        != other.getFPort()) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (hasObject() != other.hasObject()) return false;
    if (hasObject()) {
      if (!getObject()
          .equals(other.getObject())) return false;
    }
    if (getIsPending()
        != other.getIsPending()) return false;
    if (getFCntDown()
        != other.getFCntDown()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + DEV_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getDevEui().hashCode();
    hash = (37 * hash) + CONFIRMED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConfirmed());
    hash = (37 * hash) + F_PORT_FIELD_NUMBER;
    hash = (53 * hash) + getFPort();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (hasObject()) {
      hash = (37 * hash) + OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getObject().hashCode();
    }
    hash = (37 * hash) + IS_PENDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPending());
    hash = (37 * hash) + F_CNT_DOWN_FIELD_NUMBER;
    hash = (53 * hash) + getFCntDown();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DeviceQueueItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DeviceQueueItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DeviceQueueItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DeviceQueueItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DeviceQueueItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DeviceQueueItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DeviceQueueItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DeviceQueueItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DeviceQueueItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DeviceQueueItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DeviceQueueItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DeviceQueueItem parseFrom(
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
  public static Builder newBuilder(DeviceQueueItem prototype) {
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
   * Protobuf type {@code api.DeviceQueueItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.DeviceQueueItem)
      DeviceQueueItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeviceProto.internal_static_api_DeviceQueueItem_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeviceProto.internal_static_api_DeviceQueueItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DeviceQueueItem.class, Builder.class);
    }

    // Construct using io.chirpstack.api.DeviceQueueItem.newBuilder()
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
      id_ = "";
      devEui_ = "";
      confirmed_ = false;
      fPort_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      isPending_ = false;
      fCntDown_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DeviceProto.internal_static_api_DeviceQueueItem_descriptor;
    }

    @Override
    public DeviceQueueItem getDefaultInstanceForType() {
      return DeviceQueueItem.getDefaultInstance();
    }

    @Override
    public DeviceQueueItem build() {
      DeviceQueueItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DeviceQueueItem buildPartial() {
      DeviceQueueItem result = new DeviceQueueItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(DeviceQueueItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.devEui_ = devEui_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.confirmed_ = confirmed_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fPort_ = fPort_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.data_ = data_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.isPending_ = isPending_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.fCntDown_ = fCntDown_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof DeviceQueueItem) {
        return mergeFrom((DeviceQueueItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DeviceQueueItem other) {
      if (other == DeviceQueueItem.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDevEui().isEmpty()) {
        devEui_ = other.devEui_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getConfirmed() != false) {
        setConfirmed(other.getConfirmed());
      }
      if (other.getFPort() != 0) {
        setFPort(other.getFPort());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.hasObject()) {
        mergeObject(other.getObject());
      }
      if (other.getIsPending() != false) {
        setIsPending(other.getIsPending());
      }
      if (other.getFCntDown() != 0) {
        setFCntDown(other.getFCntDown());
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              devEui_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              confirmed_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              fPort_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getObjectFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 56: {
              isPending_ = input.readBool();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              fCntDown_ = input.readUInt32();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
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

    private Object id_ = "";
    /**
     * <pre>
     * ID (UUID).
     * This is automatically generated on enqueue.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public String getId() {
      Object ref = id_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * ID (UUID).
     * This is automatically generated on enqueue.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID (UUID).
     * This is automatically generated on enqueue.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID (UUID).
     * This is automatically generated on enqueue.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID (UUID).
     * This is automatically generated on enqueue.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private Object devEui_ = "";
    /**
     * <pre>
     * Device EUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 2;</code>
     * @return The devEui.
     */
    public String getDevEui() {
      Object ref = devEui_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        devEui_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Device EUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 2;</code>
     * @return The bytes for devEui.
     */
    public com.google.protobuf.ByteString
        getDevEuiBytes() {
      Object ref = devEui_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        devEui_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Device EUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 2;</code>
     * @param value The devEui to set.
     * @return This builder for chaining.
     */
    public Builder setDevEui(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      devEui_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device EUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevEui() {
      devEui_ = getDefaultInstance().getDevEui();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device EUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 2;</code>
     * @param value The bytes for devEui to set.
     * @return This builder for chaining.
     */
    public Builder setDevEuiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      devEui_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean confirmed_ ;
    /**
     * <pre>
     * Confirmed.
     * </pre>
     *
     * <code>bool confirmed = 3;</code>
     * @return The confirmed.
     */
    @Override
    public boolean getConfirmed() {
      return confirmed_;
    }
    /**
     * <pre>
     * Confirmed.
     * </pre>
     *
     * <code>bool confirmed = 3;</code>
     * @param value The confirmed to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmed(boolean value) {

      confirmed_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Confirmed.
     * </pre>
     *
     * <code>bool confirmed = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfirmed() {
      bitField0_ = (bitField0_ & ~0x00000004);
      confirmed_ = false;
      onChanged();
      return this;
    }

    private int fPort_ ;
    /**
     * <pre>
     * FPort (must be &gt; 0).
     * </pre>
     *
     * <code>uint32 f_port = 4;</code>
     * @return The fPort.
     */
    @Override
    public int getFPort() {
      return fPort_;
    }
    /**
     * <pre>
     * FPort (must be &gt; 0).
     * </pre>
     *
     * <code>uint32 f_port = 4;</code>
     * @param value The fPort to set.
     * @return This builder for chaining.
     */
    public Builder setFPort(int value) {

      fPort_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FPort (must be &gt; 0).
     * </pre>
     *
     * <code>uint32 f_port = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFPort() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fPort_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Data.
     * Or use the json_object field when a codec has been configured.
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @return The data.
     */
    @Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * Data.
     * Or use the json_object field when a codec has been configured.
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data.
     * Or use the json_object field when a codec has been configured.
     * </pre>
     *
     * <code>bytes data = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000010);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> objectBuilder_;
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     * @return The object.
     */
    public com.google.protobuf.Struct getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.google.protobuf.Struct.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public Builder setObject(com.google.protobuf.Struct value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public Builder setObject(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public Builder mergeObject(com.google.protobuf.Struct value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          object_ != null &&
          object_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000020);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public com.google.protobuf.Struct.Builder getObjectBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    public com.google.protobuf.StructOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * Only use this when a codec has been configured that can encode this
     * object to bytes.
     * </pre>
     *
     * <code>.google.protobuf.Struct object = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    private boolean isPending_ ;
    /**
     * <pre>
     * Is pending.
     * This is set to true when the downlink is pending.
     * </pre>
     *
     * <code>bool is_pending = 7;</code>
     * @return The isPending.
     */
    @Override
    public boolean getIsPending() {
      return isPending_;
    }
    /**
     * <pre>
     * Is pending.
     * This is set to true when the downlink is pending.
     * </pre>
     *
     * <code>bool is_pending = 7;</code>
     * @param value The isPending to set.
     * @return This builder for chaining.
     */
    public Builder setIsPending(boolean value) {

      isPending_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is pending.
     * This is set to true when the downlink is pending.
     * </pre>
     *
     * <code>bool is_pending = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPending() {
      bitField0_ = (bitField0_ & ~0x00000040);
      isPending_ = false;
      onChanged();
      return this;
    }

    private int fCntDown_ ;
    /**
     * <pre>
     * Downlink frame-counter.
     * This is set when the payload has been sent as downlink.
     * </pre>
     *
     * <code>uint32 f_cnt_down = 8;</code>
     * @return The fCntDown.
     */
    @Override
    public int getFCntDown() {
      return fCntDown_;
    }
    /**
     * <pre>
     * Downlink frame-counter.
     * This is set when the payload has been sent as downlink.
     * </pre>
     *
     * <code>uint32 f_cnt_down = 8;</code>
     * @param value The fCntDown to set.
     * @return This builder for chaining.
     */
    public Builder setFCntDown(int value) {

      fCntDown_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Downlink frame-counter.
     * This is set when the payload has been sent as downlink.
     * </pre>
     *
     * <code>uint32 f_cnt_down = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFCntDown() {
      bitField0_ = (bitField0_ & ~0x00000080);
      fCntDown_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.DeviceQueueItem)
  }

  // @@protoc_insertion_point(class_scope:api.DeviceQueueItem)
  private static final DeviceQueueItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DeviceQueueItem();
  }

  public static DeviceQueueItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceQueueItem>
      PARSER = new com.google.protobuf.AbstractParser<DeviceQueueItem>() {
    @Override
    public DeviceQueueItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceQueueItem> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DeviceQueueItem> getParserForType() {
    return PARSER;
  }

  @Override
  public DeviceQueueItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

