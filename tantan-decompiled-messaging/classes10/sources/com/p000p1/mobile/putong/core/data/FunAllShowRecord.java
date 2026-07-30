package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.FunSingleRecord;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FunAllShowRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "funallshowrecord";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FunSingleRecord> heartBeat;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FunSingleRecord> liveRoom;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<FunSingleRecord> onlineChat;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<FunSingleRecord> voiceChat;
    public static ProtobufAdapter<FunAllShowRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<FunAllShowRecord>() { // from class: com.p1.mobile.putong.core.data.FunAllShowRecord.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FunAllShowRecord funAllShowRecord) {
            List<FunSingleRecord> list = funAllShowRecord.liveRoom;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<FunSingleRecord> list2 = funAllShowRecord.onlineChat;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list3 = funAllShowRecord.voiceChat;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list4 = funAllShowRecord.heartBeat;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, list4, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) funAllShowRecord).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FunAllShowRecord m12863parse(nb5 nb5Var) throws IOException {
            FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    funAllShowRecord.liveRoom = (List) nb5Var.l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    funAllShowRecord.onlineChat = (List) nb5Var.l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    funAllShowRecord.voiceChat = (List) nb5Var.l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
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
                    funAllShowRecord.heartBeat = (List) nb5Var.l(FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return funAllShowRecord;
        }

        public void serialize(FunAllShowRecord funAllShowRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FunSingleRecord> list = funAllShowRecord.liveRoom;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list2 = funAllShowRecord.onlineChat;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list3 = funAllShowRecord.voiceChat;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FunSingleRecord> list4 = funAllShowRecord.heartBeat;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, list4, FunSingleRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FunAllShowRecord> JSON_ADAPTER = new ObjectJsonAdapter<FunAllShowRecord>() { // from class: com.p1.mobile.putong.core.data.FunAllShowRecord.2
        public Class getDataClass() {
            return FunAllShowRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FunAllShowRecord m12864newInstance() {
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
                jsonGenerator.writeFieldName("voiceChat");
                JsonAdapter.serializeArray(funAllShowRecord.voiceChat, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
            if (funAllShowRecord.heartBeat != null) {
                jsonGenerator.writeFieldName("heartBeat");
                JsonAdapter.serializeArray(funAllShowRecord.heartBeat, jsonGenerator, FunSingleRecord.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FunAllShowRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FunAllShowRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FunAllShowRecord new_() {
        FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
        funAllShowRecord.nullCheck();
        return funAllShowRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FunAllShowRecord m12862clone() {
        FunAllShowRecord funAllShowRecord = new FunAllShowRecord();
        List<FunSingleRecord> list = this.liveRoom;
        if (list != null) {
            funAllShowRecord.liveRoom = ValueObject.util_map(list, new w9j() { // from class: l.n9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).m12866clone();
                }
            });
        }
        List<FunSingleRecord> list2 = this.onlineChat;
        if (list2 != null) {
            funAllShowRecord.onlineChat = ValueObject.util_map(list2, new w9j() { // from class: l.o9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).m12866clone();
                }
            });
        }
        List<FunSingleRecord> list3 = this.voiceChat;
        if (list3 != null) {
            funAllShowRecord.voiceChat = ValueObject.util_map(list3, new w9j() { // from class: l.p9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).m12866clone();
                }
            });
        }
        List<FunSingleRecord> list4 = this.heartBeat;
        if (list4 != null) {
            funAllShowRecord.heartBeat = ValueObject.util_map(list4, new w9j() { // from class: l.q9j
                public final Object call(Object obj) {
                    return ((FunSingleRecord) obj).m12866clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
