package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.OMSThemeBubbleOpenInfo;
import com.p1.mobile.putong.data.OMSThemeCountdownInfo;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.NullChecker;
import l.hpd0;
import l.uqd0;
import p009l.mqi0;
import p009l.yki0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0061i1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!yki0.m25445b().m25452f()) {
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
        OMSThemeCountdownInfo oMSThemeCountdownInfo = oMSThemeInfoM25448a.countdownView;
        hpd0 hpd0Var = CoreModule.c.z0.Y;
        if (yki0.m25445b().m25452f() && mqi0.m18550o() - oMSThemeCountdownInfo.startMs >= ((long) oMSThemeInfoM25448a.bubbleOpen.day) * 86400000) {
            uqd0 uqd0Var = CoreModule.c.z0.U;
            String[] strArrSplit = ((String) uqd0Var.get()).split("_");
            if (strArrSplit.length == 2) {
                int iIntValue = mqi0.m18535D(Long.valueOf(strArrSplit[0]).longValue()) ? 1 + Integer.valueOf(strArrSplit[1]).intValue() : 1;
                uqd0Var.put(mqi0.m18550o() + "_" + iIntValue);
                if (iIntValue == oMSThemeInfoM25448a.bubbleOpen.swipeCnt) {
                    hpd0Var.put(Boolean.FALSE);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b;
                    OMSThemeBubbleOpenInfo oMSThemeBubbleOpenInfo = oMSThemeInfoM25448a.bubbleOpen;
                    viewTreeObserverOnGlobalLayoutListenerC0030b.m1358z6(oMSThemeBubbleOpenInfo.txt, yki0.m25447n(oMSThemeBubbleOpenInfo.color, "#FFFFFF"), yki0.m25447n(oMSThemeInfoM25448a.bubbleOpen.bgColor, "#FE7E1D"));
                }
            }
        }
        return false;
    }
}
