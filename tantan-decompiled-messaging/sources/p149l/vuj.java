package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftInnerPagerItemView;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vuj extends dac0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final ltj f183076d;

    /* JADX INFO: renamed from: e */
    public GiftInnerPagerItemView f183077e;

    /* JADX INFO: renamed from: g */
    public int f183079g;

    /* JADX INFO: renamed from: c */
    public final List<CoreGiftInfo> f183075c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f183078f = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f183080h = {1, 2, 4, 6, 8};

    public vuj(ltj ltjVar) {
        this.f183076d = ltjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m200079K() {
        e51.m114742G(new Runnable() { // from class: l.uuj
            @Override // java.lang.Runnable
            public final void run() {
                this.f178400a.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m200080M(View view) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f183076d.m151705t().m98811N());
        if (NullChecker.m81303a(userM169430Pa)) {
            this.f183076d.m151709x();
            this.f183076d.m151708w(CoreModule.m29935P().m94658i().mo158415n3(!userM169430Pa.isFemale()));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f183075c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126367Q, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final GiftInnerPagerItemView giftInnerPagerItemView = (GiftInnerPagerItemView) view;
        giftInnerPagerItemView.m45495Z(this, this.f183076d, coreGiftInfo, i2 == this.f183078f, this.f183079g <= i2, new d30() { // from class: l.ruj
            @Override // p149l.d30
            public final void call() {
                this.f161062a.m200079K();
            }
        });
        if (i2 == this.f183078f) {
            this.f183077e = giftInnerPagerItemView;
        }
        if (coreGiftInfo.quota == 0 || this.f183079g > i2) {
            xdl0.m208329E0(giftInnerPagerItemView, new View.OnClickListener() { // from class: l.tuj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f172181a.m200080M(view2);
                }
            });
        } else {
            xdl0.m208329E0(giftInnerPagerItemView, new View.OnClickListener() { // from class: l.suj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f166468a.m200083L(giftInnerPagerItemView, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f183075c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m200083L(GiftInnerPagerItemView giftInnerPagerItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.m81303a(giftInnerPagerItemView.f29242i) && coreGiftInfo.f56011id.equals(giftInnerPagerItemView.f29242i.f56011id)) {
            if (!NullChecker.m81303a(this.f183077e)) {
                pvj.m171658c(this.f183076d.m151705t().m98805F(), this.f183076d.m151705t().m98810L(), coreGiftInfo.f56011id);
                this.f183078f = i;
                this.f183077e = giftInnerPagerItemView;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f183077e.toggle();
                return;
            }
            if (this.f183078f != i) {
                pvj.m171658c(this.f183076d.m151705t().m98805F(), this.f183076d.m151705t().m98810L(), coreGiftInfo.f56011id);
                if (this.f183077e.isChecked()) {
                    this.f183077e.toggle();
                }
                this.f183077e = giftInnerPagerItemView;
                this.f183078f = i;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f183077e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m200084N(List<CoreGiftInfo> list, int i) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f183075c.clear();
        this.f183075c.addAll(list);
        if (this.f183076d.m151705t().m98806G() == CoreGiftPanelName.get("note")) {
            this.f183078f = Math.max(this.f183078f, vwb.m200293G(list, new w9j() { // from class: l.quj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f183076d.m151705t().m98806G() == CoreGiftPanelName.get("greet")) {
            this.f183079g = 0;
            this.f183078f = 1;
        }
        notifyDataSetChanged();
    }
}
