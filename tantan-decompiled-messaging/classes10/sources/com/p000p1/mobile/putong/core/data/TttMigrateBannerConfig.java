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
public class TttMigrateBannerConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tttmigratebannerconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<TttMigrateBannerConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<TttMigrateBannerConfig>() { // from class: com.p1.mobile.putong.core.data.TttMigrateBannerConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TttMigrateBannerConfig tttMigrateBannerConfig) {
            String str = tttMigrateBannerConfig.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) tttMigrateBannerConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TttMigrateBannerConfig m16072parse(nb5 nb5Var) throws IOException {
            TttMigrateBannerConfig tttMigrateBannerConfig = new TttMigrateBannerConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tttMigrateBannerConfig.title == null) {
                        tttMigrateBannerConfig.title = "";
                    }
                    if (tttMigrateBannerConfig.button != null) {
                        break;
                    }
                    tttMigrateBannerConfig.button = "";
                    break;
                }
                if (iU == 10) {
                    tttMigrateBannerConfig.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (tttMigrateBannerConfig.title == null) {
                            tttMigrateBannerConfig.title = "";
                        }
                        if (tttMigrateBannerConfig.button != null) {
                            break;
                        }
                        tttMigrateBannerConfig.button = "";
                        return tttMigrateBannerConfig;
                    }
                    tttMigrateBannerConfig.button = nb5Var.s();
                }
            }
            return tttMigrateBannerConfig;
        }

        public void serialize(TttMigrateBannerConfig tttMigrateBannerConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tttMigrateBannerConfig.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<TttMigrateBannerConfig> JSON_ADAPTER = new ObjectJsonAdapter<TttMigrateBannerConfig>() { // from class: com.p1.mobile.putong.core.data.TttMigrateBannerConfig.2
        public Class getDataClass() {
            return TttMigrateBannerConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TttMigrateBannerConfig m16073newInstance() {
            return new TttMigrateBannerConfig();
        }

        public boolean parseField(TttMigrateBannerConfig tttMigrateBannerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Button.TYPE)) {
                tttMigrateBannerConfig.button = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            tttMigrateBannerConfig.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TttMigrateBannerConfig tttMigrateBannerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Button.TYPE) || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(tttMigrateBannerConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TttMigrateBannerConfig tttMigrateBannerConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = tttMigrateBannerConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = tttMigrateBannerConfig.button;
            if (str2 != null) {
                jsonGenerator.writeStringField(Button.TYPE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TttMigrateBannerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TttMigrateBannerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TttMigrateBannerConfig new_() {
        TttMigrateBannerConfig tttMigrateBannerConfig = new TttMigrateBannerConfig();
        tttMigrateBannerConfig.nullCheck();
        return tttMigrateBannerConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TttMigrateBannerConfig m16071clone() {
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
        String str2 = this.button;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.button == null) {
            this.button = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
