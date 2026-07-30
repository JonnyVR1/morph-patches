package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15497h;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.ag4;
import p153l.ale0;
import p153l.ble0;
import p153l.c4s;
import p153l.cg4;
import p153l.cle0;
import p153l.d1g0;
import p153l.fs4;
import p153l.gle0;
import p153l.l6f;
import p153l.mor;
import p153l.mpq;
import p153l.oum;
import p153l.p7f;
import p153l.pr3;
import p153l.pt5;
import p153l.qt5;
import p153l.rke0;
import p153l.sop0;
import p153l.tke0;
import p153l.top0;
import p153l.ts4;
import p153l.uke0;
import p153l.unc0;
import p153l.uyp;
import p153l.wtq0;
import p153l.zke0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003¥\u0001:B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J:\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010E\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bK\u0010LJ%\u0010M\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bM\u0010HJ%\u0010N\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bN\u0010HJ%\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u001c2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bO\u0010HJ\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u00109J\u000f\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bR\u00109J\u000f\u0010S\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u00109J\u000f\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u00109J\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bX\u0010@J\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bY\u0010ZJ\u001d\u0010\\\u001a\u00020\u00112\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010`\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010bJ\u0013\u0010c\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010e\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\be\u0010dJ\u001b\u0010g\u001a\u00020\u0006*\u00020\u00152\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020\u00112\u0006\u0010j\u001a\u00020\u001eH\u0002¢\u0006\u0004\bk\u0010lJ-\u0010n\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010m\u001a\u00020\u0011H\u0002¢\u0006\u0004\bn\u0010<J-\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bq\u0010rJ-\u0010s\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010rJ5\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bu\u0010vJ%\u0010w\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u0011H\u0002¢\u0006\u0004\bz\u0010@J\u0017\u0010{\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u0011H\u0002¢\u0006\u0004\b{\u0010@J\u0018\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\rJ#\u0010|\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b~\u0010\rJ#\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u007f\u0010}J\u0012\u0010\u0080\u0001\u001a\u00020\u001eH\u0010¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0082\u0001\u00109J\u0011\u0010\u0083\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0083\u0001\u00109J\u0013\u0010\u0084\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b*\u0010\u0085\u0001J\u001e\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0089\u0001\u0010@J\u0019\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u008a\u0001\u0010@J'\u0010\u008b\u0001\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0005\b\u008b\u0001\u0010JJ\u001a\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008c\u0001H\u0096\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008f\u0001\u00109J\u001e\u0010\u0092\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J#\u0010\u0096\u0001\u001a\u00020\u00062\u0011\u0010\u0091\u0001\u001a\f\u0018\u00010\u0094\u0001j\u0005\u0018\u0001`\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0010¢\u0006\u0006\b\u0098\u0001\u0010\u0093\u0001J'\u0010\u009a\u0001\u001a\u00020\u001e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J<\u0010\u009f\u0001\u001a\u00020\u00062(\u0010\u009e\u0001\u001a#\u0012\u0019\u0012\u0017\u0018\u00010\u0090\u0001¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0012\u0010¡\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¡\u0001\u0010\u0081\u0001J\u0013\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010'R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010¦\u0001R\u008a\u0001\u0010®\u0001\u001an\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030A¢\u0006\u000e\b\u009c\u0001\u0012\t\b\u009d\u0001\u0012\u0004\b\b(B\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(¨\u0001\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b\u009c\u0001\u0012\n\b\u009d\u0001\u0012\u0005\b\b(©\u0001\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010§\u0001j\u0005\u0018\u0001`ª\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0005\b\u00ad\u0001\u00109R\u0017\u0010±\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010³\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010\u0081\u0001R\u0018\u0010¶\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010¸\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010%R\u001a\u0010º\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010%R\u0016\u0010`\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010°\u0001R\u0017\u0010½\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010°\u0001R1\u0010Á\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000¾\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÀ\u0001\u00109\u001a\u0006\b«\u0001\u0010¿\u0001R%\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÅ\u0001\u00109\u001a\u0006\bÃ\u0001\u0010Ä\u0001R+\u0010É\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000Â\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÈ\u0001\u00109\u001a\u0006\bÇ\u0001\u0010Ä\u0001R\u001a\u0010Ë\u0001\u001a\u0005\u0018\u00010\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010µ\u0001R\u0018\u0010Í\u0001\u001a\u00030\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010µ\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u0081\u0001R\u001d\u0010Ñ\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÐ\u0001\u00109\u001a\u0005\b\u0012\u0010\u0081\u0001R\u001d\u0010j\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0001\u00109\u001a\u0006\bÒ\u0001\u0010\u0081\u0001R\u0015\u0010Õ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ô\u00018\u0002X\u0082\u0004R\r\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ô\u00018\u0002X\u0082\u0004R\r\u0010Ú\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Û\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\r\u0010Ü\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ô\u00018\u0002X\u0082\u0004R\r\u0010Þ\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ß\u0001"}, m88121d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Ll/fs4;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "F0", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ts4;", "segment", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f45294s, "c1", "(Ll/ts4;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/sop0;", "K0", "(Ll/sop0;Ll/ts4;I)V", "Ll/ag4;", "cont", "G0", "(Ljava/lang/Object;Ll/ag4;)V", "", "waiter", "", "closed", "m1", "(Ll/ts4;ILjava/lang/Object;JLjava/lang/Object;Z)I", "n1", "curSendersAndCloseStatus", "d1", "(J)Z", "curSenders", "I", "f1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "S0", "(Ll/ts4;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J0", "C0", "(Ll/ag4;)V", "Lkotlinx/coroutines/channels/a;", "R0", "B0", "k1", "(Ll/ts4;IJLjava/lang/Object;)Ljava/lang/Object;", "l1", "g1", "(Ljava/lang/Object;Ll/ts4;I)Z", "R", "()V", "b", "i1", "(Ll/ts4;IJ)Z", "j1", "nAttempts", "l0", "(J)V", "Ll/gle0;", "select", "E0", "(Ljava/lang/Object;Ll/gle0;)V", "ignoredParam", "selectResult", "O0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T0", "(Ll/gle0;Ljava/lang/Object;)V", "D0", "(Ll/gle0;)V", "L0", "N0", "M0", "n0", "y0", "x0", "w0", "P", "sendersCur", BloodType.f39576O, "(J)Ll/ts4;", "N", "L", "()Ll/ts4;", "lastSegment", "v0", "(Ll/ts4;)J", "V0", "(Ll/ts4;)V", "sendersCounter", "K", "(Ll/ts4;J)V", "W0", "(Ll/sop0;)V", "X0", "receiver", "Y0", "(Ll/sop0;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "p0", "(JZ)Z", "globalIndex", "o0", "id", "startFrom", "U", "(JLl/ts4;)Ll/ts4;", p7f.GPS_DIRECTION_TRUE, "currentBufferEndCounter", p7f.LATITUDE_SOUTH, "(JLl/ts4;J)Ll/ts4;", "z0", "(JLl/ts4;)V", "value", "p1", "o1", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Object;)Ljava/lang/Object;", "a1", "h1", "e1", "()Z", "I0", "H0", c4s.C_ZONE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "globalCellIndex", "Q", "q1", "U0", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "A0", "", "cause", "D", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "n", "(Ljava/util/concurrent/CancellationException;)V", "J", "cancel", "M", "(Ljava/lang/Throwable;Z)Z", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "handler", "j", "(Lkotlin/jvm/functions/Function1;)V", "k0", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "W", "()J", "bufferEndCounter", "u0", "isRendezvousOrUnlimited", "b0", "()Ljava/lang/Throwable;", "receiveException", "s0", "isClosedForSend0", "r0", "isClosedForReceive0", "i0", "e0", "receiversCounter", "Ll/ble0;", "()Ll/ble0;", "getOnSend$annotations", "onSend", "Ll/zke0;", BaseSei.f14626Z, "()Ll/zke0;", "getOnReceive$annotations", "onReceive", "o", "getOnReceiveCatching$annotations", "onReceiveCatching", "Y", "closeCause", "f0", "sendException", "t0", "isConflatedDropOldest", "isClosedForSend$annotations", "isClosedForSend", "q0", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class BufferedChannel<E> implements fs4<E> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f67385d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f67386e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f67387f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f67388g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67389h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67390i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67391j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67392k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67393l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
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
    public final Function3<gle0<?>, Object, Object, Function1<Throwable, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$a;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Ll/sop0;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/rke0;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "g", "(Ll/rke0;I)V", "next", "()Ljava/lang/Object;", "element", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Z", "j", "()V", "f", "()Z", "Ll/ts4;", "", "r", "e", "(Ll/ts4;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "", "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/c;", "b", "Lkotlinx/coroutines/c;", "continuation", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C15517a implements ChannelIterator<E>, sop0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object receiveResult = BufferedChannelKt.f67417p;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C15514c<? super Boolean> continuation;

        public C15517a() {
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo94807a(@NotNull Continuation<? super Boolean> continuation) {
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            ts4<E> ts4Var = (ts4) BufferedChannel.m94705c0().get(bufferedChannel);
            while (!bufferedChannel.m94791q0()) {
                long andIncrement = BufferedChannel.m94706d0().getAndIncrement(bufferedChannel);
                int i = BufferedChannelKt.f67403b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (ts4Var.id != j) {
                    ts4<E> ts4VarM94753T = bufferedChannel.m94753T(j, ts4Var);
                    if (ts4VarM94753T == null) {
                        continue;
                    } else {
                        ts4Var = ts4VarM94753T;
                    }
                }
                Object objM94778k1 = bufferedChannel.m94778k1(ts4Var, i2, andIncrement, null);
                if (objM94778k1 == BufferedChannelKt.f67414m) {
                    wtq0.m207906a("unreachable");
                    return null;
                }
                if (objM94778k1 != BufferedChannelKt.f67416o) {
                    if (objM94778k1 == BufferedChannelKt.f67415n) {
                        return m94808e(ts4Var, i2, andIncrement, continuation);
                    }
                    ts4Var.m177894c();
                    this.receiveResult = objM94778k1;
                    return Boxing.m88259a(true);
                }
                if (andIncrement < bufferedChannel.m94773i0()) {
                    ts4Var.m177894c();
                }
            }
            return Boxing.m88259a(m94809f());
        }

        /* JADX INFO: renamed from: e */
        public final Object m94808e(ts4<E> ts4Var, int i, long j, Continuation<? super Boolean> continuation) {
            Boolean boolM88259a;
            Function1<E, Unit> function1;
            CoroutineContext f64053a;
            ts4 ts4Var2;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation));
            try {
                this.continuation = c15514cM109664b;
                Object objM94778k1 = bufferedChannel.m94778k1(ts4Var, i, j, this);
                if (objM94778k1 == BufferedChannelKt.f67414m) {
                    bufferedChannel.m94736J0(this, ts4Var, i);
                } else {
                    Function1<Throwable, Unit> function1M95104a = null;
                    if (objM94778k1 == BufferedChannelKt.f67416o) {
                        if (j < bufferedChannel.m94773i0()) {
                            ts4Var.m177894c();
                        }
                        ts4 ts4Var3 = (ts4) BufferedChannel.m94705c0().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.m94791q0()) {
                                m94810h();
                            } else {
                                long andIncrement = BufferedChannel.m94706d0().getAndIncrement(bufferedChannel);
                                int i2 = BufferedChannelKt.f67403b;
                                long j2 = andIncrement / ((long) i2);
                                int i3 = (int) (andIncrement % ((long) i2));
                                if (ts4Var3.id != j2) {
                                    ts4 ts4VarM94753T = bufferedChannel.m94753T(j2, ts4Var3);
                                    if (ts4VarM94753T != null) {
                                        ts4Var2 = ts4VarM94753T;
                                    }
                                } else {
                                    ts4Var2 = ts4Var3;
                                }
                                objM94778k1 = bufferedChannel.m94778k1(ts4Var2, i3, andIncrement, this);
                                ts4 ts4Var4 = ts4Var2;
                                if (objM94778k1 == BufferedChannelKt.f67414m) {
                                    bufferedChannel.m94736J0(this, ts4Var4, i3);
                                } else if (objM94778k1 == BufferedChannelKt.f67416o) {
                                    if (andIncrement < bufferedChannel.m94773i0()) {
                                        ts4Var4.m177894c();
                                    }
                                    ts4Var3 = ts4Var4;
                                } else {
                                    if (objM94778k1 == BufferedChannelKt.f67415n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    ts4Var4.m177894c();
                                    this.receiveResult = objM94778k1;
                                    this.continuation = null;
                                    boolM88259a = Boxing.m88259a(true);
                                    function1 = bufferedChannel.onUndeliveredElement;
                                    if (function1 != null) {
                                        f64053a = c15514cM109664b.getContext();
                                        function1M95104a = OnUndeliveredElementKt.m95104a(function1, objM94778k1, f64053a);
                                    }
                                    c15514cM109664b.mo94656f(boolM88259a, function1M95104a);
                                }
                            }
                        }
                    } else {
                        ts4Var.m177894c();
                        this.receiveResult = objM94778k1;
                        this.continuation = null;
                        boolM88259a = Boxing.m88259a(true);
                        function1 = bufferedChannel.onUndeliveredElement;
                        if (function1 != null) {
                            f64053a = c15514cM109664b.getContext();
                            function1M95104a = OnUndeliveredElementKt.m95104a(function1, objM94778k1, f64053a);
                        }
                        c15514cM109664b.mo94656f(boolM88259a, function1M95104a);
                    }
                }
                Object objM94670v = c15514cM109664b.m94670v();
                if (objM94670v == uyp.m198688e()) {
                    DebugProbesKt.m88272c(continuation);
                }
                return objM94670v;
            } catch (Throwable th) {
                c15514cM109664b.m94644O();
                throw th;
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m94809f() throws Throwable {
            this.receiveResult = BufferedChannelKt.m94842z();
            Throwable thM94760Y = BufferedChannel.this.m94760Y();
            if (thM94760Y == null) {
                return false;
            }
            throw d1g0.m113572a(thM94760Y);
        }

        @Override // p153l.sop0
        /* JADX INFO: renamed from: g */
        public void mo94657g(@NotNull rke0<?> segment, int index) {
            C15514c<? super Boolean> c15514c = this.continuation;
            if (c15514c != null) {
                c15514c.mo94657g(segment, index);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m94810h() {
            C15514c<? super Boolean> c15514c = this.continuation;
            c15514c.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m94842z();
            Throwable thM94760Y = BufferedChannel.this.m94760Y();
            if (thM94760Y == null) {
                Result.Companion companion = Result.INSTANCE;
                c15514c.resumeWith(Result.m225066constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c15514c.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(thM94760Y)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m94811i(E element) {
            C15514c<? super Boolean> c15514c = this.continuation;
            c15514c.getClass();
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            Function1<E, Unit> function1 = BufferedChannel.this.onUndeliveredElement;
            return BufferedChannelKt.m94815B(c15514c, bool, function1 != null ? OnUndeliveredElementKt.m95104a(function1, element, c15514c.getContext()) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m94812j() {
            C15514c<? super Boolean> c15514c = this.continuation;
            c15514c.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m94842z();
            Throwable thM94760Y = BufferedChannel.this.m94760Y();
            if (thM94760Y == null) {
                Result.Companion companion = Result.INSTANCE;
                c15514c.resumeWith(Result.m225066constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c15514c.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(thM94760Y)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e = (E) this.receiveResult;
            if (e == BufferedChannelKt.f67417p) {
                wtq0.m207906a("`hasNext()` has not been invoked");
                return null;
            }
            this.receiveResult = BufferedChannelKt.f67417p;
            if (e != BufferedChannelKt.m94842z()) {
                return e;
            }
            throw d1g0.m113572a(BufferedChannel.this.m94763b0());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$b */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$b;", "Ll/sop0;", "Ll/ag4;", "", "cont", "<init>", "(Ll/ag4;)V", "Ll/rke0;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "g", "(Ll/rke0;I)V", "a", "Ll/ag4;", "()Ll/ag4;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15518b implements sop0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ag4<Boolean> cont;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C15514c<Boolean> f67401b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15518b(@NotNull ag4<? super Boolean> ag4Var) {
            this.cont = ag4Var;
            ag4Var.getClass();
            this.f67401b = (C15514c) ag4Var;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ag4<Boolean> m94813a() {
            return this.cont;
        }

        @Override // p153l.sop0
        /* JADX INFO: renamed from: g */
        public void mo94657g(@NotNull rke0<?> segment, int index) {
            this.f67401b.mo94657g(segment, index);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1<? super E, kotlin.Unit>, kotlin.jvm.functions.Function1<E, kotlin.Unit>] */
    public BufferedChannel(int i, @Nullable Function1<? super E, Unit> function1) {
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i < 0) {
            uke0.m196486a("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        this.bufferEnd$volatile = BufferedChannelKt.m94814A(i);
        this.completedExpandBuffersAndPauseFlag$volatile = m94757W();
        ts4 ts4Var = new ts4(0L, null, this, 3);
        this.sendSegment$volatile = ts4Var;
        this.receiveSegment$volatile = ts4Var;
        if (m94797u0()) {
            ts4Var = BufferedChannelKt.f67402a;
            ts4Var.getClass();
        }
        this.bufferEndSegment$volatile = ts4Var;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new Function3<gle0<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            final /* synthetic */ BufferedChannel<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function3
            @NotNull
            public final Function1<Throwable, Unit> invoke(@NotNull final gle0<?> gle0Var, @Nullable Object obj, @Nullable final Object obj2) {
                final BufferedChannel<E> bufferedChannel = this.this$0;
                return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        if (obj2 != BufferedChannelKt.m94842z()) {
                            OnUndeliveredElementKt.m95105b(bufferedChannel.onUndeliveredElement, obj2, gle0Var.getContext());
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
        this._closeCause$volatile = BufferedChannelKt.f67420s;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ <E> Object m94695P0(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        ts4<E> ts4Var;
        ts4<E> ts4Var2 = (ts4) m94705c0().get(bufferedChannel);
        while (!bufferedChannel.m94791q0()) {
            long andIncrement = m94706d0().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.f67403b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ts4Var2.id != j) {
                ts4<E> ts4VarM94753T = bufferedChannel.m94753T(j, ts4Var2);
                if (ts4VarM94753T == null) {
                    continue;
                } else {
                    ts4Var = ts4VarM94753T;
                }
            } else {
                ts4Var = ts4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM94778k1 = bufferedChannel2.m94778k1(ts4Var, i2, andIncrement, null);
            if (objM94778k1 == BufferedChannelKt.f67414m) {
                wtq0.m207906a("unexpected");
                return null;
            }
            if (objM94778k1 != BufferedChannelKt.f67416o) {
                if (objM94778k1 == BufferedChannelKt.f67415n) {
                    return bufferedChannel2.m94752S0(ts4Var, i2, andIncrement, continuation);
                }
                ts4Var.m177894c();
                return objM94778k1;
            }
            if (andIncrement < bufferedChannel2.m94773i0()) {
                ts4Var.m177894c();
            }
            bufferedChannel = bufferedChannel2;
            ts4Var2 = ts4Var;
        }
        throw d1g0.m113572a(bufferedChannel.m94763b0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ <E> Object m94696Q0(BufferedChannel<E> bufferedChannel, Continuation<? super C15521a<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ts4<E> ts4Var;
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
        Object objM198688e = uyp.m198688e();
        int i2 = bufferedChannel$receiveCatching$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.m88128b(obj);
                return ((C15521a) obj).getHolder();
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        ts4<E> ts4Var2 = (ts4) m94705c0().get(bufferedChannel);
        while (!bufferedChannel.m94791q0()) {
            long andIncrement = m94706d0().getAndIncrement(bufferedChannel);
            int i3 = BufferedChannelKt.f67403b;
            long j = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (ts4Var2.id != j) {
                ts4<E> ts4VarM94753T = bufferedChannel.m94753T(j, ts4Var2);
                if (ts4VarM94753T == null) {
                    continue;
                } else {
                    ts4Var = ts4VarM94753T;
                }
            } else {
                ts4Var = ts4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM94778k1 = bufferedChannel2.m94778k1(ts4Var, i4, andIncrement, null);
            if (objM94778k1 == BufferedChannelKt.f67414m) {
                wtq0.m207906a("unexpected");
                return null;
            }
            if (objM94778k1 != BufferedChannelKt.f67416o) {
                if (objM94778k1 != BufferedChannelKt.f67415n) {
                    ts4Var.m177894c();
                    return C15521a.INSTANCE.m94895c(objM94778k1);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM94750R0 = bufferedChannel2.m94750R0(ts4Var, i4, andIncrement, bufferedChannel$receiveCatching$2);
                return objM94750R0 == objM198688e ? objM198688e : objM94750R0;
            }
            if (andIncrement < bufferedChannel2.m94773i0()) {
                ts4Var.m177894c();
            }
            bufferedChannel = bufferedChannel2;
            ts4Var2 = ts4Var;
        }
        return C15521a.INSTANCE.m94893a(bufferedChannel.m94760Y());
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ <E> Object m94700Z0(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Unit> continuation) throws IllegalAccessException, InvocationTargetException {
        ts4<E> ts4Var;
        ts4<E> ts4Var2 = (ts4) m94710g0().get(bufferedChannel);
        while (true) {
            long andIncrement = m94712h0().getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zM94795s0 = bufferedChannel.m94795s0(andIncrement);
            int i = BufferedChannelKt.f67403b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ts4Var2.id != j2) {
                ts4<E> ts4VarM94755U = bufferedChannel.m94755U(j2, ts4Var2);
                if (ts4VarM94755U != null) {
                    ts4Var = ts4VarM94755U;
                } else if (zM94795s0) {
                    Object objM94731F0 = bufferedChannel.m94731F0(e, continuation);
                    if (objM94731F0 != uyp.m198688e()) {
                        break;
                    }
                    return objM94731F0;
                }
            } else {
                ts4Var = ts4Var2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e2 = e;
            int iM94781m1 = bufferedChannel2.m94781m1(ts4Var, i2, e2, j, null, zM94795s0);
            if (iM94781m1 == 0) {
                ts4Var.m177894c();
                break;
            }
            if (iM94781m1 != 1) {
                if (iM94781m1 == 2) {
                    if (!zM94795s0) {
                        break;
                    }
                    ts4Var.m181785t();
                    Object objM94731F1 = bufferedChannel2.m94731F0(e2, continuation);
                    if (objM94731F1 != uyp.m198688e()) {
                        break;
                    }
                    return objM94731F1;
                }
                if (iM94781m1 == 3) {
                    Object objM94765c1 = bufferedChannel2.m94765c1(ts4Var, i2, e2, j, continuation);
                    if (objM94765c1 != uyp.m198688e()) {
                        break;
                    }
                    return objM94765c1;
                }
                if (iM94781m1 == 4) {
                    if (j < bufferedChannel2.m94767e0()) {
                        ts4Var.m177894c();
                    }
                    Object objM94731F2 = bufferedChannel2.m94731F0(e2, continuation);
                    if (objM94731F2 != uyp.m198688e()) {
                        break;
                    }
                    return objM94731F2;
                }
                if (iM94781m1 == 5) {
                    ts4Var.m177894c();
                }
                bufferedChannel = bufferedChannel2;
                ts4Var2 = ts4Var;
                e = e2;
            } else {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ <E> Object m94704b1(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Boolean> continuation) {
        ts4 ts4VarM94755U;
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        if (bufferedChannel.onUndeliveredElement != null) {
            wtq0.m207906a("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
            return null;
        }
        C15518b c15518b = new C15518b(c15514c);
        ts4 ts4Var = (ts4) m94710g0().get(bufferedChannel);
        while (true) {
            long andIncrement = m94712h0().getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zM94795s0 = bufferedChannel.m94795s0(andIncrement);
            int i = BufferedChannelKt.f67403b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ts4Var.id != j2) {
                ts4VarM94755U = bufferedChannel.m94755U(j2, ts4Var);
                if (ts4VarM94755U == null) {
                    if (zM94795s0) {
                        Result.Companion companion = Result.INSTANCE;
                        c15514c.resumeWith(Result.m225066constructorimpl(Boxing.m88259a(false)));
                        break;
                    }
                }
            } else {
                ts4VarM94755U = ts4Var;
            }
            int iM94781m1 = bufferedChannel.m94781m1(ts4VarM94755U, i2, e, j, c15518b, zM94795s0);
            if (iM94781m1 == 0) {
                ts4VarM94755U.m177894c();
            } else if (iM94781m1 != 1) {
                if (iM94781m1 == 2) {
                    if (!zM94795s0) {
                        bufferedChannel.m94738K0(c15518b, ts4VarM94755U, i2);
                        break;
                    }
                    ts4VarM94755U.m181785t();
                } else {
                    if (iM94781m1 == 3) {
                        wtq0.m207906a("unexpected");
                        return null;
                    }
                    if (iM94781m1 != 4) {
                        if (iM94781m1 == 5) {
                            ts4VarM94755U.m177894c();
                        }
                        ts4Var = ts4VarM94755U;
                    } else if (j < bufferedChannel.m94767e0()) {
                        ts4VarM94755U.m177894c();
                    }
                }
                Result.Companion companion2 = Result.INSTANCE;
                c15514c.resumeWith(Result.m225066constructorimpl(Boxing.m88259a(false)));
                break;
            }
            Result.Companion companion3 = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(Boxing.m88259a(true)));
            break;
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m94705c0() {
        return f67390i;
    }

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m94706d0() {
        return f67386e;
    }

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m94710g0() {
        return f67389h;
    }

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m94712h0() {
        return f67385d;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m94717m0(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
            return;
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.m94779l0(j);
    }

    /* JADX INFO: renamed from: A0 */
    public void m94725A0() {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m94726B0(ag4<? super C15521a<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m225066constructorimpl(C15521a.m94883b(C15521a.INSTANCE.m94893a(m94760Y()))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* JADX INFO: renamed from: C */
    public Object mo94727C(@NotNull Continuation<? super E> continuation) {
        return m94695P0(this, continuation);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m94728C0(ag4<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(m94763b0())));
    }

    @Override // p153l.sme0
    /* JADX INFO: renamed from: D */
    public boolean mo94678D(@Nullable Throwable cause) {
        return m94741M(cause, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m94729D0(gle0<?> select) {
        select.mo95203d(BufferedChannelKt.m94842z());
    }

    @Override // p153l.sme0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo94679E(E e, @NotNull Continuation<? super Unit> continuation) {
        return m94700Z0(this, e, continuation);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m94730E0(E element, gle0<?> select) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.m95105b(function1, element, select.getContext());
        }
        select.mo95203d(BufferedChannelKt.m94842z());
    }

    /* JADX INFO: renamed from: F0 */
    public final Object m94731F0(E e, Continuation<? super Unit> continuation) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM95107d;
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM95107d = OnUndeliveredElementKt.m95107d(function1, e, null, 2, null)) == null) {
            Throwable thM94769f0 = m94769f0();
            Result.Companion companion = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(thM94769f0)));
        } else {
            l6f.m153058a(undeliveredElementExceptionM95107d, m94769f0());
            Result.Companion companion2 = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(undeliveredElementExceptionM95107d)));
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m94732G0(E element, ag4<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.m95105b(function1, element, cont.getContext());
        }
        Throwable thM94769f0 = m94769f0();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(thM94769f0)));
    }

    /* JADX INFO: renamed from: H0 */
    public void m94733H0() {
    }

    /* JADX INFO: renamed from: I */
    public final boolean m94734I(long curSenders) {
        return curSenders < m94757W() || curSenders < m94767e0() + ((long) this.capacity);
    }

    /* JADX INFO: renamed from: I0 */
    public void m94735I0() {
    }

    /* JADX INFO: renamed from: J */
    public boolean mo94680J(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return m94741M(cause, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m94736J0(sop0 sop0Var, ts4<E> ts4Var, int i) {
        m94735I0();
        sop0Var.mo94657g(ts4Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m94737K(ts4<E> lastSegment, long sendersCounter) {
        Object objM169320b = oum.m169320b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = BufferedChannelKt.f67403b - 1; -1 < i; i--) {
                if ((lastSegment.id * ((long) BufferedChannelKt.f67403b)) + ((long) i) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objM192557B = lastSegment.m192557B(i);
                    if (objM192557B != null && objM192557B != BufferedChannelKt.f67406e) {
                        if (!(objM192557B instanceof top0)) {
                            if (!(objM192557B instanceof sop0)) {
                                break;
                            }
                            if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                                objM169320b = oum.m169321c(objM169320b, objM192557B);
                                lastSegment.m192558C(i, true);
                                break;
                            }
                        } else {
                            if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                                objM169320b = oum.m169321c(objM169320b, ((top0) objM192557B).waiter);
                                lastSegment.m192558C(i, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                            lastSegment.m181785t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ts4) lastSegment.m177899h();
        }
        if (objM169320b != null) {
            if (!(objM169320b instanceof ArrayList)) {
                m94758W0((sop0) objM169320b);
                return;
            }
            ArrayList arrayList = (ArrayList) objM169320b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m94758W0((sop0) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m94738K0(sop0 sop0Var, ts4<E> ts4Var, int i) {
        sop0Var.mo94657g(ts4Var, i + BufferedChannelKt.f67403b);
    }

    /* JADX INFO: renamed from: L */
    public final ts4<E> m94739L() {
        Object obj = f67391j.get(this);
        ts4 ts4Var = (ts4) f67389h.get(this);
        if (ts4Var.id > ((ts4) obj).id) {
            obj = ts4Var;
        }
        ts4 ts4Var2 = (ts4) f67390i.get(this);
        if (ts4Var2.id > ((ts4) obj).id) {
            obj = ts4Var2;
        }
        return (ts4) pt5.m173702b((qt5) obj);
    }

    /* JADX INFO: renamed from: L0 */
    public final Object m94740L0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m94842z()) {
            return selectResult;
        }
        throw m94763b0();
    }

    /* JADX INFO: renamed from: M */
    public boolean m94741M(@Nullable Throwable cause, boolean cancel) {
        if (cancel) {
            m94799w0();
        }
        boolean zM194801a = C20511u7.m194801a(f67392k, this, BufferedChannelKt.f67420s, cause);
        if (cancel) {
            m94800x0();
        } else {
            m94801y0();
        }
        m94747P();
        m94725A0();
        if (zM194801a) {
            m94783n0();
        }
        return zM194801a;
    }

    /* JADX INFO: renamed from: M0 */
    public final Object m94742M0(Object ignoredParam, Object selectResult) {
        return C15521a.m94883b(selectResult == BufferedChannelKt.m94842z() ? C15521a.INSTANCE.m94893a(m94760Y()) : C15521a.INSTANCE.m94895c(selectResult));
    }

    /* JADX INFO: renamed from: N */
    public final void m94743N(long sendersCur) throws IllegalAccessException, InvocationTargetException {
        m94756V0(m94745O(sendersCur));
    }

    /* JADX INFO: renamed from: N0 */
    public final Object m94744N0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m94842z()) {
            return selectResult;
        }
        if (m94760Y() == null) {
            return null;
        }
        throw m94763b0();
    }

    /* JADX INFO: renamed from: O */
    public final ts4<E> m94745O(long sendersCur) {
        ts4<E> ts4VarM94739L = m94739L();
        if (mo94796t0()) {
            long jM94798v0 = m94798v0(ts4VarM94739L);
            if (jM94798v0 != -1) {
                m94748Q(jM94798v0);
            }
        }
        m94737K(ts4VarM94739L, sendersCur);
        return ts4VarM94739L;
    }

    /* JADX INFO: renamed from: O0 */
    public final Object m94746O0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m94842z()) {
            return this;
        }
        throw m94769f0();
    }

    /* JADX INFO: renamed from: P */
    public final void m94747P() {
        mo94684s();
    }

    /* JADX INFO: renamed from: Q */
    public final void m94748Q(long globalCellIndex) {
        ts4<E> ts4Var;
        UndeliveredElementException undeliveredElementExceptionM95107d;
        ts4<E> ts4Var2 = (ts4) f67390i.get(this);
        while (true) {
            long j = f67386e.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j, this.m94757W())) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            this = bufferedChannel;
            if (f67386e.compareAndSet(bufferedChannel, j, 1 + j)) {
                int i = BufferedChannelKt.f67403b;
                long j2 = j / ((long) i);
                int i2 = (int) (j % ((long) i));
                if (ts4Var2.id != j2) {
                    ts4<E> ts4VarM94753T = this.m94753T(j2, ts4Var2);
                    if (ts4VarM94753T != null) {
                        ts4Var = ts4VarM94753T;
                    }
                } else {
                    ts4Var = ts4Var2;
                }
                Object objM94778k1 = this.m94778k1(ts4Var, i2, j, null);
                if (objM94778k1 != BufferedChannelKt.f67416o) {
                    ts4Var.m177894c();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionM95107d = OnUndeliveredElementKt.m95107d(function1, objM94778k1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionM95107d;
                    }
                } else if (j < this.m94773i0()) {
                    ts4Var.m177894c();
                }
                ts4Var2 = ts4Var;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m94749R() {
        BufferedChannel<E> bufferedChannel;
        if (m94797u0()) {
            return;
        }
        ts4<E> ts4Var = (ts4) f67391j.get(this);
        while (true) {
            long andIncrement = f67387f.getAndIncrement(this);
            int i = BufferedChannelKt.f67403b;
            long j = andIncrement / ((long) i);
            if (this.m94773i0() <= andIncrement) {
                if (ts4Var.id < j && ts4Var.m177897f() != 0) {
                    this.m94803z0(j, ts4Var);
                }
                m94717m0(this, 0L, 1, null);
                return;
            }
            if (ts4Var.id != j) {
                bufferedChannel = this;
                ts4<E> ts4VarM94751S = bufferedChannel.m94751S(j, ts4Var, andIncrement);
                if (ts4VarM94751S == null) {
                    continue;
                } else {
                    ts4Var = ts4VarM94751S;
                }
                this = bufferedChannel;
            } else {
                bufferedChannel = this;
            }
            if (bufferedChannel.m94774i1(ts4Var, (int) (andIncrement % ((long) i)), andIncrement)) {
                m94717m0(bufferedChannel, 0L, 1, null);
                return;
            } else {
                m94717m0(bufferedChannel, 0L, 1, null);
                this = bufferedChannel;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final Object m94750R0(ts4<E> ts4Var, int i, long j, Continuation<? super C15521a<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ts4 ts4VarM94753T;
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
        Object objM94670v = bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.result;
        Object objM198688e = uyp.m198688e();
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.label;
        if (i3 == 0) {
            ResultKt.m88128b(objM94670v);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.L$1 = ts4Var;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$2.label = 1;
            C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2));
            try {
                c15514cM109664b.getClass();
                unc0 unc0Var = new unc0(c15514cM109664b);
                Object objM94778k1 = m94778k1(ts4Var, i, j, unc0Var);
                if (objM94778k1 == BufferedChannelKt.f67414m) {
                    m94736J0(unc0Var, ts4Var, i);
                } else if (objM94778k1 == BufferedChannelKt.f67416o) {
                    if (j < m94773i0()) {
                        ts4Var.m177894c();
                    }
                    ts4 ts4Var2 = (ts4) m94705c0().get(this);
                    while (true) {
                        if (m94791q0()) {
                            m94726B0(c15514cM109664b);
                            break;
                        }
                        long andIncrement = m94706d0().getAndIncrement(this);
                        int i4 = BufferedChannelKt.f67403b;
                        long j2 = andIncrement / ((long) i4);
                        int i5 = (int) (andIncrement % ((long) i4));
                        if (ts4Var2.id != j2) {
                            ts4VarM94753T = m94753T(j2, ts4Var2);
                            if (ts4VarM94753T == null) {
                            }
                        } else {
                            ts4VarM94753T = ts4Var2;
                        }
                        Object objM94778k2 = m94778k1(ts4VarM94753T, i5, andIncrement, unc0Var);
                        if (objM94778k2 == BufferedChannelKt.f67414m) {
                            m94736J0(unc0Var, ts4VarM94753T, i5);
                            break;
                        }
                        if (objM94778k2 != BufferedChannelKt.f67416o) {
                            if (objM94778k2 == BufferedChannelKt.f67415n) {
                                throw new IllegalStateException("unexpected");
                            }
                            ts4VarM94753T.m177894c();
                            C15521a c15521aM94883b = C15521a.m94883b(C15521a.INSTANCE.m94895c(objM94778k2));
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            c15514cM109664b.mo94656f(c15521aM94883b, function1 != null ? OnUndeliveredElementKt.m95104a(function1, objM94778k2, c15514cM109664b.getContext()) : null);
                            break;
                        }
                        if (andIncrement < m94773i0()) {
                            ts4VarM94753T.m177894c();
                        }
                        ts4Var2 = ts4VarM94753T;
                    }
                } else {
                    ts4Var.m177894c();
                    C15521a c15521aM94883b2 = C15521a.m94883b(C15521a.INSTANCE.m94895c(objM94778k1));
                    Function1<E, Unit> function2 = this.onUndeliveredElement;
                    c15514cM109664b.mo94656f(c15521aM94883b2, function2 != null ? OnUndeliveredElementKt.m95104a(function2, objM94778k1, c15514cM109664b.getContext()) : null);
                }
                objM94670v = c15514cM109664b.m94670v();
                if (objM94670v == uyp.m198688e()) {
                    DebugProbesKt.m88272c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2);
                }
                if (objM94670v == objM198688e) {
                    return objM198688e;
                }
            } catch (Throwable th) {
                c15514cM109664b.m94644O();
                throw th;
            }
        } else {
            if (i3 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objM94670v);
        }
        return ((C15521a) objM94670v).getHolder();
    }

    /* JADX INFO: renamed from: S */
    public final ts4<E> m94751S(long id, ts4<E> startFrom, long currentBufferEndCounter) {
        Object objM173703c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67391j;
        Function2 function2 = (Function2) BufferedChannelKt.m94841y();
        loop0: while (true) {
            objM173703c = pt5.m173703c(startFrom, id, function2);
            if (!tke0.m191548c(objM173703c)) {
                rke0 rke0VarM191547b = tke0.m191547b(objM173703c);
                while (true) {
                    rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                    if (rke0Var.id >= rke0VarM191547b.id) {
                        break loop0;
                    }
                    if (!rke0VarM191547b.m181786u()) {
                        break;
                    }
                    if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, rke0VarM191547b)) {
                        if (!rke0Var.m181784p()) {
                            break loop0;
                        }
                        rke0Var.m177903n();
                        break loop0;
                    }
                    if (rke0VarM191547b.m181784p()) {
                        rke0VarM191547b.m177903n();
                    }
                }
            } else {
                break;
            }
        }
        if (tke0.m191548c(objM173703c)) {
            m94747P();
            m94803z0(id, startFrom);
            m94717m0(this, 0L, 1, null);
            return null;
        }
        ts4<E> ts4Var = (ts4) tke0.m191547b(objM173703c);
        if (ts4Var.id <= id) {
            return ts4Var;
        }
        long j = ts4Var.id;
        int i = BufferedChannelKt.f67403b;
        if (f67387f.compareAndSet(this, currentBufferEndCounter + 1, j * ((long) i))) {
            m94779l0((ts4Var.id * ((long) i)) - currentBufferEndCounter);
        } else {
            m94717m0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public final Object m94752S0(ts4<E> ts4Var, int i, long j, Continuation<? super E> continuation) {
        Function1<E, Unit> function1;
        CoroutineContext f64053a;
        ts4 ts4Var2;
        C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation));
        try {
            Object objM94778k1 = m94778k1(ts4Var, i, j, c15514cM109664b);
            if (objM94778k1 == BufferedChannelKt.f67414m) {
                m94736J0(c15514cM109664b, ts4Var, i);
            } else {
                Function1<Throwable, Unit> function1M95104a = null;
                function1M95104a = null;
                if (objM94778k1 == BufferedChannelKt.f67416o) {
                    if (j < m94773i0()) {
                        ts4Var.m177894c();
                    }
                    ts4 ts4Var3 = (ts4) m94705c0().get(this);
                    while (true) {
                        if (m94791q0()) {
                            m94728C0(c15514cM109664b);
                        } else {
                            long andIncrement = m94706d0().getAndIncrement(this);
                            int i2 = BufferedChannelKt.f67403b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (ts4Var3.id != j2) {
                                ts4 ts4VarM94753T = m94753T(j2, ts4Var3);
                                if (ts4VarM94753T != null) {
                                    ts4Var2 = ts4VarM94753T;
                                }
                            } else {
                                ts4Var2 = ts4Var3;
                            }
                            objM94778k1 = m94778k1(ts4Var2, i3, andIncrement, c15514cM109664b);
                            ts4 ts4Var4 = ts4Var2;
                            if (objM94778k1 == BufferedChannelKt.f67414m) {
                                C15514c c15514c = c15514cM109664b != null ? c15514cM109664b : null;
                                if (c15514c != null) {
                                    m94736J0(c15514c, ts4Var4, i3);
                                }
                            } else if (objM94778k1 == BufferedChannelKt.f67416o) {
                                if (andIncrement < m94773i0()) {
                                    ts4Var4.m177894c();
                                }
                                ts4Var3 = ts4Var4;
                            } else {
                                if (objM94778k1 == BufferedChannelKt.f67415n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ts4Var4.m177894c();
                                function1 = this.onUndeliveredElement;
                                if (function1 != null) {
                                    f64053a = c15514cM109664b.getContext();
                                    function1M95104a = OnUndeliveredElementKt.m95104a(function1, objM94778k1, f64053a);
                                }
                                c15514cM109664b.mo94656f(objM94778k1, function1M95104a);
                            }
                        }
                    }
                } else {
                    ts4Var.m177894c();
                    function1 = this.onUndeliveredElement;
                    if (function1 != null) {
                        f64053a = c15514cM109664b.getContext();
                        function1M95104a = OnUndeliveredElementKt.m95104a(function1, objM94778k1, f64053a);
                    }
                    c15514cM109664b.mo94656f(objM94778k1, function1M95104a);
                }
            }
            Object objM94670v = c15514cM109664b.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v;
        } catch (Throwable th) {
            c15514cM109664b.m94644O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public final ts4<E> m94753T(long id, ts4<E> startFrom) {
        Object objM173703c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67390i;
        Function2 function2 = (Function2) BufferedChannelKt.m94841y();
        loop0: while (true) {
            objM173703c = pt5.m173703c(startFrom, id, function2);
            if (!tke0.m191548c(objM173703c)) {
                rke0 rke0VarM191547b = tke0.m191547b(objM173703c);
                while (true) {
                    rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                    if (rke0Var.id >= rke0VarM191547b.id) {
                        break loop0;
                    }
                    if (!rke0VarM191547b.m181786u()) {
                        break;
                    }
                    if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, rke0VarM191547b)) {
                        if (!rke0Var.m181784p()) {
                            break loop0;
                        }
                        rke0Var.m177903n();
                        break loop0;
                    }
                    if (rke0VarM191547b.m181784p()) {
                        rke0VarM191547b.m177903n();
                    }
                }
            } else {
                break;
            }
        }
        if (tke0.m191548c(objM173703c)) {
            m94747P();
            if (startFrom.id * ((long) BufferedChannelKt.f67403b) < m94773i0()) {
                startFrom.m177894c();
            }
            return null;
        }
        ts4<E> ts4Var = (ts4) tke0.m191547b(objM173703c);
        if (!m94797u0() && id <= m94757W() / ((long) BufferedChannelKt.f67403b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67391j;
            while (true) {
                rke0 rke0Var2 = (rke0) atomicReferenceFieldUpdater2.get(this);
                if (rke0Var2.id >= ts4Var.id || !ts4Var.m181786u()) {
                    break;
                }
                if (C20511u7.m194801a(atomicReferenceFieldUpdater2, this, rke0Var2, ts4Var)) {
                    if (!rke0Var2.m181784p()) {
                        break;
                    }
                    rke0Var2.m177903n();
                    break;
                }
                if (ts4Var.m181784p()) {
                    ts4Var.m177903n();
                }
            }
        }
        long j = ts4Var.id;
        if (j <= id) {
            return ts4Var;
        }
        int i = BufferedChannelKt.f67403b;
        m94787o1(j * ((long) i));
        if (ts4Var.id * ((long) i) < m94773i0()) {
            ts4Var.m177894c();
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m94754T0(gle0<?> select, Object ignoredParam) {
        ts4 ts4Var;
        ts4 ts4Var2 = (ts4) m94705c0().get(this);
        while (!this.m94791q0()) {
            long andIncrement = m94706d0().getAndIncrement(this);
            int i = BufferedChannelKt.f67403b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ts4Var2.id != j) {
                ts4 ts4VarM94753T = this.m94753T(j, ts4Var2);
                if (ts4VarM94753T == null) {
                    continue;
                } else {
                    ts4Var = ts4VarM94753T;
                }
            } else {
                ts4Var = ts4Var2;
            }
            BufferedChannel<E> bufferedChannel = this;
            gle0<?> gle0Var = select;
            Object objM94778k1 = bufferedChannel.m94778k1(ts4Var, i2, andIncrement, gle0Var);
            ts4Var2 = ts4Var;
            if (objM94778k1 == BufferedChannelKt.f67414m) {
                sop0 sop0Var = gle0Var instanceof sop0 ? (sop0) gle0Var : null;
                if (sop0Var != null) {
                    bufferedChannel.m94736J0(sop0Var, ts4Var2, i2);
                    return;
                }
                return;
            }
            if (objM94778k1 != BufferedChannelKt.f67416o) {
                if (objM94778k1 == BufferedChannelKt.f67415n) {
                    wtq0.m207906a("unexpected");
                    return;
                } else {
                    ts4Var2.m177894c();
                    gle0Var.mo95203d(objM94778k1);
                    return;
                }
            }
            if (andIncrement < bufferedChannel.m94773i0()) {
                ts4Var2.m177894c();
            }
            this = bufferedChannel;
            select = gle0Var;
        }
        this.m94729D0(select);
    }

    /* JADX INFO: renamed from: U */
    public final ts4<E> m94755U(long id, ts4<E> startFrom) {
        Object objM173703c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67389h;
        Function2 function2 = (Function2) BufferedChannelKt.m94841y();
        loop0: while (true) {
            objM173703c = pt5.m173703c(startFrom, id, function2);
            if (!tke0.m191548c(objM173703c)) {
                rke0 rke0VarM191547b = tke0.m191547b(objM173703c);
                while (true) {
                    rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                    if (rke0Var.id >= rke0VarM191547b.id) {
                        break loop0;
                    }
                    if (!rke0VarM191547b.m181786u()) {
                        break;
                    }
                    if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, rke0VarM191547b)) {
                        if (!rke0Var.m181784p()) {
                            break loop0;
                        }
                        rke0Var.m177903n();
                        break loop0;
                    }
                    if (rke0VarM191547b.m181784p()) {
                        rke0VarM191547b.m177903n();
                    }
                }
            } else {
                break;
            }
        }
        if (tke0.m191548c(objM173703c)) {
            m94747P();
            if (startFrom.id * ((long) BufferedChannelKt.f67403b) < m94767e0()) {
                startFrom.m177894c();
            }
            return null;
        }
        ts4<E> ts4Var = (ts4) tke0.m191547b(objM173703c);
        long j = ts4Var.id;
        if (j <= id) {
            return ts4Var;
        }
        int i = BufferedChannelKt.f67403b;
        m94790p1(j * ((long) i));
        if (ts4Var.id * ((long) i) < m94767e0()) {
            ts4Var.m177894c();
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
    public void mo94681U0(@NotNull gle0<?> select, @Nullable Object element) {
        ts4 ts4Var;
        ts4 ts4Var2 = (ts4) m94710g0().get(this);
        while (true) {
            long andIncrement = m94712h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM94795s0 = this.m94795s0(andIncrement);
            int i = BufferedChannelKt.f67403b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ts4Var2.id != j2) {
                ts4 ts4VarM94755U = this.m94755U(j2, ts4Var2);
                if (ts4VarM94755U != null) {
                    ts4Var = ts4VarM94755U;
                } else if (zM94795s0) {
                    this.m94730E0(element, select);
                    return;
                }
            } else {
                ts4Var = ts4Var2;
            }
            ?? r5 = this;
            gle0<?> gle0Var = select;
            Object obj = element;
            int iM94781m1 = r5.m94781m1(ts4Var, i2, obj, j, gle0Var, zM94795s0);
            ts4Var2 = ts4Var;
            if (iM94781m1 == 0) {
                ts4Var2.m177894c();
                gle0Var.mo95203d(Unit.INSTANCE);
                return;
            }
            if (iM94781m1 == 1) {
                gle0Var.mo95203d(Unit.INSTANCE);
                return;
            }
            if (iM94781m1 == 2) {
                if (zM94795s0) {
                    ts4Var2.m181785t();
                    r5.m94730E0(obj, gle0Var);
                    return;
                } else {
                    sop0 sop0Var = gle0Var instanceof sop0 ? (sop0) gle0Var : null;
                    if (sop0Var != null) {
                        r5.m94738K0(sop0Var, ts4Var2, i2);
                        return;
                    }
                    return;
                }
            }
            if (iM94781m1 == 3) {
                wtq0.m207906a("unexpected");
                return;
            }
            if (iM94781m1 == 4) {
                if (j < r5.m94767e0()) {
                    ts4Var2.m177894c();
                }
                r5.m94730E0(obj, gle0Var);
                return;
            } else {
                if (iM94781m1 == 5) {
                    ts4Var2.m177894c();
                }
                this = (BufferedChannel<E>) r5;
                element = obj;
                select = gle0Var;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final void m94756V0(ts4<E> lastSegment) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionM95106c = null;
        Object objM169320b = oum.m169320b(null, 1, null);
        loop0: do {
            for (int i = BufferedChannelKt.f67403b - 1; -1 < i; i--) {
                long j = (lastSegment.id * ((long) BufferedChannelKt.f67403b)) + ((long) i);
                while (true) {
                    Object objM192557B = lastSegment.m192557B(i);
                    if (objM192557B == BufferedChannelKt.f67410i) {
                        break loop0;
                    }
                    if (objM192557B != BufferedChannelKt.f67405d) {
                        if (objM192557B != BufferedChannelKt.f67406e && objM192557B != null) {
                            if (!(objM192557B instanceof sop0) && !(objM192557B instanceof top0)) {
                                if (objM192557B != BufferedChannelKt.f67408g && objM192557B != BufferedChannelKt.f67407f) {
                                    if (objM192557B != BufferedChannelKt.f67408g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j < m94767e0()) {
                                    break loop0;
                                }
                                sop0 sop0Var = objM192557B instanceof top0 ? ((top0) objM192557B).waiter : (sop0) objM192557B;
                                if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                                    if (function1 != null) {
                                        undeliveredElementExceptionM95106c = OnUndeliveredElementKt.m95106c(function1, lastSegment.m192556A(i), undeliveredElementExceptionM95106c);
                                    }
                                    objM169320b = oum.m169321c(objM169320b, sop0Var);
                                    lastSegment.m192564w(i);
                                    lastSegment.m181785t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                                lastSegment.m181785t();
                                break;
                            }
                        }
                    } else {
                        if (j < m94767e0()) {
                            break loop0;
                        }
                        if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                            if (function1 != null) {
                                undeliveredElementExceptionM95106c = OnUndeliveredElementKt.m95106c(function1, lastSegment.m192556A(i), undeliveredElementExceptionM95106c);
                            }
                            lastSegment.m192564w(i);
                            lastSegment.m181785t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ts4) lastSegment.m177899h();
        } while (lastSegment != null);
        if (objM169320b != null) {
            if (objM169320b instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM169320b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m94759X0((sop0) arrayList.get(size));
                }
            } else {
                m94759X0((sop0) objM169320b);
            }
        }
        if (undeliveredElementExceptionM95106c != null) {
            throw undeliveredElementExceptionM95106c;
        }
    }

    /* JADX INFO: renamed from: W */
    public final long m94757W() {
        return f67387f.get(this);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m94758W0(sop0 sop0Var) {
        m94761Y0(sop0Var, true);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m94759X0(sop0 sop0Var) {
        m94761Y0(sop0Var, false);
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final Throwable m94760Y() {
        return (Throwable) f67392k.get(this);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m94761Y0(sop0 sop0Var, boolean z) {
        if (sop0Var instanceof C15518b) {
            ag4<Boolean> ag4VarM94813a = ((C15518b) sop0Var).m94813a();
            Result.Companion companion = Result.INSTANCE;
            ag4VarM94813a.resumeWith(Result.m225066constructorimpl(Boolean.FALSE));
            return;
        }
        if (sop0Var instanceof ag4) {
            Continuation continuation = (Continuation) sop0Var;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(z ? m94763b0() : m94769f0())));
        } else if (sop0Var instanceof unc0) {
            C15514c<C15521a<? extends E>> c15514c = ((unc0) sop0Var).cont;
            Result.Companion companion3 = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(C15521a.m94883b(C15521a.INSTANCE.m94893a(m94760Y()))));
        } else if (sop0Var instanceof C15517a) {
            ((C15517a) sop0Var).m94812j();
        } else if (sop0Var instanceof gle0) {
            ((gle0) sop0Var).mo95205f(this, BufferedChannelKt.m94842z());
        } else {
            mpq.m159379a("Unexpected waiter: ", sop0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a1 */
    public Object mo94762a1(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m94704b1(this, e, continuation);
    }

    /* JADX INFO: renamed from: b0 */
    public final Throwable m94763b0() {
        Throwable thM94760Y = m94760Y();
        return thM94760Y == null ? new ClosedReceiveChannelException("Channel was closed") : thM94760Y;
    }

    @Override // p153l.sme0
    @NotNull
    /* JADX INFO: renamed from: c */
    public ble0<E, BufferedChannel<E>> mo94764c() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m88429g(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        return new cle0(this, function3, (Function3) TypeIntrinsics.m88429g(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX INFO: renamed from: c1 */
    public final Object m94765c1(ts4<E> ts4Var, int i, E e, long j, Continuation<? super Unit> continuation) {
        Unit unit;
        Object objM94670v;
        C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation));
        try {
            int iM94781m1 = m94781m1(ts4Var, i, e, j, c15514cM109664b, false);
            if (iM94781m1 == 0) {
                ts4Var.m177894c();
                Result.Companion companion = Result.INSTANCE;
                unit = Unit.INSTANCE;
            } else {
                if (iM94781m1 != 1) {
                    if (iM94781m1 != 2) {
                        if (iM94781m1 != 4) {
                            if (iM94781m1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            ts4Var.m177894c();
                            ts4 ts4Var2 = (ts4) m94710g0().get(this);
                            while (true) {
                                long andIncrement = m94712h0().getAndIncrement(this);
                                long j2 = 1152921504606846975L & andIncrement;
                                boolean zM94795s0 = m94795s0(andIncrement);
                                int i2 = BufferedChannelKt.f67403b;
                                long j3 = j2 / ((long) i2);
                                int i3 = (int) (j2 % ((long) i2));
                                if (ts4Var2.id != j3) {
                                    ts4 ts4VarM94755U = m94755U(j3, ts4Var2);
                                    if (ts4VarM94755U != null) {
                                        ts4Var2 = ts4VarM94755U;
                                    } else if (zM94795s0) {
                                    }
                                }
                                int iM94781m2 = m94781m1(ts4Var2, i3, e, j2, c15514cM109664b, zM94795s0);
                                if (iM94781m2 == 0) {
                                    ts4Var2.m177894c();
                                    Result.Companion companion2 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                } else if (iM94781m2 == 1) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                } else if (iM94781m2 == 2) {
                                    if (!zM94795s0) {
                                        C15514c c15514c = c15514cM109664b != null ? c15514cM109664b : null;
                                        if (c15514c == null) {
                                            break;
                                        }
                                        m94738K0(c15514c, ts4Var2, i3);
                                        break;
                                    }
                                    ts4Var2.m181785t();
                                } else {
                                    if (iM94781m2 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (iM94781m2 != 4) {
                                        if (iM94781m2 == 5) {
                                            ts4Var2.m177894c();
                                        }
                                    } else if (j2 < m94767e0()) {
                                        ts4Var2.m177894c();
                                    }
                                }
                            }
                        } else if (j < m94767e0()) {
                            ts4Var.m177894c();
                        }
                        m94732G0(e, c15514cM109664b);
                        break;
                    } else {
                        m94738K0(c15514cM109664b, ts4Var, i);
                    }
                    objM94670v = c15514cM109664b.m94670v();
                    if (objM94670v == uyp.m198688e()) {
                        DebugProbesKt.m88272c(continuation);
                    }
                    if (objM94670v == uyp.m198688e()) {
                        return objM94670v;
                    }
                    return Unit.INSTANCE;
                }
                Result.Companion companion4 = Result.INSTANCE;
                unit = Unit.INSTANCE;
            }
            c15514cM109664b.resumeWith(Result.m225066constructorimpl(unit));
            objM94670v = c15514cM109664b.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            if (objM94670v == uyp.m198688e()) {
                return objM94670v;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            c15514cM109664b.m94644O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m94766d1(long curSendersAndCloseStatus) {
        if (m94795s0(curSendersAndCloseStatus)) {
            return false;
        }
        return !m94734I(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: e0 */
    public final long m94767e0() {
        return f67386e.get(this);
    }

    /* JADX INFO: renamed from: e1 */
    public boolean mo94768e1() {
        return m94766d1(f67385d.get(this));
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final Throwable m94769f0() {
        Throwable thM94760Y = m94760Y();
        return thM94760Y == null ? new ClosedSendChannelException("Channel was closed") : thM94760Y;
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m94770f1(Object obj, E e) {
        if (obj instanceof gle0) {
            return ((gle0) obj).mo95205f(this, e);
        }
        if (obj instanceof unc0) {
            unc0 unc0Var = (unc0) obj;
            C15514c<C15521a<? extends E>> c15514c = unc0Var.cont;
            C15521a c15521aM94883b = C15521a.m94883b(C15521a.INSTANCE.m94895c(e));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return BufferedChannelKt.m94815B(c15514c, c15521aM94883b, function1 != null ? OnUndeliveredElementKt.m95104a(function1, e, unc0Var.cont.getContext()) : null);
        }
        if (obj instanceof C15517a) {
            return ((C15517a) obj).m94811i(e);
        }
        if (!(obj instanceof ag4)) {
            mpq.m159379a("Unexpected receiver type: ", obj);
            return false;
        }
        ag4 ag4Var = (ag4) obj;
        Function1<E, Unit> function2 = this.onUndeliveredElement;
        return BufferedChannelKt.m94815B(ag4Var, e, function2 != null ? OnUndeliveredElementKt.m95104a(function2, e, ag4Var.getContext()) : null);
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m94771g1(Object obj, ts4<E> ts4Var, int i) {
        if (obj instanceof ag4) {
            return BufferedChannelKt.m94816C((ag4) obj, Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof gle0) {
            TrySelectDetailedResult trySelectDetailedResultM95216z = ((SelectImplementation) obj).m95216z(this, Unit.INSTANCE);
            if (trySelectDetailedResultM95216z == TrySelectDetailedResult.REREGISTER) {
                ts4Var.m192564w(i);
            }
            return trySelectDetailedResultM95216z == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof C15518b) {
            return BufferedChannelKt.m94816C(((C15518b) obj).m94813a(), Boolean.TRUE, null, 2, null);
        }
        mpq.m159379a("Unexpected waiter: ", obj);
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final Object m94772h1(E element) {
        ts4 ts4VarM94755U;
        Object obj = BufferedChannelKt.f67405d;
        ts4 ts4Var = (ts4) m94710g0().get(this);
        while (true) {
            long andIncrement = m94712h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM94795s0 = this.m94795s0(andIncrement);
            int i = BufferedChannelKt.f67403b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ts4Var.id != j2) {
                ts4VarM94755U = this.m94755U(j2, ts4Var);
                if (ts4VarM94755U == null) {
                    if (zM94795s0) {
                        return C15521a.INSTANCE.m94893a(this.m94769f0());
                    }
                }
            } else {
                ts4VarM94755U = ts4Var;
            }
            E e = element;
            int iM94781m1 = this.m94781m1(ts4VarM94755U, i2, e, j, obj, zM94795s0);
            BufferedChannel<E> bufferedChannel = this;
            ts4Var = ts4VarM94755U;
            if (iM94781m1 == 0) {
                ts4Var.m177894c();
                return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
            }
            if (iM94781m1 == 1) {
                return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
            }
            if (iM94781m1 == 2) {
                if (zM94795s0) {
                    ts4Var.m181785t();
                    return C15521a.INSTANCE.m94893a(bufferedChannel.m94769f0());
                }
                sop0 sop0Var = obj instanceof sop0 ? (sop0) obj : null;
                if (sop0Var != null) {
                    bufferedChannel.m94738K0(sop0Var, ts4Var, i2);
                }
                bufferedChannel.m94748Q((ts4Var.id * ((long) i)) + ((long) i2));
                return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
            }
            if (iM94781m1 == 3) {
                wtq0.m207906a("unexpected");
                return null;
            }
            if (iM94781m1 == 4) {
                if (j < bufferedChannel.m94767e0()) {
                    ts4Var.m177894c();
                }
                return C15521a.INSTANCE.m94893a(bufferedChannel.m94769f0());
            }
            if (iM94781m1 == 5) {
                ts4Var.m177894c();
            }
            this = bufferedChannel;
            element = e;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final long m94773i0() {
        return f67385d.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m94774i1(ts4<E> segment, int index, long b) {
        Object objM192557B = segment.m192557B(index);
        if (!(objM192557B instanceof sop0) || b < f67386e.get(this) || !segment.m192563v(index, objM192557B, BufferedChannelKt.f67408g)) {
            return m94776j1(segment, index, b);
        }
        if (m94771g1(objM192557B, segment, index)) {
            segment.m192561F(index, BufferedChannelKt.f67405d);
            return true;
        }
        segment.m192561F(index, BufferedChannelKt.f67411j);
        segment.m192558C(index, false);
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return new C15517a();
    }

    @Override // p153l.sme0
    /* JADX INFO: renamed from: j */
    public void mo94775j(@NotNull Function1<? super Throwable, Unit> handler) {
        if (C20511u7.m194801a(f67393l, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67393l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f67418q) {
                if (obj == BufferedChannelKt.f67419r) {
                    wtq0.m207906a("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    mpq.m159379a("Another handler is already registered: ", obj);
                    return;
                }
            }
        } while (!C20511u7.m194801a(f67393l, this, BufferedChannelKt.f67418q, BufferedChannelKt.f67419r));
        handler.invoke(m94760Y());
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m94776j1(ts4<E> segment, int index, long b) {
        while (true) {
            Object objM192557B = segment.m192557B(index);
            if (objM192557B instanceof sop0) {
                if (b < f67386e.get(this)) {
                    if (segment.m192563v(index, objM192557B, new top0((sop0) objM192557B))) {
                        return true;
                    }
                } else if (segment.m192563v(index, objM192557B, BufferedChannelKt.f67408g)) {
                    if (m94771g1(objM192557B, segment, index)) {
                        segment.m192561F(index, BufferedChannelKt.f67405d);
                        return true;
                    }
                    segment.m192561F(index, BufferedChannelKt.f67411j);
                    segment.m192558C(index, false);
                    return false;
                }
            } else {
                if (objM192557B == BufferedChannelKt.f67411j) {
                    return false;
                }
                if (objM192557B == null) {
                    if (segment.m192563v(index, objM192557B, BufferedChannelKt.f67406e)) {
                        return true;
                    }
                } else {
                    if (objM192557B == BufferedChannelKt.f67405d || objM192557B == BufferedChannelKt.f67409h || objM192557B == BufferedChannelKt.f67410i || objM192557B == BufferedChannelKt.f67412k || objM192557B == BufferedChannelKt.m94842z()) {
                        return true;
                    }
                    if (objM192557B != BufferedChannelKt.f67407f) {
                        mpq.m159379a("Unexpected cell state: ", objM192557B);
                        return false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m94777k0() {
        while (true) {
            ts4<E> ts4VarM94753T = (ts4) f67390i.get(this);
            long jM94767e0 = m94767e0();
            if (m94773i0() <= jM94767e0) {
                return false;
            }
            int i = BufferedChannelKt.f67403b;
            long j = jM94767e0 / ((long) i);
            if (ts4VarM94753T.id == j || (ts4VarM94753T = m94753T(j, ts4VarM94753T)) != null) {
                ts4VarM94753T.m177894c();
                if (m94786o0(ts4VarM94753T, (int) (jM94767e0 % ((long) i)), jM94767e0)) {
                    return true;
                }
                f67386e.compareAndSet(this, jM94767e0, 1 + jM94767e0);
            } else if (((ts4) f67390i.get(this)).id < j) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final Object m94778k1(ts4<E> segment, int index, long r, Object waiter) {
        Object objM192557B = segment.m192557B(index);
        if (objM192557B == null) {
            if (r >= (f67385d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.f67415n;
                }
                if (segment.m192563v(index, objM192557B, waiter)) {
                    m94749R();
                    return BufferedChannelKt.f67414m;
                }
            }
        } else if (objM192557B == BufferedChannelKt.f67405d && segment.m192563v(index, objM192557B, BufferedChannelKt.f67410i)) {
            m94749R();
            return segment.m192559D(index);
        }
        return m94780l1(segment, index, r, waiter);
    }

    @Override // p153l.sme0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo94683l(E element) {
        ts4 ts4Var;
        if (m94766d1(f67385d.get(this))) {
            return C15521a.INSTANCE.m94894b();
        }
        Object obj = BufferedChannelKt.f67411j;
        ts4 ts4Var2 = (ts4) m94710g0().get(this);
        while (true) {
            long andIncrement = m94712h0().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM94795s0 = this.m94795s0(andIncrement);
            int i = BufferedChannelKt.f67403b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (ts4Var2.id != j2) {
                ts4 ts4VarM94755U = this.m94755U(j2, ts4Var2);
                if (ts4VarM94755U != null) {
                    ts4Var = ts4VarM94755U;
                } else if (zM94795s0) {
                    return C15521a.INSTANCE.m94893a(this.m94769f0());
                }
            } else {
                ts4Var = ts4Var2;
            }
            int iM94781m1 = this.m94781m1(ts4Var, i2, element, j, obj, zM94795s0);
            BufferedChannel<E> bufferedChannel = this;
            ts4Var2 = ts4Var;
            if (iM94781m1 == 0) {
                ts4Var2.m177894c();
                return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
            }
            if (iM94781m1 == 1) {
                return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
            }
            if (iM94781m1 == 2) {
                if (zM94795s0) {
                    ts4Var2.m181785t();
                    return C15521a.INSTANCE.m94893a(bufferedChannel.m94769f0());
                }
                sop0 sop0Var = obj instanceof sop0 ? (sop0) obj : null;
                if (sop0Var != null) {
                    bufferedChannel.m94738K0(sop0Var, ts4Var2, i2);
                }
                ts4Var2.m181785t();
                return C15521a.INSTANCE.m94894b();
            }
            if (iM94781m1 == 3) {
                wtq0.m207906a("unexpected");
                return null;
            }
            if (iM94781m1 == 4) {
                if (j < bufferedChannel.m94767e0()) {
                    ts4Var2.m177894c();
                }
                return C15521a.INSTANCE.m94893a(bufferedChannel.m94769f0());
            }
            if (iM94781m1 == 5) {
                ts4Var2.m177894c();
            }
            this = bufferedChannel;
            element = element;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m94779l0(long nAttempts) {
        if ((f67388g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f67388g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final Object m94780l1(ts4<E> segment, int index, long r, Object waiter) {
        while (true) {
            Object objM192557B = segment.m192557B(index);
            if (objM192557B == null || objM192557B == BufferedChannelKt.f67406e) {
                if (r < (f67385d.get(this) & 1152921504606846975L)) {
                    if (segment.m192563v(index, objM192557B, BufferedChannelKt.f67409h)) {
                        m94749R();
                        return BufferedChannelKt.f67416o;
                    }
                } else {
                    if (waiter == null) {
                        return BufferedChannelKt.f67415n;
                    }
                    if (segment.m192563v(index, objM192557B, waiter)) {
                        m94749R();
                        return BufferedChannelKt.f67414m;
                    }
                }
            } else {
                if (objM192557B != BufferedChannelKt.f67405d) {
                    if (objM192557B != BufferedChannelKt.f67411j && objM192557B != BufferedChannelKt.f67409h) {
                        if (objM192557B == BufferedChannelKt.m94842z()) {
                            m94749R();
                            return BufferedChannelKt.f67416o;
                        }
                        if (objM192557B != BufferedChannelKt.f67408g && segment.m192563v(index, objM192557B, BufferedChannelKt.f67407f)) {
                            boolean z = objM192557B instanceof top0;
                            if (z) {
                                objM192557B = ((top0) objM192557B).waiter;
                            }
                            if (m94771g1(objM192557B, segment, index)) {
                                segment.m192561F(index, BufferedChannelKt.f67410i);
                                m94749R();
                                return segment.m192559D(index);
                            }
                            segment.m192561F(index, BufferedChannelKt.f67411j);
                            segment.m192558C(index, false);
                            if (z) {
                                m94749R();
                            }
                            return BufferedChannelKt.f67416o;
                        }
                    }
                    return BufferedChannelKt.f67416o;
                }
                if (segment.m192563v(index, objM192557B, BufferedChannelKt.f67410i)) {
                    m94749R();
                    return segment.m192559D(index);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final int m94781m1(ts4<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        segment.m192562G(index, element);
        if (closed) {
            return m94784n1(segment, index, element, s, waiter, closed);
        }
        Object objM192557B = segment.m192557B(index);
        if (objM192557B == null) {
            if (m94734I(s)) {
                if (segment.m192563v(index, null, BufferedChannelKt.f67405d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.m192563v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objM192557B instanceof sop0) {
            segment.m192564w(index);
            if (m94770f1(objM192557B, element)) {
                segment.m192561F(index, BufferedChannelKt.f67410i);
                m94733H0();
                return 0;
            }
            if (segment.m192565x(index, BufferedChannelKt.f67412k) == BufferedChannelKt.f67412k) {
                return 5;
            }
            segment.m192558C(index, true);
            return 5;
        }
        return m94784n1(segment, index, element, s, waiter, closed);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: n */
    public final void mo94782n(@Nullable CancellationException cause) {
        mo94680J(cause);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m94783n0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67393l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C20511u7.m194801a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f67418q : BufferedChannelKt.f67419r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(m94760Y());
    }

    /* JADX INFO: renamed from: n1 */
    public final int m94784n1(ts4<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        while (true) {
            Object objM192557B = segment.m192557B(index);
            if (objM192557B == null) {
                if (!m94734I(s) || closed) {
                    if (closed) {
                        if (segment.m192563v(index, null, BufferedChannelKt.f67411j)) {
                            segment.m192558C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.m192563v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.m192563v(index, null, BufferedChannelKt.f67405d)) {
                    return 1;
                }
            } else {
                if (objM192557B != BufferedChannelKt.f67406e) {
                    if (objM192557B == BufferedChannelKt.f67412k) {
                        segment.m192564w(index);
                        return 5;
                    }
                    if (objM192557B == BufferedChannelKt.f67409h) {
                        segment.m192564w(index);
                        return 5;
                    }
                    if (objM192557B == BufferedChannelKt.m94842z()) {
                        segment.m192564w(index);
                        m94747P();
                        return 4;
                    }
                    segment.m192564w(index);
                    if (objM192557B instanceof top0) {
                        objM192557B = ((top0) objM192557B).waiter;
                    }
                    if (m94770f1(objM192557B, element)) {
                        segment.m192561F(index, BufferedChannelKt.f67410i);
                        m94733H0();
                        return 0;
                    }
                    if (segment.m192565x(index, BufferedChannelKt.f67412k) != BufferedChannelKt.f67412k) {
                        segment.m192558C(index, true);
                    }
                    return 5;
                }
                if (segment.m192563v(index, objM192557B, BufferedChannelKt.f67405d)) {
                    return 1;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: o */
    public zke0<C15521a<E>> mo94785o() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m88429g(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        return new ale0(this, function3, (Function3) TypeIntrinsics.m88429g(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m94786o0(ts4<E> segment, int index, long globalIndex) {
        Object objM192557B;
        do {
            objM192557B = segment.m192557B(index);
            if (objM192557B != null && objM192557B != BufferedChannelKt.f67406e) {
                if (objM192557B == BufferedChannelKt.f67405d) {
                    return true;
                }
                if (objM192557B == BufferedChannelKt.f67411j || objM192557B == BufferedChannelKt.m94842z() || objM192557B == BufferedChannelKt.f67410i || objM192557B == BufferedChannelKt.f67409h) {
                    return false;
                }
                if (objM192557B == BufferedChannelKt.f67408g) {
                    return true;
                }
                return objM192557B != BufferedChannelKt.f67407f && globalIndex == m94767e0();
            }
        } while (!segment.m192563v(index, objM192557B, BufferedChannelKt.f67409h));
        m94749R();
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m94787o1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67386e;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (j >= value) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            long j2 = value;
            if (f67386e.compareAndSet(bufferedChannel, j, j2)) {
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
    public Object mo94788p() {
        ts4 ts4VarM94753T;
        long j = f67386e.get(this);
        long j2 = f67385d.get(this);
        if (m94794r0(j2)) {
            return C15521a.INSTANCE.m94893a(m94760Y());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return C15521a.INSTANCE.m94894b();
        }
        Object obj = BufferedChannelKt.f67412k;
        ts4 ts4Var = (ts4) m94705c0().get(this);
        while (!this.m94791q0()) {
            long andIncrement = m94706d0().getAndIncrement(this);
            int i = BufferedChannelKt.f67403b;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (ts4Var.id != j3) {
                ts4VarM94753T = this.m94753T(j3, ts4Var);
                if (ts4VarM94753T == null) {
                    continue;
                }
            } else {
                ts4VarM94753T = ts4Var;
            }
            BufferedChannel<E> bufferedChannel = this;
            Object objM94778k1 = bufferedChannel.m94778k1(ts4VarM94753T, i2, andIncrement, obj);
            ts4Var = ts4VarM94753T;
            if (objM94778k1 == BufferedChannelKt.f67414m) {
                sop0 sop0Var = obj instanceof sop0 ? (sop0) obj : null;
                if (sop0Var != null) {
                    bufferedChannel.m94736J0(sop0Var, ts4Var, i2);
                }
                bufferedChannel.m94792q1(andIncrement);
                ts4Var.m181785t();
                return C15521a.INSTANCE.m94894b();
            }
            if (objM94778k1 != BufferedChannelKt.f67416o) {
                if (objM94778k1 != BufferedChannelKt.f67415n) {
                    ts4Var.m177894c();
                    return C15521a.INSTANCE.m94895c(objM94778k1);
                }
                wtq0.m207906a("unexpected");
                return null;
            }
            if (andIncrement < bufferedChannel.m94773i0()) {
                ts4Var.m177894c();
            }
            this = bufferedChannel;
        }
        return C15521a.INSTANCE.m94893a(this.m94760Y());
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m94789p0(long sendersAndCloseStatusCur, boolean isClosedForReceive) throws IllegalAccessException, InvocationTargetException {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            m94745O(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && m94777k0()) ? false : true;
        }
        if (i == 3) {
            m94743N(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i).toString());
    }

    /* JADX INFO: renamed from: p1 */
    public final void m94790p1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67385d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            long j2 = 1152921504606846975L & j;
            if (j2 >= value) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (f67385d.compareAndSet(bufferedChannel, j, BufferedChannelKt.m94839w(j2, (int) (j >> 60)))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m94791q0() {
        return m94794r0(f67385d.get(this));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m94792q1(long globalIndex) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.m94797u0()) {
            return;
        }
        while (bufferedChannel.m94757W() <= globalIndex) {
            bufferedChannel = this;
        }
        int i = BufferedChannelKt.f67404c;
        for (int i2 = 0; i2 < i; i2++) {
            long jM94757W = bufferedChannel.m94757W();
            if (jM94757W == (4611686018427387903L & f67388g.get(bufferedChannel)) && jM94757W == bufferedChannel.m94757W()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67388g;
        while (true) {
            long j = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m94838v(j & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jM94757W2 = bufferedChannel.m94757W();
            long j2 = f67388g.get(bufferedChannel);
            long j3 = j2 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j2) != 0;
            if (jM94757W2 == j3 && jM94757W2 == bufferedChannel.m94757W()) {
                break;
            }
            if (z) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f67388g.compareAndSet(bufferedChannel, j2, BufferedChannelKt.m94838v(j3, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f67388g;
        while (true) {
            long j4 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j4, BufferedChannelKt.m94838v(j4 & 4611686018427387903L, false));
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
    public Object mo94793r(@NotNull Continuation<? super C15521a<? extends E>> continuation) {
        return m94696Q0(this, continuation);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m94794r0(long j) {
        return m94789p0(j, true);
    }

    @Override // p153l.sme0
    /* JADX INFO: renamed from: s */
    public boolean mo94684s() {
        return m94795s0(f67385d.get(this));
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m94795s0(long j) {
        return m94789p0(j, false);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean mo94796t0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f67385d.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new ts4[]{f67390i.get(this), f67389h.get(this), f67391j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ts4) obj) != BufferedChannelKt.f67402a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            mor.m159308a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ts4) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ts4) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ts4 ts4Var = (ts4) next;
        long jM94767e0 = m94767e0();
        long jM94773i0 = m94773i0();
        loop2: while (true) {
            int i3 = BufferedChannelKt.f67403b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j3 = (ts4Var.id * ((long) BufferedChannelKt.f67403b)) + ((long) i4);
                if (j3 >= jM94773i0 && j3 >= jM94767e0) {
                    break loop2;
                }
                Object objM192557B = ts4Var.m192557B(i4);
                Object objM192556A = ts4Var.m192556A(i4);
                if (objM192557B instanceof ag4) {
                    string = (j3 >= jM94767e0 || j3 < jM94773i0) ? (j3 >= jM94773i0 || j3 < jM94767e0) ? "cont" : "send" : "receive";
                } else if (objM192557B instanceof gle0) {
                    string = (j3 >= jM94767e0 || j3 < jM94773i0) ? (j3 >= jM94773i0 || j3 < jM94767e0) ? "select" : "onSend" : "onReceive";
                } else if (objM192557B instanceof unc0) {
                    string = "receiveCatching";
                } else if (objM192557B instanceof C15518b) {
                    string = "sendBroadcast";
                } else if (objM192557B instanceof top0) {
                    string = "EB(" + objM192557B + ')';
                } else if (Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67407f) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67408g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objM192557B == null ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67406e) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67410i) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67409h) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67412k) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.f67411j) ? true : Intrinsics.m88377d(objM192557B, BufferedChannelKt.m94842z()))) {
                        string = objM192557B.toString();
                    }
                }
                if (objM192556A != null) {
                    sb.append("(" + string + ',' + objM192556A + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            ts4Var = (ts4) ts4Var.m177897f();
            if (ts4Var == null) {
                break;
            }
            i2 = 0;
        }
        if (C15497h.m94386c1(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m94797u0() {
        long jM94757W = m94757W();
        return jM94757W == 0 || jM94757W == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final long m94798v0(ts4<E> lastSegment) {
        do {
            int i = BufferedChannelKt.f67403b;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (lastSegment.id * ((long) BufferedChannelKt.f67403b)) + ((long) i);
                    if (j >= m94767e0()) {
                        while (true) {
                            Object objM192557B = lastSegment.m192557B(i);
                            if (objM192557B != null && objM192557B != BufferedChannelKt.f67406e) {
                                if (objM192557B != BufferedChannelKt.f67405d) {
                                    break;
                                }
                                return j;
                            }
                            if (lastSegment.m192563v(i, objM192557B, BufferedChannelKt.m94842z())) {
                                lastSegment.m181785t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (ts4) lastSegment.m177899h();
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m94799w0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67385d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m94839w(1152921504606846975L & j, 1))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m94800x0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67385d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.m94839w(1152921504606846975L & j, 3))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m94801y0() {
        long jM94839w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67385d;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jM94839w = BufferedChannelKt.m94839w(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jM94839w = BufferedChannelKt.m94839w(1152921504606846975L & j, 3);
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, jM94839w)) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: z */
    public zke0<E> mo94802z() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        Function3 function3 = (Function3) TypeIntrinsics.m88429g(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        return new ale0(this, function3, (Function3) TypeIntrinsics.m88429g(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final void m94803z0(long id, ts4<E> startFrom) {
        ts4<E> ts4Var;
        ts4<E> ts4Var2;
        while (startFrom.id < id && (ts4Var2 = (ts4) startFrom.m177897f()) != null) {
            startFrom = ts4Var2;
        }
        while (true) {
            if (!startFrom.mo177900k() || (ts4Var = (ts4) startFrom.m177897f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67391j;
                while (true) {
                    rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                    if (rke0Var.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.m181786u()) {
                        break;
                    }
                    if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, startFrom)) {
                        if (rke0Var.m181784p()) {
                            rke0Var.m177903n();
                            return;
                        }
                        return;
                    } else if (startFrom.m181784p()) {
                        startFrom.m177903n();
                    }
                }
            } else {
                startFrom = ts4Var;
            }
        }
    }

    public /* synthetic */ BufferedChannel(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }
}
