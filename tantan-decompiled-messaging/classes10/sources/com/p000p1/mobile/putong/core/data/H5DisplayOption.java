package com.p000p1.mobile.putong.core.data;

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
public class H5DisplayOption extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5displayoption";

    @ProtobufIndex(index = 1)
    public int tantanCoinBonus;
    public static ProtobufAdapter<H5DisplayOption> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5DisplayOption>() { // from class: com.p1.mobile.putong.core.data.H5DisplayOption.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5DisplayOption h5DisplayOption) {
            int iH = CodedOutputByteBufferNano.h(1, h5DisplayOption.tantanCoinBonus);
            ((MessageNano) h5DisplayOption).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5DisplayOption m13177parse(nb5 nb5Var) throws IOException {
            H5DisplayOption h5DisplayOption = new H5DisplayOption();
            while (nb5Var.u() == 8) {
                h5DisplayOption.tantanCoinBonus = nb5Var.j();
            }
            return h5DisplayOption;
        }

        public void serialize(H5DisplayOption h5DisplayOption, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, h5DisplayOption.tantanCoinBonus);
        }
    };
    public static JsonAdapter<H5DisplayOption> JSON_ADAPTER = new ObjectJsonAdapter<H5DisplayOption>() { // from class: com.p1.mobile.putong.core.data.H5DisplayOption.2
        public Class getDataClass() {
            return H5DisplayOption.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5DisplayOption m13178newInstance() {
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

        public void serializeFields(H5DisplayOption h5DisplayOption, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tantanCoinBonus", h5DisplayOption.tantanCoinBonus);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5DisplayOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5DisplayOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5DisplayOption new_() {
        H5DisplayOption h5DisplayOption = new H5DisplayOption();
        h5DisplayOption.nullCheck();
        return h5DisplayOption;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5DisplayOption m13176clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.tantanCoinBonus;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
