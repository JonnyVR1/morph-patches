package p153l;

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
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m88121d2 = {"Ll/diq0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)V", "", "Ljava/io/File;", "e", "(Landroid/content/Context;)Ljava/util/Map;", "b", "(Landroid/content/Context;)Ljava/io/File;", "a", "c", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class diq0 {

    @NotNull
    public static final diq0 INSTANCE = new diq0();

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m115952d(@NotNull Context context) {
        context.getClass();
        diq0 diq0Var = INSTANCE;
        if (diq0Var.m115954b(context).exists()) {
            qzv.m178829e().mo178832a(eiq0.f94188a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : diq0Var.m115956e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        qzv.m178829e().mo178839k(eiq0.f94188a, "Over-writing contents of " + value);
                    }
                    qzv.m178829e().mo178832a(eiq0.f94188a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m115953a(@NotNull Context context) {
        context.getClass();
        return m115955c(context);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final File m115954b(@NotNull Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: c */
    public final File m115955c(Context context) {
        return new File(mt0.INSTANCE.m159944a(context), "androidx.work.workdb");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<File, File> m115956e(@NotNull Context context) {
        context.getClass();
        File fileM115954b = m115954b(context);
        File fileM115953a = m115953a(context);
        String[] strArr = eiq0.f94189b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pairM88129a = TuplesKt.m88129a(new File(fileM115954b.getPath() + str), new File(fileM115953a.getPath() + str));
            linkedHashMap.put(pairM88129a.getFirst(), pairM88129a.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.m88129a(fileM115954b, fileM115953a));
    }
}
