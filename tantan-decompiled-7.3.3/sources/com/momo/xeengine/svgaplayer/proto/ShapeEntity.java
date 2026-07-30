package com.momo.xeengine.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
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

        @Override // com.squareup.wire.Message.Builder
        public ShapeEntity build() {
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ShapeEntity decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    try {
                        builder.type(ShapeType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else if (iNextTag == 2) {
                    builder.shape(ShapeArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.rect(RectArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.ellipse(EllipseArgs.ADAPTER.decode(protoReader));
                } else if (iNextTag == 10) {
                    builder.styles(ShapeStyle.ADAPTER.decode(protoReader));
                } else if (iNextTag != 11) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.transform(Transform.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
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

        @Override // com.squareup.wire.ProtoAdapter
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

        @Override // com.squareup.wire.ProtoAdapter
        public ShapeEntity redact(ShapeEntity shapeEntity) throws EOFException {
            Builder builderNewBuilder = shapeEntity.newBuilder();
            ShapeStyle shapeStyle = builderNewBuilder.styles;
            if (shapeStyle != null) {
                builderNewBuilder.styles = ShapeStyle.ADAPTER.redact(shapeStyle);
            }
            Transform transform = builderNewBuilder.transform;
            if (transform != null) {
                builderNewBuilder.transform = Transform.ADAPTER.redact(transform);
            }
            ShapeArgs shapeArgs = builderNewBuilder.shape;
            if (shapeArgs != null) {
                builderNewBuilder.shape = ShapeArgs.ADAPTER.redact(shapeArgs);
            }
            RectArgs rectArgs = builderNewBuilder.rect;
            if (rectArgs != null) {
                builderNewBuilder.rect = RectArgs.ADAPTER.redact(rectArgs);
            }
            EllipseArgs ellipseArgs = builderNewBuilder.ellipse;
            if (ellipseArgs != null) {
                builderNewBuilder.ellipse = EllipseArgs.ADAPTER.redact(ellipseArgs);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
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

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }
    }

    public ShapeEntity(ShapeType shapeType, ShapeStyle shapeStyle, Transform transform, ShapeArgs shapeArgs, RectArgs rectArgs, EllipseArgs ellipseArgs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(shapeArgs, rectArgs, ellipseArgs) > 1) {
            wg3.m206174a("at most one of shape, rect, ellipse may be non-null");
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
        int i = this.hashCode;
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
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
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

    @Override // com.squareup.wire.Message
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
        public final String f15443d;

        public static final class Builder extends Message.Builder<ShapeArgs, Builder> {

            /* JADX INFO: renamed from: d */
            public String f15444d;

            @Override // com.squareup.wire.Message.Builder
            public ShapeArgs build() {
                return new ShapeArgs(this.f15444d, super.buildUnknownFields());
            }

            /* JADX INFO: renamed from: d */
            public Builder m21321d(String str) {
                this.f15444d = str;
                return this;
            }
        }

        public static final class ProtoAdapter_ShapeArgs extends ProtoAdapter<ShapeArgs> {
            public ProtoAdapter_ShapeArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.m21321d(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ShapeArgs shapeArgs) throws IOException {
                String str = shapeArgs.f15443d;
                if (str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
                }
                protoWriter.writeBytes(shapeArgs.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShapeArgs shapeArgs) {
                String str = shapeArgs.f15443d;
                return (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0) + shapeArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShapeArgs redact(ShapeArgs shapeArgs) throws EOFException {
                Builder builderNewBuilder = shapeArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
            }
        }

        public ShapeArgs(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.f15443d = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShapeArgs)) {
                return false;
            }
            ShapeArgs shapeArgs = (ShapeArgs) obj;
            return unknownFields().equals(shapeArgs.unknownFields()) && Internal.equals(this.f15443d, shapeArgs.f15443d);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.f15443d;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f15444d = this.f15443d;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f15443d != null) {
                sb.append(", d=");
                sb.append(this.f15443d);
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

            @Override // com.squareup.wire.Message.Builder
            public ShapeStyle build() {
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

            @Override // com.squareup.wire.WireEnum
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

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }
        }

        public static final class ProtoAdapter_ShapeStyle extends ProtoAdapter<ShapeStyle> {
            public ProtoAdapter_ShapeStyle() {
                super(FieldEncoding.LENGTH_DELIMITED, ShapeStyle.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShapeStyle decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    switch (iNextTag) {
                        case 1:
                            builder.fill(RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.stroke(RGBAColor.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.strokeWidth(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.lineCap(LineCap.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            try {
                                builder.lineJoin(LineJoin.ADAPTER.decode(protoReader));
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            builder.miterLimit(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            builder.lineDashI(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 8:
                            builder.lineDashII(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 9:
                            builder.lineDashIII(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
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

            @Override // com.squareup.wire.ProtoAdapter
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

            @Override // com.squareup.wire.ProtoAdapter
            public ShapeStyle redact(ShapeStyle shapeStyle) throws EOFException {
                Builder builderNewBuilder = shapeStyle.newBuilder();
                RGBAColor rGBAColor = builderNewBuilder.fill;
                if (rGBAColor != null) {
                    builderNewBuilder.fill = RGBAColor.ADAPTER.redact(rGBAColor);
                }
                RGBAColor rGBAColor2 = builderNewBuilder.stroke;
                if (rGBAColor2 != null) {
                    builderNewBuilder.stroke = RGBAColor.ADAPTER.redact(rGBAColor2);
                }
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
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
            int i = this.hashCode;
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
            this.hashCode = iHashCode10;
            return iHashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
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

        @Override // com.squareup.wire.Message
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
            public final Float f15445a;

            /* JADX INFO: renamed from: b */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
            public final Float f15446b;

            /* JADX INFO: renamed from: g */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
            public final Float f15447g;

            /* JADX INFO: renamed from: r */
            @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
            public final Float f15448r;

            public static final class Builder extends Message.Builder<RGBAColor, Builder> {

                /* JADX INFO: renamed from: a */
                public Float f15449a;

                /* JADX INFO: renamed from: b */
                public Float f15450b;

                /* JADX INFO: renamed from: g */
                public Float f15451g;

                /* JADX INFO: renamed from: r */
                public Float f15452r;

                /* JADX INFO: renamed from: a */
                public Builder m21322a(Float f) {
                    this.f15449a = f;
                    return this;
                }

                /* JADX INFO: renamed from: b */
                public Builder m21323b(Float f) {
                    this.f15450b = f;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public RGBAColor build() {
                    return new RGBAColor(this.f15452r, this.f15451g, this.f15450b, this.f15449a, super.buildUnknownFields());
                }

                /* JADX INFO: renamed from: g */
                public Builder m21324g(Float f) {
                    this.f15451g = f;
                    return this;
                }

                /* JADX INFO: renamed from: r */
                public Builder m21325r(Float f) {
                    this.f15452r = f;
                    return this;
                }
            }

            public static final class ProtoAdapter_RGBAColor extends ProtoAdapter<RGBAColor> {
                public ProtoAdapter_RGBAColor() {
                    super(FieldEncoding.LENGTH_DELIMITED, RGBAColor.class);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public RGBAColor decode(ProtoReader protoReader) throws IOException {
                    Builder builder = new Builder();
                    long jBeginMessage = protoReader.beginMessage();
                    while (true) {
                        int iNextTag = protoReader.nextTag();
                        if (iNextTag == -1) {
                            protoReader.endMessage(jBeginMessage);
                            return builder.build();
                        }
                        if (iNextTag == 1) {
                            builder.m21325r(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 2) {
                            builder.m21324g(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag == 3) {
                            builder.m21323b(ProtoAdapter.FLOAT.decode(protoReader));
                        } else if (iNextTag != 4) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            builder.m21322a(ProtoAdapter.FLOAT.decode(protoReader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, RGBAColor rGBAColor) throws IOException {
                    Float f = rGBAColor.f15448r;
                    if (f != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                    }
                    Float f2 = rGBAColor.f15447g;
                    if (f2 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
                    }
                    Float f3 = rGBAColor.f15446b;
                    if (f3 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
                    }
                    Float f4 = rGBAColor.f15445a;
                    if (f4 != null) {
                        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
                    }
                    protoWriter.writeBytes(rGBAColor.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RGBAColor rGBAColor) {
                    Float f = rGBAColor.f15448r;
                    int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                    Float f2 = rGBAColor.f15447g;
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                    Float f3 = rGBAColor.f15446b;
                    int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                    Float f4 = rGBAColor.f15445a;
                    return iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0) + rGBAColor.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RGBAColor redact(RGBAColor rGBAColor) throws EOFException {
                    Builder builderNewBuilder = rGBAColor.newBuilder();
                    builderNewBuilder.clearUnknownFields();
                    return builderNewBuilder.build();
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
                this.f15448r = f;
                this.f15447g = f2;
                this.f15446b = f3;
                this.f15445a = f4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RGBAColor)) {
                    return false;
                }
                RGBAColor rGBAColor = (RGBAColor) obj;
                return unknownFields().equals(rGBAColor.unknownFields()) && Internal.equals(this.f15448r, rGBAColor.f15448r) && Internal.equals(this.f15447g, rGBAColor.f15447g) && Internal.equals(this.f15446b, rGBAColor.f15446b) && Internal.equals(this.f15445a, rGBAColor.f15445a);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Float f = this.f15448r;
                int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
                Float f2 = this.f15447g;
                int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
                Float f3 = this.f15446b;
                int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
                Float f4 = this.f15445a;
                int iHashCode5 = iHashCode4 + (f4 != null ? f4.hashCode() : 0);
                this.hashCode = iHashCode5;
                return iHashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.f15452r = this.f15448r;
                builder.f15451g = this.f15447g;
                builder.f15450b = this.f15446b;
                builder.f15449a = this.f15445a;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.f15448r != null) {
                    sb.append(", r=");
                    sb.append(this.f15448r);
                }
                if (this.f15447g != null) {
                    sb.append(", g=");
                    sb.append(this.f15447g);
                }
                if (this.f15446b != null) {
                    sb.append(", b=");
                    sb.append(this.f15446b);
                }
                if (this.f15445a != null) {
                    sb.append(", a=");
                    sb.append(this.f15445a);
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
        public final Float f15435x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f15436y;

        public static final class Builder extends Message.Builder<EllipseArgs, Builder> {
            public Float radiusX;
            public Float radiusY;

            /* JADX INFO: renamed from: x */
            public Float f15437x;

            /* JADX INFO: renamed from: y */
            public Float f15438y;

            @Override // com.squareup.wire.Message.Builder
            public EllipseArgs build() {
                return new EllipseArgs(this.f15437x, this.f15438y, this.radiusX, this.radiusY, super.buildUnknownFields());
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
            public Builder m21317x(Float f) {
                this.f15437x = f;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m21318y(Float f) {
                this.f15438y = f;
                return this;
            }
        }

        public static final class ProtoAdapter_EllipseArgs extends ProtoAdapter<EllipseArgs> {
            public ProtoAdapter_EllipseArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, EllipseArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EllipseArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag == 1) {
                        builder.m21317x(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m21318y(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.radiusX(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 4) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.radiusY(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, EllipseArgs ellipseArgs) throws IOException {
                Float f = ellipseArgs.f15435x;
                if (f != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                }
                Float f2 = ellipseArgs.f15436y;
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

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EllipseArgs ellipseArgs) {
                Float f = ellipseArgs.f15435x;
                int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                Float f2 = ellipseArgs.f15436y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                Float f3 = ellipseArgs.radiusX;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                Float f4 = ellipseArgs.radiusY;
                return iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0) + ellipseArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EllipseArgs redact(EllipseArgs ellipseArgs) throws EOFException {
                Builder builderNewBuilder = ellipseArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
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
            this.f15435x = f;
            this.f15436y = f2;
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
            return unknownFields().equals(ellipseArgs.unknownFields()) && Internal.equals(this.f15435x, ellipseArgs.f15435x) && Internal.equals(this.f15436y, ellipseArgs.f15436y) && Internal.equals(this.radiusX, ellipseArgs.radiusX) && Internal.equals(this.radiusY, ellipseArgs.radiusY);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f = this.f15435x;
            int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
            Float f2 = this.f15436y;
            int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
            Float f3 = this.radiusX;
            int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
            Float f4 = this.radiusY;
            int iHashCode5 = iHashCode4 + (f4 != null ? f4.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f15437x = this.f15435x;
            builder.f15438y = this.f15436y;
            builder.radiusX = this.radiusX;
            builder.radiusY = this.radiusY;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f15435x != null) {
                sb.append(", x=");
                sb.append(this.f15435x);
            }
            if (this.f15436y != null) {
                sb.append(", y=");
                sb.append(this.f15436y);
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
        public final Float f15439x;

        /* JADX INFO: renamed from: y */
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
        public final Float f15440y;

        public static final class Builder extends Message.Builder<RectArgs, Builder> {
            public Float cornerRadius;
            public Float height;
            public Float width;

            /* JADX INFO: renamed from: x */
            public Float f15441x;

            /* JADX INFO: renamed from: y */
            public Float f15442y;

            @Override // com.squareup.wire.Message.Builder
            public RectArgs build() {
                return new RectArgs(this.f15441x, this.f15442y, this.width, this.height, this.cornerRadius, super.buildUnknownFields());
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
            public Builder m21319x(Float f) {
                this.f15441x = f;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public Builder m21320y(Float f) {
                this.f15442y = f;
                return this;
            }
        }

        public static final class ProtoAdapter_RectArgs extends ProtoAdapter<RectArgs> {
            public ProtoAdapter_RectArgs() {
                super(FieldEncoding.LENGTH_DELIMITED, RectArgs.class);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RectArgs decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag == -1) {
                        protoReader.endMessage(jBeginMessage);
                        return builder.build();
                    }
                    if (iNextTag == 1) {
                        builder.m21319x(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 2) {
                        builder.m21320y(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 3) {
                        builder.width(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag == 4) {
                        builder.height(ProtoAdapter.FLOAT.decode(protoReader));
                    } else if (iNextTag != 5) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.cornerRadius(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, RectArgs rectArgs) throws IOException {
                Float f = rectArgs.f15439x;
                if (f != null) {
                    ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
                }
                Float f2 = rectArgs.f15440y;
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

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RectArgs rectArgs) {
                Float f = rectArgs.f15439x;
                int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
                Float f2 = rectArgs.f15440y;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
                Float f3 = rectArgs.width;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
                Float f4 = rectArgs.height;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0);
                Float f5 = rectArgs.cornerRadius;
                return iEncodedSizeWithTag4 + (f5 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, f5) : 0) + rectArgs.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RectArgs redact(RectArgs rectArgs) throws EOFException {
                Builder builderNewBuilder = rectArgs.newBuilder();
                builderNewBuilder.clearUnknownFields();
                return builderNewBuilder.build();
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
            this.f15439x = f;
            this.f15440y = f2;
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
            return unknownFields().equals(rectArgs.unknownFields()) && Internal.equals(this.f15439x, rectArgs.f15439x) && Internal.equals(this.f15440y, rectArgs.f15440y) && Internal.equals(this.width, rectArgs.width) && Internal.equals(this.height, rectArgs.height) && Internal.equals(this.cornerRadius, rectArgs.cornerRadius);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Float f = this.f15439x;
            int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
            Float f2 = this.f15440y;
            int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
            Float f3 = this.width;
            int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
            Float f4 = this.height;
            int iHashCode5 = (iHashCode4 + (f4 != null ? f4.hashCode() : 0)) * 37;
            Float f5 = this.cornerRadius;
            int iHashCode6 = iHashCode5 + (f5 != null ? f5.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.f15441x = this.f15439x;
            builder.f15442y = this.f15440y;
            builder.width = this.width;
            builder.height = this.height;
            builder.cornerRadius = this.cornerRadius;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f15439x != null) {
                sb.append(", x=");
                sb.append(this.f15439x);
            }
            if (this.f15440y != null) {
                sb.append(", y=");
                sb.append(this.f15440y);
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
