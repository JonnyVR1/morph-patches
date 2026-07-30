package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ChristmasMatchMsgDataText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "christmasmatchmsgdatatext";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<ChristmasMatchMsgDataHighlightText> highlight;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<ChristmasMatchMsgDataText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChristmasMatchMsgDataText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChristmasMatchMsgDataText christmasMatchMsgDataText) {
            String str = christmasMatchMsgDataText.value;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<ChristmasMatchMsgDataHighlightText> list = christmasMatchMsgDataText.highlight;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ChristmasMatchMsgDataHighlightText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            christmasMatchMsgDataText.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChristmasMatchMsgDataText parse(nb5 nb5Var) throws IOException {
            ChristmasMatchMsgDataText christmasMatchMsgDataText = new ChristmasMatchMsgDataText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (christmasMatchMsgDataText.value == null) {
                        christmasMatchMsgDataText.value = "";
                    }
                    if (christmasMatchMsgDataText.highlight != null) {
                        break;
                    }
                    christmasMatchMsgDataText.highlight = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    christmasMatchMsgDataText.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (christmasMatchMsgDataText.value == null) {
                            christmasMatchMsgDataText.value = "";
                        }
                        if (christmasMatchMsgDataText.highlight != null) {
                            break;
                        }
                        christmasMatchMsgDataText.highlight = new ArrayList();
                        return christmasMatchMsgDataText;
                    }
                    christmasMatchMsgDataText.highlight = (List) nb5Var.m158743l(ChristmasMatchMsgDataHighlightText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return christmasMatchMsgDataText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChristmasMatchMsgDataText christmasMatchMsgDataText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = christmasMatchMsgDataText.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<ChristmasMatchMsgDataHighlightText> list = christmasMatchMsgDataText.highlight;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ChristmasMatchMsgDataHighlightText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChristmasMatchMsgDataText> JSON_ADAPTER = new ObjectJsonAdapter<ChristmasMatchMsgDataText>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgDataText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChristmasMatchMsgDataText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChristmasMatchMsgDataText newInstance() {
            return new ChristmasMatchMsgDataText();
        }

        public boolean parseField(ChristmasMatchMsgDataText christmasMatchMsgDataText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("highlight")) {
                christmasMatchMsgDataText.highlight = JsonAdapter.parseArray(jsonParser, ChristmasMatchMsgDataHighlightText.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            christmasMatchMsgDataText.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ChristmasMatchMsgDataText christmasMatchMsgDataText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("highlight") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(christmasMatchMsgDataText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChristmasMatchMsgDataText christmasMatchMsgDataText, JsonGenerator jsonGenerator) throws IOException {
            String str = christmasMatchMsgDataText.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            if (christmasMatchMsgDataText.highlight != null) {
                jsonGenerator.writeFieldName("highlight");
                JsonAdapter.serializeArray(christmasMatchMsgDataText.highlight, jsonGenerator, ChristmasMatchMsgDataHighlightText.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChristmasMatchMsgDataText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChristmasMatchMsgDataText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChristmasMatchMsgDataText new_() {
        ChristmasMatchMsgDataText christmasMatchMsgDataText = new ChristmasMatchMsgDataText();
        christmasMatchMsgDataText.nullCheck();
        return christmasMatchMsgDataText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChristmasMatchMsgDataText mo223809clone() {
        ChristmasMatchMsgDataText christmasMatchMsgDataText = new ChristmasMatchMsgDataText();
        christmasMatchMsgDataText.value = this.value;
        List<ChristmasMatchMsgDataHighlightText> list = this.highlight;
        if (list != null) {
            christmasMatchMsgDataText.highlight = ValueObject.util_map(list, new w9j() { // from class: l.l35
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChristmasMatchMsgDataHighlightText) obj).mo223809clone();
                }
            });
        }
        return christmasMatchMsgDataText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChristmasMatchMsgDataText)) {
            return false;
        }
        ChristmasMatchMsgDataText christmasMatchMsgDataText = (ChristmasMatchMsgDataText) obj;
        return ValueObject.util_equals(this.value, christmasMatchMsgDataText.value) && ValueObject.util_equals(this.highlight, christmasMatchMsgDataText.highlight);
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
        List<ChristmasMatchMsgDataHighlightText> list = this.highlight;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.highlight == null) {
            this.highlight = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
