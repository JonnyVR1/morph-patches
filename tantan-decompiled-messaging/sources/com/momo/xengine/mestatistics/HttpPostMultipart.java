package com.momo.xengine.mestatistics;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.UUID;
import p149l.juq0;

/* JADX INFO: loaded from: classes8.dex */
final class HttpPostMultipart {
    private static final String LINE = "\r\n";
    private final String boundary;
    private String charset;
    private HttpURLConnection httpConn;
    private OutputStream outputStream;
    private PrintWriter writer;

    public HttpPostMultipart(String str, String str2, Map<String, String> map) throws IOException {
        this.charset = str2;
        String string = UUID.randomUUID().toString();
        this.boundary = string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.httpConn = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.httpConn.setDoOutput(true);
        this.httpConn.setDoInput(true);
        this.httpConn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + string);
        if (map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                this.httpConn.setRequestProperty(str3, map.get(str3));
            }
        }
        this.outputStream = this.httpConn.getOutputStream();
        this.writer = new PrintWriter((Writer) new OutputStreamWriter(this.outputStream, str2), true);
    }

    public void addFilePart(String str, File file) throws IOException {
        String name = file.getName();
        this.writer.append((CharSequence) ("--" + this.boundary)).append((CharSequence) "\r\n");
        this.writer.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + name + "\"")).append((CharSequence) "\r\n");
        PrintWriter printWriter = this.writer;
        StringBuilder sb = new StringBuilder("Content-Type: ");
        sb.append(URLConnection.guessContentTypeFromName(name));
        printWriter.append((CharSequence) sb.toString()).append((CharSequence) "\r\n");
        this.writer.append((CharSequence) "Content-Transfer-Encoding: binary").append((CharSequence) "\r\n");
        this.writer.append((CharSequence) "\r\n");
        this.writer.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr);
            OutputStream outputStream = this.outputStream;
            if (i == -1) {
                outputStream.flush();
                fileInputStream.close();
                this.writer.append((CharSequence) "\r\n");
                this.writer.flush();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    public void addFormField(String str, String str2) {
        this.writer.append((CharSequence) ("--" + this.boundary)).append((CharSequence) "\r\n");
        this.writer.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"")).append((CharSequence) "\r\n");
        this.writer.append((CharSequence) ("Content-Type: text/plain; charset=" + this.charset)).append((CharSequence) "\r\n");
        this.writer.append((CharSequence) "\r\n");
        this.writer.append((CharSequence) str2).append((CharSequence) "\r\n");
        this.writer.flush();
    }

    public String finish() throws IOException {
        this.writer.flush();
        this.writer.append((CharSequence) ("--" + this.boundary + "--")).append((CharSequence) "\r\n");
        this.writer.close();
        int responseCode = this.httpConn.getResponseCode();
        if (responseCode != 200) {
            juq0.m143339a("Server returned non-OK status: ", responseCode);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = this.httpConn.getInputStream().read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(this.charset);
                this.httpConn.disconnect();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
