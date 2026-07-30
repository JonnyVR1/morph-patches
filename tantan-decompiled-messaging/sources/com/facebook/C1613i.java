package com.facebook;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1613i;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R$\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, m87232d2 = {"Lcom/facebook/i;", "", "Landroid/os/Handler;", "callbackHandler", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "<init>", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "", "size", "", "b", "(J)V", "c", Constants.INAPP_DATA_TAG, "()V", "a", "Landroid/os/Handler;", "Lcom/facebook/GraphRequest;", "J", "threshold", "<set-?>", "getProgress", "()J", "progress", "e", "lastReportedProgress", "f", "getMaxProgress", "maxProgress", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1613i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GraphRequest request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long progress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long maxProgress;

    public C1613i(@Nullable Handler handler, @NotNull GraphRequest graphRequest) {
        graphRequest.getClass();
        this.callbackHandler = handler;
        this.request = graphRequest;
        this.threshold = C1577c.m8023B();
    }

    /* JADX INFO: renamed from: a */
    public static void m8391a(GraphRequest.InterfaceC1516b interfaceC1516b, long j, long j2) {
        ((GraphRequest.InterfaceC1520f) interfaceC1516b).m7590b(j, j2);
    }

    /* JADX INFO: renamed from: b */
    public final void m8392b(long size) {
        long j = this.progress + size;
        this.progress = j;
        if (j >= this.lastReportedProgress + this.threshold || j >= this.maxProgress) {
            m8394d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8393c(long size) {
        this.maxProgress += size;
    }

    /* JADX INFO: renamed from: d */
    public final void m8394d() {
        if (this.progress > this.lastReportedProgress) {
            final GraphRequest.InterfaceC1516b callback = this.request.getCallback();
            final long j = this.maxProgress;
            if (j <= 0 || !(callback instanceof GraphRequest.InterfaceC1520f)) {
                return;
            }
            final long j2 = this.progress;
            Handler handler = this.callbackHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.xuc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1613i.m8391a(callback, j2, j);
                    }
                });
            } else {
                ((GraphRequest.InterfaceC1520f) callback).m7590b(j2, j);
            }
            this.lastReportedProgress = this.progress;
        }
    }
}
