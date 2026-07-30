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
public class InstantMatchUserInfo extends IntlBaseVisitorInfo implements Cloneable, Serializable {
    public static final String TYPE = "instantmatchuserinfo";
    public static ProtobufAdapter<InstantMatchUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<InstantMatchUserInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InstantMatchUserInfo instantMatchUserInfo) {
            String str = instantMatchUserInfo.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) instantMatchUserInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InstantMatchUserInfo m13480parse(nb5 nb5Var) throws IOException {
            InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    instantMatchUserInfo.userID = nb5Var.s();
                } else if (iU == 18) {
                    instantMatchUserInfo.title = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    instantMatchUserInfo.describe = nb5Var.s();
                }
            }
            return instantMatchUserInfo;
        }

        public void serialize(InstantMatchUserInfo instantMatchUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = instantMatchUserInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<InstantMatchUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<InstantMatchUserInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchUserInfo.2
        public Class getDataClass() {
            return InstantMatchUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InstantMatchUserInfo m13481newInstance() {
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

        public void serializeFields(InstantMatchUserInfo instantMatchUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = instantMatchUserInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = instantMatchUserInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = instantMatchUserInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InstantMatchUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InstantMatchUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InstantMatchUserInfo new_() {
        InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
        instantMatchUserInfo.nullCheck();
        return instantMatchUserInfo;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InstantMatchUserInfo mo13479clone() {
        InstantMatchUserInfo instantMatchUserInfo = new InstantMatchUserInfo();
        instantMatchUserInfo.userID = this.userID;
        instantMatchUserInfo.title = this.title;
        instantMatchUserInfo.describe = this.describe;
        return instantMatchUserInfo;
    }

    @Override // com.p000p1.mobile.putong.core.data.IntlBaseVisitorInfo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InstantMatchUserInfo) && super.equals(obj);
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
