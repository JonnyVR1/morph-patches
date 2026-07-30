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
public class Visitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitor";

    @ProtobufIndex(index = 5)
    public boolean hidden;

    @ProtobufIndex(index = 1)
    public double lastVisitTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String recommendationType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @ProtobufIndex(index = 4)
    public int visitCount;
    public static ProtobufAdapter<Visitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<Visitor>() { // from class: com.p1.mobile.putong.data.Visitor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Visitor visitor) {
            int iD = CodedOutputByteBufferNano.d(1, visitor.lastVisitTime);
            String str = visitor.recommendationType;
            if (str != null) {
                iD += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = visitor.userId;
            if (str2 != null) {
                iD += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH = iD + CodedOutputByteBufferNano.h(4, visitor.visitCount) + CodedOutputByteBufferNano.b(5, visitor.hidden);
            ((MessageNano) visitor).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Visitor m19329parse(nb5 nb5Var) throws IOException {
            Visitor visitor = new Visitor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitor.recommendationType == null) {
                        visitor.recommendationType = "";
                    }
                    if (visitor.userId != null) {
                        break;
                    }
                    visitor.userId = "";
                    break;
                }
                if (iU == 9) {
                    visitor.lastVisitTime = nb5Var.h();
                } else if (iU == 18) {
                    visitor.recommendationType = nb5Var.s();
                } else if (iU == 26) {
                    visitor.userId = nb5Var.s();
                } else if (iU == 32) {
                    visitor.visitCount = nb5Var.j();
                } else {
                    if (iU != 40) {
                        if (visitor.recommendationType == null) {
                            visitor.recommendationType = "";
                        }
                        if (visitor.userId != null) {
                            break;
                        }
                        visitor.userId = "";
                        return visitor;
                    }
                    visitor.hidden = nb5Var.g();
                }
            }
            return visitor;
        }

        public void serialize(Visitor visitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, visitor.lastVisitTime);
            String str = visitor.recommendationType;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = visitor.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, visitor.visitCount);
            codedOutputByteBufferNano.A(5, visitor.hidden);
        }
    };
    public static JsonAdapter<Visitor> JSON_ADAPTER = new ObjectJsonAdapter<Visitor>() { // from class: com.p1.mobile.putong.data.Visitor.2
        public Class getDataClass() {
            return Visitor.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Visitor mo17830newInstance() {
            return new Visitor();
        }

        public boolean parseField(Visitor visitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    visitor.visitCount = jsonParser.getValueAsInt();
                    return true;
                case "hidden":
                    visitor.hidden = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    visitor.userId = jsonParser.getValueAsString();
                    return true;
                case "lastVisitTime":
                    visitor.lastVisitTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "recommendationType":
                    visitor.recommendationType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Visitor visitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitCount":
                case "hidden":
                case "userId":
                case "lastVisitTime":
                case "recommendationType":
                    return true;
                default:
                    return super.parseFieldCheck(visitor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Visitor visitor, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("lastVisitTime");
            Converter.API_TIME.serialize(Double.valueOf(visitor.lastVisitTime), jsonGenerator, true);
            String str = visitor.recommendationType;
            if (str != null) {
                jsonGenerator.writeStringField("recommendationType", str);
            }
            String str2 = visitor.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            jsonGenerator.writeNumberField(VisitorsRecommendationType.visitCount, visitor.visitCount);
            jsonGenerator.writeBooleanField("hidden", visitor.hidden);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Visitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Visitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Visitor new_() {
        Visitor visitor = new Visitor();
        visitor.nullCheck();
        return visitor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Visitor m19328clone() {
        Visitor visitor = new Visitor();
        visitor.lastVisitTime = this.lastVisitTime;
        visitor.recommendationType = this.recommendationType;
        visitor.userId = this.userId;
        visitor.visitCount = this.visitCount;
        visitor.hidden = this.hidden;
        return visitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Visitor)) {
            return false;
        }
        Visitor visitor = (Visitor) obj;
        return this.lastVisitTime == visitor.lastVisitTime && ValueObject.util_equals(this.recommendationType, visitor.recommendationType) && ValueObject.util_equals(this.userId, visitor.userId) && this.visitCount == visitor.visitCount && this.hidden == visitor.hidden;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastVisitTime);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.recommendationType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.visitCount) * 41) + (this.hidden ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.recommendationType == null) {
            this.recommendationType = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
