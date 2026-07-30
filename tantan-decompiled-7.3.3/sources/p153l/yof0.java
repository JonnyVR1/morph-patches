package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u001e\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001f¨\u00060"}, m88121d2 = {"Ll/yof0;", "Ll/jvl;", "", "simpleCode", "", "simpleMessage", "Ljava/io/InputStream;", "simpleBodyStream", "simpleContentType", "", "simpleHeaders", "bodyString", "<init>", "(ILjava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", AuthenticationTokenClaims.JSON_KEY_NAME, "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHeaders", "(Ljava/lang/String;)Ljava/util/List;", "a", "I", "b", "Ljava/lang/String;", "c", "Ljava/io/InputStream;", Constants.INAPP_DATA_TAG, "e", "Ljava/util/Map;", "f", "getBodyString", "()Ljava/lang/String;", "getCode", "()I", "code", "getMessage", "message", "", "isSuccessful", "()Z", "isRedirect", "getHeaderNames", "()Ljava/util/List;", "headerNames", "()Ljava/io/InputStream;", "bodyStream", "getContentType", "contentType", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yof0 implements jvl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int simpleCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String simpleMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InputStream simpleBodyStream;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String simpleContentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> simpleHeaders;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String bodyString;

    public yof0(int i, @NotNull String str, @Nullable InputStream inputStream, @Nullable String str2, @NotNull Map<String, String> map, @Nullable String str3) {
        str.getClass();
        map.getClass();
        this.simpleCode = i;
        this.simpleMessage = str;
        this.simpleBodyStream = inputStream;
        this.simpleContentType = str2;
        this.simpleHeaders = map;
        this.bodyString = str3;
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public InputStream getSimpleBodyStream() {
        return this.simpleBodyStream;
    }

    @Override // p153l.jvl
    @Nullable
    public String getBodyString() {
        return this.bodyString;
    }

    @Override // p153l.jvl
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public int getSimpleCode() {
        return this.simpleCode;
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: getContentType, reason: from getter */
    public String getSimpleContentType() {
        return this.simpleContentType;
    }

    @Override // p153l.jvl
    @Nullable
    public String getHeader(@NotNull String name) {
        name.getClass();
        return this.simpleHeaders.get(name);
    }

    @Override // p153l.jvl
    @Nullable
    public List<String> getHeaderNames() {
        return CollectionsKt.toList(this.simpleHeaders.keySet());
    }

    @Override // p153l.jvl
    @Nullable
    public List<String> getHeaders(@NotNull String name) {
        name.getClass();
        String str = this.simpleHeaders.get(name);
        if (str != null) {
            return CollectionsKt.listOf(str);
        }
        return null;
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getSimpleMessage() {
        return this.simpleMessage;
    }

    @Override // p153l.jvl
    public boolean isRedirect() {
        int i = this.simpleCode;
        return 300 <= i && i < 400;
    }

    @Override // p153l.jvl
    public boolean isSuccessful() {
        int i = this.simpleCode;
        return 200 <= i && i < 300;
    }
}
