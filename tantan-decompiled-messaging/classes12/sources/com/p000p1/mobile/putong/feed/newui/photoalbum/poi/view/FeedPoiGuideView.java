package com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.PoiGuide;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.d30;
import l.d90;
import l.e30;
import l.j760;
import l.mjj;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.cjh;
import p007l.r980;
import p007l.vqg;
import p007l.xoh;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiGuideView f3750a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f3751b;

    /* JADX INFO: renamed from: c */
    public VImage f3752c;

    /* JADX INFO: renamed from: d */
    public VLinear f3753d;

    /* JADX INFO: renamed from: e */
    public TextView f3754e;

    /* JADX INFO: renamed from: f */
    public TextView f3755f;

    /* JADX INFO: renamed from: g */
    public VImage f3756g;

    /* JADX INFO: renamed from: h */
    public PoiGuide f3757h;

    /* JADX INFO: renamed from: i */
    public Act f3758i;

    /* JADX INFO: renamed from: j */
    public mjj f3759j;

    /* JADX INFO: renamed from: k */
    public String f3760k;

    /* JADX INFO: renamed from: l */
    public String f3761l;

    public FeedPoiGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6117a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    private String getGuideInfoValue() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f3760k);
        PoiGuide poiGuide = this.f3757h;
        return !zIsEmpty ? String.format(poiGuide.guide, this.f3760k) : poiGuide.guide;
    }

    /* JADX INFO: renamed from: f */
    public final void m6122f(View view) {
        xoh.m16801a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m6123g() {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).w(false).u(true).m(new d30() { // from class: l.toh
            public final void call() {
                this.f13369a.m6124h();
            }
        }, new e30() { // from class: l.uoh
            public final void call(Object obj) {
                FeedPoiGuideView.m6117a((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).i(this.f3758i);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6125i(d90 d90Var) {
        if (d90Var == null) {
            return;
        }
        d90Var.a();
        d90Var.f();
        d90Var.c();
        String strF = d90Var.f();
        this.f3760k = strF;
        if (TextUtils.isEmpty(strF)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(d90Var.b()) ? "" : d90Var.b());
            sb.append(TextUtils.isEmpty(d90Var.c()) ? "" : d90Var.c());
            this.f3760k = sb.toString();
        }
        if (TextUtils.isEmpty(this.f3760k)) {
            this.f3760k = d90Var.a();
        }
        if (this.f3755f == null) {
            return;
        }
        zvf0.A("e_poi_lighten", vqg.m15485K(this.f3761l, false), new j760[]{vwb.Y("poiname", this.f3760k)});
        this.f3755f.setText(getGuideInfoValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6126j(String str, View view) {
        PoiGuide poiGuide = this.f3757h;
        if (poiGuide == null || poiGuide.mPoiGuidePopWindow == null) {
            return;
        }
        zvf0.u("e_poi_lighten", vqg.m15485K(str, false), new j760[]{vwb.Y("poiname", this.f3760k)});
        if (cjh.m9194d()) {
            m6124h();
        } else {
            m6123g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6127k(double d, double d2) {
        if (this.f3759j == null) {
            this.f3759j = mjj.c(this.f3758i, true);
        }
        this.f3759j.d(d, d2).subscribe(mkd0.K(new e30() { // from class: l.voh
            public final void call(Object obj) {
                this.f14257a.m6125i((d90) obj);
            }
        }, new e30() { // from class: l.woh
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public void m6128l(Act act, PoiGuide poiGuide, final String str, int i) {
        this.f3758i = act;
        this.f3761l = str;
        if (poiGuide == null) {
            return;
        }
        FeedPoiGuideView feedPoiGuideView = this.f3750a;
        if (i == 0) {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), t100.c, this.f3750a.getPaddingRight(), this.f3750a.getPaddingBottom());
        } else {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), t100.d(7.0f), this.f3750a.getPaddingRight(), this.f3750a.getPaddingBottom());
        }
        this.f3757h = poiGuide;
        this.f3754e.setText(poiGuide.title);
        this.f3755f.setText(getGuideInfoValue());
        if (TextUtils.isEmpty(this.f3760k)) {
            Location locationQ = qib0.E.q();
            if (NullChecker.a(locationQ)) {
                m6127k(locationQ.u(), locationQ.x());
            }
        }
        xdl0.E0(this.f3751b, new View.OnClickListener() { // from class: l.soh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13021a.m6126j(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m6124h() {
        if (TEnum.equals(this.f3757h.mPoiGuidePopWindow.type, "poi")) {
            r980.m13887b(this.f3758i, this.f3757h.mPoiGuidePopWindow, false, null);
        } else if (TEnum.equals(this.f3757h.mPoiGuidePopWindow.type, "share")) {
            r980.m13888c(this.f3758i, this.f3757h.mPoiGuidePopWindow, false, null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6122f(this);
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
