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
public class MerchandiseDurationDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "merchandisedurationdesc";

    @NonNull
    @ProtobufIndex(index = 2)
    public String timeUnit;

    @ProtobufIndex(index = 1)
    public int times;
    public static ProtobufAdapter<MerchandiseDurationDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<MerchandiseDurationDesc>() { // from class: com.p1.mobile.putong.core.data.MerchandiseDurationDesc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MerchandiseDurationDesc merchandiseDurationDesc) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            merchandiseDurationDesc.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MerchandiseDurationDesc parse(nc5 nc5Var) throws IOException {
            MerchandiseDurationDesc merchandiseDurationDesc = new MerchandiseDurationDesc();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (merchandiseDurationDesc.timeUnit != null) {
                        break;
                    }
                    merchandiseDurationDesc.timeUnit = "";
                    break;
                }
                if (iM162497u == 8) {
                    merchandiseDurationDesc.times = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (merchandiseDurationDesc.timeUnit != null) {
                            break;
                        }
                        merchandiseDurationDesc.timeUnit = "";
                        return merchandiseDurationDesc;
                    }
                    merchandiseDurationDesc.timeUnit = nc5Var.m162495s();
                }
            }
            return merchandiseDurationDesc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MerchandiseDurationDesc merchandiseDurationDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<MerchandiseDurationDesc> JSON_ADAPTER = new ObjectJsonAdapter<MerchandiseDurationDesc>() { // from class: com.p1.mobile.putong.core.data.MerchandiseDurationDesc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MerchandiseDurationDesc.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MerchandiseDurationDesc newInstance() {
            return new MerchandiseDurationDesc();
        }

        public boolean parseField(MerchandiseDurationDesc merchandiseDurationDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("timeUnit")) {
                merchandiseDurationDesc.timeUnit = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("times")) {
                return false;
            }
            merchandiseDurationDesc.times = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MerchandiseDurationDesc merchandiseDurationDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("timeUnit") || str.equals("times")) {
                return true;
            }
            return super.parseFieldCheck(merchandiseDurationDesc, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MerchandiseDurationDesc merchandiseDurationDesc, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("times", merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                jsonGenerator.writeStringField("timeUnit", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MerchandiseDurationDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MerchandiseDurationDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MerchandiseDurationDesc new_() {
        MerchandiseDurationDesc merchandiseDurationDesc = new MerchandiseDurationDesc();
        merchandiseDurationDesc.nullCheck();
        return merchandiseDurationDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MerchandiseDurationDesc mo225055clone() {
        MerchandiseDurationDesc merchandiseDurationDesc = new MerchandiseDurationDesc();
        merchandiseDurationDesc.times = this.times;
        merchandiseDurationDesc.timeUnit = this.timeUnit;
        return merchandiseDurationDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MerchandiseDurationDesc)) {
            return false;
        }
        MerchandiseDurationDesc merchandiseDurationDesc = (MerchandiseDurationDesc) obj;
        return this.times == merchandiseDurationDesc.times && ValueObject.util_equals(this.timeUnit, merchandiseDurationDesc.timeUnit);
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
        int i2 = ((i * 41) + this.times) * 41;
        String str = this.timeUnit;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.timeUnit == null) {
            this.timeUnit = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
