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
public class ThirdPartConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String text;

    @ProtobufIndex(index = 1)
    public boolean thirdPart;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String thirdPartLandPage;
    public static ProtobufAdapter<ThirdPartConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartConfig>() { // from class: com.p1.mobile.putong.core.data.ThirdPartConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartConfig thirdPartConfig) {
            int iB = CodedOutputByteBufferNano.b(1, thirdPartConfig.thirdPart);
            String str = thirdPartConfig.thirdPartLandPage;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = thirdPartConfig.text;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) thirdPartConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartConfig m15974parse(nb5 nb5Var) throws IOException {
            ThirdPartConfig thirdPartConfig = new ThirdPartConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thirdPartConfig.thirdPartLandPage == null) {
                        thirdPartConfig.thirdPartLandPage = "";
                    }
                    if (thirdPartConfig.text != null) {
                        break;
                    }
                    thirdPartConfig.text = "";
                    break;
                }
                if (iU == 8) {
                    thirdPartConfig.thirdPart = nb5Var.g();
                } else if (iU == 18) {
                    thirdPartConfig.thirdPartLandPage = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (thirdPartConfig.thirdPartLandPage == null) {
                            thirdPartConfig.thirdPartLandPage = "";
                        }
                        if (thirdPartConfig.text != null) {
                            break;
                        }
                        thirdPartConfig.text = "";
                        return thirdPartConfig;
                    }
                    thirdPartConfig.text = nb5Var.s();
                }
            }
            return thirdPartConfig;
        }

        public void serialize(ThirdPartConfig thirdPartConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, thirdPartConfig.thirdPart);
            String str = thirdPartConfig.thirdPartLandPage;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = thirdPartConfig.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<ThirdPartConfig> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartConfig>() { // from class: com.p1.mobile.putong.core.data.ThirdPartConfig.2
        public Class getDataClass() {
            return ThirdPartConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ThirdPartConfig m15975newInstance() {
            return new ThirdPartConfig();
        }

        public boolean parseField(ThirdPartConfig thirdPartConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "thirdPart":
                    thirdPartConfig.thirdPart = jsonParser.getValueAsBoolean();
                    return true;
                case "text":
                    thirdPartConfig.text = jsonParser.getValueAsString();
                    return true;
                case "thirdPartLandPage":
                    thirdPartConfig.thirdPartLandPage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThirdPartConfig thirdPartConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "thirdPart":
                case "text":
                case "thirdPartLandPage":
                    return true;
                default:
                    return super.parseFieldCheck(thirdPartConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ThirdPartConfig thirdPartConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("thirdPart", thirdPartConfig.thirdPart);
            String str = thirdPartConfig.thirdPartLandPage;
            if (str != null) {
                jsonGenerator.writeStringField("thirdPartLandPage", str);
            }
            String str2 = thirdPartConfig.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartConfig new_() {
        ThirdPartConfig thirdPartConfig = new ThirdPartConfig();
        thirdPartConfig.nullCheck();
        return thirdPartConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartConfig m15973clone() {
        ThirdPartConfig thirdPartConfig = new ThirdPartConfig();
        thirdPartConfig.thirdPart = this.thirdPart;
        thirdPartConfig.thirdPartLandPage = this.thirdPartLandPage;
        thirdPartConfig.text = this.text;
        return thirdPartConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartConfig)) {
            return false;
        }
        ThirdPartConfig thirdPartConfig = (ThirdPartConfig) obj;
        return this.thirdPart == thirdPartConfig.thirdPart && ValueObject.util_equals(this.thirdPartLandPage, thirdPartConfig.thirdPartLandPage) && ValueObject.util_equals(this.text, thirdPartConfig.text);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.thirdPart ? 1231 : 1237)) * 41;
        String str = this.thirdPartLandPage;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.thirdPartLandPage == null) {
            this.thirdPartLandPage = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
