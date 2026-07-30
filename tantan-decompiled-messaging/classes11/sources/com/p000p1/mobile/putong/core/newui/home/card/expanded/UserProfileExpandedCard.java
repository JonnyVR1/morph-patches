package com.p000p1.mobile.putong.core.newui.home.card.expanded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.C0113a;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.j760;
import l.vwb;
import p009l.ce50;
import p009l.f4v;
import p009l.io5;
import p009l.jj4;
import p009l.mdj0;
import p009l.nql;
import p009l.oql;
import p009l.p3l;
import p009l.xy50;
import p009l.zkf;
import p009l.zwk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserProfileExpandedCard extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public int f1039A;

    /* JADX INFO: renamed from: B */
    public j760<String, Boolean> f1040B;

    /* JADX INFO: renamed from: C */
    public nql f1041C;

    /* JADX INFO: renamed from: D */
    public mdj0 f1042D;

    /* JADX INFO: renamed from: w */
    public zkf f1043w;

    /* JADX INFO: renamed from: x */
    public jj4 f1044x;

    /* JADX INFO: renamed from: y */
    public User f1045y;

    /* JADX INFO: renamed from: z */
    public CoreSuggested.UserInfo f1046z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard$a */
    public class C0108a implements ce50 {
        public C0108a() {
        }

        @Override // p009l.ce50
        /* JADX INFO: renamed from: J */
        public j760<String, Boolean> mo1903J() {
            return UserProfileExpandedCard.this.f1040B;
        }

        @Override // p009l.ce50
        /* JADX INFO: renamed from: l */
        public mdj0 mo1904l() {
            return UserProfileExpandedCard.this.f1042D;
        }
    }

    public UserProfileExpandedCard(@NonNull Context context) {
        super(context);
        this.f1044x = null;
        this.f1039A = -1;
        this.f1041C = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m1893Q0() {
        zkf zkfVar = new zkf(getContext());
        this.f1043w = zkfVar;
        zkfVar.m25850n(new C0108a());
        setAdapter(this.f1043w);
    }

    @Override // p009l.iol
    /* JADX INFO: renamed from: A0 */
    public void mo1896A0(View view) {
        super.mo1896A0(view);
        m1996c1(false);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: G */
    public void mo773G() {
        mo778I();
    }

    @Override // p009l.e5m
    /* JADX INFO: renamed from: H */
    public View mo1897H() {
        if (this.f1043w.m25847k() != null) {
            return this.f1043w.m25847k().f23956E.f1339d;
        }
        return null;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: I */
    public void mo778I() {
        m1995c0();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: T */
    public void mo810T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        CoreSuggested.UserInfo userInfo2;
        f4v.m14251f().m14259m(userInfo.id);
        xy50.m25067d().m25071g(userInfo.id);
        io5.m16650h().m16657m(userInfo.id);
        User user2 = this.f1045y;
        if (user2 != null && user2 == user && (userInfo2 = this.f1046z) != null && userInfo2 == userInfo && this.f1039A == i) {
            return;
        }
        this.f1045y = user;
        this.f1046z = userInfo;
        userInfo.setRenderUser(user);
        this.f1039A = i;
        this.f1043w.m25849m(this.f1046z, user, i);
        m1892l1(userInfo.id, user, this.f1046z, i, new Runnable() { // from class: l.q7k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19059a.m1900p1(user, i);
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
        if (this.f1043w.m25847k() != null) {
            return this.f1043w.m25847k().m26088j0();
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    public jj4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public jj4 getCardDataProxy() {
        zwk zwkVar;
        if (this.f1044x == null) {
            jj4 jj4Var = new jj4(this);
            this.f1044x = jj4Var;
            jj4Var.m17134h(new jj4.C0976a());
        }
        this.f1044x.m17135i(this.f1045y);
        this.f1044x.m17136j(this.f1046z);
        this.f1044x.m17128b().f15205e = mo914y();
        List<C0113a> rendingList = getRendingList();
        if (vwb.J(rendingList)) {
            zwkVar = null;
            break;
        }
        Iterator<C0113a> it = rendingList.iterator();
        while (true) {
            if (!it.hasNext()) {
                zwkVar = null;
                break;
            }
            C0113a next = it.next();
            if (next.m2056a() instanceof zwk) {
                zwkVar = (zwk) next.m2056a();
                break;
            }
        }
        if (NullChecker.a(zwkVar)) {
            this.f1044x.m17128b().f15201a = zwkVar.mo23067b();
            this.f1044x.m17128b().f15202b = zwkVar.mo23068c();
            this.f1044x.m17128b().f15204d = zwkVar.mo23069d();
        }
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(rendingList)) {
            for (int i = 0; i <= getLatestRenderIndex(); i++) {
                HomeCardExpandedType homeCardExpandedTypeCreateType = HomeCardExpandedType.createType(rendingList.get(i).getType());
                arrayList.add(homeCardExpandedTypeCreateType == null ? "unknown" : homeCardExpandedTypeCreateType.getAlias());
            }
            this.f1044x.m17128b().f15206f = arrayList;
        }
        if (NullChecker.a(this.f1045y)) {
            this.f1044x.m17128b().f15203c = this.f1045y.pictures;
        }
        return this.f1044x;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m, p009l.gol
    public View getCardView() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    public PictureView getGuidePictureView() {
        if (this.f1043w.m25847k() != null) {
            return this.f1043w.m25847k().f23987h.getCurrentView();
        }
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f1046z;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.mol
    public User getUserProxy() {
        return this.f1045y;
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

    @Override // p009l.iol
    /* JADX INFO: renamed from: k */
    public void mo864k(boolean z) {
        super.mo864k(z);
        m1976I0(z);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: m */
    public void mo872m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: o1 */
    public void m1899o1(nql nqlVar) {
        this.f1041C = nqlVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1893Q0();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m1900p1(User user, int i) {
        this.f1043w.m25849m(this.f1046z, user, i);
    }

    /* JADX INFO: renamed from: q1 */
    public void m1901q1() {
        List<C0113a> rendingList = getRendingList();
        if (vwb.J(rendingList)) {
            return;
        }
        for (C0113a c0113a : rendingList) {
            if (c0113a.m2057b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c0113a.m2056a() instanceof p3l)) {
                ((p3l) c0113a.m2056a()).mo20100y();
            }
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: r */
    public void mo891r() {
    }

    /* JADX INFO: renamed from: r1 */
    public void m1902r1(float f) {
        List<C0113a> rendingList = getRendingList();
        if (vwb.J(rendingList)) {
            return;
        }
        for (C0113a c0113a : rendingList) {
            if (c0113a.m2057b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c0113a.m2056a() instanceof p3l)) {
                ((p3l) c0113a.m2056a()).mo20101z(f);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    public void setTwoFingerHelper(mdj0 mdj0Var) {
        this.f1042D = mdj0Var;
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

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p009l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo914y() {
        return true;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1044x = null;
        this.f1039A = -1;
        this.f1041C = null;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1044x = null;
        this.f1039A = -1;
        this.f1041C = null;
    }
}
