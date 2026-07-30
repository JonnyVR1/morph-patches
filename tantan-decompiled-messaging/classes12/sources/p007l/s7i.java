package p007l;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.aaj;
import l.t0g0;
import l.t100;
import l.x9j;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s7i {
    /* JADX INFO: renamed from: a */
    public static boolean m14035a(Paint paint, String str, float f) {
        return ((float) xdl0.y0()) - f > paint.measureText(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m14036b(View view, View view2, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.d(24.0f);
        layoutParams2.height = t100.d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(f3c0.f7767b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = t100.d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: c */
    public static void m14037c(View view, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.d(65.0f), -1);
        layoutParams.addRule(11);
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.d(24.0f);
        layoutParams2.height = t100.d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(f3c0.f7767b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = t100.d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: d */
    public static void m14038d(View view, View view2, VImage vImage, SVGAnimationView sVGAnimationView, FeedAutoScrollTextView feedAutoScrollTextView, String str) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        if (nkg.m12255o() && !TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams.width = -2;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.d(24.0f);
        layoutParams2.height = t100.d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        if (NullChecker.a(sVGAnimationView)) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            if (NullChecker.a(layoutParams3)) {
                layoutParams3.leftMargin = -t100.d(12.0f);
                layoutParams3.topMargin = t100.d(2.5f);
                layoutParams3.width = t100.d(48.0f);
                layoutParams3.height = t100.d(48.0f);
                sVGAnimationView.setLayoutParams(layoutParams3);
            }
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) feedAutoScrollTextView.getLayoutParams();
        if (!nkg.m12255o() || TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams4.leftMargin = t100.d(4.0f);
        } else {
            layoutParams4.leftMargin = t100.d(3.0f);
        }
        feedAutoScrollTextView.setPadding(0, 0, 0, 0);
        feedAutoScrollTextView.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: renamed from: e */
    public static void m14039e(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(11);
        layoutParams.addRule(9);
        layoutParams.rightMargin = 0;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(f3c0.f7751Z2);
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m14040f(Paint paint, float f, String str, String str2, String str3, String str4, boolean z, aaj<String, String, String, String, Boolean, String> aajVar) {
        String str5;
        ArrayList arrayList = new ArrayList(2);
        if (m14035a(paint, (String) aajVar.a(str, str2, str3, str4, Boolean.valueOf(z)), f)) {
            arrayList.add(str3);
            arrayList.add(str4);
            return arrayList;
        }
        String strM14043i = m14043i(str3);
        String strM14043i2 = m14043i(str4);
        String str6 = strM14043i.length() > strM14043i2.length() ? strM14043i2 : strM14043i;
        String str7 = str6;
        if (!m14035a(paint, (String) aajVar.a(str, str2, str6, str6, Boolean.valueOf(z)), f)) {
            String strConcat = strM14043i.substring(0, 1).concat("...");
            String strConcat2 = strM14043i2.substring(0, 1).concat("...");
            for (int i = 0; i < str7.length() && m14035a(paint, (String) aajVar.a(str, str2, m14042h(strM14043i, strConcat, strConcat.length()), m14042h(strM14043i2, strConcat2, strConcat2.length()), Boolean.valueOf(z)), f); i++) {
                strConcat = m14042h(strM14043i, strConcat, strConcat.length());
                strConcat2 = m14042h(strM14043i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM14043i.length() > strM14043i2.length()) {
            String strConcat3 = strM14043i.substring(0, Math.max(strM14043i2.length() - 3, 1)).concat("...");
            for (int length = strM14043i2.length(); length < strM14043i.length() && m14035a(paint, (String) aajVar.a(str, str2, m14042h(strM14043i, strConcat3, strConcat3.length()), strM14043i2, Boolean.valueOf(z)), f); length++) {
                strConcat3 = m14042h(strM14043i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM14043i2);
            return arrayList;
        }
        String strConcat4 = strM14043i2.substring(0, Math.max(strM14043i.length() - 3, 1)).concat("...");
        int length2 = strM14043i.length();
        while (length2 < strM14043i2.length()) {
            String str8 = strM14043i;
            str5 = str8;
            if (!m14035a(paint, (String) aajVar.a(str, str2, str8, m14042h(strM14043i2, strConcat4, strConcat4.length()), Boolean.valueOf(z)), f)) {
                arrayList.add(str5);
                arrayList.add(strConcat4);
                return arrayList;
            }
            strConcat4 = m14042h(strM14043i2, strConcat4, strConcat4.length());
            length2++;
            strM14043i = str5;
        }
        str5 = strM14043i;
        arrayList.add(str5);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m14041g(Paint paint, float f, String str, String str2, x9j<String, String, String> x9jVar) {
        ArrayList arrayList = new ArrayList(2);
        if (m14035a(paint, (String) x9jVar.call(str, str2), f)) {
            arrayList.add(str);
            arrayList.add(str2);
            return arrayList;
        }
        String strM14043i = m14043i(str);
        String strM14043i2 = m14043i(str2);
        String str3 = strM14043i.length() > strM14043i2.length() ? strM14043i2 : strM14043i;
        if (!m14035a(paint, (String) x9jVar.call(str3, str3), f)) {
            String strConcat = strM14043i.substring(0, 1).concat("...");
            String strConcat2 = strM14043i2.substring(0, 1).concat("...");
            for (int i = 0; i < str3.length() && m14035a(paint, (String) x9jVar.call(m14042h(strM14043i, strConcat, strConcat.length()), m14042h(strM14043i2, strConcat2, strConcat2.length())), f); i++) {
                strConcat = m14042h(strM14043i, strConcat, strConcat.length());
                strConcat2 = m14042h(strM14043i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM14043i.length() > strM14043i2.length()) {
            String strConcat3 = strM14043i.substring(0, Math.max(strM14043i2.length() - 3, 1)).concat("...");
            for (int length = strM14043i2.length(); length < strM14043i.length() && m14035a(paint, (String) x9jVar.call(m14042h(strM14043i, strConcat3, strConcat3.length()), strM14043i2), f); length++) {
                strConcat3 = m14042h(strM14043i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM14043i2);
            return arrayList;
        }
        String strConcat4 = strM14043i2.substring(0, Math.max(strM14043i.length() - 3, 1)).concat("...");
        for (int length2 = strM14043i.length(); length2 < strM14043i2.length() && m14035a(paint, (String) x9jVar.call(strM14043i, m14042h(strM14043i2, strConcat4, strConcat4.length())), f); length2++) {
            strConcat4 = m14042h(strM14043i2, strConcat4, strConcat4.length());
        }
        arrayList.add(strM14043i);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static String m14042h(String str, String str2, int i) {
        int i2 = i - 3;
        if (str.length() <= i2) {
            return str2 + "...";
        }
        return str2.substring(0, i2) + str.substring(i2, i - 2) + "...";
    }

    /* JADX INFO: renamed from: i */
    public static String m14043i(String str) {
        return NullChecker.a(str) ? str : "";
    }

    /* JADX INFO: renamed from: j */
    public static void m14044j(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(9);
        layoutParams.addRule(11);
        layoutParams.rightMargin = t100.d(16.0f);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(f3c0.f7751Z2);
    }

    /* JADX INFO: renamed from: k */
    public static String m14045k(@NonNull String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charArray.length) {
            if (i3 > i - 1) {
                sb.append("...");
                break;
            }
            if (t0g0.i(charArray[i2])) {
                sb.append(charArray[i2]);
                i2++;
                sb.append(charArray[i2]);
            } else {
                sb.append(charArray[i2]);
            }
            i3++;
            i2++;
        }
        return sb.toString();
    }
}
