package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class StreamCdnInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "streamcdninfo";

    @ProtobufIndex(index = 2)
    public int businessType;

    @ProtobufIndex(index = 1)
    public int provider;
    public static ProtobufAdapter<StreamCdnInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<StreamCdnInfo>() { // from class: com.p1.mobile.putong.data.StreamCdnInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StreamCdnInfo streamCdnInfo) {
            int iH = CodedOutputByteBufferNano.h(1, streamCdnInfo.provider) + CodedOutputByteBufferNano.h(2, streamCdnInfo.businessType);
            ((MessageNano) streamCdnInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StreamCdnInfo m19034parse(nb5 nb5Var) throws IOException {
            StreamCdnInfo streamCdnInfo = new StreamCdnInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    streamCdnInfo.provider = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return streamCdnInfo;
                    }
                    streamCdnInfo.businessType = nb5Var.j();
                }
            }
        }

        public void serialize(StreamCdnInfo streamCdnInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, streamCdnInfo.provider);
            codedOutputByteBufferNano.G(2, streamCdnInfo.businessType);
        }
    };
    public static JsonAdapter<StreamCdnInfo> JSON_ADAPTER = new ObjectJsonAdapter<StreamCdnInfo>() { // from class: com.p1.mobile.putong.data.StreamCdnInfo.2
        public Class getDataClass() {
            return StreamCdnInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StreamCdnInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StreamCdnInfo streamCdnInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("provider", streamCdnInfo.provider);
            jsonGenerator.writeNumberField("businessType", streamCdnInfo.businessType);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StreamCdnInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StreamCdnInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StreamCdnInfo new_() {
        StreamCdnInfo streamCdnInfo = new StreamCdnInfo();
        streamCdnInfo.nullCheck();
        return streamCdnInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StreamCdnInfo m19033clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.provider) * 41) + this.businessType;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
