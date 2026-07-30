package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
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
public class BLiveVoiceTopic extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceTopic> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceTopic>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceTopic.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceTopic newInstance() {
            return new BLiveVoiceTopic();
        }

        public boolean parseField(BLiveVoiceTopic bLiveVoiceTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titles":
                    bLiveVoiceTopic.titles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVoiceTopic.f45362id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveVoiceTopic.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceTopic.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceTopic.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceTopic bLiveVoiceTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceTopic.f45362id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceTopic.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVoiceTopic.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveVoiceTopic.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            if (bLiveVoiceTopic.titles != null) {
                jsonGenerator.writeFieldName("titles");
                JsonAdapter.serializeArray(bLiveVoiceTopic.titles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicetopic";

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45362id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public int randomTitleIndex = -1;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> titles;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69629a(String str) {
        return str;
    }

    public static BLiveVoiceTopic new_() {
        BLiveVoiceTopic bLiveVoiceTopic = new BLiveVoiceTopic();
        bLiveVoiceTopic.nullCheck();
        return bLiveVoiceTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceTopic mo225055clone() {
        BLiveVoiceTopic bLiveVoiceTopic = new BLiveVoiceTopic();
        bLiveVoiceTopic.f45362id = this.f45362id;
        bLiveVoiceTopic.name = this.name;
        bLiveVoiceTopic.type = this.type;
        bLiveVoiceTopic.icon = this.icon;
        List<String> list = this.titles;
        if (list != null) {
            bLiveVoiceTopic.titles = ValueObject.util_map(list, new qcj() { // from class: l.ea2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceTopic.m69629a((String) obj);
                }
            });
        }
        return bLiveVoiceTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceTopic)) {
            return false;
        }
        BLiveVoiceTopic bLiveVoiceTopic = (BLiveVoiceTopic) obj;
        return ValueObject.util_equals(this.f45362id, bLiveVoiceTopic.f45362id) && ValueObject.util_equals(this.name, bLiveVoiceTopic.name) && ValueObject.util_equals(this.type, bLiveVoiceTopic.type) && ValueObject.util_equals(this.icon, bLiveVoiceTopic.icon) && ValueObject.util_equals(this.titles, bLiveVoiceTopic.titles);
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
        String str = this.f45362id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.titles;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45362id == null) {
            this.f45362id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.titles == null) {
            this.titles = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
