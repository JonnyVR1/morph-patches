package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AssetsTbh extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "assetstbh";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int afterSwipes;

    @ProtobufIndex(index = 1)
    public long frequency;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int maxIgnoreTimes;
    public static ProtobufAdapter<AssetsTbh> PROTOBUF_ADAPTER = new MessageNanoAdapter<AssetsTbh>() { // from class: com.p1.mobile.putong.core.data.AssetsTbh.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AssetsTbh assetsTbh) {
            int iJ = CodedOutputByteBufferNano.j(1, assetsTbh.frequency) + CodedOutputByteBufferNano.h(2, assetsTbh.afterSwipes) + CodedOutputByteBufferNano.h(3, assetsTbh.maxIgnoreTimes);
            ((MessageNano) assetsTbh).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AssetsTbh m11653parse(nb5 nb5Var) throws IOException {
            AssetsTbh assetsTbh = new AssetsTbh();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    assetsTbh.frequency = nb5Var.k();
                } else if (iU == 16) {
                    assetsTbh.afterSwipes = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return assetsTbh;
                    }
                    assetsTbh.maxIgnoreTimes = nb5Var.j();
                }
            }
        }

        public void serialize(AssetsTbh assetsTbh, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, assetsTbh.frequency);
            codedOutputByteBufferNano.G(2, assetsTbh.afterSwipes);
            codedOutputByteBufferNano.G(3, assetsTbh.maxIgnoreTimes);
        }
    };
    public static JsonAdapter<AssetsTbh> JSON_ADAPTER = new ObjectJsonAdapter<AssetsTbh>() { // from class: com.p1.mobile.putong.core.data.AssetsTbh.2
        public Class getDataClass() {
            return AssetsTbh.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AssetsTbh m11654newInstance() {
            return new AssetsTbh();
        }

        public boolean parseField(AssetsTbh assetsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maxIgnoreTimes":
                    assetsTbh.maxIgnoreTimes = jsonParser.getValueAsInt();
                    return true;
                case "frequency":
                    assetsTbh.frequency = jsonParser.getValueAsLong();
                    return true;
                case "afterSwipes":
                    assetsTbh.afterSwipes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AssetsTbh assetsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maxIgnoreTimes":
                case "frequency":
                case "afterSwipes":
                    return true;
                default:
                    return super.parseFieldCheck(assetsTbh, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AssetsTbh assetsTbh, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("frequency", assetsTbh.frequency);
            jsonGenerator.writeNumberField("afterSwipes", assetsTbh.afterSwipes);
            jsonGenerator.writeNumberField("maxIgnoreTimes", assetsTbh.maxIgnoreTimes);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AssetsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AssetsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AssetsTbh new_() {
        AssetsTbh assetsTbh = new AssetsTbh();
        assetsTbh.nullCheck();
        return assetsTbh;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AssetsTbh m11652clone() {
        AssetsTbh assetsTbh = new AssetsTbh();
        assetsTbh.frequency = this.frequency;
        assetsTbh.afterSwipes = this.afterSwipes;
        assetsTbh.maxIgnoreTimes = this.maxIgnoreTimes;
        return assetsTbh;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetsTbh)) {
            return false;
        }
        AssetsTbh assetsTbh = (AssetsTbh) obj;
        return this.frequency == assetsTbh.frequency && this.afterSwipes == assetsTbh.afterSwipes && this.maxIgnoreTimes == assetsTbh.maxIgnoreTimes;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.frequency;
        int i2 = (((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.afterSwipes) * 41) + this.maxIgnoreTimes;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
