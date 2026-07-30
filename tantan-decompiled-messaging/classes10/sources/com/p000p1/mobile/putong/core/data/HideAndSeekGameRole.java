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
public class HideAndSeekGameRole extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekgamerole";

    @ProtobufIndex(index = 4)
    public int allCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public GameStage gameStage;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int mouseCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public GameRole roleType;
    public static ProtobufAdapter<HideAndSeekGameRole> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekGameRole>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameRole.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekGameRole hideAndSeekGameRole) {
            GameRole gameRole = hideAndSeekGameRole.roleType;
            int iL = (gameRole != null ? CodedOutputByteBufferNano.l(1, gameRole, GameRole.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.j(2, hideAndSeekGameRole.endTime) + CodedOutputByteBufferNano.h(3, hideAndSeekGameRole.mouseCount) + CodedOutputByteBufferNano.h(4, hideAndSeekGameRole.allCount);
            GameStage gameStage = hideAndSeekGameRole.gameStage;
            if (gameStage != null) {
                iL += CodedOutputByteBufferNano.l(5, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            ((MessageNano) hideAndSeekGameRole).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekGameRole m13267parse(nb5 nb5Var) throws IOException {
            HideAndSeekGameRole hideAndSeekGameRole = new HideAndSeekGameRole();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekGameRole.roleType == null) {
                        hideAndSeekGameRole.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
                    }
                    if (hideAndSeekGameRole.gameStage != null) {
                        break;
                    }
                    hideAndSeekGameRole.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    hideAndSeekGameRole.roleType = (GameRole) nb5Var.l(GameRole.PROTOBUF_ADAPTER);
                } else if (iU == 16) {
                    hideAndSeekGameRole.endTime = nb5Var.k();
                } else if (iU == 24) {
                    hideAndSeekGameRole.mouseCount = nb5Var.j();
                } else if (iU == 32) {
                    hideAndSeekGameRole.allCount = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (hideAndSeekGameRole.roleType == null) {
                            hideAndSeekGameRole.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
                        }
                        if (hideAndSeekGameRole.gameStage != null) {
                            break;
                        }
                        hideAndSeekGameRole.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                        return hideAndSeekGameRole;
                    }
                    hideAndSeekGameRole.gameStage = (GameStage) nb5Var.l(GameStage.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekGameRole;
        }

        public void serialize(HideAndSeekGameRole hideAndSeekGameRole, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GameRole gameRole = hideAndSeekGameRole.roleType;
            if (gameRole != null) {
                codedOutputByteBufferNano.K(1, gameRole, GameRole.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(2, hideAndSeekGameRole.endTime);
            codedOutputByteBufferNano.G(3, hideAndSeekGameRole.mouseCount);
            codedOutputByteBufferNano.G(4, hideAndSeekGameRole.allCount);
            GameStage gameStage = hideAndSeekGameRole.gameStage;
            if (gameStage != null) {
                codedOutputByteBufferNano.K(5, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekGameRole> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekGameRole>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameRole.2
        public Class getDataClass() {
            return HideAndSeekGameRole.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekGameRole m13268newInstance() {
            return new HideAndSeekGameRole();
        }

        public boolean parseField(HideAndSeekGameRole hideAndSeekGameRole, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    hideAndSeekGameRole.endTime = jsonParser.getValueAsLong();
                    return true;
                case "roleType":
                    hideAndSeekGameRole.roleType = (GameRole) GameRole.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "mouseCount":
                    hideAndSeekGameRole.mouseCount = jsonParser.getValueAsInt();
                    return true;
                case "gameStage":
                    hideAndSeekGameRole.gameStage = (GameStage) GameStage.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekGameRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekGameRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekGameRole new_() {
        HideAndSeekGameRole hideAndSeekGameRole = new HideAndSeekGameRole();
        hideAndSeekGameRole.nullCheck();
        return hideAndSeekGameRole;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekGameRole m13266clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.roleType == null) {
            this.roleType = (GameRole) GameRole.JSON_ADAPTER.defaultEnum();
        }
        if (this.gameStage == null) {
            this.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
