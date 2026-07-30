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
public class IntlBaseVisitorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlbasevisitorinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String describe;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<IntlBaseVisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlBaseVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.IntlBaseVisitorInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlBaseVisitorInfo intlBaseVisitorInfo) {
            String str = intlBaseVisitorInfo.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlBaseVisitorInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlBaseVisitorInfo.describe;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) intlBaseVisitorInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlBaseVisitorInfo m13491parse(nb5 nb5Var) throws IOException {
            IntlBaseVisitorInfo intlBaseVisitorInfo = new IntlBaseVisitorInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlBaseVisitorInfo.userID == null) {
                        intlBaseVisitorInfo.userID = "";
                    }
                    if (intlBaseVisitorInfo.title == null) {
                        intlBaseVisitorInfo.title = "";
                    }
                    if (intlBaseVisitorInfo.describe != null) {
                        break;
                    }
                    intlBaseVisitorInfo.describe = "";
                    break;
                }
                if (iU == 10) {
                    intlBaseVisitorInfo.userID = nb5Var.s();
                } else if (iU == 18) {
                    intlBaseVisitorInfo.title = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (intlBaseVisitorInfo.userID == null) {
                            intlBaseVisitorInfo.userID = "";
                        }
                        if (intlBaseVisitorInfo.title == null) {
                            intlBaseVisitorInfo.title = "";
                        }
                        if (intlBaseVisitorInfo.describe != null) {
                            break;
                        }
                        intlBaseVisitorInfo.describe = "";
                        return intlBaseVisitorInfo;
                    }
                    intlBaseVisitorInfo.describe = nb5Var.s();
                }
            }
            return intlBaseVisitorInfo;
        }

        public void serialize(IntlBaseVisitorInfo intlBaseVisitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlBaseVisitorInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlBaseVisitorInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlBaseVisitorInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<IntlBaseVisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<IntlBaseVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.IntlBaseVisitorInfo.2
        public Class getDataClass() {
            return IntlBaseVisitorInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlBaseVisitorInfo m13492newInstance() {
            return new IntlBaseVisitorInfo();
        }

        public boolean parseField(IntlBaseVisitorInfo intlBaseVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userID":
                    intlBaseVisitorInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "title":
                    intlBaseVisitorInfo.title = jsonParser.getValueAsString();
                    return true;
                case "describe":
                    intlBaseVisitorInfo.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlBaseVisitorInfo intlBaseVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userID":
                case "title":
                case "describe":
                    return true;
                default:
                    return super.parseFieldCheck(intlBaseVisitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlBaseVisitorInfo intlBaseVisitorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = intlBaseVisitorInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = intlBaseVisitorInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = intlBaseVisitorInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlBaseVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlBaseVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlBaseVisitorInfo new_() {
        IntlBaseVisitorInfo intlBaseVisitorInfo = new IntlBaseVisitorInfo();
        intlBaseVisitorInfo.nullCheck();
        return intlBaseVisitorInfo;
    }

    @Override // 
    public IntlBaseVisitorInfo mo13479clone() {
        IntlBaseVisitorInfo intlBaseVisitorInfo = new IntlBaseVisitorInfo();
        intlBaseVisitorInfo.userID = this.userID;
        intlBaseVisitorInfo.title = this.title;
        intlBaseVisitorInfo.describe = this.describe;
        return intlBaseVisitorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlBaseVisitorInfo)) {
            return false;
        }
        IntlBaseVisitorInfo intlBaseVisitorInfo = (IntlBaseVisitorInfo) obj;
        return ValueObject.util_equals(this.userID, intlBaseVisitorInfo.userID) && ValueObject.util_equals(this.title, intlBaseVisitorInfo.title) && ValueObject.util_equals(this.describe, intlBaseVisitorInfo.describe);
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.describe;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.describe == null) {
            this.describe = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
