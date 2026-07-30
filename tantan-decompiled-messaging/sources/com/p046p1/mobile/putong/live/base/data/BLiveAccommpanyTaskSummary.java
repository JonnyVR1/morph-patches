package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummaryUser;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAccommpanyTaskSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTaskSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTaskSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTaskSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTaskSummary newInstance() {
            return new BLiveAccommpanyTaskSummary();
        }

        public boolean parseField(BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveAccommpanyTaskSummary.status = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveAccommpanyTaskSummary.desc = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveAccommpanyTaskSummary.title = jsonParser.getValueAsString();
                    return true;
                case "users":
                    bLiveAccommpanyTaskSummary.users = JsonAdapter.parseArray(jsonParser, BLiveAccommpanyTaskSummaryUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "btnText":
                    bLiveAccommpanyTaskSummary.btnText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAccommpanyTaskSummary.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveAccommpanyTaskSummary.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            if (bLiveAccommpanyTaskSummary.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveAccommpanyTaskSummary.users, jsonGenerator, BLiveAccommpanyTaskSummaryUser.JSON_ADAPTER);
            }
            String str3 = bLiveAccommpanyTaskSummary.status;
            if (str3 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str3);
            }
            String str4 = bLiveAccommpanyTaskSummary.btnText;
            if (str4 != null) {
                jsonGenerator.writeStringField("btnText", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTaskSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasksummary";

    @NonNull
    @ProtobufIndex(index = 5)
    public String btnText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveAccommpanyTaskSummaryUser> users;

    public static BLiveAccommpanyTaskSummary new_() {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = new BLiveAccommpanyTaskSummary();
        bLiveAccommpanyTaskSummary.nullCheck();
        return bLiveAccommpanyTaskSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTaskSummary mo223809clone() {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = new BLiveAccommpanyTaskSummary();
        bLiveAccommpanyTaskSummary.title = this.title;
        bLiveAccommpanyTaskSummary.desc = this.desc;
        List<BLiveAccommpanyTaskSummaryUser> list = this.users;
        if (list != null) {
            bLiveAccommpanyTaskSummary.users = ValueObject.util_map(list, new w9j() { // from class: l.uq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAccommpanyTaskSummaryUser) obj).mo223809clone();
                }
            });
        }
        bLiveAccommpanyTaskSummary.status = this.status;
        bLiveAccommpanyTaskSummary.btnText = this.btnText;
        return bLiveAccommpanyTaskSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTaskSummary)) {
            return false;
        }
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = (BLiveAccommpanyTaskSummary) obj;
        return ValueObject.util_equals(this.title, bLiveAccommpanyTaskSummary.title) && ValueObject.util_equals(this.desc, bLiveAccommpanyTaskSummary.desc) && ValueObject.util_equals(this.users, bLiveAccommpanyTaskSummary.users) && ValueObject.util_equals(this.status, bLiveAccommpanyTaskSummary.status) && ValueObject.util_equals(this.btnText, bLiveAccommpanyTaskSummary.btnText);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveAccommpanyTaskSummaryUser> list = this.users;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.btnText;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.btnText == null) {
            this.btnText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
