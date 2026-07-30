package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class InModeration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inmoderation";

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String nickName;
    public static ProtobufAdapter<InModeration> PROTOBUF_ADAPTER = new MessageNanoAdapter<InModeration>() { // from class: com.p1.mobile.putong.core.data.InModeration.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InModeration inModeration) {
            String str = inModeration.nickName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = inModeration.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            inModeration.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InModeration parse(nc5 nc5Var) throws IOException {
            InModeration inModeration = new InModeration();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (inModeration.nickName == null) {
                        inModeration.nickName = "";
                    }
                    if (inModeration.name == null) {
                        inModeration.name = "";
                    }
                    if (inModeration.description != null) {
                        break;
                    }
                    inModeration.description = "";
                    break;
                }
                if (iM162497u == 10) {
                    inModeration.nickName = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    inModeration.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (inModeration.nickName == null) {
                            inModeration.nickName = "";
                        }
                        if (inModeration.name == null) {
                            inModeration.name = "";
                        }
                        if (inModeration.description != null) {
                            break;
                        }
                        inModeration.description = "";
                        return inModeration;
                    }
                    inModeration.description = nc5Var.m162495s();
                }
            }
            return inModeration;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InModeration inModeration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inModeration.nickName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = inModeration.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<InModeration> JSON_ADAPTER = new ObjectJsonAdapter<InModeration>() { // from class: com.p1.mobile.putong.core.data.InModeration.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InModeration.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InModeration newInstance() {
            return new InModeration();
        }

        public boolean parseField(InModeration inModeration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    inModeration.description = jsonParser.getValueAsString();
                    return true;
                case "name":
                    inModeration.name = jsonParser.getValueAsString();
                    return true;
                case "nickName":
                    inModeration.nickName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InModeration inModeration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "name":
                case "nickName":
                    return true;
                default:
                    return super.parseFieldCheck(inModeration, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InModeration inModeration, JsonGenerator jsonGenerator) throws IOException {
            String str = inModeration.nickName;
            if (str != null) {
                jsonGenerator.writeStringField("nickName", str);
            }
            String str2 = inModeration.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InModeration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InModeration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InModeration new_() {
        InModeration inModeration = new InModeration();
        inModeration.nullCheck();
        return inModeration;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InModeration mo225055clone() {
        InModeration inModeration = new InModeration();
        inModeration.nickName = this.nickName;
        inModeration.name = this.name;
        inModeration.description = this.description;
        return inModeration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InModeration)) {
            return false;
        }
        InModeration inModeration = (InModeration) obj;
        return ValueObject.util_equals(this.nickName, inModeration.nickName) && ValueObject.util_equals(this.name, inModeration.name) && ValueObject.util_equals(this.description, inModeration.description);
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
        int i2 = i * 41;
        String str = this.nickName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
