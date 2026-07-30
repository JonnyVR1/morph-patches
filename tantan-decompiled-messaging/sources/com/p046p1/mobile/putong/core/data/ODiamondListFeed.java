package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ODiamondListFeed;
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
public class ODiamondListFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeed";

    @NonNull
    @ProtobufIndex(index = 3)
    public ODiamondListFeedPick pick;

    @NonNull
    @ProtobufIndex(index = 4)
    public ODiamondListFeedRelation relation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<ODiamondListFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondListFeed oDiamondListFeed) {
            List<String> list = oDiamondListFeed.userIds;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = oDiamondListFeed.type;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            ODiamondListFeedPick oDiamondListFeedPick = oDiamondListFeed.pick;
            if (oDiamondListFeedPick != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, oDiamondListFeedPick, ODiamondListFeedPick.PROTOBUF_ADAPTER);
            }
            ODiamondListFeedRelation oDiamondListFeedRelation = oDiamondListFeed.relation;
            if (oDiamondListFeedRelation != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, oDiamondListFeedRelation, ODiamondListFeedRelation.PROTOBUF_ADAPTER);
            }
            oDiamondListFeed.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondListFeed parse(nb5 nb5Var) throws IOException {
            ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oDiamondListFeed.userIds == null) {
                        oDiamondListFeed.userIds = new ArrayList();
                    }
                    if (oDiamondListFeed.type == null) {
                        oDiamondListFeed.type = "";
                    }
                    if (oDiamondListFeed.pick == null) {
                        oDiamondListFeed.pick = ODiamondListFeedPick.new_();
                    }
                    if (oDiamondListFeed.relation != null) {
                        break;
                    }
                    oDiamondListFeed.relation = ODiamondListFeedRelation.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oDiamondListFeed.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    oDiamondListFeed.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    oDiamondListFeed.pick = (ODiamondListFeedPick) nb5Var.m158743l(ODiamondListFeedPick.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
                        if (oDiamondListFeed.userIds == null) {
                            oDiamondListFeed.userIds = new ArrayList();
                        }
                        if (oDiamondListFeed.type == null) {
                            oDiamondListFeed.type = "";
                        }
                        if (oDiamondListFeed.pick == null) {
                            oDiamondListFeed.pick = ODiamondListFeedPick.new_();
                        }
                        if (oDiamondListFeed.relation != null) {
                            break;
                        }
                        oDiamondListFeed.relation = ODiamondListFeedRelation.new_();
                        return oDiamondListFeed;
                    }
                    oDiamondListFeed.relation = (ODiamondListFeedRelation) nb5Var.m158743l(ODiamondListFeedRelation.PROTOBUF_ADAPTER);
                }
            }
            return oDiamondListFeed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondListFeed oDiamondListFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oDiamondListFeed.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oDiamondListFeed.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            ODiamondListFeedPick oDiamondListFeedPick = oDiamondListFeed.pick;
            if (oDiamondListFeedPick != null) {
                codedOutputByteBufferNano.m17254K(3, oDiamondListFeedPick, ODiamondListFeedPick.PROTOBUF_ADAPTER);
            }
            ODiamondListFeedRelation oDiamondListFeedRelation = oDiamondListFeed.relation;
            if (oDiamondListFeedRelation != null) {
                codedOutputByteBufferNano.m17254K(4, oDiamondListFeedRelation, ODiamondListFeedRelation.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeed> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondListFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondListFeed newInstance() {
            return new ODiamondListFeed();
        }

        public boolean parseField(ODiamondListFeed oDiamondListFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "relation":
                    oDiamondListFeed.relation = ODiamondListFeedRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userIds":
                    oDiamondListFeed.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pick":
                    oDiamondListFeed.pick = ODiamondListFeedPick.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    oDiamondListFeed.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondListFeed oDiamondListFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "relation":
                case "userIds":
                case "pick":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondListFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondListFeed oDiamondListFeed, JsonGenerator jsonGenerator) throws IOException {
            if (oDiamondListFeed.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(oDiamondListFeed.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = oDiamondListFeed.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (oDiamondListFeed.pick != null) {
                jsonGenerator.writeFieldName(ODiamondStatisticsType.pick);
                ODiamondListFeedPick.JSON_ADAPTER.serialize(oDiamondListFeed.pick, jsonGenerator, true);
            }
            if (oDiamondListFeed.relation != null) {
                jsonGenerator.writeFieldName("relation");
                ODiamondListFeedRelation.JSON_ADAPTER.serialize(oDiamondListFeed.relation, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35727a(String str) {
        return str;
    }

    public static ODiamondListFeed new_() {
        ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
        oDiamondListFeed.nullCheck();
        return oDiamondListFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondListFeed mo223809clone() {
        ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
        List<String> list = this.userIds;
        if (list != null) {
            oDiamondListFeed.userIds = ValueObject.util_map(list, new w9j() { // from class: l.fw40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ODiamondListFeed.m35727a((String) obj);
                }
            });
        }
        oDiamondListFeed.type = this.type;
        ODiamondListFeedPick oDiamondListFeedPick = this.pick;
        if (oDiamondListFeedPick != null) {
            oDiamondListFeed.pick = oDiamondListFeedPick.mo223809clone();
        }
        ODiamondListFeedRelation oDiamondListFeedRelation = this.relation;
        if (oDiamondListFeedRelation != null) {
            oDiamondListFeed.relation = oDiamondListFeedRelation.mo223809clone();
        }
        return oDiamondListFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondListFeed)) {
            return false;
        }
        ODiamondListFeed oDiamondListFeed = (ODiamondListFeed) obj;
        return ValueObject.util_equals(this.userIds, oDiamondListFeed.userIds) && ValueObject.util_equals(this.type, oDiamondListFeed.type) && ValueObject.util_equals(this.pick, oDiamondListFeed.pick) && ValueObject.util_equals(this.relation, oDiamondListFeed.relation);
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
        List<String> list = this.userIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        ODiamondListFeedPick oDiamondListFeedPick = this.pick;
        int iHashCode3 = (iHashCode2 + (oDiamondListFeedPick != null ? oDiamondListFeedPick.hashCode() : 0)) * 41;
        ODiamondListFeedRelation oDiamondListFeedRelation = this.relation;
        int iHashCode4 = iHashCode3 + (oDiamondListFeedRelation != null ? oDiamondListFeedRelation.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.pick == null) {
            this.pick = ODiamondListFeedPick.new_();
        }
        if (this.relation == null) {
            this.relation = ODiamondListFeedRelation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
