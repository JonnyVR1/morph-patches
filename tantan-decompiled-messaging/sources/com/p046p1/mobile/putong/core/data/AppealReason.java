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
public class AppealReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealreason";

    @NonNull
    @ProtobufIndex(index = 2)
    public String detail;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<AppealReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealReason>() { // from class: com.p1.mobile.putong.core.data.AppealReason.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppealReason appealReason) {
            String str = appealReason.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = appealReason.detail;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            appealReason.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealReason parse(nb5 nb5Var) throws IOException {
            AppealReason appealReason = new AppealReason();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (appealReason.type == null) {
                        appealReason.type = "";
                    }
                    if (appealReason.detail != null) {
                        break;
                    }
                    appealReason.detail = "";
                    break;
                }
                if (iM158752u == 10) {
                    appealReason.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (appealReason.type == null) {
                            appealReason.type = "";
                        }
                        if (appealReason.detail != null) {
                            break;
                        }
                        appealReason.detail = "";
                        return appealReason;
                    }
                    appealReason.detail = nb5Var.m158750s();
                }
            }
            return appealReason;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealReason appealReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealReason.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = appealReason.detail;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<AppealReason> JSON_ADAPTER = new ObjectJsonAdapter<AppealReason>() { // from class: com.p1.mobile.putong.core.data.AppealReason.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealReason.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppealReason newInstance() {
            return new AppealReason();
        }

        public boolean parseField(AppealReason appealReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("detail")) {
                appealReason.detail = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            appealReason.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AppealReason appealReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("detail") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(appealReason, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealReason appealReason, JsonGenerator jsonGenerator) throws IOException {
            String str = appealReason.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = appealReason.detail;
            if (str2 != null) {
                jsonGenerator.writeStringField("detail", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealReason new_() {
        AppealReason appealReason = new AppealReason();
        appealReason.nullCheck();
        return appealReason;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppealReason mo223809clone() {
        AppealReason appealReason = new AppealReason();
        appealReason.type = this.type;
        appealReason.detail = this.detail;
        return appealReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealReason)) {
            return false;
        }
        AppealReason appealReason = (AppealReason) obj;
        return ValueObject.util_equals(this.type, appealReason.type) && ValueObject.util_equals(this.detail, appealReason.detail);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.detail;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.detail == null) {
            this.detail = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
