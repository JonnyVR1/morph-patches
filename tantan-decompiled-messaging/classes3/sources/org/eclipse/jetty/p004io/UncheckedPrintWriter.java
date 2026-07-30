package org.eclipse.jetty.p004io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import l.rhg0;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UncheckedPrintWriter extends PrintWriter {
    private static final Logger LOG = Log.getLogger((Class<?>) UncheckedPrintWriter.class);
    private boolean _autoFlush;
    private IOException _ioException;
    private boolean _isClosed;
    private String _lineSeparator;

    public UncheckedPrintWriter(Writer writer, boolean z) {
        super(writer, z);
        this._isClosed = false;
        this._autoFlush = z;
        this._lineSeparator = System.getProperty("line.separator");
    }

    private void isOpen() throws IOException {
        IOException iOException = this._ioException;
        if (iOException != null) {
            throw new RuntimeIOException(iOException);
        }
        if (this._isClosed) {
            rhg0.a("Stream closed");
        }
    }

    private void newLine() {
        try {
            synchronized (((PrintWriter) this).lock) {
                try {
                    isOpen();
                    ((PrintWriter) this).out.write(this._lineSeparator);
                    if (this._autoFlush) {
                        ((PrintWriter) this).out.flush();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            setError(e);
        }
    }

    private void setError(Throwable th) {
        super.setError();
        if (th instanceof IOException) {
            this._ioException = (IOException) th;
        } else {
            IOException iOException = new IOException(String.valueOf(th));
            this._ioException = iOException;
            iOException.initCause(th);
        }
        LOG.debug(th);
    }

    @Override // java.io.PrintWriter
    public boolean checkError() {
        return this._ioException != null || super.checkError();
    }

    @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            synchronized (((PrintWriter) this).lock) {
                ((PrintWriter) this).out.close();
                this._isClosed = true;
            }
        } catch (IOException e) {
            setError(e);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            synchronized (((PrintWriter) this).lock) {
                isOpen();
                ((PrintWriter) this).out.flush();
            }
        } catch (IOException e) {
            setError(e);
        }
    }

    @Override // java.io.PrintWriter
    public void print(boolean z) {
        write(z ? "true" : "false");
    }

    @Override // java.io.PrintWriter
    public void println(boolean z) {
        synchronized (((PrintWriter) this).lock) {
            print(z);
            println();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        try {
            synchronized (((PrintWriter) this).lock) {
                try {
                    isOpen();
                    ((PrintWriter) this).out.write(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            setError(e);
        }
    }

    @Override // java.io.PrintWriter
    public void print(char c) {
        write(c);
    }

    @Override // java.io.PrintWriter
    public void print(int i) {
        write(String.valueOf(i));
    }

    @Override // java.io.PrintWriter
    public void print(long j) {
        write(String.valueOf(j));
    }

    @Override // java.io.PrintWriter
    public void print(float f) {
        write(String.valueOf(f));
    }

    @Override // java.io.PrintWriter
    public void println() {
        newLine();
    }

    @Override // java.io.PrintWriter
    public void print(double d) {
        write(String.valueOf(d));
    }

    @Override // java.io.PrintWriter
    public void println(char c) {
        synchronized (((PrintWriter) this).lock) {
            print(c);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void print(char[] cArr) {
        write(cArr);
    }

    public UncheckedPrintWriter(Writer writer) {
        this(writer, false);
    }

    @Override // java.io.PrintWriter
    public void print(String str) {
        if (str == null) {
            str = "null";
        }
        write(str);
    }

    public UncheckedPrintWriter(OutputStream outputStream) {
        this(outputStream, false);
    }

    public UncheckedPrintWriter(OutputStream outputStream, boolean z) {
        this(new BufferedWriter(new OutputStreamWriter(outputStream)), z);
    }

    @Override // java.io.PrintWriter
    public void print(Object obj) {
        write(String.valueOf(obj));
    }

    @Override // java.io.PrintWriter
    public void println(int i) {
        synchronized (((PrintWriter) this).lock) {
            print(i);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(long j) {
        synchronized (((PrintWriter) this).lock) {
            print(j);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(float f) {
        synchronized (((PrintWriter) this).lock) {
            print(f);
            println();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        try {
            synchronized (((PrintWriter) this).lock) {
                try {
                    isOpen();
                    ((PrintWriter) this).out.write(cArr, i, i2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            setError(e);
        }
    }

    @Override // java.io.PrintWriter
    public void println(double d) {
        synchronized (((PrintWriter) this).lock) {
            print(d);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void setError() {
        setError(new IOException());
    }

    @Override // java.io.PrintWriter
    public void println(char[] cArr) {
        synchronized (((PrintWriter) this).lock) {
            print(cArr);
            println();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        try {
            synchronized (((PrintWriter) this).lock) {
                try {
                    isOpen();
                    ((PrintWriter) this).out.write(str, i, i2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            setError(e);
        }
    }

    @Override // java.io.PrintWriter
    public void println(String str) {
        synchronized (((PrintWriter) this).lock) {
            print(str);
            println();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.PrintWriter
    public void println(Object obj) {
        synchronized (((PrintWriter) this).lock) {
            print(obj);
            println();
        }
    }
}
