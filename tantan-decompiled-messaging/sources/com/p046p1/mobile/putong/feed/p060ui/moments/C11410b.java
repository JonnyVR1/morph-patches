package com.p046p1.mobile.putong.feed.p060ui.moments;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame_Shadow;
import p147v.VText;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.ijb0;
import p149l.j760;
import p149l.ln00;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s7m;
import p149l.t100;
import p149l.un00;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11410b implements s7m<ln00>, C11409a.b {

    /* JADX INFO: renamed from: a */
    public FrameLayout f43977a;

    /* JADX INFO: renamed from: b */
    public VFrame_Shadow f43978b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43979c;

    /* JADX INFO: renamed from: d */
    public VText f43980d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f43981e;

    /* JADX INFO: renamed from: f */
    public VEditText f43982f;

    /* JADX INFO: renamed from: g */
    public VText f43983g;

    /* JADX INFO: renamed from: h */
    public View f43984h;

    /* JADX INFO: renamed from: i */
    public MomentsOrStoriesFeedPage f43985i;

    /* JADX INFO: renamed from: j */
    public final MomentsFeedFrag f43986j;

    /* JADX INFO: renamed from: k */
    public e30<Boolean> f43987k = new e30() { // from class: l.mn00
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f134725a.m67039C((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public boolean f43988l = false;

    /* JADX INFO: renamed from: m */
    public boolean f43989m = false;

    /* JADX INFO: renamed from: n */
    public View f43990n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$a */
    public class a extends RecyclerView.AbstractC0582t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C11410b.this.m67040H();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (NullChecker.m81303a(C11410b.this.f43985i) && NullChecker.m81303a(C11410b.this.f43985i.f43967T) && C11410b.this.f43985i.f43967T.getMeasuredHeight() > 0) {
                C11410b.this.m67040H();
                C11410b.this.f43985i.f43967T.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public C11410b(MomentsFeedFrag momentsFeedFrag) {
        this.f43986j = momentsFeedFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m67037A(CharSequence charSequence) {
        Editable text = this.f43982f.getText();
        this.f43983g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m67038B(View view) {
        this.f43985i.f43967T.scrollToPosition(0);
        this.f43985i.f43967T.smoothScrollBy(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m67039C(Boolean bool) {
        this.f43985i.f43967T.f43905n.call(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m67040H() {
        MomentsFeedRecyclerList momentsFeedRecyclerList;
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f43985i;
        if (momentsOrStoriesFeedPage == null || (momentsFeedRecyclerList = momentsOrStoriesFeedPage.f43967T) == null || momentsFeedRecyclerList.f43895d == null || !ConnectivityReceiver.m81289l()) {
            return;
        }
        RecyclerView.AbstractC0577o layoutManager = this.f43985i.f43967T.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ArrayList arrayList = new ArrayList();
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                String strM66899I = this.f43985i.f43967T.f43895d.m66899I(iFindFirstVisibleItemPosition);
                if (!TextUtils.isEmpty(strM66899I) && strM66899I.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(strM66899I);
                }
            }
            if (arrayList.size() > 0) {
                qib0.m174794T0(arrayList);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f43986j.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m67050E(IntlOperationBanner intlOperationBanner, View view) {
        zvf0.m220399u("e_community_icon", "p_moments_view", j760.m140076a("intl_campaign_id", NullChecker.m81303a(intlOperationBanner) ? intlOperationBanner.f38763id : ""));
        FeedModule.m60222H().mo30804pa(getAct(), 0, null, null);
    }

    /* JADX INFO: renamed from: F */
    public void m67051F(int i, int i2, Intent intent) {
        this.f43985i.f43967T.m66892U(i, i2, intent);
    }

    /* JADX INFO: renamed from: G */
    public void m67052G(List<Media> list) {
        if (!NullChecker.m81304b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.m179382z(list.get(0).url)).f157831b <= 15000) {
            m67056n(list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        } else {
            lsi0.m151578h(R$string.f39187z3);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m67053I(boolean z, int i, final IntlOperationBanner intlOperationBanner, boolean z2) {
        Objects.toString(intlOperationBanner);
        this.f43988l = z;
        if (z && !this.f43989m) {
            zvf0.m220368A("e_community_icon", "p_moments_view", j760.m140076a("intl_campaign_id", NullChecker.m81303a(intlOperationBanner) ? intlOperationBanner.f38763id : ""));
            this.f43989m = true;
        }
        if (this.f43988l && this.f43981e.getVisibility() == 4) {
            xdl0.m208344M(this.f43978b, true);
        } else {
            xdl0.m208344M(this.f43978b, false);
        }
        VText vText = this.f43980d;
        if (i == 0) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f43980d.setText(String.valueOf(i));
        }
        if (!NullChecker.m81303a(intlOperationBanner) || TextUtils.isEmpty(intlOperationBanner.icon.url)) {
            if (z2) {
                getAct().postDelayed(new Runnable() { // from class: l.sn00
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedModule.m60222H().mo30699Jq();
                    }
                }, 2000L);
            }
            this.f43979c.setActualImageResource(f3c0.f94620s3);
        } else {
            qib0.f154691G.m102331L0(this.f43979c, intlOperationBanner.icon.url);
        }
        xdl0.m208329E0(this.f43978b, new View.OnClickListener() { // from class: l.tn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171201a.m67050E(intlOperationBanner, view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f43986j.act();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f43990n = m67054l(layoutInflater, viewGroup);
        this.f43985i = (MomentsOrStoriesFeedPage) getAct().inflater().inflate(o6c0.f142043H4, viewGroup, false);
        return this.f43990n;
    }

    /* JADX INFO: renamed from: l */
    public View m67054l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return un00.m194413b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m67056n(ArrayList<Media> arrayList) {
        this.f43985i.f43967T.m66886O(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m67057p(boolean z) {
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f43985i;
        if (z) {
            momentsOrStoriesFeedPage.f43967T.setOnTouchListener(new View.OnTouchListener() { // from class: l.rn00
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f160230a.m67063x(view, motionEvent);
                }
            });
        } else {
            momentsOrStoriesFeedPage.f43967T.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m67058q(boolean z) {
        if (z && NullChecker.m81304b(getAct())) {
            getAct().hideInput(this.f43982f);
        }
        m67057p(false);
        this.f43981e.setVisibility(4);
        e51.m114744I(this.f43986j, new Runnable() { // from class: l.pn00
            @Override // java.lang.Runnable
            public final void run() {
                this.f150318a.m67064y();
            }
        }, 200L);
        this.f43986j.m20593m4(new Runnable() { // from class: l.qn00
            @Override // java.lang.Runnable
            public final void run() {
                this.f155373a.m67065z();
            }
        }, 500);
        ijb0.m136552P(getAct(), true);
    }

    /* JADX INFO: renamed from: s */
    public void m67059s() {
        ijb0.m136584x(getAct());
        m67057p(true);
        xdl0.m208320A(this.f43982f);
        if (this.f43988l && NullChecker.m81304b(this.f43978b)) {
            this.f43978b.setVisibility(4);
        }
        this.f43981e.setVisibility(0);
        getAct().showInput(this.f43982f, 0);
    }

    /* JADX INFO: renamed from: u */
    public void m67060u() {
        C11409a c11409a = new C11409a(this.f43985i.f43967T);
        c11409a.m67033q(this);
        this.f43985i.f43967T.m66894W(c11409a, true, this.f43986j);
        if (NullChecker.m81303a(this.f43990n)) {
            getAct().duringCreated(Act.keyboardListenerObservable(this.f43990n)).subscribe(this.f43987k);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m67061v(Bundle bundle) {
        Act act = getAct();
        if (act == null) {
            return;
        }
        this.f43982f.mo28618i(true).subscribe(mkd0.m154955G(new e30() { // from class: l.nn00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139689a.m67037A((CharSequence) obj);
            }
        }));
        if (NullChecker.m81303a(getAct().toolbar())) {
            xdl0.m208401t(getAct().toolbar(), new e30() { // from class: l.on00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144734a.m67038B((View) obj);
                }
            });
        }
        this.f43985i.setBackgroundColor(act.getResources().getColor(e1c0.f88765T));
        this.f43985i.setClipChildren(false);
        this.f43977a.addView(this.f43985i, 2);
        this.f43985i.f43967T.setFoldLimit(10);
        this.f43985i.f43967T.setOnScrollListener(new a());
        this.f43985i.f43967T.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        xdl0.m208360X(this.f43985i, t100.m186890d(8.0f));
    }

    /* JADX INFO: renamed from: w */
    public boolean m67062w() {
        return this.f43986j.isHidden();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m67063x(View view, MotionEvent motionEvent) {
        m67058q(true);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m67064y() {
        if (this.f43981e.getVisibility() == 4 && this.f43988l && NullChecker.m81304b(this.f43978b)) {
            this.f43978b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m67065z() {
        if (this.f43981e.getVisibility() == 4) {
            this.f43982f.setText("");
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ln00 ln00Var) {
    }
}
