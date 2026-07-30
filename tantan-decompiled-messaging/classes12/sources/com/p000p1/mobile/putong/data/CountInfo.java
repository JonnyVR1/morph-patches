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
public class CountInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countinfo";

    @ProtobufIndex(index = 2)
    public int all;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CountInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CountInfo>() { // from class: com.p1.mobile.putong.data.CountInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CountInfo countInfo) {
            int iH = CodedOutputByteBufferNano.h(1, countInfo.unread) + CodedOutputByteBufferNano.h(2, countInfo.all);
            ((MessageNano) countInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CountInfo m17869parse(nb5 nb5Var) throws IOException {
            CountInfo countInfo = new CountInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    countInfo.unread = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return countInfo;
                    }
                    countInfo.all = nb5Var.j();
                }
            }
        }

        public void serialize(CountInfo countInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, countInfo.unread);
            codedOutputByteBufferNano.G(2, countInfo.all);
        }
    };
    public static JsonAdapter<CountInfo> JSON_ADAPTER = new ObjectJsonAdapter<CountInfo>() { // from class: com.p1.mobile.putong.data.CountInfo.2
        public Class getDataClass() {
            return CountInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CountInfo mo17830newInstance() {
            return new CountInfo();
        }

        public boolean parseField(CountInfo countInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("all")) {
                countInfo.all = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("new")) {
                return false;
            }
            countInfo.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CountInfo countInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("all") || str.equals("new")) {
                return true;
            }
            return super.parseFieldCheck(countInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CountInfo countInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("new", countInfo.unread);
            jsonGenerator.writeNumberField("all", countInfo.all);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CountInfo new_() {
        CountInfo countInfo = new CountInfo();
        countInfo.nullCheck();
        return countInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CountInfo m17868clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.unread) * 41) + this.all;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
