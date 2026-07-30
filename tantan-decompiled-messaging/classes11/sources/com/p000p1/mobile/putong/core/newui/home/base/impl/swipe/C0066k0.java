package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0066k0;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import java.util.ArrayList;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0066k0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public int f879g = 1;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1638p(Object obj) {
        if (obj == null) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = "VirtualCard";
        userInfo.extensionObject = obj;
        userInfo.virtualCardType = VirtualCardType.LiveMultipleCard;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760(userInfo, 2));
        CoreModule.c.m0.y6(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1639q(Throwable th) {
        if (!(th instanceof CoreService)) {
            qib0.b0.c.m9062oo().m19641g(th.toString(), "");
        } else {
            qib0.b0.c.m9062oo().m19641g(th.toString(), String.valueOf(((TantanException.Client.CoreService) th).code));
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: s */
    public final void m1641s() {
        if (qib0.b0.c.m9062oo().m19638d().contains(Integer.valueOf(this.f879g))) {
            qib0.b0.c.m9062oo().m19643i().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.nbh0
                public final void call(Object obj) {
                    C0066k0.m1638p(obj);
                }
            }, new e30() { // from class: l.obh0
                public final void call(Object obj) {
                    C0066k0.m1639q((Throwable) obj);
                }
            }));
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        this.f879g++;
        if (!upa.o1() && qib0.b0.c.m9062oo().m19639e()) {
            m1641s();
        }
        return false;
    }
}
