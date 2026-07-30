package p153l;

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
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes10.dex */
public class fsj0 {

    /* JADX INFO: renamed from: l.fsj0$a */
    public class C17065a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f100635a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f100636b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f100637c;

        public C17065a(x20 x20Var, int i, boolean z) {
            this.f100635a = x20Var;
            this.f100636b = i;
            this.f100637c = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            x20 x20Var = this.f100635a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f100636b);
            textPaint.setUnderlineText(false);
            if (this.f100637c) {
                textPaint.setFakeBoldText(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m127199a(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable x20 x20Var) {
        m127200b(textView, str, i, x20Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m127200b(@NonNull TextView textView, @NonNull String str, @ColorInt int i, @Nullable x20 x20Var, boolean z) {
        String string;
        int iIndexOf;
        if (TextUtils.isEmpty(textView.getText()) || (iIndexOf = (string = textView.getText().toString()).indexOf(str)) == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C17065a(x20Var, i, z), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f16088e.getResources().getColor(b9c0.f75569o));
    }
}
