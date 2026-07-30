package com.immomo.momosec;

import p149l.sbr;

/* JADX INFO: loaded from: classes7.dex */
public class Coded {
    public static final int MOMOSEC_GET_BOOT_ID_SYNC_FILE = 106;
    public static final int MOMOSEC_GET_BUILDINFO = 101;
    public static final int MOMOSEC_GET_DECRYPT_DATA = 103;
    public static final int MOMOSEC_GET_ENCRYPT_DATA = 102;
    public static final int MOMOSEC_GET_FILE_STAT = 107;
    public static final int MOMOSEC_GET_MACADDRESS = 100;
    public static final int MOMOSEC_READ_LOCAL_BOOT_ID = 104;
    public static final int MOMOSEC_TEST = 110;

    static {
        sbr.m183254d("mmsmses");
    }

    public static native byte[] doCommand(byte[] bArr, int i);
}
