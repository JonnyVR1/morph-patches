package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ChristmasMatchMsgDataHighlightText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "christmasmatchmsgdatahighlighttext";

    @ProtobufIndex(index = 1)
    public int index;

    @ProtobufIndex(index = 2)
    public int length;
    public static ProtobufAdapter<ChristmasMatchMsgDataHighlightText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChristmasMatchMsgDataHighlightText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, christmasMatchMsgDataHighlightText.index) + CodedOutputByteBufferNano.m17226h(2, christmasMatchMsgDataHighlightText.length);
            christmasMatchMsgDataHighlightText.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChristmasMatchMsgDataHighlightText parse(nb5 nb5Var) throws IOException {
            ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = new ChristmasMatchMsgDataHighlightText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    christmasMatchMsgDataHighlightText.index = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return christmasMatchMsgDataHighlightText;
                    }
                    christmasMatchMsgDataHighlightText.length = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, christmasMatchMsgDataHighlightText.index);
            codedOutputByteBufferNano.m17250G(2, christmasMatchMsgDataHighlightText.length);
        }
    };
    public static JsonAdapter<ChristmasMatchMsgDataHighlightText> JSON_ADAPTER = new ObjectJsonAdapter<ChristmasMatchMsgDataHighlightText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChristmasMatchMsgDataHighlightText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChristmasMatchMsgDataHighlightText newInstance() {
            return new ChristmasMatchMsgDataHighlightText();
        }

        public boolean parseField(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("length")) {
                christmasMatchMsgDataHighlightText.length = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.INDEX)) {
                return false;
            }
            christmasMatchMsgDataHighlightText.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("length") || str.equals(FirebaseAnalytics.Param.INDEX)) {
                return true;
            }
            return super.parseFieldCheck(christmasMatchMsgDataHighlightText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, christmasMatchMsgDataHighlightText.index);
            jsonGenerator.writeNumberField("length", christmasMatchMsgDataHighlightText.length);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChristmasMatchMsgDataHighlightText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChristmasMatchMsgDataHighlightText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChristmasMatchMsgDataHighlightText new_() {
        ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = new ChristmasMatchMsgDataHighlightText();
        christmasMatchMsgDataHighlightText.nullCheck();
        return christmasMatchMsgDataHighlightText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChristmasMatchMsgDataHighlightText mo223809clone() {
        ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = new ChristmasMatchMsgDataHighlightText();
        christmasMatchMsgDataHighlightText.index = this.index;
        christmasMatchMsgDataHighlightText.length = this.length;
        return christmasMatchMsgDataHighlightText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChristmasMatchMsgDataHighlightText)) {
            return false;
        }
        ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = (ChristmasMatchMsgDataHighlightText) obj;
        return this.index == christmasMatchMsgDataHighlightText.index && this.length == christmasMatchMsgDataHighlightText.length;
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
        int i2 = (((i * 41) + this.index) * 41) + this.length;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
