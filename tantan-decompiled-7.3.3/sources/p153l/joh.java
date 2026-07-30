package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.PoiLocation;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VRelative;

/* JADX INFO: loaded from: classes13.dex */
public class joh implements iam<foh> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f122001a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f122002b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f122003c;

    /* JADX INFO: renamed from: d */
    public CollapsingToolbarLayout f122004d;

    /* JADX INFO: renamed from: e */
    public Toolbar f122005e;

    /* JADX INFO: renamed from: f */
    public VImage f122006f;

    /* JADX INFO: renamed from: g */
    public TextView f122007g;

    /* JADX INFO: renamed from: h */
    public VRelative f122008h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f122009i;

    /* JADX INFO: renamed from: j */
    public VImage f122010j;

    /* JADX INFO: renamed from: k */
    public VLinear f122011k;

    /* JADX INFO: renamed from: l */
    public TextView f122012l;

    /* JADX INFO: renamed from: m */
    public VLinear_FillerMeasure f122013m;

    /* JADX INFO: renamed from: n */
    public TextView f122014n;

    /* JADX INFO: renamed from: o */
    public VLine f122015o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f122016p;

    /* JADX INFO: renamed from: q */
    public FeedPoiAggregationAct f122017q;

    /* JADX INFO: renamed from: r */
    public foh f122018r;

    /* JADX INFO: renamed from: s */
    public wh80 f122019s;

    /* JADX INFO: renamed from: u */
    public int f122021u;

    /* JADX INFO: renamed from: v */
    public int f122022v;

    /* JADX INFO: renamed from: t */
    public int f122020t = qa00.m175859d(44.0f);

    /* JADX INFO: renamed from: w */
    public AppBarLayout.OnOffsetChangedListener f122023w = new AppBarLayout.OnOffsetChangedListener() { // from class: l.ioh
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f116150a.m146456n(appBarLayout, i);
        }
    };

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver.OnGlobalLayoutListener f122024x = new ViewTreeObserverOnGlobalLayoutListenerC17996a();

    /* JADX INFO: renamed from: l.joh$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC17996a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17996a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (joh.this.act() == null || joh.this.f122008h.getMeasuredHeight() <= 0 || joh.this.f122022v == joh.this.f122008h.getMeasuredHeight()) {
                return;
            }
            joh johVar = joh.this;
            johVar.f122021u = johVar.f122020t + johVar.f122008h.getMeasuredHeight();
            joh johVar2 = joh.this;
            johVar2.f122022v = johVar2.f122008h.getMeasuredHeight();
            joh.this.m146459s();
        }
    }

    public joh(FeedPoiAggregationAct feedPoiAggregationAct) {
        this.f122017q = feedPoiAggregationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m146449l(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m146450m(View view) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(this.f122018r.f100058b);
        if (NullChecker.m82486a(momentM145813w7) && NullChecker.m82486a(momentM145813w7.location)) {
            i4g0.m138523u("e_poi_nearby", "p_poi_detail", new pf60("poiname", momentM145813w7.location.name));
        }
    }

    /* JADX INFO: renamed from: r */
    private void m146451r() {
        this.f122019s = new wh80(this.f122017q, this);
        this.f122006f.setOnClickListener(new View.OnClickListener() { // from class: l.goh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105295a.m146449l(view);
            }
        });
        this.f122005e.setTitle("");
        act().setSupportActionBar(this.f122005e);
        this.f122021u = qa00.m175859d(155.0f) + this.f122020t;
        m146459s();
        bnl0.m105540X(this.f122008h, this.f122020t);
        this.f122003c.addOnOffsetChangedListener(this.f122023w);
        this.f122008h.getViewTreeObserver().addOnGlobalLayoutListener(this.f122024x);
        m146458q();
        bnl0.m105509E0(this.f122013m, new View.OnClickListener() { // from class: l.hoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110906a.m146450m(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f122017q;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f122017q;
    }

    /* JADX INFO: renamed from: f */
    public View m146452f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return koh.m150605b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(foh fohVar) {
        this.f122018r = fohVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM146452f = m146452f(layoutInflater, viewGroup);
        m146451r();
        return viewM146452f;
    }

    /* JADX INFO: renamed from: j */
    public String m146454j() {
        return this.f122018r.f100058b;
    }

    /* JADX INFO: renamed from: k */
    public void m146455k() {
        wh80 wh80Var = this.f122019s;
        if (wh80Var == null) {
            return;
        }
        wh80Var.m206337a();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m146456n(AppBarLayout appBarLayout, int i) {
        float fAbs = 1.0f;
        if (i < 0) {
            fAbs = Math.abs(i) >= this.f122022v ? 0.0f : 1.0f - ((Math.abs(i) * 1.0f) / this.f122022v);
        }
        if (NullChecker.m82486a(this.f122008h)) {
            this.f122008h.setAlpha(fAbs);
            bnl0.m105524M(this.f122007g, this.f122021u + i == this.f122020t);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m146457p(PoiLocation poiLocation) {
        this.f122014n.setText(String.format("附近%d人来过", Integer.valueOf(poiLocation.count)));
    }

    /* JADX INFO: renamed from: q */
    public void m146458q() {
        MessageLocation messageLocation;
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(this.f122018r.f100058b);
        if (momentM145813w7 == null || (messageLocation = momentM145813w7.location) == null) {
            return;
        }
        this.f122007g.setText(messageLocation.name);
        this.f122012l.setText(momentM145813w7.location.name);
    }

    /* JADX INFO: renamed from: s */
    public void m146459s() {
        bnl0.m105505C0(this.f122003c, this.f122021u);
        bnl0.m105505C0(this.f122004d, this.f122021u);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
