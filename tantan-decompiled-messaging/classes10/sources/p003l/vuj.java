package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftInnerPagerItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e51;
import l.o7r;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vuj extends dac0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final ltj f8045d;

    /* JADX INFO: renamed from: e */
    public GiftInnerPagerItemView f8046e;

    /* JADX INFO: renamed from: g */
    public int f8048g;

    /* JADX INFO: renamed from: c */
    public final List<CoreGiftInfo> f8044c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f8047f = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f8049h = {1, 2, 4, 6, 8};

    public vuj(ltj ltjVar) {
        this.f8045d = ltjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m10358K() {
        e51.G(new Runnable() { // from class: l.uuj
            @Override // java.lang.Runnable
            public final void run() {
                this.f7824a.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m10359M(View view) {
        User userPa = CoreModule.c.e0.Pa(this.f8045d.m7914t().m5636N());
        if (NullChecker.a(userPa)) {
            this.f8045d.m7918x();
            this.f8045d.m7917w(CoreModule.P().i().n3(!userPa.isFemale()));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m10361C() {
        return this.f8044c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m10362D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(l6c0.f5876Q, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.p1.mobile.putong.core.ui.gift.opt.view.GiftInnerPagerItemView] */
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m10360A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final ?? r0 = (GiftInnerPagerItemView) view;
        r0.m2831Z(this, this.f8045d, coreGiftInfo, i2 == this.f8047f, this.f8048g <= i2, new d30() { // from class: l.ruj
            public final void call() {
                this.f7244a.m10358K();
            }
        });
        if (i2 == this.f8047f) {
            this.f8046e = r0;
        }
        if (coreGiftInfo.quota == 0 || this.f8048g > i2) {
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.tuj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7627a.m10359M(view2);
                }
            });
        } else {
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.suj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7464a.m10365L(r0, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f8044c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10365L(GiftInnerPagerItemView giftInnerPagerItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.a(giftInnerPagerItemView.f1636i) && ((DbObject) coreGiftInfo).id.equals(((DbObject) giftInnerPagerItemView.f1636i).id)) {
            if (!NullChecker.a(this.f8046e)) {
                pvj.m8815c(this.f8045d.m7914t().m5630F(), this.f8045d.m7914t().m5635L(), ((DbObject) coreGiftInfo).id);
                this.f8047f = i;
                this.f8046e = giftInnerPagerItemView;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f8046e.toggle();
                return;
            }
            if (this.f8047f != i) {
                pvj.m8815c(this.f8045d.m7914t().m5630F(), this.f8045d.m7914t().m5635L(), ((DbObject) coreGiftInfo).id);
                if (this.f8046e.isChecked()) {
                    this.f8046e.toggle();
                }
                this.f8046e = giftInnerPagerItemView;
                this.f8047f = i;
                if (giftInnerPagerItemView.isChecked()) {
                    return;
                }
                this.f8046e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m10366N(List<CoreGiftInfo> list, int i) {
        if (vwb.J(list)) {
            return;
        }
        this.f8044c.clear();
        this.f8044c.addAll(list);
        if (this.f8045d.m7914t().m5631G() == CoreGiftPanelName.get("note")) {
            this.f8047f = Math.max(this.f8047f, vwb.G(list, new w9j() { // from class: l.quj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f8045d.m7914t().m5631G() == CoreGiftPanelName.get(GiftSubBizType.greet)) {
            this.f8048g = 0;
            this.f8047f = 1;
        }
        notifyDataSetChanged();
    }
}
