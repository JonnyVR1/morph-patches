package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.bkb0;
import p149l.bkn0;
import p149l.e30;
import p149l.f56;
import p149l.hae0;
import p149l.j2e0;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nvc0;
import p149l.o6j0;
import p149l.qib0;
import p149l.sw6;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAllPairItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConversationAllPairItemView f24638a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24639b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f24640c;

    /* JADX INFO: renamed from: d */
    public VImage f24641d;

    /* JADX INFO: renamed from: e */
    public VImage f24642e;

    /* JADX INFO: renamed from: f */
    public VText f24643f;

    /* JADX INFO: renamed from: g */
    public User f24644g;

    /* JADX INFO: renamed from: h */
    public Conversation f24645h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$a */
    public static class C8106a {
        /* JADX INFO: renamed from: b */
        public static void m40626b(ConversationAllPairItemView conversationAllPairItemView, View view) {
            conversationAllPairItemView.f24638a = (ConversationAllPairItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationAllPairItemView.f24639b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationAllPairItemView.f24640c = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationAllPairItemView.f24641d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationAllPairItemView.f24642e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            conversationAllPairItemView.f24643f = (VText) viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$b */
    public class ViewOnClickListenerC8107b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f24646a;

        /* JADX INFO: renamed from: b */
        public final int f24647b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C8115c f24648c;

        public ViewOnClickListenerC8107b(Conversation conversation, int i, ConversationHeadRecommendLayout.C8115c c8115c) {
            this.f24646a = conversation;
            this.f24647b = i;
            this.f24648c = c8115c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(ConversationAllPairItemView.this.f24644g)) {
                o6j0.m162859c("e_current_online_photo", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("moments_user_id", ConversationAllPairItemView.this.f24644g.f56011id), o6j0.C18854a.m162876f("profile_photo_number", this.f24647b), o6j0.C18854a.m162878h("chat_recommend_reason", ConversationAllPairItemView.this.m40605O(this.f24648c)), o6j0.C18854a.m162878h("recommend_photo_distance", ConversationAllPairItemView.this.f24644g.location.distance + ""), o6j0.C18854a.m162876f("is_close_friend", this.f24648c.f24795v), o6j0.C18854a.m162878h("is_female_new_recommend", this.f24648c.f24774a == 21 ? "1" : "0"), o6j0.C18854a.m162878h("user_active_time", mqi0.m155932G(ConversationAllPairItemView.this.f24644g.location.updatedTime)));
            }
            if (!TextUtils.isEmpty(this.f24648c.f24773C)) {
                j2e0.m139446m(ConversationAllPairItemView.this.m40615N(), Uri.parse(this.f24648c.f24773C));
                return;
            }
            ConversationHeadRecommendLayout.C8115c c8115c = this.f24648c;
            if (!c8115c.f24779f) {
                if (NullChecker.m81303a(this.f24646a)) {
                    ConversationAllPairItemView.this.m40615N().startActivity(MessagesAct.m48944k2(ConversationAllPairItemView.this.m40615N(), this.f24646a.f56011id, false, false, 27));
                }
            } else {
                if ("onLive".equals(c8115c.f24783j) || "onMultiCall".equals(this.f24648c.f24783j)) {
                    CoreModule.m29936Q().startAudienceLive(ConversationAllPairItemView.this.m40615N(), this.f24648c.f24780g, "conversation", null);
                    zvf0.m220399u("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", this.f24648c.f24780g), vwb.m200311Y("anchorId", this.f24648c.f24777d), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f24648c.f24781h)), vwb.m200311Y("show_label", ""), vwb.m200311Y("live_room_live_type", ConversationAllPairItemView.this.m40606P(this.f24648c)), vwb.m200311Y("module", "new_match"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "NA"));
                    return;
                }
                bkn0 bkn0VarMo67229M6 = CoreModule.m29936Q().mo67229M6();
                PutongAct putongActM40615N = ConversationAllPairItemView.this.m40615N();
                ConversationHeadRecommendLayout.C8115c c8115c2 = this.f24648c;
                bkn0VarMo67229M6.mo102431p(putongActM40615N, c8115c2.f24780g, "conversation", c8115c2.f24777d, null);
                zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", this.f24648c.f24778e), vwb.m200311Y("liveId", this.f24648c.f24780g), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f24648c.f24781h)), vwb.m200311Y("profile_user_id", this.f24648c.f24777d), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("audio_card_type", "message_new_match"), vwb.m200311Y("topic_id", this.f24648c.f24784k));
            }
        }
    }

    public ConversationAllPairItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public String m40605O(ConversationHeadRecommendLayout.C8115c c8115c) {
        return !TextUtils.isEmpty(c8115c.f24775b) ? c8115c.f24775b : Active.TYPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public String m40606P(ConversationHeadRecommendLayout.C8115c c8115c) {
        return CoreModule.m29936Q().mo67214Dr(c8115c.m40798a());
    }

    /* JADX INFO: renamed from: a0 */
    private void m40607a0(ConversationHeadRecommendLayout.C8115c c8115c) {
        xdl0.m208344M(this.f24640c, true);
        xdl0.m208344M(this.f24639b, false);
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(this.f24644g.m60124fp().profileSmall().base).m8607O(new nvc0(this.f24640c.getAvatarSize(), this.f24640c.getAvatarSize())).m8614a();
        boolean zEquals = "onVoice".equals(c8115c.f24783j);
        this.f24640c.m41669e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        bkb0 bkb0Var = qib0.f154691G;
        LiveHaloAvatar liveHaloAvatar = this.f24640c;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.m102318F(imageRequestM8614a, new f56(liveHaloAvatar));
        if (zEquals) {
            zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", c8115c.f24778e), vwb.m200311Y("liveId", c8115c.f24780g), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8115c.f24781h)), vwb.m200311Y("profile_user_id", c8115c.f24777d), vwb.m200311Y("audio_card_type", "message_new_match"), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("topic_id", c8115c.f24784k));
        } else {
            zvf0.m220368A("e_live_room_enter", OMSDialogPositon.p_messages_view, vwb.m200311Y("liveId", c8115c.f24780g), vwb.m200311Y("anchorId", c8115c.f24777d), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8115c.f24781h)), vwb.m200311Y("show_label", ""), vwb.m200311Y("module", "new_match"), vwb.m200311Y("live_room_live_type", m40606P(c8115c)), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "NA"));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m40614M(View view) {
        C8106a.m40626b(this, view);
    }

    /* JADX INFO: renamed from: N */
    public PutongAct m40615N() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C22306c<j760<Integer, Boolean>> m40621W(Conversation conversation) {
        return C22306c.just(new j760(-1, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: R */
    public final String m40617R(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (c8115c.f24779f) {
            return c8115c.f24782i;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f24644g.f56011id);
        return NullChecker.m81303a(conversationM32856Xe) ? mqi0.m155932G(conversationM32856Xe.latestTime) : this.f24644g.name;
    }

    /* JADX INFO: renamed from: S */
    public Picture.ImageUri m40618S(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m40619T(User user) {
        this.f24644g = user;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m40620V(Conversation conversation) {
        this.f24645h = conversation;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m40622X(ConversationHeadRecommendLayout.C8115c c8115c, j760 j760Var) {
        if (c8115c.f24779f) {
            m40607a0(c8115c);
        } else {
            xdl0.m208344M(this.f24640c, false);
            xdl0.m208344M(this.f24639b, true);
            if (this.f24644g.isBannedNew() || this.f24644g.isAccountCancellation()) {
                qib0.f154691G.m102354Y0(this.f24639b, x2c0.f190189h0);
            } else {
                qib0.f154691G.m102341Q0(this.f24639b, m40618S(this.f24644g));
            }
        }
        if (!CoreModule.f17545c.f19588N0.m31966j3(this.f24644g) || c8115c.f24779f) {
            xdl0.m208344M(this.f24642e, false);
        } else {
            xdl0.m208344M(this.f24642e, true);
        }
        if (!NullChecker.m81303a(this.f24645h) || this.f24645h.read.booleanValue() || this.f24645h.localHasMessage || this.f24642e.getVisibility() == 0 || c8115c.f24779f) {
            xdl0.m208344M(this.f24641d, false);
        } else {
            xdl0.m208344M(this.f24641d, true);
        }
        this.f24643f.setBackgroundResource(0);
        this.f24643f.setText(m40617R(c8115c));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m40623Y(int i, ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        new ViewOnClickListenerC8107b(this.f24645h, i, c8115c).onClick(view);
    }

    /* JADX INFO: renamed from: Z */
    public void m40624Z(ConversationHeadRecommendLayout.C8114b c8114b, final ConversationHeadRecommendLayout.C8115c c8115c, final int i) {
        c8114b.mo67374c(m40615N(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24777d).doOnNext(new e30() { // from class: l.a56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67632a.m40619T((User) obj);
            }
        }), CoreModule.f17553k.f91950m.uiGet(c8115c.f24777d).doOnNext(new e30() { // from class: l.b56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73442a.m40620V((Conversation) obj);
            }
        }).switchMap(new w9j() { // from class: l.c56
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79339a.m40621W((Conversation) obj);
            }
        }), new hae0())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.d56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84376a.m40622X(c8115c, (j760) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.e56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89349a.m40623Y(i, c8115c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40614M(this);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
