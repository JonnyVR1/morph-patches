package org.junit;

/* JADX INFO: loaded from: classes3.dex */
public class ComparisonFailure extends AssertionError {
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;
    private String fActual;
    private String fExpected;

    public static class ComparisonCompactor {
        private static final String DIFF_END = "]";
        private static final String DIFF_START = "[";
        private static final String ELLIPSIS = "...";
        private final String actual;
        private final int contextLength;
        private final String expected;

        public class DiffExtractor {
            private final String sharedPrefix;
            private final String sharedSuffix;

            private DiffExtractor() {
                String strSharedPrefix = ComparisonCompactor.this.sharedPrefix();
                this.sharedPrefix = strSharedPrefix;
                this.sharedSuffix = ComparisonCompactor.this.sharedSuffix(strSharedPrefix);
            }

            private String extractDiff(String str) {
                return "[" + str.substring(this.sharedPrefix.length(), str.length() - this.sharedSuffix.length()) + "]";
            }

            public String actualDiff() {
                return extractDiff(ComparisonCompactor.this.actual);
            }

            public String compactPrefix() {
                int length = this.sharedPrefix.length();
                int i = ComparisonCompactor.this.contextLength;
                String str = this.sharedPrefix;
                return length <= i ? str : ComparisonCompactor.ELLIPSIS.concat(str.substring(str.length() - ComparisonCompactor.this.contextLength));
            }

            public String compactSuffix() {
                int length = this.sharedSuffix.length();
                int i = ComparisonCompactor.this.contextLength;
                String str = this.sharedSuffix;
                return length <= i ? str : str.substring(0, ComparisonCompactor.this.contextLength).concat(ComparisonCompactor.ELLIPSIS);
            }

            public String expectedDiff() {
                return extractDiff(ComparisonCompactor.this.expected);
            }
        }

        public ComparisonCompactor(int i, String str, String str2) {
            this.contextLength = i;
            this.expected = str;
            this.actual = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String sharedPrefix() {
            int iMin = Math.min(this.expected.length(), this.actual.length());
            int i = 0;
            while (true) {
                String str = this.expected;
                if (i >= iMin) {
                    return str.substring(0, iMin);
                }
                if (str.charAt(i) != this.actual.charAt(i)) {
                    return this.expected.substring(0, i);
                }
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String sharedSuffix(String str) {
            int iMin = Math.min(this.expected.length() - str.length(), this.actual.length() - str.length()) - 1;
            int i = 0;
            while (i <= iMin) {
                String str2 = this.expected;
                char cCharAt = str2.charAt((str2.length() - 1) - i);
                String str3 = this.actual;
                if (cCharAt != str3.charAt((str3.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str4 = this.expected;
            return str4.substring(str4.length() - i);
        }

        public String compact(String str) {
            String str2;
            String str3 = this.expected;
            if (str3 == null || (str2 = this.actual) == null || str3.equals(str2)) {
                return Assert.format(str, this.expected, this.actual);
            }
            DiffExtractor diffExtractor = new DiffExtractor();
            String strCompactPrefix = diffExtractor.compactPrefix();
            String strCompactSuffix = diffExtractor.compactSuffix();
            return Assert.format(str, strCompactPrefix + diffExtractor.expectedDiff() + strCompactSuffix, strCompactPrefix + diffExtractor.actualDiff() + strCompactSuffix);
        }
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public String getActual() {
        return this.fActual;
    }

    public String getExpected() {
        return this.fExpected;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new ComparisonCompactor(20, this.fExpected, this.fActual).compact(super.getMessage());
    }
}
