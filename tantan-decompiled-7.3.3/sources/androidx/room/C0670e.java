package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.text.C15493d;
import org.eclipse.jetty.http.HttpMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.czp;
import p153l.kwd0;
import p153l.n7h0;
import p153l.r7h0;
import p153l.re1;
import p153l.vpf0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.room.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 i2\u00020\u0001:\u00047;+/BX\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0000¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0010J#\u00103\u001a\u00020\u000e2\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R+\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010<R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\"\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010ER\u001a\u0010K\u001a\u00020F8GX\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010LR$\u0010S\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010O\u001a\u0004\b@\u0010P\"\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010XR&\u0010^\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020[0Z8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\\\u001a\u0004\bG\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010`R\u0014\u0010c\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010bR\u0014\u0010d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u001a\u0010h\u001a\u00020e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010f\u0012\u0004\bg\u0010\u0010¨\u0006j"}, m88121d2 = {"Landroidx/room/e;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "Ll/n7h0;", "db", "", "tableId", Constants.KEY_T, "(Ll/n7h0;I)V", "r", "names", "o", "([Ljava/lang/String;)[Ljava/lang/String;", "Ll/re1;", "autoCloser", "p", "(Ll/re1;)V", "j", "(Ll/n7h0;)V", "Landroid/content/Context;", "context", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/content/Intent;", "serviceIntent", "q", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", BLiveStormDanmakuGiftResourceType.f45294s, "Landroidx/room/e$c;", "observer", "c", "(Landroidx/room/e$c;)V", "n", "", Constants.INAPP_DATA_TAG, "()Z", "m", "tables", "k", "([Ljava/lang/String;)V", ResourceDirection.f39656v, "u", "a", "Landroidx/room/RoomDatabase;", "f", "()Landroidx/room/RoomDatabase;", "b", "Ljava/util/Map;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/Map;", "tableIdLookup", "e", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Ll/re1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "Ll/r7h0;", "Ll/r7h0;", "()Ll/r7h0;", "setCleanupStatement$room_runtime_release", "(Ll/r7h0;)V", "cleanupStatement", "Landroidx/room/e$b;", "Landroidx/room/e$b;", "observedTableTracker", "Ll/czp;", "Ll/czp;", "invalidationLiveDataContainer", "Ll/kwd0;", "Landroidx/room/e$d;", "Ll/kwd0;", "()Ll/kwd0;", "observerMap", "Landroidx/room/f;", "Landroidx/room/f;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public class C0670e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final String[] f3008q = {"UPDATE", HttpMethods.DELETE, "INSERT"};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String[] tablesNames;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public re1 autoCloser;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile boolean initialized;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public volatile r7h0 cleanupStatement;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final b observedTableTracker;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final czp invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @GuardedBy("observerMap")
    @NotNull
    public final kwd0<c, d> observerMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public C0671f multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Object syncTriggersLock;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Object trackerLock;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final Runnable refreshRunnable;

    /* JADX INFO: renamed from: androidx.room.e$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, m88121d2 = {"Landroidx/room/e$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ll/n7h0;", "database", "", "a", "(Ll/n7h0;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m3966a(@NotNull n7h0 database) {
            database.getClass();
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m3967b(@NotNull String tableName, @NotNull String triggerType) {
            tableName.getClass();
            triggerType.getClass();
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.room.e$b */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, m88121d2 = {"Landroidx/room/e$b;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "b", "([I)Z", "c", "", Constants.INAPP_DATA_TAG, "()V", "a", "()[I", "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final long[] tableObservers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final boolean[] triggerStates;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final int[] triggerStateChanges;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean needsSync;

        public b(int i) {
            this.tableObservers = new long[i];
            this.triggerStates = new boolean[i];
            this.triggerStateChanges = new int[i];
        }

        @VisibleForTesting
        @JvmName
        @Nullable
        /* JADX INFO: renamed from: a */
        public final int[] m3968a() {
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.triggerStates;
                        boolean z2 = zArr[i2];
                        int[] iArr = this.triggerStateChanges;
                        if (z != z2) {
                            iArr[i2] = z ? 1 : 2;
                        } else {
                            iArr[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3969b(@NotNull int... tableIds) {
            boolean z;
            tableIds.getClass();
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.needsSync = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m3970c(@NotNull int... tableIds) {
            boolean z;
            tableIds.getClass();
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.needsSync = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        /* JADX INFO: renamed from: d */
        public final void m3971d() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.e$c */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Landroidx/room/e$c;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String[] tables;

        public c(@NotNull String[] strArr) {
            strArr.getClass();
            this.tables = strArr;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo3973b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo3908c(@NotNull Set<String> tables);
    }

    /* JADX INFO: renamed from: androidx.room.e$d */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Landroidx/room/e$d;", "", "Landroidx/room/e$c;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/e$c;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "b", "(Ljava/util/Set;)V", "tables", "c", "([Ljava/lang/String;)V", "a", "Landroidx/room/e$c;", "getObserver$room_runtime_release", "()Landroidx/room/e$c;", "[I", "()[I", "[Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final c observer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final int[] tableIds;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String[] tableNames;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Set<String> singleTableSet;

        public d(@NotNull c cVar, @NotNull int[] iArr, @NotNull String[] strArr) {
            cVar.getClass();
            iArr.getClass();
            strArr.getClass();
            this.observer = cVar;
            this.tableIds = iArr;
            this.tableNames = strArr;
            this.singleTableSet = !(strArr.length == 0) ? SetsKt.setOf(strArr[0]) : SetsKt.emptySet();
            if (iArr.length == strArr.length) {
                return;
            }
            wtq0.m207906a("Check failed.");
            throw null;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        /* JADX INFO: renamed from: b */
        public final void m3975b(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> setEmptySet;
            invalidatedTablesIds.getClass();
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                            setCreateSetBuilder.add(this.tableNames[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                } else {
                    setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : SetsKt.emptySet();
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.observer.mo3908c(setEmptySet);
        }

        /* JADX INFO: renamed from: c */
        public final void m3976c(@NotNull String[] tables) {
            Set<String> setEmptySet;
            tables.getClass();
            int length = this.tableNames.length;
            if (length == 0) {
                setEmptySet = SetsKt.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        setEmptySet = SetsKt.emptySet();
                        break;
                    } else {
                        if (C15493d.m94381x(tables[i], this.tableNames[0], true)) {
                            setEmptySet = this.singleTableSet;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : this.tableNames) {
                        if (C15493d.m94381x(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                        }
                    }
                }
                setEmptySet = SetsKt.build(setCreateSetBuilder);
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.observer.mo3908c(setEmptySet);
        }
    }

    /* JADX INFO: renamed from: androidx.room.e$e */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"androidx/room/e$e", "Ljava/lang/Runnable;", "", "run", "()V", "", "", "a", "()Ljava/util/Set;", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class e implements Runnable {
        public e() {
        }

        /* JADX INFO: renamed from: a */
        public final Set<Integer> m3977a() {
            C0670e c0670e = C0670e.this;
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            Cursor cursorQuery$default = RoomDatabase.query$default(c0670e.getDatabase(), new vpf0("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            try {
                Cursor cursor = cursorQuery$default;
                while (cursor.moveToNext()) {
                    setCreateSetBuilder.add(Integer.valueOf(cursor.getInt(0)));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(cursorQuery$default, null);
                Set<Integer> setBuild = SetsKt.build(setCreateSetBuilder);
                if (setBuild.isEmpty()) {
                    return setBuild;
                }
                if (C0670e.this.getCleanupStatement() == null) {
                    wtq0.m207906a("Required value was null.");
                    return null;
                }
                r7h0 cleanupStatement = C0670e.this.getCleanupStatement();
                if (cleanupStatement != null) {
                    cleanupStatement.executeUpdateDelete();
                    return setBuild;
                }
                wg3.m206174a("Required value was null.");
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursorQuery$default, th);
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setEmptySet;
            re1 re1Var;
            Lock closeLock$room_runtime_release = C0670e.this.getDatabase().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                    if (!C0670e.this.m3947d()) {
                        closeLock$room_runtime_release.unlock();
                        re1 re1Var2 = C0670e.this.autoCloser;
                        if (re1Var2 != null) {
                            re1Var2.m180949d();
                            return;
                        }
                        return;
                    }
                    if (!C0670e.this.getPendingRefresh().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        re1 re1Var3 = C0670e.this.autoCloser;
                        if (re1Var3 != null) {
                            re1Var3.m180949d();
                            return;
                        }
                        return;
                    }
                    if (C0670e.this.getDatabase().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        re1 re1Var4 = C0670e.this.autoCloser;
                        if (re1Var4 != null) {
                            re1Var4.m180949d();
                            return;
                        }
                        return;
                    }
                    n7h0 n7h0VarMo3892C = C0670e.this.getDatabase().getOpenHelper().mo3892C();
                    n7h0VarMo3892C.beginTransactionNonExclusive();
                    try {
                        setEmptySet = m3977a();
                        n7h0VarMo3892C.setTransactionSuccessful();
                        n7h0VarMo3892C.endTransaction();
                        closeLock$room_runtime_release.unlock();
                        re1Var = C0670e.this.autoCloser;
                        if (re1Var != null) {
                            re1Var.m180949d();
                        }
                        if (setEmptySet.isEmpty()) {
                            return;
                        }
                        kwd0<c, d> kwd0VarM3950g = C0670e.this.m3950g();
                        C0670e c0670e = C0670e.this;
                        synchronized (kwd0VarM3950g) {
                            try {
                                Iterator<Map.Entry<K, V>> it = c0670e.m3950g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).m3975b(setEmptySet);
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        n7h0VarMo3892C.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    closeLock$room_runtime_release.unlock();
                    re1 re1Var5 = C0670e.this.autoCloser;
                    if (re1Var5 != null) {
                        re1Var5.m180949d();
                    }
                    throw th3;
                }
            } catch (SQLiteException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                setEmptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                re1Var = C0670e.this.autoCloser;
                if (re1Var != null) {
                }
            } catch (IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                setEmptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                re1Var = C0670e.this.autoCloser;
                if (re1Var != null) {
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0670e(@NotNull RoomDatabase roomDatabase, @NotNull Map<String, String> map, @NotNull Map<String, Set<String>> map2, @NotNull String... strArr) {
        String lowerCase;
        roomDatabase.getClass();
        map.getClass();
        map2.getClass();
        strArr.getClass();
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new b(strArr.length);
        this.invalidationLiveDataContainer = new czp(roomDatabase);
        this.observerMap = new kwd0<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i));
            String str2 = this.shadowTablesMap.get(strArr[i]);
            if (str2 != null) {
                locale.getClass();
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase3 = value.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                locale2.getClass();
                String lowerCase4 = key.toLowerCase(locale2);
                lowerCase4.getClass();
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, (Integer) MapsKt.getValue(map3, lowerCase3));
            }
        }
        this.refreshRunnable = new e();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public void m3946c(@NotNull c observer) {
        d dVarMo110334i;
        observer.getClass();
        String[] strArrM3958o = m3958o(observer.getTables());
        ArrayList arrayList = new ArrayList(strArrM3958o.length);
        for (String str : strArrM3958o) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            Integer num = map.get(lowerCase);
            if (num == null) {
                wg3.m206174a("There is no table with name ".concat(str));
                return;
            }
            arrayList.add(num);
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        d dVar = new d(observer, intArray, strArrM3958o);
        synchronized (this.observerMap) {
            dVarMo110334i = this.observerMap.mo110334i(observer, dVar);
        }
        if (dVarMo110334i == null && this.observedTableTracker.m3969b(Arrays.copyOf(intArray, intArray.length))) {
            m3964u();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3947d() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().mo3892C();
        }
        if (this.initialized) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final r7h0 getCleanupStatement() {
        return this.cleanupStatement;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final kwd0<c, d> m3950g() {
        return this.observerMap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Map<String, Integer> m3952i() {
        return this.tableIdLookup;
    }

    /* JADX INFO: renamed from: j */
    public final void m3953j(@NotNull n7h0 database) {
        database.getClass();
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m3965v(database);
            this.cleanupStatement = database.mo3896T("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.initialized = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: k */
    public final void m3954k(@NotNull String... tables) {
        tables.getClass();
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    entry.getClass();
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.mo3973b()) {
                        dVar.m3976c(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3955l() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.m3971d();
            r7h0 r7h0Var = this.cleanupStatement;
            if (r7h0Var != null) {
                r7h0Var.close();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3956m() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            re1 re1Var = this.autoCloser;
            if (re1Var != null) {
                re1Var.m180953h();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    /* JADX INFO: renamed from: n */
    public void m3957n(@NotNull c observer) {
        d dVarMo110335j;
        observer.getClass();
        synchronized (this.observerMap) {
            dVarMo110335j = this.observerMap.mo110335j(observer);
        }
        if (dVarMo110335j != null) {
            b bVar = this.observedTableTracker;
            int[] tableIds = dVarMo110335j.getTableIds();
            if (bVar.m3970c(Arrays.copyOf(tableIds, tableIds.length))) {
                m3964u();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final String[] m3958o(String[] names) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                locale.getClass();
                String lowerCase2 = str.toLowerCase(locale);
                lowerCase2.getClass();
                Set<String> set = map2.get(lowerCase2);
                set.getClass();
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
    }

    /* JADX INFO: renamed from: p */
    public final void m3959p(@NotNull re1 autoCloser) {
        autoCloser.getClass();
        this.autoCloser = autoCloser;
        autoCloser.m180956k(new Runnable() { // from class: l.dzp
            @Override // java.lang.Runnable
            public final void run() {
                this.f91374a.m3955l();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m3960q(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        context.getClass();
        name.getClass();
        serviceIntent.getClass();
        this.multiInstanceInvalidationClient = new C0671f(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    /* JADX INFO: renamed from: r */
    public final void m3961r(n7h0 db, int tableId) {
        db.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + tableId + ", 0)");
        String str = this.tablesNames[tableId];
        for (String str2 : f3008q) {
            db.execSQL("CREATE TEMP TRIGGER IF NOT EXISTS " + INSTANCE.m3967b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + tableId + " AND invalidated = 0; END");
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3962s() {
        C0671f c0671f = this.multiInstanceInvalidationClient;
        if (c0671f != null) {
            c0671f.m3990m();
        }
        this.multiInstanceInvalidationClient = null;
    }

    /* JADX INFO: renamed from: t */
    public final void m3963t(n7h0 db, int tableId) {
        String str = this.tablesNames[tableId];
        for (String str2 : f3008q) {
            db.execSQL("DROP TRIGGER IF EXISTS " + INSTANCE.m3967b(str, str2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3964u() {
        if (this.database.isOpenInternal()) {
            m3965v(this.database.getOpenHelper().mo3892C());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3965v(@NotNull n7h0 database) {
        database.getClass();
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    try {
                        int[] iArrM3968a = this.observedTableTracker.m3968a();
                        if (iArrM3968a != null) {
                            INSTANCE.m3966a(database);
                            try {
                                int length = iArrM3968a.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = iArrM3968a[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        m3961r(database, i2);
                                    } else if (i3 == 2) {
                                        m3963t(database, i2);
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                database.setTransactionSuccessful();
                                database.endTransaction();
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                database.endTransaction();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                closeLock$room_runtime_release.unlock();
            } catch (Throwable th3) {
                closeLock$room_runtime_release.unlock();
                throw th3;
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
