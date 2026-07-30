package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p051p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.uqb0;
import p153l.vx6;
import p153l.zsb;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationSuperBoostItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConversationSuperBoostItemView f25794d;

    /* JADX INFO: renamed from: e */
    public ConversationBoostRoundView f25795e;

    /* JADX INFO: renamed from: f */
    public View f25796f;

    /* JADX INFO: renamed from: g */
    public Space f25797g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25798h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f25799i;

    /* JADX INFO: renamed from: j */
    public ImageView f25800j;

    /* JADX INFO: renamed from: k */
    public ImageView f25801k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f25802l;

    /* JADX INFO: renamed from: m */
    public VText f25803m;

    /* JADX INFO: renamed from: n */
    public User f25804n;

    /* JADX INFO: renamed from: o */
    public SpotLightLiveInfo f25805o;

    /* JADX INFO: renamed from: p */
    public SpotLightSeeInfo f25806p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$a */
    public static class C8275a {
        /* JADX INFO: renamed from: b */
        public static void m42317b(ConversationSuperBoostItemView conversationSuperBoostItemView, View view) {
            conversationSuperBoostItemView.f25794d = (ConversationSuperBoostItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationSuperBoostItemView.f25795e = (ConversationBoostRoundView) viewGroup.getChildAt(0);
            conversationSuperBoostItemView.f25796f = viewGroup.getChildAt(1);
            conversationSuperBoostItemView.f25797g = (Space) viewGroup.getChildAt(2);
            conversationSuperBoostItemView.f25798h = (VDraweeView) viewGroup.getChildAt(3);
            conversationSuperBoostItemView.f25799i = (AnimEffectPlayer) viewGroup.getChildAt(4);
            conversationSuperBoostItemView.f25800j = (ImageView) viewGroup.getChildAt(5);
            conversationSuperBoostItemView.f25801k = (ImageView) viewGroup.getChildAt(6);
            conversationSuperBoostItemView.f25802l = (AnimEffectPlayer) viewGroup.getChildAt(7);
            conversationSuperBoostItemView.f25803m = (VText) viewGroup.getChildAt(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$b */
    public class ViewOnClickListenerC8276b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final ConversationHeadRecommendLayout.C8266c f25807a;

        /* JADX INFO: renamed from: b */
        public final int f25808b;

        public ViewOnClickListenerC8276b(ConversationHeadRecommendLayout.C8266c c8266c, int i) {
            this.f25807a = c8266c;
            this.f25808b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConversationHeadRecommendLayout.C8266c c8266c = this.f25807a;
            if (c8266c.f25516a == 11) {
                if (c8266c.f25528m == 1) {
                    zsb.m221313f().m221321l(ConversationSuperBoostItemView.this.m42314y0());
                    return;
                } else {
                    zsb.m221313f().m221314d(ConversationSuperBoostItemView.this.m42314y0());
                    return;
                }
            }
            ConversationSuperBoostItemView.this.m42308G0(true, c8266c, this.f25808b);
            i4g0.m138523u("e_messages_rec_flow", OMSDialogPositon.p_messages_view, jyb.m147494Y("show_user_id", ConversationSuperBoostItemView.this.f25804n.f56859id), jyb.m147494Y("tap_user_id", CoreModule.m30929H().userId()));
            if (!NullChecker.m82486a(ConversationSuperBoostItemView.this.f25805o) || TextUtils.isEmpty(ConversationSuperBoostItemView.this.f25805o.f21243id)) {
                int i = this.f25807a.f25516a;
                if (i == 13) {
                    CoreModule.m30933P().m143405a().mo34537l1(ConversationSuperBoostItemView.this.m42314y0(), "message");
                    return;
                } else {
                    if (i == 12) {
                        zsb.m221313f().m221320k(ConversationSuperBoostItemView.this.f25804n);
                        ConversationSuperBoostItemView.this.m42314y0().startActivity(new Intent(ConversationSuperBoostItemView.this.m42314y0(), (Class<?>) ConversationBoostDetailAct.class));
                        return;
                    }
                    return;
                }
            }
            if (ConversationSuperBoostItemView.this.f25805o.liveType == 0) {
                CoreModule.m30934Q().startAudienceLive(ConversationSuperBoostItemView.this.m42314y0(), ConversationSuperBoostItemView.this.f25805o.f21243id, "conversation", null);
                ConversationSuperBoostItemView conversationSuperBoostItemView = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView.m42309H0(conversationSuperBoostItemView.f25805o);
            } else if (ConversationSuperBoostItemView.this.f25805o.liveType == 1) {
                CoreModule.m30934Q().mo68412M6().mo127345p(ConversationSuperBoostItemView.this.m42314y0(), ConversationSuperBoostItemView.this.f25805o.f21243id, "conversation", ConversationSuperBoostItemView.this.f25805o.anchorId, null);
                ConversationSuperBoostItemView conversationSuperBoostItemView2 = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView2.m42311J0(conversationSuperBoostItemView2.f25805o);
            }
        }
    }

    public ConversationSuperBoostItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m42305B0(ConversationHeadRecommendLayout.C8266c c8266c, int i, View view) {
        new ViewOnClickListenerC8276b(c8266c, i).onClick(view);
    }

    /* JADX INFO: renamed from: D0 */
    public void m42306D0(final ConversationHeadRecommendLayout.C8266c c8266c, final int i) {
        String str;
        String str2;
        String str3;
        if (c8266c.f25516a == 11) {
            zsb.m221313f().m221323n(true);
            m42307E0(c8266c);
        } else {
            if (TextUtils.isEmpty(c8266c.f25519d)) {
                return;
            }
            this.f25804n = c8266c.f25529n;
            this.f25805o = c8266c.f25530o;
            this.f25806p = c8266c.f25531p;
            m42308G0(false, c8266c, i);
            if (c8266c.f25516a == 13) {
                str3 = TextUtils.isEmpty(this.f25806p.name) ? "" : this.f25806p.name;
                this.f25800j.setVisibility(8);
                this.f25801k.setVisibility(8);
                this.f25802l.setVisibility(0);
                uqb0.f180374G.m127120O(this.f25798h, this.f25806p.picture, 2, 50);
                this.f25802l.loadAnimWithListener("core_intl_conversation_header_see.svga", -1, new AnimListener(), true);
                str2 = "#eabd4f";
            } else {
                User user = this.f25804n;
                String str4 = user.name;
                uqb0.f180374G.m127125Q0(this.f25798h, m42315z0(user));
                this.f25802l.setVisibility(8);
                this.f25800j.setVisibility(0);
                this.f25801k.setVisibility(0);
                if (!NullChecker.m82486a(this.f25805o) || TextUtils.isEmpty(this.f25805o.f21243id)) {
                    bnl0.m105524M(this.f25801k, false);
                    this.f25800j.setBackgroundResource(dbc0.f87339q5);
                    this.f25803m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "#54C7FC";
                } else if (this.f25805o.liveType == 0) {
                    this.f25800j.setBackgroundResource(dbc0.f87372r5);
                    this.f25801k.setBackgroundResource(dbc0.f87108j5);
                    str = "#ff5157";
                } else {
                    bnl0.m105524M(this.f25801k, false);
                    this.f25800j.setBackgroundResource(dbc0.f87405s5);
                    str = "#FE7E1D";
                }
                str2 = str;
                str3 = str4;
            }
            this.f25803m.setText(str3);
            this.f25795e.setOuterColor(str2);
            this.f25798h.setBackgroundResource(0);
            this.f25803m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.jl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121476a.m42305B0(c8266c, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final void m42307E0(ConversationHeadRecommendLayout.C8266c c8266c) {
        this.f25803m.setText(m42314y0().string(R$string.f18453Fc));
        if (c8266c.f25528m == 0) {
            this.f25795e.setOuterColor("");
            uqb0.f180374G.m127115L0(this.f25798h, "");
            this.f25795e.setSweepDegree(360.0f);
            CoreModule.f18264c.f20321K0.m113315w3(this.f25799i);
            this.f25800j.setVisibility(8);
            this.f25801k.setVisibility(8);
        } else {
            this.f25799i.setVisibility(8);
            uqb0.f180374G.m127125Q0(this.f25798h, m42315z0(CoreModule.f18264c.f20381e0.m116600p9()));
            this.f25798h.setBackgroundResource(0);
            this.f25795e.setOuterColor("#54C7FC");
            this.f25795e.setSweepDegree(c8266c.f25527l);
            bnl0.m105524M(this.f25800j, true);
            bnl0.m105524M(this.f25801k, false);
            this.f25800j.setBackgroundResource(dbc0.f87339q5);
        }
        this.f25803m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m42308G0(boolean z, ConversationHeadRecommendLayout.C8266c c8266c, int i) {
        String str;
        if (c8266c == null) {
            return;
        }
        if (c8266c.f25516a == 12 && NullChecker.m82486a(this.f25805o) && !TextUtils.isEmpty(this.f25805o.f21243id)) {
            int i2 = this.f25805o.liveType;
            SpotLightLiveInfo spotLightLiveInfo = c8266c.f25530o;
            if (i2 == 0) {
                m42310I0(spotLightLiveInfo);
                str = "live";
            } else {
                m42312K0(spotLightLiveInfo);
                str = "audio";
            }
        } else {
            int i3 = c8266c.f25516a;
            if (i3 == 13) {
                str = "chatrequest";
            } else {
                str = i3 == 12 ? "spotlight" : "";
            }
        }
        if (z) {
            i4g0.m138523u("e_messages_rec_flow", OMSDialogPositon.p_messages_view, jyb.m147494Y("ixxn_rec_type", str), jyb.m147494Y("show_user_id", this.f25804n.f56859id), jyb.m147494Y("tap_user_id", CoreModule.m30929H().userId()), jyb.m147494Y("position_num", Integer.valueOf(i)));
        } else {
            i4g0.m138492A("e_messages_rec_flow", OMSDialogPositon.p_messages_view, jyb.m147494Y("ixxn_rec_type", str), jyb.m147494Y("show_user_id", this.f25804n.f56859id), jyb.m147494Y("tap_user_id", CoreModule.m30929H().userId()), jyb.m147494Y("position_num", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m42309H0(SpotLightLiveInfo spotLightLiveInfo) {
        i4g0.m138523u("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", spotLightLiveInfo.f21243id), jyb.m147494Y("anchorId", spotLightLiveInfo.anchorId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", ""), jyb.m147494Y("live_room_live_type", "NA"), jyb.m147494Y("module", "new_match"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "basic"), jyb.m147494Y("live_enter_source", "message_top"));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m42310I0(SpotLightLiveInfo spotLightLiveInfo) {
        i4g0.m138492A("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", spotLightLiveInfo.f21243id), jyb.m147494Y("anchorId", spotLightLiveInfo.anchorId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", ""), jyb.m147494Y("live_room_live_type", "NA"), jyb.m147494Y("module", "new_match"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "basic"), jyb.m147494Y("live_enter_source", "message_top"));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m42311J0(SpotLightLiveInfo spotLightLiveInfo) {
        i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", spotLightLiveInfo.anchorId), jyb.m147494Y("audio_card_type", "msg_top_suggest"), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("liveId", spotLightLiveInfo.f21243id), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("profile_user_id", "NA"));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m42312K0(SpotLightLiveInfo spotLightLiveInfo) {
        i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", spotLightLiveInfo.anchorId), jyb.m147494Y("audio_card_type", "msg_top_suggest"), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("liveId", spotLightLiveInfo.f21243id), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("profile_user_id", "NA"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42313w0(this);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m42313w0(View view) {
        C8275a.m42317b(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public PutongAct m42314y0() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: z0 */
    public Picture.ImageUri m42315z0(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
