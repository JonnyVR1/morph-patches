package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class BAvatar extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bavatar";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<BAvatar> PROTOBUF_ADAPTER = new MessageNanoAdapter<BAvatar>() { // from class: com.p1.mobile.putong.core.data.BAvatar.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BAvatar bAvatar) {
            String str = bAvatar.url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            bAvatar.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BAvatar parse(nc5 nc5Var) throws IOException {
            BAvatar bAvatar = new BAvatar();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bAvatar.url != null) {
                        break;
                    }
                    bAvatar.url = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (bAvatar.url != null) {
                        break;
                    }
                    bAvatar.url = "";
                    return bAvatar;
                }
                bAvatar.url = nc5Var.m162495s();
            }
            return bAvatar;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BAvatar bAvatar, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bAvatar.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<BAvatar> JSON_ADAPTER = new ObjectJsonAdapter<BAvatar>() { // from class: com.p1.mobile.putong.core.data.BAvatar.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BAvatar.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BAvatar newInstance() {
            return new BAvatar();
        }

        public boolean parseField(BAvatar bAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            bAvatar.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BAvatar bAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(bAvatar, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BAvatar bAvatar, JsonGenerator jsonGenerator) throws IOException {
            String str = bAvatar.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BAvatar new_() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.nullCheck();
        return bAvatar;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BAvatar mo225055clone() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.url = this.url;
        return bAvatar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BAvatar) {
            return ValueObject.util_equals(this.url, ((BAvatar) obj).url);
        }
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "bavatar";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
