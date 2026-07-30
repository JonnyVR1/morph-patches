package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Channel;
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
public class GreetingInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetinginfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Channel channel;

    @ProtobufIndex(index = 1)
    public boolean fromGreeting;
    public static ProtobufAdapter<GreetingInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingInfo greetingInfo) {
            int iB = CodedOutputByteBufferNano.b(1, greetingInfo.fromGreeting);
            Channel channel = greetingInfo.channel;
            if (channel != null) {
                iB += CodedOutputByteBufferNano.l(2, channel, Channel.PROTOBUF_ADAPTER);
            }
            ((MessageNano) greetingInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingInfo m13029parse(nb5 nb5Var) throws IOException {
            GreetingInfo greetingInfo = new GreetingInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingInfo.channel != null) {
                        break;
                    }
                    greetingInfo.channel = Channel.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    greetingInfo.fromGreeting = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (greetingInfo.channel != null) {
                            break;
                        }
                        greetingInfo.channel = Channel.JSON_ADAPTER.defaultEnum();
                        return greetingInfo;
                    }
                    greetingInfo.channel = (Channel) nb5Var.l(Channel.PROTOBUF_ADAPTER);
                }
            }
            return greetingInfo;
        }

        public void serialize(GreetingInfo greetingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, greetingInfo.fromGreeting);
            Channel channel = greetingInfo.channel;
            if (channel != null) {
                codedOutputByteBufferNano.K(2, channel, Channel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GreetingInfo> JSON_ADAPTER = new ObjectJsonAdapter<GreetingInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingInfo.2
        public Class getDataClass() {
            return GreetingInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingInfo m13030newInstance() {
            return new GreetingInfo();
        }

        public boolean parseField(GreetingInfo greetingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("channel")) {
                greetingInfo.channel = (Channel) Channel.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(GreetingInfo greetingInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fromGreeting", greetingInfo.fromGreeting);
            if (greetingInfo.channel != null) {
                jsonGenerator.writeFieldName("channel");
                Channel.JSON_ADAPTER.serialize(greetingInfo.channel, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingInfo new_() {
        GreetingInfo greetingInfo = new GreetingInfo();
        greetingInfo.nullCheck();
        return greetingInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingInfo m13028clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.fromGreeting ? 1231 : 1237)) * 41;
        Channel channel = this.channel;
        int iHashCode = i2 + (channel != null ? channel.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.channel == null) {
            this.channel = Channel.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
