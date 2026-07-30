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
public class H5StockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5stockkeepunit";

    @NonNull
    @ProtobufIndex(index = 3)
    public H5DisplayOption extraDisplayOption;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20411id;

    @NonNull
    @ProtobufIndex(index = 4)
    public Prices prices;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<H5StockKeepUnit> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.H5StockKeepUnit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5StockKeepUnit h5StockKeepUnit) {
            String str = h5StockKeepUnit.f20411id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = h5StockKeepUnit.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            H5DisplayOption h5DisplayOption = h5StockKeepUnit.extraDisplayOption;
            if (h5DisplayOption != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, h5DisplayOption, H5DisplayOption.PROTOBUF_ADAPTER);
            }
            Prices prices = h5StockKeepUnit.prices;
            if (prices != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = h5StockKeepUnit.tracker;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            h5StockKeepUnit.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5StockKeepUnit parse(nb5 nb5Var) throws IOException {
            H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (h5StockKeepUnit.f20411id == null) {
                        h5StockKeepUnit.f20411id = "";
                    }
                    if (h5StockKeepUnit.type == null) {
                        h5StockKeepUnit.type = "";
                    }
                    if (h5StockKeepUnit.extraDisplayOption == null) {
                        h5StockKeepUnit.extraDisplayOption = H5DisplayOption.new_();
                    }
                    if (h5StockKeepUnit.prices == null) {
                        h5StockKeepUnit.prices = Prices.new_();
                    }
                    if (h5StockKeepUnit.tracker != null) {
                        break;
                    }
                    h5StockKeepUnit.tracker = "";
                    break;
                }
                if (iM158752u == 10) {
                    h5StockKeepUnit.f20411id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    h5StockKeepUnit.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    h5StockKeepUnit.extraDisplayOption = (H5DisplayOption) nb5Var.m158743l(H5DisplayOption.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    h5StockKeepUnit.prices = (Prices) nb5Var.m158743l(Prices.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (h5StockKeepUnit.f20411id == null) {
                            h5StockKeepUnit.f20411id = "";
                        }
                        if (h5StockKeepUnit.type == null) {
                            h5StockKeepUnit.type = "";
                        }
                        if (h5StockKeepUnit.extraDisplayOption == null) {
                            h5StockKeepUnit.extraDisplayOption = H5DisplayOption.new_();
                        }
                        if (h5StockKeepUnit.prices == null) {
                            h5StockKeepUnit.prices = Prices.new_();
                        }
                        if (h5StockKeepUnit.tracker != null) {
                            break;
                        }
                        h5StockKeepUnit.tracker = "";
                        return h5StockKeepUnit;
                    }
                    h5StockKeepUnit.tracker = nb5Var.m158750s();
                }
            }
            return h5StockKeepUnit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5StockKeepUnit h5StockKeepUnit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5StockKeepUnit.f20411id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = h5StockKeepUnit.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            H5DisplayOption h5DisplayOption = h5StockKeepUnit.extraDisplayOption;
            if (h5DisplayOption != null) {
                codedOutputByteBufferNano.m17254K(3, h5DisplayOption, H5DisplayOption.PROTOBUF_ADAPTER);
            }
            Prices prices = h5StockKeepUnit.prices;
            if (prices != null) {
                codedOutputByteBufferNano.m17254K(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = h5StockKeepUnit.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<H5StockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<H5StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.H5StockKeepUnit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5StockKeepUnit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5StockKeepUnit newInstance() {
            return new H5StockKeepUnit();
        }

        public boolean parseField(H5StockKeepUnit h5StockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    h5StockKeepUnit.tracker = jsonParser.getValueAsString();
                    return true;
                case "prices":
                    h5StockKeepUnit.prices = Prices.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "extraDisplayOption":
                    h5StockKeepUnit.extraDisplayOption = H5DisplayOption.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    h5StockKeepUnit.f20411id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    h5StockKeepUnit.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(H5StockKeepUnit h5StockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "prices":
                case "extraDisplayOption":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(h5StockKeepUnit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5StockKeepUnit h5StockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = h5StockKeepUnit.f20411id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = h5StockKeepUnit.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (h5StockKeepUnit.extraDisplayOption != null) {
                jsonGenerator.writeFieldName("extraDisplayOption");
                H5DisplayOption.JSON_ADAPTER.serialize(h5StockKeepUnit.extraDisplayOption, jsonGenerator, true);
            }
            if (h5StockKeepUnit.prices != null) {
                jsonGenerator.writeFieldName(Prices.TYPE);
                Prices.JSON_ADAPTER.serialize(h5StockKeepUnit.prices, jsonGenerator, true);
            }
            String str3 = h5StockKeepUnit.tracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("tracker", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5StockKeepUnit new_() {
        H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
        h5StockKeepUnit.nullCheck();
        return h5StockKeepUnit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5StockKeepUnit mo223809clone() {
        H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
        h5StockKeepUnit.f20411id = this.f20411id;
        h5StockKeepUnit.type = this.type;
        H5DisplayOption h5DisplayOption = this.extraDisplayOption;
        if (h5DisplayOption != null) {
            h5StockKeepUnit.extraDisplayOption = h5DisplayOption.mo223809clone();
        }
        Prices prices = this.prices;
        if (prices != null) {
            h5StockKeepUnit.prices = prices.mo223809clone();
        }
        h5StockKeepUnit.tracker = this.tracker;
        return h5StockKeepUnit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5StockKeepUnit)) {
            return false;
        }
        H5StockKeepUnit h5StockKeepUnit = (H5StockKeepUnit) obj;
        return ValueObject.util_equals(this.f20411id, h5StockKeepUnit.f20411id) && ValueObject.util_equals(this.type, h5StockKeepUnit.type) && ValueObject.util_equals(this.extraDisplayOption, h5StockKeepUnit.extraDisplayOption) && ValueObject.util_equals(this.prices, h5StockKeepUnit.prices) && ValueObject.util_equals(this.tracker, h5StockKeepUnit.tracker);
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
        String str = this.f20411id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        H5DisplayOption h5DisplayOption = this.extraDisplayOption;
        int iHashCode3 = (iHashCode2 + (h5DisplayOption != null ? h5DisplayOption.hashCode() : 0)) * 41;
        Prices prices = this.prices;
        int iHashCode4 = (iHashCode3 + (prices != null ? prices.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20411id == null) {
            this.f20411id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.extraDisplayOption == null) {
            this.extraDisplayOption = H5DisplayOption.new_();
        }
        if (this.prices == null) {
            this.prices = Prices.new_();
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
