package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gzg0;
import p149l.ui1;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00104R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u00104R\u0014\u0010L\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00106¨\u0006M"}, m87232d2 = {"Landroidx/room/b;", "", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/gzg0$c;", "sqliteOpenHelperFactory", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "Landroidx/room/RoomDatabase$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/RoomDatabase$e;", "prepackagedDatabaseCallback", "typeConverters", "Ll/ui1;", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/gzg0$c;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;Ljava/util/List;Ljava/util/List;)V", "fromVersion", "toVersion", "a", "(II)Z", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ll/gzg0$c;", Constants.INAPP_DATA_TAG, "Landroidx/room/RoomDatabase$d;", "e", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/RoomDatabase$JournalMode;", "h", "Ljava/util/concurrent/Executor;", RXScreenCaptureService.KEY_INDEX, "j", "Landroid/content/Intent;", "k", BLiveStormDanmakuGiftResourceType.f44444l, "m", "Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "Landroidx/room/RoomDatabase$e;", "r", BLiveStormDanmakuGiftResourceType.f44446s, Constants.KEY_T, "multiInstanceInvalidation", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public class C0665b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final gzg0.InterfaceC17210c sqliteOpenHelperFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final RoomDatabase.C0659d migrationContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final List<RoomDatabase.AbstractC0656b> callbacks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    public final boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final RoomDatabase.JournalMode journalMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Executor queryExecutor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Executor transactionExecutor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent multiInstanceInvalidationServiceIntent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    public final boolean requireMigration;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Set<Integer> migrationNotRequiredFrom;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final File copyFromFile;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final RoomDatabase.AbstractC0660e prepackagedDatabaseCallback;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final List<Object> typeConverters;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final List<ui1> autoMigrationSpecs;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @JvmField
    public final boolean multiInstanceInvalidation;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0665b(@NotNull Context context, @Nullable String str, @NotNull gzg0.InterfaceC17210c interfaceC17210c, @NotNull RoomDatabase.C0659d c0659d, @Nullable List<? extends RoomDatabase.AbstractC0656b> list, boolean z, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor executor, @NotNull Executor executor2, @Nullable Intent intent, boolean z2, boolean z3, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.AbstractC0660e abstractC0660e, @NotNull List<? extends Object> list2, @NotNull List<? extends ui1> list3) {
        context.getClass();
        interfaceC17210c.getClass();
        c0659d.getClass();
        journalMode.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = interfaceC17210c;
        this.migrationContainer = c0659d;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = abstractC0660e;
        this.typeConverters = list2;
        this.autoMigrationSpecs = list3;
        this.multiInstanceInvalidation = intent != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3938a(int fromVersion, int toVersion) {
        Set<Integer> set;
        return (fromVersion <= toVersion || !this.allowDestructiveMigrationOnDowngrade) && this.requireMigration && ((set = this.migrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(fromVersion)));
    }
}
