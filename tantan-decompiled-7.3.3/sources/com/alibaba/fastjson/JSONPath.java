package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.FieldSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import p153l.fig0;
import p153l.l710;
import p153l.okq;
import p153l.pr3;
import p153l.qkq;
import p153l.rkq;
import p153l.skq;
import p153l.tkq;
import p153l.ukq;
import p153l.wg3;
import p153l.wkq;

/* JADX INFO: loaded from: classes.dex */
public class JSONPath implements JSONAware {
    static final long LENGTH = -1580386065683472715L;
    static final long SIZE = 5614464919154503228L;
    private static ConcurrentMap<String, JSONPath> pathCache = new ConcurrentHashMap(128, 0.75f, 1);
    private boolean hasRefSegment;
    private ParserConfig parserConfig;
    private final String path;
    private Segment[] segments;
    private SerializeConfig serializeConfig;

    /* JADX INFO: renamed from: com.alibaba.fastjson.JSONPath$1 */
    public static /* synthetic */ class C08361 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$JSONPath$Operator;

        static {
            int[] iArr = new int[Operator.values().length];
            $SwitchMap$com$alibaba$fastjson$JSONPath$Operator = iArr;
            try {
                iArr[Operator.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.NE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.GE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.GT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.LE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPath$Operator[Operator.LT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class ArrayAccessSegment implements Segment {
        private final int index;

        public ArrayAccessSegment(int i) {
            this.index = i;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.getArrayItem(obj2, this.index);
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (((JSONLexerBase) defaultJSONParser.lexer).seekArrayToItem(this.index) && context.eval) {
                context.object = defaultJSONParser.parse();
            }
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removeArrayItem(jSONPath, obj, this.index);
        }

        public boolean setValue(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.setArrayItem(jSONPath, obj, this.index, obj2);
        }
    }

    public static class Context {
        final boolean eval;
        Object object;
        final Context parent;

        public Context(Context context, boolean z) {
            this.parent = context;
            this.eval = z;
        }
    }

    public static class DoubleOpSegement implements Filter {

        /* JADX INFO: renamed from: op */
        private final Operator f3852op;
        private final String propertyName;
        private final long propertyNameHash;
        private final double value;

        public DoubleOpSegement(String str, double d, Operator operator) {
            this.propertyName = str;
            this.value = d;
            this.f3852op = operator;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null || !(propertyValue instanceof Number)) {
                return false;
            }
            double dDoubleValue = ((Number) propertyValue).doubleValue();
            switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3852op.ordinal()]) {
                case 1:
                    return dDoubleValue == this.value;
                case 2:
                    return dDoubleValue != this.value;
                case 3:
                    return dDoubleValue >= this.value;
                case 4:
                    return dDoubleValue > this.value;
                case 5:
                    return dDoubleValue <= this.value;
                case 6:
                    return dDoubleValue < this.value;
                default:
                    return false;
            }
        }
    }

    public interface Filter {
        boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3);
    }

    public static class FilterGroup implements Filter {
        private boolean and;
        private List<Filter> fitlers;

        public FilterGroup(Filter filter, Filter filter2, boolean z) {
            ArrayList arrayList = new ArrayList(2);
            this.fitlers = arrayList;
            arrayList.add(filter);
            this.fitlers.add(filter2);
            this.and = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean z = this.and;
            List<Filter> list = this.fitlers;
            if (z) {
                Iterator<Filter> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().apply(jSONPath, obj, obj2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<Filter> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().apply(jSONPath, obj, obj2, obj3)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class FilterSegment implements Segment {
        private final Filter filter;

        public FilterSegment(Filter filter) {
            this.filter = filter;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (obj2 == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            if (!(obj2 instanceof Iterable)) {
                if (this.filter.apply(jSONPath, obj, obj2, obj2)) {
                    return obj2;
                }
                return null;
            }
            for (Object obj3 : (Iterable) obj2) {
                if (this.filter.apply(jSONPath, obj, obj2, obj3)) {
                    jSONArray.add(obj3);
                }
            }
            return jSONArray;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(JSONPath jSONPath, Object obj, Object obj2) {
            if (obj2 == null || !(obj2 instanceof Iterable)) {
                return false;
            }
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                if (this.filter.apply(jSONPath, obj, obj2, it.next())) {
                    it.remove();
                }
            }
            return true;
        }
    }

    public static class IntBetweenSegement implements Filter {
        private final long endValue;
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final long startValue;

        public IntBetweenSegement(String str, long j, long j2, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.startValue = j;
            this.endValue = j2;
            this.not = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            if (propertyValue instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) propertyValue);
                if (jLongExtractValue >= this.startValue && jLongExtractValue <= this.endValue) {
                    return !this.not;
                }
            }
            return this.not;
        }
    }

    public static class IntInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final long[] values;

        public IntInSegement(String str, long[] jArr, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = jArr;
            this.not = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            if (propertyValue instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) propertyValue);
                for (long j : this.values) {
                    if (j == jLongExtractValue) {
                        return !this.not;
                    }
                }
            }
            return this.not;
        }
    }

    public static class IntObjInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final Long[] values;

        public IntObjInSegement(String str, Long[] lArr, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = lArr;
            this.not = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean z;
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            int i = 0;
            if (propertyValue == null) {
                Long[] lArr = this.values;
                int length = lArr.length;
                while (i < length) {
                    if (lArr[i] == null) {
                        z = this.not;
                    } else {
                        i++;
                    }
                }
                return this.not;
            }
            if (propertyValue instanceof Number) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) propertyValue);
                Long[] lArr2 = this.values;
                int length2 = lArr2.length;
                while (i < length2) {
                    Long l2 = lArr2[i];
                    if (l2 != null && l2.longValue() == jLongExtractValue) {
                        z = this.not;
                    } else {
                        i++;
                    }
                }
            }
            return this.not;
            return !z;
        }
    }

    public static class IntOpSegement implements Filter {

        /* JADX INFO: renamed from: op */
        private final Operator f3853op;
        private final String propertyName;
        private final long propertyNameHash;
        private final long value;
        private BigDecimal valueDecimal;
        private Double valueDouble;
        private Float valueFloat;

        public IntOpSegement(String str, long j, Operator operator) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = j;
            this.f3853op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null || !(propertyValue instanceof Number)) {
                return false;
            }
            if (propertyValue instanceof BigDecimal) {
                if (this.valueDecimal == null) {
                    this.valueDecimal = BigDecimal.valueOf(this.value);
                }
                int iCompareTo = this.valueDecimal.compareTo((BigDecimal) propertyValue);
                switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3853op.ordinal()]) {
                    case 1:
                        return iCompareTo == 0;
                    case 2:
                        return iCompareTo != 0;
                    case 3:
                        return iCompareTo <= 0;
                    case 4:
                        return iCompareTo < 0;
                    case 5:
                        return iCompareTo >= 0;
                    case 6:
                        return iCompareTo > 0;
                    default:
                        return false;
                }
            }
            if (propertyValue instanceof Float) {
                if (this.valueFloat == null) {
                    this.valueFloat = Float.valueOf(this.value);
                }
                int iCompareTo2 = this.valueFloat.compareTo((Float) propertyValue);
                switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3853op.ordinal()]) {
                    case 1:
                        return iCompareTo2 == 0;
                    case 2:
                        return iCompareTo2 != 0;
                    case 3:
                        return iCompareTo2 <= 0;
                    case 4:
                        return iCompareTo2 < 0;
                    case 5:
                        return iCompareTo2 >= 0;
                    case 6:
                        return iCompareTo2 > 0;
                    default:
                        return false;
                }
            }
            if (!(propertyValue instanceof Double)) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) propertyValue);
                switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3853op.ordinal()]) {
                    case 1:
                        return jLongExtractValue == this.value;
                    case 2:
                        return jLongExtractValue != this.value;
                    case 3:
                        return jLongExtractValue >= this.value;
                    case 4:
                        return jLongExtractValue > this.value;
                    case 5:
                        return jLongExtractValue <= this.value;
                    case 6:
                        return jLongExtractValue < this.value;
                    default:
                        return false;
                }
            }
            if (this.valueDouble == null) {
                this.valueDouble = Double.valueOf(this.value);
            }
            int iCompareTo3 = this.valueDouble.compareTo((Double) propertyValue);
            switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3853op.ordinal()]) {
                case 1:
                    return iCompareTo3 == 0;
                case 2:
                    return iCompareTo3 != 0;
                case 3:
                    return iCompareTo3 <= 0;
                case 4:
                    return iCompareTo3 < 0;
                case 5:
                    return iCompareTo3 >= 0;
                case 6:
                    return iCompareTo3 > 0;
                default:
                    return false;
            }
        }
    }

    public static class JSONPathParser {

        /* JADX INFO: renamed from: ch */
        private char f3854ch;
        private boolean hasRefSegment;
        private int level;
        private final String path;
        private int pos;
        private static final String strArrayRegex = "'\\s*,\\s*'";
        private static final Pattern strArrayPatternx = Pattern.compile(strArrayRegex);

        public JSONPathParser(String str) {
            this.path = str;
            next();
        }

        public static boolean isDigitFirst(char c) {
            if (c == '-' || c == '+') {
                return true;
            }
            return c >= '0' && c <= '9';
        }

        public void accept(char c) {
            if (this.f3854ch == c) {
                if (isEOF()) {
                    return;
                }
                next();
            } else {
                throw new JSONPathException("expect '" + c + ", but '" + this.f3854ch + "'");
            }
        }

        public Segment buildArraySegement(String str) {
            int length = str.length();
            char cCharAt = str.charAt(0);
            int i = length - 1;
            char cCharAt2 = str.charAt(i);
            int iIndexOf = str.indexOf(44);
            if (str.length() > 2 && cCharAt == '\'' && cCharAt2 == '\'') {
                String strSubstring = str.substring(1, i);
                return (iIndexOf == -1 || !strArrayPatternx.matcher(str).find()) ? new PropertySegment(strSubstring, false) : new MultiPropertySegment(strSubstring.split(strArrayRegex));
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                if (TypeUtils.isNumber(str)) {
                    try {
                        return new ArrayAccessSegment(Integer.parseInt(str));
                    } catch (NumberFormatException unused) {
                        return new PropertySegment(str, false);
                    }
                }
                if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
                    str = str.substring(1, str.length() - 1);
                }
                return new PropertySegment(str, false);
            }
            if (iIndexOf != -1) {
                String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
                int[] iArr = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    iArr[i2] = Integer.parseInt(strArrSplit[i2]);
                }
                return new MultiIndexSegment(iArr);
            }
            if (iIndexOf2 == -1) {
                l710.m153113a();
                return null;
            }
            String[] strArrSplit2 = str.split(":");
            int length2 = strArrSplit2.length;
            int[] iArr2 = new int[length2];
            for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                String str2 = strArrSplit2[i3];
                if (str2.length() != 0) {
                    iArr2[i3] = Integer.parseInt(str2);
                } else {
                    if (i3 != 0) {
                        l710.m153113a();
                        return null;
                    }
                    iArr2[i3] = 0;
                }
            }
            int i4 = iArr2[0];
            int i5 = length2 > 1 ? iArr2[1] : -1;
            int i6 = length2 == 3 ? iArr2[2] : 1;
            if (i5 < 0 || i5 >= i4) {
                if (i6 > 0) {
                    return new RangeSegment(i4, i5, i6);
                }
                throw new UnsupportedOperationException("step must greater than zero : " + i6);
            }
            throw new UnsupportedOperationException("end must greater than or equals start. start " + i4 + ",  end " + i5);
        }

        public Segment[] explain() {
            String str = this.path;
            if (str == null || str.length() == 0) {
                fig0.m125680a();
                return null;
            }
            Segment[] segmentArr = new Segment[8];
            while (true) {
                Segment segement = readSegement();
                if (segement == null) {
                    break;
                }
                if (segement instanceof PropertySegment) {
                    PropertySegment propertySegment = (PropertySegment) segement;
                    if (propertySegment.deep || !propertySegment.propertyName.equals("*")) {
                    }
                }
                int i = this.level;
                if (i == segmentArr.length) {
                    Segment[] segmentArr2 = new Segment[(i * 3) / 2];
                    System.arraycopy(segmentArr, 0, segmentArr2, 0, i);
                    segmentArr = segmentArr2;
                }
                int i2 = this.level;
                this.level = i2 + 1;
                segmentArr[i2] = segement;
            }
            int i3 = this.level;
            if (i3 == segmentArr.length) {
                return segmentArr;
            }
            Segment[] segmentArr3 = new Segment[i3];
            System.arraycopy(segmentArr, 0, segmentArr3, 0, i3);
            return segmentArr3;
        }

        public Filter filterRest(Filter filter) {
            char c = this.f3854ch;
            boolean z = true;
            boolean z2 = c == '&';
            if ((c != '&' || getNextChar() != '&') && (this.f3854ch != '|' || getNextChar() != '|')) {
                return filter;
            }
            next();
            next();
            if (this.f3854ch == '(') {
                next();
            } else {
                z = false;
            }
            while (this.f3854ch == ' ') {
                next();
            }
            FilterGroup filterGroup = new FilterGroup(filter, (Filter) parseArrayAccessFilter(false), z2);
            if (z && this.f3854ch == ')') {
                next();
            }
            return filterGroup;
        }

        public char getNextChar() {
            return this.path.charAt(this.pos);
        }

        public boolean isEOF() {
            return this.pos >= this.path.length();
        }

        public void next() {
            String str = this.path;
            int i = this.pos;
            this.pos = i + 1;
            this.f3854ch = str.charAt(i);
        }

        public Segment parseArrayAccess(boolean z) {
            Object arrayAccessFilter = parseArrayAccessFilter(z);
            return arrayAccessFilter instanceof Segment ? (Segment) arrayAccessFilter : new FilterSegment((Filter) arrayAccessFilter);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object parseArrayAccessFilter(boolean z) {
            int i;
            Object[] objArr;
            char c;
            char c2;
            char c3;
            char c4;
            char c5;
            char c6;
            String str;
            String[] strArr;
            String str2;
            String str3;
            String str4;
            Filter matchSegement;
            char c7;
            char c8;
            char c9;
            char c10;
            int i2;
            char c11;
            char c12;
            char c13;
            char c14;
            char c15;
            int i3;
            String strReplaceAll;
            char c16;
            if (z) {
                accept('[');
            }
            if (this.f3854ch == '?') {
                next();
                accept('(');
                i = 1;
                while (this.f3854ch == '(') {
                    next();
                    i++;
                }
                objArr = true;
            } else {
                i = 0;
                objArr = false;
            }
            if (objArr != true && !IOUtils.firstIdentifier(this.f3854ch) && (c14 = this.f3854ch) != '\\' && c14 != '@') {
                int i4 = this.pos - 1;
                while (true) {
                    char c17 = this.f3854ch;
                    if (c17 == ']' || c17 == '/' || isEOF() || !((c16 = this.f3854ch) != '.' || objArr == true || objArr == true || c14 == '\'')) {
                        break;
                    }
                    if (c16 == '\\') {
                        next();
                    }
                    next();
                }
                if (z || (c15 = this.f3854ch) == '/' || c15 == '.') {
                    int i5 = this.pos;
                    i3 = i5 - 1;
                } else {
                    i3 = this.pos;
                }
                String strSubstring = this.path.substring(i4, i3);
                if (strSubstring.indexOf("\\.") == -1) {
                    Segment segmentBuildArraySegement = buildArraySegement(strSubstring);
                    if (z && !isEOF()) {
                        accept(']');
                    }
                    return segmentBuildArraySegement;
                }
                if (c14 == '\'' && strSubstring.length() > 2 && strSubstring.charAt(strSubstring.length() - 1) == c14) {
                    strReplaceAll = strSubstring.substring(1, strSubstring.length() - 1);
                } else {
                    strReplaceAll = strSubstring.replaceAll("\\\\\\.", "\\.");
                    if (strReplaceAll.indexOf("\\-") != -1) {
                        strReplaceAll = strReplaceAll.replaceAll("\\\\-", "-");
                    }
                }
                if (objArr != false) {
                    accept(')');
                }
                return new PropertySegment(strReplaceAll, false);
            }
            if (this.f3854ch == '@') {
                next();
                accept('.');
            }
            String name = readName();
            skipWhitespace();
            if (objArr == true && this.f3854ch == ')') {
                next();
                Filter notNullSegement = new NotNullSegement(name);
                while (true) {
                    c13 = this.f3854ch;
                    if (c13 != ' ') {
                        break;
                    }
                    next();
                }
                if (c13 == '&' || c13 == '|') {
                    notNullSegement = filterRest(notNullSegement);
                }
                if (z) {
                    accept(']');
                }
                return notNullSegement;
            }
            if (z && this.f3854ch == ']') {
                next();
                Filter notNullSegement2 = new NotNullSegement(name);
                while (true) {
                    c12 = this.f3854ch;
                    if (c12 != ' ') {
                        break;
                    }
                    next();
                }
                if (c12 == '&' || c12 == '|') {
                    notNullSegement2 = filterRest(notNullSegement2);
                }
                accept(')');
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return notNullSegement2;
            }
            Operator op = readOp();
            skipWhitespace();
            if (op == Operator.BETWEEN || op == Operator.NOT_BETWEEN) {
                boolean z2 = op == Operator.NOT_BETWEEN;
                Object value = readValue();
                if (!"and".equalsIgnoreCase(readName())) {
                    throw new JSONPathException(this.path);
                }
                Object value2 = readValue();
                if (value == null || value2 == null) {
                    throw new JSONPathException(this.path);
                }
                if (JSONPath.isInt(value.getClass()) && JSONPath.isInt(value2.getClass())) {
                    return new IntBetweenSegement(name, TypeUtils.longExtractValue((Number) value), TypeUtils.longExtractValue((Number) value2), z2);
                }
                throw new JSONPathException(this.path);
            }
            String[] strArr2 = null;
            String str5 = null;
            strArr2 = null;
            strArr2 = null;
            if (op == Operator.IN || op == Operator.NOT_IN) {
                boolean z3 = op == Operator.NOT_IN;
                accept('(');
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(readValue());
                while (true) {
                    skipWhitespace();
                    if (this.f3854ch != ',') {
                        break;
                    }
                    next();
                    jSONArray.add(readValue());
                }
                boolean z4 = true;
                boolean z5 = true;
                boolean z6 = true;
                for (Object obj : jSONArray) {
                    if (obj != null) {
                        Class<?> cls = obj.getClass();
                        if (z4 && cls != Byte.class && cls != Short.class && cls != Integer.class && cls != Long.class) {
                            z4 = false;
                            z6 = false;
                        }
                        if (z5 && cls != String.class) {
                            z5 = false;
                        }
                    } else if (z4) {
                        z4 = false;
                    }
                }
                if (jSONArray.size() == 1 && jSONArray.get(0) == null) {
                    Filter notNullSegement3 = z3 ? new NotNullSegement(name) : new NullSegement(name);
                    while (true) {
                        c6 = this.f3854ch;
                        if (c6 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c6 == '&' || c6 == '|') {
                        notNullSegement3 = filterRest(notNullSegement3);
                    }
                    accept(')');
                    if (objArr != false) {
                        accept(')');
                    }
                    if (z) {
                        accept(']');
                    }
                    return notNullSegement3;
                }
                if (z4) {
                    if (jSONArray.size() == 1) {
                        Filter intOpSegement = new IntOpSegement(name, TypeUtils.longExtractValue((Number) jSONArray.get(0)), z3 ? Operator.NE : Operator.EQ);
                        while (true) {
                            c5 = this.f3854ch;
                            if (c5 != ' ') {
                                break;
                            }
                            next();
                        }
                        if (c5 == '&' || c5 == '|') {
                            intOpSegement = filterRest(intOpSegement);
                        }
                        accept(')');
                        if (objArr != false) {
                            accept(')');
                        }
                        if (z) {
                            accept(']');
                        }
                        return intOpSegement;
                    }
                    int size = jSONArray.size();
                    long[] jArr = new long[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        jArr[i6] = TypeUtils.longExtractValue((Number) jSONArray.get(i6));
                    }
                    Filter intInSegement = new IntInSegement(name, jArr, z3);
                    while (true) {
                        c4 = this.f3854ch;
                        if (c4 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c4 == '&' || c4 == '|') {
                        intInSegement = filterRest(intInSegement);
                    }
                    accept(')');
                    if (objArr != false) {
                        accept(')');
                    }
                    if (z) {
                        accept(']');
                    }
                    return intInSegement;
                }
                if (!z5) {
                    if (!z6) {
                        l710.m153113a();
                        return null;
                    }
                    int size2 = jSONArray.size();
                    Long[] lArr = new Long[size2];
                    for (int i7 = 0; i7 < size2; i7++) {
                        Number number = (Number) jSONArray.get(i7);
                        if (number != null) {
                            lArr[i7] = Long.valueOf(TypeUtils.longExtractValue(number));
                        }
                    }
                    Filter intObjInSegement = new IntObjInSegement(name, lArr, z3);
                    while (true) {
                        c = this.f3854ch;
                        if (c != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c == '&' || c == '|') {
                        intObjInSegement = filterRest(intObjInSegement);
                    }
                    accept(')');
                    if (objArr != false) {
                        accept(')');
                    }
                    if (z) {
                        accept(']');
                    }
                    return intObjInSegement;
                }
                if (jSONArray.size() == 1) {
                    Filter stringOpSegement = new StringOpSegement(name, (String) jSONArray.get(0), z3 ? Operator.NE : Operator.EQ);
                    while (true) {
                        c3 = this.f3854ch;
                        if (c3 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c3 == '&' || c3 == '|') {
                        stringOpSegement = filterRest(stringOpSegement);
                    }
                    accept(')');
                    if (objArr != false) {
                        accept(')');
                    }
                    if (z) {
                        accept(']');
                    }
                    return stringOpSegement;
                }
                String[] strArr3 = new String[jSONArray.size()];
                jSONArray.toArray(strArr3);
                Filter stringInSegement = new StringInSegement(name, strArr3, z3);
                while (true) {
                    c2 = this.f3854ch;
                    if (c2 != ' ') {
                        break;
                    }
                    next();
                }
                if (c2 == '&' || c2 == '|') {
                    stringInSegement = filterRest(stringInSegement);
                }
                accept(')');
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return stringInSegement;
            }
            char c18 = this.f3854ch;
            if (c18 == '\'' || c18 == '\"') {
                String string = readString();
                if (op == Operator.RLIKE) {
                    matchSegement = new RlikeSegement(name, string, false);
                } else if (op == Operator.NOT_RLIKE) {
                    matchSegement = new RlikeSegement(name, string, true);
                } else if (op == Operator.LIKE || op == Operator.NOT_LIKE) {
                    while (string.indexOf("%%") != -1) {
                        string = string.replaceAll("%%", "%");
                    }
                    boolean z7 = op == Operator.NOT_LIKE;
                    int iIndexOf = string.indexOf(37);
                    if (iIndexOf == -1) {
                        matchSegement = new StringOpSegement(name, string, op == Operator.LIKE ? Operator.EQ : Operator.NE);
                    } else {
                        String[] strArrSplit = string.split("%");
                        if (iIndexOf == 0) {
                            if (string.charAt(string.length() - 1) == '%') {
                                int length = strArrSplit.length - 1;
                                String[] strArr4 = new String[length];
                                System.arraycopy(strArrSplit, 1, strArr4, 0, length);
                                str2 = null;
                                str3 = null;
                                strArr2 = strArr4;
                            } else {
                                str = strArrSplit[strArrSplit.length - 1];
                                if (strArrSplit.length > 2) {
                                    int length2 = strArrSplit.length - 2;
                                    strArr = new String[length2];
                                    System.arraycopy(strArrSplit, 1, strArr, 0, length2);
                                    str3 = str;
                                    str2 = str5;
                                    strArr2 = strArr;
                                } else {
                                    str3 = str;
                                    str2 = null;
                                }
                            }
                        } else if (string.charAt(string.length() - 1) == '%') {
                            if (strArrSplit.length == 1) {
                                str4 = strArrSplit[0];
                                str2 = str4;
                                str3 = null;
                            } else {
                                str2 = null;
                                str3 = null;
                                strArr2 = strArrSplit;
                            }
                        } else if (strArrSplit.length == 1) {
                            str4 = strArrSplit[0];
                            str2 = str4;
                            str3 = null;
                        } else if (strArrSplit.length == 2) {
                            str2 = strArrSplit[0];
                            str3 = strArrSplit[1];
                        } else {
                            str5 = strArrSplit[0];
                            str = strArrSplit[strArrSplit.length - 1];
                            int length3 = strArrSplit.length - 2;
                            strArr = new String[length3];
                            System.arraycopy(strArrSplit, 1, strArr, 0, length3);
                            str3 = str;
                            str2 = str5;
                            strArr2 = strArr;
                        }
                        matchSegement = new MatchSegement(name, str2, str3, strArr2, z7);
                    }
                } else {
                    matchSegement = new StringOpSegement(name, string, op);
                }
                while (true) {
                    c7 = this.f3854ch;
                    if (c7 != ' ') {
                        break;
                    }
                    next();
                }
                if (c7 == '&' || c7 == '|') {
                    matchSegement = filterRest(matchSegement);
                }
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return matchSegement;
            }
            if (isDigitFirst(c18)) {
                long longValue = readLongValue();
                double doubleValue = this.f3854ch == '.' ? readDoubleValue(longValue) : 0.0d;
                Filter intOpSegement2 = doubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? new IntOpSegement(name, longValue, op) : new DoubleOpSegement(name, doubleValue, op);
                while (true) {
                    c11 = this.f3854ch;
                    if (c11 != ' ') {
                        break;
                    }
                    next();
                }
                if (i > 1 && c11 == ')') {
                    next();
                }
                char c19 = this.f3854ch;
                if (c19 == '&' || c19 == '|') {
                    intOpSegement2 = filterRest(intOpSegement2);
                }
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return intOpSegement2;
            }
            char c20 = this.f3854ch;
            if (c20 == '$') {
                RefOpSegement refOpSegement = new RefOpSegement(name, readSegement(), op);
                this.hasRefSegment = true;
                while (this.f3854ch == ' ') {
                    next();
                }
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return refOpSegement;
            }
            if (c20 == '/') {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    next();
                    char c21 = this.f3854ch;
                    if (c21 == '/') {
                        break;
                    }
                    if (c21 == '\\') {
                        next();
                        sb.append(this.f3854ch);
                    } else {
                        sb.append(c21);
                    }
                }
                next();
                if (this.f3854ch == 'i') {
                    next();
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                RegMatchSegement regMatchSegement = new RegMatchSegement(name, Pattern.compile(sb.toString(), i2), op);
                if (objArr != false) {
                    accept(')');
                }
                if (z) {
                    accept(']');
                }
                return regMatchSegement;
            }
            if (c20 == 'n') {
                if ("null".equals(readName())) {
                    Filter nullSegement = op == Operator.EQ ? new NullSegement(name) : op == Operator.NE ? new NotNullSegement(name) : null;
                    if (nullSegement != null) {
                        while (true) {
                            c10 = this.f3854ch;
                            if (c10 != ' ') {
                                break;
                            }
                            next();
                        }
                        if (c10 == '&' || c10 == '|') {
                            nullSegement = filterRest(nullSegement);
                        }
                    }
                    if (objArr != false) {
                        accept(')');
                    }
                    accept(']');
                    if (nullSegement != null) {
                        return nullSegement;
                    }
                    l710.m153113a();
                    return null;
                }
            } else if (c20 == 't') {
                if ("true".equals(readName())) {
                    Filter valueSegment = op == Operator.EQ ? new ValueSegment(name, Boolean.TRUE, true) : op == Operator.NE ? new ValueSegment(name, Boolean.TRUE, false) : null;
                    if (valueSegment != null) {
                        while (true) {
                            c9 = this.f3854ch;
                            if (c9 != ' ') {
                                break;
                            }
                            next();
                        }
                        if (c9 == '&' || c9 == '|') {
                            valueSegment = filterRest(valueSegment);
                        }
                    }
                    if (objArr != false) {
                        accept(')');
                    }
                    accept(']');
                    if (valueSegment != null) {
                        return valueSegment;
                    }
                    l710.m153113a();
                    return null;
                }
            } else if (c20 == 'f' && "false".equals(readName())) {
                Filter valueSegment2 = op == Operator.EQ ? new ValueSegment(name, Boolean.FALSE, true) : op == Operator.NE ? new ValueSegment(name, Boolean.FALSE, false) : null;
                if (valueSegment2 != null) {
                    while (true) {
                        c8 = this.f3854ch;
                        if (c8 != ' ') {
                            break;
                        }
                        next();
                    }
                    if (c8 == '&' || c8 == '|') {
                        valueSegment2 = filterRest(valueSegment2);
                    }
                }
                if (objArr != false) {
                    accept(')');
                }
                accept(']');
                if (valueSegment2 != null) {
                    return valueSegment2;
                }
                l710.m153113a();
                return null;
            }
            l710.m153113a();
            return null;
        }

        public double readDoubleValue(long j) {
            int i = this.pos - 1;
            next();
            while (true) {
                char c = this.f3854ch;
                if (c < '0' || c > '9') {
                    break;
                }
                next();
            }
            return Double.parseDouble(this.path.substring(i, this.pos - 1)) + j;
        }

        public long readLongValue() {
            int i = this.pos - 1;
            char c = this.f3854ch;
            if (c == '+' || c == '-') {
                next();
            }
            while (true) {
                char c2 = this.f3854ch;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                next();
            }
            return Long.parseLong(this.path.substring(i, this.pos - 1));
        }

        public String readName() {
            skipWhitespace();
            char c = this.f3854ch;
            if (c != '\\' && !Character.isJavaIdentifierStart(c)) {
                skq.m186537a("illeal jsonpath syntax. ", this.path);
                return null;
            }
            StringBuilder sb = new StringBuilder();
            while (!isEOF()) {
                char c2 = this.f3854ch;
                if (c2 == '\\') {
                    next();
                    sb.append(this.f3854ch);
                    if (isEOF()) {
                        return sb.toString();
                    }
                    next();
                } else {
                    if (!Character.isJavaIdentifierPart(c2)) {
                        break;
                    }
                    sb.append(this.f3854ch);
                    next();
                }
            }
            if (isEOF() && Character.isJavaIdentifierPart(this.f3854ch)) {
                sb.append(this.f3854ch);
            }
            return sb.toString();
        }

        public Operator readOp() {
            Operator operator;
            char c = this.f3854ch;
            if (c == '=') {
                next();
                char c2 = this.f3854ch;
                if (c2 == '~') {
                    next();
                    operator = Operator.REG_MATCH;
                } else if (c2 == '=') {
                    next();
                    operator = Operator.EQ;
                } else {
                    operator = Operator.EQ;
                }
            } else if (c == '!') {
                next();
                accept('=');
                operator = Operator.NE;
            } else if (c == '<') {
                next();
                if (this.f3854ch == '=') {
                    next();
                    operator = Operator.LE;
                } else {
                    operator = Operator.LT;
                }
            } else if (c == '>') {
                next();
                if (this.f3854ch == '=') {
                    next();
                    operator = Operator.GE;
                } else {
                    operator = Operator.GT;
                }
            } else {
                operator = null;
            }
            if (operator != null) {
                return operator;
            }
            String name = readName();
            if ("not".equalsIgnoreCase(name)) {
                skipWhitespace();
                String name2 = readName();
                if ("like".equalsIgnoreCase(name2)) {
                    return Operator.NOT_LIKE;
                }
                if ("rlike".equalsIgnoreCase(name2)) {
                    return Operator.NOT_RLIKE;
                }
                if ("in".equalsIgnoreCase(name2)) {
                    return Operator.NOT_IN;
                }
                if ("between".equalsIgnoreCase(name2)) {
                    return Operator.NOT_BETWEEN;
                }
                l710.m153113a();
                return null;
            }
            if ("nin".equalsIgnoreCase(name)) {
                return Operator.NOT_IN;
            }
            if ("like".equalsIgnoreCase(name)) {
                return Operator.LIKE;
            }
            if ("rlike".equalsIgnoreCase(name)) {
                return Operator.RLIKE;
            }
            if ("in".equalsIgnoreCase(name)) {
                return Operator.IN;
            }
            if ("between".equalsIgnoreCase(name)) {
                return Operator.BETWEEN;
            }
            l710.m153113a();
            return null;
        }

        public Segment readSegement() {
            boolean z = true;
            if (this.level == 0 && this.path.length() == 1) {
                boolean zIsDigitFirst = isDigitFirst(this.f3854ch);
                char c = this.f3854ch;
                if (zIsDigitFirst) {
                    return new ArrayAccessSegment(c - '0');
                }
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    return new PropertySegment(Character.toString(c), false);
                }
            }
            while (!isEOF()) {
                skipWhitespace();
                char c2 = this.f3854ch;
                if (c2 != '$') {
                    if (c2 != '.' && c2 != '/') {
                        if (c2 == '[') {
                            return parseArrayAccess(true);
                        }
                        if (this.level == 0) {
                            return new PropertySegment(readName(), false);
                        }
                        skq.m186537a("not support jsonpath : ", this.path);
                        return null;
                    }
                    next();
                    if (c2 == '.' && this.f3854ch == '.') {
                        next();
                        int length = this.path.length();
                        int i = this.pos;
                        if (length > i + 3 && this.f3854ch == '[' && this.path.charAt(i) == '*' && this.path.charAt(this.pos + 1) == ']' && this.path.charAt(this.pos + 2) == '.') {
                            next();
                            next();
                            next();
                            next();
                        }
                    } else {
                        z = false;
                    }
                    char c3 = this.f3854ch;
                    if (c3 == '*') {
                        if (!isEOF()) {
                            next();
                        }
                        return z ? WildCardSegment.instance_deep : WildCardSegment.instance;
                    }
                    if (isDigitFirst(c3)) {
                        return parseArrayAccess(false);
                    }
                    String name = readName();
                    if (this.f3854ch != '(') {
                        return new PropertySegment(name, z);
                    }
                    next();
                    if (this.f3854ch != ')') {
                        skq.m186537a("not support jsonpath : ", this.path);
                        return null;
                    }
                    if (!isEOF()) {
                        next();
                    }
                    if ("size".equals(name) || "length".equals(name)) {
                        return SizeSegment.instance;
                    }
                    if (Constants.PRIORITY_MAX.equals(name)) {
                        return MaxSegment.instance;
                    }
                    if ("min".equals(name)) {
                        return MinSegment.instance;
                    }
                    if ("keySet".equals(name)) {
                        return KeySetSegment.instance;
                    }
                    skq.m186537a("not support jsonpath : ", this.path);
                    return null;
                }
                next();
            }
            return null;
        }

        public String readString() {
            char c = this.f3854ch;
            next();
            int i = this.pos - 1;
            while (this.f3854ch != c && !isEOF()) {
                next();
            }
            String str = this.path;
            boolean zIsEOF = isEOF();
            int i2 = this.pos;
            if (!zIsEOF) {
                i2--;
            }
            String strSubstring = str.substring(i, i2);
            accept(c);
            return strSubstring;
        }

        public Object readValue() {
            skipWhitespace();
            if (isDigitFirst(this.f3854ch)) {
                return Long.valueOf(readLongValue());
            }
            char c = this.f3854ch;
            if (c == '\"' || c == '\'') {
                return readString();
            }
            if (c != 'n') {
                l710.m153113a();
                return null;
            }
            if ("null".equals(readName())) {
                return null;
            }
            throw new JSONPathException(this.path);
        }

        public final void skipWhitespace() {
            while (true) {
                char c = this.f3854ch;
                if (c > ' ') {
                    return;
                }
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t' && c != '\f' && c != '\b') {
                    return;
                } else {
                    next();
                }
            }
        }
    }

    public static class KeySetSegment implements Segment {
        public static final KeySetSegment instance = new KeySetSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            return jSONPath.evalKeySet(obj2);
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MatchSegement implements Filter {
        private final String[] containsValues;
        private final String endsWithValue;
        private final int minLength;
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final String startsWithValue;

        public MatchSegement(String str, String str2, String str3, String[] strArr, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.startsWithValue = str2;
            this.endsWithValue = str3;
            this.containsValues = strArr;
            this.not = z;
            int length = str2 != null ? str2.length() : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.minLength = length;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            int length;
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            String string = propertyValue.toString();
            if (string.length() < this.minLength) {
                return this.not;
            }
            String str = this.startsWithValue;
            if (str == null) {
                length = 0;
            } else {
                if (!string.startsWith(str)) {
                    return this.not;
                }
                length = this.startsWithValue.length();
            }
            String[] strArr = this.containsValues;
            if (strArr != null) {
                for (String str2 : strArr) {
                    int iIndexOf = string.indexOf(str2, length);
                    if (iIndexOf == -1) {
                        return this.not;
                    }
                    length = iIndexOf + str2.length();
                }
            }
            String str3 = this.endsWithValue;
            return (str3 == null || string.endsWith(str3)) ? !this.not : this.not;
        }
    }

    public static class MaxSegment implements Segment {
        public static final MaxSegment instance = new MaxSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            Object obj3 = null;
            if (!(obj instanceof Collection)) {
                l710.m153113a();
                return null;
            }
            for (Object obj4 : (Collection) obj) {
                if (obj4 != null && (obj3 == null || JSONPath.compare(obj3, obj4) < 0)) {
                    obj3 = obj4;
                }
            }
            return obj3;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MinSegment implements Segment {
        public static final MinSegment instance = new MinSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            Object obj3 = null;
            if (!(obj instanceof Collection)) {
                l710.m153113a();
                return null;
            }
            for (Object obj4 : (Collection) obj) {
                if (obj4 != null && (obj3 == null || JSONPath.compare(obj3, obj4) > 0)) {
                    obj3 = obj4;
                }
            }
            return obj3;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MultiIndexSegment implements Segment {
        private final int[] indexes;

        public MultiIndexSegment(int[] iArr) {
            this.indexes = iArr;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            JSONArray jSONArray = new JSONArray(this.indexes.length);
            int i = 0;
            while (true) {
                int[] iArr = this.indexes;
                if (i >= iArr.length) {
                    return jSONArray;
                }
                jSONArray.add(jSONPath.getArrayItem(obj2, iArr[i]));
                i++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (context.eval) {
                Object obj = defaultJSONParser.parse();
                if (obj instanceof List) {
                    int[] iArr = this.indexes;
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    List list = (List) obj;
                    if (iArr2[0] >= 0) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            if (Arrays.binarySearch(iArr2, size) < 0) {
                                list.remove(size);
                            }
                        }
                        context.object = list;
                        return;
                    }
                }
            }
            l710.m153113a();
        }
    }

    public static class MultiPropertySegment implements Segment {
        private final String[] propertyNames;
        private final long[] propertyNamesHash;

        public MultiPropertySegment(String[] strArr) {
            this.propertyNames = strArr;
            this.propertyNamesHash = new long[strArr.length];
            int i = 0;
            while (true) {
                long[] jArr = this.propertyNamesHash;
                if (i >= jArr.length) {
                    return;
                }
                jArr[i] = TypeUtils.fnv1a_64(strArr[i]);
                i++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.propertyNames.length);
            int i = 0;
            while (true) {
                String[] strArr = this.propertyNames;
                if (i >= strArr.length) {
                    return arrayList;
                }
                arrayList.add(jSONPath.getPropertyValue(obj2, strArr[i], this.propertyNamesHash[i]));
                i++;
            }
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            JSONArray jSONArray;
            Object objIntegerValue;
            JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.lexer;
            Object obj = context.object;
            if (obj == null) {
                jSONArray = new JSONArray();
                context.object = jSONArray;
            } else {
                jSONArray = (JSONArray) obj;
            }
            for (int size = jSONArray.size(); size < this.propertyNamesHash.length; size++) {
                jSONArray.add(null);
            }
            do {
                int iSeekObjectToField = jSONLexerBase.seekObjectToField(this.propertyNamesHash);
                if (jSONLexerBase.matchStat != 3) {
                    return;
                }
                int i = jSONLexerBase.token();
                if (i == 2) {
                    objIntegerValue = jSONLexerBase.integerValue();
                    jSONLexerBase.nextToken(16);
                } else if (i == 3) {
                    objIntegerValue = jSONLexerBase.decimalValue();
                    jSONLexerBase.nextToken(16);
                } else if (i != 4) {
                    objIntegerValue = defaultJSONParser.parse();
                } else {
                    objIntegerValue = jSONLexerBase.stringVal();
                    jSONLexerBase.nextToken(16);
                }
                jSONArray.set(iSeekObjectToField, objIntegerValue);
            } while (jSONLexerBase.token() == 16);
        }
    }

    public static class NotNullSegement implements Filter {
        private final String propertyName;
        private final long propertyNameHash;

        public NotNullSegement(String str) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash) != null;
        }
    }

    public static class NullSegement implements Filter {
        private final String propertyName;
        private final long propertyNameHash;

        public NullSegement(String str) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            return jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash) == null;
        }
    }

    public enum Operator {
        EQ,
        NE,
        GT,
        GE,
        LT,
        LE,
        LIKE,
        NOT_LIKE,
        RLIKE,
        NOT_RLIKE,
        IN,
        NOT_IN,
        BETWEEN,
        NOT_BETWEEN,
        And,
        Or,
        REG_MATCH
    }

    public static class PropertySegment implements Segment {
        private final boolean deep;
        private final String propertyName;
        private final long propertyNameHash;

        public PropertySegment(String str, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.deep = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!this.deep) {
                return jSONPath.getPropertyValue(obj2, this.propertyName, this.propertyNameHash);
            }
            ArrayList arrayList = new ArrayList();
            jSONPath.deepScan(obj2, this.propertyName, arrayList);
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:110:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            Object objIntegerValue;
            Object objIntegerValue2;
            Object objIntegerValue3;
            JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.lexer;
            if (this.deep && context.object == null) {
                context.object = new JSONArray();
            }
            if (jSONLexerBase.token() != 14) {
                boolean z = this.deep;
                if (!z) {
                    if (jSONLexerBase.seekObjectToField(this.propertyNameHash, z) == 3 && context.eval) {
                        int i = jSONLexerBase.token();
                        if (i == 2) {
                            objIntegerValue2 = jSONLexerBase.integerValue();
                            jSONLexerBase.nextToken(16);
                        } else if (i == 3) {
                            objIntegerValue2 = jSONLexerBase.decimalValue();
                            jSONLexerBase.nextToken(16);
                        } else if (i != 4) {
                            objIntegerValue2 = defaultJSONParser.parse();
                        } else {
                            objIntegerValue2 = jSONLexerBase.stringVal();
                            jSONLexerBase.nextToken(16);
                        }
                        if (context.eval) {
                            context.object = objIntegerValue2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                while (true) {
                    int iSeekObjectToField = jSONLexerBase.seekObjectToField(this.propertyNameHash, this.deep);
                    if (iSeekObjectToField == -1) {
                        return;
                    }
                    if (iSeekObjectToField == 3) {
                        if (context.eval) {
                            int i2 = jSONLexerBase.token();
                            if (i2 == 2) {
                                objIntegerValue = jSONLexerBase.integerValue();
                                jSONLexerBase.nextToken(16);
                            } else if (i2 == 3) {
                                objIntegerValue = jSONLexerBase.decimalValue();
                                jSONLexerBase.nextToken(16);
                            } else if (i2 != 4) {
                                objIntegerValue = defaultJSONParser.parse();
                            } else {
                                objIntegerValue = jSONLexerBase.stringVal();
                                jSONLexerBase.nextToken(16);
                            }
                            if (context.eval) {
                                Object obj = context.object;
                                if (obj instanceof List) {
                                    List list = (List) obj;
                                    if (list.size() == 0 && (objIntegerValue instanceof List)) {
                                        context.object = objIntegerValue;
                                    } else {
                                        list.add(objIntegerValue);
                                    }
                                } else {
                                    context.object = objIntegerValue;
                                }
                            }
                        }
                    } else if (iSeekObjectToField == 1 || iSeekObjectToField == 2) {
                        extract(jSONPath, defaultJSONParser, context);
                    }
                }
            } else {
                if ("*".equals(this.propertyName)) {
                    return;
                }
                jSONLexerBase.nextToken();
                JSONArray jSONArray = this.deep ? (JSONArray) context.object : new JSONArray();
                while (true) {
                    int i3 = jSONLexerBase.token();
                    if (i3 == 12) {
                        boolean z2 = this.deep;
                        if (z2) {
                            extract(jSONPath, defaultJSONParser, context);
                        } else {
                            int iSeekObjectToField2 = jSONLexerBase.seekObjectToField(this.propertyNameHash, z2);
                            if (iSeekObjectToField2 == 3) {
                                int i4 = jSONLexerBase.token();
                                if (i4 == 2) {
                                    objIntegerValue3 = jSONLexerBase.integerValue();
                                    jSONLexerBase.nextToken();
                                } else if (i4 != 4) {
                                    objIntegerValue3 = defaultJSONParser.parse();
                                } else {
                                    objIntegerValue3 = jSONLexerBase.stringVal();
                                    jSONLexerBase.nextToken();
                                }
                                jSONArray.add(objIntegerValue3);
                                if (jSONLexerBase.token() == 13) {
                                    jSONLexerBase.nextToken();
                                } else {
                                    jSONLexerBase.skipObject(false);
                                }
                            } else if (iSeekObjectToField2 == -1) {
                                continue;
                            } else {
                                if (this.deep) {
                                    pr3.m173429a(jSONLexerBase.info());
                                    return;
                                }
                                jSONLexerBase.skipObject(false);
                            }
                        }
                    } else if (i3 != 14) {
                        switch (i3) {
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                jSONLexerBase.nextToken();
                            default:
                                if (jSONLexerBase.token() == 15) {
                                    jSONLexerBase.nextToken();
                                    if (!this.deep || jSONArray.size() <= 0) {
                                        return;
                                    }
                                    context.object = jSONArray;
                                    return;
                                }
                                if (jSONLexerBase.token() == 16) {
                                    wkq.m206856a("illegal json : ", jSONLexerBase.info());
                                    return;
                                }
                                jSONLexerBase.nextToken();
                                break;
                                break;
                        }
                    } else if (this.deep) {
                        extract(jSONPath, defaultJSONParser, context);
                    } else {
                        jSONLexerBase.skipObject(false);
                    }
                    if (jSONLexerBase.token() == 15) {
                        jSONLexerBase.nextToken();
                        if (this.deep) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        if (jSONLexerBase.token() == 16) {
                            wkq.m206856a("illegal json : ", jSONLexerBase.info());
                            return;
                        }
                        jSONLexerBase.nextToken();
                    }
                }
            }
        }

        public boolean remove(JSONPath jSONPath, Object obj) {
            return jSONPath.removePropertyValue(obj, this.propertyName, this.deep);
        }

        public void setValue(JSONPath jSONPath, Object obj, Object obj2) {
            boolean z = this.deep;
            String str = this.propertyName;
            if (z) {
                jSONPath.deepSet(obj, str, this.propertyNameHash, obj2);
            } else {
                jSONPath.setPropertyValue(obj, str, this.propertyNameHash, obj2);
            }
        }
    }

    public static class RangeSegment implements Segment {
        private final int end;
        private final int start;
        private final int step;

        public RangeSegment(int i, int i2, int i3) {
            this.start = i;
            this.end = i2;
            this.step = i3;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            int iIntValue = SizeSegment.instance.eval(jSONPath, obj, obj2).intValue();
            int i = this.start;
            if (i < 0) {
                i += iIntValue;
            }
            int i2 = this.end;
            if (i2 < 0) {
                i2 += iIntValue;
            }
            int i3 = ((i2 - i) / this.step) + 1;
            if (i3 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i3);
            while (i <= i2 && i < iIntValue) {
                arrayList.add(jSONPath.getArrayItem(obj2, i));
                i += this.step;
            }
            return arrayList;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class RefOpSegement implements Filter {

        /* JADX INFO: renamed from: op */
        private final Operator f3863op;
        private final String propertyName;
        private final long propertyNameHash;
        private final Segment refSgement;

        public RefOpSegement(String str, Segment segment, Operator operator) {
            this.propertyName = str;
            this.refSgement = segment;
            this.f3863op = operator;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null || !(propertyValue instanceof Number)) {
                return false;
            }
            Object objEval = this.refSgement.eval(jSONPath, obj, obj);
            if ((objEval instanceof Integer) || (objEval instanceof Long) || (objEval instanceof Short) || (objEval instanceof Byte)) {
                long jLongExtractValue = TypeUtils.longExtractValue((Number) objEval);
                if ((propertyValue instanceof Integer) || (propertyValue instanceof Long) || (propertyValue instanceof Short) || (propertyValue instanceof Byte)) {
                    long jLongExtractValue2 = TypeUtils.longExtractValue((Number) propertyValue);
                    switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3863op.ordinal()]) {
                        case 1:
                            return jLongExtractValue2 == jLongExtractValue;
                        case 2:
                            return jLongExtractValue2 != jLongExtractValue;
                        case 3:
                            return jLongExtractValue2 >= jLongExtractValue;
                        case 4:
                            return jLongExtractValue2 > jLongExtractValue;
                        case 5:
                            return jLongExtractValue2 <= jLongExtractValue;
                        case 6:
                            return jLongExtractValue2 < jLongExtractValue;
                    }
                }
                if (propertyValue instanceof BigDecimal) {
                    int iCompareTo = BigDecimal.valueOf(jLongExtractValue).compareTo((BigDecimal) propertyValue);
                    switch (C08361.$SwitchMap$com$alibaba$fastjson$JSONPath$Operator[this.f3863op.ordinal()]) {
                        case 1:
                            return iCompareTo == 0;
                        case 2:
                            return iCompareTo != 0;
                        case 3:
                            return iCompareTo <= 0;
                        case 4:
                            return iCompareTo < 0;
                        case 5:
                            return iCompareTo >= 0;
                        case 6:
                            return iCompareTo > 0;
                        default:
                            return false;
                    }
                }
            }
            l710.m153113a();
            return false;
        }
    }

    public static class RegMatchSegement implements Filter {

        /* JADX INFO: renamed from: op */
        private final Operator f3864op;
        private final Pattern pattern;
        private final String propertyName;
        private final long propertyNameHash;

        public RegMatchSegement(String str, Pattern pattern, Operator operator) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.pattern = pattern;
            this.f3864op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            return this.pattern.matcher(propertyValue.toString()).matches();
        }
    }

    public static class RlikeSegement implements Filter {
        private final boolean not;
        private final Pattern pattern;
        private final String propertyName;
        private final long propertyNameHash;

        public RlikeSegement(String str, String str2, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.pattern = Pattern.compile(str2);
            this.not = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            if (propertyValue == null) {
                return false;
            }
            boolean zMatches = this.pattern.matcher(propertyValue.toString()).matches();
            return this.not ? !zMatches : zMatches;
        }
    }

    public interface Segment {
        Object eval(JSONPath jSONPath, Object obj, Object obj2);

        void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context);
    }

    public static class SizeSegment implements Segment {
        public static final SizeSegment instance = new SizeSegment();

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Integer eval(JSONPath jSONPath, Object obj, Object obj2) {
            return Integer.valueOf(jSONPath.evalSize(obj2));
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            throw new UnsupportedOperationException();
        }
    }

    public static class StringInSegement implements Filter {
        private final boolean not;
        private final String propertyName;
        private final long propertyNameHash;
        private final String[] values;

        public StringInSegement(String str, String[] strArr, boolean z) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.values = strArr;
            this.not = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean z;
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            for (String str : this.values) {
                if (str == propertyValue) {
                    z = this.not;
                } else if (str != null && str.equals(propertyValue)) {
                    z = this.not;
                }
                return !z;
            }
            return this.not;
        }
    }

    public static class StringOpSegement implements Filter {

        /* JADX INFO: renamed from: op */
        private final Operator f3865op;
        private final String propertyName;
        private final long propertyNameHash;
        private final String value;

        public StringOpSegement(String str, String str2, Operator operator) {
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = str2;
            this.f3865op = operator;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            Object propertyValue = jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash);
            Operator operator = this.f3865op;
            if (operator == Operator.EQ) {
                return this.value.equals(propertyValue);
            }
            if (operator == Operator.NE) {
                return !this.value.equals(propertyValue);
            }
            if (propertyValue == null) {
                return false;
            }
            int iCompareTo = this.value.compareTo(propertyValue.toString());
            Operator operator2 = this.f3865op;
            if (operator2 == Operator.GE) {
                return iCompareTo <= 0;
            }
            if (operator2 == Operator.GT) {
                return iCompareTo < 0;
            }
            if (operator2 == Operator.LE) {
                return iCompareTo >= 0;
            }
            return operator2 == Operator.LT && iCompareTo > 0;
        }
    }

    public static class ValueSegment implements Filter {

        /* JADX INFO: renamed from: eq */
        private boolean f3866eq;
        private final String propertyName;
        private final long propertyNameHash;
        private final Object value;

        public ValueSegment(String str, Object obj, boolean z) {
            this.f3866eq = true;
            if (obj == null) {
                wg3.m206174a("value is null");
                throw null;
            }
            this.propertyName = str;
            this.propertyNameHash = TypeUtils.fnv1a_64(str);
            this.value = obj;
            this.f3866eq = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Filter
        public boolean apply(JSONPath jSONPath, Object obj, Object obj2, Object obj3) {
            boolean zEquals = this.value.equals(jSONPath.getPropertyValue(obj3, this.propertyName, this.propertyNameHash));
            return !this.f3866eq ? !zEquals : zEquals;
        }
    }

    public static class WildCardSegment implements Segment {
        public static final WildCardSegment instance = new WildCardSegment(false);
        public static final WildCardSegment instance_deep = new WildCardSegment(true);
        private boolean deep;

        private WildCardSegment(boolean z) {
            this.deep = z;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public Object eval(JSONPath jSONPath, Object obj, Object obj2) {
            if (!this.deep) {
                return jSONPath.getPropertyValues(obj2);
            }
            ArrayList arrayList = new ArrayList();
            jSONPath.deepGetPropertyValues(obj2, arrayList);
            return arrayList;
        }

        @Override // com.alibaba.fastjson.JSONPath.Segment
        public void extract(JSONPath jSONPath, DefaultJSONParser defaultJSONParser, Context context) {
            if (context.eval) {
                Object obj = defaultJSONParser.parse();
                if (this.deep) {
                    ArrayList arrayList = new ArrayList();
                    jSONPath.deepGetPropertyValues(obj, arrayList);
                    context.object = arrayList;
                    return;
                } else {
                    if (obj instanceof JSONObject) {
                        Collection<Object> collectionValues = ((JSONObject) obj).values();
                        JSONArray jSONArray = new JSONArray(collectionValues.size());
                        Iterator<Object> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            jSONArray.add(it.next());
                        }
                        context.object = jSONArray;
                        return;
                    }
                    if (obj instanceof JSONArray) {
                        context.object = obj;
                        return;
                    }
                }
            }
            qkq.m176968a("TODO");
        }
    }

    public JSONPath(String str, SerializeConfig serializeConfig, ParserConfig parserConfig) {
        if (str == null || str.length() == 0) {
            throw new JSONPathException("json-path can not be null or empty");
        }
        this.path = str;
        this.serializeConfig = serializeConfig;
        this.parserConfig = parserConfig;
    }

    public static int compare(Object obj, Object obj2) {
        Object d;
        Object f;
        if (obj.getClass() == obj2.getClass()) {
            return ((Comparable) obj).compareTo(obj2);
        }
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (cls == BigDecimal.class) {
            if (cls2 == Integer.class) {
                f = new BigDecimal(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f = new BigDecimal(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                f = new BigDecimal(((Float) obj2).floatValue());
            } else if (cls2 == Double.class) {
                f = new BigDecimal(((Double) obj2).doubleValue());
            }
            obj2 = f;
        } else if (cls == Long.class) {
            if (cls2 == Integer.class) {
                f = new Long(((Integer) obj2).intValue());
                obj2 = f;
            } else {
                if (cls2 == BigDecimal.class) {
                    d = new BigDecimal(((Long) obj).longValue());
                } else if (cls2 == Float.class) {
                    d = new Float(((Long) obj).longValue());
                } else if (cls2 == Double.class) {
                    d = new Double(((Long) obj).longValue());
                }
                obj = d;
            }
        } else if (cls == Integer.class) {
            if (cls2 == Long.class) {
                d = new Long(((Integer) obj).intValue());
            } else if (cls2 == BigDecimal.class) {
                d = new BigDecimal(((Integer) obj).intValue());
            } else if (cls2 == Float.class) {
                d = new Float(((Integer) obj).intValue());
            } else if (cls2 == Double.class) {
                d = new Double(((Integer) obj).intValue());
            }
            obj = d;
        } else if (cls == Double.class) {
            if (cls2 == Integer.class) {
                f = new Double(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f = new Double(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                f = new Double(((Float) obj2).floatValue());
            }
            obj2 = f;
        } else if (cls == Float.class) {
            if (cls2 == Integer.class) {
                f = new Float(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                f = new Float(((Long) obj2).longValue());
            } else if (cls2 == Double.class) {
                d = new Double(((Float) obj).floatValue());
                obj = d;
            }
            obj2 = f;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    public static JSONPath compile(String str) {
        if (str == null) {
            throw new JSONPathException("jsonpath can not be null");
        }
        JSONPath jSONPath = pathCache.get(str);
        if (jSONPath == null) {
            jSONPath = new JSONPath(str);
            if (pathCache.size() < 1024) {
                pathCache.putIfAbsent(str, jSONPath);
                return pathCache.get(str);
            }
        }
        return jSONPath;
    }

    /* JADX INFO: renamed from: eq */
    public static boolean m4810eq(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.getClass() == obj2.getClass()) {
            return obj.equals(obj2);
        }
        if (!(obj instanceof Number)) {
            return obj.equals(obj2);
        }
        if (obj2 instanceof Number) {
            return eqNotNull((Number) obj, (Number) obj2);
        }
        return false;
    }

    public static boolean eqNotNull(Number number, Number number2) {
        Class<?> cls = number.getClass();
        boolean zIsInt = isInt(cls);
        Class<?> cls2 = number2.getClass();
        boolean zIsInt2 = isInt(cls2);
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            if (zIsInt2) {
                return bigDecimal.equals(BigDecimal.valueOf(TypeUtils.longExtractValue(number2)));
            }
        }
        if (zIsInt) {
            if (zIsInt2) {
                return number.longValue() == number2.longValue();
            }
            if (number2 instanceof BigInteger) {
                return BigInteger.valueOf(number.longValue()).equals((BigInteger) number);
            }
        }
        if (zIsInt2 && (number instanceof BigInteger)) {
            return ((BigInteger) number).equals(BigInteger.valueOf(TypeUtils.longExtractValue(number2)));
        }
        boolean zIsDouble = isDouble(cls);
        boolean zIsDouble2 = isDouble(cls2);
        return ((zIsDouble && zIsDouble2) || ((zIsDouble && zIsInt2) || (zIsDouble2 && zIsInt))) && number.doubleValue() == number2.doubleValue();
    }

    public static boolean isDouble(Class<?> cls) {
        return cls == Float.class || cls == Double.class;
    }

    public static boolean isInt(Class<?> cls) {
        return cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class;
    }

    private static void paths(Map<Object, String> map, Map<String, Object> map2, String str, Object obj, SerializeConfig serializeConfig) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        if (obj == null) {
            return;
        }
        if (map.put(obj, str) == null || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Date) || (obj instanceof UUID)) {
            map2.put(str, obj);
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        if (str.equals("/")) {
                            sb4 = new StringBuilder("/");
                        } else {
                            sb4 = new StringBuilder();
                            sb4.append(str);
                            sb4.append("/");
                        }
                        sb4.append(key);
                        paths(map, map2, sb4.toString(), entry.getValue(), serializeConfig);
                    }
                }
                return;
            }
            int i = 0;
            if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    if (str.equals("/")) {
                        sb3 = new StringBuilder("/");
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append("/");
                    }
                    sb3.append(i);
                    paths(map, map2, sb3.toString(), obj2, serializeConfig);
                    i++;
                }
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                while (i < length) {
                    Object obj3 = Array.get(obj, i);
                    if (str.equals("/")) {
                        sb2 = new StringBuilder("/");
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("/");
                    }
                    sb2.append(i);
                    paths(map, map2, sb2.toString(), obj3, serializeConfig);
                    i++;
                }
                return;
            }
            if (ParserConfig.isPrimitive2(cls) || cls.isEnum()) {
                return;
            }
            ObjectSerializer objectWriter = serializeConfig.getObjectWriter(cls);
            if (objectWriter instanceof JavaBeanSerializer) {
                try {
                    for (Map.Entry<String, Object> entry2 : ((JavaBeanSerializer) objectWriter).getFieldValuesMap(obj).entrySet()) {
                        String key2 = entry2.getKey();
                        if (key2 != null) {
                            if (str.equals("/")) {
                                sb = new StringBuilder();
                                sb.append("/");
                            } else {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("/");
                            }
                            sb.append(key2);
                            paths(map, map2, sb.toString(), entry2.getValue(), serializeConfig);
                        }
                    }
                } catch (Exception e) {
                    okq.m168043a("toJSON error", e);
                }
            }
        }
    }

    public static Object read(String str, String str2) {
        return compile(str2).eval(JSON.parse(str));
    }

    public static Object reserveToArray(Object obj, String... strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                JSONPath jSONPathCompile = compile(str);
                jSONPathCompile.init();
                jSONArray.add(jSONPathCompile.eval(obj));
            }
        }
        return jSONArray;
    }

    public static Object reserveToObject(Object obj, String... strArr) {
        Object objEval;
        if (strArr == null || strArr.length == 0) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject(true);
        for (String str : strArr) {
            JSONPath jSONPathCompile = compile(str);
            jSONPathCompile.init();
            Segment[] segmentArr = jSONPathCompile.segments;
            if ((segmentArr[segmentArr.length - 1] instanceof PropertySegment) && (objEval = jSONPathCompile.eval(obj)) != null) {
                jSONPathCompile.set(jSONObject, objEval);
            }
        }
        return jSONObject;
    }

    public void arrayAdd(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0 || obj == null) {
            return;
        }
        init();
        int i = 0;
        Object obj2 = null;
        Object objEval = obj;
        int i2 = 0;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i2 >= segmentArr.length) {
                break;
            }
            if (i2 == segmentArr.length - 1) {
                obj2 = objEval;
            }
            objEval = segmentArr[i2].eval(this, obj, objEval);
            i2++;
        }
        if (objEval == null) {
            skq.m186537a("value not found in path ", this.path);
            return;
        }
        if (objEval instanceof Collection) {
            Collection collection = (Collection) objEval;
            int length = objArr.length;
            while (i < length) {
                collection.add(objArr[i]);
                i++;
            }
            return;
        }
        Class<?> cls = objEval.getClass();
        if (!cls.isArray()) {
            rkq.m181878a("unsupported array put operation. ", cls);
            return;
        }
        int length2 = Array.getLength(objEval);
        Object objNewInstance = Array.newInstance(cls.getComponentType(), objArr.length + length2);
        System.arraycopy(objEval, 0, objNewInstance, 0, length2);
        while (i < objArr.length) {
            Array.set(objNewInstance, length2 + i, objArr[i]);
            i++;
        }
        Segment[] segmentArr2 = this.segments;
        Segment segment = segmentArr2[segmentArr2.length - 1];
        if (segment instanceof PropertySegment) {
            ((PropertySegment) segment).setValue(this, obj2, objNewInstance);
        } else if (segment instanceof ArrayAccessSegment) {
            ((ArrayAccessSegment) segment).setValue(this, obj2, objNewInstance);
        } else {
            l710.m153113a();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        init();
        Object obj2 = obj;
        int i = 0;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return true;
            }
            Object objEval = segmentArr[i].eval(this, obj, obj2);
            if (objEval == null) {
                return false;
            }
            if (objEval == Collections.EMPTY_LIST && (obj2 instanceof List)) {
                return ((List) obj2).contains(objEval);
            }
            i++;
            obj2 = objEval;
        }
    }

    public boolean containsValue(Object obj, Object obj2) {
        Object objEval = eval(obj);
        if (objEval == obj2) {
            return true;
        }
        if (objEval == null) {
            return false;
        }
        if (!(objEval instanceof Iterable)) {
            return m4810eq(objEval, obj2);
        }
        Iterator it = ((Iterable) objEval).iterator();
        while (it.hasNext()) {
            if (m4810eq(it.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    public void deepGetPropertyValues(Object obj, List<Object> list) {
        Collection fieldValues;
        Class<?> cls = obj.getClass();
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(cls);
        if (javaBeanSerializer != null) {
            try {
                fieldValues = javaBeanSerializer.getFieldValues(obj);
            } catch (Exception e) {
                ukq.m196512a("jsonpath error, path ", this.path, e);
                return;
            }
        } else if (obj instanceof Map) {
            fieldValues = ((Map) obj).values();
        } else {
            fieldValues = obj instanceof Collection ? (Collection) obj : null;
        }
        if (fieldValues == null) {
            pr3.m173429a(cls.getName());
            return;
        }
        for (Object obj2 : fieldValues) {
            if (obj2 == null || ParserConfig.isPrimitive2(obj2.getClass())) {
                list.add(obj2);
            } else {
                deepGetPropertyValues(obj2, list);
            }
        }
    }

    public void deepScan(Object obj, String str, List<Object> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (str.equals(entry.getKey())) {
                    if (value instanceof Collection) {
                        list.addAll((Collection) value);
                    } else {
                        list.add(value);
                    }
                } else if (value != null && !ParserConfig.isPrimitive2(value.getClass())) {
                    deepScan(value, str, list);
                }
            }
            return;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (!ParserConfig.isPrimitive2(obj2.getClass())) {
                    deepScan(obj2, str, list);
                }
            }
            return;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                for (int i = 0; i < list2.size(); i++) {
                    deepScan(list2.get(i), str, list);
                }
                return;
            }
            return;
        }
        try {
            FieldSerializer fieldSerializer = javaBeanSerializer.getFieldSerializer(str);
            if (fieldSerializer == null) {
                Iterator<Object> it = javaBeanSerializer.getFieldValues(obj).iterator();
                while (it.hasNext()) {
                    deepScan(it.next(), str, list);
                }
                return;
            }
            try {
                try {
                    list.add(fieldSerializer.getPropertyValueDirect(obj));
                } catch (InvocationTargetException e) {
                    throw new JSONException("getFieldValue error." + str, e);
                }
            } catch (IllegalAccessException e2) {
                throw new JSONException("getFieldValue error." + str, e2);
            }
        } catch (Exception e3) {
            tkq.m191589a(this.path, str, e3);
        }
    }

    public void deepSet(Object obj, String str, long j, Object obj2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                map.get(str);
                map.put(str, obj2);
                return;
            } else {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    deepSet(it.next(), str, j, obj2);
                }
                return;
            }
        }
        Class<?> cls = obj.getClass();
        JavaBeanDeserializer javaBeanDeserializer = getJavaBeanDeserializer(cls);
        if (javaBeanDeserializer == null) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    deepSet(list.get(i), str, j, obj2);
                }
                return;
            }
            return;
        }
        try {
            FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
            if (fieldDeserializer != null) {
                fieldDeserializer.setValue(obj, obj2);
                return;
            }
            Iterator<Object> it2 = getJavaBeanSerializer(cls).getObjectFieldValues(obj).iterator();
            while (it2.hasNext()) {
                deepSet(it2.next(), str, j, obj2);
            }
        } catch (Exception e) {
            tkq.m191589a(this.path, str, e);
        }
    }

    public Object eval(Object obj) {
        if (obj == null) {
            return null;
        }
        init();
        int i = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return objEval;
            }
            objEval = segmentArr[i].eval(this, obj, objEval);
            i++;
        }
    }

    public Set<?> evalKeySet(Object obj) {
        JavaBeanSerializer javaBeanSerializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        if ((obj instanceof Collection) || (obj instanceof Object[]) || obj.getClass().isArray() || (javaBeanSerializer = getJavaBeanSerializer(obj.getClass())) == null) {
            return null;
        }
        try {
            return javaBeanSerializer.getFieldNames(obj);
        } catch (Exception e) {
            ukq.m196512a("evalKeySet error : ", this.path, e);
            return null;
        }
    }

    public int evalSize(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj);
        }
        int i = 0;
        if (obj instanceof Map) {
            Iterator it = ((Map) obj).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    i++;
                }
            }
            return i;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer == null) {
            return -1;
        }
        try {
            return javaBeanSerializer.getSize(obj);
        } catch (Exception e) {
            ukq.m196512a("evalSize error : ", this.path, e);
            return 0;
        }
    }

    public Object extract(DefaultJSONParser defaultJSONParser) {
        Object obj;
        if (defaultJSONParser == null) {
            return null;
        }
        init();
        if (this.hasRefSegment) {
            return eval(defaultJSONParser.parse());
        }
        if (this.segments.length == 0) {
            return defaultJSONParser.parse();
        }
        Context context = null;
        int i = 0;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return context.object;
            }
            Segment segment = segmentArr[i];
            boolean z = true;
            boolean z2 = i == segmentArr.length - 1;
            if (context == null || (obj = context.object) == null) {
                if (!z2) {
                    Segment segment2 = segmentArr[i + 1];
                    if ((!(segment instanceof PropertySegment) || !((PropertySegment) segment).deep || (!(segment2 instanceof ArrayAccessSegment) && !(segment2 instanceof MultiIndexSegment) && !(segment2 instanceof MultiPropertySegment) && !(segment2 instanceof SizeSegment) && !(segment2 instanceof PropertySegment) && !(segment2 instanceof FilterSegment))) && ((!(segment2 instanceof ArrayAccessSegment) || ((ArrayAccessSegment) segment2).index >= 0) && !(segment2 instanceof FilterSegment) && !(segment instanceof WildCardSegment))) {
                        z = false;
                    }
                }
                Context context2 = new Context(context, z);
                segment.extract(this, defaultJSONParser, context2);
                context = context2;
            } else {
                context.object = segment.eval(this, null, obj);
            }
            i++;
        }
    }

    public Object getArrayItem(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i >= 0) {
                if (i < list.size()) {
                    return list.get(i);
                }
                return null;
            }
            if (Math.abs(i) <= list.size()) {
                return list.get(list.size() + i);
            }
            return null;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i >= 0) {
                if (i < length) {
                    return Array.get(obj, i);
                }
                return null;
            }
            if (Math.abs(i) <= length) {
                return Array.get(obj, length + i);
            }
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i));
            return obj2 == null ? map.get(Integer.toString(i)) : obj2;
        }
        if (!(obj instanceof Collection)) {
            l710.m153113a();
            return null;
        }
        int i2 = 0;
        for (Object obj3 : (Collection) obj) {
            if (i2 == i) {
                return obj3;
            }
            i2++;
        }
        return null;
    }

    public JavaBeanDeserializer getJavaBeanDeserializer(Class<?> cls) {
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(cls);
        if (deserializer instanceof JavaBeanDeserializer) {
            return (JavaBeanDeserializer) deserializer;
        }
        return null;
    }

    public JavaBeanSerializer getJavaBeanSerializer(Class<?> cls) {
        ObjectSerializer objectWriter = this.serializeConfig.getObjectWriter(cls);
        if (objectWriter instanceof JavaBeanSerializer) {
            return (JavaBeanSerializer) objectWriter;
        }
        return null;
    }

    public String getPath() {
        return this.path;
    }

    public Object getPropertyValue(Object obj, String str, long j) {
        JSONArray jSONArray = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            try {
                obj = JSON.parseObject((String) obj);
            } catch (Exception unused) {
            }
        }
        Object obj2 = obj;
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(str);
            if (obj3 == null) {
                return (SIZE == j || LENGTH == j) ? Integer.valueOf(map.size()) : obj3;
            }
            return obj3;
        }
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj2.getClass());
        if (javaBeanSerializer != null) {
            try {
                return javaBeanSerializer.getFieldValue(obj2, str, j, false);
            } catch (Exception e) {
                tkq.m191589a(this.path, str, e);
                return null;
            }
        }
        int i = 0;
        if (obj2 instanceof List) {
            List list = (List) obj2;
            if (SIZE == j || LENGTH == j) {
                return Integer.valueOf(list.size());
            }
            while (i < list.size()) {
                Object obj4 = list.get(i);
                if (obj4 == list) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray(list.size());
                    }
                    jSONArray.add(obj4);
                } else {
                    Object propertyValue = getPropertyValue(obj4, str, j);
                    if (propertyValue instanceof Collection) {
                        Collection collection = (Collection) propertyValue;
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(list.size());
                        }
                        jSONArray.addAll(collection);
                    } else if (propertyValue != null) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(list.size());
                        }
                        jSONArray.add(propertyValue);
                    }
                }
                i++;
            }
            return jSONArray == null ? Collections.EMPTY_LIST : jSONArray;
        }
        if (obj2 instanceof Object[]) {
            Object[] objArr = (Object[]) obj2;
            if (SIZE == j || LENGTH == j) {
                return Integer.valueOf(objArr.length);
            }
            JSONArray jSONArray2 = new JSONArray(objArr.length);
            while (i < objArr.length) {
                Object[] objArr2 = objArr[i];
                if (objArr2 == objArr) {
                    jSONArray2.add(objArr2);
                } else {
                    Object propertyValue2 = getPropertyValue(objArr2, str, j);
                    if (propertyValue2 instanceof Collection) {
                        jSONArray2.addAll((Collection) propertyValue2);
                    } else if (propertyValue2 != null) {
                        jSONArray2.add(propertyValue2);
                    }
                }
                i++;
            }
            return jSONArray2;
        }
        if (obj2 instanceof Enum) {
            Enum r8 = (Enum) obj2;
            if (-4270347329889690746L == j) {
                return r8.name();
            }
            if (-1014497654951707614L == j) {
                return Integer.valueOf(r8.ordinal());
            }
        }
        if (obj2 instanceof Calendar) {
            Calendar calendar = (Calendar) obj2;
            if (8963398325558730460L == j) {
                return Integer.valueOf(calendar.get(1));
            }
            if (-811277319855450459L == j) {
                return Integer.valueOf(calendar.get(2));
            }
            if (-3851359326990528739L == j) {
                return Integer.valueOf(calendar.get(5));
            }
            if (4647432019745535567L == j) {
                return Integer.valueOf(calendar.get(11));
            }
            if (6607618197526598121L == j) {
                return Integer.valueOf(calendar.get(12));
            }
            if (-6586085717218287427L == j) {
                return Integer.valueOf(calendar.get(13));
            }
        }
        return null;
    }

    public Collection<Object> getPropertyValues(Object obj) {
        JavaBeanSerializer javaBeanSerializer = getJavaBeanSerializer(obj.getClass());
        if (javaBeanSerializer != null) {
            try {
                return javaBeanSerializer.getFieldValues(obj);
            } catch (Exception e) {
                ukq.m196512a("jsonpath error, path ", this.path, e);
                return null;
            }
        }
        if (obj instanceof Map) {
            return ((Map) obj).values();
        }
        if (obj instanceof Collection) {
            return (Collection) obj;
        }
        l710.m153113a();
        return null;
    }

    public void init() {
        if (this.segments != null) {
            return;
        }
        if ("*".equals(this.path)) {
            this.segments = new Segment[]{WildCardSegment.instance};
            return;
        }
        JSONPathParser jSONPathParser = new JSONPathParser(this.path);
        this.segments = jSONPathParser.explain();
        this.hasRefSegment = jSONPathParser.hasRefSegment;
    }

    public Set<?> keySet(Object obj) {
        if (obj == null) {
            return null;
        }
        init();
        int i = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return evalKeySet(objEval);
            }
            objEval = segmentArr[i].eval(this, obj, objEval);
            i++;
        }
    }

    public boolean remove(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        init();
        Segment[] segmentArr = this.segments;
        Segment segment = segmentArr[segmentArr.length - 1];
        Object objEval = obj;
        int i = 0;
        while (true) {
            Segment[] segmentArr2 = this.segments;
            if (i < segmentArr2.length) {
                if (i == segmentArr2.length - 1) {
                    break;
                }
                Segment segment2 = segmentArr2[i];
                if (i == segmentArr2.length - 2 && (segment instanceof FilterSegment) && (segment2 instanceof PropertySegment)) {
                    FilterSegment filterSegment = (FilterSegment) segment;
                    if (objEval instanceof List) {
                        PropertySegment propertySegment = (PropertySegment) segment2;
                        Iterator it = ((List) objEval).iterator();
                        while (it.hasNext()) {
                            Object objEval2 = propertySegment.eval(this, obj, it.next());
                            if (objEval2 instanceof Iterable) {
                                filterSegment.remove(this, obj, objEval2);
                            } else if ((objEval2 instanceof Map) && filterSegment.filter.apply(this, obj, objEval, objEval2)) {
                                it.remove();
                            }
                        }
                        return true;
                    }
                    if (objEval instanceof Map) {
                        PropertySegment propertySegment2 = (PropertySegment) segment2;
                        Object objEval3 = propertySegment2.eval(this, obj, objEval);
                        if (objEval3 == null) {
                            return false;
                        }
                        if ((objEval3 instanceof Map) && filterSegment.filter.apply(this, obj, objEval, objEval3)) {
                            propertySegment2.remove(this, objEval);
                            return true;
                        }
                    }
                }
                objEval = segment2.eval(this, obj, objEval);
                if (objEval != null) {
                    i++;
                }
            }
            objEval = null;
            break;
        }
        if (objEval == null) {
            return false;
        }
        if (!(segment instanceof PropertySegment)) {
            if (segment instanceof ArrayAccessSegment) {
                return ((ArrayAccessSegment) segment).remove(this, objEval);
            }
            if (segment instanceof FilterSegment) {
                return ((FilterSegment) segment).remove(this, obj, objEval);
            }
            l710.m153113a();
            return false;
        }
        PropertySegment propertySegment3 = (PropertySegment) segment;
        if (objEval instanceof Collection) {
            Segment[] segmentArr3 = this.segments;
            if (segmentArr3.length > 1) {
                Segment segment3 = segmentArr3[segmentArr3.length - 2];
                if ((segment3 instanceof RangeSegment) || (segment3 instanceof MultiIndexSegment)) {
                    Iterator it2 = ((Collection) objEval).iterator();
                    while (it2.hasNext()) {
                        if (propertySegment3.remove(this, it2.next())) {
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return propertySegment3.remove(this, objEval);
    }

    public boolean removeArrayItem(JSONPath jSONPath, Object obj, int i) {
        if (!(obj instanceof List)) {
            throw new JSONPathException("unsupported set operation." + obj.getClass());
        }
        List list = (List) obj;
        if (i >= 0) {
            if (i >= list.size()) {
                return false;
            }
            list.remove(i);
            return true;
        }
        int size = list.size() + i;
        if (size < 0) {
            return false;
        }
        list.remove(size);
        return true;
    }

    public boolean removePropertyValue(Object obj, String str, boolean z) {
        boolean z2 = true;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            z2 = map.remove(str) != null;
            if (z) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    removePropertyValue(it.next(), str, z);
                }
            }
            return z2;
        }
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(obj.getClass());
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (javaBeanDeserializer == null) {
            if (z) {
                return false;
            }
            l710.m153113a();
            return false;
        }
        FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(str);
        if (fieldDeserializer != null) {
            fieldDeserializer.setValue(obj, (String) null);
        } else {
            z2 = false;
        }
        if (z) {
            for (Object obj2 : getPropertyValues(obj)) {
                if (obj2 != null) {
                    removePropertyValue(obj2, str, z);
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    public boolean set(Object obj, Object obj2, boolean z) {
        Class<?> cls;
        JavaBeanDeserializer javaBeanDeserializer;
        if (obj == null) {
            return false;
        }
        init();
        Object obj3 = obj;
        int i = 0;
        Object obj4 = null;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                obj3 = obj4;
                break;
            }
            Segment segment = segmentArr[i];
            Object objEval = segment.eval(this, obj, obj3);
            if (objEval == null) {
                Segment[] segmentArr2 = this.segments;
                Segment segment2 = i < segmentArr2.length - 1 ? segmentArr2[i + 1] : null;
                if (segment2 instanceof PropertySegment) {
                    if (segment instanceof PropertySegment) {
                        String str = ((PropertySegment) segment).propertyName;
                        JavaBeanDeserializer javaBeanDeserializer2 = getJavaBeanDeserializer(obj3.getClass());
                        if (javaBeanDeserializer2 != null) {
                            cls = javaBeanDeserializer2.getFieldDeserializer(str).fieldInfo.fieldClass;
                            javaBeanDeserializer = getJavaBeanDeserializer(cls);
                        } else {
                            cls = null;
                            javaBeanDeserializer = null;
                        }
                    } else {
                        cls = null;
                        javaBeanDeserializer = null;
                    }
                    if (javaBeanDeserializer == null) {
                        objEval = new JSONObject();
                    } else {
                        if (javaBeanDeserializer.beanInfo.defaultConstructor == null) {
                            return false;
                        }
                        objEval = javaBeanDeserializer.createInstance((DefaultJSONParser) null, cls);
                    }
                } else {
                    objEval = segment2 instanceof ArrayAccessSegment ? new JSONArray() : null;
                }
                if (objEval != null) {
                    if (!(segment instanceof PropertySegment)) {
                        if (!(segment instanceof ArrayAccessSegment)) {
                            break;
                        }
                        ((ArrayAccessSegment) segment).setValue(this, obj3, objEval);
                    } else {
                        ((PropertySegment) segment).setValue(this, obj3, objEval);
                    }
                } else {
                    break;
                }
            }
            i++;
            obj4 = obj3;
            obj3 = objEval;
        }
        if (obj3 == null) {
            return false;
        }
        Segment[] segmentArr3 = this.segments;
        Segment segment3 = segmentArr3[segmentArr3.length - 1];
        if (segment3 instanceof PropertySegment) {
            ((PropertySegment) segment3).setValue(this, obj3, obj2);
            return true;
        }
        if (segment3 instanceof ArrayAccessSegment) {
            return ((ArrayAccessSegment) segment3).setValue(this, obj3, obj2);
        }
        l710.m153113a();
        return false;
    }

    public boolean setArrayItem(JSONPath jSONPath, Object obj, int i, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i >= 0) {
                list.set(i, obj2);
            } else {
                list.set(list.size() + i, obj2);
            }
            return true;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new JSONPathException("unsupported set operation." + cls);
        }
        int length = Array.getLength(obj);
        if (i >= 0) {
            if (i < length) {
                Array.set(obj, i, obj2);
            }
        } else if (Math.abs(i) <= length) {
            Array.set(obj, length + i, obj2);
        }
        return true;
    }

    public boolean setPropertyValue(Object obj, String str, long j, Object obj2) {
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return true;
        }
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                if (obj3 != null) {
                    setPropertyValue(obj3, str, j, obj2);
                }
            }
            return true;
        }
        ObjectDeserializer deserializer = this.parserConfig.getDeserializer(obj.getClass());
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (javaBeanDeserializer == null) {
            l710.m153113a();
            return false;
        }
        FieldDeserializer fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(j);
        if (fieldDeserializer == null) {
            return false;
        }
        fieldDeserializer.setValue(obj, obj2);
        return true;
    }

    public int size(Object obj) {
        if (obj == null) {
            return -1;
        }
        init();
        int i = 0;
        Object objEval = obj;
        while (true) {
            Segment[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return evalSize(objEval);
            }
            objEval = segmentArr[i].eval(this, obj, objEval);
            i++;
        }
    }

    @Override // com.alibaba.fastjson.JSONAware
    public String toJSONString() {
        return JSON.toJSONString(this.path);
    }

    public static Object eval(Object obj, String str) {
        return compile(str).eval(obj);
    }

    public JSONPath(String str) {
        this(str, SerializeConfig.getGlobalInstance(), ParserConfig.getGlobalInstance());
    }

    public static Set<?> keySet(Object obj, String str) {
        JSONPath jSONPathCompile = compile(str);
        return jSONPathCompile.evalKeySet(jSONPathCompile.eval(obj));
    }

    public static int size(Object obj, String str) {
        JSONPath jSONPathCompile = compile(str);
        return jSONPathCompile.evalSize(jSONPathCompile.eval(obj));
    }

    public static boolean contains(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        return compile(str).contains(obj);
    }

    public static boolean containsValue(Object obj, String str, Object obj2) {
        return compile(str).containsValue(obj, obj2);
    }

    public static void arrayAdd(Object obj, String str, Object... objArr) {
        compile(str).arrayAdd(obj, objArr);
    }

    public static Object extract(String str, String str2, ParserConfig parserConfig, int i, Feature... featureArr) {
        DefaultJSONParser defaultJSONParser = new DefaultJSONParser(str, parserConfig, i | Feature.OrderedField.mask);
        Object objExtract = compile(str2).extract(defaultJSONParser);
        defaultJSONParser.lexer.close();
        return objExtract;
    }

    public static Object extract(String str, String str2) {
        return extract(str, str2, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
    }

    public boolean set(Object obj, Object obj2) {
        return set(obj, obj2, true);
    }

    public static boolean set(Object obj, String str, Object obj2) {
        return compile(str).set(obj, obj2);
    }

    public static boolean remove(Object obj, String str) {
        return compile(str).remove(obj);
    }

    public static Map<String, Object> paths(Object obj, SerializeConfig serializeConfig) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        HashMap map = new HashMap();
        paths(identityHashMap, map, "/", obj, serializeConfig);
        return map;
    }

    public static Map<String, Object> paths(Object obj) {
        return paths(obj, SerializeConfig.globalInstance);
    }
}
