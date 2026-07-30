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
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class CountInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countinfo";

    @ProtobufIndex(index = 2)
    public int all;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CountInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CountInfo>() { // from class: com.p1.mobile.putong.data.CountInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CountInfo countInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, countInfo.unread) + CodedOutputByteBufferNano.m17226h(2, countInfo.all);
            countInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CountInfo parse(nb5 nb5Var) throws IOException {
            CountInfo countInfo = new CountInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    countInfo.unread = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return countInfo;
                    }
                    countInfo.all = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CountInfo countInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, countInfo.unread);
            codedOutputByteBufferNano.m17250G(2, countInfo.all);
        }
    };
    public static JsonAdapter<CountInfo> JSON_ADAPTER = new ObjectJsonAdapter<CountInfo>() { // from class: com.p1.mobile.putong.data.CountInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CountInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CountInfo newInstance() {
            return new CountInfo();
        }

        public boolean parseField(CountInfo countInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("all")) {
                countInfo.all = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(ShareConstants.NEW_VERSION)) {
                return false;
            }
            countInfo.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CountInfo countInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("all") || str.equals(ShareConstants.NEW_VERSION)) {
                return true;
            }
            return super.parseFieldCheck(countInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CountInfo countInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(ShareConstants.NEW_VERSION, countInfo.unread);
            jsonGenerator.writeNumberField("all", countInfo.all);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CountInfo new_() {
        CountInfo countInfo = new CountInfo();
        countInfo.nullCheck();
        return countInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CountInfo mo223809clone() {
        CountInfo countInfo = new CountInfo();
        countInfo.unread = this.unread;
        countInfo.all = this.all;
        return countInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CountInfo)) {
            return false;
        }
        CountInfo countInfo = (CountInfo) obj;
        return this.unread == countInfo.unread && this.all == countInfo.all;
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
        int i2 = (((i * 41) + this.unread) * 41) + this.all;
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
