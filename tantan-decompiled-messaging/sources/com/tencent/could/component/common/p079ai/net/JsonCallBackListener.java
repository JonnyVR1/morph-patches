package com.tencent.could.component.common.p079ai.net;

import android.os.Handler;
import android.os.Looper;
import com.tencent.could.component.common.p079ai.utils.GZipUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class JsonCallBackListener implements CallBackListener {

    /* JADX INFO: renamed from: a */
    public IJsonDataListener f57292a;

    /* JADX INFO: renamed from: b */
    public Handler f57293b = new Handler(Looper.getMainLooper());

    public JsonCallBackListener(IJsonDataListener iJsonDataListener) {
        this.f57292a = iJsonDataListener;
    }

    @Override // com.tencent.could.component.common.p079ai.net.CallBackListener
    public void cleanListener() {
        if (this.f57292a != null) {
            this.f57292a = null;
        }
    }

    public String inputGzipConvertToString(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (-1 == i) {
                        String strUncompressToString = GZipUtils.uncompressToString(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.close();
                        return strUncompressToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "Gzip ConvertToString error! " + e.getMessage());
                    return null;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "Gzip ConvertToString error! " + e.getMessage());
            return null;
        }
    }

    public String inputStreamConvertToString(InputStream inputStream) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (IOException e) {
            TxNetWorkHelper.getInstance().logError("JsonCallBackListener", "ConvertToString error! " + e.getMessage());
            return null;
        }
    }

    @Override // com.tencent.could.component.common.p079ai.net.CallBackListener
    public void onFailed(final String str) {
        this.f57293b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.3
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f57292a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onFailed(str);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }

    @Override // com.tencent.could.component.common.p079ai.net.CallBackListener
    public void onSuccess(InputStream inputStream, boolean z) {
        final String strInputGzipConvertToString = z ? inputGzipConvertToString(inputStream) : inputStreamConvertToString(inputStream);
        TxNetWorkHelper.getInstance().logDebug("JsonCallBackListener", "get finalResult string!");
        this.f57293b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.1
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f57292a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onSuccess(strInputGzipConvertToString);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }

    @Override // com.tencent.could.component.common.p079ai.net.CallBackListener
    public void onSuccess(final String str) {
        this.f57293b.post(new Runnable() { // from class: com.tencent.could.component.common.ai.net.JsonCallBackListener.2
            @Override // java.lang.Runnable
            public void run() {
                IJsonDataListener iJsonDataListener = JsonCallBackListener.this.f57292a;
                if (iJsonDataListener != null) {
                    iJsonDataListener.onSuccess(str);
                    JsonCallBackListener.this.cleanListener();
                }
            }
        });
    }
}
