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
public class AvatarFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarframeconfig";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f184id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<AvatarFrameConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.AvatarFrameConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AvatarFrameConfig avatarFrameConfig) {
            String str = avatarFrameConfig.f184id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) avatarFrameConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AvatarFrameConfig m17733parse(nb5 nb5Var) throws IOException {
            AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (avatarFrameConfig.f184id == null) {
                        avatarFrameConfig.f184id = "";
                    }
                    if (avatarFrameConfig.url != null) {
                        break;
                    }
                    avatarFrameConfig.url = "";
                    break;
                }
                if (iU == 10) {
                    avatarFrameConfig.f184id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (avatarFrameConfig.f184id == null) {
                            avatarFrameConfig.f184id = "";
                        }
                        if (avatarFrameConfig.url != null) {
                            break;
                        }
                        avatarFrameConfig.url = "";
                        return avatarFrameConfig;
                    }
                    avatarFrameConfig.url = nb5Var.s();
                }
            }
            return avatarFrameConfig;
        }

        public void serialize(AvatarFrameConfig avatarFrameConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarFrameConfig.f184id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AvatarFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<AvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.AvatarFrameConfig.2
        public Class getDataClass() {
            return AvatarFrameConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AvatarFrameConfig mo17830newInstance() {
            return new AvatarFrameConfig();
        }

        public boolean parseField(AvatarFrameConfig avatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                avatarFrameConfig.f184id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AvatarFrameConfig avatarFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarFrameConfig.f184id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = avatarFrameConfig.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarFrameConfig new_() {
        AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
        avatarFrameConfig.nullCheck();
        return avatarFrameConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AvatarFrameConfig m17732clone() {
        AvatarFrameConfig avatarFrameConfig = new AvatarFrameConfig();
        avatarFrameConfig.f184id = this.f184id;
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
        return ValueObject.util_equals(this.f184id, avatarFrameConfig.f184id) && ValueObject.util_equals(this.url, avatarFrameConfig.url);
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
        String str = this.f184id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f184id == null) {
            this.f184id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
