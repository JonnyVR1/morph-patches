package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveNotifyFollowers extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNotifyFollowers> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNotifyFollowers>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNotifyFollowers.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNotifyFollowers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNotifyFollowers newInstance() {
            return new BLiveNotifyFollowers();
        }

        public boolean parseField(BLiveNotifyFollowers bLiveNotifyFollowers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showNotifyButton")) {
                return false;
            }
            bLiveNotifyFollowers.showNotifyButton = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNotifyFollowers bLiveNotifyFollowers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showNotifyButton", bLiveNotifyFollowers.showNotifyButton);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNotifyFollowers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenotifyfollowers";

    @ProtobufIndex(index = 1)
    public boolean showNotifyButton;

    public static BLiveNotifyFollowers new_() {
        BLiveNotifyFollowers bLiveNotifyFollowers = new BLiveNotifyFollowers();
        bLiveNotifyFollowers.nullCheck();
        return bLiveNotifyFollowers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNotifyFollowers mo225055clone() {
        BLiveNotifyFollowers bLiveNotifyFollowers = new BLiveNotifyFollowers();
        bLiveNotifyFollowers.showNotifyButton = this.showNotifyButton;
        return bLiveNotifyFollowers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveNotifyFollowers) && this.showNotifyButton == ((BLiveNotifyFollowers) obj).showNotifyButton;
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
        int i2 = (i * 41) + (this.showNotifyButton ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
