package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FriendState;
import com.p000p1.mobile.putong.data.FriendStatus;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FriendStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendstatus";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> endTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> labelName;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> labelType;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FriendState> status;
    public static ProtobufAdapter<FriendStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendStatus>() { // from class: com.p1.mobile.putong.data.FriendStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FriendStatus friendStatus) {
            List<String> list = friendStatus.labelType;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = friendStatus.labelName;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = friendStatus.endTime;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list4 = friendStatus.status;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, FriendState.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list5 = friendStatus.status;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(5, list5, FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) friendStatus).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FriendStatus m18127parse(nb5 nb5Var) throws IOException {
            FriendStatus friendStatus = new FriendStatus();
            List list = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (friendStatus.status == null && list != null) {
                        friendStatus.status = FriendState.oldEnumCovertList(list);
                    }
                    if (friendStatus.labelType == null) {
                        friendStatus.labelType = new ArrayList();
                    }
                    if (friendStatus.labelName == null) {
                        friendStatus.labelName = new ArrayList();
                    }
                    if (friendStatus.endTime == null) {
                        friendStatus.endTime = new ArrayList();
                    }
                    if (friendStatus.status != null) {
                        break;
                    }
                    friendStatus.status = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    friendStatus.labelType = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    friendStatus.labelName = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    friendStatus.endTime = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        if (friendStatus.status == null && list != null) {
                            friendStatus.status = FriendState.oldEnumCovertList(list);
                        }
                        if (friendStatus.labelType == null) {
                            friendStatus.labelType = new ArrayList();
                        }
                        if (friendStatus.labelName == null) {
                            friendStatus.labelName = new ArrayList();
                        }
                        if (friendStatus.endTime == null) {
                            friendStatus.endTime = new ArrayList();
                        }
                        if (friendStatus.status != null) {
                            break;
                        }
                        friendStatus.status = new ArrayList();
                        return friendStatus;
                    }
                    friendStatus.status = (List) nb5Var.l(FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return friendStatus;
        }

        public void serialize(FriendStatus friendStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = friendStatus.labelType;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = friendStatus.labelName;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = friendStatus.endTime;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list4 = friendStatus.status;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, FriendState.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list5 = friendStatus.status;
            if (list5 != null) {
                codedOutputByteBufferNano.K(5, list5, FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FriendStatus> JSON_ADAPTER = new ObjectJsonAdapter<FriendStatus>() { // from class: com.p1.mobile.putong.data.FriendStatus.2
        public Class getDataClass() {
            return FriendStatus.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FriendStatus mo17830newInstance() {
            return new FriendStatus();
        }

        public boolean parseField(FriendStatus friendStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    friendStatus.endTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    friendStatus.status = JsonAdapter.parseArray(jsonParser, FriendState.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "labelName":
                    friendStatus.labelName = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "labelType":
                    friendStatus.labelType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendStatus friendStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "status":
                case "labelName":
                case "labelType":
                    return true;
                default:
                    return super.parseFieldCheck(friendStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendStatus friendStatus, JsonGenerator jsonGenerator) throws IOException {
            if (friendStatus.labelType != null) {
                jsonGenerator.writeFieldName("labelType");
                JsonAdapter.serializeArray(friendStatus.labelType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (friendStatus.labelName != null) {
                jsonGenerator.writeFieldName("labelName");
                JsonAdapter.serializeArray(friendStatus.labelName, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (friendStatus.endTime != null) {
                jsonGenerator.writeFieldName("endTime");
                JsonAdapter.serializeArray(friendStatus.endTime, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (friendStatus.status != null) {
                jsonGenerator.writeFieldName("status");
                JsonAdapter.serializeArray(friendStatus.status, jsonGenerator, FriendState.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m709a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FriendState m710b(FriendState friendState) {
        return friendState;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m711c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m712d(String str) {
        return str;
    }

    public static FriendStatus debug_new_() {
        FriendStatus friendStatusNew_ = new_();
        friendStatusNew_.labelName.add("睡nmb起来嗨");
        friendStatusNew_.endTime.add(String.valueOf(Long.MAX_VALUE));
        friendStatusNew_.labelType.add("single");
        friendStatusNew_.status.add(FriendState.get("default"));
        return friendStatusNew_;
    }

    public static FriendStatus new_() {
        FriendStatus friendStatus = new FriendStatus();
        friendStatus.nullCheck();
        return friendStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FriendStatus m18126clone() {
        FriendStatus friendStatus = new FriendStatus();
        List<String> list = this.labelType;
        if (list != null) {
            friendStatus.labelType = ValueObject.util_map(list, new w9j() { // from class: l.i7j
                public final Object call(Object obj) {
                    return FriendStatus.m712d((String) obj);
                }
            });
        }
        List<String> list2 = this.labelName;
        if (list2 != null) {
            friendStatus.labelName = ValueObject.util_map(list2, new w9j() { // from class: l.j7j
                public final Object call(Object obj) {
                    return FriendStatus.m711c((String) obj);
                }
            });
        }
        List<String> list3 = this.endTime;
        if (list3 != null) {
            friendStatus.endTime = ValueObject.util_map(list3, new w9j() { // from class: l.k7j
                public final Object call(Object obj) {
                    return FriendStatus.m709a((String) obj);
                }
            });
        }
        List<FriendState> list4 = this.status;
        if (list4 != null) {
            friendStatus.status = ValueObject.util_map(list4, new w9j() { // from class: l.l7j
                public final Object call(Object obj) {
                    return FriendStatus.m710b((FriendState) obj);
                }
            });
        }
        return friendStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendStatus)) {
            return false;
        }
        FriendStatus friendStatus = (FriendStatus) obj;
        return ValueObject.util_equals(this.labelType, friendStatus.labelType) && ValueObject.util_equals(this.labelName, friendStatus.labelName) && ValueObject.util_equals(this.endTime, friendStatus.endTime) && ValueObject.util_equals(this.status, friendStatus.status);
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
        List<String> list = this.labelType;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.labelName;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.endTime;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<FriendState> list4 = this.status;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.labelType == null) {
            this.labelType = new ArrayList();
        }
        if (this.labelName == null) {
            this.labelName = new ArrayList();
        }
        if (this.endTime == null) {
            this.endTime = new ArrayList();
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
