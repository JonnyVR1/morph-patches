package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.bu40;
import p153l.cg4;
import p153l.eyv;
import p153l.f45;
import p153l.fpq;
import p153l.fx50;
import p153l.g45;
import p153l.gg60;
import p153l.gle0;
import p153l.h45;
import p153l.hpq;
import p153l.l6f;
import p153l.mpq;
import p153l.npq;
import p153l.p7f;
import p153l.pr3;
import p153l.ptm;
import p153l.r0q;
import p153l.s0q;
import p153l.sze;
import p153l.to5;
import p153l.u9c;
import p153l.usm;
import p153l.uyp;
import p153l.v5d0;
import p153l.w5d0;
import p153l.woq;
import p153l.wtq0;
import p153l.yt40;
import p153l.yzv;
import p153l.z5e;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
@Metadata(m88120d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n¾\u0001¿\u0001À\u0001Á\u0001Â\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u0010\t\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u00020\u00142\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010AJ\u0019\u0010E\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bI\u0010JJ#\u0010K\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\bN\u0010OJ*\u0010Q\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010P\u001a\u00020M2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bQ\u0010RJ)\u0010T\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010S\u001a\u00020M2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u0004\u0018\u00010M*\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020Y2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\\\u0010:J%\u0010]\u001a\u00020\u00142\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b]\u0010?J%\u0010_\u001a\u0004\u0018\u00010\n2\b\u0010=\u001a\u0004\u0018\u00010\n2\b\u0010^\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b_\u0010JJ\u0019\u0010a\u001a\u00020\u00142\b\u0010`\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0004¢\u0006\u0004\bc\u00108J\u000f\u0010d\u001a\u00020\u0014H\u0014¢\u0006\u0004\bd\u0010eJ\u0011\u0010h\u001a\u00060fj\u0002`g¢\u0006\u0004\bh\u0010iJ#\u0010k\u001a\u00060fj\u0002`g*\u00020\u000f2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010YH\u0004¢\u0006\u0004\bk\u0010lJ6\u0010r\u001a\u00020q2'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bn\u0012\b\bo\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140mj\u0002`p¢\u0006\u0004\br\u0010sJF\u0010u\u001a\u00020q2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bn\u0012\b\bo\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140mj\u0002`p¢\u0006\u0004\bu\u0010vJ'\u0010w\u001a\u00020q2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u0014H\u0086@¢\u0006\u0004\by\u0010:J\u0017\u0010z\u001a\u00020\u00142\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0004\bz\u00106J\u001f\u0010{\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010fj\u0004\u0018\u0001`gH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020YH\u0014¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00142\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0084\u0001\u0010#J\u0019\u0010\u0085\u0001\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0005\b\u0085\u0001\u0010#J\u001c\u0010\u0086\u0001\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u00060fj\u0002`gH\u0016¢\u0006\u0005\b\u0088\u0001\u0010iJ\u001c\u0010\u0089\u0001\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001d\u0010\u008a\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u008a\u0001\u0010AJ\u0019\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00142\u0007\u0010\u008e\u0001\u001a\u00020\u000fH\u0010¢\u0006\u0006\b\u008f\u0001\u0010\u0080\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0006\b\u0090\u0001\u0010\u0080\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00042\u0007\u0010\u008e\u0001\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0091\u0001\u0010#J\u001c\u0010\u0092\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0011\u0010\u0095\u0001\u001a\u00020YH\u0016¢\u0006\u0005\b\u0095\u0001\u0010~J\u0011\u0010\u0096\u0001\u001a\u00020YH\u0007¢\u0006\u0005\b\u0096\u0001\u0010~J\u0011\u0010\u0097\u0001\u001a\u00020YH\u0010¢\u0006\u0005\b\u0097\u0001\u0010~J\u0012\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000f¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0014\u0010\u009a\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u009c\u0001\u0010:R\u001e\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010CR\u0019\u0010¢\u0001\u001a\u0007\u0012\u0002\b\u00030\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R0\u0010¨\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010\u008b\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010`\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010\u009b\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u00108R\u0013\u0010¯\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b®\u0001\u00108R\u0013\u0010°\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b°\u0001\u00108R\u0016\u0010²\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u00108R\u001b\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010¸\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u00108R\u0016\u0010º\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u00108R\u0016\u0010¼\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010»\u00018\u0002X\u0082\u0004R\u0015\u0010½\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0»\u00018\u0002X\u0082\u0004¨\u0006Ã\u0001"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/o;", "Ll/h45;", "Ll/gg60;", "", Active.TYPE, "<init>", "(Z)V", "Lkotlinx/coroutines/JobSupport$c;", "state", "", "proposedUpdate", "i0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "m0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", p7f.GPS_DIRECTION_TRUE, "(Ljava/lang/Throwable;Ljava/util/List;)V", "Ll/ptm;", "update", "Y0", "(Ll/ptm;Ljava/lang/Object;)Z", "f0", "(Ll/ptm;Ljava/lang/Object;)V", "Ll/yt40;", "list", "cause", "H0", "(Ll/yt40;Ljava/lang/Throwable;)V", "c0", "(Ljava/lang/Throwable;)Z", "I0", "", "T0", "(Ljava/lang/Object;)I", "Lkotlinx/coroutines/n;", "handler", "onCancelling", "Ll/hpq;", "E0", "(Lkotlinx/coroutines/n;Z)Ll/hpq;", "expect", "node", "R", "(Ljava/lang/Object;Ll/yt40;Ll/hpq;)Z", "Ll/sze;", "O0", "(Ll/sze;)V", "P0", "(Ll/hpq;)V", "z0", "()Z", "A0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/gle0;", "select", "ignoredParam", "Q0", "(Ll/gle0;Ljava/lang/Object;)V", "b0", "(Ljava/lang/Object;)Ljava/lang/Object;", "h0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "B0", "p0", "(Ll/ptm;)Ll/yt40;", "Z0", "(Ll/ptm;Ljava/lang/Throwable;)Z", "a1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "b1", "(Ll/ptm;Ljava/lang/Object;)Ljava/lang/Object;", "Ll/g45;", "j0", "(Ll/ptm;)Ll/g45;", "child", "c1", "(Lkotlinx/coroutines/JobSupport$c;Ll/g45;Ljava/lang/Object;)Z", "lastChild", "g0", "(Lkotlinx/coroutines/JobSupport$c;Ll/g45;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "G0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ll/g45;", "", "U0", "(Ljava/lang/Object;)Ljava/lang/String;", "X", "K0", LovePlanetStage.result, "J0", "parent", "w0", "(Lkotlinx/coroutines/o;)V", "start", "N0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "M", "()Ljava/util/concurrent/CancellationException;", "message", "V0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/CompletionHandler;", "Ll/z5e;", "u", "(Lkotlin/jvm/functions/Function1;)Ll/z5e;", "invokeImmediately", "J", "(ZZLkotlin/jvm/functions/Function1;)Ll/z5e;", "x0", "(ZZLkotlinx/coroutines/n;)Ll/z5e;", p7f.LATITUDE_SOUTH, "R0", "n", "(Ljava/util/concurrent/CancellationException;)V", "d0", "()Ljava/lang/String;", "a0", "(Ljava/lang/Throwable;)V", "parentJob", "F", "(Ll/gg60;)V", "e0", "Y", "Z", "(Ljava/lang/Object;)Z", "N", "C0", "D0", "Ll/f45;", "Q", "(Ll/h45;)Ll/f45;", "exception", "v0", "L0", "u0", "M0", "(Ljava/lang/Object;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "toString", "X0", "F0", "I", "()Ljava/lang/Throwable;", "k0", "()Ljava/lang/Object;", "W", "l0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Constants.KEY_KEY, "value", "q0", "()Ll/f45;", "S0", "(Ll/f45;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/o;", "r0", "k", "isActive", "m", "isCompleted", "isCancelled", "o0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "H", "()Lkotlin/sequences/Sequence;", "children", "y0", "isScopedCoroutine", "n0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "a", "b", "c", Constants.INAPP_DATA_TAG, "e", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class JobSupport implements InterfaceC15593o, h45, gg60 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67354a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67355b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$a */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport$a;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/c;", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/JobSupport;", "job", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "Lkotlinx/coroutines/o;", "parent", "", Constants.KEY_T, "(Lkotlinx/coroutines/o;)Ljava/lang/Throwable;", "", "M", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Lkotlinx/coroutines/JobSupport;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15504a<T> extends C15514c<T> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final JobSupport job;

        public C15504a(@NotNull Continuation<? super T> continuation, @NotNull JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.C15514c
        @NotNull
        /* JADX INFO: renamed from: M */
        public String mo94599M() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C15514c
        @NotNull
        /* JADX INFO: renamed from: t */
        public Throwable mo94600t(@NotNull InterfaceC15593o parent) {
            Throwable thM94608d;
            Object objM94591r0 = this.job.m94591r0();
            if (!(objM94591r0 instanceof C15506c) || (thM94608d = ((C15506c) objM94591r0).m94608d()) == null) {
                return objM94591r0 instanceof to5 ? ((to5) objM94591r0).cause : parent.mo94544M();
            }
            return thM94608d;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$b */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport$b;", "Ll/hpq;", "Lkotlinx/coroutines/JobSupport;", "parent", "Lkotlinx/coroutines/JobSupport$c;", "state", "Ll/g45;", "child", "", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Ll/g45;Ljava/lang/Object;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/JobSupport;", "f", "Lkotlinx/coroutines/JobSupport$c;", "g", "Ll/g45;", "h", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15505b extends hpq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final JobSupport parent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final C15506c state;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final g45 child;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        public C15505b(@NotNull JobSupport jobSupport, @NotNull C15506c c15506c, @NotNull g45 g45Var, @Nullable Object obj) {
            this.parent = jobSupport;
            this.state = c15506c;
            this.child = g45Var;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC15592n
        /* JADX INFO: renamed from: a */
        public void mo94601a(@Nullable Throwable cause) {
            this.parent.m94577g0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$c */
    @Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001018\u0002X\u0082\u0004R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b018\u0002X\u0082\u0004¨\u00066"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Ll/ptm;", "Ll/yt40;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Ll/yt40;ZLjava/lang/Throwable;)V", "proposedException", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "Ll/yt40;", "getList", "()Ll/yt40;", "value", RXScreenCaptureService.KEY_INDEX, "()Z", "m", "(Z)V", Constants.INAPP_DATA_TAG, "()Ljava/lang/Throwable;", "o", "j", "isSealed", "h", "isCancelling", "k", "isActive", "c", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "_rootCause", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15506c implements ptm {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f67361b = AtomicIntegerFieldUpdater.newUpdater(C15506c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f67362c = AtomicReferenceFieldUpdater.newUpdater(C15506c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f67363d = AtomicReferenceFieldUpdater.newUpdater(C15506c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final yt40 list;

        public C15506c(@NotNull yt40 yt40Var, boolean z, @Nullable Throwable th) {
            this.list = yt40Var;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX INFO: renamed from: a */
        public final void m94605a(@NotNull Throwable exception) {
            Throwable thM94608d = m94608d();
            if (thM94608d == null) {
                m94616o(exception);
                return;
            }
            if (exception == thM94608d) {
                return;
            }
            Object objM94607c = m94607c();
            if (objM94607c == null) {
                m94615n(exception);
                return;
            }
            if (!(objM94607c instanceof Throwable)) {
                if (objM94607c instanceof ArrayList) {
                    ((ArrayList) objM94607c).add(exception);
                    return;
                } else {
                    mpq.m159379a("State is ", objM94607c);
                    return;
                }
            }
            if (exception == objM94607c) {
                return;
            }
            ArrayList<Throwable> arrayListM94606b = m94606b();
            arrayListM94606b.add(objM94607c);
            arrayListM94606b.add(exception);
            m94615n(arrayListM94606b);
        }

        /* JADX INFO: renamed from: b */
        public final ArrayList<Throwable> m94606b() {
            return new ArrayList<>(4);
        }

        /* JADX INFO: renamed from: c */
        public final Object m94607c() {
            return f67363d.get(this);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Throwable m94608d() {
            return (Throwable) f67362c.get(this);
        }

        @Override // p153l.ptm
        @NotNull
        public yt40 getList() {
            return this.list;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m94609h() {
            return m94608d() != null;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m94610i() {
            return f67361b.get(this) != 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m94611j() {
            return m94607c() == npq.f143120e;
        }

        @Override // p153l.ptm
        /* JADX INFO: renamed from: k */
        public boolean getIsActive() {
            return m94608d() == null;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final List<Throwable> m94613l(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayListM94606b;
            Object objM94607c = m94607c();
            if (objM94607c == null) {
                arrayListM94606b = m94606b();
            } else if (objM94607c instanceof Throwable) {
                ArrayList<Throwable> arrayListM94606b2 = m94606b();
                arrayListM94606b2.add(objM94607c);
                arrayListM94606b = arrayListM94606b2;
            } else {
                if (!(objM94607c instanceof ArrayList)) {
                    mpq.m159379a("State is ", objM94607c);
                    return null;
                }
                arrayListM94606b = (ArrayList) objM94607c;
            }
            Throwable thM94608d = m94608d();
            if (thM94608d != null) {
                arrayListM94606b.add(0, thM94608d);
            }
            if (proposedException != null && !Intrinsics.m88377d(proposedException, thM94608d)) {
                arrayListM94606b.add(proposedException);
            }
            m94615n(npq.f143120e);
            return arrayListM94606b;
        }

        /* JADX INFO: renamed from: m */
        public final void m94614m(boolean z) {
            f67361b.set(this, z ? 1 : 0);
        }

        /* JADX INFO: renamed from: n */
        public final void m94615n(Object obj) {
            f67363d.set(this, obj);
        }

        /* JADX INFO: renamed from: o */
        public final void m94616o(@Nullable Throwable th) {
            f67362c.set(this, th);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m94609h() + ", completing=" + m94610i() + ", rootCause=" + m94608d() + ", exceptions=" + m94607c() + ", list=" + getList() + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$d */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport$d;", "Ll/hpq;", "Ll/gle0;", "select", "<init>", "(Lkotlinx/coroutines/JobSupport;Ll/gle0;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/gle0;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public final class C15507d extends hpq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final gle0<?> select;

        public C15507d(gle0<?> gle0Var) {
            this.select = gle0Var;
        }

        @Override // kotlinx.coroutines.InterfaceC15592n
        /* JADX INFO: renamed from: a */
        public void mo94601a(@Nullable Throwable cause) {
            Object objM94591r0 = JobSupport.this.m94591r0();
            if (!(objM94591r0 instanceof to5)) {
                objM94591r0 = npq.m164243h(objM94591r0);
            }
            this.select.mo95205f(JobSupport.this, objM94591r0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$e */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lkotlinx/coroutines/JobSupport$e;", "Ll/hpq;", "Ll/gle0;", "select", "<init>", "(Lkotlinx/coroutines/JobSupport;Ll/gle0;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/gle0;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public final class C15508e extends hpq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final gle0<?> select;

        public C15508e(gle0<?> gle0Var) {
            this.select = gle0Var;
        }

        @Override // kotlinx.coroutines.InterfaceC15592n
        /* JADX INFO: renamed from: a */
        public void mo94601a(@Nullable Throwable cause) {
            this.select.mo95205f(JobSupport.this, Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$f */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"kotlinx/coroutines/JobSupport$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "g", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15509f extends LockFreeLinkedListNode.AbstractC15586a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ JobSupport f67369d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f67370e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15509f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f67369d = jobSupport;
            this.f67370e = obj;
        }

        @Override // p153l.l31
        @Nullable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object mo94617e(@NotNull LockFreeLinkedListNode affected) {
            if (this.f67369d.m94591r0() == this.f67370e) {
                return null;
            }
            return eyv.m123269a();
        }
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? npq.f143122g : npq.f143121f;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ CancellationException m94525W0(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: toCancellationException");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.m94560V0(th, str);
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m94528A0(Continuation<? super Unit> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        cg4.m109663a(c15514c, JobKt__JobKt.m94518m(this, false, false, new w5d0(c15514c), 3, null));
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final Object m94529B0(Object cause) throws Throwable {
        Object[] objArr = 0;
        Throwable thM94578h0 = null;
        while (true) {
            Object objM94591r0 = m94591r0();
            if (objM94591r0 instanceof C15506c) {
                synchronized (objM94591r0) {
                    if (((C15506c) objM94591r0).m94611j()) {
                        return npq.f143119d;
                    }
                    boolean zM94609h = ((C15506c) objM94591r0).m94609h();
                    if (cause != null || !zM94609h) {
                        if (thM94578h0 == null) {
                            thM94578h0 = m94578h0(cause);
                        }
                        ((C15506c) objM94591r0).m94605a(thM94578h0);
                    }
                    Throwable thM94608d = zM94609h ? null : ((C15506c) objM94591r0).m94608d();
                    if (thM94608d != null) {
                        m94537H0(((C15506c) objM94591r0).getList(), thM94608d);
                    }
                    return npq.f143116a;
                }
            }
            if (!(objM94591r0 instanceof ptm)) {
                return npq.f143119d;
            }
            if (thM94578h0 == null) {
                thM94578h0 = m94578h0(cause);
            }
            ptm ptmVar = (ptm) objM94591r0;
            if (!ptmVar.getIsActive()) {
                Object objM94569a1 = m94569a1(objM94591r0, new to5(thM94578h0, false, 2, objArr == true ? 1 : 0));
                if (objM94569a1 == npq.f143116a) {
                    mpq.m159379a("Cannot happen in ", objM94591r0);
                    return null;
                }
                if (objM94569a1 != npq.f143118c) {
                    return objM94569a1;
                }
            } else if (m94567Z0(ptmVar, thM94578h0)) {
                return npq.f143116a;
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m94530C0(@Nullable Object proposedUpdate) {
        Object objM94569a1;
        do {
            objM94569a1 = m94569a1(m94591r0(), proposedUpdate);
            if (objM94569a1 == npq.f143116a) {
                return false;
            }
            if (objM94569a1 == npq.f143117b) {
                return true;
            }
        } while (objM94569a1 == npq.f143118c);
        mo94559V(objM94569a1);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: D0 */
    public final Object m94531D0(@Nullable Object proposedUpdate) {
        Object objM94569a1;
        do {
            objM94569a1 = m94569a1(m94591r0(), proposedUpdate);
            if (objM94569a1 == npq.f143116a) {
                yzv.m218057a("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, m94583l0(proposedUpdate));
                return null;
            }
        } while (objM94569a1 == npq.f143118c);
        return objM94569a1;
    }

    /* JADX INFO: renamed from: E0 */
    public final hpq m94532E0(InterfaceC15592n handler, boolean onCancelling) {
        hpq s0qVar;
        if (onCancelling) {
            s0qVar = handler instanceof woq ? (woq) handler : null;
            if (s0qVar == null) {
                s0qVar = new r0q(handler);
            }
        } else {
            s0qVar = handler instanceof hpq ? (hpq) handler : null;
            if (s0qVar == null) {
                s0qVar = new s0q(handler);
            }
        }
        s0qVar.m136580v(this);
        return s0qVar;
    }

    @Override // p153l.h45
    /* JADX INFO: renamed from: F */
    public final void mo94533F(@NotNull gg60 parentJob) throws Throwable {
        m94566Z(parentJob);
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo94534F0() {
        return u9c.m195086a(this);
    }

    /* JADX INFO: renamed from: G0 */
    public final g45 m94535G0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo95097p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m95096l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m95095j();
            if (!lockFreeLinkedListNode.mo95097p()) {
                if (lockFreeLinkedListNode instanceof g45) {
                    return (g45) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof yt40) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: H */
    public final Sequence<InterfaceC15593o> mo94536H() {
        return SequencesKt__SequenceBuilderKt.m94153b(new JobSupport$children$1(this, null));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m94537H0(yt40 list, Throwable cause) throws Throwable {
        mo94543L0(cause);
        Object objM95094i = list.m95094i();
        objM95094i.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM95095j = (LockFreeLinkedListNode) objM95094i; !Intrinsics.m88377d(lockFreeLinkedListNodeM95095j, list); lockFreeLinkedListNodeM95095j = lockFreeLinkedListNodeM95095j.m95095j()) {
            if (lockFreeLinkedListNodeM95095j instanceof woq) {
                hpq hpqVar = (hpq) lockFreeLinkedListNodeM95095j;
                try {
                    hpqVar.mo94601a(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        l6f.m153058a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + hpqVar + " for " + this, th);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo94594v0(completionHandlerException);
        }
        m94572c0(cause);
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final Throwable m94538I() {
        Object objM94591r0 = m94591r0();
        if (!(objM94591r0 instanceof ptm)) {
            return m94583l0(objM94591r0);
        }
        wtq0.m207906a("This job has not completed yet");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m94539I0(yt40 yt40Var, Throwable th) throws Throwable {
        Object objM95094i = yt40Var.m95094i();
        objM95094i.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM95095j = (LockFreeLinkedListNode) objM95094i; !Intrinsics.m88377d(lockFreeLinkedListNodeM95095j, yt40Var); lockFreeLinkedListNodeM95095j = lockFreeLinkedListNodeM95095j.m95095j()) {
            if (lockFreeLinkedListNodeM95095j instanceof hpq) {
                hpq hpqVar = (hpq) lockFreeLinkedListNodeM95095j;
                try {
                    hpqVar.mo94601a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        l6f.m153058a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + hpqVar + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo94594v0(completionHandlerException);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: J */
    public final z5e mo94540J(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return m94596x0(onCancelling, invokeImmediately, new InterfaceC15592n.a(handler));
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m94541J0(Object ignoredParam, Object result) throws Throwable {
        if (result instanceof to5) {
            throw ((to5) result).cause;
        }
        return result;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m94542K0(gle0<?> select, Object ignoredParam) {
        Object objM94591r0;
        do {
            objM94591r0 = m94591r0();
            if (!(objM94591r0 instanceof ptm)) {
                if (!(objM94591r0 instanceof to5)) {
                    objM94591r0 = npq.m164243h(objM94591r0);
                }
                select.mo95203d(objM94591r0);
                return;
            }
        } while (m94557T0(objM94591r0) < 0);
        select.mo95201b(JobKt__JobKt.m94518m(this, false, false, new C15507d(select), 3, null));
    }

    /* JADX INFO: renamed from: L0 */
    public void mo94543L0(@Nullable Throwable cause) {
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: M */
    public final CancellationException mo94544M() {
        Object objM94591r0 = m94591r0();
        if (!(objM94591r0 instanceof C15506c)) {
            if (objM94591r0 instanceof ptm) {
                mpq.m159379a("Job is still new or active: ", this);
                return null;
            }
            if (objM94591r0 instanceof to5) {
                return m94525W0(this, ((to5) objM94591r0).cause, null, 1, null);
            }
            return new JobCancellationException(u9c.m195086a(this) + " has completed normally", null, this);
        }
        Throwable thM94608d = ((C15506c) objM94591r0).m94608d();
        if (thM94608d != null) {
            CancellationException cancellationExceptionM94560V0 = m94560V0(thM94608d, u9c.m195086a(this) + " is cancelling");
            if (cancellationExceptionM94560V0 != null) {
                return cancellationExceptionM94560V0;
            }
        }
        mpq.m159379a("Job is still new or active: ", this);
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public void mo94545M0(@Nullable Object state) {
    }

    @Override // p153l.gg60
    @NotNull
    /* JADX INFO: renamed from: N */
    public CancellationException mo94546N() {
        Throwable thM94608d;
        Object objM94591r0 = m94591r0();
        if (objM94591r0 instanceof C15506c) {
            thM94608d = ((C15506c) objM94591r0).m94608d();
        } else if (objM94591r0 instanceof to5) {
            thM94608d = ((to5) objM94591r0).cause;
        } else {
            if (objM94591r0 instanceof ptm) {
                mpq.m159379a("Cannot be cancelling child in this state: ", objM94591r0);
                return null;
            }
            thM94608d = null;
        }
        CancellationException cancellationException = thM94608d instanceof CancellationException ? (CancellationException) thM94608d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m94558U0(objM94591r0), thM94608d, this);
    }

    /* JADX INFO: renamed from: N0 */
    public void mo94547N0() {
    }

    /* JADX INFO: renamed from: O0 */
    public final void m94548O0(sze state) {
        yt40 yt40Var = new yt40();
        Object usmVar = yt40Var;
        if (!state.getIsActive()) {
            usmVar = new usm(yt40Var);
        }
        C20511u7.m194801a(f67354a, this, state, usmVar);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m94549P0(hpq state) {
        state.m95090e(new yt40());
        C20511u7.m194801a(f67354a, this, state, state.m95095j());
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: Q */
    public final f45 mo94550Q(@NotNull h45 child) {
        z5e z5eVarM94518m = JobKt__JobKt.m94518m(this, true, false, new g45(child), 2, null);
        z5eVarM94518m.getClass();
        return (f45) z5eVarM94518m;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m94551Q0(gle0<?> select, Object ignoredParam) {
        if (m94598z0()) {
            select.mo95201b(JobKt__JobKt.m94518m(this, false, false, new C15508e(select), 3, null));
        } else {
            select.mo95203d(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m94552R(Object expect, yt40 list, hpq node) {
        int iM95101t;
        C15509f c15509f = new C15509f(node, this, expect);
        do {
            iM95101t = list.m95096l().m95101t(node, list, c15509f);
            if (iM95101t == 1) {
                return true;
            }
        } while (iM95101t != 2);
        return false;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m94553R0(@NotNull hpq node) {
        Object objM94591r0;
        do {
            objM94591r0 = m94591r0();
            if (!(objM94591r0 instanceof hpq)) {
                if (!(objM94591r0 instanceof ptm) || ((ptm) objM94591r0).getList() == null) {
                    return;
                }
                node.m95098q();
                return;
            }
            if (objM94591r0 != node) {
                return;
            }
        } while (!C20511u7.m194801a(f67354a, this, objM94591r0, npq.f143122g));
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Nullable
    /* JADX INFO: renamed from: S */
    public final Object mo94554S(@NotNull Continuation<? super Unit> continuation) {
        if (m94598z0()) {
            Object objM94528A0 = m94528A0(continuation);
            return objM94528A0 == uyp.m198688e() ? objM94528A0 : Unit.INSTANCE;
        }
        fpq.m126711j(continuation.getContext());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m94555S0(@Nullable f45 f45Var) {
        f67355b.set(this, f45Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m94556T(Throwable rootCause, List<? extends Throwable> exceptions) throws IllegalAccessException, InvocationTargetException {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th : exceptions) {
            if (th != rootCause && th != rootCause && !(th instanceof CancellationException) && setNewSetFromMap.add(th)) {
                l6f.m153058a(rootCause, th);
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final int m94557T0(Object state) {
        if (state instanceof sze) {
            if (((sze) state).getIsActive()) {
                return 0;
            }
            if (!C20511u7.m194801a(f67354a, this, state, npq.f143122g)) {
                return -1;
            }
            mo94547N0();
            return 1;
        }
        if (!(state instanceof usm)) {
            return 0;
        }
        if (!C20511u7.m194801a(f67354a, this, state, ((usm) state).getList())) {
            return -1;
        }
        mo94547N0();
        return 1;
    }

    /* JADX INFO: renamed from: U0 */
    public final String m94558U0(Object state) {
        if (!(state instanceof C15506c)) {
            if (state instanceof ptm) {
                return ((ptm) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof to5 ? "Cancelled" : "Completed";
        }
        C15506c c15506c = (C15506c) state;
        if (c15506c.m94609h()) {
            return "Cancelling";
        }
        return c15506c.m94610i() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: V */
    public void mo94559V(@Nullable Object state) {
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final CancellationException m94560V0(@NotNull Throwable th, @Nullable String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo94574d0();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public final Object m94561W(@NotNull Continuation<Object> continuation) throws Throwable {
        Object objM94591r0;
        do {
            objM94591r0 = m94591r0();
            if (!(objM94591r0 instanceof ptm)) {
                if (objM94591r0 instanceof to5) {
                    throw ((to5) objM94591r0).cause;
                }
                return npq.m164243h(objM94591r0);
            }
        } while (m94557T0(objM94591r0) < 0);
        return m94562X(continuation);
    }

    /* JADX INFO: renamed from: X */
    public final Object m94562X(Continuation<Object> continuation) {
        C15504a c15504a = new C15504a(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), this);
        c15504a.m94637G();
        cg4.m109663a(c15504a, JobKt__JobKt.m94518m(this, false, false, new v5d0(c15504a), 3, null));
        Object objM94670v = c15504a.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final String m94563X0() {
        return mo94534F0() + '{' + m94558U0(m94591r0()) + '}';
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m94564Y(@Nullable Throwable cause) {
        return m94566Z(cause);
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m94565Y0(ptm state, Object update) throws Throwable {
        if (!C20511u7.m194801a(f67354a, this, state, npq.m164242g(update))) {
            return false;
        }
        mo94543L0(null);
        mo94545M0(update);
        m94576f0(state, update);
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m94566Z(@Nullable Object cause) throws Throwable {
        Object objM94529B0 = npq.f143116a;
        if (mo94588o0() && (objM94529B0 = m94570b0(cause)) == npq.f143117b) {
            return true;
        }
        if (objM94529B0 == npq.f143116a) {
            objM94529B0 = m94529B0(cause);
        }
        if (objM94529B0 == npq.f143116a || objM94529B0 == npq.f143117b) {
            return true;
        }
        if (objM94529B0 == npq.f143119d) {
            return false;
        }
        mo94559V(objM94529B0);
        return true;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m94567Z0(ptm state, Throwable rootCause) throws Throwable {
        yt40 yt40VarM94589p0 = m94589p0(state);
        if (yt40VarM94589p0 == null) {
            return false;
        }
        if (!C20511u7.m194801a(f67354a, this, state, new C15506c(yt40VarM94589p0, false, rootCause))) {
            return false;
        }
        m94537H0(yt40VarM94589p0, rootCause);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo94568a0(@NotNull Throwable cause) throws Throwable {
        m94566Z(cause);
    }

    /* JADX INFO: renamed from: a1 */
    public final Object m94569a1(Object state, Object proposedUpdate) {
        if (!(state instanceof ptm)) {
            return npq.f143116a;
        }
        if ((!(state instanceof sze) && !(state instanceof hpq)) || (state instanceof g45) || (proposedUpdate instanceof to5)) {
            return m94571b1((ptm) state, proposedUpdate);
        }
        return m94565Y0((ptm) state, proposedUpdate) ? proposedUpdate : npq.f143118c;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m94570b0(Object cause) {
        Object objM94569a1;
        do {
            Object objM94591r0 = m94591r0();
            if (!(objM94591r0 instanceof ptm) || ((objM94591r0 instanceof C15506c) && ((C15506c) objM94591r0).m94610i())) {
                return npq.f143116a;
            }
            objM94569a1 = m94569a1(objM94591r0, new to5(m94578h0(cause), false, 2, null));
        } while (objM94569a1 == npq.f143118c);
        return objM94569a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: b1 */
    public final Object m94571b1(ptm state, Object proposedUpdate) throws Throwable {
        yt40 yt40VarM94589p0 = m94589p0(state);
        if (yt40VarM94589p0 == null) {
            return npq.f143118c;
        }
        C15506c c15506c = state instanceof C15506c ? (C15506c) state : null;
        if (c15506c == null) {
            c15506c = new C15506c(yt40VarM94589p0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (c15506c) {
            if (c15506c.m94610i()) {
                return npq.f143116a;
            }
            c15506c.m94614m(true);
            if (c15506c != state && !C20511u7.m194801a(f67354a, this, state, c15506c)) {
                return npq.f143118c;
            }
            boolean zM94609h = c15506c.m94609h();
            to5 to5Var = proposedUpdate instanceof to5 ? (to5) proposedUpdate : null;
            if (to5Var != null) {
                c15506c.m94605a(to5Var.cause);
            }
            ?? M94608d = zM94609h ? 0 : c15506c.m94608d();
            objectRef.element = M94608d;
            Unit unit = Unit.INSTANCE;
            if (M94608d != 0) {
                m94537H0(yt40VarM94589p0, M94608d);
            }
            g45 g45VarM94580j0 = m94580j0(state);
            return (g45VarM94580j0 == null || !m94573c1(c15506c, g45VarM94580j0, proposedUpdate)) ? m94579i0(c15506c, proposedUpdate) : npq.f143117b;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m94572c0(Throwable cause) {
        if (mo94597y0()) {
            return true;
        }
        boolean z = cause instanceof CancellationException;
        f45 f45VarM94590q0 = m94590q0();
        if (f45VarM94590q0 == null || f45VarM94590q0 == bu40.INSTANCE) {
            return z;
        }
        return f45VarM94590q0.mo106425b(cause) || z;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m94573c1(C15506c state, g45 child, Object proposedUpdate) {
        while (JobKt__JobKt.m94518m(child.childJob, false, false, new C15505b(this, state, child, proposedUpdate), 1, null) == bu40.INSTANCE) {
            child = m94535G0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public String mo94574d0() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: e0 */
    public boolean mo94575e0(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return m94566Z(cause) && getHandlesException();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m94576f0(ptm state, Object update) throws Throwable {
        f45 f45VarM94590q0 = m94590q0();
        if (f45VarM94590q0 != null) {
            f45VarM94590q0.dispose();
            m94555S0(bu40.INSTANCE);
        }
        to5 to5Var = update instanceof to5 ? (to5) update : null;
        Throwable th = to5Var != null ? to5Var.cause : null;
        if (!(state instanceof hpq)) {
            yt40 list = state.getList();
            if (list != null) {
                m94539I0(list, th);
                return;
            }
            return;
        }
        try {
            ((hpq) state).mo94601a(th);
        } catch (Throwable th2) {
            mo94594v0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC15593o.a.m95139b(this, r, function2);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m94577g0(C15506c state, g45 lastChild, Object proposedUpdate) {
        g45 g45VarM94535G0 = m94535G0(lastChild);
        if (g45VarM94535G0 == null || !m94573c1(state, g45VarM94535G0, proposedUpdate)) {
            mo94559V(m94579i0(state, proposedUpdate));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) InterfaceC15593o.a.m95140c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC15593o.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Nullable
    public InterfaceC15593o getParent() {
        f45 f45VarM94590q0 = m94590q0();
        if (f45VarM94590q0 != null) {
            return f45VarM94590q0.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final Throwable m94578h0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th = (Throwable) cause;
            return th == null ? new JobCancellationException(mo94574d0(), null, this) : th;
        }
        cause.getClass();
        return ((gg60) cause).mo94546N();
    }

    /* JADX INFO: renamed from: i0 */
    public final Object m94579i0(C15506c state, Object proposedUpdate) throws Throwable {
        boolean zM94609h;
        Throwable thM94585m0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        to5 to5Var = proposedUpdate instanceof to5 ? (to5) proposedUpdate : null;
        Throwable th = to5Var != null ? to5Var.cause : null;
        synchronized (state) {
            zM94609h = state.m94609h();
            List<Throwable> listM94613l = state.m94613l(th);
            thM94585m0 = m94585m0(state, listM94613l);
            if (thM94585m0 != null) {
                m94556T(thM94585m0, listM94613l);
            }
        }
        if (thM94585m0 != null && thM94585m0 != th) {
            proposedUpdate = new to5(thM94585m0, false, 2, defaultConstructorMarker);
        }
        if (thM94585m0 != null && (m94572c0(thM94585m0) || mo94593u0(thM94585m0))) {
            proposedUpdate.getClass();
            ((to5) proposedUpdate).m192010c();
        }
        if (!zM94609h) {
            mo94543L0(thM94585m0);
        }
        mo94545M0(proposedUpdate);
        C20511u7.m194801a(f67354a, this, state, npq.m164242g(proposedUpdate));
        m94576f0(state, proposedUpdate);
        return proposedUpdate;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    public final boolean isCancelled() {
        Object objM94591r0 = m94591r0();
        if (objM94591r0 instanceof to5) {
            return true;
        }
        return (objM94591r0 instanceof C15506c) && ((C15506c) objM94591r0).m94609h();
    }

    /* JADX INFO: renamed from: j0 */
    public final g45 m94580j0(ptm state) {
        g45 g45Var = state instanceof g45 ? (g45) state : null;
        if (g45Var != null) {
            return g45Var;
        }
        yt40 list = state.getList();
        if (list != null) {
            return m94535G0(list);
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: k */
    public boolean mo94581k() {
        Object objM94591r0 = m94591r0();
        return (objM94591r0 instanceof ptm) && ((ptm) objM94591r0).getIsActive();
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final Object m94582k0() throws Throwable {
        Object objM94591r0 = m94591r0();
        if (objM94591r0 instanceof ptm) {
            wtq0.m207906a("This job has not completed yet");
            return null;
        }
        if (objM94591r0 instanceof to5) {
            throw ((to5) objM94591r0).cause;
        }
        return npq.m164243h(objM94591r0);
    }

    /* JADX INFO: renamed from: l0 */
    public final Throwable m94583l0(Object obj) {
        to5 to5Var = obj instanceof to5 ? (to5) obj : null;
        if (to5Var != null) {
            return to5Var.cause;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: m */
    public final boolean mo94584m() {
        return !(m94591r0() instanceof ptm);
    }

    /* JADX INFO: renamed from: m0 */
    public final Throwable m94585m0(C15506c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.m94609h()) {
                return new JobCancellationException(mo94574d0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = exceptions.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : list) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return InterfaceC15593o.a.m95141d(this, key);
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: n */
    public void mo94586n(@Nullable CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(mo94574d0(), null, this);
        }
        mo94568a0(cause);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean getHandlesException() {
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo94588o0() {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final yt40 m94589p0(ptm state) {
        yt40 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof sze) {
            return new yt40();
        }
        if (state instanceof hpq) {
            m94549P0((hpq) state);
            return null;
        }
        mpq.m159379a("State should have list: ", state);
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC15593o.a.m95142e(this, coroutineContext);
    }

    @Nullable
    /* JADX INFO: renamed from: q0 */
    public final f45 m94590q0() {
        return (f45) f67355b.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    public final Object m94591r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67354a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof fx50)) {
                return obj;
            }
            ((fx50) obj).mo127929a(this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    public final boolean start() {
        int iM94557T0;
        do {
            iM94557T0 = m94557T0(m94591r0());
            if (iM94557T0 == 0) {
                return false;
            }
        } while (iM94557T0 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return m94563X0() + '@' + u9c.m195087b(this);
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: u */
    public final z5e mo94592u(@NotNull Function1<? super Throwable, Unit> handler) {
        return m94596x0(false, true, new InterfaceC15592n.a(handler));
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo94593u0(@NotNull Throwable exception) {
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m94595w0(@Nullable InterfaceC15593o parent) {
        if (parent == null) {
            m94555S0(bu40.INSTANCE);
            return;
        }
        parent.start();
        f45 f45VarMo94550Q = parent.mo94550Q(this);
        m94555S0(f45VarMo94550Q);
        if (mo94584m()) {
            f45VarMo94550Q.dispose();
            m94555S0(bu40.INSTANCE);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final z5e m94596x0(boolean onCancelling, boolean invokeImmediately, @NotNull InterfaceC15592n handler) {
        hpq hpqVarM94532E0 = m94532E0(handler, onCancelling);
        while (true) {
            Object objM94591r0 = m94591r0();
            if (objM94591r0 instanceof sze) {
                sze szeVar = (sze) objM94591r0;
                if (!szeVar.getIsActive()) {
                    m94548O0(szeVar);
                } else if (C20511u7.m194801a(f67354a, this, objM94591r0, hpqVarM94532E0)) {
                    break;
                }
            } else {
                Throwable thM94608d = null;
                if (!(objM94591r0 instanceof ptm)) {
                    if (invokeImmediately) {
                        to5 to5Var = objM94591r0 instanceof to5 ? (to5) objM94591r0 : null;
                        handler.mo94601a(to5Var != null ? to5Var.cause : null);
                    }
                    return bu40.INSTANCE;
                }
                yt40 list = ((ptm) objM94591r0).getList();
                if (list == null) {
                    m94549P0((hpq) objM94591r0);
                } else {
                    z5e z5eVar = bu40.INSTANCE;
                    if (onCancelling && (objM94591r0 instanceof C15506c)) {
                        synchronized (objM94591r0) {
                            try {
                                thM94608d = ((C15506c) objM94591r0).m94608d();
                                if (thM94608d == null || ((handler instanceof g45) && !((C15506c) objM94591r0).m94610i())) {
                                    if (m94552R(objM94591r0, list, hpqVarM94532E0)) {
                                        if (thM94608d == null) {
                                            return hpqVarM94532E0;
                                        }
                                        z5eVar = hpqVarM94532E0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thM94608d != null) {
                        if (invokeImmediately) {
                            handler.mo94601a(thM94608d);
                        }
                        return z5eVar;
                    }
                    if (m94552R(objM94591r0, list, hpqVarM94532E0)) {
                        break;
                    }
                }
            }
        }
        return hpqVarM94532E0;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo94597y0() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m94598z0() {
        Object objM94591r0;
        do {
            objM94591r0 = m94591r0();
            if (!(objM94591r0 instanceof ptm)) {
                return false;
            }
        } while (m94557T0(objM94591r0) < 0);
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public void mo94594v0(@NotNull Throwable exception) throws Throwable {
        throw exception;
    }
}
