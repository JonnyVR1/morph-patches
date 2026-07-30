package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.dac0;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.upa;
import l.vwb;
import l.w5b;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i1f0 extends dac0<SidesSlipItemData> {

    /* JADX INFO: renamed from: c */
    public Act f14373c;

    /* JADX INFO: renamed from: d */
    public List<SidesSlipItemData> f14374d;

    /* JADX INFO: renamed from: e */
    public e30<SidesSlipItemData> f14375e;

    /* JADX INFO: renamed from: f */
    public int f14376f = 1;

    /* JADX INFO: renamed from: g */
    public int f14377g = 2;

    /* JADX INFO: renamed from: h */
    public boolean f14378h;

    /* JADX INFO: renamed from: i */
    public d2f0 f14379i;

    public i1f0(d2f0 d2f0Var, boolean z) {
        this.f14378h = false;
        this.f14373c = d2f0Var.act();
        this.f14379i = d2f0Var;
        this.f14378h = z;
    }

    /* JADX INFO: renamed from: C */
    public int m16162C() {
        if (vwb.J(this.f14374d)) {
            return 0;
        }
        return this.f14374d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16163D(ViewGroup viewGroup, int i) {
        int i2;
        if (i == this.f14376f) {
            i2 = f6c0.R7;
            if (upa.X2()) {
                i2 = f6c0.S7;
            }
        } else {
            i2 = f6c0.Q7;
        }
        return this.f14373c.inflater().inflate(i2, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m16161A(View view, final SidesSlipItemData sidesSlipItemData, int i, int i2) {
        if (i == this.f14376f) {
            if (upa.X2()) {
                ((SidesSlipHeadItemViewV2) view).m7736V(this.f14373c, this);
                return;
            } else {
                final SidesSlipHeadItemView sidesSlipHeadItemView = (SidesSlipHeadItemView) view;
                c(this.f14373c, CoreModule.c.e0.o9().map(new w9j() { // from class: l.c1f0
                    public final Object call(Object obj) {
                        User user = (User) obj;
                        return user.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) user).id));
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.d1f0
                    public final void call(Object obj) {
                        this.f10846a.m16166M(sidesSlipHeadItemView, (User) obj);
                    }
                }));
                return;
            }
        }
        final SidesSlipItemView sidesSlipItemView = (SidesSlipItemView) view;
        sidesSlipItemView.m7738Q(this.f14378h, this.f14374d.get(i2), i2);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.e1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12139a.m16167N(sidesSlipItemData, view2);
            }
        });
        if (upa.M2() && TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            c(this.f14373c, c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.C())).takeUntil(new w9j() { // from class: l.f1f0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Long) CoreModule.c.k2.R.get()).longValue() < mqi0.m18550o());
                }
            }).doOnCompleted(new d30() { // from class: l.g1f0
                public final void call() {
                    this.f13261a.m16168O();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.h1f0
                public final void call(Object obj) {
                    w5b.r3(sidesSlipItemView.f5515i);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public SidesSlipItemData getItem(int i) {
        return this.f14374d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m16166M(SidesSlipHeadItemView sidesSlipHeadItemView, User user) {
        sidesSlipHeadItemView.m7730W(this.f14373c, user);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m16167N(SidesSlipItemData sidesSlipItemData, View view) {
        this.f14375e.call(sidesSlipItemData);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m16168O() {
        this.f14379i.m12918k();
    }

    /* JADX INFO: renamed from: P */
    public void m16169P(List<SidesSlipItemData> list) {
        if (list == null) {
            return;
        }
        this.f14374d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public void m16170Q(e30<SidesSlipItemData> e30Var) {
        this.f14375e = e30Var;
    }

    public int getItemViewType(int i) {
        return (i == 0 && this.f14378h) ? this.f14376f : this.f14377g;
    }
}
