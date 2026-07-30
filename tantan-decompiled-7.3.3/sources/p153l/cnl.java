package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, m88121d2 = {"Ll/cnl;", "Ll/kvl;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "Ljava/io/InputStream;", "bodyStream", "a", "(Ljava/io/InputStream;)Ll/kvl;", "contentType", "setContentType", "(Ljava/lang/String;)Ll/kvl;", "Ll/jvl;", "build", "()Ll/jvl;", "bodyString", "b", "I", "Ljava/lang/String;", "c", "Ljava/io/InputStream;", Constants.INAPP_DATA_TAG, "", "e", "Ljava/util/Map;", "headers", "f", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cnl implements kvl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InputStream bodyStream;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String contentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String bodyString;

    public cnl(int i, @NotNull String str) {
        str.getClass();
        this.code = i;
        this.message = str;
        this.headers = new LinkedHashMap();
    }

    @Override // p153l.kvl
    @Nullable
    /* JADX INFO: renamed from: a */
    public kvl mo111520a(@Nullable InputStream bodyStream) {
        this.bodyStream = bodyStream;
        return this;
    }

    @Override // p153l.kvl
    @Nullable
    /* JADX INFO: renamed from: b */
    public kvl mo111521b(@NotNull String bodyString) {
        bodyString.getClass();
        this.bodyString = bodyString;
        return this;
    }

    @Override // p153l.kvl
    @Nullable
    public jvl build() {
        return new yof0(this.code, this.message, this.bodyStream, this.contentType, this.headers, this.bodyString);
    }

    @Override // p153l.kvl
    @Nullable
    public kvl setContentType(@Nullable String contentType) {
        this.contentType = contentType;
        return this;
    }
}
