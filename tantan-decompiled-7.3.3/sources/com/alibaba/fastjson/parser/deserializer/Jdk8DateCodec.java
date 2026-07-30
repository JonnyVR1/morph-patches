package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.ContextObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.TimeZone;
import p153l.aoq;
import p153l.coq;
import p153l.gnq;
import p153l.ioq;
import p153l.l710;
import p153l.nnq;
import p153l.qnq;
import p153l.rmq;
import p153l.smq;
import p153l.snq;
import p153l.soq;
import p153l.tmq;
import p153l.toq;
import p153l.unq;
import p153l.xnq;
import p153l.ymq;

/* JADX INFO: loaded from: classes.dex */
public class Jdk8DateCodec extends ContextObjectDeserializer implements ObjectSerializer, ContextObjectSerializer, ObjectDeserializer {
    private static final String formatter_iso8601_pattern_23 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private static final String formatter_iso8601_pattern_29 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
    public static final Jdk8DateCodec instance = new Jdk8DateCodec();
    private static final String defaultPatttern = "yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern(defaultPatttern);
    private static final DateTimeFormatter defaultFormatter_23 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter formatter_dt19_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");
    private static final DateTimeFormatter formatter_dt19_kr = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_us = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_de = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_in = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_d8 = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter formatter_d10_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter formatter_d10_cn = DateTimeFormatter.ofPattern("yyyy年M月d日");
    private static final DateTimeFormatter formatter_d10_kr = DateTimeFormatter.ofPattern("yyyy년M월d일");
    private static final DateTimeFormatter formatter_d10_us = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter formatter_d10_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter formatter_d10_de = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter formatter_d10_in = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter ISO_FIXED_FORMAT = DateTimeFormatter.ofPattern(defaultPatttern).withZone(ZoneId.systemDefault());
    private static final String formatter_iso8601_pattern = "yyyy-MM-dd'T'HH:mm:ss";
    private static final DateTimeFormatter formatter_iso8601 = DateTimeFormatter.ofPattern(formatter_iso8601_pattern);

    private void write(SerializeWriter serializeWriter, TemporalAccessor temporalAccessor, String str) {
        Instant instant;
        if ("unixtime".equals(str)) {
            if (smq.m186831a(temporalAccessor)) {
                serializeWriter.writeInt((int) ymq.m216732a(temporalAccessor).toEpochSecond());
                return;
            } else if (tmq.m191807a(temporalAccessor)) {
                serializeWriter.writeInt((int) toq.m192079a(temporalAccessor).atZone(JSON.defaultTimeZone.toZoneId()).toEpochSecond());
                return;
            }
        }
        if ("millis".equals(str)) {
            if (smq.m186831a(temporalAccessor)) {
                instant = ymq.m216732a(temporalAccessor).toInstant();
            } else {
                instant = tmq.m191807a(temporalAccessor) ? toq.m192079a(temporalAccessor).atZone(JSON.defaultTimeZone.toZoneId()).toInstant() : null;
            }
            if (instant != null) {
                serializeWriter.writeLong(instant.toEpochMilli());
                return;
            }
        }
        serializeWriter.writeString((str == formatter_iso8601_pattern ? formatter_iso8601 : DateTimeFormatter.ofPattern(str)).format(temporalAccessor));
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i) {
        DateTimeFormatter dateTimeFormatterOfPattern;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (jSONLexer.token() != 4) {
            if (jSONLexer.token() != 2) {
                l710.m153113a();
                return null;
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken();
            if ("unixtime".equals(str)) {
                jLongValue *= 1000;
            } else if ("yyyyMMddHHmmss".equals(str)) {
                int i2 = (int) (jLongValue / 10000000000L);
                int i3 = (int) ((jLongValue / 100000000) % 100);
                int i4 = (int) ((jLongValue / 1000000) % 100);
                int i5 = (int) ((jLongValue / 10000) % 100);
                int i6 = (int) ((jLongValue / 100) % 100);
                int i7 = (int) (jLongValue % 100);
                if (type == soq.m187273a()) {
                    return (T) LocalDateTime.of(i2, i3, i4, i5, i6, i7);
                }
            }
            if (type == soq.m187273a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId());
            }
            if (type == ioq.m141350a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalDate();
            }
            if (type == gnq.m130964a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalTime();
            }
            if (type == nnq.m163906a()) {
                return (T) ZonedDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId());
            }
            l710.m153113a();
            return null;
        }
        String strStringVal = jSONLexer.stringVal();
        jSONLexer.nextToken();
        if (str != null) {
            dateTimeFormatterOfPattern = defaultPatttern.equals(str) ? defaultFormatter : DateTimeFormatter.ofPattern(str);
        } else {
            dateTimeFormatterOfPattern = null;
        }
        if ("".equals(strStringVal)) {
            return null;
        }
        if (type == soq.m187273a()) {
            return (strStringVal.length() == 10 || strStringVal.length() == 8) ? (T) LocalDateTime.of(parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern), LocalTime.MIN) : (T) parseDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == ioq.m141350a()) {
            if (strStringVal.length() != 23) {
                return (T) parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern);
            }
            LocalDateTime localDateTime = LocalDateTime.parse(strStringVal);
            return (T) LocalDate.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        }
        if (type == gnq.m130964a()) {
            if (strStringVal.length() != 23) {
                return (T) LocalTime.parse(strStringVal);
            }
            LocalDateTime localDateTime2 = LocalDateTime.parse(strStringVal);
            return (T) LocalTime.of(localDateTime2.getHour(), localDateTime2.getMinute(), localDateTime2.getSecond(), localDateTime2.getNano());
        }
        if (type == nnq.m163906a()) {
            if (dateTimeFormatterOfPattern == defaultFormatter) {
                dateTimeFormatterOfPattern = ISO_FIXED_FORMAT;
            }
            if (dateTimeFormatterOfPattern == null && strStringVal.length() <= 19) {
                JSONScanner jSONScanner = new JSONScanner(strStringVal);
                TimeZone timeZone = defaultJSONParser.lexer.getTimeZone();
                jSONScanner.setTimeZone(timeZone);
                if (jSONScanner.scanISO8601DateIfMatch(false)) {
                    return (T) ZonedDateTime.ofInstant(jSONScanner.getCalendar().getTime().toInstant(), timeZone.toZoneId());
                }
            }
            return (T) parseZonedDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == qnq.m177264a()) {
            return (T) OffsetDateTime.parse(strStringVal);
        }
        if (type == snq.m186993a()) {
            return (T) OffsetTime.parse(strStringVal);
        }
        if (type == unq.m196887a()) {
            return (T) ZoneId.of(strStringVal);
        }
        if (type == xnq.m212282a()) {
            return (T) Period.parse(strStringVal);
        }
        if (type == aoq.m99220a()) {
            return (T) Duration.parse(strStringVal);
        }
        if (type == coq.m111683a()) {
            return (T) Instant.parse(strStringVal);
        }
        return null;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    public LocalDateTime parseDateTime(String str, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            if (str.length() == 19) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                char cCharAt3 = str.charAt(10);
                char cCharAt4 = str.charAt(13);
                char cCharAt5 = str.charAt(16);
                if (cCharAt4 == ':' && cCharAt5 == ':') {
                    if (cCharAt == '-' && cCharAt2 == '-') {
                        if (cCharAt3 == 'T') {
                            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } else if (cCharAt3 == ' ') {
                            dateTimeFormatter = defaultFormatter;
                        }
                    } else if (cCharAt == '/' && cCharAt2 == '/') {
                        dateTimeFormatter = formatter_dt19_tw;
                    } else {
                        char cCharAt6 = str.charAt(0);
                        char cCharAt7 = str.charAt(1);
                        char cCharAt8 = str.charAt(2);
                        char cCharAt9 = str.charAt(3);
                        char cCharAt10 = str.charAt(5);
                        if (cCharAt8 == '/' && cCharAt10 == '/') {
                            int i = ((cCharAt9 - '0') * 10) + (cCharAt - '0');
                            if (((cCharAt6 - '0') * 10) + (cCharAt7 - '0') > 12) {
                                dateTimeFormatter = formatter_dt19_eur;
                            } else if (i > 12) {
                                dateTimeFormatter = formatter_dt19_us;
                            } else {
                                String country = Locale.getDefault().getCountry();
                                if (country.equals("US")) {
                                    dateTimeFormatter = formatter_dt19_us;
                                } else if (country.equals("BR") || country.equals("AU")) {
                                    dateTimeFormatter = formatter_dt19_eur;
                                }
                            }
                        } else if (cCharAt8 == '.' && cCharAt10 == '.') {
                            dateTimeFormatter = formatter_dt19_de;
                        } else if (cCharAt8 == '-' && cCharAt10 == '-') {
                            dateTimeFormatter = formatter_dt19_in;
                        }
                    }
                }
            } else if (str.length() == 23) {
                char cCharAt11 = str.charAt(4);
                char cCharAt12 = str.charAt(7);
                char cCharAt13 = str.charAt(10);
                char cCharAt14 = str.charAt(13);
                char cCharAt15 = str.charAt(16);
                char cCharAt16 = str.charAt(19);
                if (cCharAt14 == ':' && cCharAt15 == ':' && cCharAt11 == '-' && cCharAt12 == '-' && cCharAt13 == ' ' && cCharAt16 == '.') {
                    dateTimeFormatter = defaultFormatter_23;
                }
            }
            if (str.length() >= 17) {
                char cCharAt17 = str.charAt(4);
                if (cCharAt17 == 24180) {
                    dateTimeFormatter = str.charAt(str.length() - 1) == 31186 ? formatter_dt19_cn_1 : formatter_dt19_cn;
                } else if (cCharAt17 == 45380) {
                    dateTimeFormatter = formatter_dt19_kr;
                }
            }
        }
        if (dateTimeFormatter == null) {
            JSONScanner jSONScanner = new JSONScanner(str);
            if (jSONScanner.scanISO8601DateIfMatch(false)) {
                return LocalDateTime.ofInstant(jSONScanner.getCalendar().toInstant(), ZoneId.systemDefault());
            }
        }
        return dateTimeFormatter == null ? LocalDateTime.parse(str) : LocalDateTime.parse(str, dateTimeFormatter);
    }

    public LocalDate parseLocalDate(String str, String str2, DateTimeFormatter dateTimeFormatter) {
        DateTimeFormatter dateTimeFormatter2;
        if (dateTimeFormatter == null) {
            if (str.length() == 8) {
                dateTimeFormatter = formatter_d8;
            }
            if (str.length() == 10) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                if (cCharAt == '/' && cCharAt2 == '/') {
                    dateTimeFormatter = formatter_d10_tw;
                }
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(5);
                if (cCharAt5 == '/' && cCharAt7 == '/') {
                    int i = ((cCharAt6 - '0') * 10) + (cCharAt - '0');
                    if (((cCharAt3 - '0') * 10) + (cCharAt4 - '0') > 12) {
                        dateTimeFormatter = formatter_d10_eur;
                    } else if (i > 12) {
                        dateTimeFormatter = formatter_d10_us;
                    } else {
                        String country = Locale.getDefault().getCountry();
                        if (country.equals("US")) {
                            dateTimeFormatter = formatter_d10_us;
                        } else if (country.equals("BR") || country.equals("AU")) {
                            dateTimeFormatter = formatter_d10_eur;
                        }
                    }
                } else {
                    if (cCharAt5 == '.' && cCharAt7 == '.') {
                        dateTimeFormatter2 = formatter_d10_de;
                    } else if (cCharAt5 == '-' && cCharAt7 == '-') {
                        dateTimeFormatter2 = formatter_d10_in;
                    }
                    dateTimeFormatter = dateTimeFormatter2;
                }
            }
            if (str.length() >= 9) {
                char cCharAt8 = str.charAt(4);
                if (cCharAt8 == 24180) {
                    dateTimeFormatter = formatter_d10_cn;
                } else if (cCharAt8 == 45380) {
                    dateTimeFormatter = formatter_d10_kr;
                }
            }
        }
        return dateTimeFormatter == null ? LocalDate.parse(str) : LocalDate.parse(str, dateTimeFormatter);
    }

    public ZonedDateTime parseZonedDateTime(String str, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            if (str.length() == 19) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                char cCharAt3 = str.charAt(10);
                char cCharAt4 = str.charAt(13);
                char cCharAt5 = str.charAt(16);
                if (cCharAt4 == ':' && cCharAt5 == ':') {
                    if (cCharAt == '-' && cCharAt2 == '-') {
                        if (cCharAt3 == 'T') {
                            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } else if (cCharAt3 == ' ') {
                            dateTimeFormatter = defaultFormatter;
                        }
                    } else if (cCharAt == '/' && cCharAt2 == '/') {
                        dateTimeFormatter = formatter_dt19_tw;
                    } else {
                        char cCharAt6 = str.charAt(0);
                        char cCharAt7 = str.charAt(1);
                        char cCharAt8 = str.charAt(2);
                        char cCharAt9 = str.charAt(3);
                        char cCharAt10 = str.charAt(5);
                        if (cCharAt8 == '/' && cCharAt10 == '/') {
                            int i = ((cCharAt9 - '0') * 10) + (cCharAt - '0');
                            if (((cCharAt6 - '0') * 10) + (cCharAt7 - '0') > 12) {
                                dateTimeFormatter = formatter_dt19_eur;
                            } else if (i > 12) {
                                dateTimeFormatter = formatter_dt19_us;
                            } else {
                                String country = Locale.getDefault().getCountry();
                                if (country.equals("US")) {
                                    dateTimeFormatter = formatter_dt19_us;
                                } else if (country.equals("BR") || country.equals("AU")) {
                                    dateTimeFormatter = formatter_dt19_eur;
                                }
                            }
                        } else if (cCharAt8 == '.' && cCharAt10 == '.') {
                            dateTimeFormatter = formatter_dt19_de;
                        } else if (cCharAt8 == '-' && cCharAt10 == '-') {
                            dateTimeFormatter = formatter_dt19_in;
                        }
                    }
                }
            }
            if (str.length() >= 17) {
                char cCharAt11 = str.charAt(4);
                if (cCharAt11 == 24180) {
                    dateTimeFormatter = str.charAt(str.length() - 1) == 31186 ? formatter_dt19_cn_1 : formatter_dt19_cn;
                } else if (cCharAt11 == 45380) {
                    dateTimeFormatter = formatter_dt19_kr;
                }
            }
        }
        return dateTimeFormatter == null ? ZonedDateTime.parse(str) : ZonedDateTime.parse(str, dateTimeFormatter);
    }

    @Override // com.alibaba.fastjson.serializer.ContextObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, BeanContext beanContext) throws IOException {
        write(jSONSerializer.out, rmq.m182102a(obj), beanContext.getFormat());
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        int nano;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type == soq.m187273a()) {
            SerializerFeature serializerFeature = SerializerFeature.UseISO8601DateFormat;
            int mask = serializerFeature.getMask();
            LocalDateTime localDateTimeM192079a = toq.m192079a(obj);
            String dateFormatPattern = jSONSerializer.getDateFormatPattern();
            if (dateFormatPattern == null) {
                int i2 = i & mask;
                dateFormatPattern = formatter_iso8601_pattern;
                if (i2 == 0 && !jSONSerializer.isEnabled(serializerFeature) && (nano = localDateTimeM192079a.getNano()) != 0) {
                    dateFormatPattern = nano % PlaybackException.CUSTOM_ERROR_CODE_BASE == 0 ? formatter_iso8601_pattern_23 : formatter_iso8601_pattern_29;
                }
            }
            write(serializeWriter, localDateTimeM192079a, dateFormatPattern);
            return;
        }
        serializeWriter.writeString(obj.toString());
    }
}
