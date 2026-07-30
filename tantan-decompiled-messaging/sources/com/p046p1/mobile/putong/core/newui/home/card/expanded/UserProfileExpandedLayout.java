package com.p046p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.f4v;
import p149l.i8k0;
import p149l.io5;
import p149l.jj4;
import p149l.oql;
import p149l.xy50;
import p149l.zkf;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedLayout extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public CoreSuggested.UserInfo f22332A;

    /* JADX INFO: renamed from: B */
    public int f22333B;

    /* JADX INFO: renamed from: w */
    public boolean f22334w;

    /* JADX INFO: renamed from: x */
    public zkf f22335x;

    /* JADX INFO: renamed from: y */
    public jj4 f22336y;

    /* JADX INFO: renamed from: z */
    public User f22337z;

    public UserProfileExpandedLayout(@NonNull Context context) {
        super(context);
        this.f22334w = false;
        this.f22336y = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m37986Q0() {
        zkf zkfVar = new zkf(getContext());
        this.f22335x = zkfVar;
        setAdapter(zkfVar);
    }

    @Override // p149l.e5m
    /* JADX INFO: renamed from: H */
    public View mo37923H() {
        return null;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: T */
    public void mo36852T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        f4v.m119459f().m119467m(userInfo.f19472id);
        xy50.m211730d().m211734g(userInfo.f19472id);
        io5.m137292h().m137299m(userInfo.f19472id);
        this.f22337z = user;
        this.f22332A = userInfo;
        this.f22333B = i;
        this.f22335x.m219179m(userInfo, user, i);
        m37918l1(userInfo.f19472id, user, this.f22332A, i, new Runnable() { // from class: l.h8k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106449a.m37989o1(user, i);
            }
        });
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo36864Y() {
        return null;
    }

    @Override // p149l.e5m
    /* JADX INFO: renamed from: c */
    public boolean mo37924c() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    public jj4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public jj4 getCardDataProxy() {
        if (this.f22336y == null) {
            jj4 jj4Var = new jj4(this);
            this.f22336y = jj4Var;
            jj4Var.m141749h(new jj4.C17798a());
        }
        this.f22336y.m141750i(this.f22337z);
        this.f22336y.m141751j(this.f22332A);
        this.f22336y.m141743b().f118237e = mo36947y();
        if (NullChecker.m81303a(this.f22337z)) {
            this.f22336y.m141743b().f118235c = this.f22337z.pictures;
        }
        return this.f22336y;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m, p149l.gol
    public View getCardView() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f22332A;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public User getUserProxy() {
        return this.f22337z;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo36898j0(SwipeDirection swipeDirection) {
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: m */
    public void mo36908m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: n1 */
    public final void m37988n1(View view) {
        i8k0.m134974a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m37989o1(User user, int i) {
        this.f22335x.m219179m(this.f22332A, user, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37988n1(this);
        m37986Q0();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: r */
    public void mo36925r() {
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo36932t() {
        return null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22334w = false;
        this.f22336y = null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22334w = false;
        this.f22336y = null;
    }
}
