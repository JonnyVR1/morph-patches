package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VListCell;
import p149l.bkn0;
import p149l.c40;
import p149l.e30;
import p149l.eqh0;
import p149l.f6c0;
import p149l.j2e0;
import p149l.j760;
import p149l.lz4;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.o7r;
import p149l.qib0;
import p149l.roj0;
import p149l.sw6;
import p149l.u4c0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseConversationRecommendItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public User f24614a;

    /* JADX INFO: renamed from: b */
    public Conversation f24615b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f24616c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$a */
    public static class ViewOnLongClickListenerC8104a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final User f24617a;

        /* JADX INFO: renamed from: b */
        public final Context f24618b;

        /* JADX INFO: renamed from: c */
        public final j760<Integer, Boolean> f24619c;

        /* JADX INFO: renamed from: d */
        public final Conversation f24620d;

        /* JADX INFO: renamed from: e */
        public final ConversationHeadRecommendLayout.C8114b f24621e;

        public ViewOnLongClickListenerC8104a(ConversationHeadRecommendLayout.C8114b c8114b, Context context, j760<Integer, Boolean> j760Var, Conversation conversation, User user) {
            this.f24617a = user;
            this.f24618b = context;
            this.f24619c = j760Var;
            this.f24620d = conversation;
            this.f24621e = c8114b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m40583a(Throwable th) {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m40587e(roj0 roj0Var) {
            this.f24621e.m40787O(this.f24617a.f56011id, false);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m40588f(String str, String str2, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
            String string = c22545a.f209159a.toString();
            if (TextUtils.equals(string, str)) {
                ConversationHeadRecommendLayout.C8114b c8114b = this.f24621e;
                c8114b.mo67374c(c8114b.m40783K(), CoreModule.f17545c.f19642f0.m33075op(this.f24617a.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.pi2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f149070a.m40587e((roj0) obj);
                    }
                }, new e30() { // from class: l.qi2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        BaseConversationRecommendItemView.ViewOnLongClickListenerC8104a.m40583a((Throwable) obj);
                    }
                }));
                zvf0.m220396r("e_hide_chat_rec", OMSDialogPositon.p_messages_view);
            } else if (TextUtils.equals(string, str2)) {
                if (NullChecker.m81303a(this.f24620d) && this.f24620d.isAnonymous()) {
                    CoreModule.m29932K().mo30691Hp((Act) this.f24618b, this.f24617a.f56011id);
                } else {
                    boolean zM81303a = NullChecker.m81303a(this.f24620d);
                    Context context = this.f24618b;
                    if (zM81303a) {
                        context.startActivity(ProfileAct.m50736n2(context, this.f24617a.f56011id, "conversation_view", false));
                    } else {
                        context.startActivity(ProfileAct.m50736n2(context, this.f24617a.f56011id, "from_recommend_like", false));
                    }
                }
                zvf0.m220396r("e_check_profile", OMSDialogPositon.p_messages_view);
            }
            c40VarArr[0].m105113b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VLinear vLinear;
            if (this.f24617a == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            final String string = this.f24618b.getString(R$string.f18364ah);
            final String string2 = this.f24618b.getString(R$string.f17823Ig);
            arrayList.add(string);
            arrayList.add(string2);
            c40.C16057b c16057b = new c40.C16057b(this.f24618b);
            c16057b.m105156I(this.f24618b.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.ni2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c40VarArr[0].m105113b();
                }
            }).m105164Q(arrayList).m105163P(eqh0.m117752c(3)).m105169V(new c40.InterfaceC16059d() { // from class: l.oi2
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    this.f144083a.m40588f(string, string2, c40VarArr, vListCell, c22545a, i);
                }
            });
            c40 c40VarM105153F = c16057b.m105153F();
            final c40[] c40VarArr = {c40VarM105153F};
            c40VarM105153F.m105117f();
            View viewM105114c = c40VarArr[0].m105114c();
            if (viewM105114c == null || (vLinear = (VLinear) viewM105114c.findViewById(u4c0.f174174b5)) == null) {
                return true;
            }
            vLinear.removeAllViews();
            xdl0.m208344M(vLinear, true);
            o7r.m163037a(this.f24618b).inflate(f6c0.f95406Ib, (ViewGroup) vLinear, true);
            vLinear.setPadding(0, 0, 0, 0);
            VDraweeView vDraweeView = (VDraweeView) vLinear.findViewById(u4c0.f173909L5);
            if (NullChecker.m81303a(this.f24620d) && this.f24620d.isAnonymous()) {
                qib0.f154691G.m102331L0(vDraweeView, this.f24617a.getAnonymousUrl());
            } else {
                qib0.f154691G.m102341Q0(vDraweeView, BaseConversationRecommendItemView.m40571B(this.f24617a));
            }
            if (this.f24617a.isBannedNew() || this.f24617a.isAccountCancellation()) {
                qib0.f154691G.m102354Y0(vDraweeView, x2c0.f190189h0);
            }
            zvf0.m220402x("e_hide_chat_rec", OMSDialogPositon.p_messages_view);
            zvf0.m220402x("e_check_profile", OMSDialogPositon.p_messages_view);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$b */
    public class ViewOnClickListenerC8105b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f24622a;

        /* JADX INFO: renamed from: b */
        public final ConversationHeadRecommendLayout.C8114b f24623b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C8115c f24624c;

        public ViewOnClickListenerC8105b(Conversation conversation, ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c) {
            this.f24622a = conversation;
            this.f24623b = c8114b;
            this.f24624c = c8115c;
        }

        /* JADX INFO: renamed from: a */
        public final void m40589a(View view) {
            if (NullChecker.m81303a(BaseConversationRecommendItemView.this.f24614a)) {
                o6j0.m162859c("e_current_online_photo", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("moments_user_id", BaseConversationRecommendItemView.this.f24614a.f56011id), o6j0.C18854a.m162876f("profile_photo_number", BaseConversationRecommendItemView.this.m40581w(this.f24623b, this.f24624c)), o6j0.C18854a.m162878h("chat_recommend_reason", BaseConversationRecommendItemView.this.mo40579u(this.f24624c)), o6j0.C18854a.m162878h("recommend_photo_distance", BaseConversationRecommendItemView.this.f24614a.location.distance + ""), o6j0.C18854a.m162876f("is_close_friend", this.f24624c.f24795v), o6j0.C18854a.m162878h("is_female_new_recommend", this.f24624c.f24774a == 21 ? "1" : "0"), o6j0.C18854a.m162878h("user_active_time", mqi0.m155932G(BaseConversationRecommendItemView.this.f24614a.location.updatedTime)));
            }
            ConversationHeadRecommendLayout.C8115c c8115c = this.f24624c;
            if (c8115c.f24774a == 21) {
                BaseConversationRecommendItemView.this.m40577p().startActivity(OOFMkWebViewAct.m41782m2(BaseConversationRecommendItemView.this.getContext()));
                return;
            }
            if (!TextUtils.isEmpty(c8115c.f24773C)) {
                j2e0.m139446m(BaseConversationRecommendItemView.this.m40577p(), Uri.parse(this.f24624c.f24773C));
                return;
            }
            ConversationHeadRecommendLayout.C8115c c8115c2 = this.f24624c;
            if (!c8115c2.f24779f) {
                if (NullChecker.m81303a(this.f24622a)) {
                    Intent intentM48944k2 = MessagesAct.m48944k2(BaseConversationRecommendItemView.this.m40577p(), this.f24622a.f56011id, false, false, 27);
                    if (upa.m194618C1() && !this.f24622a.localEverHasMessage) {
                        lz4.m152319h().m152322d(this.f24622a.f56011id);
                        MessagesAct.m48952s2(intentM48944k2, "one_new_match");
                    }
                    BaseConversationRecommendItemView.this.m40577p().startActivity(intentM48944k2);
                    return;
                }
                return;
            }
            if ("onLive".equals(c8115c2.f24783j) || "onMultiCall".equals(this.f24624c.f24783j)) {
                CoreModule.m29936Q().startAudienceLive(BaseConversationRecommendItemView.this.m40577p(), this.f24624c.f24780g, "conversation", null);
                zvf0.m220399u("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", this.f24624c.f24780g), vwb.m200311Y("anchorId", this.f24624c.f24777d), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f24624c.f24781h)), vwb.m200311Y("show_label", ""), vwb.m200311Y("live_room_live_type", BaseConversationRecommendItemView.this.m40580v(this.f24624c)), vwb.m200311Y("module", "new_match"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "basic"));
                return;
            }
            bkn0 bkn0VarMo67229M6 = CoreModule.m29936Q().mo67229M6();
            PutongAct putongActM40577p = BaseConversationRecommendItemView.this.m40577p();
            ConversationHeadRecommendLayout.C8115c c8115c3 = this.f24624c;
            bkn0VarMo67229M6.mo102431p(putongActM40577p, c8115c3.f24780g, "conversation", c8115c3.f24777d, null);
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", this.f24624c.f24778e), vwb.m200311Y("liveId", this.f24624c.f24780g), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f24624c.f24781h)), vwb.m200311Y("profile_user_id", this.f24624c.f24777d), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("audio_card_type", "message_new_match"), vwb.m200311Y("topic_id", this.f24624c.f24784k));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m40589a(view);
            BaseConversationRecommendItemView.this.mo40573E(this.f24624c);
        }
    }

    public BaseConversationRecommendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static Picture.ImageUri m40571B(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    /* JADX INFO: renamed from: C */
    public boolean m40572C() {
        User user = this.f24614a;
        return user == null || user.isJailed() || this.f24614a.isBanedOrInactivated() || m40578s();
    }

    /* JADX INFO: renamed from: E */
    public void mo40573E(ConversationHeadRecommendLayout.C8115c c8115c) {
    }

    /* JADX INFO: renamed from: F */
    public void mo40574F() {
    }

    /* JADX INFO: renamed from: G */
    public void m40575G(ConversationHeadRecommendLayout.C8115c c8115c, boolean z) {
        if (z) {
            zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", c8115c.f24778e), vwb.m200311Y("liveId", c8115c.f24780g), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8115c.f24781h)), vwb.m200311Y("profile_user_id", c8115c.f24777d), vwb.m200311Y("audio_card_type", "message_new_match"), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("topic_id", c8115c.f24784k));
        } else {
            zvf0.m220368A("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", c8115c.f24780g), vwb.m200311Y("anchorId", c8115c.f24777d), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8115c.f24781h)), vwb.m200311Y("show_label", ""), vwb.m200311Y("module", "new_match"), vwb.m200311Y("live_room_live_type", m40580v(c8115c)), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "basic"));
        }
    }

    /* JADX INFO: renamed from: K */
    public void m40576K(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c, boolean z) {
        if (c8115c == null || c8114b == null || c8114b.f24765d.contains(c8115c.f24777d)) {
            return;
        }
        c8114b.f24765d.add(c8115c.f24777d);
        o6j0.m162864h("e_current_online_photo", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("moments_user_id", c8115c.f24777d), o6j0.C18854a.m162876f("profile_photo_number", m40581w(c8114b, c8115c)), o6j0.C18854a.m162878h("chat_recommend_reason", mo40579u(c8115c)), o6j0.C18854a.m162878h("recommend_photo_distance", this.f24614a.location.distance + ""), o6j0.C18854a.m162878h("equipment_type", z ? "audio_avatar_frame" : ""), o6j0.C18854a.m162878h("is_female_new_recommend", c8115c.f24774a == 21 ? "1" : "0"), o6j0.C18854a.m162876f("is_close_friend", c8115c.f24795v), o6j0.C18854a.m162878h("user_active_time", mqi0.m155932G(this.f24614a.location.updatedTime)));
    }

    /* JADX INFO: renamed from: p */
    public PutongAct m40577p() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: s */
    public boolean m40578s() {
        if (NullChecker.m81303a(this.f24615b)) {
            return TEnum.equals(this.f24615b.status, "dismissed") || TEnum.equals(this.f24615b.status, ConversationStatus.local_fake) || TEnum.equals(this.f24615b.status, "blocked") || TEnum.equals(this.f24615b.status, "removed") || TEnum.equals(this.f24615b.status, ConversationStatus.invisible) || TEnum.equals(this.f24615b.status, "deleted");
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public String mo40579u(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (!TextUtils.isEmpty(c8115c.f24775b)) {
            return c8115c.f24775b;
        }
        int i = c8115c.f24774a;
        if (i == 3) {
            return Active.TYPE;
        }
        if (i == 4) {
            return "recent_contact";
        }
        if (i != 5) {
            return i != 6 ? "" : "new_match";
        }
        return "nearby";
    }

    /* JADX INFO: renamed from: v */
    public String m40580v(ConversationHeadRecommendLayout.C8115c c8115c) {
        return CoreModule.m29936Q().mo67214Dr(c8115c.m40798a());
    }

    /* JADX INFO: renamed from: w */
    public int m40581w(ConversationHeadRecommendLayout.C8114b c8114b, ConversationHeadRecommendLayout.C8115c c8115c) {
        List<ConversationHeadRecommendLayout.C8115c> listM40784L = c8114b.m40784L();
        if (vwb.m200296J(listM40784L) || c8115c == null) {
            return -1;
        }
        int iIndexOf = listM40784L.indexOf(c8115c);
        ConversationHeadRecommendLayout.C8115c c8115c2 = ConversationHeadRecommendLayout.f24739x;
        return (c8115c2 == null || !listM40784L.contains(c8115c2)) ? iIndexOf : iIndexOf - 1;
    }

    /* JADX INFO: renamed from: z */
    public String m40582z(ConversationHeadRecommendLayout.C8115c c8115c, Conversation conversation) {
        if (c8115c.f24779f) {
            return c8115c.f24782i;
        }
        if (!TextUtils.isEmpty(c8115c.f24775b)) {
            return c8115c.f24775b;
        }
        if (upa.m194775k2() && NullChecker.m81303a(conversation) && !TEnum.equals(conversation.status, "blocked") && NullChecker.m81303a(this.f24614a) && mqi0.m155944o() - this.f24614a.location.updatedTime < 300000.0d) {
            return "当前在线";
        }
        int i = c8115c.f24774a;
        if (i == 3) {
            return mqi0.m155932G(this.f24614a.location.updatedTime);
        }
        if (i == 4) {
            return getResources().getString(R$string.f18595i1);
        }
        if (i != 5) {
            if (i != 6) {
                return !TextUtils.isEmpty(c8115c.f24776c) ? c8115c.f24776c : this.f24614a.name;
            }
            return getResources().getString(R$string.f18472e2);
        }
        int i2 = this.f24614a.location.distance;
        if (i2 < 1000) {
            return this.f24614a.location.distance + " m";
        }
        if (i2 > 5000) {
            return getResources().getString(R$string.f18610ih);
        }
        return (this.f24614a.location.distance / 1000) + " km";
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
