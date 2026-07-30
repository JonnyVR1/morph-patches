package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: renamed from: com.tencent.liteav.network.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14311d implements InterfaceC14313f {

    /* JADX INFO: renamed from: f */
    private a f60362f;

    /* JADX INFO: renamed from: a */
    private InterfaceC14313f f60357a = null;

    /* JADX INFO: renamed from: b */
    private b f60358b = null;

    /* JADX INFO: renamed from: c */
    private long f60359c = 0;

    /* JADX INFO: renamed from: d */
    private long f60360d = 0;

    /* JADX INFO: renamed from: e */
    private b f60361e = null;

    /* JADX INFO: renamed from: g */
    private long f60363g = 0;

    /* JADX INFO: renamed from: h */
    private long f60364h = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.network.d$a */
    public interface a {
        void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z);
    }

    public C14311d(a aVar) {
        this.f60362f = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m84888a(TXIStreamDownloader tXIStreamDownloader, TXIStreamDownloader tXIStreamDownloader2, long j, long j2, String str) {
        this.f60359c = tXIStreamDownloader.getCurrentTS();
        this.f60360d = tXIStreamDownloader.getLastIFrameTS();
        b bVar = new b(tXIStreamDownloader, this);
        this.f60358b = bVar;
        bVar.m84899a(this);
        ((TXCFLVDownloader) tXIStreamDownloader).recvData(true);
        Vector<C14312e> vector = new Vector<>();
        vector.add(new C14312e(str, false));
        tXIStreamDownloader2.setOriginUrl(str);
        ((TXCFLVDownloader) tXIStreamDownloader2).recvData(true);
        tXIStreamDownloader2.startDownload(vector, false, false, tXIStreamDownloader.mEnableMessage, tXIStreamDownloader.mEnableMetaData);
        b bVar2 = new b(tXIStreamDownloader2, this);
        this.f60361e = bVar2;
        bVar2.m84898a(this.f60359c);
    }

    /* JADX INFO: renamed from: b */
    public void m84891b() {
        this.f60358b.m84899a((InterfaceC14313f) null);
        this.f60361e.m84899a(this);
        this.f60358b = this.f60361e;
        this.f60361e = null;
        StringBuilder sb = new StringBuilder(" stream_switch end at ");
        sb.append(this.f60359c);
        sb.append(" stop ts ");
        sb.append(this.f60364h);
        sb.append(" start ts ");
        sb.append(this.f60363g);
        sb.append(" diff ts ");
        long j = this.f60364h;
        long j2 = this.f60363g;
        sb.append(j > j2 ? j - j2 : j2 - j);
        TXCLog.m84156w("TXCMultiStreamDownloader", sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m84893c(long j) {
        this.f60364h = j;
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullAudio(C14204a c14204a) {
        InterfaceC14313f interfaceC14313f = this.f60357a;
        if (interfaceC14313f != null) {
            interfaceC14313f.onPullAudio(c14204a);
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        long j = tXSNALPacket.pts;
        this.f60359c = j;
        if (tXSNALPacket.nalType == 0) {
            this.f60360d = j;
        }
        InterfaceC14313f interfaceC14313f = this.f60357a;
        if (interfaceC14313f != null) {
            interfaceC14313f.onPullNAL(tXSNALPacket);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84890a(InterfaceC14313f interfaceC14313f) {
        this.f60357a = interfaceC14313f;
    }

    /* JADX INFO: renamed from: a */
    public void m84887a() {
        b bVar = this.f60358b;
        if (bVar != null) {
            bVar.m84900b(0L);
        }
        b bVar2 = this.f60361e;
        if (bVar2 != null) {
            bVar2.m84900b(0L);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84892b(long j) {
        this.f60363g = j;
    }

    /* JADX INFO: renamed from: a */
    public void m84889a(TXIStreamDownloader tXIStreamDownloader, boolean z) {
        a aVar = this.f60362f;
        if (aVar != null) {
            aVar.onSwitchFinish(tXIStreamDownloader, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m84886a(long j) {
        b bVar = this.f60358b;
        if (bVar != null) {
            bVar.m84900b(this.f60359c);
        }
        TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch delay stop begin from " + this.f60359c);
        return this.f60359c;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.d$b */
    public static class b implements InterfaceC14170b, InterfaceC14313f {

        /* JADX INFO: renamed from: a */
        private final int f60365a = 2;

        /* JADX INFO: renamed from: b */
        private long f60366b = 0;

        /* JADX INFO: renamed from: c */
        private long f60367c = 0;

        /* JADX INFO: renamed from: d */
        private int f60368d = 0;

        /* JADX INFO: renamed from: e */
        private boolean f60369e = false;

        /* JADX INFO: renamed from: f */
        private long f60370f = 0;

        /* JADX INFO: renamed from: g */
        private long f60371g = 0;

        /* JADX INFO: renamed from: h */
        private long f60372h = 0;

        /* JADX INFO: renamed from: i */
        private ArrayList<TXSNALPacket> f60373i = new ArrayList<>();

        /* JADX INFO: renamed from: j */
        private ArrayList<C14204a> f60374j = new ArrayList<>();

        /* JADX INFO: renamed from: k */
        private TXIStreamDownloader f60375k;

        /* JADX INFO: renamed from: l */
        private WeakReference<C14311d> f60376l;

        /* JADX INFO: renamed from: m */
        private InterfaceC14313f f60377m;

        public b(TXIStreamDownloader tXIStreamDownloader, C14311d c14311d) {
            this.f60375k = null;
            this.f60376l = new WeakReference<>(c14311d);
            this.f60375k = tXIStreamDownloader;
            tXIStreamDownloader.setListener(this);
        }

        /* JADX INFO: renamed from: a */
        private void m84894a(TXSNALPacket tXSNALPacket) {
            C14311d c14311d = this.f60376l.get();
            if (tXSNALPacket.nalType == 0 && !this.f60369e) {
                this.f60368d++;
                if (c14311d != null) {
                    long j = c14311d.f60360d;
                    long j2 = tXSNALPacket.pts;
                    if (j <= j2 || this.f60368d == 2) {
                        this.f60366b = c14311d.m84886a(j2);
                        this.f60369e = true;
                    }
                }
                if (c14311d != null) {
                    TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch pre start begin gop " + this.f60368d + " last iframe ts " + c14311d.f60360d + " pts " + tXSNALPacket.pts + " from " + this.f60366b + " type " + tXSNALPacket.nalType);
                }
            }
            if (this.f60369e) {
                if (c14311d != null) {
                    c14311d.m84892b(tXSNALPacket.pts);
                }
                long j3 = tXSNALPacket.pts;
                if (j3 >= this.f60366b) {
                    if (tXSNALPacket.nalType == 0 && this.f60367c == 0) {
                        this.f60367c = j3;
                        TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch pre start end " + tXSNALPacket.pts + " from " + this.f60366b + " type " + tXSNALPacket.nalType);
                    }
                    if (this.f60367c > 0) {
                        if (this.f60377m == null) {
                            TXCLog.m84152i("TXCMultiStreamDownloader", " stream_switch pre start cache video pts " + tXSNALPacket.pts + " from " + this.f60367c + " type " + tXSNALPacket.nalType);
                            this.f60373i.add(tXSNALPacket);
                            return;
                        }
                        if (c14311d != null) {
                            c14311d.m84889a(this.f60375k, true);
                        }
                        if (!this.f60374j.isEmpty()) {
                            for (C14204a c14204a : this.f60374j) {
                                if (c14204a.f59306e >= this.f60367c) {
                                    TXCLog.m84152i("TXCMultiStreamDownloader", " stream_switch pre start cache audio pts " + c14204a.f59306e + " from " + this.f60367c);
                                    this.f60377m.onPullAudio(c14204a);
                                }
                            }
                            TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch pre start end audio cache  " + this.f60374j.size());
                            this.f60374j.clear();
                        }
                        if (!this.f60373i.isEmpty()) {
                            TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch pre start end video cache  " + this.f60373i.size());
                            Iterator<TXSNALPacket> it = this.f60373i.iterator();
                            while (it.hasNext()) {
                                this.f60377m.onPullNAL(it.next());
                            }
                            this.f60373i.clear();
                        }
                        TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch pre start first pull nal " + tXSNALPacket.pts + " from " + this.f60367c + " type " + tXSNALPacket.nalType);
                        this.f60377m.onPullNAL(tXSNALPacket);
                        this.f60377m = null;
                        this.f60375k.setNotifyListener(null);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m84896b(TXSNALPacket tXSNALPacket) {
            C14311d c14311d = this.f60376l.get();
            if (c14311d != null) {
                c14311d.m84893c(tXSNALPacket.pts);
            }
            long j = tXSNALPacket.pts;
            if (j < this.f60370f) {
                InterfaceC14313f interfaceC14313f = this.f60377m;
                if (interfaceC14313f != null) {
                    interfaceC14313f.onPullNAL(tXSNALPacket);
                    return;
                }
                return;
            }
            if (tXSNALPacket.nalType == 0) {
                this.f60371g = j;
            }
            if (this.f60371g <= 0) {
                InterfaceC14313f interfaceC14313f2 = this.f60377m;
                if (interfaceC14313f2 != null) {
                    interfaceC14313f2.onPullNAL(tXSNALPacket);
                    return;
                }
                return;
            }
            if (this.f60372h <= 0) {
                TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch delay stop video end wait audio end video pts " + tXSNALPacket.pts + " from " + this.f60370f + " type " + tXSNALPacket.nalType);
                return;
            }
            TXCLog.m84156w("TXCMultiStreamDownloader", " stream_switch delay stop end video pts " + this.f60371g + " audio ts " + this.f60372h + " from " + this.f60370f);
            if (c14311d != null) {
                c14311d.m84891b();
            }
            this.f60377m = null;
            this.f60375k.setListener(null);
            this.f60375k.stopDownload();
        }

        @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
        public void onNotifyEvent(int i, Bundle bundle) {
            if (i == -2301 || i == 3010) {
                C14311d c14311d = this.f60376l.get();
                if (c14311d != null) {
                    c14311d.m84889a(this.f60375k, false);
                }
                this.f60375k.setNotifyListener(null);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC14313f
        public void onPullAudio(C14204a c14204a) {
            if (this.f60366b > 0) {
                m84895a(c14204a);
                return;
            }
            if (this.f60370f > 0) {
                m84897b(c14204a);
                return;
            }
            InterfaceC14313f interfaceC14313f = this.f60377m;
            if (interfaceC14313f != null) {
                interfaceC14313f.onPullAudio(c14204a);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC14313f
        public void onPullNAL(TXSNALPacket tXSNALPacket) {
            if (tXSNALPacket == null) {
                return;
            }
            if (this.f60366b > 0) {
                m84894a(tXSNALPacket);
                return;
            }
            if (this.f60370f > 0) {
                m84896b(tXSNALPacket);
                return;
            }
            InterfaceC14313f interfaceC14313f = this.f60377m;
            if (interfaceC14313f != null) {
                interfaceC14313f.onPullNAL(tXSNALPacket);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m84897b(C14204a c14204a) {
            if (this.f60372h > 0) {
                return;
            }
            long j = this.f60371g;
            if (j > 0 && c14204a != null) {
                long j2 = c14204a.f59306e;
                if (j2 >= j) {
                    this.f60372h = j2;
                    return;
                }
            }
            InterfaceC14313f interfaceC14313f = this.f60377m;
            if (interfaceC14313f != null) {
                interfaceC14313f.onPullAudio(c14204a);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m84900b(long j) {
            this.f60366b = 0L;
            this.f60370f = j;
            this.f60372h = 0L;
            this.f60371g = 0L;
            TXIStreamDownloader tXIStreamDownloader = this.f60375k;
            if (tXIStreamDownloader == null || j != 0) {
                return;
            }
            tXIStreamDownloader.stopDownload();
            this.f60375k = null;
        }

        /* JADX INFO: renamed from: a */
        public void m84899a(InterfaceC14313f interfaceC14313f) {
            this.f60377m = interfaceC14313f;
        }

        /* JADX INFO: renamed from: a */
        private void m84895a(C14204a c14204a) {
            if (c14204a == null) {
                return;
            }
            long j = c14204a.f59306e;
            long j2 = this.f60367c;
            if (j < j2 || j < this.f60366b) {
                return;
            }
            InterfaceC14313f interfaceC14313f = this.f60377m;
            if (interfaceC14313f != null && j2 > 0 && j >= j2) {
                interfaceC14313f.onPullAudio(c14204a);
            } else {
                this.f60374j.add(c14204a);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m84898a(long j) {
            this.f60368d = 0;
            this.f60366b = j;
            this.f60375k.setListener(this);
            this.f60375k.setNotifyListener(this);
        }
    }
}
