package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class SpotLightLiveInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightliveinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f21243id;

    @ProtobufIndex(index = 2)
    public int liveType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mainTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roomId;

    @ProtobufIndex(index = 3)
    public int state;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subTitle;
    public static ProtobufAdapter<SpotLightLiveInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightLiveInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightLiveInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightLiveInfo spotLightLiveInfo) {
            String str = spotLightLiveInfo.anchorId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, spotLightLiveInfo.liveType) + CodedOutputByteBufferNano.m17281h(3, spotLightLiveInfo.state);
            String str2 = spotLightLiveInfo.mainTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = spotLightLiveInfo.subTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = spotLightLiveInfo.roomId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = spotLightLiveInfo.f21243id;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            spotLightLiveInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightLiveInfo parse(nc5 nc5Var) throws IOException {
            SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (spotLightLiveInfo.roomId == null) {
                        spotLightLiveInfo.roomId = "";
                    }
                    if (spotLightLiveInfo.f21243id == null) {
                        spotLightLiveInfo.f21243id = "";
                    }
                    if (spotLightLiveInfo.anchorId == null) {
                        spotLightLiveInfo.anchorId = "";
                    }
                    if (spotLightLiveInfo.mainTitle == null) {
                        spotLightLiveInfo.mainTitle = "";
                    }
                    if (spotLightLiveInfo.subTitle != null) {
                        break;
                    }
                    spotLightLiveInfo.subTitle = "";
                    break;
                }
                if (iM162497u == 10) {
                    spotLightLiveInfo.anchorId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    spotLightLiveInfo.liveType = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    spotLightLiveInfo.state = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    spotLightLiveInfo.mainTitle = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    spotLightLiveInfo.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    spotLightLiveInfo.roomId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (spotLightLiveInfo.roomId == null) {
                            spotLightLiveInfo.roomId = "";
                        }
                        if (spotLightLiveInfo.f21243id == null) {
                            spotLightLiveInfo.f21243id = "";
                        }
                        if (spotLightLiveInfo.anchorId == null) {
                            spotLightLiveInfo.anchorId = "";
                        }
                        if (spotLightLiveInfo.mainTitle == null) {
                            spotLightLiveInfo.mainTitle = "";
                        }
                        if (spotLightLiveInfo.subTitle != null) {
                            break;
                        }
                        spotLightLiveInfo.subTitle = "";
                        return spotLightLiveInfo;
                    }
                    spotLightLiveInfo.f21243id = nc5Var.m162495s();
                }
            }
            return spotLightLiveInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightLiveInfo spotLightLiveInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = spotLightLiveInfo.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, spotLightLiveInfo.liveType);
            codedOutputByteBufferNano.m17305G(3, spotLightLiveInfo.state);
            String str2 = spotLightLiveInfo.mainTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = spotLightLiveInfo.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = spotLightLiveInfo.roomId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = spotLightLiveInfo.f21243id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    };
    public static JsonAdapter<SpotLightLiveInfo> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightLiveInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightLiveInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightLiveInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightLiveInfo newInstance() {
            return new SpotLightLiveInfo();
        }

        public boolean parseField(SpotLightLiveInfo spotLightLiveInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    spotLightLiveInfo.subTitle = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    spotLightLiveInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    spotLightLiveInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    spotLightLiveInfo.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "id":
                    spotLightLiveInfo.f21243id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    spotLightLiveInfo.state = jsonParser.getValueAsInt();
                    return true;
                case "liveType":
                    spotLightLiveInfo.liveType = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpotLightLiveInfo spotLightLiveInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "anchorId":
                case "roomId":
                case "mainTitle":
                    return true;
                case "id":
                    return false;
                case "state":
                case "liveType":
                    return true;
                default:
                    return super.parseFieldCheck(spotLightLiveInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightLiveInfo spotLightLiveInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = spotLightLiveInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = spotLightLiveInfo.f21243id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = spotLightLiveInfo.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            jsonGenerator.writeNumberField("liveType", spotLightLiveInfo.liveType);
            jsonGenerator.writeNumberField("state", spotLightLiveInfo.state);
            String str4 = spotLightLiveInfo.mainTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("mainTitle", str4);
            }
            String str5 = spotLightLiveInfo.subTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subTitle", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightLiveInfo new_() {
        SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
        spotLightLiveInfo.nullCheck();
        return spotLightLiveInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightLiveInfo mo225055clone() {
        SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
        spotLightLiveInfo.roomId = this.roomId;
        spotLightLiveInfo.f21243id = this.f21243id;
        spotLightLiveInfo.anchorId = this.anchorId;
        spotLightLiveInfo.liveType = this.liveType;
        spotLightLiveInfo.state = this.state;
        spotLightLiveInfo.mainTitle = this.mainTitle;
        spotLightLiveInfo.subTitle = this.subTitle;
        return spotLightLiveInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightLiveInfo)) {
            return false;
        }
        SpotLightLiveInfo spotLightLiveInfo = (SpotLightLiveInfo) obj;
        return ValueObject.util_equals(this.roomId, spotLightLiveInfo.roomId) && ValueObject.util_equals(this.f21243id, spotLightLiveInfo.f21243id) && ValueObject.util_equals(this.anchorId, spotLightLiveInfo.anchorId) && this.liveType == spotLightLiveInfo.liveType && this.state == spotLightLiveInfo.state && ValueObject.util_equals(this.mainTitle, spotLightLiveInfo.mainTitle) && ValueObject.util_equals(this.subTitle, spotLightLiveInfo.subTitle);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f21243id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.liveType) * 41) + this.state) * 41;
        String str4 = this.mainTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subTitle;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.f21243id == null) {
            this.f21243id = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
