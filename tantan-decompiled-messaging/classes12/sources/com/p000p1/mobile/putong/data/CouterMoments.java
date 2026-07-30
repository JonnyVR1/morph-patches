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
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CouterMoments couterMoments) {
            int iH = CodedOutputByteBufferNano.h(1, couterMoments.unreadMomentLikes) + CodedOutputByteBufferNano.h(2, couterMoments.unreadMomentComments) + CodedOutputByteBufferNano.h(3, couterMoments.unreadFeeds) + CodedOutputByteBufferNano.h(4, couterMoments.unreadLikeFeeds);
            ((MessageNano) couterMoments).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CouterMoments m17914parse(nb5 nb5Var) throws IOException {
            CouterMoments couterMoments = new CouterMoments();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    couterMoments.unreadMomentLikes = nb5Var.j();
                } else if (iU == 16) {
                    couterMoments.unreadMomentComments = nb5Var.j();
                } else if (iU == 24) {
                    couterMoments.unreadFeeds = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return couterMoments;
                    }
                    couterMoments.unreadLikeFeeds = nb5Var.j();
                }
            }
        }

        public void serialize(CouterMoments couterMoments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, couterMoments.unreadMomentLikes);
            codedOutputByteBufferNano.G(2, couterMoments.unreadMomentComments);
            codedOutputByteBufferNano.G(3, couterMoments.unreadFeeds);
            codedOutputByteBufferNano.G(4, couterMoments.unreadLikeFeeds);
        }
    };
    public static JsonAdapter<CouterMoments> JSON_ADAPTER = new ObjectJsonAdapter<CouterMoments>() { // from class: com.p1.mobile.putong.data.CouterMoments.2
        public Class getDataClass() {
            return CouterMoments.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CouterMoments mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CouterMoments couterMoments, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadMomentLikes", couterMoments.unreadMomentLikes);
            jsonGenerator.writeNumberField("unreadMomentComments", couterMoments.unreadMomentComments);
            jsonGenerator.writeNumberField("unreadFeeds", couterMoments.unreadFeeds);
            jsonGenerator.writeNumberField("unreadLikeFeeds", couterMoments.unreadLikeFeeds);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CouterMoments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CouterMoments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CouterMoments new_() {
        CouterMoments couterMoments = new CouterMoments();
        couterMoments.nullCheck();
        return couterMoments;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CouterMoments m17913clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.unreadMomentLikes) * 41) + this.unreadMomentComments) * 41) + this.unreadFeeds) * 41) + this.unreadLikeFeeds;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
