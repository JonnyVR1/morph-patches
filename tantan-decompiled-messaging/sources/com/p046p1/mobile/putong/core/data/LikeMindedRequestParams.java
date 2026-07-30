package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class LikeMindedRequestParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedrequestparams";

    @NonNull
    @ProtobufIndex(index = 2)
    public String mcc;

    /* JADX INFO: renamed from: me */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20431me;

    @NonNull
    @ProtobufIndex(index = 4)
    public String region;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<LikeMindedRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedRequestParams>() { // from class: com.p1.mobile.putong.core.data.LikeMindedRequestParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedRequestParams likeMindedRequestParams) {
            String str = likeMindedRequestParams.f20431me;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = likeMindedRequestParams.mcc;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = likeMindedRequestParams.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = likeMindedRequestParams.region;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            likeMindedRequestParams.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedRequestParams parse(nb5 nb5Var) throws IOException {
            LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (likeMindedRequestParams.f20431me == null) {
                        likeMindedRequestParams.f20431me = "";
                    }
                    if (likeMindedRequestParams.mcc == null) {
                        likeMindedRequestParams.mcc = "";
                    }
                    if (likeMindedRequestParams.type == null) {
                        likeMindedRequestParams.type = "";
                    }
                    if (likeMindedRequestParams.region != null) {
                        break;
                    }
                    likeMindedRequestParams.region = "";
                    break;
                }
                if (iM158752u == 10) {
                    likeMindedRequestParams.f20431me = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    likeMindedRequestParams.mcc = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    likeMindedRequestParams.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (likeMindedRequestParams.f20431me == null) {
                            likeMindedRequestParams.f20431me = "";
                        }
                        if (likeMindedRequestParams.mcc == null) {
                            likeMindedRequestParams.mcc = "";
                        }
                        if (likeMindedRequestParams.type == null) {
                            likeMindedRequestParams.type = "";
                        }
                        if (likeMindedRequestParams.region != null) {
                            break;
                        }
                        likeMindedRequestParams.region = "";
                        return likeMindedRequestParams;
                    }
                    likeMindedRequestParams.region = nb5Var.m158750s();
                }
            }
            return likeMindedRequestParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedRequestParams likeMindedRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedRequestParams.f20431me;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = likeMindedRequestParams.mcc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = likeMindedRequestParams.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = likeMindedRequestParams.region;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<LikeMindedRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedRequestParams>() { // from class: com.p1.mobile.putong.core.data.LikeMindedRequestParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedRequestParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedRequestParams newInstance() {
            return new LikeMindedRequestParams();
        }

        public boolean parseField(LikeMindedRequestParams likeMindedRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "region":
                    likeMindedRequestParams.region = jsonParser.getValueAsString();
                    return true;
                case "me":
                    likeMindedRequestParams.f20431me = jsonParser.getValueAsString();
                    return true;
                case "mcc":
                    likeMindedRequestParams.mcc = jsonParser.getValueAsString();
                    return true;
                case "type":
                    likeMindedRequestParams.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeMindedRequestParams likeMindedRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "region":
                case "me":
                case "mcc":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(likeMindedRequestParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedRequestParams likeMindedRequestParams, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedRequestParams.f20431me;
            if (str != null) {
                jsonGenerator.writeStringField("me", str);
            }
            String str2 = likeMindedRequestParams.mcc;
            if (str2 != null) {
                jsonGenerator.writeStringField("mcc", str2);
            }
            String str3 = likeMindedRequestParams.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = likeMindedRequestParams.region;
            if (str4 != null) {
                jsonGenerator.writeStringField("region", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedRequestParams new_() {
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.nullCheck();
        return likeMindedRequestParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedRequestParams mo223809clone() {
        LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
        likeMindedRequestParams.f20431me = this.f20431me;
        likeMindedRequestParams.mcc = this.mcc;
        likeMindedRequestParams.type = this.type;
        likeMindedRequestParams.region = this.region;
        return likeMindedRequestParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedRequestParams)) {
            return false;
        }
        LikeMindedRequestParams likeMindedRequestParams = (LikeMindedRequestParams) obj;
        return ValueObject.util_equals(this.f20431me, likeMindedRequestParams.f20431me) && ValueObject.util_equals(this.mcc, likeMindedRequestParams.mcc) && ValueObject.util_equals(this.type, likeMindedRequestParams.type) && ValueObject.util_equals(this.region, likeMindedRequestParams.region);
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
        String str = this.f20431me;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mcc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.region;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20431me == null) {
            this.f20431me = "";
        }
        if (this.mcc == null) {
            this.mcc = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.region == null) {
            this.region = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
