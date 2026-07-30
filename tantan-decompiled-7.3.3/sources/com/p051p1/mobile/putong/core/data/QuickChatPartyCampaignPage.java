package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class QuickChatPartyCampaignPage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatpartycampaignpage";

    @ProtobufIndex(index = 3)
    public int beginHour;

    @ProtobufIndex(index = 4)
    public int endHour;

    @NonNull
    @ProtobufIndex(index = 5)
    public QuickChatPartyType partyType;

    @ProtobufIndex(index = 1)
    public boolean show;

    @ProtobufIndex(index = 2)
    public int weekDay;
    public static ProtobufAdapter<QuickChatPartyCampaignPage> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatPartyCampaignPage>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, quickChatPartyCampaignPage.show) + CodedOutputByteBufferNano.m17281h(2, quickChatPartyCampaignPage.weekDay) + CodedOutputByteBufferNano.m17281h(3, quickChatPartyCampaignPage.beginHour) + CodedOutputByteBufferNano.m17281h(4, quickChatPartyCampaignPage.endHour);
            QuickChatPartyType quickChatPartyType = quickChatPartyCampaignPage.partyType;
            if (quickChatPartyType != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
            quickChatPartyCampaignPage.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatPartyCampaignPage parse(nc5 nc5Var) throws IOException {
            QuickChatPartyCampaignPage quickChatPartyCampaignPage = new QuickChatPartyCampaignPage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (quickChatPartyCampaignPage.partyType != null) {
                        break;
                    }
                    quickChatPartyCampaignPage.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    quickChatPartyCampaignPage.show = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    quickChatPartyCampaignPage.weekDay = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    quickChatPartyCampaignPage.beginHour = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    quickChatPartyCampaignPage.endHour = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (quickChatPartyCampaignPage.partyType != null) {
                            break;
                        }
                        quickChatPartyCampaignPage.partyType = (QuickChatPartyType) QuickChatPartyType.JSON_ADAPTER.defaultEnum();
                        return quickChatPartyCampaignPage;
                    }
                    quickChatPartyCampaignPage.partyType = (QuickChatPartyType) nc5Var.m162488l(QuickChatPartyType.PROTOBUF_ADAPTER);
                }
            }
            return quickChatPartyCampaignPage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatPartyCampaignPage quickChatPartyCampaignPage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, quickChatPartyCampaignPage.show);
            codedOutputByteBufferNano.m17305G(2, quickChatPartyCampaignPage.weekDay);
            codedOutputByteBufferNano.m17305G(3, quickChatPartyCampaignPage.beginHour);
            codedOutputByteBufferNano.m17305G(4, quickChatPartyCampaignPage.endHour);
            QuickChatPartyType quickChatPartyType = quickChatPartyCampaignPage.partyType;
            if (quickChatPartyType != null) {
                codedOutputByteBufferNano.m17309K(5, quickChatPartyType, QuickChatPartyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuickChatPartyCampaignPage> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatPartyCampaignPage>() { // from class: com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatPartyCampaignPage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatPartyCampaignPage newInstance() {
            return new QuickChatPartyCampaignPage();
        }

        public boolean parseField(QuickChatPartyCampaignPage quickChatPartyCampaignPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "partyType":
                    quickChatPartyCampaignPage.partyType = QuickChatPartyType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatPartyCampaignPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatPartyCampaignPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatPartyCampaignPage new_() {
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = new QuickChatPartyCampaignPage();
        quickChatPartyCampaignPage.nullCheck();
        return quickChatPartyCampaignPage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatPartyCampaignPage mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((i * 41) + (this.show ? 1231 : 1237)) * 41) + this.weekDay) * 41) + this.beginHour) * 41) + this.endHour) * 41;
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
