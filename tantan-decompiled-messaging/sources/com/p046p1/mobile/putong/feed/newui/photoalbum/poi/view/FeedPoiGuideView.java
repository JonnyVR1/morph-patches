package com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.PoiGuide;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VImage;
import p147v.VLinear;
import p149l.cjh;
import p149l.d30;
import p149l.d90;
import p149l.e30;
import p149l.mjj;
import p149l.mkd0;
import p149l.qib0;
import p149l.r980;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.xoh;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiGuideView f42289a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f42290b;

    /* JADX INFO: renamed from: c */
    public VImage f42291c;

    /* JADX INFO: renamed from: d */
    public VLinear f42292d;

    /* JADX INFO: renamed from: e */
    public TextView f42293e;

    /* JADX INFO: renamed from: f */
    public TextView f42294f;

    /* JADX INFO: renamed from: g */
    public VImage f42295g;

    /* JADX INFO: renamed from: h */
    public PoiGuide f42296h;

    /* JADX INFO: renamed from: i */
    public Act f42297i;

    /* JADX INFO: renamed from: j */
    public mjj f42298j;

    /* JADX INFO: renamed from: k */
    public String f42299k;

    /* JADX INFO: renamed from: l */
    public String f42300l;

    public FeedPoiGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m65016a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    private String getGuideInfoValue() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f42299k);
        PoiGuide poiGuide = this.f42296h;
        return !zIsEmpty ? String.format(poiGuide.guide, this.f42299k) : poiGuide.guide;
    }

    /* JADX INFO: renamed from: f */
    public final void m65021f(View view) {
        xoh.m210418a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m65022g() {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.toh
            @Override // p149l.d30
            public final void call() {
                this.f171373a.m65023h();
            }
        }, new e30() { // from class: l.uoh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedPoiGuideView.m65016a((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(this.f42297i);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m65024i(d90 d90Var) {
        if (d90Var == null) {
            return;
        }
        d90Var.mo110404a();
        d90Var.mo110409f();
        d90Var.mo110406c();
        String strMo110409f = d90Var.mo110409f();
        this.f42299k = strMo110409f;
        if (TextUtils.isEmpty(strMo110409f)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(d90Var.mo110405b()) ? "" : d90Var.mo110405b());
            sb.append(TextUtils.isEmpty(d90Var.mo110406c()) ? "" : d90Var.mo110406c());
            this.f42299k = sb.toString();
        }
        if (TextUtils.isEmpty(this.f42299k)) {
            this.f42299k = d90Var.mo110404a();
        }
        if (this.f42294f == null) {
            return;
        }
        zvf0.m220368A("e_poi_lighten", vqg.m199515K(this.f42300l, false), vwb.m200311Y("poiname", this.f42299k));
        this.f42294f.setText(getGuideInfoValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m65025j(String str, View view) {
        PoiGuide poiGuide = this.f42296h;
        if (poiGuide == null || poiGuide.mPoiGuidePopWindow == null) {
            return;
        }
        zvf0.m220399u("e_poi_lighten", vqg.m199515K(str, false), vwb.m200311Y("poiname", this.f42299k));
        if (cjh.m107158d()) {
            m65023h();
        } else {
            m65022g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m65026k(double d, double d2) {
        if (this.f42298j == null) {
            this.f42298j = mjj.m154842c(this.f42297i, true);
        }
        this.f42298j.m154843b(d, d2).subscribe(mkd0.m154959K(new e30() { // from class: l.voh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182386a.m65024i((d90) obj);
            }
        }, new e30() { // from class: l.woh
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public void m65027l(Act act, PoiGuide poiGuide, final String str, int i) {
        this.f42297i = act;
        this.f42300l = str;
        if (poiGuide == null) {
            return;
        }
        FeedPoiGuideView feedPoiGuideView = this.f42289a;
        if (i == 0) {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), t100.f167254c, this.f42289a.getPaddingRight(), this.f42289a.getPaddingBottom());
        } else {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), t100.m186890d(7.0f), this.f42289a.getPaddingRight(), this.f42289a.getPaddingBottom());
        }
        this.f42296h = poiGuide;
        this.f42293e.setText(poiGuide.title);
        this.f42294f.setText(getGuideInfoValue());
        if (TextUtils.isEmpty(this.f42299k)) {
            Location locationM78865q = qib0.f154687E.m78865q();
            if (NullChecker.m81303a(locationM78865q)) {
                m65026k(locationM78865q.m78831u(), locationM78865q.m78833x());
            }
        }
        xdl0.m208329E0(this.f42290b, new View.OnClickListener() { // from class: l.soh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165684a.m65025j(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m65023h() {
        if (TEnum.equals(this.f42296h.mPoiGuidePopWindow.type, "poi")) {
            r980.m178298b(this.f42297i, this.f42296h.mPoiGuidePopWindow, false, null);
        } else if (TEnum.equals(this.f42296h.mPoiGuidePopWindow.type, "share")) {
            r980.m178299c(this.f42297i, this.f42296h.mPoiGuidePopWindow, false, null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65021f(this);
    }

    public FeedPoiGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedPoiGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
