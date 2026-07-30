package p149l;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\f\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/yl10;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "mainRequest", "lowResRequest", "", "firstAvailableRequest", "Ll/fti;", "Landroid/net/Uri;", "requestToUri", "a", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Ll/fti;)Landroid/net/Uri;", "ui-common_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yl10 {

    @NotNull
    public static final yl10 INSTANCE = new yl10();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Uri m215210a(@Nullable T mainRequest, @Nullable T lowResRequest, @Nullable T[] firstAvailableRequest, @NotNull fti<T, Uri> requestToUri) {
        requestToUri.getClass();
        Uri uriApply = mainRequest != null ? requestToUri.apply(mainRequest) : null;
        if (uriApply != null) {
            return uriApply;
        }
        if (firstAvailableRequest != null && firstAvailableRequest.length != 0) {
            T t = firstAvailableRequest[0];
            Uri uriApply2 = t != null ? requestToUri.apply(t) : null;
            if (uriApply2 != null) {
                return uriApply2;
            }
        }
        if (lowResRequest != null) {
            return requestToUri.apply(lowResRequest);
        }
        return null;
    }
}
