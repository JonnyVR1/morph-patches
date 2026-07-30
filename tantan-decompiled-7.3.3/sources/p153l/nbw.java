package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0003J9\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0003J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u0011J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b*\u0010 J\u0017\u0010+\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b+\u0010 J\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u0003J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b/\u0010 J\u0017\u00100\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b0\u0010 J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u0003J\u0017\u00102\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b2\u0010 J\u001f\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b4\u0010.J\u001f\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b5\u0010.J\r\u00106\u001a\u00020\u0004¢\u0006\u0004\b6\u0010\u0003J)\u0010:\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b<\u0010=J3\u0010@\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010\b2\b\u00107\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020\u000e¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u000208¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\u0006\u0010B\u001a\u000208¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bH\u0010.J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0003J\u0015\u0010J\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bJ\u0010 J\u0015\u0010K\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bK\u0010 J\u0015\u0010L\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bL\u0010 J\u0015\u0010M\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bM\u0010 J\u0017\u0010N\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\bN\u0010 J\u0017\u0010O\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\bO\u0010 J\u001f\u0010P\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0004¢\u0006\u0004\bR\u0010\u0003J\r\u0010S\u001a\u00020\u0004¢\u0006\u0004\bS\u0010\u0003J\u0017\u0010T\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\bT\u0010 J\u0015\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u000e¢\u0006\u0004\bV\u0010&J\u001d\u0010W\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bW\u0010.J\r\u0010X\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010\u000bJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b[\u0010\u000bJ\u0015\u0010\\\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\\\u0010\u000bJ\r\u0010]\u001a\u00020\u0004¢\u0006\u0004\b]\u0010\u0003J\r\u0010^\u001a\u00020\u0004¢\u0006\u0004\b^\u0010\u0003J\r\u0010_\u001a\u00020\u0004¢\u0006\u0004\b_\u0010\u0003J\r\u0010`\u001a\u00020\u0004¢\u0006\u0004\b`\u0010\u0003J\u0015\u0010a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\ba\u0010 J\u0015\u0010b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bb\u0010 J\r\u0010c\u001a\u00020\u0004¢\u0006\u0004\bc\u0010\u0003J\r\u0010d\u001a\u00020\u0004¢\u0006\u0004\bd\u0010\u0003J\r\u0010e\u001a\u00020\u0004¢\u0006\u0004\be\u0010\u0003R\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001b\u0010n\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u001b\u0010q\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010h\u001a\u0004\bp\u0010jR\u001b\u0010t\u001a\u00020f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010h\u001a\u0004\bs\u0010jR\u001b\u0010w\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010h\u001a\u0004\bv\u0010jR\u001b\u0010z\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010h\u001a\u0004\by\u0010jR\u001b\u0010}\u001a\u00020f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b{\u0010h\u001a\u0004\b|\u0010jR\u001c\u0010\u0080\u0001\u001a\u00020f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b~\u0010h\u001a\u0004\b\u007f\u0010j¨\u0006\u0081\u0001"}, m88121d2 = {"Ll/nbw;", "", "<init>", "()V", "", "E", "F", "h0", "", "type", "u", "(Ljava/lang/String;)Ljava/lang/String;", "A", BaseSei.f14626Z, "", "first", "i0", "(Ljava/lang/String;Z)V", "filter", "j0", "(Ljava/lang/String;ZZ)V", "f0", "g0", "Ll/pf60;", "pair", "invite", "", "count", "k0", "(Ll/pf60;Ljava/lang/String;ZI)V", "state", "l0", "(Ljava/lang/String;)V", "m0", "suc", "Q", "buzzOpen", "R", "(Z)V", p7f.GPS_DIRECTION_TRUE, p7f.LATITUDE_SOUTH, "P", "x0", "u0", "C0", "B", "(ZLjava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "U", "d0", "t0", BLiveVoiceSingTogehterState.confirm, "w0", "D", "B0", "channelToken", "", BLiveOperationTitleShowType.duration, "a0", "(Ljava/lang/String;Ljava/lang/String;J)V", "Z", "(Ljava/lang/String;Ljava/lang/String;)V", "pairId", "selfJoined", "Y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "tag", "c0", "(J)V", "b0", "(JJ)V", "open", BLiveStormDanmakuGiftResourceType.f45294s, "r", "m", "q", "k", BLiveStormDanmakuGiftResourceType.f45292l, "o", "n", "X", "(JLjava/lang/String;)V", "z0", "y0", "W", "blur", BloodType.f39576O, "N", BaseSei.f14624X, "()Ljava/lang/String;", "w", BaseSei.f14625Y, ResourceDirection.f39656v, "n0", "s0", "p0", "o0", "q0", "r0", "A0", "e0", Constants.KEY_T, "Ll/l4g0;", "a", "Lkotlin/Lazy;", "I", "()Ll/l4g0;", "page_memoji_pop", "b", "K", "page_video_pop", "c", "M", "page_voice_pop", Constants.INAPP_DATA_TAG, "getPage_sum", "page_sum", "e", "G", "page_dlg", "f", "H", "page_first_dlg", "g", "L", "page_voice_call_end", "h", "J", "page_video_call_end", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nbw {

    @NotNull
    public static final nbw INSTANCE = new nbw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_memoji_pop = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.fbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162193a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_video_pop = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162199g();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_voice_pop = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162200h();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_sum = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ibw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162197e();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_dlg = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.jbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162195c();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_first_dlg = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.kbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162194b();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_voice_call_end = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.lbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162196d();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Lazy page_video_call_end = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.mbw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return nbw.m162198f();
        }
    });

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m162191C(nbw nbwVar, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "voiceBuzz";
        }
        nbwVar.m162206B(z, str);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m162192V(nbw nbwVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        nbwVar.m162226U(str);
    }

    /* JADX INFO: renamed from: a */
    public static l4g0 m162193a() {
        return w1e.m204399c("p_intl_buzz_memoji_popup", zo3.class.getName());
    }

    /* JADX INFO: renamed from: b */
    public static l4g0 m162194b() {
        return w1e.m204399c("p_buzz_text_popup_first", zo3.class.getName());
    }

    /* JADX INFO: renamed from: c */
    public static l4g0 m162195c() {
        return w1e.m204399c("p_buzz_text_popup", zo3.class.getName());
    }

    /* JADX INFO: renamed from: d */
    public static l4g0 m162196d() {
        return w1e.m204399c("p_buzz_voice_ending", zo3.class.getName());
    }

    /* JADX INFO: renamed from: e */
    public static l4g0 m162197e() {
        return w1e.m204399c("p_buzz_sum", zo3.class.getName());
    }

    /* JADX INFO: renamed from: f */
    public static l4g0 m162198f() {
        return w1e.m204399c("p_buzz_video_ending", zo3.class.getName());
    }

    /* JADX INFO: renamed from: g */
    public static l4g0 m162199g() {
        return w1e.m204399c("p_intl_buzz_video_popup", zo3.class.getName());
    }

    /* JADX INFO: renamed from: h */
    public static l4g0 m162200h() {
        return w1e.m204399c("p_intl_buzz_voice_popup", zo3.class.getName());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m162201j(nbw nbwVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        nbwVar.m162239i(str);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m162202p(nbw nbwVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        nbwVar.m162250o(str);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m162203v0(nbw nbwVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        nbwVar.m162262u0(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m162204A() {
        i4g0.m138526x("e_intl_tab_buzz", "p_buzz_sum");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m162205A0() {
        i4g0.m138526x("e_video_buzz_show_face_guide", "p_buzz_video_calling");
    }

    /* JADX INFO: renamed from: B */
    public final void m162206B(boolean suc, @NotNull String type) {
        type.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("buzz_state", suc ? "available" : "invalid");
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138523u("e_buzz_video_calling_exit", "p_buzz_video_calling", pf60VarM147494Y);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138523u("e_buzz_memoji_calling_exit", "p_buzz_memoji_calling", pf60VarM147494Y);
        } else {
            i4g0.m138523u("e_buzz_voice_calling_exit", "p_buzz_voice_calling", pf60VarM147494Y);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m162207B0() {
        i4g0.m138520r("e_buzz_warning_confirm", "p_buzz_warning");
    }

    /* JADX INFO: renamed from: C0 */
    public final void m162208C0() {
        i4g0.m138520r("e_buzz_voice_calling_fold", "p_buzz_voice_calling");
    }

    /* JADX INFO: renamed from: D */
    public final void m162209D(boolean confirm, @NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r(confirm ? "e_buzz_video_exit_popup_confirm" : "e_buzz_video_exit_popup_cancel", "p_buzz_video_exit_popup");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r(confirm ? "e_buzz_memoji_exit_popup_confirm" : "e_buzz_memoji_exit_popup_cancel", "p_buzz_memoji_exit_popup");
        } else {
            i4g0.m138520r(confirm ? "e_buzz_voice_calling_exit_confirm" : "e_buzz_voice_calling_exit_cancel", "p_buzz_voice_calling_exit_popup");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m162210E() {
        i4g0.m138523u("e_buzz_text_popup_first_close_btn", "p_buzz_text_popup_first", jyb.m147494Y("buzz_source", "home"));
    }

    /* JADX INFO: renamed from: F */
    public final void m162211F() {
        i4g0.m138523u("e_buzz_text_popup_first_chat_btn", "p_buzz_text_popup_first", jyb.m147494Y("buzz_source", "home"));
    }

    /* JADX INFO: renamed from: G */
    public final l4g0 m162212G() {
        Object value = page_dlg.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: H */
    public final l4g0 m162213H() {
        Object value = page_first_dlg.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: I */
    public final l4g0 m162214I() {
        Object value = page_memoji_pop.getValue();
        value.getClass();
        return (l4g0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final l4g0 m162215J() {
        Object value = page_video_call_end.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: K */
    public final l4g0 m162216K() {
        Object value = page_video_pop.getValue();
        value.getClass();
        return (l4g0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final l4g0 m162217L() {
        Object value = page_voice_call_end.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: M */
    public final l4g0 m162218M() {
        Object value = page_voice_pop.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: N */
    public final void m162219N(boolean blur, @NotNull String type) {
        type.getClass();
        i4g0.m138523u("e_home_buzz_entrance_text_button", "p_suggest_users_home_view", jyb.m147494Y("ui_lovebuzz_type", blur ? "B" : "A"), jyb.m147494Y("swipe_lovebuzz_type", type));
    }

    /* JADX INFO: renamed from: O */
    public final void m162220O(boolean blur) {
        i4g0.m138492A("e_home_buzz_entrance_text_button", "p_suggest_users_home_view", jyb.m147494Y("ui_lovebuzz_type", blur ? "B" : "A"));
    }

    /* JADX INFO: renamed from: P */
    public final void m162221P(boolean suc) {
        i4g0.m138523u("e_buzz_sum_memoji", "p_buzz_sum", jyb.m147494Y("buzz_state", suc ? "success" : "used_up"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m162222Q(@NotNull String type, boolean suc) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -1019560155) {
            if (type.equals("voiceBuzz")) {
                m162225T(suc);
            }
        } else if (iHashCode == 1332422126) {
            if (type.equals("videoBuzz")) {
                m162224S(suc);
            }
        } else if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
            m162221P(suc);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m162223R(boolean buzzOpen) {
        i4g0.m138523u("e_buzz_sum_text", "p_buzz_sum", jyb.m147494Y("buzz_text_state", buzzOpen ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: S */
    public final void m162224S(boolean suc) {
        i4g0.m138523u("e_buzz_sum_video", "p_buzz_sum", jyb.m147494Y("buzz_state", suc ? "success" : "used_up"));
    }

    /* JADX INFO: renamed from: T */
    public final void m162225T(boolean suc) {
        i4g0.m138523u("e_buzz_sum_voice", "p_buzz_sum", jyb.m147494Y("buzz_state", suc ? "success" : "used_up"));
    }

    /* JADX INFO: renamed from: U */
    public final void m162226U(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_buzz_video_calling_like", "p_buzz_video_calling");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_buzz_memoji_calling_like", "p_buzz_memoji_calling");
        } else {
            i4g0.m138520r("e_buzz_voice_calling_like", "p_buzz_voice_calling");
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m162227W(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138495D("e_buzz_video_passive_popup_disappear", "p_intl_buzz_video_popup", new pf60[0]);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138495D("e_buzz_memoji_passive_popup_disappear", "p_intl_buzz_memoji_popup", new pf60[0]);
        } else {
            i4g0.m138495D("e_buzz_voice_passive_popup_disappear", "p_intl_buzz_voice_popup", new pf60[0]);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m162228X(long duration, @NotNull String type) {
        type.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("intl_buzz_duration", Long.valueOf(duration));
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138495D("e_buzz_video_searching_success", "p_buzz_video_searching", pf60VarM147494Y);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138495D("e_buzz_memoji_searching_success", "p_buzz_memoji_searching", pf60VarM147494Y);
        } else {
            i4g0.m138495D("e_buzz_voice_searching_success", "p_buzz_voice_searching", pf60VarM147494Y);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m162229Y(@NotNull String type, @Nullable String pairId, @Nullable String channelToken, boolean selfJoined) {
        type.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("buzz_state", "failed");
        pf60 pf60VarM147494Y2 = jyb.m147494Y("pair_id", pairId);
        pf60 pf60VarM147494Y3 = jyb.m147494Y("channel_token", channelToken);
        pf60 pf60VarM147494Y4 = jyb.m147494Y("self_joined", Boolean.valueOf(selfJoined));
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138495D("e_buzz_video_connecting_state", "p_buzz_video_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138495D("e_buzz_memoji_connecting_state", "p_buzz_memoji_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4);
        } else {
            i4g0.m138495D("e_buzz_voice_connecting_state", "p_buzz_voice_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m162230Z(@NotNull String type, @Nullable String channelToken) {
        type.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("buzz_state", "start");
        pf60 pf60VarM147494Y2 = jyb.m147494Y("channel_token", channelToken);
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138495D("e_buzz_video_connecting_state", "p_buzz_video_connecting", pf60VarM147494Y, pf60VarM147494Y2);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138495D("e_buzz_memoji_connecting_state", "p_buzz_memoji_connecting", pf60VarM147494Y, pf60VarM147494Y2);
        } else {
            i4g0.m138495D("e_buzz_voice_connecting_state", "p_buzz_voice_connecting", pf60VarM147494Y, pf60VarM147494Y2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m162231a0(@NotNull String type, @Nullable String channelToken, long duration) {
        type.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("buzz_state", "success");
        pf60 pf60VarM147494Y2 = jyb.m147494Y("intl_buzz_duration", Long.valueOf(duration));
        pf60 pf60VarM147494Y3 = jyb.m147494Y("channel_token", channelToken);
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138495D("e_buzz_video_connecting_state", "p_buzz_video_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3);
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138495D("e_buzz_memoji_connecting_state", "p_buzz_memoji_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3);
        } else {
            i4g0.m138495D("e_buzz_voice_connecting_state", "p_buzz_voice_connecting", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m162232b0(long duration, long tag) {
        i4g0.m138495D("e_buzz_search_request", "p_buzz_voice_searching", jyb.m147494Y("buzz_state", "success"), jyb.m147494Y("request_tag", String.valueOf(tag)), jyb.m147494Y("intl_buzz_duration", Long.valueOf(duration)));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m162233c0(long tag) {
        i4g0.m138495D("e_buzz_search_request", "p_buzz_voice_searching", jyb.m147494Y("buzz_state", "start"), jyb.m147494Y("request_tag", String.valueOf(tag)));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m162234d0() {
        i4g0.m138520r("e_buzz_switch_memoji", "p_buzz_memoji_calling");
    }

    /* JADX INFO: renamed from: e0 */
    public final void m162235e0() {
        i4g0.m138526x("e_memoji_show_face_guide", "p_buzz_memoji_calling");
    }

    /* JADX INFO: renamed from: f0 */
    public final void m162236f0() {
        i4g0.m138520r("e_buzz_im_no_conv_exit_popup_cancel_btn", "p_buzz_im_no_conv_exit_popup");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m162237g0() {
        i4g0.m138520r("e_buzz_im_no_conv_exit_popup_confirm_btn", "p_buzz_im_no_conv_exit_popup");
    }

    /* JADX INFO: renamed from: h0 */
    public final void m162238h0() {
        i4g0.m138523u("e_buzz_text_popup_close_btn", "p_buzz_text_popup", jyb.m147494Y("buzz_source", "home"));
    }

    /* JADX INFO: renamed from: i */
    public final void m162239i(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_buzz_video_calling_addtime", "p_buzz_video_calling");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_buzz_memoji_calling_addtime", "p_buzz_memoji_calling");
        } else {
            i4g0.m138520r("e_buzz_voice_calling_addtime", "p_buzz_voice_calling");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i0 */
    public final void m162240i0(@NotNull String type, boolean first) {
        type.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                if (type.equals("voiceBuzz")) {
                    i4g0.m138523u("e_intl_buzz_voice_popup_pass", "p_intl_buzz_voice_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
            case -1004163680:
                if (type.equals("textBuzz")) {
                    if (!first) {
                        m162238h0();
                    } else {
                        m162210E();
                    }
                    break;
                }
                break;
            case 1332422126:
                if (type.equals("videoBuzz")) {
                    i4g0.m138523u("e_intl_buzz_video_popup_pass", "p_intl_buzz_video_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
            case 1740758636:
                if (type.equals("memojiBuzz")) {
                    i4g0.m138523u("e_intl_buzz_memoji_popup_pass", "p_intl_buzz_memoji_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j0 */
    public final void m162241j0(@NotNull String type, boolean filter, boolean first) {
        type.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                if (type.equals("voiceBuzz")) {
                    i4g0.m138523u("e_intl_buzz_voice_popup_accept", "p_intl_buzz_voice_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
            case -1004163680:
                if (type.equals("textBuzz")) {
                    if (!first) {
                        i4g0.m138523u("e_buzz_text_popup_chat_btn", "p_buzz_text_popup", jyb.m147494Y("buzz_source", "home"), jyb.m147494Y("buzz_state", filter ? "no_svip" : "success"));
                    } else {
                        m162211F();
                    }
                    break;
                }
                break;
            case 1332422126:
                if (type.equals("videoBuzz")) {
                    i4g0.m138523u("e_intl_buzz_video_popup_accept", "p_intl_buzz_video_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
            case 1740758636:
                if (type.equals("memojiBuzz")) {
                    i4g0.m138523u("e_intl_buzz_memoji_popup_accept", "p_intl_buzz_memoji_popup", jyb.m147494Y("buzz_first_time", first ? "true" : "false"));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX INFO: renamed from: k */
    public final void m162242k(@NotNull String type) {
        String str;
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != -1004163680) {
                if (iHashCode == 1332422126 && type.equals("videoBuzz")) {
                    str = "e_intl_buzz_video_card";
                } else {
                    str = "";
                }
            } else if (type.equals("textBuzz")) {
                str = "e_intl_buzz_text_card";
            } else {
                str = "";
            }
        } else if (type.equals("voiceBuzz")) {
            str = "e_intl_buzz_voice_card";
        } else {
            str = "";
        }
        i4g0.m138520r(str, "p_suggest_users_home_view");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k0 */
    public final void m162243k0(@NotNull pf60<Boolean, Boolean> pair, @NotNull String type, boolean invite, int count) {
        pair.getClass();
        type.getClass();
        Boolean bool = pair.f152156a;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = pair.f152157b;
        bool2.getClass();
        boolean zBooleanValue2 = bool2.booleanValue();
        switch (type.hashCode()) {
            case -1019560155:
                if (type.equals("voiceBuzz")) {
                    m162218M().m152781p(jyb.m147494Y("buzz_first_time", zBooleanValue ? "true" : "false"));
                    if (zBooleanValue2) {
                        w1e.m204402f(m162218M());
                    } else {
                        w1e.m204401e(m162218M());
                    }
                    m162218M().m152781p(new pf60[0]);
                    break;
                }
                break;
            case -1004163680:
                if (type.equals("textBuzz")) {
                    if (!zBooleanValue) {
                        m162212G().m152781p(jyb.m147494Y("buzz_source", "home"), jyb.m147494Y("notify_type", invite ? "invite" : "match"), jyb.m147494Y("buzz_match_count", Integer.valueOf(count)));
                        if (zBooleanValue2) {
                            w1e.m204402f(m162212G());
                        } else {
                            w1e.m204401e(m162212G());
                        }
                        m162212G().m152781p(new pf60[0]);
                    } else {
                        m162213H().m152781p(jyb.m147494Y("buzz_source", "home"), jyb.m147494Y("notify_type", invite ? "invite" : "match"), jyb.m147494Y("buzz_match_count", Integer.valueOf(count)));
                        if (zBooleanValue2) {
                            w1e.m204402f(m162213H());
                        } else {
                            w1e.m204401e(m162213H());
                        }
                        m162213H().m152781p(new pf60[0]);
                    }
                    break;
                }
                break;
            case 1332422126:
                if (type.equals("videoBuzz")) {
                    m162216K().m152781p(jyb.m147494Y("buzz_first_time", zBooleanValue ? "true" : "false"));
                    if (zBooleanValue2) {
                        w1e.m204402f(m162216K());
                    } else {
                        w1e.m204401e(m162216K());
                    }
                    m162216K().m152781p(new pf60[0]);
                    break;
                }
                break;
            case 1740758636:
                if (type.equals("memojiBuzz")) {
                    m162214I().m152781p(jyb.m147494Y("buzz_first_time", zBooleanValue ? "true" : "false"));
                    if (zBooleanValue2) {
                        w1e.m204402f(m162214I());
                    } else {
                        w1e.m204401e(m162214I());
                    }
                    m162214I().m152781p(new pf60[0]);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX INFO: renamed from: l */
    public final void m162244l(@NotNull String type) {
        String str;
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != -1004163680) {
                if (iHashCode == 1332422126 && type.equals("videoBuzz")) {
                    str = "e_intl_buzz_video_card";
                } else {
                    str = "";
                }
            } else if (type.equals("textBuzz")) {
                str = "e_intl_buzz_text_card";
            } else {
                str = "";
            }
        } else if (type.equals("voiceBuzz")) {
            str = "e_intl_buzz_voice_card";
        } else {
            str = "";
        }
        i4g0.m138526x(str, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m162245l0(@NotNull String state) {
        state.getClass();
        i4g0.m138523u("e_intl_buzz_add_time", OMSDialogPositon.p_chat_view, jyb.m147494Y("buzz_state", state));
    }

    /* JADX INFO: renamed from: m */
    public final void m162246m(@NotNull String type) {
        type.getClass();
        i4g0.m138523u("e_intl_buzz_no_pair_popup_back", "p_intl_buzz_no_pair_popup", jyb.m147494Y("buzz_entrance", m162261u(type)));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m162247m0() {
        i4g0.m138526x("e_intl_buzz_add_time", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: n */
    public final void m162248n(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_intl_buzz_video_pass", "p_intl_buzz_video_paired");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_intl_buzz_memoji_pass", "p_intl_buzz_memoji_paired");
        } else {
            i4g0.m138520r("e_intl_buzz_voice_pass", "p_intl_buzz_voice_paired");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m162249n0() {
        i4g0.m138520r("e_buzz_region_choose", "p_buzz_area_screening_popup");
    }

    /* JADX INFO: renamed from: o */
    public final void m162250o(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138526x("e_intl_buzz_video_pass", "p_intl_buzz_video_paired");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138526x("e_intl_buzz_memoji_pass", "p_intl_buzz_memoji_paired");
        } else {
            i4g0.m138526x("e_intl_buzz_voice_pass", "p_intl_buzz_voice_paired");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m162251o0() {
        i4g0.m138520r("e_buzz_area", "p_buzz_sum");
    }

    /* JADX INFO: renamed from: p0 */
    public final void m162252p0() {
        i4g0.m138526x("e_buzz_area", "p_buzz_sum");
    }

    /* JADX INFO: renamed from: q */
    public final void m162253q(@NotNull String type) {
        type.getClass();
        i4g0.m138523u("e_intl_buzz_quit_popup_pair", "p_intl_buzz_quit_popup", jyb.m147494Y("buzz_entrance", m162261u(type)));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m162254q0(@NotNull String type) {
        type.getClass();
        i4g0.m138523u("e_buzz_searching_region_cancel", "p_buzz_searching_region_nomatch", jyb.m147494Y("buzz_entrance", m162261u(type)));
    }

    /* JADX INFO: renamed from: r */
    public final void m162255r() {
        i4g0.m138520r("e_intl_buzz_premium_icon", "p_buzz_sum");
    }

    /* JADX INFO: renamed from: r0 */
    public final void m162256r0(@NotNull String type) {
        type.getClass();
        i4g0.m138523u("e_buzz_searching_region_switch", "p_buzz_searching_region_nomatch", jyb.m147494Y("buzz_entrance", m162261u(type)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX INFO: renamed from: s */
    public final void m162257s(boolean open, @NotNull String type) {
        String str;
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    str = "e_intl_love_buzz_world_popup";
                } else {
                    str = "e_intl_buzz_text_popup";
                }
            } else if (type.equals("videoBuzz")) {
                str = "e_intl_buzz_video_popup";
            } else {
                str = "e_intl_buzz_text_popup";
            }
        } else if (type.equals("voiceBuzz")) {
            str = "e_intl_buzz_voice_popup";
        } else {
            str = "e_intl_buzz_text_popup";
        }
        i4g0.m138523u(str, "p_privacy_and_permission_settings_view", jyb.m147494Y("buzz_switch_status", open ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m162258s0() {
        i4g0.m138520r("e_buzz_region_setup", "p_buzz_area_screening_popup");
    }

    /* JADX INFO: renamed from: t */
    public final void m162259t() {
        i4g0.m138520r("e_extra_buzz_confirm", "p_extra_buzz_confirm");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m162260t0(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_buzz_video_report_reason_cancel", "p_buzz_video_report_reason");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_buzz_memoji_report_reason_cancel", "p_buzz_memoji_report_reason");
        } else {
            i4g0.m138520r("e_buzz_voice_callingg_report_popup_cancel", "p_buzz_voice_calling_report_reason");
        }
    }

    /* JADX INFO: renamed from: u */
    public final String m162261u(String type) {
        switch (type.hashCode()) {
            case -1019560155:
                return !type.equals("voiceBuzz") ? "" : "voice";
            case -1004163680:
                return !type.equals("textBuzz") ? "" : "text";
            case 1332422126:
                return !type.equals("videoBuzz") ? "" : "video";
            case 1740758636:
                return !type.equals("memojiBuzz") ? "" : "memoji";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m162262u0(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_buzz_video_calling_report", "p_buzz_video_calling");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_buzz_memoji_calling_report", "p_buzz_memoji_calling");
        } else {
            i4g0.m138520r("e_buzz_voice_calling_report", "p_buzz_voice_calling");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final String m162263v(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -1019560155) {
            return type.equals("voiceBuzz") ? "p_suggest_users_home_view,e_intl_buzz_voice_card,click" : "";
        }
        if (iHashCode != -1004163680) {
            return (iHashCode == 1332422126 && type.equals("videoBuzz")) ? "p_suggest_users_home_view,e_intl_buzz_video_card,click" : "";
        }
        return !type.equals("textBuzz") ? "" : "p_suggest_users_home_view,e_intl_buzz_text_card,click";
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m162264w(@NotNull String type) {
        type.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                return type.equals("voiceBuzz") ? "p_buzz_sum,e_buzz_sum_voice,click" : "";
            case -1004163680:
                return !type.equals("textBuzz") ? "" : "p_buzz_sum,e_buzz_sum_text,click";
            case 1332422126:
                return !type.equals("videoBuzz") ? "" : "p_buzz_sum,e_buzz_sum_video,click";
            case 1740758636:
                return !type.equals("memojiBuzz") ? "" : "p_buzz_sum,e_buzz_sum_memoji,click";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m162265w0(boolean confirm, @NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r(confirm ? "e_buzz_video_report_popup_confirm" : "e_buzz_video_report_popup_cancel", "p_buzz_video_report_popup");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r(confirm ? "e_buzz_memoji_report_popup_confirm" : "e_buzz_memoji_report_popup_cancel", "p_buzz_memoji_report_popup");
        } else {
            i4g0.m138520r(confirm ? "e_buzz_voice_calling_report_confirm" : "e_buzz_voice_calling_report_cancel", "p_buzz_voice_calling_report_popup");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m162266x() {
        return "p_suggest_users_home_view,e_home_buzz_entrance_text_button,click";
    }

    /* JADX INFO: renamed from: x0 */
    public final void m162267x0(@NotNull String type) {
        type.getClass();
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            i4g0.m138520r("e_buzz_video_searching_close_btn", "p_buzz_video_searching");
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            i4g0.m138520r("e_buzz_memoji_searching_close_btn", "p_buzz_memoji_searching");
        } else {
            i4g0.m138520r("e_buzz_voice_searching_close_btn", "p_buzz_voice_searching");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m162268y(@NotNull String type) {
        type.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                return type.equals("voiceBuzz") ? "p_intl_buzz_voice_popup,e_intl_buzz_voice_popup_accept,click" : "";
            case -1004163680:
                return !type.equals("textBuzz") ? "" : "p_buzz_text_popup,e_buzz_text_popup_chat_btn,click";
            case 1332422126:
                return !type.equals("videoBuzz") ? "" : "p_intl_buzz_video_popup,e_intl_buzz_video_popup_accept,click";
            case 1740758636:
                return !type.equals("memojiBuzz") ? "" : "p_intl_buzz_video_popup,e_intl_buzz_memoji_popup_accept,click";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m162269y0() {
        i4g0.m138520r("e_intl_buzz_button_limit", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: z */
    public final void m162270z() {
        i4g0.m138520r("e_intl_tab_buzz", "p_buzz_sum");
    }

    /* JADX INFO: renamed from: z0 */
    public final void m162271z0() {
        i4g0.m138526x("e_intl_buzz_button_limit", OMSDialogPositon.p_chat_view);
    }
}
