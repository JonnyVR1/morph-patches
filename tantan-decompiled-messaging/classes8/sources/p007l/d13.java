package p007l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import l.qkq0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Ll/d13;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "Landroid/graphics/Bitmap;", "bmp", "", "c", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "a", "(Ljava/lang/String;)Z", "b", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/io/File;", "Ljava/io/File;", "cacheDir", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File cacheDir;

    public d13(@NotNull Context context) {
        context.getClass();
        this.context = context;
        File file = new File(context.getExternalCacheDir(), "bmp.cache");
        if (file.exists() || file.mkdirs()) {
            this.cacheDir = file;
        } else {
            qkq0.a("Unable to create cache directory");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8835a(@NotNull String key) {
        key.getClass();
        return new File(this.cacheDir, "bitmap-cache-" + key + ".jpg").exists();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Bitmap m8836b(@NotNull String key) {
        key.getClass();
        if (!m8835a(key)) {
            return null;
        }
        return BitmapFactory.decodeFile(new File(this.cacheDir, "bitmap-cache-" + key + ".jpg").getPath());
    }

    /* JADX INFO: renamed from: c */
    public final void m8837c(@NotNull String key, @NotNull Bitmap bmp) throws IOException {
        key.getClass();
        bmp.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.cacheDir, "bitmap-cache-" + key + ".jpg"));
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
