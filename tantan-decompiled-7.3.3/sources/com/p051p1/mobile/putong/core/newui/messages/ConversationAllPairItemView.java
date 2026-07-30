package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.fsb0;
import p153l.ftn0;
import p153l.i4g0;
import p153l.jyb;
import p153l.k66;
import p153l.mie0;
import p153l.nae0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q3d0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.vx6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAllPairItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConversationAllPairItemView f25380a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25381b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f25382c;

    /* JADX INFO: renamed from: d */
    public VImage f25383d;

    /* JADX INFO: renamed from: e */
    public VImage f25384e;

    /* JADX INFO: renamed from: f */
    public VText f25385f;

    /* JADX INFO: renamed from: g */
    public User f25386g;

    /* JADX INFO: renamed from: h */
    public Conversation f25387h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$a */
    public static class C8257a {
        /* JADX INFO: renamed from: b */
        public static void m41637b(ConversationAllPairItemView conversationAllPairItemView, View view) {
            conversationAllPairItemView.f25380a = (ConversationAllPairItemView) view;
            ViewGroup viewGroup = (ViewGroup) view;
            conversationAllPairItemView.f25381b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationAllPairItemView.f25382c = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationAllPairItemView.f25383d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationAllPairItemView.f25384e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            conversationAllPairItemView.f25385f = (VText) viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationAllPairItemView$b */
    public class ViewOnClickListenerC8258b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f25388a;

        /* JADX INFO: renamed from: b */
        public final int f25389b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C8266c f25390c;

        public ViewOnClickListenerC8258b(Conversation conversation, int i, ConversationHeadRecommendLayout.C8266c c8266c) {
            this.f25388a = conversation;
            this.f25389b = i;
            this.f25390c = c8266c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(ConversationAllPairItemView.this.f25386g)) {
                sfj0.m185596c("e_current_online_photo", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("moments_user_id", ConversationAllPairItemView.this.f25386g.f56859id), sfj0.C20032a.m185613f("profile_photo_number", this.f25389b), sfj0.C20032a.m185615h("chat_recommend_reason", ConversationAllPairItemView.this.m41616O(this.f25390c)), sfj0.C20032a.m185615h("recommend_photo_distance", ConversationAllPairItemView.this.f25386g.location.distance + ""), sfj0.C20032a.m185613f("is_close_friend", this.f25390c.f25537v), sfj0.C20032a.m185615h("is_female_new_recommend", this.f25390c.f25516a == 21 ? "1" : "0"), sfj0.C20032a.m185615h("user_active_time", pzi0.m174442G(ConversationAllPairItemView.this.f25386g.location.updatedTime)));
            }
            if (!TextUtils.isEmpty(this.f25390c.f25515C)) {
                nae0.m162083m(ConversationAllPairItemView.this.m41626N(), Uri.parse(this.f25390c.f25515C));
                return;
            }
            ConversationHeadRecommendLayout.C8266c c8266c = this.f25390c;
            if (!c8266c.f25521f) {
                if (NullChecker.m82486a(this.f25388a)) {
                    ConversationAllPairItemView.this.m41626N().startActivity(MessagesAct.m50127l2(ConversationAllPairItemView.this.m41626N(), this.f25388a.f56859id, false, false, 27));
                }
            } else {
                if ("onLive".equals(c8266c.f25525j) || "onMultiCall".equals(this.f25390c.f25525j)) {
                    CoreModule.m30934Q().startAudienceLive(ConversationAllPairItemView.this.m41626N(), this.f25390c.f25522g, "conversation", null);
                    i4g0.m138523u("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", this.f25390c.f25522g), jyb.m147494Y("anchorId", this.f25390c.f25519d), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f25390c.f25523h)), jyb.m147494Y("show_label", ""), jyb.m147494Y("live_room_live_type", ConversationAllPairItemView.this.m41617P(this.f25390c)), jyb.m147494Y("module", "new_match"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "NA"));
                    return;
                }
                ftn0 ftn0VarMo68412M6 = CoreModule.m30934Q().mo68412M6();
                PutongAct putongActM41626N = ConversationAllPairItemView.this.m41626N();
                ConversationHeadRecommendLayout.C8266c c8266c2 = this.f25390c;
                ftn0VarMo68412M6.mo127345p(putongActM41626N, c8266c2.f25522g, "conversation", c8266c2.f25519d, null);
                i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", this.f25390c.f25520e), jyb.m147494Y("liveId", this.f25390c.f25522g), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f25390c.f25523h)), jyb.m147494Y("profile_user_id", this.f25390c.f25519d), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("audio_card_type", "message_new_match"), jyb.m147494Y("topic_id", this.f25390c.f25526k));
            }
        }
    }

    public ConversationAllPairItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public String m41616O(ConversationHeadRecommendLayout.C8266c c8266c) {
        return !TextUtils.isEmpty(c8266c.f25517b) ? c8266c.f25517b : Active.TYPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public String m41617P(ConversationHeadRecommendLayout.C8266c c8266c) {
        return CoreModule.m30934Q().mo68397Dr(c8266c.m41809a());
    }

    /* JADX INFO: renamed from: a0 */
    private void m41618a0(ConversationHeadRecommendLayout.C8266c c8266c) {
        bnl0.m105524M(this.f25382c, true);
        bnl0.m105524M(this.f25381b, false);
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(this.f25386g.m61308fp().profileSmall().base).m8661O(new q3d0(this.f25382c.getAvatarSize(), this.f25382c.getAvatarSize())).m8668a();
        boolean zEquals = "onVoice".equals(c8266c.f25525j);
        this.f25382c.m42680e(zEquals ? -2721025 : -38485, zEquals ? -5735169 : -41238);
        fsb0 fsb0Var = uqb0.f180374G;
        LiveHaloAvatar liveHaloAvatar = this.f25382c;
        Objects.requireNonNull(liveHaloAvatar);
        fsb0Var.m127102F(imageRequestM8668a, new k66(liveHaloAvatar));
        if (zEquals) {
            i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", c8266c.f25520e), jyb.m147494Y("liveId", c8266c.f25522g), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8266c.f25523h)), jyb.m147494Y("profile_user_id", c8266c.f25519d), jyb.m147494Y("audio_card_type", "message_new_match"), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("topic_id", c8266c.f25526k));
        } else {
            i4g0.m138492A("e_live_room_enter", OMSDialogPositon.p_messages_view, jyb.m147494Y("liveId", c8266c.f25522g), jyb.m147494Y("anchorId", c8266c.f25519d), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(c8266c.f25523h)), jyb.m147494Y("show_label", ""), jyb.m147494Y("module", "new_match"), jyb.m147494Y("live_room_live_type", m41617P(c8266c)), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "NA"));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m41625M(View view) {
        C8257a.m41637b(this, view);
    }

    /* JADX INFO: renamed from: N */
    public PutongAct m41626N() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C22421c<pf60<Integer, Boolean>> m41632W(Conversation conversation) {
        return C22421c.just(new pf60(-1, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: R */
    public final String m41628R(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (c8266c.f25521f) {
            return c8266c.f25524i;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f25386g.f56859id);
        return NullChecker.m82486a(conversationM33859Xe) ? pzi0.m174442G(conversationM33859Xe.latestTime) : this.f25386g.name;
    }

    /* JADX INFO: renamed from: S */
    public Picture.ImageUri m41629S(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m41630T(User user) {
        this.f25386g = user;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m41631V(Conversation conversation) {
        this.f25387h = conversation;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m41633X(ConversationHeadRecommendLayout.C8266c c8266c, pf60 pf60Var) {
        if (c8266c.f25521f) {
            m41618a0(c8266c);
        } else {
            bnl0.m105524M(this.f25382c, false);
            bnl0.m105524M(this.f25381b, true);
            if (this.f25386g.isBannedNew() || this.f25386g.isAccountCancellation()) {
                uqb0.f180374G.m127138Y0(this.f25381b, dbc0.f87072i0);
            } else {
                uqb0.f180374G.m127125Q0(this.f25381b, m41629S(this.f25386g));
            }
        }
        if (!CoreModule.f18264c.f20330N0.m32969j3(this.f25386g) || c8266c.f25521f) {
            bnl0.m105524M(this.f25384e, false);
        } else {
            bnl0.m105524M(this.f25384e, true);
        }
        if (!NullChecker.m82486a(this.f25387h) || this.f25387h.read.booleanValue() || this.f25387h.localHasMessage || this.f25384e.getVisibility() == 0 || c8266c.f25521f) {
            bnl0.m105524M(this.f25383d, false);
        } else {
            bnl0.m105524M(this.f25383d, true);
        }
        this.f25385f.setBackgroundResource(0);
        this.f25385f.setText(m41628R(c8266c));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m41634Y(int i, ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        new ViewOnClickListenerC8258b(this.f25387h, i, c8266c).onClick(view);
    }

    /* JADX INFO: renamed from: Z */
    public void m41635Z(ConversationHeadRecommendLayout.C8265b c8265b, final ConversationHeadRecommendLayout.C8266c c8266c, final int i) {
        c8265b.mo68557c(m41626N(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25519d).doOnNext(new y20() { // from class: l.f66
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97377a.m41630T((User) obj);
            }
        }), CoreModule.f18272k.f115545m.uiGet(c8266c.f25519d).doOnNext(new y20() { // from class: l.g66
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102382a.m41631V((Conversation) obj);
            }
        }).switchMap(new qcj() { // from class: l.h66
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108004a.m41632W((Conversation) obj);
            }
        }), new mie0())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.i66
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113144a.m41633X(c8266c, (pf60) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.j66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118525a.m41634Y(i, c8266c, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41625M(this);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAllPairItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
