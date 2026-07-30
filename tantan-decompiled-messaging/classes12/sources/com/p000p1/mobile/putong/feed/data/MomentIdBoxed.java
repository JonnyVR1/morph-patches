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
public class MomentIdBoxed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentidboxed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f693id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MomentIdBoxed> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentIdBoxed>() { // from class: com.p1.mobile.putong.feed.data.MomentIdBoxed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentIdBoxed momentIdBoxed) {
            String str = momentIdBoxed.f693id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) momentIdBoxed).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentIdBoxed m19620parse(nb5 nb5Var) throws IOException {
            MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentIdBoxed.f693id == null) {
                        momentIdBoxed.f693id = "";
                    }
                    if (momentIdBoxed.type != null) {
                        break;
                    }
                    momentIdBoxed.type = "";
                    break;
                }
                if (iU == 10) {
                    momentIdBoxed.f693id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (momentIdBoxed.f693id == null) {
                            momentIdBoxed.f693id = "";
                        }
                        if (momentIdBoxed.type != null) {
                            break;
                        }
                        momentIdBoxed.type = "";
                        return momentIdBoxed;
                    }
                    momentIdBoxed.type = nb5Var.s();
                }
            }
            return momentIdBoxed;
        }

        public void serialize(MomentIdBoxed momentIdBoxed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentIdBoxed.f693id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentIdBoxed> JSON_ADAPTER = new ObjectJsonAdapter<MomentIdBoxed>() { // from class: com.p1.mobile.putong.feed.data.MomentIdBoxed.2
        public Class getDataClass() {
            return MomentIdBoxed.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentIdBoxed mo17830newInstance() {
            return new MomentIdBoxed();
        }

        public boolean parseField(MomentIdBoxed momentIdBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                momentIdBoxed.f693id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            momentIdBoxed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentIdBoxed momentIdBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(momentIdBoxed, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentIdBoxed momentIdBoxed, JsonGenerator jsonGenerator) throws IOException {
            String str = momentIdBoxed.f693id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentIdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentIdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentIdBoxed new_() {
        MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
        momentIdBoxed.nullCheck();
        return momentIdBoxed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentIdBoxed m19619clone() {
        MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
        momentIdBoxed.f693id = this.f693id;
        momentIdBoxed.type = this.type;
        return momentIdBoxed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentIdBoxed)) {
            return false;
        }
        MomentIdBoxed momentIdBoxed = (MomentIdBoxed) obj;
        return ValueObject.util_equals(this.f693id, momentIdBoxed.f693id) && ValueObject.util_equals(this.type, momentIdBoxed.type);
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
        String str = this.f693id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f693id == null) {
            this.f693id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
