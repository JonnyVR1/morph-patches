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
public class QuickChatOneside extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatoneside";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public QuickChatBiz biz;

    @ProtobufIndex(index = 4)
    public boolean isCommonMatch;

    @NonNull
    @ProtobufIndex(index = 1)
    public String stage;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tracker;
    public static ProtobufAdapter<QuickChatOneside> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatOneside>() { // from class: com.p1.mobile.putong.core.data.QuickChatOneside.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatOneside quickChatOneside) {
            String str = quickChatOneside.stage;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = quickChatOneside.tracker;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            QuickChatBiz quickChatBiz = quickChatOneside.biz;
            if (quickChatBiz != null) {
                iO += CodedOutputByteBufferNano.l(3, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, quickChatOneside.isCommonMatch);
            ((MessageNano) quickChatOneside).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatOneside m15175parse(nb5 nb5Var) throws IOException {
            QuickChatOneside quickChatOneside = new QuickChatOneside();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    quickChatOneside.stage = nb5Var.s();
                } else if (iU == 18) {
                    quickChatOneside.tracker = nb5Var.s();
                } else if (iU == 26) {
                    quickChatOneside.biz = (QuickChatBiz) nb5Var.l(QuickChatBiz.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 32) {
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
                    quickChatOneside.isCommonMatch = nb5Var.g();
                }
            }
            return quickChatOneside;
        }

        public void serialize(QuickChatOneside quickChatOneside, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatOneside.stage;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = quickChatOneside.tracker;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            QuickChatBiz quickChatBiz = quickChatOneside.biz;
            if (quickChatBiz != null) {
                codedOutputByteBufferNano.K(3, quickChatBiz, QuickChatBiz.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(4, quickChatOneside.isCommonMatch);
        }
    };
    public static JsonAdapter<QuickChatOneside> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatOneside>() { // from class: com.p1.mobile.putong.core.data.QuickChatOneside.2
        public Class getDataClass() {
            return QuickChatOneside.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatOneside m15176newInstance() {
            return new QuickChatOneside();
        }

        public boolean parseField(QuickChatOneside quickChatOneside, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    quickChatOneside.tracker = jsonParser.getValueAsString();
                    return true;
                case "biz":
                    quickChatOneside.biz = (QuickChatBiz) QuickChatBiz.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatOneside new_() {
        QuickChatOneside quickChatOneside = new QuickChatOneside();
        quickChatOneside.nullCheck();
        return quickChatOneside;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatOneside m15174clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
