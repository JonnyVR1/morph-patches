package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class BuzzDeviceInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzdeviceinfo";

    @ProtobufIndex(index = 3)
    public int memorySize;

    @ProtobufIndex(index = 1)
    public int screenHeight;

    @ProtobufIndex(index = 2)
    public int screenWidth;
    public static ProtobufAdapter<BuzzDeviceInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzDeviceInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzDeviceInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BuzzDeviceInfo buzzDeviceInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, buzzDeviceInfo.screenHeight) + CodedOutputByteBufferNano.m17226h(2, buzzDeviceInfo.screenWidth) + CodedOutputByteBufferNano.m17226h(3, buzzDeviceInfo.memorySize);
            buzzDeviceInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BuzzDeviceInfo parse(nb5 nb5Var) throws IOException {
            BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    buzzDeviceInfo.screenHeight = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    buzzDeviceInfo.screenWidth = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return buzzDeviceInfo;
                    }
                    buzzDeviceInfo.memorySize = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BuzzDeviceInfo buzzDeviceInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, buzzDeviceInfo.screenHeight);
            codedOutputByteBufferNano.m17250G(2, buzzDeviceInfo.screenWidth);
            codedOutputByteBufferNano.m17250G(3, buzzDeviceInfo.memorySize);
        }
    };
    public static JsonAdapter<BuzzDeviceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BuzzDeviceInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzDeviceInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BuzzDeviceInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BuzzDeviceInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuzzDeviceInfo buzzDeviceInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("screenHeight", buzzDeviceInfo.screenHeight);
            jsonGenerator.writeNumberField("screenWidth", buzzDeviceInfo.screenWidth);
            jsonGenerator.writeNumberField("memorySize", buzzDeviceInfo.memorySize);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzDeviceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzDeviceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzDeviceInfo new_() {
        BuzzDeviceInfo buzzDeviceInfo = new BuzzDeviceInfo();
        buzzDeviceInfo.nullCheck();
        return buzzDeviceInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BuzzDeviceInfo mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.screenHeight) * 41) + this.screenWidth) * 41) + this.memorySize;
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
