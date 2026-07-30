package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Channel;
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
public class GreetingInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetinginfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public Channel channel;

    @ProtobufIndex(index = 1)
    public boolean fromGreeting;
    public static ProtobufAdapter<GreetingInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingInfo greetingInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, greetingInfo.fromGreeting);
            Channel channel = greetingInfo.channel;
            if (channel != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, channel, Channel.PROTOBUF_ADAPTER);
            }
            greetingInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingInfo parse(nb5 nb5Var) throws IOException {
            GreetingInfo greetingInfo = new GreetingInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (greetingInfo.channel != null) {
                        break;
                    }
                    greetingInfo.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    greetingInfo.fromGreeting = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (greetingInfo.channel != null) {
                            break;
                        }
                        greetingInfo.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
                        return greetingInfo;
                    }
                    greetingInfo.channel = (Channel) nb5Var.m158743l(Channel.PROTOBUF_ADAPTER);
                }
            }
            return greetingInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingInfo greetingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, greetingInfo.fromGreeting);
            Channel channel = greetingInfo.channel;
            if (channel != null) {
                codedOutputByteBufferNano.m17254K(2, channel, Channel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GreetingInfo> JSON_ADAPTER = new ObjectJsonAdapter<GreetingInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingInfo newInstance() {
            return new GreetingInfo();
        }

        public boolean parseField(GreetingInfo greetingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("channel")) {
                greetingInfo.channel = Channel.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("fromGreeting")) {
                return false;
            }
            greetingInfo.fromGreeting = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GreetingInfo greetingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("channel") || str.equals("fromGreeting")) {
                return true;
            }
            return super.parseFieldCheck(greetingInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingInfo greetingInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fromGreeting", greetingInfo.fromGreeting);
            if (greetingInfo.channel != null) {
                jsonGenerator.writeFieldName("channel");
                Channel.JSON_ADAPTER.serialize(greetingInfo.channel, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingInfo new_() {
        GreetingInfo greetingInfo = new GreetingInfo();
        greetingInfo.nullCheck();
        return greetingInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingInfo mo223809clone() {
        GreetingInfo greetingInfo = new GreetingInfo();
        greetingInfo.fromGreeting = this.fromGreeting;
        greetingInfo.channel = this.channel;
        return greetingInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingInfo)) {
            return false;
        }
        GreetingInfo greetingInfo = (GreetingInfo) obj;
        return this.fromGreeting == greetingInfo.fromGreeting && ValueObject.util_equals(this.channel, greetingInfo.channel);
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
        int i2 = ((i * 41) + (this.fromGreeting ? 1231 : 1237)) * 41;
        Channel channel = this.channel;
        int iHashCode = i2 + (channel != null ? channel.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.channel == null) {
            this.channel = (Channel) Channel.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
