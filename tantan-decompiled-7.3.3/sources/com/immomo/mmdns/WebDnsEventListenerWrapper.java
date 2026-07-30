package com.immomo.mmdns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;
import p153l.bx5;
import p153l.i5d0;
import p153l.ry3;
import p153l.t4f;
import p153l.txk;
import p153l.x1d0;

/* JADX INFO: loaded from: classes7.dex */
public class WebDnsEventListenerWrapper extends t4f {
    private final t4f eventListener;
    public t4f outterEventListener;

    public WebDnsEventListenerWrapper(t4f t4fVar, t4f t4fVar2) {
        this.eventListener = t4fVar2;
        this.outterEventListener = t4fVar;
    }

    @Override // p153l.t4f
    public void callEnd(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.callEnd(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.callEnd(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.callFailed(ry3Var, iOException);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.callFailed(ry3Var, iOException);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void callStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.callStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.callStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.connectStart(ry3Var, inetSocketAddress, proxy);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.connectStart(ry3Var, inetSocketAddress, proxy);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void connectionAcquired(ry3 ry3Var, bx5 bx5Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.connectionAcquired(ry3Var, bx5Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.connectionAcquired(ry3Var, bx5Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void connectionReleased(ry3 ry3Var, bx5 bx5Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.connectionReleased(ry3Var, bx5Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.connectionReleased(ry3Var, bx5Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, List<InetAddress> list) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.dnsEnd(ry3Var, str, list);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.dnsEnd(ry3Var, str, list);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void dnsStart(ry3 ry3Var, String str) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.dnsStart(ry3Var, str);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.dnsStart(ry3Var, str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void requestBodyEnd(ry3 ry3Var, long j) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.requestBodyEnd(ry3Var, j);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.requestBodyEnd(ry3Var, j);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void requestBodyStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.requestBodyStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.requestBodyStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.requestHeadersEnd(ry3Var, x1d0Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.requestHeadersEnd(ry3Var, x1d0Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void requestHeadersStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.requestHeadersStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.requestHeadersStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void responseBodyEnd(ry3 ry3Var, long j) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.responseBodyEnd(ry3Var, j);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.responseBodyEnd(ry3Var, j);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void responseBodyStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.responseBodyStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.responseBodyStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.responseHeadersEnd(ry3Var, i5d0Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.responseHeadersEnd(ry3Var, i5d0Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void responseHeadersStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.responseHeadersStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.responseHeadersStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void secureConnectEnd(ry3 ry3Var, txk txkVar) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.secureConnectEnd(ry3Var, txkVar);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.secureConnectEnd(ry3Var, txkVar);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void secureConnectStart(ry3 ry3Var) {
        try {
            t4f t4fVar = this.eventListener;
            if (t4fVar != null) {
                t4fVar.secureConnectStart(ry3Var);
            }
            t4f t4fVar2 = this.outterEventListener;
            if (t4fVar2 != null) {
                t4fVar2.secureConnectStart(ry3Var);
            }
        } catch (Exception unused) {
        }
    }
}
