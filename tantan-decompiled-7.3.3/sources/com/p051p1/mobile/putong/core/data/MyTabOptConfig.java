package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MyTabOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytaboptconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 3)
    public int mirror_guide_and_pop_show_days_count;

    @ProtobufIndex(index = 2)
    public int mirror_guide_user_signup_days_count;
    public static ProtobufAdapter<MyTabOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabOptConfig>() { // from class: com.p1.mobile.putong.core.data.MyTabOptConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyTabOptConfig myTabOptConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, myTabOptConfig.enable) + CodedOutputByteBufferNano.m17281h(2, myTabOptConfig.mirror_guide_user_signup_days_count) + CodedOutputByteBufferNano.m17281h(3, myTabOptConfig.mirror_guide_and_pop_show_days_count);
            myTabOptConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyTabOptConfig parse(nc5 nc5Var) throws IOException {
            MyTabOptConfig myTabOptConfig = new MyTabOptConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    myTabOptConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    myTabOptConfig.mirror_guide_user_signup_days_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return myTabOptConfig;
                    }
                    myTabOptConfig.mirror_guide_and_pop_show_days_count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyTabOptConfig myTabOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, myTabOptConfig.enable);
            codedOutputByteBufferNano.m17305G(2, myTabOptConfig.mirror_guide_user_signup_days_count);
            codedOutputByteBufferNano.m17305G(3, myTabOptConfig.mirror_guide_and_pop_show_days_count);
        }
    };
    public static JsonAdapter<MyTabOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<MyTabOptConfig>() { // from class: com.p1.mobile.putong.core.data.MyTabOptConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyTabOptConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyTabOptConfig newInstance() {
            return new MyTabOptConfig();
        }

        public boolean parseField(MyTabOptConfig myTabOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mirror_guide_and_pop_show_days_count":
                    myTabOptConfig.mirror_guide_and_pop_show_days_count = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    myTabOptConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "mirror_guide_user_signup_days_count":
                    myTabOptConfig.mirror_guide_user_signup_days_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyTabOptConfig myTabOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "mirror_guide_and_pop_show_days_count":
                case "enable":
                case "mirror_guide_user_signup_days_count":
                    return true;
                default:
                    return super.parseFieldCheck(myTabOptConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyTabOptConfig myTabOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", myTabOptConfig.enable);
            jsonGenerator.writeNumberField("mirror_guide_user_signup_days_count", myTabOptConfig.mirror_guide_user_signup_days_count);
            jsonGenerator.writeNumberField("mirror_guide_and_pop_show_days_count", myTabOptConfig.mirror_guide_and_pop_show_days_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabOptConfig new_() {
        MyTabOptConfig myTabOptConfig = new MyTabOptConfig();
        myTabOptConfig.nullCheck();
        return myTabOptConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyTabOptConfig mo225055clone() {
        MyTabOptConfig myTabOptConfig = new MyTabOptConfig();
        myTabOptConfig.enable = this.enable;
        myTabOptConfig.mirror_guide_user_signup_days_count = this.mirror_guide_user_signup_days_count;
        myTabOptConfig.mirror_guide_and_pop_show_days_count = this.mirror_guide_and_pop_show_days_count;
        return myTabOptConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTabOptConfig)) {
            return false;
        }
        MyTabOptConfig myTabOptConfig = (MyTabOptConfig) obj;
        return this.enable == myTabOptConfig.enable && this.mirror_guide_user_signup_days_count == myTabOptConfig.mirror_guide_user_signup_days_count && this.mirror_guide_and_pop_show_days_count == myTabOptConfig.mirror_guide_and_pop_show_days_count;
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
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mirror_guide_user_signup_days_count) * 41) + this.mirror_guide_and_pop_show_days_count;
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
