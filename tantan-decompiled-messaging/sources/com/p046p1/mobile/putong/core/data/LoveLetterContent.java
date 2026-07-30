package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class LoveLetterContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovelettercontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 3)
    public int triggerType;
    public static ProtobufAdapter<LoveLetterContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterContent>() { // from class: com.p1.mobile.putong.core.data.LoveLetterContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveLetterContent loveLetterContent) {
            String str = loveLetterContent.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = loveLetterContent.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, loveLetterContent.triggerType);
            loveLetterContent.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveLetterContent parse(nb5 nb5Var) throws IOException {
            LoveLetterContent loveLetterContent = new LoveLetterContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (loveLetterContent.title == null) {
                        loveLetterContent.title = "";
                    }
                    if (loveLetterContent.subTitle != null) {
                        break;
                    }
                    loveLetterContent.subTitle = "";
                    break;
                }
                if (iM158752u == 10) {
                    loveLetterContent.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    loveLetterContent.subTitle = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (loveLetterContent.title == null) {
                            loveLetterContent.title = "";
                        }
                        if (loveLetterContent.subTitle != null) {
                            break;
                        }
                        loveLetterContent.subTitle = "";
                        return loveLetterContent;
                    }
                    loveLetterContent.triggerType = nb5Var.m158741j();
                }
            }
            return loveLetterContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveLetterContent loveLetterContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveLetterContent.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = loveLetterContent.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, loveLetterContent.triggerType);
        }
    };
    public static JsonAdapter<LoveLetterContent> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterContent>() { // from class: com.p1.mobile.putong.core.data.LoveLetterContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveLetterContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveLetterContent newInstance() {
            return new LoveLetterContent();
        }

        public boolean parseField(LoveLetterContent loveLetterContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    loveLetterContent.subTitle = jsonParser.getValueAsString();
                    return true;
                case "triggerType":
                    loveLetterContent.triggerType = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    loveLetterContent.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveLetterContent loveLetterContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "triggerType":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(loveLetterContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveLetterContent loveLetterContent, JsonGenerator jsonGenerator) throws IOException {
            String str = loveLetterContent.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = loveLetterContent.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            jsonGenerator.writeNumberField("triggerType", loveLetterContent.triggerType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterContent new_() {
        LoveLetterContent loveLetterContent = new LoveLetterContent();
        loveLetterContent.nullCheck();
        return loveLetterContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveLetterContent mo223809clone() {
        LoveLetterContent loveLetterContent = new LoveLetterContent();
        loveLetterContent.title = this.title;
        loveLetterContent.subTitle = this.subTitle;
        loveLetterContent.triggerType = this.triggerType;
        return loveLetterContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveLetterContent)) {
            return false;
        }
        LoveLetterContent loveLetterContent = (LoveLetterContent) obj;
        return ValueObject.util_equals(this.title, loveLetterContent.title) && ValueObject.util_equals(this.subTitle, loveLetterContent.subTitle) && this.triggerType == loveLetterContent.triggerType;
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.triggerType;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
