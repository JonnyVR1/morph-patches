package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSnapShot;
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
public class BLiveVoiceCallInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCallInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCallInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCallInfo newInstance() {
            return new BLiveVoiceCallInfo();
        }

        public boolean parseField(BLiveVoiceCallInfo bLiveVoiceCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("onVoiceCalls")) {
                return false;
            }
            bLiveVoiceCallInfo.onVoiceCalls = JsonAdapter.parseArray(jsonParser, BLiveVoiceCallSnapShot.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCallInfo bLiveVoiceCallInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceCallInfo.onVoiceCalls != null) {
                jsonGenerator.writeFieldName("onVoiceCalls");
                JsonAdapter.serializeArray(bLiveVoiceCallInfo.onVoiceCalls, jsonGenerator, BLiveVoiceCallSnapShot.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceCallSnapShot> onVoiceCalls;

    public static BLiveVoiceCallInfo new_() {
        BLiveVoiceCallInfo bLiveVoiceCallInfo = new BLiveVoiceCallInfo();
        bLiveVoiceCallInfo.nullCheck();
        return bLiveVoiceCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCallInfo mo225055clone() {
        BLiveVoiceCallInfo bLiveVoiceCallInfo = new BLiveVoiceCallInfo();
        List<BLiveVoiceCallSnapShot> list = this.onVoiceCalls;
        if (list != null) {
            bLiveVoiceCallInfo.onVoiceCalls = ValueObject.util_map(list, new qcj() { // from class: l.l82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCallSnapShot) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceCallInfo) {
            return ValueObject.util_equals(this.onVoiceCalls, ((BLiveVoiceCallInfo) obj).onVoiceCalls);
        }
        return false;
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
        List<BLiveVoiceCallSnapShot> list = this.onVoiceCalls;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.onVoiceCalls == null) {
            this.onVoiceCalls = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
