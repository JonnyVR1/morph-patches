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
public class CancelButtonStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cancelbuttonstyle";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String titleColor;
    public static ProtobufAdapter<CancelButtonStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<CancelButtonStyle>() { // from class: com.p1.mobile.putong.core.data.CancelButtonStyle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CancelButtonStyle cancelButtonStyle) {
            String str = cancelButtonStyle.titleColor;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) cancelButtonStyle).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CancelButtonStyle m11857parse(nb5 nb5Var) throws IOException {
            CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cancelButtonStyle.titleColor == null) {
                        cancelButtonStyle.titleColor = "";
                    }
                    if (cancelButtonStyle.backgroundColor != null) {
                        break;
                    }
                    cancelButtonStyle.backgroundColor = "";
                    break;
                }
                if (iU == 10) {
                    cancelButtonStyle.titleColor = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (cancelButtonStyle.titleColor == null) {
                            cancelButtonStyle.titleColor = "";
                        }
                        if (cancelButtonStyle.backgroundColor != null) {
                            break;
                        }
                        cancelButtonStyle.backgroundColor = "";
                        return cancelButtonStyle;
                    }
                    cancelButtonStyle.backgroundColor = nb5Var.s();
                }
            }
            return cancelButtonStyle;
        }

        public void serialize(CancelButtonStyle cancelButtonStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cancelButtonStyle.titleColor;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<CancelButtonStyle> JSON_ADAPTER = new ObjectJsonAdapter<CancelButtonStyle>() { // from class: com.p1.mobile.putong.core.data.CancelButtonStyle.2
        public Class getDataClass() {
            return CancelButtonStyle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CancelButtonStyle m11858newInstance() {
            return new CancelButtonStyle();
        }

        public boolean parseField(CancelButtonStyle cancelButtonStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("titleColor")) {
                cancelButtonStyle.titleColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("backgroundColor")) {
                return false;
            }
            cancelButtonStyle.backgroundColor = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CancelButtonStyle cancelButtonStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("titleColor") || str.equals("backgroundColor")) {
                return true;
            }
            return super.parseFieldCheck(cancelButtonStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CancelButtonStyle cancelButtonStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = cancelButtonStyle.titleColor;
            if (str != null) {
                jsonGenerator.writeStringField("titleColor", str);
            }
            String str2 = cancelButtonStyle.backgroundColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundColor", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CancelButtonStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CancelButtonStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CancelButtonStyle new_() {
        CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
        cancelButtonStyle.nullCheck();
        return cancelButtonStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CancelButtonStyle m11856clone() {
        CancelButtonStyle cancelButtonStyle = new CancelButtonStyle();
        cancelButtonStyle.titleColor = this.titleColor;
        cancelButtonStyle.backgroundColor = this.backgroundColor;
        return cancelButtonStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelButtonStyle)) {
            return false;
        }
        CancelButtonStyle cancelButtonStyle = (CancelButtonStyle) obj;
        return ValueObject.util_equals(this.titleColor, cancelButtonStyle.titleColor) && ValueObject.util_equals(this.backgroundColor, cancelButtonStyle.backgroundColor);
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
        String str = this.titleColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundColor;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.titleColor == null) {
            this.titleColor = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
