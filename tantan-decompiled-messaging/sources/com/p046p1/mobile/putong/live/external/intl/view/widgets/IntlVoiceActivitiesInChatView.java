package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.facebook.drawee.generic.RoundingParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesAct;
import java.util.concurrent.ConcurrentLinkedDeque;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.cqp;
import p149l.e30;
import p149l.ejj;
import p149l.ftd0;
import p149l.g1c0;
import p149l.gld0;
import p149l.hxs;
import p149l.jj3;
import p149l.mmf0;
import p149l.mqi0;
import p149l.nvc0;
import p149l.oop;
import p149l.qib0;
import p149l.s6c0;
import p149l.s91;
import p149l.s9s;
import p149l.t100;
import p149l.uop;
import p149l.vwb;
import p149l.w8u;
import p149l.wp1;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlVoiceActivitiesInChatView extends VLinear implements cqp {

    /* JADX INFO: renamed from: c */
    public VDraweeView f45885c;

    /* JADX INFO: renamed from: d */
    public LiveHaloAvatar f45886d;

    /* JADX INFO: renamed from: e */
    public ClipLayout f45887e;

    /* JADX INFO: renamed from: f */
    public VImage f45888f;

    /* JADX INFO: renamed from: g */
    public VLinear f45889g;

    /* JADX INFO: renamed from: h */
    public VText f45890h;

    /* JADX INFO: renamed from: i */
    public VText f45891i;

    /* JADX INFO: renamed from: j */
    public TextView f45892j;

    /* JADX INFO: renamed from: k */
    public TextView f45893k;

    /* JADX INFO: renamed from: l */
    public oop f45894l;

    /* JADX INFO: renamed from: m */
    public ConcurrentLinkedDeque<VDraweeView> f45895m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f45896n;

    /* JADX INFO: renamed from: o */
    public Animator f45897o;

    /* JADX INFO: renamed from: p */
    public int f45898p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView$a */
    public class C12564a extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f45899a;

        public C12564a(VDraweeView vDraweeView) {
            this.f45899a = vDraweeView;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            VDraweeView vDraweeView = this.f45899a;
            if (vDraweeView != null) {
                IntlVoiceActivitiesInChatView.this.m70395h0(vDraweeView);
                this.f45899a.setAlpha(1.0f);
                IntlVoiceActivitiesInChatView.this.f45895m.add(this.f45899a);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView$b */
    public class C12565b extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f45901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IntlVoiceLiveActivitiesCellBean.RelationUser f45902b;

        public C12565b(VDraweeView vDraweeView, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
            this.f45901a = vDraweeView;
            this.f45902b = relationUser;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m70403b(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
            IntlVoiceActivitiesInChatView.this.m70389b0(relationUser, false);
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlVoiceActivitiesInChatView.this.f45896n = this.f45901a;
            IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView = IntlVoiceActivitiesInChatView.this;
            final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser = this.f45902b;
            xdl0.m208329E0(intlVoiceActivitiesInChatView, new View.OnClickListener() { // from class: l.top
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171398a.m70403b(relationUser, view);
                }
            });
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            IntlVoiceActivitiesInChatView.this.f45887e.addView(this.f45901a);
            hxs.m133406s("context_common", this.f45901a, this.f45902b.getUserAvatar());
        }
    }

    public IntlVoiceActivitiesInChatView(Act act, wp1 wp1Var) {
        super(act);
        this.f45895m = new ConcurrentLinkedDeque<>();
        View.inflate(act, s6c0.f162690N1, this);
        m70386Y(this);
        this.f45894l = new oop(this, act, wp1Var);
    }

    /* JADX INFO: renamed from: l0 */
    private void m70385l0() {
        xdl0.m208344M(this.f45886d, false);
        xdl0.m208344M(this.f45885c, false);
        xdl0.m208344M(this.f45887e, false);
        xdl0.m208344M(this.f45892j, false);
        xdl0.m208344M(this.f45893k, false);
        xdl0.m208344M(this.f45888f, false);
        this.f45887e.removeAllViews();
        this.f45895m.clear();
        Animator animator = this.f45897o;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m70386Y(View view) {
        uop.m194557a(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public final VDraweeView m70387Z() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(t100.m186890d(60.0f), t100.m186890d(60.0f)));
        RoundingParams roundingParamsM8249c = RoundingParams.m8249c(0.0f);
        roundingParamsM8249c.m8268v(true);
        ejj ejjVar = new ejj(getContext().getResources());
        ejjVar.m116892v(ftd0.f99185i).m116870K(roundingParamsM8249c);
        vDraweeView.setHierarchy(ejjVar.m116872a());
        return vDraweeView;
    }

    /* JADX INFO: renamed from: a0 */
    public void m70388a0(boolean z, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
        if (relationUser == null) {
            return;
        }
        zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f45898p)), vwb.m200311Y("liveId", relationUser.getVoiceLiveId()), vwb.m200311Y("anchorId", relationUser.getUserId()), vwb.m200311Y("audio_room_type", relationUser.getLiveMode()), vwb.m200311Y("audio_card_type", z ? "msg_audio_follow_cell" : "msg_audio_multi_follow_cell"));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m70389b0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, boolean z) {
        getContext().startActivity(s91.m182688a(getContext(), AudienceStartData.getBuilder().m67606Q(true).m67594E(relationUser.getVoiceLiveId()).m67601L(relationUser.getVoiceRoomId()).m67611u()));
        ((jj3) s9s.m182763m(gld0.f103314d)).m141741f();
        xdl0.m208344M(this.f45888f, false);
        zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f45898p)), vwb.m200311Y("liveId", relationUser.getVoiceLiveId()), vwb.m200311Y("anchorId", relationUser.getUserId()), vwb.m200311Y("audio_room_type", relationUser.getLiveMode()), vwb.m200311Y("audio_card_type", z ? "msg_audio_follow_cell" : "msg_audio_multi_follow_cell"));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m70390c0(View view) {
        getContext().startActivity(LiveVoiceActivitiesAct.m70976X1(getContext(), true));
        zvf0.m220399u("e_audio_follow", OMSDialogPositon.p_messages_view, vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("is_show_red_dot", "false"), vwb.m200311Y("tooltips_type_ui", "NA"), vwb.m200311Y("red_dot_num", "NA"), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, "no_audio_available"));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m70391d0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
        m70389b0(relationUser, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m70392e0(Bitmap bitmap) {
        this.f45886d.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m70393f0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
        m70389b0(relationUser, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final VDraweeView m70394g0() {
        VDraweeView vDraweeViewPoll = this.f45895m.poll();
        if (vDraweeViewPoll == null) {
            vDraweeViewPoll = m70387Z();
        }
        m70395h0(vDraweeViewPoll);
        return vDraweeViewPoll;
    }

    @Override // p149l.cqp
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70395h0(VDraweeView vDraweeView) {
        if (vDraweeView.getParent() == null || !(vDraweeView.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) vDraweeView.getParent()).removeView(vDraweeView);
    }

    /* JADX INFO: renamed from: i0 */
    public void m70396i0() {
        m70385l0();
        xdl0.m208344M(this.f45885c, true);
        xdl0.m208344M(this.f45892j, true);
        this.f45890h.setText(R$string.f44934w0);
        this.f45891i.setText(R$string.f44928t0);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.pop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150552a.m70390c0(view);
            }
        });
        zvf0.m220368A("e_audio_follow", OMSDialogPositon.p_messages_view, vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("is_show_red_dot", "false"), vwb.m200311Y("tooltips_type_ui", "NA"), vwb.m200311Y("red_dot_num", "NA"), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, "no_audio_available"));
    }

    /* JADX INFO: renamed from: j0 */
    public void m70397j0(final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, boolean z, int i, long j) {
        VDraweeView vDraweeView;
        int childCount = this.f45887e.getChildCount();
        if (!z || childCount <= 0 || (vDraweeView = this.f45896n) == null) {
            m70385l0();
            m70399m0();
            VDraweeView vDraweeViewM70394g0 = m70394g0();
            xdl0.m208344M(this.f45887e, true);
            xdl0.m208344M(this.f45893k, true);
            hxs.m133406s("context_common", vDraweeViewM70394g0, relationUser.getUserAvatar());
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.sop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165713a.m70391d0(relationUser, view);
                }
            });
            this.f45887e.addView(vDraweeViewM70394g0);
            this.f45896n = vDraweeViewM70394g0;
        } else {
            m70400n0(vDraweeView, m70394g0(), relationUser);
        }
        this.f45890h.setText(w8u.m202218u(R$string.f44932v0, Integer.valueOf(i)));
        this.f45891i.setText(mmf0.m155392a(getContext(), w8u.m202217t(R$string.f44926s0)).m155395c(getContext().getResources().getColor(g1c0.f100160o)).m155394b());
        this.f45893k.setText(mqi0.m155932G(j));
    }

    /* JADX INFO: renamed from: k0 */
    public void m70398k0(final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, long j) {
        m70385l0();
        m70399m0();
        xdl0.m208344M(this.f45886d, true);
        xdl0.m208344M(this.f45893k, true);
        this.f45893k.setText(mqi0.m155932G(j));
        this.f45890h.setText(w8u.m202218u(R$string.f44930u0, relationUser.getUserName()));
        this.f45891i.setText(mmf0.m155392a(getContext(), w8u.m202217t(R$string.f44926s0)).m155395c(getContext().getResources().getColor(g1c0.f100160o)).m155394b());
        qib0.f154691G.m102318F(qib0.f154691G.m184724n(relationUser.getUserAvatar()).m8607O(new nvc0(this.f45886d.getAvatarSize(), this.f45886d.getAvatarSize())).m8614a(), new e30() { // from class: l.qop
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155613a.m70392e0((Bitmap) obj);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.rop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160406a.m70393f0(relationUser, view);
            }
        });
        m70388a0(true, relationUser);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m70399m0() {
        if (((jj3) s9s.m182763m(gld0.f103314d)).m141739d()) {
            return;
        }
        xdl0.m208344M(this.f45888f, true);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m70400n0(VDraweeView vDraweeView, VDraweeView vDraweeView2, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
        Property property = View.ALPHA;
        Animator duration = bt0.m103741n(vDraweeView, property, 1.0f, 0.0f).setDuration(500L);
        int i = t100.f167227B;
        Property property2 = View.TRANSLATION_Y;
        Animator duration2 = bt0.m103741n(vDraweeView, property2, 0.0f, -i).setDuration(500L);
        float[] fArr = {0.0f, i};
        Property property3 = View.TRANSLATION_X;
        Animator animatorM103753z = bt0.m103753z(duration, duration2, bt0.m103741n(vDraweeView, property3, fArr).setDuration(500L));
        animatorM103753z.setInterpolator(new DecelerateInterpolator());
        animatorM103753z.addListener(new C12564a(vDraweeView));
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103741n(vDraweeView2, property, 0.0f, 1.0f).setDuration(500L), bt0.m103741n(vDraweeView2, property2, t100.m186890d(35.0f), 0.0f).setDuration(500L), bt0.m103741n(vDraweeView2, property3, -t100.m186890d(35.0f), 0.0f).setDuration(500L));
        animatorM103753z2.setInterpolator(new DecelerateInterpolator());
        animatorM103753z2.addListener(new C12565b(vDraweeView2, relationUser));
        Animator animatorM103753z3 = bt0.m103753z(animatorM103753z2, animatorM103753z);
        this.f45897o = animatorM103753z3;
        animatorM103753z3.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // p149l.cqp
    public void release() {
        oop oopVar = this.f45894l;
        if (oopVar != null) {
            oopVar.m165278e();
        }
        Animator animator = this.f45897o;
        if (animator != null) {
            animator.cancel();
        }
        this.f45886d.m68733e();
    }

    @Override // p149l.cqp
    /* JADX INFO: renamed from: z */
    public void mo70401z(int i) {
        this.f45898p = i;
        m70396i0();
        this.f45894l.m165279f();
    }

    public IntlVoiceActivitiesInChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45895m = new ConcurrentLinkedDeque<>();
    }

    public IntlVoiceActivitiesInChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45895m = new ConcurrentLinkedDeque<>();
    }
}
