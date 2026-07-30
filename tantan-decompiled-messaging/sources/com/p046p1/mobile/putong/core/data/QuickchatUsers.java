package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class QuickchatUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20484id;

    @NonNull
    @ProtobufIndex(index = 6)
    public String otherUserID;

    @NonNull
    @ProtobufIndex(index = 3)
    public String quickchatType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String rtcChannel;

    @ProtobufIndex(index = 5)
    public double rtcChannelWaittingTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String rtcToken;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @ProtobufIndex(index = 4)
    public double waittingExpiredTime;
    public static ProtobufAdapter<QuickchatUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickchatUsers>() { // from class: com.p1.mobile.putong.core.data.QuickchatUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickchatUsers quickchatUsers) {
            String str = quickchatUsers.f20484id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(4, quickchatUsers.waittingExpiredTime) + CodedOutputByteBufferNano.m17222d(5, quickchatUsers.rtcChannelWaittingTime);
            String str4 = quickchatUsers.otherUserID;
            if (str4 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            String str5 = quickchatUsers.rtcChannel;
            if (str5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            String str6 = quickchatUsers.rtcToken;
            if (str6 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(8, str6);
            }
            quickchatUsers.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickchatUsers parse(nb5 nb5Var) throws IOException {
            QuickchatUsers quickchatUsers = new QuickchatUsers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (quickchatUsers.f20484id == null) {
                        quickchatUsers.f20484id = "";
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
                if (iM158752u == 10) {
                    quickchatUsers.f20484id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    quickchatUsers.status = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    quickchatUsers.quickchatType = nb5Var.m158750s();
                } else if (iM158752u == 33) {
                    quickchatUsers.waittingExpiredTime = nb5Var.m158739h();
                } else if (iM158752u == 41) {
                    quickchatUsers.rtcChannelWaittingTime = nb5Var.m158739h();
                } else if (iM158752u == 50) {
                    quickchatUsers.otherUserID = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    quickchatUsers.rtcChannel = nb5Var.m158750s();
                } else {
                    if (iM158752u != 66) {
                        if (quickchatUsers.f20484id == null) {
                            quickchatUsers.f20484id = "";
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
                    quickchatUsers.rtcToken = nb5Var.m158750s();
                }
            }
            return quickchatUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickchatUsers quickchatUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickchatUsers.f20484id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17246C(4, quickchatUsers.waittingExpiredTime);
            codedOutputByteBufferNano.m17246C(5, quickchatUsers.rtcChannelWaittingTime);
            String str4 = quickchatUsers.otherUserID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            String str5 = quickchatUsers.rtcChannel;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            String str6 = quickchatUsers.rtcToken;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(8, str6);
            }
        }
    };
    public static JsonAdapter<QuickchatUsers> JSON_ADAPTER = new ObjectJsonAdapter<QuickchatUsers>() { // from class: com.p1.mobile.putong.core.data.QuickchatUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickchatUsers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickchatUsers newInstance() {
            return new QuickchatUsers();
        }

        public boolean parseField(QuickchatUsers quickchatUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserID":
                    quickchatUsers.otherUserID = jsonParser.getValueAsString();
                    return true;
                case "rtcChannelWaittingTime":
                    quickchatUsers.rtcChannelWaittingTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "quickchatType":
                    quickchatUsers.quickchatType = jsonParser.getValueAsString();
                    return true;
                case "waittingExpiredTime":
                    quickchatUsers.waittingExpiredTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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
                    quickchatUsers.f20484id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickchatUsers quickchatUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = quickchatUsers.f20484id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = quickchatUsers.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = quickchatUsers.quickchatType;
            if (str3 != null) {
                jsonGenerator.writeStringField("quickchatType", str3);
            }
            jsonGenerator.writeFieldName("waittingExpiredTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickchatUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickchatUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickchatUsers new_() {
        QuickchatUsers quickchatUsers = new QuickchatUsers();
        quickchatUsers.nullCheck();
        return quickchatUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickchatUsers mo223809clone() {
        QuickchatUsers quickchatUsers = new QuickchatUsers();
        quickchatUsers.f20484id = this.f20484id;
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
        return ValueObject.util_equals(this.f20484id, quickchatUsers.f20484id) && ValueObject.util_equals(this.status, quickchatUsers.status) && ValueObject.util_equals(this.quickchatType, quickchatUsers.quickchatType) && this.waittingExpiredTime == quickchatUsers.waittingExpiredTime && this.rtcChannelWaittingTime == quickchatUsers.rtcChannelWaittingTime && ValueObject.util_equals(this.otherUserID, quickchatUsers.otherUserID) && ValueObject.util_equals(this.rtcChannel, quickchatUsers.rtcChannel) && ValueObject.util_equals(this.rtcToken, quickchatUsers.rtcToken);
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
        String str = this.f20484id;
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20484id == null) {
            this.f20484id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
