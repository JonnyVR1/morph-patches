package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
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
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveJsDialogConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJsDialogConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJsDialogConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJsDialogConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJsDialogConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJsDialogConfig newInstance() {
            return new BLiveJsDialogConfig();
        }

        public boolean parseField(BLiveJsDialogConfig bLiveJsDialogConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "canCloseDialogTouchOutSide":
                    bLiveJsDialogConfig.canCloseDialogTouchOutSide = jsonParser.getValueAsBoolean();
                    return true;
                case "name":
                    bLiveJsDialogConfig.name = jsonParser.getValueAsString();
                    return true;
                case "types":
                    bLiveJsDialogConfig.types = JsonAdapter.parseArray(jsonParser, BLiveJsDialogItemType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJsDialogConfig bLiveJsDialogConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJsDialogConfig.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeBooleanField("canCloseDialogTouchOutSide", bLiveJsDialogConfig.canCloseDialogTouchOutSide);
            if (bLiveJsDialogConfig.types != null) {
                jsonGenerator.writeFieldName("types");
                JsonAdapter.serializeArray(bLiveJsDialogConfig.types, jsonGenerator, BLiveJsDialogItemType.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJsDialogConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejsdialogconfig";
    public z20<String, String> callJs;

    @ProtobufIndex(index = 2)
    public boolean canCloseDialogTouchOutSide;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveJsDialogItemType> types;

    public static BLiveJsDialogConfig new_() {
        BLiveJsDialogConfig bLiveJsDialogConfig = new BLiveJsDialogConfig();
        bLiveJsDialogConfig.nullCheck();
        return bLiveJsDialogConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJsDialogConfig mo225055clone() {
        BLiveJsDialogConfig bLiveJsDialogConfig = new BLiveJsDialogConfig();
        bLiveJsDialogConfig.name = this.name;
        bLiveJsDialogConfig.canCloseDialogTouchOutSide = this.canCloseDialogTouchOutSide;
        List<BLiveJsDialogItemType> list = this.types;
        if (list != null) {
            bLiveJsDialogConfig.types = ValueObject.util_map(list, new qcj() { // from class: l.a22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveJsDialogItemType) obj).mo225055clone();
                }
            });
        }
        return bLiveJsDialogConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJsDialogConfig)) {
            return false;
        }
        BLiveJsDialogConfig bLiveJsDialogConfig = (BLiveJsDialogConfig) obj;
        return ValueObject.util_equals(this.name, bLiveJsDialogConfig.name) && this.canCloseDialogTouchOutSide == bLiveJsDialogConfig.canCloseDialogTouchOutSide && ValueObject.util_equals(this.types, bLiveJsDialogConfig.types);
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.canCloseDialogTouchOutSide ? 1231 : 1237)) * 41;
        List<BLiveJsDialogItemType> list = this.types;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.types == null) {
            this.types = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
