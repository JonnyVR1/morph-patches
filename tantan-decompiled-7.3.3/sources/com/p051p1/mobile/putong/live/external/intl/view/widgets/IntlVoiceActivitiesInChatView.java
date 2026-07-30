package com.p051p1.mobile.putong.live.external.intl.view.widgets;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesAct;
import java.util.concurrent.ConcurrentLinkedDeque;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bk3;
import p153l.bnl0;
import p153l.csp;
import p153l.dq1;
import p153l.gt0;
import p153l.h1e0;
import p153l.i4g0;
import p153l.itd0;
import p153l.izs;
import p153l.jyb;
import p153l.m9c0;
import p153l.oqp;
import p153l.pzi0;
import p153l.q3d0;
import p153l.qa00;
import p153l.tbs;
import p153l.uqb0;
import p153l.uqp;
import p153l.vuf0;
import p153l.xau;
import p153l.xec0;
import p153l.xlj;
import p153l.y20;
import p153l.z91;

/* JADX INFO: loaded from: classes9.dex */
public class IntlVoiceActivitiesInChatView extends VLinear implements csp {

    /* JADX INFO: renamed from: c */
    public VDraweeView f46733c;

    /* JADX INFO: renamed from: d */
    public LiveHaloAvatar f46734d;

    /* JADX INFO: renamed from: e */
    public ClipLayout f46735e;

    /* JADX INFO: renamed from: f */
    public VImage f46736f;

    /* JADX INFO: renamed from: g */
    public VLinear f46737g;

    /* JADX INFO: renamed from: h */
    public VText f46738h;

    /* JADX INFO: renamed from: i */
    public VText f46739i;

    /* JADX INFO: renamed from: j */
    public TextView f46740j;

    /* JADX INFO: renamed from: k */
    public TextView f46741k;

    /* JADX INFO: renamed from: l */
    public oqp f46742l;

    /* JADX INFO: renamed from: m */
    public ConcurrentLinkedDeque<VDraweeView> f46743m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f46744n;

    /* JADX INFO: renamed from: o */
    public Animator f46745o;

    /* JADX INFO: renamed from: p */
    public int f46746p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView$a */
    public class C12727a extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f46747a;

        public C12727a(VDraweeView vDraweeView) {
            this.f46747a = vDraweeView;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            VDraweeView vDraweeView = this.f46747a;
            if (vDraweeView != null) {
                IntlVoiceActivitiesInChatView.this.m71578h0(vDraweeView);
                this.f46747a.setAlpha(1.0f);
                IntlVoiceActivitiesInChatView.this.f46743m.add(this.f46747a);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView$b */
    public class C12728b extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f46749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IntlVoiceLiveActivitiesCellBean.RelationUser f46750b;

        public C12728b(VDraweeView vDraweeView, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
            this.f46749a = vDraweeView;
            this.f46750b = relationUser;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m71586b(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
            IntlVoiceActivitiesInChatView.this.m71572b0(relationUser, false);
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlVoiceActivitiesInChatView.this.f46744n = this.f46749a;
            IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView = IntlVoiceActivitiesInChatView.this;
            final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser = this.f46750b;
            bnl0.m105509E0(intlVoiceActivitiesInChatView, new View.OnClickListener() { // from class: l.tqp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f175768a.m71586b(relationUser, view);
                }
            });
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            IntlVoiceActivitiesInChatView.this.f46735e.addView(this.f46749a);
            izs.m142868s("context_common", this.f46749a, this.f46750b.getUserAvatar());
        }
    }

    public IntlVoiceActivitiesInChatView(Act act, dq1 dq1Var) {
        super(act);
        this.f46743m = new ConcurrentLinkedDeque<>();
        View.inflate(act, xec0.f193804N1, this);
        m71569Y(this);
        this.f46742l = new oqp(this, act, dq1Var);
    }

    /* JADX INFO: renamed from: l0 */
    private void m71568l0() {
        bnl0.m105524M(this.f46734d, false);
        bnl0.m105524M(this.f46733c, false);
        bnl0.m105524M(this.f46735e, false);
        bnl0.m105524M(this.f46740j, false);
        bnl0.m105524M(this.f46741k, false);
        bnl0.m105524M(this.f46736f, false);
        this.f46735e.removeAllViews();
        this.f46743m.clear();
        Animator animator = this.f46745o;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m71569Y(View view) {
        uqp.m197376a(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public final VDraweeView m71570Z() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(60.0f), qa00.m175859d(60.0f)));
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(0.0f);
        roundingParamsM8303c.m8322v(true);
        xlj xljVar = new xlj(getContext().getResources());
        xljVar.m211658v(h1e0.f107452i).m211636K(roundingParamsM8303c);
        vDraweeView.setHierarchy(xljVar.m211638a());
        return vDraweeView;
    }

    /* JADX INFO: renamed from: a0 */
    public void m71571a0(boolean z, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
        if (relationUser == null) {
            return;
        }
        i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f46746p)), jyb.m147494Y("liveId", relationUser.getVoiceLiveId()), jyb.m147494Y("anchorId", relationUser.getUserId()), jyb.m147494Y("audio_room_type", relationUser.getLiveMode()), jyb.m147494Y("audio_card_type", z ? "msg_audio_follow_cell" : "msg_audio_multi_follow_cell"));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m71572b0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, boolean z) {
        getContext().startActivity(z91.m219041a(getContext(), AudienceStartData.getBuilder().m68789Q(true).m68777E(relationUser.getVoiceLiveId()).m68784L(relationUser.getVoiceRoomId()).m68794u()));
        ((bk3) tbs.m190077m(itd0.f116822d)).m104792f();
        bnl0.m105524M(this.f46736f, false);
        i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f46746p)), jyb.m147494Y("liveId", relationUser.getVoiceLiveId()), jyb.m147494Y("anchorId", relationUser.getUserId()), jyb.m147494Y("audio_room_type", relationUser.getLiveMode()), jyb.m147494Y("audio_card_type", z ? "msg_audio_follow_cell" : "msg_audio_multi_follow_cell"));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m71573c0(View view) {
        getContext().startActivity(LiveVoiceActivitiesAct.m72159Y1(getContext(), true));
        i4g0.m138523u("e_audio_follow", OMSDialogPositon.p_messages_view, jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("is_show_red_dot", "false"), jyb.m147494Y("tooltips_type_ui", "NA"), jyb.m147494Y("red_dot_num", "NA"), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, "no_audio_available"));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m71574d0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
        m71572b0(relationUser, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m71575e0(Bitmap bitmap) {
        this.f46734d.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m71576f0(IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, View view) {
        m71572b0(relationUser, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final VDraweeView m71577g0() {
        VDraweeView vDraweeViewPoll = this.f46743m.poll();
        if (vDraweeViewPoll == null) {
            vDraweeViewPoll = m71570Z();
        }
        m71578h0(vDraweeViewPoll);
        return vDraweeViewPoll;
    }

    @Override // p153l.csp
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71578h0(VDraweeView vDraweeView) {
        if (vDraweeView.getParent() == null || !(vDraweeView.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) vDraweeView.getParent()).removeView(vDraweeView);
    }

    /* JADX INFO: renamed from: i0 */
    public void m71579i0() {
        m71568l0();
        bnl0.m105524M(this.f46733c, true);
        bnl0.m105524M(this.f46740j, true);
        this.f46738h.setText(R$string.f45782w0);
        this.f46739i.setText(R$string.f45776t0);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.pqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153687a.m71573c0(view);
            }
        });
        i4g0.m138492A("e_audio_follow", OMSDialogPositon.p_messages_view, jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("is_show_red_dot", "false"), jyb.m147494Y("tooltips_type_ui", "NA"), jyb.m147494Y("red_dot_num", "NA"), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, "no_audio_available"));
    }

    /* JADX INFO: renamed from: j0 */
    public void m71580j0(final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, boolean z, int i, long j) {
        VDraweeView vDraweeView;
        int childCount = this.f46735e.getChildCount();
        if (!z || childCount <= 0 || (vDraweeView = this.f46744n) == null) {
            m71568l0();
            m71582m0();
            VDraweeView vDraweeViewM71577g0 = m71577g0();
            bnl0.m105524M(this.f46735e, true);
            bnl0.m105524M(this.f46741k, true);
            izs.m142868s("context_common", vDraweeViewM71577g0, relationUser.getUserAvatar());
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.sqp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170194a.m71574d0(relationUser, view);
                }
            });
            this.f46735e.addView(vDraweeViewM71577g0);
            this.f46744n = vDraweeViewM71577g0;
        } else {
            m71583n0(vDraweeView, m71577g0(), relationUser);
        }
        this.f46738h.setText(xau.m209911u(R$string.f45780v0, Integer.valueOf(i)));
        this.f46739i.setText(vuf0.m202788a(getContext(), xau.m209910t(R$string.f45774s0)).m202791c(getContext().getResources().getColor(m9c0.f135390o)).m202790b());
        this.f46741k.setText(pzi0.m174442G(j));
    }

    /* JADX INFO: renamed from: k0 */
    public void m71581k0(final IntlVoiceLiveActivitiesCellBean.RelationUser relationUser, long j) {
        m71568l0();
        m71582m0();
        bnl0.m105524M(this.f46734d, true);
        bnl0.m105524M(this.f46741k, true);
        this.f46741k.setText(pzi0.m174442G(j));
        this.f46738h.setText(xau.m209911u(R$string.f45778u0, relationUser.getUserName()));
        this.f46739i.setText(vuf0.m202788a(getContext(), xau.m209910t(R$string.f45774s0)).m202791c(getContext().getResources().getColor(m9c0.f135390o)).m202790b());
        uqb0.f180374G.m127102F(uqb0.f180374G.m98797n(relationUser.getUserAvatar()).m8661O(new q3d0(this.f46734d.getAvatarSize(), this.f46734d.getAvatarSize())).m8668a(), new y20() { // from class: l.qqp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159023a.m71575e0((Bitmap) obj);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.rqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164506a.m71576f0(relationUser, view);
            }
        });
        m71571a0(true, relationUser);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m71582m0() {
        if (((bk3) tbs.m190077m(itd0.f116822d)).m104790d()) {
            return;
        }
        bnl0.m105524M(this.f46736f, true);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m71583n0(VDraweeView vDraweeView, VDraweeView vDraweeView2, IntlVoiceLiveActivitiesCellBean.RelationUser relationUser) {
        Property property = View.ALPHA;
        Animator duration = gt0.m132168n(vDraweeView, property, 1.0f, 0.0f).setDuration(500L);
        int i = qa00.f156289B;
        Property property2 = View.TRANSLATION_Y;
        Animator duration2 = gt0.m132168n(vDraweeView, property2, 0.0f, -i).setDuration(500L);
        float[] fArr = {0.0f, i};
        Property property3 = View.TRANSLATION_X;
        Animator animatorM132180z = gt0.m132180z(duration, duration2, gt0.m132168n(vDraweeView, property3, fArr).setDuration(500L));
        animatorM132180z.setInterpolator(new DecelerateInterpolator());
        animatorM132180z.addListener(new C12727a(vDraweeView));
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132168n(vDraweeView2, property, 0.0f, 1.0f).setDuration(500L), gt0.m132168n(vDraweeView2, property2, qa00.m175859d(35.0f), 0.0f).setDuration(500L), gt0.m132168n(vDraweeView2, property3, -qa00.m175859d(35.0f), 0.0f).setDuration(500L));
        animatorM132180z2.setInterpolator(new DecelerateInterpolator());
        animatorM132180z2.addListener(new C12728b(vDraweeView2, relationUser));
        Animator animatorM132180z3 = gt0.m132180z(animatorM132180z2, animatorM132180z);
        this.f46745o = animatorM132180z3;
        animatorM132180z3.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // p153l.csp
    public void release() {
        oqp oqpVar = this.f46742l;
        if (oqpVar != null) {
            oqpVar.m168826e();
        }
        Animator animator = this.f46745o;
        if (animator != null) {
            animator.cancel();
        }
        this.f46734d.m69916e();
    }

    @Override // p153l.csp
    /* JADX INFO: renamed from: z */
    public void mo71584z(int i) {
        this.f46746p = i;
        m71579i0();
        this.f46742l.m168827f();
    }

    public IntlVoiceActivitiesInChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46743m = new ConcurrentLinkedDeque<>();
    }

    public IntlVoiceActivitiesInChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46743m = new ConcurrentLinkedDeque<>();
    }
}
