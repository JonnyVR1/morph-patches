package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class AdMaterialUserRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "admaterialuserrecord";

    @NonNull
    @ProtobufIndex(index = 2)
    public UserRecordData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AdMaterialUserRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdMaterialUserRecord>() { // from class: com.p1.mobile.putong.data.AdMaterialUserRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdMaterialUserRecord adMaterialUserRecord) {
            Meta meta = adMaterialUserRecord.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            UserRecordData userRecordData = adMaterialUserRecord.data;
            if (userRecordData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, userRecordData, UserRecordData.PROTOBUF_ADAPTER);
            }
            adMaterialUserRecord.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdMaterialUserRecord parse(nb5 nb5Var) throws IOException {
            AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adMaterialUserRecord.meta == null) {
                        adMaterialUserRecord.meta = Meta.new_();
                    }
                    if (adMaterialUserRecord.data != null) {
                        break;
                    }
                    adMaterialUserRecord.data = UserRecordData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    adMaterialUserRecord.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (adMaterialUserRecord.meta == null) {
                            adMaterialUserRecord.meta = Meta.new_();
                        }
                        if (adMaterialUserRecord.data != null) {
                            break;
                        }
                        adMaterialUserRecord.data = UserRecordData.new_();
                        return adMaterialUserRecord;
                    }
                    adMaterialUserRecord.data = (UserRecordData) nb5Var.m158743l(UserRecordData.PROTOBUF_ADAPTER);
                }
            }
            return adMaterialUserRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdMaterialUserRecord adMaterialUserRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = adMaterialUserRecord.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            UserRecordData userRecordData = adMaterialUserRecord.data;
            if (userRecordData != null) {
                codedOutputByteBufferNano.m17254K(2, userRecordData, UserRecordData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdMaterialUserRecord> JSON_ADAPTER = new ObjectJsonAdapter<AdMaterialUserRecord>() { // from class: com.p1.mobile.putong.data.AdMaterialUserRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdMaterialUserRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdMaterialUserRecord newInstance() {
            return new AdMaterialUserRecord();
        }

        public boolean parseField(AdMaterialUserRecord adMaterialUserRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                adMaterialUserRecord.data = UserRecordData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            adMaterialUserRecord.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdMaterialUserRecord adMaterialUserRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(adMaterialUserRecord, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdMaterialUserRecord adMaterialUserRecord, JsonGenerator jsonGenerator) throws IOException {
            if (adMaterialUserRecord.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(adMaterialUserRecord.meta, jsonGenerator, true);
            }
            if (adMaterialUserRecord.data != null) {
                jsonGenerator.writeFieldName("data");
                UserRecordData.JSON_ADAPTER.serialize(adMaterialUserRecord.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdMaterialUserRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdMaterialUserRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdMaterialUserRecord new_() {
        AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
        adMaterialUserRecord.nullCheck();
        return adMaterialUserRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdMaterialUserRecord mo223809clone() {
        AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
        Meta meta = this.meta;
        if (meta != null) {
            adMaterialUserRecord.meta = meta.mo223809clone();
        }
        UserRecordData userRecordData = this.data;
        if (userRecordData != null) {
            adMaterialUserRecord.data = userRecordData.mo223809clone();
        }
        return adMaterialUserRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdMaterialUserRecord)) {
            return false;
        }
        AdMaterialUserRecord adMaterialUserRecord = (AdMaterialUserRecord) obj;
        return ValueObject.util_equals(this.meta, adMaterialUserRecord.meta) && ValueObject.util_equals(this.data, adMaterialUserRecord.data);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        UserRecordData userRecordData = this.data;
        int iHashCode2 = iHashCode + (userRecordData != null ? userRecordData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = UserRecordData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
