package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p149l.sf80;
import p149l.tk5;
import p149l.wj5;

/* JADX INFO: loaded from: classes7.dex */
final class JdkPattern extends tk5 implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* JADX INFO: renamed from: com.google.common.base.JdkPattern$a */
    public static final class C2646a extends wj5 {

        /* JADX INFO: renamed from: a */
        public final Matcher f10617a;

        public C2646a(Matcher matcher) {
            this.f10617a = (Matcher) sf80.m183894p(matcher);
        }

        @Override // p149l.wj5
        /* JADX INFO: renamed from: a */
        public boolean mo15412a() {
            return this.f10617a.find();
        }
    }

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) sf80.m183894p(pattern);
    }

    @Override // p149l.tk5
    public int flags() {
        return this.pattern.flags();
    }

    @Override // p149l.tk5
    public wj5 matcher(CharSequence charSequence) {
        return new C2646a(this.pattern.matcher(charSequence));
    }

    @Override // p149l.tk5
    public String pattern() {
        return this.pattern.pattern();
    }

    @Override // p149l.tk5
    public String toString() {
        return this.pattern.toString();
    }
}
