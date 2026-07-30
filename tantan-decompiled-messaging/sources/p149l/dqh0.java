package p149l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class dqh0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m113069b(final EditText editText, boolean z, z3g0 z3g0Var) {
        final C16434a c16434a = new C16434a(z3g0Var);
        editText.addTextChangedListener(c16434a);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.cqh0
            @Override // p149l.d30
            public final void call() {
                editText.removeTextChangedListener(c16434a);
            }
        }));
        if (editText.getText() == null || !z) {
            return;
        }
        z3g0Var.onNext(editText.getText());
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<CharSequence> m113070c(final EditText editText, final boolean z) {
        return C22306c.create(new C22306c.a() { // from class: l.bqh0
            @Override // p149l.e30
            public final void call(Object obj) {
                dqh0.m113069b(editText, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.dqh0$a */
    public class C16434a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f87424a;

        public C16434a(z3g0 z3g0Var) {
            this.f87424a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f87424a.onNext(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
