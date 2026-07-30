package org.eclipse.jetty.util;

import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class Utf8StringBuffer extends Utf8Appendable {
    final StringBuffer _buffer;

    public Utf8StringBuffer() {
        super(new StringBuffer());
        this._buffer = (StringBuffer) this._appendable;
    }

    private void checkState() {
        if (isUtf8SequenceComplete()) {
            return;
        }
        wg3.m206174a("Tried to read incomplete UTF8 decoded String");
    }

    public StringBuffer getStringBuffer() {
        checkState();
        return this._buffer;
    }

    @Override // org.eclipse.jetty.util.Utf8Appendable
    public int length() {
        return this._buffer.length();
    }

    @Override // org.eclipse.jetty.util.Utf8Appendable
    public void reset() {
        super.reset();
        this._buffer.setLength(0);
    }

    public String toString() {
        checkState();
        return this._buffer.toString();
    }

    public Utf8StringBuffer(int i) {
        super(new StringBuffer(i));
        this._buffer = (StringBuffer) this._appendable;
    }
}
