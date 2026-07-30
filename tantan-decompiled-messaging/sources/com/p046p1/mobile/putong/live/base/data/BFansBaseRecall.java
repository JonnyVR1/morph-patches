package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BFansBaseRecall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bfansbaserecall";

    @NonNull
    @ProtobufIndex(index = 2)
    public BInviteDetail inviteDetail;

    @NonNull
    @ProtobufIndex(index = 1)
    public BQuickInvite quickInvite;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BFansRecallUser> users;
    public static ProtobufAdapter<BFansBaseRecall> PROTOBUF_ADAPTER = new C11447a();
    public static JsonAdapter<BFansBaseRecall> JSON_ADAPTER = new ObjectJsonAdapter<BFansBaseRecall>() { // from class: com.p1.mobile.putong.live.base.data.BFansBaseRecall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BFansBaseRecall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BFansBaseRecall newInstance() {
            return new BFansBaseRecall();
        }

        public boolean parseField(BFansBaseRecall bFansBaseRecall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "inviteDetail":
                    bFansBaseRecall.inviteDetail = BInviteDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quickInvite":
                    bFansBaseRecall.quickInvite = BQuickInvite.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "users":
                    bFansBaseRecall.users = JsonAdapter.parseArray(jsonParser, BFansRecallUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BFansBaseRecall bFansBaseRecall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "inviteDetail":
                case "quickInvite":
                case "users":
                    return true;
                default:
                    return super.parseFieldCheck(bFansBaseRecall, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BFansBaseRecall bFansBaseRecall, JsonGenerator jsonGenerator) throws IOException {
            if (bFansBaseRecall.quickInvite != null) {
                jsonGenerator.writeFieldName("quickInvite");
                BQuickInvite.JSON_ADAPTER.serialize(bFansBaseRecall.quickInvite, jsonGenerator, true);
            }
            if (bFansBaseRecall.inviteDetail != null) {
                jsonGenerator.writeFieldName("inviteDetail");
                BInviteDetail.JSON_ADAPTER.serialize(bFansBaseRecall.inviteDetail, jsonGenerator, true);
            }
            if (bFansBaseRecall.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bFansBaseRecall.users, jsonGenerator, BFansRecallUser.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BFansBaseRecall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BFansBaseRecall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BFansBaseRecall$a */
    public class C11447a extends MessageNanoAdapter<BFansBaseRecall> {
        public C11447a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BFansBaseRecall bFansBaseRecall) {
            BQuickInvite bQuickInvite = bFansBaseRecall.quickInvite;
            int iM17230l = bQuickInvite != null ? CodedOutputByteBufferNano.m17230l(1, bQuickInvite, BQuickInvite.PROTOBUF_ADAPTER) : 0;
            BInviteDetail bInviteDetail = bFansBaseRecall.inviteDetail;
            if (bInviteDetail != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, bInviteDetail, BInviteDetail.PROTOBUF_ADAPTER);
            }
            List<BFansRecallUser> list = bFansBaseRecall.users;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list, BFansRecallUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            bFansBaseRecall.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BFansBaseRecall parse(nb5 nb5Var) throws IOException {
            BFansBaseRecall bFansBaseRecall = new BFansBaseRecall();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bFansBaseRecall.quickInvite == null) {
                        bFansBaseRecall.quickInvite = BQuickInvite.new_();
                    }
                    if (bFansBaseRecall.inviteDetail == null) {
                        bFansBaseRecall.inviteDetail = BInviteDetail.new_();
                    }
                    if (bFansBaseRecall.users != null) {
                        break;
                    }
                    bFansBaseRecall.users = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    bFansBaseRecall.quickInvite = (BQuickInvite) nb5Var.m158743l(BQuickInvite.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    bFansBaseRecall.inviteDetail = (BInviteDetail) nb5Var.m158743l(BInviteDetail.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (bFansBaseRecall.quickInvite == null) {
                            bFansBaseRecall.quickInvite = BQuickInvite.new_();
                        }
                        if (bFansBaseRecall.inviteDetail == null) {
                            bFansBaseRecall.inviteDetail = BInviteDetail.new_();
                        }
                        if (bFansBaseRecall.users != null) {
                            break;
                        }
                        bFansBaseRecall.users = new ArrayList();
                        return bFansBaseRecall;
                    }
                    bFansBaseRecall.users = (List) nb5Var.m158743l(BFansRecallUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return bFansBaseRecall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BFansBaseRecall bFansBaseRecall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BQuickInvite bQuickInvite = bFansBaseRecall.quickInvite;
            if (bQuickInvite != null) {
                codedOutputByteBufferNano.m17254K(1, bQuickInvite, BQuickInvite.PROTOBUF_ADAPTER);
            }
            BInviteDetail bInviteDetail = bFansBaseRecall.inviteDetail;
            if (bInviteDetail != null) {
                codedOutputByteBufferNano.m17254K(2, bInviteDetail, BInviteDetail.PROTOBUF_ADAPTER);
            }
            List<BFansRecallUser> list = bFansBaseRecall.users;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, BFansRecallUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    }

    public static BFansBaseRecall new_() {
        BFansBaseRecall bFansBaseRecall = new BFansBaseRecall();
        bFansBaseRecall.nullCheck();
        return bFansBaseRecall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BFansBaseRecall mo223809clone() {
        BFansBaseRecall bFansBaseRecall = new BFansBaseRecall();
        BQuickInvite bQuickInvite = this.quickInvite;
        if (bQuickInvite != null) {
            bFansBaseRecall.quickInvite = bQuickInvite.mo223809clone();
        }
        BInviteDetail bInviteDetail = this.inviteDetail;
        if (bInviteDetail != null) {
            bFansBaseRecall.inviteDetail = bInviteDetail.mo223809clone();
        }
        List<BFansRecallUser> list = this.users;
        if (list != null) {
            bFansBaseRecall.users = ValueObject.util_map(list, new w9j() { // from class: l.dq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BFansRecallUser) obj).mo223809clone();
                }
            });
        }
        return bFansBaseRecall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BFansBaseRecall)) {
            return false;
        }
        BFansBaseRecall bFansBaseRecall = (BFansBaseRecall) obj;
        return ValueObject.util_equals(this.quickInvite, bFansBaseRecall.quickInvite) && ValueObject.util_equals(this.inviteDetail, bFansBaseRecall.inviteDetail) && ValueObject.util_equals(this.users, bFansBaseRecall.users);
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
        BQuickInvite bQuickInvite = this.quickInvite;
        int iHashCode = (i2 + (bQuickInvite != null ? bQuickInvite.hashCode() : 0)) * 41;
        BInviteDetail bInviteDetail = this.inviteDetail;
        int iHashCode2 = (iHashCode + (bInviteDetail != null ? bInviteDetail.hashCode() : 0)) * 41;
        List<BFansRecallUser> list = this.users;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.quickInvite == null) {
            this.quickInvite = BQuickInvite.new_();
        }
        if (this.inviteDetail == null) {
            this.inviteDetail = BInviteDetail.new_();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
