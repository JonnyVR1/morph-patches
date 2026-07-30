package p149l;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/u8e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "urls", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "callback", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class u8e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> urls;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> callback;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function0<Unit> m192188a() {
        return this.callback;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m192189b() {
        return this.urls;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u8e)) {
            return false;
        }
        u8e u8eVar = (u8e) other;
        return Intrinsics.m87488d(this.urls, u8eVar.urls) && Intrinsics.m87488d(this.callback, u8eVar.callback);
    }

    public int hashCode() {
        return (this.urls.hashCode() * 31) + this.callback.hashCode();
    }

    @NotNull
    public String toString() {
        return "DownloadTriggerForUrls(urls=" + this.urls + ", callback=" + this.callback + ')';
    }
}
