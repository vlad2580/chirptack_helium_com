// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code common.Location}
 */
public final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
    source_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Location();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CommonProto.internal_static_common_Location_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CommonProto.internal_static_common_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Location.class, Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_ = 0D;
  /**
   * <pre>
   * Latitude.
   * </pre>
   *
   * <code>double latitude = 1;</code>
   * @return The latitude.
   */
  @Override
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_ = 0D;
  /**
   * <pre>
   * Longitude.
   * </pre>
   *
   * <code>double longitude = 2;</code>
   * @return The longitude.
   */
  @Override
  public double getLongitude() {
    return longitude_;
  }

  public static final int ALTITUDE_FIELD_NUMBER = 3;
  private double altitude_ = 0D;
  /**
   * <pre>
   * Altitude.
   * </pre>
   *
   * <code>double altitude = 3;</code>
   * @return The altitude.
   */
  @Override
  public double getAltitude() {
    return altitude_;
  }

  public static final int SOURCE_FIELD_NUMBER = 4;
  private int source_ = 0;
  /**
   * <pre>
   * Location source.
   * </pre>
   *
   * <code>.common.LocationSource source = 4;</code>
   * @return The enum numeric value on the wire for source.
   */
  @Override public int getSourceValue() {
    return source_;
  }
  /**
   * <pre>
   * Location source.
   * </pre>
   *
   * <code>.common.LocationSource source = 4;</code>
   * @return The source.
   */
  @Override public LocationSource getSource() {
    LocationSource result = LocationSource.forNumber(source_);
    return result == null ? LocationSource.UNRECOGNIZED : result;
  }

  public static final int ACCURACY_FIELD_NUMBER = 5;
  private float accuracy_ = 0F;
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>float accuracy = 5;</code>
   * @return The accuracy.
   */
  @Override
  public float getAccuracy() {
    return accuracy_;
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
    if (Double.doubleToRawLongBits(latitude_) != 0) {
      output.writeDouble(1, latitude_);
    }
    if (Double.doubleToRawLongBits(longitude_) != 0) {
      output.writeDouble(2, longitude_);
    }
    if (Double.doubleToRawLongBits(altitude_) != 0) {
      output.writeDouble(3, altitude_);
    }
    if (source_ != LocationSource.UNKNOWN.getNumber()) {
      output.writeEnum(4, source_);
    }
    if (Float.floatToRawIntBits(accuracy_) != 0) {
      output.writeFloat(5, accuracy_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (Double.doubleToRawLongBits(latitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (Double.doubleToRawLongBits(longitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    if (Double.doubleToRawLongBits(altitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, altitude_);
    }
    if (source_ != LocationSource.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, source_);
    }
    if (Float.floatToRawIntBits(accuracy_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, accuracy_);
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
    if (!(obj instanceof Location)) {
      return super.equals(obj);
    }
    Location other = (Location) obj;

    if (Double.doubleToLongBits(getLatitude())
        != Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (Double.doubleToLongBits(getLongitude())
        != Double.doubleToLongBits(
            other.getLongitude())) return false;
    if (Double.doubleToLongBits(getAltitude())
        != Double.doubleToLongBits(
            other.getAltitude())) return false;
    if (source_ != other.source_) return false;
    if (Float.floatToIntBits(getAccuracy())
        != Float.floatToIntBits(
            other.getAccuracy())) return false;
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
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getAltitude()));
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + source_;
    hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
    hash = (53 * hash) + Float.floatToIntBits(
        getAccuracy());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Location parseFrom(
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
  public static Builder newBuilder(Location prototype) {
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
   * Protobuf type {@code common.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Location)
      LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CommonProto.internal_static_common_Location_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CommonProto.internal_static_common_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Location.class, Builder.class);
    }

    // Construct using io.chirpstack.api.Location.newBuilder()
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
      latitude_ = 0D;
      longitude_ = 0D;
      altitude_ = 0D;
      source_ = 0;
      accuracy_ = 0F;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CommonProto.internal_static_common_Location_descriptor;
    }

    @Override
    public Location getDefaultInstanceForType() {
      return Location.getDefaultInstance();
    }

    @Override
    public Location build() {
      Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Location buildPartial() {
      Location result = new Location(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Location result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.latitude_ = latitude_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.longitude_ = longitude_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.altitude_ = altitude_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.source_ = source_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.accuracy_ = accuracy_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Location) {
        return mergeFrom((Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Location other) {
      if (other == Location.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getAltitude() != 0D) {
        setAltitude(other.getAltitude());
      }
      if (other.source_ != 0) {
        setSourceValue(other.getSourceValue());
      }
      if (other.getAccuracy() != 0F) {
        setAccuracy(other.getAccuracy());
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
            case 9: {
              latitude_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              longitude_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              altitude_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 32: {
              source_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 45: {
              accuracy_ = input.readFloat();
              bitField0_ |= 0x00000010;
              break;
            } // case 45
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

    private double latitude_ ;
    /**
     * <pre>
     * Latitude.
     * </pre>
     *
     * <code>double latitude = 1;</code>
     * @return The latitude.
     */
    @Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     * Latitude.
     * </pre>
     *
     * <code>double latitude = 1;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {

      latitude_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latitude.
     * </pre>
     *
     * <code>double latitude = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      bitField0_ = (bitField0_ & ~0x00000001);
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <pre>
     * Longitude.
     * </pre>
     *
     * <code>double longitude = 2;</code>
     * @return The longitude.
     */
    @Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <pre>
     * Longitude.
     * </pre>
     *
     * <code>double longitude = 2;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {

      longitude_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Longitude.
     * </pre>
     *
     * <code>double longitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      bitField0_ = (bitField0_ & ~0x00000002);
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double altitude_ ;
    /**
     * <pre>
     * Altitude.
     * </pre>
     *
     * <code>double altitude = 3;</code>
     * @return The altitude.
     */
    @Override
    public double getAltitude() {
      return altitude_;
    }
    /**
     * <pre>
     * Altitude.
     * </pre>
     *
     * <code>double altitude = 3;</code>
     * @param value The altitude to set.
     * @return This builder for chaining.
     */
    public Builder setAltitude(double value) {

      altitude_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Altitude.
     * </pre>
     *
     * <code>double altitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAltitude() {
      bitField0_ = (bitField0_ & ~0x00000004);
      altitude_ = 0D;
      onChanged();
      return this;
    }

    private int source_ = 0;
    /**
     * <pre>
     * Location source.
     * </pre>
     *
     * <code>.common.LocationSource source = 4;</code>
     * @return The enum numeric value on the wire for source.
     */
    @Override public int getSourceValue() {
      return source_;
    }
    /**
     * <pre>
     * Location source.
     * </pre>
     *
     * <code>.common.LocationSource source = 4;</code>
     * @param value The enum numeric value on the wire for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceValue(int value) {
      source_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location source.
     * </pre>
     *
     * <code>.common.LocationSource source = 4;</code>
     * @return The source.
     */
    @Override
    public LocationSource getSource() {
      LocationSource result = LocationSource.forNumber(source_);
      return result == null ? LocationSource.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Location source.
     * </pre>
     *
     * <code>.common.LocationSource source = 4;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(LocationSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      source_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location source.
     * </pre>
     *
     * <code>.common.LocationSource source = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      bitField0_ = (bitField0_ & ~0x00000008);
      source_ = 0;
      onChanged();
      return this;
    }

    private float accuracy_ ;
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>float accuracy = 5;</code>
     * @return The accuracy.
     */
    @Override
    public float getAccuracy() {
      return accuracy_;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>float accuracy = 5;</code>
     * @param value The accuracy to set.
     * @return This builder for chaining.
     */
    public Builder setAccuracy(float value) {

      accuracy_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>float accuracy = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccuracy() {
      bitField0_ = (bitField0_ & ~0x00000010);
      accuracy_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:common.Location)
  }

  // @@protoc_insertion_point(class_scope:common.Location)
  private static final Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Location();
  }

  public static Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    @Override
    public Location parsePartialFrom(
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

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @Override
  public Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

