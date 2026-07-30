package org.eclipse.jetty.util;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class Utf8StringBuilder extends Utf8Appendable {
    final StringBuilder _buffer;

    public Utf8StringBuilder() {
        super(new StringBuilder());
        this._buffer = (StringBuilder) this._appendable;
    }

    private void checkState() {
        if (isUtf8SequenceComplete()) {
            return;
        }
        ig3.m135964a("Tried to read incomplete UTF8 decoded String");
    }

    public StringBuilder getStringBuilder() {
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

    public Utf8StringBuilder(int i) {
        super(new StringBuilder(i));
        this._buffer = (StringBuilder) this._appendable;
    }
}
