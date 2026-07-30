package com.p051p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class MomentMessageSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmessagesetting";

    @ProtobufIndex(index = 1)
    public boolean anonymous;
    public static ProtobufAdapter<MomentMessageSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMessageSetting>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentMessageSetting momentMessageSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, momentMessageSetting.anonymous);
            momentMessageSetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentMessageSetting parse(nc5 nc5Var) throws IOException {
            MomentMessageSetting momentMessageSetting = new MomentMessageSetting();
            while (nc5Var.m162497u() == 8) {
                momentMessageSetting.anonymous = nc5Var.m162483g();
            }
            return momentMessageSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentMessageSetting momentMessageSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, momentMessageSetting.anonymous);
        }
    };
    public static JsonAdapter<MomentMessageSetting> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessageSetting>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentMessageSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentMessageSetting newInstance() {
            return new MomentMessageSetting();
        }

        public boolean parseField(MomentMessageSetting momentMessageSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("anonymous")) {
                return false;
            }
            momentMessageSetting.anonymous = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MomentMessageSetting momentMessageSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("anonymous")) {
                return true;
            }
            return super.parseFieldCheck(momentMessageSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessageSetting momentMessageSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("anonymous", momentMessageSetting.anonymous);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMessageSetting new_() {
        MomentMessageSetting momentMessageSetting = new MomentMessageSetting();
        momentMessageSetting.nullCheck();
        return momentMessageSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentMessageSetting mo225055clone() {
        MomentMessageSetting momentMessageSetting = new MomentMessageSetting();
        momentMessageSetting.anonymous = this.anonymous;
        return momentMessageSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MomentMessageSetting) && this.anonymous == ((MomentMessageSetting) obj).anonymous;
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
        int i2 = (i * 41) + (this.anonymous ? 1231 : 1237);
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
