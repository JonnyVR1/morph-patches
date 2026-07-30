package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
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
public class GameData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gamedata";

    /* JADX INFO: renamed from: la */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f20395la;

    /* JADX INFO: renamed from: lg */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20396lg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roleType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String uid;
    public static ProtobufAdapter<GameData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GameData>() { // from class: com.p1.mobile.putong.core.data.GameData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GameData gameData) {
            String str = gameData.f20396lg;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = gameData.f20395la;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            gameData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GameData parse(nb5 nb5Var) throws IOException {
            GameData gameData = new GameData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gameData.f20396lg == null) {
                        gameData.f20396lg = "";
                    }
                    if (gameData.f20395la == null) {
                        gameData.f20395la = "";
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
                if (iM158752u == 10) {
                    gameData.f20396lg = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    gameData.f20395la = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    gameData.uid = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (gameData.f20396lg == null) {
                            gameData.f20396lg = "";
                        }
                        if (gameData.f20395la == null) {
                            gameData.f20395la = "";
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
                    gameData.roleType = nb5Var.m158750s();
                }
            }
            return gameData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GameData gameData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gameData.f20396lg;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = gameData.f20395la;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<GameData> JSON_ADAPTER = new ObjectJsonAdapter<GameData>() { // from class: com.p1.mobile.putong.core.data.GameData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GameData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GameData newInstance() {
            return new GameData();
        }

        public boolean parseField(GameData gameData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roleType":
                    gameData.roleType = jsonParser.getValueAsString();
                    return true;
                case "la":
                    gameData.f20395la = jsonParser.getValueAsString();
                    return true;
                case "lg":
                    gameData.f20396lg = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GameData gameData, JsonGenerator jsonGenerator) throws IOException {
            String str = gameData.f20396lg;
            if (str != null) {
                jsonGenerator.writeStringField("lg", str);
            }
            String str2 = gameData.f20395la;
            if (str2 != null) {
                jsonGenerator.writeStringField("la", str2);
            }
            String str3 = gameData.uid;
            if (str3 != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str3);
            }
            String str4 = gameData.roleType;
            if (str4 != null) {
                jsonGenerator.writeStringField("roleType", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GameData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GameData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GameData new_() {
        GameData gameData = new GameData();
        gameData.nullCheck();
        return gameData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GameData mo223809clone() {
        GameData gameData = new GameData();
        gameData.f20396lg = this.f20396lg;
        gameData.f20395la = this.f20395la;
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
        return ValueObject.util_equals(this.f20396lg, gameData.f20396lg) && ValueObject.util_equals(this.f20395la, gameData.f20395la) && ValueObject.util_equals(this.uid, gameData.uid) && ValueObject.util_equals(this.roleType, gameData.roleType);
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
        String str = this.f20396lg;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f20395la;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.uid;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roleType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20396lg == null) {
            this.f20396lg = "";
        }
        if (this.f20395la == null) {
            this.f20395la = "";
        }
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.roleType == null) {
            this.roleType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
