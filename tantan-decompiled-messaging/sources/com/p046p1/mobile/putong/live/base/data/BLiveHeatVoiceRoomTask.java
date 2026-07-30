package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveHeatVoiceRoomTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHeatVoiceRoomTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHeatVoiceRoomTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHeatVoiceRoomTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHeatVoiceRoomTask newInstance() {
            return new BLiveHeatVoiceRoomTask();
        }

        public boolean parseField(BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonToast":
                    bLiveHeatVoiceRoomTask.buttonToast = jsonParser.getValueAsString();
                    return true;
                case "description":
                    bLiveHeatVoiceRoomTask.description = jsonParser.getValueAsString();
                    return true;
                case "taskExt":
                    bLiveHeatVoiceRoomTask.taskExt = BLiveHeatVoiceRoomTaskExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bLiveHeatVoiceRoomTask.status = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveHeatVoiceRoomTask.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveHeatVoiceRoomTask.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveHeatVoiceRoomTask.type = BLiveHeatVoiceRoomTaskType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "buttonTip":
                    bLiveHeatVoiceRoomTask.buttonTip = jsonParser.getValueAsString();
                    return true;
                case "buttonName":
                    bLiveHeatVoiceRoomTask.buttonName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveHeatVoiceRoomTask.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveHeatVoiceRoomTaskType.JSON_ADAPTER.serialize(bLiveHeatVoiceRoomTask.type, jsonGenerator, true);
            }
            String str = bLiveHeatVoiceRoomTask.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveHeatVoiceRoomTask.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveHeatVoiceRoomTask.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = bLiveHeatVoiceRoomTask.buttonName;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonName", str4);
            }
            String str5 = bLiveHeatVoiceRoomTask.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
            String str6 = bLiveHeatVoiceRoomTask.buttonTip;
            if (str6 != null) {
                jsonGenerator.writeStringField("buttonTip", str6);
            }
            String str7 = bLiveHeatVoiceRoomTask.buttonToast;
            if (str7 != null) {
                jsonGenerator.writeStringField("buttonToast", str7);
            }
            if (bLiveHeatVoiceRoomTask.taskExt != null) {
                jsonGenerator.writeFieldName("taskExt");
                BLiveHeatVoiceRoomTaskExt.JSON_ADAPTER.serialize(bLiveHeatVoiceRoomTask.taskExt, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHeatVoiceRoomTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveheatvoiceroomtask";

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonName;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonTip;

    @NonNull
    @ProtobufIndex(index = 8)
    public String buttonToast;

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveHeatVoiceRoomTaskExt taskExt;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveHeatVoiceRoomTaskType type;

    public static BLiveHeatVoiceRoomTask new_() {
        BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask = new BLiveHeatVoiceRoomTask();
        bLiveHeatVoiceRoomTask.nullCheck();
        return bLiveHeatVoiceRoomTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHeatVoiceRoomTask mo223809clone() {
        BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask = new BLiveHeatVoiceRoomTask();
        bLiveHeatVoiceRoomTask.type = this.type;
        bLiveHeatVoiceRoomTask.icon = this.icon;
        bLiveHeatVoiceRoomTask.name = this.name;
        bLiveHeatVoiceRoomTask.description = this.description;
        bLiveHeatVoiceRoomTask.buttonName = this.buttonName;
        bLiveHeatVoiceRoomTask.status = this.status;
        bLiveHeatVoiceRoomTask.buttonTip = this.buttonTip;
        bLiveHeatVoiceRoomTask.buttonToast = this.buttonToast;
        BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt = this.taskExt;
        if (bLiveHeatVoiceRoomTaskExt != null) {
            bLiveHeatVoiceRoomTask.taskExt = bLiveHeatVoiceRoomTaskExt.mo223809clone();
        }
        return bLiveHeatVoiceRoomTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHeatVoiceRoomTask)) {
            return false;
        }
        BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask = (BLiveHeatVoiceRoomTask) obj;
        return ValueObject.util_equals(this.type, bLiveHeatVoiceRoomTask.type) && ValueObject.util_equals(this.icon, bLiveHeatVoiceRoomTask.icon) && ValueObject.util_equals(this.name, bLiveHeatVoiceRoomTask.name) && ValueObject.util_equals(this.description, bLiveHeatVoiceRoomTask.description) && ValueObject.util_equals(this.buttonName, bLiveHeatVoiceRoomTask.buttonName) && ValueObject.util_equals(this.status, bLiveHeatVoiceRoomTask.status) && ValueObject.util_equals(this.buttonTip, bLiveHeatVoiceRoomTask.buttonTip) && ValueObject.util_equals(this.buttonToast, bLiveHeatVoiceRoomTask.buttonToast) && ValueObject.util_equals(this.taskExt, bLiveHeatVoiceRoomTask.taskExt);
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
        BLiveHeatVoiceRoomTaskType bLiveHeatVoiceRoomTaskType = this.type;
        int iHashCode = (i2 + (bLiveHeatVoiceRoomTaskType != null ? bLiveHeatVoiceRoomTaskType.hashCode() : 0)) * 41;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buttonTip;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.buttonToast;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt = this.taskExt;
        int iHashCode9 = iHashCode8 + (bLiveHeatVoiceRoomTaskExt != null ? bLiveHeatVoiceRoomTaskExt.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    public boolean isDone() {
        return "done".equals(this.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (BLiveHeatVoiceRoomTaskType) BLiveHeatVoiceRoomTaskType.JSON_ADAPTER.defaultEnum();
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.buttonName == null) {
            this.buttonName = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.buttonTip == null) {
            this.buttonTip = "";
        }
        if (this.buttonToast == null) {
            this.buttonToast = "";
        }
        if (this.taskExt == null) {
            this.taskExt = BLiveHeatVoiceRoomTaskExt.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
