package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.data.OMSThemeBubbleOpenInfo;
import com.p051p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import p153l.jxd0;
import p153l.pzi0;
import p153l.wyd0;
import p153l.yti0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8048i1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!yti0.m217322b().m217329f()) {
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
        OMSThemeCountdownInfo oMSThemeCountdownInfo = oMSThemeInfoM217325a.countdownView;
        jxd0 jxd0Var = CoreModule.f18264c.f20444z0.f178197Y;
        if (yti0.m217322b().m217329f() && pzi0.m174454o() - oMSThemeCountdownInfo.startMs >= ((long) oMSThemeInfoM217325a.bubbleOpen.day) * 86400000) {
            wyd0 wyd0Var = CoreModule.f18264c.f20444z0.f178193U;
            String[] strArrSplit = wyd0Var.get().split("_");
            if (strArrSplit.length == 2) {
                int iIntValue = pzi0.m174439D(Long.valueOf(strArrSplit[0]).longValue()) ? 1 + Integer.valueOf(strArrSplit[1]).intValue() : 1;
                wyd0Var.put(pzi0.m174454o() + "_" + iIntValue);
                if (iIntValue == oMSThemeInfoM217325a.bubbleOpen.swipeCnt) {
                    jxd0Var.put(Boolean.FALSE);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b;
                    OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = oMSThemeInfoM217325a.bubbleOpen;
                    viewTreeObserverOnGlobalLayoutListenerC8017b.m38392z6(oMSThemeBubbleOpenInfo.txt, yti0.m217324n(oMSThemeBubbleOpenInfo.color, "#FFFFFF"), yti0.m217324n(oMSThemeInfoM217325a.bubbleOpen.bgColor, "#FE7E1D"));
                }
            }
        }
        return false;
    }
}
