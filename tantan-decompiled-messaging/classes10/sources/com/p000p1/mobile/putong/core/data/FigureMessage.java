package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.FigureMessageArg;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FigureMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "figuremessage";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<FigureMessageArg> args;

    @NonNull
    @ProtobufIndex(index = 1)
    public String template;
    public static ProtobufAdapter<FigureMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<FigureMessage>() { // from class: com.p1.mobile.putong.core.data.FigureMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FigureMessage figureMessage) {
            String str = figureMessage.template;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<FigureMessageArg> list = figureMessage.args;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) figureMessage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FigureMessage m12775parse(nb5 nb5Var) throws IOException {
            FigureMessage figureMessage = new FigureMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (figureMessage.template == null) {
                        figureMessage.template = "";
                    }
                    if (figureMessage.args != null) {
                        break;
                    }
                    figureMessage.args = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    figureMessage.template = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (figureMessage.template == null) {
                            figureMessage.template = "";
                        }
                        if (figureMessage.args != null) {
                            break;
                        }
                        figureMessage.args = new ArrayList();
                        return figureMessage;
                    }
                    figureMessage.args = (List) nb5Var.l(FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return figureMessage;
        }

        public void serialize(FigureMessage figureMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = figureMessage.template;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<FigureMessageArg> list = figureMessage.args;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, FigureMessageArg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FigureMessage> JSON_ADAPTER = new ObjectJsonAdapter<FigureMessage>() { // from class: com.p1.mobile.putong.core.data.FigureMessage.2
        public Class getDataClass() {
            return FigureMessage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FigureMessage m12776newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FigureMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FigureMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FigureMessage new_() {
        FigureMessage figureMessage = new FigureMessage();
        figureMessage.nullCheck();
        return figureMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FigureMessage m12774clone() {
        FigureMessage figureMessage = new FigureMessage();
        figureMessage.template = this.template;
        List<FigureMessageArg> list = this.args;
        if (list != null) {
            figureMessage.args = ValueObject.util_map(list, new w9j() { // from class: l.kfi
                public final Object call(Object obj) {
                    return ((FigureMessageArg) obj).m12778clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.template;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<FigureMessageArg> list = this.args;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.template == null) {
            this.template = "";
        }
        if (this.args == null) {
            this.args = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
