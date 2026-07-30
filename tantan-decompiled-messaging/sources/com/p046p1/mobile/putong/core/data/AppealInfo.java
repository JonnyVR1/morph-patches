package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class AppealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealinfo";

    @ProtobufIndex(index = 3)
    public boolean allowAppeal;

    @ProtobufIndex(index = 7)
    public int appeal_count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20346id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String method;

    @ProtobufIndex(index = 2)
    public boolean needAppeal;

    @NonNull
    @ProtobufIndex(index = 8)
    public String needAppealDescription;

    @NonNull
    @ProtobufIndex(index = 4)
    public AppealReason reason;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<AppealInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealInfo>() { // from class: com.p1.mobile.putong.core.data.AppealInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppealInfo appealInfo) {
            String str = appealInfo.f20346id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, appealInfo.needAppeal) + CodedOutputByteBufferNano.m17220b(3, appealInfo.allowAppeal);
            AppealReason appealReason = appealInfo.reason;
            if (appealReason != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, appealReason, AppealReason.PROTOBUF_ADAPTER);
            }
            String str2 = appealInfo.method;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            String str3 = appealInfo.status;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(7, appealInfo.appeal_count);
            String str4 = appealInfo.needAppealDescription;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            appealInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealInfo parse(nb5 nb5Var) throws IOException {
            AppealInfo appealInfo = new AppealInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (appealInfo.f20346id == null) {
                        appealInfo.f20346id = "";
                    }
                    if (appealInfo.reason == null) {
                        appealInfo.reason = AppealReason.new_();
                    }
                    if (appealInfo.method == null) {
                        appealInfo.method = "";
                    }
                    if (appealInfo.status == null) {
                        appealInfo.status = "";
                    }
                    if (appealInfo.needAppealDescription != null) {
                        break;
                    }
                    appealInfo.needAppealDescription = "";
                    break;
                }
                if (iM158752u == 10) {
                    appealInfo.f20346id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    appealInfo.needAppeal = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    appealInfo.allowAppeal = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    appealInfo.reason = (AppealReason) nb5Var.m158743l(AppealReason.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    appealInfo.method = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    appealInfo.status = nb5Var.m158750s();
                } else if (iM158752u == 56) {
                    appealInfo.appeal_count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 66) {
                        if (appealInfo.f20346id == null) {
                            appealInfo.f20346id = "";
                        }
                        if (appealInfo.reason == null) {
                            appealInfo.reason = AppealReason.new_();
                        }
                        if (appealInfo.method == null) {
                            appealInfo.method = "";
                        }
                        if (appealInfo.status == null) {
                            appealInfo.status = "";
                        }
                        if (appealInfo.needAppealDescription != null) {
                            break;
                        }
                        appealInfo.needAppealDescription = "";
                        return appealInfo;
                    }
                    appealInfo.needAppealDescription = nb5Var.m158750s();
                }
            }
            return appealInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealInfo appealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealInfo.f20346id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, appealInfo.needAppeal);
            codedOutputByteBufferNano.m17244A(3, appealInfo.allowAppeal);
            AppealReason appealReason = appealInfo.reason;
            if (appealReason != null) {
                codedOutputByteBufferNano.m17254K(4, appealReason, AppealReason.PROTOBUF_ADAPTER);
            }
            String str2 = appealInfo.method;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            String str3 = appealInfo.status;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            codedOutputByteBufferNano.m17250G(7, appealInfo.appeal_count);
            String str4 = appealInfo.needAppealDescription;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
        }
    };
    public static JsonAdapter<AppealInfo> JSON_ADAPTER = new ObjectJsonAdapter<AppealInfo>() { // from class: com.p1.mobile.putong.core.data.AppealInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppealInfo newInstance() {
            return new AppealInfo();
        }

        public boolean parseField(AppealInfo appealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "needAppeal":
                    appealInfo.needAppeal = jsonParser.getValueAsBoolean();
                    return true;
                case "method":
                    appealInfo.method = jsonParser.getValueAsString();
                    return true;
                case "appeal_count":
                    appealInfo.appeal_count = jsonParser.getValueAsInt();
                    return true;
                case "reason":
                    appealInfo.reason = AppealReason.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    appealInfo.status = jsonParser.getValueAsString();
                    return true;
                case "needAppealDescription":
                    appealInfo.needAppealDescription = jsonParser.getValueAsString();
                    return true;
                case "id":
                    appealInfo.f20346id = jsonParser.getValueAsString();
                    return false;
                case "allowAppeal":
                    appealInfo.allowAppeal = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppealInfo appealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "needAppeal":
                case "method":
                case "appeal_count":
                case "reason":
                case "status":
                case "needAppealDescription":
                    return true;
                case "id":
                    return false;
                case "allowAppeal":
                    return true;
                default:
                    return super.parseFieldCheck(appealInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealInfo appealInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = appealInfo.f20346id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("needAppeal", appealInfo.needAppeal);
            jsonGenerator.writeBooleanField("allowAppeal", appealInfo.allowAppeal);
            if (appealInfo.reason != null) {
                jsonGenerator.writeFieldName(Reason.TYPE);
                AppealReason.JSON_ADAPTER.serialize(appealInfo.reason, jsonGenerator, true);
            }
            String str2 = appealInfo.method;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.METHOD, str2);
            }
            String str3 = appealInfo.status;
            if (str3 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str3);
            }
            jsonGenerator.writeNumberField("appeal_count", appealInfo.appeal_count);
            String str4 = appealInfo.needAppealDescription;
            if (str4 != null) {
                jsonGenerator.writeStringField("needAppealDescription", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealInfo new_() {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.nullCheck();
        return appealInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppealInfo mo223809clone() {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.f20346id = this.f20346id;
        appealInfo.needAppeal = this.needAppeal;
        appealInfo.allowAppeal = this.allowAppeal;
        AppealReason appealReason = this.reason;
        if (appealReason != null) {
            appealInfo.reason = appealReason.mo223809clone();
        }
        appealInfo.method = this.method;
        appealInfo.status = this.status;
        appealInfo.appeal_count = this.appeal_count;
        appealInfo.needAppealDescription = this.needAppealDescription;
        return appealInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealInfo)) {
            return false;
        }
        AppealInfo appealInfo = (AppealInfo) obj;
        return ValueObject.util_equals(this.f20346id, appealInfo.f20346id) && this.needAppeal == appealInfo.needAppeal && this.allowAppeal == appealInfo.allowAppeal && ValueObject.util_equals(this.reason, appealInfo.reason) && ValueObject.util_equals(this.method, appealInfo.method) && ValueObject.util_equals(this.status, appealInfo.status) && this.appeal_count == appealInfo.appeal_count && ValueObject.util_equals(this.needAppealDescription, appealInfo.needAppealDescription);
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
        String str = this.f20346id;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.needAppeal ? 1231 : 1237)) * 41) + (this.allowAppeal ? 1231 : 1237)) * 41;
        AppealReason appealReason = this.reason;
        int iHashCode2 = (iHashCode + (appealReason != null ? appealReason.hashCode() : 0)) * 41;
        String str2 = this.method;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.status;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.appeal_count) * 41;
        String str4 = this.needAppealDescription;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20346id == null) {
            this.f20346id = "";
        }
        if (this.reason == null) {
            this.reason = AppealReason.new_();
        }
        if (this.method == null) {
            this.method = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.needAppealDescription == null) {
            this.needAppealDescription = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
