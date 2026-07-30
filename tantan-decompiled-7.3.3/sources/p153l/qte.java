package p153l;

import android.graphics.Point;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class qte {

    /* JADX INFO: renamed from: l.qte$a */
    public static class ViewTreeObserverOnPreDrawListenerC19652a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final TextView f159435a;

        /* JADX INFO: renamed from: b */
        public final String f159436b;

        /* JADX INFO: renamed from: c */
        public final String f159437c;

        /* JADX INFO: renamed from: d */
        public final int f159438d;

        /* JADX INFO: renamed from: e */
        public final boolean f159439e;

        /* JADX INFO: renamed from: f */
        public final boolean f159440f;

        /* JADX INFO: renamed from: g */
        public boolean f159441g = true;

        public ViewTreeObserverOnPreDrawListenerC19652a(TextView textView, String str, String str2, int i, boolean z, boolean z2) {
            this.f159435a = textView;
            this.f159436b = str;
            this.f159437c = str2;
            this.f159438d = i;
            this.f159439e = z;
            this.f159440f = z2;
            textView.getViewTreeObserver().addOnPreDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i;
            int i2;
            this.f159435a.getViewTreeObserver().removeOnPreDrawListener(this);
            qte.m177920c(this.f159435a, this.f159436b, this.f159437c, this.f159440f);
            if (!this.f159441g) {
                return true;
            }
            if (!this.f159439e) {
                if (this.f159435a.getEllipsize() == TextUtils.TruncateAt.START) {
                    i2 = 1;
                } else {
                    i = 0;
                }
                this.f159435a.setText(qte.m177923f(this.f159435a.getText().toString(), this.f159437c, this.f159438d, 0, i2, this.f159440f));
                return true;
            }
            i = 2;
            i2 = i;
            this.f159435a.setText(qte.m177923f(this.f159435a.getText().toString(), this.f159437c, this.f159438d, 0, i2, this.f159440f));
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m177919b(TextView textView, String str, String str2, int i, boolean z, boolean z2) {
        int i2;
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            textView.setText("");
            return;
        }
        if (textView.getWidth() <= 0) {
            new ViewTreeObserverOnPreDrawListenerC19652a(textView, str, str2, i, z, z2);
            return;
        }
        m177920c(textView, str, str2, z2);
        if (z) {
            i2 = 2;
        } else {
            i2 = textView.getEllipsize() == TextUtils.TruncateAt.START ? 1 : 0;
        }
        textView.setText(m177923f(textView.getText().toString(), str2, i, 0, i2, z2));
    }

    /* JADX INFO: renamed from: c */
    public static void m177920c(TextView textView, String str, String str2, boolean z) {
        if (textView == null) {
            return;
        }
        TextPaint paint = textView.getPaint();
        if (paint == null) {
            textView.setText("");
            return;
        }
        String lowerCase = z ? str.toLowerCase(Locale.ENGLISH) : str;
        String lowerCase2 = z ? str2.toLowerCase(Locale.ENGLISH) : str2;
        int iIndexOf = lowerCase.indexOf(lowerCase2);
        if (iIndexOf < 0) {
            textView.setText("");
            return;
        }
        int iM159806d = msi0.m159806d(textView);
        if (iM159806d <= 0) {
            textView.setText(str);
            return;
        }
        int width = ((textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) - qa00.m175859d(23.0f);
        if (iM159806d >= 2) {
            List<Point> listM177922e = m177922e(textView.getPaint(), lowerCase, width);
            int iM177921d = m177921d(iIndexOf, listM177922e);
            if (m177921d((lowerCase2.length() + iIndexOf) + 1, listM177922e) - iM177921d >= iM159806d) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText("…".concat(str.substring(iIndexOf)));
                return;
            }
            int iMax = Math.max((Math.min(iM177921d + (iM159806d / 2), listM177922e.size() - 1) - (iM159806d - 1)) + (iM159806d % 2), 0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (iMax == 0) {
                textView.setText(str);
                return;
            } else {
                textView.setText("…".concat(str.substring(listM177922e.get(iMax).x)));
                return;
            }
        }
        float f = width;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        String string = TextUtils.ellipsize(lowerCase, paint, f, truncateAt).toString();
        int length = string.length();
        if (string.contains(lowerCase2)) {
            textView.setEllipsize(truncateAt);
            textView.setText(str);
            return;
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.START;
        String string2 = TextUtils.ellipsize(lowerCase, paint, f, truncateAt2).toString();
        int iMax2 = Math.max(string2.length(), length);
        if (string2.contains(lowerCase2)) {
            textView.setEllipsize(truncateAt2);
            textView.setText(str);
            return;
        }
        if (iMax2 <= str2.length()) {
            textView.setEllipsize(truncateAt);
            textView.setText("…".concat(str2));
            return;
        }
        textView.setEllipsize(truncateAt);
        int length2 = iIndexOf - ((iMax2 - str2.length()) / 2);
        String strConcat = "…".concat(str.substring(length2 >= 0 ? length2 : 0));
        if (TextUtils.ellipsize(strConcat, paint, f, truncateAt).toString().contains(lowerCase2)) {
            textView.setText(strConcat);
        } else {
            textView.setText("…".concat(str.substring(iIndexOf)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m177921d(int i, List<Point> list) {
        if (jyb.m147479J(list)) {
            return 0;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i < list.get(i2).y) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static List<Point> m177922e(TextPaint textPaint, CharSequence charSequence, int i) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < lineCount; i2++) {
            arrayList.add(new Point(staticLayout.getLineStart(i2), staticLayout.getLineEnd(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static SpannableString m177923f(String str, String str2, int i, int i2, int i3, boolean z) {
        int iIndexOf;
        SpannableString spannableString = new SpannableString(str);
        if (i2 < str.length() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int iMax = Math.max(0, i2);
            if (z) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            String lowerCase = z ? str2.toLowerCase(Locale.ENGLISH) : str2;
            if (i3 == 1 || i3 == 0) {
                if (i3 == 1) {
                    iIndexOf = str.lastIndexOf(lowerCase);
                    if (iIndexOf < iMax) {
                        iIndexOf = -1;
                    }
                } else {
                    iIndexOf = str.indexOf(lowerCase, iMax);
                }
                if (iIndexOf > -1) {
                    spannableString.setSpan(new ForegroundColorSpan(i), iIndexOf, str2.length() + iIndexOf, 33);
                }
            } else {
                int iIndexOf2 = str.indexOf(lowerCase, iMax);
                while (iIndexOf2 >= 0) {
                    spannableString.setSpan(new ForegroundColorSpan(i), iIndexOf2, str2.length() + iIndexOf2, 33);
                    iIndexOf2 = str.indexOf(lowerCase, iIndexOf2 + str2.length());
                }
            }
        }
        return spannableString;
    }
}
