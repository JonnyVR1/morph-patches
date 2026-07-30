package com.p051p1.mobile.putong.core.p058ui.popup;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fu90;
import p153l.jyb;
import p153l.lyh0;
import p153l.q8g0;
import p153l.r3m;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileFakeView extends RelativeLayout implements r3m {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f33685a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f33686b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33687c;

    /* JADX INFO: renamed from: d */
    public ImageView f33688d;

    /* JADX INFO: renamed from: e */
    public FakeTwoCardView f33689e;

    /* JADX INFO: renamed from: f */
    public VText f33690f;

    /* JADX INFO: renamed from: g */
    public VText f33691g;

    public ProfileFakeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m51618d(boolean z, Media media, boolean z2, String str) {
        uqb0.f180374G.m127115L0(this.f33687c, media.url);
        if (!z) {
            this.f33690f.setText(m51620c().string(R$string.f18369Cl));
            this.f33691g.setText(R$string.f18338Bl);
            this.f33688d.setImageResource(dbc0.f86224Hn);
            return;
        }
        CoreModule.f18264c.f20381e0.m116600p9();
        if (!z2 || TextUtils.isEmpty(str)) {
            String strString = m51620c().string(R$string.f19690tr);
            String strString2 = m51620c().string(R$string.f19628rr);
            String strString3 = m51620c().string(R$string.f19659sr);
            this.f33691g.setText(q8g0.m175796b0(m51620c().getString(R$string.f19597qr, strString, strString2, strString3), jyb.m147507f0(strString, strString2, strString3), m51620c().color(c9c0.f80362O1), lyh0.m156283c(3)));
        } else {
            this.f33691g.setText(Html.fromHtml(str));
        }
        this.f33691g.setGravity(17);
        this.f33690f.setText(R$string.f19721ur);
        this.f33688d.setImageResource(dbc0.f86223Hm);
    }

    @Override // p153l.r3m
    /* JADX INFO: renamed from: a */
    public void mo51611a(boolean z, Media media) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9.fakeStatus)) {
            m51618d(z, media, true, userM116600p9.fakeStatus.text);
        } else {
            m51618d(z, media, false, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m51619b(View view) {
        fu90.m127439a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m51620c() {
        return (Act) getContext();
    }

    @Override // p153l.r3m
    public View getRenderView() {
        return this;
    }

    @Override // p153l.r3m
    public TextView getTitleView() {
        return this.f33690f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51619b(this);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileFakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
