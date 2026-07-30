package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Pagination extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pagination";

    @Nullable
    @ProtobufIndex(index = 7)
    public CountInfo countInfo;

    @NonNull
    @ProtobufIndex(index = 5)
    public String lastId;

    @ProtobufIndex(index = 6)
    public boolean lastPage;

    @ProtobufIndex(index = 4)
    public long lastTimestamp;

    @ProtobufIndex(index = 2)
    public int limit;

    @NonNull
    @ProtobufIndex(index = 3)
    public Links links;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<Pagination> PROTOBUF_ADAPTER = new MessageNanoAdapter<Pagination>() { // from class: com.p1.mobile.putong.data.Pagination.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Pagination pagination) {
            int iH = CodedOutputByteBufferNano.h(1, pagination.total) + CodedOutputByteBufferNano.h(2, pagination.limit);
            Links links = pagination.links;
            if (links != null) {
                iH += CodedOutputByteBufferNano.l(3, links, Links.PROTOBUF_ADAPTER);
            }
            int iJ = iH + CodedOutputByteBufferNano.j(4, pagination.lastTimestamp);
            String str = pagination.lastId;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(5, str);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(6, pagination.lastPage);
            CountInfo countInfo = pagination.countInfo;
            if (countInfo != null) {
                iB += CodedOutputByteBufferNano.l(7, countInfo, CountInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) pagination).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Pagination m18765parse(nb5 nb5Var) throws IOException {
            Pagination pagination = new Pagination();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pagination.links == null) {
                        pagination.links = Links.new_();
                    }
                    if (pagination.lastId != null) {
                        break;
                    }
                    pagination.lastId = "";
                    break;
                }
                if (iU == 8) {
                    pagination.total = nb5Var.j();
                } else if (iU == 16) {
                    pagination.limit = nb5Var.j();
                } else if (iU == 26) {
                    pagination.links = (Links) nb5Var.l(Links.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    pagination.lastTimestamp = nb5Var.k();
                } else if (iU == 42) {
                    pagination.lastId = nb5Var.s();
                } else if (iU == 48) {
                    pagination.lastPage = nb5Var.g();
                } else {
                    if (iU != 58) {
                        if (pagination.links == null) {
                            pagination.links = Links.new_();
                        }
                        if (pagination.lastId != null) {
                            break;
                        }
                        pagination.lastId = "";
                        return pagination;
                    }
                    pagination.countInfo = (CountInfo) nb5Var.l(CountInfo.PROTOBUF_ADAPTER);
                }
            }
            return pagination;
        }

        public void serialize(Pagination pagination, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, pagination.total);
            codedOutputByteBufferNano.G(2, pagination.limit);
            Links links = pagination.links;
            if (links != null) {
                codedOutputByteBufferNano.K(3, links, Links.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(4, pagination.lastTimestamp);
            String str = pagination.lastId;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
            codedOutputByteBufferNano.A(6, pagination.lastPage);
            CountInfo countInfo = pagination.countInfo;
            if (countInfo != null) {
                codedOutputByteBufferNano.K(7, countInfo, CountInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Pagination> JSON_ADAPTER = new ObjectJsonAdapter<Pagination>() { // from class: com.p1.mobile.putong.data.Pagination.2
        public Class getDataClass() {
            return Pagination.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Pagination mo17830newInstance() {
            return new Pagination();
        }

        public boolean parseField(Pagination pagination, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "lastTimestamp":
                    pagination.lastTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "lastPage":
                    pagination.lastPage = jsonParser.getValueAsBoolean();
                    return true;
                case "lastId":
                    pagination.lastId = jsonParser.getValueAsString();
                    return true;
                case "limit":
                    pagination.limit = jsonParser.getValueAsInt();
                    return true;
                case "links":
                    pagination.links = (Links) Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "total":
                    pagination.total = jsonParser.getValueAsInt();
                    return true;
                case "countInfo":
                    pagination.countInfo = (CountInfo) CountInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Pagination pagination, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "lastTimestamp":
                case "lastPage":
                case "lastId":
                case "limit":
                case "links":
                case "total":
                case "countInfo":
                    return true;
                default:
                    return super.parseFieldCheck(pagination, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Pagination pagination, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", pagination.total);
            jsonGenerator.writeNumberField("limit", pagination.limit);
            if (pagination.links != null) {
                jsonGenerator.writeFieldName(Links.TYPE);
                Links.JSON_ADAPTER.serialize(pagination.links, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("lastTimestamp", pagination.lastTimestamp);
            String str = pagination.lastId;
            if (str != null) {
                jsonGenerator.writeStringField("lastId", str);
            }
            jsonGenerator.writeBooleanField("lastPage", pagination.lastPage);
            if (pagination.countInfo != null) {
                jsonGenerator.writeFieldName("countInfo");
                CountInfo.JSON_ADAPTER.serialize(pagination.countInfo, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Pagination) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Pagination) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Pagination new_() {
        Pagination pagination = new Pagination();
        pagination.nullCheck();
        return pagination;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Pagination m18764clone() {
        Pagination pagination = new Pagination();
        pagination.total = this.total;
        pagination.limit = this.limit;
        Links links = this.links;
        if (links != null) {
            pagination.links = links.m18297clone();
        }
        pagination.lastTimestamp = this.lastTimestamp;
        pagination.lastId = this.lastId;
        pagination.lastPage = this.lastPage;
        CountInfo countInfo = this.countInfo;
        if (countInfo != null) {
            pagination.countInfo = countInfo.m17868clone();
        }
        return pagination;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pagination)) {
            return false;
        }
        Pagination pagination = (Pagination) obj;
        return this.total == pagination.total && this.limit == pagination.limit && ValueObject.util_equals(this.links, pagination.links) && this.lastTimestamp == pagination.lastTimestamp && ValueObject.util_equals(this.lastId, pagination.lastId) && this.lastPage == pagination.lastPage && ValueObject.util_equals(this.countInfo, pagination.countInfo);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.total) * 41) + this.limit) * 41;
        Links links = this.links;
        int iHashCode = links != null ? links.hashCode() : 0;
        long j = this.lastTimestamp;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.lastId;
        int iHashCode2 = (((i3 + (str != null ? str.hashCode() : 0)) * 41) + (this.lastPage ? 1231 : 1237)) * 41;
        CountInfo countInfo = this.countInfo;
        int iHashCode3 = iHashCode2 + (countInfo != null ? countInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.links == null) {
            this.links = Links.new_();
        }
        if (this.lastId == null) {
            this.lastId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
