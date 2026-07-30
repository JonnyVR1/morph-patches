package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class NewMatchPaginationLinks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchpaginationlinks";

    @NonNull
    @ProtobufIndex(index = 1)
    public NewMatchLinks links;
    public static ProtobufAdapter<NewMatchPaginationLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchPaginationLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchPaginationLinks.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewMatchPaginationLinks newMatchPaginationLinks) {
            NewMatchLinks newMatchLinks = newMatchPaginationLinks.links;
            int iM17285l = newMatchLinks != null ? CodedOutputByteBufferNano.m17285l(1, newMatchLinks, NewMatchLinks.PROTOBUF_ADAPTER) : 0;
            newMatchPaginationLinks.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewMatchPaginationLinks parse(nc5 nc5Var) throws IOException {
            NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newMatchPaginationLinks.links != null) {
                        break;
                    }
                    newMatchPaginationLinks.links = NewMatchLinks.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (newMatchPaginationLinks.links != null) {
                        break;
                    }
                    newMatchPaginationLinks.links = NewMatchLinks.new_();
                    return newMatchPaginationLinks;
                }
                newMatchPaginationLinks.links = (NewMatchLinks) nc5Var.m162488l(NewMatchLinks.PROTOBUF_ADAPTER);
            }
            return newMatchPaginationLinks;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewMatchPaginationLinks newMatchPaginationLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NewMatchLinks newMatchLinks = newMatchPaginationLinks.links;
            if (newMatchLinks != null) {
                codedOutputByteBufferNano.m17309K(1, newMatchLinks, NewMatchLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewMatchPaginationLinks> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchPaginationLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchPaginationLinks.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewMatchPaginationLinks.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewMatchPaginationLinks newInstance() {
            return new NewMatchPaginationLinks();
        }

        public boolean parseField(NewMatchPaginationLinks newMatchPaginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("links")) {
                return false;
            }
            newMatchPaginationLinks.links = NewMatchLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewMatchPaginationLinks newMatchPaginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("links")) {
                return true;
            }
            return super.parseFieldCheck(newMatchPaginationLinks, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewMatchPaginationLinks newMatchPaginationLinks, JsonGenerator jsonGenerator) throws IOException {
            if (newMatchPaginationLinks.links != null) {
                jsonGenerator.writeFieldName("links");
                NewMatchLinks.JSON_ADAPTER.serialize(newMatchPaginationLinks.links, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchPaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchPaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchPaginationLinks new_() {
        NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
        newMatchPaginationLinks.nullCheck();
        return newMatchPaginationLinks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewMatchPaginationLinks mo225055clone() {
        NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
        NewMatchLinks newMatchLinks = this.links;
        if (newMatchLinks != null) {
            newMatchPaginationLinks.links = newMatchLinks.mo225055clone();
        }
        return newMatchPaginationLinks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NewMatchPaginationLinks) {
            return ValueObject.util_equals(this.links, ((NewMatchPaginationLinks) obj).links);
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
        NewMatchLinks newMatchLinks = this.links;
        int iHashCode = i2 + (newMatchLinks != null ? newMatchLinks.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.links == null) {
            this.links = NewMatchLinks.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
