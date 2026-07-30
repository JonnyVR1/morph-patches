package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
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
public class BLiveUndercoverGameResult extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUndercoverGameResult> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUndercoverGameResult>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUndercoverGameResult.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUndercoverGameResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUndercoverGameResult newInstance() {
            return new BLiveUndercoverGameResult();
        }

        public boolean parseField(BLiveUndercoverGameResult bLiveUndercoverGameResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "undercoverWord":
                    bLiveUndercoverGameResult.undercoverWord = jsonParser.getValueAsString();
                    return true;
                case "normalWord":
                    bLiveUndercoverGameResult.normalWord = jsonParser.getValueAsString();
                    return true;
                case "undercoverMasks":
                    bLiveUndercoverGameResult.undercoverMasks = JsonAdapter.parseArray(jsonParser, BLiveUserMask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "normalMasks":
                    bLiveUndercoverGameResult.normalMasks = JsonAdapter.parseArray(jsonParser, BLiveUserMask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "winnerRole":
                    bLiveUndercoverGameResult.winnerRole = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUndercoverGameResult bLiveUndercoverGameResult, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUndercoverGameResult.winnerRole;
            if (str != null) {
                jsonGenerator.writeStringField("winnerRole", str);
            }
            if (bLiveUndercoverGameResult.normalMasks != null) {
                jsonGenerator.writeFieldName("normalMasks");
                JsonAdapter.serializeArray(bLiveUndercoverGameResult.normalMasks, jsonGenerator, BLiveUserMask.JSON_ADAPTER);
            }
            if (bLiveUndercoverGameResult.undercoverMasks != null) {
                jsonGenerator.writeFieldName("undercoverMasks");
                JsonAdapter.serializeArray(bLiveUndercoverGameResult.undercoverMasks, jsonGenerator, BLiveUserMask.JSON_ADAPTER);
            }
            String str2 = bLiveUndercoverGameResult.normalWord;
            if (str2 != null) {
                jsonGenerator.writeStringField("normalWord", str2);
            }
            String str3 = bLiveUndercoverGameResult.undercoverWord;
            if (str3 != null) {
                jsonGenerator.writeStringField("undercoverWord", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUndercoverGameResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveundercovergameresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveUserMask> normalMasks;

    @NonNull
    @ProtobufIndex(index = 4)
    public String normalWord;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveUserMask> undercoverMasks;

    @NonNull
    @ProtobufIndex(index = 5)
    public String undercoverWord;

    @NonNull
    @ProtobufIndex(index = 1)
    public String winnerRole;

    public static BLiveUndercoverGameResult new_() {
        BLiveUndercoverGameResult bLiveUndercoverGameResult = new BLiveUndercoverGameResult();
        bLiveUndercoverGameResult.nullCheck();
        return bLiveUndercoverGameResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUndercoverGameResult mo223809clone() {
        BLiveUndercoverGameResult bLiveUndercoverGameResult = new BLiveUndercoverGameResult();
        bLiveUndercoverGameResult.winnerRole = this.winnerRole;
        List<BLiveUserMask> list = this.normalMasks;
        if (list != null) {
            bLiveUndercoverGameResult.normalMasks = ValueObject.util_map(list, new w9j() { // from class: l.d72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUserMask) obj).mo223809clone();
                }
            });
        }
        List<BLiveUserMask> list2 = this.undercoverMasks;
        if (list2 != null) {
            bLiveUndercoverGameResult.undercoverMasks = ValueObject.util_map(list2, new w9j() { // from class: l.e72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUserMask) obj).mo223809clone();
                }
            });
        }
        bLiveUndercoverGameResult.normalWord = this.normalWord;
        bLiveUndercoverGameResult.undercoverWord = this.undercoverWord;
        return bLiveUndercoverGameResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUndercoverGameResult)) {
            return false;
        }
        BLiveUndercoverGameResult bLiveUndercoverGameResult = (BLiveUndercoverGameResult) obj;
        return ValueObject.util_equals(this.winnerRole, bLiveUndercoverGameResult.winnerRole) && ValueObject.util_equals(this.normalMasks, bLiveUndercoverGameResult.normalMasks) && ValueObject.util_equals(this.undercoverMasks, bLiveUndercoverGameResult.undercoverMasks) && ValueObject.util_equals(this.normalWord, bLiveUndercoverGameResult.normalWord) && ValueObject.util_equals(this.undercoverWord, bLiveUndercoverGameResult.undercoverWord);
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
        String str = this.winnerRole;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveUserMask> list = this.normalMasks;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUserMask> list2 = this.undercoverMasks;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str2 = this.normalWord;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.undercoverWord;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.winnerRole == null) {
            this.winnerRole = "";
        }
        if (this.normalMasks == null) {
            this.normalMasks = new ArrayList();
        }
        if (this.undercoverMasks == null) {
            this.undercoverMasks = new ArrayList();
        }
        if (this.normalWord == null) {
            this.normalWord = "";
        }
        if (this.undercoverWord == null) {
            this.undercoverWord = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "BLiveUndercoverGameResult{winnerRole='" + this.winnerRole + "', normalMasks=" + this.normalMasks + ", undercoverMasks=" + this.undercoverMasks + ", normalWord='" + this.normalWord + "', undercoverWord='" + this.undercoverWord + "'}";
    }
}
