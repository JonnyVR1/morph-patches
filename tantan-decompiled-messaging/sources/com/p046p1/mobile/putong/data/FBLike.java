package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class FBLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fblike";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38751id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBLike fBLike) {
            String str = fBLike.f38751id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = fBLike.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            fBLike.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBLike parse(nb5 nb5Var) throws IOException {
            FBLike fBLike = new FBLike();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBLike.f38751id == null) {
                        fBLike.f38751id = "";
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
                if (iM158752u == 10) {
                    fBLike.f38751id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    fBLike.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (fBLike.f38751id == null) {
                            fBLike.f38751id = "";
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
                    fBLike.category = nb5Var.m158750s();
                }
            }
            return fBLike;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBLike fBLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBLike.f38751id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = fBLike.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<FBLike> JSON_ADAPTER = new ObjectJsonAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBLike.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBLike newInstance() {
            return new FBLike();
        }

        public boolean parseField(FBLike fBLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    fBLike.f38751id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBLike fBLike, JsonGenerator jsonGenerator) throws IOException {
            String str = fBLike.f38751id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public FBLike mo223809clone() {
        FBLike fBLike = new FBLike();
        fBLike.f38751id = this.f38751id;
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
        return ValueObject.util_equals(this.f38751id, fBLike.f38751id) && ValueObject.util_equals(this.name, fBLike.name) && ValueObject.util_equals(this.category, fBLike.category);
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
        String str = this.f38751id;
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
        if (this.f38751id == null) {
            this.f38751id = "";
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
