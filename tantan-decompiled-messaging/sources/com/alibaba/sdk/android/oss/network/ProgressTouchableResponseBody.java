package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p149l.gxc0;
import p149l.hyx;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends gxc0 {
    private BufferedSource mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final gxc0 mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(gxc0 gxc0Var, ExecutionContext executionContext) {
        this.mResponseBody = gxc0Var;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p149l.gxc0
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p149l.gxc0
    public hyx contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p149l.gxc0
    public BufferedSource source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = Okio.buffer(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) { // from class: com.alibaba.sdk.android.oss.network.ProgressTouchableResponseBody.1
            private long totalBytesRead = 0;

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j) throws IOException {
                long j2 = super.read(buffer, j);
                this.totalBytesRead += j2 != -1 ? j2 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j2 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                }
                return j2;
            }
        };
    }
}
