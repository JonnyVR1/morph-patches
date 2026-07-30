package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import p149l.C16554e7;

/* JADX INFO: loaded from: classes3.dex */
public interface WhereCondition {
    void appendTo(StringBuilder sb, String str);

    void appendValuesTo(List<Object> list);

    public static class StringCondition extends AbstractCondition {
        protected final String string;

        public StringCondition(String str) {
            this.string = str;
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendTo(StringBuilder sb, String str) {
            sb.append(this.string);
        }

        public StringCondition(String str, Object obj) {
            super(obj);
            this.string = str;
        }

        public StringCondition(String str, Object... objArr) {
            super(objArr);
            this.string = str;
        }
    }

    public static abstract class AbstractCondition implements WhereCondition {
        protected final boolean hasSingleValue;
        protected final Object value;
        protected final Object[] values;

        public AbstractCondition() {
            this.hasSingleValue = false;
            this.value = null;
            this.values = null;
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendValuesTo(List<Object> list) {
            if (this.hasSingleValue) {
                list.add(this.value);
                return;
            }
            Object[] objArr = this.values;
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public AbstractCondition(Object obj) {
            this.value = obj;
            this.hasSingleValue = true;
            this.values = null;
        }

        public AbstractCondition(Object[] objArr) {
            this.value = null;
            this.hasSingleValue = false;
            this.values = objArr;
        }
    }

    public static class PropertyCondition extends AbstractCondition {

        /* JADX INFO: renamed from: op */
        public final String f205960op;
        public final Property property;

        public PropertyCondition(Property property, String str, Object obj) {
            super(checkValueForType(property, obj));
            this.property = property;
            this.f205960op = str;
        }

        private static Object checkValueForType(Property property, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new DaoException("Illegal value: found array, but simple object required");
            }
            Class<?> cls = property.type;
            if (cls == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                C16554e7.m115167a("Illegal date value: expected java.util.Date or Long for value ", obj);
                return null;
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue != 0 && iIntValue != 1) {
                        C16554e7.m115167a("Illegal boolean value: numbers must be 0 or 1, but was ", obj);
                        return null;
                    }
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if ("TRUE".equalsIgnoreCase(str)) {
                        return 1;
                    }
                    if ("FALSE".equalsIgnoreCase(str)) {
                        return 0;
                    }
                    C16554e7.m115167a("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was ", obj);
                    return null;
                }
            }
            return obj;
        }

        private static Object[] checkValuesForType(Property property, Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = checkValueForType(property, objArr[i]);
            }
            return objArr;
        }

        @Override // org.greenrobot.greendao.query.WhereCondition
        public void appendTo(StringBuilder sb, String str) {
            SqlUtils.appendProperty(sb, str, this.property).append(this.f205960op);
        }

        public PropertyCondition(Property property, String str) {
            this.property = property;
            this.f205960op = str;
        }

        public PropertyCondition(Property property, String str, Object[] objArr) {
            super(checkValuesForType(property, objArr));
            this.property = property;
            this.f205960op = str;
        }
    }
}
