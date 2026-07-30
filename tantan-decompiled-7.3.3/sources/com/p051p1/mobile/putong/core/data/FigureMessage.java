package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.FigureMessageArg;
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

/* JADX INFO: loaded from: classes10.dex */
public class FigureMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "figuremessage";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<FigureMessageArg> args;

    @NonNull
    @ProtobufIndex(index = 1)
    public String template;
    public static ProtobufAdapter<FigureMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<FigureMessage>() { // from class: com.p1.mobile.putong.core.data.FigureMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FigureMessage figureMessage) {
            String str = figureMessage.template;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<FigureMessageArg> list = figureMessage.args;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            figureMessage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FigureMessage parse(nc5 nc5Var) throws IOException {
            FigureMessage figureMessage = new FigureMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (figureMessage.template == null) {
                        figureMessage.template = "";
                    }
                    if (figureMessage.args != null) {
                        break;
                    }
                    figureMessage.args = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    figureMessage.template = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (figureMessage.template == null) {
                            figureMessage.template = "";
                        }
                        if (figureMessage.args != null) {
                            break;
                        }
                        figureMessage.args = new ArrayList();
                        return figureMessage;
                    }
                    figureMessage.args = (List) nc5Var.m162488l(FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return figureMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FigureMessage figureMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = figureMessage.template;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<FigureMessageArg> list = figureMessage.args;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FigureMessage> JSON_ADAPTER = new ObjectJsonAdapter<FigureMessage>() { // from class: com.p1.mobile.putong.core.data.FigureMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FigureMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FigureMessage newInstance() {
            return new FigureMessage();
        }

        public boolean parseField(FigureMessage figureMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("template")) {
                figureMessage.template = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("args")) {
                return false;
            }
            figureMessage.args = JsonAdapter.parseArray(jsonParser, FigureMessageArg.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FigureMessage figureMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("template") || str.equals("args")) {
                return true;
            }
            return super.parseFieldCheck(figureMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FigureMessage figureMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = figureMessage.template;
            if (str != null) {
                jsonGenerator.writeStringField("template", str);
            }
            if (figureMessage.args != null) {
                jsonGenerator.writeFieldName("args");
                JsonAdapter.serializeArray(figureMessage.args, jsonGenerator, FigureMessageArg.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FigureMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FigureMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FigureMessage new_() {
        FigureMessage figureMessage = new FigureMessage();
        figureMessage.nullCheck();
        return figureMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FigureMessage mo225055clone() {
        FigureMessage figureMessage = new FigureMessage();
        figureMessage.template = this.template;
        List<FigureMessageArg> list = this.args;
        if (list != null) {
            figureMessage.args = ValueObject.util_map(list, new qcj() { // from class: l.gii
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FigureMessageArg) obj).mo225055clone();
                }
            });
        }
        return figureMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FigureMessage)) {
            return false;
        }
        FigureMessage figureMessage = (FigureMessage) obj;
        return ValueObject.util_equals(this.template, figureMessage.template) && ValueObject.util_equals(this.args, figureMessage.args);
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
        String str = this.template;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<FigureMessageArg> list = this.args;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.template == null) {
            this.template = "";
        }
        if (this.args == null) {
            this.args = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
