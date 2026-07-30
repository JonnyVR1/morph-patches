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
public class ODiamondVisitorMessageGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondvisitormessageguideconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int conversation_close_intervals;

    @ProtobufIndex(index = 1)
    public int total_limit_daily;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int user_limit_daily;
    public static ProtobufAdapter<ODiamondVisitorMessageGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondVisitorMessageGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, oDiamondVisitorMessageGuideConfig.total_limit_daily) + CodedOutputByteBufferNano.h(2, oDiamondVisitorMessageGuideConfig.user_limit_daily) + CodedOutputByteBufferNano.h(3, oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
            ((MessageNano) oDiamondVisitorMessageGuideConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondVisitorMessageGuideConfig m14621parse(nb5 nb5Var) throws IOException {
            ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    oDiamondVisitorMessageGuideConfig.total_limit_daily = nb5Var.j();
                } else if (iU == 16) {
                    oDiamondVisitorMessageGuideConfig.user_limit_daily = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return oDiamondVisitorMessageGuideConfig;
                    }
                    oDiamondVisitorMessageGuideConfig.conversation_close_intervals = nb5Var.j();
                }
            }
        }

        public void serialize(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, oDiamondVisitorMessageGuideConfig.total_limit_daily);
            codedOutputByteBufferNano.G(2, oDiamondVisitorMessageGuideConfig.user_limit_daily);
            codedOutputByteBufferNano.G(3, oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
        }
    };
    public static JsonAdapter<ODiamondVisitorMessageGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondVisitorMessageGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig.2
        public Class getDataClass() {
            return ODiamondVisitorMessageGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondVisitorMessageGuideConfig m14622newInstance() {
            return new ODiamondVisitorMessageGuideConfig();
        }

        public boolean parseField(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "total_limit_daily":
                    oDiamondVisitorMessageGuideConfig.total_limit_daily = jsonParser.getValueAsInt();
                    return true;
                case "conversation_close_intervals":
                    oDiamondVisitorMessageGuideConfig.conversation_close_intervals = jsonParser.getValueAsInt();
                    return true;
                case "user_limit_daily":
                    oDiamondVisitorMessageGuideConfig.user_limit_daily = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "total_limit_daily":
                case "conversation_close_intervals":
                case "user_limit_daily":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondVisitorMessageGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total_limit_daily", oDiamondVisitorMessageGuideConfig.total_limit_daily);
            jsonGenerator.writeNumberField("user_limit_daily", oDiamondVisitorMessageGuideConfig.user_limit_daily);
            jsonGenerator.writeNumberField("conversation_close_intervals", oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondVisitorMessageGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondVisitorMessageGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondVisitorMessageGuideConfig new_() {
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
        oDiamondVisitorMessageGuideConfig.nullCheck();
        return oDiamondVisitorMessageGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondVisitorMessageGuideConfig m14620clone() {
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
        oDiamondVisitorMessageGuideConfig.total_limit_daily = this.total_limit_daily;
        oDiamondVisitorMessageGuideConfig.user_limit_daily = this.user_limit_daily;
        oDiamondVisitorMessageGuideConfig.conversation_close_intervals = this.conversation_close_intervals;
        return oDiamondVisitorMessageGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondVisitorMessageGuideConfig)) {
            return false;
        }
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = (ODiamondVisitorMessageGuideConfig) obj;
        return this.total_limit_daily == oDiamondVisitorMessageGuideConfig.total_limit_daily && this.user_limit_daily == oDiamondVisitorMessageGuideConfig.user_limit_daily && this.conversation_close_intervals == oDiamondVisitorMessageGuideConfig.conversation_close_intervals;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.total_limit_daily) * 41) + this.user_limit_daily) * 41) + this.conversation_close_intervals;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
