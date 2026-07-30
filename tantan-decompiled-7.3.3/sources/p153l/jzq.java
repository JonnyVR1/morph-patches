package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001f"}, m88121d2 = {"Ll/jzq;", "Ll/c23;", "<init>", "()V", "", "frameNumber", "Ll/fb5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(I)Ll/fb5;", "a", "width", "height", "f", "(III)Ll/fb5;", "", "c", "(I)Z", "", BLiveResOperation.clear, "bitmapReference", "frameType", "b", "(ILl/fb5;I)V", "e", "g", "I", "lastFrameNumber", "Ll/fb5;", "lastBitmapReference", "Companion", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class jzq implements c23 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int lastFrameNumber = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public fb5<Bitmap> lastBitmapReference;

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: a */
    public synchronized fb5<Bitmap> mo107667a(int frameNumber) {
        return fb5.m124872t(this.lastBitmapReference);
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: b */
    public synchronized void mo107668b(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType) {
        try {
            bitmapReference.getClass();
            if (this.lastBitmapReference != null) {
                Bitmap bitmapM124875B = bitmapReference.m124875B();
                fb5<Bitmap> fb5Var = this.lastBitmapReference;
                if (Intrinsics.m88377d(bitmapM124875B, fb5Var != null ? fb5Var.m124875B() : null)) {
                    return;
                }
            }
            fb5.m124874v(this.lastBitmapReference);
            this.lastBitmapReference = fb5.m124872t(bitmapReference);
            this.lastFrameNumber = frameNumber;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo107669c(int frameNumber) {
        return frameNumber == this.lastFrameNumber && fb5.m124864Q(this.lastBitmapReference);
    }

    @Override // p153l.c23
    public synchronized void clear() {
        m147674g();
    }

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized fb5<Bitmap> mo107670d(int frameNumber) {
        return this.lastFrameNumber == frameNumber ? fb5.m124872t(this.lastBitmapReference) : null;
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: e */
    public void mo107671e(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
    }

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: f */
    public synchronized fb5<Bitmap> mo107672f(int frameNumber, int width, int height) {
        fb5<Bitmap> fb5VarM124872t;
        try {
            fb5VarM124872t = fb5.m124872t(this.lastBitmapReference);
            m147674g();
        } catch (Throwable th) {
            m147674g();
            throw th;
        }
        return fb5VarM124872t;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m147674g() {
        fb5.m124874v(this.lastBitmapReference);
        this.lastBitmapReference = null;
        this.lastFrameNumber = -1;
    }
}
