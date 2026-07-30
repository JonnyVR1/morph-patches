package io.agora.mediaplayer;

import android.content.res.AssetFileDescriptor;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public class AssetsFileReader {
    public static final String PREFIX_ASSETS = "/assets/";
    private static final String TAG = "AssetsFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private AssetFileDescriptor afd = null;
    private long startOffset_ = 0;
    private long length_ = 0;

    @CalledByNative
    public AssetsFileReader() {
        Logging.m88101v(TAG, "constructor");
    }

    @CalledByNative
    public void closeFile() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
                Logging.m88098e(TAG, "AssetsFileReader closeFile Step1 error: " + e.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                Logging.m88098e(TAG, "AssetsFileReader closeFile Step2 error: " + e2.getMessage());
            }
            this.fileInputStream = null;
        }
        AssetFileDescriptor assetFileDescriptor = this.afd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e3) {
                e3.printStackTrace();
                Logging.m88098e(TAG, "AssetsFileReader closeFile Step3 error: " + e3.getMessage());
            }
            this.afd = null;
        }
    }

    @CalledByNative
    public long getCurrentPosition() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.position();
        } catch (Exception e) {
            e.printStackTrace();
            Logging.m88098e(TAG, " read error: " + e.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public long getFileSize() {
        if (this.fileChannel == null) {
            return -2L;
        }
        try {
            return this.length_;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.m88098e(TAG, "getFileSize error:" + e.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public int open(String str) {
        if (this.fileInputStream != null) {
            Logging.m88098e(TAG, "has opened file ");
            return -2;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = ContextUtils.getApplicationContext().getAssets().openFd(str.substring(str.indexOf("/assets/") + 8));
            this.afd = assetFileDescriptorOpenFd;
            this.startOffset_ = assetFileDescriptorOpenFd.getStartOffset();
            this.length_ = this.afd.getLength();
            FileInputStream fileInputStreamCreateInputStream = this.afd.createInputStream();
            this.fileInputStream = fileInputStreamCreateInputStream;
            this.fileChannel = fileInputStreamCreateInputStream.getChannel();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.m88098e(TAG, "open error:" + e.getMessage());
            closeFile();
            return -3;
        }
    }

    @CalledByNative
    public int read(ByteBuffer byteBuffer) {
        if (this.fileChannel == null) {
            return -2;
        }
        byteBuffer.clear();
        try {
            long jPosition = this.fileChannel.position();
            if (jPosition - this.startOffset_ > this.length_) {
                return -1;
            }
            long j = this.fileChannel.read(byteBuffer);
            long j2 = (jPosition + j) - this.startOffset_;
            long j3 = this.length_;
            if (j2 > j3) {
                j -= j2 - j3;
            }
            return (int) j;
        } catch (IOException e) {
            e.printStackTrace();
            Logging.m88098e(TAG, "AssetsFileReader read error: " + e.getMessage());
            return -2;
        }
    }

    @CalledByNative
    public long seek(long j) {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            fileChannel.position(this.startOffset_ + j);
            return j;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.m88098e(TAG, "AssetsFileReader seek error: " + e.getMessage());
            return -2L;
        }
    }
}
