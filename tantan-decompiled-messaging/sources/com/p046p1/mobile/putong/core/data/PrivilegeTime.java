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
public class PrivilegeTime extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegetime";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 3)
    public long expireTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<PrivilegeTime> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeTime>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTime.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegeTime privilegeTime) {
            String str = privilegeTime.type;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, privilegeTime.count) + CodedOutputByteBufferNano.m17228j(3, privilegeTime.expireTime);
            privilegeTime.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegeTime parse(nb5 nb5Var) throws IOException {
            PrivilegeTime privilegeTime = new PrivilegeTime();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privilegeTime.type != null) {
                        break;
                    }
                    privilegeTime.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    privilegeTime.type = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    privilegeTime.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (privilegeTime.type != null) {
                            break;
                        }
                        privilegeTime.type = "";
                        return privilegeTime;
                    }
                    privilegeTime.expireTime = nb5Var.m158742k();
                }
            }
            return privilegeTime;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegeTime privilegeTime, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privilegeTime.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, privilegeTime.count);
            codedOutputByteBufferNano.m17252I(3, privilegeTime.expireTime);
        }
    };
    public static JsonAdapter<PrivilegeTime> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeTime>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTime.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegeTime.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegeTime newInstance() {
            return new PrivilegeTime();
        }

        public boolean parseField(PrivilegeTime privilegeTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    privilegeTime.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "type":
                    privilegeTime.type = jsonParser.getValueAsString();
                    return true;
                case "count":
                    privilegeTime.count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivilegeTime privilegeTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                case "type":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(privilegeTime, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegeTime privilegeTime, JsonGenerator jsonGenerator) throws IOException {
            String str = privilegeTime.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("count", privilegeTime.count);
            jsonGenerator.writeNumberField("expireTime", privilegeTime.expireTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeTime new_() {
        PrivilegeTime privilegeTime = new PrivilegeTime();
        privilegeTime.nullCheck();
        return privilegeTime;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegeTime mo223809clone() {
        PrivilegeTime privilegeTime = new PrivilegeTime();
        privilegeTime.type = this.type;
        privilegeTime.count = this.count;
        privilegeTime.expireTime = this.expireTime;
        return privilegeTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeTime)) {
            return false;
        }
        PrivilegeTime privilegeTime = (PrivilegeTime) obj;
        return ValueObject.util_equals(this.type, privilegeTime.type) && this.count == privilegeTime.count && this.expireTime == privilegeTime.expireTime;
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count) * 41;
        long j = this.expireTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
