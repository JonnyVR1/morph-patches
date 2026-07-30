package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTemplateMenu extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTemplateMenu> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTemplateMenu>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTemplateMenu.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTemplateMenu.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTemplateMenu newInstance() {
            return new BLiveTemplateMenu();
        }

        public boolean parseField(BLiveTemplateMenu bLiveTemplateMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationClickAction.f44417h5)) {
                bLiveTemplateMenu.f44459h5 = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveTemplateMenu.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTemplateMenu bLiveTemplateMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTemplateMenu.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveTemplateMenu.f44459h5;
            if (str2 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.f44417h5, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTemplateMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetemplatemenu";

    /* JADX INFO: renamed from: h5 */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f44459h5;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveTemplateMenu new_() {
        BLiveTemplateMenu bLiveTemplateMenu = new BLiveTemplateMenu();
        bLiveTemplateMenu.nullCheck();
        return bLiveTemplateMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTemplateMenu mo223809clone() {
        BLiveTemplateMenu bLiveTemplateMenu = new BLiveTemplateMenu();
        bLiveTemplateMenu.title = this.title;
        bLiveTemplateMenu.f44459h5 = this.f44459h5;
        return bLiveTemplateMenu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTemplateMenu)) {
            return false;
        }
        BLiveTemplateMenu bLiveTemplateMenu = (BLiveTemplateMenu) obj;
        return ValueObject.util_equals(this.title, bLiveTemplateMenu.title) && ValueObject.util_equals(this.f44459h5, bLiveTemplateMenu.f44459h5);
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
        String str2 = this.f44459h5;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.f44459h5 == null) {
            this.f44459h5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
