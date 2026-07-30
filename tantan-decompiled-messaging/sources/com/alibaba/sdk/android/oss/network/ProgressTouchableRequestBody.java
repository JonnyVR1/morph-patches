package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p149l.hyx;
import p149l.utc0;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends utc0 {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p149l.utc0
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // p149l.utc0
    public hyx contentType() {
        return hyx.m133628d(this.contentType);
    }

    @Override // p149l.utc0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        Source source = Okio.source(this.inputStream);
        long j = 0;
        while (true) {
            long j2 = this.contentLength;
            if (j >= j2) {
                break;
            }
            long j3 = source.read(bufferedSink.getBufferField(), Math.min(j2 - j, 2048L));
            if (j3 == -1) {
                break;
            }
            long j4 = j + j3;
            bufferedSink.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j4 != 0) {
                oSSProgressCallback.onProgress(this.request, j4, this.contentLength);
            }
            j = j4;
        }
        if (source != null) {
            source.close();
        }
    }
}
