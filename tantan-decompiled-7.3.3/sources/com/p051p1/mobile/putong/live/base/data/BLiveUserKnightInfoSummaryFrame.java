package com.p051p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserKnightInfoSummaryFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveuserknightinfosummaryframe";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45319id;
    public static ProtobufAdapter<BLiveUserKnightInfoSummaryFrame> PROTOBUF_ADAPTER = new C12361a();
    public static JsonAdapter<BLiveUserKnightInfoSummaryFrame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserKnightInfoSummaryFrame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummaryFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserKnightInfoSummaryFrame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserKnightInfoSummaryFrame newInstance() {
            return new BLiveUserKnightInfoSummaryFrame();
        }

        public boolean parseField(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            bLiveUserKnightInfoSummaryFrame.f45319id = jsonParser.getValueAsString();
            return false;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserKnightInfoSummaryFrame.f45319id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserKnightInfoSummaryFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummaryFrame$a */
    public class C12361a extends MessageNanoAdapter<BLiveUserKnightInfoSummaryFrame> {
        public C12361a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame) {
            String str = bLiveUserKnightInfoSummaryFrame.f45319id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            bLiveUserKnightInfoSummaryFrame.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveUserKnightInfoSummaryFrame parse(nc5 nc5Var) throws IOException {
            BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = new BLiveUserKnightInfoSummaryFrame();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveUserKnightInfoSummaryFrame.f45319id != null) {
                        break;
                    }
                    bLiveUserKnightInfoSummaryFrame.f45319id = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (bLiveUserKnightInfoSummaryFrame.f45319id != null) {
                        break;
                    }
                    bLiveUserKnightInfoSummaryFrame.f45319id = "";
                    return bLiveUserKnightInfoSummaryFrame;
                }
                bLiveUserKnightInfoSummaryFrame.f45319id = nc5Var.m162495s();
            }
            return bLiveUserKnightInfoSummaryFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveUserKnightInfoSummaryFrame.f45319id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    }

    public static BLiveUserKnightInfoSummaryFrame new_() {
        BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = new BLiveUserKnightInfoSummaryFrame();
        bLiveUserKnightInfoSummaryFrame.nullCheck();
        return bLiveUserKnightInfoSummaryFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserKnightInfoSummaryFrame mo225055clone() {
        BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = new BLiveUserKnightInfoSummaryFrame();
        bLiveUserKnightInfoSummaryFrame.f45319id = this.f45319id;
        return bLiveUserKnightInfoSummaryFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveUserKnightInfoSummaryFrame) {
            return ValueObject.util_equals(this.f45319id, ((BLiveUserKnightInfoSummaryFrame) obj).f45319id);
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
        String str = this.f45319id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45319id == null) {
            this.f45319id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
