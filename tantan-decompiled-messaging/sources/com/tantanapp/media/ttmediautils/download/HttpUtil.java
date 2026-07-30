package com.tantanapp.media.ttmediautils.download;

import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.tantanapp.media.ttmediautils.log.SLog;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes13.dex */
public class HttpUtil {
    /* JADX WARN: Code duplicated, block: B:123:0x01ed A[Catch: all -> 0x01f1, TryCatch #15 {all -> 0x01f1, blocks: (B:121:0x01e9, B:123:0x01ed, B:126:0x01f3, B:128:0x01f7, B:130:0x0203), top: B:198:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f7 A[Catch: all -> 0x01f1, TryCatch #15 {all -> 0x01f1, blocks: (B:121:0x01e9, B:123:0x01ed, B:126:0x01f3, B:128:0x01f7, B:130:0x0203), top: B:198:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0203 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #15 {all -> 0x01f1, blocks: (B:121:0x01e9, B:123:0x01ed, B:126:0x01f3, B:128:0x01f7, B:130:0x0203), top: B:198:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0226 A[Catch: Exception -> 0x0183, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #20 {Exception -> 0x0183, blocks: (B:84:0x017e, B:147:0x0226), top: B:209:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void downloadFile(DownloadTask downloadTask) {
        ?? r3;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        RandomAccessFile randomAccessFile;
        int i;
        FileOutputStream fileOutputStream2;
        if (downloadTask == null) {
            return;
        }
        File file = null;
        try {
            try {
                File file2 = new File(downloadTask.getLocalPath());
                try {
                    if (!downloadTask.mIsFirstRun) {
                        downloadTask.onStart();
                        downloadTask.mIsFirstRun = true;
                        downloadTask.mUpdateTime = System.currentTimeMillis();
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                    if (downloadTask.isNeedPause()) {
                        downloadTask.onPause(Boolean.TRUE);
                        return;
                    }
                    if (downloadTask.isNeedResume()) {
                        downloadTask.onPause(Boolean.FALSE);
                    }
                    if (!file2.exists()) {
                        file2.createNewFile();
                        downloadTask.mWriteLength = 0L;
                    }
                    httpURLConnection = (HttpURLConnection) new URL(downloadTask.getNetPath()).openConnection();
                    try {
                        httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
                        httpURLConnection.setRequestProperty("Charset", "UTF-8");
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        if (downloadTask.mFileLength > 0) {
                            httpURLConnection.setRequestProperty("Range", BytesRange.PREFIX + downloadTask.mWriteLength + "-" + downloadTask.mFileLength);
                        } else if (downloadTask.mWriteLength > 0) {
                            httpURLConnection.setRequestProperty("Range", BytesRange.PREFIX + downloadTask.mWriteLength + "-");
                        }
                        try {
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (200 != responseCode && 206 != responseCode) {
                                throw new Exception("httpURLConnection.getResponseCode()=" + responseCode);
                            }
                            if (downloadTask.isCancel()) {
                                try {
                                    httpURLConnection.disconnect();
                                    return;
                                } catch (Exception e) {
                                    SLog.printStackTrace(e);
                                    return;
                                }
                            }
                            if (downloadTask.mFileLength <= 0) {
                                downloadTask.onConnect(getFileNameByConnection(httpURLConnection));
                                downloadTask.mFileLength = downloadTask.mWriteLength + ((long) httpURLConnection.getContentLength());
                            }
                            if (downloadTask.mWriteLength > 0) {
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rwd");
                                try {
                                    randomAccessFile2.seek(downloadTask.mWriteLength);
                                    randomAccessFile = randomAccessFile2;
                                    fileOutputStream2 = null;
                                } catch (Throwable th) {
                                    randomAccessFile = randomAccessFile2;
                                    th = th;
                                    fileOutputStream = null;
                                    file = file2;
                                    r3 = fileOutputStream;
                                    try {
                                        i = downloadTask.mRetryTime;
                                        if (i > 0) {
                                            downloadTask.mRetryTime = i - 1;
                                        }
                                        if (downloadTask.mRetryTime == 0) {
                                            SLog.printStackTrace(th);
                                            downloadTask.onFail(th);
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e2) {
                                                SLog.printStackTrace(e2);
                                            }
                                        }
                                        if (r3 != 0) {
                                            try {
                                                r3.close();
                                            } catch (IOException e3) {
                                                SLog.printStackTrace(e3);
                                            }
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException e4) {
                                                SLog.printStackTrace(e4);
                                            }
                                        }
                                        if (httpURLConnection == null) {
                                            return;
                                        }
                                    } finally {
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e5) {
                                                SLog.printStackTrace(e5);
                                            }
                                        }
                                        if (r3 != 0) {
                                            try {
                                                r3.close();
                                            } catch (IOException e6) {
                                                SLog.printStackTrace(e6);
                                            }
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException e7) {
                                                SLog.printStackTrace(e7);
                                            }
                                        }
                                        if (httpURLConnection != null) {
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Exception e8) {
                                                SLog.printStackTrace(e8);
                                            }
                                        }
                                    }
                                }
                            } else {
                                fileOutputStream2 = new FileOutputStream(downloadTask.getLocalPath());
                                randomAccessFile = null;
                            }
                            try {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                byte[] bArr = new byte[downloadTask.getBufferSize()];
                                if (downloadTask.mFileLength <= 0) {
                                    downloadTask.onLoading(-1);
                                }
                                while (true) {
                                    int i2 = inputStream.read(bArr);
                                    try {
                                        if (i2 != -1) {
                                            if (downloadTask.isCancel()) {
                                                if (fileOutputStream2 != null) {
                                                    try {
                                                        fileOutputStream2.close();
                                                    } catch (IOException e9) {
                                                        SLog.printStackTrace(e9);
                                                    }
                                                }
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e10) {
                                                    SLog.printStackTrace(e10);
                                                }
                                                if (randomAccessFile != null) {
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (IOException e11) {
                                                        SLog.printStackTrace(e11);
                                                    }
                                                }
                                            } else {
                                                downloadTask.mWriteLength += (long) i2;
                                                if (randomAccessFile == null) {
                                                    fileOutputStream2.write(bArr, 0, i2);
                                                } else {
                                                    randomAccessFile.write(bArr, 0, i2);
                                                }
                                                downloadTask.updatePercent();
                                                if (downloadTask.isNeedPause() && downloadTask.mWriteLength < downloadTask.mFileLength) {
                                                    downloadTask.onPause(Boolean.TRUE);
                                                }
                                            }
                                            httpURLConnection.disconnect();
                                            return;
                                        }
                                        downloadTask.mRetryTime = 0;
                                        downloadTask.onSuccess(file2);
                                        inputStream.close();
                                    } catch (IOException e12) {
                                        SLog.printStackTrace(e12);
                                    }
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e13) {
                                            SLog.printStackTrace(e13);
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                    httpURLConnection.disconnect();
                                    return;
                                }
                            } catch (Throwable th2) {
                                fileOutputStream = fileOutputStream2;
                                th = th2;
                                httpURLConnection = httpURLConnection;
                                r3 = 0;
                                file = file2;
                                i = downloadTask.mRetryTime;
                                if (i > 0) {
                                    downloadTask.mRetryTime = i - 1;
                                }
                                if (downloadTask.mRetryTime == 0) {
                                    SLog.printStackTrace(th);
                                    downloadTask.onFail(th);
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (r3 != 0) {
                                    r3.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (httpURLConnection == null) {
                                }
                            }
                        } catch (Exception e14) {
                            if (downloadTask.mRetryTime > 0) {
                                downloadTask.mRetryTime--;
                            }
                            if (downloadTask.mRetryTime == 0) {
                                downloadTask.onFail(e14);
                                if (file2.exists()) {
                                    file2.delete();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                        fileOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    httpURLConnection = null;
                    randomAccessFile = null;
                    file = file2;
                    r3 = 0;
                }
            } catch (Throwable th5) {
                th = th5;
                r3 = 0;
                fileOutputStream = null;
                httpURLConnection = null;
                randomAccessFile = null;
            }
        } catch (Exception e15) {
        }
    }

    private static String getFileNameByConnection(HttpURLConnection httpURLConnection) {
        String strDecode;
        try {
            String file = httpURLConnection.getURL().getFile();
            String strSubstring = file.substring(file.lastIndexOf(47) + 1);
            if (strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX)) {
                strDecode = URLDecoder.decode(strSubstring, "UTF-8");
            } else {
                strDecode = httpURLConnection.getHeaderField(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_DISPOSITION);
                if (strDecode != null) {
                    strDecode = URLDecoder.decode(strDecode.split(Constants.PACKNAME_END)[1].split("=")[1].replaceAll("\"", ""), "UTF-8");
                }
            }
        } catch (UnsupportedEncodingException e) {
            SLog.printStackTrace(e);
            strDecode = null;
        }
        return TextUtils.isEmpty(strDecode) ? "tantan.apk" : strDecode;
    }
}
