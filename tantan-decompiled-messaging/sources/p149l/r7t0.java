package p149l;

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
public final class r7t0 extends o7t0 {

    /* JADX INFO: renamed from: f */
    public static final Set f158079f = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: g */
    public static final DecimalFormat f158080g = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: d */
    public File f158081d;

    /* JADX INFO: renamed from: e */
    public boolean f158082e;

    public r7t0(v5t0 v5t0Var) {
        super(v5t0Var);
        File cacheDir = this.f142541a.getCacheDir();
        if (cacheDir == null) {
            x2t0.m206869g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f158081d = file;
        if (!file.isDirectory() && !this.f158081d.mkdirs()) {
            x2t0.m206869g("Could not create preload cache directory at ".concat(String.valueOf(this.f158081d.getAbsolutePath())));
            this.f158081d = null;
        } else {
            if (this.f158081d.setReadable(true, false) && this.f158081d.setExecutable(true, false)) {
                return;
            }
            x2t0.m206869g("Could not set cache file permissions at ".concat(String.valueOf(this.f158081d.getAbsolutePath())));
            this.f158081d = null;
        }
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: g */
    public final void mo105821g() {
        this.f158082e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.o7t0
    /* JADX INFO: renamed from: u */
    public final boolean mo105822u(final String str) {
        int i;
        String str2;
        FileOutputStream fileOutputStream;
        int i2;
        int responseCode;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.f158081d == null) {
            m163063h(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.f158081d;
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
            if (i <= ((Integer) d1s0.m109677c().m144697a(m7s0.f132414u)).intValue()) {
                File file3 = new File(this.f158081d, i2t0.m134085g(str));
                File fileM178210x = m178210x(file3);
                if (file3.isFile() && fileM178210x.isFile()) {
                    int length = (int) file3.length();
                    x2t0.m206864b("Stream cache hit at ".concat(String.valueOf(str)));
                    m163064j(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.f158081d.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = f158079f;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            x2t0.m206869g("Stream cache already in progress at " + str);
                            m163063h(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str3 = "error";
                        try {
                            HttpURLConnection httpURLConnectionM140828v = cbw0.m106033k().m140828v(new ibw0() { // from class: l.q7t0
                                @Override // p149l.ibw0
                                public final URLConnection zza() throws IOException {
                                    Set set2 = r7t0.f158079f;
                                    vny0.m199087y();
                                    int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132474z)).intValue();
                                    URL url = new URL(str);
                                    int i3 = 0;
                                    while (true) {
                                        i3++;
                                        if (i3 > 20) {
                                            rhg0.m179353a("Too many redirects (20)");
                                            return null;
                                        }
                                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                                        uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                        uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                            rhg0.m179353a("Invalid protocol.");
                                            return null;
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                        w2t0 w2t0Var = new w2t0(null);
                                        w2t0Var.m201224c(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        w2t0Var.m201226e(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (headerField == null) {
                                            rhg0.m179353a("Missing Location header in redirect");
                                            return null;
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            rhg0.m179353a("Protocol is null");
                                            return null;
                                        }
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            rhg0.m179353a("Unsupported scheme: ".concat(protocol));
                                            return null;
                                        }
                                        x2t0.m206864b("Redirecting to ".concat(headerField));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (httpURLConnectionM140828v == null || (responseCode = httpURLConnectionM140828v.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionM140828v.getContentLength();
                                if (contentLength < 0) {
                                    x2t0.m206869g("Stream cache aborted, missing content-length header at " + str);
                                    m163063h(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                String str4 = f158080g.format(contentLength);
                                int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132426v)).intValue();
                                if (contentLength > iIntValue) {
                                    x2t0.m206869g("Content length " + str4 + " exceeds limit at " + str);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(str4);
                                    m163063h(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                x2t0.m206864b("Caching " + str4 + " bytes from " + str);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionM140828v.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    Clock clockM199064b = vny0.m199064b();
                                    long jCurrentTimeMillis = clockM199064b.currentTimeMillis();
                                    tys0 tys0Var = new tys0(((Long) d1s0.m109677c().m144697a(m7s0.f132462y)).longValue());
                                    x6s0 x6s0Var = m7s0.f132450x;
                                    k7s0 k7s0VarM109677c = d1s0.m109677c();
                                    long jLongValue = ((Long) k7s0VarM109677c.m144697a(x6s0Var)).longValue();
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i4 < 0) {
                                            fileOutputStream3.close();
                                            if (x2t0.m206872j(3)) {
                                                x2t0.m206864b("Preloaded " + f158080g.format(i3) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileM178210x.isFile()) {
                                                fileM178210x.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileM178210x.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            m163064j(str, file3.getAbsolutePath(), i3);
                                            f158079f.remove(strConcat);
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
                                            if (clockM199064b.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                String str6 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            FileChannel fileChannel = channel;
                                            if (this.f158082e) {
                                                throw new IOException("abort requested");
                                            }
                                            if (tys0Var.m191070b()) {
                                                fileOutputStream = fileOutputStream3;
                                                try {
                                                    try {
                                                        i2 = i5;
                                                        i2t0.f110583b.post(new i7t0(this, str, file3.getAbsolutePath(), i2, contentLength, false));
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
                                            tys0Var = tys0Var;
                                            jLongValue = jLongValue;
                                        } catch (IOException | RuntimeException e3) {
                                            e = e3;
                                            str2 = k7s0VarM109677c;
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
                            vny0.m199079q().m212290w(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException | NullPointerException unused2) {
                        }
                        if (this.f158082e) {
                            x2t0.m206868f("Preload aborted for URL \"" + str + "\"");
                        } else {
                            x2t0.m206870h("Preload failed for URL \"" + str + "\"", e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            x2t0.m206869g("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                        }
                        m163063h(str, file3.getAbsolutePath(), str3, str2);
                        f158079f.remove(strConcat);
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            File file4 = this.f158081d;
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
                File fileM178210x2 = m178210x(file5);
                if (fileM178210x2.isFile()) {
                    zDelete &= fileM178210x2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        x2t0.m206869g("Unable to expire stream cache");
        m163063h(str, null, "expireFailed", null);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final File m178210x(File file) {
        return new File(this.f158081d, String.valueOf(file.getName()).concat(".done"));
    }
}
