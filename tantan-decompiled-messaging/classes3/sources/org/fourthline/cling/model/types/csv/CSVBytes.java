package org.fourthline.cling.model.types.csv;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CSVBytes extends CSV<byte[]> {
    public CSVBytes() {
    }

    public CSVBytes(String str) throws InvalidValueException {
        super(str);
    }
}
