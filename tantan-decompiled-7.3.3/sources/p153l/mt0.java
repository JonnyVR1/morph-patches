package p153l;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/mt0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(Landroid/content/Context;)Ljava/io/File;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class mt0 {

    @NotNull
    public static final mt0 INSTANCE = new mt0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m159944a(@NotNull Context context) {
        context.getClass();
        File noBackupFilesDir = context.getNoBackupFilesDir();
        noBackupFilesDir.getClass();
        return noBackupFilesDir;
    }
}
