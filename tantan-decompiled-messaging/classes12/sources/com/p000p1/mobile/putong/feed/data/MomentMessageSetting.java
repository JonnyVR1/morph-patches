package com.p000p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentMessageSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmessagesetting";

    @ProtobufIndex(index = 1)
    public boolean anonymous;
    public static ProtobufAdapter<MomentMessageSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMessageSetting>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentMessageSetting momentMessageSetting) {
            int iB = CodedOutputByteBufferNano.b(1, momentMessageSetting.anonymous);
            ((MessageNano) momentMessageSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentMessageSetting m19639parse(nb5 nb5Var) throws IOException {
            MomentMessageSetting momentMessageSetting = new MomentMessageSetting();
            while (nb5Var.u() == 8) {
                momentMessageSetting.anonymous = nb5Var.g();
            }
            return momentMessageSetting;
        }

        public void serialize(MomentMessageSetting momentMessageSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, momentMessageSetting.anonymous);
        }
    };
    public static JsonAdapter<MomentMessageSetting> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessageSetting>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageSetting.2
        public Class getDataClass() {
            return MomentMessageSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentMessageSetting mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessageSetting momentMessageSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("anonymous", momentMessageSetting.anonymous);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMessageSetting new_() {
        MomentMessageSetting momentMessageSetting = new MomentMessageSetting();
        momentMessageSetting.nullCheck();
        return momentMessageSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentMessageSetting m19638clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.anonymous ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
