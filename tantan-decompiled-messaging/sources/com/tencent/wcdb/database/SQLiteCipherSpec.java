package com.tencent.wcdb.database;

import com.tencent.liteav.TXLiteAVCode;
import p149l.k250;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteCipherSpec {
    public static final int HMAC_DEFAULT = -1;
    public static final int HMAC_SHA1 = 0;
    public static final int HMAC_SHA256 = 1;
    public static final int HMAC_SHA512 = 2;
    public int hmacAlgorithm;
    public boolean hmacEnabled;
    public int kdfAlgorithm;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.hmacEnabled = true;
        this.hmacAlgorithm = -1;
        this.kdfAlgorithm = -1;
        this.pageSize = SQLiteGlobal.defaultPageSize;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }

    public SQLiteCipherSpec setHmacAlgorithm(int i) {
        this.hmacAlgorithm = i;
        return this;
    }

    public SQLiteCipherSpec setKDFIteration(int i) {
        this.kdfIteration = i;
        return this;
    }

    public SQLiteCipherSpec setKdfAlgorithm(int i) {
        this.kdfAlgorithm = i;
        return this;
    }

    public SQLiteCipherSpec setPageSize(int i) {
        this.pageSize = i;
        return this;
    }

    public SQLiteCipherSpec setSQLCipherVersion(int i) {
        if (i == 1) {
            this.hmacEnabled = false;
            this.kdfIteration = TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
            return this;
        }
        if (i == 2) {
            this.hmacEnabled = true;
            this.kdfIteration = TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
            return this;
        }
        if (i == 3) {
            this.hmacEnabled = true;
            this.kdfIteration = 64000;
            this.hmacAlgorithm = 0;
            this.kdfAlgorithm = 0;
            return this;
        }
        if (i != 4) {
            k250.m144273a("Unsupported SQLCipher version: ", i);
            return null;
        }
        this.hmacEnabled = true;
        this.kdfIteration = 256000;
        this.hmacAlgorithm = 2;
        this.kdfAlgorithm = 2;
        return this;
    }

    public SQLiteCipherSpec withHMACEnabled(boolean z) {
        this.hmacEnabled = z;
        return this;
    }

    public SQLiteCipherSpec() {
        this.hmacEnabled = true;
        this.hmacAlgorithm = -1;
        this.kdfAlgorithm = -1;
        this.pageSize = SQLiteGlobal.defaultPageSize;
    }
}
