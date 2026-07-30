package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondVisitorInfo oDiamondVisitorInfo) {
            String str = oDiamondVisitorInfo.visitCountStr;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oDiamondVisitorInfo.visitTimeStr;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = oDiamondVisitorInfo.visitCount;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = oDiamondVisitorInfo.visitTime;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) oDiamondVisitorInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondVisitorInfo m18558parse(nb5 nb5Var) throws IOException {
            ODiamondVisitorInfo oDiamondVisitorInfo = new ODiamondVisitorInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    oDiamondVisitorInfo.visitCountStr = nb5Var.s();
                } else if (iU == 18) {
                    oDiamondVisitorInfo.visitTimeStr = nb5Var.s();
                } else if (iU == 26) {
                    oDiamondVisitorInfo.visitCount = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    oDiamondVisitorInfo.visitTime = nb5Var.s();
                }
            }
            return oDiamondVisitorInfo;
        }

        public void serialize(ODiamondVisitorInfo oDiamondVisitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondVisitorInfo.visitCountStr;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oDiamondVisitorInfo.visitTimeStr;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = oDiamondVisitorInfo.visitCount;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = oDiamondVisitorInfo.visitTime;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ODiamondVisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondVisitorInfo>() { // from class: com.p1.mobile.putong.data.ODiamondVisitorInfo.2
        public Class getDataClass() {
            return ODiamondVisitorInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ODiamondVisitorInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondVisitorInfo new_() {
        ODiamondVisitorInfo oDiamondVisitorInfo = new ODiamondVisitorInfo();
        oDiamondVisitorInfo.nullCheck();
        return oDiamondVisitorInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondVisitorInfo m18557clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
