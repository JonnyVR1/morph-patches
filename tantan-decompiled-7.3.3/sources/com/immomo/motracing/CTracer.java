package com.immomo.motracing;

import android.util.LruCache;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.ULong;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;
import p153l.quf0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001d\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m88121d2 = {"Lcom/immomo/motracing/CTracer;", "Lcom/immomo/motracing/Tracer;", "", "np", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", UserMetadata.KEYDATA_FILENAME, "values", "Lcom/immomo/motracing/Span;", "_startSpan", "(JLjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Lcom/immomo/motracing/Span;", "Ll/quf0;", "a", "(Ljava/lang/String;)Ll/quf0;", "", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/immomo/motracing/Span;", "Landroid/util/LruCache;", "Lkotlin/ULong;", "spanCache", "Landroid/util/LruCache;", "J", "id", "getId", "()J", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class CTracer extends Tracer {
    private final long id;
    private final long np;
    private final LruCache<ULong, Span> spanCache;

    private final native Span _startSpan(long np, String name, String[] keys, String[] values);

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
        long j = this.np;
        Object[] array = keys.toArray(new String[0]);
        if (array == null) {
            C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
            return null;
        }
        String[] strArr = (String[]) array;
        Object[] array2 = values.toArray(new String[0]);
        if (array2 == null) {
            C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
            return null;
        }
        Span span_startSpan = _startSpan(j, name, strArr, (String[]) array2);
        this.spanCache.put(ULong.m88176a(span_startSpan.getSpanId()), span_startSpan);
        return span_startSpan;
    }
}
