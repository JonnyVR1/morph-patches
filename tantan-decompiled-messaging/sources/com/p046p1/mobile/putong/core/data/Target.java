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
public class Target extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "target";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f20520id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<Target> PROTOBUF_ADAPTER = new MessageNanoAdapter<Target>() { // from class: com.p1.mobile.putong.core.data.Target.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Target target) {
            String str = target.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = target.f20520id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            target.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Target parse(nb5 nb5Var) throws IOException {
            Target target = new Target();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (target.type == null) {
                        target.type = "";
                    }
                    if (target.f20520id != null) {
                        break;
                    }
                    target.f20520id = "";
                    break;
                }
                if (iM158752u == 10) {
                    target.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (target.type == null) {
                            target.type = "";
                        }
                        if (target.f20520id != null) {
                            break;
                        }
                        target.f20520id = "";
                        return target;
                    }
                    target.f20520id = nb5Var.m158750s();
                }
            }
            return target;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Target target, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = target.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = target.f20520id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<Target> JSON_ADAPTER = new ObjectJsonAdapter<Target>() { // from class: com.p1.mobile.putong.core.data.Target.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Target.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Target newInstance() {
            return new Target();
        }

        public boolean parseField(Target target, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                target.f20520id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            target.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Target target, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(target, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Target target, JsonGenerator jsonGenerator) throws IOException {
            String str = target.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = target.f20520id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Target) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Target) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Target new_() {
        Target target = new Target();
        target.nullCheck();
        return target;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Target mo223809clone() {
        Target target = new Target();
        target.type = this.type;
        target.f20520id = this.f20520id;
        return target;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        return ValueObject.util_equals(this.type, target.type) && ValueObject.util_equals(this.f20520id, target.f20520id);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f20520id;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f20520id == null) {
            this.f20520id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
