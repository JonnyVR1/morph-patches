package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.OMSThemeBubbleInfo;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import l.h9b;
import l.hpd0;
import l.tpd0;
import p009l.yki0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0058h1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!yki0.m25445b().m25451e()) {
            return false;
        }
        yki0 yki0VarM25445b = yki0.m25445b();
        if (!NullChecker.a(yki0VarM25445b)) {
            return false;
        }
        OMSThemeInfo oMSThemeInfoM25448a = yki0VarM25445b.m25448a();
        if (!NullChecker.a(oMSThemeInfoM25448a)) {
            return false;
        }
        h9b h9bVar = CoreModule.c.z0;
        tpd0 tpd0Var = h9bVar.T;
        hpd0 hpd0Var = h9bVar.X;
        if (yki0.m25445b().m25451e()) {
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            if (((Integer) tpd0Var.get()).intValue() == oMSThemeInfoM25448a.bubble.swipeCnt) {
                hpd0Var.put(Boolean.FALSE);
                ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b;
                OMSThemeBubbleInfo oMSThemeBubbleInfo = oMSThemeInfoM25448a.bubble;
                viewTreeObserverOnGlobalLayoutListenerC0030b.m1353y6(oMSThemeBubbleInfo.txt, yki0.m25447n(oMSThemeBubbleInfo.color, "#FFFFFF"), yki0.m25447n(oMSThemeInfoM25448a.bubble.bgColor, "#FE7E1D"));
            }
        }
        return false;
    }
}
