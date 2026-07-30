package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p149l.b11;
import p149l.sf80;
import p149l.yr4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CaseFormat {
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final yr4 wordBoundary;
    private final String wordSeparator;
    public static final CaseFormat LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, yr4.m215772f('-'), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? b11.m99806g(str.replace('-', '_')) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return b11.m99804e(str);
        }
    };
    private static final /* synthetic */ CaseFormat[] $VALUES = $values();

    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        public StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.sourceFormat = (CaseFormat) sf80.m183894p(caseFormat);
            this.targetFormat = (CaseFormat) sf80.m183894p(caseFormat2);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(String str) {
            return this.targetFormat.m15411to(this.sourceFormat, str);
        }

        @Override // com.google.common.base.Converter
        public String doForward(String str) {
            return this.sourceFormat.m15411to(this.targetFormat, str);
        }

        @Override // com.google.common.base.Converter, p149l.gaj
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                StringConverter stringConverter = (StringConverter) obj;
                if (this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.targetFormat.hashCode() ^ this.sourceFormat.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.sourceFormat);
            String strValueOf2 = String.valueOf(this.targetFormat);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".converterTo(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        String str = "_";
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, yr4.m215772f('_'), str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat caseFormat, String str2) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return str2.replace('_', '-');
                }
                return caseFormat == CaseFormat.UPPER_UNDERSCORE ? b11.m99806g(str2) : super.convert(caseFormat, str2);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str2) {
                return b11.m99804e(str2);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, yr4.m215771d('A', Matrix.MATRIX_TYPE_ZERO), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            public String normalizeFirstWord(String str3) {
                return b11.m99804e(str3);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, yr4.m215771d('A', Matrix.MATRIX_TYPE_ZERO), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return CaseFormat.firstCharOnlyToUpper(str3);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, yr4.m215772f('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat caseFormat, String str3) {
                if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                    return b11.m99804e(str3.replace('_', '-'));
                }
                return caseFormat == CaseFormat.LOWER_UNDERSCORE ? b11.m99804e(str3) : super.convert(caseFormat, str3);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String str3) {
                return b11.m99806g(str3);
            }
        };
    }

    private CaseFormat(String str, int i, yr4 yr4Var, String str2) {
        super(str, i);
        this.wordBoundary = yr4Var;
        this.wordSeparator = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char cM99805f = b11.m99805f(str.charAt(0));
        String strM99804e = b11.m99804e(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(strM99804e).length() + 1);
        sb.append(cM99805f);
        sb.append(strM99804e);
        return sb.toString();
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iMo215776e = -1;
        while (true) {
            iMo215776e = this.wordBoundary.mo215776e(str, iMo215776e + 1);
            if (iMo215776e == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(length, iMo215776e)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.normalizeWord(str.substring(length, iMo215776e)));
            }
            sb.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iMo215776e;
        }
        if (length == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb);
        sb.append(caseFormat.normalizeWord(str.substring(length)));
        return sb.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    /* JADX INFO: renamed from: to */
    public final String m15411to(CaseFormat caseFormat, String str) {
        sf80.m183894p(caseFormat);
        sf80.m183894p(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }
}
