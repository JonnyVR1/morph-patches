package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewMatchLinks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchlinks";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String next;

    @NonNull
    @ProtobufIndex(index = 1)
    public String previous;
    public static ProtobufAdapter<NewMatchLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchLinks.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewMatchLinks newMatchLinks) {
            String str = newMatchLinks.previous;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newMatchLinks.next;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) newMatchLinks).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewMatchLinks m14519parse(nb5 nb5Var) throws IOException {
            NewMatchLinks newMatchLinks = new NewMatchLinks();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newMatchLinks.previous == null) {
                        newMatchLinks.previous = "";
                    }
                    if (newMatchLinks.next != null) {
                        break;
                    }
                    newMatchLinks.next = "";
                    break;
                }
                if (iU == 10) {
                    newMatchLinks.previous = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (newMatchLinks.previous == null) {
                            newMatchLinks.previous = "";
                        }
                        if (newMatchLinks.next != null) {
                            break;
                        }
                        newMatchLinks.next = "";
                        return newMatchLinks;
                    }
                    newMatchLinks.next = nb5Var.s();
                }
            }
            return newMatchLinks;
        }

        public void serialize(NewMatchLinks newMatchLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newMatchLinks.previous;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newMatchLinks.next;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<NewMatchLinks> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchLinks.2
        public Class getDataClass() {
            return NewMatchLinks.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewMatchLinks m14520newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchLinks new_() {
        NewMatchLinks newMatchLinks = new NewMatchLinks();
        newMatchLinks.nullCheck();
        return newMatchLinks;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewMatchLinks m14518clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.previous;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.next;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.previous == null) {
            this.previous = "";
        }
        if (this.next == null) {
            this.next = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
