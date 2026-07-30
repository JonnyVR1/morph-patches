package p003l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.CoreAboutMePublicTags;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l.p7c0;
import l.qib0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jly {

    /* JADX INFO: renamed from: a */
    public CoreAboutMePublicTags f4686a;

    /* JADX INFO: renamed from: b */
    public CategorySuggestions f4687b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f4688c;

    /* JADX INFO: renamed from: l.jly$a */
    public static class C0356a {
        private static final jly INSTANCE = new jly();
    }

    public jly() {
        HashMap map = new HashMap();
        this.f4688c = map;
        map.put("sports", "same_minority_interest_sport");
        this.f4688c.put("music", "same_minority_interest_music");
        this.f4688c.put("food", "same_minority_interest_food");
        this.f4688c.put("movies", "same_minority_interest_movie");
        this.f4688c.put("literature", "same_minority_interest_book");
        this.f4688c.put("places", "same_minority_interest_travel");
    }

    /* JADX INFO: renamed from: N */
    public static jly m5369N() {
        return C0356a.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m5377h(StringBuilder sb, NewTags newTags) {
        sb.append(newTags.name);
        sb.append("、");
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m5393x(StringBuilder sb, Tag tag) {
        sb.append(tag.value);
        sb.append("、");
    }

    /* JADX INFO: renamed from: F */
    public final void m5396F(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(user2.profile.hometown)) {
            if (user2.profile.hometown.equals(user.profile.hometown)) {
                sb.append(String.format(CoreModule.b.getString(R.string.y1), user2.profile.hometown));
                m5400J(sb, arrayList, "same_hometown");
            } else if (m5407R(user2.profile.hometown)) {
                sb.append(String.format(CoreModule.b.getString(R.string.o1), user2.profile.hometown));
                m5400J(sb, arrayList, "diff_hometown");
            }
        }
        if (sb.length() > 0) {
            return;
        }
        String str = user2.profile.work.industry;
        if (m5408S(str) || user2.profile.studies.active) {
            if (m5408S(str) && !user2.profile.studies.active) {
                boolean zEquals = str.equals(user.profile.work.industry);
                Profile profile = user2.profile;
                if (zEquals) {
                    if (TextUtils.isEmpty(profile.work.department)) {
                        sb.append(String.format(CoreModule.b.getString(R.string.z1), str));
                        m5400J(sb, arrayList, "same_industry");
                    } else {
                        sb.append(String.format(CoreModule.b.getString(R.string.A1), str, user2.profile.work.department));
                        m5400J(sb, arrayList, "same_industry,job");
                    }
                } else if (!TextUtils.isEmpty(profile.work.department)) {
                    sb.append(String.format(CoreModule.b.getString(R.string.q1), str, user2.profile.work.department));
                    m5400J(sb, arrayList, "diff_industry,job");
                }
            }
            if (sb.length() > 0) {
                return;
            }
            if (m5409T(user2) && !TextUtils.isEmpty(user2.profile.studies.school) && !TextUtils.isEmpty(user2.profile.studies.major)) {
                String string = CoreModule.b.getString(R.string.F1);
                Studies studies = user2.profile.studies;
                sb.append(String.format(string, studies.school, studies.major));
                m5400J(sb, arrayList, "school,student,department");
            }
            if (sb.length() > 0) {
                return;
            }
            if (m5408S(str) && !user2.profile.studies.active) {
                sb.append(String.format(CoreModule.b.getString(R.string.p1), str));
                m5400J(sb, arrayList, "diff_industry");
            }
            if (sb.length() > 0) {
                return;
            }
        }
        if (!m5408S(str) && !TextUtils.isEmpty(user2.profile.work.department)) {
            sb.append(String.format(CoreModule.b.getString(R.string.I1), CoreModule.P().a().i3(user2.profile.zodiac), user2.profile.work.department));
            m5400J(sb, arrayList, "zodiac,job");
        }
        if (sb.length() <= 0 && m5409T(user2)) {
            if (!TextUtils.isEmpty(user2.profile.studies.school)) {
                sb.append(String.format(CoreModule.b.getString(R.string.E1), user2.profile.studies.school));
                m5400J(sb, arrayList, "school,student");
            } else if (TextUtils.isEmpty(user2.profile.studies.major)) {
                sb.append(CoreModule.b.getString(R.string.G1));
                m5400J(sb, arrayList, "student");
            } else {
                sb.append(String.format(CoreModule.b.getString(R.string.n1), user2.profile.studies.major));
                m5400J(sb, arrayList, "student,department");
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5397G(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        List list = user2.profile.extensions.interest.tags;
        if (!vwb.J(list)) {
            List<NewTags> listB0 = CoreModule.P().a().B0(list);
            if (!vwb.J(listB0)) {
                m5399I(arrayList, vwb.J(list) ? "" : String.format(CoreModule.b.getString(R.string.x1), m5403M("", listB0)), "customized_personality");
                m5398H(user2, arrayList);
                return;
            }
        }
        final HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        final ArrayList arrayList2 = new ArrayList();
        if (NullChecker.a(this.f4687b)) {
            arrayList2.addAll(this.f4687b.personality);
            arrayList2.addAll(this.f4687b.sports);
            arrayList2.addAll(this.f4687b.places);
            arrayList2.addAll(this.f4687b.music);
            arrayList2.addAll(this.f4687b.movies);
            arrayList2.addAll(this.f4687b.literature);
            arrayList2.addAll(this.f4687b.food);
        }
        ArrayList arrayListN = vwb.n(user2.profile.tags, new w9j() { // from class: l.eky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList2.contains(((Tag) obj).value));
            }
        });
        List<Tag> listN = vwb.n(arrayListN, new w9j() { // from class: l.gky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
        m5399I(arrayList, vwb.J(listN) ? "" : String.format(CoreModule.b.getString(R.string.x1), m5402L("", listN)), "customized_personality");
        ArrayList arrayListN2 = vwb.n(arrayListN, new w9j() { // from class: l.rky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(!"睡觉".equals(tag.value) && "sports".equals(tag.category));
            }
        });
        String str = vwb.J(arrayListN2) ? "" : String.format(CoreModule.b.getString(R.string.v1), m5402L("", arrayListN2));
        m5399I(arrayList, str, "customized_interest_sport");
        hashSet.addAll(arrayListN2);
        if (!TextUtils.isEmpty(str)) {
            hashSet2.add("sports");
        }
        ArrayList arrayListN3 = vwb.n(arrayListN, new w9j() { // from class: l.sky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("places".equals(((Tag) obj).category));
            }
        });
        String str2 = vwb.J(arrayListN3) ? "" : String.format(CoreModule.b.getString(R.string.w1), m5402L("", arrayListN3));
        m5399I(arrayList, str2, "customized_interest_travel");
        hashSet.addAll(arrayListN3);
        if (!TextUtils.isEmpty(str2)) {
            hashSet2.add("places");
        }
        ArrayList arrayListN4 = vwb.n(arrayListN, new w9j() { // from class: l.tky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("music".equals(((Tag) obj).category));
            }
        });
        String str3 = vwb.J(arrayListN4) ? "" : String.format(CoreModule.b.getString(R.string.u1), m5402L("", arrayListN4));
        m5399I(arrayList, str3, "customized_interest_music");
        hashSet.addAll(arrayListN4);
        if (!TextUtils.isEmpty(str3)) {
            hashSet2.add("music");
        }
        ArrayList arrayListN5 = vwb.n(arrayListN, new w9j() { // from class: l.uky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("movies".equals(((Tag) obj).category));
            }
        });
        String str4 = vwb.J(arrayListN5) ? "" : String.format(CoreModule.b.getString(R.string.t1), m5402L("", arrayListN5));
        m5399I(arrayList, str4, "customized_interest_movie");
        hashSet.addAll(arrayListN5);
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        String str5 = "movies";
        if (!zIsEmpty) {
            hashSet2.add("movies");
        }
        ArrayList arrayListN6 = vwb.n(arrayListN, new w9j() { // from class: l.vky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("literature".equals(((Tag) obj).category));
            }
        });
        String str6 = vwb.J(arrayListN6) ? "" : String.format(CoreModule.b.getString(R.string.r1), m5402L("", arrayListN6));
        m5399I(arrayList, str6, "customized_interest_book");
        hashSet.addAll(arrayListN6);
        if (!TextUtils.isEmpty(str6)) {
            hashSet2.add("literature");
        }
        ArrayList arrayListN7 = vwb.n(arrayListN, new w9j() { // from class: l.wky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        });
        String str7 = vwb.J(arrayListN7) ? "" : String.format(CoreModule.b.getString(R.string.s1), m5402L("", arrayListN7));
        m5399I(arrayList, str7, "customized_interest_food");
        hashSet.addAll(arrayListN7);
        if (!TextUtils.isEmpty(str7)) {
            hashSet2.add("food");
        }
        ArrayList arrayListN8 = vwb.n(user2.profile.tags, new w9j() { // from class: l.xky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8802a.m5410U((Tag) obj);
            }
        });
        ArrayList arrayListN9 = vwb.n(user.profile.tags, new w9j() { // from class: l.yky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f9080a.m5411V((Tag) obj);
            }
        });
        ArrayList arrayListN10 = vwb.n(arrayListN8, new w9j() { // from class: l.pky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListN11 = vwb.n(arrayListN9, new w9j() { // from class: l.aly
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListN12 = vwb.n(arrayListN10, new w9j() { // from class: l.cly
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListN11.contains((Tag) obj));
            }
        });
        m5399I(arrayList, vwb.J(arrayListN12) ? "" : String.format(CoreModule.b.getString(R.string.C1), m5402L("", arrayListN12)), "same_minority_interest_travel");
        hashSet.addAll(arrayListN12);
        ArrayList arrayListN13 = vwb.n(arrayListN8, new w9j() { // from class: l.dly
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListN14 = vwb.n(arrayListN9, new w9j() { // from class: l.ely
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListN15 = vwb.n(vwb.n(arrayListN13, new w9j() { // from class: l.fly
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListN14.contains((Tag) obj));
            }
        }), new w9j() { // from class: l.gly
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!"睡觉".equals(((Tag) obj).value));
            }
        });
        String str8 = vwb.J(arrayListN15) ? "" : String.format(CoreModule.b.getString(R.string.B1), m5402L("", arrayListN15));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arrayListN15.size()) {
            String str9 = str5;
            String str10 = this.f4688c.get(((Tag) arrayListN15.get(i)).category);
            if (str10 != null) {
                sb.append(str10);
                if (i != arrayListN15.size() - 1) {
                    sb.append(",");
                }
            }
            i++;
            str5 = str9;
        }
        String str11 = str5;
        m5399I(arrayList, str8, sb.toString());
        hashSet.addAll(arrayListN15);
        m5398H(user2, arrayList);
        if (!hashSet2.contains("sports")) {
            List<Tag> listN2 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.hly
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("sports".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.ily
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(("睡觉".equals(tag.value) || hashSet.contains(tag)) ? false : true);
                }
            });
            String str12 = vwb.J(listN2) ? "" : String.format(CoreModule.b.getString(R.string.v1), m5402L("", listN2));
            m5399I(arrayList, str12, "diff_minority_interest_sport");
            if (!TextUtils.isEmpty(str12)) {
                hashSet2.add("sports");
            }
        }
        if (!hashSet2.contains("places")) {
            List<Tag> listN3 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.fky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("places".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.hky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str13 = vwb.J(listN3) ? "" : String.format(CoreModule.b.getString(R.string.w1), m5402L("", listN3));
            m5399I(arrayList, str13, "diff_minority_interest_travel");
            if (!TextUtils.isEmpty(str13)) {
                hashSet2.add("places");
            }
        }
        if (!hashSet2.contains("music")) {
            List<Tag> listN4 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.iky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("music".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.jky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str14 = vwb.J(listN4) ? "" : String.format(CoreModule.b.getString(R.string.u1), m5402L("", listN4));
            m5399I(arrayList, str14, "diff_minority_interest_music");
            if (!TextUtils.isEmpty(str14)) {
                hashSet2.add("music");
            }
        }
        if (!hashSet2.contains(str11)) {
            List<Tag> listN5 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.kky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("movies".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.lky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str15 = vwb.J(listN5) ? "" : String.format(CoreModule.b.getString(R.string.t1), m5402L("", listN5));
            m5399I(arrayList, str15, "diff_minority_interest_movie");
            if (!TextUtils.isEmpty(str15)) {
                hashSet2.add(str11);
            }
        }
        if (!hashSet2.contains("literature")) {
            List<Tag> listN6 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.mky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("literature".equals(((Tag) obj).category));
                }
            }), new w9j() { // from class: l.nky
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str16 = vwb.J(listN6) ? "" : String.format(CoreModule.b.getString(R.string.r1), m5402L("", listN6));
            m5399I(arrayList, str16, "diff_minority_interest_book");
            if (!TextUtils.isEmpty(str16)) {
                hashSet2.add("literature");
            }
        }
        if (hashSet2.contains("food")) {
            return;
        }
        List<Tag> listN7 = vwb.n(vwb.n(arrayListN8, new w9j() { // from class: l.oky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        }), new w9j() { // from class: l.qky
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!hashSet.contains((Tag) obj));
            }
        });
        String str17 = vwb.J(listN7) ? "" : String.format(CoreModule.b.getString(R.string.s1), m5402L("", listN7));
        m5399I(arrayList, str17, "diff_minority_interest_food");
        if (TextUtils.isEmpty(str17)) {
            return;
        }
        hashSet2.add("food");
    }

    /* JADX INFO: renamed from: H */
    public final void m5398H(User user, ArrayList<Pair<String, String>> arrayList) {
        HashMap map = new HashMap(6);
        if (vwb.J(user.profile.answers)) {
            return;
        }
        for (Answer answer : user.profile.answers) {
            if ("5".equals(answer.question) || "6".equals(answer.question) || "2".equals(answer.question) || "7".equals(answer.question) || "1".equals(answer.question) || "3".equals(answer.question)) {
                map.put(answer.question, answer);
            }
        }
        Answer answer2 = (Answer) map.get("5");
        if (answer2 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.k1), answer2.value), "my_answer_TV");
        }
        Answer answer3 = (Answer) map.get("6");
        if (answer3 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.i1), answer3.value), "my_answer_happy");
        }
        Answer answer4 = (Answer) map.get("2");
        if (answer4 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.h1), answer4.value), "my_answer_city");
        }
        Answer answer5 = (Answer) map.get("7");
        if (answer5 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.j1), answer5.value), "my_answer_ability");
        }
        Answer answer6 = (Answer) map.get("1");
        if (answer6 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.m1), answer6.value), "my_answer_money&time");
        }
        Answer answer7 = (Answer) map.get("3");
        if (answer7 != null) {
            m5399I(arrayList, String.format(CoreModule.b.getString(R.string.l1), answer7.value), "my_answer_song");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m5399I(ArrayList<Pair<String, String>> arrayList, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(Pair.create(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public final void m5400J(StringBuilder sb, ArrayList<Pair<String, String>> arrayList, String str) {
        arrayList.add(Pair.create(CoreModule.b.getString(R.string.D1) + sb.toString(), str));
    }

    /* JADX INFO: renamed from: K */
    public ArrayList<Pair<String, String>> m5401K(@NonNull User user, @NonNull User user2) {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        m5396F(user, user2, arrayList);
        ArrayList<Pair<String, String>> arrayList2 = new ArrayList<>();
        m5397G(user, user2, arrayList2);
        if (vwb.J(arrayList) && vwb.J(arrayList2)) {
            arrayList.add(Pair.create(String.format(CoreModule.b.getString(R.string.J1), CoreModule.P().a().i3(user2.profile.zodiac)), "zodiac"));
        } else if (vwb.J(arrayList) && !vwb.J(arrayList2)) {
            arrayList.add(Pair.create(CoreModule.b.getString(R.string.D1) + String.format(CoreModule.b.getString(R.string.H1), CoreModule.P().a().i3(user2.profile.zodiac)), "zodiac"));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final String m5402L(String str, List<Tag> list) {
        if (vwb.J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        vwb.z(list, new e30() { // from class: l.zky
            @Override // p003l.e30
            public final void call(Object obj) {
                jly.m5393x(sb, (Tag) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public final String m5403M(String str, List<NewTags> list) {
        if (vwb.J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        vwb.z(list, new e30() { // from class: l.bly
            @Override // p003l.e30
            public final void call(Object obj) {
                jly.m5377h(sb, (NewTags) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O */
    public void m5404O() {
        if (this.f4687b == null) {
            try {
                this.f4687b = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(CoreModule.P().a().g0()));
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m5405P() {
        if (this.f4686a == null) {
            try {
                this.f4686a = (CoreAboutMePublicTags) CoreAboutMePublicTags.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(p7c0.a));
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5406Q(Tag tag) {
        if (!NullChecker.a(this.f4686a)) {
            return false;
        }
        List list = (List) this.f4686a.popularTag.get(tag.category);
        if (vwb.J(list)) {
            return false;
        }
        return !list.contains(tag.value);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m5407R(String str) {
        if (NullChecker.a(this.f4686a)) {
            return this.f4686a.showHometown.contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m5408S(String str) {
        return ("其他".equals(str) || TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m5409T(User user) {
        return user.profile.studies.active && (user.age.intValue() <= 22 || ((((qib0.H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) > 31536000L ? 1 : (((qib0.H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) == 31536000L ? 0 : -1)) <= 0));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Boolean m5410U(Tag tag) {
        return Boolean.valueOf(m5406Q(tag));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m5411V(Tag tag) {
        return Boolean.valueOf(m5406Q(tag));
    }
}
