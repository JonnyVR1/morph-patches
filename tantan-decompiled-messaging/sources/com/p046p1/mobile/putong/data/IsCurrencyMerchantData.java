package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class IsCurrencyMerchantData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "iscurrencymerchantdata";

    @ProtobufIndex(index = 1)
    public boolean isCoiner;

    @ProtobufIndex(index = 2)
    public boolean isDiamondCoiner;
    public static ProtobufAdapter<IsCurrencyMerchantData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IsCurrencyMerchantData>() { // from class: com.p1.mobile.putong.data.IsCurrencyMerchantData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IsCurrencyMerchantData isCurrencyMerchantData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, isCurrencyMerchantData.isCoiner) + CodedOutputByteBufferNano.m17220b(2, isCurrencyMerchantData.isDiamondCoiner);
            isCurrencyMerchantData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IsCurrencyMerchantData parse(nb5 nb5Var) throws IOException {
            IsCurrencyMerchantData isCurrencyMerchantData = new IsCurrencyMerchantData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    isCurrencyMerchantData.isCoiner = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return isCurrencyMerchantData;
                    }
                    isCurrencyMerchantData.isDiamondCoiner = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IsCurrencyMerchantData isCurrencyMerchantData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, isCurrencyMerchantData.isCoiner);
            codedOutputByteBufferNano.m17244A(2, isCurrencyMerchantData.isDiamondCoiner);
        }
    };
    public static JsonAdapter<IsCurrencyMerchantData> JSON_ADAPTER = new ObjectJsonAdapter<IsCurrencyMerchantData>() { // from class: com.p1.mobile.putong.data.IsCurrencyMerchantData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IsCurrencyMerchantData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IsCurrencyMerchantData newInstance() {
            return new IsCurrencyMerchantData();
        }

        public boolean parseField(IsCurrencyMerchantData isCurrencyMerchantData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isCoiner")) {
                isCurrencyMerchantData.isCoiner = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isDiamondCoiner")) {
                return false;
            }
            isCurrencyMerchantData.isDiamondCoiner = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(IsCurrencyMerchantData isCurrencyMerchantData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isCoiner") || str.equals("isDiamondCoiner")) {
                return true;
            }
            return super.parseFieldCheck(isCurrencyMerchantData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IsCurrencyMerchantData isCurrencyMerchantData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isCoiner", isCurrencyMerchantData.isCoiner);
            jsonGenerator.writeBooleanField("isDiamondCoiner", isCurrencyMerchantData.isDiamondCoiner);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IsCurrencyMerchantData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IsCurrencyMerchantData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IsCurrencyMerchantData new_() {
        IsCurrencyMerchantData isCurrencyMerchantData = new IsCurrencyMerchantData();
        isCurrencyMerchantData.nullCheck();
        return isCurrencyMerchantData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IsCurrencyMerchantData mo223809clone() {
        IsCurrencyMerchantData isCurrencyMerchantData = new IsCurrencyMerchantData();
        isCurrencyMerchantData.isCoiner = this.isCoiner;
        isCurrencyMerchantData.isDiamondCoiner = this.isDiamondCoiner;
        return isCurrencyMerchantData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsCurrencyMerchantData)) {
            return false;
        }
        IsCurrencyMerchantData isCurrencyMerchantData = (IsCurrencyMerchantData) obj;
        return this.isCoiner == isCurrencyMerchantData.isCoiner && this.isDiamondCoiner == isCurrencyMerchantData.isDiamondCoiner;
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
        int i2 = (((i * 41) + (this.isCoiner ? 1231 : 1237)) * 41) + (this.isDiamondCoiner ? 1231 : 1237);
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
