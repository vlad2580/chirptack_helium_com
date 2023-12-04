// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/tenant.proto

package io.chirpstack.restapi;

import io.chirpstack.restapi.GetTenantUserResponseOrBuilder;

/**
 * Protobuf type {@code api.GetTenantUserResponse}
 */
public final class GetTenantUserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.GetTenantUserResponse)
        GetTenantUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTenantUserResponse.newBuilder() to construct.
  private GetTenantUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTenantUserResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTenantUserResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_GetTenantUserResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_GetTenantUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.GetTenantUserResponse.class, io.chirpstack.restapi.GetTenantUserResponse.Builder.class);
  }

  public static final int TENANT_USER_FIELD_NUMBER = 1;
  private io.chirpstack.restapi.TenantUser tenantUser_;
  /**
   * <pre>
   * Tenant user object.
   * </pre>
   *
   * <code>.api.TenantUser tenant_user = 1;</code>
   * @return Whether the tenantUser field is set.
   */
  @Override
  public boolean hasTenantUser() {
    return tenantUser_ != null;
  }
  /**
   * <pre>
   * Tenant user object.
   * </pre>
   *
   * <code>.api.TenantUser tenant_user = 1;</code>
   * @return The tenantUser.
   */
  @Override
  public io.chirpstack.restapi.TenantUser getTenantUser() {
    return tenantUser_ == null ? io.chirpstack.restapi.TenantUser.getDefaultInstance() : tenantUser_;
  }
  /**
   * <pre>
   * Tenant user object.
   * </pre>
   *
   * <code>.api.TenantUser tenant_user = 1;</code>
   */
  @Override
  public io.chirpstack.restapi.TenantUserOrBuilder getTenantUserOrBuilder() {
    return getTenantUser();
  }

  public static final int CREATED_AT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  @Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  @Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
    return getCreatedAt();
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  @Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return The updatedAt.
   */
  @Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return getUpdatedAt();
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
    if (tenantUser_ != null) {
      output.writeMessage(1, getTenantUser());
    }
    if (createdAt_ != null) {
      output.writeMessage(2, getCreatedAt());
    }
    if (updatedAt_ != null) {
      output.writeMessage(3, getUpdatedAt());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tenantUser_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTenantUser());
    }
    if (createdAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreatedAt());
    }
    if (updatedAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdatedAt());
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
    if (!(obj instanceof io.chirpstack.restapi.GetTenantUserResponse)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.GetTenantUserResponse other = (io.chirpstack.restapi.GetTenantUserResponse) obj;

    if (hasTenantUser() != other.hasTenantUser()) return false;
    if (hasTenantUser()) {
      if (!getTenantUser()
          .equals(other.getTenantUser())) return false;
    }
    if (hasCreatedAt() != other.hasCreatedAt()) return false;
    if (hasCreatedAt()) {
      if (!getCreatedAt()
          .equals(other.getCreatedAt())) return false;
    }
    if (hasUpdatedAt() != other.hasUpdatedAt()) return false;
    if (hasUpdatedAt()) {
      if (!getUpdatedAt()
          .equals(other.getUpdatedAt())) return false;
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
    if (hasTenantUser()) {
      hash = (37 * hash) + TENANT_USER_FIELD_NUMBER;
      hash = (53 * hash) + getTenantUser().hashCode();
    }
    if (hasCreatedAt()) {
      hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedAt().hashCode();
    }
    if (hasUpdatedAt()) {
      hash = (37 * hash) + UPDATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedAt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.GetTenantUserResponse parseFrom(
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
  public static Builder newBuilder(io.chirpstack.restapi.GetTenantUserResponse prototype) {
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
   * Protobuf type {@code api.GetTenantUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.GetTenantUserResponse)
      GetTenantUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_GetTenantUserResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_GetTenantUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.GetTenantUserResponse.class, io.chirpstack.restapi.GetTenantUserResponse.Builder.class);
    }

    // Construct using io.chirpstack.restapi.GetTenantUserResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      if (tenantUserBuilder_ == null) {
        tenantUser_ = null;
      } else {
        tenantUser_ = null;
        tenantUserBuilder_ = null;
      }
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_GetTenantUserResponse_descriptor;
    }

    @Override
    public io.chirpstack.restapi.GetTenantUserResponse getDefaultInstanceForType() {
      return io.chirpstack.restapi.GetTenantUserResponse.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.GetTenantUserResponse build() {
      io.chirpstack.restapi.GetTenantUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.GetTenantUserResponse buildPartial() {
      io.chirpstack.restapi.GetTenantUserResponse result = new io.chirpstack.restapi.GetTenantUserResponse(this);
      if (tenantUserBuilder_ == null) {
        result.tenantUser_ = tenantUser_;
      } else {
        result.tenantUser_ = tenantUserBuilder_.build();
      }
      if (createdAtBuilder_ == null) {
        result.createdAt_ = createdAt_;
      } else {
        result.createdAt_ = createdAtBuilder_.build();
      }
      if (updatedAtBuilder_ == null) {
        result.updatedAt_ = updatedAt_;
      } else {
        result.updatedAt_ = updatedAtBuilder_.build();
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
      if (other instanceof io.chirpstack.restapi.GetTenantUserResponse) {
        return mergeFrom((io.chirpstack.restapi.GetTenantUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.GetTenantUserResponse other) {
      if (other == io.chirpstack.restapi.GetTenantUserResponse.getDefaultInstance()) return this;
      if (other.hasTenantUser()) {
        mergeTenantUser(other.getTenantUser());
      }
      if (other.hasCreatedAt()) {
        mergeCreatedAt(other.getCreatedAt());
      }
      if (other.hasUpdatedAt()) {
        mergeUpdatedAt(other.getUpdatedAt());
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
                  getTenantUserFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCreatedAtFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdatedAtFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private io.chirpstack.restapi.TenantUser tenantUser_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.restapi.TenantUser, io.chirpstack.restapi.TenantUser.Builder, io.chirpstack.restapi.TenantUserOrBuilder> tenantUserBuilder_;
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     * @return Whether the tenantUser field is set.
     */
    public boolean hasTenantUser() {
      return tenantUserBuilder_ != null || tenantUser_ != null;
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     * @return The tenantUser.
     */
    public io.chirpstack.restapi.TenantUser getTenantUser() {
      if (tenantUserBuilder_ == null) {
        return tenantUser_ == null ? io.chirpstack.restapi.TenantUser.getDefaultInstance() : tenantUser_;
      } else {
        return tenantUserBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public Builder setTenantUser(io.chirpstack.restapi.TenantUser value) {
      if (tenantUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tenantUser_ = value;
        onChanged();
      } else {
        tenantUserBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public Builder setTenantUser(
        io.chirpstack.restapi.TenantUser.Builder builderForValue) {
      if (tenantUserBuilder_ == null) {
        tenantUser_ = builderForValue.build();
        onChanged();
      } else {
        tenantUserBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public Builder mergeTenantUser(io.chirpstack.restapi.TenantUser value) {
      if (tenantUserBuilder_ == null) {
        if (tenantUser_ != null) {
          tenantUser_ =
            io.chirpstack.restapi.TenantUser.newBuilder(tenantUser_).mergeFrom(value).buildPartial();
        } else {
          tenantUser_ = value;
        }
        onChanged();
      } else {
        tenantUserBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public Builder clearTenantUser() {
      if (tenantUserBuilder_ == null) {
        tenantUser_ = null;
        onChanged();
      } else {
        tenantUser_ = null;
        tenantUserBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public io.chirpstack.restapi.TenantUser.Builder getTenantUserBuilder() {
      
      onChanged();
      return getTenantUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    public io.chirpstack.restapi.TenantUserOrBuilder getTenantUserOrBuilder() {
      if (tenantUserBuilder_ != null) {
        return tenantUserBuilder_.getMessageOrBuilder();
      } else {
        return tenantUser_ == null ?
            io.chirpstack.restapi.TenantUser.getDefaultInstance() : tenantUser_;
      }
    }
    /**
     * <pre>
     * Tenant user object.
     * </pre>
     *
     * <code>.api.TenantUser tenant_user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.restapi.TenantUser, io.chirpstack.restapi.TenantUser.Builder, io.chirpstack.restapi.TenantUserOrBuilder> 
        getTenantUserFieldBuilder() {
      if (tenantUserBuilder_ == null) {
        tenantUserBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.chirpstack.restapi.TenantUser, io.chirpstack.restapi.TenantUser.Builder, io.chirpstack.restapi.TenantUserOrBuilder>(
                getTenantUser(),
                getParentForChildren(),
                isClean());
        tenantUser_ = null;
      }
      return tenantUserBuilder_;
    }

    private com.google.protobuf.Timestamp createdAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return Whether the createdAt field is set.
     */
    public boolean hasCreatedAt() {
      return createdAtBuilder_ != null || createdAt_ != null;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return The createdAt.
     */
    public com.google.protobuf.Timestamp getCreatedAt() {
      if (createdAtBuilder_ == null) {
        return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      } else {
        return createdAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAt_ = value;
        onChanged();
      } else {
        createdAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAtBuilder_ == null) {
        createdAt_ = builderForValue.build();
        onChanged();
      } else {
        createdAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (createdAt_ != null) {
          createdAt_ =
            com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
        } else {
          createdAt_ = value;
        }
        onChanged();
      } else {
        createdAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder clearCreatedAt() {
      if (createdAtBuilder_ == null) {
        createdAt_ = null;
        onChanged();
      } else {
        createdAt_ = null;
        createdAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
      
      onChanged();
      return getCreatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      if (createdAtBuilder_ != null) {
        return createdAtBuilder_.getMessageOrBuilder();
      } else {
        return createdAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      }
    }
    /**
     * <pre>
     * Created at timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAtFieldBuilder() {
      if (createdAtBuilder_ == null) {
        createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAt(),
                getParentForChildren(),
                isClean());
        createdAt_ = null;
      }
      return createdAtBuilder_;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return updatedAtBuilder_ != null || updatedAt_ != null;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (updatedAt_ != null) {
          updatedAt_ =
            com.google.protobuf.Timestamp.newBuilder(updatedAt_).mergeFrom(value).buildPartial();
        } else {
          updatedAt_ = value;
        }
        onChanged();
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public Builder clearUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
        onChanged();
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <pre>
     * Last update timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.GetTenantUserResponse)
  }

  // @@protoc_insertion_point(class_scope:api.GetTenantUserResponse)
  private static final io.chirpstack.restapi.GetTenantUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.GetTenantUserResponse();
  }

  public static io.chirpstack.restapi.GetTenantUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTenantUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTenantUserResponse>() {
    @Override
    public GetTenantUserResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTenantUserResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetTenantUserResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.GetTenantUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

