package com.cosmos.photon.push.image;

import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class HttpDownloader {
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    public void downloadUrlToStream(String str, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException e;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
                httpURLConnection.setReadTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                    while (true) {
                        try {
                            try {
                                int i = bufferedInputStream.read();
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(i);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                MDLog.m7391e(LogTag.IMAGE, "Error in downloadBitmap - " + e);
                                throw e;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            throw th;
                        }
                        try {
                            bufferedInputStream.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                    httpURLConnection.disconnect();
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = null;
                    e = e;
                    MDLog.m7391e(LogTag.IMAGE, "Error in downloadBitmap - " + e);
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        throw th;
                    }
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
            }
        } catch (IOException e5) {
            bufferedInputStream = null;
            bufferedOutputStream = null;
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th5) {
            bufferedInputStream = null;
            bufferedOutputStream = null;
            th = th5;
            httpURLConnection = null;
        }
    }
}
