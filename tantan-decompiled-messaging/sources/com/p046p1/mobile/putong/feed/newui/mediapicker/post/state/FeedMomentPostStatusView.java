package com.p046p1.mobile.putong.feed.newui.mediapicker.post.state;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.bkb0;
import p149l.e1c0;
import p149l.f3c0;
import p149l.fyh;
import p149l.o3i;
import p149l.p6j0;
import p149l.qfh;
import p149l.qib0;
import p149l.t100;
import p149l.u2h;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentPostStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VFrame f40807d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f40808e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f40809f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f40810g;

    /* JADX INFO: renamed from: h */
    public TextView f40811h;

    /* JADX INFO: renamed from: i */
    public List<fyh> f40812i;

    /* JADX INFO: renamed from: j */
    public Act f40813j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f40814k;

    public FeedMomentPostStatusView(Context context) {
        super(context);
        this.f40812i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m63062k0(Act act, View view) {
        p6j0.m167668b("e_fast_state_post", "p_moment_post", new p6j0.C19147a[0]);
        act.startActivityForResult(FeedMomentPostSelectStatusAct.m63059p2(act, this.f40814k), 10040);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R */
    public void m63063R(final Act act) {
        this.f40813j = act;
        addView(m63064i0(LayoutInflater.from(act), this));
        if (u2h.m191499h()) {
            this.f40811h.setTextColor(getResources().getColor(e1c0.f88784g));
        }
        this.f40811h.setText(FeedModule.m60222H().me_().name);
        qib0.f154691G.m102327J0(this.f40808e, FeedModule.m60222H().me_().m60124fp().profileSmall(), true);
        m63065j0();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.pfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148557a.m63062k0(act, view);
            }
        });
        m63067m0();
    }

    /* JADX INFO: renamed from: i0 */
    public View m63064i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qfh.m174312b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m63065j0() {
        xdl0.m208344M(this.f40809f, false);
        qib0.f154691G.m102354Y0(this.f40810g, f3c0.f94453X1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m63066l0(BubbleInfo bubbleInfo) {
        this.f40814k = bubbleInfo;
        VDraweeView vDraweeView = this.f40809f;
        if (bubbleInfo == null) {
            xdl0.m208344M(vDraweeView, false);
            qib0.f154691G.m102354Y0(this.f40810g, f3c0.f94453X1);
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        if (!NullChecker.m81303a(bubbleInfo.emotion) || vwb.m200296J(bubbleInfo.emotion.backgroundColor)) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(Color.parseColor(Constants.BLACK));
            this.f40809f.setBackground(shapeDrawable);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            try {
                shapeDrawable2.getPaint().setColor(Color.parseColor(bubbleInfo.emotion.backgroundColor.get(0)));
            } catch (IllegalArgumentException e) {
                shapeDrawable2.getPaint().setColor(Color.parseColor("#FFFFFF"));
                CrashHelper.m81296c(e);
            }
            this.f40809f.setBackground(shapeDrawable2);
        }
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView2 = this.f40810g;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167265n;
        bkb0Var.m102325I0(vDraweeView2, str, i, i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m63067m0() {
        String strM162432f = o3i.m162432f();
        if (!o3i.m162427a() || TextUtils.isEmpty(strM162432f)) {
            return;
        }
        VText vText = new VText(this.f40813j);
        int i = xdl0.f192403e;
        vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        vText.setText(strM162432f);
        vText.setTextSize(13.0f);
        vText.setPadding(t100.m186890d(10.0f), t100.m186890d(12.0f), t100.m186890d(10.0f), t100.m186890d(10.0f));
        vText.setTextColor(-1);
        vText.getPaint().setFakeBoldText(true);
        C4345a c4345aM20882x = new C4345a(this.f40813j).m20877s(vText).m20864e(true).m20870k(this.f40813j.getResources().getColor(e1c0.f88798n)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20883y(true).m20875q(C4345a.f15680N | C4345a.f15681O).m20882x(t100.m186890d(10.0f));
        o3i.m162435i();
        C4348d.m20896l().m20908t(c4345aM20882x, this.f40809f);
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40812i = new ArrayList();
    }

    public FeedMomentPostStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40812i = new ArrayList();
    }
}
