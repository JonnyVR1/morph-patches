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
public class TttMigrateBannerConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tttmigratebannerconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<TttMigrateBannerConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<TttMigrateBannerConfig>() { // from class: com.p1.mobile.putong.core.data.TttMigrateBannerConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TttMigrateBannerConfig tttMigrateBannerConfig) {
            String str = tttMigrateBannerConfig.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            tttMigrateBannerConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TttMigrateBannerConfig parse(nb5 nb5Var) throws IOException {
            TttMigrateBannerConfig tttMigrateBannerConfig = new TttMigrateBannerConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tttMigrateBannerConfig.title == null) {
                        tttMigrateBannerConfig.title = "";
                    }
                    if (tttMigrateBannerConfig.button != null) {
                        break;
                    }
                    tttMigrateBannerConfig.button = "";
                    break;
                }
                if (iM158752u == 10) {
                    tttMigrateBannerConfig.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (tttMigrateBannerConfig.title == null) {
                            tttMigrateBannerConfig.title = "";
                        }
                        if (tttMigrateBannerConfig.button != null) {
                            break;
                        }
                        tttMigrateBannerConfig.button = "";
                        return tttMigrateBannerConfig;
                    }
                    tttMigrateBannerConfig.button = nb5Var.m158750s();
                }
            }
            return tttMigrateBannerConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TttMigrateBannerConfig tttMigrateBannerConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tttMigrateBannerConfig.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<TttMigrateBannerConfig> JSON_ADAPTER = new ObjectJsonAdapter<TttMigrateBannerConfig>() { // from class: com.p1.mobile.putong.core.data.TttMigrateBannerConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TttMigrateBannerConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TttMigrateBannerConfig newInstance() {
            return new TttMigrateBannerConfig();
        }

        public boolean parseField(TttMigrateBannerConfig tttMigrateBannerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("button")) {
                tttMigrateBannerConfig.button = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            tttMigrateBannerConfig.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TttMigrateBannerConfig tttMigrateBannerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("button") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(tttMigrateBannerConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TttMigrateBannerConfig tttMigrateBannerConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = tttMigrateBannerConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                jsonGenerator.writeStringField("button", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TttMigrateBannerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TttMigrateBannerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TttMigrateBannerConfig new_() {
        TttMigrateBannerConfig tttMigrateBannerConfig = new TttMigrateBannerConfig();
        tttMigrateBannerConfig.nullCheck();
        return tttMigrateBannerConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TttMigrateBannerConfig mo223809clone() {
        TttMigrateBannerConfig tttMigrateBannerConfig = new TttMigrateBannerConfig();
        tttMigrateBannerConfig.title = this.title;
        tttMigrateBannerConfig.button = this.button;
        return tttMigrateBannerConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TttMigrateBannerConfig)) {
            return false;
        }
        TttMigrateBannerConfig tttMigrateBannerConfig = (TttMigrateBannerConfig) obj;
        return ValueObject.util_equals(this.title, tttMigrateBannerConfig.title) && ValueObject.util_equals(this.button, tttMigrateBannerConfig.button);
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
        String str2 = this.button;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.button == null) {
            this.button = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
