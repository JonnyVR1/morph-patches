package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, m88121d2 = {"Ll/jvl;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHeaders", "(Ljava/lang/String;)Ljava/util/List;", "", "getCode", "()I", "code", "getMessage", "()Ljava/lang/String;", "message", "", "isSuccessful", "()Z", "isRedirect", "getHeaderNames", "()Ljava/util/List;", "headerNames", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "bodyStream", "getContentType", "contentType", "getBodyString", "bodyString", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface jvl {
    @Nullable
    /* JADX INFO: renamed from: a */
    InputStream mo121545a();

    @Nullable
    String getBodyString();

    int getCode();

    @Nullable
    String getContentType();

    @Nullable
    String getHeader(@NotNull String name);

    @Nullable
    List<String> getHeaderNames();

    @Nullable
    List<String> getHeaders(@NotNull String name);

    @Nullable
    String getMessage();

    boolean isRedirect();

    boolean isSuccessful();
}
