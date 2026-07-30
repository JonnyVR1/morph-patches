package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class PrivilegeDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegedetail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String channel;

    @ProtobufIndex(index = 5)
    public long count;

    @ProtobufIndex(index = 3)
    public long duration;

    @ProtobufIndex(index = 4)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = 2)
    public String privilegeType;

    @ProtobufIndex(index = 6)
    public long remaining;
    public static ProtobufAdapter<PrivilegeDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeDetail>() { // from class: com.p1.mobile.putong.core.data.PrivilegeDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegeDetail privilegeDetail) {
            String str = privilegeDetail.channel;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, privilegeDetail.duration) + CodedOutputByteBufferNano.m17283j(4, privilegeDetail.expireAt) + CodedOutputByteBufferNano.m17283j(5, privilegeDetail.count) + CodedOutputByteBufferNano.m17283j(6, privilegeDetail.remaining);
            privilegeDetail.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegeDetail parse(nc5 nc5Var) throws IOException {
            PrivilegeDetail privilegeDetail = new PrivilegeDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (privilegeDetail.channel == null) {
                        privilegeDetail.channel = "";
                    }
                    if (privilegeDetail.privilegeType != null) {
                        break;
                    }
                    privilegeDetail.privilegeType = "";
                    break;
                }
                if (iM162497u == 10) {
                    privilegeDetail.channel = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    privilegeDetail.privilegeType = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    privilegeDetail.duration = nc5Var.m162487k();
                } else if (iM162497u == 32) {
                    privilegeDetail.expireAt = nc5Var.m162487k();
                } else if (iM162497u == 40) {
                    privilegeDetail.count = nc5Var.m162487k();
                } else {
                    if (iM162497u != 48) {
                        if (privilegeDetail.channel == null) {
                            privilegeDetail.channel = "";
                        }
                        if (privilegeDetail.privilegeType != null) {
                            break;
                        }
                        privilegeDetail.privilegeType = "";
                        return privilegeDetail;
                    }
                    privilegeDetail.remaining = nc5Var.m162487k();
                }
            }
            return privilegeDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegeDetail privilegeDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privilegeDetail.channel;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17307I(3, privilegeDetail.duration);
            codedOutputByteBufferNano.m17307I(4, privilegeDetail.expireAt);
            codedOutputByteBufferNano.m17307I(5, privilegeDetail.count);
            codedOutputByteBufferNano.m17307I(6, privilegeDetail.remaining);
        }
    };
    public static JsonAdapter<PrivilegeDetail> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeDetail>() { // from class: com.p1.mobile.putong.core.data.PrivilegeDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegeDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegeDetail newInstance() {
            return new PrivilegeDetail();
        }

        public boolean parseField(PrivilegeDetail privilegeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    privilegeDetail.duration = jsonParser.getValueAsLong();
                    return true;
                case "expireAt":
                    privilegeDetail.expireAt = jsonParser.getValueAsLong();
                    return true;
                case "privilegeType":
                    privilegeDetail.privilegeType = jsonParser.getValueAsString();
                    return true;
                case "count":
                    privilegeDetail.count = jsonParser.getValueAsLong();
                    return true;
                case "channel":
                    privilegeDetail.channel = jsonParser.getValueAsString();
                    return true;
                case "remaining":
                    privilegeDetail.remaining = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivilegeDetail privilegeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "expireAt":
                case "privilegeType":
                case "count":
                case "channel":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(privilegeDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegeDetail privilegeDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = privilegeDetail.channel;
            if (str != null) {
                jsonGenerator.writeStringField("channel", str);
            }
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                jsonGenerator.writeStringField("privilegeType", str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, privilegeDetail.duration);
            jsonGenerator.writeNumberField("expireAt", privilegeDetail.expireAt);
            jsonGenerator.writeNumberField("count", privilegeDetail.count);
            jsonGenerator.writeNumberField("remaining", privilegeDetail.remaining);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeDetail new_() {
        PrivilegeDetail privilegeDetail = new PrivilegeDetail();
        privilegeDetail.nullCheck();
        return privilegeDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegeDetail mo225055clone() {
        PrivilegeDetail privilegeDetail = new PrivilegeDetail();
        privilegeDetail.channel = this.channel;
        privilegeDetail.privilegeType = this.privilegeType;
        privilegeDetail.duration = this.duration;
        privilegeDetail.expireAt = this.expireAt;
        privilegeDetail.count = this.count;
        privilegeDetail.remaining = this.remaining;
        return privilegeDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeDetail)) {
            return false;
        }
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) obj;
        return ValueObject.util_equals(this.channel, privilegeDetail.channel) && ValueObject.util_equals(this.privilegeType, privilegeDetail.privilegeType) && this.duration == privilegeDetail.duration && this.expireAt == privilegeDetail.expireAt && this.count == privilegeDetail.count && this.remaining == privilegeDetail.remaining;
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
        String str = this.channel;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeType;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireAt;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.count;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.remaining;
        int i6 = i5 + ((int) (j4 ^ (j4 >>> 32)));
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.channel == null) {
            this.channel = "";
        }
        if (this.privilegeType == null) {
            this.privilegeType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
