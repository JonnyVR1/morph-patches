package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.a9o;
import p153l.bnl0;
import p153l.i0k;
import p153l.nbc0;
import p153l.tbs;
import p153l.xau;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareSuggestItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f46685a;

    /* JADX INFO: renamed from: b */
    public VFrame f46686b;

    /* JADX INFO: renamed from: c */
    public VFrame f46687c;

    /* JADX INFO: renamed from: d */
    public LiveIntlSquareFrameView f46688d;

    /* JADX INFO: renamed from: e */
    public ViewStub f46689e;

    /* JADX INFO: renamed from: f */
    public IntlLiveSpecialLabelView f46690f;

    /* JADX INFO: renamed from: g */
    public IntlLiveNewLabelDView f46691g;

    /* JADX INFO: renamed from: h */
    public IntlLiveNewLabelLeftTopView f46692h;

    /* JADX INFO: renamed from: i */
    public IntlLiveNewLabelEView f46693i;

    /* JADX INFO: renamed from: j */
    public LiveNewOptLabelView f46694j;

    /* JADX INFO: renamed from: k */
    public ViewStub f46695k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f46696l;

    /* JADX INFO: renamed from: m */
    public VText f46697m;

    /* JADX INFO: renamed from: n */
    public VText f46698n;

    /* JADX INFO: renamed from: o */
    public VText f46699o;

    /* JADX INFO: renamed from: p */
    public View f46700p;

    public IntlLiveSquareSuggestItemView(Context context) {
        super(context);
        this.f46700p = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71542p(this);
        this.f46687c.setBackgroundResource(nbc0.f141197s0);
    }

    /* JADX INFO: renamed from: p */
    public final void m71542p(View view) {
        a9o.m96602a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m71543s() {
        bnl0.m105524M(this.f46696l, false);
    }

    public void setAnchorGrade(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor) {
        long j = bLiveSuggestLiveAnchor.hierarchy;
        if (j == 0) {
            m71543s();
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM143703e = tbs.f172993f.m143703e(j);
        if (bLiveAnchorLevelM143703e == null || TextUtils.isEmpty(bLiveAnchorLevelM143703e.backendUrl)) {
            m71543s();
        } else {
            bnl0.m105524M(this.f46696l, true);
            i0k.m137976c(bLiveAnchorLevelM143703e.backendUrl, this.f46696l, i0k.f112378a);
        }
    }

    public void setAudienceAmount(String str) {
        this.f46698n.setText(str);
    }

    public void setDistance(@NonNull Location location) {
        this.f46699o.setText(xau.m209914x(location));
    }

    public void setLiveName(String str) {
        this.f46697m.setText(str);
    }

    /* JADX INFO: renamed from: u */
    public void m71544u(String str, String str2) {
        this.f46688d.m69919c(str, str2);
    }

    /* JADX INFO: renamed from: v */
    public void m71545v(boolean z) {
        View view = this.f46700p;
        if (z) {
            if (view == null) {
                this.f46700p = this.f46689e.inflate();
            }
            bnl0.m105524M(this.f46700p, true);
        } else if (NullChecker.m82486a(view)) {
            bnl0.m105524M(this.f46700p, false);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m71546w(boolean z) {
        bnl0.m105524M(this.f46686b, z);
    }

    public IntlLiveSquareSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46700p = null;
    }

    public IntlLiveSquareSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46700p = null;
    }
}
