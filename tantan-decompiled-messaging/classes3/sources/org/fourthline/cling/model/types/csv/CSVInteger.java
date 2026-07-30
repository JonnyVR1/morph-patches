package org.fourthline.cling.model.types.csv;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CSVInteger extends CSV<Integer> {
    public CSVInteger() {
    }

    public CSVInteger(String str) throws InvalidValueException {
        super(str);
    }
}
