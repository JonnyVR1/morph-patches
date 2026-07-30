package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.OptiMVParams;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.cex;
import p149l.d30;
import p149l.ll6;
import p149l.o6j0;
import p149l.qp8;
import p149l.roj0;
import p149l.rwu;
import p149l.tzs;
import p149l.upa;
import p149l.v9j;
import p149l.vwb;
import p149l.wf6;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class MatcheItemView extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public MatcheItemView f25252a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f25253b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25254c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f25255d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f25256e;

    /* JADX INFO: renamed from: f */
    public VText f25257f;

    /* JADX INFO: renamed from: g */
    public View f25258g;

    /* JADX INFO: renamed from: h */
    public VText f25259h;

    /* JADX INFO: renamed from: i */
    public View f25260i;

    /* JADX INFO: renamed from: j */
    public GradientBgButton f25261j;

    /* JADX INFO: renamed from: k */
    public VImage f25262k;

    /* JADX INFO: renamed from: l */
    public VText f25263l;

    /* JADX INFO: renamed from: m */
    public Conversation f25264m;

    /* JADX INFO: renamed from: n */
    public User f25265n;

    /* JADX INFO: renamed from: o */
    public int f25266o;

    /* JADX INFO: renamed from: p */
    public C22392a<roj0> f25267p;

    /* JADX INFO: renamed from: q */
    public boolean f25268q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f25269r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f25270s;

    /* JADX INFO: renamed from: t */
    public d30 f25271t;

    /* JADX INFO: renamed from: u */
    public v9j<Boolean> f25272u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$a */
    public class C8136a implements d30 {
        public C8136a() {
        }

        @Override // p149l.d30
        public void call() {
            if (NullChecker.m81303a(MatcheItemView.this.f25269r)) {
                MatcheItemView.this.f25269r.onClick(MatcheItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$b */
    public class C8137b implements v9j<Boolean> {
        public C8137b() {
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.m81303a(MatcheItemView.this.f25270s) ? Boolean.valueOf(MatcheItemView.this.f25270s.onLongClick(MatcheItemView.this)) : Boolean.FALSE;
        }
    }

    public MatcheItemView(Context context) {
        super(context);
        this.f25267p = C22392a.m221513c(roj0.f160388a);
        this.f25268q = false;
        this.f25271t = new C8136a();
        this.f25272u = new C8137b();
    }

    /* JADX INFO: renamed from: d */
    public final void m41675d(View view) {
        cex.m106354a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m41676e() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m41677f(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m41676e().getString(R$string.f18066Qj))) {
            CoreDlg.m45106u1(m41676e(), this.f25264m.otherUser, "message_allmatch");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m41678g() {
        UserLiveLabel userLiveLabel;
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM221515e = CoreModule.f17545c.f19642f0.f19846B2.m221515e();
        if (linkedHashMapM221515e == null || (userLiveLabel = linkedHashMapM221515e.get(this.f25264m.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        o6j0.m162859c("e_live_call_label", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.m81303a(this.f25265n) && NullChecker.m81303a(this.f25264m)) {
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            User user = this.f25265n;
            optiMVParamsNew_.curUserId = user.f56011id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = this.f25264m.createdTime;
            optiMVParamsNew_.newMatchRank = this.f25266o + "";
            Conversation conversation = this.f25264m;
            optiMVParamsNew_.momentsUserId = conversation.f56011id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || this.f25264m.isFakeHeartbeatConv();
            optiMVParamsNew_.isOnline = CoreModule.f17545c.f19588N0.m31966j3(this.f25265n) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = "0";
            optiMVParamsNew_.isOnliveAnchor = (this.f25262k.getVisibility() == 0 || this.f25263l.getVisibility() == 0) ? "1" : "0";
            optiMVParamsNew_.isRedDot = this.f25264m.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            Conversation conversation2 = this.f25264m;
            optiMVParamsNew_.otherUid = conversation2.otherUser;
            optiMVParamsNew_.pairing_type = "unbreak_ice";
            optiMVParamsNew_.redDotNum = String.valueOf(conversation2.unreadMessages);
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.m29935P().m94656g().mo35048b8() && this.f25264m.isPlatinumTop();
            optiMVParamsNew_.messagecCellType = ll6.m150405a(this.f25264m);
            CoreModule.f17545c.f19642f0.f19892R.m143755a(optiMVParamsNew_);
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            c4740g.f19892R.m143760f(c4740g.f19895S, optiMVParamsNew_);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        UserLiveLabel userLiveLabel;
        o6j0.C18854a c18854aM162878h;
        o6j0.C18854a c18854aM162878h2;
        o6j0.C18854a c18854a;
        o6j0.C18854a c18854aM162878h3;
        m41678g();
        boolean z2 = true;
        if (qp8.m175817b() && CoreModule.f17545c.f19642f0.m33157vg(true).contains(this.f25264m.f56011id) && (userLiveLabel = CoreModule.f17545c.f19642f0.m33207zg(true).get(this.f25264m.f56011id)) != null) {
            int iIndexOf = CoreModule.f17545c.f19642f0.m32929dg(true).indexOf(this.f25264m);
            String str = "e_live_room_enter";
            if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
                o6j0.C18854a c18854aM162878h4 = o6j0.C18854a.m162878h("profile_user_id", userLiveLabel.userId);
                c18854aM162878h = o6j0.C18854a.m162878h("topic_id", userLiveLabel.voiceRoomTopicId);
                c18854aM162878h2 = o6j0.C18854a.m162878h("audio_card_type", "message_new_match");
                c18854a = c18854aM162878h4;
                c18854aM162878h3 = o6j0.C18854a.m162878h("audio_room_type", "normal_audio");
                str = "e_live_audio_room_enter";
            } else {
                c18854a = null;
                c18854aM162878h = null;
                c18854aM162878h2 = null;
                c18854aM162878h3 = null;
            }
            o6j0.C18854a c18854aM162878h5 = o6j0.C18854a.m162878h("anchorId", userLiveLabel.anchorId);
            if (iIndexOf != -1) {
                iIndexOf++;
            }
            o6j0.m162859c(str, OMSDialogPositon.p_messages_view, c18854aM162878h5, o6j0.C18854a.m162876f(FirebaseAnalytics.Param.INDEX, iIndexOf), o6j0.C18854a.m162878h("liveId", userLiveLabel.liveId), o6j0.C18854a.m162878h("liveRecommendCategory", "NA"), o6j0.C18854a.m162878h("module", "match_photo"), o6j0.C18854a.m162878h("right_recommend_type", "NA"), o6j0.C18854a.m162878h("show_label", userLiveLabel.iconTitle), o6j0.C18854a.m162878h("trace_id", ""), o6j0.C18854a.m162878h("live_status", "on"), o6j0.C18854a.m162878h("window_type", "null"), c18854a, c18854aM162878h, c18854aM162878h2, c18854aM162878h3);
            if (!this.f25264m.read.booleanValue()) {
                CoreModule.f17545c.f19642f0.m32598Bo(this.f25264m.f56011id);
            }
            tzs.m191214a(m41676e(), userLiveLabel);
            return;
        }
        m41676e().startActivity(MessagesAct.m48943i2(m41676e(), this.f25264m.otherUser, false, false));
        if (NullChecker.m81303a(this.f25264m) && TextUtils.equals(this.f25264m.otherUser, rwu.m181459h())) {
            o6j0.m162859c("e_live_vip_customer_service", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
        if (!upa.m194780l2() || TextUtils.isEmpty(this.f25264m.localNotifyMomentId)) {
            z = false;
        } else {
            Conversation conversation = this.f25264m;
            if (TextUtils.equals(conversation.localNotifyMomentId, conversation.localInsertedMomentId)) {
                z = false;
            } else {
                z = true;
            }
        }
        o6j0.C18854a c18854aM162878h6 = o6j0.C18854a.m162878h("create_time", zz6.f205780h.format(this.f25264m.createdTime));
        o6j0.C18854a c18854aM162878h7 = o6j0.C18854a.m162878h("is_online", CoreModule.f17545c.f19588N0.m31966j3(this.f25265n) ? "1" : "0");
        o6j0.C18854a c18854aM162878h8 = o6j0.C18854a.m162878h("new_match_rank", "" + this.f25266o);
        o6j0.C18854a c18854aM162878h9 = o6j0.C18854a.m162878h("moments_user_id", this.f25264m.otherUser);
        o6j0.C18854a c18854aM162878h10 = o6j0.C18854a.m162878h("operation_id", "");
        o6j0.C18854a c18854aM162878h11 = o6j0.C18854a.m162878h("is_new_moment", z ? "1" : "0");
        Conversation conversation2 = this.f25264m;
        if (conversation2 == null || (!conversation2.isFakeHeartbeatConv() && !this.f25264m.isFakeQuickChatConv())) {
            z2 = false;
        }
        o6j0.m162859c("e_messages_view_match", OMSDialogPositon.p_messages_view, c18854aM162878h6, c18854aM162878h7, c18854aM162878h8, c18854aM162878h9, c18854aM162878h10, c18854aM162878h11, o6j0.C18854a.m162879i("is_fake", z2), o6j0.C18854a.m162878h("is_onlive_anchor", (this.f25262k.getVisibility() == 0 || this.f25263l.getVisibility() == 0) ? "1" : "0"), o6j0.C18854a.m162878h("is_red_dot", this.f25264m.read.booleanValue() ? "0" : "1"), o6j0.C18854a.m162878h("new_msg_page_module", "0"), o6j0.C18854a.m162878h("other_uid", this.f25264m.otherUser), o6j0.C18854a.m162876f("red_dot_num", this.f25264m.unreadMessages), o6j0.C18854a.m162878h("is_platinum_top_chat", (CoreModule.m29935P().m94656g().mo35048b8() && this.f25264m.isPlatinumTop()) ? "yes" : "no"), o6j0.C18854a.m162878h("messagec_cell_type", ll6.m150405a(this.f25264m)), o6j0.C18854a.m162876f("spark_level", ll6.m150409e(this.f25264m)), o6j0.C18854a.m162876f("message_pairs", ll6.m150408d(this.f25264m)), o6j0.C18854a.m162876f("is_close_friend", ll6.m150406b(this.f25264m)), o6j0.C18854a.m162876f("is_top_recommend", ll6.m150407c(this.f25264m)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f25265n)) {
            CoreModule.f17545c.f19642f0.f19892R.m143758d(this.f25265n.f56011id);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41675d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.m81303a(this.f25264m)) {
            return false;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f25264m.otherUser);
        if (!NullChecker.m81303a(userM169430Pa) || User.isTeamAccount(userM169430Pa.f56011id)) {
            return false;
        }
        ArrayList arrayListM200324f0 = vwb.m200324f0(m41676e().getString(R$string.f18066Qj));
        m41676e().dialog().m20536f0((CharSequence[]) arrayListM200324f0.toArray(new CharSequence[arrayListM200324f0.size()])).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.bex
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f75255a.m41677f(dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (wf6.m202950e()) {
            this.f25269r = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (wf6.m202950e()) {
            this.f25270s = onLongClickListener;
        } else {
            super.setOnLongClickListener(onLongClickListener);
        }
    }

    public MatcheItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25267p = C22392a.m221513c(roj0.f160388a);
        this.f25268q = false;
        this.f25271t = new C8136a();
        this.f25272u = new C8137b();
    }

    public MatcheItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25267p = C22392a.m221513c(roj0.f160388a);
        this.f25268q = false;
        this.f25271t = new C8136a();
        this.f25272u = new C8137b();
    }
}
