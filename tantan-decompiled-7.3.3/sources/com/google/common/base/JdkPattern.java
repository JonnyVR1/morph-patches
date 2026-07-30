package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p153l.wl5;
import p153l.xk5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class JdkPattern extends wl5 implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* JADX INFO: renamed from: com.google.common.base.JdkPattern$a */
    public static final class C2669a extends xk5 {

        /* JADX INFO: renamed from: a */
        public final Matcher f10654a;

        public C2669a(Matcher matcher) {
            this.f10654a = (Matcher) xn80.m212111p(matcher);
        }

        @Override // p153l.xk5
        /* JADX INFO: renamed from: a */
        public boolean mo15466a() {
            return this.f10654a.find();
        }
    }

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) xn80.m212111p(pattern);
    }

    @Override // p153l.wl5
    public int flags() {
        return this.pattern.flags();
    }

    @Override // p153l.wl5
    public xk5 matcher(CharSequence charSequence) {
        return new C2669a(this.pattern.matcher(charSequence));
    }

    @Override // p153l.wl5
    public String pattern() {
        return this.pattern.pattern();
    }

    @Override // p153l.wl5
    public String toString() {
        return this.pattern.toString();
    }
}
