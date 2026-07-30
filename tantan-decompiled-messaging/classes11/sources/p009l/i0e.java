package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import l.c0e;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.e6c0;
import l.er2;
import l.g320;
import l.s4c0;
import l.t100;
import l.v0c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i0e {

    /* JADX INFO: renamed from: l.i0e$a */
    public class C0944a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14325a;

        public C0944a(String str) {
            this.f14325a = str;
        }

        public String pageId() {
            return this.f14325a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16061b(Act act, final String str) {
        act.dialog().e0(vwb.f0(new String[]{act.getString(R.string.d)})).g0(new Dialog.g() { // from class: l.h0e
            /* JADX INFO: renamed from: a */
            public final void m15373a(Dialog dialog, View view, int i, CharSequence charSequence) {
                e51.q(str);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: c */
    public static cwf0 m16062c(String str, String str2) {
        return new cwf0(new C0944a(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public static C0945b m16063d(Context context) {
        return new C0945b(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m16064e(cwf0 cwf0Var) {
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16065f(cwf0 cwf0Var) {
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    /* JADX INFO: renamed from: l.i0e$b */
    public static class C0945b {

        /* JADX INFO: renamed from: a */
        public final Context f14326a;

        /* JADX INFO: renamed from: b */
        public c0e f14327b;

        /* JADX INFO: renamed from: e */
        public int f14330e;

        /* JADX INFO: renamed from: p */
        public Dialog f14341p;

        /* JADX INFO: renamed from: q */
        public View f14342q;

        /* JADX INFO: renamed from: r */
        public VEditText f14343r;

        /* JADX INFO: renamed from: s */
        public TextView f14344s;

        /* JADX INFO: renamed from: u */
        public boolean f14346u;

        /* JADX INFO: renamed from: v */
        public d30 f14347v;

        /* JADX INFO: renamed from: c */
        public String f14328c = null;

        /* JADX INFO: renamed from: d */
        public int f14329d = 1;

        /* JADX INFO: renamed from: f */
        public String f14331f = null;

        /* JADX INFO: renamed from: g */
        public String f14332g = null;

        /* JADX INFO: renamed from: h */
        public String f14333h = null;

        /* JADX INFO: renamed from: i */
        public String f14334i = null;

        /* JADX INFO: renamed from: j */
        public boolean f14335j = false;

        /* JADX INFO: renamed from: k */
        public boolean f14336k = true;

        /* JADX INFO: renamed from: l */
        public e30<String> f14337l = null;

        /* JADX INFO: renamed from: m */
        public d30 f14338m = null;

        /* JADX INFO: renamed from: n */
        public d30 f14339n = null;

        /* JADX INFO: renamed from: o */
        public w9j<Spannable, String> f14340o = null;

        /* JADX INFO: renamed from: t */
        public int f14345t = 0;

        public C0945b(Context context) {
            this.f14326a = context;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m16079A() {
            this.f14343r.requestFocus();
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m16080B(View view, boolean z) {
            Dialog dialog = this.f14341p;
            if (dialog != null) {
                dialog.getWindow().setSoftInputMode(5);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m16081C() {
            this.f14341p.dismiss();
        }

        /* JADX INFO: renamed from: D */
        public C0945b m16082D(int i) {
            this.f14330e = i;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C0945b m16083E(int i) {
            this.f14329d = i;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C0945b m16084F(e30<String> e30Var) {
            this.f14337l = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public void m16085G() {
            this.f14341p.getWindow().setWindowAnimations(0);
            e51.G(new Runnable() { // from class: l.s0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20065a.m16081C();
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public C0945b m16086H(String str) {
            this.f14332g = str;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C0945b m16087I(String str) {
            this.f14328c = str;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C0945b m16088J(w9j<Spannable, String> w9jVar) {
            this.f14340o = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public Dialog m16089n() {
            return m16090o();
        }

        /* JADX INFO: renamed from: o */
        public final Dialog m16090o() {
            m16094s();
            Dialog.e eVarV = this.f14326a.dialog().q(false).q0(this.f14335j ? this.f14326a.getString(R.string.b) : null, this.f14335j ? new Runnable() { // from class: l.j0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14882a.m16095t();
                }
            } : null).P(this.f14342q, false).V(new DialogInterface.OnDismissListener() { // from class: l.k0e
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f15376a.m16096u(dialogInterface);
                }
            });
            String string = this.f14333h;
            if (string == null) {
                string = this.f14326a.getString(R.string.h);
            }
            Dialog.e eVarV0 = eVarV.v0(string, new Runnable() { // from class: l.l0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15903a.m16098w();
                }
            });
            String string2 = this.f14334i;
            if (string2 == null) {
                string2 = this.f14326a.getString(R.string.a);
            }
            this.f14341p = eVarV0.n0(string2, new Runnable() { // from class: l.m0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16476a.m16100y();
                }
            }).G0(this.f14328c).z();
            if (this.f14346u) {
                this.f14343r.addTextChangedListener(new a());
                e51.G(new Runnable() { // from class: l.n0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17175a.m16101z();
                    }
                });
            }
            w9j<Spannable, String> w9jVar = this.f14340o;
            if (w9jVar != null) {
                this.f14344s.setText((String) w9jVar.call(this.f14343r.getText()));
                this.f14343r.addTextChangedListener(new b());
            }
            return this.f14341p;
        }

        /* JADX INFO: renamed from: p */
        public C0945b m16091p(boolean z) {
            this.f14346u = z;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0945b m16092q(int i) {
            this.f14345t = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0945b m16093r(String str) {
            this.f14331f = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final void m16094s() {
            e51.G(new Runnable() { // from class: l.p0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18306a.m16079A();
                }
            });
            View viewInflate = this.f14326a.inflater().inflate(e6c0.y, (ViewGroup) null, false);
            this.f14342q = viewInflate;
            xdl0.f0(viewInflate, t100.d(this.f14328c == null ? 24.0f : 4.0f));
            if (this.f14328c != null) {
                xdl0.n(this.f14342q, t100.d(8.0f), 0, 0, 0);
            }
            this.f14343r = this.f14342q.findViewById(s4c0.A);
            TextView textView = (TextView) this.f14342q.findViewById(s4c0.r0);
            this.f14344s = textView;
            if (this.f14340o == null) {
                xdl0.p0(textView);
                this.f14343r.setBackgroundDrawable(null);
            }
            int i = this.f14329d;
            if (i == 1) {
                this.f14343r.setSingleLine();
            } else if (i > 0) {
                this.f14343r.setMaxLines(i);
            }
            int i2 = this.f14330e;
            if (i2 > 0) {
                this.f14343r.setMaxLength(i2);
            }
            String str = this.f14331f;
            if (str != null) {
                this.f14343r.setHint(str);
                this.f14343r.setHintTextColor(this.f14326a.getResources().getColor(v0c0.n));
            }
            if (this.f14345t != 0) {
                VEditText vEditText = this.f14343r;
                vEditText.setInputType(vEditText.getInputType() | this.f14345t);
            }
            String str2 = this.f14332g;
            if (str2 != null) {
                this.f14343r.setText(str2);
                try {
                    this.f14343r.setSelection(this.f14332g.length());
                } catch (Exception e) {
                    CrashHelper.c(new Exception("initEditTextView ignored:" + e.getMessage(), e));
                }
            }
            this.f14343r.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.q0e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f18983a.m16080B(view, z);
                }
            });
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m16095t() {
            this.f14343r.setText("");
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m16096u(DialogInterface dialogInterface) {
            d30 d30Var = this.f14338m;
            if (d30Var != null) {
                d30Var.call();
            }
            Act act = this.f14326a;
            Act act2 = act;
            Objects.requireNonNull(act2);
            e51.H(act, new g320(act2), 100L);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m16097v(String str) {
            this.f14327b.p(this.f14347v).i(new Object[]{str});
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m16098w() {
            final String string = this.f14343r.getText().toString();
            this.f14326a.hideInput(this.f14343r);
            if (!this.f14336k) {
                if (this.f14327b != null) {
                    e51.G(new Runnable() { // from class: l.o0e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17792a.m16097v(string);
                        }
                    });
                    return;
                } else {
                    m16085G();
                    return;
                }
            }
            this.f14337l.call(string);
            c0e c0eVar = this.f14327b;
            if (c0eVar != null) {
                c0eVar.g();
            } else {
                m16085G();
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m16099x() {
            this.f14327b.p(this.f14347v).i(new Object[0]);
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m16100y() {
            this.f14326a.hideInput(this.f14343r);
            d30 d30Var = this.f14339n;
            if (d30Var != null) {
                d30Var.call();
            }
            c0e c0eVar = this.f14327b;
            if (c0eVar == null) {
                m16085G();
            } else if (this.f14336k) {
                c0eVar.g();
            } else {
                e51.G(new Runnable() { // from class: l.r0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19602a.m16099x();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m16101z() {
            xdl0.y(this.f14341p.Z(), !TextUtils.isEmpty(this.f14343r.getText()));
        }

        /* JADX INFO: renamed from: l.i0e$b$a */
        public class a implements TextWatcher {
            public a() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                xdl0.y(C0945b.this.f14341p.Z(), !TextUtils.isEmpty(C0945b.this.f14343r.getText()));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: l.i0e$b$b */
        public class b implements TextWatcher {
            public b() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String str = (String) C0945b.this.f14340o.call(editable);
                C0945b c0945b = C0945b.this;
                if (str != null) {
                    c0945b.f14344s.setText(str);
                    xdl0.y(C0945b.this.f14341p.Z(), false);
                } else {
                    c0945b.f14344s.setText("");
                    xdl0.y(C0945b.this.f14341p.Z(), true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }
    }
}
