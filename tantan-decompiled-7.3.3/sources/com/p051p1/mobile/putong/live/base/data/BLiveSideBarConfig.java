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
public class BLiveSideBarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSideBarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSideBarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSideBarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSideBarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSideBarConfig newInstance() {
            return new BLiveSideBarConfig();
        }

        public boolean parseField(BLiveSideBarConfig bLiveSideBarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("sideBarState")) {
                return false;
            }
            bLiveSideBarConfig.sideBarState = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSideBarConfig bLiveSideBarConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSideBarConfig.sideBarState;
            if (str != null) {
                jsonGenerator.writeStringField("sideBarState", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSideBarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesidebarconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String sideBarState;

    public static BLiveSideBarConfig new_() {
        BLiveSideBarConfig bLiveSideBarConfig = new BLiveSideBarConfig();
        bLiveSideBarConfig.nullCheck();
        return bLiveSideBarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSideBarConfig mo225055clone() {
        BLiveSideBarConfig bLiveSideBarConfig = new BLiveSideBarConfig();
        bLiveSideBarConfig.sideBarState = this.sideBarState;
        return bLiveSideBarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveSideBarConfig) {
            return ValueObject.util_equals(this.sideBarState, ((BLiveSideBarConfig) obj).sideBarState);
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
        String str = this.sideBarState;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sideBarState == null) {
            this.sideBarState = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
