package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ODiamondVisitorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondvisitorinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String visitCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String visitCountStr;

    @NonNull
    @ProtobufIndex(index = 4)
    public String visitTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String visitTimeStr;
    public static ProtobufAdapter<ODiamondVisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondVisitorInfo>() { // from class: com.p1.mobile.putong.data.ODiamondVisitorInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondVisitorInfo oDiamondVisitorInfo) {
            String str = oDiamondVisitorInfo.visitCountStr;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oDiamondVisitorInfo.visitTimeStr;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = oDiamondVisitorInfo.visitCount;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = oDiamondVisitorInfo.visitTime;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            oDiamondVisitorInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondVisitorInfo parse(nc5 nc5Var) throws IOException {
            ODiamondVisitorInfo oDiamondVisitorInfo = new ODiamondVisitorInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondVisitorInfo.visitCountStr == null) {
                        oDiamondVisitorInfo.visitCountStr = "";
                    }
                    if (oDiamondVisitorInfo.visitTimeStr == null) {
                        oDiamondVisitorInfo.visitTimeStr = "";
                    }
                    if (oDiamondVisitorInfo.visitCount == null) {
                        oDiamondVisitorInfo.visitCount = "";
                    }
                    if (oDiamondVisitorInfo.visitTime != null) {
                        break;
                    }
                    oDiamondVisitorInfo.visitTime = "";
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondVisitorInfo.visitCountStr = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    oDiamondVisitorInfo.visitTimeStr = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    oDiamondVisitorInfo.visitCount = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (oDiamondVisitorInfo.visitCountStr == null) {
                            oDiamondVisitorInfo.visitCountStr = "";
                        }
                        if (oDiamondVisitorInfo.visitTimeStr == null) {
                            oDiamondVisitorInfo.visitTimeStr = "";
                        }
                        if (oDiamondVisitorInfo.visitCount == null) {
                            oDiamondVisitorInfo.visitCount = "";
                        }
                        if (oDiamondVisitorInfo.visitTime != null) {
                            break;
                        }
                        oDiamondVisitorInfo.visitTime = "";
                        return oDiamondVisitorInfo;
                    }
                    oDiamondVisitorInfo.visitTime = nc5Var.m162495s();
                }
            }
            return oDiamondVisitorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondVisitorInfo oDiamondVisitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondVisitorInfo.visitCountStr;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oDiamondVisitorInfo.visitTimeStr;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = oDiamondVisitorInfo.visitCount;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = oDiamondVisitorInfo.visitTime;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<ODiamondVisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondVisitorInfo>() { // from class: com.p1.mobile.putong.data.ODiamondVisitorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondVisitorInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondVisitorInfo newInstance() {
            return new ODiamondVisitorInfo();
        }

        public boolean parseField(ODiamondVisitorInfo oDiamondVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    oDiamondVisitorInfo.visitCount = jsonParser.getValueAsString();
                    return true;
                case "visitCountStr":
                    oDiamondVisitorInfo.visitCountStr = jsonParser.getValueAsString();
                    return true;
                case "visitTimeStr":
                    oDiamondVisitorInfo.visitTimeStr = jsonParser.getValueAsString();
                    return true;
                case "visitTime":
                    oDiamondVisitorInfo.visitTime = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondVisitorInfo oDiamondVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitCount":
                case "visitCountStr":
                case "visitTimeStr":
                case "visitTime":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondVisitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondVisitorInfo oDiamondVisitorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondVisitorInfo.visitCountStr;
            if (str != null) {
                jsonGenerator.writeStringField("visitCountStr", str);
            }
            String str2 = oDiamondVisitorInfo.visitTimeStr;
            if (str2 != null) {
                jsonGenerator.writeStringField("visitTimeStr", str2);
            }
            String str3 = oDiamondVisitorInfo.visitCount;
            if (str3 != null) {
                jsonGenerator.writeStringField(VisitorsRecommendationType.visitCount, str3);
            }
            String str4 = oDiamondVisitorInfo.visitTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("visitTime", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondVisitorInfo new_() {
        ODiamondVisitorInfo oDiamondVisitorInfo = new ODiamondVisitorInfo();
        oDiamondVisitorInfo.nullCheck();
        return oDiamondVisitorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondVisitorInfo mo225055clone() {
        ODiamondVisitorInfo oDiamondVisitorInfo = new ODiamondVisitorInfo();
        oDiamondVisitorInfo.visitCountStr = this.visitCountStr;
        oDiamondVisitorInfo.visitTimeStr = this.visitTimeStr;
        oDiamondVisitorInfo.visitCount = this.visitCount;
        oDiamondVisitorInfo.visitTime = this.visitTime;
        return oDiamondVisitorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondVisitorInfo)) {
            return false;
        }
        ODiamondVisitorInfo oDiamondVisitorInfo = (ODiamondVisitorInfo) obj;
        return ValueObject.util_equals(this.visitCountStr, oDiamondVisitorInfo.visitCountStr) && ValueObject.util_equals(this.visitTimeStr, oDiamondVisitorInfo.visitTimeStr) && ValueObject.util_equals(this.visitCount, oDiamondVisitorInfo.visitCount) && ValueObject.util_equals(this.visitTime, oDiamondVisitorInfo.visitTime);
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
        String str = this.visitCountStr;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.visitTimeStr;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.visitCount;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.visitTime;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.visitCountStr == null) {
            this.visitCountStr = "";
        }
        if (this.visitTimeStr == null) {
            this.visitTimeStr = "";
        }
        if (this.visitCount == null) {
            this.visitCount = "";
        }
        if (this.visitTime == null) {
            this.visitTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
