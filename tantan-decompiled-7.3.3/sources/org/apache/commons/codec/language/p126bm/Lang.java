package org.apache.commons.codec.language.p126bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class Lang {
    private static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/lang.txt";
    private static final Map<NameType, Lang> Langs = new EnumMap(NameType.class);
    private final Languages languages;
    private final List<LangRule> rules;

    public static final class LangRule {
        private final boolean acceptOnMatch;
        private final Set<String> languages;
        private final Pattern pattern;

        private LangRule(Pattern pattern, Set<String> set, boolean z) {
            this.pattern = pattern;
            this.languages = set;
            this.acceptOnMatch = z;
        }

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            Langs.put(nameType, loadFromResource(LANGUAGE_RULES_RN, Languages.getInstance(nameType)));
        }
    }

    private Lang(List<LangRule> list, Languages languages) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages;
    }

    public static Lang instance(NameType nameType) {
        return Langs.get(nameType);
    }

    public static Lang loadFromResource(String str, Languages languages) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = Lang.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            wtq0.m207906a("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
            return null;
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z = false;
            while (scanner.hasNextLine()) {
                String strNextLine = scanner.nextLine();
                if (z) {
                    if (strNextLine.endsWith("*/")) {
                    }
                } else if (strNextLine.startsWith("/*")) {
                    z = true;
                } else {
                    int iIndexOf = strNextLine.indexOf("//");
                    String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                    if (strTrim.length() != 0) {
                        String[] strArrSplit = strTrim.split("\\s+");
                        if (strArrSplit.length != 3) {
                            System.err.println("Warning: malformed line '" + strNextLine + "'");
                        } else {
                            arrayList.add(new LangRule(Pattern.compile(strArrSplit[0]), new HashSet(Arrays.asList(strArrSplit[1].split("\\+"))), strArrSplit[2].equals("true")));
                        }
                    }
                }
            }
            return new Lang(arrayList, languages);
        }
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet languageSetGuessLanguages = guessLanguages(str);
        return languageSetGuessLanguages.isSingleton() ? languageSetGuessLanguages.getAny() : Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        for (LangRule langRule : this.rules) {
            if (langRule.matches(lowerCase)) {
                if (langRule.acceptOnMatch) {
                    hashSet.retainAll(langRule.languages);
                } else {
                    hashSet.removeAll(langRule.languages);
                }
            }
        }
        Languages.LanguageSet languageSetFrom = Languages.LanguageSet.from(hashSet);
        return languageSetFrom.equals(Languages.NO_LANGUAGES) ? Languages.ANY_LANGUAGE : languageSetFrom;
    }
}
