package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8053k0;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import java.util.ArrayList;
import p153l.fo0;
import p153l.gra;
import p153l.pf60;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8053k0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public int f22843g = 1;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38670p(Object obj) {
        if (obj == null) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.extensionObject = obj;
        userInfo.virtualCardType = VirtualCardType.LiveMultipleCard;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60(userInfo, 2));
        CoreModule.f18264c.f20405m0.m32165y6(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38671q(Throwable th) {
        if (!(th instanceof CoreService)) {
            uqb0.f180396b0.f170326c.mo68460oo().mo206123g(th.toString(), "");
        } else {
            uqb0.f180396b0.f170326c.mo68460oo().mo206123g(th.toString(), String.valueOf(((TantanException.Client.CoreService) th).code));
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: s */
    public final void m38673s() {
        if (uqb0.f180396b0.f170326c.mo68460oo().mo206120d().contains(Integer.valueOf(this.f22843g))) {
            uqb0.f180396b0.f170326c.mo68460oo().mo206125i().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.vjh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8053k0.m38670p(obj);
                }
            }, new y20() { // from class: l.wjh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8053k0.m38671q((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        this.f22843g++;
        if (!gra.m131725o1() && uqb0.f180396b0.f170326c.mo68460oo().mo206121e()) {
            m38673s();
        }
        return false;
    }
}
