package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemViewV2;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class p9f0 extends jic0<SidesSlipItemData> {

    /* JADX INFO: renamed from: c */
    public Act f151145c;

    /* JADX INFO: renamed from: d */
    public List<SidesSlipItemData> f151146d;

    /* JADX INFO: renamed from: e */
    public y20<SidesSlipItemData> f151147e;

    /* JADX INFO: renamed from: f */
    public int f151148f = 1;

    /* JADX INFO: renamed from: g */
    public int f151149g = 2;

    /* JADX INFO: renamed from: h */
    public boolean f151150h;

    /* JADX INFO: renamed from: i */
    public kaf0 f151151i;

    public p9f0(kaf0 kaf0Var, boolean z) {
        this.f151150h = false;
        this.f151145c = kaf0Var.getAct();
        this.f151151i = kaf0Var;
        this.f151150h = z;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f151146d)) {
            return 0;
        }
        return this.f151146d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        int i2;
        if (i == this.f151148f) {
            i2 = kec0.f125712Y7;
            if (gra.m131646X2()) {
                i2 = kec0.f125728Z7;
            }
        } else {
            i2 = kec0.f125696X7;
        }
        return this.f151145c.inflater().inflate(i2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final SidesSlipItemData sidesSlipItemData, int i, int i2) {
        if (i == this.f151148f) {
            if (gra.m131646X2()) {
                ((SidesSlipHeadItemViewV2) view).m44676V(this.f151145c, this);
                return;
            } else {
                final SidesSlipHeadItemView sidesSlipHeadItemView = (SidesSlipHeadItemView) view;
                mo68557c(this.f151145c, CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.j9f0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        User user = (User) obj;
                        return user.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + user.f56859id));
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.k9f0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f124541a.m171356M(sidesSlipHeadItemView, (User) obj);
                    }
                }));
                return;
            }
        }
        final SidesSlipItemView sidesSlipItemView = (SidesSlipItemView) view;
        sidesSlipItemView.m44678Q(this.f151150h, this.f151146d.get(i2), i2);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.l9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f130606a.m171357N(sidesSlipItemData, view2);
            }
        });
        if (gra.m131600M2() && TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            mo68557c(this.f151145c, C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(psd0.m173592C())).takeUntil((qcj<? super V, Boolean>) new qcj() { // from class: l.m9f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.f18264c.f20401k2.f118659R.get().longValue() < pzi0.m174454o());
                }
            }).doOnCompleted(new x20() { // from class: l.n9f0
                @Override // p153l.x20
                public final void call() {
                    this.f140890a.m171358O();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.o9f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    j7b.m143757r3(sidesSlipItemView.f27585i);
                }
            }));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public SidesSlipItemData getItem(int i) {
        return this.f151146d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m171356M(SidesSlipHeadItemView sidesSlipHeadItemView, User user) {
        sidesSlipHeadItemView.m44670W(this.f151145c, user);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m171357N(SidesSlipItemData sidesSlipItemData, View view) {
        this.f151147e.call(sidesSlipItemData);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m171358O() {
        this.f151151i.m148959k();
    }

    /* JADX INFO: renamed from: P */
    public void m171359P(List<SidesSlipItemData> list) {
        if (list == null) {
            return;
        }
        this.f151146d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public void m171360Q(y20<SidesSlipItemData> y20Var) {
        this.f151147e = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (i == 0 && this.f151150h) ? this.f151148f : this.f151149g;
    }
}
