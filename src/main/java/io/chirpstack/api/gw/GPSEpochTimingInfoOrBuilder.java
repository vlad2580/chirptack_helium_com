// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

public interface GPSEpochTimingInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gw.GPSEpochTimingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Duration since GPS Epoch.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_since_gps_epoch = 1;</code>
   * @return Whether the timeSinceGpsEpoch field is set.
   */
  boolean hasTimeSinceGpsEpoch();
  /**
   * <pre>
   * Duration since GPS Epoch.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_since_gps_epoch = 1;</code>
   * @return The timeSinceGpsEpoch.
   */
  com.google.protobuf.Duration getTimeSinceGpsEpoch();
  /**
   * <pre>
   * Duration since GPS Epoch.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_since_gps_epoch = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeSinceGpsEpochOrBuilder();
}