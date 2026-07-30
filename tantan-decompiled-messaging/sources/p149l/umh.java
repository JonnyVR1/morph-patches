package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.PoiLocation;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VRelative;

/* JADX INFO: loaded from: classes12.dex */
public class umh implements s7m<qmh> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f177226a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f177227b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f177228c;

    /* JADX INFO: renamed from: d */
    public CollapsingToolbarLayout f177229d;

    /* JADX INFO: renamed from: e */
    public Toolbar f177230e;

    /* JADX INFO: renamed from: f */
    public VImage f177231f;

    /* JADX INFO: renamed from: g */
    public TextView f177232g;

    /* JADX INFO: renamed from: h */
    public VRelative f177233h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f177234i;

    /* JADX INFO: renamed from: j */
    public VImage f177235j;

    /* JADX INFO: renamed from: k */
    public VLinear f177236k;

    /* JADX INFO: renamed from: l */
    public TextView f177237l;

    /* JADX INFO: renamed from: m */
    public VLinear_FillerMeasure f177238m;

    /* JADX INFO: renamed from: n */
    public TextView f177239n;

    /* JADX INFO: renamed from: o */
    public VLine f177240o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f177241p;

    /* JADX INFO: renamed from: q */
    public FeedPoiAggregationAct f177242q;

    /* JADX INFO: renamed from: r */
    public qmh f177243r;

    /* JADX INFO: renamed from: s */
    public q980 f177244s;

    /* JADX INFO: renamed from: u */
    public int f177246u;

    /* JADX INFO: renamed from: v */
    public int f177247v;

    /* JADX INFO: renamed from: t */
    public int f177245t = t100.m186890d(44.0f);

    /* JADX INFO: renamed from: w */
    public AppBarLayout.OnOffsetChangedListener f177248w = new AppBarLayout.OnOffsetChangedListener() { // from class: l.tmh
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f171153a.m194360n(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver.OnGlobalLayoutListener f177249x = new ViewTreeObserverOnGlobalLayoutListenerC20459a();

    /* JADX INFO: renamed from: l.umh$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC20459a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC20459a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (umh.this.act() == null || umh.this.f177233h.getMeasuredHeight() <= 0 || umh.this.f177247v == umh.this.f177233h.getMeasuredHeight()) {
                return;
            }
            umh umhVar = umh.this;
            umhVar.f177246u = umhVar.f177245t + umhVar.f177233h.getMeasuredHeight();
            umh umhVar2 = umh.this;
            umhVar2.f177247v = umhVar2.f177233h.getMeasuredHeight();
            umh.this.m194363s();
        }
    }

    public umh(FeedPoiAggregationAct feedPoiAggregationAct) {
        this.f177242q = feedPoiAggregationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m194353l(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m194354m(View view) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(this.f177243r.f155313b);
        if (NullChecker.m81303a(momentM209572w7) && NullChecker.m81303a(momentM209572w7.location)) {
            zvf0.m220399u("e_poi_nearby", "p_poi_detail", new j760("poiname", momentM209572w7.location.name));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m194355r() {
        this.f177244s = new q980(this.f177242q, this);
        this.f177231f.setOnClickListener(new View.OnClickListener() { // from class: l.rmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160097a.m194353l(view);
            }
        });
        this.f177230e.setTitle("");
        act().setSupportActionBar(this.f177230e);
        this.f177246u = t100.m186890d(155.0f) + this.f177245t;
        m194363s();
        xdl0.m208360X(this.f177233h, this.f177245t);
        this.f177228c.addOnOffsetChangedListener(this.f177248w);
        this.f177233h.getViewTreeObserver().addOnGlobalLayoutListener(this.f177249x);
        m194362q();
        xdl0.m208329E0(this.f177238m, new View.OnClickListener() { // from class: l.smh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165344a.m194354m(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f177242q;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f177242q;
    }

    /* JADX INFO: renamed from: f */
    public View m194356f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vmh.m198950b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qmh qmhVar) {
        this.f177243r = qmhVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM194356f = m194356f(layoutInflater, viewGroup);
        m194355r();
        return viewM194356f;
    }

    /* JADX INFO: renamed from: j */
    public String m194358j() {
        return this.f177243r.f155313b;
    }

    /* JADX INFO: renamed from: k */
    public void m194359k() {
        q980 q980Var = this.f177244s;
        if (q980Var == null) {
            return;
        }
        q980Var.m173601a();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m194360n(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f177247v ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f177247v);
        }
        if (NullChecker.m81303a(this.f177233h)) {
            this.f177233h.setAlpha(fAbs);
            xdl0.m208344M(this.f177232g, this.f177246u + i == this.f177245t);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m194361p(PoiLocation poiLocation) {
        this.f177239n.setText(String.format("附近%d人来过", Integer.valueOf(poiLocation.count)));
    }

    /* JADX INFO: renamed from: q */
    public void m194362q() {
        MessageLocation messageLocation;
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(this.f177243r.f155313b);
        if (momentM209572w7 == null || (messageLocation = momentM209572w7.location) == null) {
            return;
        }
        this.f177232g.setText(messageLocation.name);
        this.f177237l.setText(momentM209572w7.location.name);
    }

    /* JADX INFO: renamed from: s */
    public void m194363s() {
        xdl0.m208325C0(this.f177228c, this.f177246u);
        xdl0.m208325C0(this.f177229d, this.f177246u);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
