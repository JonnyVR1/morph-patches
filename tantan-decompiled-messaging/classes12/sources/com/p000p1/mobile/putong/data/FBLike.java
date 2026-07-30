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
public class FBLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fblike";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f212id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBLike fBLike) {
            String str = fBLike.f212id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = fBLike.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) fBLike).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBLike m18040parse(nb5 nb5Var) throws IOException {
            FBLike fBLike = new FBLike();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBLike.f212id == null) {
                        fBLike.f212id = "";
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
                if (iU == 10) {
                    fBLike.f212id = nb5Var.s();
                } else if (iU == 18) {
                    fBLike.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (fBLike.f212id == null) {
                            fBLike.f212id = "";
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
                    fBLike.category = nb5Var.s();
                }
            }
            return fBLike;
        }

        public void serialize(FBLike fBLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBLike.f212id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = fBLike.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<FBLike> JSON_ADAPTER = new ObjectJsonAdapter<FBLike>() { // from class: com.p1.mobile.putong.data.FBLike.2
        public Class getDataClass() {
            return FBLike.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBLike mo17830newInstance() {
            return new FBLike();
        }

        public boolean parseField(FBLike fBLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    fBLike.f212id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBLike fBLike, JsonGenerator jsonGenerator) throws IOException {
            String str = fBLike.f212id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBLike.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = fBLike.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBLike new_() {
        FBLike fBLike = new FBLike();
        fBLike.nullCheck();
        return fBLike;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBLike m18039clone() {
        FBLike fBLike = new FBLike();
        fBLike.f212id = this.f212id;
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
        return ValueObject.util_equals(this.f212id, fBLike.f212id) && ValueObject.util_equals(this.name, fBLike.name) && ValueObject.util_equals(this.category, fBLike.category);
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
        String str = this.f212id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f212id == null) {
            this.f212id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
