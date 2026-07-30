package kotlinx.coroutines.selects;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.InterfaceC15406b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21643z7;
import p149l.bde0;
import p149l.bf4;
import p149l.cde0;
import p149l.ddk0;
import p149l.df4;
import p149l.l4e;
import p149l.mce0;
import p149l.nnq;
import p149l.qkq0;
import p149l.qq3;
import p149l.rce0;
import p149l.sce0;
import p149l.uce0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001BB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0019\u0010\nJ,\u0010\u001b\u001a\u00028\u00002\u0010\u0010\u001a\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\r2\u0010\u0010\u001d\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00028\u0000H\u0091@¢\u0006\u0004\b \u0010\nJ2\u0010%\u001a\u00020\r*\u00020!2\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\"H\u0096\u0002¢\u0006\u0004\b%\u0010&JD\u0010*\u001a\u00020\r\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00010(2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0)H\u0096\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\r*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J#\u00107\u001a\u00020\r2\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b9\u0010\u000fJ!\u0010;\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bE\u0010FR(\u0010I\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010JR\u0016\u0010M\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010LR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010P\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0Q8\u0002X\u0082\u0004¨\u0006S"}, m87232d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/b;", "Ll/rce0;", "Ll/cde0;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clauseObject", "", "m", "(Ljava/lang/Object;)V", "B", BaseSei.f13931Y, "internalResult", "", "A", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lkotlinx/coroutines/selects/SelectImplementation$a;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/SelectImplementation$a;", "o", "clause", ResourceDirection.f38808v, "(Lkotlinx/coroutines/selects/SelectImplementation$a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedClause", "n", "(Lkotlinx/coroutines/selects/SelectImplementation$a;)V", "p", "Ll/sce0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Ll/sce0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/uce0;", "Lkotlin/Function2;", "e", "(Ll/uce0;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "w", "(Lkotlinx/coroutines/selects/SelectImplementation$a;Z)V", "Ll/l4e;", "disposableHandle", "b", "(Ll/l4e;)V", "Ll/mce0;", "segment", FirebaseAnalytics.Param.INDEX, "g", "(Ll/mce0;I)V", Constants.INAPP_DATA_TAG, LovePlanetStage.result, "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", BaseSei.f13932Z, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "cause", "a", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "u", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public class SelectImplementation<R> implements InterfaceC15406b, rce0<R>, cde0<R> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66949f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f66965b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<SelectImplementation<R>.C15494a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int indexInSegment = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Object internalResult = SelectKt.f66968e;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    @Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¸\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%Rc\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&Rc\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%Ru\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010-\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m87232d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$a;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bde0;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "", "e", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", LovePlanetStage.result, Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "a", "(Ll/bde0;Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C15494a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function3<Object, bde0<?>, Object, Unit> regFunc;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function3<Object, Object, Object, Object> processResFunc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object param;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Object block;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public C15494a(@NotNull Object obj, @NotNull Function3<Object, ? super bde0<?>, Object, Unit> function3, @Nullable Function3<Object, Object, Object, ? extends Object> function4, @NotNull Object obj2, @Nullable Object obj3, Function3<? super bde0<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> function5) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function4;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function5;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Function1<Throwable, Unit> m94324a(@NotNull bde0<?> select, @Nullable Object internalResult) {
            Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m94325b() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof mce0) {
                ((mce0) obj).mo145770s(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            l4e l4eVar = obj instanceof l4e ? (l4e) obj : null;
            if (l4eVar != null) {
                l4eVar.dispose();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m94326c(@Nullable Object obj, @NotNull Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == SelectKt.m94337i()) {
                obj2.getClass();
                return ((Function1) obj2).invoke(continuation);
            }
            obj2.getClass();
            return ((Function2) obj2).invoke(obj, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Object m94327d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m94328e(@NotNull SelectImplementation<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == SelectKt.f66968e;
        }
    }

    public SelectImplementation(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @PublishedApi
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ <R> Object m94303q(SelectImplementation<R> selectImplementation, Continuation<? super R> continuation) {
        return selectImplementation.m94319u() ? selectImplementation.m94315o(continuation) : selectImplementation.m94317r(continuation);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m94305x(SelectImplementation selectImplementation, C15494a c15494a, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: register");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.m94321w(c15494a, z);
    }

    /* JADX INFO: renamed from: A */
    public final int m94306A(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f66949f.get(this);
            if (obj instanceof bf4) {
                SelectImplementation<R>.C15494a c15494aM94318s = m94318s(clauseObject);
                if (c15494aM94318s == null) {
                    continue;
                } else {
                    Function1<Throwable, Unit> function1M94324a = c15494aM94318s.m94324a(this, internalResult);
                    if (C21643z7.m217426a(f66949f, this, obj, c15494aM94318s)) {
                        this.internalResult = internalResult;
                        if (SelectKt.m94338j((bf4) obj, function1M94324a)) {
                            return 0;
                        }
                        this.internalResult = SelectKt.f66968e;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.m87488d(obj, SelectKt.f66966c) ? true : obj instanceof C15494a) {
                    return 3;
                }
                if (Intrinsics.m87488d(obj, SelectKt.f66967d)) {
                    return 2;
                }
                if (Intrinsics.m87488d(obj, SelectKt.f66965b)) {
                    if (C21643z7.m217426a(f66949f, this, obj, CollectionsKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        nnq.m160357a("Unexpected state: ", obj);
                        return 0;
                    }
                    if (C21643z7.m217426a(f66949f, this, obj, CollectionsKt.plus((Collection<? extends Object>) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Object m94307B(Continuation<? super Unit> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66949f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f66965b) {
                if (C21643z7.m217426a(f66949f, this, obj, c15407c)) {
                    df4.m111431c(c15407c, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof C15494a) {
                        c15407c.mo93764f(Unit.INSTANCE, ((C15494a) obj).m94324a(this, this.internalResult));
                        break;
                    }
                    nnq.m160357a("unexpected state: ", obj);
                    return null;
                }
                if (C21643z7.m217426a(f66949f, this, obj, SelectKt.f66965b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m94322y(it.next());
                    }
                }
            }
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15406b
    /* JADX INFO: renamed from: a */
    public void mo93737a(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66949f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f66966c) {
                return;
            }
        } while (!C21643z7.m217426a(atomicReferenceFieldUpdater, this, obj, SelectKt.f66967d));
        List<SelectImplementation<R>.C15494a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C15494a) it.next()).m94325b();
        }
        this.internalResult = SelectKt.f66968e;
        this.clauses = null;
    }

    @Override // p149l.bde0
    /* JADX INFO: renamed from: b */
    public void mo94308b(@NotNull l4e disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // p149l.rce0
    /* JADX INFO: renamed from: c */
    public void mo94309c(@NotNull sce0 sce0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        m94305x(this, new C15494a(sce0Var.getClauseObject(), sce0Var.mo187984c(), sce0Var.mo187983b(), SelectKt.m94337i(), function1, sce0Var.mo187982a()), false, 1, null);
    }

    @Override // p149l.bde0
    /* JADX INFO: renamed from: d */
    public void mo94310d(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // p149l.rce0
    /* JADX INFO: renamed from: e */
    public <Q> void mo94311e(@NotNull uce0<? extends Q> uce0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        m94305x(this, new C15494a(uce0Var.getClauseObject(), uce0Var.mo187984c(), uce0Var.mo187983b(), null, function2, uce0Var.mo187982a()), false, 1, null);
    }

    @Override // p149l.bde0
    /* JADX INFO: renamed from: f */
    public boolean mo94312f(@NotNull Object clauseObject, @Nullable Object result) {
        return m94306A(clauseObject, result) == 0;
    }

    @Override // p149l.ofp0
    /* JADX INFO: renamed from: g */
    public void mo93765g(@NotNull mce0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // p149l.bde0
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: m */
    public final void m94313m(Object clauseObject) {
        List<SelectImplementation<R>.C15494a> list = this.clauses;
        list.getClass();
        List<SelectImplementation<R>.C15494a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((C15494a) it.next()).clauseObject == clauseObject) {
                ddk0.m111027a("Cannot use select clauses on the same object: ", clauseObject);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m94314n(SelectImplementation<R>.C15494a selectedClause) {
        List<SelectImplementation<R>.C15494a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.C15494a c15494a : list) {
            if (c15494a != selectedClause) {
                c15494a.m94325b();
            }
        }
        f66949f.set(this, SelectKt.f66966c);
        this.internalResult = SelectKt.f66968e;
        this.clauses = null;
    }

    /* JADX INFO: renamed from: o */
    public final Object m94315o(Continuation<? super R> continuation) {
        Object obj = f66949f.get(this);
        obj.getClass();
        SelectImplementation<R>.C15494a c15494a = (C15494a) obj;
        Object obj2 = this.internalResult;
        m94314n(c15494a);
        return c15494a.m94326c(c15494a.m94327d(obj2), continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo94316p(@NotNull Continuation<? super R> continuation) {
        return m94303q(this, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m94317r(Continuation<? super R> continuation) throws Throwable {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        if (continuation instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuation;
            int i = selectImplementation$doSelectSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
        }
        Object obj = selectImplementation$doSelectSuspend$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = selectImplementation$doSelectSuspend$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            selectImplementation$doSelectSuspend$1.L$0 = this;
            selectImplementation$doSelectSuspend$1.label = 1;
            if (m94307B(selectImplementation$doSelectSuspend$1) != objM196133e) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
        ResultKt.m87239b(obj);
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        Object objM94315o = this.m94315o(selectImplementation$doSelectSuspend$1);
        return objM94315o == objM196133e ? objM196133e : objM94315o;
    }

    /* JADX INFO: renamed from: s */
    public final SelectImplementation<R>.C15494a m94318s(Object clauseObject) {
        List<SelectImplementation<R>.C15494a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((C15494a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        SelectImplementation<R>.C15494a c15494a = (C15494a) obj;
        if (c15494a != null) {
            return c15494a;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: renamed from: u */
    public final boolean m94319u() {
        return f66949f.get(this) instanceof C15494a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m94320v(SelectImplementation<R>.C15494a c15494a, Object obj, Continuation<? super R> continuation) throws Throwable {
        C15495xf491fb2a c15495xf491fb2a;
        if (continuation instanceof C15495xf491fb2a) {
            c15495xf491fb2a = (C15495xf491fb2a) continuation;
            int i = c15495xf491fb2a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15495xf491fb2a.label = i - Integer.MIN_VALUE;
            } else {
                c15495xf491fb2a = new C15495xf491fb2a(this, continuation);
            }
        } else {
            c15495xf491fb2a = new C15495xf491fb2a(this, continuation);
        }
        Object obj2 = c15495xf491fb2a.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c15495xf491fb2a.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.m87239b(obj2);
                return obj2;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj2);
        Object objM94327d = c15494a.m94327d(obj);
        c15495xf491fb2a.label = 1;
        Object objM94326c = c15494a.m94326c(objM94327d, c15495xf491fb2a);
        return objM94326c == objM196133e ? objM196133e : objM94326c;
    }

    @JvmName
    /* JADX INFO: renamed from: w */
    public final void m94321w(@NotNull SelectImplementation<R>.C15494a c15494a, boolean z) {
        if (f66949f.get(this) instanceof C15494a) {
            return;
        }
        if (!z) {
            m94313m(c15494a.clauseObject);
        }
        if (!c15494a.m94328e(this)) {
            f66949f.set(this, c15494a);
            return;
        }
        if (!z) {
            List<SelectImplementation<R>.C15494a> list = this.clauses;
            list.getClass();
            list.add(c15494a);
        }
        c15494a.disposableHandleOrSegment = this.disposableHandleOrSegment;
        c15494a.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    /* JADX INFO: renamed from: y */
    public final void m94322y(Object clauseObject) {
        SelectImplementation<R>.C15494a c15494aM94318s = m94318s(clauseObject);
        c15494aM94318s.getClass();
        c15494aM94318s.disposableHandleOrSegment = null;
        c15494aM94318s.indexInSegment = -1;
        m94321w(c15494aM94318s, true);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final TrySelectDetailedResult m94323z(@NotNull Object clauseObject, @Nullable Object result) {
        return SelectKt.m94329a(m94306A(clauseObject, result));
    }
}
