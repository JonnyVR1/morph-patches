package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLivePkContributor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkContributor> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkContributor>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkContributor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkContributor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkContributor newInstance() {
            return new BLivePkContributor();
        }

        public boolean parseField(BLivePkContributor bLivePkContributor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLivePkContributor.userId = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLivePkContributor.name = jsonParser.getValueAsString();
                    return true;
                case "image":
                    bLivePkContributor.image = jsonParser.getValueAsString();
                    return true;
                case "point":
                    bLivePkContributor.point = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkContributor bLivePkContributor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkContributor.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLivePkContributor.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLivePkContributor.image;
            if (str3 != null) {
                jsonGenerator.writeStringField("image", str3);
            }
            jsonGenerator.writeNumberField("point", bLivePkContributor.point);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkContributor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkcontributor";

    @NonNull
    @ProtobufIndex(index = 3)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 4)
    public long point;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLivePkContributor new_() {
        BLivePkContributor bLivePkContributor = new BLivePkContributor();
        bLivePkContributor.nullCheck();
        return bLivePkContributor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkContributor mo223809clone() {
        BLivePkContributor bLivePkContributor = new BLivePkContributor();
        bLivePkContributor.userId = this.userId;
        bLivePkContributor.name = this.name;
        bLivePkContributor.image = this.image;
        bLivePkContributor.point = this.point;
        return bLivePkContributor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkContributor)) {
            return false;
        }
        BLivePkContributor bLivePkContributor = (BLivePkContributor) obj;
        return ValueObject.util_equals(this.userId, bLivePkContributor.userId) && ValueObject.util_equals(this.name, bLivePkContributor.name) && ValueObject.util_equals(this.image, bLivePkContributor.image) && this.point == bLivePkContributor.point;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.image;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.point;
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.image == null) {
            this.image = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
