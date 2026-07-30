package kotlinx.coroutines.selects;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.InterfaceC15513b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.ag4;
import p153l.cg4;
import p153l.gle0;
import p153l.hle0;
import p153l.jmk0;
import p153l.mpq;
import p153l.pr3;
import p153l.rke0;
import p153l.uyp;
import p153l.wke0;
import p153l.wtq0;
import p153l.xke0;
import p153l.z5e;
import p153l.zke0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001BB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0019\u0010\nJ,\u0010\u001b\u001a\u00028\u00002\u0010\u0010\u001a\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\r2\u0010\u0010\u001d\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00028\u0000H\u0091@¢\u0006\u0004\b \u0010\nJ2\u0010%\u001a\u00020\r*\u00020!2\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\"H\u0096\u0002¢\u0006\u0004\b%\u0010&JD\u0010*\u001a\u00020\r\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00010(2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0)H\u0096\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\r*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J#\u00107\u001a\u00020\r2\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b9\u0010\u000fJ!\u0010;\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bE\u0010FR(\u0010I\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010JR\u0016\u0010M\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010LR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010P\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0Q8\u0002X\u0082\u0004¨\u0006S"}, m88121d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/b;", "Ll/wke0;", "Ll/hle0;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clauseObject", "", "m", "(Ljava/lang/Object;)V", "B", BaseSei.f14625Y, "internalResult", "", "A", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lkotlinx/coroutines/selects/SelectImplementation$a;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/SelectImplementation$a;", "o", "clause", ResourceDirection.f39656v, "(Lkotlinx/coroutines/selects/SelectImplementation$a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedClause", "n", "(Lkotlinx/coroutines/selects/SelectImplementation$a;)V", "p", "Ll/xke0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Ll/xke0;Lkotlin/jvm/functions/Function1;)V", "Q", "Ll/zke0;", "Lkotlin/Function2;", "e", "(Ll/zke0;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "w", "(Lkotlinx/coroutines/selects/SelectImplementation$a;Z)V", "Ll/z5e;", "disposableHandle", "b", "(Ll/z5e;)V", "Ll/rke0;", "segment", FirebaseAnalytics.Param.INDEX, "g", "(Ll/rke0;I)V", Constants.INAPP_DATA_TAG, LovePlanetStage.result, "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", BaseSei.f14626Z, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "cause", "a", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "u", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public class SelectImplementation<R> implements InterfaceC15513b, wke0<R>, hle0<R> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67623f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f67639b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<SelectImplementation<R>.C15601a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int indexInSegment = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Object internalResult = SelectKt.f67642e;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    @Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¸\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%Rc\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&Rc\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%Ru\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010-\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$a;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/gle0;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "", "e", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", LovePlanetStage.result, Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "a", "(Ll/gle0;Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C15601a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function3<Object, gle0<?>, Object, Unit> regFunc;

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
        public final Function3<gle0<?>, Object, Object, Function1<Throwable, Unit>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public C15601a(@NotNull Object obj, @NotNull Function3<Object, ? super gle0<?>, Object, Unit> function3, @Nullable Function3<Object, Object, Object, ? extends Object> function4, @NotNull Object obj2, @Nullable Object obj3, Function3<? super gle0<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> function5) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function4;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function5;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Function1<Throwable, Unit> m95217a(@NotNull gle0<?> select, @Nullable Object internalResult) {
            Function3<gle0<?>, Object, Object, Function1<Throwable, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m95218b() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof rke0) {
                ((rke0) obj).mo172933s(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            z5e z5eVar = obj instanceof z5e ? (z5e) obj : null;
            if (z5eVar != null) {
                z5eVar.dispose();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m95219c(@Nullable Object obj, @NotNull Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == SelectKt.m95230i()) {
                obj2.getClass();
                return ((Function1) obj2).invoke(continuation);
            }
            obj2.getClass();
            return ((Function2) obj2).invoke(obj, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Object m95220d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m95221e(@NotNull SelectImplementation<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == SelectKt.f67642e;
        }
    }

    public SelectImplementation(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @PublishedApi
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ <R> Object m95196q(SelectImplementation<R> selectImplementation, Continuation<? super R> continuation) {
        return selectImplementation.m95212u() ? selectImplementation.m95208o(continuation) : selectImplementation.m95210r(continuation);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m95198x(SelectImplementation selectImplementation, C15601a c15601a, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: register");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.m95214w(c15601a, z);
    }

    /* JADX INFO: renamed from: A */
    public final int m95199A(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f67623f.get(this);
            if (obj instanceof ag4) {
                SelectImplementation<R>.C15601a c15601aM95211s = m95211s(clauseObject);
                if (c15601aM95211s == null) {
                    continue;
                } else {
                    Function1<Throwable, Unit> function1M95217a = c15601aM95211s.m95217a(this, internalResult);
                    if (C20511u7.m194801a(f67623f, this, obj, c15601aM95211s)) {
                        this.internalResult = internalResult;
                        if (SelectKt.m95231j((ag4) obj, function1M95217a)) {
                            return 0;
                        }
                        this.internalResult = SelectKt.f67642e;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.m88377d(obj, SelectKt.f67640c) ? true : obj instanceof C15601a) {
                    return 3;
                }
                if (Intrinsics.m88377d(obj, SelectKt.f67641d)) {
                    return 2;
                }
                if (Intrinsics.m88377d(obj, SelectKt.f67639b)) {
                    if (C20511u7.m194801a(f67623f, this, obj, CollectionsKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        mpq.m159379a("Unexpected state: ", obj);
                        return 0;
                    }
                    if (C20511u7.m194801a(f67623f, this, obj, CollectionsKt.plus((Collection<? extends Object>) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Object m95200B(Continuation<? super Unit> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67623f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f67639b) {
                if (C20511u7.m194801a(f67623f, this, obj, c15514c)) {
                    cg4.m109665c(c15514c, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof C15601a) {
                        c15514c.mo94656f(Unit.INSTANCE, ((C15601a) obj).m95217a(this, this.internalResult));
                        break;
                    }
                    mpq.m159379a("unexpected state: ", obj);
                    return null;
                }
                if (C20511u7.m194801a(f67623f, this, obj, SelectKt.f67639b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m95215y(it.next());
                    }
                }
            }
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15513b
    /* JADX INFO: renamed from: a */
    public void mo94629a(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67623f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f67640c) {
                return;
            }
        } while (!C20511u7.m194801a(atomicReferenceFieldUpdater, this, obj, SelectKt.f67641d));
        List<SelectImplementation<R>.C15601a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C15601a) it.next()).m95218b();
        }
        this.internalResult = SelectKt.f67642e;
        this.clauses = null;
    }

    @Override // p153l.gle0
    /* JADX INFO: renamed from: b */
    public void mo95201b(@NotNull z5e disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // p153l.wke0
    /* JADX INFO: renamed from: c */
    public void mo95202c(@NotNull xke0 xke0Var, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        m95198x(this, new C15601a(xke0Var.getClauseObject(), xke0Var.mo98659c(), xke0Var.mo98658b(), SelectKt.m95230i(), function1, xke0Var.mo98657a()), false, 1, null);
    }

    @Override // p153l.gle0
    /* JADX INFO: renamed from: d */
    public void mo95203d(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // p153l.wke0
    /* JADX INFO: renamed from: e */
    public <Q> void mo95204e(@NotNull zke0<? extends Q> zke0Var, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        m95198x(this, new C15601a(zke0Var.getClauseObject(), zke0Var.mo98659c(), zke0Var.mo98658b(), null, function2, zke0Var.mo98657a()), false, 1, null);
    }

    @Override // p153l.gle0
    /* JADX INFO: renamed from: f */
    public boolean mo95205f(@NotNull Object clauseObject, @Nullable Object result) {
        return m95199A(clauseObject, result) == 0;
    }

    @Override // p153l.sop0
    /* JADX INFO: renamed from: g */
    public void mo94657g(@NotNull rke0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // p153l.gle0
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: m */
    public final void m95206m(Object clauseObject) {
        List<SelectImplementation<R>.C15601a> list = this.clauses;
        list.getClass();
        List<SelectImplementation<R>.C15601a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((C15601a) it.next()).clauseObject == clauseObject) {
                jmk0.m146166a("Cannot use select clauses on the same object: ", clauseObject);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m95207n(SelectImplementation<R>.C15601a selectedClause) {
        List<SelectImplementation<R>.C15601a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.C15601a c15601a : list) {
            if (c15601a != selectedClause) {
                c15601a.m95218b();
            }
        }
        f67623f.set(this, SelectKt.f67640c);
        this.internalResult = SelectKt.f67642e;
        this.clauses = null;
    }

    /* JADX INFO: renamed from: o */
    public final Object m95208o(Continuation<? super R> continuation) {
        Object obj = f67623f.get(this);
        obj.getClass();
        SelectImplementation<R>.C15601a c15601a = (C15601a) obj;
        Object obj2 = this.internalResult;
        m95207n(c15601a);
        return c15601a.m95219c(c15601a.m95220d(obj2), continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo95209p(@NotNull Continuation<? super R> continuation) {
        return m95196q(this, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m95210r(Continuation<? super R> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = selectImplementation$doSelectSuspend$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            selectImplementation$doSelectSuspend$1.L$0 = this;
            selectImplementation$doSelectSuspend$1.label = 1;
            if (m95200B(selectImplementation$doSelectSuspend$1) != objM198688e) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
        ResultKt.m88128b(obj);
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        Object objM95208o = this.m95208o(selectImplementation$doSelectSuspend$1);
        return objM95208o == objM198688e ? objM198688e : objM95208o;
    }

    /* JADX INFO: renamed from: s */
    public final SelectImplementation<R>.C15601a m95211s(Object clauseObject) {
        List<SelectImplementation<R>.C15601a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((C15601a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        SelectImplementation<R>.C15601a c15601a = (C15601a) obj;
        if (c15601a != null) {
            return c15601a;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: renamed from: u */
    public final boolean m95212u() {
        return f67623f.get(this) instanceof C15601a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m95213v(SelectImplementation<R>.C15601a c15601a, Object obj, Continuation<? super R> continuation) throws Throwable {
        C15602xf491fb2a c15602xf491fb2a;
        if (continuation instanceof C15602xf491fb2a) {
            c15602xf491fb2a = (C15602xf491fb2a) continuation;
            int i = c15602xf491fb2a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15602xf491fb2a.label = i - Integer.MIN_VALUE;
            } else {
                c15602xf491fb2a = new C15602xf491fb2a(this, continuation);
            }
        } else {
            c15602xf491fb2a = new C15602xf491fb2a(this, continuation);
        }
        Object obj2 = c15602xf491fb2a.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c15602xf491fb2a.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.m88128b(obj2);
                return obj2;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj2);
        Object objM95220d = c15601a.m95220d(obj);
        c15602xf491fb2a.label = 1;
        Object objM95219c = c15601a.m95219c(objM95220d, c15602xf491fb2a);
        return objM95219c == objM198688e ? objM198688e : objM95219c;
    }

    @JvmName
    /* JADX INFO: renamed from: w */
    public final void m95214w(@NotNull SelectImplementation<R>.C15601a c15601a, boolean z) {
        if (f67623f.get(this) instanceof C15601a) {
            return;
        }
        if (!z) {
            m95206m(c15601a.clauseObject);
        }
        if (!c15601a.m95221e(this)) {
            f67623f.set(this, c15601a);
            return;
        }
        if (!z) {
            List<SelectImplementation<R>.C15601a> list = this.clauses;
            list.getClass();
            list.add(c15601a);
        }
        c15601a.disposableHandleOrSegment = this.disposableHandleOrSegment;
        c15601a.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    /* JADX INFO: renamed from: y */
    public final void m95215y(Object clauseObject) {
        SelectImplementation<R>.C15601a c15601aM95211s = m95211s(clauseObject);
        c15601aM95211s.getClass();
        c15601aM95211s.disposableHandleOrSegment = null;
        c15601aM95211s.indexInSegment = -1;
        m95214w(c15601aM95211s, true);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final TrySelectDetailedResult m95216z(@NotNull Object clauseObject, @Nullable Object result) {
        return SelectKt.m95222a(m95199A(clauseObject, result));
    }
}
