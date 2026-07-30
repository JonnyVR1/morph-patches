package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.StickerSourceInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class Sticker extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "sticker";

    @NonNull
    @ProtobufIndex(index = 56)
    public String hash;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 51)
    public String package_;

    @NonNull
    @ProtobufIndex(index = 53)
    public List<Picture> pictures;

    @ProtobufIndex(index = 55)
    public long seq;

    @Nullable
    @ProtobufIndex(index = 54)
    public StickerSource source;

    @Nullable
    @ProtobufIndex(index = 57)
    public String status;
    public static ProtobufAdapter<Sticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<Sticker>() { // from class: com.p1.mobile.putong.core.data.Sticker.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Sticker sticker) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, sticker._id);
            String str = sticker.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = sticker.package_;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = sticker.name;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            List<Picture> list = sticker.pictures;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(53, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StickerSource stickerSource = sticker.source;
            if (stickerSource != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(54, stickerSource.ordinal());
            }
            int iM17228j2 = iM17228j + CodedOutputByteBufferNano.m17228j(55, sticker.seq);
            String str4 = sticker.hash;
            if (str4 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(56, str4);
            }
            String str5 = sticker.status;
            if (str5 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(57, str5);
            }
            StickerSource stickerSource2 = sticker.source;
            if (stickerSource2 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17230l(58, stickerSource2, StickerSource.PROTOBUF_ADAPTER);
            }
            sticker.cachedSize = iM17228j2;
            return iM17228j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Sticker parse(nb5 nb5Var) throws IOException {
            Sticker sticker = new Sticker();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (sticker.source == null && numValueOf != null) {
                            sticker.source = (StickerSource) StickerSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (sticker.package_ == null) {
                            sticker.package_ = "";
                        }
                        if (sticker.name == null) {
                            sticker.name = "";
                        }
                        if (sticker.pictures == null) {
                            sticker.pictures = new ArrayList();
                        }
                        if (sticker.hash == null) {
                            sticker.hash = "";
                        }
                        break;
                    case 8:
                        sticker._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        sticker.f56011id = nb5Var.m158750s();
                        continue;
                    case 410:
                        sticker.package_ = nb5Var.m158750s();
                        continue;
                    case 418:
                        sticker.name = nb5Var.m158750s();
                        continue;
                    case 426:
                        sticker.pictures = (List) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 432:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 440:
                        sticker.seq = nb5Var.m158742k();
                        continue;
                    case 450:
                        sticker.hash = nb5Var.m158750s();
                        continue;
                    case 458:
                        sticker.status = nb5Var.m158750s();
                        continue;
                    case 466:
                        sticker.source = (StickerSource) nb5Var.m158743l(StickerSource.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (sticker.source == null && numValueOf != null) {
                            sticker.source = (StickerSource) StickerSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (sticker.package_ == null) {
                            sticker.package_ = "";
                        }
                        if (sticker.name == null) {
                            sticker.name = "";
                        }
                        if (sticker.pictures == null) {
                            sticker.pictures = new ArrayList();
                        }
                        if (sticker.hash == null) {
                            sticker.hash = "";
                            return sticker;
                        }
                        break;
                }
            }
            return sticker;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Sticker sticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, sticker._id);
            String str = sticker.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = sticker.package_;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = sticker.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            List<Picture> list = sticker.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(53, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StickerSource stickerSource = sticker.source;
            if (stickerSource != null) {
                codedOutputByteBufferNano.m17250G(54, stickerSource.ordinal());
            }
            codedOutputByteBufferNano.m17252I(55, sticker.seq);
            String str4 = sticker.hash;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(56, str4);
            }
            String str5 = sticker.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(57, str5);
            }
            StickerSource stickerSource2 = sticker.source;
            if (stickerSource2 != null) {
                codedOutputByteBufferNano.m17254K(58, stickerSource2, StickerSource.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Sticker> JSON_ADAPTER = new ObjectJsonAdapter<Sticker>() { // from class: com.p1.mobile.putong.core.data.Sticker.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Sticker.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Sticker newInstance() {
            return new Sticker();
        }

        public boolean parseField(Sticker sticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    sticker.source = StickerSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "status":
                    sticker.status = jsonParser.getValueAsString();
                    return true;
                case "package":
                    sticker.package_ = Converter.PACKAGE_ID.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    sticker.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    sticker.f56011id = jsonParser.getValueAsString();
                    return false;
                case "seq":
                    sticker.seq = jsonParser.getValueAsLong();
                    return true;
                case "hash":
                    sticker.hash = jsonParser.getValueAsString();
                    return true;
                case "name":
                    sticker.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Sticker sticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "status":
                case "package":
                case "pictures":
                    return true;
                case "id":
                    return false;
                case "seq":
                case "hash":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(sticker, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Sticker sticker, JsonGenerator jsonGenerator) throws IOException {
            String str = sticker.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (sticker.package_ != null) {
                jsonGenerator.writeFieldName("package");
                Converter.PACKAGE_ID.serialize(sticker.package_, jsonGenerator, true);
            }
            String str2 = sticker.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (sticker.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(sticker.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            if (sticker.source != null) {
                jsonGenerator.writeFieldName("source");
                StickerSource.JSON_ADAPTER.serialize(sticker.source, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("seq", sticker.seq);
            String str3 = sticker.hash;
            if (str3 != null) {
                jsonGenerator.writeStringField("hash", str3);
            }
            String str4 = sticker.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Sticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Sticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Sticker> _ID = new LongColumn<Sticker>("_id") { // from class: com.p1.mobile.putong.core.data.Sticker.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Sticker sticker) {
            return Long.valueOf(sticker._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, Long l2) {
            sticker._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Sticker> f20504ID = new StringColumn<Sticker>("id_c") { // from class: com.p1.mobile.putong.core.data.Sticker.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Sticker sticker) {
            return sticker.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, String str) {
            sticker.f56011id = str;
        }
    };
    public static final StringColumn<Sticker> PACKAGE_ = new StringColumn<Sticker>("package__c") { // from class: com.p1.mobile.putong.core.data.Sticker.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Sticker sticker) {
            return sticker.package_;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, String str) {
            sticker.package_ = str;
        }
    };
    public static final StringColumn<Sticker> NAME = new StringColumn<Sticker>("name_c") { // from class: com.p1.mobile.putong.core.data.Sticker.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Sticker sticker) {
            return sticker.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, String str) {
            sticker.name = str;
        }
    };
    public static final Column<Sticker, List<Picture>> PICTURES = new Column<Sticker, List<Picture>>("pictures_c") { // from class: com.p1.mobile.putong.core.data.Sticker.7
        @Override // com.tantanapp.common.data.orm.Column
        public List<Picture> get(Sticker sticker) {
            return sticker.pictures;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, List<Picture> list) {
            sticker.pictures = list;
        }
    };
    public static final TEnumColumn<Sticker, StickerSource> SOURCE = new TEnumColumn<Sticker, StickerSource>("str_source_c", "source_c", StickerSource.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Sticker.8
        @Override // com.tantanapp.common.data.orm.Column
        public StickerSource get(Sticker sticker) {
            return sticker.source;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Sticker sticker, StickerSource stickerSource) {
            sticker.source = stickerSource;
        }
    };
    public static final LongColumn<Sticker> SEQ = new LongColumn<Sticker>("seq_c") { // from class: com.p1.mobile.putong.core.data.Sticker.9
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Sticker sticker) {
            return Long.valueOf(sticker.seq);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, Long l2) {
            sticker.seq = l2.longValue();
        }
    };
    public static final StringColumn<Sticker> HASH = new StringColumn<Sticker>("hash_c") { // from class: com.p1.mobile.putong.core.data.Sticker.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Sticker sticker) {
            return sticker.hash;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, String str) {
            sticker.hash = str;
        }
    };
    public static final StringColumn<Sticker> STATUS = new StringColumn<Sticker>("status_c") { // from class: com.p1.mobile.putong.core.data.Sticker.11
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Sticker sticker) {
            return sticker.status;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Sticker sticker, String str) {
            sticker.status = str;
        }
    };
    public static mrf0<Sticker> DB_ADAPTER = new mrf0<Sticker>() { // from class: com.p1.mobile.putong.core.data.Sticker.12
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,package__c TEXT,name_c TEXT,pictures_c BLOB,source_c INTEGER,seq_c INTEGER,hash_c TEXT,status_c TEXT,str_source_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return Sticker.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Sticker init() {
            Sticker sticker = new Sticker();
            if (sticker.package_ == null) {
                sticker.package_ = "";
            }
            if (sticker.name == null) {
                sticker.name = "";
            }
            if (sticker.pictures == null) {
                sticker.pictures = new ArrayList();
            }
            if (sticker.hash == null) {
                sticker.hash = "";
            }
            return sticker;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Sticker read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            Sticker sticker = new Sticker();
            String string = "unknown_";
            int i2 = -1;
            try {
                sticker._id = cursor.getLong(i);
                int i3 = i + 1;
                sticker.f56011id = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 2;
                sticker.package_ = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 3;
                sticker.name = cursor.isNull(i5) ? null : cursor.getString(i5);
                int i6 = i + 4;
                sticker.pictures = cursor.isNull(i6) ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i6));
                int i7 = i + 5;
                if (!cursor.isNull(i7)) {
                    i2 = cursor.getInt(i7);
                }
                sticker.seq = cursor.getLong(i + 6);
                int i8 = i + 7;
                sticker.hash = cursor.isNull(i8) ? null : cursor.getString(i8);
                int i9 = i + 8;
                sticker.status = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 9;
                string = cursor.isNull(i10) ? null : cursor.getString(i10);
                this.readIndex = i + 10;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            sticker.source = (StickerSource) StickerSource.JSON_ADAPTER.newTEnum(string, i2);
            if (sticker.package_ == null) {
                sticker.package_ = "";
            }
            if (sticker.name == null) {
                sticker.name = "";
            }
            if (sticker.pictures == null) {
                sticker.pictures = new ArrayList();
            }
            if (sticker.hash == null) {
                sticker.hash = "";
            }
            return sticker;
        }

        @Override // p149l.mrf0
        public void write(Sticker sticker, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", sticker.f56011id);
                DbObject.cvPut(contentValues, "package__c", sticker.package_);
                DbObject.cvPut(contentValues, "name_c", sticker.name);
                DbObject.cvPut(contentValues, "pictures_c", sticker.pictures == null ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(sticker.pictures));
                StickerSource stickerSource = sticker.source;
                DbObject.cvPut(contentValues, "str_source_c", stickerSource == null ? null : stickerSource.toString());
                StickerSource stickerSource2 = sticker.source;
                DbObject.cvPut(contentValues, "source_c", stickerSource2 == null ? null : Integer.valueOf(stickerSource2.ordinal()));
                DbObject.cvPut(contentValues, "seq_c", Long.valueOf(sticker.seq));
                DbObject.cvPut(contentValues, "hash_c", sticker.hash);
                DbObject.cvPut(contentValues, "status_c", sticker.status);
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static Sticker new_() {
        Sticker sticker = new Sticker();
        sticker.nullCheck();
        return sticker;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Sticker mo223809clone() {
        Sticker sticker = new Sticker();
        sticker._id = this._id;
        sticker.f56011id = this.f56011id;
        sticker.package_ = this.package_;
        sticker.name = this.name;
        List<Picture> list = this.pictures;
        if (list != null) {
            sticker.pictures = ValueObject.util_map(list, new w9j() { // from class: l.lwf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture) obj).mo223809clone();
                }
            });
        }
        sticker.source = this.source;
        sticker.seq = this.seq;
        sticker.hash = this.hash;
        sticker.status = this.status;
        return sticker;
    }

    public StickerInfo cloneSticker() {
        StickerInfo stickerInfoNew_ = StickerInfo.new_();
        stickerInfoNew_.f56011id = this.f56011id;
        stickerInfoNew_.package_ = this.package_;
        stickerInfoNew_.name = this.name;
        stickerInfoNew_.pictures = this.pictures;
        StickerSource stickerSource = this.source;
        if (stickerSource != null) {
            stickerInfoNew_.source = StickerSourceInfo.get(stickerSource.name());
        }
        stickerInfoNew_.seq = this.seq;
        stickerInfoNew_.hash = this.hash;
        stickerInfoNew_.status = this.status;
        return stickerInfoNew_;
    }

    public boolean couldAdd() {
        return (TEnum.equals(this.source, "poke") || TEnum.equals(this.source, "intimate")) ? false : true;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return super.equals(obj) && ValueObject.util_equals(this.package_, sticker.package_) && ValueObject.util_equals(this.name, sticker.name) && ValueObject.util_equals(this.pictures, sticker.pictures) && ValueObject.util_equals(this.source, sticker.source) && this.seq == sticker.seq && ValueObject.util_equals(this.hash, sticker.hash) && ValueObject.util_equals(this.status, sticker.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "sticker";
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.package_;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Picture> list = this.pictures;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        StickerSource stickerSource = this.source;
        int iHashCode5 = stickerSource != null ? stickerSource.hashCode() : 0;
        long j = this.seq;
        int i2 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.hash;
        int iHashCode6 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean isChatheatSticker() {
        return TEnum.equals(this.source, "poke") || TEnum.equals(this.source, "intimate");
    }

    public void mergeDataFromStickerInfo(StickerInfo stickerInfo) {
        this.f56011id = stickerInfo.f56011id;
        this.package_ = stickerInfo.package_;
        this.name = stickerInfo.name;
        this.pictures = stickerInfo.pictures;
        StickerSourceInfo stickerSourceInfo = stickerInfo.source;
        if (stickerSourceInfo != null) {
            this.source = StickerSource.get(stickerSourceInfo.name());
        }
        this.seq = stickerInfo.seq;
        this.hash = stickerInfo.hash;
        this.status = stickerInfo.status;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.package_ == null) {
            this.package_ = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.hash == null) {
            this.hash = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
