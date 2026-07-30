package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class CouterMoments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coutermoments";

    @ProtobufIndex(index = 3)
    public int unreadFeeds;

    @ProtobufIndex(index = 4)
    public int unreadLikeFeeds;

    @ProtobufIndex(index = 2)
    public int unreadMomentComments;

    @ProtobufIndex(index = 1)
    public int unreadMomentLikes;
    public static ProtobufAdapter<CouterMoments> PROTOBUF_ADAPTER = new MessageNanoAdapter<CouterMoments>() { // from class: com.p1.mobile.putong.data.CouterMoments.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CouterMoments couterMoments) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, couterMoments.unreadMomentLikes) + CodedOutputByteBufferNano.m17226h(2, couterMoments.unreadMomentComments) + CodedOutputByteBufferNano.m17226h(3, couterMoments.unreadFeeds) + CodedOutputByteBufferNano.m17226h(4, couterMoments.unreadLikeFeeds);
            couterMoments.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CouterMoments parse(nb5 nb5Var) throws IOException {
            CouterMoments couterMoments = new CouterMoments();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    couterMoments.unreadMomentLikes = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    couterMoments.unreadMomentComments = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    couterMoments.unreadFeeds = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return couterMoments;
                    }
                    couterMoments.unreadLikeFeeds = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CouterMoments couterMoments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, couterMoments.unreadMomentLikes);
            codedOutputByteBufferNano.m17250G(2, couterMoments.unreadMomentComments);
            codedOutputByteBufferNano.m17250G(3, couterMoments.unreadFeeds);
            codedOutputByteBufferNano.m17250G(4, couterMoments.unreadLikeFeeds);
        }
    };
    public static JsonAdapter<CouterMoments> JSON_ADAPTER = new ObjectJsonAdapter<CouterMoments>() { // from class: com.p1.mobile.putong.data.CouterMoments.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CouterMoments.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CouterMoments newInstance() {
            return new CouterMoments();
        }

        public boolean parseField(CouterMoments couterMoments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unreadMomentComments":
                    couterMoments.unreadMomentComments = jsonParser.getValueAsInt();
                    return true;
                case "unreadLikeFeeds":
                    couterMoments.unreadLikeFeeds = jsonParser.getValueAsInt();
                    return true;
                case "unreadMomentLikes":
                    couterMoments.unreadMomentLikes = jsonParser.getValueAsInt();
                    return true;
                case "unreadFeeds":
                    couterMoments.unreadFeeds = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CouterMoments couterMoments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unreadMomentComments":
                case "unreadLikeFeeds":
                case "unreadMomentLikes":
                case "unreadFeeds":
                    return true;
                default:
                    return super.parseFieldCheck(couterMoments, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CouterMoments couterMoments, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadMomentLikes", couterMoments.unreadMomentLikes);
            jsonGenerator.writeNumberField("unreadMomentComments", couterMoments.unreadMomentComments);
            jsonGenerator.writeNumberField("unreadFeeds", couterMoments.unreadFeeds);
            jsonGenerator.writeNumberField("unreadLikeFeeds", couterMoments.unreadLikeFeeds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CouterMoments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CouterMoments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CouterMoments new_() {
        CouterMoments couterMoments = new CouterMoments();
        couterMoments.nullCheck();
        return couterMoments;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CouterMoments mo223809clone() {
        CouterMoments couterMoments = new CouterMoments();
        couterMoments.unreadMomentLikes = this.unreadMomentLikes;
        couterMoments.unreadMomentComments = this.unreadMomentComments;
        couterMoments.unreadFeeds = this.unreadFeeds;
        couterMoments.unreadLikeFeeds = this.unreadLikeFeeds;
        return couterMoments;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CouterMoments)) {
            return false;
        }
        CouterMoments couterMoments = (CouterMoments) obj;
        return this.unreadMomentLikes == couterMoments.unreadMomentLikes && this.unreadMomentComments == couterMoments.unreadMomentComments && this.unreadFeeds == couterMoments.unreadFeeds && this.unreadLikeFeeds == couterMoments.unreadLikeFeeds;
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
        int i2 = (((((((i * 41) + this.unreadMomentLikes) * 41) + this.unreadMomentComments) * 41) + this.unreadFeeds) * 41) + this.unreadLikeFeeds;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
