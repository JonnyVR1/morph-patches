package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p149l.gaj;
import p149l.oh80;
import p149l.sf80;
import p149l.tk5;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class Predicates {

    public static class AndPredicate<T> implements oh80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends oh80<? super T>> components;

        private AndPredicate(List<? extends oh80<? super T>> list) {
            this.components = list;
        }

        @Override // p149l.oh80
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m15423j("and", this.components);
        }
    }

    public static class CompositionPredicate<A, B> implements oh80<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        final gaj<A, ? extends B> f10621f;

        /* JADX INFO: renamed from: p */
        final oh80<B> f10622p;

        private CompositionPredicate(oh80<B> oh80Var, gaj<A, ? extends B> gajVar) {
            this.f10622p = (oh80) sf80.m183894p(oh80Var);
            this.f10621f = (gaj) sf80.m183894p(gajVar);
        }

        @Override // p149l.oh80
        public boolean apply(A a) {
            return this.f10622p.apply(this.f10621f.apply(a));
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f10621f.equals(compositionPredicate.f10621f) && this.f10622p.equals(compositionPredicate.f10622p)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f10622p.hashCode() ^ this.f10621f.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f10622p);
            String strValueOf2 = String.valueOf(this.f10621f);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        public ContainsPatternFromStringPredicate(String str) {
            super(C2655b.m15439a(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            String strPattern = this.pattern.pattern();
            StringBuilder sb = new StringBuilder(String.valueOf(strPattern).length() + 28);
            sb.append("Predicates.containsPattern(");
            sb.append(strPattern);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ContainsPatternPredicate implements oh80<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final tk5 pattern;

        public ContainsPatternPredicate(tk5 tk5Var) {
            this.pattern = (tk5) sf80.m183894p(tk5Var);
        }

        @Override // p149l.oh80
        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).mo15412a();
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
                if (v050.m196470a(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public String toString() {
            String string = C2654a.m15427b(this.pattern).m15432d("pattern", this.pattern.pattern()).m15430b("pattern.flags", this.pattern.flags()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class InPredicate<T> implements oh80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) sf80.m183894p(collection);
        }

        @Override // p149l.oh80
        public boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class InstanceOfPredicate<T> implements oh80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) sf80.m183894p(cls);
        }

        @Override // p149l.oh80
        public boolean apply(T t) {
            return this.clazz.isInstance(t);
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.clazz == ((InstanceOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(name.length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class NotPredicate<T> implements oh80<T>, Serializable {
        private static final long serialVersionUID = 0;
        final oh80<T> predicate;

        public NotPredicate(oh80<T> oh80Var) {
            this.predicate = (oh80) sf80.m183894p(oh80Var);
        }

        @Override // p149l.oh80
        public boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class OrPredicate<T> implements oh80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends oh80<? super T>> components;

        private OrPredicate(List<? extends oh80<? super T>> list) {
            this.components = list;
        }

        @Override // p149l.oh80
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (this.components.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.m15423j("or", this.components);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> oh80<T> m15415b() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    /* JADX INFO: renamed from: c */
    public static <T> oh80<T> m15416c(oh80<? super T> oh80Var, oh80<? super T> oh80Var2) {
        return new AndPredicate(m15417d((oh80) sf80.m183894p(oh80Var), (oh80) sf80.m183894p(oh80Var2)));
    }

    /* JADX INFO: renamed from: d */
    public static <T> List<oh80<? super T>> m15417d(oh80<? super T> oh80Var, oh80<? super T> oh80Var2) {
        return Arrays.asList(oh80Var, oh80Var2);
    }

    /* JADX INFO: renamed from: e */
    public static <A, B> oh80<A> m15418e(oh80<B> oh80Var, gaj<A, ? extends B> gajVar) {
        return new CompositionPredicate(oh80Var, gajVar);
    }

    /* JADX INFO: renamed from: f */
    public static <T> oh80<T> m15419f(T t) {
        return t == null ? m15421h() : new IsEqualToPredicate(t).withNarrowedType();
    }

    /* JADX INFO: renamed from: g */
    public static <T> oh80<T> m15420g(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    /* JADX INFO: renamed from: h */
    public static <T> oh80<T> m15421h() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    /* JADX INFO: renamed from: i */
    public static <T> oh80<T> m15422i(oh80<T> oh80Var) {
        return new NotPredicate(oh80Var);
    }

    /* JADX INFO: renamed from: j */
    public static String m15423j(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static class SubtypeOfPredicate implements oh80<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private SubtypeOfPredicate(Class<?> cls) {
            this.clazz = (Class) sf80.m183894p(cls);
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.clazz == ((SubtypeOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(name.length() + 22);
            sb.append("Predicates.subtypeOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        @Override // p149l.oh80
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    public static class IsEqualToPredicate implements oh80<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        private IsEqualToPredicate(Object obj) {
            this.target = obj;
        }

        @Override // p149l.oh80
        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        @Override // p149l.oh80
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public <T> oh80<T> withNarrowedType() {
            return this;
        }
    }

    public enum ObjectPredicate implements oh80<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicates.ObjectPredicate, p149l.oh80
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicates.ObjectPredicate, p149l.oh80
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicates.ObjectPredicate, p149l.oh80
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicates.ObjectPredicate, p149l.oh80
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        @Override // p149l.oh80
        public abstract /* synthetic */ boolean apply(Object obj);

        public <T> oh80<T> withNarrowedType() {
            return this;
        }
    }
}
