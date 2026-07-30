package p149l;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/gi3;", "", "<init>", "()V", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "Landroid/util/Size;", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "b", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "core-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class gi3 {

    @NotNull
    public static final gi3 INSTANCE = new gi3();

    @JvmStatic
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static final void m126249a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size value) {
        bundle.putSize(key, value);
    }

    @JvmStatic
    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static final void m126250b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF value) {
        bundle.putSizeF(key, value);
    }
}
