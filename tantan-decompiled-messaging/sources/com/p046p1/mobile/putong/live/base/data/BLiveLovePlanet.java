package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveLovePlanet extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLovePlanet> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLovePlanet>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLovePlanet.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLovePlanet.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLovePlanet newInstance() {
            return new BLiveLovePlanet();
        }

        public boolean parseField(BLiveLovePlanet bLiveLovePlanet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "teamInfos":
                    bLiveLovePlanet.teamInfos = JsonAdapter.parseArray(jsonParser, BLiveLovePlanetTeamInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveLovePlanet.f44395id = jsonParser.getValueAsString();
                    return false;
                case "mvp":
                    bLiveLovePlanet.mvp = BLiveLovePlanetPlayerInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "host":
                    bLiveLovePlanet.host = BLiveLovePlanetPlayerInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "stage":
                    bLiveLovePlanet.stage = LovePlanetStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "playerInfos":
                    bLiveLovePlanet.playerInfos = JsonAdapter.parseArray(jsonParser, BLiveLovePlanetPlayerInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "singleUserIds":
                    bLiveLovePlanet.singleUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLovePlanet bLiveLovePlanet, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLovePlanet.f44395id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveLovePlanet.stage != null) {
                jsonGenerator.writeFieldName("stage");
                LovePlanetStage.JSON_ADAPTER.serialize(bLiveLovePlanet.stage, jsonGenerator, true);
            }
            if (bLiveLovePlanet.singleUserIds != null) {
                jsonGenerator.writeFieldName("singleUserIds");
                JsonAdapter.serializeArray(bLiveLovePlanet.singleUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveLovePlanet.playerInfos != null) {
                jsonGenerator.writeFieldName("playerInfos");
                JsonAdapter.serializeArray(bLiveLovePlanet.playerInfos, jsonGenerator, BLiveLovePlanetPlayerInfo.JSON_ADAPTER);
            }
            if (bLiveLovePlanet.teamInfos != null) {
                jsonGenerator.writeFieldName("teamInfos");
                JsonAdapter.serializeArray(bLiveLovePlanet.teamInfos, jsonGenerator, BLiveLovePlanetTeamInfo.JSON_ADAPTER);
            }
            if (bLiveLovePlanet.mvp != null) {
                jsonGenerator.writeFieldName("mvp");
                BLiveLovePlanetPlayerInfo.JSON_ADAPTER.serialize(bLiveLovePlanet.mvp, jsonGenerator, true);
            }
            if (bLiveLovePlanet.host != null) {
                jsonGenerator.writeFieldName("host");
                BLiveLovePlanetPlayerInfo.JSON_ADAPTER.serialize(bLiveLovePlanet.host, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLovePlanet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveloveplanet";

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveLovePlanetPlayerInfo host;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44395id;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveLovePlanetPlayerInfo mvp;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveLovePlanetPlayerInfo> playerInfos;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> singleUserIds;

    @NonNull
    @ProtobufIndex(index = 2)
    public LovePlanetStage stage;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveLovePlanetTeamInfo> teamInfos;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68043a(String str) {
        return str;
    }

    public static BLiveLovePlanet new_() {
        BLiveLovePlanet bLiveLovePlanet = new BLiveLovePlanet();
        bLiveLovePlanet.nullCheck();
        return bLiveLovePlanet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLovePlanet mo223809clone() {
        BLiveLovePlanet bLiveLovePlanet = new BLiveLovePlanet();
        bLiveLovePlanet.f44395id = this.f44395id;
        bLiveLovePlanet.stage = this.stage;
        List<String> list = this.singleUserIds;
        if (list != null) {
            bLiveLovePlanet.singleUserIds = ValueObject.util_map(list, new w9j() { // from class: l.x12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveLovePlanet.m68043a((String) obj);
                }
            });
        }
        List<BLiveLovePlanetPlayerInfo> list2 = this.playerInfos;
        if (list2 != null) {
            bLiveLovePlanet.playerInfos = ValueObject.util_map(list2, new w9j() { // from class: l.y12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveLovePlanetPlayerInfo) obj).mo223809clone();
                }
            });
        }
        List<BLiveLovePlanetTeamInfo> list3 = this.teamInfos;
        if (list3 != null) {
            bLiveLovePlanet.teamInfos = ValueObject.util_map(list3, new w9j() { // from class: l.z12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveLovePlanetTeamInfo) obj).mo223809clone();
                }
            });
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.mvp;
        if (bLiveLovePlanetPlayerInfo != null) {
            bLiveLovePlanet.mvp = bLiveLovePlanetPlayerInfo.mo223809clone();
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = this.host;
        if (bLiveLovePlanetPlayerInfo2 != null) {
            bLiveLovePlanet.host = bLiveLovePlanetPlayerInfo2.mo223809clone();
        }
        return bLiveLovePlanet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLovePlanet)) {
            return false;
        }
        BLiveLovePlanet bLiveLovePlanet = (BLiveLovePlanet) obj;
        return ValueObject.util_equals(this.f44395id, bLiveLovePlanet.f44395id) && ValueObject.util_equals(this.stage, bLiveLovePlanet.stage) && ValueObject.util_equals(this.singleUserIds, bLiveLovePlanet.singleUserIds) && ValueObject.util_equals(this.playerInfos, bLiveLovePlanet.playerInfos) && ValueObject.util_equals(this.teamInfos, bLiveLovePlanet.teamInfos) && ValueObject.util_equals(this.mvp, bLiveLovePlanet.mvp) && ValueObject.util_equals(this.host, bLiveLovePlanet.host);
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
        String str = this.f44395id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        LovePlanetStage lovePlanetStage = this.stage;
        int iHashCode2 = (iHashCode + (lovePlanetStage != null ? lovePlanetStage.hashCode() : 0)) * 41;
        List<String> list = this.singleUserIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveLovePlanetPlayerInfo> list2 = this.playerInfos;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveLovePlanetTeamInfo> list3 = this.teamInfos;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 41;
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.mvp;
        int iHashCode6 = (iHashCode5 + (bLiveLovePlanetPlayerInfo != null ? bLiveLovePlanetPlayerInfo.hashCode() : 0)) * 41;
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = this.host;
        int iHashCode7 = iHashCode6 + (bLiveLovePlanetPlayerInfo2 != null ? bLiveLovePlanetPlayerInfo2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44395id == null) {
            this.f44395id = "";
        }
        if (this.stage == null) {
            this.stage = (LovePlanetStage) LovePlanetStage.JSON_ADAPTER.defaultEnum();
        }
        if (this.singleUserIds == null) {
            this.singleUserIds = new ArrayList();
        }
        if (this.playerInfos == null) {
            this.playerInfos = new ArrayList();
        }
        if (this.teamInfos == null) {
            this.teamInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
