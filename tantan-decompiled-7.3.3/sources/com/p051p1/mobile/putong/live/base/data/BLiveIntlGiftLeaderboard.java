package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
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
public class BLiveIntlGiftLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlGiftLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlGiftLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlGiftLeaderboard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlGiftLeaderboard newInstance() {
            return new BLiveIntlGiftLeaderboard();
        }

        public boolean parseField(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "config":
                    bLiveIntlGiftLeaderboard.config = BLiveIntlGiftLeaderboardConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jumpUrl":
                    bLiveIntlGiftLeaderboard.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "open":
                    bLiveIntlGiftLeaderboard.open = jsonParser.getValueAsBoolean();
                    return true;
                case "current":
                    bLiveIntlGiftLeaderboard.current = JsonAdapter.parseArray(jsonParser, BLiveIntlGiftStarInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "homeStretch":
                    bLiveIntlGiftLeaderboard.homeStretch = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", bLiveIntlGiftLeaderboard.open);
            jsonGenerator.writeBooleanField("homeStretch", bLiveIntlGiftLeaderboard.homeStretch);
            String str = bLiveIntlGiftLeaderboard.jumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("jumpUrl", str);
            }
            if (bLiveIntlGiftLeaderboard.config != null) {
                jsonGenerator.writeFieldName(Constants.KEY_CONFIG);
                BLiveIntlGiftLeaderboardConfig.JSON_ADAPTER.serialize(bLiveIntlGiftLeaderboard.config, jsonGenerator, true);
            }
            if (bLiveIntlGiftLeaderboard.current != null) {
                jsonGenerator.writeFieldName("current");
                JsonAdapter.serializeArray(bLiveIntlGiftLeaderboard.current, jsonGenerator, BLiveIntlGiftStarInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlGiftLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlgiftleaderboard";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveIntlGiftLeaderboardConfig config;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveIntlGiftStarInfo> current;

    @ProtobufIndex(index = 2)
    public boolean homeStretch;

    @NonNull
    @ProtobufIndex(index = 5)
    public String jumpUrl;

    @ProtobufIndex(index = 1)
    public boolean open;

    public static BLiveIntlGiftLeaderboard new_() {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard = new BLiveIntlGiftLeaderboard();
        bLiveIntlGiftLeaderboard.nullCheck();
        return bLiveIntlGiftLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlGiftLeaderboard mo225055clone() {
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard = new BLiveIntlGiftLeaderboard();
        bLiveIntlGiftLeaderboard.open = this.open;
        bLiveIntlGiftLeaderboard.homeStretch = this.homeStretch;
        bLiveIntlGiftLeaderboard.jumpUrl = this.jumpUrl;
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig = this.config;
        if (bLiveIntlGiftLeaderboardConfig != null) {
            bLiveIntlGiftLeaderboard.config = bLiveIntlGiftLeaderboardConfig.mo225055clone();
        }
        List<BLiveIntlGiftStarInfo> list = this.current;
        if (list != null) {
            bLiveIntlGiftLeaderboard.current = ValueObject.util_map(list, new qcj() { // from class: l.v12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveIntlGiftStarInfo) obj).mo225055clone();
                }
            });
        }
        return bLiveIntlGiftLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlGiftLeaderboard)) {
            return false;
        }
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard = (BLiveIntlGiftLeaderboard) obj;
        return this.open == bLiveIntlGiftLeaderboard.open && this.homeStretch == bLiveIntlGiftLeaderboard.homeStretch && ValueObject.util_equals(this.jumpUrl, bLiveIntlGiftLeaderboard.jumpUrl) && ValueObject.util_equals(this.config, bLiveIntlGiftLeaderboard.config) && ValueObject.util_equals(this.current, bLiveIntlGiftLeaderboard.current);
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
        int i2 = ((((i * 41) + (this.open ? 1231 : 1237)) * 41) + (this.homeStretch ? 1231 : 1237)) * 41;
        String str = this.jumpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveIntlGiftLeaderboardConfig bLiveIntlGiftLeaderboardConfig = this.config;
        int iHashCode2 = (iHashCode + (bLiveIntlGiftLeaderboardConfig != null ? bLiveIntlGiftLeaderboardConfig.hashCode() : 0)) * 41;
        List<BLiveIntlGiftStarInfo> list = this.current;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
        if (this.config == null) {
            this.config = BLiveIntlGiftLeaderboardConfig.new_();
        }
        if (this.current == null) {
            this.current = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
