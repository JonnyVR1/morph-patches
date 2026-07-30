package com.immomo.mmhttp.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import com.immomo.mmhttp.model.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p149l.lwv;

/* JADX INFO: loaded from: classes7.dex */
public class CacheEntity<T> implements Serializable {
    public static final long CACHE_NEVER_EXPIRE = -1;
    private static final long serialVersionUID = -4337711009801627866L;
    private T data;

    /* JADX INFO: renamed from: id */
    private long f12957id;
    private boolean isExpire;
    private String key;
    private long localExpire;
    private HttpHeaders responseHeaders;

    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[Catch: IOException -> 0x0055, PHI: r1 r3
      0x0059: PHI (r1v20 'e' ??) = (r1v16 'e' ??), (r1v21 'e' ??) binds: [B:25:0x0057, B:41:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v7 java.io.ByteArrayOutputStream) = (r3v5 java.io.ByteArrayOutputStream), (r3v8 java.io.ByteArrayOutputStream) binds: [B:25:0x0057, B:41:0x007a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {IOException -> 0x0055, blocks: (B:40:0x0077, B:26:0x0059, B:22:0x0051), top: B:87:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[Catch: IOException -> 0x0067, TRY_LEAVE, TryCatch #8 {IOException -> 0x0067, blocks: (B:30:0x0063, B:34:0x006b), top: B:90:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[Catch: IOException -> 0x00b6, PHI: r1
      0x00ba: PHI (r1v12 'e' ??) = (r1v10 'e' ??), (r1v13 'e' ??) binds: [B:66:0x00b8, B:82:0x00da] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {IOException -> 0x00b6, blocks: (B:81:0x00d7, B:67:0x00ba, B:63:0x00b2), top: B:85:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc A[Catch: IOException -> 0x00c8, TRY_LEAVE, TryCatch #9 {IOException -> 0x00c8, blocks: (B:71:0x00c4, B:75:0x00cc), top: B:92:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static <T> ContentValues getContentValues(CacheEntity<T> cacheEntity) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.KEY_KEY, cacheEntity.getKey());
        contentValues.put("localExpire", Long.valueOf(cacheEntity.getLocalExpire()));
        HttpHeaders responseHeaders = cacheEntity.getResponseHeaders();
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream = null;
        ObjectOutputStream objectOutputStream4 = null;
        ObjectOutputStream objectOutputStream5 = null;
        objectOutputStream3 = null;
        objectOutputStream3 = null;
        objectOutputStream3 = null;
        try {
            if (responseHeaders != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            try {
                                objectOutputStream.writeObject(responseHeaders);
                                objectOutputStream.flush();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                contentValues.put("head", byteArray);
                                e = byteArray;
                                objectOutputStream2 = objectOutputStream;
                            } catch (IOException e) {
                                e = e;
                                lwv.m152016a(e);
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream4 = objectOutputStream;
                            if (objectOutputStream4 != null) {
                                try {
                                    objectOutputStream4.close();
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                } catch (IOException e2) {
                                    lwv.m152016a(e2);
                                    throw th;
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        objectOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectOutputStream4 != null) {
                            objectOutputStream4.close();
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    byteArrayOutputStream = null;
                    objectOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } else {
                byteArrayOutputStream = null;
                objectOutputStream2 = null;
            }
            if (objectOutputStream2 != null) {
                e = responseHeaders;
                objectOutputStream2.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
        } catch (IOException e5) {
            e = e5;
            lwv.m152016a(e);
        }
        T data = cacheEntity.getData();
        try {
            try {
                if (data != null) {
                    try {
                        e = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream6 = new ObjectOutputStream(e);
                            try {
                                objectOutputStream6.writeObject(data);
                                objectOutputStream6.flush();
                                contentValues.put("data", e.toByteArray());
                                objectOutputStream5 = objectOutputStream6;
                                e = e;
                            } catch (IOException e6) {
                                e = e6;
                                objectOutputStream3 = objectOutputStream6;
                                lwv.m152016a(e);
                                if (objectOutputStream3 != null) {
                                    objectOutputStream3.close();
                                }
                                if (e != 0) {
                                    e.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                objectOutputStream3 = objectOutputStream6;
                                if (objectOutputStream3 != null) {
                                    try {
                                        objectOutputStream3.close();
                                        if (e != 0) {
                                            e.close();
                                        }
                                    } catch (IOException e7) {
                                        lwv.m152016a(e7);
                                        throw th;
                                    }
                                } else if (e != 0) {
                                    e.close();
                                }
                                throw th;
                            }
                        } catch (IOException e8) {
                            e = e8;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        e = 0;
                    } catch (Throwable th5) {
                        th = th5;
                        e = 0;
                    }
                } else {
                    e = 0;
                }
                if (objectOutputStream5 != null) {
                    objectOutputStream5.close();
                }
                if (e != 0) {
                    e.close();
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e10) {
            lwv.m152016a(e10);
        }
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: IOException -> 0x0067, PHI: r3
      0x006b: PHI (r3v5 java.io.ByteArrayInputStream) = (r3v3 java.io.ByteArrayInputStream), (r3v6 java.io.ByteArrayInputStream) binds: [B:25:0x0069, B:41:0x008c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {IOException -> 0x0067, blocks: (B:40:0x0089, B:26:0x006b, B:22:0x0063), top: B:88:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: IOException -> 0x0079, TRY_LEAVE, TryCatch #0 {IOException -> 0x0079, blocks: (B:30:0x0075, B:34:0x007d), top: B:85:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce A[Catch: IOException -> 0x00ca, PHI: r1
      0x00ce: PHI (r1v21 ??) = (r1v19 ??), (r1v22 ??) binds: [B:66:0x00cc, B:82:0x00ee] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {IOException -> 0x00ca, blocks: (B:81:0x00eb, B:67:0x00ce, B:63:0x00c6), top: B:87:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[Catch: IOException -> 0x00dc, TRY_LEAVE, TryCatch #15 {IOException -> 0x00dc, blocks: (B:71:0x00d8, B:75:0x00e0), top: B:95:0x00d8 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.immomo.mmhttp.cache.CacheEntity, com.immomo.mmhttp.cache.CacheEntity<T>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.database.Cursor] */
    public static <T> CacheEntity<T> parseCursorToBean(Cursor cursor) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Exception e;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        ?? r0 = (CacheEntity<T>) new CacheEntity();
        r0.setId(cursor.getInt(cursor.getColumnIndex("_id")));
        r0.setKey(cursor.getString(cursor.getColumnIndex(Constants.KEY_KEY)));
        r0.setLocalExpire(cursor.getLong(cursor.getColumnIndex("localExpire")));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("head"));
        ?? r2 = 0;
         = 0;
        ?? r3 = 0;
        ObjectInputStream objectInputStream3 = null;
        r2 = 0;
        try {
            try {
                if (blob != null) {
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(blob);
                        try {
                            objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
                            try {
                                r0.setResponseHeaders((HttpHeaders) objectInputStream2.readObject());
                            } catch (Exception e2) {
                                e = e2;
                                lwv.m152016a(e);
                                if (objectInputStream2 != null) {
                                    objectInputStream2.close();
                                }
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            objectInputStream2 = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                    if (byteArrayInputStream != null) {
                                        byteArrayInputStream.close();
                                    }
                                } catch (IOException e4) {
                                    lwv.m152016a(e4);
                                    throw th;
                                }
                            } else if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        objectInputStream2 = null;
                        byteArrayInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayInputStream = null;
                    }
                } else {
                    objectInputStream2 = null;
                    byteArrayInputStream = null;
                }
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
            } catch (Throwable th3) {
                th = th3;
                r3 = blob;
            }
        } catch (IOException e6) {
            lwv.m152016a(e6);
        }
        ?? columnIndex = cursor.getColumnIndex("data");
        byte[] blob2 = cursor.getBlob(columnIndex);
        try {
            try {
                if (blob2 != null) {
                    try {
                        columnIndex = new ByteArrayInputStream(blob2);
                        try {
                            objectInputStream = new ObjectInputStream(columnIndex);
                            try {
                                r0.setData(objectInputStream.readObject());
                                objectInputStream3 = objectInputStream;
                                columnIndex = columnIndex;
                            } catch (Exception e7) {
                                e = e7;
                                lwv.m152016a(e);
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                                if (columnIndex != 0) {
                                    columnIndex.close();
                                }
                            }
                        } catch (Exception e8) {
                            e = e8;
                            objectInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    if (columnIndex != 0) {
                                        columnIndex.close();
                                    }
                                } catch (IOException e9) {
                                    lwv.m152016a(e9);
                                    throw th;
                                }
                            } else if (columnIndex != 0) {
                                columnIndex.close();
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        columnIndex = 0;
                        e = e10;
                        objectInputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        columnIndex = 0;
                    }
                } else {
                    columnIndex = 0;
                }
                if (objectInputStream3 != null) {
                    objectInputStream3.close();
                }
                if (columnIndex != 0) {
                    columnIndex.close();
                }
            } catch (Throwable th6) {
                th = th6;
                r2 = blob2;
            }
        } catch (IOException e11) {
            lwv.m152016a(e11);
        }
        return r0;
    }

    public boolean checkExpire(CacheMode cacheMode, long j, long j2) {
        if (cacheMode == CacheMode.DEFAULT) {
            return getLocalExpire() < j2;
        }
        return j != -1 && getLocalExpire() + j < j2;
    }

    public T getData() {
        return this.data;
    }

    public long getId() {
        return this.f12957id;
    }

    public String getKey() {
        return this.key;
    }

    public long getLocalExpire() {
        return this.localExpire;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public boolean isExpire() {
        return this.isExpire;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setExpire(boolean z) {
        this.isExpire = z;
    }

    public void setId(long j) {
        this.f12957id = j;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocalExpire(long j) {
        this.localExpire = j;
    }

    public void setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = httpHeaders;
    }

    public String toString() {
        return "CacheEntity{id=" + this.f12957id + ", key='" + this.key + "', responseHeaders=" + this.responseHeaders + ", data=" + this.data + ", localExpire=" + this.localExpire + '}';
    }
}
