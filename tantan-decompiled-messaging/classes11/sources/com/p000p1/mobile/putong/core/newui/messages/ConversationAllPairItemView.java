package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.bkb0;
import l.e30;
import l.j2e0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.nvc0;
import l.o6j0;
import l.qib0;
import l.sw6;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.bkn0;
import p009l.f56;
import p009l.hae0;
import p009l.mqi0;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAllPairItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConversationAllPairItemView f3416a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3417b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f3418c;

    /* JADX INFO: renamed from: d */
    public VImage f3419d;

    /* JADX INFO: renamed from: e */
    public VImage f3420e;

    /* JADX INFO: renamed from: f */
    public VText f3421f;

    /* JADX INFO: renamed from: g */
    public User f3422g;

    /* JADX INFO: renamed from: h */
    public Conversation f3423h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$a */
    public static class C0270a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m4719b(ConversationAllPairItemView conversationAllPairItemView, View view) {
            conversationAllPairItemView.f3416a = (ConversationAllPairItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationAllPairItemView.f3417b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationAllPairItemView.f3418c = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationAllPairItemView.f3419d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationAllPairItemView.f3420e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            conversationAllPairItemView.f3421f = viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$b */
    public class ViewOnClickListenerC0271b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f3424a;

        /* JADX INFO: renamed from: b */
        public final int f3425b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C0279c f3426c;

        public ViewOnClickListenerC0271b(Conversation conversation, int i, ConversationHeadRecommendLayout.C0279c c0279c) {
            this.f3424a = conversation;
            this.f3425b = i;
            this.f3426c = c0279c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(ConversationAllPairItemView.this.f3422g)) {
                o6j0.c("e_current_online_photo", "p_messages_view", new o6j0.a[]{o6j0.a.h("moments_user_id", ((DbObject) ConversationAllPairItemView.this.f3422g).id), o6j0.a.f("profile_photo_number", this.f3425b), o6j0.a.h("chat_recommend_reason", ConversationAllPairItemView.this.m4698O(this.f3426c)), o6j0.a.h("recommend_photo_distance", ConversationAllPairItemView.this.f3422g.location.distance + ""), o6j0.a.f("is_close_friend", this.f3426c.f3573v), o6j0.a.h("is_female_new_recommend", this.f3426c.f3552a == 21 ? "1" : "0"), o6j0.a.h("user_active_time", mqi0.m18538G(ConversationAllPairItemView.this.f3422g.location.updatedTime))});
            }
            if (!TextUtils.isEmpty(this.f3426c.f3551C)) {
                j2e0.m(ConversationAllPairItemView.this.m4708N(), Uri.parse(this.f3426c.f3551C));
                return;
            }
            ConversationHeadRecommendLayout.C0279c c0279c = this.f3426c;
            if (!c0279c.f3557f) {
                if (NullChecker.a(this.f3424a)) {
                    ConversationAllPairItemView.this.m4708N().startActivity(MessagesAct.k2(ConversationAllPairItemView.this.m4708N(), ((DbObject) this.f3424a).id, false, false, 27));
                }
            } else {
                if ("onLive".equals(c0279c.f3561j) || "onMultiCall".equals(this.f3426c.f3561j)) {
                    CoreModule.Q().startAudienceLive(ConversationAllPairItemView.this.m4708N(), this.f3426c.f3558g, "conversation", null);
                    zvf0.u("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", this.f3426c.f3558g), vwb.Y("anchorId", this.f3426c.f3555d), vwb.Y("index", Integer.valueOf(this.f3426c.f3559h)), vwb.Y("show_label", ""), vwb.Y("live_room_live_type", ConversationAllPairItemView.this.m4699P(this.f3426c)), vwb.Y("module", "new_match"), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "NA")});
                    return;
                }
                bkn0 bkn0VarM9019M6 = CoreModule.Q().m9019M6();
                PutongAct putongActM4708N = ConversationAllPairItemView.this.m4708N();
                ConversationHeadRecommendLayout.C0279c c0279c2 = this.f3426c;
                bkn0VarM9019M6.m12097p(putongActM4708N, c0279c2.f3558g, "conversation", c0279c2.f3555d, null);
                zvf0.u("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", this.f3426c.f3556e), vwb.Y("liveId", this.f3426c.f3558g), vwb.Y("index", Integer.valueOf(this.f3426c.f3559h)), vwb.Y("profile_user_id", this.f3426c.f3555d), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("audio_card_type", "message_new_match"), vwb.Y("topic_id", this.f3426c.f3562k)});
            }
        }
    }

    public ConversationAllPairItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public String m4698O(ConversationHeadRecommendLayout.C0279c c0279c) {
        return !TextUtils.isEmpty(c0279c.f3553b) ? c0279c.f3553b : "active";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public String m4699P(ConversationHeadRecommendLayout.C0279c c0279c) {
        return CoreModule.Q().m9004Dr(c0279c.m4896a());
    }

    /* JADX INFO: renamed from: a0 */
    private void m4700a0(ConversationHeadRecommendLayout.C0279c c0279c) {
        xdl0.M(this.f3418c, true);
        xdl0.M(this.f3417b, false);
        ImageRequest imageRequestA = qib0.G.n(this.f3422g.fp().profileSmall().base).O(new nvc0(this.f3418c.getAvatarSize(), this.f3418c.getAvatarSize())).a();
        boolean zEquals = "onVoice".equals(c0279c.f3561j);
        this.f3418c.m5793e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.G;
        LiveHaloAvatar liveHaloAvatar = this.f3418c;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.F(imageRequestA, new f56(liveHaloAvatar));
        if (zEquals) {
            zvf0.A("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", c0279c.f3556e), vwb.Y("liveId", c0279c.f3558g), vwb.Y("index", Integer.valueOf(c0279c.f3559h)), vwb.Y("profile_user_id", c0279c.f3555d), vwb.Y("audio_card_type", "message_new_match"), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("topic_id", c0279c.f3562k)});
        } else {
            zvf0.A("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", c0279c.f3558g), vwb.Y("anchorId", c0279c.f3555d), vwb.Y("index", Integer.valueOf(c0279c.f3559h)), vwb.Y("show_label", ""), vwb.Y("module", "new_match"), vwb.Y("live_room_live_type", m4699P(c0279c)), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "NA")});
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4707M(View view) {
        C0270a.m4719b(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public PutongAct m4708N() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final c<j760<Integer, Boolean>> m4714W(Conversation conversation) {
        return c.just(new j760(-1, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: R */
    public final String m4710R(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (c0279c.f3557f) {
            return c0279c.f3560i;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) this.f3422g).id);
        return NullChecker.a(conversationXe) ? mqi0.m18538G(conversationXe.latestTime) : this.f3422g.name;
    }

    /* JADX INFO: renamed from: S */
    public Picture.ImageUri m4711S(User user) {
        return sw6.b(user).profileSmall();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4712T(User user) {
        this.f3422g = user;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m4713V(Conversation conversation) {
        this.f3423h = conversation;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m4715X(ConversationHeadRecommendLayout.C0279c c0279c, j760 j760Var) {
        if (c0279c.f3557f) {
            m4700a0(c0279c);
        } else {
            xdl0.M(this.f3418c, false);
            xdl0.M(this.f3417b, true);
            if (this.f3422g.isBannedNew() || this.f3422g.isAccountCancellation()) {
                qib0.G.Y0(this.f3417b, x2c0.h0);
            } else {
                qib0.G.Q0(this.f3417b, m4711S(this.f3422g));
            }
        }
        if (!CoreModule.c.N0.j3(this.f3422g) || c0279c.f3557f) {
            xdl0.M(this.f3420e, false);
        } else {
            xdl0.M(this.f3420e, true);
        }
        if (!NullChecker.a(this.f3423h) || this.f3423h.read.booleanValue() || this.f3423h.localHasMessage || this.f3420e.getVisibility() == 0 || c0279c.f3557f) {
            xdl0.M(this.f3419d, false);
        } else {
            xdl0.M(this.f3419d, true);
        }
        this.f3421f.setBackgroundResource(0);
        this.f3421f.setText(m4710R(c0279c));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m4716Y(int i, ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        new ViewOnClickListenerC0271b(this.f3423h, i, c0279c).onClick(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public void m4717Z(ConversationHeadRecommendLayout.C0278b c0278b, final ConversationHeadRecommendLayout.C0279c c0279c, final int i) {
        c0278b.c(m4708N(), mkd0.r(CoreModule.c.e0.Ka(c0279c.f3555d).doOnNext(new e30() { // from class: l.a56
            public final void call(Object obj) {
                this.f9252a.m4712T((User) obj);
            }
        }), CoreModule.k.m.uiGet(c0279c.f3555d).doOnNext(new e30() { // from class: l.b56
            public final void call(Object obj) {
                this.f9906a.m4713V((Conversation) obj);
            }
        }).switchMap(new w9j() { // from class: l.c56
            public final Object call(Object obj) {
                return this.f10440a.m4714W((Conversation) obj);
            }
        }), new hae0())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.d56
            public final void call(Object obj) {
                this.f11643a.m4715X(c0279c, (j760) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.e56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12371a.m4716Y(i, c0279c, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4707M(this);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
