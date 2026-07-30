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
public class FBPage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbpage";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f213id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBPage> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBPage>() { // from class: com.p1.mobile.putong.data.FBPage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBPage fBPage) {
            String str = fBPage.f213id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = fBPage.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) fBPage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBPage m18046parse(nb5 nb5Var) throws IOException {
            FBPage fBPage = new FBPage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBPage.f213id == null) {
                        fBPage.f213id = "";
                    }
                    if (fBPage.name != null) {
                        break;
                    }
                    fBPage.name = "";
                    break;
                }
                if (iU == 10) {
                    fBPage.f213id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (fBPage.f213id == null) {
                            fBPage.f213id = "";
                        }
                        if (fBPage.name != null) {
                            break;
                        }
                        fBPage.name = "";
                        return fBPage;
                    }
                    fBPage.name = nb5Var.s();
                }
            }
            return fBPage;
        }

        public void serialize(FBPage fBPage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBPage.f213id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = fBPage.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FBPage> JSON_ADAPTER = new ObjectJsonAdapter<FBPage>() { // from class: com.p1.mobile.putong.data.FBPage.2
        public Class getDataClass() {
            return FBPage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBPage mo17830newInstance() {
            return new FBPage();
        }

        public boolean parseField(FBPage fBPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                fBPage.f213id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("name")) {
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
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(fBPage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPage fBPage, JsonGenerator jsonGenerator) throws IOException {
            String str = fBPage.f213id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBPage.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPage new_() {
        FBPage fBPage = new FBPage();
        fBPage.nullCheck();
        return fBPage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBPage m18045clone() {
        FBPage fBPage = new FBPage();
        fBPage.f213id = this.f213id;
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
        return ValueObject.util_equals(this.f213id, fBPage.f213id) && ValueObject.util_equals(this.name, fBPage.name);
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
        String str = this.f213id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f213id == null) {
            this.f213id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
