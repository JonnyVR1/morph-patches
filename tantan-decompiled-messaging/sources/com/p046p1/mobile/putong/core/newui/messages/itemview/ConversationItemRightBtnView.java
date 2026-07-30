package com.p046p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VText;
import p149l.cpl;
import p149l.e16;
import p149l.e30;
import p149l.e51;
import p149l.emr;
import p149l.i36;
import p149l.j760;
import p149l.jtk;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.pi6;
import p149l.t100;
import p149l.upa;
import p149l.vmf0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xa6;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemRightBtnView extends FrameLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemRightBtnView f25840a;

    /* JADX INFO: renamed from: b */
    public VText f25841b;

    /* JADX INFO: renamed from: c */
    public VText f25842c;

    /* JADX INFO: renamed from: d */
    public VImage f25843d;

    /* JADX INFO: renamed from: e */
    public boolean f25844e;

    /* JADX INFO: renamed from: f */
    public pi6 f25845f;

    public ConversationItemRightBtnView(Context context) {
        super(context);
        this.f25844e = false;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m42449M0(String str, final pi6 pi6Var, View view) {
        zvf0.m220399u("e_chat_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("chat_guide_button", str), vwb.m200311Y("is_temporary_match", "1"), vwb.m200311Y("chat_guide_uid", CoreModule.f17545c.f19639e0.m169520na().f56011id + Constants.SEPARATOR_COMMA + pi6Var.f149101a.f56011id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        pi6Var.f149104d.mo67374c(pi6Var.f149124x, CoreModule.f17545c.f19642f0.m32623Dn(pi6Var.f149101a.f56011id, messageNew_, null)).subscribe(mkd0.m154955G(new e30() { // from class: l.na6
            @Override // p149l.e30
            public final void call(Object obj) {
                pi6Var.f149088D.m41025v2();
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m42452d1(String str, pi6 pi6Var, View view) {
        zvf0.m220399u("e_chat_guide", OMSDialogPositon.p_messages_view, j760.m140076a("chat_guide_button", str), vwb.m200311Y("chat_guide_uid", CoreModule.f17545c.f19639e0.m169520na().f56011id + Constants.SEPARATOR_COMMA + pi6Var.f149101a.f56011id), j760.m140076a("pairing_type", pi6Var.f149101a.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        CoreModule.f17545c.f19642f0.m32623Dn(pi6Var.f149101a.f56011id, messageNew_, null);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m42453e1(pi6 pi6Var, View view) {
        o6j0.m162859c("e_getback_matck", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162879i("is_privileged", CoreModule.f17545c.f19555C0.m210102K3()), o6j0.C18854a.m162878h("moments_user_id", pi6Var.f149101a.otherUser), o6j0.C18854a.m162878h(SeeSwitchName.message_tab, "lifted"));
        if (CoreModule.f17545c.f19555C0.m210102K3()) {
            CoreModule.f17545c.f19642f0.m32760Op(pi6Var.f149101a.f56011id);
        } else {
            C8764c.m53476n1(pi6Var.f149124x, "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m42455g1(String str, final pi6 pi6Var, final HashSet hashSet, final HashSet hashSet2, View view) {
        zvf0.m220399u("e_chat_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("chat_guide_button", str), vwb.m200311Y("chat_guide_uid", CoreModule.f17545c.f19639e0.m169520na().f56011id + Constants.SEPARATOR_COMMA + pi6Var.f149101a.f56011id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = str;
        pi6Var.f149104d.mo67374c(pi6Var.f149124x, CoreModule.f17545c.f19642f0.m32623Dn(pi6Var.f149101a.f56011id, messageNew_, null)).subscribe(mkd0.m154955G(new e30() { // from class: l.wa6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemRightBtnView.m42457i1(hashSet, pi6Var, hashSet2, (Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m42457i1(HashSet hashSet, pi6 pi6Var, HashSet hashSet2, Message message) {
        hashSet.remove(pi6Var.f149101a.f56011id);
        CoreModule.f17545c.f19639e0.f149447p3.put(hashSet);
        hashSet2.add(pi6Var.f149101a.f56011id);
        CoreModule.f17545c.f19639e0.f149454q3.put(hashSet2);
        pi6Var.f149088D.m41025v2();
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m42459k1(View view) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m42460u(final pi6 pi6Var, View view) {
        zvf0.m220399u("e_chat_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("chat_guide_button", pi6Var.f149101a.property.conversationTag.emoji), vwb.m200311Y("chat_guide_uid", CoreModule.f17545c.f19639e0.m169520na().f56011id + Constants.SEPARATOR_COMMA + pi6Var.f149101a.f56011id));
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        Conversation conversation = pi6Var.f149101a;
        messageNew_.value = conversation.property.conversationTag.emoji;
        pi6Var.f149104d.mo67374c(pi6Var.f149124x, CoreModule.f17545c.f19642f0.m32623Dn(conversation.f56011id, messageNew_, null)).subscribe(mkd0.m154955G(new e30() { // from class: l.ma6
            @Override // p149l.e30
            public final void call(Object obj) {
                pi6Var.f149088D.m41025v2();
            }
        }));
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: A */
    public void mo40987A(final pi6 pi6Var) {
        this.f25845f = pi6Var;
        this.f25841b.setText(getResources().getString(R$string.f18962u3));
        xdl0.m208344M(this.f25843d, false);
        xdl0.m208344M(this.f25842c, false);
        o6j0.m162864h("e_getback_matck", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162879i("is_privileged", CoreModule.f17545c.f19555C0.m210102K3()), o6j0.C18854a.m162878h("moments_user_id", pi6Var.f149101a.otherUser), o6j0.C18854a.m162878h(SeeSwitchName.message_tab, "lifted"));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ka6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemRightBtnView.m42453e1(pi6Var, view);
            }
        });
        xdl0.m208344M(this, !pi6Var.f149115o);
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
    @Override // p149l.cpl
    /* JADX INFO: renamed from: Q0 */
    public void mo42409Q0(final pi6 pi6Var) {
        boolean zM178927j;
        Conversation conversation;
        final String strLimitMatchGreetEmoji;
        this.f25845f = pi6Var;
        xdl0.m208344M(this.f25843d, false);
        if (NullChecker.m81303a(pi6Var.f149101a) && TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            return;
        }
        xdl0.m208325C0(this.f25841b, t100.f167274w);
        this.f25841b.setTextSize(14.0f);
        this.f25841b.setBackgroundResource(x2c0.f190093e0);
        VText vText = this.f25841b;
        int i = t100.f167261j;
        xdl0.m208370d0(vText, i);
        xdl0.m208372e0(this.f25841b, i);
        if (vmf0.m198948a(pi6Var.f149101a)) {
            if (pi6Var.f149101a.unreadMessages > 0) {
                xdl0.m208344M(this.f25843d, true);
                xdl0.m208344M(this.f25841b, false);
                xdl0.m208344M(this, false);
            } else {
                this.f25841b.setTextSize(12.0f);
                xdl0.m208325C0(this.f25841b, t100.f167268q);
                VText vText2 = this.f25841b;
                int i2 = t100.f167259h;
                xdl0.m208370d0(vText2, i2);
                xdl0.m208372e0(this.f25841b, i2);
                xdl0.m208344M(this.f25843d, false);
                this.f25841b.setText("今日推荐");
                xdl0.m208344M(this.f25841b, true);
                xdl0.m208344M(this.f25842c, false);
                xdl0.m208344M(this, true);
                this.f25841b.setBackgroundResource(x2c0.f189434Iq);
            }
        } else if (m178935q(pi6Var)) {
            xdl0.m208344M(this, true);
            xdl0.m208344M(this.f25841b, true);
            xdl0.m208344M(this.f25843d, false);
            xdl0.m208344M(this.f25842c, false);
            xdl0.m208325C0(this.f25841b, t100.f167268q);
            this.f25841b.setTextSize(12.0f);
            VText vText3 = this.f25841b;
            int i3 = t100.f167259h;
            xdl0.m208370d0(vText3, i3);
            xdl0.m208372e0(this.f25841b, i3);
            this.f25841b.setBackgroundResource(x2c0.f189434Iq);
            this.f25841b.setText(upa.m194692S());
        } else if (CoreModule.m29935P().m94651a().mo33394Qb() && pi6Var.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) && !xma.m210047L3() && !CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            emr emrVar = emr.INSTANCE;
            if (SeeTrialStatusType.trialEnd.equals(emrVar.m117223e()) || "waiting".equals(emrVar.m117223e()) || "expired".equals(emrVar.m117223e())) {
                m42465p1(pi6Var, "p_messages,seetrial_recover_one");
            } else if (m178934p0(pi6Var.f149101a)) {
                zM178927j = m178927j(pi6Var.f149101a);
                conversation = pi6Var.f149101a;
                if (zM178927j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        xdl0.m208344M(this, false);
                    } else {
                        xdl0.m208344M(this, true);
                        xdl0.m208344M(this.f25842c, false);
                        xdl0.m208344M(this.f25843d, pi6Var.f149101a.unreadMessages > 0);
                        this.f25841b.setText(strLimitMatchGreetEmoji);
                        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ua6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m42449M0(strLimitMatchGreetEmoji, pi6Var, view);
                            }
                        });
                    }
                } else if (m178916Z0(conversation)) {
                    if (pi6Var.f149101a.unreadMessages == 0) {
                        xdl0.m208344M(this, true);
                        xdl0.m208344M(this.f25843d, false);
                        xdl0.m208344M(this.f25842c, false);
                        xdl0.m208344M(this.f25841b, true);
                        final String strM134155j = i36.m134149g().m134155j(pi6Var.f149101a.f56011id, false);
                        this.f25841b.setText(strM134155j);
                        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.va6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m42452d1(strM134155j, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.m208344M(this, false);
                    }
                }
            } else {
                zM178927j = m178927j(pi6Var.f149101a);
                conversation = pi6Var.f149101a;
                if (zM178927j) {
                    strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                    if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                        xdl0.m208344M(this, true);
                        xdl0.m208344M(this.f25842c, false);
                        xdl0.m208344M(this.f25843d, pi6Var.f149101a.unreadMessages > 0);
                        this.f25841b.setText(strLimitMatchGreetEmoji);
                        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ua6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m42449M0(strLimitMatchGreetEmoji, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.m208344M(this, false);
                    }
                } else if (m178916Z0(conversation)) {
                    if (pi6Var.f149101a.unreadMessages == 0) {
                        xdl0.m208344M(this, true);
                        xdl0.m208344M(this.f25843d, false);
                        xdl0.m208344M(this.f25842c, false);
                        xdl0.m208344M(this.f25841b, true);
                        final String strM134155j2 = i36.m134149g().m134155j(pi6Var.f149101a.f56011id, false);
                        this.f25841b.setText(strM134155j2);
                        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.va6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConversationItemRightBtnView.m42452d1(strM134155j2, pi6Var, view);
                            }
                        });
                    } else {
                        xdl0.m208344M(this, false);
                    }
                }
            }
        } else if (m178934p0(pi6Var.f149101a) || (TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestText) && TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.emoji))) {
            zM178927j = m178927j(pi6Var.f149101a);
            conversation = pi6Var.f149101a;
            if (zM178927j) {
                strLimitMatchGreetEmoji = conversation.limitMatchGreetEmoji();
                if (TextUtils.isEmpty(strLimitMatchGreetEmoji)) {
                    xdl0.m208344M(this, true);
                    xdl0.m208344M(this.f25842c, false);
                    xdl0.m208344M(this.f25843d, pi6Var.f149101a.unreadMessages > 0);
                    this.f25841b.setText(strLimitMatchGreetEmoji);
                    xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ua6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m42449M0(strLimitMatchGreetEmoji, pi6Var, view);
                        }
                    });
                } else {
                    xdl0.m208344M(this, false);
                }
            } else if (m178916Z0(conversation) && !pi6Var.f149101a.hasRemoveLabel()) {
                if (pi6Var.f149101a.unreadMessages == 0) {
                    xdl0.m208344M(this, true);
                    xdl0.m208344M(this.f25843d, false);
                    xdl0.m208344M(this.f25842c, false);
                    xdl0.m208344M(this.f25841b, true);
                    final String strM134155j3 = i36.m134149g().m134155j(pi6Var.f149101a.f56011id, false);
                    this.f25841b.setText(strM134155j3);
                    xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.va6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m42452d1(strM134155j3, pi6Var, view);
                        }
                    });
                } else {
                    xdl0.m208344M(this, false);
                }
            }
        } else {
            Conversation conversation2 = pi6Var.f149101a;
            if (conversation2.unreadMessages > 0 || (!TextUtils.isEmpty(conversation2.property.conversationTag.suggestExpireTime) && (TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestExpireTime) || mqi0.m155944o() >= Long.parseLong(pi6Var.f149101a.property.conversationTag.suggestExpireTime) * 1000))) {
                xdl0.m208344M(this, false);
            } else {
                xdl0.m208344M(this, true);
                xdl0.m208344M(this.f25841b, true);
                xdl0.m208344M(this.f25843d, false);
                xdl0.m208344M(this.f25842c, false);
                if (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.suggestText)) {
                    this.f25841b.setText(pi6Var.f149101a.property.conversationTag.suggestText);
                    xdl0.m208325C0(this.f25841b, t100.f167268q);
                    this.f25841b.setTextSize(12.0f);
                    VText vText4 = this.f25841b;
                    int i4 = t100.f167259h;
                    xdl0.m208370d0(vText4, i4);
                    xdl0.m208372e0(this.f25841b, i4);
                    this.f25841b.setBackgroundResource(x2c0.f189434Iq);
                    xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.sa6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pi6Var.f149088D.performClick();
                        }
                    });
                }
                if (!TextUtils.isEmpty(pi6Var.f149101a.property.conversationTag.emoji)) {
                    this.f25841b.setText(pi6Var.f149101a.property.conversationTag.emoji);
                    xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ta6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ConversationItemRightBtnView.m42460u(pi6Var, view);
                        }
                    });
                }
            }
        }
        mo42414y0();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: U */
    public void mo42422U(@NonNull pi6 pi6Var) {
        xdl0.m208344M(this, false);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: X0 */
    public void mo42423X0(pi6 pi6Var) {
        xdl0.m208344M(this, false);
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: l1 */
    public final void m42461l1(View view) {
        xa6.m207529a(this, view);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m */
    public void mo41013m(pi6 pi6Var) {
        this.f25845f = pi6Var;
        xdl0.m208344M(this, false);
        mo42414y0();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo41014m0(pi6 pi6Var) {
        m42465p1(pi6Var, "p_messages,seetrial_recover_one");
        int i = 0;
        if (!vwb.m200296J(pi6Var.f149100P)) {
            Iterator<Conversation> it = pi6Var.f149100P.iterator();
            while (it.hasNext()) {
                i += it.next().unreadMessages;
            }
        }
        m42466q1(i);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m42462m1() {
        if (TextUtils.equals(this.f25845f.f149101a.otherUser, CoreModule.f17545c.f19642f0.f19954l2)) {
            CoreModule.f17545c.f19642f0.f19992y1.put(Boolean.TRUE);
            C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D("点击快捷表情打个招呼\n更容易得到回复哦！").m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(13.0f).m20850E(false).m20882x(t100.f167259h).m20881w(t100.f167261j).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(jtk.f119614A | jtk.f119618E), this, "newUserShowGuidePop");
            o6j0.m162864h("e_newuser_icebreak_lead1", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m42463n1(View view) {
        this.f25845f.f149088D.performClick();
    }

    /* JADX INFO: renamed from: o1 */
    public final void m42464o1() {
        if (TextUtils.isEmpty(this.f25845f.f149101a.otherUser)) {
            return;
        }
        if (TextUtils.isEmpty(CoreModule.f17545c.f19642f0.f19954l2)) {
            CoreModule.f17545c.f19642f0.f19954l2 = this.f25845f.f149101a.otherUser;
        } else if (!TextUtils.equals(this.f25845f.f149101a.otherUser, CoreModule.f17545c.f19642f0.f19954l2)) {
            this.f25844e = false;
            return;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (!upa.m194650I3() || mqi0.m155944o() - userM169520na.createdTime > 8.64E7d || CoreModule.f17545c.f19642f0.f19992y1.get().booleanValue() || this.f25844e) {
            return;
        }
        this.f25844e = true;
        e51.m114743H(getContext(), new Runnable() { // from class: l.la6
            @Override // java.lang.Runnable
            public final void run() {
                this.f127167a.m42462m1();
            }
        }, 2000L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42461l1(this);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m42465p1(final pi6 pi6Var, final String str) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f25841b, false);
        this.f25842c.setText("去恢复");
        xdl0.m208344M(this.f25842c, true);
        m42466q1(pi6Var.f149101a.unreadMessages);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.oa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8764c.m53504x0(pi6Var.f149124x, str, Privilege.see_who_likes_me);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public final void m42466q1(int i) {
        VImage vImage = this.f25843d;
        if (i <= 0) {
            xdl0.m208344M(vImage, false);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.topMargin = t100.f167266o;
        layoutParams.rightMargin = -t100.f167256e;
        this.f25843d.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f25843d, true);
    }

    @Override // p149l.bpl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo41022t0(final pi6 pi6Var) {
        this.f25845f = pi6Var;
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f25842c, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25843d.getLayoutParams();
        layoutParams.topMargin = t100.f167262k;
        layoutParams.rightMargin = 0;
        this.f25843d.setLayoutParams(layoutParams);
        if (pi6Var.f149122v) {
            return;
        }
        setOnClickListener(null);
        setClickable(false);
        if (m178935q(pi6Var)) {
            xdl0.m208344M(this, true);
            this.f25841b.setText(upa.m194692S());
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.qa6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationItemRightBtnView.m42459k1(view);
                }
            });
            return;
        }
        if (m178931n0(pi6Var)) {
            final HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149447p3.get();
            final HashSet<String> hashSet2 = CoreModule.f17545c.f19639e0.f149454q3.get();
            if (!hashSet.contains(pi6Var.f149101a.f56011id) || hashSet2.contains(pi6Var.f149101a.f56011id)) {
                return;
            }
            final String strOptString = new String[]{"[暗中观察]", "[摸锦鲤]", "[打call]", "Hi", "你好呀", "哈喽"}[new Random().nextInt(6)];
            String str = CoreModule.f17545c.f19639e0.f149475t3.get();
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                boolean zIsEmpty = TextUtils.isEmpty(str);
                Conversation conversation = pi6Var.f149101a;
                if (zIsEmpty) {
                    jSONObject.put(conversation.f56011id, strOptString);
                } else {
                    strOptString = jSONObject.optString(conversation.f56011id, strOptString);
                    jSONObject.put(pi6Var.f149101a.f56011id, strOptString);
                }
                CoreModule.f17545c.f19639e0.f149475t3.put(jSONObject.toString());
                xdl0.m208344M(this, true);
                if (mqi0.m155953x(22, 6)) {
                    strOptString = "[晚安]";
                }
                this.f25841b.setText(strOptString);
                zvf0.m220368A("e_chat_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("chat_guide_button", strOptString), vwb.m200311Y("chat_guide_uid", CoreModule.f17545c.f19639e0.m169520na().f56011id + Constants.SEPARATOR_COMMA + pi6Var.f149101a.f56011id));
                xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ra6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationItemRightBtnView.m42455g1(strOptString, pi6Var, hashSet, hashSet2, view);
                    }
                });
                m42464o1();
            } catch (Exception unused) {
            }
        }
    }

    @Override // p149l.bpl
    /* JADX INFO: renamed from: y0 */
    public void mo42414y0() {
        if (m178914Y(this.f25845f.f149101a)) {
            xdl0.m208344M(this, true);
            this.f25841b.setText(getResources().getString(R$string.f18041Po));
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.pa6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147946a.m42463n1(view);
                }
            });
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo41028z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f25845f = pi6Var;
        if (NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.localEverHasMessage) {
            return;
        }
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f25843d, false);
        xdl0.m208344M(this.f25842c, false);
        this.f25841b.setText(getResources().getString(R$string.f17885Ki));
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25844e = false;
    }

    public ConversationItemRightBtnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25844e = false;
    }
}
