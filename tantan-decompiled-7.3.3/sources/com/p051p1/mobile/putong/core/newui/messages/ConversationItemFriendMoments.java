package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dq1;
import p153l.gra;
import p153l.i4g0;
import p153l.j96;
import p153l.jyb;
import p153l.n96;
import p153l.o2c;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.r96;
import p153l.sj6;
import p153l.ue6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemFriendMoments extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25550a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f25551b;

    /* JADX INFO: renamed from: c */
    public FriendsMomentAvatarView f25552c;

    /* JADX INFO: renamed from: d */
    public View f25553d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f25554e;

    /* JADX INFO: renamed from: f */
    public VText f25555f;

    /* JADX INFO: renamed from: g */
    public VText f25556g;

    /* JADX INFO: renamed from: h */
    public TextView f25557h;

    public ConversationItemFriendMoments(Context context) {
        super(context);
    }

    public static String getTA() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        Settings settings = userM116593na.settings;
        if (settings == null) {
            return "女性";
        }
        if (TEnum.equals(settings.getLookingFor(), "male")) {
            return "男性";
        }
        return TEnum.equals(userM116593na.settings.getLookingFor(), "female") ? "女性" : "用户";
    }

    /* JADX INFO: renamed from: g */
    public final void m41823g(View view) {
        r96.m180290a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final Act m41824h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41825i(Conversation conversation, View view) {
        i4g0.m138523u("e_choose", OMSDialogPositon.p_messages_view, jyb.m147494Y("title_information", conversation.localExtraInfo));
        getContext().startActivity(OOFMkWebViewAct.m42793n2(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m41826j(bkj0 bkj0Var) {
        final Conversation conversation = (Conversation) bkj0Var.f77081a;
        User user = (User) bkj0Var.f77082b;
        if (((User) bkj0Var.f77083c).isBannedNew()) {
            CoreModule.f18264c.f20384f0.m34189xl("fake_conversation_oof_enter");
            return;
        }
        this.f25557h.setText(pzi0.m174442G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f25552c;
        if (user == null) {
            bnl0.m105524M(friendsMomentAvatarView, false);
            bnl0.m105524M(this.f25553d, false);
            this.f25556g.setText("下一轮请明天再来");
        } else {
            bnl0.m105524M(friendsMomentAvatarView, true);
            bnl0.m105524M(this.f25553d, true);
            this.f25552c.m42933c(user, null);
            VText vText = this.f25556g;
            String str = conversation.localExtraInfo;
            if (str == null) {
                str = "";
            }
            vText.setText(str);
        }
        i4g0.m138492A("e_choose", OMSDialogPositon.p_messages_view, jyb.m147494Y("title_information", conversation.localExtraInfo));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.p96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151109a.m41825i(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m41827k(View view) {
        i4g0.m138520r("e_choose_receive_pick", OMSDialogPositon.p_messages_view);
        getContext().startActivity(OOFPickMkWebViewAct.m42799n2(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m41828l(pf60 pf60Var) {
        Conversation conversation = (Conversation) pf60Var.f152156a;
        User user = (User) pf60Var.f152157b;
        this.f25557h.setText(pzi0.m174442G(conversation.latestTime));
        bnl0.m105524M(this.f25552c, true);
        bnl0.m105524M(this.f25553d, true);
        this.f25552c.m42933c(user, null);
        VText vText = this.f25556g;
        String str = conversation.localExtraInfo;
        if (str == null) {
            str = "";
        }
        vText.setText(str);
        i4g0.m138526x("e_choose_receive_pick", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m41829m(View view) {
        i4g0.m138520r("e_selected_entrance", OMSDialogPositon.p_messages_view);
        CoreModule.f18264c.f20419q2.f180578R.put(0);
        m41824h().startActivity(o2c.m165711i(m41824h(), "message_entrance"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m41830n(bkj0 bkj0Var) {
        Conversation conversation = (Conversation) bkj0Var.f77081a;
        User user = (User) bkj0Var.f77082b;
        if (((User) bkj0Var.f77083c).isBannedNew()) {
            CoreModule.f18264c.f20384f0.m34189xl("fake_conversation_profile_featured");
            return;
        }
        this.f25557h.setText(pzi0.m174442G(conversation.latestTime));
        FriendsMomentAvatarView friendsMomentAvatarView = this.f25552c;
        if (user == null) {
            bnl0.m105524M(friendsMomentAvatarView, false);
            bnl0.m105524M(this.f25553d, false);
        } else {
            bnl0.m105524M(friendsMomentAvatarView, true);
            bnl0.m105524M(this.f25553d, true);
            this.f25552c.m42933c(user, null);
        }
        i4g0.m138526x("e_selected_entrance", OMSDialogPositon.p_messages_view);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.q96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156197a.m41829m(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m41831o(dq1<Conversation> dq1Var, String str) {
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f25550a;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86718X5);
        } else {
            vImage.setImageResource(dbc0.f86686W5);
        }
        this.f25555f.setTypeface(Typeface.defaultFromStyle(1));
        this.f25555f.setText(gra.m131727o3().chooseEntrenceName);
        this.f25556g.setText("");
        dq1Var.mo68557c(m41824h(), psd0.m173626s(CoreModule.f18264c.f20384f0.m33740Ne("fake_conversation_oof_enter"), TextUtils.isEmpty(str) ? C22421c.just(null) : CoreModule.f18264c.f20381e0.m116491Ma(str), CoreModule.f18264c.f20381e0.m116596o9(), new j96())).subscribe(psd0.m173596G(new y20() { // from class: l.k96
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124457a.m41826j((bkj0) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41823g(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(sj6.f168905Q, this.f25550a);
            ue6.m195671k0(this.f25555f, this.f25557h);
            ue6.m195667e0(this.f25556g);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m41832p(dq1<Conversation> dq1Var, String str) {
        this.f25555f.setTypeface(Typeface.defaultFromStyle(1));
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f25550a;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86718X5);
        } else {
            vImage.setImageResource(dbc0.f86686W5);
        }
        this.f25555f.setText("收到的Pick");
        this.f25556g.setText("");
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.m96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135353a.m41827k(view);
            }
        });
        dq1Var.mo68557c(m41824h(), psd0.m173625r(CoreModule.f18264c.f20384f0.m33740Ne("fake_conversation_oof_pick"), CoreModule.f18264c.f20381e0.m116483Ka(str), new n96())).subscribe(psd0.m173596G(new y20() { // from class: l.o96
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145497a.m41828l((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public void m41833q(dq1<Conversation> dq1Var, String str) {
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f25550a;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86287Jm);
        } else {
            vImage.setImageResource(dbc0.f86255Im);
        }
        this.f25555f.setTypeface(Typeface.defaultFromStyle(1));
        String str2 = "来看看今日为你推荐的优质" + getTA() + "！";
        this.f25555f.setText("每日精选");
        this.f25556g.setText(str2);
        dq1Var.mo68557c(m41824h(), psd0.m173626s(CoreModule.f18264c.f20384f0.m33740Ne("fake_conversation_profile_featured"), TextUtils.isEmpty(str) ? C22421c.just(null) : CoreModule.f18264c.f20381e0.m116491Ma(str), CoreModule.f18264c.f20381e0.m116596o9(), new j96())).subscribe(psd0.m173596G(new y20() { // from class: l.l96
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130556a.m41830n((bkj0) obj);
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
