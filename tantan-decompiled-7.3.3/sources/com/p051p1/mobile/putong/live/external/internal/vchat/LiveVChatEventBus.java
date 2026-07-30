package com.p051p1.mobile.putong.live.external.internal.vchat;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import p137rx.C22421c;
import p153l.aae0;
import p153l.bcg0;
import p153l.c7s;
import p153l.hne0;
import p153l.kne0;
import p153l.lx50;
import p153l.r7f0;
import p153l.unj;
import p153l.v3f;
import p153l.vxj0;
import p153l.vzj;
import p153l.woe0;
import p153l.ypu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatEventBus {
    public final C12660a GiftDialogEventGroup;
    public final C12661b GiftTraysEventGroup;
    public final C12662c LiveVChatBridgeImplEvent;
    public final C12663d LiveVChatOpenH5Event;
    public final C12664e LiveVideoChatEvent;
    public final C12665f SchemeHandleEvent;
    public final C12666g SendGiftEventGroup;
    public final C12667h TraysViewEventGroup;
    private final v3f mEventBusImpl;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$a */
    public class C12660a {
        public C12660a() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<Boolean, C22421c<Boolean>> m70356a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_20");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20736d<Boolean, C22421c<Boolean>> m70357b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_9");
        }

        /* JADX INFO: renamed from: c */
        public v3f.C20735c<C22421c<vxj0>> m70358c() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("4_12");
        }

        /* JADX INFO: renamed from: d */
        public v3f.C20735c<C22421c<vxj0>> m70359d() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("4_11");
        }

        /* JADX INFO: renamed from: e */
        public v3f.C20736d<kne0, C22421c<kne0>> m70360e() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_10");
        }

        /* JADX INFO: renamed from: f */
        public v3f.C20736d<lx50, C22421c<lx50>> m70361f() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_0");
        }

        /* JADX INFO: renamed from: g */
        public v3f.C20736d<unj, C22421c<unj>> m70362g() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_16");
        }

        /* JADX INFO: renamed from: h */
        public v3f.C20736d<String, C22421c<String>> m70363h() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_4");
        }

        /* JADX INFO: renamed from: i */
        public v3f.C20736d<r7f0, C22421c<r7f0>> m70364i() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("4_8");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$b */
    public class C12661b {
        public C12661b() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<vzj, C22421c<vzj>> m70365a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("2_2");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20736d<vzj, C22421c<vzj>> m70366b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("2_3");
        }

        /* JADX INFO: renamed from: c */
        public v3f.C20736d<Boolean, C22421c<Boolean>> m70367c() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("2_4");
        }

        /* JADX INFO: renamed from: d */
        public v3f.C20736d<vzj, C22421c<vzj>> m70368d() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("2_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$c */
    public class C12662c {
        public C12662c() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20735c<C22421c<vxj0>> m70369a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("6_0");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20736d<String, C22421c<String>> m70370b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("6_3");
        }

        /* JADX INFO: renamed from: c */
        public v3f.C20736d<bcg0, C22421c<bcg0>> m70371c() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("6_2");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$d */
    public class C12663d {
        public C12663d() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20735c<C22421c<vxj0>> m70372a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("7_1");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20736d<ypu, C22421c<ypu>> m70373b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("7_0");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$e */
    public class C12664e {
        public C12664e() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<Boolean, C22421c<Boolean>> m70374a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_0");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20735c<C22421c<vxj0>> m70375b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("1_3");
        }

        /* JADX INFO: renamed from: c */
        public v3f.C20735c<C22421c<vxj0>> m70376c() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("1_7");
        }

        /* JADX INFO: renamed from: d */
        public v3f.C20735c<C22421c<vxj0>> m70377d() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("1_8");
        }

        /* JADX INFO: renamed from: e */
        public v3f.C20736d<BLiveVideoChatAnchorCall, C22421c<BLiveVideoChatAnchorCall>> m70378e() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_12");
        }

        /* JADX INFO: renamed from: f */
        public v3f.C20735c<C22421c<vxj0>> m70379f() {
            return LiveVChatEventBus.this.mEventBusImpl.m199259i("1_10");
        }

        /* JADX INFO: renamed from: g */
        public v3f.C20736d<C12669b.a, C22421c<C12669b.a>> m70380g() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_13");
        }

        /* JADX INFO: renamed from: h */
        public v3f.C20736d<String, C22421c<String>> m70381h() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_6");
        }

        /* JADX INFO: renamed from: i */
        public v3f.C20736d<C12669b, C22421c<C12669b>> m70382i() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_5");
        }

        /* JADX INFO: renamed from: j */
        public v3f.C20736d<BLiveVideoChatLive, C22421c<BLiveVideoChatLive>> m70383j() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_11");
        }

        /* JADX INFO: renamed from: k */
        public v3f.C20736d<Boolean, C22421c<Boolean>> m70384k() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("1_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$f */
    public class C12665f {
        public C12665f() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<aae0, C22421c<aae0>> m70385a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h(Constants.TEST_IDENTIFIER);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$g */
    public class C12666g {
        public C12666g() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<hne0, C22421c<hne0>> m70386a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("5_0");
        }

        /* JADX INFO: renamed from: b */
        public v3f.C20736d<woe0, C22421c<woe0>> m70387b() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("5_1");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus$h */
    public class C12667h {
        public C12667h() {
        }

        /* JADX INFO: renamed from: a */
        public v3f.C20736d<String, C22421c<String>> m70388a() {
            return LiveVChatEventBus.this.mEventBusImpl.m199258h("3_1");
        }
    }

    public LiveVChatEventBus() {
        v3f v3fVar = new v3f();
        this.mEventBusImpl = v3fVar;
        v3fVar.m199260j(new c7s());
        this.SchemeHandleEvent = new C12665f();
        this.LiveVideoChatEvent = new C12664e();
        this.GiftTraysEventGroup = new C12661b();
        this.TraysViewEventGroup = new C12667h();
        this.GiftDialogEventGroup = new C12660a();
        this.SendGiftEventGroup = new C12666g();
        this.LiveVChatBridgeImplEvent = new C12662c();
        this.LiveVChatOpenH5Event = new C12663d();
    }
}
