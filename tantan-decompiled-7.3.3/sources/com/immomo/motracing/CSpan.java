package com.immomo.motracing;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.lbe0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0018R\u001d\u0010\u0003\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m88121d2 = {"Lcom/immomo/motracing/CSpan;", "Lcom/immomo/motracing/Span;", "", "tracerId", "traceId", "spanId", "parentSpanId", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "_start", "(JJJJLjava/lang/String;)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "_end", "(JJJJLjava/lang/String;I)V", NotificationCompat.CATEGORY_EVENT, "_log", "(JJJJLjava/lang/String;Ljava/lang/String;)V", "e", "_recordException", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Ll/lbe0;", "()Ll/lbe0;", "Lkotlin/ULong;", "J", "c", "()J", "b", "a", "g", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class CSpan extends Span {

    @NotNull
    private final String name;
    private final long parentSpanId;
    private final long spanId;
    private final long traceId;
    private final long tracerId;

    private final native void _end(long tracerId, long traceId, long spanId, long parentSpanId, String name, int s);

    private final native void _log(long tracerId, long traceId, long spanId, long parentSpanId, String name, String event);

    private final native void _recordException(long tracerId, long traceId, long spanId, long parentSpanId, String name, String e);

    private final native void _start(long tracerId, long traceId, long spanId, long parentSpanId, String name);

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSpanId() {
        return this.spanId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getTraceId() {
        return this.traceId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getTracerId() {
        return this.tracerId;
    }

    @Override // com.immomo.motracing.Span
    /* JADX INFO: renamed from: d */
    public void mo20313d(@NotNull String event) {
        event.getClass();
        _log(getTracerId(), getTraceId(), getSpanId(), getParentSpanId(), getName(), event);
    }

    @Override // com.immomo.motracing.Span
    @NotNull
    /* JADX INFO: renamed from: e */
    public lbe0 mo20314e() {
        Span spanM20320c = GlobalTracer.m20320c(getTracerId());
        GlobalTracer.INSTANCE.m20323e(this);
        return new lbe0(spanM20320c, this, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getParentSpanId() {
        return this.parentSpanId;
    }
}
