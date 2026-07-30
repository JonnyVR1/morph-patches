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
public class ReflectTokenRequestParam extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reflecttokenrequestparam";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String deviceData;

    @NonNull
    @ProtobufIndex(index = 2)
    public String productId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String region;
    public static ProtobufAdapter<ReflectTokenRequestParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReflectTokenRequestParam>() { // from class: com.p1.mobile.putong.data.ReflectTokenRequestParam.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReflectTokenRequestParam reflectTokenRequestParam) {
            String str = reflectTokenRequestParam.appId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = reflectTokenRequestParam.productId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = reflectTokenRequestParam.deviceData;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = reflectTokenRequestParam.region;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) reflectTokenRequestParam).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReflectTokenRequestParam m18887parse(nb5 nb5Var) throws IOException {
            ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reflectTokenRequestParam.appId == null) {
                        reflectTokenRequestParam.appId = "";
                    }
                    if (reflectTokenRequestParam.productId == null) {
                        reflectTokenRequestParam.productId = "";
                    }
                    if (reflectTokenRequestParam.deviceData == null) {
                        reflectTokenRequestParam.deviceData = "";
                    }
                    if (reflectTokenRequestParam.region != null) {
                        break;
                    }
                    reflectTokenRequestParam.region = "";
                    break;
                }
                if (iU == 10) {
                    reflectTokenRequestParam.appId = nb5Var.s();
                } else if (iU == 18) {
                    reflectTokenRequestParam.productId = nb5Var.s();
                } else if (iU == 26) {
                    reflectTokenRequestParam.deviceData = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (reflectTokenRequestParam.appId == null) {
                            reflectTokenRequestParam.appId = "";
                        }
                        if (reflectTokenRequestParam.productId == null) {
                            reflectTokenRequestParam.productId = "";
                        }
                        if (reflectTokenRequestParam.deviceData == null) {
                            reflectTokenRequestParam.deviceData = "";
                        }
                        if (reflectTokenRequestParam.region != null) {
                            break;
                        }
                        reflectTokenRequestParam.region = "";
                        return reflectTokenRequestParam;
                    }
                    reflectTokenRequestParam.region = nb5Var.s();
                }
            }
            return reflectTokenRequestParam;
        }

        public void serialize(ReflectTokenRequestParam reflectTokenRequestParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reflectTokenRequestParam.appId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = reflectTokenRequestParam.productId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = reflectTokenRequestParam.deviceData;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = reflectTokenRequestParam.region;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ReflectTokenRequestParam> JSON_ADAPTER = new ObjectJsonAdapter<ReflectTokenRequestParam>() { // from class: com.p1.mobile.putong.data.ReflectTokenRequestParam.2
        public Class getDataClass() {
            return ReflectTokenRequestParam.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ReflectTokenRequestParam mo17830newInstance() {
            return new ReflectTokenRequestParam();
        }

        public boolean parseField(ReflectTokenRequestParam reflectTokenRequestParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productId":
                    reflectTokenRequestParam.productId = jsonParser.getValueAsString();
                    return true;
                case "region":
                    reflectTokenRequestParam.region = jsonParser.getValueAsString();
                    return true;
                case "appId":
                    reflectTokenRequestParam.appId = jsonParser.getValueAsString();
                    return true;
                case "deviceData":
                    reflectTokenRequestParam.deviceData = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReflectTokenRequestParam reflectTokenRequestParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "productId":
                case "region":
                case "appId":
                case "deviceData":
                    return true;
                default:
                    return super.parseFieldCheck(reflectTokenRequestParam, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReflectTokenRequestParam reflectTokenRequestParam, JsonGenerator jsonGenerator) throws IOException {
            String str = reflectTokenRequestParam.appId;
            if (str != null) {
                jsonGenerator.writeStringField("appId", str);
            }
            String str2 = reflectTokenRequestParam.productId;
            if (str2 != null) {
                jsonGenerator.writeStringField("productId", str2);
            }
            String str3 = reflectTokenRequestParam.deviceData;
            if (str3 != null) {
                jsonGenerator.writeStringField("deviceData", str3);
            }
            String str4 = reflectTokenRequestParam.region;
            if (str4 != null) {
                jsonGenerator.writeStringField(Region.TYPE, str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReflectTokenRequestParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReflectTokenRequestParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReflectTokenRequestParam new_() {
        ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
        reflectTokenRequestParam.nullCheck();
        return reflectTokenRequestParam;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReflectTokenRequestParam m18886clone() {
        ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
        reflectTokenRequestParam.appId = this.appId;
        reflectTokenRequestParam.productId = this.productId;
        reflectTokenRequestParam.deviceData = this.deviceData;
        reflectTokenRequestParam.region = this.region;
        return reflectTokenRequestParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReflectTokenRequestParam)) {
            return false;
        }
        ReflectTokenRequestParam reflectTokenRequestParam = (ReflectTokenRequestParam) obj;
        return ValueObject.util_equals(this.appId, reflectTokenRequestParam.appId) && ValueObject.util_equals(this.productId, reflectTokenRequestParam.productId) && ValueObject.util_equals(this.deviceData, reflectTokenRequestParam.deviceData) && ValueObject.util_equals(this.region, reflectTokenRequestParam.region);
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
        String str = this.appId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.deviceData;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.region;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.deviceData == null) {
            this.deviceData = "";
        }
        if (this.region == null) {
            this.region = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
