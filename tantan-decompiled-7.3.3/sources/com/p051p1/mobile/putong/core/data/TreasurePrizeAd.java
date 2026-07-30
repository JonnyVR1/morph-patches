package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class TreasurePrizeAd extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "treasureprizead";

    @NonNull
    @ProtobufIndex(index = 2)
    public String prizeName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String prizeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textTemplate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;
    public static ProtobufAdapter<TreasurePrizeAd> PROTOBUF_ADAPTER = new MessageNanoAdapter<TreasurePrizeAd>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeAd.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TreasurePrizeAd treasurePrizeAd) {
            String str = treasurePrizeAd.userName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            treasurePrizeAd.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TreasurePrizeAd parse(nc5 nc5Var) throws IOException {
            TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (treasurePrizeAd.userName == null) {
                        treasurePrizeAd.userName = "";
                    }
                    if (treasurePrizeAd.prizeName == null) {
                        treasurePrizeAd.prizeName = "";
                    }
                    if (treasurePrizeAd.prizeType == null) {
                        treasurePrizeAd.prizeType = "";
                    }
                    if (treasurePrizeAd.textTemplate != null) {
                        break;
                    }
                    treasurePrizeAd.textTemplate = "";
                    break;
                }
                if (iM162497u == 10) {
                    treasurePrizeAd.userName = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    treasurePrizeAd.prizeName = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    treasurePrizeAd.prizeType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (treasurePrizeAd.userName == null) {
                            treasurePrizeAd.userName = "";
                        }
                        if (treasurePrizeAd.prizeName == null) {
                            treasurePrizeAd.prizeName = "";
                        }
                        if (treasurePrizeAd.prizeType == null) {
                            treasurePrizeAd.prizeType = "";
                        }
                        if (treasurePrizeAd.textTemplate != null) {
                            break;
                        }
                        treasurePrizeAd.textTemplate = "";
                        return treasurePrizeAd;
                    }
                    treasurePrizeAd.textTemplate = nc5Var.m162495s();
                }
            }
            return treasurePrizeAd;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TreasurePrizeAd treasurePrizeAd, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = treasurePrizeAd.userName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<TreasurePrizeAd> JSON_ADAPTER = new ObjectJsonAdapter<TreasurePrizeAd>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeAd.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TreasurePrizeAd.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TreasurePrizeAd newInstance() {
            return new TreasurePrizeAd();
        }

        public boolean parseField(TreasurePrizeAd treasurePrizeAd, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textTemplate":
                    treasurePrizeAd.textTemplate = jsonParser.getValueAsString();
                    return true;
                case "prizeName":
                    treasurePrizeAd.prizeName = jsonParser.getValueAsString();
                    return true;
                case "prizeType":
                    treasurePrizeAd.prizeType = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    treasurePrizeAd.userName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TreasurePrizeAd treasurePrizeAd, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "textTemplate":
                case "prizeName":
                case "prizeType":
                case "userName":
                    return true;
                default:
                    return super.parseFieldCheck(treasurePrizeAd, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TreasurePrizeAd treasurePrizeAd, JsonGenerator jsonGenerator) throws IOException {
            String str = treasurePrizeAd.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
            String str2 = treasurePrizeAd.prizeName;
            if (str2 != null) {
                jsonGenerator.writeStringField("prizeName", str2);
            }
            String str3 = treasurePrizeAd.prizeType;
            if (str3 != null) {
                jsonGenerator.writeStringField("prizeType", str3);
            }
            String str4 = treasurePrizeAd.textTemplate;
            if (str4 != null) {
                jsonGenerator.writeStringField("textTemplate", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TreasurePrizeAd) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TreasurePrizeAd) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TreasurePrizeAd new_() {
        TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
        treasurePrizeAd.nullCheck();
        return treasurePrizeAd;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TreasurePrizeAd mo225055clone() {
        TreasurePrizeAd treasurePrizeAd = new TreasurePrizeAd();
        treasurePrizeAd.userName = this.userName;
        treasurePrizeAd.prizeName = this.prizeName;
        treasurePrizeAd.prizeType = this.prizeType;
        treasurePrizeAd.textTemplate = this.textTemplate;
        return treasurePrizeAd;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreasurePrizeAd)) {
            return false;
        }
        TreasurePrizeAd treasurePrizeAd = (TreasurePrizeAd) obj;
        return ValueObject.util_equals(this.userName, treasurePrizeAd.userName) && ValueObject.util_equals(this.prizeName, treasurePrizeAd.prizeName) && ValueObject.util_equals(this.prizeType, treasurePrizeAd.prizeType) && ValueObject.util_equals(this.textTemplate, treasurePrizeAd.textTemplate);
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
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.prizeName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.prizeType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textTemplate;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.prizeName == null) {
            this.prizeName = "";
        }
        if (this.prizeType == null) {
            this.prizeType = "";
        }
        if (this.textTemplate == null) {
            this.textTemplate = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
