package p149l;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class s7i {
    /* JADX INFO: renamed from: a */
    public static boolean m182487a(Paint paint, String str, float f) {
        return ((float) xdl0.m208412y0()) - f > paint.measureText(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m182488b(View view, View view2, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.m186890d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.m186890d(24.0f);
        layoutParams2.height = t100.m186890d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(f3c0.f94484b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = t100.m186890d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: c */
    public static void m182489c(View view, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.m186890d(65.0f), -1);
        layoutParams.addRule(11);
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.m186890d(24.0f);
        layoutParams2.height = t100.m186890d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(f3c0.f94484b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = t100.m186890d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: d */
    public static void m182490d(View view, View view2, VImage vImage, SVGAnimationView sVGAnimationView, FeedAutoScrollTextView feedAutoScrollTextView, String str) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t100.m186890d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        if (nkg.m159896o() && !TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams.width = -2;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = t100.m186890d(24.0f);
        layoutParams2.height = t100.m186890d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        if (NullChecker.m81303a(sVGAnimationView)) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            if (NullChecker.m81303a(layoutParams3)) {
                layoutParams3.leftMargin = -t100.m186890d(12.0f);
                layoutParams3.topMargin = t100.m186890d(2.5f);
                layoutParams3.width = t100.m186890d(48.0f);
                layoutParams3.height = t100.m186890d(48.0f);
                sVGAnimationView.setLayoutParams(layoutParams3);
            }
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) feedAutoScrollTextView.getLayoutParams();
        if (!nkg.m159896o() || TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams4.leftMargin = t100.m186890d(4.0f);
        } else {
            layoutParams4.leftMargin = t100.m186890d(3.0f);
        }
        feedAutoScrollTextView.setPadding(0, 0, 0, 0);
        feedAutoScrollTextView.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: renamed from: e */
    public static void m182491e(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(11);
        layoutParams.addRule(9);
        layoutParams.rightMargin = 0;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(f3c0.f94468Z2);
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m182492f(Paint paint, float f, String str, String str2, String str3, String str4, boolean z, aaj<String, String, String, String, Boolean, String> aajVar) {
        String str5;
        ArrayList arrayList = new ArrayList(2);
        if (m182487a(paint, aajVar.mo95547a(str, str2, str3, str4, Boolean.valueOf(z)), f)) {
            arrayList.add(str3);
            arrayList.add(str4);
            return arrayList;
        }
        String strM182495i = m182495i(str3);
        String strM182495i2 = m182495i(str4);
        String str6 = strM182495i.length() > strM182495i2.length() ? strM182495i2 : strM182495i;
        String str7 = str6;
        if (!m182487a(paint, aajVar.mo95547a(str, str2, str6, str6, Boolean.valueOf(z)), f)) {
            String strConcat = strM182495i.substring(0, 1).concat("...");
            String strConcat2 = strM182495i2.substring(0, 1).concat("...");
            for (int i = 0; i < str7.length() && m182487a(paint, aajVar.mo95547a(str, str2, m182494h(strM182495i, strConcat, strConcat.length()), m182494h(strM182495i2, strConcat2, strConcat2.length()), Boolean.valueOf(z)), f); i++) {
                strConcat = m182494h(strM182495i, strConcat, strConcat.length());
                strConcat2 = m182494h(strM182495i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM182495i.length() > strM182495i2.length()) {
            String strConcat3 = strM182495i.substring(0, Math.max(strM182495i2.length() - 3, 1)).concat("...");
            for (int length = strM182495i2.length(); length < strM182495i.length() && m182487a(paint, aajVar.mo95547a(str, str2, m182494h(strM182495i, strConcat3, strConcat3.length()), strM182495i2, Boolean.valueOf(z)), f); length++) {
                strConcat3 = m182494h(strM182495i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM182495i2);
            return arrayList;
        }
        String strConcat4 = strM182495i2.substring(0, Math.max(strM182495i.length() - 3, 1)).concat("...");
        int length2 = strM182495i.length();
        while (length2 < strM182495i2.length()) {
            String str8 = strM182495i;
            str5 = str8;
            if (!m182487a(paint, aajVar.mo95547a(str, str2, str8, m182494h(strM182495i2, strConcat4, strConcat4.length()), Boolean.valueOf(z)), f)) {
                arrayList.add(str5);
                arrayList.add(strConcat4);
                return arrayList;
            }
            strConcat4 = m182494h(strM182495i2, strConcat4, strConcat4.length());
            length2++;
            strM182495i = str5;
        }
        str5 = strM182495i;
        arrayList.add(str5);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m182493g(Paint paint, float f, String str, String str2, x9j<String, String, String> x9jVar) {
        ArrayList arrayList = new ArrayList(2);
        if (m182487a(paint, x9jVar.call(str, str2), f)) {
            arrayList.add(str);
            arrayList.add(str2);
            return arrayList;
        }
        String strM182495i = m182495i(str);
        String strM182495i2 = m182495i(str2);
        String str3 = strM182495i.length() > strM182495i2.length() ? strM182495i2 : strM182495i;
        if (!m182487a(paint, x9jVar.call(str3, str3), f)) {
            String strConcat = strM182495i.substring(0, 1).concat("...");
            String strConcat2 = strM182495i2.substring(0, 1).concat("...");
            for (int i = 0; i < str3.length() && m182487a(paint, x9jVar.call(m182494h(strM182495i, strConcat, strConcat.length()), m182494h(strM182495i2, strConcat2, strConcat2.length())), f); i++) {
                strConcat = m182494h(strM182495i, strConcat, strConcat.length());
                strConcat2 = m182494h(strM182495i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM182495i.length() > strM182495i2.length()) {
            String strConcat3 = strM182495i.substring(0, Math.max(strM182495i2.length() - 3, 1)).concat("...");
            for (int length = strM182495i2.length(); length < strM182495i.length() && m182487a(paint, x9jVar.call(m182494h(strM182495i, strConcat3, strConcat3.length()), strM182495i2), f); length++) {
                strConcat3 = m182494h(strM182495i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM182495i2);
            return arrayList;
        }
        String strConcat4 = strM182495i2.substring(0, Math.max(strM182495i.length() - 3, 1)).concat("...");
        for (int length2 = strM182495i.length(); length2 < strM182495i2.length() && m182487a(paint, x9jVar.call(strM182495i, m182494h(strM182495i2, strConcat4, strConcat4.length())), f); length2++) {
            strConcat4 = m182494h(strM182495i2, strConcat4, strConcat4.length());
        }
        arrayList.add(strM182495i);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static String m182494h(String str, String str2, int i) {
        int i2 = i - 3;
        if (str.length() <= i2) {
            return str2 + "...";
        }
        return str2.substring(0, i2) + str.substring(i2, i - 2) + "...";
    }

    /* JADX INFO: renamed from: i */
    public static String m182495i(String str) {
        return NullChecker.m81303a(str) ? str : "";
    }

    /* JADX INFO: renamed from: j */
    public static void m182496j(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(9);
        layoutParams.addRule(11);
        layoutParams.rightMargin = t100.m186890d(16.0f);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(f3c0.f94468Z2);
    }

    /* JADX INFO: renamed from: k */
    public static String m182497k(@NonNull String str, int i) {
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
            if (t0g0.m186868i(charArray[i2])) {
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
