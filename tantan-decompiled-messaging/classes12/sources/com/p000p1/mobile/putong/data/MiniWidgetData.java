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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MiniWidgetData miniWidgetData) {
            MiniWidgetDataType miniWidgetDataType = miniWidgetData.type;
            int iL = miniWidgetDataType != null ? CodedOutputByteBufferNano.l(1, miniWidgetDataType, MiniWidgetDataType.PROTOBUF_ADAPTER) : 0;
            String str = miniWidgetData.leftTopText;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = miniWidgetData.backgroundImage;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = miniWidgetData.avatar;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = miniWidgetData.line1textNearAvatar;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = miniWidgetData.line2textNearAvatar;
            if (str5 != null) {
                iL += CodedOutputByteBufferNano.o(6, str5);
            }
            int iH = iL + CodedOutputByteBufferNano.h(7, miniWidgetData.sustainSeconds);
            String str6 = miniWidgetData.deeplink;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(8, str6);
            }
            ((MessageNano) miniWidgetData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MiniWidgetData m18468parse(nb5 nb5Var) throws IOException {
            MiniWidgetData miniWidgetData = new MiniWidgetData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    miniWidgetData.type = (MiniWidgetDataType) nb5Var.l(MiniWidgetDataType.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    miniWidgetData.leftTopText = nb5Var.s();
                } else if (iU == 26) {
                    miniWidgetData.backgroundImage = nb5Var.s();
                } else if (iU == 34) {
                    miniWidgetData.avatar = nb5Var.s();
                } else if (iU == 42) {
                    miniWidgetData.line1textNearAvatar = nb5Var.s();
                } else if (iU == 50) {
                    miniWidgetData.line2textNearAvatar = nb5Var.s();
                } else if (iU == 56) {
                    miniWidgetData.sustainSeconds = nb5Var.j();
                } else {
                    if (iU != 66) {
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
                    miniWidgetData.deeplink = nb5Var.s();
                }
            }
            return miniWidgetData;
        }

        public void serialize(MiniWidgetData miniWidgetData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MiniWidgetDataType miniWidgetDataType = miniWidgetData.type;
            if (miniWidgetDataType != null) {
                codedOutputByteBufferNano.K(1, miniWidgetDataType, MiniWidgetDataType.PROTOBUF_ADAPTER);
            }
            String str = miniWidgetData.leftTopText;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = miniWidgetData.backgroundImage;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = miniWidgetData.avatar;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = miniWidgetData.line1textNearAvatar;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = miniWidgetData.line2textNearAvatar;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            codedOutputByteBufferNano.G(7, miniWidgetData.sustainSeconds);
            String str6 = miniWidgetData.deeplink;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
        }
    };
    public static JsonAdapter<MiniWidgetData> JSON_ADAPTER = new ObjectJsonAdapter<MiniWidgetData>() { // from class: com.p1.mobile.putong.data.MiniWidgetData.2
        public Class getDataClass() {
            return MiniWidgetData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MiniWidgetData mo17830newInstance() {
            return new MiniWidgetData();
        }

        public boolean parseField(MiniWidgetData miniWidgetData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    miniWidgetData.avatar = jsonParser.getValueAsString();
                    return true;
                case "type":
                    miniWidgetData.type = (MiniWidgetDataType) MiniWidgetDataType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MiniWidgetData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MiniWidgetData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MiniWidgetData new_() {
        MiniWidgetData miniWidgetData = new MiniWidgetData();
        miniWidgetData.nullCheck();
        return miniWidgetData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MiniWidgetData m18467clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
