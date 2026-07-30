package com.p051p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import p151v.VImage;
import p151v.VText;
import p153l.Cfor;
import p153l.ac6;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.evf0;
import p153l.gra;
import p153l.i4g0;
import p153l.j26;
import p153l.joa;
import p153l.jyb;
import p153l.l51;
import p153l.n46;
import p153l.orl;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.sfj0;
import p153l.sj6;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemRightBtnView extends FrameLayout implements orl {

    /* JADX INFO: renamed from: a */
    public ConversationItemRightBtnView f26582a;

    /* JADX INFO: renamed from: b */
    public VText f26583b;

    /* JADX INFO: renamed from: c */
    public VText f26584c;

    /* JADX INFO: renamed from: d */
    public VImage f26585d;

    /* JADX INFO: renamed from: e */
    public boolean f26586e;

    /* JADX INFO: renamed from: f */
    public sj6 f26587f;

    public ConversationItemRightBtnView(Context context) {
        super(context);
        this.f26586e = false;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m43460M0(String str, final sj6 sj6Var, View view) {
        i4g0.m138523u("e_chat_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("chat_guide_button", str), jyb.m147494Y("is_temporary_match", "1"), jyb.m147494Y("chat_guide_uid", CoreModule.f18264c.f20381e0.m116593na().f56859id + Constants.SEPARATOR_COMMA + sj6Var.f168926a.f56859id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        sj6Var.f168929d.mo68557c(sj6Var.f168949x, CoreModule.f18264c.f20384f0.m33626Dn(sj6Var.f168926a.f56859id, messageNew_, null)).subscribe(psd0.m173596G(new y20() { // from class: l.qb6
            @Override // p153l.y20
            public final void call(Object obj) {
                sj6Var.f168913D.m42036v2();
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m43463d1(String str, sj6 sj6Var, View view) {
        i4g0.m138523u("e_chat_guide", OMSDialogPositon.p_messages_view, pf60.m172085a("chat_guide_button", str), jyb.m147494Y("chat_guide_uid", CoreModule.f18264c.f20381e0.m116593na().f56859id + Constants.SEPARATOR_COMMA + sj6Var.f168926a.f56859id), pf60.m172085a("pairing_type", sj6Var.f168926a.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        CoreModule.f18264c.f20384f0.m33626Dn(sj6Var.f168926a.f56859id, messageNew_, null);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m43464e1(sj6 sj6Var, View view) {
        sfj0.m185596c("e_getback_matck", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185616i("is_privileged", CoreModule.f18264c.f20297C0.m146415L3()), sfj0.C20032a.m185615h("moments_user_id", sj6Var.f168926a.otherUser), sfj0.C20032a.m185615h(SeeSwitchName.message_tab, "lifted"));
        if (CoreModule.f18264c.f20297C0.m146415L3()) {
            CoreModule.f18264c.f20384f0.m33763Op(sj6Var.f168926a.f56859id);
        } else {
            C8927c.m54659n1(sj6Var.f168949x, "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m43466g1(String str, final sj6 sj6Var, final HashSet hashSet, final HashSet hashSet2, View view) {
        i4g0.m138523u("e_chat_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("chat_guide_button", str), jyb.m147494Y("chat_guide_uid", CoreModule.f18264c.f20381e0.m116593na().f56859id + Constants.SEPARATOR_COMMA + sj6Var.f168926a.f56859id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        sj6Var.f168929d.mo68557c(sj6Var.f168949x, CoreModule.f18264c.f20384f0.m33626Dn(sj6Var.f168926a.f56859id, messageNew_, null)).subscribe(psd0.m173596G(new y20() { // from class: l.zb6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemRightBtnView.m43468i1(hashSet, sj6Var, hashSet2, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m43468i1(HashSet hashSet, sj6 sj6Var, HashSet hashSet2, Message message) {
        hashSet.remove(sj6Var.f168926a.f56859id);
        CoreModule.f18264c.f20381e0.f89304p3.put(hashSet);
        hashSet2.add(sj6Var.f168926a.f56859id);
        CoreModule.f18264c.f20381e0.f89311q3.put(hashSet2);
        sj6Var.f168913D.m42036v2();
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m43470k1(View view) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m43471u(final sj6 sj6Var, View view) {
        i4g0.m138523u("e_chat_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("chat_guide_button", sj6Var.f168926a.property.conversationTag.emoji), jyb.m147494Y("chat_guide_uid", CoreModule.f18264c.f20381e0.m116593na().f56859id + Constants.SEPARATOR_COMMA + sj6Var.f168926a.f56859id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        Conversation conversation = sj6Var.f168926a;
        messageNew_.value = conversation.property.conversationTag.emoji;
        sj6Var.f168929d.mo68557c(sj6Var.f168949x, CoreModule.f18264c.f20384f0.m33626Dn(conversation.f56859id, messageNew_, null)).subscribe(psd0.m173596G(new y20() { // from class: l.pb6
            @Override // p153l.y20
            public final void call(Object obj) {
                sj6Var.f168913D.m42036v2();
            }
        }));
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: A */
    public void mo41998A(final sj6 sj6Var) {
        this.f26587f = sj6Var;
        this.f26583b.setText(getResources().getString(R$string.f19759w3));
        bnl0.m105524M(this.f26585d, false);
        bnl0.m105524M(this.f26584c, false);
        sfj0.m185601h("e_getback_matck", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185616i("is_privileged", CoreModule.f18264c.f20297C0.m146415L3()), sfj0.C20032a.m185615h("moments_user_id", sj6Var.f168926a.otherUser), sfj0.C20032a.m185615h(SeeSwitchName.message_tab, "lifted"));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.nb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemRightBtnView.m43464e1(sj6Var, view);
            }
        });
        bnl0.m105524M(this, !sj6Var.f168940o);
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
    @Override // p153l.orl
    /* JADX INFO: renamed from: Q0 */
    public void mo43420Q0(final sj6 sj6Var) {
        boolean zM195721j;
        Conversation conversation;
        final String strLimitMatchGreetEmoji;
        this.f26587f = sj6Var;
        bnl0.m105524M(this.f26585d, false);
        if (NullChecker.m82486a(sj6Var.f168926a) && TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        bnl0.m105505C0(this.f26583b, qa00.f156336w);
        this.f26583b.setTextSize(14.0f);
        this.f26583b.setBackgroundResource(dbc0.f86973f0);
        VText vText = this.f26583b;
        int i = qa00.f156323j;
        bnl0.m105550d0(vText, i);
        bnl0.m105552e0(this.f26583b, i);
        if (evf0.m122800a(sj6Var.f168926a)) {
            if (sj6Var.f168926a.unreadMessages > 0) {
                bnl0.m105524M(this.f26585d, true);
                bnl0.m105524M(this.f26583b, false);
                bnl0.m105524M(this, false);
            } else {
                this.f26583b.setTextSize(12.0f);
                bnl0.m105505C0(this.f26583b, qa00.f156330q);
                VText vText2 = this.f26583b;
                int i2 = qa00.f156321h;
                bnl0.m105550d0(vText2, i2);
                bnl0.m105552e0(this.f26583b, i2);
                bnl0.m105524M(this.f26585d, false);
                this.f26583b.setText("今日推荐");
                bnl0.m105524M(this.f26583b, true);
                bnl0.m105524M(this.f26584c, false);
                bnl0.m105524M(this, true);
                this.f26583b.setBackgroundResource(dbc0.f87557wr);
            }
        } else if (m195729q(sj6Var)) {
            bnl0.m105524M(this, true);
            bnl0.m105524M(this.f26583b, true);
            bnl0.m105524M(this.f26585d, false);
            bnl0.m105524M(this.f26584c, false);
            bnl0.m105505C0(this.f26583b, qa00.f156330q);
            this.f26583b.setTextSize(12.0f);
            VText vText3 = this.f26583b;
            int i3 = qa00.f156321h;
            bnl0.m105550d0(vText3, i3);
            bnl0.m105552e0(this.f26583b, i3);
            this.f26583b.setBackgroundResource(dbc0.f87557wr);
            this.f26583b.setText(gra.m131623S());
        } else if (CoreModule.m30933P().m143405a().mo34397Qb() && sj6Var.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) && !joa.m146361M3() && !CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            Cfor cfor = Cfor.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(cfor.m126494e()) || "waiting".equals(cfor.m126494e()) || "expired".equals(cfor.m126494e())) {
                m43476p1(sj6Var, "p_messages,seetrial_recover_one");
            } else if (m195728p0(sj6Var.f168926a)) {
                zM195721j = m195721j(sj6Var.f168926a);
                conversation = sj6Var.f168926a;
                if (zM195721j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        bnl0.m105524M(this, false);
                    } else {
                        bnl0.m105524M(this, true);
                        bnl0.m105524M(this.f26584c, false);
                        bnl0.m105524M(this.f26585d, sj6Var.f168926a.unreadMessages > 0);
                        this.f26583b.setText(strLimitMatchGreetEmoji);
                        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xb6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m43460M0(strLimitMatchGreetEmoji, sj6Var, view);
                            }
                        });
                    }
                } else if (m195710Z0(conversation)) {
                    if (sj6Var.f168926a.unreadMessages == 0) {
                        bnl0.m105524M(this, true);
                        bnl0.m105524M(this.f26585d, false);
                        bnl0.m105524M(this.f26584c, false);
                        bnl0.m105524M(this.f26583b, true);
                        final String strM161547j = n46.m161541g().m161547j(sj6Var.f168926a.f56859id, false);
                        this.f26583b.setText(strM161547j);
                        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.yb6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m43463d1(strM161547j, sj6Var, view);
                            }
                        });
                    } else {
                        bnl0.m105524M(this, false);
                    }
                }
            } else {
                zM195721j = m195721j(sj6Var.f168926a);
                conversation = sj6Var.f168926a;
                if (zM195721j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        bnl0.m105524M(this, true);
                        bnl0.m105524M(this.f26584c, false);
                        bnl0.m105524M(this.f26585d, sj6Var.f168926a.unreadMessages > 0);
                        this.f26583b.setText(strLimitMatchGreetEmoji);
                        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xb6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m43460M0(strLimitMatchGreetEmoji, sj6Var, view);
                            }
                        });
                    } else {
                        bnl0.m105524M(this, false);
                    }
                } else if (m195710Z0(conversation)) {
                    if (sj6Var.f168926a.unreadMessages == 0) {
                        bnl0.m105524M(this, true);
                        bnl0.m105524M(this.f26585d, false);
                        bnl0.m105524M(this.f26584c, false);
                        bnl0.m105524M(this.f26583b, true);
                        final String strM161547j2 = n46.m161541g().m161547j(sj6Var.f168926a.f56859id, false);
                        this.f26583b.setText(strM161547j2);
                        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.yb6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m43463d1(strM161547j2, sj6Var, view);
                            }
                        });
                    } else {
                        bnl0.m105524M(this, false);
                    }
                }
            }
        } else if (m195728p0(sj6Var.f168926a) || (TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestText) && TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.emoji))) {
            zM195721j = m195721j(sj6Var.f168926a);
            conversation = sj6Var.f168926a;
            if (zM195721j) {
                strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                    bnl0.m105524M(this, true);
                    bnl0.m105524M(this.f26584c, false);
                    bnl0.m105524M(this.f26585d, sj6Var.f168926a.unreadMessages > 0);
                    this.f26583b.setText(strLimitMatchGreetEmoji);
                    bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xb6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m43460M0(strLimitMatchGreetEmoji, sj6Var, view);
                        }
                    });
                } else {
                    bnl0.m105524M(this, false);
                }
            } else if (m195710Z0(conversation) && !sj6Var.f168926a.hasRemoveLabel()) {
                if (sj6Var.f168926a.unreadMessages == 0) {
                    bnl0.m105524M(this, true);
                    bnl0.m105524M(this.f26585d, false);
                    bnl0.m105524M(this.f26584c, false);
                    bnl0.m105524M(this.f26583b, true);
                    final String strM161547j3 = n46.m161541g().m161547j(sj6Var.f168926a.f56859id, false);
                    this.f26583b.setText(strM161547j3);
                    bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.yb6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m43463d1(strM161547j3, sj6Var, view);
                        }
                    });
                } else {
                    bnl0.m105524M(this, false);
                }
            }
        } else {
            Conversation conversation2 = sj6Var.f168926a;
            if (conversation2.unreadMessages > 0 || (!TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) && (TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestExpireTime) || pzi0.m174454o() >= Long.parseLong(sj6Var.f168926a.property.conversationTag.suggestExpireTime) * 1000))) {
                bnl0.m105524M(this, false);
            } else {
                bnl0.m105524M(this, true);
                bnl0.m105524M(this.f26583b, true);
                bnl0.m105524M(this.f26585d, false);
                bnl0.m105524M(this.f26584c, false);
                if (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.suggestText)) {
                    this.f26583b.setText(sj6Var.f168926a.property.conversationTag.suggestText);
                    bnl0.m105505C0(this.f26583b, qa00.f156330q);
                    this.f26583b.setTextSize(12.0f);
                    VText vText4 = this.f26583b;
                    int i4 = qa00.f156321h;
                    bnl0.m105550d0(vText4, i4);
                    bnl0.m105552e0(this.f26583b, i4);
                    this.f26583b.setBackgroundResource(dbc0.f87557wr);
                    bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vb6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sj6Var.f168913D.performClick();
                        }
                    });
                }
                if (!TextUtils.isEmpty(sj6Var.f168926a.property.conversationTag.emoji)) {
                    this.f26583b.setText(sj6Var.f168926a.property.conversationTag.emoji);
                    bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.wb6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m43471u(sj6Var, view);
                        }
                    });
                }
            }
        }
        mo43425y0();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: U */
    public void mo43433U(@NonNull sj6 sj6Var) {
        bnl0.m105524M(this, false);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: X0 */
    public void mo43434X0(sj6 sj6Var) {
        bnl0.m105524M(this, false);
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m43472l1(View view) {
        ac6.m96804a(this, view);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m */
    public void mo42024m(sj6 sj6Var) {
        this.f26587f = sj6Var;
        bnl0.m105524M(this, false);
        mo43425y0();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m0 */
    public void mo42025m0(sj6 sj6Var) {
        m43476p1(sj6Var, "p_messages,seetrial_recover_one");
        int i = 0;
        if (!jyb.m147479J(sj6Var.f168925P)) {
            Iterator<Conversation> it = sj6Var.f168925P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        m43477q1(i);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m43473m1() {
        if (TextUtils.equals(this.f26587f.f168926a.otherUser, CoreModule.f18264c.f20384f0.f20696l2)) {
            CoreModule.f18264c.f20384f0.f20734y1.put(Boolean.TRUE);
            C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D("点击快捷表情打个招呼\n更容易得到回复哦！").m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(13.0f).m21849E(false).m21881x(qa00.f156321h).m21880w(qa00.f156323j).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(zvk.f206224A | zvk.f206228E), this, "newUserShowGuidePop");
            sfj0.m185601h("e_newuser_icebreak_lead1", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m43474n1(View view) {
        this.f26587f.f168913D.performClick();
    }

    /* JADX INFO: renamed from: o1 */
    public final void m43475o1() {
        if (TextUtils.isEmpty(this.f26587f.f168926a.otherUser)) {
            return;
        }
        if (TextUtils.isEmpty(CoreModule.f18264c.f20384f0.f20696l2)) {
            CoreModule.f18264c.f20384f0.f20696l2 = this.f26587f.f168926a.otherUser;
        } else if (!TextUtils.equals(this.f26587f.f168926a.otherUser, CoreModule.f18264c.f20384f0.f20696l2)) {
            this.f26586e = false;
            return;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (!gra.m131581I3() || pzi0.m174454o() - userM116593na.createdTime > 8.64E7d || CoreModule.f18264c.f20384f0.f20734y1.get().booleanValue() || this.f26586e) {
            return;
        }
        this.f26586e = true;
        l51.m152888H(getContext(), new Runnable() { // from class: l.ob6
            @Override // java.lang.Runnable
            public final void run() {
                this.f145939a.m43473m1();
            }
        }, 2000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43472l1(this);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m43476p1(final sj6 sj6Var, final String str) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f26583b, false);
        this.f26584c.setText("去恢复");
        bnl0.m105524M(this.f26584c, true);
        m43477q1(sj6Var.f168926a.unreadMessages);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.rb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8927c.m54687x0(sj6Var.f168949x, str, Privilege.see_who_likes_me);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public final void m43477q1(int i) {
        VImage vImage = this.f26585d;
        if (i <= 0) {
            bnl0.m105524M(vImage, false);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.topMargin = qa00.f156328o;
        layoutParams.rightMargin = -qa00.f156318e;
        this.f26585d.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f26585d, true);
    }

    @Override // p153l.nrl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: t0 */
    public void mo42033t0(final sj6 sj6Var) {
        this.f26587f = sj6Var;
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f26584c, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26585d.getLayoutParams();
        layoutParams.topMargin = qa00.f156324k;
        layoutParams.rightMargin = 0;
        this.f26585d.setLayoutParams(layoutParams);
        if (sj6Var.f168947v) {
            return;
        }
        setOnClickListener(null);
        setClickable(false);
        if (m195729q(sj6Var)) {
            bnl0.m105524M(this, true);
            this.f26583b.setText(gra.m131623S());
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.tb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationItemRightBtnView.m43470k1(view);
                }
            });
            return;
        }
        if (m195725n0(sj6Var)) {
            final HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89304p3.get();
            final HashSet<String> hashSet2 = CoreModule.f18264c.f20381e0.f89311q3.get();
            if (!hashSet.contains(sj6Var.f168926a.f56859id) || hashSet2.contains(sj6Var.f168926a.f56859id)) {
                return;
            }
            final String strOptString = new String[]{"[暗中观察]", "[摸锦鲤]", "[打call]", "Hi", "你好呀", "哈喽"}[new Random().nextInt(6)];
            String str = CoreModule.f18264c.f20381e0.f89332t3.get();
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                boolean zIsEmpty = TextUtils.isEmpty(str);
                Conversation conversation = sj6Var.f168926a;
                if (zIsEmpty) {
                    jSONObject.put(conversation.f56859id, strOptString);
                } else {
                    strOptString = jSONObject.optString(conversation.f56859id, strOptString);
                    jSONObject.put(sj6Var.f168926a.f56859id, strOptString);
                }
                CoreModule.f18264c.f20381e0.f89332t3.put(jSONObject.toString());
                bnl0.m105524M(this, true);
                if (pzi0.m174463x(22, 6)) {
                    strOptString = "[晚安]";
                }
                this.f26583b.setText(strOptString);
                i4g0.m138492A("e_chat_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("chat_guide_button", strOptString), jyb.m147494Y("chat_guide_uid", CoreModule.f18264c.f20381e0.m116593na().f56859id + Constants.SEPARATOR_COMMA + sj6Var.f168926a.f56859id));
                bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ub6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationItemRightBtnView.m43466g1(strOptString, sj6Var, hashSet, hashSet2, view);
                    }
                });
                m43475o1();
            } catch (Exception unused) {
            }
        }
    }

    @Override // p153l.nrl
    /* JADX INFO: renamed from: y0 */
    public void mo43425y0() {
        if (m195708Y(this.f26587f.f168926a)) {
            bnl0.m105524M(this, true);
            this.f26583b.setText(getResources().getString(R$string.f19440lp));
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.sb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f167110a.m43474n1(view);
                }
            });
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: z0 */
    public void mo42039z0(Conversation conversation, User user, sj6 sj6Var) {
        this.f26587f = sj6Var;
        if (NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.localEverHasMessage) {
            return;
        }
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f26585d, false);
        bnl0.m105524M(this.f26584c, false);
        this.f26583b.setText(getResources().getString(R$string.f19281gj));
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26586e = false;
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26586e = false;
    }
}
