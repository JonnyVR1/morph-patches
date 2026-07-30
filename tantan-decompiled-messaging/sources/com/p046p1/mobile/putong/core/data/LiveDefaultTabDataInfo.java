package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class LiveDefaultTabDataInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livedefaulttabdatainfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String firstTab;
    public static ProtobufAdapter<LiveDefaultTabDataInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveDefaultTabDataInfo>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabDataInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveDefaultTabDataInfo liveDefaultTabDataInfo) {
            String str = liveDefaultTabDataInfo.firstTab;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            liveDefaultTabDataInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveDefaultTabDataInfo parse(nb5 nb5Var) throws IOException {
            LiveDefaultTabDataInfo liveDefaultTabDataInfo = new LiveDefaultTabDataInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveDefaultTabDataInfo.firstTab != null) {
                        break;
                    }
                    liveDefaultTabDataInfo.firstTab = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (liveDefaultTabDataInfo.firstTab != null) {
                        break;
                    }
                    liveDefaultTabDataInfo.firstTab = "";
                    return liveDefaultTabDataInfo;
                }
                liveDefaultTabDataInfo.firstTab = nb5Var.m158750s();
            }
            return liveDefaultTabDataInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveDefaultTabDataInfo liveDefaultTabDataInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveDefaultTabDataInfo.firstTab;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<LiveDefaultTabDataInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveDefaultTabDataInfo>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabDataInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveDefaultTabDataInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveDefaultTabDataInfo newInstance() {
            return new LiveDefaultTabDataInfo();
        }

        public boolean parseField(LiveDefaultTabDataInfo liveDefaultTabDataInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("firstTab")) {
                return false;
            }
            liveDefaultTabDataInfo.firstTab = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveDefaultTabDataInfo liveDefaultTabDataInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("firstTab")) {
                return true;
            }
            return super.parseFieldCheck(liveDefaultTabDataInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveDefaultTabDataInfo liveDefaultTabDataInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveDefaultTabDataInfo.firstTab;
            if (str != null) {
                jsonGenerator.writeStringField("firstTab", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveDefaultTabDataInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveDefaultTabDataInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveDefaultTabDataInfo new_() {
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = new LiveDefaultTabDataInfo();
        liveDefaultTabDataInfo.nullCheck();
        return liveDefaultTabDataInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveDefaultTabDataInfo mo223809clone() {
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = new LiveDefaultTabDataInfo();
        liveDefaultTabDataInfo.firstTab = this.firstTab;
        return liveDefaultTabDataInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveDefaultTabDataInfo) {
            return ValueObject.util_equals(this.firstTab, ((LiveDefaultTabDataInfo) obj).firstTab);
        }
        return false;
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
        String str = this.firstTab;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.firstTab == null) {
            this.firstTab = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
