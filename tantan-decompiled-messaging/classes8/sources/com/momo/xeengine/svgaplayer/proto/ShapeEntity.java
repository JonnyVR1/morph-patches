package com.momo.xeengine.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import l.ig3;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class ShapeEntity extends Message<ShapeEntity, Builder> {
    public static final ProtoAdapter<ShapeEntity> ADAPTER = new ProtoAdapter_ShapeEntity();
    public static final ShapeType DEFAULT_TYPE = ShapeType.SHAPE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$EllipseArgs#ADAPTER", tag = 4)
    public final EllipseArgs ellipse;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$RectArgs#ADAPTER", tag = 3)
    public final RectArgs rect;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeArgs#ADAPTER", tag = 2)
    public final ShapeArgs shape;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle#ADAPTER", tag = 10)
    public final ShapeStyle styles;

    @WireField(adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER", tag = 11)
    public final Transform transform;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeType#ADAPTER", tag = 1)
    public final ShapeType type;

    public static final class Builder extends Message.Builder<ShapeEntity, Builder> {
        public EllipseArgs ellipse;
        public RectArgs rect;
        public ShapeArgs shape;
        public ShapeStyle styles;
        public Transform transform;
        public ShapeType type;

        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public ShapeEntity m12145build() {
            return new ShapeEntity(this.type, this.styles, this.transform, this.shape, this.rect, this.ellipse, super.buildUnknownFields());
        }

        public Builder ellipse(EllipseArgs ellipseArgs) {
            this.ellipse = ellipseArgs;
            this.shape = null;
            this.rect = null;
            return this;
        }

        public Builder rect(RectArgs rectArgs) {
            this.rect = rectArgs;
            this.shape = null;
            this.ellipse = null;
            return this;
        }

        public Builder shape(ShapeArgs shapeArgs) {
            this.shape = shapeArgs;
            this.rect = null;
            this.ellipse = null;
            return this;
        }

        public Builder styles(ShapeStyle shapeStyle) {
            this.styles = shapeStyle;
            return this;
        }

        public Builder transform(Transform transform) {
            this.transform = transform;
            return this;
        }

        public Builder type(ShapeType shapeType) {
            this.type = shapeType;
            return this;
        }
    }

    public static final class ProtoAdapter_ShapeEntity extends ProtoAdapter<ShapeEntity> {
        public ProtoAdapter_ShapeEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, ShapeEntity.class);
        }

        /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ShapeEntity m12149decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.m12145build();
                }
                if (iNextTag == 1) {
                    try {
                        builder.type((ShapeType) ShapeType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else if (iNextTag == 2) {
                    builder.shape((ShapeArgs) ShapeArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.rect((RectArgs) RectArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.ellipse((EllipseArgs) EllipseArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 10) {
                    builder.styles((ShapeStyle) ShapeStyle.ADAPTER.decode(protoReader));
                } else if (iNextTag != 11) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.transform((Transform) Transform.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ShapeEntity shapeEntity) throws IOException {
            ShapeType shapeType = shapeEntity.type;
            if (shapeType != null) {
                ShapeType.ADAPTER.encodeWithTag(protoWriter, 1, shapeType);
            }
            ShapeStyle shapeStyle = shapeEntity.styles;
            if (shapeStyle != null) {
                ShapeStyle.ADAPTER.encodeWithTag(protoWriter, 10, shapeStyle);
            }
            Transform transform = shapeEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.encodeWithTag(protoWriter, 11, transform);
            }
            ShapeArgs shapeArgs = shapeEntity.shape;
            if (shapeArgs != null) {
                ShapeArgs.ADAPTER.encodeWithTag(protoWriter, 2, shapeArgs);
            }
            RectArgs rectArgs = shapeEntity.rect;
            if (rectArgs != null) {
                RectArgs.ADAPTER.encodeWithTag(protoWriter, 3, rectArgs);
            }
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            if (ellipseArgs != null) {
                EllipseArgs.ADAPTER.encodeWithTag(protoWriter, 4, ellipseArgs);
            }
            protoWriter.writeBytes(shapeEntity.unknownFields());
        }

        public int encodedSize(ShapeEntity shapeEntity) {
            ShapeType shapeType = shapeEntity.type;
            int iEncodedSizeWithTag = shapeType != null ? ShapeType.ADAPTER.encodedSizeWithTag(1, shapeType) : 0;
            ShapeStyle shapeStyle = shapeEntity.styles;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (shapeStyle != null ? ShapeStyle.ADAPTER.encodedSizeWithTag(10, shapeStyle) : 0);
            Transform transform = shapeEntity.transform;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (transform != null ? Transform.ADAPTER.encodedSizeWithTag(11, transform) : 0);
            ShapeArgs shapeArgs = shapeEntity.shape;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (shapeArgs != null ? ShapeArgs.ADAPTER.encodedSizeWithTag(2, shapeArgs) : 0);
            RectArgs rectArgs = shapeEntity.rect;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (rectArgs != null ? RectArgs.ADAPTER.encodedSizeWithTag(3, rectArgs) : 0);
            EllipseArgs ellipseArgs = shapeEntity.ellipse;
            return iEncodedSizeWithTag5 + (ellipseArgs != null ? EllipseArgs.ADAPTER.encodedSizeWithTag(4, ellipseArgs) : 0) + shapeEntity.unknownFields().size();
        }

        public ShapeEntity redact(ShapeEntity shapeEntity) {
            Builder builderM12144newBuilder = shapeEntity.m12144newBuilder();
            ShapeStyle shapeStyle = builderM12144newBuilder.styles;
            if (shapeStyle != null) {
                builderM12144newBuilder.styles = (ShapeStyle) ShapeStyle.ADAPTER.redact(shapeStyle);
            }
            Transform transform = builderM12144newBuilder.transform;
            if (transform != null) {
                builderM12144newBuilder.transform = (Transform) Transform.ADAPTER.redact(transform);
            }
            ShapeArgs shapeArgs = builderM12144newBuilder.shape;
            if (shapeArgs != null) {
                builderM12144newBuilder.shape = (ShapeArgs) ShapeArgs.ADAPTER.redact(shapeArgs);
            }
            RectArgs rectArgs = builderM12144newBuilder.rect;
            if (rectArgs != null) {
                builderM12144newBuilder.rect = (RectArgs) RectArgs.ADAPTER.redact(rectArgs);
            }
            EllipseArgs ellipseArgs = builderM12144newBuilder.ellipse;
            if (ellipseArgs != null) {
                builderM12144newBuilder.ellipse = (EllipseArgs) EllipseArgs.ADAPTER.redact(ellipseArgs);
            }
            builderM12144newBuilder.clearUnknownFields();
            return builderM12144newBuilder.m12145build();
        }
    }

    public enum ShapeType implements WireEnum {
        SHAPE(0),
        RECT(1),
        ELLIPSE(2),
        KEEP(3);

        public static final ProtoAdapter<ShapeType> ADAPTER = ProtoAdapter.newEnumAdapter(ShapeType.class);
        private final int value;

        ShapeType(int i) {
            this.value = i;
        }

        public static ShapeType fromValue(int i) {
            if (i == 0) {
                return SHAPE;
            }
            if (i == 1) {
                return RECT;
            }
            if (i == 2) {
                return ELLIPSE;
            }
            if (i != 3) {
                return null;
            }
            return KEEP;
        }

        public int getValue() {
            return this.value;
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(shapeArgs, rectArgs, ellipseArgs) > 1) {
            ig3.a("at most one of shape, rect, ellipse may be non-null");
            throw null;
        }
        this.type = shapeType;
        this.styles = shapeStyle;
        this.transform = transform;
        this.shape = shapeArgs;
        this.rect = rectArgs;
        this.ellipse = ellipseArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShapeEntity)) {
            return false;
        }
        ShapeEntity shapeEntity = (ShapeEntity) obj;
        return unknownFields().equals(shapeEntity.unknownFields()) && Internal.equals(this.type, shapeEntity.type) && Internal.equals(this.styles, shapeEntity.styles) && Internal.equals(this.transform, shapeEntity.transform) && Internal.equals(this.shape, shapeEntity.shape) && Internal.equals(this.rect, shapeEntity.rect) && Internal.equals(this.ellipse, shapeEntity.ellipse);
    }

    public int hashCode() {
        int i = ((Message) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ShapeType shapeType = this.type;
        int iHashCode2 = (iHashCode + (shapeType != null ? shapeType.hashCode() : 0)) * 37;
        ShapeStyle shapeStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (shapeStyle != null ? shapeStyle.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        ShapeArgs shapeArgs = this.shape;
        int iHashCode5 = (iHashCode4 + (shapeArgs != null ? shapeArgs.hashCode() : 0)) * 37;
        RectArgs rectArgs = this.rect;
        int iHashCode6 = (iHashCode5 + (rectArgs != null ? rectArgs.hashCode() : 0)) * 37;
        EllipseArgs ellipseArgs = this.ellipse;
        int iHashCode7 = iHashCode6 + (ellipseArgs != null ? ellipseArgs.hashCode() : 0);
        ((Message) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m12144newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.styles = this.styles;
        builder.transform = this.transform;
        builder.shape = this.shape;
        builder.rect = this.rect;
        builder.ellipse = this.ellipse;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.styles != null) {
            sb.append(", styles=");
            sb.append(this.styles);
        }
        if (this.transform != null) {
            sb.append(", transform=");
            sb.append(this.transform);
        }
        if (this.shape != null) {
            sb.append(", shape=");
            sb.append(this.shape);
        }
        if (this.rect != null) {
            sb.append(", rect=");
            sb.append(this.rect);
        }
        if (this.ellipse != null) {
            sb.append(", ellipse=");
            sb.append(this.ellipse);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "ShapeEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class ShapeArgs extends Message<ShapeArgs, Builder> {
        public static final ProtoAdapter<ShapeArgs> ADAPTER = new ProtoAdapter_ShapeArgs();
        public static final String DEFAULT_D = "";
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
        public final String f423d;

        public static final class Builder extends Message.Builder<ShapeArgs, Builder> {

            /* JADX INFO: renamed from: d */
            public String f424d;

            /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
            public ShapeArgs m12154build() {
                return new ShapeArgs(this.f424d, super.buildUnknownFields());
            }

            /* JADX INFO: renamed from: d */
            public Builder m593d(String str) {
                this.f424d = str;
                return this;
            }
        }

        public static final class ProtoAdapter_ShapeArgs extends ProtoAdapter<ShapeArgs> {
            public ProtoAdapter_ShapeArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeArgs.class);
            }

            /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
            public ShapeArgs m12155decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.m12154build();
                    }
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.m593d((String) ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            public void encode(ProtoWriter protoWriter, ShapeArgs shapeArgs) throws IOException {
                String str = shapeArgs.f423d;
                if (str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
                }
                protoWriter.writeBytes(shapeArgs.unknownFields());
            }

            public int encodedSize(ShapeArgs shapeArgs) {
                String str = shapeArgs.f423d;
                return (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0) + shapeArgs.unknownFields().size();
            }

            public ShapeArgs redact(ShapeArgs shapeArgs) {
                Builder builderM12153newBuilder = shapeArgs.m12153newBuilder();
                builderM12153newBuilder.clearUnknownFields();
                return builderM12153newBuilder.m12154build();
            }
        }

        public ShapeArgs(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f423d = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeArgs)) {
                return false;
            }
            ShapeArgs shapeArgs = (ShapeArgs) obj;
            return unknownFields().equals(shapeArgs.unknownFields()) && Internal.equals(this.f423d, shapeArgs.f423d);
        }

        public int hashCode() {
            int i = ((Message) this).hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.f423d;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            ((Message) this).hashCode = iHashCode2;
            return iHashCode2;
        }

        /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
        public Builder m12153newBuilder() {
            Builder builder = new Builder();
            builder.f424d = this.f423d;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f423d != null) {
                sb.append(", d=");
                sb.append(this.f423d);
            }
            StringBuilder sbReplace = sb.replace(0, 2, "ShapeArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }

        public ShapeArgs(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    public static final class ShapeStyle extends Message<ShapeStyle, Builder> {
        public static final ProtoAdapter<ShapeStyle> ADAPTER = new ProtoAdapter_ShapeStyle();
        public static final LineCap DEFAULT_LINECAP;
        public static final Float DEFAULT_LINEDASHI;
        public static final Float DEFAULT_LINEDASHII;
        public static final Float DEFAULT_LINEDASHIII;
        public static final LineJoin DEFAULT_LINEJOIN;
        public static final Float DEFAULT_MITERLIMIT;
        public static final Float DEFAULT_STROKEWIDTH;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 1)
        public final RGBAColor fill;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineCap#ADAPTER", tag = 4)
        public final LineCap lineCap;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 7)
        public final Float lineDashI;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 8)
        public final Float lineDashII;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 9)
        public final Float lineDashIII;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$LineJoin#ADAPTER", tag = 5)
        public final LineJoin lineJoin;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
        public final Float miterLimit;

        @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity$ShapeStyle$RGBAColor#ADAPTER", tag = 2)
        public final RGBAColor stroke;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float strokeWidth;

        public static final class Builder extends Message.Builder<ShapeStyle, Builder> {
            public RGBAColor fill;
            public LineCap lineCap;
            public Float lineDashI;
            public Float lineDashII;
            public Float lineDashIII;
            public LineJoin lineJoin;
            public Float miterLimit;
            public RGBAColor stroke;
            public Float strokeWidth;

            /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
            public ShapeStyle m12157build() {
                return new ShapeStyle(this.fill, this.stroke, this.strokeWidth, this.lineCap, this.lineJoin, this.miterLimit, this.lineDashI, this.lineDashII, this.lineDashIII, super.buildUnknownFields());
            }

            public Builder fill(RGBAColor rGBAColor) {
                this.fill = rGBAColor;
                return this;
            }

            public Builder lineCap(LineCap lineCap) {
                this.lineCap = lineCap;
                return this;
            }

            public Builder lineDashI(Float f) {
                this.lineDashI = f;
                return this;
            }

            public Builder lineDashII(Float f) {
                this.lineDashII = f;
                return this;
            }

            public Builder lineDashIII(Float f) {
                this.lineDashIII = f;
                return this;
            }

            public Builder lineJoin(LineJoin lineJoin) {
                this.lineJoin = lineJoin;
                return this;
            }

            public Builder miterLimit(Float f) {
                this.miterLimit = f;
                return this;
            }

            public Builder stroke(RGBAColor rGBAColor) {
                this.stroke = rGBAColor;
                return this;
            }

            public Builder strokeWidth(Float f) {
                this.strokeWidth = f;
                return this;
            }
        }

        public enum LineCap implements WireEnum {
            LineCap_BUTT(0),
            LineCap_ROUND(1),
            LineCap_SQUARE(2);

            public static final ProtoAdapter<LineCap> ADAPTER = ProtoAdapter.newEnumAdapter(LineCap.class);
            private final int value;

            LineCap(int i) {
                this.value = i;
            }

            public static LineCap fromValue(int i) {
                if (i == 0) {
                    return LineCap_BUTT;
                }
                if (i == 1) {
                    return LineCap_ROUND;
                }
                if (i != 2) {
                    return null;
                }
                return LineCap_SQUARE;
            }

            public int getValue() {
                return this.value;
            }
        }

        public enum LineJoin implements WireEnum {
            LineJoin_MITER(0),
            LineJoin_ROUND(1),
            LineJoin_BEVEL(2);

            public static final ProtoAdapter<LineJoin> ADAPTER = ProtoAdapter.newEnumAdapter(LineJoin.class);
            private final int value;

            LineJoin(int i) {
                this.value = i;
            }

            public static LineJoin fromValue(int i) {
                if (i == 0) {
                    return LineJoin_MITER;
                }
                if (i == 1) {
                    return LineJoin_ROUND;
                }
                if (i != 2) {
                    return null;
                }
                return LineJoin_BEVEL;
            }

            public int getValue() {
                return this.value;
            }
        }

        public static final class ProtoAdapter_ShapeStyle extends ProtoAdapter<ShapeStyle> {
            public ProtoAdapter_ShapeStyle() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeStyle.class);
            }

            /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
            public ShapeStyle m12158decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.m12157build();
                    }
                    switch (iNextTag) {
                        case 1:
                            builder.fill((RGBAColor) RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.stroke((RGBAColor) RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.strokeWidth((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.lineCap((LineCap) LineCap.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            try {
                                builder.lineJoin((LineJoin) LineJoin.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            builder.miterLimit((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            builder.lineDashI((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 8:
                            builder.lineDashII((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 9:
                            builder.lineDashIII((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                }
            }

            public void encode(ProtoWriter protoWriter, ShapeStyle shapeStyle) throws IOException {
                RGBAColor rGBAColor = shapeStyle.fill;
                if (rGBAColor != null) {
                    RGBAColor.ADAPTER.encodeWithTag(protoWriter, 1, rGBAColor);
                }
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                if (rGBAColor2 != null) {
                    RGBAColor.ADAPTER.encodeWithTag(protoWriter, 2, rGBAColor2);
                }
                Float f = shapeStyle.strokeWidth;
                if (f != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f);
                }
                LineCap lineCap = shapeStyle.lineCap;
                if (lineCap != null) {
                    LineCap.ADAPTER.encodeWithTag(protoWriter, 4, lineCap);
                }
                LineJoin lineJoin = shapeStyle.lineJoin;
                if (lineJoin != null) {
                    LineJoin.ADAPTER.encodeWithTag(protoWriter, 5, lineJoin);
                }
                Float f2 = shapeStyle.miterLimit;
                if (f2 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, f2);
                }
                Float f3 = shapeStyle.lineDashI;
                if (f3 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 7, f3);
                }
                Float f4 = shapeStyle.lineDashII;
                if (f4 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 8, f4);
                }
                Float f5 = shapeStyle.lineDashIII;
                if (f5 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 9, f5);
                }
                protoWriter.writeBytes(shapeStyle.unknownFields());
            }

            public int encodedSize(ShapeStyle shapeStyle) {
                RGBAColor rGBAColor = shapeStyle.fill;
                int iEncodedSizeWithTag = rGBAColor != null ? RGBAColor.ADAPTER.encodedSizeWithTag(1, rGBAColor) : 0;
                RGBAColor rGBAColor2 = shapeStyle.stroke;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (rGBAColor2 != null ? RGBAColor.ADAPTER.encodedSizeWithTag(2, rGBAColor2) : 0);
                Float f = shapeStyle.strokeWidth;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f) : 0);
                LineCap lineCap = shapeStyle.lineCap;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (lineCap != null ? LineCap.ADAPTER.encodedSizeWithTag(4, lineCap) : 0);
                LineJoin lineJoin = shapeStyle.lineJoin;
                int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (lineJoin != null ? LineJoin.ADAPTER.encodedSizeWithTag(5, lineJoin) : 0);
                Float f2 = shapeStyle.miterLimit;
                int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, f2) : 0);
                Float f3 = shapeStyle.lineDashI;
                int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(7, f3) : 0);
                Float f4 = shapeStyle.lineDashII;
                int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(8, f4) : 0);
                Float f5 = shapeStyle.lineDashIII;
                return iEncodedSizeWithTag8 + (f5 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(9, f5) : 0) + shapeStyle.unknownFields().size();
            }

            public ShapeStyle redact(ShapeStyle shapeStyle) {
                Builder builderM12156newBuilder = shapeStyle.m12156newBuilder();
                RGBAColor rGBAColor = builderM12156newBuilder.fill;
                if (rGBAColor != null) {
                    builderM12156newBuilder.fill = (RGBAColor) RGBAColor.ADAPTER.redact(rGBAColor);
                }
                RGBAColor rGBAColor2 = builderM12156newBuilder.stroke;
                if (rGBAColor2 != null) {
                    builderM12156newBuilder.stroke = (RGBAColor) RGBAColor.ADAPTER.redact(rGBAColor2);
                }
                builderM12156newBuilder.clearUnknownFields();
                return builderM12156newBuilder.m12157build();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_STROKEWIDTH = fValueOf;
            DEFAULT_LINECAP = LineCap.LineCap_BUTT;
            DEFAULT_LINEJOIN = LineJoin.LineJoin_MITER;
            DEFAULT_MITERLIMIT = fValueOf;
            DEFAULT_LINEDASHI = fValueOf;
            DEFAULT_LINEDASHII = fValueOf;
            DEFAULT_LINEDASHIII = fValueOf;
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f, LineCap lineCap, LineJoin lineJoin, Float f2, Float f3, Float f4, Float f5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.fill = rGBAColor;
            this.stroke = rGBAColor2;
            this.strokeWidth = f;
            this.lineCap = lineCap;
            this.lineJoin = lineJoin;
            this.miterLimit = f2;
            this.lineDashI = f3;
            this.lineDashII = f4;
            this.lineDashIII = f5;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeStyle)) {
                return false;
            }
            ShapeStyle shapeStyle = (ShapeStyle) obj;
            return unknownFields().equals(shapeStyle.unknownFields()) && Internal.equals(this.fill, shapeStyle.fill) && Internal.equals(this.stroke, shapeStyle.stroke) && Internal.equals(this.strokeWidth, shapeStyle.strokeWidth) && Internal.equals(this.lineCap, shapeStyle.lineCap) && Internal.equals(this.lineJoin, shapeStyle.lineJoin) && Internal.equals(this.miterLimit, shapeStyle.miterLimit) && Internal.equals(this.lineDashI, shapeStyle.lineDashI) && Internal.equals(this.lineDashII, shapeStyle.lineDashII) && Internal.equals(this.lineDashIII, shapeStyle.lineDashIII);
        }

        public int hashCode() {
            int i = ((Message) this).hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            RGBAColor rGBAColor = this.fill;
            int iHashCode2 = (iHashCode + (rGBAColor != null ? rGBAColor.hashCode() : 0)) * 37;
            RGBAColor rGBAColor2 = this.stroke;
            int iHashCode3 = (iHashCode2 + (rGBAColor2 != null ? rGBAColor2.hashCode() : 0)) * 37;
            Float f = this.strokeWidth;
            int iHashCode4 = (iHashCode3 + (f != null ? f.hashCode() : 0)) * 37;
            LineCap lineCap = this.lineCap;
            int iHashCode5 = (iHashCode4 + (lineCap != null ? lineCap.hashCode() : 0)) * 37;
            LineJoin lineJoin = this.lineJoin;
            int iHashCode6 = (iHashCode5 + (lineJoin != null ? lineJoin.hashCode() : 0)) * 37;
            Float f2 = this.miterLimit;
            int iHashCode7 = (iHashCode6 + (f2 != null ? f2.hashCode() : 0)) * 37;
            Float f3 = this.lineDashI;
            int iHashCode8 = (iHashCode7 + (f3 != null ? f3.hashCode() : 0)) * 37;
            Float f4 = this.lineDashII;
            int iHashCode9 = (iHashCode8 + (f4 != null ? f4.hashCode() : 0)) * 37;
            Float f5 = this.lineDashIII;
            int iHashCode10 = iHashCode9 + (f5 != null ? f5.hashCode() : 0);
            ((Message) this).hashCode = iHashCode10;
            return iHashCode10;
        }

        /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
        public Builder m12156newBuilder() {
            Builder builder = new Builder();
            builder.fill = this.fill;
            builder.stroke = this.stroke;
            builder.strokeWidth = this.strokeWidth;
            builder.lineCap = this.lineCap;
            builder.lineJoin = this.lineJoin;
            builder.miterLimit = this.miterLimit;
            builder.lineDashI = this.lineDashI;
            builder.lineDashII = this.lineDashII;
            builder.lineDashIII = this.lineDashIII;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.fill != null) {
                sb.append(", fill=");
                sb.append(this.fill);
            }
            if (this.stroke != null) {
                sb.append(", stroke=");
                sb.append(this.stroke);
            }
            if (this.strokeWidth != null) {
                sb.append(", strokeWidth=");
                sb.append(this.strokeWidth);
            }
            if (this.lineCap != null) {
                sb.append(", lineCap=");
                sb.append(this.lineCap);
            }
            if (this.lineJoin != null) {
                sb.append(", lineJoin=");
                sb.append(this.lineJoin);
            }
            if (this.miterLimit != null) {
                sb.append(", miterLimit=");
                sb.append(this.miterLimit);
            }
            if (this.lineDashI != null) {
                sb.append(", lineDashI=");
                sb.append(this.lineDashI);
            }
            if (this.lineDashII != null) {
                sb.append(", lineDashII=");
                sb.append(this.lineDashII);
            }
            if (this.lineDashIII != null) {
                sb.append(", lineDashIII=");
                sb.append(this.lineDashIII);
            }
            StringBuilder sbReplace = sb.replace(0, 2, "ShapeStyle{");
            sbReplace.append('}');
            return sbReplace.toString();
        }

        public static final class RGBAColor extends Message<RGBAColor, Builder> {
            public static final ProtoAdapter<RGBAColor> ADAPTER = new ProtoAdapter_RGBAColor();
            public static final Float DEFAULT_A;
            public static final Float DEFAULT_B;
            public static final Float DEFAULT_G;
            public static final Float DEFAULT_R;
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: a */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
            public final Float f425a;

            /* JADX INFO: renamed from: b */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
            public final Float f426b;

            /* JADX INFO: renamed from: g */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
            public final Float f427g;

            /* JADX INFO: renamed from: r */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
            public final Float f428r;

            public static final class Builder extends Message.Builder<RGBAColor, Builder> {

                /* JADX INFO: renamed from: a */
                public Float f429a;

                /* JADX INFO: renamed from: b */
                public Float f430b;

                /* JADX INFO: renamed from: g */
                public Float f431g;

                /* JADX INFO: renamed from: r */
                public Float f432r;

                /* JADX INFO: renamed from: a */
                public Builder m594a(Float f) {
                    this.f429a = f;
                    return this;
                }

                /* JADX INFO: renamed from: b */
                public Builder m595b(Float f) {
                    this.f430b = f;
                    return this;
                }

                /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
                public RGBAColor m12160build() {
                    return new RGBAColor(this.f432r, this.f431g, this.f430b, this.f429a, super.buildUnknownFields());
                }

                /* JADX INFO: renamed from: g */
                public Builder m596g(Float f) {
                    this.f431g = f;
                    return this;
                }

                /* JADX INFO: renamed from: r */
                public Builder m597r(Float f) {
                    this.f432r = f;
                    return this;
                }
            }

            public static final class ProtoAdapter_RGBAColor extends ProtoAdapter<RGBAColor> {
                public ProtoAdapter_RGBAColor() {
                    super(FieldEncoding.LENGTH_DELIMITED, RGBAColor.class);
                }

                /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
                public RGBAColor m12161decode(ProtoReader protoReader) throws IOException {
                    Builder builder = new Builder();
                    long jBeginMessage = protoReader.beginMessage();
                    while (true) {
                        int iNextTag = protoReader.nextTag();
                        if (iNextTag == -1) {
                            protoReader.endMessage(jBeginMessage);
                            return builder.m12160build();
                        }
                        if (iNextTag == 1) {
                            builder.m597r((Float) ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 2) {
                            builder.m596g((Float) ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 3) {
                            builder.m595b((Float) ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag != 4) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            builder.m594a((Float) ProtoAdapter.FLOAT.decode(protoReader));
                        }
                    }
                }

                public void encode(ProtoWriter protoWriter, RGBAColor rGBAColor) throws IOException {
                    Float f = rGBAColor.f428r;
                    if (f != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                    }
                    Float f2 = rGBAColor.f427g;
                    if (f2 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
                    }
                    Float f3 = rGBAColor.f426b;
                    if (f3 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
                    }
                    Float f4 = rGBAColor.f425a;
                    if (f4 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
                    }
                    protoWriter.writeBytes(rGBAColor.unknownFields());
                }

                public int encodedSize(RGBAColor rGBAColor) {
                    Float f = rGBAColor.f428r;
                    int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                    Float f2 = rGBAColor.f427g;
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                    Float f3 = rGBAColor.f426b;
                    int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                    Float f4 = rGBAColor.f425a;
                    return iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0) + rGBAColor.unknownFields().size();
                }

                public RGBAColor redact(RGBAColor rGBAColor) {
                    Builder builderM12159newBuilder = rGBAColor.m12159newBuilder();
                    builderM12159newBuilder.clearUnknownFields();
                    return builderM12159newBuilder.m12160build();
                }
            }

            static {
                Float fValueOf = Float.valueOf(0.0f);
                DEFAULT_R = fValueOf;
                DEFAULT_G = fValueOf;
                DEFAULT_B = fValueOf;
                DEFAULT_A = fValueOf;
            }

            public RGBAColor(Float f, Float f2, Float f3, Float f4, ByteString byteString) {
                super(ADAPTER, byteString);
                this.f428r = f;
                this.f427g = f2;
                this.f426b = f3;
                this.f425a = f4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RGBAColor)) {
                    return false;
                }
                RGBAColor rGBAColor = (RGBAColor) obj;
                return unknownFields().equals(rGBAColor.unknownFields()) && Internal.equals(this.f428r, rGBAColor.f428r) && Internal.equals(this.f427g, rGBAColor.f427g) && Internal.equals(this.f426b, rGBAColor.f426b) && Internal.equals(this.f425a, rGBAColor.f425a);
            }

            public int hashCode() {
                int i = ((Message) this).hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Float f = this.f428r;
                int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
                Float f2 = this.f427g;
                int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
                Float f3 = this.f426b;
                int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
                Float f4 = this.f425a;
                int iHashCode5 = iHashCode4 + (f4 != null ? f4.hashCode() : 0);
                ((Message) this).hashCode = iHashCode5;
                return iHashCode5;
            }

            /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
            public Builder m12159newBuilder() {
                Builder builder = new Builder();
                builder.f432r = this.f428r;
                builder.f431g = this.f427g;
                builder.f430b = this.f426b;
                builder.f429a = this.f425a;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.f428r != null) {
                    sb.append(", r=");
                    sb.append(this.f428r);
                }
                if (this.f427g != null) {
                    sb.append(", g=");
                    sb.append(this.f427g);
                }
                if (this.f426b != null) {
                    sb.append(", b=");
                    sb.append(this.f426b);
                }
                if (this.f425a != null) {
                    sb.append(", a=");
                    sb.append(this.f425a);
                }
                StringBuilder sbReplace = sb.replace(0, 2, "RGBAColor{");
                sbReplace.append('}');
                return sbReplace.toString();
            }

            public RGBAColor(Float f, Float f2, Float f3, Float f4) {
                this(f, f2, f3, f4, ByteString.EMPTY);
            }
        }

        public ShapeStyle(RGBAColor rGBAColor, RGBAColor rGBAColor2, Float f, LineCap lineCap, LineJoin lineJoin, Float f2, Float f3, Float f4, Float f5) {
            this(rGBAColor, rGBAColor2, f, lineCap, lineJoin, f2, f3, f4, f5, ByteString.EMPTY);
        }
    }

    public static final class EllipseArgs extends Message<EllipseArgs, Builder> {
        public static final ProtoAdapter<EllipseArgs> ADAPTER = new ProtoAdapter_EllipseArgs();
        public static final Float DEFAULT_RADIUSX;
        public static final Float DEFAULT_RADIUSY;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float radiusX;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float radiusY;

        /* JADX INFO: renamed from: x */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float f415x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f416y;

        public static final class Builder extends Message.Builder<EllipseArgs, Builder> {
            public Float radiusX;
            public Float radiusY;

            /* JADX INFO: renamed from: x */
            public Float f417x;

            /* JADX INFO: renamed from: y */
            public Float f418y;

            /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
            public EllipseArgs m12147build() {
                return new EllipseArgs(this.f417x, this.f418y, this.radiusX, this.radiusY, super.buildUnknownFields());
            }

            public Builder radiusX(Float f) {
                this.radiusX = f;
                return this;
            }

            public Builder radiusY(Float f) {
                this.radiusY = f;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m589x(Float f) {
                this.f417x = f;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m590y(Float f) {
                this.f418y = f;
                return this;
            }
        }

        public static final class ProtoAdapter_EllipseArgs extends ProtoAdapter<EllipseArgs> {
            public ProtoAdapter_EllipseArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, EllipseArgs.class);
            }

            /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
            public EllipseArgs m12148decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.m12147build();
                    }
                    if (iNextTag == 1) {
                        builder.m589x((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m590y((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.radiusX((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 4) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.radiusY((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            public void encode(ProtoWriter protoWriter, EllipseArgs ellipseArgs) throws IOException {
                Float f = ellipseArgs.f415x;
                if (f != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                }
                Float f2 = ellipseArgs.f416y;
                if (f2 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
                }
                Float f3 = ellipseArgs.radiusX;
                if (f3 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
                }
                Float f4 = ellipseArgs.radiusY;
                if (f4 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
                }
                protoWriter.writeBytes(ellipseArgs.unknownFields());
            }

            public int encodedSize(EllipseArgs ellipseArgs) {
                Float f = ellipseArgs.f415x;
                int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                Float f2 = ellipseArgs.f416y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                Float f3 = ellipseArgs.radiusX;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                Float f4 = ellipseArgs.radiusY;
                return iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0) + ellipseArgs.unknownFields().size();
            }

            public EllipseArgs redact(EllipseArgs ellipseArgs) {
                Builder builderM12146newBuilder = ellipseArgs.m12146newBuilder();
                builderM12146newBuilder.clearUnknownFields();
                return builderM12146newBuilder.m12147build();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_RADIUSX = fValueOf;
            DEFAULT_RADIUSY = fValueOf;
        }

        public EllipseArgs(Float f, Float f2, Float f3, Float f4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f415x = f;
            this.f416y = f2;
            this.radiusX = f3;
            this.radiusY = f4;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EllipseArgs)) {
                return false;
            }
            EllipseArgs ellipseArgs = (EllipseArgs) obj;
            return unknownFields().equals(ellipseArgs.unknownFields()) && Internal.equals(this.f415x, ellipseArgs.f415x) && Internal.equals(this.f416y, ellipseArgs.f416y) && Internal.equals(this.radiusX, ellipseArgs.radiusX) && Internal.equals(this.radiusY, ellipseArgs.radiusY);
        }

        public int hashCode() {
            int i = ((Message) this).hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f = this.f415x;
            int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
            Float f2 = this.f416y;
            int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
            Float f3 = this.radiusX;
            int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
            Float f4 = this.radiusY;
            int iHashCode5 = iHashCode4 + (f4 != null ? f4.hashCode() : 0);
            ((Message) this).hashCode = iHashCode5;
            return iHashCode5;
        }

        /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
        public Builder m12146newBuilder() {
            Builder builder = new Builder();
            builder.f417x = this.f415x;
            builder.f418y = this.f416y;
            builder.radiusX = this.radiusX;
            builder.radiusY = this.radiusY;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f415x != null) {
                sb.append(", x=");
                sb.append(this.f415x);
            }
            if (this.f416y != null) {
                sb.append(", y=");
                sb.append(this.f416y);
            }
            if (this.radiusX != null) {
                sb.append(", radiusX=");
                sb.append(this.radiusX);
            }
            if (this.radiusY != null) {
                sb.append(", radiusY=");
                sb.append(this.radiusY);
            }
            StringBuilder sbReplace = sb.replace(0, 2, "EllipseArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }

        public EllipseArgs(Float f, Float f2, Float f3, Float f4) {
            this(f, f2, f3, f4, ByteString.EMPTY);
        }
    }

    public static final class RectArgs extends Message<RectArgs, Builder> {
        public static final ProtoAdapter<RectArgs> ADAPTER = new ProtoAdapter_RectArgs();
        public static final Float DEFAULT_CORNERRADIUS;
        public static final Float DEFAULT_HEIGHT;
        public static final Float DEFAULT_WIDTH;
        public static final Float DEFAULT_X;
        public static final Float DEFAULT_Y;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
        public final Float cornerRadius;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
        public final Float height;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
        public final Float width;

        /* JADX INFO: renamed from: x */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
        public final Float f419x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f420y;

        public static final class Builder extends Message.Builder<RectArgs, Builder> {
            public Float cornerRadius;
            public Float height;
            public Float width;

            /* JADX INFO: renamed from: x */
            public Float f421x;

            /* JADX INFO: renamed from: y */
            public Float f422y;

            /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
            public RectArgs m12151build() {
                return new RectArgs(this.f421x, this.f422y, this.width, this.height, this.cornerRadius, super.buildUnknownFields());
            }

            public Builder cornerRadius(Float f) {
                this.cornerRadius = f;
                return this;
            }

            public Builder height(Float f) {
                this.height = f;
                return this;
            }

            public Builder width(Float f) {
                this.width = f;
                return this;
            }

            /* JADX INFO: renamed from: x */
            public Builder m591x(Float f) {
                this.f421x = f;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m592y(Float f) {
                this.f422y = f;
                return this;
            }
        }

        public static final class ProtoAdapter_RectArgs extends ProtoAdapter<RectArgs> {
            public ProtoAdapter_RectArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, RectArgs.class);
            }

            /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
            public RectArgs m12152decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.m12151build();
                    }
                    if (iNextTag == 1) {
                        builder.m591x((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m592y((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.width((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 4) {
                        builder.height((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 5) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.cornerRadius((Float) ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            public void encode(ProtoWriter protoWriter, RectArgs rectArgs) throws IOException {
                Float f = rectArgs.f419x;
                if (f != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                }
                Float f2 = rectArgs.f420y;
                if (f2 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
                }
                Float f3 = rectArgs.width;
                if (f3 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
                }
                Float f4 = rectArgs.height;
                if (f4 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
                }
                Float f5 = rectArgs.cornerRadius;
                if (f5 != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, f5);
                }
                protoWriter.writeBytes(rectArgs.unknownFields());
            }

            public int encodedSize(RectArgs rectArgs) {
                Float f = rectArgs.f419x;
                int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                Float f2 = rectArgs.f420y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                Float f3 = rectArgs.width;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                Float f4 = rectArgs.height;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0);
                Float f5 = rectArgs.cornerRadius;
                return iEncodedSizeWithTag4 + (f5 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, f5) : 0) + rectArgs.unknownFields().size();
            }

            public RectArgs redact(RectArgs rectArgs) {
                Builder builderM12150newBuilder = rectArgs.m12150newBuilder();
                builderM12150newBuilder.clearUnknownFields();
                return builderM12150newBuilder.m12151build();
            }
        }

        static {
            Float fValueOf = Float.valueOf(0.0f);
            DEFAULT_X = fValueOf;
            DEFAULT_Y = fValueOf;
            DEFAULT_WIDTH = fValueOf;
            DEFAULT_HEIGHT = fValueOf;
            DEFAULT_CORNERRADIUS = fValueOf;
        }

        public RectArgs(Float f, Float f2, Float f3, Float f4, Float f5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f419x = f;
            this.f420y = f2;
            this.width = f3;
            this.height = f4;
            this.cornerRadius = f5;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RectArgs)) {
                return false;
            }
            RectArgs rectArgs = (RectArgs) obj;
            return unknownFields().equals(rectArgs.unknownFields()) && Internal.equals(this.f419x, rectArgs.f419x) && Internal.equals(this.f420y, rectArgs.f420y) && Internal.equals(this.width, rectArgs.width) && Internal.equals(this.height, rectArgs.height) && Internal.equals(this.cornerRadius, rectArgs.cornerRadius);
        }

        public int hashCode() {
            int i = ((Message) this).hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f = this.f419x;
            int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
            Float f2 = this.f420y;
            int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
            Float f3 = this.width;
            int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
            Float f4 = this.height;
            int iHashCode5 = (iHashCode4 + (f4 != null ? f4.hashCode() : 0)) * 37;
            Float f5 = this.cornerRadius;
            int iHashCode6 = iHashCode5 + (f5 != null ? f5.hashCode() : 0);
            ((Message) this).hashCode = iHashCode6;
            return iHashCode6;
        }

        /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
        public Builder m12150newBuilder() {
            Builder builder = new Builder();
            builder.f421x = this.f419x;
            builder.f422y = this.f420y;
            builder.width = this.width;
            builder.height = this.height;
            builder.cornerRadius = this.cornerRadius;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f419x != null) {
                sb.append(", x=");
                sb.append(this.f419x);
            }
            if (this.f420y != null) {
                sb.append(", y=");
                sb.append(this.f420y);
            }
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            if (this.height != null) {
                sb.append(", height=");
                sb.append(this.height);
            }
            if (this.cornerRadius != null) {
                sb.append(", cornerRadius=");
                sb.append(this.cornerRadius);
            }
            StringBuilder sbReplace = sb.replace(0, 2, "RectArgs{");
            sbReplace.append('}');
            return sbReplace.toString();
        }

        public RectArgs(Float f, Float f2, Float f3, Float f4, Float f5) {
            this(f, f2, f3, f4, f5, ByteString.EMPTY);
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs) {
        this(shapeType, shapeStyle, transform, shapeArgs, rectArgs, ellipseArgs, ByteString.EMPTY);
    }
}
