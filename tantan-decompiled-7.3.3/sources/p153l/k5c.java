package p153l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.datastorage.DataAndStorageAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class k5c implements iam<z4c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f123997a;

    /* JADX INFO: renamed from: b */
    public VText f123998b;

    /* JADX INFO: renamed from: c */
    public VFrame f123999c;

    /* JADX INFO: renamed from: d */
    public VText f124000d;

    /* JADX INFO: renamed from: e */
    public VFrame f124001e;

    /* JADX INFO: renamed from: f */
    public VText f124002f;

    /* JADX INFO: renamed from: g */
    public VFrame f124003g;

    /* JADX INFO: renamed from: h */
    public VText f124004h;

    /* JADX INFO: renamed from: i */
    public VText f124005i;

    /* JADX INFO: renamed from: j */
    public VFrame f124006j;

    /* JADX INFO: renamed from: k */
    public String[] f124007k;

    /* JADX INFO: renamed from: l */
    public Dialog f124008l;

    /* JADX INFO: renamed from: m */
    public DataAndStorageAct f124009m;

    /* JADX INFO: renamed from: n */
    public String[] f124010n = null;

    /* JADX INFO: renamed from: o */
    public z4c f124011o;

    public k5c(DataAndStorageAct dataAndStorageAct) {
        this.f124009m = dataAndStorageAct;
        m148347v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m148318C(View view) {
        act().dialog().m21502E0(R$string.f19163co).m21499D(R$string.f19132bo).m21540k0(R$string.f19138c).m21555t0(R$string.f19230f, new Runnable() { // from class: l.i5c
            @Override // java.lang.Runnable
            public final void run() {
                this.f113026a.m148334B();
            }
        }).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m148319E(View view) {
        m148339J(m148345s());
    }

    /* JADX INFO: renamed from: K */
    private void m148320K() {
        DataAndStorageAct dataAndStorageAct = this.f124009m;
        Dialog dialogProgress = Act.progress(dataAndStorageAct, dataAndStorageAct.getString(R$string.f18632L5), null);
        this.f124008l = dialogProgress;
        dialogProgress.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m148331x(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m148332z(View view) {
        view.requestFocus();
        act().dialog().m21502E0(R$string.f19594qo).m21534e0(jyb.m147507f0(this.f124007k)).m21537h0(!jm5.f121639b.get().booleanValue() ? 1 : 0, new com.p051p1.mobile.android.app.Dialog.InterfaceC4462g() { // from class: l.h5c
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(com.p051p1.mobile.android.app.Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f107935a.m148349y(dialog, view2, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m148333A() {
        m148320K();
        this.f124011o.m218564o0();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m148334B() {
        act().post(new Runnable() { // from class: l.j5c
            @Override // java.lang.Runnable
            public final void run() {
                this.f118413a.m148333A();
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124009m;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m148335F(String str, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165634h(R$string.f18480G8);
        } else {
            this.f124011o.m218561D0(str, x20Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m148336G(int i) {
        this.f124000d.setText(this.f124010n[i]);
    }

    /* JADX INFO: renamed from: H */
    public void m148337H(String str) {
        this.f123997a.setTitle(act().getString(R$string.f19224eo));
        this.f123997a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.a5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68541a.m148331x(view);
            }
        });
        this.f124007k = new String[]{act().getResources().getString(R$string.f19625ro), act().getResources().getString(R$string.f19656so)};
        VText vText = this.f124002f;
        boolean zBooleanValue = jm5.f121639b.get().booleanValue();
        String[] strArr = this.f124007k;
        vText.setText(zBooleanValue ? strArr[0] : strArr[1]);
        this.f124001e.setOnClickListener(new View.OnClickListener() { // from class: l.b5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75046a.m148332z(view);
            }
        });
        m148338I(str);
        this.f124006j.setOnClickListener(new View.OnClickListener() { // from class: l.c5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79841a.m148318C(view);
            }
        });
        m148336G(m148345s());
        this.f123999c.setOnClickListener(new View.OnClickListener() { // from class: l.d5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85147a.m148319E(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public void m148338I(String str) {
        this.f124005i.setText(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m148339J(int i) {
        act().dialog().m21502E0(R$string.f18711No).m21534e0(jyb.m147507f0(this.f124010n)).m21537h0(i, this.f124011o.m218565p0(i)).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: L */
    public void m148340L() {
        ebn.m120187B(act(), act().string(R$string.f18601K5), act().string(R$string.f18508H5), act().string(R$string.f18477G5), act().string(R$string.f19104ar), new z20() { // from class: l.e5c
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f92208a.m148335F((String) obj, (x20) obj2);
            }
        });
    }

    @Override // p153l.iam
    public Act act() {
        return this.f124009m;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148341m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m148341m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l5c.m152928b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z4c z4cVar) {
        this.f124011o = z4cVar;
    }

    /* JADX INFO: renamed from: p */
    public void m148343p(boolean z) {
        bnl0.m105524M(this.f124003g, z);
        i4g0.m138526x("e_download_data_button", "p_data_and_cache_settings_view");
        bnl0.m105509E0(this.f124003g, new View.OnClickListener() { // from class: l.f5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97213a.m148348w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m148344q() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_download_data_requested_recently_view", "emailInvalidTipsShow");
        act().dialog().m21503F(act().string(R$string.f18570J5)).m21557u0(act().string(R$string.f18894Tr)).m21495B(true).m21525V(new DialogInterface.OnDismissListener() { // from class: l.g5c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z().show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: s */
    public final int m148345s() {
        if (jm5.f121638a.get().booleanValue()) {
            return !jm5.f121640c.get().booleanValue() ? 1 : 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: u */
    public void m148346u() {
        if (NullChecker.m82486a(this.f124008l)) {
            this.f124008l.dismiss();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m148347v() {
        this.f124010n = new String[]{this.f124009m.getResources().getString(R$string.f18741Oo), this.f124009m.getResources().getString(R$string.f18801Qo), this.f124009m.getResources().getString(R$string.f18771Po)};
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m148348w(View view) {
        i4g0.m138520r("e_download_data_button", "p_data_and_cache_settings_view");
        this.f124011o.m218563n0();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m148349y(com.p051p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
        boolean z = i == 0;
        if (z != jm5.f121639b.get().booleanValue()) {
            if (z) {
                jm5.f121639b.put(Boolean.TRUE);
                this.f124011o.m218572z0();
                this.f124002f.setText(this.f124007k[0]);
            } else {
                jm5.f121639b.put(Boolean.FALSE);
                if (!ConnectivityReceiver.m82472l()) {
                    this.f124011o.m218559A0();
                }
                this.f124002f.setText(this.f124007k[1]);
            }
            jm5.f121639b.put(Boolean.valueOf(z));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
