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
public class MigrateDlgTextConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgtextconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String download;

    @NonNull
    @ProtobufIndex(index = 4)
    public String learnMore;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MigrateDlgTextConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgTextConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgTextConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MigrateDlgTextConfig migrateDlgTextConfig) {
            String str = migrateDlgTextConfig.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = migrateDlgTextConfig.download;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = migrateDlgTextConfig.learnMore;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            migrateDlgTextConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MigrateDlgTextConfig parse(nb5 nb5Var) throws IOException {
            MigrateDlgTextConfig migrateDlgTextConfig = new MigrateDlgTextConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    migrateDlgTextConfig.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    migrateDlgTextConfig.content = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    migrateDlgTextConfig.download = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    migrateDlgTextConfig.learnMore = nb5Var.m158750s();
                }
            }
            return migrateDlgTextConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MigrateDlgTextConfig migrateDlgTextConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = migrateDlgTextConfig.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = migrateDlgTextConfig.download;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = migrateDlgTextConfig.learnMore;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<MigrateDlgTextConfig> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgTextConfig>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgTextConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MigrateDlgTextConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MigrateDlgTextConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MigrateDlgTextConfig migrateDlgTextConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = migrateDlgTextConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = migrateDlgTextConfig.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgTextConfig new_() {
        MigrateDlgTextConfig migrateDlgTextConfig = new MigrateDlgTextConfig();
        migrateDlgTextConfig.nullCheck();
        return migrateDlgTextConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MigrateDlgTextConfig mo223809clone() {
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.download;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.learnMore;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
