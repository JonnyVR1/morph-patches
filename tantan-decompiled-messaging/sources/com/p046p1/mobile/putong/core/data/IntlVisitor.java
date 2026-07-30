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
public class IntlVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlvisitor";

    @ProtobufIndex(index = 2)
    public double accessTime;

    @ProtobufIndex(index = 3)
    public int cover_id;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20430id;
    public static ProtobufAdapter<IntlVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlVisitor intlVisitor) {
            String str = intlVisitor.f20430id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17222d(2, intlVisitor.accessTime) + CodedOutputByteBufferNano.m17226h(3, intlVisitor.cover_id);
            intlVisitor.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlVisitor parse(nb5 nb5Var) throws IOException {
            IntlVisitor intlVisitor = new IntlVisitor();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlVisitor.f20430id != null) {
                        break;
                    }
                    intlVisitor.f20430id = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlVisitor.f20430id = nb5Var.m158750s();
                } else if (iM158752u == 17) {
                    intlVisitor.accessTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 24) {
                        if (intlVisitor.f20430id != null) {
                            break;
                        }
                        intlVisitor.f20430id = "";
                        return intlVisitor;
                    }
                    intlVisitor.cover_id = nb5Var.m158741j();
                }
            }
            return intlVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlVisitor intlVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlVisitor.f20430id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17246C(2, intlVisitor.accessTime);
            codedOutputByteBufferNano.m17250G(3, intlVisitor.cover_id);
        }
    };
    public static JsonAdapter<IntlVisitor> JSON_ADAPTER = new ObjectJsonAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlVisitor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlVisitor newInstance() {
            return new IntlVisitor();
        }

        public boolean parseField(IntlVisitor intlVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "accessTime":
                    intlVisitor.accessTime = jsonParser.getValueAsDouble();
                    return true;
                case "cover_id":
                    intlVisitor.cover_id = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlVisitor.f20430id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlVisitor intlVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "accessTime":
                case "cover_id":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(intlVisitor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlVisitor intlVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = intlVisitor.f20430id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("accessTime", intlVisitor.accessTime);
            jsonGenerator.writeNumberField("cover_id", intlVisitor.cover_id);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlVisitor new_() {
        IntlVisitor intlVisitor = new IntlVisitor();
        intlVisitor.nullCheck();
        return intlVisitor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlVisitor mo223809clone() {
        IntlVisitor intlVisitor = new IntlVisitor();
        intlVisitor.f20430id = this.f20430id;
        intlVisitor.accessTime = this.accessTime;
        intlVisitor.cover_id = this.cover_id;
        return intlVisitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlVisitor)) {
            return false;
        }
        IntlVisitor intlVisitor = (IntlVisitor) obj;
        return ValueObject.util_equals(this.f20430id, intlVisitor.f20430id) && this.accessTime == intlVisitor.accessTime && this.cover_id == intlVisitor.cover_id;
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
        String str = this.f20430id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.accessTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.cover_id;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20430id == null) {
            this.f20430id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
