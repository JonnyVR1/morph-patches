package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSuperGodDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuperGodDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuperGodDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuperGodDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuperGodDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuperGodDetail newInstance() {
            return new BLiveSuperGodDetail();
        }

        public boolean parseField(BLiveSuperGodDetail bLiveSuperGodDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userImage":
                    bLiveSuperGodDetail.userImage = jsonParser.getValueAsString();
                    return true;
                case "rulePage":
                    bLiveSuperGodDetail.rulePage = jsonParser.getValueAsString();
                    return true;
                case "birthday":
                    bLiveSuperGodDetail.birthday = jsonParser.getValueAsString();
                    return true;
                case "rewards":
                    bLiveSuperGodDetail.rewards = JsonAdapter.parseArray(jsonParser, BLiveSuperGodReward.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuperGodDetail bLiveSuperGodDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuperGodDetail.birthday;
            if (str != null) {
                jsonGenerator.writeStringField("birthday", str);
            }
            String str2 = bLiveSuperGodDetail.userImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("userImage", str2);
            }
            String str3 = bLiveSuperGodDetail.rulePage;
            if (str3 != null) {
                jsonGenerator.writeStringField("rulePage", str3);
            }
            if (bLiveSuperGodDetail.rewards != null) {
                jsonGenerator.writeFieldName("rewards");
                JsonAdapter.serializeArray(bLiveSuperGodDetail.rewards, jsonGenerator, BLiveSuperGodReward.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuperGodDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesupergoddetail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String birthday;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveSuperGodReward> rewards;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rulePage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userImage;

    public static BLiveSuperGodDetail new_() {
        BLiveSuperGodDetail bLiveSuperGodDetail = new BLiveSuperGodDetail();
        bLiveSuperGodDetail.nullCheck();
        return bLiveSuperGodDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuperGodDetail mo225055clone() {
        BLiveSuperGodDetail bLiveSuperGodDetail = new BLiveSuperGodDetail();
        bLiveSuperGodDetail.birthday = this.birthday;
        bLiveSuperGodDetail.userImage = this.userImage;
        bLiveSuperGodDetail.rulePage = this.rulePage;
        List<BLiveSuperGodReward> list = this.rewards;
        if (list != null) {
            bLiveSuperGodDetail.rewards = ValueObject.util_map(list, new qcj() { // from class: l.u62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuperGodReward) obj).mo225055clone();
                }
            });
        }
        return bLiveSuperGodDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuperGodDetail)) {
            return false;
        }
        BLiveSuperGodDetail bLiveSuperGodDetail = (BLiveSuperGodDetail) obj;
        return ValueObject.util_equals(this.birthday, bLiveSuperGodDetail.birthday) && ValueObject.util_equals(this.userImage, bLiveSuperGodDetail.userImage) && ValueObject.util_equals(this.rulePage, bLiveSuperGodDetail.rulePage) && ValueObject.util_equals(this.rewards, bLiveSuperGodDetail.rewards);
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
        String str = this.birthday;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userImage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rulePage;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveSuperGodReward> list = this.rewards;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.birthday == null) {
            this.birthday = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.rulePage == null) {
            this.rulePage = "";
        }
        if (this.rewards == null) {
            this.rewards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
