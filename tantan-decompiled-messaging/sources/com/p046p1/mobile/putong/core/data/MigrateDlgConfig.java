package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class MigrateDlgConfig extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgconfig";

    @NonNull
    @ProtobufIndex(index = 6)
    public String homepageURL;

    @ProtobufIndex(index = 7)
    public boolean ignoreHw;

    @ProtobufIndex(index = 5)
    public boolean migrateDlgClosable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picUrl;

    @ProtobufIndex(index = 1)
    public boolean showDialog;

    @NonNull
    @ProtobufIndex(index = 4)
    public MigrateDlgTextConfig texts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MigrateDlgConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MigrateDlgConfig migrateDlgConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, migrateDlgConfig.showDialog);
            String str = migrateDlgConfig.type;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = migrateDlgConfig.picUrl;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            MigrateDlgTextConfig migrateDlgTextConfig = migrateDlgConfig.texts;
            if (migrateDlgTextConfig != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, migrateDlgTextConfig, MigrateDlgTextConfig.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(5, migrateDlgConfig.migrateDlgClosable);
            String str3 = migrateDlgConfig.homepageURL;
            if (str3 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(7, migrateDlgConfig.ignoreHw);
            migrateDlgConfig.cachedSize = iM17220b3;
            return iM17220b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MigrateDlgConfig parse(nb5 nb5Var) throws IOException {
            MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (migrateDlgConfig.type == null) {
                        migrateDlgConfig.type = "";
                    }
                    if (migrateDlgConfig.picUrl == null) {
                        migrateDlgConfig.picUrl = "";
                    }
                    if (migrateDlgConfig.texts == null) {
                        migrateDlgConfig.texts = MigrateDlgTextConfig.new_();
                    }
                    if (migrateDlgConfig.homepageURL != null) {
                        break;
                    }
                    migrateDlgConfig.homepageURL = "";
                    break;
                }
                if (iM158752u == 8) {
                    migrateDlgConfig.showDialog = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    migrateDlgConfig.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    migrateDlgConfig.picUrl = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    migrateDlgConfig.texts = (MigrateDlgTextConfig) nb5Var.m158743l(MigrateDlgTextConfig.PROTOBUF_ADAPTER);
                } else if (iM158752u == 40) {
                    migrateDlgConfig.migrateDlgClosable = nb5Var.m158738g();
                } else if (iM158752u == 50) {
                    migrateDlgConfig.homepageURL = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
                        if (migrateDlgConfig.type == null) {
                            migrateDlgConfig.type = "";
                        }
                        if (migrateDlgConfig.picUrl == null) {
                            migrateDlgConfig.picUrl = "";
                        }
                        if (migrateDlgConfig.texts == null) {
                            migrateDlgConfig.texts = MigrateDlgTextConfig.new_();
                        }
                        if (migrateDlgConfig.homepageURL != null) {
                            break;
                        }
                        migrateDlgConfig.homepageURL = "";
                        return migrateDlgConfig;
                    }
                    migrateDlgConfig.ignoreHw = nb5Var.m158738g();
                }
            }
            return migrateDlgConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MigrateDlgConfig migrateDlgConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, migrateDlgConfig.showDialog);
            String str = migrateDlgConfig.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = migrateDlgConfig.picUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            MigrateDlgTextConfig migrateDlgTextConfig = migrateDlgConfig.texts;
            if (migrateDlgTextConfig != null) {
                codedOutputByteBufferNano.m17254K(4, migrateDlgTextConfig, MigrateDlgTextConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(5, migrateDlgConfig.migrateDlgClosable);
            String str3 = migrateDlgConfig.homepageURL;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            codedOutputByteBufferNano.m17244A(7, migrateDlgConfig.ignoreHw);
        }
    };
    public static JsonAdapter<MigrateDlgConfig> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MigrateDlgConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MigrateDlgConfig newInstance() {
            return new MigrateDlgConfig();
        }

        public boolean parseField(MigrateDlgConfig migrateDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ignoreHw":
                    migrateDlgConfig.ignoreHw = jsonParser.getValueAsBoolean();
                    return true;
                case "picUrl":
                    migrateDlgConfig.picUrl = jsonParser.getValueAsString();
                    return true;
                case "migrateDlgClosable":
                    migrateDlgConfig.migrateDlgClosable = jsonParser.getValueAsBoolean();
                    return true;
                case "type":
                    migrateDlgConfig.type = jsonParser.getValueAsString();
                    return true;
                case "texts":
                    migrateDlgConfig.texts = MigrateDlgTextConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showDialog":
                    migrateDlgConfig.showDialog = jsonParser.getValueAsBoolean();
                    return true;
                case "homepageURL":
                    migrateDlgConfig.homepageURL = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MigrateDlgConfig migrateDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ignoreHw":
                case "picUrl":
                case "migrateDlgClosable":
                case "type":
                case "texts":
                case "showDialog":
                case "homepageURL":
                    return true;
                default:
                    return super.parseFieldCheck(migrateDlgConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MigrateDlgConfig migrateDlgConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showDialog", migrateDlgConfig.showDialog);
            String str = migrateDlgConfig.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = migrateDlgConfig.picUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("picUrl", str2);
            }
            if (migrateDlgConfig.texts != null) {
                jsonGenerator.writeFieldName("texts");
                MigrateDlgTextConfig.JSON_ADAPTER.serialize(migrateDlgConfig.texts, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("migrateDlgClosable", migrateDlgConfig.migrateDlgClosable);
            String str3 = migrateDlgConfig.homepageURL;
            if (str3 != null) {
                jsonGenerator.writeStringField("homepageURL", str3);
            }
            jsonGenerator.writeBooleanField("ignoreHw", migrateDlgConfig.ignoreHw);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgConfig new_() {
        MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
        migrateDlgConfig.nullCheck();
        return migrateDlgConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MigrateDlgConfig mo223809clone() {
        MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
        migrateDlgConfig.showDialog = this.showDialog;
        migrateDlgConfig.type = this.type;
        migrateDlgConfig.picUrl = this.picUrl;
        MigrateDlgTextConfig migrateDlgTextConfig = this.texts;
        if (migrateDlgTextConfig != null) {
            migrateDlgConfig.texts = migrateDlgTextConfig.mo223809clone();
        }
        migrateDlgConfig.migrateDlgClosable = this.migrateDlgClosable;
        migrateDlgConfig.homepageURL = this.homepageURL;
        migrateDlgConfig.ignoreHw = this.ignoreHw;
        return migrateDlgConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateDlgConfig)) {
            return false;
        }
        MigrateDlgConfig migrateDlgConfig = (MigrateDlgConfig) obj;
        return this == obj && this.showDialog == migrateDlgConfig.showDialog && ValueObject.util_equals(this.type, migrateDlgConfig.type) && ValueObject.util_equals(this.picUrl, migrateDlgConfig.picUrl) && ValueObject.util_equals(this.texts, migrateDlgConfig.texts) && this.migrateDlgClosable == migrateDlgConfig.migrateDlgClosable && ValueObject.util_equals(this.homepageURL, migrateDlgConfig.homepageURL) && this.ignoreHw == migrateDlgConfig.ignoreHw;
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
        int iHashCode = ((super.hashCode() * 41) + (this.showDialog ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picUrl;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        MigrateDlgTextConfig migrateDlgTextConfig = this.texts;
        int iHashCode4 = (((iHashCode3 + (migrateDlgTextConfig != null ? migrateDlgTextConfig.hashCode() : 0)) * 41) + (this.migrateDlgClosable ? 1231 : 1237)) * 41;
        String str3 = this.homepageURL;
        int iHashCode5 = ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.ignoreHw ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.type == null) {
            this.type = "";
        }
        if (this.picUrl == null) {
            this.picUrl = "";
        }
        if (this.texts == null) {
            this.texts = MigrateDlgTextConfig.new_();
        }
        if (this.homepageURL == null) {
            this.homepageURL = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
