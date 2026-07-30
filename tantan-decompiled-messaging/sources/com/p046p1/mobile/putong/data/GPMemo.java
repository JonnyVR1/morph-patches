package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class GPMemo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpmemo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String memo;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;
    public static ProtobufAdapter<GPMemo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPMemo>() { // from class: com.p1.mobile.putong.data.GPMemo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPMemo gPMemo) {
            String str = gPMemo.otherUserId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = gPMemo.memo;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = gPMemo.userId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            gPMemo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPMemo parse(nb5 nb5Var) throws IOException {
            GPMemo gPMemo = new GPMemo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPMemo.otherUserId == null) {
                        gPMemo.otherUserId = "";
                    }
                    if (gPMemo.memo == null) {
                        gPMemo.memo = "";
                    }
                    if (gPMemo.userId != null) {
                        break;
                    }
                    gPMemo.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    gPMemo.otherUserId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    gPMemo.memo = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (gPMemo.otherUserId == null) {
                            gPMemo.otherUserId = "";
                        }
                        if (gPMemo.memo == null) {
                            gPMemo.memo = "";
                        }
                        if (gPMemo.userId != null) {
                            break;
                        }
                        gPMemo.userId = "";
                        return gPMemo;
                    }
                    gPMemo.userId = nb5Var.m158750s();
                }
            }
            return gPMemo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPMemo gPMemo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPMemo.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = gPMemo.memo;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = gPMemo.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<GPMemo> JSON_ADAPTER = new ObjectJsonAdapter<GPMemo>() { // from class: com.p1.mobile.putong.data.GPMemo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPMemo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPMemo newInstance() {
            return new GPMemo();
        }

        public boolean parseField(GPMemo gPMemo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    gPMemo.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    gPMemo.userId = jsonParser.getValueAsString();
                    return true;
                case "memo":
                    gPMemo.memo = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPMemo gPMemo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "userId":
                case "memo":
                    return true;
                default:
                    return super.parseFieldCheck(gPMemo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPMemo gPMemo, JsonGenerator jsonGenerator) throws IOException {
            String str = gPMemo.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            String str2 = gPMemo.memo;
            if (str2 != null) {
                jsonGenerator.writeStringField("memo", str2);
            }
            String str3 = gPMemo.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPMemo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPMemo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPMemo new_() {
        GPMemo gPMemo = new GPMemo();
        gPMemo.nullCheck();
        return gPMemo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPMemo mo223809clone() {
        GPMemo gPMemo = new GPMemo();
        gPMemo.otherUserId = this.otherUserId;
        gPMemo.memo = this.memo;
        gPMemo.userId = this.userId;
        return gPMemo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPMemo)) {
            return false;
        }
        GPMemo gPMemo = (GPMemo) obj;
        return ValueObject.util_equals(this.otherUserId, gPMemo.otherUserId) && ValueObject.util_equals(this.memo, gPMemo.memo) && ValueObject.util_equals(this.userId, gPMemo.userId);
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
        String str = this.otherUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.memo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.memo == null) {
            this.memo = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
