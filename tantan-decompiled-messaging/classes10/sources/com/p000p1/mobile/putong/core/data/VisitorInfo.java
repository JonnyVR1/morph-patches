package com.p000p1.mobile.putong.core.data;

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
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VisitorInfo extends IntlBaseVisitorInfo implements Cloneable, Serializable {
    public static final String TYPE = "visitorinfo";
    public static ProtobufAdapter<VisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VisitorInfo visitorInfo) {
            String str = visitorInfo.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = visitorInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) visitorInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VisitorInfo m16248parse(nb5 nb5Var) throws IOException {
            VisitorInfo visitorInfo = new VisitorInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitorInfo.userID == null) {
                        visitorInfo.userID = "";
                    }
                    if (visitorInfo.title == null) {
                        visitorInfo.title = "";
                    }
                    if (visitorInfo.describe != null) {
                        break;
                    }
                    visitorInfo.describe = "";
                    break;
                }
                if (iU == 10) {
                    visitorInfo.userID = nb5Var.s();
                } else if (iU == 18) {
                    visitorInfo.title = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (visitorInfo.userID == null) {
                            visitorInfo.userID = "";
                        }
                        if (visitorInfo.title == null) {
                            visitorInfo.title = "";
                        }
                        if (visitorInfo.describe != null) {
                            break;
                        }
                        visitorInfo.describe = "";
                        return visitorInfo;
                    }
                    visitorInfo.describe = nb5Var.s();
                }
            }
            return visitorInfo;
        }

        public void serialize(VisitorInfo visitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = visitorInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<VisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorInfo.2
        public Class getDataClass() {
            return VisitorInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VisitorInfo m16249newInstance() {
            return new VisitorInfo();
        }

        public boolean parseField(VisitorInfo visitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userID":
                    visitorInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "title":
                    visitorInfo.title = jsonParser.getValueAsString();
                    return true;
                case "describe":
                    visitorInfo.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorInfo visitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userID":
                case "title":
                case "describe":
                    return true;
                default:
                    return super.parseFieldCheck(visitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(VisitorInfo visitorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = visitorInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorInfo new_() {
        VisitorInfo visitorInfo = new VisitorInfo();
        visitorInfo.nullCheck();
        return visitorInfo;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    /* JADX INFO: renamed from: clone */
    public VisitorInfo mo13479clone() {
        VisitorInfo visitorInfo = new VisitorInfo();
        visitorInfo.userID = this.userID;
        visitorInfo.title = this.title;
        visitorInfo.describe = this.describe;
        return visitorInfo;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof VisitorInfo) && super.equals(obj);
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public void nullCheck() {
        super.nullCheck();
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
