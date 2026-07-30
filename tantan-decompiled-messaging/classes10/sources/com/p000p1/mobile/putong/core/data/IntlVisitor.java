package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlvisitor";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double accessTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int cover_id;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f92id;
    public static ProtobufAdapter<IntlVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlVisitor intlVisitor) {
            String str = intlVisitor.f92id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, intlVisitor.accessTime) + CodedOutputByteBufferNano.h(3, intlVisitor.cover_id);
            ((MessageNano) intlVisitor).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlVisitor m13727parse(nb5 nb5Var) throws IOException {
            IntlVisitor intlVisitor = new IntlVisitor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlVisitor.f92id != null) {
                        break;
                    }
                    intlVisitor.f92id = "";
                    break;
                }
                if (iU == 10) {
                    intlVisitor.f92id = nb5Var.s();
                } else if (iU == 17) {
                    intlVisitor.accessTime = nb5Var.h();
                } else {
                    if (iU != 24) {
                        if (intlVisitor.f92id != null) {
                            break;
                        }
                        intlVisitor.f92id = "";
                        return intlVisitor;
                    }
                    intlVisitor.cover_id = nb5Var.j();
                }
            }
            return intlVisitor;
        }

        public void serialize(IntlVisitor intlVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlVisitor.f92id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, intlVisitor.accessTime);
            codedOutputByteBufferNano.G(3, intlVisitor.cover_id);
        }
    };
    public static JsonAdapter<IntlVisitor> JSON_ADAPTER = new ObjectJsonAdapter<IntlVisitor>() { // from class: com.p1.mobile.putong.core.data.IntlVisitor.2
        public Class getDataClass() {
            return IntlVisitor.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlVisitor m13728newInstance() {
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
                    intlVisitor.f92id = jsonParser.getValueAsString();
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

        public void serializeFields(IntlVisitor intlVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = intlVisitor.f92id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("accessTime", intlVisitor.accessTime);
            jsonGenerator.writeNumberField("cover_id", intlVisitor.cover_id);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlVisitor new_() {
        IntlVisitor intlVisitor = new IntlVisitor();
        intlVisitor.nullCheck();
        return intlVisitor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlVisitor m13726clone() {
        IntlVisitor intlVisitor = new IntlVisitor();
        intlVisitor.f92id = this.f92id;
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
        return ValueObject.util_equals(this.f92id, intlVisitor.f92id) && this.accessTime == intlVisitor.accessTime && this.cover_id == intlVisitor.cover_id;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f92id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.accessTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.cover_id;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f92id == null) {
            this.f92id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
