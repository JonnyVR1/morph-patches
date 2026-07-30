package p149l;

import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.p118io.TextStreamsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Ll/fxc0;", "Ljava/io/Closeable;", "Ll/rtc0;", SocialConstants.TYPE_REQUEST, "", "code", "", "", "", "headers", "Ljava/io/InputStream;", "bodyStream", "Lkotlin/Function0;", "", "closeDelegate", "<init>", "(Ll/rtc0;ILjava/util/Map;Ljava/io/InputStream;Lkotlin/jvm/functions/Function0;)V", "", "n", "()Z", "header", "m", "(Ljava/lang/String;)Ljava/lang/String;", "q", "()Ljava/lang/String;", "close", "()V", "a", "Ll/rtc0;", "getRequest", "()Ll/rtc0;", "b", "I", "k", "()I", "c", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function0;", "Ljava/io/Reader;", "e", "Ljava/io/Reader;", "bodyReader", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class fxc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final rtc0 request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, List<String>> headers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> closeDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Reader bodyReader;

    /* JADX WARN: Multi-variable type inference failed */
    public fxc0(@NotNull rtc0 rtc0Var, int i, @NotNull Map<String, ? extends List<String>> map, @Nullable InputStream inputStream, @NotNull Function0<Unit> function0) {
        rtc0Var.getClass();
        map.getClass();
        function0.getClass();
        this.request = rtc0Var;
        this.code = i;
        this.headers = map;
        this.closeDelegate = function0;
        this.bodyReader = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192) : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.bodyReader;
        if (reader != null) {
            reader.close();
        }
        this.closeDelegate.invoke();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final String m123625m(@NotNull String header) {
        header.getClass();
        List<String> list = this.headers.get(header);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull((List) list);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m123626n() {
        return this.code == 200;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m123627q() {
        Reader reader = this.bodyReader;
        if (reader != null) {
            return TextStreamsKt.m87425g(reader);
        }
        return null;
    }
}
