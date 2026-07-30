package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0178r;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.BuzzDeviceInfo;
import com.p1.mobile.putong.core.data.BuzzUserInfo;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationLoveBuzz;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.data.LoveBuzzEnvelope;
import com.p1.mobile.putong.core.data.LoveBuzzRequestParams;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.OrderedColumn;
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
import l.d30;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.ndq0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import p006l.ura;
import p006l.xma;
import rx.c;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ~2\u00020\u0001:\u0001\u007fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010,J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b;\u0010#J\u0015\u0010<\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b<\u0010#J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020%0 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b=\u0010,J%\u0010?\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J?\u0010E\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020%¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bG\u0010,J'\u0010H\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bH\u0010@J'\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bI\u0010@J'\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010@J7\u0010M\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020%2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010O\u001a\u00020A2\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bR\u0010@J'\u0010S\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010 2\u0006\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\bS\u0010@J-\u0010W\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bW\u0010XJ-\u0010Y\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 2\u0006\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bY\u0010XJ'\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010 2\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b[\u0010@J'\u0010_\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\\¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020%¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020%¢\u0006\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020A0n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/api/r;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "coreApi", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "path", "type", "t5", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cid", "Lcom/p1/mobile/putong/core/data/Message;", "message", "", "a6", "(Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Message;)V", "w5", "(Lcom/p1/mobile/putong/core/data/Message;)V", "Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "U4", "()Lcom/p1/mobile/putong/core/data/BuzzUserInfo;", "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "S4", "()Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", "params", "T4", "(Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;)V", "buzzType", "f5", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LoveBuzzRequestParams;", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "K5", "()Lrx/c;", "b5", "", "level", "n5", "(I)Lrx/c;", "token", "Lcom/p1/mobile/putong/core/data/LoveBuzzEnvelope;", "Q4", "(Ljava/lang/String;)Lrx/c;", "Ll/roj0;", "f6", "Lcom/p1/mobile/putong/core/data/Conversation;", "conv", "C5", "(Lcom/p1/mobile/putong/core/data/Conversation;Ljava/lang/String;)V", "userId", "S5", "c6", "()V", "s5", "(Ljava/lang/String;)Ljava/lang/String;", "v6", "(Ljava/lang/String;Ljava/lang/String;)V", "A6", "I6", "r6", "channelToken", "i5", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "", "noFace", "noVocal", "errorCode", "y5", "(Ljava/lang/String;Ljava/lang/String;ZZI)Lrx/c;", "E6", "n6", "W5", "G5", "scene", "duration", "w6", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lrx/c;", "toggle", "M6", "(ZLjava/lang/String;)Lrx/c;", "O4", "d6", "voiceBuzzToggle", "videoBuzzToggle", "memojiBuzzToggle", "O5", "(ZZZ)Lrx/c;", "j6", "bonusId", "V4", "", "Lcom/p1/mobile/putong/core/data/BreakIce;", "breakIces", "v5", "(Ljava/lang/String;Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Message;", "g5", "(Ljava/lang/String;)V", "mcc", "x5", "(I)V", "m5", "()I", "Ll/hpd0;", "R", "Ll/hpd0;", "r5", "()Ll/hpd0;", "loveBuzzNotifyShown", "Lrx/subjects/b;", "S", "Lrx/subjects/b;", "u5", "()Lrx/subjects/b;", "prolongBuzzTimePs", "T", "Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;", "getDeviceInfo", "setDeviceInfo", "(Lcom/p1/mobile/putong/core/data/BuzzDeviceInfo;)V", "deviceInfo", "Ll/tpd0;", "U", "Ll/tpd0;", "buzzPreferredMcc", "Companion", "a", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C0178r extends ax6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final hpd0 loveBuzzNotifyShown;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final b<Boolean> prolongBuzzTimePs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public BuzzDeviceInfo deviceInfo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final tpd0 buzzPreferredMcc;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/putong/core/api/r$a;", "", "<init>", "()V", "", "d", "()I", "c", "b", "a", "", "LOVE_BUZZ_TOKEN", "Ljava/lang/String;", "TAG", "DEFAULT_MEDIA", "VIDEO_BUZZ", "MEMOJI_BUZZ", "TEXT_BUZZ", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final int m6522a() {
            return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17385t3() : CoreModule.f1534c.f3559H0.m27541n4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final int m6523b() {
            return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17386u3() : CoreModule.f1534c.f3559H0.m27543o4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final int m6524c() {
            return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17387v3() : CoreModule.f1534c.f3559H0.m27545p4();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final int m6525d() {
            return CoreModule.m1851K().xf() ? CoreModule.f1534c.f3562I0.m17388w3() : CoreModule.f1534c.f3559H0.m27547q4();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178r(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.loveBuzzNotifyShown = new hpd0("love_buzz_notify_shown" + CoreModule.m1850H().userId(), Boolean.FALSE);
        b<Boolean> bVarB = b.b();
        bVarB.getClass();
        this.prolongBuzzTimePs = bVarB;
        this.buzzPreferredMcc = new tpd0("buzz_preferred_mcc" + CoreModule.m1850H().userId(), -1);
    }

    /* JADX INFO: renamed from: A4 */
    public static c m6325A4(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.mm9
            public final Object call() {
                return C0178r.m6449o6(this.f17078a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.om9
            public final Object invoke(Object obj) {
                return C0178r.m6453p6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.pm9
            public final Object call(Object obj) {
                return C0178r.m6457q6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: A5 */
    public static final Integer m6326A5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Integer m6329B5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B6 */
    public static final stc0 m6330B6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/status")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: C6 */
    public static final roj0 m6333C6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: D4 */
    public static c m6335D4(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.ml9
            public final Object call() {
                return C0178r.m6344F6(this.f17022a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.nl9
            public final Object invoke(Object obj) {
                return C0178r.m6347G6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.ol9
            public final Object call(Object obj) {
                return C0178r.m6351H6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: D5 */
    public static final stc0 m6336D5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/match")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: D6 */
    public static final roj0 m6337D6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F5 */
    public static final LoveBuzzEnvelope m6343F5(Function1 function1, Object obj) {
        return (LoveBuzzEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F6 */
    public static final stc0 m6344F6(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/status", str)).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: G3 */
    public static c m6345G3(final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m16572f(new v9j() { // from class: l.ln9
            public final Object call() {
                return C0178r.m6392W4(str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: G6 */
    public static final roj0 m6347G6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: H5 */
    public static final stc0 m6350H5(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/like", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: H6 */
    public static final roj0 m6351H6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public static final LoveBuzzData m6354I5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: J5 */
    public static final LoveBuzzData m6357J5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J6 */
    public static final stc0 m6358J6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/status")).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: K3 */
    public static c m6359K3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.jm9
            public final Object call() {
                return C0178r.m6410c5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.km9
            public final Object invoke(Object obj) {
                return C0178r.m6413d5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.lm9
            public final Object call(Object obj) {
                return C0178r.m6416e5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: K4 */
    public static c m6360K4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.pl9
            public final Object call() {
                return C0178r.m6377P5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.ql9
            public final Object invoke(Object obj) {
                return C0178r.m6380Q5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.sl9
            public final Object call(Object obj) {
                return C0178r.m6383R5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: K6 */
    public static final roj0 m6361K6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: L3 */
    public static c m6362L3(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.um9
            public final Object call() {
                return C0178r.m6476x6(this.f23637a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.vm9
            public final Object invoke(Object obj) {
                return C0178r.m6479y6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.wm9
            public final Object call(Object obj) {
                return C0178r.m6483z6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: L5 */
    public static final stc0 m6364L5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/status")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: L6 */
    public static final roj0 m6365L6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static roj0 m6367M4(final C0178r c0178r, final String str, final Message message) {
        c0178r.f8580Q.f3598U.m13685a(new d30() { // from class: l.zk9
            public final void call() {
                C0178r.m6407b6(str, c0178r, message);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: M5 */
    public static final LoveBuzzData m6368M5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: N3 */
    public static c m6369N3(final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.eo9
            public final Object call() {
                return C0178r.m6436k6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.go9
            public final Object invoke(Object obj) {
                return C0178r.m6440l6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.ho9
            public final Object call(Object obj) {
                return C0178r.m6443m6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: N5 */
    public static final LoveBuzzData m6371N5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N6 */
    public static final stc0 m6372N6(C0178r c0178r, String str, boolean z, LoveBuzzRequestParams loveBuzzRequestParams) {
        stc0.a aVarQ = C0154a.f3483P.auth().q(c0178r.m6515t5("/status", str));
        return z ? aVarQ.l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b() : aVarQ.e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: O6 */
    public static final LoveBuzzData m6374O6(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: P3 */
    public static c m6375P3(final C0178r c0178r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5(str);
        loveBuzzRequestParamsM6504f5.channelToken = str2;
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.xn9
            public final Object call() {
                return C0178r.m6395X5(this.f27618a, str, loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.yn9
            public final Object invoke(Object obj) {
                return C0178r.m6398Y5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.zn9
            public final Object call(Object obj) {
                return C0178r.m6401Z5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: P4 */
    public static final stc0 m6376P4(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/invite", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: P5 */
    public static final stc0 m6377P5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/buzz/status")).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: P6 */
    public static final LoveBuzzData m6378P6(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static c m6379Q3(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.fl9
            public final Object call() {
                return C0178r.m6482z5(this.f12758a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hl9
            public final Object invoke(Object obj) {
                return C0178r.m6326A5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.il9
            public final Object call(Object obj) {
                return C0178r.m6329B5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: Q5 */
    public static final roj0 m6380Q5(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: R4 */
    public static final stc0 m6382R4(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/invite")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: R5 */
    public static final roj0 m6383R5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T5 */
    public static final stc0 m6386T5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/priv/prolong")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: U5 */
    public static final Integer m6388U5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: V5 */
    public static final Integer m6390V5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W4 */
    public static final stc0 m6392W4(String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: X3 */
    public static c m6393X3(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.xm9
            public final Object call() {
                return C0178r.m6432j5(this.f27604a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.zm9
            public final Object invoke(Object obj) {
                return C0178r.m6435k5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.an9
            public final Object call(Object obj) {
                return C0178r.m6439l5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: X4 */
    public static final int m6394X4() {
        return INSTANCE.m6522a();
    }

    /* JADX INFO: renamed from: X5 */
    public static final stc0 m6395X5(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/prolong", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: Y3 */
    public static c m6396Y3(C0178r c0178r, String str) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.otherUserId = str;
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.qn9
            public final Object call() {
                return C0178r.m6386T5(loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.rn9
            public final Object invoke(Object obj) {
                return C0178r.m6388U5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.sn9
            public final Object call(Object obj) {
                return C0178r.m6390V5(function1, obj);
            }
        });
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y4 */
    public static final int m6397Y4() {
        return INSTANCE.m6523b();
    }

    /* JADX INFO: renamed from: Y5 */
    public static final LoveBuzzData m6398Y5(LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope != null) {
            return loveBuzzEnvelope.data;
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z4 */
    public static final int m6400Z4() {
        return INSTANCE.m6524c();
    }

    /* JADX INFO: renamed from: Z5 */
    public static final LoveBuzzData m6401Z5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static c m6403a4(C0178r c0178r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.mode = "active";
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.jl9
            public final Object call() {
                return C0178r.m6330B6(loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.kl9
            public final Object invoke(Object obj) {
                return C0178r.m6333C6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.ll9
            public final Object call(Object obj) {
                return C0178r.m6337D6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    @JvmStatic
    /* JADX INFO: renamed from: a5 */
    public static final int m6404a5() {
        return INSTANCE.m6525d();
    }

    /* JADX INFO: renamed from: b6 */
    public static final void m6407b6(String str, C0178r c0178r, Message message) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            conversationQuery.hasLocalBreakIce = true;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
            Iterator it = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_love_buzz_break_ice")}), ((OrderedColumn) Message.CREATEDTIME).DESC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
            c0178r.m6473w5(message);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public static c m6408c3(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static c m6409c4(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m16572f(new v9j() { // from class: l.tn9
            public final Object call() {
                return C0178r.m6417e6(this.f22189a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: c5 */
    public static final stc0 m6410c5(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/status")).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: d4 */
    public static c m6412d4(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.gn9
            public final Object call() {
                return C0178r.m6462s6(this.f13404a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hn9
            public final Object invoke(Object obj) {
                return C0178r.m6465t6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.in9
            public final Object call(Object obj) {
                return C0178r.m6468u6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: d5 */
    public static final LoveBuzzData m6413d5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: e4 */
    public static c m6415e4(final C0178r c0178r, final String str, final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m16572f(new v9j() { // from class: l.am9
            public final Object call() {
                return C0178r.m6376P4(this.f8361a, str, loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: e5 */
    public static final LoveBuzzData m6416e5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e6 */
    public static final stc0 m6417e6(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/invite", str)).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: g6 */
    public static final stc0 m6422g6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3127F0("/invite")).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: h4 */
    public static c m6424h4(C0178r c0178r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.mode = "active";
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.bm9
            public final Object call() {
                return C0178r.m6358J6(loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.dm9
            public final Object invoke(Object obj) {
                return C0178r.m6361K6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.em9
            public final Object call(Object obj) {
                return C0178r.m6365L6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m6425h5(String str) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery) && conversationQuery.hasLocalBreakIce) {
            Iterator it = CoreModule.f1542k.f11195c.query(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_love_buzz_break_ice")}), ((OrderedColumn) Message.CREATEDTIME).ASC, 0).iterator();
            while (it.hasNext()) {
                CoreModule.f1542k.f11195c.delete(((DbObject) ((Message) it.next())).id);
            }
            conversationQuery.hasLocalBreakIce = false;
            CoreModule.f1542k.f11205m.upsert(conversationQuery);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public static final roj0 m6426h6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: i6 */
    public static final roj0 m6429i6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j3 */
    public static c m6430j3(final C0178r c0178r, final String str, String str2) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5(str);
        loveBuzzRequestParamsM6504f5.channelToken = str2;
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.bo9
            public final Object call() {
                return C0178r.m6350H5(this.f9011a, str, loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.co9
            public final Object invoke(Object obj) {
                return C0178r.m6354I5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.do9
            public final Object call(Object obj) {
                return C0178r.m6357J5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: j4 */
    public static c m6431j4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m16572f(new v9j() { // from class: l.vl9
            public final Object call() {
                return C0178r.m6336D5(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: j5 */
    public static final stc0 m6432j5(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/session", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: k5 */
    public static final Integer m6435k5(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: k6 */
    public static final stc0 m6436k6(LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/buzz/status")).m(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: l5 */
    public static final Integer m6439l5(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l6 */
    public static final roj0 m6440l6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: m3 */
    public static Unit m6441m3(C0178r c0178r, final String str) {
        c0178r.f8580Q.f3598U.m13685a(new d30() { // from class: l.al9
            public final void call() {
                C0178r.m6425h5(str);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final roj0 m6443m6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static c m6445n4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        return ia20.m16572f(new v9j() { // from class: l.wn9
            public final Object call() {
                return C0178r.m6382R4(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: o5 */
    public static final stc0 m6448o5(String str, int i) {
        return C0154a.f3483P.auth().q(C0154a.m3130G("/buzz/status?uid=" + str + "&mcc=" + qib0.f19808f0 + "&dl=" + i)).f().b();
    }

    /* JADX INFO: renamed from: o6 */
    public static final stc0 m6449o6(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/report", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: p5 */
    public static final LoveBuzzData m6452p5(LoveBuzzEnvelope loveBuzzEnvelope) {
        loveBuzzEnvelope.getClass();
        return loveBuzzEnvelope.data;
    }

    /* JADX INFO: renamed from: p6 */
    public static final roj0 m6453p6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: q3 */
    public static void m6454q3(C0178r c0178r, LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code == 0) {
            c0178r.prolongBuzzTimePs.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q5 */
    public static final LoveBuzzData m6456q5(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q6 */
    public static final roj0 m6457q6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m6458r3(Throwable th) {
    }

    /* JADX INFO: renamed from: s3 */
    public static c m6460s3(final String str, final int i) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.bn9
            public final Object call() {
                return C0178r.m6448o5(str, i);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.cn9
            public final Object invoke(Object obj) {
                return C0178r.m6452p5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.dn9
            public final Object call(Object obj) {
                return C0178r.m6456q5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: s4 */
    public static c m6461s4(C0178r c0178r) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.textBuzzToggle = true;
        loveBuzzRequestParamsM6504f5.mode = "passive";
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.gm9
            public final Object call() {
                return C0178r.m6364L5(loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.hm9
            public final Object invoke(Object obj) {
                return C0178r.m6368M5((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.im9
            public final Object call(Object obj) {
                return C0178r.m6371N5(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: s6 */
    public static final stc0 m6462s6(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/status", str)).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: t6 */
    public static final Integer m6465t6(LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        return Integer.valueOf((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? 400 : meta.code);
    }

    /* JADX INFO: renamed from: u6 */
    public static final Integer m6468u6(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static c m6470v4(C0178r c0178r, String str, final LoveBuzzEnvelope loveBuzzEnvelope) {
        if (loveBuzzEnvelope.meta.code != 0) {
            return c.just(loveBuzzEnvelope);
        }
        c0178r.m6518v6(str, "");
        c<roj0> cVarM4832ap = CoreModule.f1534c.f3631f0.m4832ap(str);
        final Function1 function1 = new Function1() { // from class: l.cl9
            public final Object invoke(Object obj) {
                return C0178r.m6340E5(loveBuzzEnvelope, (roj0) obj);
            }
        };
        return cVarM4832ap.map(new w9j() { // from class: l.dl9
            public final Object call(Object obj) {
                return C0178r.m6343F5(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private final void m6473w5(Message message) {
        Message message2;
        List listJ = CoreModule.f1542k.f11195c.m26896W(message.cid).j();
        if (!vwb.J(listJ) && (message2 = (Message) listJ.get(0)) != null) {
            message.createdTime = message2.createdTime + 1.0d;
        }
        CoreModule.f1542k.f11195c.upsert(message);
    }

    /* JADX INFO: renamed from: x3 */
    public static c m6474x3(final C0178r c0178r, final String str, final boolean z) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = c0178r.m6504f5(str);
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.mode = "passive";
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.rm9
            public final Object call() {
                return C0178r.m6372N6(this.f20627a, str, z, loveBuzzRequestParamsM6504f5);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.sm9
            public final Object invoke(Object obj) {
                return C0178r.m6374O6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.tm9
            public final Object call(Object obj) {
                return C0178r.m6378P6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: x6 */
    public static final stc0 m6476x6(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5(str, "/snapshot")).l(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: y4 */
    public static c m6478y4(final LoveBuzzRequestParams loveBuzzRequestParams) {
        c cVarM16572f = ia20.m16572f(new v9j() { // from class: l.nn9
            public final Object call() {
                return C0178r.m6422g6(loveBuzzRequestParams);
            }
        }, LoveBuzzEnvelope.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.on9
            public final Object invoke(Object obj) {
                return C0178r.m6426h6((LoveBuzzEnvelope) obj);
            }
        };
        return cVarM16572f.map(new w9j() { // from class: l.pn9
            public final Object call(Object obj) {
                return C0178r.m6429i6(function1, obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: y6 */
    public static final roj0 m6479y6(LoveBuzzEnvelope loveBuzzEnvelope) {
        return roj0.a;
    }

    /* JADX INFO: renamed from: z5 */
    public static final stc0 m6482z5(C0178r c0178r, String str, LoveBuzzRequestParams loveBuzzRequestParams) {
        return C0154a.f3483P.auth().q(c0178r.m6515t5("/session", str)).e(utc0.create(Network.JSON, loveBuzzRequestParams.toJson())).b();
    }

    /* JADX INFO: renamed from: z6 */
    public static final roj0 m6483z6(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A6 */
    public final c<roj0> m6484A6() {
        return this.f8580Q.scheduled("start_search_text_buzz", -1, new v9j() { // from class: l.ym9
            public final Object call() {
                return C0178r.m6403a4(this.f28299a);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public final void m6485C5(@Nullable Conversation conv, @NotNull String token) {
        token.getClass();
        if (conv == null) {
            return;
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.buzzToken = token;
        if (NullChecker.a(conv.property) && NullChecker.a(conv.property.intl_love_buzz)) {
            ConversationLoveBuzz conversationLoveBuzz = conv.property.intl_love_buzz;
            loveBuzzRequestParamsM6504f5.expire = conversationLoveBuzz.expire;
            loveBuzzRequestParamsM6504f5.prolonged = conversationLoveBuzz.prolonged;
            loveBuzzRequestParamsM6504f5.notBlur = conversationLoveBuzz.notBlur;
        }
        final String str = conv.otherUser;
        str.getClass();
        c cVarScheduled = this.f8580Q.scheduled("match_text_buzz", -1, new v9j() { // from class: l.vk9
            public final Object call() {
                return C0178r.m6431j4(loveBuzzRequestParamsM6504f5);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gl9
            public final Object invoke(Object obj) {
                return C0178r.m6470v4(this.f13357a, str, (LoveBuzzEnvelope) obj);
            }
        };
        cVarScheduled.flatMap(new w9j() { // from class: l.rl9
            public final Object call(Object obj) {
                return C0178r.m6408c3(function1, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.cm9
            public final void call(Object obj) {
                C0178r.m6454q3(this.f9730a, (LoveBuzzEnvelope) obj);
            }
        }, new e30() { // from class: l.nm9
            public final void call(Object obj) {
                C0178r.m6458r3((Throwable) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: E6 */
    public final c<roj0> m6486E6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        m6496T4(loveBuzzRequestParamsM6504f5);
        return this.f8580Q.scheduled("stop_media_buzz", -1, new v9j() { // from class: l.un9
            public final Object call() {
                return C0178r.m6335D4(this.f23665a, type, loveBuzzRequestParamsM6504f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: G5 */
    public final c<LoveBuzzData> m6487G5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        c<LoveBuzzData> cVarScheduled = this.f8580Q.scheduled("media_buzz_like_peer", -1, new v9j() { // from class: l.vn9
            public final Object call() {
                return C0178r.m6430j3(this.f24387a, type, channelToken);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final c<roj0> m6488I6() {
        return this.f8580Q.scheduled("stop_search_text_buzz", -1, new v9j() { // from class: l.xk9
            public final Object call() {
                return C0178r.m6424h4(this.f27562a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: K5 */
    public final c<LoveBuzzData> m6489K5() {
        c<LoveBuzzData> cVarScheduled = this.f8580Q.scheduled("open_text_buzz", -1, new v9j() { // from class: l.xl9
            public final Object call() {
                return C0178r.m6461s4(this.f27581a);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    public final c<LoveBuzzData> m6490M6(final boolean toggle, @NotNull final String type) {
        type.getClass();
        c<LoveBuzzData> cVarScheduled = this.f8580Q.scheduled("switch_media_buzz", -1, new v9j() { // from class: l.el9
            public final Object call() {
                return C0178r.m6474x3(this.f11234a, type, toggle);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final c<LoveBuzzEnvelope> m6491O4(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.channelToken = token;
        c<LoveBuzzEnvelope> cVarScheduled = this.f8580Q.scheduled("accept_media_buzz", -1, new v9j() { // from class: l.yk9
            public final Object call() {
                return C0178r.m6415e4(this.f28261a, type, loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: O5 */
    public final c<roj0> m6492O5(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(str);
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM6504f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM6504f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM6504f5.userInfo = m6497U4();
        m6496T4(loveBuzzRequestParamsM6504f5);
        return this.f8580Q.scheduled("out_media_buzz_pool", -1, new v9j() { // from class: l.wk9
            public final Object call() {
                return C0178r.m6360K4(loveBuzzRequestParamsM6504f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final c<LoveBuzzEnvelope> m6493Q4(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM6504f5.buzzToken = token;
        c<LoveBuzzEnvelope> cVarScheduled = this.f8580Q.scheduled("accept_text_buzz", -1, new v9j() { // from class: l.fm9
            public final Object call() {
                return C0178r.m6445n4(loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: S4 */
    public final BuzzDeviceInfo m6494S4() {
        if (!NullChecker.a(this.deviceInfo)) {
            BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
            this.deviceInfo = buzzDeviceInfo;
            buzzDeviceInfo.screenWidth = xdl0.y0();
            BuzzDeviceInfo buzzDeviceInfo2 = this.deviceInfo;
            if (buzzDeviceInfo2 != null) {
                buzzDeviceInfo2.screenHeight = xdl0.w0();
            }
            BuzzDeviceInfo buzzDeviceInfo3 = this.deviceInfo;
            if (buzzDeviceInfo3 != null) {
                buzzDeviceInfo3.memorySize = (int) (ndq0.j(App.e) / 1048576);
            }
        }
        BuzzDeviceInfo buzzDeviceInfo4 = this.deviceInfo;
        return buzzDeviceInfo4 == null ? new BuzzDeviceInfo() : buzzDeviceInfo4;
    }

    @NotNull
    /* JADX INFO: renamed from: S5 */
    public final c<Integer> m6495S5(@NotNull final String userId) {
        userId.getClass();
        c<Integer> cVarScheduled = this.f8580Q.scheduled("prolong_love_buzz_time", -1, new v9j() { // from class: l.kn9
            public final Object call() {
                return C0178r.m6396Y3(this.f15913a, userId);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: T4 */
    public final void m6496T4(LoveBuzzRequestParams params) {
        int iM6509m5 = m6509m5();
        if (iM6509m5 == 0) {
            params.preferredMcc = qib0.f19808f0;
        } else if (iM6509m5 != -1) {
            params.preferredMcc = iM6509m5;
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final BuzzUserInfo m6497U4() {
        String string;
        String str;
        LookingFor lookingFor;
        User userM21490p9 = this.f8580Q.f3628e0.m21490p9();
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        if (!NullChecker.a(userM21490p9)) {
            return buzzUserInfo;
        }
        Integer num = userM21490p9.age;
        num.getClass();
        buzzUserInfo.age = num.intValue();
        buzzUserInfo.gender = userM21490p9.gender.toString();
        Settings settings = userM21490p9.settings;
        if (settings == null || (lookingFor = settings.getLookingFor()) == null || (string = lookingFor.toString()) == null) {
            string = "";
        }
        buzzUserInfo.lookingForGender = string;
        buzzUserInfo.vipStatus = userM21490p9.isVIP();
        buzzUserInfo.svipStatus = userM21490p9.isSVIP();
        buzzUserInfo.seeStatus = !xma.m27385h4();
        userM21490p9.vipSeen();
        buzzUserInfo.popLevel = userM21490p9.popLevel;
        if (userM21490p9.status.contains(UserStatus.get("hidden"))) {
            str = "fake";
        } else if (userM21490p9.veryUgly()) {
            str = "inapt";
        } else {
            str = userM21490p9.isBanedOrInactivated() ? "ban" : "good";
        }
        buzzUserInfo.modStatus = str;
        return buzzUserInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: V4 */
    public final c<LoveBuzzEnvelope> m6498V4(@NotNull String bonusId, @NotNull String type) {
        final String strM3135H0;
        bonusId.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        switch (type) {
            case "voiceBuzz":
                loveBuzzRequestParamsM6504f5.channelToken = bonusId;
                strM3135H0 = C0154a.m3135H0("/bonus");
                strM3135H0.getClass();
                break;
            case "textBuzz":
                loveBuzzRequestParamsM6504f5.conversationId = bonusId;
                strM3135H0 = C0154a.m3127F0("/bonus");
                strM3135H0.getClass();
                break;
            case "videoBuzz":
                loveBuzzRequestParamsM6504f5.channelToken = bonusId;
                strM3135H0 = C0154a.m3131G0("/bonus");
                strM3135H0.getClass();
                break;
            case "memojiBuzz":
                loveBuzzRequestParamsM6504f5.channelToken = bonusId;
                strM3135H0 = C0154a.m3123E0("/bonus");
                strM3135H0.getClass();
                break;
            default:
                return null;
        }
        return this.f8580Q.scheduled("buzz_add_bonus", -1, new v9j() { // from class: l.qm9
            public final Object call() {
                return C0178r.m6345G3(strM3135H0, loveBuzzRequestParamsM6504f5);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: W5 */
    public final c<LoveBuzzData> m6499W5(@NotNull final String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        c<LoveBuzzData> cVarScheduled = this.f8580Q.scheduled("prolong_media_buzz_time", -1, new v9j() { // from class: l.mn9
            public final Object call() {
                return C0178r.m6375P3(this.f17124a, type, channelToken);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: a6 */
    public final void m6500a6(final String cid, final Message message) {
        this.f8580Q.now(c.fromCallable(new Callable() { // from class: l.io9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0178r.m6367M4(this.f14586a, cid, message);
            }
        }).compose(C0154a.m3182T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: b5 */
    public final c<LoveBuzzData> m6501b5() {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5("textBuzz");
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.mode = "passive";
        c<LoveBuzzData> cVarScheduled = this.f8580Q.scheduled("close_text_buzz", -1, new v9j() { // from class: l.bl9
            public final Object call() {
                return C0178r.m6359K3(loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m6502c6() {
        boolean zM5880x3 = ura.m25555e().m25559d().m5880x3();
        boolean zM27379e4 = xma.m27379e4();
        if (zM5880x3 || !zM27379e4) {
            CoreModule.f1534c.f3544C0.m27420u4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d6 */
    public final c<LoveBuzzEnvelope> m6503d6(@NotNull String token, @NotNull final String type) {
        token.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.channelToken = token;
        return this.f8580Q.scheduled("refuse_media_buzz", -1, new v9j() { // from class: l.en9
            public final Object call() {
                return C0178r.m6409c4(this.f11283a, type, loveBuzzRequestParamsM6504f5);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: f5 */
    public final LoveBuzzRequestParams m6504f5(String buzzType) {
        String str;
        LoveBuzzData loveBuzzDataMo7036Nk;
        if (CoreModule.m1851K().xf()) {
            int iHashCode = buzzType.hashCode();
            str = "diamond";
            if (iHashCode != -1019560155) {
                if (iHashCode != 1332422126) {
                    if (iHashCode == 1740758636 && buzzType.equals("memojiBuzz")) {
                        LoveBuzzData loveBuzzDataMo7036Nk2 = CoreModule.f1543l.m11707b().mo7036Nk();
                        if ((loveBuzzDataMo7036Nk2 != null ? loveBuzzDataMo7036Nk2.remainingMemojiBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    } else {
                        loveBuzzDataMo7036Nk = CoreModule.f1543l.m11707b().mo7036Nk();
                        if ((loveBuzzDataMo7036Nk != null ? loveBuzzDataMo7036Nk.remainingTextBuzz : 0) > 0) {
                            str = "privilege";
                        }
                    }
                } else if (buzzType.equals("videoBuzz")) {
                    LoveBuzzData loveBuzzDataMo7036Nk3 = CoreModule.f1543l.m11707b().mo7036Nk();
                    if ((loveBuzzDataMo7036Nk3 != null ? loveBuzzDataMo7036Nk3.remainingVideoBuzz : 0) > 0) {
                        str = "privilege";
                    }
                } else {
                    loveBuzzDataMo7036Nk = CoreModule.f1543l.m11707b().mo7036Nk();
                    if ((loveBuzzDataMo7036Nk != null ? loveBuzzDataMo7036Nk.remainingTextBuzz : 0) > 0) {
                        str = "privilege";
                    }
                }
            } else if (buzzType.equals("voiceBuzz")) {
                LoveBuzzData loveBuzzDataMo7036Nk4 = CoreModule.f1543l.m11707b().mo7036Nk();
                if ((loveBuzzDataMo7036Nk4 != null ? loveBuzzDataMo7036Nk4.remainingVoiceBuzz : 0) > 0) {
                    str = "privilege";
                }
            } else {
                loveBuzzDataMo7036Nk = CoreModule.f1543l.m11707b().mo7036Nk();
                if ((loveBuzzDataMo7036Nk != null ? loveBuzzDataMo7036Nk.remainingTextBuzz : 0) > 0) {
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
    public final c<roj0> m6505f6(@Nullable String token) {
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5("textBuzz");
        if (token == null) {
            token = "";
        }
        loveBuzzRequestParamsM6504f5.buzzToken = token;
        return this.f8580Q.scheduled("refuse_text_buzz", -1, new v9j() { // from class: l.fn9
            public final Object call() {
                return C0178r.m6478y4(loveBuzzRequestParamsM6504f5);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final void m6506g5(@NotNull final String cid) {
        cid.getClass();
        if (TextUtils.isEmpty(cid)) {
            return;
        }
        this.f8580Q.now(c.fromCallable(new Callable() { // from class: l.fo9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0178r.m6441m3(this.f12814a, cid);
            }
        }).compose(C0154a.m3182T2()));
    }

    @NotNull
    /* JADX INFO: renamed from: i5 */
    public final c<Integer> m6507i5(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.channelToken = channelToken;
        c<Integer> cVarScheduled = this.f8580Q.scheduled("enter_media_buzz", -1, new v9j() { // from class: l.yl9
            public final Object call() {
                return C0178r.m6393X3(this.f28285a, type, loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: j6 */
    public final c<roj0> m6508j6(boolean voiceBuzzToggle, boolean videoBuzzToggle, boolean memojiBuzzToggle) {
        String str;
        if (voiceBuzzToggle) {
            str = "voiceBuzz";
        } else {
            str = videoBuzzToggle ? "videoBuzz" : "memojiBuzz";
        }
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(str);
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.voiceBuzzToggle = voiceBuzzToggle;
        loveBuzzRequestParamsM6504f5.videoBuzzToggle = videoBuzzToggle;
        loveBuzzRequestParamsM6504f5.memojiBuzzToggle = memojiBuzzToggle;
        loveBuzzRequestParamsM6504f5.userInfo = m6497U4();
        loveBuzzRequestParamsM6504f5.deviceInfo = m6494S4();
        m6496T4(loveBuzzRequestParamsM6504f5);
        return this.f8580Q.scheduled("report_buzz_passive", -1, new v9j() { // from class: l.ao9
            public final Object call() {
                return C0178r.m6369N3(loveBuzzRequestParamsM6504f5);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final int m6509m5() {
        Integer num = (Integer) this.buzzPreferredMcc.get();
        if ((num == null || num.intValue() != -1) && xma.m27379e4()) {
            m6520x5(-1);
            num = -1;
        }
        num.getClass();
        return num.intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: n5 */
    public final c<LoveBuzzData> m6510n5(final int level) {
        final String strUserId = CoreModule.m1850H().userId();
        return this.f8580Q.scheduled("get_combo_buzz_status" + strUserId, 0, new v9j() { // from class: l.ul9
            public final Object call() {
                return C0178r.m6460s3(strUserId, level);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: n6 */
    public final c<roj0> m6511n6(@NotNull String channelToken, @NotNull final String type) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.channelToken = channelToken;
        return this.f8580Q.scheduled("report_media_buzz", -1, new v9j() { // from class: l.wl9
            public final Object call() {
                return C0178r.m6325A4(this.f25217a, type, loveBuzzRequestParamsM6504f5);
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
    public final c<Integer> m6513r6(@NotNull final String type) {
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.userId = CoreModule.m1850H().userId();
        loveBuzzRequestParamsM6504f5.mcc = qib0.f19808f0;
        loveBuzzRequestParamsM6504f5.mode = "active";
        loveBuzzRequestParamsM6504f5.userInfo = m6497U4();
        loveBuzzRequestParamsM6504f5.deviceInfo = m6494S4();
        m6496T4(loveBuzzRequestParamsM6504f5);
        c<Integer> cVarScheduled = this.f8580Q.scheduled("search_media_buzz", -1, new v9j() { // from class: l.zl9
            public final Object call() {
                return C0178r.m6412d4(this.f28802a, type, loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: s5 */
    public final String m6514s5(@Nullable String cid) {
        return (String) new uqd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m1850H().userId(), "").get();
    }

    /* JADX INFO: renamed from: t5 */
    public final String m6515t5(String path, String type) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    String strM3123E0 = C0154a.m3123E0(path);
                    strM3123E0.getClass();
                    return strM3123E0;
                }
            } else if (type.equals("videoBuzz")) {
                String strM3131G0 = C0154a.m3131G0(path);
                strM3131G0.getClass();
                return strM3131G0;
            }
        } else if (type.equals("voiceBuzz")) {
            String strM3135H0 = C0154a.m3135H0(path);
            strM3135H0.getClass();
            return strM3135H0;
        }
        String strM3135H1 = C0154a.m3135H0(path);
        strM3135H1.getClass();
        return strM3135H1;
    }

    @NotNull
    /* JADX INFO: renamed from: u5 */
    public final b<Boolean> m6516u5() {
        return this.prolongBuzzTimePs;
    }

    @Nullable
    /* JADX INFO: renamed from: v5 */
    public final Message m6517v5(@NotNull String cid, @Nullable List<? extends BreakIce> breakIces) {
        cid.getClass();
        if (vwb.J(breakIces)) {
            return null;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_love_buzz_break_ice");
        messageNew_.cid = cid;
        messageNew_.localInConversation = true;
        messageNew_.localGreetingId = cid;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.m1850H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m1850H().userId();
        tpd0 tpd0Var = App.i;
        Object obj = tpd0Var.get();
        obj.getClass();
        messageNew_.localCreatedSession = ((Number) obj).intValue();
        Object obj2 = tpd0Var.get();
        obj2.getClass();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Number) obj2).intValue());
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        if (messageAdditionalDataNew_ != null) {
            messageAdditionalDataNew_.localBreakIce = breakIces;
        }
        m6500a6(cid, messageNew_);
        return messageNew_;
    }

    /* JADX INFO: renamed from: v6 */
    public final void m6518v6(@Nullable String cid, @NotNull String token) {
        token.getClass();
        new uqd0("intl.lovebuzz.token" + cid + "_" + CoreModule.m1850H().userId(), "").put(token);
    }

    @Nullable
    /* JADX INFO: renamed from: w6 */
    public final c<roj0> m6519w6(@NotNull String channelToken, @NotNull String scene, int duration, @NotNull final String type) {
        channelToken.getClass();
        scene.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.channelToken = channelToken;
        loveBuzzRequestParamsM6504f5.scene = scene;
        loveBuzzRequestParamsM6504f5.duration = duration;
        return this.f8580Q.scheduled("snap_shot_buzz", -1, new v9j() { // from class: l.tl9
            public final Object call() {
                return C0178r.m6362L3(this.f22171a, type, loveBuzzRequestParamsM6504f5);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public final void m6520x5(int mcc) {
        this.buzzPreferredMcc.put(Integer.valueOf(mcc));
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final c<Integer> m6521y5(@NotNull String channelToken, @NotNull final String type, boolean noFace, boolean noVocal, int errorCode) {
        channelToken.getClass();
        type.getClass();
        final LoveBuzzRequestParams loveBuzzRequestParamsM6504f5 = m6504f5(type);
        loveBuzzRequestParamsM6504f5.noFace = noFace;
        loveBuzzRequestParamsM6504f5.noVocal = noVocal;
        loveBuzzRequestParamsM6504f5.channelToken = channelToken;
        loveBuzzRequestParamsM6504f5.errorCode = errorCode;
        c<Integer> cVarScheduled = this.f8580Q.scheduled("leave_media_buzz", -1, new v9j() { // from class: l.jn9
            public final Object call() {
                return C0178r.m6379Q3(this.f15283a, type, loveBuzzRequestParamsM6504f5);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: E5 */
    public static final LoveBuzzEnvelope m6340E5(LoveBuzzEnvelope loveBuzzEnvelope, roj0 roj0Var) {
        return loveBuzzEnvelope;
    }
}
