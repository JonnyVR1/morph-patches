package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p046p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import p147v.VDraweeView;
import p147v.VText;
import p149l.lrb;
import p149l.qib0;
import p149l.sw6;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationSuperBoostItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConversationSuperBoostItemView f25052d;

    /* JADX INFO: renamed from: e */
    public ConversationBoostRoundView f25053e;

    /* JADX INFO: renamed from: f */
    public View f25054f;

    /* JADX INFO: renamed from: g */
    public Space f25055g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25056h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f25057i;

    /* JADX INFO: renamed from: j */
    public ImageView f25058j;

    /* JADX INFO: renamed from: k */
    public ImageView f25059k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f25060l;

    /* JADX INFO: renamed from: m */
    public VText f25061m;

    /* JADX INFO: renamed from: n */
    public User f25062n;

    /* JADX INFO: renamed from: o */
    public SpotLightLiveInfo f25063o;

    /* JADX INFO: renamed from: p */
    public SpotLightSeeInfo f25064p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$a */
    public static class C8124a {
        /* JADX INFO: renamed from: b */
        public static void m41306b(ConversationSuperBoostItemView conversationSuperBoostItemView, View view) {
            conversationSuperBoostItemView.f25052d = (ConversationSuperBoostItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationSuperBoostItemView.f25053e = (ConversationBoostRoundView) viewGroup.getChildAt(0);
            conversationSuperBoostItemView.f25054f = viewGroup.getChildAt(1);
            conversationSuperBoostItemView.f25055g = (Space) viewGroup.getChildAt(2);
            conversationSuperBoostItemView.f25056h = (VDraweeView) viewGroup.getChildAt(3);
            conversationSuperBoostItemView.f25057i = (AnimEffectPlayer) viewGroup.getChildAt(4);
            conversationSuperBoostItemView.f25058j = (ImageView) viewGroup.getChildAt(5);
            conversationSuperBoostItemView.f25059k = (ImageView) viewGroup.getChildAt(6);
            conversationSuperBoostItemView.f25060l = (AnimEffectPlayer) viewGroup.getChildAt(7);
            conversationSuperBoostItemView.f25061m = (VText) viewGroup.getChildAt(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$b */
    public class ViewOnClickListenerC8125b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final ConversationHeadRecommendLayout.C8115c f25065a;

        /* JADX INFO: renamed from: b */
        public final int f25066b;

        public ViewOnClickListenerC8125b(ConversationHeadRecommendLayout.C8115c c8115c, int i) {
            this.f25065a = c8115c;
            this.f25066b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConversationHeadRecommendLayout.C8115c c8115c = this.f25065a;
            if (c8115c.f24774a == 11) {
                if (c8115c.f24786m == 1) {
                    lrb.m151154f().m151162l(ConversationSuperBoostItemView.this.m41303y0());
                    return;
                } else {
                    lrb.m151154f().m151155d(ConversationSuperBoostItemView.this.m41303y0());
                    return;
                }
            }
            ConversationSuperBoostItemView.this.m41297G0(true, c8115c, this.f25066b);
            zvf0.m220399u("e_messages_rec_flow", OMSDialogPositon.p_messages_view, vwb.m200311Y("show_user_id", ConversationSuperBoostItemView.this.f25062n.f56011id), vwb.m200311Y("tap_user_id", CoreModule.m29931H().userId()));
            if (!NullChecker.m81303a(ConversationSuperBoostItemView.this.f25063o) || TextUtils.isEmpty(ConversationSuperBoostItemView.this.f25063o.f20501id)) {
                int i = this.f25065a.f24774a;
                if (i == 13) {
                    CoreModule.m29935P().m94651a().mo33534l1(ConversationSuperBoostItemView.this.m41303y0(), "message");
                    return;
                } else {
                    if (i == 12) {
                        lrb.m151154f().m151161k(ConversationSuperBoostItemView.this.f25062n);
                        ConversationSuperBoostItemView.this.m41303y0().startActivity(new Intent(ConversationSuperBoostItemView.this.m41303y0(), (Class<?>) ConversationBoostDetailAct.class));
                        return;
                    }
                    return;
                }
            }
            if (ConversationSuperBoostItemView.this.f25063o.liveType == 0) {
                CoreModule.m29936Q().startAudienceLive(ConversationSuperBoostItemView.this.m41303y0(), ConversationSuperBoostItemView.this.f25063o.f20501id, "conversation", null);
                ConversationSuperBoostItemView conversationSuperBoostItemView = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView.m41298H0(conversationSuperBoostItemView.f25063o);
            } else if (ConversationSuperBoostItemView.this.f25063o.liveType == 1) {
                CoreModule.m29936Q().mo67229M6().mo102431p(ConversationSuperBoostItemView.this.m41303y0(), ConversationSuperBoostItemView.this.f25063o.f20501id, "conversation", ConversationSuperBoostItemView.this.f25063o.anchorId, null);
                ConversationSuperBoostItemView conversationSuperBoostItemView2 = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView2.m41300J0(conversationSuperBoostItemView2.f25063o);
            }
        }
    }

    public ConversationSuperBoostItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m41294B0(ConversationHeadRecommendLayout.C8115c c8115c, int i, View view) {
        new ViewOnClickListenerC8125b(c8115c, i).onClick(view);
    }

    /* JADX INFO: renamed from: D0 */
    public void m41295D0(final ConversationHeadRecommendLayout.C8115c c8115c, final int i) {
        String str;
        String str2;
        String str3;
        if (c8115c.f24774a == 11) {
            lrb.m151154f().m151164n(true);
            m41296E0(c8115c);
        } else {
            if (TextUtils.isEmpty(c8115c.f24777d)) {
                return;
            }
            this.f25062n = c8115c.f24787n;
            this.f25063o = c8115c.f24788o;
            this.f25064p = c8115c.f24789p;
            m41297G0(false, c8115c, i);
            if (c8115c.f24774a == 13) {
                str3 = TextUtils.isEmpty(this.f25064p.name) ? "" : this.f25064p.name;
                this.f25058j.setVisibility(8);
                this.f25059k.setVisibility(8);
                this.f25060l.setVisibility(0);
                qib0.f154691G.m102336O(this.f25056h, this.f25064p.picture, 2, 50);
                this.f25060l.loadAnimWithListener("core_intl_conversation_header_see.svga", -1, new AnimListener(), true);
                str2 = "#eabd4f";
            } else {
                User user = this.f25062n;
                String str4 = user.name;
                qib0.f154691G.m102341Q0(this.f25056h, m41304z0(user));
                this.f25060l.setVisibility(8);
                this.f25058j.setVisibility(0);
                this.f25059k.setVisibility(0);
                if (!NullChecker.m81303a(this.f25063o) || TextUtils.isEmpty(this.f25063o.f20501id)) {
                    xdl0.m208344M(this.f25059k, false);
                    this.f25058j.setBackgroundResource(x2c0.f190448p5);
                    this.f25061m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "#54C7FC";
                } else if (this.f25063o.liveType == 0) {
                    this.f25058j.setBackgroundResource(x2c0.f190480q5);
                    this.f25059k.setBackgroundResource(x2c0.f190226i5);
                    str = "#ff5157";
                } else {
                    xdl0.m208344M(this.f25059k, false);
                    this.f25058j.setBackgroundResource(x2c0.f190512r5);
                    str = "#FE7E1D";
                }
                str2 = str;
                str3 = str4;
            }
            this.f25061m.setText(str3);
            this.f25053e.setOuterColor(str2);
            this.f25056h.setBackgroundResource(0);
            this.f25061m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103153a.m41294B0(c8115c, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final void m41296E0(ConversationHeadRecommendLayout.C8115c c8115c) {
        this.f25061m.setText(m41303y0().string(R$string.f18851qc));
        if (c8115c.f24786m == 0) {
            this.f25053e.setOuterColor("");
            qib0.f154691G.m102331L0(this.f25056h, "");
            this.f25053e.setSweepDegree(360.0f);
            CoreModule.f17545c.f19579K0.m176988w3(this.f25057i);
            this.f25058j.setVisibility(8);
            this.f25059k.setVisibility(8);
        } else {
            this.f25057i.setVisibility(8);
            qib0.f154691G.m102341Q0(this.f25056h, m41304z0(CoreModule.f17545c.f19639e0.m169527p9()));
            this.f25056h.setBackgroundResource(0);
            this.f25053e.setOuterColor("#54C7FC");
            this.f25053e.setSweepDegree(c8115c.f24785l);
            xdl0.m208344M(this.f25058j, true);
            xdl0.m208344M(this.f25059k, false);
            this.f25058j.setBackgroundResource(x2c0.f190448p5);
        }
        this.f25061m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m41297G0(boolean z, ConversationHeadRecommendLayout.C8115c c8115c, int i) {
        String str;
        if (c8115c == null) {
            return;
        }
        if (c8115c.f24774a == 12 && NullChecker.m81303a(this.f25063o) && !TextUtils.isEmpty(this.f25063o.f20501id)) {
            int i2 = this.f25063o.liveType;
            SpotLightLiveInfo spotLightLiveInfo = c8115c.f24788o;
            if (i2 == 0) {
                m41299I0(spotLightLiveInfo);
                str = "live";
            } else {
                m41301K0(spotLightLiveInfo);
                str = "audio";
            }
        } else {
            int i3 = c8115c.f24774a;
            if (i3 == 13) {
                str = "chatrequest";
            } else {
                str = i3 == 12 ? "spotlight" : "";
            }
        }
        if (z) {
            zvf0.m220399u("e_messages_rec_flow", OMSDialogPositon.p_messages_view, vwb.m200311Y("ixxn_rec_type", str), vwb.m200311Y("show_user_id", this.f25062n.f56011id), vwb.m200311Y("tap_user_id", CoreModule.m29931H().userId()), vwb.m200311Y("position_num", Integer.valueOf(i)));
        } else {
            zvf0.m220368A("e_messages_rec_flow", OMSDialogPositon.p_messages_view, vwb.m200311Y("ixxn_rec_type", str), vwb.m200311Y("show_user_id", this.f25062n.f56011id), vwb.m200311Y("tap_user_id", CoreModule.m29931H().userId()), vwb.m200311Y("position_num", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m41298H0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.m220399u("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", spotLightLiveInfo.f20501id), vwb.m200311Y("anchorId", spotLightLiveInfo.anchorId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", ""), vwb.m200311Y("live_room_live_type", "NA"), vwb.m200311Y("module", "new_match"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "basic"), vwb.m200311Y("live_enter_source", "message_top"));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m41299I0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.m220368A("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", spotLightLiveInfo.f20501id), vwb.m200311Y("anchorId", spotLightLiveInfo.anchorId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", ""), vwb.m200311Y("live_room_live_type", "NA"), vwb.m200311Y("module", "new_match"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "basic"), vwb.m200311Y("live_enter_source", "message_top"));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m41300J0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", spotLightLiveInfo.anchorId), vwb.m200311Y("audio_card_type", "msg_top_suggest"), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("liveId", spotLightLiveInfo.f20501id), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("profile_user_id", "NA"));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m41301K0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", spotLightLiveInfo.anchorId), vwb.m200311Y("audio_card_type", "msg_top_suggest"), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("liveId", spotLightLiveInfo.f20501id), vwb.m200311Y("topic_id", "NA"), vwb.m200311Y("profile_user_id", "NA"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41302w0(this);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m41302w0(View view) {
        C8124a.m41306b(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public PutongAct m41303y0() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: z0 */
    public Picture.ImageUri m41304z0(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
