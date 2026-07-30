package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BAvatar extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BAvatar> JSON_ADAPTER = new ObjectJsonAdapter<BAvatar>() { // from class: com.p1.mobile.putong.live.base.data.BAvatar.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BAvatar.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BAvatar newInstance() {
            return new BAvatar();
        }

        public boolean parseField(BAvatar bAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    bAvatar.height = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    bAvatar.url = jsonParser.getValueAsString();
                    return true;
                case "width":
                    bAvatar.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BAvatar bAvatar, JsonGenerator jsonGenerator) throws IOException {
            String str = bAvatar.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("width", bAvatar.width);
            jsonGenerator.writeNumberField("height", bAvatar.height);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bavatar";

    @ProtobufIndex(index = 3)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @ProtobufIndex(index = 2)
    public int width;

    public static BAvatar new_() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.nullCheck();
        return bAvatar;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BAvatar mo225055clone() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.url = this.url;
        bAvatar.width = this.width;
        bAvatar.height = this.height;
        return bAvatar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BAvatar)) {
            return false;
        }
        BAvatar bAvatar = (BAvatar) obj;
        return ValueObject.util_equals(this.url, bAvatar.url) && this.width == bAvatar.width && this.height == bAvatar.height;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "bavatar";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.url;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
