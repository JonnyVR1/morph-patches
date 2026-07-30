package com.p046p1.mobile.putong.core.data;

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
public class H5DisplayOption extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5displayoption";

    @ProtobufIndex(index = 1)
    public int tantanCoinBonus;
    public static ProtobufAdapter<H5DisplayOption> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5DisplayOption>() { // from class: com.p1.mobile.putong.core.data.H5DisplayOption.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5DisplayOption h5DisplayOption) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, h5DisplayOption.tantanCoinBonus);
            h5DisplayOption.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5DisplayOption parse(nb5 nb5Var) throws IOException {
            H5DisplayOption h5DisplayOption = new H5DisplayOption();
            while (nb5Var.m158752u() == 8) {
                h5DisplayOption.tantanCoinBonus = nb5Var.m158741j();
            }
            return h5DisplayOption;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5DisplayOption h5DisplayOption, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, h5DisplayOption.tantanCoinBonus);
        }
    };
    public static JsonAdapter<H5DisplayOption> JSON_ADAPTER = new ObjectJsonAdapter<H5DisplayOption>() { // from class: com.p1.mobile.putong.core.data.H5DisplayOption.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5DisplayOption.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5DisplayOption newInstance() {
            return new H5DisplayOption();
        }

        public boolean parseField(H5DisplayOption h5DisplayOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("tantanCoinBonus")) {
                return false;
            }
            h5DisplayOption.tantanCoinBonus = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(H5DisplayOption h5DisplayOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tantanCoinBonus")) {
                return true;
            }
            return super.parseFieldCheck(h5DisplayOption, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5DisplayOption h5DisplayOption, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tantanCoinBonus", h5DisplayOption.tantanCoinBonus);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5DisplayOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5DisplayOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5DisplayOption new_() {
        H5DisplayOption h5DisplayOption = new H5DisplayOption();
        h5DisplayOption.nullCheck();
        return h5DisplayOption;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5DisplayOption mo223809clone() {
        H5DisplayOption h5DisplayOption = new H5DisplayOption();
        h5DisplayOption.tantanCoinBonus = this.tantanCoinBonus;
        return h5DisplayOption;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof H5DisplayOption) && this.tantanCoinBonus == ((H5DisplayOption) obj).tantanCoinBonus;
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
        int i2 = (i * 41) + this.tantanCoinBonus;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
