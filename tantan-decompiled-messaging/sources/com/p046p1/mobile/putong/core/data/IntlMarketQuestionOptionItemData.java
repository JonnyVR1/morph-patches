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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketQuestionOptionItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionoptionitemdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @ProtobufIndex(index = 1)
    public int oid;
    public static ProtobufAdapter<IntlMarketQuestionOptionItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionOptionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            intlMarketQuestionOptionItemData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketQuestionOptionItemData parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketQuestionOptionItemData.desc != null) {
                        break;
                    }
                    intlMarketQuestionOptionItemData.desc = "";
                    break;
                }
                if (iM158752u == 8) {
                    intlMarketQuestionOptionItemData.oid = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (intlMarketQuestionOptionItemData.desc != null) {
                            break;
                        }
                        intlMarketQuestionOptionItemData.desc = "";
                        return intlMarketQuestionOptionItemData;
                    }
                    intlMarketQuestionOptionItemData.desc = nb5Var.m158750s();
                }
            }
            return intlMarketQuestionOptionItemData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionOptionItemData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionOptionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketQuestionOptionItemData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketQuestionOptionItemData newInstance() {
            return new IntlMarketQuestionOptionItemData();
        }

        public boolean parseField(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("oid")) {
                intlMarketQuestionOptionItemData.oid = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(SocialConstants.PARAM_APP_DESC)) {
                return false;
            }
            intlMarketQuestionOptionItemData.desc = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("oid") || str.equals(SocialConstants.PARAM_APP_DESC)) {
                return true;
            }
            return super.parseFieldCheck(intlMarketQuestionOptionItemData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("oid", intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionOptionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionOptionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionOptionItemData new_() {
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
        intlMarketQuestionOptionItemData.nullCheck();
        return intlMarketQuestionOptionItemData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketQuestionOptionItemData mo223809clone() {
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
        intlMarketQuestionOptionItemData.oid = this.oid;
        intlMarketQuestionOptionItemData.desc = this.desc;
        return intlMarketQuestionOptionItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionOptionItemData)) {
            return false;
        }
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = (IntlMarketQuestionOptionItemData) obj;
        return this.oid == intlMarketQuestionOptionItemData.oid && ValueObject.util_equals(this.desc, intlMarketQuestionOptionItemData.desc);
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
        int i2 = ((i * 41) + this.oid) * 41;
        String str = this.desc;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
