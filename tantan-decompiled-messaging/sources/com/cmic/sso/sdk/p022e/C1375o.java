package com.cmic.sso.sdk.p022e;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.o */
/* JADX INFO: loaded from: classes.dex */
public class C1375o {
    /* JADX INFO: renamed from: a */
    public static String m7301a() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
    }
}
