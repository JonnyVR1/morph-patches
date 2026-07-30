package p003l;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.p001ui.messages.ChatTipsItem;
import com.p000p1.mobile.putong.core.p001ui.messages.CoreChatAiSendMomentItem;
import com.p000p1.mobile.putong.core.p001ui.messages.HistoryContentItem;
import com.p000p1.mobile.putong.core.p001ui.messages.IntrRiskTipItem;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAddArtworkGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAddTagsGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAiChatGuideMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemAiP2PChatGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemBase;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemBlindBoxGuideView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemBreakIceMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatAssistantQuestion;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatAssistantQuestionAutoRight;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatInterceptRight;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatSafetyReminder;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatUnlockLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChristmasMatch;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCommonTipBox;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCommonTipBoxV2;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemConversationNotification;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCountdownLikeSuccess;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemDiceTip;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemFriendActiveRemindFemale;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemGuideAuthentication;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemHeartbeatNotifyNewUi;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemIceBreakStateRight;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemIntlConversationPrompt;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemIntlReadReceiptsGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLocalUXQuestionnaire;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLongTimeNoSeeTip;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLoveBuzzBreakIceMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLoveBuzzUnlockLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageMMTask;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageRight;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageWCInviteAfter;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMomentPostGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMsgRiskLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemODiamondVisitorGuideMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPicCertGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPlatinumPinGuideMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPrompt;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPromptIntl;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemRedPacketNotification;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemSendMsgTips;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemSystemRemind;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemTagGuide;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemTantanVerifyToast;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemTickle;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemVisitorHideFootPrint;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemVoiceCallInvitation;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemWechatNotifyGuideMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemWoodenFishTip;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.NewOnlineMatchSuccessItem;
import com.p000p1.mobile.putong.core.p001ui.messages.ReminderView;
import com.p000p1.mobile.putong.core.p001ui.messages.UnMatchItem;
import com.p000p1.mobile.putong.core.p001ui.messages.aichat.AIChatMessageAnalysisItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageExtData;
import com.p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.data.Reminder;
import com.p1.mobile.putong.core.data.StateData;
import com.p1.mobile.putong.core.data.SystemReminder;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.ItemBirthdayTip;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;
import com.p1.mobile.putong.core.ui.greet.ItemGreetingTip;
import com.p1.mobile.putong.core.ui.messages.view.ItemMessageNewSurvey;
import com.p1.mobile.putong.core.ui.messages.view.MessageIdealEnquiryLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageLoveLetterGuideView;
import com.p1.mobile.putong.core.ui.mypets.view.item.ScriptMessageItem;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.a1c0;
import l.c3c0;
import l.i0g0;
import l.j760;
import l.l6c0;
import l.ldm;
import l.mkd0;
import l.o000;
import l.o6j0;
import l.q860;
import l.qib0;
import l.shw;
import l.t100;
import l.ura;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zvf0;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.i18n.TextBundle;
import p014rx.C1099c;
import p028v.VText;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class j000 extends o000 {

    /* JADX INFO: renamed from: e */
    public long f4525e;

    /* JADX INFO: renamed from: f */
    public long f4526f;

    /* JADX INFO: renamed from: g */
    public boolean f4527g;

    /* JADX INFO: renamed from: h */
    public boolean f4528h;

    /* JADX INFO: renamed from: i */
    public Set<String> f4529i;

    /* JADX INFO: renamed from: j */
    public Set<String> f4530j;

    /* JADX INFO: renamed from: k */
    public Set<String> f4531k;

    /* JADX INFO: renamed from: l */
    public Set<String> f4532l;

    /* JADX INFO: renamed from: m */
    public Set<String> f4533m;

    /* JADX INFO: renamed from: n */
    public Set<String> f4534n;

    /* JADX INFO: renamed from: o */
    public Set<String> f4535o;

    /* JADX INFO: renamed from: p */
    public boolean f4536p;

    /* JADX INFO: renamed from: q */
    public int f4537q;

    /* JADX INFO: renamed from: r */
    public qsz f4538r;

    /* JADX INFO: renamed from: s */
    public fcz<?, ?> f4539s;

    /* JADX INFO: renamed from: t */
    public boolean f4540t;

    /* JADX INFO: renamed from: u */
    public List<Message> f4541u;

    /* JADX INFO: renamed from: l.j000$a */
    public class ViewOnLayoutChangeListenerC0350a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0350a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (j000.this.f4539s.m4309t7().act().mo2063c0().m8922y0() != 0 && i4 != i8) {
                j000.this.f4539s.m4309t7().act().mo2063c0().m6499g0().mo5107j(((Integer) Act.savedKeyboardHeight.get()).intValue());
            }
            j000.this.f4539s.m4309t7().f7677n1.getRealView().removeOnLayoutChangeListener(this);
        }
    }

    public j000(ViewGroup viewGroup, fcz fczVar) {
        super(viewGroup);
        this.f4525e = 0L;
        this.f4526f = 0L;
        this.f4529i = new HashSet();
        this.f4530j = new HashSet();
        this.f4531k = new HashSet();
        this.f4532l = new HashSet();
        this.f4533m = new HashSet();
        this.f4534n = new HashSet();
        this.f4535o = new HashSet();
        this.f4536p = false;
        this.f4537q = 0;
        this.f4538r = new qsz();
        this.f4540t = false;
        this.f4541u = new ArrayList(5);
        this.f4539s = fczVar;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m5261E(Message message, xaj0 xaj0Var) {
        Literatures literatures;
        if (xaj0Var == null || (literatures = (Literatures) xaj0Var.a) == null) {
            return;
        }
        zvf0.A("e_chat_artwork_message", "p_chat_view", new j760[]{new j760("artwork_message_sent_from_me", Boolean.valueOf(message.isMe())), new j760("artwork_status", ldm.a(vwb.J((Collection) xaj0Var.c) ? null : (LiteraturesComments) ((List) xaj0Var.c).get(0), !vwb.J((Collection) xaj0Var.b) ? (LiteraturesComments) ((List) xaj0Var.b).get(0) : null)), new j760("artwork_title", literatures.title), new j760("artwork_type", ldm.b(literatures))});
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m5262F(Message message, Message message2) {
        return (int) (message.createdTime - message2.createdTime);
    }

    /* JADX INFO: renamed from: N */
    public static MessageTipsContent m5264N(Message message) {
        MessageExtData messageExtData;
        if (message == null || (messageExtData = message.extData) == null || messageExtData.chatTips == null || TEnum.equals(message.messageType, "love_letter")) {
            return null;
        }
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData2 = message.extData;
        return zIsMe ? messageExtData2.chatTips.selfShown : messageExtData2.chatTips.otherShown;
    }

    /* JADX INFO: renamed from: U */
    private View m5265U(ViewGroup viewGroup, int i) {
        if (!this.f4539s.m4231e4() && i >= 11000) {
            View viewM5272O = m5272O(viewGroup, i - 11000);
            CoreChatAiSendMomentItem coreChatAiSendMomentItem = (CoreChatAiSendMomentItem) this.f4539s.act().inflater().inflate(l6c0.e, viewGroup, false);
            coreChatAiSendMomentItem.addView(viewM5272O, 0, new ViewGroup.LayoutParams(xdl0.e, xdl0.f));
            return coreChatAiSendMomentItem;
        }
        if (!this.f4539s.m4231e4() && i >= 10000) {
            View viewM5272O2 = m5272O(viewGroup, i - 10000);
            ChatTipsItem chatTipsItem = (ChatTipsItem) this.f4539s.act().inflater().inflate(l6c0.n, viewGroup, false);
            chatTipsItem.addView(viewM5272O2, 0, new ViewGroup.LayoutParams(xdl0.e, xdl0.f));
            return chatTipsItem;
        }
        if (!this.f4539s.m4231e4() && CoreModule.P().b().Yg() && i >= 8000) {
            View viewM5272O3 = m5272O(viewGroup, i - 8000);
            ItemLoveBuzzUnlockLayout itemLoveBuzzUnlockLayout = (ItemLoveBuzzUnlockLayout) this.f4539s.act().inflater().inflate(l6c0.T0, viewGroup, false);
            itemLoveBuzzUnlockLayout.addView(viewM5272O3, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
            return itemLoveBuzzUnlockLayout;
        }
        if (CoreModule.P().i().c() && i >= 7000) {
            View viewM5272O4 = m5272O(viewGroup, i - 7000);
            ItemChatUnlockLayout itemChatUnlockLayout = (ItemChatUnlockLayout) this.f4539s.act().inflater().inflate(l6c0.o, viewGroup, false);
            itemChatUnlockLayout.addView(viewM5272O4, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
            return itemChatUnlockLayout;
        }
        if (i >= 5000) {
            View viewM5272O5 = m5272O(viewGroup, i - 5000);
            ItemChatSafetyReminder itemChatSafetyReminder = (ItemChatSafetyReminder) this.f4539s.act().inflater().inflate(l6c0.l, viewGroup, false);
            itemChatSafetyReminder.addView(viewM5272O5, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
            return itemChatSafetyReminder;
        }
        if (i >= 2000) {
            View viewM5272O6 = m5272O(viewGroup, i - ijkMediaStreamer.MEDIA_RECORDER_TRACK_INFO_LIST_END);
            UnMatchItem unMatchItem = (UnMatchItem) this.f4539s.act().inflater().inflate(l6c0.Q5, viewGroup, false);
            unMatchItem.addView(viewM5272O6, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
            return unMatchItem;
        }
        if (!this.f4539s.m4231e4() && CoreModule.P().i().c() && i >= 1000) {
            View viewM5272O7 = m5272O(viewGroup, i - 1000);
            ViewGroup viewGroup2 = (ViewGroup) this.f4539s.act().inflater().inflate(l6c0.f4, viewGroup, false);
            viewGroup2.addView(viewM5272O7, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
            return viewGroup2;
        }
        if (this.f4539s.m4231e4() || !CoreModule.P().b().Yg() || i < 1000) {
            return m5272O(viewGroup, i);
        }
        View viewM5272O8 = m5272O(viewGroup, i - 1000);
        ViewGroup viewGroup3 = (ViewGroup) this.f4539s.act().inflater().inflate(l6c0.U0, viewGroup, false);
        viewGroup3.addView(viewM5272O8, 0, new FrameLayout.LayoutParams(xdl0.e, xdl0.f));
        return viewGroup3;
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m5266H(String str) {
        Matcher matcher = Pattern.compile("(^[^ :：]+[ :：]).+").matcher(str);
        return matcher.find() ? i0g0.b0(str, vwb.f0(new String[]{matcher.group(1)}), a1c0.E, eqh0.m3924c(2)) : str;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m5267I(Message message) {
        StateData stateData;
        if (message == null || message.extData == null || !TEnum.equals(message.messageType, "moment_user_state")) {
            return false;
        }
        if (message.isOtherUser()) {
            return true;
        }
        try {
            stateData = (StateData) StateData.JSON_ADAPTER.parse(message.extData.extra);
        } catch (IOException e) {
            CrashHelper.c(e);
            stateData = null;
        }
        return NullChecker.a(stateData) && this.f4539s.m4255j3().mm >= 1 && NullChecker.a(CoreModule.N().Gc()) && TextUtils.equals(CoreModule.N().Gc().emotion.id, stateData.emotionId);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m5268J(int i) {
        if (i != 116) {
            return (i >= 118 && i <= 126) || i == 127 || i == 128 || i == 181 || i == 59 || i == 178 || i == 185 || i == 187 || i == 65 || i == 189 || i == 265 || i == 191 || i == 245 || i == 271 || i == 255 || i == 277 || i == 273 || i == 281;
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public String m5269K(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = (CoreAiStoryShareStatus) CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: L */
    public final List<String> m5270L(View view, int i) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                arrayList.add(i + ":" + childAt.getClass().getSimpleName());
                arrayList.addAll(m5270L(childAt, i + 1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final int m5271M(Message message, int i) {
        ChallengeMsg challengeMsgY5;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        if (!NullChecker.a(challengeMsgList) || vwb.J(challengeMsgList.msgData)) {
            challengeMsgY5 = null;
        } else {
            int iM5273P = m5273P(challengeMsgList.msgData);
            if (iM5273P != -1) {
                return iM5273P;
            }
            challengeMsgY5 = CoreModule.P().i().y5(challengeMsgList, message);
            if (NullChecker.a(challengeMsgY5)) {
                if (challengeMsgY5.type.equals("stripes") || challengeMsgY5.type.equals("stripes_without_button")) {
                    i = 215;
                }
                if (challengeMsgY5.type.equals("user_info_card")) {
                    i = 217;
                }
                if (challengeMsgY5.type.equals("normal_card")) {
                    i = TextUtils.equals(message.owner, CoreModule.H().userId()) ? 216 : 86;
                }
            }
        }
        if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
            boolean z = this.f4540t;
            i = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
            if (!z) {
                this.f4540t = true;
                if (NullChecker.a(challengeMsgY5)) {
                    zvf0.A("e_recall_message_notice", "p_chat_view", new j760[]{vwb.Y("in_harmony_test_string", challengeMsgY5.eventlog)});
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: O */
    public final View m5272O(ViewGroup viewGroup, int i) {
        View viewM5277T;
        int i2 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        if (i == 141 || i == 22 || i == 1 || i == 91 || i == 39 || i == 29 || i == 28 || i == 155 || i == 154 || i == 70) {
            ViewGroup viewGroup2 = (LinearLayout) this.f4539s.act().inflater().inflate(l6c0.K4, viewGroup, false);
            viewGroup2.setClipChildren(false);
            View viewInflate = this.f4539s.act().inflater().inflate((i == 141 || i == 22 || i == 1 || i == 91 || i == 39) ? l6c0.y5 : l6c0.x5, viewGroup2, false);
            if (i == 29 || i == 28) {
                i2 = 0;
            } else if (i != 155 && i != 154) {
                i2 = i - 1;
            }
            viewGroup2.addView(m5277T(viewGroup2, i2), xdl0.e, xdl0.f);
            viewGroup2.addView(viewInflate, xdl0.e, xdl0.f);
            return viewGroup2;
        }
        if (i != 142 && i != 144 && i != 143 && i != 147 && i != 149 && i != 148 && i != 203 && i != 202 && i != 227 && i != 226 && i != 222) {
            if (i == 189) {
                ViewGroup viewGroup3 = (LinearLayout) this.f4539s.act().inflater().inflate(l6c0.K4, viewGroup, false);
                viewGroup3.setClipChildren(false);
                View viewInflate2 = this.f4539s.act().inflater().inflate(l6c0.p1, viewGroup, false);
                viewGroup3.addView(m5277T(viewGroup3, 116), xdl0.e, xdl0.f);
                viewGroup3.addView(viewInflate2, xdl0.e, xdl0.f);
                return viewGroup3;
            }
            if (i == 265) {
                ViewGroup viewGroup4 = (LinearLayout) this.f4539s.act().inflater().inflate(l6c0.K4, viewGroup, false);
                viewGroup4.setClipChildren(false);
                View viewInflate3 = this.f4539s.act().inflater().inflate(l6c0.R0, viewGroup, false);
                viewGroup4.addView(m5277T(viewGroup4, 116), xdl0.e, xdl0.f);
                viewGroup4.addView(viewInflate3, xdl0.e, xdl0.f);
                return viewGroup4;
            }
            if (i != 68) {
                return m5277T(viewGroup, i);
            }
            AppCompatTextView vText = new VText(this.f4539s.act());
            vText.setLayoutParams(new ViewGroup.LayoutParams(xdl0.e, t100.d(50.0f)));
            vText.setGravity(17);
            return vText;
        }
        LinearLayout linearLayout = (LinearLayout) this.f4539s.act().inflater().inflate(l6c0.K4, viewGroup, false);
        if (i == 143 || i == 148) {
            viewM5277T = m5277T(linearLayout, 67);
        } else if (i == 144 || i == 149) {
            viewM5277T = m5277T(linearLayout, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        } else if (i == 202 || i == 203) {
            viewM5277T = m5277T(linearLayout, 69);
        } else {
            viewM5277T = (i == 226 || i == 227) ? m5277T(linearLayout, 90) : m5277T(linearLayout, 0);
        }
        linearLayout.addView(viewM5277T, xdl0.e, xdl0.f);
        AppCompatTextView vText2 = new VText(viewGroup.getContext());
        if (i == 142 || i == 143 || i == 144 || i == 202 || i == 226 || i == 222) {
            vText2.setText(m5266H(this.f4539s.act().string(R.string.k3)));
        } else {
            vText2.setText(m5266H(this.f4539s.act().string(R.string.l3)));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        vText2.setTextColor(this.f4539s.act().color(ura.e().d().I4() ? a1c0.i : a1c0.H));
        vText2.setTextSize(13.0f);
        int i3 = t100.y;
        layoutParams.setMargins(i3, 0, i3, t100.d(16.0f));
        vText2.setGravity(17);
        int i4 = t100.h;
        int i5 = t100.g;
        vText2.setPadding(i4, i5, i4, i5);
        linearLayout.addView((View) vText2, (ViewGroup.LayoutParams) layoutParams);
        return linearLayout;
    }

    /* JADX INFO: renamed from: P */
    public final int m5273P(List<ChallengeMsg> list) {
        return TextUtils.equals(list.get(0).type, "middle_text") ? 240 : -1;
    }

    /* JADX INFO: renamed from: Q */
    public int m5274Q(Message message, int i) {
        int i2;
        Boolean bool;
        if (this.f4539s.m4255j3() == null) {
            return CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        int iM5275R = m5275R(message, i);
        if ((NullChecker.a(this.f4539s.m4325x6()) && this.f4539s.m4325x6().unilateralBlock() && ((DbObject) message).id.startsWith("fake_id_")) || (((i2 = message.localFailType) == 5 || i2 == 7 || i2 == 6 || i2 == 8) && ((DbObject) message).id.startsWith("fake_id_"))) {
            return iM5275R + ijkMediaStreamer.MEDIA_RECORDER_TRACK_INFO_LIST_END;
        }
        if (!TEnum.equals(message.channel, "group") && CoreModule.P().i().c() && CoreModule.P().i().c0(message.cid, ((DbObject) message).id)) {
            return iM5275R + 1000;
        }
        if (message.localSafetyReminder || message.localSensitiveWordReminder) {
            return iM5275R + 5000;
        }
        if (CoreModule.P().i().c() && (CoreModule.P().i().e1(message.cid, ((DbObject) message).id) || CoreModule.P().i().r3(message.cid, ((DbObject) message).id) || CoreModule.P().i().l4(message.cid, ((DbObject) message).id))) {
            return iM5275R + 7000;
        }
        if (m5278V(message) && ((bool = message.recalled) == null || !bool.booleanValue())) {
            return iM5275R + 9000;
        }
        if (CoreModule.P().b().Yg() && CoreModule.P().b().Jp(message.cid, ((DbObject) message).id)) {
            return iM5275R + 8000;
        }
        if (CoreModule.P().b().Yg() && CoreModule.P().b().gh(message.cid, ((DbObject) message).id)) {
            return iM5275R + 1000;
        }
        if (m5280X(message)) {
            return iM5275R + 10000;
        }
        return m5279W(message) ? iM5275R + 11000 : iM5275R;
    }

    /* JADX WARN: Code duplicated, block: B:676:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:688:0x0a4a A[PHI: r4
      0x0a4a: PHI (r4v47 int) = (r4v46 int), (r4v46 int), (r4v46 int), (r4v51 int), (r4v51 int), (r4v51 int) binds: [B:735:0x0afc, B:729:0x0ae7, B:723:0x0ad4, B:699:0x0a72, B:693:0x0a5d, B:687:0x0a48] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: R */
    public final int m5275R(Message message, int i) {
        int i2;
        int size;
        int size2;
        MessageFeedbackStatus messageFeedbackStatus;
        int i3;
        Boolean bool;
        int i4;
        int i5;
        int i6;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        SystemReminder systemReminder;
        Boolean bool13;
        StateData stateData;
        int i7 = message.owner.equals(CoreModule.H().userId()) ? 116 : 0;
        if ((CoreModule.P().i().z(message.owner) || ruy.m7381g().m7392o(this.f4539s.m4255j3())) && i7 == 0 && !TEnum.equals(message.messageType, "exchange_picture")) {
            return (NullChecker.a(message.media) && message.media.size() > 0 && ((message.media.get(0) instanceof Video) || (message.media.get(0) instanceof Picture))) ? i7 + 49 : i7 + 48;
        }
        if (TEnum.equals(message.messageType, "picture_compliment")) {
            if (message.isMe()) {
                return 281;
            }
            return EACTags.DISCRETIONARY_DATA_OBJECTS;
        }
        if (TEnum.equals(message.messageType, "local_platinum_pin_guide")) {
            return 257;
        }
        if (TEnum.equals(message.messageType, "local_o_diamond_visitor_guide")) {
            return 267;
        }
        if (TEnum.equals(message.messageType, "local_ux_questionnaire")) {
            return 268;
        }
        if (TEnum.equals(message.messageType, "local_wechat_notify_guide")) {
            return 266;
        }
        if (TEnum.equals(message.messageType, "local_long_time_no_see")) {
            return 258;
        }
        if (TEnum.equals(message.messageType, "common_tip_box")) {
            return 264;
        }
        if (TEnum.equals(message.messageType, "common_tip_box_v2") || TEnum.equals(message.messageType, "mm_task")) {
            return 53;
        }
        if (TEnum.equals(message.messageType, "ai_chat_analysis")) {
            return 275;
        }
        if (TEnum.equals(message.messageType, "ai_chat_analysis_guide")) {
            return 278;
        }
        if (TEnum.equals(message.messageType, "prologue")) {
            if (!message.isMe()) {
                return 114;
            }
            if (message.recalled.booleanValue()) {
                return CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
            }
            return 277;
        }
        if (TEnum.equals(message.messageType, "wanwan_invite")) {
            if (message.isMe()) {
                return HttpStatus.NO_CONTENT_204;
            }
            return 87;
        }
        if (TEnum.equals(message.messageType, "wanwan_tip")) {
            return 219;
        }
        if (TEnum.equals(message.messageType, "local_friend_active_remind_female")) {
            return 249;
        }
        if (TEnum.equals(message.messageType, "continuous_chat_tip")) {
            return 252;
        }
        if (TEnum.equals(message.messageType, "female_unreply_reminder")) {
            return 250;
        }
        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
            return 192;
        }
        if (TEnum.equals(message.messageType, "local_visitor_hide_footprint")) {
            return 261;
        }
        if (TEnum.equals(message.messageType(), "operation")) {
            Boolean bool14 = message.recalled;
            if (bool14 == null || !bool14.booleanValue()) {
                return 57;
            }
            return CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType(), "live_vip_greet")) {
            return 56;
        }
        if (TEnum.equals(message.messageType(), "ai_story_text")) {
            return 0;
        }
        if (TEnum.equals(message.messageType, "christmas_match")) {
            return 198;
        }
        if (TEnum.equals(message.messageType(), "chat_gift") || TEnum.equals(message.messageType(), "moment_gift")) {
            ChatGiftInfoExtra chatGiftInfoExtraK2 = CoreModule.P().i().K2(message);
            boolean z = NullChecker.a(chatGiftInfoExtraK2) && chatGiftInfoExtraK2.needOpen;
            if (message.isMe()) {
                return z ? CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 : CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384;
            }
            return z ? 66 : 62;
        }
        if (TEnum.equals(message.messageType(), "moment_notification")) {
            return 53;
        }
        if (TEnum.equals(message.messageType(), "local_countdown_like_notify")) {
            return CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType(), "local_countdown_like_success")) {
            return CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType(), "heartbeat_notify")) {
            return HttpStatus.MULTI_STATUS_207;
        }
        if (TEnum.equals(message.messageType(), "heartbeat_waiting_response")) {
            return 208;
        }
        if (TEnum.equals(message.messageType(), "heartbeat_success")) {
            return 209;
        }
        if (TEnum.equals(message.messageType(), "local_break_ice")) {
            return 218;
        }
        if (TEnum.equals(message.messageType(), "local_love_buzz_break_ice")) {
            return 234;
        }
        if (TEnum.equals(message.messageType(), "chatroom_share")) {
            if (qib0.b0.c.lp()) {
                return message.isMe() ? 224 : 89;
            }
            if (TextUtils.equals(message.owner, CoreModule.H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType(), "tantan_verify_toast")) {
            Message messageM5294m = i > 0 ? m5294m(i - 1) : null;
            Message messageM5294m2 = i < m5287d() - 1 ? m5294m(i + 1) : null;
            if ((!NullChecker.a(messageM5294m) || messageM5294m.createdTime != message.createdTime) && (!NullChecker.a(messageM5294m2) || messageM5294m2.createdTime != message.createdTime)) {
                return CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
            }
            Message messageClone = message.clone();
            messageClone.createdTime += 1.0d;
            messageClone.localCreatedTime++;
            CoreModule.c.f0.ah(messageClone, false);
            return CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
        }
        if (TEnum.equals(message.messageType(), "local_greeting_match_success") || TEnum.equals(message.messageType(), "local_chat_greeting_tip")) {
            return 188;
        }
        if (TEnum.equals(message.messageType, "red_packet_notification")) {
            return CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
        }
        if (TEnum.equals(message.messageType(), "local_friend_comment_toast")) {
            return CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (TEnum.equals(message.messageType, "local_real_shot_tips")) {
            return CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType, "local_normal_tips") || TEnum.equals(message.messageType, "local_push_switch") || TEnum.equals(message.messageType, "local_push_switch_plus")) {
            return CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType, "common_double_title_icon_click")) {
            return 241;
        }
        if (TEnum.equals(message.messageType, "moment_user_state") && ((bool13 = message.recalled) == null || !bool13.booleanValue())) {
            if (message.isOtherUser()) {
                return TextUtils.equals(CoreModule.P().a().lq(), "normal_message") ? 0 : 96;
            }
            try {
                stateData = (StateData) StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if (NullChecker.a(stateData) && TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
                return 260;
            }
            return m5267I(message) ? 244 : 97;
        }
        if (TEnum.equals(message.messageType, "system_reminder")) {
            boolean z2 = this.f4539s.m4188W2().compareTo(((DbObject) message).id) >= 0;
            MessageAdditionalData messageAdditionalData = message.additionalData;
            if (messageAdditionalData == null || (systemReminder = messageAdditionalData.systemReminder) == null) {
                return 97;
            }
            return (systemReminder.showOnce && z2) ? 97 : 106;
        }
        if (TEnum.equals(message.messageType, "ai_picture") && ((bool12 = message.recalled) == null || !bool12.booleanValue())) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, "icebreak_qa") && ((bool11 = message.recalled) == null || !bool11.booleanValue())) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, "love_letter")) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType(), "tickle") || TEnum.equals(message.messageType(), "local_tickle_tip") || TEnum.equals(message.messageType(), "local_create_chat_group")) {
            return CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384;
        }
        if (TEnum.equals(message.messageType(), "conversation_notification") || TEnum.equals(message.messageType(), "common_tip_list_show") || TEnum.equals(message.messageType(), "common_tip") || TEnum.equals(message.messageType(), "local_ux_questionnaire_tip") || TEnum.equals(message.messageType(), "local_heart_beat_lock_tip")) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType(), "oneweekcp_task")) {
            message.messageType = MessageType.get("unknown_");
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, "local_chanllenge_tips")) {
            return 220;
        }
        if (TEnum.equals(message.messageType, "real_shot") && ((bool10 = message.recalled) == null || !bool10.booleanValue())) {
            if (message.isMe()) {
                return CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256;
            }
            return 65;
        }
        if (TEnum.equals(message.messageType, "wooden_fish")) {
            message.messageType = MessageType.get("unknown_");
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, "local_chat_assistant_question_new")) {
            return 248;
        }
        if (TEnum.equals(message.messageType, "two_sides_different_tip")) {
            return 251;
        }
        if (TEnum.equals(message.messageType, "chat_assistant_question")) {
            if (!message.isMe()) {
                return 101;
            }
            if (NullChecker.a(message.extData) && TextUtils.equals(message.extData.extra, "user")) {
                return 246;
            }
            if (NullChecker.a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
                return 247;
            }
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        if (TEnum.equals(message.messageType, "local_intl_prompt_message_type")) {
            return 262;
        }
        if (!this.f4539s.m4231e4() && ((CoreModule.P().i().t() || CoreModule.P().i().B()) && i >= this.f4539s.f3560r.a.size() && NullChecker.a(this.f4539s.m4325x6()))) {
            if (!TextUtils.isEmpty(this.f4539s.m4325x6().sendLetter) && !TextUtils.isEmpty(this.f4539s.f3557p)) {
                long j = this.f4539s.m4325x6().sendLetterTimestamp;
                fcz<?, ?> fczVar = this.f4539s;
                if (j > fczVar.f3559q) {
                    if (i == fczVar.f3560r.a.size()) {
                        return 27;
                    }
                    return CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
                }
                if (i == fczVar.f3560r.a.size()) {
                    return CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
                }
                return 27;
            }
            if (!TextUtils.isEmpty(this.f4539s.m4325x6().sendLetter)) {
                return 27;
            }
            if (!TextUtils.isEmpty(this.f4539s.f3557p)) {
                return CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
            }
        }
        if (message.chatTyping) {
            return 30;
        }
        if (NullChecker.a(message.reminder) && NullChecker.a(message.moment)) {
            return CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;
        }
        Boolean bool15 = message.recalled;
        if (bool15 != null && bool15.booleanValue()) {
            i3 = 140;
        } else {
            if (TextUtils.equals(message.owner, "-1") && TEnum.equals(message.messageType, TextBundle.TEXT_ENTRY) && !TextUtils.isEmpty(message.answerOfMessage)) {
                return 55;
            }
            if (NullChecker.a(message.moment)) {
                size = 21;
            } else if (NullChecker.a(message.likeOfMoment)) {
                size = 23;
            } else if (NullChecker.a(message.location)) {
                size = 20;
            } else if (NullChecker.a(message.sticker)) {
                size = 12;
            } else if (NullChecker.a(message.question)) {
                Question questionO3 = CoreModule.c.d0.o3(message.question);
                List list = questionO3 == null ? null : questionO3.answers;
                if (questionO3 == null) {
                    CrashHelper.c(new IllegalStateException("MessagesAdapter unable to query question id : " + (NullChecker.a(message.question) ? message.question : "") + " message id : " + ((DbObject) message).id));
                }
                if (TextUtils.equals(message.owner, "-1") && (list == null || list.size() == 0)) {
                    return 55;
                }
                size = (list == null ? 0 : list.size()) + 13;
            } else {
                List list2 = message.media;
                if (list2 == null || list2.size() == 0) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    boolean z3 = message.media.get(0) instanceof Video;
                    List list3 = message.media;
                    if (z3) {
                        size2 = list3.size();
                    } else {
                        boolean z4 = list3.get(0) instanceof Picture;
                        List list4 = message.media;
                        if (z4) {
                            size2 = list4.size();
                        } else if (list4.get(0) instanceof Audio) {
                            size = 11;
                        }
                    }
                    size = size2 + 1;
                }
                size = i2;
            }
            if ((TEnum.equals(message.messageType(), "tickle") || TEnum.equals(message.messageType(), "local_tickle_tip")) && size != 49 && size != 48) {
                return CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384;
            }
            if (TEnum.equals(message.messageType, "ai_picture_query_auth")) {
                return 53;
            }
            if (zbq.m9391R(message) && message.isOtherUser()) {
                return 53;
            }
            if (TEnum.equals(message.messageType(), "monetization_pending_payment_guidance") && message.isOtherUser()) {
                return 53;
            }
            if (ubq.m8119q(message)) {
                if (!message.isOtherUser()) {
                    return CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                }
                if (this.f4531k.contains(((DbObject) message).id) || !message.msgData.contains("enterVoiceRoomPackageGiftRecall")) {
                    return 64;
                }
                this.f4531k.add(((DbObject) message).id);
                zvf0.A("e_live_audio_room_enter", "p_chat_view", new j760[]{new j760("audio_card_type", "message_audio_assistant"), new j760("liveId", ""), new j760("anchorId", ""), new j760("topic_id", ""), new j760("audio_room_type", "")});
                return 64;
            }
            if (ubq.m8118p(message) && message.isOtherUser()) {
                if (this.f4535o.contains(((DbObject) message).id) || !ubq.m8118p(message)) {
                    return 88;
                }
                this.f4535o.add(((DbObject) message).id);
                zvf0.x("e_personalized_recommendation_helper", "p_messages_view");
                return 88;
            }
            if (TEnum.equals(message.messageType, "literature")) {
                if (message.isMe()) {
                    return HttpStatus.CREATED_201;
                }
                return 71;
            }
            if (TEnum.equals(message.messageType, "feedback") || message.value.contains("feedback")) {
                if (NullChecker.a(message.msgData)) {
                    try {
                        messageFeedbackStatus = (MessageFeedbackStatus) MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
                    } catch (IOException unused2) {
                        messageFeedbackStatus = null;
                    }
                } else {
                    messageFeedbackStatus = null;
                }
                if (NullChecker.a(messageFeedbackStatus)) {
                    String str = messageFeedbackStatus.feedback_category;
                    if (TextUtils.equals(str, "solved") || TextUtils.equals(str, "satisfied")) {
                        return 72;
                    }
                    if (TextUtils.equals(str, "reason")) {
                        return messageFeedbackStatus.question.answers.size() + 73;
                    }
                }
            }
            if (!TextUtils.isEmpty(message.referenceMsgId) && !TEnum.equals(message.messageType, "state_like") && !TEnum.equals(message.messageType, "state_comment")) {
                if (message.isMe()) {
                    return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384;
                }
                return 60;
            }
            if (TEnum.equals(message.messageType, "hide_for_fake_user")) {
                if (y19.K()) {
                    return 102;
                }
                if (message.isMe()) {
                    return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
                }
                return 53;
            }
            int i8 = size + i7;
            if (TEnum.equals(message.messageType, "state_like") || TEnum.equals(message.messageType, "state_comment")) {
                i8 = message.isMe() ? 200 : 69;
            }
            if (TEnum.equals(message.messageType, "profile_like") && ((bool = message.recalled) == null || !bool.booleanValue())) {
                i3 = message.isMe() ? 225 : 90;
            } else if (TEnum.equals(message.messageType, "exclusive_chat_invite")) {
                i3 = message.isMe() ? 229 : 92;
            } else {
                i3 = i8;
            }
        }
        if (TEnum.equals(message.messageType(), "profile_cover_like") && ((bool9 = message.recalled) == null || !bool9.booleanValue())) {
            i3 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType(), "profile_cover_comment") && ((bool8 = message.recalled) == null || !bool8.booleanValue())) {
            i3 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType(), "mood_like") && ((bool7 = message.recalled) == null || !bool7.booleanValue())) {
            i3 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType(), "mood_comment") && ((bool6 = message.recalled) == null || !bool6.booleanValue())) {
            i3 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType, "profile_like") && NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
            i3 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (TEnum.equals(message.messageType(), "moment_comment") && ((bool5 = message.recalled) == null || !bool5.booleanValue())) {
            i3 = message.isMe() ? CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 : 67;
        }
        if (i7 == 0 && NullChecker.a(this.f4539s.m4191W5()) && NullChecker.a(this.f4539s.m4325x6()) && Math.abs(this.f4539s.m4255j3().localBotheringTime) == message.createdTime && TEnum.equals(this.f4539s.m4191W5().gender, "female") && TEnum.equals(this.f4539s.m4325x6().gender, "male")) {
            i4 = i3 + 1;
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f4539s.m4255j3().localBotherWxTime) == message.createdTime) {
            if (NullChecker.a(message.moment)) {
                i4 = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                boolean zEquals = TEnum.equals(message.messageType, "state_like");
                i5 = CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA;
                if (!zEquals && !TEnum.equals(message.messageType, "state_comment")) {
                    boolean zEquals2 = TEnum.equals(message.messageType, "profile_like");
                    Boolean bool16 = message.recalled;
                    if (zEquals2) {
                        if (NullChecker.a(bool16) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 226;
                        }
                    } else if (NullChecker.a(bool16) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA;
                    }
                } else if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
                    i4 = i5;
                } else {
                    i4 = HttpStatus.ACCEPTED_202;
                }
            }
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f4539s.m4255j3().localBotherCodeTime) == message.createdTime) {
            if (NullChecker.a(message.moment)) {
                i4 = CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                boolean zEquals3 = TEnum.equals(message.messageType, "state_like");
                i5 = CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA;
                if (!zEquals3 && !TEnum.equals(message.messageType, "state_comment")) {
                    boolean zEquals4 = TEnum.equals(message.messageType, "profile_like");
                    Boolean bool17 = message.recalled;
                    if (zEquals4) {
                        if (NullChecker.a(bool17) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 227;
                        }
                    } else if (NullChecker.a(bool17) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA;
                    }
                } else if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
                    i4 = i5;
                } else {
                    i4 = HttpStatus.NON_AUTHORITATIVE_INFORMATION_203;
                }
            }
        } else if (!TEnum.equals(message.messageType(), "letter")) {
            i4 = i3;
        } else if (i7 == 116) {
            i4 = CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
        } else {
            i4 = 27;
        }
        if (TEnum.equals(message.messageType(), "contact_info_rejection")) {
            i4 = CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
        }
        if (TEnum.equals(message.messageType(), "reminder")) {
            i4 = message.isMe() ? CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 : 34;
        }
        if (TEnum.equals(message.messageType, "moment_chat") && ((bool4 = message.recalled) == null || !bool4.booleanValue())) {
            i4 = message.isMe() ? CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 : 35;
        }
        if (TEnum.equals(message.messageType, "survey") && ((bool3 = message.recalled) == null || !bool3.booleanValue())) {
            i4 = 41;
        }
        if (TEnum.equals(message.messageType, "card") && ((bool2 = message.recalled) == null || !bool2.booleanValue())) {
            i4 = message.isMe() ? CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 : 40;
        }
        if (TEnum.equals(message.messageType, "local_user_moment_message")) {
            i4 = HttpStatus.RESET_CONTENT_205;
        } else if (TEnum.equals(message.messageType(), "local_moment_post_guide")) {
            i4 = 228;
        }
        if (TEnum.equals(message.messageType, "voice_call")) {
            if (NullChecker.a(message.additionalData)) {
                i4 = message.isMe() ? CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 : 42;
            } else {
                i4 = message.isMe() ? 173 : 53;
            }
        }
        if (TEnum.equals(message.messageType, "call_2_buy") && !TextUtils.isEmpty(message.msgData)) {
            i4 = 50;
        }
        if (TEnum.equals(message.messageType, "ice_breaking")) {
            i4 = message.isMe() ? CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 : 59;
        }
        if (TEnum.equals(message.messageType, "red_packet")) {
            i4 = message.isMe() ? CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 : 61;
        }
        if (TEnum.equals(message.messageType, "new_survey")) {
            return 63;
        }
        int i9 = 116;
        if (i7 == 116) {
            if (NullChecker.a(this.f4539s.m4325x6()) && !this.f4539s.m4325x6().unilateralBlock() && ((i6 = message.localFailType) == 3 || i6 == 4)) {
                return CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256;
            }
            i9 = 116;
        }
        if (i7 == i9 && message.localFailType == 9) {
            return 265;
        }
        if (TEnum.equals(message.messageType, "local_chat_inc_temp_warn")) {
            return 68;
        }
        if (TEnum.equals(message.messageType, "group_invitation")) {
            if (TextUtils.equals(message.owner, CoreModule.H().userId())) {
                return HttpStatus.PARTIAL_CONTENT_206;
            }
            return 84;
        }
        if (TEnum.equals(message.messageType, "tag_guide")) {
            return 223;
        }
        if (TEnum.equals(message.messageType, "local_match_ice_break")) {
            return 239;
        }
        if (TEnum.equals(message.messageType, "local_ai_p2p_chat_guide")) {
            return 253;
        }
        if (TEnum.equals(message.messageType, "local_pic_cert_guide")) {
            return 256;
        }
        if (TEnum.equals(message.messageType, "local_intl_read_receipts_guide")) {
            return 279;
        }
        if (TEnum.equals(message.messageType, "local_birthday_tip")) {
            return 242;
        }
        if (TEnum.equals(message.messageType, "local_ideal_enquiry")) {
            return 269;
        }
        if (TEnum.equals(message.messageType, "local_love_letter_guide")) {
            return 270;
        }
        if (TEnum.equals(message.messageType, "local_invitation_for_authentication")) {
            return 272;
        }
        if (TEnum.equals(message.messageType(), "tacit_test")) {
            return m5271M(message, i4);
        }
        if (TEnum.equals(message.messageType(), "picture_text_deeplink")) {
            return m5276S(message, i4);
        }
        if (TEnum.equals(message.messageType, "local_add_tags_guide")) {
            if (vwb.J(CoreModule.P().i().N4())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 235;
        }
        if (TEnum.equals(message.messageType, "local_add_artwork_guide")) {
            if (vwb.J(CoreModule.c.s1.X) || CoreModule.c.s1.X.size() < 3) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 236;
        }
        if (TEnum.equals(message.messageType, "local_send_tags_text")) {
            return 237;
        }
        if (TEnum.equals(message.messageType, "local_send_artwork_text")) {
            return 238;
        }
        if (TEnum.equals(message.messageType, "harass_alert")) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
            }
            return 104;
        }
        if (TEnum.equals(message.messageType, "marriage_prologue")) {
            return message.isMe() ? 259 : 108;
        }
        if (i4 != 140 && message.messageType().isUnknownType()) {
            if (TextUtils.equals(message.owner, CoreModule.H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, "exchange_picture")) {
            if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
                return CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
            }
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (!TEnum.equals(message.messageType, "limit_time_picture")) {
            if (TEnum.equals(message.messageType, "local_blindbox_guide")) {
                return 53;
            }
            return i4;
        }
        if (NullChecker.a(message.recalled) && message.recalled.booleanValue()) {
            return CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        }
        if (message.isMe()) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: S */
    public final int m5276S(Message message, int i) {
        if (TextUtils.equals(message.owner, CoreModule.H().userId())) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: T */
    public View m5277T(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (i == 140) {
            return this.f4539s.act().inflater().inflate(l6c0.B5, viewGroup, false);
        }
        if (i == 158) {
            return this.f4539s.act().inflater().inflate(l6c0.d5, viewGroup, false);
        }
        if (i == 145) {
            return this.f4539s.act().inflater().inflate(l6c0.F5, viewGroup, false);
        }
        if (i == 171 || i == 176 || i == 193 || i == 197) {
            if (i == 171 && !this.f4536p) {
                zvf0.x("e_toast_chat_page_verification_guide", "p_chat_view");
                this.f4536p = true;
            }
            return this.f4539s.act().inflater().inflate(l6c0.I3, viewGroup, false);
        }
        if (i == 192) {
            return this.f4539s.act().inflater().inflate(l6c0.M3, viewGroup, false);
        }
        if (i == 184) {
            return this.f4539s.act().inflater().inflate(l6c0.F3, viewGroup, false);
        }
        if (i == 175) {
            return this.f4539s.act().inflater().inflate(l6c0.G2, viewGroup, false);
        }
        if (i == 188) {
            return this.f4539s.act().inflater().inflate(l6c0.b0, viewGroup, false);
        }
        if (i == 182 || i == 251) {
            return this.f4539s.act().inflater().inflate(l6c0.u, viewGroup, false);
        }
        if (i == 63) {
            return this.f4539s.act().inflater().inflate(l6c0.l2, viewGroup, false);
        }
        if (i == 205) {
            return this.f4539s.act().inflater().inflate(l6c0.s3, viewGroup, false);
        }
        if (i == 228) {
            return this.f4539s.act().inflater().inflate(l6c0.t3, viewGroup, false);
        }
        if (i == 194) {
            return this.f4539s.act().inflater().inflate(l6c0.R2, viewGroup, false);
        }
        if (i == 195) {
            return this.f4539s.act().inflater().inflate(l6c0.S2, viewGroup, false);
        }
        if (i == 198) {
            return this.f4539s.act().inflater().inflate(l6c0.O1, viewGroup, false);
        }
        if (i == 219) {
            return this.f4539s.act().inflater().inflate(l6c0.Q1, viewGroup, false);
        }
        if (i == 249 || i == 252) {
            return this.f4539s.act().inflater().inflate(l6c0.n, viewGroup, false);
        }
        if (i == 250) {
            return this.f4539s.act().inflater().inflate(l6c0.J, viewGroup, false);
        }
        if (i == 207 || i == 208) {
            return this.f4539s.act().inflater().inflate(l6c0.E1, viewGroup, false);
        }
        if (i == 209) {
            return this.f4539s.act().inflater().inflate(l6c0.F1, viewGroup, false);
        }
        if (i == 218) {
            return this.f4539s.act().inflater().inflate(l6c0.Q2, viewGroup, false);
        }
        if (i == 217) {
            return this.f4539s.act().inflater().inflate(l6c0.K1, viewGroup, false);
        }
        if (i == 215) {
            return this.f4539s.act().inflater().inflate(l6c0.x1, viewGroup, false);
        }
        if (i == 241) {
            return this.f4539s.act().inflater().inflate(l6c0.q1, viewGroup, false);
        }
        if (i == 220) {
            return this.f4539s.act().inflater().inflate(l6c0.l1, viewGroup, false);
        }
        if (i == 223) {
            return this.f4539s.act().inflater().inflate(l6c0.H3, viewGroup, false);
        }
        if (i == 239) {
            return this.f4539s.act().inflater().inflate(l6c0.a2, viewGroup, false);
        }
        if (i == 253) {
            return this.f4539s.act().inflater().inflate(l6c0.O2, viewGroup, false);
        }
        if (i == 256) {
            return this.f4539s.act().inflater().inflate(l6c0.x3, viewGroup, false);
        }
        if (i == 258) {
            return this.f4539s.act().inflater().inflate(l6c0.i3, viewGroup, false);
        }
        if (i == 257) {
            return this.f4539s.act().inflater().inflate(l6c0.x2, viewGroup, false);
        }
        if (i == 267) {
            return this.f4539s.act().inflater().inflate(l6c0.o2, viewGroup, false);
        }
        if (i == 266) {
            return this.f4539s.act().inflater().inflate(l6c0.J2, viewGroup, false);
        }
        if (i == 268) {
            return this.f4539s.act().inflater().inflate(l6c0.g3, viewGroup, false);
        }
        if (i == 109) {
            return this.f4539s.act().inflater().inflate(l6c0.P2, viewGroup, false);
        }
        if (i == 234) {
            return this.f4539s.act().inflater().inflate(l6c0.j3, viewGroup, false);
        }
        if (i == 231) {
            return this.f4539s.act().inflater().inflate(l6c0.E4, viewGroup, false);
        }
        if (i == 235) {
            return this.f4539s.act().inflater().inflate(l6c0.M2, viewGroup, false);
        }
        if (i == 236) {
            return this.f4539s.act().inflater().inflate(l6c0.L2, viewGroup, false);
        }
        if (i == 237 || i == 238) {
            return this.f4539s.act().inflater().inflate(l6c0.G3, viewGroup, false);
        }
        if (i == 240) {
            return this.f4539s.act().inflater().inflate(l6c0.c2, viewGroup, false);
        }
        if (i == 242) {
            return this.f4539s.act().inflater().inflate(l6c0.Z1, viewGroup, false);
        }
        if (i == 243) {
            return this.f4539s.act().inflater().inflate(l6c0.C4, viewGroup, false);
        }
        if (i == 244) {
            return this.f4539s.act().inflater().inflate(l6c0.S1, viewGroup, false);
        }
        if (i == 248) {
            return this.f4539s.act().inflater().inflate(l6c0.m1, viewGroup, false);
        }
        if (i == 247) {
            return this.f4539s.act().inflater().inflate(l6c0.n1, viewGroup, false);
        }
        if (i == 251) {
            return this.f4539s.act().inflater().inflate(l6c0.u, viewGroup, false);
        }
        if (i == 104) {
            return this.f4539s.act().inflater().inflate(l6c0.U3, viewGroup, false);
        }
        if (i == 106) {
            return this.f4539s.act().inflater().inflate(l6c0.V3, viewGroup, false);
        }
        if (i == 97) {
            return new View(this.f4539s.act());
        }
        if (i == 261) {
            return this.f4539s.act().inflater().inflate(l6c0.H2, viewGroup, false);
        }
        if (i == 262) {
            return this.f4539s.act().inflater().inflate(l6c0.t, viewGroup, false);
        }
        if (i == 279) {
            return this.f4539s.act().inflater().inflate(l6c0.I1, viewGroup, false);
        }
        if (i == 264) {
            return this.f4539s.act().inflater().inflate(l6c0.p, viewGroup, false);
        }
        if (i == 274) {
            return this.f4539s.act().inflater().inflate(l6c0.q, viewGroup, false);
        }
        if (i == 276) {
            return this.f4539s.act().inflater().inflate(l6c0.e2, viewGroup, false);
        }
        if (i == 275) {
            return this.f4539s.act().inflater().inflate(l6c0.d1, viewGroup, false);
        }
        if (i == 278) {
            return this.f4539s.act().inflater().inflate(l6c0.N2, viewGroup, false);
        }
        if (i == 269) {
            return this.f4539s.act().inflater().inflate(l6c0.T1, viewGroup, false);
        }
        if (i == 270) {
            return this.f4539s.act().inflater().inflate(l6c0.V1, viewGroup, false);
        }
        if (i == 272) {
            return this.f4539s.act().inflater().inflate(l6c0.b3, viewGroup, false);
        }
        boolean z = i >= 116;
        ItemMessageBase itemMessageBase = (ItemMessageBase) this.f4539s.act().inflater().inflate(z ? l6c0.i5 : l6c0.h5, viewGroup, false);
        int i3 = l6c0.L5;
        if (i == 23) {
            i3 = l6c0.q5;
        } else if (i == 139) {
            i3 = l6c0.r5;
        } else if (i == 21) {
            i3 = l6c0.b5;
        } else if (i == 137) {
            i3 = l6c0.c5;
        } else if (i == 35) {
            i3 = l6c0.u5;
        } else if (i == 161) {
            i3 = l6c0.v5;
        } else if (i == 0 || i == 56) {
            i3 = l6c0.I5;
        } else if (i == 48) {
            i3 = l6c0.G4;
        } else if (i == 41) {
            i3 = l6c0.K5;
        } else if (i == 116) {
            i3 = l6c0.J5;
        } else if (i == 49) {
            i3 = l6c0.F4;
        } else if (i >= 2 && i <= 10) {
            i3 = l6c0.f5;
            i2 = i - 2;
        } else if (i >= 118 && i <= 126) {
            i3 = l6c0.g5;
            i2 = i - 118;
        } else if (i == 11) {
            i3 = l6c0.U4;
        } else if (i == 127) {
            i3 = l6c0.V4;
        } else if (i == 12 || i == 128) {
            i3 = l6c0.G5;
        } else if (i >= 13 && i <= 19) {
            i3 = l6c0.z5;
            i2 = i - 13;
        } else if (i >= 129 && i <= 135) {
            i3 = l6c0.A5;
            i2 = i - 129;
        } else if (i == 20) {
            i3 = l6c0.s5;
        } else if (i == 136) {
            i3 = l6c0.t5;
        } else if (i == 27) {
            i3 = l6c0.R5;
        } else if (i == 153) {
            i3 = l6c0.S5;
        } else if (i == 30) {
            i3 = l6c0.f5;
            i2 = 1;
        } else if (i == 34) {
            i3 = l6c0.D5;
        } else if (i == 160) {
            i3 = l6c0.E5;
        } else if (i == 40) {
            i3 = l6c0.Z4;
        } else if (i == 165) {
            i3 = l6c0.a5;
        } else if (i == 42) {
            i3 = l6c0.N3;
        } else if (i == 167) {
            i3 = l6c0.O3;
        } else if (i == 50) {
            i3 = l6c0.d;
        } else if (i == 51) {
            i3 = l6c0.H4;
        } else if (i == 53) {
            i3 = l6c0.M5;
        } else if (i == 173) {
            i3 = l6c0.N5;
        } else if (i == 55) {
            i3 = l6c0.H5;
        } else if (i == 59) {
            i3 = l6c0.L4;
        } else if (i == 178) {
            i3 = l6c0.M4;
        } else if (i == 60) {
            i3 = l6c0.B2;
        } else if (i == 181) {
            i3 = l6c0.C2;
        } else if (i == 183 || i == 61) {
            i3 = l6c0.E3;
        } else if (i == 62) {
            i3 = l6c0.y1;
        } else if (i == 185) {
            i3 = l6c0.z1;
        } else if (i == 186) {
            i3 = l6c0.v2;
        } else if (i == 64 || i == 88) {
            i3 = l6c0.u2;
        } else if (i == 100 || i == 245) {
            i3 = l6c0.E2;
        } else if (i == 65) {
            i3 = l6c0.A3;
        } else if (i == 187) {
            i3 = l6c0.B3;
        } else if (i == 66) {
            i3 = l6c0.A1;
        } else if (i == 191) {
            i3 = l6c0.B1;
        } else if (i == 67) {
            i3 = l6c0.p3;
        } else if (i == 196) {
            i3 = l6c0.q3;
        } else if (i == 69) {
            i3 = l6c0.W2;
        } else if (i == 200) {
            i3 = l6c0.X2;
        } else if (i == 71) {
            i3 = l6c0.C3;
        } else if (i == 201) {
            i3 = l6c0.D3;
        } else if (i == 72) {
            i3 = l6c0.Y2;
        } else if (i >= 73 && i <= 83) {
            i3 = l6c0.a3;
            i2 = i - 73;
        } else if (i == 206 || i == 84) {
            i3 = l6c0.m0;
        } else if (i == 85 || i == 210) {
            i3 = l6c0.L3;
        } else if (i == 86 || i == 216) {
            i3 = l6c0.F2;
        } else if (i == 87 || i == 204) {
            i3 = l6c0.P1;
        } else if (i == 89 || i == 224) {
            i3 = l6c0.U1;
        } else if (i == 90) {
            i3 = l6c0.y3;
        } else if (i == 225) {
            i3 = l6c0.z3;
        } else if (i == 92 || i == 229) {
            i3 = l6c0.Q3;
        } else if (i == 94 || i == 232) {
            i3 = l6c0.D4;
        } else if (i == 95) {
            i3 = l6c0.U2;
        } else if (i == 233) {
            i3 = l6c0.V2;
        } else if (i == 96 || i == 260) {
            i3 = l6c0.R1;
        } else if (i == 98) {
            i3 = l6c0.i2;
        } else if (i == 99) {
            i3 = l6c0.w2;
        } else if (i == 101) {
            i3 = l6c0.K5;
        } else if (i != 246) {
            if (i == 102) {
                i3 = l6c0.S3;
            } else if (i == 103) {
                i3 = l6c0.M1;
            } else if (i == 254) {
                i3 = l6c0.N1;
            } else if (i == 105) {
                i3 = l6c0.L1;
            } else if (i == 107 || i == 255) {
                i3 = l6c0.Y1;
            } else if (i == 259 || i == 108) {
                i3 = l6c0.d2;
            } else if (i == 57) {
                i3 = l6c0.g4;
            } else if (i == 110 || i == 263) {
                i3 = l6c0.J1;
            } else if (i == 111 || i == 271) {
                i3 = l6c0.b2;
            } else if (i == 112 || i == 273) {
                i3 = l6c0.O4;
            } else if (i == 113) {
                i3 = l6c0.s2;
            } else if (i == 114) {
                i3 = l6c0.J3;
            } else if (i == 277) {
                i3 = l6c0.K3;
            } else if (i == 115) {
                i3 = l6c0.Y0;
            } else if (i == 281) {
                i3 = l6c0.Z0;
            }
        }
        itemMessageBase.mo1430U(i3, ((o000) this).a, i2, z);
        return itemMessageBase;
    }

    /* JADX INFO: renamed from: V */
    public boolean m5278V(Message message) {
        if (((DbObject) message).id.startsWith("fake_id_") || TextUtils.isEmpty(message.incTempInfo)) {
            return false;
        }
        return CoreModule.P().i().q1() || message.isOtherUser();
    }

    /* JADX INFO: renamed from: W */
    public boolean m5279W(Message message) {
        return TextUtils.equals(m5269K(message), "toShare") || TextUtils.equals(m5269K(message), "shared");
    }

    /* JADX INFO: renamed from: X */
    public boolean m5280X(Message message) {
        MessageTipsContent messageTipsContentM5264N = m5264N(message);
        if (NullChecker.a(messageTipsContentM5264N)) {
            return !(TextUtils.isEmpty(messageTipsContentM5264N.value) && TextUtils.isEmpty(messageTipsContentM5264N.androidValue)) && m5285b0(message);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m5281Y(Message message) {
        Boolean bool;
        return Boolean.valueOf(message.owner.equals(((DbObject) this.f4539s.m4191W5()).id) && ((bool = message.recalled) == null || !bool.booleanValue()) && TEnum.equals(message.status(), "normal"));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Boolean m5282Z(Message message) {
        return Boolean.valueOf(message.owner.equals(this.f4539s.m4295r3()));
    }

    /* JADX WARN: Code duplicated, block: B:297:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:301:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:307:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:308:0x07e2 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:305:0x07db, B:309:0x07e8, B:313:0x07f7, B:312:0x07f1, B:308:0x07e2), top: B:402:0x07db }] */
    /* JADX WARN: Code duplicated, block: B:311:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:312:0x07f1 A[Catch: Exception -> 0x08ec, TryCatch #0 {Exception -> 0x08ec, blocks: (B:305:0x07db, B:309:0x07e8, B:313:0x07f7, B:312:0x07f1, B:308:0x07e2), top: B:402:0x07db }] */
    /* JADX WARN: Code duplicated, block: B:316:0x0802  */
    /* JADX WARN: Code duplicated, block: B:320:0x0816  */
    /* JADX WARN: Code duplicated, block: B:322:0x0822  */
    /* JADX WARN: Code duplicated, block: B:324:0x083a  */
    /* JADX WARN: Code duplicated, block: B:329:0x0858  */
    /* JADX WARN: Code duplicated, block: B:331:0x0869  */
    /* JADX WARN: Code duplicated, block: B:332:0x086b  */
    /* JADX WARN: Code duplicated, block: B:335:0x0887  */
    /* JADX WARN: Code duplicated, block: B:336:0x0889  */
    /* JADX WARN: Code duplicated, block: B:337:0x088b  */
    /* JADX WARN: Code duplicated, block: B:339:0x088f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x0897  */
    /* JADX WARN: Code duplicated, block: B:350:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:351:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:354:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:357:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x0842 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v171, types: [com.p1.mobile.putong.core.ui.messages.ItemBase] */
    /* JADX WARN: Type inference failed for: r0v198, types: [com.p1.mobile.putong.core.ui.messages.ItemMessageRight] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.p1.mobile.putong.core.ui.messages.ItemChatInterceptRight] */
    /* JADX WARN: Type inference failed for: r15v0, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v10, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v14, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v3, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v4, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v40, types: [l.dml, l.j000] */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v7, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [l.dml, l.j000] */
    /* JADX WARN: Type inference failed for: r2v74, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r2v83, types: [l.j000] */
    /* JADX WARN: Type inference failed for: r4v58, types: [l.j000] */
    /* JADX INFO: renamed from: a */
    public void m5283a(View view, Message message, int i, int i2) throws Exception {
        int i3;
        int i4;
        int i5;
        int i6;
        View view2;
        View childAt;
        ?? r15;
        ?? r16;
        final ?? r17;
        Message messageM5294m;
        Message messageM5294m2;
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        fcz<?, ?> fczVar;
        View childAt2 = view;
        int i7 = i;
        if (this.f4539s.m4255j3() == null) {
            return;
        }
        if (i7 / 1000 == 9) {
            i7 -= 9000;
        }
        if (i7 / 1000 == 7) {
            i7 -= 7000;
        }
        if (i7 / 1000 == 8) {
            i7 -= 8000;
        }
        if (i7 / 1000 == 5) {
            i7 -= 5000;
        }
        if (i7 / 1000 == 2) {
            i7 -= 2000;
        }
        if (i7 / 1000 == 10) {
            i7 -= 10000;
        }
        if (i7 / 1000 == 11) {
            i7 -= 11000;
        }
        if (!TEnum.equals(message.channel, "group") && ((CoreModule.P().i().c() || CoreModule.P().b().Yg()) && i7 / 1000 == 1)) {
            i7 -= 1000;
        }
        int i8 = i7;
        if (childAt2 instanceof ItemChatUnlockLayout) {
            ((ItemChatUnlockLayout) childAt2).m1170c(this.f4539s.m4325x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockLayout) {
            ((ItemLoveBuzzUnlockLayout) childAt2).m1378b(this.f4539s.m4325x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if ((childAt2 instanceof ChatTipsItem) && i8 != 249 && i8 != 252) {
            ((ChatTipsItem) childAt2).m952d(i8, message, this.f4538r);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof CoreChatAiSendMomentItem) {
            ((CoreChatAiSendMomentItem) childAt2).m963i(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockSuccess) {
            ((ItemLoveBuzzUnlockSuccess) childAt2).m1385g(this.f4539s.m4309t7(), this.f4539s.m4325x6(), this.f4539s.m4191W5(), this.f4539s.f3551k);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemChatSafetyReminder) {
            ((ItemChatSafetyReminder) childAt2).m1167f(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof UnMatchItem) {
            ((UnMatchItem) childAt2).m2106b(this.f4539s.m4325x6(), message, this.f4539s.m4255j3());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof NewOnlineMatchSuccessItem) {
            ((NewOnlineMatchSuccessItem) childAt2).m2087g(this.f4539s.m4309t7(), this.f4539s.m4325x6(), this.f4539s.m4191W5());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof HistoryContentItem) {
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        View view3 = childAt2;
        if (view3 instanceof ItemFriendActiveRemindFemale) {
            ((ItemFriendActiveRemindFemale) view3).m1254b(message, this.f4539s.m4325x6());
            return;
        }
        if (view3 instanceof ItemCommonTipBox) {
            ((ItemCommonTipBox) view3).m1186T(this.f4539s.act(), this, message);
            return;
        }
        if (view3 instanceof ItemDiceTip) {
            ((ItemDiceTip) view3).m1207b(message, this.f4539s.m4325x6());
            return;
        }
        switch (i8) {
            case 1:
            case 22:
            case 28:
            case HttpHeaders.IF_MODIFIED_SINCE_ORDINAL /* 29 */:
            case HttpHeaders.TE_ORDINAL /* 39 */:
            case 70:
            case EACTags.NAME /* 91 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                ?? r18 = this;
                ViewGroup viewGroup = (ViewGroup) view3;
                View childAt3 = viewGroup.getChildAt(0);
                String str = (i8 == 154 || i8 == 28) ? "wx" : (i8 == 29 || i8 == 155) ? "code" : "normal";
                View childAt4 = viewGroup.getChildAt(1);
                try {
                    if (!(childAt4 instanceof ItemPromptIntl)) {
                        if (childAt4 instanceof ItemPrompt) {
                            i3 = 29;
                            i4 = 28;
                            ((ItemPrompt) childAt4).m1686m(message, r18.f4539s.m4255j3(), str, r18.f4539s.m4295r3(), r18.f4539s.m4250i3());
                        }
                        if (i8 != i3 || i8 == i4) {
                            i5 = 0;
                        } else {
                            i5 = i8 - 1;
                        }
                        i6 = i5;
                        view2 = childAt3;
                        r17 = r18;
                        if (i6 == 41 && !r17.f4529i.contains(message.value)) {
                            r17.f4529i.add(message.value);
                            zvf0.x("e_assistant_send_feedback", "p_chat_view");
                        }
                        r17.m5293h0(message, i6);
                        r17.m5290e0(message);
                        r17.m5291f0(message, i6);
                        r17.m5292g0(message);
                        ?? r0 = (ItemBase) view2;
                        if (i2 == 0) {
                            messageM5294m = null;
                        } else {
                            messageM5294m = r17.m5294m(i2 - 1);
                        }
                        if (i2 == r17.m5287d() - 1) {
                            messageM5294m2 = null;
                        } else {
                            messageM5294m2 = r17.m5294m(i2 + 1);
                        }
                        r0.mo1114g(r17, message, messageM5294m, messageM5294m2);
                        if (!r17.f4539s.m4231e4() && (view2 instanceof ItemMessageRight)) {
                            if (CoreModule.P().i().s4()) {
                                fczVar = r17.f4539s;
                                if (!fczVar.m4261k4(fczVar.m4250i3())) {
                                    r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                    if (r17.f4539s.m4231e4()) {
                                        z = false;
                                        z2 = false;
                                    } else {
                                        if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                            @Override // p003l.w9j
                                            public final Object call(Object obj) {
                                                return this.f2558a.m5281Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = r17.f4539s.f3560r.a;
                                        if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                            @Override // p003l.w9j
                                            public final Object call(Object obj) {
                                                return this.f2887a.m5282Z((Message) obj);
                                            }
                                        })) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                    }
                                    if (IntlCountryCodeController.k()) {
                                        boolean z4 = z3;
                                        ?? r2 = r17;
                                        ((ItemMessageRight) view2).m1565n1(message, z4, r2.f4526f, r2.f4525e);
                                    } else {
                                        ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                    }
                                } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h()) || TEnum.equals(message.messageType, "love_letter")) {
                                    try {
                                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                        break;
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (r17.f4539s.m4231e4()) {
                                        if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                            @Override // p003l.w9j
                                            public final Object call(Object obj) {
                                                return this.f2558a.m5281Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = r17.f4539s.f3560r.a;
                                        if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                            @Override // p003l.w9j
                                            public final Object call(Object obj) {
                                                return this.f2887a.m5282Z((Message) obj);
                                            }
                                        })) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        z = false;
                                        z2 = false;
                                    }
                                    z3 = (!z2 && z && r17.m5268J(i6)) || (TEnum.equals(message.messageType, "love_letter") && message.isMe());
                                    if (IntlCountryCodeController.k()) {
                                        ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                    } else {
                                        boolean z5 = z3;
                                        ?? r3 = r17;
                                        ((ItemMessageRight) view2).m1565n1(message, z5, r3.f4526f, r3.f4525e);
                                    }
                                }
                            } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                                r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                if (r17.f4539s.m4231e4()) {
                                    if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2558a.m5281Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = r17.f4539s.f3560r.a;
                                    if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2887a.m5282Z((Message) obj);
                                        }
                                    })) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                if (z2) {
                                }
                                if (IntlCountryCodeController.k()) {
                                    ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                } else {
                                    boolean z6 = z3;
                                    ?? r4 = r17;
                                    ((ItemMessageRight) view2).m1565n1(message, z6, r4.f4526f, r4.f4525e);
                                }
                            } else {
                                r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                if (r17.f4539s.m4231e4()) {
                                    if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2558a.m5281Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = r17.f4539s.f3560r.a;
                                    if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2887a.m5282Z((Message) obj);
                                        }
                                    })) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                if (z2) {
                                }
                                if (IntlCountryCodeController.k()) {
                                    ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                } else {
                                    boolean z7 = z3;
                                    ?? r5 = r17;
                                    ((ItemMessageRight) view2).m1565n1(message, z7, r5.f4526f, r5.f4525e);
                                }
                            }
                        }
                        if (i6 == 245) {
                            ((ItemMessageRight) view2).m1566o1();
                        }
                        if (i6 == 255) {
                            ((ItemMessageRight) view2).m1563l1();
                            return;
                        }
                        return;
                    }
                    ((ItemPromptIntl) childAt4).m1700m(message, r18.f4539s.m4255j3());
                    ?? r1 = (ItemBase) view2;
                    if (i2 == 0) {
                        messageM5294m = null;
                    } else {
                        messageM5294m = r17.m5294m(i2 - 1);
                    }
                    if (i2 == r17.m5287d() - 1) {
                        messageM5294m2 = null;
                    } else {
                        messageM5294m2 = r17.m5294m(i2 + 1);
                    }
                    r1.mo1114g(r17, message, messageM5294m, messageM5294m2);
                    if (!r17.f4539s.m4231e4()) {
                        if (CoreModule.P().i().s4()) {
                            fczVar = r17.f4539s;
                            if (!fczVar.m4261k4(fczVar.m4250i3())) {
                                r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                if (r17.f4539s.m4231e4()) {
                                    if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2558a.m5281Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = r17.f4539s.f3560r.a;
                                    if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2887a.m5282Z((Message) obj);
                                        }
                                    })) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                if (z2) {
                                }
                                if (IntlCountryCodeController.k()) {
                                    ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                } else {
                                    boolean z8 = z3;
                                    ?? r6 = r17;
                                    ((ItemMessageRight) view2).m1565n1(message, z8, r6.f4526f, r6.f4525e);
                                }
                            } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                                r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                if (r17.f4539s.m4231e4()) {
                                    if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2558a.m5281Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = r17.f4539s.f3560r.a;
                                    if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2887a.m5282Z((Message) obj);
                                        }
                                    })) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                if (z2) {
                                }
                                if (IntlCountryCodeController.k()) {
                                    ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                } else {
                                    boolean z9 = z3;
                                    ?? r7 = r17;
                                    ((ItemMessageRight) view2).m1565n1(message, z9, r7.f4526f, r7.f4525e);
                                }
                            } else {
                                r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                                if (r17.f4539s.m4231e4()) {
                                    if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2558a.m5281Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = r17.f4539s.f3560r.a;
                                    if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p003l.w9j
                                        public final Object call(Object obj) {
                                            return this.f2887a.m5282Z((Message) obj);
                                        }
                                    })) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                if (z2) {
                                }
                                if (IntlCountryCodeController.k()) {
                                    ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                                } else {
                                    boolean z10 = z3;
                                    ?? r8 = r17;
                                    ((ItemMessageRight) view2).m1565n1(message, z10, r8.f4526f, r8.f4525e);
                                }
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11 = z3;
                                ?? r9 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11, r9.f4526f, r9.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z12 = z3;
                                ?? r10 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z12, r10.f4526f, r10.f4525e);
                            }
                        }
                    }
                    if (i6 == 245) {
                        ((ItemMessageRight) view2).m1566o1();
                    }
                    if (i6 == 255) {
                        ((ItemMessageRight) view2).m1563l1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    ?? r11 = r17;
                    int i9 = r11.f4537q;
                    if (i9 == 0) {
                        r11.f4537q = i9 + 1;
                        int iM5295p = r11.m5295p(i2);
                        r11.m5283a(r11.m5297w((ViewGroup) view3.getParent(), iM5295p), r11.m5294m(i2), iM5295p, i2);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("MessagesAdapter error: \nuserId: ");
                    sb.append(CoreModule.H().userId());
                    sb.append("\ncid: ");
                    sb.append(r11.m5294m(i2).cid);
                    sb.append("\nposition: ");
                    sb.append(i2);
                    sb.append("\nmessage id: ");
                    sb.append(((DbObject) message).id);
                    sb.append("\nmessageType: ");
                    sb.append(r11.m5274Q(r11.m5294m(i2), i2));
                    sb.append("\nremote messageType: ");
                    sb.append(message.messageType);
                    sb.append("\nview: ");
                    sb.append(view3.getClass().getName());
                    sb.append("\ncontentView: ");
                    sb.append(view2 instanceof ItemBase ? ((ItemBase) view2).getContentLayoutInfo() : "null");
                    sb.append("\nrenderType: ");
                    sb.append(i6);
                    sb.append("\nmessageDetail:\n");
                    sb.append(message.toJson());
                    sb.append("\n");
                    if (i2 > 0) {
                        sb.append("pre msgType: ");
                        int i10 = i2 - 1;
                        sb.append(r11.m5274Q(r11.m5294m(i10), i10));
                        sb.append("\npre remote messageType: ");
                        sb.append(r11.m5294m(i10).messageType);
                        sb.append("\n");
                    }
                    if (i2 < r11.m5287d() - 1) {
                        sb.append("next msgType: ");
                        int i11 = i2 + 1;
                        sb.append(r11.m5274Q(r11.m5294m(i11), i11));
                        sb.append("\nnext remote messageType: ");
                        sb.append(r11.m5294m(i11).messageType);
                        sb.append("\n");
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(message);
                    if (i2 > 0) {
                        arrayList.add(0, r11.m5294m(i2 - 1));
                    }
                    if (i2 > 1) {
                        arrayList.add(0, r11.m5294m(i2 - 2));
                    }
                    if (i2 > 2) {
                        arrayList.add(0, r11.m5294m(i2 - 3));
                    }
                    int i12 = i2 + 1;
                    if (i12 < r11.m5287d()) {
                        arrayList.add(r11.m5294m(i12));
                    }
                    int i13 = i2 + 2;
                    if (i13 < r11.m5287d()) {
                        arrayList.add(r11.m5294m(i13));
                    }
                    int i14 = i2 + 3;
                    if (i14 < r11.m5287d()) {
                        arrayList.add(r11.m5294m(i14));
                    }
                    sb.append("historyBottomMessages: ");
                    for (int i15 = 0; i15 < r11.f4541u.size(); i15++) {
                        Message message2 = r11.f4541u.get(i15);
                        sb.append("(");
                        sb.append(((DbObject) message2).id);
                        sb.append(", ");
                        sb.append(message2.messageType);
                        sb.append("), ");
                    }
                    sb.append("\nnowBottomMessages: ");
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        Message message3 = (Message) arrayList.get(i16);
                        sb.append("(");
                        sb.append(((DbObject) message3).id);
                        sb.append(", ");
                        sb.append(message3.messageType);
                        sb.append("), ");
                    }
                    sb.append("\ncrash caused by: ");
                    sb.append(e.getMessage());
                    CrashHelper.c(new Exception(sb.toString()));
                    throw e;
                }
                i4 = 28;
                i3 = 29;
                if (i8 != i3) {
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                i6 = i5;
                view2 = childAt3;
                r17 = r18;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
            case 27:
                ?? r19 = this;
                ItemBase itemBase = (ItemBase) view3;
                itemBase.setLetterUser(r19.f4539s.m4325x6());
                boolean zA = NullChecker.a(r19.f4539s.m4325x6());
                r16 = r19;
                if (zA && !r19.f4539s.m4097B3()) {
                    if (!(view3 instanceof ItemBase)) {
                        r16 = r19;
                        CrashHelper.c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.i() + ", convertView:" + r19.m5270L(view3, 0)));
                    }
                    r16 = r19;
                    itemBase.mo1113f(r19.f4539s.m4325x6(), r19.f4539s.m4325x6().sendLetter, r19.f4539s.m4285p3());
                    return;
                }
                r16 = r19;
                i6 = i8;
                view2 = view3;
                r17 = r16;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r12 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r12.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z13 = z3;
                                ?? r13 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z13, r13.f4526f, r13.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z14 = z3;
                                ?? r14 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z14, r14.f4526f, r14.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z15 = z3;
                                ?? r110 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z15, r110.f4526f, r110.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z16 = z3;
                            ?? r111 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z16, r111.f4526f, r111.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z17 = z3;
                            ?? r112 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z17, r112.f4526f, r112.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 63:
                ((ItemMessageNewSurvey) view3).p0(message, this.f4539s);
                return;
            case 68:
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case 209:
            case 239:
                return;
            case EACTags.CARD_CAPABILITIES /* 71 */:
            case HttpStatus.CREATED_201 /* 201 */:
                ?? r113 = this;
                r113.m5288d0(message);
                r16 = r113;
                r16 = r19;
                i6 = i8;
                view2 = view3;
                r17 = r16;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r114 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r114.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z18 = z3;
                                ?? r115 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z18, r115.f4526f, r115.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z19 = z3;
                                ?? r116 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z19, r116.f4526f, r116.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z110 = z3;
                                ?? r117 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z110, r117.f4526f, r117.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z111 = z3;
                            ?? r118 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z111, r118.f4526f, r118.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z112 = z3;
                            ?? r119 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z112, r119.f4526f, r119.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 101:
                ?? r120 = this;
                if (!message.value.contains("你好呀，问个问题～\n")) {
                    message.value = "你好呀，问个问题～\n" + message.value;
                }
                boolean zM7030a = r120.f4538r.m7030a(((DbObject) message).id);
                r16 = r120;
                if (!zM7030a) {
                    r120.f4538r.m7031b(((DbObject) message).id);
                    String str2 = message.msgData;
                    try {
                        ChatAssistantQuestion chatAssistantQuestion = !TextUtils.isEmpty(str2) ? (ChatAssistantQuestion) ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData) : null;
                        if (NullChecker.a(chatAssistantQuestion)) {
                            str2 = chatAssistantQuestion.type;
                        }
                        break;
                    } catch (IOException unused2) {
                    }
                    o6j0.h("e_chat_question_auto_send", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_question_content", message.value), o6j0.a.h("chat_question_send_side", "to"), o6j0.a.h("chat_question_type", str2)});
                    r16 = r120;
                }
                r16 = r19;
                i6 = i8;
                view2 = view3;
                r17 = r16;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r1110 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r1110.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z113 = z3;
                                ?? r1111 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z113, r1111.f4526f, r1111.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z114 = z3;
                                ?? r1112 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z114, r1112.f4526f, r1112.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z115 = z3;
                                ?? r1113 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z115, r1113.f4526f, r1113.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z116 = z3;
                            ?? r1114 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z116, r1114.f4526f, r1114.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z117 = z3;
                            ?? r1115 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z117, r1115.f4526f, r1115.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 104:
                ((ItemMsgRiskLayout) view3).m1619A(message);
                return;
            case 106:
                ((ItemSystemRemind) view3).mo1114g(this, message, i2 == 0 ? null : m5294m(i2 - 1), i2 == m5287d() - 1 ? null : m5294m(i2 + 1));
                return;
            case 109:
                fcz<?, ?> fczVar2 = this.f4539s;
                ((ItemBlindBoxGuideView) view3).m1120e(fczVar2.f3551k, fczVar2.m4325x6(), this.f4538r);
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
            case HttpStatus.ACCEPTED_202 /* 202 */:
            case 222:
            case 226:
                ?? r121 = this;
                LinearLayout linearLayout = (LinearLayout) view3;
                childAt = linearLayout.getChildAt(0);
                AppCompatTextView appCompatTextView = (VText) linearLayout.getChildAt(1);
                boolean z20 = r121.f4539s.m4309t7() instanceof bpz;
                r15 = r121;
                if (z20) {
                    boolean z21 = ((bpz) r121.f4539s.m4309t7()).f2427M1;
                    fcz<?, ?> fczVar3 = r121.f4539s;
                    if (z21) {
                        appCompatTextView.setTextColor(fczVar3.act().color(a1c0.a0));
                        appCompatTextView.setBackgroundResource(c3c0.R4);
                        r15 = r121;
                    } else {
                        appCompatTextView.setTextColor(fczVar3.act().color(ura.e().d().I4() ? a1c0.i : a1c0.k));
                        appCompatTextView.setBackgroundColor(0);
                        r15 = r121;
                    }
                }
                i6 = i8;
                view2 = childAt;
                r17 = r15;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r1116 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r1116.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z118 = z3;
                                ?? r1117 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z118, r1117.f4526f, r1117.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z119 = z3;
                                ?? r1118 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z119, r1118.f4526f, r1118.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1110 = z3;
                                ?? r1119 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1110, r1119.f4526f, r1119.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z1111 = z3;
                            ?? r11110 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z1111, r11110.f4526f, r11110.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z1112 = z3;
                            ?? r11111 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z1112, r11111.f4526f, r11111.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                ((ReminderView) view3).m2096i(this.f4539s.m4255j3());
                return;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
            case HttpStatus.NON_AUTHORITATIVE_INFORMATION_203 /* 203 */:
            case 227:
                r15 = this;
                childAt = ((ViewGroup) view3).getChildAt(0);
                i6 = i8;
                view2 = childAt;
                r17 = r15;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r11112 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r11112.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1113 = z3;
                                ?? r11113 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1113, r11113.f4526f, r11113.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1114 = z3;
                                ?? r11114 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1114, r11114.f4526f, r11114.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1115 = z3;
                                ?? r11115 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1115, r11115.f4526f, r11115.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z1116 = z3;
                            ?? r11116 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z1116, r11116.f4526f, r11116.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z1117 = z3;
                            ?? r11117 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z1117, r11117.f4526f, r11117.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                ?? r122 = this;
                ItemBase itemBase2 = (ItemBase) view3;
                itemBase2.setLetterUser(r122.f4539s.m4325x6());
                boolean zM4097B3 = r122.f4539s.m4097B3();
                r16 = r122;
                if (!zM4097B3) {
                    User userP9 = CoreModule.c.e0.p9();
                    if (!(view3 instanceof ItemBase)) {
                        CrashHelper.c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.i() + ", convertView:" + r122.m5270L(view3, 0)));
                    }
                    fcz<?, ?> fczVar4 = r122.f4539s;
                    itemBase2.mo1113f(userP9, fczVar4.f3557p, fczVar4.m4285p3());
                    return;
                }
                r16 = r19;
                i6 = i8;
                view2 = view3;
                r17 = r16;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r11118 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r11118.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1118 = z3;
                                ?? r11119 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1118, r11119.f4526f, r11119.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z1119 = z3;
                                ?? r111110 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z1119, r111110.f4526f, r111110.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11110 = z3;
                                ?? r111111 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11110, r111111.f4526f, r111111.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z11111 = z3;
                            ?? r111112 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z11111, r111112.f4526f, r111112.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z11112 = z3;
                            ?? r111113 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z11112, r111113.f4526f, r111113.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                ((ItemTantanVerifyToast) view3).m1805i(message, this.f4538r);
                return;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                ((ItemTickle) view3).m1829j(this, message, this.f4539s.m4325x6());
                if (this.f4530j.contains(((DbObject) message).id) || message.isLocal() || ((DbObject) message).id.startsWith("fake_id_")) {
                    return;
                }
                this.f4530j.add(((DbObject) message).id);
                o6j0.h("e_tickle_message", "p_chat_view", new o6j0.a[0]);
                return;
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                ((ItemConversationNotification) view3).m1192p(message, this.f4538r);
                return;
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                ((ItemRedPacketNotification) view3).m1729a(message);
                return;
            case 188:
                ((ItemGreetingTip) view3).A(message);
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                ?? r123 = this;
                ViewGroup viewGroup2 = (ViewGroup) view3;
                childAt = viewGroup2.getChildAt(0);
                ((ItemChatInterceptRight) viewGroup2.getChildAt(1)).m1161h(r123, message, r123.f4539s.m4325x6());
                r15 = r123;
                i6 = i8;
                view2 = childAt;
                r17 = r15;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r111114 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r111114.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11113 = z3;
                                ?? r111115 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11113, r111115.f4526f, r111115.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11114 = z3;
                                ?? r111116 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11114, r111116.f4526f, r111116.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11115 = z3;
                                ?? r111117 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11115, r111117.f4526f, r111117.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z11116 = z3;
                            ?? r111118 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z11116, r111118.f4526f, r111118.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z11117 = z3;
                            ?? r111119 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z11117, r111119.f4526f, r111119.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 192:
                ((ItemVoiceCallInvitation) view3).m1861k(message);
                return;
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                ImageView imageView = (ImageView) view3.findViewById(y4c0.E1);
                TextView textView = (TextView) view3.findViewById(y4c0.Q4);
                TextView textView2 = (TextView) view3.findViewById(y4c0.r0);
                if (ura.e().d().I4()) {
                    xdl0.N(imageView, c3c0.b2);
                    textView.setTextColor(shw.m().getColor(a1c0.g));
                    textView2.setTextColor(shw.m().getColor(a1c0.i));
                }
                if (NullChecker.a(textView)) {
                    textView.setTypeface(eqh0.m3924c(3), 1);
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                ((ItemCountdownLikeSuccess) view3).m1200g(this.f4539s.m4309t7(), this.f4539s.m4250i3(), message);
                return;
            case 198:
                ((ItemChristmasMatch) view3).m1174A(message);
                return;
            case HttpStatus.MULTI_STATUS_207 /* 207 */:
            case 208:
                if (CoreModule.P().i().uh()) {
                    ((ItemHeartbeatNotifyNewUi) view3).m1282c(message, this.f4539s.m4255j3(), this.f4538r);
                    return;
                }
                return;
            case 215:
                ((ItemFinishedChallengeView) view3).f(this.f4539s.act(), message, this.f4539s.m4325x6(), this.f4538r);
                return;
            case 217:
                ((ItemInviteChallengeView) view3).d(this.f4539s.act(), this.f4539s.m4325x6(), message);
                return;
            case 218:
                ((ItemBreakIceMessage) view3).m1127g((MessagesAct) this.f4539s.act(), message);
                return;
            case 220:
                ((ItemChallengeTipsMsg) view3).c(this.f4539s.act(), message, ((DbObject) this.f4539s.m4325x6()).id, this.f4538r);
                return;
            case 223:
                ((ItemTagGuide) view3).m1781e(message, this.f4539s.m4325x6(), this.f4538r);
                return;
            case 228:
                ((ItemMomentPostGuide) view3).mo1056A(message);
                return;
            case 231:
                ((ItemMessageWCInviteAfter) view3).mo1056A(message);
                return;
            case 234:
                ((ItemLoveBuzzBreakIceMessage) view3).m1376g((MessagesAct) this.f4539s.act(), this, message);
                return;
            case 235:
                ((ItemAddTagsGuide) view3).m1024n(this.f4539s.act(), this.f4539s.m4325x6(), this.f4538r, this.f4539s.f3543c);
                return;
            case 236:
                ((ItemAddArtworkGuide) view3).m1001x(this.f4539s.act(), this.f4539s.m4325x6(), this.f4538r, this.f4539s.f3543c);
                return;
            case 237:
                ((ItemSendMsgTips) view3).m1745b(this.f4539s.act(), "tag");
                return;
            case 238:
                ((ItemSendMsgTips) view3).m1745b(this.f4539s.act(), "artwork");
                return;
            case 240:
                ((ScriptMessageItem) view3).b(this.f4539s.act(), message, ((DbObject) this.f4539s.m4325x6()).id);
                return;
            case 241:
                ((ItemCommonIconTitleDesClikeView) view3).b(this.f4539s.act(), message, this.f4539s.m4325x6(), this.f4538r);
                return;
            case 242:
                ((ItemBirthdayTip) view3).b(this.f4539s.m4325x6());
                return;
            case 243:
                ((ItemWoodenFishTip) view3).m1868A(message);
                return;
            case 244:
                ((ItemIceBreakStateRight) view3).mo1056A(message);
                return;
            case 246:
            default:
                r16 = this;
                r16 = r19;
                i6 = i8;
                view2 = view3;
                r17 = r16;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r1111110 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r1111110.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11118 = z3;
                                ?? r1111111 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11118, r1111111.f4526f, r1111111.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z11119 = z3;
                                ?? r1111112 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z11119, r1111112.f4526f, r1111112.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z111110 = z3;
                                ?? r1111113 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z111110, r1111113.f4526f, r1111113.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z111111 = z3;
                            ?? r1111114 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z111111, r1111114.f4526f, r1111114.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z111112 = z3;
                            ?? r1111115 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z111112, r1111115.f4526f, r1111115.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 247:
                ((ItemChatAssistantQuestionAutoRight) view3).m1149z(this.f4539s.act(), this, message, this.f4538r);
                return;
            case 248:
                ((ItemChatAssistantQuestion) view3).m1142P(this.f4539s.act(), this, message, this.f4538r);
                return;
            case 249:
            case 252:
                ((ChatTipsItem) view3).m952d(i8, message, this.f4538r);
                return;
            case 251:
                if (message.isMe() && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.twoSidesDifferentTip) && NullChecker.a(message.additionalData.twoSidesDifferentTip.selfShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.selfShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.selfShown.value;
                } else if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.twoSidesDifferentTip) && NullChecker.a(message.additionalData.twoSidesDifferentTip.otherShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.otherShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.otherShown.value;
                }
                ((ItemConversationNotification) view3).m1192p(message, this.f4538r);
                return;
            case 253:
                ((ItemAiP2PChatGuide) view3).m1061e(this.f4539s.m4325x6(), this.f4538r);
                return;
            case 256:
                ((ItemPicCertGuide) view3).m1657e(this.f4539s.m4325x6(), this.f4538r);
                return;
            case 257:
                ((ItemPlatinumPinGuideMessage) view3).m1666f(this.f4539s.act(), this, this.f4539s.m4325x6(), this.f4539s.f3551k);
                return;
            case 258:
                ((ItemLongTimeNoSeeTip) view3).m1369b(this.f4538r, message, this.f4539s.m4325x6(), this.f4539s.m4255j3());
                return;
            case 261:
                ((ItemVisitorHideFootPrint) view3).m1846j(this.f4539s.act(), this, this.f4539s.m4325x6(), this.f4539s.f3551k, message);
                return;
            case 262:
                ((ItemIntlConversationPrompt) view3).m1310s(message, this.f4538r);
                return;
            case 265:
                ViewGroup viewGroup3 = (ViewGroup) view3;
                childAt = viewGroup3.getChildAt(0);
                ((IntrRiskTipItem) viewGroup3.getChildAt(1)).m974g(this, message, this.f4538r);
                r15 = this;
                i6 = i8;
                view2 = childAt;
                r17 = r15;
                if (i6 == 41) {
                    r17.f4529i.add(message.value);
                    zvf0.x("e_assistant_send_feedback", "p_chat_view");
                }
                r17.m5293h0(message, i6);
                r17.m5290e0(message);
                r17.m5291f0(message, i6);
                r17.m5292g0(message);
                ?? r1111116 = (ItemBase) view2;
                if (i2 == 0) {
                    messageM5294m = null;
                } else {
                    messageM5294m = r17.m5294m(i2 - 1);
                }
                if (i2 == r17.m5287d() - 1) {
                    messageM5294m2 = null;
                } else {
                    messageM5294m2 = r17.m5294m(i2 + 1);
                }
                r1111116.mo1114g(r17, message, messageM5294m, messageM5294m2);
                if (!r17.f4539s.m4231e4()) {
                    if (CoreModule.P().i().s4()) {
                        fczVar = r17.f4539s;
                        if (!fczVar.m4261k4(fczVar.m4250i3())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z111113 = z3;
                                ?? r1111117 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z111113, r1111117.f4526f, r1111117.f4525e);
                            }
                        } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z111114 = z3;
                                ?? r1111118 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z111114, r1111118.f4526f, r1111118.f4525e);
                            }
                        } else {
                            r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                            if (r17.f4539s.m4231e4()) {
                                if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2558a.m5281Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = r17.f4539s.f3560r.a;
                                if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p003l.w9j
                                    public final Object call(Object obj) {
                                        return this.f2887a.m5282Z((Message) obj);
                                    }
                                })) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            if (IntlCountryCodeController.k()) {
                                ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                            } else {
                                boolean z111115 = z3;
                                ?? r1111119 = r17;
                                ((ItemMessageRight) view2).m1565n1(message, z111115, r1111119.f4526f, r1111119.f4525e);
                            }
                        }
                    } else if (TextUtils.equals(r17.f4539s.m4295r3(), CoreModule.P().i().h())) {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z111116 = z3;
                            ?? r11111110 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z111116, r11111110.f4526f, r11111110.f4525e);
                        }
                    } else {
                        r17.f4526f = Long.parseLong(r17.f4539s.m4255j3().otherReadUntil);
                        if (r17.f4539s.m4231e4()) {
                            if (i2 == vwb.O(r17.f4539s.f3560r.a, new w9j() { // from class: l.c000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2558a.m5281Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = r17.f4539s.f3560r.a;
                            if (-1 == vwb.G(vwb.m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p003l.w9j
                                public final Object call(Object obj) {
                                    return this.f2887a.m5282Z((Message) obj);
                                }
                            })) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        if (z2) {
                        }
                        if (IntlCountryCodeController.k()) {
                            ((ItemMessageRight) view2).m1564m1(r17.f4539s.act(), message, r17.f4539s.f3551k, r17, z3, r17.f4526f, r17.f4525e);
                        } else {
                            boolean z111117 = z3;
                            ?? r11111111 = r17;
                            ((ItemMessageRight) view2).m1565n1(message, z111117, r11111111.f4526f, r11111111.f4525e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m1566o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m1563l1();
                    return;
                }
                return;
            case 266:
                ((ItemWechatNotifyGuideMessage) view3).m1867c(this.f4539s.act(), this, this.f4539s.m4325x6(), this.f4539s.f3551k);
                return;
            case 267:
                ((ItemODiamondVisitorGuideMessage) view3).m1627f(this.f4539s.act(), message, this.f4539s.m4325x6());
                return;
            case 268:
                ((ItemLocalUXQuestionnaire) view3).m1348e((MessagesAct) this.f4539s.act(), this, message, this.f4538r);
                return;
            case 269:
                ((MessageIdealEnquiryLayout) view3).p(this.f4539s.m4325x6(), message, this.f4538r);
                return;
            case 270:
                ((MessageLoveLetterGuideView) view3).f(this.f4539s.m4325x6(), message, this.f4538r);
                return;
            case 272:
                ((ItemGuideAuthentication) view3).m1270c(this.f4539s.m4325x6(), message, this, this.f4538r);
                return;
            case 274:
                ((ItemCommonTipBoxV2) view3).m1190S(this.f4539s.act(), this, message);
                return;
            case 275:
                ((AIChatMessageAnalysisItem) view3).m2123n((MessagesAct) this.f4539s.act(), message);
                return;
            case 276:
                ((ItemMessageMMTask) view3).m1512S((MessagesAct) this.f4539s.act(), this, message);
                return;
            case 278:
                ((ItemAiChatGuideMessage) view3).m1051s((MessagesAct) this.f4539s.act(), message);
                return;
            case 279:
                ((ItemIntlReadReceiptsGuide) view3).m1318X(this.f4539s.m4325x6(), message, this.f4538r);
                return;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public List<Message> m5284a0() {
        return this.f4539s.f3560r.a;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m5285b0(Message message) {
        return !TEnum.equals(message.messageType, "chat_assistant_question") || CoreModule.P().i().v5();
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c0 */
    public void m5286c0(q860<Message> q860Var, Reminder reminder, Message message) {
        List arrayList;
        r();
        if (CoreModule.P().i().G1()) {
            this.f4539s.m4309t7().f7677n1.getRealView().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0350a());
        }
        if (!this.f4528h) {
            Message message2 = (Message) vwb.F(q860Var.a);
            this.f4527g = NullChecker.a(reminder) && !CoreMomentInfo.LOCAL_ID_INVALID.equals(reminder.moment) && (message2 == null || message2.createdTime < reminder.createdTime);
            this.f4528h = true;
        }
        if (CoreModule.P().i().j() && this.f4539s.m4255j3().localSafetyReminderTime <= 0.0d && NullChecker.a(this.f4539s.m4325x6()) && NullChecker.a(vwb.r(this.f4539s.m4325x6().status, new w9j() { // from class: l.g000
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, "RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER"));
            }
        }))) {
            Message message3 = (Message) vwb.F(q860Var.a);
            if (NullChecker.a(message3) && message3.isOtherUser() && !message3.localSensitiveWordReminder) {
                CoreModule.c.f0.mn(message3);
            }
        }
        if (this.f4527g) {
            Message messageNew_ = Message.new_();
            messageNew_.createdTime = reminder.createdTime;
            messageNew_.cid = ((DbObject) this.f4539s.m4255j3()).id;
            messageNew_.reminder = ((DbObject) reminder).id;
            messageNew_.moment = reminder.reference.id;
            arrayList = new ArrayList(q860Var.a);
            vwb.g0(arrayList, messageNew_, new Comparator() { // from class: l.h000
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return j000.m5262F((Message) obj, (Message) obj2);
                }
            });
        } else {
            arrayList = null;
        }
        if (!this.f4539s.m4231e4() && CoreModule.P().i().s4()) {
            fcz<?, ?> fczVar = this.f4539s;
            if (!fczVar.m4261k4(fczVar.m4295r3())) {
                if (!vwb.J(this.f4527g ? arrayList : q860Var.a) && NullChecker.a(message)) {
                    this.f4525e = (long) message.createdTime;
                }
            }
        }
        if (this.f4541u.isEmpty() && !vwb.J(q860Var.a)) {
            int iMin = Math.min(10, q860Var.a.size());
            for (int i = 0; i < Math.min(10, q860Var.a.size()); i++) {
                try {
                    this.f4541u.add((Message) q860Var.a.get(i));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("MessagesAdapter.render IndexOutOfBoundsException currentThread = ");
                    sb.append(Thread.currentThread().getName());
                    sb.append(",  userId = ");
                    sb.append(NullChecker.a(this.f4539s.m4191W5()) ? ((DbObject) this.f4539s.m4191W5()).id : "null");
                    sb.append(",  oldSize = ");
                    sb.append(iMin);
                    sb.append(",  currentSize = ");
                    sb.append(Math.min(10, q860Var.a.size()));
                    sb.append(",  index = ");
                    sb.append(i);
                    sb.append(",  list = ");
                    sb.append(q860Var.a.toString());
                    CrashHelper.c(new Exception(sb.toString()));
                }
            }
        }
        fcz<?, ?> fczVar2 = this.f4539s;
        if (!this.f4527g) {
            arrayList = q860Var.a;
        }
        fczVar2.f3560r = new q860<>(Lists.q(arrayList), q860Var.b);
        y();
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "GT-I9208".equalsIgnoreCase(Build.MODEL)) {
            this.f4539s.act().getWindow().setSoftInputMode(16);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m5287d() {
        return m5284a0().size();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m5288d0(final Message message) {
        if (this.f4534n.contains(((DbObject) message).id)) {
            return;
        }
        this.f4534n.add(((DbObject) message).id);
        this.f4539s.act().duringCreated(new v9j() { // from class: l.e000
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return mkd0.s(C1099c.just(ldm.c(message2.referenceMsgId)), C1099c.just(ldm.e(message2.referenceMsgId)), C1099c.just(ldm.d(message2.getHostId(), message2.referenceMsgId)), new y9j() { // from class: l.i000
                    @Override // p003l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo2764a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((Literatures) obj, (List) obj2, (List) obj3);
                    }
                });
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.f000
            @Override // p003l.e30
            public final void call(Object obj) {
                j000.m5261E(message, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public void m5289e(int i) {
        if (i > 5 || !this.f4539s.f3560r.c()) {
            return;
        }
        CoreModule.c.f0.Bn(this.f4539s.m4250i3());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m5290e0(Message message) {
        if (CoreModule.P().i().Hr() && message.value.contains("tantan://profile/edit?type=continuousEdit") && !this.f4532l.contains(message.value)) {
            this.f4532l.add(message.value);
            zvf0.x("e_assistant_update_profile", "p_chat_view");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m5291f0(Message message, int i) {
        if ((i == 69 || i == 200) && !this.f4533m.contains(((DbObject) message).id)) {
            this.f4533m.add(((DbObject) message).id);
            zvf0.A("e_other_state", "p_chat_view", new j760[]{new j760("state_id", message.referenceMsgId), new j760("owner_id", message.owner)});
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m5292g0(Message message) {
        if (!TEnum.equals(message.messageType, MessageType.get("question")) || this.f4538r.m7030a(((DbObject) message).id)) {
            return;
        }
        this.f4538r.m7031b(((DbObject) message).id);
        zvf0.A("e_message_question", "p_chat_view", new j760[]{vwb.Y("question_id", message.question)});
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5293h0(Message message, int i) {
        String str;
        if (i != 64 || this.f4531k.contains(message.value) || (str = message.msgData) == null || !str.contains("enterSuggestVoiceRoom")) {
            return;
        }
        this.f4531k.add(message.value);
        zvf0.A("e_live_audio_room_enter", "p_chat_view", new j760[]{new j760("audio_card_type", "message_audio_assistant"), new j760("liveId", ""), new j760("anchorId", ""), new j760("topic_id", ""), new j760("audio_room_type", ""), new j760("extra_info", "active_gift")});
    }

    /* JADX INFO: renamed from: m */
    public Message m5294m(int i) {
        return (Message) this.f4539s.f3560r.a.get(i);
    }

    /* JADX INFO: renamed from: p */
    public int m5295p(int i) {
        return m5274Q(m5294m(i), i);
    }

    /* JADX INFO: renamed from: s */
    public List<j760<Integer, Integer>> m5296s() {
        return vwb.f0(new j760[]{vwb.Y(0, 15), vwb.Y(116, 15), vwb.Y(12, 10), vwb.Y(128, 10), vwb.Y(2, 10), vwb.Y(118, 10), vwb.Y(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256), 20)});
    }

    /* JADX INFO: renamed from: w */
    public View m5297w(ViewGroup viewGroup, int i) {
        return m5265U(viewGroup, i);
    }
}
