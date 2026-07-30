package com.xiaomi.push;

import java.net.UnknownHostException;
import p153l.w1r0;

/* JADX INFO: renamed from: com.xiaomi.push.e */
/* JADX INFO: loaded from: classes2.dex */
final class C14879e {

    /* JADX INFO: renamed from: com.xiaomi.push.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        EnumC14881ei f62501a;

        /* JADX INFO: renamed from: b */
        String f62502b;
    }

    /* JADX INFO: renamed from: a */
    public static a m86692a(Exception exc) {
        m86693b(exc);
        boolean z = exc instanceof C14885fi;
        Throwable thM86745a = exc;
        if (z) {
            C14885fi c14885fi = (C14885fi) exc;
            if (c14885fi.m86745a() != null) {
                thM86745a = exc;
                thM86745a = c14885fi.m86745a();
            }
        }
        thM86745a = exc;
        a aVar = new a();
        String message = thM86745a.getMessage();
        if (thM86745a.getCause() != null) {
            message = thM86745a.getCause().getMessage();
        }
        String str = thM86745a.getClass().getSimpleName() + ":" + message;
        int iM204469a = w1r0.m204469a(thM86745a);
        if (iM204469a != 0) {
            aVar.f62501a = EnumC14881ei.m86698a(EnumC14881ei.GSLB_REQUEST_SUCCESS.m86699a() + iM204469a);
        }
        if (aVar.f62501a == null) {
            aVar.f62501a = EnumC14881ei.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f62501a == EnumC14881ei.GSLB_TCP_ERR_OTHER) {
            aVar.f62502b = str;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    private static void m86693b(Exception exc) {
        exc.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static a m86694c(Exception exc) {
        Throwable cause;
        m86693b(exc);
        boolean z = exc instanceof C14885fi;
        Throwable thM86745a = exc;
        if (z) {
            C14885fi c14885fi = (C14885fi) exc;
            if (c14885fi.m86745a() != null) {
                thM86745a = exc;
                thM86745a = c14885fi.m86745a();
            }
        }
        thM86745a = exc;
        a aVar = new a();
        String message = thM86745a.getMessage();
        if (thM86745a.getCause() != null) {
            message = thM86745a.getCause().getMessage();
        }
        int iM204469a = w1r0.m204469a(thM86745a);
        String str = thM86745a.getClass().getSimpleName() + ":" + message;
        if (iM204469a != 0) {
            EnumC14881ei enumC14881eiM86698a = EnumC14881ei.m86698a(EnumC14881ei.CONN_SUCCESS.m86699a() + iM204469a);
            aVar.f62501a = enumC14881eiM86698a;
            if (enumC14881eiM86698a == EnumC14881ei.CONN_BOSH_ERR && (cause = thM86745a.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.f62501a = EnumC14881ei.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.f62501a = EnumC14881ei.CONN_XMPP_ERR;
        }
        EnumC14881ei enumC14881ei = aVar.f62501a;
        if (enumC14881ei != EnumC14881ei.CONN_TCP_ERR_OTHER && enumC14881ei != EnumC14881ei.CONN_XMPP_ERR && enumC14881ei != EnumC14881ei.CONN_BOSH_ERR) {
            return aVar;
        }
        aVar.f62502b = str;
        return aVar;
    }

    /* JADX INFO: renamed from: d */
    public static a m86695d(Exception exc) {
        m86693b(exc);
        boolean z = exc instanceof C14885fi;
        Throwable thM86745a = exc;
        if (z) {
            C14885fi c14885fi = (C14885fi) exc;
            if (c14885fi.m86745a() != null) {
                thM86745a = exc;
                thM86745a = c14885fi.m86745a();
            }
        }
        thM86745a = exc;
        a aVar = new a();
        String message = thM86745a.getMessage();
        if (thM86745a.getCause() != null) {
            message = thM86745a.getCause().getMessage();
        }
        int iM204469a = w1r0.m204469a(thM86745a);
        String str = thM86745a.getClass().getSimpleName() + ":" + message;
        if (iM204469a == 105) {
            aVar.f62501a = EnumC14881ei.BIND_TCP_READ_TIMEOUT;
        } else if (iM204469a == 199) {
            aVar.f62501a = EnumC14881ei.BIND_TCP_ERR;
        } else if (iM204469a == 499) {
            aVar.f62501a = EnumC14881ei.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f62501a = EnumC14881ei.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (iM204469a == 109) {
            aVar.f62501a = EnumC14881ei.BIND_TCP_CONNRESET;
        } else if (iM204469a != 110) {
            aVar.f62501a = EnumC14881ei.BIND_XMPP_ERR;
        } else {
            aVar.f62501a = EnumC14881ei.BIND_TCP_BROKEN_PIPE;
        }
        EnumC14881ei enumC14881ei = aVar.f62501a;
        if (enumC14881ei != EnumC14881ei.BIND_TCP_ERR && enumC14881ei != EnumC14881ei.BIND_XMPP_ERR && enumC14881ei != EnumC14881ei.BIND_BOSH_ERR) {
            return aVar;
        }
        aVar.f62502b = str;
        return aVar;
    }

    /* JADX INFO: renamed from: e */
    public static a m86696e(Exception exc) {
        m86693b(exc);
        boolean z = exc instanceof C14885fi;
        Throwable thM86745a = exc;
        if (z) {
            C14885fi c14885fi = (C14885fi) exc;
            if (c14885fi.m86745a() != null) {
                thM86745a = exc;
                thM86745a = c14885fi.m86745a();
            }
        }
        thM86745a = exc;
        a aVar = new a();
        String message = thM86745a.getMessage();
        int iM204469a = w1r0.m204469a(thM86745a);
        String str = thM86745a.getClass().getSimpleName() + ":" + message;
        if (iM204469a == 105) {
            aVar.f62501a = EnumC14881ei.CHANNEL_TCP_READTIMEOUT;
        } else if (iM204469a == 199) {
            aVar.f62501a = EnumC14881ei.CHANNEL_TCP_ERR;
        } else if (iM204469a == 499) {
            aVar.f62501a = EnumC14881ei.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f62501a = EnumC14881ei.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (iM204469a == 109) {
            aVar.f62501a = EnumC14881ei.CHANNEL_TCP_CONNRESET;
        } else if (iM204469a != 110) {
            aVar.f62501a = EnumC14881ei.CHANNEL_XMPPEXCEPTION;
        } else {
            aVar.f62501a = EnumC14881ei.CHANNEL_TCP_BROKEN_PIPE;
        }
        EnumC14881ei enumC14881ei = aVar.f62501a;
        if (enumC14881ei != EnumC14881ei.CHANNEL_TCP_ERR && enumC14881ei != EnumC14881ei.CHANNEL_XMPPEXCEPTION && enumC14881ei != EnumC14881ei.CHANNEL_BOSH_EXCEPTION) {
            return aVar;
        }
        aVar.f62502b = str;
        return aVar;
    }
}
