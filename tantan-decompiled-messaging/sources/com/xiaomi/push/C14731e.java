package com.xiaomi.push;

import java.net.UnknownHostException;
import p149l.qsq0;

/* JADX INFO: renamed from: com.xiaomi.push.e */
/* JADX INFO: loaded from: classes2.dex */
final class C14731e {

    /* JADX INFO: renamed from: com.xiaomi.push.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        EnumC14733ei f61654a;

        /* JADX INFO: renamed from: b */
        String f61655b;
    }

    /* JADX INFO: renamed from: a */
    public static a m85521a(Exception exc) {
        m85522b(exc);
        boolean z = exc instanceof C14737fi;
        Throwable thM85574a = exc;
        if (z) {
            C14737fi c14737fi = (C14737fi) exc;
            if (c14737fi.m85574a() != null) {
                thM85574a = exc;
                thM85574a = c14737fi.m85574a();
            }
        }
        thM85574a = exc;
        a aVar = new a();
        String message = thM85574a.getMessage();
        if (thM85574a.getCause() != null) {
            message = thM85574a.getCause().getMessage();
        }
        String str = thM85574a.getClass().getSimpleName() + ":" + message;
        int iM176369a = qsq0.m176369a(thM85574a);
        if (iM176369a != 0) {
            aVar.f61654a = EnumC14733ei.m85527a(EnumC14733ei.GSLB_REQUEST_SUCCESS.m85528a() + iM176369a);
        }
        if (aVar.f61654a == null) {
            aVar.f61654a = EnumC14733ei.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f61654a == EnumC14733ei.GSLB_TCP_ERR_OTHER) {
            aVar.f61655b = str;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    private static void m85522b(Exception exc) {
        exc.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static a m85523c(Exception exc) {
        Throwable cause;
        m85522b(exc);
        boolean z = exc instanceof C14737fi;
        Throwable thM85574a = exc;
        if (z) {
            C14737fi c14737fi = (C14737fi) exc;
            if (c14737fi.m85574a() != null) {
                thM85574a = exc;
                thM85574a = c14737fi.m85574a();
            }
        }
        thM85574a = exc;
        a aVar = new a();
        String message = thM85574a.getMessage();
        if (thM85574a.getCause() != null) {
            message = thM85574a.getCause().getMessage();
        }
        int iM176369a = qsq0.m176369a(thM85574a);
        String str = thM85574a.getClass().getSimpleName() + ":" + message;
        if (iM176369a != 0) {
            EnumC14733ei enumC14733eiM85527a = EnumC14733ei.m85527a(EnumC14733ei.CONN_SUCCESS.m85528a() + iM176369a);
            aVar.f61654a = enumC14733eiM85527a;
            if (enumC14733eiM85527a == EnumC14733ei.CONN_BOSH_ERR && (cause = thM85574a.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.f61654a = EnumC14733ei.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.f61654a = EnumC14733ei.CONN_XMPP_ERR;
        }
        EnumC14733ei enumC14733ei = aVar.f61654a;
        if (enumC14733ei != EnumC14733ei.CONN_TCP_ERR_OTHER && enumC14733ei != EnumC14733ei.CONN_XMPP_ERR && enumC14733ei != EnumC14733ei.CONN_BOSH_ERR) {
            return aVar;
        }
        aVar.f61655b = str;
        return aVar;
    }

    /* JADX INFO: renamed from: d */
    public static a m85524d(Exception exc) {
        m85522b(exc);
        boolean z = exc instanceof C14737fi;
        Throwable thM85574a = exc;
        if (z) {
            C14737fi c14737fi = (C14737fi) exc;
            if (c14737fi.m85574a() != null) {
                thM85574a = exc;
                thM85574a = c14737fi.m85574a();
            }
        }
        thM85574a = exc;
        a aVar = new a();
        String message = thM85574a.getMessage();
        if (thM85574a.getCause() != null) {
            message = thM85574a.getCause().getMessage();
        }
        int iM176369a = qsq0.m176369a(thM85574a);
        String str = thM85574a.getClass().getSimpleName() + ":" + message;
        if (iM176369a == 105) {
            aVar.f61654a = EnumC14733ei.BIND_TCP_READ_TIMEOUT;
        } else if (iM176369a == 199) {
            aVar.f61654a = EnumC14733ei.BIND_TCP_ERR;
        } else if (iM176369a == 499) {
            aVar.f61654a = EnumC14733ei.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f61654a = EnumC14733ei.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (iM176369a == 109) {
            aVar.f61654a = EnumC14733ei.BIND_TCP_CONNRESET;
        } else if (iM176369a != 110) {
            aVar.f61654a = EnumC14733ei.BIND_XMPP_ERR;
        } else {
            aVar.f61654a = EnumC14733ei.BIND_TCP_BROKEN_PIPE;
        }
        EnumC14733ei enumC14733ei = aVar.f61654a;
        if (enumC14733ei != EnumC14733ei.BIND_TCP_ERR && enumC14733ei != EnumC14733ei.BIND_XMPP_ERR && enumC14733ei != EnumC14733ei.BIND_BOSH_ERR) {
            return aVar;
        }
        aVar.f61655b = str;
        return aVar;
    }

    /* JADX INFO: renamed from: e */
    public static a m85525e(Exception exc) {
        m85522b(exc);
        boolean z = exc instanceof C14737fi;
        Throwable thM85574a = exc;
        if (z) {
            C14737fi c14737fi = (C14737fi) exc;
            if (c14737fi.m85574a() != null) {
                thM85574a = exc;
                thM85574a = c14737fi.m85574a();
            }
        }
        thM85574a = exc;
        a aVar = new a();
        String message = thM85574a.getMessage();
        int iM176369a = qsq0.m176369a(thM85574a);
        String str = thM85574a.getClass().getSimpleName() + ":" + message;
        if (iM176369a == 105) {
            aVar.f61654a = EnumC14733ei.CHANNEL_TCP_READTIMEOUT;
        } else if (iM176369a == 199) {
            aVar.f61654a = EnumC14733ei.CHANNEL_TCP_ERR;
        } else if (iM176369a == 499) {
            aVar.f61654a = EnumC14733ei.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f61654a = EnumC14733ei.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (iM176369a == 109) {
            aVar.f61654a = EnumC14733ei.CHANNEL_TCP_CONNRESET;
        } else if (iM176369a != 110) {
            aVar.f61654a = EnumC14733ei.CHANNEL_XMPPEXCEPTION;
        } else {
            aVar.f61654a = EnumC14733ei.CHANNEL_TCP_BROKEN_PIPE;
        }
        EnumC14733ei enumC14733ei = aVar.f61654a;
        if (enumC14733ei != EnumC14733ei.CHANNEL_TCP_ERR && enumC14733ei != EnumC14733ei.CHANNEL_XMPPEXCEPTION && enumC14733ei != EnumC14733ei.CHANNEL_BOSH_EXCEPTION) {
            return aVar;
        }
        aVar.f61655b = str;
        return aVar;
    }
}
