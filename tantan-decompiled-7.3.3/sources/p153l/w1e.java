package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p151v.VEditText;

/* JADX INFO: loaded from: classes10.dex */
public class w1e {

    /* JADX INFO: renamed from: l.w1e$a */
    public class C20992a extends ur2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f186785a;

        public C20992a(String str) {
            this.f186785a = str;
        }

        @Override // p153l.e6m
        public String pageId() {
            return this.f186785a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m204398b(Act act, final String str) {
        act.dialog().m21534e0(jyb.m147507f0(act.getString(R$string.f18139d))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.v1e
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                l51.m152911q(str);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: c */
    public static l4g0 m204399c(String str, String str2) {
        return new l4g0(new C20992a(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public static C20993b m204400d(Context context) {
        return new C20993b(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m204401e(l4g0 l4g0Var) {
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m204402f(l4g0 l4g0Var) {
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: l.w1e$b */
    public static class C20993b {

        /* JADX INFO: renamed from: a */
        public final Context f186786a;

        /* JADX INFO: renamed from: b */
        public q1e f186787b;

        /* JADX INFO: renamed from: e */
        public int f186790e;

        /* JADX INFO: renamed from: p */
        public Dialog f186801p;

        /* JADX INFO: renamed from: q */
        public View f186802q;

        /* JADX INFO: renamed from: r */
        public VEditText f186803r;

        /* JADX INFO: renamed from: s */
        public TextView f186804s;

        /* JADX INFO: renamed from: u */
        public boolean f186806u;

        /* JADX INFO: renamed from: v */
        public x20 f186807v;

        /* JADX INFO: renamed from: c */
        public String f186788c = null;

        /* JADX INFO: renamed from: d */
        public int f186789d = 1;

        /* JADX INFO: renamed from: f */
        public String f186791f = null;

        /* JADX INFO: renamed from: g */
        public String f186792g = null;

        /* JADX INFO: renamed from: h */
        public String f186793h = null;

        /* JADX INFO: renamed from: i */
        public String f186794i = null;

        /* JADX INFO: renamed from: j */
        public boolean f186795j = false;

        /* JADX INFO: renamed from: k */
        public boolean f186796k = true;

        /* JADX INFO: renamed from: l */
        public y20<String> f186797l = null;

        /* JADX INFO: renamed from: m */
        public x20 f186798m = null;

        /* JADX INFO: renamed from: n */
        public x20 f186799n = null;

        /* JADX INFO: renamed from: o */
        public qcj<Spannable, String> f186800o = null;

        /* JADX INFO: renamed from: t */
        public int f186805t = 0;

        public C20993b(Context context) {
            this.f186786a = context;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m204416A() {
            this.f186803r.requestFocus();
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m204417B(View view, boolean z) {
            Dialog dialog = this.f186801p;
            if (dialog != null) {
                dialog.getWindow().setSoftInputMode(5);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m204418C() {
            this.f186801p.dismiss();
        }

        /* JADX INFO: renamed from: D */
        public C20993b m204419D(int i) {
            this.f186790e = i;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C20993b m204420E(int i) {
            this.f186789d = i;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C20993b m204421F(y20<String> y20Var) {
            this.f186797l = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public void m204422G() {
            this.f186801p.getWindow().setWindowAnimations(0);
            l51.m152887G(new Runnable() { // from class: l.g2e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101828a.m204418C();
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public C20993b m204423H(String str) {
            this.f186792g = str;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C20993b m204424I(String str) {
            this.f186788c = str;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C20993b m204425J(qcj<Spannable, String> qcjVar) {
            this.f186800o = qcjVar;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public Dialog m204426n() {
            return m204427o();
        }

        /* JADX INFO: renamed from: o */
        public final Dialog m204427o() {
            m204431s();
            Dialog.C4460e c4460eM21525V = ((Act) this.f186786a).dialog().m21548q(false).m21549q0(this.f186795j ? this.f186786a.getString(R$string.f18129b) : null, this.f186795j ? new Runnable() { // from class: l.x1e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192051a.m204432t();
                }
            } : null).m21519P(this.f186802q, false).m21525V(new DialogInterface.OnDismissListener() { // from class: l.y1e
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f197093a.m204433u(dialogInterface);
                }
            });
            String string = this.f186793h;
            if (string == null) {
                string = this.f186786a.getString(R$string.f18159h);
            }
            Dialog.C4460e c4460eM21559v0 = c4460eM21525V.m21559v0(string, new Runnable() { // from class: l.z1e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202512a.m204435w();
                }
            });
            String string2 = this.f186794i;
            if (string2 == null) {
                string2 = this.f186786a.getString(R$string.f18124a);
            }
            this.f186801p = c4460eM21559v0.m21543n0(string2, new Runnable() { // from class: l.a2e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67968a.m204437y();
                }
            }).m21506G0(this.f186788c).m21566z();
            if (this.f186806u) {
                this.f186803r.addTextChangedListener(new a());
                l51.m152887G(new Runnable() { // from class: l.b2e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74604a.m204438z();
                    }
                });
            }
            qcj<Spannable, String> qcjVar = this.f186800o;
            if (qcjVar != null) {
                this.f186804s.setText(qcjVar.call(this.f186803r.getText()));
                this.f186803r.addTextChangedListener(new b());
            }
            return this.f186801p;
        }

        /* JADX INFO: renamed from: p */
        public C20993b m204428p(boolean z) {
            this.f186806u = z;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C20993b m204429q(int i) {
            this.f186805t = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C20993b m204430r(String str) {
            this.f186791f = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final void m204431s() {
            l51.m152887G(new Runnable() { // from class: l.d2e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84778a.m204416A();
                }
            });
            View viewInflate = ((Act) this.f186786a).inflater().inflate(jec0.f120479y, (ViewGroup) null, false);
            this.f186802q = viewInflate;
            bnl0.m105554f0(viewInflate, qa00.m175859d(this.f186788c == null ? 24.0f : 4.0f));
            if (this.f186788c != null) {
                bnl0.m105569n(this.f186802q, qa00.m175859d(8.0f), 0, 0, 0);
            }
            this.f186803r = (VEditText) this.f186802q.findViewById(ycc0.f198404A);
            TextView textView = (TextView) this.f186802q.findViewById(ycc0.f198479r0);
            this.f186804s = textView;
            if (this.f186800o == null) {
                bnl0.m105574p0(textView);
                this.f186803r.setBackgroundDrawable(null);
            }
            int i = this.f186789d;
            if (i == 1) {
                this.f186803r.setSingleLine();
            } else if (i > 0) {
                this.f186803r.setMaxLines(i);
            }
            int i2 = this.f186790e;
            if (i2 > 0) {
                this.f186803r.setMaxLength(i2);
            }
            String str = this.f186791f;
            if (str != null) {
                this.f186803r.setHint(str);
                this.f186803r.setHintTextColor(this.f186786a.getResources().getColor(b9c0.f75568n));
            }
            if (this.f186805t != 0) {
                VEditText vEditText = this.f186803r;
                vEditText.setInputType(vEditText.getInputType() | this.f186805t);
            }
            String str2 = this.f186792g;
            if (str2 != null) {
                this.f186803r.setText(str2);
                try {
                    this.f186803r.setSelection(this.f186792g.length());
                } catch (Exception e) {
                    CrashHelper.m82479c(new Exception("initEditTextView ignored:" + e.getMessage(), e));
                }
            }
            this.f186803r.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.e2e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f91747a.m204417B(view, z);
                }
            });
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m204432t() {
            this.f186803r.setText("");
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m204433u(DialogInterface dialogInterface) {
            x20 x20Var = this.f186798m;
            if (x20Var != null) {
                x20Var.call();
            }
            Context context = this.f186786a;
            Act act = (Act) context;
            Objects.requireNonNull(act);
            l51.m152888H(context, new ob20(act), 100L);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m204434v(String str) {
            this.f186787b.m174884p(this.f186807v).m174877i(str);
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m204435w() {
            final String string = this.f186803r.getText().toString();
            ((Act) this.f186786a).hideInput(this.f186803r);
            if (!this.f186796k) {
                if (this.f186787b != null) {
                    l51.m152887G(new Runnable() { // from class: l.c2e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79468a.m204434v(string);
                        }
                    });
                    return;
                } else {
                    m204422G();
                    return;
                }
            }
            this.f186797l.call(string);
            q1e q1eVar = this.f186787b;
            if (q1eVar != null) {
                q1eVar.m174875g();
            } else {
                m204422G();
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m204436x() {
            this.f186787b.m174884p(this.f186807v).m174877i(new Object[0]);
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m204437y() {
            ((Act) this.f186786a).hideInput(this.f186803r);
            x20 x20Var = this.f186799n;
            if (x20Var != null) {
                x20Var.call();
            }
            q1e q1eVar = this.f186787b;
            if (q1eVar == null) {
                m204422G();
            } else if (this.f186796k) {
                q1eVar.m174875g();
            } else {
                l51.m152887G(new Runnable() { // from class: l.f2e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96869a.m204436x();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m204438z() {
            bnl0.m105591y(this.f186801p.m21464Z(), !TextUtils.isEmpty(this.f186803r.getText()));
        }

        /* JADX INFO: renamed from: l.w1e$b$a */
        public class a implements TextWatcher {
            public a() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                bnl0.m105591y(C20993b.this.f186801p.m21464Z(), !TextUtils.isEmpty(C20993b.this.f186803r.getText()));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: l.w1e$b$b */
        public class b implements TextWatcher {
            public b() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String strCall = C20993b.this.f186800o.call(editable);
                C20993b c20993b = C20993b.this;
                if (strCall != null) {
                    c20993b.f186804s.setText(strCall);
                    bnl0.m105591y(C20993b.this.f186801p.m21464Z(), false);
                } else {
                    c20993b.f186804s.setText("");
                    bnl0.m105591y(C20993b.this.f186801p.m21464Z(), true);
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
