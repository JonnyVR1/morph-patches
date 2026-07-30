package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;

/* JADX INFO: loaded from: classes8.dex */
public class xv00 {

    /* JADX INFO: renamed from: a */
    private static xn0 f194570a;

    /* JADX INFO: renamed from: a */
    public static synchronized sml m211238a(vlw vlwVar, @NonNull hu00.InterfaceC17392a interfaceC17392a) {
        try {
            if (f194570a == null) {
                f194570a = new xn0(vlwVar, interfaceC17392a);
            }
            f194570a.m210152a(vlwVar);
        } catch (Throwable th) {
            throw th;
        }
        return f194570a;
    }

    /* JADX INFO: renamed from: b */
    public static qnl m211239b(@NonNull vlw vlwVar, @NonNull hu00.InterfaceC17392a interfaceC17392a, ts2 ts2Var) {
        return new v84(vlwVar, interfaceC17392a, ts2Var);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC4109a m211240c(Context context, int i, int i2, boolean z) {
        return new ExtAudioWrapper(i, i2, context, z);
    }

    /* JADX INFO: renamed from: d */
    public static MomoCodec m211241d(@NonNull Context context, MomoPipeline momoPipeline, @NonNull hu00.InterfaceC17392a interfaceC17392a) {
        return new kw00(context, interfaceC17392a);
    }

    /* JADX INFO: renamed from: e */
    public static u2m m211242e() {
        return new b5e0();
    }

    /* JADX INFO: renamed from: f */
    public static synchronized sml m211243f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m211244g() {
        xn0 xn0Var = f194570a;
        if (xn0Var != null) {
            xn0Var.mo19987X();
            f194570a = null;
        }
    }
}
