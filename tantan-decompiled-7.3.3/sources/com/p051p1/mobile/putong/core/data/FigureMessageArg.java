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
public class FigureMessageArg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "figuremessagearg";

    @NonNull
    @ProtobufIndex(index = 2)
    public String displayType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<FigureMessageArg> PROTOBUF_ADAPTER = new MessageNanoAdapter<FigureMessageArg>() { // from class: com.p1.mobile.putong.core.data.FigureMessageArg.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FigureMessageArg figureMessageArg) {
            String str = figureMessageArg.value;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = figureMessageArg.displayType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            figureMessageArg.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FigureMessageArg parse(nc5 nc5Var) throws IOException {
            FigureMessageArg figureMessageArg = new FigureMessageArg();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (figureMessageArg.value == null) {
                        figureMessageArg.value = "";
                    }
                    if (figureMessageArg.displayType != null) {
                        break;
                    }
                    figureMessageArg.displayType = "";
                    break;
                }
                if (iM162497u == 10) {
                    figureMessageArg.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (figureMessageArg.value == null) {
                            figureMessageArg.value = "";
                        }
                        if (figureMessageArg.displayType != null) {
                            break;
                        }
                        figureMessageArg.displayType = "";
                        return figureMessageArg;
                    }
                    figureMessageArg.displayType = nc5Var.m162495s();
                }
            }
            return figureMessageArg;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FigureMessageArg figureMessageArg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = figureMessageArg.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = figureMessageArg.displayType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<FigureMessageArg> JSON_ADAPTER = new ObjectJsonAdapter<FigureMessageArg>() { // from class: com.p1.mobile.putong.core.data.FigureMessageArg.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FigureMessageArg.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FigureMessageArg newInstance() {
            return new FigureMessageArg();
        }

        public boolean parseField(FigureMessageArg figureMessageArg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("value")) {
                figureMessageArg.value = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("displayType")) {
                return false;
            }
            figureMessageArg.displayType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FigureMessageArg figureMessageArg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value") || str.equals("displayType")) {
                return true;
            }
            return super.parseFieldCheck(figureMessageArg, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FigureMessageArg figureMessageArg, JsonGenerator jsonGenerator) throws IOException {
            String str = figureMessageArg.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = figureMessageArg.displayType;
            if (str2 != null) {
                jsonGenerator.writeStringField("displayType", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FigureMessageArg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FigureMessageArg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FigureMessageArg new_() {
        FigureMessageArg figureMessageArg = new FigureMessageArg();
        figureMessageArg.nullCheck();
        return figureMessageArg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FigureMessageArg mo225055clone() {
        FigureMessageArg figureMessageArg = new FigureMessageArg();
        figureMessageArg.value = this.value;
        figureMessageArg.displayType = this.displayType;
        return figureMessageArg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FigureMessageArg)) {
            return false;
        }
        FigureMessageArg figureMessageArg = (FigureMessageArg) obj;
        return ValueObject.util_equals(this.value, figureMessageArg.value) && ValueObject.util_equals(this.displayType, figureMessageArg.displayType);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.displayType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.displayType == null) {
            this.displayType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
