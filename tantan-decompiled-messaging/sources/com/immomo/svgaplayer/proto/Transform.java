package com.immomo.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Transform extends Message<Transform, Builder> {
    public static final ProtoAdapter<Transform> ADAPTER = new ProtoAdapter_Transform();
    public static final Float DEFAULT_A;
    public static final Float DEFAULT_B;
    public static final Float DEFAULT_C;
    public static final Float DEFAULT_D;
    public static final Float DEFAULT_TX;
    public static final Float DEFAULT_TY;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float f14084a;

    /* JADX INFO: renamed from: b */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float f14085b;

    /* JADX INFO: renamed from: c */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float f14086c;

    /* JADX INFO: renamed from: d */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float f14087d;

    /* JADX INFO: renamed from: tx */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float f14088tx;

    /* JADX INFO: renamed from: ty */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
    public final Float f14089ty;

    public static final class Builder extends Message.Builder<Transform, Builder> {

        /* JADX INFO: renamed from: a */
        public Float f14090a;

        /* JADX INFO: renamed from: b */
        public Float f14091b;

        /* JADX INFO: renamed from: c */
        public Float f14092c;

        /* JADX INFO: renamed from: d */
        public Float f14093d;

        /* JADX INFO: renamed from: tx */
        public Float f14094tx;

        /* JADX INFO: renamed from: ty */
        public Float f14095ty;

        /* JADX INFO: renamed from: a */
        public Builder m19475a(Float f) {
            this.f14090a = f;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Builder m19476b(Float f) {
            this.f14091b = f;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Transform build() {
            return new Transform(this.f14090a, this.f14091b, this.f14092c, this.f14093d, this.f14094tx, this.f14095ty, super.buildUnknownFields());
        }

        /* JADX INFO: renamed from: c */
        public Builder m19477c(Float f) {
            this.f14092c = f;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public Builder m19478d(Float f) {
            this.f14093d = f;
            return this;
        }

        /* JADX INFO: renamed from: tx */
        public Builder m19479tx(Float f) {
            this.f14094tx = f;
            return this;
        }

        /* JADX INFO: renamed from: ty */
        public Builder m19480ty(Float f) {
            this.f14095ty = f;
            return this;
        }
    }

    public static final class ProtoAdapter_Transform extends ProtoAdapter<Transform> {
        public ProtoAdapter_Transform() {
            super(FieldEncoding.LENGTH_DELIMITED, Transform.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Transform decode(ProtoReader protoReader) throws IOException {
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
                        builder.m19475a(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 2:
                        builder.m19476b(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 3:
                        builder.m19477c(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 4:
                        builder.m19478d(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 5:
                        builder.m19479tx(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    case 6:
                        builder.m19480ty(ProtoAdapter.FLOAT.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Transform transform) throws IOException {
            Float f = transform.f14084a;
            if (f != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
            }
            Float f2 = transform.f14085b;
            if (f2 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
            }
            Float f3 = transform.f14086c;
            if (f3 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
            }
            Float f4 = transform.f14087d;
            if (f4 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
            }
            Float f5 = transform.f14088tx;
            if (f5 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, f5);
            }
            Float f6 = transform.f14089ty;
            if (f6 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, f6);
            }
            protoWriter.writeBytes(transform.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Transform transform) {
            Float f = transform.f14084a;
            int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
            Float f2 = transform.f14085b;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
            Float f3 = transform.f14086c;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
            Float f4 = transform.f14087d;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0);
            Float f5 = transform.f14088tx;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (f5 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, f5) : 0);
            Float f6 = transform.f14089ty;
            return iEncodedSizeWithTag5 + (f6 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, f6) : 0) + transform.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Transform redact(Transform transform) throws EOFException {
            Builder builderNewBuilder = transform.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_A = fValueOf;
        DEFAULT_B = fValueOf;
        DEFAULT_C = fValueOf;
        DEFAULT_D = fValueOf;
        DEFAULT_TX = fValueOf;
        DEFAULT_TY = fValueOf;
    }

    public Transform(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f14084a = f;
        this.f14085b = f2;
        this.f14086c = f3;
        this.f14087d = f4;
        this.f14088tx = f5;
        this.f14089ty = f6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return unknownFields().equals(transform.unknownFields()) && Internal.equals(this.f14084a, transform.f14084a) && Internal.equals(this.f14085b, transform.f14085b) && Internal.equals(this.f14086c, transform.f14086c) && Internal.equals(this.f14087d, transform.f14087d) && Internal.equals(this.f14088tx, transform.f14088tx) && Internal.equals(this.f14089ty, transform.f14089ty);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f = this.f14084a;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        Float f2 = this.f14085b;
        int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
        Float f3 = this.f14086c;
        int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
        Float f4 = this.f14087d;
        int iHashCode5 = (iHashCode4 + (f4 != null ? f4.hashCode() : 0)) * 37;
        Float f5 = this.f14088tx;
        int iHashCode6 = (iHashCode5 + (f5 != null ? f5.hashCode() : 0)) * 37;
        Float f6 = this.f14089ty;
        int iHashCode7 = iHashCode6 + (f6 != null ? f6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f14090a = this.f14084a;
        builder.f14091b = this.f14085b;
        builder.f14092c = this.f14086c;
        builder.f14093d = this.f14087d;
        builder.f14094tx = this.f14088tx;
        builder.f14095ty = this.f14089ty;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f14084a != null) {
            sb.append(", a=");
            sb.append(this.f14084a);
        }
        if (this.f14085b != null) {
            sb.append(", b=");
            sb.append(this.f14085b);
        }
        if (this.f14086c != null) {
            sb.append(", c=");
            sb.append(this.f14086c);
        }
        if (this.f14087d != null) {
            sb.append(", d=");
            sb.append(this.f14087d);
        }
        if (this.f14088tx != null) {
            sb.append(", tx=");
            sb.append(this.f14088tx);
        }
        if (this.f14089ty != null) {
            sb.append(", ty=");
            sb.append(this.f14089ty);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Transform{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Transform(Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        this(f, f2, f3, f4, f5, f6, ByteString.EMPTY);
    }
}
