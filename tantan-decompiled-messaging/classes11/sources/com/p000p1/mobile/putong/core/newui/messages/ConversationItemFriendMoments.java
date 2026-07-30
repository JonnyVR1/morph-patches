package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.b1c;
import l.e30;
import l.j760;
import l.m86;
import l.mkd0;
import l.upa;
import l.vwb;
import l.wp1;
import l.x2c0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import p009l.e86;
import p009l.mqi0;
import p009l.pi6;
import p009l.rd6;
import rx.c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemFriendMoments extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f3586a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3587b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f3588c;

    /* JADX INFO: renamed from: d */
    public View f3589d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f3590e;

    /* JADX INFO: renamed from: f */
    public VText f3591f;

    /* JADX INFO: renamed from: g */
    public VText f3592g;

    /* JADX INFO: renamed from: h */
    public TextView f3593h;

    public ConversationItemFriendMoments(Context context) {
        super(context);
    }

    public static String getTA() {
        User userNa = CoreModule.c.e0.na();
        Settings settings = userNa.settings;
        if (settings == null) {
            return "女性";
        }
        if (TEnum.equals(settings.getLookingFor(), "male")) {
            return "男性";
        }
        return TEnum.equals(userNa.settings.getLookingFor(), "female") ? "女性" : "用户";
    }

    /* JADX INFO: renamed from: g */
    public final void m4910g(View view) {
        m86.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final Act m4911h() {
        return getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4912i(Conversation conversation, View view) {
        zvf0.u("e_choose", "p_messages_view", new j760[]{vwb.Y("title_information", conversation.localExtraInfo)});
        getContext().startActivity(OOFMkWebViewAct.m5906m2(getContext()));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4913j(xaj0 xaj0Var) {
        final Conversation conversation = (Conversation) xaj0Var.a;
        User user = (User) xaj0Var.b;
        if (((User) xaj0Var.c).isBannedNew()) {
            CoreModule.c.f0.re("fake_conversation_oof_enter");
            return;
        }
        this.f3593h.setText(mqi0.m18538G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f3588c;
        if (user == null) {
            xdl0.M(friendsMomentAvatarView, false);
            xdl0.M(this.f3589d, false);
            this.f3592g.setText("下一轮请明天再来");
        } else {
            xdl0.M(friendsMomentAvatarView, true);
            xdl0.M(this.f3589d, true);
            this.f3588c.m6064c(user, null);
            VText vText = this.f3592g;
            String str = conversation.localExtraInfo;
            if (str == null) {
                str = "";
            }
            vText.setText(str);
        }
        zvf0.A("e_choose", "p_messages_view", new j760[]{vwb.Y("title_information", conversation.localExtraInfo)});
        xdl0.E0(this, new View.OnClickListener() { // from class: l.k86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15475a.m4912i(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4914k(View view) {
        zvf0.r("e_choose_receive_pick", "p_messages_view");
        getContext().startActivity(OOFPickMkWebViewAct.m5912m2(getContext()));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4915l(j760 j760Var) {
        Conversation conversation = (Conversation) j760Var.a;
        User user = (User) j760Var.b;
        this.f3593h.setText(mqi0.m18538G(conversation.latestTime));
        xdl0.M(this.f3588c, true);
        xdl0.M(this.f3589d, true);
        this.f3588c.m6064c(user, null);
        VText vText = this.f3592g;
        String str = conversation.localExtraInfo;
        if (str == null) {
            str = "";
        }
        vText.setText(str);
        zvf0.x("e_choose_receive_pick", "p_messages_view");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m4916m(View view) {
        zvf0.r("e_selected_entrance", "p_messages_view");
        CoreModule.c.q2.R.put(0);
        m4911h().startActivity(b1c.i(m4911h(), "message_entrance"));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m4917n(xaj0 xaj0Var) {
        Conversation conversation = (Conversation) xaj0Var.a;
        User user = (User) xaj0Var.b;
        if (((User) xaj0Var.c).isBannedNew()) {
            CoreModule.c.f0.re("fake_conversation_profile_featured");
            return;
        }
        this.f3593h.setText(mqi0.m18538G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f3588c;
        if (user == null) {
            xdl0.M(friendsMomentAvatarView, false);
            xdl0.M(this.f3589d, false);
        } else {
            xdl0.M(friendsMomentAvatarView, true);
            xdl0.M(this.f3589d, true);
            this.f3588c.m6064c(user, null);
        }
        zvf0.x("e_selected_entrance", "p_messages_view");
        xdl0.E0(this, new View.OnClickListener() { // from class: l.l86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15985a.m4916m(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m4918o(wp1<Conversation> wp1Var, String str) {
        boolean z = upa.z();
        VImage vImage = this.f3586a;
        if (z) {
            vImage.setImageResource(x2c0.W5);
        } else {
            vImage.setImageResource(x2c0.V5);
        }
        this.f3591f.setTypeface(Typeface.defaultFromStyle(1));
        this.f3591f.setText(upa.o3().chooseEntrenceName);
        this.f3592g.setText("");
        wp1Var.c(m4911h(), mkd0.s(CoreModule.c.f0.Ne("fake_conversation_oof_enter"), TextUtils.isEmpty(str) ? c.just((Object) null) : CoreModule.c.e0.Ma(str), CoreModule.c.e0.o9(), new e86())).subscribe(mkd0.G(new e30() { // from class: l.f86
            public final void call(Object obj) {
                this.f12860a.m4913j((xaj0) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4910g(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(pi6.f18601Q, this.f3586a);
            rd6.m21518k0(this.f3591f, this.f3593h);
            rd6.m21514e0(this.f3592g);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m4919p(wp1<Conversation> wp1Var, String str) {
        this.f3591f.setTypeface(Typeface.defaultFromStyle(1));
        boolean z = upa.z();
        VImage vImage = this.f3586a;
        if (z) {
            vImage.setImageResource(x2c0.W5);
        } else {
            vImage.setImageResource(x2c0.V5);
        }
        this.f3591f.setText("收到的Pick");
        this.f3592g.setText("");
        xdl0.E0(this, new View.OnClickListener() { // from class: l.h86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13902a.m4914k(view);
            }
        });
        wp1Var.c(m4911h(), mkd0.r(CoreModule.c.f0.Ne("fake_conversation_oof_pick"), CoreModule.c.e0.Ka(str), new x9j() { // from class: l.i86
            public final Object call(Object obj, Object obj2) {
                return j760.a((Conversation) obj, (User) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.j86
            public final void call(Object obj) {
                this.f14985a.m4915l((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m4920q(wp1<Conversation> wp1Var, String str) {
        boolean z = upa.z();
        VImage vImage = this.f3586a;
        if (z) {
            vImage.setImageResource(x2c0.Vl);
        } else {
            vImage.setImageResource(x2c0.Ul);
        }
        this.f3591f.setTypeface(Typeface.defaultFromStyle(1));
        String str2 = "来看看今日为你推荐的优质" + getTA() + "！";
        this.f3591f.setText("每日精选");
        this.f3592g.setText(str2);
        wp1Var.c(m4911h(), mkd0.s(CoreModule.c.f0.Ne("fake_conversation_profile_featured"), TextUtils.isEmpty(str) ? c.just((Object) null) : CoreModule.c.e0.Ma(str), CoreModule.c.e0.o9(), new e86())).subscribe(mkd0.G(new e30() { // from class: l.g86
            public final void call(Object obj) {
                this.f13368a.m4917n((xaj0) obj);
            }
        }));
    }

    public ConversationItemFriendMoments(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemFriendMoments(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
