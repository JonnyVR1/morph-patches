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
public class QuickChatPartyInvitation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatpartyinvitation";

    @ProtobufIndex(index = 2)
    public int beginHour;

    @ProtobufIndex(index = 3)
    public int endHour;

    @ProtobufIndex(index = 4)
    public boolean invite;

    @NonNull
    @ProtobufIndex(index = 5)
    public QuickChatPartyType partyType;

    @ProtobufIndex(index = 1)
    public int weekDay;
    public static ProtobufAdapter<QuickChatPartyInvitation> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatPartyInvitation>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyInvitation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatPartyInvitation quickChatPartyInvitation) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, quickChatPartyInvitation.weekDay) + CodedOutputByteBufferNano.m17226h(2, quickChatPartyInvitation.beginHour) + CodedOutputByteBufferNano.m17226h(3, quickChatPartyInvitation.endHour) + CodedOutputByteBufferNano.m17220b(4, quickChatPartyInvitation.invite);
            QuickChatPartyType quickChatPartyType = quickChatPartyInvitation.partyType;
            if (quickChatPartyType != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
            quickChatPartyInvitation.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatPartyInvitation parse(nb5 nb5Var) throws IOException {
            QuickChatPartyInvitation quickChatPartyInvitation = new QuickChatPartyInvitation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (quickChatPartyInvitation.partyType != null) {
                        break;
                    }
                    quickChatPartyInvitation.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    quickChatPartyInvitation.weekDay = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    quickChatPartyInvitation.beginHour = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    quickChatPartyInvitation.endHour = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    quickChatPartyInvitation.invite = nb5Var.m158738g();
                } else {
                    if (iM158752u != 42) {
                        if (quickChatPartyInvitation.partyType != null) {
                            break;
                        }
                        quickChatPartyInvitation.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                        return quickChatPartyInvitation;
                    }
                    quickChatPartyInvitation.partyType = (QuickChatPartyType) nb5Var.m158743l(QuickChatPartyType.PROTOBUF_ADAPTER);
                }
            }
            return quickChatPartyInvitation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatPartyInvitation quickChatPartyInvitation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, quickChatPartyInvitation.weekDay);
            codedOutputByteBufferNano.m17250G(2, quickChatPartyInvitation.beginHour);
            codedOutputByteBufferNano.m17250G(3, quickChatPartyInvitation.endHour);
            codedOutputByteBufferNano.m17244A(4, quickChatPartyInvitation.invite);
            QuickChatPartyType quickChatPartyType = quickChatPartyInvitation.partyType;
            if (quickChatPartyType != null) {
                codedOutputByteBufferNano.m17254K(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuickChatPartyInvitation> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatPartyInvitation>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyInvitation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatPartyInvitation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatPartyInvitation newInstance() {
            return new QuickChatPartyInvitation();
        }

        public boolean parseField(QuickChatPartyInvitation quickChatPartyInvitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "partyType":
                    quickChatPartyInvitation.partyType = QuickChatPartyType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "endHour":
                    quickChatPartyInvitation.endHour = jsonParser.getValueAsInt();
                    return true;
                case "invite":
                    quickChatPartyInvitation.invite = jsonParser.getValueAsBoolean();
                    return true;
                case "beginHour":
                    quickChatPartyInvitation.beginHour = jsonParser.getValueAsInt();
                    return true;
                case "weekDay":
                    quickChatPartyInvitation.weekDay = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickChatPartyInvitation quickChatPartyInvitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "partyType":
                case "endHour":
                case "invite":
                case "beginHour":
                case "weekDay":
                    return true;
                default:
                    return super.parseFieldCheck(quickChatPartyInvitation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatPartyInvitation quickChatPartyInvitation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("invite", quickChatPartyInvitation.invite);
            jsonGenerator.writeNumberField("weekDay", quickChatPartyInvitation.weekDay);
            jsonGenerator.writeNumberField("beginHour", quickChatPartyInvitation.beginHour);
            jsonGenerator.writeNumberField("endHour", quickChatPartyInvitation.endHour);
            if (quickChatPartyInvitation.partyType != null) {
                jsonGenerator.writeFieldName("partyType");
                QuickChatPartyType.JSON_ADAPTER.serialize(quickChatPartyInvitation.partyType, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatPartyInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatPartyInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatPartyInvitation new_() {
        QuickChatPartyInvitation quickChatPartyInvitation = new QuickChatPartyInvitation();
        quickChatPartyInvitation.nullCheck();
        return quickChatPartyInvitation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatPartyInvitation mo223809clone() {
        QuickChatPartyInvitation quickChatPartyInvitation = new QuickChatPartyInvitation();
        quickChatPartyInvitation.invite = this.invite;
        quickChatPartyInvitation.weekDay = this.weekDay;
        quickChatPartyInvitation.beginHour = this.beginHour;
        quickChatPartyInvitation.endHour = this.endHour;
        quickChatPartyInvitation.partyType = this.partyType;
        return quickChatPartyInvitation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatPartyInvitation)) {
            return false;
        }
        QuickChatPartyInvitation quickChatPartyInvitation = (QuickChatPartyInvitation) obj;
        return this.invite == quickChatPartyInvitation.invite && this.weekDay == quickChatPartyInvitation.weekDay && this.beginHour == quickChatPartyInvitation.beginHour && this.endHour == quickChatPartyInvitation.endHour && ValueObject.util_equals(this.partyType, quickChatPartyInvitation.partyType);
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
        int i2 = ((((((((i * 41) + (this.invite ? 1231 : 1237)) * 41) + this.weekDay) * 41) + this.beginHour) * 41) + this.endHour) * 41;
        QuickChatPartyType quickChatPartyType = this.partyType;
        int iHashCode = i2 + (quickChatPartyType != null ? quickChatPartyType.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isValueAvailable() {
        int i;
        int i2;
        int i3 = this.weekDay;
        return i3 >= 0 && i3 <= 6 && (i = this.beginHour) >= 0 && i <= 24 && (i2 = this.endHour) >= 0 && i2 <= 24 && i2 > i;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.partyType == null) {
            this.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
