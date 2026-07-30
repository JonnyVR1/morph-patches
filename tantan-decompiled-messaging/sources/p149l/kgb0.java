package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class kgb0 {

    /* JADX INFO: renamed from: l.kgb0$a */
    public static /* synthetic */ class C18009a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f123021a;

        static {
            int[] iArr = new int[MotionParams.PusherMotionEnum.values().length];
            f123021a = iArr;
            try {
                iArr[MotionParams.PusherMotionEnum.MOTION_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_PK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f123021a[MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C12714b m145887a(MotionParams motionParams) {
        switch (C18009a.f123021a[motionParams.mo71888a().ordinal()]) {
            case 1:
                return motionParams.f47788d != null ? xgd0.m208633u1(motionParams) : yn40.m215393t1(motionParams);
            case 2:
                return j080.m139145x1(motionParams);
            case 3:
                return w04.m200822r1(motionParams);
            case 4:
                return hz3.m133639x1(motionParams);
            case 5:
                return bim0.m102086A1(motionParams);
            case 6:
                return gcm0.m125518A1(motionParams);
            case 7:
                return f110.m119080z1(motionParams);
            case 8:
                return q210.m172423t1(motionParams);
            case 9:
                return ygd0.m214637r1(motionParams);
            default:
                return yn40.m215393t1(motionParams);
        }
    }
}
