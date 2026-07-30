package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p151v.VText_Expandable;
import p153l.bnl0;
import p153l.dmk0;
import p153l.jyb;
import p153l.k9c0;
import p153l.orb0;
import p153l.po00;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;
import p153l.w1e;

/* JADX INFO: loaded from: classes13.dex */
public class MomentHeaderLargeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear_FillerMeasure f44603d;

    /* JADX INFO: renamed from: e */
    public VText f44604e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f44605f;

    /* JADX INFO: renamed from: g */
    public VImage f44606g;

    /* JADX INFO: renamed from: h */
    public VText f44607h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44608i;

    /* JADX INFO: renamed from: j */
    public ImageView f44609j;

    /* JADX INFO: renamed from: k */
    public VText_Expandable f44610k;

    /* JADX INFO: renamed from: l */
    public Moment f44611l;

    /* JADX INFO: renamed from: m */
    public boolean f44612m;

    public MomentHeaderLargeView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m67894n0(View view) {
        m67896m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m67895l0(View view) {
        po00.m173094a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m67896m0() {
        act().startActivity(orb0.m168893j(act(), act().getResources().getString(R$string.f39940k4), this.f44611l.landingPage));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean m67897o0(View view) {
        w1e.m204398b(act(), this.f44611l.value);
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67895l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m67898p0(TextView textView, boolean z) {
        this.f44612m = z;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m67899q0(View view) {
        m67896m0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m67900r0(Moment moment) {
        Picture picture;
        if (moment.media.isEmpty()) {
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            picture = ((Video) media).cover;
        } else {
            picture = media instanceof Picture ? (Picture) media : null;
        }
        VDraweeView vDraweeView = (VDraweeView) this.f44608i.getChildAt(0);
        if (!NullChecker.m82487b(picture)) {
            uqb0.f180374G.m98798o(vDraweeView);
            vDraweeView.setVisibility(8);
        } else {
            int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(28.0f);
            Dimension dimension = picture.size;
            uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(dmk0.m116963b(iM105592y0, new Point(dimension.width, dimension.height)).x));
            vDraweeView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m67901s0() {
        m67902t0(true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m67902t0(boolean z) {
        this.f44612m = z;
        this.f44610k.setOnClickListener(new View.OnClickListener() { // from class: l.lo00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132868a.m67894n0(view);
            }
        });
        this.f44610k.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mo00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f137765a.m67897o0(view);
            }
        });
        this.f44610k.setOnExpandStateChangeListener(new VText_Expandable.InterfaceC22696c() { // from class: l.no00
            @Override // p151v.VText_Expandable.InterfaceC22696c
            /* JADX INFO: renamed from: a */
            public final void mo98783a(TextView textView, boolean z2) {
                this.f142902a.m67898p0(textView, z2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public void m67903u0(Moment moment) {
        this.f44611l = moment;
        this.f44610k.m224530o(moment.value, this.f44612m);
        this.f44607h.setText(pzi0.m174442G(moment.createdTime));
        if (!NullChecker.m82487b(moment.media) || moment.media.size() == 0) {
            this.f44608i.setVisibility(8);
        } else {
            m67900r0(moment);
            this.f44608i.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m67904v0(User user) {
        this.f44604e.setText(user.name);
        if (FeedModule.m61406H().mo31745a().mo192247d() && user.isVIP()) {
            this.f44604e.setTextColor(act().color(k9c0.f124516k0));
        } else {
            this.f44604e.setTextColor(act().color(k9c0.f124518l0));
        }
        orb0.m168908y(act(), user, this.f44606g, true, false);
        this.f44608i.setOnClickListener(new View.OnClickListener() { // from class: l.oo00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148250a.m67899q0(view);
            }
        });
        boolean zM147479J = jyb.m147479J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f44605f;
        if (zM147479J) {
            bnl0.m105524M(vDraweeView, false);
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        uqb0.f180374G.m127115L0(this.f44605f, uqb0.f180392X.m135325n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
