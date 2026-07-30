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
public class BLiveDragonScourgeDisplayChatMessage extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDragonScourgeDisplayChatMessage> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDragonScourgeDisplayChatMessage>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDragonScourgeDisplayChatMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDragonScourgeDisplayChatMessage newInstance() {
            return new BLiveDragonScourgeDisplayChatMessage();
        }

        public boolean parseField(BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isDisplay")) {
                return false;
            }
            bLiveDragonScourgeDisplayChatMessage.isDisplay = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isDisplay", bLiveDragonScourgeDisplayChatMessage.isDisplay);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDragonScourgeDisplayChatMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedragonscourgedisplaychatmessage";

    @ProtobufIndex(index = 1)
    public boolean isDisplay;

    public static BLiveDragonScourgeDisplayChatMessage new_() {
        BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage = new BLiveDragonScourgeDisplayChatMessage();
        bLiveDragonScourgeDisplayChatMessage.nullCheck();
        return bLiveDragonScourgeDisplayChatMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDragonScourgeDisplayChatMessage mo225055clone() {
        BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage = new BLiveDragonScourgeDisplayChatMessage();
        bLiveDragonScourgeDisplayChatMessage.isDisplay = this.isDisplay;
        return bLiveDragonScourgeDisplayChatMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveDragonScourgeDisplayChatMessage) && this.isDisplay == ((BLiveDragonScourgeDisplayChatMessage) obj).isDisplay;
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
        int i2 = (i * 41) + (this.isDisplay ? 1231 : 1237);
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
