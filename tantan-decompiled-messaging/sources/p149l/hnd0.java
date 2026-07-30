package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.AccountRecord;
import com.p046p1.mobile.putong.core.p053ui.svip.SVIPRefundItemView;
import com.p046p1.mobile.putong.core.p053ui.svip.SVIPRefundTitleView;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hnd0 implements s7m<cnd0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f108597a;

    /* JADX INFO: renamed from: b */
    public VText f108598b;

    /* JADX INFO: renamed from: c */
    public VText f108599c;

    /* JADX INFO: renamed from: d */
    public VText f108600d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f108601e;

    /* JADX INFO: renamed from: f */
    public VText f108602f;

    /* JADX INFO: renamed from: g */
    public ImageView f108603g;

    /* JADX INFO: renamed from: h */
    public VText f108604h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f108605i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f108606j;

    /* JADX INFO: renamed from: k */
    public cnd0 f108607k;

    /* JADX INFO: renamed from: l */
    public C17347a f108608l;

    /* JADX INFO: renamed from: m */
    public boolean f108609m = false;

    /* JADX INFO: renamed from: n */
    public String f108610n;

    /* JADX INFO: renamed from: l.hnd0$a */
    public class C17347a extends dac0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f108611c;

        public C17347a() {
            this.f108611c = new ArrayList();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f108611c.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            hnd0 hnd0Var = hnd0.this;
            return 1 == i ? o7r.m163037a(hnd0Var.f108606j).inflate(m6c0.f131579d2, viewGroup, false) : o7r.m163037a(hnd0Var.f108606j).inflate(m6c0.f131584e2, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, AccountRecord accountRecord, int i, int i2) {
            if (i == 0) {
                ((SVIPRefundTitleView) view).m55836i0();
            } else {
                ((SVIPRefundItemView) view).m55834i0(accountRecord);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return i == 0 ? AccountRecord.new_() : this.f108611c.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m131913G(List<AccountRecord> list) {
            this.f108611c.clear();
            this.f108611c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    public hnd0(PutongAct putongAct) {
        this.f108606j = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f108606j;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f108606j;
    }

    /* JADX INFO: renamed from: e */
    public View m131894e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jnd0.m142375b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m131895f(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f27471ha);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.m151578h(R$string.f27483ia);
        } else if (i == 41906) {
            lsi0.m151578h(R$string.f27495ja);
        } else {
            lsi0.m151578h(R$string.f27471ha);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m131896i(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 != j760Var.f116564a.intValue()) {
            lsi0.m151578h(R$string.f27471ha);
        } else {
            m131906u(j760Var.f116565b);
            lsi0.m151593w(R$string.f27507ka);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m131894e(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cnd0 cnd0Var) {
        this.f108607k = cnd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m131898k() {
        this.f108606j.dialog().m20500D(R$string.f27669z1).m20556t0(R$string.f27658y1, new Runnable() { // from class: l.gnd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103586a.m131902p();
            }
        }).m20541k0(R$string.f27103B1).m20496B(true).m20568z0();
    }

    /* JADX INFO: renamed from: l */
    public String m131899l() {
        return this.f108610n;
    }

    /* JADX INFO: renamed from: m */
    public void m131900m() {
        this.f108609m = false;
        this.f108604h.setText(R$string.f27136E1);
        xdl0.m208329E0(this.f108601e, new View.OnClickListener() { // from class: l.end0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92306a.m131903q(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m131901n(double d) {
        VText vText = this.f108600d;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            vText.setTextColor(Color.parseColor("#d74d37"));
            xdl0.m208329E0(this.f108600d, new View.OnClickListener() { // from class: l.fnd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98414a.m131905s(view);
                }
            });
        } else {
            vText.setTextColor(Color.parseColor("#80d74d37"));
            this.f108600d.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m131902p() {
        act().progress(R$string.f27301T1);
        this.f108607k.m107772o0();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m131903q(View view) {
        m131898k();
    }

    /* JADX INFO: renamed from: r */
    public void m131904r() {
        act().setTitle(R$string.f27125D1);
        this.f108598b.setText(IdManager.DEFAULT_VERSION_NAME);
        this.f108599c.setText(R$string.f27323V1);
        this.f108602f.setText(R$string.f27092A1);
        this.f108600d.setText(R$string.f27519la);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m131905s(View view) {
        if (!this.f108609m) {
            m131898k();
        } else {
            act().progress(R$string.f27301T1);
            this.f108607k.m107773p0(this.f108598b.getText().toString(), this.f108610n);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m131906u(String str) {
        this.f108609m = true;
        this.f108604h.setText(R$string.f27647x1);
        this.f108601e.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: v */
    public void m131907v(List<AccountRecord> list) {
        this.f108605i.setLayoutManager(new LinearLayoutManager(this.f108606j));
        C17347a c17347a = new C17347a();
        this.f108608l = c17347a;
        this.f108605i.setAdapter(c17347a);
        this.f108608l.m131913G(list);
    }

    /* JADX INFO: renamed from: w */
    public void m131908w(String str, String str2) {
        this.f108610n = str;
        this.f108598b.setText(str2);
    }

    /* JADX INFO: renamed from: x */
    public void m131909x(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f27257P1);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41902) {
            lsi0.m151578h(R$string.f27531ma);
        } else if (i == 41910) {
            lsi0.m151578h(R$string.f27543na);
        } else {
            lsi0.m151578h(R$string.f27257P1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m131910y() {
        act().progressDismiss();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
