package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.GameData;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class HideAndSeekPushData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekpushdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public GameStage gameStage;

    @ProtobufIndex(index = 3)
    public int mouseCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GameData> players;
    public static ProtobufAdapter<HideAndSeekPushData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekPushData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekPushData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekPushData hideAndSeekPushData) {
            List<GameData> list = hideAndSeekPushData.players;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, GameData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            GameStage gameStage = hideAndSeekPushData.gameStage;
            if (gameStage != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(3, hideAndSeekPushData.mouseCount);
            hideAndSeekPushData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekPushData parse(nb5 nb5Var) throws IOException {
            HideAndSeekPushData hideAndSeekPushData = new HideAndSeekPushData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (hideAndSeekPushData.players == null) {
                        hideAndSeekPushData.players = new ArrayList();
                    }
                    if (hideAndSeekPushData.gameStage != null) {
                        break;
                    }
                    hideAndSeekPushData.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    hideAndSeekPushData.players = (List) nb5Var.m158743l(GameData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    hideAndSeekPushData.gameStage = (GameStage) nb5Var.m158743l(GameStage.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 24) {
                        if (hideAndSeekPushData.players == null) {
                            hideAndSeekPushData.players = new ArrayList();
                        }
                        if (hideAndSeekPushData.gameStage != null) {
                            break;
                        }
                        hideAndSeekPushData.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                        return hideAndSeekPushData;
                    }
                    hideAndSeekPushData.mouseCount = nb5Var.m158741j();
                }
            }
            return hideAndSeekPushData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekPushData hideAndSeekPushData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GameData> list = hideAndSeekPushData.players;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, GameData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GameStage gameStage = hideAndSeekPushData.gameStage;
            if (gameStage != null) {
                codedOutputByteBufferNano.m17254K(2, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(3, hideAndSeekPushData.mouseCount);
        }
    };
    public static JsonAdapter<HideAndSeekPushData> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekPushData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekPushData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekPushData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekPushData newInstance() {
            return new HideAndSeekPushData();
        }

        public boolean parseField(HideAndSeekPushData hideAndSeekPushData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "players":
                    hideAndSeekPushData.players = JsonAdapter.parseArray(jsonParser, GameData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mouseCount":
                    hideAndSeekPushData.mouseCount = jsonParser.getValueAsInt();
                    return true;
                case "gameStage":
                    hideAndSeekPushData.gameStage = GameStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HideAndSeekPushData hideAndSeekPushData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "players":
                case "mouseCount":
                case "gameStage":
                    return true;
                default:
                    return super.parseFieldCheck(hideAndSeekPushData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekPushData hideAndSeekPushData, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekPushData.players != null) {
                jsonGenerator.writeFieldName("players");
                JsonAdapter.serializeArray(hideAndSeekPushData.players, jsonGenerator, GameData.JSON_ADAPTER);
            }
            if (hideAndSeekPushData.gameStage != null) {
                jsonGenerator.writeFieldName("gameStage");
                GameStage.JSON_ADAPTER.serialize(hideAndSeekPushData.gameStage, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("mouseCount", hideAndSeekPushData.mouseCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekPushData new_() {
        HideAndSeekPushData hideAndSeekPushData = new HideAndSeekPushData();
        hideAndSeekPushData.nullCheck();
        return hideAndSeekPushData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekPushData mo223809clone() {
        HideAndSeekPushData hideAndSeekPushData = new HideAndSeekPushData();
        List<GameData> list = this.players;
        if (list != null) {
            hideAndSeekPushData.players = ValueObject.util_map(list, new w9j() { // from class: l.xzk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GameData) obj).mo223809clone();
                }
            });
        }
        hideAndSeekPushData.gameStage = this.gameStage;
        hideAndSeekPushData.mouseCount = this.mouseCount;
        return hideAndSeekPushData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekPushData)) {
            return false;
        }
        HideAndSeekPushData hideAndSeekPushData = (HideAndSeekPushData) obj;
        return ValueObject.util_equals(this.players, hideAndSeekPushData.players) && ValueObject.util_equals(this.gameStage, hideAndSeekPushData.gameStage) && this.mouseCount == hideAndSeekPushData.mouseCount;
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
        List<GameData> list = this.players;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        GameStage gameStage = this.gameStage;
        int iHashCode2 = ((iHashCode + (gameStage != null ? gameStage.hashCode() : 0)) * 41) + this.mouseCount;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.players == null) {
            this.players = new ArrayList();
        }
        if (this.gameStage == null) {
            this.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
