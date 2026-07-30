package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JSONPDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec;
import com.alibaba.fastjson.parser.deserializer.MapDeserializer;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.OptionalCodec;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessable;
import com.alibaba.fastjson.parser.deserializer.PropertyProcessableDeserializer;
import com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer;
import com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer;
import com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer;
import com.alibaba.fastjson.parser.deserializer.TimeDeserializer;
import com.alibaba.fastjson.serializer.AtomicCodec;
import com.alibaba.fastjson.serializer.AwtCodec;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.BigIntegerCodec;
import com.alibaba.fastjson.serializer.BooleanCodec;
import com.alibaba.fastjson.serializer.ByteBufferCodec;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.CharArrayCodec;
import com.alibaba.fastjson.serializer.CharacterCodec;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.FloatCodec;
import com.alibaba.fastjson.serializer.GuavaCodec;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.JodaCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.ObjectArrayCodec;
import com.alibaba.fastjson.serializer.ReferenceCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.spi.Module;
import com.alibaba.fastjson.support.moneta.MonetaCodec;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ServiceLoader;
import com.alibaba.fastjson.util.TypeUtils;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import javax.sql.RowSet;
import javax.xml.datatype.XMLGregorianCalendar;
import p149l.k860;
import p149l.piq;
import p149l.riq;

/* JADX INFO: loaded from: classes.dex */
public class ParserConfig {
    public static final String AUTOTYPE_ACCEPT = "fastjson.parser.autoTypeAccept";
    private static final String[] AUTO_TYPE_ACCEPT_LIST;
    private static final long[] INTERNAL_WHITELIST_HASHCODES;
    private static boolean awtError;
    public static ParserConfig global;
    private static boolean guavaError;
    private static boolean jdk8Error;
    private static boolean jodaError;
    private long[] acceptHashCodes;
    private boolean asmEnable;
    protected ASMDeserializerFactory asmFactory;
    private boolean autoTypeSupport;
    public boolean compatibleWithJavaBean;
    protected ClassLoader defaultClassLoader;
    private long[] denyHashCodes;
    private final IdentityHashMap<Type, ObjectDeserializer> deserializers;
    public final boolean fieldBased;
    private boolean jacksonCompatible;
    private final IdentityHashMap<Type, IdentityHashMap<Type, ObjectDeserializer>> mixInDeserializers;
    private List<Module> modules;
    public PropertyNamingStrategy propertyNamingStrategy;
    public final SymbolTable symbolTable;
    private final ConcurrentMap<String, Class<?>> typeMapping;
    public static final String DENY_PROPERTY = "fastjson.parser.deny";
    public static final String[] DENYS = splitItemsFormProperty(IOUtils.getStringProperty(DENY_PROPERTY));
    public static final String AUTOTYPE_SUPPORT_PROPERTY = "fastjson.parser.autoTypeSupport";
    public static final boolean AUTO_SUPPORT = "true".equals(IOUtils.getStringProperty(AUTOTYPE_SUPPORT_PROPERTY));

    static {
        String[] strArrSplitItemsFormProperty = splitItemsFormProperty(IOUtils.getStringProperty(AUTOTYPE_ACCEPT));
        if (strArrSplitItemsFormProperty == null) {
            strArrSplitItemsFormProperty = new String[0];
        }
        AUTO_TYPE_ACCEPT_LIST = strArrSplitItemsFormProperty;
        String[] strArr = {"java.awt.Rectangle", "java.awt.Point", "java.awt.Font", "java.awt.Color", "com.alibaba.fastjson.util.AntiCollisionHashMap", "com.alipay.sofa.rpc.core.exception.SofaTimeOutException", "java.util.Collections.UnmodifiableMap", "java.util.concurrent.ConcurrentSkipListMap", "java.util.concurrent.ConcurrentSkipListSet", "org.springframework.dao.CannotAcquireLockException", "org.springframework.dao.CannotSerializeTransactionException", "org.springframework.dao.CleanupFailureDataAccessException", "org.springframework.dao.ConcurrencyFailureException", "org.springframework.dao.DataAccessResourceFailureException", "org.springframework.dao.DataIntegrityViolationException", "org.springframework.dao.DataRetrievalFailureException", "org.springframework.dao.DeadlockLoserDataAccessException", "org.springframework.dao.DuplicateKeyException", "org.springframework.dao.EmptyResultDataAccessException", "org.springframework.dao.IncorrectResultSizeDataAccessException", "org.springframework.dao.IncorrectUpdateSemanticsDataAccessException", "org.springframework.dao.InvalidDataAccessApiUsageException", "org.springframework.dao.InvalidDataAccessResourceUsageException", "org.springframework.dao.NonTransientDataAccessException", "org.springframework.dao.NonTransientDataAccessResourceException", "org.springframework.dao.OptimisticLockingFailureException", "org.springframework.dao.PermissionDeniedDataAccessException", "org.springframework.dao.PessimisticLockingFailureException", "org.springframework.dao.QueryTimeoutException", "org.springframework.dao.RecoverableDataAccessException", "org.springframework.dao.TransientDataAccessException", "org.springframework.dao.TransientDataAccessResourceException", "org.springframework.dao.TypeMismatchDataAccessException", "org.springframework.dao.UncategorizedDataAccessException", "org.springframework.jdbc.BadSqlGrammarException", "org.springframework.jdbc.CannotGetJdbcConnectionException", "org.springframework.jdbc.IncorrectResultSetColumnCountException", "org.springframework.jdbc.InvalidResultSetAccessException", "org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException", "org.springframework.jdbc.LobRetrievalFailureException", "org.springframework.jdbc.SQLWarningException", "org.springframework.jdbc.UncategorizedSQLException", "org.springframework.cache.support.NullValue", "org.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken", "org.springframework.security.oauth2.common.DefaultOAuth2AccessToken", "org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken", "org.springframework.util.LinkedMultiValueMap", "org.springframework.util.LinkedCaseInsensitiveMap", "org.springframework.remoting.support.RemoteInvocation", "org.springframework.remoting.support.RemoteInvocationResult", "org.springframework.security.web.savedrequest.DefaultSavedRequest", "org.springframework.security.web.savedrequest.SavedCookie", "org.springframework.security.web.csrf.DefaultCsrfToken", "org.springframework.security.web.authentication.WebAuthenticationDetails", "org.springframework.security.core.context.SecurityContextImpl", "org.springframework.security.authentication.UsernamePasswordAuthenticationToken", "org.springframework.security.core.authority.SimpleGrantedAuthority", "org.springframework.security.core.userdetails.User"};
        long[] jArr = new long[58];
        for (int i = 0; i < 58; i++) {
            jArr[i] = TypeUtils.fnv1a_64(strArr[i]);
        }
        Arrays.sort(jArr);
        INTERNAL_WHITELIST_HASHCODES = jArr;
        global = new ParserConfig();
        awtError = false;
        jdk8Error = false;
        jodaError = false;
        guavaError = false;
    }

    private ParserConfig(ASMDeserializerFactory aSMDeserializerFactory, ClassLoader classLoader, boolean z) {
        this.deserializers = new IdentityHashMap<>();
        this.mixInDeserializers = new IdentityHashMap<>(16);
        this.typeMapping = new ConcurrentHashMap(16, 0.75f, 1);
        this.asmEnable = !ASMUtils.IS_ANDROID;
        this.symbolTable = new SymbolTable(4096);
        this.autoTypeSupport = AUTO_SUPPORT;
        this.jacksonCompatible = false;
        this.compatibleWithJavaBean = TypeUtils.compatibleWithJavaBean;
        this.modules = new ArrayList();
        this.denyHashCodes = new long[]{-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7921218830998286408L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -4837536971810737970L, -4608341446948126581L, -4438775680185074100L, -4082057040235125754L, -3935185854875733362L, -3319207949486691020L, -2753427844400776271L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -254670111376247151L, -190281065685395680L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 218512992947536312L, 313864100207897507L, 823641066473609950L, 1073634739308289776L, 1203232727967308606L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1818089308493370394L, 2164696723069287854L, 2653453629929770569L, 2836431254737891113L, 3089451460101527857L, 3114862868117605599L, 3256258368248066264L, 3547627781654598988L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4046190361520671643L, 4147696707147271408L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5347909877633654828L, 5450448828334921485L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6734240326434096246L, 6742705432718011780L, 7123326897294507060L, 7179336928365889465L, 7442624256860549330L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L};
        long[] jArr = new long[AUTO_TYPE_ACCEPT_LIST.length];
        int i = 0;
        while (true) {
            String[] strArr = AUTO_TYPE_ACCEPT_LIST;
            if (i >= strArr.length) {
                break;
            }
            jArr[i] = TypeUtils.fnv1a_64(strArr[i]);
            i++;
        }
        Arrays.sort(jArr);
        this.acceptHashCodes = jArr;
        this.fieldBased = z;
        if (aSMDeserializerFactory == null && !ASMUtils.IS_ANDROID) {
            try {
                aSMDeserializerFactory = classLoader == null ? new ASMDeserializerFactory(new ASMClassLoader()) : new ASMDeserializerFactory(classLoader);
            } catch (ExceptionInInitializerError | NoClassDefFoundError | AccessControlException unused) {
            }
        }
        this.asmFactory = aSMDeserializerFactory;
        if (aSMDeserializerFactory == null) {
            this.asmEnable = false;
        }
        initDeserializers();
        addItemsToDeny(DENYS);
        addItemsToAccept(AUTO_TYPE_ACCEPT_LIST);
    }

    private void addItemsToAccept(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            addAccept(str);
        }
    }

    private void addItemsToDeny(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            addDeny(str);
        }
    }

    public static Field getFieldFromCache(String str, Map<String, Field> map) {
        Field field = map.get(str);
        if (field == null) {
            field = map.get("_" + str);
        }
        if (field == null) {
            field = map.get("m_" + str);
        }
        if (field == null) {
            char cCharAt = str.charAt(0);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                charArray[0] = (char) (charArray[0] - ' ');
                field = map.get(new String(charArray));
            }
            if (str.length() > 2) {
                char cCharAt2 = str.charAt(1);
                if (str.length() > 2 && cCharAt >= 'a' && cCharAt <= 'z' && cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    for (Map.Entry<String, Field> entry : map.entrySet()) {
                        if (str.equalsIgnoreCase(entry.getKey())) {
                            return entry.getValue();
                        }
                    }
                }
            }
        }
        return field;
    }

    public static ParserConfig getGlobalInstance() {
        return global;
    }

    private void initDeserializers() {
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap = this.deserializers;
        MiscCodec miscCodec = MiscCodec.instance;
        identityHashMap.put(SimpleDateFormat.class, miscCodec);
        this.deserializers.put(Timestamp.class, SqlDateDeserializer.instance_timestamp);
        this.deserializers.put(Date.class, SqlDateDeserializer.instance);
        this.deserializers.put(Time.class, TimeDeserializer.instance);
        this.deserializers.put(java.util.Date.class, DateCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap2 = this.deserializers;
        CalendarCodec calendarCodec = CalendarCodec.instance;
        identityHashMap2.put(Calendar.class, calendarCodec);
        this.deserializers.put(XMLGregorianCalendar.class, calendarCodec);
        this.deserializers.put(JSONObject.class, MapDeserializer.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap3 = this.deserializers;
        CollectionCodec collectionCodec = CollectionCodec.instance;
        identityHashMap3.put(JSONArray.class, collectionCodec);
        this.deserializers.put(Map.class, MapDeserializer.instance);
        this.deserializers.put(HashMap.class, MapDeserializer.instance);
        this.deserializers.put(LinkedHashMap.class, MapDeserializer.instance);
        this.deserializers.put(TreeMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentMap.class, MapDeserializer.instance);
        this.deserializers.put(ConcurrentHashMap.class, MapDeserializer.instance);
        this.deserializers.put(Collection.class, collectionCodec);
        this.deserializers.put(List.class, collectionCodec);
        this.deserializers.put(ArrayList.class, collectionCodec);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap4 = this.deserializers;
        JavaObjectDeserializer javaObjectDeserializer = JavaObjectDeserializer.instance;
        identityHashMap4.put(Object.class, javaObjectDeserializer);
        this.deserializers.put(String.class, StringCodec.instance);
        this.deserializers.put(StringBuffer.class, StringCodec.instance);
        this.deserializers.put(StringBuilder.class, StringCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap5 = this.deserializers;
        CharacterCodec characterCodec = CharacterCodec.instance;
        identityHashMap5.put(Character.TYPE, characterCodec);
        this.deserializers.put(Character.class, characterCodec);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap6 = this.deserializers;
        NumberDeserializer numberDeserializer = NumberDeserializer.instance;
        identityHashMap6.put(Byte.TYPE, numberDeserializer);
        this.deserializers.put(Byte.class, numberDeserializer);
        this.deserializers.put(Short.TYPE, numberDeserializer);
        this.deserializers.put(Short.class, numberDeserializer);
        this.deserializers.put(Integer.TYPE, IntegerCodec.instance);
        this.deserializers.put(Integer.class, IntegerCodec.instance);
        this.deserializers.put(Long.TYPE, LongCodec.instance);
        this.deserializers.put(Long.class, LongCodec.instance);
        this.deserializers.put(BigInteger.class, BigIntegerCodec.instance);
        this.deserializers.put(BigDecimal.class, BigDecimalCodec.instance);
        this.deserializers.put(Float.TYPE, FloatCodec.instance);
        this.deserializers.put(Float.class, FloatCodec.instance);
        this.deserializers.put(Double.TYPE, numberDeserializer);
        this.deserializers.put(Double.class, numberDeserializer);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap7 = this.deserializers;
        BooleanCodec booleanCodec = BooleanCodec.instance;
        identityHashMap7.put(Boolean.TYPE, booleanCodec);
        this.deserializers.put(Boolean.class, booleanCodec);
        this.deserializers.put(Class.class, miscCodec);
        this.deserializers.put(char[].class, new CharArrayCodec());
        this.deserializers.put(AtomicBoolean.class, booleanCodec);
        this.deserializers.put(AtomicInteger.class, IntegerCodec.instance);
        this.deserializers.put(AtomicLong.class, LongCodec.instance);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap8 = this.deserializers;
        ReferenceCodec referenceCodec = ReferenceCodec.instance;
        identityHashMap8.put(AtomicReference.class, referenceCodec);
        this.deserializers.put(WeakReference.class, referenceCodec);
        this.deserializers.put(SoftReference.class, referenceCodec);
        this.deserializers.put(UUID.class, miscCodec);
        this.deserializers.put(TimeZone.class, miscCodec);
        this.deserializers.put(Locale.class, miscCodec);
        this.deserializers.put(Currency.class, miscCodec);
        this.deserializers.put(Inet4Address.class, miscCodec);
        this.deserializers.put(Inet6Address.class, miscCodec);
        this.deserializers.put(InetSocketAddress.class, miscCodec);
        this.deserializers.put(File.class, miscCodec);
        this.deserializers.put(URI.class, miscCodec);
        this.deserializers.put(URL.class, miscCodec);
        this.deserializers.put(Pattern.class, miscCodec);
        this.deserializers.put(Charset.class, miscCodec);
        this.deserializers.put(JSONPath.class, miscCodec);
        this.deserializers.put(Number.class, numberDeserializer);
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap9 = this.deserializers;
        AtomicCodec atomicCodec = AtomicCodec.instance;
        identityHashMap9.put(AtomicIntegerArray.class, atomicCodec);
        this.deserializers.put(AtomicLongArray.class, atomicCodec);
        this.deserializers.put(StackTraceElement.class, StackTraceElementDeserializer.instance);
        this.deserializers.put(Serializable.class, javaObjectDeserializer);
        this.deserializers.put(Cloneable.class, javaObjectDeserializer);
        this.deserializers.put(Comparable.class, javaObjectDeserializer);
        this.deserializers.put(Closeable.class, javaObjectDeserializer);
        this.deserializers.put(JSONPObject.class, new JSONPDeserializer());
    }

    public static boolean isPrimitive2(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == java.util.Date.class || cls == Date.class || cls == Time.class || cls == Timestamp.class || cls.isEnum();
    }

    public static void parserAllFieldToCache(Class<?> cls, Map<String, Field> map) {
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            if (!map.containsKey(name)) {
                map.put(name, field);
            }
        }
        if (cls.getSuperclass() == null || cls.getSuperclass() == Object.class) {
            return;
        }
        parserAllFieldToCache(cls.getSuperclass(), map);
    }

    private static String[] splitItemsFormProperty(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(Constants.SEPARATOR_COMMA);
    }

    public void addAccept(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jFnv1a_64 = TypeUtils.fnv1a_64(str);
        if (Arrays.binarySearch(this.acceptHashCodes, jFnv1a_64) >= 0) {
            return;
        }
        long[] jArr = this.acceptHashCodes;
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        jArr2[length] = jFnv1a_64;
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Arrays.sort(jArr2);
        this.acceptHashCodes = jArr2;
    }

    public void addDeny(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jFnv1a_64 = TypeUtils.fnv1a_64(str);
        if (Arrays.binarySearch(this.denyHashCodes, jFnv1a_64) >= 0) {
            return;
        }
        long[] jArr = this.denyHashCodes;
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        jArr2[length] = jFnv1a_64;
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Arrays.sort(jArr2);
        this.denyHashCodes = jArr2;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0204  */
    /* JADX WARN: Code duplicated, block: B:140:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x020f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0213  */
    /* JADX WARN: Code duplicated, block: B:145:0x021b  */
    /* JADX WARN: Code duplicated, block: B:165:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0260  */
    /* JADX WARN: Code duplicated, block: B:168:0x0264  */
    public Class<?> checkAutoType(String str, Class<?> cls, int i) throws Throwable {
        long j;
        Class<?> clsLoadClass;
        boolean z;
        InputStream resourceAsStream;
        InputStream inputStream;
        boolean zHasJsonType;
        boolean z2;
        if (str == null) {
            return null;
        }
        if (str.length() >= 192 || str.length() < 3) {
            riq.m179531a("autoType is not support. ".concat(str));
            return null;
        }
        boolean z3 = (cls == null || cls == Object.class || cls == Serializable.class || cls == Cloneable.class || cls == Closeable.class || cls == EventListener.class || cls == Iterable.class || cls == Collection.class) ? false : true;
        String strReplace = str.replace('$', '.');
        long j2 = 1099511628211L;
        long jCharAt = (((long) strReplace.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
        if (jCharAt == -5808493101479473382L) {
            riq.m179531a("autoType is not support. ".concat(str));
            return null;
        }
        if ((jCharAt ^ ((long) strReplace.charAt(strReplace.length() - 1))) * 1099511628211L == 655701488918567152L) {
            riq.m179531a("autoType is not support. ".concat(str));
            return null;
        }
        long jCharAt2 = (((((((long) strReplace.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) strReplace.charAt(1))) * 1099511628211L) ^ ((long) strReplace.charAt(2))) * 1099511628211L;
        boolean z4 = Arrays.binarySearch(INTERNAL_WHITELIST_HASHCODES, TypeUtils.fnv1a_64(strReplace)) >= 0;
        if (z4 || !(this.autoTypeSupport || z3)) {
            j = 1099511628211L;
            clsLoadClass = null;
        } else {
            int i2 = 3;
            long j3 = jCharAt2;
            clsLoadClass = null;
            while (i2 < strReplace.length()) {
                long jCharAt3 = (j3 ^ ((long) strReplace.charAt(i2))) * j2;
                long j4 = j2;
                if (Arrays.binarySearch(this.acceptHashCodes, jCharAt3) >= 0 && (clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, true)) != null) {
                    return clsLoadClass;
                }
                if (Arrays.binarySearch(this.denyHashCodes, jCharAt3) >= 0 && TypeUtils.getClassFromMapping(str) == null) {
                    riq.m179531a("autoType is not support. ".concat(str));
                    return null;
                }
                i2++;
                j2 = j4;
                j3 = jCharAt3;
            }
            j = j2;
        }
        if (clsLoadClass == null) {
            clsLoadClass = TypeUtils.getClassFromMapping(str);
        }
        if (clsLoadClass == null) {
            clsLoadClass = this.deserializers.findClass(str);
        }
        if (clsLoadClass == null) {
            clsLoadClass = this.typeMapping.get(str);
        }
        if (z4) {
            clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, true);
        }
        if (clsLoadClass != null) {
            if (cls == null || clsLoadClass == HashMap.class || cls.isAssignableFrom(clsLoadClass)) {
                return clsLoadClass;
            }
            k860.m144904a("type not match. ", str, " -> ", cls.getName());
            return null;
        }
        if (!this.autoTypeSupport) {
            for (int i3 = 3; i3 < strReplace.length(); i3++) {
                jCharAt2 = (jCharAt2 ^ ((long) strReplace.charAt(i3))) * j;
                if (Arrays.binarySearch(this.denyHashCodes, jCharAt2) >= 0) {
                    riq.m179531a("autoType is not support. ".concat(str));
                    return null;
                }
                if (Arrays.binarySearch(this.acceptHashCodes, jCharAt2) >= 0) {
                    if (clsLoadClass == null) {
                        clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, true);
                    }
                    if (cls == null || !cls.isAssignableFrom(clsLoadClass)) {
                        return clsLoadClass;
                    }
                    k860.m144904a("type not match. ", str, " -> ", cls.getName());
                    return null;
                }
            }
        }
        try {
            try {
                String str2 = str.replace('.', '/') + ".class";
                ClassLoader classLoader = this.defaultClassLoader;
                if (classLoader != null) {
                    try {
                        resourceAsStream = classLoader.getResourceAsStream(str2);
                    } catch (Exception unused) {
                        resourceAsStream = null;
                        z = false;
                        IOUtils.close(resourceAsStream);
                        zHasJsonType = z;
                        int i4 = Feature.SupportAutoType.mask;
                        if (!this.autoTypeSupport) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (clsLoadClass == null) {
                            if (z2) {
                                z = true;
                            } else {
                                z = true;
                            }
                            clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, z);
                        }
                        if (clsLoadClass != null) {
                            if (zHasJsonType) {
                                TypeUtils.addMapping(str, clsLoadClass);
                                return clsLoadClass;
                            }
                            if (ClassLoader.class.isAssignableFrom(clsLoadClass)) {
                            }
                            riq.m179531a("autoType is not support. ".concat(str));
                            return null;
                        }
                        if (!z2) {
                            riq.m179531a("autoType is not support. ".concat(str));
                            return null;
                        }
                        if (clsLoadClass != null) {
                            TypeUtils.addMapping(str, clsLoadClass);
                        }
                        return clsLoadClass;
                    }
                } else {
                    resourceAsStream = ParserConfig.class.getClassLoader().getResourceAsStream(str2);
                }
                if (resourceAsStream != null) {
                    try {
                        try {
                            ClassReader classReader = new ClassReader(resourceAsStream, true);
                            z = false;
                            try {
                                TypeCollector typeCollector = new TypeCollector("<clinit>", new Class[0]);
                                classReader.accept(typeCollector);
                                zHasJsonType = typeCollector.hasJsonType();
                            } catch (Exception unused2) {
                                IOUtils.close(resourceAsStream);
                                zHasJsonType = z;
                            }
                        } catch (Exception unused3) {
                            z = false;
                            IOUtils.close(resourceAsStream);
                            zHasJsonType = z;
                            int i5 = Feature.SupportAutoType.mask;
                            if (!this.autoTypeSupport) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (clsLoadClass == null) {
                                if (z2) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, z);
                            }
                            if (clsLoadClass != null) {
                                if (zHasJsonType) {
                                    TypeUtils.addMapping(str, clsLoadClass);
                                    return clsLoadClass;
                                }
                                if (ClassLoader.class.isAssignableFrom(clsLoadClass)) {
                                }
                                riq.m179531a("autoType is not support. ".concat(str));
                                return null;
                            }
                            if (!z2) {
                                riq.m179531a("autoType is not support. ".concat(str));
                                return null;
                            }
                            if (clsLoadClass != null) {
                                TypeUtils.addMapping(str, clsLoadClass);
                            }
                            return clsLoadClass;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = resourceAsStream;
                        IOUtils.close(inputStream);
                        throw th;
                    }
                } else {
                    z = false;
                    zHasJsonType = false;
                }
                IOUtils.close(resourceAsStream);
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Exception unused4) {
            z = false;
            resourceAsStream = null;
        }
        int i6 = Feature.SupportAutoType.mask;
        if (!this.autoTypeSupport && (i & i6) == 0 && (i6 & JSON.DEFAULT_PARSER_FEATURE) == 0) {
            z2 = z;
        } else {
            z2 = true;
        }
        if (clsLoadClass == null && (z2 || zHasJsonType || z3)) {
            if (z2 || zHasJsonType) {
                z = true;
            }
            clsLoadClass = TypeUtils.loadClass(str, this.defaultClassLoader, z);
        }
        if (clsLoadClass != null) {
            if (zHasJsonType) {
                TypeUtils.addMapping(str, clsLoadClass);
                return clsLoadClass;
            }
            if (!ClassLoader.class.isAssignableFrom(clsLoadClass) || DataSource.class.isAssignableFrom(clsLoadClass) || RowSet.class.isAssignableFrom(clsLoadClass)) {
                riq.m179531a("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsLoadClass)) {
                    TypeUtils.addMapping(str, clsLoadClass);
                    return clsLoadClass;
                }
                k860.m144904a("type not match. ", str, " -> ", cls.getName());
                return null;
            }
            if (JavaBeanInfo.build(clsLoadClass, clsLoadClass, this.propertyNamingStrategy).creatorConstructor != null && z2) {
                riq.m179531a("autoType is not support. ".concat(str));
                return null;
            }
        }
        if (!z2) {
            riq.m179531a("autoType is not support. ".concat(str));
            return null;
        }
        if (clsLoadClass != null) {
            TypeUtils.addMapping(str, clsLoadClass);
        }
        return clsLoadClass;
    }

    public void clearDeserializers() {
        this.deserializers.clear();
        initDeserializers();
    }

    public void configFromPropety(Properties properties) {
        addItemsToDeny(splitItemsFormProperty(properties.getProperty(DENY_PROPERTY)));
        addItemsToAccept(splitItemsFormProperty(properties.getProperty(AUTOTYPE_ACCEPT)));
        String property = properties.getProperty(AUTOTYPE_SUPPORT_PROPERTY);
        if ("true".equals(property)) {
            this.autoTypeSupport = true;
        } else if ("false".equals(property)) {
            this.autoTypeSupport = false;
        }
    }

    public FieldDeserializer createFieldDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, FieldInfo fieldInfo) {
        Class<?> clsDeserializeUsing;
        Class<?> cls = javaBeanInfo.clazz;
        Class<?> cls2 = fieldInfo.fieldClass;
        JSONField annotation = fieldInfo.getAnnotation();
        Class<?> cls3 = null;
        if (annotation != null && (clsDeserializeUsing = annotation.deserializeUsing()) != Void.class) {
            cls3 = clsDeserializeUsing;
        }
        return (cls3 == null && (cls2 == List.class || cls2 == ArrayList.class)) ? new ArrayListTypeFieldDeserializer(parserConfig, cls, fieldInfo) : new DefaultFieldDeserializer(parserConfig, cls, fieldInfo);
    }

    public ObjectDeserializer createJavaBeanDeserializer(Class<?> cls, Type type) {
        Class<?> cls2;
        Type type2;
        JSONField annotation;
        Method method;
        ASMDeserializerFactory aSMDeserializerFactory;
        boolean zCheckName = this.asmEnable & (!this.fieldBased);
        if (zCheckName) {
            JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
            if (jSONType != null) {
                Class<?> clsDeserializer = jSONType.deserializer();
                if (clsDeserializer != Void.class) {
                    try {
                        Object objNewInstance = clsDeserializer.newInstance();
                        if (objNewInstance instanceof ObjectDeserializer) {
                            return (ObjectDeserializer) objNewInstance;
                        }
                    } catch (Throwable unused) {
                    }
                }
                zCheckName = jSONType.asm();
            }
            if (zCheckName) {
                Class<?> builderClass = JavaBeanInfo.getBuilderClass(cls, jSONType);
                if (builderClass == null) {
                    builderClass = cls;
                }
                do {
                    if (!Modifier.isPublic(builderClass.getModifiers())) {
                        zCheckName = false;
                        break;
                    }
                    builderClass = builderClass.getSuperclass();
                    if (builderClass == Object.class) {
                        break;
                    }
                } while (builderClass != null);
            }
        }
        if (cls.getTypeParameters().length != 0) {
            zCheckName = false;
        }
        if (zCheckName && (aSMDeserializerFactory = this.asmFactory) != null && aSMDeserializerFactory.classLoader.isExternalClass(cls)) {
            zCheckName = false;
        }
        if (zCheckName) {
            zCheckName = ASMUtils.checkName(cls.getSimpleName());
        }
        if (zCheckName) {
            if (cls.isInterface()) {
                zCheckName = false;
            }
            cls2 = cls;
            type2 = type;
            JavaBeanInfo javaBeanInfoBuild = JavaBeanInfo.build(cls2, type2, this.propertyNamingStrategy, false, TypeUtils.compatibleWithJavaBean, this.jacksonCompatible);
            if (zCheckName && javaBeanInfoBuild.fields.length > 200) {
                zCheckName = false;
            }
            Constructor<?> constructor = javaBeanInfoBuild.defaultConstructor;
            if (zCheckName && constructor == null && !cls2.isInterface()) {
                zCheckName = false;
            }
            for (FieldInfo fieldInfo : javaBeanInfoBuild.fields) {
                if (!fieldInfo.getOnly) {
                    Class<?> cls3 = fieldInfo.fieldClass;
                    if (Modifier.isPublic(cls3.getModifiers()) && ((!cls3.isMemberClass() || Modifier.isStatic(cls3.getModifiers())) && ((fieldInfo.getMember() == null || ASMUtils.checkName(fieldInfo.getMember().getName())) && (((annotation = fieldInfo.getAnnotation()) == null || (ASMUtils.checkName(annotation.name()) && annotation.format().length() == 0 && annotation.deserializeUsing() == Void.class && annotation.parseFeatures().length == 0 && !annotation.unwrapped())) && (((method = fieldInfo.method) == null || method.getParameterTypes().length <= 1) && (!cls3.isEnum() || (getDeserializer(cls3) instanceof EnumDeserializer))))))) {
                    }
                }
                zCheckName = false;
                break;
            }
        } else {
            cls2 = cls;
            type2 = type;
        }
        if (zCheckName && cls2.isMemberClass() && !Modifier.isStatic(cls2.getModifiers())) {
            zCheckName = false;
        }
        if (!((zCheckName && TypeUtils.isXmlField(cls2)) ? false : zCheckName)) {
            return new JavaBeanDeserializer(this, cls2, type2);
        }
        JavaBeanInfo javaBeanInfoBuild2 = JavaBeanInfo.build(cls2, type2, this.propertyNamingStrategy);
        try {
            return this.asmFactory.createJavaBeanDeserializer(this, javaBeanInfoBuild2);
        } catch (JSONException unused2) {
            return new JavaBeanDeserializer(this, javaBeanInfoBuild2);
        } catch (NoSuchMethodException unused3) {
            return new JavaBeanDeserializer(this, cls2, type2);
        } catch (Exception e) {
            piq.m169752a("create asm deserializer error, ".concat(cls2.getName()), e);
            return null;
        }
    }

    public ObjectDeserializer get(Type type) {
        Type mixInAnnotations = JSON.getMixInAnnotations(type);
        if (mixInAnnotations == null) {
            return this.deserializers.get(type);
        }
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap = this.mixInDeserializers.get(type);
        if (identityHashMap == null) {
            return null;
        }
        return identityHashMap.get(mixInAnnotations);
    }

    public ClassLoader getDefaultClassLoader() {
        return this.defaultClassLoader;
    }

    public IdentityHashMap<Type, ObjectDeserializer> getDerializers() {
        return this.deserializers;
    }

    public ObjectDeserializer getDeserializer(Class<?> cls, Type type) {
        ObjectDeserializer objectDeserializerCreateJavaBeanDeserializer;
        Class<?> clsMappingTo;
        Type type2 = type;
        ObjectDeserializer objectDeserializer = get(type2);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type2 == null) {
            type2 = cls;
        }
        ObjectDeserializer objectDeserializerCreateDeserializer = get(type2);
        if (objectDeserializerCreateDeserializer != null) {
            return objectDeserializerCreateDeserializer;
        }
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
        if (jSONType != null && (clsMappingTo = jSONType.mappingTo()) != Void.class) {
            return getDeserializer(clsMappingTo, clsMappingTo);
        }
        if ((type2 instanceof WildcardType) || (type2 instanceof TypeVariable) || (type2 instanceof ParameterizedType)) {
            objectDeserializerCreateDeserializer = get(cls);
        }
        if (objectDeserializerCreateDeserializer != null) {
            return objectDeserializerCreateDeserializer;
        }
        Iterator<Module> it = this.modules.iterator();
        while (it.hasNext()) {
            objectDeserializerCreateDeserializer = it.next().createDeserializer(this, cls);
            if (objectDeserializerCreateDeserializer != null) {
                putDeserializer(type2, objectDeserializerCreateDeserializer);
                return objectDeserializerCreateDeserializer;
            }
        }
        String strReplace = cls.getName().replace('$', '.');
        if (strReplace.startsWith("java.awt.") && AwtCodec.support(cls) && !awtError) {
            String[] strArr = {"java.awt.Point", "java.awt.Font", "java.awt.Rectangle", "java.awt.Color"};
            for (int i = 0; i < 4; i++) {
                try {
                    String str = strArr[i];
                    if (str.equals(strReplace)) {
                        Type cls2 = Class.forName(str);
                        ObjectDeserializer objectDeserializer2 = AwtCodec.instance;
                        putDeserializer(cls2, objectDeserializer2);
                        return objectDeserializer2;
                    }
                } catch (Throwable unused) {
                    awtError = true;
                }
            }
            objectDeserializerCreateDeserializer = AwtCodec.instance;
        }
        if (!jdk8Error) {
            try {
                if (strReplace.startsWith("java.time.")) {
                    String[] strArr2 = {"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.ZoneId", "java.time.Period", "java.time.Duration", "java.time.Instant"};
                    for (int i2 = 0; i2 < 12; i2++) {
                        String str2 = strArr2[i2];
                        if (str2.equals(strReplace)) {
                            Type cls3 = Class.forName(str2);
                            ObjectDeserializer objectDeserializer3 = Jdk8DateCodec.instance;
                            putDeserializer(cls3, objectDeserializer3);
                            return objectDeserializer3;
                        }
                    }
                } else if (strReplace.startsWith("java.util.Optional")) {
                    String[] strArr3 = {"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"};
                    for (int i3 = 0; i3 < 4; i3++) {
                        String str3 = strArr3[i3];
                        if (str3.equals(strReplace)) {
                            Type cls4 = Class.forName(str3);
                            ObjectDeserializer objectDeserializer4 = OptionalCodec.instance;
                            putDeserializer(cls4, objectDeserializer4);
                            return objectDeserializer4;
                        }
                    }
                }
            } catch (Throwable unused2) {
                jdk8Error = true;
            }
        }
        if (!jodaError) {
            try {
                if (strReplace.startsWith("org.joda.time.")) {
                    String[] strArr4 = {"org.joda.time.DateTime", "org.joda.time.LocalDate", "org.joda.time.LocalDateTime", "org.joda.time.LocalTime", "org.joda.time.Instant", "org.joda.time.Period", "org.joda.time.Duration", "org.joda.time.DateTimeZone", "org.joda.time.format.DateTimeFormatter"};
                    for (int i4 = 0; i4 < 9; i4++) {
                        String str4 = strArr4[i4];
                        if (str4.equals(strReplace)) {
                            Type cls5 = Class.forName(str4);
                            objectDeserializerCreateDeserializer = JodaCodec.instance;
                            putDeserializer(cls5, objectDeserializerCreateDeserializer);
                            return objectDeserializerCreateDeserializer;
                        }
                    }
                }
            } catch (Throwable unused3) {
                jodaError = true;
            }
        }
        if (!guavaError && strReplace.startsWith("com.google.common.collect.")) {
            try {
                String[] strArr5 = {"com.google.common.collect.HashMultimap", "com.google.common.collect.LinkedListMultimap", "com.google.common.collect.LinkedHashMultimap", "com.google.common.collect.ArrayListMultimap", "com.google.common.collect.TreeMultimap"};
                for (int i5 = 0; i5 < 5; i5++) {
                    String str5 = strArr5[i5];
                    if (str5.equals(strReplace)) {
                        Type cls6 = Class.forName(str5);
                        objectDeserializerCreateDeserializer = GuavaCodec.instance;
                        putDeserializer(cls6, objectDeserializerCreateDeserializer);
                        return objectDeserializerCreateDeserializer;
                    }
                }
            } catch (ClassNotFoundException unused4) {
                guavaError = true;
            }
        }
        if (strReplace.equals("java.nio.ByteBuffer")) {
            objectDeserializerCreateDeserializer = ByteBufferCodec.instance;
            putDeserializer(cls, objectDeserializerCreateDeserializer);
        }
        if (strReplace.equals("java.nio.file.Path")) {
            objectDeserializerCreateDeserializer = MiscCodec.instance;
            putDeserializer(cls, objectDeserializerCreateDeserializer);
        }
        if (cls == Map.Entry.class) {
            objectDeserializerCreateDeserializer = MiscCodec.instance;
            putDeserializer(cls, objectDeserializerCreateDeserializer);
        }
        if (strReplace.equals("org.javamoney.moneta.Money")) {
            objectDeserializerCreateDeserializer = MonetaCodec.instance;
            putDeserializer(cls, objectDeserializerCreateDeserializer);
        }
        try {
            for (AutowiredObjectDeserializer autowiredObjectDeserializer : ServiceLoader.load(AutowiredObjectDeserializer.class, Thread.currentThread().getContextClassLoader())) {
                Iterator<Type> it2 = autowiredObjectDeserializer.getAutowiredFor().iterator();
                while (it2.hasNext()) {
                    putDeserializer(it2.next(), autowiredObjectDeserializer);
                }
            }
        } catch (Exception unused5) {
        }
        if (objectDeserializerCreateDeserializer == null) {
            objectDeserializerCreateDeserializer = get(type2);
        }
        if (objectDeserializerCreateDeserializer != null) {
            return objectDeserializerCreateDeserializer;
        }
        if (cls.isEnum()) {
            if (this.jacksonCompatible) {
                for (Method method : cls.getMethods()) {
                    if (TypeUtils.isJacksonCreator(method)) {
                        ObjectDeserializer objectDeserializerCreateJavaBeanDeserializer2 = createJavaBeanDeserializer(cls, type2);
                        putDeserializer(type2, objectDeserializerCreateJavaBeanDeserializer2);
                        return objectDeserializerCreateJavaBeanDeserializer2;
                    }
                }
            }
            JSONType jSONType2 = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class);
            if (jSONType2 != null) {
                try {
                    ObjectDeserializer objectDeserializer5 = (ObjectDeserializer) jSONType2.deserializer().newInstance();
                    putDeserializer(cls, objectDeserializer5);
                    return objectDeserializer5;
                } catch (Throwable unused6) {
                }
            }
            objectDeserializerCreateJavaBeanDeserializer = new EnumDeserializer(cls);
        } else if (cls.isArray()) {
            objectDeserializerCreateJavaBeanDeserializer = ObjectArrayCodec.instance;
        } else if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = CollectionCodec.instance;
        } else if (Map.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = MapDeserializer.instance;
        } else if (Throwable.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = new ThrowableDeserializer(this, cls);
        } else if (PropertyProcessable.class.isAssignableFrom(cls)) {
            objectDeserializerCreateJavaBeanDeserializer = new PropertyProcessableDeserializer(cls);
        } else {
            objectDeserializerCreateJavaBeanDeserializer = cls == InetAddress.class ? MiscCodec.instance : createJavaBeanDeserializer(cls, type2);
        }
        putDeserializer(type2, objectDeserializerCreateJavaBeanDeserializer);
        return objectDeserializerCreateJavaBeanDeserializer;
    }

    public IdentityHashMap<Type, ObjectDeserializer> getDeserializers() {
        return this.deserializers;
    }

    public void initJavaBeanDeserializers(Class<?>... clsArr) {
        if (clsArr == null) {
            return;
        }
        for (Class<?> cls : clsArr) {
            if (cls != null) {
                putDeserializer(cls, createJavaBeanDeserializer(cls, cls));
            }
        }
    }

    public boolean isAsmEnable() {
        return this.asmEnable;
    }

    public boolean isAutoTypeSupport() {
        return this.autoTypeSupport;
    }

    public boolean isJacksonCompatible() {
        return this.jacksonCompatible;
    }

    public boolean isPrimitive(Class<?> cls) {
        return isPrimitive2(cls);
    }

    public void putDeserializer(Type type, ObjectDeserializer objectDeserializer) {
        Type mixInAnnotations = JSON.getMixInAnnotations(type);
        if (mixInAnnotations == null) {
            this.deserializers.put(type, objectDeserializer);
            return;
        }
        IdentityHashMap<Type, ObjectDeserializer> identityHashMap = this.mixInDeserializers.get(type);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap<>(4);
            this.mixInDeserializers.put(type, identityHashMap);
        }
        identityHashMap.put(mixInAnnotations, objectDeserializer);
    }

    public void register(String str, Class cls) {
        this.typeMapping.putIfAbsent(str, cls);
    }

    public void setAsmEnable(boolean z) {
        this.asmEnable = z;
    }

    public void setAutoTypeSupport(boolean z) {
        this.autoTypeSupport = z;
    }

    public void setDefaultClassLoader(ClassLoader classLoader) {
        this.defaultClassLoader = classLoader;
    }

    public void setJacksonCompatible(boolean z) {
        this.jacksonCompatible = z;
    }

    public void register(Module module) {
        this.modules.add(module);
    }

    public ParserConfig(boolean z) {
        this(null, null, z);
    }

    public ParserConfig(ClassLoader classLoader) {
        this(null, classLoader, false);
    }

    public ParserConfig(ASMDeserializerFactory aSMDeserializerFactory) {
        this(aSMDeserializerFactory, null, false);
    }

    public ParserConfig() {
        this(false);
    }

    public Class<?> checkAutoType(String str, Class<?> cls) {
        return checkAutoType(str, cls, JSON.DEFAULT_PARSER_FEATURE);
    }

    public Class<?> checkAutoType(Class cls) {
        return get(cls) != null ? cls : checkAutoType(cls.getName(), null, JSON.DEFAULT_PARSER_FEATURE);
    }

    public ObjectDeserializer getDeserializer(Type type) {
        ObjectDeserializer objectDeserializer = get(type);
        if (objectDeserializer != null) {
            return objectDeserializer;
        }
        if (type instanceof Class) {
            return getDeserializer((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return getDeserializer((Class) rawType, type);
            }
            return getDeserializer(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getDeserializer(upperBounds[0]);
            }
        }
        return JavaObjectDeserializer.instance;
    }

    public ObjectDeserializer getDeserializer(FieldInfo fieldInfo) {
        return getDeserializer(fieldInfo.fieldClass, fieldInfo.fieldType);
    }
}
