package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.data.OMSThemeBubbleInfo;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import p149l.h9b;
import p149l.hpd0;
import p149l.tpd0;
import p149l.yki0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7894h1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!yki0.m215127b().m215133e()) {
            return false;
        }
        yki0 yki0VarM215127b = yki0.m215127b();
        if (!NullChecker.m81303a(yki0VarM215127b)) {
            return false;
        }
        OMSThemeInfo oMSThemeInfoM215130a = yki0VarM215127b.m215130a();
        if (!NullChecker.m81303a(oMSThemeInfoM215130a)) {
            return false;
        }
        h9b h9bVar = CoreModule.f17545c.f19702z0;
        tpd0 tpd0Var = h9bVar.f106527T;
        hpd0 hpd0Var = h9bVar.f106531X;
        if (yki0.m215127b().m215133e()) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            if (tpd0Var.get().intValue() == oMSThemeInfoM215130a.bubble.swipeCnt) {
                hpd0Var.put(Boolean.FALSE);
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b;
                OMSThemeBubbleInfo oMSThemeBubbleInfo = oMSThemeInfoM215130a.bubble;
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37384y6(oMSThemeBubbleInfo.txt, yki0.m215129n(oMSThemeBubbleInfo.color, "#FFFFFF"), yki0.m215129n(oMSThemeInfoM215130a.bubble.bgColor, "#FE7E1D"));
            }
        }
        return false;
    }
}
