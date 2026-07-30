package com.p046p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;
import p149l.a5m;
import p149l.chj0;
import p149l.d30;
import p149l.e30;
import p149l.e5m;
import p149l.io5;
import p149l.jj4;
import p149l.mkd0;
import p149l.oql;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserProfileExpandedBaseLayout extends BaseExpandedView implements e5m {
    public UserProfileExpandedBaseLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo36803B0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: C */
    public void mo36806C() {
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo36809D(String str) {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: F */
    public boolean mo37916F() {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: R */
    public boolean mo37917R() {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: U */
    public void mo36854U() {
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo36883e0() {
        return true;
    }

    @Override // p149l.a5m
    public abstract /* synthetic */ jj4 getCardData();

    @Override // p149l.mol
    public abstract /* synthetic */ jj4 getCardDataProxy();

    @Override // p149l.a5m, p149l.gol
    public abstract /* synthetic */ View getCardView();

    public abstract /* synthetic */ View getCardViewProxy();

    @Override // p149l.mol
    public abstract /* synthetic */ CoreMomentInfo getMomentInfoProxy();

    @Override // p149l.mol
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p149l.aol
    public abstract /* synthetic */ CoreSuggested.UserInfo getUserInfoProxy();

    @Override // p149l.mol
    public abstract /* synthetic */ User getUserProxy();

    @Override // p149l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m37918l1(String str, User user, CoreSuggested.UserInfo userInfo, int i, final Runnable runnable) {
        Act act;
        if (io5.m137292h().m137295i(str) || (act = (Act) xdl0.m208328E(this)) == null) {
            return;
        }
        act.duringCreated(io5.m137292h().m137293f(str).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.o7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }, new e30() { // from class: l.p7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo36922q0() {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: s */
    public void mo36929s() {
        m38025e1();
    }

    @Override // p149l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // p149l.a5m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC7863d interfaceC7863d) {
    }

    @Override // p149l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo36947y() {
        return true;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo36950z() {
        return false;
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserProfileExpandedBaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
    }
}
