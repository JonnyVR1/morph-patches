package com.p046p1.mobile.putong.core.data;

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
public class GameCpConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gamecpconfig";

    @ProtobufIndex(index = 2)
    public boolean defaultTabSwitch;

    @ProtobufIndex(index = 3)
    public boolean dialogEnable;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<GameCpConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GameCpConfig>() { // from class: com.p1.mobile.putong.core.data.GameCpConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GameCpConfig gameCpConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, gameCpConfig.enable) + CodedOutputByteBufferNano.m17220b(2, gameCpConfig.defaultTabSwitch) + CodedOutputByteBufferNano.m17220b(3, gameCpConfig.dialogEnable);
            gameCpConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GameCpConfig parse(nb5 nb5Var) throws IOException {
            GameCpConfig gameCpConfig = new GameCpConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    gameCpConfig.enable = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    gameCpConfig.defaultTabSwitch = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return gameCpConfig;
                    }
                    gameCpConfig.dialogEnable = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GameCpConfig gameCpConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, gameCpConfig.enable);
            codedOutputByteBufferNano.m17244A(2, gameCpConfig.defaultTabSwitch);
            codedOutputByteBufferNano.m17244A(3, gameCpConfig.dialogEnable);
        }
    };
    public static JsonAdapter<GameCpConfig> JSON_ADAPTER = new ObjectJsonAdapter<GameCpConfig>() { // from class: com.p1.mobile.putong.core.data.GameCpConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GameCpConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GameCpConfig newInstance() {
            return new GameCpConfig();
        }

        public boolean parseField(GameCpConfig gameCpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    gameCpConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "defaultTabSwitch":
                    gameCpConfig.defaultTabSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "dialogEnable":
                    gameCpConfig.dialogEnable = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GameCpConfig gameCpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "defaultTabSwitch":
                case "dialogEnable":
                    return true;
                default:
                    return super.parseFieldCheck(gameCpConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GameCpConfig gameCpConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", gameCpConfig.enable);
            jsonGenerator.writeBooleanField("defaultTabSwitch", gameCpConfig.defaultTabSwitch);
            jsonGenerator.writeBooleanField("dialogEnable", gameCpConfig.dialogEnable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GameCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GameCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GameCpConfig new_() {
        GameCpConfig gameCpConfig = new GameCpConfig();
        gameCpConfig.nullCheck();
        return gameCpConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GameCpConfig mo223809clone() {
        GameCpConfig gameCpConfig = new GameCpConfig();
        gameCpConfig.enable = this.enable;
        gameCpConfig.defaultTabSwitch = this.defaultTabSwitch;
        gameCpConfig.dialogEnable = this.dialogEnable;
        return gameCpConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameCpConfig)) {
            return false;
        }
        GameCpConfig gameCpConfig = (GameCpConfig) obj;
        return this.enable == gameCpConfig.enable && this.defaultTabSwitch == gameCpConfig.defaultTabSwitch && this.dialogEnable == gameCpConfig.dialogEnable;
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
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.defaultTabSwitch ? 1231 : 1237)) * 41) + (this.dialogEnable ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
