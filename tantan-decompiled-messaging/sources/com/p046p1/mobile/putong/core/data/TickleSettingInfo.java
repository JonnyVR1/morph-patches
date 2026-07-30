package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Careers;
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
public class TickleSettingInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ticklesettinginfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String actor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String receiver;

    @NonNull
    @ProtobufIndex(index = 2)
    public String receiverSuffix;

    @NonNull
    @ProtobufIndex(index = 4)
    public TicklesStatus status;
    public static ProtobufAdapter<TickleSettingInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TickleSettingInfo>() { // from class: com.p1.mobile.putong.core.data.TickleSettingInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TickleSettingInfo tickleSettingInfo) {
            String str = tickleSettingInfo.receiver;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            TicklesStatus ticklesStatus = tickleSettingInfo.status;
            if (ticklesStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, ticklesStatus, TicklesStatus.PROTOBUF_ADAPTER);
            }
            tickleSettingInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TickleSettingInfo parse(nb5 nb5Var) throws IOException {
            TickleSettingInfo tickleSettingInfo = new TickleSettingInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    tickleSettingInfo.receiver = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    tickleSettingInfo.receiverSuffix = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    tickleSettingInfo.actor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    tickleSettingInfo.status = (TicklesStatus) nb5Var.m158743l(TicklesStatus.PROTOBUF_ADAPTER);
                }
            }
            return tickleSettingInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TickleSettingInfo tickleSettingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tickleSettingInfo.receiver;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            TicklesStatus ticklesStatus = tickleSettingInfo.status;
            if (ticklesStatus != null) {
                codedOutputByteBufferNano.m17254K(4, ticklesStatus, TicklesStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TickleSettingInfo> JSON_ADAPTER = new ObjectJsonAdapter<TickleSettingInfo>() { // from class: com.p1.mobile.putong.core.data.TickleSettingInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TickleSettingInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TickleSettingInfo newInstance() {
            return new TickleSettingInfo();
        }

        public boolean parseField(TickleSettingInfo tickleSettingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    tickleSettingInfo.status = TicklesStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TickleSettingInfo tickleSettingInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = tickleSettingInfo.receiver;
            if (str != null) {
                jsonGenerator.writeStringField("receiver", str);
            }
            String str2 = tickleSettingInfo.receiverSuffix;
            if (str2 != null) {
                jsonGenerator.writeStringField("receiverSuffix", str2);
            }
            String str3 = tickleSettingInfo.actor;
            if (str3 != null) {
                jsonGenerator.writeStringField(Careers.actor, str3);
            }
            if (tickleSettingInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                TicklesStatus.JSON_ADAPTER.serialize(tickleSettingInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TickleSettingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TickleSettingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TickleSettingInfo new_() {
        TickleSettingInfo tickleSettingInfo = new TickleSettingInfo();
        tickleSettingInfo.nullCheck();
        return tickleSettingInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TickleSettingInfo mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
