package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.OptiMVParams;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import l.cex;
import l.d30;
import l.o6j0;
import l.qp8;
import l.roj0;
import l.upa;
import l.v9j;
import l.vwb;
import l.zz6;
import p009l.ll6;
import p009l.rwu;
import p009l.tzs;
import p009l.wf6;
import rx.subjects.a;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MatcheItemView extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public MatcheItemView f4030a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f4031b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f4032c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4033d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f4034e;

    /* JADX INFO: renamed from: f */
    public VText f4035f;

    /* JADX INFO: renamed from: g */
    public View f4036g;

    /* JADX INFO: renamed from: h */
    public VText f4037h;

    /* JADX INFO: renamed from: i */
    public View f4038i;

    /* JADX INFO: renamed from: j */
    public GradientBgButton f4039j;

    /* JADX INFO: renamed from: k */
    public VImage f4040k;

    /* JADX INFO: renamed from: l */
    public VText f4041l;

    /* JADX INFO: renamed from: m */
    public Conversation f4042m;

    /* JADX INFO: renamed from: n */
    public User f4043n;

    /* JADX INFO: renamed from: o */
    public int f4044o;

    /* JADX INFO: renamed from: p */
    public a<roj0> f4045p;

    /* JADX INFO: renamed from: q */
    public boolean f4046q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f4047r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f4048s;

    /* JADX INFO: renamed from: t */
    public d30 f4049t;

    /* JADX INFO: renamed from: u */
    public v9j<Boolean> f4050u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$a */
    public class C0300a implements d30 {
        public C0300a() {
        }

        public void call() {
            if (NullChecker.a(MatcheItemView.this.f4047r)) {
                MatcheItemView.this.f4047r.onClick(MatcheItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.MatcheItemView$b */
    public class C0301b implements v9j<Boolean> {
        public C0301b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.a(MatcheItemView.this.f4048s) ? Boolean.valueOf(MatcheItemView.this.f4048s.onLongClick(MatcheItemView.this)) : Boolean.FALSE;
        }
    }

    public MatcheItemView(Context context) {
        super(context);
        this.f4045p = a.c(roj0.a);
        this.f4046q = false;
        this.f4049t = new C0300a();
        this.f4050u = new C0301b();
    }

    /* JADX INFO: renamed from: d */
    public final void m5799d(View view) {
        cex.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public PutongAct m5800e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m5801f(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m5800e().getString(R.string.Qj))) {
            CoreDlg.u1(m5800e(), this.f4042m.otherUser, "message_allmatch");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5802g() {
        UserLiveLabel userLiveLabel;
        HashMap map = (HashMap) CoreModule.c.f0.B2.e();
        if (map == null || (userLiveLabel = (UserLiveLabel) map.get(this.f4042m.otherUser)) == null || !userLiveLabel.ongoingCall) {
            return;
        }
        o6j0.c("e_live_call_label", "p_messages_view", new o6j0.a[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.a(this.f4043n) && NullChecker.a(this.f4042m)) {
            OptiMVParams optiMVParamsNew_ = OptiMVParams.new_();
            User user = this.f4043n;
            optiMVParamsNew_.curUserId = ((DbObject) user).id;
            optiMVParamsNew_.name = user.name;
            optiMVParamsNew_.createTime = this.f4042m.createdTime;
            optiMVParamsNew_.newMatchRank = this.f4044o + "";
            Conversation conversation = this.f4042m;
            optiMVParamsNew_.momentsUserId = ((DbObject) conversation).id;
            optiMVParamsNew_.is_fake = conversation.isFakeHeartbeatConv() || this.f4042m.isFakeHeartbeatConv();
            optiMVParamsNew_.isOnline = CoreModule.c.N0.j3(this.f4043n) ? "1" : "0";
            optiMVParamsNew_.newMsgPageModule = "0";
            optiMVParamsNew_.isOnliveAnchor = (this.f4040k.getVisibility() == 0 || this.f4041l.getVisibility() == 0) ? "1" : "0";
            optiMVParamsNew_.isRedDot = this.f4042m.read.booleanValue() ? "0" : "1";
            optiMVParamsNew_.isNewMoment = "0";
            Conversation conversation2 = this.f4042m;
            optiMVParamsNew_.otherUid = conversation2.otherUser;
            optiMVParamsNew_.pairing_type = "unbreak_ice";
            optiMVParamsNew_.redDotNum = String.valueOf(conversation2.unreadMessages);
            optiMVParamsNew_.is_platinum_top_chat = CoreModule.P().g().b8() && this.f4042m.isPlatinumTop();
            optiMVParamsNew_.messagecCellType = ll6.m17954a(this.f4042m);
            CoreModule.c.f0.R.m17231a(optiMVParamsNew_);
            g gVar = CoreModule.c.f0;
            gVar.R.m17236f(gVar.S, optiMVParamsNew_);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        UserLiveLabel userLiveLabel;
        o6j0.a aVarH;
        o6j0.a aVarH2;
        o6j0.a aVar;
        o6j0.a aVarH3;
        m5802g();
        boolean z2 = true;
        if (qp8.b() && CoreModule.c.f0.vg(true).contains(((DbObject) this.f4042m).id) && (userLiveLabel = (UserLiveLabel) CoreModule.c.f0.zg(true).get(((DbObject) this.f4042m).id)) != null) {
            int iIndexOf = CoreModule.c.f0.dg(true).indexOf(this.f4042m);
            String str = "e_live_room_enter";
            if (!"onLive".equals(userLiveLabel.liveState) && "onVoice".equals(userLiveLabel.liveState)) {
                o6j0.a aVarH4 = o6j0.a.h("profile_user_id", userLiveLabel.userId);
                aVarH = o6j0.a.h("topic_id", userLiveLabel.voiceRoomTopicId);
                aVarH2 = o6j0.a.h("audio_card_type", "message_new_match");
                aVar = aVarH4;
                aVarH3 = o6j0.a.h("audio_room_type", "normal_audio");
                str = "e_live_audio_room_enter";
            } else {
                aVar = null;
                aVarH = null;
                aVarH2 = null;
                aVarH3 = null;
            }
            o6j0.a aVarH5 = o6j0.a.h("anchorId", userLiveLabel.anchorId);
            if (iIndexOf != -1) {
                iIndexOf++;
            }
            o6j0.c(str, "p_messages_view", new o6j0.a[]{aVarH5, o6j0.a.f("index", iIndexOf), o6j0.a.h("liveId", userLiveLabel.liveId), o6j0.a.h("liveRecommendCategory", "NA"), o6j0.a.h("module", "match_photo"), o6j0.a.h("right_recommend_type", "NA"), o6j0.a.h("show_label", userLiveLabel.iconTitle), o6j0.a.h("trace_id", ""), o6j0.a.h("live_status", "on"), o6j0.a.h("window_type", "null"), aVar, aVarH, aVarH2, aVarH3});
            if (!this.f4042m.read.booleanValue()) {
                CoreModule.c.f0.Bo(((DbObject) this.f4042m).id);
            }
            tzs.m22714a(m5800e(), userLiveLabel);
            return;
        }
        m5800e().startActivity(MessagesAct.i2(m5800e(), this.f4042m.otherUser, false, false));
        if (NullChecker.a(this.f4042m) && TextUtils.equals(this.f4042m.otherUser, rwu.m21862h())) {
            o6j0.c("e_live_vip_customer_service", "p_messages_view", new o6j0.a[0]);
        }
        if (!upa.l2() || TextUtils.isEmpty(this.f4042m.localNotifyMomentId)) {
            z = false;
        } else {
            Conversation conversation = this.f4042m;
            if (TextUtils.equals(conversation.localNotifyMomentId, conversation.localInsertedMomentId)) {
                z = false;
            } else {
                z = true;
            }
        }
        o6j0.a aVarH6 = o6j0.a.h("create_time", zz6.h.format(this.f4042m.createdTime));
        o6j0.a aVarH7 = o6j0.a.h("is_online", CoreModule.c.N0.j3(this.f4043n) ? "1" : "0");
        o6j0.a aVarH8 = o6j0.a.h("new_match_rank", "" + this.f4044o);
        o6j0.a aVarH9 = o6j0.a.h("moments_user_id", this.f4042m.otherUser);
        o6j0.a aVarH10 = o6j0.a.h("operation_id", "");
        o6j0.a aVarH11 = o6j0.a.h("is_new_moment", z ? "1" : "0");
        Conversation conversation2 = this.f4042m;
        if (conversation2 == null || (!conversation2.isFakeHeartbeatConv() && !this.f4042m.isFakeQuickChatConv())) {
            z2 = false;
        }
        o6j0.c("e_messages_view_match", "p_messages_view", new o6j0.a[]{aVarH6, aVarH7, aVarH8, aVarH9, aVarH10, aVarH11, o6j0.a.i("is_fake", z2), o6j0.a.h("is_onlive_anchor", (this.f4040k.getVisibility() == 0 || this.f4041l.getVisibility() == 0) ? "1" : "0"), o6j0.a.h("is_red_dot", this.f4042m.read.booleanValue() ? "0" : "1"), o6j0.a.h("new_msg_page_module", "0"), o6j0.a.h("other_uid", this.f4042m.otherUser), o6j0.a.f("red_dot_num", this.f4042m.unreadMessages), o6j0.a.h("is_platinum_top_chat", (CoreModule.P().g().b8() && this.f4042m.isPlatinumTop()) ? "yes" : "no"), o6j0.a.h("messagec_cell_type", ll6.m17954a(this.f4042m)), o6j0.a.f("spark_level", ll6.m17958e(this.f4042m)), o6j0.a.f("message_pairs", ll6.m17957d(this.f4042m)), o6j0.a.f("is_close_friend", ll6.m17955b(this.f4042m)), o6j0.a.f("is_top_recommend", ll6.m17956c(this.f4042m))});
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f4043n)) {
            CoreModule.c.f0.R.m17234d(((DbObject) this.f4043n).id);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5799d(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!NullChecker.a(this.f4042m)) {
            return false;
        }
        User userPa = CoreModule.c.e0.Pa(this.f4042m.otherUser);
        if (!NullChecker.a(userPa) || User.isTeamAccount(((DbObject) userPa).id)) {
            return false;
        }
        ArrayList arrayListF0 = vwb.f0(new CharSequence[]{m5800e().getString(R.string.Qj)});
        m5800e().dialog().f0((CharSequence[]) arrayListF0.toArray(new CharSequence[arrayListF0.size()])).g0(new Dialog.g() { // from class: l.bex
            /* JADX INFO: renamed from: a */
            public final void m11984a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f10044a.m5801f(dialog, view2, i, charSequence);
            }
        }).z0();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (wf6.m24193e()) {
            this.f4047r = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (wf6.m24193e()) {
            this.f4048s = onLongClickListener;
        } else {
            super.setOnLongClickListener(onLongClickListener);
        }
    }

    public MatcheItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4045p = a.c(roj0.a);
        this.f4046q = false;
        this.f4049t = new C0300a();
        this.f4050u = new C0301b();
    }

    public MatcheItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4045p = a.c(roj0.a);
        this.f4046q = false;
        this.f4049t = new C0300a();
        this.f4050u = new C0301b();
    }
}
