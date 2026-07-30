package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class oob0 {

    /* JADX INFO: renamed from: l.oob0$a */
    public static /* synthetic */ class C19187a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148344a;

        static {
            int[] iArr = new int[MotionParams.PusherMotionEnum.values().length];
            f148344a = iArr;
            try {
                iArr[MotionParams.PusherMotionEnum.MOTION_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_PK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f148344a[MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C12877b m168570a(MotionParams motionParams) {
        switch (C19187a.f148344a[motionParams.mo73071a().ordinal()]) {
            case 1:
                return motionParams.f48636d != null ? apd0.m99307u1(motionParams) : mw40.m160457t1(motionParams);
            case 2:
                return p880.m171193x1(motionParams);
            case 3:
                return v14.m198969r1(motionParams);
            case 4:
                return g04.m128390x1(motionParams);
            case 5:
                return frm0.m126947A1(motionParams);
            case 6:
                return klm0.m150391A1(motionParams);
            case 7:
                return p910.m171305z1(motionParams);
            case 8:
                return ab10.m96678t1(motionParams);
            case 9:
                return bpd0.m105803r1(motionParams);
            default:
                return mw40.m160457t1(motionParams);
        }
    }
}
