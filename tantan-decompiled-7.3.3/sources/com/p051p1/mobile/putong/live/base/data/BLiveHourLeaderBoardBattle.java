package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveHourLeaderBoardBattle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHourLeaderBoardBattle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHourLeaderBoardBattle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHourLeaderBoardBattle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHourLeaderBoardBattle newInstance() {
            return new BLiveHourLeaderBoardBattle();
        }

        public boolean parseField(BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "missions":
                    bLiveHourLeaderBoardBattle.missions = JsonAdapter.parseArray(jsonParser, BLiveHourLeaderBoardBattleGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isOpen":
                    bLiveHourLeaderBoardBattle.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "desc":
                    bLiveHourLeaderBoardBattle.desc = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveHourLeaderBoardBattle.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveHourLeaderBoardBattle.isOpen);
            String str = bLiveHourLeaderBoardBattle.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveHourLeaderBoardBattle.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            if (bLiveHourLeaderBoardBattle.missions != null) {
                jsonGenerator.writeFieldName("missions");
                JsonAdapter.serializeArray(bLiveHourLeaderBoardBattle.missions, jsonGenerator, BLiveHourLeaderBoardBattleGiftItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHourLeaderBoardBattle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehourleaderboardbattle";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveHourLeaderBoardBattleGiftItem> missions;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveHourLeaderBoardBattle new_() {
        BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle = new BLiveHourLeaderBoardBattle();
        bLiveHourLeaderBoardBattle.nullCheck();
        return bLiveHourLeaderBoardBattle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHourLeaderBoardBattle mo225055clone() {
        BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle = new BLiveHourLeaderBoardBattle();
        bLiveHourLeaderBoardBattle.isOpen = this.isOpen;
        bLiveHourLeaderBoardBattle.title = this.title;
        bLiveHourLeaderBoardBattle.desc = this.desc;
        List<BLiveHourLeaderBoardBattleGiftItem> list = this.missions;
        if (list != null) {
            bLiveHourLeaderBoardBattle.missions = ValueObject.util_map(list, new qcj() { // from class: l.r12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveHourLeaderBoardBattleGiftItem) obj).mo225055clone();
                }
            });
        }
        return bLiveHourLeaderBoardBattle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHourLeaderBoardBattle)) {
            return false;
        }
        BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle = (BLiveHourLeaderBoardBattle) obj;
        return this.isOpen == bLiveHourLeaderBoardBattle.isOpen && ValueObject.util_equals(this.title, bLiveHourLeaderBoardBattle.title) && ValueObject.util_equals(this.desc, bLiveHourLeaderBoardBattle.desc) && ValueObject.util_equals(this.missions, bLiveHourLeaderBoardBattle.missions);
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
        int i2 = ((i * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveHourLeaderBoardBattleGiftItem> list = this.missions;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.missions == null) {
            this.missions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
