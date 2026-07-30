package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class okc0 {
    /* JADX INFO: renamed from: a */
    public static String m168001a(int i) {
        if (i != 1) {
            return i != 2 ? "https://fe-static.tancdn.com/v1/raw/bd5f6625-5aaf-432c-af27-0f4d586322f714.svga" : "https://fe-static.tancdn.com/v1/raw/c3dfddb1-456e-4a49-b2a8-c2c15eed2e3414.svga";
        }
        return "https://fe-static.tancdn.com/v1/raw/7add0548-66de-46eb-a9ad-fc78004bcafa14.svga";
    }

    /* JADX INFO: renamed from: b */
    public static void m168002b(Context context, TextView textView, int i) {
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
        m168006f(textView, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m168003c(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i <= 3 && i > 0;
        bnl0.m105524M(animEffectPlayer, z);
        bnl0.m105524M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i9n.m139127b()) {
                animEffectPlayer.mo69685l(m168001a(i), 1, null);
            } else {
                animEffectPlayer.mo69685l(m168001a(i), -1, null);
            }
        }
        m168002b(context, vText, i);
    }

    /* JADX INFO: renamed from: d */
    public static void m168004d(Context context, TextView textView, int i) {
        if (context == null || textView == null) {
            return;
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(2, 18.0f);
        if (i > 0) {
            textView.setText(String.valueOf(i));
        } else {
            textView.setTextSize(2, 12.0f);
            textView.setText(n3d0.m161280d(R$string.f47954Zd));
        }
        m168006f(textView, i);
    }

    /* JADX INFO: renamed from: e */
    public static void m168005e(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i > 0 && i <= 3;
        bnl0.m105524M(animEffectPlayer, z);
        bnl0.m105524M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i9n.m139127b()) {
                animEffectPlayer.mo69685l(m168001a(i), 1, null);
            } else {
                animEffectPlayer.mo69685l(m168001a(i), -1, null);
            }
        }
        m168004d(context, vText, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m168006f(TextView textView, int i) {
        String str;
        if (i == 1) {
            str = "#F3C906";
        } else if (i == 2) {
            str = "#B1B7FF";
        } else {
            str = i == 3 ? "#FE9C55" : "#80ffffff";
        }
        textView.setTextColor(n3d0.m161283g(str));
    }
}
