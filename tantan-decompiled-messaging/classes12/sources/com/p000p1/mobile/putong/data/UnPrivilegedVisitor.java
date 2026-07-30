package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.UnPrivilegedVisitor;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UnPrivilegedVisitor unPrivilegedVisitor) {
            String str = unPrivilegedVisitor.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = unPrivilegedVisitor.recommendationType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = unPrivilegedVisitor.recommendationText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iD = iO + CodedOutputByteBufferNano.d(4, unPrivilegedVisitor.lastVisitTime) + CodedOutputByteBufferNano.h(5, unPrivilegedVisitor.visitCount);
            String str4 = unPrivilegedVisitor.buttonText;
            if (str4 != null) {
                iD += CodedOutputByteBufferNano.o(6, str4);
            }
            UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = unPrivilegedVisitor.subType;
            if (unPrivilegedVisitorSubType != null) {
                iD += CodedOutputByteBufferNano.l(7, unPrivilegedVisitorSubType, UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
            }
            List<String> list = unPrivilegedVisitor.highLights;
            if (list != null) {
                iD += CodedOutputByteBufferNano.l(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) unPrivilegedVisitor).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UnPrivilegedVisitor m19127parse(nb5 nb5Var) throws IOException {
            UnPrivilegedVisitor unPrivilegedVisitor = new UnPrivilegedVisitor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    unPrivilegedVisitor.userId = nb5Var.s();
                } else if (iU == 18) {
                    unPrivilegedVisitor.recommendationType = nb5Var.s();
                } else if (iU == 26) {
                    unPrivilegedVisitor.recommendationText = nb5Var.s();
                } else if (iU == 33) {
                    unPrivilegedVisitor.lastVisitTime = nb5Var.h();
                } else if (iU == 40) {
                    unPrivilegedVisitor.visitCount = nb5Var.j();
                } else if (iU == 50) {
                    unPrivilegedVisitor.buttonText = nb5Var.s();
                } else if (iU == 58) {
                    unPrivilegedVisitor.subType = (UnPrivilegedVisitorSubType) nb5Var.l(UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 66) {
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
                    unPrivilegedVisitor.highLights = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return unPrivilegedVisitor;
        }

        public void serialize(UnPrivilegedVisitor unPrivilegedVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = unPrivilegedVisitor.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = unPrivilegedVisitor.recommendationType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = unPrivilegedVisitor.recommendationText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.C(4, unPrivilegedVisitor.lastVisitTime);
            codedOutputByteBufferNano.G(5, unPrivilegedVisitor.visitCount);
            String str4 = unPrivilegedVisitor.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            UnPrivilegedVisitorSubType unPrivilegedVisitorSubType = unPrivilegedVisitor.subType;
            if (unPrivilegedVisitorSubType != null) {
                codedOutputByteBufferNano.K(7, unPrivilegedVisitorSubType, UnPrivilegedVisitorSubType.PROTOBUF_ADAPTER);
            }
            List<String> list = unPrivilegedVisitor.highLights;
            if (list != null) {
                codedOutputByteBufferNano.K(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UnPrivilegedVisitor> JSON_ADAPTER = new ObjectJsonAdapter<UnPrivilegedVisitor>() { // from class: com.p1.mobile.putong.data.UnPrivilegedVisitor.2
        public Class getDataClass() {
            return UnPrivilegedVisitor.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UnPrivilegedVisitor mo17830newInstance() {
            return new UnPrivilegedVisitor();
        }

        public boolean parseField(UnPrivilegedVisitor unPrivilegedVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    unPrivilegedVisitor.visitCount = jsonParser.getValueAsInt();
                    return true;
                case "subType":
                    unPrivilegedVisitor.subType = (UnPrivilegedVisitorSubType) UnPrivilegedVisitorSubType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    unPrivilegedVisitor.userId = jsonParser.getValueAsString();
                    return true;
                case "highLights":
                    unPrivilegedVisitor.highLights = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "lastVisitTime":
                    unPrivilegedVisitor.lastVisitTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnPrivilegedVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnPrivilegedVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1026a(String str) {
        return str;
    }

    public static UnPrivilegedVisitor new_() {
        UnPrivilegedVisitor unPrivilegedVisitor = new UnPrivilegedVisitor();
        unPrivilegedVisitor.nullCheck();
        return unPrivilegedVisitor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UnPrivilegedVisitor m19126clone() {
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
            unPrivilegedVisitor.highLights = ValueObject.util_map(list, new w9j() { // from class: l.wkj0
                public final Object call(Object obj) {
                    return UnPrivilegedVisitor.m1026a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
