package p149l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes3.dex */
public class tgm {

    /* JADX INFO: renamed from: a */
    public static float f170104a = 1.05f;

    /* JADX INFO: renamed from: a */
    public static j760<Boolean, Integer> m188819a(View view, nvc0 nvc0Var) {
        return new j760<>(Boolean.FALSE, Integer.valueOf(m188821c(nvc0Var == null ? view.getMeasuredWidth() : nvc0Var.width)));
    }

    /* JADX INFO: renamed from: b */
    public static String m188820b(String str, View view, nvc0 nvc0Var) {
        j760<Boolean, Integer> j760VarM188819a = m188819a(view, nvc0Var);
        if (j760VarM188819a.f116565b.intValue() == 0) {
            return str;
        }
        if (!j760VarM188819a.f116564a.booleanValue()) {
            return str + "?format=max_" + j760VarM188819a.f116565b + "xX";
        }
        return str + "?format=" + j760VarM188819a.f116565b + BaseSei.f13930X + j760VarM188819a.f116565b;
    }

    /* JADX INFO: renamed from: c */
    public static int m188821c(int i) {
        if (i == 0) {
            return 0;
        }
        float f = i;
        float f2 = f170104a;
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
