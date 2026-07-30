package com.tantanapp.common.data.orm;

import p149l.ohg0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
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
    public class C135932<T> extends Filter<T> {
        final /* synthetic */ Filter[] val$filters;

        public C135932(Filter[] filterArr) {
            this.val$filters = filterArr;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ SqlSegment m81262a(Filter filter) {
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            return sqlSegmentEmit.isEmpty() ? SqlSegment.NULL : sqlSegmentEmit.prepend("(").append(")");
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ SqlSegment m81263b(Filter filter) {
            SqlSegment sqlSegmentEmitWithPrefix = filter == null ? SqlSegment.NULL : filter.emitWithPrefix();
            return sqlSegmentEmitWithPrefix.isEmpty() ? SqlSegment.NULL : sqlSegmentEmitWithPrefix.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(vwb.m200304R(this.val$filters, new w9j() { // from class: com.tantanapp.common.data.orm.e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Filter.C135932.m81262a((Filter) obj);
                }
            }), " AND ");
            SqlSegment sqlSegment = SqlSegment.NULL;
            return sqlSegmentConcat == sqlSegment ? sqlSegment : sqlSegmentConcat.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(vwb.m200304R(this.val$filters, new w9j() { // from class: com.tantanapp.common.data.orm.f
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Filter.C135932.m81263b((Filter) obj);
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
    public class C135943<T> extends Filter<T> {
        final /* synthetic */ Filter[] val$filters;

        public C135943(Filter[] filterArr) {
            this.val$filters = filterArr;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ SqlSegment m81264a(Filter filter) {
            SqlSegment sqlSegmentEmitWithPrefix = filter == null ? SqlSegment.NULL : filter.emitWithPrefix();
            return sqlSegmentEmitWithPrefix.isEmpty() ? SqlSegment.NULL : sqlSegmentEmitWithPrefix.prepend("(").append(")");
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ SqlSegment m81265b(Filter filter) {
            SqlSegment sqlSegmentEmit = filter == null ? SqlSegment.NULL : filter.emit();
            return sqlSegmentEmit.isEmpty() ? SqlSegment.NULL : sqlSegmentEmit.prepend("(").append(")");
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emit() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(vwb.m200304R(this.val$filters, new w9j() { // from class: com.tantanapp.common.data.orm.h
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Filter.C135943.m81265b((Filter) obj);
                }
            }), " OR ");
            if (sqlSegmentConcat != SqlSegment.NULL) {
                return sqlSegmentConcat.prepend("(").append(")");
            }
            ohg0.m164364a();
            return null;
        }

        @Override // com.tantanapp.common.data.orm.Filter
        public SqlSegment emitWithPrefix() {
            SqlSegment sqlSegmentConcat = SqlSegment.concat(vwb.m200304R(this.val$filters, new w9j() { // from class: com.tantanapp.common.data.orm.g
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Filter.C135943.m81264a((Filter) obj);
                }
            }), " OR ");
            if (sqlSegmentConcat != SqlSegment.NULL) {
                return sqlSegmentConcat.prepend("(").append(")");
            }
            ohg0.m164364a();
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
        return new C135932(filterArr);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: OR */
    public static <T> Filter<T> m81261OR(Filter<T>... filterArr) {
        return new C135943(filterArr);
    }

    public abstract SqlSegment emit();

    public abstract SqlSegment emitWithPrefix();

    public abstract boolean filter(K k);
}
