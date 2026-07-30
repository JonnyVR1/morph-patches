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
public class GameData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gamedata";

    /* JADX INFO: renamed from: la */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String f57la;

    /* JADX INFO: renamed from: lg */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f58lg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roleType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String uid;
    public static ProtobufAdapter<GameData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GameData>() { // from class: com.p1.mobile.putong.core.data.GameData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GameData gameData) {
            String str = gameData.f58lg;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = gameData.f57la;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) gameData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GameData m12915parse(nb5 nb5Var) throws IOException {
            GameData gameData = new GameData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gameData.f58lg == null) {
                        gameData.f58lg = "";
                    }
                    if (gameData.f57la == null) {
                        gameData.f57la = "";
                    }
                    if (gameData.uid == null) {
                        gameData.uid = "";
                    }
                    if (gameData.roleType != null) {
                        break;
                    }
                    gameData.roleType = "";
                    break;
                }
                if (iU == 10) {
                    gameData.f58lg = nb5Var.s();
                } else if (iU == 18) {
                    gameData.f57la = nb5Var.s();
                } else if (iU == 26) {
                    gameData.uid = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (gameData.f58lg == null) {
                            gameData.f58lg = "";
                        }
                        if (gameData.f57la == null) {
                            gameData.f57la = "";
                        }
                        if (gameData.uid == null) {
                            gameData.uid = "";
                        }
                        if (gameData.roleType != null) {
                            break;
                        }
                        gameData.roleType = "";
                        return gameData;
                    }
                    gameData.roleType = nb5Var.s();
                }
            }
            return gameData;
        }

        public void serialize(GameData gameData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gameData.f58lg;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = gameData.f57la;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<GameData> JSON_ADAPTER = new ObjectJsonAdapter<GameData>() { // from class: com.p1.mobile.putong.core.data.GameData.2
        public Class getDataClass() {
            return GameData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GameData m12916newInstance() {
            return new GameData();
        }

        public boolean parseField(GameData gameData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roleType":
                    gameData.roleType = jsonParser.getValueAsString();
                    return true;
                case "la":
                    gameData.f57la = jsonParser.getValueAsString();
                    return true;
                case "lg":
                    gameData.f58lg = jsonParser.getValueAsString();
                    return true;
                case "uid":
                    gameData.uid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GameData gameData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "roleType":
                case "la":
                case "lg":
                case "uid":
                    return true;
                default:
                    return super.parseFieldCheck(gameData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GameData gameData, JsonGenerator jsonGenerator) throws IOException {
            String str = gameData.f58lg;
            if (str != null) {
                jsonGenerator.writeStringField("lg", str);
            }
            String str2 = gameData.f57la;
            if (str2 != null) {
                jsonGenerator.writeStringField("la", str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                jsonGenerator.writeStringField("uid", str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                jsonGenerator.writeStringField("roleType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GameData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GameData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GameData new_() {
        GameData gameData = new GameData();
        gameData.nullCheck();
        return gameData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GameData m12914clone() {
        GameData gameData = new GameData();
        gameData.f58lg = this.f58lg;
        gameData.f57la = this.f57la;
        gameData.uid = this.uid;
        gameData.roleType = this.roleType;
        return gameData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameData)) {
            return false;
        }
        GameData gameData = (GameData) obj;
        return ValueObject.util_equals(this.f58lg, gameData.f58lg) && ValueObject.util_equals(this.f57la, gameData.f57la) && ValueObject.util_equals(this.uid, gameData.uid) && ValueObject.util_equals(this.roleType, gameData.roleType);
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
        String str = this.f58lg;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f57la;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.uid;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roleType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f58lg == null) {
            this.f58lg = "";
        }
        if (this.f57la == null) {
            this.f57la = "";
        }
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.roleType == null) {
            this.roleType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
