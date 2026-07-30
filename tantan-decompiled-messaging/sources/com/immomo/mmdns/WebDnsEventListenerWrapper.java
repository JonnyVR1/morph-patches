package com.immomo.mmdns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;
import p149l.dvk;
import p149l.exc0;
import p149l.o3f;
import p149l.stc0;
import p149l.sx3;
import p149l.wv5;

/* JADX INFO: loaded from: classes7.dex */
public class WebDnsEventListenerWrapper extends o3f {
    private final o3f eventListener;
    public o3f outterEventListener;

    public WebDnsEventListenerWrapper(o3f o3fVar, o3f o3fVar2) {
        this.eventListener = o3fVar2;
        this.outterEventListener = o3fVar;
    }

    @Override // p149l.o3f
    public void callEnd(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.callEnd(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.callEnd(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.callFailed(sx3Var, iOException);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.callFailed(sx3Var, iOException);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void callStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.callStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.callStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.connectStart(sx3Var, inetSocketAddress, proxy);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.connectStart(sx3Var, inetSocketAddress, proxy);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.connectionAcquired(sx3Var, wv5Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.connectionAcquired(sx3Var, wv5Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.connectionReleased(sx3Var, wv5Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.connectionReleased(sx3Var, wv5Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.dnsEnd(sx3Var, str, list);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.dnsEnd(sx3Var, str, list);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void dnsStart(sx3 sx3Var, String str) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.dnsStart(sx3Var, str);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.dnsStart(sx3Var, str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void requestBodyEnd(sx3 sx3Var, long j) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.requestBodyEnd(sx3Var, j);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.requestBodyEnd(sx3Var, j);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void requestBodyStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.requestBodyStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.requestBodyStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.requestHeadersEnd(sx3Var, stc0Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.requestHeadersEnd(sx3Var, stc0Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void requestHeadersStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.requestHeadersStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.requestHeadersStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void responseBodyEnd(sx3 sx3Var, long j) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.responseBodyEnd(sx3Var, j);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.responseBodyEnd(sx3Var, j);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void responseBodyStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.responseBodyStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.responseBodyStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.responseHeadersEnd(sx3Var, exc0Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.responseHeadersEnd(sx3Var, exc0Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void responseHeadersStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.responseHeadersStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.responseHeadersStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.secureConnectEnd(sx3Var, dvkVar);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.secureConnectEnd(sx3Var, dvkVar);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void secureConnectStart(sx3 sx3Var) {
        try {
            o3f o3fVar = this.eventListener;
            if (o3fVar != null) {
                o3fVar.secureConnectStart(sx3Var);
            }
            o3f o3fVar2 = this.outterEventListener;
            if (o3fVar2 != null) {
                o3fVar2.secureConnectStart(sx3Var);
            }
        } catch (Exception unused) {
        }
    }
}
