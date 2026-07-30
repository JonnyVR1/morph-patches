package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class AvatarFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarframeconfig";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39571id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<AvatarFrameConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.AvatarFrameConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AvatarFrameConfig avatarFrameConfig) {
            String str = avatarFrameConfig.f39571id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            avatarFrameConfig.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarFrameConfig parse(nc5 nc5Var) throws IOException {
            AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (avatarFrameConfig.f39571id == null) {
                        avatarFrameConfig.f39571id = "";
                    }
                    if (avatarFrameConfig.url != null) {
                        break;
                    }
                    avatarFrameConfig.url = "";
                    break;
                }
                if (iM162497u == 10) {
                    avatarFrameConfig.f39571id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (avatarFrameConfig.f39571id == null) {
                            avatarFrameConfig.f39571id = "";
                        }
                        if (avatarFrameConfig.url != null) {
                            break;
                        }
                        avatarFrameConfig.url = "";
                        return avatarFrameConfig;
                    }
                    avatarFrameConfig.url = nc5Var.m162495s();
                }
            }
            return avatarFrameConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarFrameConfig avatarFrameConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarFrameConfig.f39571id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<AvatarFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<AvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.AvatarFrameConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarFrameConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AvatarFrameConfig newInstance() {
            return new AvatarFrameConfig();
        }

        public boolean parseField(AvatarFrameConfig avatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                avatarFrameConfig.f39571id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("url")) {
                return false;
            }
            avatarFrameConfig.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AvatarFrameConfig avatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(avatarFrameConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AvatarFrameConfig avatarFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarFrameConfig.f39571id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarFrameConfig new_() {
        AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
        avatarFrameConfig.nullCheck();
        return avatarFrameConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AvatarFrameConfig mo225055clone() {
        AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
        avatarFrameConfig.f39571id = this.f39571id;
        avatarFrameConfig.url = this.url;
        return avatarFrameConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarFrameConfig)) {
            return false;
        }
        AvatarFrameConfig avatarFrameConfig = (AvatarFrameConfig) obj;
        return ValueObject.util_equals(this.f39571id, avatarFrameConfig.f39571id) && ValueObject.util_equals(this.url, avatarFrameConfig.url);
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
        String str = this.f39571id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39571id == null) {
            this.f39571id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
