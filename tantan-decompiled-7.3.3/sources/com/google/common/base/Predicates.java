package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p153l.adj;
import p153l.k950;
import p153l.tp80;
import p153l.wl5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Predicates {

    public static class AndPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends tp80<? super T>> components;

        private AndPredicate(List<? extends tp80<? super T>> list) {
            this.components = list;
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p153l.tp80
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
            return Predicates.m15477j("and", this.components);
        }
    }

    public static class CompositionPredicate<A, B> implements tp80<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        final adj<A, ? extends B> f10658f;

        /* JADX INFO: renamed from: p */
        final tp80<B> f10659p;

        private CompositionPredicate(tp80<B> tp80Var, adj<A, ? extends B> adjVar) {
            this.f10659p = (tp80) xn80.m212111p(tp80Var);
            this.f10658f = (adj) xn80.m212111p(adjVar);
        }

        @Override // p153l.tp80
        public boolean apply(A a) {
            return this.f10659p.apply(this.f10658f.apply(a));
        }

        @Override // p153l.tp80
        public boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f10658f.equals(compositionPredicate.f10658f) && this.f10659p.equals(compositionPredicate.f10659p)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f10659p.hashCode() ^ this.f10658f.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f10659p);
            String strValueOf2 = String.valueOf(this.f10658f);
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
            super(C2678b.m15493a(str));
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

    public static class ContainsPatternPredicate implements tp80<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final wl5 pattern;

        public ContainsPatternPredicate(wl5 wl5Var) {
            this.pattern = (wl5) xn80.m212111p(wl5Var);
        }

        @Override // p153l.tp80
        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).mo15466a();
        }

        @Override // p153l.tp80
        public boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
                if (k950.m148863a(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public String toString() {
            String string = C2677a.m15481b(this.pattern).m15486d("pattern", this.pattern.pattern()).m15484b("pattern.flags", this.pattern.flags()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class InPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) xn80.m212111p(collection);
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // p153l.tp80
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

    public static class InstanceOfPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) xn80.m212111p(cls);
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            return this.clazz.isInstance(t);
        }

        @Override // p153l.tp80
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

    public static class NotPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        final tp80<T> predicate;

        public NotPredicate(tp80<T> tp80Var) {
            this.predicate = (tp80) xn80.m212111p(tp80Var);
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        @Override // p153l.tp80
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

    public static class OrPredicate<T> implements tp80<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends tp80<? super T>> components;

        private OrPredicate(List<? extends tp80<? super T>> list) {
            this.components = list;
        }

        @Override // p153l.tp80
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (this.components.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.tp80
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
            return Predicates.m15477j("or", this.components);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> tp80<T> m15469b() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    /* JADX INFO: renamed from: c */
    public static <T> tp80<T> m15470c(tp80<? super T> tp80Var, tp80<? super T> tp80Var2) {
        return new AndPredicate(m15471d((tp80) xn80.m212111p(tp80Var), (tp80) xn80.m212111p(tp80Var2)));
    }

    /* JADX INFO: renamed from: d */
    public static <T> List<tp80<? super T>> m15471d(tp80<? super T> tp80Var, tp80<? super T> tp80Var2) {
        return Arrays.asList(tp80Var, tp80Var2);
    }

    /* JADX INFO: renamed from: e */
    public static <A, B> tp80<A> m15472e(tp80<B> tp80Var, adj<A, ? extends B> adjVar) {
        return new CompositionPredicate(tp80Var, adjVar);
    }

    /* JADX INFO: renamed from: f */
    public static <T> tp80<T> m15473f(T t) {
        return t == null ? m15475h() : new IsEqualToPredicate(t).withNarrowedType();
    }

    /* JADX INFO: renamed from: g */
    public static <T> tp80<T> m15474g(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    /* JADX INFO: renamed from: h */
    public static <T> tp80<T> m15475h() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    /* JADX INFO: renamed from: i */
    public static <T> tp80<T> m15476i(tp80<T> tp80Var) {
        return new NotPredicate(tp80Var);
    }

    /* JADX INFO: renamed from: j */
    public static String m15477j(String str, Iterable<?> iterable) {
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

    public static class SubtypeOfPredicate implements tp80<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private SubtypeOfPredicate(Class<?> cls) {
            this.clazz = (Class) xn80.m212111p(cls);
        }

        @Override // p153l.tp80
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

        @Override // p153l.tp80
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    public static class IsEqualToPredicate implements tp80<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        private IsEqualToPredicate(Object obj) {
            this.target = obj;
        }

        @Override // p153l.tp80
        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        @Override // p153l.tp80
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

        public <T> tp80<T> withNarrowedType() {
            return this;
        }
    }

    public enum ObjectPredicate implements tp80<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicates.ObjectPredicate, p153l.tp80
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicates.ObjectPredicate, p153l.tp80
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicates.ObjectPredicate, p153l.tp80
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicates.ObjectPredicate, p153l.tp80
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        @Override // p153l.tp80
        public abstract /* synthetic */ boolean apply(Object obj);

        public <T> tp80<T> withNarrowedType() {
            return this;
        }
    }
}
