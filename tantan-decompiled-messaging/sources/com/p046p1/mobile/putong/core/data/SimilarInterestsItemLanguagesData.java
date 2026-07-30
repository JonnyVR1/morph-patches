package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsItemLanguagesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemlanguagesdata";

    @NonNull
    @ProtobufIndex(index = 5)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public String avatarTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 2)
    public SimilarInterestsItemStatusData status;

    @NonNull
    @ProtobufIndex(index = 1)
    public SimilarInterestsItemSwipeData swipe;

    @NonNull
    @ProtobufIndex(index = 3)
    public String titleIcon;
    public static ProtobufAdapter<SimilarInterestsItemLanguagesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData) {
            SimilarInterestsItemSwipeData similarInterestsItemSwipeData = similarInterestsItemLanguagesData.swipe;
            int iM17230l = similarInterestsItemSwipeData != null ? CodedOutputByteBufferNano.m17230l(1, similarInterestsItemSwipeData, SimilarInterestsItemSwipeData.PROTOBUF_ADAPTER) : 0;
            SimilarInterestsItemStatusData similarInterestsItemStatusData = similarInterestsItemLanguagesData.status;
            if (similarInterestsItemStatusData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, similarInterestsItemStatusData, SimilarInterestsItemStatusData.PROTOBUF_ADAPTER);
            }
            String str = similarInterestsItemLanguagesData.titleIcon;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            String str2 = similarInterestsItemLanguagesData.desc;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = similarInterestsItemLanguagesData.avatar;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            String str4 = similarInterestsItemLanguagesData.avatarTitle;
            if (str4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            similarInterestsItemLanguagesData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsItemLanguagesData parse(nb5 nb5Var) throws IOException {
            SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData = new SimilarInterestsItemLanguagesData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (similarInterestsItemLanguagesData.titleIcon == null) {
                        similarInterestsItemLanguagesData.titleIcon = "";
                    }
                    if (similarInterestsItemLanguagesData.desc == null) {
                        similarInterestsItemLanguagesData.desc = "";
                    }
                    if (similarInterestsItemLanguagesData.avatar == null) {
                        similarInterestsItemLanguagesData.avatar = "";
                    }
                    if (similarInterestsItemLanguagesData.avatarTitle == null) {
                        similarInterestsItemLanguagesData.avatarTitle = "";
                    }
                    if (similarInterestsItemLanguagesData.swipe == null) {
                        similarInterestsItemLanguagesData.swipe = SimilarInterestsItemSwipeData.new_();
                    }
                    if (similarInterestsItemLanguagesData.status != null) {
                        break;
                    }
                    similarInterestsItemLanguagesData.status = SimilarInterestsItemStatusData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    similarInterestsItemLanguagesData.swipe = (SimilarInterestsItemSwipeData) nb5Var.m158743l(SimilarInterestsItemSwipeData.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    similarInterestsItemLanguagesData.status = (SimilarInterestsItemStatusData) nb5Var.m158743l(SimilarInterestsItemStatusData.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    similarInterestsItemLanguagesData.titleIcon = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    similarInterestsItemLanguagesData.desc = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    similarInterestsItemLanguagesData.avatar = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (similarInterestsItemLanguagesData.titleIcon == null) {
                            similarInterestsItemLanguagesData.titleIcon = "";
                        }
                        if (similarInterestsItemLanguagesData.desc == null) {
                            similarInterestsItemLanguagesData.desc = "";
                        }
                        if (similarInterestsItemLanguagesData.avatar == null) {
                            similarInterestsItemLanguagesData.avatar = "";
                        }
                        if (similarInterestsItemLanguagesData.avatarTitle == null) {
                            similarInterestsItemLanguagesData.avatarTitle = "";
                        }
                        if (similarInterestsItemLanguagesData.swipe == null) {
                            similarInterestsItemLanguagesData.swipe = SimilarInterestsItemSwipeData.new_();
                        }
                        if (similarInterestsItemLanguagesData.status != null) {
                            break;
                        }
                        similarInterestsItemLanguagesData.status = SimilarInterestsItemStatusData.new_();
                        return similarInterestsItemLanguagesData;
                    }
                    similarInterestsItemLanguagesData.avatarTitle = nb5Var.m158750s();
                }
            }
            return similarInterestsItemLanguagesData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimilarInterestsItemSwipeData similarInterestsItemSwipeData = similarInterestsItemLanguagesData.swipe;
            if (similarInterestsItemSwipeData != null) {
                codedOutputByteBufferNano.m17254K(1, similarInterestsItemSwipeData, SimilarInterestsItemSwipeData.PROTOBUF_ADAPTER);
            }
            SimilarInterestsItemStatusData similarInterestsItemStatusData = similarInterestsItemLanguagesData.status;
            if (similarInterestsItemStatusData != null) {
                codedOutputByteBufferNano.m17254K(2, similarInterestsItemStatusData, SimilarInterestsItemStatusData.PROTOBUF_ADAPTER);
            }
            String str = similarInterestsItemLanguagesData.titleIcon;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            String str2 = similarInterestsItemLanguagesData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = similarInterestsItemLanguagesData.avatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            String str4 = similarInterestsItemLanguagesData.avatarTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemLanguagesData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsItemLanguagesData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsItemLanguagesData newInstance() {
            return new SimilarInterestsItemLanguagesData();
        }

        public boolean parseField(SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleIcon":
                    similarInterestsItemLanguagesData.titleIcon = jsonParser.getValueAsString();
                    return true;
                case "avatar":
                    similarInterestsItemLanguagesData.avatar = jsonParser.getValueAsString();
                    return true;
                case "status":
                    similarInterestsItemLanguagesData.status = SimilarInterestsItemStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "desc":
                    similarInterestsItemLanguagesData.desc = jsonParser.getValueAsString();
                    return true;
                case "swipe":
                    similarInterestsItemLanguagesData.swipe = SimilarInterestsItemSwipeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "avatarTitle":
                    similarInterestsItemLanguagesData.avatarTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "titleIcon":
                case "avatar":
                case "status":
                case "desc":
                case "swipe":
                case "avatarTitle":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsItemLanguagesData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemLanguagesData.titleIcon;
            if (str != null) {
                jsonGenerator.writeStringField("titleIcon", str);
            }
            String str2 = similarInterestsItemLanguagesData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = similarInterestsItemLanguagesData.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = similarInterestsItemLanguagesData.avatarTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatarTitle", str4);
            }
            if (similarInterestsItemLanguagesData.swipe != null) {
                jsonGenerator.writeFieldName("swipe");
                SimilarInterestsItemSwipeData.JSON_ADAPTER.serialize(similarInterestsItemLanguagesData.swipe, jsonGenerator, true);
            }
            if (similarInterestsItemLanguagesData.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                SimilarInterestsItemStatusData.JSON_ADAPTER.serialize(similarInterestsItemLanguagesData.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemLanguagesData new_() {
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData = new SimilarInterestsItemLanguagesData();
        similarInterestsItemLanguagesData.nullCheck();
        return similarInterestsItemLanguagesData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsItemLanguagesData mo223809clone() {
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData = new SimilarInterestsItemLanguagesData();
        similarInterestsItemLanguagesData.titleIcon = this.titleIcon;
        similarInterestsItemLanguagesData.desc = this.desc;
        similarInterestsItemLanguagesData.avatar = this.avatar;
        similarInterestsItemLanguagesData.avatarTitle = this.avatarTitle;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = this.swipe;
        if (similarInterestsItemSwipeData != null) {
            similarInterestsItemLanguagesData.swipe = similarInterestsItemSwipeData.mo223809clone();
        }
        SimilarInterestsItemStatusData similarInterestsItemStatusData = this.status;
        if (similarInterestsItemStatusData != null) {
            similarInterestsItemLanguagesData.status = similarInterestsItemStatusData.mo223809clone();
        }
        return similarInterestsItemLanguagesData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemLanguagesData)) {
            return false;
        }
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData = (SimilarInterestsItemLanguagesData) obj;
        return ValueObject.util_equals(this.titleIcon, similarInterestsItemLanguagesData.titleIcon) && ValueObject.util_equals(this.desc, similarInterestsItemLanguagesData.desc) && ValueObject.util_equals(this.avatar, similarInterestsItemLanguagesData.avatar) && ValueObject.util_equals(this.avatarTitle, similarInterestsItemLanguagesData.avatarTitle) && ValueObject.util_equals(this.swipe, similarInterestsItemLanguagesData.swipe) && ValueObject.util_equals(this.status, similarInterestsItemLanguagesData.status);
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
        String str = this.titleIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatarTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = this.swipe;
        int iHashCode5 = (iHashCode4 + (similarInterestsItemSwipeData != null ? similarInterestsItemSwipeData.hashCode() : 0)) * 41;
        SimilarInterestsItemStatusData similarInterestsItemStatusData = this.status;
        int iHashCode6 = iHashCode5 + (similarInterestsItemStatusData != null ? similarInterestsItemStatusData.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.titleIcon == null) {
            this.titleIcon = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.avatarTitle == null) {
            this.avatarTitle = "";
        }
        if (this.swipe == null) {
            this.swipe = SimilarInterestsItemSwipeData.new_();
        }
        if (this.status == null) {
            this.status = SimilarInterestsItemStatusData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
