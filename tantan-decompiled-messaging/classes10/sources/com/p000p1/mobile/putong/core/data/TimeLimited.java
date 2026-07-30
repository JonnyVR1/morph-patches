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
public class TimeLimited extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "timelimited";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean allowExtension;

    @ProtobufIndex(index = 7)
    public long expiredSeconds;

    @ProtobufIndex(index = 1)
    public long expiredTimestamp;

    @NonNull
    @ProtobufIndex(index = 4)
    public String extensionOperator;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean hidden;

    @ProtobufIndex(index = 6)
    public boolean newConversation;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String participate;
    public static ProtobufAdapter<TimeLimited> PROTOBUF_ADAPTER = new MessageNanoAdapter<TimeLimited>() { // from class: com.p1.mobile.putong.core.data.TimeLimited.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TimeLimited timeLimited) {
            int iJ = CodedOutputByteBufferNano.j(1, timeLimited.expiredTimestamp);
            String str = timeLimited.participate;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(3, timeLimited.allowExtension);
            String str2 = timeLimited.extensionOperator;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(4, str2);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(5, timeLimited.hidden) + CodedOutputByteBufferNano.b(6, timeLimited.newConversation) + CodedOutputByteBufferNano.j(7, timeLimited.expiredSeconds);
            ((MessageNano) timeLimited).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TimeLimited m16008parse(nb5 nb5Var) throws IOException {
            TimeLimited timeLimited = new TimeLimited();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (timeLimited.participate == null) {
                        timeLimited.participate = "";
                    }
                    if (timeLimited.extensionOperator != null) {
                        break;
                    }
                    timeLimited.extensionOperator = "";
                    break;
                }
                if (iU == 8) {
                    timeLimited.expiredTimestamp = nb5Var.k();
                } else if (iU == 18) {
                    timeLimited.participate = nb5Var.s();
                } else if (iU == 24) {
                    timeLimited.allowExtension = nb5Var.g();
                } else if (iU == 34) {
                    timeLimited.extensionOperator = nb5Var.s();
                } else if (iU == 40) {
                    timeLimited.hidden = nb5Var.g();
                } else if (iU == 48) {
                    timeLimited.newConversation = nb5Var.g();
                } else {
                    if (iU != 56) {
                        if (timeLimited.participate == null) {
                            timeLimited.participate = "";
                        }
                        if (timeLimited.extensionOperator != null) {
                            break;
                        }
                        timeLimited.extensionOperator = "";
                        return timeLimited;
                    }
                    timeLimited.expiredSeconds = nb5Var.k();
                }
            }
            return timeLimited;
        }

        public void serialize(TimeLimited timeLimited, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, timeLimited.expiredTimestamp);
            String str = timeLimited.participate;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.A(3, timeLimited.allowExtension);
            String str2 = timeLimited.extensionOperator;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.A(5, timeLimited.hidden);
            codedOutputByteBufferNano.A(6, timeLimited.newConversation);
            codedOutputByteBufferNano.I(7, timeLimited.expiredSeconds);
        }
    };
    public static JsonAdapter<TimeLimited> JSON_ADAPTER = new ObjectJsonAdapter<TimeLimited>() { // from class: com.p1.mobile.putong.core.data.TimeLimited.2
        public Class getDataClass() {
            return TimeLimited.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TimeLimited m16009newInstance() {
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
            jsonGenerator.writeBooleanField(MyVisitorsShowType.hidden, timeLimited.hidden);
            jsonGenerator.writeBooleanField(GreetingResult.RESULT_CREATE_CONVERSATION, timeLimited.newConversation);
            jsonGenerator.writeNumberField("expiredSeconds", timeLimited.expiredSeconds);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TimeLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TimeLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TimeLimited new_() {
        TimeLimited timeLimited = new TimeLimited();
        timeLimited.nullCheck();
        return timeLimited;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TimeLimited m16007clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.participate == null) {
            this.participate = "";
        }
        if (this.extensionOperator == null) {
            this.extensionOperator = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
