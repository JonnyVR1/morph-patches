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
public class BuzzDeviceInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzdeviceinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int memorySize;

    @ProtobufIndex(index = 1)
    public int screenHeight;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int screenWidth;
    public static ProtobufAdapter<BuzzDeviceInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzDeviceInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzDeviceInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuzzDeviceInfo buzzDeviceInfo) {
            int iH = CodedOutputByteBufferNano.h(1, buzzDeviceInfo.screenHeight) + CodedOutputByteBufferNano.h(2, buzzDeviceInfo.screenWidth) + CodedOutputByteBufferNano.h(3, buzzDeviceInfo.memorySize);
            ((MessageNano) buzzDeviceInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuzzDeviceInfo m11831parse(nb5 nb5Var) throws IOException {
            BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    buzzDeviceInfo.screenHeight = nb5Var.j();
                } else if (iU == 16) {
                    buzzDeviceInfo.screenWidth = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return buzzDeviceInfo;
                    }
                    buzzDeviceInfo.memorySize = nb5Var.j();
                }
            }
        }

        public void serialize(BuzzDeviceInfo buzzDeviceInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, buzzDeviceInfo.screenHeight);
            codedOutputByteBufferNano.G(2, buzzDeviceInfo.screenWidth);
            codedOutputByteBufferNano.G(3, buzzDeviceInfo.memorySize);
        }
    };
    public static JsonAdapter<BuzzDeviceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BuzzDeviceInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzDeviceInfo.2
        public Class getDataClass() {
            return BuzzDeviceInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BuzzDeviceInfo m11832newInstance() {
            return new BuzzDeviceInfo();
        }

        public boolean parseField(BuzzDeviceInfo buzzDeviceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "screenHeight":
                    buzzDeviceInfo.screenHeight = jsonParser.getValueAsInt();
                    return true;
                case "screenWidth":
                    buzzDeviceInfo.screenWidth = jsonParser.getValueAsInt();
                    return true;
                case "memorySize":
                    buzzDeviceInfo.memorySize = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BuzzDeviceInfo buzzDeviceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "screenHeight":
                case "screenWidth":
                case "memorySize":
                    return true;
                default:
                    return super.parseFieldCheck(buzzDeviceInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BuzzDeviceInfo buzzDeviceInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("screenHeight", buzzDeviceInfo.screenHeight);
            jsonGenerator.writeNumberField("screenWidth", buzzDeviceInfo.screenWidth);
            jsonGenerator.writeNumberField("memorySize", buzzDeviceInfo.memorySize);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzDeviceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzDeviceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzDeviceInfo new_() {
        BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
        buzzDeviceInfo.nullCheck();
        return buzzDeviceInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuzzDeviceInfo m11830clone() {
        BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
        buzzDeviceInfo.screenHeight = this.screenHeight;
        buzzDeviceInfo.screenWidth = this.screenWidth;
        buzzDeviceInfo.memorySize = this.memorySize;
        return buzzDeviceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzDeviceInfo)) {
            return false;
        }
        BuzzDeviceInfo buzzDeviceInfo = (BuzzDeviceInfo) obj;
        return this.screenHeight == buzzDeviceInfo.screenHeight && this.screenWidth == buzzDeviceInfo.screenWidth && this.memorySize == buzzDeviceInfo.memorySize;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.screenHeight) * 41) + this.screenWidth) * 41) + this.memorySize;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
