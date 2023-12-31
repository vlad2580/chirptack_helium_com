// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

/**
 * Protobuf type {@code helium.iot_config.route_list_res_v1}
 */
public final class route_list_res_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.route_list_res_v1)
    route_list_res_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use route_list_res_v1.newBuilder() to construct.
  private route_list_res_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private route_list_res_v1() {
    routes_ = java.util.Collections.emptyList();
    signer_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new route_list_res_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return IotConfig.internal_static_helium_iot_config_route_list_res_v1_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return IotConfig.internal_static_helium_iot_config_route_list_res_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            route_list_res_v1.class, Builder.class);
  }

  public static final int ROUTES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<route_v1> routes_;
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  @Override
  public java.util.List<route_v1> getRoutesList() {
    return routes_;
  }
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  @Override
  public java.util.List<? extends route_v1OrBuilder>
      getRoutesOrBuilderList() {
    return routes_;
  }
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  @Override
  public int getRoutesCount() {
    return routes_.size();
  }
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  @Override
  public route_v1 getRoutes(int index) {
    return routes_.get(index);
  }
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  @Override
  public route_v1OrBuilder getRoutesOrBuilder(
      int index) {
    return routes_.get(index);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * unix epoch timestamp in seconds
   * </pre>
   *
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  @Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int SIGNER_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 3;</code>
   * @return The signer.
   */
  @Override
  public com.google.protobuf.ByteString getSigner() {
    return signer_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Signature over the response by the config service
   * </pre>
   *
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  @Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    for (int i = 0; i < routes_.size(); i++) {
      output.writeMessage(1, routes_.get(i));
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(2, timestamp_);
    }
    if (!signer_.isEmpty()) {
      output.writeBytes(3, signer_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < routes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, routes_.get(i));
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (!signer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, signer_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
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
    if (!(obj instanceof route_list_res_v1)) {
      return super.equals(obj);
    }
    route_list_res_v1 other = (route_list_res_v1) obj;

    if (!getRoutesList()
        .equals(other.getRoutesList())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getSigner()
        .equals(other.getSigner())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    if (getRoutesCount() > 0) {
      hash = (37 * hash) + ROUTES_FIELD_NUMBER;
      hash = (53 * hash) + getRoutesList().hashCode();
    }
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static route_list_res_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static route_list_res_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static route_list_res_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static route_list_res_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static route_list_res_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static route_list_res_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static route_list_res_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static route_list_res_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static route_list_res_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static route_list_res_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static route_list_res_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static route_list_res_v1 parseFrom(
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
  public static Builder newBuilder(route_list_res_v1 prototype) {
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
   * Protobuf type {@code helium.iot_config.route_list_res_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.route_list_res_v1)
      route_list_res_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return IotConfig.internal_static_helium_iot_config_route_list_res_v1_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IotConfig.internal_static_helium_iot_config_route_list_res_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              route_list_res_v1.class, Builder.class);
    }

    // Construct using com.helium.grpc.route_list_res_v1.newBuilder()
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
      if (routesBuilder_ == null) {
        routes_ = java.util.Collections.emptyList();
      } else {
        routes_ = null;
        routesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = 0L;
      signer_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return IotConfig.internal_static_helium_iot_config_route_list_res_v1_descriptor;
    }

    @Override
    public route_list_res_v1 getDefaultInstanceForType() {
      return route_list_res_v1.getDefaultInstance();
    }

    @Override
    public route_list_res_v1 build() {
      route_list_res_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public route_list_res_v1 buildPartial() {
      route_list_res_v1 result = new route_list_res_v1(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(route_list_res_v1 result) {
      if (routesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          routes_ = java.util.Collections.unmodifiableList(routes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.routes_ = routes_;
      } else {
        result.routes_ = routesBuilder_.build();
      }
    }

    private void buildPartial0(route_list_res_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signature_ = signature_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof route_list_res_v1) {
        return mergeFrom((route_list_res_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(route_list_res_v1 other) {
      if (other == route_list_res_v1.getDefaultInstance()) return this;
      if (routesBuilder_ == null) {
        if (!other.routes_.isEmpty()) {
          if (routes_.isEmpty()) {
            routes_ = other.routes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoutesIsMutable();
            routes_.addAll(other.routes_);
          }
          onChanged();
        }
      } else {
        if (!other.routes_.isEmpty()) {
          if (routesBuilder_.isEmpty()) {
            routesBuilder_.dispose();
            routesBuilder_ = null;
            routes_ = other.routes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            routesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoutesFieldBuilder() : null;
          } else {
            routesBuilder_.addAllMessages(other.routes_);
          }
        }
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getSigner() != com.google.protobuf.ByteString.EMPTY) {
        setSigner(other.getSigner());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
              route_v1 m =
                  input.readMessage(
                      route_v1.parser(),
                      extensionRegistry);
              if (routesBuilder_ == null) {
                ensureRoutesIsMutable();
                routes_.add(m);
              } else {
                routesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              signer_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.util.List<route_v1> routes_ =
      java.util.Collections.emptyList();
    private void ensureRoutesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        routes_ = new java.util.ArrayList<route_v1>(routes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        route_v1, route_v1.Builder, route_v1OrBuilder> routesBuilder_;

    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public java.util.List<route_v1> getRoutesList() {
      if (routesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(routes_);
      } else {
        return routesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public int getRoutesCount() {
      if (routesBuilder_ == null) {
        return routes_.size();
      } else {
        return routesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public route_v1 getRoutes(int index) {
      if (routesBuilder_ == null) {
        return routes_.get(index);
      } else {
        return routesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder setRoutes(
        int index, route_v1 value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.set(index, value);
        onChanged();
      } else {
        routesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder setRoutes(
        int index, route_v1.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.set(index, builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder addRoutes(route_v1 value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.add(value);
        onChanged();
      } else {
        routesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder addRoutes(
        int index, route_v1 value) {
      if (routesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutesIsMutable();
        routes_.add(index, value);
        onChanged();
      } else {
        routesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder addRoutes(
        route_v1.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.add(builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder addRoutes(
        int index, route_v1.Builder builderForValue) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.add(index, builderForValue.build());
        onChanged();
      } else {
        routesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder addAllRoutes(
        Iterable<? extends route_v1> values) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, routes_);
        onChanged();
      } else {
        routesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder clearRoutes() {
      if (routesBuilder_ == null) {
        routes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        routesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public Builder removeRoutes(int index) {
      if (routesBuilder_ == null) {
        ensureRoutesIsMutable();
        routes_.remove(index);
        onChanged();
      } else {
        routesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public route_v1.Builder getRoutesBuilder(
        int index) {
      return getRoutesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public route_v1OrBuilder getRoutesOrBuilder(
        int index) {
      if (routesBuilder_ == null) {
        return routes_.get(index);  } else {
        return routesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public java.util.List<? extends route_v1OrBuilder>
         getRoutesOrBuilderList() {
      if (routesBuilder_ != null) {
        return routesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(routes_);
      }
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public route_v1.Builder addRoutesBuilder() {
      return getRoutesFieldBuilder().addBuilder(
          route_v1.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public route_v1.Builder addRoutesBuilder(
        int index) {
      return getRoutesFieldBuilder().addBuilder(
          index, route_v1.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
     */
    public java.util.List<route_v1.Builder>
         getRoutesBuilderList() {
      return getRoutesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        route_v1, route_v1.Builder, route_v1OrBuilder>
        getRoutesFieldBuilder() {
      if (routesBuilder_ == null) {
        routesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            route_v1, route_v1.Builder, route_v1OrBuilder>(
                routes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        routes_ = null;
      }
      return routesBuilder_;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * unix epoch timestamp in seconds
     * </pre>
     *
     * <code>uint64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * unix epoch timestamp in seconds
     * </pre>
     *
     * <code>uint64 timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unix epoch timestamp in seconds
     * </pre>
     *
     * <code>uint64 timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * pubkey binary of the signing keypair
     * </pre>
     *
     * <code>bytes signer = 3;</code>
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
     * <code>bytes signer = 3;</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pubkey binary of the signing keypair
     * </pre>
     *
     * <code>bytes signer = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      bitField0_ = (bitField0_ & ~0x00000004);
      signer_ = getDefaultInstance().getSigner();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Signature over the response by the config service
     * </pre>
     *
     * <code>bytes signature = 4;</code>
     * @return The signature.
     */
    @Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <pre>
     * Signature over the response by the config service
     * </pre>
     *
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
     * <pre>
     * Signature over the response by the config service
     * </pre>
     *
     * <code>bytes signature = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000008);
      signature_ = getDefaultInstance().getSignature();
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


    // @@protoc_insertion_point(builder_scope:helium.iot_config.route_list_res_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.route_list_res_v1)
  private static final route_list_res_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new route_list_res_v1();
  }

  public static route_list_res_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<route_list_res_v1>
      PARSER = new com.google.protobuf.AbstractParser<route_list_res_v1>() {
    @Override
    public route_list_res_v1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<route_list_res_v1> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<route_list_res_v1> getParserForType() {
    return PARSER;
  }

  @Override
  public route_list_res_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

