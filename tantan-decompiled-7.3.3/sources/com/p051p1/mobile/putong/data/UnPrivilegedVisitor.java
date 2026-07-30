package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class UnPrivilegedVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unprivilegedvisitor";

    @NonNull
    @ProtobufIndex(index = 6)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> highLights;

    @ProtobufIndex(index = 4)
    public double lastVisitTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String recommendationText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String recommendationType;

    @NonNull
    @ProtobufIndex(index = 7)
    public UnPrivilegedVisitorSubType subType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 5)
    public int visitCount;
    public static ProtobufAdapter<UnPrivilegedVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<UnPrivilegedVisitor>() { // from class: com.p1.mobile.putong.data.UnPrivilegedVisitor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UnPrivilegedVisitor unPrivilegedVisitor) {
            String str = unPrivilegedVisitor.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = unPrivilegedVisitor.recommendationType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = unPrivilegedVisitor.recommendationText;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(4, unPrivilegedVisitor.lastVisitTime) + CodedOutputByteBufferNano.m17281h(5, unPrivilegedVisitor.visitCount);
            String str4 = unPrivilegedVisitor.buttonText;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = unPrivilegedVisitor.subType;
            if (unPrivilegedVisitorSubType != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(7, unPrivilegedVisitorSubType, UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
            }
            List<String> list = unPrivilegedVisitor.highLights;
            if (list != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            unPrivilegedVisitor.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UnPrivilegedVisitor parse(nc5 nc5Var) throws IOException {
            UnPrivilegedVisitor unPrivilegedVisitor = new UnPrivilegedVisitor();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (unPrivilegedVisitor.userId == null) {
                        unPrivilegedVisitor.userId = "";
                    }
                    if (unPrivilegedVisitor.recommendationType == null) {
                        unPrivilegedVisitor.recommendationType = "";
                    }
                    if (unPrivilegedVisitor.recommendationText == null) {
                        unPrivilegedVisitor.recommendationText = "";
                    }
                    if (unPrivilegedVisitor.buttonText == null) {
                        unPrivilegedVisitor.buttonText = "";
                    }
                    if (unPrivilegedVisitor.subType == null) {
                        unPrivilegedVisitor.subType = (UnPrivilegedVisitorSubType) UnPrivilegedVisitorSubType.JSON_ADAPTER.defaultEnum();
                    }
                    if (unPrivilegedVisitor.highLights != null) {
                        break;
                    }
                    unPrivilegedVisitor.highLights = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    unPrivilegedVisitor.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    unPrivilegedVisitor.recommendationType = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    unPrivilegedVisitor.recommendationText = nc5Var.m162495s();
                } else if (iM162497u == 33) {
                    unPrivilegedVisitor.lastVisitTime = nc5Var.m162484h();
                } else if (iM162497u == 40) {
                    unPrivilegedVisitor.visitCount = nc5Var.m162486j();
                } else if (iM162497u == 50) {
                    unPrivilegedVisitor.buttonText = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    unPrivilegedVisitor.subType = (UnPrivilegedVisitorSubType) nc5Var.m162488l(UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 66) {
                        if (unPrivilegedVisitor.userId == null) {
                            unPrivilegedVisitor.userId = "";
                        }
                        if (unPrivilegedVisitor.recommendationType == null) {
                            unPrivilegedVisitor.recommendationType = "";
                        }
                        if (unPrivilegedVisitor.recommendationText == null) {
                            unPrivilegedVisitor.recommendationText = "";
                        }
                        if (unPrivilegedVisitor.buttonText == null) {
                            unPrivilegedVisitor.buttonText = "";
                        }
                        if (unPrivilegedVisitor.subType == null) {
                            unPrivilegedVisitor.subType = (UnPrivilegedVisitorSubType) UnPrivilegedVisitorSubType.JSON_ADAPTER.defaultEnum();
                        }
                        if (unPrivilegedVisitor.highLights != null) {
                            break;
                        }
                        unPrivilegedVisitor.highLights = new ArrayList();
                        return unPrivilegedVisitor;
                    }
                    unPrivilegedVisitor.highLights = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return unPrivilegedVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UnPrivilegedVisitor unPrivilegedVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = unPrivilegedVisitor.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = unPrivilegedVisitor.recommendationType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = unPrivilegedVisitor.recommendationText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17301C(4, unPrivilegedVisitor.lastVisitTime);
            codedOutputByteBufferNano.m17305G(5, unPrivilegedVisitor.visitCount);
            String str4 = unPrivilegedVisitor.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = unPrivilegedVisitor.subType;
            if (unPrivilegedVisitorSubType != null) {
                codedOutputByteBufferNano.m17309K(7, unPrivilegedVisitorSubType, UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
            }
            List<String> list = unPrivilegedVisitor.highLights;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UnPrivilegedVisitor> JSON_ADAPTER = new ObjectJsonAdapter<UnPrivilegedVisitor>() { // from class: com.p1.mobile.putong.data.UnPrivilegedVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UnPrivilegedVisitor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UnPrivilegedVisitor newInstance() {
            return new UnPrivilegedVisitor();
        }

        public boolean parseField(UnPrivilegedVisitor unPrivilegedVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    unPrivilegedVisitor.visitCount = jsonParser.getValueAsInt();
                    return true;
                case "subType":
                    unPrivilegedVisitor.subType = UnPrivilegedVisitorSubType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    unPrivilegedVisitor.userId = jsonParser.getValueAsString();
                    return true;
                case "highLights":
                    unPrivilegedVisitor.highLights = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "lastVisitTime":
                    unPrivilegedVisitor.lastVisitTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "buttonText":
                    unPrivilegedVisitor.buttonText = jsonParser.getValueAsString();
                    return true;
                case "recommendationText":
                    unPrivilegedVisitor.recommendationText = jsonParser.getValueAsString();
                    return true;
                case "recommendationType":
                    unPrivilegedVisitor.recommendationType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UnPrivilegedVisitor unPrivilegedVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitCount":
                case "subType":
                case "userId":
                case "highLights":
                case "lastVisitTime":
                case "buttonText":
                case "recommendationText":
                case "recommendationType":
                    return true;
                default:
                    return super.parseFieldCheck(unPrivilegedVisitor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UnPrivilegedVisitor unPrivilegedVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = unPrivilegedVisitor.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = unPrivilegedVisitor.recommendationType;
            if (str2 != null) {
                jsonGenerator.writeStringField("recommendationType", str2);
            }
            String str3 = unPrivilegedVisitor.recommendationText;
            if (str3 != null) {
                jsonGenerator.writeStringField("recommendationText", str3);
            }
            jsonGenerator.writeFieldName("lastVisitTime");
            Converter.API_TIME.serialize(Double.valueOf(unPrivilegedVisitor.lastVisitTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(VisitorsRecommendationType.visitCount, unPrivilegedVisitor.visitCount);
            String str4 = unPrivilegedVisitor.buttonText;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonText", str4);
            }
            if (unPrivilegedVisitor.subType != null) {
                jsonGenerator.writeFieldName("subType");
                UnPrivilegedVisitorSubType.JSON_ADAPTER.serialize(unPrivilegedVisitor.subType, jsonGenerator, true);
            }
            if (unPrivilegedVisitor.highLights != null) {
                jsonGenerator.writeFieldName("highLights");
                JsonAdapter.serializeArray(unPrivilegedVisitor.highLights, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnPrivilegedVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnPrivilegedVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61292a(String str) {
        return str;
    }

    public static UnPrivilegedVisitor new_() {
        UnPrivilegedVisitor unPrivilegedVisitor = new UnPrivilegedVisitor();
        unPrivilegedVisitor.nullCheck();
        return unPrivilegedVisitor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UnPrivilegedVisitor mo225055clone() {
        UnPrivilegedVisitor unPrivilegedVisitor = new UnPrivilegedVisitor();
        unPrivilegedVisitor.userId = this.userId;
        unPrivilegedVisitor.recommendationType = this.recommendationType;
        unPrivilegedVisitor.recommendationText = this.recommendationText;
        unPrivilegedVisitor.lastVisitTime = this.lastVisitTime;
        unPrivilegedVisitor.visitCount = this.visitCount;
        unPrivilegedVisitor.buttonText = this.buttonText;
        unPrivilegedVisitor.subType = this.subType;
        List<String> list = this.highLights;
        if (list != null) {
            unPrivilegedVisitor.highLights = ValueObject.util_map(list, new qcj() { // from class: l.ztj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UnPrivilegedVisitor.m61292a((String) obj);
                }
            });
        }
        return unPrivilegedVisitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnPrivilegedVisitor)) {
            return false;
        }
        UnPrivilegedVisitor unPrivilegedVisitor = (UnPrivilegedVisitor) obj;
        return ValueObject.util_equals(this.userId, unPrivilegedVisitor.userId) && ValueObject.util_equals(this.recommendationType, unPrivilegedVisitor.recommendationType) && ValueObject.util_equals(this.recommendationText, unPrivilegedVisitor.recommendationText) && this.lastVisitTime == unPrivilegedVisitor.lastVisitTime && this.visitCount == unPrivilegedVisitor.visitCount && ValueObject.util_equals(this.buttonText, unPrivilegedVisitor.buttonText) && ValueObject.util_equals(this.subType, unPrivilegedVisitor.subType) && ValueObject.util_equals(this.highLights, unPrivilegedVisitor.highLights);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.recommendationType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.recommendationText;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastVisitTime);
        int i3 = (((((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.visitCount) * 41;
        String str4 = this.buttonText;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = this.subType;
        int iHashCode5 = (iHashCode4 + (unPrivilegedVisitorSubType != null ? unPrivilegedVisitorSubType.hashCode() : 0)) * 41;
        List<String> list = this.highLights;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.recommendationType == null) {
            this.recommendationType = "";
        }
        if (this.recommendationText == null) {
            this.recommendationText = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.subType == null) {
            this.subType = (UnPrivilegedVisitorSubType) UnPrivilegedVisitorSubType.JSON_ADAPTER.defaultEnum();
        }
        if (this.highLights == null) {
            this.highLights = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
