package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame_Shadow;
import p151v.VText;
import p153l.bnl0;
import p153l.dw00;
import p153l.i4g0;
import p153l.iam;
import p153l.k9c0;
import p153l.l51;
import p153l.lbc0;
import p153l.mrb0;
import p153l.o1j0;
import p153l.oki;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.tec0;
import p153l.uqb0;
import p153l.uv00;
import p153l.vel0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11573b implements iam<uv00>, C11572a.b {

    /* JADX INFO: renamed from: a */
    public FrameLayout f44825a;

    /* JADX INFO: renamed from: b */
    public VFrame_Shadow f44826b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f44827c;

    /* JADX INFO: renamed from: d */
    public VText f44828d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f44829e;

    /* JADX INFO: renamed from: f */
    public VEditText f44830f;

    /* JADX INFO: renamed from: g */
    public VText f44831g;

    /* JADX INFO: renamed from: h */
    public View f44832h;

    /* JADX INFO: renamed from: i */
    public MomentsOrStoriesFeedPage f44833i;

    /* JADX INFO: renamed from: j */
    public final MomentsFeedFrag f44834j;

    /* JADX INFO: renamed from: k */
    public y20<Boolean> f44835k = new y20() { // from class: l.vv00
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f185882a.m68222C((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public boolean f44836l = false;

    /* JADX INFO: renamed from: m */
    public boolean f44837m = false;

    /* JADX INFO: renamed from: n */
    public View f44838n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$a */
    public class a extends RecyclerView.AbstractC0584t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C11573b.this.m68223H();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (NullChecker.m82486a(C11573b.this.f44833i) && NullChecker.m82486a(C11573b.this.f44833i.f44815T) && C11573b.this.f44833i.f44815T.getMeasuredHeight() > 0) {
                C11573b.this.m68223H();
                C11573b.this.f44833i.f44815T.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public C11573b(MomentsFeedFrag momentsFeedFrag) {
        this.f44834j = momentsFeedFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m68220A(CharSequence charSequence) {
        Editable text = this.f44830f.getText();
        this.f44831g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m68221B(View view) {
        this.f44833i.f44815T.scrollToPosition(0);
        this.f44833i.f44815T.smoothScrollBy(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m68222C(Boolean bool) {
        this.f44833i.f44815T.f44753n.call(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m68223H() {
        MomentsFeedRecyclerList momentsFeedRecyclerList;
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f44833i;
        if (momentsOrStoriesFeedPage == null || (momentsFeedRecyclerList = momentsOrStoriesFeedPage.f44815T) == null || momentsFeedRecyclerList.f44743d == null || !ConnectivityReceiver.m82472l()) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager = this.f44833i.f44815T.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ArrayList arrayList = new ArrayList();
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                String strM68082I = this.f44833i.f44815T.f44743d.m68082I(iFindFirstVisibleItemPosition);
                if (!TextUtils.isEmpty(strM68082I) && strM68082I.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(strM68082I);
                }
            }
            if (arrayList.size() > 0) {
                uqb0.m197248T0(arrayList);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f44834j.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m68233E(IntlOperationBanner intlOperationBanner, View view) {
        i4g0.m138523u("e_community_icon", "p_moments_view", pf60.m172085a("intl_campaign_id", NullChecker.m82486a(intlOperationBanner) ? intlOperationBanner.f39611id : ""));
        FeedModule.m61406H().mo31807pa(getAct(), 0, null, null);
    }

    /* JADX INFO: renamed from: F */
    public void m68234F(int i, int i2, Intent intent) {
        this.f44833i.f44815T.m68075U(i, i2, intent);
    }

    /* JADX INFO: renamed from: G */
    public void m68235G(List<Media> list) {
        if (!NullChecker.m82487b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new vel0(oki.m168038z(list.get(0).url)).f183806b <= 15000) {
            m68239n(list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        } else {
            o1j0.m165634h(R$string.f40035z3);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m68236I(boolean z, int i, final IntlOperationBanner intlOperationBanner, boolean z2) {
        Objects.toString(intlOperationBanner);
        this.f44836l = z;
        if (z && !this.f44837m) {
            i4g0.m138492A("e_community_icon", "p_moments_view", pf60.m172085a("intl_campaign_id", NullChecker.m82486a(intlOperationBanner) ? intlOperationBanner.f39611id : ""));
            this.f44837m = true;
        }
        if (this.f44836l && this.f44829e.getVisibility() == 4) {
            bnl0.m105524M(this.f44826b, true);
        } else {
            bnl0.m105524M(this.f44826b, false);
        }
        VText vText = this.f44828d;
        if (i == 0) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f44828d.setText(String.valueOf(i));
        }
        if (!NullChecker.m82486a(intlOperationBanner) || TextUtils.isEmpty(intlOperationBanner.icon.url)) {
            if (z2) {
                getAct().postDelayed(new Runnable() { // from class: l.bw00
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedModule.m61406H().mo31702Jq();
                    }
                }, 2000L);
            }
            this.f44827c.setActualImageResource(lbc0.f131138s3);
        } else {
            uqb0.f180374G.m127115L0(this.f44827c, intlOperationBanner.icon.url);
        }
        bnl0.m105509E0(this.f44826b, new View.OnClickListener() { // from class: l.cw00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84083a.m68233E(intlOperationBanner, view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f44834j.act();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f44838n = m68237l(layoutInflater, viewGroup);
        this.f44833i = (MomentsOrStoriesFeedPage) getAct().inflater().inflate(tec0.f173512H4, viewGroup, false);
        return this.f44838n;
    }

    /* JADX INFO: renamed from: l */
    public View m68237l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dw00.m118348b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m68239n(ArrayList<Media> arrayList) {
        this.f44833i.f44815T.m68069O(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m68240p(boolean z) {
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f44833i;
        if (z) {
            momentsOrStoriesFeedPage.f44815T.setOnTouchListener(new View.OnTouchListener() { // from class: l.aw00
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f73682a.m68246x(view, motionEvent);
                }
            });
        } else {
            momentsOrStoriesFeedPage.f44815T.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m68241q(boolean z) {
        if (z && NullChecker.m82487b(getAct())) {
            getAct().hideInput(this.f44830f);
        }
        m68240p(false);
        this.f44829e.setVisibility(4);
        l51.m152889I(this.f44834j, new Runnable() { // from class: l.yv00
            @Override // java.lang.Runnable
            public final void run() {
                this.f201673a.m68247y();
            }
        }, 200L);
        this.f44834j.m21592m4(new Runnable() { // from class: l.zv00
            @Override // java.lang.Runnable
            public final void run() {
                this.f206179a.m68248z();
            }
        }, 500);
        mrb0.m159638P(getAct(), true);
    }

    /* JADX INFO: renamed from: s */
    public void m68242s() {
        mrb0.m159670x(getAct());
        m68240p(true);
        bnl0.m105500A(this.f44830f);
        if (this.f44836l && NullChecker.m82487b(this.f44826b)) {
            this.f44826b.setVisibility(4);
        }
        this.f44829e.setVisibility(0);
        getAct().showInput(this.f44830f, 0);
    }

    /* JADX INFO: renamed from: u */
    public void m68243u() {
        C11572a c11572a = new C11572a(this.f44833i.f44815T);
        c11572a.m68216q(this);
        this.f44833i.f44815T.m68077W(c11572a, true, this.f44834j);
        if (NullChecker.m82486a(this.f44838n)) {
            getAct().duringCreated(Act.keyboardListenerObservable(this.f44838n)).subscribe(this.f44835k);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m68244v(Bundle bundle) {
        Act act = getAct();
        if (act == null) {
            return;
        }
        this.f44830f.mo29617i(true).subscribe(psd0.m173596G(new y20() { // from class: l.wv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190900a.m68220A((CharSequence) obj);
            }
        }));
        if (NullChecker.m82486a(getAct().toolbar())) {
            bnl0.m105581t(getAct().toolbar(), new y20() { // from class: l.xv00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196346a.m68221B((View) obj);
                }
            });
        }
        this.f44833i.setBackgroundColor(act.getResources().getColor(k9c0.f124488T));
        this.f44833i.setClipChildren(false);
        this.f44825a.addView(this.f44833i, 2);
        this.f44833i.f44815T.setFoldLimit(10);
        this.f44833i.f44815T.setOnScrollListener(new a());
        this.f44833i.f44815T.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        bnl0.m105540X(this.f44833i, qa00.m175859d(8.0f));
    }

    /* JADX INFO: renamed from: w */
    public boolean m68245w() {
        return this.f44834j.isHidden();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m68246x(View view, MotionEvent motionEvent) {
        m68241q(true);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m68247y() {
        if (this.f44829e.getVisibility() == 4 && this.f44836l && NullChecker.m82487b(this.f44826b)) {
            this.f44826b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m68248z() {
        if (this.f44829e.getVisibility() == 4) {
            this.f44830f.setText("");
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uv00 uv00Var) {
    }
}
