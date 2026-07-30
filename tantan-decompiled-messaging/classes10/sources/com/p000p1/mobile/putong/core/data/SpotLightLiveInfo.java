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
public class SpotLightLiveInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightliveinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f163id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int liveType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mainTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roomId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int state;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String subTitle;
    public static ProtobufAdapter<SpotLightLiveInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightLiveInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightLiveInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpotLightLiveInfo spotLightLiveInfo) {
            String str = spotLightLiveInfo.anchorId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, spotLightLiveInfo.liveType) + CodedOutputByteBufferNano.h(3, spotLightLiveInfo.state);
            String str2 = spotLightLiveInfo.mainTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = spotLightLiveInfo.subTitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = spotLightLiveInfo.roomId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = spotLightLiveInfo.f163id;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            ((MessageNano) spotLightLiveInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpotLightLiveInfo m15714parse(nb5 nb5Var) throws IOException {
            SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (spotLightLiveInfo.roomId == null) {
                        spotLightLiveInfo.roomId = "";
                    }
                    if (spotLightLiveInfo.f163id == null) {
                        spotLightLiveInfo.f163id = "";
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
                if (iU == 10) {
                    spotLightLiveInfo.anchorId = nb5Var.s();
                } else if (iU == 16) {
                    spotLightLiveInfo.liveType = nb5Var.j();
                } else if (iU == 24) {
                    spotLightLiveInfo.state = nb5Var.j();
                } else if (iU == 34) {
                    spotLightLiveInfo.mainTitle = nb5Var.s();
                } else if (iU == 42) {
                    spotLightLiveInfo.subTitle = nb5Var.s();
                } else if (iU == 50) {
                    spotLightLiveInfo.roomId = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (spotLightLiveInfo.roomId == null) {
                            spotLightLiveInfo.roomId = "";
                        }
                        if (spotLightLiveInfo.f163id == null) {
                            spotLightLiveInfo.f163id = "";
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
                    spotLightLiveInfo.f163id = nb5Var.s();
                }
            }
            return spotLightLiveInfo;
        }

        public void serialize(SpotLightLiveInfo spotLightLiveInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = spotLightLiveInfo.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, spotLightLiveInfo.liveType);
            codedOutputByteBufferNano.G(3, spotLightLiveInfo.state);
            String str2 = spotLightLiveInfo.mainTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = spotLightLiveInfo.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = spotLightLiveInfo.roomId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = spotLightLiveInfo.f163id;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
        }
    };
    public static JsonAdapter<SpotLightLiveInfo> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightLiveInfo>() { // from class: com.p1.mobile.putong.core.data.SpotLightLiveInfo.2
        public Class getDataClass() {
            return SpotLightLiveInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpotLightLiveInfo m15715newInstance() {
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
                    spotLightLiveInfo.f163id = jsonParser.getValueAsString();
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

        public void serializeFields(SpotLightLiveInfo spotLightLiveInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = spotLightLiveInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = spotLightLiveInfo.f163id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = spotLightLiveInfo.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            jsonGenerator.writeNumberField("liveType", spotLightLiveInfo.liveType);
            jsonGenerator.writeNumberField(MessageChannel.state, spotLightLiveInfo.state);
            String str4 = spotLightLiveInfo.mainTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("mainTitle", str4);
            }
            String str5 = spotLightLiveInfo.subTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subTitle", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightLiveInfo new_() {
        SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
        spotLightLiveInfo.nullCheck();
        return spotLightLiveInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpotLightLiveInfo m15713clone() {
        SpotLightLiveInfo spotLightLiveInfo = new SpotLightLiveInfo();
        spotLightLiveInfo.roomId = this.roomId;
        spotLightLiveInfo.f163id = this.f163id;
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
        return ValueObject.util_equals(this.roomId, spotLightLiveInfo.roomId) && ValueObject.util_equals(this.f163id, spotLightLiveInfo.f163id) && ValueObject.util_equals(this.anchorId, spotLightLiveInfo.anchorId) && this.liveType == spotLightLiveInfo.liveType && this.state == spotLightLiveInfo.state && ValueObject.util_equals(this.mainTitle, spotLightLiveInfo.mainTitle) && ValueObject.util_equals(this.subTitle, spotLightLiveInfo.subTitle);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f163id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.liveType) * 41) + this.state) * 41;
        String str4 = this.mainTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subTitle;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.f163id == null) {
            this.f163id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
