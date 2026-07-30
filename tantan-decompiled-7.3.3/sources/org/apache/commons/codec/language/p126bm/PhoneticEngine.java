package org.apache.commons.codec.language.p126bm;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import p153l.mnd0;
import p153l.qg50;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneticEngine {
    private static final Map<NameType, Set<String>> NAME_PREFIXES;
    private final boolean concat;
    private final Lang lang;
    private final NameType nameType;
    private final RuleType ruleType;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$2 */
    public static /* synthetic */ class C219682 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$codec$language$bm$NameType;

        static {
            int[] iArr = new int[NameType.values().length];
            $SwitchMap$org$apache$commons$codec$language$bm$NameType = iArr;
            try {
                iArr[NameType.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class PhonemeBuilder {
        private final Set<Rule.Phoneme> phonemes;

        private PhonemeBuilder(Set<Rule.Phoneme> set) {
            this.phonemes = set;
        }

        public static PhonemeBuilder empty(Languages.LanguageSet languageSet) {
            return new PhonemeBuilder(Collections.singleton(new Rule.Phoneme("", languageSet)));
        }

        public PhonemeBuilder append(CharSequence charSequence) {
            HashSet hashSet = new HashSet();
            Iterator<Rule.Phoneme> it = this.phonemes.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().append(charSequence));
            }
            return new PhonemeBuilder(hashSet);
        }

        public PhonemeBuilder apply(Rule.PhonemeExpr phonemeExpr) {
            HashSet hashSet = new HashSet();
            for (Rule.Phoneme phoneme : this.phonemes) {
                Iterator<Rule.Phoneme> it = phonemeExpr.getPhonemes().iterator();
                while (it.hasNext()) {
                    Rule.Phoneme phonemeJoin = phoneme.join(it.next());
                    if (!phonemeJoin.getLanguages().isEmpty()) {
                        hashSet.add(phonemeJoin);
                    }
                }
            }
            return new PhonemeBuilder(hashSet);
        }

        public Set<Rule.Phoneme> getPhonemes() {
            return this.phonemes;
        }

        public String makeString() {
            StringBuilder sb = new StringBuilder();
            for (Rule.Phoneme phoneme : this.phonemes) {
                if (sb.length() > 0) {
                    sb.append("|");
                }
                sb.append(phoneme.getPhonemeText());
            }
            return sb.toString();
        }
    }

    public static final class RulesApplication {
        private final List<Rule> finalRules;
        private boolean found;

        /* JADX INFO: renamed from: i */
        private int f206789i;
        private final CharSequence input;
        private PhonemeBuilder phonemeBuilder;

        public RulesApplication(List<Rule> list, CharSequence charSequence, PhonemeBuilder phonemeBuilder, int i) {
            if (list == null) {
                mnd0.m159157a("The finalRules argument must not be null");
                throw null;
            }
            this.finalRules = list;
            this.phonemeBuilder = phonemeBuilder;
            this.input = charSequence;
            this.f206789i = i;
        }

        public int getI() {
            return this.f206789i;
        }

        public PhonemeBuilder getPhonemeBuilder() {
            return this.phonemeBuilder;
        }

        public RulesApplication invoke() {
            int i = 0;
            this.found = false;
            Iterator<Rule> it = this.finalRules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Rule next = it.next();
                int length = next.getPattern().length();
                if (next.patternAndContextMatches(this.input, this.f206789i)) {
                    this.phonemeBuilder = this.phonemeBuilder.apply(next.getPhoneme());
                    this.found = true;
                    i = length;
                    break;
                }
                i = length;
            }
            this.f206789i += this.found ? i : 1;
            return this;
        }

        public boolean isFound() {
            return this.found;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        NAME_PREFIXES = enumMap;
        enumMap.put(NameType.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put(NameType.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put(NameType.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType == ruleType2) {
            ypg0.m217021a("ruleType must not be ", ruleType2);
            throw null;
        }
        this.nameType = nameType;
        this.ruleType = ruleType;
        this.concat = z;
        this.lang = Lang.instance(nameType);
    }

    private PhonemeBuilder applyFinalRules(PhonemeBuilder phonemeBuilder, List<Rule> list) {
        if (list == null) {
            mnd0.m159157a("finalRules can not be null");
            return null;
        }
        if (list.isEmpty()) {
            return phonemeBuilder;
        }
        TreeSet treeSet = new TreeSet(Rule.Phoneme.COMPARATOR);
        for (Rule.Phoneme phoneme : phonemeBuilder.getPhonemes()) {
            PhonemeBuilder phonemeBuilderEmpty = PhonemeBuilder.empty(phoneme.getLanguages());
            CharSequence charSequenceCacheSubSequence = cacheSubSequence(phoneme.getPhonemeText());
            int i = 0;
            while (i < charSequenceCacheSubSequence.length()) {
                RulesApplication rulesApplicationInvoke = new RulesApplication(list, charSequenceCacheSubSequence, phonemeBuilderEmpty, i).invoke();
                boolean zIsFound = rulesApplicationInvoke.isFound();
                PhonemeBuilder phonemeBuilder2 = rulesApplicationInvoke.getPhonemeBuilder();
                PhonemeBuilder phonemeBuilderAppend = !zIsFound ? phonemeBuilder2.append(charSequenceCacheSubSequence.subSequence(i, i + 1)) : phonemeBuilder2;
                i = rulesApplicationInvoke.getI();
                phonemeBuilderEmpty = phonemeBuilderAppend;
            }
            treeSet.addAll(phonemeBuilderEmpty.getPhonemes());
        }
        return new PhonemeBuilder(treeSet);
    }

    private static CharSequence cacheSubSequence(final CharSequence charSequence) {
        final CharSequence[][] charSequenceArr = (CharSequence[][]) Array.newInstance((Class<?>) CharSequence.class, charSequence.length(), charSequence.length());
        return new CharSequence() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine.1
            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return charSequence.charAt(i);
            }

            @Override // java.lang.CharSequence
            public int length() {
                return charSequence.length();
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                if (i == i2) {
                    return "";
                }
                int i3 = i2 - 1;
                CharSequence charSequence2 = charSequenceArr[i][i3];
                if (charSequence2 != null) {
                    return charSequence2;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
                charSequenceArr[i][i3] = charSequenceSubSequence;
                return charSequenceSubSequence;
            }
        };
    }

    private static String join(Iterable<String> iterable, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
        }
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    public String encode(String str, Languages.LanguageSet languageSet) {
        String strJoin;
        List<Rule> rule = Rule.getInstance(this.nameType, RuleType.RULES, languageSet);
        List<Rule> rule2 = Rule.getInstance(this.nameType, this.ruleType, "common");
        List<Rule> rule3 = Rule.getInstance(this.nameType, this.ruleType, languageSet);
        String strTrim = str.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        int i = 0;
        if (this.nameType == NameType.GENERIC) {
            if (strTrim.length() >= 2 && strTrim.substring(0, 2).equals("d'")) {
                String strSubstring = strTrim.substring(2);
                return "(" + encode(strSubstring) + ")-(" + encode(Constants.INAPP_DATA_TAG.concat(strSubstring)) + ")";
            }
            for (String str2 : NAME_PREFIXES.get(this.nameType)) {
                if (strTrim.startsWith(str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                    String strSubstring2 = strTrim.substring(str2.length() + 1);
                    return "(" + encode(strSubstring2) + ")-(" + encode(str2.concat(strSubstring2)) + ")";
                }
            }
        }
        List listAsList = Arrays.asList(strTrim.split("\\s+"));
        ArrayList<String> arrayList = new ArrayList();
        int i2 = C219682.$SwitchMap$org$apache$commons$codec$language$bm$NameType[this.nameType.ordinal()];
        if (i2 == 1) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = ((String) it.next()).split("'");
                arrayList.add(strArrSplit[strArrSplit.length - 1]);
            }
            arrayList.removeAll(NAME_PREFIXES.get(this.nameType));
        } else if (i2 == 2) {
            arrayList.addAll(listAsList);
            arrayList.removeAll(NAME_PREFIXES.get(this.nameType));
        } else {
            if (i2 != 3) {
                qg50.m176437a("Unreachable case: ", this.nameType);
                return null;
            }
            arrayList.addAll(listAsList);
        }
        if (this.concat) {
            strJoin = join(arrayList, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        } else {
            if (arrayList.size() != 1) {
                StringBuilder sb = new StringBuilder();
                for (String str3 : arrayList) {
                    sb.append("-");
                    sb.append(encode(str3));
                }
                return sb.substring(1);
            }
            strJoin = (String) listAsList.iterator().next();
        }
        PhonemeBuilder phonemeBuilderEmpty = PhonemeBuilder.empty(languageSet);
        CharSequence charSequenceCacheSubSequence = cacheSubSequence(strJoin);
        while (i < charSequenceCacheSubSequence.length()) {
            RulesApplication rulesApplicationInvoke = new RulesApplication(rule, charSequenceCacheSubSequence, phonemeBuilderEmpty, i).invoke();
            i = rulesApplicationInvoke.getI();
            phonemeBuilderEmpty = rulesApplicationInvoke.getPhonemeBuilder();
        }
        return applyFinalRules(applyFinalRules(phonemeBuilderEmpty, rule2), rule3).makeString();
    }

    public Lang getLang() {
        return this.lang;
    }

    public NameType getNameType() {
        return this.nameType;
    }

    public RuleType getRuleType() {
        return this.ruleType;
    }

    public boolean isConcat() {
        return this.concat;
    }

    public String encode(String str) {
        return encode(str, this.lang.guessLanguages(str));
    }
}
