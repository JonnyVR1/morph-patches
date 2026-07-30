package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Owner;
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
public class BLivePkSeek extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSeek> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSeek>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSeek.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSeek.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSeek newInstance() {
            return new BLivePkSeek();
        }

        public boolean parseField(BLivePkSeek bLivePkSeek, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLivePkSeek.f44428id = jsonParser.getValueAsString();
                    return false;
                case "owner":
                    bLivePkSeek.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    bLivePkSeek.state = BLivePkSeekState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "createTime":
                    bLivePkSeek.createTime = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSeek bLivePkSeek, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkSeek.f44428id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLivePkSeek.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(bLivePkSeek.owner, jsonGenerator, true);
            }
            if (bLivePkSeek.state != null) {
                jsonGenerator.writeFieldName("state");
                BLivePkSeekState.JSON_ADAPTER.serialize(bLivePkSeek.state, jsonGenerator, true);
            }
            String str2 = bLivePkSeek.createTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("createTime", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSeek) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkseek";

    @NonNull
    @ProtobufIndex(index = 4)
    public String createTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44428id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePkSeekState state;

    public static BLivePkSeek new_() {
        BLivePkSeek bLivePkSeek = new BLivePkSeek();
        bLivePkSeek.nullCheck();
        return bLivePkSeek;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSeek mo223809clone() {
        BLivePkSeek bLivePkSeek = new BLivePkSeek();
        bLivePkSeek.f44428id = this.f44428id;
        bLivePkSeek.owner = this.owner;
        bLivePkSeek.state = this.state;
        bLivePkSeek.createTime = this.createTime;
        return bLivePkSeek;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSeek)) {
            return false;
        }
        BLivePkSeek bLivePkSeek = (BLivePkSeek) obj;
        return ValueObject.util_equals(this.f44428id, bLivePkSeek.f44428id) && ValueObject.util_equals(this.owner, bLivePkSeek.owner) && ValueObject.util_equals(this.state, bLivePkSeek.state) && ValueObject.util_equals(this.createTime, bLivePkSeek.createTime);
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
        String str = this.f44428id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLivePkSeekState bLivePkSeekState = this.state;
        int iHashCode3 = (iHashCode2 + (bLivePkSeekState != null ? bLivePkSeekState.hashCode() : 0)) * 41;
        String str3 = this.createTime;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44428id == null) {
            this.f44428id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.state == null) {
            this.state = (BLivePkSeekState) BLivePkSeekState.JSON_ADAPTER.defaultEnum();
        }
        if (this.createTime == null) {
            this.createTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
