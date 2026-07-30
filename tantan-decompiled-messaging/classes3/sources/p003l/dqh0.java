package p003l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dqh0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3630b(final EditText editText, boolean z, z3g0 z3g0Var) {
        final C0235a c0235a = new C0235a(z3g0Var);
        editText.addTextChangedListener(c0235a);
        z3g0Var.m9240b(h4g0.m4914a(new d30() { // from class: l.cqh0
            @Override // p003l.d30
            public final void call() {
                editText.removeTextChangedListener(c0235a);
            }
        }));
        if (editText.getText() == null || !z) {
            return;
        }
        z3g0Var.onNext(editText.getText());
    }

    /* JADX INFO: renamed from: c */
    public static C1099c<CharSequence> m3631c(final EditText editText, final boolean z) {
        return C1099c.create(new C1099c.a() { // from class: l.bqh0
            @Override // p003l.e30
            public final void call(Object obj) {
                dqh0.m3630b(editText, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.dqh0$a */
    public class C0235a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f3064a;

        public C0235a(z3g0 z3g0Var) {
            this.f3064a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f3064a.onNext(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
