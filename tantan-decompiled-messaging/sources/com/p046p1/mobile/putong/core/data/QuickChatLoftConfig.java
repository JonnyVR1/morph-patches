package com.p046p1.mobile.putong.core.data;

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
public class QuickChatLoftConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatloftconfig";

    @ProtobufIndex(index = 2)
    public int online_count_max;

    @ProtobufIndex(index = 1)
    public int online_poll_interval;
    public static ProtobufAdapter<QuickChatLoftConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatLoftConfig>() { // from class: com.p1.mobile.putong.core.data.QuickChatLoftConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickChatLoftConfig quickChatLoftConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, quickChatLoftConfig.online_poll_interval) + CodedOutputByteBufferNano.m17226h(2, quickChatLoftConfig.online_count_max);
            quickChatLoftConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickChatLoftConfig parse(nb5 nb5Var) throws IOException {
            QuickChatLoftConfig quickChatLoftConfig = new QuickChatLoftConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    quickChatLoftConfig.online_poll_interval = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return quickChatLoftConfig;
                    }
                    quickChatLoftConfig.online_count_max = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickChatLoftConfig quickChatLoftConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, quickChatLoftConfig.online_poll_interval);
            codedOutputByteBufferNano.m17250G(2, quickChatLoftConfig.online_count_max);
        }
    };
    public static JsonAdapter<QuickChatLoftConfig> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatLoftConfig>() { // from class: com.p1.mobile.putong.core.data.QuickChatLoftConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickChatLoftConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickChatLoftConfig newInstance() {
            return new QuickChatLoftConfig();
        }

        public boolean parseField(QuickChatLoftConfig quickChatLoftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("online_count_max")) {
                quickChatLoftConfig.online_count_max = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("online_poll_interval")) {
                return false;
            }
            quickChatLoftConfig.online_poll_interval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(QuickChatLoftConfig quickChatLoftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("online_count_max") || str.equals("online_poll_interval")) {
                return true;
            }
            return super.parseFieldCheck(quickChatLoftConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickChatLoftConfig quickChatLoftConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("online_poll_interval", quickChatLoftConfig.online_poll_interval);
            jsonGenerator.writeNumberField("online_count_max", quickChatLoftConfig.online_count_max);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatLoftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatLoftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatLoftConfig new_() {
        QuickChatLoftConfig quickChatLoftConfig = new QuickChatLoftConfig();
        quickChatLoftConfig.nullCheck();
        return quickChatLoftConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickChatLoftConfig mo223809clone() {
        QuickChatLoftConfig quickChatLoftConfig = new QuickChatLoftConfig();
        quickChatLoftConfig.online_poll_interval = this.online_poll_interval;
        quickChatLoftConfig.online_count_max = this.online_count_max;
        return quickChatLoftConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatLoftConfig)) {
            return false;
        }
        QuickChatLoftConfig quickChatLoftConfig = (QuickChatLoftConfig) obj;
        return this.online_poll_interval == quickChatLoftConfig.online_poll_interval && this.online_count_max == quickChatLoftConfig.online_count_max;
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
        int i2 = (((i * 41) + this.online_poll_interval) * 41) + this.online_count_max;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
