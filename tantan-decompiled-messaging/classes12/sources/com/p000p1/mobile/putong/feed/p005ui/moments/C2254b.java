package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.IntlOperationArticles;
import com.p000p1.mobile.putong.data.IntlOperationBanner;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ijb0;
import p007l.ln00;
import p007l.o6c0;
import p007l.un00;
import v.VDraweeView;
import v.VEditText;
import v.VFrame_Shadow;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2254b implements s7m<ln00>, C2253a.b {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5438a;

    /* JADX INFO: renamed from: b */
    public VFrame_Shadow f5439b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5440c;

    /* JADX INFO: renamed from: d */
    public VText f5441d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5442e;

    /* JADX INFO: renamed from: f */
    public VEditText f5443f;

    /* JADX INFO: renamed from: g */
    public VText f5444g;

    /* JADX INFO: renamed from: h */
    public View f5445h;

    /* JADX INFO: renamed from: i */
    public MomentsOrStoriesFeedPage f5446i;

    /* JADX INFO: renamed from: j */
    public final MomentsFeedFrag f5447j;

    /* JADX INFO: renamed from: k */
    public e30<Boolean> f5448k = new e30() { // from class: l.mn00
        public final void call(Object obj) {
            this.f10517a.m8242C((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public boolean f5449l = false;

    /* JADX INFO: renamed from: m */
    public boolean f5450m = false;

    /* JADX INFO: renamed from: n */
    public View f5451n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$a */
    public class a extends RecyclerView.t {
        public a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C2254b.this.m8243H();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.b$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (NullChecker.a(C2254b.this.f5446i) && NullChecker.a(C2254b.this.f5446i.f5428T) && C2254b.this.f5446i.f5428T.getMeasuredHeight() > 0) {
                C2254b.this.m8243H();
                C2254b.this.f5446i.f5428T.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public C2254b(MomentsFeedFrag momentsFeedFrag) {
        this.f5447j = momentsFeedFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m8240A(CharSequence charSequence) {
        Editable text = this.f5443f.getText();
        this.f5444g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m8241B(View view) {
        this.f5446i.f5428T.scrollToPosition(0);
        this.f5446i.f5428T.smoothScrollBy(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m8242C(Boolean bool) {
        this.f5446i.f5428T.f5366n.call(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m8243H() {
        MomentsFeedRecyclerList momentsFeedRecyclerList;
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f5446i;
        if (momentsOrStoriesFeedPage == null || (momentsFeedRecyclerList = momentsOrStoriesFeedPage.f5428T) == null || momentsFeedRecyclerList.f5356d == null || !ConnectivityReceiver.l()) {
            return;
        }
        LinearLayoutManager layoutManager = this.f5446i.f5428T.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = layoutManager;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ArrayList arrayList = new ArrayList();
            for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                String strM8096I = this.f5446i.f5428T.f5356d.m8096I(iFindFirstVisibleItemPosition);
                if (!TextUtils.isEmpty(strM8096I) && strM8096I.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(strM8096I);
                }
            }
            if (arrayList.size() > 0) {
                qib0.T0(arrayList);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8253C0() {
        return this.f5447j.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8254E(IntlOperationBanner intlOperationBanner, View view) {
        zvf0.u("e_community_icon", "p_moments_view", new j760[]{j760.a("intl_campaign_id", NullChecker.a(intlOperationBanner) ? intlOperationBanner.f224id : "")});
        FeedModule.m1140H().pa(act(), 0, (IntlOperationBanner) null, (IntlOperationArticles) null);
    }

    /* JADX INFO: renamed from: F */
    public void m8255F(int i, int i2, Intent intent) {
        this.f5446i.f5428T.m8086U(i, i2, intent);
    }

    /* JADX INFO: renamed from: G */
    public void m8256G(List<Media> list) {
        if (!NullChecker.b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.z(list.get(0).url)).b <= 15000) {
            m8261n(list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        } else {
            lsi0.h(R$string.f648z3);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m8257I(boolean z, int i, final IntlOperationBanner intlOperationBanner, boolean z2) {
        Objects.toString(intlOperationBanner);
        this.f5449l = z;
        if (z && !this.f5450m) {
            zvf0.A("e_community_icon", "p_moments_view", new j760[]{j760.a("intl_campaign_id", NullChecker.a(intlOperationBanner) ? intlOperationBanner.f224id : "")});
            this.f5450m = true;
        }
        if (this.f5449l && this.f5442e.getVisibility() == 4) {
            xdl0.M(this.f5439b, true);
        } else {
            xdl0.M(this.f5439b, false);
        }
        VText vText = this.f5441d;
        if (i == 0) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            this.f5441d.setText(String.valueOf(i));
        }
        if (!NullChecker.a(intlOperationBanner) || TextUtils.isEmpty(intlOperationBanner.icon.url)) {
            if (z2) {
                act().postDelayed(new Runnable() { // from class: l.sn00
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedModule.m1140H().Jq();
                    }
                }, 2000L);
            }
            this.f5440c.setActualImageResource(f3c0.f7903s3);
        } else {
            qib0.G.L0(this.f5440c, intlOperationBanner.icon.url);
        }
        xdl0.E0(this.f5439b, new View.OnClickListener() { // from class: l.tn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13344a.m8254E(intlOperationBanner, view);
            }
        });
    }

    @Nullable
    public Act act() {
        return this.f5447j.act();
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f5451n = m8259l(layoutInflater, viewGroup);
        this.f5446i = (MomentsOrStoriesFeedPage) act().inflater().inflate(o6c0.f11062H4, viewGroup, false);
        return this.f5451n;
    }

    /* JADX INFO: renamed from: l */
    public View m8259l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return un00.m15111b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m8261n(ArrayList<Media> arrayList) {
        this.f5446i.f5428T.m8080O(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m8262p(boolean z) {
        MomentsOrStoriesFeedPage momentsOrStoriesFeedPage = this.f5446i;
        if (z) {
            momentsOrStoriesFeedPage.f5428T.setOnTouchListener(new View.OnTouchListener() { // from class: l.rn00
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f12683a.m8268x(view, motionEvent);
                }
            });
        } else {
            momentsOrStoriesFeedPage.f5428T.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8263q(boolean z) {
        if (z && NullChecker.b(act())) {
            act().hideInput(this.f5443f);
        }
        m8262p(false);
        this.f5442e.setVisibility(4);
        e51.I(this.f5447j, new Runnable() { // from class: l.pn00
            @Override // java.lang.Runnable
            public final void run() {
                this.f11888a.m8269y();
            }
        }, 200L);
        this.f5447j.m4(new Runnable() { // from class: l.qn00
            @Override // java.lang.Runnable
            public final void run() {
                this.f12279a.m8270z();
            }
        }, 500);
        ijb0.m10905P(act(), true);
    }

    /* JADX INFO: renamed from: s */
    public void m8264s() {
        ijb0.m10937x(act());
        m8262p(true);
        xdl0.A(this.f5443f);
        if (this.f5449l && NullChecker.b(this.f5439b)) {
            this.f5439b.setVisibility(4);
        }
        this.f5442e.setVisibility(0);
        act().showInput(this.f5443f, 0);
    }

    /* JADX INFO: renamed from: u */
    public void m8265u() {
        C2253a c2253a = new C2253a(this.f5446i.f5428T);
        c2253a.m8236q(this);
        this.f5446i.f5428T.m8088W(c2253a, true, this.f5447j);
        if (NullChecker.a(this.f5451n)) {
            act().duringCreated(Act.keyboardListenerObservable(this.f5451n)).subscribe(this.f5448k);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public void m8266v(Bundle bundle) {
        Act act = act();
        if (act == null) {
            return;
        }
        this.f5443f.i(true).subscribe(mkd0.G(new e30() { // from class: l.nn00
            public final void call(Object obj) {
                this.f10836a.m8240A((CharSequence) obj);
            }
        }));
        if (NullChecker.a(act().toolbar())) {
            xdl0.t(act().toolbar(), new e30() { // from class: l.on00
                public final void call(Object obj) {
                    this.f11537a.m8241B((View) obj);
                }
            });
        }
        this.f5446i.setBackgroundColor(act.getResources().getColor(e1c0.f7121T));
        this.f5446i.setClipChildren(false);
        this.f5438a.addView((View) this.f5446i, 2);
        this.f5446i.f5428T.setFoldLimit(10);
        this.f5446i.f5428T.setOnScrollListener(new a());
        this.f5446i.f5428T.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        xdl0.X(this.f5446i, t100.d(8.0f));
    }

    /* JADX INFO: renamed from: w */
    public boolean m8267w() {
        return this.f5447j.isHidden();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m8268x(View view, MotionEvent motionEvent) {
        m8263q(true);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8269y() {
        if (this.f5442e.getVisibility() == 4 && this.f5449l && NullChecker.b(this.f5439b)) {
            this.f5439b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8270z() {
        if (this.f5442e.getVisibility() == 4) {
            this.f5443f.setText("");
        }
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m8258i1(ln00 ln00Var) {
    }
}
