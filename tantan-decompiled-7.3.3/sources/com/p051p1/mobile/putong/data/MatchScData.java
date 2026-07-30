package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
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
import java.util.HashMap;
import java.util.Map;
import p153l.nc5;
import p153l.pzi0;

/* JADX INFO: loaded from: classes12.dex */
public class MatchScData extends ValueObject implements Cloneable, Serializable {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_DISLIKE = "dislike";
    public static final String ACTION_LIKE = "like";
    public static final String ACTION_SUPER_LIKE = "superlike";
    public static final String ACTION_SWIPE = "swipe";
    public static final String MID = "e_gotmatch";
    public static final String SOURCE_FOLLOW = "follow";
    public static final String TYPE = "matchscdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String actionname;

    @NonNull
    @ProtobufIndex(index = 3)
    public String actiontype;

    @NonNull
    @ProtobufIndex(index = 2)
    public String createTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String receiverUserId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String updateRelationshipsModuleId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String updateRelationshipsSource;
    public static ProtobufAdapter<MatchScData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchScData>() { // from class: com.p1.mobile.putong.data.MatchScData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchScData matchScData) {
            String str = matchScData.receiverUserId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = matchScData.createTime;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = matchScData.actiontype;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = matchScData.actionname;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = matchScData.updateRelationshipsModuleId;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = matchScData.updateRelationshipsSource;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = matchScData.pageId;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            matchScData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchScData parse(nc5 nc5Var) throws IOException {
            MatchScData matchScData = new MatchScData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (matchScData.receiverUserId == null) {
                        matchScData.receiverUserId = "";
                    }
                    if (matchScData.createTime == null) {
                        matchScData.createTime = "";
                    }
                    if (matchScData.actiontype == null) {
                        matchScData.actiontype = "";
                    }
                    if (matchScData.actionname == null) {
                        matchScData.actionname = "";
                    }
                    if (matchScData.updateRelationshipsModuleId == null) {
                        matchScData.updateRelationshipsModuleId = "";
                    }
                    if (matchScData.updateRelationshipsSource == null) {
                        matchScData.updateRelationshipsSource = "";
                    }
                    if (matchScData.pageId != null) {
                        break;
                    }
                    matchScData.pageId = "";
                    break;
                }
                if (iM162497u == 10) {
                    matchScData.receiverUserId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    matchScData.createTime = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    matchScData.actiontype = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    matchScData.actionname = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    matchScData.updateRelationshipsModuleId = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    matchScData.updateRelationshipsSource = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (matchScData.receiverUserId == null) {
                            matchScData.receiverUserId = "";
                        }
                        if (matchScData.createTime == null) {
                            matchScData.createTime = "";
                        }
                        if (matchScData.actiontype == null) {
                            matchScData.actiontype = "";
                        }
                        if (matchScData.actionname == null) {
                            matchScData.actionname = "";
                        }
                        if (matchScData.updateRelationshipsModuleId == null) {
                            matchScData.updateRelationshipsModuleId = "";
                        }
                        if (matchScData.updateRelationshipsSource == null) {
                            matchScData.updateRelationshipsSource = "";
                        }
                        if (matchScData.pageId != null) {
                            break;
                        }
                        matchScData.pageId = "";
                        return matchScData;
                    }
                    matchScData.pageId = nc5Var.m162495s();
                }
            }
            return matchScData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchScData matchScData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matchScData.receiverUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = matchScData.createTime;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = matchScData.actiontype;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = matchScData.actionname;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = matchScData.updateRelationshipsModuleId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = matchScData.updateRelationshipsSource;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = matchScData.pageId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
        }
    };
    public static JsonAdapter<MatchScData> JSON_ADAPTER = new ObjectJsonAdapter<MatchScData>() { // from class: com.p1.mobile.putong.data.MatchScData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchScData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchScData newInstance() {
            return new MatchScData();
        }

        public boolean parseField(MatchScData matchScData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pageId":
                    matchScData.pageId = jsonParser.getValueAsString();
                    return true;
                case "receiverUserId":
                    matchScData.receiverUserId = jsonParser.getValueAsString();
                    return true;
                case "updateRelationshipsModuleId":
                    matchScData.updateRelationshipsModuleId = jsonParser.getValueAsString();
                    return true;
                case "createTime":
                    matchScData.createTime = jsonParser.getValueAsString();
                    return true;
                case "actionname":
                    matchScData.actionname = jsonParser.getValueAsString();
                    return true;
                case "actiontype":
                    matchScData.actiontype = jsonParser.getValueAsString();
                    return true;
                case "updateRelationshipsSource":
                    matchScData.updateRelationshipsSource = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatchScData matchScData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pageId":
                case "receiverUserId":
                case "updateRelationshipsModuleId":
                case "createTime":
                case "actionname":
                case "actiontype":
                case "updateRelationshipsSource":
                    return true;
                default:
                    return super.parseFieldCheck(matchScData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchScData matchScData, JsonGenerator jsonGenerator) throws IOException {
            String str = matchScData.receiverUserId;
            if (str != null) {
                jsonGenerator.writeStringField("receiverUserId", str);
            }
            String str2 = matchScData.createTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("createTime", str2);
            }
            String str3 = matchScData.actiontype;
            if (str3 != null) {
                jsonGenerator.writeStringField("actiontype", str3);
            }
            String str4 = matchScData.actionname;
            if (str4 != null) {
                jsonGenerator.writeStringField("actionname", str4);
            }
            String str5 = matchScData.updateRelationshipsModuleId;
            if (str5 != null) {
                jsonGenerator.writeStringField("updateRelationshipsModuleId", str5);
            }
            String str6 = matchScData.updateRelationshipsSource;
            if (str6 != null) {
                jsonGenerator.writeStringField("updateRelationshipsSource", str6);
            }
            String str7 = matchScData.pageId;
            if (str7 != null) {
                jsonGenerator.writeStringField("pageId", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public interface ModuleId {
        public static final String boost_result_rev = "e_boost_result_rev";
        public static final String mid_e_card = "e_card";
        public static final String mid_e_follow = "e_follow";
        public static final String mid_e_likeButton = "e_likeButton";
        public static final String mid_e_superlikeButton = "e_superlikeButton";
        public static final String mid_secret_crush_sent = "secret_crush_sent";
    }

    public static MatchScData new_() {
        MatchScData matchScData = new MatchScData();
        matchScData.nullCheck();
        return matchScData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchScData mo225055clone() {
        MatchScData matchScData = new MatchScData();
        matchScData.receiverUserId = this.receiverUserId;
        matchScData.createTime = this.createTime;
        matchScData.actiontype = this.actiontype;
        matchScData.actionname = this.actionname;
        matchScData.updateRelationshipsModuleId = this.updateRelationshipsModuleId;
        matchScData.updateRelationshipsSource = this.updateRelationshipsSource;
        matchScData.pageId = this.pageId;
        return matchScData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchScData)) {
            return false;
        }
        MatchScData matchScData = (MatchScData) obj;
        return ValueObject.util_equals(this.receiverUserId, matchScData.receiverUserId) && ValueObject.util_equals(this.createTime, matchScData.createTime) && ValueObject.util_equals(this.actiontype, matchScData.actiontype) && ValueObject.util_equals(this.actionname, matchScData.actionname) && ValueObject.util_equals(this.updateRelationshipsModuleId, matchScData.updateRelationshipsModuleId) && ValueObject.util_equals(this.updateRelationshipsSource, matchScData.updateRelationshipsSource) && ValueObject.util_equals(this.pageId, matchScData.pageId);
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
        String str = this.receiverUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.createTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.actiontype;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.actionname;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.updateRelationshipsModuleId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.updateRelationshipsSource;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.pageId;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.receiverUserId == null) {
            this.receiverUserId = "";
        }
        if (this.createTime == null) {
            this.createTime = "";
        }
        if (this.actiontype == null) {
            this.actiontype = "";
        }
        if (this.actionname == null) {
            this.actionname = "";
        }
        if (this.updateRelationshipsModuleId == null) {
            this.updateRelationshipsModuleId = "";
        }
        if (this.updateRelationshipsSource == null) {
            this.updateRelationshipsSource = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Map<String, Object> toTrackParamMap() {
        HashMap map = new HashMap();
        map.put("receiver_user_id", this.receiverUserId);
        map.put("actiontype", this.actiontype);
        map.put("actionname", this.actionname);
        map.put("update_relationships_module_id", this.updateRelationshipsModuleId);
        map.put("update_relationships_source", this.updateRelationshipsSource);
        map.put("created_time", TextUtils.isEmpty(this.createTime) ? String.valueOf(pzi0.m174454o() / 1000) : this.createTime);
        return map;
    }

    private MatchScData() {
    }

    public static class MatchBuilder {
        private boolean fromButton;
        private boolean isBoostResultRev;
        private boolean isFromFollow;
        private boolean isSecretCrush;
        private boolean liked;
        private String pageId;
        private String source;
        private boolean superLiked;
        private String userId;

        public MatchScData build() {
            String str;
            MatchScData matchScData = new MatchScData();
            matchScData.receiverUserId = this.userId;
            matchScData.createTime = String.valueOf(pzi0.m174454o() / 1000);
            matchScData.updateRelationshipsSource = this.source;
            boolean z = this.superLiked;
            if (z) {
                str = "superlike";
            } else {
                str = this.liked ? "like" : "dislike";
            }
            matchScData.actionname = str;
            if (this.fromButton) {
                matchScData.actiontype = "click";
                if (z) {
                    matchScData.updateRelationshipsModuleId = ModuleId.mid_e_superlikeButton;
                } else if (this.liked) {
                    matchScData.updateRelationshipsModuleId = ModuleId.mid_e_likeButton;
                }
            } else {
                matchScData.updateRelationshipsModuleId = ModuleId.mid_e_card;
                matchScData.actiontype = "swipe";
            }
            if (this.isSecretCrush) {
                matchScData.updateRelationshipsModuleId = ModuleId.mid_secret_crush_sent;
            }
            if (this.isFromFollow) {
                matchScData.updateRelationshipsModuleId = ModuleId.mid_e_follow;
            }
            if (this.isBoostResultRev) {
                matchScData.updateRelationshipsModuleId = ModuleId.boost_result_rev;
            }
            matchScData.pageId = this.pageId;
            return matchScData;
        }

        public MatchBuilder isBoostResultRev(boolean z) {
            this.isBoostResultRev = z;
            return this;
        }

        public MatchBuilder isFromButton(boolean z) {
            this.fromButton = z;
            return this;
        }

        public MatchBuilder isFromFollow(boolean z) {
            this.isFromFollow = z;
            return this;
        }

        public MatchBuilder isLike(boolean z) {
            this.liked = z;
            return this;
        }

        public MatchBuilder isSecretCrush(boolean z) {
            this.isSecretCrush = z;
            return this;
        }

        public MatchBuilder isSuperLiked(boolean z) {
            this.superLiked = z;
            return this;
        }

        public MatchBuilder matchSource(String str) {
            this.source = str;
            return this;
        }

        public MatchBuilder pageId(String str) {
            this.pageId = str;
            return this;
        }

        public MatchBuilder user(User user) {
            this.userId = user.f56859id;
            return this;
        }

        public MatchBuilder user(String str) {
            this.userId = str;
            return this;
        }
    }
}
