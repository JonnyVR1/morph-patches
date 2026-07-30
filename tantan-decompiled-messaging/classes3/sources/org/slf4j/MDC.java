package org.slf4j;

import java.util.Map;
import l.ig3;
import l.qkq0;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MDC {
    static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    static MDCAdapter mdcAdapter;

    static {
        try {
            mdcAdapter = StaticMDCBinder.SINGLETON.getMDCA();
        } catch (Exception e) {
            Util.report("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            mdcAdapter = new NOPMDCAdapter();
            String message = e2.getMessage();
            if (message == null || message.indexOf("org/slf4j/impl/StaticMDCBinder") == -1) {
                throw e2;
            }
            Util.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            Util.report("Defaulting to no-operation MDCAdapter implementation.");
            Util.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    private MDC() {
    }

    public static void clear() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.clear();
        } else {
            qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str == null) {
            ig3.a("key parameter cannot be null");
            return null;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return null;
    }

    public static Map getCopyOfContextMap() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return null;
    }

    public static MDCAdapter getMDCAdapter() {
        return mdcAdapter;
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            ig3.a("key parameter cannot be null");
            return;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.put(str, str2);
        } else {
            qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str == null) {
            ig3.a("key parameter cannot be null");
            return;
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.remove(str);
        } else {
            qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    public static void setContextMap(Map map) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.setContextMap(map);
        } else {
            qkq0.a("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }
}
