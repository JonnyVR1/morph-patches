package com.alibaba.fastjson.support.retrofit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p153l.e7y;
import p153l.k5d0;
import p153l.mnd0;
import p153l.z1d0;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class Retrofit2ConverterFactory extends Converter.Factory {
    private FastJsonConfig fastJsonConfig;

    @Deprecated
    private int featureValues;

    @Deprecated
    private Feature[] features;

    @Deprecated
    private ParserConfig parserConfig;

    @Deprecated
    private SerializeConfig serializeConfig;

    @Deprecated
    private SerializerFeature[] serializerFeatures;
    private static final e7y MEDIA_TYPE = e7y.m119773d("application/json; charset=UTF-8");

    @Deprecated
    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];

    public final class RequestBodyConverter<T> implements Converter<T, z1d0> {
        public RequestBodyConverter() {
        }

        public z1d0 convert(T t) throws IOException {
            try {
                return z1d0.create(Retrofit2ConverterFactory.MEDIA_TYPE, JSON.toJSONBytes(Retrofit2ConverterFactory.this.fastJsonConfig.getCharset(), t, Retrofit2ConverterFactory.this.fastJsonConfig.getSerializeConfig(), Retrofit2ConverterFactory.this.fastJsonConfig.getSerializeFilters(), Retrofit2ConverterFactory.this.fastJsonConfig.getDateFormat(), JSON.DEFAULT_GENERATE_FEATURE, Retrofit2ConverterFactory.this.fastJsonConfig.getSerializerFeatures()));
            } catch (Exception e) {
                throw new IOException("Could not write JSON: " + e.getMessage(), e);
            }
        }
    }

    public final class ResponseBodyConverter<T> implements Converter<k5d0, T> {
        private Type type;

        public ResponseBodyConverter(Type type) {
            this.type = type;
        }

        public T convert(k5d0 k5d0Var) throws IOException {
            try {
                try {
                    T t = (T) JSON.parseObject(k5d0Var.bytes(), Retrofit2ConverterFactory.this.fastJsonConfig.getCharset(), this.type, Retrofit2ConverterFactory.this.fastJsonConfig.getParserConfig(), Retrofit2ConverterFactory.this.fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, Retrofit2ConverterFactory.this.fastJsonConfig.getFeatures());
                    k5d0Var.close();
                    return t;
                } catch (Exception e) {
                    throw new IOException("JSON parse error: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                k5d0Var.close();
                throw th;
            }
        }
    }

    public Retrofit2ConverterFactory() {
        this.parserConfig = ParserConfig.getGlobalInstance();
        this.featureValues = JSON.DEFAULT_PARSER_FEATURE;
        this.fastJsonConfig = new FastJsonConfig();
    }

    public static Retrofit2ConverterFactory create(FastJsonConfig fastJsonConfig) {
        if (fastJsonConfig != null) {
            return new Retrofit2ConverterFactory(fastJsonConfig);
        }
        mnd0.m159157a("fastJsonConfig == null");
        return null;
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    @Deprecated
    public ParserConfig getParserConfig() {
        return this.fastJsonConfig.getParserConfig();
    }

    @Deprecated
    public int getParserFeatureValues() {
        return JSON.DEFAULT_PARSER_FEATURE;
    }

    @Deprecated
    public Feature[] getParserFeatures() {
        return this.fastJsonConfig.getFeatures();
    }

    @Deprecated
    public SerializeConfig getSerializeConfig() {
        return this.fastJsonConfig.getSerializeConfig();
    }

    @Deprecated
    public SerializerFeature[] getSerializerFeatures() {
        return this.fastJsonConfig.getSerializerFeatures();
    }

    public Converter<Object, z1d0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new RequestBodyConverter();
    }

    public Converter<k5d0, Object> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new ResponseBodyConverter(type);
    }

    public Retrofit2ConverterFactory setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserConfig(ParserConfig parserConfig) {
        this.fastJsonConfig.setParserConfig(parserConfig);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserFeatureValues(int i) {
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserFeatures(Feature[] featureArr) {
        this.fastJsonConfig.setFeatures(featureArr);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setSerializeConfig(SerializeConfig serializeConfig) {
        this.fastJsonConfig.setSerializeConfig(serializeConfig);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setSerializerFeatures(SerializerFeature[] serializerFeatureArr) {
        this.fastJsonConfig.setSerializerFeatures(serializerFeatureArr);
        return this;
    }

    public static Retrofit2ConverterFactory create() {
        return create(new FastJsonConfig());
    }

    public Retrofit2ConverterFactory(FastJsonConfig fastJsonConfig) {
        this.parserConfig = ParserConfig.getGlobalInstance();
        this.featureValues = JSON.DEFAULT_PARSER_FEATURE;
        this.fastJsonConfig = fastJsonConfig;
    }
}
