// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.GetDeviceActivationRequest}
 */
public final class GetDeviceActivationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.GetDeviceActivationRequest)
    GetDeviceActivationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDeviceActivationRequest.newBuilder() to construct.
  private GetDeviceActivationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDeviceActivationRequest() {
    devEui_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDeviceActivationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DeviceProto.internal_static_api_GetDeviceActivationRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DeviceProto.internal_static_api_GetDeviceActivationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetDeviceActivationRequest.class, Builder.class);
  }

  public static final int DEV_EUI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object devEui_ = "";
  /**
   * <pre>
   * DevEUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
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
   * DevEUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devEui_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, devEui_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(devEui_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, devEui_);
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
    if (!(obj instanceof GetDeviceActivationRequest)) {
      return super.equals(obj);
    }
    GetDeviceActivationRequest other = (GetDeviceActivationRequest) obj;

    if (!getDevEui()
        .equals(other.getDevEui())) return false;
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
    hash = (37 * hash) + DEV_EUI_FIELD_NUMBER;
    hash = (53 * hash) + getDevEui().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetDeviceActivationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceActivationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceActivationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceActivationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceActivationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceActivationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceActivationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetDeviceActivationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetDeviceActivationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetDeviceActivationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetDeviceActivationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetDeviceActivationRequest parseFrom(
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
  public static Builder newBuilder(GetDeviceActivationRequest prototype) {
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
   * Protobuf type {@code api.GetDeviceActivationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.GetDeviceActivationRequest)
      GetDeviceActivationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeviceProto.internal_static_api_GetDeviceActivationRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeviceProto.internal_static_api_GetDeviceActivationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetDeviceActivationRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.GetDeviceActivationRequest.newBuilder()
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
      devEui_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DeviceProto.internal_static_api_GetDeviceActivationRequest_descriptor;
    }

    @Override
    public GetDeviceActivationRequest getDefaultInstanceForType() {
      return GetDeviceActivationRequest.getDefaultInstance();
    }

    @Override
    public GetDeviceActivationRequest build() {
      GetDeviceActivationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetDeviceActivationRequest buildPartial() {
      GetDeviceActivationRequest result = new GetDeviceActivationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GetDeviceActivationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.devEui_ = devEui_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetDeviceActivationRequest) {
        return mergeFrom((GetDeviceActivationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetDeviceActivationRequest other) {
      if (other == GetDeviceActivationRequest.getDefaultInstance()) return this;
      if (!other.getDevEui().isEmpty()) {
        devEui_ = other.devEui_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              devEui_ = input.readStringRequireUtf8();
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

    private Object devEui_ = "";
    /**
     * <pre>
     * DevEUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 1;</code>
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
     * DevEUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 1;</code>
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
     * DevEUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 1;</code>
     * @param value The devEui to set.
     * @return This builder for chaining.
     */
    public Builder setDevEui(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      devEui_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DevEUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevEui() {
      devEui_ = getDefaultInstance().getDevEui();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DevEUI (EUI64).
     * </pre>
     *
     * <code>string dev_eui = 1;</code>
     * @param value The bytes for devEui to set.
     * @return This builder for chaining.
     */
    public Builder setDevEuiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      devEui_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.GetDeviceActivationRequest)
  }

  // @@protoc_insertion_point(class_scope:api.GetDeviceActivationRequest)
  private static final GetDeviceActivationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetDeviceActivationRequest();
  }

  public static GetDeviceActivationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeviceActivationRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDeviceActivationRequest>() {
    @Override
    public GetDeviceActivationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeviceActivationRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetDeviceActivationRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public GetDeviceActivationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

