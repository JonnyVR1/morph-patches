package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p122io.CloseableKt;
import kotlinx.coroutines.sync.MutexKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bre0;
import p153l.dmc0;
import p153l.drb;
import p153l.eoi;
import p153l.frb;
import p153l.fui;
import p153l.gtj0;
import p153l.kum;
import p153l.l3g0;
import p153l.l6f;
import p153l.mo5;
import p153l.o6c;
import p153l.oo5;
import p153l.p7f;
import p153l.q3g0;
import p153l.q4c;
import p153l.u120;
import p153l.uyp;
import p153l.vh3;
import p153l.w120;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 W*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001a35B\u0081\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012?\b\u0002\u0010\u0011\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u001a\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010(J\u0013\u0010\u0018\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010(J\u0013\u0010*\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010(J\u0013\u0010+\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010(JN\u0010.\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010-\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR&\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0H8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010MRR\u0010Q\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010PR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", p7f.GPS_DIRECTION_TRUE, "Ll/o6c;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/bre0;", "serializer", "", "Lkotlin/Function2;", "Ll/kum;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Ll/frb;", "corruptionHandler", "Ll/drb;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Ll/bre0;Ljava/util/List;Ll/frb;Ll/drb;)V", Constants.KEY_T, "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", BaseSei.f14626Z, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "read", "r", "(Landroidx/datastore/core/SingleProcessDataStore$b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "update", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroidx/datastore/core/SingleProcessDataStore$b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ResourceDirection.f39656v, BaseSei.f14624X, "w", "Lkotlin/coroutines/CoroutineContext;", "callerContext", BaseSei.f14625Y, "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Ljava/io/File;)V", "Lkotlin/jvm/functions/Function0;", "b", "Ll/bre0;", "c", "Ll/frb;", Constants.INAPP_DATA_TAG, "Ll/drb;", "Ll/aui;", "e", "Ll/aui;", "getData", "()Ll/aui;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lkotlin/Lazy;", "q", "()Ljava/io/File;", "file", "Ll/u120;", "Ll/l3g0;", "h", "Ll/u120;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "initTasks", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$b;", "j", "Landroidx/datastore/core/SimpleActor;", Careers.actor, "Companion", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class SingleProcessDataStore<T> implements o6c<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @GuardedBy("activeFilesLock")
    @NotNull
    public static final Set<String> f1509k = new LinkedHashSet();

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Object f1510l = new Object();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<File> produceFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bre0<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final frb<T> corruptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final drb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final aui<T> data;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String SCRATCH_SUFFIX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy file;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final u120<l3g0<T>> downstreamFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends Function2<? super kum<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final SimpleActor<AbstractC0268b<T>> actor;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore$a;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<String> m1426a() {
            return SingleProcessDataStore.f1509k;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Object m1427b() {
            return SingleProcessDataStore.f1510l;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b;", p7f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "a", "b", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static abstract class AbstractC0268b<T> {

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$a */
        @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$a;", p7f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Ll/l3g0;", "lastState", "<init>", "(Ll/l3g0;)V", "a", "Ll/l3g0;", "()Ll/l3g0;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class a<T> extends AbstractC0268b<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final l3g0<T> lastState;

            public a(@Nullable l3g0<T> l3g0Var) {
                super(null);
                this.lastState = l3g0Var;
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public l3g0<T> m1428a() {
                return this.lastState;
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$b */
        @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011RE\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$b;", p7f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_T, "Lkotlin/coroutines/Continuation;", "", "transform", "Ll/mo5;", "ack", "Ll/l3g0;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Ll/mo5;Ll/l3g0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", Constants.INAPP_DATA_TAG, "()Lkotlin/jvm/functions/Function2;", "b", "Ll/mo5;", "()Ll/mo5;", "c", "Ll/l3g0;", "()Ll/l3g0;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
        public static final class b<T> extends AbstractC0268b<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Function2<T, Continuation<? super T>, Object> transform;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final mo5<T> ack;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final l3g0<T> lastState;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final CoroutineContext callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull mo5<T> mo5Var, @Nullable l3g0<T> l3g0Var, @NotNull CoroutineContext coroutineContext) {
                super(null);
                function2.getClass();
                mo5Var.getClass();
                coroutineContext.getClass();
                this.transform = function2;
                this.ack = mo5Var;
                this.lastState = l3g0Var;
                this.callerContext = coroutineContext;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final mo5<T> m1429a() {
                return this.ack;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public l3g0<T> m1431c() {
                return this.lastState;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function2<T, Continuation<? super T>, Object> m1432d() {
                return this.transform;
            }
        }

        public /* synthetic */ AbstractC0268b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0268b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull Function0<? extends File> function0, @NotNull bre0<T> bre0Var, @NotNull List<? extends Function2<? super kum<T>, ? super Continuation<? super Unit>, ? extends Object>> list, @NotNull frb<T> frbVar, @NotNull drb drbVar) {
        function0.getClass();
        bre0Var.getClass();
        list.getClass();
        frbVar.getClass();
        drbVar.getClass();
        this.produceFile = function0;
        this.serializer = bre0Var;
        this.corruptionHandler = frbVar;
        this.scope = drbVar;
        this.data = fui.m127499w(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt__LazyJVMKt.m88118b(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File file = (File) this.this$0.produceFile.invoke();
                String absolutePath = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.m1427b()) {
                    if (companion.m1426a().contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> setM1426a = companion.m1426a();
                    absolutePath.getClass();
                    setM1426a.add(absolutePath);
                }
                return file;
            }
        });
        this.downstreamFlow = q3g0.m175121a(gtj0.INSTANCE);
        this.initTasks = CollectionsKt.toList(list);
        this.actor = new SimpleActor<>(drbVar, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    this.this$0.downstreamFlow.setValue(new eoi(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object objM1427b = companion.m1427b();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (objM1427b) {
                    companion.m1426a().remove(singleProcessDataStore.m1416q().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        }, new Function2<AbstractC0268b<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            public final void invoke(@NotNull SingleProcessDataStore.AbstractC0268b<T> abstractC0268b, @Nullable Throwable th) {
                abstractC0268b.getClass();
                if (abstractC0268b instanceof SingleProcessDataStore.AbstractC0268b.b) {
                    mo5<T> mo5VarM1429a = ((SingleProcessDataStore.AbstractC0268b.b) abstractC0268b).m1429a();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    mo5VarM1429a.mo159236g(th);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.AbstractC0268b) obj, th);
                return Unit.INSTANCE;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    @Override // p153l.o6c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo1414a(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        mo5 mo5VarM168566b = oo5.m168566b(null, 1, null);
        this.actor.m1399e(new AbstractC0268b.b(function2, mo5VarM168566b, this.downstreamFlow.getValue(), continuation.getContext()));
        return mo5VarM168566b.mo164041t(continuation);
    }

    @Override // p153l.o6c
    @NotNull
    public aui<T> getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: p */
    public final void m1415p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        zpg0.m220844a(Intrinsics.m88385l("Unable to create parent directories of ", file));
    }

    /* JADX INFO: renamed from: q */
    public final File m1416q() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final Object m1417r(AbstractC0268b.a<T> aVar, Continuation<? super Unit> continuation) throws Throwable {
        l3g0<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof q4c)) {
            if (value instanceof dmc0) {
                if (value == aVar.m1428a()) {
                    Object objM1421v = m1421v(continuation);
                    return objM1421v == uyp.m198688e() ? objM1421v : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.m88377d(value, gtj0.INSTANCE)) {
                    Object objM1421v2 = m1421v(continuation);
                    return objM1421v2 == uyp.m198688e() ? objM1421v2 : Unit.INSTANCE;
                }
                if (value instanceof eoi) {
                    wtq0.m207906a("Can't read in final state.");
                    return null;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r9 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.mo5] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1418s(AbstractC0268b.b<T> bVar, Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        Object objM225066constructorimpl;
        ?? r9;
        mo5<T> mo5VarM1429a;
        Object objM1424y;
        ?? r10;
        if (continuation instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuation;
            int i = singleProcessDataStore$handleUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
            }
        } else {
            singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
        }
        Object obj = singleProcessDataStore$handleUpdate$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$handleUpdate$1.label;
        boolean z = true;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        mo5<T> mo5Var = (mo5) singleProcessDataStore$handleUpdate$1.L$2;
                        SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.L$1;
                        AbstractC0268b.b<T> bVar2 = (AbstractC0268b.b) singleProcessDataStore$handleUpdate$1.L$0;
                        ResultKt.m88128b(obj);
                        mo5VarM1429a = mo5Var;
                        boolean z2 = (SingleProcessDataStore<T>) singleProcessDataStore;
                        bVar = bVar2;
                        r10 = z2;
                    } else if (i2 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                boolean z3 = (SingleProcessDataStore<T>) ((mo5) singleProcessDataStore$handleUpdate$1.L$0);
                ResultKt.m88128b(obj);
                this = z3;
                objM225066constructorimpl = Result.m225066constructorimpl(obj);
                r9 = this;
                oo5.m168567c(r9, objM225066constructorimpl);
                return Unit.INSTANCE;
            }
            ResultKt.m88128b(obj);
            mo5VarM1429a = bVar.m1429a();
            try {
                Result.Companion companion = Result.INSTANCE;
                l3g0<T> value = this.downstreamFlow.getValue();
                if (value instanceof q4c) {
                    Function2<T, Continuation<? super T>, Object> function2M1432d = bVar.m1432d();
                    CoroutineContext callerContext = bVar.getCallerContext();
                    singleProcessDataStore$handleUpdate$1.L$0 = mo5VarM1429a;
                    singleProcessDataStore$handleUpdate$1.label = 1;
                    objM1424y = m1424y(function2M1432d, callerContext, singleProcessDataStore$handleUpdate$1);
                    if (objM1424y == objM198688e) {
                    }
                    mo5<T> mo5Var2 = mo5VarM1429a;
                    obj = objM1424y;
                    this = (SingleProcessDataStore<T>) mo5Var2;
                    objM225066constructorimpl = Result.m225066constructorimpl(obj);
                    r9 = this;
                    oo5.m168567c(r9, objM225066constructorimpl);
                    return Unit.INSTANCE;
                }
                if (!(value instanceof dmc0)) {
                    z = value instanceof gtj0;
                }
                if (!z) {
                    if (value instanceof eoi) {
                        throw ((eoi) value).getFinalException();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (value != bVar.m1431c()) {
                    throw ((dmc0) value).getReadException();
                }
                singleProcessDataStore$handleUpdate$1.L$0 = bVar;
                singleProcessDataStore$handleUpdate$1.L$1 = this;
                singleProcessDataStore$handleUpdate$1.L$2 = mo5VarM1429a;
                singleProcessDataStore$handleUpdate$1.label = 2;
                if (m1420u(singleProcessDataStore$handleUpdate$1) == objM198688e) {
                    this = this;
                }
                return objM198688e;
            } catch (Throwable th) {
                th = th;
                this = mo5VarM1429a;
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
                r9 = this;
            }
            this = this;
            Function2<T, Continuation<? super T>, Object> function2M1432d2 = bVar.m1432d();
            CoroutineContext callerContext2 = bVar.getCallerContext();
            singleProcessDataStore$handleUpdate$1.L$0 = mo5VarM1429a;
            singleProcessDataStore$handleUpdate$1.L$1 = null;
            singleProcessDataStore$handleUpdate$1.L$2 = null;
            singleProcessDataStore$handleUpdate$1.label = 3;
            objM1424y = r10.m1424y(function2M1432d2, callerContext2, singleProcessDataStore$handleUpdate$1);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:34:0x00dc->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX INFO: renamed from: t */
    public final Object m1419t(Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        w120 w120VarM95255b;
        ?? r9;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef;
        Iterator<T> it;
        w120 w120Var;
        ?? r11;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        w120 w120Var2;
        ?? r0;
        Ref.BooleanRef booleanRef2;
        Function2 function2;
        ?? r1;
        if (continuation instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuation;
            int i = singleProcessDataStore$readAndInit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
        }
        T t = (T) singleProcessDataStore$readAndInit$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readAndInit$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(t);
            if (!(Intrinsics.m88377d(this.downstreamFlow.getValue(), gtj0.INSTANCE) || (this.downstreamFlow.getValue() instanceof dmc0))) {
                wtq0.m207906a("Check failed.");
                return null;
            }
            w120VarM95255b = MutexKt.m95255b(false, 1, null);
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            singleProcessDataStore$readAndInit$1.L$0 = this;
            singleProcessDataStore$readAndInit$1.L$1 = w120VarM95255b;
            singleProcessDataStore$readAndInit$1.L$2 = objectRef4;
            singleProcessDataStore$readAndInit$1.L$3 = objectRef4;
            singleProcessDataStore$readAndInit$1.label = 1;
            Object objM1423x = m1423x(singleProcessDataStore$readAndInit$1);
            if (objM1423x != objM198688e) {
                r9 = this;
                objectRef = objectRef4;
                t = (T) objM1423x;
                objectRef2 = objectRef;
            }
            return objM198688e;
        }
        if (i2 == 1) {
            objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
            objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
            w120VarM95255b = (w120) singleProcessDataStore$readAndInit$1.L$1;
            SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
            ResultKt.m88128b(t);
            r9 = singleProcessDataStore;
        } else {
            if (i2 == 2) {
                it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                objectRef3 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                w120Var = (w120) singleProcessDataStore$readAndInit$1.L$1;
                SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                ResultKt.m88128b(t);
                r11 = singleProcessDataStore2;
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    singleProcessDataStore$readAndInit$1.L$0 = r11;
                    singleProcessDataStore$readAndInit$1.L$1 = w120Var;
                    singleProcessDataStore$readAndInit$1.L$2 = objectRef3;
                    singleProcessDataStore$readAndInit$1.L$3 = booleanRef;
                    singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                    singleProcessDataStore$readAndInit$1.L$5 = it;
                    singleProcessDataStore$readAndInit$1.label = 2;
                    if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objM198688e) {
                        return objM198688e;
                    }
                }
                objectRef2 = objectRef3;
                w120Var2 = w120Var;
                r0 = r11;
                r0.initTasks = null;
                singleProcessDataStore$readAndInit$1.L$0 = r0;
                singleProcessDataStore$readAndInit$1.L$1 = objectRef2;
                singleProcessDataStore$readAndInit$1.L$2 = booleanRef;
                singleProcessDataStore$readAndInit$1.L$3 = w120Var2;
                singleProcessDataStore$readAndInit$1.L$4 = null;
                singleProcessDataStore$readAndInit$1.L$5 = null;
                singleProcessDataStore$readAndInit$1.label = 3;
                if (w120Var2.mo95247c(null, singleProcessDataStore$readAndInit$1) != objM198688e) {
                    booleanRef2 = booleanRef;
                    r1 = r0;
                }
                return objM198688e;
            }
            if (i2 != 3) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w120Var2 = (w120) singleProcessDataStore$readAndInit$1.L$3;
            booleanRef2 = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
            objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
            SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
            ResultKt.m88128b(t);
            r1 = singleProcessDataStore3;
        }
        try {
            booleanRef2.element = true;
            Unit unit = Unit.INSTANCE;
            w120Var2.mo95248d(null);
            u120<l3g0<T>> u120Var = r1.downstreamFlow;
            T t2 = objectRef2.element;
            u120Var.setValue(new q4c(t2, t2 != null ? t2.hashCode() : 0));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            w120Var2.mo95248d(null);
            throw th;
        }
        objectRef.element = t;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(w120VarM95255b, booleanRef3, objectRef2, r9);
        List<? extends Function2<? super kum<T>, ? super Continuation<? super Unit>, ? extends Object>> list = r9.initTasks;
        if (list == null) {
            w120 w120Var3 = w120VarM95255b;
            booleanRef = booleanRef3;
            w120Var2 = w120Var3;
            r0 = r9;
        } else {
            w120 w120Var4 = w120VarM95255b;
            booleanRef = booleanRef3;
            it = list.iterator();
            w120Var = w120Var4;
            r11 = r9;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                singleProcessDataStore$readAndInit$1.L$0 = r11;
                singleProcessDataStore$readAndInit$1.L$1 = w120Var;
                singleProcessDataStore$readAndInit$1.L$2 = objectRef3;
                singleProcessDataStore$readAndInit$1.L$3 = booleanRef;
                singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                singleProcessDataStore$readAndInit$1.L$5 = it;
                singleProcessDataStore$readAndInit$1.label = 2;
                if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objM198688e) {
                    return objM198688e;
                }
            }
            objectRef2 = objectRef3;
            w120Var2 = w120Var;
            r0 = r11;
        }
        r0.initTasks = null;
        singleProcessDataStore$readAndInit$1.L$0 = r0;
        singleProcessDataStore$readAndInit$1.L$1 = objectRef2;
        singleProcessDataStore$readAndInit$1.L$2 = booleanRef;
        singleProcessDataStore$readAndInit$1.L$3 = w120Var2;
        singleProcessDataStore$readAndInit$1.L$4 = null;
        singleProcessDataStore$readAndInit$1.L$5 = null;
        singleProcessDataStore$readAndInit$1.label = 3;
        if (w120Var2.mo95247c(null, singleProcessDataStore$readAndInit$1) != objM198688e) {
            booleanRef2 = booleanRef;
            r1 = r0;
            booleanRef2.element = true;
            Unit unit2 = Unit.INSTANCE;
            w120Var2.mo95248d(null);
            u120<l3g0<T>> u120Var2 = r1.downstreamFlow;
            T t3 = objectRef2.element;
            u120Var2.setValue(new q4c(t3, t3 != null ? t3.hashCode() : 0));
            return Unit.INSTANCE;
        }
        return objM198688e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m1420u(Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuation;
            int i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                if (m1419t(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            this = (SingleProcessDataStore<T>) Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.downstreamFlow.setValue(new dmc0(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: v */
    public final Object m1421v(Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuation;
            int i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
        }
        Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                Object objM1419t = m1419t(singleProcessDataStore$readAndInitOrPropagateFailure$1);
                this = objM1419t;
                if (objM1419t == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = (SingleProcessDataStore<T>) ((SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0);
                ResultKt.m88128b(obj);
                this = z;
            }
        } catch (Throwable th) {
            this.downstreamFlow.setValue(new dmc0(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.bre0, l.bre0<T>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public final Object m1422w(Continuation<? super T> continuation) throws Throwable {
        ?? singleProcessDataStore$readData$1;
        Closeable closeable;
        Throwable th;
        if (continuation instanceof SingleProcessDataStore$readData$1) {
            SingleProcessDataStore$readData$1 singleProcessDataStore$readData$2 = (SingleProcessDataStore$readData$1) continuation;
            int i = singleProcessDataStore$readData$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readData$2.label = i - Integer.MIN_VALUE;
                singleProcessDataStore$readData$1 = singleProcessDataStore$readData$2;
            } else {
                singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, continuation);
        }
        Object obj = singleProcessDataStore$readData$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readData$1.label;
        Throwable th2 = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th2 = (Throwable) singleProcessDataStore$readData$1.L$2;
                closeable = (Closeable) singleProcessDataStore$readData$1.L$1;
                singleProcessDataStore$readData$1 = (SingleProcessDataStore) singleProcessDataStore$readData$1.L$0;
                try {
                    ResultKt.m88128b(obj);
                    CloseableKt.m88293a(closeable, th2);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.m88293a(closeable, th);
                        throw th4;
                    }
                }
            }
            ResultKt.m88128b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(m1416q());
                try {
                    bre0<T> bre0Var = this.serializer;
                    singleProcessDataStore$readData$1.L$0 = this;
                    singleProcessDataStore$readData$1.L$1 = fileInputStream;
                    singleProcessDataStore$readData$1.L$2 = null;
                    singleProcessDataStore$readData$1.label = 1;
                    Object objMo106132c = bre0Var.mo106132c(fileInputStream, singleProcessDataStore$readData$1);
                    if (objMo106132c == objM198688e) {
                        return objM198688e;
                    }
                    closeable = fileInputStream;
                    obj = objMo106132c;
                    CloseableKt.m88293a(closeable, th2);
                    return obj;
                } catch (Throwable th5) {
                    singleProcessDataStore$readData$1 = this;
                    closeable = fileInputStream;
                    th = th5;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                singleProcessDataStore$readData$1 = this;
                e = e;
                if (singleProcessDataStore$readData$1.m1416q().exists()) {
                    throw e;
                }
                return singleProcessDataStore$readData$1.serializer.mo106130a();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m1423x(Continuation<? super T> continuation) throws Throwable {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        SingleProcessDataStore singleProcessDataStore;
        CorruptionException corruptionException;
        CorruptionException corruptionException2;
        IOException e;
        if (continuation instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuation;
            int i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
        }
        Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.m88128b(obj);
                    return obj;
                }
                if (i2 == 2) {
                    corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                    SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    ResultKt.m88128b(obj);
                    singleProcessDataStore = singleProcessDataStore2;
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        if (singleProcessDataStore.m1425z(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != objM198688e) {
                            return obj;
                        }
                    } catch (IOException e2) {
                        corruptionException2 = corruptionException;
                        e = e2;
                    }
                } else {
                    if (i2 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                    corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.m88128b(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                l6f.m153058a(corruptionException2, e);
                throw corruptionException2;
            }
            ResultKt.m88128b(obj);
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
            Object objM1422w = m1422w(singleProcessDataStore$readDataOrHandleCorruption$1);
            if (objM1422w != objM198688e) {
                return objM1422w;
            }
        } catch (CorruptionException e4) {
            frb<T> frbVar = this.corruptionHandler;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e4;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
            Object objMo112444a = frbVar.mo112444a(e4, singleProcessDataStore$readDataOrHandleCorruption$1);
            if (objMo112444a != objM198688e) {
                singleProcessDataStore = this;
                corruptionException = e4;
                obj = objMo112444a;
            }
            return objM198688e;
        }
        return objM198688e;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m1424y(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) throws Throwable {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        q4c q4cVar;
        SingleProcessDataStore singleProcessDataStore;
        Object obj;
        SingleProcessDataStore singleProcessDataStore2;
        Object obj2;
        int iHashCode;
        if (continuation instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuation;
            int i = singleProcessDataStore$transformAndWrite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
            }
        } else {
            singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
        }
        Object obj3 = singleProcessDataStore$transformAndWrite$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$transformAndWrite$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj3);
            q4c q4cVar2 = (q4c) this.downstreamFlow.getValue();
            q4cVar2.m175207a();
            Object objM175208b = q4cVar2.m175208b();
            SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, objM175208b, null);
            singleProcessDataStore$transformAndWrite$1.L$0 = this;
            singleProcessDataStore$transformAndWrite$1.L$1 = q4cVar2;
            singleProcessDataStore$transformAndWrite$1.L$2 = objM175208b;
            singleProcessDataStore$transformAndWrite$1.label = 1;
            Object objM201255g = vh3.m201255g(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
            if (objM201255g != objM198688e) {
                obj3 = objM201255g;
                q4cVar = q4cVar2;
                singleProcessDataStore = this;
                obj = objM175208b;
            }
            return objM198688e;
        }
        if (i2 == 1) {
            obj = singleProcessDataStore$transformAndWrite$1.L$2;
            q4cVar = (q4c) singleProcessDataStore$transformAndWrite$1.L$1;
            SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
            ResultKt.m88128b(obj3);
            singleProcessDataStore = singleProcessDataStore3;
        } else {
            if (i2 != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = singleProcessDataStore$transformAndWrite$1.L$1;
            SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
            ResultKt.m88128b(obj3);
            singleProcessDataStore2 = singleProcessDataStore4;
        }
        u120<l3g0<T>> u120Var = singleProcessDataStore2.downstreamFlow;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        u120Var.setValue(new q4c(obj2, iHashCode));
        return obj2;
        q4cVar.m175207a();
        if (Intrinsics.m88377d(obj, obj3)) {
            return obj;
        }
        singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
        singleProcessDataStore$transformAndWrite$1.L$1 = obj3;
        singleProcessDataStore$transformAndWrite$1.L$2 = null;
        singleProcessDataStore$transformAndWrite$1.label = 2;
        if (singleProcessDataStore.m1425z(obj3, singleProcessDataStore$transformAndWrite$1) != objM198688e) {
            singleProcessDataStore2 = singleProcessDataStore;
            obj2 = obj3;
            u120<l3g0<T>> u120Var2 = singleProcessDataStore2.downstreamFlow;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            u120Var2.setValue(new q4c(obj2, iHashCode));
            return obj2;
        }
        return objM198688e;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.StringBuilder] */
    @Nullable
    /* JADX INFO: renamed from: z */
    public final Object m1425z(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        Closeable closeable;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream;
        if (continuation instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
            int i = singleProcessDataStore$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        ?? M198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$writeData$1.label;
        Throwable th = null;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                m1415p(m1416q());
                file = new File(Intrinsics.m88385l(m1416q().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream((File) file);
                    try {
                        bre0<T> bre0Var = this.serializer;
                        C0269c c0269c = new C0269c(fileOutputStream2);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream2;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream2;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (bre0Var.mo106131b(t, c0269c, singleProcessDataStore$writeData$1) == M198688e) {
                            return M198688e;
                        }
                        singleProcessDataStore = this;
                        M198688e = file;
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        M198688e = file;
                        closeable = fileOutputStream2;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                closeable = (Closeable) singleProcessDataStore$writeData$1.L$2;
                M198688e = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    ResultKt.m88128b(obj);
                    M198688e = M198688e;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.m88293a(closeable, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.m88293a(closeable, th);
            if (M198688e.renameTo(singleProcessDataStore.m1416q())) {
                return Unit.INSTANCE;
            }
            throw new IOException("Unable to rename " + M198688e + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = M198688e;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$c */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Landroidx/datastore/core/SingleProcessDataStore$c;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "", "write", "(I)V", "", "([B)V", HttpHeaderValues.BYTES, BLiveOperationTitleShowType.off, "len", "([BII)V", "close", "()V", "flush", "a", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C0269c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final FileOutputStream fileOutputStream;

        public C0269c(@NotNull FileOutputStream fileOutputStream) {
            fileOutputStream.getClass();
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] b) throws IOException {
            b.getClass();
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bytes, int off, int len) throws IOException {
            bytes.getClass();
            this.fileOutputStream.write(bytes, off, len);
        }
    }
}
