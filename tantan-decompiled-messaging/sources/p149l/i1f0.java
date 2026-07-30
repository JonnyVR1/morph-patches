package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class i1f0 extends dac0<SidesSlipItemData> {

    /* JADX INFO: renamed from: c */
    public Act f110447c;

    /* JADX INFO: renamed from: d */
    public List<SidesSlipItemData> f110448d;

    /* JADX INFO: renamed from: e */
    public e30<SidesSlipItemData> f110449e;

    /* JADX INFO: renamed from: f */
    public int f110450f = 1;

    /* JADX INFO: renamed from: g */
    public int f110451g = 2;

    /* JADX INFO: renamed from: h */
    public boolean f110452h;

    /* JADX INFO: renamed from: i */
    public d2f0 f110453i;

    public i1f0(d2f0 d2f0Var, boolean z) {
        this.f110452h = false;
        this.f110447c = d2f0Var.getAct();
        this.f110453i = d2f0Var;
        this.f110452h = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f110448d)) {
            return 0;
        }
        return this.f110448d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        int i2;
        if (i == this.f110450f) {
            i2 = f6c0.f95546R7;
            if (upa.m194715X2()) {
                i2 = f6c0.f95562S7;
            }
        } else {
            i2 = f6c0.f95530Q7;
        }
        return this.f110447c.inflater().inflate(i2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final SidesSlipItemData sidesSlipItemData, int i, int i2) {
        if (i == this.f110450f) {
            if (upa.m194715X2()) {
                ((SidesSlipHeadItemViewV2) view).m43490V(this.f110447c, this);
                return;
            } else {
                final SidesSlipHeadItemView sidesSlipHeadItemView = (SidesSlipHeadItemView) view;
                mo67374c(this.f110447c, CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.c1f0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        User user = (User) obj;
                        return user.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + user.f56011id));
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.d1f0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f83261a.m133981M(sidesSlipHeadItemView, (User) obj);
                    }
                }));
                return;
            }
        }
        final SidesSlipItemView sidesSlipItemView = (SidesSlipItemView) view;
        sidesSlipItemView.m43492Q(this.f110452h, this.f110448d.get(i2), i2);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.e1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88816a.m133982N(sidesSlipItemData, view2);
            }
        });
        if (upa.m194669M2() && TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            mo67374c(this.f110447c, C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.m154951C())).takeUntil((w9j<? super V, Boolean>) new w9j() { // from class: l.f1f0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.f17545c.f19659k2.f184656R.get().longValue() < mqi0.m155944o());
                }
            }).doOnCompleted(new d30() { // from class: l.g1f0
                @Override // p149l.d30
                public final void call() {
                    this.f100178a.m133983O();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.h1f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    w5b.m201606r3(sidesSlipItemView.f26737i);
                }
            }));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public SidesSlipItemData getItem(int i) {
        return this.f110448d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m133981M(SidesSlipHeadItemView sidesSlipHeadItemView, User user) {
        sidesSlipHeadItemView.m43484W(this.f110447c, user);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m133982N(SidesSlipItemData sidesSlipItemData, View view) {
        this.f110449e.call(sidesSlipItemData);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m133983O() {
        this.f110453i.m109740k();
    }

    /* JADX INFO: renamed from: P */
    public void m133984P(List<SidesSlipItemData> list) {
        if (list == null) {
            return;
        }
        this.f110448d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public void m133985Q(e30<SidesSlipItemData> e30Var) {
        this.f110449e = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (i == 0 && this.f110452h) ? this.f110450f : this.f110451g;
    }
}
