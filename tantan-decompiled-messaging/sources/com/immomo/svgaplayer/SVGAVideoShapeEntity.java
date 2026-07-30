package com.immomo.svgaplayer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.TypedValue;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.immomo.svgaplayer.proto.ShapeEntity;
import com.immomo.svgaplayer.proto.Transform;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.p046p1.mobile.putong.core.data.Square;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u000234B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020+H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R@\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00065"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGAVideoShapeEntity;", "", "obj", "Lcom/immomo/svgaplayer/proto/ShapeEntity;", "(Lcom/immomo/svgaplayer/proto/ShapeEntity;)V", "<set-?>", "", "", "args", "getArgs", "()Ljava/util/Map;", "setArgs", "(Ljava/util/Map;)V", "isKeep", "", "()Z", "shapePath", "Landroid/graphics/Path;", "getShapePath", "()Landroid/graphics/Path;", "setShapePath", "(Landroid/graphics/Path;)V", "Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Styles;", "styles", "getStyles", "()Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Styles;", "setStyles", "(Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Styles;)V", "Landroid/graphics/Matrix;", "transform", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Type;", "type", "getType", "()Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Type;", "setType", "(Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Type;)V", "buildPath", "", "dip2px", "", "context", "Landroid/content/Context;", "dpvalue", "parseArgs", "parseStyles", "parseTransform", "parseType", "Styles", "Type", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGAVideoShapeEntity {

    @Nullable
    private Map<String, ? extends Object> args;

    @Nullable
    private Path shapePath;

    @Nullable
    private Styles styles;

    @Nullable
    private Matrix transform;

    @NotNull
    private Type type;

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR$\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Styles;", "", "()V", "<set-?>", "", "fill", "getFill", "()I", "setFill$svgalibrary_release", "(I)V", "", "lineCap", "getLineCap", "()Ljava/lang/String;", "setLineCap$svgalibrary_release", "(Ljava/lang/String;)V", "", "lineDash", "getLineDash", "()[F", "setLineDash$svgalibrary_release", "([F)V", "lineJoin", "getLineJoin", "setLineJoin$svgalibrary_release", "miterLimit", "getMiterLimit", "setMiterLimit$svgalibrary_release", "stroke", "getStroke", "setStroke$svgalibrary_release", "", "strokeWidth", "getStrokeWidth", "()F", "setStrokeWidth$svgalibrary_release", "(F)V", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public static final class Styles {
        private int fill;
        private int miterLimit;
        private int stroke;
        private float strokeWidth;

        @NotNull
        private String lineCap = "butt";

        @NotNull
        private String lineJoin = "miter";

        @NotNull
        private float[] lineDash = new float[0];

        public final int getFill() {
            return this.fill;
        }

        @NotNull
        public final String getLineCap() {
            return this.lineCap;
        }

        @NotNull
        public final float[] getLineDash() {
            return this.lineDash;
        }

        @NotNull
        public final String getLineJoin() {
            return this.lineJoin;
        }

        public final int getMiterLimit() {
            return this.miterLimit;
        }

        public final int getStroke() {
            return this.stroke;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public final void setFill$svgalibrary_release(int i) {
            this.fill = i;
        }

        public final void setLineCap$svgalibrary_release(@NotNull String str) {
            str.getClass();
            this.lineCap = str;
        }

        public final void setLineDash$svgalibrary_release(@NotNull float[] fArr) {
            fArr.getClass();
            this.lineDash = fArr;
        }

        public final void setLineJoin$svgalibrary_release(@NotNull String str) {
            str.getClass();
            this.lineJoin = str;
        }

        public final void setMiterLimit$svgalibrary_release(int i) {
            this.miterLimit = i;
        }

        public final void setStroke$svgalibrary_release(int i) {
            this.stroke = i;
        }

        public final void setStrokeWidth$svgalibrary_release(float f) {
            this.strokeWidth = f;
        }
    }

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGAVideoShapeEntity$Type;", "", "(Ljava/lang/String;I)V", "shape", "rect", "ellipse", "keep", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
    public enum Type {
        shape,
        rect,
        ellipse,
        keep
    }

    @Metadata(m87230bv = {1, 0, 2}, m87233k = 3, m87234mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ShapeEntity.ShapeType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ShapeEntity.ShapeType.SHAPE.ordinal()] = 1;
            iArr[ShapeEntity.ShapeType.RECT.ordinal()] = 2;
            iArr[ShapeEntity.ShapeType.ELLIPSE.ordinal()] = 3;
            iArr[ShapeEntity.ShapeType.KEEP.ordinal()] = 4;
            int[] iArr2 = new int[ShapeEntity.ShapeStyle.LineCap.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_BUTT.ordinal()] = 1;
            iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_ROUND.ordinal()] = 2;
            iArr2[ShapeEntity.ShapeStyle.LineCap.LineCap_SQUARE.ordinal()] = 3;
            int[] iArr3 = new int[ShapeEntity.ShapeStyle.LineJoin.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_BEVEL.ordinal()] = 1;
            iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_MITER.ordinal()] = 2;
            iArr3[ShapeEntity.ShapeStyle.LineJoin.LineJoin_ROUND.ordinal()] = 3;
        }
    }

    public SVGAVideoShapeEntity(@NotNull ShapeEntity shapeEntity) {
        shapeEntity.getClass();
        this.type = Type.shape;
        parseType(shapeEntity);
        parseArgs(shapeEntity);
        parseStyles(shapeEntity);
        parseTransform(shapeEntity);
    }

    private final float dip2px(Context context, float dpvalue) {
        return Math.round(TypedValue.applyDimension(1, dpvalue, context.getResources().getDisplayMetrics()));
    }

    private final void parseArgs(ShapeEntity obj) {
        String str;
        Float fValueOf = Float.valueOf(0.0f);
        HashMap map = new HashMap();
        ShapeEntity.ShapeArgs shapeArgs = obj.shape;
        if (shapeArgs != null && (str = shapeArgs.f14074d) != null) {
            map.put(Constants.INAPP_DATA_TAG, str);
        }
        ShapeEntity.EllipseArgs ellipseArgs = obj.ellipse;
        if (ellipseArgs != null) {
            Float f = ellipseArgs.f14066x;
            if (f == null) {
                f = fValueOf;
            }
            map.put(BaseSei.f13930X, f);
            Float f2 = ellipseArgs.f14067y;
            if (f2 == null) {
                f2 = fValueOf;
            }
            map.put(BaseSei.f13931Y, f2);
            Float f3 = ellipseArgs.radiusX;
            if (f3 == null) {
                f3 = fValueOf;
            }
            map.put("radiusX", f3);
            Float f4 = ellipseArgs.radiusY;
            if (f4 == null) {
                f4 = fValueOf;
            }
            map.put("radiusY", f4);
        }
        ShapeEntity.RectArgs rectArgs = obj.rect;
        if (rectArgs != null) {
            Float f5 = rectArgs.f14070x;
            if (f5 == null) {
                f5 = fValueOf;
            }
            map.put(BaseSei.f13930X, f5);
            Float f6 = rectArgs.f14071y;
            if (f6 == null) {
                f6 = fValueOf;
            }
            map.put(BaseSei.f13931Y, f6);
            Float f7 = rectArgs.width;
            if (f7 == null) {
                f7 = fValueOf;
            }
            map.put("width", f7);
            Float f8 = rectArgs.height;
            if (f8 == null) {
                f8 = fValueOf;
            }
            map.put("height", f8);
            Float f9 = rectArgs.cornerRadius;
            if (f9 != null) {
                fValueOf = f9;
            }
            map.put("cornerRadius", fValueOf);
        }
        this.args = map;
    }

    private final void parseStyles(ShapeEntity obj) {
        ShapeEntity.ShapeStyle shapeStyle = obj.styles;
        if (shapeStyle != null) {
            Styles styles = new Styles();
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor = shapeStyle.fill;
            if (rGBAColor != null) {
                Float f = rGBAColor.f14076a;
                int iFloatValue = (int) ((f != null ? f.floatValue() : 0.0f) * 255.0f);
                Float f2 = rGBAColor.f14079r;
                int iFloatValue2 = (int) ((f2 != null ? f2.floatValue() : 0.0f) * 255.0f);
                Float f3 = rGBAColor.f14078g;
                int iFloatValue3 = (int) ((f3 != null ? f3.floatValue() : 0.0f) * 255.0f);
                Float f4 = rGBAColor.f14077b;
                styles.setFill$svgalibrary_release(Color.argb(iFloatValue, iFloatValue2, iFloatValue3, (int) ((f4 != null ? f4.floatValue() : 0.0f) * 255.0f)));
            }
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor2 = shapeStyle.stroke;
            if (rGBAColor2 != null) {
                Float f5 = rGBAColor2.f14076a;
                int iFloatValue4 = (int) ((f5 != null ? f5.floatValue() : 0.0f) * 255.0f);
                Float f6 = rGBAColor2.f14079r;
                int iFloatValue5 = (int) ((f6 != null ? f6.floatValue() : 0.0f) * 255.0f);
                Float f7 = rGBAColor2.f14078g;
                int iFloatValue6 = (int) ((f7 != null ? f7.floatValue() : 0.0f) * 255.0f);
                Float f8 = rGBAColor2.f14077b;
                styles.setStroke$svgalibrary_release(Color.argb(iFloatValue4, iFloatValue5, iFloatValue6, (int) ((f8 != null ? f8.floatValue() : 0.0f) * 255.0f)));
            }
            Float f9 = shapeStyle.strokeWidth;
            float fFloatValue = f9 != null ? f9.floatValue() : 0.0f;
            Context mContext = SVGAAdapterContainer.INSTANCE.getMContext();
            if (mContext != null) {
                fFloatValue = dip2px(mContext, fFloatValue / 2.0f);
            }
            styles.setStrokeWidth$svgalibrary_release(fFloatValue);
            ShapeEntity.ShapeStyle.LineCap lineCap = shapeStyle.lineCap;
            if (lineCap != null) {
                int i = WhenMappings.$EnumSwitchMapping$1[lineCap.ordinal()];
                if (i == 1) {
                    styles.setLineCap$svgalibrary_release("butt");
                } else if (i == 2) {
                    styles.setLineCap$svgalibrary_release("round");
                } else if (i == 3) {
                    styles.setLineCap$svgalibrary_release(Square.TYPE);
                }
            }
            ShapeEntity.ShapeStyle.LineJoin lineJoin = shapeStyle.lineJoin;
            if (lineJoin != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$2[lineJoin.ordinal()];
                if (i2 == 1) {
                    styles.setLineJoin$svgalibrary_release("bevel");
                } else if (i2 == 2) {
                    styles.setLineJoin$svgalibrary_release("miter");
                } else if (i2 == 3) {
                    styles.setLineJoin$svgalibrary_release("round");
                }
            }
            Float f10 = shapeStyle.miterLimit;
            styles.setMiterLimit$svgalibrary_release((int) (f10 != null ? f10.floatValue() : 0.0f));
            styles.setLineDash$svgalibrary_release(new float[3]);
            Float f11 = shapeStyle.lineDashI;
            if (f11 != null) {
                styles.getLineDash()[0] = f11.floatValue();
            }
            Float f12 = shapeStyle.lineDashII;
            if (f12 != null) {
                styles.getLineDash()[1] = f12.floatValue();
            }
            Float f13 = shapeStyle.lineDashIII;
            if (f13 != null) {
                styles.getLineDash()[2] = f13.floatValue();
            }
            this.styles = styles;
        }
    }

    private final void parseTransform(ShapeEntity obj) {
        Transform transform = obj.transform;
        if (transform != null) {
            Matrix matrix = new Matrix();
            Float f = transform.f14084a;
            float fFloatValue = f != null ? f.floatValue() : 1.0f;
            Float f2 = transform.f14085b;
            float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
            Float f3 = transform.f14086c;
            float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
            Float f4 = transform.f14087d;
            float fFloatValue4 = f4 != null ? f4.floatValue() : 1.0f;
            Float f5 = transform.f14088tx;
            float fFloatValue5 = f5 != null ? f5.floatValue() : 0.0f;
            Float f6 = transform.f14089ty;
            matrix.setValues(new float[]{fFloatValue, fFloatValue3, fFloatValue5, fFloatValue2, fFloatValue4, f6 != null ? f6.floatValue() : 0.0f, 0.0f, 0.0f, 1.0f});
            this.transform = matrix;
        }
    }

    private final void parseType(ShapeEntity obj) {
        Type type;
        ShapeEntity.ShapeType shapeType = obj.type;
        if (shapeType != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[shapeType.ordinal()];
            if (i == 1) {
                type = Type.shape;
            } else if (i == 2) {
                type = Type.rect;
            } else if (i == 3) {
                type = Type.ellipse;
            } else {
                if (i != 4) {
                    l9r.m149037a();
                    return;
                }
                type = Type.keep;
            }
            this.type = type;
        }
    }

    private final void setArgs(Map<String, ? extends Object> map) {
        this.args = map;
    }

    private final void setStyles(Styles styles) {
        this.styles = styles;
    }

    private final void setTransform(Matrix matrix) {
        this.transform = matrix;
    }

    private final void setType(Type type) {
        this.type = type;
    }

    public final void buildPath() {
        if (this.shapePath != null) {
            return;
        }
        SVGAVideoShapeEntityKt.getSharedPath().reset();
        Type type = this.type;
        if (type == Type.shape) {
            Map<String, ? extends Object> map = this.args;
            Object obj = map != null ? map.get(Constants.INAPP_DATA_TAG) : null;
            String str = (String) (obj instanceof String ? obj : null);
            if (str != null) {
                new SVGAPath(str).buildPath(SVGAVideoShapeEntityKt.getSharedPath());
            }
        } else if (type == Type.ellipse) {
            Map<String, ? extends Object> map2 = this.args;
            Object obj2 = map2 != null ? map2.get(BaseSei.f13930X) : null;
            if (!(obj2 instanceof Number)) {
                obj2 = null;
            }
            Number number = (Number) obj2;
            if (number == null) {
                return;
            }
            Map<String, ? extends Object> map3 = this.args;
            Object obj3 = map3 != null ? map3.get(BaseSei.f13931Y) : null;
            if (!(obj3 instanceof Number)) {
                obj3 = null;
            }
            Number number2 = (Number) obj3;
            if (number2 == null) {
                return;
            }
            Map<String, ? extends Object> map4 = this.args;
            Object obj4 = map4 != null ? map4.get("radiusX") : null;
            if (!(obj4 instanceof Number)) {
                obj4 = null;
            }
            Number number3 = (Number) obj4;
            if (number3 == null) {
                return;
            }
            Map<String, ? extends Object> map5 = this.args;
            Object obj5 = map5 != null ? map5.get("radiusY") : null;
            Number number4 = (Number) (obj5 instanceof Number ? obj5 : null);
            if (number4 == null) {
                return;
            }
            float fFloatValue = number.floatValue();
            float fFloatValue2 = number2.floatValue();
            float fFloatValue3 = number3.floatValue();
            float fFloatValue4 = number4.floatValue();
            SVGAVideoShapeEntityKt.getSharedPath().addOval(new RectF(fFloatValue - fFloatValue3, fFloatValue2 - fFloatValue4, fFloatValue + fFloatValue3, fFloatValue2 + fFloatValue4), Path.Direction.CW);
        } else if (type == Type.rect) {
            Map<String, ? extends Object> map6 = this.args;
            Object obj6 = map6 != null ? map6.get(BaseSei.f13930X) : null;
            if (!(obj6 instanceof Number)) {
                obj6 = null;
            }
            Number number5 = (Number) obj6;
            if (number5 == null) {
                return;
            }
            Map<String, ? extends Object> map7 = this.args;
            Object obj7 = map7 != null ? map7.get(BaseSei.f13931Y) : null;
            if (!(obj7 instanceof Number)) {
                obj7 = null;
            }
            Number number6 = (Number) obj7;
            if (number6 == null) {
                return;
            }
            Map<String, ? extends Object> map8 = this.args;
            Object obj8 = map8 != null ? map8.get("width") : null;
            if (!(obj8 instanceof Number)) {
                obj8 = null;
            }
            Number number7 = (Number) obj8;
            if (number7 == null) {
                return;
            }
            Map<String, ? extends Object> map9 = this.args;
            Object obj9 = map9 != null ? map9.get("height") : null;
            if (!(obj9 instanceof Number)) {
                obj9 = null;
            }
            Number number8 = (Number) obj9;
            if (number8 == null) {
                return;
            }
            Map<String, ? extends Object> map10 = this.args;
            Object obj10 = map10 != null ? map10.get("cornerRadius") : null;
            Number number9 = (Number) (obj10 instanceof Number ? obj10 : null);
            if (number9 == null) {
                return;
            }
            float fFloatValue5 = number5.floatValue();
            float fFloatValue6 = number6.floatValue();
            float fFloatValue7 = number7.floatValue();
            float fFloatValue8 = number8.floatValue();
            float fFloatValue9 = number9.floatValue();
            SVGAVideoShapeEntityKt.getSharedPath().addRoundRect(new RectF(fFloatValue5, fFloatValue6, fFloatValue7 + fFloatValue5, fFloatValue8 + fFloatValue6), fFloatValue9, fFloatValue9, Path.Direction.CW);
        }
        Path path = new Path();
        this.shapePath = path;
        path.set(SVGAVideoShapeEntityKt.getSharedPath());
    }

    @Nullable
    public final Map<String, Object> getArgs() {
        return this.args;
    }

    @Nullable
    public final Path getShapePath() {
        return this.shapePath;
    }

    @Nullable
    public final Styles getStyles() {
        return this.styles;
    }

    @Nullable
    public final Matrix getTransform() {
        return this.transform;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public final boolean isKeep() {
        return this.type == Type.keep;
    }

    public final void setShapePath(@Nullable Path path) {
        this.shapePath = path;
    }
}
