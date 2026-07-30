package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCallInfo;
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
public class BLiveCallInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallInfo newInstance() {
            return new BLiveCallInfo();
        }

        public boolean parseField(BLiveCallInfo bLiveCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("onVoiceCallIds")) {
                return false;
            }
            bLiveCallInfo.onVoiceCallIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallInfo bLiveCallInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveCallInfo.onVoiceCallIds != null) {
                jsonGenerator.writeFieldName("onVoiceCallIds");
                JsonAdapter.serializeArray(bLiveCallInfo.onVoiceCallIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> onVoiceCallIds;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67730a(String str) {
        return str;
    }

    public static BLiveCallInfo new_() {
        BLiveCallInfo bLiveCallInfo = new BLiveCallInfo();
        bLiveCallInfo.nullCheck();
        return bLiveCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallInfo mo223809clone() {
        BLiveCallInfo bLiveCallInfo = new BLiveCallInfo();
        List<String> list = this.onVoiceCallIds;
        if (list != null) {
            bLiveCallInfo.onVoiceCallIds = ValueObject.util_map(list, new w9j() { // from class: l.es1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveCallInfo.m67730a((String) obj);
                }
            });
        }
        return bLiveCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveCallInfo) {
            return ValueObject.util_equals(this.onVoiceCallIds, ((BLiveCallInfo) obj).onVoiceCallIds);
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
        List<String> list = this.onVoiceCallIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.onVoiceCallIds == null) {
            this.onVoiceCallIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
