package com.p051p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.atl;
import p153l.c760;
import p153l.fmf;
import p153l.g6v;
import p153l.ik4;
import p153l.mp5;
import p153l.ohk0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedLayout extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public CoreSuggested.UserInfo f23074A;

    /* JADX INFO: renamed from: B */
    public int f23075B;

    /* JADX INFO: renamed from: w */
    public boolean f23076w;

    /* JADX INFO: renamed from: x */
    public fmf f23077x;

    /* JADX INFO: renamed from: y */
    public ik4 f23078y;

    /* JADX INFO: renamed from: z */
    public User f23079z;

    public UserProfileExpandedLayout(@NonNull Context context) {
        super(context);
        this.f23076w = false;
        this.f23078y = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m38989Q0() {
        fmf fmfVar = new fmf(getContext());
        this.f23077x = fmfVar;
        setAdapter(fmfVar);
    }

    @Override // p153l.u7m
    /* JADX INFO: renamed from: H */
    public View mo38926H() {
        return null;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: T */
    public void mo37855T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        g6v.m129273f().m129281m(userInfo.f20214id);
        c760.m108287d().m108291g(userInfo.f20214id);
        mp5.m159342h().m159349m(userInfo.f20214id);
        this.f23079z = user;
        this.f23074A = userInfo;
        this.f23075B = i;
        this.f23077x.m126233m(userInfo, user, i);
        m38921l1(userInfo.f20214id, user, this.f23074A, i, new Runnable() { // from class: l.nhk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141998a.m38992o1(user, i);
            }
        });
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: Y */
    public PictureView mo37867Y() {
        return null;
    }

    @Override // p153l.u7m
    /* JADX INFO: renamed from: c */
    public boolean mo38927c() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    public ik4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public ik4 getCardDataProxy() {
        if (this.f23078y == null) {
            ik4 ik4Var = new ik4(this);
            this.f23078y = ik4Var;
            ik4Var.m140263h(new ik4.C17729a());
        }
        this.f23078y.m140264i(this.f23079z);
        this.f23078y.m140265j(this.f23074A);
        this.f23078y.m140257b().f115333e = mo37950y();
        if (NullChecker.m82486a(this.f23079z)) {
            this.f23078y.m140257b().f115331c = this.f23079z.pictures;
        }
        return this.f23078y;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m, p153l.rql
    public View getCardView() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f23074A;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public User getUserProxy() {
        return this.f23079z;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: j0 */
    public void mo37901j0(SwipeDirection swipeDirection) {
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: m */
    public void mo37911m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: n1 */
    public final void m38991n1(View view) {
        ohk0.m167702a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m38992o1(User user, int i) {
        this.f23077x.m126233m(this.f23074A, user, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38991n1(this);
        m38989Q0();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: r */
    public void mo37928r() {
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(atl atlVar) {
        super.setExpandedScrollListener(atlVar);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    public /* bridge */ /* synthetic */ void setUndoClickAction(x20 x20Var) {
        super.setUndoClickAction(x20Var);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: t */
    public ViewStub mo37935t() {
        return null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23076w = false;
        this.f23078y = null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23076w = false;
        this.f23078y = null;
    }
}
