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
public class NewMatchLinks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchlinks";

    @NonNull
    @ProtobufIndex(index = 2)
    public String next;

    @NonNull
    @ProtobufIndex(index = 1)
    public String previous;
    public static ProtobufAdapter<NewMatchLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchLinks.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewMatchLinks newMatchLinks) {
            String str = newMatchLinks.previous;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = newMatchLinks.next;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            newMatchLinks.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewMatchLinks parse(nc5 nc5Var) throws IOException {
            NewMatchLinks newMatchLinks = new NewMatchLinks();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newMatchLinks.previous == null) {
                        newMatchLinks.previous = "";
                    }
                    if (newMatchLinks.next != null) {
                        break;
                    }
                    newMatchLinks.next = "";
                    break;
                }
                if (iM162497u == 10) {
                    newMatchLinks.previous = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (newMatchLinks.previous == null) {
                            newMatchLinks.previous = "";
                        }
                        if (newMatchLinks.next != null) {
                            break;
                        }
                        newMatchLinks.next = "";
                        return newMatchLinks;
                    }
                    newMatchLinks.next = nc5Var.m162495s();
                }
            }
            return newMatchLinks;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewMatchLinks newMatchLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newMatchLinks.previous;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = newMatchLinks.next;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<NewMatchLinks> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchLinks.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewMatchLinks.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewMatchLinks newInstance() {
            return new NewMatchLinks();
        }

        public boolean parseField(NewMatchLinks newMatchLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("previous")) {
                newMatchLinks.previous = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("next")) {
                return false;
            }
            newMatchLinks.next = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(NewMatchLinks newMatchLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("previous") || str.equals("next")) {
                return true;
            }
            return super.parseFieldCheck(newMatchLinks, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewMatchLinks newMatchLinks, JsonGenerator jsonGenerator) throws IOException {
            String str = newMatchLinks.previous;
            if (str != null) {
                jsonGenerator.writeStringField("previous", str);
            }
            String str2 = newMatchLinks.next;
            if (str2 != null) {
                jsonGenerator.writeStringField("next", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchLinks new_() {
        NewMatchLinks newMatchLinks = new NewMatchLinks();
        newMatchLinks.nullCheck();
        return newMatchLinks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewMatchLinks mo225055clone() {
        NewMatchLinks newMatchLinks = new NewMatchLinks();
        newMatchLinks.previous = this.previous;
        newMatchLinks.next = this.next;
        return newMatchLinks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMatchLinks)) {
            return false;
        }
        NewMatchLinks newMatchLinks = (NewMatchLinks) obj;
        return ValueObject.util_equals(this.previous, newMatchLinks.previous) && ValueObject.util_equals(this.next, newMatchLinks.next);
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
        String str = this.previous;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.next;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.previous == null) {
            this.previous = "";
        }
        if (this.next == null) {
            this.next = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
