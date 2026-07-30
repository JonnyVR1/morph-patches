package com.cosmos.photon.push.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.azk0;

/* JADX INFO: loaded from: classes.dex */
public class BloomFilter implements Serializable {
    private static final long serialVersionUID = -5221305273707291280L;
    private final Double autoClearRate;
    private final BitSet notebook;
    private final MisjudgmentRate rate;
    private final int[] seeds;
    private final int size;
    private final AtomicInteger useCount;

    public enum MisjudgmentRate {
        VERY_SMALL(new int[]{2, 3, 5, 7}),
        SMALL(new int[]{2, 3, 5, 7, 11, 13, 17, 19}),
        MIDDLE(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53}),
        HIGH(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131});

        private int[] seeds;

        MisjudgmentRate(int[] iArr) {
            this.seeds = iArr;
        }

        public int[] getSeeds() {
            return this.seeds;
        }

        public void setSeeds(int[] iArr) {
            this.seeds = iArr;
        }
    }

    public BloomFilter(MisjudgmentRate misjudgmentRate, int i, Double d) {
        this.useCount = new AtomicInteger(0);
        long length = misjudgmentRate.seeds.length * i;
        if (length < 0 || length > 2147483647L) {
            azk0.m101074a("位数太大溢出了，请降低误判率或者降低数据大小");
            throw null;
        }
        this.rate = misjudgmentRate;
        this.seeds = misjudgmentRate.seeds;
        int i2 = (int) length;
        this.size = i2;
        this.notebook = new BitSet(i2);
        this.autoClearRate = d;
    }

    private void checkNeedClear() {
        if (this.autoClearRate == null || getUseRate() < this.autoClearRate.doubleValue()) {
            return;
        }
        synchronized (this) {
            try {
                if (getUseRate() >= this.autoClearRate.doubleValue()) {
                    this.notebook.clear();
                    this.useCount.set(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int hash(String str, int i) {
        char[] charArray = str.toCharArray();
        int i2 = 0;
        if (charArray.length > 0) {
            int i3 = 0;
            while (i2 < charArray.length) {
                i3 = (i3 * i2) + charArray[i2];
                i2++;
            }
            i2 = i3;
        }
        return Math.abs((i2 * i) % this.size);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.ObjectInputStream] */
    public static BloomFilter readFilterFromFile(String str) throws Throwable {
        Throwable th;
        Exception e;
        try {
            try {
                File file = new File((String) str);
                if (!file.exists()) {
                    return null;
                }
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                try {
                    BloomFilter bloomFilter = (BloomFilter) objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                        return bloomFilter;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return bloomFilter;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                if (str != 0) {
                    try {
                        str.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (str != 0) {
                str.close();
            }
            throw th;
        }
        throw new RuntimeException(e);
    }

    public void add(String str) {
        checkNeedClear();
        int i = 0;
        while (true) {
            int[] iArr = this.seeds;
            if (i >= iArr.length) {
                return;
            }
            setTrue(hash(str, iArr[i]));
            i++;
        }
    }

    public boolean addIfNotExist(String str) {
        checkNeedClear();
        int[] iArr = new int[this.seeds.length];
        boolean z = true;
        int i = 0;
        while (true) {
            int[] iArr2 = this.seeds;
            if (i >= iArr2.length) {
                return z;
            }
            int iHash = hash(str, iArr2[i]);
            iArr[i] = iHash;
            if (!z) {
                setTrue(iHash);
            } else if (!this.notebook.get(iHash)) {
                for (int i2 = 0; i2 <= i; i2++) {
                    setTrue(iArr[i2]);
                }
                z = false;
            }
            i++;
        }
    }

    public boolean check(String str) {
        int i = 0;
        while (true) {
            int[] iArr = this.seeds;
            if (i >= iArr.length) {
                return true;
            }
            if (!this.notebook.get(hash(str, iArr[i]))) {
                return false;
            }
            i++;
        }
    }

    public void clear() {
        this.useCount.set(0);
        this.notebook.clear();
    }

    public MisjudgmentRate getRate() {
        return this.rate;
    }

    public double getUseRate() {
        return ((double) this.useCount.intValue()) / ((double) this.size);
    }

    public void saveFilterToFile(String str) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.createNewFile();
                }
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file));
                try {
                    objectOutputStream2.writeObject(this);
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void setTrue(int i) {
        this.useCount.incrementAndGet();
        this.notebook.set(i, true);
    }

    public BloomFilter(int i) {
        this(MisjudgmentRate.MIDDLE, i, null);
    }
}
