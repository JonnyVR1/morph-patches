package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
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

/* JADX INFO: loaded from: classes10.dex */
public class LikedUserFilterSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeduserfiltersettings";

    @ProtobufIndex(index = 1)
    public int distance;

    @NonNull
    @ProtobufIndex(index = 4)
    public LikedUserFilter filter;

    @ProtobufIndex(index = 3)
    public int maxAge;

    @ProtobufIndex(index = 2)
    public int minAge;

    @NonNull
    @ProtobufIndex(index = 5)
    public LikeFilterSortType sort;
    public static ProtobufAdapter<LikedUserFilterSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedUserFilterSettings>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilterSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikedUserFilterSettings likedUserFilterSettings) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, likedUserFilterSettings.distance) + CodedOutputByteBufferNano.m17226h(2, likedUserFilterSettings.minAge) + CodedOutputByteBufferNano.m17226h(3, likedUserFilterSettings.maxAge);
            LikedUserFilter likedUserFilter = likedUserFilterSettings.filter;
            if (likedUserFilter != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(4, likedUserFilter.ordinal());
            }
            LikeFilterSortType likeFilterSortType = likedUserFilterSettings.sort;
            if (likeFilterSortType != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(5, likeFilterSortType.ordinal());
            }
            LikedUserFilter likedUserFilter2 = likedUserFilterSettings.filter;
            if (likedUserFilter2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, likedUserFilter2, LikedUserFilter.PROTOBUF_ADAPTER);
            }
            LikeFilterSortType likeFilterSortType2 = likedUserFilterSettings.sort;
            if (likeFilterSortType2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, likeFilterSortType2, LikeFilterSortType.PROTOBUF_ADAPTER);
            }
            likedUserFilterSettings.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikedUserFilterSettings parse(nb5 nb5Var) throws IOException {
            LikedUserFilterSettings likedUserFilterSettings = new LikedUserFilterSettings();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (likedUserFilterSettings.filter == null && numValueOf != null) {
                        likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (likedUserFilterSettings.sort == null && numValueOf2 != null) {
                        likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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
                if (iM158752u == 8) {
                    likedUserFilterSettings.distance = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    likedUserFilterSettings.minAge = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    likedUserFilterSettings.maxAge = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 40) {
                    numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 50) {
                    likedUserFilterSettings.filter = (LikedUserFilter) nb5Var.m158743l(LikedUserFilter.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 58) {
                        if (likedUserFilterSettings.filter == null && numValueOf != null) {
                            likedUserFilterSettings.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (likedUserFilterSettings.sort == null && numValueOf2 != null) {
                            likedUserFilterSettings.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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
                    likedUserFilterSettings.sort = (LikeFilterSortType) nb5Var.m158743l(LikeFilterSortType.PROTOBUF_ADAPTER);
                }
            }
            return likedUserFilterSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikedUserFilterSettings likedUserFilterSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, likedUserFilterSettings.distance);
            codedOutputByteBufferNano.m17250G(2, likedUserFilterSettings.minAge);
            codedOutputByteBufferNano.m17250G(3, likedUserFilterSettings.maxAge);
            LikedUserFilter likedUserFilter = likedUserFilterSettings.filter;
            if (likedUserFilter != null) {
                codedOutputByteBufferNano.m17250G(4, likedUserFilter.ordinal());
            }
            LikeFilterSortType likeFilterSortType = likedUserFilterSettings.sort;
            if (likeFilterSortType != null) {
                codedOutputByteBufferNano.m17250G(5, likeFilterSortType.ordinal());
            }
            LikedUserFilter likedUserFilter2 = likedUserFilterSettings.filter;
            if (likedUserFilter2 != null) {
                codedOutputByteBufferNano.m17254K(6, likedUserFilter2, LikedUserFilter.PROTOBUF_ADAPTER);
            }
            LikeFilterSortType likeFilterSortType2 = likedUserFilterSettings.sort;
            if (likeFilterSortType2 != null) {
                codedOutputByteBufferNano.m17254K(7, likeFilterSortType2, LikeFilterSortType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikedUserFilterSettings> JSON_ADAPTER = new ObjectJsonAdapter<LikedUserFilterSettings>() { // from class: com.p1.mobile.putong.core.data.LikedUserFilterSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikedUserFilterSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikedUserFilterSettings newInstance() {
            return new LikedUserFilterSettings();
        }

        public boolean parseField(LikedUserFilterSettings likedUserFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "filter":
                    likedUserFilterSettings.filter = LikedUserFilter.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "maxAge":
                    likedUserFilterSettings.maxAge = jsonParser.getValueAsInt();
                    return true;
                case "minAge":
                    likedUserFilterSettings.minAge = jsonParser.getValueAsInt();
                    return true;
                case "sort":
                    likedUserFilterSettings.sort = LikeFilterSortType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedUserFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
        return LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
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

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikedUserFilterSettings mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.distance) * 41) + this.minAge) * 41) + this.maxAge) * 41;
        LikedUserFilter likedUserFilter = this.filter;
        int iHashCode = (i2 + (likedUserFilter != null ? likedUserFilter.hashCode() : 0)) * 41;
        LikeFilterSortType likeFilterSortType = this.sort;
        int iHashCode2 = iHashCode + (likeFilterSortType != null ? likeFilterSortType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.filter == null) {
            this.filter = (LikedUserFilter) LikedUserFilter.JSON_ADAPTER.defaultEnum();
        }
        if (this.sort == null) {
            this.sort = (LikeFilterSortType) LikeFilterSortType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
