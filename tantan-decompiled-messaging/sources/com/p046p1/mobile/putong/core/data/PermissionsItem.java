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
public class PermissionsItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "permissionsitem";

    @ProtobufIndex(index = 2)
    public boolean enable;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20467id;
    public static ProtobufAdapter<PermissionsItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<PermissionsItem>() { // from class: com.p1.mobile.putong.core.data.PermissionsItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PermissionsItem permissionsItem) {
            String str = permissionsItem.f20467id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, permissionsItem.enable);
            permissionsItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PermissionsItem parse(nb5 nb5Var) throws IOException {
            PermissionsItem permissionsItem = new PermissionsItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (permissionsItem.f20467id != null) {
                        break;
                    }
                    permissionsItem.f20467id = "";
                    break;
                }
                if (iM158752u == 10) {
                    permissionsItem.f20467id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (permissionsItem.f20467id != null) {
                            break;
                        }
                        permissionsItem.f20467id = "";
                        return permissionsItem;
                    }
                    permissionsItem.enable = nb5Var.m158738g();
                }
            }
            return permissionsItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PermissionsItem permissionsItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = permissionsItem.f20467id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, permissionsItem.enable);
        }
    };
    public static JsonAdapter<PermissionsItem> JSON_ADAPTER = new ObjectJsonAdapter<PermissionsItem>() { // from class: com.p1.mobile.putong.core.data.PermissionsItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PermissionsItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PermissionsItem newInstance() {
            return new PermissionsItem();
        }

        public boolean parseField(PermissionsItem permissionsItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                permissionsItem.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            permissionsItem.f20467id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(PermissionsItem permissionsItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(permissionsItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PermissionsItem permissionsItem, JsonGenerator jsonGenerator) throws IOException {
            String str = permissionsItem.f20467id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("enable", permissionsItem.enable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PermissionsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PermissionsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PermissionsItem new_() {
        PermissionsItem permissionsItem = new PermissionsItem();
        permissionsItem.nullCheck();
        return permissionsItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PermissionsItem mo223809clone() {
        PermissionsItem permissionsItem = new PermissionsItem();
        permissionsItem.f20467id = this.f20467id;
        permissionsItem.enable = this.enable;
        return permissionsItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermissionsItem)) {
            return false;
        }
        PermissionsItem permissionsItem = (PermissionsItem) obj;
        return ValueObject.util_equals(this.f20467id, permissionsItem.f20467id) && this.enable == permissionsItem.enable;
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
        String str = this.f20467id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20467id == null) {
            this.f20467id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
