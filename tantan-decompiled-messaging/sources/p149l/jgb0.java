package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;

/* JADX INFO: loaded from: classes13.dex */
public class jgb0 {

    /* JADX INFO: renamed from: l.jgb0$a */
    public static /* synthetic */ class C17764a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117767a;

        static {
            int[] iArr = new int[MotionParams.PusherMotionEnum.values().length];
            f117767a = iArr;
            try {
                iArr[MotionParams.PusherMotionEnum.VIDEO_CHAT_CALLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117767a[MotionParams.PusherMotionEnum.VIDEO_CHAT_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C12532b m141280a(MotionParams motionParams) {
        int i = C17764a.f117767a[motionParams.mo69687a().ordinal()];
        if (i != 1) {
            return i != 2 ? new C12532b(motionParams) : t2l0.m187013r1(motionParams);
        }
        return p2l0.m167207p1(motionParams);
    }
}
