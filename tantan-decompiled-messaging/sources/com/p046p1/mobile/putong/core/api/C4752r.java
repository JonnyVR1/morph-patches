package com.p046p1.mobile.putong.core.api;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4752r;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.BuzzDeviceInfo;
import com.p046p1.mobile.putong.core.data.BuzzUserInfo;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationLoveBuzz;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.LoveBuzzEnvelope;
import com.p046p1.mobile.putong.core.data.LoveBuzzRequestParams;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.d30;
import p149l.e30;
import p149l.hpd0;
import p149l.ia20;
import p149l.j6f;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ndq0;
import p149l.qib0;
import p149l.roj0;
import p149l.stc0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ~2\u00020\u0001:\u0001\u007fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010,J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b;\u0010#J\u0015\u0010<\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b<\u0010#J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020%0 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b=\u0010,J%\u0010?\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J?\u0010E\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020%¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bG\u0010,J'\u0010H\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bH\u0010@J'\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bI\u0010@J'\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010@J7\u0010M\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020%2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010O\u001a\u00020A2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bR\u0010@J'\u0010S\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bS\u0010@J-\u0010W\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bW\u0010XJ-\u0010Y\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bY\u0010XJ'\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010 2\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b[\u0010@J'\u0010_\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020%¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020%¢\u0006\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020A0n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u0080\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/r;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "coreApi", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "path", "type", "t5", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cid", "Lcom/p1/mobile/putong/core/data/Message;", "message", "", "a6", "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Message;)V", "w5", "(Lcom/p1/mobile/putong/core/data/Message;)V", "Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "U4", "()Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "S4", "()Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", CommandMessage.PARAMS, "T4", "(Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;)V", "buzzType", "f5", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "K5", "()Lrx/c;", "b5", "", FirebaseAnalytics.Param.LEVEL, "n5", "(I)Lrx/c;", "token", "Lcom/p1/mobile/putong/core/data/LoveBuzzEnvelope;", "Q4", "(Ljava/lang/String;)Lrx/c;", "Ll/roj0;", "f6", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "C5", "(Lcom/p1/mobile/putong/core/data/Conversation;Ljava/lang/String;)V", "userId", "S5", "c6", "()V", "s5", "(Ljava/lang/String;)Ljava/lang/String;", "v6", "(Ljava/lang/String;Ljava/lang/String;)V", "A6", "I6", "r6", "channelToken", "i5", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "", "noFace", "noVocal", "errorCode", "y5", "(Ljava/lang/String;Ljava/lang/String;ZZI)Lrx/c;", "E6", "n6", "W5", "G5", "scene", BLiveOperationTitleShowType.duration, "w6", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lrx/c;", "toggle", "M6", "(ZLjava/lang/String;)Lrx/c;", "O4", "d6", "voiceBuzzToggle", "videoBuzzToggle", "memojiBuzzToggle", "O5", "(ZZZ)Lrx/c;", "j6", "bonusId", "V4", "", "Lcom/p1/mobile/putong/core/data/BreakIce;", "breakIces", "v5", "(Ljava/lang/String;Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Message;", "g5", "(Ljava/lang/String;)V", "mcc", "x5", "(I)V", "m5", "()I", "Ll/hpd0;", "R", "Ll/hpd0;", "r5", "()Ll/hpd0;", "loveBuzzNotifyShown", "Lrx/subjects/b;", j6f.LATITUDE_SOUTH, "Lrx/subjects/b;", "u5", "()Lrx/subjects/b;", "prolongBuzzTimePs", j6f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "getDeviceInfo", "setDeviceInfo", "(Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;)V", "deviceInfo", "Ll/tpd0;", "U", "Ll/tpd0;", "buzzPreferredMcc", "Companion", "a", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C4752r extends ax6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final hpd0 loveBuzzNotifyShown;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final C22393b<Boolean> prolongBuzzTimePs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public BuzzDeviceInfo deviceInfo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final tpd0 buzzPreferredMcc;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/r$a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()I", "c", "b", "a", "", "LOVE_BUZZ_TOKEN", "Ljava/lang/String;", "TAG", "DEFAULT_MEDIA", "VIDEO_BUZZ", "MEMOJI_BUZZ", "TEXT_BUZZ", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final int m34585a() {
            return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140269t3() : CoreModule.f17545c.f19570H0.m210366n4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final int m34586b() {
            return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140270u3() : CoreModule.f17545c.f19570H0.m210368o4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final int m34587c() {
            return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140271v3() : CoreModule.f17545c.f19570H0.m210370p4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final int m34588d() {
            return CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140272w3() : CoreModule.f17545c.f19570H0.m210372q4();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4752r(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.loveBuzzNotifyShown = new hpd0("love_buzz_notify_shown" + CoreModule.m29931H().userId(), Boolean.FALSE);
        C22393b<Boolean> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        this.prolongBuzzTimePs = c22393bM221521b;
        this.buzzPreferredMcc = new tpd0("buzz_preferred_mcc" + CoreModule.m29931H().userId(), -1);
    }

    /* JADX INFO: renamed from: A4 */
    public static C22306c m34388A4(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.mm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34512o6(this.f134559a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.om9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34516p6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.pm9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34520q6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: A5 */
    public static final Integer m34389A5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Integer m34392B5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B6 */
    public static final stc0 m34393B6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/status")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: C6 */
    public static final roj0 m34396C6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D4 */
    public static C22306c m34398D4(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.ml9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34407F6(this.f134412a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.nl9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34410G6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.ol9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34414H6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: D5 */
    public static final stc0 m34399D5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/match")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: D6 */
    public static final roj0 m34400D6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F5 */
    public static final LoveBuzzEnvelope m34406F5(Function1 function1, Object obj) {
        return (LoveBuzzEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F6 */
    public static final stc0 m34407F6(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/status", str)).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: G3 */
    public static C22306c m34408G3(final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m135122f(new v9j() { // from class: l.ln9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34455W4(str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: G6 */
    public static final roj0 m34410G6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: H5 */
    public static final stc0 m34413H5(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/like", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: H6 */
    public static final roj0 m34414H6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public static final LoveBuzzData m34417I5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: J5 */
    public static final LoveBuzzData m34420J5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J6 */
    public static final stc0 m34421J6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/status")).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: K3 */
    public static C22306c m34422K3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.jm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34473c5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.km9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34476d5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.lm9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34479e5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: K4 */
    public static C22306c m34423K4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.pl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34440P5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.ql9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34443Q5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.sl9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34446R5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: K6 */
    public static final roj0 m34424K6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L3 */
    public static C22306c m34425L3(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.um9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34539x6(this.f177207a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.vm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34542y6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.wm9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34546z6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: L5 */
    public static final stc0 m34427L5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/status")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: L6 */
    public static final roj0 m34428L6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static roj0 m34430M4(final C4752r c4752r, final String str, final Message message) {
        c4752r.f72126Q.f19609U.m109085a(new d30() { // from class: l.zk9
            @Override // p149l.d30
            public final void call() {
                C4752r.m34470b6(str, c4752r, message);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: M5 */
    public static final LoveBuzzData m34431M5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: N3 */
    public static C22306c m34432N3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.eo9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34499k6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.go9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34503l6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.ho9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34506m6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: N5 */
    public static final LoveBuzzData m34434N5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N6 */
    public static final stc0 m34435N6(C4752r c4752r, String str, boolean z, LoveBuzzRequestParams loveBuzzRequestParams) {
        stc0.C20027a c20027aM185898q = C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/status", str));
        return z ? c20027aM185898q.m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b() : c20027aM185898q.m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: O6 */
    public static final LoveBuzzData m34437O6(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: P3 */
    public static C22306c m34438P3(final C4752r c4752r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5(str);
        loveBuzzRequestParamsM34567f5.channelToken = str2;
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.xn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34458X5(this.f193646a, str, loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.yn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34461Y5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.zn9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34464Z5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: P4 */
    public static final stc0 m34439P4(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/invite", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: P5 */
    public static final stc0 m34440P5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/buzz/status")).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: P6 */
    public static final LoveBuzzData m34441P6(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static C22306c m34442Q3(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.fl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34545z5(this.f98137a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hl9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34389A5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.il9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34392B5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: Q5 */
    public static final roj0 m34443Q5(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: R4 */
    public static final stc0 m34445R4(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/invite")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: R5 */
    public static final roj0 m34446R5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T5 */
    public static final stc0 m34449T5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/priv/prolong")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: U5 */
    public static final Integer m34451U5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: V5 */
    public static final Integer m34453V5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W4 */
    public static final stc0 m34455W4(String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: X3 */
    public static C22306c m34456X3(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.xm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34495j5(this.f193537a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.zm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34498k5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.an9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34502l5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: X4 */
    public static final int m34457X4() {
        return INSTANCE.m34585a();
    }

    /* JADX INFO: renamed from: X5 */
    public static final stc0 m34458X5(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/prolong", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: Y3 */
    public static C22306c m34459Y3(C4752r c4752r, String str) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.otherUserId = str;
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.qn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34449T5(loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.rn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34451U5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.sn9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34453V5(function1, obj);
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y4 */
    public static final int m34460Y4() {
        return INSTANCE.m34586b();
    }

    /* JADX INFO: renamed from: Y5 */
    public static final LoveBuzzData m34461Y5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z4 */
    public static final int m34463Z4() {
        return INSTANCE.m34587c();
    }

    /* JADX INFO: renamed from: Z5 */
    public static final LoveBuzzData m34464Z5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static C22306c m34466a4(C4752r c4752r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.mode = Active.TYPE;
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.jl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34393B6(loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.kl9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34396C6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.ll9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34400D6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: a5 */
    public static final int m34467a5() {
        return INSTANCE.m34588d();
    }

    /* JADX INFO: renamed from: b6 */
    public static final void m34470b6(String str, C4752r c4752r, Message message) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
            Iterator<Message> it = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_love_buzz_break_ice)), Message.CREATEDTIME.DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
            c4752r.m34536w5(message);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c m34471c3(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static C22306c m34472c4(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m135122f(new v9j() { // from class: l.tn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34480e6(this.f171215a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: c5 */
    public static final stc0 m34473c5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/status")).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: d4 */
    public static C22306c m34475d4(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.gn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34525s6(this.f103581a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34528t6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.in9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34531u6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: d5 */
    public static final LoveBuzzData m34476d5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: e4 */
    public static C22306c m34478e4(final C4752r c4752r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m135122f(new v9j() { // from class: l.am9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34439P4(this.f70570a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: e5 */
    public static final LoveBuzzData m34479e5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e6 */
    public static final stc0 m34480e6(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/invite", str)).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: g6 */
    public static final stc0 m34485g6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31197F0("/invite")).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: h4 */
    public static C22306c m34487h4(C4752r c4752r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.mode = Active.TYPE;
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.bm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34421J6(loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.dm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34424K6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.em9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34428L6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m34488h5(String str) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery) && conversationQuery.hasLocalBreakIce) {
            Iterator<Message> it = CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_love_buzz_break_ice)), Message.CREATEDTIME.ASC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f17553k.f91940c.delete(it.next().f56011id);
            }
            conversationQuery.hasLocalBreakIce = false;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public static final roj0 m34489h6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: i6 */
    public static final roj0 m34492i6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static C22306c m34493j3(final C4752r c4752r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5(str);
        loveBuzzRequestParamsM34567f5.channelToken = str2;
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.bo9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34413H5(this.f76487a, str, loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.co9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34417I5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.do9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34420J5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: j4 */
    public static C22306c m34494j4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m135122f(new v9j() { // from class: l.vl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34399D5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: j5 */
    public static final stc0 m34495j5(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/session", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: k5 */
    public static final Integer m34498k5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: k6 */
    public static final stc0 m34499k6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/buzz/status")).m185894m(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: l5 */
    public static final Integer m34502l5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l6 */
    public static final roj0 m34503l6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: m3 */
    public static Unit m34504m3(C4752r c4752r, final String str) {
        c4752r.f72126Q.f19609U.m109085a(new d30() { // from class: l.al9
            @Override // p149l.d30
            public final void call() {
                C4752r.m34488h5(str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final roj0 m34506m6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static C22306c m34508n4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m135122f(new v9j() { // from class: l.wn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34445R4(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o5 */
    public static final stc0 m34511o5(String str, int i) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/buzz/status?uid=" + str + "&mcc=" + qib0.f154717f0 + "&dl=" + i)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: o6 */
    public static final stc0 m34512o6(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/report", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: p5 */
    public static final LoveBuzzData m34515p5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: p6 */
    public static final roj0 m34516p6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: q3 */
    public static void m34517q3(C4752r c4752r, LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code == 0) {
            c4752r.prolongBuzzTimePs.m132487l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q5 */
    public static final LoveBuzzData m34519q5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q6 */
    public static final roj0 m34520q6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m34521r3(Throwable th) {
    }

    /* JADX INFO: renamed from: s3 */
    public static C22306c m34523s3(final String str, final int i) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.bn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34511o5(str, i);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.cn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34515p5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.dn9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34519q5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: s4 */
    public static C22306c m34524s4(C4752r c4752r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.textBuzzToggle = true;
        loveBuzzRequestParamsM34567f5.mode = "passive";
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.gm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34427L5(loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34431M5((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.im9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34434N5(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: s6 */
    public static final stc0 m34525s6(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/status", str)).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: t6 */
    public static final Integer m34528t6(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: u6 */
    public static final Integer m34531u6(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static C22306c m34533v4(C4752r c4752r, String str, final LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code != 0) {
            return C22306c.just(loveBuzzEnvelope);
        }
        c4752r.m34581v6(str, "");
        C22306c<roj0> c22306cM32902ap = CoreModule.f17545c.f19642f0.m32902ap(str);
        final Function1 function1 = new Function1() { // from class: l.cl9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34403E5(loveBuzzEnvelope, (roj0) obj);
            }
        };
        return c22306cM32902ap.map(new w9j() { // from class: l.dl9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34406F5(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private final void m34536w5(Message message) {
        Message message2;
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206065W(message.cid).m165617j();
        if (!vwb.m200296J(listM165617j) && (message2 = (Message) listM165617j.get(0)) != null) {
            message.createdTime = message2.createdTime + 1.0d;
        }
        CoreModule.f17553k.f91940c.upsert(message);
    }

    /* JADX INFO: renamed from: x3 */
    public static C22306c m34537x3(final C4752r c4752r, final String str, final boolean z) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = c4752r.m34567f5(str);
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.mode = "passive";
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.rm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34435N6(this.f160072a, str, z, loveBuzzRequestParamsM34567f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.sm9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34437O6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.tm9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34441P6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: x6 */
    public static final stc0 m34539x6(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5(str, "/snapshot")).m185893l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: y4 */
    public static C22306c m34541y4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        C22306c c22306cM135122f = ia20.m135122f(new v9j() { // from class: l.nn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34485g6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.on9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34489h6((LoveBuzzEnvelope) obj);
            }
        };
        return c22306cM135122f.map(new w9j() { // from class: l.pn9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34492i6(function1, obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: y6 */
    public static final roj0 m34542y6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: z5 */
    public static final stc0 m34545z5(C4752r c4752r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C4728a.f19494P.auth().m185898q(c4752r.m34578t5("/session", str)).m185886e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: z6 */
    public static final roj0 m34546z6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A6 */
    public final C22306c<roj0> m34547A6() {
        return this.f72126Q.scheduled("start_search_text_buzz", -1, new v9j() { // from class: l.ym9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34466a4(this.f198968a);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public final void m34548C5(@Nullable Conversation conv, @NotNull String token) {
        token.getClass();
        if (conv == null) {
            return;
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.buzzToken = token;
        if (NullChecker.m81303a(conv.property) && NullChecker.m81303a(conv.property.intl_love_buzz)) {
            ConversationLoveBuzz conversationLoveBuzz = conv.property.intl_love_buzz;
            loveBuzzRequestParamsM34567f5.expire = conversationLoveBuzz.expire;
            loveBuzzRequestParamsM34567f5.prolonged = conversationLoveBuzz.prolonged;
            loveBuzzRequestParamsM34567f5.notBlur = conversationLoveBuzz.notBlur;
        }
        final String str = conv.otherUser;
        str.getClass();
        C22306c c22306cScheduled = this.f72126Q.scheduled("match_text_buzz", -1, new v9j() { // from class: l.vk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34494j4(loveBuzzRequestParamsM34567f5);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gl9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4752r.m34533v4(this.f103304a, str, (LoveBuzzEnvelope) obj);
            }
        };
        c22306cScheduled.flatMap(new w9j() { // from class: l.rl9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4752r.m34471c3(function1, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.cm9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4752r.m34517q3(this.f81519a, (LoveBuzzEnvelope) obj);
            }
        }, new e30() { // from class: l.nm9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4752r.m34521r3((Throwable) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: E6 */
    public final C22306c<roj0> m34549E6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        m34559T4(loveBuzzRequestParamsM34567f5);
        return this.f72126Q.scheduled("stop_media_buzz", -1, new v9j() { // from class: l.un9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34398D4(this.f177343a, type, loveBuzzRequestParamsM34567f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: G5 */
    public final C22306c<LoveBuzzData> m34550G5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        C22306c<LoveBuzzData> c22306cScheduled = this.f72126Q.scheduled("media_buzz_like_peer", -1, new v9j() { // from class: l.vn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34493j3(this.f182214a, type, channelToken);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final C22306c<roj0> m34551I6() {
        return this.f72126Q.scheduled("stop_search_text_buzz", -1, new v9j() { // from class: l.xk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34487h4(this.f193276a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: K5 */
    public final C22306c<LoveBuzzData> m34552K5() {
        C22306c<LoveBuzzData> c22306cScheduled = this.f72126Q.scheduled("open_text_buzz", -1, new v9j() { // from class: l.xl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34524s4(this.f193399a);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    public final C22306c<LoveBuzzData> m34553M6(final boolean toggle, @NotNull final String type) {
        type.getClass();
        C22306c<LoveBuzzData> c22306cScheduled = this.f72126Q.scheduled("switch_media_buzz", -1, new v9j() { // from class: l.el9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34537x3(this.f92083a, type, toggle);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C22306c<LoveBuzzEnvelope> m34554O4(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.channelToken = token;
        C22306c<LoveBuzzEnvelope> c22306cScheduled = this.f72126Q.scheduled("accept_media_buzz", -1, new v9j() { // from class: l.yk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34478e4(this.f198736a, type, loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: O5 */
    public final C22306c<roj0> m34555O5(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(str);
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM34567f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM34567f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM34567f5.userInfo = m34560U4();
        m34559T4(loveBuzzRequestParamsM34567f5);
        return this.f72126Q.scheduled("out_media_buzz_pool", -1, new v9j() { // from class: l.wk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34423K4(loveBuzzRequestParamsM34567f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final C22306c<LoveBuzzEnvelope> m34556Q4(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM34567f5.buzzToken = token;
        C22306c<LoveBuzzEnvelope> c22306cScheduled = this.f72126Q.scheduled("accept_text_buzz", -1, new v9j() { // from class: l.fm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34508n4(loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: S4 */
    public final BuzzDeviceInfo m34557S4() {
        if (!NullChecker.m81303a(this.deviceInfo)) {
            BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
            this.deviceInfo = buzzDeviceInfo;
            buzzDeviceInfo.screenWidth = xdl0.m208412y0();
            BuzzDeviceInfo buzzDeviceInfo2 = this.deviceInfo;
            if (buzzDeviceInfo2 != null) {
                buzzDeviceInfo2.screenHeight = xdl0.m208408w0();
            }
            BuzzDeviceInfo buzzDeviceInfo3 = this.deviceInfo;
            if (buzzDeviceInfo3 != null) {
                buzzDeviceInfo3.memorySize = (int) (ndq0.m159025j(App.f15369e) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
        }
        BuzzDeviceInfo buzzDeviceInfo4 = this.deviceInfo;
        return buzzDeviceInfo4 == null ? new BuzzDeviceInfo() : buzzDeviceInfo4;
    }

    @NotNull
    /* JADX INFO: renamed from: S5 */
    public final C22306c<Integer> m34558S5(@NotNull final String userId) {
        userId.getClass();
        C22306c<Integer> c22306cScheduled = this.f72126Q.scheduled("prolong_love_buzz_time", -1, new v9j() { // from class: l.kn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34459Y3(this.f123866a, userId);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: T4 */
    public final void m34559T4(LoveBuzzRequestParams params) {
        int iM34572m5 = m34572m5();
        if (iM34572m5 == 0) {
            params.preferredMcc = qib0.f154717f0;
        } else if (iM34572m5 != -1) {
            params.preferredMcc = iM34572m5;
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final BuzzUserInfo m34560U4() {
        String string;
        String str;
        LookingFor lookingFor;
        User userM169527p9 = this.f72126Q.f19639e0.m169527p9();
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        if (!NullChecker.m81303a(userM169527p9)) {
            return buzzUserInfo;
        }
        Integer num = userM169527p9.age;
        num.getClass();
        buzzUserInfo.age = num.intValue();
        buzzUserInfo.gender = userM169527p9.gender.toString();
        Settings settings = userM169527p9.settings;
        if (settings == null || (lookingFor = settings.getLookingFor()) == null || (string = lookingFor.toString()) == null) {
            string = "";
        }
        buzzUserInfo.lookingForGender = string;
        buzzUserInfo.vipStatus = userM169527p9.isVIP();
        buzzUserInfo.svipStatus = userM169527p9.isSVIP();
        buzzUserInfo.seeStatus = !xma.m210077h4();
        userM169527p9.vipSeen();
        buzzUserInfo.popLevel = userM169527p9.popLevel;
        if (userM169527p9.status.contains(UserStatus.get("hidden"))) {
            str = Channel.fake;
        } else if (userM169527p9.veryUgly()) {
            str = "inapt";
        } else {
            str = userM169527p9.isBanedOrInactivated() ? "ban" : AIMessageFeedback.good;
        }
        buzzUserInfo.modStatus = str;
        return buzzUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: V4 */
    public final C22306c<LoveBuzzEnvelope> m34561V4(@NotNull String bonusId, @NotNull String type) {
        final String strM31205H0;
        bonusId.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        switch (type) {
            case "voiceBuzz":
                loveBuzzRequestParamsM34567f5.channelToken = bonusId;
                strM31205H0 = C4728a.m31205H0("/bonus");
                strM31205H0.getClass();
                break;
            case "textBuzz":
                loveBuzzRequestParamsM34567f5.conversationId = bonusId;
                strM31205H0 = C4728a.m31197F0("/bonus");
                strM31205H0.getClass();
                break;
            case "videoBuzz":
                loveBuzzRequestParamsM34567f5.channelToken = bonusId;
                strM31205H0 = C4728a.m31201G0("/bonus");
                strM31205H0.getClass();
                break;
            case "memojiBuzz":
                loveBuzzRequestParamsM34567f5.channelToken = bonusId;
                strM31205H0 = C4728a.m31193E0("/bonus");
                strM31205H0.getClass();
                break;
            default:
                return null;
        }
        return this.f72126Q.scheduled("buzz_add_bonus", -1, new v9j() { // from class: l.qm9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34408G3(strM31205H0, loveBuzzRequestParamsM34567f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: W5 */
    public final C22306c<LoveBuzzData> m34562W5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        C22306c<LoveBuzzData> c22306cScheduled = this.f72126Q.scheduled("prolong_media_buzz_time", -1, new v9j() { // from class: l.mn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34438P3(this.f134745a, type, channelToken);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: a6 */
    public final void m34563a6(final String cid, final Message message) {
        this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.io9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34430M4(this.f114114a, cid, message);
            }
        }).compose(C4728a.m31252T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: b5 */
    public final C22306c<LoveBuzzData> m34564b5() {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5("textBuzz");
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.mode = "passive";
        C22306c<LoveBuzzData> c22306cScheduled = this.f72126Q.scheduled("close_text_buzz", -1, new v9j() { // from class: l.bl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34422K3(loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m34565c6() {
        boolean zMo33943x3 = ura.m195053e().m195057d().mo33943x3();
        boolean zM210071e4 = xma.m210071e4();
        if (zMo33943x3 || !zM210071e4) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d6 */
    public final C22306c<LoveBuzzEnvelope> m34566d6(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.channelToken = token;
        return this.f72126Q.scheduled("refuse_media_buzz", -1, new v9j() { // from class: l.en9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34472c4(this.f92286a, type, loveBuzzRequestParamsM34567f5);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: f5 */
    public final LoveBuzzRequestParams m34567f5(String buzzType) {
        String str;
        LoveBuzzData loveBuzzDataMo35099Nk;
        if (CoreModule.m29932K().mo30835xf()) {
            int iHashCode = buzzType.hashCode();
            str = "diamond";
            if (iHashCode != -1019560155) {
                if (iHashCode != 1332422126) {
                    if (iHashCode == 1740758636 && buzzType.equals("memojiBuzz")) {
                        LoveBuzzData loveBuzzDataMo35099Nk2 = CoreModule.f17554l.m94652b().mo35099Nk();
                        if ((loveBuzzDataMo35099Nk2 != null ? loveBuzzDataMo35099Nk2.remainingMemojiBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    } else {
                        loveBuzzDataMo35099Nk = CoreModule.f17554l.m94652b().mo35099Nk();
                        if ((loveBuzzDataMo35099Nk != null ? loveBuzzDataMo35099Nk.remainingTextBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    }
                } else if (buzzType.equals("videoBuzz")) {
                    LoveBuzzData loveBuzzDataMo35099Nk3 = CoreModule.f17554l.m94652b().mo35099Nk();
                    if ((loveBuzzDataMo35099Nk3 != null ? loveBuzzDataMo35099Nk3.remainingVideoBuzz : 0) > 0) {
                        str = "privilege";
                    }
                } else {
                    loveBuzzDataMo35099Nk = CoreModule.f17554l.m94652b().mo35099Nk();
                    if ((loveBuzzDataMo35099Nk != null ? loveBuzzDataMo35099Nk.remainingTextBuzz : 0) > 0) {
                        str = "privilege";
                    }
                }
            } else if (buzzType.equals("voiceBuzz")) {
                LoveBuzzData loveBuzzDataMo35099Nk4 = CoreModule.f17554l.m94652b().mo35099Nk();
                if ((loveBuzzDataMo35099Nk4 != null ? loveBuzzDataMo35099Nk4.remainingVoiceBuzz : 0) > 0) {
                    str = "privilege";
                }
            } else {
                loveBuzzDataMo35099Nk = CoreModule.f17554l.m94652b().mo35099Nk();
                if ((loveBuzzDataMo35099Nk != null ? loveBuzzDataMo35099Nk.remainingTextBuzz : 0) > 0) {
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
    public final C22306c<roj0> m34568f6(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM34567f5.buzzToken = token;
        return this.f72126Q.scheduled("refuse_text_buzz", -1, new v9j() { // from class: l.fn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34541y4(loveBuzzRequestParamsM34567f5);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final void m34569g5(@NotNull final String cid) {
        cid.getClass();
        if (TextUtils.isEmpty(cid)) {
            return;
        }
        this.f72126Q.now(C22306c.fromCallable(new Callable() { // from class: l.fo9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34504m3(this.f98517a, cid);
            }
        }).compose(C4728a.m31252T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public final C22306c<Integer> m34570i5(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.channelToken = channelToken;
        C22306c<Integer> c22306cScheduled = this.f72126Q.scheduled("enter_media_buzz", -1, new v9j() { // from class: l.yl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34456X3(this.f198868a, type, loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: j6 */
    public final C22306c<roj0> m34571j6(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(str);
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM34567f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM34567f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM34567f5.userInfo = m34560U4();
        loveBuzzRequestParamsM34567f5.deviceInfo = m34557S4();
        m34559T4(loveBuzzRequestParamsM34567f5);
        return this.f72126Q.scheduled("report_buzz_passive", -1, new v9j() { // from class: l.ao9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34432N3(loveBuzzRequestParamsM34567f5);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final int m34572m5() {
        Integer num = this.buzzPreferredMcc.get();
        if ((num == null || num.intValue() != -1) && xma.m210071e4()) {
            m34583x5(-1);
            num = -1;
        }
        num.getClass();
        return num.intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: n5 */
    public final C22306c<LoveBuzzData> m34573n5(final int level) {
        final String strUserId = CoreModule.m29931H().userId();
        return this.f72126Q.scheduled("get_combo_buzz_status" + strUserId, 0, new v9j() { // from class: l.ul9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34523s3(strUserId, level);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: n6 */
    public final C22306c<roj0> m34574n6(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.channelToken = channelToken;
        return this.f72126Q.scheduled("report_media_buzz", -1, new v9j() { // from class: l.wl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34388A4(this.f186881a, type, loveBuzzRequestParamsM34567f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: r5, reason: from getter */
    public final hpd0 getLoveBuzzNotifyShown() {
        return this.loveBuzzNotifyShown;
    }

    @NotNull
    /* JADX INFO: renamed from: r6 */
    public final C22306c<Integer> m34576r6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.userId = CoreModule.m29931H().userId();
        loveBuzzRequestParamsM34567f5.mcc = qib0.f154717f0;
        loveBuzzRequestParamsM34567f5.mode = Active.TYPE;
        loveBuzzRequestParamsM34567f5.userInfo = m34560U4();
        loveBuzzRequestParamsM34567f5.deviceInfo = m34557S4();
        m34559T4(loveBuzzRequestParamsM34567f5);
        C22306c<Integer> c22306cScheduled = this.f72126Q.scheduled("search_media_buzz", -1, new v9j() { // from class: l.zl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34475d4(this.f203604a, type, loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: s5 */
    public final String m34577s5(@Nullable String cid) {
        return new uqd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m29931H().userId(), "").get();
    }

    /* JADX INFO: renamed from: t5 */
    public final String m34578t5(String path, String type) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    String strM31193E0 = C4728a.m31193E0(path);
                    strM31193E0.getClass();
                    return strM31193E0;
                }
            } else if (type.equals("videoBuzz")) {
                String strM31201G0 = C4728a.m31201G0(path);
                strM31201G0.getClass();
                return strM31201G0;
            }
        } else if (type.equals("voiceBuzz")) {
            String strM31205H0 = C4728a.m31205H0(path);
            strM31205H0.getClass();
            return strM31205H0;
        }
        String strM31205H1 = C4728a.m31205H0(path);
        strM31205H1.getClass();
        return strM31205H1;
    }

    @NotNull
    /* JADX INFO: renamed from: u5 */
    public final C22393b<Boolean> m34579u5() {
        return this.prolongBuzzTimePs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: v5 */
    public final Message m34580v5(@NotNull String cid, @Nullable List<? extends BreakIce> breakIces) {
        cid.getClass();
        if (vwb.m200296J(breakIces)) {
            return null;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_love_buzz_break_ice);
        messageNew_.cid = cid;
        messageNew_.localInConversation = true;
        messageNew_.localGreetingId = cid;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        Integer num = tpd0Var.get();
        num.getClass();
        messageNew_.localCreatedSession = num.intValue();
        Integer num2 = tpd0Var.get();
        num2.getClass();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(num2.intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        if (messageAdditionalDataNew_ != null) {
            messageAdditionalDataNew_.localBreakIce = breakIces;
        }
        m34563a6(cid, messageNew_);
        return messageNew_;
    }

    /* JADX INFO: renamed from: v6 */
    public final void m34581v6(@Nullable String cid, @NotNull String token) {
        token.getClass();
        new uqd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m29931H().userId(), "").put(token);
    }

    @Nullable
    /* JADX INFO: renamed from: w6 */
    public final C22306c<roj0> m34582w6(@NotNull String channelToken, @NotNull String scene, int duration, @NotNull final String type) {
        channelToken.getClass();
        scene.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.channelToken = channelToken;
        loveBuzzRequestParamsM34567f5.scene = scene;
        loveBuzzRequestParamsM34567f5.duration = duration;
        return this.f72126Q.scheduled("snap_shot_buzz", -1, new v9j() { // from class: l.tl9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34425L3(this.f171006a, type, loveBuzzRequestParamsM34567f5);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m34583x5(int mcc) {
        this.buzzPreferredMcc.put(Integer.valueOf(mcc));
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final C22306c<Integer> m34584y5(@NotNull String channelToken, @NotNull final String type, boolean noFace, boolean noVocal, int errorCode) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM34567f5 = m34567f5(type);
        loveBuzzRequestParamsM34567f5.noFace = noFace;
        loveBuzzRequestParamsM34567f5.noVocal = noVocal;
        loveBuzzRequestParamsM34567f5.channelToken = channelToken;
        loveBuzzRequestParamsM34567f5.errorCode = errorCode;
        C22306c<Integer> c22306cScheduled = this.f72126Q.scheduled("leave_media_buzz", -1, new v9j() { // from class: l.jn9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4752r.m34442Q3(this.f118837a, type, loveBuzzRequestParamsM34567f5);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: E5 */
    public static final LoveBuzzEnvelope m34403E5(LoveBuzzEnvelope loveBuzzEnvelope, roj0 roj0Var) {
        return loveBuzzEnvelope;
    }
}
