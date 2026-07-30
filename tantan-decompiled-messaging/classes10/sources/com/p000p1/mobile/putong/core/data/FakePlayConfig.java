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
public class FakePlayConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakeplayconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean enable;

    @ProtobufIndex(index = 1)
    public int right_swipe_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int total_swipe_limit;
    public static ProtobufAdapter<FakePlayConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakePlayConfig>() { // from class: com.p1.mobile.putong.core.data.FakePlayConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakePlayConfig fakePlayConfig) {
            int iH = CodedOutputByteBufferNano.h(1, fakePlayConfig.right_swipe_limit) + CodedOutputByteBufferNano.h(2, fakePlayConfig.total_swipe_limit) + CodedOutputByteBufferNano.b(3, fakePlayConfig.enable);
            ((MessageNano) fakePlayConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakePlayConfig m12721parse(nb5 nb5Var) throws IOException {
            FakePlayConfig fakePlayConfig = new FakePlayConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    fakePlayConfig.right_swipe_limit = nb5Var.j();
                } else if (iU == 16) {
                    fakePlayConfig.total_swipe_limit = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return fakePlayConfig;
                    }
                    fakePlayConfig.enable = nb5Var.g();
                }
            }
        }

        public void serialize(FakePlayConfig fakePlayConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, fakePlayConfig.right_swipe_limit);
            codedOutputByteBufferNano.G(2, fakePlayConfig.total_swipe_limit);
            codedOutputByteBufferNano.A(3, fakePlayConfig.enable);
        }
    };
    public static JsonAdapter<FakePlayConfig> JSON_ADAPTER = new ObjectJsonAdapter<FakePlayConfig>() { // from class: com.p1.mobile.putong.core.data.FakePlayConfig.2
        public Class getDataClass() {
            return FakePlayConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakePlayConfig m12722newInstance() {
            return new FakePlayConfig();
        }

        public boolean parseField(FakePlayConfig fakePlayConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "right_swipe_limit":
                    fakePlayConfig.right_swipe_limit = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    fakePlayConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "total_swipe_limit":
                    fakePlayConfig.total_swipe_limit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakePlayConfig fakePlayConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "right_swipe_limit":
                case "enable":
                case "total_swipe_limit":
                    return true;
                default:
                    return super.parseFieldCheck(fakePlayConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FakePlayConfig fakePlayConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("right_swipe_limit", fakePlayConfig.right_swipe_limit);
            jsonGenerator.writeNumberField("total_swipe_limit", fakePlayConfig.total_swipe_limit);
            jsonGenerator.writeBooleanField("enable", fakePlayConfig.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakePlayConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakePlayConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakePlayConfig new_() {
        FakePlayConfig fakePlayConfig = new FakePlayConfig();
        fakePlayConfig.nullCheck();
        return fakePlayConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakePlayConfig m12720clone() {
        FakePlayConfig fakePlayConfig = new FakePlayConfig();
        fakePlayConfig.right_swipe_limit = this.right_swipe_limit;
        fakePlayConfig.total_swipe_limit = this.total_swipe_limit;
        fakePlayConfig.enable = this.enable;
        return fakePlayConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakePlayConfig)) {
            return false;
        }
        FakePlayConfig fakePlayConfig = (FakePlayConfig) obj;
        return this.right_swipe_limit == fakePlayConfig.right_swipe_limit && this.total_swipe_limit == fakePlayConfig.total_swipe_limit && this.enable == fakePlayConfig.enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.right_swipe_limit) * 41) + this.total_swipe_limit) * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
