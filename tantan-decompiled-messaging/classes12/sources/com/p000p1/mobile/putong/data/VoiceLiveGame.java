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
public class VoiceLiveGame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivegame";

    @NonNull
    @ProtobufIndex(index = 4)
    public String categoryId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String categoryName;

    @NonNull
    @ProtobufIndex(index = 9)
    public String createdTime;

    @NonNull
    @ProtobufIndex(index = 11)
    public VoiceLiveGameCurrentChoice currentChoice;

    @NonNull
    @ProtobufIndex(index = 10)
    public String endTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f297id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String state;

    @NonNull
    @ProtobufIndex(index = 6)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String templateTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String voiceLiveId;
    public static ProtobufAdapter<VoiceLiveGame> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveGame>() { // from class: com.p1.mobile.putong.data.VoiceLiveGame.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLiveGame voiceLiveGame) {
            String str = voiceLiveGame.f297id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voiceLiveGame.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = voiceLiveGame.state;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = voiceLiveGame.categoryId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = voiceLiveGame.categoryName;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = voiceLiveGame.templateId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = voiceLiveGame.templateTitle;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = voiceLiveGame.voiceLiveId;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = voiceLiveGame.createdTime;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            String str10 = voiceLiveGame.endTime;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(10, str10);
            }
            VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = voiceLiveGame.currentChoice;
            if (voiceLiveGameCurrentChoice != null) {
                iO += CodedOutputByteBufferNano.l(11, voiceLiveGameCurrentChoice, VoiceLiveGameCurrentChoice.PROTOBUF_ADAPTER);
            }
            ((MessageNano) voiceLiveGame).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLiveGame m19350parse(nb5 nb5Var) throws IOException {
            VoiceLiveGame voiceLiveGame = new VoiceLiveGame();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (voiceLiveGame.f297id == null) {
                            voiceLiveGame.f297id = "";
                        }
                        if (voiceLiveGame.type == null) {
                            voiceLiveGame.type = "";
                        }
                        if (voiceLiveGame.state == null) {
                            voiceLiveGame.state = "";
                        }
                        if (voiceLiveGame.categoryId == null) {
                            voiceLiveGame.categoryId = "";
                        }
                        if (voiceLiveGame.categoryName == null) {
                            voiceLiveGame.categoryName = "";
                        }
                        if (voiceLiveGame.templateId == null) {
                            voiceLiveGame.templateId = "";
                        }
                        if (voiceLiveGame.templateTitle == null) {
                            voiceLiveGame.templateTitle = "";
                        }
                        if (voiceLiveGame.voiceLiveId == null) {
                            voiceLiveGame.voiceLiveId = "";
                        }
                        if (voiceLiveGame.createdTime == null) {
                            voiceLiveGame.createdTime = "";
                        }
                        if (voiceLiveGame.endTime == null) {
                            voiceLiveGame.endTime = "";
                        }
                        if (voiceLiveGame.currentChoice == null) {
                            voiceLiveGame.currentChoice = VoiceLiveGameCurrentChoice.new_();
                        }
                        break;
                    case 10:
                        voiceLiveGame.f297id = nb5Var.s();
                        continue;
                    case 18:
                        voiceLiveGame.type = nb5Var.s();
                        continue;
                    case 26:
                        voiceLiveGame.state = nb5Var.s();
                        continue;
                    case 34:
                        voiceLiveGame.categoryId = nb5Var.s();
                        continue;
                    case 42:
                        voiceLiveGame.categoryName = nb5Var.s();
                        continue;
                    case 50:
                        voiceLiveGame.templateId = nb5Var.s();
                        continue;
                    case 58:
                        voiceLiveGame.templateTitle = nb5Var.s();
                        continue;
                    case 66:
                        voiceLiveGame.voiceLiveId = nb5Var.s();
                        continue;
                    case 74:
                        voiceLiveGame.createdTime = nb5Var.s();
                        continue;
                    case 82:
                        voiceLiveGame.endTime = nb5Var.s();
                        continue;
                    case 90:
                        voiceLiveGame.currentChoice = (VoiceLiveGameCurrentChoice) nb5Var.l(VoiceLiveGameCurrentChoice.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (voiceLiveGame.f297id == null) {
                            voiceLiveGame.f297id = "";
                        }
                        if (voiceLiveGame.type == null) {
                            voiceLiveGame.type = "";
                        }
                        if (voiceLiveGame.state == null) {
                            voiceLiveGame.state = "";
                        }
                        if (voiceLiveGame.categoryId == null) {
                            voiceLiveGame.categoryId = "";
                        }
                        if (voiceLiveGame.categoryName == null) {
                            voiceLiveGame.categoryName = "";
                        }
                        if (voiceLiveGame.templateId == null) {
                            voiceLiveGame.templateId = "";
                        }
                        if (voiceLiveGame.templateTitle == null) {
                            voiceLiveGame.templateTitle = "";
                        }
                        if (voiceLiveGame.voiceLiveId == null) {
                            voiceLiveGame.voiceLiveId = "";
                        }
                        if (voiceLiveGame.createdTime == null) {
                            voiceLiveGame.createdTime = "";
                        }
                        if (voiceLiveGame.endTime == null) {
                            voiceLiveGame.endTime = "";
                        }
                        if (voiceLiveGame.currentChoice == null) {
                            voiceLiveGame.currentChoice = VoiceLiveGameCurrentChoice.new_();
                            return voiceLiveGame;
                        }
                        break;
                }
            }
            return voiceLiveGame;
        }

        public void serialize(VoiceLiveGame voiceLiveGame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveGame.f297id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voiceLiveGame.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = voiceLiveGame.state;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = voiceLiveGame.categoryId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = voiceLiveGame.categoryName;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = voiceLiveGame.templateId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = voiceLiveGame.templateTitle;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = voiceLiveGame.voiceLiveId;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = voiceLiveGame.createdTime;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            String str10 = voiceLiveGame.endTime;
            if (str10 != null) {
                codedOutputByteBufferNano.R(10, str10);
            }
            VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = voiceLiveGame.currentChoice;
            if (voiceLiveGameCurrentChoice != null) {
                codedOutputByteBufferNano.K(11, voiceLiveGameCurrentChoice, VoiceLiveGameCurrentChoice.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VoiceLiveGame> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveGame>() { // from class: com.p1.mobile.putong.data.VoiceLiveGame.2
        public Class getDataClass() {
            return VoiceLiveGame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceLiveGame mo17830newInstance() {
            return new VoiceLiveGame();
        }

        public boolean parseField(VoiceLiveGame voiceLiveGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    voiceLiveGame.endTime = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    voiceLiveGame.createdTime = jsonParser.getValueAsString();
                    return true;
                case "voiceLiveId":
                    voiceLiveGame.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "templateTitle":
                    voiceLiveGame.templateTitle = jsonParser.getValueAsString();
                    return true;
                case "id":
                    voiceLiveGame.f297id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    voiceLiveGame.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    voiceLiveGame.state = jsonParser.getValueAsString();
                    return true;
                case "categoryName":
                    voiceLiveGame.categoryName = jsonParser.getValueAsString();
                    return true;
                case "categoryId":
                    voiceLiveGame.categoryId = jsonParser.getValueAsString();
                    return true;
                case "templateId":
                    voiceLiveGame.templateId = jsonParser.getValueAsString();
                    return true;
                case "currentChoice":
                    voiceLiveGame.currentChoice = (VoiceLiveGameCurrentChoice) VoiceLiveGameCurrentChoice.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLiveGame voiceLiveGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "createdTime":
                case "voiceLiveId":
                case "templateTitle":
                    return true;
                case "id":
                    return false;
                case "type":
                case "state":
                case "categoryName":
                case "categoryId":
                case "templateId":
                case "currentChoice":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLiveGame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveGame voiceLiveGame, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveGame.f297id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceLiveGame.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = voiceLiveGame.state;
            if (str3 != null) {
                jsonGenerator.writeStringField(Channel.state, str3);
            }
            String str4 = voiceLiveGame.categoryId;
            if (str4 != null) {
                jsonGenerator.writeStringField("categoryId", str4);
            }
            String str5 = voiceLiveGame.categoryName;
            if (str5 != null) {
                jsonGenerator.writeStringField("categoryName", str5);
            }
            String str6 = voiceLiveGame.templateId;
            if (str6 != null) {
                jsonGenerator.writeStringField("templateId", str6);
            }
            String str7 = voiceLiveGame.templateTitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("templateTitle", str7);
            }
            String str8 = voiceLiveGame.voiceLiveId;
            if (str8 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str8);
            }
            String str9 = voiceLiveGame.createdTime;
            if (str9 != null) {
                jsonGenerator.writeStringField("createdTime", str9);
            }
            String str10 = voiceLiveGame.endTime;
            if (str10 != null) {
                jsonGenerator.writeStringField("endTime", str10);
            }
            if (voiceLiveGame.currentChoice != null) {
                jsonGenerator.writeFieldName("currentChoice");
                VoiceLiveGameCurrentChoice.JSON_ADAPTER.serialize(voiceLiveGame.currentChoice, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveGame new_() {
        VoiceLiveGame voiceLiveGame = new VoiceLiveGame();
        voiceLiveGame.nullCheck();
        return voiceLiveGame;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLiveGame m19349clone() {
        VoiceLiveGame voiceLiveGame = new VoiceLiveGame();
        voiceLiveGame.f297id = this.f297id;
        voiceLiveGame.type = this.type;
        voiceLiveGame.state = this.state;
        voiceLiveGame.categoryId = this.categoryId;
        voiceLiveGame.categoryName = this.categoryName;
        voiceLiveGame.templateId = this.templateId;
        voiceLiveGame.templateTitle = this.templateTitle;
        voiceLiveGame.voiceLiveId = this.voiceLiveId;
        voiceLiveGame.createdTime = this.createdTime;
        voiceLiveGame.endTime = this.endTime;
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = this.currentChoice;
        if (voiceLiveGameCurrentChoice != null) {
            voiceLiveGame.currentChoice = voiceLiveGameCurrentChoice.m19352clone();
        }
        return voiceLiveGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveGame)) {
            return false;
        }
        VoiceLiveGame voiceLiveGame = (VoiceLiveGame) obj;
        return ValueObject.util_equals(this.f297id, voiceLiveGame.f297id) && ValueObject.util_equals(this.type, voiceLiveGame.type) && ValueObject.util_equals(this.state, voiceLiveGame.state) && ValueObject.util_equals(this.categoryId, voiceLiveGame.categoryId) && ValueObject.util_equals(this.categoryName, voiceLiveGame.categoryName) && ValueObject.util_equals(this.templateId, voiceLiveGame.templateId) && ValueObject.util_equals(this.templateTitle, voiceLiveGame.templateTitle) && ValueObject.util_equals(this.voiceLiveId, voiceLiveGame.voiceLiveId) && ValueObject.util_equals(this.createdTime, voiceLiveGame.createdTime) && ValueObject.util_equals(this.endTime, voiceLiveGame.endTime) && ValueObject.util_equals(this.currentChoice, voiceLiveGame.currentChoice);
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
        String str = this.f297id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.categoryId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.categoryName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.templateId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.templateTitle;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.voiceLiveId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.createdTime;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.endTime;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = this.currentChoice;
        int iHashCode11 = iHashCode10 + (voiceLiveGameCurrentChoice != null ? voiceLiveGameCurrentChoice.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public void nullCheck() {
        if (this.f297id == null) {
            this.f297id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.categoryId == null) {
            this.categoryId = "";
        }
        if (this.categoryName == null) {
            this.categoryName = "";
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
        if (this.templateTitle == null) {
            this.templateTitle = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.createdTime == null) {
            this.createdTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.currentChoice == null) {
            this.currentChoice = VoiceLiveGameCurrentChoice.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
