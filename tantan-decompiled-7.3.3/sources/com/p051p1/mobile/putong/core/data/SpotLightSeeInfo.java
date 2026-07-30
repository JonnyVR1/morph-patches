package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes10.dex */
public class SpotLightSeeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightseeinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21244id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picture;
    public static ProtobufAdapter<SpotLightSeeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightSeeInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightSeeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightSeeInfo spotLightSeeInfo) {
            String str = spotLightSeeInfo.f21244id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            spotLightSeeInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightSeeInfo parse(nc5 nc5Var) throws IOException {
            SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (spotLightSeeInfo.f21244id == null) {
                        spotLightSeeInfo.f21244id = "";
                    }
                    if (spotLightSeeInfo.name == null) {
                        spotLightSeeInfo.name = "";
                    }
                    if (spotLightSeeInfo.picture != null) {
                        break;
                    }
                    spotLightSeeInfo.picture = "";
                    break;
                }
                if (iM162497u == 10) {
                    spotLightSeeInfo.f21244id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    spotLightSeeInfo.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (spotLightSeeInfo.f21244id == null) {
                            spotLightSeeInfo.f21244id = "";
                        }
                        if (spotLightSeeInfo.name == null) {
                            spotLightSeeInfo.name = "";
                        }
                        if (spotLightSeeInfo.picture != null) {
                            break;
                        }
                        spotLightSeeInfo.picture = "";
                        return spotLightSeeInfo;
                    }
                    spotLightSeeInfo.picture = nc5Var.m162495s();
                }
            }
            return spotLightSeeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightSeeInfo spotLightSeeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = spotLightSeeInfo.f21244id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<SpotLightSeeInfo> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightSeeInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightSeeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightSeeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightSeeInfo newInstance() {
            return new SpotLightSeeInfo();
        }

        public boolean parseField(SpotLightSeeInfo spotLightSeeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picture":
                    spotLightSeeInfo.picture = jsonParser.getValueAsString();
                    return true;
                case "id":
                    spotLightSeeInfo.f21244id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    spotLightSeeInfo.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpotLightSeeInfo spotLightSeeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picture":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(spotLightSeeInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightSeeInfo spotLightSeeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = spotLightSeeInfo.f21244id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                jsonGenerator.writeStringField("picture", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightSeeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightSeeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightSeeInfo new_() {
        SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
        spotLightSeeInfo.nullCheck();
        return spotLightSeeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightSeeInfo mo225055clone() {
        SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
        spotLightSeeInfo.f21244id = this.f21244id;
        spotLightSeeInfo.name = this.name;
        spotLightSeeInfo.picture = this.picture;
        return spotLightSeeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightSeeInfo)) {
            return false;
        }
        SpotLightSeeInfo spotLightSeeInfo = (SpotLightSeeInfo) obj;
        return ValueObject.util_equals(this.f21244id, spotLightSeeInfo.f21244id) && ValueObject.util_equals(this.name, spotLightSeeInfo.name) && ValueObject.util_equals(this.picture, spotLightSeeInfo.picture);
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
        String str = this.f21244id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picture;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21244id == null) {
            this.f21244id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
