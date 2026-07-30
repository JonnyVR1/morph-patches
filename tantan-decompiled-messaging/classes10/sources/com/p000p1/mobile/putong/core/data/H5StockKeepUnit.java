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
public class H5StockKeepUnit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5stockkeepunit";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public H5DisplayOption extraDisplayOption;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f73id;

    @NonNull
    @ProtobufIndex(index = 4)
    public Prices prices;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<H5StockKeepUnit> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.H5StockKeepUnit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5StockKeepUnit h5StockKeepUnit) {
            String str = h5StockKeepUnit.f73id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = h5StockKeepUnit.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            H5DisplayOption h5DisplayOption = h5StockKeepUnit.extraDisplayOption;
            if (h5DisplayOption != null) {
                iO += CodedOutputByteBufferNano.l(3, h5DisplayOption, H5DisplayOption.PROTOBUF_ADAPTER);
            }
            Prices prices = h5StockKeepUnit.prices;
            if (prices != null) {
                iO += CodedOutputByteBufferNano.l(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = h5StockKeepUnit.tracker;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) h5StockKeepUnit).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5StockKeepUnit m13215parse(nb5 nb5Var) throws IOException {
            H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5StockKeepUnit.f73id == null) {
                        h5StockKeepUnit.f73id = "";
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
                if (iU == 10) {
                    h5StockKeepUnit.f73id = nb5Var.s();
                } else if (iU == 18) {
                    h5StockKeepUnit.type = nb5Var.s();
                } else if (iU == 26) {
                    h5StockKeepUnit.extraDisplayOption = (H5DisplayOption) nb5Var.l(H5DisplayOption.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    h5StockKeepUnit.prices = (Prices) nb5Var.l(Prices.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (h5StockKeepUnit.f73id == null) {
                            h5StockKeepUnit.f73id = "";
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
                    h5StockKeepUnit.tracker = nb5Var.s();
                }
            }
            return h5StockKeepUnit;
        }

        public void serialize(H5StockKeepUnit h5StockKeepUnit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5StockKeepUnit.f73id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = h5StockKeepUnit.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            H5DisplayOption h5DisplayOption = h5StockKeepUnit.extraDisplayOption;
            if (h5DisplayOption != null) {
                codedOutputByteBufferNano.K(3, h5DisplayOption, H5DisplayOption.PROTOBUF_ADAPTER);
            }
            Prices prices = h5StockKeepUnit.prices;
            if (prices != null) {
                codedOutputByteBufferNano.K(4, prices, Prices.PROTOBUF_ADAPTER);
            }
            String str3 = h5StockKeepUnit.tracker;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<H5StockKeepUnit> JSON_ADAPTER = new ObjectJsonAdapter<H5StockKeepUnit>() { // from class: com.p1.mobile.putong.core.data.H5StockKeepUnit.2
        public Class getDataClass() {
            return H5StockKeepUnit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5StockKeepUnit m13216newInstance() {
            return new H5StockKeepUnit();
        }

        public boolean parseField(H5StockKeepUnit h5StockKeepUnit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    h5StockKeepUnit.tracker = jsonParser.getValueAsString();
                    return true;
                case "prices":
                    h5StockKeepUnit.prices = (Prices) Prices.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "extraDisplayOption":
                    h5StockKeepUnit.extraDisplayOption = (H5DisplayOption) H5DisplayOption.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    h5StockKeepUnit.f73id = jsonParser.getValueAsString();
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

        public void serializeFields(H5StockKeepUnit h5StockKeepUnit, JsonGenerator jsonGenerator) throws IOException {
            String str = h5StockKeepUnit.f73id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5StockKeepUnit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5StockKeepUnit new_() {
        H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
        h5StockKeepUnit.nullCheck();
        return h5StockKeepUnit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5StockKeepUnit m13214clone() {
        H5StockKeepUnit h5StockKeepUnit = new H5StockKeepUnit();
        h5StockKeepUnit.f73id = this.f73id;
        h5StockKeepUnit.type = this.type;
        H5DisplayOption h5DisplayOption = this.extraDisplayOption;
        if (h5DisplayOption != null) {
            h5StockKeepUnit.extraDisplayOption = h5DisplayOption.m13176clone();
        }
        Prices prices = this.prices;
        if (prices != null) {
            h5StockKeepUnit.prices = prices.m14844clone();
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
        return ValueObject.util_equals(this.f73id, h5StockKeepUnit.f73id) && ValueObject.util_equals(this.type, h5StockKeepUnit.type) && ValueObject.util_equals(this.extraDisplayOption, h5StockKeepUnit.extraDisplayOption) && ValueObject.util_equals(this.prices, h5StockKeepUnit.prices) && ValueObject.util_equals(this.tracker, h5StockKeepUnit.tracker);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f73id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        H5DisplayOption h5DisplayOption = this.extraDisplayOption;
        int iHashCode3 = (iHashCode2 + (h5DisplayOption != null ? h5DisplayOption.hashCode() : 0)) * 41;
        Prices prices = this.prices;
        int iHashCode4 = (iHashCode3 + (prices != null ? prices.hashCode() : 0)) * 41;
        String str3 = this.tracker;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f73id == null) {
            this.f73id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
