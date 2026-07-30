package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.FunSingleRecord;
import com.p046p1.mobile.putong.data.NavigationIntent;
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

/* JADX INFO: loaded from: classes10.dex */
public class FunAllShowRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "funallshowrecord";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FunSingleRecord> heartBeat;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FunSingleRecord> liveRoom;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<FunSingleRecord> onlineChat;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<FunSingleRecord> voiceChat;
    public static ProtobufAdapter<FunAllShowRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<FunAllShowRecord>() { // from class: com.p1.mobile.putong.core.data.FunAllShowRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FunAllShowRecord funAllShowRecord) {
            List<FunSingleRecord> list = funAllShowRecord.liveRoom;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<FunSingleRecord> list2 = funAllShowRecord.onlineChat;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list3 = funAllShowRecord.voiceChat;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list4 = funAllShowRecord.heartBeat;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            funAllShowRecord.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FunAllShowRecord parse(nb5 nb5Var) throws IOException {
            FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (funAllShowRecord.liveRoom == null) {
                        funAllShowRecord.liveRoom = new ArrayList();
                    }
                    if (funAllShowRecord.onlineChat == null) {
                        funAllShowRecord.onlineChat = new ArrayList();
                    }
                    if (funAllShowRecord.voiceChat == null) {
                        funAllShowRecord.voiceChat = new ArrayList();
                    }
                    if (funAllShowRecord.heartBeat != null) {
                        break;
                    }
                    funAllShowRecord.heartBeat = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    funAllShowRecord.liveRoom = (List) nb5Var.m158743l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    funAllShowRecord.onlineChat = (List) nb5Var.m158743l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    funAllShowRecord.voiceChat = (List) nb5Var.m158743l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 34) {
                        if (funAllShowRecord.liveRoom == null) {
                            funAllShowRecord.liveRoom = new ArrayList();
                        }
                        if (funAllShowRecord.onlineChat == null) {
                            funAllShowRecord.onlineChat = new ArrayList();
                        }
                        if (funAllShowRecord.voiceChat == null) {
                            funAllShowRecord.voiceChat = new ArrayList();
                        }
                        if (funAllShowRecord.heartBeat != null) {
                            break;
                        }
                        funAllShowRecord.heartBeat = new ArrayList();
                        return funAllShowRecord;
                    }
                    funAllShowRecord.heartBeat = (List) nb5Var.m158743l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return funAllShowRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FunAllShowRecord funAllShowRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FunSingleRecord> list = funAllShowRecord.liveRoom;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list2 = funAllShowRecord.onlineChat;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list3 = funAllShowRecord.voiceChat;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list4 = funAllShowRecord.heartBeat;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FunAllShowRecord> JSON_ADAPTER = new ObjectJsonAdapter<FunAllShowRecord>() { // from class: com.p1.mobile.putong.core.data.FunAllShowRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FunAllShowRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FunAllShowRecord newInstance() {
            return new FunAllShowRecord();
        }

        public boolean parseField(FunAllShowRecord funAllShowRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceChat":
                    funAllShowRecord.voiceChat = JsonAdapter.parseArray(jsonParser, FunSingleRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "onlineChat":
                    funAllShowRecord.onlineChat = JsonAdapter.parseArray(jsonParser, FunSingleRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "heartBeat":
                    funAllShowRecord.heartBeat = JsonAdapter.parseArray(jsonParser, FunSingleRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "liveRoom":
                    funAllShowRecord.liveRoom = JsonAdapter.parseArray(jsonParser, FunSingleRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FunAllShowRecord funAllShowRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "voiceChat":
                case "onlineChat":
                case "heartBeat":
                case "liveRoom":
                    return true;
                default:
                    return super.parseFieldCheck(funAllShowRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FunAllShowRecord funAllShowRecord, JsonGenerator jsonGenerator) throws IOException {
            if (funAllShowRecord.liveRoom != null) {
                jsonGenerator.writeFieldName("liveRoom");
                JsonAdapter.serializeArray(funAllShowRecord.liveRoom, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
            if (funAllShowRecord.onlineChat != null) {
                jsonGenerator.writeFieldName("onlineChat");
                JsonAdapter.serializeArray(funAllShowRecord.onlineChat, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
            if (funAllShowRecord.voiceChat != null) {
                jsonGenerator.writeFieldName(NavigationIntent.voiceChat);
                JsonAdapter.serializeArray(funAllShowRecord.voiceChat, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
            if (funAllShowRecord.heartBeat != null) {
                jsonGenerator.writeFieldName("heartBeat");
                JsonAdapter.serializeArray(funAllShowRecord.heartBeat, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FunAllShowRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FunAllShowRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FunAllShowRecord new_() {
        FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
        funAllShowRecord.nullCheck();
        return funAllShowRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FunAllShowRecord mo223809clone() {
        FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
        List<FunSingleRecord> list = this.liveRoom;
        if (list != null) {
            funAllShowRecord.liveRoom = ValueObject.util_map(list, new w9j() { // from class: l.n9j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).mo223809clone();
                }
            });
        }
        List<FunSingleRecord> list2 = this.onlineChat;
        if (list2 != null) {
            funAllShowRecord.onlineChat = ValueObject.util_map(list2, new w9j() { // from class: l.o9j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).mo223809clone();
                }
            });
        }
        List<FunSingleRecord> list3 = this.voiceChat;
        if (list3 != null) {
            funAllShowRecord.voiceChat = ValueObject.util_map(list3, new w9j() { // from class: l.p9j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).mo223809clone();
                }
            });
        }
        List<FunSingleRecord> list4 = this.heartBeat;
        if (list4 != null) {
            funAllShowRecord.heartBeat = ValueObject.util_map(list4, new w9j() { // from class: l.q9j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).mo223809clone();
                }
            });
        }
        return funAllShowRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunAllShowRecord)) {
            return false;
        }
        FunAllShowRecord funAllShowRecord = (FunAllShowRecord) obj;
        return ValueObject.util_equals(this.liveRoom, funAllShowRecord.liveRoom) && ValueObject.util_equals(this.onlineChat, funAllShowRecord.onlineChat) && ValueObject.util_equals(this.voiceChat, funAllShowRecord.voiceChat) && ValueObject.util_equals(this.heartBeat, funAllShowRecord.heartBeat);
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
        List<FunSingleRecord> list = this.liveRoom;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<FunSingleRecord> list2 = this.onlineChat;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<FunSingleRecord> list3 = this.voiceChat;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<FunSingleRecord> list4 = this.heartBeat;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveRoom == null) {
            this.liveRoom = new ArrayList();
        }
        if (this.onlineChat == null) {
            this.onlineChat = new ArrayList();
        }
        if (this.voiceChat == null) {
            this.voiceChat = new ArrayList();
        }
        if (this.heartBeat == null) {
            this.heartBeat = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
