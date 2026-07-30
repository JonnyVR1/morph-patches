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
public class FBLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fblike";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39599id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBLike fBLike) {
            String str = fBLike.f39599id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = fBLike.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            fBLike.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBLike parse(nc5 nc5Var) throws IOException {
            FBLike fBLike = new FBLike();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fBLike.f39599id == null) {
                        fBLike.f39599id = "";
                    }
                    if (fBLike.name == null) {
                        fBLike.name = "";
                    }
                    if (fBLike.category != null) {
                        break;
                    }
                    fBLike.category = "";
                    break;
                }
                if (iM162497u == 10) {
                    fBLike.f39599id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    fBLike.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (fBLike.f39599id == null) {
                            fBLike.f39599id = "";
                        }
                        if (fBLike.name == null) {
                            fBLike.name = "";
                        }
                        if (fBLike.category != null) {
                            break;
                        }
                        fBLike.category = "";
                        return fBLike;
                    }
                    fBLike.category = nc5Var.m162495s();
                }
            }
            return fBLike;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBLike fBLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBLike.f39599id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = fBLike.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<FBLike> JSON_ADAPTER = new ObjectJsonAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBLike.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBLike newInstance() {
            return new FBLike();
        }

        public boolean parseField(FBLike fBLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    fBLike.f39599id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    fBLike.name = jsonParser.getValueAsString();
                    return true;
                case "category":
                    fBLike.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBLike fBLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(fBLike, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBLike fBLike, JsonGenerator jsonGenerator) throws IOException {
            String str = fBLike.f39599id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBLike.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBLike new_() {
        FBLike fBLike = new FBLike();
        fBLike.nullCheck();
        return fBLike;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBLike mo225055clone() {
        FBLike fBLike = new FBLike();
        fBLike.f39599id = this.f39599id;
        fBLike.name = this.name;
        fBLike.category = this.category;
        return fBLike;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBLike)) {
            return false;
        }
        FBLike fBLike = (FBLike) obj;
        return ValueObject.util_equals(this.f39599id, fBLike.f39599id) && ValueObject.util_equals(this.name, fBLike.name) && ValueObject.util_equals(this.category, fBLike.category);
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
        String str = this.f39599id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39599id == null) {
            this.f39599id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
