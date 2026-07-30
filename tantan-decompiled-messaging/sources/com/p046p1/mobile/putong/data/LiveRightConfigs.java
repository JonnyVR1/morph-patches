package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiveRight;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class LiveRightConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverightconfigs";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LiveRight> liveRights;
    public static ProtobufAdapter<LiveRightConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRightConfigs>() { // from class: com.p1.mobile.putong.data.LiveRightConfigs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveRightConfigs liveRightConfigs) {
            List<LiveRight> list = liveRightConfigs.liveRights;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, LiveRight.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            liveRightConfigs.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveRightConfigs parse(nb5 nb5Var) throws IOException {
            LiveRightConfigs liveRightConfigs = new LiveRightConfigs();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveRightConfigs.liveRights != null) {
                        break;
                    }
                    liveRightConfigs.liveRights = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (liveRightConfigs.liveRights != null) {
                        break;
                    }
                    liveRightConfigs.liveRights = new ArrayList();
                    return liveRightConfigs;
                }
                liveRightConfigs.liveRights = (List) nb5Var.m158743l(LiveRight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return liveRightConfigs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveRightConfigs liveRightConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LiveRight> list = liveRightConfigs.liveRights;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, LiveRight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveRightConfigs> JSON_ADAPTER = new ObjectJsonAdapter<LiveRightConfigs>() { // from class: com.p1.mobile.putong.data.LiveRightConfigs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveRightConfigs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveRightConfigs newInstance() {
            return new LiveRightConfigs();
        }

        public boolean parseField(LiveRightConfigs liveRightConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("liveRights")) {
                return false;
            }
            liveRightConfigs.liveRights = JsonAdapter.parseArray(jsonParser, LiveRight.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveRightConfigs liveRightConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("liveRights")) {
                return true;
            }
            return super.parseFieldCheck(liveRightConfigs, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRightConfigs liveRightConfigs, JsonGenerator jsonGenerator) throws IOException {
            if (liveRightConfigs.liveRights != null) {
                jsonGenerator.writeFieldName("liveRights");
                JsonAdapter.serializeArray(liveRightConfigs.liveRights, jsonGenerator, LiveRight.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRightConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRightConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRightConfigs new_() {
        LiveRightConfigs liveRightConfigs = new LiveRightConfigs();
        liveRightConfigs.nullCheck();
        return liveRightConfigs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveRightConfigs mo223809clone() {
        LiveRightConfigs liveRightConfigs = new LiveRightConfigs();
        List<LiveRight> list = this.liveRights;
        if (list != null) {
            liveRightConfigs.liveRights = ValueObject.util_map(list, new w9j() { // from class: l.igt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveRight) obj).mo223809clone();
                }
            });
        }
        return liveRightConfigs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveRightConfigs) {
            return ValueObject.util_equals(this.liveRights, ((LiveRightConfigs) obj).liveRights);
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
        List<LiveRight> list = this.liveRights;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveRights == null) {
            this.liveRights = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
