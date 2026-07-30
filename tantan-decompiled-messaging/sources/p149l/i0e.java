package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p147v.VEditText;

/* JADX INFO: loaded from: classes11.dex */
public class i0e {

    /* JADX INFO: renamed from: l.i0e$a */
    public class C17450a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f110297a;

        public C17450a(String str) {
            this.f110297a = str;
        }

        @Override // p149l.n3m
        public String pageId() {
            return this.f110297a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m133793b(Act act, final String str) {
        act.dialog().m20535e0(vwb.m200324f0(act.getString(R$string.f17420d))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.h0e
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                e51.m114766q(str);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: c */
    public static cwf0 m133794c(String str, String str2) {
        return new cwf0(new C17450a(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public static C17451b m133795d(Context context) {
        return new C17451b(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m133796e(cwf0 cwf0Var) {
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m133797f(cwf0 cwf0Var) {
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    /* JADX INFO: renamed from: l.i0e$b */
    public static class C17451b {

        /* JADX INFO: renamed from: a */
        public final Context f110298a;

        /* JADX INFO: renamed from: b */
        public c0e f110299b;

        /* JADX INFO: renamed from: e */
        public int f110302e;

        /* JADX INFO: renamed from: p */
        public Dialog f110313p;

        /* JADX INFO: renamed from: q */
        public View f110314q;

        /* JADX INFO: renamed from: r */
        public VEditText f110315r;

        /* JADX INFO: renamed from: s */
        public TextView f110316s;

        /* JADX INFO: renamed from: u */
        public boolean f110318u;

        /* JADX INFO: renamed from: v */
        public d30 f110319v;

        /* JADX INFO: renamed from: c */
        public String f110300c = null;

        /* JADX INFO: renamed from: d */
        public int f110301d = 1;

        /* JADX INFO: renamed from: f */
        public String f110303f = null;

        /* JADX INFO: renamed from: g */
        public String f110304g = null;

        /* JADX INFO: renamed from: h */
        public String f110305h = null;

        /* JADX INFO: renamed from: i */
        public String f110306i = null;

        /* JADX INFO: renamed from: j */
        public boolean f110307j = false;

        /* JADX INFO: renamed from: k */
        public boolean f110308k = true;

        /* JADX INFO: renamed from: l */
        public e30<String> f110309l = null;

        /* JADX INFO: renamed from: m */
        public d30 f110310m = null;

        /* JADX INFO: renamed from: n */
        public d30 f110311n = null;

        /* JADX INFO: renamed from: o */
        public w9j<Spannable, String> f110312o = null;

        /* JADX INFO: renamed from: t */
        public int f110317t = 0;

        public C17451b(Context context) {
            this.f110298a = context;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m133811A() {
            this.f110315r.requestFocus();
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m133812B(View view, boolean z) {
            Dialog dialog = this.f110313p;
            if (dialog != null) {
                dialog.getWindow().setSoftInputMode(5);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m133813C() {
            this.f110313p.dismiss();
        }

        /* JADX INFO: renamed from: D */
        public C17451b m133814D(int i) {
            this.f110302e = i;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C17451b m133815E(int i) {
            this.f110301d = i;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C17451b m133816F(e30<String> e30Var) {
            this.f110309l = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public void m133817G() {
            this.f110313p.getWindow().setWindowAnimations(0);
            e51.m114742G(new Runnable() { // from class: l.s0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161767a.m133813C();
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public C17451b m133818H(String str) {
            this.f110304g = str;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C17451b m133819I(String str) {
            this.f110300c = str;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C17451b m133820J(w9j<Spannable, String> w9jVar) {
            this.f110312o = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public Dialog m133821n() {
            return m133822o();
        }

        /* JADX INFO: renamed from: o */
        public final Dialog m133822o() {
            m133826s();
            Dialog.C4309e c4309eM20526V = ((Act) this.f110298a).dialog().m20549q(false).m20550q0(this.f110307j ? this.f110298a.getString(R$string.f17410b) : null, this.f110307j ? new Runnable() { // from class: l.j0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115670a.m133827t();
                }
            } : null).m20520P(this.f110314q, false).m20526V(new DialogInterface.OnDismissListener() { // from class: l.k0e
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f120480a.m133828u(dialogInterface);
                }
            });
            String string = this.f110305h;
            if (string == null) {
                string = this.f110298a.getString(R$string.f17440h);
            }
            Dialog.C4309e c4309eM20560v0 = c4309eM20526V.m20560v0(string, new Runnable() { // from class: l.l0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f125498a.m133830w();
                }
            });
            String string2 = this.f110306i;
            if (string2 == null) {
                string2 = this.f110298a.getString(R$string.f17405a);
            }
            this.f110313p = c4309eM20560v0.m20544n0(string2, new Runnable() { // from class: l.m0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130733a.m133832y();
                }
            }).m20507G0(this.f110300c).m20567z();
            if (this.f110318u) {
                this.f110315r.addTextChangedListener(new a());
                e51.m114742G(new Runnable() { // from class: l.n0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f136537a.m133833z();
                    }
                });
            }
            w9j<Spannable, String> w9jVar = this.f110312o;
            if (w9jVar != null) {
                this.f110316s.setText(w9jVar.call(this.f110315r.getText()));
                this.f110315r.addTextChangedListener(new b());
            }
            return this.f110313p;
        }

        /* JADX INFO: renamed from: p */
        public C17451b m133823p(boolean z) {
            this.f110318u = z;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C17451b m133824q(int i) {
            this.f110317t = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C17451b m133825r(String str) {
            this.f110303f = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public final void m133826s() {
            e51.m114742G(new Runnable() { // from class: l.p0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f146588a.m133811A();
                }
            });
            View viewInflate = ((Act) this.f110298a).inflater().inflate(e6c0.f89566y, (ViewGroup) null, false);
            this.f110314q = viewInflate;
            xdl0.m208374f0(viewInflate, t100.m186890d(this.f110300c == null ? 24.0f : 4.0f));
            if (this.f110300c != null) {
                xdl0.m208389n(this.f110314q, t100.m186890d(8.0f), 0, 0, 0);
            }
            this.f110315r = (VEditText) this.f110314q.findViewById(s4c0.f162283A);
            TextView textView = (TextView) this.f110314q.findViewById(s4c0.f162358r0);
            this.f110316s = textView;
            if (this.f110312o == null) {
                xdl0.m208394p0(textView);
                this.f110315r.setBackgroundDrawable(null);
            }
            int i = this.f110301d;
            if (i == 1) {
                this.f110315r.setSingleLine();
            } else if (i > 0) {
                this.f110315r.setMaxLines(i);
            }
            int i2 = this.f110302e;
            if (i2 > 0) {
                this.f110315r.setMaxLength(i2);
            }
            String str = this.f110303f;
            if (str != null) {
                this.f110315r.setHint(str);
                this.f110315r.setHintTextColor(this.f110298a.getResources().getColor(v0c0.f179107n));
            }
            if (this.f110317t != 0) {
                VEditText vEditText = this.f110315r;
                vEditText.setInputType(vEditText.getInputType() | this.f110317t);
            }
            String str2 = this.f110304g;
            if (str2 != null) {
                this.f110315r.setText(str2);
                try {
                    this.f110315r.setSelection(this.f110304g.length());
                } catch (Exception e) {
                    CrashHelper.m81296c(new Exception("initEditTextView ignored:" + e.getMessage(), e));
                }
            }
            this.f110315r.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.q0e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f152048a.m133812B(view, z);
                }
            });
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m133827t() {
            this.f110315r.setText("");
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m133828u(DialogInterface dialogInterface) {
            d30 d30Var = this.f110310m;
            if (d30Var != null) {
                d30Var.call();
            }
            Context context = this.f110298a;
            Act act = (Act) context;
            Objects.requireNonNull(act);
            e51.m114743H(context, new g320(act), 100L);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m133829v(String str) {
            this.f110299b.m104745p(this.f110319v).m104738i(str);
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m133830w() {
            final String string = this.f110315r.getText().toString();
            ((Act) this.f110298a).hideInput(this.f110315r);
            if (!this.f110308k) {
                if (this.f110299b != null) {
                    e51.m114742G(new Runnable() { // from class: l.o0e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f141315a.m133829v(string);
                        }
                    });
                    return;
                } else {
                    m133817G();
                    return;
                }
            }
            this.f110309l.call(string);
            c0e c0eVar = this.f110299b;
            if (c0eVar != null) {
                c0eVar.m104736g();
            } else {
                m133817G();
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m133831x() {
            this.f110299b.m104745p(this.f110319v).m104738i(new Object[0]);
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m133832y() {
            ((Act) this.f110298a).hideInput(this.f110315r);
            d30 d30Var = this.f110311n;
            if (d30Var != null) {
                d30Var.call();
            }
            c0e c0eVar = this.f110299b;
            if (c0eVar == null) {
                m133817G();
            } else if (this.f110308k) {
                c0eVar.m104736g();
            } else {
                e51.m114742G(new Runnable() { // from class: l.r0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f157165a.m133831x();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m133833z() {
            xdl0.m208411y(this.f110313p.m20465Z(), !TextUtils.isEmpty(this.f110315r.getText()));
        }

        /* JADX INFO: renamed from: l.i0e$b$a */
        public class a implements TextWatcher {
            public a() {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                xdl0.m208411y(C17451b.this.f110313p.m20465Z(), !TextUtils.isEmpty(C17451b.this.f110315r.getText()));
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
                String strCall = C17451b.this.f110312o.call(editable);
                C17451b c17451b = C17451b.this;
                if (strCall != null) {
                    c17451b.f110316s.setText(strCall);
                    xdl0.m208411y(C17451b.this.f110313p.m20465Z(), false);
                } else {
                    c17451b.f110316s.setText("");
                    xdl0.m208411y(C17451b.this.f110313p.m20465Z(), true);
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
