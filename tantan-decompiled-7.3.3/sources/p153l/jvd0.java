package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.AccountRecord;
import com.p051p1.mobile.putong.core.p058ui.svip.SVIPRefundItemView;
import com.p051p1.mobile.putong.core.p058ui.svip.SVIPRefundTitleView;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class jvd0 implements iam<evd0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f122782a;

    /* JADX INFO: renamed from: b */
    public VText f122783b;

    /* JADX INFO: renamed from: c */
    public VText f122784c;

    /* JADX INFO: renamed from: d */
    public VText f122785d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f122786e;

    /* JADX INFO: renamed from: f */
    public VText f122787f;

    /* JADX INFO: renamed from: g */
    public ImageView f122788g;

    /* JADX INFO: renamed from: h */
    public VText f122789h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f122790i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f122791j;

    /* JADX INFO: renamed from: k */
    public evd0 f122792k;

    /* JADX INFO: renamed from: l */
    public C18042a f122793l;

    /* JADX INFO: renamed from: m */
    public boolean f122794m = false;

    /* JADX INFO: renamed from: n */
    public String f122795n;

    /* JADX INFO: renamed from: l.jvd0$a */
    public class C18042a extends jic0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f122796c;

        public C18042a() {
            this.f122796c = new ArrayList();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f122796c.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            jvd0 jvd0Var = jvd0.this;
            return 1 == i ? p9r.m171370a(jvd0Var.f122791j).inflate(rec0.f162539d2, viewGroup, false) : p9r.m171370a(jvd0Var.f122791j).inflate(rec0.f162544e2, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, AccountRecord accountRecord, int i, int i2) {
            if (i == 0) {
                ((SVIPRefundTitleView) view).m57019i0();
            } else {
                ((SVIPRefundItemView) view).m57017i0(accountRecord);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return i == 0 ? AccountRecord.new_() : this.f122796c.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m147035G(List<AccountRecord> list) {
            this.f122796c.clear();
            this.f122796c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    public jvd0(PutongAct putongAct) {
        this.f122791j = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f122791j;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f122791j;
    }

    /* JADX INFO: renamed from: e */
    public View m147016e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lvd0.m155992b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m147017f(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f28319ha);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            o1j0.m165634h(R$string.f28331ia);
        } else if (i == 41906) {
            o1j0.m165634h(R$string.f28343ja);
        } else {
            o1j0.m165634h(R$string.f28319ha);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m147018i(pf60<Integer, String> pf60Var) {
        act().progressDismiss();
        if (9000 != pf60Var.f152156a.intValue()) {
            o1j0.m165634h(R$string.f28319ha);
        } else {
            m147028u(pf60Var.f152157b);
            o1j0.m165649w(R$string.f28355ka);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147016e(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(evd0 evd0Var) {
        this.f122792k = evd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m147020k() {
        this.f122791j.dialog().m21499D(R$string.f28517z1).m21555t0(R$string.f28506y1, new Runnable() { // from class: l.ivd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117049a.m147024p();
            }
        }).m21540k0(R$string.f27951B1).m21495B(true).m21567z0();
    }

    /* JADX INFO: renamed from: l */
    public String m147021l() {
        return this.f122795n;
    }

    /* JADX INFO: renamed from: m */
    public void m147022m() {
        this.f122794m = false;
        this.f122789h.setText(R$string.f27984E1);
        bnl0.m105509E0(this.f122786e, new View.OnClickListener() { // from class: l.gvd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106622a.m147025q(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m147023n(double d) {
        VText vText = this.f122785d;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            vText.setTextColor(Color.parseColor("#d74d37"));
            bnl0.m105509E0(this.f122785d, new View.OnClickListener() { // from class: l.hvd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111750a.m147027s(view);
                }
            });
        } else {
            vText.setTextColor(Color.parseColor("#80d74d37"));
            this.f122785d.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m147024p() {
        act().progress(R$string.f28149T1);
        this.f122792k.m122791o0();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m147025q(View view) {
        m147020k();
    }

    /* JADX INFO: renamed from: r */
    public void m147026r() {
        act().setTitle(R$string.f27973D1);
        this.f122783b.setText(IdManager.DEFAULT_VERSION_NAME);
        this.f122784c.setText(R$string.f28171V1);
        this.f122787f.setText(R$string.f27940A1);
        this.f122785d.setText(R$string.f28367la);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m147027s(View view) {
        if (!this.f122794m) {
            m147020k();
        } else {
            act().progress(R$string.f28149T1);
            this.f122792k.m122792p0(this.f122783b.getText().toString(), this.f122795n);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m147028u(String str) {
        this.f122794m = true;
        this.f122789h.setText(R$string.f28495x1);
        this.f122786e.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: v */
    public void m147029v(List<AccountRecord> list) {
        this.f122790i.setLayoutManager(new LinearLayoutManager(this.f122791j));
        C18042a c18042a = new C18042a();
        this.f122793l = c18042a;
        this.f122790i.setAdapter(c18042a);
        this.f122793l.m147035G(list);
    }

    /* JADX INFO: renamed from: w */
    public void m147030w(String str, String str2) {
        this.f122795n = str;
        this.f122783b.setText(str2);
    }

    /* JADX INFO: renamed from: x */
    public void m147031x(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f28105P1);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41902) {
            o1j0.m165634h(R$string.f28379ma);
        } else if (i == 41910) {
            o1j0.m165634h(R$string.f28391na);
        } else {
            o1j0.m165634h(R$string.f28105P1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m147032y() {
        act().progressDismiss();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
