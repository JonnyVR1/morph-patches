package p153l;

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
public final class lze implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f134181a;

    /* JADX INFO: renamed from: b */
    public iye.AbstractC17824d f134182b;

    /* JADX INFO: renamed from: c */
    public int f134183c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d */
    public int f134184d = 0;

    /* JADX INFO: renamed from: l.lze$a */
    public static class C18510a extends iye.AbstractC17824d {

        /* JADX INFO: renamed from: a */
        public final Reference<EditText> f134185a;

        public C18510a(EditText editText) {
            this.f134185a = new WeakReference(editText);
        }

        @Override // p153l.iye.AbstractC17824d
        /* JADX INFO: renamed from: b */
        public void mo142651b() {
            super.mo142651b();
            EditText editText = this.f134185a.get();
            if (editText == null || !editText.isAttachedToWindow()) {
                return;
            }
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            iye.m142622a().m142634m(editableText);
            vye.m203991b(editableText, selectionStart, selectionEnd);
        }
    }

    public lze(EditText editText) {
        this.f134181a = editText;
    }

    /* JADX INFO: renamed from: a */
    public final iye.AbstractC17824d m156430a() {
        if (this.f134182b == null) {
            this.f134182b = new C18510a(this.f134181a);
        }
        return this.f134182b;
    }

    /* JADX INFO: renamed from: b */
    public void m156431b(int i) {
        this.f134184d = i;
    }

    /* JADX INFO: renamed from: c */
    public void m156432c(int i) {
        this.f134183c = i;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f134181a.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM142627c = iye.m142622a().m142627c();
            if (iM142627c != 0) {
                if (iM142627c == 1) {
                    iye.m142622a().m142637p((Spannable) charSequence, i, i + i3, this.f134183c, this.f134184d);
                    return;
                } else if (iM142627c != 3) {
                    return;
                }
            }
            iye.m142622a().m142638q(m156430a());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
