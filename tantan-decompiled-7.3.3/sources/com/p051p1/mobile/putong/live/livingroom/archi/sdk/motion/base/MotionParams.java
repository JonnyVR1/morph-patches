package com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base;

/* JADX INFO: loaded from: classes4.dex */
public class MotionParams {

    /* JADX INFO: renamed from: a */
    public String f48633a;

    /* JADX INFO: renamed from: b */
    public String f48634b;

    /* JADX INFO: renamed from: c */
    public String f48635c;

    /* JADX INFO: renamed from: d */
    public String f48636d;

    /* JADX INFO: renamed from: e */
    public boolean f48637e;

    /* JADX INFO: renamed from: f */
    public String f48638f;

    /* JADX INFO: renamed from: g */
    public String f48639g;

    /* JADX INFO: renamed from: h */
    public String f48640h;

    /* JADX INFO: renamed from: i */
    public String f48641i;

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
        this.f48633a = str;
        this.f48634b = str2;
        this.f48635c = str3;
    }

    /* JADX INFO: renamed from: a */
    public PusherMotionEnum mo73071a() {
        return PusherMotionEnum.MOTION_NULL;
    }
}
