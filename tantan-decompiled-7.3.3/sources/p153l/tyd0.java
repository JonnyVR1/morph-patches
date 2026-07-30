package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, m88121d2 = {"Ll/tyd0;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", Constants.KEY_KEY, "", "value", "", Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "c", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "from", "b", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "e", "(Landroid/os/Bundle;Ljava/lang/String;)V", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmInline
public final class tyd0 {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static Bundle m193567a(@NotNull Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static final void m193568b(Bundle bundle, @NotNull Bundle bundle2) {
        bundle2.getClass();
        bundle.putAll(bundle2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m193569c(Bundle bundle, @NotNull String str, @NotNull Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m193570d(Bundle bundle, @NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, uyd0.m198600a(list));
    }

    /* JADX INFO: renamed from: e */
    public static final void m193571e(Bundle bundle, @NotNull String str) {
        str.getClass();
        bundle.remove(str);
    }
}
