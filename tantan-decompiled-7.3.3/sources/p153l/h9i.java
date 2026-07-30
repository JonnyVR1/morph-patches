package p153l;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class h9i {
    /* JADX INFO: renamed from: a */
    public static boolean m134060a(Paint paint, String str, float f) {
        return ((float) bnl0.m105592y0()) - f > paint.measureText(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m134061b(View view, View view2, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qa00.m175859d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = qa00.m175859d(24.0f);
        layoutParams2.height = qa00.m175859d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(lbc0.f131002b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = qa00.m175859d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: c */
    public static void m134062c(View view, VImage vImage, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qa00.m175859d(65.0f), -1);
        layoutParams.addRule(11);
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = qa00.m175859d(24.0f);
        layoutParams2.height = qa00.m175859d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        vImage.setImageResource(lbc0.f131002b3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.leftMargin = qa00.m175859d(6.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: d */
    public static void m134063d(View view, View view2, VImage vImage, SVGAnimationView sVGAnimationView, FeedAutoScrollTextView feedAutoScrollTextView, String str) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qa00.m175859d(64.0f), -1);
        layoutParams.addRule(0, view2.getId());
        if (cmg.m111225o() && !TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams.width = -2;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(null);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams2.leftMargin = 0;
        layoutParams2.width = qa00.m175859d(24.0f);
        layoutParams2.height = qa00.m175859d(24.0f);
        vImage.setLayoutParams(layoutParams2);
        if (NullChecker.m82486a(sVGAnimationView)) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            if (NullChecker.m82486a(layoutParams3)) {
                layoutParams3.leftMargin = -qa00.m175859d(12.0f);
                layoutParams3.topMargin = qa00.m175859d(2.5f);
                layoutParams3.width = qa00.m175859d(48.0f);
                layoutParams3.height = qa00.m175859d(48.0f);
                sVGAnimationView.setLayoutParams(layoutParams3);
            }
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) feedAutoScrollTextView.getLayoutParams();
        if (!cmg.m111225o() || TextUtils.equals(str, "from_live_square_tab")) {
            layoutParams4.leftMargin = qa00.m175859d(4.0f);
        } else {
            layoutParams4.leftMargin = qa00.m175859d(3.0f);
        }
        feedAutoScrollTextView.setPadding(0, 0, 0, 0);
        feedAutoScrollTextView.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: renamed from: e */
    public static void m134064e(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(11);
        layoutParams.addRule(9);
        layoutParams.rightMargin = 0;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(lbc0.f130986Z2);
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m134065f(Paint paint, float f, String str, String str2, String str3, String str4, boolean z, ucj<String, String, String, String, Boolean, String> ucjVar) {
        String str5;
        ArrayList arrayList = new ArrayList(2);
        if (m134060a(paint, ucjVar.mo115512a(str, str2, str3, str4, Boolean.valueOf(z)), f)) {
            arrayList.add(str3);
            arrayList.add(str4);
            return arrayList;
        }
        String strM134068i = m134068i(str3);
        String strM134068i2 = m134068i(str4);
        String str6 = strM134068i.length() > strM134068i2.length() ? strM134068i2 : strM134068i;
        String str7 = str6;
        if (!m134060a(paint, ucjVar.mo115512a(str, str2, str6, str6, Boolean.valueOf(z)), f)) {
            String strConcat = strM134068i.substring(0, 1).concat("...");
            String strConcat2 = strM134068i2.substring(0, 1).concat("...");
            for (int i = 0; i < str7.length() && m134060a(paint, ucjVar.mo115512a(str, str2, m134067h(strM134068i, strConcat, strConcat.length()), m134067h(strM134068i2, strConcat2, strConcat2.length()), Boolean.valueOf(z)), f); i++) {
                strConcat = m134067h(strM134068i, strConcat, strConcat.length());
                strConcat2 = m134067h(strM134068i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM134068i.length() > strM134068i2.length()) {
            String strConcat3 = strM134068i.substring(0, Math.max(strM134068i2.length() - 3, 1)).concat("...");
            for (int length = strM134068i2.length(); length < strM134068i.length() && m134060a(paint, ucjVar.mo115512a(str, str2, m134067h(strM134068i, strConcat3, strConcat3.length()), strM134068i2, Boolean.valueOf(z)), f); length++) {
                strConcat3 = m134067h(strM134068i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM134068i2);
            return arrayList;
        }
        String strConcat4 = strM134068i2.substring(0, Math.max(strM134068i.length() - 3, 1)).concat("...");
        int length2 = strM134068i.length();
        while (length2 < strM134068i2.length()) {
            String str8 = strM134068i;
            str5 = str8;
            if (!m134060a(paint, ucjVar.mo115512a(str, str2, str8, m134067h(strM134068i2, strConcat4, strConcat4.length()), Boolean.valueOf(z)), f)) {
                arrayList.add(str5);
                arrayList.add(strConcat4);
                return arrayList;
            }
            strConcat4 = m134067h(strM134068i2, strConcat4, strConcat4.length());
            length2++;
            strM134068i = str5;
        }
        str5 = strM134068i;
        arrayList.add(str5);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m134066g(Paint paint, float f, String str, String str2, rcj<String, String, String> rcjVar) {
        ArrayList arrayList = new ArrayList(2);
        if (m134060a(paint, rcjVar.call(str, str2), f)) {
            arrayList.add(str);
            arrayList.add(str2);
            return arrayList;
        }
        String strM134068i = m134068i(str);
        String strM134068i2 = m134068i(str2);
        String str3 = strM134068i.length() > strM134068i2.length() ? strM134068i2 : strM134068i;
        if (!m134060a(paint, rcjVar.call(str3, str3), f)) {
            String strConcat = strM134068i.substring(0, 1).concat("...");
            String strConcat2 = strM134068i2.substring(0, 1).concat("...");
            for (int i = 0; i < str3.length() && m134060a(paint, rcjVar.call(m134067h(strM134068i, strConcat, strConcat.length()), m134067h(strM134068i2, strConcat2, strConcat2.length())), f); i++) {
                strConcat = m134067h(strM134068i, strConcat, strConcat.length());
                strConcat2 = m134067h(strM134068i2, strConcat2, strConcat2.length());
            }
            arrayList.add(strConcat);
            arrayList.add(strConcat2);
            return arrayList;
        }
        if (strM134068i.length() > strM134068i2.length()) {
            String strConcat3 = strM134068i.substring(0, Math.max(strM134068i2.length() - 3, 1)).concat("...");
            for (int length = strM134068i2.length(); length < strM134068i.length() && m134060a(paint, rcjVar.call(m134067h(strM134068i, strConcat3, strConcat3.length()), strM134068i2), f); length++) {
                strConcat3 = m134067h(strM134068i, strConcat3, strConcat3.length());
            }
            arrayList.add(strConcat3);
            arrayList.add(strM134068i2);
            return arrayList;
        }
        String strConcat4 = strM134068i2.substring(0, Math.max(strM134068i.length() - 3, 1)).concat("...");
        for (int length2 = strM134068i.length(); length2 < strM134068i2.length() && m134060a(paint, rcjVar.call(strM134068i, m134067h(strM134068i2, strConcat4, strConcat4.length())), f); length2++) {
            strConcat4 = m134067h(strM134068i2, strConcat4, strConcat4.length());
        }
        arrayList.add(strM134068i);
        arrayList.add(strConcat4);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static String m134067h(String str, String str2, int i) {
        int i2 = i - 3;
        if (str.length() <= i2) {
            return str2 + "...";
        }
        return str2.substring(0, i2) + str.substring(i2, i - 2) + "...";
    }

    /* JADX INFO: renamed from: i */
    public static String m134068i(String str) {
        return NullChecker.m82486a(str) ? str : "";
    }

    /* JADX INFO: renamed from: j */
    public static void m134069j(ImageView imageView) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.removeRule(9);
        layoutParams.addRule(11);
        layoutParams.rightMargin = qa00.m175859d(16.0f);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(lbc0.f130986Z2);
    }

    /* JADX INFO: renamed from: k */
    public static String m134070k(@NonNull String str, int i) {
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
            if (a9g0.m96574i(charArray[i2])) {
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
