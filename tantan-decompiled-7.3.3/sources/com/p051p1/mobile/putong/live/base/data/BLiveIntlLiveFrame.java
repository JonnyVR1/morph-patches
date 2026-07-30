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
public class BLiveIntlLiveFrame extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlLiveFrame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlLiveFrame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlLiveFrame.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlLiveFrame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlLiveFrame newInstance() {
            return new BLiveIntlLiveFrame();
        }

        public boolean parseField(BLiveIntlLiveFrame bLiveIntlLiveFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                bLiveIntlLiveFrame.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("frameId")) {
                return false;
            }
            bLiveIntlLiveFrame.frameId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlLiveFrame bLiveIntlLiveFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlLiveFrame.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveIntlLiveFrame.frameId;
            if (str2 != null) {
                jsonGenerator.writeStringField("frameId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlLiveFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlliveframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public String frameId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveIntlLiveFrame new_() {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = new BLiveIntlLiveFrame();
        bLiveIntlLiveFrame.nullCheck();
        return bLiveIntlLiveFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlLiveFrame mo225055clone() {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = new BLiveIntlLiveFrame();
        bLiveIntlLiveFrame.userId = this.userId;
        bLiveIntlLiveFrame.frameId = this.frameId;
        return bLiveIntlLiveFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlLiveFrame)) {
            return false;
        }
        BLiveIntlLiveFrame bLiveIntlLiveFrame = (BLiveIntlLiveFrame) obj;
        return ValueObject.util_equals(this.userId, bLiveIntlLiveFrame.userId) && ValueObject.util_equals(this.frameId, bLiveIntlLiveFrame.frameId);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.frameId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.frameId == null) {
            this.frameId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
