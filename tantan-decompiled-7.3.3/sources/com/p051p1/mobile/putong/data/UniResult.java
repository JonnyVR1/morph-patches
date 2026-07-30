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
public class UniResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uniresult";

    @ProtobufIndex(index = 1)
    public int resultCode;

    @NonNull
    @ProtobufIndex(index = 3)
    public UniData resultData;

    @NonNull
    @ProtobufIndex(index = 2)
    public String resultMsg;
    public static ProtobufAdapter<UniResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<UniResult>() { // from class: com.p1.mobile.putong.data.UniResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UniResult uniResult) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, uniResult.resultCode);
            String str = uniResult.resultMsg;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            UniData uniData = uniResult.resultData;
            if (uniData != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, uniData, UniData.PROTOBUF_ADAPTER);
            }
            uniResult.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UniResult parse(nc5 nc5Var) throws IOException {
            UniResult uniResult = new UniResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (uniResult.resultMsg == null) {
                        uniResult.resultMsg = "";
                    }
                    if (uniResult.resultData != null) {
                        break;
                    }
                    uniResult.resultData = UniData.new_();
                    break;
                }
                if (iM162497u == 8) {
                    uniResult.resultCode = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    uniResult.resultMsg = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (uniResult.resultMsg == null) {
                            uniResult.resultMsg = "";
                        }
                        if (uniResult.resultData != null) {
                            break;
                        }
                        uniResult.resultData = UniData.new_();
                        return uniResult;
                    }
                    uniResult.resultData = (UniData) nc5Var.m162488l(UniData.PROTOBUF_ADAPTER);
                }
            }
            return uniResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UniResult uniResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, uniResult.resultCode);
            String str = uniResult.resultMsg;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            UniData uniData = uniResult.resultData;
            if (uniData != null) {
                codedOutputByteBufferNano.m17309K(3, uniData, UniData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UniResult> JSON_ADAPTER = new ObjectJsonAdapter<UniResult>() { // from class: com.p1.mobile.putong.data.UniResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UniResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UniResult newInstance() {
            return new UniResult();
        }

        public boolean parseField(UniResult uniResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resultMsg":
                    uniResult.resultMsg = jsonParser.getValueAsString();
                    return true;
                case "resultCode":
                    uniResult.resultCode = jsonParser.getValueAsInt();
                    return true;
                case "resultData":
                    uniResult.resultData = UniData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UniResult uniResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resultMsg":
                case "resultCode":
                case "resultData":
                    return true;
                default:
                    return super.parseFieldCheck(uniResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UniResult uniResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("resultCode", uniResult.resultCode);
            String str = uniResult.resultMsg;
            if (str != null) {
                jsonGenerator.writeStringField("resultMsg", str);
            }
            if (uniResult.resultData != null) {
                jsonGenerator.writeFieldName("resultData");
                UniData.JSON_ADAPTER.serialize(uniResult.resultData, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UniResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UniResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UniResult new_() {
        UniResult uniResult = new UniResult();
        uniResult.nullCheck();
        return uniResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UniResult mo225055clone() {
        UniResult uniResult = new UniResult();
        uniResult.resultCode = this.resultCode;
        uniResult.resultMsg = this.resultMsg;
        UniData uniData = this.resultData;
        if (uniData != null) {
            uniResult.resultData = uniData.mo225055clone();
        }
        return uniResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UniResult)) {
            return false;
        }
        UniResult uniResult = (UniResult) obj;
        return this.resultCode == uniResult.resultCode && ValueObject.util_equals(this.resultMsg, uniResult.resultMsg) && ValueObject.util_equals(this.resultData, uniResult.resultData);
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
        int i2 = ((i * 41) + this.resultCode) * 41;
        String str = this.resultMsg;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        UniData uniData = this.resultData;
        int iHashCode2 = iHashCode + (uniData != null ? uniData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resultMsg == null) {
            this.resultMsg = "";
        }
        if (this.resultData == null) {
            this.resultData = UniData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
