package p149l;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Ll/y8q0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)V", "", "Ljava/io/File;", "e", "(Landroid/content/Context;)Ljava/util/Map;", "b", "(Landroid/content/Context;)Ljava/io/File;", "a", "c", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class y8q0 {

    @NotNull
    public static final y8q0 INSTANCE = new y8q0();

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m213427d(@NotNull Context context) {
        context.getClass();
        y8q0 y8q0Var = INSTANCE;
        if (y8q0Var.m213429b(context).exists()) {
            txv.m190976e().mo190979a(z8q0.f202193a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : y8q0Var.m213431e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        txv.m190976e().mo190986k(z8q0.f202193a, "Over-writing contents of " + value);
                    }
                    txv.m190976e().mo190979a(z8q0.f202193a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m213428a(@NotNull Context context) {
        context.getClass();
        return m213430c(context);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final File m213429b(@NotNull Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: c */
    public final File m213430c(Context context) {
        return new File(gt0.INSTANCE.m127867a(context), "androidx.work.workdb");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<File, File> m213431e(@NotNull Context context) {
        context.getClass();
        File fileM213429b = m213429b(context);
        File fileM213428a = m213428a(context);
        String[] strArr = z8q0.f202194b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pairM87240a = TuplesKt.m87240a(new File(fileM213429b.getPath() + str), new File(fileM213428a.getPath() + str));
            linkedHashMap.put(pairM87240a.getFirst(), pairM87240a.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.m87240a(fileM213429b, fileM213428a));
    }
}
