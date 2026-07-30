package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes12.dex */
public class RtcUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rtcusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39659id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public static ProtobufAdapter<RtcUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<RtcUsers>() { // from class: com.p1.mobile.putong.data.RtcUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RtcUsers rtcUsers) {
            String str = rtcUsers.f39659id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = rtcUsers.status;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            rtcUsers.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RtcUsers parse(nc5 nc5Var) throws IOException {
            RtcUsers rtcUsers = new RtcUsers();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (rtcUsers.f39659id == null) {
                        rtcUsers.f39659id = "";
                    }
                    if (rtcUsers.status != null) {
                        break;
                    }
                    rtcUsers.status = "";
                    break;
                }
                if (iM162497u == 10) {
                    rtcUsers.f39659id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (rtcUsers.f39659id == null) {
                            rtcUsers.f39659id = "";
                        }
                        if (rtcUsers.status != null) {
                            break;
                        }
                        rtcUsers.status = "";
                        return rtcUsers;
                    }
                    rtcUsers.status = nc5Var.m162495s();
                }
            }
            return rtcUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RtcUsers rtcUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rtcUsers.f39659id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = rtcUsers.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<RtcUsers> JSON_ADAPTER = new ObjectJsonAdapter<RtcUsers>() { // from class: com.p1.mobile.putong.data.RtcUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RtcUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RtcUsers newInstance() {
            return new RtcUsers();
        }

        public boolean parseField(RtcUsers rtcUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                rtcUsers.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            rtcUsers.f39659id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(RtcUsers rtcUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(rtcUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RtcUsers rtcUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = rtcUsers.f39659id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rtcUsers.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RtcUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RtcUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RtcUsers new_() {
        RtcUsers rtcUsers = new RtcUsers();
        rtcUsers.nullCheck();
        return rtcUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RtcUsers mo225055clone() {
        RtcUsers rtcUsers = new RtcUsers();
        rtcUsers.f39659id = this.f39659id;
        rtcUsers.status = this.status;
        return rtcUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RtcUsers)) {
            return false;
        }
        RtcUsers rtcUsers = (RtcUsers) obj;
        return ValueObject.util_equals(this.f39659id, rtcUsers.f39659id) && ValueObject.util_equals(this.status, rtcUsers.status);
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
        String str = this.f39659id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39659id == null) {
            this.f39659id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
