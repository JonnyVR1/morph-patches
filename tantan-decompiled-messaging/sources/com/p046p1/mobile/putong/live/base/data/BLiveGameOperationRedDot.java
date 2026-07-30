package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationRedDot;
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
public class BLiveGameOperationRedDot extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGameOperationRedDot> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGameOperationRedDot>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGameOperationRedDot.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGameOperationRedDot.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGameOperationRedDot newInstance() {
            return new BLiveGameOperationRedDot();
        }

        public boolean parseField(BLiveGameOperationRedDot bLiveGameOperationRedDot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            bLiveGameOperationRedDot.data = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGameOperationRedDot bLiveGameOperationRedDot, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGameOperationRedDot.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(bLiveGameOperationRedDot.data, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGameOperationRedDot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegameoperationreddot";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> data;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67966a(String str) {
        return str;
    }

    public static BLiveGameOperationRedDot new_() {
        BLiveGameOperationRedDot bLiveGameOperationRedDot = new BLiveGameOperationRedDot();
        bLiveGameOperationRedDot.nullCheck();
        return bLiveGameOperationRedDot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGameOperationRedDot mo223809clone() {
        BLiveGameOperationRedDot bLiveGameOperationRedDot = new BLiveGameOperationRedDot();
        List<String> list = this.data;
        if (list != null) {
            bLiveGameOperationRedDot.data = ValueObject.util_map(list, new w9j() { // from class: l.c02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveGameOperationRedDot.m67966a((String) obj);
                }
            });
        }
        return bLiveGameOperationRedDot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGameOperationRedDot) {
            return ValueObject.util_equals(this.data, ((BLiveGameOperationRedDot) obj).data);
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
        List<String> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
