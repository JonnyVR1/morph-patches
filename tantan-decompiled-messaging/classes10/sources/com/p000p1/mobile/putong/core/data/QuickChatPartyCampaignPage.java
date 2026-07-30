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
public class QuickChatPartyCampaignPage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatpartycampaignpage";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int beginHour;

    @ProtobufIndex(index = 4)
    public int endHour;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public QuickChatPartyType partyType;

    @ProtobufIndex(index = 1)
    public boolean show;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int weekDay;
    public static ProtobufAdapter<QuickChatPartyCampaignPage> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatPartyCampaignPage>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
            int iB = CodedOutputByteBufferNano.b(1, quickChatPartyCampaignPage.show) + CodedOutputByteBufferNano.h(2, quickChatPartyCampaignPage.weekDay) + CodedOutputByteBufferNano.h(3, quickChatPartyCampaignPage.beginHour) + CodedOutputByteBufferNano.h(4, quickChatPartyCampaignPage.endHour);
            QuickChatPartyType quickChatPartyType = quickChatPartyCampaignPage.partyType;
            if (quickChatPartyType != null) {
                iB += CodedOutputByteBufferNano.l(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) quickChatPartyCampaignPage).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatPartyCampaignPage m15179parse(nb5 nb5Var) throws IOException {
            QuickChatPartyCampaignPage quickChatPartyCampaignPage = new QuickChatPartyCampaignPage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickChatPartyCampaignPage.partyType != null) {
                        break;
                    }
                    quickChatPartyCampaignPage.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    quickChatPartyCampaignPage.show = nb5Var.g();
                } else if (iU == 16) {
                    quickChatPartyCampaignPage.weekDay = nb5Var.j();
                } else if (iU == 24) {
                    quickChatPartyCampaignPage.beginHour = nb5Var.j();
                } else if (iU == 32) {
                    quickChatPartyCampaignPage.endHour = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (quickChatPartyCampaignPage.partyType != null) {
                            break;
                        }
                        quickChatPartyCampaignPage.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                        return quickChatPartyCampaignPage;
                    }
                    quickChatPartyCampaignPage.partyType = (QuickChatPartyType) nb5Var.l(QuickChatPartyType.PROTOBUF_ADAPTER);
                }
            }
            return quickChatPartyCampaignPage;
        }

        public void serialize(QuickChatPartyCampaignPage quickChatPartyCampaignPage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, quickChatPartyCampaignPage.show);
            codedOutputByteBufferNano.G(2, quickChatPartyCampaignPage.weekDay);
            codedOutputByteBufferNano.G(3, quickChatPartyCampaignPage.beginHour);
            codedOutputByteBufferNano.G(4, quickChatPartyCampaignPage.endHour);
            QuickChatPartyType quickChatPartyType = quickChatPartyCampaignPage.partyType;
            if (quickChatPartyType != null) {
                codedOutputByteBufferNano.K(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuickChatPartyCampaignPage> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatPartyCampaignPage>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage.2
        public Class getDataClass() {
            return QuickChatPartyCampaignPage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatPartyCampaignPage m15180newInstance() {
            return new QuickChatPartyCampaignPage();
        }

        public boolean parseField(QuickChatPartyCampaignPage quickChatPartyCampaignPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "partyType":
                    quickChatPartyCampaignPage.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "endHour":
                    quickChatPartyCampaignPage.endHour = jsonParser.getValueAsInt();
                    return true;
                case "beginHour":
                    quickChatPartyCampaignPage.beginHour = jsonParser.getValueAsInt();
                    return true;
                case "show":
                    quickChatPartyCampaignPage.show = jsonParser.getValueAsBoolean();
                    return true;
                case "weekDay":
                    quickChatPartyCampaignPage.weekDay = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickChatPartyCampaignPage quickChatPartyCampaignPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "partyType":
                case "endHour":
                case "beginHour":
                case "show":
                case "weekDay":
                    return true;
                default:
                    return super.parseFieldCheck(quickChatPartyCampaignPage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuickChatPartyCampaignPage quickChatPartyCampaignPage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", quickChatPartyCampaignPage.show);
            jsonGenerator.writeNumberField("weekDay", quickChatPartyCampaignPage.weekDay);
            jsonGenerator.writeNumberField("beginHour", quickChatPartyCampaignPage.beginHour);
            jsonGenerator.writeNumberField("endHour", quickChatPartyCampaignPage.endHour);
            if (quickChatPartyCampaignPage.partyType != null) {
                jsonGenerator.writeFieldName("partyType");
                QuickChatPartyType.JSON_ADAPTER.serialize(quickChatPartyCampaignPage.partyType, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatPartyCampaignPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatPartyCampaignPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatPartyCampaignPage new_() {
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = new QuickChatPartyCampaignPage();
        quickChatPartyCampaignPage.nullCheck();
        return quickChatPartyCampaignPage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatPartyCampaignPage m15178clone() {
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = new QuickChatPartyCampaignPage();
        quickChatPartyCampaignPage.show = this.show;
        quickChatPartyCampaignPage.weekDay = this.weekDay;
        quickChatPartyCampaignPage.beginHour = this.beginHour;
        quickChatPartyCampaignPage.endHour = this.endHour;
        quickChatPartyCampaignPage.partyType = this.partyType;
        return quickChatPartyCampaignPage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatPartyCampaignPage)) {
            return false;
        }
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = (QuickChatPartyCampaignPage) obj;
        return this.show == quickChatPartyCampaignPage.show && this.weekDay == quickChatPartyCampaignPage.weekDay && this.beginHour == quickChatPartyCampaignPage.beginHour && this.endHour == quickChatPartyCampaignPage.endHour && ValueObject.util_equals(this.partyType, quickChatPartyCampaignPage.partyType);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((i * 41) + (this.show ? 1231 : 1237)) * 41) + this.weekDay) * 41) + this.beginHour) * 41) + this.endHour) * 41;
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
