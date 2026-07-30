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
public class TarotCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotcarddata";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int image;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String keywords;

    @NonNull
    @ProtobufIndex(index = 4)
    public String meaning;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean reversed;
    public static ProtobufAdapter<TarotCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotCardData>() { // from class: com.p1.mobile.putong.core.data.TarotCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TarotCardData tarotCardData) {
            String str = tarotCardData.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, tarotCardData.reversed);
            String str2 = tarotCardData.keywords;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = tarotCardData.meaning;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, tarotCardData.image);
            ((MessageNano) tarotCardData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TarotCardData m15942parse(nb5 nb5Var) throws IOException {
            TarotCardData tarotCardData = new TarotCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tarotCardData.name == null) {
                        tarotCardData.name = "";
                    }
                    if (tarotCardData.keywords == null) {
                        tarotCardData.keywords = "";
                    }
                    if (tarotCardData.meaning != null) {
                        break;
                    }
                    tarotCardData.meaning = "";
                    break;
                }
                if (iU == 10) {
                    tarotCardData.name = nb5Var.s();
                } else if (iU == 16) {
                    tarotCardData.reversed = nb5Var.g();
                } else if (iU == 26) {
                    tarotCardData.keywords = nb5Var.s();
                } else if (iU == 34) {
                    tarotCardData.meaning = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (tarotCardData.name == null) {
                            tarotCardData.name = "";
                        }
                        if (tarotCardData.keywords == null) {
                            tarotCardData.keywords = "";
                        }
                        if (tarotCardData.meaning != null) {
                            break;
                        }
                        tarotCardData.meaning = "";
                        return tarotCardData;
                    }
                    tarotCardData.image = nb5Var.j();
                }
            }
            return tarotCardData;
        }

        public void serialize(TarotCardData tarotCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tarotCardData.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, tarotCardData.reversed);
            String str2 = tarotCardData.keywords;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = tarotCardData.meaning;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.G(5, tarotCardData.image);
        }
    };
    public static JsonAdapter<TarotCardData> JSON_ADAPTER = new ObjectJsonAdapter<TarotCardData>() { // from class: com.p1.mobile.putong.core.data.TarotCardData.2
        public Class getDataClass() {
            return TarotCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TarotCardData m15943newInstance() {
            return new TarotCardData();
        }

        public boolean parseField(TarotCardData tarotCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reversed":
                    tarotCardData.reversed = jsonParser.getValueAsBoolean();
                    return true;
                case "name":
                    tarotCardData.name = jsonParser.getValueAsString();
                    return true;
                case "image":
                    tarotCardData.image = jsonParser.getValueAsInt();
                    return true;
                case "keywords":
                    tarotCardData.keywords = jsonParser.getValueAsString();
                    return true;
                case "meaning":
                    tarotCardData.meaning = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TarotCardData tarotCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reversed":
                case "name":
                case "image":
                case "keywords":
                case "meaning":
                    return true;
                default:
                    return super.parseFieldCheck(tarotCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TarotCardData tarotCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = tarotCardData.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeBooleanField("reversed", tarotCardData.reversed);
            String str2 = tarotCardData.keywords;
            if (str2 != null) {
                jsonGenerator.writeStringField("keywords", str2);
            }
            String str3 = tarotCardData.meaning;
            if (str3 != null) {
                jsonGenerator.writeStringField("meaning", str3);
            }
            jsonGenerator.writeNumberField("image", tarotCardData.image);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotCardData new_() {
        TarotCardData tarotCardData = new TarotCardData();
        tarotCardData.nullCheck();
        return tarotCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TarotCardData m15941clone() {
        TarotCardData tarotCardData = new TarotCardData();
        tarotCardData.name = this.name;
        tarotCardData.reversed = this.reversed;
        tarotCardData.keywords = this.keywords;
        tarotCardData.meaning = this.meaning;
        tarotCardData.image = this.image;
        return tarotCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TarotCardData)) {
            return false;
        }
        TarotCardData tarotCardData = (TarotCardData) obj;
        return ValueObject.util_equals(this.name, tarotCardData.name) && this.reversed == tarotCardData.reversed && ValueObject.util_equals(this.keywords, tarotCardData.keywords) && ValueObject.util_equals(this.meaning, tarotCardData.meaning) && this.image == tarotCardData.image;
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.reversed ? 1231 : 1237)) * 41;
        String str2 = this.keywords;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.meaning;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.image;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.keywords == null) {
            this.keywords = "";
        }
        if (this.meaning == null) {
            this.meaning = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
