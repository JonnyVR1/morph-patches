package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.mqv;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceUserProfileBanners extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserProfileBanners> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserProfileBanners>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserProfileBanners.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserProfileBanners newInstance() {
            return new BLiveVoiceUserProfileBanners();
        }

        public boolean parseField(BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpSchema":
                    bLiveVoiceUserProfileBanners.jumpSchema = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    bLiveVoiceUserProfileBanners.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveVoiceUserProfileBanners.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceUserProfileBanners.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserProfileBanners.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceUserProfileBanners.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceUserProfileBanners.jumpSchema;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpSchema", str3);
            }
            if (bLiveVoiceUserProfileBanners.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileBanners.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserProfileBanners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserprofilebanners";

    @NonNull
    @ProtobufIndex(index = 3)
    public String jumpSchema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> userIds;
    public List<mqv<User>> users = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68449a(String str) {
        return str;
    }

    public static BLiveVoiceUserProfileBanners new_() {
        BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = new BLiveVoiceUserProfileBanners();
        bLiveVoiceUserProfileBanners.nullCheck();
        return bLiveVoiceUserProfileBanners;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserProfileBanners mo223809clone() {
        BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = new BLiveVoiceUserProfileBanners();
        bLiveVoiceUserProfileBanners.title = this.title;
        bLiveVoiceUserProfileBanners.type = this.type;
        bLiveVoiceUserProfileBanners.jumpSchema = this.jumpSchema;
        List<String> list = this.userIds;
        if (list != null) {
            bLiveVoiceUserProfileBanners.userIds = ValueObject.util_map(list, new w9j() { // from class: l.aa2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileBanners.m68449a((String) obj);
                }
            });
        }
        return bLiveVoiceUserProfileBanners;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserProfileBanners)) {
            return false;
        }
        BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = (BLiveVoiceUserProfileBanners) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceUserProfileBanners.title) && ValueObject.util_equals(this.type, bLiveVoiceUserProfileBanners.type) && ValueObject.util_equals(this.jumpSchema, bLiveVoiceUserProfileBanners.jumpSchema) && ValueObject.util_equals(this.userIds, bLiveVoiceUserProfileBanners.userIds);
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
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.jumpSchema;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.jumpSchema == null) {
            this.jumpSchema = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
