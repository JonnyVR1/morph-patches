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
public class MyTabOptV2Config extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytaboptv2config";

    @ProtobufIndex(index = 3)
    public int cert_center_entry_red_dot_limit;

    @ProtobufIndex(index = 2)
    public int createTimeLimit;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<MyTabOptV2Config> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabOptV2Config>() { // from class: com.p1.mobile.putong.core.data.MyTabOptV2Config.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyTabOptV2Config myTabOptV2Config) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, myTabOptV2Config.enable) + CodedOutputByteBufferNano.m17226h(2, myTabOptV2Config.createTimeLimit) + CodedOutputByteBufferNano.m17226h(3, myTabOptV2Config.cert_center_entry_red_dot_limit);
            myTabOptV2Config.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyTabOptV2Config parse(nb5 nb5Var) throws IOException {
            MyTabOptV2Config myTabOptV2Config = new MyTabOptV2Config();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    myTabOptV2Config.enable = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    myTabOptV2Config.createTimeLimit = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return myTabOptV2Config;
                    }
                    myTabOptV2Config.cert_center_entry_red_dot_limit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyTabOptV2Config myTabOptV2Config, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, myTabOptV2Config.enable);
            codedOutputByteBufferNano.m17250G(2, myTabOptV2Config.createTimeLimit);
            codedOutputByteBufferNano.m17250G(3, myTabOptV2Config.cert_center_entry_red_dot_limit);
        }
    };
    public static JsonAdapter<MyTabOptV2Config> JSON_ADAPTER = new ObjectJsonAdapter<MyTabOptV2Config>() { // from class: com.p1.mobile.putong.core.data.MyTabOptV2Config.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyTabOptV2Config.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyTabOptV2Config newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyTabOptV2Config myTabOptV2Config, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", myTabOptV2Config.enable);
            jsonGenerator.writeNumberField("createTimeLimit", myTabOptV2Config.createTimeLimit);
            jsonGenerator.writeNumberField("cert_center_entry_red_dot_limit", myTabOptV2Config.cert_center_entry_red_dot_limit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabOptV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabOptV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabOptV2Config new_() {
        MyTabOptV2Config myTabOptV2Config = new MyTabOptV2Config();
        myTabOptV2Config.nullCheck();
        return myTabOptV2Config;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyTabOptV2Config mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.createTimeLimit) * 41) + this.cert_center_entry_red_dot_limit;
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
