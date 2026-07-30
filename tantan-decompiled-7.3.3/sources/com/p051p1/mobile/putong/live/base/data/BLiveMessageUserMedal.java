package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMedal;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMessageUserMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMessageUserMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMessageUserMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMessageUserMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMessageUserMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMessageUserMedal newInstance() {
            return new BLiveMessageUserMedal();
        }

        public boolean parseField(BLiveMessageUserMedal bLiveMessageUserMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "medals":
                    bLiveMessageUserMedal.medals = JsonAdapter.parseArray(jsonParser, BLiveUserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "singleRoomMedals":
                    bLiveMessageUserMedal.singleRoomMedals = JsonAdapter.parseArray(jsonParser, BLiveUserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    bLiveMessageUserMedal.version = jsonParser.getValueAsString();
                    return true;
                case "multiRoomMedals":
                    bLiveMessageUserMedal.multiRoomMedals = JsonAdapter.parseArray(jsonParser, BLiveUserMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMessageUserMedal bLiveMessageUserMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMessageUserMedal.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (bLiveMessageUserMedal.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(bLiveMessageUserMedal.medals, jsonGenerator, BLiveUserMedal.JSON_ADAPTER);
            }
            if (bLiveMessageUserMedal.singleRoomMedals != null) {
                jsonGenerator.writeFieldName("singleRoomMedals");
                JsonAdapter.serializeArray(bLiveMessageUserMedal.singleRoomMedals, jsonGenerator, BLiveUserMedal.JSON_ADAPTER);
            }
            if (bLiveMessageUserMedal.multiRoomMedals != null) {
                jsonGenerator.writeFieldName("multiRoomMedals");
                JsonAdapter.serializeArray(bLiveMessageUserMedal.multiRoomMedals, jsonGenerator, BLiveUserMedal.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMessageUserMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemessageusermedal";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveUserMedal> medals;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveUserMedal> multiRoomMedals;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveUserMedal> singleRoomMedals;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;

    public static BLiveMessageUserMedal new_() {
        BLiveMessageUserMedal bLiveMessageUserMedal = new BLiveMessageUserMedal();
        bLiveMessageUserMedal.nullCheck();
        return bLiveMessageUserMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMessageUserMedal mo225055clone() {
        BLiveMessageUserMedal bLiveMessageUserMedal = new BLiveMessageUserMedal();
        bLiveMessageUserMedal.version = this.version;
        List<BLiveUserMedal> list = this.medals;
        if (list != null) {
            bLiveMessageUserMedal.medals = ValueObject.util_map(list, new qcj() { // from class: l.v22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).mo225055clone();
                }
            });
        }
        List<BLiveUserMedal> list2 = this.singleRoomMedals;
        if (list2 != null) {
            bLiveMessageUserMedal.singleRoomMedals = ValueObject.util_map(list2, new qcj() { // from class: l.w22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).mo225055clone();
                }
            });
        }
        List<BLiveUserMedal> list3 = this.multiRoomMedals;
        if (list3 != null) {
            bLiveMessageUserMedal.multiRoomMedals = ValueObject.util_map(list3, new qcj() { // from class: l.x22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).mo225055clone();
                }
            });
        }
        return bLiveMessageUserMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMessageUserMedal)) {
            return false;
        }
        BLiveMessageUserMedal bLiveMessageUserMedal = (BLiveMessageUserMedal) obj;
        return ValueObject.util_equals(this.version, bLiveMessageUserMedal.version) && ValueObject.util_equals(this.medals, bLiveMessageUserMedal.medals) && ValueObject.util_equals(this.singleRoomMedals, bLiveMessageUserMedal.singleRoomMedals) && ValueObject.util_equals(this.multiRoomMedals, bLiveMessageUserMedal.multiRoomMedals);
    }

    public List<String> getAllId() {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(this.medals)) {
            arrayList.addAll(jyb.m147486Q(this.medals, new qcj() { // from class: l.s22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).f45321id;
                }
            }));
        }
        if (!jyb.m147479J(this.singleRoomMedals)) {
            arrayList.addAll(jyb.m147486Q(this.singleRoomMedals, new qcj() { // from class: l.t22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).f45321id;
                }
            }));
        }
        if (!jyb.m147479J(this.multiRoomMedals)) {
            arrayList.addAll(jyb.m147486Q(this.multiRoomMedals, new qcj() { // from class: l.u22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMedal) obj).f45321id;
                }
            }));
        }
        return arrayList;
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveUserMedal> list = this.medals;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUserMedal> list2 = this.singleRoomMedals;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveUserMedal> list3 = this.multiRoomMedals;
        int iHashCode4 = iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
        if (this.singleRoomMedals == null) {
            this.singleRoomMedals = new ArrayList();
        }
        if (this.multiRoomMedals == null) {
            this.multiRoomMedals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
