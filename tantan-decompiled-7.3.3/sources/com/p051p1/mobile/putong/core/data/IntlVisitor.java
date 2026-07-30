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
public class IntlVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlvisitor";

    @ProtobufIndex(index = 2)
    public double accessTime;

    @ProtobufIndex(index = 3)
    public int cover_id;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21172id;
    public static ProtobufAdapter<IntlVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlVisitor intlVisitor) {
            String str = intlVisitor.f21172id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, intlVisitor.accessTime) + CodedOutputByteBufferNano.m17281h(3, intlVisitor.cover_id);
            intlVisitor.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlVisitor parse(nc5 nc5Var) throws IOException {
            IntlVisitor intlVisitor = new IntlVisitor();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlVisitor.f21172id != null) {
                        break;
                    }
                    intlVisitor.f21172id = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlVisitor.f21172id = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    intlVisitor.accessTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 24) {
                        if (intlVisitor.f21172id != null) {
                            break;
                        }
                        intlVisitor.f21172id = "";
                        return intlVisitor;
                    }
                    intlVisitor.cover_id = nc5Var.m162486j();
                }
            }
            return intlVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlVisitor intlVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlVisitor.f21172id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, intlVisitor.accessTime);
            codedOutputByteBufferNano.m17305G(3, intlVisitor.cover_id);
        }
    };
    public static JsonAdapter<IntlVisitor> JSON_ADAPTER = new ObjectJsonAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlVisitor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    intlVisitor.f21172id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlVisitor intlVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = intlVisitor.f21172id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("accessTime", intlVisitor.accessTime);
            jsonGenerator.writeNumberField("cover_id", intlVisitor.cover_id);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public IntlVisitor mo225055clone() {
        IntlVisitor intlVisitor = new IntlVisitor();
        intlVisitor.f21172id = this.f21172id;
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
        return ValueObject.util_equals(this.f21172id, intlVisitor.f21172id) && this.accessTime == intlVisitor.accessTime && this.cover_id == intlVisitor.cover_id;
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
        String str = this.f21172id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.accessTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.cover_id;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21172id == null) {
            this.f21172id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
