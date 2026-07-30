package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class AppealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealinfo";

    @ProtobufIndex(index = 3)
    public boolean allowAppeal;

    @ProtobufIndex(index = 7)
    public int appeal_count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21088id;

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
            String str = appealInfo.f21088id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, appealInfo.needAppeal) + CodedOutputByteBufferNano.m17275b(3, appealInfo.allowAppeal);
            AppealReason appealReason = appealInfo.reason;
            if (appealReason != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, appealReason, AppealReason.PROTOBUF_ADAPTER);
            }
            String str2 = appealInfo.method;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            String str3 = appealInfo.status;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(7, appealInfo.appeal_count);
            String str4 = appealInfo.needAppealDescription;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            appealInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealInfo parse(nc5 nc5Var) throws IOException {
            AppealInfo appealInfo = new AppealInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (appealInfo.f21088id == null) {
                        appealInfo.f21088id = "";
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
                if (iM162497u == 10) {
                    appealInfo.f21088id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    appealInfo.needAppeal = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    appealInfo.allowAppeal = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    appealInfo.reason = (AppealReason) nc5Var.m162488l(AppealReason.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    appealInfo.method = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    appealInfo.status = nc5Var.m162495s();
                } else if (iM162497u == 56) {
                    appealInfo.appeal_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 66) {
                        if (appealInfo.f21088id == null) {
                            appealInfo.f21088id = "";
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
                    appealInfo.needAppealDescription = nc5Var.m162495s();
                }
            }
            return appealInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealInfo appealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealInfo.f21088id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, appealInfo.needAppeal);
            codedOutputByteBufferNano.m17299A(3, appealInfo.allowAppeal);
            AppealReason appealReason = appealInfo.reason;
            if (appealReason != null) {
                codedOutputByteBufferNano.m17309K(4, appealReason, AppealReason.PROTOBUF_ADAPTER);
            }
            String str2 = appealInfo.method;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            String str3 = appealInfo.status;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(6, str3);
            }
            codedOutputByteBufferNano.m17305G(7, appealInfo.appeal_count);
            String str4 = appealInfo.needAppealDescription;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
        }
    };
    public static JsonAdapter<AppealInfo> JSON_ADAPTER = new ObjectJsonAdapter<AppealInfo>() { // from class: com.p1.mobile.putong.core.data.AppealInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    appealInfo.f21088id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealInfo appealInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = appealInfo.f21088id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public AppealInfo mo225055clone() {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.f21088id = this.f21088id;
        appealInfo.needAppeal = this.needAppeal;
        appealInfo.allowAppeal = this.allowAppeal;
        AppealReason appealReason = this.reason;
        if (appealReason != null) {
            appealInfo.reason = appealReason.mo225055clone();
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
        return ValueObject.util_equals(this.f21088id, appealInfo.f21088id) && this.needAppeal == appealInfo.needAppeal && this.allowAppeal == appealInfo.allowAppeal && ValueObject.util_equals(this.reason, appealInfo.reason) && ValueObject.util_equals(this.method, appealInfo.method) && ValueObject.util_equals(this.status, appealInfo.status) && this.appeal_count == appealInfo.appeal_count && ValueObject.util_equals(this.needAppealDescription, appealInfo.needAppealDescription);
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
        String str = this.f21088id;
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
        if (this.f21088id == null) {
            this.f21088id = "";
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
