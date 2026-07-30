package org.eclipse.jetty.util.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import l.ock0;
import org.eclipse.jetty.util.C0746IO;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FileResource extends URLResource {
    private static final Logger LOG = Log.getLogger((Class<?>) FileResource.class);
    private static boolean __checkAliases = true;
    private transient URL _alias;
    private transient boolean _aliasChecked;
    private File _file;

    public FileResource(URL url) throws URISyntaxException, IOException {
        super(url, null);
        this._alias = null;
        this._aliasChecked = false;
        try {
            this._file = new File(new URI(url.toString()));
        } catch (Exception e) {
            LOG.ignore(e);
            try {
                URI uri = new URI("file:" + URIUtil.encodePath(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    this._file = new File(uri);
                } else {
                    this._file = new File("//" + uri.getAuthority() + URIUtil.decodePath(url.getFile()));
                }
            } catch (Exception e2) {
                LOG.ignore(e2);
                checkConnection();
                Permission permission = this._connection.getPermission();
                this._file = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        boolean zIsDirectory = this._file.isDirectory();
        String str = this._urlString;
        if (!zIsDirectory) {
            if (str.endsWith("/")) {
                String str2 = this._urlString;
                this._urlString = str2.substring(0, str2.length() - 1);
                return;
            }
            return;
        }
        if (str.endsWith("/")) {
            return;
        }
        this._urlString += "/";
    }

    public static boolean getCheckAliases() {
        return __checkAliases;
    }

    public static void setCheckAliases(boolean z) {
        __checkAliases = z;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public Resource addPath(String str) throws IOException {
        String strAddPaths;
        URLResource uRLResource;
        String strCanonicalPath = URIUtil.canonicalPath(str);
        if ("/".equals(strCanonicalPath)) {
            return this;
        }
        if (!isDirectory()) {
            uRLResource = (FileResource) super.addPath(strCanonicalPath);
            strAddPaths = uRLResource._urlString;
        } else {
            if (strCanonicalPath == null) {
                throw new MalformedURLException();
            }
            strAddPaths = URIUtil.addPaths(this._urlString, URIUtil.encodePath(strCanonicalPath.startsWith("/") ? strCanonicalPath.substring(1) : strCanonicalPath));
            uRLResource = (URLResource) Resource.newResource(strAddPaths);
        }
        String strEncodePath = URIUtil.encodePath(strCanonicalPath);
        int length = uRLResource.toString().length() - strEncodePath.length();
        int iLastIndexOf = uRLResource._urlString.lastIndexOf(strEncodePath, length);
        if (length != iLastIndexOf && ((length - 1 != iLastIndexOf || strCanonicalPath.endsWith("/") || !uRLResource.isDirectory()) && !(uRLResource instanceof BadResource))) {
            FileResource fileResource = (FileResource) uRLResource;
            fileResource._alias = new URL(strAddPaths);
            fileResource._aliasChecked = true;
        }
        return uRLResource;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public void copyTo(File file) throws IOException {
        if (isDirectory()) {
            C0746IO.copyDir(getFile(), file);
        } else if (file.exists()) {
            ock0.a(file, " exists");
        } else {
            C0746IO.copy(getFile(), file);
        }
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean delete() throws SecurityException {
        return this._file.delete();
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public String encode(String str) {
        return str;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FileResource)) {
            return false;
        }
        Object obj2 = ((FileResource) obj)._file;
        File file = this._file;
        return obj2 == file || (file != null && file.equals(obj2));
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean exists() {
        return this._file.exists();
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public URL getAlias() {
        if (__checkAliases && !this._aliasChecked) {
            try {
                String absolutePath = this._file.getAbsolutePath();
                String canonicalPath = this._file.getCanonicalPath();
                if (absolutePath.length() != canonicalPath.length() || !absolutePath.equals(canonicalPath)) {
                    this._alias = Resource.toURL(new File(canonicalPath));
                }
                this._aliasChecked = true;
                if (this._alias != null) {
                    Logger logger = LOG;
                    if (logger.isDebugEnabled()) {
                        logger.debug("ALIAS abs=".concat(absolutePath), new Object[0]);
                        logger.debug("ALIAS can=".concat(canonicalPath), new Object[0]);
                    }
                }
            } catch (Exception e) {
                LOG.warn(Log.EXCEPTION, e);
                return getURL();
            }
        }
        return this._alias;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public File getFile() {
        return this._file;
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this._file);
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public String getName() {
        return this._file.getAbsolutePath();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public OutputStream getOutputStream() throws IOException, SecurityException {
        return new FileOutputStream(this._file);
    }

    @Override // org.eclipse.jetty.util.resource.URLResource
    public int hashCode() {
        File file = this._file;
        return file == null ? super.hashCode() : file.hashCode();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean isDirectory() {
        return this._file.isDirectory();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public long lastModified() {
        return this._file.lastModified();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public long length() {
        return this._file.length();
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public String[] list() {
        String[] list = this._file.list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return list;
            }
            if (new File(this._file, list[i]).isDirectory() && !list[i].endsWith("/")) {
                list[i] = list[i] + "/";
            }
            length = i;
        }
    }

    @Override // org.eclipse.jetty.util.resource.URLResource, org.eclipse.jetty.util.resource.Resource
    public boolean renameTo(Resource resource) throws SecurityException {
        if (resource instanceof FileResource) {
            return this._file.renameTo(((FileResource) resource)._file);
        }
        return false;
    }

    public FileResource(URL url, URLConnection uRLConnection, File file) {
        super(url, uRLConnection);
        this._alias = null;
        this._aliasChecked = false;
        this._file = file;
        if (!file.isDirectory() || this._urlString.endsWith("/")) {
            return;
        }
        this._urlString += "/";
    }
}
