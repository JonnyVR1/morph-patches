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
public class BLivePkStartMessage extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkStartMessage> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkStartMessage>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkStartMessage.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkStartMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkStartMessage newInstance() {
            return new BLivePkStartMessage();
        }

        public boolean parseField(BLivePkStartMessage bLivePkStartMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("anchorTemplateId")) {
                bLivePkStartMessage.anchorTemplateId = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("audienceTemplateId")) {
                return false;
            }
            bLivePkStartMessage.audienceTemplateId = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkStartMessage bLivePkStartMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("anchorTemplateId", bLivePkStartMessage.anchorTemplateId);
            jsonGenerator.writeNumberField("audienceTemplateId", bLivePkStartMessage.audienceTemplateId);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkStartMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkstartmessage";

    @ProtobufIndex(index = 1)
    public int anchorTemplateId;

    @ProtobufIndex(index = 2)
    public int audienceTemplateId;

    public static BLivePkStartMessage new_() {
        BLivePkStartMessage bLivePkStartMessage = new BLivePkStartMessage();
        bLivePkStartMessage.nullCheck();
        return bLivePkStartMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkStartMessage mo225055clone() {
        BLivePkStartMessage bLivePkStartMessage = new BLivePkStartMessage();
        bLivePkStartMessage.anchorTemplateId = this.anchorTemplateId;
        bLivePkStartMessage.audienceTemplateId = this.audienceTemplateId;
        return bLivePkStartMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkStartMessage)) {
            return false;
        }
        BLivePkStartMessage bLivePkStartMessage = (BLivePkStartMessage) obj;
        return this.anchorTemplateId == bLivePkStartMessage.anchorTemplateId && this.audienceTemplateId == bLivePkStartMessage.audienceTemplateId;
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
        int i2 = (((i * 41) + this.anchorTemplateId) * 41) + this.audienceTemplateId;
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
