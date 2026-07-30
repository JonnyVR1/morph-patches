package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Configs;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.StateGuide;
import com.p046p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p149l.an00;
import p149l.cxh;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.fm20;
import p149l.hf00;
import p149l.i0e;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.kyg;
import p149l.l80;
import p149l.lsi0;
import p149l.m84;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n0i;
import p149l.nkg;
import p149l.osi0;
import p149l.p6j0;
import p149l.s1i;
import p149l.sti;
import p149l.t100;
import p149l.t4i;
import p149l.vch;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.wch;
import p149l.xck0;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: Q0 */
    public static int f42829Q0;

    /* JADX INFO: renamed from: A */
    public VRelative f42830A;

    /* JADX INFO: renamed from: B */
    public VImage f42831B;

    /* JADX INFO: renamed from: C */
    public VImage f42832C;

    /* JADX INFO: renamed from: D */
    public VImage f42833D;

    /* JADX INFO: renamed from: E */
    public VLinear f42834E;

    /* JADX INFO: renamed from: E0 */
    public an00 f42835E0;

    /* JADX INFO: renamed from: F */
    public FeedStateSquareRecycle f42836F;

    /* JADX INFO: renamed from: F0 */
    public hf00 f42837F0;

    /* JADX INFO: renamed from: G */
    public VLinear f42838G;

    /* JADX INFO: renamed from: H */
    public Space f42840H;

    /* JADX INFO: renamed from: H0 */
    public boolean f42841H0;

    /* JADX INFO: renamed from: I */
    public VLinear f42842I;

    /* JADX INFO: renamed from: I0 */
    public boolean f42843I0;

    /* JADX INFO: renamed from: J */
    public RecyclerView f42844J;

    /* JADX INFO: renamed from: K0 */
    public BubbleInfo f42847K0;

    /* JADX INFO: renamed from: M */
    public String f42850M;

    /* JADX INFO: renamed from: N */
    public l80<n0i> f42852N;

    /* JADX INFO: renamed from: O */
    public C11343a f42854O;

    /* JADX INFO: renamed from: P */
    public FeedCustomSGLayoutManager f42856P;

    /* JADX INFO: renamed from: Q */
    public DiscoveryPager f42858Q;

    /* JADX INFO: renamed from: R */
    public boolean f42859R;

    /* JADX INFO: renamed from: S */
    public boolean f42860S;

    /* JADX INFO: renamed from: T */
    public boolean f42861T;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f42870z;

    /* JADX INFO: renamed from: K */
    public final long f42846K = 86400000;

    /* JADX INFO: renamed from: L */
    public List<n0i> f42848L = new ArrayList();

    /* JADX INFO: renamed from: U */
    public int f42862U = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: V */
    public final int f42863V = 1;

    /* JADX INFO: renamed from: W */
    public final int f42864W = 2;

    /* JADX INFO: renamed from: X */
    public final int f42865X = 3;

    /* JADX INFO: renamed from: Y */
    public final int f42866Y = 4;

    /* JADX INFO: renamed from: Z */
    public final int f42867Z = 5;

    /* JADX INFO: renamed from: k0 */
    public final int f42868k0 = 6;

    /* JADX INFO: renamed from: p0 */
    public final int f42869p0 = 7;

    /* JADX INFO: renamed from: G0 */
    public List<RawFeed> f42839G0 = new ArrayList();

    /* JADX INFO: renamed from: J0 */
    public RecyclerView.AbstractC0582t f42845J0 = new C11340d();

    /* JADX INFO: renamed from: L0 */
    public List<n0i> f42849L0 = new ArrayList();

    /* JADX INFO: renamed from: M0 */
    public int f42851M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public boolean f42853N0 = false;

    /* JADX INFO: renamed from: O0 */
    public vch f42855O0 = new wch();

    /* JADX INFO: renamed from: P0 */
    public e30<Intent> f42857P0 = xck0.m208120a(400, new e30() { // from class: l.m4i
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f131298a.m65679g6((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a */
    public class C11337a extends l80<n0i> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11337a.this.m148842o();
                }
            }
        }

        public C11337a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            if (NullChecker.m81303a(FeedStatusSquareTabFrag.this.f42858Q)) {
                return;
            }
            FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
            feedStatusSquareTabFrag.f42858Q = (DiscoveryPager) feedStatusSquareTabFrag.m65656F5(DiscoveryPager.class, viewGroup);
            if (FeedStatusSquareTabFrag.this.f42858Q == null) {
                return;
            }
            FeedStatusSquareTabFrag.this.f42858Q.setScrollble(false);
            FeedStatusSquareTabFrag.this.f42858Q.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(n0i n0iVar, int i) {
            int i2 = n0iVar.f136557a;
            if (i2 == 3) {
                zvf0.m220368A("e_state_explore_fake_user", "p_state_explore", j760.m140076a("receiver_user_id", n0iVar.f136558b.f38730id));
            } else {
                zvf0.m220368A("e_state", "p_state_explore", j760.m140076a("state_id", i2 == 1 ? n0iVar.f136558b.f38730id : ""), j760.m140076a("e_state_type", n0iVar.f136557a == 1 ? "state" : "audio_room"), j760.m140076a("user_id", n0iVar.f136557a == 1 ? n0iVar.f136558b.owner.f38803id : ""), j760.m140076a("owner_id", n0iVar.f136557a == 1 ? n0iVar.f136558b.owner.f38803id : ""));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo55696m(n0i n0iVar, int i, long j, View view) {
            if (NullChecker.m81303a(view) && nkg.m159907t0() && FeedModule.f38855d.m209293I7() == null && !((RecyclerView.C0578p) view.getLayoutParams()).m3412f()) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag.m65652A5(feedStatusSquareTabFrag.m65662M5())) {
                    FeedStatusSquareTabFrag.this.m65693v6();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$b */
    public class C11338b implements C11343a.a {
        public C11338b() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11343a.a
        /* JADX INFO: renamed from: b */
        public void mo65700b() {
            FeedStatusSquareTabFrag.this.m65687p6();
        }

        @Override // com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11343a.a
        /* JADX INFO: renamed from: c */
        public void mo65701c() {
            if (NullChecker.m81303a(FeedStatusSquareTabFrag.this.f42836F)) {
                FeedStatusSquareTabFrag.this.f42836F.m65607K();
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11343a.a
        /* JADX INFO: renamed from: d */
        public void mo65702d(View view, n0i n0iVar) {
            int i = n0iVar.f136557a;
            if (i == 1 || i == 3) {
                FeedStatusSquareTabFrag.this.m65654D5(n0iVar, false);
                return;
            }
            VoiceLiveStates voiceLiveStates = n0iVar.f136559c;
            if (voiceLiveStates == null) {
                return;
            }
            zvf0.m220399u("e_live_audio_room_enter", "p_state_explore", j760.m140076a("anchorId", voiceLiveStates.userId), j760.m140076a("liveId", voiceLiveStates.f39252id), j760.m140076a("audio_card_type", "state_explore_bubble"), j760.m140076a("topic_id", voiceLiveStates.topicId), j760.m140076a("audio_room_label", ""), j760.m140076a("voice_template", ""));
            zvf0.m220399u("e_state", "p_state_explore", j760.m140076a("e_state_type", "audio_room"), j760.m140076a("refer_source", FeedStatusSquareTabFrag.this.getArguments().getString("from")), j760.m140076a("state_id", ""), j760.m140076a("owner_id", voiceLiveStates.userId));
            FeedModule.m60223M().mo67229M6().mo102420e(FeedStatusSquareTabFrag.this.act(), voiceLiveStates.f39252id, "p_state_explore", "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$c */
    public class C11339c extends an00 {
        public C11339c() {
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: a */
        public void mo65703a(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f42839G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f42837F0.m130726h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p149l.an00
        /* JADX INFO: renamed from: c */
        public void mo65704c(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f42839G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f42837F0.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$d */
    public class C11340d extends RecyclerView.AbstractC0582t {
        public C11340d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            FeedStatusSquareTabFrag.this.f42856P.m3541t(new int[FeedStatusSquareTabFrag.this.f42856P.m3500G()]);
            int[] iArr = new int[FeedStatusSquareTabFrag.this.f42856P.m3500G()];
            FeedStatusSquareTabFrag.this.f42856P.m3542u(iArr);
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                feedStatusSquareTabFrag.f42843I0 = feedStatusSquareTabFrag.m65665P5(iArr);
            }
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag2 = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag2.f42841H0 || feedStatusSquareTabFrag2.f42843I0 || !NullChecker.m81303a(feedStatusSquareTabFrag2.f42836F)) {
                    return;
                }
                FeedStatusSquareTabFrag.this.f42836F.m65606J();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FeedStatusSquareTabFrag.this.f42841H0 = i <= 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$e */
    public class C11341e extends RecyclerView.AbstractC0576n {
        public C11341e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.C0593c) {
                if (((StaggeredGridLayoutManager.C0593c) view.getLayoutParams()).m3575h()) {
                    rect.top = 0;
                    rect.left = 0;
                    rect.right = 0;
                } else {
                    rect.top = FeedStatusSquareTabFrag.this.f42862U - t100.m186890d(7.0f);
                    rect.left = FeedStatusSquareTabFrag.this.f42862U;
                    rect.right = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$f */
    public class C11342f {

        /* JADX INFO: renamed from: a */
        public int f42877a;

        /* JADX INFO: renamed from: b */
        public String f42878b;

        /* JADX INFO: renamed from: c */
        public String f42879c;

        /* JADX INFO: renamed from: d */
        public int f42880d;

        public C11342f() {
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f42877a), this.f42878b, this.f42879c);
        }
    }

    /* JADX INFO: renamed from: C5 */
    private boolean m65608C5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.m155944o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: K5 */
    private void m65609K5(final boolean z) {
        this.f42847K0 = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(FeedModule.f38855d.m209405Y7(this.f42850M, this.f42835E0)).subscribe(mkd0.m154956H(new e30() { // from class: l.r3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157534a.m65670U5(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.s3i
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedStatusSquareTabFrag.m65628b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y5 */
    public /* synthetic */ void m65623Y5(Boolean bool) {
        if (this.f42859R) {
            this.f42860S = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z5 */
    public /* synthetic */ void m65625Z5(C4319c c4319c) {
        if (c4319c == C4319c.f15547h) {
            this.pageHelper.m109040p(vwb.m200311Y("source", getArguments().getString("from")));
            this.pageHelper.m109040p(vwb.m200311Y("refer_source", getArguments().getString("from")));
        }
        if (c4319c == C4319c.f15548i) {
            if (FeedModule.m60222H().mo30782k4() && FeedModule.m60222H().mo30837yd("onlineSquarePassive") && !this.f42861T) {
                FeedModule.m60222H().mo30842z8(act(), "onlineSquarePassive");
                this.f42861T = true;
            } else {
                if (m65653B5() && FeedModule.f38855d.m209293I7() == null) {
                    m65693v6();
                }
                if (this.f42860S && FeedModule.f38855d.m209293I7() == null && !mqi0.m155929D(FeedModule.m60222H().mo30777ja().get().longValue())) {
                    m65693v6();
                }
            }
            this.f42860S = false;
            this.f42859R = false;
            m65692u6();
            if (NullChecker.m81303a(this.f42836F)) {
                this.f42836F.m65606J();
            }
        }
        if (c4319c == C4319c.f15549j) {
            m65655E5();
            if (NullChecker.m81303a(this.f42836F)) {
                this.f42836F.m65607K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public /* synthetic */ void m65627a6(j760 j760Var) {
        boolean zBooleanValue = ((Boolean) j760Var.f116564a).booleanValue();
        FeedStateSquareRecycle feedStateSquareRecycle = this.f42836F;
        if (zBooleanValue) {
            if (NullChecker.m81303a(feedStateSquareRecycle)) {
                this.f42836F.m65606J();
            }
        } else if (NullChecker.m81303a(feedStateSquareRecycle)) {
            this.f42836F.m65607K();
        }
        if (((Boolean) j760Var.f116565b).booleanValue() && NullChecker.m81303a(this.f42858Q)) {
            boolean zBooleanValue2 = ((Boolean) j760Var.f116564a).booleanValue();
            DiscoveryPager discoveryPager = this.f42858Q;
            if (zBooleanValue2) {
                discoveryPager.setScrollble(TextUtils.isEmpty(this.f42850M));
            } else {
                discoveryPager.setScrollble(true);
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m65628b5(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public /* synthetic */ void m65639l6(View view) {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65606J();
        }
        zvf0.m220396r("e_meet_state_pop_cancel", "p_meet_state_pop");
    }

    /* JADX INFO: renamed from: y5 */
    public static FeedStatusSquareTabFrag m65651y5(BubbleInfo bubbleInfo, String str) {
        FeedStatusSquareTabFrag feedStatusSquareTabFrag = new FeedStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putString("from", str);
        feedStatusSquareTabFrag.setArguments(bundle);
        return feedStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m65652A5(int i) {
        int i2 = f42829Q0 + 1;
        f42829Q0 = i2;
        return i2 > i && !mqi0.m155929D(FeedModule.m60222H().mo30777ja().get().longValue());
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m65653B5() {
        if (mqi0.m155929D(FeedModule.m60222H().mo30777ja().get().longValue())) {
            return false;
        }
        return nkg.m159909u0();
    }

    /* JADX INFO: renamed from: D5 */
    public final void m65654D5(n0i n0iVar, boolean z) {
        BubbleInfo bubbleInfo = n0iVar.f136558b;
        if (bubbleInfo == null || FeedModule.m60221F().userId().equals(bubbleInfo.owner.f38803id)) {
            return;
        }
        List<j760<String, String>> listM65663N5 = m65663N5(bubbleInfo, z);
        if (n0iVar.f136557a == 1) {
            p6j0.m167669c("e_state", "p_state_explore", (j760[]) listM65663N5.toArray(new j760[0]));
        } else {
            zvf0.m220399u("e_state_explore_fake_user", "p_state_explore", j760.m140076a("receiver_user_id", n0iVar.f136558b.f38730id));
        }
        if (n0iVar.f136557a == 1 && !m65608C5(bubbleInfo)) {
            lsi0.m151580j("状态已结束");
        } else {
            this.f42859R = true;
            FeedModule.m60222H().mo30743aa(act(), bubbleInfo.owner.f38803id, n0iVar.f136557a == 3 ? null : bubbleInfo.f38730id, "p_state_explore", "p_quickchat,state", false, n0iVar.f136560d, "state");
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m65655E5() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109035k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final <T extends View> T m65656F5(Class<T> cls, View view) {
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
                    t = (T) m65656F5(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: G5 */
    public final List<C11342f> m65657G5() {
        ArrayList arrayList = new ArrayList();
        C11342f c11342f = new C11342f();
        c11342f.f42877a = f3c0.f94518f5;
        c11342f.f42878b = "在线闪聊";
        c11342f.f42879c = "蒙面文字闪聊";
        c11342f.f42880d = 1;
        C11342f c11342f2 = new C11342f();
        c11342f2.f42877a = f3c0.f94550j5;
        c11342f2.f42878b = "语音闪聊";
        c11342f2.f42879c = "对方递来耳机";
        c11342f2.f42880d = 2;
        C11342f c11342f3 = new C11342f();
        c11342f3.f42877a = f3c0.f94510e5;
        c11342f3.f42878b = "心动信号";
        c11342f3.f42879c = "附近颜值在线";
        c11342f3.f42880d = 3;
        C11342f c11342f4 = new C11342f();
        c11342f4.f42877a = f3c0.f94534h5;
        c11342f4.f42878b = "聊天室";
        c11342f4.f42879c = "匹配在线聊天";
        c11342f4.f42880d = 4;
        C11342f c11342f5 = new C11342f();
        c11342f5.f42877a = f3c0.f94526g5;
        c11342f5.f42878b = "拆盲盒";
        c11342f5.f42879c = "2s遇见心动";
        c11342f5.f42880d = 5;
        C11342f c11342f6 = new C11342f();
        c11342f6.f42877a = f3c0.f94502d5;
        c11342f6.f42878b = "聊聊信号";
        c11342f6.f42879c = "找个聊天搭子";
        c11342f6.f42880d = 6;
        arrayList.add(c11342f);
        arrayList.add(c11342f2);
        if (FeedModule.m60223M().mo67239Rh()) {
            C11342f c11342f7 = new C11342f();
            c11342f7.f42877a = f3c0.f94542i5;
            c11342f7.f42878b = "视频闪聊";
            c11342f7.f42879c = "面对面聊聊天";
            c11342f7.f42880d = 7;
            arrayList.add(c11342f7);
        }
        arrayList.add(c11342f3);
        arrayList.add(c11342f4);
        arrayList.add(c11342f5);
        arrayList.add(c11342f6);
        return arrayList;
    }

    /* JADX INFO: renamed from: H5 */
    public String m65658H5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.m81303a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!vqg.m199573u().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: I5 */
    public final void m65659I5(final boolean z, final List<BubbleInfo> list, final List<BubbleInfo> list2, final List<VoiceLiveStates> list3, final BubbleInfo bubbleInfo, final e30<List<n0i>> e30Var) {
        e51.m114774y(new Runnable() { // from class: l.b4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f73371a.m65669T5(bubbleInfo, list2, z, e30Var, list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final RecyclerView.AbstractC0576n m65660J5() {
        return new C11341e();
    }

    /* JADX INFO: renamed from: L5 */
    public final String m65661L5(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.m81303a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f38730id) || !NullChecker.m81303a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM130721c = hf00Var.m130721c(bubbleInfo.f38730id);
        if (!NullChecker.m81303a(rawFeedM130721c) || TextUtils.isEmpty(rawFeedM130721c.recommendReason)) {
            return null;
        }
        return rawFeedM130721c.recommendReason;
    }

    /* JADX INFO: renamed from: M5 */
    public int m65662M5() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = sti.f166364h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    /* JADX INFO: renamed from: N5 */
    public final List<j760<String, String>> m65663N5(BubbleInfo bubbleInfo, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("state_id", bubbleInfo.f38730id));
        arrayList.add(j760.m140076a("e_state_type", "state"));
        arrayList.add(j760.m140076a("user_id", bubbleInfo.owner.f38803id));
        arrayList.add(j760.m140076a("owner_id", bubbleInfo.owner.f38803id));
        if (z) {
            arrayList.add(j760.m140076a("autosayhi", "1"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m65664O5() {
        if (vwb.m200296J(this.f42849L0) || this.f42851M0 >= this.f42849L0.size() || !fm20.m122118a()) {
            return;
        }
        final n0i n0iVar = this.f42849L0.get(this.f42851M0);
        if (n0iVar.f136558b == null) {
            return;
        }
        FeedModule.m60222H().mo30827ur(act(), n0iVar.f136558b.owner.f38803id, new e30() { // from class: l.k4i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121096a.m65674b6(n0iVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P5 */
    public boolean m65665P5(int[] iArr) {
        if (this.f42854O.m65711K().size() <= 1 || iArr.length < 3) {
            return false;
        }
        int itemCount = this.f42856P.getItemCount() - 1;
        return (iArr.length > 3 && iArr[3] == itemCount) || iArr[0] == itemCount || iArr[1] == itemCount || iArr[2] == itemCount;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ Boolean m65666Q5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f38730id, this.f42839G0.get(i).f39243id));
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m65667R5(int i, VoiceLiveStates voiceLiveStates) {
        return Boolean.valueOf(TextUtils.equals(voiceLiveStates.f39252id, this.f42839G0.get(i).f39243id));
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m65668S5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f38730id, this.f42839G0.get(i).f39243id));
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m65669T5(BubbleInfo bubbleInfo, List list, boolean z, final e30 e30Var, List list2, List list3) {
        if (NullChecker.m81303a(bubbleInfo)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) list.get(i);
                if (TextUtils.equals(bubbleInfo2.f38730id, bubbleInfo.f38730id)) {
                    list.remove(bubbleInfo2);
                    break;
                }
            }
        }
        final ArrayList arrayListM200324f0 = vwb.m200324f0(new n0i[0]);
        if (vwb.m200296J(this.f42839G0)) {
            if (!z && NullChecker.m81303a(bubbleInfo)) {
                n0i n0iVar = new n0i();
                n0iVar.f136557a = 1;
                bubbleInfo.value = m65658H5(bubbleInfo);
                n0iVar.f136558b = bubbleInfo;
                arrayListM200324f0.add(n0iVar);
            }
            e51.m114748M(new Runnable() { // from class: l.e4i
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayListM200324f0);
                }
            });
            return;
        }
        for (final int i2 = 0; i2 < this.f42839G0.size(); i2++) {
            if (TextUtils.equals(this.f42839G0.get(i2).type, "state")) {
                BubbleInfo bubbleInfo3 = (BubbleInfo) vwb.m200346r(list, new w9j() { // from class: l.f4i
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f94824a.m65666Q5(i2, (BubbleInfo) obj);
                    }
                });
                if ((!NullChecker.m81303a(bubbleInfo) || !NullChecker.m81303a(bubbleInfo3) || !TextUtils.equals(bubbleInfo.f38730id, bubbleInfo3.f38730id)) && NullChecker.m81303a(bubbleInfo3)) {
                    bubbleInfo3.value = m65658H5(bubbleInfo3);
                    n0i n0iVar2 = new n0i();
                    n0iVar2.f136557a = 1;
                    n0iVar2.f136560d = this.f42839G0.get(i2).recommendReason;
                    n0iVar2.f136561e = this.f42839G0.get(i2).locationName;
                    n0iVar2.f136558b = bubbleInfo3;
                    arrayListM200324f0.add(n0iVar2);
                }
            } else if (TextUtils.equals(this.f42839G0.get(i2).type, "voiceLiveState")) {
                VoiceLiveStates voiceLiveStates = (VoiceLiveStates) vwb.m200346r(list2, new w9j() { // from class: l.g4i
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f100571a.m65667R5(i2, (VoiceLiveStates) obj);
                    }
                });
                if (NullChecker.m81303a(voiceLiveStates)) {
                    n0i n0iVar3 = new n0i();
                    n0iVar3.f136557a = 2;
                    n0iVar3.f136560d = this.f42839G0.get(i2).recommendReason;
                    n0iVar3.f136561e = this.f42839G0.get(i2).locationName;
                    n0iVar3.f136559c = voiceLiveStates;
                    arrayListM200324f0.add(n0iVar3);
                }
            } else if (TextUtils.equals(this.f42839G0.get(i2).type, "fakeUserState")) {
                BubbleInfo bubbleInfo4 = (BubbleInfo) vwb.m200346r(list3, new w9j() { // from class: l.h4i
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f105839a.m65668S5(i2, (BubbleInfo) obj);
                    }
                });
                if (nkg.m159913w0() && NullChecker.m81303a(bubbleInfo4)) {
                    Owner ownerNew_ = Owner.new_();
                    ownerNew_.f38803id = bubbleInfo4.f38730id;
                    bubbleInfo4.owner = ownerNew_;
                    n0i n0iVar4 = new n0i();
                    n0iVar4.f136557a = 3;
                    n0iVar4.f136558b = bubbleInfo4;
                    arrayListM200324f0.add(n0iVar4);
                }
            }
        }
        if (!z && NullChecker.m81303a(bubbleInfo)) {
            n0i n0iVar5 = new n0i();
            n0iVar5.f136557a = 1;
            bubbleInfo.value = m65658H5(bubbleInfo);
            n0iVar5.f136558b = bubbleInfo;
            arrayListM200324f0.add(0, n0iVar5);
        }
        e51.m114748M(new Runnable() { // from class: l.i4i
            @Override // java.lang.Runnable
            public final void run() {
                e30Var.call(arrayListM200324f0);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m65670U5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f42850M = envelope.pagination.links.next;
        m65659I5(z, list2, list, list3, this.f42847K0, new e30() { // from class: l.x3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190903a.m65673X5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m65671V5(List list) {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65606J();
        }
        if (!vwb.m200296J(list) && nkg.m159905s0() && fm20.m122118a()) {
            this.f42849L0.clear();
            this.f42849L0 = list;
            m65664O5();
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m65672W5(final List list) {
        e51.m114743H(act(), new Runnable() { // from class: l.j4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f116192a.m65671V5(list);
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m65673X5(final List list) {
        int size = list.size();
        FeedStateSquareRecycle feedStateSquareRecycle = this.f42836F;
        if (size <= 0) {
            xdl0.m208344M(feedStateSquareRecycle, false);
            xdl0.m208344M(this.f42838G, true);
            xdl0.m208344M(this.f42830A, false);
            return;
        }
        if (NullChecker.m81303a(feedStateSquareRecycle)) {
            this.f42836F.m65607K();
        }
        this.f42841H0 = false;
        this.f42843I0 = false;
        this.f42854O.m65718R(list, true, new d30() { // from class: l.d4i
            @Override // p149l.d30
            public final void call() {
                this.f84305a.m65672W5(list);
            }
        });
        xdl0.m208344M(this.f42830A, true);
        xdl0.m208344M(this.f42836F, true);
        xdl0.m208344M(this.f42838G, false);
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ void m65674b6(n0i n0iVar, Boolean bool) {
        if (bool.booleanValue()) {
            m65654D5(n0iVar, true);
            fm20.m122117J();
        } else {
            this.f42851M0++;
            m65664O5();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ void m65675c6(List list) {
        this.f42854O.m65718R(list, false, null);
        this.f42853N0 = false;
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m65676d6(Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f42850M = envelope.pagination.links.next;
        m65659I5(true, list2, list, list3, this.f42847K0, new e30() { // from class: l.c4i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79273a.m65675c6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ void m65677e6(Throwable th) {
        this.f42853N0 = false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(FeedModule.m60222H().mo30761ef()).subscribe(mkd0.m154955G(new e30() { // from class: l.p3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146986a.m65623Y5((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.a4i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67533a.m65625Z5((C4319c) obj);
            }
        }));
        duringCreated(FeedStatusPageAct.f42749B).subscribe(mkd0.m154955G(new e30() { // from class: l.l4i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126037a.m65627a6((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m65678f6(Integer num) {
        switch (num.intValue()) {
            case 1:
                zvf0.m220396r("e_quickchat_button", "p_state_explore");
                FeedModule.m60222H().mo30726Sa(act(), UnlockConversationType.quick_chat, "p_state_explore");
                break;
            case 2:
                zvf0.m220396r("e_voicechat_button", "p_state_explore");
                FeedModule.m60222H().mo30726Sa(act(), "voice_quick_chat", "p_state_explore");
                break;
            case 3:
                zvf0.m220399u("e_searchfunchat", "p_state_explore", j760.m140076a("funchat_remainingtimes", "" + FeedModule.m60222H().mo30746b3()));
                FeedModule.m60222H().mo30726Sa(act(), "heart_beat_chat", "p_state_explore");
                break;
            case 4:
                zvf0.m220396r("e_voice_chat", "p_state_explore");
                cxh.m109100b(act(), Uri.parse("tantanapp://jumpVoiceSquare?tabId=0"));
                break;
            case 5:
                zvf0.m220396r("e_meet_greet", "p_state_explore");
                FeedStatusPageAct feedStatusPageAct = (FeedStatusPageAct) getActivity();
                if (NullChecker.m81303a(feedStatusPageAct)) {
                    if (NullChecker.m81303a(this.f42836F)) {
                        this.f42836F.m65607K();
                    }
                    feedStatusPageAct.m65570I2();
                }
                break;
            case 6:
                zvf0.m220396r("e_chatting_partner_signal", "p_state_explore");
                FeedModule.m60222H().mo30787kk(act());
                break;
            case 7:
                zvf0.m220396r("e_live_video_quickchat_button", "p_state_explore");
                FeedModule.m60223M().mo67275nf(act(), "source_second_floor_square");
                break;
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f42837F0 = new hf00(12);
        this.f42835E0 = new C11339c();
        this.f42834E.post(new Runnable() { // from class: l.q3i
            @Override // java.lang.Runnable
            public final void run() {
                this.f152467a.m65688q6();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m65679g6(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m65680h6(View view) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        this.f42855O0.mo197762a(act(), "p_meet_greet", null, this.f42857P0);
        zvf0.m220396r("e_set_dynamic", "p_meet_dynamic_pop");
        m84.m153429e().m153438j();
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ void m65681i6(View view) {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65606J();
        }
        zvf0.m220396r("e_meet_dynamic_pop_cancel", "p_meet_dynamic_pop");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (ViewGroup) m65695x5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ void m65682j6() {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65607K();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ void m65683k6(View view) {
        zvf0.m220399u("e_set_my_state", "p_meet_state_pop", j760.m140076a("source_page", "p_meet_state_pop"));
        if (NullChecker.m81303a(FeedModule.f38856e.f109186H) && NullChecker.m81303a(FeedModule.f38856e.f109186H.m221515e()) && TEnum.equals(FeedModule.f38856e.f109186H.m221515e().status, "start")) {
            osi0.m165783g("状态发布中...");
        } else {
            s1i.m181966f(act(), "p_meet_greet");
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ void m65684m6() {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65607K();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ void m65685n6(String str) {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65607K();
        }
        FeedModule.m60222H().mo30777ja().put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ void m65686o6(String str) {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65606J();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m65687p6() {
        this.f42853N0 = true;
        if (!TextUtils.isEmpty(this.f42850M)) {
            duringCreated(FeedModule.f38855d.m209405Y7(this.f42850M, this.f42835E0)).subscribe(mkd0.m154956H(new e30() { // from class: l.y3i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195811a.m65676d6((Envelope) obj);
                }
            }, new e30() { // from class: l.z3i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201376a.m65677e6((Throwable) obj);
                }
            }));
        } else {
            this.f42854O.m65713M();
            this.f42853N0 = false;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q6 */
    public void m65688q6() {
        int measuredHeight = this.f42834E.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42836F.getLayoutParams();
        int i = 4;
        int iM186890d = (t100.m186890d(131.0f) * 4) + (t100.m186890d(16.0f) * 3) + t100.m186890d(24.0f) + t100.m186890d(24.0f);
        int i2 = 2;
        if (measuredHeight > iM186890d) {
            layoutParams.height = iM186890d;
        } else {
            layoutParams.height = ((t100.m186890d(131.0f) * 3) + (this.f42862U * 2)) - t100.m186890d(0.0f);
            i = 3;
        }
        if (measuredHeight < layoutParams.height) {
            if (layoutParams.height - measuredHeight < ((ViewGroup.MarginLayoutParams) this.f42842I.getLayoutParams()).bottomMargin + t100.m186890d(5.0f)) {
                xdl0.m208357U(this.f42842I, 0);
                this.f42862U = t100.m186890d(6.0f);
                layoutParams.height = ((t100.m186890d(131.0f) * 3) + (this.f42862U * 2)) - t100.m186890d(0.0f);
                i2 = i;
            } else {
                layoutParams.height = (t100.m186890d(131.0f) * 2) + (this.f42862U * 3);
            }
        } else {
            i2 = i;
        }
        this.f42836F.setLayoutParams(layoutParams);
        this.f42852N = new C11337a();
        this.f42856P = new FeedCustomSGLayoutManager(i2, 0);
        this.f42856P.m65586f0(RemoteConfig.m79298x().m79334w("state_square_bubble_speed") * 0.2d);
        this.f42836F.setLayoutManager(this.f42856P);
        this.f42836F.setflingScale(3.0d);
        this.f42856P.m3513U(0);
        this.f42836F.addItemDecoration(m65660J5());
        C11343a c11343a = new C11343a(this, getContext(), this.f42848L, this.f42852N, new C11338b());
        this.f42854O = c11343a;
        this.f42836F.setAdapter(c11343a);
        this.f42836F.addOnScrollListener(this.f42845J0);
        List<C11342f> listM65657G5 = m65657G5();
        new ArrayList();
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("feed_state_square_bottom_view");
            if (!TextUtils.isEmpty(strM79302F)) {
                List<FeedStateSquareBottomViewParams> list = JsonParseHelper.parseList(strM79302F, FeedStateSquareBottomViewParams.JSON_ADAPTER);
                User userMe_ = FeedModule.m60222H().me_();
                if (userMe_ == null || userMe_.isFemale()) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (list.get(i3).viewType == 3) {
                            list.remove(i3);
                            break;
                        }
                    }
                }
                List<C11342f> listM65689r6 = m65689r6(list, listM65657G5);
                this.f42844J.setLayoutManager(new LinearLayoutManager(act(), 0, false));
                C11344b c11344b = new C11344b(act(), listM65689r6, new e30() { // from class: l.t3i
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f167637a.m65678f6((Integer) obj);
                    }
                });
                this.f42844J.setAdapter(c11344b);
                c11344b.notifyDataSetChanged();
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m65609K5(false);
    }

    /* JADX INFO: renamed from: r6 */
    public final List<C11342f> m65689r6(List<FeedStateSquareBottomViewParams> list, List<C11342f> list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            final FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = list.get(i);
            C11342f c11342f = (C11342f) vwb.m200346r(list2, new w9j() { // from class: l.v3i
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(feedStateSquareBottomViewParams.name, ((FeedStatusSquareTabFrag.C11342f) obj).f42878b));
                }
            });
            if (NullChecker.m81303a(c11342f)) {
                arrayList.add(c11342f);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s6 */
    public void m65690s6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            osi0.m165783g("暂时没有遇到有趣的灵魂");
            return;
        }
        if (!TextUtils.equals(str, "moment")) {
            if (!TextUtils.equals(str, "state")) {
                osi0.m165783g("暂时没有遇到有趣的灵魂");
                return;
            } else {
                BubbleInfo bubbleInfoM209588y7 = FeedModule.f38855d.m209588y7(str3);
                FeedModule.m60222H().mo30743aa(act(), bubbleInfoM209588y7.owner.f38803id, bubbleInfoM209588y7.f38730id, "p_meet_greet", "p_quickchat,chance", false, m65661L5(bubbleInfoM209588y7, this.f42837F0), "state");
                return;
            }
        }
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str2);
        if (TextUtils.isEmpty(str3)) {
            osi0.m165783g("暂时没有遇到有趣的灵魂");
            return;
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(str3);
        if (userM209447e8 == null) {
            osi0.m165783g("暂时没有遇到有趣的灵魂");
        } else {
            FeedModule.f38854c.m60724f3(act(), userM209447e8, momentM209572w7, "p_meet_greet", false);
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m65691t6(int i) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (i == 40351) {
            new xh0.C21150a(act()).m208731j("今日偶遇次数已用尽，每日首次发布动态可获得 1 次新偶遇机会").m208739r("发动态").m208729h(false).m208736o(new View.OnClickListener() { // from class: l.n4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137111a.m65680h6(view);
                }
            }).m208727f("取消").m208724c(new View.OnClickListener() { // from class: l.o4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141780a.m65681i6(view);
                }
            }).m208722a().m208721g();
            e51.m114744I(this, new Runnable() { // from class: l.p4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147177a.m65682j6();
                }
            }, 100L);
            i0e.m133797f(i0e.m133794c("p_meet_dynamic_pop", Dialog.class.getName()));
        }
        if (i == 40352) {
            new xh0.C21150a(act()).m208731j("今日偶遇次数已用尽，分享心情状态可获得 1 次新偶遇机会").m208739r("发状态").m208729h(false).m208736o(new View.OnClickListener() { // from class: l.q4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152627a.m65683k6(view);
                }
            }).m208727f("取消").m208724c(new View.OnClickListener() { // from class: l.r4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157698a.m65639l6(view);
                }
            }).m208722a().m208721g();
            e51.m114744I(this, new Runnable() { // from class: l.s4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162397a.m65684m6();
                }
            }, 100L);
            i0e.m133797f(i0e.m133794c("p_meet_state_pop", Dialog.class.getName()));
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m65692u6() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109036l();
    }

    /* JADX INFO: renamed from: v6 */
    public final void m65693v6() {
        if (act() == null || this.f42861T) {
            return;
        }
        m65694w6(act(), new e30() { // from class: l.u3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173614a.m65685n6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public void m65694w6(Act act, e30<String> e30Var) {
        StateGuide stateGuide;
        String str = sti.f166364h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0 || FeedModule.m60222H().mo30690Gn()) {
            return;
        }
        this.f42861T = true;
        kyg.m147873h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, e30Var, new e30() { // from class: l.w3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184394a.m65686o6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public View m65695x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4i.m187204b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x6 */
    public void m65696x6() {
        if (NullChecker.m81303a(this.f42836F)) {
            this.f42836F.m65606J();
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m65697z5() {
        this.f42847K0 = null;
        this.f42850M = null;
        m65609K5(true);
    }
}
