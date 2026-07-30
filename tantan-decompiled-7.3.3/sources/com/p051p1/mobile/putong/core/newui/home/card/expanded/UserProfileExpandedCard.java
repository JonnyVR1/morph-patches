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
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.C8100a;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.atl;
import p153l.c760;
import p153l.f6l;
import p153l.fmf;
import p153l.g6v;
import p153l.ik4;
import p153l.jm50;
import p153l.jyb;
import p153l.mp5;
import p153l.pf60;
import p153l.pzk;
import p153l.qmj0;
import p153l.x20;
import p153l.zsl;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedCard extends UserProfileExpandedBaseLayout {

    /* JADX INFO: renamed from: A */
    public int f23003A;

    /* JADX INFO: renamed from: B */
    public pf60<String, Boolean> f23004B;

    /* JADX INFO: renamed from: C */
    public zsl f23005C;

    /* JADX INFO: renamed from: D */
    public qmj0 f23006D;

    /* JADX INFO: renamed from: w */
    public fmf f23007w;

    /* JADX INFO: renamed from: x */
    public ik4 f23008x;

    /* JADX INFO: renamed from: y */
    public User f23009y;

    /* JADX INFO: renamed from: z */
    public CoreSuggested.UserInfo f23010z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard$a */
    public class C8095a implements jm50 {
        public C8095a() {
        }

        @Override // p153l.jm50
        /* JADX INFO: renamed from: J */
        public pf60<String, Boolean> mo38932J() {
            return UserProfileExpandedCard.this.f23004B;
        }

        @Override // p153l.jm50
        /* JADX INFO: renamed from: l */
        public qmj0 mo38933l() {
            return UserProfileExpandedCard.this.f23006D;
        }
    }

    public UserProfileExpandedCard(@NonNull Context context) {
        super(context);
        this.f23008x = null;
        this.f23003A = -1;
        this.f23005C = null;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m38922Q0() {
        fmf fmfVar = new fmf(getContext());
        this.f23007w = fmfVar;
        fmfVar.m126234n(new C8095a());
        setAdapter(this.f23007w);
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: A0 */
    public void mo38925A0(View view) {
        super.mo38925A0(view);
        m39025c1(false);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: G */
    public void mo37820G() {
        mo37825I();
    }

    @Override // p153l.u7m
    /* JADX INFO: renamed from: H */
    public View mo38926H() {
        if (this.f23007w.m126231k() != null) {
            return this.f23007w.m126231k().f154879E.f23303d;
        }
        return null;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: I */
    public void mo37825I() {
        m39024c0();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: T */
    public void mo37855T(final User user, CoreSuggested.UserInfo userInfo, final int i) {
        CoreSuggested.UserInfo userInfo2;
        g6v.m129273f().m129281m(userInfo.f20214id);
        c760.m108287d().m108291g(userInfo.f20214id);
        mp5.m159342h().m159349m(userInfo.f20214id);
        User user2 = this.f23009y;
        if (user2 != null && user2 == user && (userInfo2 = this.f23010z) != null && userInfo2 == userInfo && this.f23003A == i) {
            return;
        }
        this.f23009y = user;
        this.f23010z = userInfo;
        userInfo.setRenderUser(user);
        this.f23003A = i;
        this.f23007w.m126233m(this.f23010z, user, i);
        m38921l1(userInfo.f20214id, user, this.f23010z, i, new Runnable() { // from class: l.wgk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188982a.m38929p1(user, i);
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
        if (this.f23007w.m126231k() != null) {
            return this.f23007w.m126231k().m174512j0();
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    public ik4 getCardData() {
        return getCardDataProxy();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public ik4 getCardDataProxy() {
        pzk pzkVar;
        if (this.f23008x == null) {
            ik4 ik4Var = new ik4(this);
            this.f23008x = ik4Var;
            ik4Var.m140263h(new ik4.C17729a());
        }
        this.f23008x.m140264i(this.f23009y);
        this.f23008x.m140265j(this.f23010z);
        this.f23008x.m140257b().f115333e = mo37950y();
        List<C8100a> rendingList = getRendingList();
        if (jyb.m147479J(rendingList)) {
            pzkVar = null;
            break;
        }
        Iterator<C8100a> it = rendingList.iterator();
        while (true) {
            if (!it.hasNext()) {
                pzkVar = null;
                break;
            }
            C8100a next = it.next();
            if (next.m39085a() instanceof pzk) {
                pzkVar = (pzk) next.m39085a();
                break;
            }
        }
        if (NullChecker.m82486a(pzkVar)) {
            this.f23008x.m140257b().f115329a = pzkVar.mo99070b();
            this.f23008x.m140257b().f115330b = pzkVar.mo99071c();
            this.f23008x.m140257b().f115332d = pzkVar.mo99072d();
        }
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(rendingList)) {
            for (int i = 0; i <= getLatestRenderIndex(); i++) {
                HomeCardExpandedType homeCardExpandedTypeCreateType = HomeCardExpandedType.createType(rendingList.get(i).getType());
                arrayList.add(homeCardExpandedTypeCreateType == null ? "unknown" : homeCardExpandedTypeCreateType.getAlias());
            }
            this.f23008x.m140257b().f115334f = arrayList;
        }
        if (NullChecker.m82486a(this.f23009y)) {
            this.f23008x.m140257b().f115331c = this.f23009y.pictures;
        }
        return this.f23008x;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m, p153l.rql
    public View getCardView() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout
    public View getCardViewProxy() {
        return this;
    }

    public PictureView getGuidePictureView() {
        if (this.f23007w.m126231k() != null) {
            return this.f23007w.m126231k().f154910h.getCurrentView();
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f23010z;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.xql
    public User getUserProxy() {
        return this.f23009y;
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

    @Override // p153l.tql
    /* JADX INFO: renamed from: k */
    public void mo37904k(boolean z) {
        super.mo37904k(z);
        m39005I0(z);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: m */
    public void mo37911m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
    }

    /* JADX INFO: renamed from: o1 */
    public void m38928o1(zsl zslVar) {
        this.f23005C = zslVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38922Q0();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m38929p1(User user, int i) {
        this.f23007w.m126233m(this.f23010z, user, i);
    }

    /* JADX INFO: renamed from: q1 */
    public void m38930q1() {
        List<C8100a> rendingList = getRendingList();
        if (jyb.m147479J(rendingList)) {
            return;
        }
        for (C8100a c8100a : rendingList) {
            if (c8100a.m39086b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c8100a.m39085a() instanceof f6l)) {
                ((f6l) c8100a.m39085a()).mo124285y();
            }
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: r */
    public void mo37928r() {
    }

    /* JADX INFO: renamed from: r1 */
    public void m38931r1(float f) {
        List<C8100a> rendingList = getRendingList();
        if (jyb.m147479J(rendingList)) {
            return;
        }
        for (C8100a c8100a : rendingList) {
            if (c8100a.m39086b() == BaseExpandedView.ExpandedItemStatus.RENDING && (c8100a.m39085a() instanceof f6l)) {
                ((f6l) c8100a.m39085a()).mo124286z(f);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(atl atlVar) {
        super.setExpandedScrollListener(atlVar);
    }

    public void setTwoFingerHelper(qmj0 qmj0Var) {
        this.f23006D = qmj0Var;
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

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedBaseLayout, p153l.q7m
    /* JADX INFO: renamed from: y */
    public boolean mo37950y() {
        return true;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23008x = null;
        this.f23003A = -1;
        this.f23005C = null;
    }

    public UserProfileExpandedCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23008x = null;
        this.f23003A = -1;
        this.f23005C = null;
    }
}
