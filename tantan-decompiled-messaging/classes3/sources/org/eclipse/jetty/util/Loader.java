package org.eclipse.jetty.util;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import org.eclipse.jetty.util.resource.Resource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Loader {
    public static String getClassPath(ClassLoader classLoader) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (classLoader != null && (classLoader instanceof URLClassLoader)) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            if (uRLs != null) {
                for (URL url : uRLs) {
                    File file = Resource.newResource(url).getFile();
                    if (file != null && file.exists()) {
                        if (sb.length() > 0) {
                            sb.append(File.pathSeparatorChar);
                        }
                        sb.append(file.getAbsolutePath());
                    }
                }
            }
            classLoader = classLoader.getParent();
        }
        return sb.toString();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:11:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002f -> B:11:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:13:0x0025
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.net.URL getResource(java.lang.Class<?> r3, java.lang.String r4, boolean r5) throws java.lang.ClassNotFoundException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
        La:
            if (r2 != 0) goto L1d
            if (r0 == 0) goto L1d
            java.net.URL r2 = r0.getResource(r4)
            if (r2 != 0) goto L1b
            if (r5 == 0) goto L1b
            java.lang.ClassLoader r0 = r0.getParent()
            goto La
        L1b:
            r0 = r1
            goto La
        L1d:
            if (r3 != 0) goto L21
        L1f:
            r3 = r1
            goto L25
        L21:
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L25:
            if (r2 != 0) goto L36
            if (r3 == 0) goto L36
            java.net.URL r2 = r3.getResource(r4)
            if (r2 != 0) goto L1f
            if (r5 == 0) goto L1f
            java.lang.ClassLoader r3 = r3.getParent()
            goto L25
        L36:
            if (r2 != 0) goto L3d
            java.net.URL r3 = java.lang.ClassLoader.getSystemResource(r4)
            return r3
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.Loader.getResource(java.lang.Class, java.lang.String, boolean):java.net.URL");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0039 -> B:15:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x003b -> B:15:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x002b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.util.ResourceBundle getResourceBundle(java.lang.Class<?> r5, java.lang.String r6, boolean r7, java.util.Locale r8) throws java.util.MissingResourceException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 != 0) goto L23
            if (r0 == 0) goto L23
            java.util.ResourceBundle r2 = java.util.ResourceBundle.getBundle(r6, r8, r0)     // Catch: java.util.MissingResourceException -> L14
            goto L18
        L14:
            r4 = move-exception
            if (r3 != 0) goto L18
            r3 = r4
        L18:
            if (r2 != 0) goto L21
            if (r7 == 0) goto L21
            java.lang.ClassLoader r0 = r0.getParent()
            goto Lb
        L21:
            r0 = r1
            goto Lb
        L23:
            if (r5 != 0) goto L27
        L25:
            r5 = r1
            goto L2b
        L27:
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L2b:
            if (r2 != 0) goto L42
            if (r5 == 0) goto L42
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r6, r8, r5)     // Catch: java.util.MissingResourceException -> L35
            r2 = r0
            goto L39
        L35:
            r0 = move-exception
            if (r3 != 0) goto L39
            r3 = r0
        L39:
            if (r2 != 0) goto L25
            if (r7 == 0) goto L25
            java.lang.ClassLoader r5 = r5.getParent()
            goto L2b
        L42:
            if (r2 != 0) goto L4d
            java.util.ResourceBundle r2 = java.util.ResourceBundle.getBundle(r6, r8)     // Catch: java.util.MissingResourceException -> L49
            goto L4d
        L49:
            r5 = move-exception
            if (r3 != 0) goto L4d
            r3 = r5
        L4d:
            if (r2 == 0) goto L50
            return r2
        L50:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.Loader.getResourceBundle(java.lang.Class, java.lang.String, boolean, java.util.Locale):java.util.ResourceBundle");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0039 -> B:15:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x003b -> B:15:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x002b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.Class loadClass(java.lang.Class r5, java.lang.String r6, boolean r7) throws java.lang.ClassNotFoundException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 != 0) goto L23
            if (r0 == 0) goto L23
            java.lang.Class r2 = r0.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L14
            goto L18
        L14:
            r4 = move-exception
            if (r3 != 0) goto L18
            r3 = r4
        L18:
            if (r2 != 0) goto L21
            if (r7 == 0) goto L21
            java.lang.ClassLoader r0 = r0.getParent()
            goto Lb
        L21:
            r0 = r1
            goto Lb
        L23:
            if (r5 != 0) goto L27
        L25:
            r5 = r1
            goto L2b
        L27:
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L2b:
            if (r2 != 0) goto L42
            if (r5 == 0) goto L42
            java.lang.Class r0 = r5.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L35
            r2 = r0
            goto L39
        L35:
            r0 = move-exception
            if (r3 != 0) goto L39
            r3 = r0
        L39:
            if (r2 != 0) goto L25
            if (r7 == 0) goto L25
            java.lang.ClassLoader r5 = r5.getParent()
            goto L2b
        L42:
            if (r2 != 0) goto L4d
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L49
            goto L4d
        L49:
            r5 = move-exception
            if (r3 != 0) goto L4d
            r3 = r5
        L4d:
            if (r2 == 0) goto L50
            return r2
        L50:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.Loader.loadClass(java.lang.Class, java.lang.String, boolean):java.lang.Class");
    }

    public static Class loadClass(Class cls, String str) throws ClassNotFoundException {
        return loadClass(cls, str, false);
    }
}
