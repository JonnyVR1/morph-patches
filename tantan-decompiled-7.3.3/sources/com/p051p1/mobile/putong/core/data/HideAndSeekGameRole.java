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
public class HideAndSeekGameRole extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekgamerole";

    @ProtobufIndex(index = 4)
    public int allCount;

    @ProtobufIndex(index = 2)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public GameStage gameStage;

    @ProtobufIndex(index = 3)
    public int mouseCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public GameRole roleType;
    public static ProtobufAdapter<HideAndSeekGameRole> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekGameRole>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameRole.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekGameRole hideAndSeekGameRole) {
            GameRole gameRole = hideAndSeekGameRole.roleType;
            int iM17285l = (gameRole != null ? CodedOutputByteBufferNano.m17285l(1, gameRole, GameRole.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17283j(2, hideAndSeekGameRole.endTime) + CodedOutputByteBufferNano.m17281h(3, hideAndSeekGameRole.mouseCount) + CodedOutputByteBufferNano.m17281h(4, hideAndSeekGameRole.allCount);
            GameStage gameStage = hideAndSeekGameRole.gameStage;
            if (gameStage != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            hideAndSeekGameRole.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekGameRole parse(nc5 nc5Var) throws IOException {
            HideAndSeekGameRole hideAndSeekGameRole = new HideAndSeekGameRole();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekGameRole.roleType == null) {
                        hideAndSeekGameRole.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
                    }
                    if (hideAndSeekGameRole.gameStage != null) {
                        break;
                    }
                    hideAndSeekGameRole.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    hideAndSeekGameRole.roleType = (GameRole) nc5Var.m162488l(GameRole.PROTOBUF_ADAPTER);
                } else if (iM162497u == 16) {
                    hideAndSeekGameRole.endTime = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    hideAndSeekGameRole.mouseCount = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    hideAndSeekGameRole.allCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (hideAndSeekGameRole.roleType == null) {
                            hideAndSeekGameRole.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
                        }
                        if (hideAndSeekGameRole.gameStage != null) {
                            break;
                        }
                        hideAndSeekGameRole.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                        return hideAndSeekGameRole;
                    }
                    hideAndSeekGameRole.gameStage = (GameStage) nc5Var.m162488l(GameStage.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekGameRole;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekGameRole hideAndSeekGameRole, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GameRole gameRole = hideAndSeekGameRole.roleType;
            if (gameRole != null) {
                codedOutputByteBufferNano.m17309K(1, gameRole, GameRole.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(2, hideAndSeekGameRole.endTime);
            codedOutputByteBufferNano.m17305G(3, hideAndSeekGameRole.mouseCount);
            codedOutputByteBufferNano.m17305G(4, hideAndSeekGameRole.allCount);
            GameStage gameStage = hideAndSeekGameRole.gameStage;
            if (gameStage != null) {
                codedOutputByteBufferNano.m17309K(5, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekGameRole> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekGameRole>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameRole.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekGameRole.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekGameRole newInstance() {
            return new HideAndSeekGameRole();
        }

        public boolean parseField(HideAndSeekGameRole hideAndSeekGameRole, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    hideAndSeekGameRole.endTime = jsonParser.getValueAsLong();
                    return true;
                case "roleType":
                    hideAndSeekGameRole.roleType = GameRole.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "mouseCount":
                    hideAndSeekGameRole.mouseCount = jsonParser.getValueAsInt();
                    return true;
                case "gameStage":
                    hideAndSeekGameRole.gameStage = GameStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "allCount":
                    hideAndSeekGameRole.allCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HideAndSeekGameRole hideAndSeekGameRole, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "roleType":
                case "mouseCount":
                case "gameStage":
                case "allCount":
                    return true;
                default:
                    return super.parseFieldCheck(hideAndSeekGameRole, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekGameRole hideAndSeekGameRole, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekGameRole.roleType != null) {
                jsonGenerator.writeFieldName("roleType");
                GameRole.JSON_ADAPTER.serialize(hideAndSeekGameRole.roleType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("endTime", hideAndSeekGameRole.endTime);
            jsonGenerator.writeNumberField("mouseCount", hideAndSeekGameRole.mouseCount);
            jsonGenerator.writeNumberField("allCount", hideAndSeekGameRole.allCount);
            if (hideAndSeekGameRole.gameStage != null) {
                jsonGenerator.writeFieldName("gameStage");
                GameStage.JSON_ADAPTER.serialize(hideAndSeekGameRole.gameStage, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekGameRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekGameRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekGameRole new_() {
        HideAndSeekGameRole hideAndSeekGameRole = new HideAndSeekGameRole();
        hideAndSeekGameRole.nullCheck();
        return hideAndSeekGameRole;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekGameRole mo225055clone() {
        HideAndSeekGameRole hideAndSeekGameRole = new HideAndSeekGameRole();
        hideAndSeekGameRole.roleType = this.roleType;
        hideAndSeekGameRole.endTime = this.endTime;
        hideAndSeekGameRole.mouseCount = this.mouseCount;
        hideAndSeekGameRole.allCount = this.allCount;
        hideAndSeekGameRole.gameStage = this.gameStage;
        return hideAndSeekGameRole;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekGameRole)) {
            return false;
        }
        HideAndSeekGameRole hideAndSeekGameRole = (HideAndSeekGameRole) obj;
        return ValueObject.util_equals(this.roleType, hideAndSeekGameRole.roleType) && this.endTime == hideAndSeekGameRole.endTime && this.mouseCount == hideAndSeekGameRole.mouseCount && this.allCount == hideAndSeekGameRole.allCount && ValueObject.util_equals(this.gameStage, hideAndSeekGameRole.gameStage);
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
        GameRole gameRole = this.roleType;
        int iHashCode = gameRole != null ? gameRole.hashCode() : 0;
        long j = this.endTime;
        int i3 = (((((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.mouseCount) * 41) + this.allCount) * 41;
        GameStage gameStage = this.gameStage;
        int iHashCode2 = i3 + (gameStage != null ? gameStage.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roleType == null) {
            this.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
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
