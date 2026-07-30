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
public class QuickChatPartyInvitation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatpartyinvitation";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int beginHour;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int endHour;

    @ProtobufIndex(index = 4)
    public boolean invite;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public QuickChatPartyType partyType;

    @ProtobufIndex(index = 1)
    public int weekDay;
    public static ProtobufAdapter<QuickChatPartyInvitation> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatPartyInvitation>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyInvitation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatPartyInvitation quickChatPartyInvitation) {
            int iH = CodedOutputByteBufferNano.h(1, quickChatPartyInvitation.weekDay) + CodedOutputByteBufferNano.h(2, quickChatPartyInvitation.beginHour) + CodedOutputByteBufferNano.h(3, quickChatPartyInvitation.endHour) + CodedOutputByteBufferNano.b(4, quickChatPartyInvitation.invite);
            QuickChatPartyType quickChatPartyType = quickChatPartyInvitation.partyType;
            if (quickChatPartyType != null) {
                iH += CodedOutputByteBufferNano.l(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) quickChatPartyInvitation).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatPartyInvitation m15183parse(nb5 nb5Var) throws IOException {
            QuickChatPartyInvitation quickChatPartyInvitation = new QuickChatPartyInvitation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickChatPartyInvitation.partyType != null) {
                        break;
                    }
                    quickChatPartyInvitation.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    quickChatPartyInvitation.weekDay = nb5Var.j();
                } else if (iU == 16) {
                    quickChatPartyInvitation.beginHour = nb5Var.j();
                } else if (iU == 24) {
                    quickChatPartyInvitation.endHour = nb5Var.j();
                } else if (iU == 32) {
                    quickChatPartyInvitation.invite = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (quickChatPartyInvitation.partyType != null) {
                            break;
                        }
                        quickChatPartyInvitation.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                        return quickChatPartyInvitation;
                    }
                    quickChatPartyInvitation.partyType = (QuickChatPartyType) nb5Var.l(QuickChatPartyType.PROTOBUF_ADAPTER);
                }
            }
            return quickChatPartyInvitation;
        }

        public void serialize(QuickChatPartyInvitation quickChatPartyInvitation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, quickChatPartyInvitation.weekDay);
            codedOutputByteBufferNano.G(2, quickChatPartyInvitation.beginHour);
            codedOutputByteBufferNano.G(3, quickChatPartyInvitation.endHour);
            codedOutputByteBufferNano.A(4, quickChatPartyInvitation.invite);
            QuickChatPartyType quickChatPartyType = quickChatPartyInvitation.partyType;
            if (quickChatPartyType != null) {
                codedOutputByteBufferNano.K(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuickChatPartyInvitation> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatPartyInvitation>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyInvitation.2
        public Class getDataClass() {
            return QuickChatPartyInvitation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatPartyInvitation m15184newInstance() {
            return new QuickChatPartyInvitation();
        }

        public boolean parseField(QuickChatPartyInvitation quickChatPartyInvitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "partyType":
                    quickChatPartyInvitation.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatPartyInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatPartyInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatPartyInvitation new_() {
        QuickChatPartyInvitation quickChatPartyInvitation = new QuickChatPartyInvitation();
        quickChatPartyInvitation.nullCheck();
        return quickChatPartyInvitation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatPartyInvitation m15182clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((i * 41) + (this.invite ? 1231 : 1237)) * 41) + this.weekDay) * 41) + this.beginHour) * 41) + this.endHour) * 41;
        QuickChatPartyType quickChatPartyType = this.partyType;
        int iHashCode = i2 + (quickChatPartyType != null ? quickChatPartyType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isValueAvailable() {
        int i;
        int i2;
        int i3 = this.weekDay;
        return i3 >= 0 && i3 <= 6 && (i = this.beginHour) >= 0 && i <= 24 && (i2 = this.endHour) >= 0 && i2 <= 24 && i2 > i;
    }

    public void nullCheck() {
        if (this.partyType == null) {
            this.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
