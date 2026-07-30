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
public class MerchandiseExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "merchandiseextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String discountText;
    public static ProtobufAdapter<MerchandiseExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MerchandiseExtra>() { // from class: com.p1.mobile.putong.core.data.MerchandiseExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MerchandiseExtra merchandiseExtra) {
            String str = merchandiseExtra.discountText;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            merchandiseExtra.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MerchandiseExtra parse(nb5 nb5Var) throws IOException {
            MerchandiseExtra merchandiseExtra = new MerchandiseExtra();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (merchandiseExtra.discountText != null) {
                        break;
                    }
                    merchandiseExtra.discountText = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (merchandiseExtra.discountText != null) {
                        break;
                    }
                    merchandiseExtra.discountText = "";
                    return merchandiseExtra;
                }
                merchandiseExtra.discountText = nb5Var.m158750s();
            }
            return merchandiseExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MerchandiseExtra merchandiseExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = merchandiseExtra.discountText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<MerchandiseExtra> JSON_ADAPTER = new ObjectJsonAdapter<MerchandiseExtra>() { // from class: com.p1.mobile.putong.core.data.MerchandiseExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MerchandiseExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MerchandiseExtra newInstance() {
            return new MerchandiseExtra();
        }

        public boolean parseField(MerchandiseExtra merchandiseExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("discountText")) {
                return false;
            }
            merchandiseExtra.discountText = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MerchandiseExtra merchandiseExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("discountText")) {
                return true;
            }
            return super.parseFieldCheck(merchandiseExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MerchandiseExtra merchandiseExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = merchandiseExtra.discountText;
            if (str != null) {
                jsonGenerator.writeStringField("discountText", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MerchandiseExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MerchandiseExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MerchandiseExtra new_() {
        MerchandiseExtra merchandiseExtra = new MerchandiseExtra();
        merchandiseExtra.nullCheck();
        return merchandiseExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MerchandiseExtra mo223809clone() {
        MerchandiseExtra merchandiseExtra = new MerchandiseExtra();
        merchandiseExtra.discountText = this.discountText;
        return merchandiseExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MerchandiseExtra) {
            return ValueObject.util_equals(this.discountText, ((MerchandiseExtra) obj).discountText);
        }
        return false;
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
        String str = this.discountText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.discountText == null) {
            this.discountText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
