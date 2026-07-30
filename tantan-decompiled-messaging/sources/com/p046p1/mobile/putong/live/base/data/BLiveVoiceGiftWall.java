package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGiftWall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWall newInstance() {
            return new BLiveVoiceGiftWall();
        }

        public boolean parseField(BLiveVoiceGiftWall bLiveVoiceGiftWall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "detail":
                    bLiveVoiceGiftWall.detail = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftWallListDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "process":
                    bLiveVoiceGiftWall.process = BLiveCommonCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "brief":
                    bLiveVoiceGiftWall.brief = BLiveVoiceGiftWallBriefs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWall bLiveVoiceGiftWall, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceGiftWall.process != null) {
                jsonGenerator.writeFieldName("process");
                BLiveCommonCount.JSON_ADAPTER.serialize(bLiveVoiceGiftWall.process, jsonGenerator, true);
            }
            if (bLiveVoiceGiftWall.brief != null) {
                jsonGenerator.writeFieldName("brief");
                BLiveVoiceGiftWallBriefs.JSON_ADAPTER.serialize(bLiveVoiceGiftWall.brief, jsonGenerator, true);
            }
            if (bLiveVoiceGiftWall.detail != null) {
                jsonGenerator.writeFieldName("detail");
                JsonAdapter.serializeArray(bLiveVoiceGiftWall.detail, jsonGenerator, BLiveVoiceGiftWallListDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwall";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceGiftWallBriefs brief;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVoiceGiftWallListDetail> detail;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCommonCount process;

    public static BLiveVoiceGiftWall new_() {
        BLiveVoiceGiftWall bLiveVoiceGiftWall = new BLiveVoiceGiftWall();
        bLiveVoiceGiftWall.nullCheck();
        return bLiveVoiceGiftWall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWall mo223809clone() {
        BLiveVoiceGiftWall bLiveVoiceGiftWall = new BLiveVoiceGiftWall();
        BLiveCommonCount bLiveCommonCount = this.process;
        if (bLiveCommonCount != null) {
            bLiveVoiceGiftWall.process = bLiveCommonCount.mo223809clone();
        }
        BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs = this.brief;
        if (bLiveVoiceGiftWallBriefs != null) {
            bLiveVoiceGiftWall.brief = bLiveVoiceGiftWallBriefs.mo223809clone();
        }
        List<BLiveVoiceGiftWallListDetail> list = this.detail;
        if (list != null) {
            bLiveVoiceGiftWall.detail = ValueObject.util_map(list, new w9j() { // from class: l.t82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftWallListDetail) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceGiftWall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWall)) {
            return false;
        }
        BLiveVoiceGiftWall bLiveVoiceGiftWall = (BLiveVoiceGiftWall) obj;
        return ValueObject.util_equals(this.process, bLiveVoiceGiftWall.process) && ValueObject.util_equals(this.brief, bLiveVoiceGiftWall.brief) && ValueObject.util_equals(this.detail, bLiveVoiceGiftWall.detail);
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
        BLiveCommonCount bLiveCommonCount = this.process;
        int iHashCode = (i2 + (bLiveCommonCount != null ? bLiveCommonCount.hashCode() : 0)) * 41;
        BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs = this.brief;
        int iHashCode2 = (iHashCode + (bLiveVoiceGiftWallBriefs != null ? bLiveVoiceGiftWallBriefs.hashCode() : 0)) * 41;
        List<BLiveVoiceGiftWallListDetail> list = this.detail;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.process == null) {
            this.process = BLiveCommonCount.new_();
        }
        if (this.brief == null) {
            this.brief = BLiveVoiceGiftWallBriefs.new_();
        }
        if (this.detail == null) {
            this.detail = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
