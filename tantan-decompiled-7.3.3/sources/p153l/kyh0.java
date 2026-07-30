package p153l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class kyh0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m151970b(final EditText editText, boolean z, gcg0 gcg0Var) {
        final C18302a c18302a = new C18302a(gcg0Var);
        editText.addTextChangedListener(c18302a);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.jyh0
            @Override // p153l.x20
            public final void call() {
                editText.removeTextChangedListener(c18302a);
            }
        }));
        if (editText.getText() == null || !z) {
            return;
        }
        gcg0Var.onNext(editText.getText());
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<CharSequence> m151971c(final EditText editText, final boolean z) {
        return C22421c.create(new C22421c.a() { // from class: l.iyh0
            @Override // p153l.y20
            public final void call(Object obj) {
                kyh0.m151970b(editText, z, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.kyh0$a */
    public class C18302a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f129316a;

        public C18302a(gcg0 gcg0Var) {
            this.f129316a = gcg0Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f129316a.onNext(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
