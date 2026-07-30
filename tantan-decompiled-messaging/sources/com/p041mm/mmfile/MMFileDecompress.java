package com.p041mm.mmfile;

import com.p041mm.mmfile.core.IByteDecompress;
import com.p041mm.mmfile.core.IObjectDecompress;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class MMFileDecompress {

    public static class ByteDecompressImpl implements IByteDecompress {
        private long index;
        private FileOutputStream mFileOutputStream;
        private final String mFilePath;
        private final long mMaxOutFileLength;
        private final String mOutDir;
        private long mTraversLength;

        public ByteDecompressImpl(String str, String str2, long j) {
            this.mFilePath = str;
            this.mOutDir = str2;
            this.mMaxOutFileLength = j;
        }

        public void flush() {
            FileOutputStream fileOutputStream = this.mFileOutputStream;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.flush();
                    this.mFileOutputStream.close();
                    this.mFileOutputStream = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.p041mm.mmfile.core.IByteDecompress
        public void onDecompressError(int i) {
        }

        @Override // com.p041mm.mmfile.core.IByteDecompress
        public void onMemoryExtension(long j) {
        }

        @Override // com.p041mm.mmfile.core.IByteDecompress
        public void traverse(byte[] bArr) {
            String str;
            if (bArr == null || bArr.length == 0) {
                return;
            }
            if (this.mFileOutputStream == null) {
                try {
                    String str2 = this.mOutDir;
                    StringBuilder sb = new StringBuilder();
                    sb.append(new File(this.mFilePath).getName());
                    if (this.index == 0) {
                        str = "";
                    } else {
                        str = "_" + this.index;
                    }
                    sb.append(str);
                    sb.append(".log");
                    this.mFileOutputStream = new FileOutputStream(new File(str2, sb.toString()), true);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            FileOutputStream fileOutputStream = this.mFileOutputStream;
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.write(bArr);
                long length = this.mTraversLength + ((long) bArr.length);
                this.mTraversLength = length;
                long j = this.mMaxOutFileLength;
                if (j <= 0 || length <= j) {
                    return;
                }
                this.mFileOutputStream.flush();
                this.mFileOutputStream.close();
                this.mFileOutputStream = null;
                this.index++;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static native void decodeFile(String str, IByteDecompress iByteDecompress);

    public static void decodeFile(String str, String str2, long j) {
        ByteDecompressImpl byteDecompressImpl = new ByteDecompressImpl(str, str2, j);
        decodeFile(str, byteDecompressImpl);
        byteDecompressImpl.flush();
    }

    public static native void decodeFileItem(String str, IObjectDecompress iObjectDecompress);
}
