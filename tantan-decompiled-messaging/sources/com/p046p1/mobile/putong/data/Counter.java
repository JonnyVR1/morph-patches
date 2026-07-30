package com.p046p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.BoostLimit;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes12.dex */
public class Counter extends ValueObject<Counter> implements Cloneable, Serializable {
    public static final String TYPE = "counter";

    @NonNull
    @ProtobufIndex(index = 2)
    public CounterActivities activities;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BoostLimit> boostLimits;

    @NonNull
    @ProtobufIndex(index = 21)
    public FakeLikeLimits fakeLikeLimits;

    @NonNull
    @ProtobufIndex(index = 22)
    public FeedFlower flower;

    @NonNull
    @ProtobufIndex(index = 6)
    public CounterFollowShips followships;

    @NonNull
    @ProtobufIndex(index = 13)
    public CounterFriendReminder friendReminders;

    @NonNull
    @ProtobufIndex(index = 18)
    public CounterGrowth growth;

    @NonNull
    @ProtobufIndex(index = 16)
    public CounterKankan kankan;

    @NonNull
    @ProtobufIndex(index = 1)
    public CounterLikeLimit likeLimit;

    @NonNull
    @ProtobufIndex(index = 9)
    public LikersLimit likersLimit;

    @NonNull
    @ProtobufIndex(index = 10)
    public LiveChatLimit liveChatLimit;

    @NonNull
    @ProtobufIndex(index = 12)
    public LivePushLimit livePushLimit;

    @NonNull
    @ProtobufIndex(index = 7)
    public CouterMoments moments;

    @NonNull
    @ProtobufIndex(index = 11)
    public Mytantan mytantan;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 20)
    public CounterPickUsers pickUsers;

    @NonNull
    @ProtobufIndex(index = 19)
    public ProfileLike profileLike;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public CounterSecretCrushLimit secretCrushLimit;

    @NonNull
    @ProtobufIndex(index = 15)
    public CounterShuoshuo shuoshuos;

    @NonNull
    @ProtobufIndex(index = 4)
    public CounterSuperlikeAndUndoLimit superLikeLimit;

    @NonNull
    @ProtobufIndex(index = 17)
    public Swipes swipes;

    @NonNull
    @ProtobufIndex(index = 5)
    public CounterSuperlikeAndUndoLimit undoLimit;

    @NonNull
    @ProtobufIndex(index = 23)
    public VerificationLimit verification;

    @NonNull
    @ProtobufIndex(index = 14)
    public CounterViewer viewers;
    public static ProtobufAdapter<Counter> PROTOBUF_ADAPTER = new MessageNanoAdapter<Counter>() { // from class: com.p1.mobile.putong.data.Counter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Counter counter) {
            CounterLikeLimit counterLikeLimit = counter.likeLimit;
            int iM17230l = counterLikeLimit != null ? CodedOutputByteBufferNano.m17230l(1, counterLikeLimit, CounterLikeLimit.PROTOBUF_ADAPTER) : 0;
            CounterActivities counterActivities = counter.activities;
            if (counterActivities != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, counterActivities, CounterActivities.PROTOBUF_ADAPTER);
            }
            CounterSecretCrushLimit counterSecretCrushLimit = counter.secretCrushLimit;
            if (counterSecretCrushLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, counterSecretCrushLimit, CounterSecretCrushLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counter.superLikeLimit;
            if (counterSuperlikeAndUndoLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, counterSuperlikeAndUndoLimit, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counter.undoLimit;
            if (counterSuperlikeAndUndoLimit2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, counterSuperlikeAndUndoLimit2, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterFollowShips counterFollowShips = counter.followships;
            if (counterFollowShips != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, counterFollowShips, CounterFollowShips.PROTOBUF_ADAPTER);
            }
            CouterMoments couterMoments = counter.moments;
            if (couterMoments != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, couterMoments, CouterMoments.PROTOBUF_ADAPTER);
            }
            List<BoostLimit> list = counter.boostLimits;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list, BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LikersLimit likersLimit = counter.likersLimit;
            if (likersLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, likersLimit, LikersLimit.PROTOBUF_ADAPTER);
            }
            LiveChatLimit liveChatLimit = counter.liveChatLimit;
            if (liveChatLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(10, liveChatLimit, LiveChatLimit.PROTOBUF_ADAPTER);
            }
            Mytantan mytantan = counter.mytantan;
            if (mytantan != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(11, mytantan, Mytantan.PROTOBUF_ADAPTER);
            }
            LivePushLimit livePushLimit = counter.livePushLimit;
            if (livePushLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(12, livePushLimit, LivePushLimit.PROTOBUF_ADAPTER);
            }
            CounterFriendReminder counterFriendReminder = counter.friendReminders;
            if (counterFriendReminder != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(13, counterFriendReminder, CounterFriendReminder.PROTOBUF_ADAPTER);
            }
            CounterViewer counterViewer = counter.viewers;
            if (counterViewer != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(14, counterViewer, CounterViewer.PROTOBUF_ADAPTER);
            }
            CounterShuoshuo counterShuoshuo = counter.shuoshuos;
            if (counterShuoshuo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(15, counterShuoshuo, CounterShuoshuo.PROTOBUF_ADAPTER);
            }
            CounterKankan counterKankan = counter.kankan;
            if (counterKankan != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(16, counterKankan, CounterKankan.PROTOBUF_ADAPTER);
            }
            Swipes swipes = counter.swipes;
            if (swipes != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(17, swipes, Swipes.PROTOBUF_ADAPTER);
            }
            CounterGrowth counterGrowth = counter.growth;
            if (counterGrowth != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(18, counterGrowth, CounterGrowth.PROTOBUF_ADAPTER);
            }
            ProfileLike profileLike = counter.profileLike;
            if (profileLike != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(19, profileLike, ProfileLike.PROTOBUF_ADAPTER);
            }
            CounterPickUsers counterPickUsers = counter.pickUsers;
            if (counterPickUsers != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(20, counterPickUsers, CounterPickUsers.PROTOBUF_ADAPTER);
            }
            FakeLikeLimits fakeLikeLimits = counter.fakeLikeLimits;
            if (fakeLikeLimits != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(21, fakeLikeLimits, FakeLikeLimits.PROTOBUF_ADAPTER);
            }
            FeedFlower feedFlower = counter.flower;
            if (feedFlower != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(22, feedFlower, FeedFlower.PROTOBUF_ADAPTER);
            }
            VerificationLimit verificationLimit = counter.verification;
            if (verificationLimit != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(23, verificationLimit, VerificationLimit.PROTOBUF_ADAPTER);
            }
            counter.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Counter parse(nb5 nb5Var) throws IOException {
            Counter counter = new Counter();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (counter.likeLimit == null) {
                            counter.likeLimit = CounterLikeLimit.new_();
                        }
                        if (counter.activities == null) {
                            counter.activities = CounterActivities.new_();
                        }
                        if (counter.secretCrushLimit == null) {
                            counter.secretCrushLimit = CounterSecretCrushLimit.new_();
                        }
                        if (counter.superLikeLimit == null) {
                            counter.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.undoLimit == null) {
                            counter.undoLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.followships == null) {
                            counter.followships = CounterFollowShips.new_();
                        }
                        if (counter.moments == null) {
                            counter.moments = CouterMoments.new_();
                        }
                        if (counter.boostLimits == null) {
                            counter.boostLimits = new ArrayList();
                        }
                        if (counter.likersLimit == null) {
                            counter.likersLimit = LikersLimit.new_();
                        }
                        if (counter.liveChatLimit == null) {
                            counter.liveChatLimit = LiveChatLimit.new_();
                        }
                        if (counter.mytantan == null) {
                            counter.mytantan = Mytantan.new_();
                        }
                        if (counter.livePushLimit == null) {
                            counter.livePushLimit = LivePushLimit.new_();
                        }
                        if (counter.friendReminders == null) {
                            counter.friendReminders = CounterFriendReminder.new_();
                        }
                        if (counter.viewers == null) {
                            counter.viewers = CounterViewer.new_();
                        }
                        if (counter.shuoshuos == null) {
                            counter.shuoshuos = CounterShuoshuo.new_();
                        }
                        if (counter.kankan == null) {
                            counter.kankan = CounterKankan.new_();
                        }
                        if (counter.swipes == null) {
                            counter.swipes = Swipes.new_();
                        }
                        if (counter.growth == null) {
                            counter.growth = CounterGrowth.new_();
                        }
                        if (counter.profileLike == null) {
                            counter.profileLike = ProfileLike.new_();
                        }
                        if (counter.pickUsers == null) {
                            counter.pickUsers = CounterPickUsers.new_();
                        }
                        if (counter.fakeLikeLimits == null) {
                            counter.fakeLikeLimits = FakeLikeLimits.new_();
                        }
                        if (counter.flower == null) {
                            counter.flower = FeedFlower.new_();
                        }
                        if (counter.verification == null) {
                            counter.verification = VerificationLimit.new_();
                        }
                        break;
                    case 10:
                        counter.likeLimit = (CounterLikeLimit) nb5Var.m158743l(CounterLikeLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        counter.activities = (CounterActivities) nb5Var.m158743l(CounterActivities.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        counter.secretCrushLimit = (CounterSecretCrushLimit) nb5Var.m158743l(CounterSecretCrushLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        counter.superLikeLimit = (CounterSuperlikeAndUndoLimit) nb5Var.m158743l(CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        counter.undoLimit = (CounterSuperlikeAndUndoLimit) nb5Var.m158743l(CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        counter.followships = (CounterFollowShips) nb5Var.m158743l(CounterFollowShips.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        counter.moments = (CouterMoments) nb5Var.m158743l(CouterMoments.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        counter.boostLimits = (List) nb5Var.m158743l(BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        counter.likersLimit = (LikersLimit) nb5Var.m158743l(LikersLimit.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        counter.liveChatLimit = (LiveChatLimit) nb5Var.m158743l(LiveChatLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        counter.mytantan = (Mytantan) nb5Var.m158743l(Mytantan.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        counter.livePushLimit = (LivePushLimit) nb5Var.m158743l(LivePushLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        counter.friendReminders = (CounterFriendReminder) nb5Var.m158743l(CounterFriendReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        counter.viewers = (CounterViewer) nb5Var.m158743l(CounterViewer.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        counter.shuoshuos = (CounterShuoshuo) nb5Var.m158743l(CounterShuoshuo.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        counter.kankan = (CounterKankan) nb5Var.m158743l(CounterKankan.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        counter.swipes = (Swipes) nb5Var.m158743l(Swipes.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        counter.growth = (CounterGrowth) nb5Var.m158743l(CounterGrowth.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        counter.profileLike = (ProfileLike) nb5Var.m158743l(ProfileLike.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        counter.pickUsers = (CounterPickUsers) nb5Var.m158743l(CounterPickUsers.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        counter.fakeLikeLimits = (FakeLikeLimits) nb5Var.m158743l(FakeLikeLimits.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        counter.flower = (FeedFlower) nb5Var.m158743l(FeedFlower.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        counter.verification = (VerificationLimit) nb5Var.m158743l(VerificationLimit.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (counter.likeLimit == null) {
                            counter.likeLimit = CounterLikeLimit.new_();
                        }
                        if (counter.activities == null) {
                            counter.activities = CounterActivities.new_();
                        }
                        if (counter.secretCrushLimit == null) {
                            counter.secretCrushLimit = CounterSecretCrushLimit.new_();
                        }
                        if (counter.superLikeLimit == null) {
                            counter.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.undoLimit == null) {
                            counter.undoLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.followships == null) {
                            counter.followships = CounterFollowShips.new_();
                        }
                        if (counter.moments == null) {
                            counter.moments = CouterMoments.new_();
                        }
                        if (counter.boostLimits == null) {
                            counter.boostLimits = new ArrayList();
                        }
                        if (counter.likersLimit == null) {
                            counter.likersLimit = LikersLimit.new_();
                        }
                        if (counter.liveChatLimit == null) {
                            counter.liveChatLimit = LiveChatLimit.new_();
                        }
                        if (counter.mytantan == null) {
                            counter.mytantan = Mytantan.new_();
                        }
                        if (counter.livePushLimit == null) {
                            counter.livePushLimit = LivePushLimit.new_();
                        }
                        if (counter.friendReminders == null) {
                            counter.friendReminders = CounterFriendReminder.new_();
                        }
                        if (counter.viewers == null) {
                            counter.viewers = CounterViewer.new_();
                        }
                        if (counter.shuoshuos == null) {
                            counter.shuoshuos = CounterShuoshuo.new_();
                        }
                        if (counter.kankan == null) {
                            counter.kankan = CounterKankan.new_();
                        }
                        if (counter.swipes == null) {
                            counter.swipes = Swipes.new_();
                        }
                        if (counter.growth == null) {
                            counter.growth = CounterGrowth.new_();
                        }
                        if (counter.profileLike == null) {
                            counter.profileLike = ProfileLike.new_();
                        }
                        if (counter.pickUsers == null) {
                            counter.pickUsers = CounterPickUsers.new_();
                        }
                        if (counter.fakeLikeLimits == null) {
                            counter.fakeLikeLimits = FakeLikeLimits.new_();
                        }
                        if (counter.flower == null) {
                            counter.flower = FeedFlower.new_();
                        }
                        if (counter.verification == null) {
                            counter.verification = VerificationLimit.new_();
                            return counter;
                        }
                        break;
                }
            }
            return counter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Counter counter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CounterLikeLimit counterLikeLimit = counter.likeLimit;
            if (counterLikeLimit != null) {
                codedOutputByteBufferNano.m17254K(1, counterLikeLimit, CounterLikeLimit.PROTOBUF_ADAPTER);
            }
            CounterActivities counterActivities = counter.activities;
            if (counterActivities != null) {
                codedOutputByteBufferNano.m17254K(2, counterActivities, CounterActivities.PROTOBUF_ADAPTER);
            }
            CounterSecretCrushLimit counterSecretCrushLimit = counter.secretCrushLimit;
            if (counterSecretCrushLimit != null) {
                codedOutputByteBufferNano.m17254K(3, counterSecretCrushLimit, CounterSecretCrushLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counter.superLikeLimit;
            if (counterSuperlikeAndUndoLimit != null) {
                codedOutputByteBufferNano.m17254K(4, counterSuperlikeAndUndoLimit, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counter.undoLimit;
            if (counterSuperlikeAndUndoLimit2 != null) {
                codedOutputByteBufferNano.m17254K(5, counterSuperlikeAndUndoLimit2, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterFollowShips counterFollowShips = counter.followships;
            if (counterFollowShips != null) {
                codedOutputByteBufferNano.m17254K(6, counterFollowShips, CounterFollowShips.PROTOBUF_ADAPTER);
            }
            CouterMoments couterMoments = counter.moments;
            if (couterMoments != null) {
                codedOutputByteBufferNano.m17254K(7, couterMoments, CouterMoments.PROTOBUF_ADAPTER);
            }
            List<BoostLimit> list = counter.boostLimits;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(8, list, BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LikersLimit likersLimit = counter.likersLimit;
            if (likersLimit != null) {
                codedOutputByteBufferNano.m17254K(9, likersLimit, LikersLimit.PROTOBUF_ADAPTER);
            }
            LiveChatLimit liveChatLimit = counter.liveChatLimit;
            if (liveChatLimit != null) {
                codedOutputByteBufferNano.m17254K(10, liveChatLimit, LiveChatLimit.PROTOBUF_ADAPTER);
            }
            Mytantan mytantan = counter.mytantan;
            if (mytantan != null) {
                codedOutputByteBufferNano.m17254K(11, mytantan, Mytantan.PROTOBUF_ADAPTER);
            }
            LivePushLimit livePushLimit = counter.livePushLimit;
            if (livePushLimit != null) {
                codedOutputByteBufferNano.m17254K(12, livePushLimit, LivePushLimit.PROTOBUF_ADAPTER);
            }
            CounterFriendReminder counterFriendReminder = counter.friendReminders;
            if (counterFriendReminder != null) {
                codedOutputByteBufferNano.m17254K(13, counterFriendReminder, CounterFriendReminder.PROTOBUF_ADAPTER);
            }
            CounterViewer counterViewer = counter.viewers;
            if (counterViewer != null) {
                codedOutputByteBufferNano.m17254K(14, counterViewer, CounterViewer.PROTOBUF_ADAPTER);
            }
            CounterShuoshuo counterShuoshuo = counter.shuoshuos;
            if (counterShuoshuo != null) {
                codedOutputByteBufferNano.m17254K(15, counterShuoshuo, CounterShuoshuo.PROTOBUF_ADAPTER);
            }
            CounterKankan counterKankan = counter.kankan;
            if (counterKankan != null) {
                codedOutputByteBufferNano.m17254K(16, counterKankan, CounterKankan.PROTOBUF_ADAPTER);
            }
            Swipes swipes = counter.swipes;
            if (swipes != null) {
                codedOutputByteBufferNano.m17254K(17, swipes, Swipes.PROTOBUF_ADAPTER);
            }
            CounterGrowth counterGrowth = counter.growth;
            if (counterGrowth != null) {
                codedOutputByteBufferNano.m17254K(18, counterGrowth, CounterGrowth.PROTOBUF_ADAPTER);
            }
            ProfileLike profileLike = counter.profileLike;
            if (profileLike != null) {
                codedOutputByteBufferNano.m17254K(19, profileLike, ProfileLike.PROTOBUF_ADAPTER);
            }
            CounterPickUsers counterPickUsers = counter.pickUsers;
            if (counterPickUsers != null) {
                codedOutputByteBufferNano.m17254K(20, counterPickUsers, CounterPickUsers.PROTOBUF_ADAPTER);
            }
            FakeLikeLimits fakeLikeLimits = counter.fakeLikeLimits;
            if (fakeLikeLimits != null) {
                codedOutputByteBufferNano.m17254K(21, fakeLikeLimits, FakeLikeLimits.PROTOBUF_ADAPTER);
            }
            FeedFlower feedFlower = counter.flower;
            if (feedFlower != null) {
                codedOutputByteBufferNano.m17254K(22, feedFlower, FeedFlower.PROTOBUF_ADAPTER);
            }
            VerificationLimit verificationLimit = counter.verification;
            if (verificationLimit != null) {
                codedOutputByteBufferNano.m17254K(23, verificationLimit, VerificationLimit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Counter> JSON_ADAPTER = new ObjectJsonAdapter<Counter>() { // from class: com.p1.mobile.putong.data.Counter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Counter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Counter newInstance() {
            return new Counter();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Counter counter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1602627657:
                    if (str.equals("liveChatLimit")) {
                        b = 0;
                    }
                    break;
                case -1484401125:
                    if (str.equals("verification")) {
                        b = 1;
                    }
                    break;
                case -1446049177:
                    if (str.equals("pickUsers")) {
                        b = 2;
                    }
                    break;
                case -1271629221:
                    if (str.equals("flower")) {
                        b = 3;
                    }
                    break;
                case -1237458489:
                    if (str.equals("growth")) {
                        b = 4;
                    }
                    break;
                case -1138683648:
                    if (str.equals("kankan")) {
                        b = 5;
                    }
                    break;
                case -1084181419:
                    if (str.equals("shuoshuos")) {
                        b = 6;
                    }
                    break;
                case -1060292464:
                    if (str.equals("secretCrushLimit")) {
                        b = 7;
                    }
                    break;
                case -909394647:
                    if (str.equals("superLikeLimit")) {
                        b = 8;
                    }
                    break;
                case -889476999:
                    if (str.equals(Swipes.TYPE)) {
                        b = 9;
                    }
                    break;
                case -775851721:
                    if (str.equals("undoLimit")) {
                        b = 10;
                    }
                    break;
                case -181480860:
                    if (str.equals("likeLimit")) {
                        b = 11;
                    }
                    break;
                case 120515852:
                    if (str.equals("mytantan")) {
                        b = 12;
                    }
                    break;
                case 177451232:
                    if (str.equals(SummarizedPrivilegesId.profileLike)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 303613237:
                    if (str.equals("livePushLimit")) {
                        b = 14;
                    }
                    break;
                case 454234273:
                    if (str.equals("viewers")) {
                        b = 15;
                    }
                    break;
                case 968252200:
                    if (str.equals("seeLimit")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 17;
                    }
                    break;
                case 1272057298:
                    if (str.equals("friend-reminders")) {
                        b = 18;
                    }
                    break;
                case 1597355419:
                    if (str.equals("boostLimits")) {
                        b = 19;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 20;
                    }
                    break;
                case 2048605165:
                    if (str.equals("activities")) {
                        b = 21;
                    }
                    break;
                case 2063321028:
                    if (str.equals("fakeLikeLimits")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    counter.liveChatLimit = LiveChatLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    counter.verification = VerificationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    counter.pickUsers = CounterPickUsers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    counter.flower = FeedFlower.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    counter.growth = CounterGrowth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    counter.kankan = CounterKankan.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    counter.shuoshuos = CounterShuoshuo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    counter.secretCrushLimit = CounterSecretCrushLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    counter.superLikeLimit = CounterSuperlikeAndUndoLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    counter.swipes = Swipes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    counter.undoLimit = CounterSuperlikeAndUndoLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    counter.likeLimit = CounterLikeLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    counter.mytantan = Mytantan.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    counter.profileLike = ProfileLike.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    counter.livePushLimit = LivePushLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    counter.viewers = CounterViewer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    counter.likersLimit = LikersLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    counter.moments = CouterMoments.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    counter.friendReminders = CounterFriendReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    counter.boostLimits = JsonAdapter.parseArray(jsonParser, BoostLimit.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    counter.followships = CounterFollowShips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    counter.activities = CounterActivities.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    counter.fakeLikeLimits = FakeLikeLimits.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Counter counter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1602627657:
                    if (str.equals("liveChatLimit")) {
                        b = 0;
                    }
                    break;
                case -1484401125:
                    if (str.equals("verification")) {
                        b = 1;
                    }
                    break;
                case -1446049177:
                    if (str.equals("pickUsers")) {
                        b = 2;
                    }
                    break;
                case -1271629221:
                    if (str.equals("flower")) {
                        b = 3;
                    }
                    break;
                case -1237458489:
                    if (str.equals("growth")) {
                        b = 4;
                    }
                    break;
                case -1138683648:
                    if (str.equals("kankan")) {
                        b = 5;
                    }
                    break;
                case -1084181419:
                    if (str.equals("shuoshuos")) {
                        b = 6;
                    }
                    break;
                case -1060292464:
                    if (str.equals("secretCrushLimit")) {
                        b = 7;
                    }
                    break;
                case -909394647:
                    if (str.equals("superLikeLimit")) {
                        b = 8;
                    }
                    break;
                case -889476999:
                    if (str.equals(Swipes.TYPE)) {
                        b = 9;
                    }
                    break;
                case -775851721:
                    if (str.equals("undoLimit")) {
                        b = 10;
                    }
                    break;
                case -181480860:
                    if (str.equals("likeLimit")) {
                        b = 11;
                    }
                    break;
                case 120515852:
                    if (str.equals("mytantan")) {
                        b = 12;
                    }
                    break;
                case 177451232:
                    if (str.equals(SummarizedPrivilegesId.profileLike)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 303613237:
                    if (str.equals("livePushLimit")) {
                        b = 14;
                    }
                    break;
                case 454234273:
                    if (str.equals("viewers")) {
                        b = 15;
                    }
                    break;
                case 968252200:
                    if (str.equals("seeLimit")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 17;
                    }
                    break;
                case 1272057298:
                    if (str.equals("friend-reminders")) {
                        b = 18;
                    }
                    break;
                case 1597355419:
                    if (str.equals("boostLimits")) {
                        b = 19;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 20;
                    }
                    break;
                case 2048605165:
                    if (str.equals("activities")) {
                        b = 21;
                    }
                    break;
                case 2063321028:
                    if (str.equals("fakeLikeLimits")) {
                        b = 22;
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
                case 19:
                case 20:
                case 21:
                case 22:
                    return true;
                default:
                    return super.parseFieldCheck(counter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Counter counter, JsonGenerator jsonGenerator) throws IOException {
            if (counter.likeLimit != null) {
                jsonGenerator.writeFieldName("likeLimit");
                CounterLikeLimit.JSON_ADAPTER.serialize(counter.likeLimit, jsonGenerator, true);
            }
            if (counter.activities != null) {
                jsonGenerator.writeFieldName("activities");
                CounterActivities.JSON_ADAPTER.serialize(counter.activities, jsonGenerator, true);
            }
            if (counter.secretCrushLimit != null) {
                jsonGenerator.writeFieldName("secretCrushLimit");
                CounterSecretCrushLimit.JSON_ADAPTER.serialize(counter.secretCrushLimit, jsonGenerator, true);
            }
            if (counter.superLikeLimit != null) {
                jsonGenerator.writeFieldName("superLikeLimit");
                CounterSuperlikeAndUndoLimit.JSON_ADAPTER.serialize(counter.superLikeLimit, jsonGenerator, true);
            }
            if (counter.undoLimit != null) {
                jsonGenerator.writeFieldName("undoLimit");
                CounterSuperlikeAndUndoLimit.JSON_ADAPTER.serialize(counter.undoLimit, jsonGenerator, true);
            }
            if (counter.followships != null) {
                jsonGenerator.writeFieldName("followships");
                CounterFollowShips.JSON_ADAPTER.serialize(counter.followships, jsonGenerator, true);
            }
            if (counter.moments != null) {
                jsonGenerator.writeFieldName(Moments.TYPE);
                CouterMoments.JSON_ADAPTER.serialize(counter.moments, jsonGenerator, true);
            }
            if (counter.boostLimits != null) {
                jsonGenerator.writeFieldName("boostLimits");
                JsonAdapter.serializeArray(counter.boostLimits, jsonGenerator, BoostLimit.JSON_ADAPTER);
            }
            if (counter.likersLimit != null) {
                jsonGenerator.writeFieldName("seeLimit");
                LikersLimit.JSON_ADAPTER.serialize(counter.likersLimit, jsonGenerator, true);
            }
            if (counter.liveChatLimit != null) {
                jsonGenerator.writeFieldName("liveChatLimit");
                LiveChatLimit.JSON_ADAPTER.serialize(counter.liveChatLimit, jsonGenerator, true);
            }
            if (counter.mytantan != null) {
                jsonGenerator.writeFieldName("mytantan");
                Mytantan.JSON_ADAPTER.serialize(counter.mytantan, jsonGenerator, true);
            }
            if (counter.livePushLimit != null) {
                jsonGenerator.writeFieldName("livePushLimit");
                LivePushLimit.JSON_ADAPTER.serialize(counter.livePushLimit, jsonGenerator, true);
            }
            if (counter.friendReminders != null) {
                jsonGenerator.writeFieldName("friend-reminders");
                CounterFriendReminder.JSON_ADAPTER.serialize(counter.friendReminders, jsonGenerator, true);
            }
            if (counter.viewers != null) {
                jsonGenerator.writeFieldName("viewers");
                CounterViewer.JSON_ADAPTER.serialize(counter.viewers, jsonGenerator, true);
            }
            if (counter.shuoshuos != null) {
                jsonGenerator.writeFieldName("shuoshuos");
                CounterShuoshuo.JSON_ADAPTER.serialize(counter.shuoshuos, jsonGenerator, true);
            }
            if (counter.kankan != null) {
                jsonGenerator.writeFieldName("kankan");
                CounterKankan.JSON_ADAPTER.serialize(counter.kankan, jsonGenerator, true);
            }
            if (counter.swipes != null) {
                jsonGenerator.writeFieldName(Swipes.TYPE);
                Swipes.JSON_ADAPTER.serialize(counter.swipes, jsonGenerator, true);
            }
            if (counter.growth != null) {
                jsonGenerator.writeFieldName("growth");
                CounterGrowth.JSON_ADAPTER.serialize(counter.growth, jsonGenerator, true);
            }
            if (counter.profileLike != null) {
                jsonGenerator.writeFieldName(SummarizedPrivilegesId.profileLike);
                ProfileLike.JSON_ADAPTER.serialize(counter.profileLike, jsonGenerator, true);
            }
            if (counter.pickUsers != null) {
                jsonGenerator.writeFieldName("pickUsers");
                CounterPickUsers.JSON_ADAPTER.serialize(counter.pickUsers, jsonGenerator, true);
            }
            if (counter.fakeLikeLimits != null) {
                jsonGenerator.writeFieldName("fakeLikeLimits");
                FakeLikeLimits.JSON_ADAPTER.serialize(counter.fakeLikeLimits, jsonGenerator, true);
            }
            if (counter.flower != null) {
                jsonGenerator.writeFieldName("flower");
                FeedFlower.JSON_ADAPTER.serialize(counter.flower, jsonGenerator, true);
            }
            if (counter.verification != null) {
                jsonGenerator.writeFieldName("verification");
                VerificationLimit.JSON_ADAPTER.serialize(counter.verification, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Counter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Counter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Counter new_() {
        Counter counter = new Counter();
        counter.nullCheck();
        return counter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Counter mo223809clone() {
        Counter counter = new Counter();
        CounterLikeLimit counterLikeLimit = this.likeLimit;
        if (counterLikeLimit != null) {
            counter.likeLimit = counterLikeLimit.mo223809clone();
        }
        CounterActivities counterActivities = this.activities;
        if (counterActivities != null) {
            counter.activities = counterActivities.mo223809clone();
        }
        CounterSecretCrushLimit counterSecretCrushLimit = this.secretCrushLimit;
        if (counterSecretCrushLimit != null) {
            counter.secretCrushLimit = counterSecretCrushLimit.mo223809clone();
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = this.superLikeLimit;
        if (counterSuperlikeAndUndoLimit != null) {
            counter.superLikeLimit = counterSuperlikeAndUndoLimit.mo223809clone();
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = this.undoLimit;
        if (counterSuperlikeAndUndoLimit2 != null) {
            counter.undoLimit = counterSuperlikeAndUndoLimit2.mo223809clone();
        }
        CounterFollowShips counterFollowShips = this.followships;
        if (counterFollowShips != null) {
            counter.followships = counterFollowShips.mo223809clone();
        }
        CouterMoments couterMoments = this.moments;
        if (couterMoments != null) {
            counter.moments = couterMoments.mo223809clone();
        }
        List<BoostLimit> list = this.boostLimits;
        if (list != null) {
            counter.boostLimits = ValueObject.util_map(list, new w9j() { // from class: l.jqb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BoostLimit) obj).mo223809clone();
                }
            });
        }
        LikersLimit likersLimit = this.likersLimit;
        if (likersLimit != null) {
            counter.likersLimit = likersLimit.mo223809clone();
        }
        LiveChatLimit liveChatLimit = this.liveChatLimit;
        if (liveChatLimit != null) {
            counter.liveChatLimit = liveChatLimit.mo223809clone();
        }
        Mytantan mytantan = this.mytantan;
        if (mytantan != null) {
            counter.mytantan = mytantan.mo223809clone();
        }
        LivePushLimit livePushLimit = this.livePushLimit;
        if (livePushLimit != null) {
            counter.livePushLimit = livePushLimit.mo223809clone();
        }
        CounterFriendReminder counterFriendReminder = this.friendReminders;
        if (counterFriendReminder != null) {
            counter.friendReminders = counterFriendReminder.mo223809clone();
        }
        CounterViewer counterViewer = this.viewers;
        if (counterViewer != null) {
            counter.viewers = counterViewer.mo223809clone();
        }
        CounterShuoshuo counterShuoshuo = this.shuoshuos;
        if (counterShuoshuo != null) {
            counter.shuoshuos = counterShuoshuo.mo223809clone();
        }
        CounterKankan counterKankan = this.kankan;
        if (counterKankan != null) {
            counter.kankan = counterKankan.mo223809clone();
        }
        Swipes swipes = this.swipes;
        if (swipes != null) {
            counter.swipes = swipes.mo223809clone();
        }
        CounterGrowth counterGrowth = this.growth;
        if (counterGrowth != null) {
            counter.growth = counterGrowth.mo223809clone();
        }
        ProfileLike profileLike = this.profileLike;
        if (profileLike != null) {
            counter.profileLike = profileLike.mo223809clone();
        }
        CounterPickUsers counterPickUsers = this.pickUsers;
        if (counterPickUsers != null) {
            counter.pickUsers = counterPickUsers.mo223809clone();
        }
        FakeLikeLimits fakeLikeLimits = this.fakeLikeLimits;
        if (fakeLikeLimits != null) {
            counter.fakeLikeLimits = fakeLikeLimits.mo223809clone();
        }
        FeedFlower feedFlower = this.flower;
        if (feedFlower != null) {
            counter.flower = feedFlower.mo223809clone();
        }
        VerificationLimit verificationLimit = this.verification;
        if (verificationLimit != null) {
            counter.verification = verificationLimit.mo223809clone();
        }
        return counter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Counter)) {
            return false;
        }
        Counter counter = (Counter) obj;
        return ValueObject.util_equals(this.likeLimit, counter.likeLimit) && ValueObject.util_equals(this.activities, counter.activities) && ValueObject.util_equals(this.secretCrushLimit, counter.secretCrushLimit) && ValueObject.util_equals(this.superLikeLimit, counter.superLikeLimit) && ValueObject.util_equals(this.undoLimit, counter.undoLimit) && ValueObject.util_equals(this.followships, counter.followships) && ValueObject.util_equals(this.moments, counter.moments) && ValueObject.util_equals(this.boostLimits, counter.boostLimits) && ValueObject.util_equals(this.likersLimit, counter.likersLimit) && ValueObject.util_equals(this.liveChatLimit, counter.liveChatLimit) && ValueObject.util_equals(this.mytantan, counter.mytantan) && ValueObject.util_equals(this.livePushLimit, counter.livePushLimit) && ValueObject.util_equals(this.friendReminders, counter.friendReminders) && ValueObject.util_equals(this.viewers, counter.viewers) && ValueObject.util_equals(this.shuoshuos, counter.shuoshuos) && ValueObject.util_equals(this.kankan, counter.kankan) && ValueObject.util_equals(this.swipes, counter.swipes) && ValueObject.util_equals(this.growth, counter.growth) && ValueObject.util_equals(this.profileLike, counter.profileLike) && ValueObject.util_equals(this.pickUsers, counter.pickUsers) && ValueObject.util_equals(this.fakeLikeLimits, counter.fakeLikeLimits) && ValueObject.util_equals(this.flower, counter.flower) && ValueObject.util_equals(this.verification, counter.verification);
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
        CounterLikeLimit counterLikeLimit = this.likeLimit;
        int iHashCode = (i2 + (counterLikeLimit != null ? counterLikeLimit.hashCode() : 0)) * 41;
        CounterActivities counterActivities = this.activities;
        int iHashCode2 = (iHashCode + (counterActivities != null ? counterActivities.hashCode() : 0)) * 41;
        CounterSecretCrushLimit counterSecretCrushLimit = this.secretCrushLimit;
        int iHashCode3 = (iHashCode2 + (counterSecretCrushLimit != null ? counterSecretCrushLimit.hashCode() : 0)) * 41;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = this.superLikeLimit;
        int iHashCode4 = (iHashCode3 + (counterSuperlikeAndUndoLimit != null ? counterSuperlikeAndUndoLimit.hashCode() : 0)) * 41;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = this.undoLimit;
        int iHashCode5 = (iHashCode4 + (counterSuperlikeAndUndoLimit2 != null ? counterSuperlikeAndUndoLimit2.hashCode() : 0)) * 41;
        CounterFollowShips counterFollowShips = this.followships;
        int iHashCode6 = (iHashCode5 + (counterFollowShips != null ? counterFollowShips.hashCode() : 0)) * 41;
        CouterMoments couterMoments = this.moments;
        int iHashCode7 = (iHashCode6 + (couterMoments != null ? couterMoments.hashCode() : 0)) * 41;
        List<BoostLimit> list = this.boostLimits;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        LikersLimit likersLimit = this.likersLimit;
        int iHashCode9 = (iHashCode8 + (likersLimit != null ? likersLimit.hashCode() : 0)) * 41;
        LiveChatLimit liveChatLimit = this.liveChatLimit;
        int iHashCode10 = (iHashCode9 + (liveChatLimit != null ? liveChatLimit.hashCode() : 0)) * 41;
        Mytantan mytantan = this.mytantan;
        int iHashCode11 = (iHashCode10 + (mytantan != null ? mytantan.hashCode() : 0)) * 41;
        LivePushLimit livePushLimit = this.livePushLimit;
        int iHashCode12 = (iHashCode11 + (livePushLimit != null ? livePushLimit.hashCode() : 0)) * 41;
        CounterFriendReminder counterFriendReminder = this.friendReminders;
        int iHashCode13 = (iHashCode12 + (counterFriendReminder != null ? counterFriendReminder.hashCode() : 0)) * 41;
        CounterViewer counterViewer = this.viewers;
        int iHashCode14 = (iHashCode13 + (counterViewer != null ? counterViewer.hashCode() : 0)) * 41;
        CounterShuoshuo counterShuoshuo = this.shuoshuos;
        int iHashCode15 = (iHashCode14 + (counterShuoshuo != null ? counterShuoshuo.hashCode() : 0)) * 41;
        CounterKankan counterKankan = this.kankan;
        int iHashCode16 = (iHashCode15 + (counterKankan != null ? counterKankan.hashCode() : 0)) * 41;
        Swipes swipes = this.swipes;
        int iHashCode17 = (iHashCode16 + (swipes != null ? swipes.hashCode() : 0)) * 41;
        CounterGrowth counterGrowth = this.growth;
        int iHashCode18 = (iHashCode17 + (counterGrowth != null ? counterGrowth.hashCode() : 0)) * 41;
        ProfileLike profileLike = this.profileLike;
        int iHashCode19 = (iHashCode18 + (profileLike != null ? profileLike.hashCode() : 0)) * 41;
        CounterPickUsers counterPickUsers = this.pickUsers;
        int iHashCode20 = (iHashCode19 + (counterPickUsers != null ? counterPickUsers.hashCode() : 0)) * 41;
        FakeLikeLimits fakeLikeLimits = this.fakeLikeLimits;
        int iHashCode21 = (iHashCode20 + (fakeLikeLimits != null ? fakeLikeLimits.hashCode() : 0)) * 41;
        FeedFlower feedFlower = this.flower;
        int iHashCode22 = (iHashCode21 + (feedFlower != null ? feedFlower.hashCode() : 0)) * 41;
        VerificationLimit verificationLimit = this.verification;
        int iHashCode23 = iHashCode22 + (verificationLimit != null ? verificationLimit.hashCode() : 0);
        this.hashCode = iHashCode23;
        return iHashCode23;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Counter counter) {
        if (!shouldMergeData() || equals(counter)) {
            return;
        }
        if (!isFieldParsed("likeLimit")) {
            this.likeLimit = counter.likeLimit;
        }
        if (!isFieldParsed("activities")) {
            this.activities = counter.activities;
        }
        if (!isFieldParsed("secretCrushLimit")) {
            this.secretCrushLimit = counter.secretCrushLimit;
        }
        if (!isFieldParsed("superLikeLimit")) {
            this.superLikeLimit = counter.superLikeLimit;
        }
        if (!isFieldParsed("undoLimit")) {
            this.undoLimit = counter.undoLimit;
        }
        if (!isFieldParsed("followships")) {
            this.followships = counter.followships;
        }
        if (!isFieldParsed(Moments.TYPE)) {
            this.moments = counter.moments;
        }
        if (!isFieldParsed("boostLimits")) {
            this.boostLimits = counter.boostLimits;
        }
        if (!isFieldParsed("seeLimit")) {
            this.likersLimit = counter.likersLimit;
        }
        if (!isFieldParsed("liveChatLimit")) {
            this.liveChatLimit = counter.liveChatLimit;
        }
        if (!isFieldParsed("mytantan")) {
            this.mytantan = counter.mytantan;
        }
        if (!isFieldParsed("livePushLimit")) {
            this.livePushLimit = counter.livePushLimit;
        }
        if (!isFieldParsed("friend-reminders")) {
            this.friendReminders = counter.friendReminders;
        }
        if (!isFieldParsed("viewers")) {
            this.viewers = counter.viewers;
        }
        if (!isFieldParsed("shuoshuos")) {
            this.shuoshuos = counter.shuoshuos;
        }
        if (!isFieldParsed("kankan")) {
            this.kankan = counter.kankan;
        }
        if (!isFieldParsed(Swipes.TYPE)) {
            this.swipes = counter.swipes;
        }
        if (!isFieldParsed("growth")) {
            this.growth = counter.growth;
        }
        if (!isFieldParsed(SummarizedPrivilegesId.profileLike)) {
            this.profileLike = counter.profileLike;
        }
        if (!isFieldParsed("pickUsers")) {
            this.pickUsers = counter.pickUsers;
        }
        if (!isFieldParsed("fakeLikeLimits")) {
            this.fakeLikeLimits = counter.fakeLikeLimits;
        }
        if (!isFieldParsed("flower")) {
            this.flower = counter.flower;
        }
        if (!isFieldParsed("verification")) {
            this.verification = counter.verification;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.likeLimit == null) {
            this.likeLimit = CounterLikeLimit.new_();
        }
        if (this.activities == null) {
            this.activities = CounterActivities.new_();
        }
        if (this.secretCrushLimit == null) {
            this.secretCrushLimit = CounterSecretCrushLimit.new_();
        }
        if (this.superLikeLimit == null) {
            this.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
        }
        if (this.undoLimit == null) {
            this.undoLimit = CounterSuperlikeAndUndoLimit.new_();
        }
        if (this.followships == null) {
            this.followships = CounterFollowShips.new_();
        }
        if (this.moments == null) {
            this.moments = CouterMoments.new_();
        }
        if (this.boostLimits == null) {
            this.boostLimits = new ArrayList();
        }
        if (this.likersLimit == null) {
            this.likersLimit = LikersLimit.new_();
        }
        if (this.liveChatLimit == null) {
            this.liveChatLimit = LiveChatLimit.new_();
        }
        if (this.mytantan == null) {
            this.mytantan = Mytantan.new_();
        }
        if (this.livePushLimit == null) {
            this.livePushLimit = LivePushLimit.new_();
        }
        if (this.friendReminders == null) {
            this.friendReminders = CounterFriendReminder.new_();
        }
        if (this.viewers == null) {
            this.viewers = CounterViewer.new_();
        }
        if (this.shuoshuos == null) {
            this.shuoshuos = CounterShuoshuo.new_();
        }
        if (this.kankan == null) {
            this.kankan = CounterKankan.new_();
        }
        if (this.swipes == null) {
            this.swipes = Swipes.new_();
        }
        if (this.growth == null) {
            this.growth = CounterGrowth.new_();
        }
        if (this.profileLike == null) {
            this.profileLike = ProfileLike.new_();
        }
        if (this.pickUsers == null) {
            this.pickUsers = CounterPickUsers.new_();
        }
        if (this.fakeLikeLimits == null) {
            this.fakeLikeLimits = FakeLikeLimits.new_();
        }
        if (this.flower == null) {
            this.flower = FeedFlower.new_();
        }
        if (this.verification == null) {
            this.verification = VerificationLimit.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xh5.m208774v(this.requestUrl)) || xh5.API_VERSION_V3.equals(xh5.m208774v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        String strM208774v = xh5.m208774v(this.requestUrl);
        return TextUtils.isEmpty(strM208774v) || "v2".equals(strM208774v) || xh5.API_VERSION_V3.equals(xh5.m208774v(this.requestUrl));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
