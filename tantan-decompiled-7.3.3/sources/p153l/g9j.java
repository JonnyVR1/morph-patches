package p153l;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010%¨\u0006("}, m88121d2 = {"Ll/g9j;", "Ll/c23;", "Ll/iq0;", "animatedFrameCache", "", "enableBitmapReusing", "<init>", "(Ll/iq0;Z)V", "", "frameNumber", "Ll/fb5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(I)Ll/fb5;", "a", "width", "height", "f", "(III)Ll/fb5;", "c", "(I)Z", "", BLiveResOperation.clear, "()V", "bitmapReference", "frameType", "b", "(ILl/fb5;I)V", "e", "g", "(I)V", "Ll/iq0;", "Z", "Landroid/util/SparseArray;", "Ll/db5;", "Landroid/util/SparseArray;", "preparedPendingFrames", "Ll/fb5;", "lastRenderedItem", "Companion", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class g9j implements c23 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Class<?> f102857e = g9j.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final iq0 animatedFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enableBitmapReusing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<fb5<db5>> preparedPendingFrames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public fb5<db5> lastRenderedItem;

    public g9j(@NotNull iq0 iq0Var, boolean z) {
        iq0Var.getClass();
        this.animatedFrameCache = iq0Var;
        this.enableBitmapReusing = z;
        this.preparedPendingFrames = new SparseArray<>();
    }

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: a */
    public synchronized fb5<Bitmap> mo107667a(int frameNumber) {
        return INSTANCE.m129588b(fb5.m124872t(this.lastRenderedItem));
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: b */
    public synchronized void mo107668b(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
        m129586g(frameNumber);
        fb5<db5> fb5VarM129589c = null;
        try {
            fb5VarM129589c = INSTANCE.m129589c(bitmapReference);
            if (fb5VarM129589c != null) {
                fb5.m124874v(this.lastRenderedItem);
                this.lastRenderedItem = this.animatedFrameCache.m141546a(frameNumber, fb5VarM129589c);
            }
            fb5.m124874v(fb5VarM129589c);
        } catch (Throwable th) {
            fb5.m124874v(fb5VarM129589c);
            throw th;
        }
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo107669c(int frameNumber) {
        return this.animatedFrameCache.m141547b(frameNumber);
    }

    @Override // p153l.c23
    public synchronized void clear() {
        try {
            fb5.m124874v(this.lastRenderedItem);
            this.lastRenderedItem = null;
            int size = this.preparedPendingFrames.size();
            int i = 0;
            while (true) {
                SparseArray<fb5<db5>> sparseArray = this.preparedPendingFrames;
                if (i < size) {
                    fb5.m124874v(sparseArray.valueAt(i));
                    i++;
                } else {
                    sparseArray.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized fb5<Bitmap> mo107670d(int frameNumber) {
        return INSTANCE.m129588b(this.animatedFrameCache.m141548c(frameNumber));
    }

    @Override // p153l.c23
    /* JADX INFO: renamed from: e */
    public synchronized void mo107671e(int frameNumber, @NotNull fb5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
        try {
            fb5<db5> fb5VarM129589c = INSTANCE.m129589c(bitmapReference);
            if (fb5VarM129589c == null) {
                fb5.m124874v(fb5VarM129589c);
                return;
            }
            fb5<db5> fb5VarM141546a = this.animatedFrameCache.m141546a(frameNumber, fb5VarM129589c);
            if (fb5.m124864Q(fb5VarM141546a)) {
                fb5.m124874v(this.preparedPendingFrames.get(frameNumber));
                this.preparedPendingFrames.put(frameNumber, fb5VarM141546a);
                huf.m137188p(f102857e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
            }
            fb5.m124874v(fb5VarM129589c);
        } catch (Throwable th) {
            fb5.m124874v(null);
            throw th;
        }
    }

    @Override // p153l.c23
    @Nullable
    /* JADX INFO: renamed from: f */
    public synchronized fb5<Bitmap> mo107672f(int frameNumber, int width, int height) {
        if (!this.enableBitmapReusing) {
            return null;
        }
        return INSTANCE.m129588b(this.animatedFrameCache.m141549d());
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m129586g(int frameNumber) {
        fb5<db5> fb5Var = this.preparedPendingFrames.get(frameNumber);
        if (fb5Var != null) {
            this.preparedPendingFrames.delete(frameNumber);
            fb5.m124874v(fb5Var);
            huf.m137188p(f102857e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
        }
    }

    /* JADX INFO: renamed from: l.g9j$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/g9j$a;", "", "<init>", "()V", "Ll/fb5;", "Ll/db5;", "closeableImage", "Landroid/graphics/Bitmap;", "b", "(Ll/fb5;)Ll/fb5;", "bitmapReference", "c", "Ljava/lang/Class;", "TAG", "Ljava/lang/Class;", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting
        @Nullable
        /* JADX INFO: renamed from: b */
        public final fb5<Bitmap> m129588b(@Nullable fb5<db5> closeableImage) {
            try {
                if (fb5.m124864Q(closeableImage)) {
                    closeableImage.getClass();
                    if (closeableImage.m124875B() instanceof ib5) {
                        db5 db5VarM124875B = closeableImage.m124875B();
                        db5VarM124875B.getClass();
                        return ((ib5) db5VarM124875B).mo104389s();
                    }
                }
                return null;
            } finally {
                fb5.m124874v(closeableImage);
            }
        }

        /* JADX INFO: renamed from: c */
        public final fb5<db5> m129589c(fb5<Bitmap> bitmapReference) {
            ib5 ib5VarM139282z = ib5.m139282z(bitmapReference, anm.f72363d, 0);
            ib5VarM139282z.getClass();
            return fb5.m124865S(ib5VarM139282z);
        }

        public Companion() {
        }
    }
}
