package com.google.android.libraries.places.internal;

import com.p051p1.mobile.putong.data.MatchFrom;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtk implements InvocationHandler {
    private final List zza;
    private boolean zzb;
    private String zzc;

    public zzbtk(List list) {
        this.zza = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = zzbto.zza;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.zza;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                int i = 0;
                while (true) {
                    List list2 = this.zza;
                    if (i >= size) {
                        String str = (String) list2.get(0);
                        this.zzc = str;
                        return str;
                    }
                    if (list2.contains(list.get(i))) {
                        String str2 = (String) list.get(i);
                        this.zzc = str2;
                        return str2;
                    }
                    i++;
                }
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals(MatchFrom.selected)) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.zzc = (String) objArr[0];
        return null;
    }
}
