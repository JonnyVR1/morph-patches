package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p149l.b1c;
import p149l.e30;
import p149l.e86;
import p149l.i86;
import p149l.j760;
import p149l.m86;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pi6;
import p149l.rd6;
import p149l.upa;
import p149l.vwb;
import p149l.wp1;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemFriendMoments extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f24808a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f24809b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f24810c;

    /* JADX INFO: renamed from: d */
    public View f24811d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f24812e;

    /* JADX INFO: renamed from: f */
    public VText f24813f;

    /* JADX INFO: renamed from: g */
    public VText f24814g;

    /* JADX INFO: renamed from: h */
    public TextView f24815h;

    public ConversationItemFriendMoments(Context context) {
        super(context);
    }

    public static String getTA() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        Settings settings = userM169520na.settings;
        if (settings == null) {
            return "女性";
        }
        if (TEnum.equals(settings.getLookingFor(), "male")) {
            return "男性";
        }
        return TEnum.equals(userM169520na.settings.getLookingFor(), "female") ? "女性" : "用户";
    }

    /* JADX INFO: renamed from: g */
    public final void m40812g(View view) {
        m86.m153462a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final Act m40813h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40814i(Conversation conversation, View view) {
        zvf0.m220399u("e_choose", OMSDialogPositon.p_messages_view, vwb.m200311Y("title_information", conversation.localExtraInfo));
        getContext().startActivity(OOFMkWebViewAct.m41782m2(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m40815j(xaj0 xaj0Var) {
        final Conversation conversation = (Conversation) xaj0Var.f191751a;
        User user = (User) xaj0Var.f191752b;
        if (((User) xaj0Var.f191753c).isBannedNew()) {
            CoreModule.f17545c.f19642f0.m33186xl("fake_conversation_oof_enter");
            return;
        }
        this.f24815h.setText(mqi0.m155932G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f24810c;
        if (user == null) {
            xdl0.m208344M(friendsMomentAvatarView, false);
            xdl0.m208344M(this.f24811d, false);
            this.f24814g.setText("下一轮请明天再来");
        } else {
            xdl0.m208344M(friendsMomentAvatarView, true);
            xdl0.m208344M(this.f24811d, true);
            this.f24810c.m41922c(user, null);
            VText vText = this.f24814g;
            String str = conversation.localExtraInfo;
            if (str == null) {
                str = "";
            }
            vText.setText(str);
        }
        zvf0.m220368A("e_choose", OMSDialogPositon.p_messages_view, vwb.m200311Y("title_information", conversation.localExtraInfo));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.k86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121780a.m40814i(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m40816k(View view) {
        zvf0.m220396r("e_choose_receive_pick", OMSDialogPositon.p_messages_view);
        getContext().startActivity(OOFPickMkWebViewAct.m41788m2(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40817l(j760 j760Var) {
        Conversation conversation = (Conversation) j760Var.f116564a;
        User user = (User) j760Var.f116565b;
        this.f24815h.setText(mqi0.m155932G(conversation.latestTime));
        xdl0.m208344M(this.f24810c, true);
        xdl0.m208344M(this.f24811d, true);
        this.f24810c.m41922c(user, null);
        VText vText = this.f24814g;
        String str = conversation.localExtraInfo;
        if (str == null) {
            str = "";
        }
        vText.setText(str);
        zvf0.m220402x("e_choose_receive_pick", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m40818m(View view) {
        zvf0.m220396r("e_selected_entrance", OMSDialogPositon.p_messages_view);
        CoreModule.f17545c.f19677q2.f114437R.put(0);
        m40813h().startActivity(b1c.m99820i(m40813h(), "message_entrance"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m40819n(xaj0 xaj0Var) {
        Conversation conversation = (Conversation) xaj0Var.f191751a;
        User user = (User) xaj0Var.f191752b;
        if (((User) xaj0Var.f191753c).isBannedNew()) {
            CoreModule.f17545c.f19642f0.m33186xl("fake_conversation_profile_featured");
            return;
        }
        this.f24815h.setText(mqi0.m155932G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f24810c;
        if (user == null) {
            xdl0.m208344M(friendsMomentAvatarView, false);
            xdl0.m208344M(this.f24811d, false);
        } else {
            xdl0.m208344M(friendsMomentAvatarView, true);
            xdl0.m208344M(this.f24811d, true);
            this.f24810c.m41922c(user, null);
        }
        zvf0.m220402x("e_selected_entrance", OMSDialogPositon.p_messages_view);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.l86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126789a.m40818m(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m40820o(wp1<Conversation> wp1Var, String str) {
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f24808a;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f189847W5);
        } else {
            vImage.setImageResource(x2c0.f189816V5);
        }
        this.f24813f.setTypeface(Typeface.defaultFromStyle(1));
        this.f24813f.setText(upa.m194796o3().chooseEntrenceName);
        this.f24814g.setText("");
        wp1Var.mo67374c(m40813h(), mkd0.m154985s(CoreModule.f17545c.f19642f0.m32737Ne("fake_conversation_oof_enter"), TextUtils.isEmpty(str) ? C22306c.just(null) : CoreModule.f17545c.f19639e0.m169418Ma(str), CoreModule.f17545c.f19639e0.m169523o9(), new e86())).subscribe(mkd0.m154955G(new e30() { // from class: l.f86
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96320a.m40815j((xaj0) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40812g(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(pi6.f149080Q, this.f24808a);
            rd6.m178877k0(this.f24813f, this.f24815h);
            rd6.m178873e0(this.f24814g);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m40821p(wp1<Conversation> wp1Var, String str) {
        this.f24813f.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f24808a;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f189847W5);
        } else {
            vImage.setImageResource(x2c0.f189816V5);
        }
        this.f24813f.setText("收到的Pick");
        this.f24814g.setText("");
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.h86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106392a.m40816k(view);
            }
        });
        wp1Var.mo67374c(m40813h(), mkd0.m154984r(CoreModule.f17545c.f19642f0.m32737Ne("fake_conversation_oof_pick"), CoreModule.f17545c.f19639e0.m169410Ka(str), new i86())).subscribe(mkd0.m154955G(new e30() { // from class: l.j86
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116684a.m40817l((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m40822q(wp1<Conversation> wp1Var, String str) {
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f24808a;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f189832Vl);
        } else {
            vImage.setImageResource(x2c0.f189801Ul);
        }
        this.f24813f.setTypeface(Typeface.defaultFromStyle(1));
        String str2 = "来看看今日为你推荐的优质" + getTA() + "！";
        this.f24813f.setText("每日精选");
        this.f24814g.setText(str2);
        wp1Var.mo67374c(m40813h(), mkd0.m154985s(CoreModule.f17545c.f19642f0.m32737Ne("fake_conversation_profile_featured"), TextUtils.isEmpty(str) ? C22306c.just(null) : CoreModule.f17545c.f19639e0.m169418Ma(str), CoreModule.f17545c.f19639e0.m169523o9(), new e86())).subscribe(mkd0.m154955G(new e30() { // from class: l.g86
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101479a.m40819n((xaj0) obj);
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
