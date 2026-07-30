package org.eclipse.jetty.server;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import org.eclipse.jetty.http.HttpContent;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.ByteArrayBuffer;
import org.eclipse.jetty.p004io.View;
import org.eclipse.jetty.p004io.nio.DirectNIOBuffer;
import org.eclipse.jetty.p004io.nio.IndirectNIOBuffer;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.resource.ResourceFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ResourceCache {
    private static final Logger LOG = Log.getLogger((Class<?>) ResourceCache.class);
    private final ConcurrentMap<String, Content> _cache;
    private final AtomicInteger _cachedFiles;
    private final AtomicInteger _cachedSize;
    private final ResourceFactory _factory;
    private int _maxCacheSize;
    private int _maxCachedFileSize;
    private int _maxCachedFiles;
    private final MimeTypes _mimeTypes;
    private final ResourceCache _parent;
    private boolean _useFileMappedBuffer;

    public class Content implements HttpContent {
        final Buffer _contentType;
        final String _key;
        volatile long _lastAccessed;
        final long _lastModified;
        final Buffer _lastModifiedBytes;
        final int _length;
        final Resource _resource;
        AtomicReference<Buffer> _indirectBuffer = new AtomicReference<>();
        AtomicReference<Buffer> _directBuffer = new AtomicReference<>();

        public Content(String str, Resource resource) {
            this._key = str;
            this._resource = resource;
            this._contentType = ResourceCache.this._mimeTypes.getMimeByExtension(resource.toString());
            boolean zExists = resource.exists();
            long jLastModified = zExists ? resource.lastModified() : -1L;
            this._lastModified = jLastModified;
            this._lastModifiedBytes = jLastModified < 0 ? null : new ByteArrayBuffer(HttpFields.formatDate(jLastModified));
            int length = zExists ? (int) resource.length() : 0;
            this._length = length;
            ResourceCache.this._cachedSize.addAndGet(length);
            ResourceCache.this._cachedFiles.incrementAndGet();
            this._lastAccessed = System.currentTimeMillis();
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public long getContentLength() {
            return this._length;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getContentType() {
            return this._contentType;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getDirectBuffer() {
            Buffer buffer = this._directBuffer.get();
            if (buffer == null) {
                Buffer directBuffer = ResourceCache.this.getDirectBuffer(this._resource);
                if (directBuffer == null) {
                    ResourceCache.LOG.warn("Could not load " + this, new Object[0]);
                } else {
                    buffer = f31.a(this._directBuffer, (Object) null, directBuffer) ? directBuffer : this._directBuffer.get();
                }
            }
            if (buffer == null) {
                return null;
            }
            return new View(buffer);
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getIndirectBuffer() {
            Buffer buffer = this._indirectBuffer.get();
            if (buffer == null) {
                Buffer indirectBuffer = ResourceCache.this.getIndirectBuffer(this._resource);
                if (indirectBuffer == null) {
                    ResourceCache.LOG.warn("Could not load " + this, new Object[0]);
                } else {
                    buffer = f31.a(this._indirectBuffer, (Object) null, indirectBuffer) ? indirectBuffer : this._indirectBuffer.get();
                }
            }
            if (buffer == null) {
                return null;
            }
            return new View(buffer);
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public InputStream getInputStream() throws IOException {
            Buffer indirectBuffer = getIndirectBuffer();
            return (indirectBuffer == null || indirectBuffer.array() == null) ? this._resource.getInputStream() : new ByteArrayInputStream(indirectBuffer.array(), indirectBuffer.getIndex(), indirectBuffer.length());
        }

        public String getKey() {
            return this._key;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getLastModified() {
            return this._lastModifiedBytes;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Resource getResource() {
            return this._resource;
        }

        public void invalidate() {
            ResourceCache.this._cachedSize.addAndGet(-this._length);
            ResourceCache.this._cachedFiles.decrementAndGet();
            this._resource.release();
        }

        public boolean isCached() {
            return this._key != null;
        }

        public boolean isMiss() {
            return false;
        }

        public boolean isValid() {
            if (this._lastModified == this._resource.lastModified()) {
                this._lastAccessed = System.currentTimeMillis();
                return true;
            }
            if (this != ResourceCache.this._cache.remove(this._key)) {
                return false;
            }
            invalidate();
            return false;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public void release() {
        }

        public String toString() {
            Resource resource = this._resource;
            return String.format("%s %s %d %s %s", resource, Boolean.valueOf(resource.exists()), Long.valueOf(this._resource.lastModified()), this._contentType, this._lastModifiedBytes);
        }
    }

    public ResourceCache(ResourceCache resourceCache, ResourceFactory resourceFactory, MimeTypes mimeTypes) {
        this._useFileMappedBuffer = true;
        this._maxCachedFileSize = 4194304;
        this._maxCachedFiles = PKIFailureInfo.wrongIntegrity;
        this._maxCacheSize = 33554432;
        this._factory = resourceFactory;
        this._cache = new ConcurrentHashMap();
        this._cachedSize = new AtomicInteger();
        this._cachedFiles = new AtomicInteger();
        this._mimeTypes = mimeTypes;
        this._parent = resourceCache;
    }

    private HttpContent load(String str, Resource resource) throws IOException {
        if (resource == null || !resource.exists()) {
            return null;
        }
        if (resource.isDirectory() || !isCacheable(resource)) {
            return new HttpContent.ResourceAsHttpContent(resource, this._mimeTypes.getMimeByExtension(resource.toString()), getMaxCachedFileSize());
        }
        Content content = new Content(str, resource);
        shrinkCache();
        Content contentPutIfAbsent = this._cache.putIfAbsent(str, content);
        if (contentPutIfAbsent == null) {
            return content;
        }
        content.invalidate();
        return contentPutIfAbsent;
    }

    private void shrinkCache() {
        while (this._cache.size() > 0) {
            if (this._cachedFiles.get() <= this._maxCachedFiles && this._cachedSize.get() <= this._maxCacheSize) {
                return;
            }
            TreeSet<Content> treeSet = new TreeSet(new Comparator<Content>() { // from class: org.eclipse.jetty.server.ResourceCache.1
                @Override // java.util.Comparator
                public int compare(Content content, Content content2) {
                    if (content._lastAccessed < content2._lastAccessed) {
                        return -1;
                    }
                    if (content._lastAccessed > content2._lastAccessed) {
                        return 1;
                    }
                    if (content._length < content2._length) {
                        return -1;
                    }
                    return content._key.compareTo(content2._key);
                }
            });
            Iterator<Content> it = this._cache.values().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next());
            }
            for (Content content : treeSet) {
                if (this._cachedFiles.get() <= this._maxCachedFiles && this._cachedSize.get() <= this._maxCacheSize) {
                    break;
                } else if (content == this._cache.remove(content.getKey())) {
                    content.invalidate();
                }
            }
        }
    }

    public void flushCache() {
        if (this._cache != null) {
            while (this._cache.size() > 0) {
                Iterator<String> it = this._cache.keySet().iterator();
                while (it.hasNext()) {
                    Content contentRemove = this._cache.remove(it.next());
                    if (contentRemove != null) {
                        contentRemove.invalidate();
                    }
                }
            }
        }
    }

    public int getCachedFiles() {
        return this._cachedFiles.get();
    }

    public int getCachedSize() {
        return this._cachedSize.get();
    }

    public Buffer getDirectBuffer(Resource resource) {
        try {
            if (this._useFileMappedBuffer && resource.getFile() != null) {
                return new DirectNIOBuffer(resource.getFile());
            }
            int length = (int) resource.length();
            if (length >= 0) {
                DirectNIOBuffer directNIOBuffer = new DirectNIOBuffer(length);
                InputStream inputStream = resource.getInputStream();
                directNIOBuffer.readFrom(inputStream, length);
                inputStream.close();
                return directNIOBuffer;
            }
            LOG.warn("invalid resource: " + String.valueOf(resource) + " " + length, new Object[0]);
            return null;
        } catch (IOException e) {
            LOG.warn(e);
            return null;
        }
    }

    public Buffer getIndirectBuffer(Resource resource) {
        try {
            int length = (int) resource.length();
            if (length >= 0) {
                IndirectNIOBuffer indirectNIOBuffer = new IndirectNIOBuffer(length);
                InputStream inputStream = resource.getInputStream();
                indirectNIOBuffer.readFrom(inputStream, length);
                inputStream.close();
                return indirectNIOBuffer;
            }
            LOG.warn("invalid resource: " + String.valueOf(resource) + " " + length, new Object[0]);
            return null;
        } catch (IOException e) {
            LOG.warn(e);
            return null;
        }
    }

    public int getMaxCacheSize() {
        return this._maxCacheSize;
    }

    public int getMaxCachedFileSize() {
        return this._maxCachedFileSize;
    }

    public int getMaxCachedFiles() {
        return this._maxCachedFiles;
    }

    public boolean isCacheable(Resource resource) {
        long length = resource.length();
        return length > 0 && length < ((long) this._maxCachedFileSize) && length < ((long) this._maxCacheSize);
    }

    public boolean isUseFileMappedBuffer() {
        return this._useFileMappedBuffer;
    }

    public HttpContent lookup(String str) throws IOException {
        HttpContent httpContentLookup;
        Content content = this._cache.get(str);
        if (content != null && content.isValid()) {
            return content;
        }
        HttpContent httpContentLoad = load(str, this._factory.getResource(str));
        if (httpContentLoad != null) {
            return httpContentLoad;
        }
        ResourceCache resourceCache = this._parent;
        if (resourceCache == null || (httpContentLookup = resourceCache.lookup(str)) == null) {
            return null;
        }
        return httpContentLookup;
    }

    public void setMaxCacheSize(int i) {
        this._maxCacheSize = i;
        shrinkCache();
    }

    public void setMaxCachedFileSize(int i) {
        this._maxCachedFileSize = i;
        shrinkCache();
    }

    public void setMaxCachedFiles(int i) {
        this._maxCachedFiles = i;
        shrinkCache();
    }

    public void setUseFileMappedBuffer(boolean z) {
        this._useFileMappedBuffer = z;
    }

    public String toString() {
        return "ResourceCache[" + this._parent + "," + this._factory + "]@" + hashCode();
    }

    public ResourceCache(ResourceCache resourceCache, ResourceFactory resourceFactory, MimeTypes mimeTypes, boolean z) {
        this(resourceCache, resourceFactory, mimeTypes);
        setUseFileMappedBuffer(z);
    }
}
