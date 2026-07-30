package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p1.mobile.putong.core.data.ChatRoomBubble;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.p1.mobile.putong.ui.square.AbsBubbleItemView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.ft3;
import l.j760;
import l.t100;
import l.vcl0;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import p006l.bkb0;
import p006l.eyb0;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CRBubbleItemView extends BaseBubbleItemView {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f5193d;

    /* JADX INFO: renamed from: e */
    public VRelative f5194e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f5195f;

    /* JADX INFO: renamed from: g */
    public VLinear f5196g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5197h;

    /* JADX INFO: renamed from: i */
    public TextView f5198i;

    /* JADX INFO: renamed from: j */
    public TextView f5199j;

    /* JADX INFO: renamed from: k */
    public TextView f5200k;

    /* JADX INFO: renamed from: l */
    public Space f5201l;

    /* JADX INFO: renamed from: m */
    public View f5202m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f5203n;

    /* JADX INFO: renamed from: o */
    public VFrame f5204o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f5205p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5206q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f5207r;

    /* JADX INFO: renamed from: s */
    public View f5208s;

    /* JADX INFO: renamed from: t */
    public final int f5209t;

    /* JADX INFO: renamed from: u */
    public boolean f5210u;

    public CRBubbleItemView(Context context) {
        super(context);
        this.f5209t = t100.d(25.0f);
        this.f5210u = false;
    }

    private void setContentAlpha(Float f) {
        if (f.floatValue() < 0.0f) {
            return;
        }
        this.f5196g.setAlpha(f.floatValue());
        this.f5199j.setAlpha(f.floatValue());
        this.f5200k.setAlpha(f.floatValue());
        this.f5203n.setAlpha(f.floatValue());
    }

    /* JADX INFO: renamed from: c */
    public void m7906c(boolean z) {
        if (m7897h(this.f5204o)) {
            xdl0.M0(this.f5204o, z);
        }
        if (m7897h(this.f5195f)) {
            xdl0.M0(this.f5195f, z);
        }
        if (m7897h(this.f5196g)) {
            xdl0.M0(this.f5196g, z);
        }
        if (m7897h(this.f5197h)) {
            xdl0.M0(this.f5197h, z);
        }
        if (m7897h(this.f5200k)) {
            xdl0.M0(this.f5200k, z);
        }
        if (m7897h(this.f5199j)) {
            xdl0.M0(this.f5199j, z);
        }
        xdl0.M0(this.f5208s, z);
    }

    /* JADX INFO: renamed from: e */
    public void m7907e(float f) {
        ConstraintLayout constraintLayout = this.f5193d;
        constraintLayout.setPivotX(constraintLayout.getWidth() / 2.0f);
        this.f5193d.setPivotY(0.0f);
        this.f5193d.setScaleX(f);
        this.f5193d.setScaleY(f);
        setContentAlpha(Float.valueOf((float) ((((double) f) - 0.5d) * 2.0d)));
        int i = t100.L;
        vcl0.b(this.f5194e, i - ((int) ((i - t100.t) * f)));
    }

    public View getAnimLayout() {
        return this.f5193d;
    }

    /* JADX INFO: renamed from: j */
    public final void m7908j(View view) {
        ft3.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7909k(e30 e30Var, View view) {
        if (this.f5193d.getScaleY() < 0.5f) {
            return;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(this);
        }
        zvf0.u("e_live_audio_room_enter", "p_quickchat", new j760[]{j760.a("audio_tab_id", "NA"), j760.a("index", "NA"), j760.a("anchorId", "NA"), j760.a("liveId", ((AbsBubbleItemView) this).a.h.liveID), j760.a("topic_id", "NA"), j760.a("audio_room_label", "NA"), j760.a("audio_card_type", "quickchat_bubble")});
    }

    /* JADX INFO: renamed from: l */
    public final void m7910l(SimpleDraweeView simpleDraweeView, String str) {
        bkb0 bkb0Var = qib0.f19782G;
        int i = this.f5209t;
        bkb0Var.m12738I0(simpleDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: m */
    public void m7911m(final e30<BaseBubbleItemView> e30Var) {
        if (((AbsBubbleItemView) this).a == null) {
            return;
        }
        xdl0.M(this.f5195f, true);
        xdl0.M(this.f5204o, true);
        m7912n();
        xdl0.E0(this.f5193d, new View.OnClickListener() { // from class: l.et3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11424a.m7909k(e30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m7912n() {
        if (!this.f5210u) {
            SVGALoader.with(xdl0.D(getContext())).from("https://auto.tancdn.com/v1/raw/da7629b4-7950-490a-a9fc-bfb139befa7f10.pdf").autoPlay(true).into(this.f5195f);
            this.f5210u = true;
        } else if (!this.f5195f.isAnimating()) {
            this.f5195f.stepToFrame(0.0f, true);
        }
        xdl0.M(this.f5199j, true);
        this.f5200k.setMaxLines(1);
        SquareDataWrapper squareDataWrapper = ((AbsBubbleItemView) this).a;
        ChatRoomBubble chatRoomBubble = squareDataWrapper.h;
        if (NullChecker.a(squareDataWrapper.h)) {
            xaj0<Integer, Integer, Integer> xaj0VarM14926b = eyb0.m14926b(Long.parseLong(chatRoomBubble.liveID));
            this.f5199j.setText(String.format("聊天室·%s人在线", Integer.valueOf(chatRoomBubble.chatUserNum)));
            this.f5200k.setText(chatRoomBubble.theme);
            this.f5194e.setBackgroundResource(((Integer) xaj0VarM14926b.b).intValue());
            vcl0.b(this.f5194e, t100.t);
            this.f5208s.setBackgroundColor(Color.parseColor("#C9C5FF"));
            vcl0.b(this.f5208s, t100.h);
            this.f5196g.setBackgroundColor(((Integer) xaj0VarM14926b.c).intValue());
            vcl0.b(this.f5196g, t100.r);
            xdl0.M(this.f5197h, true);
            VDraweeView vDraweeView = this.f5197h;
            int i = t100.f;
            vDraweeView.setPadding(i, i, i, i);
            this.f5197h.setImageResource(((Integer) xaj0VarM14926b.a).intValue());
            xdl0.M(this.f5203n, false);
            xdl0.M(this.f5202m, false);
            List list = chatRoomBubble.avatars;
            boolean zJ = vwb.J(list);
            VFrame vFrame = this.f5204o;
            if (zJ) {
                xdl0.M(vFrame, false);
            } else {
                xdl0.M(vFrame, true);
                m7913o(list);
            }
            zvf0.A("e_live_audio_room_enter", "p_quickchat", new j760[]{j760.a("audio_tab_id", "NA"), j760.a("index", "NA"), j760.a("anchorId", "NA"), j760.a("liveId", chatRoomBubble.liveID), j760.a("topic_id", "NA"), j760.a("audio_room_label", "NA"), j760.a("audio_card_type", "quickchat_bubble")});
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7913o(List<String> list) {
        int size = list.size();
        if (size >= 3) {
            m7910l(this.f5207r, list.get(0));
            m7910l(this.f5206q, list.get(1));
            m7910l(this.f5205p, list.get(2));
            xdl0.M(this.f5207r, true);
            xdl0.M(this.f5206q, true);
            xdl0.M(this.f5205p, true);
            return;
        }
        VDraweeView vDraweeView = this.f5207r;
        if (size != 2) {
            m7910l(vDraweeView, list.get(0));
            xdl0.M(this.f5207r, true);
            xdl0.M(this.f5206q, false);
            xdl0.M(this.f5205p, false);
            return;
        }
        m7910l(vDraweeView, list.get(0));
        m7910l(this.f5206q, list.get(1));
        xdl0.M(this.f5207r, true);
        xdl0.M(this.f5206q, true);
        xdl0.M(this.f5205p, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7908j(this);
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5209t = t100.d(25.0f);
        this.f5210u = false;
    }

    public CRBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5209t = t100.d(25.0f);
        this.f5210u = false;
    }
}
