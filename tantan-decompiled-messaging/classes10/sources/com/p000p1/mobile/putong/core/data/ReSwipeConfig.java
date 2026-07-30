package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ReSwipeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public String expType;

    @ProtobufIndex(index = 1)
    public int maxLabelCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int showHours;
    public static ProtobufAdapter<ReSwipeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReSwipeConfig reSwipeConfig) {
            int iH = CodedOutputByteBufferNano.h(1, reSwipeConfig.maxLabelCount) + CodedOutputByteBufferNano.h(2, reSwipeConfig.showHours) + CodedOutputByteBufferNano.b(3, reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            ((MessageNano) reSwipeConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReSwipeConfig m15229parse(nb5 nb5Var) throws IOException {
            ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reSwipeConfig.expType != null) {
                        break;
                    }
                    reSwipeConfig.expType = "";
                    break;
                }
                if (iU == 8) {
                    reSwipeConfig.maxLabelCount = nb5Var.j();
                } else if (iU == 16) {
                    reSwipeConfig.showHours = nb5Var.j();
                } else if (iU == 24) {
                    reSwipeConfig.enable = nb5Var.g();
                } else {
                    if (iU != 34) {
                        if (reSwipeConfig.expType != null) {
                            break;
                        }
                        reSwipeConfig.expType = "";
                        return reSwipeConfig;
                    }
                    reSwipeConfig.expType = nb5Var.s();
                }
            }
            return reSwipeConfig;
        }

        public void serialize(ReSwipeConfig reSwipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, reSwipeConfig.maxLabelCount);
            codedOutputByteBufferNano.G(2, reSwipeConfig.showHours);
            codedOutputByteBufferNano.A(3, reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
        }
    };
    public static JsonAdapter<ReSwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConfig.2
        public Class getDataClass() {
            return ReSwipeConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReSwipeConfig m15230newInstance() {
            return new ReSwipeConfig();
        }

        public boolean parseField(ReSwipeConfig reSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showHours":
                    reSwipeConfig.showHours = jsonParser.getValueAsInt();
                    return true;
                case "expType":
                    reSwipeConfig.expType = jsonParser.getValueAsString();
                    return true;
                case "enable":
                    reSwipeConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "maxLabelCount":
                    reSwipeConfig.maxLabelCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReSwipeConfig reSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showHours":
                case "expType":
                case "enable":
                case "maxLabelCount":
                    return true;
                default:
                    return super.parseFieldCheck(reSwipeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ReSwipeConfig reSwipeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maxLabelCount", reSwipeConfig.maxLabelCount);
            jsonGenerator.writeNumberField("showHours", reSwipeConfig.showHours);
            jsonGenerator.writeBooleanField("enable", reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                jsonGenerator.writeStringField("expType", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConfig new_() {
        ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
        reSwipeConfig.nullCheck();
        return reSwipeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReSwipeConfig m15228clone() {
        ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
        reSwipeConfig.maxLabelCount = this.maxLabelCount;
        reSwipeConfig.showHours = this.showHours;
        reSwipeConfig.enable = this.enable;
        reSwipeConfig.expType = this.expType;
        return reSwipeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReSwipeConfig)) {
            return false;
        }
        ReSwipeConfig reSwipeConfig = (ReSwipeConfig) obj;
        return this.maxLabelCount == reSwipeConfig.maxLabelCount && this.showHours == reSwipeConfig.showHours && this.enable == reSwipeConfig.enable && ValueObject.util_equals(this.expType, reSwipeConfig.expType);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.maxLabelCount) * 41) + this.showHours) * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.expType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.expType == null) {
            this.expType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
