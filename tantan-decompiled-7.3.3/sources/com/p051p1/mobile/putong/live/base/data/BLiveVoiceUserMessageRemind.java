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
public class BLiveVoiceUserMessageRemind extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserMessageRemind> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserMessageRemind>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserMessageRemind.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserMessageRemind.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserMessageRemind newInstance() {
            return new BLiveVoiceUserMessageRemind();
        }

        public boolean parseField(BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("remind")) {
                return false;
            }
            bLiveVoiceUserMessageRemind.remind = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("remind", bLiveVoiceUserMessageRemind.remind);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserMessageRemind) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceusermessageremind";

    @ProtobufIndex(index = 1)
    public boolean remind;

    public static BLiveVoiceUserMessageRemind new_() {
        BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind = new BLiveVoiceUserMessageRemind();
        bLiveVoiceUserMessageRemind.nullCheck();
        return bLiveVoiceUserMessageRemind;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserMessageRemind mo225055clone() {
        BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind = new BLiveVoiceUserMessageRemind();
        bLiveVoiceUserMessageRemind.remind = this.remind;
        return bLiveVoiceUserMessageRemind;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveVoiceUserMessageRemind) && this.remind == ((BLiveVoiceUserMessageRemind) obj).remind;
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
        int i2 = (i * 41) + (this.remind ? 1231 : 1237);
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
