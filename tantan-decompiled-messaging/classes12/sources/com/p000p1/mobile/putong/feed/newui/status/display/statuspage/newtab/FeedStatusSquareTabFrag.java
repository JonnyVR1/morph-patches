package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.KanKanStatus;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.UnlockConversationType;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Configs;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.StateGuide;
import com.p000p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p007l.an00;
import p007l.cxh;
import p007l.f3c0;
import p007l.fm20;
import p007l.hf00;
import p007l.ijb0;
import p007l.kjb0;
import p007l.kyg;
import p007l.l80;
import p007l.m84;
import p007l.n0i;
import p007l.nkg;
import p007l.p6j0;
import p007l.s1i;
import p007l.sti;
import p007l.t4i;
import p007l.vch;
import p007l.vqg;
import p007l.wch;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: Q0 */
    public static int f4290Q0;

    /* JADX INFO: renamed from: A */
    public VRelative f4291A;

    /* JADX INFO: renamed from: B */
    public VImage f4292B;

    /* JADX INFO: renamed from: C */
    public VImage f4293C;

    /* JADX INFO: renamed from: D */
    public VImage f4294D;

    /* JADX INFO: renamed from: E */
    public VLinear f4295E;

    /* JADX INFO: renamed from: E0 */
    public an00 f4296E0;

    /* JADX INFO: renamed from: F */
    public FeedStateSquareRecycle f4297F;

    /* JADX INFO: renamed from: F0 */
    public hf00 f4298F0;

    /* JADX INFO: renamed from: G */
    public VLinear f4299G;

    /* JADX INFO: renamed from: H */
    public Space f4301H;

    /* JADX INFO: renamed from: H0 */
    public boolean f4302H0;

    /* JADX INFO: renamed from: I */
    public VLinear f4303I;

    /* JADX INFO: renamed from: I0 */
    public boolean f4304I0;

    /* JADX INFO: renamed from: J */
    public RecyclerView f4305J;

    /* JADX INFO: renamed from: K0 */
    public BubbleInfo f4308K0;

    /* JADX INFO: renamed from: M */
    public String f4311M;

    /* JADX INFO: renamed from: N */
    public l80<n0i> f4313N;

    /* JADX INFO: renamed from: O */
    public C2187a f4315O;

    /* JADX INFO: renamed from: P */
    public FeedCustomSGLayoutManager f4317P;

    /* JADX INFO: renamed from: Q */
    public DiscoveryPager f4319Q;

    /* JADX INFO: renamed from: R */
    public boolean f4320R;

    /* JADX INFO: renamed from: S */
    public boolean f4321S;

    /* JADX INFO: renamed from: T */
    public boolean f4322T;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f4331z;

    /* JADX INFO: renamed from: K */
    public final long f4307K = 86400000;

    /* JADX INFO: renamed from: L */
    public List<n0i> f4309L = new ArrayList();

    /* JADX INFO: renamed from: U */
    public int f4323U = t100.d(16.0f);

    /* JADX INFO: renamed from: V */
    public final int f4324V = 1;

    /* JADX INFO: renamed from: W */
    public final int f4325W = 2;

    /* JADX INFO: renamed from: X */
    public final int f4326X = 3;

    /* JADX INFO: renamed from: Y */
    public final int f4327Y = 4;

    /* JADX INFO: renamed from: Z */
    public final int f4328Z = 5;

    /* JADX INFO: renamed from: k0 */
    public final int f4329k0 = 6;

    /* JADX INFO: renamed from: p0 */
    public final int f4330p0 = 7;

    /* JADX INFO: renamed from: G0 */
    public List<RawFeed> f4300G0 = new ArrayList();

    /* JADX INFO: renamed from: J0 */
    public RecyclerView.t f4306J0 = new C2184d();

    /* JADX INFO: renamed from: L0 */
    public List<n0i> f4310L0 = new ArrayList();

    /* JADX INFO: renamed from: M0 */
    public int f4312M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public boolean f4314N0 = false;

    /* JADX INFO: renamed from: O0 */
    public vch f4316O0 = new wch();

    /* JADX INFO: renamed from: P0 */
    public e30<Intent> f4318P0 = xck0.a(400, new e30() { // from class: l.m4i
        public final void call(Object obj) {
            this.f10221a.m6818g6((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a */
    public class C2181a extends l80<n0i> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C2181a.this.m11597o();
                }
            }
        }

        public C2181a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            if (NullChecker.a(FeedStatusSquareTabFrag.this.f4319Q)) {
                return;
            }
            FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
            feedStatusSquareTabFrag.f4319Q = (DiscoveryPager) feedStatusSquareTabFrag.m6793F5(DiscoveryPager.class, viewGroup);
            if (FeedStatusSquareTabFrag.this.f4319Q == null) {
                return;
            }
            FeedStatusSquareTabFrag.this.f4319Q.setScrollble(false);
            FeedStatusSquareTabFrag.this.f4319Q.d(new a());
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(n0i n0iVar, int i) {
            int i2 = n0iVar.f10613a;
            if (i2 == 3) {
                zvf0.A("e_state_explore_fake_user", "p_state_explore", new j760[]{j760.a("receiver_user_id", n0iVar.f10614b.f191id)});
            } else {
                zvf0.A("e_state", "p_state_explore", new j760[]{j760.a("state_id", i2 == 1 ? n0iVar.f10614b.f191id : ""), j760.a("e_state_type", n0iVar.f10613a == 1 ? Channel.state : "audio_room"), j760.a("user_id", n0iVar.f10613a == 1 ? n0iVar.f10614b.owner.f264id : ""), j760.a("owner_id", n0iVar.f10613a == 1 ? n0iVar.f10614b.owner.f264id : "")});
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo4978m(n0i n0iVar, int i, long j, View view) {
            if (NullChecker.a(view) && nkg.m12266t0() && FeedModule.f316d.m16474I7() == null && !view.getLayoutParams().f()) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag.m6789A5(feedStatusSquareTabFrag.m6799M5())) {
                    FeedStatusSquareTabFrag.this.m6832v6();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$b */
    public class C2182b implements C2187a.a {
        public C2182b() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C2187a.a
        /* JADX INFO: renamed from: b */
        public void mo6839b() {
            FeedStatusSquareTabFrag.this.m6826p6();
        }

        @Override // com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C2187a.a
        /* JADX INFO: renamed from: c */
        public void mo6840c() {
            if (NullChecker.a(FeedStatusSquareTabFrag.this.f4297F)) {
                FeedStatusSquareTabFrag.this.f4297F.m6744K();
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C2187a.a
        /* JADX INFO: renamed from: d */
        public void mo6841d(View view, n0i n0iVar) {
            int i = n0iVar.f10613a;
            if (i == 1 || i == 3) {
                FeedStatusSquareTabFrag.this.m6791D5(n0iVar, false);
                return;
            }
            VoiceLiveStates voiceLiveStates = n0iVar.f10615c;
            if (voiceLiveStates == null) {
                return;
            }
            zvf0.u("e_live_audio_room_enter", "p_state_explore", new j760[]{j760.a("anchorId", voiceLiveStates.userId), j760.a("liveId", voiceLiveStates.f713id), j760.a("audio_card_type", "state_explore_bubble"), j760.a("topic_id", voiceLiveStates.topicId), j760.a("audio_room_label", ""), j760.a("voice_template", "")});
            zvf0.u("e_state", "p_state_explore", new j760[]{j760.a("e_state_type", "audio_room"), j760.a("refer_source", FeedStatusSquareTabFrag.this.getArguments().getString("from")), j760.a("state_id", ""), j760.a("owner_id", voiceLiveStates.userId)});
            FeedModule.m1141M().M6().e(FeedStatusSquareTabFrag.this.act(), voiceLiveStates.f713id, "p_state_explore", "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$c */
    public class C2183c extends an00 {
        public C2183c() {
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: a */
        public void mo6842a(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f4300G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f4298F0.m10607h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p007l.an00
        /* JADX INFO: renamed from: c */
        public void mo6843c(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f4300G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f4298F0.m10608i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$d */
    public class C2184d extends RecyclerView.t {
        public C2184d() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            FeedStatusSquareTabFrag.this.f4317P.t(new int[FeedStatusSquareTabFrag.this.f4317P.G()]);
            int[] iArr = new int[FeedStatusSquareTabFrag.this.f4317P.G()];
            FeedStatusSquareTabFrag.this.f4317P.u(iArr);
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                feedStatusSquareTabFrag.f4304I0 = feedStatusSquareTabFrag.m6802P5(iArr);
            }
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag2 = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag2.f4302H0 || feedStatusSquareTabFrag2.f4304I0 || !NullChecker.a(feedStatusSquareTabFrag2.f4297F)) {
                    return;
                }
                FeedStatusSquareTabFrag.this.f4297F.m6743J();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FeedStatusSquareTabFrag.this.f4302H0 = i <= 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$e */
    public class C2185e extends RecyclerView.n {
        public C2185e() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.c) {
                if (view.getLayoutParams().h()) {
                    rect.top = 0;
                    rect.left = 0;
                    rect.right = 0;
                } else {
                    rect.top = FeedStatusSquareTabFrag.this.f4323U - t100.d(7.0f);
                    rect.left = FeedStatusSquareTabFrag.this.f4323U;
                    rect.right = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$f */
    public class C2186f {

        /* JADX INFO: renamed from: a */
        public int f4338a;

        /* JADX INFO: renamed from: b */
        public String f4339b;

        /* JADX INFO: renamed from: c */
        public String f4340c;

        /* JADX INFO: renamed from: d */
        public int f4341d;

        public C2186f() {
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4338a), this.f4339b, this.f4340c);
        }
    }

    /* JADX INFO: renamed from: C5 */
    private boolean m6745C5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.o()) > 0.0d;
    }

    /* JADX INFO: renamed from: K5 */
    private void m6746K5(final boolean z) {
        this.f4308K0 = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(FeedModule.f316d.m16586Y7(this.f4311M, this.f4296E0)).subscribe(mkd0.H(new e30() { // from class: l.r3i
            public final void call(Object obj) {
                this.f12471a.m6807U5(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.s3i
            public final void call(Object obj) {
                FeedStatusSquareTabFrag.m6765b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y5 */
    public /* synthetic */ void m6760Y5(Boolean bool) {
        if (this.f4320R) {
            this.f4321S = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z5 */
    public /* synthetic */ void m6762Z5(c cVar) {
        if (cVar == c.h) {
            ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("source", getArguments().getString("from"))});
            ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("refer_source", getArguments().getString("from"))});
        }
        if (cVar == c.i) {
            if (FeedModule.m1140H().k4() && FeedModule.m1140H().yd("onlineSquarePassive") && !this.f4322T) {
                FeedModule.m1140H().z8(act(), "onlineSquarePassive");
                this.f4322T = true;
            } else {
                if (m6790B5() && FeedModule.f316d.m16474I7() == null) {
                    m6832v6();
                }
                if (this.f4321S && FeedModule.f316d.m16474I7() == null && !mqi0.D(((Long) FeedModule.m1140H().ja().get()).longValue())) {
                    m6832v6();
                }
            }
            this.f4321S = false;
            this.f4320R = false;
            m6831u6();
            if (NullChecker.a(this.f4297F)) {
                this.f4297F.m6743J();
            }
        }
        if (cVar == c.j) {
            m6792E5();
            if (NullChecker.a(this.f4297F)) {
                this.f4297F.m6744K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a6 */
    public /* synthetic */ void m6764a6(j760 j760Var) {
        boolean zBooleanValue = ((Boolean) j760Var.a).booleanValue();
        FeedStateSquareRecycle feedStateSquareRecycle = this.f4297F;
        if (zBooleanValue) {
            if (NullChecker.a(feedStateSquareRecycle)) {
                this.f4297F.m6743J();
            }
        } else if (NullChecker.a(feedStateSquareRecycle)) {
            this.f4297F.m6744K();
        }
        if (((Boolean) j760Var.b).booleanValue() && NullChecker.a(this.f4319Q)) {
            boolean zBooleanValue2 = ((Boolean) j760Var.a).booleanValue();
            DiscoveryPager discoveryPager = this.f4319Q;
            if (zBooleanValue2) {
                discoveryPager.setScrollble(TextUtils.isEmpty(this.f4311M));
            } else {
                discoveryPager.setScrollble(true);
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m6765b5(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public /* synthetic */ void m6776l6(View view) {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6743J();
        }
        zvf0.r("e_meet_state_pop_cancel", "p_meet_state_pop");
    }

    /* JADX INFO: renamed from: y5 */
    public static FeedStatusSquareTabFrag m6788y5(BubbleInfo bubbleInfo, String str) {
        FeedStatusSquareTabFrag feedStatusSquareTabFrag = new FeedStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putString("from", str);
        feedStatusSquareTabFrag.setArguments(bundle);
        return feedStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m6789A5(int i) {
        int i2 = f4290Q0 + 1;
        f4290Q0 = i2;
        return i2 > i && !mqi0.D(((Long) FeedModule.m1140H().ja().get()).longValue());
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m6790B5() {
        if (mqi0.D(((Long) FeedModule.m1140H().ja().get()).longValue())) {
            return false;
        }
        return nkg.m12268u0();
    }

    /* JADX INFO: renamed from: D5 */
    public final void m6791D5(n0i n0iVar, boolean z) {
        BubbleInfo bubbleInfo = n0iVar.f10614b;
        if (bubbleInfo == null || FeedModule.m1139F().userId().equals(bubbleInfo.owner.f264id)) {
            return;
        }
        List<j760<String, String>> listM6800N5 = m6800N5(bubbleInfo, z);
        if (n0iVar.f10613a == 1) {
            p6j0.m12913c("e_state", "p_state_explore", (j760[]) listM6800N5.toArray(new j760[0]));
        } else {
            zvf0.u("e_state_explore_fake_user", "p_state_explore", new j760[]{j760.a("receiver_user_id", n0iVar.f10614b.f191id)});
        }
        if (n0iVar.f10613a == 1 && !m6745C5(bubbleInfo)) {
            lsi0.j("状态已结束");
        } else {
            this.f4320R = true;
            FeedModule.m1140H().aa(act(), bubbleInfo.owner.f264id, n0iVar.f10613a == 3 ? null : bubbleInfo.f191id, "p_state_explore", "p_quickchat,state", false, n0iVar.f10616d, Channel.state);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m6792E5() {
        ((PutongFrag) this).pageHelper.q(pageId());
        ((PutongFrag) this).pageHelper.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final <T extends View> T m6793F5(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        T t = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    t = (T) childAt;
                } else if (childAt instanceof ViewGroup) {
                    t = (T) m6793F5(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: G5 */
    public final List<C2186f> m6794G5() {
        ArrayList arrayList = new ArrayList();
        C2186f c2186f = new C2186f();
        c2186f.f4338a = f3c0.f7801f5;
        c2186f.f4339b = "在线闪聊";
        c2186f.f4340c = "蒙面文字闪聊";
        c2186f.f4341d = 1;
        C2186f c2186f2 = new C2186f();
        c2186f2.f4338a = f3c0.f7833j5;
        c2186f2.f4339b = "语音闪聊";
        c2186f2.f4340c = "对方递来耳机";
        c2186f2.f4341d = 2;
        C2186f c2186f3 = new C2186f();
        c2186f3.f4338a = f3c0.f7793e5;
        c2186f3.f4339b = "心动信号";
        c2186f3.f4340c = "附近颜值在线";
        c2186f3.f4341d = 3;
        C2186f c2186f4 = new C2186f();
        c2186f4.f4338a = f3c0.f7817h5;
        c2186f4.f4339b = "聊天室";
        c2186f4.f4340c = "匹配在线聊天";
        c2186f4.f4341d = 4;
        C2186f c2186f5 = new C2186f();
        c2186f5.f4338a = f3c0.f7809g5;
        c2186f5.f4339b = "拆盲盒";
        c2186f5.f4340c = "2s遇见心动";
        c2186f5.f4341d = 5;
        C2186f c2186f6 = new C2186f();
        c2186f6.f4338a = f3c0.f7785d5;
        c2186f6.f4339b = "聊聊信号";
        c2186f6.f4340c = "找个聊天搭子";
        c2186f6.f4341d = 6;
        arrayList.add(c2186f);
        arrayList.add(c2186f2);
        if (FeedModule.m1141M().Rh()) {
            C2186f c2186f7 = new C2186f();
            c2186f7.f4338a = f3c0.f7825i5;
            c2186f7.f4339b = "视频闪聊";
            c2186f7.f4340c = "面对面聊聊天";
            c2186f7.f4341d = 7;
            arrayList.add(c2186f7);
        }
        arrayList.add(c2186f3);
        arrayList.add(c2186f4);
        arrayList.add(c2186f5);
        arrayList.add(c2186f6);
        return arrayList;
    }

    /* JADX INFO: renamed from: H5 */
    public String m6795H5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!vqg.m15543u().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: I5 */
    public final void m6796I5(final boolean z, final List<BubbleInfo> list, final List<BubbleInfo> list2, final List<VoiceLiveStates> list3, final BubbleInfo bubbleInfo, final e30<List<n0i>> e30Var) {
        e51.y(new Runnable() { // from class: l.b4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f5918a.m6806T5(bubbleInfo, list2, z, e30Var, list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final RecyclerView.n m6797J5() {
        return new C2185e();
    }

    /* JADX INFO: renamed from: L5 */
    public final String m6798L5(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f191id) || !NullChecker.a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM10602c = hf00Var.m10602c(bubbleInfo.f191id);
        if (!NullChecker.a(rawFeedM10602c) || TextUtils.isEmpty(rawFeedM10602c.recommendReason)) {
            return null;
        }
        return rawFeedM10602c.recommendReason;
    }

    /* JADX INFO: renamed from: M5 */
    public int m6799M5() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = (String) sti.f13082h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    /* JADX INFO: renamed from: N5 */
    public final List<j760<String, String>> m6800N5(BubbleInfo bubbleInfo, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("state_id", bubbleInfo.f191id));
        arrayList.add(j760.a("e_state_type", Channel.state));
        arrayList.add(j760.a("user_id", bubbleInfo.owner.f264id));
        arrayList.add(j760.a("owner_id", bubbleInfo.owner.f264id));
        if (z) {
            arrayList.add(j760.a("autosayhi", "1"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m6801O5() {
        if (vwb.J(this.f4310L0) || this.f4312M0 >= this.f4310L0.size() || !fm20.m10221a()) {
            return;
        }
        final n0i n0iVar = this.f4310L0.get(this.f4312M0);
        if (n0iVar.f10614b == null) {
            return;
        }
        FeedModule.m1140H().ur(act(), n0iVar.f10614b.owner.f264id, new e30() { // from class: l.k4i
            public final void call(Object obj) {
                this.f9602a.m6811b6(n0iVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P5 */
    public boolean m6802P5(int[] iArr) {
        if (this.f4315O.m6853K().size() <= 1 || iArr.length < 3) {
            return false;
        }
        int itemCount = this.f4317P.getItemCount() - 1;
        return (iArr.length > 3 && iArr[3] == itemCount) || iArr[0] == itemCount || iArr[1] == itemCount || iArr[2] == itemCount;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ Boolean m6803Q5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f191id, this.f4300G0.get(i).f704id));
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m6804R5(int i, VoiceLiveStates voiceLiveStates) {
        return Boolean.valueOf(TextUtils.equals(voiceLiveStates.f713id, this.f4300G0.get(i).f704id));
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m6805S5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f191id, this.f4300G0.get(i).f704id));
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m6806T5(BubbleInfo bubbleInfo, List list, boolean z, final e30 e30Var, List list2, List list3) {
        if (NullChecker.a(bubbleInfo)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) list.get(i);
                if (TextUtils.equals(bubbleInfo2.f191id, bubbleInfo.f191id)) {
                    list.remove(bubbleInfo2);
                    break;
                }
            }
        }
        final ArrayList arrayListF0 = vwb.f0(new n0i[0]);
        if (vwb.J(this.f4300G0)) {
            if (!z && NullChecker.a(bubbleInfo)) {
                n0i n0iVar = new n0i();
                n0iVar.f10613a = 1;
                bubbleInfo.value = m6795H5(bubbleInfo);
                n0iVar.f10614b = bubbleInfo;
                arrayListF0.add(n0iVar);
            }
            e51.M(new Runnable() { // from class: l.e4i
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayListF0);
                }
            });
            return;
        }
        for (final int i2 = 0; i2 < this.f4300G0.size(); i2++) {
            if (TextUtils.equals(this.f4300G0.get(i2).type, Channel.state)) {
                BubbleInfo bubbleInfo3 = (BubbleInfo) vwb.r(list, new w9j() { // from class: l.f4i
                    public final Object call(Object obj) {
                        return this.f7977a.m6803Q5(i2, (BubbleInfo) obj);
                    }
                });
                if ((!NullChecker.a(bubbleInfo) || !NullChecker.a(bubbleInfo3) || !TextUtils.equals(bubbleInfo.f191id, bubbleInfo3.f191id)) && NullChecker.a(bubbleInfo3)) {
                    bubbleInfo3.value = m6795H5(bubbleInfo3);
                    n0i n0iVar2 = new n0i();
                    n0iVar2.f10613a = 1;
                    n0iVar2.f10616d = this.f4300G0.get(i2).recommendReason;
                    n0iVar2.f10617e = this.f4300G0.get(i2).locationName;
                    n0iVar2.f10614b = bubbleInfo3;
                    arrayListF0.add(n0iVar2);
                }
            } else if (TextUtils.equals(this.f4300G0.get(i2).type, "voiceLiveState")) {
                VoiceLiveStates voiceLiveStates = (VoiceLiveStates) vwb.r(list2, new w9j() { // from class: l.g4i
                    public final Object call(Object obj) {
                        return this.f8350a.m6804R5(i2, (VoiceLiveStates) obj);
                    }
                });
                if (NullChecker.a(voiceLiveStates)) {
                    n0i n0iVar3 = new n0i();
                    n0iVar3.f10613a = 2;
                    n0iVar3.f10616d = this.f4300G0.get(i2).recommendReason;
                    n0iVar3.f10617e = this.f4300G0.get(i2).locationName;
                    n0iVar3.f10615c = voiceLiveStates;
                    arrayListF0.add(n0iVar3);
                }
            } else if (TextUtils.equals(this.f4300G0.get(i2).type, "fakeUserState")) {
                BubbleInfo bubbleInfo4 = (BubbleInfo) vwb.r(list3, new w9j() { // from class: l.h4i
                    public final Object call(Object obj) {
                        return this.f8576a.m6805S5(i2, (BubbleInfo) obj);
                    }
                });
                if (nkg.m12272w0() && NullChecker.a(bubbleInfo4)) {
                    Owner ownerNew_ = Owner.new_();
                    ownerNew_.f264id = bubbleInfo4.f191id;
                    bubbleInfo4.owner = ownerNew_;
                    n0i n0iVar4 = new n0i();
                    n0iVar4.f10613a = 3;
                    n0iVar4.f10614b = bubbleInfo4;
                    arrayListF0.add(n0iVar4);
                }
            }
        }
        if (!z && NullChecker.a(bubbleInfo)) {
            n0i n0iVar5 = new n0i();
            n0iVar5.f10613a = 1;
            bubbleInfo.value = m6795H5(bubbleInfo);
            n0iVar5.f10614b = bubbleInfo;
            arrayListF0.add(0, n0iVar5);
        }
        e51.M(new Runnable() { // from class: l.i4i
            @Override // java.lang.Runnable
            public final void run() {
                e30Var.call(arrayListF0);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m6807U5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f4311M = envelope.pagination.links.next;
        m6796I5(z, list2, list, list3, this.f4308K0, new e30() { // from class: l.x3i
            public final void call(Object obj) {
                this.f14756a.m6810X5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m6808V5(List list) {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6743J();
        }
        if (!vwb.J(list) && nkg.m12264s0() && fm20.m10221a()) {
            this.f4310L0.clear();
            this.f4310L0 = list;
            m6801O5();
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m6809W5(final List list) {
        e51.H(act(), new Runnable() { // from class: l.j4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9223a.m6808V5(list);
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m6810X5(final List list) {
        int size = list.size();
        VRecyclerView vRecyclerView = this.f4297F;
        if (size <= 0) {
            xdl0.M(vRecyclerView, false);
            xdl0.M(this.f4299G, true);
            xdl0.M(this.f4291A, false);
            return;
        }
        if (NullChecker.a(vRecyclerView)) {
            this.f4297F.m6744K();
        }
        this.f4302H0 = false;
        this.f4304I0 = false;
        this.f4315O.m6860R(list, true, new d30() { // from class: l.d4i
            public final void call() {
                this.f6810a.m6809W5(list);
            }
        });
        xdl0.M(this.f4291A, true);
        xdl0.M(this.f4297F, true);
        xdl0.M(this.f4299G, false);
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ void m6811b6(n0i n0iVar, Boolean bool) {
        if (bool.booleanValue()) {
            m6791D5(n0iVar, true);
            fm20.m10220J();
        } else {
            this.f4312M0++;
            m6801O5();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ void m6812c6(List list) {
        this.f4315O.m6860R(list, false, null);
        this.f4314N0 = false;
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m6813d6(Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f4311M = envelope.pagination.links.next;
        m6796I5(true, list2, list, list3, this.f4308K0, new e30() { // from class: l.c4i
            public final void call(Object obj) {
                this.f6530a.m6812c6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ void m6814e6(Throwable th) {
        this.f4314N0 = false;
    }

    /* JADX INFO: renamed from: f4 */
    public void m6815f4() {
        super.f4();
        duringCreated(FeedModule.m1140H().ef()).subscribe(mkd0.G(new e30() { // from class: l.p3i
            public final void call(Object obj) {
                this.f11682a.m6760Y5((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.a4i
            public final void call(Object obj) {
                this.f5577a.m6762Z5((c) obj);
            }
        }));
        duringCreated(FeedStatusPageAct.f4210B).subscribe(mkd0.G(new e30() { // from class: l.l4i
            public final void call(Object obj) {
                this.f9878a.m6764a6((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m6816f6(Integer num) {
        switch (num.intValue()) {
            case 1:
                zvf0.r("e_quickchat_button", "p_state_explore");
                FeedModule.m1140H().Sa(act(), UnlockConversationType.quick_chat, "p_state_explore");
                break;
            case 2:
                zvf0.r("e_voicechat_button", "p_state_explore");
                FeedModule.m1140H().Sa(act(), "voice_quick_chat", "p_state_explore");
                break;
            case 3:
                zvf0.u("e_searchfunchat", "p_state_explore", new j760[]{j760.a("funchat_remainingtimes", "" + FeedModule.m1140H().b3())});
                FeedModule.m1140H().Sa(act(), "heart_beat_chat", "p_state_explore");
                break;
            case 4:
                zvf0.r("e_voice_chat", "p_state_explore");
                cxh.m9252b(act(), Uri.parse("tantanapp://jumpVoiceSquare?tabId=0"));
                break;
            case 5:
                zvf0.r("e_meet_greet", "p_state_explore");
                FeedStatusPageAct activity = getActivity();
                if (NullChecker.a(activity)) {
                    if (NullChecker.a(this.f4297F)) {
                        this.f4297F.m6744K();
                    }
                    activity.m6699I2();
                }
                break;
            case 6:
                zvf0.r("e_chatting_partner_signal", "p_state_explore");
                FeedModule.m1140H().kk(act());
                break;
            case 7:
                zvf0.r("e_live_video_quickchat_button", "p_state_explore");
                FeedModule.m1141M().nf(act(), "source_second_floor_square");
                break;
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m6817g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f4298F0 = new hf00(12);
        this.f4296E0 = new C2183c();
        this.f4295E.post(new Runnable() { // from class: l.q3i
            @Override // java.lang.Runnable
            public final void run() {
                this.f12068a.m6827q6();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m6818g6(Intent intent) {
        act().startActivityForResult(intent, 786);
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m6819h6(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        this.f4316O0.mo15419a(act(), "p_meet_greet", null, this.f4318P0);
        zvf0.r("e_set_dynamic", "p_meet_dynamic_pop");
        m84.m11844e().m11853j();
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ void m6820i6(View view) {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6743J();
        }
        zvf0.r("e_meet_dynamic_pop_cancel", "p_meet_dynamic_pop");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (ViewGroup) m6834x5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ void m6821j6() {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6744K();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ void m6822k6(View view) {
        zvf0.u("e_set_my_state", "p_meet_state_pop", new j760[]{j760.a("source_page", "p_meet_state_pop")});
        if (NullChecker.a(FeedModule.f317e.f8795H) && NullChecker.a(FeedModule.f317e.f8795H.e()) && TEnum.equals(((KanPostData) FeedModule.f317e.f8795H.e()).status, KanKanStatus.start)) {
            osi0.g("状态发布中...");
        } else {
            s1i.m13982f(act(), "p_meet_greet");
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ void m6823m6() {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6744K();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ void m6824n6(String str) {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6744K();
        }
        FeedModule.m1140H().ja().put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ void m6825o6(String str) {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6743J();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m6826p6() {
        this.f4314N0 = true;
        if (!TextUtils.isEmpty(this.f4311M)) {
            duringCreated(FeedModule.f316d.m16586Y7(this.f4311M, this.f4296E0)).subscribe(mkd0.H(new e30() { // from class: l.y3i
                public final void call(Object obj) {
                    this.f15230a.m6813d6((Envelope) obj);
                }
            }, new e30() { // from class: l.z3i
                public final void call(Object obj) {
                    this.f15575a.m6814e6((Throwable) obj);
                }
            }));
        } else {
            this.f4315O.m6855M();
            this.f4314N0 = false;
        }
    }

    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q6 */
    public void m6827q6() {
        int measuredHeight = this.f4295E.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4297F.getLayoutParams();
        int i = 4;
        int iD = (t100.d(131.0f) * 4) + (t100.d(16.0f) * 3) + t100.d(24.0f) + t100.d(24.0f);
        int i2 = 2;
        if (measuredHeight > iD) {
            layoutParams.height = iD;
        } else {
            layoutParams.height = ((t100.d(131.0f) * 3) + (this.f4323U * 2)) - t100.d(0.0f);
            i = 3;
        }
        if (measuredHeight < layoutParams.height) {
            if (layoutParams.height - measuredHeight < ((ViewGroup.MarginLayoutParams) this.f4303I.getLayoutParams()).bottomMargin + t100.d(5.0f)) {
                xdl0.U(this.f4303I, 0);
                this.f4323U = t100.d(6.0f);
                layoutParams.height = ((t100.d(131.0f) * 3) + (this.f4323U * 2)) - t100.d(0.0f);
                i2 = i;
            } else {
                layoutParams.height = (t100.d(131.0f) * 2) + (this.f4323U * 3);
            }
        } else {
            i2 = i;
        }
        this.f4297F.setLayoutParams(layoutParams);
        this.f4313N = new C2181a();
        this.f4317P = new FeedCustomSGLayoutManager(i2, 0);
        this.f4317P.m6723f0(RemoteConfig.x().w("state_square_bubble_speed") * 0.2d);
        this.f4297F.setLayoutManager(this.f4317P);
        this.f4297F.setflingScale(3.0d);
        this.f4317P.U(0);
        this.f4297F.addItemDecoration(m6797J5());
        C2187a c2187a = new C2187a(this, getContext(), this.f4309L, this.f4313N, new C2182b());
        this.f4315O = c2187a;
        this.f4297F.setAdapter(c2187a);
        this.f4297F.addOnScrollListener(this.f4306J0);
        List<C2186f> listM6794G5 = m6794G5();
        new ArrayList();
        try {
            String strF = RemoteConfig.x().F("feed_state_square_bottom_view");
            if (!TextUtils.isEmpty(strF)) {
                List<FeedStateSquareBottomViewParams> list = JsonParseHelper.parseList(strF, FeedStateSquareBottomViewParams.JSON_ADAPTER);
                User userMe_ = FeedModule.m1140H().me_();
                if (userMe_ == null || userMe_.isFemale()) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (list.get(i3).viewType == 3) {
                            list.remove(i3);
                            break;
                        }
                    }
                }
                List<C2186f> listM6828r6 = m6828r6(list, listM6794G5);
                this.f4305J.setLayoutManager(new LinearLayoutManager(act(), 0, false));
                C2188b c2188b = new C2188b(act(), listM6828r6, new e30() { // from class: l.t3i
                    public final void call(Object obj) {
                        this.f13177a.m6816f6((Integer) obj);
                    }
                });
                this.f4305J.setAdapter(c2188b);
                c2188b.notifyDataSetChanged();
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m6746K5(false);
    }

    /* JADX INFO: renamed from: r6 */
    public final List<C2186f> m6828r6(List<FeedStateSquareBottomViewParams> list, List<C2186f> list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            final FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = list.get(i);
            C2186f c2186f = (C2186f) vwb.r(list2, new w9j() { // from class: l.v3i
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(feedStateSquareBottomViewParams.name, ((FeedStatusSquareTabFrag.C2186f) obj).f4339b));
                }
            });
            if (NullChecker.a(c2186f)) {
                arrayList.add(c2186f);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s6 */
    public void m6829s6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            osi0.g("暂时没有遇到有趣的灵魂");
            return;
        }
        if (!TextUtils.equals(str, "moment")) {
            if (!TextUtils.equals(str, Channel.state)) {
                osi0.g("暂时没有遇到有趣的灵魂");
                return;
            } else {
                BubbleInfo bubbleInfoM16769y7 = FeedModule.f316d.m16769y7(str3);
                FeedModule.m1140H().aa(act(), bubbleInfoM16769y7.owner.f264id, bubbleInfoM16769y7.f191id, "p_meet_greet", "p_quickchat,chance", false, m6798L5(bubbleInfoM16769y7, this.f4298F0), Channel.state);
                return;
            }
        }
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str2);
        if (TextUtils.isEmpty(str3)) {
            osi0.g("暂时没有遇到有趣的灵魂");
            return;
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(str3);
        if (userM16628e8 == null) {
            osi0.g("暂时没有遇到有趣的灵魂");
        } else {
            FeedModule.f315c.m1650f3(act(), userM16628e8, momentM16753w7, "p_meet_greet", false);
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m6830t6(int i) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (i == 40351) {
            new xh0.a(act()).j("今日偶遇次数已用尽，每日首次发布动态可获得 1 次新偶遇机会").r("发动态").h(false).o(new View.OnClickListener() { // from class: l.n4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10661a.m6819h6(view);
                }
            }).f("取消").c(new View.OnClickListener() { // from class: l.o4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11003a.m6820i6(view);
                }
            }).a().g();
            e51.I(this, new Runnable() { // from class: l.p4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11695a.m6821j6();
                }
            }, 100L);
            i0e.f(i0e.c("p_meet_dynamic_pop", Dialog.class.getName()));
        }
        if (i == 40352) {
            new xh0.a(act()).j("今日偶遇次数已用尽，分享心情状态可获得 1 次新偶遇机会").r("发状态").h(false).o(new View.OnClickListener() { // from class: l.q4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12082a.m6822k6(view);
                }
            }).f("取消").c(new View.OnClickListener() { // from class: l.r4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12480a.m6776l6(view);
                }
            }).a().g();
            e51.I(this, new Runnable() { // from class: l.s4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12794a.m6823m6();
                }
            }, 100L);
            i0e.f(i0e.c("p_meet_state_pop", Dialog.class.getName()));
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m6831u6() {
        ((PutongFrag) this).pageHelper.q(pageId());
        ((PutongFrag) this).pageHelper.l();
    }

    /* JADX INFO: renamed from: v6 */
    public final void m6832v6() {
        if (act() == null || this.f4322T) {
            return;
        }
        m6833w6(act(), new e30() { // from class: l.u3i
            public final void call(Object obj) {
                this.f13522a.m6824n6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public void m6833w6(Act act, e30<String> e30Var) {
        StateGuide stateGuide;
        String str = (String) sti.f13082h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0 || FeedModule.m1140H().Gn()) {
            return;
        }
        this.f4322T = true;
        kyg.m11539h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, e30Var, new e30() { // from class: l.w3i
            public final void call(Object obj) {
                this.f14386a.m6825o6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public View m6834x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4i.m14435b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x6 */
    public void m6835x6() {
        if (NullChecker.a(this.f4297F)) {
            this.f4297F.m6743J();
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m6836z5() {
        this.f4308K0 = null;
        this.f4311M = null;
        m6746K5(true);
    }
}
