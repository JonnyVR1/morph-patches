package com.immomo.motracing;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.lbe0;

/* JADX INFO: renamed from: com.immomo.motracing.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8\u0016X\u0096Dø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\f8\u0016X\u0096Dø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\f8\u0016X\u0096Dø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\f8\u0016X\u0096Dø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m88121d2 = {"Lcom/immomo/motracing/a;", "Lcom/immomo/motracing/Span;", "<init>", "()V", "", NotificationCompat.CATEGORY_EVENT, "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Ll/lbe0;", "e", "()Ll/lbe0;", "Lkotlin/ULong;", "a", "J", "c", "()J", "tracerId", "b", "traceId", "spanId", "getParentSpanId", "parentSpanId", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", AuthenticationTokenClaims.JSON_KEY_NAME, "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class C4066a extends Span {
    public static final C4066a INSTANCE = new C4066a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final long tracerId = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long traceId = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long spanId = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final long parentSpanId = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String name = "EMPTY";

    private C4066a() {
        super(null);
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: a */
    public long mo20310a() {
        return spanId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: b */
    public long mo20311b() {
        return traceId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: c */
    public long mo20312c() {
        return tracerId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: d */
    public void mo20313d(@NotNull String event) {
        event.getClass();
    }

    @Override // com.immomo.motracing.Span
    @NotNull
    /* JADX INFO: renamed from: e */
    public lbe0 mo20314e() {
        return new lbe0(null, this, true);
    }
}
