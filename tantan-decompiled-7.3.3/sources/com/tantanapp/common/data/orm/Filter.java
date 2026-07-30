package com.tantanapp.common.data.orm;

import p153l.jyb;
import p153l.qcj;
import p153l.wpg0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Filter<K> {
    public static final Filter TRUE = new Filter() { // from class: com.tantanapp.common.data.orm.Filter.1
        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            return SqlSegment.NULL;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            return SqlSegment.NULL;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(Object obj) {
            return true;
        }
    };

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.tantanapp.common.data.orm.Filter$2 */
    public class C137562<T> extends Filter<T> {
        final /* synthetic */ Filter[] val$filters;

        public C137562(Filter[] filterArr) {
            this.val$filters = filterArr;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ SqlSegment m82445a(Filter filter) {
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            return sqlSegmentEmit.isEmpty() ? SqlSegment.NULL : sqlSegmentEmit.prepend("(").append(")");
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ SqlSegment m82446b(Filter filter) {
            SqlSegment sqlSegmentEmitWithPrefix = filter == null ? SqlSegment.NULL : filter.emitWithPrefix();
            return sqlSegmentEmitWithPrefix.isEmpty() ? SqlSegment.NULL : sqlSegmentEmitWithPrefix.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(jyb.m147487R(this.val$filters, new qcj() { // from class: com.tantanapp.common.data.orm.e
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Filter.C137562.m82445a((Filter) obj);
                }
            }), " AND ");
            SqlSegment sqlSegment = SqlSegment.NULL;
            return sqlSegmentConcat == sqlSegment ? sqlSegment : sqlSegmentConcat.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(jyb.m147487R(this.val$filters, new qcj() { // from class: com.tantanapp.common.data.orm.f
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Filter.C137562.m82446b((Filter) obj);
                }
            }), " AND ");
            SqlSegment sqlSegment = SqlSegment.NULL;
            return sqlSegmentConcat == sqlSegment ? sqlSegment : sqlSegmentConcat.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            for (Filter filter : this.val$filters) {
                if (!filter.filter(t)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.tantanapp.common.data.orm.Filter$3 */
    public class C137573<T> extends Filter<T> {
        final /* synthetic */ Filter[] val$filters;

        public C137573(Filter[] filterArr) {
            this.val$filters = filterArr;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ SqlSegment m82447a(Filter filter) {
            SqlSegment sqlSegmentEmitWithPrefix = filter == null ? SqlSegment.NULL : filter.emitWithPrefix();
            return sqlSegmentEmitWithPrefix.isEmpty() ? SqlSegment.NULL : sqlSegmentEmitWithPrefix.prepend("(").append(")");
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ SqlSegment m82448b(Filter filter) {
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            return sqlSegmentEmit.isEmpty() ? SqlSegment.NULL : sqlSegmentEmit.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(jyb.m147487R(this.val$filters, new qcj() { // from class: com.tantanapp.common.data.orm.h
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Filter.C137573.m82448b((Filter) obj);
                }
            }), " OR ");
            if (sqlSegmentConcat != SqlSegment.NULL) {
                return sqlSegmentConcat.prepend("(").append(")");
            }
            wpg0.m207458a();
            return null;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(jyb.m147487R(this.val$filters, new qcj() { // from class: com.tantanapp.common.data.orm.g
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Filter.C137573.m82447a((Filter) obj);
                }
            }), " OR ");
            if (sqlSegmentConcat != SqlSegment.NULL) {
                return sqlSegmentConcat.prepend("(").append(")");
            }
            wpg0.m207458a();
            return null;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public boolean filter(T t) {
            for (Filter filter : this.val$filters) {
                if (filter.filter(t)) {
                    return true;
                }
            }
            return false;
        }
    }

    @SafeVarargs
    public static <T> Filter<T> AND(Filter<T>... filterArr) {
        return new C137562(filterArr);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: OR */
    public static <T> Filter<T> m82444OR(Filter<T>... filterArr) {
        return new C137573(filterArr);
    }

    public abstract SqlSegment emit();

    public abstract SqlSegment emitWithPrefix();

    public abstract boolean filter(K k);
}
