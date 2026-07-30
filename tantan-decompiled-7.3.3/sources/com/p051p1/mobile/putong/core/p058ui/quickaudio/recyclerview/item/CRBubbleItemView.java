package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.ChatRoomBubble;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p153l.bkj0;
import p153l.bnl0;
import p153l.eu3;
import p153l.fsb0;
import p153l.i4g0;
import p153l.i6c0;
import p153l.jyb;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.zll0;

/* JADX INFO: loaded from: classes12.dex */
public class CRBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f36260d;

    /* JADX INFO: renamed from: e */
    public VRelative f36261e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f36262f;

    /* JADX INFO: renamed from: g */
    public VLinear f36263g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36264h;

    /* JADX INFO: renamed from: i */
    public TextView f36265i;

    /* JADX INFO: renamed from: j */
    public TextView f36266j;

    /* JADX INFO: renamed from: k */
    public TextView f36267k;

    /* JADX INFO: renamed from: l */
    public Space f36268l;

    /* JADX INFO: renamed from: m */
    public View f36269m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f36270n;

    /* JADX INFO: renamed from: o */
    public VFrame f36271o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f36272p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f36273q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f36274r;

    /* JADX INFO: renamed from: s */
    public View f36275s;

    /* JADX INFO: renamed from: t */
    public final int f36276t;

    /* JADX INFO: renamed from: u */
    public boolean f36277u;

    public CRBubbleItemView(Context context) {
        super(context);
        this.f36276t = qa00.m175859d(25.0f);
        this.f36277u = false;
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f36263g.setAlpha(f.floatValue());
        this.f36266j.setAlpha(f.floatValue());
        this.f36267k.setAlpha(f.floatValue());
        this.f36270n.setAlpha(f.floatValue());
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo55746c(boolean z) {
        if (m55737h(this.f36271o)) {
            bnl0.m105525M0(this.f36271o, z);
        }
        if (m55737h(this.f36262f)) {
            bnl0.m105525M0(this.f36262f, z);
        }
        if (m55737h(this.f36263g)) {
            bnl0.m105525M0(this.f36263g, z);
        }
        if (m55737h(this.f36264h)) {
            bnl0.m105525M0(this.f36264h, z);
        }
        if (m55737h(this.f36267k)) {
            bnl0.m105525M0(this.f36267k, z);
        }
        if (m55737h(this.f36266j)) {
            bnl0.m105525M0(this.f36266j, z);
        }
        bnl0.m105525M0(this.f36275s, z);
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo55747e(float f) {
        ConstraintLayout constraintLayout = this.f36260d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f36260d.setPivotY(0.0f);
        this.f36260d.setScaleX(f);
        this.f36260d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = qa00.f156299L;
        zll0.m220293b(this.f36261e, i - ((int) ((i - qa00.f156333t) * f)));
    }

    @Override // com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f36260d;
    }

    /* JADX INFO: renamed from: j */
    public final void m55748j(View view) {
        eu3.m122522a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m55749k(y20 y20Var, View view) {
        if (this.f36260d.getScaleY() < 0.5f) {
            return;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this);
        }
        i4g0.m138523u("e_live_audio_room_enter", "p_quickchat", pf60.m172085a("audio_tab_id", "NA"), pf60.m172085a(FirebaseAnalytics.Param.INDEX, "NA"), pf60.m172085a("anchorId", "NA"), pf60.m172085a("liveId", ((SquareDataWrapper) this.f55586a).f33511h.liveID), pf60.m172085a("topic_id", "NA"), pf60.m172085a("audio_room_label", "NA"), pf60.m172085a("audio_card_type", "quickchat_bubble"));
    }

    /* JADX INFO: renamed from: l */
    public final void m55750l(SimpleDraweeView simpleDraweeView, String str) {
        fsb0 fsb0Var = uqb0.f180374G;
        int i = this.f36276t;
        fsb0Var.m127109I0(simpleDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: m */
    public void m55751m(final y20<BaseBubbleItemView> y20Var) {
        if (this.f55586a == 0) {
            return;
        }
        bnl0.m105524M(this.f36262f, true);
        bnl0.m105524M(this.f36271o, true);
        m55752n();
        bnl0.m105509E0(this.f36260d, new View.OnClickListener() { // from class: l.du3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90739a.m55749k(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m55752n() {
        if (!this.f36277u) {
            SVGALoader.with(bnl0.m105506D(getContext())).from("https://auto.tancdn.com/v1/raw/da7629b4-7950-490a-a9fc-bfb139befa7f10.pdf").autoPlay(true).into(this.f36262f);
            this.f36277u = true;
        } else if (!this.f36262f.isAnimating()) {
            this.f36262f.stepToFrame(0.0f, true);
        }
        bnl0.m105524M(this.f36266j, true);
        this.f36267k.setMaxLines(1);
        D d = this.f55586a;
        ChatRoomBubble chatRoomBubble = ((SquareDataWrapper) d).f33511h;
        if (NullChecker.m82486a(((SquareDataWrapper) d).f33511h)) {
            bkj0<Integer, Integer, Integer> bkj0VarM138803b = i6c0.m138803b(Long.parseLong(chatRoomBubble.liveID));
            this.f36266j.setText(String.format("聊天室·%s人在线", Integer.valueOf(chatRoomBubble.chatUserNum)));
            this.f36267k.setText(chatRoomBubble.theme);
            this.f36261e.setBackgroundResource(bkj0VarM138803b.f77082b.intValue());
            zll0.m220293b(this.f36261e, qa00.f156333t);
            this.f36275s.setBackgroundColor(Color.parseColor("#C9C5FF"));
            zll0.m220293b(this.f36275s, qa00.f156321h);
            this.f36263g.setBackgroundColor(bkj0VarM138803b.f77083c.intValue());
            zll0.m220293b(this.f36263g, qa00.f156331r);
            bnl0.m105524M(this.f36264h, true);
            VDraweeView vDraweeView = this.f36264h;
            int i = qa00.f156319f;
            vDraweeView.setPadding(i, i, i, i);
            this.f36264h.setImageResource(bkj0VarM138803b.f77081a.intValue());
            bnl0.m105524M(this.f36270n, false);
            bnl0.m105524M(this.f36269m, false);
            List<String> list = chatRoomBubble.avatars;
            boolean zM147479J = jyb.m147479J(list);
            VFrame vFrame = this.f36271o;
            if (zM147479J) {
                bnl0.m105524M(vFrame, false);
            } else {
                bnl0.m105524M(vFrame, true);
                m55753o(list);
            }
            i4g0.m138492A("e_live_audio_room_enter", "p_quickchat", pf60.m172085a("audio_tab_id", "NA"), pf60.m172085a(FirebaseAnalytics.Param.INDEX, "NA"), pf60.m172085a("anchorId", "NA"), pf60.m172085a("liveId", chatRoomBubble.liveID), pf60.m172085a("topic_id", "NA"), pf60.m172085a("audio_room_label", "NA"), pf60.m172085a("audio_card_type", "quickchat_bubble"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m55753o(List<String> list) {
        int size = list.size();
        if (size >= 3) {
            m55750l(this.f36274r, list.get(0));
            m55750l(this.f36273q, list.get(1));
            m55750l(this.f36272p, list.get(2));
            bnl0.m105524M(this.f36274r, true);
            bnl0.m105524M(this.f36273q, true);
            bnl0.m105524M(this.f36272p, true);
            return;
        }
        VDraweeView vDraweeView = this.f36274r;
        if (size != 2) {
            m55750l(vDraweeView, list.get(0));
            bnl0.m105524M(this.f36274r, true);
            bnl0.m105524M(this.f36273q, false);
            bnl0.m105524M(this.f36272p, false);
            return;
        }
        m55750l(vDraweeView, list.get(0));
        m55750l(this.f36273q, list.get(1));
        bnl0.m105524M(this.f36274r, true);
        bnl0.m105524M(this.f36273q, true);
        bnl0.m105524M(this.f36272p, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55748j(this);
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36276t = qa00.m175859d(25.0f);
        this.f36277u = false;
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36276t = qa00.m175859d(25.0f);
        this.f36277u = false;
    }
}
