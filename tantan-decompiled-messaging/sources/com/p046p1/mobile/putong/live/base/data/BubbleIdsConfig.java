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
public class BubbleIdsConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BubbleIdsConfig> JSON_ADAPTER = new ObjectJsonAdapter<BubbleIdsConfig>() { // from class: com.p1.mobile.putong.live.base.data.BubbleIdsConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BubbleIdsConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BubbleIdsConfig newInstance() {
            return new BubbleIdsConfig();
        }

        public boolean parseField(BubbleIdsConfig bubbleIdsConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("get")) {
                bubbleIdsConfig.get = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("take")) {
                return false;
            }
            bubbleIdsConfig.take = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BubbleIdsConfig bubbleIdsConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("get", bubbleIdsConfig.get);
            jsonGenerator.writeNumberField("take", bubbleIdsConfig.take);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BubbleIdsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bubbleidsconfig";

    @ProtobufIndex(index = 1)
    public int get;

    @ProtobufIndex(index = 2)
    public int take;

    public static BubbleIdsConfig new_() {
        BubbleIdsConfig bubbleIdsConfig = new BubbleIdsConfig();
        bubbleIdsConfig.nullCheck();
        return bubbleIdsConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BubbleIdsConfig mo223809clone() {
        BubbleIdsConfig bubbleIdsConfig = new BubbleIdsConfig();
        bubbleIdsConfig.get = this.get;
        bubbleIdsConfig.take = this.take;
        return bubbleIdsConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BubbleIdsConfig)) {
            return false;
        }
        BubbleIdsConfig bubbleIdsConfig = (BubbleIdsConfig) obj;
        return this.get == bubbleIdsConfig.get && this.take == bubbleIdsConfig.take;
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
        int i2 = (((i * 41) + this.get) * 41) + this.take;
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
