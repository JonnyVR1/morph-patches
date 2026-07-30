package com.p000p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.i8k0;
import p009l.f4v;
import p009l.io5;
import p009l.jj4;
import p009l.oql;
import p009l.xy50;
import p009l.zkf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserProfileExpandedLayout extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public CoreSuggested.UserInfo f1110A;

    /* JADX INFO: renamed from: B */
    public int f1111B;

    /* JADX INFO: renamed from: w */
    public boolean f1112w;

    /* JADX INFO: renamed from: x */
    public zkf f1113x;

    /* JADX INFO: renamed from: y */
    public jj4 f1114y;

    /* JADX INFO: renamed from: z */
    public User f1115z;

    public UserProfileExpandedLayout(@NonNull Context context) {
        super(context);
        this.f1112w = false;
        this.f1114y = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m1960Q0() {
        zkf zkfVar = new zkf(getContext());
        this.f1113x = zkfVar;
        setAdapter(zkfVar);
    }

    @Override // p009l.e5m
    /* JADX INFO: renamed from: H */
    public View mo1897H() {
        return null;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: T */
    public void mo810T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        f4v.m14251f().m14259m(userInfo.id);
        xy50.m25067d().m25071g(userInfo.id);
        io5.m16650h().m16657m(userInfo.id);
        this.f1115z = user;
        this.f1110A = userInfo;
        this.f1111B = i;
        this.f1113x.m25849m(userInfo, user, i);
        m1892l1(userInfo.id, user, this.f1110A, i, new Runnable() { // from class: l.h8k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13905a.m1963o1(user, i);
            }
        });
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo824Y() {
        return null;
    }

    @Override // p009l.e5m
    /* JADX INFO: renamed from: c */
    public boolean mo1898c() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    public jj4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public jj4 getCardDataProxy() {
        if (this.f1114y == null) {
            jj4 jj4Var = new jj4(this);
            this.f1114y = jj4Var;
            jj4Var.m17134h(new jj4.C0976a());
        }
        this.f1114y.m17135i(this.f1115z);
        this.f1114y.m17136j(this.f1110A);
        this.f1114y.m17128b().f15205e = mo914y();
        if (NullChecker.a(this.f1115z)) {
            this.f1114y.m17128b().f15203c = this.f1115z.pictures;
        }
        return this.f1114y;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m, p009l.gol
    public View getCardView() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f1110A;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public User getUserProxy() {
        return this.f1115z;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo861j0(SwipeDirection swipeDirection) {
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: m */
    public void mo872m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: n1 */
    public final void m1962n1(View view) {
        i8k0.a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m1963o1(User user, int i) {
        this.f1113x.m25849m(this.f1110A, user, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1962n1(this);
        m1960Q0();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: r */
    public void mo891r() {
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo898t() {
        return null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1112w = false;
        this.f1114y = null;
    }

    public UserProfileExpandedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1112w = false;
        this.f1114y = null;
    }
}
