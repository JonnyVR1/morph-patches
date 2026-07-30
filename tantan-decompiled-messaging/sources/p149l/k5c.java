package p149l;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Landroid/content/Context;", "", "fileName", "Ljava/io/File;", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "datastore_release"}, m87233k = 2, m87234mv = {1, 5, 1}, m87236xi = 48)
@JvmName
public final class k5c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final File m144527a(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.m87496l("datastore/", str));
    }
}
