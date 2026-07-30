package org.eclipse.jetty.util.resource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.eclipse.jetty.util.C22074IO;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class JarResource extends URLResource {
    private static final Logger LOG = Log.getLogger((Class<?>) JarResource.class);
    protected JarURLConnection _jarConnection;

    public JarResource(URL url) {
        super(url, null);
    }

    public static Resource newJarResource(Resource resource) throws IOException {
        if (resource instanceof JarResource) {
            return resource;
        }
        return Resource.newResource("jar:" + resource + "!/");
    }

    @Override // org.eclipse.jetty.util.resource.URLResource
    public synchronized boolean checkConnection() {
        super.checkConnection();
        try {
            if (this._jarConnection != this._connection) {
                newConnection();
            }
        } catch (IOException e) {
            LOG.ignore(e);
            this._jarConnection = null;
        }
        return this._jarConnection != null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[PHI: r6 r7
      0x00d2: PHI (r6v5 boolean) = (r6v2 boolean), (r6v6 boolean) binds: [B:46:0x00da, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r7v10 java.lang.String) = (r7v1 java.lang.String), (r7v11 java.lang.String) binds: [B:46:0x00da, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.eclipse.jetty.util.resource.Resource
    public void copyTo(File file) throws Throwable {
        Manifest manifest;
        boolean z;
        if (exists()) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Extract " + this + " to " + file, new Object[0]);
            }
            String strTrim = getURL().toExternalForm().trim();
            int iIndexOf = strTrim.indexOf("!/");
            int i = iIndexOf >= 0 ? 4 : 0;
            if (iIndexOf < 0) {
                zpg0.m220844a("Not a valid jar url: ".concat(strTrim));
                return;
            }
            URL url = new URL(strTrim.substring(i, iIndexOf));
            int i2 = iIndexOf + 2;
            FileOutputStream fileOutputStream = null;
            String strSubstring = i2 < strTrim.length() ? strTrim.substring(i2) : null;
            boolean z2 = strSubstring != null && strSubstring.endsWith("/");
            if (logger.isDebugEnabled()) {
                logger.debug("Extracting entry = " + strSubstring + " from jar " + url, new Object[0]);
            }
            JarInputStream jarInputStream = new JarInputStream(url.openConnection().getInputStream());
            while (true) {
                JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
                if (nextJarEntry == null) {
                    break;
                }
                String name = nextJarEntry.getName();
                if (strSubstring != null && name.startsWith(strSubstring)) {
                    if (!z2 && strSubstring.length() + 1 == name.length() && name.endsWith("/")) {
                        z2 = true;
                    }
                    if (z2) {
                        name = name.substring(strSubstring.length());
                        if (name.equals("")) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (strSubstring == null || name.startsWith(strSubstring)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Logger logger2 = LOG;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Skipping entry: " + name, new Object[0]);
                    }
                } else if (URIUtil.canonicalPath(name.replace('\\', '/')) == null) {
                    Logger logger3 = LOG;
                    if (logger3.isDebugEnabled()) {
                        logger3.debug("Invalid entry: ".concat(name), new Object[0]);
                    }
                } else {
                    File file2 = new File(file, name);
                    if (!nextJarEntry.isDirectory()) {
                        File file3 = new File(file2.getParent());
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                C22074IO.copy(jarInputStream, fileOutputStream2);
                                C22074IO.close(fileOutputStream2);
                                if (nextJarEntry.getTime() >= 0) {
                                    file2.setLastModified(nextJarEntry.getTime());
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                C22074IO.close(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else if (!file2.exists()) {
                        file2.mkdirs();
                    }
                }
            }
            if ((strSubstring == null || strSubstring.equalsIgnoreCase("META-INF/MANIFEST.MF")) && (manifest = jarInputStream.getManifest()) != null) {
                File file4 = new File(file, "META-INF");
                file4.mkdir();
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(file4, "MANIFEST.MF"));
                manifest.write(fileOutputStream3);
                fileOutputStream3.close();
            }
            C22074IO.close(jarInputStream);
        }
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean exists() {
        return this._urlString.endsWith("!/") ? checkConnection() : super.exists();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public File getFile() throws IOException {
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public InputStream getInputStream() throws IOException {
        checkConnection();
        if (!this._urlString.endsWith("!/")) {
            return new FilterInputStream(super.getInputStream()) { // from class: org.eclipse.jetty.util.resource.JarResource.1
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    ((FilterInputStream) this).in = C22074IO.getClosedStream();
                }
            };
        }
        String str = this._urlString;
        return new URL(str.substring(4, str.length() - 2)).openStream();
    }

    public void newConnection() throws IOException {
        this._jarConnection = (JarURLConnection) this._connection;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public synchronized void release() {
        this._jarConnection = null;
        super.release();
    }

    public JarResource(URL url, boolean z) {
        super(url, null, z);
    }
}
