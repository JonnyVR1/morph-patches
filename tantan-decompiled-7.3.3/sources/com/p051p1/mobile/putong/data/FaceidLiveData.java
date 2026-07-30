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
public class FaceidLiveData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "faceidlivedata";

    @NonNull
    @ProtobufIndex(index = 3)
    public ALiYunResult aliyun;

    @NonNull
    @ProtobufIndex(index = 2)
    public String data;

    @NonNull
    @ProtobufIndex(index = 4)
    public TencentResult tencent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String token;
    public static ProtobufAdapter<FaceidLiveData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FaceidLiveData>() { // from class: com.p1.mobile.putong.data.FaceidLiveData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FaceidLiveData faceidLiveData) {
            String str = faceidLiveData.token;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = faceidLiveData.data;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            ALiYunResult aLiYunResult = faceidLiveData.aliyun;
            if (aLiYunResult != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, aLiYunResult, ALiYunResult.PROTOBUF_ADAPTER);
            }
            TencentResult tencentResult = faceidLiveData.tencent;
            if (tencentResult != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, tencentResult, TencentResult.PROTOBUF_ADAPTER);
            }
            faceidLiveData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FaceidLiveData parse(nc5 nc5Var) throws IOException {
            FaceidLiveData faceidLiveData = new FaceidLiveData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (faceidLiveData.token == null) {
                        faceidLiveData.token = "";
                    }
                    if (faceidLiveData.data == null) {
                        faceidLiveData.data = "";
                    }
                    if (faceidLiveData.aliyun == null) {
                        faceidLiveData.aliyun = ALiYunResult.new_();
                    }
                    if (faceidLiveData.tencent != null) {
                        break;
                    }
                    faceidLiveData.tencent = TencentResult.new_();
                    break;
                }
                if (iM162497u == 10) {
                    faceidLiveData.token = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    faceidLiveData.data = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    faceidLiveData.aliyun = (ALiYunResult) nc5Var.m162488l(ALiYunResult.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (faceidLiveData.token == null) {
                            faceidLiveData.token = "";
                        }
                        if (faceidLiveData.data == null) {
                            faceidLiveData.data = "";
                        }
                        if (faceidLiveData.aliyun == null) {
                            faceidLiveData.aliyun = ALiYunResult.new_();
                        }
                        if (faceidLiveData.tencent != null) {
                            break;
                        }
                        faceidLiveData.tencent = TencentResult.new_();
                        return faceidLiveData;
                    }
                    faceidLiveData.tencent = (TencentResult) nc5Var.m162488l(TencentResult.PROTOBUF_ADAPTER);
                }
            }
            return faceidLiveData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FaceidLiveData faceidLiveData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = faceidLiveData.token;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = faceidLiveData.data;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            ALiYunResult aLiYunResult = faceidLiveData.aliyun;
            if (aLiYunResult != null) {
                codedOutputByteBufferNano.m17309K(3, aLiYunResult, ALiYunResult.PROTOBUF_ADAPTER);
            }
            TencentResult tencentResult = faceidLiveData.tencent;
            if (tencentResult != null) {
                codedOutputByteBufferNano.m17309K(4, tencentResult, TencentResult.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FaceidLiveData> JSON_ADAPTER = new ObjectJsonAdapter<FaceidLiveData>() { // from class: com.p1.mobile.putong.data.FaceidLiveData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FaceidLiveData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FaceidLiveData newInstance() {
            return new FaceidLiveData();
        }

        public boolean parseField(FaceidLiveData faceidLiveData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tencent":
                    faceidLiveData.tencent = TencentResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aliyun":
                    faceidLiveData.aliyun = ALiYunResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    faceidLiveData.data = jsonParser.getValueAsString();
                    return true;
                case "token":
                    faceidLiveData.token = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FaceidLiveData faceidLiveData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tencent":
                case "aliyun":
                case "data":
                case "token":
                    return true;
                default:
                    return super.parseFieldCheck(faceidLiveData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FaceidLiveData faceidLiveData, JsonGenerator jsonGenerator) throws IOException {
            String str = faceidLiveData.token;
            if (str != null) {
                jsonGenerator.writeStringField("token", str);
            }
            String str2 = faceidLiveData.data;
            if (str2 != null) {
                jsonGenerator.writeStringField("data", str2);
            }
            if (faceidLiveData.aliyun != null) {
                jsonGenerator.writeFieldName("aliyun");
                ALiYunResult.JSON_ADAPTER.serialize(faceidLiveData.aliyun, jsonGenerator, true);
            }
            if (faceidLiveData.tencent != null) {
                jsonGenerator.writeFieldName("tencent");
                TencentResult.JSON_ADAPTER.serialize(faceidLiveData.tencent, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FaceidLiveData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FaceidLiveData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FaceidLiveData new_() {
        FaceidLiveData faceidLiveData = new FaceidLiveData();
        faceidLiveData.nullCheck();
        return faceidLiveData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FaceidLiveData mo225055clone() {
        FaceidLiveData faceidLiveData = new FaceidLiveData();
        faceidLiveData.token = this.token;
        faceidLiveData.data = this.data;
        ALiYunResult aLiYunResult = this.aliyun;
        if (aLiYunResult != null) {
            faceidLiveData.aliyun = aLiYunResult.mo225055clone();
        }
        TencentResult tencentResult = this.tencent;
        if (tencentResult != null) {
            faceidLiveData.tencent = tencentResult.mo225055clone();
        }
        return faceidLiveData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceidLiveData)) {
            return false;
        }
        FaceidLiveData faceidLiveData = (FaceidLiveData) obj;
        return ValueObject.util_equals(this.token, faceidLiveData.token) && ValueObject.util_equals(this.data, faceidLiveData.data) && ValueObject.util_equals(this.aliyun, faceidLiveData.aliyun) && ValueObject.util_equals(this.tencent, faceidLiveData.tencent);
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
        String str = this.token;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.data;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        ALiYunResult aLiYunResult = this.aliyun;
        int iHashCode3 = (iHashCode2 + (aLiYunResult != null ? aLiYunResult.hashCode() : 0)) * 41;
        TencentResult tencentResult = this.tencent;
        int iHashCode4 = iHashCode3 + (tencentResult != null ? tencentResult.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.token == null) {
            this.token = "";
        }
        if (this.data == null) {
            this.data = "";
        }
        if (this.aliyun == null) {
            this.aliyun = ALiYunResult.new_();
        }
        if (this.tencent == null) {
            this.tencent = TencentResult.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
