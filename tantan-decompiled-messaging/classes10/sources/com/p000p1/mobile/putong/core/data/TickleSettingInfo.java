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
public class TickleSettingInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ticklesettinginfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String actor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String receiver;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String receiverSuffix;

    @NonNull
    @ProtobufIndex(index = 4)
    public TicklesStatus status;
    public static ProtobufAdapter<TickleSettingInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TickleSettingInfo>() { // from class: com.p1.mobile.putong.core.data.TickleSettingInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TickleSettingInfo tickleSettingInfo) {
            String str = tickleSettingInfo.receiver;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            TicklesStatus ticklesStatus = tickleSettingInfo.status;
            if (ticklesStatus != null) {
                iO += CodedOutputByteBufferNano.l(4, ticklesStatus, TicklesStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) tickleSettingInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TickleSettingInfo m16002parse(nb5 nb5Var) throws IOException {
            TickleSettingInfo tickleSettingInfo = new TickleSettingInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tickleSettingInfo.receiver == null) {
                        tickleSettingInfo.receiver = "";
                    }
                    if (tickleSettingInfo.receiverSuffix == null) {
                        tickleSettingInfo.receiverSuffix = "";
                    }
                    if (tickleSettingInfo.actor == null) {
                        tickleSettingInfo.actor = "";
                    }
                    if (tickleSettingInfo.status != null) {
                        break;
                    }
                    tickleSettingInfo.status = (TicklesStatus) TicklesStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    tickleSettingInfo.receiver = nb5Var.s();
                } else if (iU == 18) {
                    tickleSettingInfo.receiverSuffix = nb5Var.s();
                } else if (iU == 26) {
                    tickleSettingInfo.actor = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (tickleSettingInfo.receiver == null) {
                            tickleSettingInfo.receiver = "";
                        }
                        if (tickleSettingInfo.receiverSuffix == null) {
                            tickleSettingInfo.receiverSuffix = "";
                        }
                        if (tickleSettingInfo.actor == null) {
                            tickleSettingInfo.actor = "";
                        }
                        if (tickleSettingInfo.status != null) {
                            break;
                        }
                        tickleSettingInfo.status = (TicklesStatus) TicklesStatus.JSON_ADAPTER.defaultEnum();
                        return tickleSettingInfo;
                    }
                    tickleSettingInfo.status = (TicklesStatus) nb5Var.l(TicklesStatus.PROTOBUF_ADAPTER);
                }
            }
            return tickleSettingInfo;
        }

        public void serialize(TickleSettingInfo tickleSettingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tickleSettingInfo.receiver;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            TicklesStatus ticklesStatus = tickleSettingInfo.status;
            if (ticklesStatus != null) {
                codedOutputByteBufferNano.K(4, ticklesStatus, TicklesStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TickleSettingInfo> JSON_ADAPTER = new ObjectJsonAdapter<TickleSettingInfo>() { // from class: com.p1.mobile.putong.core.data.TickleSettingInfo.2
        public Class getDataClass() {
            return TickleSettingInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TickleSettingInfo m16003newInstance() {
            return new TickleSettingInfo();
        }

        public boolean parseField(TickleSettingInfo tickleSettingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    tickleSettingInfo.status = (TicklesStatus) TicklesStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "receiver":
                    tickleSettingInfo.receiver = jsonParser.getValueAsString();
                    return true;
                case "actor":
                    tickleSettingInfo.actor = jsonParser.getValueAsString();
                    return true;
                case "receiverSuffix":
                    tickleSettingInfo.receiverSuffix = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TickleSettingInfo tickleSettingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "receiver":
                case "actor":
                case "receiverSuffix":
                    return true;
                default:
                    return super.parseFieldCheck(tickleSettingInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TickleSettingInfo tickleSettingInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = tickleSettingInfo.receiver;
            if (str != null) {
                jsonGenerator.writeStringField(Shows.receiver, str);
            }
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                jsonGenerator.writeStringField("receiverSuffix", str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                jsonGenerator.writeStringField("actor", str3);
            }
            if (tickleSettingInfo.status != null) {
                jsonGenerator.writeFieldName("status");
                TicklesStatus.JSON_ADAPTER.serialize(tickleSettingInfo.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TickleSettingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TickleSettingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TickleSettingInfo new_() {
        TickleSettingInfo tickleSettingInfo = new TickleSettingInfo();
        tickleSettingInfo.nullCheck();
        return tickleSettingInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TickleSettingInfo m16001clone() {
        TickleSettingInfo tickleSettingInfo = new TickleSettingInfo();
        tickleSettingInfo.receiver = this.receiver;
        tickleSettingInfo.receiverSuffix = this.receiverSuffix;
        tickleSettingInfo.actor = this.actor;
        tickleSettingInfo.status = this.status;
        return tickleSettingInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TickleSettingInfo)) {
            return false;
        }
        TickleSettingInfo tickleSettingInfo = (TickleSettingInfo) obj;
        return ValueObject.util_equals(this.receiver, tickleSettingInfo.receiver) && ValueObject.util_equals(this.receiverSuffix, tickleSettingInfo.receiverSuffix) && ValueObject.util_equals(this.actor, tickleSettingInfo.actor) && ValueObject.util_equals(this.status, tickleSettingInfo.status);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.receiver;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.receiverSuffix;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.actor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        TicklesStatus ticklesStatus = this.status;
        int iHashCode4 = iHashCode3 + (ticklesStatus != null ? ticklesStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.receiver == null) {
            this.receiver = "";
        }
        if (this.receiverSuffix == null) {
            this.receiverSuffix = "";
        }
        if (this.actor == null) {
            this.actor = "";
        }
        if (this.status == null) {
            this.status = (TicklesStatus) TicklesStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
