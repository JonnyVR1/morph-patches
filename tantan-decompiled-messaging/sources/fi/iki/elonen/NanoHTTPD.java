package fi.iki.elonen;

import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.meituan.robust.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.CharEncoding;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpVersions;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.util.StringUtil;
import p149l.whq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NanoHTTPD {

    /* JADX INFO: renamed from: h */
    private static final Pattern f63160h = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* JADX INFO: renamed from: i */
    private static final Pattern f63161i = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* JADX INFO: renamed from: j */
    private static final Pattern f63162j = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: k */
    private static final Pattern f63163k = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: l */
    private static final Pattern f63164l = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: m */
    private static final Logger f63165m = Logger.getLogger(NanoHTTPD.class.getName());

    /* JADX INFO: renamed from: a */
    private final String f63166a;

    /* JADX INFO: renamed from: b */
    private final int f63167b;

    /* JADX INFO: renamed from: c */
    private volatile ServerSocket f63168c;

    /* JADX INFO: renamed from: d */
    private InterfaceC14904n f63169d = new C14897g();

    /* JADX INFO: renamed from: e */
    private Thread f63170e;

    /* JADX INFO: renamed from: f */
    protected InterfaceC14892b f63171f;

    /* JADX INFO: renamed from: g */
    private InterfaceC14907q f63172g;

    public enum Method {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH;

        public static Method lookup(String str) {
            for (Method method : values()) {
                if (method.toString().equalsIgnoreCase(str)) {
                    return method;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$b */
    public interface InterfaceC14892b {
        /* JADX INFO: renamed from: a */
        void mo86965a(RunnableC14893c runnableC14893c);

        /* JADX INFO: renamed from: b */
        void mo86966b(RunnableC14893c runnableC14893c);

        /* JADX INFO: renamed from: c */
        void mo86967c();
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$c */
    public class RunnableC14893c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final InputStream f63183a;

        /* JADX INFO: renamed from: b */
        private final Socket f63184b;

        private RunnableC14893c(InputStream inputStream, Socket socket) {
            this.f63183a = inputStream;
            this.f63184b = socket;
        }

        /* JADX INFO: renamed from: a */
        public void m86968a() {
            NanoHTTPD.m86937s(this.f63183a);
            NanoHTTPD.m86937s(this.f63184b);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream = null;
            try {
                try {
                    OutputStream outputStream2 = this.f63184b.getOutputStream();
                    try {
                        C14901k c14901k = NanoHTTPD.this.new C14901k(NanoHTTPD.this.f63172g.create(), this.f63183a, outputStream2, this.f63184b.getInetAddress());
                        while (!this.f63184b.isClosed()) {
                            c14901k.m86986i();
                        }
                        NanoHTTPD.m86937s(outputStream2);
                    } catch (Exception e) {
                        e = e;
                        outputStream = outputStream2;
                        if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                            NanoHTTPD.f63165m.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                        NanoHTTPD.m86937s(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = outputStream2;
                        NanoHTTPD.m86937s(outputStream);
                        NanoHTTPD.m86937s(this.f63183a);
                        NanoHTTPD.m86937s(this.f63184b);
                        NanoHTTPD.this.f63171f.mo86965a(this);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                NanoHTTPD.m86937s(this.f63183a);
                NanoHTTPD.m86937s(this.f63184b);
                NanoHTTPD.this.f63171f.mo86965a(this);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$d */
    public static class C14894d {

        /* JADX INFO: renamed from: a */
        private final String f63186a;

        /* JADX INFO: renamed from: b */
        private final String f63187b;

        /* JADX INFO: renamed from: c */
        private final String f63188c;

        /* JADX INFO: renamed from: a */
        public String m86969a() {
            return String.format("%s=%s; expires=%s", this.f63186a, this.f63187b, this.f63188c);
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$e */
    public class C14895e implements Iterable<String> {

        /* JADX INFO: renamed from: a */
        private final HashMap<String, String> f63189a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        private final ArrayList<C14894d> f63190b = new ArrayList<>();

        public C14895e(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(Constants.PACKNAME_END)) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.f63189a.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m86970a(Response response) {
            Iterator<C14894d> it = this.f63190b.iterator();
            while (it.hasNext()) {
                response.m86960b("Set-Cookie", it.next().m86969a());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f63189a.keySet().iterator();
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$f */
    public static class C14896f implements InterfaceC14892b {

        /* JADX INFO: renamed from: a */
        private long f63192a;

        /* JADX INFO: renamed from: b */
        private final List<RunnableC14893c> f63193b = Collections.synchronizedList(new ArrayList());

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14892b
        /* JADX INFO: renamed from: a */
        public void mo86965a(RunnableC14893c runnableC14893c) {
            this.f63193b.remove(runnableC14893c);
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14892b
        /* JADX INFO: renamed from: b */
        public void mo86966b(RunnableC14893c runnableC14893c) {
            this.f63192a++;
            Thread thread = new Thread(runnableC14893c);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f63192a + ")");
            this.f63193b.add(runnableC14893c);
            thread.start();
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14892b
        /* JADX INFO: renamed from: c */
        public void mo86967c() {
            Iterator it = new ArrayList(this.f63193b).iterator();
            while (it.hasNext()) {
                ((RunnableC14893c) it.next()).m86968a();
            }
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$g */
    public static class C14897g implements InterfaceC14904n {
        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14904n
        public ServerSocket create() throws IOException {
            return new ServerSocket();
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$h */
    public static class C14898h implements InterfaceC14905o {

        /* JADX INFO: renamed from: a */
        private final File f63194a;

        /* JADX INFO: renamed from: b */
        private final OutputStream f63195b;

        public C14898h(File file) throws IOException {
            File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
            this.f63194a = fileCreateTempFile;
            this.f63195b = new FileOutputStream(fileCreateTempFile);
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14905o
        public void delete() throws Exception {
            NanoHTTPD.m86937s(this.f63195b);
            if (this.f63194a.delete()) {
                return;
            }
            whq0.m203241a("could not delete temporary file");
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14905o
        public String getName() {
            return this.f63194a.getAbsolutePath();
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$i */
    public static class C14899i implements InterfaceC14906p {

        /* JADX INFO: renamed from: a */
        private final File f63196a;

        /* JADX INFO: renamed from: b */
        private final List<InterfaceC14905o> f63197b;

        public C14899i() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.f63196a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f63197b = new ArrayList();
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14906p
        /* JADX INFO: renamed from: a */
        public InterfaceC14905o mo86971a(String str) throws Exception {
            C14898h c14898h = new C14898h(this.f63196a);
            this.f63197b.add(c14898h);
            return c14898h;
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14906p
        public void clear() {
            Iterator<InterfaceC14905o> it = this.f63197b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().delete();
                } catch (Exception e) {
                    NanoHTTPD.f63165m.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
            this.f63197b.clear();
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$j */
    public class C14900j implements InterfaceC14907q {
        private C14900j() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14907q
        public InterfaceC14906p create() {
            return new C14899i();
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$k */
    public class C14901k implements InterfaceC14902l {

        /* JADX INFO: renamed from: a */
        private final InterfaceC14906p f63199a;

        /* JADX INFO: renamed from: b */
        private final OutputStream f63200b;

        /* JADX INFO: renamed from: c */
        private final BufferedInputStream f63201c;

        /* JADX INFO: renamed from: d */
        private int f63202d;

        /* JADX INFO: renamed from: e */
        private int f63203e;

        /* JADX INFO: renamed from: f */
        private String f63204f;

        /* JADX INFO: renamed from: g */
        private Method f63205g;

        /* JADX INFO: renamed from: h */
        private Map<String, String> f63206h;

        /* JADX INFO: renamed from: i */
        private Map<String, String> f63207i;

        /* JADX INFO: renamed from: j */
        private C14895e f63208j;

        /* JADX INFO: renamed from: k */
        private String f63209k;

        /* JADX INFO: renamed from: l */
        private String f63210l;

        /* JADX INFO: renamed from: m */
        private String f63211m;

        public C14901k(InterfaceC14906p interfaceC14906p, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f63199a = interfaceC14906p;
            this.f63201c = new BufferedInputStream(inputStream, 8192);
            this.f63200b = outputStream;
            this.f63210l = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.f63207i = new HashMap();
        }

        /* JADX INFO: renamed from: f */
        private void m86972f(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws ResponseException {
            String strM86933n;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put(FirebaseAnalytics.Param.METHOD, stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    m86974h(strNextToken.substring(iIndexOf + 1), map2);
                    strM86933n = NanoHTTPD.m86933n(strNextToken.substring(0, iIndexOf));
                } else {
                    strM86933n = NanoHTTPD.m86933n(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.f63211m = stringTokenizer.nextToken();
                } else {
                    this.f63211m = HttpVersions.HTTP_1_1;
                    NanoHTTPD.f63165m.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String line2 = bufferedReader.readLine();
                while (line2 != null && line2.trim().length() > 0) {
                    int iIndexOf2 = line2.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                    }
                    line2 = bufferedReader.readLine();
                }
                map.put("uri", strM86933n);
            } catch (IOException e) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        /* JADX INFO: renamed from: g */
        private void m86973g(String str, String str2, ByteBuffer byteBuffer, Map<String, String> map, Map<String, String> map2) throws Throwable {
            int i;
            try {
                int[] iArrM86977m = m86977m(byteBuffer, str.getBytes());
                int i2 = 2;
                if (iArrM86977m.length < 2) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i3 = 1024;
                byte[] bArr = new byte[1024];
                int i4 = 0;
                int i5 = 0;
                while (i5 < iArrM86977m.length - 1) {
                    byteBuffer.position(iArrM86977m[i5]);
                    int iRemaining = byteBuffer.remaining() < i3 ? byteBuffer.remaining() : i3;
                    byteBuffer.get(bArr, i4, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i4, iRemaining), Charset.forName(str2)), iRemaining);
                    if (!bufferedReader.readLine().contains(str)) {
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String line = bufferedReader.readLine();
                    String strTrim = null;
                    int i6 = i2;
                    String strGroup = null;
                    String strGroup2 = null;
                    while (line != null && line.trim().length() > 0) {
                        Matcher matcher = NanoHTTPD.f63162j.matcher(line);
                        if (matcher.matches()) {
                            Matcher matcher2 = NanoHTTPD.f63164l.matcher(matcher.group(i2));
                            while (matcher2.find()) {
                                int[] iArr = iArrM86977m;
                                String strGroup3 = matcher2.group(1);
                                if (strGroup3.equalsIgnoreCase(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                                    strGroup2 = matcher2.group(2);
                                } else if (strGroup3.equalsIgnoreCase("filename")) {
                                    strGroup = matcher2.group(2);
                                }
                                iArrM86977m = iArr;
                            }
                        }
                        int[] iArr2 = iArrM86977m;
                        Matcher matcher3 = NanoHTTPD.f63163k.matcher(line);
                        if (matcher3.matches()) {
                            i = 2;
                            strTrim = matcher3.group(2).trim();
                        } else {
                            i = 2;
                        }
                        line = bufferedReader.readLine();
                        i6++;
                        i2 = i;
                        iArrM86977m = iArr2;
                    }
                    int[] iArr3 = iArrM86977m;
                    int i7 = i2;
                    int iM86980p = 0;
                    while (true) {
                        int i8 = i6 - 1;
                        if (i6 <= 0) {
                            break;
                        }
                        iM86980p = m86980p(bArr, iM86980p);
                        i6 = i8;
                    }
                    if (iM86980p >= iRemaining - 4) {
                        throw new ResponseException(Response.Status.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i9 = iArr3[i5] + iM86980p;
                    i5++;
                    int i10 = iArr3[i5] - 4;
                    byteBuffer.position(i9);
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i10 - i9];
                        byteBuffer.get(bArr2);
                        map.put(strGroup2, new String(bArr2, str2));
                    } else {
                        String strM86979o = m86979o(byteBuffer, i9, i10 - i9, strGroup);
                        if (map2.containsKey(strGroup2)) {
                            int i11 = i7;
                            while (true) {
                                if (!map2.containsKey(strGroup2 + i11)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            map2.put(strGroup2 + i11, strM86979o);
                        } else {
                            map2.put(strGroup2, strM86979o);
                        }
                        map.put(strGroup2, strGroup);
                    }
                    i2 = i7;
                    iArrM86977m = iArr3;
                    i3 = 1024;
                    i4 = 0;
                }
            } catch (ResponseException e) {
                throw e;
            } catch (Exception e2) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, e2.toString());
            }
        }

        /* JADX INFO: renamed from: h */
        private void m86974h(String str, Map<String, String> map) {
            if (str == null) {
                this.f63209k = "";
                return;
            }
            this.f63209k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf >= 0) {
                    map.put(NanoHTTPD.m86933n(strNextToken.substring(0, iIndexOf)).trim(), NanoHTTPD.m86933n(strNextToken.substring(iIndexOf + 1)));
                } else {
                    map.put(NanoHTTPD.m86933n(strNextToken).trim(), "");
                }
            }
        }

        /* JADX INFO: renamed from: j */
        private int m86975j(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    return 0;
                }
                byte b = bArr[i3];
                if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
                if (b == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        /* JADX INFO: renamed from: k */
        private String m86976k(String str, Pattern pattern, String str2) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(2) : str2;
        }

        /* JADX INFO: renamed from: m */
        private int[] m86977m(ByteBuffer byteBuffer, byte[] bArr) {
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            byte[] bArr2 = new byte[length];
            int iRemaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
            byteBuffer.get(bArr2, 0, iRemaining);
            int length2 = iRemaining - bArr.length;
            int i = 0;
            do {
                for (int i2 = 0; i2 < length2; i2++) {
                    for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                        if (i3 == bArr.length - 1) {
                            int[] iArr2 = new int[iArr.length + 1];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i + i2;
                            iArr = iArr2;
                        }
                    }
                }
                i += length2;
                System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
                length2 = length - bArr.length;
                if (byteBuffer.remaining() < length2) {
                    length2 = byteBuffer.remaining();
                }
                byteBuffer.get(bArr2, bArr.length, length2);
            } while (length2 > 0);
            return iArr;
        }

        /* JADX INFO: renamed from: n */
        private RandomAccessFile m86978n() {
            try {
                return new RandomAccessFile(this.f63199a.mo86971a(null).getName(), "rw");
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        /* JADX INFO: renamed from: o */
        private String m86979o(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
            if (i2 <= 0) {
                return "";
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    InterfaceC14905o interfaceC14905oMo86971a = this.f63199a.mo86971a(str);
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(interfaceC14905oMo86971a.getName());
                    try {
                        FileChannel channel = fileOutputStream2.getChannel();
                        byteBufferDuplicate.position(i).limit(i + i2);
                        channel.write(byteBufferDuplicate.slice());
                        String name = interfaceC14905oMo86971a.getName();
                        NanoHTTPD.m86937s(fileOutputStream2);
                        return name;
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        throw new Error(e);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        NanoHTTPD.m86937s(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: p */
        private int m86980p(byte[] bArr, int i) {
            while (bArr[i] != 10) {
                i++;
            }
            return i + 1;
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        /* JADX INFO: renamed from: a */
        public final String mo86981a() {
            return this.f63204f;
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        /* JADX INFO: renamed from: b */
        public final Map<String, String> mo86982b() {
            return this.f63207i;
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        /* JADX INFO: renamed from: c */
        public final Map<String, String> mo86983c() {
            return this.f63206h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        /* JADX INFO: renamed from: d */
        public void mo86984d(Map<String, String> map) throws Throwable {
            DataOutput dataOutputM86978n;
            ByteArrayOutputStream byteArrayOutputStream;
            RandomAccessFile randomAccessFile;
            ByteBuffer map2;
            StringTokenizer stringTokenizer;
            Object obj = null;
            try {
                long jM86987l = m86987l();
                if (jM86987l < 1024) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutputM86978n = new DataOutputStream(byteArrayOutputStream);
                    randomAccessFile = 0;
                } else {
                    dataOutputM86978n = m86978n();
                    byteArrayOutputStream = null;
                    randomAccessFile = dataOutputM86978n;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.f63203e >= 0 && jM86987l > 0) {
                        int i = this.f63201c.read(bArr, 0, (int) Math.min(jM86987l, 512L));
                        this.f63203e = i;
                        jM86987l -= (long) i;
                        if (i > 0) {
                            dataOutputM86978n.write(bArr, 0, i);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                        randomAccessFile.seek(0L);
                    }
                    ByteBuffer byteBuffer = map2;
                    if (Method.POST.equals(this.f63205g)) {
                        String strNextToken = "";
                        String str = this.f63207i.get("content-type");
                        if (str != null) {
                            stringTokenizer = new StringTokenizer(str, ",; ");
                            if (stringTokenizer.hasMoreTokens()) {
                                strNextToken = stringTokenizer.nextToken();
                            }
                        } else {
                            stringTokenizer = null;
                        }
                        if (!"multipart/form-data".equalsIgnoreCase(strNextToken)) {
                            byte[] bArr2 = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr2);
                            String strTrim = new String(bArr2).trim();
                            if (MimeTypes.FORM_ENCODED.equalsIgnoreCase(strNextToken)) {
                                m86974h(strTrim, this.f63206h);
                            } else if (strTrim.length() != 0) {
                                map.put("postData", strTrim);
                            }
                        } else {
                            if (!stringTokenizer.hasMoreTokens()) {
                                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                            }
                            m86973g(m86976k(str, NanoHTTPD.f63161i, null), m86976k(str, NanoHTTPD.f63160h, CharEncoding.US_ASCII), byteBuffer, this.f63206h, map);
                        }
                    } else if (Method.PUT.equals(this.f63205g)) {
                        map.put("content", m86979o(byteBuffer, 0, byteBuffer.limit(), null));
                    }
                    NanoHTTPD.m86937s(randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    obj = randomAccessFile;
                    NanoHTTPD.m86937s(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        /* JADX INFO: renamed from: e */
        public String mo86985e() {
            return this.f63209k;
        }

        @Override // fi.iki.elonen.NanoHTTPD.InterfaceC14902l
        public final Method getMethod() {
            return this.f63205g;
        }

        /* JADX INFO: renamed from: i */
        public void m86986i() throws IOException {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f63202d = 0;
                        this.f63203e = 0;
                        this.f63201c.mark(8192);
                        try {
                            int i = this.f63201c.read(bArr, 0, 8192);
                            if (i == -1) {
                                NanoHTTPD.m86937s(this.f63201c);
                                NanoHTTPD.m86937s(this.f63200b);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.f63203e + i;
                                this.f63203e = i2;
                                int iM86975j = m86975j(bArr, i2);
                                this.f63202d = iM86975j;
                                if (iM86975j > 0) {
                                    break;
                                }
                                BufferedInputStream bufferedInputStream = this.f63201c;
                                int i3 = this.f63203e;
                                i = bufferedInputStream.read(bArr, i3, 8192 - i3);
                            }
                            if (this.f63202d < this.f63203e) {
                                this.f63201c.reset();
                                this.f63201c.skip(this.f63202d);
                            }
                            this.f63206h = new HashMap();
                            Map<String, String> map = this.f63207i;
                            if (map == null) {
                                this.f63207i = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f63203e)));
                            HashMap map2 = new HashMap();
                            m86972f(bufferedReader, map2, this.f63206h, this.f63207i);
                            String str = this.f63210l;
                            if (str != null) {
                                this.f63207i.put("remote-addr", str);
                                this.f63207i.put("http-client-ip", this.f63210l);
                            }
                            Method methodLookup = Method.lookup(map2.get(FirebaseAnalytics.Param.METHOD));
                            this.f63205g = methodLookup;
                            if (methodLookup == null) {
                                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                            }
                            this.f63204f = map2.get("uri");
                            this.f63208j = NanoHTTPD.this.new C14895e(this.f63207i);
                            String str2 = this.f63207i.get("connection");
                            boolean z2 = this.f63211m.equals(HttpVersions.HTTP_1_1) && (str2 == null || !str2.matches("(?i).*close.*"));
                            Response responseMo86944t = NanoHTTPD.this.mo86944t(this);
                            if (responseMo86944t == null) {
                                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            String str3 = this.f63207i.get("accept-encoding");
                            this.f63208j.m86970a(responseMo86944t);
                            responseMo86944t.m86959I(this.f63205g);
                            if (NanoHTTPD.this.m86939B(responseMo86944t) && str3 != null && str3.contains(HttpHeaderValues.GZIP)) {
                                z = true;
                            }
                            responseMo86944t.m86957F(z);
                            responseMo86944t.m86958H(z2);
                            responseMo86944t.m86963n(this.f63200b);
                            if (!z2 || "close".equalsIgnoreCase(responseMo86944t.m86961d("connection"))) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            NanoHTTPD.m86937s(responseMo86944t);
                            this.f63199a.clear();
                        } catch (Exception unused) {
                            NanoHTTPD.m86937s(this.f63201c);
                            NanoHTTPD.m86937s(this.f63200b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (Throwable th) {
                        NanoHTTPD.m86937s(null);
                        this.f63199a.clear();
                        throw th;
                    }
                } catch (ResponseException e) {
                    NanoHTTPD.m86935q(e.getStatus(), MimeTypes.TEXT_PLAIN, e.getMessage()).m86963n(this.f63200b);
                    NanoHTTPD.m86937s(this.f63200b);
                    NanoHTTPD.m86937s(null);
                    this.f63199a.clear();
                } catch (SocketException e2) {
                    throw e2;
                }
            } catch (SocketTimeoutException e3) {
                throw e3;
            } catch (IOException e4) {
                NanoHTTPD.m86935q(Response.Status.INTERNAL_ERROR, MimeTypes.TEXT_PLAIN, "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).m86963n(this.f63200b);
                NanoHTTPD.m86937s(this.f63200b);
                NanoHTTPD.m86937s(null);
                this.f63199a.clear();
            }
        }

        /* JADX INFO: renamed from: l */
        public long m86987l() {
            if (this.f63207i.containsKey("content-length")) {
                return Long.parseLong(this.f63207i.get("content-length"));
            }
            int i = this.f63202d;
            int i2 = this.f63203e;
            if (i < i2) {
                return i2 - i;
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$l */
    public interface InterfaceC14902l {
        /* JADX INFO: renamed from: a */
        String mo86981a();

        /* JADX INFO: renamed from: b */
        Map<String, String> mo86982b();

        /* JADX INFO: renamed from: c */
        Map<String, String> mo86983c();

        /* JADX INFO: renamed from: d */
        void mo86984d(Map<String, String> map) throws ResponseException, IOException;

        /* JADX INFO: renamed from: e */
        String mo86985e();

        Method getMethod();
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$m */
    public class RunnableC14903m implements Runnable {

        /* JADX INFO: renamed from: a */
        private final int f63213a;

        /* JADX INFO: renamed from: b */
        private IOException f63214b;

        /* JADX INFO: renamed from: c */
        private boolean f63215c;

        private RunnableC14903m(int i) {
            this.f63215c = false;
            this.f63213a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                NanoHTTPD.this.f63168c.bind(NanoHTTPD.this.f63166a != null ? new InetSocketAddress(NanoHTTPD.this.f63166a, NanoHTTPD.this.f63167b) : new InetSocketAddress(NanoHTTPD.this.f63167b));
                this.f63215c = true;
                do {
                    try {
                        Socket socketAccept = NanoHTTPD.this.f63168c.accept();
                        int i = this.f63213a;
                        if (i > 0) {
                            socketAccept.setSoTimeout(i);
                        }
                        InputStream inputStream = socketAccept.getInputStream();
                        NanoHTTPD nanoHTTPD = NanoHTTPD.this;
                        nanoHTTPD.f63171f.mo86966b(nanoHTTPD.m86941l(socketAccept, inputStream));
                    } catch (IOException e) {
                        NanoHTTPD.f63165m.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!NanoHTTPD.this.f63168c.isClosed());
            } catch (IOException e2) {
                this.f63214b = e2;
            }
        }
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$n */
    public interface InterfaceC14904n {
        ServerSocket create() throws IOException;
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$o */
    public interface InterfaceC14905o {
        void delete() throws Exception;

        String getName();
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$p */
    public interface InterfaceC14906p {
        /* JADX INFO: renamed from: a */
        InterfaceC14905o mo86971a(String str) throws Exception;

        void clear();
    }

    /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$q */
    public interface InterfaceC14907q {
        InterfaceC14906p create();
    }

    public NanoHTTPD(String str, int i) {
        this.f63166a = str;
        this.f63167b = i;
        m86947w(new C14900j());
        m86946v(new C14896f());
    }

    /* JADX INFO: renamed from: n */
    public static String m86933n(String str) {
        try {
            return URLDecoder.decode(str, StringUtil.__UTF8Alt);
        } catch (UnsupportedEncodingException e) {
            f63165m.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Response m86934p(Response.InterfaceC14890b interfaceC14890b, String str, InputStream inputStream, long j) {
        return new Response(interfaceC14890b, str, inputStream, j);
    }

    /* JADX INFO: renamed from: q */
    public static Response m86935q(Response.InterfaceC14890b interfaceC14890b, String str, String str2) {
        byte[] bytes;
        if (str2 == null) {
            return m86934p(interfaceC14890b, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            bytes = str2.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            f63165m.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return m86934p(interfaceC14890b, str, new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: r */
    public static Response m86936r(String str) {
        return m86935q(Response.Status.OK, MimeTypes.TEXT_HTML, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m86937s(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                f63165m.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m86938A() {
        try {
            m86937s(this.f63168c);
            this.f63171f.mo86967c();
            Thread thread = this.f63170e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f63165m.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m86939B(Response response) {
        return response.m86962k() != null && response.m86962k().toLowerCase().contains("text/");
    }

    /* JADX INFO: renamed from: C */
    public final boolean m86940C() {
        return (this.f63168c == null || this.f63170e == null) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public RunnableC14893c m86941l(Socket socket, InputStream inputStream) {
        return new RunnableC14893c(inputStream, socket);
    }

    /* JADX INFO: renamed from: m */
    public RunnableC14903m m86942m(int i) {
        return new RunnableC14903m(i);
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC14904n m86943o() {
        return this.f63169d;
    }

    /* JADX INFO: renamed from: t */
    public Response mo86944t(InterfaceC14902l interfaceC14902l) {
        HashMap map = new HashMap();
        Method method = interfaceC14902l.getMethod();
        if (Method.PUT.equals(method) || Method.POST.equals(method)) {
            try {
                interfaceC14902l.mo86984d(map);
            } catch (ResponseException e) {
                return m86935q(e.getStatus(), MimeTypes.TEXT_PLAIN, e.getMessage());
            } catch (IOException e2) {
                return m86935q(Response.Status.INTERNAL_ERROR, MimeTypes.TEXT_PLAIN, "SERVER INTERNAL ERROR: IOException: " + e2.getMessage());
            }
        }
        Map<String, String> mapMo86983c = interfaceC14902l.mo86983c();
        mapMo86983c.put("NanoHttpd.QUERY_STRING", interfaceC14902l.mo86985e());
        return m86945u(interfaceC14902l.mo86981a(), method, interfaceC14902l.mo86982b(), mapMo86983c, map);
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public Response m86945u(String str, Method method, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return m86935q(Response.Status.NOT_FOUND, MimeTypes.TEXT_PLAIN, "Not Found");
    }

    /* JADX INFO: renamed from: v */
    public void m86946v(InterfaceC14892b interfaceC14892b) {
        this.f63171f = interfaceC14892b;
    }

    /* JADX INFO: renamed from: w */
    public void m86947w(InterfaceC14907q interfaceC14907q) {
        this.f63172g = interfaceC14907q;
    }

    /* JADX INFO: renamed from: x */
    public void m86948x() throws IOException {
        m86949y(5000);
    }

    /* JADX INFO: renamed from: y */
    public void m86949y(int i) throws IOException {
        m86950z(i, true);
    }

    /* JADX INFO: renamed from: z */
    public void m86950z(int i, boolean z) throws IOException {
        this.f63168c = m86943o().create();
        this.f63168c.setReuseAddress(true);
        RunnableC14903m runnableC14903mM86942m = m86942m(i);
        Thread thread = new Thread(runnableC14903mM86942m);
        this.f63170e = thread;
        thread.setDaemon(z);
        this.f63170e.setName("NanoHttpd Main Listener");
        this.f63170e.start();
        while (!runnableC14903mM86942m.f63215c && runnableC14903mM86942m.f63214b == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (runnableC14903mM86942m.f63214b != null) {
            throw runnableC14903mM86942m.f63214b;
        }
    }

    public static final class ResponseException extends Exception {
        private static final long serialVersionUID = 6569838532917408380L;
        private final Response.Status status;

        public ResponseException(Response.Status status, String str) {
            super(str);
            this.status = status;
        }

        public Response.Status getStatus() {
            return this.status;
        }

        public ResponseException(Response.Status status, String str, Exception exc) {
            super(str, exc);
            this.status = status;
        }
    }

    public static class Response implements Closeable {

        /* JADX INFO: renamed from: a */
        private InterfaceC14890b f63173a;

        /* JADX INFO: renamed from: b */
        private String f63174b;

        /* JADX INFO: renamed from: c */
        private InputStream f63175c;

        /* JADX INFO: renamed from: d */
        private long f63176d;

        /* JADX INFO: renamed from: e */
        private final Map<String, String> f63177e = new HashMap();

        /* JADX INFO: renamed from: f */
        private Method f63178f;

        /* JADX INFO: renamed from: g */
        private boolean f63179g;

        /* JADX INFO: renamed from: h */
        private boolean f63180h;

        /* JADX INFO: renamed from: i */
        private boolean f63181i;

        public enum Status implements InterfaceC14890b {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(HttpStatus.NOT_MODIFIED_304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED_405, "Method Not Allowed"),
            NOT_ACCEPTABLE(HttpStatus.NOT_ACCEPTABLE_406, "Not Acceptable"),
            REQUEST_TIMEOUT(HttpStatus.REQUEST_TIMEOUT_408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            RANGE_NOT_SATISFIABLE(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            UNSUPPORTED_HTTP_VERSION(HttpStatus.HTTP_VERSION_NOT_SUPPORTED_505, "HTTP Version Not Supported");

            private final String description;
            private final int requestStatus;

            Status(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }

            @Override // fi.iki.elonen.NanoHTTPD.Response.InterfaceC14890b
            public String getDescription() {
                return "" + this.requestStatus + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.description;
            }

            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$Response$b */
        public interface InterfaceC14890b {
            String getDescription();
        }

        public Response(InterfaceC14890b interfaceC14890b, String str, InputStream inputStream, long j) {
            this.f63173a = interfaceC14890b;
            this.f63174b = str;
            if (inputStream == null) {
                this.f63175c = new ByteArrayInputStream(new byte[0]);
                this.f63176d = 0L;
            } else {
                this.f63175c = inputStream;
                this.f63176d = j;
            }
            this.f63179g = this.f63176d < 0;
            this.f63181i = true;
        }

        /* JADX INFO: renamed from: m */
        private static boolean m86951m(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean zEqualsIgnoreCase = false;
            while (it.hasNext()) {
                zEqualsIgnoreCase |= it.next().equalsIgnoreCase(str);
            }
            return zEqualsIgnoreCase;
        }

        /* JADX INFO: renamed from: q */
        private void m86952q(OutputStream outputStream, long j) throws IOException {
            byte[] bArr = new byte[16384];
            boolean z = j == -1;
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                int i = this.f63175c.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (i <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, i);
                if (!z) {
                    j -= (long) i;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        private void m86953t(OutputStream outputStream, long j) throws IOException {
            if (!this.f63180h) {
                m86952q(outputStream, j);
                return;
            }
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            m86952q(gZIPOutputStream, -1L);
            gZIPOutputStream.finish();
        }

        /* JADX INFO: renamed from: u */
        private void m86954u(OutputStream outputStream, long j) throws IOException {
            if (this.f63178f == Method.HEAD || !this.f63179g) {
                m86953t(outputStream, j);
                return;
            }
            C14889a c14889a = new C14889a(outputStream);
            m86953t(c14889a, -1L);
            c14889a.m86964k();
        }

        /* JADX INFO: renamed from: v */
        public static long m86955v(PrintWriter printWriter, Map<String, String> map, long j) {
            for (String str : map.keySet()) {
                if (str.equalsIgnoreCase("content-length")) {
                    try {
                        return Long.parseLong(map.get(str));
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                }
            }
            printWriter.print("Content-Length: " + j + "\r\n");
            return j;
        }

        /* JADX INFO: renamed from: B */
        public void m86956B(boolean z) {
            this.f63179g = z;
        }

        /* JADX INFO: renamed from: F */
        public void m86957F(boolean z) {
            this.f63180h = z;
        }

        /* JADX INFO: renamed from: H */
        public void m86958H(boolean z) {
            this.f63181i = z;
        }

        /* JADX INFO: renamed from: I */
        public void m86959I(Method method) {
            this.f63178f = method;
        }

        /* JADX INFO: renamed from: b */
        public void m86960b(String str, String str2) {
            this.f63177e.put(str, str2);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f63175c;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        /* JADX INFO: renamed from: d */
        public String m86961d(String str) {
            for (String str2 : this.f63177e.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return this.f63177e.get(str2);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        public String m86962k() {
            return this.f63174b;
        }

        /* JADX INFO: renamed from: n */
        public void m86963n(OutputStream outputStream) {
            String str = this.f63174b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f63173a == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8")), false);
                printWriter.print("HTTP/1.1 " + this.f63173a.getDescription() + " \r\n");
                if (str != null) {
                    printWriter.print("Content-Type: " + str + "\r\n");
                }
                Map<String, String> map = this.f63177e;
                if (map == null || map.get("Date") == null) {
                    printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                }
                Map<String, String> map2 = this.f63177e;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        printWriter.print(str2 + ": " + this.f63177e.get(str2) + "\r\n");
                    }
                }
                if (!m86951m(this.f63177e, "connection")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Connection: ");
                    sb.append(this.f63181i ? "keep-alive" : "close");
                    sb.append("\r\n");
                    printWriter.print(sb.toString());
                }
                if (m86951m(this.f63177e, "content-length")) {
                    this.f63180h = false;
                }
                if (this.f63180h) {
                    printWriter.print("Content-Encoding: gzip\r\n");
                    m86956B(true);
                }
                long jM86955v = this.f63175c != null ? this.f63176d : 0L;
                if (this.f63178f != Method.HEAD && this.f63179g) {
                    printWriter.print("Transfer-Encoding: chunked\r\n");
                } else if (!this.f63180h) {
                    jM86955v = m86955v(printWriter, this.f63177e, jM86955v);
                }
                printWriter.print("\r\n");
                printWriter.flush();
                m86954u(outputStream, jM86955v);
                outputStream.flush();
                NanoHTTPD.m86937s(this.f63175c);
            } catch (IOException e) {
                NanoHTTPD.f63165m.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        /* JADX INFO: renamed from: fi.iki.elonen.NanoHTTPD$Response$a */
        public static class C14889a extends FilterOutputStream {
            public C14889a(OutputStream outputStream) {
                super(outputStream);
            }

            /* JADX INFO: renamed from: k */
            public void m86964k() throws IOException {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (i2 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }
        }
    }
}
