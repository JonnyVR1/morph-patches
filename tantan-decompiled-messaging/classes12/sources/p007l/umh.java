package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.PoiLocation;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLine;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class umh implements s7m<qmh> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f13863a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f13864b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f13865c;

    /* JADX INFO: renamed from: d */
    public CollapsingToolbarLayout f13866d;

    /* JADX INFO: renamed from: e */
    public Toolbar f13867e;

    /* JADX INFO: renamed from: f */
    public VImage f13868f;

    /* JADX INFO: renamed from: g */
    public TextView f13869g;

    /* JADX INFO: renamed from: h */
    public VRelative f13870h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f13871i;

    /* JADX INFO: renamed from: j */
    public VImage f13872j;

    /* JADX INFO: renamed from: k */
    public VLinear f13873k;

    /* JADX INFO: renamed from: l */
    public TextView f13874l;

    /* JADX INFO: renamed from: m */
    public VLinear_FillerMeasure f13875m;

    /* JADX INFO: renamed from: n */
    public TextView f13876n;

    /* JADX INFO: renamed from: o */
    public VLine f13877o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f13878p;

    /* JADX INFO: renamed from: q */
    public FeedPoiAggregationAct f13879q;

    /* JADX INFO: renamed from: r */
    public qmh f13880r;

    /* JADX INFO: renamed from: s */
    public q980 f13881s;

    /* JADX INFO: renamed from: u */
    public int f13883u;

    /* JADX INFO: renamed from: v */
    public int f13884v;

    /* JADX INFO: renamed from: t */
    public int f13882t = t100.d(44.0f);

    /* JADX INFO: renamed from: w */
    public AppBarLayout.OnOffsetChangedListener f13885w = new AppBarLayout.OnOffsetChangedListener() { // from class: l.tmh
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f13343a.m15106n(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver.OnGlobalLayoutListener f13886x = new ViewTreeObserverOnGlobalLayoutListenerC2513a();

    /* JADX INFO: renamed from: l.umh$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC2513a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC2513a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (umh.this.act() == null || umh.this.f13870h.getMeasuredHeight() <= 0 || umh.this.f13884v == umh.this.f13870h.getMeasuredHeight()) {
                return;
            }
            umh umhVar = umh.this;
            umhVar.f13883u = umhVar.f13882t + umhVar.f13870h.getMeasuredHeight();
            umh umhVar2 = umh.this;
            umhVar2.f13884v = umhVar2.f13870h.getMeasuredHeight();
            umh.this.m15109s();
        }
    }

    public umh(FeedPoiAggregationAct feedPoiAggregationAct) {
        this.f13879q = feedPoiAggregationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m15097l(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m15098m(View view) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(this.f13880r.f12277b);
        if (NullChecker.a(momentM16753w7) && NullChecker.a(momentM16753w7.location)) {
            zvf0.u("e_poi_nearby", "p_poi_detail", new j760[]{new j760("poiname", momentM16753w7.location.name)});
        }
    }

    /* JADX INFO: renamed from: r */
    private void m15099r() {
        this.f13881s = new q980(this.f13879q, this);
        this.f13868f.setOnClickListener(new View.OnClickListener() { // from class: l.rmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12680a.m15097l(view);
            }
        });
        this.f13867e.setTitle("");
        act().setSupportActionBar(this.f13867e);
        this.f13883u = t100.d(155.0f) + this.f13882t;
        m15109s();
        xdl0.X(this.f13870h, this.f13882t);
        this.f13865c.addOnOffsetChangedListener(this.f13885w);
        this.f13870h.getViewTreeObserver().addOnGlobalLayoutListener(this.f13886x);
        m15108q();
        xdl0.E0(this.f13875m, new View.OnClickListener() { // from class: l.smh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13009a.m15098m(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15100C0() {
        return this.f13879q;
    }

    @Nullable
    public Act act() {
        return this.f13879q;
    }

    /* JADX INFO: renamed from: f */
    public View m15101f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vmh.m15464b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m15103i1(qmh qmhVar) {
        this.f13880r = qmhVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM15101f = m15101f(layoutInflater, viewGroup);
        m15099r();
        return viewM15101f;
    }

    /* JADX INFO: renamed from: j */
    public String m15104j() {
        return this.f13880r.f12277b;
    }

    /* JADX INFO: renamed from: k */
    public void m15105k() {
        q980 q980Var = this.f13881s;
        if (q980Var == null) {
            return;
        }
        q980Var.m13491a();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m15106n(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f13884v ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f13884v);
        }
        if (NullChecker.a(this.f13870h)) {
            this.f13870h.setAlpha(fAbs);
            xdl0.M(this.f13869g, this.f13883u + i == this.f13882t);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15107p(PoiLocation poiLocation) {
        this.f13876n.setText(String.format("附近%d人来过", Integer.valueOf(poiLocation.count)));
    }

    /* JADX INFO: renamed from: q */
    public void m15108q() {
        MessageLocation messageLocation;
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(this.f13880r.f12277b);
        if (momentM16753w7 == null || (messageLocation = momentM16753w7.location) == null) {
            return;
        }
        this.f13869g.setText(messageLocation.name);
        this.f13874l.setText(momentM16753w7.location.name);
    }

    /* JADX INFO: renamed from: s */
    public void m15109s() {
        xdl0.C0(this.f13865c, this.f13883u);
        xdl0.C0(this.f13866d, this.f13883u);
    }

    public void destroy() {
    }
}
