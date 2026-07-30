package com.immomo.momomediaext.sei;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class JsonHelper {
    private static final SerializerFeature[] FEATURES = {SerializerFeature.WriteDateUseDateFormat};

    static {
        JSON.DEFAULT_GENERATE_FEATURE |= SerializerFeature.DisableCircularReferenceDetect.getMask();
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) JSON.parseObject(str, cls);
    }

    public static JSONArray parseArray(String str) {
        return JSON.parseArray(str);
    }

    public static <T> T parseObject(String str, Type type) {
        return (T) JSON.parseObject(str, type, new Feature[0]);
    }

    public static String toJsonString(Object obj) {
        return JSON.toJSONString(obj, new PropertyFilter() { // from class: com.immomo.momomediaext.sei.JsonHelper.1
            @Override // com.alibaba.fastjson.serializer.PropertyFilter
            public boolean apply(Object obj2, String str, Object obj3) {
                if (obj3 == null) {
                    return false;
                }
                if ((obj3 instanceof String) && ((String) obj3).isEmpty()) {
                    return false;
                }
                return ((obj3 instanceof List) && ((List) obj3).size() == 0) ? false : true;
            }
        }, new SerializerFeature[0]);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        return JSON.parseArray(str, cls);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) JSON.parseObject(str, cls);
    }

    public static JSONObject parseObject(String str) {
        return JSON.parseObject(str);
    }

    public static String toJsonString(Object obj, SerializerFeature serializerFeature) {
        return JSON.toJSONString(obj, serializerFeature);
    }
}
