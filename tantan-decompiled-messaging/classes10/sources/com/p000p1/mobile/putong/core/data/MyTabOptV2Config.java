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
public class MyTabOptV2Config extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytaboptv2config";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int cert_center_entry_red_dot_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int createTimeLimit;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<MyTabOptV2Config> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabOptV2Config>() { // from class: com.p1.mobile.putong.core.data.MyTabOptV2Config.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyTabOptV2Config myTabOptV2Config) {
            int iB = CodedOutputByteBufferNano.b(1, myTabOptV2Config.enable) + CodedOutputByteBufferNano.h(2, myTabOptV2Config.createTimeLimit) + CodedOutputByteBufferNano.h(3, myTabOptV2Config.cert_center_entry_red_dot_limit);
            ((MessageNano) myTabOptV2Config).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyTabOptV2Config m14461parse(nb5 nb5Var) throws IOException {
            MyTabOptV2Config myTabOptV2Config = new MyTabOptV2Config();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    myTabOptV2Config.enable = nb5Var.g();
                } else if (iU == 16) {
                    myTabOptV2Config.createTimeLimit = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return myTabOptV2Config;
                    }
                    myTabOptV2Config.cert_center_entry_red_dot_limit = nb5Var.j();
                }
            }
        }

        public void serialize(MyTabOptV2Config myTabOptV2Config, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, myTabOptV2Config.enable);
            codedOutputByteBufferNano.G(2, myTabOptV2Config.createTimeLimit);
            codedOutputByteBufferNano.G(3, myTabOptV2Config.cert_center_entry_red_dot_limit);
        }
    };
    public static JsonAdapter<MyTabOptV2Config> JSON_ADAPTER = new ObjectJsonAdapter<MyTabOptV2Config>() { // from class: com.p1.mobile.putong.core.data.MyTabOptV2Config.2
        public Class getDataClass() {
            return MyTabOptV2Config.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyTabOptV2Config m14462newInstance() {
            return new MyTabOptV2Config();
        }

        public boolean parseField(MyTabOptV2Config myTabOptV2Config, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "createTimeLimit":
                    myTabOptV2Config.createTimeLimit = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    myTabOptV2Config.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "cert_center_entry_red_dot_limit":
                    myTabOptV2Config.cert_center_entry_red_dot_limit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyTabOptV2Config myTabOptV2Config, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "createTimeLimit":
                case "enable":
                case "cert_center_entry_red_dot_limit":
                    return true;
                default:
                    return super.parseFieldCheck(myTabOptV2Config, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MyTabOptV2Config myTabOptV2Config, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", myTabOptV2Config.enable);
            jsonGenerator.writeNumberField("createTimeLimit", myTabOptV2Config.createTimeLimit);
            jsonGenerator.writeNumberField("cert_center_entry_red_dot_limit", myTabOptV2Config.cert_center_entry_red_dot_limit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabOptV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabOptV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabOptV2Config new_() {
        MyTabOptV2Config myTabOptV2Config = new MyTabOptV2Config();
        myTabOptV2Config.nullCheck();
        return myTabOptV2Config;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyTabOptV2Config m14460clone() {
        MyTabOptV2Config myTabOptV2Config = new MyTabOptV2Config();
        myTabOptV2Config.enable = this.enable;
        myTabOptV2Config.createTimeLimit = this.createTimeLimit;
        myTabOptV2Config.cert_center_entry_red_dot_limit = this.cert_center_entry_red_dot_limit;
        return myTabOptV2Config;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTabOptV2Config)) {
            return false;
        }
        MyTabOptV2Config myTabOptV2Config = (MyTabOptV2Config) obj;
        return this.enable == myTabOptV2Config.enable && this.createTimeLimit == myTabOptV2Config.createTimeLimit && this.cert_center_entry_red_dot_limit == myTabOptV2Config.cert_center_entry_red_dot_limit;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.createTimeLimit) * 41) + this.cert_center_entry_red_dot_limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
