package p153l;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/w1d0;", "", "Landroid/net/Uri;", "url", "", "", "headers", "body", "<init>", "(Landroid/net/Uri;Ljava/util/Map;Ljava/lang/String;)V", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/String;", "()Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class w1d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Uri url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String body;

    public w1d0(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable String str) {
        uri.getClass();
        map.getClass();
        this.url = uri;
        this.headers = map;
        this.body = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m204395b() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }
}
