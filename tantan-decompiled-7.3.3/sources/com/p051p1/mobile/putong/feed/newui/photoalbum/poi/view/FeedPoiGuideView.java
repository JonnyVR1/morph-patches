package com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.PoiGuide;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.fmj;
import p153l.i4g0;
import p153l.jyb;
import p153l.ksg;
import p153l.mqh;
import p153l.psd0;
import p153l.qa00;
import p153l.rkh;
import p153l.uqb0;
import p153l.x20;
import p153l.xh80;
import p153l.y20;
import p153l.z80;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiGuideView f43137a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f43138b;

    /* JADX INFO: renamed from: c */
    public VImage f43139c;

    /* JADX INFO: renamed from: d */
    public VLinear f43140d;

    /* JADX INFO: renamed from: e */
    public TextView f43141e;

    /* JADX INFO: renamed from: f */
    public TextView f43142f;

    /* JADX INFO: renamed from: g */
    public VImage f43143g;

    /* JADX INFO: renamed from: h */
    public PoiGuide f43144h;

    /* JADX INFO: renamed from: i */
    public Act f43145i;

    /* JADX INFO: renamed from: j */
    public fmj f43146j;

    /* JADX INFO: renamed from: k */
    public String f43147k;

    /* JADX INFO: renamed from: l */
    public String f43148l;

    public FeedPoiGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m66199a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    private String getGuideInfoValue() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f43147k);
        PoiGuide poiGuide = this.f43144h;
        return !zIsEmpty ? String.format(poiGuide.guide, this.f43147k) : poiGuide.guide;
    }

    /* JADX INFO: renamed from: f */
    public final void m66204f(View view) {
        mqh.m159507a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m66205g() {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.iqh
            @Override // p153l.x20
            public final void call() {
                this.f116417a.m66206h();
            }
        }, new y20() { // from class: l.jqh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedPoiGuideView.m66199a((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(this.f43145i);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m66207i(z80 z80Var) {
        if (z80Var == null) {
            return;
        }
        z80Var.mo143669a();
        z80Var.mo143672f();
        z80Var.mo143671c();
        String strMo143672f = z80Var.mo143672f();
        this.f43147k = strMo143672f;
        if (TextUtils.isEmpty(strMo143672f)) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(z80Var.mo143670b()) ? "" : z80Var.mo143670b());
            sb.append(TextUtils.isEmpty(z80Var.mo143671c()) ? "" : z80Var.mo143671c());
            this.f43147k = sb.toString();
        }
        if (TextUtils.isEmpty(this.f43147k)) {
            this.f43147k = z80Var.mo143669a();
        }
        if (this.f43142f == null) {
            return;
        }
        i4g0.m138492A("e_poi_lighten", ksg.m151174K(this.f43148l, false), jyb.m147494Y("poiname", this.f43147k));
        this.f43142f.setText(getGuideInfoValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m66208j(String str, View view) {
        PoiGuide poiGuide = this.f43144h;
        if (poiGuide == null || poiGuide.mPoiGuidePopWindow == null) {
            return;
        }
        i4g0.m138523u("e_poi_lighten", ksg.m151174K(str, false), jyb.m147494Y("poiname", this.f43147k));
        if (rkh.m181860d()) {
            m66206h();
        } else {
            m66205g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m66209k(double d, double d2) {
        if (this.f43146j == null) {
            this.f43146j = fmj.m126236c(this.f43145i, true);
        }
        this.f43146j.m126237b(d, d2).subscribe(psd0.m173600K(new y20() { // from class: l.kqh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128227a.m66207i((z80) obj);
            }
        }, new y20() { // from class: l.lqh
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public void m66210l(Act act, PoiGuide poiGuide, final String str, int i) {
        this.f43145i = act;
        this.f43148l = str;
        if (poiGuide == null) {
            return;
        }
        FeedPoiGuideView feedPoiGuideView = this.f43137a;
        if (i == 0) {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), qa00.f156316c, this.f43137a.getPaddingRight(), this.f43137a.getPaddingBottom());
        } else {
            feedPoiGuideView.setPadding(feedPoiGuideView.getPaddingLeft(), qa00.m175859d(7.0f), this.f43137a.getPaddingRight(), this.f43137a.getPaddingBottom());
        }
        this.f43144h = poiGuide;
        this.f43141e.setText(poiGuide.title);
        this.f43142f.setText(getGuideInfoValue());
        if (TextUtils.isEmpty(this.f43147k)) {
            Location locationM80048q = uqb0.f180370E.m80048q();
            if (NullChecker.m82486a(locationM80048q)) {
                m66209k(locationM80048q.m80014u(), locationM80048q.m80016x());
            }
        }
        bnl0.m105509E0(this.f43138b, new View.OnClickListener() { // from class: l.hqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111127a.m66208j(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m66206h() {
        if (TEnum.equals(this.f43144h.mPoiGuidePopWindow.type, "poi")) {
            xh80.m211023b(this.f43145i, this.f43144h.mPoiGuidePopWindow, false, null);
        } else if (TEnum.equals(this.f43144h.mPoiGuidePopWindow.type, "share")) {
            xh80.m211024c(this.f43145i, this.f43144h.mPoiGuidePopWindow, false, null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66204f(this);
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
