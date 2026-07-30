package org.eclipse.jetty.util.resource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import l.aag0;
import l.ock0;
import org.eclipse.jetty.util.C0746IO;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Resource implements ResourceFactory {
    private static final Logger LOG = Log.getLogger((Class<?>) Resource.class);
    public static boolean __defaultUseCaches = true;
    volatile Object _associate;

    private static String deTag(String str) {
        return StringUtil.replace(StringUtil.replace(str, "<", "&lt;"), ">", "&gt;");
    }

    public static boolean getDefaultUseCaches() {
        return __defaultUseCaches;
    }

    private static String hrefEncodeURI(String str) {
        StringBuffer stringBuffer;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                stringBuffer = null;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\'' || cCharAt == '<' || cCharAt == '>') {
                stringBuffer = new StringBuffer(str.length() << 1);
                break;
            }
            i++;
        }
        if (stringBuffer == null) {
            return str;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == '\"') {
                stringBuffer.append("%22");
            } else if (cCharAt2 == '\'') {
                stringBuffer.append("%27");
            } else if (cCharAt2 == '<') {
                stringBuffer.append("%3C");
            } else if (cCharAt2 != '>') {
                stringBuffer.append(cCharAt2);
            } else {
                stringBuffer.append("%3E");
            }
        }
        return stringBuffer.toString();
    }

    public static boolean isContainedIn(Resource resource, Resource resource2) throws MalformedURLException {
        return resource.isContainedIn(resource2);
    }

    public static Resource newClassPathResource(String str, boolean z, boolean z2) {
        URL resource = Resource.class.getResource(str);
        if (resource == null) {
            try {
                resource = Loader.getResource(Resource.class, str, z2);
            } catch (ClassNotFoundException unused) {
                resource = ClassLoader.getSystemResource(str);
            }
        }
        if (resource == null) {
            return null;
        }
        return newResource(resource, z);
    }

    public static Resource newResource(String str, boolean z) throws IOException {
        try {
            URL url = new URL(str);
            String string = url.toString();
            return (string.length() <= 0 || string.charAt(string.length() + (-1)) == str.charAt(str.length() + (-1)) || (string.charAt(string.length() + (-1)) == '/' && string.charAt(string.length() - 2) == str.charAt(str.length() + (-1))) || (str.charAt(str.length() + (-1)) == '/' && str.charAt(str.length() - 2) == string.charAt(string.length() + (-1)))) ? newResource(url) : new BadResource(url, "Trailing special characters stripped by URL in ".concat(str));
        } catch (MalformedURLException e) {
            if (str.startsWith("ftp:") || str.startsWith("file:") || str.startsWith("jar:")) {
                LOG.warn("Bad Resource: ".concat(str), new Object[0]);
                throw e;
            }
            try {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                File canonicalFile = new File(str).getCanonicalFile();
                URL url2 = toURL(canonicalFile);
                URLConnection uRLConnectionOpenConnection = url2.openConnection();
                uRLConnectionOpenConnection.setUseCaches(z);
                return new FileResource(url2, uRLConnectionOpenConnection, canonicalFile);
            } catch (Exception e2) {
                LOG.debug(Log.EXCEPTION, e2);
                throw e;
            }
        }
    }

    public static Resource newSystemResource(String str) throws IOException {
        URL resource;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                resource = contextClassLoader.getResource(str);
                if (resource == null && str.startsWith("/")) {
                    resource = contextClassLoader.getResource(str.substring(1));
                }
            } catch (IllegalArgumentException unused) {
                resource = null;
            }
        } else {
            resource = null;
        }
        if (resource == null && (contextClassLoader = Resource.class.getClassLoader()) != null && (resource = contextClassLoader.getResource(str)) == null && str.startsWith("/")) {
            resource = contextClassLoader.getResource(str.substring(1));
        }
        if (resource == null && (resource = ClassLoader.getSystemResource(str)) == null && str.startsWith("/")) {
            resource = contextClassLoader.getResource(str.substring(1));
        }
        if (resource == null) {
            return null;
        }
        return newResource(resource);
    }

    public static void setDefaultUseCaches(boolean z) {
        __defaultUseCaches = z;
    }

    public static URL toURL(File file) throws MalformedURLException {
        return file.toURI().toURL();
    }

    public abstract Resource addPath(String str) throws IOException;

    public void copyTo(File file) throws IOException {
        if (file.exists()) {
            ock0.a(file, " exists");
        } else {
            writeTo(new FileOutputStream(file), 0L, -1L);
        }
    }

    public abstract boolean delete() throws SecurityException;

    public String encode(String str) {
        return URIUtil.encodePath(str);
    }

    public abstract boolean exists();

    public void finalize() {
        release();
    }

    public URL getAlias() {
        return null;
    }

    public Object getAssociate() {
        return this._associate;
    }

    public abstract File getFile() throws IOException;

    public abstract InputStream getInputStream() throws IOException;

    public String getListHTML(String str, boolean z) throws IOException {
        String[] list;
        String strCanonicalPath = URIUtil.canonicalPath(str);
        if (strCanonicalPath == null || !isDirectory() || (list = list()) == null) {
            return null;
        }
        Arrays.sort(list);
        String str2 = "Directory: " + deTag(URIUtil.decodePath(strCanonicalPath));
        StringBuilder sb = new StringBuilder(PKIFailureInfo.certConfirmed);
        sb.append("<HTML><HEAD><LINK HREF=\"jetty-dir.css\" REL=\"stylesheet\" TYPE=\"text/css\"/><TITLE>");
        sb.append(str2);
        sb.append("</TITLE></HEAD><BODY>\n<H1>");
        sb.append(str2);
        sb.append("</H1>\n<TABLE BORDER=0>\n");
        if (z) {
            sb.append("<TR><TD><A HREF=\"");
            sb.append(URIUtil.addPaths(strCanonicalPath, "../"));
            sb.append("\">Parent Directory</A></TD><TD></TD><TD></TD></TR>\n");
        }
        String strHrefEncodeURI = hrefEncodeURI(strCanonicalPath);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        for (int i = 0; i < list.length; i++) {
            Resource resourceAddPath = addPath(list[i]);
            sb.append("\n<TR><TD><A HREF=\"");
            String strAddPaths = URIUtil.addPaths(strHrefEncodeURI, URIUtil.encodePath(list[i]));
            sb.append(strAddPaths);
            if (resourceAddPath.isDirectory() && !strAddPaths.endsWith("/")) {
                sb.append("/");
            }
            sb.append("\">");
            sb.append(deTag(list[i]));
            sb.append("&nbsp;</A></TD><TD ALIGN=right>");
            sb.append(resourceAddPath.length());
            sb.append(" bytes&nbsp;</TD><TD>");
            sb.append(dateTimeInstance.format(new Date(resourceAddPath.lastModified())));
            sb.append("</TD></TR>");
        }
        sb.append("</TABLE>\n</BODY></HTML>\n");
        return sb.toString();
    }

    public abstract String getName();

    public abstract OutputStream getOutputStream() throws IOException, SecurityException;

    @Override // org.eclipse.jetty.util.resource.ResourceFactory
    public Resource getResource(String str) {
        try {
            return addPath(str);
        } catch (Exception e) {
            LOG.debug(e);
            return null;
        }
    }

    public URI getURI() {
        try {
            return getURL().toURI();
        } catch (Exception e) {
            aag0.a(e);
            return null;
        }
    }

    public abstract URL getURL();

    public abstract boolean isContainedIn(Resource resource) throws MalformedURLException;

    public abstract boolean isDirectory();

    public abstract long lastModified();

    public abstract long length();

    public abstract String[] list();

    public abstract void release();

    public abstract boolean renameTo(Resource resource) throws SecurityException;

    public void setAssociate(Object obj) {
        this._associate = obj;
    }

    public void writeTo(OutputStream outputStream, long j, long j2) throws IOException {
        InputStream inputStream = getInputStream();
        try {
            inputStream.skip(j);
            if (j2 < 0) {
                C0746IO.copy(inputStream, outputStream);
            } else {
                C0746IO.copy(inputStream, outputStream, j2);
            }
        } finally {
            inputStream.close();
        }
    }

    public static Resource newClassPathResource(String str) {
        return newClassPathResource(str, true, false);
    }

    public static Resource newResource(URL url) throws IOException {
        return newResource(url, __defaultUseCaches);
    }

    public static Resource newResource(URL url, boolean z) {
        if (url == null) {
            return null;
        }
        String externalForm = url.toExternalForm();
        if (externalForm.startsWith("file:")) {
            try {
                return new FileResource(url);
            } catch (Exception e) {
                LOG.debug(Log.EXCEPTION, e);
                return new BadResource(url, e.toString());
            }
        }
        if (externalForm.startsWith("jar:file:")) {
            return new JarFileResource(url, z);
        }
        if (externalForm.startsWith("jar:")) {
            return new JarResource(url, z);
        }
        return new URLResource(url, null, z);
    }

    public static Resource newResource(String str) throws IOException {
        return newResource(str, __defaultUseCaches);
    }

    public static Resource newResource(URI uri) throws IOException {
        return newResource(uri.toURL());
    }

    public static Resource newResource(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        URL url = toURL(canonicalFile);
        return new FileResource(url, url.openConnection(), canonicalFile);
    }
}
