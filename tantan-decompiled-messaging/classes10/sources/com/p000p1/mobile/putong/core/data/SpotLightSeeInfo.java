package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SpotLightSeeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightseeinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f164id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String picture;
    public static ProtobufAdapter<SpotLightSeeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightSeeInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightSeeInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpotLightSeeInfo spotLightSeeInfo) {
            String str = spotLightSeeInfo.f164id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) spotLightSeeInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpotLightSeeInfo m15718parse(nb5 nb5Var) throws IOException {
            SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (spotLightSeeInfo.f164id == null) {
                        spotLightSeeInfo.f164id = "";
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
                if (iU == 10) {
                    spotLightSeeInfo.f164id = nb5Var.s();
                } else if (iU == 18) {
                    spotLightSeeInfo.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (spotLightSeeInfo.f164id == null) {
                            spotLightSeeInfo.f164id = "";
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
                    spotLightSeeInfo.picture = nb5Var.s();
                }
            }
            return spotLightSeeInfo;
        }

        public void serialize(SpotLightSeeInfo spotLightSeeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = spotLightSeeInfo.f164id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SpotLightSeeInfo> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightSeeInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightSeeInfo.2
        public Class getDataClass() {
            return SpotLightSeeInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpotLightSeeInfo m15719newInstance() {
            return new SpotLightSeeInfo();
        }

        public boolean parseField(SpotLightSeeInfo spotLightSeeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picture":
                    spotLightSeeInfo.picture = jsonParser.getValueAsString();
                    return true;
                case "id":
                    spotLightSeeInfo.f164id = jsonParser.getValueAsString();
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

        public void serializeFields(SpotLightSeeInfo spotLightSeeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = spotLightSeeInfo.f164id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = spotLightSeeInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = spotLightSeeInfo.picture;
            if (str3 != null) {
                jsonGenerator.writeStringField("picture", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightSeeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightSeeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightSeeInfo new_() {
        SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
        spotLightSeeInfo.nullCheck();
        return spotLightSeeInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpotLightSeeInfo m15717clone() {
        SpotLightSeeInfo spotLightSeeInfo = new SpotLightSeeInfo();
        spotLightSeeInfo.f164id = this.f164id;
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
        return ValueObject.util_equals(this.f164id, spotLightSeeInfo.f164id) && ValueObject.util_equals(this.name, spotLightSeeInfo.name) && ValueObject.util_equals(this.picture, spotLightSeeInfo.picture);
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
        String str = this.f164id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picture;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f164id == null) {
            this.f164id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
