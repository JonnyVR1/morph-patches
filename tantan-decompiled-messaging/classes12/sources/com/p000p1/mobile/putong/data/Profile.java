package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Answer;
import com.p000p1.mobile.putong.data.Profile;
import com.p000p1.mobile.putong.data.Social;
import com.p000p1.mobile.putong.data.Tag;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.vwb;
import l.w9j;
import l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Profile extends ValueObject<Profile> implements Cloneable, Serializable {
    public static final String FOOD = "food";
    public static final String LITERATURE = "literature";
    public static final String MUSIC = "music";
    public static final String PLACES = "places";
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
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public ProfileTbh tbh;

    @NonNull
    @ProtobufIndex(index = 12)
    public Work work;

    @NonNull
    @ProtobufIndex(index = 10)
    public ProfileZodiac zodiac;
    public static final String PERSONALITY = "personality";
    public static final String SPORTS = "sports";
    public static final String MOVIES = "movies";
    public static final String SUGGESTION_REASON = "suggestion_reason";
    public static final String GAMES = "games";
    public static final String[] TAG_CATEGORIES = {PERSONALITY, SPORTS, "music", "literature", MOVIES, "food", "places", SUGGESTION_REASON, GAMES};
    public static ProtobufAdapter<Profile> PROTOBUF_ADAPTER = new MessageNanoAdapter<Profile>() { // from class: com.p1.mobile.putong.data.Profile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Profile profile) {
            String str = profile.school;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = profile.hangouts;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            Long l2 = profile.receivedLikes;
            if (l2 != null) {
                iO += CodedOutputByteBufferNano.j(4, l2.longValue());
            }
            List<Tag> list = profile.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = profile.job;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            MutualContactsLocalLookups mutualContactsLocalLookups = profile.contactLookups;
            if (mutualContactsLocalLookups != null) {
                iO += CodedOutputByteBufferNano.l(7, mutualContactsLocalLookups, MutualContactsLocalLookups.PROTOBUF_ADAPTER);
            }
            List<Social> list2 = profile.social;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(8, list2, Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Answer> list3 = profile.answers;
            if (list3 != null) {
                iO += CodedOutputByteBufferNano.l(9, list3, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ProfileZodiac profileZodiac = profile.zodiac;
            if (profileZodiac != null) {
                iO += CodedOutputByteBufferNano.h(10, profileZodiac.ordinal());
            }
            String str5 = profile.occupation;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(11, str5);
            }
            Work work = profile.work;
            if (work != null) {
                iO += CodedOutputByteBufferNano.l(12, work, Work.PROTOBUF_ADAPTER);
            }
            Studies studies = profile.studies;
            if (studies != null) {
                iO += CodedOutputByteBufferNano.l(13, studies, Studies.PROTOBUF_ADAPTER);
            }
            List<String> list4 = profile.scenarios;
            if (list4 != null) {
                iO += CodedOutputByteBufferNano.l(14, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = profile.receivedLikesRank;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(15, str6);
            }
            ProfileTbh profileTbh = profile.tbh;
            if (profileTbh != null) {
                iO += CodedOutputByteBufferNano.l(16, profileTbh, ProfileTbh.PROTOBUF_ADAPTER);
            }
            FollowshipCounters followshipCounters = profile.followships;
            if (followshipCounters != null) {
                iO += CodedOutputByteBufferNano.l(17, followshipCounters, FollowshipCounters.PROTOBUF_ADAPTER);
            }
            Moments moments = profile.moments;
            if (moments != null) {
                iO += CodedOutputByteBufferNano.l(18, moments, Moments.PROTOBUF_ADAPTER);
            }
            UserProfileMood userProfileMood = profile.mood;
            if (userProfileMood != null) {
                iO += CodedOutputByteBufferNano.l(19, userProfileMood, UserProfileMood.PROTOBUF_ADAPTER);
            }
            Extensions extensions = profile.extensions;
            if (extensions != null) {
                iO += CodedOutputByteBufferNano.l(20, extensions, Extensions.PROTOBUF_ADAPTER);
            }
            MoodMoment moodMoment = profile.moodMoment;
            if (moodMoment != null) {
                iO += CodedOutputByteBufferNano.l(21, moodMoment, MoodMoment.PROTOBUF_ADAPTER);
            }
            BizAnswers bizAnswers = profile.bizAnswers;
            if (bizAnswers != null) {
                iO += CodedOutputByteBufferNano.l(22, bizAnswers, BizAnswers.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(23, profile.onlyShowAboutMeInside);
            ProfileZodiac profileZodiac2 = profile.zodiac;
            if (profileZodiac2 != null) {
                iB += CodedOutputByteBufferNano.l(24, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profile).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Profile m18835parse(nb5 nb5Var) throws IOException {
            Profile profile = new Profile();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
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
                        profile.school = nb5Var.s();
                        continue;
                    case 18:
                        profile.hangouts = nb5Var.s();
                        continue;
                    case 26:
                        profile.hometown = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        profile.receivedLikes = Long.valueOf(nb5Var.k());
                        continue;
                    case 42:
                        profile.tags = (List) nb5Var.l(Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        profile.job = nb5Var.s();
                        continue;
                    case 58:
                        profile.contactLookups = (MutualContactsLocalLookups) nb5Var.l(MutualContactsLocalLookups.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        profile.social = (List) nb5Var.l(Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        profile.answers = (List) nb5Var.l(Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 80:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 90:
                        profile.occupation = nb5Var.s();
                        continue;
                    case 98:
                        profile.work = (Work) nb5Var.l(Work.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        profile.studies = (Studies) nb5Var.l(Studies.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        profile.scenarios = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        profile.receivedLikesRank = nb5Var.s();
                        continue;
                    case 130:
                        profile.tbh = (ProfileTbh) nb5Var.l(ProfileTbh.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        profile.followships = (FollowshipCounters) nb5Var.l(FollowshipCounters.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        profile.moments = (Moments) nb5Var.l(Moments.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        profile.mood = (UserProfileMood) nb5Var.l(UserProfileMood.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        profile.extensions = (Extensions) nb5Var.l(Extensions.PROTOBUF_ADAPTER);
                        continue;
                    case 170:
                        profile.moodMoment = (MoodMoment) nb5Var.l(MoodMoment.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        profile.bizAnswers = (BizAnswers) nb5Var.l(BizAnswers.PROTOBUF_ADAPTER);
                        continue;
                    case 184:
                        profile.onlyShowAboutMeInside = nb5Var.g();
                        continue;
                    case 194:
                        profile.zodiac = (ProfileZodiac) nb5Var.l(ProfileZodiac.PROTOBUF_ADAPTER);
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

        public void serialize(Profile profile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = profile.school;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = profile.hangouts;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            Long l2 = profile.receivedLikes;
            if (l2 != null) {
                codedOutputByteBufferNano.I(4, l2.longValue());
            }
            List<Tag> list = profile.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = profile.job;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            MutualContactsLocalLookups mutualContactsLocalLookups = profile.contactLookups;
            if (mutualContactsLocalLookups != null) {
                codedOutputByteBufferNano.K(7, mutualContactsLocalLookups, MutualContactsLocalLookups.PROTOBUF_ADAPTER);
            }
            List<Social> list2 = profile.social;
            if (list2 != null) {
                codedOutputByteBufferNano.K(8, list2, Social.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Answer> list3 = profile.answers;
            if (list3 != null) {
                codedOutputByteBufferNano.K(9, list3, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ProfileZodiac profileZodiac = profile.zodiac;
            if (profileZodiac != null) {
                codedOutputByteBufferNano.G(10, profileZodiac.ordinal());
            }
            String str5 = profile.occupation;
            if (str5 != null) {
                codedOutputByteBufferNano.R(11, str5);
            }
            Work work = profile.work;
            if (work != null) {
                codedOutputByteBufferNano.K(12, work, Work.PROTOBUF_ADAPTER);
            }
            Studies studies = profile.studies;
            if (studies != null) {
                codedOutputByteBufferNano.K(13, studies, Studies.PROTOBUF_ADAPTER);
            }
            List<String> list4 = profile.scenarios;
            if (list4 != null) {
                codedOutputByteBufferNano.K(14, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = profile.receivedLikesRank;
            if (str6 != null) {
                codedOutputByteBufferNano.R(15, str6);
            }
            ProfileTbh profileTbh = profile.tbh;
            if (profileTbh != null) {
                codedOutputByteBufferNano.K(16, profileTbh, ProfileTbh.PROTOBUF_ADAPTER);
            }
            FollowshipCounters followshipCounters = profile.followships;
            if (followshipCounters != null) {
                codedOutputByteBufferNano.K(17, followshipCounters, FollowshipCounters.PROTOBUF_ADAPTER);
            }
            Moments moments = profile.moments;
            if (moments != null) {
                codedOutputByteBufferNano.K(18, moments, Moments.PROTOBUF_ADAPTER);
            }
            UserProfileMood userProfileMood = profile.mood;
            if (userProfileMood != null) {
                codedOutputByteBufferNano.K(19, userProfileMood, UserProfileMood.PROTOBUF_ADAPTER);
            }
            Extensions extensions = profile.extensions;
            if (extensions != null) {
                codedOutputByteBufferNano.K(20, extensions, Extensions.PROTOBUF_ADAPTER);
            }
            MoodMoment moodMoment = profile.moodMoment;
            if (moodMoment != null) {
                codedOutputByteBufferNano.K(21, moodMoment, MoodMoment.PROTOBUF_ADAPTER);
            }
            BizAnswers bizAnswers = profile.bizAnswers;
            if (bizAnswers != null) {
                codedOutputByteBufferNano.K(22, bizAnswers, BizAnswers.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(23, profile.onlyShowAboutMeInside);
            ProfileZodiac profileZodiac2 = profile.zodiac;
            if (profileZodiac2 != null) {
                codedOutputByteBufferNano.K(24, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Profile> JSON_ADAPTER = new ObjectJsonAdapter<Profile>() { // from class: com.p1.mobile.putong.data.Profile.2
        public Class getDataClass() {
            return Profile.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Profile mo17830newInstance() {
            return new Profile();
        }

        public boolean parseField(Profile profile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "moodMoment":
                    profile.moodMoment = (MoodMoment) MoodMoment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "studies":
                    profile.studies = (Studies) Studies.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "extensions":
                    profile.extensions = (Extensions) Extensions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mutualContacts":
                    profile.api_only_mutualContacts = (PartialIdList) PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "receivedLikesRank":
                    profile.receivedLikesRank = jsonParser.getValueAsString();
                    return true;
                case "school":
                    profile.school = jsonParser.getValueAsString();
                    return true;
                case "social":
                    profile.social = JsonAdapter.parseArray(jsonParser, Social.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "answers":
                    profile.answers = JsonAdapter.parseArray(jsonParser, Answer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "zodiac":
                    profile.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "hometown":
                    profile.hometown = jsonParser.getValueAsString();
                    return true;
                case "onlyShowAboutMeInside":
                    profile.onlyShowAboutMeInside = jsonParser.getValueAsBoolean();
                    return true;
                case "job":
                    profile.job = jsonParser.getValueAsString();
                    return true;
                case "tbh":
                    profile.tbh = (ProfileTbh) ProfileTbh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mood":
                    profile.mood = (UserProfileMood) UserProfileMood.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tags":
                    profile.tags = JsonAdapter.parseArray(jsonParser, Tag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "work":
                    profile.work = (Work) Work.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hangouts":
                    profile.hangouts = jsonParser.getValueAsString();
                    return true;
                case "bizAnswers":
                    profile.bizAnswers = (BizAnswers) BizAnswers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "moments":
                    profile.moments = (Moments) Moments.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "followships":
                    profile.followships = (FollowshipCounters) FollowshipCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "occupation":
                    profile.occupation = jsonParser.getValueAsString();
                    return true;
                case "scenarios":
                    profile.scenarios = JsonAdapter.parseArray(jsonParser, Converter.SCENARIO_ID, str2, arrayList, dataChecker);
                    return true;
                case "receivedLikes":
                    profile.receivedLikes = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Long.valueOf(jsonParser.getValueAsLong());
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Profile profile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "moodMoment":
                case "studies":
                case "extensions":
                case "mutualContacts":
                case "receivedLikesRank":
                case "school":
                case "social":
                case "answers":
                case "zodiac":
                case "hometown":
                case "onlyShowAboutMeInside":
                case "job":
                case "tbh":
                case "mood":
                case "tags":
                case "work":
                case "hangouts":
                case "bizAnswers":
                case "moments":
                case "followships":
                case "occupation":
                case "scenarios":
                case "receivedLikes":
                    return true;
                default:
                    return super.parseFieldCheck(profile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Profile profile, JsonGenerator jsonGenerator) throws IOException {
            String str = profile.school;
            if (str != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.school, str);
            }
            String str2 = profile.hangouts;
            if (str2 != null) {
                jsonGenerator.writeStringField("hangouts", str2);
            }
            String str3 = profile.hometown;
            if (str3 != null) {
                jsonGenerator.writeStringField("hometown", str3);
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
                jsonGenerator.writeFieldName(Social.TYPE);
                JsonAdapter.serializeArray(profile.social, jsonGenerator, Social.JSON_ADAPTER);
            }
            if (profile.answers != null) {
                jsonGenerator.writeFieldName("answers");
                JsonAdapter.serializeArray(profile.answers, jsonGenerator, Answer.JSON_ADAPTER);
            }
            if (profile.zodiac != null) {
                jsonGenerator.writeFieldName("zodiac");
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Profile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Profile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m920b(String str) {
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Profile m18834clone() {
        Profile profile = new Profile();
        profile.school = this.school;
        profile.hangouts = this.hangouts;
        profile.hometown = this.hometown;
        profile.receivedLikes = this.receivedLikes;
        List<Tag> list = this.tags;
        if (list != null) {
            profile.tags = ValueObject.util_map(list, new w9j() { // from class: l.ae90
                public final Object call(Object obj) {
                    return ((Tag) obj).m19078clone();
                }
            });
        }
        profile.job = this.job;
        PartialIdList partialIdList = this.api_only_mutualContacts;
        if (partialIdList != null) {
            profile.api_only_mutualContacts = partialIdList.m18767clone();
        }
        MutualContactsLocalLookups mutualContactsLocalLookups = this.contactLookups;
        if (mutualContactsLocalLookups != null) {
            profile.contactLookups = mutualContactsLocalLookups.m18503clone();
        }
        List<Social> list2 = this.social;
        if (list2 != null) {
            profile.social = ValueObject.util_map(list2, new w9j() { // from class: l.be90
                public final Object call(Object obj) {
                    return ((Social) obj).m18994clone();
                }
            });
        }
        List<Answer> list3 = this.answers;
        if (list3 != null) {
            profile.answers = ValueObject.util_map(list3, new w9j() { // from class: l.ce90
                public final Object call(Object obj) {
                    return ((Answer) obj).m17703clone();
                }
            });
        }
        profile.zodiac = this.zodiac;
        profile.occupation = this.occupation;
        Work work = this.work;
        if (work != null) {
            profile.work = work.m19388clone();
        }
        Studies studies = this.studies;
        if (studies != null) {
            profile.studies = studies.m19042clone();
        }
        List<String> list4 = this.scenarios;
        if (list4 != null) {
            profile.scenarios = ValueObject.util_map(list4, new w9j() { // from class: l.de90
                public final Object call(Object obj) {
                    return Profile.m920b((String) obj);
                }
            });
        }
        profile.receivedLikesRank = this.receivedLikesRank;
        ProfileTbh profileTbh = this.tbh;
        if (profileTbh != null) {
            profile.tbh = profileTbh.m18852clone();
        }
        FollowshipCounters followshipCounters = this.followships;
        if (followshipCounters != null) {
            profile.followships = followshipCounters.m18108clone();
        }
        Moments moments = this.moments;
        if (moments != null) {
            profile.moments = moments.m18494clone();
        }
        UserProfileMood userProfileMood = this.mood;
        if (userProfileMood != null) {
            profile.mood = userProfileMood.m19207clone();
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            profile.extensions = extensions.m18027clone();
        }
        MoodMoment moodMoment = this.moodMoment;
        if (moodMoment != null) {
            profile.moodMoment = moodMoment.m18497clone();
        }
        BizAnswers bizAnswers = this.bizAnswers;
        if (bizAnswers != null) {
            profile.bizAnswers = bizAnswers.m17774clone();
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

    public String getClassParseName() {
        return "profile";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode23;
        return iHashCode23;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(Profile profile) {
        if (!shouldMergeData() || equals(profile)) {
            return;
        }
        if (!isFieldParsed(StudentVerRejectedReason.school)) {
            this.school = profile.school;
        }
        if (!isFieldParsed("hangouts")) {
            this.hangouts = profile.hangouts;
        }
        if (!isFieldParsed("hometown")) {
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
        if (!isFieldParsed(Social.TYPE)) {
            this.social = profile.social;
        }
        if (!isFieldParsed("answers")) {
            this.answers = profile.answers;
        }
        if (!isFieldParsed("zodiac")) {
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
        return vwb.J(this.tags) ? new ArrayList() : vwb.n(this.tags, new w9j() { // from class: l.zd90
            public final Object call(Object obj) {
                return Boolean.valueOf("places".equals(((Tag) obj).category));
            }
        });
    }

    public void putParsedField(String str) {
        if ("v2".equals(xh5.v(this.requestUrl)) || "v3".equals(xh5.v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public boolean shouldMergeData() {
        return "v2".equals(xh5.v(this.requestUrl)) || "v3".equals(xh5.v(this.requestUrl));
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
