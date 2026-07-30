package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class TarotCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotcarddata";

    @ProtobufIndex(index = 5)
    public int image;

    @NonNull
    @ProtobufIndex(index = 3)
    public String keywords;

    @NonNull
    @ProtobufIndex(index = 4)
    public String meaning;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 2)
    public boolean reversed;
    public static ProtobufAdapter<TarotCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotCardData>() { // from class: com.p1.mobile.putong.core.data.TarotCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TarotCardData tarotCardData) {
            String str = tarotCardData.name;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, tarotCardData.reversed);
            String str2 = tarotCardData.keywords;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = tarotCardData.meaning;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, tarotCardData.image);
            tarotCardData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TarotCardData parse(nb5 nb5Var) throws IOException {
            TarotCardData tarotCardData = new TarotCardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    tarotCardData.name = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    tarotCardData.reversed = nb5Var.m158738g();
                } else if (iM158752u == 26) {
                    tarotCardData.keywords = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    tarotCardData.meaning = nb5Var.m158750s();
                } else {
                    if (iM158752u != 40) {
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
                    tarotCardData.image = nb5Var.m158741j();
                }
            }
            return tarotCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TarotCardData tarotCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tarotCardData.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, tarotCardData.reversed);
            String str2 = tarotCardData.keywords;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = tarotCardData.meaning;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17250G(5, tarotCardData.image);
        }
    };
    public static JsonAdapter<TarotCardData> JSON_ADAPTER = new ObjectJsonAdapter<TarotCardData>() { // from class: com.p1.mobile.putong.core.data.TarotCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TarotCardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TarotCardData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TarotCardData tarotCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = tarotCardData.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotCardData new_() {
        TarotCardData tarotCardData = new TarotCardData();
        tarotCardData.nullCheck();
        return tarotCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TarotCardData mo223809clone() {
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.reversed ? 1231 : 1237)) * 41;
        String str2 = this.keywords;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.meaning;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.image;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
