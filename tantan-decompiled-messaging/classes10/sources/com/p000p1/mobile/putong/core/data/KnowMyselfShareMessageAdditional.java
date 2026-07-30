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
public class KnowMyselfShareMessageAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "knowmyselfsharemessageadditional";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pageType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String target;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<KnowMyselfShareMessageAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<KnowMyselfShareMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional) {
            String str = knowMyselfShareMessageAdditional.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) knowMyselfShareMessageAdditional).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public KnowMyselfShareMessageAdditional m13781parse(nb5 nb5Var) throws IOException {
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (knowMyselfShareMessageAdditional.title == null) {
                        knowMyselfShareMessageAdditional.title = "";
                    }
                    if (knowMyselfShareMessageAdditional.buttonText == null) {
                        knowMyselfShareMessageAdditional.buttonText = "";
                    }
                    if (knowMyselfShareMessageAdditional.target == null) {
                        knowMyselfShareMessageAdditional.target = "";
                    }
                    if (knowMyselfShareMessageAdditional.pageType != null) {
                        break;
                    }
                    knowMyselfShareMessageAdditional.pageType = "";
                    break;
                }
                if (iU == 10) {
                    knowMyselfShareMessageAdditional.title = nb5Var.s();
                } else if (iU == 18) {
                    knowMyselfShareMessageAdditional.buttonText = nb5Var.s();
                } else if (iU == 26) {
                    knowMyselfShareMessageAdditional.target = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (knowMyselfShareMessageAdditional.title == null) {
                            knowMyselfShareMessageAdditional.title = "";
                        }
                        if (knowMyselfShareMessageAdditional.buttonText == null) {
                            knowMyselfShareMessageAdditional.buttonText = "";
                        }
                        if (knowMyselfShareMessageAdditional.target == null) {
                            knowMyselfShareMessageAdditional.target = "";
                        }
                        if (knowMyselfShareMessageAdditional.pageType != null) {
                            break;
                        }
                        knowMyselfShareMessageAdditional.pageType = "";
                        return knowMyselfShareMessageAdditional;
                    }
                    knowMyselfShareMessageAdditional.pageType = nb5Var.s();
                }
            }
            return knowMyselfShareMessageAdditional;
        }

        public void serialize(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = knowMyselfShareMessageAdditional.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<KnowMyselfShareMessageAdditional> JSON_ADAPTER = new ObjectJsonAdapter<KnowMyselfShareMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional.2
        public Class getDataClass() {
            return KnowMyselfShareMessageAdditional.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public KnowMyselfShareMessageAdditional m13782newInstance() {
            return new KnowMyselfShareMessageAdditional();
        }

        public boolean parseField(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "target":
                    knowMyselfShareMessageAdditional.target = jsonParser.getValueAsString();
                    return true;
                case "title":
                    knowMyselfShareMessageAdditional.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    knowMyselfShareMessageAdditional.buttonText = jsonParser.getValueAsString();
                    return true;
                case "pageType":
                    knowMyselfShareMessageAdditional.pageType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "target":
                case "title":
                case "buttonText":
                case "pageType":
                    return true;
                default:
                    return super.parseFieldCheck(knowMyselfShareMessageAdditional, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, JsonGenerator jsonGenerator) throws IOException {
            String str = knowMyselfShareMessageAdditional.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonText", str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                jsonGenerator.writeStringField(Target.TYPE, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                jsonGenerator.writeStringField("pageType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KnowMyselfShareMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KnowMyselfShareMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static KnowMyselfShareMessageAdditional new_() {
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
        knowMyselfShareMessageAdditional.nullCheck();
        return knowMyselfShareMessageAdditional;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public KnowMyselfShareMessageAdditional m13780clone() {
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
        knowMyselfShareMessageAdditional.title = this.title;
        knowMyselfShareMessageAdditional.buttonText = this.buttonText;
        knowMyselfShareMessageAdditional.target = this.target;
        knowMyselfShareMessageAdditional.pageType = this.pageType;
        return knowMyselfShareMessageAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KnowMyselfShareMessageAdditional)) {
            return false;
        }
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = (KnowMyselfShareMessageAdditional) obj;
        return ValueObject.util_equals(this.title, knowMyselfShareMessageAdditional.title) && ValueObject.util_equals(this.buttonText, knowMyselfShareMessageAdditional.buttonText) && ValueObject.util_equals(this.target, knowMyselfShareMessageAdditional.target) && ValueObject.util_equals(this.pageType, knowMyselfShareMessageAdditional.pageType);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.buttonText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.target;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pageType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.target == null) {
            this.target = "";
        }
        if (this.pageType == null) {
            this.pageType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
