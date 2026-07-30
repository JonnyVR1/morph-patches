package org.eclipse.jetty.util.ajax;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class JSONPojoConvertor implements JSON.Convertor {
    public static final NumberType DOUBLE;
    public static final NumberType FLOAT;
    public static final NumberType INTEGER;
    public static final NumberType LONG;
    public static final NumberType SHORT;
    private static final Map<Class<?>, NumberType> __numberTypes;
    protected Set<String> _excluded;
    protected boolean _fromJSON;
    protected Map<String, Method> _getters;
    protected Class<?> _pojoClass;
    protected Map<String, Setter> _setters;
    private static final Logger LOG = Log.getLogger((Class<?>) JSONPojoConvertor.class);
    public static final Object[] GETTER_ARG = new Object[0];
    public static final Object[] NULL_ARG = {null};

    public interface NumberType {
        Object getActualValue(Number number);
    }

    public static class Setter {
        protected Class<?> _componentType;
        protected NumberType _numberType;
        protected String _propertyName;
        protected Method _setter;
        protected Class<?> _type;

        public Setter(String str, Method method) {
            this._propertyName = str;
            this._setter = method;
            this._type = method.getParameterTypes()[0];
            NumberType numberType = (NumberType) JSONPojoConvertor.__numberTypes.get(this._type);
            this._numberType = numberType;
            if (numberType == null && this._type.isArray()) {
                this._componentType = this._type.getComponentType();
                this._numberType = (NumberType) JSONPojoConvertor.__numberTypes.get(this._componentType);
            }
        }

        public Class<?> getComponentType() {
            return this._componentType;
        }

        public Method getMethod() {
            return this._setter;
        }

        public NumberType getNumberType() {
            return this._numberType;
        }

        public String getPropertyName() {
            return this._propertyName;
        }

        public Class<?> getType() {
            return this._type;
        }

        public void invoke(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (obj2 == null) {
                this._setter.invoke(obj, JSONPojoConvertor.NULL_ARG);
            } else {
                invokeObject(obj, obj2);
            }
        }

        public void invokeObject(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this._type.isEnum()) {
                boolean z = obj2 instanceof Enum;
                Method method = this._setter;
                if (z) {
                    method.invoke(obj, obj2);
                    return;
                } else {
                    method.invoke(obj, Enum.valueOf(this._type, obj2.toString()));
                    return;
                }
            }
            NumberType numberType = this._numberType;
            if (numberType != null && (obj2 instanceof Number)) {
                this._setter.invoke(obj, numberType.getActualValue((Number) obj2));
                return;
            }
            if (Character.TYPE.equals(this._type) || Character.class.equals(this._type)) {
                this._setter.invoke(obj, Character.valueOf(String.valueOf(obj2).charAt(0)));
                return;
            }
            if (this._componentType == null || !obj2.getClass().isArray()) {
                this._setter.invoke(obj, obj2);
                return;
            }
            if (this._numberType == null) {
                int length = Array.getLength(obj2);
                Object objNewInstance = Array.newInstance(this._componentType, length);
                try {
                    System.arraycopy(obj2, 0, objNewInstance, 0, length);
                    this._setter.invoke(obj, objNewInstance);
                    return;
                } catch (Exception e) {
                    JSONPojoConvertor.LOG.ignore(e);
                    this._setter.invoke(obj, obj2);
                    return;
                }
            }
            Object[] objArr = (Object[]) obj2;
            Object objNewInstance2 = Array.newInstance(this._componentType, objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                try {
                    Array.set(objNewInstance2, i, this._numberType.getActualValue((Number) objArr[i]));
                } catch (Exception e2) {
                    JSONPojoConvertor.LOG.ignore(e2);
                    this._setter.invoke(obj, obj2);
                    return;
                }
            }
            this._setter.invoke(obj, objNewInstance2);
        }

        public boolean isPropertyNumber() {
            return this._numberType != null;
        }
    }

    static {
        HashMap map = new HashMap();
        __numberTypes = map;
        NumberType numberType = new NumberType() { // from class: org.eclipse.jetty.util.ajax.JSONPojoConvertor.1
            @Override // org.eclipse.jetty.util.ajax.JSONPojoConvertor.NumberType
            public Object getActualValue(Number number) {
                return new Short(number.shortValue());
            }
        };
        SHORT = numberType;
        NumberType numberType2 = new NumberType() { // from class: org.eclipse.jetty.util.ajax.JSONPojoConvertor.2
            @Override // org.eclipse.jetty.util.ajax.JSONPojoConvertor.NumberType
            public Object getActualValue(Number number) {
                return new Integer(number.intValue());
            }
        };
        INTEGER = numberType2;
        NumberType numberType3 = new NumberType() { // from class: org.eclipse.jetty.util.ajax.JSONPojoConvertor.3
            @Override // org.eclipse.jetty.util.ajax.JSONPojoConvertor.NumberType
            public Object getActualValue(Number number) {
                return new Float(number.floatValue());
            }
        };
        FLOAT = numberType3;
        NumberType numberType4 = new NumberType() { // from class: org.eclipse.jetty.util.ajax.JSONPojoConvertor.4
            @Override // org.eclipse.jetty.util.ajax.JSONPojoConvertor.NumberType
            public Object getActualValue(Number number) {
                return number instanceof Long ? number : new Long(number.longValue());
            }
        };
        LONG = numberType4;
        NumberType numberType5 = new NumberType() { // from class: org.eclipse.jetty.util.ajax.JSONPojoConvertor.5
            @Override // org.eclipse.jetty.util.ajax.JSONPojoConvertor.NumberType
            public Object getActualValue(Number number) {
                return number instanceof Double ? number : new Double(number.doubleValue());
            }
        };
        DOUBLE = numberType5;
        map.put(Short.class, numberType);
        map.put(Short.TYPE, numberType);
        map.put(Integer.class, numberType2);
        map.put(Integer.TYPE, numberType2);
        map.put(Long.class, numberType4);
        map.put(Long.TYPE, numberType4);
        map.put(Float.class, numberType3);
        map.put(Float.TYPE, numberType3);
        map.put(Double.class, numberType5);
        map.put(Double.TYPE, numberType5);
    }

    public JSONPojoConvertor(Class<?> cls, Set<String> set, boolean z) {
        this._getters = new HashMap();
        this._setters = new HashMap();
        this._pojoClass = cls;
        this._excluded = set;
        this._fromJSON = z;
        init();
    }

    public static NumberType getNumberType(Class<?> cls) {
        return __numberTypes.get(cls);
    }

    public void addGetter(String str, Method method) {
        this._getters.put(str, method);
    }

    public void addSetter(String str, Method method) {
        this._setters.put(str, new Setter(str, method));
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public Object fromJSON(Map map) {
        try {
            Object objNewInstance = this._pojoClass.newInstance();
            setProps(objNewInstance, map);
            return objNewInstance;
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public int getExcludedCount() {
        Set<String> set = this._excluded;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public Setter getSetter(String str) {
        return this._setters.get(str);
    }

    public boolean includeField(String str, Method method) {
        Set<String> set = this._excluded;
        return set == null || !set.contains(str);
    }

    public void init() {
        String str;
        for (Method method : this._pojoClass.getMethods()) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                int length = method.getParameterTypes().length;
                if (length != 0) {
                    if (length == 1 && name.startsWith("set") && name.length() > 3) {
                        String str2 = name.substring(3, 4).toLowerCase(Locale.ENGLISH) + name.substring(4);
                        if (includeField(str2, method)) {
                            addSetter(str2, method);
                        }
                    }
                } else if (method.getReturnType() != null) {
                    if (name.startsWith("is") && name.length() > 2) {
                        str = name.substring(2, 3).toLowerCase(Locale.ENGLISH) + name.substring(3);
                    } else if (name.startsWith("get") && name.length() > 3) {
                        str = name.substring(3, 4).toLowerCase(Locale.ENGLISH) + name.substring(4);
                    }
                    if (includeField(str, method)) {
                        addGetter(str, method);
                    }
                }
            }
        }
    }

    public void log(Throwable th) {
        LOG.ignore(th);
    }

    public int setProps(Object obj, Map<?, ?> map) {
        int i = 0;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Setter setter = getSetter((String) entry.getKey());
            if (setter != null) {
                try {
                    setter.invoke(obj, entry.getValue());
                    i++;
                } catch (Exception e) {
                    LOG.warn(this._pojoClass.getName() + "#" + setter.getPropertyName() + " not set from " + entry.getValue().getClass().getName() + "=" + entry.getValue().toString(), new Object[0]);
                    log(e);
                }
            }
        }
        return i;
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public void toJSON(Object obj, JSON.Output output) {
        if (this._fromJSON) {
            output.addClass(this._pojoClass);
        }
        for (Map.Entry<String, Method> entry : this._getters.entrySet()) {
            try {
                output.add(entry.getKey(), entry.getValue().invoke(obj, GETTER_ARG));
            } catch (Exception e) {
                LOG.warn("{} property '{}' excluded. (errors)", this._pojoClass.getName(), entry.getKey());
                log(e);
            }
        }
    }

    public JSONPojoConvertor(Class<?> cls, String[] strArr) {
        this(cls, new HashSet(Arrays.asList(strArr)), true);
    }

    public JSONPojoConvertor(Class<?> cls, Set<String> set) {
        this(cls, set, true);
    }

    public JSONPojoConvertor(Class<?> cls) {
        this(cls, null, true);
    }

    public JSONPojoConvertor(Class<?> cls, boolean z) {
        this(cls, null, z);
    }
}
