package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
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
    public String f38731ua;

    @ProtobufIndex(index = 1)
    public long update_time;
    public static ProtobufAdapter<CachedBuildInfoHash> PROTOBUF_ADAPTER = new MessageNanoAdapter<CachedBuildInfoHash>() { // from class: com.p1.mobile.putong.data.CachedBuildInfoHash.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CachedBuildInfoHash cachedBuildInfoHash) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = cachedBuildInfoHash.f38731ua;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            cachedBuildInfoHash.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CachedBuildInfoHash parse(nb5 nb5Var) throws IOException {
            CachedBuildInfoHash cachedBuildInfoHash = new CachedBuildInfoHash();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    cachedBuildInfoHash.update_time = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    cachedBuildInfoHash.accessToken = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    cachedBuildInfoHash.f38731ua = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        return cachedBuildInfoHash;
                    }
                    cachedBuildInfoHash.hash = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CachedBuildInfoHash cachedBuildInfoHash, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = cachedBuildInfoHash.f38731ua;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<CachedBuildInfoHash> JSON_ADAPTER = new ObjectJsonAdapter<CachedBuildInfoHash>() { // from class: com.p1.mobile.putong.data.CachedBuildInfoHash.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CachedBuildInfoHash.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    cachedBuildInfoHash.f38731ua = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CachedBuildInfoHash cachedBuildInfoHash, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("update_time", cachedBuildInfoHash.update_time);
            String str = cachedBuildInfoHash.accessToken;
            if (str != null) {
                jsonGenerator.writeStringField("accessToken", str);
            }
            String str2 = cachedBuildInfoHash.f38731ua;
            if (str2 != null) {
                jsonGenerator.writeStringField("ua", str2);
            }
            String str3 = cachedBuildInfoHash.hash;
            if (str3 != null) {
                jsonGenerator.writeStringField("hash", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CachedBuildInfoHash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public CachedBuildInfoHash mo223809clone() {
        CachedBuildInfoHash cachedBuildInfoHash = new CachedBuildInfoHash();
        cachedBuildInfoHash.update_time = this.update_time;
        cachedBuildInfoHash.accessToken = this.accessToken;
        cachedBuildInfoHash.f38731ua = this.f38731ua;
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
        return this.update_time == cachedBuildInfoHash.update_time && ValueObject.util_equals(this.accessToken, cachedBuildInfoHash.accessToken) && ValueObject.util_equals(this.f38731ua, cachedBuildInfoHash.f38731ua) && ValueObject.util_equals(this.hash, cachedBuildInfoHash.hash);
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
        String str2 = this.f38731ua;
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
