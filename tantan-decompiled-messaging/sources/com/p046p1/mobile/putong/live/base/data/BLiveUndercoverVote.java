package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUndercoverVote extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUndercoverVote> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUndercoverVote>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUndercoverVote.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUndercoverVote.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUndercoverVote newInstance() {
            return new BLiveUndercoverVote();
        }

        public boolean parseField(BLiveUndercoverVote bLiveUndercoverVote, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "number":
                    bLiveUndercoverVote.number = jsonParser.getValueAsInt();
                    return true;
                case "candidateMask":
                    bLiveUndercoverVote.candidateMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voterNumbers":
                    bLiveUndercoverVote.voterNumbers = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUndercoverVote bLiveUndercoverVote, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveUndercoverVote.candidateMask != null) {
                jsonGenerator.writeFieldName("candidateMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveUndercoverVote.candidateMask, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("number", bLiveUndercoverVote.number);
            if (bLiveUndercoverVote.voterNumbers != null) {
                jsonGenerator.writeFieldName("voterNumbers");
                JsonAdapter.serializeArray(bLiveUndercoverVote.voterNumbers, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUndercoverVote) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveundercovervote";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveUserMask candidateMask;

    @ProtobufIndex(index = 2)
    public int number;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> voterNumbers;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68292a(Integer num) {
        return num;
    }

    public static BLiveUndercoverVote new_() {
        BLiveUndercoverVote bLiveUndercoverVote = new BLiveUndercoverVote();
        bLiveUndercoverVote.nullCheck();
        return bLiveUndercoverVote;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUndercoverVote mo223809clone() {
        BLiveUndercoverVote bLiveUndercoverVote = new BLiveUndercoverVote();
        BLiveUserMask bLiveUserMask = this.candidateMask;
        if (bLiveUserMask != null) {
            bLiveUndercoverVote.candidateMask = bLiveUserMask.mo223809clone();
        }
        bLiveUndercoverVote.number = this.number;
        List<Integer> list = this.voterNumbers;
        if (list != null) {
            bLiveUndercoverVote.voterNumbers = ValueObject.util_map(list, new w9j() { // from class: l.f72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveUndercoverVote.m68292a((Integer) obj);
                }
            });
        }
        return bLiveUndercoverVote;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUndercoverVote)) {
            return false;
        }
        BLiveUndercoverVote bLiveUndercoverVote = (BLiveUndercoverVote) obj;
        return ValueObject.util_equals(this.candidateMask, bLiveUndercoverVote.candidateMask) && this.number == bLiveUndercoverVote.number && ValueObject.util_equals(this.voterNumbers, bLiveUndercoverVote.voterNumbers);
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
        BLiveUserMask bLiveUserMask = this.candidateMask;
        int iHashCode = (((i2 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41) + this.number) * 41;
        List<Integer> list = this.voterNumbers;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.candidateMask == null) {
            this.candidateMask = BLiveUserMask.new_();
        }
        if (this.voterNumbers == null) {
            this.voterNumbers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "BLiveUndercoverVote{candidateMask=" + this.candidateMask + ", number=" + this.number + ", voterNumbers=" + this.voterNumbers + '}';
    }
}
