package com.p003p1.mobile.android.geocoding;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class Geocoding {

    /* JADX INFO: renamed from: com.p1.mobile.android.geocoding.Geocoding$1 */
    public static /* synthetic */ class C02331 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1294xa1df5c61;

        /* JADX INFO: renamed from: $SwitchMap$com$p1$mobile$android$geocoding$Geocoding$Geometry$PackedCase */
        static final /* synthetic */ int[] f1295xf3973ad1;

        static {
            int[] iArr = new int[Geometry.PackedCase.values().length];
            f1295xf3973ad1 = iArr;
            try {
                iArr[Geometry.PackedCase.RING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1295xf3973ad1[Geometry.PackedCase.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1295xf3973ad1[Geometry.PackedCase.MULTIPOLYGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1295xf3973ad1[Geometry.PackedCase.PACKED_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1294xa1df5c61 = iArr2;
            try {
                iArr2[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1294xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface CountryOrBuilder extends o6z {
        float getArea();

        String getContinent();

        ByteString getContinentBytes();

        /* synthetic */ q getDefaultInstanceForType();

        int getId();

        String getIso();

        String getIso3();

        ByteString getIso3Bytes();

        ByteString getIsoBytes();

        int getIsoNumeric();

        String getLocales(int i);

        ByteString getLocalesBytes(int i);

        int getLocalesCount();

        List<String> getLocalesList();

        String getName();

        ByteString getNameBytes();

        long getPopulation();

        /* synthetic */ boolean isInitialized();
    }

    public interface FeatureOrBuilder extends o6z {
        int getCountry();

        /* synthetic */ q getDefaultInstanceForType();

        Geometry getGeometry();

        boolean hasGeometry();

        /* synthetic */ boolean isInitialized();
    }

    public interface GeometryOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        MultiPolygon getMultiPolygon();

        Geometry.PackedCase getPackedCase();

        Polygon getPolygon();

        Ring getRing();

        /* synthetic */ boolean isInitialized();
    }

    public interface MultiPolygonOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Geometry getGeometries(int i);

        int getGeometriesCount();

        List<Geometry> getGeometriesList();

        /* synthetic */ boolean isInitialized();
    }

    public interface PolygonOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        MultiPolygon getHoles();

        Ring getRing();

        boolean hasHoles();

        boolean hasRing();

        /* synthetic */ boolean isInitialized();
    }

    public interface RingOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        float getLatitude(int i);

        int getLatitudeCount();

        List<Float> getLatitudeList();

        float getLongitude(int i);

        int getLongitudeCount();

        List<Float> getLongitudeList();

        /* synthetic */ boolean isInitialized();
    }

    private Geocoding() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class Geometry extends GeneratedMessageLite<Geometry, Builder> implements GeometryOrBuilder {
        private static final Geometry DEFAULT_INSTANCE;
        public static final int MULTIPOLYGON_FIELD_NUMBER = 3;
        private static volatile i860<Geometry> PARSER = null;
        public static final int POLYGON_FIELD_NUMBER = 2;
        public static final int RING_FIELD_NUMBER = 1;
        private int packedCase_ = 0;
        private Object packed_;

        static {
            Geometry geometry = new Geometry();
            DEFAULT_INSTANCE = geometry;
            geometry.makeImmutable();
        }

        private Geometry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMultiPolygon() {
            if (this.packedCase_ == 3) {
                this.packedCase_ = 0;
                this.packed_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacked() {
            this.packedCase_ = 0;
            this.packed_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPolygon() {
            if (this.packedCase_ == 2) {
                this.packedCase_ = 0;
                this.packed_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRing() {
            if (this.packedCase_ == 1) {
                this.packedCase_ = 0;
                this.packed_ = null;
            }
        }

        public static Geometry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMultiPolygon(MultiPolygon multiPolygon) {
            if (this.packedCase_ != 3 || this.packed_ == MultiPolygon.getDefaultInstance()) {
                this.packed_ = multiPolygon;
            } else {
                this.packed_ = ((MultiPolygon.Builder) MultiPolygon.newBuilder((MultiPolygon) this.packed_).mergeFrom(multiPolygon)).buildPartial();
            }
            this.packedCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePolygon(Polygon polygon) {
            if (this.packedCase_ != 2 || this.packed_ == Polygon.getDefaultInstance()) {
                this.packed_ = polygon;
            } else {
                this.packed_ = ((Polygon.Builder) Polygon.newBuilder((Polygon) this.packed_).mergeFrom(polygon)).buildPartial();
            }
            this.packedCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRing(Ring ring) {
            if (this.packedCase_ != 1 || this.packed_ == Ring.getDefaultInstance()) {
                this.packed_ = ring;
            } else {
                this.packed_ = ((Ring.Builder) Ring.newBuilder((Ring) this.packed_).mergeFrom(ring)).buildPartial();
            }
            this.packedCase_ = 1;
        }

        public static Builder newBuilder(Geometry geometry) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(geometry);
        }

        public static Geometry parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geometry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geometry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Geometry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPolygon(MultiPolygon.Builder builder) {
            this.packed_ = builder.build();
            this.packedCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPolygon(Polygon.Builder builder) {
            this.packed_ = builder.build();
            this.packedCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRing(Ring.Builder builder) {
            this.packed_ = builder.build();
            this.packedCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = false;
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Geometry();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Geometry geometry = (Geometry) obj2;
                    int i2 = C02331.f1295xf3973ad1[geometry.getPackedCase().ordinal()];
                    if (i2 == 1) {
                        this.packed_ = gVar.k(this.packedCase_ == 1, this.packed_, geometry.packed_);
                    } else if (i2 == 2) {
                        this.packed_ = gVar.k(this.packedCase_ == 2, this.packed_, geometry.packed_);
                    } else if (i2 == 3) {
                        this.packed_ = gVar.k(this.packedCase_ == 3, this.packed_, geometry.packed_);
                    } else if (i2 == 4) {
                        gVar.c(this.packedCase_ != 0);
                    }
                    if (gVar == GeneratedMessageLite.g.INSTANCE && (i = geometry.packedCase_) != 0) {
                        this.packedCase_ = i;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    Ring.Builder builder = this.packedCase_ == 1 ? (Ring.Builder) ((Ring) this.packed_).toBuilder() : null;
                                    Ring ringW = eVar.w(Ring.parser(), hVar);
                                    this.packed_ = ringW;
                                    if (builder != null) {
                                        builder.mergeFrom(ringW);
                                        this.packed_ = builder.buildPartial();
                                    }
                                    this.packedCase_ = 1;
                                } else if (iM == 18) {
                                    Polygon.Builder builder2 = this.packedCase_ == 2 ? (Polygon.Builder) ((Polygon) this.packed_).toBuilder() : null;
                                    Polygon polygonW = eVar.w(Polygon.parser(), hVar);
                                    this.packed_ = polygonW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(polygonW);
                                        this.packed_ = builder2.buildPartial();
                                    }
                                    this.packedCase_ = 2;
                                } else if (iM == 26) {
                                    MultiPolygon.Builder builder3 = this.packedCase_ == 3 ? (MultiPolygon.Builder) ((MultiPolygon) this.packed_).toBuilder() : null;
                                    MultiPolygon multiPolygonW = eVar.w(MultiPolygon.parser(), hVar);
                                    this.packed_ = multiPolygonW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(multiPolygonW);
                                        this.packed_ = builder3.buildPartial();
                                    }
                                    this.packedCase_ = 3;
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Geometry.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
        public MultiPolygon getMultiPolygon() {
            return this.packedCase_ == 3 ? (MultiPolygon) this.packed_ : MultiPolygon.getDefaultInstance();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
        public PackedCase getPackedCase() {
            return PackedCase.forNumber(this.packedCase_);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
        public Polygon getPolygon() {
            return this.packedCase_ == 2 ? (Polygon) this.packed_ : Polygon.getDefaultInstance();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
        public Ring getRing() {
            return this.packedCase_ == 1 ? (Ring) this.packed_ : Ring.getDefaultInstance();
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.packedCase_ == 1 ? CodedOutputStream.C(1, (Ring) this.packed_) : 0;
            if (this.packedCase_ == 2) {
                iC += CodedOutputStream.C(2, (Polygon) this.packed_);
            }
            if (this.packedCase_ == 3) {
                iC += CodedOutputStream.C(3, (MultiPolygon) this.packed_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.packedCase_ == 1) {
                codedOutputStream.w0(1, (Ring) this.packed_);
            }
            if (this.packedCase_ == 2) {
                codedOutputStream.w0(2, (Polygon) this.packed_);
            }
            if (this.packedCase_ == 3) {
                codedOutputStream.w0(3, (MultiPolygon) this.packed_);
            }
        }

        public enum PackedCase implements l.c {
            RING(1),
            POLYGON(2),
            MULTIPOLYGON(3),
            PACKED_NOT_SET(0);

            private final int value;

            PackedCase(int i) {
                this.value = i;
            }

            public static PackedCase forNumber(int i) {
                if (i == 0) {
                    return PACKED_NOT_SET;
                }
                if (i == 1) {
                    return RING;
                }
                if (i == 2) {
                    return POLYGON;
                }
                if (i != 3) {
                    return null;
                }
                return MULTIPOLYGON;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PackedCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Geometry parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Geometry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Geometry parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<Geometry, Builder> implements GeometryOrBuilder {
            private Builder() {
                super(Geometry.DEFAULT_INSTANCE);
            }

            public Builder clearMultiPolygon() {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).clearMultiPolygon();
                return this;
            }

            public Builder clearPacked() {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).clearPacked();
                return this;
            }

            public Builder clearPolygon() {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).clearPolygon();
                return this;
            }

            public Builder clearRing() {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).clearRing();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
            public MultiPolygon getMultiPolygon() {
                return ((Geometry) ((GeneratedMessageLite.b) this).instance).getMultiPolygon();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
            public PackedCase getPackedCase() {
                return ((Geometry) ((GeneratedMessageLite.b) this).instance).getPackedCase();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
            public Polygon getPolygon() {
                return ((Geometry) ((GeneratedMessageLite.b) this).instance).getPolygon();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.GeometryOrBuilder
            public Ring getRing() {
                return ((Geometry) ((GeneratedMessageLite.b) this).instance).getRing();
            }

            public Builder mergeMultiPolygon(MultiPolygon multiPolygon) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).mergeMultiPolygon(multiPolygon);
                return this;
            }

            public Builder mergePolygon(Polygon polygon) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).mergePolygon(polygon);
                return this;
            }

            public Builder mergeRing(Ring ring) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).mergeRing(ring);
                return this;
            }

            public Builder setMultiPolygon(MultiPolygon multiPolygon) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setMultiPolygon(multiPolygon);
                return this;
            }

            public Builder setPolygon(Polygon polygon) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setPolygon(polygon);
                return this;
            }

            public Builder setRing(Ring ring) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setRing(ring);
                return this;
            }

            public Builder setMultiPolygon(MultiPolygon.Builder builder) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setMultiPolygon(builder);
                return this;
            }

            public Builder setPolygon(Polygon.Builder builder) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setPolygon(builder);
                return this;
            }

            public Builder setRing(Ring.Builder builder) {
                copyOnWrite();
                ((Geometry) ((GeneratedMessageLite.b) this).instance).setRing(builder);
                return this;
            }
        }

        public static Geometry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMultiPolygon(MultiPolygon multiPolygon) {
            multiPolygon.getClass();
            this.packed_ = multiPolygon;
            this.packedCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPolygon(Polygon polygon) {
            polygon.getClass();
            this.packed_ = polygon;
            this.packedCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRing(Ring ring) {
            ring.getClass();
            this.packed_ = ring;
            this.packedCase_ = 1;
        }

        public static Geometry parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Geometry parseFrom(InputStream inputStream) throws IOException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geometry parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Geometry parseFrom(e eVar) throws IOException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Geometry parseFrom(e eVar, h hVar) throws IOException {
            return (Geometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Country extends GeneratedMessageLite<Country, Builder> implements CountryOrBuilder {
        public static final int AREA_FIELD_NUMBER = 6;
        public static final int CONTINENT_FIELD_NUMBER = 8;
        private static final Country DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ISO3_FIELD_NUMBER = 3;
        public static final int ISONUMERIC_FIELD_NUMBER = 4;
        public static final int ISO_FIELD_NUMBER = 2;
        public static final int LOCALES_FIELD_NUMBER = 9;
        public static final int NAME_FIELD_NUMBER = 5;
        private static volatile i860<Country> PARSER = null;
        public static final int POPULATION_FIELD_NUMBER = 7;
        private float area_;
        private int bitField0_;
        private int id_;
        private int isoNumeric_;
        private long population_;
        private String iso_ = "";
        private String iso3_ = "";
        private String name_ = "";
        private String continent_ = "";
        private l.h<String> locales_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.b<Country, Builder> implements CountryOrBuilder {
            private Builder() {
                super(Country.DEFAULT_INSTANCE);
            }

            public Builder addAllLocales(Iterable<String> iterable) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).addAllLocales(iterable);
                return this;
            }

            public Builder addLocales(String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).addLocales(str);
                return this;
            }

            public Builder addLocalesBytes(ByteString byteString) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).addLocalesBytes(byteString);
                return this;
            }

            public Builder clearArea() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearArea();
                return this;
            }

            public Builder clearContinent() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearContinent();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearIso() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearIso();
                return this;
            }

            public Builder clearIso3() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearIso3();
                return this;
            }

            public Builder clearIsoNumeric() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearIsoNumeric();
                return this;
            }

            public Builder clearLocales() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearLocales();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearName();
                return this;
            }

            public Builder clearPopulation() {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).clearPopulation();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public float getArea() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getArea();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public String getContinent() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getContinent();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public ByteString getContinentBytes() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getContinentBytes();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public int getId() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public String getIso() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getIso();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public String getIso3() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getIso3();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public ByteString getIso3Bytes() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getIso3Bytes();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public ByteString getIsoBytes() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getIsoBytes();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public int getIsoNumeric() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getIsoNumeric();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public String getLocales(int i) {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getLocales(i);
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public ByteString getLocalesBytes(int i) {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getLocalesBytes(i);
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public int getLocalesCount() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getLocalesCount();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public List<String> getLocalesList() {
                return Collections.unmodifiableList(((Country) ((GeneratedMessageLite.b) this).instance).getLocalesList());
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public String getName() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getName();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public ByteString getNameBytes() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getNameBytes();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
            public long getPopulation() {
                return ((Country) ((GeneratedMessageLite.b) this).instance).getPopulation();
            }

            public Builder setArea(float f) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setArea(f);
                return this;
            }

            public Builder setContinent(String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setContinent(str);
                return this;
            }

            public Builder setContinentBytes(ByteString byteString) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setContinentBytes(byteString);
                return this;
            }

            public Builder setId(int i) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setId(i);
                return this;
            }

            public Builder setIso(String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setIso(str);
                return this;
            }

            public Builder setIso3(String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setIso3(str);
                return this;
            }

            public Builder setIso3Bytes(ByteString byteString) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setIso3Bytes(byteString);
                return this;
            }

            public Builder setIsoBytes(ByteString byteString) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setIsoBytes(byteString);
                return this;
            }

            public Builder setIsoNumeric(int i) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setIsoNumeric(i);
                return this;
            }

            public Builder setLocales(int i, String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setLocales(i, str);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPopulation(long j) {
                copyOnWrite();
                ((Country) ((GeneratedMessageLite.b) this).instance).setPopulation(j);
                return this;
            }
        }

        static {
            Country country = new Country();
            DEFAULT_INSTANCE = country;
            country.makeImmutable();
        }

        private Country() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocales(Iterable<String> iterable) {
            ensureLocalesIsMutable();
            a.addAll(iterable, this.locales_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocales(String str) {
            str.getClass();
            ensureLocalesIsMutable();
            this.locales_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocalesBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureLocalesIsMutable();
            this.locales_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArea() {
            this.area_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContinent() {
            this.continent_ = getDefaultInstance().getContinent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIso() {
            this.iso_ = getDefaultInstance().getIso();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIso3() {
            this.iso3_ = getDefaultInstance().getIso3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsoNumeric() {
            this.isoNumeric_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocales() {
            this.locales_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPopulation() {
            this.population_ = 0L;
        }

        private void ensureLocalesIsMutable() {
            if (this.locales_.q()) {
                return;
            }
            this.locales_ = GeneratedMessageLite.mutableCopy(this.locales_);
        }

        public static Country getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Country country) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(country);
        }

        public static Country parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Country> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArea(float f) {
            this.area_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinent(String str) {
            str.getClass();
            this.continent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinentBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.continent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIso(String str) {
            str.getClass();
            this.iso_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIso3(String str) {
            str.getClass();
            this.iso3_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIso3Bytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.iso3_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsoBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.iso_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsoNumeric(int i) {
            this.isoNumeric_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocales(int i, String str) {
            str.getClass();
            ensureLocalesIsMutable();
            this.locales_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPopulation(long j) {
            this.population_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Country();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.locales_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Country country = (Country) obj2;
                    int i = this.id_;
                    boolean z2 = i != 0;
                    int i2 = country.id_;
                    this.id_ = gVar.e(z2, i, i2 != 0, i2);
                    this.iso_ = gVar.f(!this.iso_.isEmpty(), this.iso_, !country.iso_.isEmpty(), country.iso_);
                    this.iso3_ = gVar.f(!this.iso3_.isEmpty(), this.iso3_, !country.iso3_.isEmpty(), country.iso3_);
                    int i3 = this.isoNumeric_;
                    boolean z3 = i3 != 0;
                    int i4 = country.isoNumeric_;
                    this.isoNumeric_ = gVar.e(z3, i3, i4 != 0, i4);
                    this.name_ = gVar.f(!this.name_.isEmpty(), this.name_, !country.name_.isEmpty(), country.name_);
                    float f = this.area_;
                    boolean z4 = f != 0.0f;
                    float f2 = country.area_;
                    this.area_ = gVar.p(z4, f, f2 != 0.0f, f2);
                    long j = this.population_;
                    boolean z5 = j != 0;
                    long j2 = country.population_;
                    this.population_ = gVar.i(z5, j, j2 != 0, j2);
                    this.continent_ = gVar.f(!this.continent_.isEmpty(), this.continent_, !country.continent_.isEmpty(), country.continent_);
                    this.locales_ = gVar.g(this.locales_, country.locales_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= country.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.id_ = eVar.u();
                                } else if (iM == 18) {
                                    this.iso_ = eVar.L();
                                } else if (iM == 26) {
                                    this.iso3_ = eVar.L();
                                } else if (iM == 32) {
                                    this.isoNumeric_ = eVar.u();
                                } else if (iM == 42) {
                                    this.name_ = eVar.L();
                                } else if (iM == 53) {
                                    this.area_ = eVar.s();
                                } else if (iM == 56) {
                                    this.population_ = eVar.v();
                                } else if (iM == 66) {
                                    this.continent_ = eVar.L();
                                } else if (iM == 74) {
                                    String strL = eVar.L();
                                    if (!this.locales_.q()) {
                                        this.locales_ = GeneratedMessageLite.mutableCopy(this.locales_);
                                    }
                                    this.locales_.add(strL);
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Country.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public float getArea() {
            return this.area_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public String getContinent() {
            return this.continent_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public ByteString getContinentBytes() {
            return ByteString.copyFromUtf8(this.continent_);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public String getIso() {
            return this.iso_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public String getIso3() {
            return this.iso3_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public ByteString getIso3Bytes() {
            return ByteString.copyFromUtf8(this.iso3_);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public ByteString getIsoBytes() {
            return ByteString.copyFromUtf8(this.iso_);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public int getIsoNumeric() {
            return this.isoNumeric_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public String getLocales(int i) {
            return (String) this.locales_.get(i);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public ByteString getLocalesBytes(int i) {
            return ByteString.copyFromUtf8((String) this.locales_.get(i));
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public int getLocalesCount() {
            return this.locales_.size();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public List<String> getLocalesList() {
            return this.locales_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.CountryOrBuilder
        public long getPopulation() {
            return this.population_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iT = i2 != 0 ? CodedOutputStream.t(1, i2) : 0;
            if (!this.iso_.isEmpty()) {
                iT += CodedOutputStream.K(2, getIso());
            }
            if (!this.iso3_.isEmpty()) {
                iT += CodedOutputStream.K(3, getIso3());
            }
            int i3 = this.isoNumeric_;
            if (i3 != 0) {
                iT += CodedOutputStream.t(4, i3);
            }
            if (!this.name_.isEmpty()) {
                iT += CodedOutputStream.K(5, getName());
            }
            float f = this.area_;
            if (f != 0.0f) {
                iT += CodedOutputStream.q(6, f);
            }
            long j = this.population_;
            if (j != 0) {
                iT += CodedOutputStream.v(7, j);
            }
            if (!this.continent_.isEmpty()) {
                iT += CodedOutputStream.K(8, getContinent());
            }
            int iL = 0;
            for (int i4 = 0; i4 < this.locales_.size(); i4++) {
                iL += CodedOutputStream.L((String) this.locales_.get(i4));
            }
            int size = iT + iL + getLocalesList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.s0(1, i);
            }
            if (!this.iso_.isEmpty()) {
                codedOutputStream.D0(2, getIso());
            }
            if (!this.iso3_.isEmpty()) {
                codedOutputStream.D0(3, getIso3());
            }
            int i2 = this.isoNumeric_;
            if (i2 != 0) {
                codedOutputStream.s0(4, i2);
            }
            if (!this.name_.isEmpty()) {
                codedOutputStream.D0(5, getName());
            }
            float f = this.area_;
            if (f != 0.0f) {
                codedOutputStream.o0(6, f);
            }
            long j = this.population_;
            if (j != 0) {
                codedOutputStream.u0(7, j);
            }
            if (!this.continent_.isEmpty()) {
                codedOutputStream.D0(8, getContinent());
            }
            for (int i3 = 0; i3 < this.locales_.size(); i3++) {
                codedOutputStream.D0(9, (String) this.locales_.get(i3));
            }
        }

        public static Country parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Country parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Country parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Country parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Country parseFrom(InputStream inputStream) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Country parseFrom(e eVar) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Country parseFrom(e eVar, h hVar) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Feature extends GeneratedMessageLite<Feature, Builder> implements FeatureOrBuilder {
        public static final int COUNTRY_FIELD_NUMBER = 1;
        private static final Feature DEFAULT_INSTANCE;
        public static final int GEOMETRY_FIELD_NUMBER = 2;
        private static volatile i860<Feature> PARSER;
        private int country_;
        private Geometry geometry_;

        static {
            Feature feature = new Feature();
            DEFAULT_INSTANCE = feature;
            feature.makeImmutable();
        }

        private Feature() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountry() {
            this.country_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeometry() {
            this.geometry_ = null;
        }

        public static Feature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGeometry(Geometry geometry) {
            Geometry geometry2 = this.geometry_;
            if (geometry2 == null || geometry2 == Geometry.getDefaultInstance()) {
                this.geometry_ = geometry;
            } else {
                this.geometry_ = (Geometry) ((Geometry.Builder) Geometry.newBuilder(this.geometry_).mergeFrom(geometry)).buildPartial();
            }
        }

        public static Builder newBuilder(Feature feature) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(feature);
        }

        public static Feature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Feature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Feature> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountry(int i) {
            this.country_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeometry(Geometry.Builder builder) {
            this.geometry_ = (Geometry) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Feature();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Feature feature = (Feature) obj2;
                    int i = this.country_;
                    boolean z2 = i != 0;
                    int i2 = feature.country_;
                    this.country_ = hVar.e(z2, i, i2 != 0, i2);
                    this.geometry_ = hVar.o(this.geometry_, feature.geometry_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.country_ = eVar.u();
                                } else if (iM == 18) {
                                    Geometry geometry = this.geometry_;
                                    Geometry.Builder builder = geometry != null ? (Geometry.Builder) geometry.toBuilder() : null;
                                    Geometry geometryW = eVar.w(Geometry.parser(), hVar2);
                                    this.geometry_ = geometryW;
                                    if (builder != null) {
                                        builder.mergeFrom(geometryW);
                                        this.geometry_ = (Geometry) builder.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Feature.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
        public int getCountry() {
            return this.country_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
        public Geometry getGeometry() {
            Geometry geometry = this.geometry_;
            return geometry == null ? Geometry.getDefaultInstance() : geometry;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.country_;
            int iT = i2 != 0 ? CodedOutputStream.t(1, i2) : 0;
            if (this.geometry_ != null) {
                iT += CodedOutputStream.C(2, getGeometry());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iT;
            return iT;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
        public boolean hasGeometry() {
            return this.geometry_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.country_;
            if (i != 0) {
                codedOutputStream.s0(1, i);
            }
            if (this.geometry_ != null) {
                codedOutputStream.w0(2, getGeometry());
            }
        }

        public static Feature parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Feature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Feature parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeometry(Geometry geometry) {
            geometry.getClass();
            this.geometry_ = geometry;
        }

        public static final class Builder extends GeneratedMessageLite.b<Feature, Builder> implements FeatureOrBuilder {
            private Builder() {
                super(Feature.DEFAULT_INSTANCE);
            }

            public Builder clearCountry() {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).clearCountry();
                return this;
            }

            public Builder clearGeometry() {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).clearGeometry();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
            public int getCountry() {
                return ((Feature) ((GeneratedMessageLite.b) this).instance).getCountry();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
            public Geometry getGeometry() {
                return ((Feature) ((GeneratedMessageLite.b) this).instance).getGeometry();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.FeatureOrBuilder
            public boolean hasGeometry() {
                return ((Feature) ((GeneratedMessageLite.b) this).instance).hasGeometry();
            }

            public Builder mergeGeometry(Geometry geometry) {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).mergeGeometry(geometry);
                return this;
            }

            public Builder setCountry(int i) {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).setCountry(i);
                return this;
            }

            public Builder setGeometry(Geometry geometry) {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).setGeometry(geometry);
                return this;
            }

            public Builder setGeometry(Geometry.Builder builder) {
                copyOnWrite();
                ((Feature) ((GeneratedMessageLite.b) this).instance).setGeometry(builder);
                return this;
            }
        }

        public static Feature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Feature parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Feature parseFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Feature parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Feature parseFrom(e eVar) throws IOException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Feature parseFrom(e eVar, h hVar) throws IOException {
            return (Feature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class MultiPolygon extends GeneratedMessageLite<MultiPolygon, Builder> implements MultiPolygonOrBuilder {
        private static final MultiPolygon DEFAULT_INSTANCE;
        public static final int GEOMETRIES_FIELD_NUMBER = 1;
        private static volatile i860<MultiPolygon> PARSER;
        private l.h<Geometry> geometries_ = GeneratedMessageLite.emptyProtobufList();

        static {
            MultiPolygon multiPolygon = new MultiPolygon();
            DEFAULT_INSTANCE = multiPolygon;
            multiPolygon.makeImmutable();
        }

        private MultiPolygon() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeometries(Iterable<? extends Geometry> iterable) {
            ensureGeometriesIsMutable();
            a.addAll(iterable, this.geometries_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeometries(Geometry.Builder builder) {
            ensureGeometriesIsMutable();
            this.geometries_.add((Geometry) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeometries() {
            this.geometries_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureGeometriesIsMutable() {
            if (this.geometries_.q()) {
                return;
            }
            this.geometries_ = GeneratedMessageLite.mutableCopy(this.geometries_);
        }

        public static MultiPolygon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MultiPolygon multiPolygon) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(multiPolygon);
        }

        public static MultiPolygon parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPolygon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<MultiPolygon> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeGeometries(int i) {
            ensureGeometriesIsMutable();
            this.geometries_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeometries(int i, Geometry.Builder builder) {
            ensureGeometriesIsMutable();
            this.geometries_.set(i, (Geometry) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new MultiPolygon();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.geometries_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.geometries_ = ((GeneratedMessageLite.h) obj).g(this.geometries_, ((MultiPolygon) obj2).geometries_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    if (!this.geometries_.q()) {
                                        this.geometries_ = GeneratedMessageLite.mutableCopy(this.geometries_);
                                    }
                                    this.geometries_.add(eVar.w(Geometry.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (MultiPolygon.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
        public Geometry getGeometries(int i) {
            return (Geometry) this.geometries_.get(i);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
        public int getGeometriesCount() {
            return this.geometries_.size();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
        public List<Geometry> getGeometriesList() {
            return this.geometries_;
        }

        public GeometryOrBuilder getGeometriesOrBuilder(int i) {
            return (GeometryOrBuilder) this.geometries_.get(i);
        }

        public List<? extends GeometryOrBuilder> getGeometriesOrBuilderList() {
            return this.geometries_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = 0;
            for (int i2 = 0; i2 < this.geometries_.size(); i2++) {
                iC += CodedOutputStream.C(1, (q) this.geometries_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.geometries_.size(); i++) {
                codedOutputStream.w0(1, (q) this.geometries_.get(i));
            }
        }

        public static MultiPolygon parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiPolygon parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<MultiPolygon, Builder> implements MultiPolygonOrBuilder {
            private Builder() {
                super(MultiPolygon.DEFAULT_INSTANCE);
            }

            public Builder addAllGeometries(Iterable<? extends Geometry> iterable) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).addAllGeometries(iterable);
                return this;
            }

            public Builder addGeometries(Geometry geometry) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).addGeometries(geometry);
                return this;
            }

            public Builder clearGeometries() {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).clearGeometries();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
            public Geometry getGeometries(int i) {
                return ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).getGeometries(i);
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
            public int getGeometriesCount() {
                return ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).getGeometriesCount();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.MultiPolygonOrBuilder
            public List<Geometry> getGeometriesList() {
                return Collections.unmodifiableList(((MultiPolygon) ((GeneratedMessageLite.b) this).instance).getGeometriesList());
            }

            public Builder removeGeometries(int i) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).removeGeometries(i);
                return this;
            }

            public Builder setGeometries(int i, Geometry geometry) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).setGeometries(i, geometry);
                return this;
            }

            public Builder addGeometries(int i, Geometry geometry) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).addGeometries(i, geometry);
                return this;
            }

            public Builder setGeometries(int i, Geometry.Builder builder) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).setGeometries(i, builder);
                return this;
            }

            public Builder addGeometries(Geometry.Builder builder) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).addGeometries(builder);
                return this;
            }

            public Builder addGeometries(int i, Geometry.Builder builder) {
                copyOnWrite();
                ((MultiPolygon) ((GeneratedMessageLite.b) this).instance).addGeometries(i, builder);
                return this;
            }
        }

        public static MultiPolygon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MultiPolygon parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static MultiPolygon parseFrom(InputStream inputStream) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MultiPolygon parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static MultiPolygon parseFrom(e eVar) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeometries(int i, Geometry geometry) {
            geometry.getClass();
            ensureGeometriesIsMutable();
            this.geometries_.add(i, geometry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiPolygon parseFrom(e eVar, h hVar) throws IOException {
            return (MultiPolygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeometries(int i, Geometry geometry) {
            geometry.getClass();
            ensureGeometriesIsMutable();
            this.geometries_.set(i, geometry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeometries(Geometry geometry) {
            geometry.getClass();
            ensureGeometriesIsMutable();
            this.geometries_.add(geometry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeometries(int i, Geometry.Builder builder) {
            ensureGeometriesIsMutable();
            this.geometries_.add(i, (Geometry) builder.build());
        }
    }

    public static final class Polygon extends GeneratedMessageLite<Polygon, Builder> implements PolygonOrBuilder {
        private static final Polygon DEFAULT_INSTANCE;
        public static final int HOLES_FIELD_NUMBER = 2;
        private static volatile i860<Polygon> PARSER = null;
        public static final int RING_FIELD_NUMBER = 1;
        private MultiPolygon holes_;
        private Ring ring_;

        static {
            Polygon polygon = new Polygon();
            DEFAULT_INSTANCE = polygon;
            polygon.makeImmutable();
        }

        private Polygon() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHoles() {
            this.holes_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRing() {
            this.ring_ = null;
        }

        public static Polygon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHoles(MultiPolygon multiPolygon) {
            MultiPolygon multiPolygon2 = this.holes_;
            if (multiPolygon2 == null || multiPolygon2 == MultiPolygon.getDefaultInstance()) {
                this.holes_ = multiPolygon;
            } else {
                this.holes_ = (MultiPolygon) ((MultiPolygon.Builder) MultiPolygon.newBuilder(this.holes_).mergeFrom(multiPolygon)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRing(Ring ring) {
            Ring ring2 = this.ring_;
            if (ring2 == null || ring2 == Ring.getDefaultInstance()) {
                this.ring_ = ring;
            } else {
                this.ring_ = (Ring) ((Ring.Builder) Ring.newBuilder(this.ring_).mergeFrom(ring)).buildPartial();
            }
        }

        public static Builder newBuilder(Polygon polygon) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(polygon);
        }

        public static Polygon parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Polygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Polygon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Polygon> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHoles(MultiPolygon.Builder builder) {
            this.holes_ = (MultiPolygon) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRing(Ring.Builder builder) {
            this.ring_ = (Ring) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Polygon();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Polygon polygon = (Polygon) obj2;
                    this.ring_ = hVar.o(this.ring_, polygon.ring_);
                    this.holes_ = hVar.o(this.holes_, polygon.holes_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    Ring ring = this.ring_;
                                    Ring.Builder builder = ring != null ? (Ring.Builder) ring.toBuilder() : null;
                                    Ring ringW = eVar.w(Ring.parser(), hVar2);
                                    this.ring_ = ringW;
                                    if (builder != null) {
                                        builder.mergeFrom(ringW);
                                        this.ring_ = (Ring) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    MultiPolygon multiPolygon = this.holes_;
                                    MultiPolygon.Builder builder2 = multiPolygon != null ? (MultiPolygon.Builder) multiPolygon.toBuilder() : null;
                                    MultiPolygon multiPolygonW = eVar.w(MultiPolygon.parser(), hVar2);
                                    this.holes_ = multiPolygonW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(multiPolygonW);
                                        this.holes_ = (MultiPolygon) builder2.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Polygon.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
        public MultiPolygon getHoles() {
            MultiPolygon multiPolygon = this.holes_;
            return multiPolygon == null ? MultiPolygon.getDefaultInstance() : multiPolygon;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
        public Ring getRing() {
            Ring ring = this.ring_;
            return ring == null ? Ring.getDefaultInstance() : ring;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.ring_ != null ? CodedOutputStream.C(1, getRing()) : 0;
            if (this.holes_ != null) {
                iC += CodedOutputStream.C(2, getHoles());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
        public boolean hasHoles() {
            return this.holes_ != null;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
        public boolean hasRing() {
            return this.ring_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.ring_ != null) {
                codedOutputStream.w0(1, getRing());
            }
            if (this.holes_ != null) {
                codedOutputStream.w0(2, getHoles());
            }
        }

        public static Polygon parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Polygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Polygon parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHoles(MultiPolygon multiPolygon) {
            multiPolygon.getClass();
            this.holes_ = multiPolygon;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRing(Ring ring) {
            ring.getClass();
            this.ring_ = ring;
        }

        public static final class Builder extends GeneratedMessageLite.b<Polygon, Builder> implements PolygonOrBuilder {
            private Builder() {
                super(Polygon.DEFAULT_INSTANCE);
            }

            public Builder clearHoles() {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).clearHoles();
                return this;
            }

            public Builder clearRing() {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).clearRing();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
            public MultiPolygon getHoles() {
                return ((Polygon) ((GeneratedMessageLite.b) this).instance).getHoles();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
            public Ring getRing() {
                return ((Polygon) ((GeneratedMessageLite.b) this).instance).getRing();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
            public boolean hasHoles() {
                return ((Polygon) ((GeneratedMessageLite.b) this).instance).hasHoles();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.PolygonOrBuilder
            public boolean hasRing() {
                return ((Polygon) ((GeneratedMessageLite.b) this).instance).hasRing();
            }

            public Builder mergeHoles(MultiPolygon multiPolygon) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).mergeHoles(multiPolygon);
                return this;
            }

            public Builder mergeRing(Ring ring) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).mergeRing(ring);
                return this;
            }

            public Builder setHoles(MultiPolygon multiPolygon) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).setHoles(multiPolygon);
                return this;
            }

            public Builder setRing(Ring ring) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).setRing(ring);
                return this;
            }

            public Builder setHoles(MultiPolygon.Builder builder) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).setHoles(builder);
                return this;
            }

            public Builder setRing(Ring.Builder builder) {
                copyOnWrite();
                ((Polygon) ((GeneratedMessageLite.b) this).instance).setRing(builder);
                return this;
            }
        }

        public static Polygon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Polygon parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Polygon parseFrom(InputStream inputStream) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Polygon parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Polygon parseFrom(e eVar) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Polygon parseFrom(e eVar, h hVar) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Ring extends GeneratedMessageLite<Ring, Builder> implements RingOrBuilder {
        private static final Ring DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 1;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        private static volatile i860<Ring> PARSER;
        private l.e latitude_ = GeneratedMessageLite.emptyFloatList();
        private l.e longitude_ = GeneratedMessageLite.emptyFloatList();

        public static final class Builder extends GeneratedMessageLite.b<Ring, Builder> implements RingOrBuilder {
            private Builder() {
                super(Ring.DEFAULT_INSTANCE);
            }

            public Builder addAllLatitude(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).addAllLatitude(iterable);
                return this;
            }

            public Builder addAllLongitude(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).addAllLongitude(iterable);
                return this;
            }

            public Builder addLatitude(float f) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).addLatitude(f);
                return this;
            }

            public Builder addLongitude(float f) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).addLongitude(f);
                return this;
            }

            public Builder clearLatitude() {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).clearLatitude();
                return this;
            }

            public Builder clearLongitude() {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).clearLongitude();
                return this;
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public float getLatitude(int i) {
                return ((Ring) ((GeneratedMessageLite.b) this).instance).getLatitude(i);
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public int getLatitudeCount() {
                return ((Ring) ((GeneratedMessageLite.b) this).instance).getLatitudeCount();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public List<Float> getLatitudeList() {
                return Collections.unmodifiableList(((Ring) ((GeneratedMessageLite.b) this).instance).getLatitudeList());
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public float getLongitude(int i) {
                return ((Ring) ((GeneratedMessageLite.b) this).instance).getLongitude(i);
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public int getLongitudeCount() {
                return ((Ring) ((GeneratedMessageLite.b) this).instance).getLongitudeCount();
            }

            @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
            public List<Float> getLongitudeList() {
                return Collections.unmodifiableList(((Ring) ((GeneratedMessageLite.b) this).instance).getLongitudeList());
            }

            public Builder setLatitude(int i, float f) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).setLatitude(i, f);
                return this;
            }

            public Builder setLongitude(int i, float f) {
                copyOnWrite();
                ((Ring) ((GeneratedMessageLite.b) this).instance).setLongitude(i, f);
                return this;
            }
        }

        static {
            Ring ring = new Ring();
            DEFAULT_INSTANCE = ring;
            ring.makeImmutable();
        }

        private Ring() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLatitude(Iterable<? extends Float> iterable) {
            ensureLatitudeIsMutable();
            a.addAll(iterable, this.latitude_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLongitude(Iterable<? extends Float> iterable) {
            ensureLongitudeIsMutable();
            a.addAll(iterable, this.longitude_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLatitude(float f) {
            ensureLatitudeIsMutable();
            this.latitude_.M(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLongitude(float f) {
            ensureLongitudeIsMutable();
            this.longitude_.M(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatitude() {
            this.latitude_ = GeneratedMessageLite.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongitude() {
            this.longitude_ = GeneratedMessageLite.emptyFloatList();
        }

        private void ensureLatitudeIsMutable() {
            if (this.latitude_.q()) {
                return;
            }
            this.latitude_ = GeneratedMessageLite.mutableCopy(this.latitude_);
        }

        private void ensureLongitudeIsMutable() {
            if (this.longitude_.q()) {
                return;
            }
            this.longitude_ = GeneratedMessageLite.mutableCopy(this.longitude_);
        }

        public static Ring getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Ring ring) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(ring);
        }

        public static Ring parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ring parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Ring> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(int i, float f) {
            ensureLatitudeIsMutable();
            this.latitude_.setFloat(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(int i, float f) {
            ensureLongitudeIsMutable();
            this.longitude_.setFloat(i, f);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C02331.f1294xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ring();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.latitude_.n();
                    this.longitude_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Ring ring = (Ring) obj2;
                    this.latitude_ = hVar.b(this.latitude_, ring.latitude_);
                    this.longitude_ = hVar.b(this.longitude_, ring.longitude_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    int iC = eVar.C();
                                    int iL = eVar.l(iC);
                                    if (!this.latitude_.q() && eVar.d() > 0) {
                                        this.latitude_ = this.latitude_.d(this.latitude_.size() + (iC / 4));
                                    }
                                    while (eVar.d() > 0) {
                                        this.latitude_.M(eVar.s());
                                    }
                                    eVar.k(iL);
                                } else if (iM == 13) {
                                    if (!this.latitude_.q()) {
                                        this.latitude_ = GeneratedMessageLite.mutableCopy(this.latitude_);
                                    }
                                    this.latitude_.M(eVar.s());
                                } else if (iM == 18) {
                                    int iC2 = eVar.C();
                                    int iL2 = eVar.l(iC2);
                                    if (!this.longitude_.q() && eVar.d() > 0) {
                                        this.longitude_ = this.longitude_.d(this.longitude_.size() + (iC2 / 4));
                                    }
                                    while (eVar.d() > 0) {
                                        this.longitude_.M(eVar.s());
                                    }
                                    eVar.k(iL2);
                                } else if (iM == 21) {
                                    if (!this.longitude_.q()) {
                                        this.longitude_ = GeneratedMessageLite.mutableCopy(this.longitude_);
                                    }
                                    this.longitude_.M(eVar.s());
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Ring.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public float getLatitude(int i) {
            return this.latitude_.getFloat(i);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public int getLatitudeCount() {
            return this.latitude_.size();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public List<Float> getLatitudeList() {
            return this.latitude_;
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public float getLongitude(int i) {
            return this.longitude_.getFloat(i);
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public int getLongitudeCount() {
            return this.longitude_.size();
        }

        @Override // com.p1.mobile.android.geocoding.Geocoding.RingOrBuilder
        public List<Float> getLongitudeList() {
            return this.longitude_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int size = (getLatitudeList().size() * 4) + getLatitudeList().size() + (getLongitudeList().size() * 4) + getLongitudeList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.latitude_.size(); i++) {
                codedOutputStream.o0(1, this.latitude_.getFloat(i));
            }
            for (int i2 = 0; i2 < this.longitude_.size(); i2++) {
                codedOutputStream.o0(2, this.longitude_.getFloat(i2));
            }
        }

        public static Ring parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ring parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Ring parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ring parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Ring parseFrom(InputStream inputStream) throws IOException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ring parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Ring parseFrom(e eVar) throws IOException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Ring parseFrom(e eVar, h hVar) throws IOException {
            return (Ring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
