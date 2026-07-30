package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class IntlMarketConfigDataMeta extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigdatameta";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f20425id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @ProtobufIndex(index = 4)
    public int popups;

    @NonNull
    @ProtobufIndex(index = 2)
    public String template;
    public static ProtobufAdapter<IntlMarketConfigDataMeta> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigDataMeta>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigDataMeta.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketConfigDataMeta intlMarketConfigDataMeta) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, intlMarketConfigDataMeta.f20425id);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, intlMarketConfigDataMeta.popups);
            intlMarketConfigDataMeta.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketConfigDataMeta parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketConfigDataMeta.template == null) {
                        intlMarketConfigDataMeta.template = "";
                    }
                    if (intlMarketConfigDataMeta.name != null) {
                        break;
                    }
                    intlMarketConfigDataMeta.name = "";
                    break;
                }
                if (iM158752u == 8) {
                    intlMarketConfigDataMeta.f20425id = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    intlMarketConfigDataMeta.template = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlMarketConfigDataMeta.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        if (intlMarketConfigDataMeta.template == null) {
                            intlMarketConfigDataMeta.template = "";
                        }
                        if (intlMarketConfigDataMeta.name != null) {
                            break;
                        }
                        intlMarketConfigDataMeta.name = "";
                        return intlMarketConfigDataMeta;
                    }
                    intlMarketConfigDataMeta.popups = nb5Var.m158741j();
                }
            }
            return intlMarketConfigDataMeta;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketConfigDataMeta intlMarketConfigDataMeta, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, intlMarketConfigDataMeta.f20425id);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, intlMarketConfigDataMeta.popups);
        }
    };
    public static JsonAdapter<IntlMarketConfigDataMeta> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigDataMeta>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigDataMeta.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketConfigDataMeta.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketConfigDataMeta newInstance() {
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
                    intlMarketConfigDataMeta.f20425id = jsonParser.getValueAsInt();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketConfigDataMeta intlMarketConfigDataMeta, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", intlMarketConfigDataMeta.f20425id);
            jsonGenerator.writeNumberField("popups", intlMarketConfigDataMeta.popups);
            String str = intlMarketConfigDataMeta.template;
            if (str != null) {
                jsonGenerator.writeStringField("template", str);
            }
            String str2 = intlMarketConfigDataMeta.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigDataMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigDataMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigDataMeta new_() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
        intlMarketConfigDataMeta.nullCheck();
        return intlMarketConfigDataMeta;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketConfigDataMeta mo223809clone() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = new IntlMarketConfigDataMeta();
        intlMarketConfigDataMeta.f20425id = this.f20425id;
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
        return this.f20425id == intlMarketConfigDataMeta.f20425id && this.popups == intlMarketConfigDataMeta.popups && ValueObject.util_equals(this.template, intlMarketConfigDataMeta.template) && ValueObject.util_equals(this.name, intlMarketConfigDataMeta.name);
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
        int i2 = ((((i * 41) + this.f20425id) * 41) + this.popups) * 41;
        String str = this.template;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.template == null) {
            this.template = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
