package com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.ChatRoomBubble;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p149l.bkb0;
import p149l.e30;
import p149l.eyb0;
import p149l.ft3;
import p149l.j760;
import p149l.qib0;
import p149l.t100;
import p149l.vcl0;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class CRBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f35412d;

    /* JADX INFO: renamed from: e */
    public VRelative f35413e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f35414f;

    /* JADX INFO: renamed from: g */
    public VLinear f35415g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35416h;

    /* JADX INFO: renamed from: i */
    public TextView f35417i;

    /* JADX INFO: renamed from: j */
    public TextView f35418j;

    /* JADX INFO: renamed from: k */
    public TextView f35419k;

    /* JADX INFO: renamed from: l */
    public Space f35420l;

    /* JADX INFO: renamed from: m */
    public View f35421m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f35422n;

    /* JADX INFO: renamed from: o */
    public VFrame f35423o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f35424p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f35425q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f35426r;

    /* JADX INFO: renamed from: s */
    public View f35427s;

    /* JADX INFO: renamed from: t */
    public final int f35428t;

    /* JADX INFO: renamed from: u */
    public boolean f35429u;

    public CRBubbleItemView(Context context) {
        super(context);
        this.f35428t = t100.m186890d(25.0f);
        this.f35429u = false;
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f35415g.setAlpha(f.floatValue());
        this.f35418j.setAlpha(f.floatValue());
        this.f35419k.setAlpha(f.floatValue());
        this.f35422n.setAlpha(f.floatValue());
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: c */
    public void mo54563c(boolean z) {
        if (m54554h(this.f35423o)) {
            xdl0.m208345M0(this.f35423o, z);
        }
        if (m54554h(this.f35414f)) {
            xdl0.m208345M0(this.f35414f, z);
        }
        if (m54554h(this.f35415g)) {
            xdl0.m208345M0(this.f35415g, z);
        }
        if (m54554h(this.f35416h)) {
            xdl0.m208345M0(this.f35416h, z);
        }
        if (m54554h(this.f35419k)) {
            xdl0.m208345M0(this.f35419k, z);
        }
        if (m54554h(this.f35418j)) {
            xdl0.m208345M0(this.f35418j, z);
        }
        xdl0.m208345M0(this.f35427s, z);
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    /* JADX INFO: renamed from: e */
    public void mo54564e(float f) {
        ConstraintLayout constraintLayout = this.f35412d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f35412d.setPivotY(0.0f);
        this.f35412d.setScaleX(f);
        this.f35412d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.f167237L;
        vcl0.m197906b(this.f35413e, i - ((int) ((i - t100.f167271t) * f)));
    }

    @Override // com.p046p1.mobile.putong.p065ui.square.AbsBubbleItemView
    public View getAnimLayout() {
        return this.f35412d;
    }

    /* JADX INFO: renamed from: j */
    public final void m54565j(View view) {
        ft3.m123007a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m54566k(e30 e30Var, View view) {
        if (this.f35412d.getScaleY() < 0.5f) {
            return;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this);
        }
        zvf0.m220399u("e_live_audio_room_enter", "p_quickchat", j760.m140076a("audio_tab_id", "NA"), j760.m140076a(FirebaseAnalytics.Param.INDEX, "NA"), j760.m140076a("anchorId", "NA"), j760.m140076a("liveId", ((SquareDataWrapper) this.f54738a).f32663h.liveID), j760.m140076a("topic_id", "NA"), j760.m140076a("audio_room_label", "NA"), j760.m140076a("audio_card_type", "quickchat_bubble"));
    }

    /* JADX INFO: renamed from: l */
    public final void m54567l(SimpleDraweeView simpleDraweeView, String str) {
        bkb0 bkb0Var = qib0.f154691G;
        int i = this.f35428t;
        bkb0Var.m102325I0(simpleDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: m */
    public void m54568m(final e30<BaseBubbleItemView> e30Var) {
        if (this.f54738a == 0) {
            return;
        }
        xdl0.m208344M(this.f35414f, true);
        xdl0.m208344M(this.f35423o, true);
        m54569n();
        xdl0.m208329E0(this.f35412d, new View.OnClickListener() { // from class: l.et3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93070a.m54566k(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m54569n() {
        if (!this.f35429u) {
            SVGALoader.with(xdl0.m208326D(getContext())).from("https://auto.tancdn.com/v1/raw/da7629b4-7950-490a-a9fc-bfb139befa7f10.pdf").autoPlay(true).into(this.f35414f);
            this.f35429u = true;
        } else if (!this.f35414f.isAnimating()) {
            this.f35414f.stepToFrame(0.0f, true);
        }
        xdl0.m208344M(this.f35418j, true);
        this.f35419k.setMaxLines(1);
        D d = this.f54738a;
        ChatRoomBubble chatRoomBubble = ((SquareDataWrapper) d).f32663h;
        if (NullChecker.m81303a(((SquareDataWrapper) d).f32663h)) {
            xaj0<Integer, Integer, Integer> xaj0VarM118751b = eyb0.m118751b(Long.parseLong(chatRoomBubble.liveID));
            this.f35418j.setText(String.format("聊天室·%s人在线", Integer.valueOf(chatRoomBubble.chatUserNum)));
            this.f35419k.setText(chatRoomBubble.theme);
            this.f35413e.setBackgroundResource(xaj0VarM118751b.f191752b.intValue());
            vcl0.m197906b(this.f35413e, t100.f167271t);
            this.f35427s.setBackgroundColor(Color.parseColor("#C9C5FF"));
            vcl0.m197906b(this.f35427s, t100.f167259h);
            this.f35415g.setBackgroundColor(xaj0VarM118751b.f191753c.intValue());
            vcl0.m197906b(this.f35415g, t100.f167269r);
            xdl0.m208344M(this.f35416h, true);
            VDraweeView vDraweeView = this.f35416h;
            int i = t100.f167257f;
            vDraweeView.setPadding(i, i, i, i);
            this.f35416h.setImageResource(xaj0VarM118751b.f191751a.intValue());
            xdl0.m208344M(this.f35422n, false);
            xdl0.m208344M(this.f35421m, false);
            List<String> list = chatRoomBubble.avatars;
            boolean zM200296J = vwb.m200296J(list);
            VFrame vFrame = this.f35423o;
            if (zM200296J) {
                xdl0.m208344M(vFrame, false);
            } else {
                xdl0.m208344M(vFrame, true);
                m54570o(list);
            }
            zvf0.m220368A("e_live_audio_room_enter", "p_quickchat", j760.m140076a("audio_tab_id", "NA"), j760.m140076a(FirebaseAnalytics.Param.INDEX, "NA"), j760.m140076a("anchorId", "NA"), j760.m140076a("liveId", chatRoomBubble.liveID), j760.m140076a("topic_id", "NA"), j760.m140076a("audio_room_label", "NA"), j760.m140076a("audio_card_type", "quickchat_bubble"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m54570o(List<String> list) {
        int size = list.size();
        if (size >= 3) {
            m54567l(this.f35426r, list.get(0));
            m54567l(this.f35425q, list.get(1));
            m54567l(this.f35424p, list.get(2));
            xdl0.m208344M(this.f35426r, true);
            xdl0.m208344M(this.f35425q, true);
            xdl0.m208344M(this.f35424p, true);
            return;
        }
        VDraweeView vDraweeView = this.f35426r;
        if (size != 2) {
            m54567l(vDraweeView, list.get(0));
            xdl0.m208344M(this.f35426r, true);
            xdl0.m208344M(this.f35425q, false);
            xdl0.m208344M(this.f35424p, false);
            return;
        }
        m54567l(vDraweeView, list.get(0));
        m54567l(this.f35425q, list.get(1));
        xdl0.m208344M(this.f35426r, true);
        xdl0.m208344M(this.f35425q, true);
        xdl0.m208344M(this.f35424p, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54565j(this);
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35428t = t100.m186890d(25.0f);
        this.f35429u = false;
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35428t = t100.m186890d(25.0f);
        this.f35429u = false;
    }
}
