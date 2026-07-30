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
public class QuickChatOneside extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatoneside";

    @NonNull
    @ProtobufIndex(index = 3)
    public QuickChatBiz biz;

    @ProtobufIndex(index = 4)
    public boolean isCommonMatch;

    @NonNull
    @ProtobufIndex(index = 1)
    public String stage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tracker;
    public static ProtobufAdapter<QuickChatOneside> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatOneside>() { // from class: com.p1.mobile.putong.core.data.QuickChatOneside.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatOneside quickChatOneside) {
            String str = quickChatOneside.stage;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = quickChatOneside.tracker;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            QuickChatBiz quickChatBiz = quickChatOneside.biz;
            if (quickChatBiz != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, quickChatOneside.isCommonMatch);
            quickChatOneside.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatOneside parse(nc5 nc5Var) throws IOException {
            QuickChatOneside quickChatOneside = new QuickChatOneside();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (quickChatOneside.stage == null) {
                        quickChatOneside.stage = "";
                    }
                    if (quickChatOneside.tracker == null) {
                        quickChatOneside.tracker = "";
                    }
                    if (quickChatOneside.biz != null) {
                        break;
                    }
                    quickChatOneside.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    quickChatOneside.stage = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    quickChatOneside.tracker = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    quickChatOneside.biz = (QuickChatBiz) nc5Var.m162488l(QuickChatBiz.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 32) {
                        if (quickChatOneside.stage == null) {
                            quickChatOneside.stage = "";
                        }
                        if (quickChatOneside.tracker == null) {
                            quickChatOneside.tracker = "";
                        }
                        if (quickChatOneside.biz != null) {
                            break;
                        }
                        quickChatOneside.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
                        return quickChatOneside;
                    }
                    quickChatOneside.isCommonMatch = nc5Var.m162483g();
                }
            }
            return quickChatOneside;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatOneside quickChatOneside, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatOneside.stage;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = quickChatOneside.tracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            QuickChatBiz quickChatBiz = quickChatOneside.biz;
            if (quickChatBiz != null) {
                codedOutputByteBufferNano.m17309K(3, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(4, quickChatOneside.isCommonMatch);
        }
    };
    public static JsonAdapter<QuickChatOneside> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatOneside>() { // from class: com.p1.mobile.putong.core.data.QuickChatOneside.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatOneside.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatOneside newInstance() {
            return new QuickChatOneside();
        }

        public boolean parseField(QuickChatOneside quickChatOneside, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    quickChatOneside.tracker = jsonParser.getValueAsString();
                    return true;
                case "biz":
                    quickChatOneside.biz = QuickChatBiz.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "stage":
                    quickChatOneside.stage = jsonParser.getValueAsString();
                    return true;
                case "isCommonMatch":
                    quickChatOneside.isCommonMatch = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickChatOneside quickChatOneside, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "biz":
                case "stage":
                case "isCommonMatch":
                    return true;
                default:
                    return super.parseFieldCheck(quickChatOneside, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatOneside quickChatOneside, JsonGenerator jsonGenerator) throws IOException {
            String str = quickChatOneside.stage;
            if (str != null) {
                jsonGenerator.writeStringField("stage", str);
            }
            String str2 = quickChatOneside.tracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("tracker", str2);
            }
            if (quickChatOneside.biz != null) {
                jsonGenerator.writeFieldName("biz");
                QuickChatBiz.JSON_ADAPTER.serialize(quickChatOneside.biz, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isCommonMatch", quickChatOneside.isCommonMatch);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatOneside new_() {
        QuickChatOneside quickChatOneside = new QuickChatOneside();
        quickChatOneside.nullCheck();
        return quickChatOneside;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatOneside mo225055clone() {
        QuickChatOneside quickChatOneside = new QuickChatOneside();
        quickChatOneside.stage = this.stage;
        quickChatOneside.tracker = this.tracker;
        quickChatOneside.biz = this.biz;
        quickChatOneside.isCommonMatch = this.isCommonMatch;
        return quickChatOneside;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatOneside)) {
            return false;
        }
        QuickChatOneside quickChatOneside = (QuickChatOneside) obj;
        return ValueObject.util_equals(this.stage, quickChatOneside.stage) && ValueObject.util_equals(this.tracker, quickChatOneside.tracker) && ValueObject.util_equals(this.biz, quickChatOneside.biz) && this.isCommonMatch == quickChatOneside.isCommonMatch;
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
        String str = this.stage;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tracker;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        QuickChatBiz quickChatBiz = this.biz;
        int iHashCode3 = ((iHashCode2 + (quickChatBiz != null ? quickChatBiz.hashCode() : 0)) * 41) + (this.isCommonMatch ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.biz == null) {
            this.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
