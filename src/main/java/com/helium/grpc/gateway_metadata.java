// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

/**
 * Protobuf type {@code helium.iot_config.gateway_metadata}
 */
public final class gateway_metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.gateway_metadata)
    gateway_metadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use gateway_metadata.newBuilder() to construct.
  private gateway_metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private gateway_metadata() {
    location_ = "";
    region_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new gateway_metadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return IotConfig.internal_static_helium_iot_config_gateway_metadata_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return IotConfig.internal_static_helium_iot_config_gateway_metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gateway_metadata.class, Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object location_ = "";
  /**
   * <pre>
   *&#47; The asserted h3 location of the gateway
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The location.
   */
  @Override
  public String getLocation() {
    Object ref = location_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47; The asserted h3 location of the gateway
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The bytes for location.
   */
  @Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    Object ref = location_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 2;
  private int region_ = 0;
  /**
   * <pre>
   *&#47; LoRa region derived from the asserted location
   * </pre>
   *
   * <code>.helium.region region = 2;</code>
   * @return The enum numeric value on the wire for region.
   */
  @Override public int getRegionValue() {
    return region_;
  }
  /**
   * <pre>
   *&#47; LoRa region derived from the asserted location
   * </pre>
   *
   * <code>.helium.region region = 2;</code>
   * @return The region.
   */
  @Override public region getRegion() {
    region result = region.forNumber(region_);
    return result == null ? region.UNRECOGNIZED : result;
  }

  public static final int GAIN_FIELD_NUMBER = 3;
  private int gain_ = 0;
  /**
   * <pre>
   *&#47; the transmit gain value of the gateway in dbi x 10
   * / For example 1 dbi = 10, 15 dbi = 150
   * </pre>
   *
   * <code>int32 gain = 3;</code>
   * @return The gain.
   */
  @Override
  public int getGain() {
    return gain_;
  }

  public static final int ELEVATION_FIELD_NUMBER = 4;
  private int elevation_ = 0;
  /**
   * <pre>
   *&#47; The asserted elevation of the gateway
   * </pre>
   *
   * <code>int32 elevation = 4;</code>
   * @return The elevation.
   */
  @Override
  public int getElevation() {
    return elevation_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (region_ != region.US915.getNumber()) {
      output.writeEnum(2, region_);
    }
    if (gain_ != 0) {
      output.writeInt32(3, gain_);
    }
    if (elevation_ != 0) {
      output.writeInt32(4, elevation_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (region_ != region.US915.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, region_);
    }
    if (gain_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, gain_);
    }
    if (elevation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, elevation_);
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
    if (!(obj instanceof gateway_metadata)) {
      return super.equals(obj);
    }
    gateway_metadata other = (gateway_metadata) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (region_ != other.region_) return false;
    if (getGain()
        != other.getGain()) return false;
    if (getElevation()
        != other.getElevation()) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + region_;
    hash = (37 * hash) + GAIN_FIELD_NUMBER;
    hash = (53 * hash) + getGain();
    hash = (37 * hash) + ELEVATION_FIELD_NUMBER;
    hash = (53 * hash) + getElevation();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gateway_metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gateway_metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gateway_metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gateway_metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gateway_metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gateway_metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gateway_metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gateway_metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gateway_metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gateway_metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gateway_metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gateway_metadata parseFrom(
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
  public static Builder newBuilder(gateway_metadata prototype) {
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
   * Protobuf type {@code helium.iot_config.gateway_metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.gateway_metadata)
      gateway_metadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return IotConfig.internal_static_helium_iot_config_gateway_metadata_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IotConfig.internal_static_helium_iot_config_gateway_metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gateway_metadata.class, Builder.class);
    }

    // Construct using com.helium.grpc.gateway_metadata.newBuilder()
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
      location_ = "";
      region_ = 0;
      gain_ = 0;
      elevation_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return IotConfig.internal_static_helium_iot_config_gateway_metadata_descriptor;
    }

    @Override
    public gateway_metadata getDefaultInstanceForType() {
      return gateway_metadata.getDefaultInstance();
    }

    @Override
    public gateway_metadata build() {
      gateway_metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public gateway_metadata buildPartial() {
      gateway_metadata result = new gateway_metadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(gateway_metadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gain_ = gain_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.elevation_ = elevation_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gateway_metadata) {
        return mergeFrom((gateway_metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gateway_metadata other) {
      if (other == gateway_metadata.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.region_ != 0) {
        setRegionValue(other.getRegionValue());
      }
      if (other.getGain() != 0) {
        setGain(other.getGain());
      }
      if (other.getElevation() != 0) {
        setElevation(other.getElevation());
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
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              region_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              gain_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              elevation_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private Object location_ = "";
    /**
     * <pre>
     *&#47; The asserted h3 location of the gateway
     * </pre>
     *
     * <code>string location = 1;</code>
     * @return The location.
     */
    public String getLocation() {
      Object ref = location_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *&#47; The asserted h3 location of the gateway
     * </pre>
     *
     * <code>string location = 1;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; The asserted h3 location of the gateway
     * </pre>
     *
     * <code>string location = 1;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The asserted h3 location of the gateway
     * </pre>
     *
     * <code>string location = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The asserted h3 location of the gateway
     * </pre>
     *
     * <code>string location = 1;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int region_ = 0;
    /**
     * <pre>
     *&#47; LoRa region derived from the asserted location
     * </pre>
     *
     * <code>.helium.region region = 2;</code>
     * @return The enum numeric value on the wire for region.
     */
    @Override public int getRegionValue() {
      return region_;
    }
    /**
     * <pre>
     *&#47; LoRa region derived from the asserted location
     * </pre>
     *
     * <code>.helium.region region = 2;</code>
     * @param value The enum numeric value on the wire for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionValue(int value) {
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; LoRa region derived from the asserted location
     * </pre>
     *
     * <code>.helium.region region = 2;</code>
     * @return The region.
     */
    @Override
    public region getRegion() {
      region result = region.forNumber(region_);
      return result == null ? region.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *&#47; LoRa region derived from the asserted location
     * </pre>
     *
     * <code>.helium.region region = 2;</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(region value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      region_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; LoRa region derived from the asserted location
     * </pre>
     *
     * <code>.helium.region region = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      region_ = 0;
      onChanged();
      return this;
    }

    private int gain_ ;
    /**
     * <pre>
     *&#47; the transmit gain value of the gateway in dbi x 10
     * / For example 1 dbi = 10, 15 dbi = 150
     * </pre>
     *
     * <code>int32 gain = 3;</code>
     * @return The gain.
     */
    @Override
    public int getGain() {
      return gain_;
    }
    /**
     * <pre>
     *&#47; the transmit gain value of the gateway in dbi x 10
     * / For example 1 dbi = 10, 15 dbi = 150
     * </pre>
     *
     * <code>int32 gain = 3;</code>
     * @param value The gain to set.
     * @return This builder for chaining.
     */
    public Builder setGain(int value) {

      gain_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; the transmit gain value of the gateway in dbi x 10
     * / For example 1 dbi = 10, 15 dbi = 150
     * </pre>
     *
     * <code>int32 gain = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGain() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gain_ = 0;
      onChanged();
      return this;
    }

    private int elevation_ ;
    /**
     * <pre>
     *&#47; The asserted elevation of the gateway
     * </pre>
     *
     * <code>int32 elevation = 4;</code>
     * @return The elevation.
     */
    @Override
    public int getElevation() {
      return elevation_;
    }
    /**
     * <pre>
     *&#47; The asserted elevation of the gateway
     * </pre>
     *
     * <code>int32 elevation = 4;</code>
     * @param value The elevation to set.
     * @return This builder for chaining.
     */
    public Builder setElevation(int value) {

      elevation_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The asserted elevation of the gateway
     * </pre>
     *
     * <code>int32 elevation = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearElevation() {
      bitField0_ = (bitField0_ & ~0x00000008);
      elevation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:helium.iot_config.gateway_metadata)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.gateway_metadata)
  private static final gateway_metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gateway_metadata();
  }

  public static gateway_metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<gateway_metadata>
      PARSER = new com.google.protobuf.AbstractParser<gateway_metadata>() {
    @Override
    public gateway_metadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<gateway_metadata> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<gateway_metadata> getParserForType() {
    return PARSER;
  }

  @Override
  public gateway_metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

