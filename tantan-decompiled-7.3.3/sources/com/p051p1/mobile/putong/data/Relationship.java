package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class Relationship extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "relationship";

    @Nullable
    public String anonymousLikeItemId;

    @Nullable
    public String avatarIdentifier;

    @Nullable
    public SwipeCardInfo cardInfo;

    @Nullable
    public String coinSign;

    @Nullable
    public String consumeType;

    @NonNull
    @ProtobufIndex(index = 21)
    public String convType;

    @NonNull
    @ProtobufIndex(index = 11)
    public ConversationStatus conversationStatus;

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 28)
    public DclExtensions dclExtensions;

    @NonNull
    @ProtobufIndex(index = 30)
    public String diamondSign;

    @Nullable
    public RelationshipExtendLetter extend;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f39654id;

    @Nullable
    @ProtobufIndex(index = 19)
    public String kankanId;

    @ProtobufIndex(index = 29)
    public int likeProfileId;

    @Nullable
    public String localLikeFrom;

    @NonNull
    @ProtobufIndex(index = 15)
    public MatchFrom localStatus;

    @Nullable
    @ProtobufIndex(index = 9)
    public String message;

    @ProtobufIndex(index = 8)
    public boolean needUndoPrompt;

    @Nullable
    @ProtobufIndex(index = 20)
    public String otherKankanId;

    @Nullable
    @ProtobufIndex(index = 10)
    public String otherMessage;

    @Nullable
    @ProtobufIndex(index = 7)
    public String otherState;

    @NonNull
    public List<MatchFrom> otherStatus;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<MatchFrom> otherTags;

    @NonNull
    public String picksTracker;

    @Nullable
    @ProtobufIndex(index = 17)
    public RelationshipExtensions relationshipExtensions;

    @NonNull
    @ProtobufIndex(index = 14)
    public String richListTracker;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> scenarios;

    @NonNull
    @ProtobufIndex(index = 18)
    public String scene;

    @NonNull
    @ProtobufIndex(index = 1)
    public RelationshipStatus state;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MatchFrom> status;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<MatchFrom> tags;

    @Nullable
    @ProtobufIndex(index = 16)
    public List<String> topics;

    @NonNull
    public String trackerId;

    @ProtobufIndex(index = 6)
    public double updateTime;

    @Nullable
    public String useAnonymousLikeItemId;

    @Nullable
    public String ussTracker;
    public static ProtobufAdapter<Relationship> PROTOBUF_ADAPTER = new MessageNanoAdapter<Relationship>() { // from class: com.p1.mobile.putong.data.Relationship.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Relationship relationship) {
            RelationshipStatus relationshipStatus = relationship.state;
            int iM17281h = relationshipStatus != null ? CodedOutputByteBufferNano.m17281h(1, relationshipStatus.ordinal()) : 0;
            List<MatchFrom> list = relationship.status;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d = iM17281h + CodedOutputByteBufferNano.m17277d(3, relationship.createdTime);
            String str = relationship.f39654id;
            if (str != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(4, str);
            }
            List<String> list2 = relationship.scenarios;
            if (list2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d2 = iM17277d + CodedOutputByteBufferNano.m17277d(6, relationship.updateTime);
            String str2 = relationship.otherState;
            if (str2 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            int iM17275b = iM17277d2 + CodedOutputByteBufferNano.m17275b(8, relationship.needUndoPrompt);
            String str3 = relationship.message;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(9, str3);
            }
            String str4 = relationship.otherMessage;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(10, str4);
            }
            ConversationStatus conversationStatus = relationship.conversationStatus;
            if (conversationStatus != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(11, conversationStatus.ordinal());
            }
            List<MatchFrom> list3 = relationship.tags;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(12, MatchFrom.covertToOldEnumList(list3), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MatchFrom> list4 = relationship.otherTags;
            if (list4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(13, MatchFrom.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = relationship.richListTracker;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(14, str5);
            }
            MatchFrom matchFrom = relationship.localStatus;
            if (matchFrom != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(15, matchFrom.ordinal());
            }
            List<String> list5 = relationship.topics;
            if (list5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(16, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            RelationshipExtensions relationshipExtensions = relationship.relationshipExtensions;
            if (relationshipExtensions != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(17, relationshipExtensions, RelationshipExtensions.PROTOBUF_ADAPTER);
            }
            String str6 = relationship.scene;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(18, str6);
            }
            String str7 = relationship.kankanId;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(19, str7);
            }
            String str8 = relationship.otherKankanId;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(20, str8);
            }
            String str9 = relationship.convType;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(21, str9);
            }
            RelationshipStatus relationshipStatus2 = relationship.state;
            if (relationshipStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(22, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list6 = relationship.status;
            if (list6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(23, list6, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ConversationStatus conversationStatus2 = relationship.conversationStatus;
            if (conversationStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(24, conversationStatus2, ConversationStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list7 = relationship.tags;
            if (list7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(25, list7, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MatchFrom> list8 = relationship.otherTags;
            if (list8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(26, list8, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MatchFrom matchFrom2 = relationship.localStatus;
            if (matchFrom2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(27, matchFrom2, MatchFrom.PROTOBUF_ADAPTER);
            }
            DclExtensions dclExtensions = relationship.dclExtensions;
            if (dclExtensions != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(28, dclExtensions, DclExtensions.PROTOBUF_ADAPTER);
            }
            int iM17281h2 = iM17275b + CodedOutputByteBufferNano.m17281h(29, relationship.likeProfileId);
            String str10 = relationship.diamondSign;
            if (str10 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(30, str10);
            }
            relationship.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Relationship parse(nc5 nc5Var) throws IOException {
            Relationship relationship = new Relationship();
            Integer numValueOf = null;
            List list = null;
            Integer numValueOf2 = null;
            List list2 = null;
            List list3 = null;
            Integer numValueOf3 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (relationship.state == null && numValueOf != null) {
                            relationship.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (relationship.status == null && list != null) {
                            relationship.status = MatchFrom.oldEnumCovertList(list);
                        }
                        if (relationship.conversationStatus == null && numValueOf2 != null) {
                            relationship.conversationStatus = (ConversationStatus) ConversationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (relationship.tags == null && list2 != null) {
                            relationship.tags = MatchFrom.oldEnumCovertList(list2);
                        }
                        if (relationship.otherTags == null && list3 != null) {
                            relationship.otherTags = MatchFrom.oldEnumCovertList(list3);
                        }
                        if (relationship.localStatus == null && numValueOf3 != null) {
                            relationship.localStatus = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (relationship.state == null) {
                            relationship.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.status == null) {
                            relationship.status = new ArrayList();
                        }
                        if (relationship.f39654id == null) {
                            relationship.f39654id = "";
                        }
                        if (relationship.scenarios == null) {
                            relationship.scenarios = new ArrayList();
                        }
                        if (relationship.picksTracker == null) {
                            relationship.picksTracker = "";
                        }
                        if (relationship.otherStatus == null) {
                            relationship.otherStatus = new ArrayList();
                        }
                        if (relationship.conversationStatus == null) {
                            relationship.conversationStatus = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.tags == null) {
                            relationship.tags = new ArrayList();
                        }
                        if (relationship.otherTags == null) {
                            relationship.otherTags = new ArrayList();
                        }
                        if (relationship.trackerId == null) {
                            relationship.trackerId = "";
                        }
                        if (relationship.richListTracker == null) {
                            relationship.richListTracker = "";
                        }
                        if (relationship.localStatus == null) {
                            relationship.localStatus = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.scene == null) {
                            relationship.scene = "";
                        }
                        if (relationship.convType == null) {
                            relationship.convType = "";
                        }
                        if (relationship.dclExtensions == null) {
                            relationship.dclExtensions = DclExtensions.new_();
                        }
                        if (relationship.diamondSign == null) {
                            relationship.diamondSign = "";
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 18:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 25:
                        relationship.createdTime = nc5Var.m162484h();
                        continue;
                    case 34:
                        relationship.f39654id = nc5Var.m162495s();
                        continue;
                    case 42:
                        relationship.scenarios = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 49:
                        relationship.updateTime = nc5Var.m162484h();
                        continue;
                    case 58:
                        relationship.otherState = nc5Var.m162495s();
                        continue;
                    case 64:
                        relationship.needUndoPrompt = nc5Var.m162483g();
                        continue;
                    case 74:
                        relationship.message = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        relationship.otherMessage = nc5Var.m162495s();
                        continue;
                    case 88:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        list2 = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        list3 = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        relationship.richListTracker = nc5Var.m162495s();
                        continue;
                    case 120:
                        numValueOf3 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 130:
                        relationship.topics = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        relationship.relationshipExtensions = (RelationshipExtensions) nc5Var.m162488l(RelationshipExtensions.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        relationship.scene = nc5Var.m162495s();
                        continue;
                    case 154:
                        relationship.kankanId = nc5Var.m162495s();
                        continue;
                    case 162:
                        relationship.otherKankanId = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        relationship.convType = nc5Var.m162495s();
                        continue;
                    case 178:
                        relationship.state = (RelationshipStatus) nc5Var.m162488l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        relationship.status = (List) nc5Var.m162488l(MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        relationship.conversationStatus = (ConversationStatus) nc5Var.m162488l(ConversationStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        relationship.tags = (List) nc5Var.m162488l(MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 210:
                        relationship.otherTags = (List) nc5Var.m162488l(MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 218:
                        relationship.localStatus = (MatchFrom) nc5Var.m162488l(MatchFrom.PROTOBUF_ADAPTER);
                        continue;
                    case 226:
                        relationship.dclExtensions = (DclExtensions) nc5Var.m162488l(DclExtensions.PROTOBUF_ADAPTER);
                        continue;
                    case 232:
                        relationship.likeProfileId = nc5Var.m162486j();
                        continue;
                    case 242:
                        relationship.diamondSign = nc5Var.m162495s();
                        continue;
                    default:
                        if (relationship.state == null && numValueOf != null) {
                            relationship.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (relationship.status == null && list != null) {
                            relationship.status = MatchFrom.oldEnumCovertList(list);
                        }
                        if (relationship.conversationStatus == null && numValueOf2 != null) {
                            relationship.conversationStatus = (ConversationStatus) ConversationStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (relationship.tags == null && list2 != null) {
                            relationship.tags = MatchFrom.oldEnumCovertList(list2);
                        }
                        if (relationship.otherTags == null && list3 != null) {
                            relationship.otherTags = MatchFrom.oldEnumCovertList(list3);
                        }
                        if (relationship.localStatus == null && numValueOf3 != null) {
                            relationship.localStatus = (MatchFrom) MatchFrom.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (relationship.state == null) {
                            relationship.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.status == null) {
                            relationship.status = new ArrayList();
                        }
                        if (relationship.f39654id == null) {
                            relationship.f39654id = "";
                        }
                        if (relationship.scenarios == null) {
                            relationship.scenarios = new ArrayList();
                        }
                        if (relationship.picksTracker == null) {
                            relationship.picksTracker = "";
                        }
                        if (relationship.otherStatus == null) {
                            relationship.otherStatus = new ArrayList();
                        }
                        if (relationship.conversationStatus == null) {
                            relationship.conversationStatus = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.tags == null) {
                            relationship.tags = new ArrayList();
                        }
                        if (relationship.otherTags == null) {
                            relationship.otherTags = new ArrayList();
                        }
                        if (relationship.trackerId == null) {
                            relationship.trackerId = "";
                        }
                        if (relationship.richListTracker == null) {
                            relationship.richListTracker = "";
                        }
                        if (relationship.localStatus == null) {
                            relationship.localStatus = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationship.scene == null) {
                            relationship.scene = "";
                        }
                        if (relationship.convType == null) {
                            relationship.convType = "";
                        }
                        if (relationship.dclExtensions == null) {
                            relationship.dclExtensions = DclExtensions.new_();
                        }
                        if (relationship.diamondSign == null) {
                            relationship.diamondSign = "";
                            return relationship;
                        }
                        break;
                }
            }
            return relationship;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Relationship relationship, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RelationshipStatus relationshipStatus = relationship.state;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17305G(1, relationshipStatus.ordinal());
            }
            List<MatchFrom> list = relationship.status;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(3, relationship.createdTime);
            String str = relationship.f39654id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            List<String> list2 = relationship.scenarios;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(6, relationship.updateTime);
            String str2 = relationship.otherState;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            codedOutputByteBufferNano.m17299A(8, relationship.needUndoPrompt);
            String str3 = relationship.message;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(9, str3);
            }
            String str4 = relationship.otherMessage;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(10, str4);
            }
            ConversationStatus conversationStatus = relationship.conversationStatus;
            if (conversationStatus != null) {
                codedOutputByteBufferNano.m17305G(11, conversationStatus.ordinal());
            }
            List<MatchFrom> list3 = relationship.tags;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(12, MatchFrom.covertToOldEnumList(list3), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MatchFrom> list4 = relationship.otherTags;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(13, MatchFrom.covertToOldEnumList(list4), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = relationship.richListTracker;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(14, str5);
            }
            MatchFrom matchFrom = relationship.localStatus;
            if (matchFrom != null) {
                codedOutputByteBufferNano.m17305G(15, matchFrom.ordinal());
            }
            List<String> list5 = relationship.topics;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(16, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            RelationshipExtensions relationshipExtensions = relationship.relationshipExtensions;
            if (relationshipExtensions != null) {
                codedOutputByteBufferNano.m17309K(17, relationshipExtensions, RelationshipExtensions.PROTOBUF_ADAPTER);
            }
            String str6 = relationship.scene;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(18, str6);
            }
            String str7 = relationship.kankanId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(19, str7);
            }
            String str8 = relationship.otherKankanId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(20, str8);
            }
            String str9 = relationship.convType;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(21, str9);
            }
            RelationshipStatus relationshipStatus2 = relationship.state;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17309K(22, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list6 = relationship.status;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(23, list6, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ConversationStatus conversationStatus2 = relationship.conversationStatus;
            if (conversationStatus2 != null) {
                codedOutputByteBufferNano.m17309K(24, conversationStatus2, ConversationStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list7 = relationship.tags;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(25, list7, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MatchFrom> list8 = relationship.otherTags;
            if (list8 != null) {
                codedOutputByteBufferNano.m17309K(26, list8, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MatchFrom matchFrom2 = relationship.localStatus;
            if (matchFrom2 != null) {
                codedOutputByteBufferNano.m17309K(27, matchFrom2, MatchFrom.PROTOBUF_ADAPTER);
            }
            DclExtensions dclExtensions = relationship.dclExtensions;
            if (dclExtensions != null) {
                codedOutputByteBufferNano.m17309K(28, dclExtensions, DclExtensions.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(29, relationship.likeProfileId);
            String str10 = relationship.diamondSign;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(30, str10);
            }
        }
    };
    public static JsonAdapter<Relationship> JSON_ADAPTER = new ObjectJsonAdapter<Relationship>() { // from class: com.p1.mobile.putong.data.Relationship.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Relationship.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Relationship newInstance() {
            return new Relationship();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Relationship relationship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1945886903:
                    if (str.equals("otherTags")) {
                        b = 0;
                    }
                    break;
                case -1809421292:
                    if (str.equals(Extensions.TYPE)) {
                        b = 1;
                    }
                    break;
                case -1697796318:
                    if (str.equals("otherStatus")) {
                        b = 2;
                    }
                    break;
                case -1623664947:
                    if (str.equals("likeProfileId")) {
                        b = 3;
                    }
                    break;
                case -1371052442:
                    if (str.equals("picksTracker")) {
                        b = 4;
                    }
                    break;
                case -1289044198:
                    if (str.equals("extend")) {
                        b = 5;
                    }
                    break;
                case -1261718197:
                    if (str.equals("useAnonymousLikeItemId")) {
                        b = 6;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 7;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 8;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 9;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 10;
                    }
                    break;
                case -632148254:
                    if (str.equals("avatarIdentifier")) {
                        b = 11;
                    }
                    break;
                case -565970802:
                    if (str.equals("convType")) {
                        b = 12;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -479607214:
                    if (str.equals("anonymousLikeItemId")) {
                        b = 14;
                    }
                    break;
                case -335527828:
                    if (str.equals("localLikeFrom")) {
                        b = 15;
                    }
                    break;
                case -295931082:
                    if (str.equals("updateTime")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -193314975:
                    if (str.equals("otherState")) {
                        b = 17;
                    }
                    break;
                case -8565794:
                    if (str.equals("cardInfo")) {
                        b = 18;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 19;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 20;
                    }
                    break;
                case 5582785:
                    if (str.equals("dclExtensions")) {
                        b = 21;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 22;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 23;
                    }
                    break;
                case 128298347:
                    if (str.equals("otherKankanId")) {
                        b = 24;
                    }
                    break;
                case 235874275:
                    if (str.equals("ussTracker")) {
                        b = 25;
                    }
                    break;
                case 730329715:
                    if (str.equals("trackerId")) {
                        b = 26;
                    }
                    break;
                case 941677115:
                    if (str.equals("kankanId")) {
                        b = 27;
                    }
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        b = 28;
                    }
                    break;
                case 988270142:
                    if (str.equals("richListTracker")) {
                        b = 29;
                    }
                    break;
                case 1039926430:
                    if (str.equals("needUndoPrompt")) {
                        b = 30;
                    }
                    break;
                case 1416634173:
                    if (str.equals("localStatus")) {
                        b = 31;
                    }
                    break;
                case 1665919573:
                    if (str.equals("conversationStatus")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 33;
                    }
                    break;
                case 1759971031:
                    if (str.equals("otherMessage")) {
                        b = 34;
                    }
                    break;
                case 1970579761:
                    if (str.equals("diamondSign")) {
                        b = 35;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    relationship.otherTags = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    relationship.relationshipExtensions = RelationshipExtensions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    relationship.otherStatus = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    relationship.likeProfileId = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    relationship.picksTracker = jsonParser.getValueAsString();
                    return true;
                case 5:
                    relationship.extend = RelationshipExtendLetter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    relationship.useAnonymousLikeItemId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    relationship.status = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    relationship.topics = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    relationship.consumeType = jsonParser.getValueAsString();
                    return true;
                case 10:
                    relationship.coinSign = jsonParser.getValueAsString();
                    return true;
                case 11:
                    relationship.avatarIdentifier = jsonParser.getValueAsString();
                    return true;
                case 12:
                    relationship.convType = jsonParser.getValueAsString();
                    return true;
                case 13:
                    relationship.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 14:
                    relationship.anonymousLikeItemId = jsonParser.getValueAsString();
                    return true;
                case 15:
                    relationship.localLikeFrom = jsonParser.getValueAsString();
                    return true;
                case 16:
                    relationship.updateTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 17:
                    relationship.otherState = jsonParser.getValueAsString();
                    return true;
                case 18:
                    relationship.cardInfo = SwipeCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    relationship.f39654id = jsonParser.getValueAsString();
                    return false;
                case 20:
                    relationship.tags = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    relationship.dclExtensions = DclExtensions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    relationship.scene = jsonParser.getValueAsString();
                    return true;
                case 23:
                    relationship.state = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 24:
                    relationship.otherKankanId = jsonParser.getValueAsString();
                    return true;
                case 25:
                    relationship.ussTracker = jsonParser.getValueAsString();
                    return true;
                case 26:
                    relationship.trackerId = jsonParser.getValueAsString();
                    return true;
                case 27:
                    relationship.kankanId = jsonParser.getValueAsString();
                    return true;
                case 28:
                    relationship.message = jsonParser.getValueAsString();
                    return true;
                case 29:
                    relationship.richListTracker = jsonParser.getValueAsString();
                    return true;
                case 30:
                    relationship.needUndoPrompt = jsonParser.getValueAsBoolean();
                    return true;
                case 31:
                    relationship.localStatus = MatchFrom.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 32:
                    relationship.conversationStatus = ConversationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 33:
                    relationship.scenarios = JsonAdapter.parseArray(jsonParser, Converter.SCENARIO_ID, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    relationship.otherMessage = jsonParser.getValueAsString();
                    return true;
                case 35:
                    relationship.diamondSign = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Relationship relationship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1945886903:
                    if (str.equals("otherTags")) {
                        b = 0;
                    }
                    break;
                case -1809421292:
                    if (str.equals(Extensions.TYPE)) {
                        b = 1;
                    }
                    break;
                case -1697796318:
                    if (str.equals("otherStatus")) {
                        b = 2;
                    }
                    break;
                case -1623664947:
                    if (str.equals("likeProfileId")) {
                        b = 3;
                    }
                    break;
                case -1371052442:
                    if (str.equals("picksTracker")) {
                        b = 4;
                    }
                    break;
                case -1289044198:
                    if (str.equals("extend")) {
                        b = 5;
                    }
                    break;
                case -1261718197:
                    if (str.equals("useAnonymousLikeItemId")) {
                        b = 6;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 7;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 8;
                    }
                    break;
                case -859266730:
                    if (str.equals("consumeType")) {
                        b = 9;
                    }
                    break;
                case -716550162:
                    if (str.equals("coinSign")) {
                        b = 10;
                    }
                    break;
                case -632148254:
                    if (str.equals("avatarIdentifier")) {
                        b = 11;
                    }
                    break;
                case -565970802:
                    if (str.equals("convType")) {
                        b = 12;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -479607214:
                    if (str.equals("anonymousLikeItemId")) {
                        b = 14;
                    }
                    break;
                case -335527828:
                    if (str.equals("localLikeFrom")) {
                        b = 15;
                    }
                    break;
                case -295931082:
                    if (str.equals("updateTime")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -193314975:
                    if (str.equals("otherState")) {
                        b = 17;
                    }
                    break;
                case -8565794:
                    if (str.equals("cardInfo")) {
                        b = 18;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 19;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 20;
                    }
                    break;
                case 5582785:
                    if (str.equals("dclExtensions")) {
                        b = 21;
                    }
                    break;
                case 109254796:
                    if (str.equals("scene")) {
                        b = 22;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 23;
                    }
                    break;
                case 128298347:
                    if (str.equals("otherKankanId")) {
                        b = 24;
                    }
                    break;
                case 235874275:
                    if (str.equals("ussTracker")) {
                        b = 25;
                    }
                    break;
                case 730329715:
                    if (str.equals("trackerId")) {
                        b = 26;
                    }
                    break;
                case 941677115:
                    if (str.equals("kankanId")) {
                        b = 27;
                    }
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        b = 28;
                    }
                    break;
                case 988270142:
                    if (str.equals("richListTracker")) {
                        b = 29;
                    }
                    break;
                case 1039926430:
                    if (str.equals("needUndoPrompt")) {
                        b = 30;
                    }
                    break;
                case 1416634173:
                    if (str.equals("localStatus")) {
                        b = 31;
                    }
                    break;
                case 1665919573:
                    if (str.equals("conversationStatus")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 33;
                    }
                    break;
                case 1759971031:
                    if (str.equals("otherMessage")) {
                        b = 34;
                    }
                    break;
                case 1970579761:
                    if (str.equals("diamondSign")) {
                        b = 35;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    return true;
                case 19:
                    return false;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    return true;
                default:
                    return super.parseFieldCheck(relationship, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Relationship relationship, JsonGenerator jsonGenerator) throws IOException {
            if (relationship.state != null) {
                jsonGenerator.writeFieldName("state");
                RelationshipStatus.JSON_ADAPTER.serialize(relationship.state, jsonGenerator, true);
            }
            if (relationship.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                JsonAdapter.serializeArray(relationship.status, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(relationship.createdTime), jsonGenerator, true);
            String str = relationship.f39654id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (relationship.scenarios != null) {
                jsonGenerator.writeFieldName("scenarios");
                JsonAdapter.serializeArray(relationship.scenarios, jsonGenerator, Converter.SCENARIO_ID);
            }
            jsonGenerator.writeFieldName("updateTime");
            jsonAdapter.serialize(Double.valueOf(relationship.updateTime), jsonGenerator, true);
            String str2 = relationship.picksTracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("picksTracker", str2);
            }
            String str3 = relationship.otherState;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherState", str3);
            }
            jsonGenerator.writeBooleanField("needUndoPrompt", relationship.needUndoPrompt);
            String str4 = relationship.message;
            if (str4 != null) {
                jsonGenerator.writeStringField("message", str4);
            }
            String str5 = relationship.otherMessage;
            if (str5 != null) {
                jsonGenerator.writeStringField("otherMessage", str5);
            }
            if (relationship.extend != null) {
                jsonGenerator.writeFieldName("extend");
                RelationshipExtendLetter.JSON_ADAPTER.serialize(relationship.extend, jsonGenerator, true);
            }
            if (relationship.otherStatus != null) {
                jsonGenerator.writeFieldName("otherStatus");
                JsonAdapter.serializeArray(relationship.otherStatus, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            if (relationship.conversationStatus != null) {
                jsonGenerator.writeFieldName("conversationStatus");
                ConversationStatus.JSON_ADAPTER.serialize(relationship.conversationStatus, jsonGenerator, true);
            }
            if (relationship.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(relationship.tags, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            if (relationship.otherTags != null) {
                jsonGenerator.writeFieldName("otherTags");
                JsonAdapter.serializeArray(relationship.otherTags, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            String str6 = relationship.trackerId;
            if (str6 != null) {
                jsonGenerator.writeStringField("trackerId", str6);
            }
            String str7 = relationship.richListTracker;
            if (str7 != null) {
                jsonGenerator.writeStringField("richListTracker", str7);
            }
            if (relationship.localStatus != null) {
                jsonGenerator.writeFieldName("localStatus");
                MatchFrom.JSON_ADAPTER.serialize(relationship.localStatus, jsonGenerator, true);
            }
            String str8 = relationship.ussTracker;
            if (str8 != null) {
                jsonGenerator.writeStringField("ussTracker", str8);
            }
            String str9 = relationship.consumeType;
            if (str9 != null) {
                jsonGenerator.writeStringField("consumeType", str9);
            }
            String str10 = relationship.avatarIdentifier;
            if (str10 != null) {
                jsonGenerator.writeStringField("avatarIdentifier", str10);
            }
            String str11 = relationship.coinSign;
            if (str11 != null) {
                jsonGenerator.writeStringField("coinSign", str11);
            }
            String str12 = relationship.localLikeFrom;
            if (str12 != null) {
                jsonGenerator.writeStringField("localLikeFrom", str12);
            }
            if (relationship.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(relationship.topics, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (relationship.relationshipExtensions != null) {
                jsonGenerator.writeFieldName(Extensions.TYPE);
                RelationshipExtensions.JSON_ADAPTER.serialize(relationship.relationshipExtensions, jsonGenerator, true);
            }
            String str13 = relationship.anonymousLikeItemId;
            if (str13 != null) {
                jsonGenerator.writeStringField("anonymousLikeItemId", str13);
            }
            String str14 = relationship.useAnonymousLikeItemId;
            if (str14 != null) {
                jsonGenerator.writeStringField("useAnonymousLikeItemId", str14);
            }
            String str15 = relationship.scene;
            if (str15 != null) {
                jsonGenerator.writeStringField("scene", str15);
            }
            String str16 = relationship.kankanId;
            if (str16 != null) {
                jsonGenerator.writeStringField("kankanId", str16);
            }
            String str17 = relationship.otherKankanId;
            if (str17 != null) {
                jsonGenerator.writeStringField("otherKankanId", str17);
            }
            String str18 = relationship.convType;
            if (str18 != null) {
                jsonGenerator.writeStringField("convType", str18);
            }
            if (relationship.dclExtensions != null) {
                jsonGenerator.writeFieldName("dclExtensions");
                DclExtensions.JSON_ADAPTER.serialize(relationship.dclExtensions, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("likeProfileId", relationship.likeProfileId);
            if (relationship.cardInfo != null) {
                jsonGenerator.writeFieldName("cardInfo");
                SwipeCardInfo.JSON_ADAPTER.serialize(relationship.cardInfo, jsonGenerator, true);
            }
            String str19 = relationship.diamondSign;
            if (str19 != null) {
                jsonGenerator.writeStringField("diamondSign", str19);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Relationship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Relationship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MatchFrom m61247a(MatchFrom matchFrom) {
        return matchFrom;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MatchFrom m61248b(MatchFrom matchFrom) {
        return matchFrom;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m61249c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m61250d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ MatchFrom m61251e(MatchFrom matchFrom) {
        return matchFrom;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ MatchFrom m61252f(MatchFrom matchFrom) {
        return matchFrom;
    }

    public static Relationship new_() {
        Relationship relationship = new Relationship();
        relationship.nullCheck();
        return relationship;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Relationship mo225055clone() {
        Relationship relationship = new Relationship();
        relationship.state = this.state;
        List<MatchFrom> list = this.status;
        if (list != null) {
            relationship.status = ValueObject.util_map(list, new qcj() { // from class: l.qwc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61247a((MatchFrom) obj);
                }
            });
        }
        relationship.createdTime = this.createdTime;
        relationship.f39654id = this.f39654id;
        List<String> list2 = this.scenarios;
        if (list2 != null) {
            relationship.scenarios = ValueObject.util_map(list2, new qcj() { // from class: l.rwc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61249c((String) obj);
                }
            });
        }
        relationship.updateTime = this.updateTime;
        relationship.picksTracker = this.picksTracker;
        relationship.otherState = this.otherState;
        relationship.needUndoPrompt = this.needUndoPrompt;
        relationship.message = this.message;
        relationship.otherMessage = this.otherMessage;
        RelationshipExtendLetter relationshipExtendLetter = this.extend;
        if (relationshipExtendLetter != null) {
            relationship.extend = relationshipExtendLetter.mo225055clone();
        }
        List<MatchFrom> list3 = this.otherStatus;
        if (list3 != null) {
            relationship.otherStatus = ValueObject.util_map(list3, new qcj() { // from class: l.swc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61251e((MatchFrom) obj);
                }
            });
        }
        relationship.conversationStatus = this.conversationStatus;
        List<MatchFrom> list4 = this.tags;
        if (list4 != null) {
            relationship.tags = ValueObject.util_map(list4, new qcj() { // from class: l.twc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61252f((MatchFrom) obj);
                }
            });
        }
        List<MatchFrom> list5 = this.otherTags;
        if (list5 != null) {
            relationship.otherTags = ValueObject.util_map(list5, new qcj() { // from class: l.uwc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61248b((MatchFrom) obj);
                }
            });
        }
        relationship.trackerId = this.trackerId;
        relationship.richListTracker = this.richListTracker;
        relationship.localStatus = this.localStatus;
        relationship.ussTracker = this.ussTracker;
        relationship.consumeType = this.consumeType;
        relationship.avatarIdentifier = this.avatarIdentifier;
        relationship.coinSign = this.coinSign;
        relationship.localLikeFrom = this.localLikeFrom;
        List<String> list6 = this.topics;
        if (list6 != null) {
            relationship.topics = ValueObject.util_map(list6, new qcj() { // from class: l.vwc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Relationship.m61250d((String) obj);
                }
            });
        }
        RelationshipExtensions relationshipExtensions = this.relationshipExtensions;
        if (relationshipExtensions != null) {
            relationship.relationshipExtensions = relationshipExtensions.mo225055clone();
        }
        relationship.anonymousLikeItemId = this.anonymousLikeItemId;
        relationship.useAnonymousLikeItemId = this.useAnonymousLikeItemId;
        relationship.scene = this.scene;
        relationship.kankanId = this.kankanId;
        relationship.otherKankanId = this.otherKankanId;
        relationship.convType = this.convType;
        DclExtensions dclExtensions = this.dclExtensions;
        if (dclExtensions != null) {
            relationship.dclExtensions = dclExtensions.mo225055clone();
        }
        relationship.likeProfileId = this.likeProfileId;
        SwipeCardInfo swipeCardInfo = this.cardInfo;
        if (swipeCardInfo != null) {
            relationship.cardInfo = swipeCardInfo.mo225055clone();
        }
        relationship.diamondSign = this.diamondSign;
        return relationship;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Relationship)) {
            return false;
        }
        Relationship relationship = (Relationship) obj;
        return ValueObject.util_equals(this.state, relationship.state) && ValueObject.util_equals(this.status, relationship.status) && this.createdTime == relationship.createdTime && ValueObject.util_equals(this.f39654id, relationship.f39654id) && ValueObject.util_equals(this.scenarios, relationship.scenarios) && this.updateTime == relationship.updateTime && ValueObject.util_equals(this.picksTracker, relationship.picksTracker) && ValueObject.util_equals(this.otherState, relationship.otherState) && this.needUndoPrompt == relationship.needUndoPrompt && ValueObject.util_equals(this.message, relationship.message) && ValueObject.util_equals(this.otherMessage, relationship.otherMessage) && ValueObject.util_equals(this.extend, relationship.extend) && ValueObject.util_equals(this.otherStatus, relationship.otherStatus) && ValueObject.util_equals(this.conversationStatus, relationship.conversationStatus) && ValueObject.util_equals(this.tags, relationship.tags) && ValueObject.util_equals(this.otherTags, relationship.otherTags) && ValueObject.util_equals(this.trackerId, relationship.trackerId) && ValueObject.util_equals(this.richListTracker, relationship.richListTracker) && ValueObject.util_equals(this.localStatus, relationship.localStatus) && ValueObject.util_equals(this.ussTracker, relationship.ussTracker) && ValueObject.util_equals(this.consumeType, relationship.consumeType) && ValueObject.util_equals(this.avatarIdentifier, relationship.avatarIdentifier) && ValueObject.util_equals(this.coinSign, relationship.coinSign) && ValueObject.util_equals(this.localLikeFrom, relationship.localLikeFrom) && ValueObject.util_equals(this.topics, relationship.topics) && ValueObject.util_equals(this.relationshipExtensions, relationship.relationshipExtensions) && ValueObject.util_equals(this.anonymousLikeItemId, relationship.anonymousLikeItemId) && ValueObject.util_equals(this.useAnonymousLikeItemId, relationship.useAnonymousLikeItemId) && ValueObject.util_equals(this.scene, relationship.scene) && ValueObject.util_equals(this.kankanId, relationship.kankanId) && ValueObject.util_equals(this.otherKankanId, relationship.otherKankanId) && ValueObject.util_equals(this.convType, relationship.convType) && ValueObject.util_equals(this.dclExtensions, relationship.dclExtensions) && this.likeProfileId == relationship.likeProfileId && ValueObject.util_equals(this.cardInfo, relationship.cardInfo) && ValueObject.util_equals(this.diamondSign, relationship.diamondSign);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "relationship";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        RelationshipStatus relationshipStatus = this.state;
        int iHashCode = (i2 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        List<MatchFrom> list = this.status;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.f39654id;
        int iHashCode3 = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.scenarios;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updateTime);
        int i4 = ((iHashCode4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str2 = this.picksTracker;
        int iHashCode5 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherState;
        int iHashCode6 = (((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.needUndoPrompt ? 1231 : 1237)) * 41;
        String str4 = this.message;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.otherMessage;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        RelationshipExtendLetter relationshipExtendLetter = this.extend;
        int iHashCode9 = (iHashCode8 + (relationshipExtendLetter != null ? relationshipExtendLetter.hashCode() : 0)) * 41;
        List<MatchFrom> list3 = this.otherStatus;
        int iHashCode10 = (iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 41;
        ConversationStatus conversationStatus = this.conversationStatus;
        int iHashCode11 = (iHashCode10 + (conversationStatus != null ? conversationStatus.hashCode() : 0)) * 41;
        List<MatchFrom> list4 = this.tags;
        int iHashCode12 = (iHashCode11 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<MatchFrom> list5 = this.otherTags;
        int iHashCode13 = (iHashCode12 + (list5 != null ? list5.hashCode() : 0)) * 41;
        String str6 = this.trackerId;
        int iHashCode14 = (iHashCode13 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.richListTracker;
        int iHashCode15 = (iHashCode14 + (str7 != null ? str7.hashCode() : 0)) * 41;
        MatchFrom matchFrom = this.localStatus;
        int iHashCode16 = (iHashCode15 + (matchFrom != null ? matchFrom.hashCode() : 0)) * 41;
        String str8 = this.ussTracker;
        int iHashCode17 = (iHashCode16 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.consumeType;
        int iHashCode18 = (iHashCode17 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.avatarIdentifier;
        int iHashCode19 = (iHashCode18 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.coinSign;
        int iHashCode20 = (iHashCode19 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.localLikeFrom;
        int iHashCode21 = (iHashCode20 + (str12 != null ? str12.hashCode() : 0)) * 41;
        List<String> list6 = this.topics;
        int iHashCode22 = (iHashCode21 + (list6 != null ? list6.hashCode() : 0)) * 41;
        RelationshipExtensions relationshipExtensions = this.relationshipExtensions;
        int iHashCode23 = (iHashCode22 + (relationshipExtensions != null ? relationshipExtensions.hashCode() : 0)) * 41;
        String str13 = this.anonymousLikeItemId;
        int iHashCode24 = (iHashCode23 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.useAnonymousLikeItemId;
        int iHashCode25 = (iHashCode24 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.scene;
        int iHashCode26 = (iHashCode25 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.kankanId;
        int iHashCode27 = (iHashCode26 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.otherKankanId;
        int iHashCode28 = (iHashCode27 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.convType;
        int iHashCode29 = (iHashCode28 + (str18 != null ? str18.hashCode() : 0)) * 41;
        DclExtensions dclExtensions = this.dclExtensions;
        int iHashCode30 = (((iHashCode29 + (dclExtensions != null ? dclExtensions.hashCode() : 0)) * 41) + this.likeProfileId) * 41;
        SwipeCardInfo swipeCardInfo = this.cardInfo;
        int iHashCode31 = (iHashCode30 + (swipeCardInfo != null ? swipeCardInfo.hashCode() : 0)) * 41;
        String str19 = this.diamondSign;
        int iHashCode32 = iHashCode31 + (str19 != null ? str19.hashCode() : 0);
        this.hashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
        if (this.f39654id == null) {
            this.f39654id = "";
        }
        if (this.scenarios == null) {
            this.scenarios = new ArrayList();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
        if (this.otherStatus == null) {
            this.otherStatus = new ArrayList();
        }
        if (this.conversationStatus == null) {
            this.conversationStatus = (ConversationStatus) ConversationStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.otherTags == null) {
            this.otherTags = new ArrayList();
        }
        if (this.trackerId == null) {
            this.trackerId = "";
        }
        if (this.richListTracker == null) {
            this.richListTracker = "";
        }
        if (this.localStatus == null) {
            this.localStatus = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
        }
        if (this.scene == null) {
            this.scene = "";
        }
        if (this.convType == null) {
            this.convType = "";
        }
        if (this.dclExtensions == null) {
            this.dclExtensions = DclExtensions.new_();
        }
        if (this.diamondSign == null) {
            this.diamondSign = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
