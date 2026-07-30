package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NewMatchBackSp;
import com.p051p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.j26;
import p153l.k05;
import p153l.kec0;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.sfj0;
import p153l.uqb0;
import p153l.vx6;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseConversationMatchItemLayout extends VFrame {

    /* JADX INFO: renamed from: j */
    public static final Property<View, Integer> f25344j = new C8253a(Integer.TYPE, "paramsWidth");

    /* JADX INFO: renamed from: a */
    public final String f25345a;

    /* JADX INFO: renamed from: b */
    public String f25346b;

    /* JADX INFO: renamed from: c */
    public ConversationHeadRecommendLayout f25347c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f25348d;

    /* JADX INFO: renamed from: e */
    public final float[] f25349e;

    /* JADX INFO: renamed from: f */
    public final float[] f25350f;

    /* JADX INFO: renamed from: g */
    public final float[] f25351g;

    /* JADX INFO: renamed from: h */
    public final float[] f25352h;

    /* JADX INFO: renamed from: i */
    public final float[] f25353i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout$a */
    public class C8253a extends Property<View, Integer> {
        public C8253a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout$b */
    public class ViewOnClickListenerC8254b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public ConversationHeadRecommendLayout.C8266c f25354a;

        public ViewOnClickListenerC8254b(ConversationHeadRecommendLayout.C8266c c8266c) {
            this.f25354a = c8266c;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean m41581b(int i, int i2, Intent intent) {
            if (this.f25354a.f25516a != ConversationHeadRecommendLayout.C8266c.f25509D) {
                return true;
            }
            CoreModule.f18264c.f20384f0.m33988hp(false);
            CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0023  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = BaseConversationMatchItemLayout.this.f25347c;
            if (NullChecker.m82486a(ConversationHeadRecommendLayout.f25481x)) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = BaseConversationMatchItemLayout.this.f25347c;
                if (TextUtils.isEmpty(ConversationHeadRecommendLayout.f25481x.f25519d)) {
                    str = this.f25354a.f25519d;
                } else {
                    ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = BaseConversationMatchItemLayout.this.f25347c;
                    str = ConversationHeadRecommendLayout.f25481x.f25519d;
                }
            } else {
                str = this.f25354a.f25519d;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(sfj0.C20032a.m185615h("moments_user_id", str));
            sfj0.m185596c("e_new_match_notification", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
            String strM41566E = BaseConversationMatchItemLayout.this.m41566E(this.f25354a);
            if (!TextUtils.isEmpty(strM41566E)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(sfj0.C20032a.m185615h("other_user_id", BaseConversationMatchItemLayout.this.f25346b));
                arrayList2.add(sfj0.C20032a.m185615h("no_chat_entrance_type", strM41566E));
                sfj0.m185596c("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList2.toArray(new sfj0.C20032a[arrayList2.size()]));
            }
            if (this.f25354a.f25516a == ConversationHeadRecommendLayout.C8266c.f25509D) {
                CoreModule.f18264c.f20384f0.f20698m1.put(Double.valueOf(pzi0.m174454o()));
            }
            int i = this.f25354a.f25516a;
            int i2 = ConversationHeadRecommendLayout.C8266c.f25511F;
            BaseConversationMatchItemLayout baseConversationMatchItemLayout = BaseConversationMatchItemLayout.this;
            Intent intentM41544b2 = i == i2 ? AllPairsAct.m41544b2(baseConversationMatchItemLayout.getContext(), AllPairsAct.f25325g) : MessagesAct.m50127l2(baseConversationMatchItemLayout.getContext(), str, false, false, 26);
            if (gra.m131549C1()) {
                k05.m147755h().m147758d(str);
                MessagesAct.m50135u2(intentM41544b2, "all_new_match");
            }
            ((Act) BaseConversationMatchItemLayout.this.getContext()).startActivityForResult(intentM41544b2, new C4468a.a() { // from class: l.ti2
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i3, int i4, Intent intent) {
                    return this.f174439a.m41581b(i3, i4, intent);
                }
            });
            if (this.f25354a.f25516a == ConversationHeadRecommendLayout.C8266c.f25510E) {
                BaseConversationMatchItemLayout.this.m41577S(str);
            }
        }
    }

    public BaseConversationMatchItemLayout(Context context) {
        super(context);
        this.f25345a = "CNMTLayout";
        this.f25346b = "";
        this.f25348d = false;
        this.f25349e = new float[]{0.6f, 1.0f};
        this.f25350f = new float[]{0.0f, 1.0f};
        this.f25351g = new float[]{1.0f, 0.0f};
        this.f25352h = new float[]{qa00.m175859d(15.0f), 0.0f};
        this.f25353i = new float[]{-qa00.m175859d(15.0f), 0.0f};
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m41560s(Message message) {
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo41565C(Runnable runnable);

    /* JADX INFO: renamed from: E */
    public final String m41566E(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (c8266c == null) {
            return "";
        }
        int i = c8266c.f25516a;
        if (i == ConversationHeadRecommendLayout.C8266c.f25509D) {
            return "new_match";
        }
        if (i == ConversationHeadRecommendLayout.C8266c.f25510E) {
            return "no_chat_reminder";
        }
        return i == ConversationHeadRecommendLayout.C8266c.f25511F ? "no_chat_default" : "";
    }

    /* JADX INFO: renamed from: F */
    public void m41567F(View view, ConversationHeadRecommendLayout.C8266c c8266c) {
        bnl0.m105509E0(view, new ViewOnClickListenerC8254b(c8266c));
        if (!this.f25348d && NullChecker.m82486a(c8266c) && TextUtils.isEmpty(this.f25346b)) {
            this.f25346b = c8266c.f25519d;
            m41572N(view);
            m41575Q(c8266c);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m41568G() {
        this.f25348d = false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m41569K() {
        mo41565C(new Runnable() { // from class: l.qi2
            @Override // java.lang.Runnable
            public final void run() {
                this.f157794a.m41568G();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m41570L(VText vText, View view) {
        sfj0.m185596c("e_newuser_icebreak_lead2", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("other_user_id", this.f25346b));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = vText.getText().toString();
        ((Act) getContext()).duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(this.f25346b, messageNew_, null)).subscribe(psd0.m173596G(new y20() { // from class: l.oi2
            @Override // p153l.y20
            public final void call(Object obj) {
                BaseConversationMatchItemLayout.m41560s((Message) obj);
            }
        }));
        C4499d.m21895l().m21899k("showNewMatchUserGuidePop");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m41571M(User user) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125897j8, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(adc0.f69941I0)).setText(String.format("你的新配对被折叠在这里啦\n跟%s打个招呼吧！", (user == null || user.isFemale()) ? "她" : "他"));
        final VText vText = (VText) viewInflate.findViewById(adc0.f69867Db);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.si2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168787a.m41570L(vText, view);
            }
        });
        vText.setText("[嘿哈]你好");
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D("点击快捷表情打个招呼\n更容易得到回复哦！").m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21877t(true).m21876s(viewInflate).m21849E(false).m21881x(qa00.f156321h).m21879v(qa00.f156323j).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(zvk.f206224A | zvk.f206228E), this, "showNewMatchUserGuidePop");
        sfj0.m185601h("e_newuser_icebreak_lead2", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: N */
    public final void m41572N(View view) {
        if (this.f25348d) {
            return;
        }
        bnl0.m105524M(view, false);
        this.f25348d = true;
        postDelayed(new Runnable() { // from class: l.pi2
            @Override // java.lang.Runnable
            public final void run() {
                this.f152510a.m41569K();
            }
        }, this.f25347c.f25494m.getPageCount() <= 1 ? 100L : 1000L);
    }

    /* JADX INFO: renamed from: O */
    public void m41573O(User user, VDraweeView vDraweeView) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew() || user.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(vDraweeView, dbc0.f87072i0);
            return;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
            uqb0.f180374G.m127115L0(vDraweeView, user.getAnonymousUrl());
        } else {
            uqb0.f180374G.m127115L0(vDraweeView, vx6.m203837a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo41574P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C8266c c8266c);

    /* JADX INFO: renamed from: Q */
    public void m41575Q(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (this.f25347c.f25494m.f25507d.contains(c8266c.f25519d)) {
            return;
        }
        this.f25347c.f25494m.f25507d.add(c8266c.f25519d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("moments_user_id", this.f25346b));
        sfj0.m185601h("e_new_match_notification", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList.toArray(new sfj0.C20032a[arrayList.size()]));
        String strM41566E = m41566E(c8266c);
        if (TextUtils.isEmpty(strM41566E)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sfj0.C20032a.m185615h("other_user_id", this.f25346b));
        arrayList2.add(sfj0.C20032a.m185615h("no_chat_entrance_type", strM41566E));
        sfj0.m185601h("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (sfj0.C20032a[]) arrayList2.toArray(new sfj0.C20032a[arrayList2.size()]));
    }

    /* JADX INFO: renamed from: R */
    public void m41576R() {
        double dM174454o = pzi0.m174454o() - CoreModule.f18264c.f20381e0.m116593na().createdTime;
        if (!gra.m131581I3() || dM174454o < 8.64E7d || dM174454o > 6.048E8d || CoreModule.f18264c.f20384f0.f20737z1.get().booleanValue()) {
            return;
        }
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f25346b);
        CoreModule.f18264c.f20384f0.f20737z1.put(Boolean.TRUE);
        l51.m152888H(getContext(), new Runnable() { // from class: l.ri2
            @Override // java.lang.Runnable
            public final void run() {
                this.f163331a.m41571M(userM116503Pa);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: S */
    public final void m41577S(String str) {
        NewMatchBackSp newMatchBackSpNew_ = NewMatchBackSp.new_();
        newMatchBackSpNew_.num = 0;
        newMatchBackSpNew_.lastUpdateTime = pzi0.m174454o();
        newMatchBackSpNew_.userId = str;
        CoreModule.f18264c.f20384f0.f20595E0.put(newMatchBackSpNew_.toJson());
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25345a = "CNMTLayout";
        this.f25346b = "";
        this.f25348d = false;
        this.f25349e = new float[]{0.6f, 1.0f};
        this.f25350f = new float[]{0.0f, 1.0f};
        this.f25351g = new float[]{1.0f, 0.0f};
        this.f25352h = new float[]{qa00.m175859d(15.0f), 0.0f};
        this.f25353i = new float[]{-qa00.m175859d(15.0f), 0.0f};
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25345a = "CNMTLayout";
        this.f25346b = "";
        this.f25348d = false;
        this.f25349e = new float[]{0.6f, 1.0f};
        this.f25350f = new float[]{0.0f, 1.0f};
        this.f25351g = new float[]{1.0f, 0.0f};
        this.f25352h = new float[]{qa00.m175859d(15.0f), 0.0f};
        this.f25353i = new float[]{-qa00.m175859d(15.0f), 0.0f};
    }
}
