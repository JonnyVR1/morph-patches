package p153l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes3.dex */
public class wim {

    /* JADX INFO: renamed from: a */
    public static float f189373a = 1.05f;

    /* JADX INFO: renamed from: a */
    public static pf60<Boolean, Integer> m206591a(View view, q3d0 q3d0Var) {
        return new pf60<>(Boolean.FALSE, Integer.valueOf(m206593c(q3d0Var == null ? view.getMeasuredWidth() : q3d0Var.width)));
    }

    /* JADX INFO: renamed from: b */
    public static String m206592b(String str, View view, q3d0 q3d0Var) {
        pf60<Boolean, Integer> pf60VarM206591a = m206591a(view, q3d0Var);
        if (pf60VarM206591a.f152157b.intValue() == 0) {
            return str;
        }
        if (!pf60VarM206591a.f152156a.booleanValue()) {
            return str + "?format=max_" + pf60VarM206591a.f152157b + "xX";
        }
        return str + "?format=" + pf60VarM206591a.f152157b + BaseSei.f14624X + pf60VarM206591a.f152157b;
    }

    /* JADX INFO: renamed from: c */
    public static int m206593c(int i) {
        if (i == 0) {
            return 0;
        }
        float f = i;
        float f2 = f189373a;
        if (f < 64.0f * f2) {
            return 64;
        }
        if (f <= 96.0f * f2) {
            return 96;
        }
        if (f <= 128.0f * f2) {
            return 128;
        }
        if (f <= 180.0f * f2) {
            return 180;
        }
        if (f <= 300.0f * f2) {
            return 300;
        }
        if (f <= 480.0f * f2) {
            return 480;
        }
        if (f <= 640.0f * f2) {
            return 640;
        }
        if (f <= f2 * 720.0f) {
            return 720;
        }
        return TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    }
}
