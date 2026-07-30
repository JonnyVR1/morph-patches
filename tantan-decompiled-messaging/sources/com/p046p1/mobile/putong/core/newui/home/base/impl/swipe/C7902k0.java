package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7902k0;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import java.util.ArrayList;
import p149l.e30;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7902k0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public int f22101g = 1;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37667p(Object obj) {
        if (obj == null) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.extensionObject = obj;
        userInfo.virtualCardType = VirtualCardType.LiveMultipleCard;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760(userInfo, 2));
        CoreModule.f17545c.f19663m0.m31162y6(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37668q(Throwable th) {
        if (!(th instanceof CoreService)) {
            qib0.f154713b0.f139232c.mo67277oo().mo162980g(th.toString(), "");
        } else {
            qib0.f154713b0.f139232c.mo67277oo().mo162980g(th.toString(), String.valueOf(((TantanException.Client.CoreService) th).code));
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: s */
    public final void m37670s() {
        if (qib0.f154713b0.f139232c.mo67277oo().mo162977d().contains(Integer.valueOf(this.f22101g))) {
            qib0.f154713b0.f139232c.mo67277oo().mo162982i().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.nbh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7902k0.m37667p(obj);
                }
            }, new e30() { // from class: l.obh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7902k0.m37668q((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        this.f22101g++;
        if (!upa.m194794o1() && qib0.f154713b0.f139232c.mo67277oo().mo162978e()) {
            m37670s();
        }
        return false;
    }
}
