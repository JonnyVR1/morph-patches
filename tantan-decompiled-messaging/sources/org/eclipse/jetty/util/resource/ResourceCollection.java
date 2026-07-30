package org.eclipse.jetty.util.resource;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import p149l.aag0;
import p149l.ig3;
import p149l.ock0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ResourceCollection extends Resource {
    private Resource[] _resources;

    public ResourceCollection(Resource... resourceArr) {
        ArrayList arrayList = new ArrayList();
        for (Resource resource : resourceArr) {
            if (resource != null) {
                if (resource instanceof ResourceCollection) {
                    for (Resource resource2 : ((ResourceCollection) resource).getResources()) {
                        arrayList.add(resource2);
                    }
                } else {
                    arrayList.add(resource);
                }
            }
        }
        Resource[] resourceArr2 = (Resource[]) arrayList.toArray(new Resource[arrayList.size()]);
        this._resources = resourceArr2;
        for (Resource resource3 : resourceArr2) {
            if (!resource3.exists() || !resource3.isDirectory()) {
                ock0.m163533a(resource3, " is not an existing directory.");
                throw null;
            }
        }
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public Resource addPath(String str) throws IOException {
        if (this._resources == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        if (str == null) {
            throw new MalformedURLException();
        }
        if (str.length() == 0 || "/".equals(str)) {
            return this;
        }
        int i = 0;
        Resource resourceAddPath = null;
        while (true) {
            Resource[] resourceArr = this._resources;
            if (i >= resourceArr.length) {
                break;
            }
            resourceAddPath = resourceArr[i].addPath(str);
            if (resourceAddPath.exists()) {
                if (resourceAddPath.isDirectory()) {
                    break;
                }
                return resourceAddPath;
            }
            i++;
        }
        int i2 = i + 1;
        ArrayList arrayList = null;
        while (true) {
            Resource[] resourceArr2 = this._resources;
            if (i2 >= resourceArr2.length) {
                break;
            }
            Resource resourceAddPath2 = resourceArr2[i2].addPath(str);
            if (resourceAddPath2.exists() && resourceAddPath2.isDirectory()) {
                if (resourceAddPath != null) {
                    arrayList = new ArrayList();
                    arrayList.add(resourceAddPath);
                    resourceAddPath = null;
                }
                arrayList.add(resourceAddPath2);
            }
            i2++;
        }
        if (resourceAddPath != null) {
            return resourceAddPath;
        }
        if (arrayList != null) {
            return new ResourceCollection((Resource[]) arrayList.toArray(new Resource[arrayList.size()]));
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public void copyTo(File file) throws IOException {
        int length = this._resources.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return;
            }
            this._resources[i].copyTo(file);
            length = i;
        }
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public boolean delete() throws SecurityException {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public boolean exists() {
        if (this._resources != null) {
            return true;
        }
        qkq0.m175383a("*resources* not set.");
        return false;
    }

    public Object findResource(String str) throws IOException {
        int i = 0;
        Resource resourceAddPath = null;
        while (true) {
            Resource[] resourceArr = this._resources;
            if (i >= resourceArr.length) {
                break;
            }
            resourceAddPath = resourceArr[i].addPath(str);
            if (resourceAddPath.exists()) {
                if (resourceAddPath.isDirectory()) {
                    break;
                }
                return resourceAddPath;
            }
            i++;
        }
        int i2 = i + 1;
        ArrayList arrayList = null;
        while (true) {
            Resource[] resourceArr2 = this._resources;
            if (i2 >= resourceArr2.length) {
                break;
            }
            Resource resourceAddPath2 = resourceArr2[i2].addPath(str);
            if (resourceAddPath2.exists() && resourceAddPath2.isDirectory()) {
                if (resourceAddPath != null) {
                    arrayList = new ArrayList();
                    arrayList.add(resourceAddPath);
                }
                arrayList.add(resourceAddPath2);
            }
            i2++;
        }
        if (resourceAddPath != null) {
            return resourceAddPath;
        }
        if (arrayList != null) {
            return arrayList;
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public File getFile() throws IOException {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        for (Resource resource : resourceArr) {
            File file = resource.getFile();
            if (file != null) {
                return file;
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public InputStream getInputStream() throws IOException {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        for (Resource resource : resourceArr) {
            InputStream inputStream = resource.getInputStream();
            if (inputStream != null) {
                return inputStream;
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public String getName() {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        for (Resource resource : resourceArr) {
            String name = resource.getName();
            if (name != null) {
                return name;
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public OutputStream getOutputStream() throws IOException, SecurityException {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        for (Resource resource : resourceArr) {
            OutputStream outputStream = resource.getOutputStream();
            if (outputStream != null) {
                return outputStream;
            }
        }
        return null;
    }

    public Resource[] getResources() {
        return this._resources;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public URL getURL() {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        for (Resource resource : resourceArr) {
            URL url = resource.getURL();
            if (url != null) {
                return url;
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public boolean isContainedIn(Resource resource) throws MalformedURLException {
        return false;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public boolean isDirectory() {
        if (this._resources != null) {
            return true;
        }
        qkq0.m175383a("*resources* not set.");
        return false;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public long lastModified() {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return 0L;
        }
        for (Resource resource : resourceArr) {
            long jLastModified = resource.lastModified();
            if (jLastModified != -1) {
                return jLastModified;
            }
        }
        return -1L;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public long length() {
        return -1L;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public String[] list() {
        if (this._resources == null) {
            qkq0.m175383a("*resources* not set.");
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Resource resource : this._resources) {
            for (String str : resource.list()) {
                hashSet.add(str);
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        Arrays.sort(strArr);
        return strArr;
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public void release() {
        Resource[] resourceArr = this._resources;
        if (resourceArr == null) {
            qkq0.m175383a("*resources* not set.");
            return;
        }
        for (Resource resource : resourceArr) {
            resource.release();
        }
    }

    @Override // org.eclipse.jetty.util.resource.Resource
    public boolean renameTo(Resource resource) throws SecurityException {
        throw new UnsupportedOperationException();
    }

    public void setResources(Resource[] resourceArr) {
        if (resourceArr == null) {
            resourceArr = new Resource[0];
        }
        this._resources = resourceArr;
    }

    public void setResourcesAsCSV(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",;");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens == 0) {
            ig3.m135964a("ResourceCollection@setResourcesAsCSV(String)  argument must be a string containing one or more comma-separated resource strings.");
            return;
        }
        this._resources = new Resource[iCountTokens];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                this._resources[i] = Resource.newResource(stringTokenizer.nextToken().trim());
                if (!this._resources[i].exists() || !this._resources[i].isDirectory()) {
                    throw new IllegalArgumentException(this._resources[i] + " is not an existing directory.");
                }
                i++;
            } catch (Exception e) {
                aag0.m95543a(e);
                return;
            }
        }
    }

    public String toString() {
        Resource[] resourceArr = this._resources;
        return resourceArr == null ? WeJson.EMPTY_ARR : String.valueOf(Arrays.asList(resourceArr));
    }

    public ResourceCollection() {
        this._resources = new Resource[0];
    }

    public ResourceCollection(String[] strArr) {
        this._resources = new Resource[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                this._resources[i] = Resource.newResource(strArr[i]);
                if (!this._resources[i].exists() || !this._resources[i].isDirectory()) {
                    throw new IllegalArgumentException(this._resources[i] + " is not an existing directory.");
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Exception e2) {
                aag0.m95543a(e2);
                throw null;
            }
        }
    }

    public ResourceCollection(String str) {
        setResourcesAsCSV(str);
    }
}
