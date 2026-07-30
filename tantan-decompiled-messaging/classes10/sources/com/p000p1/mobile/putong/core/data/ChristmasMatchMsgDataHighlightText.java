package com.p000p1.mobile.putong.core.data;

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
public class ChristmasMatchMsgDataHighlightText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "christmasmatchmsgdatahighlighttext";

    @ProtobufIndex(index = 1)
    public int index;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int length;
    public static ProtobufAdapter<ChristmasMatchMsgDataHighlightText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChristmasMatchMsgDataHighlightText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText) {
            int iH = CodedOutputByteBufferNano.h(1, christmasMatchMsgDataHighlightText.index) + CodedOutputByteBufferNano.h(2, christmasMatchMsgDataHighlightText.length);
            ((MessageNano) christmasMatchMsgDataHighlightText).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChristmasMatchMsgDataHighlightText m12165parse(nb5 nb5Var) throws IOException {
            ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = new ChristmasMatchMsgDataHighlightText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    christmasMatchMsgDataHighlightText.index = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return christmasMatchMsgDataHighlightText;
                    }
                    christmasMatchMsgDataHighlightText.length = nb5Var.j();
                }
            }
        }

        public void serialize(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, christmasMatchMsgDataHighlightText.index);
            codedOutputByteBufferNano.G(2, christmasMatchMsgDataHighlightText.length);
        }
    };
    public static JsonAdapter<ChristmasMatchMsgDataHighlightText> JSON_ADAPTER = new ObjectJsonAdapter<ChristmasMatchMsgDataHighlightText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText.2
        public Class getDataClass() {
            return ChristmasMatchMsgDataHighlightText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChristmasMatchMsgDataHighlightText m12166newInstance() {
            return new ChristmasMatchMsgDataHighlightText();
        }

        public boolean parseField(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("length")) {
                christmasMatchMsgDataHighlightText.length = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("index")) {
                return false;
            }
            christmasMatchMsgDataHighlightText.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("length") || str.equals("index")) {
                return true;
            }
            return super.parseFieldCheck(christmasMatchMsgDataHighlightText, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("index", christmasMatchMsgDataHighlightText.index);
            jsonGenerator.writeNumberField("length", christmasMatchMsgDataHighlightText.length);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChristmasMatchMsgDataHighlightText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChristmasMatchMsgDataHighlightText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChristmasMatchMsgDataHighlightText new_() {
        ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText = new ChristmasMatchMsgDataHighlightText();
        christmasMatchMsgDataHighlightText.nullCheck();
        return christmasMatchMsgDataHighlightText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChristmasMatchMsgDataHighlightText m12164clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.index) * 41) + this.length;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
