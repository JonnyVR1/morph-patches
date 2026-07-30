package com.immomo.motracing;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.h3e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\f8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\f8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\f8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u0082\u0001\u0002\u0015\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m87232d2 = {"Lcom/immomo/motracing/Span;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_EVENT, "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "Ll/h3e0;", "e", "()Ll/h3e0;", "Lkotlin/ULong;", "c", "()J", "tracerId", "b", "traceId", "a", "spanId", "Companion", "Lcom/immomo/motracing/CSpan;", "Lcom/immomo/motracing/a;", "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public abstract class Span {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private Span() {
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo19330a();

    /* JADX INFO: renamed from: b */
    public abstract long mo19331b();

    /* JADX INFO: renamed from: c */
    public abstract long mo19332c();

    /* JADX INFO: renamed from: d */
    public abstract void mo19333d(@NotNull String event);

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract h3e0 mo19334e();

    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lcom/immomo/motracing/Span$Companion;", "", "<init>", "()V", "", "tracerId", "traceId", "spanId", "Lcom/immomo/motracing/Span;", "_fromContext", "(JJJ)Lcom/immomo/motracing/Span;", "MoTracing_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final native Span _fromContext(long tracerId, long traceId, long spanId);

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Span(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
