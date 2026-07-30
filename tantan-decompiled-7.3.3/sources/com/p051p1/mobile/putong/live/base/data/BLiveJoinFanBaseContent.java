package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveJoinFanBaseContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJoinFanBaseContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJoinFanBaseContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJoinFanBaseContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJoinFanBaseContent newInstance() {
            return new BLiveJoinFanBaseContent();
        }

        public boolean parseField(BLiveJoinFanBaseContent bLiveJoinFanBaseContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("anchorId")) {
                bLiveJoinFanBaseContent.anchorId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userId")) {
                return false;
            }
            bLiveJoinFanBaseContent.userId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJoinFanBaseContent bLiveJoinFanBaseContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJoinFanBaseContent.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLiveJoinFanBaseContent.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJoinFanBaseContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejoinfanbasecontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveJoinFanBaseContent new_() {
        BLiveJoinFanBaseContent bLiveJoinFanBaseContent = new BLiveJoinFanBaseContent();
        bLiveJoinFanBaseContent.nullCheck();
        return bLiveJoinFanBaseContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJoinFanBaseContent mo225055clone() {
        BLiveJoinFanBaseContent bLiveJoinFanBaseContent = new BLiveJoinFanBaseContent();
        bLiveJoinFanBaseContent.anchorId = this.anchorId;
        bLiveJoinFanBaseContent.userId = this.userId;
        return bLiveJoinFanBaseContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJoinFanBaseContent)) {
            return false;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContent = (BLiveJoinFanBaseContent) obj;
        return ValueObject.util_equals(this.anchorId, bLiveJoinFanBaseContent.anchorId) && ValueObject.util_equals(this.userId, bLiveJoinFanBaseContent.userId);
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
