package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hcc0 {
    /* JADX INFO: renamed from: a */
    public static String m130416a(int i) {
        if (i != 1) {
            return i != 2 ? "https://fe-static.tancdn.com/v1/raw/bd5f6625-5aaf-432c-af27-0f4d586322f714.svga" : "https://fe-static.tancdn.com/v1/raw/c3dfddb1-456e-4a49-b2a8-c2c15eed2e3414.svga";
        }
        return "https://fe-static.tancdn.com/v1/raw/7add0548-66de-46eb-a9ad-fc78004bcafa14.svga";
    }

    /* JADX INFO: renamed from: b */
    public static void m130417b(Context context, TextView textView, int i) {
        if (context == null || textView == null) {
            return;
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(2, 18.0f);
        if (i > 0 && i <= 50) {
            textView.setText(String.valueOf(i));
        } else if (i > 50) {
            textView.setText("50+");
        } else {
            textView.setTextSize(2, 12.0f);
            textView.setText("未上榜");
        }
        m130421f(textView, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m130418c(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i <= 3 && i > 0;
        xdl0.m208344M(animEffectPlayer, z);
        xdl0.m208344M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i7n.m134916b()) {
                animEffectPlayer.mo68502l(m130416a(i), 1, null);
            } else {
                animEffectPlayer.mo68502l(m130416a(i), -1, null);
            }
        }
        m130417b(context, vText, i);
    }

    /* JADX INFO: renamed from: d */
    public static void m130419d(Context context, TextView textView, int i) {
        if (context == null || textView == null) {
            return;
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(2, 18.0f);
        if (i > 0) {
            textView.setText(String.valueOf(i));
        } else {
            textView.setTextSize(2, 12.0f);
            textView.setText(kvc0.m147355d(R$string.f47106Zd));
        }
        m130421f(textView, i);
    }

    /* JADX INFO: renamed from: e */
    public static void m130420e(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i > 0 && i <= 3;
        xdl0.m208344M(animEffectPlayer, z);
        xdl0.m208344M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i7n.m134916b()) {
                animEffectPlayer.mo68502l(m130416a(i), 1, null);
            } else {
                animEffectPlayer.mo68502l(m130416a(i), -1, null);
            }
        }
        m130419d(context, vText, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m130421f(TextView textView, int i) {
        String str;
        if (i == 1) {
            str = "#F3C906";
        } else if (i == 2) {
            str = "#B1B7FF";
        } else {
            str = i == 3 ? "#FE9C55" : "#80ffffff";
        }
        textView.setTextColor(kvc0.m147358g(str));
    }
}
