package com.immomo.svgaplayer;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.media.SoundPool;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.ImageView;
import com.immomo.svgaplayer.bean.BoringLayoutBean;
import com.immomo.svgaplayer.bean.StaticLayoutBean;
import com.immomo.svgaplayer.listener.IClickAreaListener;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.p051p1.mobile.putong.core.data.Square;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u00020\"2\n\u0010&\u001a\u00060'R\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020\bH\u0002J \u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0016J\u001c\u0010,\u001a\u00020\"2\n\u0010&\u001a\u00060'R\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0002J\u001c\u0010-\u001a\u00020\"2\n\u0010&\u001a\u00060'R\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0002J$\u0010.\u001a\u00020\"2\n\u0010&\u001a\u00060'R\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020\bH\u0002J$\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u00100\u001a\u00020\u00112\n\u0010&\u001a\u00060'R\u00020\u0001H\u0002J\u0010\u00101\u001a\u00020\"2\u0006\u0010(\u001a\u00020\bH\u0002J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\fH\u0002J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u001bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000bj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGACanvasDrawer;", "Lcom/immomo/svgaplayer/SGVADrawer;", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "dynamicItem", "Lcom/immomo/svgaplayer/SVGADynamicEntity;", "(Lcom/immomo/svgaplayer/SVGAVideoEntity;Lcom/immomo/svgaplayer/SVGADynamicEntity;)V", "canvasH", "", "canvasW", "drawPathCache", "Ljava/util/HashMap;", "Lcom/immomo/svgaplayer/SVGAVideoShapeEntity;", "Landroid/graphics/Path;", "Lkotlin/collections/HashMap;", "drawTextCache", "", "Landroid/graphics/Bitmap;", "getDynamicItem", "()Lcom/immomo/svgaplayer/SVGADynamicEntity;", "mDevPaint", "Landroid/graphics/Paint;", "matrixArray", "", "porterDuffXfermode", "Landroid/graphics/PorterDuffXfermode;", "sharedFrameMatrix", "Landroid/graphics/Matrix;", "sharedPaint", "sharedPath", "sharedPath2", "sharedShapeMatrix", "tValues", "drawDev", "", "canvas", "Landroid/graphics/Canvas;", "drawDynamic", "sprite", "Lcom/immomo/svgaplayer/SGVADrawer$SVGADrawerSprite;", "frameIndex", "drawFrame", "scaleType", "Landroid/widget/ImageView$ScaleType;", "drawImage", "drawShape", "drawSprite", "drawText", "drawingBitmap", "playAudio", "requestScale", "", "resetCachePath", "resetShapeStrokePaint", "shape", "resetShareMatrix", "transform", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class SVGACanvasDrawer extends SGVADrawer {
    private int canvasH;
    private int canvasW;
    private final HashMap<SVGAVideoShapeEntity, Path> drawPathCache;
    private final HashMap<String, Bitmap> drawTextCache;

    @NotNull
    private final SVGADynamicEntity dynamicItem;
    private Paint mDevPaint;
    private float[] matrixArray;
    private final PorterDuffXfermode porterDuffXfermode;
    private final Matrix sharedFrameMatrix;
    private final Paint sharedPaint;
    private final Path sharedPath;
    private final Path sharedPath2;
    private final Matrix sharedShapeMatrix;
    private final float[] tValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SVGACanvasDrawer(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull SVGADynamicEntity sVGADynamicEntity) {
        super(sVGAVideoEntity);
        sVGAVideoEntity.getClass();
        sVGADynamicEntity.getClass();
        this.dynamicItem = sVGADynamicEntity;
        this.sharedPaint = new Paint();
        this.sharedPath = new Path();
        this.sharedPath2 = new Path();
        this.sharedShapeMatrix = new Matrix();
        this.sharedFrameMatrix = new Matrix();
        this.drawTextCache = new HashMap<>();
        this.drawPathCache = new HashMap<>();
        this.matrixArray = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.tValues = new float[16];
    }

    private final void drawDev(Canvas canvas) {
        if (SVGAAdapterContainer.INSTANCE.getMShowDev()) {
            if (this.mDevPaint == null) {
                this.mDevPaint = new Paint();
            }
            Paint paint = this.mDevPaint;
            if (paint != null) {
                paint.setColor(-65536);
                paint.setAntiAlias(true);
                paint.setTextSize(60.0f);
                canvas.drawText("SVGA", canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
            }
        }
    }

    private final void drawDynamic(SGVADrawer.SVGADrawerSprite sprite, Canvas canvas, int frameIndex) {
        Function2<Canvas, Integer, Boolean> function2;
        String imageKey = sprite.getImageKey();
        if (imageKey == null || (function2 = this.dynamicItem.getDynamicDrawer$svgalibrary_release().get(imageKey)) == null) {
            return;
        }
        resetShareMatrix(sprite.getFrameEntity().getTransform());
        canvas.save();
        canvas.concat(this.sharedFrameMatrix);
        function2.invoke(canvas, Integer.valueOf(frameIndex));
        canvas.restore();
    }

    private final void drawImage(SGVADrawer.SVGADrawerSprite sprite, Canvas canvas) {
        String imageKey = sprite.getImageKey();
        if (imageKey != null) {
            Boolean bool = this.dynamicItem.getDynamicHidden$svgalibrary_release().get(imageKey);
            if (bool != null) {
                if (!bool.booleanValue()) {
                    bool = null;
                }
                if (bool != null) {
                    return;
                }
            }
            Bitmap bitmap = this.dynamicItem.getDynamicImage$svgalibrary_release().get(imageKey);
            if (bitmap == null) {
                bitmap = getVideoItem().getImages().get(imageKey);
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                resetShareMatrix(sprite.getFrameEntity().getTransform());
                this.sharedPaint.reset();
                this.sharedPaint.setAntiAlias(getVideoItem().getAntiAlias());
                this.sharedPaint.setFilterBitmap(getVideoItem().getAntiAlias());
                this.sharedPaint.setAlpha((int) (sprite.getFrameEntity().getAlpha() * 255.0d));
                if (sprite.getFrameEntity().getMaskPath() != null) {
                    SVGAPath maskPath = sprite.getFrameEntity().getMaskPath();
                    if (maskPath == null) {
                        return;
                    }
                    canvas.save();
                    this.sharedPath.reset();
                    maskPath.buildPath(this.sharedPath);
                    this.sharedPath.transform(this.sharedFrameMatrix);
                    canvas.clipPath(this.sharedPath);
                    this.sharedFrameMatrix.preScale((float) (sprite.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (sprite.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())));
                    canvas.drawBitmap(bitmap2, this.sharedFrameMatrix, this.sharedPaint);
                    canvas.restore();
                } else {
                    this.sharedFrameMatrix.preScale((float) (sprite.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (sprite.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())));
                    canvas.drawBitmap(bitmap2, this.sharedFrameMatrix, this.sharedPaint);
                }
                IClickAreaListener iClickAreaListener = this.dynamicItem.getDynamicIClickArea$svgalibrary_release().get(imageKey);
                if (iClickAreaListener != null) {
                    this.sharedFrameMatrix.getValues(this.matrixArray);
                    float[] fArr = this.matrixArray;
                    int i = (int) fArr[2];
                    int i2 = (int) fArr[5];
                    float width = bitmap2.getWidth();
                    float[] fArr2 = this.matrixArray;
                    int i3 = (int) ((width * fArr2[0]) + fArr2[2]);
                    float height = bitmap2.getHeight();
                    float[] fArr3 = this.matrixArray;
                    iClickAreaListener.onResponseArea(imageKey, i, i2, i3, (int) ((height * fArr3[4]) + fArr3[5]));
                }
                drawText(canvas, bitmap2, sprite);
            }
        }
    }

    private final void drawShape(SGVADrawer.SVGADrawerSprite sprite, Canvas canvas) {
        int fill;
        resetShareMatrix(sprite.getFrameEntity().getTransform());
        for (SVGAVideoShapeEntity sVGAVideoShapeEntity : sprite.getFrameEntity().getShapes()) {
            sVGAVideoShapeEntity.buildPath();
            if (sVGAVideoShapeEntity.getShapePath() != null) {
                this.sharedPaint.reset();
                this.sharedPaint.setAntiAlias(getVideoItem().getAntiAlias());
                this.sharedPaint.setAlpha((int) (sprite.getFrameEntity().getAlpha() * 255.0d));
                if (!this.drawPathCache.containsKey(sVGAVideoShapeEntity)) {
                    Path path = new Path();
                    path.set(sVGAVideoShapeEntity.getShapePath());
                    this.drawPathCache.put(sVGAVideoShapeEntity, path);
                }
                this.sharedPath.reset();
                this.sharedPath.addPath(new Path(this.drawPathCache.get(sVGAVideoShapeEntity)));
                this.sharedShapeMatrix.reset();
                Matrix transform = sVGAVideoShapeEntity.getTransform();
                if (transform != null) {
                    this.sharedShapeMatrix.postConcat(transform);
                }
                this.sharedShapeMatrix.postConcat(this.sharedFrameMatrix);
                this.sharedPath.transform(this.sharedShapeMatrix);
                SVGAVideoShapeEntity.Styles styles = sVGAVideoShapeEntity.getStyles();
                if (styles != null && (fill = styles.getFill()) != 0) {
                    this.sharedPaint.setColor(fill);
                    this.sharedPaint.setAlpha(Math.min(255, Math.max(0, (int) (sprite.getFrameEntity().getAlpha() * 255.0d))));
                    if (sprite.getFrameEntity().getMaskPath() != null) {
                        canvas.save();
                    }
                    SVGAPath maskPath = sprite.getFrameEntity().getMaskPath();
                    if (maskPath != null) {
                        this.sharedPath2.reset();
                        maskPath.buildPath(this.sharedPath2);
                        this.sharedPath2.transform(this.sharedFrameMatrix);
                        canvas.clipPath(this.sharedPath2);
                    }
                    canvas.drawPath(this.sharedPath, this.sharedPaint);
                    if (sprite.getFrameEntity().getMaskPath() != null) {
                        canvas.restore();
                    }
                }
                SVGAVideoShapeEntity.Styles styles2 = sVGAVideoShapeEntity.getStyles();
                if (styles2 != null && styles2.getStrokeWidth() > 0.0f) {
                    resetShapeStrokePaint(sVGAVideoShapeEntity);
                    this.sharedPaint.setAlpha(Math.min(255, Math.max(0, (int) (sprite.getFrameEntity().getAlpha() * 255.0d))));
                    if (sprite.getFrameEntity().getMaskPath() != null) {
                        canvas.save();
                    }
                    SVGAPath maskPath2 = sprite.getFrameEntity().getMaskPath();
                    if (maskPath2 != null) {
                        this.sharedPath2.reset();
                        maskPath2.buildPath(this.sharedPath2);
                        this.sharedPath2.transform(this.sharedFrameMatrix);
                        canvas.clipPath(this.sharedPath2);
                    }
                    canvas.drawPath(this.sharedPath, this.sharedPaint);
                    if (sprite.getFrameEntity().getMaskPath() != null) {
                        canvas.restore();
                    }
                }
            }
        }
    }

    private final void drawSprite(SGVADrawer.SVGADrawerSprite sprite, Canvas canvas, int frameIndex) {
        drawImage(sprite, canvas);
        drawShape(sprite, canvas);
        drawDynamic(sprite, canvas, frameIndex);
        drawDev(canvas);
    }

    private final void drawText(Canvas canvas, Bitmap drawingBitmap, SGVADrawer.SVGADrawerSprite sprite) {
        Layout boringLayout;
        TextPaint textPaint;
        if (this.dynamicItem.getIsTextDirty()) {
            this.drawTextCache.clear();
            this.dynamicItem.setTextDirty$svgalibrary_release(false);
        }
        String imageKey = sprite.getImageKey();
        if (imageKey != null) {
            String str = this.dynamicItem.getDynamicText$svgalibrary_release().get(imageKey);
            Bitmap bitmapCreateBitmap = null;
            if (str != null && (textPaint = this.dynamicItem.getDynamicTextPaint$svgalibrary_release().get(imageKey)) != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                textPaint.setAntiAlias(true);
                Rect rect = new Rect();
                textPaint.getTextBounds(str, 0, str.length(), rect);
                canvas2.drawText(str, (float) (((double) (drawingBitmap.getWidth() - rect.width())) / 2.0d), ((drawingBitmap.getHeight() - textPaint.getFontMetrics().bottom) - textPaint.getFontMetrics().top) / 2.0f, textPaint);
                HashMap<String, Bitmap> map = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    C0799b.m4641a("null cannot be cast to non-null type android.graphics.Bitmap");
                    return;
                }
                map.put(imageKey, bitmapCreateBitmap);
            }
            BoringLayoutBean boringLayoutBean = this.dynamicItem.getDynamicBoringLayoutText$svgalibrary_release().get(imageKey);
            if (boringLayoutBean != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                boringLayoutBean.getPaint().setAntiAlias(true);
                if (BoringLayout.isBoring(boringLayoutBean.getText(), boringLayoutBean.getPaint()) == null) {
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(boringLayoutBean.getText(), boringLayoutBean.getPaint(), drawingBitmap.getWidth(), boringLayoutBean.getEllipsize());
                    boringLayout = new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), boringLayoutBean.getPaint(), drawingBitmap.getWidth(), boringLayoutBean.getAlignment(), 1.0f, 0.0f, false);
                } else {
                    boringLayout = new BoringLayout(boringLayoutBean.getText(), boringLayoutBean.getPaint(), drawingBitmap.getWidth(), boringLayoutBean.getAlignment(), 1.0f, 0.0f, BoringLayout.isBoring(boringLayoutBean.getText(), boringLayoutBean.getPaint()), false, boringLayoutBean.getEllipsize(), drawingBitmap.getWidth());
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
                canvas3.translate(0.0f, (drawingBitmap.getHeight() - boringLayout.getHeight()) / 2);
                boringLayout.draw(canvas3);
                HashMap<String, Bitmap> map2 = this.drawTextCache;
                if (bitmapCreateBitmap2 == null) {
                    C0799b.m4641a("null cannot be cast to non-null type android.graphics.Bitmap");
                    return;
                } else {
                    map2.put(imageKey, bitmapCreateBitmap2);
                    bitmapCreateBitmap = bitmapCreateBitmap2;
                }
            }
            StaticLayoutBean staticLayoutBean = this.dynamicItem.getDynamicStaticLayoutText$svgalibrary_release().get(imageKey);
            if (staticLayoutBean != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                staticLayoutBean.getPaint().setAntiAlias(true);
                StaticLayout staticLayout = new StaticLayout(staticLayoutBean.getText(), 0, staticLayoutBean.getText().length(), staticLayoutBean.getPaint(), drawingBitmap.getWidth(), staticLayoutBean.getAlignment(), 1.0f, 0.0f, false);
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas4 = new Canvas(bitmapCreateBitmap3);
                canvas4.translate(0.0f, (drawingBitmap.getHeight() - staticLayout.getHeight()) / 2);
                staticLayout.draw(canvas4);
                HashMap<String, Bitmap> map3 = this.drawTextCache;
                if (bitmapCreateBitmap3 == null) {
                    C0799b.m4641a("null cannot be cast to non-null type android.graphics.Bitmap");
                    return;
                } else {
                    map3.put(imageKey, bitmapCreateBitmap3);
                    bitmapCreateBitmap = bitmapCreateBitmap3;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.sharedPaint.reset();
                this.sharedPaint.setAntiAlias(getVideoItem().getAntiAlias());
                this.sharedPaint.setAlpha((int) (sprite.getFrameEntity().getAlpha() * 255.0d));
                if (sprite.getFrameEntity().getMaskPath() == null) {
                    this.sharedPaint.setFilterBitmap(getVideoItem().getAntiAlias());
                    canvas.drawBitmap(bitmapCreateBitmap, this.sharedFrameMatrix, this.sharedPaint);
                    return;
                }
                SVGAPath maskPath = sprite.getFrameEntity().getMaskPath();
                if (maskPath != null) {
                    canvas.save();
                    canvas.concat(this.sharedFrameMatrix);
                    canvas.clipRect(0, 0, drawingBitmap.getWidth(), drawingBitmap.getHeight());
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    this.sharedPaint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                    this.sharedPath.reset();
                    maskPath.buildPath(this.sharedPath);
                    canvas.drawPath(this.sharedPath, this.sharedPaint);
                    canvas.restore();
                }
            }
        }
    }

    private final void playAudio(int frameIndex) {
        SoundPool soundPool;
        Integer soundID;
        for (SVGAAudioEntity sVGAAudioEntity : getVideoItem().getAudios()) {
            if (sVGAAudioEntity.getStartFrame() == frameIndex && (soundPool = getVideoItem().getSoundPool()) != null && (soundID = sVGAAudioEntity.getSoundID()) != null) {
                sVGAAudioEntity.setPlayID(Integer.valueOf(soundPool.play(soundID.intValue(), 1.0f, 1.0f, 1, 0, 1.0f)));
            }
            if (sVGAAudioEntity.getEndFrame() <= frameIndex) {
                Integer playID = sVGAAudioEntity.getPlayID();
                if (playID != null) {
                    int iIntValue = playID.intValue();
                    SoundPool soundPool2 = getVideoItem().getSoundPool();
                    if (soundPool2 != null) {
                        soundPool2.stop(iIntValue);
                    }
                }
                sVGAAudioEntity.setPlayID(null);
            }
        }
    }

    private final float requestScale() {
        this.sharedFrameMatrix.getValues(this.tValues);
        float[] fArr = this.tValues;
        float f = fArr[0];
        if (f == 0.0f) {
            return 0.0f;
        }
        double d = f;
        double d2 = fArr[3];
        double d3 = fArr[1];
        double d4 = fArr[4];
        if (d * d4 == d2 * d3) {
            return 0.0f;
        }
        double dSqrt = Math.sqrt((d * d) + (d2 * d2));
        double d5 = d / dSqrt;
        double d6 = d2 / dSqrt;
        double d7 = (d5 * d3) + (d6 * d4);
        double d8 = d3 - (d5 * d7);
        double d9 = d4 - (d7 * d6);
        double dSqrt2 = Math.sqrt((d8 * d8) + (d9 * d9));
        if (d5 * (d9 / dSqrt2) < d6 * (d8 / dSqrt2)) {
            dSqrt = -dSqrt;
        }
        return getScaleEntity().getRatio() / Math.abs(getScaleEntity().getRatioX() ? (float) dSqrt : (float) dSqrt2);
    }

    private final void resetCachePath(Canvas canvas) {
        if (this.canvasW != canvas.getWidth() || this.canvasH != canvas.getHeight()) {
            this.drawPathCache.clear();
        }
        this.canvasW = canvas.getWidth();
        this.canvasH = canvas.getHeight();
    }

    private final void resetShapeStrokePaint(SVGAVideoShapeEntity shape) {
        float[] lineDash;
        String lineJoin;
        String lineCap;
        this.sharedPaint.reset();
        this.sharedPaint.setAntiAlias(getVideoItem().getAntiAlias());
        this.sharedPaint.setStyle(Paint.Style.STROKE);
        SVGAVideoShapeEntity.Styles styles = shape.getStyles();
        if (styles != null) {
            this.sharedPaint.setColor(styles.getStroke());
        }
        float fRequestScale = requestScale();
        SVGAVideoShapeEntity.Styles styles2 = shape.getStyles();
        if (styles2 != null) {
            this.sharedPaint.setStrokeWidth(styles2.getStrokeWidth() * fRequestScale);
        }
        SVGAVideoShapeEntity.Styles styles3 = shape.getStyles();
        if (styles3 != null && (lineCap = styles3.getLineCap()) != null) {
            if (C15493d.m94381x(lineCap, "butt", true)) {
                this.sharedPaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (C15493d.m94381x(lineCap, "round", true)) {
                this.sharedPaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (C15493d.m94381x(lineCap, Square.TYPE, true)) {
                this.sharedPaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        SVGAVideoShapeEntity.Styles styles4 = shape.getStyles();
        if (styles4 != null && (lineJoin = styles4.getLineJoin()) != null) {
            if (C15493d.m94381x(lineJoin, "miter", true)) {
                this.sharedPaint.setStrokeJoin(Paint.Join.MITER);
            } else if (C15493d.m94381x(lineJoin, "round", true)) {
                this.sharedPaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (C15493d.m94381x(lineJoin, "bevel", true)) {
                this.sharedPaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        SVGAVideoShapeEntity.Styles styles5 = shape.getStyles();
        if (styles5 != null) {
            this.sharedPaint.setStrokeMiter(styles5.getMiterLimit() * fRequestScale);
        }
        SVGAVideoShapeEntity.Styles styles6 = shape.getStyles();
        if (styles6 == null || (lineDash = styles6.getLineDash()) == null || lineDash.length != 3) {
            return;
        }
        if (lineDash[0] > 0.0f || lineDash[1] > 0.0f) {
            Paint paint = this.sharedPaint;
            float f = lineDash[0];
            if (f < 1.0f) {
                f = 1.0f;
            }
            float f2 = f * fRequestScale;
            float f3 = lineDash[1];
            if (f3 < 0.1f) {
                f3 = 0.1f;
            }
            paint.setPathEffect(new DashPathEffect(new float[]{f2, f3 * fRequestScale}, lineDash[2] * fRequestScale));
        }
    }

    private final void resetShareMatrix(Matrix transform) {
        this.sharedFrameMatrix.reset();
        this.sharedFrameMatrix.postScale(getScaleEntity().getScaleFx(), getScaleEntity().getScaleFy());
        this.sharedFrameMatrix.postTranslate(getScaleEntity().getTranFx(), getScaleEntity().getTranFy());
        this.sharedFrameMatrix.preConcat(transform);
    }

    @Override // com.immomo.svgaplayer.SGVADrawer
    public void drawFrame(@NotNull Canvas canvas, int frameIndex, @NotNull ImageView.ScaleType scaleType) {
        canvas.getClass();
        scaleType.getClass();
        super.drawFrame(canvas, frameIndex, scaleType);
        resetCachePath(canvas);
        Iterator<T> it = requestFrameSprites$svgalibrary_release(frameIndex).iterator();
        while (it.hasNext()) {
            drawSprite((SGVADrawer.SVGADrawerSprite) it.next(), canvas, frameIndex);
        }
        playAudio(frameIndex);
    }

    @NotNull
    public final SVGADynamicEntity getDynamicItem() {
        return this.dynamicItem;
    }
}
