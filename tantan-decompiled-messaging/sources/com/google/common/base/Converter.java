package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import p149l.gaj;
import p149l.sf80;
import p149l.xu40;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Converter<A, B> implements gaj<A, B> {
    private final boolean handleNullAutomatically;
    private transient Converter<B, A> reverse;

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        public ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        @Override // com.google.common.base.Converter
        public A correctedDoBackward(C c) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @Override // com.google.common.base.Converter
        public C correctedDoForward(A a) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a));
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, p149l.gaj
        public boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.first);
            String strValueOf2 = String.valueOf(this.second);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 10 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".andThen(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        public ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        @Override // com.google.common.base.Converter
        public B correctedDoBackward(A a) {
            return this.original.correctedDoForward(a);
        }

        @Override // com.google.common.base.Converter
        public A correctedDoForward(B b) {
            return this.original.correctedDoBackward(b);
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, p149l.gaj
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.original);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
            sb.append(strValueOf);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Converter$a */
    public class C2644a implements Iterable<B> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f10611a;

        /* JADX INFO: renamed from: com.google.common.base.Converter$a$a */
        public class a implements Iterator<B> {

            /* JADX INFO: renamed from: a */
            public final Iterator<? extends A> f10613a;

            public a() {
                this.f10613a = C2644a.this.f10611a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10613a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) Converter.this.convert(this.f10613a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10613a.remove();
            }
        }

        public C2644a(Iterable iterable) {
            this.f10611a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new a();
        }
    }

    public Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    public static <A, B> Converter<A, B> from(gaj<? super A, ? extends B> gajVar, gaj<? super B, ? extends A> gajVar2) {
        return new FunctionBasedConverter(gajVar, gajVar2, null);
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A unsafeDoBackward(B b) {
        return (A) doBackward(xu40.m211079a(b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B unsafeDoForward(A a) {
        return (B) doForward(xu40.m211079a(a));
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // p149l.gaj
    @Deprecated
    public final B apply(A a) {
        return convert(a);
    }

    public final B convert(A a) {
        return correctedDoForward(a);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        sf80.m183895q(iterable, "fromIterable");
        return new C2644a(iterable);
    }

    public A correctedDoBackward(B b) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        return (A) sf80.m183894p(doBackward(b));
    }

    public B correctedDoForward(A a) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a);
        }
        if (a == null) {
            return null;
        }
        return (B) sf80.m183894p(doForward(a));
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) sf80.m183894p(converter));
    }

    public abstract A doBackward(B b);

    public abstract B doForward(A a);

    @Override // p149l.gaj
    public boolean equals(Object obj) {
        return this == obj;
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final IdentityConverter<?> INSTANCE = new IdentityConverter<>();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) sf80.m183895q(converter, "otherConverter");
        }

        @Override // com.google.common.base.Converter
        public T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }
    }

    public Converter() {
        this(true);
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final gaj<? super B, ? extends A> backwardFunction;
        private final gaj<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(gaj<? super A, ? extends B> gajVar, gaj<? super B, ? extends A> gajVar2) {
            this.forwardFunction = (gaj) sf80.m183894p(gajVar);
            this.backwardFunction = (gaj) sf80.m183894p(gajVar2);
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a) {
            return this.forwardFunction.apply(a);
        }

        @Override // com.google.common.base.Converter, p149l.gaj
        public boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.forwardFunction);
            String strValueOf2 = String.valueOf(this.backwardFunction);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
            sb.append("Converter.from(");
            sb.append(strValueOf);
            sb.append(", ");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ FunctionBasedConverter(gaj gajVar, gaj gajVar2, C2644a c2644a) {
            this(gajVar, gajVar2);
        }
    }
}
