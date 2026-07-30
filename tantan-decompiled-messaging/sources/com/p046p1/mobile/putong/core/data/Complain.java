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
public class Complain extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complain";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20371id;

    @ProtobufIndex(index = 3)
    public boolean splashScreenForward;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Complain> PROTOBUF_ADAPTER = new MessageNanoAdapter<Complain>() { // from class: com.p1.mobile.putong.core.data.Complain.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Complain complain) {
            String str = complain.f20371id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = complain.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, complain.splashScreenForward);
            complain.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Complain parse(nb5 nb5Var) throws IOException {
            Complain complain = new Complain();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (complain.f20371id == null) {
                        complain.f20371id = "";
                    }
                    if (complain.type != null) {
                        break;
                    }
                    complain.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    complain.f20371id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    complain.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (complain.f20371id == null) {
                            complain.f20371id = "";
                        }
                        if (complain.type != null) {
                            break;
                        }
                        complain.type = "";
                        return complain;
                    }
                    complain.splashScreenForward = nb5Var.m158738g();
                }
            }
            return complain;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Complain complain, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = complain.f20371id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = complain.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, complain.splashScreenForward);
        }
    };
    public static JsonAdapter<Complain> JSON_ADAPTER = new ObjectJsonAdapter<Complain>() { // from class: com.p1.mobile.putong.core.data.Complain.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Complain.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Complain newInstance() {
            return new Complain();
        }

        public boolean parseField(Complain complain, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    complain.f20371id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    complain.type = jsonParser.getValueAsString();
                    return true;
                case "splashScreenForward":
                    complain.splashScreenForward = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Complain complain, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "splashScreenForward":
                    return true;
                default:
                    return super.parseFieldCheck(complain, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Complain complain, JsonGenerator jsonGenerator) throws IOException {
            String str = complain.f20371id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = complain.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("splashScreenForward", complain.splashScreenForward);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Complain) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Complain) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Complain new_() {
        Complain complain = new Complain();
        complain.nullCheck();
        return complain;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Complain mo223809clone() {
        Complain complain = new Complain();
        complain.f20371id = this.f20371id;
        complain.type = this.type;
        complain.splashScreenForward = this.splashScreenForward;
        return complain;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complain)) {
            return false;
        }
        Complain complain = (Complain) obj;
        return ValueObject.util_equals(this.f20371id, complain.f20371id) && ValueObject.util_equals(this.type, complain.type) && this.splashScreenForward == complain.splashScreenForward;
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
        String str = this.f20371id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.splashScreenForward ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20371id == null) {
            this.f20371id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
