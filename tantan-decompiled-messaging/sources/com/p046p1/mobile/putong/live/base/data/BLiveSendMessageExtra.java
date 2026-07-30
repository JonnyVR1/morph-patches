package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
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
public class BLiveSendMessageExtra extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendMessageExtra> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendMessageExtra>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendMessageExtra.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendMessageExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendMessageExtra newInstance() {
            return new BLiveSendMessageExtra();
        }

        public boolean parseField(BLiveSendMessageExtra bLiveSendMessageExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("atUserInfos")) {
                bLiveSendMessageExtra.atUserInfos = JsonAdapter.parseArray(jsonParser, BLiveAtUserInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("groupType")) {
                return false;
            }
            bLiveSendMessageExtra.groupType = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendMessageExtra bLiveSendMessageExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendMessageExtra.groupType;
            if (str != null) {
                jsonGenerator.writeStringField("groupType", str);
            }
            if (bLiveSendMessageExtra.atUserInfos != null) {
                jsonGenerator.writeFieldName("atUserInfos");
                JsonAdapter.serializeArray(bLiveSendMessageExtra.atUserInfos, jsonGenerator, BLiveAtUserInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendMessageExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendmessageextra";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveAtUserInfo> atUserInfos;

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupType;

    public static BLiveSendMessageExtra new_() {
        BLiveSendMessageExtra bLiveSendMessageExtra = new BLiveSendMessageExtra();
        bLiveSendMessageExtra.nullCheck();
        return bLiveSendMessageExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendMessageExtra mo223809clone() {
        BLiveSendMessageExtra bLiveSendMessageExtra = new BLiveSendMessageExtra();
        bLiveSendMessageExtra.groupType = this.groupType;
        List<BLiveAtUserInfo> list = this.atUserInfos;
        if (list != null) {
            bLiveSendMessageExtra.atUserInfos = ValueObject.util_map(list, new w9j() { // from class: l.i52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAtUserInfo) obj).mo223809clone();
                }
            });
        }
        return bLiveSendMessageExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendMessageExtra)) {
            return false;
        }
        BLiveSendMessageExtra bLiveSendMessageExtra = (BLiveSendMessageExtra) obj;
        return ValueObject.util_equals(this.groupType, bLiveSendMessageExtra.groupType) && ValueObject.util_equals(this.atUserInfos, bLiveSendMessageExtra.atUserInfos);
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
        String str = this.groupType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveAtUserInfo> list = this.atUserInfos;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupType == null) {
            this.groupType = "";
        }
        if (this.atUserInfos == null) {
            this.atUserInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
