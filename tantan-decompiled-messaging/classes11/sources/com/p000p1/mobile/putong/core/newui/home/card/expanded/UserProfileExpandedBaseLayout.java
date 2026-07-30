package com.p000p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.e30;
import l.mkd0;
import l.xdl0;
import p009l.a5m;
import p009l.chj0;
import p009l.e5m;
import p009l.io5;
import p009l.jj4;
import p009l.oql;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class UserProfileExpandedBaseLayout extends BaseExpandedView implements e5m {
    public UserProfileExpandedBaseLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo759B0(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: C */
    public void mo762C() {
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo765D(String str) {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: F */
    public boolean mo1890F() {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: R */
    public boolean mo1891R() {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: U */
    public void mo812U() {
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo844e0() {
        return true;
    }

    @Override // p009l.a5m
    public abstract /* synthetic */ jj4 getCardData();

    @Override // p009l.mol
    public abstract /* synthetic */ jj4 getCardDataProxy();

    @Override // p009l.a5m, p009l.gol
    public abstract /* synthetic */ View getCardView();

    public abstract /* synthetic */ View getCardViewProxy();

    @Override // p009l.mol
    public abstract /* synthetic */ CoreMomentInfo getMomentInfoProxy();

    @Override // p009l.mol
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p009l.aol
    public abstract /* synthetic */ CoreSuggested.UserInfo getUserInfoProxy();

    @Override // p009l.mol
    public abstract /* synthetic */ User getUserProxy();

    @Override // p009l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m1892l1(String str, User user, CoreSuggested.UserInfo userInfo, int i, final Runnable runnable) {
        Act actE;
        if (io5.m16650h().m16653i(str) || (actE = xdl0.E(this)) == null) {
            return;
        }
        actE.duringCreated(io5.m16650h().m16651f(str).take(1)).subscribe(mkd0.H(new e30() { // from class: l.o7k0
            public final void call(Object obj) {
                runnable.run();
            }
        }, new e30() { // from class: l.p7k0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo888q0() {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: s */
    public void mo895s() {
        m1999e1();
    }

    @Override // p009l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // p009l.a5m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC0027d interfaceC0027d) {
    }

    @Override // p009l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo914y() {
        return true;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo917z() {
        return false;
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p009l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
    }
}
