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
public class AtUserIdBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "atuseridbox";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f675id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<AtUserIdBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<AtUserIdBox>() { // from class: com.p1.mobile.putong.feed.data.AtUserIdBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AtUserIdBox atUserIdBox) {
            String str = atUserIdBox.f675id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) atUserIdBox).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AtUserIdBox m19413parse(nb5 nb5Var) throws IOException {
            AtUserIdBox atUserIdBox = new AtUserIdBox();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (atUserIdBox.f675id == null) {
                        atUserIdBox.f675id = "";
                    }
                    if (atUserIdBox.name != null) {
                        break;
                    }
                    atUserIdBox.name = "";
                    break;
                }
                if (iU == 10) {
                    atUserIdBox.f675id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (atUserIdBox.f675id == null) {
                            atUserIdBox.f675id = "";
                        }
                        if (atUserIdBox.name != null) {
                            break;
                        }
                        atUserIdBox.name = "";
                        return atUserIdBox;
                    }
                    atUserIdBox.name = nb5Var.s();
                }
            }
            return atUserIdBox;
        }

        public void serialize(AtUserIdBox atUserIdBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = atUserIdBox.f675id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AtUserIdBox> JSON_ADAPTER = new ObjectJsonAdapter<AtUserIdBox>() { // from class: com.p1.mobile.putong.feed.data.AtUserIdBox.2
        public Class getDataClass() {
            return AtUserIdBox.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AtUserIdBox mo17830newInstance() {
            return new AtUserIdBox();
        }

        public boolean parseField(AtUserIdBox atUserIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                atUserIdBox.f675id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("name")) {
                return false;
            }
            atUserIdBox.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AtUserIdBox atUserIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(atUserIdBox, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AtUserIdBox atUserIdBox, JsonGenerator jsonGenerator) throws IOException {
            String str = atUserIdBox.f675id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = atUserIdBox.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AtUserIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AtUserIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AtUserIdBox new_() {
        AtUserIdBox atUserIdBox = new AtUserIdBox();
        atUserIdBox.nullCheck();
        return atUserIdBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AtUserIdBox m19412clone() {
        AtUserIdBox atUserIdBox = new AtUserIdBox();
        atUserIdBox.f675id = this.f675id;
        atUserIdBox.name = this.name;
        return atUserIdBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtUserIdBox)) {
            return false;
        }
        AtUserIdBox atUserIdBox = (AtUserIdBox) obj;
        return ValueObject.util_equals(this.f675id, atUserIdBox.f675id) && ValueObject.util_equals(this.name, atUserIdBox.name);
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
        String str = this.f675id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f675id == null) {
            this.f675id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
