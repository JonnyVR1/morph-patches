package p153l;

import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ljava/io/File;", "", "a", "(Ljava/io/File;)Z", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class yqf {
    /* JADX INFO: renamed from: a */
    public static final boolean m217086a(@Nullable File file) {
        if (file != null && file.exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                return true;
            }
        }
        return false;
    }
}
