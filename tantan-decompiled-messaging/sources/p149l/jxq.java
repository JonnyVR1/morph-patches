package p149l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001f"}, m87232d2 = {"Ll/jxq;", "Ll/n13;", "<init>", "()V", "", "frameNumber", "Ll/fa5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(I)Ll/fa5;", "a", "width", "height", "f", "(III)Ll/fa5;", "", "c", "(I)Z", "", BLiveResOperation.clear, "bitmapReference", "frameType", "b", "(ILl/fa5;I)V", "e", "g", "I", "lastFrameNumber", "Ll/fa5;", "lastBitmapReference", "Companion", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class jxq implements n13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int lastFrameNumber = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public fa5<Bitmap> lastBitmapReference;

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: a */
    public synchronized fa5<Bitmap> mo141819a(int frameNumber) {
        return fa5.m120152t(this.lastBitmapReference);
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: b */
    public synchronized void mo141820b(int frameNumber, @NotNull fa5<Bitmap> bitmapReference, int frameType) {
        try {
            bitmapReference.getClass();
            if (this.lastBitmapReference != null) {
                Bitmap bitmapM120155B = bitmapReference.m120155B();
                fa5<Bitmap> fa5Var = this.lastBitmapReference;
                if (Intrinsics.m87488d(bitmapM120155B, fa5Var != null ? fa5Var.m120155B() : null)) {
                    return;
                }
            }
            fa5.m120154v(this.lastBitmapReference);
            this.lastBitmapReference = fa5.m120152t(bitmapReference);
            this.lastFrameNumber = frameNumber;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo141821c(int frameNumber) {
        return frameNumber == this.lastFrameNumber && fa5.m120144Q(this.lastBitmapReference);
    }

    @Override // p149l.n13
    public synchronized void clear() {
        m143819g();
    }

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized fa5<Bitmap> mo141822d(int frameNumber) {
        return this.lastFrameNumber == frameNumber ? fa5.m120152t(this.lastBitmapReference) : null;
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: e */
    public void mo141823e(int frameNumber, @NotNull fa5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
    }

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: f */
    public synchronized fa5<Bitmap> mo141824f(int frameNumber, int width, int height) {
        fa5<Bitmap> fa5VarM120152t;
        try {
            fa5VarM120152t = fa5.m120152t(this.lastBitmapReference);
            m143819g();
        } catch (Throwable th) {
            m143819g();
            throw th;
        }
        return fa5VarM120152t;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m143819g() {
        fa5.m120154v(this.lastBitmapReference);
        this.lastBitmapReference = null;
        this.lastFrameNumber = -1;
    }
}
