package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class Figure extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "figure";

    @NonNull
    @ProtobufIndex(index = 2)
    public FigureMessage message;

    @NonNull
    @ProtobufIndex(index = 5)
    public String name;

    @ProtobufIndex(index = 1)
    public int total;

    @NonNull
    @ProtobufIndex(index = 3)
    public FigureMessageType type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<Figure> PROTOBUF_ADAPTER = new MessageNanoAdapter<Figure>() { // from class: com.p1.mobile.putong.core.data.Figure.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Figure figure) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, figure.total);
            FigureMessage figureMessage = figure.message;
            if (figureMessage != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, figureMessage, FigureMessage.PROTOBUF_ADAPTER);
            }
            FigureMessageType figureMessageType = figure.type;
            if (figureMessageType != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(3, figureMessageType.ordinal());
            }
            String str = figure.value;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = figure.name;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            FigureMessageType figureMessageType2 = figure.type;
            if (figureMessageType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, figureMessageType2, FigureMessageType.PROTOBUF_ADAPTER);
            }
            figure.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Figure parse(nc5 nc5Var) throws IOException {
            Figure figure = new Figure();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (figure.type == null && numValueOf != null) {
                        figure.type = (FigureMessageType) FigureMessageType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (figure.message == null) {
                        figure.message = FigureMessage.new_();
                    }
                    if (figure.type == null) {
                        figure.type = (FigureMessageType) FigureMessageType.JSON_ADAPTER.defaultEnum();
                    }
                    if (figure.value == null) {
                        figure.value = "";
                    }
                    if (figure.name != null) {
                        break;
                    }
                    figure.name = "";
                    break;
                }
                if (iM162497u == 8) {
                    figure.total = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    figure.message = (FigureMessage) nc5Var.m162488l(FigureMessage.PROTOBUF_ADAPTER);
                } else if (iM162497u == 24) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 34) {
                    figure.value = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    figure.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (figure.type == null && numValueOf != null) {
                            figure.type = (FigureMessageType) FigureMessageType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (figure.message == null) {
                            figure.message = FigureMessage.new_();
                        }
                        if (figure.type == null) {
                            figure.type = (FigureMessageType) FigureMessageType.JSON_ADAPTER.defaultEnum();
                        }
                        if (figure.value == null) {
                            figure.value = "";
                        }
                        if (figure.name != null) {
                            break;
                        }
                        figure.name = "";
                        return figure;
                    }
                    figure.type = (FigureMessageType) nc5Var.m162488l(FigureMessageType.PROTOBUF_ADAPTER);
                }
            }
            return figure;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Figure figure, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, figure.total);
            FigureMessage figureMessage = figure.message;
            if (figureMessage != null) {
                codedOutputByteBufferNano.m17309K(2, figureMessage, FigureMessage.PROTOBUF_ADAPTER);
            }
            FigureMessageType figureMessageType = figure.type;
            if (figureMessageType != null) {
                codedOutputByteBufferNano.m17305G(3, figureMessageType.ordinal());
            }
            String str = figure.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = figure.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            FigureMessageType figureMessageType2 = figure.type;
            if (figureMessageType2 != null) {
                codedOutputByteBufferNano.m17309K(6, figureMessageType2, FigureMessageType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Figure> JSON_ADAPTER = new ObjectJsonAdapter<Figure>() { // from class: com.p1.mobile.putong.core.data.Figure.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Figure.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Figure newInstance() {
            return new Figure();
        }

        public boolean parseField(Figure figure, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "name":
                    figure.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    figure.type = FigureMessageType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "total":
                    figure.total = jsonParser.getValueAsInt();
                    return true;
                case "value":
                    figure.value = jsonParser.getValueAsString();
                    return true;
                case "message":
                    figure.message = FigureMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Figure figure, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "name":
                case "type":
                case "total":
                case "value":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(figure, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Figure figure, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", figure.total);
            if (figure.message != null) {
                jsonGenerator.writeFieldName("message");
                FigureMessage.JSON_ADAPTER.serialize(figure.message, jsonGenerator, true);
            }
            if (figure.type != null) {
                jsonGenerator.writeFieldName("type");
                FigureMessageType.JSON_ADAPTER.serialize(figure.type, jsonGenerator, true);
            }
            String str = figure.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = figure.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Figure) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Figure) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Figure new_() {
        Figure figure = new Figure();
        figure.nullCheck();
        return figure;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Figure mo225055clone() {
        Figure figure = new Figure();
        figure.total = this.total;
        FigureMessage figureMessage = this.message;
        if (figureMessage != null) {
            figure.message = figureMessage.mo225055clone();
        }
        figure.type = this.type;
        figure.value = this.value;
        figure.name = this.name;
        return figure;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Figure)) {
            return false;
        }
        Figure figure = (Figure) obj;
        return this.total == figure.total && ValueObject.util_equals(this.message, figure.message) && ValueObject.util_equals(this.type, figure.type) && ValueObject.util_equals(this.value, figure.value) && ValueObject.util_equals(this.name, figure.name);
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
        int i2 = ((i * 41) + this.total) * 41;
        FigureMessage figureMessage = this.message;
        int iHashCode = (i2 + (figureMessage != null ? figureMessage.hashCode() : 0)) * 41;
        FigureMessageType figureMessageType = this.type;
        int iHashCode2 = (iHashCode + (figureMessageType != null ? figureMessageType.hashCode() : 0)) * 41;
        String str = this.value;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = FigureMessage.new_();
        }
        if (this.type == null) {
            this.type = (FigureMessageType) FigureMessageType.JSON_ADAPTER.defaultEnum();
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
