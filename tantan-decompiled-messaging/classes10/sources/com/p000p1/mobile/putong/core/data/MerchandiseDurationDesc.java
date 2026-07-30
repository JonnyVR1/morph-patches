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
public class MerchandiseDurationDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "merchandisedurationdesc";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String timeUnit;

    @ProtobufIndex(index = 1)
    public int times;
    public static ProtobufAdapter<MerchandiseDurationDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<MerchandiseDurationDesc>() { // from class: com.p1.mobile.putong.core.data.MerchandiseDurationDesc.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MerchandiseDurationDesc merchandiseDurationDesc) {
            int iH = CodedOutputByteBufferNano.h(1, merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) merchandiseDurationDesc).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MerchandiseDurationDesc m14143parse(nb5 nb5Var) throws IOException {
            MerchandiseDurationDesc merchandiseDurationDesc = new MerchandiseDurationDesc();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (merchandiseDurationDesc.timeUnit != null) {
                        break;
                    }
                    merchandiseDurationDesc.timeUnit = "";
                    break;
                }
                if (iU == 8) {
                    merchandiseDurationDesc.times = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (merchandiseDurationDesc.timeUnit != null) {
                            break;
                        }
                        merchandiseDurationDesc.timeUnit = "";
                        return merchandiseDurationDesc;
                    }
                    merchandiseDurationDesc.timeUnit = nb5Var.s();
                }
            }
            return merchandiseDurationDesc;
        }

        public void serialize(MerchandiseDurationDesc merchandiseDurationDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<MerchandiseDurationDesc> JSON_ADAPTER = new ObjectJsonAdapter<MerchandiseDurationDesc>() { // from class: com.p1.mobile.putong.core.data.MerchandiseDurationDesc.2
        public Class getDataClass() {
            return MerchandiseDurationDesc.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MerchandiseDurationDesc m14144newInstance() {
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

        public void serializeFields(MerchandiseDurationDesc merchandiseDurationDesc, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("times", merchandiseDurationDesc.times);
            String str = merchandiseDurationDesc.timeUnit;
            if (str != null) {
                jsonGenerator.writeStringField("timeUnit", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MerchandiseDurationDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MerchandiseDurationDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MerchandiseDurationDesc new_() {
        MerchandiseDurationDesc merchandiseDurationDesc = new MerchandiseDurationDesc();
        merchandiseDurationDesc.nullCheck();
        return merchandiseDurationDesc;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MerchandiseDurationDesc m14142clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.times) * 41;
        String str = this.timeUnit;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.timeUnit == null) {
            this.timeUnit = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
