package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.immomo.motracing.Span;
import com.immomo.motracing.Tracer;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/quf0;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/immomo/motracing/Tracer;", "tracer", "<init>", "(Ljava/lang/String;Lcom/immomo/motracing/Tracer;)V", "k", ResourceDirection.f39656v, "a", "(Ljava/lang/String;Ljava/lang/String;)Ll/quf0;", "Lcom/immomo/motracing/Span;", "b", "()Lcom/immomo/motracing/Span;", "", "Ljava/util/List;", UserMetadata.KEYDATA_FILENAME, "values", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lcom/immomo/motracing/Tracer;", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class quf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> keys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> values;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Tracer tracer;

    public quf0(@NotNull String str, @NotNull Tracer tracer) {
        str.getClass();
        tracer.getClass();
        this.name = str;
        this.tracer = tracer;
        this.keys = new ArrayList();
        this.values = new ArrayList();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final quf0 m178147a(@NotNull String k, @NotNull String v2) {
        k.getClass();
        v2.getClass();
        this.keys.add(k);
        this.values.add(v2);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Span m178148b() {
        return this.tracer.mo20318b(this.name, this.keys, this.values);
    }
}
