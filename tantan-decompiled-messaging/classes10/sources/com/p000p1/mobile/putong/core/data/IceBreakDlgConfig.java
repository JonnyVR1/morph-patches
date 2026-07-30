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
public class IceBreakDlgConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakdlgconfig";

    @ProtobufIndex(index = 1)
    public int maxNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int timeInterval;
    public static ProtobufAdapter<IceBreakDlgConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakDlgConfig>() { // from class: com.p1.mobile.putong.core.data.IceBreakDlgConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakDlgConfig iceBreakDlgConfig) {
            int iH = CodedOutputByteBufferNano.h(1, iceBreakDlgConfig.maxNum) + CodedOutputByteBufferNano.h(2, iceBreakDlgConfig.timeInterval);
            ((MessageNano) iceBreakDlgConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakDlgConfig m13369parse(nb5 nb5Var) throws IOException {
            IceBreakDlgConfig iceBreakDlgConfig = new IceBreakDlgConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    iceBreakDlgConfig.maxNum = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return iceBreakDlgConfig;
                    }
                    iceBreakDlgConfig.timeInterval = nb5Var.j();
                }
            }
        }

        public void serialize(IceBreakDlgConfig iceBreakDlgConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, iceBreakDlgConfig.maxNum);
            codedOutputByteBufferNano.G(2, iceBreakDlgConfig.timeInterval);
        }
    };
    public static JsonAdapter<IceBreakDlgConfig> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakDlgConfig>() { // from class: com.p1.mobile.putong.core.data.IceBreakDlgConfig.2
        public Class getDataClass() {
            return IceBreakDlgConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakDlgConfig m13370newInstance() {
            return new IceBreakDlgConfig();
        }

        public boolean parseField(IceBreakDlgConfig iceBreakDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("maxNum")) {
                iceBreakDlgConfig.maxNum = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("timeInterval")) {
                return false;
            }
            iceBreakDlgConfig.timeInterval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(IceBreakDlgConfig iceBreakDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("maxNum") || str.equals("timeInterval")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakDlgConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IceBreakDlgConfig iceBreakDlgConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maxNum", iceBreakDlgConfig.maxNum);
            jsonGenerator.writeNumberField("timeInterval", iceBreakDlgConfig.timeInterval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakDlgConfig new_() {
        IceBreakDlgConfig iceBreakDlgConfig = new IceBreakDlgConfig();
        iceBreakDlgConfig.nullCheck();
        return iceBreakDlgConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakDlgConfig m13368clone() {
        IceBreakDlgConfig iceBreakDlgConfig = new IceBreakDlgConfig();
        iceBreakDlgConfig.maxNum = this.maxNum;
        iceBreakDlgConfig.timeInterval = this.timeInterval;
        return iceBreakDlgConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakDlgConfig)) {
            return false;
        }
        IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) obj;
        return this.maxNum == iceBreakDlgConfig.maxNum && this.timeInterval == iceBreakDlgConfig.timeInterval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.maxNum) * 41) + this.timeInterval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
