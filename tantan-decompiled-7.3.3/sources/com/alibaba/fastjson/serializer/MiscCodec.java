package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import p153l.okq;
import p153l.qkq;
import p153l.rkq;

/* JADX INFO: loaded from: classes.dex */
public class MiscCodec implements ObjectSerializer, ObjectDeserializer {
    private static Method method_paths_get;
    public static final MiscCodec instance = new MiscCodec();
    private static boolean method_paths_get_error = false;
    private static boolean FILE_RELATIVE_PATH_SUPPORT = "true".equals(IOUtils.getStringProperty("fastjson.deserializer.fileRelativePathSupport"));

    private static String toString(Node node) {
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            DOMSource dOMSource = new DOMSource(node);
            StringWriter stringWriter = new StringWriter();
            transformerNewTransformer.transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (TransformerException e) {
            okq.m168043a("xml node to string error", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v35, types: [T, java.text.DateFormat, java.text.SimpleDateFormat] */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        Object obj2;
        String str;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = 0;
        if (type != InetSocketAddress.class) {
            if (defaultJSONParser.resolveStatus == 2) {
                defaultJSONParser.resolveStatus = 0;
                defaultJSONParser.accept(16);
                if (jSONLexer.token() != 4) {
                    qkq.m176968a("syntax error");
                    return null;
                }
                if (!"val".equals(jSONLexer.stringVal())) {
                    qkq.m176968a("syntax error");
                    return null;
                }
                jSONLexer.nextToken();
                defaultJSONParser.accept(17);
                obj2 = defaultJSONParser.parse();
                defaultJSONParser.accept(13);
            } else {
                obj2 = defaultJSONParser.parse();
            }
            if (obj2 == null) {
                str = null;
            } else {
                if (!(obj2 instanceof String)) {
                    if (!(obj2 instanceof JSONObject)) {
                        qkq.m176968a("expect string");
                        return null;
                    }
                    JSONObject jSONObject = (JSONObject) obj2;
                    if (type == Currency.class) {
                        String string = jSONObject.getString(FirebaseAnalytics.Param.CURRENCY);
                        if (string != null) {
                            return (T) Currency.getInstance(string);
                        }
                        String string2 = jSONObject.getString(AppsFlyerProperties.CURRENCY_CODE);
                        if (string2 != null) {
                            return (T) Currency.getInstance(string2);
                        }
                    }
                    return type == Map.Entry.class ? (T) jSONObject.entrySet().iterator().next() : (T) jSONObject.toJavaObject(type);
                }
                str = (String) obj2;
            }
            if (str != null && str.length() != 0) {
                if (type == UUID.class) {
                    return (T) UUID.fromString(str);
                }
                if (type == URI.class) {
                    return (T) URI.create(str);
                }
                if (type == URL.class) {
                    try {
                        return (T) new URL(str);
                    } catch (MalformedURLException e) {
                        okq.m168043a("create url error", e);
                        return null;
                    }
                }
                if (type == Pattern.class) {
                    return (T) Pattern.compile(str);
                }
                if (type == Locale.class) {
                    return (T) TypeUtils.toLocale(str);
                }
                if (type == SimpleDateFormat.class) {
                    ?? r8 = (T) new SimpleDateFormat(str, jSONLexer.getLocale());
                    r8.setTimeZone(jSONLexer.getTimeZone());
                    return r8;
                }
                if (type != InetAddress.class && type != Inet4Address.class && type != Inet6Address.class) {
                    if (type == File.class) {
                        if (str.indexOf("..") < 0 || FILE_RELATIVE_PATH_SUPPORT) {
                            return (T) new File(str);
                        }
                        qkq.m176968a("file relative path not support.");
                        return null;
                    }
                    if (type == TimeZone.class) {
                        return (T) TimeZone.getTimeZone(str);
                    }
                    if (type instanceof ParameterizedType) {
                        type = ((ParameterizedType) type).getRawType();
                    }
                    if (type == Class.class) {
                        return (T) TypeUtils.loadClass(str, defaultJSONParser.getConfig().getDefaultClassLoader(), false);
                    }
                    if (type == Charset.class) {
                        return (T) Charset.forName(str);
                    }
                    if (type == Currency.class) {
                        return (T) Currency.getInstance(str);
                    }
                    if (type == JSONPath.class) {
                        return (T) new JSONPath(str);
                    }
                    if (!(type instanceof Class)) {
                        throw new JSONException("MiscCodec not support " + type.toString());
                    }
                    String name = ((Class) type).getName();
                    if (name.equals("java.nio.file.Path")) {
                        try {
                            if (method_paths_get == null && !method_paths_get_error) {
                                method_paths_get = TypeUtils.loadClass("java.nio.file.Paths").getMethod("get", String.class, String[].class);
                            }
                            Method method = method_paths_get;
                            if (method != null) {
                                return (T) method.invoke(null, str, new String[0]);
                            }
                            throw new JSONException("Path deserialize erorr");
                        } catch (IllegalAccessException e2) {
                            okq.m168043a("Path deserialize erorr", e2);
                            return null;
                        } catch (NoSuchMethodException unused) {
                            method_paths_get_error = true;
                        } catch (InvocationTargetException e3) {
                            okq.m168043a("Path deserialize erorr", e3);
                            return null;
                        }
                    }
                    qkq.m176968a("MiscCodec not support ".concat(name));
                    return null;
                }
                try {
                    return (T) InetAddress.getByName(str);
                } catch (UnknownHostException e4) {
                    okq.m168043a("deserialize inet adress error", e4);
                }
            }
            return null;
        }
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        defaultJSONParser.accept(12);
        InetAddress inetAddress = null;
        while (true) {
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(17);
            if (strStringVal.equals(PlaceTypes.ADDRESS)) {
                defaultJSONParser.accept(17);
                inetAddress = (InetAddress) defaultJSONParser.parseObject((Class) InetAddress.class);
            } else if (strStringVal.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)) {
                defaultJSONParser.accept(17);
                if (jSONLexer.token() != 2) {
                    qkq.m176968a("port is not int");
                    return null;
                }
                int iIntValue = jSONLexer.intValue();
                jSONLexer.nextToken();
                i = iIntValue;
            } else {
                defaultJSONParser.accept(17);
                defaultJSONParser.parse();
            }
            if (jSONLexer.token() != 16) {
                defaultJSONParser.accept(13);
                return (T) new InetSocketAddress(inetAddress, i);
            }
            jSONLexer.nextToken();
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        String string;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == SimpleDateFormat.class) {
            string = ((SimpleDateFormat) obj).toPattern();
            if (serializeWriter.isEnabled(SerializerFeature.WriteClassName) && obj.getClass() != type) {
                serializeWriter.write(123);
                serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY);
                jSONSerializer.write(obj.getClass().getName());
                serializeWriter.writeFieldValue(',', "val", string);
                serializeWriter.write(125);
                return;
            }
        } else if (cls == Class.class) {
            string = ((Class) obj).getName();
        } else {
            if (cls == InetSocketAddress.class) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                InetAddress address = inetSocketAddress.getAddress();
                serializeWriter.write(123);
                if (address != null) {
                    serializeWriter.writeFieldName(PlaceTypes.ADDRESS);
                    jSONSerializer.write(address);
                    serializeWriter.write(44);
                }
                serializeWriter.writeFieldName(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                serializeWriter.writeInt(inetSocketAddress.getPort());
                serializeWriter.write(125);
                return;
            }
            if (obj instanceof File) {
                string = ((File) obj).getPath();
            } else if (obj instanceof InetAddress) {
                string = ((InetAddress) obj).getHostAddress();
            } else if (obj instanceof TimeZone) {
                string = ((TimeZone) obj).getID();
            } else if (obj instanceof Currency) {
                string = ((Currency) obj).getCurrencyCode();
            } else {
                if (obj instanceof JSONStreamAware) {
                    ((JSONStreamAware) obj).writeJSONString(serializeWriter);
                    return;
                }
                if (obj instanceof Iterator) {
                    writeIterator(jSONSerializer, serializeWriter, (Iterator) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    writeIterator(jSONSerializer, serializeWriter, ((Iterable) obj).iterator());
                    return;
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        String str = (String) key;
                        if (value instanceof String) {
                            serializeWriter.writeFieldValueStringWithDoubleQuoteCheck('{', str, (String) value);
                        } else {
                            serializeWriter.write(123);
                            serializeWriter.writeFieldName(str);
                            jSONSerializer.write(value);
                        }
                    } else {
                        serializeWriter.write(123);
                        jSONSerializer.write(key);
                        serializeWriter.write(58);
                        jSONSerializer.write(value);
                    }
                    serializeWriter.write(125);
                    return;
                }
                if (obj.getClass().getName().equals("net.sf.json.JSONNull")) {
                    serializeWriter.writeNull();
                    return;
                } else {
                    if (!(obj instanceof Node)) {
                        rkq.m181878a("not support class : ", cls);
                        return;
                    }
                    string = toString((Node) obj);
                }
            }
        }
        serializeWriter.writeString(string);
    }

    public void writeIterator(JSONSerializer jSONSerializer, SerializeWriter serializeWriter, Iterator<?> it) {
        serializeWriter.write(91);
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                serializeWriter.write(44);
            }
            jSONSerializer.write(it.next());
            i++;
        }
        serializeWriter.write(93);
    }
}
