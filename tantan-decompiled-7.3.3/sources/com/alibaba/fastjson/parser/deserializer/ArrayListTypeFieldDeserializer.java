package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ArrayListTypeFieldDeserializer extends FieldDeserializer {
    private ObjectDeserializer deserializer;
    private int itemFastMatchToken;
    private final Type itemType;

    public ArrayListTypeFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        super(cls, fieldInfo);
        Type type = fieldInfo.fieldType;
        if (!(type instanceof ParameterizedType)) {
            this.itemType = Object.class;
            return;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            if (upperBounds.length == 1) {
                type2 = upperBounds[0];
            }
        }
        this.itemType = type2;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public int getFastMatchToken() {
        return 14;
    }

    public final void parseArray(DefaultJSONParser defaultJSONParser, Type type, Collection collection) {
        Class cls;
        int i;
        Type parameterizedTypeImpl;
        int i2;
        Type type2 = this.itemType;
        ObjectDeserializer deserializer = this.deserializer;
        int i3 = 0;
        if (type instanceof ParameterizedType) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type2;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls == null) {
                    i2 = -1;
                    break;
                }
                int length = cls.getTypeParameters().length;
                i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (cls.getTypeParameters()[i2].getName().equals(typeVariable.getName())) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    parameterizedTypeImpl = parameterizedType.getActualTypeArguments()[i2];
                    if (!parameterizedTypeImpl.equals(this.itemType)) {
                        deserializer = defaultJSONParser.getConfig().getDeserializer(parameterizedTypeImpl);
                    }
                    type2 = parameterizedTypeImpl;
                }
            } else if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type3 = actualTypeArguments[0];
                    if (type3 instanceof TypeVariable) {
                        TypeVariable typeVariable2 = (TypeVariable) type3;
                        ParameterizedType parameterizedType3 = (ParameterizedType) type;
                        cls = parameterizedType3.getRawType() instanceof Class ? (Class) parameterizedType3.getRawType() : null;
                        if (cls == null) {
                            i = -1;
                            break;
                        }
                        int length2 = cls.getTypeParameters().length;
                        i = 0;
                        while (true) {
                            if (i >= length2) {
                                i = -1;
                                break;
                            } else if (cls.getTypeParameters()[i].getName().equals(typeVariable2.getName())) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i != -1) {
                            actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i];
                            parameterizedTypeImpl = new ParameterizedTypeImpl(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                            type2 = parameterizedTypeImpl;
                        }
                    }
                }
            }
        } else if ((type2 instanceof TypeVariable) && (type instanceof Class)) {
            Class cls2 = (Class) type;
            TypeVariable typeVariable3 = (TypeVariable) type2;
            cls2.getTypeParameters();
            int length3 = cls2.getTypeParameters().length;
            for (int i4 = 0; i4 < length3; i4++) {
                TypeVariable typeVariable4 = cls2.getTypeParameters()[i4];
                if (typeVariable4.getName().equals(typeVariable3.getName())) {
                    Type[] bounds = typeVariable4.getBounds();
                    if (bounds.length != 1) {
                        break;
                    }
                    type2 = bounds[0];
                    break;
                }
            }
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() != 14) {
            if (deserializer == null) {
                deserializer = defaultJSONParser.getConfig().getDeserializer(type2);
                this.deserializer = deserializer;
            }
            collection.add(deserializer.deserialze(defaultJSONParser, type2, 0));
            defaultJSONParser.checkListResolve(collection);
            return;
        }
        if (deserializer == null) {
            deserializer = defaultJSONParser.getConfig().getDeserializer(type2);
            this.deserializer = deserializer;
            this.itemFastMatchToken = deserializer.getFastMatchToken();
        }
        ObjectDeserializer objectDeserializer = deserializer;
        jSONLexer.nextToken(this.itemFastMatchToken);
        while (true) {
            if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                while (jSONLexer.token() == 16) {
                    jSONLexer.nextToken();
                }
            }
            if (jSONLexer.token() == 15) {
                jSONLexer.nextToken(16);
                return;
            }
            collection.add(objectDeserializer.deserialze(defaultJSONParser, type2, Integer.valueOf(i3)));
            defaultJSONParser.checkListResolve(collection);
            if (jSONLexer.token() == 16) {
                jSONLexer.nextToken(this.itemFastMatchToken);
            }
            i3++;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        if (i == 8 || (i == 4 && jSONLexer.stringVal().length() == 0)) {
            setValue(obj, (String) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ParseContext context = defaultJSONParser.getContext();
        defaultJSONParser.setContext(context, obj, this.fieldInfo.name);
        parseArray(defaultJSONParser, type, arrayList);
        defaultJSONParser.setContext(context);
        if (obj == null) {
            map.put(this.fieldInfo.name, arrayList);
        } else {
            setValue(obj, arrayList);
        }
    }
}
