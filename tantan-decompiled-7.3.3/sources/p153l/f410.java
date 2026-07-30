package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;

/* JADX INFO: loaded from: classes8.dex */
public class f410 {

    /* JADX INFO: renamed from: a */
    private static tn0 f97045a;

    /* JADX INFO: renamed from: a */
    public static synchronized dpl m123866a(uow uowVar, @NonNull q210.InterfaceC19500a interfaceC19500a) {
        try {
            if (f97045a == null) {
                f97045a = new tn0(uowVar, interfaceC19500a);
            }
            f97045a.m191874a(uowVar);
        } catch (Throwable th) {
            throw th;
        }
        return f97045a;
    }

    /* JADX INFO: renamed from: b */
    public static bql m123867b(@NonNull uow uowVar, @NonNull q210.InterfaceC19500a interfaceC19500a, jt2 jt2Var) {
        return new u94(uowVar, interfaceC19500a, jt2Var);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC4260a m123868c(Context context, int i, int i2, boolean z) {
        return new ExtAudioWrapper(i, i2, context, z);
    }

    /* JADX INFO: renamed from: d */
    public static MomoCodec m123869d(@NonNull Context context, MomoPipeline momoPipeline, @NonNull q210.InterfaceC19500a interfaceC19500a) {
        return new s410(context, interfaceC19500a);
    }

    /* JADX INFO: renamed from: e */
    public static m5m m123870e() {
        return new fde0();
    }

    /* JADX INFO: renamed from: f */
    public static synchronized dpl m123871f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m123872g() {
        tn0 tn0Var = f97045a;
        if (tn0Var != null) {
            tn0Var.mo20986X();
            f97045a = null;
        }
    }
}
