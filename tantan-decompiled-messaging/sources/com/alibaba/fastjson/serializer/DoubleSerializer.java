package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class DoubleSerializer implements ObjectSerializer {
    public static final DoubleSerializer instance = new DoubleSerializer();
    private DecimalFormat decimalFormat;

    public DoubleSerializer(String str) {
        this(new DecimalFormat(str));
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullNumberAsZero);
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
            serializeWriter.writeNull();
            return;
        }
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat == null) {
            serializeWriter.writeDouble(dDoubleValue, true);
        } else {
            serializeWriter.write(decimalFormat.format(dDoubleValue));
        }
    }

    public DoubleSerializer(DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public DoubleSerializer() {
        this.decimalFormat = null;
    }
}
