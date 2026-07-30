package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.C21643z7;
import p149l.b860;
import p149l.bde0;
import p149l.byv;
import p149l.df4;
import p149l.dwv;
import p149l.e35;
import p149l.f35;
import p149l.g35;
import p149l.gnq;
import p149l.h5f;
import p149l.inq;
import p149l.j6f;
import p149l.kl40;
import p149l.l4e;
import p149l.nl40;
import p149l.nnq;
import p149l.nrm;
import p149l.o8c;
import p149l.onq;
import p149l.oye;
import p149l.pn5;
import p149l.qkq0;
import p149l.qq3;
import p149l.ryp;
import p149l.sqm;
import p149l.sxc0;
import p149l.syp;
import p149l.txc0;
import p149l.uwp;
import p149l.xmq;
import p149l.zo50;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
@Metadata(m87231d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n¾\u0001¿\u0001À\u0001Á\u0001Â\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u0010\t\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u00020\u00142\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010AJ\u0019\u0010E\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bI\u0010JJ#\u0010K\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\bN\u0010OJ*\u0010Q\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010P\u001a\u00020M2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bQ\u0010RJ)\u0010T\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010S\u001a\u00020M2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u0004\u0018\u00010M*\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020Y2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\\\u0010:J%\u0010]\u001a\u00020\u00142\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010=\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b]\u0010?J%\u0010_\u001a\u0004\u0018\u00010\n2\b\u0010=\u001a\u0004\u0018\u00010\n2\b\u0010^\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b_\u0010JJ\u0019\u0010a\u001a\u00020\u00142\b\u0010`\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0004¢\u0006\u0004\bc\u00108J\u000f\u0010d\u001a\u00020\u0014H\u0014¢\u0006\u0004\bd\u0010eJ\u0011\u0010h\u001a\u00060fj\u0002`g¢\u0006\u0004\bh\u0010iJ#\u0010k\u001a\u00060fj\u0002`g*\u00020\u000f2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010YH\u0004¢\u0006\u0004\bk\u0010lJ6\u0010r\u001a\u00020q2'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bn\u0012\b\bo\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140mj\u0002`p¢\u0006\u0004\br\u0010sJF\u0010u\u001a\u00020q2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042'\u0010)\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bn\u0012\b\bo\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140mj\u0002`p¢\u0006\u0004\bu\u0010vJ'\u0010w\u001a\u00020q2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u0014H\u0086@¢\u0006\u0004\by\u0010:J\u0017\u0010z\u001a\u00020\u00142\u0006\u0010/\u001a\u00020+H\u0000¢\u0006\u0004\bz\u00106J\u001f\u0010{\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010fj\u0004\u0018\u0001`gH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020YH\u0014¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00142\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0084\u0001\u0010#J\u0019\u0010\u0085\u0001\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0005\b\u0085\u0001\u0010#J\u001c\u0010\u0086\u0001\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u00060fj\u0002`gH\u0016¢\u0006\u0005\b\u0088\u0001\u0010iJ\u001c\u0010\u0089\u0001\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001d\u0010\u008a\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u008a\u0001\u0010AJ\u0019\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00142\u0007\u0010\u008e\u0001\u001a\u00020\u000fH\u0010¢\u0006\u0006\b\u008f\u0001\u0010\u0080\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0006\b\u0090\u0001\u0010\u0080\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00042\u0007\u0010\u008e\u0001\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0091\u0001\u0010#J\u001c\u0010\u0092\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0011\u0010\u0095\u0001\u001a\u00020YH\u0016¢\u0006\u0005\b\u0095\u0001\u0010~J\u0011\u0010\u0096\u0001\u001a\u00020YH\u0007¢\u0006\u0005\b\u0096\u0001\u0010~J\u0011\u0010\u0097\u0001\u001a\u00020YH\u0010¢\u0006\u0005\b\u0097\u0001\u0010~J\u0012\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000f¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0014\u0010\u009a\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u009c\u0001\u0010:R\u001e\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010CR\u0019\u0010¢\u0001\u001a\u0007\u0012\u0002\b\u00030\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R0\u0010¨\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010\u008b\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010`\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010\u009b\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u00108R\u0013\u0010¯\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b®\u0001\u00108R\u0013\u0010°\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b°\u0001\u00108R\u0016\u0010²\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u00108R\u001b\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010¸\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u00108R\u0016\u0010º\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u00108R\u0016\u0010¼\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010»\u00018\u0002X\u0082\u0004R\u0015\u0010½\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0»\u00018\u0002X\u0082\u0004¨\u0006Ã\u0001"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/o;", "Ll/g35;", "Ll/b860;", "", Active.TYPE, "<init>", "(Z)V", "Lkotlinx/coroutines/JobSupport$c;", "state", "", "proposedUpdate", "i0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "m0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "U", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Ll/nrm;", "update", "Y0", "(Ll/nrm;Ljava/lang/Object;)Z", "f0", "(Ll/nrm;Ljava/lang/Object;)V", "Ll/kl40;", "list", "cause", "H0", "(Ll/kl40;Ljava/lang/Throwable;)V", "c0", "(Ljava/lang/Throwable;)Z", "I0", "", "T0", "(Ljava/lang/Object;)I", "Lkotlinx/coroutines/n;", "handler", "onCancelling", "Ll/inq;", "E0", "(Lkotlinx/coroutines/n;Z)Ll/inq;", "expect", "node", "R", "(Ljava/lang/Object;Ll/kl40;Ll/inq;)Z", "Ll/oye;", "O0", "(Ll/oye;)V", "P0", "(Ll/inq;)V", "z0", "()Z", "A0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/bde0;", "select", "ignoredParam", "Q0", "(Ll/bde0;Ljava/lang/Object;)V", "b0", "(Ljava/lang/Object;)Ljava/lang/Object;", "h0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "B0", "p0", "(Ll/nrm;)Ll/kl40;", "Z0", "(Ll/nrm;Ljava/lang/Throwable;)Z", "a1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "b1", "(Ll/nrm;Ljava/lang/Object;)Ljava/lang/Object;", "Ll/f35;", "j0", "(Ll/nrm;)Ll/f35;", "child", "c1", "(Lkotlinx/coroutines/JobSupport$c;Ll/f35;Ljava/lang/Object;)Z", "lastChild", "g0", "(Lkotlinx/coroutines/JobSupport$c;Ll/f35;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "G0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ll/f35;", "", "U0", "(Ljava/lang/Object;)Ljava/lang/String;", "X", "K0", LovePlanetStage.result, "J0", "parent", "w0", "(Lkotlinx/coroutines/o;)V", "start", "N0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "M", "()Ljava/util/concurrent/CancellationException;", "message", "V0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/CompletionHandler;", "Ll/l4e;", "u", "(Lkotlin/jvm/functions/Function1;)Ll/l4e;", "invokeImmediately", "J", "(ZZLkotlin/jvm/functions/Function1;)Ll/l4e;", "x0", "(ZZLkotlinx/coroutines/n;)Ll/l4e;", j6f.LATITUDE_SOUTH, "R0", "n", "(Ljava/util/concurrent/CancellationException;)V", "d0", "()Ljava/lang/String;", "a0", "(Ljava/lang/Throwable;)V", "parentJob", "F", "(Ll/b860;)V", "e0", "Y", "Z", "(Ljava/lang/Object;)Z", "N", "C0", "D0", "Ll/e35;", "Q", "(Ll/g35;)Ll/e35;", "exception", "v0", "L0", "u0", "M0", "(Ljava/lang/Object;)V", j6f.GPS_MEASUREMENT_INTERRUPTED, "toString", "X0", "F0", "I", "()Ljava/lang/Throwable;", "k0", "()Ljava/lang/Object;", "W", "l0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Constants.KEY_KEY, "value", "q0", "()Ll/e35;", "S0", "(Ll/e35;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/o;", "r0", "k", "isActive", "m", "isCompleted", "isCancelled", "o0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "H", "()Lkotlin/sequences/Sequence;", "children", "y0", "isScopedCoroutine", "n0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "a", "b", "c", Constants.INAPP_DATA_TAG, "e", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class JobSupport implements InterfaceC15486o, g35, b860 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66680a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66681b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$a */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport$a;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/c;", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/JobSupport;", "job", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "Lkotlinx/coroutines/o;", "parent", "", Constants.KEY_T, "(Lkotlinx/coroutines/o;)Ljava/lang/Throwable;", "", "M", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Lkotlinx/coroutines/JobSupport;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15397a<T> extends C15407c<T> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final JobSupport job;

        public C15397a(@NotNull Continuation<? super T> continuation, @NotNull JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.C15407c
        @NotNull
        /* JADX INFO: renamed from: M */
        public String mo93708M() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C15407c
        @NotNull
        /* JADX INFO: renamed from: t */
        public Throwable mo93709t(@NotNull InterfaceC15486o parent) {
            Throwable thM93717d;
            Object objM93700r0 = this.job.m93700r0();
            if (!(objM93700r0 instanceof C15399c) || (thM93717d = ((C15399c) objM93700r0).m93717d()) == null) {
                return objM93700r0 instanceof pn5 ? ((pn5) objM93700r0).cause : parent.mo93653M();
            }
            return thM93717d;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$b */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport$b;", "Ll/inq;", "Lkotlinx/coroutines/JobSupport;", "parent", "Lkotlinx/coroutines/JobSupport$c;", "state", "Ll/f35;", "child", "", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Ll/f35;Ljava/lang/Object;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/JobSupport;", "f", "Lkotlinx/coroutines/JobSupport$c;", "g", "Ll/f35;", "h", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15398b extends inq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final JobSupport parent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final C15399c state;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final f35 child;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        public C15398b(@NotNull JobSupport jobSupport, @NotNull C15399c c15399c, @NotNull f35 f35Var, @Nullable Object obj) {
            this.parent = jobSupport;
            this.state = c15399c;
            this.child = f35Var;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC15485n
        /* JADX INFO: renamed from: a */
        public void mo93710a(@Nullable Throwable cause) {
            this.parent.m93686g0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$c */
    @Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001018\u0002X\u0082\u0004R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b018\u0002X\u0082\u0004¨\u00066"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Ll/nrm;", "Ll/kl40;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Ll/kl40;ZLjava/lang/Throwable;)V", "proposedException", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "Ll/kl40;", "getList", "()Ll/kl40;", "value", RXScreenCaptureService.KEY_INDEX, "()Z", "m", "(Z)V", Constants.INAPP_DATA_TAG, "()Ljava/lang/Throwable;", "o", "j", "isSealed", "h", "isCancelling", "k", "isActive", "c", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "_rootCause", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15399c implements nrm {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f66687b = AtomicIntegerFieldUpdater.newUpdater(C15399c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f66688c = AtomicReferenceFieldUpdater.newUpdater(C15399c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f66689d = AtomicReferenceFieldUpdater.newUpdater(C15399c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final kl40 list;

        public C15399c(@NotNull kl40 kl40Var, boolean z, @Nullable Throwable th) {
            this.list = kl40Var;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX INFO: renamed from: a */
        public final void m93714a(@NotNull Throwable exception) {
            Throwable thM93717d = m93717d();
            if (thM93717d == null) {
                m93725o(exception);
                return;
            }
            if (exception == thM93717d) {
                return;
            }
            Object objM93716c = m93716c();
            if (objM93716c == null) {
                m93724n(exception);
                return;
            }
            if (!(objM93716c instanceof Throwable)) {
                if (objM93716c instanceof ArrayList) {
                    ((ArrayList) objM93716c).add(exception);
                    return;
                } else {
                    nnq.m160357a("State is ", objM93716c);
                    return;
                }
            }
            if (exception == objM93716c) {
                return;
            }
            ArrayList<Throwable> arrayListM93715b = m93715b();
            arrayListM93715b.add(objM93716c);
            arrayListM93715b.add(exception);
            m93724n(arrayListM93715b);
        }

        /* JADX INFO: renamed from: b */
        public final ArrayList<Throwable> m93715b() {
            return new ArrayList<>(4);
        }

        /* JADX INFO: renamed from: c */
        public final Object m93716c() {
            return f66689d.get(this);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Throwable m93717d() {
            return (Throwable) f66688c.get(this);
        }

        @Override // p149l.nrm
        @NotNull
        public kl40 getList() {
            return this.list;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m93718h() {
            return m93717d() != null;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m93719i() {
            return f66687b.get(this) != 0;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m93720j() {
            return m93716c() == onq.f144813e;
        }

        @Override // p149l.nrm
        /* JADX INFO: renamed from: k */
        public boolean getIsActive() {
            return m93717d() == null;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final List<Throwable> m93722l(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayListM93715b;
            Object objM93716c = m93716c();
            if (objM93716c == null) {
                arrayListM93715b = m93715b();
            } else if (objM93716c instanceof Throwable) {
                ArrayList<Throwable> arrayListM93715b2 = m93715b();
                arrayListM93715b2.add(objM93716c);
                arrayListM93715b = arrayListM93715b2;
            } else {
                if (!(objM93716c instanceof ArrayList)) {
                    nnq.m160357a("State is ", objM93716c);
                    return null;
                }
                arrayListM93715b = (ArrayList) objM93716c;
            }
            Throwable thM93717d = m93717d();
            if (thM93717d != null) {
                arrayListM93715b.add(0, thM93717d);
            }
            if (proposedException != null && !Intrinsics.m87488d(proposedException, thM93717d)) {
                arrayListM93715b.add(proposedException);
            }
            m93724n(onq.f144813e);
            return arrayListM93715b;
        }

        /* JADX INFO: renamed from: m */
        public final void m93723m(boolean z) {
            f66687b.set(this, z ? 1 : 0);
        }

        /* JADX INFO: renamed from: n */
        public final void m93724n(Object obj) {
            f66689d.set(this, obj);
        }

        /* JADX INFO: renamed from: o */
        public final void m93725o(@Nullable Throwable th) {
            f66688c.set(this, th);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m93718h() + ", completing=" + m93719i() + ", rootCause=" + m93717d() + ", exceptions=" + m93716c() + ", list=" + getList() + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$d */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport$d;", "Ll/inq;", "Ll/bde0;", "select", "<init>", "(Lkotlinx/coroutines/JobSupport;Ll/bde0;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/bde0;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class C15400d extends inq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final bde0<?> select;

        public C15400d(bde0<?> bde0Var) {
            this.select = bde0Var;
        }

        @Override // kotlinx.coroutines.InterfaceC15485n
        /* JADX INFO: renamed from: a */
        public void mo93710a(@Nullable Throwable cause) {
            Object objM93700r0 = JobSupport.this.m93700r0();
            if (!(objM93700r0 instanceof pn5)) {
                objM93700r0 = onq.m165223h(objM93700r0);
            }
            this.select.mo94312f(JobSupport.this, objM93700r0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$e */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lkotlinx/coroutines/JobSupport$e;", "Ll/inq;", "Ll/bde0;", "select", "<init>", "(Lkotlinx/coroutines/JobSupport;Ll/bde0;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/bde0;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class C15401e extends inq {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final bde0<?> select;

        public C15401e(bde0<?> bde0Var) {
            this.select = bde0Var;
        }

        @Override // kotlinx.coroutines.InterfaceC15485n
        /* JADX INFO: renamed from: a */
        public void mo93710a(@Nullable Throwable cause) {
            this.select.mo94312f(JobSupport.this, Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$f */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"kotlinx/coroutines/JobSupport$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "g", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15402f extends LockFreeLinkedListNode.AbstractC15479a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ JobSupport f66695d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f66696e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15402f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f66695d = jobSupport;
            this.f66696e = obj;
        }

        @Override // p149l.e31
        @Nullable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object mo93726e(@NotNull LockFreeLinkedListNode affected) {
            if (this.f66695d.m93700r0() == this.f66696e) {
                return null;
            }
            return dwv.m113960a();
        }
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? onq.f144815g : onq.f144814f;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ CancellationException m93634W0(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: toCancellationException");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.m93669V0(th, str);
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m93637A0(Continuation<? super Unit> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        df4.m111429a(c15407c, JobKt__JobKt.m93627m(this, false, false, new txc0(c15407c), 3, null));
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final Object m93638B0(Object cause) throws Throwable {
        Object[] objArr = 0;
        Throwable thM93687h0 = null;
        while (true) {
            Object objM93700r0 = m93700r0();
            if (objM93700r0 instanceof C15399c) {
                synchronized (objM93700r0) {
                    if (((C15399c) objM93700r0).m93720j()) {
                        return onq.f144812d;
                    }
                    boolean zM93718h = ((C15399c) objM93700r0).m93718h();
                    if (cause != null || !zM93718h) {
                        if (thM93687h0 == null) {
                            thM93687h0 = m93687h0(cause);
                        }
                        ((C15399c) objM93700r0).m93714a(thM93687h0);
                    }
                    Throwable thM93717d = zM93718h ? null : ((C15399c) objM93700r0).m93717d();
                    if (thM93717d != null) {
                        m93646H0(((C15399c) objM93700r0).getList(), thM93717d);
                    }
                    return onq.f144809a;
                }
            }
            if (!(objM93700r0 instanceof nrm)) {
                return onq.f144812d;
            }
            if (thM93687h0 == null) {
                thM93687h0 = m93687h0(cause);
            }
            nrm nrmVar = (nrm) objM93700r0;
            if (!nrmVar.getIsActive()) {
                Object objM93678a1 = m93678a1(objM93700r0, new pn5(thM93687h0, false, 2, objArr == true ? 1 : 0));
                if (objM93678a1 == onq.f144809a) {
                    nnq.m160357a("Cannot happen in ", objM93700r0);
                    return null;
                }
                if (objM93678a1 != onq.f144811c) {
                    return objM93678a1;
                }
            } else if (m93676Z0(nrmVar, thM93687h0)) {
                return onq.f144809a;
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m93639C0(@Nullable Object proposedUpdate) {
        Object objM93678a1;
        do {
            objM93678a1 = m93678a1(m93700r0(), proposedUpdate);
            if (objM93678a1 == onq.f144809a) {
                return false;
            }
            if (objM93678a1 == onq.f144810b) {
                return true;
            }
        } while (objM93678a1 == onq.f144811c);
        mo93668V(objM93678a1);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: D0 */
    public final Object m93640D0(@Nullable Object proposedUpdate) {
        Object objM93678a1;
        do {
            objM93678a1 = m93678a1(m93700r0(), proposedUpdate);
            if (objM93678a1 == onq.f144809a) {
                byv.m104511a("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, m93692l0(proposedUpdate));
                return null;
            }
        } while (objM93678a1 == onq.f144811c);
        return objM93678a1;
    }

    /* JADX INFO: renamed from: E0 */
    public final inq m93641E0(InterfaceC15485n handler, boolean onCancelling) {
        inq sypVar;
        if (onCancelling) {
            sypVar = handler instanceof xmq ? (xmq) handler : null;
            if (sypVar == null) {
                sypVar = new ryp(handler);
            }
        } else {
            sypVar = handler instanceof inq ? (inq) handler : null;
            if (sypVar == null) {
                sypVar = new syp(handler);
            }
        }
        sypVar.m137158v(this);
        return sypVar;
    }

    @Override // p149l.g35
    /* JADX INFO: renamed from: F */
    public final void mo93642F(@NotNull b860 parentJob) throws Throwable {
        m93675Z(parentJob);
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo93643F0() {
        return o8c.m163111a(this);
    }

    /* JADX INFO: renamed from: G0 */
    public final f35 m93644G0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo94204p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m94203l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m94202j();
            if (!lockFreeLinkedListNode.mo94204p()) {
                if (lockFreeLinkedListNode instanceof f35) {
                    return (f35) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof kl40) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @NotNull
    /* JADX INFO: renamed from: H */
    public final Sequence<InterfaceC15486o> mo93645H() {
        return SequencesKt__SequenceBuilderKt.m93262b(new JobSupport$children$1(this, null));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m93646H0(kl40 list, Throwable cause) throws Throwable {
        mo93652L0(cause);
        Object objM94201i = list.m94201i();
        objM94201i.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM94202j = (LockFreeLinkedListNode) objM94201i; !Intrinsics.m87488d(lockFreeLinkedListNodeM94202j, list); lockFreeLinkedListNodeM94202j = lockFreeLinkedListNodeM94202j.m94202j()) {
            if (lockFreeLinkedListNodeM94202j instanceof xmq) {
                inq inqVar = (inq) lockFreeLinkedListNodeM94202j;
                try {
                    inqVar.mo93710a(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        h5f.m129395a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + inqVar + " for " + this, th);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo93703v0(completionHandlerException);
        }
        m93681c0(cause);
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final Throwable m93647I() {
        Object objM93700r0 = m93700r0();
        if (!(objM93700r0 instanceof nrm)) {
            return m93692l0(objM93700r0);
        }
        qkq0.m175383a("This job has not completed yet");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m93648I0(kl40 kl40Var, Throwable th) throws Throwable {
        Object objM94201i = kl40Var.m94201i();
        objM94201i.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM94202j = (LockFreeLinkedListNode) objM94201i; !Intrinsics.m87488d(lockFreeLinkedListNodeM94202j, kl40Var); lockFreeLinkedListNodeM94202j = lockFreeLinkedListNodeM94202j.m94202j()) {
            if (lockFreeLinkedListNodeM94202j instanceof inq) {
                inq inqVar = (inq) lockFreeLinkedListNodeM94202j;
                try {
                    inqVar.mo93710a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        h5f.m129395a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + inqVar + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo93703v0(completionHandlerException);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @NotNull
    /* JADX INFO: renamed from: J */
    public final l4e mo93649J(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return m93705x0(onCancelling, invokeImmediately, new InterfaceC15485n.a(handler));
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m93650J0(Object ignoredParam, Object result) throws Throwable {
        if (result instanceof pn5) {
            throw ((pn5) result).cause;
        }
        return result;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m93651K0(bde0<?> select, Object ignoredParam) {
        Object objM93700r0;
        do {
            objM93700r0 = m93700r0();
            if (!(objM93700r0 instanceof nrm)) {
                if (!(objM93700r0 instanceof pn5)) {
                    objM93700r0 = onq.m165223h(objM93700r0);
                }
                select.mo94310d(objM93700r0);
                return;
            }
        } while (m93665T0(objM93700r0) < 0);
        select.mo94308b(JobKt__JobKt.m93627m(this, false, false, new C15400d(select), 3, null));
    }

    /* JADX INFO: renamed from: L0 */
    public void mo93652L0(@Nullable Throwable cause) {
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @NotNull
    /* JADX INFO: renamed from: M */
    public final CancellationException mo93653M() {
        Object objM93700r0 = m93700r0();
        if (!(objM93700r0 instanceof C15399c)) {
            if (objM93700r0 instanceof nrm) {
                nnq.m160357a("Job is still new or active: ", this);
                return null;
            }
            if (objM93700r0 instanceof pn5) {
                return m93634W0(this, ((pn5) objM93700r0).cause, null, 1, null);
            }
            return new JobCancellationException(o8c.m163111a(this) + " has completed normally", null, this);
        }
        Throwable thM93717d = ((C15399c) objM93700r0).m93717d();
        if (thM93717d != null) {
            CancellationException cancellationExceptionM93669V0 = m93669V0(thM93717d, o8c.m163111a(this) + " is cancelling");
            if (cancellationExceptionM93669V0 != null) {
                return cancellationExceptionM93669V0;
            }
        }
        nnq.m160357a("Job is still new or active: ", this);
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public void mo93654M0(@Nullable Object state) {
    }

    @Override // p149l.b860
    @NotNull
    /* JADX INFO: renamed from: N */
    public CancellationException mo93655N() {
        Throwable thM93717d;
        Object objM93700r0 = m93700r0();
        if (objM93700r0 instanceof C15399c) {
            thM93717d = ((C15399c) objM93700r0).m93717d();
        } else if (objM93700r0 instanceof pn5) {
            thM93717d = ((pn5) objM93700r0).cause;
        } else {
            if (objM93700r0 instanceof nrm) {
                nnq.m160357a("Cannot be cancelling child in this state: ", objM93700r0);
                return null;
            }
            thM93717d = null;
        }
        CancellationException cancellationException = thM93717d instanceof CancellationException ? (CancellationException) thM93717d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m93667U0(objM93700r0), thM93717d, this);
    }

    /* JADX INFO: renamed from: N0 */
    public void mo93656N0() {
    }

    /* JADX INFO: renamed from: O0 */
    public final void m93657O0(oye state) {
        kl40 kl40Var = new kl40();
        Object sqmVar = kl40Var;
        if (!state.getIsActive()) {
            sqmVar = new sqm(kl40Var);
        }
        C21643z7.m217426a(f66680a, this, state, sqmVar);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m93658P0(inq state) {
        state.m94197e(new kl40());
        C21643z7.m217426a(f66680a, this, state, state.m94202j());
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @NotNull
    /* JADX INFO: renamed from: Q */
    public final e35 mo93659Q(@NotNull g35 child) {
        l4e l4eVarM93627m = JobKt__JobKt.m93627m(this, true, false, new f35(child), 2, null);
        l4eVarM93627m.getClass();
        return (e35) l4eVarM93627m;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m93660Q0(bde0<?> select, Object ignoredParam) {
        if (m93707z0()) {
            select.mo94308b(JobKt__JobKt.m93627m(this, false, false, new C15401e(select), 3, null));
        } else {
            select.mo94310d(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m93661R(Object expect, kl40 list, inq node) {
        int iM94208t;
        C15402f c15402f = new C15402f(node, this, expect);
        do {
            iM94208t = list.m94203l().m94208t(node, list, c15402f);
            if (iM94208t == 1) {
                return true;
            }
        } while (iM94208t != 2);
        return false;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m93662R0(@NotNull inq node) {
        Object objM93700r0;
        do {
            objM93700r0 = m93700r0();
            if (!(objM93700r0 instanceof inq)) {
                if (!(objM93700r0 instanceof nrm) || ((nrm) objM93700r0).getList() == null) {
                    return;
                }
                node.m94205q();
                return;
            }
            if (objM93700r0 != node) {
                return;
            }
        } while (!C21643z7.m217426a(f66680a, this, objM93700r0, onq.f144815g));
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @Nullable
    /* JADX INFO: renamed from: S */
    public final Object mo93663S(@NotNull Continuation<? super Unit> continuation) {
        if (m93707z0()) {
            Object objM93637A0 = m93637A0(continuation);
            return objM93637A0 == uwp.m196133e() ? objM93637A0 : Unit.INSTANCE;
        }
        gnq.m127169j(continuation.getContext());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m93664S0(@Nullable e35 e35Var) {
        f66681b.set(this, e35Var);
    }

    /* JADX INFO: renamed from: T0 */
    public final int m93665T0(Object state) {
        if (state instanceof oye) {
            if (((oye) state).getIsActive()) {
                return 0;
            }
            if (!C21643z7.m217426a(f66680a, this, state, onq.f144815g)) {
                return -1;
            }
            mo93656N0();
            return 1;
        }
        if (!(state instanceof sqm)) {
            return 0;
        }
        if (!C21643z7.m217426a(f66680a, this, state, ((sqm) state).getList())) {
            return -1;
        }
        mo93656N0();
        return 1;
    }

    /* JADX INFO: renamed from: U */
    public final void m93666U(Throwable rootCause, List<? extends Throwable> exceptions) throws IllegalAccessException, InvocationTargetException {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th : exceptions) {
            if (th != rootCause && th != rootCause && !(th instanceof CancellationException) && setNewSetFromMap.add(th)) {
                h5f.m129395a(rootCause, th);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final String m93667U0(Object state) {
        if (!(state instanceof C15399c)) {
            if (state instanceof nrm) {
                return ((nrm) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof pn5 ? "Cancelled" : "Completed";
        }
        C15399c c15399c = (C15399c) state;
        if (c15399c.m93718h()) {
            return "Cancelling";
        }
        return c15399c.m93719i() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: V */
    public void mo93668V(@Nullable Object state) {
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final CancellationException m93669V0(@NotNull Throwable th, @Nullable String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo93683d0();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public final Object m93670W(@NotNull Continuation<Object> continuation) throws Throwable {
        Object objM93700r0;
        do {
            objM93700r0 = m93700r0();
            if (!(objM93700r0 instanceof nrm)) {
                if (objM93700r0 instanceof pn5) {
                    throw ((pn5) objM93700r0).cause;
                }
                return onq.m165223h(objM93700r0);
            }
        } while (m93665T0(objM93700r0) < 0);
        return m93671X(continuation);
    }

    /* JADX INFO: renamed from: X */
    public final Object m93671X(Continuation<Object> continuation) {
        C15397a c15397a = new C15397a(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), this);
        c15397a.m93745G();
        df4.m111429a(c15397a, JobKt__JobKt.m93627m(this, false, false, new sxc0(c15397a), 3, null));
        Object objM93778v = c15397a.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final String m93672X0() {
        return mo93643F0() + '{' + m93667U0(m93700r0()) + '}';
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m93673Y(@Nullable Throwable cause) {
        return m93675Z(cause);
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m93674Y0(nrm state, Object update) throws Throwable {
        if (!C21643z7.m217426a(f66680a, this, state, onq.m165222g(update))) {
            return false;
        }
        mo93652L0(null);
        mo93654M0(update);
        m93685f0(state, update);
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m93675Z(@Nullable Object cause) throws Throwable {
        Object objM93638B0 = onq.f144809a;
        if (mo93697o0() && (objM93638B0 = m93679b0(cause)) == onq.f144810b) {
            return true;
        }
        if (objM93638B0 == onq.f144809a) {
            objM93638B0 = m93638B0(cause);
        }
        if (objM93638B0 == onq.f144809a || objM93638B0 == onq.f144810b) {
            return true;
        }
        if (objM93638B0 == onq.f144812d) {
            return false;
        }
        mo93668V(objM93638B0);
        return true;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m93676Z0(nrm state, Throwable rootCause) throws Throwable {
        kl40 kl40VarM93698p0 = m93698p0(state);
        if (kl40VarM93698p0 == null) {
            return false;
        }
        if (!C21643z7.m217426a(f66680a, this, state, new C15399c(kl40VarM93698p0, false, rootCause))) {
            return false;
        }
        m93646H0(kl40VarM93698p0, rootCause);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo93677a0(@NotNull Throwable cause) throws Throwable {
        m93675Z(cause);
    }

    /* JADX INFO: renamed from: a1 */
    public final Object m93678a1(Object state, Object proposedUpdate) {
        if (!(state instanceof nrm)) {
            return onq.f144809a;
        }
        if ((!(state instanceof oye) && !(state instanceof inq)) || (state instanceof f35) || (proposedUpdate instanceof pn5)) {
            return m93680b1((nrm) state, proposedUpdate);
        }
        return m93674Y0((nrm) state, proposedUpdate) ? proposedUpdate : onq.f144811c;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m93679b0(Object cause) {
        Object objM93678a1;
        do {
            Object objM93700r0 = m93700r0();
            if (!(objM93700r0 instanceof nrm) || ((objM93700r0 instanceof C15399c) && ((C15399c) objM93700r0).m93719i())) {
                return onq.f144809a;
            }
            objM93678a1 = m93678a1(objM93700r0, new pn5(m93687h0(cause), false, 2, null));
        } while (objM93678a1 == onq.f144811c);
        return objM93678a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: b1 */
    public final Object m93680b1(nrm state, Object proposedUpdate) throws Throwable {
        kl40 kl40VarM93698p0 = m93698p0(state);
        if (kl40VarM93698p0 == null) {
            return onq.f144811c;
        }
        C15399c c15399c = state instanceof C15399c ? (C15399c) state : null;
        if (c15399c == null) {
            c15399c = new C15399c(kl40VarM93698p0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (c15399c) {
            if (c15399c.m93719i()) {
                return onq.f144809a;
            }
            c15399c.m93723m(true);
            if (c15399c != state && !C21643z7.m217426a(f66680a, this, state, c15399c)) {
                return onq.f144811c;
            }
            boolean zM93718h = c15399c.m93718h();
            pn5 pn5Var = proposedUpdate instanceof pn5 ? (pn5) proposedUpdate : null;
            if (pn5Var != null) {
                c15399c.m93714a(pn5Var.cause);
            }
            ?? M93717d = zM93718h ? 0 : c15399c.m93717d();
            objectRef.element = M93717d;
            Unit unit = Unit.INSTANCE;
            if (M93717d != 0) {
                m93646H0(kl40VarM93698p0, M93717d);
            }
            f35 f35VarM93689j0 = m93689j0(state);
            return (f35VarM93689j0 == null || !m93682c1(c15399c, f35VarM93689j0, proposedUpdate)) ? m93688i0(c15399c, proposedUpdate) : onq.f144810b;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m93681c0(Throwable cause) {
        if (mo93706y0()) {
            return true;
        }
        boolean z = cause instanceof CancellationException;
        e35 e35VarM93699q0 = m93699q0();
        if (e35VarM93699q0 == null || e35VarM93699q0 == nl40.INSTANCE) {
            return z;
        }
        return e35VarM93699q0.mo114583b(cause) || z;
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m93682c1(C15399c state, f35 child, Object proposedUpdate) {
        while (JobKt__JobKt.m93627m(child.childJob, false, false, new C15398b(this, state, child, proposedUpdate), 1, null) == nl40.INSTANCE) {
            child = m93644G0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public String mo93683d0() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: e0 */
    public boolean mo93684e0(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return m93675Z(cause) && getHandlesException();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m93685f0(nrm state, Object update) throws Throwable {
        e35 e35VarM93699q0 = m93699q0();
        if (e35VarM93699q0 != null) {
            e35VarM93699q0.dispose();
            m93664S0(nl40.INSTANCE);
        }
        pn5 pn5Var = update instanceof pn5 ? (pn5) update : null;
        Throwable th = pn5Var != null ? pn5Var.cause : null;
        if (!(state instanceof inq)) {
            kl40 list = state.getList();
            if (list != null) {
                m93648I0(list, th);
                return;
            }
            return;
        }
        try {
            ((inq) state).mo93710a(th);
        } catch (Throwable th2) {
            mo93703v0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC15486o.a.m94246b(this, r, function2);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m93686g0(C15399c state, f35 lastChild, Object proposedUpdate) {
        f35 f35VarM93644G0 = m93644G0(lastChild);
        if (f35VarM93644G0 == null || !m93682c1(state, f35VarM93644G0, proposedUpdate)) {
            mo93668V(m93688i0(state, proposedUpdate));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) InterfaceC15486o.a.m94247c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC15486o.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @Nullable
    public InterfaceC15486o getParent() {
        e35 e35VarM93699q0 = m93699q0();
        if (e35VarM93699q0 != null) {
            return e35VarM93699q0.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final Throwable m93687h0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th = (Throwable) cause;
            return th == null ? new JobCancellationException(mo93683d0(), null, this) : th;
        }
        cause.getClass();
        return ((b860) cause).mo93655N();
    }

    /* JADX INFO: renamed from: i0 */
    public final Object m93688i0(C15399c state, Object proposedUpdate) throws Throwable {
        boolean zM93718h;
        Throwable thM93694m0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        pn5 pn5Var = proposedUpdate instanceof pn5 ? (pn5) proposedUpdate : null;
        Throwable th = pn5Var != null ? pn5Var.cause : null;
        synchronized (state) {
            zM93718h = state.m93718h();
            List<Throwable> listM93722l = state.m93722l(th);
            thM93694m0 = m93694m0(state, listM93722l);
            if (thM93694m0 != null) {
                m93666U(thM93694m0, listM93722l);
            }
        }
        if (thM93694m0 != null && thM93694m0 != th) {
            proposedUpdate = new pn5(thM93694m0, false, 2, defaultConstructorMarker);
        }
        if (thM93694m0 != null && (m93681c0(thM93694m0) || mo93702u0(thM93694m0))) {
            proposedUpdate.getClass();
            ((pn5) proposedUpdate).m170401c();
        }
        if (!zM93718h) {
            mo93652L0(thM93694m0);
        }
        mo93654M0(proposedUpdate);
        C21643z7.m217426a(f66680a, this, state, onq.m165222g(proposedUpdate));
        m93685f0(state, proposedUpdate);
        return proposedUpdate;
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    public final boolean isCancelled() {
        Object objM93700r0 = m93700r0();
        if (objM93700r0 instanceof pn5) {
            return true;
        }
        return (objM93700r0 instanceof C15399c) && ((C15399c) objM93700r0).m93718h();
    }

    /* JADX INFO: renamed from: j0 */
    public final f35 m93689j0(nrm state) {
        f35 f35Var = state instanceof f35 ? (f35) state : null;
        if (f35Var != null) {
            return f35Var;
        }
        kl40 list = state.getList();
        if (list != null) {
            return m93644G0(list);
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    /* JADX INFO: renamed from: k */
    public boolean mo93690k() {
        Object objM93700r0 = m93700r0();
        return (objM93700r0 instanceof nrm) && ((nrm) objM93700r0).getIsActive();
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final Object m93691k0() throws Throwable {
        Object objM93700r0 = m93700r0();
        if (objM93700r0 instanceof nrm) {
            qkq0.m175383a("This job has not completed yet");
            return null;
        }
        if (objM93700r0 instanceof pn5) {
            throw ((pn5) objM93700r0).cause;
        }
        return onq.m165223h(objM93700r0);
    }

    /* JADX INFO: renamed from: l0 */
    public final Throwable m93692l0(Object obj) {
        pn5 pn5Var = obj instanceof pn5 ? (pn5) obj : null;
        if (pn5Var != null) {
            return pn5Var.cause;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    /* JADX INFO: renamed from: m */
    public final boolean mo93693m() {
        return !(m93700r0() instanceof nrm);
    }

    /* JADX INFO: renamed from: m0 */
    public final Throwable m93694m0(C15399c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.m93718h()) {
                return new JobCancellationException(mo93683d0(), null, this);
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
        return InterfaceC15486o.a.m94248d(this, key);
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    /* JADX INFO: renamed from: n */
    public void mo93695n(@Nullable CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(mo93683d0(), null, this);
        }
        mo93677a0(cause);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean getHandlesException() {
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo93697o0() {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final kl40 m93698p0(nrm state) {
        kl40 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof oye) {
            return new kl40();
        }
        if (state instanceof inq) {
            m93658P0((inq) state);
            return null;
        }
        nnq.m160357a("State should have list: ", state);
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC15486o.a.m94249e(this, coroutineContext);
    }

    @Nullable
    /* JADX INFO: renamed from: q0 */
    public final e35 m93699q0() {
        return (e35) f66681b.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    public final Object m93700r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66680a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof zo50)) {
                return obj;
            }
            ((zo50) obj).mo114579a(this);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    public final boolean start() {
        int iM93665T0;
        do {
            iM93665T0 = m93665T0(m93700r0());
            if (iM93665T0 == 0) {
                return false;
            }
        } while (iM93665T0 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return m93672X0() + '@' + o8c.m163112b(this);
    }

    @Override // kotlinx.coroutines.InterfaceC15486o
    @NotNull
    /* JADX INFO: renamed from: u */
    public final l4e mo93701u(@NotNull Function1<? super Throwable, Unit> handler) {
        return m93705x0(false, true, new InterfaceC15485n.a(handler));
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo93702u0(@NotNull Throwable exception) {
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m93704w0(@Nullable InterfaceC15486o parent) {
        if (parent == null) {
            m93664S0(nl40.INSTANCE);
            return;
        }
        parent.start();
        e35 e35VarMo93659Q = parent.mo93659Q(this);
        m93664S0(e35VarMo93659Q);
        if (mo93693m()) {
            e35VarMo93659Q.dispose();
            m93664S0(nl40.INSTANCE);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final l4e m93705x0(boolean onCancelling, boolean invokeImmediately, @NotNull InterfaceC15485n handler) {
        inq inqVarM93641E0 = m93641E0(handler, onCancelling);
        while (true) {
            Object objM93700r0 = m93700r0();
            if (objM93700r0 instanceof oye) {
                oye oyeVar = (oye) objM93700r0;
                if (!oyeVar.getIsActive()) {
                    m93657O0(oyeVar);
                } else if (C21643z7.m217426a(f66680a, this, objM93700r0, inqVarM93641E0)) {
                    break;
                }
            } else {
                Throwable thM93717d = null;
                if (!(objM93700r0 instanceof nrm)) {
                    if (invokeImmediately) {
                        pn5 pn5Var = objM93700r0 instanceof pn5 ? (pn5) objM93700r0 : null;
                        handler.mo93710a(pn5Var != null ? pn5Var.cause : null);
                    }
                    return nl40.INSTANCE;
                }
                kl40 list = ((nrm) objM93700r0).getList();
                if (list == null) {
                    m93658P0((inq) objM93700r0);
                } else {
                    l4e l4eVar = nl40.INSTANCE;
                    if (onCancelling && (objM93700r0 instanceof C15399c)) {
                        synchronized (objM93700r0) {
                            try {
                                thM93717d = ((C15399c) objM93700r0).m93717d();
                                if (thM93717d == null || ((handler instanceof f35) && !((C15399c) objM93700r0).m93719i())) {
                                    if (m93661R(objM93700r0, list, inqVarM93641E0)) {
                                        if (thM93717d == null) {
                                            return inqVarM93641E0;
                                        }
                                        l4eVar = inqVarM93641E0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thM93717d != null) {
                        if (invokeImmediately) {
                            handler.mo93710a(thM93717d);
                        }
                        return l4eVar;
                    }
                    if (m93661R(objM93700r0, list, inqVarM93641E0)) {
                        break;
                    }
                }
            }
        }
        return inqVarM93641E0;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo93706y0() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m93707z0() {
        Object objM93700r0;
        do {
            objM93700r0 = m93700r0();
            if (!(objM93700r0 instanceof nrm)) {
                return false;
            }
        } while (m93665T0(objM93700r0) < 0);
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public void mo93703v0(@NotNull Throwable exception) throws Throwable {
        throw exception;
    }
}
