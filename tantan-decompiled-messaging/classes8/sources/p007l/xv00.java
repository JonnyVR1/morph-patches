package p007l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.b5e0;
import l.hu00;
import l.qnl;
import l.sml;
import l.ts2;
import l.u2m;
import l.v84;
import l.vlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xv00 {

    /* JADX INFO: renamed from: a */
    private static xn0 f5363a;

    /* JADX INFO: renamed from: a */
    public static synchronized sml m11846a(vlw vlwVar, @NonNull hu00.a aVar) {
        try {
            if (f5363a == null) {
                f5363a = new xn0(vlwVar, aVar);
            }
            f5363a.m11843a(vlwVar);
        } catch (Throwable th) {
            throw th;
        }
        return f5363a;
    }

    /* JADX INFO: renamed from: b */
    public static qnl m11847b(@NonNull vlw vlwVar, @NonNull hu00.a aVar, ts2 ts2Var) {
        return new v84(vlwVar, aVar, ts2Var);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0021a m11848c(Context context, int i, int i2, boolean z) {
        return new ExtAudioWrapper(i, i2, context, z);
    }

    /* JADX INFO: renamed from: d */
    public static MomoCodec m11849d(@NonNull Context context, MomoPipeline momoPipeline, @NonNull hu00.a aVar) {
        return new kw00(context, aVar);
    }

    /* JADX INFO: renamed from: e */
    public static u2m m11850e() {
        return new b5e0();
    }

    /* JADX INFO: renamed from: f */
    public static synchronized sml m11851f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m11852g() {
        xn0 xn0Var = f5363a;
        if (xn0Var != null) {
            xn0Var.m11842X();
            f5363a = null;
        }
    }
}
