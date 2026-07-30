package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LikedUserFilterSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeduserfiltersettings";

    @ProtobufIndex(index = 1)
    public int distance;

    @NonNull
    @ProtobufIndex(index = 4)
    public LikedUserFilter filter;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int maxAge;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int minAge;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public LikeFilterSortType sort;
    public static ProtobufAdapter<LikedUserFilterSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedUserFilterSettings>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilterSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikedUserFilterSettings likedUserFilterSettings) {
            int iH = CodedOutputByteBufferNano.h(1, likedUserFilterSettings.distance) + CodedOutputByteBufferNano.h(2, likedUserFilterSettings.minAge) + CodedOutputByteBufferNano.h(3, likedUserFilterSettings.maxAge);
            LikedUserFilter likedUserFilter = likedUserFilterSettings.filter;
            if (likedUserFilter != null) {
                iH += CodedOutputByteBufferNano.h(4, likedUserFilter.ordinal());
            }
            LikeFilterSortType likeFilterSortType = likedUserFilterSettings.sort;
            if (likeFilterSortType != null) {
                iH += CodedOutputByteBufferNano.h(5, likeFilterSortType.ordinal());
            }
            LikedUserFilter likedUserFilter2 = likedUserFilterSettings.filter;
            if (likedUserFilter2 != null) {
                iH += CodedOutputByteBufferNano.l(6, likedUserFilter2, LikedUserFilter.PROTOBUF_ADAPTER);
            }
            LikeFilterSortType likeFilterSortType2 = likedUserFilterSettings.sort;
            if (likeFilterSortType2 != null) {
                iH += CodedOutputByteBufferNano.l(7, likeFilterSortType2, LikeFilterSortType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) likedUserFilterSettings).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikedUserFilterSettings m13897parse(nb5 nb5Var) throws IOException {
            LikedUserFilterSettings likedUserFilterSettings = new LikedUserFilterSettings();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likedUserFilterSettings.filter == null && numValueOf != null) {
                        likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (likedUserFilterSettings.sort == null && numValueOf2 != null) {
                        likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                    }
                    if (likedUserFilterSettings.filter == null) {
                        likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.defaultEnum();
                    }
                    if (likedUserFilterSettings.sort != null) {
                        break;
                    }
                    likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    likedUserFilterSettings.distance = nb5Var.j();
                } else if (iU == 16) {
                    likedUserFilterSettings.minAge = nb5Var.j();
                } else if (iU == 24) {
                    likedUserFilterSettings.maxAge = nb5Var.j();
                } else if (iU == 32) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 40) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 50) {
                    likedUserFilterSettings.filter = (LikedUserFilter) nb5Var.l(LikedUserFilter.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (likedUserFilterSettings.filter == null && numValueOf != null) {
                            likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (likedUserFilterSettings.sort == null && numValueOf2 != null) {
                            likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (likedUserFilterSettings.filter == null) {
                            likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.defaultEnum();
                        }
                        if (likedUserFilterSettings.sort != null) {
                            break;
                        }
                        likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.defaultEnum();
                        return likedUserFilterSettings;
                    }
                    likedUserFilterSettings.sort = (LikeFilterSortType) nb5Var.l(LikeFilterSortType.PROTOBUF_ADAPTER);
                }
            }
            return likedUserFilterSettings;
        }

        public void serialize(LikedUserFilterSettings likedUserFilterSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, likedUserFilterSettings.distance);
            codedOutputByteBufferNano.G(2, likedUserFilterSettings.minAge);
            codedOutputByteBufferNano.G(3, likedUserFilterSettings.maxAge);
            LikedUserFilter likedUserFilter = likedUserFilterSettings.filter;
            if (likedUserFilter != null) {
                codedOutputByteBufferNano.G(4, likedUserFilter.ordinal());
            }
            LikeFilterSortType likeFilterSortType = likedUserFilterSettings.sort;
            if (likeFilterSortType != null) {
                codedOutputByteBufferNano.G(5, likeFilterSortType.ordinal());
            }
            LikedUserFilter likedUserFilter2 = likedUserFilterSettings.filter;
            if (likedUserFilter2 != null) {
                codedOutputByteBufferNano.K(6, likedUserFilter2, LikedUserFilter.PROTOBUF_ADAPTER);
            }
            LikeFilterSortType likeFilterSortType2 = likedUserFilterSettings.sort;
            if (likeFilterSortType2 != null) {
                codedOutputByteBufferNano.K(7, likeFilterSortType2, LikeFilterSortType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikedUserFilterSettings> JSON_ADAPTER = new ObjectJsonAdapter<LikedUserFilterSettings>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilterSettings.2
        public Class getDataClass() {
            return LikedUserFilterSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikedUserFilterSettings m13898newInstance() {
            return new LikedUserFilterSettings();
        }

        public boolean parseField(LikedUserFilterSettings likedUserFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "filter":
                    likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "maxAge":
                    likedUserFilterSettings.maxAge = jsonParser.getValueAsInt();
                    return true;
                case "minAge":
                    likedUserFilterSettings.minAge = jsonParser.getValueAsInt();
                    return true;
                case "sort":
                    likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "distance":
                    likedUserFilterSettings.distance = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikedUserFilterSettings likedUserFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "filter":
                case "maxAge":
                case "minAge":
                case "sort":
                case "distance":
                    return true;
                default:
                    return super.parseFieldCheck(likedUserFilterSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LikedUserFilterSettings likedUserFilterSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("distance", likedUserFilterSettings.distance);
            jsonGenerator.writeNumberField("minAge", likedUserFilterSettings.minAge);
            jsonGenerator.writeNumberField("maxAge", likedUserFilterSettings.maxAge);
            if (likedUserFilterSettings.filter != null) {
                jsonGenerator.writeFieldName("filter");
                LikedUserFilter.JSON_ADAPTER.serialize(likedUserFilterSettings.filter, jsonGenerator, true);
            }
            if (likedUserFilterSettings.sort != null) {
                jsonGenerator.writeFieldName("sort");
                LikeFilterSortType.JSON_ADAPTER.serialize(likedUserFilterSettings.sort, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedUserFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedUserFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedUserFilterSettings getDefaultSettings() {
        LikedUserFilterSettings likedUserFilterSettingsNew_ = new_();
        likedUserFilterSettingsNew_.distance = getRadiusAllowedMaximum();
        likedUserFilterSettingsNew_.minAge = getSearchAgeAllowedMinimum();
        likedUserFilterSettingsNew_.maxAge = getSearchAgeAllowedMaximum();
        likedUserFilterSettingsNew_.filter = LikedUserFilter.get("all");
        likedUserFilterSettingsNew_.sort = LikeFilterSortType.get(LikeFilterSortType.latestLike);
        return likedUserFilterSettingsNew_;
    }

    public static int getRadiusAllowedMaximum() {
        return 100000;
    }

    public static int getRadiusAllowedMinimum() {
        return 1000;
    }

    public static int getSearchAgeAllowedMaximum() {
        return 50;
    }

    public static int getSearchAgeAllowedMinimum() {
        return 18;
    }

    public static LikedUserFilterSettings new_() {
        LikedUserFilterSettings likedUserFilterSettings = new LikedUserFilterSettings();
        likedUserFilterSettings.nullCheck();
        return likedUserFilterSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikedUserFilterSettings m13896clone() {
        LikedUserFilterSettings likedUserFilterSettings = new LikedUserFilterSettings();
        likedUserFilterSettings.distance = this.distance;
        likedUserFilterSettings.minAge = this.minAge;
        likedUserFilterSettings.maxAge = this.maxAge;
        likedUserFilterSettings.filter = this.filter;
        likedUserFilterSettings.sort = this.sort;
        return likedUserFilterSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikedUserFilterSettings)) {
            return false;
        }
        LikedUserFilterSettings likedUserFilterSettings = (LikedUserFilterSettings) obj;
        return this.distance == likedUserFilterSettings.distance && this.minAge == likedUserFilterSettings.minAge && this.maxAge == likedUserFilterSettings.maxAge && ValueObject.util_equals(this.filter, likedUserFilterSettings.filter) && ValueObject.util_equals(this.sort, likedUserFilterSettings.sort);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.distance) * 41) + this.minAge) * 41) + this.maxAge) * 41;
        LikedUserFilter likedUserFilter = this.filter;
        int iHashCode = (i2 + (likedUserFilter != null ? likedUserFilter.hashCode() : 0)) * 41;
        LikeFilterSortType likeFilterSortType = this.sort;
        int iHashCode2 = iHashCode + (likeFilterSortType != null ? likeFilterSortType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.filter == null) {
            this.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.defaultEnum();
        }
        if (this.sort == null) {
            this.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
