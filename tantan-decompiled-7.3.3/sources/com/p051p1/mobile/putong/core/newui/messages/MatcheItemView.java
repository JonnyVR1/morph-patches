package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.OptiMVParams;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bhx;
import p153l.c17;
import p153l.gra;
import p153l.jyb;
import p153l.om6;
import p153l.pcj;
import p153l.sfj0;
import p153l.syu;
import p153l.u1t;
import p153l.uxj0;
import p153l.vq8;
import p153l.x20;
import p153l.zg6;

/* JADX INFO: loaded from: classes11.dex */
public class MatcheItemView extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public MatcheItemView f25994a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f25995b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25996c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f25997d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f25998e;

    /* JADX INFO: renamed from: f */
    public VText f25999f;

    /* JADX INFO: renamed from: g */
    public View f26000g;

    /* JADX INFO: renamed from: h */
    public VText f26001h;

    /* JADX INFO: renamed from: i */
    public View f26002i;

    /* JADX INFO: renamed from: j */
    public GradientBgButton f26003j;

    /* JADX INFO: renamed from: k */
    public VImage f26004k;

    /* JADX INFO: renamed from: l */
    public VText f26005l;

    /* JADX INFO: renamed from: m */
    public Conversation f26006m;

    /* JADX INFO: renamed from: n */
    public User f26007n;

    /* JADX INFO: renamed from: o */
    public int f26008o;

    /* JADX INFO: renamed from: p */
    public C22507a<uxj0> f26009p;

    /* JADX INFO: renamed from: q */
    public boolean f26010q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f26011r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f26012s;

    /* JADX INFO: renamed from: t */
    public x20 f26013t;

    /* JADX INFO: renamed from: u */
    public pcj<Boolean> f26014u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$a */
    public class C8287a implements x20 {
        public C8287a() {
        }

        @Override // p153l.x20
        public void call() {
            if (NullChecker.m82486a(MatcheItemView.this.f26011r)) {
                MatcheItemView.this.f26011r.onClick(MatcheItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$b */
    public class C8288b implements pcj<Boolean> {
        public C8288b() {
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.m82486a(MatcheItemView.this.f26012s) ? Boolean.valueOf(MatcheItemView.this.f26012s.onLongClick(MatcheItemView.this)) : Boolean.FALSE;
        }
    }

    public MatcheItemView(Context context) {
        super(context);
        this.f26009p = C22507a.m222759c(uxj0.f181467a);
        this.f26010q = false;
        this.f26013t = new C8287a();
        this.f26014u = new C8288b();
    }

    /* JADX INFO: renamed from: d */
    public final void m42686d(View view) {
        bhx.m104378a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m42687e() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m42688f(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m42687e().getString(R$string.f19466mk))) {
            CoreDlg.m46289u1(m42687e(), this.f26006m.otherUser, "message_allmatch");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m42689g() {
        UserLiveLabel userLiveLabel;
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM222761e = CoreModule.f18264c.f20384f0.f20588B2.m222761e();
        if (linkedHashMapM222761e == null || (userLiveLabel = linkedHashMapM222761e.get(this.f26006m.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        sfj0.m185596c("e_live_call_label", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.m82486a(this.f26007n) && NullChecker.m82486a(this.f26006m)) {
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            User user = this.f26007n;
            optiMVParamsNew_.curUserId = user.f56859id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = this.f26006m.createdTime;
            optiMVParamsNew_.newMatchRank = this.f26008o + "";
            Conversation conversation = this.f26006m;
            optiMVParamsNew_.momentsUserId = conversation.f56859id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || this.f26006m.isFakeHeartbeatConv();
            optiMVParamsNew_.isOnline = CoreModule.f18264c.f20330N0.m32969j3(this.f26007n) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = "0";
            optiMVParamsNew_.isOnliveAnchor = (this.f26004k.getVisibility() == 0 || this.f26005l.getVisibility() == 0) ? "1" : "0";
            optiMVParamsNew_.isRedDot = this.f26006m.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            Conversation conversation2 = this.f26006m;
            optiMVParamsNew_.otherUid = conversation2.otherUser;
            optiMVParamsNew_.pairing_type = "unbreak_ice";
            optiMVParamsNew_.redDotNum = String.valueOf(conversation2.unreadMessages);
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.m30933P().m143410g().mo36051b8() && this.f26006m.isPlatinumTop();
            optiMVParamsNew_.messagecCellType = om6.m168195a(this.f26006m);
            CoreModule.f18264c.f20384f0.f20634R.m170612a(optiMVParamsNew_);
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            c4891g.f20634R.m170617f(c4891g.f20637S, optiMVParamsNew_);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        UserLiveLabel userLiveLabel;
        sfj0.C20032a c20032aM185615h;
        sfj0.C20032a c20032aM185615h2;
        sfj0.C20032a c20032a;
        sfj0.C20032a c20032aM185615h3;
        m42689g();
        boolean z2 = true;
        if (vq8.m202358b() && CoreModule.f18264c.f20384f0.m34160vg(true).contains(this.f26006m.f56859id) && (userLiveLabel = CoreModule.f18264c.f20384f0.m34210zg(true).get(this.f26006m.f56859id)) != null) {
            int iIndexOf = CoreModule.f18264c.f20384f0.m33932dg(true).indexOf(this.f26006m);
            String str = "e_live_room_enter";
            if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
                sfj0.C20032a c20032aM185615h4 = sfj0.C20032a.m185615h("profile_user_id", userLiveLabel.userId);
                c20032aM185615h = sfj0.C20032a.m185615h("topic_id", userLiveLabel.voiceRoomTopicId);
                c20032aM185615h2 = sfj0.C20032a.m185615h("audio_card_type", "message_new_match");
                c20032a = c20032aM185615h4;
                c20032aM185615h3 = sfj0.C20032a.m185615h("audio_room_type", "normal_audio");
                str = "e_live_audio_room_enter";
            } else {
                c20032a = null;
                c20032aM185615h = null;
                c20032aM185615h2 = null;
                c20032aM185615h3 = null;
            }
            sfj0.C20032a c20032aM185615h5 = sfj0.C20032a.m185615h("anchorId", userLiveLabel.anchorId);
            if (iIndexOf != -1) {
                iIndexOf++;
            }
            sfj0.m185596c(str, OMSDialogPositon.p_messages_view, c20032aM185615h5, sfj0.C20032a.m185613f(FirebaseAnalytics.Param.INDEX, iIndexOf), sfj0.C20032a.m185615h("liveId", userLiveLabel.liveId), sfj0.C20032a.m185615h("liveRecommendCategory", "NA"), sfj0.C20032a.m185615h("module", "match_photo"), sfj0.C20032a.m185615h("right_recommend_type", "NA"), sfj0.C20032a.m185615h("show_label", userLiveLabel.iconTitle), sfj0.C20032a.m185615h("trace_id", ""), sfj0.C20032a.m185615h("live_status", "on"), sfj0.C20032a.m185615h("window_type", "null"), c20032a, c20032aM185615h, c20032aM185615h2, c20032aM185615h3);
            if (!this.f26006m.read.booleanValue()) {
                CoreModule.f18264c.f20384f0.m33601Bo(this.f26006m.f56859id);
            }
            u1t.m194113a(m42687e(), userLiveLabel);
            return;
        }
        m42687e().startActivity(MessagesAct.m50126k2(m42687e(), this.f26006m.otherUser, false, false));
        if (NullChecker.m82486a(this.f26006m) && TextUtils.equals(this.f26006m.otherUser, syu.m188587h())) {
            sfj0.m185596c("e_live_vip_customer_service", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
        if (!gra.m131711l2() || TextUtils.isEmpty(this.f26006m.localNotifyMomentId)) {
            z = false;
        } else {
            Conversation conversation = this.f26006m;
            if (TextUtils.equals(conversation.localNotifyMomentId, conversation.localInsertedMomentId)) {
                z = false;
            } else {
                z = true;
            }
        }
        sfj0.C20032a c20032aM185615h6 = sfj0.C20032a.m185615h("create_time", c17.f79338h.format(this.f26006m.createdTime));
        sfj0.C20032a c20032aM185615h7 = sfj0.C20032a.m185615h("is_online", CoreModule.f18264c.f20330N0.m32969j3(this.f26007n) ? "1" : "0");
        sfj0.C20032a c20032aM185615h8 = sfj0.C20032a.m185615h("new_match_rank", "" + this.f26008o);
        sfj0.C20032a c20032aM185615h9 = sfj0.C20032a.m185615h("moments_user_id", this.f26006m.otherUser);
        sfj0.C20032a c20032aM185615h10 = sfj0.C20032a.m185615h("operation_id", "");
        sfj0.C20032a c20032aM185615h11 = sfj0.C20032a.m185615h("is_new_moment", z ? "1" : "0");
        Conversation conversation2 = this.f26006m;
        if (conversation2 == null || (!conversation2.isFakeHeartbeatConv() && !this.f26006m.isFakeQuickChatConv())) {
            z2 = false;
        }
        sfj0.m185596c("e_messages_view_match", OMSDialogPositon.p_messages_view, c20032aM185615h6, c20032aM185615h7, c20032aM185615h8, c20032aM185615h9, c20032aM185615h10, c20032aM185615h11, sfj0.C20032a.m185616i("is_fake", z2), sfj0.C20032a.m185615h("is_onlive_anchor", (this.f26004k.getVisibility() == 0 || this.f26005l.getVisibility() == 0) ? "1" : "0"), sfj0.C20032a.m185615h("is_red_dot", this.f26006m.read.booleanValue() ? "0" : "1"), sfj0.C20032a.m185615h("new_msg_page_module", "0"), sfj0.C20032a.m185615h("other_uid", this.f26006m.otherUser), sfj0.C20032a.m185613f("red_dot_num", this.f26006m.unreadMessages), sfj0.C20032a.m185615h("is_platinum_top_chat", (CoreModule.m30933P().m143410g().mo36051b8() && this.f26006m.isPlatinumTop()) ? "yes" : "no"), sfj0.C20032a.m185615h("messagec_cell_type", om6.m168195a(this.f26006m)), sfj0.C20032a.m185613f("spark_level", om6.m168199e(this.f26006m)), sfj0.C20032a.m185613f("message_pairs", om6.m168198d(this.f26006m)), sfj0.C20032a.m185613f("is_close_friend", om6.m168196b(this.f26006m)), sfj0.C20032a.m185613f("is_top_recommend", om6.m168197c(this.f26006m)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f26007n)) {
            CoreModule.f18264c.f20384f0.f20634R.m170615d(this.f26007n.f56859id);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42686d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.m82486a(this.f26006m)) {
            return false;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f26006m.otherUser);
        if (!NullChecker.m82486a(userM116503Pa) || User.isTeamAccount(userM116503Pa.f56859id)) {
            return false;
        }
        ArrayList arrayListM147507f0 = jyb.m147507f0(m42687e().getString(R$string.f19466mk));
        m42687e().dialog().m21535f0((CharSequence[]) arrayListM147507f0.toArray(new CharSequence[arrayListM147507f0.size()])).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ahx
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f71436a.m42688f(dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (zg6.m219594e()) {
            this.f26011r = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (zg6.m219594e()) {
            this.f26012s = onLongClickListener;
        } else {
            super.setOnLongClickListener(onLongClickListener);
        }
    }

    public MatcheItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26009p = C22507a.m222759c(uxj0.f181467a);
        this.f26010q = false;
        this.f26013t = new C8287a();
        this.f26014u = new C8288b();
    }

    public MatcheItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26009p = C22507a.m222759c(uxj0.f181467a);
        this.f26010q = false;
        this.f26013t = new C8287a();
        this.f26014u = new C8288b();
    }
}
