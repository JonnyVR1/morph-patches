package com.facebook;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1612h;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.open.SocialConstants;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nuc0;

/* JADX INFO: renamed from: com.facebook.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001dJ\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R$\u0010/\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Lcom/facebook/h;", "Ljava/io/FilterOutputStream;", "Ll/nuc0;", "Ljava/io/OutputStream;", "out", "Lcom/facebook/e;", "requests", "", "Lcom/facebook/GraphRequest;", "Lcom/facebook/i;", "progressMap", "", "maxProgress", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/e;Ljava/util/Map;J)V", "size", "", "h", "(J)V", SocialConstants.TYPE_REQUEST, "b", "(Lcom/facebook/GraphRequest;)V", "", "buffer", "write", "([B)V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "length", "([BII)V", "oneByte", "(I)V", "close", "()V", "k", "a", "Lcom/facebook/e;", "Ljava/util/Map;", "c", "J", "getMaxProgress", "()J", Constants.INAPP_DATA_TAG, "threshold", "<set-?>", "e", "getBatchProgress", "batchProgress", "f", "lastReportedProgress", "g", "Lcom/facebook/i;", "currentRequestProgress", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1612h extends FilterOutputStream implements nuc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1599e requests;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<GraphRequest, C1613i> progressMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long maxProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long batchProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C1613i currentRequestProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612h(@NotNull OutputStream outputStream, @NotNull C1599e c1599e, @NotNull Map<GraphRequest, C1613i> map, long j) {
        super(outputStream);
        outputStream.getClass();
        c1599e.getClass();
        map.getClass();
        this.requests = c1599e;
        this.progressMap = map;
        this.maxProgress = j;
        this.threshold = C1577c.m8023B();
    }

    /* JADX INFO: renamed from: d */
    public static void m8387d(C1599e.a aVar, C1612h c1612h) {
        aVar.getClass();
        c1612h.getClass();
        ((C1599e.c) aVar).m8318b(c1612h.requests, c1612h.batchProgress, c1612h.maxProgress);
    }

    /* JADX INFO: renamed from: h */
    private final void m8388h(long size) {
        C1613i c1613i = this.currentRequestProgress;
        if (c1613i != null) {
            c1613i.m8392b(size);
        }
        long j = this.batchProgress + size;
        this.batchProgress = j;
        if (j >= this.lastReportedProgress + this.threshold || j >= this.maxProgress) {
            m8390k();
        }
    }

    @Override // p149l.nuc0
    /* JADX INFO: renamed from: b */
    public void mo8389b(@Nullable GraphRequest request) {
        this.currentRequestProgress = request != null ? this.progressMap.get(request) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<C1613i> it = this.progressMap.values().iterator();
        while (it.hasNext()) {
            it.next().m8394d();
        }
        m8390k();
    }

    /* JADX INFO: renamed from: k */
    public final void m8390k() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (final C1599e.a aVar : this.requests.m8311s()) {
                if (aVar instanceof C1599e.c) {
                    Handler callbackHandler = this.requests.getCallbackHandler();
                    if (callbackHandler != null) {
                        callbackHandler.post(new Runnable() { // from class: l.nwa0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1612h.m8387d(aVar, this);
                            }
                        });
                    } else {
                        ((C1599e.c) aVar).m8318b(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer) throws IOException {
        buffer.getClass();
        ((FilterOutputStream) this).out.write(buffer);
        m8388h(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) throws IOException {
        buffer.getClass();
        ((FilterOutputStream) this).out.write(buffer, offset, length);
        m8388h(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int oneByte) throws IOException {
        ((FilterOutputStream) this).out.write(oneByte);
        m8388h(1L);
    }
}
