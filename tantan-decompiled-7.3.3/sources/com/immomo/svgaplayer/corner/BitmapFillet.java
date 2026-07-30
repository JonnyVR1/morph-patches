package com.immomo.svgaplayer.corner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m88121d2 = {"Lcom/immomo/svgaplayer/corner/BitmapFillet;", "", "()V", "Companion", "Corner", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class BitmapFillet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;", "", "corner", "", "(Ljava/lang/String;II)V", "bitmapFilletCorner", "getBitmapFilletCorner", "()I", "setBitmapFilletCorner", "(I)V", "CORNER_NONE", "CORNER_TOP_LEFT", "CORNER_TOP_RIGHT", "CORNER_BOTTOM_LEFT", "CORNER_BOTTOM_RIGHT", "CORNER_ALL", "CORNER_TOP", "CORNER_BOTTOM", "CORNER_LEFT", "CORNER_RIGHT", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public enum Corner {
        CORNER_NONE(0),
        CORNER_TOP_LEFT(1),
        CORNER_TOP_RIGHT(2),
        CORNER_BOTTOM_LEFT(4),
        CORNER_BOTTOM_RIGHT(8),
        CORNER_ALL(15),
        CORNER_TOP(3),
        CORNER_BOTTOM(12),
        CORNER_LEFT(5),
        CORNER_RIGHT(10);

        private int bitmapFilletCorner;

        Corner(int i) {
            this.bitmapFilletCorner = i;
        }

        public final int getBitmapFilletCorner() {
            return this.bitmapFilletCorner;
        }

        public final void setBitmapFilletCorner(int i) {
            this.bitmapFilletCorner = i;
        }
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, m88121d2 = {"Lcom/immomo/svgaplayer/corner/BitmapFillet$Companion;", "", "()V", "clipBottomLeft", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "width", "height", "clipBottomRight", "clipTopLeft", "clipTopRight", "fillet", "Landroid/graphics/Bitmap;", "bitmap", "roundPx", "corners", "Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        private final void clipBottomLeft(Canvas canvas, Paint paint, int offset, int width, int height) {
            canvas.drawRect(new Rect(0, height - offset, offset, height), paint);
        }

        private final void clipBottomRight(Canvas canvas, Paint paint, int offset, int width, int height) {
            canvas.drawRect(new Rect(width - offset, height - offset, width, height), paint);
        }

        private final void clipTopLeft(Canvas canvas, Paint paint, int offset, int width, int height) {
            canvas.drawRect(new Rect(0, 0, offset, offset), paint);
        }

        private final void clipTopRight(Canvas canvas, Paint paint, int offset, int width, int height) {
            canvas.drawRect(new Rect(width - offset, 0, width, offset), paint);
        }

        @NotNull
        public final Bitmap fillet(@NotNull Bitmap bitmap, int roundPx, @NotNull Corner corners) {
            Companion companion;
            int i;
            bitmap.getClass();
            corners.getClass();
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
                float f = roundPx;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
                int bitmapFilletCorner = corners.getBitmapFilletCorner() ^ Corner.CORNER_ALL.getBitmapFilletCorner();
                if ((Corner.CORNER_TOP_LEFT.getBitmapFilletCorner() & bitmapFilletCorner) != 0) {
                    companion = this;
                    i = roundPx;
                    companion.clipTopLeft(canvas, paint, i, width, height);
                } else {
                    companion = this;
                    i = roundPx;
                }
                if ((Corner.CORNER_TOP_RIGHT.getBitmapFilletCorner() & bitmapFilletCorner) != 0) {
                    companion.clipTopRight(canvas, paint, i, width, height);
                }
                if ((Corner.CORNER_BOTTOM_LEFT.getBitmapFilletCorner() & bitmapFilletCorner) != 0) {
                    companion.clipBottomLeft(canvas, paint, i, width, height);
                }
                if ((Corner.CORNER_BOTTOM_RIGHT.getBitmapFilletCorner() & bitmapFilletCorner) != 0) {
                    companion.clipBottomRight(canvas, paint, i, width, height);
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                Rect rect = new Rect(0, 0, width, height);
                canvas.drawBitmap(bitmap, rect, rect, paint);
                bitmapCreateBitmap.getClass();
                return bitmapCreateBitmap;
            } catch (Exception unused) {
                return bitmap;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
