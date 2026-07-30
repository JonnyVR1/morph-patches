package com.p046mm.mmfile;

import java.util.Arrays;
import p153l.tmw;

/* JADX INFO: loaded from: classes6.dex */
class MMFileWriterImpl implements IMMFileWriter {
    @Override // com.p046mm.mmfile.IMMFileWriter
    public void write(String str, String... strArr) {
        Strategy strategy = MMFileRegister.getStrategy(strArr[0]);
        MMFile mMFile = MMFile.get(strategy.getFileWriteConfig());
        if (mMFile != null) {
            write(mMFile, str, strArr);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        sb.append(" do not bind strategy: ");
        sb.append(strategy);
        String string = Arrays.toString(strArr);
        sb.append(", heads: ");
        sb.append(string);
        throw new RuntimeException(sb.toString());
    }

    @Override // com.p046mm.mmfile.IMMFileWriter
    public void write(String str, String str2) {
        Strategy strategy = MMFileRegister.getStrategy(str);
        MMFile mMFile = MMFile.get(strategy.getFileWriteConfig());
        if (mMFile != null) {
            write(mMFile, str2, str);
        } else {
            tmw.m191859a(str, " do not bind strategy: ", strategy);
        }
    }

    private static void write(MMFile mMFile, String str, String... strArr) {
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        strArr2[0] = String.valueOf(System.currentTimeMillis());
        mMFile.write(str, strArr2);
    }
}
