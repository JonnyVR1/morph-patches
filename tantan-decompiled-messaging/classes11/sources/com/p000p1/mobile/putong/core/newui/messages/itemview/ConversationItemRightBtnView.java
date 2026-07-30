package com.p000p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import l.e16;
import l.e30;
import l.e51;
import l.emr;
import l.i36;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.t100;
import l.upa;
import l.vmf0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xa6;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.json.JSONObject;
import p009l.cpl;
import p009l.jtk;
import p009l.mqi0;
import p009l.pi6;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemRightBtnView extends FrameLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemRightBtnView f4618a;

    /* JADX INFO: renamed from: b */
    public VText f4619b;

    /* JADX INFO: renamed from: c */
    public VText f4620c;

    /* JADX INFO: renamed from: d */
    public VImage f4621d;

    /* JADX INFO: renamed from: e */
    public boolean f4622e;

    /* JADX INFO: renamed from: f */
    public pi6 f4623f;

    public ConversationItemRightBtnView(Context context) {
        super(context);
        this.f4622e = false;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m6604M0(String str, final pi6 pi6Var, View view) {
        zvf0.u("e_chat_guide", "p_messages_view", new j760[]{vwb.Y("chat_guide_button", str), vwb.Y("is_temporary_match", "1"), vwb.Y("chat_guide_uid", ((DbObject) CoreModule.c.e0.na()).id + "," + ((DbObject) pi6Var.f18622a).id)});
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        pi6Var.f18625d.c(pi6Var.f18645x, CoreModule.c.f0.Dn(((DbObject) pi6Var.f18622a).id, messageNew_, (Sticker) null)).subscribe(mkd0.G(new e30() { // from class: l.na6
            public final void call(Object obj) {
                pi6Var.f18609D.m5127v2();
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m6607d1(String str, pi6 pi6Var, View view) {
        zvf0.u("e_chat_guide", "p_messages_view", new j760[]{j760.a("chat_guide_button", str), vwb.Y("chat_guide_uid", ((DbObject) CoreModule.c.e0.na()).id + "," + ((DbObject) pi6Var.f18622a).id), j760.a("pairing_type", pi6Var.f18622a.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice")});
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        CoreModule.c.f0.Dn(((DbObject) pi6Var.f18622a).id, messageNew_, (Sticker) null);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m6608e1(pi6 pi6Var, View view) {
        o6j0.c("e_getback_matck", "p_messages_view", new o6j0.a[]{o6j0.a.i("is_privileged", CoreModule.c.C0.K3()), o6j0.a.h("moments_user_id", pi6Var.f18622a.otherUser), o6j0.a.h("message_tab", "lifted")});
        if (CoreModule.c.C0.K3()) {
            CoreModule.c.f0.Op(((DbObject) pi6Var.f18622a).id);
        } else {
            c.n1(pi6Var.f18645x, "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m6610g1(String str, final pi6 pi6Var, final HashSet hashSet, final HashSet hashSet2, View view) {
        zvf0.u("e_chat_guide", "p_messages_view", new j760[]{vwb.Y("chat_guide_button", str), vwb.Y("chat_guide_uid", ((DbObject) CoreModule.c.e0.na()).id + "," + ((DbObject) pi6Var.f18622a).id)});
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        pi6Var.f18625d.c(pi6Var.f18645x, CoreModule.c.f0.Dn(((DbObject) pi6Var.f18622a).id, messageNew_, (Sticker) null)).subscribe(mkd0.G(new e30() { // from class: l.wa6
            public final void call(Object obj) {
                ConversationItemRightBtnView.m6612i1(hashSet, pi6Var, hashSet2, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m6612i1(HashSet hashSet, pi6 pi6Var, HashSet hashSet2, Message message) {
        hashSet.remove(((DbObject) pi6Var.f18622a).id);
        CoreModule.c.e0.p3.put(hashSet);
        hashSet2.add(((DbObject) pi6Var.f18622a).id);
        CoreModule.c.e0.q3.put(hashSet2);
        pi6Var.f18609D.m5127v2();
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m6614k1(View view) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m6615u(final pi6 pi6Var, View view) {
        zvf0.u("e_chat_guide", "p_messages_view", new j760[]{vwb.Y("chat_guide_button", pi6Var.f18622a.property.conversationTag.emoji), vwb.Y("chat_guide_uid", ((DbObject) CoreModule.c.e0.na()).id + "," + ((DbObject) pi6Var.f18622a).id)});
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        Conversation conversation = pi6Var.f18622a;
        messageNew_.value = conversation.property.conversationTag.emoji;
        pi6Var.f18625d.c(pi6Var.f18645x, CoreModule.c.f0.Dn(((DbObject) conversation).id, messageNew_, (Sticker) null)).subscribe(mkd0.G(new e30() { // from class: l.ma6
            public final void call(Object obj) {
                pi6Var.f18609D.m5127v2();
            }
        }));
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: A */
    public void mo5088A(final pi6 pi6Var) {
        this.f4623f = pi6Var;
        this.f4619b.setText(getResources().getString(R.string.u3));
        xdl0.M(this.f4621d, false);
        xdl0.M(this.f4620c, false);
        o6j0.h("e_getback_matck", "p_messages_view", new o6j0.a[]{o6j0.a.i("is_privileged", CoreModule.c.C0.K3()), o6j0.a.h("moments_user_id", pi6Var.f18622a.otherUser), o6j0.a.h("message_tab", "lifted")});
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ka6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemRightBtnView.m6608e1(pi6Var, view);
            }
        });
        xdl0.M(this, !pi6Var.f18636o);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x0212  */
    /* JADX WARN: Code duplicated, block: B:54:0x021c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0226  */
    /* JADX WARN: Code duplicated, block: B:58:0x0236  */
    /* JADX WARN: Code duplicated, block: B:60:0x0248  */
    /* JADX WARN: Code duplicated, block: B:61:0x024c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0252  */
    /* JADX WARN: Code duplicated, block: B:67:0x0260  */
    /* JADX WARN: Code duplicated, block: B:68:0x028c  */
    @Override // p009l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo6564Q0(final pi6 pi6Var) {
        boolean zM21568j;
        Conversation conversation;
        final String strLimitMatchGreetEmoji;
        this.f4623f = pi6Var;
        xdl0.M(this.f4621d, false);
        if (NullChecker.a(pi6Var.f18622a) && TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            return;
        }
        xdl0.C0(this.f4619b, t100.w);
        this.f4619b.setTextSize(14.0f);
        this.f4619b.setBackgroundResource(x2c0.e0);
        VText vText = this.f4619b;
        int i = t100.j;
        xdl0.d0(vText, i);
        xdl0.e0(this.f4619b, i);
        if (vmf0.a(pi6Var.f18622a)) {
            if (pi6Var.f18622a.unreadMessages > 0) {
                xdl0.M(this.f4621d, true);
                xdl0.M(this.f4619b, false);
                xdl0.M(this, false);
            } else {
                this.f4619b.setTextSize(12.0f);
                xdl0.C0(this.f4619b, t100.q);
                VText vText2 = this.f4619b;
                int i2 = t100.h;
                xdl0.d0(vText2, i2);
                xdl0.e0(this.f4619b, i2);
                xdl0.M(this.f4621d, false);
                this.f4619b.setText("今日推荐");
                xdl0.M(this.f4619b, true);
                xdl0.M(this.f4620c, false);
                xdl0.M(this, true);
                this.f4619b.setBackgroundResource(x2c0.Iq);
            }
        } else if (m21576q(pi6Var)) {
            xdl0.M(this, true);
            xdl0.M(this.f4619b, true);
            xdl0.M(this.f4621d, false);
            xdl0.M(this.f4620c, false);
            xdl0.C0(this.f4619b, t100.q);
            this.f4619b.setTextSize(12.0f);
            VText vText3 = this.f4619b;
            int i3 = t100.h;
            xdl0.d0(vText3, i3);
            xdl0.e0(this.f4619b, i3);
            this.f4619b.setBackgroundResource(x2c0.Iq);
            this.f4619b.setText(upa.S());
        } else if (CoreModule.P().a().Qb() && pi6Var.f18622a.isLimitedTrialSee(CoreModule.H().userId()) && !xma.L3() && !CoreModule.c.e0.p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if ("trialEnd".equals(emrVar.e()) || "waiting".equals(emrVar.e()) || "expired".equals(emrVar.e())) {
                m6620p1(pi6Var, "p_messages,seetrial_recover_one");
            } else if (m21575p0(pi6Var.f18622a)) {
                zM21568j = m21568j(pi6Var.f18622a);
                conversation = pi6Var.f18622a;
                if (zM21568j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        xdl0.M(this, false);
                    } else {
                        xdl0.M(this, true);
                        xdl0.M(this.f4620c, false);
                        xdl0.M(this.f4621d, pi6Var.f18622a.unreadMessages > 0);
                        this.f4619b.setText(strLimitMatchGreetEmoji);
                        xdl0.E0(this, new View.OnClickListener() { // from class: l.ua6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m6604M0(strLimitMatchGreetEmoji, pi6Var, view);
                            }
                        });
                    }
                } else if (m21557Z0(conversation)) {
                    if (pi6Var.f18622a.unreadMessages == 0) {
                        xdl0.M(this, true);
                        xdl0.M(this.f4621d, false);
                        xdl0.M(this.f4620c, false);
                        xdl0.M(this.f4619b, true);
                        final String strJ = i36.g().j(((DbObject) pi6Var.f18622a).id, false);
                        this.f4619b.setText(strJ);
                        xdl0.E0(this, new View.OnClickListener() { // from class: l.va6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m6607d1(strJ, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.M(this, false);
                    }
                }
            } else {
                zM21568j = m21568j(pi6Var.f18622a);
                conversation = pi6Var.f18622a;
                if (zM21568j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        xdl0.M(this, true);
                        xdl0.M(this.f4620c, false);
                        xdl0.M(this.f4621d, pi6Var.f18622a.unreadMessages > 0);
                        this.f4619b.setText(strLimitMatchGreetEmoji);
                        xdl0.E0(this, new View.OnClickListener() { // from class: l.ua6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m6604M0(strLimitMatchGreetEmoji, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.M(this, false);
                    }
                } else if (m21557Z0(conversation)) {
                    if (pi6Var.f18622a.unreadMessages == 0) {
                        xdl0.M(this, true);
                        xdl0.M(this.f4621d, false);
                        xdl0.M(this.f4620c, false);
                        xdl0.M(this.f4619b, true);
                        final String strJ2 = i36.g().j(((DbObject) pi6Var.f18622a).id, false);
                        this.f4619b.setText(strJ2);
                        xdl0.E0(this, new View.OnClickListener() { // from class: l.va6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m6607d1(strJ2, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.M(this, false);
                    }
                }
            }
        } else if (m21575p0(pi6Var.f18622a) || (TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestText) && TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.emoji))) {
            zM21568j = m21568j(pi6Var.f18622a);
            conversation = pi6Var.f18622a;
            if (zM21568j) {
                strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                    xdl0.M(this, true);
                    xdl0.M(this.f4620c, false);
                    xdl0.M(this.f4621d, pi6Var.f18622a.unreadMessages > 0);
                    this.f4619b.setText(strLimitMatchGreetEmoji);
                    xdl0.E0(this, new View.OnClickListener() { // from class: l.ua6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m6604M0(strLimitMatchGreetEmoji, pi6Var, view);
                        }
                    });
                } else {
                    xdl0.M(this, false);
                }
            } else if (m21557Z0(conversation) && !pi6Var.f18622a.hasRemoveLabel()) {
                if (pi6Var.f18622a.unreadMessages == 0) {
                    xdl0.M(this, true);
                    xdl0.M(this.f4621d, false);
                    xdl0.M(this.f4620c, false);
                    xdl0.M(this.f4619b, true);
                    final String strJ3 = i36.g().j(((DbObject) pi6Var.f18622a).id, false);
                    this.f4619b.setText(strJ3);
                    xdl0.E0(this, new View.OnClickListener() { // from class: l.va6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m6607d1(strJ3, pi6Var, view);
                        }
                    });
                } else {
                    xdl0.M(this, false);
                }
            }
        } else {
            Conversation conversation2 = pi6Var.f18622a;
            if (conversation2.unreadMessages > 0 || (!TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) && (TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestExpireTime) || mqi0.m18550o() >= Long.parseLong(pi6Var.f18622a.property.conversationTag.suggestExpireTime) * 1000))) {
                xdl0.M(this, false);
            } else {
                xdl0.M(this, true);
                xdl0.M(this.f4619b, true);
                xdl0.M(this.f4621d, false);
                xdl0.M(this.f4620c, false);
                if (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.suggestText)) {
                    this.f4619b.setText(pi6Var.f18622a.property.conversationTag.suggestText);
                    xdl0.C0(this.f4619b, t100.q);
                    this.f4619b.setTextSize(12.0f);
                    VText vText4 = this.f4619b;
                    int i4 = t100.h;
                    xdl0.d0(vText4, i4);
                    xdl0.e0(this.f4619b, i4);
                    this.f4619b.setBackgroundResource(x2c0.Iq);
                    xdl0.E0(this, new View.OnClickListener() { // from class: l.sa6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pi6Var.f18609D.performClick();
                        }
                    });
                }
                if (!TextUtils.isEmpty(pi6Var.f18622a.property.conversationTag.emoji)) {
                    this.f4619b.setText(pi6Var.f18622a.property.conversationTag.emoji);
                    xdl0.E0(this, new View.OnClickListener() { // from class: l.ta6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m6615u(pi6Var, view);
                        }
                    });
                }
            }
        }
        mo6569y0();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: U */
    public void mo6577U(@NonNull pi6 pi6Var) {
        xdl0.M(this, false);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo6578X0(pi6 pi6Var) {
        xdl0.M(this, false);
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m6616l1(View view) {
        xa6.a(this, view);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m */
    public void mo5114m(pi6 pi6Var) {
        this.f4623f = pi6Var;
        xdl0.M(this, false);
        mo6569y0();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo5115m0(pi6 pi6Var) {
        m6620p1(pi6Var, "p_messages,seetrial_recover_one");
        int i = 0;
        if (!vwb.J(pi6Var.f18621P)) {
            Iterator<Conversation> it = pi6Var.f18621P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        m6621q1(i);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m6617m1() {
        if (TextUtils.equals(this.f4623f.f18622a.otherUser, CoreModule.c.f0.l2)) {
            CoreModule.c.f0.y1.put(Boolean.TRUE);
            d.l().u(new a(getContext()).D("点击快捷表情打个招呼\n更容易得到回复哦！").k(new int[]{e16.c(getContext(), w0c0.I)}).G(w0c0.N).t(true).J(13.0f).E(false).x(t100.h).w(t100.j).b(5000L).q(jtk.f15293A | jtk.f15297E), this, "newUserShowGuidePop");
            o6j0.h("e_newuser_icebreak_lead1", "p_messages_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m6618n1(View view) {
        this.f4623f.f18609D.performClick();
    }

    /* JADX INFO: renamed from: o1 */
    public final void m6619o1() {
        if (TextUtils.isEmpty(this.f4623f.f18622a.otherUser)) {
            return;
        }
        if (TextUtils.isEmpty(CoreModule.c.f0.l2)) {
            CoreModule.c.f0.l2 = this.f4623f.f18622a.otherUser;
        } else if (!TextUtils.equals(this.f4623f.f18622a.otherUser, CoreModule.c.f0.l2)) {
            this.f4622e = false;
            return;
        }
        User userNa = CoreModule.c.e0.na();
        if (!upa.I3() || mqi0.m18550o() - userNa.createdTime > 8.64E7d || ((Boolean) CoreModule.c.f0.y1.get()).booleanValue() || this.f4622e) {
            return;
        }
        this.f4622e = true;
        e51.H(getContext(), new Runnable() { // from class: l.la6
            @Override // java.lang.Runnable
            public final void run() {
                this.f16033a.m6617m1();
            }
        }, 2000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6616l1(this);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m6620p1(final pi6 pi6Var, final String str) {
        xdl0.M(this, true);
        xdl0.M(this.f4619b, false);
        this.f4620c.setText("去恢复");
        xdl0.M(this.f4620c, true);
        m6621q1(pi6Var.f18622a.unreadMessages);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.oa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.x0(pi6Var.f18645x, str, Privilege.see_who_likes_me);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public final void m6621q1(int i) {
        VImage vImage = this.f4621d;
        if (i <= 0) {
            xdl0.M(vImage, false);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.topMargin = t100.o;
        layoutParams.rightMargin = -t100.e;
        this.f4621d.setLayoutParams(layoutParams);
        xdl0.M(this.f4621d, true);
    }

    @Override // p009l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo5123t0(final pi6 pi6Var) {
        this.f4623f = pi6Var;
        xdl0.M(this, false);
        xdl0.M(this.f4620c, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4621d.getLayoutParams();
        layoutParams.topMargin = t100.k;
        layoutParams.rightMargin = 0;
        this.f4621d.setLayoutParams(layoutParams);
        if (pi6Var.f18643v) {
            return;
        }
        setOnClickListener(null);
        setClickable(false);
        if (m21576q(pi6Var)) {
            xdl0.M(this, true);
            this.f4619b.setText(upa.S());
            xdl0.E0(this, new View.OnClickListener() { // from class: l.qa6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationItemRightBtnView.m6614k1(view);
                }
            });
            return;
        }
        if (m21572n0(pi6Var)) {
            final HashSet hashSet = (HashSet) CoreModule.c.e0.p3.get();
            final HashSet hashSet2 = (HashSet) CoreModule.c.e0.q3.get();
            if (!hashSet.contains(((DbObject) pi6Var.f18622a).id) || hashSet2.contains(((DbObject) pi6Var.f18622a).id)) {
                return;
            }
            final String strOptString = new String[]{"[暗中观察]", "[摸锦鲤]", "[打call]", "Hi", "你好呀", "哈喽"}[new Random().nextInt(6)];
            String str = (String) CoreModule.c.e0.t3.get();
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                boolean zIsEmpty = TextUtils.isEmpty(str);
                Conversation conversation = pi6Var.f18622a;
                if (zIsEmpty) {
                    jSONObject.put(((DbObject) conversation).id, strOptString);
                } else {
                    strOptString = jSONObject.optString(((DbObject) conversation).id, strOptString);
                    jSONObject.put(((DbObject) pi6Var.f18622a).id, strOptString);
                }
                CoreModule.c.e0.t3.put(jSONObject.toString());
                xdl0.M(this, true);
                if (mqi0.m18559x(22, 6)) {
                    strOptString = "[晚安]";
                }
                this.f4619b.setText(strOptString);
                zvf0.A("e_chat_guide", "p_messages_view", new j760[]{vwb.Y("chat_guide_button", strOptString), vwb.Y("chat_guide_uid", ((DbObject) CoreModule.c.e0.na()).id + "," + ((DbObject) pi6Var.f18622a).id)});
                xdl0.E0(this, new View.OnClickListener() { // from class: l.ra6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationItemRightBtnView.m6610g1(strOptString, pi6Var, hashSet, hashSet2, view);
                    }
                });
                m6619o1();
            } catch (Exception unused) {
            }
        }
    }

    @Override // p009l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo6569y0() {
        if (m21555Y(this.f4623f.f18622a)) {
            xdl0.M(this, true);
            this.f4619b.setText(getResources().getString(R.string.Po));
            xdl0.E0(this, new View.OnClickListener() { // from class: l.pa6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18440a.m6618n1(view);
                }
            });
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo5130z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f4623f = pi6Var;
        if (NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.localEverHasMessage) {
            return;
        }
        xdl0.M(this, true);
        xdl0.M(this.f4621d, false);
        xdl0.M(this.f4620c, false);
        this.f4619b.setText(getResources().getString(R.string.Ki));
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4622e = false;
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4622e = false;
    }
}
