package p149l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class hye implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f110099a;

    /* JADX INFO: renamed from: b */
    public exe.AbstractC16712d f110100b;

    /* JADX INFO: renamed from: c */
    public int f110101c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d */
    public int f110102d = 0;

    /* JADX INFO: renamed from: l.hye$a */
    public static class C17436a extends exe.AbstractC16712d {

        /* JADX INFO: renamed from: a */
        public final Reference<EditText> f110103a;

        public C17436a(EditText editText) {
            this.f110103a = new WeakReference(editText);
        }

        @Override // p149l.exe.AbstractC16712d
        /* JADX INFO: renamed from: b */
        public void mo118660b() {
            super.mo118660b();
            EditText editText = this.f110103a.get();
            if (editText == null || !editText.isAttachedToWindow()) {
                return;
            }
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            exe.m118631a().m118643m(editableText);
            rxe.m181554b(editableText, selectionStart, selectionEnd);
        }
    }

    public hye(EditText editText) {
        this.f110099a = editText;
    }

    /* JADX INFO: renamed from: a */
    public final exe.AbstractC16712d m133607a() {
        if (this.f110100b == null) {
            this.f110100b = new C17436a(this.f110099a);
        }
        return this.f110100b;
    }

    /* JADX INFO: renamed from: b */
    public void m133608b(int i) {
        this.f110102d = i;
    }

    /* JADX INFO: renamed from: c */
    public void m133609c(int i) {
        this.f110101c = i;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f110099a.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM118636c = exe.m118631a().m118636c();
            if (iM118636c != 0) {
                if (iM118636c == 1) {
                    exe.m118631a().m118646p((Spannable) charSequence, i, i + i3, this.f110101c, this.f110102d);
                    return;
                } else if (iM118636c != 3) {
                    return;
                }
            }
            exe.m118631a().m118647q(m133607a());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
