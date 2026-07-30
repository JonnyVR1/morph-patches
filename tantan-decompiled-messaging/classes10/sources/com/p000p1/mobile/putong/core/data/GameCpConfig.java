package com.p000p1.mobile.putong.core.data;

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
public class GameCpConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gamecpconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean defaultTabSwitch;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean dialogEnable;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<GameCpConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GameCpConfig>() { // from class: com.p1.mobile.putong.core.data.GameCpConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GameCpConfig gameCpConfig) {
            int iB = CodedOutputByteBufferNano.b(1, gameCpConfig.enable) + CodedOutputByteBufferNano.b(2, gameCpConfig.defaultTabSwitch) + CodedOutputByteBufferNano.b(3, gameCpConfig.dialogEnable);
            ((MessageNano) gameCpConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GameCpConfig m12911parse(nb5 nb5Var) throws IOException {
            GameCpConfig gameCpConfig = new GameCpConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    gameCpConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    gameCpConfig.defaultTabSwitch = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return gameCpConfig;
                    }
                    gameCpConfig.dialogEnable = nb5Var.g();
                }
            }
        }

        public void serialize(GameCpConfig gameCpConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, gameCpConfig.enable);
            codedOutputByteBufferNano.A(2, gameCpConfig.defaultTabSwitch);
            codedOutputByteBufferNano.A(3, gameCpConfig.dialogEnable);
        }
    };
    public static JsonAdapter<GameCpConfig> JSON_ADAPTER = new ObjectJsonAdapter<GameCpConfig>() { // from class: com.p1.mobile.putong.core.data.GameCpConfig.2
        public Class getDataClass() {
            return GameCpConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GameCpConfig m12912newInstance() {
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

        public void serializeFields(GameCpConfig gameCpConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", gameCpConfig.enable);
            jsonGenerator.writeBooleanField("defaultTabSwitch", gameCpConfig.defaultTabSwitch);
            jsonGenerator.writeBooleanField("dialogEnable", gameCpConfig.dialogEnable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GameCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GameCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GameCpConfig new_() {
        GameCpConfig gameCpConfig = new GameCpConfig();
        gameCpConfig.nullCheck();
        return gameCpConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GameCpConfig m12910clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.defaultTabSwitch ? 1231 : 1237)) * 41) + (this.dialogEnable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
