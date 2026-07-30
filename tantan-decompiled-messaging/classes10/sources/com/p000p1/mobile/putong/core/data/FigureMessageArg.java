package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FigureMessageArg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "figuremessagearg";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String displayType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<FigureMessageArg> PROTOBUF_ADAPTER = new MessageNanoAdapter<FigureMessageArg>() { // from class: com.p1.mobile.putong.core.data.FigureMessageArg.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FigureMessageArg figureMessageArg) {
            String str = figureMessageArg.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = figureMessageArg.displayType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) figureMessageArg).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FigureMessageArg m12779parse(nb5 nb5Var) throws IOException {
            FigureMessageArg figureMessageArg = new FigureMessageArg();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (figureMessageArg.value == null) {
                        figureMessageArg.value = "";
                    }
                    if (figureMessageArg.displayType != null) {
                        break;
                    }
                    figureMessageArg.displayType = "";
                    break;
                }
                if (iU == 10) {
                    figureMessageArg.value = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (figureMessageArg.value == null) {
                            figureMessageArg.value = "";
                        }
                        if (figureMessageArg.displayType != null) {
                            break;
                        }
                        figureMessageArg.displayType = "";
                        return figureMessageArg;
                    }
                    figureMessageArg.displayType = nb5Var.s();
                }
            }
            return figureMessageArg;
        }

        public void serialize(FigureMessageArg figureMessageArg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = figureMessageArg.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = figureMessageArg.displayType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FigureMessageArg> JSON_ADAPTER = new ObjectJsonAdapter<FigureMessageArg>() { // from class: com.p1.mobile.putong.core.data.FigureMessageArg.2
        public Class getDataClass() {
            return FigureMessageArg.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FigureMessageArg m12780newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FigureMessageArg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FigureMessageArg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FigureMessageArg new_() {
        FigureMessageArg figureMessageArg = new FigureMessageArg();
        figureMessageArg.nullCheck();
        return figureMessageArg;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FigureMessageArg m12778clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.displayType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.displayType == null) {
            this.displayType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
