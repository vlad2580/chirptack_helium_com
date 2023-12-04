// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

/**
 * Protobuf type {@code helium.iot_config.admin_load_region_req_v1}
 */
public final class admin_load_region_req_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.admin_load_region_req_v1)
    admin_load_region_req_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use admin_load_region_req_v1.newBuilder() to construct.
  private admin_load_region_req_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private admin_load_region_req_v1() {
    region_ = 0;
    hexIndexes_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
    signer_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new admin_load_region_req_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return IotConfig.internal_static_helium_iot_config_admin_load_region_req_v1_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return IotConfig.internal_static_helium_iot_config_admin_load_region_req_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            admin_load_region_req_v1.class, Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  private int region_ = 0;
  /**
   * <code>.helium.region region = 1;</code>
   * @return The enum numeric value on the wire for region.
   */
  @Override public int getRegionValue() {
    return region_;
  }
  /**
   * <code>.helium.region region = 1;</code>
   * @return The region.
   */
  @Override public region getRegion() {
    region result = region.forNumber(region_);
    return result == null ? region.UNRECOGNIZED : result;
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private blockchain_region_params_v1 params_;
  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   * @return Whether the params field is set.
   */
  @Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   * @return The params.
   */
  @Override
  public blockchain_region_params_v1 getParams() {
    return params_ == null ? blockchain_region_params_v1.getDefaultInstance() : params_;
  }
  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   */
  @Override
  public blockchain_region_params_v1OrBuilder getParamsOrBuilder() {
    return params_ == null ? blockchain_region_params_v1.getDefaultInstance() : params_;
  }

  public static final int HEX_INDEXES_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString hexIndexes_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Gzip-compressed file content from converting region geojson to a list of h3
   * indexes
   * </pre>
   *
   * <code>bytes hex_indexes = 3;</code>
   * @return The hexIndexes.
   */
  @Override
  public com.google.protobuf.ByteString getHexIndexes() {
    return hexIndexes_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  @Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int SIGNER_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 5;</code>
   * @return The signer.
   */
  @Override
  public com.google.protobuf.ByteString getSigner() {
    return signer_;
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
    if (region_ != region.US915.getNumber()) {
      output.writeEnum(1, region_);
    }
    if (params_ != null) {
      output.writeMessage(2, getParams());
    }
    if (!hexIndexes_.isEmpty()) {
      output.writeBytes(3, hexIndexes_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
    }
    if (!signer_.isEmpty()) {
      output.writeBytes(5, signer_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (region_ != region.US915.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, region_);
    }
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParams());
    }
    if (!hexIndexes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, hexIndexes_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
    }
    if (!signer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, signer_);
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
    if (!(obj instanceof admin_load_region_req_v1)) {
      return super.equals(obj);
    }
    admin_load_region_req_v1 other = (admin_load_region_req_v1) obj;

    if (region_ != other.region_) return false;
    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (!getHexIndexes()
        .equals(other.getHexIndexes())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + region_;
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (37 * hash) + HEX_INDEXES_FIELD_NUMBER;
    hash = (53 * hash) + getHexIndexes().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static admin_load_region_req_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static admin_load_region_req_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static admin_load_region_req_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static admin_load_region_req_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static admin_load_region_req_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static admin_load_region_req_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static admin_load_region_req_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static admin_load_region_req_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static admin_load_region_req_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static admin_load_region_req_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static admin_load_region_req_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static admin_load_region_req_v1 parseFrom(
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
  public static Builder newBuilder(admin_load_region_req_v1 prototype) {
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
   * Protobuf type {@code helium.iot_config.admin_load_region_req_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.admin_load_region_req_v1)
      admin_load_region_req_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return IotConfig.internal_static_helium_iot_config_admin_load_region_req_v1_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IotConfig.internal_static_helium_iot_config_admin_load_region_req_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              admin_load_region_req_v1.class, Builder.class);
    }

    // Construct using com.helium.grpc.admin_load_region_req_v1.newBuilder()
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
      region_ = 0;
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      hexIndexes_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      signer_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return IotConfig.internal_static_helium_iot_config_admin_load_region_req_v1_descriptor;
    }

    @Override
    public admin_load_region_req_v1 getDefaultInstanceForType() {
      return admin_load_region_req_v1.getDefaultInstance();
    }

    @Override
    public admin_load_region_req_v1 build() {
      admin_load_region_req_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public admin_load_region_req_v1 buildPartial() {
      admin_load_region_req_v1 result = new admin_load_region_req_v1(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(admin_load_region_req_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hexIndexes_ = hexIndexes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.signer_ = signer_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof admin_load_region_req_v1) {
        return mergeFrom((admin_load_region_req_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(admin_load_region_req_v1 other) {
      if (other == admin_load_region_req_v1.getDefaultInstance()) return this;
      if (other.region_ != 0) {
        setRegionValue(other.getRegionValue());
      }
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (other.getHexIndexes() != com.google.protobuf.ByteString.EMPTY) {
        setHexIndexes(other.getHexIndexes());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.getSigner() != com.google.protobuf.ByteString.EMPTY) {
        setSigner(other.getSigner());
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
            case 8: {
              region_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hexIndexes_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              signer_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int region_ = 0;
    /**
     * <code>.helium.region region = 1;</code>
     * @return The enum numeric value on the wire for region.
     */
    @Override public int getRegionValue() {
      return region_;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @param value The enum numeric value on the wire for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionValue(int value) {
      region_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @return The region.
     */
    @Override
    public region getRegion() {
      region result = region.forNumber(region_);
      return result == null ? region.UNRECOGNIZED : result;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(region value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      region_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      region_ = 0;
      onChanged();
      return this;
    }

    private blockchain_region_params_v1 params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        blockchain_region_params_v1, blockchain_region_params_v1.Builder, blockchain_region_params_v1OrBuilder> paramsBuilder_;
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     * @return The params.
     */
    public blockchain_region_params_v1 getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? blockchain_region_params_v1.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public Builder setParams(blockchain_region_params_v1 value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public Builder setParams(
        blockchain_region_params_v1.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public Builder mergeParams(blockchain_region_params_v1 value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          params_ != null &&
          params_ != blockchain_region_params_v1.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public blockchain_region_params_v1.Builder getParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    public blockchain_region_params_v1OrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            blockchain_region_params_v1.getDefaultInstance() : params_;
      }
    }
    /**
     * <code>.helium.blockchain_region_params_v1 params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        blockchain_region_params_v1, blockchain_region_params_v1.Builder, blockchain_region_params_v1OrBuilder>
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            blockchain_region_params_v1, blockchain_region_params_v1.Builder, blockchain_region_params_v1OrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private com.google.protobuf.ByteString hexIndexes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Gzip-compressed file content from converting region geojson to a list of h3
     * indexes
     * </pre>
     *
     * <code>bytes hex_indexes = 3;</code>
     * @return The hexIndexes.
     */
    @Override
    public com.google.protobuf.ByteString getHexIndexes() {
      return hexIndexes_;
    }
    /**
     * <pre>
     * Gzip-compressed file content from converting region geojson to a list of h3
     * indexes
     * </pre>
     *
     * <code>bytes hex_indexes = 3;</code>
     * @param value The hexIndexes to set.
     * @return This builder for chaining.
     */
    public Builder setHexIndexes(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hexIndexes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Gzip-compressed file content from converting region geojson to a list of h3
     * indexes
     * </pre>
     *
     * <code>bytes hex_indexes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHexIndexes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hexIndexes_ = getDefaultInstance().getHexIndexes();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 4;</code>
     * @return The signature.
     */
    @Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 4;</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000008);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * pubkey binary of the signing keypair
     * </pre>
     *
     * <code>bytes signer = 5;</code>
     * @return The signer.
     */
    @Override
    public com.google.protobuf.ByteString getSigner() {
      return signer_;
    }
    /**
     * <pre>
     * pubkey binary of the signing keypair
     * </pre>
     *
     * <code>bytes signer = 5;</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pubkey binary of the signing keypair
     * </pre>
     *
     * <code>bytes signer = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      bitField0_ = (bitField0_ & ~0x00000010);
      signer_ = getDefaultInstance().getSigner();
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


    // @@protoc_insertion_point(builder_scope:helium.iot_config.admin_load_region_req_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.admin_load_region_req_v1)
  private static final admin_load_region_req_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new admin_load_region_req_v1();
  }

  public static admin_load_region_req_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<admin_load_region_req_v1>
      PARSER = new com.google.protobuf.AbstractParser<admin_load_region_req_v1>() {
    @Override
    public admin_load_region_req_v1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<admin_load_region_req_v1> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<admin_load_region_req_v1> getParserForType() {
    return PARSER;
  }

  @Override
  public admin_load_region_req_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
