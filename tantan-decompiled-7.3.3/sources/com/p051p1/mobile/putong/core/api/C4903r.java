package com.p051p1.mobile.putong.core.api;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4903r;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.BuzzDeviceInfo;
import com.p051p1.mobile.putong.core.data.BuzzUserInfo;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationLoveBuzz;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.LoveBuzzEnvelope;
import com.p051p1.mobile.putong.core.data.LoveBuzzRequestParams;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.bnl0;
import p153l.dy6;
import p153l.gta;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.p7f;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.smq0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wyd0;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ~2\u00020\u0001:\u0001\u007fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010,J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b;\u0010#J\u0015\u0010<\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b<\u0010#J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020%0 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b=\u0010,J%\u0010?\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J?\u0010E\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020%¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bG\u0010,J'\u0010H\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bH\u0010@J'\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bI\u0010@J'\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010@J7\u0010M\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020%2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010O\u001a\u00020A2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bR\u0010@J'\u0010S\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bS\u0010@J-\u0010W\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bW\u0010XJ-\u0010Y\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bY\u0010XJ'\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010 2\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b[\u0010@J'\u0010_\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020%¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020%¢\u0006\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020A0n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u0080\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/r;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "coreApi", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "path", "type", "t5", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cid", "Lcom/p1/mobile/putong/core/data/Message;", "message", "", "a6", "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Message;)V", "w5", "(Lcom/p1/mobile/putong/core/data/Message;)V", "Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "U4", "()Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "S4", "()Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", CommandMessage.PARAMS, "T4", "(Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;)V", "buzzType", "f5", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "K5", "()Lrx/c;", "b5", "", FirebaseAnalytics.Param.LEVEL, "n5", "(I)Lrx/c;", "token", "Lcom/p1/mobile/putong/core/data/LoveBuzzEnvelope;", "Q4", "(Ljava/lang/String;)Lrx/c;", "Ll/uxj0;", "f6", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "C5", "(Lcom/p1/mobile/putong/core/data/Conversation;Ljava/lang/String;)V", "userId", "S5", "c6", "()V", "s5", "(Ljava/lang/String;)Ljava/lang/String;", "v6", "(Ljava/lang/String;Ljava/lang/String;)V", "A6", "I6", "r6", "channelToken", "i5", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "", "noFace", "noVocal", "errorCode", "y5", "(Ljava/lang/String;Ljava/lang/String;ZZI)Lrx/c;", "E6", "n6", "W5", "G5", "scene", BLiveOperationTitleShowType.duration, "w6", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lrx/c;", "toggle", "M6", "(ZLjava/lang/String;)Lrx/c;", "O4", "d6", "voiceBuzzToggle", "videoBuzzToggle", "memojiBuzzToggle", "O5", "(ZZZ)Lrx/c;", "j6", "bonusId", "V4", "", "Lcom/p1/mobile/putong/core/data/BreakIce;", "breakIces", "v5", "(Ljava/lang/String;Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Message;", "g5", "(Ljava/lang/String;)V", "mcc", "x5", "(I)V", "m5", "()I", "Ll/jxd0;", "R", "Ll/jxd0;", "r5", "()Ll/jxd0;", "loveBuzzNotifyShown", "Lrx/subjects/b;", p7f.LATITUDE_SOUTH, "Lrx/subjects/b;", "u5", "()Lrx/subjects/b;", "prolongBuzzTimePs", p7f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "getDeviceInfo", "setDeviceInfo", "(Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;)V", "deviceInfo", "Ll/vxd0;", "U", "Ll/vxd0;", "buzzPreferredMcc", "Companion", "a", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C4903r extends dy6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final jxd0 loveBuzzNotifyShown;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final C22508b<Boolean> prolongBuzzTimePs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public BuzzDeviceInfo deviceInfo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final vxd0 buzzPreferredMcc;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/r$a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()I", "c", "b", "a", "", "LOVE_BUZZ_TOKEN", "Ljava/lang/String;", "TAG", "DEFAULT_MEDIA", "VIDEO_BUZZ", "MEMOJI_BUZZ", "TEXT_BUZZ", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final int m35588a() {
            return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144066t3() : CoreModule.f18264c.f20312H0.m155454n4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final int m35589b() {
            return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144067u3() : CoreModule.f18264c.f20312H0.m155456o4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final int m35590c() {
            return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144068v3() : CoreModule.f18264c.f20312H0.m155458p4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final int m35591d() {
            return CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144069w3() : CoreModule.f18264c.f20312H0.m155460q4();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4903r(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.loveBuzzNotifyShown = new jxd0("love_buzz_notify_shown" + CoreModule.m30929H().userId(), Boolean.FALSE);
        C22508b<Boolean> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        this.prolongBuzzTimePs = c22508bM222767b;
        this.buzzPreferredMcc = new vxd0("buzz_preferred_mcc" + CoreModule.m30929H().userId(), -1);
    }

    /* JADX INFO: renamed from: A4 */
    public static C22421c m35391A4(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.vn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35515o6(this.f184843a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.xn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35519p6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.yn9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35523q6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: A5 */
    public static final Integer m35392A5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Integer m35395B5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B6 */
    public static final x1d0 m35396B6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/status")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: C6 */
    public static final uxj0 m35399C6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D4 */
    public static C22421c m35401D4(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.vm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35410F6(this.f184677a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.wm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35413G6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.xm9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35417H6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: D5 */
    public static final x1d0 m35402D5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/match")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: D6 */
    public static final uxj0 m35403D6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F5 */
    public static final LoveBuzzEnvelope m35409F5(Function1 function1, Object obj) {
        return (LoveBuzzEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F6 */
    public static final x1d0 m35410F6(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/status", str)).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: G3 */
    public static C22421c m35411G3(final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return qi20.m176659f(new pcj() { // from class: l.uo9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35458W4(str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: G6 */
    public static final uxj0 m35413G6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: H5 */
    public static final x1d0 m35416H5(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/like", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: H6 */
    public static final uxj0 m35417H6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public static final LoveBuzzData m35420I5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: J5 */
    public static final LoveBuzzData m35423J5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J6 */
    public static final x1d0 m35424J6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/status")).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: K3 */
    public static C22421c m35425K3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.sn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35476c5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.tn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35479d5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.un9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35482e5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: K4 */
    public static C22421c m35426K4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.ym9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35443P5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.zm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35446Q5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.bn9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35449R5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: K6 */
    public static final uxj0 m35427K6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L3 */
    public static C22421c m35428L3(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.do9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35542x6(this.f89900a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.eo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35545y6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.fo9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35549z6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: L5 */
    public static final x1d0 m35430L5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/status")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: L6 */
    public static final uxj0 m35431L6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static uxj0 m35433M4(final C4903r c4903r, final String str, final Message message) {
        c4903r.f91137Q.f20351U.m128074a(new x20() { // from class: l.im9
            @Override // p153l.x20
            public final void call() {
                C4903r.m35473b6(str, c4903r, message);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M5 */
    public static final LoveBuzzData m35434M5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: N3 */
    public static C22421c m35435N3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.np9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35502k6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.pp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35506l6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.qp9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35509m6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: N5 */
    public static final LoveBuzzData m35437N5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N6 */
    public static final x1d0 m35438N6(C4903r c4903r, String str, boolean z, LoveBuzzRequestParams loveBuzzRequestParams) {
        x1d0.C21228a c21228aM209043q = C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/status", str));
        return z ? c21228aM209043q.m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b() : c21228aM209043q.m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: O6 */
    public static final LoveBuzzData m35440O6(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: P3 */
    public static C22421c m35441P3(final C4903r c4903r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5(str);
        loveBuzzRequestParamsM35570f5.channelToken = str2;
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.gp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35461X5(this.f105443a, str, loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35464Y5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.ip9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35467Z5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: P4 */
    public static final x1d0 m35442P4(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/invite", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: P5 */
    public static final x1d0 m35443P5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/buzz/status")).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: P6 */
    public static final LoveBuzzData m35444P6(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static C22421c m35445Q3(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.om9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35548z5(this.f147907a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.qm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35392A5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.rm9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35395B5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: Q5 */
    public static final uxj0 m35446Q5(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: R4 */
    public static final x1d0 m35448R4(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/invite")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: R5 */
    public static final uxj0 m35449R5(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T5 */
    public static final x1d0 m35452T5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/priv/prolong")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: U5 */
    public static final Integer m35454U5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: V5 */
    public static final Integer m35456V5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W4 */
    public static final x1d0 m35458W4(String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: X3 */
    public static C22421c m35459X3(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.go9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35498j5(this.f105275a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.io9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35501k5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.jo9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35505l5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: X4 */
    public static final int m35460X4() {
        return INSTANCE.m35588a();
    }

    /* JADX INFO: renamed from: X5 */
    public static final x1d0 m35461X5(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/prolong", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: Y3 */
    public static C22421c m35462Y3(C4903r c4903r, String str) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.otherUserId = str;
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.zo9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35452T5(loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.ap9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35454U5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.bp9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35456V5(function1, obj);
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y4 */
    public static final int m35463Y4() {
        return INSTANCE.m35589b();
    }

    /* JADX INFO: renamed from: Y5 */
    public static final LoveBuzzData m35464Y5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z4 */
    public static final int m35466Z4() {
        return INSTANCE.m35590c();
    }

    /* JADX INFO: renamed from: Z5 */
    public static final LoveBuzzData m35467Z5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static C22421c m35469a4(C4903r c4903r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.mode = Active.TYPE;
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.sm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35396B6(loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.tm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35399C6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.um9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35403D6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: a5 */
    public static final int m35470a5() {
        return INSTANCE.m35591d();
    }

    /* JADX INFO: renamed from: b6 */
    public static final void m35473b6(String str, C4903r c4903r, Message message) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_love_buzz_break_ice)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
            c4903r.m35539w5(message);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m35474c3(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static C22421c m35475c4(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return qi20.m176659f(new pcj() { // from class: l.cp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35483e6(this.f82967a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: c5 */
    public static final x1d0 m35476c5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/status")).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: d4 */
    public static C22421c m35478d4(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.po9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35528s6(this.f153378a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.qo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35531t6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.ro9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35534u6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: d5 */
    public static final LoveBuzzData m35479d5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: e4 */
    public static C22421c m35481e4(final C4903r c4903r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return qi20.m176659f(new pcj() { // from class: l.jn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35442P4(this.f121757a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: e5 */
    public static final LoveBuzzData m35482e5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e6 */
    public static final x1d0 m35483e6(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/invite", str)).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: g6 */
    public static final x1d0 m35488g6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32200F0("/invite")).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: h4 */
    public static C22421c m35490h4(C4903r c4903r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.mode = Active.TYPE;
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.kn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35424J6(loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.mn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35427K6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.nn9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35431L6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m35491h5(String str) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery) && conversationQuery.hasLocalBreakIce) {
            Iterator<Message> it = CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_love_buzz_break_ice)), Message.CREATEDTIME.ASC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f18272k.f115535c.delete(it.next().f56859id);
            }
            conversationQuery.hasLocalBreakIce = false;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public static final uxj0 m35492h6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: i6 */
    public static final uxj0 m35495i6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22421c m35496j3(final C4903r c4903r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5(str);
        loveBuzzRequestParamsM35570f5.channelToken = str2;
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.kp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35416H5(this.f127838a, str, loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.lp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35420I5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.mp9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35423J5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: j4 */
    public static C22421c m35497j4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return qi20.m176659f(new pcj() { // from class: l.en9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35402D5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: j5 */
    public static final x1d0 m35498j5(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/session", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: k5 */
    public static final Integer m35501k5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: k6 */
    public static final x1d0 m35502k6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/buzz/status")).m209039m(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: l5 */
    public static final Integer m35505l5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l6 */
    public static final uxj0 m35506l6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: m3 */
    public static Unit m35507m3(C4903r c4903r, final String str) {
        c4903r.f91137Q.f20351U.m128074a(new x20() { // from class: l.jm9
            @Override // p153l.x20
            public final void call() {
                C4903r.m35491h5(str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final uxj0 m35509m6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static C22421c m35511n4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return qi20.m176659f(new pcj() { // from class: l.fp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35448R4(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o5 */
    public static final x1d0 m35514o5(String str, int i) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/buzz/status?uid=" + str + "&mcc=" + uqb0.f180400f0 + "&dl=" + i)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: o6 */
    public static final x1d0 m35515o6(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/report", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: p5 */
    public static final LoveBuzzData m35518p5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: p6 */
    public static final uxj0 m35519p6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: q3 */
    public static void m35520q3(C4903r c4903r, LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code == 0) {
            c4903r.prolongBuzzTimePs.m137019l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q5 */
    public static final LoveBuzzData m35522q5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q6 */
    public static final uxj0 m35523q6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m35524r3(Throwable th) {
    }

    /* JADX INFO: renamed from: s3 */
    public static C22421c m35526s3(final String str, final int i) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.ko9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35514o5(str, i);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.lo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35518p5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.mo9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35522q5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: s4 */
    public static C22421c m35527s4(C4903r c4903r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.textBuzzToggle = true;
        loveBuzzRequestParamsM35570f5.mode = "passive";
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.pn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35430L5(loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.qn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35434M5((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.rn9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35437N5(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: s6 */
    public static final x1d0 m35528s6(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/status", str)).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: t6 */
    public static final Integer m35531t6(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: u6 */
    public static final Integer m35534u6(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static C22421c m35536v4(C4903r c4903r, String str, final LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code != 0) {
            return C22421c.just(loveBuzzEnvelope);
        }
        c4903r.m35584v6(str, "");
        C22421c<uxj0> c22421cM33905ap = CoreModule.f18264c.f20384f0.m33905ap(str);
        final Function1 function1 = new Function1() { // from class: l.lm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35406E5(loveBuzzEnvelope, (uxj0) obj);
            }
        };
        return c22421cM33905ap.map(new qcj() { // from class: l.mm9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35409F5(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private final void m35539w5(Message message) {
        Message message2;
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189461W(message.cid).m208674j();
        if (!jyb.m147479J(listM208674j) && (message2 = (Message) listM208674j.get(0)) != null) {
            message.createdTime = message2.createdTime + 1.0d;
        }
        CoreModule.f18272k.f115535c.upsert(message);
    }

    /* JADX INFO: renamed from: x3 */
    public static C22421c m35540x3(final C4903r c4903r, final String str, final boolean z) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = c4903r.m35570f5(str);
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.mode = "passive";
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.ao9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35438N6(this.f72429a, str, z, loveBuzzRequestParamsM35570f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.bo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35440O6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.co9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35444P6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: x6 */
    public static final x1d0 m35542x6(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5(str, "/snapshot")).m209038l(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: y4 */
    public static C22421c m35544y4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22421c c22421cM176659f = qi20.m176659f(new pcj() { // from class: l.wo9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35488g6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.xo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35492h6((LoveBuzzEnvelope) obj);
            }
        };
        return c22421cM176659f.map(new qcj() { // from class: l.yo9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35495i6(function1, obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: y6 */
    public static final uxj0 m35545y6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z5 */
    public static final x1d0 m35548z5(C4903r c4903r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4879a.f20236P.auth().m209043q(c4903r.m35581t5("/session", str)).m209031e(z1d0.create(Network.JSON, loveBuzzRequestParams.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: z6 */
    public static final uxj0 m35549z6(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A6 */
    public final C22421c<uxj0> m35550A6() {
        return this.f91137Q.scheduled("start_search_text_buzz", -1, new pcj() { // from class: l.ho9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35469a4(this.f110877a);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public final void m35551C5(@Nullable Conversation conv, @NotNull String token) {
        token.getClass();
        if (conv == null) {
            return;
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.buzzToken = token;
        if (NullChecker.m82486a(conv.property) && NullChecker.m82486a(conv.property.intl_love_buzz)) {
            ConversationLoveBuzz conversationLoveBuzz = conv.property.intl_love_buzz;
            loveBuzzRequestParamsM35570f5.expire = conversationLoveBuzz.expire;
            loveBuzzRequestParamsM35570f5.prolonged = conversationLoveBuzz.prolonged;
            loveBuzzRequestParamsM35570f5.notBlur = conversationLoveBuzz.notBlur;
        }
        final String str = conv.otherUser;
        str.getClass();
        C22421c c22421cScheduled = this.f91137Q.scheduled("match_text_buzz", -1, new pcj() { // from class: l.em9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35497j4(loveBuzzRequestParamsM35570f5);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.pm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4903r.m35536v4(this.f153127a, str, (LoveBuzzEnvelope) obj);
            }
        };
        c22421cScheduled.flatMap(new qcj() { // from class: l.an9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4903r.m35474c3(function1, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ln9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4903r.m35520q3(this.f132748a, (LoveBuzzEnvelope) obj);
            }
        }, new y20() { // from class: l.wn9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4903r.m35524r3((Throwable) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: E6 */
    public final C22421c<uxj0> m35552E6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        m35562T4(loveBuzzRequestParamsM35570f5);
        return this.f91137Q.scheduled("stop_media_buzz", -1, new pcj() { // from class: l.dp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35401D4(this.f90034a, type, loveBuzzRequestParamsM35570f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: G5 */
    public final C22421c<LoveBuzzData> m35553G5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        C22421c<LoveBuzzData> c22421cScheduled = this.f91137Q.scheduled("media_buzz_like_peer", -1, new pcj() { // from class: l.ep9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35496j3(this.f95212a, type, channelToken);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final C22421c<uxj0> m35554I6() {
        return this.f91137Q.scheduled("stop_search_text_buzz", -1, new pcj() { // from class: l.gm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35490h4(this.f104959a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: K5 */
    public final C22421c<LoveBuzzData> m35555K5() {
        C22421c<LoveBuzzData> c22421cScheduled = this.f91137Q.scheduled("open_text_buzz", -1, new pcj() { // from class: l.gn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35527s4(this.f105069a);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    public final C22421c<LoveBuzzData> m35556M6(final boolean toggle, @NotNull final String type) {
        type.getClass();
        C22421c<LoveBuzzData> c22421cScheduled = this.f91137Q.scheduled("switch_media_buzz", -1, new pcj() { // from class: l.nm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35540x3(this.f142629a, type, toggle);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C22421c<LoveBuzzEnvelope> m35557O4(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.channelToken = token;
        C22421c<LoveBuzzEnvelope> c22421cScheduled = this.f91137Q.scheduled("accept_media_buzz", -1, new pcj() { // from class: l.hm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35481e4(this.f110603a, type, loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: O5 */
    public final C22421c<uxj0> m35558O5(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(str);
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM35570f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM35570f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM35570f5.userInfo = m35563U4();
        m35562T4(loveBuzzRequestParamsM35570f5);
        return this.f91137Q.scheduled("out_media_buzz_pool", -1, new pcj() { // from class: l.fm9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35426K4(loveBuzzRequestParamsM35570f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final C22421c<LoveBuzzEnvelope> m35559Q4(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM35570f5.buzzToken = token;
        C22421c<LoveBuzzEnvelope> c22421cScheduled = this.f91137Q.scheduled("accept_text_buzz", -1, new pcj() { // from class: l.on9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35511n4(loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: S4 */
    public final BuzzDeviceInfo m35560S4() {
        if (!NullChecker.m82486a(this.deviceInfo)) {
            BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
            this.deviceInfo = buzzDeviceInfo;
            buzzDeviceInfo.screenWidth = bnl0.m105592y0();
            BuzzDeviceInfo buzzDeviceInfo2 = this.deviceInfo;
            if (buzzDeviceInfo2 != null) {
                buzzDeviceInfo2.screenHeight = bnl0.m105588w0();
            }
            BuzzDeviceInfo buzzDeviceInfo3 = this.deviceInfo;
            if (buzzDeviceInfo3 != null) {
                buzzDeviceInfo3.memorySize = (int) (smq0.m186841j(App.f16088e) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
        }
        BuzzDeviceInfo buzzDeviceInfo4 = this.deviceInfo;
        return buzzDeviceInfo4 == null ? new BuzzDeviceInfo() : buzzDeviceInfo4;
    }

    @NotNull
    /* JADX INFO: renamed from: S5 */
    public final C22421c<Integer> m35561S5(@NotNull final String userId) {
        userId.getClass();
        C22421c<Integer> c22421cScheduled = this.f91137Q.scheduled("prolong_love_buzz_time", -1, new pcj() { // from class: l.to9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35462Y3(this.f175370a, userId);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: T4 */
    public final void m35562T4(LoveBuzzRequestParams params) {
        int iM35575m5 = m35575m5();
        if (iM35575m5 == 0) {
            params.preferredMcc = uqb0.f180400f0;
        } else if (iM35575m5 != -1) {
            params.preferredMcc = iM35575m5;
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final BuzzUserInfo m35563U4() {
        String string;
        String str;
        LookingFor lookingFor;
        User userM116600p9 = this.f91137Q.f20381e0.m116600p9();
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        if (!NullChecker.m82486a(userM116600p9)) {
            return buzzUserInfo;
        }
        Integer num = userM116600p9.age;
        num.getClass();
        buzzUserInfo.age = num.intValue();
        buzzUserInfo.gender = userM116600p9.gender.toString();
        Settings settings = userM116600p9.settings;
        if (settings == null || (lookingFor = settings.getLookingFor()) == null || (string = lookingFor.toString()) == null) {
            string = "";
        }
        buzzUserInfo.lookingForGender = string;
        buzzUserInfo.vipStatus = userM116600p9.isVIP();
        buzzUserInfo.svipStatus = userM116600p9.isSVIP();
        buzzUserInfo.seeStatus = !joa.m146392i4();
        userM116600p9.vipSeen();
        buzzUserInfo.popLevel = userM116600p9.popLevel;
        if (userM116600p9.status.contains(UserStatus.get("hidden"))) {
            str = Channel.fake;
        } else if (userM116600p9.veryUgly()) {
            str = "inapt";
        } else {
            str = userM116600p9.isBanedOrInactivated() ? "ban" : AIMessageFeedback.good;
        }
        buzzUserInfo.modStatus = str;
        return buzzUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: V4 */
    public final C22421c<LoveBuzzEnvelope> m35564V4(@NotNull String bonusId, @NotNull String type) {
        final String strM32208H0;
        bonusId.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        switch (type) {
            case "voiceBuzz":
                loveBuzzRequestParamsM35570f5.channelToken = bonusId;
                strM32208H0 = C4879a.m32208H0("/bonus");
                strM32208H0.getClass();
                break;
            case "textBuzz":
                loveBuzzRequestParamsM35570f5.conversationId = bonusId;
                strM32208H0 = C4879a.m32200F0("/bonus");
                strM32208H0.getClass();
                break;
            case "videoBuzz":
                loveBuzzRequestParamsM35570f5.channelToken = bonusId;
                strM32208H0 = C4879a.m32204G0("/bonus");
                strM32208H0.getClass();
                break;
            case "memojiBuzz":
                loveBuzzRequestParamsM35570f5.channelToken = bonusId;
                strM32208H0 = C4879a.m32196E0("/bonus");
                strM32208H0.getClass();
                break;
            default:
                return null;
        }
        return this.f91137Q.scheduled("buzz_add_bonus", -1, new pcj() { // from class: l.zn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35411G3(strM32208H0, loveBuzzRequestParamsM35570f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: W5 */
    public final C22421c<LoveBuzzData> m35565W5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        C22421c<LoveBuzzData> c22421cScheduled = this.f91137Q.scheduled("prolong_media_buzz_time", -1, new pcj() { // from class: l.vo9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35441P3(this.f185014a, type, channelToken);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: a6 */
    public final void m35566a6(final String cid, final Message message) {
        this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.rp9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35433M4(this.f164344a, cid, message);
            }
        }).compose(C4879a.m32255T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: b5 */
    public final C22421c<LoveBuzzData> m35567b5() {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5("textBuzz");
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.mode = "passive";
        C22421c<LoveBuzzData> c22421cScheduled = this.f91137Q.scheduled("close_text_buzz", -1, new pcj() { // from class: l.km9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35425K3(loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m35568c6() {
        boolean zMo34946x3 = gta.m132210e().m132214d().mo34946x3();
        boolean zM146386f4 = joa.m146386f4();
        if (zMo34946x3 || !zM146386f4) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d6 */
    public final C22421c<LoveBuzzEnvelope> m35569d6(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.channelToken = token;
        return this.f91137Q.scheduled("refuse_media_buzz", -1, new pcj() { // from class: l.no9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35475c4(this.f142938a, type, loveBuzzRequestParamsM35570f5);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: f5 */
    public final LoveBuzzRequestParams m35570f5(String buzzType) {
        String str;
        LoveBuzzData loveBuzzDataMo36102Nk;
        if (CoreModule.m30930K().mo31838xf()) {
            int iHashCode = buzzType.hashCode();
            str = "diamond";
            if (iHashCode != -1019560155) {
                if (iHashCode != 1332422126) {
                    if (iHashCode == 1740758636 && buzzType.equals("memojiBuzz")) {
                        LoveBuzzData loveBuzzDataMo36102Nk2 = CoreModule.f18273l.m143406b().mo36102Nk();
                        if ((loveBuzzDataMo36102Nk2 != null ? loveBuzzDataMo36102Nk2.remainingMemojiBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    } else {
                        loveBuzzDataMo36102Nk = CoreModule.f18273l.m143406b().mo36102Nk();
                        if ((loveBuzzDataMo36102Nk != null ? loveBuzzDataMo36102Nk.remainingTextBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    }
                } else if (buzzType.equals("videoBuzz")) {
                    LoveBuzzData loveBuzzDataMo36102Nk3 = CoreModule.f18273l.m143406b().mo36102Nk();
                    if ((loveBuzzDataMo36102Nk3 != null ? loveBuzzDataMo36102Nk3.remainingVideoBuzz : 0) > 0) {
                        str = "privilege";
                    }
                } else {
                    loveBuzzDataMo36102Nk = CoreModule.f18273l.m143406b().mo36102Nk();
                    if ((loveBuzzDataMo36102Nk != null ? loveBuzzDataMo36102Nk.remainingTextBuzz : 0) > 0) {
                        str = "privilege";
                    }
                }
            } else if (buzzType.equals("voiceBuzz")) {
                LoveBuzzData loveBuzzDataMo36102Nk4 = CoreModule.f18273l.m143406b().mo36102Nk();
                if ((loveBuzzDataMo36102Nk4 != null ? loveBuzzDataMo36102Nk4.remainingVoiceBuzz : 0) > 0) {
                    str = "privilege";
                }
            } else {
                loveBuzzDataMo36102Nk = CoreModule.f18273l.m143406b().mo36102Nk();
                if ((loveBuzzDataMo36102Nk != null ? loveBuzzDataMo36102Nk.remainingTextBuzz : 0) > 0) {
                    str = "privilege";
                }
            }
        } else {
            str = "";
        }
        LoveBuzzRequestParams loveBuzzRequestParams = new LoveBuzzRequestParams();
        loveBuzzRequestParams.consumeType = str;
        return loveBuzzRequestParams;
    }

    @Nullable
    /* JADX INFO: renamed from: f6 */
    public final C22421c<uxj0> m35571f6(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM35570f5.buzzToken = token;
        return this.f91137Q.scheduled("refuse_text_buzz", -1, new pcj() { // from class: l.oo9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35544y4(loveBuzzRequestParamsM35570f5);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final void m35572g5(@NotNull final String cid) {
        cid.getClass();
        if (TextUtils.isEmpty(cid)) {
            return;
        }
        this.f91137Q.now(C22421c.fromCallable(new Callable() { // from class: l.op9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35507m3(this.f148425a, cid);
            }
        }).compose(C4879a.m32255T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public final C22421c<Integer> m35573i5(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.channelToken = channelToken;
        C22421c<Integer> c22421cScheduled = this.f91137Q.scheduled("enter_media_buzz", -1, new pcj() { // from class: l.hn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35459X3(this.f110709a, type, loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: j6 */
    public final C22421c<uxj0> m35574j6(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(str);
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM35570f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM35570f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM35570f5.userInfo = m35563U4();
        loveBuzzRequestParamsM35570f5.deviceInfo = m35560S4();
        m35562T4(loveBuzzRequestParamsM35570f5);
        return this.f91137Q.scheduled("report_buzz_passive", -1, new pcj() { // from class: l.jp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35435N3(loveBuzzRequestParamsM35570f5);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final int m35575m5() {
        Integer num = this.buzzPreferredMcc.get();
        if ((num == null || num.intValue() != -1) && joa.m146386f4()) {
            m35586x5(-1);
            num = -1;
        }
        num.getClass();
        return num.intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: n5 */
    public final C22421c<LoveBuzzData> m35576n5(final int level) {
        final String strUserId = CoreModule.m30929H().userId();
        return this.f91137Q.scheduled("get_combo_buzz_status" + strUserId, 0, new pcj() { // from class: l.dn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35526s3(strUserId, level);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: n6 */
    public final C22421c<uxj0> m35577n6(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.channelToken = channelToken;
        return this.f91137Q.scheduled("report_media_buzz", -1, new pcj() { // from class: l.fn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35391A4(this.f99877a, type, loveBuzzRequestParamsM35570f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: r5, reason: from getter */
    public final jxd0 getLoveBuzzNotifyShown() {
        return this.loveBuzzNotifyShown;
    }

    @NotNull
    /* JADX INFO: renamed from: r6 */
    public final C22421c<Integer> m35579r6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.userId = CoreModule.m30929H().userId();
        loveBuzzRequestParamsM35570f5.mcc = uqb0.f180400f0;
        loveBuzzRequestParamsM35570f5.mode = Active.TYPE;
        loveBuzzRequestParamsM35570f5.userInfo = m35563U4();
        loveBuzzRequestParamsM35570f5.deviceInfo = m35560S4();
        m35562T4(loveBuzzRequestParamsM35570f5);
        C22421c<Integer> c22421cScheduled = this.f91137Q.scheduled("search_media_buzz", -1, new pcj() { // from class: l.in9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35478d4(this.f115876a, type, loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: s5 */
    public final String m35580s5(@Nullable String cid) {
        return new wyd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m30929H().userId(), "").get();
    }

    /* JADX INFO: renamed from: t5 */
    public final String m35581t5(String path, String type) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    String strM32196E0 = C4879a.m32196E0(path);
                    strM32196E0.getClass();
                    return strM32196E0;
                }
            } else if (type.equals("videoBuzz")) {
                String strM32204G0 = C4879a.m32204G0(path);
                strM32204G0.getClass();
                return strM32204G0;
            }
        } else if (type.equals("voiceBuzz")) {
            String strM32208H0 = C4879a.m32208H0(path);
            strM32208H0.getClass();
            return strM32208H0;
        }
        String strM32208H1 = C4879a.m32208H0(path);
        strM32208H1.getClass();
        return strM32208H1;
    }

    @NotNull
    /* JADX INFO: renamed from: u5 */
    public final C22508b<Boolean> m35582u5() {
        return this.prolongBuzzTimePs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: v5 */
    public final Message m35583v5(@NotNull String cid, @Nullable List<? extends BreakIce> breakIces) {
        cid.getClass();
        if (jyb.m147479J(breakIces)) {
            return null;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_love_buzz_break_ice);
        messageNew_.cid = cid;
        messageNew_.localInConversation = true;
        messageNew_.localGreetingId = cid;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        Integer num = vxd0Var.get();
        num.getClass();
        messageNew_.localCreatedSession = num.intValue();
        Integer num2 = vxd0Var.get();
        num2.getClass();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(num2.intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        if (messageAdditionalDataNew_ != null) {
            messageAdditionalDataNew_.localBreakIce = breakIces;
        }
        m35566a6(cid, messageNew_);
        return messageNew_;
    }

    /* JADX INFO: renamed from: v6 */
    public final void m35584v6(@Nullable String cid, @NotNull String token) {
        token.getClass();
        new wyd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m30929H().userId(), "").put(token);
    }

    @Nullable
    /* JADX INFO: renamed from: w6 */
    public final C22421c<uxj0> m35585w6(@NotNull String channelToken, @NotNull String scene, int duration, @NotNull final String type) {
        channelToken.getClass();
        scene.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.channelToken = channelToken;
        loveBuzzRequestParamsM35570f5.scene = scene;
        loveBuzzRequestParamsM35570f5.duration = duration;
        return this.f91137Q.scheduled("snap_shot_buzz", -1, new pcj() { // from class: l.cn9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35428L3(this.f82700a, type, loveBuzzRequestParamsM35570f5);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m35586x5(int mcc) {
        this.buzzPreferredMcc.put(Integer.valueOf(mcc));
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final C22421c<Integer> m35587y5(@NotNull String channelToken, @NotNull final String type, boolean noFace, boolean noVocal, int errorCode) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM35570f5 = m35570f5(type);
        loveBuzzRequestParamsM35570f5.noFace = noFace;
        loveBuzzRequestParamsM35570f5.noVocal = noVocal;
        loveBuzzRequestParamsM35570f5.channelToken = channelToken;
        loveBuzzRequestParamsM35570f5.errorCode = errorCode;
        C22421c<Integer> c22421cScheduled = this.f91137Q.scheduled("leave_media_buzz", -1, new pcj() { // from class: l.so9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4903r.m35445Q3(this.f169857a, type, loveBuzzRequestParamsM35570f5);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: E5 */
    public static final LoveBuzzEnvelope m35406E5(LoveBuzzEnvelope loveBuzzEnvelope, uxj0 uxj0Var) {
        return loveBuzzEnvelope;
    }
}
