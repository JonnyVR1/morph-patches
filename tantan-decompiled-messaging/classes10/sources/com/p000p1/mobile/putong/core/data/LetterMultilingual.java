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
public class LetterMultilingual extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lettermultilingual";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public LetterLibrary enUS;

    @NonNull
    @ProtobufIndex(index = 6)
    public LetterLibrary idID;

    @NonNull
    @ProtobufIndex(index = 4)
    public LetterLibrary jaJP;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public LetterLibrary koKR;

    @NonNull
    @ProtobufIndex(index = 1)
    public LetterLibrary zhCN;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LetterLibrary zhTW;
    public static ProtobufAdapter<LetterMultilingual> PROTOBUF_ADAPTER = new MessageNanoAdapter<LetterMultilingual>() { // from class: com.p1.mobile.putong.core.data.LetterMultilingual.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LetterMultilingual letterMultilingual) {
            LetterLibrary letterLibrary = letterMultilingual.zhCN;
            int iL = letterLibrary != null ? CodedOutputByteBufferNano.l(1, letterLibrary, LetterLibrary.PROTOBUF_ADAPTER) : 0;
            LetterLibrary letterLibrary2 = letterMultilingual.zhTW;
            if (letterLibrary2 != null) {
                iL += CodedOutputByteBufferNano.l(2, letterLibrary2, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary3 = letterMultilingual.enUS;
            if (letterLibrary3 != null) {
                iL += CodedOutputByteBufferNano.l(3, letterLibrary3, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary4 = letterMultilingual.jaJP;
            if (letterLibrary4 != null) {
                iL += CodedOutputByteBufferNano.l(4, letterLibrary4, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary5 = letterMultilingual.koKR;
            if (letterLibrary5 != null) {
                iL += CodedOutputByteBufferNano.l(5, letterLibrary5, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary6 = letterMultilingual.idID;
            if (letterLibrary6 != null) {
                iL += CodedOutputByteBufferNano.l(6, letterLibrary6, LetterLibrary.PROTOBUF_ADAPTER);
            }
            ((MessageNano) letterMultilingual).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LetterMultilingual m13833parse(nb5 nb5Var) throws IOException {
            LetterMultilingual letterMultilingual = new LetterMultilingual();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (letterMultilingual.zhCN == null) {
                        letterMultilingual.zhCN = LetterLibrary.new_();
                    }
                    if (letterMultilingual.zhTW == null) {
                        letterMultilingual.zhTW = LetterLibrary.new_();
                    }
                    if (letterMultilingual.enUS == null) {
                        letterMultilingual.enUS = LetterLibrary.new_();
                    }
                    if (letterMultilingual.jaJP == null) {
                        letterMultilingual.jaJP = LetterLibrary.new_();
                    }
                    if (letterMultilingual.koKR == null) {
                        letterMultilingual.koKR = LetterLibrary.new_();
                    }
                    if (letterMultilingual.idID != null) {
                        break;
                    }
                    letterMultilingual.idID = LetterLibrary.new_();
                    break;
                }
                if (iU == 10) {
                    letterMultilingual.zhCN = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    letterMultilingual.zhTW = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    letterMultilingual.enUS = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    letterMultilingual.jaJP = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    letterMultilingual.koKR = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (letterMultilingual.zhCN == null) {
                            letterMultilingual.zhCN = LetterLibrary.new_();
                        }
                        if (letterMultilingual.zhTW == null) {
                            letterMultilingual.zhTW = LetterLibrary.new_();
                        }
                        if (letterMultilingual.enUS == null) {
                            letterMultilingual.enUS = LetterLibrary.new_();
                        }
                        if (letterMultilingual.jaJP == null) {
                            letterMultilingual.jaJP = LetterLibrary.new_();
                        }
                        if (letterMultilingual.koKR == null) {
                            letterMultilingual.koKR = LetterLibrary.new_();
                        }
                        if (letterMultilingual.idID != null) {
                            break;
                        }
                        letterMultilingual.idID = LetterLibrary.new_();
                        return letterMultilingual;
                    }
                    letterMultilingual.idID = (LetterLibrary) nb5Var.l(LetterLibrary.PROTOBUF_ADAPTER);
                }
            }
            return letterMultilingual;
        }

        public void serialize(LetterMultilingual letterMultilingual, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LetterLibrary letterLibrary = letterMultilingual.zhCN;
            if (letterLibrary != null) {
                codedOutputByteBufferNano.K(1, letterLibrary, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary2 = letterMultilingual.zhTW;
            if (letterLibrary2 != null) {
                codedOutputByteBufferNano.K(2, letterLibrary2, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary3 = letterMultilingual.enUS;
            if (letterLibrary3 != null) {
                codedOutputByteBufferNano.K(3, letterLibrary3, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary4 = letterMultilingual.jaJP;
            if (letterLibrary4 != null) {
                codedOutputByteBufferNano.K(4, letterLibrary4, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary5 = letterMultilingual.koKR;
            if (letterLibrary5 != null) {
                codedOutputByteBufferNano.K(5, letterLibrary5, LetterLibrary.PROTOBUF_ADAPTER);
            }
            LetterLibrary letterLibrary6 = letterMultilingual.idID;
            if (letterLibrary6 != null) {
                codedOutputByteBufferNano.K(6, letterLibrary6, LetterLibrary.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LetterMultilingual> JSON_ADAPTER = new ObjectJsonAdapter<LetterMultilingual>() { // from class: com.p1.mobile.putong.core.data.LetterMultilingual.2
        public Class getDataClass() {
            return LetterMultilingual.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LetterMultilingual m13834newInstance() {
            return new LetterMultilingual();
        }

        public boolean parseField(LetterMultilingual letterMultilingual, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "en-US":
                    letterMultilingual.enUS = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id-ID":
                    letterMultilingual.idID = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ja-JP":
                    letterMultilingual.jaJP = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ko-KR":
                    letterMultilingual.koKR = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "zh-CN":
                    letterMultilingual.zhCN = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "zh-TW":
                    letterMultilingual.zhTW = (LetterLibrary) LetterLibrary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LetterMultilingual letterMultilingual, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "en-US":
                case "id-ID":
                case "ja-JP":
                case "ko-KR":
                case "zh-CN":
                case "zh-TW":
                    return true;
                default:
                    return super.parseFieldCheck(letterMultilingual, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LetterMultilingual letterMultilingual, JsonGenerator jsonGenerator) throws IOException {
            if (letterMultilingual.zhCN != null) {
                jsonGenerator.writeFieldName("zh-CN");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.zhCN, jsonGenerator, true);
            }
            if (letterMultilingual.zhTW != null) {
                jsonGenerator.writeFieldName("zh-TW");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.zhTW, jsonGenerator, true);
            }
            if (letterMultilingual.enUS != null) {
                jsonGenerator.writeFieldName("en-US");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.enUS, jsonGenerator, true);
            }
            if (letterMultilingual.jaJP != null) {
                jsonGenerator.writeFieldName("ja-JP");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.jaJP, jsonGenerator, true);
            }
            if (letterMultilingual.koKR != null) {
                jsonGenerator.writeFieldName("ko-KR");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.koKR, jsonGenerator, true);
            }
            if (letterMultilingual.idID != null) {
                jsonGenerator.writeFieldName("id-ID");
                LetterLibrary.JSON_ADAPTER.serialize(letterMultilingual.idID, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LetterMultilingual) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LetterMultilingual) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LetterMultilingual new_() {
        LetterMultilingual letterMultilingual = new LetterMultilingual();
        letterMultilingual.nullCheck();
        return letterMultilingual;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LetterMultilingual m13832clone() {
        LetterMultilingual letterMultilingual = new LetterMultilingual();
        LetterLibrary letterLibrary = this.zhCN;
        if (letterLibrary != null) {
            letterMultilingual.zhCN = letterLibrary.m13828clone();
        }
        LetterLibrary letterLibrary2 = this.zhTW;
        if (letterLibrary2 != null) {
            letterMultilingual.zhTW = letterLibrary2.m13828clone();
        }
        LetterLibrary letterLibrary3 = this.enUS;
        if (letterLibrary3 != null) {
            letterMultilingual.enUS = letterLibrary3.m13828clone();
        }
        LetterLibrary letterLibrary4 = this.jaJP;
        if (letterLibrary4 != null) {
            letterMultilingual.jaJP = letterLibrary4.m13828clone();
        }
        LetterLibrary letterLibrary5 = this.koKR;
        if (letterLibrary5 != null) {
            letterMultilingual.koKR = letterLibrary5.m13828clone();
        }
        LetterLibrary letterLibrary6 = this.idID;
        if (letterLibrary6 != null) {
            letterMultilingual.idID = letterLibrary6.m13828clone();
        }
        return letterMultilingual;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LetterMultilingual)) {
            return false;
        }
        LetterMultilingual letterMultilingual = (LetterMultilingual) obj;
        return ValueObject.util_equals(this.zhCN, letterMultilingual.zhCN) && ValueObject.util_equals(this.zhTW, letterMultilingual.zhTW) && ValueObject.util_equals(this.enUS, letterMultilingual.enUS) && ValueObject.util_equals(this.jaJP, letterMultilingual.jaJP) && ValueObject.util_equals(this.koKR, letterMultilingual.koKR) && ValueObject.util_equals(this.idID, letterMultilingual.idID);
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
        LetterLibrary letterLibrary = this.zhCN;
        int iHashCode = (i2 + (letterLibrary != null ? letterLibrary.hashCode() : 0)) * 41;
        LetterLibrary letterLibrary2 = this.zhTW;
        int iHashCode2 = (iHashCode + (letterLibrary2 != null ? letterLibrary2.hashCode() : 0)) * 41;
        LetterLibrary letterLibrary3 = this.enUS;
        int iHashCode3 = (iHashCode2 + (letterLibrary3 != null ? letterLibrary3.hashCode() : 0)) * 41;
        LetterLibrary letterLibrary4 = this.jaJP;
        int iHashCode4 = (iHashCode3 + (letterLibrary4 != null ? letterLibrary4.hashCode() : 0)) * 41;
        LetterLibrary letterLibrary5 = this.koKR;
        int iHashCode5 = (iHashCode4 + (letterLibrary5 != null ? letterLibrary5.hashCode() : 0)) * 41;
        LetterLibrary letterLibrary6 = this.idID;
        int iHashCode6 = iHashCode5 + (letterLibrary6 != null ? letterLibrary6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.zhCN == null) {
            this.zhCN = LetterLibrary.new_();
        }
        if (this.zhTW == null) {
            this.zhTW = LetterLibrary.new_();
        }
        if (this.enUS == null) {
            this.enUS = LetterLibrary.new_();
        }
        if (this.jaJP == null) {
            this.jaJP = LetterLibrary.new_();
        }
        if (this.koKR == null) {
            this.koKR = LetterLibrary.new_();
        }
        if (this.idID == null) {
            this.idID = LetterLibrary.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
