package com.bytedance.realx.video;

import p153l.azk0;

/* JADX INFO: loaded from: classes.dex */
enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    VP8ProfileMain(80),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(128);

    private int value;

    RXVideoCodecProfile(int i) {
        this.value = i;
    }

    public static RXVideoCodecProfile fromValue(int i) {
        if (i == 0) {
            return Unknown;
        }
        if (i == 1) {
            return ProfileConstrainedBaseline;
        }
        if (i == 2) {
            return ProfileBaseline;
        }
        if (i == 3) {
            return ProfileMain;
        }
        if (i == 4) {
            return ProfileConstrainedHigh;
        }
        if (i == 5) {
            return ProfileHigh;
        }
        if (i == 80) {
            return VP8ProfileMain;
        }
        if (i == 100) {
            return ByteVC1ProfileMain10HDR10;
        }
        if (i == 128) {
            return ByteVC1ProfileMax;
        }
        switch (i) {
            case 10:
                return ByteVC1ProfileUnknown;
            case 11:
                return ByteVC1ProfileMain;
            case 12:
                return ByteVC1ProfileMain10;
            default:
                return Unknown;
        }
    }

    public int toInt() {
        return this.value;
    }

    public int toSystemProfile() {
        int i = this.value;
        if (i == 0 || i == 1 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4 || i == 5) {
            return 8;
        }
        if (i == 80) {
            return 1;
        }
        if (i == 100) {
            return 4096;
        }
        if (i == 128) {
            return 4;
        }
        switch (i) {
            case 10:
            case 11:
                return 1;
            case 12:
                return 2;
            default:
                azk0.m101074a("profile not match system!");
                return 0;
        }
    }
}
