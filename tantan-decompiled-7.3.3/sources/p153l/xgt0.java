package p153l;

import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class xgt0 extends ugt0 {

    /* JADX INFO: renamed from: f */
    public static final Set f194233f = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: g */
    public static final DecimalFormat f194234g = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: d */
    public File f194235d;

    /* JADX INFO: renamed from: e */
    public boolean f194236e;

    public xgt0(bft0 bft0Var) {
        super(bft0Var);
        File cacheDir = this.f178931a.getCacheDir();
        if (cacheDir == null) {
            dct0.m115298g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f194235d = file;
        if (!file.isDirectory() && !this.f194235d.mkdirs()) {
            dct0.m115298g("Could not create preload cache directory at ".concat(String.valueOf(this.f194235d.getAbsolutePath())));
            this.f194235d = null;
        } else {
            if (this.f194235d.setReadable(true, false) && this.f194235d.setExecutable(true, false)) {
                return;
            }
            dct0.m115298g("Could not set cache file permissions at ".concat(String.valueOf(this.f194235d.getAbsolutePath())));
            this.f194235d = null;
        }
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: g */
    public final void mo140035g() {
        this.f194236e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ugt0
    /* JADX INFO: renamed from: u */
    public final boolean mo140036u(final String str) {
        int i;
        String str2;
        FileOutputStream fileOutputStream;
        int i2;
        int responseCode;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.f194235d == null) {
            m195942h(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.f194235d;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((Integer) jas0.m144075c().m176505a(sgs0.f168485u)).intValue()) {
                File file3 = new File(this.f194235d, obt0.m167038g(str));
                File fileM210949x = m210949x(file3);
                if (file3.isFile() && fileM210949x.isFile()) {
                    int length = (int) file3.length();
                    dct0.m115293b("Stream cache hit at ".concat(String.valueOf(str)));
                    m195943j(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.f194235d.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = f194233f;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            dct0.m115298g("Stream cache already in progress at " + str);
                            m195942h(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str3 = "error";
                        try {
                            HttpURLConnection httpURLConnectionM172774v = ikw0.m140428k().m172774v(new okw0() { // from class: l.wgt0
                                @Override // p153l.okw0
                                public final URLConnection zza() throws IOException {
                                    Set set2 = xgt0.f194233f;
                                    bxy0.m106941y();
                                    int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168545z)).intValue();
                                    URL url = new URL(str);
                                    int i3 = 0;
                                    while (true) {
                                        i3++;
                                        if (i3 > 20) {
                                            zpg0.m220844a("Too many redirects (20)");
                                            return null;
                                        }
                                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                                        uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                        uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                            zpg0.m220844a("Invalid protocol.");
                                            return null;
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                        cct0 cct0Var = new cct0(null);
                                        cct0Var.m109071c(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        cct0Var.m109073e(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (headerField == null) {
                                            zpg0.m220844a("Missing Location header in redirect");
                                            return null;
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            zpg0.m220844a("Protocol is null");
                                            return null;
                                        }
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            zpg0.m220844a("Unsupported scheme: ".concat(protocol));
                                            return null;
                                        }
                                        dct0.m115293b("Redirecting to ".concat(headerField));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (httpURLConnectionM172774v == null || (responseCode = httpURLConnectionM172774v.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionM172774v.getContentLength();
                                if (contentLength < 0) {
                                    dct0.m115298g("Stream cache aborted, missing content-length header at " + str);
                                    m195942h(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                String str4 = f194234g.format(contentLength);
                                int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168497v)).intValue();
                                if (contentLength > iIntValue) {
                                    dct0.m115298g("Content length " + str4 + " exceeds limit at " + str);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(str4);
                                    m195942h(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                dct0.m115293b("Caching " + str4 + " bytes from " + str);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionM172774v.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    Clock clockM106918b = bxy0.m106918b();
                                    long jCurrentTimeMillis = clockM106918b.currentTimeMillis();
                                    z7t0 z7t0Var = new z7t0(((Long) jas0.m144075c().m176505a(sgs0.f168533y)).longValue());
                                    dgs0 dgs0Var = sgs0.f168521x;
                                    qgs0 qgs0VarM144075c = jas0.m144075c();
                                    long jLongValue = ((Long) qgs0VarM144075c.m176505a(dgs0Var)).longValue();
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i4 < 0) {
                                            fileOutputStream3.close();
                                            if (dct0.m115301j(3)) {
                                                dct0.m115293b("Preloaded " + f194234g.format(i3) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileM210949x.isFile()) {
                                                fileM210949x.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileM210949x.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            m195943j(str, file3.getAbsolutePath(), i3);
                                            f194233f.remove(strConcat);
                                            return true;
                                        }
                                        int i5 = i3 + i4;
                                        try {
                                            if (i5 > iIntValue) {
                                                String str5 = "File too big for full file cache. Size: " + Integer.toString(i5);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            byteBufferAllocate.flip();
                                            while (channel.write(byteBufferAllocate) > 0) {
                                                i5 = i5;
                                                byteBufferAllocate = byteBufferAllocate;
                                            }
                                            byteBufferAllocate.clear();
                                            if (clockM106918b.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                String str6 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            FileChannel fileChannel = channel;
                                            if (this.f194236e) {
                                                throw new IOException("abort requested");
                                            }
                                            if (z7t0Var.m218918b()) {
                                                fileOutputStream = fileOutputStream3;
                                                try {
                                                    try {
                                                        i2 = i5;
                                                        obt0.f146613b.post(new ogt0(this, str, file3.getAbsolutePath(), i2, contentLength, false));
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (RuntimeException e2) {
                                                    e = e2;
                                                }
                                            } else {
                                                i2 = i5;
                                                fileOutputStream = fileOutputStream3;
                                            }
                                            i3 = i2;
                                            byteBufferAllocate = byteBufferAllocate;
                                            channel = fileChannel;
                                            fileOutputStream3 = fileOutputStream;
                                            z7t0Var = z7t0Var;
                                            jLongValue = jLongValue;
                                        } catch (IOException | RuntimeException e3) {
                                            e = e3;
                                            str2 = qgs0VarM144075c;
                                            fileOutputStream2 = fileOutputStream;
                                        }
                                        fileOutputStream2 = fileOutputStream;
                                        str2 = 0;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    fileOutputStream = fileOutputStream3;
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    fileOutputStream = fileOutputStream3;
                                }
                            } else {
                                str3 = "badUrl";
                                try {
                                    str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException e6) {
                                        e = e6;
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                    }
                                } catch (IOException | RuntimeException e8) {
                                    e = e8;
                                    str2 = 0;
                                }
                            }
                        } catch (IOException | RuntimeException e9) {
                            e = e9;
                            str2 = 0;
                            fileOutputStream2 = null;
                        }
                        if (e instanceof RuntimeException) {
                            bxy0.m106933q().m120275w(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException | NullPointerException unused2) {
                        }
                        if (this.f194236e) {
                            dct0.m115297f("Preload aborted for URL \"" + str + "\"");
                        } else {
                            dct0.m115299h("Preload failed for URL \"" + str + "\"", e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            dct0.m115298g("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                        }
                        m195942h(str, file3.getAbsolutePath(), str3, str2);
                        f194233f.remove(strConcat);
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            File file4 = this.f194235d;
            if (file4 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j) {
                        file5 = file6;
                        j = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileM210949x2 = m210949x(file5);
                if (fileM210949x2.isFile()) {
                    zDelete &= fileM210949x2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        dct0.m115298g("Unable to expire stream cache");
        m195942h(str, null, "expireFailed", null);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final File m210949x(File file) {
        return new File(this.f194235d, String.valueOf(file.getName()).concat(".done"));
    }
}
