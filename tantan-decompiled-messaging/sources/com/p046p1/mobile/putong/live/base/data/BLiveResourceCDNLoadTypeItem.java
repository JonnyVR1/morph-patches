package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem;
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
public class BLiveResourceCDNLoadTypeItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveResourceCDNLoadTypeItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveResourceCDNLoadTypeItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveResourceCDNLoadTypeItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveResourceCDNLoadTypeItem newInstance() {
            return new BLiveResourceCDNLoadTypeItem();
        }

        public boolean parseField(BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("voiceRoom")) {
                bLiveResourceCDNLoadTypeItem.voiceRoom = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("liveRoom")) {
                return false;
            }
            bLiveResourceCDNLoadTypeItem.liveRoom = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveResourceCDNLoadTypeItem.liveRoom != null) {
                jsonGenerator.writeFieldName("liveRoom");
                JsonAdapter.serializeArray(bLiveResourceCDNLoadTypeItem.liveRoom, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveResourceCDNLoadTypeItem.voiceRoom != null) {
                jsonGenerator.writeFieldName("voiceRoom");
                JsonAdapter.serializeArray(bLiveResourceCDNLoadTypeItem.voiceRoom, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveResourceCDNLoadTypeItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveresourcecdnloadtypeitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> liveRoom;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> voiceRoom;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68191a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m68192b(String str) {
        return str;
    }

    public static BLiveResourceCDNLoadTypeItem new_() {
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = new BLiveResourceCDNLoadTypeItem();
        bLiveResourceCDNLoadTypeItem.nullCheck();
        return bLiveResourceCDNLoadTypeItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveResourceCDNLoadTypeItem mo223809clone() {
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = new BLiveResourceCDNLoadTypeItem();
        List<String> list = this.liveRoom;
        if (list != null) {
            bLiveResourceCDNLoadTypeItem.liveRoom = ValueObject.util_map(list, new w9j() { // from class: l.v42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveResourceCDNLoadTypeItem.m68192b((String) obj);
                }
            });
        }
        List<String> list2 = this.voiceRoom;
        if (list2 != null) {
            bLiveResourceCDNLoadTypeItem.voiceRoom = ValueObject.util_map(list2, new w9j() { // from class: l.w42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveResourceCDNLoadTypeItem.m68191a((String) obj);
                }
            });
        }
        return bLiveResourceCDNLoadTypeItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveResourceCDNLoadTypeItem)) {
            return false;
        }
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = (BLiveResourceCDNLoadTypeItem) obj;
        return ValueObject.util_equals(this.liveRoom, bLiveResourceCDNLoadTypeItem.liveRoom) && ValueObject.util_equals(this.voiceRoom, bLiveResourceCDNLoadTypeItem.voiceRoom);
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
        List<String> list = this.liveRoom;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.voiceRoom;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveRoom == null) {
            this.liveRoom = new ArrayList();
        }
        if (this.voiceRoom == null) {
            this.voiceRoom = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
