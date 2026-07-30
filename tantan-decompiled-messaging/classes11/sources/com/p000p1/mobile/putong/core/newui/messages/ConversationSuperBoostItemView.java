package com.p000p1.mobile.putong.core.newui.messages;

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
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import l.j760;
import l.qib0;
import l.sw6;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.lrb;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationSuperBoostItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConversationSuperBoostItemView f3830d;

    /* JADX INFO: renamed from: e */
    public ConversationBoostRoundView f3831e;

    /* JADX INFO: renamed from: f */
    public View f3832f;

    /* JADX INFO: renamed from: g */
    public Space f3833g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3834h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f3835i;

    /* JADX INFO: renamed from: j */
    public ImageView f3836j;

    /* JADX INFO: renamed from: k */
    public ImageView f3837k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f3838l;

    /* JADX INFO: renamed from: m */
    public VText f3839m;

    /* JADX INFO: renamed from: n */
    public User f3840n;

    /* JADX INFO: renamed from: o */
    public SpotLightLiveInfo f3841o;

    /* JADX INFO: renamed from: p */
    public SpotLightSeeInfo f3842p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$a */
    public static class C0288a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m5412b(ConversationSuperBoostItemView conversationSuperBoostItemView, View view) {
            conversationSuperBoostItemView.f3830d = (ConversationSuperBoostItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationSuperBoostItemView.f3831e = (ConversationBoostRoundView) viewGroup.getChildAt(0);
            conversationSuperBoostItemView.f3832f = viewGroup.getChildAt(1);
            conversationSuperBoostItemView.f3833g = (Space) viewGroup.getChildAt(2);
            conversationSuperBoostItemView.f3834h = viewGroup.getChildAt(3);
            conversationSuperBoostItemView.f3835i = viewGroup.getChildAt(4);
            conversationSuperBoostItemView.f3836j = (ImageView) viewGroup.getChildAt(5);
            conversationSuperBoostItemView.f3837k = (ImageView) viewGroup.getChildAt(6);
            conversationSuperBoostItemView.f3838l = viewGroup.getChildAt(7);
            conversationSuperBoostItemView.f3839m = viewGroup.getChildAt(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationSuperBoostItemView$b */
    public class ViewOnClickListenerC0289b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final ConversationHeadRecommendLayout.C0279c f3843a;

        /* JADX INFO: renamed from: b */
        public final int f3844b;

        public ViewOnClickListenerC0289b(ConversationHeadRecommendLayout.C0279c c0279c, int i) {
            this.f3843a = c0279c;
            this.f3844b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConversationHeadRecommendLayout.C0279c c0279c = this.f3843a;
            if (c0279c.f3552a == 11) {
                if (c0279c.f3564m == 1) {
                    lrb.m17999f().m18007l(ConversationSuperBoostItemView.this.m5409y0());
                    return;
                } else {
                    lrb.m17999f().m18000d(ConversationSuperBoostItemView.this.m5409y0());
                    return;
                }
            }
            ConversationSuperBoostItemView.this.m5403G0(true, c0279c, this.f3844b);
            zvf0.u("e_messages_rec_flow", "p_messages_view", new j760[]{vwb.Y("show_user_id", ((DbObject) ConversationSuperBoostItemView.this.f3840n).id), vwb.Y("tap_user_id", CoreModule.H().userId())});
            if (!NullChecker.a(ConversationSuperBoostItemView.this.f3841o) || TextUtils.isEmpty(ConversationSuperBoostItemView.this.f3841o.id)) {
                int i = this.f3843a.f3552a;
                if (i == 13) {
                    CoreModule.P().a().l1(ConversationSuperBoostItemView.this.m5409y0(), "message");
                    return;
                } else {
                    if (i == 12) {
                        lrb.m17999f().m18006k(ConversationSuperBoostItemView.this.f3840n);
                        ConversationSuperBoostItemView.this.m5409y0().startActivity(new Intent((Context) ConversationSuperBoostItemView.this.m5409y0(), (Class<?>) ConversationBoostDetailAct.class));
                        return;
                    }
                    return;
                }
            }
            if (ConversationSuperBoostItemView.this.f3841o.liveType == 0) {
                CoreModule.Q().startAudienceLive(ConversationSuperBoostItemView.this.m5409y0(), ConversationSuperBoostItemView.this.f3841o.id, "conversation", null);
                ConversationSuperBoostItemView conversationSuperBoostItemView = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView.m5404H0(conversationSuperBoostItemView.f3841o);
            } else if (ConversationSuperBoostItemView.this.f3841o.liveType == 1) {
                CoreModule.Q().m9019M6().m12097p(ConversationSuperBoostItemView.this.m5409y0(), ConversationSuperBoostItemView.this.f3841o.id, "conversation", ConversationSuperBoostItemView.this.f3841o.anchorId, null);
                ConversationSuperBoostItemView conversationSuperBoostItemView2 = ConversationSuperBoostItemView.this;
                conversationSuperBoostItemView2.m5406J0(conversationSuperBoostItemView2.f3841o);
            }
        }
    }

    public ConversationSuperBoostItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m5400B0(ConversationHeadRecommendLayout.C0279c c0279c, int i, View view) {
        new ViewOnClickListenerC0289b(c0279c, i).onClick(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public void m5401D0(final ConversationHeadRecommendLayout.C0279c c0279c, final int i) {
        String str;
        String str2;
        String str3;
        if (c0279c.f3552a == 11) {
            lrb.m17999f().m18009n(true);
            m5402E0(c0279c);
        } else {
            if (TextUtils.isEmpty(c0279c.f3555d)) {
                return;
            }
            this.f3840n = c0279c.f3565n;
            this.f3841o = c0279c.f3566o;
            this.f3842p = c0279c.f3567p;
            m5403G0(false, c0279c, i);
            if (c0279c.f3552a == 13) {
                str3 = TextUtils.isEmpty(this.f3842p.name) ? "" : this.f3842p.name;
                this.f3836j.setVisibility(8);
                this.f3837k.setVisibility(8);
                this.f3838l.setVisibility(0);
                qib0.G.O(this.f3834h, this.f3842p.picture, 2, 50);
                this.f3838l.loadAnimWithListener("core_intl_conversation_header_see.svga", -1, new AnimListener(), true);
                str2 = "#eabd4f";
            } else {
                User user = this.f3840n;
                String str4 = user.name;
                qib0.G.Q0(this.f3834h, m5410z0(user));
                this.f3838l.setVisibility(8);
                this.f3836j.setVisibility(0);
                this.f3837k.setVisibility(0);
                if (!NullChecker.a(this.f3841o) || TextUtils.isEmpty(this.f3841o.id)) {
                    xdl0.M(this.f3837k, false);
                    this.f3836j.setBackgroundResource(x2c0.p5);
                    this.f3839m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "#54C7FC";
                } else if (this.f3841o.liveType == 0) {
                    this.f3836j.setBackgroundResource(x2c0.q5);
                    this.f3837k.setBackgroundResource(x2c0.i5);
                    str = "#ff5157";
                } else {
                    xdl0.M(this.f3837k, false);
                    this.f3836j.setBackgroundResource(x2c0.r5);
                    str = "#FE7E1D";
                }
                str2 = str;
                str3 = str4;
            }
            this.f3839m.setText(str3);
            this.f3831e.setOuterColor(str2);
            this.f3834h.setBackgroundResource(0);
            this.f3839m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.gk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13614a.m5400B0(c0279c, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final void m5402E0(ConversationHeadRecommendLayout.C0279c c0279c) {
        this.f3839m.setText(m5409y0().string(R.string.qc));
        if (c0279c.f3564m == 0) {
            this.f3831e.setOuterColor("");
            qib0.G.L0(this.f3834h, "");
            this.f3831e.setSweepDegree(360.0f);
            CoreModule.c.K0.w3(this.f3835i);
            this.f3836j.setVisibility(8);
            this.f3837k.setVisibility(8);
        } else {
            this.f3835i.setVisibility(8);
            qib0.G.Q0(this.f3834h, m5410z0(CoreModule.c.e0.p9()));
            this.f3834h.setBackgroundResource(0);
            this.f3831e.setOuterColor("#54C7FC");
            this.f3831e.setSweepDegree(c0279c.f3563l);
            xdl0.M(this.f3836j, true);
            xdl0.M(this.f3837k, false);
            this.f3836j.setBackgroundResource(x2c0.p5);
        }
        this.f3839m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m5403G0(boolean z, ConversationHeadRecommendLayout.C0279c c0279c, int i) {
        String str;
        if (c0279c == null) {
            return;
        }
        if (c0279c.f3552a == 12 && NullChecker.a(this.f3841o) && !TextUtils.isEmpty(this.f3841o.id)) {
            int i2 = this.f3841o.liveType;
            SpotLightLiveInfo spotLightLiveInfo = c0279c.f3566o;
            if (i2 == 0) {
                m5405I0(spotLightLiveInfo);
                str = "live";
            } else {
                m5407K0(spotLightLiveInfo);
                str = "audio";
            }
        } else {
            int i3 = c0279c.f3552a;
            if (i3 == 13) {
                str = "chatrequest";
            } else {
                str = i3 == 12 ? "spotlight" : "";
            }
        }
        if (z) {
            zvf0.u("e_messages_rec_flow", "p_messages_view", new j760[]{vwb.Y("ixxn_rec_type", str), vwb.Y("show_user_id", ((DbObject) this.f3840n).id), vwb.Y("tap_user_id", CoreModule.H().userId()), vwb.Y("position_num", Integer.valueOf(i))});
        } else {
            zvf0.A("e_messages_rec_flow", "p_messages_view", new j760[]{vwb.Y("ixxn_rec_type", str), vwb.Y("show_user_id", ((DbObject) this.f3840n).id), vwb.Y("tap_user_id", CoreModule.H().userId()), vwb.Y("position_num", Integer.valueOf(i))});
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m5404H0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.u("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", spotLightLiveInfo.id), vwb.Y("anchorId", spotLightLiveInfo.anchorId), vwb.Y("index", "NA"), vwb.Y("show_label", ""), vwb.Y("live_room_live_type", "NA"), vwb.Y("module", "new_match"), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "basic"), vwb.Y("live_enter_source", "message_top")});
    }

    /* JADX INFO: renamed from: I0 */
    public final void m5405I0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.A("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", spotLightLiveInfo.id), vwb.Y("anchorId", spotLightLiveInfo.anchorId), vwb.Y("index", "NA"), vwb.Y("show_label", ""), vwb.Y("live_room_live_type", "NA"), vwb.Y("module", "new_match"), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "basic"), vwb.Y("live_enter_source", "message_top")});
    }

    /* JADX INFO: renamed from: J0 */
    public final void m5406J0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.u("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", spotLightLiveInfo.anchorId), vwb.Y("audio_card_type", "msg_top_suggest"), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("index", "NA"), vwb.Y("liveId", spotLightLiveInfo.id), vwb.Y("topic_id", "NA"), vwb.Y("profile_user_id", "NA")});
    }

    /* JADX INFO: renamed from: K0 */
    public final void m5407K0(SpotLightLiveInfo spotLightLiveInfo) {
        zvf0.A("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", spotLightLiveInfo.anchorId), vwb.Y("audio_card_type", "msg_top_suggest"), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("index", "NA"), vwb.Y("liveId", spotLightLiveInfo.id), vwb.Y("topic_id", "NA"), vwb.Y("profile_user_id", "NA")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5408w0(this);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m5408w0(View view) {
        C0288a.m5412b(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public PutongAct m5409y0() {
        return getContext();
    }

    /* JADX INFO: renamed from: z0 */
    public Picture.ImageUri m5410z0(User user) {
        return sw6.b(user).profileSmall();
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationSuperBoostItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
