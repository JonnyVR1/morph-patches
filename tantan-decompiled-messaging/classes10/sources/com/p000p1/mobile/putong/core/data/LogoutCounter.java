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
public class LogoutCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutcounter";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int followers;

    @ProtobufIndex(index = 1)
    public int liked;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int matches;

    @ProtobufIndex(index = 4)
    public int momentLiked;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int moments;
    public static ProtobufAdapter<LogoutCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutCounter>() { // from class: com.p1.mobile.putong.core.data.LogoutCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LogoutCounter logoutCounter) {
            int iH = CodedOutputByteBufferNano.h(1, logoutCounter.liked) + CodedOutputByteBufferNano.h(2, logoutCounter.matches) + CodedOutputByteBufferNano.h(3, logoutCounter.moments) + CodedOutputByteBufferNano.h(4, logoutCounter.momentLiked) + CodedOutputByteBufferNano.h(5, logoutCounter.followers);
            ((MessageNano) logoutCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LogoutCounter m13961parse(nb5 nb5Var) throws IOException {
            LogoutCounter logoutCounter = new LogoutCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    logoutCounter.liked = nb5Var.j();
                } else if (iU == 16) {
                    logoutCounter.matches = nb5Var.j();
                } else if (iU == 24) {
                    logoutCounter.moments = nb5Var.j();
                } else if (iU == 32) {
                    logoutCounter.momentLiked = nb5Var.j();
                } else {
                    if (iU != 40) {
                        return logoutCounter;
                    }
                    logoutCounter.followers = nb5Var.j();
                }
            }
        }

        public void serialize(LogoutCounter logoutCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, logoutCounter.liked);
            codedOutputByteBufferNano.G(2, logoutCounter.matches);
            codedOutputByteBufferNano.G(3, logoutCounter.moments);
            codedOutputByteBufferNano.G(4, logoutCounter.momentLiked);
            codedOutputByteBufferNano.G(5, logoutCounter.followers);
        }
    };
    public static JsonAdapter<LogoutCounter> JSON_ADAPTER = new ObjectJsonAdapter<LogoutCounter>() { // from class: com.p1.mobile.putong.core.data.LogoutCounter.2
        public Class getDataClass() {
            return LogoutCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LogoutCounter m13962newInstance() {
            return new LogoutCounter();
        }

        public boolean parseField(LogoutCounter logoutCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentLiked":
                    logoutCounter.momentLiked = jsonParser.getValueAsInt();
                    return true;
                case "liked":
                    logoutCounter.liked = jsonParser.getValueAsInt();
                    return true;
                case "followers":
                    logoutCounter.followers = jsonParser.getValueAsInt();
                    return true;
                case "matches":
                    logoutCounter.matches = jsonParser.getValueAsInt();
                    return true;
                case "moments":
                    logoutCounter.moments = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LogoutCounter logoutCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentLiked":
                case "liked":
                case "followers":
                case "matches":
                case "moments":
                    return true;
                default:
                    return super.parseFieldCheck(logoutCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LogoutCounter logoutCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("liked", logoutCounter.liked);
            jsonGenerator.writeNumberField("matches", logoutCounter.matches);
            jsonGenerator.writeNumberField("moments", logoutCounter.moments);
            jsonGenerator.writeNumberField("momentLiked", logoutCounter.momentLiked);
            jsonGenerator.writeNumberField("followers", logoutCounter.followers);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutCounter new_() {
        LogoutCounter logoutCounter = new LogoutCounter();
        logoutCounter.nullCheck();
        return logoutCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LogoutCounter m13960clone() {
        LogoutCounter logoutCounter = new LogoutCounter();
        logoutCounter.liked = this.liked;
        logoutCounter.matches = this.matches;
        logoutCounter.moments = this.moments;
        logoutCounter.momentLiked = this.momentLiked;
        logoutCounter.followers = this.followers;
        return logoutCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogoutCounter)) {
            return false;
        }
        LogoutCounter logoutCounter = (LogoutCounter) obj;
        return this.liked == logoutCounter.liked && this.matches == logoutCounter.matches && this.moments == logoutCounter.moments && this.momentLiked == logoutCounter.momentLiked && this.followers == logoutCounter.followers;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((i * 41) + this.liked) * 41) + this.matches) * 41) + this.moments) * 41) + this.momentLiked) * 41) + this.followers;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
