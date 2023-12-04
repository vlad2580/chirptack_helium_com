// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package io.chirpstack.api;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Latitude.
   * </pre>
   *
   * <code>double latitude = 1;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <pre>
   * Longitude.
   * </pre>
   *
   * <code>double longitude = 2;</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <pre>
   * Altitude.
   * </pre>
   *
   * <code>double altitude = 3;</code>
   * @return The altitude.
   */
  double getAltitude();

  /**
   * <pre>
   * Location source.
   * </pre>
   *
   * <code>.common.LocationSource source = 4;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * Location source.
   * </pre>
   *
   * <code>.common.LocationSource source = 4;</code>
   * @return The source.
   */
  LocationSource getSource();

  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>float accuracy = 5;</code>
   * @return The accuracy.
   */
  float getAccuracy();
}
