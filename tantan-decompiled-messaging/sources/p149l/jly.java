package p149l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.CoreAboutMePublicTags;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jly {

    /* JADX INFO: renamed from: a */
    public CoreAboutMePublicTags f118600a;

    /* JADX INFO: renamed from: b */
    public CategorySuggestions f118601b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f118602c;

    /* JADX INFO: renamed from: l.jly$a */
    public static class C17814a {
        private static final jly INSTANCE = new jly();
    }

    public jly() {
        HashMap map = new HashMap();
        this.f118602c = map;
        map.put("sports", "same_minority_interest_sport");
        this.f118602c.put("music", "same_minority_interest_music");
        this.f118602c.put("food", "same_minority_interest_food");
        this.f118602c.put("movies", "same_minority_interest_movie");
        this.f118602c.put("literature", "same_minority_interest_book");
        this.f118602c.put("places", "same_minority_interest_travel");
    }

    /* JADX INFO: renamed from: N */
    public static jly m142126N() {
        return C17814a.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m142134h(StringBuilder sb, NewTags newTags) {
        sb.append(newTags.name);
        sb.append("、");
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m142150x(StringBuilder sb, Tag tag) {
        sb.append(tag.value);
        sb.append("、");
    }

    /* JADX INFO: renamed from: F */
    public final void m142153F(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(user2.profile.hometown)) {
            if (user2.profile.hometown.equals(user.profile.hometown)) {
                sb.append(String.format(CoreModule.f17544b.getString(R$string.f21126y1), user2.profile.hometown));
                m142157J(sb, arrayList, "same_hometown");
            } else if (m142164R(user2.profile.hometown)) {
                sb.append(String.format(CoreModule.f17544b.getString(R$string.f21044o1), user2.profile.hometown));
                m142157J(sb, arrayList, "diff_hometown");
            }
        }
        if (sb.length() > 0) {
            return;
        }
        String str = user2.profile.work.industry;
        if (m142165S(str) || user2.profile.studies.active) {
            if (m142165S(str) && !user2.profile.studies.active) {
                boolean zEquals = str.equals(user.profile.work.industry);
                Profile profile = user2.profile;
                if (zEquals) {
                    if (TextUtils.isEmpty(profile.work.department)) {
                        sb.append(String.format(CoreModule.f17544b.getString(R$string.f21134z1), str));
                        m142157J(sb, arrayList, "same_industry");
                    } else {
                        sb.append(String.format(CoreModule.f17544b.getString(R$string.f20710A1), str, user2.profile.work.department));
                        m142157J(sb, arrayList, "same_industry,job");
                    }
                } else if (!TextUtils.isEmpty(profile.work.department)) {
                    sb.append(String.format(CoreModule.f17544b.getString(R$string.f21062q1), str, user2.profile.work.department));
                    m142157J(sb, arrayList, "diff_industry,job");
                }
            }
            if (sb.length() > 0) {
                return;
            }
            if (m142166T(user2) && !TextUtils.isEmpty(user2.profile.studies.school) && !TextUtils.isEmpty(user2.profile.studies.major)) {
                String string = CoreModule.f17544b.getString(R$string.f20750F1);
                Studies studies = user2.profile.studies;
                sb.append(String.format(string, studies.school, studies.major));
                m142157J(sb, arrayList, "school,student,department");
            }
            if (sb.length() > 0) {
                return;
            }
            if (m142165S(str) && !user2.profile.studies.active) {
                sb.append(String.format(CoreModule.f17544b.getString(R$string.f21053p1), str));
                m142157J(sb, arrayList, "diff_industry");
            }
            if (sb.length() > 0) {
                return;
            }
        }
        if (!m142165S(str) && !TextUtils.isEmpty(user2.profile.work.department)) {
            sb.append(String.format(CoreModule.f17544b.getString(R$string.f20774I1), CoreModule.m29935P().m94651a().mo158392i3(user2.profile.zodiac), user2.profile.work.department));
            m142157J(sb, arrayList, "zodiac,job");
        }
        if (sb.length() <= 0 && m142166T(user2)) {
            if (!TextUtils.isEmpty(user2.profile.studies.school)) {
                sb.append(String.format(CoreModule.f17544b.getString(R$string.f20742E1), user2.profile.studies.school));
                m142157J(sb, arrayList, "school,student");
            } else if (TextUtils.isEmpty(user2.profile.studies.major)) {
                sb.append(CoreModule.f17544b.getString(R$string.f20758G1));
                m142157J(sb, arrayList, "student");
            } else {
                sb.append(String.format(CoreModule.f17544b.getString(R$string.f21035n1), user2.profile.studies.major));
                m142157J(sb, arrayList, "student,department");
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m142154G(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        List<String> list = user2.profile.extensions.interest.tags;
        if (!vwb.m200296J(list)) {
            List<NewTags> listMo158205B0 = CoreModule.m29935P().m94651a().mo158205B0(list);
            if (!vwb.m200296J(listMo158205B0)) {
                m142156I(arrayList, vwb.m200296J(list) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21118x1), m142160M("", listMo158205B0)), "customized_personality");
                m142155H(user2, arrayList);
                return;
            }
        }
        final HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        final ArrayList arrayList2 = new ArrayList();
        if (NullChecker.m81303a(this.f118601b)) {
            arrayList2.addAll(this.f118601b.personality);
            arrayList2.addAll(this.f118601b.sports);
            arrayList2.addAll(this.f118601b.places);
            arrayList2.addAll(this.f118601b.music);
            arrayList2.addAll(this.f118601b.movies);
            arrayList2.addAll(this.f118601b.literature);
            arrayList2.addAll(this.f118601b.food);
        }
        ArrayList arrayListM200339n = vwb.m200339n(user2.profile.tags, new w9j() { // from class: l.eky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList2.contains(((Tag) obj).value));
            }
        });
        List<Tag> listM200339n = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.gky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
        m142156I(arrayList, vwb.m200296J(listM200339n) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21118x1), m142159L("", listM200339n)), "customized_personality");
        ArrayList arrayListM200339n2 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.rky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(!"睡觉".equals(tag.value) && "sports".equals(tag.category));
            }
        });
        String str = vwb.m200296J(arrayListM200339n2) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21102v1), m142159L("", arrayListM200339n2));
        m142156I(arrayList, str, "customized_interest_sport");
        hashSet.addAll(arrayListM200339n2);
        if (!TextUtils.isEmpty(str)) {
            hashSet2.add("sports");
        }
        ArrayList arrayListM200339n3 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.sky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("places".equals(((Tag) obj).category));
            }
        });
        String str2 = vwb.m200296J(arrayListM200339n3) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21110w1), m142159L("", arrayListM200339n3));
        m142156I(arrayList, str2, "customized_interest_travel");
        hashSet.addAll(arrayListM200339n3);
        if (!TextUtils.isEmpty(str2)) {
            hashSet2.add("places");
        }
        ArrayList arrayListM200339n4 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.tky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("music".equals(((Tag) obj).category));
            }
        });
        String str3 = vwb.m200296J(arrayListM200339n4) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21094u1), m142159L("", arrayListM200339n4));
        m142156I(arrayList, str3, "customized_interest_music");
        hashSet.addAll(arrayListM200339n4);
        if (!TextUtils.isEmpty(str3)) {
            hashSet2.add("music");
        }
        ArrayList arrayListM200339n5 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.uky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("movies".equals(((Tag) obj).category));
            }
        });
        String str4 = vwb.m200296J(arrayListM200339n5) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21086t1), m142159L("", arrayListM200339n5));
        m142156I(arrayList, str4, "customized_interest_movie");
        hashSet.addAll(arrayListM200339n5);
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        String str5 = "movies";
        if (!zIsEmpty) {
            hashSet2.add("movies");
        }
        ArrayList arrayListM200339n6 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.vky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("literature".equals(((Tag) obj).category));
            }
        });
        String str6 = vwb.m200296J(arrayListM200339n6) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21070r1), m142159L("", arrayListM200339n6));
        m142156I(arrayList, str6, "customized_interest_book");
        hashSet.addAll(arrayListM200339n6);
        if (!TextUtils.isEmpty(str6)) {
            hashSet2.add("literature");
        }
        ArrayList arrayListM200339n7 = vwb.m200339n(arrayListM200339n, new w9j() { // from class: l.wky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        });
        String str7 = vwb.m200296J(arrayListM200339n7) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21078s1), m142159L("", arrayListM200339n7));
        m142156I(arrayList, str7, "customized_interest_food");
        hashSet.addAll(arrayListM200339n7);
        if (!TextUtils.isEmpty(str7)) {
            hashSet2.add("food");
        }
        ArrayList arrayListM200339n8 = vwb.m200339n(user2.profile.tags, new w9j() { // from class: l.xky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193367a.m142167U((Tag) obj);
            }
        });
        ArrayList arrayListM200339n9 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.yky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198846a.m142168V((Tag) obj);
            }
        });
        ArrayList arrayListM200339n10 = vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.pky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListM200339n11 = vwb.m200339n(arrayListM200339n9, new w9j() { // from class: l.aly
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListM200339n12 = vwb.m200339n(arrayListM200339n10, new w9j() { // from class: l.cly
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListM200339n11.contains((Tag) obj));
            }
        });
        m142156I(arrayList, vwb.m200296J(arrayListM200339n12) ? "" : String.format(CoreModule.f17544b.getString(R$string.f20726C1), m142159L("", arrayListM200339n12)), "same_minority_interest_travel");
        hashSet.addAll(arrayListM200339n12);
        ArrayList arrayListM200339n13 = vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.dly
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListM200339n14 = vwb.m200339n(arrayListM200339n9, new w9j() { // from class: l.ely
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListM200339n15 = vwb.m200339n(vwb.m200339n(arrayListM200339n13, new w9j() { // from class: l.fly
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListM200339n14.contains((Tag) obj));
            }
        }), new w9j() { // from class: l.gly
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!"睡觉".equals(((Tag) obj).value));
            }
        });
        String str8 = vwb.m200296J(arrayListM200339n15) ? "" : String.format(CoreModule.f17544b.getString(R$string.f20718B1), m142159L("", arrayListM200339n15));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arrayListM200339n15.size()) {
            String str9 = str5;
            String str10 = this.f118602c.get(((Tag) arrayListM200339n15.get(i)).category);
            if (str10 != null) {
                sb.append(str10);
                if (i != arrayListM200339n15.size() - 1) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            i++;
            str5 = str9;
        }
        String str11 = str5;
        m142156I(arrayList, str8, sb.toString());
        hashSet.addAll(arrayListM200339n15);
        m142155H(user2, arrayList);
        if (!hashSet2.contains("sports")) {
            List<Tag> listM200339n2 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.hly
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("sports".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.ily
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(("睡觉".equals(tag.value) || hashSet.contains(tag)) ? false : true);
                }
            });
            String str12 = vwb.m200296J(listM200339n2) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21102v1), m142159L("", listM200339n2));
            m142156I(arrayList, str12, "diff_minority_interest_sport");
            if (!TextUtils.isEmpty(str12)) {
                hashSet2.add("sports");
            }
        }
        if (!hashSet2.contains("places")) {
            List<Tag> listM200339n3 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.fky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("places".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.hky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str13 = vwb.m200296J(listM200339n3) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21110w1), m142159L("", listM200339n3));
            m142156I(arrayList, str13, "diff_minority_interest_travel");
            if (!TextUtils.isEmpty(str13)) {
                hashSet2.add("places");
            }
        }
        if (!hashSet2.contains("music")) {
            List<Tag> listM200339n4 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.iky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("music".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.jky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str14 = vwb.m200296J(listM200339n4) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21094u1), m142159L("", listM200339n4));
            m142156I(arrayList, str14, "diff_minority_interest_music");
            if (!TextUtils.isEmpty(str14)) {
                hashSet2.add("music");
            }
        }
        if (!hashSet2.contains(str11)) {
            List<Tag> listM200339n5 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.kky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("movies".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.lky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str15 = vwb.m200296J(listM200339n5) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21086t1), m142159L("", listM200339n5));
            m142156I(arrayList, str15, "diff_minority_interest_movie");
            if (!TextUtils.isEmpty(str15)) {
                hashSet2.add(str11);
            }
        }
        if (!hashSet2.contains("literature")) {
            List<Tag> listM200339n6 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.mky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("literature".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.nky
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str16 = vwb.m200296J(listM200339n6) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21070r1), m142159L("", listM200339n6));
            m142156I(arrayList, str16, "diff_minority_interest_book");
            if (!TextUtils.isEmpty(str16)) {
                hashSet2.add("literature");
            }
        }
        if (hashSet2.contains("food")) {
            return;
        }
        List<Tag> listM200339n7 = vwb.m200339n(vwb.m200339n(arrayListM200339n8, new w9j() { // from class: l.oky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        }), new w9j() { // from class: l.qky
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!hashSet.contains((Tag) obj));
            }
        });
        String str17 = vwb.m200296J(listM200339n7) ? "" : String.format(CoreModule.f17544b.getString(R$string.f21078s1), m142159L("", listM200339n7));
        m142156I(arrayList, str17, "diff_minority_interest_food");
        if (TextUtils.isEmpty(str17)) {
            return;
        }
        hashSet2.add("food");
    }

    /* JADX INFO: renamed from: H */
    public final void m142155H(User user, ArrayList<Pair<String, String>> arrayList) {
        HashMap map = new HashMap(6);
        if (vwb.m200296J(user.profile.answers)) {
            return;
        }
        for (Answer answer : user.profile.answers) {
            if ("5".equals(answer.question) || com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO.equals(answer.question) || "2".equals(answer.question) || "7".equals(answer.question) || "1".equals(answer.question) || "3".equals(answer.question)) {
                map.put(answer.question, answer);
            }
        }
        Answer answer2 = (Answer) map.get("5");
        if (answer2 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f21008k1), answer2.value), "my_answer_TV");
        }
        Answer answer3 = (Answer) map.get(com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO);
        if (answer3 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f20990i1), answer3.value), "my_answer_happy");
        }
        Answer answer4 = (Answer) map.get("2");
        if (answer4 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f20981h1), answer4.value), "my_answer_city");
        }
        Answer answer5 = (Answer) map.get("7");
        if (answer5 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f20999j1), answer5.value), "my_answer_ability");
        }
        Answer answer6 = (Answer) map.get("1");
        if (answer6 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f21026m1), answer6.value), "my_answer_money&time");
        }
        Answer answer7 = (Answer) map.get("3");
        if (answer7 != null) {
            m142156I(arrayList, String.format(CoreModule.f17544b.getString(R$string.f21017l1), answer7.value), "my_answer_song");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m142156I(ArrayList<Pair<String, String>> arrayList, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(Pair.create(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public final void m142157J(StringBuilder sb, ArrayList<Pair<String, String>> arrayList, String str) {
        arrayList.add(Pair.create(CoreModule.f17544b.getString(R$string.f20734D1) + sb.toString(), str));
    }

    /* JADX INFO: renamed from: K */
    public ArrayList<Pair<String, String>> m142158K(@NonNull User user, @NonNull User user2) {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        m142153F(user, user2, arrayList);
        ArrayList<Pair<String, String>> arrayList2 = new ArrayList<>();
        m142154G(user, user2, arrayList2);
        if (vwb.m200296J(arrayList) && vwb.m200296J(arrayList2)) {
            arrayList.add(Pair.create(String.format(CoreModule.f17544b.getString(R$string.f20782J1), CoreModule.m29935P().m94651a().mo158392i3(user2.profile.zodiac)), ProfileLikeCategoryType.zodiac));
        } else if (vwb.m200296J(arrayList) && !vwb.m200296J(arrayList2)) {
            arrayList.add(Pair.create(CoreModule.f17544b.getString(R$string.f20734D1) + String.format(CoreModule.f17544b.getString(R$string.f20766H1), CoreModule.m29935P().m94651a().mo158392i3(user2.profile.zodiac)), ProfileLikeCategoryType.zodiac));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final String m142159L(String str, List<Tag> list) {
        if (vwb.m200296J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        vwb.m200354z(list, new e30() { // from class: l.zky
            @Override // p149l.e30
            public final void call(Object obj) {
                jly.m142150x(sb, (Tag) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public final String m142160M(String str, List<NewTags> list) {
        if (vwb.m200296J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        vwb.m200354z(list, new e30() { // from class: l.bly
            @Override // p149l.e30
            public final void call(Object obj) {
                jly.m142134h(sb, (NewTags) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O */
    public void m142161O() {
        if (this.f118601b == null) {
            try {
                this.f118601b = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(CoreModule.m29935P().m94651a().mo158379g0()));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m142162P() {
        if (this.f118600a == null) {
            try {
                this.f118600a = CoreAboutMePublicTags.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(p7c0.f147488a));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m142163Q(Tag tag) {
        if (!NullChecker.m81303a(this.f118600a)) {
            return false;
        }
        List<String> list = this.f118600a.popularTag.get(tag.category);
        if (vwb.m200296J(list)) {
            return false;
        }
        return !list.contains(tag.value);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m142164R(String str) {
        if (NullChecker.m81303a(this.f118600a)) {
            return this.f118600a.showHometown.contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m142165S(String str) {
        return ("其他".equals(str) || TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m142166T(User user) {
        return user.profile.studies.active && (user.age.intValue() <= 22 || ((((qib0.f154693H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) > 31536000L ? 1 : (((qib0.f154693H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) == 31536000L ? 0 : -1)) <= 0));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Boolean m142167U(Tag tag) {
        return Boolean.valueOf(m142163Q(tag));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m142168V(Tag tag) {
        return Boolean.valueOf(m142163Q(tag));
    }
}
