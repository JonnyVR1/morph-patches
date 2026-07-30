package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.C15390h;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21643z7;
import p149l.b2s;
import p149l.bde0;
import p149l.bf4;
import p149l.df4;
import p149l.gr4;
import p149l.h5f;
import p149l.j6f;
import p149l.lmr;
import p149l.ls5;
import p149l.mce0;
import p149l.ms5;
import p149l.msm;
import p149l.nfc0;
import p149l.nnq;
import p149l.oce0;
import p149l.ofp0;
import p149l.pce0;
import p149l.pfp0;
import p149l.qkq0;
import p149l.qq3;
import p149l.uce0;
import p149l.ur4;
import p149l.usf0;
import p149l.uwp;
import p149l.vce0;
import p149l.wce0;
import p149l.xce0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003¥\u0001:B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J:\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010E\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bK\u0010LJ%\u0010M\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bM\u0010HJ%\u0010N\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bN\u0010HJ%\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bO\u0010HJ\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u00109J\u000f\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bR\u00109J\u000f\u0010S\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u00109J\u000f\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u00109J\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bX\u0010@J\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bY\u0010ZJ\u001d\u0010\\\u001a\u00020\u00112\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010`\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010bJ\u0013\u0010c\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010e\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\be\u0010dJ\u001b\u0010g\u001a\u00020\u0006*\u00020\u00152\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020\u00112\u0006\u0010j\u001a\u00020\u001eH\u0002¢\u0006\u0004\bk\u0010lJ-\u0010n\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010m\u001a\u00020\u0011H\u0002¢\u0006\u0004\bn\u0010<J-\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bq\u0010rJ-\u0010s\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010rJ5\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bu\u0010vJ%\u0010w\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u0011H\u0002¢\u0006\u0004\bz\u0010@J\u0017\u0010{\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u0011H\u0002¢\u0006\u0004\b{\u0010@J\u0018\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\rJ#\u0010|\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b~\u0010\rJ#\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u007f\u0010}J\u0012\u0010\u0080\u0001\u001a\u00020\u001eH\u0010¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0082\u0001\u00109J\u0011\u0010\u0083\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0083\u0001\u00109J\u0013\u0010\u0084\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b*\u0010\u0085\u0001J\u001e\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0089\u0001\u0010@J\u0019\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u008a\u0001\u0010@J'\u0010\u008b\u0001\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0005\b\u008b\u0001\u0010JJ\u001a\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008c\u0001H\u0096\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008f\u0001\u00109J\u001e\u0010\u0092\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J#\u0010\u0096\u0001\u001a\u00020\u00062\u0011\u0010\u0091\u0001\u001a\f\u0018\u00010\u0094\u0001j\u0005\u0018\u0001`\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0010¢\u0006\u0006\b\u0098\u0001\u0010\u0093\u0001J'\u0010\u009a\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J<\u0010\u009f\u0001\u001a\u00020\u00062(\u0010\u009e\u0001\u001a#\u0012\u0019\u0012\u0017\u0018\u00010\u0090\u0001¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0012\u0010¡\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¡\u0001\u0010\u0081\u0001J\u0013\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010'R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010¦\u0001R\u008a\u0001\u0010®\u0001\u001an\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030A¢\u0006\u000e\b\u009c\u0001\u0012\t\b\u009d\u0001\u0012\u0004\b\b(B\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(¨\u0001\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(©\u0001\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010§\u0001j\u0005\u0018\u0001`ª\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0005\b\u00ad\u0001\u00109R\u0017\u0010±\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010³\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010\u0081\u0001R\u0018\u0010¶\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010¸\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010%R\u001a\u0010º\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010%R\u0016\u0010`\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010°\u0001R\u0017\u0010½\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010°\u0001R1\u0010Á\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000¾\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÀ\u0001\u00109\u001a\u0006\b«\u0001\u0010¿\u0001R%\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÅ\u0001\u00109\u001a\u0006\bÃ\u0001\u0010Ä\u0001R+\u0010É\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000Â\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÈ\u0001\u00109\u001a\u0006\bÇ\u0001\u0010Ä\u0001R\u001a\u0010Ë\u0001\u001a\u0005\u0018\u00010\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010µ\u0001R\u0018\u0010Í\u0001\u001a\u00030\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010µ\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u0081\u0001R\u001d\u0010Ñ\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÐ\u0001\u00109\u001a\u0005\b\u0012\u0010\u0081\u0001R\u001d\u0010j\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0001\u00109\u001a\u0006\bÒ\u0001\u0010\u0081\u0001R\u0015\u0010Õ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ô\u00018\u0002X\u0082\u0004R\r\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ô\u00018\u0002X\u0082\u0004R\r\u0010Ú\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Û\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\r\u0010Ü\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\r\u0010Þ\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ß\u0001"}, m87232d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Ll/gr4;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "F0", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ur4;", "segment", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f44446s, "c1", "(Ll/ur4;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ofp0;", "K0", "(Ll/ofp0;Ll/ur4;I)V", "Ll/bf4;", "cont", "G0", "(Ljava/lang/Object;Ll/bf4;)V", "", "waiter", "", "closed", "m1", "(Ll/ur4;ILjava/lang/Object;JLjava/lang/Object;Z)I", "n1", "curSendersAndCloseStatus", "d1", "(J)Z", "curSenders", "I", "f1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "S0", "(Ll/ur4;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J0", "C0", "(Ll/bf4;)V", "Lkotlinx/coroutines/channels/a;", "R0", "B0", "k1", "(Ll/ur4;IJLjava/lang/Object;)Ljava/lang/Object;", "l1", "g1", "(Ljava/lang/Object;Ll/ur4;I)Z", "R", "()V", "b", "i1", "(Ll/ur4;IJ)Z", "j1", "nAttempts", "l0", "(J)V", "Ll/bde0;", "select", "E0", "(Ljava/lang/Object;Ll/bde0;)V", "ignoredParam", "selectResult", "O0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T0", "(Ll/bde0;Ljava/lang/Object;)V", "D0", "(Ll/bde0;)V", "L0", "N0", "M0", "n0", "y0", "x0", "w0", "P", "sendersCur", BloodType.f38728O, "(J)Ll/ur4;", "N", "L", "()Ll/ur4;", "lastSegment", "v0", "(Ll/ur4;)J", "V0", "(Ll/ur4;)V", "sendersCounter", "K", "(Ll/ur4;J)V", "W0", "(Ll/ofp0;)V", "X0", "receiver", "Y0", "(Ll/ofp0;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "p0", "(JZ)Z", "globalIndex", "o0", "id", "startFrom", "U", "(JLl/ur4;)Ll/ur4;", j6f.GPS_DIRECTION_TRUE, "currentBufferEndCounter", j6f.LATITUDE_SOUTH, "(JLl/ur4;J)Ll/ur4;", "z0", "(JLl/ur4;)V", "value", "p1", "o1", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Object;)Ljava/lang/Object;", "a1", "h1", "e1", "()Z", "I0", "H0", b2s.C_ZONE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "globalCellIndex", "Q", "q1", "U0", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "A0", "", "cause", "D", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "n", "(Ljava/util/concurrent/CancellationException;)V", "J", "cancel", "M", "(Ljava/lang/Throwable;Z)Z", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "handler", "j", "(Lkotlin/jvm/functions/Function1;)V", "k0", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "W", "()J", "bufferEndCounter", "u0", "isRendezvousOrUnlimited", "b0", "()Ljava/lang/Throwable;", "receiveException", "s0", "isClosedForSend0", "r0", "isClosedForReceive0", "i0", "e0", "receiversCounter", "Ll/wce0;", "()Ll/wce0;", "getOnSend$annotations", "onSend", "Ll/uce0;", BaseSei.f13932Z, "()Ll/uce0;", "getOnReceive$annotations", "onReceive", "o", "getOnReceiveCatching$annotations", "onReceiveCatching", "Y", "closeCause", "f0", "sendException", "t0", "isConflatedDropOldest", "isClosedForSend$annotations", "isClosedForSend", "q0", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class BufferedChannel<E> implements gr4<E> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f66711d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f66712e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f66713f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f66714g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66715h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66716i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66717j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66718k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66719l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$a;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Ll/ofp0;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/mce0;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "g", "(Ll/mce0;I)V", "next", "()Ljava/lang/Object;", "element", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Z", "j", "()V", "f", "()Z", "Ll/ur4;", "", "r", "e", "(Ll/ur4;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "", "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/c;", "b", "Lkotlinx/coroutines/c;", "continuation", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C15410a implements ChannelIterator<E>, ofp0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object receiveResult = BufferedChannelKt.f66743p;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C15407c<? super Boolean> continuation;

        public C15410a() {
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo93915a(@NotNull Continuation<? super Boolean> continuation) {
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            ur4<E> ur4Var = (ur4) BufferedChannel.m93813c0().get(bufferedChannel);
            while (!bufferedChannel.m93899q0()) {
                long andIncrement = BufferedChannel.m93814d0().getAndIncrement(bufferedChannel);
                int i = BufferedChannelKt.f66729b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (ur4Var.id != j) {
                    ur4<E> ur4VarM93861T = bufferedChannel.m93861T(j, ur4Var);
                    if (ur4VarM93861T == null) {
                        continue;
                    } else {
                        ur4Var = ur4VarM93861T;
                    }
                }
                Object objM93886k1 = bufferedChannel.m93886k1(ur4Var, i2, andIncrement, null);
                if (objM93886k1 == BufferedChannelKt.f66740m) {
                    qkq0.m175383a("unreachable");
                    return null;
                }
                if (objM93886k1 != BufferedChannelKt.f66742o) {
                    if (objM93886k1 == BufferedChannelKt.f66741n) {
                        return m93916e(ur4Var, i2, andIncrement, continuation);
                    }
                    ur4Var.m156109c();
                    this.receiveResult = objM93886k1;
                    return Boxing.m87370a(true);
                }
                if (andIncrement < bufferedChannel.m93881i0()) {
                    ur4Var.m156109c();
                }
            }
            return Boxing.m87370a(m93917f());
        }

        /* JADX INFO: renamed from: e */
        public final Object m93916e(ur4<E> ur4Var, int i, long j, Continuation<? super Boolean> continuation) {
            Boolean boolM87370a;
            Function1<E, Unit> function1;
            CoroutineContext f63379a;
            ur4 ur4Var2;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation));
            try {
                this.continuation = c15407cM111430b;
                Object objM93886k1 = bufferedChannel.m93886k1(ur4Var, i, j, this);
                if (objM93886k1 == BufferedChannelKt.f66740m) {
                    bufferedChannel.m93844J0(this, ur4Var, i);
                } else {
                    Function1<Throwable, Unit> function1M94211a = null;
                    if (objM93886k1 == BufferedChannelKt.f66742o) {
                        if (j < bufferedChannel.m93881i0()) {
                            ur4Var.m156109c();
                        }
                        ur4 ur4Var3 = (ur4) BufferedChannel.m93813c0().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.m93899q0()) {
                                m93918h();
                            } else {
                                long andIncrement = BufferedChannel.m93814d0().getAndIncrement(bufferedChannel);
                                int i2 = BufferedChannelKt.f66729b;
                                long j2 = andIncrement / ((long) i2);
                                int i3 = (int) (andIncrement % ((long) i2));
                                if (ur4Var3.id != j2) {
                                    ur4 ur4VarM93861T = bufferedChannel.m93861T(j2, ur4Var3);
                                    if (ur4VarM93861T != null) {
                                        ur4Var2 = ur4VarM93861T;
                                    }
                                } else {
                                    ur4Var2 = ur4Var3;
                                }
                                objM93886k1 = bufferedChannel.m93886k1(ur4Var2, i3, andIncrement, this);
                                ur4 ur4Var4 = ur4Var2;
                                if (objM93886k1 == BufferedChannelKt.f66740m) {
                                    bufferedChannel.m93844J0(this, ur4Var4, i3);
                                } else if (objM93886k1 == BufferedChannelKt.f66742o) {
                                    if (andIncrement < bufferedChannel.m93881i0()) {
                                        ur4Var4.m156109c();
                                    }
                                    ur4Var3 = ur4Var4;
                                } else {
                                    if (objM93886k1 == BufferedChannelKt.f66741n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    ur4Var4.m156109c();
                                    this.receiveResult = objM93886k1;
                                    this.continuation = null;
                                    boolM87370a = Boxing.m87370a(true);
                                    function1 = bufferedChannel.onUndeliveredElement;
                                    if (function1 != null) {
                                        f63379a = c15407cM111430b.getContext();
                                        function1M94211a = OnUndeliveredElementKt.m94211a(function1, objM93886k1, f63379a);
                                    }
                                    c15407cM111430b.mo93764f(boolM87370a, function1M94211a);
                                }
                            }
                        }
                    } else {
                        ur4Var.m156109c();
                        this.receiveResult = objM93886k1;
                        this.continuation = null;
                        boolM87370a = Boxing.m87370a(true);
                        function1 = bufferedChannel.onUndeliveredElement;
                        if (function1 != null) {
                            f63379a = c15407cM111430b.getContext();
                            function1M94211a = OnUndeliveredElementKt.m94211a(function1, objM93886k1, f63379a);
                        }
                        c15407cM111430b.mo93764f(boolM87370a, function1M94211a);
                    }
                }
                Object objM93778v = c15407cM111430b.m93778v();
                if (objM93778v == uwp.m196133e()) {
                    DebugProbesKt.m87383c(continuation);
                }
                return objM93778v;
            } catch (Throwable th) {
                c15407cM111430b.m93752O();
                throw th;
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m93917f() throws Throwable {
            this.receiveResult = BufferedChannelKt.m93950z();
            Throwable thM93868Y = BufferedChannel.this.m93868Y();
            if (thM93868Y == null) {
                return false;
            }
            throw usf0.m195195a(thM93868Y);
        }

        @Override // p149l.ofp0
        /* JADX INFO: renamed from: g */
        public void mo93765g(@NotNull mce0<?> segment, int index) {
            C15407c<? super Boolean> c15407c = this.continuation;
            if (c15407c != null) {
                c15407c.mo93765g(segment, index);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m93918h() {
            C15407c<? super Boolean> c15407c = this.continuation;
            c15407c.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m93950z();
            Throwable thM93868Y = BufferedChannel.this.m93868Y();
            if (thM93868Y == null) {
                Result.Companion companion = Result.INSTANCE;
                c15407c.resumeWith(Result.m223820constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c15407c.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(thM93868Y)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m93919i(E element) {
            C15407c<? super Boolean> c15407c = this.continuation;
            c15407c.getClass();
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            Function1<E, Unit> function1 = BufferedChannel.this.onUndeliveredElement;
            return BufferedChannelKt.m93923B(c15407c, bool, function1 != null ? OnUndeliveredElementKt.m94211a(function1, element, c15407c.getContext()) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m93920j() {
            C15407c<? super Boolean> c15407c = this.continuation;
            c15407c.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m93950z();
            Throwable thM93868Y = BufferedChannel.this.m93868Y();
            if (thM93868Y == null) {
                Result.Companion companion = Result.INSTANCE;
                c15407c.resumeWith(Result.m223820constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c15407c.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(thM93868Y)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e = (E) this.receiveResult;
            if (e == BufferedChannelKt.f66743p) {
                qkq0.m175383a("`hasNext()` has not been invoked");
                return null;
            }
            this.receiveResult = BufferedChannelKt.f66743p;
            if (e != BufferedChannelKt.m93950z()) {
                return e;
            }
            throw usf0.m195195a(BufferedChannel.this.m93871b0());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$b */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$b;", "Ll/ofp0;", "Ll/bf4;", "", "cont", "<init>", "(Ll/bf4;)V", "Ll/mce0;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "g", "(Ll/mce0;I)V", "a", "Ll/bf4;", "()Ll/bf4;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15411b implements ofp0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final bf4<Boolean> cont;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C15407c<Boolean> f66727b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15411b(@NotNull bf4<? super Boolean> bf4Var) {
            this.cont = bf4Var;
            bf4Var.getClass();
            this.f66727b = (C15407c) bf4Var;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final bf4<Boolean> m93921a() {
            return this.cont;
        }

        @Override // p149l.ofp0
        /* JADX INFO: renamed from: g */
        public void mo93765g(@NotNull mce0<?> segment, int index) {
            this.f66727b.mo93765g(segment, index);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1<? super E, kotlin.Unit>, kotlin.jvm.functions.Function1<E, kotlin.Unit>] */
    public BufferedChannel(int i, @Nullable Function1<? super E, Unit> function1) {
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i < 0) {
            pce0.m168340a("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        this.bufferEnd$volatile = BufferedChannelKt.m93922A(i);
        this.completedExpandBuffersAndPauseFlag$volatile = m93865W();
        ur4 ur4Var = new ur4(0L, null, this, 3);
        this.sendSegment$volatile = ur4Var;
        this.receiveSegment$volatile = ur4Var;
        if (m93905u0()) {
            ur4Var = BufferedChannelKt.f66728a;
            ur4Var.getClass();
        }
        this.bufferEndSegment$volatile = ur4Var;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new Function3<bde0<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            final /* synthetic */ BufferedChannel<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function3
            @NotNull
            public final Function1<Throwable, Unit> invoke(@NotNull final bde0<?> bde0Var, @Nullable Object obj, @Nullable final Object obj2) {
                final BufferedChannel<E> bufferedChannel = this.this$0;
                return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        if (obj2 != BufferedChannelKt.m93950z()) {
                            OnUndeliveredElementKt.m94212b(bufferedChannel.onUndeliveredElement, obj2, bde0Var.getContext());
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                };
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.f66746s;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ <E> Object m93803P0(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        ur4<E> ur4Var;
        ur4<E> ur4Var2 = (ur4) m93813c0().get(bufferedChannel);
        while (!bufferedChannel.m93899q0()) {
            long andIncrement = m93814d0().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.f66729b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ur4Var2.id != j) {
                ur4<E> ur4VarM93861T = bufferedChannel.m93861T(j, ur4Var2);
                if (ur4VarM93861T == null) {
                    continue;
                } else {
                    ur4Var = ur4VarM93861T;
                }
            } else {
                ur4Var = ur4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM93886k1 = bufferedChannel2.m93886k1(ur4Var, i2, andIncrement, null);
            if (objM93886k1 == BufferedChannelKt.f66740m) {
                qkq0.m175383a("unexpected");
                return null;
            }
            if (objM93886k1 != BufferedChannelKt.f66742o) {
                if (objM93886k1 == BufferedChannelKt.f66741n) {
                    return bufferedChannel2.m93860S0(ur4Var, i2, andIncrement, continuation);
                }
                ur4Var.m156109c();
                return objM93886k1;
            }
            if (andIncrement < bufferedChannel2.m93881i0()) {
                ur4Var.m156109c();
            }
            bufferedChannel = bufferedChannel2;
            ur4Var2 = ur4Var;
        }
        throw usf0.m195195a(bufferedChannel.m93871b0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ <E> Object m93804Q0(BufferedChannel<E> bufferedChannel, Continuation<? super C15414a<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ur4<E> ur4Var;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            int i = bufferedChannel$receiveCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object objM196133e = uwp.m196133e();
        int i2 = bufferedChannel$receiveCatching$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.m87239b(obj);
                return ((C15414a) obj).getHolder();
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        ur4<E> ur4Var2 = (ur4) m93813c0().get(bufferedChannel);
        while (!bufferedChannel.m93899q0()) {
            long andIncrement = m93814d0().getAndIncrement(bufferedChannel);
            int i3 = BufferedChannelKt.f66729b;
            long j = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (ur4Var2.id != j) {
                ur4<E> ur4VarM93861T = bufferedChannel.m93861T(j, ur4Var2);
                if (ur4VarM93861T == null) {
                    continue;
                } else {
                    ur4Var = ur4VarM93861T;
                }
            } else {
                ur4Var = ur4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM93886k1 = bufferedChannel2.m93886k1(ur4Var, i4, andIncrement, null);
            if (objM93886k1 == BufferedChannelKt.f66740m) {
                qkq0.m175383a("unexpected");
                return null;
            }
            if (objM93886k1 != BufferedChannelKt.f66742o) {
                if (objM93886k1 != BufferedChannelKt.f66741n) {
                    ur4Var.m156109c();
                    return C15414a.INSTANCE.m94003c(objM93886k1);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM93858R0 = bufferedChannel2.m93858R0(ur4Var, i4, andIncrement, bufferedChannel$receiveCatching$2);
                return objM93858R0 == objM196133e ? objM196133e : objM93858R0;
            }
            if (andIncrement < bufferedChannel2.m93881i0()) {
                ur4Var.m156109c();
            }
            bufferedChannel = bufferedChannel2;
            ur4Var2 = ur4Var;
        }
        return C15414a.INSTANCE.m94001a(bufferedChannel.m93868Y());
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ <E> Object m93808Z0(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Unit> continuation) throws IllegalAccessException, InvocationTargetException {
        ur4<E> ur4Var;
        ur4<E> ur4Var2 = (ur4) m93818g0().get(bufferedChannel);
        while (true) {
            long andIncrement = m93820h0().getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zM93903s0 = bufferedChannel.m93903s0(andIncrement);
            int i = BufferedChannelKt.f66729b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ur4Var2.id != j2) {
                ur4<E> ur4VarM93863U = bufferedChannel.m93863U(j2, ur4Var2);
                if (ur4VarM93863U != null) {
                    ur4Var = ur4VarM93863U;
                } else if (zM93903s0) {
                    Object objM93839F0 = bufferedChannel.m93839F0(e, continuation);
                    if (objM93839F0 != uwp.m196133e()) {
                        break;
                    }
                    return objM93839F0;
                }
            } else {
                ur4Var = ur4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e2 = e;
            int iM93889m1 = bufferedChannel2.m93889m1(ur4Var, i2, e2, j, null, zM93903s0);
            if (iM93889m1 == 0) {
                ur4Var.m156109c();
                break;
            }
            if (iM93889m1 != 1) {
                if (iM93889m1 == 2) {
                    if (!zM93903s0) {
                        break;
                    }
                    ur4Var.m153993t();
                    Object objM93839F1 = bufferedChannel2.m93839F0(e2, continuation);
                    if (objM93839F1 != uwp.m196133e()) {
                        break;
                    }
                    return objM93839F1;
                }
                if (iM93889m1 == 3) {
                    Object objM93873c1 = bufferedChannel2.m93873c1(ur4Var, i2, e2, j, continuation);
                    if (objM93873c1 != uwp.m196133e()) {
                        break;
                    }
                    return objM93873c1;
                }
                if (iM93889m1 == 4) {
                    if (j < bufferedChannel2.m93875e0()) {
                        ur4Var.m156109c();
                    }
                    Object objM93839F2 = bufferedChannel2.m93839F0(e2, continuation);
                    if (objM93839F2 != uwp.m196133e()) {
                        break;
                    }
                    return objM93839F2;
                }
                if (iM93889m1 == 5) {
                    ur4Var.m156109c();
                }
                bufferedChannel = bufferedChannel2;
                ur4Var2 = ur4Var;
                e = e2;
            } else {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ <E> Object m93812b1(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Boolean> continuation) {
        ur4 ur4VarM93863U;
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        if (bufferedChannel.onUndeliveredElement != null) {
            qkq0.m175383a("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
            return null;
        }
        C15411b c15411b = new C15411b(c15407c);
        ur4 ur4Var = (ur4) m93818g0().get(bufferedChannel);
        while (true) {
            long andIncrement = m93820h0().getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zM93903s0 = bufferedChannel.m93903s0(andIncrement);
            int i = BufferedChannelKt.f66729b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ur4Var.id != j2) {
                ur4VarM93863U = bufferedChannel.m93863U(j2, ur4Var);
                if (ur4VarM93863U == null) {
                    if (zM93903s0) {
                        Result.Companion companion = Result.INSTANCE;
                        c15407c.resumeWith(Result.m223820constructorimpl(Boxing.m87370a(false)));
                        break;
                    }
                }
            } else {
                ur4VarM93863U = ur4Var;
            }
            int iM93889m1 = bufferedChannel.m93889m1(ur4VarM93863U, i2, e, j, c15411b, zM93903s0);
            if (iM93889m1 == 0) {
                ur4VarM93863U.m156109c();
            } else if (iM93889m1 != 1) {
                if (iM93889m1 == 2) {
                    if (!zM93903s0) {
                        bufferedChannel.m93846K0(c15411b, ur4VarM93863U, i2);
                        break;
                    }
                    ur4VarM93863U.m153993t();
                } else {
                    if (iM93889m1 == 3) {
                        qkq0.m175383a("unexpected");
                        return null;
                    }
                    if (iM93889m1 != 4) {
                        if (iM93889m1 == 5) {
                            ur4VarM93863U.m156109c();
                        }
                        ur4Var = ur4VarM93863U;
                    } else if (j < bufferedChannel.m93875e0()) {
                        ur4VarM93863U.m156109c();
                    }
                }
                Result.Companion companion2 = Result.INSTANCE;
                c15407c.resumeWith(Result.m223820constructorimpl(Boxing.m87370a(false)));
                break;
            }
            Result.Companion companion3 = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(Boxing.m87370a(true)));
            break;
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v;
    }

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m93813c0() {
        return f66716i;
    }

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m93814d0() {
        return f66712e;
    }

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m93818g0() {
        return f66715h;
    }

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m93820h0() {
        return f66711d;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m93825m0(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
            return;
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.m93887l0(j);
    }

    /* JADX INFO: renamed from: A0 */
    public void m93833A0() {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m93834B0(bf4<? super C15414a<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m223820constructorimpl(C15414a.m93991b(C15414a.INSTANCE.m94001a(m93868Y()))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* JADX INFO: renamed from: C */
    public Object mo93835C(@NotNull Continuation<? super E> continuation) {
        return m93803P0(this, continuation);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m93836C0(bf4<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(m93871b0())));
    }

    @Override // p149l.nee0
    /* JADX INFO: renamed from: D */
    public boolean mo93786D(@Nullable Throwable cause) {
        return m93849M(cause, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m93837D0(bde0<?> select) {
        select.mo94310d(BufferedChannelKt.m93950z());
    }

    @Override // p149l.nee0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo93787E(E e, @NotNull Continuation<? super Unit> continuation) {
        return m93808Z0(this, e, continuation);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m93838E0(E element, bde0<?> select) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.m94212b(function1, element, select.getContext());
        }
        select.mo94310d(BufferedChannelKt.m93950z());
    }

    /* JADX INFO: renamed from: F0 */
    public final Object m93839F0(E e, Continuation<? super Unit> continuation) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM94214d;
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM94214d = OnUndeliveredElementKt.m94214d(function1, e, null, 2, null)) == null) {
            Throwable thM93877f0 = m93877f0();
            Result.Companion companion = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(thM93877f0)));
        } else {
            h5f.m129395a(undeliveredElementExceptionM94214d, m93877f0());
            Result.Companion companion2 = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(undeliveredElementExceptionM94214d)));
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m93840G0(E element, bf4<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.m94212b(function1, element, cont.getContext());
        }
        Throwable thM93877f0 = m93877f0();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(thM93877f0)));
    }

    /* JADX INFO: renamed from: H0 */
    public void m93841H0() {
    }

    /* JADX INFO: renamed from: I */
    public final boolean m93842I(long curSenders) {
        return curSenders < m93865W() || curSenders < m93875e0() + ((long) this.capacity);
    }

    /* JADX INFO: renamed from: I0 */
    public void m93843I0() {
    }

    /* JADX INFO: renamed from: J */
    public boolean mo93788J(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return m93849M(cause, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m93844J0(ofp0 ofp0Var, ur4<E> ur4Var, int i) {
        m93843I0();
        ofp0Var.mo93765g(ur4Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m93845K(ur4<E> lastSegment, long sendersCounter) {
        Object objM156166b = msm.m156166b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = BufferedChannelKt.f66729b - 1; -1 < i; i--) {
                if ((lastSegment.id * ((long) BufferedChannelKt.f66729b)) + ((long) i) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objM195038B = lastSegment.m195038B(i);
                    if (objM195038B != null && objM195038B != BufferedChannelKt.f66732e) {
                        if (!(objM195038B instanceof pfp0)) {
                            if (!(objM195038B instanceof ofp0)) {
                                break;
                            }
                            if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                                objM156166b = msm.m156167c(objM156166b, objM195038B);
                                lastSegment.m195039C(i, true);
                                break;
                            }
                        } else {
                            if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                                objM156166b = msm.m156167c(objM156166b, ((pfp0) objM195038B).waiter);
                                lastSegment.m195039C(i, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                            lastSegment.m153993t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ur4) lastSegment.m156114h();
        }
        if (objM156166b != null) {
            if (!(objM156166b instanceof ArrayList)) {
                m93866W0((ofp0) objM156166b);
                return;
            }
            ArrayList arrayList = (ArrayList) objM156166b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m93866W0((ofp0) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m93846K0(ofp0 ofp0Var, ur4<E> ur4Var, int i) {
        ofp0Var.mo93765g(ur4Var, i + BufferedChannelKt.f66729b);
    }

    /* JADX INFO: renamed from: L */
    public final ur4<E> m93847L() {
        Object obj = f66717j.get(this);
        ur4 ur4Var = (ur4) f66715h.get(this);
        if (ur4Var.id > ((ur4) obj).id) {
            obj = ur4Var;
        }
        ur4 ur4Var2 = (ur4) f66716i.get(this);
        if (ur4Var2.id > ((ur4) obj).id) {
            obj = ur4Var2;
        }
        return (ur4) ls5.m151514b((ms5) obj);
    }

    /* JADX INFO: renamed from: L0 */
    public final Object m93848L0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m93950z()) {
            return selectResult;
        }
        throw m93871b0();
    }

    /* JADX INFO: renamed from: M */
    public boolean m93849M(@Nullable Throwable cause, boolean cancel) {
        if (cancel) {
            m93907w0();
        }
        boolean zM217426a = C21643z7.m217426a(f66718k, this, BufferedChannelKt.f66746s, cause);
        if (cancel) {
            m93908x0();
        } else {
            m93909y0();
        }
        m93855P();
        m93833A0();
        if (zM217426a) {
            m93891n0();
        }
        return zM217426a;
    }

    /* JADX INFO: renamed from: M0 */
    public final Object m93850M0(Object ignoredParam, Object selectResult) {
        return C15414a.m93991b(selectResult == BufferedChannelKt.m93950z() ? C15414a.INSTANCE.m94001a(m93868Y()) : C15414a.INSTANCE.m94003c(selectResult));
    }

    /* JADX INFO: renamed from: N */
    public final void m93851N(long sendersCur) throws IllegalAccessException, InvocationTargetException {
        m93864V0(m93853O(sendersCur));
    }

    /* JADX INFO: renamed from: N0 */
    public final Object m93852N0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m93950z()) {
            return selectResult;
        }
        if (m93868Y() == null) {
            return null;
        }
        throw m93871b0();
    }

    /* JADX INFO: renamed from: O */
    public final ur4<E> m93853O(long sendersCur) {
        ur4<E> ur4VarM93847L = m93847L();
        if (mo93904t0()) {
            long jM93906v0 = m93906v0(ur4VarM93847L);
            if (jM93906v0 != -1) {
                m93856Q(jM93906v0);
            }
        }
        m93845K(ur4VarM93847L, sendersCur);
        return ur4VarM93847L;
    }

    /* JADX INFO: renamed from: O0 */
    public final Object m93854O0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m93950z()) {
            return this;
        }
        throw m93877f0();
    }

    /* JADX INFO: renamed from: P */
    public final void m93855P() {
        mo93792s();
    }

    /* JADX INFO: renamed from: Q */
    public final void m93856Q(long globalCellIndex) {
        ur4<E> ur4Var;
        UndeliveredElementException undeliveredElementExceptionM94214d;
        ur4<E> ur4Var2 = (ur4) f66716i.get(this);
        while (true) {
            long j = f66712e.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j, this.m93865W())) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            this = bufferedChannel;
            if (f66712e.compareAndSet(bufferedChannel, j, 1 + j)) {
                int i = BufferedChannelKt.f66729b;
                long j2 = j / ((long) i);
                int i2 = (int) (j % ((long) i));
                if (ur4Var2.id != j2) {
                    ur4<E> ur4VarM93861T = this.m93861T(j2, ur4Var2);
                    if (ur4VarM93861T != null) {
                        ur4Var = ur4VarM93861T;
                    }
                } else {
                    ur4Var = ur4Var2;
                }
                Object objM93886k1 = this.m93886k1(ur4Var, i2, j, null);
                if (objM93886k1 != BufferedChannelKt.f66742o) {
                    ur4Var.m156109c();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionM94214d = OnUndeliveredElementKt.m94214d(function1, objM93886k1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionM94214d;
                    }
                } else if (j < this.m93881i0()) {
                    ur4Var.m156109c();
                }
                ur4Var2 = ur4Var;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m93857R() {
        BufferedChannel<E> bufferedChannel;
        if (m93905u0()) {
            return;
        }
        ur4<E> ur4Var = (ur4) f66717j.get(this);
        while (true) {
            long andIncrement = f66713f.getAndIncrement(this);
            int i = BufferedChannelKt.f66729b;
            long j = andIncrement / ((long) i);
            if (this.m93881i0() <= andIncrement) {
                if (ur4Var.id < j && ur4Var.m156112f() != 0) {
                    this.m93911z0(j, ur4Var);
                }
                m93825m0(this, 0L, 1, null);
                return;
            }
            if (ur4Var.id != j) {
                bufferedChannel = this;
                ur4<E> ur4VarM93859S = bufferedChannel.m93859S(j, ur4Var, andIncrement);
                if (ur4VarM93859S == null) {
                    continue;
                } else {
                    ur4Var = ur4VarM93859S;
                }
                this = bufferedChannel;
            } else {
                bufferedChannel = this;
            }
            if (bufferedChannel.m93882i1(ur4Var, (int) (andIncrement % ((long) i)), andIncrement)) {
                m93825m0(bufferedChannel, 0L, 1, null);
                return;
            } else {
                m93825m0(bufferedChannel, 0L, 1, null);
                this = bufferedChannel;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final Object m93858R0(ur4<E> ur4Var, int i, long j, Continuation<? super C15414a<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ur4 ur4VarM93861T;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        }
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        Object objM93778v = bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.result;
        Object objM196133e = uwp.m196133e();
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.label;
        if (i3 == 0) {
            ResultKt.m87239b(objM93778v);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.L$1 = ur4Var;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.label = 1;
            C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2));
            try {
                c15407cM111430b.getClass();
                nfc0 nfc0Var = new nfc0(c15407cM111430b);
                Object objM93886k1 = m93886k1(ur4Var, i, j, nfc0Var);
                if (objM93886k1 == BufferedChannelKt.f66740m) {
                    m93844J0(nfc0Var, ur4Var, i);
                } else if (objM93886k1 == BufferedChannelKt.f66742o) {
                    if (j < m93881i0()) {
                        ur4Var.m156109c();
                    }
                    ur4 ur4Var2 = (ur4) m93813c0().get(this);
                    while (true) {
                        if (m93899q0()) {
                            m93834B0(c15407cM111430b);
                            break;
                        }
                        long andIncrement = m93814d0().getAndIncrement(this);
                        int i4 = BufferedChannelKt.f66729b;
                        long j2 = andIncrement / ((long) i4);
                        int i5 = (int) (andIncrement % ((long) i4));
                        if (ur4Var2.id != j2) {
                            ur4VarM93861T = m93861T(j2, ur4Var2);
                            if (ur4VarM93861T == null) {
                            }
                        } else {
                            ur4VarM93861T = ur4Var2;
                        }
                        Object objM93886k2 = m93886k1(ur4VarM93861T, i5, andIncrement, nfc0Var);
                        if (objM93886k2 == BufferedChannelKt.f66740m) {
                            m93844J0(nfc0Var, ur4VarM93861T, i5);
                            break;
                        }
                        if (objM93886k2 != BufferedChannelKt.f66742o) {
                            if (objM93886k2 == BufferedChannelKt.f66741n) {
                                throw new IllegalStateException("unexpected");
                            }
                            ur4VarM93861T.m156109c();
                            C15414a c15414aM93991b = C15414a.m93991b(C15414a.INSTANCE.m94003c(objM93886k2));
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            c15407cM111430b.mo93764f(c15414aM93991b, function1 != null ? OnUndeliveredElementKt.m94211a(function1, objM93886k2, c15407cM111430b.getContext()) : null);
                            break;
                        }
                        if (andIncrement < m93881i0()) {
                            ur4VarM93861T.m156109c();
                        }
                        ur4Var2 = ur4VarM93861T;
                    }
                } else {
                    ur4Var.m156109c();
                    C15414a c15414aM93991b2 = C15414a.m93991b(C15414a.INSTANCE.m94003c(objM93886k1));
                    Function1<E, Unit> function2 = this.onUndeliveredElement;
                    c15407cM111430b.mo93764f(c15414aM93991b2, function2 != null ? OnUndeliveredElementKt.m94211a(function2, objM93886k1, c15407cM111430b.getContext()) : null);
                }
                objM93778v = c15407cM111430b.m93778v();
                if (objM93778v == uwp.m196133e()) {
                    DebugProbesKt.m87383c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2);
                }
                if (objM93778v == objM196133e) {
                    return objM196133e;
                }
            } catch (Throwable th) {
                c15407cM111430b.m93752O();
                throw th;
            }
        } else {
            if (i3 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(objM93778v);
        }
        return ((C15414a) objM93778v).getHolder();
    }

    /* JADX INFO: renamed from: S */
    public final ur4<E> m93859S(long id, ur4<E> startFrom, long currentBufferEndCounter) {
        Object objM151515c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66717j;
        Function2 function2 = (Function2) BufferedChannelKt.m93949y();
        loop0: while (true) {
            objM151515c = ls5.m151515c(startFrom, id, function2);
            if (!oce0.m163512c(objM151515c)) {
                mce0 mce0VarM163511b = oce0.m163511b(objM151515c);
                while (true) {
                    mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                    if (mce0Var.id >= mce0VarM163511b.id) {
                        break loop0;
                    }
                    if (!mce0VarM163511b.m153994u()) {
                        break;
                    }
                    if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, mce0VarM163511b)) {
                        if (!mce0Var.m153992p()) {
                            break loop0;
                        }
                        mce0Var.m156117n();
                        break loop0;
                    }
                    if (mce0VarM163511b.m153992p()) {
                        mce0VarM163511b.m156117n();
                    }
                }
            } else {
                break;
            }
        }
        if (oce0.m163512c(objM151515c)) {
            m93855P();
            m93911z0(id, startFrom);
            m93825m0(this, 0L, 1, null);
            return null;
        }
        ur4<E> ur4Var = (ur4) oce0.m163511b(objM151515c);
        if (ur4Var.id <= id) {
            return ur4Var;
        }
        long j = ur4Var.id;
        int i = BufferedChannelKt.f66729b;
        if (f66713f.compareAndSet(this, currentBufferEndCounter + 1, j * ((long) i))) {
            m93887l0((ur4Var.id * ((long) i)) - currentBufferEndCounter);
        } else {
            m93825m0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public final Object m93860S0(ur4<E> ur4Var, int i, long j, Continuation<? super E> continuation) {
        Function1<E, Unit> function1;
        CoroutineContext f63379a;
        ur4 ur4Var2;
        C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation));
        try {
            Object objM93886k1 = m93886k1(ur4Var, i, j, c15407cM111430b);
            if (objM93886k1 == BufferedChannelKt.f66740m) {
                m93844J0(c15407cM111430b, ur4Var, i);
            } else {
                Function1<Throwable, Unit> function1M94211a = null;
                function1M94211a = null;
                if (objM93886k1 == BufferedChannelKt.f66742o) {
                    if (j < m93881i0()) {
                        ur4Var.m156109c();
                    }
                    ur4 ur4Var3 = (ur4) m93813c0().get(this);
                    while (true) {
                        if (m93899q0()) {
                            m93836C0(c15407cM111430b);
                        } else {
                            long andIncrement = m93814d0().getAndIncrement(this);
                            int i2 = BufferedChannelKt.f66729b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (ur4Var3.id != j2) {
                                ur4 ur4VarM93861T = m93861T(j2, ur4Var3);
                                if (ur4VarM93861T != null) {
                                    ur4Var2 = ur4VarM93861T;
                                }
                            } else {
                                ur4Var2 = ur4Var3;
                            }
                            objM93886k1 = m93886k1(ur4Var2, i3, andIncrement, c15407cM111430b);
                            ur4 ur4Var4 = ur4Var2;
                            if (objM93886k1 == BufferedChannelKt.f66740m) {
                                C15407c c15407c = c15407cM111430b != null ? c15407cM111430b : null;
                                if (c15407c != null) {
                                    m93844J0(c15407c, ur4Var4, i3);
                                }
                            } else if (objM93886k1 == BufferedChannelKt.f66742o) {
                                if (andIncrement < m93881i0()) {
                                    ur4Var4.m156109c();
                                }
                                ur4Var3 = ur4Var4;
                            } else {
                                if (objM93886k1 == BufferedChannelKt.f66741n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ur4Var4.m156109c();
                                function1 = this.onUndeliveredElement;
                                if (function1 != null) {
                                    f63379a = c15407cM111430b.getContext();
                                    function1M94211a = OnUndeliveredElementKt.m94211a(function1, objM93886k1, f63379a);
                                }
                                c15407cM111430b.mo93764f(objM93886k1, function1M94211a);
                            }
                        }
                    }
                } else {
                    ur4Var.m156109c();
                    function1 = this.onUndeliveredElement;
                    if (function1 != null) {
                        f63379a = c15407cM111430b.getContext();
                        function1M94211a = OnUndeliveredElementKt.m94211a(function1, objM93886k1, f63379a);
                    }
                    c15407cM111430b.mo93764f(objM93886k1, function1M94211a);
                }
            }
            Object objM93778v = c15407cM111430b.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v;
        } catch (Throwable th) {
            c15407cM111430b.m93752O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public final ur4<E> m93861T(long id, ur4<E> startFrom) {
        Object objM151515c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66716i;
        Function2 function2 = (Function2) BufferedChannelKt.m93949y();
        loop0: while (true) {
            objM151515c = ls5.m151515c(startFrom, id, function2);
            if (!oce0.m163512c(objM151515c)) {
                mce0 mce0VarM163511b = oce0.m163511b(objM151515c);
                while (true) {
                    mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                    if (mce0Var.id >= mce0VarM163511b.id) {
                        break loop0;
                    }
                    if (!mce0VarM163511b.m153994u()) {
                        break;
                    }
                    if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, mce0VarM163511b)) {
                        if (!mce0Var.m153992p()) {
                            break loop0;
                        }
                        mce0Var.m156117n();
                        break loop0;
                    }
                    if (mce0VarM163511b.m153992p()) {
                        mce0VarM163511b.m156117n();
                    }
                }
            } else {
                break;
            }
        }
        if (oce0.m163512c(objM151515c)) {
            m93855P();
            if (startFrom.id * ((long) BufferedChannelKt.f66729b) < m93881i0()) {
                startFrom.m156109c();
            }
            return null;
        }
        ur4<E> ur4Var = (ur4) oce0.m163511b(objM151515c);
        if (!m93905u0() && id <= m93865W() / ((long) BufferedChannelKt.f66729b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66717j;
            while (true) {
                mce0 mce0Var2 = (mce0) atomicReferenceFieldUpdater2.get(this);
                if (mce0Var2.id >= ur4Var.id || !ur4Var.m153994u()) {
                    break;
                }
                if (C21643z7.m217426a(atomicReferenceFieldUpdater2, this, mce0Var2, ur4Var)) {
                    if (!mce0Var2.m153992p()) {
                        break;
                    }
                    mce0Var2.m156117n();
                    break;
                }
                if (ur4Var.m153992p()) {
                    ur4Var.m156117n();
                }
            }
        }
        long j = ur4Var.id;
        if (j <= id) {
            return ur4Var;
        }
        int i = BufferedChannelKt.f66729b;
        m93895o1(j * ((long) i));
        if (ur4Var.id * ((long) i) < m93881i0()) {
            ur4Var.m156109c();
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m93862T0(bde0<?> select, Object ignoredParam) {
        ur4 ur4Var;
        ur4 ur4Var2 = (ur4) m93813c0().get(this);
        while (!this.m93899q0()) {
            long andIncrement = m93814d0().getAndIncrement(this);
            int i = BufferedChannelKt.f66729b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ur4Var2.id != j) {
                ur4 ur4VarM93861T = this.m93861T(j, ur4Var2);
                if (ur4VarM93861T == null) {
                    continue;
                } else {
                    ur4Var = ur4VarM93861T;
                }
            } else {
                ur4Var = ur4Var2;
            }
            BufferedChannel<E> bufferedChannel = this;
            bde0<?> bde0Var = select;
            Object objM93886k1 = bufferedChannel.m93886k1(ur4Var, i2, andIncrement, bde0Var);
            ur4Var2 = ur4Var;
            if (objM93886k1 == BufferedChannelKt.f66740m) {
                ofp0 ofp0Var = bde0Var instanceof ofp0 ? (ofp0) bde0Var : null;
                if (ofp0Var != null) {
                    bufferedChannel.m93844J0(ofp0Var, ur4Var2, i2);
                    return;
                }
                return;
            }
            if (objM93886k1 != BufferedChannelKt.f66742o) {
                if (objM93886k1 == BufferedChannelKt.f66741n) {
                    qkq0.m175383a("unexpected");
                    return;
                } else {
                    ur4Var2.m156109c();
                    bde0Var.mo94310d(objM93886k1);
                    return;
                }
            }
            if (andIncrement < bufferedChannel.m93881i0()) {
                ur4Var2.m156109c();
            }
            this = bufferedChannel;
            select = bde0Var;
        }
        this.m93837D0(select);
    }

    /* JADX INFO: renamed from: U */
    public final ur4<E> m93863U(long id, ur4<E> startFrom) {
        Object objM151515c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66715h;
        Function2 function2 = (Function2) BufferedChannelKt.m93949y();
        loop0: while (true) {
            objM151515c = ls5.m151515c(startFrom, id, function2);
            if (!oce0.m163512c(objM151515c)) {
                mce0 mce0VarM163511b = oce0.m163511b(objM151515c);
                while (true) {
                    mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                    if (mce0Var.id >= mce0VarM163511b.id) {
                        break loop0;
                    }
                    if (!mce0VarM163511b.m153994u()) {
                        break;
                    }
                    if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, mce0VarM163511b)) {
                        if (!mce0Var.m153992p()) {
                            break loop0;
                        }
                        mce0Var.m156117n();
                        break loop0;
                    }
                    if (mce0VarM163511b.m153992p()) {
                        mce0VarM163511b.m156117n();
                    }
                }
            } else {
                break;
            }
        }
        if (oce0.m163512c(objM151515c)) {
            m93855P();
            if (startFrom.id * ((long) BufferedChannelKt.f66729b) < m93875e0()) {
                startFrom.m156109c();
            }
            return null;
        }
        ur4<E> ur4Var = (ur4) oce0.m163511b(objM151515c);
        long j = ur4Var.id;
        if (j <= id) {
            return ur4Var;
        }
        int i = BufferedChannelKt.f66729b;
        m93898p1(j * ((long) i));
        if (ur4Var.id * ((long) i) < m93875e0()) {
            ur4Var.m156109c();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlinx.coroutines.channels.BufferedChannel<E>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlinx.coroutines.channels.BufferedChannel] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.channels.BufferedChannel] */
    /* JADX INFO: renamed from: U0 */
    public void mo93789U0(@NotNull bde0<?> select, @Nullable Object element) {
        ur4 ur4Var;
        ur4 ur4Var2 = (ur4) m93818g0().get(this);
        while (true) {
            long andIncrement = m93820h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM93903s0 = this.m93903s0(andIncrement);
            int i = BufferedChannelKt.f66729b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ur4Var2.id != j2) {
                ur4 ur4VarM93863U = this.m93863U(j2, ur4Var2);
                if (ur4VarM93863U != null) {
                    ur4Var = ur4VarM93863U;
                } else if (zM93903s0) {
                    this.m93838E0(element, select);
                    return;
                }
            } else {
                ur4Var = ur4Var2;
            }
            ?? r5 = this;
            bde0<?> bde0Var = select;
            Object obj = element;
            int iM93889m1 = r5.m93889m1(ur4Var, i2, obj, j, bde0Var, zM93903s0);
            ur4Var2 = ur4Var;
            if (iM93889m1 == 0) {
                ur4Var2.m156109c();
                bde0Var.mo94310d(Unit.INSTANCE);
                return;
            }
            if (iM93889m1 == 1) {
                bde0Var.mo94310d(Unit.INSTANCE);
                return;
            }
            if (iM93889m1 == 2) {
                if (zM93903s0) {
                    ur4Var2.m153993t();
                    r5.m93838E0(obj, bde0Var);
                    return;
                } else {
                    ofp0 ofp0Var = bde0Var instanceof ofp0 ? (ofp0) bde0Var : null;
                    if (ofp0Var != null) {
                        r5.m93846K0(ofp0Var, ur4Var2, i2);
                        return;
                    }
                    return;
                }
            }
            if (iM93889m1 == 3) {
                qkq0.m175383a("unexpected");
                return;
            }
            if (iM93889m1 == 4) {
                if (j < r5.m93875e0()) {
                    ur4Var2.m156109c();
                }
                r5.m93838E0(obj, bde0Var);
                return;
            } else {
                if (iM93889m1 == 5) {
                    ur4Var2.m156109c();
                }
                this = (BufferedChannel<E>) r5;
                element = obj;
                select = bde0Var;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final void m93864V0(ur4<E> lastSegment) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionM94213c = null;
        Object objM156166b = msm.m156166b(null, 1, null);
        loop0: do {
            for (int i = BufferedChannelKt.f66729b - 1; -1 < i; i--) {
                long j = (lastSegment.id * ((long) BufferedChannelKt.f66729b)) + ((long) i);
                while (true) {
                    Object objM195038B = lastSegment.m195038B(i);
                    if (objM195038B == BufferedChannelKt.f66736i) {
                        break loop0;
                    }
                    if (objM195038B != BufferedChannelKt.f66731d) {
                        if (objM195038B != BufferedChannelKt.f66732e && objM195038B != null) {
                            if (!(objM195038B instanceof ofp0) && !(objM195038B instanceof pfp0)) {
                                if (objM195038B != BufferedChannelKt.f66734g && objM195038B != BufferedChannelKt.f66733f) {
                                    if (objM195038B != BufferedChannelKt.f66734g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j < m93875e0()) {
                                    break loop0;
                                }
                                ofp0 ofp0Var = objM195038B instanceof pfp0 ? ((pfp0) objM195038B).waiter : (ofp0) objM195038B;
                                if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                                    if (function1 != null) {
                                        undeliveredElementExceptionM94213c = OnUndeliveredElementKt.m94213c(function1, lastSegment.m195037A(i), undeliveredElementExceptionM94213c);
                                    }
                                    objM156166b = msm.m156167c(objM156166b, ofp0Var);
                                    lastSegment.m195045w(i);
                                    lastSegment.m153993t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                                lastSegment.m153993t();
                                break;
                            }
                        }
                    } else {
                        if (j < m93875e0()) {
                            break loop0;
                        }
                        if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                            if (function1 != null) {
                                undeliveredElementExceptionM94213c = OnUndeliveredElementKt.m94213c(function1, lastSegment.m195037A(i), undeliveredElementExceptionM94213c);
                            }
                            lastSegment.m195045w(i);
                            lastSegment.m153993t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ur4) lastSegment.m156114h();
        } while (lastSegment != null);
        if (objM156166b != null) {
            if (objM156166b instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM156166b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m93867X0((ofp0) arrayList.get(size));
                }
            } else {
                m93867X0((ofp0) objM156166b);
            }
        }
        if (undeliveredElementExceptionM94213c != null) {
            throw undeliveredElementExceptionM94213c;
        }
    }

    /* JADX INFO: renamed from: W */
    public final long m93865W() {
        return f66713f.get(this);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m93866W0(ofp0 ofp0Var) {
        m93869Y0(ofp0Var, true);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m93867X0(ofp0 ofp0Var) {
        m93869Y0(ofp0Var, false);
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final Throwable m93868Y() {
        return (Throwable) f66718k.get(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m93869Y0(ofp0 ofp0Var, boolean z) {
        if (ofp0Var instanceof C15411b) {
            bf4<Boolean> bf4VarM93921a = ((C15411b) ofp0Var).m93921a();
            Result.Companion companion = Result.INSTANCE;
            bf4VarM93921a.resumeWith(Result.m223820constructorimpl(Boolean.FALSE));
            return;
        }
        if (ofp0Var instanceof bf4) {
            Continuation continuation = (Continuation) ofp0Var;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(z ? m93871b0() : m93877f0())));
        } else if (ofp0Var instanceof nfc0) {
            C15407c<C15414a<? extends E>> c15407c = ((nfc0) ofp0Var).cont;
            Result.Companion companion3 = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(C15414a.m93991b(C15414a.INSTANCE.m94001a(m93868Y()))));
        } else if (ofp0Var instanceof C15410a) {
            ((C15410a) ofp0Var).m93920j();
        } else if (ofp0Var instanceof bde0) {
            ((bde0) ofp0Var).mo94312f(this, BufferedChannelKt.m93950z());
        } else {
            nnq.m160357a("Unexpected waiter: ", ofp0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a1 */
    public Object mo93870a1(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m93812b1(this, e, continuation);
    }

    /* JADX INFO: renamed from: b0 */
    public final Throwable m93871b0() {
        Throwable thM93868Y = m93868Y();
        return thM93868Y == null ? new ClosedReceiveChannelException("Channel was closed") : thM93868Y;
    }

    @Override // p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: c */
    public wce0<E, BufferedChannel<E>> mo93872c() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m87540g(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        return new xce0(this, function3, (Function3) TypeIntrinsics.m87540g(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX INFO: renamed from: c1 */
    public final Object m93873c1(ur4<E> ur4Var, int i, E e, long j, Continuation<? super Unit> continuation) {
        Unit unit;
        Object objM93778v;
        C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation));
        try {
            int iM93889m1 = m93889m1(ur4Var, i, e, j, c15407cM111430b, false);
            if (iM93889m1 == 0) {
                ur4Var.m156109c();
                Result.Companion companion = Result.INSTANCE;
                unit = Unit.INSTANCE;
            } else {
                if (iM93889m1 != 1) {
                    if (iM93889m1 != 2) {
                        if (iM93889m1 != 4) {
                            if (iM93889m1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            ur4Var.m156109c();
                            ur4 ur4Var2 = (ur4) m93818g0().get(this);
                            while (true) {
                                long andIncrement = m93820h0().getAndIncrement(this);
                                long j2 = 1152921504606846975L & andIncrement;
                                boolean zM93903s0 = m93903s0(andIncrement);
                                int i2 = BufferedChannelKt.f66729b;
                                long j3 = j2 / ((long) i2);
                                int i3 = (int) (j2 % ((long) i2));
                                if (ur4Var2.id != j3) {
                                    ur4 ur4VarM93863U = m93863U(j3, ur4Var2);
                                    if (ur4VarM93863U != null) {
                                        ur4Var2 = ur4VarM93863U;
                                    } else if (zM93903s0) {
                                    }
                                }
                                int iM93889m2 = m93889m1(ur4Var2, i3, e, j2, c15407cM111430b, zM93903s0);
                                if (iM93889m2 == 0) {
                                    ur4Var2.m156109c();
                                    Result.Companion companion2 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                } else if (iM93889m2 == 1) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                } else if (iM93889m2 == 2) {
                                    if (!zM93903s0) {
                                        C15407c c15407c = c15407cM111430b != null ? c15407cM111430b : null;
                                        if (c15407c == null) {
                                            break;
                                        }
                                        m93846K0(c15407c, ur4Var2, i3);
                                        break;
                                    }
                                    ur4Var2.m153993t();
                                } else {
                                    if (iM93889m2 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (iM93889m2 != 4) {
                                        if (iM93889m2 == 5) {
                                            ur4Var2.m156109c();
                                        }
                                    } else if (j2 < m93875e0()) {
                                        ur4Var2.m156109c();
                                    }
                                }
                            }
                        } else if (j < m93875e0()) {
                            ur4Var.m156109c();
                        }
                        m93840G0(e, c15407cM111430b);
                        break;
                    } else {
                        m93846K0(c15407cM111430b, ur4Var, i);
                    }
                    objM93778v = c15407cM111430b.m93778v();
                    if (objM93778v == uwp.m196133e()) {
                        DebugProbesKt.m87383c(continuation);
                    }
                    if (objM93778v == uwp.m196133e()) {
                        return objM93778v;
                    }
                    return Unit.INSTANCE;
                }
                Result.Companion companion4 = Result.INSTANCE;
                unit = Unit.INSTANCE;
            }
            c15407cM111430b.resumeWith(Result.m223820constructorimpl(unit));
            objM93778v = c15407cM111430b.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            if (objM93778v == uwp.m196133e()) {
                return objM93778v;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            c15407cM111430b.m93752O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m93874d1(long curSendersAndCloseStatus) {
        if (m93903s0(curSendersAndCloseStatus)) {
            return false;
        }
        return !m93842I(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: e0 */
    public final long m93875e0() {
        return f66712e.get(this);
    }

    /* JADX INFO: renamed from: e1 */
    public boolean mo93876e1() {
        return m93874d1(f66711d.get(this));
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final Throwable m93877f0() {
        Throwable thM93868Y = m93868Y();
        return thM93868Y == null ? new ClosedSendChannelException("Channel was closed") : thM93868Y;
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m93878f1(Object obj, E e) {
        if (obj instanceof bde0) {
            return ((bde0) obj).mo94312f(this, e);
        }
        if (obj instanceof nfc0) {
            nfc0 nfc0Var = (nfc0) obj;
            C15407c<C15414a<? extends E>> c15407c = nfc0Var.cont;
            C15414a c15414aM93991b = C15414a.m93991b(C15414a.INSTANCE.m94003c(e));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return BufferedChannelKt.m93923B(c15407c, c15414aM93991b, function1 != null ? OnUndeliveredElementKt.m94211a(function1, e, nfc0Var.cont.getContext()) : null);
        }
        if (obj instanceof C15410a) {
            return ((C15410a) obj).m93919i(e);
        }
        if (!(obj instanceof bf4)) {
            nnq.m160357a("Unexpected receiver type: ", obj);
            return false;
        }
        bf4 bf4Var = (bf4) obj;
        Function1<E, Unit> function2 = this.onUndeliveredElement;
        return BufferedChannelKt.m93923B(bf4Var, e, function2 != null ? OnUndeliveredElementKt.m94211a(function2, e, bf4Var.getContext()) : null);
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m93879g1(Object obj, ur4<E> ur4Var, int i) {
        if (obj instanceof bf4) {
            return BufferedChannelKt.m93924C((bf4) obj, Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof bde0) {
            TrySelectDetailedResult trySelectDetailedResultM94323z = ((SelectImplementation) obj).m94323z(this, Unit.INSTANCE);
            if (trySelectDetailedResultM94323z == TrySelectDetailedResult.REREGISTER) {
                ur4Var.m195045w(i);
            }
            return trySelectDetailedResultM94323z == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof C15411b) {
            return BufferedChannelKt.m93924C(((C15411b) obj).m93921a(), Boolean.TRUE, null, 2, null);
        }
        nnq.m160357a("Unexpected waiter: ", obj);
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final Object m93880h1(E element) {
        ur4 ur4VarM93863U;
        Object obj = BufferedChannelKt.f66731d;
        ur4 ur4Var = (ur4) m93818g0().get(this);
        while (true) {
            long andIncrement = m93820h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM93903s0 = this.m93903s0(andIncrement);
            int i = BufferedChannelKt.f66729b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ur4Var.id != j2) {
                ur4VarM93863U = this.m93863U(j2, ur4Var);
                if (ur4VarM93863U == null) {
                    if (zM93903s0) {
                        return C15414a.INSTANCE.m94001a(this.m93877f0());
                    }
                }
            } else {
                ur4VarM93863U = ur4Var;
            }
            E e = element;
            int iM93889m1 = this.m93889m1(ur4VarM93863U, i2, e, j, obj, zM93903s0);
            BufferedChannel<E> bufferedChannel = this;
            ur4Var = ur4VarM93863U;
            if (iM93889m1 == 0) {
                ur4Var.m156109c();
                return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            }
            if (iM93889m1 == 1) {
                return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            }
            if (iM93889m1 == 2) {
                if (zM93903s0) {
                    ur4Var.m153993t();
                    return C15414a.INSTANCE.m94001a(bufferedChannel.m93877f0());
                }
                ofp0 ofp0Var = obj instanceof ofp0 ? (ofp0) obj : null;
                if (ofp0Var != null) {
                    bufferedChannel.m93846K0(ofp0Var, ur4Var, i2);
                }
                bufferedChannel.m93856Q((ur4Var.id * ((long) i)) + ((long) i2));
                return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            }
            if (iM93889m1 == 3) {
                qkq0.m175383a("unexpected");
                return null;
            }
            if (iM93889m1 == 4) {
                if (j < bufferedChannel.m93875e0()) {
                    ur4Var.m156109c();
                }
                return C15414a.INSTANCE.m94001a(bufferedChannel.m93877f0());
            }
            if (iM93889m1 == 5) {
                ur4Var.m156109c();
            }
            this = bufferedChannel;
            element = e;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final long m93881i0() {
        return f66711d.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m93882i1(ur4<E> segment, int index, long b) {
        Object objM195038B = segment.m195038B(index);
        if (!(objM195038B instanceof ofp0) || b < f66712e.get(this) || !segment.m195044v(index, objM195038B, BufferedChannelKt.f66734g)) {
            return m93884j1(segment, index, b);
        }
        if (m93879g1(objM195038B, segment, index)) {
            segment.m195042F(index, BufferedChannelKt.f66731d);
            return true;
        }
        segment.m195042F(index, BufferedChannelKt.f66737j);
        segment.m195039C(index, false);
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return new C15410a();
    }

    @Override // p149l.nee0
    /* JADX INFO: renamed from: j */
    public void mo93883j(@NotNull Function1<? super Throwable, Unit> handler) {
        if (C21643z7.m217426a(f66719l, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66719l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f66744q) {
                if (obj == BufferedChannelKt.f66745r) {
                    qkq0.m175383a("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    nnq.m160357a("Another handler is already registered: ", obj);
                    return;
                }
            }
        } while (!C21643z7.m217426a(f66719l, this, BufferedChannelKt.f66744q, BufferedChannelKt.f66745r));
        handler.invoke(m93868Y());
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m93884j1(ur4<E> segment, int index, long b) {
        while (true) {
            Object objM195038B = segment.m195038B(index);
            if (objM195038B instanceof ofp0) {
                if (b < f66712e.get(this)) {
                    if (segment.m195044v(index, objM195038B, new pfp0((ofp0) objM195038B))) {
                        return true;
                    }
                } else if (segment.m195044v(index, objM195038B, BufferedChannelKt.f66734g)) {
                    if (m93879g1(objM195038B, segment, index)) {
                        segment.m195042F(index, BufferedChannelKt.f66731d);
                        return true;
                    }
                    segment.m195042F(index, BufferedChannelKt.f66737j);
                    segment.m195039C(index, false);
                    return false;
                }
            } else {
                if (objM195038B == BufferedChannelKt.f66737j) {
                    return false;
                }
                if (objM195038B == null) {
                    if (segment.m195044v(index, objM195038B, BufferedChannelKt.f66732e)) {
                        return true;
                    }
                } else {
                    if (objM195038B == BufferedChannelKt.f66731d || objM195038B == BufferedChannelKt.f66735h || objM195038B == BufferedChannelKt.f66736i || objM195038B == BufferedChannelKt.f66738k || objM195038B == BufferedChannelKt.m93950z()) {
                        return true;
                    }
                    if (objM195038B != BufferedChannelKt.f66733f) {
                        nnq.m160357a("Unexpected cell state: ", objM195038B);
                        return false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m93885k0() {
        while (true) {
            ur4<E> ur4VarM93861T = (ur4) f66716i.get(this);
            long jM93875e0 = m93875e0();
            if (m93881i0() <= jM93875e0) {
                return false;
            }
            int i = BufferedChannelKt.f66729b;
            long j = jM93875e0 / ((long) i);
            if (ur4VarM93861T.id == j || (ur4VarM93861T = m93861T(j, ur4VarM93861T)) != null) {
                ur4VarM93861T.m156109c();
                if (m93894o0(ur4VarM93861T, (int) (jM93875e0 % ((long) i)), jM93875e0)) {
                    return true;
                }
                f66712e.compareAndSet(this, jM93875e0, 1 + jM93875e0);
            } else if (((ur4) f66716i.get(this)).id < j) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final Object m93886k1(ur4<E> segment, int index, long r, Object waiter) {
        Object objM195038B = segment.m195038B(index);
        if (objM195038B == null) {
            if (r >= (f66711d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.f66741n;
                }
                if (segment.m195044v(index, objM195038B, waiter)) {
                    m93857R();
                    return BufferedChannelKt.f66740m;
                }
            }
        } else if (objM195038B == BufferedChannelKt.f66731d && segment.m195044v(index, objM195038B, BufferedChannelKt.f66736i)) {
            m93857R();
            return segment.m195040D(index);
        }
        return m93888l1(segment, index, r, waiter);
    }

    @Override // p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo93791l(E element) {
        ur4 ur4Var;
        if (m93874d1(f66711d.get(this))) {
            return C15414a.INSTANCE.m94002b();
        }
        Object obj = BufferedChannelKt.f66737j;
        ur4 ur4Var2 = (ur4) m93818g0().get(this);
        while (true) {
            long andIncrement = m93820h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM93903s0 = this.m93903s0(andIncrement);
            int i = BufferedChannelKt.f66729b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ur4Var2.id != j2) {
                ur4 ur4VarM93863U = this.m93863U(j2, ur4Var2);
                if (ur4VarM93863U != null) {
                    ur4Var = ur4VarM93863U;
                } else if (zM93903s0) {
                    return C15414a.INSTANCE.m94001a(this.m93877f0());
                }
            } else {
                ur4Var = ur4Var2;
            }
            int iM93889m1 = this.m93889m1(ur4Var, i2, element, j, obj, zM93903s0);
            BufferedChannel<E> bufferedChannel = this;
            ur4Var2 = ur4Var;
            if (iM93889m1 == 0) {
                ur4Var2.m156109c();
                return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            }
            if (iM93889m1 == 1) {
                return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            }
            if (iM93889m1 == 2) {
                if (zM93903s0) {
                    ur4Var2.m153993t();
                    return C15414a.INSTANCE.m94001a(bufferedChannel.m93877f0());
                }
                ofp0 ofp0Var = obj instanceof ofp0 ? (ofp0) obj : null;
                if (ofp0Var != null) {
                    bufferedChannel.m93846K0(ofp0Var, ur4Var2, i2);
                }
                ur4Var2.m153993t();
                return C15414a.INSTANCE.m94002b();
            }
            if (iM93889m1 == 3) {
                qkq0.m175383a("unexpected");
                return null;
            }
            if (iM93889m1 == 4) {
                if (j < bufferedChannel.m93875e0()) {
                    ur4Var2.m156109c();
                }
                return C15414a.INSTANCE.m94001a(bufferedChannel.m93877f0());
            }
            if (iM93889m1 == 5) {
                ur4Var2.m156109c();
            }
            this = bufferedChannel;
            element = element;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m93887l0(long nAttempts) {
        if ((f66714g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f66714g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final Object m93888l1(ur4<E> segment, int index, long r, Object waiter) {
        while (true) {
            Object objM195038B = segment.m195038B(index);
            if (objM195038B == null || objM195038B == BufferedChannelKt.f66732e) {
                if (r < (f66711d.get(this) & 1152921504606846975L)) {
                    if (segment.m195044v(index, objM195038B, BufferedChannelKt.f66735h)) {
                        m93857R();
                        return BufferedChannelKt.f66742o;
                    }
                } else {
                    if (waiter == null) {
                        return BufferedChannelKt.f66741n;
                    }
                    if (segment.m195044v(index, objM195038B, waiter)) {
                        m93857R();
                        return BufferedChannelKt.f66740m;
                    }
                }
            } else {
                if (objM195038B != BufferedChannelKt.f66731d) {
                    if (objM195038B != BufferedChannelKt.f66737j && objM195038B != BufferedChannelKt.f66735h) {
                        if (objM195038B == BufferedChannelKt.m93950z()) {
                            m93857R();
                            return BufferedChannelKt.f66742o;
                        }
                        if (objM195038B != BufferedChannelKt.f66734g && segment.m195044v(index, objM195038B, BufferedChannelKt.f66733f)) {
                            boolean z = objM195038B instanceof pfp0;
                            if (z) {
                                objM195038B = ((pfp0) objM195038B).waiter;
                            }
                            if (m93879g1(objM195038B, segment, index)) {
                                segment.m195042F(index, BufferedChannelKt.f66736i);
                                m93857R();
                                return segment.m195040D(index);
                            }
                            segment.m195042F(index, BufferedChannelKt.f66737j);
                            segment.m195039C(index, false);
                            if (z) {
                                m93857R();
                            }
                            return BufferedChannelKt.f66742o;
                        }
                    }
                    return BufferedChannelKt.f66742o;
                }
                if (segment.m195044v(index, objM195038B, BufferedChannelKt.f66736i)) {
                    m93857R();
                    return segment.m195040D(index);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final int m93889m1(ur4<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        segment.m195043G(index, element);
        if (closed) {
            return m93892n1(segment, index, element, s, waiter, closed);
        }
        Object objM195038B = segment.m195038B(index);
        if (objM195038B == null) {
            if (m93842I(s)) {
                if (segment.m195044v(index, null, BufferedChannelKt.f66731d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.m195044v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objM195038B instanceof ofp0) {
            segment.m195045w(index);
            if (m93878f1(objM195038B, element)) {
                segment.m195042F(index, BufferedChannelKt.f66736i);
                m93841H0();
                return 0;
            }
            if (segment.m195046x(index, BufferedChannelKt.f66738k) == BufferedChannelKt.f66738k) {
                return 5;
            }
            segment.m195039C(index, true);
            return 5;
        }
        return m93892n1(segment, index, element, s, waiter, closed);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: n */
    public final void mo93890n(@Nullable CancellationException cause) {
        mo93788J(cause);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m93891n0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66719l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C21643z7.m217426a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f66744q : BufferedChannelKt.f66745r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(m93868Y());
    }

    /* JADX INFO: renamed from: n1 */
    public final int m93892n1(ur4<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        while (true) {
            Object objM195038B = segment.m195038B(index);
            if (objM195038B == null) {
                if (!m93842I(s) || closed) {
                    if (closed) {
                        if (segment.m195044v(index, null, BufferedChannelKt.f66737j)) {
                            segment.m195039C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.m195044v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.m195044v(index, null, BufferedChannelKt.f66731d)) {
                    return 1;
                }
            } else {
                if (objM195038B != BufferedChannelKt.f66732e) {
                    if (objM195038B == BufferedChannelKt.f66738k) {
                        segment.m195045w(index);
                        return 5;
                    }
                    if (objM195038B == BufferedChannelKt.f66735h) {
                        segment.m195045w(index);
                        return 5;
                    }
                    if (objM195038B == BufferedChannelKt.m93950z()) {
                        segment.m195045w(index);
                        m93855P();
                        return 4;
                    }
                    segment.m195045w(index);
                    if (objM195038B instanceof pfp0) {
                        objM195038B = ((pfp0) objM195038B).waiter;
                    }
                    if (m93878f1(objM195038B, element)) {
                        segment.m195042F(index, BufferedChannelKt.f66736i);
                        m93841H0();
                        return 0;
                    }
                    if (segment.m195046x(index, BufferedChannelKt.f66738k) != BufferedChannelKt.f66738k) {
                        segment.m195039C(index, true);
                    }
                    return 5;
                }
                if (segment.m195044v(index, objM195038B, BufferedChannelKt.f66731d)) {
                    return 1;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: o */
    public uce0<C15414a<E>> mo93893o() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m87540g(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        return new vce0(this, function3, (Function3) TypeIntrinsics.m87540g(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m93894o0(ur4<E> segment, int index, long globalIndex) {
        Object objM195038B;
        do {
            objM195038B = segment.m195038B(index);
            if (objM195038B != null && objM195038B != BufferedChannelKt.f66732e) {
                if (objM195038B == BufferedChannelKt.f66731d) {
                    return true;
                }
                if (objM195038B == BufferedChannelKt.f66737j || objM195038B == BufferedChannelKt.m93950z() || objM195038B == BufferedChannelKt.f66736i || objM195038B == BufferedChannelKt.f66735h) {
                    return false;
                }
                if (objM195038B == BufferedChannelKt.f66734g) {
                    return true;
                }
                return objM195038B != BufferedChannelKt.f66733f && globalIndex == m93875e0();
            }
        } while (!segment.m195044v(index, objM195038B, BufferedChannelKt.f66735h));
        m93857R();
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m93895o1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66712e;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (j >= value) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            long j2 = value;
            if (f66712e.compareAndSet(bufferedChannel, j, j2)) {
                return;
            }
            this = bufferedChannel;
            value = j2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object mo93896p() {
        ur4 ur4VarM93861T;
        long j = f66712e.get(this);
        long j2 = f66711d.get(this);
        if (m93902r0(j2)) {
            return C15414a.INSTANCE.m94001a(m93868Y());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return C15414a.INSTANCE.m94002b();
        }
        Object obj = BufferedChannelKt.f66738k;
        ur4 ur4Var = (ur4) m93813c0().get(this);
        while (!this.m93899q0()) {
            long andIncrement = m93814d0().getAndIncrement(this);
            int i = BufferedChannelKt.f66729b;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ur4Var.id != j3) {
                ur4VarM93861T = this.m93861T(j3, ur4Var);
                if (ur4VarM93861T == null) {
                    continue;
                }
            } else {
                ur4VarM93861T = ur4Var;
            }
            BufferedChannel<E> bufferedChannel = this;
            Object objM93886k1 = bufferedChannel.m93886k1(ur4VarM93861T, i2, andIncrement, obj);
            ur4Var = ur4VarM93861T;
            if (objM93886k1 == BufferedChannelKt.f66740m) {
                ofp0 ofp0Var = obj instanceof ofp0 ? (ofp0) obj : null;
                if (ofp0Var != null) {
                    bufferedChannel.m93844J0(ofp0Var, ur4Var, i2);
                }
                bufferedChannel.m93900q1(andIncrement);
                ur4Var.m153993t();
                return C15414a.INSTANCE.m94002b();
            }
            if (objM93886k1 != BufferedChannelKt.f66742o) {
                if (objM93886k1 != BufferedChannelKt.f66741n) {
                    ur4Var.m156109c();
                    return C15414a.INSTANCE.m94003c(objM93886k1);
                }
                qkq0.m175383a("unexpected");
                return null;
            }
            if (andIncrement < bufferedChannel.m93881i0()) {
                ur4Var.m156109c();
            }
            this = bufferedChannel;
        }
        return C15414a.INSTANCE.m94001a(this.m93868Y());
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m93897p0(long sendersAndCloseStatusCur, boolean isClosedForReceive) throws IllegalAccessException, InvocationTargetException {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            m93853O(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && m93885k0()) ? false : true;
        }
        if (i == 3) {
            m93851N(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i).toString());
    }

    /* JADX INFO: renamed from: p1 */
    public final void m93898p1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66711d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            long j2 = 1152921504606846975L & j;
            if (j2 >= value) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (f66711d.compareAndSet(bufferedChannel, j, BufferedChannelKt.m93947w(j2, (int) (j >> 60)))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m93899q0() {
        return m93902r0(f66711d.get(this));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m93900q1(long globalIndex) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.m93905u0()) {
            return;
        }
        while (bufferedChannel.m93865W() <= globalIndex) {
            bufferedChannel = this;
        }
        int i = BufferedChannelKt.f66730c;
        for (int i2 = 0; i2 < i; i2++) {
            long jM93865W = bufferedChannel.m93865W();
            if (jM93865W == (4611686018427387903L & f66714g.get(bufferedChannel)) && jM93865W == bufferedChannel.m93865W()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66714g;
        while (true) {
            long j = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m93946v(j & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jM93865W2 = bufferedChannel.m93865W();
            long j2 = f66714g.get(bufferedChannel);
            long j3 = j2 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j2) != 0;
            if (jM93865W2 == j3 && jM93865W2 == bufferedChannel.m93865W()) {
                break;
            }
            if (z) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f66714g.compareAndSet(bufferedChannel, j2, BufferedChannelKt.m93946v(j3, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f66714g;
        while (true) {
            long j4 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j4, BufferedChannelKt.m93946v(j4 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo93901r(@NotNull Continuation<? super C15414a<? extends E>> continuation) {
        return m93804Q0(this, continuation);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m93902r0(long j) {
        return m93897p0(j, true);
    }

    @Override // p149l.nee0
    /* JADX INFO: renamed from: s */
    public boolean mo93792s() {
        return m93903s0(f66711d.get(this));
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m93903s0(long j) {
        return m93897p0(j, false);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean mo93904t0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f66711d.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new ur4[]{f66716i.get(this), f66715h.get(this), f66717j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ur4) obj) != BufferedChannelKt.f66728a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            lmr.m150601a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ur4) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ur4) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ur4 ur4Var = (ur4) next;
        long jM93875e0 = m93875e0();
        long jM93881i0 = m93881i0();
        loop2: while (true) {
            int i3 = BufferedChannelKt.f66729b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j3 = (ur4Var.id * ((long) BufferedChannelKt.f66729b)) + ((long) i4);
                if (j3 >= jM93881i0 && j3 >= jM93875e0) {
                    break loop2;
                }
                Object objM195038B = ur4Var.m195038B(i4);
                Object objM195037A = ur4Var.m195037A(i4);
                if (objM195038B instanceof bf4) {
                    string = (j3 >= jM93875e0 || j3 < jM93881i0) ? (j3 >= jM93881i0 || j3 < jM93875e0) ? "cont" : "send" : "receive";
                } else if (objM195038B instanceof bde0) {
                    string = (j3 >= jM93875e0 || j3 < jM93881i0) ? (j3 >= jM93881i0 || j3 < jM93875e0) ? "select" : "onSend" : "onReceive";
                } else if (objM195038B instanceof nfc0) {
                    string = "receiveCatching";
                } else if (objM195038B instanceof C15411b) {
                    string = "sendBroadcast";
                } else if (objM195038B instanceof pfp0) {
                    string = "EB(" + objM195038B + ')';
                } else if (Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66733f) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66734g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objM195038B == null ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66732e) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66736i) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66735h) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66738k) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.f66737j) ? true : Intrinsics.m87488d(objM195038B, BufferedChannelKt.m93950z()))) {
                        string = objM195038B.toString();
                    }
                }
                if (objM195037A != null) {
                    sb.append("(" + string + ',' + objM195037A + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            ur4Var = (ur4) ur4Var.m156112f();
            if (ur4Var == null) {
                break;
            }
            i2 = 0;
        }
        if (C15390h.m93495c1(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m93905u0() {
        long jM93865W = m93865W();
        return jM93865W == 0 || jM93865W == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final long m93906v0(ur4<E> lastSegment) {
        do {
            int i = BufferedChannelKt.f66729b;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (lastSegment.id * ((long) BufferedChannelKt.f66729b)) + ((long) i);
                    if (j >= m93875e0()) {
                        while (true) {
                            Object objM195038B = lastSegment.m195038B(i);
                            if (objM195038B != null && objM195038B != BufferedChannelKt.f66732e) {
                                if (objM195038B != BufferedChannelKt.f66731d) {
                                    break;
                                }
                                return j;
                            }
                            if (lastSegment.m195044v(i, objM195038B, BufferedChannelKt.m93950z())) {
                                lastSegment.m153993t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (ur4) lastSegment.m156114h();
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m93907w0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66711d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m93947w(1152921504606846975L & j, 1))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m93908x0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66711d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m93947w(1152921504606846975L & j, 3))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m93909y0() {
        long jM93947w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66711d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jM93947w = BufferedChannelKt.m93947w(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jM93947w = BufferedChannelKt.m93947w(1152921504606846975L & j, 3);
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, jM93947w)) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: z */
    public uce0<E> mo93910z() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m87540g(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        return new vce0(this, function3, (Function3) TypeIntrinsics.m87540g(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final void m93911z0(long id, ur4<E> startFrom) {
        ur4<E> ur4Var;
        ur4<E> ur4Var2;
        while (startFrom.id < id && (ur4Var2 = (ur4) startFrom.m156112f()) != null) {
            startFrom = ur4Var2;
        }
        while (true) {
            if (!startFrom.mo153991k() || (ur4Var = (ur4) startFrom.m156112f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66717j;
                while (true) {
                    mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                    if (mce0Var.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.m153994u()) {
                        break;
                    }
                    if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, startFrom)) {
                        if (mce0Var.m153992p()) {
                            mce0Var.m156117n();
                            return;
                        }
                        return;
                    } else if (startFrom.m153992p()) {
                        startFrom.m156117n();
                    }
                }
            } else {
                startFrom = ur4Var;
            }
        }
    }

    public /* synthetic */ BufferedChannel(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }
}
