package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {
    final List loggerNameList = new ArrayList();

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        synchronized (this.loggerNameList) {
            this.loggerNameList.add(str);
        }
        return NOPLogger.NOP_LOGGER;
    }

    public List getLoggerNameList() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.loggerNameList) {
            arrayList.addAll(this.loggerNameList);
        }
        return arrayList;
    }
}
