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
public class IntlSobotHelpCenter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlsobothelpcenter";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<IntlSobotHelpCenter> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlSobotHelpCenter>() { // from class: com.p1.mobile.putong.core.data.IntlSobotHelpCenter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlSobotHelpCenter intlSobotHelpCenter) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            intlSobotHelpCenter.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlSobotHelpCenter parse(nb5 nb5Var) throws IOException {
            IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlSobotHelpCenter.url != null) {
                        break;
                    }
                    intlSobotHelpCenter.url = "";
                    break;
                }
                if (iM158752u == 8) {
                    intlSobotHelpCenter.enable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (intlSobotHelpCenter.url != null) {
                            break;
                        }
                        intlSobotHelpCenter.url = "";
                        return intlSobotHelpCenter;
                    }
                    intlSobotHelpCenter.url = nb5Var.m158750s();
                }
            }
            return intlSobotHelpCenter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlSobotHelpCenter intlSobotHelpCenter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlSobotHelpCenter> JSON_ADAPTER = new ObjectJsonAdapter<IntlSobotHelpCenter>() { // from class: com.p1.mobile.putong.core.data.IntlSobotHelpCenter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlSobotHelpCenter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlSobotHelpCenter newInstance() {
            return new IntlSobotHelpCenter();
        }

        public boolean parseField(IntlSobotHelpCenter intlSobotHelpCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                intlSobotHelpCenter.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            intlSobotHelpCenter.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlSobotHelpCenter intlSobotHelpCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(intlSobotHelpCenter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlSobotHelpCenter intlSobotHelpCenter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlSobotHelpCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlSobotHelpCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlSobotHelpCenter new_() {
        IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
        intlSobotHelpCenter.nullCheck();
        return intlSobotHelpCenter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlSobotHelpCenter mo223809clone() {
        IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
        intlSobotHelpCenter.enable = this.enable;
        intlSobotHelpCenter.url = this.url;
        return intlSobotHelpCenter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlSobotHelpCenter)) {
            return false;
        }
        IntlSobotHelpCenter intlSobotHelpCenter = (IntlSobotHelpCenter) obj;
        return this.enable == intlSobotHelpCenter.enable && ValueObject.util_equals(this.url, intlSobotHelpCenter.url);
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
