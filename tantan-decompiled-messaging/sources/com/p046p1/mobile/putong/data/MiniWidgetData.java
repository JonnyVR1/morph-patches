package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MiniWidgetData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "miniwidgetdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String backgroundImage;

    @NonNull
    @ProtobufIndex(index = 8)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 2)
    public String leftTopText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String line1textNearAvatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public String line2textNearAvatar;

    @ProtobufIndex(index = 7)
    public int sustainSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public MiniWidgetDataType type;
    public static ProtobufAdapter<MiniWidgetData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MiniWidgetData>() { // from class: com.p1.mobile.putong.data.MiniWidgetData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MiniWidgetData miniWidgetData) {
            MiniWidgetDataType miniWidgetDataType = miniWidgetData.type;
            int iM17230l = miniWidgetDataType != null ? CodedOutputByteBufferNano.m17230l(1, miniWidgetDataType, MiniWidgetDataType.PROTOBUF_ADAPTER) : 0;
            String str = miniWidgetData.leftTopText;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = miniWidgetData.backgroundImage;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = miniWidgetData.avatar;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = miniWidgetData.line1textNearAvatar;
            if (str4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = miniWidgetData.line2textNearAvatar;
            if (str5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(7, miniWidgetData.sustainSeconds);
            String str6 = miniWidgetData.deeplink;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str6);
            }
            miniWidgetData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MiniWidgetData parse(nb5 nb5Var) throws IOException {
            MiniWidgetData miniWidgetData = new MiniWidgetData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (miniWidgetData.type == null) {
                        miniWidgetData.type = (MiniWidgetDataType) MiniWidgetDataType.JSON_ADAPTER.defaultEnum();
                    }
                    if (miniWidgetData.leftTopText == null) {
                        miniWidgetData.leftTopText = "";
                    }
                    if (miniWidgetData.backgroundImage == null) {
                        miniWidgetData.backgroundImage = "";
                    }
                    if (miniWidgetData.avatar == null) {
                        miniWidgetData.avatar = "";
                    }
                    if (miniWidgetData.line1textNearAvatar == null) {
                        miniWidgetData.line1textNearAvatar = "";
                    }
                    if (miniWidgetData.line2textNearAvatar == null) {
                        miniWidgetData.line2textNearAvatar = "";
                    }
                    if (miniWidgetData.deeplink != null) {
                        break;
                    }
                    miniWidgetData.deeplink = "";
                    break;
                }
                if (iM158752u == 10) {
                    miniWidgetData.type = (MiniWidgetDataType) nb5Var.m158743l(MiniWidgetDataType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    miniWidgetData.leftTopText = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    miniWidgetData.backgroundImage = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    miniWidgetData.avatar = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    miniWidgetData.line1textNearAvatar = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    miniWidgetData.line2textNearAvatar = nb5Var.m158750s();
                } else if (iM158752u == 56) {
                    miniWidgetData.sustainSeconds = nb5Var.m158741j();
                } else {
                    if (iM158752u != 66) {
                        if (miniWidgetData.type == null) {
                            miniWidgetData.type = (MiniWidgetDataType) MiniWidgetDataType.JSON_ADAPTER.defaultEnum();
                        }
                        if (miniWidgetData.leftTopText == null) {
                            miniWidgetData.leftTopText = "";
                        }
                        if (miniWidgetData.backgroundImage == null) {
                            miniWidgetData.backgroundImage = "";
                        }
                        if (miniWidgetData.avatar == null) {
                            miniWidgetData.avatar = "";
                        }
                        if (miniWidgetData.line1textNearAvatar == null) {
                            miniWidgetData.line1textNearAvatar = "";
                        }
                        if (miniWidgetData.line2textNearAvatar == null) {
                            miniWidgetData.line2textNearAvatar = "";
                        }
                        if (miniWidgetData.deeplink != null) {
                            break;
                        }
                        miniWidgetData.deeplink = "";
                        return miniWidgetData;
                    }
                    miniWidgetData.deeplink = nb5Var.m158750s();
                }
            }
            return miniWidgetData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MiniWidgetData miniWidgetData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MiniWidgetDataType miniWidgetDataType = miniWidgetData.type;
            if (miniWidgetDataType != null) {
                codedOutputByteBufferNano.m17254K(1, miniWidgetDataType, MiniWidgetDataType.PROTOBUF_ADAPTER);
            }
            String str = miniWidgetData.leftTopText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = miniWidgetData.backgroundImage;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = miniWidgetData.avatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = miniWidgetData.line1textNearAvatar;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = miniWidgetData.line2textNearAvatar;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            codedOutputByteBufferNano.m17250G(7, miniWidgetData.sustainSeconds);
            String str6 = miniWidgetData.deeplink;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(8, str6);
            }
        }
    };
    public static JsonAdapter<MiniWidgetData> JSON_ADAPTER = new ObjectJsonAdapter<MiniWidgetData>() { // from class: com.p1.mobile.putong.data.MiniWidgetData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MiniWidgetData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MiniWidgetData newInstance() {
            return new MiniWidgetData();
        }

        public boolean parseField(MiniWidgetData miniWidgetData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    miniWidgetData.avatar = jsonParser.getValueAsString();
                    return true;
                case "type":
                    miniWidgetData.type = MiniWidgetDataType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "line1textNearAvatar":
                    miniWidgetData.line1textNearAvatar = jsonParser.getValueAsString();
                    return true;
                case "deeplink":
                    miniWidgetData.deeplink = jsonParser.getValueAsString();
                    return true;
                case "sustainSeconds":
                    miniWidgetData.sustainSeconds = jsonParser.getValueAsInt();
                    return true;
                case "backgroundImage":
                    miniWidgetData.backgroundImage = jsonParser.getValueAsString();
                    return true;
                case "line2textNearAvatar":
                    miniWidgetData.line2textNearAvatar = jsonParser.getValueAsString();
                    return true;
                case "leftTopText":
                    miniWidgetData.leftTopText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MiniWidgetData miniWidgetData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "type":
                case "line1textNearAvatar":
                case "deeplink":
                case "sustainSeconds":
                case "backgroundImage":
                case "line2textNearAvatar":
                case "leftTopText":
                    return true;
                default:
                    return super.parseFieldCheck(miniWidgetData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MiniWidgetData miniWidgetData, JsonGenerator jsonGenerator) throws IOException {
            if (miniWidgetData.type != null) {
                jsonGenerator.writeFieldName("type");
                MiniWidgetDataType.JSON_ADAPTER.serialize(miniWidgetData.type, jsonGenerator, true);
            }
            String str = miniWidgetData.leftTopText;
            if (str != null) {
                jsonGenerator.writeStringField("leftTopText", str);
            }
            String str2 = miniWidgetData.backgroundImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundImage", str2);
            }
            String str3 = miniWidgetData.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = miniWidgetData.line1textNearAvatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("line1textNearAvatar", str4);
            }
            String str5 = miniWidgetData.line2textNearAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("line2textNearAvatar", str5);
            }
            jsonGenerator.writeNumberField("sustainSeconds", miniWidgetData.sustainSeconds);
            String str6 = miniWidgetData.deeplink;
            if (str6 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MiniWidgetData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MiniWidgetData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MiniWidgetData new_() {
        MiniWidgetData miniWidgetData = new MiniWidgetData();
        miniWidgetData.nullCheck();
        return miniWidgetData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MiniWidgetData mo223809clone() {
        MiniWidgetData miniWidgetData = new MiniWidgetData();
        miniWidgetData.type = this.type;
        miniWidgetData.leftTopText = this.leftTopText;
        miniWidgetData.backgroundImage = this.backgroundImage;
        miniWidgetData.avatar = this.avatar;
        miniWidgetData.line1textNearAvatar = this.line1textNearAvatar;
        miniWidgetData.line2textNearAvatar = this.line2textNearAvatar;
        miniWidgetData.sustainSeconds = this.sustainSeconds;
        miniWidgetData.deeplink = this.deeplink;
        return miniWidgetData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MiniWidgetData)) {
            return false;
        }
        MiniWidgetData miniWidgetData = (MiniWidgetData) obj;
        return ValueObject.util_equals(this.type, miniWidgetData.type) && ValueObject.util_equals(this.leftTopText, miniWidgetData.leftTopText) && ValueObject.util_equals(this.backgroundImage, miniWidgetData.backgroundImage) && ValueObject.util_equals(this.avatar, miniWidgetData.avatar) && ValueObject.util_equals(this.line1textNearAvatar, miniWidgetData.line1textNearAvatar) && ValueObject.util_equals(this.line2textNearAvatar, miniWidgetData.line2textNearAvatar) && this.sustainSeconds == miniWidgetData.sustainSeconds && ValueObject.util_equals(this.deeplink, miniWidgetData.deeplink);
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
        MiniWidgetDataType miniWidgetDataType = this.type;
        int iHashCode = (i2 + (miniWidgetDataType != null ? miniWidgetDataType.hashCode() : 0)) * 41;
        String str = this.leftTopText;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundImage;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.line1textNearAvatar;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.line2textNearAvatar;
        int iHashCode6 = (((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.sustainSeconds) * 41;
        String str6 = this.deeplink;
        int iHashCode7 = iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (MiniWidgetDataType) MiniWidgetDataType.JSON_ADAPTER.defaultEnum();
        }
        if (this.leftTopText == null) {
            this.leftTopText = "";
        }
        if (this.backgroundImage == null) {
            this.backgroundImage = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.line1textNearAvatar == null) {
            this.line1textNearAvatar = "";
        }
        if (this.line2textNearAvatar == null) {
            this.line2textNearAvatar = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
