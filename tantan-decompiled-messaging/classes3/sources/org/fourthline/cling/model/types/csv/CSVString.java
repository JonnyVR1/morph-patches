package org.fourthline.cling.model.types.csv;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CSVString extends CSV<String> {
    public CSVString() {
    }

    public CSVString(String str) throws InvalidValueException {
        super(str);
    }
}
