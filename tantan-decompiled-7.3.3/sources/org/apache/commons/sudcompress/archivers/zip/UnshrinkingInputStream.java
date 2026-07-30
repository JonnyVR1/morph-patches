package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.sudcompress.compressors.lzw.Suddo;
import p153l.dmg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
class UnshrinkingInputStream extends Suddo {
    private static final int MAX_CODE_SIZE = 13;
    private static final int MAX_TABLE_SIZE = 8192;
    private final boolean[] isUsed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnshrinkingInputStream(InputStream inputStream) {
        super(inputStream);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        setClearCode(9);
        initializeTables(13);
        this.isUsed = new boolean[getPrefixesLength()];
        for (int i = 0; i < 256; i++) {
            this.isUsed[i] = true;
        }
        setTableSize(getClearCode() + 1);
    }

    private void partialClear() {
        boolean[] zArr = new boolean[8192];
        int i = 0;
        while (true) {
            boolean[] zArr2 = this.isUsed;
            if (i >= zArr2.length) {
                break;
            }
            if (zArr2[i] && getPrefix(i) != -1) {
                zArr[getPrefix(i)] = true;
            }
            i++;
        }
        for (int clearCode = getClearCode() + 1; clearCode < 8192; clearCode++) {
            if (!zArr[clearCode]) {
                this.isUsed[clearCode] = false;
                setPrefix(clearCode, -1);
            }
        }
    }

    @Override // org.apache.commons.sudcompress.compressors.lzw.Suddo
    public int addEntry(int i, byte b) {
        int tableSize = getTableSize();
        while (tableSize < 8192 && this.isUsed[tableSize]) {
            tableSize++;
        }
        setTableSize(tableSize);
        int iAddEntry = addEntry(i, b, 8192);
        if (iAddEntry >= 0) {
            this.isUsed[iAddEntry] = true;
        }
        return iAddEntry;
    }

    @Override // org.apache.commons.sudcompress.compressors.lzw.Suddo
    public int decompressNextSymbol() throws IOException {
        int nextCode = readNextCode();
        if (nextCode < 0) {
            return -1;
        }
        boolean z = false;
        if (nextCode != getClearCode()) {
            if (!this.isUsed[nextCode]) {
                nextCode = addRepeatOfPreviousCode();
                z = true;
            }
            return expandCodeToOutputStack(nextCode, z);
        }
        int nextCode2 = readNextCode();
        if (nextCode2 < 0) {
            zpg0.m220844a("Unexpected EOF;");
            return 0;
        }
        if (nextCode2 == 1) {
            if (getCodeSize() >= 13) {
                zpg0.m220844a("Attempt to increase code size beyond maximum");
                return 0;
            }
            incrementCodeSize();
        } else {
            if (nextCode2 != 2) {
                zpg0.m220844a(dmg0.m116959a(nextCode2, "Invalid clear code subcode "));
                return 0;
            }
            partialClear();
            setTableSize(getClearCode() + 1);
        }
        return 0;
    }
}
