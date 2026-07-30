package com.p000p1.mobile.putong.data;

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
public class Banners extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "banners";

    @NonNull
    @ProtobufIndex(index = 3)
    public BannerAction action;

    @NonNull
    @ProtobufIndex(index = 4)
    public BannerContent content;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f185id;

    @NonNull
    @ProtobufIndex(index = 2)
    public BannerLoc loc;
    public static ProtobufAdapter<Banners> PROTOBUF_ADAPTER = new MessageNanoAdapter<Banners>() { // from class: com.p1.mobile.putong.data.Banners.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Banners banners) {
            int iH = CodedOutputByteBufferNano.h(1, banners.f185id);
            BannerLoc bannerLoc = banners.loc;
            if (bannerLoc != null) {
                iH += CodedOutputByteBufferNano.h(2, bannerLoc.ordinal());
            }
            BannerAction bannerAction = banners.action;
            if (bannerAction != null) {
                iH += CodedOutputByteBufferNano.l(3, bannerAction, BannerAction.PROTOBUF_ADAPTER);
            }
            BannerContent bannerContent = banners.content;
            if (bannerContent != null) {
                iH += CodedOutputByteBufferNano.l(4, bannerContent, BannerContent.PROTOBUF_ADAPTER);
            }
            BannerLoc bannerLoc2 = banners.loc;
            if (bannerLoc2 != null) {
                iH += CodedOutputByteBufferNano.l(5, bannerLoc2, BannerLoc.PROTOBUF_ADAPTER);
            }
            ((MessageNano) banners).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Banners m17769parse(nb5 nb5Var) throws IOException {
            Banners banners = new Banners();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (banners.loc == null && numValueOf != null) {
                        banners.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (banners.loc == null) {
                        banners.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.defaultEnum();
                    }
                    if (banners.action == null) {
                        banners.action = BannerAction.new_();
                    }
                    if (banners.content != null) {
                        break;
                    }
                    banners.content = BannerContent.new_();
                    break;
                }
                if (iU == 8) {
                    banners.f185id = nb5Var.j();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    banners.action = (BannerAction) nb5Var.l(BannerAction.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    banners.content = (BannerContent) nb5Var.l(BannerContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (banners.loc == null && numValueOf != null) {
                            banners.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (banners.loc == null) {
                            banners.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.defaultEnum();
                        }
                        if (banners.action == null) {
                            banners.action = BannerAction.new_();
                        }
                        if (banners.content != null) {
                            break;
                        }
                        banners.content = BannerContent.new_();
                        return banners;
                    }
                    banners.loc = (BannerLoc) nb5Var.l(BannerLoc.PROTOBUF_ADAPTER);
                }
            }
            return banners;
        }

        public void serialize(Banners banners, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, banners.f185id);
            BannerLoc bannerLoc = banners.loc;
            if (bannerLoc != null) {
                codedOutputByteBufferNano.G(2, bannerLoc.ordinal());
            }
            BannerAction bannerAction = banners.action;
            if (bannerAction != null) {
                codedOutputByteBufferNano.K(3, bannerAction, BannerAction.PROTOBUF_ADAPTER);
            }
            BannerContent bannerContent = banners.content;
            if (bannerContent != null) {
                codedOutputByteBufferNano.K(4, bannerContent, BannerContent.PROTOBUF_ADAPTER);
            }
            BannerLoc bannerLoc2 = banners.loc;
            if (bannerLoc2 != null) {
                codedOutputByteBufferNano.K(5, bannerLoc2, BannerLoc.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Banners> JSON_ADAPTER = new ObjectJsonAdapter<Banners>() { // from class: com.p1.mobile.putong.data.Banners.2
        public Class getDataClass() {
            return Banners.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Banners mo17830newInstance() {
            return new Banners();
        }

        public boolean parseField(Banners banners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    banners.action = (BannerAction) BannerAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    banners.f185id = jsonParser.getValueAsInt();
                    return false;
                case "loc":
                    banners.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "content":
                    banners.content = (BannerContent) BannerContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Banners banners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                    return true;
                case "id":
                    return false;
                case "loc":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(banners, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Banners banners, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", banners.f185id);
            if (banners.loc != null) {
                jsonGenerator.writeFieldName("loc");
                BannerLoc.JSON_ADAPTER.serialize(banners.loc, jsonGenerator, true);
            }
            if (banners.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
                BannerAction.JSON_ADAPTER.serialize(banners.action, jsonGenerator, true);
            }
            if (banners.content != null) {
                jsonGenerator.writeFieldName("content");
                BannerContent.JSON_ADAPTER.serialize(banners.content, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Banners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Banners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Banners new_() {
        Banners banners = new Banners();
        banners.nullCheck();
        return banners;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Banners m17768clone() {
        Banners banners = new Banners();
        banners.f185id = this.f185id;
        banners.loc = this.loc;
        BannerAction bannerAction = this.action;
        if (bannerAction != null) {
            banners.action = bannerAction.m17744clone();
        }
        BannerContent bannerContent = this.content;
        if (bannerContent != null) {
            banners.content = bannerContent.m17747clone();
        }
        return banners;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Banners)) {
            return false;
        }
        Banners banners = (Banners) obj;
        return this.f185id == banners.f185id && ValueObject.util_equals(this.loc, banners.loc) && ValueObject.util_equals(this.action, banners.action) && ValueObject.util_equals(this.content, banners.content);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f185id) * 41;
        BannerLoc bannerLoc = this.loc;
        int iHashCode = (i2 + (bannerLoc != null ? bannerLoc.hashCode() : 0)) * 41;
        BannerAction bannerAction = this.action;
        int iHashCode2 = (iHashCode + (bannerAction != null ? bannerAction.hashCode() : 0)) * 41;
        BannerContent bannerContent = this.content;
        int iHashCode3 = iHashCode2 + (bannerContent != null ? bannerContent.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.loc == null) {
            this.loc = (BannerLoc) BannerLoc.JSON_ADAPTER.defaultEnum();
        }
        if (this.action == null) {
            this.action = BannerAction.new_();
        }
        if (this.content == null) {
            this.content = BannerContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
