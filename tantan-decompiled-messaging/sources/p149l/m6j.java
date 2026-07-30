package p149l;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010%¨\u0006("}, m87232d2 = {"Ll/m6j;", "Ll/n13;", "Ll/mq0;", "animatedFrameCache", "", "enableBitmapReusing", "<init>", "(Ll/mq0;Z)V", "", "frameNumber", "Ll/fa5;", "Landroid/graphics/Bitmap;", Constants.INAPP_DATA_TAG, "(I)Ll/fa5;", "a", "width", "height", "f", "(III)Ll/fa5;", "c", "(I)Z", "", BLiveResOperation.clear, "()V", "bitmapReference", "frameType", "b", "(ILl/fa5;I)V", "e", "g", "(I)V", "Ll/mq0;", "Z", "Landroid/util/SparseArray;", "Ll/da5;", "Landroid/util/SparseArray;", "preparedPendingFrames", "Ll/fa5;", "lastRenderedItem", "Companion", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class m6j implements n13 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Class<?> f131695e = m6j.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final mq0 animatedFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enableBitmapReusing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<fa5<da5>> preparedPendingFrames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public fa5<da5> lastRenderedItem;

    public m6j(@NotNull mq0 mq0Var, boolean z) {
        mq0Var.getClass();
        this.animatedFrameCache = mq0Var;
        this.enableBitmapReusing = z;
        this.preparedPendingFrames = new SparseArray<>();
    }

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: a */
    public synchronized fa5<Bitmap> mo141819a(int frameNumber) {
        return INSTANCE.m153236b(fa5.m120152t(this.lastRenderedItem));
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: b */
    public synchronized void mo141820b(int frameNumber, @NotNull fa5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
        m153234g(frameNumber);
        fa5<da5> fa5VarM153237c = null;
        try {
            fa5VarM153237c = INSTANCE.m153237c(bitmapReference);
            if (fa5VarM153237c != null) {
                fa5.m120154v(this.lastRenderedItem);
                this.lastRenderedItem = this.animatedFrameCache.m155844a(frameNumber, fa5VarM153237c);
            }
            fa5.m120154v(fa5VarM153237c);
        } catch (Throwable th) {
            fa5.m120154v(fa5VarM153237c);
            throw th;
        }
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo141821c(int frameNumber) {
        return this.animatedFrameCache.m155845b(frameNumber);
    }

    @Override // p149l.n13
    public synchronized void clear() {
        try {
            fa5.m120154v(this.lastRenderedItem);
            this.lastRenderedItem = null;
            int size = this.preparedPendingFrames.size();
            int i = 0;
            while (true) {
                SparseArray<fa5<da5>> sparseArray = this.preparedPendingFrames;
                if (i < size) {
                    fa5.m120154v(sparseArray.valueAt(i));
                    i++;
                } else {
                    sparseArray.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized fa5<Bitmap> mo141822d(int frameNumber) {
        return INSTANCE.m153236b(this.animatedFrameCache.m155846c(frameNumber));
    }

    @Override // p149l.n13
    /* JADX INFO: renamed from: e */
    public synchronized void mo141823e(int frameNumber, @NotNull fa5<Bitmap> bitmapReference, int frameType) {
        bitmapReference.getClass();
        try {
            fa5<da5> fa5VarM153237c = INSTANCE.m153237c(bitmapReference);
            if (fa5VarM153237c == null) {
                fa5.m120154v(fa5VarM153237c);
                return;
            }
            fa5<da5> fa5VarM155844a = this.animatedFrameCache.m155844a(frameNumber, fa5VarM153237c);
            if (fa5.m120144Q(fa5VarM155844a)) {
                fa5.m120154v(this.preparedPendingFrames.get(frameNumber));
                this.preparedPendingFrames.put(frameNumber, fa5VarM155844a);
                tsf.m190550p(f131695e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
            }
            fa5.m120154v(fa5VarM153237c);
        } catch (Throwable th) {
            fa5.m120154v(null);
            throw th;
        }
    }

    @Override // p149l.n13
    @Nullable
    /* JADX INFO: renamed from: f */
    public synchronized fa5<Bitmap> mo141824f(int frameNumber, int width, int height) {
        if (!this.enableBitmapReusing) {
            return null;
        }
        return INSTANCE.m153236b(this.animatedFrameCache.m155847d());
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m153234g(int frameNumber) {
        fa5<da5> fa5Var = this.preparedPendingFrames.get(frameNumber);
        if (fa5Var != null) {
            this.preparedPendingFrames.delete(frameNumber);
            fa5.m120154v(fa5Var);
            tsf.m190550p(f131695e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
        }
    }

    /* JADX INFO: renamed from: l.m6j$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/m6j$a;", "", "<init>", "()V", "Ll/fa5;", "Ll/da5;", "closeableImage", "Landroid/graphics/Bitmap;", "b", "(Ll/fa5;)Ll/fa5;", "bitmapReference", "c", "Ljava/lang/Class;", "TAG", "Ljava/lang/Class;", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting
        @Nullable
        /* JADX INFO: renamed from: b */
        public final fa5<Bitmap> m153236b(@Nullable fa5<da5> closeableImage) {
            try {
                if (fa5.m120144Q(closeableImage)) {
                    closeableImage.getClass();
                    if (closeableImage.m120155B() instanceof ia5) {
                        da5 da5VarM120155B = closeableImage.m120155B();
                        da5VarM120155B.getClass();
                        return ((ia5) da5VarM120155B).mo135133s();
                    }
                }
                return null;
            } finally {
                fa5.m120154v(closeableImage);
            }
        }

        /* JADX INFO: renamed from: c */
        public final fa5<da5> m153237c(fa5<Bitmap> bitmapReference) {
            ia5 ia5VarM135131z = ia5.m135131z(bitmapReference, ykm.f198776d, 0);
            ia5VarM135131z.getClass();
            return fa5.m120145S(ia5VarM135131z);
        }

        public Companion() {
        }
    }
}
