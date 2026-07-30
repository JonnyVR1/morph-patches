package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoicePlayModeList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoiceplaymodelist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoicePlayModeItem> gameConfs;
    public static ProtobufAdapter<BLiveVoicePlayModeList> PROTOBUF_ADAPTER = new C12354a();
    public static JsonAdapter<BLiveVoicePlayModeList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePlayModeList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePlayModeList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePlayModeList newInstance() {
            return new BLiveVoicePlayModeList();
        }

        public boolean parseField(BLiveVoicePlayModeList bLiveVoicePlayModeList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("gameConfs")) {
                return false;
            }
            bLiveVoicePlayModeList.gameConfs = JsonAdapter.parseArray(jsonParser, BLiveVoicePlayModeItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePlayModeList bLiveVoicePlayModeList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoicePlayModeList.gameConfs != null) {
                jsonGenerator.writeFieldName("gameConfs");
                JsonAdapter.serializeArray(bLiveVoicePlayModeList.gameConfs, jsonGenerator, BLiveVoicePlayModeItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePlayModeList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeList$a */
    public class C12354a extends MessageNanoAdapter<BLiveVoicePlayModeList> {
        public C12354a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePlayModeList bLiveVoicePlayModeList) {
            List<BLiveVoicePlayModeItem> list = bLiveVoicePlayModeList.gameConfs;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, BLiveVoicePlayModeItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            bLiveVoicePlayModeList.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePlayModeList parse(nb5 nb5Var) throws IOException {
            BLiveVoicePlayModeList bLiveVoicePlayModeList = new BLiveVoicePlayModeList();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveVoicePlayModeList.gameConfs != null) {
                        break;
                    }
                    bLiveVoicePlayModeList.gameConfs = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (bLiveVoicePlayModeList.gameConfs != null) {
                        break;
                    }
                    bLiveVoicePlayModeList.gameConfs = new ArrayList();
                    return bLiveVoicePlayModeList;
                }
                bLiveVoicePlayModeList.gameConfs = (List) nb5Var.m158743l(BLiveVoicePlayModeItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return bLiveVoicePlayModeList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePlayModeList bLiveVoicePlayModeList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<BLiveVoicePlayModeItem> list = bLiveVoicePlayModeList.gameConfs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, BLiveVoicePlayModeItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    }

    public static BLiveVoicePlayModeList new_() {
        BLiveVoicePlayModeList bLiveVoicePlayModeList = new BLiveVoicePlayModeList();
        bLiveVoicePlayModeList.nullCheck();
        return bLiveVoicePlayModeList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePlayModeList mo223809clone() {
        BLiveVoicePlayModeList bLiveVoicePlayModeList = new BLiveVoicePlayModeList();
        List<BLiveVoicePlayModeItem> list = this.gameConfs;
        if (list != null) {
            bLiveVoicePlayModeList.gameConfs = ValueObject.util_map(list, new w9j() { // from class: l.h92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoicePlayModeItem) obj).mo223809clone();
                }
            });
        }
        return bLiveVoicePlayModeList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoicePlayModeList) {
            return ValueObject.util_equals(this.gameConfs, ((BLiveVoicePlayModeList) obj).gameConfs);
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
        List<BLiveVoicePlayModeItem> list = this.gameConfs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gameConfs == null) {
            this.gameConfs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
