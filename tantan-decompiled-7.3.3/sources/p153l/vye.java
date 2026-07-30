package p153l;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class vye implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f186366a;

    /* JADX INFO: renamed from: b */
    public iye.AbstractC17824d f186367b;

    /* JADX INFO: renamed from: l.vye$a */
    public static class C20957a extends iye.AbstractC17824d {

        /* JADX INFO: renamed from: a */
        public final Reference<TextView> f186368a;

        public C20957a(TextView textView) {
            this.f186368a = new WeakReference(textView);
        }

        @Override // p153l.iye.AbstractC17824d
        /* JADX INFO: renamed from: b */
        public void mo142651b() {
            super.mo142651b();
            TextView textView = this.f186368a.get();
            if (textView == null || !textView.isAttachedToWindow()) {
                return;
            }
            CharSequence charSequenceM142634m = iye.m142622a().m142634m(textView.getText());
            int selectionStart = Selection.getSelectionStart(charSequenceM142634m);
            int selectionEnd = Selection.getSelectionEnd(charSequenceM142634m);
            textView.setText(charSequenceM142634m);
            if (charSequenceM142634m instanceof Spannable) {
                vye.m203991b((Spannable) charSequenceM142634m, selectionStart, selectionEnd);
            }
        }
    }

    public vye(@NonNull TextView textView) {
        this.f186366a = textView;
    }

    /* JADX INFO: renamed from: b */
    public static void m203991b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final iye.AbstractC17824d m203992a() {
        if (this.f186367b == null) {
            this.f186367b = new C20957a(this.f186366a);
        }
        return this.f186367b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.f186366a.isInEditMode()) {
            int iM142627c = iye.m142622a().m142627c();
            if (iM142627c != 0) {
                if (iM142627c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.f186366a.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return iye.m142622a().m142635n(charSequence, 0, charSequence.length());
                    }
                }
            }
            iye.m142622a().m142638q(m203992a());
            return charSequence;
        }
        return charSequence;
    }
}
