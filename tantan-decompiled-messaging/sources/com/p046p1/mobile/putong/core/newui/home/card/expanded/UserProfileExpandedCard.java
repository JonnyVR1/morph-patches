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
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.C7949a;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.ce50;
import p149l.d30;
import p149l.f4v;
import p149l.io5;
import p149l.j760;
import p149l.jj4;
import p149l.mdj0;
import p149l.nql;
import p149l.oql;
import p149l.p3l;
import p149l.vwb;
import p149l.xy50;
import p149l.zkf;
import p149l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedCard extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public int f22261A;

    /* JADX INFO: renamed from: B */
    public j760<String, Boolean> f22262B;

    /* JADX INFO: renamed from: C */
    public nql f22263C;

    /* JADX INFO: renamed from: D */
    public mdj0 f22264D;

    /* JADX INFO: renamed from: w */
    public zkf f22265w;

    /* JADX INFO: renamed from: x */
    public jj4 f22266x;

    /* JADX INFO: renamed from: y */
    public User f22267y;

    /* JADX INFO: renamed from: z */
    public CoreSuggested.UserInfo f22268z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard$a */
    public class C7944a implements ce50 {
        public C7944a() {
        }

        @Override // p149l.ce50
        /* JADX INFO: renamed from: J */
        public j760<String, Boolean> mo37929J() {
            return UserProfileExpandedCard.this.f22262B;
        }

        @Override // p149l.ce50
        /* JADX INFO: renamed from: l */
        public mdj0 mo37930l() {
            return UserProfileExpandedCard.this.f22264D;
        }
    }

    public UserProfileExpandedCard(@NonNull Context context) {
        super(context);
        this.f22266x = null;
        this.f22261A = -1;
        this.f22263C = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m37919Q0() {
        zkf zkfVar = new zkf(getContext());
        this.f22265w = zkfVar;
        zkfVar.m219180n(new C7944a());
        setAdapter(this.f22265w);
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: A0 */
    public void mo37922A0(View view) {
        super.mo37922A0(view);
        m38022c1(false);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: G */
    public void mo36817G() {
        mo36822I();
    }

    @Override // p149l.e5m
    /* JADX INFO: renamed from: H */
    public View mo37923H() {
        if (this.f22265w.m219177k() != null) {
            return this.f22265w.m219177k().f205183E.f22561d;
        }
        return null;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: I */
    public void mo36822I() {
        m38021c0();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: T */
    public void mo36852T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        CoreSuggested.UserInfo userInfo2;
        f4v.m119459f().m119467m(userInfo.f19472id);
        xy50.m211730d().m211734g(userInfo.f19472id);
        io5.m137292h().m137299m(userInfo.f19472id);
        User user2 = this.f22267y;
        if (user2 != null && user2 == user && (userInfo2 = this.f22268z) != null && userInfo2 == userInfo && this.f22261A == i) {
            return;
        }
        this.f22267y = user;
        this.f22268z = userInfo;
        userInfo.setRenderUser(user);
        this.f22261A = i;
        this.f22265w.m219179m(this.f22268z, user, i);
        m37918l1(userInfo.f19472id, user, this.f22268z, i, new Runnable() { // from class: l.q7k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153055a.m37926p1(user, i);
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
        if (this.f22265w.m219177k() != null) {
            return this.f22265w.m219177k().m220643j0();
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    public jj4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public jj4 getCardDataProxy() {
        zwk zwkVar;
        if (this.f22266x == null) {
            jj4 jj4Var = new jj4(this);
            this.f22266x = jj4Var;
            jj4Var.m141749h(new jj4.C17798a());
        }
        this.f22266x.m141750i(this.f22267y);
        this.f22266x.m141751j(this.f22268z);
        this.f22266x.m141743b().f118237e = mo36947y();
        List<C7949a> rendingList = getRendingList();
        if (vwb.m200296J(rendingList)) {
            zwkVar = null;
            break;
        }
        Iterator<C7949a> it = rendingList.iterator();
        while (true) {
            if (!it.hasNext()) {
                zwkVar = null;
                break;
            }
            C7949a next = it.next();
            if (next.m38082a() instanceof zwk) {
                zwkVar = (zwk) next.m38082a();
                break;
            }
        }
        if (NullChecker.m81303a(zwkVar)) {
            this.f22266x.m141743b().f118233a = zwkVar.mo194344b();
            this.f22266x.m141743b().f118234b = zwkVar.mo194345c();
            this.f22266x.m141743b().f118236d = zwkVar.mo194346d();
        }
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(rendingList)) {
            for (int i = 0; i <= getLatestRenderIndex(); i++) {
                HomeCardExpandedType homeCardExpandedTypeCreateType = HomeCardExpandedType.createType(rendingList.get(i).getType());
                arrayList.add(homeCardExpandedTypeCreateType == null ? "unknown" : homeCardExpandedTypeCreateType.getAlias());
            }
            this.f22266x.m141743b().f118238f = arrayList;
        }
        if (NullChecker.m81303a(this.f22267y)) {
            this.f22266x.m141743b().f118235c = this.f22267y.pictures;
        }
        return this.f22266x;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m, p149l.gol
    public View getCardView() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    public PictureView getGuidePictureView() {
        if (this.f22265w.m219177k() != null) {
            return this.f22265w.m219177k().f205214h.getCurrentView();
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f22268z;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.mol
    public User getUserProxy() {
        return this.f22267y;
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

    @Override // p149l.iol
    /* JADX INFO: renamed from: k */
    public void mo36901k(boolean z) {
        super.mo36901k(z);
        m38002I0(z);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: m */
    public void mo36908m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: o1 */
    public void m37925o1(nql nqlVar) {
        this.f22263C = nqlVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37919Q0();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m37926p1(User user, int i) {
        this.f22265w.m219179m(this.f22268z, user, i);
    }

    /* JADX INFO: renamed from: q1 */
    public void m37927q1() {
        List<C7949a> rendingList = getRendingList();
        if (vwb.m200296J(rendingList)) {
            return;
        }
        for (C7949a c7949a : rendingList) {
            if (c7949a.m38083b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c7949a.m38082a() instanceof p3l)) {
                ((p3l) c7949a.m38082a()).mo167254y();
            }
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: r */
    public void mo36925r() {
    }

    /* JADX INFO: renamed from: r1 */
    public void m37928r1(float f) {
        List<C7949a> rendingList = getRendingList();
        if (vwb.m200296J(rendingList)) {
            return;
        }
        for (C7949a c7949a : rendingList) {
            if (c7949a.m38083b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c7949a.m38082a() instanceof p3l)) {
                ((p3l) c7949a.m38082a()).mo167255z(f);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    public void setTwoFingerHelper(mdj0 mdj0Var) {
        this.f22264D = mdj0Var;
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

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p149l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo36947y() {
        return true;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22266x = null;
        this.f22261A = -1;
        this.f22263C = null;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22266x = null;
        this.f22261A = -1;
        this.f22263C = null;
    }
}
