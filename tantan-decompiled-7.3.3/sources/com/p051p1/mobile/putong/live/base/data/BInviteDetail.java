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
public class BInviteDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "binvitedetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<BInviteDetail> PROTOBUF_ADAPTER = new C11614a();
    public static JsonAdapter<BInviteDetail> JSON_ADAPTER = new ObjectJsonAdapter<BInviteDetail>() { // from class: com.p1.mobile.putong.live.base.data.BInviteDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BInviteDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BInviteDetail newInstance() {
            return new BInviteDetail();
        }

        public boolean parseField(BInviteDetail bInviteDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                bInviteDetail.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bInviteDetail.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BInviteDetail bInviteDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subTitle") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(bInviteDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BInviteDetail bInviteDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bInviteDetail.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bInviteDetail.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BInviteDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BInviteDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BInviteDetail$a */
    public class C11614a extends MessageNanoAdapter<BInviteDetail> {
        public C11614a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BInviteDetail bInviteDetail) {
            String str = bInviteDetail.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bInviteDetail.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            bInviteDetail.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BInviteDetail parse(nc5 nc5Var) throws IOException {
            BInviteDetail bInviteDetail = new BInviteDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bInviteDetail.title == null) {
                        bInviteDetail.title = "";
                    }
                    if (bInviteDetail.subTitle != null) {
                        break;
                    }
                    bInviteDetail.subTitle = "";
                    break;
                }
                if (iM162497u == 10) {
                    bInviteDetail.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (bInviteDetail.title == null) {
                            bInviteDetail.title = "";
                        }
                        if (bInviteDetail.subTitle != null) {
                            break;
                        }
                        bInviteDetail.subTitle = "";
                        return bInviteDetail;
                    }
                    bInviteDetail.subTitle = nc5Var.m162495s();
                }
            }
            return bInviteDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BInviteDetail bInviteDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bInviteDetail.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bInviteDetail.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    }

    public static BInviteDetail new_() {
        BInviteDetail bInviteDetail = new BInviteDetail();
        bInviteDetail.nullCheck();
        return bInviteDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BInviteDetail mo225055clone() {
        BInviteDetail bInviteDetail = new BInviteDetail();
        bInviteDetail.title = this.title;
        bInviteDetail.subTitle = this.subTitle;
        return bInviteDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BInviteDetail)) {
            return false;
        }
        BInviteDetail bInviteDetail = (BInviteDetail) obj;
        return ValueObject.util_equals(this.title, bInviteDetail.title) && ValueObject.util_equals(this.subTitle, bInviteDetail.subTitle);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
