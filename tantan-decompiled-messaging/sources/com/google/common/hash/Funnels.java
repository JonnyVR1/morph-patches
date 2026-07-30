package com.google.common.hash;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import p149l.om80;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class Funnels {

    public enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, om80 om80Var) {
            om80Var.mo16348a(num.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    public enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l2, om80 om80Var) {
            om80Var.mo16349b(l2.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        private final Funnel<E> elementFunnel;

        public SequentialFunnel(Funnel<E> funnel) {
            this.elementFunnel = (Funnel) sf80.m183894p(funnel);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.elementFunnel.equals(((SequentialFunnel) obj).elementFunnel);
            }
            return false;
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Iterable<? extends E> iterable, om80 om80Var) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.elementFunnel.funnel(it.next(), om80Var);
            }
        }

        public int hashCode() {
            return this.elementFunnel.hashCode() ^ SequentialFunnel.class.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.elementFunnel);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("Funnels.sequentialFunnel(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Funnel<CharSequence> m16332a(Charset charset) {
        return new StringCharsetFunnel(charset);
    }

    public enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, om80 om80Var) {
            om80Var.mo153319e(bArr);
        }
    }

    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        private final Charset charset;

        public static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            public SerializedForm(Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private Object readResolve() {
                return Funnels.m16332a(Charset.forName(this.charsetCanonicalName));
            }
        }

        public StringCharsetFunnel(Charset charset) {
            this.charset = (Charset) sf80.m183894p(charset);
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.charset.equals(((StringCharsetFunnel) obj).charset);
            }
            return false;
        }

        public int hashCode() {
            return this.charset.hashCode() ^ StringCharsetFunnel.class.hashCode();
        }

        public String toString() {
            String strName = this.charset.name();
            StringBuilder sb = new StringBuilder(String.valueOf(strName).length() + 22);
            sb.append("Funnels.stringFunnel(");
            sb.append(strName);
            sb.append(")");
            return sb.toString();
        }

        public Object writeReplace() {
            return new SerializedForm(this.charset);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, om80 om80Var) {
            om80Var.mo16350d(charSequence, this.charset);
        }
    }

    public enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, om80 om80Var) {
            om80Var.mo147548c(charSequence);
        }
    }
}
