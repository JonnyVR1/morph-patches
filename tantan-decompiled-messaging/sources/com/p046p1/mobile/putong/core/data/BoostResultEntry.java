package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class BoostResultEntry extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostresultentry";

    @Nullable
    @ProtobufIndex(index = 1)
    public String avatar;

    @Nullable
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<BoostResultEntry> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostResultEntry>() { // from class: com.p1.mobile.putong.core.data.BoostResultEntry.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostResultEntry boostResultEntry) {
            String str = boostResultEntry.avatar;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            boostResultEntry.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostResultEntry parse(nb5 nb5Var) throws IOException {
            BoostResultEntry boostResultEntry = new BoostResultEntry();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    boostResultEntry.avatar = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        return boostResultEntry;
                    }
                    boostResultEntry.text = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostResultEntry boostResultEntry, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostResultEntry.avatar;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<BoostResultEntry> JSON_ADAPTER = new ObjectJsonAdapter<BoostResultEntry>() { // from class: com.p1.mobile.putong.core.data.BoostResultEntry.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostResultEntry.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostResultEntry newInstance() {
            return new BoostResultEntry();
        }

        public boolean parseField(BoostResultEntry boostResultEntry, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatar")) {
                boostResultEntry.avatar = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            boostResultEntry.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BoostResultEntry boostResultEntry, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatar") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(boostResultEntry, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostResultEntry boostResultEntry, JsonGenerator jsonGenerator) throws IOException {
            String str = boostResultEntry.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostResultEntry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostResultEntry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostResultEntry new_() {
        BoostResultEntry boostResultEntry = new BoostResultEntry();
        boostResultEntry.nullCheck();
        return boostResultEntry;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostResultEntry mo223809clone() {
        BoostResultEntry boostResultEntry = new BoostResultEntry();
        boostResultEntry.avatar = this.avatar;
        boostResultEntry.text = this.text;
        return boostResultEntry;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostResultEntry)) {
            return false;
        }
        BoostResultEntry boostResultEntry = (BoostResultEntry) obj;
        return ValueObject.util_equals(this.avatar, boostResultEntry.avatar) && ValueObject.util_equals(this.text, boostResultEntry.text);
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
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
