package com.p046p1.mobile.putong.data;

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
public class StreamCdnInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "streamcdninfo";

    @ProtobufIndex(index = 2)
    public int businessType;

    @ProtobufIndex(index = 1)
    public int provider;
    public static ProtobufAdapter<StreamCdnInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<StreamCdnInfo>() { // from class: com.p1.mobile.putong.data.StreamCdnInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StreamCdnInfo streamCdnInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, streamCdnInfo.provider) + CodedOutputByteBufferNano.m17226h(2, streamCdnInfo.businessType);
            streamCdnInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StreamCdnInfo parse(nb5 nb5Var) throws IOException {
            StreamCdnInfo streamCdnInfo = new StreamCdnInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    streamCdnInfo.provider = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return streamCdnInfo;
                    }
                    streamCdnInfo.businessType = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StreamCdnInfo streamCdnInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, streamCdnInfo.provider);
            codedOutputByteBufferNano.m17250G(2, streamCdnInfo.businessType);
        }
    };
    public static JsonAdapter<StreamCdnInfo> JSON_ADAPTER = new ObjectJsonAdapter<StreamCdnInfo>() { // from class: com.p1.mobile.putong.data.StreamCdnInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StreamCdnInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StreamCdnInfo newInstance() {
            return new StreamCdnInfo();
        }

        public boolean parseField(StreamCdnInfo streamCdnInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("provider")) {
                streamCdnInfo.provider = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("businessType")) {
                return false;
            }
            streamCdnInfo.businessType = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(StreamCdnInfo streamCdnInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("provider") || str.equals("businessType")) {
                return true;
            }
            return super.parseFieldCheck(streamCdnInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StreamCdnInfo streamCdnInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("provider", streamCdnInfo.provider);
            jsonGenerator.writeNumberField("businessType", streamCdnInfo.businessType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StreamCdnInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StreamCdnInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StreamCdnInfo new_() {
        StreamCdnInfo streamCdnInfo = new StreamCdnInfo();
        streamCdnInfo.nullCheck();
        return streamCdnInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StreamCdnInfo mo223809clone() {
        StreamCdnInfo streamCdnInfo = new StreamCdnInfo();
        streamCdnInfo.provider = this.provider;
        streamCdnInfo.businessType = this.businessType;
        return streamCdnInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamCdnInfo)) {
            return false;
        }
        StreamCdnInfo streamCdnInfo = (StreamCdnInfo) obj;
        return this.provider == streamCdnInfo.provider && this.businessType == streamCdnInfo.businessType;
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
        int i2 = (((i * 41) + this.provider) * 41) + this.businessType;
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
