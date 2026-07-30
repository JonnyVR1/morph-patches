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
public class GreetingPermission extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingpermission";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tips;
    public static ProtobufAdapter<GreetingPermission> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingPermission>() { // from class: com.p1.mobile.putong.core.data.GreetingPermission.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingPermission greetingPermission) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            greetingPermission.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingPermission parse(nb5 nb5Var) throws IOException {
            GreetingPermission greetingPermission = new GreetingPermission();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (greetingPermission.tips != null) {
                        break;
                    }
                    greetingPermission.tips = "";
                    break;
                }
                if (iM158752u == 8) {
                    greetingPermission.enable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (greetingPermission.tips != null) {
                            break;
                        }
                        greetingPermission.tips = "";
                        return greetingPermission;
                    }
                    greetingPermission.tips = nb5Var.m158750s();
                }
            }
            return greetingPermission;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingPermission greetingPermission, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<GreetingPermission> JSON_ADAPTER = new ObjectJsonAdapter<GreetingPermission>() { // from class: com.p1.mobile.putong.core.data.GreetingPermission.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingPermission.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingPermission newInstance() {
            return new GreetingPermission();
        }

        public boolean parseField(GreetingPermission greetingPermission, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                greetingPermission.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("tips")) {
                return false;
            }
            greetingPermission.tips = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingPermission greetingPermission, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("tips")) {
                return true;
            }
            return super.parseFieldCheck(greetingPermission, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingPermission greetingPermission, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                jsonGenerator.writeStringField("tips", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingPermission) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingPermission) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingPermission new_() {
        GreetingPermission greetingPermission = new GreetingPermission();
        greetingPermission.nullCheck();
        return greetingPermission;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingPermission mo223809clone() {
        GreetingPermission greetingPermission = new GreetingPermission();
        greetingPermission.enable = this.enable;
        greetingPermission.tips = this.tips;
        return greetingPermission;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingPermission)) {
            return false;
        }
        GreetingPermission greetingPermission = (GreetingPermission) obj;
        return this.enable == greetingPermission.enable && ValueObject.util_equals(this.tips, greetingPermission.tips);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "greetingpermission";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.tips;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tips == null) {
            this.tips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
