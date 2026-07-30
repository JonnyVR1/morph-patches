package p009l;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import l.ap0;
import l.i7n;
import l.kvc0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hcc0 {
    /* JADX INFO: renamed from: a */
    public static String m15529a(int i) {
        if (i != 1) {
            return i != 2 ? "https://fe-static.tancdn.com/v1/raw/bd5f6625-5aaf-432c-af27-0f4d586322f714.svga" : "https://fe-static.tancdn.com/v1/raw/c3dfddb1-456e-4a49-b2a8-c2c15eed2e3414.svga";
        }
        return "https://fe-static.tancdn.com/v1/raw/7add0548-66de-46eb-a9ad-fc78004bcafa14.svga";
    }

    /* JADX INFO: renamed from: b */
    public static void m15530b(Context context, TextView textView, int i) {
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
        m15534f(textView, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m15531c(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i <= 3 && i > 0;
        xdl0.M(animEffectPlayer, z);
        xdl0.M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i7n.b()) {
                animEffectPlayer.l(m15529a(i), 1, (ap0) null);
            } else {
                animEffectPlayer.l(m15529a(i), -1, (ap0) null);
            }
        }
        m15530b(context, vText, i);
    }

    /* JADX INFO: renamed from: d */
    public static void m15532d(Context context, TextView textView, int i) {
        if (context == null || textView == null) {
            return;
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(2, 18.0f);
        if (i > 0) {
            textView.setText(String.valueOf(i));
        } else {
            textView.setTextSize(2, 12.0f);
            textView.setText(kvc0.d(R.string.Zd));
        }
        m15534f(textView, i);
    }

    /* JADX INFO: renamed from: e */
    public static void m15533e(Context context, AnimEffectPlayer animEffectPlayer, VText vText, int i) {
        boolean z = i > 0 && i <= 3;
        xdl0.M(animEffectPlayer, z);
        xdl0.M(vText, true);
        animEffectPlayer.clearDynamicData();
        if (z) {
            if (i7n.b()) {
                animEffectPlayer.l(m15529a(i), 1, (ap0) null);
            } else {
                animEffectPlayer.l(m15529a(i), -1, (ap0) null);
            }
        }
        m15532d(context, vText, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m15534f(TextView textView, int i) {
        String str;
        if (i == 1) {
            str = "#F3C906";
        } else if (i == 2) {
            str = "#B1B7FF";
        } else {
            str = i == 3 ? "#FE9C55" : "#80ffffff";
        }
        textView.setTextColor(kvc0.g(str));
    }
}
