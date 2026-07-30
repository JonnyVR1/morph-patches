package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;

/* JADX INFO: loaded from: classes9.dex */
public class nob0 {

    /* JADX INFO: renamed from: l.nob0$a */
    public static /* synthetic */ class C18914a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142973a;

        static {
            int[] iArr = new int[MotionParams.PusherMotionEnum.values().length];
            f142973a = iArr;
            try {
                iArr[MotionParams.PusherMotionEnum.VIDEO_CHAT_CALLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142973a[MotionParams.PusherMotionEnum.VIDEO_CHAT_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C12695b m164111a(MotionParams motionParams) {
        int i = C18914a.f142973a[motionParams.mo70870a().ordinal()];
        if (i != 1) {
            return i != 2 ? new C12695b(motionParams) : ybl0.m215077r1(motionParams);
        }
        return ubl0.m195244p1(motionParams);
    }
}
