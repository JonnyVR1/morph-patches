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
public class ThirdPartConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @ProtobufIndex(index = 1)
    public boolean thirdPart;

    @NonNull
    @ProtobufIndex(index = 2)
    public String thirdPartLandPage;
    public static ProtobufAdapter<ThirdPartConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartConfig>() { // from class: com.p1.mobile.putong.core.data.ThirdPartConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartConfig thirdPartConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, thirdPartConfig.thirdPart);
            String str = thirdPartConfig.thirdPartLandPage;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = thirdPartConfig.text;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            thirdPartConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartConfig parse(nc5 nc5Var) throws IOException {
            ThirdPartConfig thirdPartConfig = new ThirdPartConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (thirdPartConfig.thirdPartLandPage == null) {
                        thirdPartConfig.thirdPartLandPage = "";
                    }
                    if (thirdPartConfig.text != null) {
                        break;
                    }
                    thirdPartConfig.text = "";
                    break;
                }
                if (iM162497u == 8) {
                    thirdPartConfig.thirdPart = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    thirdPartConfig.thirdPartLandPage = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (thirdPartConfig.thirdPartLandPage == null) {
                            thirdPartConfig.thirdPartLandPage = "";
                        }
                        if (thirdPartConfig.text != null) {
                            break;
                        }
                        thirdPartConfig.text = "";
                        return thirdPartConfig;
                    }
                    thirdPartConfig.text = nc5Var.m162495s();
                }
            }
            return thirdPartConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartConfig thirdPartConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, thirdPartConfig.thirdPart);
            String str = thirdPartConfig.thirdPartLandPage;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = thirdPartConfig.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<ThirdPartConfig> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartConfig>() { // from class: com.p1.mobile.putong.core.data.ThirdPartConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartConfig new_() {
        ThirdPartConfig thirdPartConfig = new ThirdPartConfig();
        thirdPartConfig.nullCheck();
        return thirdPartConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.thirdPart ? 1231 : 1237)) * 41;
        String str = this.thirdPartLandPage;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.thirdPartLandPage == null) {
            this.thirdPartLandPage = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
