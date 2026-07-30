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
public class InstantMatchUserInfo extends IntlBaseVisitorInfo implements Cloneable, Serializable {
    public static final String TYPE = "instantmatchuserinfo";
    public static ProtobufAdapter<InstantMatchUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<InstantMatchUserInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InstantMatchUserInfo instantMatchUserInfo) {
            String str = instantMatchUserInfo.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            instantMatchUserInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InstantMatchUserInfo parse(nc5 nc5Var) throws IOException {
            InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (instantMatchUserInfo.userID == null) {
                        instantMatchUserInfo.userID = "";
                    }
                    if (instantMatchUserInfo.title == null) {
                        instantMatchUserInfo.title = "";
                    }
                    if (instantMatchUserInfo.describe != null) {
                        break;
                    }
                    instantMatchUserInfo.describe = "";
                    break;
                }
                if (iM162497u == 10) {
                    instantMatchUserInfo.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    instantMatchUserInfo.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (instantMatchUserInfo.userID == null) {
                            instantMatchUserInfo.userID = "";
                        }
                        if (instantMatchUserInfo.title == null) {
                            instantMatchUserInfo.title = "";
                        }
                        if (instantMatchUserInfo.describe != null) {
                            break;
                        }
                        instantMatchUserInfo.describe = "";
                        return instantMatchUserInfo;
                    }
                    instantMatchUserInfo.describe = nc5Var.m162495s();
                }
            }
            return instantMatchUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InstantMatchUserInfo instantMatchUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = instantMatchUserInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<InstantMatchUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<InstantMatchUserInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InstantMatchUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InstantMatchUserInfo newInstance() {
            return new InstantMatchUserInfo();
        }

        public boolean parseField(InstantMatchUserInfo instantMatchUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userID":
                    instantMatchUserInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "title":
                    instantMatchUserInfo.title = jsonParser.getValueAsString();
                    return true;
                case "describe":
                    instantMatchUserInfo.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InstantMatchUserInfo instantMatchUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userID":
                case "title":
                case "describe":
                    return true;
                default:
                    return super.parseFieldCheck(instantMatchUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InstantMatchUserInfo instantMatchUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = instantMatchUserInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InstantMatchUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InstantMatchUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InstantMatchUserInfo new_() {
        InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
        instantMatchUserInfo.nullCheck();
        return instantMatchUserInfo;
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InstantMatchUserInfo mo225055clone() {
        InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
        instantMatchUserInfo.userID = this.userID;
        instantMatchUserInfo.title = this.title;
        instantMatchUserInfo.describe = this.describe;
        return instantMatchUserInfo;
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InstantMatchUserInfo) && super.equals(obj);
    }

    @Override // com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
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
