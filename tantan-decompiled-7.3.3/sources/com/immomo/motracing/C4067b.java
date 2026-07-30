package com.immomo.motracing;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.quf0;

/* JADX INFO: renamed from: com.immomo.motracing.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/immomo/motracing/b;", "Lcom/immomo/motracing/Tracer;", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/quf0;", "a", "(Ljava/lang/String;)Ll/quf0;", "", UserMetadata.KEYDATA_FILENAME, "values", "Lcom/immomo/motracing/Span;", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/immomo/motracing/Span;", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class C4067b extends Tracer {
    public static final C4067b INSTANCE = new C4067b();

    private C4067b() {
        super(null);
    }

    @Override // com.immomo.motracing.Tracer
    @NotNull
    /* JADX INFO: renamed from: a */
    public quf0 mo20317a(@NotNull String name) {
        name.getClass();
        return new quf0(name, this);
    }

    @Override // com.immomo.motracing.Tracer
    @NotNull
    /* JADX INFO: renamed from: b */
    public Span mo20318b(@NotNull String name, @NotNull List<String> keys, @NotNull List<String> values) {
        name.getClass();
        keys.getClass();
        values.getClass();
        return C4066a.INSTANCE;
    }
}
