package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MigrateDlgConfig extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgconfig";

    @NonNull
    @ProtobufIndex(index = 6)
    public String homepageURL;

    @ProtobufIndex(index = 7)
    public boolean ignoreHw;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean migrateDlgClosable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String picUrl;

    @ProtobufIndex(index = 1)
    public boolean showDialog;

    @NonNull
    @ProtobufIndex(index = 4)
    public MigrateDlgTextConfig texts;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<MigrateDlgConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MigrateDlgConfig migrateDlgConfig) {
            int iB = CodedOutputByteBufferNano.b(1, migrateDlgConfig.showDialog);
            String str = migrateDlgConfig.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = migrateDlgConfig.picUrl;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            MigrateDlgTextConfig migrateDlgTextConfig = migrateDlgConfig.texts;
            if (migrateDlgTextConfig != null) {
                iB += CodedOutputByteBufferNano.l(4, migrateDlgTextConfig, MigrateDlgTextConfig.PROTOBUF_ADAPTER);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(5, migrateDlgConfig.migrateDlgClosable);
            String str3 = migrateDlgConfig.homepageURL;
            if (str3 != null) {
                iB2 += CodedOutputByteBufferNano.o(6, str3);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(7, migrateDlgConfig.ignoreHw);
            ((MessageNano) migrateDlgConfig).cachedSize = iB3;
            return iB3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MigrateDlgConfig m14311parse(nb5 nb5Var) throws IOException {
            MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    migrateDlgConfig.showDialog = nb5Var.g();
                } else if (iU == 18) {
                    migrateDlgConfig.type = nb5Var.s();
                } else if (iU == 26) {
                    migrateDlgConfig.picUrl = nb5Var.s();
                } else if (iU == 34) {
                    migrateDlgConfig.texts = (MigrateDlgTextConfig) nb5Var.l(MigrateDlgTextConfig.PROTOBUF_ADAPTER);
                } else if (iU == 40) {
                    migrateDlgConfig.migrateDlgClosable = nb5Var.g();
                } else if (iU == 50) {
                    migrateDlgConfig.homepageURL = nb5Var.s();
                } else {
                    if (iU != 56) {
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
                    migrateDlgConfig.ignoreHw = nb5Var.g();
                }
            }
            return migrateDlgConfig;
        }

        public void serialize(MigrateDlgConfig migrateDlgConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, migrateDlgConfig.showDialog);
            String str = migrateDlgConfig.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = migrateDlgConfig.picUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            MigrateDlgTextConfig migrateDlgTextConfig = migrateDlgConfig.texts;
            if (migrateDlgTextConfig != null) {
                codedOutputByteBufferNano.K(4, migrateDlgTextConfig, MigrateDlgTextConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(5, migrateDlgConfig.migrateDlgClosable);
            String str3 = migrateDlgConfig.homepageURL;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            codedOutputByteBufferNano.A(7, migrateDlgConfig.ignoreHw);
        }
    };
    public static JsonAdapter<MigrateDlgConfig> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfig.2
        public Class getDataClass() {
            return MigrateDlgConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MigrateDlgConfig m14312newInstance() {
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
                    migrateDlgConfig.texts = (MigrateDlgTextConfig) MigrateDlgTextConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgConfig new_() {
        MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
        migrateDlgConfig.nullCheck();
        return migrateDlgConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MigrateDlgConfig m14310clone() {
        MigrateDlgConfig migrateDlgConfig = new MigrateDlgConfig();
        migrateDlgConfig.showDialog = this.showDialog;
        migrateDlgConfig.type = this.type;
        migrateDlgConfig.picUrl = this.picUrl;
        MigrateDlgTextConfig migrateDlgTextConfig = this.texts;
        if (migrateDlgTextConfig != null) {
            migrateDlgConfig.texts = migrateDlgTextConfig.m14318clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
