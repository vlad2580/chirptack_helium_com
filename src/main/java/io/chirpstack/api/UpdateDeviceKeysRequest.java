// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.UpdateDeviceKeysRequest}
 */
public final class UpdateDeviceKeysRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.UpdateDeviceKeysRequest)
    UpdateDeviceKeysRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDeviceKeysRequest.newBuilder() to construct.
  private UpdateDeviceKeysRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDeviceKeysRequest() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDeviceKeysRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DeviceProto.internal_static_api_UpdateDeviceKeysRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DeviceProto.internal_static_api_UpdateDeviceKeysRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UpdateDeviceKeysRequest.class, Builder.class);
  }

  public static final int DEVICE_KEYS_FIELD_NUMBER = 1;
  private DeviceKeys deviceKeys_;
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return Whether the deviceKeys field is set.
   */
  @Override
  public boolean hasDeviceKeys() {
    return deviceKeys_ != null;
  }
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return The deviceKeys.
   */
  @Override
  public DeviceKeys getDeviceKeys() {
    return deviceKeys_ == null ? DeviceKeys.getDefaultInstance() : deviceKeys_;
  }
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   */
  @Override
  public DeviceKeysOrBuilder getDeviceKeysOrBuilder() {
    return deviceKeys_ == null ? DeviceKeys.getDefaultInstance() : deviceKeys_;
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
    if (deviceKeys_ != null) {
      output.writeMessage(1, getDeviceKeys());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceKeys_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeviceKeys());
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
    if (!(obj instanceof UpdateDeviceKeysRequest)) {
      return super.equals(obj);
    }
    UpdateDeviceKeysRequest other = (UpdateDeviceKeysRequest) obj;

    if (hasDeviceKeys() != other.hasDeviceKeys()) return false;
    if (hasDeviceKeys()) {
      if (!getDeviceKeys()
          .equals(other.getDeviceKeys())) return false;
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
    if (hasDeviceKeys()) {
      hash = (37 * hash) + DEVICE_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceKeys().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UpdateDeviceKeysRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpdateDeviceKeysRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpdateDeviceKeysRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UpdateDeviceKeysRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UpdateDeviceKeysRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UpdateDeviceKeysRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UpdateDeviceKeysRequest parseFrom(
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
  public static Builder newBuilder(UpdateDeviceKeysRequest prototype) {
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
   * Protobuf type {@code api.UpdateDeviceKeysRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.UpdateDeviceKeysRequest)
      UpdateDeviceKeysRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeviceProto.internal_static_api_UpdateDeviceKeysRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeviceProto.internal_static_api_UpdateDeviceKeysRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UpdateDeviceKeysRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.UpdateDeviceKeysRequest.newBuilder()
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
      deviceKeys_ = null;
      if (deviceKeysBuilder_ != null) {
        deviceKeysBuilder_.dispose();
        deviceKeysBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DeviceProto.internal_static_api_UpdateDeviceKeysRequest_descriptor;
    }

    @Override
    public UpdateDeviceKeysRequest getDefaultInstanceForType() {
      return UpdateDeviceKeysRequest.getDefaultInstance();
    }

    @Override
    public UpdateDeviceKeysRequest build() {
      UpdateDeviceKeysRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public UpdateDeviceKeysRequest buildPartial() {
      UpdateDeviceKeysRequest result = new UpdateDeviceKeysRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(UpdateDeviceKeysRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deviceKeys_ = deviceKeysBuilder_ == null
            ? deviceKeys_
            : deviceKeysBuilder_.build();
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UpdateDeviceKeysRequest) {
        return mergeFrom((UpdateDeviceKeysRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UpdateDeviceKeysRequest other) {
      if (other == UpdateDeviceKeysRequest.getDefaultInstance()) return this;
      if (other.hasDeviceKeys()) {
        mergeDeviceKeys(other.getDeviceKeys());
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
                  getDeviceKeysFieldBuilder().getBuilder(),
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

    private DeviceKeys deviceKeys_;
    private com.google.protobuf.SingleFieldBuilderV3<
        DeviceKeys, DeviceKeys.Builder, DeviceKeysOrBuilder> deviceKeysBuilder_;
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     * @return Whether the deviceKeys field is set.
     */
    public boolean hasDeviceKeys() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     * @return The deviceKeys.
     */
    public DeviceKeys getDeviceKeys() {
      if (deviceKeysBuilder_ == null) {
        return deviceKeys_ == null ? DeviceKeys.getDefaultInstance() : deviceKeys_;
      } else {
        return deviceKeysBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public Builder setDeviceKeys(DeviceKeys value) {
      if (deviceKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceKeys_ = value;
      } else {
        deviceKeysBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public Builder setDeviceKeys(
        DeviceKeys.Builder builderForValue) {
      if (deviceKeysBuilder_ == null) {
        deviceKeys_ = builderForValue.build();
      } else {
        deviceKeysBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public Builder mergeDeviceKeys(DeviceKeys value) {
      if (deviceKeysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deviceKeys_ != null &&
          deviceKeys_ != DeviceKeys.getDefaultInstance()) {
          getDeviceKeysBuilder().mergeFrom(value);
        } else {
          deviceKeys_ = value;
        }
      } else {
        deviceKeysBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public Builder clearDeviceKeys() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deviceKeys_ = null;
      if (deviceKeysBuilder_ != null) {
        deviceKeysBuilder_.dispose();
        deviceKeysBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public DeviceKeys.Builder getDeviceKeysBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeviceKeysFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    public DeviceKeysOrBuilder getDeviceKeysOrBuilder() {
      if (deviceKeysBuilder_ != null) {
        return deviceKeysBuilder_.getMessageOrBuilder();
      } else {
        return deviceKeys_ == null ?
            DeviceKeys.getDefaultInstance() : deviceKeys_;
      }
    }
    /**
     * <pre>
     * Device-keys object.
     * </pre>
     *
     * <code>.api.DeviceKeys device_keys = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        DeviceKeys, DeviceKeys.Builder, DeviceKeysOrBuilder>
        getDeviceKeysFieldBuilder() {
      if (deviceKeysBuilder_ == null) {
        deviceKeysBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            DeviceKeys, DeviceKeys.Builder, DeviceKeysOrBuilder>(
                getDeviceKeys(),
                getParentForChildren(),
                isClean());
        deviceKeys_ = null;
      }
      return deviceKeysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.UpdateDeviceKeysRequest)
  }

  // @@protoc_insertion_point(class_scope:api.UpdateDeviceKeysRequest)
  private static final UpdateDeviceKeysRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UpdateDeviceKeysRequest();
  }

  public static UpdateDeviceKeysRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDeviceKeysRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDeviceKeysRequest>() {
    @Override
    public UpdateDeviceKeysRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDeviceKeysRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UpdateDeviceKeysRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public UpdateDeviceKeysRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

