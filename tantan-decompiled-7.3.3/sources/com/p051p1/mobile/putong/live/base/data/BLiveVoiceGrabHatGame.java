package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGrabHatGame extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGrabHatGame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGrabHatGame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGrabHatGame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGrabHatGame newInstance() {
            return new BLiveVoiceGrabHatGame();
        }

        public boolean parseField(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveVoiceGrabHatGame.liveId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVoiceGrabHatGame.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceGrabHatGame.f45348id = jsonParser.getValueAsString();
                    return false;
                case "callHatInfo":
                    bLiveVoiceGrabHatGame.callHatInfo = JsonAdapter.parseArray(jsonParser, BLiveVoiceCallHatInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGrabHatGame.f45348id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceGrabHatGame.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = bLiveVoiceGrabHatGame.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            if (bLiveVoiceGrabHatGame.callHatInfo != null) {
                jsonGenerator.writeFieldName("callHatInfo");
                JsonAdapter.serializeArray(bLiveVoiceGrabHatGame.callHatInfo, jsonGenerator, BLiveVoiceCallHatInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGrabHatGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegrabhatgame";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveVoiceCallHatInfo> callHatInfo;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45348id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public String toast;
    public long updateTime;

    public static BLiveVoiceGrabHatGame new_() {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = new BLiveVoiceGrabHatGame();
        bLiveVoiceGrabHatGame.nullCheck();
        return bLiveVoiceGrabHatGame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGrabHatGame mo225055clone() {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = new BLiveVoiceGrabHatGame();
        bLiveVoiceGrabHatGame.f45348id = this.f45348id;
        bLiveVoiceGrabHatGame.status = this.status;
        bLiveVoiceGrabHatGame.liveId = this.liveId;
        List<BLiveVoiceCallHatInfo> list = this.callHatInfo;
        if (list != null) {
            bLiveVoiceGrabHatGame.callHatInfo = ValueObject.util_map(list, new qcj() { // from class: l.e92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCallHatInfo) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceGrabHatGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGrabHatGame)) {
            return false;
        }
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) obj;
        return ValueObject.util_equals(this.f45348id, bLiveVoiceGrabHatGame.f45348id) && ValueObject.util_equals(this.status, bLiveVoiceGrabHatGame.status) && ValueObject.util_equals(this.liveId, bLiveVoiceGrabHatGame.liveId) && ValueObject.util_equals(this.callHatInfo, bLiveVoiceGrabHatGame.callHatInfo);
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
        String str = this.f45348id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveVoiceCallHatInfo> list = this.callHatInfo;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45348id == null) {
            this.f45348id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.callHatInfo == null) {
            this.callHatInfo = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
