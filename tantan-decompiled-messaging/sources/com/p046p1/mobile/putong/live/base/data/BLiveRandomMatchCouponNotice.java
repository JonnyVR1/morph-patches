package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveRandomMatchCouponNotice;
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
public class BLiveRandomMatchCouponNotice extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRandomMatchCouponNotice> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRandomMatchCouponNotice>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRandomMatchCouponNotice.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRandomMatchCouponNotice.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRandomMatchCouponNotice newInstance() {
            return new BLiveRandomMatchCouponNotice();
        }

        public boolean parseField(BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    bLiveRandomMatchCouponNotice.template = jsonParser.getValueAsString();
                    return true;
                case "fields":
                    bLiveRandomMatchCouponNotice.fields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "icon":
                    bLiveRandomMatchCouponNotice.icon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRandomMatchCouponNotice.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveRandomMatchCouponNotice.template;
            if (str2 != null) {
                jsonGenerator.writeStringField("template", str2);
            }
            if (bLiveRandomMatchCouponNotice.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(bLiveRandomMatchCouponNotice.fields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRandomMatchCouponNotice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverandommatchcouponnotice";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> fields;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String template;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68180a(String str) {
        return str;
    }

    public static BLiveRandomMatchCouponNotice new_() {
        BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice = new BLiveRandomMatchCouponNotice();
        bLiveRandomMatchCouponNotice.nullCheck();
        return bLiveRandomMatchCouponNotice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRandomMatchCouponNotice mo223809clone() {
        BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice = new BLiveRandomMatchCouponNotice();
        bLiveRandomMatchCouponNotice.icon = this.icon;
        bLiveRandomMatchCouponNotice.template = this.template;
        List<String> list = this.fields;
        if (list != null) {
            bLiveRandomMatchCouponNotice.fields = ValueObject.util_map(list, new w9j() { // from class: l.t42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveRandomMatchCouponNotice.m68180a((String) obj);
                }
            });
        }
        return bLiveRandomMatchCouponNotice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRandomMatchCouponNotice)) {
            return false;
        }
        BLiveRandomMatchCouponNotice bLiveRandomMatchCouponNotice = (BLiveRandomMatchCouponNotice) obj;
        return ValueObject.util_equals(this.icon, bLiveRandomMatchCouponNotice.icon) && ValueObject.util_equals(this.template, bLiveRandomMatchCouponNotice.template) && ValueObject.util_equals(this.fields, bLiveRandomMatchCouponNotice.fields);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.template;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.fields;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.template == null) {
            this.template = "";
        }
        if (this.fields == null) {
            this.fields = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
