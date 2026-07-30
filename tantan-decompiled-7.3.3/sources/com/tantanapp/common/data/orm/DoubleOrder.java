package com.tantanapp.common.data.orm;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import p153l.jyb;
import p153l.kmk0;
import p153l.u11;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public class DoubleOrder<T> extends Order<T> {
    private Order<T> first;
    private Order<T> second;

    public DoubleOrder(Order<T> order, Order<T> order2) {
        if ((order instanceof DoubleOrder) || (order2 instanceof DoubleOrder)) {
            wtq0.m207906a("only can use single order in DoubleOrder now!!");
            throw null;
        }
        this.first = order;
        this.second = order2;
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: EQ */
    public Filter<T> mo82442EQ(final T t) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.DoubleOrder.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return Filter.AND(DoubleOrder.this.first.mo82442EQ(t), DoubleOrder.this.second.mo82442EQ(t)).emit();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return Filter.AND(DoubleOrder.this.first.mo82442EQ(t), DoubleOrder.this.second.mo82442EQ(t)).emitWithPrefix();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t2) {
                return DoubleOrder.this.first.mo82442EQ(t).filter(t2) && DoubleOrder.this.second.mo82442EQ(t).filter(t2);
            }
        };
    }

    @Override // com.tantanapp.common.data.orm.Order
    /* JADX INFO: renamed from: GT */
    public Filter<T> mo82443GT(final T t) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.DoubleOrder.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return Filter.m82444OR(Filter.AND(DoubleOrder.this.second.mo82443GT(t), DoubleOrder.this.first.mo82442EQ(t)), DoubleOrder.this.first.mo82443GT(t)).emit();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return Filter.m82444OR(Filter.AND(DoubleOrder.this.second.mo82443GT(t), DoubleOrder.this.first.mo82442EQ(t)), DoubleOrder.this.first.mo82443GT(t)).emitWithPrefix();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t2) {
                return (DoubleOrder.this.second.mo82443GT(t).filter(t2) && DoubleOrder.this.first.mo82442EQ(t).filter(t2)) || DoubleOrder.this.first.mo82443GT(t).filter(t2);
            }
        };
    }

    @Override // com.tantanapp.common.data.orm.Order
    public Filter<T> GT_EQ(final T t) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.DoubleOrder.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return Filter.m82444OR(Filter.AND(DoubleOrder.this.second.GT_EQ(t), DoubleOrder.this.first.mo82442EQ(t)), DoubleOrder.this.first.mo82443GT(t)).emit();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return Filter.m82444OR(Filter.AND(DoubleOrder.this.second.GT_EQ(t), DoubleOrder.this.first.mo82442EQ(t)), DoubleOrder.this.first.mo82443GT(t)).emitWithPrefix();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t2) {
                return (DoubleOrder.this.second.GT_EQ(t).filter(t2) && DoubleOrder.this.first.mo82442EQ(t).filter(t2)) || DoubleOrder.this.first.mo82443GT(t).filter(t2);
            }
        };
    }

    @Override // com.tantanapp.common.data.orm.Order
    public Column column() {
        return null;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        if (kmk0.f127510c) {
            u11.m193890d(t);
            u11.m193890d(t2);
        }
        int iCompare = this.first.compare(t, t2);
        return iCompare == 0 ? this.second.compare(t, t2) : iCompare;
    }

    @Override // com.tantanapp.common.data.orm.Order
    public String emit() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, jyb.m147507f0(this.first.emit(), this.second.emit()));
    }

    public Order<T> getFirst() {
        return this.first;
    }
}
