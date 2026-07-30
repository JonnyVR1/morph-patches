package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c40;
import l.e30;
import l.eqh0;
import l.f6c0;
import l.j2e0;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.roj0;
import l.sw6;
import l.u4c0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.bkn0;
import p009l.lz4;
import p009l.mqi0;
import p009l.o7r;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class BaseConversationRecommendItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public User f3392a;

    /* JADX INFO: renamed from: b */
    public Conversation f3393b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f3394c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$a */
    public static class ViewOnLongClickListenerC0268a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final User f3395a;

        /* JADX INFO: renamed from: b */
        public final Context f3396b;

        /* JADX INFO: renamed from: c */
        public final j760<Integer, Boolean> f3397c;

        /* JADX INFO: renamed from: d */
        public final Conversation f3398d;

        /* JADX INFO: renamed from: e */
        public final ConversationHeadRecommendLayout.C0278b f3399e;

        public ViewOnLongClickListenerC0268a(ConversationHeadRecommendLayout.C0278b c0278b, Context context, j760<Integer, Boolean> j760Var, Conversation conversation, User user) {
            this.f3395a = user;
            this.f3396b = context;
            this.f3397c = j760Var;
            this.f3398d = conversation;
            this.f3399e = c0278b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4676a(Throwable th) {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m4680e(roj0 roj0Var) {
            this.f3399e.m4885O(((DbObject) this.f3395a).id, false);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m4681f(String str, String str2, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
            String string = aVar.a.toString();
            if (TextUtils.equals(string, str)) {
                ConversationHeadRecommendLayout.C0278b c0278b = this.f3399e;
                c0278b.c(c0278b.m4881K(), CoreModule.c.f0.op(((DbObject) this.f3395a).id)).subscribe(mkd0.H(new e30() { // from class: l.pi2
                    public final void call(Object obj) {
                        this.f18597a.m4680e((roj0) obj);
                    }
                }, new e30() { // from class: l.qi2
                    public final void call(Object obj) {
                        BaseConversationRecommendItemView.ViewOnLongClickListenerC0268a.m4676a((Throwable) obj);
                    }
                }));
                zvf0.r("e_hide_chat_rec", "p_messages_view");
            } else if (TextUtils.equals(string, str2)) {
                if (NullChecker.a(this.f3398d) && this.f3398d.isAnonymous()) {
                    CoreModule.K().Hp(this.f3396b, ((DbObject) this.f3395a).id);
                } else {
                    boolean zA = NullChecker.a(this.f3398d);
                    Context context = this.f3396b;
                    if (zA) {
                        context.startActivity(ProfileAct.n2(context, ((DbObject) this.f3395a).id, "conversation_view", false));
                    } else {
                        context.startActivity(ProfileAct.n2(context, ((DbObject) this.f3395a).id, "from_recommend_like", false));
                    }
                }
                zvf0.r("e_check_profile", "p_messages_view");
            }
            c40VarArr[0].b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VLinear vLinearFindViewById;
            if (this.f3395a == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            final String string = this.f3396b.getString(R.string.ah);
            final String string2 = this.f3396b.getString(R.string.Ig);
            arrayList.add(string);
            arrayList.add(string2);
            c40.b bVar = new c40.b(this.f3396b);
            bVar.I(this.f3396b.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.ni2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c40VarArr[0].b();
                }
            }).Q(arrayList).P(eqh0.c(3)).V(new c40.d() { // from class: l.oi2
                /* JADX INFO: renamed from: a */
                public final void m19797a(VListCell vListCell, VListCell.a aVar, int i) {
                    this.f18057a.m4681f(string, string2, c40VarArr, vListCell, aVar, i);
                }
            });
            c40 c40VarF = bVar.F();
            final c40[] c40VarArr = {c40VarF};
            c40VarF.f();
            View viewC = c40VarArr[0].c();
            if (viewC == null || (vLinearFindViewById = viewC.findViewById(u4c0.b5)) == null) {
                return true;
            }
            vLinearFindViewById.removeAllViews();
            xdl0.M(vLinearFindViewById, true);
            o7r.m19649a(this.f3396b).inflate(f6c0.Ib, (ViewGroup) vLinearFindViewById, true);
            vLinearFindViewById.setPadding(0, 0, 0, 0);
            VDraweeView vDraweeViewFindViewById = vLinearFindViewById.findViewById(u4c0.L5);
            if (NullChecker.a(this.f3398d) && this.f3398d.isAnonymous()) {
                qib0.G.L0(vDraweeViewFindViewById, this.f3395a.getAnonymousUrl());
            } else {
                qib0.G.Q0(vDraweeViewFindViewById, BaseConversationRecommendItemView.m4664B(this.f3395a));
            }
            if (this.f3395a.isBannedNew() || this.f3395a.isAccountCancellation()) {
                qib0.G.Y0(vDraweeViewFindViewById, x2c0.h0);
            }
            zvf0.x("e_hide_chat_rec", "p_messages_view");
            zvf0.x("e_check_profile", "p_messages_view");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationRecommendItemView$b */
    public class ViewOnClickListenerC0269b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Conversation f3400a;

        /* JADX INFO: renamed from: b */
        public final ConversationHeadRecommendLayout.C0278b f3401b;

        /* JADX INFO: renamed from: c */
        public final ConversationHeadRecommendLayout.C0279c f3402c;

        public ViewOnClickListenerC0269b(Conversation conversation, ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c) {
            this.f3400a = conversation;
            this.f3401b = c0278b;
            this.f3402c = c0279c;
        }

        /* JADX INFO: renamed from: a */
        public final void m4682a(View view) {
            if (NullChecker.a(BaseConversationRecommendItemView.this.f3392a)) {
                o6j0.c("e_current_online_photo", "p_messages_view", new o6j0.a[]{o6j0.a.h("moments_user_id", ((DbObject) BaseConversationRecommendItemView.this.f3392a).id), o6j0.a.f("profile_photo_number", BaseConversationRecommendItemView.this.m4674w(this.f3401b, this.f3402c)), o6j0.a.h("chat_recommend_reason", BaseConversationRecommendItemView.this.mo4672u(this.f3402c)), o6j0.a.h("recommend_photo_distance", BaseConversationRecommendItemView.this.f3392a.location.distance + ""), o6j0.a.f("is_close_friend", this.f3402c.f3573v), o6j0.a.h("is_female_new_recommend", this.f3402c.f3552a == 21 ? "1" : "0"), o6j0.a.h("user_active_time", mqi0.m18538G(BaseConversationRecommendItemView.this.f3392a.location.updatedTime))});
            }
            ConversationHeadRecommendLayout.C0279c c0279c = this.f3402c;
            if (c0279c.f3552a == 21) {
                BaseConversationRecommendItemView.this.m4670p().startActivity(OOFMkWebViewAct.m5906m2(BaseConversationRecommendItemView.this.getContext()));
                return;
            }
            if (!TextUtils.isEmpty(c0279c.f3551C)) {
                j2e0.m(BaseConversationRecommendItemView.this.m4670p(), Uri.parse(this.f3402c.f3551C));
                return;
            }
            ConversationHeadRecommendLayout.C0279c c0279c2 = this.f3402c;
            if (!c0279c2.f3557f) {
                if (NullChecker.a(this.f3400a)) {
                    Intent intentK2 = MessagesAct.k2(BaseConversationRecommendItemView.this.m4670p(), ((DbObject) this.f3400a).id, false, false, 27);
                    if (upa.C1() && !this.f3400a.localEverHasMessage) {
                        lz4.m18100h().m18103d(((DbObject) this.f3400a).id);
                        MessagesAct.s2(intentK2, "one_new_match");
                    }
                    BaseConversationRecommendItemView.this.m4670p().startActivity(intentK2);
                    return;
                }
                return;
            }
            if ("onLive".equals(c0279c2.f3561j) || "onMultiCall".equals(this.f3402c.f3561j)) {
                CoreModule.Q().startAudienceLive(BaseConversationRecommendItemView.this.m4670p(), this.f3402c.f3558g, "conversation", null);
                zvf0.u("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", this.f3402c.f3558g), vwb.Y("anchorId", this.f3402c.f3555d), vwb.Y("index", Integer.valueOf(this.f3402c.f3559h)), vwb.Y("show_label", ""), vwb.Y("live_room_live_type", BaseConversationRecommendItemView.this.m4673v(this.f3402c)), vwb.Y("module", "new_match"), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "basic")});
                return;
            }
            bkn0 bkn0VarM9019M6 = CoreModule.Q().m9019M6();
            PutongAct putongActM4670p = BaseConversationRecommendItemView.this.m4670p();
            ConversationHeadRecommendLayout.C0279c c0279c3 = this.f3402c;
            bkn0VarM9019M6.m12097p(putongActM4670p, c0279c3.f3558g, "conversation", c0279c3.f3555d, null);
            zvf0.u("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", this.f3402c.f3556e), vwb.Y("liveId", this.f3402c.f3558g), vwb.Y("index", Integer.valueOf(this.f3402c.f3559h)), vwb.Y("profile_user_id", this.f3402c.f3555d), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("audio_card_type", "message_new_match"), vwb.Y("topic_id", this.f3402c.f3562k)});
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m4682a(view);
            BaseConversationRecommendItemView.this.mo4666E(this.f3402c);
        }
    }

    public BaseConversationRecommendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static Picture.ImageUri m4664B(User user) {
        return sw6.b(user).profileSmall();
    }

    /* JADX INFO: renamed from: C */
    public boolean m4665C() {
        User user = this.f3392a;
        return user == null || user.isJailed() || this.f3392a.isBanedOrInactivated() || m4671s();
    }

    /* JADX INFO: renamed from: E */
    public void mo4666E(ConversationHeadRecommendLayout.C0279c c0279c) {
    }

    /* JADX INFO: renamed from: F */
    public void mo4667F() {
    }

    /* JADX INFO: renamed from: G */
    public void m4668G(ConversationHeadRecommendLayout.C0279c c0279c, boolean z) {
        if (z) {
            zvf0.A("e_live_audio_room_enter", "p_messages_view", new j760[]{vwb.Y("anchorId", c0279c.f3556e), vwb.Y("liveId", c0279c.f3558g), vwb.Y("index", Integer.valueOf(c0279c.f3559h)), vwb.Y("profile_user_id", c0279c.f3555d), vwb.Y("audio_card_type", "message_new_match"), vwb.Y("audio_room_type", "normal_audio"), vwb.Y("audio_tab_id", "NA"), vwb.Y("topic_id", c0279c.f3562k)});
        } else {
            zvf0.A("e_live_room_enter", "p_messages_view", new j760[]{vwb.Y("liveId", c0279c.f3558g), vwb.Y("anchorId", c0279c.f3555d), vwb.Y("index", Integer.valueOf(c0279c.f3559h)), vwb.Y("show_label", ""), vwb.Y("module", "new_match"), vwb.Y("live_room_live_type", m4673v(c0279c)), vwb.Y("trace_id", ""), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "basic")});
        }
    }

    /* JADX INFO: renamed from: K */
    public void m4669K(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c, boolean z) {
        if (c0279c == null || c0278b == null || c0278b.f3543d.contains(c0279c.f3555d)) {
            return;
        }
        c0278b.f3543d.add(c0279c.f3555d);
        o6j0.h("e_current_online_photo", "p_messages_view", new o6j0.a[]{o6j0.a.h("moments_user_id", c0279c.f3555d), o6j0.a.f("profile_photo_number", m4674w(c0278b, c0279c)), o6j0.a.h("chat_recommend_reason", mo4672u(c0279c)), o6j0.a.h("recommend_photo_distance", this.f3392a.location.distance + ""), o6j0.a.h("equipment_type", z ? "audio_avatar_frame" : ""), o6j0.a.h("is_female_new_recommend", c0279c.f3552a == 21 ? "1" : "0"), o6j0.a.f("is_close_friend", c0279c.f3573v), o6j0.a.h("user_active_time", mqi0.m18538G(this.f3392a.location.updatedTime))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public PutongAct m4670p() {
        return getContext();
    }

    /* JADX INFO: renamed from: s */
    public boolean m4671s() {
        if (NullChecker.a(this.f3393b)) {
            return TEnum.equals(this.f3393b.status, "dismissed") || TEnum.equals(this.f3393b.status, "local_fake") || TEnum.equals(this.f3393b.status, "blocked") || TEnum.equals(this.f3393b.status, "removed") || TEnum.equals(this.f3393b.status, "invisible") || TEnum.equals(this.f3393b.status, "deleted");
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public String mo4672u(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (!TextUtils.isEmpty(c0279c.f3553b)) {
            return c0279c.f3553b;
        }
        int i = c0279c.f3552a;
        if (i == 3) {
            return "active";
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
    public String m4673v(ConversationHeadRecommendLayout.C0279c c0279c) {
        return CoreModule.Q().m9004Dr(c0279c.m4896a());
    }

    /* JADX INFO: renamed from: w */
    public int m4674w(ConversationHeadRecommendLayout.C0278b c0278b, ConversationHeadRecommendLayout.C0279c c0279c) {
        List<ConversationHeadRecommendLayout.C0279c> listM4882L = c0278b.m4882L();
        if (vwb.J(listM4882L) || c0279c == null) {
            return -1;
        }
        int iIndexOf = listM4882L.indexOf(c0279c);
        ConversationHeadRecommendLayout.C0279c c0279c2 = ConversationHeadRecommendLayout.f3517x;
        return (c0279c2 == null || !listM4882L.contains(c0279c2)) ? iIndexOf : iIndexOf - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public String m4675z(ConversationHeadRecommendLayout.C0279c c0279c, Conversation conversation) {
        if (c0279c.f3557f) {
            return c0279c.f3560i;
        }
        if (!TextUtils.isEmpty(c0279c.f3553b)) {
            return c0279c.f3553b;
        }
        if (upa.k2() && NullChecker.a(conversation) && !TEnum.equals(conversation.status, "blocked") && NullChecker.a(this.f3392a) && mqi0.m18550o() - this.f3392a.location.updatedTime < 300000.0d) {
            return "当前在线";
        }
        int i = c0279c.f3552a;
        if (i == 3) {
            return mqi0.m18538G(this.f3392a.location.updatedTime);
        }
        if (i == 4) {
            return getResources().getString(R.string.i1);
        }
        if (i != 5) {
            if (i != 6) {
                return !TextUtils.isEmpty(c0279c.f3554c) ? c0279c.f3554c : this.f3392a.name;
            }
            return getResources().getString(R.string.e2);
        }
        int i2 = this.f3392a.location.distance;
        if (i2 < 1000) {
            return this.f3392a.location.distance + " m";
        }
        if (i2 > 5000) {
            return getResources().getString(R.string.ih);
        }
        return (this.f3392a.location.distance / 1000) + " km";
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseConversationRecommendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
