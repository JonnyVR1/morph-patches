package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class BoostResultEntry extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostresultentry";

    @Nullable
    @ProtobufIndex(index = 1)
    public String avatar;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<BoostResultEntry> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostResultEntry>() { // from class: com.p1.mobile.putong.core.data.BoostResultEntry.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostResultEntry boostResultEntry) {
            String str = boostResultEntry.avatar;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) boostResultEntry).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostResultEntry m11799parse(nb5 nb5Var) throws IOException {
            BoostResultEntry boostResultEntry = new BoostResultEntry();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    boostResultEntry.avatar = nb5Var.s();
                } else {
                    if (iU != 18) {
                        return boostResultEntry;
                    }
                    boostResultEntry.text = nb5Var.s();
                }
            }
        }

        public void serialize(BoostResultEntry boostResultEntry, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostResultEntry.avatar;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<BoostResultEntry> JSON_ADAPTER = new ObjectJsonAdapter<BoostResultEntry>() { // from class: com.p1.mobile.putong.core.data.BoostResultEntry.2
        public Class getDataClass() {
            return BoostResultEntry.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostResultEntry m11800newInstance() {
            return new BoostResultEntry();
        }

        public boolean parseField(BoostResultEntry boostResultEntry, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(ReminderAction.avatar)) {
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
            if (str.equals(ReminderAction.avatar) || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(boostResultEntry, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostResultEntry boostResultEntry, JsonGenerator jsonGenerator) throws IOException {
            String str = boostResultEntry.avatar;
            if (str != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str);
            }
            String str2 = boostResultEntry.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostResultEntry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostResultEntry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostResultEntry new_() {
        BoostResultEntry boostResultEntry = new BoostResultEntry();
        boostResultEntry.nullCheck();
        return boostResultEntry;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostResultEntry m11798clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
