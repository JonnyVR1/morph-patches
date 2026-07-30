package com.p046p1.mobile.putong.live.external.internal.vchat;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import p133rx.C22306c;
import p149l.b5s;
import p149l.cfe0;
import p149l.elj;
import p149l.ffe0;
import p149l.fp50;
import p149l.fxj;
import p149l.kze0;
import p149l.q2f;
import p149l.rge0;
import p149l.soj0;
import p149l.u3g0;
import p149l.w1e0;
import p149l.xnu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatEventBus {
    public final C12497a GiftDialogEventGroup;
    public final C12498b GiftTraysEventGroup;
    public final C12499c LiveVChatBridgeImplEvent;
    public final C12500d LiveVChatOpenH5Event;
    public final C12501e LiveVideoChatEvent;
    public final C12502f SchemeHandleEvent;
    public final C12503g SendGiftEventGroup;
    public final C12504h TraysViewEventGroup;
    private final q2f mEventBusImpl;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$a */
    public class C12497a {
        public C12497a() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<Boolean, C22306c<Boolean>> m69173a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_20");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19397d<Boolean, C22306c<Boolean>> m69174b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_9");
        }

        /* JADX INFO: renamed from: c */
        public q2f.C19396c<C22306c<soj0>> m69175c() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("0_12");
        }

        /* JADX INFO: renamed from: d */
        public q2f.C19396c<C22306c<soj0>> m69176d() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("0_11");
        }

        /* JADX INFO: renamed from: e */
        public q2f.C19397d<ffe0, C22306c<ffe0>> m69177e() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_10");
        }

        /* JADX INFO: renamed from: f */
        public q2f.C19397d<fp50, C22306c<fp50>> m69178f() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h(Constants.TEST_IDENTIFIER);
        }

        /* JADX INFO: renamed from: g */
        public q2f.C19397d<elj, C22306c<elj>> m69179g() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_16");
        }

        /* JADX INFO: renamed from: h */
        public q2f.C19397d<String, C22306c<String>> m69180h() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_4");
        }

        /* JADX INFO: renamed from: i */
        public q2f.C19397d<kze0, C22306c<kze0>> m69181i() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("0_8");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$b */
    public class C12498b {
        public C12498b() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<fxj, C22306c<fxj>> m69182a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("3_2");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19397d<fxj, C22306c<fxj>> m69183b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("3_3");
        }

        /* JADX INFO: renamed from: c */
        public q2f.C19397d<Boolean, C22306c<Boolean>> m69184c() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("3_4");
        }

        /* JADX INFO: renamed from: d */
        public q2f.C19397d<fxj, C22306c<fxj>> m69185d() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("3_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$c */
    public class C12499c {
        public C12499c() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19396c<C22306c<soj0>> m69186a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("5_0");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19397d<String, C22306c<String>> m69187b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("5_3");
        }

        /* JADX INFO: renamed from: c */
        public q2f.C19397d<u3g0, C22306c<u3g0>> m69188c() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("5_2");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$d */
    public class C12500d {
        public C12500d() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19396c<C22306c<soj0>> m69189a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("4_1");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19397d<xnu, C22306c<xnu>> m69190b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("4_0");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$e */
    public class C12501e {
        public C12501e() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<Boolean, C22306c<Boolean>> m69191a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_0");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19396c<C22306c<soj0>> m69192b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("7_3");
        }

        /* JADX INFO: renamed from: c */
        public q2f.C19396c<C22306c<soj0>> m69193c() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("7_7");
        }

        /* JADX INFO: renamed from: d */
        public q2f.C19396c<C22306c<soj0>> m69194d() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("7_8");
        }

        /* JADX INFO: renamed from: e */
        public q2f.C19397d<BLiveVideoChatAnchorCall, C22306c<BLiveVideoChatAnchorCall>> m69195e() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_12");
        }

        /* JADX INFO: renamed from: f */
        public q2f.C19396c<C22306c<soj0>> m69196f() {
            return LiveVChatEventBus.this.mEventBusImpl.m172449i("7_10");
        }

        /* JADX INFO: renamed from: g */
        public q2f.C19397d<C12506b.a, C22306c<C12506b.a>> m69197g() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_13");
        }

        /* JADX INFO: renamed from: h */
        public q2f.C19397d<String, C22306c<String>> m69198h() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_6");
        }

        /* JADX INFO: renamed from: i */
        public q2f.C19397d<C12506b, C22306c<C12506b>> m69199i() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_5");
        }

        /* JADX INFO: renamed from: j */
        public q2f.C19397d<BLiveVideoChatLive, C22306c<BLiveVideoChatLive>> m69200j() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_11");
        }

        /* JADX INFO: renamed from: k */
        public q2f.C19397d<Boolean, C22306c<Boolean>> m69201k() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("7_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$f */
    public class C12502f {
        public C12502f() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<w1e0, C22306c<w1e0>> m69202a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("6_0");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$g */
    public class C12503g {
        public C12503g() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<cfe0, C22306c<cfe0>> m69203a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("1_0");
        }

        /* JADX INFO: renamed from: b */
        public q2f.C19397d<rge0, C22306c<rge0>> m69204b() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("1_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$h */
    public class C12504h {
        public C12504h() {
        }

        /* JADX INFO: renamed from: a */
        public q2f.C19397d<String, C22306c<String>> m69205a() {
            return LiveVChatEventBus.this.mEventBusImpl.m172448h("2_1");
        }
    }

    public LiveVChatEventBus() {
        q2f q2fVar = new q2f();
        this.mEventBusImpl = q2fVar;
        q2fVar.m172450j(new b5s());
        this.GiftDialogEventGroup = new C12497a();
        this.SendGiftEventGroup = new C12503g();
        this.TraysViewEventGroup = new C12504h();
        this.GiftTraysEventGroup = new C12498b();
        this.LiveVChatOpenH5Event = new C12500d();
        this.LiveVChatBridgeImplEvent = new C12499c();
        this.SchemeHandleEvent = new C12502f();
        this.LiveVideoChatEvent = new C12501e();
    }
}
