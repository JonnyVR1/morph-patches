package com.p051p1.mobile.putong.feed.newui.mediapicker.post.state;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.d5i;
import p153l.fhh;
import p153l.fsb0;
import p153l.j4h;
import p153l.jyb;
import p153l.k9c0;
import p153l.lbc0;
import p153l.qa00;
import p153l.tfj0;
import p153l.uqb0;
import p153l.uzh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentPostStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VFrame f41655d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f41656e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f41657f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f41658g;

    /* JADX INFO: renamed from: h */
    public TextView f41659h;

    /* JADX INFO: renamed from: i */
    public List<uzh> f41660i;

    /* JADX INFO: renamed from: j */
    public Act f41661j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f41662k;

    public FeedMomentPostStatusView(Context context) {
        super(context);
        this.f41660i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m64245k0(Act act, View view) {
        tfj0.m190939b("e_fast_state_post", "p_moment_post", new tfj0.C20302a[0]);
        act.startActivityForResult(FeedMomentPostSelectStatusAct.m64242q2(act, this.f41662k), 10040);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R */
    public void m64246R(final Act act) {
        this.f41661j = act;
        addView(m64247i0(LayoutInflater.from(act), this));
        if (j4h.m143424h()) {
            this.f41659h.setTextColor(getResources().getColor(k9c0.f124507g));
        }
        this.f41659h.setText(FeedModule.m61406H().me_().name);
        uqb0.f180374G.m127111J0(this.f41656e, FeedModule.m61406H().me_().m61308fp().profileSmall(), true);
        m64248j0();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ehh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94041a.m64245k0(act, view);
            }
        });
        m64250m0();
    }

    /* JADX INFO: renamed from: i0 */
    public View m64247i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fhh.m125554b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m64248j0() {
        bnl0.m105524M(this.f41657f, false);
        uqb0.f180374G.m127138Y0(this.f41658g, lbc0.f130971X1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m64249l0(BubbleInfo bubbleInfo) {
        this.f41662k = bubbleInfo;
        VDraweeView vDraweeView = this.f41657f;
        if (bubbleInfo == null) {
            bnl0.m105524M(vDraweeView, false);
            uqb0.f180374G.m127138Y0(this.f41658g, lbc0.f130971X1);
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        if (!NullChecker.m82486a(bubbleInfo.emotion) || jyb.m147479J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(Color.parseColor(Constants.BLACK));
            this.f41657f.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                CrashHelper.m82479c(e);
            }
            this.f41657f.setBackground(shapeDrawable2);
        }
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView2 = this.f41658g;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156327n;
        fsb0Var.m127109I0(vDraweeView2, str, i, i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m64250m0() {
        String strM114303f = d5i.m114303f();
        if (!d5i.m114298a() || TextUtils.isEmpty(strM114303f)) {
            return;
        }
        VText vText = new VText(this.f41661j);
        int i = bnl0.f77544e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(strM114303f);
        vText.setTextSize(13.0f);
        vText.setPadding(qa00.m175859d(10.0f), qa00.m175859d(12.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        C4496a c4496aM21881x = new C4496a(this.f41661j).m21876s(vText).m21863e(true).m21869k(this.f41661j.getResources().getColor(k9c0.f124521n)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21882y(true).m21874q(C4496a.f16399N | C4496a.f16400O).m21881x(qa00.m175859d(10.0f));
        d5i.m114306i();
        C4499d.m21895l().m21907t(c4496aM21881x, this.f41657f);
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41660i = new ArrayList();
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41660i = new ArrayList();
    }
}
