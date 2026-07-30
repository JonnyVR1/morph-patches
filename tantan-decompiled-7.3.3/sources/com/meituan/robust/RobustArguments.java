package com.meituan.robust;

/* JADX INFO: loaded from: classes6.dex */
public class RobustArguments {
    public Object current;
    public boolean isStatic;
    public int methodNumber;
    public Object[] paramsArray;
    public Class[] paramsClassTypes;
    public Class returnType;

    public RobustArguments(Object[] objArr, Object obj, boolean z, int i, Class[] clsArr, Class cls) {
        this.paramsArray = objArr;
        this.current = obj;
        this.isStatic = z;
        this.methodNumber = i;
        this.paramsClassTypes = clsArr;
        this.returnType = cls;
    }
}
