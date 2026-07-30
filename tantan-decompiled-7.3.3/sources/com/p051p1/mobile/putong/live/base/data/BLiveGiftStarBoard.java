package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarOther;
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
public class BLiveGiftStarBoard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftStarBoard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftStarBoard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftStarBoard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftStarBoard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftStarBoard newInstance() {
            return new BLiveGiftStarBoard();
        }

        public boolean parseField(BLiveGiftStarBoard bLiveGiftStarBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "config":
                    bLiveGiftStarBoard.config = BLiveGiftStarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "leaderboards":
                    bLiveGiftStarBoard.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveGiftStarOther.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "open":
                    bLiveGiftStarBoard.open = jsonParser.getValueAsBoolean();
                    return true;
                case "current":
                    bLiveGiftStarBoard.current = BLiveGiftStarInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftStarBoard bLiveGiftStarBoard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", bLiveGiftStarBoard.open);
            if (bLiveGiftStarBoard.config != null) {
                jsonGenerator.writeFieldName(Constants.KEY_CONFIG);
                BLiveGiftStarConfig.JSON_ADAPTER.serialize(bLiveGiftStarBoard.config, jsonGenerator, true);
            }
            if (bLiveGiftStarBoard.current != null) {
                jsonGenerator.writeFieldName("current");
                BLiveGiftStarInfo.JSON_ADAPTER.serialize(bLiveGiftStarBoard.current, jsonGenerator, true);
            }
            if (bLiveGiftStarBoard.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveGiftStarBoard.leaderboards, jsonGenerator, BLiveGiftStarOther.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftStarBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftstarboard";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftStarConfig config;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftStarInfo current;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveGiftStarOther> leaderboards;

    @ProtobufIndex(index = 1)
    public boolean open;

    public static BLiveGiftStarBoard new_() {
        BLiveGiftStarBoard bLiveGiftStarBoard = new BLiveGiftStarBoard();
        bLiveGiftStarBoard.nullCheck();
        return bLiveGiftStarBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftStarBoard mo225055clone() {
        BLiveGiftStarBoard bLiveGiftStarBoard = new BLiveGiftStarBoard();
        bLiveGiftStarBoard.open = this.open;
        BLiveGiftStarConfig bLiveGiftStarConfig = this.config;
        if (bLiveGiftStarConfig != null) {
            bLiveGiftStarBoard.config = bLiveGiftStarConfig.mo225055clone();
        }
        BLiveGiftStarInfo bLiveGiftStarInfo = this.current;
        if (bLiveGiftStarInfo != null) {
            bLiveGiftStarBoard.current = bLiveGiftStarInfo.mo225055clone();
        }
        List<BLiveGiftStarOther> list = this.leaderboards;
        if (list != null) {
            bLiveGiftStarBoard.leaderboards = ValueObject.util_map(list, new qcj() { // from class: l.e12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftStarOther) obj).mo225055clone();
                }
            });
        }
        return bLiveGiftStarBoard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftStarBoard)) {
            return false;
        }
        BLiveGiftStarBoard bLiveGiftStarBoard = (BLiveGiftStarBoard) obj;
        return this.open == bLiveGiftStarBoard.open && ValueObject.util_equals(this.config, bLiveGiftStarBoard.config) && ValueObject.util_equals(this.current, bLiveGiftStarBoard.current) && ValueObject.util_equals(this.leaderboards, bLiveGiftStarBoard.leaderboards);
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
        int i2 = ((i * 41) + (this.open ? 1231 : 1237)) * 41;
        BLiveGiftStarConfig bLiveGiftStarConfig = this.config;
        int iHashCode = (i2 + (bLiveGiftStarConfig != null ? bLiveGiftStarConfig.hashCode() : 0)) * 41;
        BLiveGiftStarInfo bLiveGiftStarInfo = this.current;
        int iHashCode2 = (iHashCode + (bLiveGiftStarInfo != null ? bLiveGiftStarInfo.hashCode() : 0)) * 41;
        List<BLiveGiftStarOther> list = this.leaderboards;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.config == null) {
            this.config = BLiveGiftStarConfig.new_();
        }
        if (this.current == null) {
            this.current = BLiveGiftStarInfo.new_();
        }
        if (this.leaderboards == null) {
            this.leaderboards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
