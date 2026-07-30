package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VListCell;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.ftn0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.k05;
import p153l.kec0;
import p153l.lyh0;
import p153l.nae0;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vx6;
import p153l.w30;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseConversationRecommendItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public User f25356a;

    /* JADX INFO: renamed from: b */
    public Conversation f25357b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25358c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$a */
    public static class ViewOnLongClickListenerC8255a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final User f25359a;

        /* JADX INFO: renamed from: b */
        public final Context f25360b;

        /* JADX INFO: renamed from: c */
        public final pf60<Integer, Boolean> f25361c;

        /* JADX INFO: renamed from: d */
        public final Conversation f25362d;

        /* JADX INFO: renamed from: e */
        public final ConversationHeadRecommendLayout.C8265b f25363e;

        public ViewOnLongClickListenerC8255a(ConversationHeadRecommendLayout.C8265b c8265b, Context context, pf60<Integer, Boolean> pf60Var, Conversation conversation, User user) {
            this.f25359a = user;
            this.f25360b = context;
            this.f25361c = pf60Var;
            this.f25362d = conversation;
            this.f25363e = c8265b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m41594a(Throwable th) {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m41598e(uxj0 uxj0Var) {
            this.f25363e.m41798O(this.f25359a.f56859id, false);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m41599f(String str, String str2, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
            String string = c22660a.f210081a.toString();
            if (TextUtils.equals(string, str)) {
                ConversationHeadRecommendLayout.C8265b c8265b = this.f25363e;
                c8265b.mo68557c(c8265b.m41794K(), CoreModule.f18264c.f20384f0.m34078op(this.f25359a.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.wi2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f189332a.m41598e((uxj0) obj);
                    }
                }, new y20() { // from class: l.xi2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        BaseConversationRecommendItemView.ViewOnLongClickListenerC8255a.m41594a((Throwable) obj);
                    }
                }));
                i4g0.m138520r("e_hide_chat_rec", OMSDialogPositon.p_messages_view);
            } else if (TextUtils.equals(string, str2)) {
                if (NullChecker.m82486a(this.f25362d) && this.f25362d.isAnonymous()) {
                    CoreModule.m30930K().mo31694Hp((Act) this.f25360b, this.f25359a.f56859id);
                } else {
                    boolean zM82486a = NullChecker.m82486a(this.f25362d);
                    Context context = this.f25360b;
                    if (zM82486a) {
                        context.startActivity(ProfileAct.m51920o2(context, this.f25359a.f56859id, "conversation_view", false));
                    } else {
                        context.startActivity(ProfileAct.m51920o2(context, this.f25359a.f56859id, "from_recommend_like", false));
                    }
                }
                i4g0.m138520r("e_check_profile", OMSDialogPositon.p_messages_view);
            }
            w30VarArr[0].m204614b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VLinear vLinear;
            if (this.f25359a == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            final String string = this.f25360b.getString(R$string.f19742vh);
            final String string2 = this.f25360b.getString(R$string.f19156ch);
            arrayList.add(string);
            arrayList.add(string2);
            w30.C21001b c21001b = new w30.C21001b(this.f25360b);
            c21001b.m204657I(this.f25360b.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ui2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w30VarArr[0].m204614b();
                }
            }).m204665Q(arrayList).m204664P(lyh0.m156283c(3)).m204670V(new w30.InterfaceC21003d() { // from class: l.vi2
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    this.f184210a.m41599f(string, string2, w30VarArr, vListCell, c22660a, i);
                }
            });
            w30 w30VarM204654F = c21001b.m204654F();
            final w30[] w30VarArr = {w30VarM204654F};
            w30VarM204654F.m204618f();
            View viewM204615c = w30VarArr[0].m204615c();
            if (viewM204615c == null || (vLinear = (VLinear) viewM204615c.findViewById(adc0.f70299d5)) == null) {
                return true;
            }
            vLinear.removeAllViews();
            bnl0.m105524M(vLinear, true);
            p9r.m171370a(this.f25360b).inflate(kec0.f125572Pb, (ViewGroup) vLinear, true);
            vLinear.setPadding(0, 0, 0, 0);
            VDraweeView vDraweeView = (VDraweeView) vLinear.findViewById(adc0.f70031N5);
            if (NullChecker.m82486a(this.f25362d) && this.f25362d.isAnonymous()) {
                uqb0.f180374G.m127115L0(vDraweeView, this.f25359a.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127125Q0(vDraweeView, BaseConversationRecommendItemView.m41582B(this.f25359a));
            }
            if (this.f25359a.isBannedNew() || this.f25359a.isAccountCancellation()) {
                uqb0.f180374G.m127138Y0(vDraweeView, dbc0.f87072i0);
            }
            i4g0.m138526x("e_hide_chat_rec", OMSDialogPositon.p_messages_view);
            i4g0.m138526x("e_check_profile", OMSDialogPositon.p_messages_view);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$b */
    public class ViewOnClickListenerC8256b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f25364a;

        /* JADX INFO: renamed from: b */
        public final ConversationHeadRecommendLayout.C8265b f25365b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C8266c f25366c;

        public ViewOnClickListenerC8256b(Conversation conversation, ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c) {
            this.f25364a = conversation;
            this.f25365b = c8265b;
            this.f25366c = c8266c;
        }

        /* JADX INFO: renamed from: a */
        public final void m41600a(View view) {
            if (NullChecker.m82486a(BaseConversationRecommendItemView.this.f25356a)) {
                sfj0.m185596c("e_current_online_photo", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("moments_user_id", BaseConversationRecommendItemView.this.f25356a.f56859id), sfj0.C20032a.m185613f("profile_photo_number", BaseConversationRecommendItemView.this.m41592w(this.f25365b, this.f25366c)), sfj0.C20032a.m185615h("chat_recommend_reason", BaseConversationRecommendItemView.this.mo41590u(this.f25366c)), sfj0.C20032a.m185615h("recommend_photo_distance", BaseConversationRecommendItemView.this.f25356a.location.distance + ""), sfj0.C20032a.m185613f("is_close_friend", this.f25366c.f25537v), sfj0.C20032a.m185615h("is_female_new_recommend", this.f25366c.f25516a == 21 ? "1" : "0"), sfj0.C20032a.m185615h("user_active_time", pzi0.m174442G(BaseConversationRecommendItemView.this.f25356a.location.updatedTime)));
            }
            ConversationHeadRecommendLayout.C8266c c8266c = this.f25366c;
            if (c8266c.f25516a == 21) {
                BaseConversationRecommendItemView.this.m41588p().startActivity(OOFMkWebViewAct.m42793n2(BaseConversationRecommendItemView.this.getContext()));
                return;
            }
            if (!TextUtils.isEmpty(c8266c.f25515C)) {
                nae0.m162083m(BaseConversationRecommendItemView.this.m41588p(), Uri.parse(this.f25366c.f25515C));
                return;
            }
            ConversationHeadRecommendLayout.C8266c c8266c2 = this.f25366c;
            if (!c8266c2.f25521f) {
                if (NullChecker.m82486a(this.f25364a)) {
                    Intent intentM50127l2 = MessagesAct.m50127l2(BaseConversationRecommendItemView.this.m41588p(), this.f25364a.f56859id, false, false, 27);
                    if (gra.m131549C1() && !this.f25364a.localEverHasMessage) {
                        k05.m147755h().m147758d(this.f25364a.f56859id);
                        MessagesAct.m50135u2(intentM50127l2, "one_new_match");
                    }
                    BaseConversationRecommendItemView.this.m41588p().startActivity(intentM50127l2);
                    return;
                }
                return;
            }
            if ("onLive".equals(c8266c2.f25525j) || "onMultiCall".equals(this.f25366c.f25525j)) {
                CoreModule.m30934Q().startAudienceLive(BaseConversationRecommendItemView.this.m41588p(), this.f25366c.f25522g, "conversation", null);
                i4g0.m138523u("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", this.f25366c.f25522g), jyb.m147494Y("anchorId", this.f25366c.f25519d), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f25366c.f25523h)), jyb.m147494Y("show_label", ""), jyb.m147494Y("live_room_live_type", BaseConversationRecommendItemView.this.m41591v(this.f25366c)), jyb.m147494Y("module", "new_match"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "basic"));
                return;
            }
            ftn0 ftn0VarMo68412M6 = CoreModule.m30934Q().mo68412M6();
            PutongAct putongActM41588p = BaseConversationRecommendItemView.this.m41588p();
            ConversationHeadRecommendLayout.C8266c c8266c3 = this.f25366c;
            ftn0VarMo68412M6.mo127345p(putongActM41588p, c8266c3.f25522g, "conversation", c8266c3.f25519d, null);
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", this.f25366c.f25520e), jyb.m147494Y("liveId", this.f25366c.f25522g), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f25366c.f25523h)), jyb.m147494Y("profile_user_id", this.f25366c.f25519d), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("audio_card_type", "message_new_match"), jyb.m147494Y("topic_id", this.f25366c.f25526k));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m41600a(view);
            BaseConversationRecommendItemView.this.mo41584E(this.f25366c);
        }
    }

    public BaseConversationRecommendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static Picture.ImageUri m41582B(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    /* JADX INFO: renamed from: C */
    public boolean m41583C() {
        User user = this.f25356a;
        return user == null || user.isJailed() || this.f25356a.isBanedOrInactivated() || m41589s();
    }

    /* JADX INFO: renamed from: E */
    public void mo41584E(ConversationHeadRecommendLayout.C8266c c8266c) {
    }

    /* JADX INFO: renamed from: F */
    public void mo41585F() {
    }

    /* JADX INFO: renamed from: G */
    public void m41586G(ConversationHeadRecommendLayout.C8266c c8266c, boolean z) {
        if (z) {
            i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", c8266c.f25520e), jyb.m147494Y("liveId", c8266c.f25522g), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8266c.f25523h)), jyb.m147494Y("profile_user_id", c8266c.f25519d), jyb.m147494Y("audio_card_type", "message_new_match"), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("topic_id", c8266c.f25526k));
        } else {
            i4g0.m138492A("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", c8266c.f25522g), jyb.m147494Y("anchorId", c8266c.f25519d), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8266c.f25523h)), jyb.m147494Y("show_label", ""), jyb.m147494Y("module", "new_match"), jyb.m147494Y("live_room_live_type", m41591v(c8266c)), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "basic"));
        }
    }

    /* JADX INFO: renamed from: K */
    public void m41587K(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c, boolean z) {
        if (c8266c == null || c8265b == null || c8265b.f25507d.contains(c8266c.f25519d)) {
            return;
        }
        c8265b.f25507d.add(c8266c.f25519d);
        sfj0.m185601h("e_current_online_photo", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("moments_user_id", c8266c.f25519d), sfj0.C20032a.m185613f("profile_photo_number", m41592w(c8265b, c8266c)), sfj0.C20032a.m185615h("chat_recommend_reason", mo41590u(c8266c)), sfj0.C20032a.m185615h("recommend_photo_distance", this.f25356a.location.distance + ""), sfj0.C20032a.m185615h("equipment_type", z ? "audio_avatar_frame" : ""), sfj0.C20032a.m185615h("is_female_new_recommend", c8266c.f25516a == 21 ? "1" : "0"), sfj0.C20032a.m185613f("is_close_friend", c8266c.f25537v), sfj0.C20032a.m185615h("user_active_time", pzi0.m174442G(this.f25356a.location.updatedTime)));
    }

    /* JADX INFO: renamed from: p */
    public PutongAct m41588p() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: s */
    public boolean m41589s() {
        if (NullChecker.m82486a(this.f25357b)) {
            return TEnum.equals(this.f25357b.status, "dismissed") || TEnum.equals(this.f25357b.status, ConversationStatus.local_fake) || TEnum.equals(this.f25357b.status, "blocked") || TEnum.equals(this.f25357b.status, "removed") || TEnum.equals(this.f25357b.status, ConversationStatus.invisible) || TEnum.equals(this.f25357b.status, "deleted");
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public String mo41590u(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (!TextUtils.isEmpty(c8266c.f25517b)) {
            return c8266c.f25517b;
        }
        int i = c8266c.f25516a;
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
    public String m41591v(ConversationHeadRecommendLayout.C8266c c8266c) {
        return CoreModule.m30934Q().mo68397Dr(c8266c.m41809a());
    }

    /* JADX INFO: renamed from: w */
    public int m41592w(ConversationHeadRecommendLayout.C8265b c8265b, ConversationHeadRecommendLayout.C8266c c8266c) {
        List<ConversationHeadRecommendLayout.C8266c> listM41795L = c8265b.m41795L();
        if (jyb.m147479J(listM41795L) || c8266c == null) {
            return -1;
        }
        int iIndexOf = listM41795L.indexOf(c8266c);
        ConversationHeadRecommendLayout.C8266c c8266c2 = ConversationHeadRecommendLayout.f25481x;
        return (c8266c2 == null || !listM41795L.contains(c8266c2)) ? iIndexOf : iIndexOf - 1;
    }

    /* JADX INFO: renamed from: z */
    public String m41593z(ConversationHeadRecommendLayout.C8266c c8266c, Conversation conversation) {
        if (c8266c.f25521f) {
            return c8266c.f25524i;
        }
        if (!TextUtils.isEmpty(c8266c.f25517b)) {
            return c8266c.f25517b;
        }
        if (gra.m131706k2() && NullChecker.m82486a(conversation) && !TEnum.equals(conversation.status, "blocked") && NullChecker.m82486a(this.f25356a) && pzi0.m174454o() - this.f25356a.location.updatedTime < 300000.0d) {
            return "当前在线";
        }
        int i = c8266c.f25516a;
        if (i == 3) {
            return pzi0.m174442G(this.f25356a.location.updatedTime);
        }
        if (i == 4) {
            return getResources().getString(R$string.f19325i1);
        }
        if (i != 5) {
            if (i != 6) {
                return !TextUtils.isEmpty(c8266c.f25518c) ? c8266c.f25518c : this.f25356a.name;
            }
            return getResources().getString(R$string.f19202e2);
        }
        int i2 = this.f25356a.location.distance;
        if (i2 < 1000) {
            return this.f25356a.location.distance + " m";
        }
        if (i2 > 5000) {
            return getResources().getString(R$string.f18396Dh);
        }
        return (this.f25356a.location.distance / 1000) + " km";
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
