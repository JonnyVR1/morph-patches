package p149l;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class rxe implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f161445a;

    /* JADX INFO: renamed from: b */
    public exe.AbstractC16712d f161446b;

    /* JADX INFO: renamed from: l.rxe$a */
    public static class C19809a extends exe.AbstractC16712d {

        /* JADX INFO: renamed from: a */
        public final Reference<TextView> f161447a;

        public C19809a(TextView textView) {
            this.f161447a = new WeakReference(textView);
        }

        @Override // p149l.exe.AbstractC16712d
        /* JADX INFO: renamed from: b */
        public void mo118660b() {
            super.mo118660b();
            TextView textView = this.f161447a.get();
            if (textView == null || !textView.isAttachedToWindow()) {
                return;
            }
            CharSequence charSequenceM118643m = exe.m118631a().m118643m(textView.getText());
            int selectionStart = Selection.getSelectionStart(charSequenceM118643m);
            int selectionEnd = Selection.getSelectionEnd(charSequenceM118643m);
            textView.setText(charSequenceM118643m);
            if (charSequenceM118643m instanceof Spannable) {
                rxe.m181554b((Spannable) charSequenceM118643m, selectionStart, selectionEnd);
            }
        }
    }

    public rxe(@NonNull TextView textView) {
        this.f161445a = textView;
    }

    /* JADX INFO: renamed from: b */
    public static void m181554b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final exe.AbstractC16712d m181555a() {
        if (this.f161446b == null) {
            this.f161446b = new C19809a(this.f161445a);
        }
        return this.f161446b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence filter(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) {
        /*
            r2 = this;
            android.widget.TextView r0 = r2.f161445a
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            goto L4a
        L9:
            l.exe r0 = p149l.exe.m118631a()
            int r0 = r0.m118636c()
            if (r0 == 0) goto L4b
            r1 = 1
            if (r0 == r1) goto L1a
            r4 = 3
            if (r0 == r4) goto L4b
            goto L4a
        L1a:
            if (r8 != 0) goto L2d
            if (r7 != 0) goto L2d
            int r6 = r6.length()
            if (r6 != 0) goto L2d
            android.widget.TextView r2 = r2.f161445a
            java.lang.CharSequence r2 = r2.getText()
            if (r3 != r2) goto L2d
            return r3
        L2d:
            if (r3 == 0) goto L4a
            if (r4 != 0) goto L38
            int r2 = r3.length()
            if (r5 != r2) goto L38
            goto L3c
        L38:
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
        L3c:
            l.exe r2 = p149l.exe.m118631a()
            r4 = 0
            int r5 = r3.length()
            java.lang.CharSequence r2 = r2.m118644n(r3, r4, r5)
            return r2
        L4a:
            return r3
        L4b:
            l.exe r4 = p149l.exe.m118631a()
            l.exe$d r2 = r2.m181555a()
            r4.m118647q(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.rxe.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
