package com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MotionParams {

    /* JADX INFO: renamed from: a */
    public String f3827a;

    /* JADX INFO: renamed from: b */
    public String f3828b;

    /* JADX INFO: renamed from: c */
    public String f3829c;

    /* JADX INFO: renamed from: d */
    public String f3830d;

    /* JADX INFO: renamed from: e */
    public boolean f3831e;

    /* JADX INFO: renamed from: f */
    public String f3832f;

    /* JADX INFO: renamed from: g */
    public String f3833g;

    /* JADX INFO: renamed from: h */
    public String f3834h;

    /* JADX INFO: renamed from: i */
    public String f3835i;

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
        this.f3827a = str;
        this.f3828b = str2;
        this.f3829c = str3;
    }

    /* JADX INFO: renamed from: a */
    public PusherMotionEnum mo5266a() {
        return PusherMotionEnum.MOTION_NULL;
    }
}
