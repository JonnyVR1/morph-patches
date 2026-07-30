package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.data.OMSThemeBubbleOpenInfo;
import com.p046p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import p149l.hpd0;
import p149l.mqi0;
import p149l.uqd0;
import p149l.yki0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7897i1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!yki0.m215127b().m215134f()) {
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
        OMSThemeCountdownInfo oMSThemeCountdownInfo = oMSThemeInfoM215130a.countdownView;
        hpd0 hpd0Var = CoreModule.f17545c.f19702z0.f106532Y;
        if (yki0.m215127b().m215134f() && mqi0.m155944o() - oMSThemeCountdownInfo.startMs >= ((long) oMSThemeInfoM215130a.bubbleOpen.day) * 86400000) {
            uqd0 uqd0Var = CoreModule.f17545c.f19702z0.f106528U;
            String[] strArrSplit = uqd0Var.get().split("_");
            if (strArrSplit.length == 2) {
                int iIntValue = mqi0.m155929D(Long.valueOf(strArrSplit[0]).longValue()) ? 1 + Integer.valueOf(strArrSplit[1]).intValue() : 1;
                uqd0Var.put(mqi0.m155944o() + "_" + iIntValue);
                if (iIntValue == oMSThemeInfoM215130a.bubbleOpen.swipeCnt) {
                    hpd0Var.put(Boolean.FALSE);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b;
                    OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = oMSThemeInfoM215130a.bubbleOpen;
                    viewTreeObserverOnGlobalLayoutListenerC7866b.m37389z6(oMSThemeBubbleOpenInfo.txt, yki0.m215129n(oMSThemeBubbleOpenInfo.color, "#FFFFFF"), yki0.m215129n(oMSThemeInfoM215130a.bubbleOpen.bgColor, "#FE7E1D"));
                }
            }
        }
        return false;
    }
}
