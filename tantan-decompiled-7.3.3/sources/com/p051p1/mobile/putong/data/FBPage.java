package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class FBPage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbpage";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39600id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBPage> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBPage>() { // from class: com.p1.mobile.putong.data.FBPage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBPage fBPage) {
            String str = fBPage.f39600id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = fBPage.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            fBPage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBPage parse(nc5 nc5Var) throws IOException {
            FBPage fBPage = new FBPage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fBPage.f39600id == null) {
                        fBPage.f39600id = "";
                    }
                    if (fBPage.name != null) {
                        break;
                    }
                    fBPage.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    fBPage.f39600id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (fBPage.f39600id == null) {
                            fBPage.f39600id = "";
                        }
                        if (fBPage.name != null) {
                            break;
                        }
                        fBPage.name = "";
                        return fBPage;
                    }
                    fBPage.name = nc5Var.m162495s();
                }
            }
            return fBPage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBPage fBPage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBPage.f39600id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = fBPage.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<FBPage> JSON_ADAPTER = new ObjectJsonAdapter<FBPage>() { // from class: com.p1.mobile.putong.data.FBPage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBPage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBPage newInstance() {
            return new FBPage();
        }

        public boolean parseField(FBPage fBPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                fBPage.f39600id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            fBPage.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FBPage fBPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(fBPage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPage fBPage, JsonGenerator jsonGenerator) throws IOException {
            String str = fBPage.f39600id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBPage.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPage new_() {
        FBPage fBPage = new FBPage();
        fBPage.nullCheck();
        return fBPage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBPage mo225055clone() {
        FBPage fBPage = new FBPage();
        fBPage.f39600id = this.f39600id;
        fBPage.name = this.name;
        return fBPage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBPage)) {
            return false;
        }
        FBPage fBPage = (FBPage) obj;
        return ValueObject.util_equals(this.f39600id, fBPage.f39600id) && ValueObject.util_equals(this.name, fBPage.name);
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
        String str = this.f39600id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39600id == null) {
            this.f39600id = "";
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
