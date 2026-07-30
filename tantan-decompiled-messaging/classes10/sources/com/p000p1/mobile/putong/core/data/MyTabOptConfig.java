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
public class MyTabOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytaboptconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int mirror_guide_and_pop_show_days_count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mirror_guide_user_signup_days_count;
    public static ProtobufAdapter<MyTabOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabOptConfig>() { // from class: com.p1.mobile.putong.core.data.MyTabOptConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyTabOptConfig myTabOptConfig) {
            int iB = CodedOutputByteBufferNano.b(1, myTabOptConfig.enable) + CodedOutputByteBufferNano.h(2, myTabOptConfig.mirror_guide_user_signup_days_count) + CodedOutputByteBufferNano.h(3, myTabOptConfig.mirror_guide_and_pop_show_days_count);
            ((MessageNano) myTabOptConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyTabOptConfig m14457parse(nb5 nb5Var) throws IOException {
            MyTabOptConfig myTabOptConfig = new MyTabOptConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    myTabOptConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    myTabOptConfig.mirror_guide_user_signup_days_count = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return myTabOptConfig;
                    }
                    myTabOptConfig.mirror_guide_and_pop_show_days_count = nb5Var.j();
                }
            }
        }

        public void serialize(MyTabOptConfig myTabOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, myTabOptConfig.enable);
            codedOutputByteBufferNano.G(2, myTabOptConfig.mirror_guide_user_signup_days_count);
            codedOutputByteBufferNano.G(3, myTabOptConfig.mirror_guide_and_pop_show_days_count);
        }
    };
    public static JsonAdapter<MyTabOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<MyTabOptConfig>() { // from class: com.p1.mobile.putong.core.data.MyTabOptConfig.2
        public Class getDataClass() {
            return MyTabOptConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyTabOptConfig m14458newInstance() {
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

        public void serializeFields(MyTabOptConfig myTabOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", myTabOptConfig.enable);
            jsonGenerator.writeNumberField("mirror_guide_user_signup_days_count", myTabOptConfig.mirror_guide_user_signup_days_count);
            jsonGenerator.writeNumberField("mirror_guide_and_pop_show_days_count", myTabOptConfig.mirror_guide_and_pop_show_days_count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabOptConfig new_() {
        MyTabOptConfig myTabOptConfig = new MyTabOptConfig();
        myTabOptConfig.nullCheck();
        return myTabOptConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyTabOptConfig m14456clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mirror_guide_user_signup_days_count) * 41) + this.mirror_guide_and_pop_show_days_count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
