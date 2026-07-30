package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.data.OMSThemeBubbleInfo;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import p153l.jxd0;
import p153l.uab;
import p153l.vxd0;
import p153l.yti0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8045h1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!yti0.m217322b().m217328e()) {
            return false;
        }
        yti0 yti0VarM217322b = yti0.m217322b();
        if (!NullChecker.m82486a(yti0VarM217322b)) {
            return false;
        }
        OMSThemeInfo oMSThemeInfoM217325a = yti0VarM217322b.m217325a();
        if (!NullChecker.m82486a(oMSThemeInfoM217325a)) {
            return false;
        }
        uab uabVar = CoreModule.f18264c.f20444z0;
        vxd0 vxd0Var = uabVar.f178192T;
        jxd0 jxd0Var = uabVar.f178196X;
        if (yti0.m217322b().m217328e()) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            if (vxd0Var.get().intValue() == oMSThemeInfoM217325a.bubble.swipeCnt) {
                jxd0Var.put(Boolean.FALSE);
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b;
                OMSThemeBubbleInfo oMSThemeBubbleInfo = oMSThemeInfoM217325a.bubble;
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38387y6(oMSThemeBubbleInfo.txt, yti0.m217324n(oMSThemeBubbleInfo.color, "#FFFFFF"), yti0.m217324n(oMSThemeInfoM217325a.bubble.bgColor, "#FE7E1D"));
            }
        }
        return false;
    }
}
