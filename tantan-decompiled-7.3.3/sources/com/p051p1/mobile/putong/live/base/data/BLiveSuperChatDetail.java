package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardTopChatTemplateItem;
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
public class BLiveSuperChatDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuperChatDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuperChatDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuperChatDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuperChatDetail newInstance() {
            return new BLiveSuperChatDetail();
        }

        public boolean parseField(BLiveSuperChatDetail bLiveSuperChatDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    bLiveSuperChatDetail.productType = jsonParser.getValueAsString();
                    return true;
                case "canSend":
                    bLiveSuperChatDetail.canSend = jsonParser.getValueAsBoolean();
                    return true;
                case "message":
                    bLiveSuperChatDetail.message = jsonParser.getValueAsString();
                    return true;
                case "templates":
                    bLiveSuperChatDetail.templates = JsonAdapter.parseArray(jsonParser, BLiveGuardTopChatTemplateItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuperChatDetail bLiveSuperChatDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuperChatDetail.productType;
            if (str != null) {
                jsonGenerator.writeStringField("productType", str);
            }
            jsonGenerator.writeBooleanField("canSend", bLiveSuperChatDetail.canSend);
            String str2 = bLiveSuperChatDetail.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
            if (bLiveSuperChatDetail.templates != null) {
                jsonGenerator.writeFieldName("templates");
                JsonAdapter.serializeArray(bLiveSuperChatDetail.templates, jsonGenerator, BLiveGuardTopChatTemplateItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuperChatDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesuperchatdetail";

    @ProtobufIndex(index = 2)
    public boolean canSend;

    @NonNull
    @ProtobufIndex(index = 3)
    public String message;

    @NonNull
    @ProtobufIndex(index = 1)
    public String productType;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveGuardTopChatTemplateItem> templates;

    public static BLiveSuperChatDetail new_() {
        BLiveSuperChatDetail bLiveSuperChatDetail = new BLiveSuperChatDetail();
        bLiveSuperChatDetail.nullCheck();
        return bLiveSuperChatDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuperChatDetail mo225055clone() {
        BLiveSuperChatDetail bLiveSuperChatDetail = new BLiveSuperChatDetail();
        bLiveSuperChatDetail.productType = this.productType;
        bLiveSuperChatDetail.canSend = this.canSend;
        bLiveSuperChatDetail.message = this.message;
        List<BLiveGuardTopChatTemplateItem> list = this.templates;
        if (list != null) {
            bLiveSuperChatDetail.templates = ValueObject.util_map(list, new qcj() { // from class: l.t62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGuardTopChatTemplateItem) obj).mo225055clone();
                }
            });
        }
        return bLiveSuperChatDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuperChatDetail)) {
            return false;
        }
        BLiveSuperChatDetail bLiveSuperChatDetail = (BLiveSuperChatDetail) obj;
        return ValueObject.util_equals(this.productType, bLiveSuperChatDetail.productType) && this.canSend == bLiveSuperChatDetail.canSend && ValueObject.util_equals(this.message, bLiveSuperChatDetail.message) && ValueObject.util_equals(this.templates, bLiveSuperChatDetail.templates);
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
        String str = this.productType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.canSend ? 1231 : 1237)) * 41;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveGuardTopChatTemplateItem> list = this.templates;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.productType == null) {
            this.productType = "";
        }
        if (this.message == null) {
            this.message = "";
        }
        if (this.templates == null) {
            this.templates = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
