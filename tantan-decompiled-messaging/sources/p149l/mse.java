package p149l;

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
public class mse {

    /* JADX INFO: renamed from: l.mse$a */
    public static class ViewTreeObserverOnPreDrawListenerC18548a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final TextView f135470a;

        /* JADX INFO: renamed from: b */
        public final String f135471b;

        /* JADX INFO: renamed from: c */
        public final String f135472c;

        /* JADX INFO: renamed from: d */
        public final int f135473d;

        /* JADX INFO: renamed from: e */
        public final boolean f135474e;

        /* JADX INFO: renamed from: f */
        public final boolean f135475f;

        /* JADX INFO: renamed from: g */
        public boolean f135476g = true;

        public ViewTreeObserverOnPreDrawListenerC18548a(TextView textView, String str, String str2, int i, boolean z, boolean z2) {
            this.f135470a = textView;
            this.f135471b = str;
            this.f135472c = str2;
            this.f135473d = i;
            this.f135474e = z;
            this.f135475f = z2;
            textView.getViewTreeObserver().addOnPreDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i;
            int i2;
            this.f135470a.getViewTreeObserver().removeOnPreDrawListener(this);
            mse.m156130c(this.f135470a, this.f135471b, this.f135472c, this.f135475f);
            if (!this.f135476g) {
                return true;
            }
            if (!this.f135474e) {
                if (this.f135470a.getEllipsize() == TextUtils.TruncateAt.START) {
                    i2 = 1;
                } else {
                    i = 0;
                }
                this.f135470a.setText(mse.m156133f(this.f135470a.getText().toString(), this.f135472c, this.f135473d, 0, i2, this.f135475f));
                return true;
            }
            i = 2;
            i2 = i;
            this.f135470a.setText(mse.m156133f(this.f135470a.getText().toString(), this.f135472c, this.f135473d, 0, i2, this.f135475f));
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156129b(TextView textView, String str, String str2, int i, boolean z, boolean z2) {
        int i2;
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            textView.setText("");
            return;
        }
        if (textView.getWidth() <= 0) {
            new ViewTreeObserverOnPreDrawListenerC18548a(textView, str, str2, i, z, z2);
            return;
        }
        m156130c(textView, str, str2, z2);
        if (z) {
            i2 = 2;
        } else {
            i2 = textView.getEllipsize() == TextUtils.TruncateAt.START ? 1 : 0;
        }
        textView.setText(m156133f(textView.getText().toString(), str2, i, 0, i2, z2));
    }

    /* JADX INFO: renamed from: c */
    public static void m156130c(TextView textView, String str, String str2, boolean z) {
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
        int iM154810d = mji0.m154810d(textView);
        if (iM154810d <= 0) {
            textView.setText(str);
            return;
        }
        int width = ((textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) - t100.m186890d(23.0f);
        if (iM154810d >= 2) {
            List<Point> listM156132e = m156132e(textView.getPaint(), lowerCase, width);
            int iM156131d = m156131d(iIndexOf, listM156132e);
            if (m156131d((lowerCase2.length() + iIndexOf) + 1, listM156132e) - iM156131d >= iM154810d) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText("…".concat(str.substring(iIndexOf)));
                return;
            }
            int iMax = Math.max((Math.min(iM156131d + (iM154810d / 2), listM156132e.size() - 1) - (iM154810d - 1)) + (iM154810d % 2), 0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (iMax == 0) {
                textView.setText(str);
                return;
            } else {
                textView.setText("…".concat(str.substring(listM156132e.get(iMax).x)));
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
    public static int m156131d(int i, List<Point> list) {
        if (vwb.m200296J(list)) {
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
    public static List<Point> m156132e(TextPaint textPaint, CharSequence charSequence, int i) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < lineCount; i2++) {
            arrayList.add(new Point(staticLayout.getLineStart(i2), staticLayout.getLineEnd(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static SpannableString m156133f(String str, String str2, int i, int i2, int i3, boolean z) {
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
