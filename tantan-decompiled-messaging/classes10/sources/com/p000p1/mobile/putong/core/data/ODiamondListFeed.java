package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ODiamondListFeed;
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
public class ODiamondListFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeed";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ODiamondListFeedPick pick;

    @NonNull
    @ProtobufIndex(index = 4)
    public ODiamondListFeedRelation relation;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<ODiamondListFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondListFeed oDiamondListFeed) {
            List<String> list = oDiamondListFeed.userIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = oDiamondListFeed.type;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ODiamondListFeedPick oDiamondListFeedPick = oDiamondListFeed.pick;
            if (oDiamondListFeedPick != null) {
                iL += CodedOutputByteBufferNano.l(3, oDiamondListFeedPick, ODiamondListFeedPick.PROTOBUF_ADAPTER);
            }
            ODiamondListFeedRelation oDiamondListFeedRelation = oDiamondListFeed.relation;
            if (oDiamondListFeedRelation != null) {
                iL += CodedOutputByteBufferNano.l(4, oDiamondListFeedRelation, ODiamondListFeedRelation.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oDiamondListFeed).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeed m14595parse(nb5 nb5Var) throws IOException {
            ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    oDiamondListFeed.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    oDiamondListFeed.type = nb5Var.s();
                } else if (iU == 26) {
                    oDiamondListFeed.pick = (ODiamondListFeedPick) nb5Var.l(ODiamondListFeedPick.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
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
                    oDiamondListFeed.relation = (ODiamondListFeedRelation) nb5Var.l(ODiamondListFeedRelation.PROTOBUF_ADAPTER);
                }
            }
            return oDiamondListFeed;
        }

        public void serialize(ODiamondListFeed oDiamondListFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oDiamondListFeed.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oDiamondListFeed.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            ODiamondListFeedPick oDiamondListFeedPick = oDiamondListFeed.pick;
            if (oDiamondListFeedPick != null) {
                codedOutputByteBufferNano.K(3, oDiamondListFeedPick, ODiamondListFeedPick.PROTOBUF_ADAPTER);
            }
            ODiamondListFeedRelation oDiamondListFeedRelation = oDiamondListFeed.relation;
            if (oDiamondListFeedRelation != null) {
                codedOutputByteBufferNano.K(4, oDiamondListFeedRelation, ODiamondListFeedRelation.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeed> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeed.2
        public Class getDataClass() {
            return ODiamondListFeed.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeed m14596newInstance() {
            return new ODiamondListFeed();
        }

        public boolean parseField(ODiamondListFeed oDiamondListFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "relation":
                    oDiamondListFeed.relation = (ODiamondListFeedRelation) ODiamondListFeedRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userIds":
                    oDiamondListFeed.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pick":
                    oDiamondListFeed.pick = (ODiamondListFeedPick) ODiamondListFeedPick.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m529a(String str) {
        return str;
    }

    public static ODiamondListFeed new_() {
        ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
        oDiamondListFeed.nullCheck();
        return oDiamondListFeed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondListFeed m14594clone() {
        ODiamondListFeed oDiamondListFeed = new ODiamondListFeed();
        List<String> list = this.userIds;
        if (list != null) {
            oDiamondListFeed.userIds = ValueObject.util_map(list, new w9j() { // from class: l.fw40
                public final Object call(Object obj) {
                    return ODiamondListFeed.m529a((String) obj);
                }
            });
        }
        oDiamondListFeed.type = this.type;
        ODiamondListFeedPick oDiamondListFeedPick = this.pick;
        if (oDiamondListFeedPick != null) {
            oDiamondListFeed.pick = oDiamondListFeedPick.m14598clone();
        }
        ODiamondListFeedRelation oDiamondListFeedRelation = this.relation;
        if (oDiamondListFeedRelation != null) {
            oDiamondListFeed.relation = oDiamondListFeedRelation.m14602clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
