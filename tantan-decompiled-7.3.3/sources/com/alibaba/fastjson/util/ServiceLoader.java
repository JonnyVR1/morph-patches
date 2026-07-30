package com.alibaba.fastjson.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ServiceLoader {
    private static final String PREFIX = "META-INF/services/";
    private static final Set<String> loadedUrls = new HashSet();

    public static <T> Set<T> load(Class<T> cls, ClassLoader classLoader) {
        if (classLoader == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        String strConcat = PREFIX.concat(cls.getName());
        HashSet hashSet2 = new HashSet();
        try {
            Enumeration<URL> resources = classLoader.getResources(strConcat);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                Set<String> set = loadedUrls;
                if (!set.contains(urlNextElement.toString())) {
                    load(urlNextElement, hashSet2);
                    set.add(urlNextElement.toString());
                }
            }
        } catch (Throwable unused) {
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(classLoader.loadClass((String) it.next()).newInstance());
            } catch (Exception unused2) {
            }
        }
        return hashSet;
    }

    public static void load(URL url, Set<String> set) throws Throwable {
        InputStream inputStreamOpenStream;
        BufferedReader bufferedReader = null;
        try {
            inputStreamOpenStream = url.openStream();
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpenStream, "utf-8"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            IOUtils.close(bufferedReader2);
                            IOUtils.close(inputStreamOpenStream);
                            return;
                        }
                        int iIndexOf = line.indexOf(35);
                        if (iIndexOf >= 0) {
                            line = line.substring(0, iIndexOf);
                        }
                        String strTrim = line.trim();
                        if (strTrim.length() != 0) {
                            set.add(strTrim);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        IOUtils.close(bufferedReader);
                        IOUtils.close(inputStreamOpenStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenStream = null;
        }
    }
}
