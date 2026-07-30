package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
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
public class BLiveVoiceEmojiMenu extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceEmojiMenu> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceEmojiMenu>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceEmojiMenu.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceEmojiMenu newInstance() {
            return new BLiveVoiceEmojiMenu();
        }

        public boolean parseField(BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttons":
                    bLiveVoiceEmojiMenu.buttons = JsonAdapter.parseArray(jsonParser, BLiveVoiceEmojiMenuButton.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "categoryTitle":
                    bLiveVoiceEmojiMenu.categoryTitle = jsonParser.getValueAsString();
                    return true;
                case "categoryType":
                    bLiveVoiceEmojiMenu.categoryType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceEmojiMenu.categoryTitle;
            if (str != null) {
                jsonGenerator.writeStringField("categoryTitle", str);
            }
            String str2 = bLiveVoiceEmojiMenu.categoryType;
            if (str2 != null) {
                jsonGenerator.writeStringField("categoryType", str2);
            }
            if (bLiveVoiceEmojiMenu.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(bLiveVoiceEmojiMenu.buttons, jsonGenerator, BLiveVoiceEmojiMenuButton.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceEmojiMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceemojimenu";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveVoiceEmojiMenuButton> buttons;

    @NonNull
    @ProtobufIndex(index = 1)
    public String categoryTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String categoryType;

    public static BLiveVoiceEmojiMenu new_() {
        BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu = new BLiveVoiceEmojiMenu();
        bLiveVoiceEmojiMenu.nullCheck();
        return bLiveVoiceEmojiMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceEmojiMenu mo223809clone() {
        BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu = new BLiveVoiceEmojiMenu();
        bLiveVoiceEmojiMenu.categoryTitle = this.categoryTitle;
        bLiveVoiceEmojiMenu.categoryType = this.categoryType;
        List<BLiveVoiceEmojiMenuButton> list = this.buttons;
        if (list != null) {
            bLiveVoiceEmojiMenu.buttons = ValueObject.util_map(list, new w9j() { // from class: l.n82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceEmojiMenuButton) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceEmojiMenu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceEmojiMenu)) {
            return false;
        }
        BLiveVoiceEmojiMenu bLiveVoiceEmojiMenu = (BLiveVoiceEmojiMenu) obj;
        return ValueObject.util_equals(this.categoryTitle, bLiveVoiceEmojiMenu.categoryTitle) && ValueObject.util_equals(this.categoryType, bLiveVoiceEmojiMenu.categoryType) && ValueObject.util_equals(this.buttons, bLiveVoiceEmojiMenu.buttons);
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
        String str = this.categoryTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.categoryType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveVoiceEmojiMenuButton> list = this.buttons;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.categoryTitle == null) {
            this.categoryTitle = "";
        }
        if (this.categoryType == null) {
            this.categoryType = "";
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
