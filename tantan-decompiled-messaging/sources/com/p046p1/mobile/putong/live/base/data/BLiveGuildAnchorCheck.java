package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGuildAnchorCheck extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGuildAnchorCheck> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGuildAnchorCheck>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGuildAnchorCheck.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGuildAnchorCheck.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGuildAnchorCheck newInstance() {
            return new BLiveGuildAnchorCheck();
        }

        public boolean parseField(BLiveGuildAnchorCheck bLiveGuildAnchorCheck, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isGuildAnchor")) {
                return false;
            }
            bLiveGuildAnchorCheck.isGuildAnchor = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGuildAnchorCheck bLiveGuildAnchorCheck, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isGuildAnchor", bLiveGuildAnchorCheck.isGuildAnchor);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGuildAnchorCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveguildanchorcheck";

    @ProtobufIndex(index = 1)
    public boolean isGuildAnchor;

    public static BLiveGuildAnchorCheck new_() {
        BLiveGuildAnchorCheck bLiveGuildAnchorCheck = new BLiveGuildAnchorCheck();
        bLiveGuildAnchorCheck.nullCheck();
        return bLiveGuildAnchorCheck;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGuildAnchorCheck mo223809clone() {
        BLiveGuildAnchorCheck bLiveGuildAnchorCheck = new BLiveGuildAnchorCheck();
        bLiveGuildAnchorCheck.isGuildAnchor = this.isGuildAnchor;
        return bLiveGuildAnchorCheck;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveGuildAnchorCheck) && this.isGuildAnchor == ((BLiveGuildAnchorCheck) obj).isGuildAnchor;
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
        int i2 = (i * 41) + (this.isGuildAnchor ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
