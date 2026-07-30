package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.PartialIdList;
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
public class PartialIdList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "partialidlist";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    public List<String> expouseIds;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> ids;

    @NonNull
    @ProtobufIndex(index = 4)
    public String latestMessageId;

    @NonNull
    @ProtobufIndex(index = 3)
    public Links links;
    public static PartialIdList UNINITIALIZED = new_();
    public static ProtobufAdapter<PartialIdList> PROTOBUF_ADAPTER = new MessageNanoAdapter<PartialIdList>() { // from class: com.p1.mobile.putong.data.PartialIdList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PartialIdList partialIdList) {
            int iH = CodedOutputByteBufferNano.h(1, partialIdList.count);
            List<String> list = partialIdList.ids;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = partialIdList.links;
            if (links != null) {
                iH += CodedOutputByteBufferNano.l(3, links, Links.PROTOBUF_ADAPTER);
            }
            String str = partialIdList.latestMessageId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            ((MessageNano) partialIdList).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PartialIdList m18768parse(nb5 nb5Var) throws IOException {
            PartialIdList partialIdList = new PartialIdList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (partialIdList.ids == null) {
                        partialIdList.ids = new ArrayList();
                    }
                    if (partialIdList.links == null) {
                        partialIdList.links = Links.new_();
                    }
                    if (partialIdList.latestMessageId == null) {
                        partialIdList.latestMessageId = "";
                    }
                    if (partialIdList.expouseIds != null) {
                        break;
                    }
                    partialIdList.expouseIds = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    partialIdList.count = nb5Var.j();
                } else if (iU == 18) {
                    partialIdList.ids = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    partialIdList.links = (Links) nb5Var.l(Links.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (partialIdList.ids == null) {
                            partialIdList.ids = new ArrayList();
                        }
                        if (partialIdList.links == null) {
                            partialIdList.links = Links.new_();
                        }
                        if (partialIdList.latestMessageId == null) {
                            partialIdList.latestMessageId = "";
                        }
                        if (partialIdList.expouseIds != null) {
                            break;
                        }
                        partialIdList.expouseIds = new ArrayList();
                        return partialIdList;
                    }
                    partialIdList.latestMessageId = nb5Var.s();
                }
            }
            return partialIdList;
        }

        public void serialize(PartialIdList partialIdList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, partialIdList.count);
            List<String> list = partialIdList.ids;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = partialIdList.links;
            if (links != null) {
                codedOutputByteBufferNano.K(3, links, Links.PROTOBUF_ADAPTER);
            }
            String str = partialIdList.latestMessageId;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
        }
    };
    public static JsonAdapter<PartialIdList> JSON_ADAPTER = new ObjectJsonAdapter<PartialIdList>() { // from class: com.p1.mobile.putong.data.PartialIdList.2
        public Class getDataClass() {
            return PartialIdList.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PartialIdList mo17830newInstance() {
            return new PartialIdList();
        }

        public boolean parseField(PartialIdList partialIdList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ids":
                    partialIdList.ids = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "count":
                    partialIdList.count = jsonParser.getValueAsInt();
                    return true;
                case "links":
                    partialIdList.links = (Links) Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "expouseIds":
                    partialIdList.expouseIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "latestMessageId":
                    partialIdList.latestMessageId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PartialIdList partialIdList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ids":
                case "count":
                case "links":
                case "expouseIds":
                case "latestMessageId":
                    return true;
                default:
                    return super.parseFieldCheck(partialIdList, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PartialIdList partialIdList, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", partialIdList.count);
            if (partialIdList.ids != null) {
                jsonGenerator.writeFieldName("ids");
                JsonAdapter.serializeArray(partialIdList.ids, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (partialIdList.links != null) {
                jsonGenerator.writeFieldName(Links.TYPE);
                Links.JSON_ADAPTER.serialize(partialIdList.links, jsonGenerator, true);
            }
            String str = partialIdList.latestMessageId;
            if (str != null) {
                jsonGenerator.writeStringField("latestMessageId", str);
            }
            if (partialIdList.expouseIds != null) {
                jsonGenerator.writeFieldName("expouseIds");
                JsonAdapter.serializeArray(partialIdList.expouseIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PartialIdList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PartialIdList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m890a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m891b(String str) {
        return str;
    }

    public static PartialIdList new_() {
        PartialIdList partialIdList = new PartialIdList();
        partialIdList.nullCheck();
        return partialIdList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PartialIdList m18767clone() {
        PartialIdList partialIdList = new PartialIdList();
        partialIdList.count = this.count;
        List<String> list = this.ids;
        if (list != null) {
            partialIdList.ids = ValueObject.util_map(list, new w9j() { // from class: l.o860
                public final Object call(Object obj) {
                    return PartialIdList.m891b((String) obj);
                }
            });
        }
        Links links = this.links;
        if (links != null) {
            partialIdList.links = links.m18297clone();
        }
        partialIdList.latestMessageId = this.latestMessageId;
        List<String> list2 = this.expouseIds;
        if (list2 != null) {
            partialIdList.expouseIds = ValueObject.util_map(list2, new w9j() { // from class: l.p860
                public final Object call(Object obj) {
                    return PartialIdList.m890a((String) obj);
                }
            });
        }
        return partialIdList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartialIdList)) {
            return false;
        }
        PartialIdList partialIdList = (PartialIdList) obj;
        return this.count == partialIdList.count && ValueObject.util_equals(this.ids, partialIdList.ids) && ValueObject.util_equals(this.links, partialIdList.links) && ValueObject.util_equals(this.latestMessageId, partialIdList.latestMessageId) && ValueObject.util_equals(this.expouseIds, partialIdList.expouseIds);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        List<String> list = this.ids;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Links links = this.links;
        int iHashCode2 = (iHashCode + (links != null ? links.hashCode() : 0)) * 41;
        String str = this.latestMessageId;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.expouseIds;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.ids == null) {
            this.ids = new ArrayList();
        }
        if (this.links == null) {
            this.links = Links.new_();
        }
        if (this.latestMessageId == null) {
            this.latestMessageId = "";
        }
        if (this.expouseIds == null) {
            this.expouseIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
