package p149l;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8610b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.apache.commons.codec.language.p122bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 w2\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003JA\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J!\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010%J?\u0010'\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b'\u0010\u0018JA\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015H\u0007¢\u0006\u0004\b(\u0010\u0018J\u001d\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J3\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00042\u0006\u00105\u001a\u000204¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00072\u0006\u00105\u001a\u000204¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010%J\r\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010\u0003J\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0012¢\u0006\u0004\bB\u0010%J\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0003J\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0003R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u001aR(\u0010K\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00108R\"\u0010]\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010;R\"\u0010a\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010;R\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00108R\"\u0010e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u00108\u001a\u0004\be\u0010%\"\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010s\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010v\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bt\u0010j\u001a\u0004\bu\u0010l¨\u0006x"}, m87232d2 = {"Ll/sqb0;", "", "<init>", "()V", "", "x0", "L", "Lrx/c;", "Ll/roj0;", "E0", "()Lrx/c;", "h0", "d0", "e0", "r0", "q0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "isResume", "showTanTanCoinGuide", "Lkotlin/Function1;", "onIntercept", "k0", "(Lcom/p1/mobile/android/app/Act;ZZLkotlin/jvm/functions/Function1;)V", "D0", "J", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;", "b0", "audioMatchStatus", Languages.ANY, "u0", "(Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;Ljava/lang/Object;)V", "P", "()Lcom/p1/mobile/putong/core/api/CoreAudioMatch$AudioMatchStatus;", "Y", "()Z", "W", "C0", "A0", "isPermission", "isGuide", j6f.GPS_MEASUREMENT_INTERRUPTED, "(ZZ)Z", "U", "(Z)Z", "t0", "(Lcom/p1/mobile/android/app/Act;ZLkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "c0", "(Landroid/app/Activity;)V", "", "userId", "M", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Z", "(Ljava/lang/String;)Z", "z0", "(Ljava/lang/String;)V", "", "j0", "(Ljava/lang/String;)Lrx/c;", j6f.GPS_DIRECTION_TRUE, "a0", "I", "H", "w0", "K", "", "a", "limitTime", "Lrx/subjects/a;", "b", "Lrx/subjects/a;", "audioMatchStatusBehaviorSubject", "Ll/c4g0;", "c", "Ll/c4g0;", "appForegroundSub", Constants.INAPP_DATA_TAG, "statusSub", "Lcom/p1/mobile/putong/core/ui/onlinematch/b;", "e", "Lcom/p1/mobile/putong/core/ui/onlinematch/b;", "onlineMatchTimer", "f", "isInSearchingAction", "g", "Ljava/lang/String;", "R", "()Ljava/lang/String;", "setVoicechat_results", "voicechat_results", "h", "getMVasFrom", "v0", "mVasFrom", RXScreenCaptureService.KEY_INDEX, "clickLock", "j", "isShowGuide", "setShowGuide", "(Z)V", "Ll/tpd0;", "k", "Ll/tpd0;", "getShowGuideCount", "()Ll/tpd0;", "showGuideCount", "Ll/zpd0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/zpd0;", "getShowGuideTime", "()Ll/zpd0;", "showGuideTime", "m", "getRejectGuideCount", "rejectGuideCount", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sqb0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public static volatile sqb0 f165952n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long limitTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Pair<CoreAudioMatch.AudioMatchStatus, Object>> audioMatchStatusBehaviorSubject;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public c4g0 appForegroundSub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public c4g0 statusSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C8610b onlineMatchTimer;

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
    public final tpd0 showGuideCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final zpd0 showGuideTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final tpd0 rejectGuideCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final String[] f165953o = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final vqd0 f165954p = new vqd0("quickaudio_sets_" + CoreModule.m29931H().userId(), new HashSet());

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final String f165955q = sqb0.class.getSimpleName();

    /* JADX INFO: renamed from: l.sqb0$b */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C20014b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f165969a;

        static {
            int[] iArr = new int[CoreAudioMatch.AudioMatchStatus.values().length];
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.SEARCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f165969a = iArr;
        }
    }

    /* JADX INFO: renamed from: l.sqb0$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"l/sqb0$c", "Ll/z91;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/z91;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20015c implements z91 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f165971b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f165972c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f165973d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function1<Boolean, Unit> f165974e;

        /* JADX WARN: Multi-variable type inference failed */
        public C20015c(Act act, boolean z, boolean z2, Function1<? super Boolean, Unit> function1) {
            this.f165971b = act;
            this.f165972c = z;
            this.f165973d = z2;
            this.f165974e = function1;
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            businessKey.getClass();
            focusBusinessType.getClass();
            sqb0.this.m185540D0();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String currentBusinessKey, AudioBusinessType currentType, z91 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                osi0.m165783g(conflictBusinessType.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(currentBusinessKey, currentType, currentCallBack);
                sqb0.this.m185563k0(this.f165971b, this.f165972c, this.f165973d, this.f165974e);
            }
        }

        @Override // p149l.z91
        public void success() {
            sqb0.this.m185563k0(this.f165971b, this.f165972c, this.f165973d, this.f165974e);
        }
    }

    public sqb0() {
        this.limitTime = Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        C22392a<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22392aM221513c = C22392a.m221513c(new Pair(CoreAudioMatch.AudioMatchStatus.IDLE, new Object()));
        c22392aM221513c.getClass();
        this.audioMatchStatusBehaviorSubject = c22392aM221513c;
        this.onlineMatchTimer = new C8610b(new C8610b.a() { // from class: l.lpb0
            @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.C8610b.a
            /* JADX INFO: renamed from: a */
            public final void mo50289a() {
                sqb0.m185512i(this.f129188a);
            }
        }, Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        m185565r0();
        this.statusSub = m185557b0().subscribe(mkd0.m154956H(new e30() { // from class: l.wpb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185506e(this.f187502a, (Pair) obj);
            }
        }, new e30() { // from class: l.fqb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185490B((Throwable) obj);
            }
        }));
        this.voicechat_results = "trystart";
        this.mVasFrom = "";
        this.showGuideCount = new tpd0("quick_audio_guide_count_" + CoreModule.m29931H().userId(), 0);
        this.showGuideTime = new zpd0("quick_audio_guide_time_" + CoreModule.m29931H().userId(), 0L);
        this.rejectGuideCount = new tpd0("quick_audio_guide_reject_" + CoreModule.m29931H().userId(), 0);
    }

    /* JADX INFO: renamed from: B */
    public static void m185490B(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m185491B0(sqb0 sqb0Var, Act act, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: l.mpb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return sqb0.m185504c(((Boolean) obj2).booleanValue());
                }
            };
        }
        sqb0Var.m185538A0(act, z, z2, function1);
    }

    /* JADX INFO: renamed from: N */
    public static final void m185497N(Act act, String str, sqb0 sqb0Var) {
        Intent intentM48940e2 = MessagesAct.m48940e2(act, str, 31, vwb.m200311Y("ISCALLEER", "1"));
        intentM48940e2.getClass();
        if ((act instanceof DropDownAct) && ((DropDownAct) act).m54458n2()) {
            act.startActivityForResult(intentM48940e2, 1911);
        } else if (act instanceof QuickChatSearchingAct) {
            act.startActivity(intentM48940e2);
        } else {
            act.startActivity(intentM48940e2);
        }
        INSTANCE.m185586o(str);
        sqb0Var.m185558c0(act);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final sqb0 m185498O() {
        return INSTANCE.m185577f();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Q */
    public static final String m185499Q() {
        return INSTANCE.m185579h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: S */
    public static final boolean m185500S(@NotNull String str) {
        return INSTANCE.m185580i(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m185501X(@NotNull Conversation conversation) {
        return INSTANCE.m185581j(conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Integer m185503b(j760 j760Var) {
        return (Integer) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m185504c(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m185505d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m185506e(sqb0 sqb0Var, Pair pair) {
        CoreAudioMatch.AudioMatchStatus audioMatchStatus = (CoreAudioMatch.AudioMatchStatus) pair.first;
        if ((audioMatchStatus == null ? -1 : C20014b.f165969a[audioMatchStatus.ordinal()]) != 1) {
            sqb0Var.onlineMatchTimer.m50288d();
            sqb0Var.isInSearchingAction = false;
        } else {
            if (!sqb0Var.isInSearchingAction) {
                sqb0Var.onlineMatchTimer.m50287c();
            }
            sqb0Var.isInSearchingAction = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m185507f(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m185508f0(sqb0 sqb0Var, roj0 roj0Var) {
        sqb0Var.m185546L();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.TIMEOUT);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m185510g0(sqb0 sqb0Var, Throwable th) {
        sqb0Var.m185546L();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.TIMEOUT);
    }

    /* JADX INFO: renamed from: h */
    public static void m185511h() {
    }

    /* JADX INFO: renamed from: i */
    public static void m185512i(final sqb0 sqb0Var) {
        sqb0Var.m185570x0();
        sqb0Var.m185541E0().subscribe(mkd0.m154956H(new e30() { // from class: l.vpb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185508f0(this.f182464a, (roj0) obj);
            }
        }, new e30() { // from class: l.xpb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185510g0(this.f193908a, (Throwable) obj);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i0 */
    public static final int m185513i0() {
        return INSTANCE.m185583l();
    }

    /* JADX INFO: renamed from: k */
    public static void m185515k(final Act act, final String str, final sqb0 sqb0Var, roj0 roj0Var) {
        e51.m114743H(act, new Runnable() { // from class: l.mqb0
            @Override // java.lang.Runnable
            public final void run() {
                sqb0.m185497N(act, str, sqb0Var);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m185517l0(Act act, sqb0 sqb0Var, Pair pair) {
        act.progressDismiss();
        if (NullChecker.m81303a(pair)) {
            pair.getClass();
            if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                CoreModule.f17545c.f19663m0.m31002G8((String) pair.first);
                sqb0Var.m185564q0();
                sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.MATCHED, pair.first);
                return;
            }
        }
        sqb0Var.m185564q0();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.SEARCHING, null);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m185518m(Act.C4299r c4299r) {
        return c4299r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m81303a(c4299r.f15343a.get()));
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m185519m0(final Act act, final sqb0 sqb0Var, Throwable th) {
        th.getClass();
        ib1.m135233b().mo135237e(f165955q);
        act.progressDismiss();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.ERROR, CoreAudioMatch.AudioMatchError.NETWORK);
        if (th instanceof TantanException.Client.TantanForbidden) {
            switch (((TantanException.Client.TantanForbidden) th).subCode) {
                case 600103:
                    lsi0.m151580j("语音闪聊暂不可用");
                    break;
                case 600104:
                    lsi0.m151580j("由于头像不真实，你将暂时无法使用语音闪聊，快去换个新头像吧");
                    break;
                case 600105:
                    lsi0.m151580j("由于涉及广告，你已被封禁");
                    break;
                case 600107:
                    new xh0.C21150a(act).m208740s("请完善资料哦").m208731j("为了保证语音闪聊的真实性，请先去完成真人实名认证").m208727f("暂不认证").m208739r("去认证").m208736o(new View.OnClickListener() { // from class: l.cqb0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sqb0.m185521n0(act, view);
                        }
                    }).m208722a().m208721g();
                    break;
                case 600108:
                    lsi0.m151580j("无会员特权，语音闪聊暂不可用");
                    break;
                case 600109:
                    lsi0.m151580j("未到语音闪聊开放时间内");
                    break;
                case 600111:
                    ark.m98441P0(act, "", new d30() { // from class: l.dqb0
                        @Override // p149l.d30
                        public final void call() {
                            sqb0.m185523o0();
                        }
                    }, false, false, new d30() { // from class: l.eqb0
                        @Override // p149l.d30
                        public final void call() {
                            sqb0.m185525p0(this.f92766a, act);
                        }
                    });
                    break;
                case 600201:
                    lsi0.m151580j("正在语音闪聊匹配中");
                    break;
                case 600202:
                    lsi0.m151580j("正在在线闪聊匹配中");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m185520n(sqb0 sqb0Var, Act act) {
        swh0.m186255p0().m186306Z0();
        m185491B0(sqb0Var, act, false, false, null, 10, null);
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m185521n0(Act act, View view) {
        zbi0.m217855D(act);
    }

    /* JADX INFO: renamed from: o */
    public static Integer m185522o(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static void m185524p(Throwable th) {
        th.getClass();
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m185525p0(sqb0 sqb0Var, Act act) {
        m185491B0(sqb0Var, act, false, false, null, 14, null);
    }

    /* JADX INFO: renamed from: q */
    public static void m185526q(sqb0 sqb0Var, boolean z) {
        if (z) {
            sqb0Var.m185560e0();
        } else {
            sqb0Var.m185559d0();
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m185528s(sqb0 sqb0Var, roj0 roj0Var) {
        sqb0Var.m185546L();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: s0 */
    public static final void m185529s0() {
        INSTANCE.m185585n();
    }

    /* JADX INFO: renamed from: u */
    public static Unit m185531u(Function1 function1, final Act act, boolean z, final sqb0 sqb0Var, boolean z2) {
        function1.invoke(Boolean.valueOf(z2));
        if (!z2) {
            ib1.m135233b().mo135237e(f165955q);
            act.progress(R$string.f17842J5, true);
            act.duringCreated(CoreModule.f17545c.f19673p1.m30060z3(INSTANCE.m185583l() <= 0, z)).subscribe(mkd0.m154956H(new e30() { // from class: l.aqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.m185517l0(act, sqb0Var, (Pair) obj);
                }
            }, new e30() { // from class: l.bqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.m185519m0(act, sqb0Var, (Throwable) obj);
                }
            }));
            CoreModule.f17545c.f19555C0.m210112u4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static C22306c m185532v(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m185533w(Throwable th) {
    }

    /* JADX INFO: renamed from: x */
    public static C22306c m185534x(String str, User user) {
        return CoreModule.f17545c.f19642f0.m32902ap(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m185535y(sqb0 sqb0Var, Throwable th) {
        sqb0Var.m185546L();
        sqb0Var.m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: y0 */
    public static final void m185536y0(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull d30 d30Var, @NotNull d30 d30Var2) {
        INSTANCE.m185587p(act, purchaseType, d30Var, d30Var2);
    }

    @Deprecated
    @JvmOverloads
    /* JADX INFO: renamed from: A0 */
    public final void m185538A0(@NotNull Act act, boolean isResume, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        act.getClass();
        onIntercept.getClass();
        m185539C0(act, isResume, showTanTanCoinGuide, onIntercept);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m185539C0(@NotNull Act act, boolean isResume, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        act.getClass();
        onIntercept.getClass();
        ib1.m135233b().mo135238f(f165955q, AudioBusinessType.QUICK_CHAT, new C20015c(act, isResume, showTanTanCoinGuide, onIntercept));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m185540D0() {
        if (m185554Y()) {
            ib1.m135233b().mo135237e(f165955q);
            m185570x0();
            m185541E0().subscribe(mkd0.m154956H(new e30() { // from class: l.kqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.m185528s(this.f124251a, (roj0) obj);
                }
            }, new e30() { // from class: l.lqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.m185535y(this.f129309a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final C22306c<roj0> m185541E0() {
        C22306c<roj0> c22306cM30059y3 = CoreModule.f17545c.f19673p1.m30059y3();
        c22306cM30059y3.getClass();
        return c22306cM30059y3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m185542H() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (this.isShowGuide) {
            return false;
        }
        Long l2 = this.showGuideTime.get();
        l2.getClass();
        return !mqi0.m155929D(l2.longValue()) || (userM169527p9.isFemale() && this.showGuideCount.get().intValue() < 2 && this.rejectGuideCount.get().intValue() < 1) || (!userM169527p9.isFemale() && this.showGuideCount.get().intValue() < 3 && this.rejectGuideCount.get().intValue() < 2);
    }

    /* JADX INFO: renamed from: I */
    public final void m185543I() {
        this.clickLock = false;
    }

    /* JADX INFO: renamed from: J */
    public final void m185544J() {
        mkd0.m154992z(this.statusSub);
        mkd0.m154992z(this.appForegroundSub);
        this.onlineMatchTimer.m50288d();
    }

    /* JADX INFO: renamed from: K */
    public final void m185545K() {
        tpd0 tpd0Var = this.rejectGuideCount;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.showGuideTime.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: L */
    public final void m185546L() {
        Activity activity = Act.foreground_().f15343a.get();
        if (activity != null) {
            ((Act) activity).progressDismiss();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m185547M(@NotNull final Act act, @NotNull final String userId) {
        act.getClass();
        userId.getClass();
        m185564q0();
        C22306c c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19673p1.m30052r3(userId));
        final Function1 function1 = new Function1() { // from class: l.gqb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqb0.m185534x(userId, (User) obj);
            }
        };
        c22306cDuringCreated.flatMap(new w9j() { // from class: l.hqb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sqb0.m185532v(function1, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.iqb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185515k(act, userId, this, (roj0) obj);
            }
        }, new e30() { // from class: l.jqb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185505d((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final CoreAudioMatch.AudioMatchStatus m185548P() {
        Object obj = this.audioMatchStatusBehaviorSubject.m221515e().first;
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
    public final boolean m185551U(boolean isPermission) {
        return m185552V(isPermission, false);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m185552V(boolean isPermission, boolean isGuide) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            return true;
        }
        if (!ghd0.m126179c()) {
            ghd0.m126180d();
            return true;
        }
        if ((isPermission && !PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) || CoreModule.m29936Q().mo67253Zo().mo111890a() || ssm0.m185761e() || CoreModule.m29932K().mo30722Qf()) {
            return true;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.age.intValue() < 18) {
            return true;
        }
        if (isGuide) {
            return false;
        }
        Companion companion = INSTANCE;
        if (companion.m185583l() <= 0) {
            return userM169527p9.isFemale() || xma.m210071e4() || companion.m185584m() <= 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m185553W() {
        return m185548P() == CoreAudioMatch.AudioMatchStatus.PAUSED;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m185554Y() {
        return m185548P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m185555Z(@NotNull String userId) {
        userId.getClass();
        return f165954p.get().contains(userId);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m185556a0() {
        this.clickLock = true;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final C22306c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> m185557b0() {
        C22306c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22306cDistinctUntilChanged = this.audioMatchStatusBehaviorSubject.asObservable().distinctUntilChanged();
        c22306cDistinctUntilChanged.getClass();
        return c22306cDistinctUntilChanged;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m185558c0(@NotNull Activity act) {
        act.getClass();
        if (act instanceof DropDownAct) {
            DropDownAct dropDownAct = (DropDownAct) act;
            if (!dropDownAct.m54458n2()) {
                dropDownAct.finishWithoutCustomAnimation();
            }
        }
        if (act instanceof QuickChatSearchingAct) {
            ((QuickChatSearchingAct) act).lambda$debugItems$19();
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m185559d0() {
        if (m185554Y()) {
            m185561h0();
            m185567u0(CoreAudioMatch.AudioMatchStatus.PAUSED, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m185560e0() {
        Activity activity;
        if (!m185553W() || (activity = Act.foreground_().f15343a.get()) == null) {
            return;
        }
        m185491B0(this, (Act) activity, true, false, null, 12, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final C22306c<roj0> m185561h0() {
        C22306c<roj0> c22306cM30058x3 = CoreModule.f17545c.f19673p1.m30058x3();
        c22306cM30058x3.getClass();
        return c22306cM30058x3;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final C22306c<Integer> m185562j0(@NotNull String userId) {
        userId.getClass();
        C22306c<j760<Integer, Boolean>> c22306cDoOnError = CoreModule.f17545c.f19642f0.m33061no(userId).doOnError(new e30() { // from class: l.spb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185533w((Throwable) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.tpb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqb0.m185503b((j760) obj);
            }
        };
        C22306c map = c22306cDoOnError.map(new w9j() { // from class: l.upb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sqb0.m185522o(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m185563k0(final Act act, final boolean isResume, boolean showTanTanCoinGuide, final Function1<? super Boolean, Unit> onIntercept) {
        m185566t0(act, showTanTanCoinGuide, new Function1() { // from class: l.npb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqb0.m185531u(onIntercept, act, isResume, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m185564q0() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19570H0.m210361k5();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m185565r0() {
        C22306c<Act.C4299r> c22306cForeground = Act.foreground();
        final Function1 function1 = new Function1() { // from class: l.opb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqb0.m185518m((Act.C4299r) obj);
            }
        };
        this.appForegroundSub = c22306cForeground.map(new w9j() { // from class: l.ppb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sqb0.m185507f(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.qpb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185526q(this.f155742a, ((Boolean) obj).booleanValue());
            }
        }, new e30() { // from class: l.rpb0
            @Override // p149l.e30
            public final void call(Object obj) {
                sqb0.m185524p((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m185566t0(@NotNull final Act act, boolean showTanTanCoinGuide, @NotNull Function1<? super Boolean, Unit> onIntercept) {
        String str;
        act.getClass();
        onIntercept.getClass();
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151584n(R$string.f18813p4);
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (!ghd0.m126179c()) {
            ghd0.m126180d();
            lsi0.m151581k(act.getString(R$string.f18165Ts), true);
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (!PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79891i(act);
            this.voicechat_results = "microphone";
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        if (ib1.m135233b().mo135235c() == AudioBusinessType.CHAT_ROOM_WINDOW || ssm0.m185761e() || CoreModule.m29932K().mo30722Qf()) {
            lsi0.m151580j("当前正在语音中哦");
            this.voicechat_results = "invoice";
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.age.intValue() < 18) {
            lsi0.m151580j("年龄未满18岁");
            this.voicechat_results = SeeTextDynamicParam.age;
            onIntercept.invoke(Boolean.TRUE);
            return;
        }
        Companion companion = INSTANCE;
        if (companion.m185583l() <= 0) {
            if (userM169527p9.isFemale() && !ogl0.m164257j()) {
                ak50.INSTANCE.m97144a().m97137I(act, "use_up", true);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            }
            if (act instanceof DropDownAct) {
                DropDownAct dropDownAct = (DropDownAct) act;
                str = "p_quickchat,voicechat_button";
                if (!dropDownAct.m54452g2()) {
                    if (dropDownAct.m54454i2()) {
                        str = "p_message,voicechat_entrance";
                    } else if (dropDownAct.m54458n2()) {
                        str = "p_quickchat_party,voicechat";
                    } else if (dropDownAct.m54455k2()) {
                        str = "p_playground,voicechat";
                    } else if (dropDownAct.m54453h2()) {
                        str = "p_message,voicechat_pop_guide";
                    }
                }
            } else {
                str = !TextUtils.isEmpty(this.mVasFrom) ? this.mVasFrom : "p_audio_explore_recommend,e_voicechat,click";
            }
            String str2 = str;
            this.mVasFrom = "";
            if (xma.m210071e4()) {
                C8764c.m53384D0(act, str2, Privilege.online_match_tickets, null, null, 0, null, null, null, null, false, false, 4088, null);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            } else if (companion.m185584m() <= 0) {
                swh0.m186281z1(act, str2, null, null);
                this.voicechat_results = "usedup";
                onIntercept.invoke(Boolean.TRUE);
                return;
            } else if (showTanTanCoinGuide && swh0.m186255p0().m186317k1() && !(act instanceof QuickChatSearchingAct)) {
                swh0.m186180B1(act, PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.ypb0
                    @Override // p149l.d30
                    public final void call() {
                        sqb0.m185520n(this.f199422a, act);
                    }
                }, new d30() { // from class: l.zpb0
                    @Override // p149l.d30
                    public final void call() {
                        sqb0.m185511h();
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
    public final void m185567u0(@NotNull CoreAudioMatch.AudioMatchStatus audioMatchStatus, @Nullable Object any) {
        audioMatchStatus.getClass();
        this.audioMatchStatusBehaviorSubject.onNext(new Pair<>(audioMatchStatus, any));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m185568v0(@NotNull String str) {
        str.getClass();
        this.mVasFrom = str;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m185569w0() {
        this.isShowGuide = true;
        Long l2 = this.showGuideTime.get();
        l2.getClass();
        boolean zM155929D = mqi0.m155929D(l2.longValue());
        tpd0 tpd0Var = this.showGuideCount;
        if (zM155929D) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            tpd0Var.put(1);
            this.rejectGuideCount.put(0);
        }
        this.showGuideTime.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m185570x0() {
        Activity activity = Act.foreground_().f15343a.get();
        if (activity != null) {
            ((Act) activity).progress(R$string.f17842J5, true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m185571z0(@NotNull String userId) {
        userId.getClass();
        vqd0 vqd0Var = f165954p;
        HashSet<String> hashSet = vqd0Var.get();
        hashSet.add(userId);
        vqd0Var.put(hashSet);
    }

    /* JADX INFO: renamed from: l.sqb0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0007¢\u0006\u0004\b%\u0010&R \u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\u0006R\u0014\u0010+\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u00102\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0018\u00105\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0004078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, m87232d2 = {"Ll/sqb0$a;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "Ll/sqb0;", "f", "()Ll/sqb0;", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "", "j", "(Lcom/p1/mobile/putong/core/data/Conversation;)Z", "", "n", "userId", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Z", "Ll/d30;", "action0", "Landroid/app/Activity;", SocialConstants.PARAM_ACT, "k", "(Ll/d30;Landroid/app/Activity;)Z", "", BLiveStormDanmakuGiftResourceType.f44444l, "()I", "m", "o", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", BLiveVoiceSingTogehterState.confirm, "cancel", "p", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ll/d30;Ll/d30;)V", "QUICK_QUDIO_VOICE_BUSINESS_TAG", "Ljava/lang/String;", "g", "getQUICK_QUDIO_VOICE_BUSINESS_TAG$annotations", "VOICECHAT_NOT_USE", "I", "USER_PHOTO_NOT_VER", "USER_FAKE", "USER_NAME_NOT_VER", "USER_NO_PRIVILEGE", "NOT_ARRIVED_VOICECHAT_TIME", "VOICECHAT_SEARCHING", "QUICKCHAT_SEARCHING", "PHONE_NOT_BIND", "instance", "Ll/sqb0;", "", "needCheckPermissions", "[Ljava/lang/String;", "Ll/vqd0;", "showTipSets", "Ll/vqd0;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m185572a(d30 d30Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
            if (d30Var == null || !z) {
                return;
            }
            d30Var.call();
        }

        /* JADX INFO: renamed from: b */
        public static void m185573b(CompoundButton compoundButton, boolean z) {
            compoundButton.getClass();
            swh0.m186255p0().m186308b1(z);
        }

        /* JADX INFO: renamed from: c */
        public static void m185574c(PurchaseType purchaseType, boolean[] zArr, d30 d30Var, x7y x7yVar) {
            swh0.m186205M1(purchaseType);
            zArr[0] = false;
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m185575d(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
            if (zArr[0] && NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m185576e(boolean[] zArr, d30 d30Var, x7y x7yVar) {
            zArr[0] = true;
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: f */
        public final sqb0 m185577f() {
            sqb0 sqb0Var;
            sqb0 sqb0Var2 = sqb0.f165952n;
            if (sqb0Var2 != null) {
                return sqb0Var2;
            }
            synchronized (this) {
                sqb0Var = sqb0.f165952n;
                if (sqb0Var == null) {
                    sqb0Var = new sqb0(null);
                    sqb0.f165952n = sqb0Var;
                }
            }
            return sqb0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m185578g() {
            return sqb0.f165955q;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public final String m185579h() {
            return m185578g();
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final boolean m185580i(@NotNull String userId) {
            userId.getClass();
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userId);
            if (userM169430Pa == null) {
                return false;
            }
            return userM169430Pa.onlineMatchLocked();
        }

        @JvmStatic
        /* JADX INFO: renamed from: j */
        public final boolean m185581j(@NotNull Conversation conv) {
            conv.getClass();
            return NullChecker.m81303a(conv.property) && NullChecker.m81303a(conv.property.quickchat) && TextUtils.equals(conv.property.quickchat.category, "voice");
        }

        @JvmStatic
        /* JADX INFO: renamed from: k */
        public final boolean m185582k(@Nullable final d30 action0, @NotNull Activity act) {
            act.getClass();
            String[] strArr = sqb0.f165953o;
            if (PermissionHelper.m79881b((String[]) Arrays.copyOf(strArr, strArr.length))) {
                return false;
            }
            PermissionHelper.C13128a c13128aM79882c = PermissionHelper.m79882c();
            String[] strArr2 = sqb0.f165953o;
            c13128aM79882c.m79900r((String[]) Arrays.copyOf(strArr2, strArr2.length)).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.rqb0
                @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
                /* JADX INFO: renamed from: a */
                public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                    sqb0.Companion.m185572a(action0, z, permissionDeniedReason);
                }
            }).m79891i(act);
            return true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final int m185583l() {
            UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("voiceQuickchatNum"));
            if (NullChecker.m81303a(userPrivilegeM210113w4)) {
                return userPrivilegeM210113w4.content.remaining;
            }
            return 0;
        }

        @JvmStatic
        /* JADX INFO: renamed from: m */
        public final int m185584m() {
            return m185583l() + swh0.m186224b0();
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m185585n() {
            sqb0 sqb0Var = sqb0.f165952n;
            if (sqb0Var != null) {
                sqb0Var.m185544J();
            }
            sqb0.f165952n = null;
        }

        @JvmStatic
        /* JADX INFO: renamed from: o */
        public final void m185586o(@NotNull String userId) {
            userId.getClass();
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("text");
            messageNew_.value = "语音闪聊配对成功，开启你们的聊天吧";
            CoreModule.f17545c.f19642f0.m32623Dn(userId, messageNew_, null).subscribe(mkd0.m154950B());
        }

        @JvmStatic
        /* JADX INFO: renamed from: p */
        public final void m185587p(@NotNull Act act, @NotNull final PurchaseType type, @NotNull final d30 confirm, @NotNull final d30 cancel) {
            act.getClass();
            type.getClass();
            confirm.getClass();
            cancel.getClass();
            int iM210362l4 = CoreModule.f17545c.f19570H0.m210362l4();
            final boolean[] zArr = {true};
            cwf0 cwf0VarM186207N1 = swh0.m186207N1(type);
            x7y.C21039a c21039aM207345D = new x7y.C21039a(act).m207345D("语音闪聊");
            int i = R$string.f17622Bp;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            x7y x7yVarM207348t = c21039aM207345D.m207344C(i0g0.m133847N(act.getString(i, String.format(Locale.getDefault(), " %d ", Arrays.copyOf(new Object[]{Integer.valueOf(iM210362l4)}, 1))), Color.parseColor("#ff5435"), eqh0.m117752c(2)).append((CharSequence) "\r\n").append((CharSequence) "语音闪聊用完了，可以用探探币购买更多")).m207346r("https://auto.tancdn.com/v1/raw/a55966de-3b5d-45e5-9c7f-3560d6843d0b10.pdf", 1).m207347s(x2c0.f190690wn).m207352x(act.string(R$string.f17652Cp), new e30() { // from class: l.nqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.Companion.m185574c(type, zArr, confirm, (x7y) obj);
                }
            }).m207350v(act.string(R$string.f18408c), new e30() { // from class: l.oqb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sqb0.Companion.m185576e(zArr, cancel, (x7y) obj);
                }
            }).m207354z(swh0.m186255p0().m186298R1()).m207351w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.pqb0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    sqb0.Companion.m185573b(compoundButton, z);
                }
            }).m207343B(new DialogInterface.OnDismissListener() { // from class: l.qqb0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    sqb0.Companion.m185575d(zArr, cancel, dialogInterface);
                }
            }).m207348t();
            x7yVarM207348t.getClass();
            x7yVarM207348t.m207323m(cwf0VarM186207N1);
            x7yVarM207348t.m207324n();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m185523o0() {
    }

    public /* synthetic */ sqb0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
