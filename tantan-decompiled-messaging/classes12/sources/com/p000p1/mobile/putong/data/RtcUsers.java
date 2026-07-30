package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RtcUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rtcusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f272id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public static ProtobufAdapter<RtcUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<RtcUsers>() { // from class: com.p1.mobile.putong.data.RtcUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RtcUsers rtcUsers) {
            String str = rtcUsers.f272id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = rtcUsers.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) rtcUsers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RtcUsers m18923parse(nb5 nb5Var) throws IOException {
            RtcUsers rtcUsers = new RtcUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rtcUsers.f272id == null) {
                        rtcUsers.f272id = "";
                    }
                    if (rtcUsers.status != null) {
                        break;
                    }
                    rtcUsers.status = "";
                    break;
                }
                if (iU == 10) {
                    rtcUsers.f272id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (rtcUsers.f272id == null) {
                            rtcUsers.f272id = "";
                        }
                        if (rtcUsers.status != null) {
                            break;
                        }
                        rtcUsers.status = "";
                        return rtcUsers;
                    }
                    rtcUsers.status = nb5Var.s();
                }
            }
            return rtcUsers;
        }

        public void serialize(RtcUsers rtcUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rtcUsers.f272id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = rtcUsers.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<RtcUsers> JSON_ADAPTER = new ObjectJsonAdapter<RtcUsers>() { // from class: com.p1.mobile.putong.data.RtcUsers.2
        public Class getDataClass() {
            return RtcUsers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RtcUsers mo17830newInstance() {
            return new RtcUsers();
        }

        public boolean parseField(RtcUsers rtcUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                rtcUsers.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            rtcUsers.f272id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(RtcUsers rtcUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(rtcUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RtcUsers rtcUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = rtcUsers.f272id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rtcUsers.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RtcUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RtcUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RtcUsers new_() {
        RtcUsers rtcUsers = new RtcUsers();
        rtcUsers.nullCheck();
        return rtcUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RtcUsers m18922clone() {
        RtcUsers rtcUsers = new RtcUsers();
        rtcUsers.f272id = this.f272id;
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
        return ValueObject.util_equals(this.f272id, rtcUsers.f272id) && ValueObject.util_equals(this.status, rtcUsers.status);
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
        String str = this.f272id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f272id == null) {
            this.f272id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
