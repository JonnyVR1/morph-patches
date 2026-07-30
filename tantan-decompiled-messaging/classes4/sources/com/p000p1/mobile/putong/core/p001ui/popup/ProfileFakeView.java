package com.p000p1.mobile.putong.core.p001ui.popup;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bm90;
import l.eqh0;
import l.i0g0;
import l.qib0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import p002l.y0m;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileFakeView extends RelativeLayout implements y0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f659a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f660b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f661c;

    /* JADX INFO: renamed from: d */
    public ImageView f662d;

    /* JADX INFO: renamed from: e */
    public FakeTwoCardView f663e;

    /* JADX INFO: renamed from: f */
    public VText f664f;

    /* JADX INFO: renamed from: g */
    public VText f665g;

    public ProfileFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m870d(boolean z, Media media, boolean z2, String str) {
        qib0.G.L0(this.f661c, media.url);
        if (!z) {
            this.f664f.setText(m872c().string(R.string.gl));
            this.f665g.setText(R.string.fl);
            this.f662d.setImageResource(x2c0.Tm);
            return;
        }
        CoreModule.c.e0.p9();
        if (!z2 || TextUtils.isEmpty(str)) {
            String strString = m872c().string(R.string.Yq);
            String strString2 = m872c().string(R.string.Wq);
            String strString3 = m872c().string(R.string.Xq);
            this.f665g.setText(i0g0.b0(m872c().getString(R.string.Vq, strString, strString2, strString3), vwb.f0(new String[]{strString, strString2, strString3}), m872c().color(w0c0.N1), eqh0.c(3)));
        } else {
            this.f665g.setText(Html.fromHtml(str));
        }
        this.f665g.setGravity(17);
        this.f664f.setText(R.string.Zq);
        this.f662d.setImageResource(x2c0.Tl);
    }

    @Override // p002l.y0m
    /* JADX INFO: renamed from: a */
    public void mo863a(boolean z, Media media) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9.fakeStatus)) {
            m870d(z, media, true, userP9.fakeStatus.text);
        } else {
            m870d(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m871b(View view) {
        bm90.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m872c() {
        return getContext();
    }

    @Override // p002l.y0m
    public View getRenderView() {
        return this;
    }

    @Override // p002l.y0m
    public TextView getTitleView() {
        return this.f664f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m871b(this);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
