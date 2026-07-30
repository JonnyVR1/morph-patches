package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdMaterialUserRecord adMaterialUserRecord) {
            Meta meta = adMaterialUserRecord.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            UserRecordData userRecordData = adMaterialUserRecord.data;
            if (userRecordData != null) {
                iL += CodedOutputByteBufferNano.l(2, userRecordData, UserRecordData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) adMaterialUserRecord).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdMaterialUserRecord m17632parse(nb5 nb5Var) throws IOException {
            AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adMaterialUserRecord.meta == null) {
                        adMaterialUserRecord.meta = Meta.new_();
                    }
                    if (adMaterialUserRecord.data != null) {
                        break;
                    }
                    adMaterialUserRecord.data = UserRecordData.new_();
                    break;
                }
                if (iU == 10) {
                    adMaterialUserRecord.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (adMaterialUserRecord.meta == null) {
                            adMaterialUserRecord.meta = Meta.new_();
                        }
                        if (adMaterialUserRecord.data != null) {
                            break;
                        }
                        adMaterialUserRecord.data = UserRecordData.new_();
                        return adMaterialUserRecord;
                    }
                    adMaterialUserRecord.data = (UserRecordData) nb5Var.l(UserRecordData.PROTOBUF_ADAPTER);
                }
            }
            return adMaterialUserRecord;
        }

        public void serialize(AdMaterialUserRecord adMaterialUserRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = adMaterialUserRecord.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            UserRecordData userRecordData = adMaterialUserRecord.data;
            if (userRecordData != null) {
                codedOutputByteBufferNano.K(2, userRecordData, UserRecordData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdMaterialUserRecord> JSON_ADAPTER = new ObjectJsonAdapter<AdMaterialUserRecord>() { // from class: com.p1.mobile.putong.data.AdMaterialUserRecord.2
        public Class getDataClass() {
            return AdMaterialUserRecord.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdMaterialUserRecord mo17830newInstance() {
            return new AdMaterialUserRecord();
        }

        public boolean parseField(AdMaterialUserRecord adMaterialUserRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                adMaterialUserRecord.data = (UserRecordData) UserRecordData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            adMaterialUserRecord.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdMaterialUserRecord adMaterialUserRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(adMaterialUserRecord, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdMaterialUserRecord adMaterialUserRecord, JsonGenerator jsonGenerator) throws IOException {
            if (adMaterialUserRecord.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(adMaterialUserRecord.meta, jsonGenerator, true);
            }
            if (adMaterialUserRecord.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                UserRecordData.JSON_ADAPTER.serialize(adMaterialUserRecord.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdMaterialUserRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdMaterialUserRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdMaterialUserRecord new_() {
        AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
        adMaterialUserRecord.nullCheck();
        return adMaterialUserRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdMaterialUserRecord m17631clone() {
        AdMaterialUserRecord adMaterialUserRecord = new AdMaterialUserRecord();
        Meta meta = this.meta;
        if (meta != null) {
            adMaterialUserRecord.meta = meta.m18461clone();
        }
        UserRecordData userRecordData = this.data;
        if (userRecordData != null) {
            adMaterialUserRecord.data = userRecordData.m19213clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        UserRecordData userRecordData = this.data;
        int iHashCode2 = iHashCode + (userRecordData != null ? userRecordData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = UserRecordData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
