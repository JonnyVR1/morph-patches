package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.C14041a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: renamed from: com.tencent.liteav.network.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14148d implements InterfaceC14150f {

    /* JADX INFO: renamed from: f */
    private a f59514f;

    /* JADX INFO: renamed from: a */
    private InterfaceC14150f f59509a = null;

    /* JADX INFO: renamed from: b */
    private b f59510b = null;

    /* JADX INFO: renamed from: c */
    private long f59511c = 0;

    /* JADX INFO: renamed from: d */
    private long f59512d = 0;

    /* JADX INFO: renamed from: e */
    private b f59513e = null;

    /* JADX INFO: renamed from: g */
    private long f59515g = 0;

    /* JADX INFO: renamed from: h */
    private long f59516h = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.network.d$a */
    public interface a {
        void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z);
    }

    public C14148d(a aVar) {
        this.f59514f = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m83705a(TXIStreamDownloader tXIStreamDownloader, TXIStreamDownloader tXIStreamDownloader2, long j, long j2, String str) {
        this.f59511c = tXIStreamDownloader.getCurrentTS();
        this.f59512d = tXIStreamDownloader.getLastIFrameTS();
        b bVar = new b(tXIStreamDownloader, this);
        this.f59510b = bVar;
        bVar.m83716a(this);
        ((TXCFLVDownloader) tXIStreamDownloader).recvData(true);
        Vector<C14149e> vector = new Vector<>();
        vector.add(new C14149e(str, false));
        tXIStreamDownloader2.setOriginUrl(str);
        ((TXCFLVDownloader) tXIStreamDownloader2).recvData(true);
        tXIStreamDownloader2.startDownload(vector, false, false, tXIStreamDownloader.mEnableMessage, tXIStreamDownloader.mEnableMetaData);
        b bVar2 = new b(tXIStreamDownloader2, this);
        this.f59513e = bVar2;
        bVar2.m83715a(this.f59511c);
    }

    /* JADX INFO: renamed from: b */
    public void m83708b() {
        this.f59510b.m83716a((InterfaceC14150f) null);
        this.f59513e.m83716a(this);
        this.f59510b = this.f59513e;
        this.f59513e = null;
        StringBuilder sb = new StringBuilder(" stream_switch end at ");
        sb.append(this.f59511c);
        sb.append(" stop ts ");
        sb.append(this.f59516h);
        sb.append(" start ts ");
        sb.append(this.f59515g);
        sb.append(" diff ts ");
        long j = this.f59516h;
        long j2 = this.f59515g;
        sb.append(j > j2 ? j - j2 : j2 - j);
        TXCLog.m82973w("TXCMultiStreamDownloader", sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m83710c(long j) {
        this.f59516h = j;
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
    public void onPullAudio(C14041a c14041a) {
        InterfaceC14150f interfaceC14150f = this.f59509a;
        if (interfaceC14150f != null) {
            interfaceC14150f.onPullAudio(c14041a);
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        long j = tXSNALPacket.pts;
        this.f59511c = j;
        if (tXSNALPacket.nalType == 0) {
            this.f59512d = j;
        }
        InterfaceC14150f interfaceC14150f = this.f59509a;
        if (interfaceC14150f != null) {
            interfaceC14150f.onPullNAL(tXSNALPacket);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83707a(InterfaceC14150f interfaceC14150f) {
        this.f59509a = interfaceC14150f;
    }

    /* JADX INFO: renamed from: a */
    public void m83704a() {
        b bVar = this.f59510b;
        if (bVar != null) {
            bVar.m83717b(0L);
        }
        b bVar2 = this.f59513e;
        if (bVar2 != null) {
            bVar2.m83717b(0L);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83709b(long j) {
        this.f59515g = j;
    }

    /* JADX INFO: renamed from: a */
    public void m83706a(TXIStreamDownloader tXIStreamDownloader, boolean z) {
        a aVar = this.f59514f;
        if (aVar != null) {
            aVar.onSwitchFinish(tXIStreamDownloader, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m83703a(long j) {
        b bVar = this.f59510b;
        if (bVar != null) {
            bVar.m83717b(this.f59511c);
        }
        TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch delay stop begin from " + this.f59511c);
        return this.f59511c;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.d$b */
    public static class b implements InterfaceC14007b, InterfaceC14150f {

        /* JADX INFO: renamed from: a */
        private final int f59517a = 2;

        /* JADX INFO: renamed from: b */
        private long f59518b = 0;

        /* JADX INFO: renamed from: c */
        private long f59519c = 0;

        /* JADX INFO: renamed from: d */
        private int f59520d = 0;

        /* JADX INFO: renamed from: e */
        private boolean f59521e = false;

        /* JADX INFO: renamed from: f */
        private long f59522f = 0;

        /* JADX INFO: renamed from: g */
        private long f59523g = 0;

        /* JADX INFO: renamed from: h */
        private long f59524h = 0;

        /* JADX INFO: renamed from: i */
        private ArrayList<TXSNALPacket> f59525i = new ArrayList<>();

        /* JADX INFO: renamed from: j */
        private ArrayList<C14041a> f59526j = new ArrayList<>();

        /* JADX INFO: renamed from: k */
        private TXIStreamDownloader f59527k;

        /* JADX INFO: renamed from: l */
        private WeakReference<C14148d> f59528l;

        /* JADX INFO: renamed from: m */
        private InterfaceC14150f f59529m;

        public b(TXIStreamDownloader tXIStreamDownloader, C14148d c14148d) {
            this.f59527k = null;
            this.f59528l = new WeakReference<>(c14148d);
            this.f59527k = tXIStreamDownloader;
            tXIStreamDownloader.setListener(this);
        }

        /* JADX INFO: renamed from: a */
        private void m83711a(TXSNALPacket tXSNALPacket) {
            C14148d c14148d = this.f59528l.get();
            if (tXSNALPacket.nalType == 0 && !this.f59521e) {
                this.f59520d++;
                if (c14148d != null) {
                    long j = c14148d.f59512d;
                    long j2 = tXSNALPacket.pts;
                    if (j <= j2 || this.f59520d == 2) {
                        this.f59518b = c14148d.m83703a(j2);
                        this.f59521e = true;
                    }
                }
                if (c14148d != null) {
                    TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch pre start begin gop " + this.f59520d + " last iframe ts " + c14148d.f59512d + " pts " + tXSNALPacket.pts + " from " + this.f59518b + " type " + tXSNALPacket.nalType);
                }
            }
            if (this.f59521e) {
                if (c14148d != null) {
                    c14148d.m83709b(tXSNALPacket.pts);
                }
                long j3 = tXSNALPacket.pts;
                if (j3 >= this.f59518b) {
                    if (tXSNALPacket.nalType == 0 && this.f59519c == 0) {
                        this.f59519c = j3;
                        TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch pre start end " + tXSNALPacket.pts + " from " + this.f59518b + " type " + tXSNALPacket.nalType);
                    }
                    if (this.f59519c > 0) {
                        if (this.f59529m == null) {
                            TXCLog.m82969i("TXCMultiStreamDownloader", " stream_switch pre start cache video pts " + tXSNALPacket.pts + " from " + this.f59519c + " type " + tXSNALPacket.nalType);
                            this.f59525i.add(tXSNALPacket);
                            return;
                        }
                        if (c14148d != null) {
                            c14148d.m83706a(this.f59527k, true);
                        }
                        if (!this.f59526j.isEmpty()) {
                            for (C14041a c14041a : this.f59526j) {
                                if (c14041a.f58458e >= this.f59519c) {
                                    TXCLog.m82969i("TXCMultiStreamDownloader", " stream_switch pre start cache audio pts " + c14041a.f58458e + " from " + this.f59519c);
                                    this.f59529m.onPullAudio(c14041a);
                                }
                            }
                            TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch pre start end audio cache  " + this.f59526j.size());
                            this.f59526j.clear();
                        }
                        if (!this.f59525i.isEmpty()) {
                            TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch pre start end video cache  " + this.f59525i.size());
                            Iterator<TXSNALPacket> it = this.f59525i.iterator();
                            while (it.hasNext()) {
                                this.f59529m.onPullNAL(it.next());
                            }
                            this.f59525i.clear();
                        }
                        TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch pre start first pull nal " + tXSNALPacket.pts + " from " + this.f59519c + " type " + tXSNALPacket.nalType);
                        this.f59529m.onPullNAL(tXSNALPacket);
                        this.f59529m = null;
                        this.f59527k.setNotifyListener(null);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m83713b(TXSNALPacket tXSNALPacket) {
            C14148d c14148d = this.f59528l.get();
            if (c14148d != null) {
                c14148d.m83710c(tXSNALPacket.pts);
            }
            long j = tXSNALPacket.pts;
            if (j < this.f59522f) {
                InterfaceC14150f interfaceC14150f = this.f59529m;
                if (interfaceC14150f != null) {
                    interfaceC14150f.onPullNAL(tXSNALPacket);
                    return;
                }
                return;
            }
            if (tXSNALPacket.nalType == 0) {
                this.f59523g = j;
            }
            if (this.f59523g <= 0) {
                InterfaceC14150f interfaceC14150f2 = this.f59529m;
                if (interfaceC14150f2 != null) {
                    interfaceC14150f2.onPullNAL(tXSNALPacket);
                    return;
                }
                return;
            }
            if (this.f59524h <= 0) {
                TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch delay stop video end wait audio end video pts " + tXSNALPacket.pts + " from " + this.f59522f + " type " + tXSNALPacket.nalType);
                return;
            }
            TXCLog.m82973w("TXCMultiStreamDownloader", " stream_switch delay stop end video pts " + this.f59523g + " audio ts " + this.f59524h + " from " + this.f59522f);
            if (c14148d != null) {
                c14148d.m83708b();
            }
            this.f59529m = null;
            this.f59527k.setListener(null);
            this.f59527k.stopDownload();
        }

        @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
        public void onNotifyEvent(int i, Bundle bundle) {
            if (i == -2301 || i == 3010) {
                C14148d c14148d = this.f59528l.get();
                if (c14148d != null) {
                    c14148d.m83706a(this.f59527k, false);
                }
                this.f59527k.setNotifyListener(null);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC14150f
        public void onPullAudio(C14041a c14041a) {
            if (this.f59518b > 0) {
                m83712a(c14041a);
                return;
            }
            if (this.f59522f > 0) {
                m83714b(c14041a);
                return;
            }
            InterfaceC14150f interfaceC14150f = this.f59529m;
            if (interfaceC14150f != null) {
                interfaceC14150f.onPullAudio(c14041a);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC14150f
        public void onPullNAL(TXSNALPacket tXSNALPacket) {
            if (tXSNALPacket == null) {
                return;
            }
            if (this.f59518b > 0) {
                m83711a(tXSNALPacket);
                return;
            }
            if (this.f59522f > 0) {
                m83713b(tXSNALPacket);
                return;
            }
            InterfaceC14150f interfaceC14150f = this.f59529m;
            if (interfaceC14150f != null) {
                interfaceC14150f.onPullNAL(tXSNALPacket);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m83714b(C14041a c14041a) {
            if (this.f59524h > 0) {
                return;
            }
            long j = this.f59523g;
            if (j > 0 && c14041a != null) {
                long j2 = c14041a.f58458e;
                if (j2 >= j) {
                    this.f59524h = j2;
                    return;
                }
            }
            InterfaceC14150f interfaceC14150f = this.f59529m;
            if (interfaceC14150f != null) {
                interfaceC14150f.onPullAudio(c14041a);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m83717b(long j) {
            this.f59518b = 0L;
            this.f59522f = j;
            this.f59524h = 0L;
            this.f59523g = 0L;
            TXIStreamDownloader tXIStreamDownloader = this.f59527k;
            if (tXIStreamDownloader == null || j != 0) {
                return;
            }
            tXIStreamDownloader.stopDownload();
            this.f59527k = null;
        }

        /* JADX INFO: renamed from: a */
        public void m83716a(InterfaceC14150f interfaceC14150f) {
            this.f59529m = interfaceC14150f;
        }

        /* JADX INFO: renamed from: a */
        private void m83712a(C14041a c14041a) {
            if (c14041a == null) {
                return;
            }
            long j = c14041a.f58458e;
            long j2 = this.f59519c;
            if (j < j2 || j < this.f59518b) {
                return;
            }
            InterfaceC14150f interfaceC14150f = this.f59529m;
            if (interfaceC14150f != null && j2 > 0 && j >= j2) {
                interfaceC14150f.onPullAudio(c14041a);
            } else {
                this.f59526j.add(c14041a);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m83715a(long j) {
            this.f59520d = 0;
            this.f59518b = j;
            this.f59527k.setListener(this);
            this.f59527k.setNotifyListener(this);
        }
    }
}
