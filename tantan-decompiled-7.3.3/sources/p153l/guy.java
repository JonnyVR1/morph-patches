package p153l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.CoreAboutMePublicTags;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class guy {

    /* JADX INFO: renamed from: a */
    public CoreAboutMePublicTags f106590a;

    /* JADX INFO: renamed from: b */
    public CategorySuggestions f106591b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f106592c;

    /* JADX INFO: renamed from: l.guy$a */
    public static class C17322a {
        private static final guy INSTANCE = new guy();
    }

    public guy() {
        HashMap map = new HashMap();
        this.f106592c = map;
        map.put("sports", "same_minority_interest_sport");
        this.f106592c.put("music", "same_minority_interest_music");
        this.f106592c.put("food", "same_minority_interest_food");
        this.f106592c.put("movies", "same_minority_interest_movie");
        this.f106592c.put("literature", "same_minority_interest_book");
        this.f106592c.put("places", "same_minority_interest_travel");
    }

    /* JADX INFO: renamed from: N */
    public static guy m132421N() {
        return C17322a.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m132429h(StringBuilder sb, NewTags newTags) {
        sb.append(newTags.name);
        sb.append("、");
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m132445x(StringBuilder sb, Tag tag) {
        sb.append(tag.value);
        sb.append("、");
    }

    /* JADX INFO: renamed from: F */
    public final void m132448F(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(user2.profile.hometown)) {
            if (user2.profile.hometown.equals(user.profile.hometown)) {
                sb.append(String.format(CoreModule.f18263b.getString(R$string.f21868y1), user2.profile.hometown));
                m132452J(sb, arrayList, "same_hometown");
            } else if (m132459R(user2.profile.hometown)) {
                sb.append(String.format(CoreModule.f18263b.getString(R$string.f21786o1), user2.profile.hometown));
                m132452J(sb, arrayList, "diff_hometown");
            }
        }
        if (sb.length() > 0) {
            return;
        }
        String str = user2.profile.work.industry;
        if (m132460S(str) || user2.profile.studies.active) {
            if (m132460S(str) && !user2.profile.studies.active) {
                boolean zEquals = str.equals(user.profile.work.industry);
                Profile profile = user2.profile;
                if (zEquals) {
                    if (TextUtils.isEmpty(profile.work.department)) {
                        sb.append(String.format(CoreModule.f18263b.getString(R$string.f21876z1), str));
                        m132452J(sb, arrayList, "same_industry");
                    } else {
                        sb.append(String.format(CoreModule.f18263b.getString(R$string.f21452A1), str, user2.profile.work.department));
                        m132452J(sb, arrayList, "same_industry,job");
                    }
                } else if (!TextUtils.isEmpty(profile.work.department)) {
                    sb.append(String.format(CoreModule.f18263b.getString(R$string.f21804q1), str, user2.profile.work.department));
                    m132452J(sb, arrayList, "diff_industry,job");
                }
            }
            if (sb.length() > 0) {
                return;
            }
            if (m132461T(user2) && !TextUtils.isEmpty(user2.profile.studies.school) && !TextUtils.isEmpty(user2.profile.studies.major)) {
                String string = CoreModule.f18263b.getString(R$string.f21492F1);
                Studies studies = user2.profile.studies;
                sb.append(String.format(string, studies.school, studies.major));
                m132452J(sb, arrayList, "school,student,department");
            }
            if (sb.length() > 0) {
                return;
            }
            if (m132460S(str) && !user2.profile.studies.active) {
                sb.append(String.format(CoreModule.f18263b.getString(R$string.f21795p1), str));
                m132452J(sb, arrayList, "diff_industry");
            }
            if (sb.length() > 0) {
                return;
            }
        }
        if (!m132460S(str) && !TextUtils.isEmpty(user2.profile.work.department)) {
            sb.append(String.format(CoreModule.f18263b.getString(R$string.f21516I1), CoreModule.m30933P().m143405a().mo180484i3(user2.profile.zodiac), user2.profile.work.department));
            m132452J(sb, arrayList, "zodiac,job");
        }
        if (sb.length() <= 0 && m132461T(user2)) {
            if (!TextUtils.isEmpty(user2.profile.studies.school)) {
                sb.append(String.format(CoreModule.f18263b.getString(R$string.f21484E1), user2.profile.studies.school));
                m132452J(sb, arrayList, "school,student");
            } else if (TextUtils.isEmpty(user2.profile.studies.major)) {
                sb.append(CoreModule.f18263b.getString(R$string.f21500G1));
                m132452J(sb, arrayList, "student");
            } else {
                sb.append(String.format(CoreModule.f18263b.getString(R$string.f21777n1), user2.profile.studies.major));
                m132452J(sb, arrayList, "student,department");
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m132449G(@NonNull User user, @NonNull User user2, ArrayList<Pair<String, String>> arrayList) {
        List<String> list = user2.profile.extensions.interest.tags;
        if (!jyb.m147479J(list)) {
            List<NewTags> listMo180297B0 = CoreModule.m30933P().m143405a().mo180297B0(list);
            if (!jyb.m147479J(listMo180297B0)) {
                m132451I(arrayList, jyb.m147479J(list) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21860x1), m132455M("", listMo180297B0)), "customized_personality");
                m132450H(user2, arrayList);
                return;
            }
        }
        final HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        final ArrayList arrayList2 = new ArrayList();
        if (NullChecker.m82486a(this.f106591b)) {
            arrayList2.addAll(this.f106591b.personality);
            arrayList2.addAll(this.f106591b.sports);
            arrayList2.addAll(this.f106591b.places);
            arrayList2.addAll(this.f106591b.music);
            arrayList2.addAll(this.f106591b.movies);
            arrayList2.addAll(this.f106591b.literature);
            arrayList2.addAll(this.f106591b.food);
        }
        ArrayList arrayListM147522n = jyb.m147522n(user2.profile.tags, new qcj() { // from class: l.bty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList2.contains(((Tag) obj).value));
            }
        });
        List<Tag> listM147522n = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.dty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
        m132451I(arrayList, jyb.m147479J(listM147522n) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21860x1), m132454L("", listM147522n)), "customized_personality");
        ArrayList arrayListM147522n2 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.oty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(!"睡觉".equals(tag.value) && "sports".equals(tag.category));
            }
        });
        String str = jyb.m147479J(arrayListM147522n2) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21844v1), m132454L("", arrayListM147522n2));
        m132451I(arrayList, str, "customized_interest_sport");
        hashSet.addAll(arrayListM147522n2);
        if (!TextUtils.isEmpty(str)) {
            hashSet2.add("sports");
        }
        ArrayList arrayListM147522n3 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.pty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("places".equals(((Tag) obj).category));
            }
        });
        String str2 = jyb.m147479J(arrayListM147522n3) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21852w1), m132454L("", arrayListM147522n3));
        m132451I(arrayList, str2, "customized_interest_travel");
        hashSet.addAll(arrayListM147522n3);
        if (!TextUtils.isEmpty(str2)) {
            hashSet2.add("places");
        }
        ArrayList arrayListM147522n4 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.qty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("music".equals(((Tag) obj).category));
            }
        });
        String str3 = jyb.m147479J(arrayListM147522n4) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21836u1), m132454L("", arrayListM147522n4));
        m132451I(arrayList, str3, "customized_interest_music");
        hashSet.addAll(arrayListM147522n4);
        if (!TextUtils.isEmpty(str3)) {
            hashSet2.add("music");
        }
        ArrayList arrayListM147522n5 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.rty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("movies".equals(((Tag) obj).category));
            }
        });
        String str4 = jyb.m147479J(arrayListM147522n5) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21828t1), m132454L("", arrayListM147522n5));
        m132451I(arrayList, str4, "customized_interest_movie");
        hashSet.addAll(arrayListM147522n5);
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        String str5 = "movies";
        if (!zIsEmpty) {
            hashSet2.add("movies");
        }
        ArrayList arrayListM147522n6 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.sty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("literature".equals(((Tag) obj).category));
            }
        });
        String str6 = jyb.m147479J(arrayListM147522n6) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21812r1), m132454L("", arrayListM147522n6));
        m132451I(arrayList, str6, "customized_interest_book");
        hashSet.addAll(arrayListM147522n6);
        if (!TextUtils.isEmpty(str6)) {
            hashSet2.add("literature");
        }
        ArrayList arrayListM147522n7 = jyb.m147522n(arrayListM147522n, new qcj() { // from class: l.tty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        });
        String str7 = jyb.m147479J(arrayListM147522n7) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21820s1), m132454L("", arrayListM147522n7));
        m132451I(arrayList, str7, "customized_interest_food");
        hashSet.addAll(arrayListM147522n7);
        if (!TextUtils.isEmpty(str7)) {
            hashSet2.add("food");
        }
        ArrayList arrayListM147522n8 = jyb.m147522n(user2.profile.tags, new qcj() { // from class: l.uty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181009a.m132462U((Tag) obj);
            }
        });
        ArrayList arrayListM147522n9 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.vty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185759a.m132463V((Tag) obj);
            }
        });
        ArrayList arrayListM147522n10 = jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.mty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListM147522n11 = jyb.m147522n(arrayListM147522n9, new qcj() { // from class: l.xty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListM147522n12 = jyb.m147522n(arrayListM147522n10, new qcj() { // from class: l.zty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListM147522n11.contains((Tag) obj));
            }
        });
        m132451I(arrayList, jyb.m147479J(arrayListM147522n12) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21468C1), m132454L("", arrayListM147522n12)), "same_minority_interest_travel");
        hashSet.addAll(arrayListM147522n12);
        ArrayList arrayListM147522n13 = jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.auy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        final ArrayList arrayListM147522n14 = jyb.m147522n(arrayListM147522n9, new qcj() { // from class: l.buy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Tag) obj).category.equals("places"));
            }
        });
        ArrayList arrayListM147522n15 = jyb.m147522n(jyb.m147522n(arrayListM147522n13, new qcj() { // from class: l.cuy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(arrayListM147522n14.contains((Tag) obj));
            }
        }), new qcj() { // from class: l.duy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!"睡觉".equals(((Tag) obj).value));
            }
        });
        String str8 = jyb.m147479J(arrayListM147522n15) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21460B1), m132454L("", arrayListM147522n15));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arrayListM147522n15.size()) {
            String str9 = str5;
            String str10 = this.f106592c.get(((Tag) arrayListM147522n15.get(i)).category);
            if (str10 != null) {
                sb.append(str10);
                if (i != arrayListM147522n15.size() - 1) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            i++;
            str5 = str9;
        }
        String str11 = str5;
        m132451I(arrayList, str8, sb.toString());
        hashSet.addAll(arrayListM147522n15);
        m132450H(user2, arrayList);
        if (!hashSet2.contains("sports")) {
            List<Tag> listM147522n2 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.euy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("sports".equals(((Tag) obj).category));
                }
            }), new qcj() { // from class: l.fuy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Tag tag = (Tag) obj;
                    return Boolean.valueOf(("睡觉".equals(tag.value) || hashSet.contains(tag)) ? false : true);
                }
            });
            String str12 = jyb.m147479J(listM147522n2) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21844v1), m132454L("", listM147522n2));
            m132451I(arrayList, str12, "diff_minority_interest_sport");
            if (!TextUtils.isEmpty(str12)) {
                hashSet2.add("sports");
            }
        }
        if (!hashSet2.contains("places")) {
            List<Tag> listM147522n3 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.cty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("places".equals(((Tag) obj).category));
                }
            }), new qcj() { // from class: l.ety
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str13 = jyb.m147479J(listM147522n3) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21852w1), m132454L("", listM147522n3));
            m132451I(arrayList, str13, "diff_minority_interest_travel");
            if (!TextUtils.isEmpty(str13)) {
                hashSet2.add("places");
            }
        }
        if (!hashSet2.contains("music")) {
            List<Tag> listM147522n4 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.fty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("music".equals(((Tag) obj).category));
                }
            }), new qcj() { // from class: l.gty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str14 = jyb.m147479J(listM147522n4) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21836u1), m132454L("", listM147522n4));
            m132451I(arrayList, str14, "diff_minority_interest_music");
            if (!TextUtils.isEmpty(str14)) {
                hashSet2.add("music");
            }
        }
        if (!hashSet2.contains(str11)) {
            List<Tag> listM147522n5 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.hty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("movies".equals(((Tag) obj).category));
                }
            }), new qcj() { // from class: l.ity
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str15 = jyb.m147479J(listM147522n5) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21828t1), m132454L("", listM147522n5));
            m132451I(arrayList, str15, "diff_minority_interest_movie");
            if (!TextUtils.isEmpty(str15)) {
                hashSet2.add(str11);
            }
        }
        if (!hashSet2.contains("literature")) {
            List<Tag> listM147522n6 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.jty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("literature".equals(((Tag) obj).category));
                }
            }), new qcj() { // from class: l.kty
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!hashSet.contains((Tag) obj));
                }
            });
            String str16 = jyb.m147479J(listM147522n6) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21812r1), m132454L("", listM147522n6));
            m132451I(arrayList, str16, "diff_minority_interest_book");
            if (!TextUtils.isEmpty(str16)) {
                hashSet2.add("literature");
            }
        }
        if (hashSet2.contains("food")) {
            return;
        }
        List<Tag> listM147522n7 = jyb.m147522n(jyb.m147522n(arrayListM147522n8, new qcj() { // from class: l.lty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("food".equals(((Tag) obj).category));
            }
        }), new qcj() { // from class: l.nty
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!hashSet.contains((Tag) obj));
            }
        });
        String str17 = jyb.m147479J(listM147522n7) ? "" : String.format(CoreModule.f18263b.getString(R$string.f21820s1), m132454L("", listM147522n7));
        m132451I(arrayList, str17, "diff_minority_interest_food");
        if (TextUtils.isEmpty(str17)) {
            return;
        }
        hashSet2.add("food");
    }

    /* JADX INFO: renamed from: H */
    public final void m132450H(User user, ArrayList<Pair<String, String>> arrayList) {
        HashMap map = new HashMap(6);
        if (jyb.m147479J(user.profile.answers)) {
            return;
        }
        for (Answer answer : user.profile.answers) {
            if ("5".equals(answer.question) || com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO.equals(answer.question) || "2".equals(answer.question) || "7".equals(answer.question) || "1".equals(answer.question) || "3".equals(answer.question)) {
                map.put(answer.question, answer);
            }
        }
        Answer answer2 = (Answer) map.get("5");
        if (answer2 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21750k1), answer2.value), "my_answer_TV");
        }
        Answer answer3 = (Answer) map.get(com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO);
        if (answer3 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21732i1), answer3.value), "my_answer_happy");
        }
        Answer answer4 = (Answer) map.get("2");
        if (answer4 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21723h1), answer4.value), "my_answer_city");
        }
        Answer answer5 = (Answer) map.get("7");
        if (answer5 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21741j1), answer5.value), "my_answer_ability");
        }
        Answer answer6 = (Answer) map.get("1");
        if (answer6 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21768m1), answer6.value), "my_answer_money&time");
        }
        Answer answer7 = (Answer) map.get("3");
        if (answer7 != null) {
            m132451I(arrayList, String.format(CoreModule.f18263b.getString(R$string.f21759l1), answer7.value), "my_answer_song");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m132451I(ArrayList<Pair<String, String>> arrayList, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(Pair.create(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public final void m132452J(StringBuilder sb, ArrayList<Pair<String, String>> arrayList, String str) {
        arrayList.add(Pair.create(CoreModule.f18263b.getString(R$string.f21476D1) + sb.toString(), str));
    }

    /* JADX INFO: renamed from: K */
    public ArrayList<Pair<String, String>> m132453K(@NonNull User user, @NonNull User user2) {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        m132448F(user, user2, arrayList);
        ArrayList<Pair<String, String>> arrayList2 = new ArrayList<>();
        m132449G(user, user2, arrayList2);
        if (jyb.m147479J(arrayList) && jyb.m147479J(arrayList2)) {
            arrayList.add(Pair.create(String.format(CoreModule.f18263b.getString(R$string.f21524J1), CoreModule.m30933P().m143405a().mo180484i3(user2.profile.zodiac)), ProfileLikeCategoryType.zodiac));
        } else if (jyb.m147479J(arrayList) && !jyb.m147479J(arrayList2)) {
            arrayList.add(Pair.create(CoreModule.f18263b.getString(R$string.f21476D1) + String.format(CoreModule.f18263b.getString(R$string.f21508H1), CoreModule.m30933P().m143405a().mo180484i3(user2.profile.zodiac)), ProfileLikeCategoryType.zodiac));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final String m132454L(String str, List<Tag> list) {
        if (jyb.m147479J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        jyb.m147537z(list, new y20() { // from class: l.wty
            @Override // p153l.y20
            public final void call(Object obj) {
                guy.m132445x(sb, (Tag) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public final String m132455M(String str, List<NewTags> list) {
        if (jyb.m147479J(list)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        jyb.m147537z(list, new y20() { // from class: l.yty
            @Override // p153l.y20
            public final void call(Object obj) {
                guy.m132429h(sb, (NewTags) obj);
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O */
    public void m132456O() {
        if (this.f106591b == null) {
            try {
                this.f106591b = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(CoreModule.m30933P().m143405a().mo180471g0()));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m132457P() {
        if (this.f106590a == null) {
            try {
                this.f106590a = CoreAboutMePublicTags.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(tfc0.f173942a));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m132458Q(Tag tag) {
        if (!NullChecker.m82486a(this.f106590a)) {
            return false;
        }
        List<String> list = this.f106590a.popularTag.get(tag.category);
        if (jyb.m147479J(list)) {
            return false;
        }
        return !list.contains(tag.value);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m132459R(String str) {
        if (NullChecker.m82486a(this.f106590a)) {
            return this.f106590a.showHometown.contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m132460S(String str) {
        return ("其他".equals(str) || TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m132461T(User user) {
        return user.profile.studies.active && (user.age.intValue() <= 22 || ((((uqb0.f180376H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) > 31536000L ? 1 : (((uqb0.f180376H.guessedCurrentServerTime() - ((long) user.createdTime)) / 1000) == 31536000L ? 0 : -1)) <= 0));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Boolean m132462U(Tag tag) {
        return Boolean.valueOf(m132458Q(tag));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m132463V(Tag tag) {
        return Boolean.valueOf(m132458Q(tag));
    }
}
