package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class TimeLimited extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "timelimited";

    @ProtobufIndex(index = 3)
    public boolean allowExtension;

    @ProtobufIndex(index = 7)
    public long expiredSeconds;

    @ProtobufIndex(index = 1)
    public long expiredTimestamp;

    @NonNull
    @ProtobufIndex(index = 4)
    public String extensionOperator;

    @ProtobufIndex(index = 5)
    public boolean hidden;

    @ProtobufIndex(index = 6)
    public boolean newConversation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String participate;
    public static ProtobufAdapter<TimeLimited> PROTOBUF_ADAPTER = new MessageNanoAdapter<TimeLimited>() { // from class: com.p1.mobile.putong.core.data.TimeLimited.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TimeLimited timeLimited) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, timeLimited.expiredTimestamp);
            String str = timeLimited.participate;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17220b = iM17228j + CodedOutputByteBufferNano.m17220b(3, timeLimited.allowExtension);
            String str2 = timeLimited.extensionOperator;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(5, timeLimited.hidden) + CodedOutputByteBufferNano.m17220b(6, timeLimited.newConversation) + CodedOutputByteBufferNano.m17228j(7, timeLimited.expiredSeconds);
            timeLimited.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TimeLimited parse(nb5 nb5Var) throws IOException {
            TimeLimited timeLimited = new TimeLimited();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (timeLimited.participate == null) {
                        timeLimited.participate = "";
                    }
                    if (timeLimited.extensionOperator != null) {
                        break;
                    }
                    timeLimited.extensionOperator = "";
                    break;
                }
                if (iM158752u == 8) {
                    timeLimited.expiredTimestamp = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    timeLimited.participate = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    timeLimited.allowExtension = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    timeLimited.extensionOperator = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    timeLimited.hidden = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    timeLimited.newConversation = nb5Var.m158738g();
                } else {
                    if (iM158752u != 56) {
                        if (timeLimited.participate == null) {
                            timeLimited.participate = "";
                        }
                        if (timeLimited.extensionOperator != null) {
                            break;
                        }
                        timeLimited.extensionOperator = "";
                        return timeLimited;
                    }
                    timeLimited.expiredSeconds = nb5Var.m158742k();
                }
            }
            return timeLimited;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TimeLimited timeLimited, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, timeLimited.expiredTimestamp);
            String str = timeLimited.participate;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17244A(3, timeLimited.allowExtension);
            String str2 = timeLimited.extensionOperator;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            codedOutputByteBufferNano.m17244A(5, timeLimited.hidden);
            codedOutputByteBufferNano.m17244A(6, timeLimited.newConversation);
            codedOutputByteBufferNano.m17252I(7, timeLimited.expiredSeconds);
        }
    };
    public static JsonAdapter<TimeLimited> JSON_ADAPTER = new ObjectJsonAdapter<TimeLimited>() { // from class: com.p1.mobile.putong.core.data.TimeLimited.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TimeLimited.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TimeLimited newInstance() {
            return new TimeLimited();
        }

        public boolean parseField(TimeLimited timeLimited, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hidden":
                    timeLimited.hidden = jsonParser.getValueAsBoolean();
                    return true;
                case "newConversation":
                    timeLimited.newConversation = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTimestamp":
                    timeLimited.expiredTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "allowExtension":
                    timeLimited.allowExtension = jsonParser.getValueAsBoolean();
                    return true;
                case "extensionOperator":
                    timeLimited.extensionOperator = jsonParser.getValueAsString();
                    return true;
                case "expiredSeconds":
                    timeLimited.expiredSeconds = jsonParser.getValueAsLong();
                    return true;
                case "participate":
                    timeLimited.participate = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TimeLimited timeLimited, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hidden":
                case "newConversation":
                case "expiredTimestamp":
                case "allowExtension":
                case "extensionOperator":
                case "expiredSeconds":
                case "participate":
                    return true;
                default:
                    return super.parseFieldCheck(timeLimited, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TimeLimited timeLimited, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiredTimestamp", timeLimited.expiredTimestamp);
            String str = timeLimited.participate;
            if (str != null) {
                jsonGenerator.writeStringField("participate", str);
            }
            jsonGenerator.writeBooleanField("allowExtension", timeLimited.allowExtension);
            String str2 = timeLimited.extensionOperator;
            if (str2 != null) {
                jsonGenerator.writeStringField("extensionOperator", str2);
            }
            jsonGenerator.writeBooleanField("hidden", timeLimited.hidden);
            jsonGenerator.writeBooleanField(GreetingResult.RESULT_CREATE_CONVERSATION, timeLimited.newConversation);
            jsonGenerator.writeNumberField("expiredSeconds", timeLimited.expiredSeconds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TimeLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TimeLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TimeLimited new_() {
        TimeLimited timeLimited = new TimeLimited();
        timeLimited.nullCheck();
        return timeLimited;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TimeLimited mo223809clone() {
        TimeLimited timeLimited = new TimeLimited();
        timeLimited.expiredTimestamp = this.expiredTimestamp;
        timeLimited.participate = this.participate;
        timeLimited.allowExtension = this.allowExtension;
        timeLimited.extensionOperator = this.extensionOperator;
        timeLimited.hidden = this.hidden;
        timeLimited.newConversation = this.newConversation;
        timeLimited.expiredSeconds = this.expiredSeconds;
        return timeLimited;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeLimited)) {
            return false;
        }
        TimeLimited timeLimited = (TimeLimited) obj;
        return this.expiredTimestamp == timeLimited.expiredTimestamp && ValueObject.util_equals(this.participate, timeLimited.participate) && this.allowExtension == timeLimited.allowExtension && ValueObject.util_equals(this.extensionOperator, timeLimited.extensionOperator) && this.hidden == timeLimited.hidden && this.newConversation == timeLimited.newConversation && this.expiredSeconds == timeLimited.expiredSeconds;
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
        long j = this.expiredTimestamp;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.participate;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.allowExtension ? 1231 : 1237)) * 41;
        String str2 = this.extensionOperator;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.hidden ? 1231 : 1237)) * 41;
        int i3 = this.newConversation ? 1231 : 1237;
        long j2 = this.expiredSeconds;
        int i4 = ((iHashCode2 + i3) * 41) + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.participate == null) {
            this.participate = "";
        }
        if (this.extensionOperator == null) {
            this.extensionOperator = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
