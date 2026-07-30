package com.momocv;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ReadFile2Bytes {
    public static byte[] StringPath2Bytes(String str) {
        File file = new File(str);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
            return bArr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return bArr;
        } catch (IOException e2) {
            e2.printStackTrace();
            return bArr;
        }
    }
}
