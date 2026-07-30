package com.p051p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;
import p153l.atl;
import p153l.bnl0;
import p153l.fqj0;
import p153l.ik4;
import p153l.mp5;
import p153l.psd0;
import p153l.q7m;
import p153l.u7m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserProfileExpandedBaseLayout extends BaseExpandedView implements u7m {
    public UserProfileExpandedBaseLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: B0 */
    public boolean mo37806B0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, q7m q7mVar, CoreSuggested.UserInfo userInfo, int i) {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: C */
    public void mo37809C() {
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: D */
    public boolean mo37812D(String str) {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: F */
    public boolean mo38919F() {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: R */
    public boolean mo38920R() {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: U */
    public void mo37857U() {
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: e0 */
    public boolean mo37886e0() {
        return true;
    }

    @Override // p153l.q7m
    public abstract /* synthetic */ ik4 getCardData();

    @Override // p153l.xql
    public abstract /* synthetic */ ik4 getCardDataProxy();

    @Override // p153l.q7m, p153l.rql
    public abstract /* synthetic */ View getCardView();

    public abstract /* synthetic */ View getCardViewProxy();

    @Override // p153l.xql
    public abstract /* synthetic */ CoreMomentInfo getMomentInfoProxy();

    @Override // p153l.xql
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p153l.lql
    public abstract /* synthetic */ CoreSuggested.UserInfo getUserInfoProxy();

    @Override // p153l.xql
    public abstract /* synthetic */ User getUserProxy();

    @Override // p153l.q7m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m38921l1(String str, User user, CoreSuggested.UserInfo userInfo, int i, final Runnable runnable) {
        Act act;
        if (mp5.m159342h().m159345i(str) || (act = (Act) bnl0.m105508E(this)) == null) {
            return;
        }
        act.duringCreated(mp5.m159342h().m159343f(str).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.ugk0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }, new y20() { // from class: l.vgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: q0 */
    public boolean mo37925q0() {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: s */
    public void mo37932s() {
        m39028e1();
    }

    @Override // p153l.q7m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(atl atlVar) {
        super.setExpandedScrollListener(atlVar);
    }

    @Override // p153l.q7m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC8014d interfaceC8014d) {
    }

    @Override // p153l.q7m
    public /* bridge */ /* synthetic */ void setUndoClickAction(x20 x20Var) {
        super.setUndoClickAction(x20Var);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: y */
    public boolean mo37950y() {
        return true;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: z */
    public boolean mo37953z() {
        return false;
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.q7m
    public void setUsHomeCardAnimHelper(fqj0 fqj0Var) {
    }
}
