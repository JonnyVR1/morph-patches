package com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

/* JADX INFO: loaded from: classes4.dex */
public class MotionParams {

    /* JADX INFO: renamed from: a */
    public String f47785a;

    /* JADX INFO: renamed from: b */
    public String f47786b;

    /* JADX INFO: renamed from: c */
    public String f47787c;

    /* JADX INFO: renamed from: d */
    public String f47788d;

    /* JADX INFO: renamed from: e */
    public boolean f47789e;

    /* JADX INFO: renamed from: f */
    public String f47790f;

    /* JADX INFO: renamed from: g */
    public String f47791g;

    /* JADX INFO: renamed from: h */
    public String f47792h;

    /* JADX INFO: renamed from: i */
    public String f47793i;

    public enum MomoPushType {
        RTMP,
        RTC
    }

    public enum PusherMotionEnum {
        MOTION_NULL,
        MOTION_NORMAL,
        MOTION_PK,
        MOTION_CALL_AUDIENCE,
        MOTION_CALL_ANCHOR,
        MOTION_VOICE_ANCHOR,
        MOTION_VOICE_AUDIENCE,
        MOTION_MULTI_CALL_ANCHOR,
        MOTION_MULTI_CALL_AUDIENCE,
        MOTION_AUDIENCE_RTC
    }

    public MotionParams(String str, String str2, String str3) {
        this.f47785a = str;
        this.f47786b = str2;
        this.f47787c = str3;
    }

    /* JADX INFO: renamed from: a */
    public PusherMotionEnum mo71888a() {
        return PusherMotionEnum.MOTION_NULL;
    }
}
