package com.p046p1.mobile.putong.core.data;

import com.facebook.AuthenticationTokenClaims;
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
public class MaleHeartBeatConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "maleheartbeatconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = 2)
    public boolean heart_signal_vip_alert;
    public static ProtobufAdapter<MaleHeartBeatConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MaleHeartBeatConfig>() { // from class: com.p1.mobile.putong.core.data.MaleHeartBeatConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MaleHeartBeatConfig maleHeartBeatConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, maleHeartBeatConfig.exp) + CodedOutputByteBufferNano.m17220b(2, maleHeartBeatConfig.heart_signal_vip_alert);
            maleHeartBeatConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MaleHeartBeatConfig parse(nb5 nb5Var) throws IOException {
            MaleHeartBeatConfig maleHeartBeatConfig = new MaleHeartBeatConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    maleHeartBeatConfig.exp = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return maleHeartBeatConfig;
                    }
                    maleHeartBeatConfig.heart_signal_vip_alert = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MaleHeartBeatConfig maleHeartBeatConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, maleHeartBeatConfig.exp);
            codedOutputByteBufferNano.m17244A(2, maleHeartBeatConfig.heart_signal_vip_alert);
        }
    };
    public static JsonAdapter<MaleHeartBeatConfig> JSON_ADAPTER = new ObjectJsonAdapter<MaleHeartBeatConfig>() { // from class: com.p1.mobile.putong.core.data.MaleHeartBeatConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MaleHeartBeatConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MaleHeartBeatConfig newInstance() {
            return new MaleHeartBeatConfig();
        }

        public boolean parseField(MaleHeartBeatConfig maleHeartBeatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("heart_signal_vip_alert")) {
                maleHeartBeatConfig.heart_signal_vip_alert = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                return false;
            }
            maleHeartBeatConfig.exp = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MaleHeartBeatConfig maleHeartBeatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("heart_signal_vip_alert") || str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                return true;
            }
            return super.parseFieldCheck(maleHeartBeatConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MaleHeartBeatConfig maleHeartBeatConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(AuthenticationTokenClaims.JSON_KEY_EXP, maleHeartBeatConfig.exp);
            jsonGenerator.writeBooleanField("heart_signal_vip_alert", maleHeartBeatConfig.heart_signal_vip_alert);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleHeartBeatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MaleHeartBeatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MaleHeartBeatConfig new_() {
        MaleHeartBeatConfig maleHeartBeatConfig = new MaleHeartBeatConfig();
        maleHeartBeatConfig.nullCheck();
        return maleHeartBeatConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MaleHeartBeatConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.exp ? 1231 : 1237)) * 41) + (this.heart_signal_vip_alert ? 1231 : 1237);
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
