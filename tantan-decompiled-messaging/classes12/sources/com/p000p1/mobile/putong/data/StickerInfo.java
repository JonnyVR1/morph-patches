package com.p000p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.tenum.TEnumColumn;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.HashSet;
import java.util.List;
import l.nb5;
import l.w9j;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class StickerInfo extends DbObject<StickerInfo> implements Cloneable, Serializable {
    public static final String TYPE = "stickerinfo";

    @NonNull
    @ProtobufIndex(index = 55)
    public String hash;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 51)
    public String package_;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 53)
    public List<Picture> pictures;
    private String requestUrl;

    @ProtobufIndex(index = 54)
    public long seq;

    @Nullable
    @ProtobufIndex(index = 57)
    public StickerSourceInfo source;

    @Nullable
    @ProtobufIndex(index = 56)
    public String status;
    public static ProtobufAdapter<StickerInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerInfo>() { // from class: com.p1.mobile.putong.data.StickerInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StickerInfo stickerInfo) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) stickerInfo)._id);
            String str = ((DbObject) stickerInfo).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = stickerInfo.package_;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = stickerInfo.name;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            List<Picture> list = stickerInfo.pictures;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(53, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(54, stickerInfo.seq);
            String str4 = stickerInfo.hash;
            if (str4 != null) {
                iJ2 += CodedOutputByteBufferNano.o(55, str4);
            }
            String str5 = stickerInfo.status;
            if (str5 != null) {
                iJ2 += CodedOutputByteBufferNano.o(56, str5);
            }
            StickerSourceInfo stickerSourceInfo = stickerInfo.source;
            if (stickerSourceInfo != null) {
                iJ2 += CodedOutputByteBufferNano.l(57, stickerSourceInfo, StickerSourceInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) stickerInfo).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StickerInfo m19028parse(nb5 nb5Var) throws IOException {
            StickerInfo stickerInfo = new StickerInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stickerInfo.package_ == null) {
                        stickerInfo.package_ = "";
                    }
                    if (stickerInfo.name == null) {
                        stickerInfo.name = "";
                    }
                    if (stickerInfo.pictures == null) {
                        stickerInfo.pictures = new ArrayList();
                    }
                    if (stickerInfo.hash != null) {
                        break;
                    }
                    stickerInfo.hash = "";
                    break;
                }
                if (iU == 8) {
                    ((DbObject) stickerInfo)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) stickerInfo).id = nb5Var.s();
                } else if (iU == 410) {
                    stickerInfo.package_ = nb5Var.s();
                } else if (iU == 418) {
                    stickerInfo.name = nb5Var.s();
                } else if (iU == 426) {
                    stickerInfo.pictures = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 432) {
                    stickerInfo.seq = nb5Var.k();
                } else if (iU == 442) {
                    stickerInfo.hash = nb5Var.s();
                } else if (iU == 450) {
                    stickerInfo.status = nb5Var.s();
                } else {
                    if (iU != 458) {
                        if (stickerInfo.package_ == null) {
                            stickerInfo.package_ = "";
                        }
                        if (stickerInfo.name == null) {
                            stickerInfo.name = "";
                        }
                        if (stickerInfo.pictures == null) {
                            stickerInfo.pictures = new ArrayList();
                        }
                        if (stickerInfo.hash != null) {
                            break;
                        }
                        stickerInfo.hash = "";
                        return stickerInfo;
                    }
                    stickerInfo.source = (StickerSourceInfo) nb5Var.l(StickerSourceInfo.PROTOBUF_ADAPTER);
                }
            }
            return stickerInfo;
        }

        public void serialize(StickerInfo stickerInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) stickerInfo)._id);
            String str = ((DbObject) stickerInfo).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = stickerInfo.package_;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = stickerInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            List<Picture> list = stickerInfo.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(53, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(54, stickerInfo.seq);
            String str4 = stickerInfo.hash;
            if (str4 != null) {
                codedOutputByteBufferNano.R(55, str4);
            }
            String str5 = stickerInfo.status;
            if (str5 != null) {
                codedOutputByteBufferNano.R(56, str5);
            }
            StickerSourceInfo stickerSourceInfo = stickerInfo.source;
            if (stickerSourceInfo != null) {
                codedOutputByteBufferNano.K(57, stickerSourceInfo, StickerSourceInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<StickerInfo> JSON_ADAPTER = new ObjectJsonAdapter<StickerInfo>() { // from class: com.p1.mobile.putong.data.StickerInfo.2
        public Class getDataClass() {
            return StickerInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StickerInfo mo17830newInstance() {
            return new StickerInfo();
        }

        public boolean parseField(StickerInfo stickerInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    stickerInfo.source = (StickerSourceInfo) StickerSourceInfo.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "status":
                    stickerInfo.status = jsonParser.getValueAsString();
                    return true;
                case "package":
                    stickerInfo.package_ = (String) Converter.PACKAGE_ID.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    stickerInfo.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) stickerInfo).id = jsonParser.getValueAsString();
                    return false;
                case "seq":
                    stickerInfo.seq = jsonParser.getValueAsLong();
                    return true;
                case "hash":
                    stickerInfo.hash = jsonParser.getValueAsString();
                    return true;
                case "name":
                    stickerInfo.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StickerInfo stickerInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
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
                    return super.parseFieldCheck(stickerInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StickerInfo stickerInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) stickerInfo).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (stickerInfo.package_ != null) {
                jsonGenerator.writeFieldName("package");
                Converter.PACKAGE_ID.serialize(stickerInfo.package_, jsonGenerator, true);
            }
            String str2 = stickerInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (stickerInfo.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(stickerInfo.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            jsonGenerator.writeNumberField("seq", stickerInfo.seq);
            String str3 = stickerInfo.hash;
            if (str3 != null) {
                jsonGenerator.writeStringField("hash", str3);
            }
            String str4 = stickerInfo.status;
            if (str4 != null) {
                jsonGenerator.writeStringField("status", str4);
            }
            if (stickerInfo.source != null) {
                jsonGenerator.writeFieldName("source");
                StickerSourceInfo.JSON_ADAPTER.serialize(stickerInfo.source, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<StickerInfo> _ID = new LongColumn<StickerInfo>("_id") { // from class: com.p1.mobile.putong.data.StickerInfo.3
        public Long get(StickerInfo stickerInfo) {
            return Long.valueOf(((DbObject) stickerInfo)._id);
        }

        public void set(StickerInfo stickerInfo, Long l2) {
            ((DbObject) stickerInfo)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<StickerInfo> f283ID = new StringColumn<StickerInfo>("id_c") { // from class: com.p1.mobile.putong.data.StickerInfo.4
        public String get(StickerInfo stickerInfo) {
            return ((DbObject) stickerInfo).id;
        }

        public void set(StickerInfo stickerInfo, String str) {
            ((DbObject) stickerInfo).id = str;
        }
    };
    public static final StringColumn<StickerInfo> PACKAGE_ = new StringColumn<StickerInfo>("package__c") { // from class: com.p1.mobile.putong.data.StickerInfo.5
        public String get(StickerInfo stickerInfo) {
            return stickerInfo.package_;
        }

        public void set(StickerInfo stickerInfo, String str) {
            stickerInfo.package_ = str;
        }
    };
    public static final StringColumn<StickerInfo> NAME = new StringColumn<StickerInfo>("name_c") { // from class: com.p1.mobile.putong.data.StickerInfo.6
        public String get(StickerInfo stickerInfo) {
            return stickerInfo.name;
        }

        public void set(StickerInfo stickerInfo, String str) {
            stickerInfo.name = str;
        }
    };
    public static final Column<StickerInfo, List<Picture>> PICTURES = new Column<StickerInfo, List<Picture>>("pictures_c") { // from class: com.p1.mobile.putong.data.StickerInfo.7
        public List<Picture> get(StickerInfo stickerInfo) {
            return stickerInfo.pictures;
        }

        public void set(StickerInfo stickerInfo, List<Picture> list) {
            stickerInfo.pictures = list;
        }
    };
    public static final LongColumn<StickerInfo> SEQ = new LongColumn<StickerInfo>("seq_c") { // from class: com.p1.mobile.putong.data.StickerInfo.8
        public Long get(StickerInfo stickerInfo) {
            return Long.valueOf(stickerInfo.seq);
        }

        public void set(StickerInfo stickerInfo, Long l2) {
            stickerInfo.seq = l2.longValue();
        }
    };
    public static final StringColumn<StickerInfo> HASH = new StringColumn<StickerInfo>("hash_c") { // from class: com.p1.mobile.putong.data.StickerInfo.9
        public String get(StickerInfo stickerInfo) {
            return stickerInfo.hash;
        }

        public void set(StickerInfo stickerInfo, String str) {
            stickerInfo.hash = str;
        }
    };
    public static final StringColumn<StickerInfo> STATUS = new StringColumn<StickerInfo>("status_c") { // from class: com.p1.mobile.putong.data.StickerInfo.10
        public String get(StickerInfo stickerInfo) {
            return stickerInfo.status;
        }

        public void set(StickerInfo stickerInfo, String str) {
            stickerInfo.status = str;
        }
    };
    public static final TEnumColumn<StickerInfo, StickerSourceInfo> SOURCE = new TEnumColumn<StickerInfo, StickerSourceInfo>("source_c", null, StickerSourceInfo.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.StickerInfo.11
        public StickerSourceInfo get(StickerInfo stickerInfo) {
            return stickerInfo.source;
        }

        @Override // com.p000p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(StickerInfo stickerInfo, StickerSourceInfo stickerSourceInfo) {
            stickerInfo.source = stickerSourceInfo;
        }
    };
    public static mrf0<StickerInfo> DB_ADAPTER = new mrf0<StickerInfo>() { // from class: com.p1.mobile.putong.data.StickerInfo.12
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,package__c TEXT,name_c TEXT,pictures_c BLOB,seq_c INTEGER,hash_c TEXT,status_c TEXT,source_c TEXT)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return StickerInfo.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public StickerInfo init() {
            StickerInfo stickerInfo = new StickerInfo();
            if (stickerInfo.package_ == null) {
                stickerInfo.package_ = "";
            }
            if (stickerInfo.name == null) {
                stickerInfo.name = "";
            }
            if (stickerInfo.pictures == null) {
                stickerInfo.pictures = new ArrayList();
            }
            if (stickerInfo.hash == null) {
                stickerInfo.hash = "";
            }
            return stickerInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public StickerInfo read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            StickerInfo stickerInfo = new StickerInfo();
            try {
                ((DbObject) stickerInfo)._id = cursor.getLong(i);
                int i2 = i + 1;
                StickerSourceInfo stickerSourceInfo = null;
                ((DbObject) stickerInfo).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                stickerInfo.package_ = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                stickerInfo.name = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 4;
                stickerInfo.pictures = cursor.isNull(i5) ? null : (List) Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i5));
                stickerInfo.seq = cursor.getLong(i + 5);
                int i6 = i + 6;
                stickerInfo.hash = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 7;
                stickerInfo.status = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 8;
                if (!cursor.isNull(i8)) {
                    stickerSourceInfo = StickerSourceInfo.get(cursor.getString(i8));
                }
                stickerInfo.source = stickerSourceInfo;
                this.readIndex = i + 9;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (stickerInfo.package_ == null) {
                stickerInfo.package_ = "";
            }
            if (stickerInfo.name == null) {
                stickerInfo.name = "";
            }
            if (stickerInfo.pictures == null) {
                stickerInfo.pictures = new ArrayList();
            }
            if (stickerInfo.hash == null) {
                stickerInfo.hash = "";
            }
            return stickerInfo;
        }

        @Override // p007l.mrf0
        public void write(StickerInfo stickerInfo, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) stickerInfo).id);
                DbObject.cvPut(contentValues, "package__c", stickerInfo.package_);
                DbObject.cvPut(contentValues, "name_c", stickerInfo.name);
                DbObject.cvPut(contentValues, "pictures_c", stickerInfo.pictures == null ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(stickerInfo.pictures));
                DbObject.cvPut(contentValues, "seq_c", Long.valueOf(stickerInfo.seq));
                DbObject.cvPut(contentValues, "hash_c", stickerInfo.hash);
                DbObject.cvPut(contentValues, "status_c", stickerInfo.status);
                StickerSourceInfo stickerSourceInfo = stickerInfo.source;
                DbObject.cvPut(contentValues, "source_c", stickerSourceInfo == null ? null : stickerSourceInfo.toString());
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static StickerInfo new_() {
        StickerInfo stickerInfo = new StickerInfo();
        stickerInfo.nullCheck();
        return stickerInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StickerInfo m19027clone() {
        StickerInfo stickerInfo = new StickerInfo();
        ((DbObject) stickerInfo)._id = ((DbObject) this)._id;
        ((DbObject) stickerInfo).id = ((DbObject) this).id;
        stickerInfo.package_ = this.package_;
        stickerInfo.name = this.name;
        List<Picture> list = this.pictures;
        if (list != null) {
            stickerInfo.pictures = ValueObject.util_map(list, new w9j() { // from class: l.cxf0
                public final Object call(Object obj) {
                    return ((Picture) obj).mo17714clone();
                }
            });
        }
        stickerInfo.seq = this.seq;
        stickerInfo.hash = this.hash;
        stickerInfo.status = this.status;
        stickerInfo.source = this.source;
        return stickerInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerInfo)) {
            return false;
        }
        StickerInfo stickerInfo = (StickerInfo) obj;
        return super.equals(obj) && ValueObject.util_equals(this.package_, stickerInfo.package_) && ValueObject.util_equals(this.name, stickerInfo.name) && ValueObject.util_equals(this.pictures, stickerInfo.pictures) && this.seq == stickerInfo.seq && ValueObject.util_equals(this.hash, stickerInfo.hash) && ValueObject.util_equals(this.status, stickerInfo.status) && ValueObject.util_equals(this.source, stickerInfo.source);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.package_;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Picture> list = this.pictures;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        long j = this.seq;
        int i2 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.hash;
        int iHashCode5 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        StickerSourceInfo stickerSourceInfo = this.source;
        int iHashCode7 = iHashCode6 + (stickerSourceInfo != null ? stickerSourceInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(StickerInfo stickerInfo) {
        if (!shouldMergeData() || equals(stickerInfo)) {
            return;
        }
        if (!isFieldParsed("package")) {
            this.package_ = stickerInfo.package_;
        }
        if (!isFieldParsed("name")) {
            this.name = stickerInfo.name;
        }
        if (!isFieldParsed("pictures")) {
            this.pictures = stickerInfo.pictures;
        }
        if (!isFieldParsed("seq")) {
            this.seq = stickerInfo.seq;
        }
        if (!isFieldParsed("hash")) {
            this.hash = stickerInfo.hash;
        }
        if (!isFieldParsed("status")) {
            this.status = stickerInfo.status;
        }
        if (!isFieldParsed("source")) {
            this.source = stickerInfo.source;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
