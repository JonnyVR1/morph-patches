package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserKnightInfoSummaryFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveuserknightinfosummaryframe";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44471id;
    public static ProtobufAdapter<BLiveUserKnightInfoSummaryFrame> PROTOBUF_ADAPTER = new C12198a();
    public static JsonAdapter<BLiveUserKnightInfoSummaryFrame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserKnightInfoSummaryFrame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummaryFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserKnightInfoSummaryFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserKnightInfoSummaryFrame newInstance() {
            return new BLiveUserKnightInfoSummaryFrame();
        }

        public boolean parseField(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            bLiveUserKnightInfoSummaryFrame.f44471id = jsonParser.getValueAsString();
            return false;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserKnightInfoSummaryFrame.f44471id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserKnightInfoSummaryFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummaryFrame$a */
    public class C12198a extends MessageNanoAdapter<BLiveUserKnightInfoSummaryFrame> {
        public C12198a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame) {
            String str = bLiveUserKnightInfoSummaryFrame.f44471id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            bLiveUserKnightInfoSummaryFrame.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveUserKnightInfoSummaryFrame parse(nb5 nb5Var) throws IOException {
            BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = new BLiveUserKnightInfoSummaryFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveUserKnightInfoSummaryFrame.f44471id != null) {
                        break;
                    }
                    bLiveUserKnightInfoSummaryFrame.f44471id = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (bLiveUserKnightInfoSummaryFrame.f44471id != null) {
                        break;
                    }
                    bLiveUserKnightInfoSummaryFrame.f44471id = "";
                    return bLiveUserKnightInfoSummaryFrame;
                }
                bLiveUserKnightInfoSummaryFrame.f44471id = nb5Var.m158750s();
            }
            return bLiveUserKnightInfoSummaryFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveUserKnightInfoSummaryFrame.f44471id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
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
    public BLiveUserKnightInfoSummaryFrame mo223809clone() {
        BLiveUserKnightInfoSummaryFrame bLiveUserKnightInfoSummaryFrame = new BLiveUserKnightInfoSummaryFrame();
        bLiveUserKnightInfoSummaryFrame.f44471id = this.f44471id;
        return bLiveUserKnightInfoSummaryFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveUserKnightInfoSummaryFrame) {
            return ValueObject.util_equals(this.f44471id, ((BLiveUserKnightInfoSummaryFrame) obj).f44471id);
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
        String str = this.f44471id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44471id == null) {
            this.f44471id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
