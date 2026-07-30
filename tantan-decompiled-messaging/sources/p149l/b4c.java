package p149l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.datastorage.DataAndStorageAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class b4c implements s7m<q3c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f73326a;

    /* JADX INFO: renamed from: b */
    public VText f73327b;

    /* JADX INFO: renamed from: c */
    public VFrame f73328c;

    /* JADX INFO: renamed from: d */
    public VText f73329d;

    /* JADX INFO: renamed from: e */
    public VFrame f73330e;

    /* JADX INFO: renamed from: f */
    public VText f73331f;

    /* JADX INFO: renamed from: g */
    public VFrame f73332g;

    /* JADX INFO: renamed from: h */
    public VText f73333h;

    /* JADX INFO: renamed from: i */
    public VText f73334i;

    /* JADX INFO: renamed from: j */
    public VFrame f73335j;

    /* JADX INFO: renamed from: k */
    public String[] f73336k;

    /* JADX INFO: renamed from: l */
    public Dialog f73337l;

    /* JADX INFO: renamed from: m */
    public DataAndStorageAct f73338m;

    /* JADX INFO: renamed from: n */
    public String[] f73339n = null;

    /* JADX INFO: renamed from: o */
    public q3c f73340o;

    public b4c(DataAndStorageAct dataAndStorageAct) {
        this.f73338m = dataAndStorageAct;
        m100246v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m100217C(View view) {
        act().dialog().m20503E0(R$string.f17770Gn).m20500D(R$string.f17740Fn).m20541k0(R$string.f18408c).m20556t0(R$string.f18500f, new Runnable() { // from class: l.z3c
            @Override // java.lang.Runnable
            public final void run() {
                this.f201336a.m100233B();
            }
        }).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m100218E(View view) {
        m100238J(m100244s());
    }

    /* JADX INFO: renamed from: K */
    private void m100219K() {
        DataAndStorageAct dataAndStorageAct = this.f73338m;
        Dialog dialogProgress = Act.progress(dataAndStorageAct, dataAndStorageAct.getString(R$string.f17842J5), null);
        this.f73337l = dialogProgress;
        dialogProgress.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m100230x(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m100231z(View view) {
        view.requestFocus();
        act().dialog().m20503E0(R$string.f18160Tn).m20535e0(vwb.m200324f0(this.f73336k)).m20538h0(!gl5.f103294b.get().booleanValue() ? 1 : 0, new com.p046p1.mobile.android.app.Dialog.InterfaceC4311g() { // from class: l.y3c
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(com.p046p1.mobile.android.app.Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f195790a.m100248y(dialog, view2, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m100232A() {
        m100219K();
        this.f73340o.m172756o0();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m100233B() {
        act().post(new Runnable() { // from class: l.a4c
            @Override // java.lang.Runnable
            public final void run() {
                this.f67491a.m100232A();
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f73338m;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m100234F(String str, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            lsi0.m151578h(R$string.f17695E8);
        } else {
            this.f73340o.m172753D0(str, d30Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m100235G(int i) {
        this.f73329d.setText(this.f73339n[i]);
    }

    /* JADX INFO: renamed from: H */
    public void m100236H(String str) {
        this.f73326a.setTitle(act().getString(R$string.f17800Hn));
        this.f73326a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.r3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157519a.m100230x(view);
            }
        });
        this.f73336k = new String[]{act().getResources().getString(R$string.f18190Un), act().getResources().getString(R$string.f18220Vn)};
        VText vText = this.f73331f;
        boolean zBooleanValue = gl5.f103294b.get().booleanValue();
        String[] strArr = this.f73336k;
        vText.setText(zBooleanValue ? strArr[0] : strArr[1]);
        this.f73330e.setOnClickListener(new View.OnClickListener() { // from class: l.s3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162095a.m100231z(view);
            }
        });
        m100237I(str);
        this.f73335j.setOnClickListener(new View.OnClickListener() { // from class: l.t3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167609a.m100217C(view);
            }
        });
        m100235G(m100244s());
        this.f73328c.setOnClickListener(new View.OnClickListener() { // from class: l.u3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173590a.m100218E(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void m100237I(String str) {
        this.f73334i.setText(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m100238J(int i) {
        act().dialog().m20503E0(R$string.f18893ro).m20535e0(vwb.m200324f0(this.f73339n)).m20538h0(i, this.f73340o.m172757p0(i)).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: L */
    public void m100239L() {
        e9n.m115353B(act(), act().string(R$string.f17812I5), act().string(R$string.f17722F5), act().string(R$string.f17692E5), act().string(R$string.f17743Fq), new f30() { // from class: l.v3c
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f179761a.m100234F((String) obj, (d30) obj2);
            }
        });
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f73338m;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m100240m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m100240m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c4c.m105212b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q3c q3cVar) {
        this.f73340o = q3cVar;
    }

    /* JADX INFO: renamed from: p */
    public void m100242p(boolean z) {
        xdl0.m208344M(this.f73332g, z);
        zvf0.m220402x("e_download_data_button", "p_data_and_cache_settings_view");
        xdl0.m208329E0(this.f73332g, new View.OnClickListener() { // from class: l.w3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184326a.m100247w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m100243q() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_download_data_requested_recently_view", "emailInvalidTipsShow");
        act().dialog().m20504F(act().string(R$string.f17782H5)).m20558u0(act().string(R$string.f19076xr)).m20496B(true).m20526V(new DialogInterface.OnDismissListener() { // from class: l.x3c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z().show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: s */
    public final int m100244s() {
        if (gl5.f103293a.get().booleanValue()) {
            return !gl5.f103295c.get().booleanValue() ? 1 : 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: u */
    public void m100245u() {
        if (NullChecker.m81303a(this.f73337l)) {
            this.f73337l.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m100246v() {
        this.f73339n = new String[]{this.f73338m.getResources().getString(R$string.f18923so), this.f73338m.getResources().getString(R$string.f18983uo), this.f73338m.getResources().getString(R$string.f18953to)};
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m100247w(View view) {
        zvf0.m220396r("e_download_data_button", "p_data_and_cache_settings_view");
        this.f73340o.m172755n0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m100248y(com.p046p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
        boolean z = i == 0;
        if (z != gl5.f103294b.get().booleanValue()) {
            if (z) {
                gl5.f103294b.put(Boolean.TRUE);
                this.f73340o.m172764z0();
                this.f73331f.setText(this.f73336k[0]);
            } else {
                gl5.f103294b.put(Boolean.FALSE);
                if (!ConnectivityReceiver.m81289l()) {
                    this.f73340o.m172751A0();
                }
                this.f73331f.setText(this.f73336k[1]);
            }
            gl5.f103294b.put(Boolean.valueOf(z));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
