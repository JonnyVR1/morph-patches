package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.a7o;
import p149l.h3c0;
import p149l.s9s;
import p149l.sxj;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareSuggestItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f45837a;

    /* JADX INFO: renamed from: b */
    public VFrame f45838b;

    /* JADX INFO: renamed from: c */
    public VFrame f45839c;

    /* JADX INFO: renamed from: d */
    public LiveIntlSquareFrameView f45840d;

    /* JADX INFO: renamed from: e */
    public ViewStub f45841e;

    /* JADX INFO: renamed from: f */
    public IntlLiveSpecialLabelView f45842f;

    /* JADX INFO: renamed from: g */
    public IntlLiveNewLabelDView f45843g;

    /* JADX INFO: renamed from: h */
    public IntlLiveNewLabelLeftTopView f45844h;

    /* JADX INFO: renamed from: i */
    public IntlLiveNewLabelEView f45845i;

    /* JADX INFO: renamed from: j */
    public LiveNewOptLabelView f45846j;

    /* JADX INFO: renamed from: k */
    public ViewStub f45847k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f45848l;

    /* JADX INFO: renamed from: m */
    public VText f45849m;

    /* JADX INFO: renamed from: n */
    public VText f45850n;

    /* JADX INFO: renamed from: o */
    public VText f45851o;

    /* JADX INFO: renamed from: p */
    public View f45852p;

    public IntlLiveSquareSuggestItemView(Context context) {
        super(context);
        this.f45852p = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70359p(this);
        this.f45839c.setBackgroundResource(h3c0.f105706s0);
    }

    /* JADX INFO: renamed from: p */
    public final void m70359p(View view) {
        a7o.m95296a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m70360s() {
        xdl0.m208344M(this.f45848l, false);
    }

    public void setAnchorGrade(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor) {
        long j = bLiveSuggestLiveAnchor.hierarchy;
        if (j == 0) {
            m70360s();
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM134372e = s9s.f163232f.m134372e(j);
        if (bLiveAnchorLevelM134372e == null || TextUtils.isEmpty(bLiveAnchorLevelM134372e.backendUrl)) {
            m70360s();
        } else {
            xdl0.m208344M(this.f45848l, true);
            sxj.m186442c(bLiveAnchorLevelM134372e.backendUrl, this.f45848l, sxj.f166797a);
        }
    }

    public void setAudienceAmount(String str) {
        this.f45850n.setText(str);
    }

    public void setDistance(@NonNull Location location) {
        this.f45851o.setText(w8u.m202221x(location));
    }

    public void setLiveName(String str) {
        this.f45849m.setText(str);
    }

    /* JADX INFO: renamed from: u */
    public void m70361u(String str, String str2) {
        this.f45840d.m68736c(str, str2);
    }

    /* JADX INFO: renamed from: v */
    public void m70362v(boolean z) {
        View view = this.f45852p;
        if (z) {
            if (view == null) {
                this.f45852p = this.f45841e.inflate();
            }
            xdl0.m208344M(this.f45852p, true);
        } else if (NullChecker.m81303a(view)) {
            xdl0.m208344M(this.f45852p, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m70363w(boolean z) {
        xdl0.m208344M(this.f45838b, z);
    }

    public IntlLiveSquareSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45852p = null;
    }

    public IntlLiveSquareSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45852p = null;
    }
}
