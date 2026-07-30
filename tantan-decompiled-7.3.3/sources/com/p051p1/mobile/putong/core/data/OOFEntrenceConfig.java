package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.OOFEntrenceConfig;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class OOFEntrenceConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "oofentrenceconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String MessageRequestTime;

    @ProtobufIndex(index = 6)
    public int bubbleGuideNumber;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> bubbleText;

    @ProtobufIndex(index = 1)
    public boolean chooseEntrenceFemale;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> chooseEntrenceGuide;

    @ProtobufIndex(index = 2)
    public boolean chooseEntrenceMale;

    @NonNull
    @ProtobufIndex(index = 5)
    public String chooseEntrenceName;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> chooseEntrenceText;

    @ProtobufIndex(index = 3)
    public boolean receiveEntrence;
    public static ProtobufAdapter<OOFEntrenceConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OOFEntrenceConfig>() { // from class: com.p1.mobile.putong.core.data.OOFEntrenceConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OOFEntrenceConfig oOFEntrenceConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, oOFEntrenceConfig.chooseEntrenceFemale) + CodedOutputByteBufferNano.m17275b(2, oOFEntrenceConfig.chooseEntrenceMale) + CodedOutputByteBufferNano.m17275b(3, oOFEntrenceConfig.receiveEntrence);
            String str = oOFEntrenceConfig.MessageRequestTime;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = oOFEntrenceConfig.chooseEntrenceName;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(6, oOFEntrenceConfig.bubbleGuideNumber);
            List<String> list = oOFEntrenceConfig.chooseEntrenceText;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(7, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oOFEntrenceConfig.chooseEntrenceGuide;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = oOFEntrenceConfig.bubbleText;
            if (list3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            oOFEntrenceConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OOFEntrenceConfig parse(nc5 nc5Var) throws IOException {
            OOFEntrenceConfig oOFEntrenceConfig = new OOFEntrenceConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oOFEntrenceConfig.MessageRequestTime == null) {
                        oOFEntrenceConfig.MessageRequestTime = "";
                    }
                    if (oOFEntrenceConfig.chooseEntrenceName == null) {
                        oOFEntrenceConfig.chooseEntrenceName = "";
                    }
                    if (oOFEntrenceConfig.chooseEntrenceText == null) {
                        oOFEntrenceConfig.chooseEntrenceText = new ArrayList();
                    }
                    if (oOFEntrenceConfig.chooseEntrenceGuide == null) {
                        oOFEntrenceConfig.chooseEntrenceGuide = new ArrayList();
                    }
                    if (oOFEntrenceConfig.bubbleText != null) {
                        break;
                    }
                    oOFEntrenceConfig.bubbleText = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    oOFEntrenceConfig.chooseEntrenceFemale = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    oOFEntrenceConfig.chooseEntrenceMale = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    oOFEntrenceConfig.receiveEntrence = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    oOFEntrenceConfig.MessageRequestTime = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    oOFEntrenceConfig.chooseEntrenceName = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    oOFEntrenceConfig.bubbleGuideNumber = nc5Var.m162486j();
                } else if (iM162497u == 58) {
                    oOFEntrenceConfig.chooseEntrenceText = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 66) {
                    oOFEntrenceConfig.chooseEntrenceGuide = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 74) {
                        if (oOFEntrenceConfig.MessageRequestTime == null) {
                            oOFEntrenceConfig.MessageRequestTime = "";
                        }
                        if (oOFEntrenceConfig.chooseEntrenceName == null) {
                            oOFEntrenceConfig.chooseEntrenceName = "";
                        }
                        if (oOFEntrenceConfig.chooseEntrenceText == null) {
                            oOFEntrenceConfig.chooseEntrenceText = new ArrayList();
                        }
                        if (oOFEntrenceConfig.chooseEntrenceGuide == null) {
                            oOFEntrenceConfig.chooseEntrenceGuide = new ArrayList();
                        }
                        if (oOFEntrenceConfig.bubbleText != null) {
                            break;
                        }
                        oOFEntrenceConfig.bubbleText = new ArrayList();
                        return oOFEntrenceConfig;
                    }
                    oOFEntrenceConfig.bubbleText = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oOFEntrenceConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OOFEntrenceConfig oOFEntrenceConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, oOFEntrenceConfig.chooseEntrenceFemale);
            codedOutputByteBufferNano.m17299A(2, oOFEntrenceConfig.chooseEntrenceMale);
            codedOutputByteBufferNano.m17299A(3, oOFEntrenceConfig.receiveEntrence);
            String str = oOFEntrenceConfig.MessageRequestTime;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = oOFEntrenceConfig.chooseEntrenceName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17305G(6, oOFEntrenceConfig.bubbleGuideNumber);
            List<String> list = oOFEntrenceConfig.chooseEntrenceText;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(7, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oOFEntrenceConfig.chooseEntrenceGuide;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = oOFEntrenceConfig.bubbleText;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(9, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OOFEntrenceConfig> JSON_ADAPTER = new ObjectJsonAdapter<OOFEntrenceConfig>() { // from class: com.p1.mobile.putong.core.data.OOFEntrenceConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OOFEntrenceConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OOFEntrenceConfig newInstance() {
            return new OOFEntrenceConfig();
        }

        public boolean parseField(OOFEntrenceConfig oOFEntrenceConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chooseEntrenceGuide":
                    oOFEntrenceConfig.chooseEntrenceGuide = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "MessageRequestTime":
                    oOFEntrenceConfig.MessageRequestTime = jsonParser.getValueAsString();
                    return true;
                case "chooseEntrenceFemale":
                    oOFEntrenceConfig.chooseEntrenceFemale = jsonParser.getValueAsBoolean();
                    return true;
                case "bubbleText":
                    oOFEntrenceConfig.bubbleText = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "receiveEntrence":
                    oOFEntrenceConfig.receiveEntrence = jsonParser.getValueAsBoolean();
                    return true;
                case "bubbleGuideNumber":
                    oOFEntrenceConfig.bubbleGuideNumber = jsonParser.getValueAsInt();
                    return true;
                case "chooseEntrenceMale":
                    oOFEntrenceConfig.chooseEntrenceMale = jsonParser.getValueAsBoolean();
                    return true;
                case "chooseEntrenceName":
                    oOFEntrenceConfig.chooseEntrenceName = jsonParser.getValueAsString();
                    return true;
                case "chooseEntrenceText":
                    oOFEntrenceConfig.chooseEntrenceText = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OOFEntrenceConfig oOFEntrenceConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chooseEntrenceGuide":
                case "MessageRequestTime":
                case "chooseEntrenceFemale":
                case "bubbleText":
                case "receiveEntrence":
                case "bubbleGuideNumber":
                case "chooseEntrenceMale":
                case "chooseEntrenceName":
                case "chooseEntrenceText":
                    return true;
                default:
                    return super.parseFieldCheck(oOFEntrenceConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OOFEntrenceConfig oOFEntrenceConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("chooseEntrenceFemale", oOFEntrenceConfig.chooseEntrenceFemale);
            jsonGenerator.writeBooleanField("chooseEntrenceMale", oOFEntrenceConfig.chooseEntrenceMale);
            jsonGenerator.writeBooleanField("receiveEntrence", oOFEntrenceConfig.receiveEntrence);
            String str = oOFEntrenceConfig.MessageRequestTime;
            if (str != null) {
                jsonGenerator.writeStringField("MessageRequestTime", str);
            }
            String str2 = oOFEntrenceConfig.chooseEntrenceName;
            if (str2 != null) {
                jsonGenerator.writeStringField("chooseEntrenceName", str2);
            }
            jsonGenerator.writeNumberField("bubbleGuideNumber", oOFEntrenceConfig.bubbleGuideNumber);
            if (oOFEntrenceConfig.chooseEntrenceText != null) {
                jsonGenerator.writeFieldName("chooseEntrenceText");
                JsonAdapter.serializeArray(oOFEntrenceConfig.chooseEntrenceText, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oOFEntrenceConfig.chooseEntrenceGuide != null) {
                jsonGenerator.writeFieldName("chooseEntrenceGuide");
                JsonAdapter.serializeArray(oOFEntrenceConfig.chooseEntrenceGuide, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oOFEntrenceConfig.bubbleText != null) {
                jsonGenerator.writeFieldName("bubbleText");
                JsonAdapter.serializeArray(oOFEntrenceConfig.bubbleText, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OOFEntrenceConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OOFEntrenceConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36734a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36735b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36736c(String str) {
        return str;
    }

    public static OOFEntrenceConfig new_() {
        OOFEntrenceConfig oOFEntrenceConfig = new OOFEntrenceConfig();
        oOFEntrenceConfig.nullCheck();
        return oOFEntrenceConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OOFEntrenceConfig mo225055clone() {
        OOFEntrenceConfig oOFEntrenceConfig = new OOFEntrenceConfig();
        oOFEntrenceConfig.chooseEntrenceFemale = this.chooseEntrenceFemale;
        oOFEntrenceConfig.chooseEntrenceMale = this.chooseEntrenceMale;
        oOFEntrenceConfig.receiveEntrence = this.receiveEntrence;
        oOFEntrenceConfig.MessageRequestTime = this.MessageRequestTime;
        oOFEntrenceConfig.chooseEntrenceName = this.chooseEntrenceName;
        oOFEntrenceConfig.bubbleGuideNumber = this.bubbleGuideNumber;
        List<String> list = this.chooseEntrenceText;
        if (list != null) {
            oOFEntrenceConfig.chooseEntrenceText = ValueObject.util_map(list, new qcj() { // from class: l.h850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OOFEntrenceConfig.m36734a((String) obj);
                }
            });
        }
        List<String> list2 = this.chooseEntrenceGuide;
        if (list2 != null) {
            oOFEntrenceConfig.chooseEntrenceGuide = ValueObject.util_map(list2, new qcj() { // from class: l.i850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OOFEntrenceConfig.m36736c((String) obj);
                }
            });
        }
        List<String> list3 = this.bubbleText;
        if (list3 != null) {
            oOFEntrenceConfig.bubbleText = ValueObject.util_map(list3, new qcj() { // from class: l.j850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OOFEntrenceConfig.m36735b((String) obj);
                }
            });
        }
        return oOFEntrenceConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OOFEntrenceConfig)) {
            return false;
        }
        OOFEntrenceConfig oOFEntrenceConfig = (OOFEntrenceConfig) obj;
        return this.chooseEntrenceFemale == oOFEntrenceConfig.chooseEntrenceFemale && this.chooseEntrenceMale == oOFEntrenceConfig.chooseEntrenceMale && this.receiveEntrence == oOFEntrenceConfig.receiveEntrence && ValueObject.util_equals(this.MessageRequestTime, oOFEntrenceConfig.MessageRequestTime) && ValueObject.util_equals(this.chooseEntrenceName, oOFEntrenceConfig.chooseEntrenceName) && this.bubbleGuideNumber == oOFEntrenceConfig.bubbleGuideNumber && ValueObject.util_equals(this.chooseEntrenceText, oOFEntrenceConfig.chooseEntrenceText) && ValueObject.util_equals(this.chooseEntrenceGuide, oOFEntrenceConfig.chooseEntrenceGuide) && ValueObject.util_equals(this.bubbleText, oOFEntrenceConfig.bubbleText);
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
        int i2 = ((((((i * 41) + (this.chooseEntrenceFemale ? 1231 : 1237)) * 41) + (this.chooseEntrenceMale ? 1231 : 1237)) * 41) + (this.receiveEntrence ? 1231 : 1237)) * 41;
        String str = this.MessageRequestTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.chooseEntrenceName;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.bubbleGuideNumber) * 41;
        List<String> list = this.chooseEntrenceText;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.chooseEntrenceGuide;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.bubbleText;
        int iHashCode5 = iHashCode4 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.MessageRequestTime == null) {
            this.MessageRequestTime = "";
        }
        if (this.chooseEntrenceName == null) {
            this.chooseEntrenceName = "";
        }
        if (this.chooseEntrenceText == null) {
            this.chooseEntrenceText = new ArrayList();
        }
        if (this.chooseEntrenceGuide == null) {
            this.chooseEntrenceGuide = new ArrayList();
        }
        if (this.bubbleText == null) {
            this.bubbleText = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
