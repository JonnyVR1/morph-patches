package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.p118io.CloseableKt;
import kotlinx.coroutines.sync.MutexKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cvf0;
import p149l.dkj0;
import p149l.eri;
import p149l.h3c;
import p149l.h5f;
import p149l.hh3;
import p149l.hvf0;
import p149l.i5c;
import p149l.ili;
import p149l.in5;
import p149l.ism;
import p149l.j6f;
import p149l.jri;
import p149l.kn5;
import p149l.mt10;
import p149l.ot10;
import p149l.ppb;
import p149l.qkq0;
import p149l.rhg0;
import p149l.rpb;
import p149l.uwp;
import p149l.wdc0;
import p149l.wie0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 W*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001a35B\u0081\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012?\b\u0002\u0010\u0011\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u001a\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010(J\u0013\u0010\u0018\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010(J\u0013\u0010*\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010(J\u0013\u0010+\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010(JN\u0010.\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010-\u001a\u00020,H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR&\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0H8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010MRR\u0010Q\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010PR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", j6f.GPS_DIRECTION_TRUE, "Ll/i5c;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Ll/wie0;", "serializer", "", "Lkotlin/Function2;", "Ll/ism;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Ll/rpb;", "corruptionHandler", "Ll/ppb;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Ll/wie0;Ljava/util/List;Ll/rpb;Ll/ppb;)V", Constants.KEY_T, "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", BaseSei.f13932Z, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "read", "r", "(Landroidx/datastore/core/SingleProcessDataStore$b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "update", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroidx/datastore/core/SingleProcessDataStore$b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ResourceDirection.f38808v, BaseSei.f13930X, "w", "Lkotlin/coroutines/CoroutineContext;", "callerContext", BaseSei.f13931Y, "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Ljava/io/File;)V", "Lkotlin/jvm/functions/Function0;", "b", "Ll/wie0;", "c", "Ll/rpb;", Constants.INAPP_DATA_TAG, "Ll/ppb;", "Ll/eri;", "e", "Ll/eri;", "getData", "()Ll/eri;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lkotlin/Lazy;", "q", "()Ljava/io/File;", "file", "Ll/mt10;", "Ll/cvf0;", "h", "Ll/mt10;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "initTasks", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$b;", "j", "Landroidx/datastore/core/SimpleActor;", Careers.actor, "Companion", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class SingleProcessDataStore<T> implements i5c<T> {

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
    public final wie0<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final rpb<T> corruptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ppb scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final eri<T> data;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String SCRATCH_SUFFIX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy file;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final mt10<cvf0<T>> downstreamFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends Function2<? super ism<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final SimpleActor<AbstractC0267b<T>> actor;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore$a;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<String> m1425a() {
            return SingleProcessDataStore.f1509k;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Object m1426b() {
            return SingleProcessDataStore.f1510l;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b;", j6f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "a", "b", "Landroidx/datastore/core/SingleProcessDataStore$b$a;", "Landroidx/datastore/core/SingleProcessDataStore$b$b;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static abstract class AbstractC0267b<T> {

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$a */
        @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$a;", j6f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Ll/cvf0;", "lastState", "<init>", "(Ll/cvf0;)V", "a", "Ll/cvf0;", "()Ll/cvf0;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
        public static final class a<T> extends AbstractC0267b<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final cvf0<T> lastState;

            public a(@Nullable cvf0<T> cvf0Var) {
                super(null);
                this.lastState = cvf0Var;
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public cvf0<T> m1427a() {
                return this.lastState;
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$b */
        @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011RE\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore$b$b;", j6f.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$b;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_T, "Lkotlin/coroutines/Continuation;", "", "transform", "Ll/in5;", "ack", "Ll/cvf0;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Ll/in5;Ll/cvf0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", Constants.INAPP_DATA_TAG, "()Lkotlin/jvm/functions/Function2;", "b", "Ll/in5;", "()Ll/in5;", "c", "Ll/cvf0;", "()Ll/cvf0;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
        public static final class b<T> extends AbstractC0267b<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Function2<T, Continuation<? super T>, Object> transform;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final in5<T> ack;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final cvf0<T> lastState;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final CoroutineContext callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull in5<T> in5Var, @Nullable cvf0<T> cvf0Var, @NotNull CoroutineContext coroutineContext) {
                super(null);
                function2.getClass();
                in5Var.getClass();
                coroutineContext.getClass();
                this.transform = function2;
                this.ack = in5Var;
                this.lastState = cvf0Var;
                this.callerContext = coroutineContext;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final in5<T> m1428a() {
                return this.ack;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public cvf0<T> m1430c() {
                return this.lastState;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function2<T, Continuation<? super T>, Object> m1431d() {
                return this.transform;
            }
        }

        public /* synthetic */ AbstractC0267b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0267b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull Function0<? extends File> function0, @NotNull wie0<T> wie0Var, @NotNull List<? extends Function2<? super ism<T>, ? super Continuation<? super Unit>, ? extends Object>> list, @NotNull rpb<T> rpbVar, @NotNull ppb ppbVar) {
        function0.getClass();
        wie0Var.getClass();
        list.getClass();
        rpbVar.getClass();
        ppbVar.getClass();
        this.produceFile = function0;
        this.serializer = wie0Var;
        this.corruptionHandler = rpbVar;
        this.scope = ppbVar;
        this.data = jri.m142964w(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt__LazyJVMKt.m87229b(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
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
                synchronized (companion.m1426b()) {
                    if (companion.m1425a().contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> setM1425a = companion.m1425a();
                    absolutePath.getClass();
                    setM1425a.add(absolutePath);
                }
                return file;
            }
        });
        this.downstreamFlow = hvf0.m133163a(dkj0.INSTANCE);
        this.initTasks = CollectionsKt.toList(list);
        this.actor = new SimpleActor<>(ppbVar, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    this.this$0.downstreamFlow.setValue(new ili(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object objM1426b = companion.m1426b();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (objM1426b) {
                    companion.m1425a().remove(singleProcessDataStore.m1415q().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        }, new Function2<AbstractC0267b<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            public final void invoke(@NotNull SingleProcessDataStore.AbstractC0267b<T> abstractC0267b, @Nullable Throwable th) {
                abstractC0267b.getClass();
                if (abstractC0267b instanceof SingleProcessDataStore.AbstractC0267b.b) {
                    in5<T> in5VarM1428a = ((SingleProcessDataStore.AbstractC0267b.b) abstractC0267b).m1428a();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    in5VarM1428a.mo137123g(th);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.AbstractC0267b) obj, th);
                return Unit.INSTANCE;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    @Override // p149l.i5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo1413a(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        in5 in5VarM146557b = kn5.m146557b(null, 1, null);
        this.actor.m1398e(new AbstractC0267b.b(function2, in5VarM146557b, this.downstreamFlow.getValue(), continuation.getContext()));
        return in5VarM146557b.mo127793t(continuation);
    }

    @Override // p149l.i5c
    @NotNull
    public eri<T> getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: p */
    public final void m1414p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        rhg0.m179353a(Intrinsics.m87496l("Unable to create parent directories of ", file));
    }

    /* JADX INFO: renamed from: q */
    public final File m1415q() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final Object m1416r(AbstractC0267b.a<T> aVar, Continuation<? super Unit> continuation) throws Throwable {
        cvf0<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof h3c)) {
            if (value instanceof wdc0) {
                if (value == aVar.m1427a()) {
                    Object objM1420v = m1420v(continuation);
                    return objM1420v == uwp.m196133e() ? objM1420v : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.m87488d(value, dkj0.INSTANCE)) {
                    Object objM1420v2 = m1420v(continuation);
                    return objM1420v2 == uwp.m196133e() ? objM1420v2 : Unit.INSTANCE;
                }
                if (value instanceof ili) {
                    qkq0.m175383a("Can't read in final state.");
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
    /* JADX WARN: Type inference failed for: r9v3, types: [l.in5] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1417s(androidx.datastore.core.SingleProcessDataStore.AbstractC0267b.b<T> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.m1417s(androidx.datastore.core.SingleProcessDataStore$b$b, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final Object m1418t(Continuation<? super Unit> continuation) throws Throwable {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        ot10 ot10VarM94362b;
        ?? r9;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef;
        Iterator<T> it;
        ot10 ot10Var;
        ?? r11;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        ot10 ot10Var2;
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$readAndInit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(t);
            if (!(Intrinsics.m87488d(this.downstreamFlow.getValue(), dkj0.INSTANCE) || (this.downstreamFlow.getValue() instanceof wdc0))) {
                qkq0.m175383a("Check failed.");
                return null;
            }
            ot10VarM94362b = MutexKt.m94362b(false, 1, null);
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            singleProcessDataStore$readAndInit$1.L$0 = this;
            singleProcessDataStore$readAndInit$1.L$1 = ot10VarM94362b;
            singleProcessDataStore$readAndInit$1.L$2 = objectRef4;
            singleProcessDataStore$readAndInit$1.L$3 = objectRef4;
            singleProcessDataStore$readAndInit$1.label = 1;
            Object objM1422x = m1422x(singleProcessDataStore$readAndInit$1);
            if (objM1422x != objM196133e) {
                r9 = this;
                objectRef = objectRef4;
                t = (T) objM1422x;
                objectRef2 = objectRef;
            }
            return objM196133e;
        }
        if (i2 == 1) {
            objectRef = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
            objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
            ot10VarM94362b = (ot10) singleProcessDataStore$readAndInit$1.L$1;
            SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
            ResultKt.m87239b(t);
            r9 = singleProcessDataStore;
        } else {
            if (i2 == 2) {
                it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                objectRef3 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                ot10Var = (ot10) singleProcessDataStore$readAndInit$1.L$1;
                SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                ResultKt.m87239b(t);
                r11 = singleProcessDataStore2;
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    singleProcessDataStore$readAndInit$1.L$0 = r11;
                    singleProcessDataStore$readAndInit$1.L$1 = ot10Var;
                    singleProcessDataStore$readAndInit$1.L$2 = objectRef3;
                    singleProcessDataStore$readAndInit$1.L$3 = booleanRef;
                    singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                    singleProcessDataStore$readAndInit$1.L$5 = it;
                    singleProcessDataStore$readAndInit$1.label = 2;
                    if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objM196133e) {
                        return objM196133e;
                    }
                }
                objectRef2 = objectRef3;
                ot10Var2 = ot10Var;
                r0 = r11;
                r0.initTasks = null;
                singleProcessDataStore$readAndInit$1.L$0 = r0;
                singleProcessDataStore$readAndInit$1.L$1 = objectRef2;
                singleProcessDataStore$readAndInit$1.L$2 = booleanRef;
                singleProcessDataStore$readAndInit$1.L$3 = ot10Var2;
                singleProcessDataStore$readAndInit$1.L$4 = null;
                singleProcessDataStore$readAndInit$1.L$5 = null;
                singleProcessDataStore$readAndInit$1.label = 3;
                if (ot10Var2.mo94354c(null, singleProcessDataStore$readAndInit$1) != objM196133e) {
                    booleanRef2 = booleanRef;
                    r1 = r0;
                }
                return objM196133e;
            }
            if (i2 != 3) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ot10Var2 = (ot10) singleProcessDataStore$readAndInit$1.L$3;
            booleanRef2 = (Ref.BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
            objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
            SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
            ResultKt.m87239b(t);
            r1 = singleProcessDataStore3;
        }
        try {
            booleanRef2.element = true;
            Unit unit = Unit.INSTANCE;
            ot10Var2.mo94355d(null);
            mt10<cvf0<T>> mt10Var = r1.downstreamFlow;
            T t2 = objectRef2.element;
            mt10Var.setValue(new h3c(t2, t2 != null ? t2.hashCode() : 0));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ot10Var2.mo94355d(null);
            throw th;
        }
        objectRef.element = t;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(ot10VarM94362b, booleanRef3, objectRef2, r9);
        List<? extends Function2<? super ism<T>, ? super Continuation<? super Unit>, ? extends Object>> list = r9.initTasks;
        if (list == null) {
            ot10 ot10Var3 = ot10VarM94362b;
            booleanRef = booleanRef3;
            ot10Var2 = ot10Var3;
            r0 = r9;
        } else {
            ot10 ot10Var4 = ot10VarM94362b;
            booleanRef = booleanRef3;
            it = list.iterator();
            ot10Var = ot10Var4;
            r11 = r9;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                singleProcessDataStore$readAndInit$1.L$0 = r11;
                singleProcessDataStore$readAndInit$1.L$1 = ot10Var;
                singleProcessDataStore$readAndInit$1.L$2 = objectRef3;
                singleProcessDataStore$readAndInit$1.L$3 = booleanRef;
                singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                singleProcessDataStore$readAndInit$1.L$5 = it;
                singleProcessDataStore$readAndInit$1.label = 2;
                if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == objM196133e) {
                    return objM196133e;
                }
            }
            objectRef2 = objectRef3;
            ot10Var2 = ot10Var;
            r0 = r11;
        }
        r0.initTasks = null;
        singleProcessDataStore$readAndInit$1.L$0 = r0;
        singleProcessDataStore$readAndInit$1.L$1 = objectRef2;
        singleProcessDataStore$readAndInit$1.L$2 = booleanRef;
        singleProcessDataStore$readAndInit$1.L$3 = ot10Var2;
        singleProcessDataStore$readAndInit$1.L$4 = null;
        singleProcessDataStore$readAndInit$1.L$5 = null;
        singleProcessDataStore$readAndInit$1.label = 3;
        if (ot10Var2.mo94354c(null, singleProcessDataStore$readAndInit$1) != objM196133e) {
            booleanRef2 = booleanRef;
            r1 = r0;
            booleanRef2.element = true;
            Unit unit2 = Unit.INSTANCE;
            ot10Var2.mo94355d(null);
            mt10<cvf0<T>> mt10Var2 = r1.downstreamFlow;
            T t3 = objectRef2.element;
            mt10Var2.setValue(new h3c(t3, t3 != null ? t3.hashCode() : 0));
            return Unit.INSTANCE;
        }
        return objM196133e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m1419u(Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                if (m1418t(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            this = (SingleProcessDataStore<T>) Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.downstreamFlow.setValue(new wdc0(th));
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
    public final Object m1420v(Continuation<? super Unit> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                Object objM1418t = m1418t(singleProcessDataStore$readAndInitOrPropagateFailure$1);
                this = objM1418t;
                if (objM1418t == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = (SingleProcessDataStore<T>) ((SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0);
                ResultKt.m87239b(obj);
                this = z;
            }
        } catch (Throwable th) {
            this.downstreamFlow.setValue(new wdc0(th));
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
    /* JADX WARN: Type inference failed for: r2v2, types: [l.wie0, l.wie0<T>] */
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
    public final Object m1421w(Continuation<? super T> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$readData$1.label;
        Throwable th2 = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th2 = (Throwable) singleProcessDataStore$readData$1.L$2;
                closeable = (Closeable) singleProcessDataStore$readData$1.L$1;
                singleProcessDataStore$readData$1 = (SingleProcessDataStore) singleProcessDataStore$readData$1.L$0;
                try {
                    ResultKt.m87239b(obj);
                    CloseableKt.m87404a(closeable, th2);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.m87404a(closeable, th);
                        throw th4;
                    }
                }
            }
            ResultKt.m87239b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(m1415q());
                try {
                    wie0<T> wie0Var = this.serializer;
                    singleProcessDataStore$readData$1.L$0 = this;
                    singleProcessDataStore$readData$1.L$1 = fileInputStream;
                    singleProcessDataStore$readData$1.L$2 = null;
                    singleProcessDataStore$readData$1.label = 1;
                    Object objMo136353c = wie0Var.mo136353c(fileInputStream, singleProcessDataStore$readData$1);
                    if (objMo136353c == objM196133e) {
                        return objM196133e;
                    }
                    closeable = fileInputStream;
                    obj = objMo136353c;
                    CloseableKt.m87404a(closeable, th2);
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
                if (singleProcessDataStore$readData$1.m1415q().exists()) {
                    throw e;
                }
                return singleProcessDataStore$readData$1.serializer.mo136351a();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m1422x(Continuation<? super T> continuation) throws Throwable {
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.m87239b(obj);
                    return obj;
                }
                if (i2 == 2) {
                    corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                    SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    ResultKt.m87239b(obj);
                    singleProcessDataStore = singleProcessDataStore2;
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        if (singleProcessDataStore.m1424z(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != objM196133e) {
                            return obj;
                        }
                    } catch (IOException e2) {
                        corruptionException2 = corruptionException;
                        e = e2;
                    }
                } else {
                    if (i2 != 3) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                    corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.m87239b(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                h5f.m129395a(corruptionException2, e);
                throw corruptionException2;
            }
            ResultKt.m87239b(obj);
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
            Object objM1421w = m1421w(singleProcessDataStore$readDataOrHandleCorruption$1);
            if (objM1421w != objM196133e) {
                return objM1421w;
            }
        } catch (CorruptionException e4) {
            rpb<T> rpbVar = this.corruptionHandler;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e4;
            singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
            Object objMo117906a = rpbVar.mo117906a(e4, singleProcessDataStore$readDataOrHandleCorruption$1);
            if (objMo117906a != objM196133e) {
                singleProcessDataStore = this;
                corruptionException = e4;
                obj = objMo117906a;
            }
            return objM196133e;
        }
        return objM196133e;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m1423y(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) throws Throwable {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        h3c h3cVar;
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
        Object objM196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$transformAndWrite$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj3);
            h3c h3cVar2 = (h3c) this.downstreamFlow.getValue();
            h3cVar2.m129162a();
            Object objM129163b = h3cVar2.m129163b();
            SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, objM129163b, null);
            singleProcessDataStore$transformAndWrite$1.L$0 = this;
            singleProcessDataStore$transformAndWrite$1.L$1 = h3cVar2;
            singleProcessDataStore$transformAndWrite$1.L$2 = objM129163b;
            singleProcessDataStore$transformAndWrite$1.label = 1;
            Object objM130938g = hh3.m130938g(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
            if (objM130938g != objM196133e) {
                obj3 = objM130938g;
                h3cVar = h3cVar2;
                singleProcessDataStore = this;
                obj = objM129163b;
            }
            return objM196133e;
        }
        if (i2 == 1) {
            obj = singleProcessDataStore$transformAndWrite$1.L$2;
            h3cVar = (h3c) singleProcessDataStore$transformAndWrite$1.L$1;
            SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
            ResultKt.m87239b(obj3);
            singleProcessDataStore = singleProcessDataStore3;
        } else {
            if (i2 != 2) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = singleProcessDataStore$transformAndWrite$1.L$1;
            SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
            ResultKt.m87239b(obj3);
            singleProcessDataStore2 = singleProcessDataStore4;
        }
        mt10<cvf0<T>> mt10Var = singleProcessDataStore2.downstreamFlow;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        mt10Var.setValue(new h3c(obj2, iHashCode));
        return obj2;
        h3cVar.m129162a();
        if (Intrinsics.m87488d(obj, obj3)) {
            return obj;
        }
        singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
        singleProcessDataStore$transformAndWrite$1.L$1 = obj3;
        singleProcessDataStore$transformAndWrite$1.L$2 = null;
        singleProcessDataStore$transformAndWrite$1.label = 2;
        if (singleProcessDataStore.m1424z(obj3, singleProcessDataStore$transformAndWrite$1) != objM196133e) {
            singleProcessDataStore2 = singleProcessDataStore;
            obj2 = obj3;
            mt10<cvf0<T>> mt10Var2 = singleProcessDataStore2.downstreamFlow;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            mt10Var2.setValue(new h3c(obj2, iHashCode));
            return obj2;
        }
        return objM196133e;
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
    public final Object m1424z(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
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
        ?? M196133e = uwp.m196133e();
        int i2 = singleProcessDataStore$writeData$1.label;
        Throwable th = null;
        try {
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                m1414p(m1415q());
                file = new File(Intrinsics.m87496l(m1415q().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream((File) file);
                    try {
                        wie0<T> wie0Var = this.serializer;
                        C0268c c0268c = new C0268c(fileOutputStream2);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream2;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream2;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (wie0Var.mo136352b(t, c0268c, singleProcessDataStore$writeData$1) == M196133e) {
                            return M196133e;
                        }
                        singleProcessDataStore = this;
                        M196133e = file;
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        M196133e = file;
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
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                closeable = (Closeable) singleProcessDataStore$writeData$1.L$2;
                M196133e = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    ResultKt.m87239b(obj);
                    M196133e = M196133e;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.m87404a(closeable, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(closeable, th);
            if (M196133e.renameTo(singleProcessDataStore.m1415q())) {
                return Unit.INSTANCE;
            }
            throw new IOException("Unable to rename " + M196133e + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = M196133e;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$c */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Landroidx/datastore/core/SingleProcessDataStore$c;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "", "write", "(I)V", "", "([B)V", HttpHeaderValues.BYTES, BLiveOperationTitleShowType.off, "len", "([BII)V", "close", "()V", "flush", "a", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C0268c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final FileOutputStream fileOutputStream;

        public C0268c(@NotNull FileOutputStream fileOutputStream) {
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
