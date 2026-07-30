package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UniData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unidata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String accessCode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String access_token;

    @ProtobufIndex(index = 3)
    public long expires_in;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mobile;

    @NonNull
    @ProtobufIndex(index = 2)
    public String token_type;
    public static ProtobufAdapter<UniData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UniData>() { // from class: com.p1.mobile.putong.data.UniData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UniData uniData) {
            String str = uniData.access_token;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = uniData.token_type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, uniData.expires_in);
            String str3 = uniData.accessCode;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = uniData.mobile;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) uniData).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UniData m19130parse(nb5 nb5Var) throws IOException {
            UniData uniData = new UniData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (uniData.access_token == null) {
                        uniData.access_token = "";
                    }
                    if (uniData.token_type == null) {
                        uniData.token_type = "";
                    }
                    if (uniData.accessCode == null) {
                        uniData.accessCode = "";
                    }
                    if (uniData.mobile != null) {
                        break;
                    }
                    uniData.mobile = "";
                    break;
                }
                if (iU == 10) {
                    uniData.access_token = nb5Var.s();
                } else if (iU == 18) {
                    uniData.token_type = nb5Var.s();
                } else if (iU == 24) {
                    uniData.expires_in = nb5Var.k();
                } else if (iU == 34) {
                    uniData.accessCode = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (uniData.access_token == null) {
                            uniData.access_token = "";
                        }
                        if (uniData.token_type == null) {
                            uniData.token_type = "";
                        }
                        if (uniData.accessCode == null) {
                            uniData.accessCode = "";
                        }
                        if (uniData.mobile != null) {
                            break;
                        }
                        uniData.mobile = "";
                        return uniData;
                    }
                    uniData.mobile = nb5Var.s();
                }
            }
            return uniData;
        }

        public void serialize(UniData uniData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = uniData.access_token;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = uniData.token_type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, uniData.expires_in);
            String str3 = uniData.accessCode;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = uniData.mobile;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<UniData> JSON_ADAPTER = new ObjectJsonAdapter<UniData>() { // from class: com.p1.mobile.putong.data.UniData.2
        public Class getDataClass() {
            return UniData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UniData mo17830newInstance() {
            return new UniData();
        }

        public boolean parseField(UniData uniData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "access_token":
                    uniData.access_token = jsonParser.getValueAsString();
                    return true;
                case "accessCode":
                    uniData.accessCode = jsonParser.getValueAsString();
                    return true;
                case "mobile":
                    uniData.mobile = jsonParser.getValueAsString();
                    return true;
                case "expires_in":
                    uniData.expires_in = jsonParser.getValueAsLong();
                    return true;
                case "token_type":
                    uniData.token_type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UniData uniData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "access_token":
                case "accessCode":
                case "mobile":
                case "expires_in":
                case "token_type":
                    return true;
                default:
                    return super.parseFieldCheck(uniData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UniData uniData, JsonGenerator jsonGenerator) throws IOException {
            String str = uniData.access_token;
            if (str != null) {
                jsonGenerator.writeStringField("access_token", str);
            }
            String str2 = uniData.token_type;
            if (str2 != null) {
                jsonGenerator.writeStringField("token_type", str2);
            }
            jsonGenerator.writeNumberField("expires_in", uniData.expires_in);
            String str3 = uniData.accessCode;
            if (str3 != null) {
                jsonGenerator.writeStringField("accessCode", str3);
            }
            String str4 = uniData.mobile;
            if (str4 != null) {
                jsonGenerator.writeStringField(Mobile.TYPE, str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UniData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UniData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UniData new_() {
        UniData uniData = new UniData();
        uniData.nullCheck();
        return uniData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UniData m19129clone() {
        UniData uniData = new UniData();
        uniData.access_token = this.access_token;
        uniData.token_type = this.token_type;
        uniData.expires_in = this.expires_in;
        uniData.accessCode = this.accessCode;
        uniData.mobile = this.mobile;
        return uniData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UniData)) {
            return false;
        }
        UniData uniData = (UniData) obj;
        return ValueObject.util_equals(this.access_token, uniData.access_token) && ValueObject.util_equals(this.token_type, uniData.token_type) && this.expires_in == uniData.expires_in && ValueObject.util_equals(this.accessCode, uniData.accessCode) && ValueObject.util_equals(this.mobile, uniData.mobile);
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
        String str = this.access_token;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token_type;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expires_in;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.accessCode;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mobile;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.access_token == null) {
            this.access_token = "";
        }
        if (this.token_type == null) {
            this.token_type = "";
        }
        if (this.accessCode == null) {
            this.accessCode = "";
        }
        if (this.mobile == null) {
            this.mobile = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
