package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FriendState;
import com.p046p1.mobile.putong.data.FriendStatus;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendStatus friendStatus) {
            List<String> list = friendStatus.labelType;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = friendStatus.labelName;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = friendStatus.endTime;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list4 = friendStatus.status;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, FriendState.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list5 = friendStatus.status;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            friendStatus.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendStatus parse(nb5 nb5Var) throws IOException {
            FriendStatus friendStatus = new FriendStatus();
            List list = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    friendStatus.labelType = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    friendStatus.labelName = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    friendStatus.endTime = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 42) {
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
                    friendStatus.status = (List) nb5Var.m158743l(FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return friendStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendStatus friendStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = friendStatus.labelType;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = friendStatus.labelName;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = friendStatus.endTime;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list4 = friendStatus.status;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, FriendState.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FriendState> list5 = friendStatus.status;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, FriendState.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FriendStatus> JSON_ADAPTER = new ObjectJsonAdapter<FriendStatus>() { // from class: com.p1.mobile.putong.data.FriendStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendStatus newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                JsonAdapter.serializeArray(friendStatus.status, jsonGenerator, FriendState.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59791a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FriendState m59792b(FriendState friendState) {
        return friendState;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59793c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59794d(String str) {
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

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendStatus mo223809clone() {
        FriendStatus friendStatus = new FriendStatus();
        List<String> list = this.labelType;
        if (list != null) {
            friendStatus.labelType = ValueObject.util_map(list, new w9j() { // from class: l.i7j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FriendStatus.m59794d((String) obj);
                }
            });
        }
        List<String> list2 = this.labelName;
        if (list2 != null) {
            friendStatus.labelName = ValueObject.util_map(list2, new w9j() { // from class: l.j7j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FriendStatus.m59793c((String) obj);
                }
            });
        }
        List<String> list3 = this.endTime;
        if (list3 != null) {
            friendStatus.endTime = ValueObject.util_map(list3, new w9j() { // from class: l.k7j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FriendStatus.m59791a((String) obj);
                }
            });
        }
        List<FriendState> list4 = this.status;
        if (list4 != null) {
            friendStatus.status = ValueObject.util_map(list4, new w9j() { // from class: l.l7j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FriendStatus.m59792b((FriendState) obj);
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
        List<String> list = this.labelType;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.labelName;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.endTime;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<FriendState> list4 = this.status;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
