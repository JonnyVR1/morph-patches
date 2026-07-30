package p149l;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.exoplayer2.PlaybackException;
import com.google.common.collect.Lists;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.Reminder;
import com.p046p1.mobile.putong.core.data.StateData;
import com.p046p1.mobile.putong.core.data.SystemReminder;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.ItemBirthdayTip;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetingTip;
import com.p046p1.mobile.putong.core.p053ui.messages.ChatTipsItem;
import com.p046p1.mobile.putong.core.p053ui.messages.CoreChatAiSendMomentItem;
import com.p046p1.mobile.putong.core.p053ui.messages.HistoryContentItem;
import com.p046p1.mobile.putong.core.p053ui.messages.IntrRiskTipItem;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddArtworkGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAddTagsGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiChatGuideMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiP2PChatGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBase;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBlindBoxGuideView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBreakIceMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatAssistantQuestion;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatAssistantQuestionAutoRight;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatInterceptRight;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatSafetyReminder;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatUnlockLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChristmasMatch;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBox;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBoxV2;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemConversationNotification;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCountdownLikeSuccess;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemDiceTip;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemFriendActiveRemindFemale;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemGuideAuthentication;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemHeartbeatNotifyNewUi;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemIceBreakStateRight;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemIntlConversationPrompt;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemIntlReadReceiptsGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLocalUXQuestionnaire;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLongTimeNoSeeTip;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzBreakIceMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzUnlockLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageMMTask;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageRight;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageWCInviteAfter;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMomentPostGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMsgRiskLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemODiamondVisitorGuideMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPicCertGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPlatinumPinGuideMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPrompt;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPromptIntl;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemRedPacketNotification;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemSendMsgTips;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemSystemRemind;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTagGuide;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTantanVerifyToast;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTickle;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemVisitorHideFootPrint;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemVoiceCallInvitation;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemWechatNotifyGuideMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemWoodenFishTip;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.NewOnlineMatchSuccessItem;
import com.p046p1.mobile.putong.core.p053ui.messages.ReminderView;
import com.p046p1.mobile.putong.core.p053ui.messages.UnMatchItem;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatMessageAnalysisItem;
import com.p046p1.mobile.putong.core.p053ui.messages.view.ItemMessageNewSurvey;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageIdealEnquiryLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLoveLetterGuideView;
import com.p046p1.mobile.putong.core.p053ui.mypets.view.item.ScriptMessageItem;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class j000 extends o000 {

    /* JADX INFO: renamed from: e */
    public long f115612e;

    /* JADX INFO: renamed from: f */
    public long f115613f;

    /* JADX INFO: renamed from: g */
    public boolean f115614g;

    /* JADX INFO: renamed from: h */
    public boolean f115615h;

    /* JADX INFO: renamed from: i */
    public Set<String> f115616i;

    /* JADX INFO: renamed from: j */
    public Set<String> f115617j;

    /* JADX INFO: renamed from: k */
    public Set<String> f115618k;

    /* JADX INFO: renamed from: l */
    public Set<String> f115619l;

    /* JADX INFO: renamed from: m */
    public Set<String> f115620m;

    /* JADX INFO: renamed from: n */
    public Set<String> f115621n;

    /* JADX INFO: renamed from: o */
    public Set<String> f115622o;

    /* JADX INFO: renamed from: p */
    public boolean f115623p;

    /* JADX INFO: renamed from: q */
    public int f115624q;

    /* JADX INFO: renamed from: r */
    public qsz f115625r;

    /* JADX INFO: renamed from: s */
    public fcz<?, ?> f115626s;

    /* JADX INFO: renamed from: t */
    public boolean f115627t;

    /* JADX INFO: renamed from: u */
    public List<Message> f115628u;

    /* JADX INFO: renamed from: l.j000$a */
    public class ViewOnLayoutChangeListenerC17659a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC17659a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (j000.this.f115626s.m120842t7().act().mo48971c0().m213066y0() != 0 && i4 != i8) {
                j000.this.f115626s.m120842t7().act().mo48971c0().m156457g0().mo134709j(Act.savedKeyboardHeight.get().intValue());
            }
            j000.this.f115626s.m120842t7().f171745n1.getRealView().removeOnLayoutChangeListener(this);
        }
    }

    public j000(ViewGroup viewGroup, fcz fczVar) {
        super(viewGroup);
        this.f115612e = 0L;
        this.f115613f = 0L;
        this.f115616i = new HashSet();
        this.f115617j = new HashSet();
        this.f115618k = new HashSet();
        this.f115619l = new HashSet();
        this.f115620m = new HashSet();
        this.f115621n = new HashSet();
        this.f115622o = new HashSet();
        this.f115623p = false;
        this.f115624q = 0;
        this.f115625r = new qsz();
        this.f115627t = false;
        this.f115628u = new ArrayList(5);
        this.f115626s = fczVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m139086E(Message message, xaj0 xaj0Var) {
        Literatures literatures;
        if (xaj0Var == null || (literatures = (Literatures) xaj0Var.f191751a) == null) {
            return;
        }
        zvf0.m220368A("e_chat_artwork_message", OMSDialogPositon.p_chat_view, new j760("artwork_message_sent_from_me", Boolean.valueOf(message.isMe())), new j760("artwork_status", ldm.m149448a(vwb.m200296J((Collection) xaj0Var.f191753c) ? null : (LiteraturesComments) ((List) xaj0Var.f191753c).get(0), !vwb.m200296J((Collection) xaj0Var.f191752b) ? (LiteraturesComments) ((List) xaj0Var.f191752b).get(0) : null)), new j760("artwork_title", literatures.title), new j760("artwork_type", ldm.m149449b(literatures)));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m139087F(Message message, Message message2) {
        return (int) (message.createdTime - message2.createdTime);
    }

    /* JADX INFO: renamed from: N */
    public static MessageTipsContent m139089N(Message message) {
        MessageExtData messageExtData;
        if (message == null || (messageExtData = message.extData) == null || messageExtData.chatTips == null || TEnum.equals(message.messageType, MessageType.love_letter)) {
            return null;
        }
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData2 = message.extData;
        return zIsMe ? messageExtData2.chatTips.selfShown : messageExtData2.chatTips.otherShown;
    }

    /* JADX INFO: renamed from: U */
    private View m139090U(ViewGroup viewGroup, int i) {
        if (!this.f115626s.mo120764e4() && i >= 11000) {
            View viewM139097O = m139097O(viewGroup, i - 11000);
            CoreChatAiSendMomentItem coreChatAiSendMomentItem = (CoreChatAiSendMomentItem) this.f115626s.act().inflater().inflate(l6c0.f126459e, viewGroup, false);
            coreChatAiSendMomentItem.addView(viewM139097O, 0, new ViewGroup.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return coreChatAiSendMomentItem;
        }
        if (!this.f115626s.mo120764e4() && i >= 10000) {
            View viewM139097O2 = m139097O(viewGroup, i - 10000);
            ChatTipsItem chatTipsItem = (ChatTipsItem) this.f115626s.act().inflater().inflate(l6c0.f126522n, viewGroup, false);
            chatTipsItem.addView(viewM139097O2, 0, new ViewGroup.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return chatTipsItem;
        }
        if (!this.f115626s.mo120764e4() && CoreModule.m29935P().m94652b().mo35107Yg() && i >= 8000) {
            View viewM139097O3 = m139097O(viewGroup, i - TXRecordCommon.AUDIO_SAMPLERATE_8000);
            ItemLoveBuzzUnlockLayout itemLoveBuzzUnlockLayout = (ItemLoveBuzzUnlockLayout) this.f115626s.act().inflater().inflate(l6c0.f126389T0, viewGroup, false);
            itemLoveBuzzUnlockLayout.addView(viewM139097O3, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return itemLoveBuzzUnlockLayout;
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && i >= 7000) {
            View viewM139097O4 = m139097O(viewGroup, i - PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            ItemChatUnlockLayout itemChatUnlockLayout = (ItemChatUnlockLayout) this.f115626s.act().inflater().inflate(l6c0.f126529o, viewGroup, false);
            itemChatUnlockLayout.addView(viewM139097O4, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return itemChatUnlockLayout;
        }
        if (i >= 5000) {
            View viewM139097O5 = m139097O(viewGroup, i - 5000);
            ItemChatSafetyReminder itemChatSafetyReminder = (ItemChatSafetyReminder) this.f115626s.act().inflater().inflate(l6c0.f126508l, viewGroup, false);
            itemChatSafetyReminder.addView(viewM139097O5, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return itemChatSafetyReminder;
        }
        if (i >= 2000) {
            View viewM139097O6 = m139097O(viewGroup, i - 2000);
            UnMatchItem unMatchItem = (UnMatchItem) this.f115626s.act().inflater().inflate(l6c0.f126373Q5, viewGroup, false);
            unMatchItem.addView(viewM139097O6, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return unMatchItem;
        }
        if (!this.f115626s.mo120764e4() && CoreModule.m29935P().m94658i().mo158354c() && i >= 1000) {
            View viewM139097O7 = m139097O(viewGroup, i - 1000);
            ViewGroup viewGroup2 = (ViewGroup) this.f115626s.act().inflater().inflate(l6c0.f126471f4, viewGroup, false);
            viewGroup2.addView(viewM139097O7, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
            return viewGroup2;
        }
        if (this.f115626s.mo120764e4() || !CoreModule.m29935P().m94652b().mo35107Yg() || i < 1000) {
            return m139097O(viewGroup, i);
        }
        View viewM139097O8 = m139097O(viewGroup, i - 1000);
        ViewGroup viewGroup3 = (ViewGroup) this.f115626s.act().inflater().inflate(l6c0.f126396U0, viewGroup, false);
        viewGroup3.addView(viewM139097O8, 0, new FrameLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
        return viewGroup3;
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m139091H(String str) {
        Matcher matcher = Pattern.compile("(^[^ :：]+[ :：]).+").matcher(str);
        return matcher.find() ? i0g0.m133861b0(str, vwb.m200324f0(matcher.group(1)), a1c0.f67123E, eqh0.m117752c(2)) : str;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m139092I(Message message) {
        StateData stateData;
        if (message == null || message.extData == null || !TEnum.equals(message.messageType, MessageType.moment_user_state)) {
            return false;
        }
        if (message.isOtherUser()) {
            return true;
        }
        try {
            stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            stateData = null;
        }
        return NullChecker.m81303a(stateData) && this.f115626s.m120788j3().f20374mm >= 1 && NullChecker.m81303a(CoreModule.m29934N().mo60276Gc()) && TextUtils.equals(CoreModule.m29934N().mo60276Gc().emotion.f38748id, stateData.emotionId);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m139093J(int i) {
        if (i != 116) {
            return (i >= 118 && i <= 126) || i == 127 || i == 128 || i == 181 || i == 59 || i == 178 || i == 185 || i == 187 || i == 65 || i == 189 || i == 265 || i == 191 || i == 245 || i == 271 || i == 255 || i == 277 || i == 273 || i == 281;
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public String m139094K(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.m81303a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: L */
    public final List<String> m139095L(View view, int i) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                arrayList.add(i + ":" + childAt.getClass().getSimpleName());
                arrayList.addAll(m139095L(childAt, i + 1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final int m139096M(Message message, int i) {
        ChallengeMsg challengeMsgMo158477y5;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        if (!NullChecker.m81303a(challengeMsgList) || vwb.m200296J(challengeMsgList.msgData)) {
            challengeMsgMo158477y5 = null;
        } else {
            int iM139098P = m139098P(challengeMsgList.msgData);
            if (iM139098P != -1) {
                return iM139098P;
            }
            challengeMsgMo158477y5 = CoreModule.m29935P().m94658i().mo158477y5(challengeMsgList, message);
            if (NullChecker.m81303a(challengeMsgMo158477y5)) {
                if (challengeMsgMo158477y5.type.equals(MessageType.stripes) || challengeMsgMo158477y5.type.equals(MessageType.stripes_without_button)) {
                    i = 215;
                }
                if (challengeMsgMo158477y5.type.equals(MessageType.user_info_card)) {
                    i = 217;
                }
                if (challengeMsgMo158477y5.type.equals(MessageType.normal_card)) {
                    i = TextUtils.equals(message.owner, CoreModule.m29931H().userId()) ? 216 : 86;
                }
            }
        }
        if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
            i = 140;
            if (!this.f115627t) {
                this.f115627t = true;
                if (NullChecker.m81303a(challengeMsgMo158477y5)) {
                    zvf0.m220368A("e_recall_message_notice", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", challengeMsgMo158477y5.eventlog));
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: O */
    public final View m139097O(ViewGroup viewGroup, int i) {
        View viewM139102T;
        int i2 = 140;
        if (i == 141 || i == 22 || i == 1 || i == 91 || i == 39 || i == 29 || i == 28 || i == 155 || i == 154 || i == 70) {
            ViewGroup viewGroup2 = (LinearLayout) this.f115626s.act().inflater().inflate(l6c0.f126330K4, viewGroup, false);
            viewGroup2.setClipChildren(false);
            View viewInflate = this.f115626s.act().inflater().inflate((i == 141 || i == 22 || i == 1 || i == 91 || i == 39) ? l6c0.f126605y5 : l6c0.f126598x5, viewGroup2, false);
            if (i == 29 || i == 28) {
                i2 = 0;
            } else if (i != 155 && i != 154) {
                i2 = i - 1;
            }
            viewGroup2.addView(m139102T(viewGroup2, i2), xdl0.f192403e, xdl0.f192404f);
            viewGroup2.addView(viewInflate, xdl0.f192403e, xdl0.f192404f);
            return viewGroup2;
        }
        if (i != 142 && i != 144 && i != 143 && i != 147 && i != 149 && i != 148 && i != 203 && i != 202 && i != 227 && i != 226 && i != 222) {
            if (i == 189) {
                ViewGroup viewGroup3 = (LinearLayout) this.f115626s.act().inflater().inflate(l6c0.f126330K4, viewGroup, false);
                viewGroup3.setClipChildren(false);
                View viewInflate2 = this.f115626s.act().inflater().inflate(l6c0.f126538p1, viewGroup, false);
                viewGroup3.addView(m139102T(viewGroup3, 116), xdl0.f192403e, xdl0.f192404f);
                viewGroup3.addView(viewInflate2, xdl0.f192403e, xdl0.f192404f);
                return viewGroup3;
            }
            if (i == 265) {
                ViewGroup viewGroup4 = (LinearLayout) this.f115626s.act().inflater().inflate(l6c0.f126330K4, viewGroup, false);
                viewGroup4.setClipChildren(false);
                View viewInflate3 = this.f115626s.act().inflater().inflate(l6c0.f126375R0, viewGroup, false);
                viewGroup4.addView(m139102T(viewGroup4, 116), xdl0.f192403e, xdl0.f192404f);
                viewGroup4.addView(viewInflate3, xdl0.f192403e, xdl0.f192404f);
                return viewGroup4;
            }
            if (i != 68) {
                return m139102T(viewGroup, i);
            }
            VText vText = new VText(this.f115626s.act());
            vText.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192403e, t100.m186890d(50.0f)));
            vText.setGravity(17);
            return vText;
        }
        ViewGroup viewGroup5 = (LinearLayout) this.f115626s.act().inflater().inflate(l6c0.f126330K4, viewGroup, false);
        if (i == 143 || i == 148) {
            viewM139102T = m139102T(viewGroup5, 67);
        } else if (i == 144 || i == 149) {
            viewM139102T = m139102T(viewGroup5, 140);
        } else if (i == 202 || i == 203) {
            viewM139102T = m139102T(viewGroup5, 69);
        } else {
            viewM139102T = (i == 226 || i == 227) ? m139102T(viewGroup5, 90) : m139102T(viewGroup5, 0);
        }
        viewGroup5.addView(viewM139102T, xdl0.f192403e, xdl0.f192404f);
        VText vText2 = new VText(viewGroup.getContext());
        if (i == 142 || i == 143 || i == 144 || i == 202 || i == 226 || i == 222) {
            vText2.setText(m139091H(this.f115626s.act().string(R$string.f21010k3)));
        } else {
            vText2.setText(m139091H(this.f115626s.act().string(R$string.f21019l3)));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        vText2.setTextColor(this.f115626s.act().color(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67126H));
        vText2.setTextSize(13.0f);
        int i3 = t100.f167276y;
        layoutParams.setMargins(i3, 0, i3, t100.m186890d(16.0f));
        vText2.setGravity(17);
        int i4 = t100.f167259h;
        int i5 = t100.f167258g;
        vText2.setPadding(i4, i5, i4, i5);
        viewGroup5.addView(vText2, layoutParams);
        return viewGroup5;
    }

    /* JADX INFO: renamed from: P */
    public final int m139098P(List<ChallengeMsg> list) {
        return TextUtils.equals(list.get(0).type, MessageType.middle_text) ? 240 : -1;
    }

    /* JADX INFO: renamed from: Q */
    public int m139099Q(Message message, int i) throws IOException {
        int i2;
        Boolean bool;
        if (this.f115626s.m120788j3() == null) {
            return 140;
        }
        int iM139100R = m139100R(message, i);
        if ((NullChecker.m81303a(this.f115626s.mo120858x6()) && this.f115626s.mo120858x6().unilateralBlock() && message.f56011id.startsWith("fake_id_")) || (((i2 = message.localFailType) == 5 || i2 == 7 || i2 == 6 || i2 == 8) && message.f56011id.startsWith("fake_id_"))) {
            return iM139100R + 2000;
        }
        if (!TEnum.equals(message.channel, "group") && CoreModule.m29935P().m94658i().mo158354c() && CoreModule.m29935P().m94658i().mo158355c0(message.cid, message.f56011id)) {
            return iM139100R + 1000;
        }
        if (message.localSafetyReminder || message.localSensitiveWordReminder) {
            return iM139100R + 5000;
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && (CoreModule.m29935P().m94658i().mo158367e1(message.cid, message.f56011id) || CoreModule.m29935P().m94658i().mo158439r3(message.cid, message.f56011id) || CoreModule.m29935P().m94658i().mo158406l4(message.cid, message.f56011id))) {
            return iM139100R + PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
        }
        if (m139103V(message) && ((bool = message.recalled) == null || !bool.booleanValue())) {
            return iM139100R + 9000;
        }
        if (CoreModule.m29935P().m94652b().mo35107Yg() && CoreModule.m29935P().m94652b().mo35097Jp(message.cid, message.f56011id)) {
            return iM139100R + TXRecordCommon.AUDIO_SAMPLERATE_8000;
        }
        if (CoreModule.m29935P().m94652b().mo35107Yg() && CoreModule.m29935P().m94652b().mo35114gh(message.cid, message.f56011id)) {
            return iM139100R + 1000;
        }
        if (m139105X(message)) {
            return iM139100R + 10000;
        }
        return m139104W(message) ? iM139100R + 11000 : iM139100R;
    }

    /* JADX WARN: Code duplicated, block: B:676:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:688:0x0a4a A[PHI: r4
      0x0a4a: PHI (r4v47 int) = (r4v46 int), (r4v46 int), (r4v46 int), (r4v51 int), (r4v51 int), (r4v51 int) binds: [B:735:0x0afc, B:729:0x0ae7, B:723:0x0ad4, B:699:0x0a72, B:693:0x0a5d, B:687:0x0a48] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: R */
    public final int m139100R(Message message, int i) throws IOException {
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
        int i7 = message.owner.equals(CoreModule.m29931H().userId()) ? 116 : 0;
        if ((CoreModule.m29935P().m94658i().mo158478z(message.owner) || ruy.m181215g().m181226o(this.f115626s.m120788j3())) && i7 == 0 && !TEnum.equals(message.messageType, MessageType.exchange_picture)) {
            return (NullChecker.m81303a(message.media) && message.media.size() > 0 && ((message.media.get(0) instanceof Video) || (message.media.get(0) instanceof Picture))) ? i7 + 49 : i7 + 48;
        }
        if (TEnum.equals(message.messageType, "picture_compliment")) {
            return message.isMe() ? 281 : 115;
        }
        if (TEnum.equals(message.messageType, MessageType.local_platinum_pin_guide)) {
            return 257;
        }
        if (TEnum.equals(message.messageType, MessageType.local_o_diamond_visitor_guide)) {
            return 267;
        }
        if (TEnum.equals(message.messageType, MessageType.local_ux_questionnaire)) {
            return 268;
        }
        if (TEnum.equals(message.messageType, MessageType.local_wechat_notify_guide)) {
            return 266;
        }
        if (TEnum.equals(message.messageType, MessageType.local_long_time_no_see)) {
            return 258;
        }
        if (TEnum.equals(message.messageType, MessageType.common_tip_box)) {
            return 264;
        }
        if (TEnum.equals(message.messageType, MessageType.common_tip_box_v2) || TEnum.equals(message.messageType, MessageType.mm_task)) {
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.ai_chat_analysis)) {
            return 275;
        }
        if (TEnum.equals(message.messageType, MessageType.ai_chat_analysis_guide)) {
            return 278;
        }
        if (TEnum.equals(message.messageType, "prologue")) {
            if (message.isMe()) {
                return message.recalled.booleanValue() ? 140 : 277;
            }
            return 114;
        }
        if (TEnum.equals(message.messageType, MessageType.wanwan_invite)) {
            return message.isMe() ? 204 : 87;
        }
        if (TEnum.equals(message.messageType, MessageType.wanwan_tip)) {
            return 219;
        }
        if (TEnum.equals(message.messageType, MessageType.local_friend_active_remind_female)) {
            return 249;
        }
        if (TEnum.equals(message.messageType, MessageType.continuous_chat_tip)) {
            return 252;
        }
        if (TEnum.equals(message.messageType, MessageType.female_unreply_reminder)) {
            return 250;
        }
        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
            return 192;
        }
        if (TEnum.equals(message.messageType, MessageType.local_visitor_hide_footprint)) {
            return 261;
        }
        if (TEnum.equals(message.messageType(), MessageType.operation)) {
            Boolean bool14 = message.recalled;
            return (bool14 == null || !bool14.booleanValue()) ? 57 : 140;
        }
        if (TEnum.equals(message.messageType(), "live_vip_greet")) {
            return 56;
        }
        if (TEnum.equals(message.messageType(), MessageType.ai_story_text)) {
            return 0;
        }
        if (TEnum.equals(message.messageType, MessageType.christmas_match)) {
            return Opcodes.IFNULL;
        }
        if (TEnum.equals(message.messageType(), MessageType.chat_gift) || TEnum.equals(message.messageType(), MessageType.moment_gift)) {
            ChatGiftInfoExtra chatGiftInfoExtraMo158257K2 = CoreModule.m29935P().m94658i().mo158257K2(message);
            boolean z = NullChecker.m81303a(chatGiftInfoExtraMo158257K2) && chatGiftInfoExtraMo158257K2.needOpen;
            if (!message.isMe()) {
                return z ? 66 : 62;
            }
            if (z) {
                return CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256;
            }
            return 185;
        }
        if (TEnum.equals(message.messageType(), MessageType.moment_notification)) {
            return 53;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_countdown_like_notify)) {
            return CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_countdown_like_success)) {
            return CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType(), MessageType.heartbeat_notify)) {
            return 207;
        }
        if (TEnum.equals(message.messageType(), "heartbeat_waiting_response")) {
            return 208;
        }
        if (TEnum.equals(message.messageType(), MessageType.heartbeat_success)) {
            return 209;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_break_ice)) {
            return 218;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_love_buzz_break_ice)) {
            return 234;
        }
        if (TEnum.equals(message.messageType(), MessageType.chatroom_share)) {
            if (qib0.f154713b0.f139232c.mo67271lp()) {
                return message.isMe() ? 224 : 89;
            }
            if (TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType(), "tantan_verify_toast")) {
            Message messageMo139119m = i > 0 ? mo139119m(i - 1) : null;
            Message messageMo139119m2 = i < mo139112d() - 1 ? mo139119m(i + 1) : null;
            if ((!NullChecker.m81303a(messageMo139119m) || messageMo139119m.createdTime != message.createdTime) && (!NullChecker.m81303a(messageMo139119m2) || messageMo139119m2.createdTime != message.createdTime)) {
                return CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
            }
            Message messageMo223809clone = message.mo223809clone();
            messageMo223809clone.createdTime += 1.0d;
            messageMo223809clone.localCreatedTime++;
            CoreModule.f17545c.f19642f0.m32894ah(messageMo223809clone, false);
            return CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_greeting_match_success) || TEnum.equals(message.messageType(), MessageType.local_chat_greeting_tip)) {
            return 188;
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet_notification)) {
            return 184;
        }
        if (TEnum.equals(message.messageType(), "local_friend_comment_toast")) {
            return 176;
        }
        if (TEnum.equals(message.messageType, MessageType.local_real_shot_tips)) {
            return 193;
        }
        if (TEnum.equals(message.messageType, MessageType.local_normal_tips) || TEnum.equals(message.messageType, MessageType.local_push_switch) || TEnum.equals(message.messageType, MessageType.local_push_switch_plus)) {
            return CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256;
        }
        if (TEnum.equals(message.messageType, MessageType.common_double_title_icon_click)) {
            return 241;
        }
        if (TEnum.equals(message.messageType, MessageType.moment_user_state) && ((bool13 = message.recalled) == null || !bool13.booleanValue())) {
            if (message.isOtherUser()) {
                return TextUtils.equals(CoreModule.m29935P().m94651a().mo33538lq(), "normal_message") ? 0 : 96;
            }
            try {
                stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if (NullChecker.m81303a(stateData) && TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
                return 260;
            }
            if (m139092I(message)) {
                return IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE;
            }
            return 97;
        }
        if (TEnum.equals(message.messageType, MessageType.system_reminder)) {
            boolean z2 = this.f115626s.m120723W2().compareTo(message.f56011id) >= 0;
            MessageAdditionalData messageAdditionalData = message.additionalData;
            if (messageAdditionalData == null || (systemReminder = messageAdditionalData.systemReminder) == null) {
                return 97;
            }
            return (systemReminder.showOnce && z2) ? 97 : 106;
        }
        if (TEnum.equals(message.messageType, MessageType.ai_picture) && ((bool12 = message.recalled) == null || !bool12.booleanValue())) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.icebreak_qa) && ((bool11 = message.recalled) == null || !bool11.booleanValue())) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.love_letter)) {
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType(), "tickle") || TEnum.equals(message.messageType(), "local_tickle_tip") || TEnum.equals(message.messageType(), MessageType.local_create_chat_group)) {
            return CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384;
        }
        if (TEnum.equals(message.messageType(), MessageType.conversation_notification) || TEnum.equals(message.messageType(), MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.common_tip) || TEnum.equals(message.messageType(), MessageType.local_ux_questionnaire_tip) || TEnum.equals(message.messageType(), MessageType.local_heart_beat_lock_tip)) {
            return 182;
        }
        if (TEnum.equals(message.messageType(), MessageType.oneweekcp_task)) {
            message.messageType = MessageType.get("unknown_");
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chanllenge_tips)) {
            return 220;
        }
        if (TEnum.equals(message.messageType, MessageType.real_shot) && ((bool10 = message.recalled) == null || !bool10.booleanValue())) {
            return message.isMe() ? 187 : 65;
        }
        if (TEnum.equals(message.messageType, MessageType.wooden_fish)) {
            message.messageType = MessageType.get("unknown_");
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chat_assistant_question_new)) {
            return 248;
        }
        if (TEnum.equals(message.messageType, MessageType.two_sides_different_tip)) {
            return 251;
        }
        if (TEnum.equals(message.messageType, MessageType.chat_assistant_question)) {
            if (!message.isMe()) {
                return 101;
            }
            if (NullChecker.m81303a(message.extData) && TextUtils.equals(message.extData.extra, "user")) {
                return 246;
            }
            if (NullChecker.m81303a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
                return 247;
            }
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        if (TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type)) {
            return 262;
        }
        if (!this.f115626s.mo120764e4() && ((CoreModule.m29935P().m94658i().mo158445t() || CoreModule.m29935P().m94658i().mo158204B()) && i >= this.f115626s.f96928r.f153135a.size() && NullChecker.m81303a(this.f115626s.mo120858x6()))) {
            if (!TextUtils.isEmpty(this.f115626s.mo120858x6().sendLetter) && !TextUtils.isEmpty(this.f115626s.f96925p)) {
                long j = this.f115626s.mo120858x6().sendLetterTimestamp;
                fcz<?, ?> fczVar = this.f115626s;
                if (j > fczVar.f96927q) {
                    return i == fczVar.f96928r.f153135a.size() ? 27 : 153;
                }
                return i == fczVar.f96928r.f153135a.size() ? 153 : 27;
            }
            if (!TextUtils.isEmpty(this.f115626s.mo120858x6().sendLetter)) {
                return 27;
            }
            if (!TextUtils.isEmpty(this.f115626s.f96925p)) {
                return 153;
            }
        }
        if (message.chatTyping) {
            return 30;
        }
        if (NullChecker.m81303a(message.reminder) && NullChecker.m81303a(message.moment)) {
            return CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;
        }
        Boolean bool15 = message.recalled;
        if (bool15 != null && bool15.booleanValue()) {
            i3 = 140;
        } else {
            if (TextUtils.equals(message.owner, User.ID_TEAM_ACCOUNT) && TEnum.equals(message.messageType, "text") && !TextUtils.isEmpty(message.answerOfMessage)) {
                return 55;
            }
            if (NullChecker.m81303a(message.moment)) {
                size = 21;
            } else if (NullChecker.m81303a(message.likeOfMoment)) {
                size = 23;
            } else if (NullChecker.m81303a(message.location)) {
                size = 20;
            } else if (NullChecker.m81303a(message.sticker)) {
                size = 12;
            } else if (NullChecker.m81303a(message.question)) {
                Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(message.question);
                List<Answer> list = questionM215900o3 == null ? null : questionM215900o3.answers;
                if (questionM215900o3 == null) {
                    CrashHelper.m81296c(new IllegalStateException("MessagesAdapter unable to query question id : " + (NullChecker.m81303a(message.question) ? message.question : "") + " message id : " + message.f56011id));
                }
                if (TextUtils.equals(message.owner, User.ID_TEAM_ACCOUNT) && (list == null || list.size() == 0)) {
                    return 55;
                }
                size = (list == null ? 0 : list.size()) + 13;
            } else {
                List<Media> list2 = message.media;
                if (list2 == null || list2.size() == 0) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    boolean z3 = message.media.get(0) instanceof Video;
                    List<Media> list3 = message.media;
                    if (z3) {
                        size2 = list3.size();
                    } else {
                        boolean z4 = list3.get(0) instanceof Picture;
                        List<Media> list4 = message.media;
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
            if (TEnum.equals(message.messageType, MessageType.ai_picture_query_auth)) {
                return 53;
            }
            if (zbq.m217989R(message) && message.isOtherUser()) {
                return 53;
            }
            if (TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance) && message.isOtherUser()) {
                return 53;
            }
            if (ubq.m192911q(message)) {
                if (!message.isOtherUser()) {
                    return CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                }
                if (this.f115618k.contains(message.f56011id) || !message.msgData.contains(SchemeKey.enterVoiceRoomPackageGiftRecall)) {
                    return 64;
                }
                this.f115618k.add(message.f56011id);
                zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new j760("audio_card_type", "message_audio_assistant"), new j760("liveId", ""), new j760("anchorId", ""), new j760("topic_id", ""), new j760("audio_room_type", ""));
                return 64;
            }
            if (ubq.m192910p(message) && message.isOtherUser()) {
                if (this.f115622o.contains(message.f56011id) || !ubq.m192910p(message)) {
                    return 88;
                }
                this.f115622o.add(message.f56011id);
                zvf0.m220402x("e_personalized_recommendation_helper", OMSDialogPositon.p_messages_view);
                return 88;
            }
            if (TEnum.equals(message.messageType, "literature")) {
                return message.isMe() ? 201 : 71;
            }
            if (TEnum.equals(message.messageType, MessageType.feedback) || message.value.contains(MessageType.feedback)) {
                if (NullChecker.m81303a(message.msgData)) {
                    try {
                        messageFeedbackStatus = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
                    } catch (IOException unused2) {
                        messageFeedbackStatus = null;
                    }
                } else {
                    messageFeedbackStatus = null;
                }
                if (NullChecker.m81303a(messageFeedbackStatus)) {
                    String str = messageFeedbackStatus.feedback_category;
                    if (TextUtils.equals(str, "solved") || TextUtils.equals(str, "satisfied")) {
                        return 72;
                    }
                    if (TextUtils.equals(str, Reason.TYPE)) {
                        return messageFeedbackStatus.question.answers.size() + 73;
                    }
                }
            }
            if (!TextUtils.isEmpty(message.referenceMsgId) && !TEnum.equals(message.messageType, MessageType.state_like) && !TEnum.equals(message.messageType, MessageType.state_comment)) {
                return message.isMe() ? 181 : 60;
            }
            if (TEnum.equals(message.messageType, MessageType.hide_for_fake_user)) {
                if (y19.m212151K()) {
                    return 102;
                }
                if (message.isMe()) {
                    return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
                }
                return 53;
            }
            int i8 = size + i7;
            if (TEnum.equals(message.messageType, MessageType.state_like) || TEnum.equals(message.messageType, MessageType.state_comment)) {
                i8 = message.isMe() ? 200 : 69;
            }
            if (TEnum.equals(message.messageType, MessageType.profile_like) && ((bool = message.recalled) == null || !bool.booleanValue())) {
                i3 = message.isMe() ? 225 : 90;
            } else if (TEnum.equals(message.messageType, MessageType.exclusive_chat_invite)) {
                i3 = message.isMe() ? 229 : 92;
            } else {
                i3 = i8;
            }
        }
        if (TEnum.equals(message.messageType(), "profile_cover_like") && ((bool9 = message.recalled) == null || !bool9.booleanValue())) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType(), "profile_cover_comment") && ((bool8 = message.recalled) == null || !bool8.booleanValue())) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType(), "mood_like") && ((bool7 = message.recalled) == null || !bool7.booleanValue())) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType(), "mood_comment") && ((bool6 = message.recalled) == null || !bool6.booleanValue())) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType, MessageType.profile_like) && NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType(), "moment_comment") && ((bool5 = message.recalled) == null || !bool5.booleanValue())) {
            i3 = message.isMe() ? CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 : 67;
        }
        if (i7 == 0 && NullChecker.m81303a(this.f115626s.m120726W5()) && NullChecker.m81303a(this.f115626s.mo120858x6()) && Math.abs(this.f115626s.m120788j3().localBotheringTime) == message.createdTime && TEnum.equals(this.f115626s.m120726W5().gender, "female") && TEnum.equals(this.f115626s.mo120858x6().gender, "male")) {
            i4 = i3 + 1;
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f115626s.m120788j3().localBotherWxTime) == message.createdTime) {
            if (NullChecker.m81303a(message.moment)) {
                i4 = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                i5 = 144;
                if (!TEnum.equals(message.messageType, MessageType.state_like) && !TEnum.equals(message.messageType, MessageType.state_comment)) {
                    boolean zEquals = TEnum.equals(message.messageType, MessageType.profile_like);
                    Boolean bool16 = message.recalled;
                    if (zEquals) {
                        if (NullChecker.m81303a(bool16) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 226;
                        }
                    } else if (NullChecker.m81303a(bool16) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA;
                    }
                } else if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
                    i4 = i5;
                } else {
                    i4 = 202;
                }
            }
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f115626s.m120788j3().localBotherCodeTime) == message.createdTime) {
            if (NullChecker.m81303a(message.moment)) {
                i4 = 148;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                i5 = 149;
                if (!TEnum.equals(message.messageType, MessageType.state_like) && !TEnum.equals(message.messageType, MessageType.state_comment)) {
                    boolean zEquals2 = TEnum.equals(message.messageType, MessageType.profile_like);
                    Boolean bool17 = message.recalled;
                    if (zEquals2) {
                        if (NullChecker.m81303a(bool17) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 227;
                        }
                    } else if (NullChecker.m81303a(bool17) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA;
                    }
                } else if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
                    i4 = i5;
                } else {
                    i4 = 203;
                }
            }
        } else if (!TEnum.equals(message.messageType(), "letter")) {
            i4 = i3;
        } else if (i7 == 116) {
            i4 = 153;
        } else {
            i4 = 27;
        }
        if (TEnum.equals(message.messageType(), "contact_info_rejection")) {
            i4 = 158;
        }
        if (TEnum.equals(message.messageType(), "reminder")) {
            i4 = message.isMe() ? 160 : 34;
        }
        if (TEnum.equals(message.messageType, "moment_chat") && ((bool4 = message.recalled) == null || !bool4.booleanValue())) {
            i4 = message.isMe() ? 161 : 35;
        }
        if (TEnum.equals(message.messageType, "survey") && ((bool3 = message.recalled) == null || !bool3.booleanValue())) {
            i4 = 41;
        }
        if (TEnum.equals(message.messageType, "card") && ((bool2 = message.recalled) == null || !bool2.booleanValue())) {
            i4 = message.isMe() ? 165 : 40;
        }
        if (TEnum.equals(message.messageType, MessageType.local_user_moment_message)) {
            i4 = 205;
        } else if (TEnum.equals(message.messageType(), MessageType.local_moment_post_guide)) {
            i4 = 228;
        }
        if (TEnum.equals(message.messageType, "voice_call")) {
            if (NullChecker.m81303a(message.additionalData)) {
                i4 = message.isMe() ? 167 : 42;
            } else {
                i4 = message.isMe() ? 173 : 53;
            }
        }
        if (TEnum.equals(message.messageType, "call_2_buy") && !TextUtils.isEmpty(message.msgData)) {
            i4 = 50;
        }
        if (TEnum.equals(message.messageType, MessageType.ice_breaking)) {
            i4 = message.isMe() ? 178 : 59;
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet)) {
            i4 = message.isMe() ? 183 : 61;
        }
        if (TEnum.equals(message.messageType, MessageType.new_survey)) {
            return 63;
        }
        int i9 = 116;
        if (i7 == 116) {
            if (NullChecker.m81303a(this.f115626s.mo120858x6()) && !this.f115626s.mo120858x6().unilateralBlock() && ((i6 = message.localFailType) == 3 || i6 == 4)) {
                return CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256;
            }
            i9 = 116;
        }
        if (i7 == i9 && message.localFailType == 9) {
            return 265;
        }
        if (TEnum.equals(message.messageType, MessageType.local_chat_inc_temp_warn)) {
            return 68;
        }
        if (TEnum.equals(message.messageType, MessageType.group_invitation)) {
            return TextUtils.equals(message.owner, CoreModule.m29931H().userId()) ? 206 : 84;
        }
        if (TEnum.equals(message.messageType, MessageType.tag_guide)) {
            return 223;
        }
        if (TEnum.equals(message.messageType, MessageType.local_match_ice_break)) {
            return 239;
        }
        if (TEnum.equals(message.messageType, MessageType.local_ai_p2p_chat_guide)) {
            return 253;
        }
        if (TEnum.equals(message.messageType, MessageType.local_pic_cert_guide)) {
            return 256;
        }
        if (TEnum.equals(message.messageType, MessageType.local_intl_read_receipts_guide)) {
            return 279;
        }
        if (TEnum.equals(message.messageType, MessageType.local_birthday_tip)) {
            return 242;
        }
        if (TEnum.equals(message.messageType, MessageType.local_ideal_enquiry)) {
            return 269;
        }
        if (TEnum.equals(message.messageType, MessageType.local_love_letter_guide)) {
            return 270;
        }
        if (TEnum.equals(message.messageType, MessageType.local_invitation_for_authentication)) {
            return 272;
        }
        if (TEnum.equals(message.messageType(), "tacit_test")) {
            return m139096M(message, i4);
        }
        if (TEnum.equals(message.messageType(), MessageType.picture_text_deeplink)) {
            return m139101S(message, i4);
        }
        if (TEnum.equals(message.messageType, MessageType.local_add_tags_guide)) {
            if (vwb.m200296J(CoreModule.m29935P().m94658i().mo158277N4())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 235;
        }
        if (TEnum.equals(message.messageType, MessageType.local_add_artwork_guide)) {
            if (vwb.m200296J(CoreModule.f17545c.f19682s1.f20087X) || CoreModule.f17545c.f19682s1.f20087X.size() < 3) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 236;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_tags_text)) {
            return 237;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_artwork_text)) {
            return 238;
        }
        if (TEnum.equals(message.messageType, MessageType.harass_alert)) {
            return message.isMe() ? 182 : 104;
        }
        if (TEnum.equals(message.messageType, MessageType.marriage_prologue)) {
            return message.isMe() ? 259 : 108;
        }
        if (i4 != 140 && message.messageType().isUnknownType()) {
            if (TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.exchange_picture)) {
            if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
                return 140;
            }
            if (message.isMe()) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (!TEnum.equals(message.messageType, MessageType.limit_time_picture)) {
            if (TEnum.equals(message.messageType, MessageType.local_blindbox_guide)) {
                return 53;
            }
            return i4;
        }
        if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
            return 140;
        }
        if (message.isMe()) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: S */
    public final int m139101S(Message message, int i) {
        if (TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: T */
    public View m139102T(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (i == 140) {
            return this.f115626s.act().inflater().inflate(l6c0.f126268B5, viewGroup, false);
        }
        if (i == 158) {
            return this.f115626s.act().inflater().inflate(l6c0.f126458d5, viewGroup, false);
        }
        if (i == 145) {
            return this.f115626s.act().inflater().inflate(l6c0.f126296F5, viewGroup, false);
        }
        if (i == 171 || i == 176 || i == 193 || i == 197) {
            if (i == 171 && !this.f115623p) {
                zvf0.m220402x("e_toast_chat_page_verification_guide", OMSDialogPositon.p_chat_view);
                this.f115623p = true;
            }
            return this.f115626s.act().inflater().inflate(l6c0.f126315I3, viewGroup, false);
        }
        if (i == 192) {
            return this.f115626s.act().inflater().inflate(l6c0.f126343M3, viewGroup, false);
        }
        if (i == 184) {
            return this.f115626s.act().inflater().inflate(l6c0.f126294F3, viewGroup, false);
        }
        if (i == 175) {
            return this.f115626s.act().inflater().inflate(l6c0.f126300G2, viewGroup, false);
        }
        if (i == 188) {
            return this.f115626s.act().inflater().inflate(l6c0.f126439b0, viewGroup, false);
        }
        if (i == 182 || i == 251) {
            return this.f115626s.act().inflater().inflate(l6c0.f126571u, viewGroup, false);
        }
        if (i == 63) {
            return this.f115626s.act().inflater().inflate(l6c0.f126511l2, viewGroup, false);
        }
        if (i == 205) {
            return this.f115626s.act().inflater().inflate(l6c0.f126561s3, viewGroup, false);
        }
        if (i == 228) {
            return this.f115626s.act().inflater().inflate(l6c0.f126568t3, viewGroup, false);
        }
        if (i == 194) {
            return this.f115626s.act().inflater().inflate(l6c0.f126377R2, viewGroup, false);
        }
        if (i == 195) {
            return this.f115626s.act().inflater().inflate(l6c0.f126384S2, viewGroup, false);
        }
        if (i == 198) {
            return this.f115626s.act().inflater().inflate(l6c0.f126355O1, viewGroup, false);
        }
        if (i == 219) {
            return this.f115626s.act().inflater().inflate(l6c0.f126369Q1, viewGroup, false);
        }
        if (i == 249 || i == 252) {
            return this.f115626s.act().inflater().inflate(l6c0.f126522n, viewGroup, false);
        }
        if (i == 250) {
            return this.f115626s.act().inflater().inflate(l6c0.f126318J, viewGroup, false);
        }
        if (i == 207 || i == 208) {
            return this.f115626s.act().inflater().inflate(l6c0.f126285E1, viewGroup, false);
        }
        if (i == 209) {
            return this.f115626s.act().inflater().inflate(l6c0.f126292F1, viewGroup, false);
        }
        if (i == 218) {
            return this.f115626s.act().inflater().inflate(l6c0.f126370Q2, viewGroup, false);
        }
        if (i == 217) {
            return this.f115626s.act().inflater().inflate(l6c0.f126327K1, viewGroup, false);
        }
        if (i == 215) {
            return this.f115626s.act().inflater().inflate(l6c0.f126594x1, viewGroup, false);
        }
        if (i == 241) {
            return this.f115626s.act().inflater().inflate(l6c0.f126545q1, viewGroup, false);
        }
        if (i == 220) {
            return this.f115626s.act().inflater().inflate(l6c0.f126510l1, viewGroup, false);
        }
        if (i == 223) {
            return this.f115626s.act().inflater().inflate(l6c0.f126308H3, viewGroup, false);
        }
        if (i == 239) {
            return this.f115626s.act().inflater().inflate(l6c0.f126434a2, viewGroup, false);
        }
        if (i == 253) {
            return this.f115626s.act().inflater().inflate(l6c0.f126356O2, viewGroup, false);
        }
        if (i == 256) {
            return this.f115626s.act().inflater().inflate(l6c0.f126596x3, viewGroup, false);
        }
        if (i == 258) {
            return this.f115626s.act().inflater().inflate(l6c0.f126491i3, viewGroup, false);
        }
        if (i == 257) {
            return this.f115626s.act().inflater().inflate(l6c0.f126595x2, viewGroup, false);
        }
        if (i == 267) {
            return this.f115626s.act().inflater().inflate(l6c0.f126532o2, viewGroup, false);
        }
        if (i == 266) {
            return this.f115626s.act().inflater().inflate(l6c0.f126321J2, viewGroup, false);
        }
        if (i == 268) {
            return this.f115626s.act().inflater().inflate(l6c0.f126477g3, viewGroup, false);
        }
        if (i == 109) {
            return this.f115626s.act().inflater().inflate(l6c0.f126363P2, viewGroup, false);
        }
        if (i == 234) {
            return this.f115626s.act().inflater().inflate(l6c0.f126498j3, viewGroup, false);
        }
        if (i == 231) {
            return this.f115626s.act().inflater().inflate(l6c0.f126288E4, viewGroup, false);
        }
        if (i == 235) {
            return this.f115626s.act().inflater().inflate(l6c0.f126342M2, viewGroup, false);
        }
        if (i == 236) {
            return this.f115626s.act().inflater().inflate(l6c0.f126335L2, viewGroup, false);
        }
        if (i == 237 || i == 238) {
            return this.f115626s.act().inflater().inflate(l6c0.f126301G3, viewGroup, false);
        }
        if (i == 240) {
            return this.f115626s.act().inflater().inflate(l6c0.f126448c2, viewGroup, false);
        }
        if (i == 242) {
            return this.f115626s.act().inflater().inflate(l6c0.f126427Z1, viewGroup, false);
        }
        if (i == 243) {
            return this.f115626s.act().inflater().inflate(l6c0.f126274C4, viewGroup, false);
        }
        if (i == 244) {
            return this.f115626s.act().inflater().inflate(l6c0.f126383S1, viewGroup, false);
        }
        if (i == 248) {
            return this.f115626s.act().inflater().inflate(l6c0.f126517m1, viewGroup, false);
        }
        if (i == 247) {
            return this.f115626s.act().inflater().inflate(l6c0.f126524n1, viewGroup, false);
        }
        if (i == 251) {
            return this.f115626s.act().inflater().inflate(l6c0.f126571u, viewGroup, false);
        }
        if (i == 104) {
            return this.f115626s.act().inflater().inflate(l6c0.f126399U3, viewGroup, false);
        }
        if (i == 106) {
            return this.f115626s.act().inflater().inflate(l6c0.f126405V3, viewGroup, false);
        }
        if (i == 97) {
            return new View(this.f115626s.act());
        }
        if (i == 261) {
            return this.f115626s.act().inflater().inflate(l6c0.f126307H2, viewGroup, false);
        }
        if (i == 262) {
            return this.f115626s.act().inflater().inflate(l6c0.f126564t, viewGroup, false);
        }
        if (i == 279) {
            return this.f115626s.act().inflater().inflate(l6c0.f126313I1, viewGroup, false);
        }
        if (i == 264) {
            return this.f115626s.act().inflater().inflate(l6c0.f126536p, viewGroup, false);
        }
        if (i == 274) {
            return this.f115626s.act().inflater().inflate(l6c0.f126543q, viewGroup, false);
        }
        if (i == 276) {
            return this.f115626s.act().inflater().inflate(l6c0.f126462e2, viewGroup, false);
        }
        if (i == 275) {
            return this.f115626s.act().inflater().inflate(l6c0.f126454d1, viewGroup, false);
        }
        if (i == 278) {
            return this.f115626s.act().inflater().inflate(l6c0.f126349N2, viewGroup, false);
        }
        if (i == 269) {
            return this.f115626s.act().inflater().inflate(l6c0.f126390T1, viewGroup, false);
        }
        if (i == 270) {
            return this.f115626s.act().inflater().inflate(l6c0.f126403V1, viewGroup, false);
        }
        if (i == 272) {
            return this.f115626s.act().inflater().inflate(l6c0.f126442b3, viewGroup, false);
        }
        boolean z = i >= 116;
        ItemMessageBase itemMessageBase = (ItemMessageBase) this.f115626s.act().inflater().inflate(z ? l6c0.f126493i5 : l6c0.f126486h5, viewGroup, false);
        int i3 = l6c0.f126338L5;
        if (i == 23) {
            i3 = l6c0.f126549q5;
        } else if (i == 139) {
            i3 = l6c0.f126556r5;
        } else if (i == 21) {
            i3 = l6c0.f126444b5;
        } else if (i == 137) {
            i3 = l6c0.f126451c5;
        } else if (i == 35) {
            i3 = l6c0.f126577u5;
        } else if (i == 161) {
            i3 = l6c0.f126584v5;
        } else if (i == 0 || i == 56) {
            i3 = l6c0.f126317I5;
        } else if (i == 48) {
            i3 = l6c0.f126302G4;
        } else if (i == 41) {
            i3 = l6c0.f126331K5;
        } else if (i == 116) {
            i3 = l6c0.f126324J5;
        } else if (i == 49) {
            i3 = l6c0.f126295F4;
        } else if (i >= 2 && i <= 10) {
            i3 = l6c0.f126472f5;
            i2 = i - 2;
        } else if (i >= 118 && i <= 126) {
            i3 = l6c0.f126479g5;
            i2 = i - 118;
        } else if (i == 11) {
            i3 = l6c0.f126400U4;
        } else if (i == 127) {
            i3 = l6c0.f126406V4;
        } else if (i == 12 || i == 128) {
            i3 = l6c0.f126303G5;
        } else if (i >= 13 && i <= 19) {
            i3 = l6c0.f126612z5;
            i2 = i - 13;
        } else if (i >= 129 && i <= 135) {
            i3 = l6c0.f126261A5;
            i2 = i - 129;
        } else if (i == 20) {
            i3 = l6c0.f126563s5;
        } else if (i == 136) {
            i3 = l6c0.f126570t5;
        } else if (i == 27) {
            i3 = l6c0.f126380R5;
        } else if (i == 153) {
            i3 = l6c0.f126387S5;
        } else if (i == 30) {
            i3 = l6c0.f126472f5;
            i2 = 1;
        } else if (i == 34) {
            i3 = l6c0.f126282D5;
        } else if (i == 160) {
            i3 = l6c0.f126289E5;
        } else if (i == 40) {
            i3 = l6c0.f126430Z4;
        } else if (i == 165) {
            i3 = l6c0.f126437a5;
        } else if (i == 42) {
            i3 = l6c0.f126350N3;
        } else if (i == 167) {
            i3 = l6c0.f126357O3;
        } else if (i == 50) {
            i3 = l6c0.f126452d;
        } else if (i == 51) {
            i3 = l6c0.f126309H4;
        } else if (i == 53) {
            i3 = l6c0.f126345M5;
        } else if (i == 173) {
            i3 = l6c0.f126352N5;
        } else if (i == 55) {
            i3 = l6c0.f126310H5;
        } else if (i == 59) {
            i3 = l6c0.f126337L4;
        } else if (i == 178) {
            i3 = l6c0.f126344M4;
        } else if (i == 60) {
            i3 = l6c0.f126265B2;
        } else if (i == 181) {
            i3 = l6c0.f126272C2;
        } else if (i == 183 || i == 61) {
            i3 = l6c0.f126287E3;
        } else if (i == 62) {
            i3 = l6c0.f126601y1;
        } else if (i == 185) {
            i3 = l6c0.f126608z1;
        } else if (i == 186) {
            i3 = l6c0.f126581v2;
        } else if (i == 64 || i == 88) {
            i3 = l6c0.f126574u2;
        } else if (i == 100 || i == 245) {
            i3 = l6c0.f126286E2;
        } else if (i == 65) {
            i3 = l6c0.f126259A3;
        } else if (i == 187) {
            i3 = l6c0.f126266B3;
        } else if (i == 66) {
            i3 = l6c0.f126257A1;
        } else if (i == 191) {
            i3 = l6c0.f126264B1;
        } else if (i == 67) {
            i3 = l6c0.f126540p3;
        } else if (i == 196) {
            i3 = l6c0.f126547q3;
        } else if (i == 69) {
            i3 = l6c0.f126410W2;
        } else if (i == 200) {
            i3 = l6c0.f126416X2;
        } else if (i == 71) {
            i3 = l6c0.f126273C3;
        } else if (i == 201) {
            i3 = l6c0.f126280D3;
        } else if (i == 72) {
            i3 = l6c0.f126422Y2;
        } else if (i >= 73 && i <= 83) {
            i3 = l6c0.f126435a3;
            i2 = i - 73;
        } else if (i == 206 || i == 84) {
            i3 = l6c0.f126516m0;
        } else if (i == 85 || i == 210) {
            i3 = l6c0.f126336L3;
        } else if (i == 86 || i == 216) {
            i3 = l6c0.f126293F2;
        } else if (i == 87 || i == 204) {
            i3 = l6c0.f126362P1;
        } else if (i == 89 || i == 224) {
            i3 = l6c0.f126397U1;
        } else if (i == 90) {
            i3 = l6c0.f126603y3;
        } else if (i == 225) {
            i3 = l6c0.f126610z3;
        } else if (i == 92 || i == 229) {
            i3 = l6c0.f126371Q3;
        } else if (i == 94 || i == 232) {
            i3 = l6c0.f126281D4;
        } else if (i == 95) {
            i3 = l6c0.f126398U2;
        } else if (i == 233) {
            i3 = l6c0.f126404V2;
        } else if (i == 96 || i == 260) {
            i3 = l6c0.f126376R1;
        } else if (i == 98) {
            i3 = l6c0.f126490i2;
        } else if (i == 99) {
            i3 = l6c0.f126588w2;
        } else if (i == 101) {
            i3 = l6c0.f126331K5;
        } else if (i != 246) {
            if (i == 102) {
                i3 = l6c0.f126385S3;
            } else if (i == 103) {
                i3 = l6c0.f126341M1;
            } else if (i == 254) {
                i3 = l6c0.f126348N1;
            } else if (i == 105) {
                i3 = l6c0.f126334L1;
            } else if (i == 107 || i == 255) {
                i3 = l6c0.f126421Y1;
            } else if (i == 259 || i == 108) {
                i3 = l6c0.f126455d2;
            } else if (i == 57) {
                i3 = l6c0.f126478g4;
            } else if (i == 110 || i == 263) {
                i3 = l6c0.f126320J1;
            } else if (i == 111 || i == 271) {
                i3 = l6c0.f126441b2;
            } else if (i == 112 || i == 273) {
                i3 = l6c0.f126358O4;
            } else if (i == 113) {
                i3 = l6c0.f126560s2;
            } else if (i == 114) {
                i3 = l6c0.f126322J3;
            } else if (i == 277) {
                i3 = l6c0.f126329K3;
            } else if (i == 115) {
                i3 = l6c0.f126420Y0;
            } else if (i == 281) {
                i3 = l6c0.f126426Z0;
            }
        }
        itemMessageBase.mo48346U(i3, this.f141274a, i2, z);
        return itemMessageBase;
    }

    /* JADX INFO: renamed from: V */
    public boolean m139103V(Message message) {
        if (message.f56011id.startsWith("fake_id_") || TextUtils.isEmpty(message.incTempInfo)) {
            return false;
        }
        return CoreModule.m29935P().m94658i().mo158432q1() || message.isOtherUser();
    }

    /* JADX INFO: renamed from: W */
    public boolean m139104W(Message message) {
        return TextUtils.equals(m139094K(message), "toShare") || TextUtils.equals(m139094K(message), "shared");
    }

    /* JADX INFO: renamed from: X */
    public boolean m139105X(Message message) {
        MessageTipsContent messageTipsContentM139089N = m139089N(message);
        if (NullChecker.m81303a(messageTipsContentM139089N)) {
            return !(TextUtils.isEmpty(messageTipsContentM139089N.value) && TextUtils.isEmpty(messageTipsContentM139089N.androidValue)) && m139110b0(message);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m139106Y(Message message) {
        Boolean bool;
        return Boolean.valueOf(message.owner.equals(this.f115626s.m120726W5().f56011id) && ((bool = message.recalled) == null || !bool.booleanValue()) && TEnum.equals(message.status(), "normal"));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Boolean m139107Z(Message message) {
        return Boolean.valueOf(message.owner.equals(this.f115626s.mo120828r3()));
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
    @Override // p149l.o000
    /* JADX INFO: renamed from: a */
    public void mo139108a(View view, Message message, int i, int i2) throws Exception {
        final j000 j000Var;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2;
        View childAt;
        Message messageMo139119m;
        Message messageMo139119m2;
        boolean z;
        boolean z2;
        boolean z3;
        List<Message> list;
        fcz<?, ?> fczVar;
        View childAt2 = view;
        int i7 = i;
        if (this.f115626s.m120788j3() == null) {
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
            i7 += ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
        }
        if (i7 / 1000 == 11) {
            i7 -= 11000;
        }
        if (!TEnum.equals(message.channel, "group") && ((CoreModule.m29935P().m94658i().mo158354c() || CoreModule.m29935P().m94652b().mo35107Yg()) && i7 / 1000 == 1)) {
            i7 -= 1000;
        }
        int i8 = i7;
        if (childAt2 instanceof ItemChatUnlockLayout) {
            ((ItemChatUnlockLayout) childAt2).m48090c(this.f115626s.mo120858x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockLayout) {
            ((ItemLoveBuzzUnlockLayout) childAt2).m48294b(this.f115626s.mo120858x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if ((childAt2 instanceof ChatTipsItem) && i8 != 249 && i8 != 252) {
            ((ChatTipsItem) childAt2).m47879d(i8, message, this.f115625r);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof CoreChatAiSendMomentItem) {
            ((CoreChatAiSendMomentItem) childAt2).m47890i(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockSuccess) {
            ((ItemLoveBuzzUnlockSuccess) childAt2).m48301g(this.f115626s.m120842t7(), this.f115626s.mo120858x6(), this.f115626s.m120726W5(), this.f115626s.f96919k);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemChatSafetyReminder) {
            ((ItemChatSafetyReminder) childAt2).m48087f(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof UnMatchItem) {
            ((UnMatchItem) childAt2).m49008b(this.f115626s.mo120858x6(), message, this.f115626s.m120788j3());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof NewOnlineMatchSuccessItem) {
            ((NewOnlineMatchSuccessItem) childAt2).m48991g(this.f115626s.m120842t7(), this.f115626s.mo120858x6(), this.f115626s.m120726W5());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof HistoryContentItem) {
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        View view3 = childAt2;
        if (view3 instanceof ItemFriendActiveRemindFemale) {
            ((ItemFriendActiveRemindFemale) view3).m48174b(message, this.f115626s.mo120858x6());
            return;
        }
        if (view3 instanceof ItemCommonTipBox) {
            ((ItemCommonTipBox) view3).m48106T(this.f115626s.act(), this, message);
            return;
        }
        if (view3 instanceof ItemDiceTip) {
            ((ItemDiceTip) view3).m48127b(message, this.f115626s.mo120858x6());
            return;
        }
        switch (i8) {
            case 1:
            case 22:
            case 28:
            case 29:
            case 39:
            case 70:
            case EACTags.NAME /* 91 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case 154:
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                j000Var = this;
                ViewGroup viewGroup = (ViewGroup) view3;
                View childAt3 = viewGroup.getChildAt(0);
                String str = (i8 == 154 || i8 == 28) ? "wx" : (i8 == 29 || i8 == 155) ? "code" : "normal";
                View childAt4 = viewGroup.getChildAt(1);
                try {
                    if (!(childAt4 instanceof ItemPromptIntl)) {
                        if (childAt4 instanceof ItemPrompt) {
                            i3 = 29;
                            i4 = 28;
                            ((ItemPrompt) childAt4).m48602m(message, j000Var.f115626s.m120788j3(), str, j000Var.f115626s.mo120828r3(), j000Var.f115626s.m120783i3());
                        }
                        if (i8 != i3 || i8 == i4) {
                            i5 = 0;
                        } else {
                            i5 = i8 - 1;
                        }
                        i6 = i5;
                        view2 = childAt3;
                        if (i6 == 41 && !j000Var.f115616i.contains(message.value)) {
                            j000Var.f115616i.add(message.value);
                            zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                        }
                        j000Var.m139118h0(message, i6);
                        j000Var.m139115e0(message);
                        j000Var.m139116f0(message, i6);
                        j000Var.m139117g0(message);
                        ItemBase itemBase = (ItemBase) view2;
                        if (i2 == 0) {
                            messageMo139119m = null;
                        } else {
                            messageMo139119m = j000Var.mo139119m(i2 - 1);
                        }
                        if (i2 == j000Var.mo139112d() - 1) {
                            messageMo139119m2 = null;
                        } else {
                            messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                        }
                        itemBase.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                        if (!j000Var.f115626s.mo120764e4() && (view2 instanceof ItemMessageRight)) {
                            if (CoreModule.m29935P().m94658i().mo158443s4()) {
                                fczVar = j000Var.f115626s;
                                if (!fczVar.m120794k4(fczVar.m120783i3())) {
                                    j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                    if (j000Var.f115626s.mo120764e4()) {
                                        z = false;
                                        z2 = false;
                                    } else {
                                        if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                            @Override // p149l.w9j
                                            public final Object call(Object obj) {
                                                return this.f78097a.m139106Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = j000Var.f115626s.f96928r.f153135a;
                                        if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                            @Override // p149l.w9j
                                            public final Object call(Object obj) {
                                                return this.f83143a.m139107Z((Message) obj);
                                            }
                                        })) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                    }
                                    if (IntlCountryCodeController.m28115k()) {
                                        boolean z4 = z3;
                                        j000 j000Var2 = j000Var;
                                        ((ItemMessageRight) view2).m48481n1(message, z4, j000Var2.f115613f, j000Var2.f115612e);
                                    } else {
                                        ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                    }
                                } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h()) || TEnum.equals(message.messageType, MessageType.love_letter)) {
                                    try {
                                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                        break;
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (j000Var.f115626s.mo120764e4()) {
                                        if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                            @Override // p149l.w9j
                                            public final Object call(Object obj) {
                                                return this.f78097a.m139106Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = j000Var.f115626s.f96928r.f153135a;
                                        if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                            @Override // p149l.w9j
                                            public final Object call(Object obj) {
                                                return this.f83143a.m139107Z((Message) obj);
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
                                    z3 = (!z2 && z && j000Var.m139093J(i6)) || (TEnum.equals(message.messageType, MessageType.love_letter) && message.isMe());
                                    if (IntlCountryCodeController.m28115k()) {
                                        ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                    } else {
                                        boolean z5 = z3;
                                        j000 j000Var3 = j000Var;
                                        ((ItemMessageRight) view2).m48481n1(message, z5, j000Var3.f115613f, j000Var3.f115612e);
                                    }
                                }
                            } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                                j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                if (j000Var.f115626s.mo120764e4()) {
                                    if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f78097a.m139106Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = j000Var.f115626s.f96928r.f153135a;
                                    if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f83143a.m139107Z((Message) obj);
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
                                if (IntlCountryCodeController.m28115k()) {
                                    ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                } else {
                                    boolean z6 = z3;
                                    j000 j000Var4 = j000Var;
                                    ((ItemMessageRight) view2).m48481n1(message, z6, j000Var4.f115613f, j000Var4.f115612e);
                                }
                            } else {
                                j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                if (j000Var.f115626s.mo120764e4()) {
                                    if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f78097a.m139106Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = j000Var.f115626s.f96928r.f153135a;
                                    if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f83143a.m139107Z((Message) obj);
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
                                if (IntlCountryCodeController.m28115k()) {
                                    ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                } else {
                                    boolean z7 = z3;
                                    j000 j000Var5 = j000Var;
                                    ((ItemMessageRight) view2).m48481n1(message, z7, j000Var5.f115613f, j000Var5.f115612e);
                                }
                            }
                        }
                        if (i6 == 245) {
                            ((ItemMessageRight) view2).m48482o1();
                        }
                        if (i6 == 255) {
                            ((ItemMessageRight) view2).m48479l1();
                            return;
                        }
                        return;
                    }
                    ((ItemPromptIntl) childAt4).m48616m(message, j000Var.f115626s.m120788j3());
                    ItemBase itemBase2 = (ItemBase) view2;
                    if (i2 == 0) {
                        messageMo139119m = null;
                    } else {
                        messageMo139119m = j000Var.mo139119m(i2 - 1);
                    }
                    if (i2 == j000Var.mo139112d() - 1) {
                        messageMo139119m2 = null;
                    } else {
                        messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                    }
                    itemBase2.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                    if (!j000Var.f115626s.mo120764e4()) {
                        if (CoreModule.m29935P().m94658i().mo158443s4()) {
                            fczVar = j000Var.f115626s;
                            if (!fczVar.m120794k4(fczVar.m120783i3())) {
                                j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                if (j000Var.f115626s.mo120764e4()) {
                                    if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f78097a.m139106Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = j000Var.f115626s.f96928r.f153135a;
                                    if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f83143a.m139107Z((Message) obj);
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
                                if (IntlCountryCodeController.m28115k()) {
                                    ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                } else {
                                    boolean z8 = z3;
                                    j000 j000Var6 = j000Var;
                                    ((ItemMessageRight) view2).m48481n1(message, z8, j000Var6.f115613f, j000Var6.f115612e);
                                }
                            } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                                j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                if (j000Var.f115626s.mo120764e4()) {
                                    if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f78097a.m139106Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = j000Var.f115626s.f96928r.f153135a;
                                    if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f83143a.m139107Z((Message) obj);
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
                                if (IntlCountryCodeController.m28115k()) {
                                    ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                } else {
                                    boolean z9 = z3;
                                    j000 j000Var7 = j000Var;
                                    ((ItemMessageRight) view2).m48481n1(message, z9, j000Var7.f115613f, j000Var7.f115612e);
                                }
                            } else {
                                j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                                if (j000Var.f115626s.mo120764e4()) {
                                    if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f78097a.m139106Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = j000Var.f115626s.f96928r.f153135a;
                                    if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                        @Override // p149l.w9j
                                        public final Object call(Object obj) {
                                            return this.f83143a.m139107Z((Message) obj);
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
                                if (IntlCountryCodeController.m28115k()) {
                                    ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                                } else {
                                    boolean z10 = z3;
                                    j000 j000Var8 = j000Var;
                                    ((ItemMessageRight) view2).m48481n1(message, z10, j000Var8.f115613f, j000Var8.f115612e);
                                }
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11 = z3;
                                j000 j000Var9 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11, j000Var9.f115613f, j000Var9.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z12 = z3;
                                j000 j000Var10 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z12, j000Var10.f115613f, j000Var10.f115612e);
                            }
                        }
                    }
                    if (i6 == 245) {
                        ((ItemMessageRight) view2).m48482o1();
                    }
                    if (i6 == 255) {
                        ((ItemMessageRight) view2).m48479l1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    j000 j000Var11 = j000Var;
                    int i9 = j000Var11.f115624q;
                    if (i9 == 0) {
                        j000Var11.f115624q = i9 + 1;
                        int iMo139120p = j000Var11.mo139120p(i2);
                        j000Var11.mo139108a(j000Var11.mo139122w((ViewGroup) view3.getParent(), iMo139120p), j000Var11.mo139119m(i2), iMo139120p, i2);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("MessagesAdapter error: \nuserId: ");
                    sb.append(CoreModule.m29931H().userId());
                    sb.append("\ncid: ");
                    sb.append(j000Var11.mo139119m(i2).cid);
                    sb.append("\nposition: ");
                    sb.append(i2);
                    sb.append("\nmessage id: ");
                    sb.append(message.f56011id);
                    sb.append("\nmessageType: ");
                    sb.append(j000Var11.m139099Q(j000Var11.mo139119m(i2), i2));
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
                    sb.append(SignParameters.NEW_LINE);
                    if (i2 > 0) {
                        sb.append("pre msgType: ");
                        int i10 = i2 - 1;
                        sb.append(j000Var11.m139099Q(j000Var11.mo139119m(i10), i10));
                        sb.append("\npre remote messageType: ");
                        sb.append(j000Var11.mo139119m(i10).messageType);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    if (i2 < j000Var11.mo139112d() - 1) {
                        sb.append("next msgType: ");
                        int i11 = i2 + 1;
                        sb.append(j000Var11.m139099Q(j000Var11.mo139119m(i11), i11));
                        sb.append("\nnext remote messageType: ");
                        sb.append(j000Var11.mo139119m(i11).messageType);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(message);
                    if (i2 > 0) {
                        arrayList.add(0, j000Var11.mo139119m(i2 - 1));
                    }
                    if (i2 > 1) {
                        arrayList.add(0, j000Var11.mo139119m(i2 - 2));
                    }
                    if (i2 > 2) {
                        arrayList.add(0, j000Var11.mo139119m(i2 - 3));
                    }
                    int i12 = i2 + 1;
                    if (i12 < j000Var11.mo139112d()) {
                        arrayList.add(j000Var11.mo139119m(i12));
                    }
                    int i13 = i2 + 2;
                    if (i13 < j000Var11.mo139112d()) {
                        arrayList.add(j000Var11.mo139119m(i13));
                    }
                    int i14 = i2 + 3;
                    if (i14 < j000Var11.mo139112d()) {
                        arrayList.add(j000Var11.mo139119m(i14));
                    }
                    sb.append("historyBottomMessages: ");
                    for (int i15 = 0; i15 < j000Var11.f115628u.size(); i15++) {
                        Message message2 = j000Var11.f115628u.get(i15);
                        sb.append("(");
                        sb.append(message2.f56011id);
                        sb.append(", ");
                        sb.append(message2.messageType);
                        sb.append("), ");
                    }
                    sb.append("\nnowBottomMessages: ");
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        Message message3 = (Message) arrayList.get(i16);
                        sb.append("(");
                        sb.append(message3.f56011id);
                        sb.append(", ");
                        sb.append(message3.messageType);
                        sb.append("), ");
                    }
                    sb.append("\ncrash caused by: ");
                    sb.append(e.getMessage());
                    CrashHelper.m81296c(new Exception(sb.toString()));
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
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
            case 27:
                j000Var = this;
                ItemBase itemBase3 = (ItemBase) view3;
                itemBase3.setLetterUser(j000Var.f115626s.mo120858x6());
                if (NullChecker.m81303a(j000Var.f115626s.mo120858x6()) && !j000Var.f115626s.m120632B3()) {
                    if (!(view3 instanceof ItemBase)) {
                        CrashHelper.m81296c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.m29349i() + ", convertView:" + j000Var.m139095L(view3, 0)));
                    }
                    itemBase3.mo48033f(j000Var.f115626s.mo120858x6(), j000Var.f115626s.mo120858x6().sendLetter, j000Var.f115626s.m120818p3());
                    return;
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase4 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase4.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z13 = z3;
                                j000 j000Var12 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z13, j000Var12.f115613f, j000Var12.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z14 = z3;
                                j000 j000Var13 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z14, j000Var13.f115613f, j000Var13.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z15 = z3;
                                j000 j000Var14 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z15, j000Var14.f115613f, j000Var14.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z16 = z3;
                            j000 j000Var15 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z16, j000Var15.f115613f, j000Var15.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z17 = z3;
                            j000 j000Var16 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z17, j000Var16.f115613f, j000Var16.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 63:
                ((ItemMessageNewSurvey) view3).m49860p0(message, this.f115626s);
                return;
            case 68:
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case 209:
            case 239:
                return;
            case 71:
            case 201:
                j000Var = this;
                j000Var.m139113d0(message);
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase5 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase5.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z18 = z3;
                                j000 j000Var17 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z18, j000Var17.f115613f, j000Var17.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z19 = z3;
                                j000 j000Var18 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z19, j000Var18.f115613f, j000Var18.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z110 = z3;
                                j000 j000Var19 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z110, j000Var19.f115613f, j000Var19.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z111 = z3;
                            j000 j000Var110 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z111, j000Var110.f115613f, j000Var110.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z112 = z3;
                            j000 j000Var111 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z112, j000Var111.f115613f, j000Var111.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 101:
                j000Var = this;
                if (!message.value.contains("你好呀，问个问题～\n")) {
                    message.value = "你好呀，问个问题～\n" + message.value;
                }
                if (!j000Var.f115625r.m176377a(message.f56011id)) {
                    j000Var.f115625r.m176378b(message.f56011id);
                    String str2 = message.msgData;
                    try {
                        ChatAssistantQuestion chatAssistantQuestion = !TextUtils.isEmpty(str2) ? ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData) : null;
                        if (NullChecker.m81303a(chatAssistantQuestion)) {
                            str2 = chatAssistantQuestion.type;
                        }
                        break;
                    } catch (IOException unused2) {
                    }
                    o6j0.m162864h("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_question_content", message.value), o6j0.C18854a.m162878h("chat_question_send_side", "to"), o6j0.C18854a.m162878h("chat_question_type", str2));
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase6 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase6.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z113 = z3;
                                j000 j000Var112 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z113, j000Var112.f115613f, j000Var112.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z114 = z3;
                                j000 j000Var113 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z114, j000Var113.f115613f, j000Var113.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z115 = z3;
                                j000 j000Var114 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z115, j000Var114.f115613f, j000Var114.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z116 = z3;
                            j000 j000Var115 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z116, j000Var115.f115613f, j000Var115.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z117 = z3;
                            j000 j000Var116 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z117, j000Var116.f115613f, j000Var116.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 104:
                ((ItemMsgRiskLayout) view3).m48535A(message);
                return;
            case 106:
                ((ItemSystemRemind) view3).mo48034g(this, message, i2 == 0 ? null : mo139119m(i2 - 1), i2 == mo139112d() - 1 ? null : mo139119m(i2 + 1));
                return;
            case 109:
                fcz<?, ?> fczVar2 = this.f115626s;
                ((ItemBlindBoxGuideView) view3).m48040e(fczVar2.f96919k, fczVar2.mo120858x6(), this.f115625r);
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
            case 144:
            case 202:
            case 222:
            case 226:
                j000Var = this;
                LinearLayout linearLayout = (LinearLayout) view3;
                childAt = linearLayout.getChildAt(0);
                VText vText = (VText) linearLayout.getChildAt(1);
                if (j000Var.f115626s.m120842t7() instanceof bpz) {
                    boolean z20 = ((bpz) j000Var.f115626s.m120842t7()).f76692M1;
                    fcz<?, ?> fczVar3 = j000Var.f115626s;
                    if (z20) {
                        vText.setTextColor(fczVar3.act().color(a1c0.f67146a0));
                        vText.setBackgroundResource(c3c0.f78625R4);
                    } else {
                        vText.setTextColor(fczVar3.act().color(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67157k));
                        vText.setBackgroundColor(0);
                    }
                }
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase7 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase7.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z118 = z3;
                                j000 j000Var117 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z118, j000Var117.f115613f, j000Var117.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z119 = z3;
                                j000 j000Var118 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z119, j000Var118.f115613f, j000Var118.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1110 = z3;
                                j000 j000Var119 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1110, j000Var119.f115613f, j000Var119.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z1111 = z3;
                            j000 j000Var1110 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z1111, j000Var1110.f115613f, j000Var1110.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z1112 = z3;
                            j000 j000Var1111 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z1112, j000Var1111.f115613f, j000Var1111.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                ((ReminderView) view3).m49000i(this.f115626s.m120788j3());
                return;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 148:
            case 149:
            case 203:
            case 227:
                j000Var = this;
                childAt = ((ViewGroup) view3).getChildAt(0);
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase8 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase8.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1113 = z3;
                                j000 j000Var1112 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1113, j000Var1112.f115613f, j000Var1112.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1114 = z3;
                                j000 j000Var1113 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1114, j000Var1113.f115613f, j000Var1113.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1115 = z3;
                                j000 j000Var1114 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1115, j000Var1114.f115613f, j000Var1114.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z1116 = z3;
                            j000 j000Var1115 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z1116, j000Var1115.f115613f, j000Var1115.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z1117 = z3;
                            j000 j000Var1116 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z1117, j000Var1116.f115613f, j000Var1116.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 153:
                j000Var = this;
                ItemBase itemBase9 = (ItemBase) view3;
                itemBase9.setLetterUser(j000Var.f115626s.mo120858x6());
                if (!j000Var.f115626s.m120632B3()) {
                    User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                    if (!(view3 instanceof ItemBase)) {
                        CrashHelper.m81296c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.m29349i() + ", convertView:" + j000Var.m139095L(view3, 0)));
                    }
                    fcz<?, ?> fczVar4 = j000Var.f115626s;
                    itemBase9.mo48033f(userM169527p9, fczVar4.f96925p, fczVar4.m120818p3());
                    return;
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase10 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase10.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1118 = z3;
                                j000 j000Var1117 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1118, j000Var1117.f115613f, j000Var1117.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z1119 = z3;
                                j000 j000Var1118 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z1119, j000Var1118.f115613f, j000Var1118.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11110 = z3;
                                j000 j000Var1119 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11110, j000Var1119.f115613f, j000Var1119.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z11111 = z3;
                            j000 j000Var11110 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z11111, j000Var11110.f115613f, j000Var11110.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z11112 = z3;
                            j000 j000Var11111 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z11112, j000Var11111.f115613f, j000Var11111.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
            case 176:
            case 193:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                ((ItemTantanVerifyToast) view3).m48721i(message, this.f115625r);
                return;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                ((ItemTickle) view3).m48745j(this, message, this.f115626s.mo120858x6());
                if (this.f115617j.contains(message.f56011id) || message.isLocal() || message.f56011id.startsWith("fake_id_")) {
                    return;
                }
                this.f115617j.add(message.f56011id);
                o6j0.m162864h("e_tickle_message", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                return;
            case 182:
                ((ItemConversationNotification) view3).m48112p(message, this.f115625r);
                return;
            case 184:
                ((ItemRedPacketNotification) view3).m48645a(message);
                return;
            case 188:
                ((ItemGreetingTip) view3).mo42388A(message);
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                j000Var = this;
                ViewGroup viewGroup2 = (ViewGroup) view3;
                childAt = viewGroup2.getChildAt(0);
                ((ItemChatInterceptRight) viewGroup2.getChildAt(1)).m48081h(j000Var, message, j000Var.f115626s.mo120858x6());
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase11 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase11.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11113 = z3;
                                j000 j000Var11112 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11113, j000Var11112.f115613f, j000Var11112.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11114 = z3;
                                j000 j000Var11113 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11114, j000Var11113.f115613f, j000Var11113.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11115 = z3;
                                j000 j000Var11114 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11115, j000Var11114.f115613f, j000Var11114.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z11116 = z3;
                            j000 j000Var11115 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z11116, j000Var11115.f115613f, j000Var11115.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z11117 = z3;
                            j000 j000Var11116 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z11117, j000Var11116.f115613f, j000Var11116.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 192:
                ((ItemVoiceCallInvitation) view3).m48777k(message);
                return;
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                ImageView imageView = (ImageView) view3.findViewById(y4c0.f195957E1);
                TextView textView = (TextView) view3.findViewById(y4c0.f196032Q4);
                TextView textView2 = (TextView) view3.findViewById(y4c0.f196207r0);
                if (ura.m195053e().m195057d().mo33699I4()) {
                    xdl0.m208346N(imageView, c3c0.f78704b2);
                    textView.setTextColor(shw.m184293m().getColor(a1c0.f67153g));
                    textView2.setTextColor(shw.m184293m().getColor(a1c0.f67155i));
                }
                if (NullChecker.m81303a(textView)) {
                    textView.setTypeface(eqh0.m117752c(3), 1);
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                ((ItemCountdownLikeSuccess) view3).m48120g(this.f115626s.m120842t7(), this.f115626s.m120783i3(), message);
                return;
            case Opcodes.IFNULL /* 198 */:
                ((ItemChristmasMatch) view3).m48094A(message);
                return;
            case 207:
            case 208:
                if (CoreModule.m29935P().m94658i().mo33602uh()) {
                    ((ItemHeartbeatNotifyNewUi) view3).m48201c(message, this.f115626s.m120788j3(), this.f115625r);
                    return;
                }
                return;
            case 215:
                ((ItemFinishedChallengeView) view3).m42378f(this.f115626s.act(), message, this.f115626s.mo120858x6(), this.f115625r);
                return;
            case 217:
                ((ItemInviteChallengeView) view3).m42384d(this.f115626s.act(), this.f115626s.mo120858x6(), message);
                return;
            case 218:
                ((ItemBreakIceMessage) view3).m48047g((MessagesAct) this.f115626s.act(), message);
                return;
            case 220:
                ((ItemChallengeTipsMsg) view3).m42367c(this.f115626s.act(), message, this.f115626s.mo120858x6().f56011id, this.f115625r);
                return;
            case 223:
                ((ItemTagGuide) view3).m48697e(message, this.f115626s.mo120858x6(), this.f115625r);
                return;
            case 228:
                ((ItemMomentPostGuide) view3).mo42388A(message);
                return;
            case 231:
                ((ItemMessageWCInviteAfter) view3).mo42388A(message);
                return;
            case 234:
                ((ItemLoveBuzzBreakIceMessage) view3).m48292g((MessagesAct) this.f115626s.act(), this, message);
                return;
            case 235:
                ((ItemAddTagsGuide) view3).m47949n(this.f115626s.act(), this.f115626s.mo120858x6(), this.f115625r, this.f115626s.f96911c);
                return;
            case 236:
                ((ItemAddArtworkGuide) view3).m47928x(this.f115626s.act(), this.f115626s.mo120858x6(), this.f115625r, this.f115626s.f96911c);
                return;
            case 237:
                ((ItemSendMsgTips) view3).m48661b(this.f115626s.act(), "tag");
                return;
            case 238:
                ((ItemSendMsgTips) view3).m48661b(this.f115626s.act(), "artwork");
                return;
            case 240:
                ((ScriptMessageItem) view3).m50108b(this.f115626s.act(), message, this.f115626s.mo120858x6().f56011id);
                return;
            case 241:
                ((ItemCommonIconTitleDesClikeView) view3).m42372b(this.f115626s.act(), message, this.f115626s.mo120858x6(), this.f115625r);
                return;
            case 242:
                ((ItemBirthdayTip) view3).m41663b(this.f115626s.mo120858x6());
                return;
            case 243:
                ((ItemWoodenFishTip) view3).m48784A(message);
                return;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                ((ItemIceBreakStateRight) view3).mo42388A(message);
                return;
            case 246:
            default:
                j000Var = this;
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase12 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase12.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11118 = z3;
                                j000 j000Var11117 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11118, j000Var11117.f115613f, j000Var11117.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z11119 = z3;
                                j000 j000Var11118 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z11119, j000Var11118.f115613f, j000Var11118.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z111110 = z3;
                                j000 j000Var11119 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z111110, j000Var11119.f115613f, j000Var11119.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z111111 = z3;
                            j000 j000Var111110 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z111111, j000Var111110.f115613f, j000Var111110.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z111112 = z3;
                            j000 j000Var111111 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z111112, j000Var111111.f115613f, j000Var111111.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 247:
                ((ItemChatAssistantQuestionAutoRight) view3).m48069z(this.f115626s.act(), this, message, this.f115625r);
                return;
            case 248:
                ((ItemChatAssistantQuestion) view3).m48062P(this.f115626s.act(), this, message, this.f115625r);
                return;
            case 249:
            case 252:
                ((ChatTipsItem) view3).m47879d(i8, message, this.f115625r);
                return;
            case 251:
                if (message.isMe() && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip.selfShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.selfShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.selfShown.value;
                } else if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip.otherShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.otherShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.otherShown.value;
                }
                ((ItemConversationNotification) view3).m48112p(message, this.f115625r);
                return;
            case 253:
                ((ItemAiP2PChatGuide) view3).m47984e(this.f115626s.mo120858x6(), this.f115625r);
                return;
            case 256:
                ((ItemPicCertGuide) view3).m48573e(this.f115626s.mo120858x6(), this.f115625r);
                return;
            case 257:
                ((ItemPlatinumPinGuideMessage) view3).m48582f(this.f115626s.act(), this, this.f115626s.mo120858x6(), this.f115626s.f96919k);
                return;
            case 258:
                ((ItemLongTimeNoSeeTip) view3).m48285b(this.f115625r, message, this.f115626s.mo120858x6(), this.f115626s.m120788j3());
                return;
            case 261:
                ((ItemVisitorHideFootPrint) view3).m48762j(this.f115626s.act(), this, this.f115626s.mo120858x6(), this.f115626s.f96919k, message);
                return;
            case 262:
                ((ItemIntlConversationPrompt) view3).m48228s(message, this.f115625r);
                return;
            case 265:
                ViewGroup viewGroup3 = (ViewGroup) view3;
                childAt = viewGroup3.getChildAt(0);
                ((IntrRiskTipItem) viewGroup3.getChildAt(1)).m47901g(this, message, this.f115625r);
                j000Var = this;
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    j000Var.f115616i.add(message.value);
                    zvf0.m220402x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                j000Var.m139118h0(message, i6);
                j000Var.m139115e0(message);
                j000Var.m139116f0(message, i6);
                j000Var.m139117g0(message);
                ItemBase itemBase13 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo139119m = null;
                } else {
                    messageMo139119m = j000Var.mo139119m(i2 - 1);
                }
                if (i2 == j000Var.mo139112d() - 1) {
                    messageMo139119m2 = null;
                } else {
                    messageMo139119m2 = j000Var.mo139119m(i2 + 1);
                }
                itemBase13.mo48034g(j000Var, message, messageMo139119m, messageMo139119m2);
                if (!j000Var.f115626s.mo120764e4()) {
                    if (CoreModule.m29935P().m94658i().mo158443s4()) {
                        fczVar = j000Var.f115626s;
                        if (!fczVar.m120794k4(fczVar.m120783i3())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z111113 = z3;
                                j000 j000Var111112 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z111113, j000Var111112.f115613f, j000Var111112.f115612e);
                            }
                        } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z111114 = z3;
                                j000 j000Var111113 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z111114, j000Var111113.f115613f, j000Var111113.f115612e);
                            }
                        } else {
                            j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                            if (j000Var.f115626s.mo120764e4()) {
                                if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f78097a.m139106Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = j000Var.f115626s.f96928r.f153135a;
                                if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                    @Override // p149l.w9j
                                    public final Object call(Object obj) {
                                        return this.f83143a.m139107Z((Message) obj);
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
                            if (IntlCountryCodeController.m28115k()) {
                                ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                            } else {
                                boolean z111115 = z3;
                                j000 j000Var111114 = j000Var;
                                ((ItemMessageRight) view2).m48481n1(message, z111115, j000Var111114.f115613f, j000Var111114.f115612e);
                            }
                        }
                    } else if (TextUtils.equals(j000Var.f115626s.mo120828r3(), CoreModule.m29935P().m94658i().mo158383h())) {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z111116 = z3;
                            j000 j000Var111115 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z111116, j000Var111115.f115613f, j000Var111115.f115612e);
                        }
                    } else {
                        j000Var.f115613f = Long.parseLong(j000Var.f115626s.m120788j3().otherReadUntil);
                        if (j000Var.f115626s.mo120764e4()) {
                            if (i2 == vwb.m200301O(j000Var.f115626s.f96928r.f153135a, new w9j() { // from class: l.c000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f78097a.m139106Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = j000Var.f115626s.f96928r.f153135a;
                            if (-1 == vwb.m200293G(vwb.m200338m0(list, list.size() - i2), new w9j() { // from class: l.d000
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return this.f83143a.m139107Z((Message) obj);
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
                        if (IntlCountryCodeController.m28115k()) {
                            ((ItemMessageRight) view2).m48480m1(j000Var.f115626s.act(), message, j000Var.f115626s.f96919k, j000Var, z3, j000Var.f115613f, j000Var.f115612e);
                        } else {
                            boolean z111117 = z3;
                            j000 j000Var111116 = j000Var;
                            ((ItemMessageRight) view2).m48481n1(message, z111117, j000Var111116.f115613f, j000Var111116.f115612e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m48482o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m48479l1();
                    return;
                }
                return;
            case 266:
                ((ItemWechatNotifyGuideMessage) view3).m48783c(this.f115626s.act(), this, this.f115626s.mo120858x6(), this.f115626s.f96919k);
                return;
            case 267:
                ((ItemODiamondVisitorGuideMessage) view3).m48543f(this.f115626s.act(), message, this.f115626s.mo120858x6());
                return;
            case 268:
                ((ItemLocalUXQuestionnaire) view3).m48265e((MessagesAct) this.f115626s.act(), this, message, this.f115625r);
                return;
            case 269:
                ((MessageIdealEnquiryLayout) view3).m49892p(this.f115626s.mo120858x6(), message, this.f115625r);
                return;
            case 270:
                ((MessageLoveLetterGuideView) view3).m49942f(this.f115626s.mo120858x6(), message, this.f115625r);
                return;
            case 272:
                ((ItemGuideAuthentication) view3).m48190c(this.f115626s.mo120858x6(), message, this, this.f115625r);
                return;
            case 274:
                ((ItemCommonTipBoxV2) view3).m48110S(this.f115626s.act(), this, message);
                return;
            case 275:
                ((AIChatMessageAnalysisItem) view3).m49025n((MessagesAct) this.f115626s.act(), message);
                return;
            case 276:
                ((ItemMessageMMTask) view3).m48428S((MessagesAct) this.f115626s.act(), this, message);
                return;
            case 278:
                ((ItemAiChatGuideMessage) view3).m47976s((MessagesAct) this.f115626s.act(), message);
                return;
            case 279:
                ((ItemIntlReadReceiptsGuide) view3).m48236X(this.f115626s.mo120858x6(), message, this.f115625r);
                return;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public List<Message> m139109a0() {
        return this.f115626s.f96928r.f153135a;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m139110b0(Message message) {
        return !TEnum.equals(message.messageType, MessageType.chat_assistant_question) || CoreModule.m29935P().m94658i().mo158458v5();
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c0 */
    public void m139111c0(q860<Message> q860Var, Reminder reminder, Message message) {
        List<Message> arrayList;
        m162103r();
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            this.f115626s.m120842t7().f171745n1.getRealView().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC17659a());
        }
        if (!this.f115615h) {
            Message message2 = (Message) vwb.m200292F(q860Var.f153135a);
            this.f115614g = NullChecker.m81303a(reminder) && !CoreMomentInfo.LOCAL_ID_INVALID.equals(reminder.moment) && (message2 == null || message2.createdTime < reminder.createdTime);
            this.f115615h = true;
        }
        if (CoreModule.m29935P().m94658i().mo158394j() && this.f115626s.m120788j3().localSafetyReminderTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && NullChecker.m81303a(this.f115626s.mo120858x6()) && NullChecker.m81303a(vwb.m200346r(this.f115626s.mo120858x6().status, new w9j() { // from class: l.g000
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, UserStatus.RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER));
            }
        }))) {
            Message message3 = (Message) vwb.m200292F(q860Var.f153135a);
            if (NullChecker.m81303a(message3) && message3.isOtherUser() && !message3.localSensitiveWordReminder) {
                CoreModule.f17545c.f19642f0.m33047mn(message3);
            }
        }
        if (this.f115614g) {
            Message messageNew_ = Message.new_();
            messageNew_.createdTime = reminder.createdTime;
            messageNew_.cid = this.f115626s.m120788j3().f56011id;
            messageNew_.reminder = reminder.f56011id;
            messageNew_.moment = reminder.reference.f20495id;
            arrayList = new ArrayList<>(q860Var.f153135a);
            vwb.m200326g0(arrayList, messageNew_, new Comparator() { // from class: l.h000
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return j000.m139087F((Message) obj, (Message) obj2);
                }
            });
        } else {
            arrayList = null;
        }
        if (!this.f115626s.mo120764e4() && CoreModule.m29935P().m94658i().mo158443s4()) {
            fcz<?, ?> fczVar = this.f115626s;
            if (!fczVar.m120794k4(fczVar.mo120828r3())) {
                if (!vwb.m200296J(this.f115614g ? arrayList : q860Var.f153135a) && NullChecker.m81303a(message)) {
                    this.f115612e = (long) message.createdTime;
                }
            }
        }
        if (this.f115628u.isEmpty() && !vwb.m200296J(q860Var.f153135a)) {
            int iMin = Math.min(10, q860Var.f153135a.size());
            for (int i = 0; i < Math.min(10, q860Var.f153135a.size()); i++) {
                try {
                    this.f115628u.add(q860Var.f153135a.get(i));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("MessagesAdapter.render IndexOutOfBoundsException currentThread = ");
                    sb.append(Thread.currentThread().getName());
                    sb.append(",  userId = ");
                    sb.append(NullChecker.m81303a(this.f115626s.m120726W5()) ? this.f115626s.m120726W5().f56011id : "null");
                    sb.append(",  oldSize = ");
                    sb.append(iMin);
                    sb.append(",  currentSize = ");
                    sb.append(Math.min(10, q860Var.f153135a.size()));
                    sb.append(",  index = ");
                    sb.append(i);
                    sb.append(",  list = ");
                    sb.append(q860Var.f153135a.toString());
                    CrashHelper.m81296c(new Exception(sb.toString()));
                }
            }
        }
        fcz<?, ?> fczVar2 = this.f115626s;
        if (!this.f115614g) {
            arrayList = q860Var.f153135a;
        }
        fczVar2.f96928r = new q860<>(Lists.m15930q(arrayList), q860Var.f153136b);
        m162104y();
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "GT-I9208".equalsIgnoreCase(Build.MODEL)) {
            this.f115626s.act().getWindow().setSoftInputMode(16);
        }
    }

    @Override // p149l.o000
    /* JADX INFO: renamed from: d */
    public int mo139112d() {
        return m139109a0().size();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m139113d0(final Message message) {
        if (this.f115621n.contains(message.f56011id)) {
            return;
        }
        this.f115621n.add(message.f56011id);
        this.f115626s.act().duringCreated(new v9j() { // from class: l.e000
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return mkd0.m154985s(C22306c.just(ldm.m149450c(message2.referenceMsgId)), C22306c.just(ldm.m149452e(message2.referenceMsgId)), C22306c.just(ldm.m149451d(message2.getHostId(), message2.referenceMsgId)), new y9j() { // from class: l.i000
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((Literatures) obj, (List) obj2, (List) obj3);
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.f000
            @Override // p149l.e30
            public final void call(Object obj) {
                j000.m139086E(message, (xaj0) obj);
            }
        }));
    }

    @Override // p149l.twl
    /* JADX INFO: renamed from: e */
    public void mo139114e(int i) {
        if (i > 5 || !this.f115626s.f96928r.m173343c()) {
            return;
        }
        CoreModule.f17545c.f19642f0.m32597Bn(this.f115626s.m120783i3());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m139115e0(Message message) {
        if (CoreModule.m29935P().m94658i().mo33337Hr() && message.value.contains("tantan://profile/edit?type=continuousEdit") && !this.f115619l.contains(message.value)) {
            this.f115619l.add(message.value);
            zvf0.m220402x("e_assistant_update_profile", OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m139116f0(Message message, int i) {
        if ((i == 69 || i == 200) && !this.f115620m.contains(message.f56011id)) {
            this.f115620m.add(message.f56011id);
            zvf0.m220368A("e_other_state", OMSDialogPositon.p_chat_view, new j760("state_id", message.referenceMsgId), new j760("owner_id", message.owner));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m139117g0(Message message) {
        if (!TEnum.equals(message.messageType, MessageType.get("question")) || this.f115625r.m176377a(message.f56011id)) {
            return;
        }
        this.f115625r.m176378b(message.f56011id);
        zvf0.m220368A("e_message_question", OMSDialogPositon.p_chat_view, vwb.m200311Y("question_id", message.question));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m139118h0(Message message, int i) {
        String str;
        if (i != 64 || this.f115618k.contains(message.value) || (str = message.msgData) == null || !str.contains(SchemeKey.enterSuggestVoiceRoom)) {
            return;
        }
        this.f115618k.add(message.value);
        zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new j760("audio_card_type", "message_audio_assistant"), new j760("liveId", ""), new j760("anchorId", ""), new j760("topic_id", ""), new j760("audio_room_type", ""), new j760("extra_info", "active_gift"));
    }

    @Override // p149l.o000
    /* JADX INFO: renamed from: m */
    public Message mo139119m(int i) {
        return this.f115626s.f96928r.f153135a.get(i);
    }

    @Override // p149l.o000
    /* JADX INFO: renamed from: p */
    public int mo139120p(int i) {
        return m139099Q(mo139119m(i), i);
    }

    @Override // p149l.o000
    /* JADX INFO: renamed from: s */
    public List<j760<Integer, Integer>> mo139121s() {
        return vwb.m200324f0(vwb.m200311Y(0, 15), vwb.m200311Y(116, 15), vwb.m200311Y(12, 10), vwb.m200311Y(128, 10), vwb.m200311Y(2, 10), vwb.m200311Y(118, 10), vwb.m200311Y(182, 20));
    }

    @Override // p149l.o000
    /* JADX INFO: renamed from: w */
    public View mo139122w(ViewGroup viewGroup, int i) {
        return m139090U(viewGroup, i);
    }
}
