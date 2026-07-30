package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
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
public class BLiveVoiceEmojiMenuButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceEmojiMenuButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceEmojiMenuButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceEmojiMenuButton.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceEmojiMenuButton newInstance() {
            return new BLiveVoiceEmojiMenuButton();
        }

        public boolean parseField(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveVoiceEmojiMenuButton.f45341id = jsonParser.getValueAsInt();
                    return false;
                case "icon":
                    bLiveVoiceEmojiMenuButton.icon = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    bLiveVoiceEmojiMenuButton.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceEmojiMenuButton.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveVoiceEmojiMenuButton.f45341id);
            String str = bLiveVoiceEmojiMenuButton.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (bLiveVoiceEmojiMenuButton.icon != null) {
                jsonGenerator.writeFieldName("icon");
                JsonAdapter.serializeArray(bLiveVoiceEmojiMenuButton.icon, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = bLiveVoiceEmojiMenuButton.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceEmojiMenuButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceemojimenubutton";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45341id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69546a(String str) {
        return str;
    }

    public static BLiveVoiceEmojiMenuButton new_() {
        BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton = new BLiveVoiceEmojiMenuButton();
        bLiveVoiceEmojiMenuButton.nullCheck();
        return bLiveVoiceEmojiMenuButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceEmojiMenuButton mo225055clone() {
        BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton = new BLiveVoiceEmojiMenuButton();
        bLiveVoiceEmojiMenuButton.f45341id = this.f45341id;
        bLiveVoiceEmojiMenuButton.name = this.name;
        List<String> list = this.icon;
        if (list != null) {
            bLiveVoiceEmojiMenuButton.icon = ValueObject.util_map(list, new qcj() { // from class: l.v82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceEmojiMenuButton.m69546a((String) obj);
                }
            });
        }
        bLiveVoiceEmojiMenuButton.type = this.type;
        return bLiveVoiceEmojiMenuButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceEmojiMenuButton)) {
            return false;
        }
        BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton = (BLiveVoiceEmojiMenuButton) obj;
        return this.f45341id == bLiveVoiceEmojiMenuButton.f45341id && ValueObject.util_equals(this.name, bLiveVoiceEmojiMenuButton.name) && ValueObject.util_equals(this.icon, bLiveVoiceEmojiMenuButton.icon) && ValueObject.util_equals(this.type, bLiveVoiceEmojiMenuButton.type);
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
        int i2 = ((i * 41) + this.f45341id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.icon;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
