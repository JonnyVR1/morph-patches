package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
    public int f39572id;

    @NonNull
    @ProtobufIndex(index = 2)
    public BannerLoc loc;
    public static ProtobufAdapter<Banners> PROTOBUF_ADAPTER = new MessageNanoAdapter<Banners>() { // from class: com.p1.mobile.putong.data.Banners.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Banners banners) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, banners.f39572id);
            BannerLoc bannerLoc = banners.loc;
            if (bannerLoc != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(2, bannerLoc.ordinal());
            }
            BannerAction bannerAction = banners.action;
            if (bannerAction != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, bannerAction, BannerAction.PROTOBUF_ADAPTER);
            }
            BannerContent bannerContent = banners.content;
            if (bannerContent != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, bannerContent, BannerContent.PROTOBUF_ADAPTER);
            }
            BannerLoc bannerLoc2 = banners.loc;
            if (bannerLoc2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, bannerLoc2, BannerLoc.PROTOBUF_ADAPTER);
            }
            banners.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Banners parse(nc5 nc5Var) throws IOException {
            Banners banners = new Banners();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    banners.f39572id = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    banners.action = (BannerAction) nc5Var.m162488l(BannerAction.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    banners.content = (BannerContent) nc5Var.m162488l(BannerContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
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
                    banners.loc = (BannerLoc) nc5Var.m162488l(BannerLoc.PROTOBUF_ADAPTER);
                }
            }
            return banners;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Banners banners, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, banners.f39572id);
            BannerLoc bannerLoc = banners.loc;
            if (bannerLoc != null) {
                codedOutputByteBufferNano.m17305G(2, bannerLoc.ordinal());
            }
            BannerAction bannerAction = banners.action;
            if (bannerAction != null) {
                codedOutputByteBufferNano.m17309K(3, bannerAction, BannerAction.PROTOBUF_ADAPTER);
            }
            BannerContent bannerContent = banners.content;
            if (bannerContent != null) {
                codedOutputByteBufferNano.m17309K(4, bannerContent, BannerContent.PROTOBUF_ADAPTER);
            }
            BannerLoc bannerLoc2 = banners.loc;
            if (bannerLoc2 != null) {
                codedOutputByteBufferNano.m17309K(5, bannerLoc2, BannerLoc.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Banners> JSON_ADAPTER = new ObjectJsonAdapter<Banners>() { // from class: com.p1.mobile.putong.data.Banners.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Banners.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Banners newInstance() {
            return new Banners();
        }

        public boolean parseField(Banners banners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    banners.action = BannerAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    banners.f39572id = jsonParser.getValueAsInt();
                    return false;
                case "loc":
                    banners.loc = BannerLoc.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "content":
                    banners.content = BannerContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Banners banners, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", banners.f39572id);
            if (banners.loc != null) {
                jsonGenerator.writeFieldName("loc");
                BannerLoc.JSON_ADAPTER.serialize(banners.loc, jsonGenerator, true);
            }
            if (banners.action != null) {
                jsonGenerator.writeFieldName("action");
                BannerAction.JSON_ADAPTER.serialize(banners.action, jsonGenerator, true);
            }
            if (banners.content != null) {
                jsonGenerator.writeFieldName("content");
                BannerContent.JSON_ADAPTER.serialize(banners.content, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Banners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Banners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Banners new_() {
        Banners banners = new Banners();
        banners.nullCheck();
        return banners;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Banners mo225055clone() {
        Banners banners = new Banners();
        banners.f39572id = this.f39572id;
        banners.loc = this.loc;
        BannerAction bannerAction = this.action;
        if (bannerAction != null) {
            banners.action = bannerAction.mo225055clone();
        }
        BannerContent bannerContent = this.content;
        if (bannerContent != null) {
            banners.content = bannerContent.mo225055clone();
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
        return this.f39572id == banners.f39572id && ValueObject.util_equals(this.loc, banners.loc) && ValueObject.util_equals(this.action, banners.action) && ValueObject.util_equals(this.content, banners.content);
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
        int i2 = ((i * 41) + this.f39572id) * 41;
        BannerLoc bannerLoc = this.loc;
        int iHashCode = (i2 + (bannerLoc != null ? bannerLoc.hashCode() : 0)) * 41;
        BannerAction bannerAction = this.action;
        int iHashCode2 = (iHashCode + (bannerAction != null ? bannerAction.hashCode() : 0)) * 41;
        BannerContent bannerContent = this.content;
        int iHashCode3 = iHashCode2 + (bannerContent != null ? bannerContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
