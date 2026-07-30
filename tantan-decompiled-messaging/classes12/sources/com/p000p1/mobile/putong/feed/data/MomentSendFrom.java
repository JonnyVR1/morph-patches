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
public class MomentSendFrom extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsendfrom";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f695id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String sourceType;
    public static ProtobufAdapter<MomentSendFrom> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentSendFrom>() { // from class: com.p1.mobile.putong.feed.data.MomentSendFrom.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentSendFrom momentSendFrom) {
            String str = momentSendFrom.f695id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) momentSendFrom).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentSendFrom m19642parse(nb5 nb5Var) throws IOException {
            MomentSendFrom momentSendFrom = new MomentSendFrom();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentSendFrom.f695id == null) {
                        momentSendFrom.f695id = "";
                    }
                    if (momentSendFrom.name == null) {
                        momentSendFrom.name = "";
                    }
                    if (momentSendFrom.sourceType != null) {
                        break;
                    }
                    momentSendFrom.sourceType = "";
                    break;
                }
                if (iU == 10) {
                    momentSendFrom.f695id = nb5Var.s();
                } else if (iU == 18) {
                    momentSendFrom.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (momentSendFrom.f695id == null) {
                            momentSendFrom.f695id = "";
                        }
                        if (momentSendFrom.name == null) {
                            momentSendFrom.name = "";
                        }
                        if (momentSendFrom.sourceType != null) {
                            break;
                        }
                        momentSendFrom.sourceType = "";
                        return momentSendFrom;
                    }
                    momentSendFrom.sourceType = nb5Var.s();
                }
            }
            return momentSendFrom;
        }

        public void serialize(MomentSendFrom momentSendFrom, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentSendFrom.f695id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<MomentSendFrom> JSON_ADAPTER = new ObjectJsonAdapter<MomentSendFrom>() { // from class: com.p1.mobile.putong.feed.data.MomentSendFrom.2
        public Class getDataClass() {
            return MomentSendFrom.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentSendFrom mo17830newInstance() {
            return new MomentSendFrom();
        }

        public boolean parseField(MomentSendFrom momentSendFrom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sourceType":
                    momentSendFrom.sourceType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    momentSendFrom.f695id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    momentSendFrom.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentSendFrom momentSendFrom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sourceType":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(momentSendFrom, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentSendFrom momentSendFrom, JsonGenerator jsonGenerator) throws IOException {
            String str = momentSendFrom.f695id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentSendFrom.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = momentSendFrom.sourceType;
            if (str3 != null) {
                jsonGenerator.writeStringField("sourceType", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSendFrom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSendFrom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSendFrom new_() {
        MomentSendFrom momentSendFrom = new MomentSendFrom();
        momentSendFrom.nullCheck();
        return momentSendFrom;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentSendFrom m19641clone() {
        MomentSendFrom momentSendFrom = new MomentSendFrom();
        momentSendFrom.f695id = this.f695id;
        momentSendFrom.name = this.name;
        momentSendFrom.sourceType = this.sourceType;
        return momentSendFrom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentSendFrom)) {
            return false;
        }
        MomentSendFrom momentSendFrom = (MomentSendFrom) obj;
        return ValueObject.util_equals(this.f695id, momentSendFrom.f695id) && ValueObject.util_equals(this.name, momentSendFrom.name) && ValueObject.util_equals(this.sourceType, momentSendFrom.sourceType);
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
        String str = this.f695id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.sourceType;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f695id == null) {
            this.f695id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
