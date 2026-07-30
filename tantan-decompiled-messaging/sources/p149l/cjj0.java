package p149l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes11.dex */
public class cjj0 {

    /* JADX INFO: renamed from: l.cjj0$a */
    public class C16168a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f81192a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f81193b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f81194c;

        public C16168a(d30 d30Var, int i, boolean z) {
            this.f81192a = d30Var;
            this.f81193b = i;
            this.f81194c = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            d30 d30Var = this.f81192a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f81193b);
            textPaint.setUnderlineText(false);
            if (this.f81194c) {
                textPaint.setFakeBoldText(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m107173a(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable d30 d30Var) {
        m107174b(textView, str, i, d30Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m107174b(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable d30 d30Var, boolean z) {
        String string;
        int iIndexOf;
        if (TextUtils.isEmpty(textView.getText()) || (iIndexOf = (string = textView.getText().toString()).indexOf(str)) == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C16168a(d30Var, i, z), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f15369e.getResources().getColor(v0c0.f179108o));
    }
}
