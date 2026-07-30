package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kgb0 {

    /* JADX INFO: renamed from: l.kgb0$a */
    public static /* synthetic */ class C0650a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14318a;

        static {
            int[] iArr = new int[MotionParams.PusherMotionEnum.values().length];
            f14318a = iArr;
            try {
                iArr[MotionParams.PusherMotionEnum.MOTION_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_PK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14318a[MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0303b m16615a(MotionParams motionParams) {
        switch (C0650a.f14318a[motionParams.mo5266a().ordinal()]) {
            case 1:
                return motionParams.f3830d != null ? xgd0.m25920u1(motionParams) : yn40.m26818t1(motionParams);
            case 2:
                return j080.m15539x1(motionParams);
            case 3:
                return w04.m24238r1(motionParams);
            case 4:
                return hz3.m14944x1(motionParams);
            case 5:
                return bim0.m10374A1(motionParams);
            case 6:
                return gcm0.m13717A1(motionParams);
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                return f110.m12895z1(motionParams);
            case ExpLoopInputType.GAME_NAME /* 8 */:
                return q210.m20798t1(motionParams);
            case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                return ygd0.m26703r1(motionParams);
            default:
                return yn40.m26818t1(motionParams);
        }
    }
}
