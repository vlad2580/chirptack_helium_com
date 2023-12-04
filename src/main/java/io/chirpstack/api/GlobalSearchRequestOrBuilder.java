// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

public interface GlobalSearchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.GlobalSearchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>string search = 1;</code>
   * @return The search.
   */
  String getSearch();
  /**
   * <pre>
   * Search query.
   * </pre>
   *
   * <code>string search = 1;</code>
   * @return The bytes for search.
   */
  com.google.protobuf.ByteString
      getSearchBytes();

  /**
   * <pre>
   * Max number of results to return.
   * </pre>
   *
   * <code>int64 limit = 2;</code>
   * @return The limit.
   */
  long getLimit();

  /**
   * <pre>
   * Offset offset of the result-set (for pagination).
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  long getOffset();
}
