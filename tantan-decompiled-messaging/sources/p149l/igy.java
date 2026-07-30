package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001a\u0010\b¨\u0006\u001b"}, m87232d2 = {"Ll/igy;", j6f.GPS_DIRECTION_TRUE, "", "", Constants.KEY_KEY, "Lkotlin/Pair;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lkotlin/Pair;", "A", "Ll/xgy;", "transformTo", "g", "(Ljava/lang/String;Ll/xgy;)Ljava/lang/Object;", "h", "f", "(Ljava/lang/String;)Ljava/io/File;", "data", "", "e", "(Ljava/lang/String;Lkotlin/Pair;)Z", "", "c", "(Ljava/lang/String;[B)Ljava/io/File;", "b", "(Ljava/lang/String;)Z", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface igy<T> {
    @Nullable
    /* JADX INFO: renamed from: a */
    Pair<T, File> mo111656a(@NotNull String key);

    /* JADX INFO: renamed from: b */
    boolean mo111657b(@NotNull String key);

    @NotNull
    /* JADX INFO: renamed from: c */
    File mo111658c(@NotNull String key, @NotNull byte[] data);

    @Nullable
    /* JADX INFO: renamed from: d */
    Pair<T, File> mo111659d(@NotNull String key);

    /* JADX INFO: renamed from: e */
    boolean mo111660e(@NotNull String key, @NotNull Pair<? extends T, ? extends File> data);

    @Nullable
    /* JADX INFO: renamed from: f */
    File mo111661f(@NotNull String key);

    @Nullable
    /* JADX INFO: renamed from: g */
    <A> A mo111662g(@NotNull String key, @NotNull xgy<A> transformTo);

    @Nullable
    /* JADX INFO: renamed from: h */
    <A> A mo111663h(@NotNull String key, @NotNull xgy<A> transformTo);
}
