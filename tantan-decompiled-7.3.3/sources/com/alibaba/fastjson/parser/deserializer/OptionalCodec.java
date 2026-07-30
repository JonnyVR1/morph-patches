package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import p153l.wkq;

/* JADX INFO: loaded from: classes.dex */
public class OptionalCodec implements ObjectSerializer, ObjectDeserializer {
    public static OptionalCodec instance = new OptionalCodec();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        if (type == OptionalInt.class) {
            Integer numCastToInt = TypeUtils.castToInt(defaultJSONParser.parseObject((Class) Integer.class));
            return numCastToInt == null ? (T) OptionalInt.empty() : (T) OptionalInt.of(numCastToInt.intValue());
        }
        if (type == OptionalLong.class) {
            Long lCastToLong = TypeUtils.castToLong(defaultJSONParser.parseObject((Class) Long.class));
            return lCastToLong == null ? (T) OptionalLong.empty() : (T) OptionalLong.of(lCastToLong.longValue());
        }
        if (type == OptionalDouble.class) {
            Double dCastToDouble = TypeUtils.castToDouble(defaultJSONParser.parseObject((Class) Double.class));
            return dCastToDouble == null ? (T) OptionalDouble.empty() : (T) OptionalDouble.of(dCastToDouble.doubleValue());
        }
        Object object = defaultJSONParser.parseObject(TypeUtils.unwrapOptional(type));
        return object == null ? (T) Optional.empty() : (T) Optional.of(object);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        if (obj == null) {
            jSONSerializer.writeNull();
            return;
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            jSONSerializer.write(optional.isPresent() ? optional.get() : null);
            return;
        }
        if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            if (optionalDouble.isPresent()) {
                jSONSerializer.write(Double.valueOf(optionalDouble.getAsDouble()));
                return;
            } else {
                jSONSerializer.writeNull();
                return;
            }
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            if (optionalInt.isPresent()) {
                jSONSerializer.out.writeInt(optionalInt.getAsInt());
                return;
            } else {
                jSONSerializer.writeNull();
                return;
            }
        }
        if (!(obj instanceof OptionalLong)) {
            wkq.m206856a("not support optional : ", obj.getClass());
            return;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (optionalLong.isPresent()) {
            jSONSerializer.out.writeLong(optionalLong.getAsLong());
        } else {
            jSONSerializer.writeNull();
        }
    }
}
