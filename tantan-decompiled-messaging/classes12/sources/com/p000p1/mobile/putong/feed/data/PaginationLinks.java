package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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
public class PaginationLinks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paginationlinks";

    @NonNull
    @ProtobufIndex(index = 1)
    public String next;

    @NonNull
    @ProtobufIndex(index = 2)
    public String nextTopic;
    public static ProtobufAdapter<PaginationLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaginationLinks>() { // from class: com.p1.mobile.putong.feed.data.PaginationLinks.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaginationLinks paginationLinks) {
            String str = paginationLinks.next;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = paginationLinks.nextTopic;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) paginationLinks).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaginationLinks m19693parse(nb5 nb5Var) throws IOException {
            PaginationLinks paginationLinks = new PaginationLinks();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (paginationLinks.next == null) {
                        paginationLinks.next = "";
                    }
                    if (paginationLinks.nextTopic != null) {
                        break;
                    }
                    paginationLinks.nextTopic = "";
                    break;
                }
                if (iU == 10) {
                    paginationLinks.next = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (paginationLinks.next == null) {
                            paginationLinks.next = "";
                        }
                        if (paginationLinks.nextTopic != null) {
                            break;
                        }
                        paginationLinks.nextTopic = "";
                        return paginationLinks;
                    }
                    paginationLinks.nextTopic = nb5Var.s();
                }
            }
            return paginationLinks;
        }

        public void serialize(PaginationLinks paginationLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = paginationLinks.next;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = paginationLinks.nextTopic;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<PaginationLinks> JSON_ADAPTER = new ObjectJsonAdapter<PaginationLinks>() { // from class: com.p1.mobile.putong.feed.data.PaginationLinks.2
        public Class getDataClass() {
            return PaginationLinks.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PaginationLinks mo17830newInstance() {
            return new PaginationLinks();
        }

        public boolean parseField(PaginationLinks paginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("next")) {
                paginationLinks.next = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("nextTopic")) {
                return false;
            }
            paginationLinks.nextTopic = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PaginationLinks paginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("next") || str.equals("nextTopic")) {
                return true;
            }
            return super.parseFieldCheck(paginationLinks, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaginationLinks paginationLinks, JsonGenerator jsonGenerator) throws IOException {
            String str = paginationLinks.next;
            if (str != null) {
                jsonGenerator.writeStringField("next", str);
            }
            String str2 = paginationLinks.nextTopic;
            if (str2 != null) {
                jsonGenerator.writeStringField("nextTopic", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaginationLinks new_() {
        PaginationLinks paginationLinks = new PaginationLinks();
        paginationLinks.nullCheck();
        return paginationLinks;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PaginationLinks m19692clone() {
        PaginationLinks paginationLinks = new PaginationLinks();
        paginationLinks.next = this.next;
        paginationLinks.nextTopic = this.nextTopic;
        return paginationLinks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaginationLinks)) {
            return false;
        }
        PaginationLinks paginationLinks = (PaginationLinks) obj;
        return ValueObject.util_equals(this.next, paginationLinks.next) && ValueObject.util_equals(this.nextTopic, paginationLinks.nextTopic);
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
        String str = this.next;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.nextTopic;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.next == null) {
            this.next = "";
        }
        if (this.nextTopic == null) {
            this.nextTopic = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
