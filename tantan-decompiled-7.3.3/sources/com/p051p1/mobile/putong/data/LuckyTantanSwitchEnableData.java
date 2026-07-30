package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class LuckyTantanSwitchEnableData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "luckytantanswitchenabledata";

    @ProtobufIndex(index = 2)
    public boolean data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LuckyTantanSwitchEnableData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LuckyTantanSwitchEnableData>() { // from class: com.p1.mobile.putong.data.LuckyTantanSwitchEnableData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LuckyTantanSwitchEnableData luckyTantanSwitchEnableData) {
            Meta meta = luckyTantanSwitchEnableData.meta;
            int iM17285l = (meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17275b(2, luckyTantanSwitchEnableData.data);
            luckyTantanSwitchEnableData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LuckyTantanSwitchEnableData parse(nc5 nc5Var) throws IOException {
            LuckyTantanSwitchEnableData luckyTantanSwitchEnableData = new LuckyTantanSwitchEnableData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (luckyTantanSwitchEnableData.meta != null) {
                        break;
                    }
                    luckyTantanSwitchEnableData.meta = Meta.new_();
                    break;
                }
                if (iM162497u == 10) {
                    luckyTantanSwitchEnableData.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 16) {
                        if (luckyTantanSwitchEnableData.meta != null) {
                            break;
                        }
                        luckyTantanSwitchEnableData.meta = Meta.new_();
                        return luckyTantanSwitchEnableData;
                    }
                    luckyTantanSwitchEnableData.data = nc5Var.m162483g();
                }
            }
            return luckyTantanSwitchEnableData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LuckyTantanSwitchEnableData luckyTantanSwitchEnableData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = luckyTantanSwitchEnableData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(2, luckyTantanSwitchEnableData.data);
        }
    };
    public static JsonAdapter<LuckyTantanSwitchEnableData> JSON_ADAPTER = new ObjectJsonAdapter<LuckyTantanSwitchEnableData>() { // from class: com.p1.mobile.putong.data.LuckyTantanSwitchEnableData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LuckyTantanSwitchEnableData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LuckyTantanSwitchEnableData newInstance() {
            return new LuckyTantanSwitchEnableData();
        }

        public boolean parseField(LuckyTantanSwitchEnableData luckyTantanSwitchEnableData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                luckyTantanSwitchEnableData.data = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            luckyTantanSwitchEnableData.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LuckyTantanSwitchEnableData luckyTantanSwitchEnableData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(luckyTantanSwitchEnableData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LuckyTantanSwitchEnableData luckyTantanSwitchEnableData, JsonGenerator jsonGenerator) throws IOException {
            if (luckyTantanSwitchEnableData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(luckyTantanSwitchEnableData.meta, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("data", luckyTantanSwitchEnableData.data);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LuckyTantanSwitchEnableData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LuckyTantanSwitchEnableData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LuckyTantanSwitchEnableData new_() {
        LuckyTantanSwitchEnableData luckyTantanSwitchEnableData = new LuckyTantanSwitchEnableData();
        luckyTantanSwitchEnableData.nullCheck();
        return luckyTantanSwitchEnableData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LuckyTantanSwitchEnableData mo225055clone() {
        LuckyTantanSwitchEnableData luckyTantanSwitchEnableData = new LuckyTantanSwitchEnableData();
        Meta meta = this.meta;
        if (meta != null) {
            luckyTantanSwitchEnableData.meta = meta.mo225055clone();
        }
        luckyTantanSwitchEnableData.data = this.data;
        return luckyTantanSwitchEnableData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LuckyTantanSwitchEnableData)) {
            return false;
        }
        LuckyTantanSwitchEnableData luckyTantanSwitchEnableData = (LuckyTantanSwitchEnableData) obj;
        return ValueObject.util_equals(this.meta, luckyTantanSwitchEnableData.meta) && this.data == luckyTantanSwitchEnableData.data;
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
        int iHashCode = ((i2 + (meta != null ? meta.hashCode() : 0)) * 41) + (this.data ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
