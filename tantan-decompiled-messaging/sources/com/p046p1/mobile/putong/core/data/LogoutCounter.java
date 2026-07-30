package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Moments;
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
public class LogoutCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutcounter";

    @ProtobufIndex(index = 5)
    public int followers;

    @ProtobufIndex(index = 1)
    public int liked;

    @ProtobufIndex(index = 2)
    public int matches;

    @ProtobufIndex(index = 4)
    public int momentLiked;

    @ProtobufIndex(index = 3)
    public int moments;
    public static ProtobufAdapter<LogoutCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutCounter>() { // from class: com.p1.mobile.putong.core.data.LogoutCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LogoutCounter logoutCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, logoutCounter.liked) + CodedOutputByteBufferNano.m17226h(2, logoutCounter.matches) + CodedOutputByteBufferNano.m17226h(3, logoutCounter.moments) + CodedOutputByteBufferNano.m17226h(4, logoutCounter.momentLiked) + CodedOutputByteBufferNano.m17226h(5, logoutCounter.followers);
            logoutCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LogoutCounter parse(nb5 nb5Var) throws IOException {
            LogoutCounter logoutCounter = new LogoutCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    logoutCounter.liked = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    logoutCounter.matches = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    logoutCounter.moments = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    logoutCounter.momentLiked = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        return logoutCounter;
                    }
                    logoutCounter.followers = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LogoutCounter logoutCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, logoutCounter.liked);
            codedOutputByteBufferNano.m17250G(2, logoutCounter.matches);
            codedOutputByteBufferNano.m17250G(3, logoutCounter.moments);
            codedOutputByteBufferNano.m17250G(4, logoutCounter.momentLiked);
            codedOutputByteBufferNano.m17250G(5, logoutCounter.followers);
        }
    };
    public static JsonAdapter<LogoutCounter> JSON_ADAPTER = new ObjectJsonAdapter<LogoutCounter>() { // from class: com.p1.mobile.putong.core.data.LogoutCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LogoutCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LogoutCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LogoutCounter logoutCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("liked", logoutCounter.liked);
            jsonGenerator.writeNumberField("matches", logoutCounter.matches);
            jsonGenerator.writeNumberField(Moments.TYPE, logoutCounter.moments);
            jsonGenerator.writeNumberField("momentLiked", logoutCounter.momentLiked);
            jsonGenerator.writeNumberField("followers", logoutCounter.followers);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutCounter new_() {
        LogoutCounter logoutCounter = new LogoutCounter();
        logoutCounter.nullCheck();
        return logoutCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LogoutCounter mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((i * 41) + this.liked) * 41) + this.matches) * 41) + this.moments) * 41) + this.momentLiked) * 41) + this.followers;
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
