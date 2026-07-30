package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IdealTag;
import com.p000p1.mobile.putong.data.PictureIdealInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserIdealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useridealinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IdealTag> details;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<PictureIdealInfo> mediaTagIdeal;
    public static ProtobufAdapter<UserIdealInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserIdealInfo>() { // from class: com.p1.mobile.putong.data.UserIdealInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserIdealInfo userIdealInfo) {
            List<IdealTag> list = userIdealInfo.details;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<PictureIdealInfo> list2 = userIdealInfo.mediaTagIdeal;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, PictureIdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userIdealInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserIdealInfo m19178parse(nb5 nb5Var) throws IOException {
            UserIdealInfo userIdealInfo = new UserIdealInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userIdealInfo.details == null) {
                        userIdealInfo.details = new ArrayList();
                    }
                    if (userIdealInfo.mediaTagIdeal != null) {
                        break;
                    }
                    userIdealInfo.mediaTagIdeal = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    userIdealInfo.details = (List) nb5Var.l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (userIdealInfo.details == null) {
                            userIdealInfo.details = new ArrayList();
                        }
                        if (userIdealInfo.mediaTagIdeal != null) {
                            break;
                        }
                        userIdealInfo.mediaTagIdeal = new ArrayList();
                        return userIdealInfo;
                    }
                    userIdealInfo.mediaTagIdeal = (List) nb5Var.l(PictureIdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userIdealInfo;
        }

        public void serialize(UserIdealInfo userIdealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IdealTag> list = userIdealInfo.details;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PictureIdealInfo> list2 = userIdealInfo.mediaTagIdeal;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, PictureIdealInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserIdealInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserIdealInfo>() { // from class: com.p1.mobile.putong.data.UserIdealInfo.2
        public Class getDataClass() {
            return UserIdealInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserIdealInfo mo17830newInstance() {
            return new UserIdealInfo();
        }

        public boolean parseField(UserIdealInfo userIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("mediaTagIdeal")) {
                userIdealInfo.mediaTagIdeal = JsonAdapter.parseArray(jsonParser, PictureIdealInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("details")) {
                return false;
            }
            userIdealInfo.details = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserIdealInfo userIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("mediaTagIdeal") || str.equals("details")) {
                return true;
            }
            return super.parseFieldCheck(userIdealInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserIdealInfo userIdealInfo, JsonGenerator jsonGenerator) throws IOException {
            if (userIdealInfo.details != null) {
                jsonGenerator.writeFieldName("details");
                JsonAdapter.serializeArray(userIdealInfo.details, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (userIdealInfo.mediaTagIdeal != null) {
                jsonGenerator.writeFieldName("mediaTagIdeal");
                JsonAdapter.serializeArray(userIdealInfo.mediaTagIdeal, jsonGenerator, PictureIdealInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserIdealInfo new_() {
        UserIdealInfo userIdealInfo = new UserIdealInfo();
        userIdealInfo.nullCheck();
        return userIdealInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserIdealInfo m19177clone() {
        UserIdealInfo userIdealInfo = new UserIdealInfo();
        List<IdealTag> list = this.details;
        if (list != null) {
            userIdealInfo.details = ValueObject.util_map(list, new w9j() { // from class: l.j5k0
                public final Object call(Object obj) {
                    return ((IdealTag) obj).m18213clone();
                }
            });
        }
        List<PictureIdealInfo> list2 = this.mediaTagIdeal;
        if (list2 != null) {
            userIdealInfo.mediaTagIdeal = ValueObject.util_map(list2, new w9j() { // from class: l.k5k0
                public final Object call(Object obj) {
                    return ((PictureIdealInfo) obj).m18807clone();
                }
            });
        }
        return userIdealInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserIdealInfo)) {
            return false;
        }
        UserIdealInfo userIdealInfo = (UserIdealInfo) obj;
        return ValueObject.util_equals(this.details, userIdealInfo.details) && ValueObject.util_equals(this.mediaTagIdeal, userIdealInfo.mediaTagIdeal);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IdealTag> list = this.details;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<PictureIdealInfo> list2 = this.mediaTagIdeal;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.details == null) {
            this.details = new ArrayList();
        }
        if (this.mediaTagIdeal == null) {
            this.mediaTagIdeal = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
