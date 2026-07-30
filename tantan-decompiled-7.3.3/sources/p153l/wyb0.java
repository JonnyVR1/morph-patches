package p153l;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8773b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.codec.language.p126bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 w2\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003JA\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J!\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010%J?\u0010'\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b'\u0010\u0018JA\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015H\u0007¢\u0006\u0004\b(\u0010\u0018J\u001d\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J3\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00042\u0006\u00105\u001a\u000204¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00072\u0006\u00105\u001a\u000204¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010%J\r\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010\u0003J\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0012¢\u0006\u0004\bB\u0010%J\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0003J\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0003R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u001aR(\u0010K\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00108R\"\u0010]\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010;R\"\u0010a\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010;R\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00108R\"\u0010e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u00108\u001a\u0004\be\u0010%\"\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010s\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010v\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bt\u0010j\u001a\u0004\bu\u0010l¨\u0006x"}, m88121d2 = {"Ll/wyb0;", "", "<init>", "()V", "", "x0", "L", "Lrx/c;", "Ll/uxj0;", "E0", "()Lrx/c;", "h0", "d0", "e0", "r0", "q0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "isResume", "showTanTanCoinGuide", "Lkotlin/Function1;", "onIntercept", "k0", "(Lcom/p1/mobile/android/app/Act;ZZLkotlin/jvm/functions/Function1;)V", "D0", "J", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;", "b0", "audioMatchStatus", Languages.ANY, "u0", "(Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;Ljava/lang/Object;)V", "P", "()Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;", "Y", "()Z", "W", "C0", "A0", "isPermission", "isGuide", p7f.GPS_MEASUREMENT_INTERRUPTED, "(ZZ)Z", "U", "(Z)Z", "t0", "(Lcom/p1/mobile/android/app/Act;ZLkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "c0", "(Landroid/app/Activity;)V", "", "userId", "M", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Z", "(Ljava/lang/String;)Z", "z0", "(Ljava/lang/String;)V", "", "j0", "(Ljava/lang/String;)Lrx/c;", p7f.GPS_DIRECTION_TRUE, "a0", "I", "H", "w0", "K", "", "a", "limitTime", "Lrx/subjects/a;", "b", "Lrx/subjects/a;", "audioMatchStatusBehaviorSubject", "Ll/kcg0;", "c", "Ll/kcg0;", "appForegroundSub", Constants.INAPP_DATA_TAG, "statusSub", "Lcom/p1/mobile/putong/core/ui/onlinematch/b;", "e", "Lcom/p1/mobile/putong/core/ui/onlinematch/b;", "onlineMatchTimer", "f", "isInSearchingAction", "g", "Ljava/lang/String;", "R", "()Ljava/lang/String;", "setVoicechat_results", "voicechat_results", "h", "getMVasFrom", "v0", "mVasFrom", RXScreenCaptureService.KEY_INDEX, "clickLock", "j", "isShowGuide", "setShowGuide", "(Z)V", "Ll/vxd0;", "k", "Ll/vxd0;", "getShowGuideCount", "()Ll/vxd0;", "showGuideCount", "Ll/byd0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/byd0;", "getShowGuideTime", "()Ll/byd0;", "showGuideTime", "m", "getRejectGuideCount", "rejectGuideCount", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wyb0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public static volatile wyb0 f191592n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long limitTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C22507a<Pair<CoreAudioMatch.AudioMatchStatus, Object>> audioMatchStatusBehaviorSubject;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public kcg0 appForegroundSub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public kcg0 statusSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C8773b onlineMatchTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isInSearchingAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String voicechat_results;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String mVasFrom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean clickLock;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowGuide;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final vxd0 showGuideCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final byd0 showGuideTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final vxd0 rejectGuideCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final String[] f191593o = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final xyd0 f191594p = new xyd0("quickaudio_sets_" + CoreModule.m30929H().userId(), new HashSet());

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final String f191595q = wyb0.class.getSimpleName();

    /* JADX INFO: renamed from: l.wyb0$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C21205b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f191609a;

        static {
            int[] iArr = new int[CoreAudioMatch.AudioMatchStatus.values().length];
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.SEARCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f191609a = iArr;
        }
    }

    /* JADX INFO: renamed from: l.wyb0$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"l/wyb0$c", "Ll/ga1;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/ga1;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21206c implements ga1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f191611b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f191612c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f191613d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function1<Boolean, Unit> f191614e;

        /* JADX WARN: Multi-variable type inference failed */
        public C21206c(Act act, boolean z, boolean z2, Function1<? super Boolean, Unit> function1) {
            this.f191611b = act;
            this.f191612c = z;
            this.f191613d = z2;
            this.f191614e = function1;
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            businessKey.getClass();
            focusBusinessType.getClass();
            wyb0.this.m208535D0();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String currentBusinessKey, AudioBusinessType currentType, ga1 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                r1j0.m179420g(conflictBusinessType.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(currentBusinessKey, currentType, currentCallBack);
                wyb0.this.m208558k0(this.f191611b, this.f191612c, this.f191613d, this.f191614e);
            }
        }

        @Override // p153l.ga1
        public void success() {
            wyb0.this.m208558k0(this.f191611b, this.f191612c, this.f191613d, this.f191614e);
        }
    }

    public wyb0() {
        this.limitTime = Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        C22507a<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22507aM222759c = C22507a.m222759c(new Pair(CoreAudioMatch.AudioMatchStatus.IDLE, new Object()));
        c22507aM222759c.getClass();
        this.audioMatchStatusBehaviorSubject = c22507aM222759c;
        this.onlineMatchTimer = new C8773b(new C8773b.a() { // from class: l.pxb0
            @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.C8773b.a
            /* JADX INFO: renamed from: a */
            public final void mo51472a() {
                wyb0.m208507i(this.f154556a);
            }
        }, Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        m208560r0();
        this.statusSub = m208552b0().subscribe(psd0.m173597H(new y20() { // from class: l.ayb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208501e(this.f73961a, (Pair) obj);
            }
        }, new y20() { // from class: l.jyb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208485B((Throwable) obj);
            }
        }));
        this.voicechat_results = "trystart";
        this.mVasFrom = "";
        this.showGuideCount = new vxd0("quick_audio_guide_count_" + CoreModule.m30929H().userId(), 0);
        this.showGuideTime = new byd0("quick_audio_guide_time_" + CoreModule.m30929H().userId(), 0L);
        this.rejectGuideCount = new vxd0("quick_audio_guide_reject_" + CoreModule.m30929H().userId(), 0);
    }

    /* JADX INFO: renamed from: B */
    public static void m208485B(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m208486B0(wyb0 wyb0Var, Act act, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: l.qxb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return wyb0.m208499c(((Boolean) obj2).booleanValue());
                }
            };
        }
        wyb0Var.m208533A0(act, z, z2, function1);
    }

    /* JADX INFO: renamed from: N */
    public static final void m208492N(Act act, String str, wyb0 wyb0Var) {
        Intent intentM50123g2 = MessagesAct.m50123g2(act, str, 31, jyb.m147494Y("ISCALLEER", "1"));
        intentM50123g2.getClass();
        if ((act instanceof DropDownAct) && ((DropDownAct) act).m55641o2()) {
            act.startActivityForResult(intentM50123g2, 1911);
        } else if (act instanceof QuickChatSearchingAct) {
            act.startActivity(intentM50123g2);
        } else {
            act.startActivity(intentM50123g2);
        }
        INSTANCE.m208581o(str);
        wyb0Var.m208553c0(act);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final wyb0 m208493O() {
        return INSTANCE.m208572f();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Q */
    public static final String m208494Q() {
        return INSTANCE.m208574h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: S */
    public static final boolean m208495S(@NotNull String str) {
        return INSTANCE.m208575i(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m208496X(@NotNull Conversation conversation) {
        return INSTANCE.m208576j(conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Integer m208498b(pf60 pf60Var) {
        return (Integer) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m208499c(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m208500d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m208501e(wyb0 wyb0Var, Pair pair) {
        CoreAudioMatch.AudioMatchStatus audioMatchStatus = (CoreAudioMatch.AudioMatchStatus) pair.first;
        if ((audioMatchStatus == null ? -1 : C21205b.f191609a[audioMatchStatus.ordinal()]) != 1) {
            wyb0Var.onlineMatchTimer.m51471d();
            wyb0Var.isInSearchingAction = false;
        } else {
            if (!wyb0Var.isInSearchingAction) {
                wyb0Var.onlineMatchTimer.m51470c();
            }
            wyb0Var.isInSearchingAction = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m208502f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m208503f0(wyb0 wyb0Var, uxj0 uxj0Var) {
        wyb0Var.m208541L();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.TIMEOUT);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m208505g0(wyb0 wyb0Var, Throwable th) {
        wyb0Var.m208541L();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.TIMEOUT);
    }

    /* JADX INFO: renamed from: h */
    public static void m208506h() {
    }

    /* JADX INFO: renamed from: i */
    public static void m208507i(final wyb0 wyb0Var) {
        wyb0Var.m208565x0();
        wyb0Var.m208536E0().subscribe(psd0.m173597H(new y20() { // from class: l.zxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208503f0(this.f206451a, (uxj0) obj);
            }
        }, new y20() { // from class: l.byb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208505g0(this.f79004a, (Throwable) obj);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i0 */
    public static final int m208508i0() {
        return INSTANCE.m208578l();
    }

    /* JADX INFO: renamed from: k */
    public static void m208510k(final Act act, final String str, final wyb0 wyb0Var, uxj0 uxj0Var) {
        l51.m152888H(act, new Runnable() { // from class: l.qyb0
            @Override // java.lang.Runnable
            public final void run() {
                wyb0.m208492N(act, str, wyb0Var);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m208512l0(Act act, wyb0 wyb0Var, Pair pair) {
        act.progressDismiss();
        if (NullChecker.m82486a(pair)) {
            pair.getClass();
            if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                CoreModule.f18264c.f20405m0.m32005G8((String) pair.first);
                wyb0Var.m208559q0();
                wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.MATCHED, pair.first);
                return;
            }
        }
        wyb0Var.m208559q0();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.SEARCHING, null);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m208513m(Act.C4450r c4450r) {
        return c4450r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m82486a(c4450r.f16062a.get()));
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m208514m0(final Act act, final wyb0 wyb0Var, Throwable th) {
        th.getClass();
        pb1.m171472b().mo171476e(f191595q);
        act.progressDismiss();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.NETWORK);
        if (th instanceof TantanException.Client.TantanForbidden) {
            switch (((TantanException.Client.TantanForbidden) th).subCode) {
                case 600103:
                    o1j0.m165636j("语音闪聊暂不可用");
                    break;
                case 600104:
                    o1j0.m165636j("由于头像不真实，你将暂时无法使用语音闪聊，快去换个新头像吧");
                    break;
                case 600105:
                    o1j0.m165636j("由于涉及广告，你已被封禁");
                    break;
                case 600107:
                    new th0.C20312a(act).m191160s("请完善资料哦").m191151j("为了保证语音闪聊的真实性，请先去完成真人实名认证").m191147f("暂不认证").m191159r("去认证").m191156o(new View.OnClickListener() { // from class: l.gyb0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            wyb0.m208516n0(act, view);
                        }
                    }).m191142a().m191141g();
                    break;
                case 600108:
                    o1j0.m165636j("无会员特权，语音闪聊暂不可用");
                    break;
                case 600109:
                    o1j0.m165636j("未到语音闪聊开放时间内");
                    break;
                case 600111:
                    qtk.m177991P0(act, "", new x20() { // from class: l.hyb0
                        @Override // p153l.x20
                        public final void call() {
                            wyb0.m208518o0();
                        }
                    }, false, false, new x20() { // from class: l.iyb0
                        @Override // p153l.x20
                        public final void call() {
                            wyb0.m208520p0(this.f117535a, act);
                        }
                    });
                    break;
                case 600201:
                    o1j0.m165636j("正在语音闪聊匹配中");
                    break;
                case 600202:
                    o1j0.m165636j("正在在线闪聊匹配中");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m208515n(wyb0 wyb0Var, Act act) {
        a5i0.m96160p0().m96211Z0();
        m208486B0(wyb0Var, act, false, false, null, 10, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m208516n0(Act act, View view) {
        zki0.m220075D(act);
    }

    /* JADX INFO: renamed from: o */
    public static Integer m208517o(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static void m208519p(Throwable th) {
        th.getClass();
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m208520p0(wyb0 wyb0Var, Act act) {
        m208486B0(wyb0Var, act, false, false, null, 14, null);
    }

    /* JADX INFO: renamed from: q */
    public static void m208521q(wyb0 wyb0Var, boolean z) {
        if (z) {
            wyb0Var.m208555e0();
        } else {
            wyb0Var.m208554d0();
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m208523s(wyb0 wyb0Var, uxj0 uxj0Var) {
        wyb0Var.m208541L();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s0 */
    public static final void m208524s0() {
        INSTANCE.m208580n();
    }

    /* JADX INFO: renamed from: u */
    public static Unit m208526u(Function1 function1, final Act act, boolean z, final wyb0 wyb0Var, boolean z2) {
        function1.invoke(Boolean.valueOf(z2));
        if (!z2) {
            pb1.m171472b().mo171476e(f191595q);
            act.progress(R$string.f18632L5, true);
            act.duringCreated(CoreModule.f18264c.f20415p1.m31058z3(INSTANCE.m208578l() <= 0, z)).subscribe(psd0.m173597H(new y20() { // from class: l.eyb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.m208512l0(act, wyb0Var, (Pair) obj);
                }
            }, new y20() { // from class: l.fyb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.m208514m0(act, wyb0Var, (Throwable) obj);
                }
            }));
            CoreModule.f18264c.f20297C0.m146425v4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static C22421c m208527v(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m208528w(Throwable th) {
    }

    /* JADX INFO: renamed from: x */
    public static C22421c m208529x(String str, User user) {
        return CoreModule.f18264c.f20384f0.m33905ap(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m208530y(wyb0 wyb0Var, Throwable th) {
        wyb0Var.m208541L();
        wyb0Var.m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: y0 */
    public static final void m208531y0(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull x20 x20Var, @NotNull x20 x20Var2) {
        INSTANCE.m208582p(act, purchaseType, x20Var, x20Var2);
    }

    @Deprecated
    @JvmOverloads
    /* JADX INFO: renamed from: A0 */
    public final void m208533A0(@NotNull Act act, boolean isResume, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        act.getClass();
        onIntercept.getClass();
        m208534C0(act, isResume, showTanTanCoinGuide, onIntercept);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m208534C0(@NotNull Act act, boolean isResume, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        act.getClass();
        onIntercept.getClass();
        pb1.m171472b().mo171477f(f191595q, AudioBusinessType.QUICK_CHAT, new C21206c(act, isResume, showTanTanCoinGuide, onIntercept));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m208535D0() {
        if (m208549Y()) {
            pb1.m171472b().mo171476e(f191595q);
            m208565x0();
            m208536E0().subscribe(psd0.m173597H(new y20() { // from class: l.oyb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.m208523s(this.f149784a, (uxj0) obj);
                }
            }, new y20() { // from class: l.pyb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.m208530y(this.f154626a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final C22421c<uxj0> m208536E0() {
        C22421c<uxj0> c22421cM31057y3 = CoreModule.f18264c.f20415p1.m31057y3();
        c22421cM31057y3.getClass();
        return c22421cM31057y3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m208537H() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (this.isShowGuide) {
            return false;
        }
        Long l2 = this.showGuideTime.get();
        l2.getClass();
        return !pzi0.m174439D(l2.longValue()) || (userM116600p9.isFemale() && this.showGuideCount.get().intValue() < 2 && this.rejectGuideCount.get().intValue() < 1) || (!userM116600p9.isFemale() && this.showGuideCount.get().intValue() < 3 && this.rejectGuideCount.get().intValue() < 2);
    }

    /* JADX INFO: renamed from: I */
    public final void m208538I() {
        this.clickLock = false;
    }

    /* JADX INFO: renamed from: J */
    public final void m208539J() {
        psd0.m173633z(this.statusSub);
        psd0.m173633z(this.appForegroundSub);
        this.onlineMatchTimer.m51471d();
    }

    /* JADX INFO: renamed from: K */
    public final void m208540K() {
        vxd0 vxd0Var = this.rejectGuideCount;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.showGuideTime.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: L */
    public final void m208541L() {
        Activity activity = Act.foreground_().f16062a.get();
        if (activity != null) {
            ((Act) activity).progressDismiss();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m208542M(@NotNull final Act act, @NotNull final String userId) {
        act.getClass();
        userId.getClass();
        m208559q0();
        C22421c c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20415p1.m31050r3(userId));
        final Function1 function1 = new Function1() { // from class: l.kyb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wyb0.m208529x(userId, (User) obj);
            }
        };
        c22421cDuringCreated.flatMap(new qcj() { // from class: l.lyb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wyb0.m208527v(function1, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.myb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208510k(act, userId, this, (uxj0) obj);
            }
        }, new y20() { // from class: l.nyb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208500d((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final CoreAudioMatch.AudioMatchStatus m208543P() {
        Object obj = this.audioMatchStatusBehaviorSubject.m222761e().first;
        obj.getClass();
        return (CoreAudioMatch.AudioMatchStatus) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter */
    public final String getVoicechat_results() {
        return this.voicechat_results;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getClickLock() {
        return this.clickLock;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m208546U(boolean isPermission) {
        return m208547V(isPermission, false);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m208547V(boolean isPermission, boolean isGuide) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            return true;
        }
        if (!jpd0.m146488c()) {
            jpd0.m146489d();
            return true;
        }
        if ((isPermission && !PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) || CoreModule.m30934Q().mo68436Zo().mo136897a() || w1n0.m204458e() || CoreModule.m30930K().mo31725Qf()) {
            return true;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.age.intValue() < 18) {
            return true;
        }
        if (isGuide) {
            return false;
        }
        Companion companion = INSTANCE;
        if (companion.m208578l() <= 0) {
            return userM116600p9.isFemale() || joa.m146386f4() || companion.m208579m() <= 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m208548W() {
        return m208543P() == CoreAudioMatch.AudioMatchStatus.PAUSED;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m208549Y() {
        return m208543P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m208550Z(@NotNull String userId) {
        userId.getClass();
        return f191594p.get().contains(userId);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m208551a0() {
        this.clickLock = true;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final C22421c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> m208552b0() {
        C22421c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22421cDistinctUntilChanged = this.audioMatchStatusBehaviorSubject.asObservable().distinctUntilChanged();
        c22421cDistinctUntilChanged.getClass();
        return c22421cDistinctUntilChanged;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m208553c0(@NotNull Activity act) {
        act.getClass();
        if (act instanceof DropDownAct) {
            DropDownAct dropDownAct = (DropDownAct) act;
            if (!dropDownAct.m55641o2()) {
                dropDownAct.finishWithoutCustomAnimation();
            }
        }
        if (act instanceof QuickChatSearchingAct) {
            ((QuickChatSearchingAct) act).lambda$debugItems$19();
        }
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m208554d0() {
        if (m208549Y()) {
            m208556h0();
            m208562u0(CoreAudioMatch.AudioMatchStatus.PAUSED, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m208555e0() {
        Activity activity;
        if (!m208548W() || (activity = Act.foreground_().f16062a.get()) == null) {
            return;
        }
        m208486B0(this, (Act) activity, true, false, null, 12, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final C22421c<uxj0> m208556h0() {
        C22421c<uxj0> c22421cM31056x3 = CoreModule.f18264c.f20415p1.m31056x3();
        c22421cM31056x3.getClass();
        return c22421cM31056x3;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final C22421c<Integer> m208557j0(@NotNull String userId) {
        userId.getClass();
        C22421c<pf60<Integer, Boolean>> c22421cDoOnError = CoreModule.f18264c.f20384f0.m34064no(userId).doOnError(new y20() { // from class: l.wxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208528w((Throwable) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.xxb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wyb0.m208498b((pf60) obj);
            }
        };
        C22421c map = c22421cDoOnError.map(new qcj() { // from class: l.yxb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wyb0.m208517o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m208558k0(final Act act, final boolean isResume, boolean showTanTanCoinGuide, final Function1<? super Boolean, Unit> onIntercept) {
        m208561t0(act, showTanTanCoinGuide, new Function1() { // from class: l.rxb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wyb0.m208526u(onIntercept, act, isResume, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m208559q0() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20312H0.m155449k5();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m208560r0() {
        C22421c<Act.C4450r> c22421cForeground = Act.foreground();
        final Function1 function1 = new Function1() { // from class: l.sxb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wyb0.m208513m((Act.C4450r) obj);
            }
        };
        this.appForegroundSub = c22421cForeground.map(new qcj() { // from class: l.txb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wyb0.m208502f(function1, obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.uxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208521q(this.f181421a, ((Boolean) obj).booleanValue());
            }
        }, new y20() { // from class: l.vxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                wyb0.m208519p((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m208561t0(@NotNull final Act act, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        String str;
        act.getClass();
        onIntercept.getClass();
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165640n(R$string.f19605r4);
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (!jpd0.m146488c()) {
            jpd0.m146489d();
            o1j0.m165637k(act.getString(R$string.f19599qt), true);
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (!PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81074i(act);
            this.voicechat_results = "microphone";
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (pb1.m171472b().mo171474c() == AudioBusinessType.CHAT_ROOM_WINDOW || w1n0.m204458e() || CoreModule.m30930K().mo31725Qf()) {
            o1j0.m165636j("当前正在语音中哦");
            this.voicechat_results = "invoice";
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.age.intValue() < 18) {
            o1j0.m165636j("年龄未满18岁");
            this.voicechat_results = SeeTextDynamicParam.age;
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        Companion companion = INSTANCE;
        if (companion.m208578l() <= 0) {
            if (userM116600p9.isFemale() && !spl0.m187384j()) {
                gs50.INSTANCE.m132001a().m131994I(act, "use_up", true);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            }
            if (act instanceof DropDownAct) {
                DropDownAct dropDownAct = (DropDownAct) act;
                str = "p_quickchat,voicechat_button";
                if (!dropDownAct.m55635h2()) {
                    if (dropDownAct.m55637k2()) {
                        str = "p_message,voicechat_entrance";
                    } else if (dropDownAct.m55641o2()) {
                        str = "p_quickchat_party,voicechat";
                    } else if (dropDownAct.m55638l2()) {
                        str = "p_playground,voicechat";
                    } else if (dropDownAct.m55636i2()) {
                        str = "p_message,voicechat_pop_guide";
                    }
                }
            } else {
                str = !TextUtils.isEmpty(this.mVasFrom) ? this.mVasFrom : "p_audio_explore_recommend,e_voicechat,click";
            }
            String str2 = str;
            this.mVasFrom = "";
            if (joa.m146386f4()) {
                C8927c.m54567D0(act, str2, Privilege.online_match_tickets, null, null, 0, null, null, null, null, false, false, 4088, null);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            } else if (companion.m208579m() <= 0) {
                a5i0.m96186z1(act, str2, null, null);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            } else if (showTanTanCoinGuide && a5i0.m96160p0().m96222k1() && !(act instanceof QuickChatSearchingAct)) {
                a5i0.m96085B1(act, PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.cyb0
                    @Override // p153l.x20
                    public final void call() {
                        wyb0.m208515n(this.f84348a, act);
                    }
                }, new x20() { // from class: l.dyb0
                    @Override // p153l.x20
                    public final void call() {
                        wyb0.m208506h();
                    }
                });
                onIntercept.invoke(Boolean.TRUE);
                return;
            }
        }
        this.voicechat_results = "trystart";
        onIntercept.invoke(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m208562u0(@NotNull CoreAudioMatch.AudioMatchStatus audioMatchStatus, @Nullable Object any) {
        audioMatchStatus.getClass();
        this.audioMatchStatusBehaviorSubject.onNext(new Pair<>(audioMatchStatus, any));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m208563v0(@NotNull String str) {
        str.getClass();
        this.mVasFrom = str;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m208564w0() {
        this.isShowGuide = true;
        Long l2 = this.showGuideTime.get();
        l2.getClass();
        boolean zM174439D = pzi0.m174439D(l2.longValue());
        vxd0 vxd0Var = this.showGuideCount;
        if (zM174439D) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            vxd0Var.put(1);
            this.rejectGuideCount.put(0);
        }
        this.showGuideTime.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m208565x0() {
        Activity activity = Act.foreground_().f16062a.get();
        if (activity != null) {
            ((Act) activity).progress(R$string.f18632L5, true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m208566z0(@NotNull String userId) {
        userId.getClass();
        xyd0 xyd0Var = f191594p;
        HashSet<String> hashSet = xyd0Var.get();
        hashSet.add(userId);
        xyd0Var.put(hashSet);
    }

    /* JADX INFO: renamed from: l.wyb0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0007¢\u0006\u0004\b%\u0010&R \u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\u0006R\u0014\u0010+\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0018\u00105\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0004078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, m88121d2 = {"Ll/wyb0$a;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "Ll/wyb0;", "f", "()Ll/wyb0;", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "", "j", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "", "n", "userId", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Z", "Ll/x20;", "action0", "Landroid/app/Activity;", SocialConstants.PARAM_ACT, "k", "(Ll/x20;Landroid/app/Activity;)Z", "", BLiveStormDanmakuGiftResourceType.f45292l, "()I", "m", "o", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", BLiveVoiceSingTogehterState.confirm, "cancel", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ll/x20;Ll/x20;)V", "QUICK_QUDIO_VOICE_BUSINESS_TAG", "Ljava/lang/String;", "g", "getQUICK_QUDIO_VOICE_BUSINESS_TAG$annotations", "VOICECHAT_NOT_USE", "I", "USER_PHOTO_NOT_VER", "USER_FAKE", "USER_NAME_NOT_VER", "USER_NO_PRIVILEGE", "NOT_ARRIVED_VOICECHAT_TIME", "VOICECHAT_SEARCHING", "QUICKCHAT_SEARCHING", "PHONE_NOT_BIND", "instance", "Ll/wyb0;", "", "needCheckPermissions", "[Ljava/lang/String;", "Ll/xyd0;", "showTipSets", "Ll/xyd0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m208567a(x20 x20Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            if (x20Var == null || !z) {
                return;
            }
            x20Var.call();
        }

        /* JADX INFO: renamed from: b */
        public static void m208568b(CompoundButton compoundButton, boolean z) {
            compoundButton.getClass();
            a5i0.m96160p0().m96213b1(z);
        }

        /* JADX INFO: renamed from: c */
        public static void m208569c(PurchaseType purchaseType, boolean[] zArr, x20 x20Var, ugy ugyVar) {
            a5i0.m96110M1(purchaseType);
            zArr[0] = false;
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m208570d(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
            if (zArr[0] && NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m208571e(boolean[] zArr, x20 x20Var, ugy ugyVar) {
            zArr[0] = true;
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: f */
        public final wyb0 m208572f() {
            wyb0 wyb0Var;
            wyb0 wyb0Var2 = wyb0.f191592n;
            if (wyb0Var2 != null) {
                return wyb0Var2;
            }
            synchronized (this) {
                wyb0Var = wyb0.f191592n;
                if (wyb0Var == null) {
                    wyb0Var = new wyb0(null);
                    wyb0.f191592n = wyb0Var;
                }
            }
            return wyb0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m208573g() {
            return wyb0.f191595q;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public final String m208574h() {
            return m208573g();
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final boolean m208575i(@NotNull String userId) {
            userId.getClass();
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userId);
            if (userM116503Pa == null) {
                return false;
            }
            return userM116503Pa.onlineMatchLocked();
        }

        @JvmStatic
        /* JADX INFO: renamed from: j */
        public final boolean m208576j(@NotNull Conversation conv) {
            conv.getClass();
            return NullChecker.m82486a(conv.property) && NullChecker.m82486a(conv.property.quickchat) && TextUtils.equals(conv.property.quickchat.category, "voice");
        }

        @JvmStatic
        /* JADX INFO: renamed from: k */
        public final boolean m208577k(@Nullable final x20 action0, @NotNull Activity act) {
            act.getClass();
            String[] strArr = wyb0.f191593o;
            if (PermissionHelper.m81064b((String[]) Arrays.copyOf(strArr, strArr.length))) {
                return false;
            }
            PermissionHelper.C13291a c13291aM81065c = PermissionHelper.m81065c();
            String[] strArr2 = wyb0.f191593o;
            c13291aM81065c.m81083r((String[]) Arrays.copyOf(strArr2, strArr2.length)).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.vyb0
                @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
                /* JADX INFO: renamed from: a */
                public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    wyb0.Companion.m208567a(action0, z, permissionDeniedReason);
                }
            }).m81074i(act);
            return true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final int m208578l() {
            UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("voiceQuickchatNum"));
            if (NullChecker.m82486a(userPrivilegeM146426x4)) {
                return userPrivilegeM146426x4.content.remaining;
            }
            return 0;
        }

        @JvmStatic
        /* JADX INFO: renamed from: m */
        public final int m208579m() {
            return m208578l() + a5i0.m96129b0();
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m208580n() {
            wyb0 wyb0Var = wyb0.f191592n;
            if (wyb0Var != null) {
                wyb0Var.m208539J();
            }
            wyb0.f191592n = null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: o */
        public final void m208581o(@NotNull String userId) {
            userId.getClass();
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            messageNew_.value = "语音闪聊配对成功，开启你们的聊天吧";
            CoreModule.f18264c.f20384f0.m33626Dn(userId, messageNew_, null).subscribe(psd0.m173591B());
        }

        @JvmStatic
        /* JADX INFO: renamed from: p */
        public final void m208582p(@NotNull Act act, @NotNull final PurchaseType type, @NotNull final x20 confirm, @NotNull final x20 cancel) {
            act.getClass();
            type.getClass();
            confirm.getClass();
            cancel.getClass();
            int iM155450l4 = CoreModule.f18264c.f20312H0.m155450l4();
            final boolean[] zArr = {true};
            l4g0 l4g0VarM96112N1 = a5i0.m96112N1(type);
            ugy.C20573a c20573aM195995D = new ugy.C20573a(act).m195995D("语音闪聊");
            int i = R$string.f18982Wp;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ugy ugyVarM195998t = c20573aM195995D.m195994C(q8g0.m175782N(act.getString(i, String.format(Locale.getDefault(), " %d ", Arrays.copyOf(new Object[]{Integer.valueOf(iM155450l4)}, 1))), Color.parseColor("#ff5435"), lyh0.m156283c(2)).append((CharSequence) "\r\n").append((CharSequence) "语音闪聊用完了，可以用探探币购买更多")).m195996r("https://auto.tancdn.com/v1/raw/a55966de-3b5d-45e5-9c7f-3560d6843d0b10.pdf", 1).m195997s(dbc0.f87193lo).m196002x(act.string(R$string.f19012Xp), new y20() { // from class: l.ryb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.Companion.m208569c(type, zArr, confirm, (ugy) obj);
                }
            }).m196000v(act.string(R$string.f19138c), new y20() { // from class: l.syb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wyb0.Companion.m208571e(zArr, cancel, (ugy) obj);
                }
            }).m196004z(a5i0.m96160p0().m96203R1()).m196001w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.tyb0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    wyb0.Companion.m208568b(compoundButton, z);
                }
            }).m195993B(new DialogInterface.OnDismissListener() { // from class: l.uyb0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    wyb0.Companion.m208570d(zArr, cancel, dialogInterface);
                }
            }).m195998t();
            ugyVarM195998t.getClass();
            ugyVarM195998t.m195973m(l4g0VarM96112N1);
            ugyVarM195998t.m195974n();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m208518o0() {
    }

    public /* synthetic */ wyb0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
