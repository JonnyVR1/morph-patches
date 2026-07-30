package com.p000p1.mobile.putong.core.data;

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
public class QuickChatLoftConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatloftconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int online_count_max;

    @ProtobufIndex(index = 1)
    public int online_poll_interval;
    public static ProtobufAdapter<QuickChatLoftConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatLoftConfig>() { // from class: com.p1.mobile.putong.core.data.QuickChatLoftConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatLoftConfig quickChatLoftConfig) {
            int iH = CodedOutputByteBufferNano.h(1, quickChatLoftConfig.online_poll_interval) + CodedOutputByteBufferNano.h(2, quickChatLoftConfig.online_count_max);
            ((MessageNano) quickChatLoftConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatLoftConfig m15171parse(nb5 nb5Var) throws IOException {
            QuickChatLoftConfig quickChatLoftConfig = new QuickChatLoftConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    quickChatLoftConfig.online_poll_interval = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return quickChatLoftConfig;
                    }
                    quickChatLoftConfig.online_count_max = nb5Var.j();
                }
            }
        }

        public void serialize(QuickChatLoftConfig quickChatLoftConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, quickChatLoftConfig.online_poll_interval);
            codedOutputByteBufferNano.G(2, quickChatLoftConfig.online_count_max);
        }
    };
    public static JsonAdapter<QuickChatLoftConfig> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatLoftConfig>() { // from class: com.p1.mobile.putong.core.data.QuickChatLoftConfig.2
        public Class getDataClass() {
            return QuickChatLoftConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatLoftConfig m15172newInstance() {
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

        public void serializeFields(QuickChatLoftConfig quickChatLoftConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("online_poll_interval", quickChatLoftConfig.online_poll_interval);
            jsonGenerator.writeNumberField("online_count_max", quickChatLoftConfig.online_count_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatLoftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatLoftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatLoftConfig new_() {
        QuickChatLoftConfig quickChatLoftConfig = new QuickChatLoftConfig();
        quickChatLoftConfig.nullCheck();
        return quickChatLoftConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatLoftConfig m15170clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.online_poll_interval) * 41) + this.online_count_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
