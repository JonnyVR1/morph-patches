package com.immomo.svgaplayer;

import android.graphics.Matrix;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.svgaplayer.proto.FrameEntity;
import com.immomo.svgaplayer.proto.Layout;
import com.immomo.svgaplayer.proto.ShapeEntity;
import com.immomo.svgaplayer.proto.Transform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAVideoSpriteFrameEntity;", "", "obj", "Lcom/immomo/svgaplayer/proto/FrameEntity;", "(Lcom/immomo/svgaplayer/proto/FrameEntity;)V", "alpha", "", "getAlpha", "()D", "setAlpha", "(D)V", "layout", "Lcom/immomo/svgaplayer/SVGARect;", "getLayout", "()Lcom/immomo/svgaplayer/SVGARect;", "setLayout", "(Lcom/immomo/svgaplayer/SVGARect;)V", "maskPath", "Lcom/immomo/svgaplayer/SVGAPath;", "getMaskPath", "()Lcom/immomo/svgaplayer/SVGAPath;", "setMaskPath", "(Lcom/immomo/svgaplayer/SVGAPath;)V", "shapes", "", "Lcom/immomo/svgaplayer/SVGAVideoShapeEntity;", "getShapes", "()Ljava/util/List;", "setShapes", "(Ljava/util/List;)V", "transform", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class SVGAVideoSpriteFrameEntity {
    private double alpha;

    @NotNull
    private SVGARect layout;

    @Nullable
    private SVGAPath maskPath;

    @NotNull
    private List<SVGAVideoShapeEntity> shapes;

    @NotNull
    private Matrix transform;

    public SVGAVideoSpriteFrameEntity(@NotNull FrameEntity frameEntity) {
        frameEntity.getClass();
        this.layout = new SVGARect(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.transform = new Matrix();
        this.shapes = CollectionsKt.emptyList();
        Float f = frameEntity.alpha;
        this.alpha = f != null ? f.floatValue() : 0.0f;
        Layout layout = frameEntity.layout;
        if (layout != null) {
            Float f2 = layout.f14781x;
            double dFloatValue = f2 != null ? f2.floatValue() : 0.0f;
            Float f3 = layout.f14782y;
            double dFloatValue2 = f3 != null ? f3.floatValue() : 0.0f;
            Float f4 = layout.width;
            double dFloatValue3 = f4 != null ? f4.floatValue() : 0.0f;
            Float f5 = layout.height;
            this.layout = new SVGARect(dFloatValue, dFloatValue2, dFloatValue3, f5 != null ? f5.floatValue() : 0.0f);
        }
        Transform transform = frameEntity.transform;
        if (transform != null) {
            Float f6 = transform.f14803a;
            float fFloatValue = f6 != null ? f6.floatValue() : 1.0f;
            Float f7 = transform.f14804b;
            float fFloatValue2 = f7 != null ? f7.floatValue() : 0.0f;
            Float f8 = transform.f14805c;
            float fFloatValue3 = f8 != null ? f8.floatValue() : 0.0f;
            Float f9 = transform.f14806d;
            float fFloatValue4 = f9 != null ? f9.floatValue() : 1.0f;
            Float f10 = transform.f14807tx;
            float fFloatValue5 = f10 != null ? f10.floatValue() : 0.0f;
            Float f11 = transform.f14808ty;
            this.transform.setValues(new float[]{fFloatValue, fFloatValue3, fFloatValue5, fFloatValue2, fFloatValue4, f11 != null ? f11.floatValue() : 0.0f, 0.0f, 0.0f, 1.0f});
        }
        String str = frameEntity.clipPath;
        if (str != null) {
            str = str.length() <= 0 ? null : str;
            if (str != null) {
                this.maskPath = new SVGAPath(str);
            }
        }
        List<ShapeEntity> list = frameEntity.shapes;
        list.getClass();
        List<ShapeEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ShapeEntity shapeEntity : list2) {
            shapeEntity.getClass();
            arrayList.add(new SVGAVideoShapeEntity(shapeEntity));
        }
        this.shapes = arrayList;
    }

    public final double getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final SVGARect getLayout() {
        return this.layout;
    }

    @Nullable
    public final SVGAPath getMaskPath() {
        return this.maskPath;
    }

    @NotNull
    public final List<SVGAVideoShapeEntity> getShapes() {
        return this.shapes;
    }

    @NotNull
    public final Matrix getTransform() {
        return this.transform;
    }

    public final void setAlpha(double d) {
        this.alpha = d;
    }

    public final void setLayout(@NotNull SVGARect sVGARect) {
        sVGARect.getClass();
        this.layout = sVGARect;
    }

    public final void setMaskPath(@Nullable SVGAPath sVGAPath) {
        this.maskPath = sVGAPath;
    }

    public final void setShapes(@NotNull List<SVGAVideoShapeEntity> list) {
        list.getClass();
        this.shapes = list;
    }

    public final void setTransform(@NotNull Matrix matrix) {
        matrix.getClass();
        this.transform = matrix;
    }
}
