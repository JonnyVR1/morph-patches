package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import p149l.j6f;
import p149l.piq;

/* JADX INFO: loaded from: classes.dex */
public class JSONSerializer extends SerializeFilterable {
    protected final SerializeConfig config;
    protected SerialContext context;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private String indent;
    private int indentCount;
    protected Locale locale;
    public final SerializeWriter out;
    protected IdentityHashMap<Object, SerialContext> references;
    protected TimeZone timeZone;

    public JSONSerializer(SerializeWriter serializeWriter, SerializeConfig serializeConfig) {
        this.indentCount = 0;
        this.indent = "\t";
        this.references = null;
        this.timeZone = JSON.defaultTimeZone;
        this.locale = JSON.defaultLocale;
        this.out = serializeWriter;
        this.config = serializeConfig;
    }

    public static void write(Writer writer, Object obj) {
        SerializeWriter serializeWriter = new SerializeWriter();
        try {
            try {
                new JSONSerializer(serializeWriter).write(obj);
                serializeWriter.writeTo(writer);
                serializeWriter.close();
            } catch (IOException e) {
                throw new JSONException(e.getMessage(), e);
            }
        } catch (Throwable th) {
            serializeWriter.close();
            throw th;
        }
    }

    public boolean checkValue(SerializeFilterable serializeFilterable) {
        List<ValueFilter> list = this.valueFilters;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<ContextValueFilter> list2 = this.contextValueFilters;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<ValueFilter> list3 = serializeFilterable.valueFilters;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<ContextValueFilter> list4 = serializeFilterable.contextValueFilters;
        return (list4 != null && list4.size() > 0) || this.out.writeNonStringValueAsString;
    }

    public void close() {
        this.out.close();
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
        this.out.config(serializerFeature, z);
    }

    public boolean containsReference(Object obj) {
        SerialContext serialContext;
        IdentityHashMap<Object, SerialContext> identityHashMap = this.references;
        if (identityHashMap == null || (serialContext = identityHashMap.get(obj)) == null || obj == Collections.EMPTY_MAP) {
            return false;
        }
        Object obj2 = serialContext.fieldName;
        return obj2 == null || (obj2 instanceof Integer) || (obj2 instanceof String);
    }

    public void decrementIdent() {
        this.indentCount--;
    }

    public SerialContext getContext() {
        return this.context;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null && this.dateFormatPattern != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.locale);
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.timeZone);
        }
        return this.dateFormat;
    }

    public String getDateFormatPattern() {
        DateFormat dateFormat = this.dateFormat;
        return dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toPattern() : this.dateFormatPattern;
    }

    public int getIndentCount() {
        return this.indentCount;
    }

    public SerializeConfig getMapping() {
        return this.config;
    }

    public ObjectSerializer getObjectWriter(Class<?> cls) {
        return this.config.getObjectWriter(cls);
    }

    public SerializeWriter getWriter() {
        return this.out;
    }

    public boolean hasNameFilters(SerializeFilterable serializeFilterable) {
        List<NameFilter> list = this.nameFilters;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<NameFilter> list2 = serializeFilterable.nameFilters;
        return list2 != null && list2.size() > 0;
    }

    public boolean hasPropertyFilters(SerializeFilterable serializeFilterable) {
        List<PropertyFilter> list = this.propertyFilters;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<PropertyFilter> list2 = serializeFilterable.propertyFilters;
        return list2 != null && list2.size() > 0;
    }

    public void incrementIndent() {
        this.indentCount++;
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        return this.out.isEnabled(serializerFeature);
    }

    public final boolean isWriteClassName(Type type, Object obj) {
        if (!this.out.isEnabled(SerializerFeature.WriteClassName)) {
            return false;
        }
        if (type != null || !this.out.isEnabled(SerializerFeature.NotWriteRootClassName)) {
            return true;
        }
        SerialContext serialContext = this.context;
        return (serialContext == null || serialContext.parent == null) ? false : true;
    }

    public void popContext() {
        SerialContext serialContext = this.context;
        if (serialContext != null) {
            this.context = serialContext.parent;
        }
    }

    public void println() {
        this.out.write(10);
        for (int i = 0; i < this.indentCount; i++) {
            this.out.write(this.indent);
        }
    }

    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i, int i2) {
        if (this.out.disableCircularReferenceDetect) {
            return;
        }
        this.context = new SerialContext(serialContext, obj, obj2, i, i2);
        if (this.references == null) {
            this.references = new IdentityHashMap<>();
        }
        this.references.put(obj, this.context);
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        if (this.dateFormatPattern != null) {
            this.dateFormatPattern = null;
        }
    }

    public String toString() {
        return this.out.toString();
    }

    public final void writeAs(Object obj, Class cls) {
        if (obj == null) {
            this.out.writeNull();
            return;
        }
        try {
            getObjectWriter(cls).write(this, obj, null, null, 0);
        } catch (IOException e) {
            piq.m169752a(e.getMessage(), e);
        }
    }

    public final void writeKeyValue(char c, String str, Object obj) {
        if (c != 0) {
            this.out.write(c);
        }
        this.out.writeFieldName(str);
        write(obj);
    }

    public void writeNull() {
        this.out.writeNull();
    }

    public void writeReference(Object obj) {
        SerialContext serialContext = this.context;
        if (obj == serialContext.object) {
            this.out.write("{\"$ref\":\"@\"}");
            return;
        }
        SerialContext serialContext2 = serialContext.parent;
        if (serialContext2 != null && obj == serialContext2.object) {
            this.out.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            SerialContext serialContext3 = serialContext.parent;
            if (serialContext3 == null) {
                break;
            } else {
                serialContext = serialContext3;
            }
        }
        Object obj2 = serialContext.object;
        SerializeWriter serializeWriter = this.out;
        if (obj == obj2) {
            serializeWriter.write("{\"$ref\":\"$\"}");
            return;
        }
        serializeWriter.write("{\"$ref\":\"");
        this.out.write(this.references.get(obj).toString());
        this.out.write("\"}");
    }

    public final void writeWithFieldName(Object obj, Object obj2, Type type, int i) {
        try {
            if (obj == null) {
                this.out.writeNull();
            } else {
                getObjectWriter(obj.getClass()).write(this, obj, obj2, type, i);
            }
        } catch (IOException e) {
            piq.m169752a(e.getMessage(), e);
        }
    }

    public final void writeWithFormat(Object obj, String str) {
        if (obj instanceof Date) {
            if ("unixtime".equals(str)) {
                this.out.writeInt((int) (((Date) obj).getTime() / 1000));
                return;
            }
            if ("millis".equals(str)) {
                this.out.writeLong(((Date) obj).getTime());
                return;
            }
            DateFormat dateFormat = getDateFormat();
            if (dateFormat == null) {
                try {
                    dateFormat = new SimpleDateFormat(str, this.locale);
                } catch (IllegalArgumentException unused) {
                    dateFormat = new SimpleDateFormat(str.replaceAll(j6f.GPS_DIRECTION_TRUE, "'T'"), this.locale);
                }
                dateFormat.setTimeZone(this.timeZone);
            }
            this.out.writeString(dateFormat.format((Date) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof Collection)) {
                write(obj);
                return;
            }
            Collection collection = (Collection) obj;
            Iterator it = collection.iterator();
            this.out.write(91);
            for (int i = 0; i < collection.size(); i++) {
                Object next = it.next();
                if (i != 0) {
                    this.out.write(44);
                }
                writeWithFormat(next, str);
            }
            this.out.write(93);
            return;
        }
        byte[] bArr = (byte[]) obj;
        if (!HttpHeaderValues.GZIP.equals(str) && !"gzip,base64".equals(str)) {
            boolean zEquals = "hex".equals(str);
            SerializeWriter serializeWriter = this.out;
            if (zEquals) {
                serializeWriter.writeHex(bArr);
                return;
            } else {
                serializeWriter.writeByteArray(bArr);
                return;
            }
        }
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                this.out.writeByteArray(byteArrayOutputStream.toByteArray());
                IOUtils.close(gZIPOutputStream);
            } catch (IOException e) {
                throw new JSONException("write gzipBytes error", e);
            }
        } catch (Throwable th) {
            IOUtils.close(gZIPOutputStream);
            throw th;
        }
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        if (this.dateFormat != null) {
            this.dateFormat = null;
        }
    }

    public JSONSerializer(SerializeWriter serializeWriter) {
        this(serializeWriter, SerializeConfig.getGlobalInstance());
    }

    public JSONSerializer(SerializeConfig serializeConfig) {
        this(new SerializeWriter(), serializeConfig);
    }

    public JSONSerializer() {
        this(new SerializeWriter(), SerializeConfig.getGlobalInstance());
    }

    public final void writeWithFieldName(Object obj, Object obj2) {
        writeWithFieldName(obj, obj2, null, 0);
    }

    public static void write(SerializeWriter serializeWriter, Object obj) {
        new JSONSerializer(serializeWriter).write(obj);
    }

    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i) {
        setContext(serialContext, obj, obj2, i, 0);
    }

    public void setContext(SerialContext serialContext) {
        this.context = serialContext;
    }

    public final void write(Object obj) {
        if (obj == null) {
            this.out.writeNull();
            return;
        }
        try {
            getObjectWriter(obj.getClass()).write(this, obj, null, null, 0);
        } catch (IOException e) {
            piq.m169752a(e.getMessage(), e);
        }
    }

    public void setContext(Object obj, Object obj2) {
        setContext(this.context, obj, obj2, 0);
    }

    public final void write(String str) {
        StringCodec.instance.write(this, str);
    }
}
