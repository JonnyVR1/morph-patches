package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.NewMatchBackSp;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e16;
import l.e30;
import l.e51;
import l.f6c0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.sw6;
import l.t100;
import l.u4c0;
import l.upa;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import p009l.jtk;
import p009l.lz4;
import p009l.mqi0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class BaseConversationMatchItemLayout extends VFrame {

    /* JADX INFO: renamed from: j */
    public static final Property<View, Integer> f3380j = new C0266a(Integer.TYPE, "paramsWidth");

    /* JADX INFO: renamed from: a */
    public final String f3381a;

    /* JADX INFO: renamed from: b */
    public String f3382b;

    /* JADX INFO: renamed from: c */
    public ConversationHeadRecommendLayout f3383c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f3384d;

    /* JADX INFO: renamed from: e */
    public final float[] f3385e;

    /* JADX INFO: renamed from: f */
    public final float[] f3386f;

    /* JADX INFO: renamed from: g */
    public final float[] f3387g;

    /* JADX INFO: renamed from: h */
    public final float[] f3388h;

    /* JADX INFO: renamed from: i */
    public final float[] f3389i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout$a */
    public class C0266a extends Property<View, Integer> {
        public C0266a(Class cls, String str) {
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
    public class ViewOnClickListenerC0267b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public ConversationHeadRecommendLayout.C0279c f3390a;

        public ViewOnClickListenerC0267b(ConversationHeadRecommendLayout.C0279c c0279c) {
            this.f3390a = c0279c;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean m4663b(int i, int i2, Intent intent) {
            if (this.f3390a.f3552a != ConversationHeadRecommendLayout.C0279c.f3545D) {
                return true;
            }
            CoreModule.c.f0.hp(false);
            CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0023  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = BaseConversationMatchItemLayout.this.f3383c;
            if (NullChecker.a(ConversationHeadRecommendLayout.f3517x)) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = BaseConversationMatchItemLayout.this.f3383c;
                if (TextUtils.isEmpty(ConversationHeadRecommendLayout.f3517x.f3555d)) {
                    str = this.f3390a.f3555d;
                } else {
                    ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = BaseConversationMatchItemLayout.this.f3383c;
                    str = ConversationHeadRecommendLayout.f3517x.f3555d;
                }
            } else {
                str = this.f3390a.f3555d;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6j0.a.h("moments_user_id", str));
            o6j0.c("e_new_match_notification", "p_messages_view", (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
            String strM4648E = BaseConversationMatchItemLayout.this.m4648E(this.f3390a);
            if (!TextUtils.isEmpty(strM4648E)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(o6j0.a.h("other_user_id", BaseConversationMatchItemLayout.this.f3382b));
                arrayList2.add(o6j0.a.h("no_chat_entrance_type", strM4648E));
                o6j0.c("e_nochat_match_entrance", "p_messages_view", (o6j0.a[]) arrayList2.toArray(new o6j0.a[arrayList2.size()]));
            }
            if (this.f3390a.f3552a == ConversationHeadRecommendLayout.C0279c.f3545D) {
                CoreModule.c.f0.m1.put(Double.valueOf(mqi0.m18550o()));
            }
            int i = this.f3390a.f3552a;
            int i2 = ConversationHeadRecommendLayout.C0279c.f3547F;
            VFrame vFrame = BaseConversationMatchItemLayout.this;
            Intent intentM4624a2 = i == i2 ? AllPairsAct.m4624a2(vFrame.getContext(), AllPairsAct.f3361g) : MessagesAct.k2(vFrame.getContext(), str, false, false, 26);
            if (upa.C1()) {
                lz4.m18100h().m18103d(str);
                MessagesAct.s2(intentM4624a2, "all_new_match");
            }
            ((Act) BaseConversationMatchItemLayout.this.getContext()).startActivityForResult(intentM4624a2, new a.a() { // from class: l.mi2
                /* JADX INFO: renamed from: a */
                public final boolean m18469a(int i3, int i4, Intent intent) {
                    return this.f16928a.m4663b(i3, i4, intent);
                }
            });
            if (this.f3390a.f3552a == ConversationHeadRecommendLayout.C0279c.f3546E) {
                BaseConversationMatchItemLayout.this.m4659S(str);
            }
        }
    }

    public BaseConversationMatchItemLayout(Context context) {
        super(context);
        this.f3381a = "CNMTLayout";
        this.f3382b = "";
        this.f3384d = false;
        this.f3385e = new float[]{0.6f, 1.0f};
        this.f3386f = new float[]{0.0f, 1.0f};
        this.f3387g = new float[]{1.0f, 0.0f};
        this.f3388h = new float[]{t100.d(15.0f), 0.0f};
        this.f3389i = new float[]{-t100.d(15.0f), 0.0f};
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m4642s(Message message) {
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo4647C(Runnable runnable);

    /* JADX INFO: renamed from: E */
    public final String m4648E(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (c0279c == null) {
            return "";
        }
        int i = c0279c.f3552a;
        if (i == ConversationHeadRecommendLayout.C0279c.f3545D) {
            return "new_match";
        }
        if (i == ConversationHeadRecommendLayout.C0279c.f3546E) {
            return "no_chat_reminder";
        }
        return i == ConversationHeadRecommendLayout.C0279c.f3547F ? "no_chat_default" : "";
    }

    /* JADX INFO: renamed from: F */
    public void m4649F(View view, ConversationHeadRecommendLayout.C0279c c0279c) {
        xdl0.E0(view, new ViewOnClickListenerC0267b(c0279c));
        if (!this.f3384d && NullChecker.a(c0279c) && TextUtils.isEmpty(this.f3382b)) {
            this.f3382b = c0279c.f3555d;
            m4654N(view);
            m4657Q(c0279c);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4650G() {
        this.f3384d = false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4651K() {
        mo4647C(new Runnable() { // from class: l.ji2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15174a.m4650G();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4652L(VText vText, View view) {
        o6j0.c("e_newuser_icebreak_lead2", "p_messages_view", new o6j0.a[]{o6j0.a.h("other_user_id", this.f3382b)});
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = vText.getText().toString();
        getContext().duringCreated(CoreModule.c.f0.Dn(this.f3382b, messageNew_, (Sticker) null)).subscribe(mkd0.G(new e30() { // from class: l.hi2
            public final void call(Object obj) {
                BaseConversationMatchItemLayout.m4642s((Message) obj);
            }
        }));
        d.l().k("showNewMatchUserGuidePop");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4653M(User user) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.c8, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(u4c0.I0)).setText(String.format("你的新配对被折叠在这里啦\n跟%s打个招呼吧！", (user == null || user.isFemale()) ? "她" : "他"));
        final VText vTextFindViewById = viewInflate.findViewById(u4c0.Bb);
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.li2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16169a.m4652L(vTextFindViewById, view);
            }
        });
        vTextFindViewById.setText("[嘿哈]你好");
        d.l().u(new com.p1.mobile.android.ui.bubble.a(getContext()).D("点击快捷表情打个招呼\n更容易得到回复哦！").k(new int[]{e16.c(getContext(), w0c0.I)}).t(true).s(viewInflate).E(false).x(t100.h).v(t100.j).b(5000L).q(jtk.f15293A | jtk.f15297E), this, "showNewMatchUserGuidePop");
        o6j0.h("e_newuser_icebreak_lead2", "p_messages_view", new o6j0.a[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m4654N(View view) {
        if (this.f3384d) {
            return;
        }
        xdl0.M(view, false);
        this.f3384d = true;
        postDelayed(new Runnable() { // from class: l.ii2
            @Override // java.lang.Runnable
            public final void run() {
                this.f14643a.m4651K();
            }
        }, this.f3383c.f3530m.m4877C() <= 1 ? 100L : 1000L);
    }

    /* JADX INFO: renamed from: O */
    public void m4655O(User user, VDraweeView vDraweeView) {
        if (user == null) {
            return;
        }
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.G.Y0(vDraweeView, x2c0.h0);
            return;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
            qib0.G.L0(vDraweeView, user.getAnonymousUrl());
        } else {
            qib0.G.L0(vDraweeView, sw6.a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo4656P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, ConversationHeadRecommendLayout.C0279c c0279c);

    /* JADX INFO: renamed from: Q */
    public void m4657Q(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (this.f3383c.f3530m.f3543d.contains(c0279c.f3555d)) {
            return;
        }
        this.f3383c.f3530m.f3543d.add(c0279c.f3555d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("moments_user_id", this.f3382b));
        o6j0.h("e_new_match_notification", "p_messages_view", (o6j0.a[]) arrayList.toArray(new o6j0.a[arrayList.size()]));
        String strM4648E = m4648E(c0279c);
        if (TextUtils.isEmpty(strM4648E)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(o6j0.a.h("other_user_id", this.f3382b));
        arrayList2.add(o6j0.a.h("no_chat_entrance_type", strM4648E));
        o6j0.h("e_nochat_match_entrance", "p_messages_view", (o6j0.a[]) arrayList2.toArray(new o6j0.a[arrayList2.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m4658R() {
        double dM18550o = mqi0.m18550o() - CoreModule.c.e0.na().createdTime;
        if (!upa.I3() || dM18550o < 8.64E7d || dM18550o > 6.048E8d || ((Boolean) CoreModule.c.f0.z1.get()).booleanValue()) {
            return;
        }
        final User userPa = CoreModule.c.e0.Pa(this.f3382b);
        CoreModule.c.f0.z1.put(Boolean.TRUE);
        e51.H(getContext(), new Runnable() { // from class: l.ki2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15697a.m4653M(userPa);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: S */
    public final void m4659S(String str) {
        NewMatchBackSp newMatchBackSpNew_ = NewMatchBackSp.new_();
        newMatchBackSpNew_.num = 0;
        newMatchBackSpNew_.lastUpdateTime = mqi0.m18550o();
        newMatchBackSpNew_.userId = str;
        CoreModule.c.f0.E0.put(newMatchBackSpNew_.toJson());
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3381a = "CNMTLayout";
        this.f3382b = "";
        this.f3384d = false;
        this.f3385e = new float[]{0.6f, 1.0f};
        this.f3386f = new float[]{0.0f, 1.0f};
        this.f3387g = new float[]{1.0f, 0.0f};
        this.f3388h = new float[]{t100.d(15.0f), 0.0f};
        this.f3389i = new float[]{-t100.d(15.0f), 0.0f};
    }

    public BaseConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3381a = "CNMTLayout";
        this.f3382b = "";
        this.f3384d = false;
        this.f3385e = new float[]{0.6f, 1.0f};
        this.f3386f = new float[]{0.0f, 1.0f};
        this.f3387g = new float[]{1.0f, 0.0f};
        this.f3388h = new float[]{t100.d(15.0f), 0.0f};
        this.f3389i = new float[]{-t100.d(15.0f), 0.0f};
    }
}
