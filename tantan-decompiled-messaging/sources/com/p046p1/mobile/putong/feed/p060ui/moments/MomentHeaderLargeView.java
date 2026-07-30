package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p147v.VText_Expandable;
import p149l.e1c0;
import p149l.gg00;
import p149l.i0e;
import p149l.kjb0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xck0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentHeaderLargeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear_FillerMeasure f43755d;

    /* JADX INFO: renamed from: e */
    public VText f43756e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43757f;

    /* JADX INFO: renamed from: g */
    public VImage f43758g;

    /* JADX INFO: renamed from: h */
    public VText f43759h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43760i;

    /* JADX INFO: renamed from: j */
    public ImageView f43761j;

    /* JADX INFO: renamed from: k */
    public VText_Expandable f43762k;

    /* JADX INFO: renamed from: l */
    public Moment f43763l;

    /* JADX INFO: renamed from: m */
    public boolean f43764m;

    public MomentHeaderLargeView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m66711n0(View view) {
        m66713m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m66712l0(View view) {
        gg00.m125937a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m66713m0() {
        act().startActivity(kjb0.m146199j(act(), act().getResources().getString(R$string.f39092k4), this.f43763l.landingPage));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean m66714o0(View view) {
        i0e.m133793b(act(), this.f43763l.value);
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66712l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m66715p0(TextView textView, boolean z) {
        this.f43764m = z;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m66716q0(View view) {
        m66713m0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m66717r0(Moment moment) {
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
        VDraweeView vDraweeView = (VDraweeView) this.f43760i.getChildAt(0);
        if (!NullChecker.m81304b(picture)) {
            qib0.f154691G.m184725o(vDraweeView);
            vDraweeView.setVisibility(8);
        } else {
            int iM208412y0 = xdl0.m208412y0() - t100.m186890d(28.0f);
            Dimension dimension = picture.size;
            qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(xck0.m208121b(iM208412y0, new Point(dimension.width, dimension.height)).x));
            vDraweeView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m66718s0() {
        m66719t0(true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m66719t0(boolean z) {
        this.f43764m = z;
        this.f43762k.setOnClickListener(new View.OnClickListener() { // from class: l.cg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80689a.m66711n0(view);
            }
        });
        this.f43762k.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.dg00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f85993a.m66714o0(view);
            }
        });
        this.f43762k.setOnExpandStateChangeListener(new VText_Expandable.InterfaceC22581c() { // from class: l.eg00
            @Override // p147v.VText_Expandable.InterfaceC22581c
            /* JADX INFO: renamed from: a */
            public final void mo116115a(TextView textView, boolean z2) {
                this.f90880a.m66715p0(textView, z2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public void m66720u0(Moment moment) {
        this.f43763l = moment;
        this.f43762k.m223284o(moment.value, this.f43764m);
        this.f43759h.setText(mqi0.m155932G(moment.createdTime));
        if (!NullChecker.m81304b(moment.media) || moment.media.size() == 0) {
            this.f43760i.setVisibility(8);
        } else {
            m66717r0(moment);
            this.f43760i.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m66721v0(User user) {
        this.f43756e.setText(user.name);
        if (FeedModule.m60222H().mo30742a().mo165304d() && user.isVIP()) {
            this.f43756e.setTextColor(act().color(e1c0.f88793k0));
        } else {
            this.f43756e.setTextColor(act().color(e1c0.f88795l0));
        }
        kjb0.m146214y(act(), user, this.f43758g, true, false);
        this.f43760i.setOnClickListener(new View.OnClickListener() { // from class: l.fg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97325a.m66716q0(view);
            }
        });
        boolean zM200296J = vwb.m200296J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f43757f;
        if (zM200296J) {
            xdl0.m208344M(vDraweeView, false);
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        qib0.f154691G.m102331L0(this.f43757f, qib0.f154709X.m126254n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentHeaderLargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
