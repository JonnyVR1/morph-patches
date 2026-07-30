package com.tantanapp.common.data.orm;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OrderedColumn<T, C extends Comparable<C>> extends ValueColumn<T, C> {
    public final Order<T> ASC;
    public final Order<T> DESC;

    public OrderedColumn(String str) {
        super(str);
        this.DESC = new Order<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.1
            @Override // com.tantanapp.common.data.orm.Order
            /* JADX INFO: renamed from: EQ */
            public Filter<T> mo82442EQ(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.1.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " = ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " = ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) == 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            /* JADX INFO: renamed from: GT */
            public Filter<T> mo82443GT(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " < ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " < ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) < 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            public Filter<T> GT_EQ(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.1.2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " <= ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " <= ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) <= 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            public Column<T, C> column() {
                return OrderedColumn.this;
            }

            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return -((Comparable) OrderedColumn.this.get(t)).compareTo((Comparable) OrderedColumn.this.get(t2));
            }

            @Override // com.tantanapp.common.data.orm.Order
            public String emit() {
                return OrderedColumn.this.NAME + " DESC";
            }
        };
        this.ASC = new Order<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.2
            @Override // com.tantanapp.common.data.orm.Order
            /* JADX INFO: renamed from: EQ */
            public Filter<T> mo82442EQ(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.2.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " = ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " = ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) == 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            /* JADX INFO: renamed from: GT */
            public Filter<T> mo82443GT(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.2.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " > ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " > ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) > 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            public Filter<T> GT_EQ(final T t) {
                return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.2.2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emit() {
                        String str2 = OrderedColumn.this.NAME + " >= ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public SqlSegment emitWithPrefix() {
                        String str2 = Column.PREFIX + OrderedColumn.this.NAME + " >= ?";
                        OrderedColumn orderedColumn = OrderedColumn.this;
                        return new SqlSegment(str2, new String[]{orderedColumn.asString((Comparable) orderedColumn.get(t))});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.tantanapp.common.data.orm.Filter
                    public boolean filter(T t2) {
                        return ((Comparable) OrderedColumn.this.get(t2)).compareTo((Comparable) OrderedColumn.this.get(t)) >= 0;
                    }
                };
            }

            @Override // com.tantanapp.common.data.orm.Order
            public Column column() {
                return OrderedColumn.this;
            }

            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return ((Comparable) OrderedColumn.this.get(t)).compareTo((Comparable) OrderedColumn.this.get(t2));
            }

            @Override // com.tantanapp.common.data.orm.Order
            public String emit() {
                return OrderedColumn.this.NAME;
            }
        };
    }

    public Filter<T> LEQ(final C c) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.3
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(OrderedColumn.this.NAME + " <= ?", new String[]{OrderedColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + OrderedColumn.this.NAME + " <= ?", new String[]{OrderedColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return ((Comparable) OrderedColumn.this.get(t)).compareTo(c) <= 0;
            }
        };
    }

    public Filter<T> REQ(final C c) {
        return new Filter<T>() { // from class: com.tantanapp.common.data.orm.OrderedColumn.4
            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emit() {
                return new SqlSegment(OrderedColumn.this.NAME + " >= ?", new String[]{OrderedColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public SqlSegment emitWithPrefix() {
                return new SqlSegment(Column.PREFIX + OrderedColumn.this.NAME + " >= ?", new String[]{OrderedColumn.this.asString(c)});
            }

            @Override // com.tantanapp.common.data.orm.Filter
            public boolean filter(T t) {
                return ((Comparable) OrderedColumn.this.get(t)).compareTo(c) >= 0;
            }
        };
    }
}
