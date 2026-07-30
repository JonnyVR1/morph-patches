package com.immomo.mediacore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class FileDumpHelper {
    static FileOutputStream playbackStream;
    static FileOutputStream recorderStream;

    public static void clear() {
    }

    public static void writePlaybackSample(String str, byte[] bArr) {
        try {
            if (playbackStream == null) {
                playbackStream = new FileOutputStream(str);
            }
            playbackStream.write(bArr, 0, bArr.length);
            playbackStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void writeRecorderSample(String str, byte[] bArr) {
        try {
            if (recorderStream == null) {
                recorderStream = new FileOutputStream(str);
            }
            recorderStream.write(bArr, 0, bArr.length);
            recorderStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void writeSample(String str, byte[] bArr) {
        try {
            if (playbackStream == null) {
                playbackStream = new FileOutputStream(str);
            }
            playbackStream.write(bArr, 0, bArr.length);
            playbackStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
