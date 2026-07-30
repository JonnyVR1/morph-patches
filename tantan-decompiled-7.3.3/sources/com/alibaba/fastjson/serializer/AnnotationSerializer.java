package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import p153l.okq;
import p153l.qkq;

/* JADX INFO: loaded from: classes.dex */
public class AnnotationSerializer implements ObjectSerializer {
    public static AnnotationSerializer instance = new AnnotationSerializer();
    private static volatile Class sun_AnnotationType = null;
    private static volatile boolean sun_AnnotationType_error = false;
    private static volatile Method sun_AnnotationType_getInstance;
    private static volatile Method sun_AnnotationType_members;

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws IOException {
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        if (interfaces.length == 1 && interfaces[0].isAnnotation()) {
            Class<?> cls = interfaces[0];
            if (sun_AnnotationType == null && !sun_AnnotationType_error) {
                try {
                    sun_AnnotationType = Class.forName("sun.reflect.annotation.AnnotationType");
                } catch (Throwable th) {
                    sun_AnnotationType_error = true;
                    okq.m168043a("not support Type Annotation.", th);
                    return;
                }
            }
            if (sun_AnnotationType == null) {
                qkq.m176968a("not support Type Annotation.");
                return;
            }
            if (sun_AnnotationType_getInstance == null && !sun_AnnotationType_error) {
                try {
                    sun_AnnotationType_getInstance = sun_AnnotationType.getMethod("getInstance", Class.class);
                } catch (Throwable th2) {
                    sun_AnnotationType_error = true;
                    okq.m168043a("not support Type Annotation.", th2);
                    return;
                }
            }
            if (sun_AnnotationType_members == null && !sun_AnnotationType_error) {
                try {
                    sun_AnnotationType_members = sun_AnnotationType.getMethod("members", null);
                } catch (Throwable th3) {
                    sun_AnnotationType_error = true;
                    okq.m168043a("not support Type Annotation.", th3);
                    return;
                }
            }
            if (sun_AnnotationType_getInstance == null || sun_AnnotationType_error) {
                qkq.m176968a("not support Type Annotation.");
                return;
            }
            try {
                try {
                    Map map = (Map) sun_AnnotationType_members.invoke(sun_AnnotationType_getInstance.invoke(null, cls), null);
                    JSONObject jSONObject = new JSONObject(map.size());
                    Object objInvoke = null;
                    for (Map.Entry entry : map.entrySet()) {
                        try {
                            objInvoke = ((Method) entry.getValue()).invoke(obj, null);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                        jSONObject.put((String) entry.getKey(), JSON.toJSON(objInvoke));
                    }
                    jSONSerializer.write(jSONObject);
                } catch (Throwable th4) {
                    sun_AnnotationType_error = true;
                    okq.m168043a("not support Type Annotation.", th4);
                }
            } catch (Throwable th5) {
                sun_AnnotationType_error = true;
                okq.m168043a("not support Type Annotation.", th5);
            }
        }
    }
}
