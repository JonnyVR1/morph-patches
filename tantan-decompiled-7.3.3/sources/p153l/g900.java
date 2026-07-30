package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.Reminder;
import com.p051p1.mobile.putong.core.data.StateData;
import com.p051p1.mobile.putong.core.data.SystemReminder;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.ItemBirthdayTip;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemChallengeTipsMsg;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemFinishedChallengeView;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetingTip;
import com.p051p1.mobile.putong.core.p058ui.messages.ChatTipsItem;
import com.p051p1.mobile.putong.core.p058ui.messages.CoreChatAiSendMomentItem;
import com.p051p1.mobile.putong.core.p058ui.messages.HistoryContentItem;
import com.p051p1.mobile.putong.core.p058ui.messages.IntrRiskTipItem;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddArtworkGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAddTagsGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiChatGuideMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiP2PChatGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBlindBoxGuideView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBreakIceMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatAssistantQuestion;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatAssistantQuestionAutoRight;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatInterceptRight;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatSafetyReminder;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatUnlockLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChristmasMatch;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBox;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBoxV2;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemConversationNotification;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCountdownLikeSuccess;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemDiceTip;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemFriendActiveRemindFemale;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemGuideAuthentication;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemHeartbeatNotifyNewUi;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemIceBreakStateRight;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemIntlConversationPrompt;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemIntlReadReceiptsGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLocalUXQuestionnaire;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLongTimeNoSeeTip;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzBreakIceMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzUnlockLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzUnlockSuccess;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageMMTask;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageRight;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageWCInviteAfter;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMomentPostGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMsgRiskLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemODiamondVisitorGuideMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPicCertGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPlatinumPinGuideMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPrompt;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPromptIntl;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemRedPacketNotification;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemSendMsgTips;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemSystemRemind;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTagGuide;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTantanVerifyToast;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTickle;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemVisitorHideFootPrint;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemVoiceCallInvitation;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemWechatNotifyGuideMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemWoodenFishTip;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.NewOnlineMatchSuccessItem;
import com.p051p1.mobile.putong.core.p058ui.messages.ReminderView;
import com.p051p1.mobile.putong.core.p058ui.messages.UnMatchItem;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatMessageAnalysisItem;
import com.p051p1.mobile.putong.core.p058ui.messages.view.ItemMessageNewSurvey;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageIdealEnquiryLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLoveLetterGuideView;
import com.p051p1.mobile.putong.core.p058ui.mypets.view.item.ScriptMessageItem;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class g900 extends l900 {

    /* JADX INFO: renamed from: e */
    public long f102732e;

    /* JADX INFO: renamed from: f */
    public long f102733f;

    /* JADX INFO: renamed from: g */
    public boolean f102734g;

    /* JADX INFO: renamed from: h */
    public boolean f102735h;

    /* JADX INFO: renamed from: i */
    public Set<String> f102736i;

    /* JADX INFO: renamed from: j */
    public Set<String> f102737j;

    /* JADX INFO: renamed from: k */
    public Set<String> f102738k;

    /* JADX INFO: renamed from: l */
    public Set<String> f102739l;

    /* JADX INFO: renamed from: m */
    public Set<String> f102740m;

    /* JADX INFO: renamed from: n */
    public Set<String> f102741n;

    /* JADX INFO: renamed from: o */
    public Set<String> f102742o;

    /* JADX INFO: renamed from: p */
    public boolean f102743p;

    /* JADX INFO: renamed from: q */
    public int f102744q;

    /* JADX INFO: renamed from: r */
    public n100 f102745r;

    /* JADX INFO: renamed from: s */
    public clz<?, ?> f102746s;

    /* JADX INFO: renamed from: t */
    public boolean f102747t;

    /* JADX INFO: renamed from: u */
    public List<Message> f102748u;

    /* JADX INFO: renamed from: l.g900$a */
    public class ViewOnLayoutChangeListenerC17179a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC17179a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (g900.this.f102746s.m111048t7().act().mo50155d0().m201111y0() != 0 && i4 != i8) {
                g900.this.f102746s.m111048t7().act().mo50155d0().m143374g0().mo125464j(Act.savedKeyboardHeight.get().intValue());
            }
            g900.this.f102746s.m111048t7().f160408n1.getRealView().removeOnLayoutChangeListener(this);
        }
    }

    public g900(ViewGroup viewGroup, clz clzVar) {
        super(viewGroup);
        this.f102732e = 0L;
        this.f102733f = 0L;
        this.f102736i = new HashSet();
        this.f102737j = new HashSet();
        this.f102738k = new HashSet();
        this.f102739l = new HashSet();
        this.f102740m = new HashSet();
        this.f102741n = new HashSet();
        this.f102742o = new HashSet();
        this.f102743p = false;
        this.f102744q = 0;
        this.f102745r = new n100();
        this.f102747t = false;
        this.f102748u = new ArrayList(5);
        this.f102746s = clzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m129473E(Message message, bkj0 bkj0Var) {
        Literatures literatures;
        if (bkj0Var == null || (literatures = (Literatures) bkj0Var.f77081a) == null) {
            return;
        }
        i4g0.m138492A("e_chat_artwork_message", OMSDialogPositon.p_chat_view, new pf60("artwork_message_sent_from_me", Boolean.valueOf(message.isMe())), new pf60("artwork_status", bgm.m104228a(jyb.m147479J((Collection) bkj0Var.f77083c) ? null : (LiteraturesComments) ((List) bkj0Var.f77083c).get(0), !jyb.m147479J((Collection) bkj0Var.f77082b) ? (LiteraturesComments) ((List) bkj0Var.f77082b).get(0) : null)), new pf60("artwork_title", literatures.title), new pf60("artwork_type", bgm.m104229b(literatures)));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m129474F(Message message, Message message2) {
        return (int) (message.createdTime - message2.createdTime);
    }

    /* JADX INFO: renamed from: N */
    public static MessageTipsContent m129476N(Message message) {
        MessageExtData messageExtData;
        if (message == null || (messageExtData = message.extData) == null || messageExtData.chatTips == null || TEnum.equals(message.messageType, MessageType.love_letter)) {
            return null;
        }
        boolean zIsMe = message.isMe();
        MessageExtData messageExtData2 = message.extData;
        return zIsMe ? messageExtData2.chatTips.selfShown : messageExtData2.chatTips.otherShown;
    }

    /* JADX INFO: renamed from: U */
    private View m129477U(ViewGroup viewGroup, int i) {
        if (!this.f102746s.mo110970e4() && i >= 11000) {
            View viewM129484O = m129484O(viewGroup, i - 11000);
            CoreChatAiSendMomentItem coreChatAiSendMomentItem = (CoreChatAiSendMomentItem) this.f102746s.act().inflater().inflate(qec0.f157015e, viewGroup, false);
            coreChatAiSendMomentItem.addView(viewM129484O, 0, new ViewGroup.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return coreChatAiSendMomentItem;
        }
        if (!this.f102746s.mo110970e4() && i >= 10000) {
            View viewM129484O2 = m129484O(viewGroup, i - 10000);
            ChatTipsItem chatTipsItem = (ChatTipsItem) this.f102746s.act().inflater().inflate(qec0.f157078n, viewGroup, false);
            chatTipsItem.addView(viewM129484O2, 0, new ViewGroup.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return chatTipsItem;
        }
        if (!this.f102746s.mo110970e4() && CoreModule.m30933P().m143406b().mo36110Yg() && i >= 8000) {
            View viewM129484O3 = m129484O(viewGroup, i - TXRecordCommon.AUDIO_SAMPLERATE_8000);
            ItemLoveBuzzUnlockLayout itemLoveBuzzUnlockLayout = (ItemLoveBuzzUnlockLayout) this.f102746s.act().inflater().inflate(qec0.f156945T0, viewGroup, false);
            itemLoveBuzzUnlockLayout.addView(viewM129484O3, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return itemLoveBuzzUnlockLayout;
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && i >= 7000) {
            View viewM129484O4 = m129484O(viewGroup, i - PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            ItemChatUnlockLayout itemChatUnlockLayout = (ItemChatUnlockLayout) this.f102746s.act().inflater().inflate(qec0.f157085o, viewGroup, false);
            itemChatUnlockLayout.addView(viewM129484O4, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return itemChatUnlockLayout;
        }
        if (i >= 5000) {
            View viewM129484O5 = m129484O(viewGroup, i - 5000);
            ItemChatSafetyReminder itemChatSafetyReminder = (ItemChatSafetyReminder) this.f102746s.act().inflater().inflate(qec0.f157064l, viewGroup, false);
            itemChatSafetyReminder.addView(viewM129484O5, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return itemChatSafetyReminder;
        }
        if (i >= 2000) {
            View viewM129484O6 = m129484O(viewGroup, i - 2000);
            UnMatchItem unMatchItem = (UnMatchItem) this.f102746s.act().inflater().inflate(qec0.f156929Q5, viewGroup, false);
            unMatchItem.addView(viewM129484O6, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return unMatchItem;
        }
        if (!this.f102746s.mo110970e4() && CoreModule.m30933P().m143412i().mo180446c() && i >= 1000) {
            View viewM129484O7 = m129484O(viewGroup, i - 1000);
            ViewGroup viewGroup2 = (ViewGroup) this.f102746s.act().inflater().inflate(qec0.f157027f4, viewGroup, false);
            viewGroup2.addView(viewM129484O7, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
            return viewGroup2;
        }
        if (this.f102746s.mo110970e4() || !CoreModule.m30933P().m143406b().mo36110Yg() || i < 1000) {
            return m129484O(viewGroup, i);
        }
        View viewM129484O8 = m129484O(viewGroup, i - 1000);
        ViewGroup viewGroup3 = (ViewGroup) this.f102746s.act().inflater().inflate(qec0.f156952U0, viewGroup, false);
        viewGroup3.addView(viewM129484O8, 0, new FrameLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
        return viewGroup3;
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m129478H(String str) {
        Matcher matcher = Pattern.compile("(^[^ :：]+[ :：]).+").matcher(str);
        return matcher.find() ? q8g0.m175796b0(str, jyb.m147507f0(matcher.group(1)), g9c0.f102787E, lyh0.m156283c(2)) : str;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m129479I(Message message) {
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
            CrashHelper.m82479c(e);
            stateData = null;
        }
        return NullChecker.m82486a(stateData) && this.f102746s.m110994j3().f21116mm >= 1 && NullChecker.m82486a(CoreModule.m30932N().mo61460Gc()) && TextUtils.equals(CoreModule.m30932N().mo61460Gc().emotion.f39596id, stateData.emotionId);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m129480J(int i) {
        if (i != 116) {
            return (i >= 118 && i <= 126) || i == 127 || i == 128 || i == 181 || i == 59 || i == 178 || i == 185 || i == 187 || i == 65 || i == 189 || i == 265 || i == 191 || i == 245 || i == 271 || i == 255 || i == 277 || i == 273 || i == 281;
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public String m129481K(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.m82486a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: L */
    public final List<String> m129482L(View view, int i) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                arrayList.add(i + ":" + childAt.getClass().getSimpleName());
                arrayList.addAll(m129482L(childAt, i + 1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public final int m129483M(Message message, int i) {
        ChallengeMsg challengeMsgMo180569y5;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        if (!NullChecker.m82486a(challengeMsgList) || jyb.m147479J(challengeMsgList.msgData)) {
            challengeMsgMo180569y5 = null;
        } else {
            int iM129485P = m129485P(challengeMsgList.msgData);
            if (iM129485P != -1) {
                return iM129485P;
            }
            challengeMsgMo180569y5 = CoreModule.m30933P().m143412i().mo180569y5(challengeMsgList, message);
            if (NullChecker.m82486a(challengeMsgMo180569y5)) {
                if (challengeMsgMo180569y5.type.equals(MessageType.stripes) || challengeMsgMo180569y5.type.equals(MessageType.stripes_without_button)) {
                    i = 215;
                }
                if (challengeMsgMo180569y5.type.equals(MessageType.user_info_card)) {
                    i = 217;
                }
                if (challengeMsgMo180569y5.type.equals(MessageType.normal_card)) {
                    i = TextUtils.equals(message.owner, CoreModule.m30929H().userId()) ? 216 : 86;
                }
            }
        }
        if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
            i = 140;
            if (!this.f102747t) {
                this.f102747t = true;
                if (NullChecker.m82486a(challengeMsgMo180569y5)) {
                    i4g0.m138492A("e_recall_message_notice", OMSDialogPositon.p_chat_view, jyb.m147494Y("in_harmony_test_string", challengeMsgMo180569y5.eventlog));
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: O */
    public final View m129484O(ViewGroup viewGroup, int i) {
        View viewM129489T;
        int i2 = 140;
        if (i == 141 || i == 22 || i == 1 || i == 91 || i == 39 || i == 29 || i == 28 || i == 155 || i == 154 || i == 70) {
            ViewGroup viewGroup2 = (LinearLayout) this.f102746s.act().inflater().inflate(qec0.f156886K4, viewGroup, false);
            viewGroup2.setClipChildren(false);
            View viewInflate = this.f102746s.act().inflater().inflate((i == 141 || i == 22 || i == 1 || i == 91 || i == 39) ? qec0.f157161y5 : qec0.f157154x5, viewGroup2, false);
            if (i == 29 || i == 28) {
                i2 = 0;
            } else if (i != 155 && i != 154) {
                i2 = i - 1;
            }
            viewGroup2.addView(m129489T(viewGroup2, i2), bnl0.f77544e, bnl0.f77545f);
            viewGroup2.addView(viewInflate, bnl0.f77544e, bnl0.f77545f);
            return viewGroup2;
        }
        if (i != 142 && i != 144 && i != 143 && i != 147 && i != 149 && i != 148 && i != 203 && i != 202 && i != 227 && i != 226 && i != 222) {
            if (i == 189) {
                ViewGroup viewGroup3 = (LinearLayout) this.f102746s.act().inflater().inflate(qec0.f156886K4, viewGroup, false);
                viewGroup3.setClipChildren(false);
                View viewInflate2 = this.f102746s.act().inflater().inflate(qec0.f157094p1, viewGroup, false);
                viewGroup3.addView(m129489T(viewGroup3, 116), bnl0.f77544e, bnl0.f77545f);
                viewGroup3.addView(viewInflate2, bnl0.f77544e, bnl0.f77545f);
                return viewGroup3;
            }
            if (i == 265) {
                ViewGroup viewGroup4 = (LinearLayout) this.f102746s.act().inflater().inflate(qec0.f156886K4, viewGroup, false);
                viewGroup4.setClipChildren(false);
                View viewInflate3 = this.f102746s.act().inflater().inflate(qec0.f156931R0, viewGroup, false);
                viewGroup4.addView(m129489T(viewGroup4, 116), bnl0.f77544e, bnl0.f77545f);
                viewGroup4.addView(viewInflate3, bnl0.f77544e, bnl0.f77545f);
                return viewGroup4;
            }
            if (i != 68) {
                return m129489T(viewGroup, i);
            }
            VText vText = new VText(this.f102746s.act());
            vText.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77544e, qa00.m175859d(50.0f)));
            vText.setGravity(17);
            return vText;
        }
        ViewGroup viewGroup5 = (LinearLayout) this.f102746s.act().inflater().inflate(qec0.f156886K4, viewGroup, false);
        if (i == 143 || i == 148) {
            viewM129489T = m129489T(viewGroup5, 67);
        } else if (i == 144 || i == 149) {
            viewM129489T = m129489T(viewGroup5, 140);
        } else if (i == 202 || i == 203) {
            viewM129489T = m129489T(viewGroup5, 69);
        } else {
            viewM129489T = (i == 226 || i == 227) ? m129489T(viewGroup5, 90) : m129489T(viewGroup5, 0);
        }
        viewGroup5.addView(viewM129489T, bnl0.f77544e, bnl0.f77545f);
        VText vText2 = new VText(viewGroup.getContext());
        if (i == 142 || i == 143 || i == 144 || i == 202 || i == 226 || i == 222) {
            vText2.setText(m129478H(this.f102746s.act().string(R$string.f21752k3)));
        } else {
            vText2.setText(m129478H(this.f102746s.act().string(R$string.f21761l3)));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        vText2.setTextColor(this.f102746s.act().color(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102790H));
        vText2.setTextSize(13.0f);
        int i3 = qa00.f156338y;
        layoutParams.setMargins(i3, 0, i3, qa00.m175859d(16.0f));
        vText2.setGravity(17);
        int i4 = qa00.f156321h;
        int i5 = qa00.f156320g;
        vText2.setPadding(i4, i5, i4, i5);
        viewGroup5.addView(vText2, layoutParams);
        return viewGroup5;
    }

    /* JADX INFO: renamed from: P */
    public final int m129485P(List<ChallengeMsg> list) {
        return TextUtils.equals(list.get(0).type, MessageType.middle_text) ? 240 : -1;
    }

    /* JADX INFO: renamed from: Q */
    public int m129486Q(Message message, int i) throws IOException {
        int i2;
        Boolean bool;
        if (this.f102746s.m110994j3() == null) {
            return 140;
        }
        int iM129487R = m129487R(message, i);
        if ((NullChecker.m82486a(this.f102746s.mo111064x6()) && this.f102746s.mo111064x6().unilateralBlock() && message.f56859id.startsWith("fake_id_")) || (((i2 = message.localFailType) == 5 || i2 == 7 || i2 == 6 || i2 == 8) && message.f56859id.startsWith("fake_id_"))) {
            return iM129487R + 2000;
        }
        if (!TEnum.equals(message.channel, "group") && CoreModule.m30933P().m143412i().mo180446c() && CoreModule.m30933P().m143412i().mo180447c0(message.cid, message.f56859id)) {
            return iM129487R + 1000;
        }
        if (message.localSafetyReminder || message.localSensitiveWordReminder) {
            return iM129487R + 5000;
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && (CoreModule.m30933P().m143412i().mo180459e1(message.cid, message.f56859id) || CoreModule.m30933P().m143412i().mo180531r3(message.cid, message.f56859id) || CoreModule.m30933P().m143412i().mo180498l4(message.cid, message.f56859id))) {
            return iM129487R + PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
        }
        if (m129490V(message) && ((bool = message.recalled) == null || !bool.booleanValue())) {
            return iM129487R + 9000;
        }
        if (CoreModule.m30933P().m143406b().mo36110Yg() && CoreModule.m30933P().m143406b().mo36100Jp(message.cid, message.f56859id)) {
            return iM129487R + TXRecordCommon.AUDIO_SAMPLERATE_8000;
        }
        if (CoreModule.m30933P().m143406b().mo36110Yg() && CoreModule.m30933P().m143406b().mo36117gh(message.cid, message.f56859id)) {
            return iM129487R + 1000;
        }
        if (m129492X(message)) {
            return iM129487R + 10000;
        }
        return m129491W(message) ? iM129487R + 11000 : iM129487R;
    }

    /* JADX WARN: Code duplicated, block: B:676:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:688:0x0a4a A[PHI: r4
      0x0a4a: PHI (r4v47 int) = (r4v46 int), (r4v46 int), (r4v46 int), (r4v51 int), (r4v51 int), (r4v51 int) binds: [B:735:0x0afc, B:729:0x0ae7, B:723:0x0ad4, B:699:0x0a72, B:693:0x0a5d, B:687:0x0a48] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: R */
    public final int m129487R(Message message, int i) throws IOException {
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
        int i7 = message.owner.equals(CoreModule.m30929H().userId()) ? 116 : 0;
        if ((CoreModule.m30933P().m143412i().mo180570z(message.owner) || o3z.m165898g().m165909o(this.f102746s.m110994j3())) && i7 == 0 && !TEnum.equals(message.messageType, MessageType.exchange_picture)) {
            return (NullChecker.m82486a(message.media) && message.media.size() > 0 && ((message.media.get(0) instanceof Video) || (message.media.get(0) instanceof Picture))) ? i7 + 49 : i7 + 48;
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
            ChatGiftInfoExtra chatGiftInfoExtraMo180349K2 = CoreModule.m30933P().m143412i().mo180349K2(message);
            boolean z = NullChecker.m82486a(chatGiftInfoExtraMo180349K2) && chatGiftInfoExtraMo180349K2.needOpen;
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
            if (uqb0.f180396b0.f170326c.mo68454lp()) {
                return message.isMe() ? 224 : 89;
            }
            if (TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType(), "tantan_verify_toast")) {
            Message messageMo129506m = i > 0 ? mo129506m(i - 1) : null;
            Message messageMo129506m2 = i < mo129499d() - 1 ? mo129506m(i + 1) : null;
            if ((!NullChecker.m82486a(messageMo129506m) || messageMo129506m.createdTime != message.createdTime) && (!NullChecker.m82486a(messageMo129506m2) || messageMo129506m2.createdTime != message.createdTime)) {
                return CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384;
            }
            Message messageMo225055clone = message.mo225055clone();
            messageMo225055clone.createdTime += 1.0d;
            messageMo225055clone.localCreatedTime++;
            CoreModule.f18264c.f20384f0.m33897ah(messageMo225055clone, false);
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
                return TextUtils.equals(CoreModule.m30933P().m143405a().mo34541lq(), "normal_message") ? 0 : 96;
            }
            try {
                stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if (NullChecker.m82486a(stateData) && TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
                return 260;
            }
            if (m129479I(message)) {
                return IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE;
            }
            return 97;
        }
        if (TEnum.equals(message.messageType, MessageType.system_reminder)) {
            boolean z2 = this.f102746s.m110929W2().compareTo(message.f56859id) >= 0;
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
            if (NullChecker.m82486a(message.extData) && TextUtils.equals(message.extData.extra, "user")) {
                return 246;
            }
            if (NullChecker.m82486a(message.extData) && TextUtils.equals(message.extData.extra, "system")) {
                return 247;
            }
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        if (TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type)) {
            return 262;
        }
        if (!this.f102746s.mo110970e4() && ((CoreModule.m30933P().m143412i().mo180537t() || CoreModule.m30933P().m143412i().mo180296B()) && i >= this.f102746s.f82491r.f184001a.size() && NullChecker.m82486a(this.f102746s.mo111064x6()))) {
            if (!TextUtils.isEmpty(this.f102746s.mo111064x6().sendLetter) && !TextUtils.isEmpty(this.f102746s.f82488p)) {
                long j = this.f102746s.mo111064x6().sendLetterTimestamp;
                clz<?, ?> clzVar = this.f102746s;
                if (j > clzVar.f82490q) {
                    return i == clzVar.f82491r.f184001a.size() ? 27 : 153;
                }
                return i == clzVar.f82491r.f184001a.size() ? 153 : 27;
            }
            if (!TextUtils.isEmpty(this.f102746s.mo111064x6().sendLetter)) {
                return 27;
            }
            if (!TextUtils.isEmpty(this.f102746s.f82488p)) {
                return 153;
            }
        }
        if (message.chatTyping) {
            return 30;
        }
        if (NullChecker.m82486a(message.reminder) && NullChecker.m82486a(message.moment)) {
            return CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;
        }
        Boolean bool15 = message.recalled;
        if (bool15 != null && bool15.booleanValue()) {
            i3 = 140;
        } else {
            if (TextUtils.equals(message.owner, User.ID_TEAM_ACCOUNT) && TEnum.equals(message.messageType, "text") && !TextUtils.isEmpty(message.answerOfMessage)) {
                return 55;
            }
            if (NullChecker.m82486a(message.moment)) {
                size = 21;
            } else if (NullChecker.m82486a(message.likeOfMoment)) {
                size = 23;
            } else if (NullChecker.m82486a(message.location)) {
                size = 20;
            } else if (NullChecker.m82486a(message.sticker)) {
                size = 12;
            } else if (NullChecker.m82486a(message.question)) {
                Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(message.question);
                List<Answer> list = questionM151465o3 == null ? null : questionM151465o3.answers;
                if (questionM151465o3 == null) {
                    CrashHelper.m82479c(new IllegalStateException("MessagesAdapter unable to query question id : " + (NullChecker.m82486a(message.question) ? message.question : "") + " message id : " + message.f56859id));
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
            if (zdq.m219364R(message) && message.isOtherUser()) {
                return 53;
            }
            if (TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance) && message.isOtherUser()) {
                return 53;
            }
            if (udq.m195535q(message)) {
                if (!message.isOtherUser()) {
                    return CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                }
                if (this.f102738k.contains(message.f56859id) || !message.msgData.contains(SchemeKey.enterVoiceRoomPackageGiftRecall)) {
                    return 64;
                }
                this.f102738k.add(message.f56859id);
                i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new pf60("audio_card_type", "message_audio_assistant"), new pf60("liveId", ""), new pf60("anchorId", ""), new pf60("topic_id", ""), new pf60("audio_room_type", ""));
                return 64;
            }
            if (udq.m195534p(message) && message.isOtherUser()) {
                if (this.f102742o.contains(message.f56859id) || !udq.m195534p(message)) {
                    return 88;
                }
                this.f102742o.add(message.f56859id);
                i4g0.m138526x("e_personalized_recommendation_helper", OMSDialogPositon.p_messages_view);
                return 88;
            }
            if (TEnum.equals(message.messageType, "literature")) {
                return message.isMe() ? 201 : 71;
            }
            if (TEnum.equals(message.messageType, MessageType.feedback) || message.value.contains(MessageType.feedback)) {
                if (NullChecker.m82486a(message.msgData)) {
                    try {
                        messageFeedbackStatus = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
                    } catch (IOException unused2) {
                        messageFeedbackStatus = null;
                    }
                } else {
                    messageFeedbackStatus = null;
                }
                if (NullChecker.m82486a(messageFeedbackStatus)) {
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
                if (h39.m133422K()) {
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
        if (TEnum.equals(message.messageType, MessageType.profile_like) && NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
            i3 = 140;
        }
        if (TEnum.equals(message.messageType(), "moment_comment") && ((bool5 = message.recalled) == null || !bool5.booleanValue())) {
            i3 = message.isMe() ? CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 : 67;
        }
        if (i7 == 0 && NullChecker.m82486a(this.f102746s.m110932W5()) && NullChecker.m82486a(this.f102746s.mo111064x6()) && Math.abs(this.f102746s.m110994j3().localBotheringTime) == message.createdTime && TEnum.equals(this.f102746s.m110932W5().gender, "female") && TEnum.equals(this.f102746s.mo111064x6().gender, "male")) {
            i4 = i3 + 1;
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f102746s.m110994j3().localBotherWxTime) == message.createdTime) {
            if (NullChecker.m82486a(message.moment)) {
                i4 = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                i5 = 144;
                if (!TEnum.equals(message.messageType, MessageType.state_like) && !TEnum.equals(message.messageType, MessageType.state_comment)) {
                    boolean zEquals = TEnum.equals(message.messageType, MessageType.profile_like);
                    Boolean bool16 = message.recalled;
                    if (zEquals) {
                        if (NullChecker.m82486a(bool16) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 226;
                        }
                    } else if (NullChecker.m82486a(bool16) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA;
                    }
                } else if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
                    i4 = i5;
                } else {
                    i4 = 202;
                }
            }
        } else if (!User.isTeamAccount(message.owner) && i7 == 0 && Math.abs(this.f102746s.m110994j3().localBotherCodeTime) == message.createdTime) {
            if (NullChecker.m82486a(message.moment)) {
                i4 = 148;
            } else if (TEnum.equals(message.messageType, "letter")) {
                i4 = 27;
            } else {
                i5 = 149;
                if (!TEnum.equals(message.messageType, MessageType.state_like) && !TEnum.equals(message.messageType, MessageType.state_comment)) {
                    boolean zEquals2 = TEnum.equals(message.messageType, MessageType.profile_like);
                    Boolean bool17 = message.recalled;
                    if (zEquals2) {
                        if (NullChecker.m82486a(bool17) && message.recalled.booleanValue()) {
                            i4 = i5;
                        } else {
                            i4 = 227;
                        }
                    } else if (NullChecker.m82486a(bool17) && message.recalled.booleanValue()) {
                        i4 = i5;
                    } else {
                        i4 = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA;
                    }
                } else if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
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
            if (NullChecker.m82486a(message.additionalData)) {
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
            if (NullChecker.m82486a(this.f102746s.mo111064x6()) && !this.f102746s.mo111064x6().unilateralBlock() && ((i6 = message.localFailType) == 3 || i6 == 4)) {
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
            return TextUtils.equals(message.owner, CoreModule.m30929H().userId()) ? 206 : 84;
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
            return m129483M(message, i4);
        }
        if (TEnum.equals(message.messageType(), MessageType.picture_text_deeplink)) {
            return m129488S(message, i4);
        }
        if (TEnum.equals(message.messageType, MessageType.local_add_tags_guide)) {
            if (jyb.m147479J(CoreModule.m30933P().m143412i().mo180369N4())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 235;
        }
        if (TEnum.equals(message.messageType, MessageType.local_add_artwork_guide)) {
            if (jyb.m147479J(CoreModule.f18264c.f20424s1.f20829X) || CoreModule.f18264c.f20424s1.f20829X.size() < 3) {
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
            if (TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
                return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
            }
            return 53;
        }
        if (TEnum.equals(message.messageType, MessageType.exchange_picture)) {
            if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
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
        if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
            return 140;
        }
        if (message.isMe()) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: S */
    public final int m129488S(Message message, int i) {
        if (TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
            return CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
        }
        return 53;
    }

    /* JADX INFO: renamed from: T */
    public View m129489T(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (i == 140) {
            return this.f102746s.act().inflater().inflate(qec0.f156824B5, viewGroup, false);
        }
        if (i == 158) {
            return this.f102746s.act().inflater().inflate(qec0.f157014d5, viewGroup, false);
        }
        if (i == 145) {
            return this.f102746s.act().inflater().inflate(qec0.f156852F5, viewGroup, false);
        }
        if (i == 171 || i == 176 || i == 193 || i == 197) {
            if (i == 171 && !this.f102743p) {
                i4g0.m138526x("e_toast_chat_page_verification_guide", OMSDialogPositon.p_chat_view);
                this.f102743p = true;
            }
            return this.f102746s.act().inflater().inflate(qec0.f156871I3, viewGroup, false);
        }
        if (i == 192) {
            return this.f102746s.act().inflater().inflate(qec0.f156899M3, viewGroup, false);
        }
        if (i == 184) {
            return this.f102746s.act().inflater().inflate(qec0.f156850F3, viewGroup, false);
        }
        if (i == 175) {
            return this.f102746s.act().inflater().inflate(qec0.f156856G2, viewGroup, false);
        }
        if (i == 188) {
            return this.f102746s.act().inflater().inflate(qec0.f156995b0, viewGroup, false);
        }
        if (i == 182 || i == 251) {
            return this.f102746s.act().inflater().inflate(qec0.f157127u, viewGroup, false);
        }
        if (i == 63) {
            return this.f102746s.act().inflater().inflate(qec0.f157067l2, viewGroup, false);
        }
        if (i == 205) {
            return this.f102746s.act().inflater().inflate(qec0.f157117s3, viewGroup, false);
        }
        if (i == 228) {
            return this.f102746s.act().inflater().inflate(qec0.f157124t3, viewGroup, false);
        }
        if (i == 194) {
            return this.f102746s.act().inflater().inflate(qec0.f156933R2, viewGroup, false);
        }
        if (i == 195) {
            return this.f102746s.act().inflater().inflate(qec0.f156940S2, viewGroup, false);
        }
        if (i == 198) {
            return this.f102746s.act().inflater().inflate(qec0.f156911O1, viewGroup, false);
        }
        if (i == 219) {
            return this.f102746s.act().inflater().inflate(qec0.f156925Q1, viewGroup, false);
        }
        if (i == 249 || i == 252) {
            return this.f102746s.act().inflater().inflate(qec0.f157078n, viewGroup, false);
        }
        if (i == 250) {
            return this.f102746s.act().inflater().inflate(qec0.f156874J, viewGroup, false);
        }
        if (i == 207 || i == 208) {
            return this.f102746s.act().inflater().inflate(qec0.f156841E1, viewGroup, false);
        }
        if (i == 209) {
            return this.f102746s.act().inflater().inflate(qec0.f156848F1, viewGroup, false);
        }
        if (i == 218) {
            return this.f102746s.act().inflater().inflate(qec0.f156926Q2, viewGroup, false);
        }
        if (i == 217) {
            return this.f102746s.act().inflater().inflate(qec0.f156883K1, viewGroup, false);
        }
        if (i == 215) {
            return this.f102746s.act().inflater().inflate(qec0.f157150x1, viewGroup, false);
        }
        if (i == 241) {
            return this.f102746s.act().inflater().inflate(qec0.f157101q1, viewGroup, false);
        }
        if (i == 220) {
            return this.f102746s.act().inflater().inflate(qec0.f157066l1, viewGroup, false);
        }
        if (i == 223) {
            return this.f102746s.act().inflater().inflate(qec0.f156864H3, viewGroup, false);
        }
        if (i == 239) {
            return this.f102746s.act().inflater().inflate(qec0.f156990a2, viewGroup, false);
        }
        if (i == 253) {
            return this.f102746s.act().inflater().inflate(qec0.f156912O2, viewGroup, false);
        }
        if (i == 256) {
            return this.f102746s.act().inflater().inflate(qec0.f157152x3, viewGroup, false);
        }
        if (i == 258) {
            return this.f102746s.act().inflater().inflate(qec0.f157047i3, viewGroup, false);
        }
        if (i == 257) {
            return this.f102746s.act().inflater().inflate(qec0.f157151x2, viewGroup, false);
        }
        if (i == 267) {
            return this.f102746s.act().inflater().inflate(qec0.f157088o2, viewGroup, false);
        }
        if (i == 266) {
            return this.f102746s.act().inflater().inflate(qec0.f156877J2, viewGroup, false);
        }
        if (i == 268) {
            return this.f102746s.act().inflater().inflate(qec0.f157033g3, viewGroup, false);
        }
        if (i == 109) {
            return this.f102746s.act().inflater().inflate(qec0.f156919P2, viewGroup, false);
        }
        if (i == 234) {
            return this.f102746s.act().inflater().inflate(qec0.f157054j3, viewGroup, false);
        }
        if (i == 231) {
            return this.f102746s.act().inflater().inflate(qec0.f156844E4, viewGroup, false);
        }
        if (i == 235) {
            return this.f102746s.act().inflater().inflate(qec0.f156898M2, viewGroup, false);
        }
        if (i == 236) {
            return this.f102746s.act().inflater().inflate(qec0.f156891L2, viewGroup, false);
        }
        if (i == 237 || i == 238) {
            return this.f102746s.act().inflater().inflate(qec0.f156857G3, viewGroup, false);
        }
        if (i == 240) {
            return this.f102746s.act().inflater().inflate(qec0.f157004c2, viewGroup, false);
        }
        if (i == 242) {
            return this.f102746s.act().inflater().inflate(qec0.f156983Z1, viewGroup, false);
        }
        if (i == 243) {
            return this.f102746s.act().inflater().inflate(qec0.f156830C4, viewGroup, false);
        }
        if (i == 244) {
            return this.f102746s.act().inflater().inflate(qec0.f156939S1, viewGroup, false);
        }
        if (i == 248) {
            return this.f102746s.act().inflater().inflate(qec0.f157073m1, viewGroup, false);
        }
        if (i == 247) {
            return this.f102746s.act().inflater().inflate(qec0.f157080n1, viewGroup, false);
        }
        if (i == 251) {
            return this.f102746s.act().inflater().inflate(qec0.f157127u, viewGroup, false);
        }
        if (i == 104) {
            return this.f102746s.act().inflater().inflate(qec0.f156955U3, viewGroup, false);
        }
        if (i == 106) {
            return this.f102746s.act().inflater().inflate(qec0.f156961V3, viewGroup, false);
        }
        if (i == 97) {
            return new View(this.f102746s.act());
        }
        if (i == 261) {
            return this.f102746s.act().inflater().inflate(qec0.f156863H2, viewGroup, false);
        }
        if (i == 262) {
            return this.f102746s.act().inflater().inflate(qec0.f157120t, viewGroup, false);
        }
        if (i == 279) {
            return this.f102746s.act().inflater().inflate(qec0.f156869I1, viewGroup, false);
        }
        if (i == 264) {
            return this.f102746s.act().inflater().inflate(qec0.f157092p, viewGroup, false);
        }
        if (i == 274) {
            return this.f102746s.act().inflater().inflate(qec0.f157099q, viewGroup, false);
        }
        if (i == 276) {
            return this.f102746s.act().inflater().inflate(qec0.f157018e2, viewGroup, false);
        }
        if (i == 275) {
            return this.f102746s.act().inflater().inflate(qec0.f157010d1, viewGroup, false);
        }
        if (i == 278) {
            return this.f102746s.act().inflater().inflate(qec0.f156905N2, viewGroup, false);
        }
        if (i == 269) {
            return this.f102746s.act().inflater().inflate(qec0.f156946T1, viewGroup, false);
        }
        if (i == 270) {
            return this.f102746s.act().inflater().inflate(qec0.f156959V1, viewGroup, false);
        }
        if (i == 272) {
            return this.f102746s.act().inflater().inflate(qec0.f156998b3, viewGroup, false);
        }
        boolean z = i >= 116;
        ItemMessageBase itemMessageBase = (ItemMessageBase) this.f102746s.act().inflater().inflate(z ? qec0.f157049i5 : qec0.f157042h5, viewGroup, false);
        int i3 = qec0.f156894L5;
        if (i == 23) {
            i3 = qec0.f157105q5;
        } else if (i == 139) {
            i3 = qec0.f157112r5;
        } else if (i == 21) {
            i3 = qec0.f157000b5;
        } else if (i == 137) {
            i3 = qec0.f157007c5;
        } else if (i == 35) {
            i3 = qec0.f157133u5;
        } else if (i == 161) {
            i3 = qec0.f157140v5;
        } else if (i == 0 || i == 56) {
            i3 = qec0.f156873I5;
        } else if (i == 48) {
            i3 = qec0.f156858G4;
        } else if (i == 41) {
            i3 = qec0.f156887K5;
        } else if (i == 116) {
            i3 = qec0.f156880J5;
        } else if (i == 49) {
            i3 = qec0.f156851F4;
        } else if (i >= 2 && i <= 10) {
            i3 = qec0.f157028f5;
            i2 = i - 2;
        } else if (i >= 118 && i <= 126) {
            i3 = qec0.f157035g5;
            i2 = i - 118;
        } else if (i == 11) {
            i3 = qec0.f156956U4;
        } else if (i == 127) {
            i3 = qec0.f156962V4;
        } else if (i == 12 || i == 128) {
            i3 = qec0.f156859G5;
        } else if (i >= 13 && i <= 19) {
            i3 = qec0.f157168z5;
            i2 = i - 13;
        } else if (i >= 129 && i <= 135) {
            i3 = qec0.f156817A5;
            i2 = i - 129;
        } else if (i == 20) {
            i3 = qec0.f157119s5;
        } else if (i == 136) {
            i3 = qec0.f157126t5;
        } else if (i == 27) {
            i3 = qec0.f156936R5;
        } else if (i == 153) {
            i3 = qec0.f156943S5;
        } else if (i == 30) {
            i3 = qec0.f157028f5;
            i2 = 1;
        } else if (i == 34) {
            i3 = qec0.f156838D5;
        } else if (i == 160) {
            i3 = qec0.f156845E5;
        } else if (i == 40) {
            i3 = qec0.f156986Z4;
        } else if (i == 165) {
            i3 = qec0.f156993a5;
        } else if (i == 42) {
            i3 = qec0.f156906N3;
        } else if (i == 167) {
            i3 = qec0.f156913O3;
        } else if (i == 50) {
            i3 = qec0.f157008d;
        } else if (i == 51) {
            i3 = qec0.f156865H4;
        } else if (i == 53) {
            i3 = qec0.f156901M5;
        } else if (i == 173) {
            i3 = qec0.f156908N5;
        } else if (i == 55) {
            i3 = qec0.f156866H5;
        } else if (i == 59) {
            i3 = qec0.f156893L4;
        } else if (i == 178) {
            i3 = qec0.f156900M4;
        } else if (i == 60) {
            i3 = qec0.f156821B2;
        } else if (i == 181) {
            i3 = qec0.f156828C2;
        } else if (i == 183 || i == 61) {
            i3 = qec0.f156843E3;
        } else if (i == 62) {
            i3 = qec0.f157157y1;
        } else if (i == 185) {
            i3 = qec0.f157164z1;
        } else if (i == 186) {
            i3 = qec0.f157137v2;
        } else if (i == 64 || i == 88) {
            i3 = qec0.f157130u2;
        } else if (i == 100 || i == 245) {
            i3 = qec0.f156842E2;
        } else if (i == 65) {
            i3 = qec0.f156815A3;
        } else if (i == 187) {
            i3 = qec0.f156822B3;
        } else if (i == 66) {
            i3 = qec0.f156813A1;
        } else if (i == 191) {
            i3 = qec0.f156820B1;
        } else if (i == 67) {
            i3 = qec0.f157096p3;
        } else if (i == 196) {
            i3 = qec0.f157103q3;
        } else if (i == 69) {
            i3 = qec0.f156966W2;
        } else if (i == 200) {
            i3 = qec0.f156972X2;
        } else if (i == 71) {
            i3 = qec0.f156829C3;
        } else if (i == 201) {
            i3 = qec0.f156836D3;
        } else if (i == 72) {
            i3 = qec0.f156978Y2;
        } else if (i >= 73 && i <= 83) {
            i3 = qec0.f156991a3;
            i2 = i - 73;
        } else if (i == 206 || i == 84) {
            i3 = qec0.f157072m0;
        } else if (i == 85 || i == 210) {
            i3 = qec0.f156892L3;
        } else if (i == 86 || i == 216) {
            i3 = qec0.f156849F2;
        } else if (i == 87 || i == 204) {
            i3 = qec0.f156918P1;
        } else if (i == 89 || i == 224) {
            i3 = qec0.f156953U1;
        } else if (i == 90) {
            i3 = qec0.f157159y3;
        } else if (i == 225) {
            i3 = qec0.f157166z3;
        } else if (i == 92 || i == 229) {
            i3 = qec0.f156927Q3;
        } else if (i == 94 || i == 232) {
            i3 = qec0.f156837D4;
        } else if (i == 95) {
            i3 = qec0.f156954U2;
        } else if (i == 233) {
            i3 = qec0.f156960V2;
        } else if (i == 96 || i == 260) {
            i3 = qec0.f156932R1;
        } else if (i == 98) {
            i3 = qec0.f157046i2;
        } else if (i == 99) {
            i3 = qec0.f157144w2;
        } else if (i == 101) {
            i3 = qec0.f156887K5;
        } else if (i != 246) {
            if (i == 102) {
                i3 = qec0.f156941S3;
            } else if (i == 103) {
                i3 = qec0.f156897M1;
            } else if (i == 254) {
                i3 = qec0.f156904N1;
            } else if (i == 105) {
                i3 = qec0.f156890L1;
            } else if (i == 107 || i == 255) {
                i3 = qec0.f156977Y1;
            } else if (i == 259 || i == 108) {
                i3 = qec0.f157011d2;
            } else if (i == 57) {
                i3 = qec0.f157034g4;
            } else if (i == 110 || i == 263) {
                i3 = qec0.f156876J1;
            } else if (i == 111 || i == 271) {
                i3 = qec0.f156997b2;
            } else if (i == 112 || i == 273) {
                i3 = qec0.f156914O4;
            } else if (i == 113) {
                i3 = qec0.f157116s2;
            } else if (i == 114) {
                i3 = qec0.f156878J3;
            } else if (i == 277) {
                i3 = qec0.f156885K3;
            } else if (i == 115) {
                i3 = qec0.f156976Y0;
            } else if (i == 281) {
                i3 = qec0.f156982Z0;
            }
        }
        itemMessageBase.mo49529U(i3, this.f130526a, i2, z);
        return itemMessageBase;
    }

    /* JADX INFO: renamed from: V */
    public boolean m129490V(Message message) {
        if (message.f56859id.startsWith("fake_id_") || TextUtils.isEmpty(message.incTempInfo)) {
            return false;
        }
        return CoreModule.m30933P().m143412i().mo180524q1() || message.isOtherUser();
    }

    /* JADX INFO: renamed from: W */
    public boolean m129491W(Message message) {
        return TextUtils.equals(m129481K(message), "toShare") || TextUtils.equals(m129481K(message), "shared");
    }

    /* JADX INFO: renamed from: X */
    public boolean m129492X(Message message) {
        MessageTipsContent messageTipsContentM129476N = m129476N(message);
        if (NullChecker.m82486a(messageTipsContentM129476N)) {
            return !(TextUtils.isEmpty(messageTipsContentM129476N.value) && TextUtils.isEmpty(messageTipsContentM129476N.androidValue)) && m129497b0(message);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m129493Y(Message message) {
        Boolean bool;
        return Boolean.valueOf(message.owner.equals(this.f102746s.m110932W5().f56859id) && ((bool = message.recalled) == null || !bool.booleanValue()) && TEnum.equals(message.status(), "normal"));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Boolean m129494Z(Message message) {
        return Boolean.valueOf(message.owner.equals(this.f102746s.mo111034r3()));
    }

    /* JADX WARN: Code duplicated, block: B:297:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:301:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:307:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:308:0x07de A[Catch: Exception -> 0x08e8, TryCatch #0 {Exception -> 0x08e8, blocks: (B:305:0x07d7, B:309:0x07e4, B:313:0x07f3, B:312:0x07ed, B:308:0x07de), top: B:402:0x07d7 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:312:0x07ed A[Catch: Exception -> 0x08e8, TryCatch #0 {Exception -> 0x08e8, blocks: (B:305:0x07d7, B:309:0x07e4, B:313:0x07f3, B:312:0x07ed, B:308:0x07de), top: B:402:0x07d7 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:320:0x0812  */
    /* JADX WARN: Code duplicated, block: B:322:0x081e  */
    /* JADX WARN: Code duplicated, block: B:324:0x0836  */
    /* JADX WARN: Code duplicated, block: B:329:0x0854  */
    /* JADX WARN: Code duplicated, block: B:331:0x0865  */
    /* JADX WARN: Code duplicated, block: B:332:0x0867  */
    /* JADX WARN: Code duplicated, block: B:335:0x0883  */
    /* JADX WARN: Code duplicated, block: B:336:0x0885  */
    /* JADX WARN: Code duplicated, block: B:337:0x0887  */
    /* JADX WARN: Code duplicated, block: B:339:0x088b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x0893  */
    /* JADX WARN: Code duplicated, block: B:350:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:351:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:354:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:357:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:406:0x083e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:? A[RETURN, SYNTHETIC] */
    @Override // p153l.l900
    /* JADX INFO: renamed from: a */
    public void mo129495a(View view, Message message, int i, int i2) throws Exception {
        final g900 g900Var;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2;
        View childAt;
        Message messageMo129506m;
        Message messageMo129506m2;
        boolean z;
        boolean z2;
        boolean z3;
        List<Message> list;
        clz<?, ?> clzVar;
        View childAt2 = view;
        int i7 = i;
        if (this.f102746s.m110994j3() == null) {
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
        if (!TEnum.equals(message.channel, "group") && ((CoreModule.m30933P().m143412i().mo180446c() || CoreModule.m30933P().m143406b().mo36110Yg()) && i7 / 1000 == 1)) {
            i7 -= 1000;
        }
        int i8 = i7;
        if (childAt2 instanceof ItemChatUnlockLayout) {
            ((ItemChatUnlockLayout) childAt2).m49273c(this.f102746s.mo111064x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockLayout) {
            ((ItemLoveBuzzUnlockLayout) childAt2).m49477b(this.f102746s.mo111064x6(), message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if ((childAt2 instanceof ChatTipsItem) && i8 != 249 && i8 != 252) {
            ((ChatTipsItem) childAt2).m49062d(i8, message, this.f102745r);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof CoreChatAiSendMomentItem) {
            ((CoreChatAiSendMomentItem) childAt2).m49073i(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemLoveBuzzUnlockSuccess) {
            ((ItemLoveBuzzUnlockSuccess) childAt2).m49484g(this.f102746s.m111048t7(), this.f102746s.mo111064x6(), this.f102746s.m110932W5(), this.f102746s.f82482k);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof ItemChatSafetyReminder) {
            ((ItemChatSafetyReminder) childAt2).m49270f(message);
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof UnMatchItem) {
            ((UnMatchItem) childAt2).m50191b(this.f102746s.mo111064x6(), message, this.f102746s.m110994j3());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof NewOnlineMatchSuccessItem) {
            ((NewOnlineMatchSuccessItem) childAt2).m50174g(this.f102746s.m111048t7(), this.f102746s.mo111064x6(), this.f102746s.m110932W5());
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        if (childAt2 instanceof HistoryContentItem) {
            childAt2 = ((ViewGroup) childAt2).getChildAt(0);
        }
        View view3 = childAt2;
        if (view3 instanceof ItemFriendActiveRemindFemale) {
            ((ItemFriendActiveRemindFemale) view3).m49357b(message, this.f102746s.mo111064x6());
            return;
        }
        if (view3 instanceof ItemCommonTipBox) {
            ((ItemCommonTipBox) view3).m49289T(this.f102746s.act(), this, message);
            return;
        }
        if (view3 instanceof ItemDiceTip) {
            ((ItemDiceTip) view3).m49310b(message, this.f102746s.mo111064x6());
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
                g900Var = this;
                ViewGroup viewGroup = (ViewGroup) view3;
                View childAt3 = viewGroup.getChildAt(0);
                String str = (i8 == 154 || i8 == 28) ? "wx" : (i8 == 29 || i8 == 155) ? "code" : "normal";
                View childAt4 = viewGroup.getChildAt(1);
                try {
                    if (!(childAt4 instanceof ItemPromptIntl)) {
                        if (childAt4 instanceof ItemPrompt) {
                            i3 = 29;
                            i4 = 28;
                            ((ItemPrompt) childAt4).m49785m(message, g900Var.f102746s.m110994j3(), str, g900Var.f102746s.mo111034r3(), g900Var.f102746s.m110989i3());
                        }
                        if (i8 != i3 || i8 == i4) {
                            i5 = 0;
                        } else {
                            i5 = i8 - 1;
                        }
                        i6 = i5;
                        view2 = childAt3;
                        if (i6 == 41 && !g900Var.f102736i.contains(message.value)) {
                            g900Var.f102736i.add(message.value);
                            i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                        }
                        g900Var.m129505h0(message, i6);
                        g900Var.m129502e0(message);
                        g900Var.m129503f0(message, i6);
                        g900Var.m129504g0(message);
                        ItemBase itemBase = (ItemBase) view2;
                        if (i2 == 0) {
                            messageMo129506m = null;
                        } else {
                            messageMo129506m = g900Var.mo129506m(i2 - 1);
                        }
                        if (i2 == g900Var.mo129499d() - 1) {
                            messageMo129506m2 = null;
                        } else {
                            messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                        }
                        itemBase.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                        if (!g900Var.f102746s.mo110970e4() && (view2 instanceof ItemMessageRight)) {
                            if (CoreModule.m30933P().m143412i().mo180535s4()) {
                                clzVar = g900Var.f102746s;
                                if (!clzVar.m111000k4(clzVar.m110989i3())) {
                                    g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                    if (g900Var.f102746s.mo110970e4()) {
                                        z = false;
                                        z2 = false;
                                    } else {
                                        if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                            @Override // p153l.qcj
                                            public final Object call(Object obj) {
                                                return this.f203299a.m129493Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = g900Var.f102746s.f82491r.f184001a;
                                        if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                            @Override // p153l.qcj
                                            public final Object call(Object obj) {
                                                return this.f68978a.m129494Z((Message) obj);
                                            }
                                        })) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                    }
                                    if (IntlCountryCodeController.m29114k()) {
                                        boolean z4 = z3;
                                        g900 g900Var2 = g900Var;
                                        ((ItemMessageRight) view2).m49664n1(message, z4, g900Var2.f102733f, g900Var2.f102732e);
                                    } else {
                                        ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                    }
                                } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h()) || TEnum.equals(message.messageType, MessageType.love_letter)) {
                                    try {
                                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                        break;
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (g900Var.f102746s.mo110970e4()) {
                                        if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                            @Override // p153l.qcj
                                            public final Object call(Object obj) {
                                                return this.f203299a.m129493Y((Message) obj);
                                            }
                                        })) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        list = g900Var.f102746s.f82491r.f184001a;
                                        if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                            @Override // p153l.qcj
                                            public final Object call(Object obj) {
                                                return this.f68978a.m129494Z((Message) obj);
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
                                    z3 = (!z2 && z && g900Var.m129480J(i6)) || (TEnum.equals(message.messageType, MessageType.love_letter) && message.isMe());
                                    if (IntlCountryCodeController.m29114k()) {
                                        ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                    } else {
                                        boolean z5 = z3;
                                        g900 g900Var3 = g900Var;
                                        ((ItemMessageRight) view2).m49664n1(message, z5, g900Var3.f102733f, g900Var3.f102732e);
                                    }
                                }
                            } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                                g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                if (g900Var.f102746s.mo110970e4()) {
                                    if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f203299a.m129493Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = g900Var.f102746s.f82491r.f184001a;
                                    if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f68978a.m129494Z((Message) obj);
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
                                if (IntlCountryCodeController.m29114k()) {
                                    ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                } else {
                                    boolean z6 = z3;
                                    g900 g900Var4 = g900Var;
                                    ((ItemMessageRight) view2).m49664n1(message, z6, g900Var4.f102733f, g900Var4.f102732e);
                                }
                            } else {
                                g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                if (g900Var.f102746s.mo110970e4()) {
                                    if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f203299a.m129493Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = g900Var.f102746s.f82491r.f184001a;
                                    if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f68978a.m129494Z((Message) obj);
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
                                if (IntlCountryCodeController.m29114k()) {
                                    ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                } else {
                                    boolean z7 = z3;
                                    g900 g900Var5 = g900Var;
                                    ((ItemMessageRight) view2).m49664n1(message, z7, g900Var5.f102733f, g900Var5.f102732e);
                                }
                            }
                        }
                        if (i6 == 245) {
                            ((ItemMessageRight) view2).m49665o1();
                        }
                        if (i6 == 255) {
                            ((ItemMessageRight) view2).m49662l1();
                            return;
                        }
                        return;
                    }
                    ((ItemPromptIntl) childAt4).m49799m(message, g900Var.f102746s.m110994j3());
                    ItemBase itemBase2 = (ItemBase) view2;
                    if (i2 == 0) {
                        messageMo129506m = null;
                    } else {
                        messageMo129506m = g900Var.mo129506m(i2 - 1);
                    }
                    if (i2 == g900Var.mo129499d() - 1) {
                        messageMo129506m2 = null;
                    } else {
                        messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                    }
                    itemBase2.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                    if (!g900Var.f102746s.mo110970e4()) {
                        if (CoreModule.m30933P().m143412i().mo180535s4()) {
                            clzVar = g900Var.f102746s;
                            if (!clzVar.m111000k4(clzVar.m110989i3())) {
                                g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                if (g900Var.f102746s.mo110970e4()) {
                                    if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f203299a.m129493Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = g900Var.f102746s.f82491r.f184001a;
                                    if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f68978a.m129494Z((Message) obj);
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
                                if (IntlCountryCodeController.m29114k()) {
                                    ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                } else {
                                    boolean z8 = z3;
                                    g900 g900Var6 = g900Var;
                                    ((ItemMessageRight) view2).m49664n1(message, z8, g900Var6.f102733f, g900Var6.f102732e);
                                }
                            } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                                g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                if (g900Var.f102746s.mo110970e4()) {
                                    if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f203299a.m129493Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = g900Var.f102746s.f82491r.f184001a;
                                    if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f68978a.m129494Z((Message) obj);
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
                                if (IntlCountryCodeController.m29114k()) {
                                    ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                } else {
                                    boolean z9 = z3;
                                    g900 g900Var7 = g900Var;
                                    ((ItemMessageRight) view2).m49664n1(message, z9, g900Var7.f102733f, g900Var7.f102732e);
                                }
                            } else {
                                g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                                if (g900Var.f102746s.mo110970e4()) {
                                    if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f203299a.m129493Y((Message) obj);
                                        }
                                    })) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    list = g900Var.f102746s.f82491r.f184001a;
                                    if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                        @Override // p153l.qcj
                                        public final Object call(Object obj) {
                                            return this.f68978a.m129494Z((Message) obj);
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
                                if (IntlCountryCodeController.m29114k()) {
                                    ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                                } else {
                                    boolean z10 = z3;
                                    g900 g900Var8 = g900Var;
                                    ((ItemMessageRight) view2).m49664n1(message, z10, g900Var8.f102733f, g900Var8.f102732e);
                                }
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11 = z3;
                                g900 g900Var9 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11, g900Var9.f102733f, g900Var9.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z12 = z3;
                                g900 g900Var10 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z12, g900Var10.f102733f, g900Var10.f102732e);
                            }
                        }
                    }
                    if (i6 == 245) {
                        ((ItemMessageRight) view2).m49665o1();
                    }
                    if (i6 == 255) {
                        ((ItemMessageRight) view2).m49662l1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    g900 g900Var11 = g900Var;
                    int i9 = g900Var11.f102744q;
                    if (i9 == 0) {
                        g900Var11.f102744q = i9 + 1;
                        int iMo129507p = g900Var11.mo129507p(i2);
                        g900Var11.mo129495a(g900Var11.mo129509w((ViewGroup) view3.getParent(), iMo129507p), g900Var11.mo129506m(i2), iMo129507p, i2);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("MessagesAdapter error: \nuserId: ");
                    sb.append(CoreModule.m30929H().userId());
                    sb.append("\ncid: ");
                    sb.append(g900Var11.mo129506m(i2).cid);
                    sb.append("\nposition: ");
                    sb.append(i2);
                    sb.append("\nmessage id: ");
                    sb.append(message.f56859id);
                    sb.append("\nmessageType: ");
                    sb.append(g900Var11.m129486Q(g900Var11.mo129506m(i2), i2));
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
                        sb.append(g900Var11.m129486Q(g900Var11.mo129506m(i10), i10));
                        sb.append("\npre remote messageType: ");
                        sb.append(g900Var11.mo129506m(i10).messageType);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    if (i2 < g900Var11.mo129499d() - 1) {
                        sb.append("next msgType: ");
                        int i11 = i2 + 1;
                        sb.append(g900Var11.m129486Q(g900Var11.mo129506m(i11), i11));
                        sb.append("\nnext remote messageType: ");
                        sb.append(g900Var11.mo129506m(i11).messageType);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(message);
                    if (i2 > 0) {
                        arrayList.add(0, g900Var11.mo129506m(i2 - 1));
                    }
                    if (i2 > 1) {
                        arrayList.add(0, g900Var11.mo129506m(i2 - 2));
                    }
                    if (i2 > 2) {
                        arrayList.add(0, g900Var11.mo129506m(i2 - 3));
                    }
                    int i12 = i2 + 1;
                    if (i12 < g900Var11.mo129499d()) {
                        arrayList.add(g900Var11.mo129506m(i12));
                    }
                    int i13 = i2 + 2;
                    if (i13 < g900Var11.mo129499d()) {
                        arrayList.add(g900Var11.mo129506m(i13));
                    }
                    int i14 = i2 + 3;
                    if (i14 < g900Var11.mo129499d()) {
                        arrayList.add(g900Var11.mo129506m(i14));
                    }
                    sb.append("historyBottomMessages: ");
                    for (int i15 = 0; i15 < g900Var11.f102748u.size(); i15++) {
                        Message message2 = g900Var11.f102748u.get(i15);
                        sb.append("(");
                        sb.append(message2.f56859id);
                        sb.append(", ");
                        sb.append(message2.messageType);
                        sb.append("), ");
                    }
                    sb.append("\nnowBottomMessages: ");
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        Message message3 = (Message) arrayList.get(i16);
                        sb.append("(");
                        sb.append(message3.f56859id);
                        sb.append(", ");
                        sb.append(message3.messageType);
                        sb.append("), ");
                    }
                    sb.append("\ncrash caused by: ");
                    sb.append(e.getMessage());
                    CrashHelper.m82479c(new Exception(sb.toString()));
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
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
            case 27:
                g900Var = this;
                ItemBase itemBase3 = (ItemBase) view3;
                itemBase3.setLetterUser(g900Var.f102746s.mo111064x6());
                if (NullChecker.m82486a(g900Var.f102746s.mo111064x6()) && !g900Var.f102746s.m110838B3()) {
                    if (!(view3 instanceof ItemBase)) {
                        CrashHelper.m82479c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.m30347i() + ", convertView:" + g900Var.m129482L(view3, 0)));
                    }
                    itemBase3.mo49216f(g900Var.f102746s.mo111064x6(), g900Var.f102746s.mo111064x6().sendLetter, g900Var.f102746s.m111024p3());
                    return;
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase4 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase4.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z13 = z3;
                                g900 g900Var12 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z13, g900Var12.f102733f, g900Var12.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z14 = z3;
                                g900 g900Var13 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z14, g900Var13.f102733f, g900Var13.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z15 = z3;
                                g900 g900Var14 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z15, g900Var14.f102733f, g900Var14.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z16 = z3;
                            g900 g900Var15 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z16, g900Var15.f102733f, g900Var15.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z17 = z3;
                            g900 g900Var16 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z17, g900Var16.f102733f, g900Var16.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 63:
                ((ItemMessageNewSurvey) view3).m51043p0(message, this.f102746s);
                return;
            case 68:
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
            case 209:
            case 239:
                return;
            case 71:
            case 201:
                g900Var = this;
                g900Var.m129500d0(message);
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase5 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase5.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z18 = z3;
                                g900 g900Var17 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z18, g900Var17.f102733f, g900Var17.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z19 = z3;
                                g900 g900Var18 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z19, g900Var18.f102733f, g900Var18.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z110 = z3;
                                g900 g900Var19 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z110, g900Var19.f102733f, g900Var19.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z111 = z3;
                            g900 g900Var110 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z111, g900Var110.f102733f, g900Var110.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z112 = z3;
                            g900 g900Var111 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z112, g900Var111.f102733f, g900Var111.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 101:
                g900Var = this;
                if (!message.value.contains("你好呀，问个问题～\n")) {
                    message.value = "你好呀，问个问题～\n" + message.value;
                }
                if (!g900Var.f102745r.m161054a(message.f56859id)) {
                    g900Var.f102745r.m161055b(message.f56859id);
                    String str2 = message.msgData;
                    try {
                        ChatAssistantQuestion chatAssistantQuestion = !TextUtils.isEmpty(str2) ? ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData) : null;
                        if (NullChecker.m82486a(chatAssistantQuestion)) {
                            str2 = chatAssistantQuestion.type;
                        }
                        break;
                    } catch (IOException unused2) {
                    }
                    sfj0.m185601h("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_question_content", message.value), sfj0.C20032a.m185615h("chat_question_send_side", "to"), sfj0.C20032a.m185615h("chat_question_type", str2));
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase6 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase6.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z113 = z3;
                                g900 g900Var112 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z113, g900Var112.f102733f, g900Var112.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z114 = z3;
                                g900 g900Var113 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z114, g900Var113.f102733f, g900Var113.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z115 = z3;
                                g900 g900Var114 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z115, g900Var114.f102733f, g900Var114.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z116 = z3;
                            g900 g900Var115 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z116, g900Var115.f102733f, g900Var115.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z117 = z3;
                            g900 g900Var116 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z117, g900Var116.f102733f, g900Var116.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 104:
                ((ItemMsgRiskLayout) view3).m49718A(message);
                return;
            case 106:
                ((ItemSystemRemind) view3).mo49217g(this, message, i2 == 0 ? null : mo129506m(i2 - 1), i2 == mo129499d() - 1 ? null : mo129506m(i2 + 1));
                return;
            case 109:
                clz<?, ?> clzVar2 = this.f102746s;
                ((ItemBlindBoxGuideView) view3).m49223e(clzVar2.f82482k, clzVar2.mo111064x6(), this.f102745r);
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
            case 144:
            case 202:
            case 222:
            case 226:
                g900Var = this;
                LinearLayout linearLayout = (LinearLayout) view3;
                childAt = linearLayout.getChildAt(0);
                VText vText = (VText) linearLayout.getChildAt(1);
                if (g900Var.f102746s.m111048t7() instanceof yxz) {
                    boolean z20 = ((yxz) g900Var.f102746s.m111048t7()).f202025M1;
                    clz<?, ?> clzVar3 = g900Var.f102746s;
                    if (z20) {
                        vText.setTextColor(clzVar3.act().color(g9c0.f102810a0));
                        vText.setBackgroundResource(ibc0.f113900R4);
                    } else {
                        vText.setTextColor(clzVar3.act().color(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102821k));
                        vText.setBackgroundColor(0);
                    }
                }
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase7 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase7.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z118 = z3;
                                g900 g900Var117 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z118, g900Var117.f102733f, g900Var117.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z119 = z3;
                                g900 g900Var118 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z119, g900Var118.f102733f, g900Var118.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1110 = z3;
                                g900 g900Var119 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1110, g900Var119.f102733f, g900Var119.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z1111 = z3;
                            g900 g900Var1110 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z1111, g900Var1110.f102733f, g900Var1110.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z1112 = z3;
                            g900 g900Var1111 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z1112, g900Var1111.f102733f, g900Var1111.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                ((ReminderView) view3).m50183i(this.f102746s.m110994j3());
                return;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case 148:
            case 149:
            case 203:
            case 227:
                g900Var = this;
                childAt = ((ViewGroup) view3).getChildAt(0);
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase8 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase8.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1113 = z3;
                                g900 g900Var1112 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1113, g900Var1112.f102733f, g900Var1112.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1114 = z3;
                                g900 g900Var1113 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1114, g900Var1113.f102733f, g900Var1113.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1115 = z3;
                                g900 g900Var1114 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1115, g900Var1114.f102733f, g900Var1114.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z1116 = z3;
                            g900 g900Var1115 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z1116, g900Var1115.f102733f, g900Var1115.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z1117 = z3;
                            g900 g900Var1116 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z1117, g900Var1116.f102733f, g900Var1116.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 153:
                g900Var = this;
                ItemBase itemBase9 = (ItemBase) view3;
                itemBase9.setLetterUser(g900Var.f102746s.mo111064x6());
                if (!g900Var.f102746s.m110838B3()) {
                    User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                    if (!(view3 instanceof ItemBase)) {
                        CrashHelper.m82479c(new Exception("itemViewType:" + i8 + ", ab:" + ABManager.m30347i() + ", convertView:" + g900Var.m129482L(view3, 0)));
                    }
                    clz<?, ?> clzVar4 = g900Var.f102746s;
                    itemBase9.mo49216f(userM116600p9, clzVar4.f82488p, clzVar4.m111024p3());
                    return;
                }
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase10 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase10.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1118 = z3;
                                g900 g900Var1117 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1118, g900Var1117.f102733f, g900Var1117.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z1119 = z3;
                                g900 g900Var1118 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z1119, g900Var1118.f102733f, g900Var1118.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11110 = z3;
                                g900 g900Var1119 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11110, g900Var1119.f102733f, g900Var1119.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z11111 = z3;
                            g900 g900Var11110 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z11111, g900Var11110.f102733f, g900Var11110.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z11112 = z3;
                            g900 g900Var11111 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z11112, g900Var11111.f102733f, g900Var11111.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
            case 176:
            case 193:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                ((ItemTantanVerifyToast) view3).m49904i(message, this.f102745r);
                return;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                ((ItemTickle) view3).m49928j(this, message, this.f102746s.mo111064x6());
                if (this.f102737j.contains(message.f56859id) || message.isLocal() || message.f56859id.startsWith("fake_id_")) {
                    return;
                }
                this.f102737j.add(message.f56859id);
                sfj0.m185601h("e_tickle_message", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                return;
            case 182:
                ((ItemConversationNotification) view3).m49295p(message, this.f102745r);
                return;
            case 184:
                ((ItemRedPacketNotification) view3).m49828a(message);
                return;
            case 188:
                ((ItemGreetingTip) view3).mo43399A(message);
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                g900Var = this;
                ViewGroup viewGroup2 = (ViewGroup) view3;
                childAt = viewGroup2.getChildAt(0);
                ((ItemChatInterceptRight) viewGroup2.getChildAt(1)).m49264h(g900Var, message, g900Var.f102746s.mo111064x6());
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase11 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase11.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11113 = z3;
                                g900 g900Var11112 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11113, g900Var11112.f102733f, g900Var11112.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11114 = z3;
                                g900 g900Var11113 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11114, g900Var11113.f102733f, g900Var11113.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11115 = z3;
                                g900 g900Var11114 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11115, g900Var11114.f102733f, g900Var11114.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z11116 = z3;
                            g900 g900Var11115 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z11116, g900Var11115.f102733f, g900Var11115.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z11117 = z3;
                            g900 g900Var11116 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z11117, g900Var11116.f102733f, g900Var11116.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 192:
                ((ItemVoiceCallInvitation) view3).m49960k(message);
                return;
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                ImageView imageView = (ImageView) view3.findViewById(edc0.f93192E1);
                TextView textView = (TextView) view3.findViewById(edc0.f93267Q4);
                TextView textView2 = (TextView) view3.findViewById(edc0.f93442r0);
                if (gta.m132210e().m132214d().mo34702I4()) {
                    bnl0.m105526N(imageView, ibc0.f113979b2);
                    textView.setTextColor(App.f16088e.getColor(g9c0.f102817g));
                    textView2.setTextColor(App.f16088e.getColor(g9c0.f102819i));
                }
                if (NullChecker.m82486a(textView)) {
                    textView.setTypeface(lyh0.m156283c(3), 1);
                    return;
                }
                return;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                ((ItemCountdownLikeSuccess) view3).m49303g(this.f102746s.m111048t7(), this.f102746s.m110989i3(), message);
                return;
            case Opcodes.IFNULL /* 198 */:
                ((ItemChristmasMatch) view3).m49277A(message);
                return;
            case 207:
            case 208:
                if (CoreModule.m30933P().m143412i().mo34605uh()) {
                    ((ItemHeartbeatNotifyNewUi) view3).m49384c(message, this.f102746s.m110994j3(), this.f102745r);
                    return;
                }
                return;
            case 215:
                ((ItemFinishedChallengeView) view3).m43389f(this.f102746s.act(), message, this.f102746s.mo111064x6(), this.f102745r);
                return;
            case 217:
                ((ItemInviteChallengeView) view3).m43395d(this.f102746s.act(), this.f102746s.mo111064x6(), message);
                return;
            case 218:
                ((ItemBreakIceMessage) view3).m49230g((MessagesAct) this.f102746s.act(), message);
                return;
            case 220:
                ((ItemChallengeTipsMsg) view3).m43378c(this.f102746s.act(), message, this.f102746s.mo111064x6().f56859id, this.f102745r);
                return;
            case 223:
                ((ItemTagGuide) view3).m49880e(message, this.f102746s.mo111064x6(), this.f102745r);
                return;
            case 228:
                ((ItemMomentPostGuide) view3).mo43399A(message);
                return;
            case 231:
                ((ItemMessageWCInviteAfter) view3).mo43399A(message);
                return;
            case 234:
                ((ItemLoveBuzzBreakIceMessage) view3).m49475g((MessagesAct) this.f102746s.act(), this, message);
                return;
            case 235:
                ((ItemAddTagsGuide) view3).m49132n(this.f102746s.act(), this.f102746s.mo111064x6(), this.f102745r, this.f102746s.f82474c);
                return;
            case 236:
                ((ItemAddArtworkGuide) view3).m49111x(this.f102746s.act(), this.f102746s.mo111064x6(), this.f102745r, this.f102746s.f82474c);
                return;
            case 237:
                ((ItemSendMsgTips) view3).m49844b(this.f102746s.act(), "tag");
                return;
            case 238:
                ((ItemSendMsgTips) view3).m49844b(this.f102746s.act(), "artwork");
                return;
            case 240:
                ((ScriptMessageItem) view3).m51291b(this.f102746s.act(), message, this.f102746s.mo111064x6().f56859id);
                return;
            case 241:
                ((ItemCommonIconTitleDesClikeView) view3).m43383b(this.f102746s.act(), message, this.f102746s.mo111064x6(), this.f102745r);
                return;
            case 242:
                ((ItemBirthdayTip) view3).m42674b(this.f102746s.mo111064x6());
                return;
            case 243:
                ((ItemWoodenFishTip) view3).m49967A(message);
                return;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                ((ItemIceBreakStateRight) view3).mo43399A(message);
                return;
            case 246:
            default:
                g900Var = this;
                i6 = i8;
                view2 = view3;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase12 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase12.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11118 = z3;
                                g900 g900Var11117 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11118, g900Var11117.f102733f, g900Var11117.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z11119 = z3;
                                g900 g900Var11118 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z11119, g900Var11118.f102733f, g900Var11118.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z111110 = z3;
                                g900 g900Var11119 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z111110, g900Var11119.f102733f, g900Var11119.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z111111 = z3;
                            g900 g900Var111110 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z111111, g900Var111110.f102733f, g900Var111110.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z111112 = z3;
                            g900 g900Var111111 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z111112, g900Var111111.f102733f, g900Var111111.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 247:
                ((ItemChatAssistantQuestionAutoRight) view3).m49252z(this.f102746s.act(), this, message, this.f102745r);
                return;
            case 248:
                ((ItemChatAssistantQuestion) view3).m49245P(this.f102746s.act(), this, message, this.f102745r);
                return;
            case 249:
            case 252:
                ((ChatTipsItem) view3).m49062d(i8, message, this.f102745r);
                return;
            case 251:
                if (message.isMe() && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip.selfShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.selfShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.selfShown.value;
                } else if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip.otherShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.otherShown.value)) {
                    message.value = message.additionalData.twoSidesDifferentTip.otherShown.value;
                }
                ((ItemConversationNotification) view3).m49295p(message, this.f102745r);
                return;
            case 253:
                ((ItemAiP2PChatGuide) view3).m49167e(this.f102746s.mo111064x6(), this.f102745r);
                return;
            case 256:
                ((ItemPicCertGuide) view3).m49756e(this.f102746s.mo111064x6(), this.f102745r);
                return;
            case 257:
                ((ItemPlatinumPinGuideMessage) view3).m49765f(this.f102746s.act(), this, this.f102746s.mo111064x6(), this.f102746s.f82482k);
                return;
            case 258:
                ((ItemLongTimeNoSeeTip) view3).m49468b(this.f102745r, message, this.f102746s.mo111064x6(), this.f102746s.m110994j3());
                return;
            case 261:
                ((ItemVisitorHideFootPrint) view3).m49945j(this.f102746s.act(), this, this.f102746s.mo111064x6(), this.f102746s.f82482k, message);
                return;
            case 262:
                ((ItemIntlConversationPrompt) view3).m49411s(message, this.f102745r);
                return;
            case 265:
                ViewGroup viewGroup3 = (ViewGroup) view3;
                childAt = viewGroup3.getChildAt(0);
                ((IntrRiskTipItem) viewGroup3.getChildAt(1)).m49084g(this, message, this.f102745r);
                g900Var = this;
                i6 = i8;
                view2 = childAt;
                if (i6 == 41) {
                    g900Var.f102736i.add(message.value);
                    i4g0.m138526x("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
                }
                g900Var.m129505h0(message, i6);
                g900Var.m129502e0(message);
                g900Var.m129503f0(message, i6);
                g900Var.m129504g0(message);
                ItemBase itemBase13 = (ItemBase) view2;
                if (i2 == 0) {
                    messageMo129506m = null;
                } else {
                    messageMo129506m = g900Var.mo129506m(i2 - 1);
                }
                if (i2 == g900Var.mo129499d() - 1) {
                    messageMo129506m2 = null;
                } else {
                    messageMo129506m2 = g900Var.mo129506m(i2 + 1);
                }
                itemBase13.mo49217g(g900Var, message, messageMo129506m, messageMo129506m2);
                if (!g900Var.f102746s.mo110970e4()) {
                    if (CoreModule.m30933P().m143412i().mo180535s4()) {
                        clzVar = g900Var.f102746s;
                        if (!clzVar.m111000k4(clzVar.m110989i3())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z111113 = z3;
                                g900 g900Var111112 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z111113, g900Var111112.f102733f, g900Var111112.f102732e);
                            }
                        } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z111114 = z3;
                                g900 g900Var111113 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z111114, g900Var111113.f102733f, g900Var111113.f102732e);
                            }
                        } else {
                            g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                            if (g900Var.f102746s.mo110970e4()) {
                                if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f203299a.m129493Y((Message) obj);
                                    }
                                })) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                list = g900Var.f102746s.f82491r.f184001a;
                                if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                    @Override // p153l.qcj
                                    public final Object call(Object obj) {
                                        return this.f68978a.m129494Z((Message) obj);
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
                            if (IntlCountryCodeController.m29114k()) {
                                ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                            } else {
                                boolean z111115 = z3;
                                g900 g900Var111114 = g900Var;
                                ((ItemMessageRight) view2).m49664n1(message, z111115, g900Var111114.f102733f, g900Var111114.f102732e);
                            }
                        }
                    } else if (TextUtils.equals(g900Var.f102746s.mo111034r3(), CoreModule.m30933P().m143412i().mo180475h())) {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z111116 = z3;
                            g900 g900Var111115 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z111116, g900Var111115.f102733f, g900Var111115.f102732e);
                        }
                    } else {
                        g900Var.f102733f = Long.parseLong(g900Var.f102746s.m110994j3().otherReadUntil);
                        if (g900Var.f102746s.mo110970e4()) {
                            if (i2 == jyb.m147484O(g900Var.f102746s.f82491r.f184001a, new qcj() { // from class: l.z800
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f203299a.m129493Y((Message) obj);
                                }
                            })) {
                                z = true;
                            } else {
                                z = false;
                            }
                            list = g900Var.f102746s.f82491r.f184001a;
                            if (-1 == jyb.m147476G(jyb.m147521m0(list, list.size() - i2), new qcj() { // from class: l.a900
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return this.f68978a.m129494Z((Message) obj);
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
                        if (IntlCountryCodeController.m29114k()) {
                            ((ItemMessageRight) view2).m49663m1(g900Var.f102746s.act(), message, g900Var.f102746s.f82482k, g900Var, z3, g900Var.f102733f, g900Var.f102732e);
                        } else {
                            boolean z111117 = z3;
                            g900 g900Var111116 = g900Var;
                            ((ItemMessageRight) view2).m49664n1(message, z111117, g900Var111116.f102733f, g900Var111116.f102732e);
                        }
                    }
                }
                if (i6 == 245) {
                    ((ItemMessageRight) view2).m49665o1();
                }
                if (i6 == 255) {
                    ((ItemMessageRight) view2).m49662l1();
                    return;
                }
                return;
            case 266:
                ((ItemWechatNotifyGuideMessage) view3).m49966c(this.f102746s.act(), this, this.f102746s.mo111064x6(), this.f102746s.f82482k);
                return;
            case 267:
                ((ItemODiamondVisitorGuideMessage) view3).m49726f(this.f102746s.act(), message, this.f102746s.mo111064x6());
                return;
            case 268:
                ((ItemLocalUXQuestionnaire) view3).m49448e((MessagesAct) this.f102746s.act(), this, message, this.f102745r);
                return;
            case 269:
                ((MessageIdealEnquiryLayout) view3).m51075p(this.f102746s.mo111064x6(), message, this.f102745r);
                return;
            case 270:
                ((MessageLoveLetterGuideView) view3).m51125f(this.f102746s.mo111064x6(), message, this.f102745r);
                return;
            case 272:
                ((ItemGuideAuthentication) view3).m49373c(this.f102746s.mo111064x6(), message, this, this.f102745r);
                return;
            case 274:
                ((ItemCommonTipBoxV2) view3).m49293S(this.f102746s.act(), this, message);
                return;
            case 275:
                ((AIChatMessageAnalysisItem) view3).m50208n((MessagesAct) this.f102746s.act(), message);
                return;
            case 276:
                ((ItemMessageMMTask) view3).m49611S((MessagesAct) this.f102746s.act(), this, message);
                return;
            case 278:
                ((ItemAiChatGuideMessage) view3).m49159s((MessagesAct) this.f102746s.act(), message);
                return;
            case 279:
                ((ItemIntlReadReceiptsGuide) view3).m49419X(this.f102746s.mo111064x6(), message, this.f102745r);
                return;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public List<Message> m129496a0() {
        return this.f102746s.f82491r.f184001a;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m129497b0(Message message) {
        return !TEnum.equals(message.messageType, MessageType.chat_assistant_question) || CoreModule.m30933P().m143412i().mo180550v5();
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c0 */
    public void m129498c0(vg60<Message> vg60Var, Reminder reminder, Message message) {
        List<Message> arrayList;
        m153306r();
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            this.f102746s.m111048t7().f160408n1.getRealView().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC17179a());
        }
        if (!this.f102735h) {
            Message message2 = (Message) jyb.m147475F(vg60Var.f184001a);
            this.f102734g = NullChecker.m82486a(reminder) && !CoreMomentInfo.LOCAL_ID_INVALID.equals(reminder.moment) && (message2 == null || message2.createdTime < reminder.createdTime);
            this.f102735h = true;
        }
        if (CoreModule.m30933P().m143412i().mo180486j() && this.f102746s.m110994j3().localSafetyReminderTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && NullChecker.m82486a(this.f102746s.mo111064x6()) && NullChecker.m82486a(jyb.m147529r(this.f102746s.mo111064x6().status, new qcj() { // from class: l.d900
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, UserStatus.RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER));
            }
        }))) {
            Message message3 = (Message) jyb.m147475F(vg60Var.f184001a);
            if (NullChecker.m82486a(message3) && message3.isOtherUser() && !message3.localSensitiveWordReminder) {
                CoreModule.f18264c.f20384f0.m34050mn(message3);
            }
        }
        if (this.f102734g) {
            Message messageNew_ = Message.new_();
            messageNew_.createdTime = reminder.createdTime;
            messageNew_.cid = this.f102746s.m110994j3().f56859id;
            messageNew_.reminder = reminder.f56859id;
            messageNew_.moment = reminder.reference.f21237id;
            arrayList = new ArrayList<>(vg60Var.f184001a);
            jyb.m147509g0(arrayList, messageNew_, new Comparator() { // from class: l.e900
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g900.m129474F((Message) obj, (Message) obj2);
                }
            });
        } else {
            arrayList = null;
        }
        if (!this.f102746s.mo110970e4() && CoreModule.m30933P().m143412i().mo180535s4()) {
            clz<?, ?> clzVar = this.f102746s;
            if (!clzVar.m111000k4(clzVar.mo111034r3())) {
                if (!jyb.m147479J(this.f102734g ? arrayList : vg60Var.f184001a) && NullChecker.m82486a(message)) {
                    this.f102732e = (long) message.createdTime;
                }
            }
        }
        if (this.f102748u.isEmpty() && !jyb.m147479J(vg60Var.f184001a)) {
            int iMin = Math.min(10, vg60Var.f184001a.size());
            for (int i = 0; i < Math.min(10, vg60Var.f184001a.size()); i++) {
                try {
                    this.f102748u.add(vg60Var.f184001a.get(i));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("MessagesAdapter.render IndexOutOfBoundsException currentThread = ");
                    sb.append(Thread.currentThread().getName());
                    sb.append(",  userId = ");
                    sb.append(NullChecker.m82486a(this.f102746s.m110932W5()) ? this.f102746s.m110932W5().f56859id : "null");
                    sb.append(",  oldSize = ");
                    sb.append(iMin);
                    sb.append(",  currentSize = ");
                    sb.append(Math.min(10, vg60Var.f184001a.size()));
                    sb.append(",  index = ");
                    sb.append(i);
                    sb.append(",  list = ");
                    sb.append(vg60Var.f184001a.toString());
                    CrashHelper.m82479c(new Exception(sb.toString()));
                }
            }
        }
        clz<?, ?> clzVar2 = this.f102746s;
        if (!this.f102734g) {
            arrayList = vg60Var.f184001a;
        }
        clzVar2.f82491r = new vg60<>(Lists.m15984q(arrayList), vg60Var.f184002b);
        m153307y();
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "GT-I9208".equalsIgnoreCase(Build.MODEL)) {
            this.f102746s.act().getWindow().setSoftInputMode(16);
        }
    }

    @Override // p153l.l900
    /* JADX INFO: renamed from: d */
    public int mo129499d() {
        return m129496a0().size();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m129500d0(final Message message) {
        if (this.f102741n.contains(message.f56859id)) {
            return;
        }
        this.f102741n.add(message.f56859id);
        this.f102746s.act().duringCreated(new pcj() { // from class: l.b900
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return psd0.m173626s(C22421c.just(bgm.m104230c(message2.referenceMsgId)), C22421c.just(bgm.m104232e(message2.referenceMsgId)), C22421c.just(bgm.m104231d(message2.getHostId(), message2.referenceMsgId)), new scj() { // from class: l.f900
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return new bkj0((Literatures) obj, (List) obj2, (List) obj3);
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.c900
            @Override // p153l.y20
            public final void call(Object obj) {
                g900.m129473E(message, (bkj0) obj);
            }
        }));
    }

    @Override // p153l.lzl
    /* JADX INFO: renamed from: e */
    public void mo129501e(int i) {
        if (i > 5 || !this.f102746s.f82491r.m201221c()) {
            return;
        }
        CoreModule.f18264c.f20384f0.m33600Bn(this.f102746s.m110989i3());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m129502e0(Message message) {
        if (CoreModule.m30933P().m143412i().mo34340Hr() && message.value.contains("tantan://profile/edit?type=continuousEdit") && !this.f102739l.contains(message.value)) {
            this.f102739l.add(message.value);
            i4g0.m138526x("e_assistant_update_profile", OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m129503f0(Message message, int i) {
        if ((i == 69 || i == 200) && !this.f102740m.contains(message.f56859id)) {
            this.f102740m.add(message.f56859id);
            i4g0.m138492A("e_other_state", OMSDialogPositon.p_chat_view, new pf60("state_id", message.referenceMsgId), new pf60("owner_id", message.owner));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m129504g0(Message message) {
        if (!TEnum.equals(message.messageType, MessageType.get("question")) || this.f102745r.m161054a(message.f56859id)) {
            return;
        }
        this.f102745r.m161055b(message.f56859id);
        i4g0.m138492A("e_message_question", OMSDialogPositon.p_chat_view, jyb.m147494Y("question_id", message.question));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m129505h0(Message message, int i) {
        String str;
        if (i != 64 || this.f102738k.contains(message.value) || (str = message.msgData) == null || !str.contains(SchemeKey.enterSuggestVoiceRoom)) {
            return;
        }
        this.f102738k.add(message.value);
        i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, new pf60("audio_card_type", "message_audio_assistant"), new pf60("liveId", ""), new pf60("anchorId", ""), new pf60("topic_id", ""), new pf60("audio_room_type", ""), new pf60("extra_info", "active_gift"));
    }

    @Override // p153l.l900
    /* JADX INFO: renamed from: m */
    public Message mo129506m(int i) {
        return this.f102746s.f82491r.f184001a.get(i);
    }

    @Override // p153l.l900
    /* JADX INFO: renamed from: p */
    public int mo129507p(int i) {
        return m129486Q(mo129506m(i), i);
    }

    @Override // p153l.l900
    /* JADX INFO: renamed from: s */
    public List<pf60<Integer, Integer>> mo129508s() {
        return jyb.m147507f0(jyb.m147494Y(0, 15), jyb.m147494Y(116, 15), jyb.m147494Y(12, 10), jyb.m147494Y(128, 10), jyb.m147494Y(2, 10), jyb.m147494Y(118, 10), jyb.m147494Y(182, 20));
    }

    @Override // p153l.l900
    /* JADX INFO: renamed from: w */
    public View mo129509w(ViewGroup viewGroup, int i) {
        return m129477U(viewGroup, i);
    }
}
