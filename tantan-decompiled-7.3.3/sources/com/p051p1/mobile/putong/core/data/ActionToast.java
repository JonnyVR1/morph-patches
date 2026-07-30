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
public class ActionToast extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiontoast";

    @ProtobufIndex(index = 2)
    public boolean loveImg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mainImg;

    @NonNull
    @ProtobufIndex(index = 3)
    public String message;

    @NonNull
    @ProtobufIndex(index = 4)
    public CardOption option;
    public static ProtobufAdapter<ActionToast> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionToast>() { // from class: com.p1.mobile.putong.core.data.ActionToast.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionToast actionToast) {
            String str = actionToast.mainImg;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, actionToast.loveImg);
            String str2 = actionToast.message;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            CardOption cardOption = actionToast.option;
            if (cardOption != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
            actionToast.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionToast parse(nc5 nc5Var) throws IOException {
            ActionToast actionToast = new ActionToast();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionToast.mainImg == null) {
                        actionToast.mainImg = "";
                    }
                    if (actionToast.message == null) {
                        actionToast.message = "";
                    }
                    if (actionToast.option != null) {
                        break;
                    }
                    actionToast.option = CardOption.new_();
                    break;
                }
                if (iM162497u == 10) {
                    actionToast.mainImg = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    actionToast.loveImg = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    actionToast.message = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (actionToast.mainImg == null) {
                            actionToast.mainImg = "";
                        }
                        if (actionToast.message == null) {
                            actionToast.message = "";
                        }
                        if (actionToast.option != null) {
                            break;
                        }
                        actionToast.option = CardOption.new_();
                        return actionToast;
                    }
                    actionToast.option = (CardOption) nc5Var.m162488l(CardOption.PROTOBUF_ADAPTER);
                }
            }
            return actionToast;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionToast actionToast, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionToast.mainImg;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, actionToast.loveImg);
            String str2 = actionToast.message;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            CardOption cardOption = actionToast.option;
            if (cardOption != null) {
                codedOutputByteBufferNano.m17309K(4, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ActionToast> JSON_ADAPTER = new ObjectJsonAdapter<ActionToast>() { // from class: com.p1.mobile.putong.core.data.ActionToast.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionToast.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionToast newInstance() {
            return new ActionToast();
        }

        public boolean parseField(ActionToast actionToast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "option":
                    actionToast.option = CardOption.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "loveImg":
                    actionToast.loveImg = jsonParser.getValueAsBoolean();
                    return true;
                case "mainImg":
                    actionToast.mainImg = jsonParser.getValueAsString();
                    return true;
                case "message":
                    actionToast.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionToast actionToast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "option":
                case "loveImg":
                case "mainImg":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(actionToast, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionToast actionToast, JsonGenerator jsonGenerator) throws IOException {
            String str = actionToast.mainImg;
            if (str != null) {
                jsonGenerator.writeStringField("mainImg", str);
            }
            jsonGenerator.writeBooleanField("loveImg", actionToast.loveImg);
            String str2 = actionToast.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
            if (actionToast.option != null) {
                jsonGenerator.writeFieldName(Option.TYPE);
                CardOption.JSON_ADAPTER.serialize(actionToast.option, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionToast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionToast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionToast new_() {
        ActionToast actionToast = new ActionToast();
        actionToast.nullCheck();
        return actionToast;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionToast mo225055clone() {
        ActionToast actionToast = new ActionToast();
        actionToast.mainImg = this.mainImg;
        actionToast.loveImg = this.loveImg;
        actionToast.message = this.message;
        CardOption cardOption = this.option;
        if (cardOption != null) {
            actionToast.option = cardOption.mo225055clone();
        }
        return actionToast;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionToast)) {
            return false;
        }
        ActionToast actionToast = (ActionToast) obj;
        return ValueObject.util_equals(this.mainImg, actionToast.mainImg) && this.loveImg == actionToast.loveImg && ValueObject.util_equals(this.message, actionToast.message) && ValueObject.util_equals(this.option, actionToast.option);
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
        String str = this.mainImg;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.loveImg ? 1231 : 1237)) * 41;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        CardOption cardOption = this.option;
        int iHashCode3 = iHashCode2 + (cardOption != null ? cardOption.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mainImg == null) {
            this.mainImg = "";
        }
        if (this.message == null) {
            this.message = "";
        }
        if (this.option == null) {
            this.option = CardOption.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
