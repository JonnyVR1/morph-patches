package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class AtUserIdBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "atuseridbox";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40062id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<AtUserIdBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<AtUserIdBox>() { // from class: com.p1.mobile.putong.feed.data.AtUserIdBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AtUserIdBox atUserIdBox) {
            String str = atUserIdBox.f40062id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            atUserIdBox.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AtUserIdBox parse(nc5 nc5Var) throws IOException {
            AtUserIdBox atUserIdBox = new AtUserIdBox();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (atUserIdBox.f40062id == null) {
                        atUserIdBox.f40062id = "";
                    }
                    if (atUserIdBox.name != null) {
                        break;
                    }
                    atUserIdBox.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    atUserIdBox.f40062id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (atUserIdBox.f40062id == null) {
                            atUserIdBox.f40062id = "";
                        }
                        if (atUserIdBox.name != null) {
                            break;
                        }
                        atUserIdBox.name = "";
                        return atUserIdBox;
                    }
                    atUserIdBox.name = nc5Var.m162495s();
                }
            }
            return atUserIdBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AtUserIdBox atUserIdBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = atUserIdBox.f40062id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<AtUserIdBox> JSON_ADAPTER = new ObjectJsonAdapter<AtUserIdBox>() { // from class: com.p1.mobile.putong.feed.data.AtUserIdBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AtUserIdBox.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AtUserIdBox newInstance() {
            return new AtUserIdBox();
        }

        public boolean parseField(AtUserIdBox atUserIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                atUserIdBox.f40062id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            atUserIdBox.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AtUserIdBox atUserIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(atUserIdBox, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AtUserIdBox atUserIdBox, JsonGenerator jsonGenerator) throws IOException {
            String str = atUserIdBox.f40062id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AtUserIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AtUserIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AtUserIdBox new_() {
        AtUserIdBox atUserIdBox = new AtUserIdBox();
        atUserIdBox.nullCheck();
        return atUserIdBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AtUserIdBox mo225055clone() {
        AtUserIdBox atUserIdBox = new AtUserIdBox();
        atUserIdBox.f40062id = this.f40062id;
        atUserIdBox.name = this.name;
        return atUserIdBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtUserIdBox)) {
            return false;
        }
        AtUserIdBox atUserIdBox = (AtUserIdBox) obj;
        return ValueObject.util_equals(this.f40062id, atUserIdBox.f40062id) && ValueObject.util_equals(this.name, atUserIdBox.name);
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
        String str = this.f40062id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40062id == null) {
            this.f40062id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
