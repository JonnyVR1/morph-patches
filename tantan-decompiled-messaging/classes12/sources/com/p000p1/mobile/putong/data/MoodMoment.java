package com.p000p1.mobile.putong.data;

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
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MoodMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "moodmoment";
    public static ProtobufAdapter<MoodMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<MoodMoment>() { // from class: com.p1.mobile.putong.data.MoodMoment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MoodMoment m18498parse(nb5 nb5Var) throws IOException {
            MoodMoment moodMoment = new MoodMoment();
            nb5Var.u();
            return moodMoment;
        }

        public void serialize(MoodMoment moodMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        public int computeAndCacheSize(MoodMoment moodMoment) {
            ((MessageNano) moodMoment).cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<MoodMoment> JSON_ADAPTER = new ObjectJsonAdapter<MoodMoment>() { // from class: com.p1.mobile.putong.data.MoodMoment.2
        public Class getDataClass() {
            return MoodMoment.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MoodMoment mo17830newInstance() {
            return new MoodMoment();
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MoodMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public boolean parseFieldCheck(MoodMoment moodMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            Objects.requireNonNull(str);
            return super.parseFieldCheck(moodMoment, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MoodMoment moodMoment, JsonGenerator jsonGenerator) throws IOException {
        }

        public boolean parseField(MoodMoment moodMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            Objects.requireNonNull(str);
            return false;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MoodMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MoodMoment new_() {
        MoodMoment moodMoment = new MoodMoment();
        moodMoment.nullCheck();
        return moodMoment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MoodMoment m18497clone() {
        return new MoodMoment();
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof MoodMoment);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i == 0) {
            ((ValueObject) this).hashCode = i;
        }
        return i;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
