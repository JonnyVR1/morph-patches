package p149l;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1613i;
import com.facebook.GraphRequest;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m87232d2 = {"Ll/mwa0;", "Ljava/io/OutputStream;", "Ll/nuc0;", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroid/os/Handler;)V", "Lcom/facebook/GraphRequest;", "currentRequest", "", "b", "(Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/i;", "m", "()Ljava/util/Map;", "", "size", "h", "(J)V", "", "buffer", "write", "([B)V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "length", "([BII)V", "oneByte", "(I)V", "a", "Landroid/os/Handler;", "", "Ljava/util/Map;", "progressMap", "c", "Lcom/facebook/GraphRequest;", Constants.INAPP_DATA_TAG, "Lcom/facebook/i;", "currentRequestProgress", "<set-?>", "e", "I", "k", "()I", "maxProgress", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class mwa0 extends OutputStream implements nuc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<GraphRequest, C1613i> progressMap = new HashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public GraphRequest currentRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C1613i currentRequestProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int maxProgress;

    public mwa0(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // p149l.nuc0
    /* JADX INFO: renamed from: b */
    public void mo8389b(@Nullable GraphRequest currentRequest) {
        this.currentRequest = currentRequest;
        this.currentRequestProgress = currentRequest != null ? this.progressMap.get(currentRequest) : null;
    }

    /* JADX INFO: renamed from: h */
    public final void m156611h(long size) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            C1613i c1613i = new C1613i(this.callbackHandler, graphRequest);
            this.currentRequestProgress = c1613i;
            this.progressMap.put(graphRequest, c1613i);
        }
        C1613i c1613i2 = this.currentRequestProgress;
        if (c1613i2 != null) {
            c1613i2.m8393c(size);
        }
        this.maxProgress += (int) size;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Map<GraphRequest, C1613i> m156613m() {
        return this.progressMap;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer) {
        buffer.getClass();
        m156611h(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int length) {
        buffer.getClass();
        m156611h(length);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) {
        m156611h(1L);
    }
}
