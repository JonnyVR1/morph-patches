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
public class IntlMarketConfigDataMeta extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigdatameta";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f87id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String name;

    @ProtobufIndex(index = 4)
    public int popups;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String template;
    public static ProtobufAdapter<IntlMarketConfigDataMeta> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigDataMeta>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigDataMeta.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketConfigDataMeta intlMarketConfigDataMeta) {
            int iH = CodedOutputByteBufferNano.h(1, intlMarketConfigDataMeta.f87id);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, intlMarketConfigDataMeta.popups);
            ((MessageNano) intlMarketConfigDataMeta).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigDataMeta m13579parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketConfigDataMeta.template == null) {
                        intlMarketConfigDataMeta.template = "";
                    }
                    if (intlMarketConfigDataMeta.name != null) {
                        break;
                    }
                    intlMarketConfigDataMeta.name = "";
                    break;
                }
                if (iU == 8) {
                    intlMarketConfigDataMeta.f87id = nb5Var.j();
                } else if (iU == 18) {
                    intlMarketConfigDataMeta.template = nb5Var.s();
                } else if (iU == 26) {
                    intlMarketConfigDataMeta.name = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (intlMarketConfigDataMeta.template == null) {
                            intlMarketConfigDataMeta.template = "";
                        }
                        if (intlMarketConfigDataMeta.name != null) {
                            break;
                        }
                        intlMarketConfigDataMeta.name = "";
                        return intlMarketConfigDataMeta;
                    }
                    intlMarketConfigDataMeta.popups = nb5Var.j();
                }
            }
            return intlMarketConfigDataMeta;
        }

        public void serialize(IntlMarketConfigDataMeta intlMarketConfigDataMeta, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlMarketConfigDataMeta.f87id);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, intlMarketConfigDataMeta.popups);
        }
    };
    public static JsonAdapter<IntlMarketConfigDataMeta> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigDataMeta>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigDataMeta.2
        public Class getDataClass() {
            return IntlMarketConfigDataMeta.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigDataMeta m13580newInstance() {
            return new IntlMarketConfigDataMeta();
        }

        public boolean parseField(IntlMarketConfigDataMeta intlMarketConfigDataMeta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    intlMarketConfigDataMeta.template = jsonParser.getValueAsString();
                    return true;
                case "popups":
                    intlMarketConfigDataMeta.popups = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlMarketConfigDataMeta.f87id = jsonParser.getValueAsInt();
                    return false;
                case "name":
                    intlMarketConfigDataMeta.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketConfigDataMeta intlMarketConfigDataMeta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "template":
                case "popups":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketConfigDataMeta, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketConfigDataMeta intlMarketConfigDataMeta, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", intlMarketConfigDataMeta.f87id);
            jsonGenerator.writeNumberField("popups", intlMarketConfigDataMeta.popups);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                jsonGenerator.writeStringField("template", str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigDataMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigDataMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigDataMeta new_() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
        intlMarketConfigDataMeta.nullCheck();
        return intlMarketConfigDataMeta;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketConfigDataMeta m13578clone() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
        intlMarketConfigDataMeta.f87id = this.f87id;
        intlMarketConfigDataMeta.popups = this.popups;
        intlMarketConfigDataMeta.template = this.template;
        intlMarketConfigDataMeta.name = this.name;
        return intlMarketConfigDataMeta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketConfigDataMeta)) {
            return false;
        }
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = (IntlMarketConfigDataMeta) obj;
        return this.f87id == intlMarketConfigDataMeta.f87id && this.popups == intlMarketConfigDataMeta.popups && ValueObject.util_equals(this.template, intlMarketConfigDataMeta.template) && ValueObject.util_equals(this.name, intlMarketConfigDataMeta.name);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.f87id) * 41) + this.popups) * 41;
        String str = this.template;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.template == null) {
            this.template = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
