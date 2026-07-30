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
public class FacebookInfoIdWithName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookinfoidwithname";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f216id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FacebookInfoIdWithName> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookInfoIdWithName>() { // from class: com.p1.mobile.putong.data.FacebookInfoIdWithName.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookInfoIdWithName facebookInfoIdWithName) {
            String str = facebookInfoIdWithName.f216id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) facebookInfoIdWithName).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookInfoIdWithName m18076parse(nb5 nb5Var) throws IOException {
            FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (facebookInfoIdWithName.f216id == null) {
                        facebookInfoIdWithName.f216id = "";
                    }
                    if (facebookInfoIdWithName.name != null) {
                        break;
                    }
                    facebookInfoIdWithName.name = "";
                    break;
                }
                if (iU == 10) {
                    facebookInfoIdWithName.f216id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (facebookInfoIdWithName.f216id == null) {
                            facebookInfoIdWithName.f216id = "";
                        }
                        if (facebookInfoIdWithName.name != null) {
                            break;
                        }
                        facebookInfoIdWithName.name = "";
                        return facebookInfoIdWithName;
                    }
                    facebookInfoIdWithName.name = nb5Var.s();
                }
            }
            return facebookInfoIdWithName;
        }

        public void serialize(FacebookInfoIdWithName facebookInfoIdWithName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = facebookInfoIdWithName.f216id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FacebookInfoIdWithName> JSON_ADAPTER = new ObjectJsonAdapter<FacebookInfoIdWithName>() { // from class: com.p1.mobile.putong.data.FacebookInfoIdWithName.2
        public Class getDataClass() {
            return FacebookInfoIdWithName.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookInfoIdWithName mo17830newInstance() {
            return new FacebookInfoIdWithName();
        }

        public boolean parseField(FacebookInfoIdWithName facebookInfoIdWithName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                facebookInfoIdWithName.f216id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("name")) {
                return false;
            }
            facebookInfoIdWithName.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FacebookInfoIdWithName facebookInfoIdWithName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(facebookInfoIdWithName, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookInfoIdWithName facebookInfoIdWithName, JsonGenerator jsonGenerator) throws IOException {
            String str = facebookInfoIdWithName.f216id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookInfoIdWithName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookInfoIdWithName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookInfoIdWithName new_() {
        FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
        facebookInfoIdWithName.nullCheck();
        return facebookInfoIdWithName;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookInfoIdWithName m18075clone() {
        FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
        facebookInfoIdWithName.f216id = this.f216id;
        facebookInfoIdWithName.name = this.name;
        return facebookInfoIdWithName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FacebookInfoIdWithName)) {
            return false;
        }
        FacebookInfoIdWithName facebookInfoIdWithName = (FacebookInfoIdWithName) obj;
        return ValueObject.util_equals(this.f216id, facebookInfoIdWithName.f216id) && ValueObject.util_equals(this.name, facebookInfoIdWithName.name);
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
        String str = this.f216id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f216id == null) {
            this.f216id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
