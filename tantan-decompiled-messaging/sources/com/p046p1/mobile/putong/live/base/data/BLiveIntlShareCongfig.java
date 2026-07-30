package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveIntlShareCongfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlShareCongfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlShareCongfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlShareCongfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlShareCongfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlShareCongfig newInstance() {
            return new BLiveIntlShareCongfig();
        }

        public boolean parseField(BLiveIntlShareCongfig bLiveIntlShareCongfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("maxSingleShareLimit")) {
                return false;
            }
            bLiveIntlShareCongfig.maxSingleShareLimit = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlShareCongfig bLiveIntlShareCongfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maxSingleShareLimit", bLiveIntlShareCongfig.maxSingleShareLimit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlShareCongfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlsharecongfig";

    @ProtobufIndex(index = 1)
    public int maxSingleShareLimit;

    public static BLiveIntlShareCongfig new_() {
        BLiveIntlShareCongfig bLiveIntlShareCongfig = new BLiveIntlShareCongfig();
        bLiveIntlShareCongfig.nullCheck();
        return bLiveIntlShareCongfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlShareCongfig mo223809clone() {
        BLiveIntlShareCongfig bLiveIntlShareCongfig = new BLiveIntlShareCongfig();
        bLiveIntlShareCongfig.maxSingleShareLimit = this.maxSingleShareLimit;
        return bLiveIntlShareCongfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveIntlShareCongfig) && this.maxSingleShareLimit == ((BLiveIntlShareCongfig) obj).maxSingleShareLimit;
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
        int i2 = (i * 41) + this.maxSingleShareLimit;
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
