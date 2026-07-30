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
public class LikedMeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likedmeinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikedMeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedMeInfo>() { // from class: com.p1.mobile.putong.core.data.LikedMeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikedMeInfo likedMeInfo) {
            String str = likedMeInfo.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            likedMeInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikedMeInfo parse(nc5 nc5Var) throws IOException {
            LikedMeInfo likedMeInfo = new LikedMeInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likedMeInfo.type != null) {
                        break;
                    }
                    likedMeInfo.type = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (likedMeInfo.type != null) {
                        break;
                    }
                    likedMeInfo.type = "";
                    return likedMeInfo;
                }
                likedMeInfo.type = nc5Var.m162495s();
            }
            return likedMeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikedMeInfo likedMeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedMeInfo.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<LikedMeInfo> JSON_ADAPTER = new ObjectJsonAdapter<LikedMeInfo>() { // from class: com.p1.mobile.putong.core.data.LikedMeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikedMeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikedMeInfo newInstance() {
            return new LikedMeInfo();
        }

        public boolean parseField(LikedMeInfo likedMeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("type")) {
                return false;
            }
            likedMeInfo.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LikedMeInfo likedMeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(likedMeInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikedMeInfo likedMeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = likedMeInfo.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedMeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedMeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedMeInfo new_() {
        LikedMeInfo likedMeInfo = new LikedMeInfo();
        likedMeInfo.nullCheck();
        return likedMeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikedMeInfo mo225055clone() {
        LikedMeInfo likedMeInfo = new LikedMeInfo();
        likedMeInfo.type = this.type;
        return likedMeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LikedMeInfo) {
            return ValueObject.util_equals(this.type, ((LikedMeInfo) obj).type);
        }
        return false;
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
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
