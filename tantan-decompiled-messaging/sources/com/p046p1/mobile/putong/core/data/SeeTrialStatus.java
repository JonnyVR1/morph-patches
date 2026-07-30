package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SeeTrialStatus;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class SeeTrialStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seetrialstatus";

    @ProtobufIndex(index = 4)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Long> seeUsers;

    @ProtobufIndex(index = 3)
    public long startAt;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public static ProtobufAdapter<SeeTrialStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeTrialStatus>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeTrialStatus seeTrialStatus) {
            List<Long> list = seeTrialStatus.seeUsers;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = seeTrialStatus.status;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17228j = iM17230l + CodedOutputByteBufferNano.m17228j(3, seeTrialStatus.startAt) + CodedOutputByteBufferNano.m17228j(4, seeTrialStatus.expireAt);
            seeTrialStatus.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeTrialStatus parse(nb5 nb5Var) throws IOException {
            SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (seeTrialStatus.seeUsers == null) {
                        seeTrialStatus.seeUsers = new ArrayList();
                    }
                    if (seeTrialStatus.status != null) {
                        break;
                    }
                    seeTrialStatus.status = "";
                    break;
                }
                if (iM158752u == 10) {
                    seeTrialStatus.seeUsers = (List) nb5Var.m158743l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    seeTrialStatus.status = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    seeTrialStatus.startAt = nb5Var.m158742k();
                } else {
                    if (iM158752u != 32) {
                        if (seeTrialStatus.seeUsers == null) {
                            seeTrialStatus.seeUsers = new ArrayList();
                        }
                        if (seeTrialStatus.status != null) {
                            break;
                        }
                        seeTrialStatus.status = "";
                        return seeTrialStatus;
                    }
                    seeTrialStatus.expireAt = nb5Var.m158742k();
                }
            }
            return seeTrialStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeTrialStatus seeTrialStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Long> list = seeTrialStatus.seeUsers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str = seeTrialStatus.status;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17252I(3, seeTrialStatus.startAt);
            codedOutputByteBufferNano.m17252I(4, seeTrialStatus.expireAt);
        }
    };
    public static JsonAdapter<SeeTrialStatus> JSON_ADAPTER = new ObjectJsonAdapter<SeeTrialStatus>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeTrialStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeTrialStatus newInstance() {
            return new SeeTrialStatus();
        }

        public boolean parseField(SeeTrialStatus seeTrialStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireAt":
                    seeTrialStatus.expireAt = jsonParser.getValueAsLong();
                    return true;
                case "startAt":
                    seeTrialStatus.startAt = jsonParser.getValueAsLong();
                    return true;
                case "status":
                    seeTrialStatus.status = jsonParser.getValueAsString();
                    return true;
                case "seeUsers":
                    seeTrialStatus.seeUsers = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeTrialStatus seeTrialStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireAt":
                case "startAt":
                case "status":
                case "seeUsers":
                    return true;
                default:
                    return super.parseFieldCheck(seeTrialStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeTrialStatus seeTrialStatus, JsonGenerator jsonGenerator) throws IOException {
            if (seeTrialStatus.seeUsers != null) {
                jsonGenerator.writeFieldName("seeUsers");
                JsonAdapter.serializeArray(seeTrialStatus.seeUsers, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            String str = seeTrialStatus.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
            jsonGenerator.writeNumberField("startAt", seeTrialStatus.startAt);
            jsonGenerator.writeNumberField("expireAt", seeTrialStatus.expireAt);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeTrialStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeTrialStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m35832a(Long l2) {
        return l2;
    }

    public static SeeTrialStatus new_() {
        SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
        seeTrialStatus.nullCheck();
        return seeTrialStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeTrialStatus mo223809clone() {
        SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
        List<Long> list = this.seeUsers;
        if (list != null) {
            seeTrialStatus.seeUsers = ValueObject.util_map(list, new w9j() { // from class: l.pbe0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SeeTrialStatus.m35832a((Long) obj);
                }
            });
        }
        seeTrialStatus.status = this.status;
        seeTrialStatus.startAt = this.startAt;
        seeTrialStatus.expireAt = this.expireAt;
        return seeTrialStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeTrialStatus)) {
            return false;
        }
        SeeTrialStatus seeTrialStatus = (SeeTrialStatus) obj;
        return ValueObject.util_equals(this.seeUsers, seeTrialStatus.seeUsers) && ValueObject.util_equals(this.status, seeTrialStatus.status) && this.startAt == seeTrialStatus.startAt && this.expireAt == seeTrialStatus.expireAt;
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
        List<Long> list = this.seeUsers;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.status;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.startAt;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireAt;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.seeUsers == null) {
            this.seeUsers = new ArrayList();
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
