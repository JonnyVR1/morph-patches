package p009l;

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
import com.p1.mobile.android.app.App;
import l.d30;
import l.v0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cjj0 {

    /* JADX INFO: renamed from: l.cjj0$a */
    public class C0814a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f10634a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f10635b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f10636c;

        public C0814a(d30 d30Var, int i, boolean z) {
            this.f10634a = d30Var;
            this.f10635b = i;
            this.f10636c = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            d30 d30Var = this.f10634a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f10635b);
            textPaint.setUnderlineText(false);
            if (this.f10636c) {
                textPaint.setFakeBoldText(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12628a(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable d30 d30Var) {
        m12629b(textView, str, i, d30Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m12629b(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable d30 d30Var, boolean z) {
        String string;
        int iIndexOf;
        if (TextUtils.isEmpty(textView.getText()) || (iIndexOf = (string = textView.getText().toString()).indexOf(str)) == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C0814a(d30Var, i, z), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.e.getResources().getColor(v0c0.o));
    }
}
