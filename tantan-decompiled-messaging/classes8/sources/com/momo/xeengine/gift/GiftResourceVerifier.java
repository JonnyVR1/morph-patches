package com.momo.xeengine.gift;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class GiftResourceVerifier {
    /* JADX WARN: Code duplicated, block: B:40:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:29), block:B:10:0x001c */
    private static String calculateFileCRC32(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        CRC32 crc32 = new CRC32();
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            String str = String.format("%08X", Long.valueOf(crc32.getValue()));
                            try {
                                fileInputStream.close();
                                return str;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return str;
                            }
                        }
                        crc32.update(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
    }

    private static Map<String, String> parseCRCFile(String str) throws Throwable {
        BufferedReader bufferedReader;
        HashMap map = new HashMap();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                                return map;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return map;
                            }
                        }
                        String strTrim = line.trim();
                        if (!strTrim.isEmpty()) {
                            String[] strArrSplit = strTrim.split("\\s+");
                            if (strArrSplit.length == 2) {
                                map.put(strArrSplit[0], strArrSplit[1]);
                            } else {
                                continue;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                }
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean verifyGiftResources(String str) {
        Map<String, String> cRCFile;
        String strCalculateFileCRC32;
        File file = new File(str, "FileCRC.txt");
        if (!file.exists() || (cRCFile = parseCRCFile(file.getAbsolutePath())) == null || cRCFile.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, String> entry : cRCFile.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            File file2 = new File(str, key);
            if (!file2.exists() || (strCalculateFileCRC32 = calculateFileCRC32(file2)) == null || !value.equalsIgnoreCase(strCalculateFileCRC32)) {
                return false;
            }
        }
        return true;
    }
}
