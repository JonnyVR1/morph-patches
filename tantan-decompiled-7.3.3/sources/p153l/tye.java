package p153l;

import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.EmojiAnimData;
import com.p051p1.mobile.putong.core.data.RecentEmojiData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class tye {

    /* JADX INFO: renamed from: a */
    public static volatile tye f176659a;

    /* JADX INFO: renamed from: b */
    public static int f176660b = qa00.m175859d(45.0f);

    /* JADX INFO: renamed from: c */
    public static int f176661c = qa00.f156327n;

    /* JADX INFO: renamed from: d */
    public static List<String> f176662d = Arrays.asList("你好", "哈哈", "哈喽", "在干嘛", "在吗", "可爱");

    /* JADX INFO: renamed from: e */
    public static List<String> f176663e = Arrays.asList("你好", "哈喽", "在干嘛", "在吗", "可爱");

    /* JADX INFO: renamed from: f */
    public static List<String> f176664f = Arrays.asList("朕已阅", "嘻嘻", "可爱", "害羞", "你好");

    /* JADX INFO: renamed from: g */
    public static List<String> f176665g = Arrays.asList("你好", "在吗", "hi", "在干嘛", "哈喽");

    /* JADX INFO: renamed from: h */
    public static List<String> f176666h = Arrays.asList("你好", "开心", "hi", "哈喽");

    /* JADX INFO: renamed from: i */
    public static List<String> f176667i = Arrays.asList("你好", "在吗", "在干嘛", "哈喽");

    /* JADX INFO: renamed from: l.tye$a */
    public class C20427a extends dyd0<EmojiAnimData> {
        public C20427a(String str, EmojiAnimData emojiAnimData) {
            super(str, emojiAnimData);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull EmojiAnimData emojiAnimData, EmojiAnimData emojiAnimData2) {
            return emojiAnimData.equals(emojiAnimData2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData copyed(EmojiAnimData emojiAnimData, @NonNull EmojiAnimData emojiAnimData2) {
            return emojiAnimData2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            T t = this.defaultValue;
            return string == null ? (EmojiAnimData) t : EmojiAnimData.parse(string, (EmojiAnimData) t);
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(EmojiAnimData emojiAnimData) {
            return pref().edit().putString(this.f111993id, emojiAnimData.toJson());
        }
    }

    /* JADX INFO: renamed from: l.tye$b */
    public class C20428b extends dyd0<RecentEmojiData> {
        public C20428b(String str, RecentEmojiData recentEmojiData) {
            super(str, recentEmojiData);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull RecentEmojiData recentEmojiData, RecentEmojiData recentEmojiData2) {
            return recentEmojiData.equals(recentEmojiData2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData copyed(RecentEmojiData recentEmojiData, @NonNull RecentEmojiData recentEmojiData2) {
            return recentEmojiData2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            T t = this.defaultValue;
            return string == null ? (RecentEmojiData) t : RecentEmojiData.parse(string, (RecentEmojiData) t);
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(RecentEmojiData recentEmojiData) {
            return pref().edit().putString(this.f111993id, recentEmojiData.toJson());
        }
    }

    /* JADX INFO: renamed from: c */
    public static tye m193572c() {
        if (f176659a == null) {
            synchronized (tye.class) {
                try {
                    if (f176659a == null) {
                        f176659a = new tye();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176659a;
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m193573e(SpannableStringBuilder spannableStringBuilder, int i) {
        Matcher matcher = Pattern.compile("\\[([^\\[\\]]*)]").matcher(spannableStringBuilder);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            int iStart = matcher.start(1);
            int iEnd = matcher.end(1);
            if (oze.f149871i.contains(strGroup)) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), iStart - 1, iEnd + 1, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public static String m193574f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("\\[([^\\[\\]]*)]").matcher(str);
        boolean z = false;
        String str2 = "";
        boolean z2 = false;
        while (true) {
            if (!matcher.find()) {
                z = z2;
                break;
            }
            String strGroup = matcher.group(1);
            if (oze.f149871i.contains(strGroup)) {
                if (TextUtils.isEmpty(str2)) {
                    z2 = true;
                    str2 = strGroup;
                } else if (!TextUtils.equals(strGroup, str2)) {
                    break;
                }
            }
        }
        return (z && str.contains(String.format("[%s][%s][%s]", str2, str2, str2))) ? str2 : "";
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<oze.C19253a> m193575a() {
        ArrayList<oze.C19253a> arrayList = new ArrayList<>();
        new ArrayList();
        ArrayList<oze.C19253a> arrayList2 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? oze.f149867e : oze.f149868f;
        oze.C19253a c19253a = new oze.C19253a("recently_text_tag_type", 0, 0, 0);
        oze.C19253a c19253a2 = new oze.C19253a("all_text_tag_type", 0, 0, 0);
        RecentEmojiData recentEmojiDataM193578g = m193572c().m193578g();
        if (NullChecker.m82486a(recentEmojiDataM193578g) && !jyb.m147479J(recentEmojiDataM193578g.identifierList)) {
            arrayList.add(c19253a);
            if (recentEmojiDataM193578g.identifierList.size() > 7) {
                recentEmojiDataM193578g.identifierList = recentEmojiDataM193578g.identifierList.subList(0, 7);
            }
            Iterator<String> it = recentEmojiDataM193578g.identifierList.iterator();
            while (it.hasNext()) {
                arrayList.add(oze.f149869g.get(it.next()));
            }
            arrayList.add(c19253a2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public EmojiAnimData m193576b() {
        if (uqb0.f180397c0.signedIn_()) {
            User userMe_ = uqb0.f180397c0.me_();
            if (NullChecker.m82486a(userMe_)) {
                EmojiAnimData emojiAnimData = m193580i("tantan_emoji_full_screen_anim_data_" + userMe_.f56859id).get();
                if (NullChecker.m82486a(emojiAnimData)) {
                    return emojiAnimData;
                }
            }
        }
        EmojiAnimData emojiAnimDataNew_ = EmojiAnimData.new_();
        emojiAnimDataNew_.emojiAnimCreatedTime = new HashMap();
        return emojiAnimDataNew_;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<oze.C19253a> m193577d() {
        ArrayList<oze.C19253a> arrayList = new ArrayList<>();
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            arrayList.addAll(oze.f149867e);
            return arrayList;
        }
        arrayList.addAll(oze.f149868f);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public RecentEmojiData m193578g() {
        if (!uqb0.f180397c0.signedIn_()) {
            return null;
        }
        User userMe_ = uqb0.f180397c0.me_();
        if (!NullChecker.m82486a(userMe_)) {
            return null;
        }
        return m193579h("tantan_recent_emoji_data_" + userMe_.f56859id).get();
    }

    /* JADX INFO: renamed from: h */
    public final dyd0<RecentEmojiData> m193579h(String str) {
        return new C20428b(str, null);
    }

    /* JADX INFO: renamed from: i */
    public final dyd0<EmojiAnimData> m193580i(String str) {
        return new C20427a(str, null);
    }

    /* JADX INFO: renamed from: j */
    public void m193581j(EmojiAnimData emojiAnimData) {
        if (uqb0.f180397c0.signedIn_()) {
            User userMe_ = uqb0.f180397c0.me_();
            if (NullChecker.m82486a(userMe_)) {
                if (NullChecker.m82486a(emojiAnimData)) {
                    m193580i("tantan_emoji_full_screen_anim_data_" + userMe_.f56859id).put(emojiAnimData);
                } else {
                    m193580i("tantan_emoji_full_screen_anim_data_" + userMe_.f56859id).clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m193582k(RecentEmojiData recentEmojiData) {
        if (uqb0.f180397c0.signedIn_()) {
            User userMe_ = uqb0.f180397c0.me_();
            if (NullChecker.m82486a(userMe_)) {
                if (NullChecker.m82486a(recentEmojiData)) {
                    m193579h("tantan_recent_emoji_data_" + userMe_.f56859id).put(recentEmojiData);
                } else {
                    m193579h("tantan_recent_emoji_data_" + userMe_.f56859id).clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m193583l(String str) {
        RecentEmojiData recentEmojiDataM193578g = m193578g();
        if (!NullChecker.m82486a(recentEmojiDataM193578g) || jyb.m147479J(recentEmojiDataM193578g.identifierList)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            RecentEmojiData recentEmojiDataNew_ = RecentEmojiData.new_();
            recentEmojiDataNew_.identifierList = arrayList;
            m193582k(recentEmojiDataNew_);
            return;
        }
        if (recentEmojiDataM193578g.identifierList.contains(str)) {
            recentEmojiDataM193578g.identifierList.remove(str);
        }
        recentEmojiDataM193578g.identifierList.add(0, str);
        if (recentEmojiDataM193578g.identifierList.size() > 7) {
            recentEmojiDataM193578g.identifierList = recentEmojiDataM193578g.identifierList.subList(0, 7);
        }
        m193582k(recentEmojiDataM193578g);
    }
}
