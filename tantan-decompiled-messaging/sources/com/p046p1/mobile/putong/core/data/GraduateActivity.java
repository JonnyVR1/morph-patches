package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
public class GraduateActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "graduateactivity";

    @NonNull
    @ProtobufIndex(index = 3)
    public String endTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String entranceUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String startTime;
    public static ProtobufAdapter<GraduateActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<GraduateActivity>() { // from class: com.p1.mobile.putong.core.data.GraduateActivity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GraduateActivity graduateActivity) {
            String str = graduateActivity.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            graduateActivity.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GraduateActivity parse(nb5 nb5Var) throws IOException {
            GraduateActivity graduateActivity = new GraduateActivity();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (graduateActivity.name == null) {
                        graduateActivity.name = "";
                    }
                    if (graduateActivity.startTime == null) {
                        graduateActivity.startTime = "";
                    }
                    if (graduateActivity.endTime == null) {
                        graduateActivity.endTime = "";
                    }
                    if (graduateActivity.entranceUrl != null) {
                        break;
                    }
                    graduateActivity.entranceUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    graduateActivity.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    graduateActivity.startTime = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    graduateActivity.endTime = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (graduateActivity.name == null) {
                            graduateActivity.name = "";
                        }
                        if (graduateActivity.startTime == null) {
                            graduateActivity.startTime = "";
                        }
                        if (graduateActivity.endTime == null) {
                            graduateActivity.endTime = "";
                        }
                        if (graduateActivity.entranceUrl != null) {
                            break;
                        }
                        graduateActivity.entranceUrl = "";
                        return graduateActivity;
                    }
                    graduateActivity.entranceUrl = nb5Var.m158750s();
                }
            }
            return graduateActivity;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GraduateActivity graduateActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = graduateActivity.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<GraduateActivity> JSON_ADAPTER = new ObjectJsonAdapter<GraduateActivity>() { // from class: com.p1.mobile.putong.core.data.GraduateActivity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GraduateActivity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GraduateActivity newInstance() {
            return new GraduateActivity();
        }

        public boolean parseField(GraduateActivity graduateActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    graduateActivity.startTime = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    graduateActivity.endTime = jsonParser.getValueAsString();
                    return true;
                case "entranceUrl":
                    graduateActivity.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    graduateActivity.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GraduateActivity graduateActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "entranceUrl":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(graduateActivity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GraduateActivity graduateActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = graduateActivity.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("endTime", str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("entranceUrl", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GraduateActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GraduateActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GraduateActivity new_() {
        GraduateActivity graduateActivity = new GraduateActivity();
        graduateActivity.nullCheck();
        return graduateActivity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GraduateActivity mo223809clone() {
        GraduateActivity graduateActivity = new GraduateActivity();
        graduateActivity.name = this.name;
        graduateActivity.startTime = this.startTime;
        graduateActivity.endTime = this.endTime;
        graduateActivity.entranceUrl = this.entranceUrl;
        return graduateActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GraduateActivity)) {
            return false;
        }
        GraduateActivity graduateActivity = (GraduateActivity) obj;
        return ValueObject.util_equals(this.name, graduateActivity.name) && ValueObject.util_equals(this.startTime, graduateActivity.startTime) && ValueObject.util_equals(this.endTime, graduateActivity.endTime) && ValueObject.util_equals(this.entranceUrl, graduateActivity.entranceUrl);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.startTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endTime;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.entranceUrl;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
