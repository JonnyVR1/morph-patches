package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class QuickchatUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f146id;

    @NonNull
    @ProtobufIndex(index = 6)
    public String otherUserID;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String quickchatType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String rtcChannel;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double rtcChannelWaittingTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String rtcToken;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;

    @ProtobufIndex(index = 4)
    public double waittingExpiredTime;
    public static ProtobufAdapter<QuickchatUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickchatUsers>() { // from class: com.p1.mobile.putong.core.data.QuickchatUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickchatUsers quickchatUsers) {
            String str = quickchatUsers.f146id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iD = iO + CodedOutputByteBufferNano.d(4, quickchatUsers.waittingExpiredTime) + CodedOutputByteBufferNano.d(5, quickchatUsers.rtcChannelWaittingTime);
            String str4 = quickchatUsers.otherUserID;
            if (str4 != null) {
                iD += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = quickchatUsers.rtcChannel;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = quickchatUsers.rtcToken;
            if (str6 != null) {
                iD += CodedOutputByteBufferNano.o(8, str6);
            }
            ((MessageNano) quickchatUsers).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickchatUsers m15195parse(nb5 nb5Var) throws IOException {
            QuickchatUsers quickchatUsers = new QuickchatUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickchatUsers.f146id == null) {
                        quickchatUsers.f146id = "";
                    }
                    if (quickchatUsers.status == null) {
                        quickchatUsers.status = "";
                    }
                    if (quickchatUsers.quickchatType == null) {
                        quickchatUsers.quickchatType = "";
                    }
                    if (quickchatUsers.otherUserID == null) {
                        quickchatUsers.otherUserID = "";
                    }
                    if (quickchatUsers.rtcChannel == null) {
                        quickchatUsers.rtcChannel = "";
                    }
                    if (quickchatUsers.rtcToken != null) {
                        break;
                    }
                    quickchatUsers.rtcToken = "";
                    break;
                }
                if (iU == 10) {
                    quickchatUsers.f146id = nb5Var.s();
                } else if (iU == 18) {
                    quickchatUsers.status = nb5Var.s();
                } else if (iU == 26) {
                    quickchatUsers.quickchatType = nb5Var.s();
                } else if (iU == 33) {
                    quickchatUsers.waittingExpiredTime = nb5Var.h();
                } else if (iU == 41) {
                    quickchatUsers.rtcChannelWaittingTime = nb5Var.h();
                } else if (iU == 50) {
                    quickchatUsers.otherUserID = nb5Var.s();
                } else if (iU == 58) {
                    quickchatUsers.rtcChannel = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (quickchatUsers.f146id == null) {
                            quickchatUsers.f146id = "";
                        }
                        if (quickchatUsers.status == null) {
                            quickchatUsers.status = "";
                        }
                        if (quickchatUsers.quickchatType == null) {
                            quickchatUsers.quickchatType = "";
                        }
                        if (quickchatUsers.otherUserID == null) {
                            quickchatUsers.otherUserID = "";
                        }
                        if (quickchatUsers.rtcChannel == null) {
                            quickchatUsers.rtcChannel = "";
                        }
                        if (quickchatUsers.rtcToken != null) {
                            break;
                        }
                        quickchatUsers.rtcToken = "";
                        return quickchatUsers;
                    }
                    quickchatUsers.rtcToken = nb5Var.s();
                }
            }
            return quickchatUsers;
        }

        public void serialize(QuickchatUsers quickchatUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickchatUsers.f146id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.C(4, quickchatUsers.waittingExpiredTime);
            codedOutputByteBufferNano.C(5, quickchatUsers.rtcChannelWaittingTime);
            String str4 = quickchatUsers.otherUserID;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = quickchatUsers.rtcChannel;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = quickchatUsers.rtcToken;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
        }
    };
    public static JsonAdapter<QuickchatUsers> JSON_ADAPTER = new ObjectJsonAdapter<QuickchatUsers>() { // from class: com.p1.mobile.putong.core.data.QuickchatUsers.2
        public Class getDataClass() {
            return QuickchatUsers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickchatUsers m15196newInstance() {
            return new QuickchatUsers();
        }

        public boolean parseField(QuickchatUsers quickchatUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserID":
                    quickchatUsers.otherUserID = jsonParser.getValueAsString();
                    return true;
                case "rtcChannelWaittingTime":
                    quickchatUsers.rtcChannelWaittingTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "quickchatType":
                    quickchatUsers.quickchatType = jsonParser.getValueAsString();
                    return true;
                case "waittingExpiredTime":
                    quickchatUsers.waittingExpiredTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "rtcChannel":
                    quickchatUsers.rtcChannel = jsonParser.getValueAsString();
                    return true;
                case "status":
                    quickchatUsers.status = jsonParser.getValueAsString();
                    return true;
                case "rtcToken":
                    quickchatUsers.rtcToken = jsonParser.getValueAsString();
                    return true;
                case "id":
                    quickchatUsers.f146id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickchatUsers quickchatUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserID":
                case "rtcChannelWaittingTime":
                case "quickchatType":
                case "waittingExpiredTime":
                case "rtcChannel":
                case "status":
                case "rtcToken":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(quickchatUsers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuickchatUsers quickchatUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = quickchatUsers.f146id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                jsonGenerator.writeStringField("quickchatType", str3);
            }
            jsonGenerator.writeFieldName("waittingExpiredTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(quickchatUsers.waittingExpiredTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("rtcChannelWaittingTime");
            jsonAdapter.serialize(Double.valueOf(quickchatUsers.rtcChannelWaittingTime), jsonGenerator, true);
            String str4 = quickchatUsers.otherUserID;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherUserID", str4);
            }
            String str5 = quickchatUsers.rtcChannel;
            if (str5 != null) {
                jsonGenerator.writeStringField("rtcChannel", str5);
            }
            String str6 = quickchatUsers.rtcToken;
            if (str6 != null) {
                jsonGenerator.writeStringField("rtcToken", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickchatUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickchatUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickchatUsers new_() {
        QuickchatUsers quickchatUsers = new QuickchatUsers();
        quickchatUsers.nullCheck();
        return quickchatUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickchatUsers m15194clone() {
        QuickchatUsers quickchatUsers = new QuickchatUsers();
        quickchatUsers.f146id = this.f146id;
        quickchatUsers.status = this.status;
        quickchatUsers.quickchatType = this.quickchatType;
        quickchatUsers.waittingExpiredTime = this.waittingExpiredTime;
        quickchatUsers.rtcChannelWaittingTime = this.rtcChannelWaittingTime;
        quickchatUsers.otherUserID = this.otherUserID;
        quickchatUsers.rtcChannel = this.rtcChannel;
        quickchatUsers.rtcToken = this.rtcToken;
        return quickchatUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickchatUsers)) {
            return false;
        }
        QuickchatUsers quickchatUsers = (QuickchatUsers) obj;
        return ValueObject.util_equals(this.f146id, quickchatUsers.f146id) && ValueObject.util_equals(this.status, quickchatUsers.status) && ValueObject.util_equals(this.quickchatType, quickchatUsers.quickchatType) && this.waittingExpiredTime == quickchatUsers.waittingExpiredTime && this.rtcChannelWaittingTime == quickchatUsers.rtcChannelWaittingTime && ValueObject.util_equals(this.otherUserID, quickchatUsers.otherUserID) && ValueObject.util_equals(this.rtcChannel, quickchatUsers.rtcChannel) && ValueObject.util_equals(this.rtcToken, quickchatUsers.rtcToken);
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
        String str = this.f146id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.quickchatType;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.waittingExpiredTime);
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.rtcChannelWaittingTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str4 = this.otherUserID;
        int iHashCode4 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.rtcChannel;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.rtcToken;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f146id == null) {
            this.f146id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.quickchatType == null) {
            this.quickchatType = "";
        }
        if (this.otherUserID == null) {
            this.otherUserID = "";
        }
        if (this.rtcChannel == null) {
            this.rtcChannel = "";
        }
        if (this.rtcToken == null) {
            this.rtcToken = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
