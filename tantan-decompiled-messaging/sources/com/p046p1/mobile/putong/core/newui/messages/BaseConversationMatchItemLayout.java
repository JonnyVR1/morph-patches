package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NewMatchBackSp;
import com.p046p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.e16;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.jtk;
import p149l.lz4;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.sw6;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseConversationMatchItemLayout extends VFrame {

    /* JADX INFO: renamed from: j */
    public static final Property<View, Integer> f24602j = new C8102a(Integer.TYPE, "paramsWidth");

    /* JADX INFO: renamed from: a */
    public final String f24603a;

    /* JADX INFO: renamed from: b */
    public String f24604b;

    /* JADX INFO: renamed from: c */
    public ConversationHeadRecommendLayout f24605c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f24606d;

    /* JADX INFO: renamed from: e */
    public final float[] f24607e;

    /* JADX INFO: renamed from: f */
    public final float[] f24608f;

    /* JADX INFO: renamed from: g */
    public final float[] f24609g;

    /* JADX INFO: renamed from: h */
    public final float[] f24610h;

    /* JADX INFO: renamed from: i */
    public final float[] f24611i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout$a */
    public class C8102a extends Property<View, Integer> {
        public C8102a(Class cls, String str) {
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
    public class ViewOnClickListenerC8103b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public ConversationHeadRecommendLayout.C8115c f24612a;

        public ViewOnClickListenerC8103b(ConversationHeadRecommendLayout.C8115c c8115c) {
            this.f24612a = c8115c;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean m40570b(int i, int i2, Intent intent) {
            if (this.f24612a.f24774a != ConversationHeadRecommendLayout.C8115c.f24767D) {
                return true;
            }
            CoreModule.f17545c.f19642f0.m32985hp(false);
            CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0023  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = BaseConversationMatchItemLayout.this.f24605c;
            if (NullChecker.m81303a(ConversationHeadRecommendLayout.f24739x)) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = BaseConversationMatchItemLayout.this.f24605c;
                if (TextUtils.isEmpty(ConversationHeadRecommendLayout.f24739x.f24777d)) {
                    str = this.f24612a.f24777d;
                } else {
                    ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = BaseConversationMatchItemLayout.this.f24605c;
                    str = ConversationHeadRecommendLayout.f24739x.f24777d;
                }
            } else {
                str = this.f24612a.f24777d;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.C18854a.m162878h("moments_user_id", str));
            o6j0.m162859c("e_new_match_notification", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
            String strM40555E = BaseConversationMatchItemLayout.this.m40555E(this.f24612a);
            if (!TextUtils.isEmpty(strM40555E)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(o6j0.C18854a.m162878h("other_user_id", BaseConversationMatchItemLayout.this.f24604b));
                arrayList2.add(o6j0.C18854a.m162878h("no_chat_entrance_type", strM40555E));
                o6j0.m162859c("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList2.toArray(new o6j0.C18854a[arrayList2.size()]));
            }
            if (this.f24612a.f24774a == ConversationHeadRecommendLayout.C8115c.f24767D) {
                CoreModule.f17545c.f19642f0.f19956m1.put(Double.valueOf(mqi0.m155944o()));
            }
            int i = this.f24612a.f24774a;
            int i2 = ConversationHeadRecommendLayout.C8115c.f24769F;
            BaseConversationMatchItemLayout baseConversationMatchItemLayout = BaseConversationMatchItemLayout.this;
            Intent intentM40533a2 = i == i2 ? AllPairsAct.m40533a2(baseConversationMatchItemLayout.getContext(), AllPairsAct.f24583g) : MessagesAct.m48944k2(baseConversationMatchItemLayout.getContext(), str, false, false, 26);
            if (upa.m194618C1()) {
                lz4.m152319h().m152322d(str);
                MessagesAct.m48952s2(intentM40533a2, "all_new_match");
            }
            ((Act) BaseConversationMatchItemLayout.this.getContext()).startActivityForResult(intentM40533a2, new C4317a.a() { // from class: l.mi2
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i3, int i4, Intent intent) {
                    return this.f133930a.m40570b(i3, i4, intent);
                }
            });
            if (this.f24612a.f24774a == ConversationHeadRecommendLayout.C8115c.f24768E) {
                BaseConversationMatchItemLayout.this.m40566S(str);
            }
        }
    }

    public BaseConversationMatchItemLayout(Context context) {
        super(context);
        this.f24603a = "CNMTLayout";
        this.f24604b = "";
        this.f24606d = false;
        this.f24607e = new float[]{0.6f, 1.0f};
        this.f24608f = new float[]{0.0f, 1.0f};
        this.f24609g = new float[]{1.0f, 0.0f};
        this.f24610h = new float[]{t100.m186890d(15.0f), 0.0f};
        this.f24611i = new float[]{-t100.m186890d(15.0f), 0.0f};
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m40549s(Message message) {
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo40554C(Runnable runnable);

    /* JADX INFO: renamed from: E */
    public final String m40555E(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (c8115c == null) {
            return "";
        }
        int i = c8115c.f24774a;
        if (i == ConversationHeadRecommendLayout.C8115c.f24767D) {
            return "new_match";
        }
        if (i == ConversationHeadRecommendLayout.C8115c.f24768E) {
            return "no_chat_reminder";
        }
        return i == ConversationHeadRecommendLayout.C8115c.f24769F ? "no_chat_default" : "";
    }

    /* JADX INFO: renamed from: F */
    public void m40556F(View view, ConversationHeadRecommendLayout.C8115c c8115c) {
        xdl0.m208329E0(view, new ViewOnClickListenerC8103b(c8115c));
        if (!this.f24606d && NullChecker.m81303a(c8115c) && TextUtils.isEmpty(this.f24604b)) {
            this.f24604b = c8115c.f24777d;
            m40561N(view);
            m40564Q(c8115c);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m40557G() {
        this.f24606d = false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m40558K() {
        mo40554C(new Runnable() { // from class: l.ji2
            @Override // java.lang.Runnable
            public final void run() {
                this.f118043a.m40557G();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m40559L(VText vText, View view) {
        o6j0.m162859c("e_newuser_icebreak_lead2", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("other_user_id", this.f24604b));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = vText.getText().toString();
        ((Act) getContext()).duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(this.f24604b, messageNew_, null)).subscribe(mkd0.m154955G(new e30() { // from class: l.hi2
            @Override // p149l.e30
            public final void call(Object obj) {
                BaseConversationMatchItemLayout.m40549s((Message) obj);
            }
        }));
        C4348d.m20896l().m20900k("showNewMatchUserGuidePop");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m40560M(User user) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95725c8, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(u4c0.f173853I0)).setText(String.format("你的新配对被折叠在这里啦\n跟%s打个招呼吧！", (user == null || user.isFemale()) ? "她" : "他"));
        final VText vText = (VText) viewInflate.findViewById(u4c0.f173745Bb);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.li2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128156a.m40559L(vText, view);
            }
        });
        vText.setText("[嘿哈]你好");
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D("点击快捷表情打个招呼\n更容易得到回复哦！").m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20878t(true).m20877s(viewInflate).m20850E(false).m20882x(t100.f167259h).m20880v(t100.f167261j).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(jtk.f119614A | jtk.f119618E), this, "showNewMatchUserGuidePop");
        o6j0.m162864h("e_newuser_icebreak_lead2", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: N */
    public final void m40561N(View view) {
        if (this.f24606d) {
            return;
        }
        xdl0.m208344M(view, false);
        this.f24606d = true;
        postDelayed(new Runnable() { // from class: l.ii2
            @Override // java.lang.Runnable
            public final void run() {
                this.f113359a.m40558K();
            }
        }, this.f24605c.f24752m.getPageCount() <= 1 ? 100L : 1000L);
    }

    /* JADX INFO: renamed from: O */
    public void m40562O(User user, VDraweeView vDraweeView) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(vDraweeView, x2c0.f190189h0);
            return;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
            qib0.f154691G.m102331L0(vDraweeView, user.getAnonymousUrl());
        } else {
            qib0.f154691G.m102331L0(vDraweeView, sw6.m186126a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo40563P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C8115c c8115c);

    /* JADX INFO: renamed from: Q */
    public void m40564Q(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (this.f24605c.f24752m.f24765d.contains(c8115c.f24777d)) {
            return;
        }
        this.f24605c.f24752m.f24765d.add(c8115c.f24777d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("moments_user_id", this.f24604b));
        o6j0.m162864h("e_new_match_notification", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList.toArray(new o6j0.C18854a[arrayList.size()]));
        String strM40555E = m40555E(c8115c);
        if (TextUtils.isEmpty(strM40555E)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.C18854a.m162878h("other_user_id", this.f24604b));
        arrayList2.add(o6j0.C18854a.m162878h("no_chat_entrance_type", strM40555E));
        o6j0.m162864h("e_nochat_match_entrance", OMSDialogPositon.p_messages_view, (o6j0.C18854a[]) arrayList2.toArray(new o6j0.C18854a[arrayList2.size()]));
    }

    /* JADX INFO: renamed from: R */
    public void m40565R() {
        double dM155944o = mqi0.m155944o() - CoreModule.f17545c.f19639e0.m169520na().createdTime;
        if (!upa.m194650I3() || dM155944o < 8.64E7d || dM155944o > 6.048E8d || CoreModule.f17545c.f19642f0.f19995z1.get().booleanValue()) {
            return;
        }
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f24604b);
        CoreModule.f17545c.f19642f0.f19995z1.put(Boolean.TRUE);
        e51.m114743H(getContext(), new Runnable() { // from class: l.ki2
            @Override // java.lang.Runnable
            public final void run() {
                this.f123257a.m40560M(userM169430Pa);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: S */
    public final void m40566S(String str) {
        NewMatchBackSp newMatchBackSpNew_ = NewMatchBackSp.new_();
        newMatchBackSpNew_.num = 0;
        newMatchBackSpNew_.lastUpdateTime = mqi0.m155944o();
        newMatchBackSpNew_.userId = str;
        CoreModule.f17545c.f19642f0.f19853E0.put(newMatchBackSpNew_.toJson());
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24603a = "CNMTLayout";
        this.f24604b = "";
        this.f24606d = false;
        this.f24607e = new float[]{0.6f, 1.0f};
        this.f24608f = new float[]{0.0f, 1.0f};
        this.f24609g = new float[]{1.0f, 0.0f};
        this.f24610h = new float[]{t100.m186890d(15.0f), 0.0f};
        this.f24611i = new float[]{-t100.m186890d(15.0f), 0.0f};
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24603a = "CNMTLayout";
        this.f24604b = "";
        this.f24606d = false;
        this.f24607e = new float[]{0.6f, 1.0f};
        this.f24608f = new float[]{0.0f, 1.0f};
        this.f24609g = new float[]{1.0f, 0.0f};
        this.f24610h = new float[]{t100.m186890d(15.0f), 0.0f};
        this.f24611i = new float[]{-t100.m186890d(15.0f), 0.0f};
    }
}
