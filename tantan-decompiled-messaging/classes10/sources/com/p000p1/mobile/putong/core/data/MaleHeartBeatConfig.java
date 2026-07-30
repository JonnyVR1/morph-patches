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
public class MaleHeartBeatConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "maleheartbeatconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean heart_signal_vip_alert;
    public static ProtobufAdapter<MaleHeartBeatConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MaleHeartBeatConfig>() { // from class: com.p1.mobile.putong.core.data.MaleHeartBeatConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MaleHeartBeatConfig maleHeartBeatConfig) {
            int iB = CodedOutputByteBufferNano.b(1, maleHeartBeatConfig.exp) + CodedOutputByteBufferNano.b(2, maleHeartBeatConfig.heart_signal_vip_alert);
            ((MessageNano) maleHeartBeatConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MaleHeartBeatConfig m14041parse(nb5 nb5Var) throws IOException {
            MaleHeartBeatConfig maleHeartBeatConfig = new MaleHeartBeatConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    maleHeartBeatConfig.exp = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return maleHeartBeatConfig;
                    }
                    maleHeartBeatConfig.heart_signal_vip_alert = nb5Var.g();
                }
            }
        }

        public void serialize(MaleHeartBeatConfig maleHeartBeatConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, maleHeartBeatConfig.exp);
            codedOutputByteBufferNano.A(2, maleHeartBeatConfig.heart_signal_vip_alert);
        }
    };
    public static JsonAdapter<MaleHeartBeatConfig> JSON_ADAPTER = new ObjectJsonAdapter<MaleHeartBeatConfig>() { // from class: com.p1.mobile.putong.core.data.MaleHeartBeatConfig.2
        public Class getDataClass() {
            return MaleHeartBeatConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MaleHeartBeatConfig m14042newInstance() {
            return new MaleHeartBeatConfig();
        }

        public boolean parseField(MaleHeartBeatConfig maleHeartBeatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("heart_signal_vip_alert")) {
                maleHeartBeatConfig.heart_signal_vip_alert = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("exp")) {
                return false;
            }
            maleHeartBeatConfig.exp = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MaleHeartBeatConfig maleHeartBeatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("heart_signal_vip_alert") || str.equals("exp")) {
                return true;
            }
            return super.parseFieldCheck(maleHeartBeatConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MaleHeartBeatConfig maleHeartBeatConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exp", maleHeartBeatConfig.exp);
            jsonGenerator.writeBooleanField("heart_signal_vip_alert", maleHeartBeatConfig.heart_signal_vip_alert);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleHeartBeatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MaleHeartBeatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MaleHeartBeatConfig new_() {
        MaleHeartBeatConfig maleHeartBeatConfig = new MaleHeartBeatConfig();
        maleHeartBeatConfig.nullCheck();
        return maleHeartBeatConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MaleHeartBeatConfig m14040clone() {
        MaleHeartBeatConfig maleHeartBeatConfig = new MaleHeartBeatConfig();
        maleHeartBeatConfig.exp = this.exp;
        maleHeartBeatConfig.heart_signal_vip_alert = this.heart_signal_vip_alert;
        return maleHeartBeatConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaleHeartBeatConfig)) {
            return false;
        }
        MaleHeartBeatConfig maleHeartBeatConfig = (MaleHeartBeatConfig) obj;
        return this.exp == maleHeartBeatConfig.exp && this.heart_signal_vip_alert == maleHeartBeatConfig.heart_signal_vip_alert;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.exp ? 1231 : 1237)) * 41) + (this.heart_signal_vip_alert ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
