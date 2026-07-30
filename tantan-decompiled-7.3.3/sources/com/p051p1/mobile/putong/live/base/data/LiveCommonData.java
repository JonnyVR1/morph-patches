package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
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
public class LiveCommonData extends BaseData implements Cloneable, Serializable {
    public static JsonAdapter<LiveCommonData> JSON_ADAPTER = new ObjectJsonAdapter<LiveCommonData>() { // from class: com.p1.mobile.putong.live.base.data.LiveCommonData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCommonData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveCommonData newInstance() {
            return new LiveCommonData();
        }

        public boolean parseField(LiveCommonData liveCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profileVoiceRooms":
                    liveCommonData.profileVoiceRooms = JsonAdapter.parseArray(jsonParser, BLiveVoiceRoomInProfile.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "profileLiveRooms":
                    liveCommonData.profileLiveRooms = JsonAdapter.parseArray(jsonParser, BLiveRoomInProfile.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "coins":
                    liveCommonData.coins = BLiveCoin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveSchemas":
                    liveCommonData.liveSchemas = JsonAdapter.parseArray(jsonParser, BLiveSchema.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveCommonData liveCommonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "profileVoiceRooms":
                case "profileLiveRooms":
                case "coins":
                case "liveSchemas":
                    return true;
                default:
                    return super.parseFieldCheck(liveCommonData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCommonData liveCommonData, JsonGenerator jsonGenerator) throws IOException {
            if (liveCommonData.coins != null) {
                jsonGenerator.writeFieldName("coins");
                BLiveCoin.JSON_ADAPTER.serialize(liveCommonData.coins, jsonGenerator, true);
            }
            if (liveCommonData.liveSchemas != null) {
                jsonGenerator.writeFieldName("liveSchemas");
                JsonAdapter.serializeArray(liveCommonData.liveSchemas, jsonGenerator, BLiveSchema.JSON_ADAPTER);
            }
            if (liveCommonData.profileLiveRooms != null) {
                jsonGenerator.writeFieldName("profileLiveRooms");
                JsonAdapter.serializeArray(liveCommonData.profileLiveRooms, jsonGenerator, BLiveRoomInProfile.JSON_ADAPTER);
            }
            if (liveCommonData.profileVoiceRooms != null) {
                jsonGenerator.writeFieldName("profileVoiceRooms");
                JsonAdapter.serializeArray(liveCommonData.profileVoiceRooms, jsonGenerator, BLiveVoiceRoomInProfile.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "livecommondata";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCoin coins;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveSchema> liveSchemas;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveRoomInProfile> profileLiveRooms;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveVoiceRoomInProfile> profileVoiceRooms;

    public static LiveCommonData new_() {
        LiveCommonData liveCommonData = new LiveCommonData();
        liveCommonData.nullCheck();
        return liveCommonData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCommonData mo225055clone() {
        LiveCommonData liveCommonData = new LiveCommonData();
        BLiveCoin bLiveCoin = this.coins;
        if (bLiveCoin != null) {
            liveCommonData.coins = bLiveCoin.mo225055clone();
        }
        List<BLiveSchema> list = this.liveSchemas;
        if (list != null) {
            liveCommonData.liveSchemas = ValueObject.util_map(list, new qcj() { // from class: l.t6s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSchema) obj).mo225055clone();
                }
            });
        }
        List<BLiveRoomInProfile> list2 = this.profileLiveRooms;
        if (list2 != null) {
            liveCommonData.profileLiveRooms = ValueObject.util_map(list2, new qcj() { // from class: l.u6s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRoomInProfile) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceRoomInProfile> list3 = this.profileVoiceRooms;
        if (list3 != null) {
            liveCommonData.profileVoiceRooms = ValueObject.util_map(list3, new qcj() { // from class: l.v6s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceRoomInProfile) obj).mo225055clone();
                }
            });
        }
        return liveCommonData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCommonData)) {
            return false;
        }
        LiveCommonData liveCommonData = (LiveCommonData) obj;
        return this == obj && ValueObject.util_equals(this.coins, liveCommonData.coins) && ValueObject.util_equals(this.liveSchemas, liveCommonData.liveSchemas) && ValueObject.util_equals(this.profileLiveRooms, liveCommonData.profileLiveRooms) && ValueObject.util_equals(this.profileVoiceRooms, liveCommonData.profileVoiceRooms);
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
        int iHashCode = super.hashCode() * 41;
        BLiveCoin bLiveCoin = this.coins;
        int iHashCode2 = (iHashCode + (bLiveCoin != null ? bLiveCoin.hashCode() : 0)) * 41;
        List<BLiveSchema> list = this.liveSchemas;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveRoomInProfile> list2 = this.profileLiveRooms;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveVoiceRoomInProfile> list3 = this.profileVoiceRooms;
        int iHashCode5 = iHashCode4 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.coins == null) {
            this.coins = BLiveCoin.new_();
        }
        if (this.profileLiveRooms == null) {
            this.profileLiveRooms = new ArrayList();
        }
        if (this.profileVoiceRooms == null) {
            this.profileVoiceRooms = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
