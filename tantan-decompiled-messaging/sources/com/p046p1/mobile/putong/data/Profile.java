package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Social;
import com.p046p1.mobile.putong.data.Tag;
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
import p149l.vwb;
import p149l.w9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes12.dex */
public class Profile extends ValueObject<Profile> implements Cloneable, Serializable {
    public static final String FOOD = "food";
    public static final String LITERATURE = "literature";
    public static final String MOVIES = "movies";
    public static final String MUSIC = "music";
    public static final String PERSONALITY = "personality";
    public static final String PLACES = "places";
    public static final String SPORTS = "sports";
    public static final String TYPE = "profile";

    @NonNull
    @ProtobufIndex(index = 9)
    public List<Answer> answers;

    @Nullable
    public PartialIdList api_only_mutualContacts;

    @NonNull
    @ProtobufIndex(index = 22)
    public BizAnswers bizAnswers;

    @NonNull
    @ProtobufIndex(index = 7)
    public MutualContactsLocalLookups contactLookups;

    @NonNull
    @ProtobufIndex(index = 20)
    public Extensions extensions;

    @NonNull
    @ProtobufIndex(index = 17)
    public FollowshipCounters followships;

    @NonNull
    @ProtobufIndex(index = 2)
    public String hangouts;

    @NonNull
    @ProtobufIndex(index = 3)
    public String hometown;

    @NonNull
    @ProtobufIndex(index = 6)
    @Deprecated
    public String job;

    @NonNull
    @ProtobufIndex(index = 18)
    public Moments moments;

    @NonNull
    @ProtobufIndex(index = 19)
    public UserProfileMood mood;

    @NonNull
    @ProtobufIndex(index = 21)
    public MoodMoment moodMoment;

    @NonNull
    @ProtobufIndex(index = 11)
    @Deprecated
    public String occupation;

    @ProtobufIndex(index = 23)
    public boolean onlyShowAboutMeInside;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @Nullable
    @ProtobufIndex(index = 4)
    public Long receivedLikes;

    @NonNull
    @ProtobufIndex(index = 15)
    public String receivedLikesRank;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 14)
    public List<String> scenarios;

    @NonNull
    @ProtobufIndex(index = 1)
    public String school;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Social> social;

    @NonNull
    @ProtobufIndex(index = 13)
    public Studies studies;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Tag> tags;

    @NonNull
    @ProtobufIndex(index = 16)
    public ProfileTbh tbh;

    @NonNull
    @ProtobufIndex(index = 12)
    public Work work;

    @NonNull
    @ProtobufIndex(index = 10)
    public ProfileZodiac zodiac;
    public static final String SUGGESTION_REASON = "suggestion_reason";
    public static final String GAMES = "games";
    public static final String[] TAG_CATEGORIES = {"personality", "sports", "music", "literature", "movies", "food", "places", SUGGESTION_REASON, GAMES};
    public static ProtobufAdapter<Profile> PROTOBUF_ADAPTER = new MessageNanoAdapter<Profile>() { // from class: com.p1.mobile.putong.data.Profile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Profile profile) {
            String str = profile.school;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = profile.hangouts;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            Long l2 = profile.receivedLikes;
            if (l2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17228j(4, l2.longValue());
            }
            List<Tag> list = profile.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = profile.job;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            MutualContactsLocalLookups mutualContactsLocalLookups = profile.contactLookups;
            if (mutualContactsLocalLookups != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(7, mutualContactsLocalLookups, MutualContactsLocalLookups.PROTOBUF_ADAPTER);
            }
            List<Social> list2 = profile.social;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, list2, Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Answer> list3 = profile.answers;
            if (list3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(9, list3, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ProfileZodiac profileZodiac = profile.zodiac;
            if (profileZodiac != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(10, profileZodiac.ordinal());
            }
            String str5 = profile.occupation;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(11, str5);
            }
            Work work = profile.work;
            if (work != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(12, work, Work.PROTOBUF_ADAPTER);
            }
            Studies studies = profile.studies;
            if (studies != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(13, studies, Studies.PROTOBUF_ADAPTER);
            }
            List<String> list4 = profile.scenarios;
            if (list4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(14, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = profile.receivedLikesRank;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(15, str6);
            }
            ProfileTbh profileTbh = profile.tbh;
            if (profileTbh != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(16, profileTbh, ProfileTbh.PROTOBUF_ADAPTER);
            }
            FollowshipCounters followshipCounters = profile.followships;
            if (followshipCounters != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(17, followshipCounters, FollowshipCounters.PROTOBUF_ADAPTER);
            }
            Moments moments = profile.moments;
            if (moments != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(18, moments, Moments.PROTOBUF_ADAPTER);
            }
            UserProfileMood userProfileMood = profile.mood;
            if (userProfileMood != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(19, userProfileMood, UserProfileMood.PROTOBUF_ADAPTER);
            }
            Extensions extensions = profile.extensions;
            if (extensions != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(20, extensions, Extensions.PROTOBUF_ADAPTER);
            }
            MoodMoment moodMoment = profile.moodMoment;
            if (moodMoment != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(21, moodMoment, MoodMoment.PROTOBUF_ADAPTER);
            }
            BizAnswers bizAnswers = profile.bizAnswers;
            if (bizAnswers != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(22, bizAnswers, BizAnswers.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(23, profile.onlyShowAboutMeInside);
            ProfileZodiac profileZodiac2 = profile.zodiac;
            if (profileZodiac2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(24, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
            profile.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Profile parse(nb5 nb5Var) throws IOException {
            Profile profile = new Profile();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (profile.zodiac == null && numValueOf != null) {
                            profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (profile.school == null) {
                            profile.school = "";
                        }
                        if (profile.hangouts == null) {
                            profile.hangouts = "";
                        }
                        if (profile.hometown == null) {
                            profile.hometown = "";
                        }
                        if (profile.tags == null) {
                            profile.tags = new ArrayList();
                        }
                        if (profile.job == null) {
                            profile.job = "";
                        }
                        if (profile.contactLookups == null) {
                            profile.contactLookups = MutualContactsLocalLookups.new_();
                        }
                        if (profile.social == null) {
                            profile.social = new ArrayList();
                        }
                        if (profile.answers == null) {
                            profile.answers = new ArrayList();
                        }
                        if (profile.zodiac == null) {
                            profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        }
                        if (profile.occupation == null) {
                            profile.occupation = "";
                        }
                        if (profile.work == null) {
                            profile.work = Work.new_();
                        }
                        if (profile.studies == null) {
                            profile.studies = Studies.new_();
                        }
                        if (profile.scenarios == null) {
                            profile.scenarios = new ArrayList();
                        }
                        if (profile.receivedLikesRank == null) {
                            profile.receivedLikesRank = "";
                        }
                        if (profile.tbh == null) {
                            profile.tbh = ProfileTbh.new_();
                        }
                        if (profile.followships == null) {
                            profile.followships = FollowshipCounters.new_();
                        }
                        if (profile.moments == null) {
                            profile.moments = Moments.new_();
                        }
                        if (profile.mood == null) {
                            profile.mood = UserProfileMood.new_();
                        }
                        if (profile.extensions == null) {
                            profile.extensions = Extensions.new_();
                        }
                        if (profile.moodMoment == null) {
                            profile.moodMoment = MoodMoment.new_();
                        }
                        if (profile.bizAnswers == null) {
                            profile.bizAnswers = BizAnswers.new_();
                        }
                        break;
                    case 10:
                        profile.school = nb5Var.m158750s();
                        continue;
                    case 18:
                        profile.hangouts = nb5Var.m158750s();
                        continue;
                    case 26:
                        profile.hometown = nb5Var.m158750s();
                        continue;
                    case 32:
                        profile.receivedLikes = Long.valueOf(nb5Var.m158742k());
                        continue;
                    case 42:
                        profile.tags = (List) nb5Var.m158743l(Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        profile.job = nb5Var.m158750s();
                        continue;
                    case 58:
                        profile.contactLookups = (MutualContactsLocalLookups) nb5Var.m158743l(MutualContactsLocalLookups.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        profile.social = (List) nb5Var.m158743l(Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        profile.answers = (List) nb5Var.m158743l(Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 80:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 90:
                        profile.occupation = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        profile.work = (Work) nb5Var.m158743l(Work.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        profile.studies = (Studies) nb5Var.m158743l(Studies.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        profile.scenarios = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        profile.receivedLikesRank = nb5Var.m158750s();
                        continue;
                    case 130:
                        profile.tbh = (ProfileTbh) nb5Var.m158743l(ProfileTbh.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        profile.followships = (FollowshipCounters) nb5Var.m158743l(FollowshipCounters.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        profile.moments = (Moments) nb5Var.m158743l(Moments.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        profile.mood = (UserProfileMood) nb5Var.m158743l(UserProfileMood.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        profile.extensions = (Extensions) nb5Var.m158743l(Extensions.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        profile.moodMoment = (MoodMoment) nb5Var.m158743l(MoodMoment.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        profile.bizAnswers = (BizAnswers) nb5Var.m158743l(BizAnswers.PROTOBUF_ADAPTER);
                        continue;
                    case 184:
                        profile.onlyShowAboutMeInside = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        profile.zodiac = (ProfileZodiac) nb5Var.m158743l(ProfileZodiac.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (profile.zodiac == null && numValueOf != null) {
                            profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (profile.school == null) {
                            profile.school = "";
                        }
                        if (profile.hangouts == null) {
                            profile.hangouts = "";
                        }
                        if (profile.hometown == null) {
                            profile.hometown = "";
                        }
                        if (profile.tags == null) {
                            profile.tags = new ArrayList();
                        }
                        if (profile.job == null) {
                            profile.job = "";
                        }
                        if (profile.contactLookups == null) {
                            profile.contactLookups = MutualContactsLocalLookups.new_();
                        }
                        if (profile.social == null) {
                            profile.social = new ArrayList();
                        }
                        if (profile.answers == null) {
                            profile.answers = new ArrayList();
                        }
                        if (profile.zodiac == null) {
                            profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        }
                        if (profile.occupation == null) {
                            profile.occupation = "";
                        }
                        if (profile.work == null) {
                            profile.work = Work.new_();
                        }
                        if (profile.studies == null) {
                            profile.studies = Studies.new_();
                        }
                        if (profile.scenarios == null) {
                            profile.scenarios = new ArrayList();
                        }
                        if (profile.receivedLikesRank == null) {
                            profile.receivedLikesRank = "";
                        }
                        if (profile.tbh == null) {
                            profile.tbh = ProfileTbh.new_();
                        }
                        if (profile.followships == null) {
                            profile.followships = FollowshipCounters.new_();
                        }
                        if (profile.moments == null) {
                            profile.moments = Moments.new_();
                        }
                        if (profile.mood == null) {
                            profile.mood = UserProfileMood.new_();
                        }
                        if (profile.extensions == null) {
                            profile.extensions = Extensions.new_();
                        }
                        if (profile.moodMoment == null) {
                            profile.moodMoment = MoodMoment.new_();
                        }
                        if (profile.bizAnswers == null) {
                            profile.bizAnswers = BizAnswers.new_();
                            return profile;
                        }
                        break;
                }
            }
            return profile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Profile profile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profile.school;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = profile.hangouts;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            Long l2 = profile.receivedLikes;
            if (l2 != null) {
                codedOutputByteBufferNano.m17252I(4, l2.longValue());
            }
            List<Tag> list = profile.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = profile.job;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            MutualContactsLocalLookups mutualContactsLocalLookups = profile.contactLookups;
            if (mutualContactsLocalLookups != null) {
                codedOutputByteBufferNano.m17254K(7, mutualContactsLocalLookups, MutualContactsLocalLookups.PROTOBUF_ADAPTER);
            }
            List<Social> list2 = profile.social;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(8, list2, Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Answer> list3 = profile.answers;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(9, list3, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ProfileZodiac profileZodiac = profile.zodiac;
            if (profileZodiac != null) {
                codedOutputByteBufferNano.m17250G(10, profileZodiac.ordinal());
            }
            String str5 = profile.occupation;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(11, str5);
            }
            Work work = profile.work;
            if (work != null) {
                codedOutputByteBufferNano.m17254K(12, work, Work.PROTOBUF_ADAPTER);
            }
            Studies studies = profile.studies;
            if (studies != null) {
                codedOutputByteBufferNano.m17254K(13, studies, Studies.PROTOBUF_ADAPTER);
            }
            List<String> list4 = profile.scenarios;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(14, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = profile.receivedLikesRank;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(15, str6);
            }
            ProfileTbh profileTbh = profile.tbh;
            if (profileTbh != null) {
                codedOutputByteBufferNano.m17254K(16, profileTbh, ProfileTbh.PROTOBUF_ADAPTER);
            }
            FollowshipCounters followshipCounters = profile.followships;
            if (followshipCounters != null) {
                codedOutputByteBufferNano.m17254K(17, followshipCounters, FollowshipCounters.PROTOBUF_ADAPTER);
            }
            Moments moments = profile.moments;
            if (moments != null) {
                codedOutputByteBufferNano.m17254K(18, moments, Moments.PROTOBUF_ADAPTER);
            }
            UserProfileMood userProfileMood = profile.mood;
            if (userProfileMood != null) {
                codedOutputByteBufferNano.m17254K(19, userProfileMood, UserProfileMood.PROTOBUF_ADAPTER);
            }
            Extensions extensions = profile.extensions;
            if (extensions != null) {
                codedOutputByteBufferNano.m17254K(20, extensions, Extensions.PROTOBUF_ADAPTER);
            }
            MoodMoment moodMoment = profile.moodMoment;
            if (moodMoment != null) {
                codedOutputByteBufferNano.m17254K(21, moodMoment, MoodMoment.PROTOBUF_ADAPTER);
            }
            BizAnswers bizAnswers = profile.bizAnswers;
            if (bizAnswers != null) {
                codedOutputByteBufferNano.m17254K(22, bizAnswers, BizAnswers.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(23, profile.onlyShowAboutMeInside);
            ProfileZodiac profileZodiac2 = profile.zodiac;
            if (profileZodiac2 != null) {
                codedOutputByteBufferNano.m17254K(24, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Profile> JSON_ADAPTER = new ObjectJsonAdapter<Profile>() { // from class: com.p1.mobile.putong.data.Profile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Profile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Profile newInstance() {
            return new Profile();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Profile profile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1959308329:
                    if (str.equals("moodMoment")) {
                        b = 0;
                    }
                    break;
                case -1879142361:
                    if (str.equals(Studies.TYPE)) {
                        b = 1;
                    }
                    break;
                case -1809421292:
                    if (str.equals(Extensions.TYPE)) {
                        b = 2;
                    }
                    break;
                case -1257248633:
                    if (str.equals("mutualContacts")) {
                        b = 3;
                    }
                    break;
                case -1076721369:
                    if (str.equals("receivedLikesRank")) {
                        b = 4;
                    }
                    break;
                case -907977868:
                    if (str.equals("school")) {
                        b = 5;
                    }
                    break;
                case -897050771:
                    if (str.equals("social")) {
                        b = 6;
                    }
                    break;
                case -847398795:
                    if (str.equals("answers")) {
                        b = 7;
                    }
                    break;
                case -696616932:
                    if (str.equals(ProfileLikeCategoryType.zodiac)) {
                        b = 8;
                    }
                    break;
                case -485238799:
                    if (str.equals(ProfileLikeCategoryType.hometown)) {
                        b = 9;
                    }
                    break;
                case -290805736:
                    if (str.equals("onlyShowAboutMeInside")) {
                        b = 10;
                    }
                    break;
                case 105405:
                    if (str.equals("job")) {
                        b = 11;
                    }
                    break;
                case 114618:
                    if (str.equals("tbh")) {
                        b = 12;
                    }
                    break;
                case 3357431:
                    if (str.equals("mood")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 14;
                    }
                    break;
                case 3655441:
                    if (str.equals(Work.TYPE)) {
                        b = 15;
                    }
                    break;
                case 4944471:
                    if (str.equals(ProfileLikeCategoryType.hangouts)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 104105954:
                    if (str.equals("bizAnswers")) {
                        b = 17;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 18;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 19;
                    }
                    break;
                case 1615358283:
                    if (str.equals("occupation")) {
                        b = 20;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 21;
                    }
                    break;
                case 1955622491:
                    if (str.equals("receivedLikes")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    profile.moodMoment = MoodMoment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    profile.studies = Studies.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    profile.extensions = Extensions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    profile.api_only_mutualContacts = PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    profile.receivedLikesRank = jsonParser.getValueAsString();
                    return true;
                case 5:
                    profile.school = jsonParser.getValueAsString();
                    return true;
                case 6:
                    profile.social = JsonAdapter.parseArray(jsonParser, Social.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    profile.answers = JsonAdapter.parseArray(jsonParser, Answer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    profile.zodiac = ProfileZodiac.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 9:
                    profile.hometown = jsonParser.getValueAsString();
                    return true;
                case 10:
                    profile.onlyShowAboutMeInside = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    profile.job = jsonParser.getValueAsString();
                    return true;
                case 12:
                    profile.tbh = ProfileTbh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    profile.mood = UserProfileMood.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    profile.tags = JsonAdapter.parseArray(jsonParser, Tag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    profile.work = Work.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    profile.hangouts = jsonParser.getValueAsString();
                    return true;
                case 17:
                    profile.bizAnswers = BizAnswers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    profile.moments = Moments.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    profile.followships = FollowshipCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    profile.occupation = jsonParser.getValueAsString();
                    return true;
                case 21:
                    profile.scenarios = JsonAdapter.parseArray(jsonParser, Converter.SCENARIO_ID, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    profile.receivedLikes = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Long.valueOf(jsonParser.getValueAsLong());
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Profile profile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1959308329:
                    if (str.equals("moodMoment")) {
                        b = 0;
                    }
                    break;
                case -1879142361:
                    if (str.equals(Studies.TYPE)) {
                        b = 1;
                    }
                    break;
                case -1809421292:
                    if (str.equals(Extensions.TYPE)) {
                        b = 2;
                    }
                    break;
                case -1257248633:
                    if (str.equals("mutualContacts")) {
                        b = 3;
                    }
                    break;
                case -1076721369:
                    if (str.equals("receivedLikesRank")) {
                        b = 4;
                    }
                    break;
                case -907977868:
                    if (str.equals("school")) {
                        b = 5;
                    }
                    break;
                case -897050771:
                    if (str.equals("social")) {
                        b = 6;
                    }
                    break;
                case -847398795:
                    if (str.equals("answers")) {
                        b = 7;
                    }
                    break;
                case -696616932:
                    if (str.equals(ProfileLikeCategoryType.zodiac)) {
                        b = 8;
                    }
                    break;
                case -485238799:
                    if (str.equals(ProfileLikeCategoryType.hometown)) {
                        b = 9;
                    }
                    break;
                case -290805736:
                    if (str.equals("onlyShowAboutMeInside")) {
                        b = 10;
                    }
                    break;
                case 105405:
                    if (str.equals("job")) {
                        b = 11;
                    }
                    break;
                case 114618:
                    if (str.equals("tbh")) {
                        b = 12;
                    }
                    break;
                case 3357431:
                    if (str.equals("mood")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 14;
                    }
                    break;
                case 3655441:
                    if (str.equals(Work.TYPE)) {
                        b = 15;
                    }
                    break;
                case 4944471:
                    if (str.equals(ProfileLikeCategoryType.hangouts)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 104105954:
                    if (str.equals("bizAnswers")) {
                        b = 17;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 18;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 19;
                    }
                    break;
                case 1615358283:
                    if (str.equals("occupation")) {
                        b = 20;
                    }
                    break;
                case 1726545635:
                    if (str.equals("scenarios")) {
                        b = 21;
                    }
                    break;
                case 1955622491:
                    if (str.equals("receivedLikes")) {
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
                    return super.parseFieldCheck(profile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Profile profile, JsonGenerator jsonGenerator) throws IOException {
            String str = profile.school;
            if (str != null) {
                jsonGenerator.writeStringField("school", str);
            }
            String str2 = profile.hangouts;
            if (str2 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.hangouts, str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.hometown, str3);
            }
            Long l2 = profile.receivedLikes;
            if (l2 != null) {
                jsonGenerator.writeNumberField("receivedLikes", l2.longValue());
            }
            if (profile.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(profile.tags, jsonGenerator, Tag.JSON_ADAPTER);
            }
            String str4 = profile.job;
            if (str4 != null) {
                jsonGenerator.writeStringField("job", str4);
            }
            if (profile.api_only_mutualContacts != null) {
                jsonGenerator.writeFieldName("mutualContacts");
                PartialIdList.JSON_ADAPTER.serialize(profile.api_only_mutualContacts, jsonGenerator, true);
            }
            if (profile.social != null) {
                jsonGenerator.writeFieldName("social");
                JsonAdapter.serializeArray(profile.social, jsonGenerator, Social.JSON_ADAPTER);
            }
            if (profile.answers != null) {
                jsonGenerator.writeFieldName("answers");
                JsonAdapter.serializeArray(profile.answers, jsonGenerator, Answer.JSON_ADAPTER);
            }
            if (profile.zodiac != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.zodiac);
                ProfileZodiac.JSON_ADAPTER.serialize(profile.zodiac, jsonGenerator, true);
            }
            String str5 = profile.occupation;
            if (str5 != null) {
                jsonGenerator.writeStringField("occupation", str5);
            }
            if (profile.work != null) {
                jsonGenerator.writeFieldName(Work.TYPE);
                Work.JSON_ADAPTER.serialize(profile.work, jsonGenerator, true);
            }
            if (profile.studies != null) {
                jsonGenerator.writeFieldName(Studies.TYPE);
                Studies.JSON_ADAPTER.serialize(profile.studies, jsonGenerator, true);
            }
            if (profile.scenarios != null) {
                jsonGenerator.writeFieldName("scenarios");
                JsonAdapter.serializeArray(profile.scenarios, jsonGenerator, Converter.SCENARIO_ID);
            }
            String str6 = profile.receivedLikesRank;
            if (str6 != null) {
                jsonGenerator.writeStringField("receivedLikesRank", str6);
            }
            if (profile.tbh != null) {
                jsonGenerator.writeFieldName("tbh");
                ProfileTbh.JSON_ADAPTER.serialize(profile.tbh, jsonGenerator, true);
            }
            if (profile.followships != null) {
                jsonGenerator.writeFieldName("followships");
                FollowshipCounters.JSON_ADAPTER.serialize(profile.followships, jsonGenerator, true);
            }
            if (profile.moments != null) {
                jsonGenerator.writeFieldName(Moments.TYPE);
                Moments.JSON_ADAPTER.serialize(profile.moments, jsonGenerator, true);
            }
            if (profile.mood != null) {
                jsonGenerator.writeFieldName("mood");
                UserProfileMood.JSON_ADAPTER.serialize(profile.mood, jsonGenerator, true);
            }
            if (profile.extensions != null) {
                jsonGenerator.writeFieldName(Extensions.TYPE);
                Extensions.JSON_ADAPTER.serialize(profile.extensions, jsonGenerator, true);
            }
            if (profile.moodMoment != null) {
                jsonGenerator.writeFieldName("moodMoment");
                MoodMoment.JSON_ADAPTER.serialize(profile.moodMoment, jsonGenerator, true);
            }
            if (profile.bizAnswers != null) {
                jsonGenerator.writeFieldName("bizAnswers");
                BizAnswers.JSON_ADAPTER.serialize(profile.bizAnswers, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("onlyShowAboutMeInside", profile.onlyShowAboutMeInside);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Profile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Profile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60002b(String str) {
        return str;
    }

    public static int categoryToIndex(String str) {
        str.getClass();
        switch (str) {
            case "literature":
                return 3;
            case "movies":
                return 4;
            case "places":
                return 6;
            case "sports":
                return 1;
            case "suggestion_reason":
                return 7;
            case "food":
                return 5;
            case "games":
                return 7;
            case "music":
                return 2;
            default:
                return 0;
        }
    }

    public static Profile new_() {
        Profile profile = new Profile();
        profile.nullCheck();
        return profile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Profile mo223809clone() {
        Profile profile = new Profile();
        profile.school = this.school;
        profile.hangouts = this.hangouts;
        profile.hometown = this.hometown;
        profile.receivedLikes = this.receivedLikes;
        List<Tag> list = this.tags;
        if (list != null) {
            profile.tags = ValueObject.util_map(list, new w9j() { // from class: l.ae90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Tag) obj).mo223809clone();
                }
            });
        }
        profile.job = this.job;
        PartialIdList partialIdList = this.api_only_mutualContacts;
        if (partialIdList != null) {
            profile.api_only_mutualContacts = partialIdList.mo223809clone();
        }
        MutualContactsLocalLookups mutualContactsLocalLookups = this.contactLookups;
        if (mutualContactsLocalLookups != null) {
            profile.contactLookups = mutualContactsLocalLookups.mo223809clone();
        }
        List<Social> list2 = this.social;
        if (list2 != null) {
            profile.social = ValueObject.util_map(list2, new w9j() { // from class: l.be90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Social) obj).mo223809clone();
                }
            });
        }
        List<Answer> list3 = this.answers;
        if (list3 != null) {
            profile.answers = ValueObject.util_map(list3, new w9j() { // from class: l.ce90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Answer) obj).mo223809clone();
                }
            });
        }
        profile.zodiac = this.zodiac;
        profile.occupation = this.occupation;
        Work work = this.work;
        if (work != null) {
            profile.work = work.mo223809clone();
        }
        Studies studies = this.studies;
        if (studies != null) {
            profile.studies = studies.mo223809clone();
        }
        List<String> list4 = this.scenarios;
        if (list4 != null) {
            profile.scenarios = ValueObject.util_map(list4, new w9j() { // from class: l.de90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Profile.m60002b((String) obj);
                }
            });
        }
        profile.receivedLikesRank = this.receivedLikesRank;
        ProfileTbh profileTbh = this.tbh;
        if (profileTbh != null) {
            profile.tbh = profileTbh.mo223809clone();
        }
        FollowshipCounters followshipCounters = this.followships;
        if (followshipCounters != null) {
            profile.followships = followshipCounters.mo223809clone();
        }
        Moments moments = this.moments;
        if (moments != null) {
            profile.moments = moments.mo223809clone();
        }
        UserProfileMood userProfileMood = this.mood;
        if (userProfileMood != null) {
            profile.mood = userProfileMood.mo223809clone();
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            profile.extensions = extensions.mo223809clone();
        }
        MoodMoment moodMoment = this.moodMoment;
        if (moodMoment != null) {
            profile.moodMoment = moodMoment.mo223809clone();
        }
        BizAnswers bizAnswers = this.bizAnswers;
        if (bizAnswers != null) {
            profile.bizAnswers = bizAnswers.mo223809clone();
        }
        profile.onlyShowAboutMeInside = this.onlyShowAboutMeInside;
        return profile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return ValueObject.util_equals(this.school, profile.school) && ValueObject.util_equals(this.hangouts, profile.hangouts) && ValueObject.util_equals(this.hometown, profile.hometown) && ValueObject.util_equals(this.receivedLikes, profile.receivedLikes) && ValueObject.util_equals(this.tags, profile.tags) && ValueObject.util_equals(this.job, profile.job) && ValueObject.util_equals(this.api_only_mutualContacts, profile.api_only_mutualContacts) && ValueObject.util_equals(this.contactLookups, profile.contactLookups) && ValueObject.util_equals(this.social, profile.social) && ValueObject.util_equals(this.answers, profile.answers) && ValueObject.util_equals(this.zodiac, profile.zodiac) && ValueObject.util_equals(this.occupation, profile.occupation) && ValueObject.util_equals(this.work, profile.work) && ValueObject.util_equals(this.studies, profile.studies) && ValueObject.util_equals(this.scenarios, profile.scenarios) && ValueObject.util_equals(this.receivedLikesRank, profile.receivedLikesRank) && ValueObject.util_equals(this.tbh, profile.tbh) && ValueObject.util_equals(this.followships, profile.followships) && ValueObject.util_equals(this.moments, profile.moments) && ValueObject.util_equals(this.mood, profile.mood) && ValueObject.util_equals(this.extensions, profile.extensions) && ValueObject.util_equals(this.moodMoment, profile.moodMoment) && ValueObject.util_equals(this.bizAnswers, profile.bizAnswers) && this.onlyShowAboutMeInside == profile.onlyShowAboutMeInside;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "profile";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.school;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.hangouts;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.hometown;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Long l2 = this.receivedLikes;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 41;
        List<Tag> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.job;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        PartialIdList partialIdList = this.api_only_mutualContacts;
        int iHashCode7 = (iHashCode6 + (partialIdList != null ? partialIdList.hashCode() : 0)) * 41;
        MutualContactsLocalLookups mutualContactsLocalLookups = this.contactLookups;
        int iHashCode8 = (iHashCode7 + (mutualContactsLocalLookups != null ? mutualContactsLocalLookups.hashCode() : 0)) * 41;
        List<Social> list2 = this.social;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Answer> list3 = this.answers;
        int iHashCode10 = (iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 41;
        ProfileZodiac profileZodiac = this.zodiac;
        int iHashCode11 = (iHashCode10 + (profileZodiac != null ? profileZodiac.hashCode() : 0)) * 41;
        String str5 = this.occupation;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 41;
        Work work = this.work;
        int iHashCode13 = (iHashCode12 + (work != null ? work.hashCode() : 0)) * 41;
        Studies studies = this.studies;
        int iHashCode14 = (iHashCode13 + (studies != null ? studies.hashCode() : 0)) * 41;
        List<String> list4 = this.scenarios;
        int iHashCode15 = (iHashCode14 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str6 = this.receivedLikesRank;
        int iHashCode16 = (iHashCode15 + (str6 != null ? str6.hashCode() : 0)) * 41;
        ProfileTbh profileTbh = this.tbh;
        int iHashCode17 = (iHashCode16 + (profileTbh != null ? profileTbh.hashCode() : 0)) * 41;
        FollowshipCounters followshipCounters = this.followships;
        int iHashCode18 = (iHashCode17 + (followshipCounters != null ? followshipCounters.hashCode() : 0)) * 41;
        Moments moments = this.moments;
        int iHashCode19 = (iHashCode18 + (moments != null ? moments.hashCode() : 0)) * 41;
        UserProfileMood userProfileMood = this.mood;
        int iHashCode20 = (iHashCode19 + (userProfileMood != null ? userProfileMood.hashCode() : 0)) * 41;
        Extensions extensions = this.extensions;
        int iHashCode21 = (iHashCode20 + (extensions != null ? extensions.hashCode() : 0)) * 41;
        MoodMoment moodMoment = this.moodMoment;
        int iHashCode22 = (iHashCode21 + (moodMoment != null ? moodMoment.hashCode() : 0)) * 41;
        BizAnswers bizAnswers = this.bizAnswers;
        int iHashCode23 = ((iHashCode22 + (bizAnswers != null ? bizAnswers.hashCode() : 0)) * 41) + (this.onlyShowAboutMeInside ? 1231 : 1237);
        this.hashCode = iHashCode23;
        return iHashCode23;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Profile profile) {
        if (!shouldMergeData() || equals(profile)) {
            return;
        }
        if (!isFieldParsed("school")) {
            this.school = profile.school;
        }
        if (!isFieldParsed(ProfileLikeCategoryType.hangouts)) {
            this.hangouts = profile.hangouts;
        }
        if (!isFieldParsed(ProfileLikeCategoryType.hometown)) {
            this.hometown = profile.hometown;
        }
        if (!isFieldParsed("receivedLikes")) {
            this.receivedLikes = profile.receivedLikes;
        }
        if (!isFieldParsed("tags")) {
            this.tags = profile.tags;
        }
        if (!isFieldParsed("job")) {
            this.job = profile.job;
        }
        if (!isFieldParsed("mutualContacts")) {
            this.api_only_mutualContacts = profile.api_only_mutualContacts;
        }
        if (!isFieldParsed("social")) {
            this.social = profile.social;
        }
        if (!isFieldParsed("answers")) {
            this.answers = profile.answers;
        }
        if (!isFieldParsed(ProfileLikeCategoryType.zodiac)) {
            this.zodiac = profile.zodiac;
        }
        if (!isFieldParsed("occupation")) {
            this.occupation = profile.occupation;
        }
        if (!isFieldParsed(Work.TYPE)) {
            this.work = profile.work;
        }
        if (!isFieldParsed(Studies.TYPE)) {
            this.studies = profile.studies;
        }
        if (!isFieldParsed("scenarios")) {
            this.scenarios = profile.scenarios;
        }
        if (!isFieldParsed("receivedLikesRank")) {
            this.receivedLikesRank = profile.receivedLikesRank;
        }
        if (!isFieldParsed("tbh")) {
            this.tbh = profile.tbh;
        }
        if (!isFieldParsed("followships")) {
            this.followships = profile.followships;
        }
        if (!isFieldParsed(Moments.TYPE)) {
            this.moments = profile.moments;
        }
        if (!isFieldParsed("mood")) {
            this.mood = profile.mood;
        }
        if (!isFieldParsed(Extensions.TYPE)) {
            this.extensions = profile.extensions;
        }
        if (!isFieldParsed("moodMoment")) {
            this.moodMoment = profile.moodMoment;
        }
        if (!isFieldParsed("bizAnswers")) {
            this.bizAnswers = profile.bizAnswers;
        }
        if (!isFieldParsed("onlyShowAboutMeInside")) {
            this.onlyShowAboutMeInside = profile.onlyShowAboutMeInside;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.school == null) {
            this.school = "";
        }
        if (this.hangouts == null) {
            this.hangouts = "";
        }
        if (this.hometown == null) {
            this.hometown = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.job == null) {
            this.job = "";
        }
        if (this.contactLookups == null) {
            this.contactLookups = MutualContactsLocalLookups.new_();
        }
        if (this.social == null) {
            this.social = new ArrayList();
        }
        if (this.answers == null) {
            this.answers = new ArrayList();
        }
        if (this.zodiac == null) {
            this.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
        }
        if (this.occupation == null) {
            this.occupation = "";
        }
        if (this.work == null) {
            this.work = Work.new_();
        }
        if (this.studies == null) {
            this.studies = Studies.new_();
        }
        if (this.scenarios == null) {
            this.scenarios = new ArrayList();
        }
        if (this.receivedLikesRank == null) {
            this.receivedLikesRank = "";
        }
        if (this.tbh == null) {
            this.tbh = ProfileTbh.new_();
        }
        if (this.followships == null) {
            this.followships = FollowshipCounters.new_();
        }
        if (this.moments == null) {
            this.moments = Moments.new_();
        }
        if (this.mood == null) {
            this.mood = UserProfileMood.new_();
        }
        if (this.extensions == null) {
            this.extensions = Extensions.new_();
        }
        if (this.moodMoment == null) {
            this.moodMoment = MoodMoment.new_();
        }
        if (this.bizAnswers == null) {
            this.bizAnswers = BizAnswers.new_();
        }
    }

    public List<Tag> placesTag() {
        return vwb.m200296J(this.tags) ? new ArrayList() : vwb.m200339n(this.tags, new w9j() { // from class: l.zd90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("places".equals(((Tag) obj).category));
            }
        });
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
        return "v2".equals(xh5.m208774v(this.requestUrl)) || xh5.API_VERSION_V3.equals(xh5.m208774v(this.requestUrl));
    }

    public Profile subtract(Profile profile) {
        Profile profile2 = new Profile();
        if (!ValueObject.util_equals(this.school, profile.school)) {
            profile2.school = this.school;
        }
        if (!ValueObject.util_equals(this.hangouts, profile.hangouts)) {
            profile2.hangouts = this.hangouts;
        }
        if (!ValueObject.util_equals(this.hometown, profile.hometown)) {
            profile2.hometown = this.hometown;
        }
        if (!ValueObject.util_equals(this.tags, profile.tags)) {
            profile2.tags = this.tags;
        }
        if (!ValueObject.util_equals(this.job, profile.job)) {
            profile2.job = this.job;
        }
        if (!ValueObject.util_equals(this.social, profile.social)) {
            profile2.social = this.social;
        }
        if (!ValueObject.util_equals(this.answers, profile.answers)) {
            profile2.answers = this.answers;
        }
        if (!ValueObject.util_equals(this.occupation, profile.occupation)) {
            profile2.occupation = this.occupation;
        }
        if (!ValueObject.util_equals(this.work, profile.work)) {
            profile2.work = this.work;
        }
        if (!ValueObject.util_equals(this.studies, profile.studies)) {
            profile2.studies = this.studies;
        }
        if (!ValueObject.util_equals(this.scenarios, profile.scenarios)) {
            profile2.scenarios = this.scenarios;
        }
        if (!ValueObject.util_equals(this.receivedLikesRank, profile.receivedLikesRank)) {
            profile2.receivedLikesRank = this.receivedLikesRank;
        }
        if (!ValueObject.util_equals(this.tbh, profile.tbh)) {
            profile2.tbh = this.tbh;
        }
        if (!ValueObject.util_equals(this.followships, profile.followships)) {
            profile2.followships = this.followships;
        }
        if (!ValueObject.util_equals(this.moments, profile.moments)) {
            profile2.moments = this.moments;
        }
        if (!ValueObject.util_equals(this.mood, profile.mood)) {
            profile2.mood = this.mood;
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            profile2.extensions = extensions.subtract(profile.extensions);
        }
        if (!ValueObject.util_equals(this.moodMoment, profile.moodMoment)) {
            profile2.moodMoment = this.moodMoment;
        }
        if (!ValueObject.util_equals(this.bizAnswers, profile.bizAnswers)) {
            profile2.bizAnswers = this.bizAnswers;
        }
        if (profile2.equals(new Profile())) {
            return null;
        }
        return profile2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
