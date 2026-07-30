package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class PrivilegeReward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegereward";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<PrivilegeReward> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeReward>() { // from class: com.p1.mobile.putong.core.data.PrivilegeReward.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegeReward privilegeReward) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            privilegeReward.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegeReward parse(nc5 nc5Var) throws IOException {
            PrivilegeReward privilegeReward = new PrivilegeReward();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (privilegeReward.type != null) {
                        break;
                    }
                    privilegeReward.type = "";
                    break;
                }
                if (iM162497u == 8) {
                    privilegeReward.count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (privilegeReward.type != null) {
                            break;
                        }
                        privilegeReward.type = "";
                        return privilegeReward;
                    }
                    privilegeReward.type = nc5Var.m162495s();
                }
            }
            return privilegeReward;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegeReward privilegeReward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<PrivilegeReward> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeReward>() { // from class: com.p1.mobile.putong.core.data.PrivilegeReward.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegeReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegeReward newInstance() {
            return new PrivilegeReward();
        }

        public boolean parseField(PrivilegeReward privilegeReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                privilegeReward.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            privilegeReward.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PrivilegeReward privilegeReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(privilegeReward, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegeReward privilegeReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeReward new_() {
        PrivilegeReward privilegeReward = new PrivilegeReward();
        privilegeReward.nullCheck();
        return privilegeReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegeReward mo225055clone() {
        PrivilegeReward privilegeReward = new PrivilegeReward();
        privilegeReward.count = this.count;
        privilegeReward.type = this.type;
        return privilegeReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeReward)) {
            return false;
        }
        PrivilegeReward privilegeReward = (PrivilegeReward) obj;
        return this.count == privilegeReward.count && ValueObject.util_equals(this.type, privilegeReward.type);
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
        int i2 = ((i * 41) + this.count) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
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
