package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class VisitorInfo extends IntlBaseVisitorInfo implements Cloneable, Serializable {
    public static final String TYPE = "visitorinfo";
    public static ProtobufAdapter<VisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorInfo visitorInfo) {
            String str = visitorInfo.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = visitorInfo.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            visitorInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorInfo parse(nc5 nc5Var) throws IOException {
            VisitorInfo visitorInfo = new VisitorInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    visitorInfo.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    visitorInfo.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    visitorInfo.describe = nc5Var.m162495s();
                }
            }
            return visitorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorInfo visitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = visitorInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<VisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<VisitorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorInfo visitorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = visitorInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = visitorInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorInfo new_() {
        VisitorInfo visitorInfo = new VisitorInfo();
        visitorInfo.nullCheck();
        return visitorInfo;
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorInfo mo225055clone() {
        VisitorInfo visitorInfo = new VisitorInfo();
        visitorInfo.userID = this.userID;
        visitorInfo.title = this.title;
        visitorInfo.describe = this.describe;
        return visitorInfo;
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof VisitorInfo) && super.equals(obj);
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "visitorinfo";
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
