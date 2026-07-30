package p149l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/o13;", "", "Ll/p13;", "bitmapFramePreparer", "Ll/n13;", "bitmapFrameCache", "Ll/uq0;", "animationBackend", "", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "c", "(Ll/p13;Ll/n13;Ll/uq0;ILkotlin/jvm/functions/Function0;)V", "canvasWidth", "canvasHeight", "e", "(IILkotlin/jvm/functions/Function0;)V", Constants.INAPP_DATA_TAG, "()V", "b", "frameNumber", "Ll/fa5;", "Landroid/graphics/Bitmap;", "a", "(III)Ll/fa5;", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface o13 {
    @Nullable
    /* JADX INFO: renamed from: a */
    fa5<Bitmap> mo134354a(int frameNumber, int canvasWidth, int canvasHeight);

    /* JADX INFO: renamed from: b */
    void mo134355b();

    /* JADX INFO: renamed from: c */
    void mo134356c(@NotNull p13 bitmapFramePreparer, @NotNull n13 bitmapFrameCache, @NotNull uq0 animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: d */
    void mo134357d();

    /* JADX INFO: renamed from: e */
    void mo134358e(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: l.o13$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18814a {
        @Nullable
        /* JADX INFO: renamed from: b */
        public static fa5<Bitmap> m162231b(@NotNull o13 o13Var, int i, int i2, int i3) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static void m162234e(@NotNull o13 o13Var, @NotNull p13 p13Var, @NotNull n13 n13Var, @NotNull uq0 uq0Var, int i, @Nullable Function0<Unit> function0) {
            p13Var.getClass();
            n13Var.getClass();
            uq0Var.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m162235f(o13 o13Var, p13 p13Var, n13 n13Var, uq0 uq0Var, int i, Function0 function0, int i2, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: prepareFrames");
                return;
            }
            if ((i2 & 16) != 0) {
                function0 = null;
            }
            o13Var.mo134356c(p13Var, n13Var, uq0Var, i, function0);
        }

        /* JADX INFO: renamed from: a */
        public static void m162230a(@NotNull o13 o13Var) {
        }

        /* JADX INFO: renamed from: c */
        public static void m162232c(@NotNull o13 o13Var) {
        }

        /* JADX INFO: renamed from: d */
        public static void m162233d(@NotNull o13 o13Var, int i, int i2, @Nullable Function0<Unit> function0) {
        }
    }
}
