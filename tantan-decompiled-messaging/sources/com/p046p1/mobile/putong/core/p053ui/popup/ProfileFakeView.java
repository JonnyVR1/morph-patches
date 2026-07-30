package com.p046p1.mobile.putong.core.p053ui.popup;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bm90;
import p149l.eqh0;
import p149l.i0g0;
import p149l.qib0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.y0m;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileFakeView extends RelativeLayout implements y0m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f32837a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32838b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32839c;

    /* JADX INFO: renamed from: d */
    public ImageView f32840d;

    /* JADX INFO: renamed from: e */
    public FakeTwoCardView f32841e;

    /* JADX INFO: renamed from: f */
    public VText f32842f;

    /* JADX INFO: renamed from: g */
    public VText f32843g;

    public ProfileFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m50435d(boolean z, Media media, boolean z2, String str) {
        qib0.f154691G.m102331L0(this.f32839c, media.url);
        if (!z) {
            this.f32842f.setText(m50437c().string(R$string.f18553gl));
            this.f32843g.setText(R$string.f18522fl);
            this.f32840d.setImageResource(x2c0.f189771Tm);
            return;
        }
        CoreModule.f17545c.f19639e0.m169527p9();
        if (!z2 || TextUtils.isEmpty(str)) {
            String strString = m50437c().string(R$string.f18313Yq);
            String strString2 = m50437c().string(R$string.f18253Wq);
            String strString3 = m50437c().string(R$string.f18283Xq);
            this.f32843g.setText(i0g0.m133861b0(m50437c().getString(R$string.f18223Vq, strString, strString2, strString3), vwb.m200324f0(strString, strString2, strString3), m50437c().color(w0c0.f183790N1), eqh0.m117752c(3)));
        } else {
            this.f32843g.setText(Html.fromHtml(str));
        }
        this.f32843g.setGravity(17);
        this.f32842f.setText(R$string.f18343Zq);
        this.f32840d.setImageResource(x2c0.f189770Tl);
    }

    @Override // p149l.y0m
    /* JADX INFO: renamed from: a */
    public void mo50428a(boolean z, Media media) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9.fakeStatus)) {
            m50435d(z, media, true, userM169527p9.fakeStatus.text);
        } else {
            m50435d(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m50436b(View view) {
        bm90.m102606a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m50437c() {
        return (Act) getContext();
    }

    @Override // p149l.y0m
    public View getRenderView() {
        return this;
    }

    @Override // p149l.y0m
    public TextView getTitleView() {
        return this.f32842f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50436b(this);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
