package com.tencent.liteav.basic.license;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.liteav.basic.util.C14049c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.tencent.liteav.basic.license.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14032c extends AbstractRunnableC14030a {

    /* JADX INFO: renamed from: b */
    private Context f58433b;

    /* JADX INFO: renamed from: c */
    private String f58434c;

    /* JADX INFO: renamed from: d */
    private String f58435d;

    /* JADX INFO: renamed from: e */
    private String f58436e;

    /* JADX INFO: renamed from: f */
    private InterfaceC14031b f58437f;

    /* JADX INFO: renamed from: g */
    private long f58438g;

    /* JADX INFO: renamed from: h */
    private long f58439h;

    /* JADX INFO: renamed from: i */
    private boolean f58440i;

    /* JADX INFO: renamed from: j */
    private String f58441j;

    public C14032c(Context context, String str, String str2, String str3, InterfaceC14031b interfaceC14031b, boolean z, String str4) {
        this.f58433b = context;
        this.f58434c = str;
        this.f58435d = str2;
        this.f58436e = str3;
        this.f58437f = interfaceC14031b;
        this.f58440i = z;
        this.f58441j = str4;
    }

    /* JADX INFO: renamed from: a */
    private void m82960a(Exception exc, int i) {
        InterfaceC14031b interfaceC14031b = this.f58437f;
        if (interfaceC14031b != null) {
            interfaceC14031b.mo82958a((File) null, exc);
        }
        this.f58437f = null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x0184 A[Catch: all -> 0x0178, Exception -> 0x017c, TRY_ENTER, TryCatch #12 {Exception -> 0x017c, blocks: (B:48:0x00cd, B:72:0x0114, B:107:0x0184, B:109:0x0188, B:111:0x0198), top: B:167:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0188 A[Catch: all -> 0x0178, Exception -> 0x017c, TryCatch #12 {Exception -> 0x017c, blocks: (B:48:0x00cd, B:72:0x0114, B:107:0x0184, B:109:0x0188, B:111:0x0198), top: B:167:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0198 A[Catch: all -> 0x0178, Exception -> 0x017c, TRY_LEAVE, TryCatch #12 {Exception -> 0x017c, blocks: (B:48:0x00cd, B:72:0x0114, B:107:0x0184, B:109:0x0188, B:111:0x0198), top: B:167:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b4 A[Catch: IOException -> 0x01fd, TryCatch #16 {IOException -> 0x01fd, blocks: (B:114:0x01af, B:116:0x01b4, B:117:0x01b7, B:119:0x01be), top: B:171:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01be A[Catch: IOException -> 0x01fd, TRY_LEAVE, TryCatch #16 {IOException -> 0x01fd, blocks: (B:114:0x01af, B:116:0x01b4, B:117:0x01b7, B:119:0x01be), top: B:171:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01d4 A[Catch: IOException -> 0x01e3, TryCatch #13 {IOException -> 0x01e3, blocks: (B:128:0x01cf, B:130:0x01d4, B:132:0x01d9, B:133:0x01dc, B:135:0x01e0), top: B:168:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d9 A[Catch: IOException -> 0x01e3, TryCatch #13 {IOException -> 0x01e3, blocks: (B:128:0x01cf, B:130:0x01d4, B:132:0x01d9, B:133:0x01dc, B:135:0x01e0), top: B:168:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01e0 A[Catch: IOException -> 0x01e3, TRY_LEAVE, TryCatch #13 {IOException -> 0x01e3, blocks: (B:128:0x01cf, B:130:0x01d4, B:132:0x01d9, B:133:0x01dc, B:135:0x01e0), top: B:168:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:139:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01eb A[Catch: IOException -> 0x01fa, TryCatch #0 {IOException -> 0x01fa, blocks: (B:138:0x01e6, B:140:0x01eb, B:142:0x01f0, B:143:0x01f3, B:145:0x01f7), top: B:160:0x01e6 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0 A[Catch: IOException -> 0x01fa, TryCatch #0 {IOException -> 0x01fa, blocks: (B:138:0x01e6, B:140:0x01eb, B:142:0x01f0, B:143:0x01f3, B:145:0x01f7), top: B:160:0x01e6 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01f7 A[Catch: IOException -> 0x01fa, TRY_LEAVE, TryCatch #0 {IOException -> 0x01fa, blocks: (B:138:0x01e6, B:140:0x01eb, B:142:0x01f0, B:143:0x01f3, B:145:0x01f7), top: B:160:0x01e6 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x015b A[EDGE_INSN: B:182:0x015b->B:90:0x015b BREAK  A[LOOP:0: B:76:0x0123->B:184:0x0123], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[Catch: all -> 0x0178, Exception -> 0x017c, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x017c, blocks: (B:48:0x00cd, B:72:0x0114, B:107:0x0184, B:109:0x0188, B:111:0x0198), top: B:167:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6 A[Catch: all -> 0x00a5, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:51:0x00db, B:53:0x00e6, B:55:0x00ea, B:63:0x00fc, B:65:0x0102, B:67:0x0106), top: B:162:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea A[Catch: all -> 0x00a5, Exception -> 0x00ee, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ee, blocks: (B:51:0x00db, B:53:0x00e6, B:55:0x00ea, B:63:0x00fc, B:65:0x0102, B:67:0x0106), top: B:162:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc A[Catch: all -> 0x00a5, Exception -> 0x00ee, TRY_ENTER, TryCatch #1 {Exception -> 0x00ee, blocks: (B:51:0x00db, B:53:0x00e6, B:55:0x00ea, B:63:0x00fc, B:65:0x0102, B:67:0x0106), top: B:162:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[Catch: all -> 0x00a5, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:51:0x00db, B:53:0x00e6, B:55:0x00ea, B:63:0x00fc, B:65:0x0102, B:67:0x0106), top: B:162:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0106 A[Catch: all -> 0x00a5, Exception -> 0x00ee, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ee, blocks: (B:51:0x00db, B:53:0x00e6, B:55:0x00ea, B:63:0x00fc, B:65:0x0102, B:67:0x0106), top: B:162:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0114 A[Catch: all -> 0x0178, Exception -> 0x017c, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x017c, blocks: (B:48:0x00cd, B:72:0x0114, B:107:0x0184, B:109:0x0188, B:111:0x0198), top: B:167:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012a A[Catch: all -> 0x014f, Exception -> 0x0154, TryCatch #17 {Exception -> 0x0154, all -> 0x014f, blocks: (B:75:0x0121, B:76:0x0123, B:78:0x012a, B:80:0x0131, B:82:0x0147, B:84:0x014b, B:90:0x015b, B:92:0x0162), top: B:176:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[Catch: all -> 0x014f, Exception -> 0x0154, TryCatch #17 {Exception -> 0x0154, all -> 0x014f, blocks: (B:75:0x0121, B:76:0x0123, B:78:0x012a, B:80:0x0131, B:82:0x0147, B:84:0x014b, B:90:0x015b, B:92:0x0162), top: B:176:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0162 A[Catch: all -> 0x014f, Exception -> 0x0154, TRY_LEAVE, TryCatch #17 {Exception -> 0x0154, all -> 0x014f, blocks: (B:75:0x0121, B:76:0x0123, B:78:0x012a, B:80:0x0131, B:82:0x0147, B:84:0x014b, B:90:0x015b, B:92:0x0162), top: B:176:0x0121 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x0198, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        InterfaceC14031b interfaceC14031b;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r12;
        InterfaceC14031b interfaceC14031b2;
        Exception c14033d;
        int i;
        InterfaceC14031b interfaceC14031b3;
        InterfaceC14031b interfaceC14031b4;
        int responseCode;
        FileOutputStream fileOutputStream2;
        InterfaceC14031b interfaceC14031b5;
        FileOutputStream fileOutputStream3;
        InterfaceC14031b interfaceC14031b6;
        String headerField;
        FileOutputStream fileOutputStream4;
        long contentLength;
        InterfaceC14031b interfaceC14031b7;
        InterfaceC14031b interfaceC14031b8;
        InterfaceC14031b interfaceC14031b9;
        byte[] bArr;
        FileOutputStream fileOutputStream5;
        int i2;
        InterfaceC14031b interfaceC14031b10;
        int i3;
        int i4;
        InterfaceC14031b interfaceC14031b11;
        int i5 = 0;
        FileOutputStream fileOutputStream6 = null;
        fileOutputStream6 = null;
        if (!C14049c.m83024a(this.f58433b) || TextUtils.isEmpty(this.f58434c) || TextUtils.isEmpty(this.f58435d) || TextUtils.isEmpty(this.f58436e) || !this.f58434c.startsWith("http")) {
            m82960a(null, 0);
            return;
        }
        File file = new File(this.f58435d);
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isFile() && (interfaceC14031b = this.f58437f) != null) {
            interfaceC14031b.mo82958a(file, (Exception) null);
            return;
        }
        File file2 = new File(this.f58435d + File.separator + this.f58436e);
        try {
            if (file2.exists()) {
                try {
                    file2.delete();
                    file2.createNewFile();
                    httpURLConnection = (HttpURLConnection) new URL(this.f58434c).openConnection();
                    try {
                        try {
                            if (TextUtils.isEmpty(this.f58441j)) {
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setRequestMethod("GET");
                                responseCode = httpURLConnection.getResponseCode();
                                if (httpURLConnection.getResponseCode() != 200) {
                                }
                                if (i != 0) {
                                    headerField = httpURLConnection.getHeaderField("Last-Modified");
                                    this.f58441j = headerField;
                                    if (this.f58440i) {
                                        contentLength = httpURLConnection.getContentLength();
                                        this.f58438g = contentLength;
                                        if (contentLength <= 0) {
                                            interfaceC14031b9 = this.f58437f;
                                            if (interfaceC14031b9 != null) {
                                                interfaceC14031b9.mo82958a(file2, (Exception) null);
                                            }
                                            httpURLConnection.disconnect();
                                            interfaceC14031b8 = this.f58437f;
                                            if (interfaceC14031b8 == null) {
                                                return;
                                            }
                                        } else {
                                            if (!C14049c.m83023a(contentLength)) {
                                                interfaceC14031b7 = this.f58437f;
                                                if (interfaceC14031b7 != null) {
                                                    interfaceC14031b7.mo82958a(file2, (Exception) null);
                                                }
                                                httpURLConnection.disconnect();
                                                interfaceC14031b8 = this.f58437f;
                                                if (interfaceC14031b8 == null) {
                                                    return;
                                                }
                                            }
                                            inputStream2 = httpURLConnection.getInputStream();
                                            bArr = new byte[8192];
                                            fileOutputStream5 = new FileOutputStream(file2);
                                            this.f58439h = 0L;
                                            while (true) {
                                                i2 = inputStream2.read(bArr);
                                                if (i2 != -1) {
                                                    break;
                                                    break;
                                                }
                                                fileOutputStream5.write(bArr, i5, i2);
                                                if (this.f58440i) {
                                                    long j = this.f58439h;
                                                    long j2 = this.f58438g;
                                                    byte[] bArr2 = bArr;
                                                    i3 = (int) ((j * 100) / j2);
                                                    long j3 = j + ((long) i2);
                                                    this.f58439h = j3;
                                                    i4 = (int) ((j3 * 100) / j2);
                                                    if (i3 != i4) {
                                                        interfaceC14031b11.mo82957a(i4);
                                                    }
                                                    bArr = bArr2;
                                                    i5 = 0;
                                                }
                                            }
                                            fileOutputStream5.flush();
                                            interfaceC14031b10 = this.f58437f;
                                            fileOutputStream3 = fileOutputStream5;
                                            if (interfaceC14031b10 != null) {
                                                interfaceC14031b10.mo82957a(100);
                                                this.f58437f.mo82959a(file2, headerField);
                                                fileOutputStream3 = fileOutputStream5;
                                            }
                                        }
                                        interfaceC14031b8.mo82956a();
                                        return;
                                    }
                                    inputStream2 = httpURLConnection.getInputStream();
                                    bArr = new byte[8192];
                                    fileOutputStream5 = new FileOutputStream(file2);
                                    this.f58439h = 0L;
                                    while (true) {
                                        i2 = inputStream2.read(bArr);
                                        if (i2 != -1) {
                                            break;
                                            break;
                                        }
                                        fileOutputStream5.write(bArr, i5, i2);
                                        if (this.f58440i) {
                                            long j4 = this.f58439h;
                                            long j5 = this.f58438g;
                                            byte[] bArr3 = bArr;
                                            i3 = (int) ((j4 * 100) / j5);
                                            long j6 = j4 + ((long) i2);
                                            this.f58439h = j6;
                                            i4 = (int) ((j6 * 100) / j5);
                                            if (i3 != i4) {
                                                interfaceC14031b11.mo82957a(i4);
                                            }
                                            bArr = bArr3;
                                            i5 = 0;
                                        }
                                    }
                                    fileOutputStream5.flush();
                                    interfaceC14031b10 = this.f58437f;
                                    fileOutputStream3 = fileOutputStream5;
                                    if (interfaceC14031b10 != null) {
                                        interfaceC14031b10.mo82957a(100);
                                        this.f58437f.mo82959a(file2, headerField);
                                        fileOutputStream3 = fileOutputStream5;
                                    }
                                } else {
                                    if (responseCode == 304) {
                                        interfaceC14031b5 = this.f58437f;
                                        if (interfaceC14031b5 != null) {
                                            interfaceC14031b5.mo82957a(100);
                                            this.f58437f.mo82959a((File) null, this.f58441j);
                                        }
                                        inputStream2 = null;
                                        fileOutputStream3 = null;
                                    } else {
                                        c14033d = new C14033d("http status got exception. code = " + responseCode);
                                        inputStream2 = null;
                                        fileOutputStream2 = null;
                                    }
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        httpURLConnection.disconnect();
                                        interfaceC14031b6 = this.f58437f;
                                        if (interfaceC14031b6 != null) {
                                            interfaceC14031b6.mo82956a();
                                        }
                                    } else {
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        httpURLConnection.disconnect();
                                        interfaceC14031b6 = this.f58437f;
                                        if (interfaceC14031b6 != null) {
                                            interfaceC14031b6.mo82956a();
                                        }
                                    }
                                }
                                c14033d = null;
                                fileOutputStream2 = fileOutputStream3;
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    httpURLConnection.disconnect();
                                    interfaceC14031b6 = this.f58437f;
                                    if (interfaceC14031b6 != null) {
                                        interfaceC14031b6.mo82956a();
                                    }
                                } else {
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    httpURLConnection.disconnect();
                                    interfaceC14031b6 = this.f58437f;
                                    if (interfaceC14031b6 != null) {
                                        interfaceC14031b6.mo82956a();
                                    }
                                }
                            } else {
                                try {
                                    try {
                                        httpURLConnection.addRequestProperty("If-Modified-Since", this.f58441j);
                                        httpURLConnection.setConnectTimeout(30000);
                                        httpURLConnection.setReadTimeout(30000);
                                        httpURLConnection.setDoInput(true);
                                        httpURLConnection.setRequestMethod("GET");
                                        responseCode = httpURLConnection.getResponseCode();
                                        i = httpURLConnection.getResponseCode() != 200 ? 0 : 1;
                                        try {
                                            if (i != 0) {
                                                headerField = httpURLConnection.getHeaderField("Last-Modified");
                                                this.f58441j = headerField;
                                                if (this.f58440i) {
                                                    try {
                                                        contentLength = httpURLConnection.getContentLength();
                                                        this.f58438g = contentLength;
                                                        try {
                                                            if (contentLength <= 0) {
                                                                interfaceC14031b9 = this.f58437f;
                                                                if (interfaceC14031b9 != null) {
                                                                    interfaceC14031b9.mo82958a(file2, (Exception) null);
                                                                }
                                                                httpURLConnection.disconnect();
                                                                interfaceC14031b8 = this.f58437f;
                                                                if (interfaceC14031b8 == null) {
                                                                    return;
                                                                }
                                                            } else {
                                                                if (!C14049c.m83023a(contentLength)) {
                                                                    interfaceC14031b7 = this.f58437f;
                                                                    if (interfaceC14031b7 != null) {
                                                                        interfaceC14031b7.mo82958a(file2, (Exception) null);
                                                                    }
                                                                    httpURLConnection.disconnect();
                                                                    interfaceC14031b8 = this.f58437f;
                                                                    if (interfaceC14031b8 == null) {
                                                                        return;
                                                                    }
                                                                }
                                                                inputStream2 = httpURLConnection.getInputStream();
                                                                try {
                                                                    bArr = new byte[8192];
                                                                    fileOutputStream5 = new FileOutputStream(file2);
                                                                    try {
                                                                        this.f58439h = 0L;
                                                                        while (true) {
                                                                            i2 = inputStream2.read(bArr);
                                                                            if (i2 != -1) {
                                                                                break;
                                                                            }
                                                                            fileOutputStream5.write(bArr, i5, i2);
                                                                            if (this.f58440i) {
                                                                                long j7 = this.f58439h;
                                                                                long j8 = this.f58438g;
                                                                                byte[] bArr4 = bArr;
                                                                                i3 = (int) ((j7 * 100) / j8);
                                                                                long j9 = j7 + ((long) i2);
                                                                                this.f58439h = j9;
                                                                                i4 = (int) ((j9 * 100) / j8);
                                                                                if (i3 != i4 && (interfaceC14031b11 = this.f58437f) != null) {
                                                                                    interfaceC14031b11.mo82957a(i4);
                                                                                }
                                                                                bArr = bArr4;
                                                                                i5 = 0;
                                                                            }
                                                                        }
                                                                        fileOutputStream5.flush();
                                                                        interfaceC14031b10 = this.f58437f;
                                                                        fileOutputStream3 = fileOutputStream5;
                                                                        if (interfaceC14031b10 != null) {
                                                                            interfaceC14031b10.mo82957a(100);
                                                                            this.f58437f.mo82959a(file2, headerField);
                                                                            fileOutputStream3 = fileOutputStream5;
                                                                        }
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        fileOutputStream4 = fileOutputStream5;
                                                                        i5 = i;
                                                                        r12 = fileOutputStream4;
                                                                        if (r12 != 0) {
                                                                            try {
                                                                                r12.close();
                                                                                if (inputStream2 != null) {
                                                                                    inputStream2.close();
                                                                                }
                                                                                if (httpURLConnection != null) {
                                                                                    httpURLConnection.disconnect();
                                                                                }
                                                                                interfaceC14031b3 = this.f58437f;
                                                                                if (interfaceC14031b3 != null) {
                                                                                    interfaceC14031b3.mo82956a();
                                                                                }
                                                                            } catch (IOException unused) {
                                                                                c14033d = e;
                                                                                i = i5;
                                                                                if (i == 0) {
                                                                                }
                                                                                interfaceC14031b4.mo82958a(file2, (Exception) null);
                                                                            }
                                                                        } else {
                                                                            if (inputStream2 != null) {
                                                                                inputStream2.close();
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            interfaceC14031b3 = this.f58437f;
                                                                            if (interfaceC14031b3 != null) {
                                                                                interfaceC14031b3.mo82956a();
                                                                            }
                                                                        }
                                                                        c14033d = e;
                                                                        i = i5;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        inputStream = inputStream2;
                                                                        fileOutputStream6 = fileOutputStream5;
                                                                        if (fileOutputStream6 != null) {
                                                                            try {
                                                                                fileOutputStream6.close();
                                                                                if (inputStream != null) {
                                                                                    inputStream.close();
                                                                                }
                                                                                if (httpURLConnection != null) {
                                                                                    httpURLConnection.disconnect();
                                                                                }
                                                                                interfaceC14031b2 = this.f58437f;
                                                                                if (interfaceC14031b2 != null) {
                                                                                    interfaceC14031b2.mo82956a();
                                                                                }
                                                                            } catch (IOException unused2) {
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            interfaceC14031b2 = this.f58437f;
                                                                            if (interfaceC14031b2 != null) {
                                                                                interfaceC14031b2.mo82956a();
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    i5 = i;
                                                                    r12 = 0;
                                                                    if (r12 != 0) {
                                                                        r12.close();
                                                                        if (inputStream2 != null) {
                                                                            inputStream2.close();
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        interfaceC14031b3 = this.f58437f;
                                                                        if (interfaceC14031b3 != null) {
                                                                            interfaceC14031b3.mo82956a();
                                                                        }
                                                                    } else {
                                                                        if (inputStream2 != null) {
                                                                            inputStream2.close();
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        interfaceC14031b3 = this.f58437f;
                                                                        if (interfaceC14031b3 != null) {
                                                                            interfaceC14031b3.mo82956a();
                                                                        }
                                                                    }
                                                                    c14033d = e;
                                                                    i = i5;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    inputStream = inputStream2;
                                                                    fileOutputStream6 = null;
                                                                }
                                                            }
                                                            interfaceC14031b8.mo82956a();
                                                            return;
                                                        } catch (IOException unused3) {
                                                            return;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        inputStream2 = null;
                                                        fileOutputStream4 = null;
                                                        i5 = i;
                                                        r12 = fileOutputStream4;
                                                        if (r12 != 0) {
                                                            r12.close();
                                                            if (inputStream2 != null) {
                                                                inputStream2.close();
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            interfaceC14031b3 = this.f58437f;
                                                            if (interfaceC14031b3 != null) {
                                                                interfaceC14031b3.mo82956a();
                                                            }
                                                        } else {
                                                            if (inputStream2 != null) {
                                                                inputStream2.close();
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            interfaceC14031b3 = this.f58437f;
                                                            if (interfaceC14031b3 != null) {
                                                                interfaceC14031b3.mo82956a();
                                                            }
                                                        }
                                                        c14033d = e;
                                                        i = i5;
                                                        if (i == 0) {
                                                        }
                                                        interfaceC14031b4.mo82958a(file2, (Exception) null);
                                                    }
                                                }
                                                inputStream2 = httpURLConnection.getInputStream();
                                                bArr = new byte[8192];
                                                fileOutputStream5 = new FileOutputStream(file2);
                                                this.f58439h = 0L;
                                                while (true) {
                                                    i2 = inputStream2.read(bArr);
                                                    if (i2 != -1) {
                                                        break;
                                                        break;
                                                    }
                                                    fileOutputStream5.write(bArr, i5, i2);
                                                    if (this.f58440i) {
                                                        long j10 = this.f58439h;
                                                        long j11 = this.f58438g;
                                                        byte[] bArr5 = bArr;
                                                        i3 = (int) ((j10 * 100) / j11);
                                                        long j12 = j10 + ((long) i2);
                                                        this.f58439h = j12;
                                                        i4 = (int) ((j12 * 100) / j11);
                                                        if (i3 != i4) {
                                                            interfaceC14031b11.mo82957a(i4);
                                                        }
                                                        bArr = bArr5;
                                                        i5 = 0;
                                                    }
                                                }
                                                fileOutputStream5.flush();
                                                interfaceC14031b10 = this.f58437f;
                                                fileOutputStream3 = fileOutputStream5;
                                                if (interfaceC14031b10 != null) {
                                                    interfaceC14031b10.mo82957a(100);
                                                    this.f58437f.mo82959a(file2, headerField);
                                                    fileOutputStream3 = fileOutputStream5;
                                                }
                                            } else {
                                                if (responseCode == 304) {
                                                    interfaceC14031b5 = this.f58437f;
                                                    if (interfaceC14031b5 != null) {
                                                        interfaceC14031b5.mo82957a(100);
                                                        this.f58437f.mo82959a((File) null, this.f58441j);
                                                    }
                                                    inputStream2 = null;
                                                    fileOutputStream3 = null;
                                                } else {
                                                    c14033d = new C14033d("http status got exception. code = " + responseCode);
                                                    inputStream2 = null;
                                                    fileOutputStream2 = null;
                                                }
                                                if (fileOutputStream2 != null) {
                                                    try {
                                                        fileOutputStream2.close();
                                                        if (inputStream2 != null) {
                                                            inputStream2.close();
                                                        }
                                                        httpURLConnection.disconnect();
                                                        interfaceC14031b6 = this.f58437f;
                                                        if (interfaceC14031b6 != null) {
                                                            interfaceC14031b6.mo82956a();
                                                        }
                                                    } catch (IOException unused4) {
                                                    }
                                                } else {
                                                    if (inputStream2 != null) {
                                                        inputStream2.close();
                                                    }
                                                    httpURLConnection.disconnect();
                                                    interfaceC14031b6 = this.f58437f;
                                                    if (interfaceC14031b6 != null) {
                                                        interfaceC14031b6.mo82956a();
                                                    }
                                                }
                                            }
                                            c14033d = null;
                                            fileOutputStream2 = fileOutputStream3;
                                            if (fileOutputStream2 != null) {
                                                fileOutputStream2.close();
                                                if (inputStream2 != null) {
                                                    inputStream2.close();
                                                }
                                                httpURLConnection.disconnect();
                                                interfaceC14031b6 = this.f58437f;
                                                if (interfaceC14031b6 != null) {
                                                    interfaceC14031b6.mo82956a();
                                                }
                                            } else {
                                                if (inputStream2 != null) {
                                                    inputStream2.close();
                                                }
                                                httpURLConnection.disconnect();
                                                interfaceC14031b6 = this.f58437f;
                                                if (interfaceC14031b6 != null) {
                                                    interfaceC14031b6.mo82956a();
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            i5 = i;
                                            inputStream2 = null;
                                            r12 = 0;
                                            if (r12 != 0) {
                                                r12.close();
                                                if (inputStream2 != null) {
                                                    inputStream2.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                interfaceC14031b3 = this.f58437f;
                                                if (interfaceC14031b3 != null) {
                                                    interfaceC14031b3.mo82956a();
                                                }
                                            } else {
                                                if (inputStream2 != null) {
                                                    inputStream2.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                interfaceC14031b3 = this.f58437f;
                                                if (interfaceC14031b3 != null) {
                                                    interfaceC14031b3.mo82956a();
                                                }
                                            }
                                            c14033d = e;
                                            i = i5;
                                            if (i == 0) {
                                            }
                                            interfaceC14031b4.mo82958a(file2, (Exception) null);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                        if (fileOutputStream6 != null) {
                                            fileOutputStream6.close();
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            interfaceC14031b2 = this.f58437f;
                                            if (interfaceC14031b2 != null) {
                                                interfaceC14031b2.mo82956a();
                                            }
                                        } else {
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            interfaceC14031b2 = this.f58437f;
                                            if (interfaceC14031b2 != null) {
                                                interfaceC14031b2.mo82956a();
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    inputStream2 = null;
                                    r12 = inputStream2;
                                    if (r12 != 0) {
                                        r12.close();
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        interfaceC14031b3 = this.f58437f;
                                        if (interfaceC14031b3 != null) {
                                            interfaceC14031b3.mo82956a();
                                        }
                                    } else {
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        interfaceC14031b3 = this.f58437f;
                                        if (interfaceC14031b3 != null) {
                                            interfaceC14031b3.mo82956a();
                                        }
                                    }
                                    c14033d = e;
                                    i = i5;
                                    if (i == 0) {
                                    }
                                    interfaceC14031b4.mo82958a(file2, (Exception) null);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                            inputStream = null;
                            fileOutputStream6 = fileOutputStream;
                            if (fileOutputStream6 != null) {
                                fileOutputStream6.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                interfaceC14031b2 = this.f58437f;
                                if (interfaceC14031b2 != null) {
                                    interfaceC14031b2.mo82956a();
                                }
                            } else {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                interfaceC14031b2 = this.f58437f;
                                if (interfaceC14031b2 != null) {
                                    interfaceC14031b2.mo82956a();
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        i5 = 0;
                    }
                } catch (Exception e7) {
                    e = e7;
                    httpURLConnection = null;
                    inputStream2 = null;
                    r12 = inputStream2;
                    if (r12 != 0) {
                        r12.close();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        interfaceC14031b3 = this.f58437f;
                        if (interfaceC14031b3 != null) {
                            interfaceC14031b3.mo82956a();
                        }
                    } else {
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        interfaceC14031b3 = this.f58437f;
                        if (interfaceC14031b3 != null) {
                            interfaceC14031b3.mo82956a();
                        }
                    }
                    c14033d = e;
                    i = i5;
                    if (i == 0) {
                    }
                    interfaceC14031b4.mo82958a(file2, (Exception) null);
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = null;
                    inputStream = null;
                    if (fileOutputStream6 != null) {
                        fileOutputStream6.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        interfaceC14031b2 = this.f58437f;
                        if (interfaceC14031b2 != null) {
                            interfaceC14031b2.mo82956a();
                        }
                    } else {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        interfaceC14031b2 = this.f58437f;
                        if (interfaceC14031b2 != null) {
                            interfaceC14031b2.mo82956a();
                        }
                    }
                    throw th;
                }
            } else {
                file2.createNewFile();
                httpURLConnection = (HttpURLConnection) new URL(this.f58434c).openConnection();
                if (TextUtils.isEmpty(this.f58441j)) {
                    httpURLConnection.addRequestProperty("If-Modified-Since", this.f58441j);
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestMethod("GET");
                    responseCode = httpURLConnection.getResponseCode();
                    if (httpURLConnection.getResponseCode() != 200) {
                    }
                    if (i != 0) {
                        headerField = httpURLConnection.getHeaderField("Last-Modified");
                        this.f58441j = headerField;
                        if (this.f58440i) {
                            contentLength = httpURLConnection.getContentLength();
                            this.f58438g = contentLength;
                            if (contentLength <= 0) {
                                interfaceC14031b9 = this.f58437f;
                                if (interfaceC14031b9 != null) {
                                    interfaceC14031b9.mo82958a(file2, (Exception) null);
                                }
                                httpURLConnection.disconnect();
                                interfaceC14031b8 = this.f58437f;
                                if (interfaceC14031b8 == null) {
                                    return;
                                }
                            } else {
                                if (!C14049c.m83023a(contentLength)) {
                                    interfaceC14031b7 = this.f58437f;
                                    if (interfaceC14031b7 != null) {
                                        interfaceC14031b7.mo82958a(file2, (Exception) null);
                                    }
                                    httpURLConnection.disconnect();
                                    interfaceC14031b8 = this.f58437f;
                                    if (interfaceC14031b8 == null) {
                                        return;
                                    }
                                }
                                inputStream2 = httpURLConnection.getInputStream();
                                bArr = new byte[8192];
                                fileOutputStream5 = new FileOutputStream(file2);
                                this.f58439h = 0L;
                                while (true) {
                                    i2 = inputStream2.read(bArr);
                                    if (i2 != -1) {
                                        break;
                                        break;
                                    }
                                    fileOutputStream5.write(bArr, i5, i2);
                                    if (this.f58440i) {
                                        long j13 = this.f58439h;
                                        long j14 = this.f58438g;
                                        byte[] bArr6 = bArr;
                                        i3 = (int) ((j13 * 100) / j14);
                                        long j15 = j13 + ((long) i2);
                                        this.f58439h = j15;
                                        i4 = (int) ((j15 * 100) / j14);
                                        if (i3 != i4) {
                                            interfaceC14031b11.mo82957a(i4);
                                        }
                                        bArr = bArr6;
                                        i5 = 0;
                                    }
                                }
                                fileOutputStream5.flush();
                                interfaceC14031b10 = this.f58437f;
                                fileOutputStream3 = fileOutputStream5;
                                if (interfaceC14031b10 != null) {
                                    interfaceC14031b10.mo82957a(100);
                                    this.f58437f.mo82959a(file2, headerField);
                                    fileOutputStream3 = fileOutputStream5;
                                }
                            }
                            interfaceC14031b8.mo82956a();
                            return;
                        }
                        inputStream2 = httpURLConnection.getInputStream();
                        bArr = new byte[8192];
                        fileOutputStream5 = new FileOutputStream(file2);
                        this.f58439h = 0L;
                        while (true) {
                            i2 = inputStream2.read(bArr);
                            if (i2 != -1) {
                                break;
                                break;
                            }
                            fileOutputStream5.write(bArr, i5, i2);
                            if (this.f58440i) {
                                long j16 = this.f58439h;
                                long j17 = this.f58438g;
                                byte[] bArr7 = bArr;
                                i3 = (int) ((j16 * 100) / j17);
                                long j18 = j16 + ((long) i2);
                                this.f58439h = j18;
                                i4 = (int) ((j18 * 100) / j17);
                                if (i3 != i4) {
                                    interfaceC14031b11.mo82957a(i4);
                                }
                                bArr = bArr7;
                                i5 = 0;
                            }
                        }
                        fileOutputStream5.flush();
                        interfaceC14031b10 = this.f58437f;
                        fileOutputStream3 = fileOutputStream5;
                        if (interfaceC14031b10 != null) {
                            interfaceC14031b10.mo82957a(100);
                            this.f58437f.mo82959a(file2, headerField);
                            fileOutputStream3 = fileOutputStream5;
                        }
                    } else {
                        if (responseCode == 304) {
                            interfaceC14031b5 = this.f58437f;
                            if (interfaceC14031b5 != null) {
                                interfaceC14031b5.mo82957a(100);
                                this.f58437f.mo82959a((File) null, this.f58441j);
                            }
                            inputStream2 = null;
                            fileOutputStream3 = null;
                        } else {
                            c14033d = new C14033d("http status got exception. code = " + responseCode);
                            inputStream2 = null;
                            fileOutputStream2 = null;
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                            interfaceC14031b6 = this.f58437f;
                            if (interfaceC14031b6 != null) {
                                interfaceC14031b6.mo82956a();
                            }
                        } else {
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                            interfaceC14031b6 = this.f58437f;
                            if (interfaceC14031b6 != null) {
                                interfaceC14031b6.mo82956a();
                            }
                        }
                    }
                    c14033d = null;
                    fileOutputStream2 = fileOutputStream3;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection.disconnect();
                        interfaceC14031b6 = this.f58437f;
                        if (interfaceC14031b6 != null) {
                            interfaceC14031b6.mo82956a();
                        }
                    } else {
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection.disconnect();
                        interfaceC14031b6 = this.f58437f;
                        if (interfaceC14031b6 != null) {
                            interfaceC14031b6.mo82956a();
                        }
                    }
                } else {
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestMethod("GET");
                    responseCode = httpURLConnection.getResponseCode();
                    if (httpURLConnection.getResponseCode() != 200) {
                    }
                    if (i != 0) {
                        headerField = httpURLConnection.getHeaderField("Last-Modified");
                        this.f58441j = headerField;
                        if (this.f58440i) {
                            contentLength = httpURLConnection.getContentLength();
                            this.f58438g = contentLength;
                            if (contentLength <= 0) {
                                interfaceC14031b9 = this.f58437f;
                                if (interfaceC14031b9 != null) {
                                    interfaceC14031b9.mo82958a(file2, (Exception) null);
                                }
                                httpURLConnection.disconnect();
                                interfaceC14031b8 = this.f58437f;
                                if (interfaceC14031b8 == null) {
                                    return;
                                }
                            } else {
                                if (!C14049c.m83023a(contentLength)) {
                                    interfaceC14031b7 = this.f58437f;
                                    if (interfaceC14031b7 != null) {
                                        interfaceC14031b7.mo82958a(file2, (Exception) null);
                                    }
                                    httpURLConnection.disconnect();
                                    interfaceC14031b8 = this.f58437f;
                                    if (interfaceC14031b8 == null) {
                                        return;
                                    }
                                }
                                inputStream2 = httpURLConnection.getInputStream();
                                bArr = new byte[8192];
                                fileOutputStream5 = new FileOutputStream(file2);
                                this.f58439h = 0L;
                                while (true) {
                                    i2 = inputStream2.read(bArr);
                                    if (i2 != -1) {
                                        break;
                                        break;
                                    }
                                    fileOutputStream5.write(bArr, i5, i2);
                                    if (this.f58440i) {
                                        long j19 = this.f58439h;
                                        long j110 = this.f58438g;
                                        byte[] bArr8 = bArr;
                                        i3 = (int) ((j19 * 100) / j110);
                                        long j111 = j19 + ((long) i2);
                                        this.f58439h = j111;
                                        i4 = (int) ((j111 * 100) / j110);
                                        if (i3 != i4) {
                                            interfaceC14031b11.mo82957a(i4);
                                        }
                                        bArr = bArr8;
                                        i5 = 0;
                                    }
                                }
                                fileOutputStream5.flush();
                                interfaceC14031b10 = this.f58437f;
                                fileOutputStream3 = fileOutputStream5;
                                if (interfaceC14031b10 != null) {
                                    interfaceC14031b10.mo82957a(100);
                                    this.f58437f.mo82959a(file2, headerField);
                                    fileOutputStream3 = fileOutputStream5;
                                }
                            }
                            interfaceC14031b8.mo82956a();
                            return;
                        }
                        inputStream2 = httpURLConnection.getInputStream();
                        bArr = new byte[8192];
                        fileOutputStream5 = new FileOutputStream(file2);
                        this.f58439h = 0L;
                        while (true) {
                            i2 = inputStream2.read(bArr);
                            if (i2 != -1) {
                                break;
                                break;
                            }
                            fileOutputStream5.write(bArr, i5, i2);
                            if (this.f58440i) {
                                long j112 = this.f58439h;
                                long j113 = this.f58438g;
                                byte[] bArr9 = bArr;
                                i3 = (int) ((j112 * 100) / j113);
                                long j114 = j112 + ((long) i2);
                                this.f58439h = j114;
                                i4 = (int) ((j114 * 100) / j113);
                                if (i3 != i4) {
                                    interfaceC14031b11.mo82957a(i4);
                                }
                                bArr = bArr9;
                                i5 = 0;
                            }
                        }
                        fileOutputStream5.flush();
                        interfaceC14031b10 = this.f58437f;
                        fileOutputStream3 = fileOutputStream5;
                        if (interfaceC14031b10 != null) {
                            interfaceC14031b10.mo82957a(100);
                            this.f58437f.mo82959a(file2, headerField);
                            fileOutputStream3 = fileOutputStream5;
                        }
                    } else {
                        if (responseCode == 304) {
                            interfaceC14031b5 = this.f58437f;
                            if (interfaceC14031b5 != null) {
                                interfaceC14031b5.mo82957a(100);
                                this.f58437f.mo82959a((File) null, this.f58441j);
                            }
                            inputStream2 = null;
                            fileOutputStream3 = null;
                        } else {
                            c14033d = new C14033d("http status got exception. code = " + responseCode);
                            inputStream2 = null;
                            fileOutputStream2 = null;
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                            interfaceC14031b6 = this.f58437f;
                            if (interfaceC14031b6 != null) {
                                interfaceC14031b6.mo82956a();
                            }
                        } else {
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                            interfaceC14031b6 = this.f58437f;
                            if (interfaceC14031b6 != null) {
                                interfaceC14031b6.mo82956a();
                            }
                        }
                    }
                    c14033d = null;
                    fileOutputStream2 = fileOutputStream3;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection.disconnect();
                        interfaceC14031b6 = this.f58437f;
                        if (interfaceC14031b6 != null) {
                            interfaceC14031b6.mo82956a();
                        }
                    } else {
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection.disconnect();
                        interfaceC14031b6 = this.f58437f;
                        if (interfaceC14031b6 != null) {
                            interfaceC14031b6.mo82956a();
                        }
                    }
                }
            }
        } catch (Exception e8) {
            e = e8;
            i5 = 0;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            httpURLConnection = null;
        }
        if ((i == 0 && c14033d == null) || (interfaceC14031b4 = this.f58437f) == null) {
            return;
        }
        interfaceC14031b4.mo82958a(file2, (Exception) null);
    }
}
