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
public class AwakeAppRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awakeapprecord";

    @ProtobufIndex(index = 3)
    public int hasPullAliveCount;

    @ProtobufIndex(index = 4)
    public long lastPullAliveTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String package_name;

    @ProtobufIndex(index = 2)
    public long startPullAliveTime;
    public static ProtobufAdapter<AwakeAppRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwakeAppRecord>() { // from class: com.p1.mobile.putong.data.AwakeAppRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AwakeAppRecord awakeAppRecord) {
            String str = awakeAppRecord.package_name;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, awakeAppRecord.startPullAliveTime) + CodedOutputByteBufferNano.m17226h(3, awakeAppRecord.hasPullAliveCount) + CodedOutputByteBufferNano.m17228j(4, awakeAppRecord.lastPullAliveTime);
            awakeAppRecord.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AwakeAppRecord parse(nb5 nb5Var) throws IOException {
            AwakeAppRecord awakeAppRecord = new AwakeAppRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (awakeAppRecord.package_name != null) {
                        break;
                    }
                    awakeAppRecord.package_name = "";
                    break;
                }
                if (iM158752u == 10) {
                    awakeAppRecord.package_name = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    awakeAppRecord.startPullAliveTime = nb5Var.m158742k();
                } else if (iM158752u == 24) {
                    awakeAppRecord.hasPullAliveCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        if (awakeAppRecord.package_name != null) {
                            break;
                        }
                        awakeAppRecord.package_name = "";
                        return awakeAppRecord;
                    }
                    awakeAppRecord.lastPullAliveTime = nb5Var.m158742k();
                }
            }
            return awakeAppRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AwakeAppRecord awakeAppRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = awakeAppRecord.package_name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, awakeAppRecord.startPullAliveTime);
            codedOutputByteBufferNano.m17250G(3, awakeAppRecord.hasPullAliveCount);
            codedOutputByteBufferNano.m17252I(4, awakeAppRecord.lastPullAliveTime);
        }
    };
    public static JsonAdapter<AwakeAppRecord> JSON_ADAPTER = new ObjectJsonAdapter<AwakeAppRecord>() { // from class: com.p1.mobile.putong.data.AwakeAppRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AwakeAppRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AwakeAppRecord newInstance() {
            return new AwakeAppRecord();
        }

        public boolean parseField(AwakeAppRecord awakeAppRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hasPullAliveCount":
                    awakeAppRecord.hasPullAliveCount = jsonParser.getValueAsInt();
                    return true;
                case "package_name":
                    awakeAppRecord.package_name = jsonParser.getValueAsString();
                    return true;
                case "startPullAliveTime":
                    awakeAppRecord.startPullAliveTime = jsonParser.getValueAsLong();
                    return true;
                case "lastPullAliveTime":
                    awakeAppRecord.lastPullAliveTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AwakeAppRecord awakeAppRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hasPullAliveCount":
                case "package_name":
                case "startPullAliveTime":
                case "lastPullAliveTime":
                    return true;
                default:
                    return super.parseFieldCheck(awakeAppRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AwakeAppRecord awakeAppRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = awakeAppRecord.package_name;
            if (str != null) {
                jsonGenerator.writeStringField("package_name", str);
            }
            jsonGenerator.writeNumberField("startPullAliveTime", awakeAppRecord.startPullAliveTime);
            jsonGenerator.writeNumberField("hasPullAliveCount", awakeAppRecord.hasPullAliveCount);
            jsonGenerator.writeNumberField("lastPullAliveTime", awakeAppRecord.lastPullAliveTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwakeAppRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwakeAppRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwakeAppRecord new_() {
        AwakeAppRecord awakeAppRecord = new AwakeAppRecord();
        awakeAppRecord.nullCheck();
        return awakeAppRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AwakeAppRecord mo223809clone() {
        AwakeAppRecord awakeAppRecord = new AwakeAppRecord();
        awakeAppRecord.package_name = this.package_name;
        awakeAppRecord.startPullAliveTime = this.startPullAliveTime;
        awakeAppRecord.hasPullAliveCount = this.hasPullAliveCount;
        awakeAppRecord.lastPullAliveTime = this.lastPullAliveTime;
        return awakeAppRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwakeAppRecord)) {
            return false;
        }
        AwakeAppRecord awakeAppRecord = (AwakeAppRecord) obj;
        return ValueObject.util_equals(this.package_name, awakeAppRecord.package_name) && this.startPullAliveTime == awakeAppRecord.startPullAliveTime && this.hasPullAliveCount == awakeAppRecord.hasPullAliveCount && this.lastPullAliveTime == awakeAppRecord.lastPullAliveTime;
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
        String str = this.package_name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.startPullAliveTime;
        int i3 = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + this.hasPullAliveCount) * 41;
        long j2 = this.lastPullAliveTime;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.package_name == null) {
            this.package_name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
