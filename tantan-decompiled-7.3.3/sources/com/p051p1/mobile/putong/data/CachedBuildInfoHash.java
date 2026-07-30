package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
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
public class CachedBuildInfoHash extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cachedbuildinfohash";

    @Nullable
    @ProtobufIndex(index = 2)
    public String accessToken;

    @Nullable
    @ProtobufIndex(index = 4)
    public String hash;

    /* JADX INFO: renamed from: ua */
    @Nullable
    @ProtobufIndex(index = 3)
    public String f39579ua;

    @ProtobufIndex(index = 1)
    public long update_time;
    public static ProtobufAdapter<CachedBuildInfoHash> PROTOBUF_ADAPTER = new MessageNanoAdapter<CachedBuildInfoHash>() { // from class: com.p1.mobile.putong.data.CachedBuildInfoHash.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CachedBuildInfoHash cachedBuildInfoHash) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = cachedBuildInfoHash.f39579ua;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            cachedBuildInfoHash.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CachedBuildInfoHash parse(nc5 nc5Var) throws IOException {
            CachedBuildInfoHash cachedBuildInfoHash = new CachedBuildInfoHash();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    cachedBuildInfoHash.update_time = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    cachedBuildInfoHash.accessToken = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    cachedBuildInfoHash.f39579ua = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        return cachedBuildInfoHash;
                    }
                    cachedBuildInfoHash.hash = nc5Var.m162495s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CachedBuildInfoHash cachedBuildInfoHash, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = cachedBuildInfoHash.f39579ua;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<CachedBuildInfoHash> JSON_ADAPTER = new ObjectJsonAdapter<CachedBuildInfoHash>() { // from class: com.p1.mobile.putong.data.CachedBuildInfoHash.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CachedBuildInfoHash.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CachedBuildInfoHash newInstance() {
            return new CachedBuildInfoHash();
        }

        public boolean parseField(CachedBuildInfoHash cachedBuildInfoHash, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "accessToken":
                    cachedBuildInfoHash.accessToken = jsonParser.getValueAsString();
                    return true;
                case "update_time":
                    cachedBuildInfoHash.update_time = jsonParser.getValueAsLong();
                    return true;
                case "ua":
                    cachedBuildInfoHash.f39579ua = jsonParser.getValueAsString();
                    return true;
                case "hash":
                    cachedBuildInfoHash.hash = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CachedBuildInfoHash cachedBuildInfoHash, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "accessToken":
                case "update_time":
                case "ua":
                case "hash":
                    return true;
                default:
                    return super.parseFieldCheck(cachedBuildInfoHash, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CachedBuildInfoHash cachedBuildInfoHash, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("update_time", cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                jsonGenerator.writeStringField("accessToken", str);
            }
            String str2 = cachedBuildInfoHash.f39579ua;
            if (str2 != null) {
                jsonGenerator.writeStringField("ua", str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                jsonGenerator.writeStringField("hash", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CachedBuildInfoHash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CachedBuildInfoHash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CachedBuildInfoHash new_() {
        CachedBuildInfoHash cachedBuildInfoHash = new CachedBuildInfoHash();
        cachedBuildInfoHash.nullCheck();
        return cachedBuildInfoHash;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CachedBuildInfoHash mo225055clone() {
        CachedBuildInfoHash cachedBuildInfoHash = new CachedBuildInfoHash();
        cachedBuildInfoHash.update_time = this.update_time;
        cachedBuildInfoHash.accessToken = this.accessToken;
        cachedBuildInfoHash.f39579ua = this.f39579ua;
        cachedBuildInfoHash.hash = this.hash;
        return cachedBuildInfoHash;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CachedBuildInfoHash)) {
            return false;
        }
        CachedBuildInfoHash cachedBuildInfoHash = (CachedBuildInfoHash) obj;
        return this.update_time == cachedBuildInfoHash.update_time && ValueObject.util_equals(this.accessToken, cachedBuildInfoHash.accessToken) && ValueObject.util_equals(this.f39579ua, cachedBuildInfoHash.f39579ua) && ValueObject.util_equals(this.hash, cachedBuildInfoHash.hash);
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
        long j = this.update_time;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.accessToken;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f39579ua;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.hash;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
