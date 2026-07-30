package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0016"}, m88121d2 = {"Ll/kyd0;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", Constants.KEY_KEY, "", Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "c", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "", "e", "(Landroid/os/Bundle;)Z", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "", "f", "(Landroid/os/Bundle;)Ljava/util/Map;", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmInline
@SourceDebugExtension
public final class kyd0 {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static Bundle m151953a(@NotNull Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m151954b(Bundle bundle, @NotNull String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Bundle m151955c(Bundle bundle, @NotNull String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        lyd0.m156270a(str);
        throw new KotlinNothingValueException();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final List<String> m151956d(Bundle bundle, @NotNull String str) {
        str.getClass();
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m151957e(Bundle bundle) {
        return bundle.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Map<String, Object> m151958f(Bundle bundle) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            mapCreateMapBuilder.put(str, bundle.get(str));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
