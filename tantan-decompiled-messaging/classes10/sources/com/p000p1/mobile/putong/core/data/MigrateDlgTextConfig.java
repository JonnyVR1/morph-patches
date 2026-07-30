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
public class MigrateDlgTextConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgtextconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String download;

    @NonNull
    @ProtobufIndex(index = 4)
    public String learnMore;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MigrateDlgTextConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgTextConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgTextConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MigrateDlgTextConfig migrateDlgTextConfig) {
            String str = migrateDlgTextConfig.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = migrateDlgTextConfig.download;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = migrateDlgTextConfig.learnMore;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) migrateDlgTextConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MigrateDlgTextConfig m14319parse(nb5 nb5Var) throws IOException {
            MigrateDlgTextConfig migrateDlgTextConfig = new MigrateDlgTextConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (migrateDlgTextConfig.title == null) {
                        migrateDlgTextConfig.title = "";
                    }
                    if (migrateDlgTextConfig.content == null) {
                        migrateDlgTextConfig.content = "";
                    }
                    if (migrateDlgTextConfig.download == null) {
                        migrateDlgTextConfig.download = "";
                    }
                    if (migrateDlgTextConfig.learnMore != null) {
                        break;
                    }
                    migrateDlgTextConfig.learnMore = "";
                    break;
                }
                if (iU == 10) {
                    migrateDlgTextConfig.title = nb5Var.s();
                } else if (iU == 18) {
                    migrateDlgTextConfig.content = nb5Var.s();
                } else if (iU == 26) {
                    migrateDlgTextConfig.download = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (migrateDlgTextConfig.title == null) {
                            migrateDlgTextConfig.title = "";
                        }
                        if (migrateDlgTextConfig.content == null) {
                            migrateDlgTextConfig.content = "";
                        }
                        if (migrateDlgTextConfig.download == null) {
                            migrateDlgTextConfig.download = "";
                        }
                        if (migrateDlgTextConfig.learnMore != null) {
                            break;
                        }
                        migrateDlgTextConfig.learnMore = "";
                        return migrateDlgTextConfig;
                    }
                    migrateDlgTextConfig.learnMore = nb5Var.s();
                }
            }
            return migrateDlgTextConfig;
        }

        public void serialize(MigrateDlgTextConfig migrateDlgTextConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = migrateDlgTextConfig.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = migrateDlgTextConfig.download;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = migrateDlgTextConfig.learnMore;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<MigrateDlgTextConfig> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgTextConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgTextConfig.2
        public Class getDataClass() {
            return MigrateDlgTextConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MigrateDlgTextConfig m14320newInstance() {
            return new MigrateDlgTextConfig();
        }

        public boolean parseField(MigrateDlgTextConfig migrateDlgTextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "title":
                    migrateDlgTextConfig.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    migrateDlgTextConfig.content = jsonParser.getValueAsString();
                    return true;
                case "download":
                    migrateDlgTextConfig.download = jsonParser.getValueAsString();
                    return true;
                case "learnMore":
                    migrateDlgTextConfig.learnMore = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MigrateDlgTextConfig migrateDlgTextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "title":
                case "content":
                case "download":
                case "learnMore":
                    return true;
                default:
                    return super.parseFieldCheck(migrateDlgTextConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MigrateDlgTextConfig migrateDlgTextConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = migrateDlgTextConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
            String str3 = migrateDlgTextConfig.download;
            if (str3 != null) {
                jsonGenerator.writeStringField("download", str3);
            }
            String str4 = migrateDlgTextConfig.learnMore;
            if (str4 != null) {
                jsonGenerator.writeStringField("learnMore", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgTextConfig new_() {
        MigrateDlgTextConfig migrateDlgTextConfig = new MigrateDlgTextConfig();
        migrateDlgTextConfig.nullCheck();
        return migrateDlgTextConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MigrateDlgTextConfig m14318clone() {
        MigrateDlgTextConfig migrateDlgTextConfig = new MigrateDlgTextConfig();
        migrateDlgTextConfig.title = this.title;
        migrateDlgTextConfig.content = this.content;
        migrateDlgTextConfig.download = this.download;
        migrateDlgTextConfig.learnMore = this.learnMore;
        return migrateDlgTextConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateDlgTextConfig)) {
            return false;
        }
        MigrateDlgTextConfig migrateDlgTextConfig = (MigrateDlgTextConfig) obj;
        return ValueObject.util_equals(this.title, migrateDlgTextConfig.title) && ValueObject.util_equals(this.content, migrateDlgTextConfig.content) && ValueObject.util_equals(this.download, migrateDlgTextConfig.download) && ValueObject.util_equals(this.learnMore, migrateDlgTextConfig.learnMore);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.download;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.learnMore;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.download == null) {
            this.download = "";
        }
        if (this.learnMore == null) {
            this.learnMore = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
