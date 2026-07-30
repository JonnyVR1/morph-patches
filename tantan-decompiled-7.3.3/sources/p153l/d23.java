package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/d23;", "", "Ll/e23;", "bitmapFramePreparer", "Ll/c23;", "bitmapFrameCache", "Ll/yq0;", "animationBackend", "", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "c", "(Ll/e23;Ll/c23;Ll/yq0;ILkotlin/jvm/functions/Function0;)V", "canvasWidth", "canvasHeight", "e", "(IILkotlin/jvm/functions/Function0;)V", Constants.INAPP_DATA_TAG, "()V", "b", "frameNumber", "Ll/fb5;", "Landroid/graphics/Bitmap;", "a", "(III)Ll/fb5;", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface d23 {
    @Nullable
    /* JADX INFO: renamed from: a */
    fb5<Bitmap> mo113659a(int frameNumber, int canvasWidth, int canvasHeight);

    /* JADX INFO: renamed from: b */
    void mo113660b();

    /* JADX INFO: renamed from: c */
    void mo113661c(@NotNull e23 bitmapFramePreparer, @NotNull c23 bitmapFrameCache, @NotNull yq0 animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: d */
    void mo113662d();

    /* JADX INFO: renamed from: e */
    void mo113663e(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: l.d23$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C16423a {
        @Nullable
        /* JADX INFO: renamed from: b */
        public static fb5<Bitmap> m113665b(@NotNull d23 d23Var, int i, int i2, int i3) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static void m113668e(@NotNull d23 d23Var, @NotNull e23 e23Var, @NotNull c23 c23Var, @NotNull yq0 yq0Var, int i, @Nullable Function0<Unit> function0) {
            e23Var.getClass();
            c23Var.getClass();
            yq0Var.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m113669f(d23 d23Var, e23 e23Var, c23 c23Var, yq0 yq0Var, int i, Function0 function0, int i2, Object obj) {
            if (obj != null) {
                pr3.m173429a("Super calls with default arguments not supported in this target, function: prepareFrames");
                return;
            }
            if ((i2 & 16) != 0) {
                function0 = null;
            }
            d23Var.mo113661c(e23Var, c23Var, yq0Var, i, function0);
        }

        /* JADX INFO: renamed from: a */
        public static void m113664a(@NotNull d23 d23Var) {
        }

        /* JADX INFO: renamed from: c */
        public static void m113666c(@NotNull d23 d23Var) {
        }

        /* JADX INFO: renamed from: d */
        public static void m113667d(@NotNull d23 d23Var, int i, int i2, @Nullable Function0<Unit> function0) {
        }
    }
}
