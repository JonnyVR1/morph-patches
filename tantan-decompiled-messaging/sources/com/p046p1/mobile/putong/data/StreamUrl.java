package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class StreamUrl extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "streamurl";

    @NonNull
    @ProtobufIndex(index = 3)
    public String pullFlv;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pullHls;

    @NonNull
    @ProtobufIndex(index = 2)
    public String pullRtmp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String push;
    public static ProtobufAdapter<StreamUrl> PROTOBUF_ADAPTER = new MessageNanoAdapter<StreamUrl>() { // from class: com.p1.mobile.putong.data.StreamUrl.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StreamUrl streamUrl) {
            String str = streamUrl.push;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = streamUrl.pullRtmp;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = streamUrl.pullFlv;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = streamUrl.pullHls;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            streamUrl.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StreamUrl parse(nb5 nb5Var) throws IOException {
            StreamUrl streamUrl = new StreamUrl();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (streamUrl.push == null) {
                        streamUrl.push = "";
                    }
                    if (streamUrl.pullRtmp == null) {
                        streamUrl.pullRtmp = "";
                    }
                    if (streamUrl.pullFlv == null) {
                        streamUrl.pullFlv = "";
                    }
                    if (streamUrl.pullHls != null) {
                        break;
                    }
                    streamUrl.pullHls = "";
                    break;
                }
                if (iM158752u == 10) {
                    streamUrl.push = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    streamUrl.pullRtmp = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    streamUrl.pullFlv = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (streamUrl.push == null) {
                            streamUrl.push = "";
                        }
                        if (streamUrl.pullRtmp == null) {
                            streamUrl.pullRtmp = "";
                        }
                        if (streamUrl.pullFlv == null) {
                            streamUrl.pullFlv = "";
                        }
                        if (streamUrl.pullHls != null) {
                            break;
                        }
                        streamUrl.pullHls = "";
                        return streamUrl;
                    }
                    streamUrl.pullHls = nb5Var.m158750s();
                }
            }
            return streamUrl;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StreamUrl streamUrl, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = streamUrl.push;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = streamUrl.pullRtmp;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = streamUrl.pullFlv;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = streamUrl.pullHls;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<StreamUrl> JSON_ADAPTER = new ObjectJsonAdapter<StreamUrl>() { // from class: com.p1.mobile.putong.data.StreamUrl.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StreamUrl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StreamUrl newInstance() {
            return new StreamUrl();
        }

        public boolean parseField(StreamUrl streamUrl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pullFlv":
                    streamUrl.pullFlv = jsonParser.getValueAsString();
                    return true;
                case "pullHls":
                    streamUrl.pullHls = jsonParser.getValueAsString();
                    return true;
                case "push":
                    streamUrl.push = jsonParser.getValueAsString();
                    return true;
                case "pullRtmp":
                    streamUrl.pullRtmp = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StreamUrl streamUrl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pullFlv":
                case "pullHls":
                case "push":
                case "pullRtmp":
                    return true;
                default:
                    return super.parseFieldCheck(streamUrl, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StreamUrl streamUrl, JsonGenerator jsonGenerator) throws IOException {
            String str = streamUrl.push;
            if (str != null) {
                jsonGenerator.writeStringField("push", str);
            }
            String str2 = streamUrl.pullRtmp;
            if (str2 != null) {
                jsonGenerator.writeStringField("pullRtmp", str2);
            }
            String str3 = streamUrl.pullFlv;
            if (str3 != null) {
                jsonGenerator.writeStringField("pullFlv", str3);
            }
            String str4 = streamUrl.pullHls;
            if (str4 != null) {
                jsonGenerator.writeStringField("pullHls", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StreamUrl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StreamUrl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StreamUrl new_() {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.nullCheck();
        return streamUrl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StreamUrl mo223809clone() {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.push = this.push;
        streamUrl.pullRtmp = this.pullRtmp;
        streamUrl.pullFlv = this.pullFlv;
        streamUrl.pullHls = this.pullHls;
        return streamUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamUrl)) {
            return false;
        }
        StreamUrl streamUrl = (StreamUrl) obj;
        return ValueObject.util_equals(this.push, streamUrl.push) && ValueObject.util_equals(this.pullRtmp, streamUrl.pullRtmp) && ValueObject.util_equals(this.pullFlv, streamUrl.pullFlv) && ValueObject.util_equals(this.pullHls, streamUrl.pullHls);
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
        int i2 = i * 41;
        String str = this.push;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pullRtmp;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pullFlv;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pullHls;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.push == null) {
            this.push = "";
        }
        if (this.pullRtmp == null) {
            this.pullRtmp = "";
        }
        if (this.pullFlv == null) {
            this.pullFlv = "";
        }
        if (this.pullHls == null) {
            this.pullHls = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
