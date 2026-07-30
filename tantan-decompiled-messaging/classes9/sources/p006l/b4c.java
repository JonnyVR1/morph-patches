package p006l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.datastorage.DataAndStorageAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.c4c;
import l.cwf0;
import l.d30;
import l.e9n;
import l.f30;
import l.gl5;
import l.i0e;
import l.lsi0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b4c implements s7m<q3c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f8713a;

    /* JADX INFO: renamed from: b */
    public VText f8714b;

    /* JADX INFO: renamed from: c */
    public VFrame f8715c;

    /* JADX INFO: renamed from: d */
    public VText f8716d;

    /* JADX INFO: renamed from: e */
    public VFrame f8717e;

    /* JADX INFO: renamed from: f */
    public VText f8718f;

    /* JADX INFO: renamed from: g */
    public VFrame f8719g;

    /* JADX INFO: renamed from: h */
    public VText f8720h;

    /* JADX INFO: renamed from: i */
    public VText f8721i;

    /* JADX INFO: renamed from: j */
    public VFrame f8722j;

    /* JADX INFO: renamed from: k */
    public String[] f8723k;

    /* JADX INFO: renamed from: l */
    public Dialog f8724l;

    /* JADX INFO: renamed from: m */
    public DataAndStorageAct f8725m;

    /* JADX INFO: renamed from: n */
    public String[] f8726n = null;

    /* JADX INFO: renamed from: o */
    public q3c f8727o;

    public b4c(DataAndStorageAct dataAndStorageAct) {
        this.f8725m = dataAndStorageAct;
        m12551v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m12520C(View view) {
        act().dialog().E0(R$string.f1759Gn).D(R$string.f1729Fn).k0(R$string.f2397c).t0(R$string.f2489f, new Runnable() { // from class: l.z3c
            @Override // java.lang.Runnable
            public final void run() {
                this.f28605a.m12536B();
            }
        }).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m12521E(View view) {
        m12542J(m12549s());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: K */
    private void m12522K() {
        Act act = this.f8725m;
        Dialog dialogProgress = Act.progress(act, act.getString(R$string.f1831J5), (String) null);
        this.f8724l = dialogProgress;
        dialogProgress.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m12533x(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m12534z(View view) {
        view.requestFocus();
        act().dialog().E0(R$string.f2149Tn).e0(vwb.f0(this.f8723k)).h0(!((Boolean) gl5.b.get()).booleanValue() ? 1 : 0, new com.p1.mobile.android.app.Dialog.g() { // from class: l.y3c
            /* JADX INFO: renamed from: a */
            public final void m28056a(com.p1.mobile.android.app.Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f27998a.m12553y(dialog, view2, i, charSequence);
            }
        }).k0(R$string.f2397c).z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m12535A() {
        m12522K();
        this.f8727o.m21945o0();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m12536B() {
        act().post(new Runnable() { // from class: l.a4c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8102a.m12535A();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12537C0() {
        return this.f8725m;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12538F(String str, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            lsi0.h(R$string.f1684E8);
        } else {
            this.f8727o.m21941D0(str, d30Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m12539G(int i) {
        this.f8716d.setText(this.f8726n[i]);
    }

    /* JADX INFO: renamed from: H */
    public void m12540H(String str) {
        this.f8713a.setTitle(act().getString(R$string.f1789Hn));
        this.f8713a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.r3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20283a.m12533x(view);
            }
        });
        this.f8723k = new String[]{act().getResources().getString(R$string.f2179Un), act().getResources().getString(R$string.f2209Vn)};
        VText vText = this.f8718f;
        boolean zBooleanValue = ((Boolean) gl5.b.get()).booleanValue();
        String[] strArr = this.f8723k;
        vText.setText(zBooleanValue ? strArr[0] : strArr[1]);
        this.f8717e.setOnClickListener(new View.OnClickListener() { // from class: l.s3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21003a.m12534z(view);
            }
        });
        m12541I(str);
        this.f8722j.setOnClickListener(new View.OnClickListener() { // from class: l.t3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21862a.m12520C(view);
            }
        });
        m12539G(m12549s());
        this.f8715c.setOnClickListener(new View.OnClickListener() { // from class: l.u3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22454a.m12521E(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void m12541I(String str) {
        this.f8721i.setText(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m12542J(int i) {
        act().dialog().E0(R$string.f2882ro).e0(vwb.f0(this.f8726n)).h0(i, this.f8727o.m21946p0(i)).k0(R$string.f2397c).z0();
    }

    /* JADX INFO: renamed from: L */
    public void m12543L() {
        e9n.B(act(), act().string(R$string.f1801I5), act().string(R$string.f1711F5), act().string(R$string.f1681E5), act().string(R$string.f1732Fq), new f30() { // from class: l.v3c
            public final void call(Object obj, Object obj2) {
                this.f24113a.m12538F((String) obj, (d30) obj2);
            }
        });
    }

    public Act act() {
        return this.f8725m;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12545m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m12545m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c4c.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m12544i1(q3c q3cVar) {
        this.f8727o = q3cVar;
    }

    /* JADX INFO: renamed from: p */
    public void m12547p(boolean z) {
        xdl0.M(this.f8719g, z);
        zvf0.x("e_download_data_button", "p_data_and_cache_settings_view");
        xdl0.E0(this.f8719g, new View.OnClickListener() { // from class: l.w3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24911a.m12552w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m12548q() {
        final cwf0 cwf0VarC = i0e.c("p_download_data_requested_recently_view", "emailInvalidTipsShow");
        act().dialog().F(act().string(R$string.f1771H5)).u0(act().string(R$string.f3065xr)).B(true).V(new DialogInterface.OnDismissListener() { // from class: l.x3c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z().show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: s */
    public final int m12549s() {
        if (((Boolean) gl5.a.get()).booleanValue()) {
            return !((Boolean) gl5.c.get()).booleanValue() ? 1 : 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: u */
    public void m12550u() {
        if (NullChecker.a(this.f8724l)) {
            this.f8724l.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m12551v() {
        this.f8726n = new String[]{this.f8725m.getResources().getString(R$string.f2912so), this.f8725m.getResources().getString(R$string.f2972uo), this.f8725m.getResources().getString(R$string.f2942to)};
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m12552w(View view) {
        zvf0.r("e_download_data_button", "p_data_and_cache_settings_view");
        this.f8727o.m21944n0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m12553y(com.p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
        boolean z = i == 0;
        if (z != ((Boolean) gl5.b.get()).booleanValue()) {
            if (z) {
                gl5.b.put(Boolean.TRUE);
                this.f8727o.m21953z0();
                this.f8718f.setText(this.f8723k[0]);
            } else {
                gl5.b.put(Boolean.FALSE);
                if (!ConnectivityReceiver.l()) {
                    this.f8727o.m21939A0();
                }
                this.f8718f.setText(this.f8723k[1]);
            }
            gl5.b.put(Boolean.valueOf(z));
        }
    }

    public void destroy() {
    }
}
