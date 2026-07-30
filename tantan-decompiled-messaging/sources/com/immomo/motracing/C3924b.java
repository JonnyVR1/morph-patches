package com.immomo.motracing;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.hmf0;

/* JADX INFO: renamed from: com.immomo.motracing.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/immomo/motracing/b;", "Lcom/immomo/motracing/Tracer;", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/hmf0;", "a", "(Ljava/lang/String;)Ll/hmf0;", "", UserMetadata.KEYDATA_FILENAME, "values", "Lcom/immomo/motracing/Span;", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/immomo/motracing/Span;", "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class C3924b extends Tracer {
    public static final C3924b INSTANCE = new C3924b();

    private C3924b() {
        super(null);
    }

    @Override // com.immomo.motracing.Tracer
    @NotNull
    /* JADX INFO: renamed from: a */
    public hmf0 mo19337a(@NotNull String name) {
        name.getClass();
        return new hmf0(name, this);
    }

    @Override // com.immomo.motracing.Tracer
    @NotNull
    /* JADX INFO: renamed from: b */
    public Span mo19338b(@NotNull String name, @NotNull List<String> keys, @NotNull List<String> values) {
        name.getClass();
        keys.getClass();
        values.getClass();
        return C3923a.INSTANCE;
    }
}
