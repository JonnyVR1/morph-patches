package com.tencent.liteav.trtc.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCAudioServerConfig {
    private static final String AUDIO_SERVER_CONFIG = "trtc_audio_server_config";
    public static final int DEFAULT_16K_PACKAGE_STRATEGY = 0;
    public static final int DEFAULT_DEVICE_AUTO_RESTART_MIN_INTERVAL = 5000;
    public static final boolean DEFAULT_ENABLE_AUTO_RESTART_DEVICE = false;
    public static final boolean DEFAULT_ENABLE_OPENSL = false;
    private static final boolean DEFAULT_IS_LOW_LATENCY_SAMPLERATE_SUPPORTED = false;
    private static final long DEFAULT_LOW_LATENCY_SAMPLERATE_BLOCK_TIME = 604800000;
    public static final int DEFAULT_MAX_SELECTED_PLAY_STREAMS = 0;
    private static final String KEY_16K_PACKAGE_STRATEGY = "16k_package_strategy";
    private static final String KEY_DEVICE_AUTO_RESTART_MIN_INTERVAL = "device_auto_restart_interval";
    private static final String KEY_ENABLE_AUTO_RESTART_DEVICE = "enable_auto_restart_device";
    private static final String KEY_ENABLE_OPENSL = "enable_opensl";
    private static final String KEY_IS_LOW_LATENCY_SAMPLERATE_SUPPORTED = "is_low_latency_samplerate_supported";
    private static final String KEY_LOW_LATENCY_SAMPLERATE_BLOCK_TIME = "low_latency_samplerate_block_time";
    private static final String KEY_MAX_SELECTED_PLAY_STREAMS = "max_selected_play_streams";
    public boolean enableOpenSL = false;
    public boolean enableAutoRestartDevice = false;
    public int deviceAutoRestartMinInterval = 5000;
    public int audio16KPackageStrategy = 0;
    public int maxSelectedPlayStreams = 0;
    public boolean isLowLatencySampleRateSupported = false;
    public long lowLatencySampleRateBlockTime = DEFAULT_LOW_LATENCY_SAMPLERATE_BLOCK_TIME;

    public static TRTCAudioServerConfig loadFromSharedPreferences(Context context) {
        TRTCAudioServerConfig tRTCAudioServerConfig;
        synchronized (TRTCAudioServerConfig.class) {
            tRTCAudioServerConfig = new TRTCAudioServerConfig();
            SharedPreferences sharedPreferences = context.getSharedPreferences(AUDIO_SERVER_CONFIG, 0);
            tRTCAudioServerConfig.enableOpenSL = sharedPreferences.getBoolean(KEY_ENABLE_OPENSL, false);
            tRTCAudioServerConfig.enableAutoRestartDevice = sharedPreferences.getBoolean(KEY_ENABLE_AUTO_RESTART_DEVICE, false);
            tRTCAudioServerConfig.deviceAutoRestartMinInterval = sharedPreferences.getInt(KEY_DEVICE_AUTO_RESTART_MIN_INTERVAL, 5000);
            tRTCAudioServerConfig.audio16KPackageStrategy = sharedPreferences.getInt(KEY_16K_PACKAGE_STRATEGY, 0);
            tRTCAudioServerConfig.maxSelectedPlayStreams = sharedPreferences.getInt(KEY_MAX_SELECTED_PLAY_STREAMS, 0);
            tRTCAudioServerConfig.isLowLatencySampleRateSupported = sharedPreferences.getBoolean(KEY_IS_LOW_LATENCY_SAMPLERATE_SUPPORTED, false);
            tRTCAudioServerConfig.lowLatencySampleRateBlockTime = sharedPreferences.getLong(KEY_LOW_LATENCY_SAMPLERATE_BLOCK_TIME, DEFAULT_LOW_LATENCY_SAMPLERATE_BLOCK_TIME);
        }
        return tRTCAudioServerConfig;
    }

    public static void saveToSharedPreferences(Context context, TRTCAudioServerConfig tRTCAudioServerConfig) {
        synchronized (TRTCAudioServerConfig.class) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(AUDIO_SERVER_CONFIG, 0).edit();
            editorEdit.putBoolean(KEY_ENABLE_OPENSL, tRTCAudioServerConfig.enableOpenSL);
            editorEdit.putBoolean(KEY_ENABLE_AUTO_RESTART_DEVICE, tRTCAudioServerConfig.enableAutoRestartDevice);
            editorEdit.putInt(KEY_DEVICE_AUTO_RESTART_MIN_INTERVAL, tRTCAudioServerConfig.deviceAutoRestartMinInterval);
            editorEdit.putInt(KEY_16K_PACKAGE_STRATEGY, tRTCAudioServerConfig.audio16KPackageStrategy);
            editorEdit.putInt(KEY_MAX_SELECTED_PLAY_STREAMS, tRTCAudioServerConfig.maxSelectedPlayStreams);
            editorEdit.putBoolean(KEY_IS_LOW_LATENCY_SAMPLERATE_SUPPORTED, tRTCAudioServerConfig.isLowLatencySampleRateSupported);
            editorEdit.putLong(KEY_LOW_LATENCY_SAMPLERATE_BLOCK_TIME, tRTCAudioServerConfig.lowLatencySampleRateBlockTime);
            editorEdit.apply();
        }
    }

    public String toString() {
        return "enableOpenSL: " + this.enableOpenSL + ", enableAutoRestartDevice: " + this.enableAutoRestartDevice + ", deviceAutoRestartMinInterval: " + this.deviceAutoRestartMinInterval + ", audio16KPackageStrategy: " + this.audio16KPackageStrategy + ", isLowLatencySampleRateSupported: " + this.isLowLatencySampleRateSupported + ", lowLatencySampleRateBlockTime: " + this.lowLatencySampleRateBlockTime;
    }
}
