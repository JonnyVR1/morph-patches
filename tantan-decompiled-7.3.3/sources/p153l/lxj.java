package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftInnerPagerItemView;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lxj extends jic0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final bwj f133960d;

    /* JADX INFO: renamed from: e */
    public GiftInnerPagerItemView f133961e;

    /* JADX INFO: renamed from: g */
    public int f133963g;

    /* JADX INFO: renamed from: c */
    public final List<CoreGiftInfo> f133959c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f133962f = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f133964h = {1, 2, 4, 6, 8};

    public lxj(bwj bwjVar) {
        this.f133960d = bwjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m156196K() {
        l51.m152887G(new Runnable() { // from class: l.kxj
            @Override // java.lang.Runnable
            public final void run() {
                this.f129214a.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m156197M(View view) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f133960d.m106714t().m178299N());
        if (NullChecker.m82486a(userM116503Pa)) {
            this.f133960d.m106718x();
            this.f133960d.m106717w(CoreModule.m30933P().m143412i().mo180507n3(!userM116503Pa.isFemale()));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f133959c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156923Q, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final GiftInnerPagerItemView giftInnerPagerItemView = (GiftInnerPagerItemView) view;
        giftInnerPagerItemView.m46678Z(this, this.f133960d, coreGiftInfo, i2 == this.f133962f, this.f133963g <= i2, new x20() { // from class: l.hxj
            @Override // p153l.x20
            public final void call() {
                this.f112010a.m156196K();
            }
        });
        if (i2 == this.f133962f) {
            this.f133961e = giftInnerPagerItemView;
        }
        if (coreGiftInfo.quota == 0 || this.f133963g > i2) {
            bnl0.m105509E0(giftInnerPagerItemView, new View.OnClickListener() { // from class: l.jxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f123038a.m156197M(view2);
                }
            });
        } else {
            bnl0.m105509E0(giftInnerPagerItemView, new View.OnClickListener() { // from class: l.ixj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f117419a.m156200L(giftInnerPagerItemView, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f133959c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m156200L(GiftInnerPagerItemView giftInnerPagerItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.m82486a(giftInnerPagerItemView.f30090i) && coreGiftInfo.f56859id.equals(giftInnerPagerItemView.f30090i.f56859id)) {
            if (!NullChecker.m82486a(this.f133961e)) {
                fyj.m128103c(this.f133960d.m106714t().m178293F(), this.f133960d.m106714t().m178298L(), coreGiftInfo.f56859id);
                this.f133962f = i;
                this.f133961e = giftInnerPagerItemView;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f133961e.toggle();
                return;
            }
            if (this.f133962f != i) {
                fyj.m128103c(this.f133960d.m106714t().m178293F(), this.f133960d.m106714t().m178298L(), coreGiftInfo.f56859id);
                if (this.f133961e.isChecked()) {
                    this.f133961e.toggle();
                }
                this.f133961e = giftInnerPagerItemView;
                this.f133962f = i;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f133961e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m156201N(List<CoreGiftInfo> list, int i) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f133959c.clear();
        this.f133959c.addAll(list);
        if (this.f133960d.m106714t().m178294G() == CoreGiftPanelName.get("note")) {
            this.f133962f = Math.max(this.f133962f, jyb.m147476G(list, new qcj() { // from class: l.gxj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f133960d.m106714t().m178294G() == CoreGiftPanelName.get("greet")) {
            this.f133963g = 0;
            this.f133962f = 1;
        }
        notifyDataSetChanged();
    }
}
