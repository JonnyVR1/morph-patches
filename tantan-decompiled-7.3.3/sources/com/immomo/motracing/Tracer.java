package com.immomo.motracing;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p153l.quf0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH ¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/immomo/motracing/Tracer;", "", "<init>", "()V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/quf0;", "a", "(Ljava/lang/String;)Ll/quf0;", "", UserMetadata.KEYDATA_FILENAME, "values", "Lcom/immomo/motracing/Span;", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/immomo/motracing/Span;", "Companion", "Lcom/immomo/motracing/CTracer;", "Lcom/immomo/motracing/b;", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class Tracer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private Tracer() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract quf0 mo20317a(@NotNull String name);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract Span mo20318b(@NotNull String name, @NotNull List<String> keys, @NotNull List<String> values);

    /* JADX INFO: renamed from: com.immomo.motracing.Tracer$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m88121d2 = {"Lcom/immomo/motracing/Tracer$a;", "", "<init>", "()V", "", "value", "Lkotlin/ULong;", "a", "(Ljava/lang/String;)J", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final long m20337a(@NotNull String value) {
            value.getClass();
            int length = value.length();
            int i = 0;
            long jM88177b = 0;
            while (i < 8) {
                jM88177b = i < length ? ULong.m88177b(jM88177b | ULong.m88177b(ULong.m88177b((byte) value.charAt(i)) << (i * 8))) : ULong.m88177b(jM88177b | ULong.m88177b(0L));
                i++;
            }
            return jM88177b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Tracer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
