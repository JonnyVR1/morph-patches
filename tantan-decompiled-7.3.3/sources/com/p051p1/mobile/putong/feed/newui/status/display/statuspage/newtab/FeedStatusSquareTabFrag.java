package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Configs;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.StateGuide;
import com.p051p1.mobile.putong.feed.data.VoiceLiveStates;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p153l.bnl0;
import p153l.c2i;
import p153l.cmg;
import p153l.dmk0;
import p153l.h3i;
import p153l.h80;
import p153l.i4g0;
import p153l.i6i;
import p153l.jv00;
import p153l.jyb;
import p153l.keh;
import p153l.ksg;
import p153l.l51;
import p153l.l94;
import p153l.lbc0;
import p153l.leh;
import p153l.mrb0;
import p153l.o1j0;
import p153l.orb0;
import p153l.owi;
import p153l.pf60;
import p153l.psd0;
import p153l.pu20;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.qn00;
import p153l.r1j0;
import p153l.ryh;
import p153l.tfj0;
import p153l.th0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: Q0 */
    public static int f43677Q0;

    /* JADX INFO: renamed from: A */
    public VRelative f43678A;

    /* JADX INFO: renamed from: B */
    public VImage f43679B;

    /* JADX INFO: renamed from: C */
    public VImage f43680C;

    /* JADX INFO: renamed from: D */
    public VImage f43681D;

    /* JADX INFO: renamed from: E */
    public VLinear f43682E;

    /* JADX INFO: renamed from: E0 */
    public jv00 f43683E0;

    /* JADX INFO: renamed from: F */
    public FeedStateSquareRecycle f43684F;

    /* JADX INFO: renamed from: F0 */
    public qn00 f43685F0;

    /* JADX INFO: renamed from: G */
    public VLinear f43686G;

    /* JADX INFO: renamed from: H */
    public Space f43688H;

    /* JADX INFO: renamed from: H0 */
    public boolean f43689H0;

    /* JADX INFO: renamed from: I */
    public VLinear f43690I;

    /* JADX INFO: renamed from: I0 */
    public boolean f43691I0;

    /* JADX INFO: renamed from: J */
    public RecyclerView f43692J;

    /* JADX INFO: renamed from: K0 */
    public BubbleInfo f43695K0;

    /* JADX INFO: renamed from: M */
    public String f43698M;

    /* JADX INFO: renamed from: N */
    public h80<c2i> f43700N;

    /* JADX INFO: renamed from: O */
    public C11506a f43702O;

    /* JADX INFO: renamed from: P */
    public FeedCustomSGLayoutManager f43704P;

    /* JADX INFO: renamed from: Q */
    public DiscoveryPager f43706Q;

    /* JADX INFO: renamed from: R */
    public boolean f43707R;

    /* JADX INFO: renamed from: S */
    public boolean f43708S;

    /* JADX INFO: renamed from: T */
    public boolean f43709T;

    /* JADX INFO: renamed from: z */
    public ConstraintLayout f43718z;

    /* JADX INFO: renamed from: K */
    public final long f43694K = 86400000;

    /* JADX INFO: renamed from: L */
    public List<c2i> f43696L = new ArrayList();

    /* JADX INFO: renamed from: U */
    public int f43710U = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: V */
    public final int f43711V = 1;

    /* JADX INFO: renamed from: W */
    public final int f43712W = 2;

    /* JADX INFO: renamed from: X */
    public final int f43713X = 3;

    /* JADX INFO: renamed from: Y */
    public final int f43714Y = 4;

    /* JADX INFO: renamed from: Z */
    public final int f43715Z = 5;

    /* JADX INFO: renamed from: k0 */
    public final int f43716k0 = 6;

    /* JADX INFO: renamed from: p0 */
    public final int f43717p0 = 7;

    /* JADX INFO: renamed from: G0 */
    public List<RawFeed> f43687G0 = new ArrayList();

    /* JADX INFO: renamed from: J0 */
    public RecyclerView.AbstractC0584t f43693J0 = new C11503d();

    /* JADX INFO: renamed from: L0 */
    public List<c2i> f43697L0 = new ArrayList();

    /* JADX INFO: renamed from: M0 */
    public int f43699M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public boolean f43701N0 = false;

    /* JADX INFO: renamed from: O0 */
    public keh f43703O0 = new leh();

    /* JADX INFO: renamed from: P0 */
    public y20<Intent> f43705P0 = dmk0.m116962a(400, new y20() { // from class: l.b6i
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f75192a.m66862g6((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a */
    public class C11500a extends h80<c2i> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$a$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11500a.this.m133884o();
                }
            }
        }

        public C11500a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            if (NullChecker.m82486a(FeedStatusSquareTabFrag.this.f43706Q)) {
                return;
            }
            FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
            feedStatusSquareTabFrag.f43706Q = (DiscoveryPager) feedStatusSquareTabFrag.m66839F5(DiscoveryPager.class, viewGroup);
            if (FeedStatusSquareTabFrag.this.f43706Q == null) {
                return;
            }
            FeedStatusSquareTabFrag.this.f43706Q.setScrollble(false);
            FeedStatusSquareTabFrag.this.f43706Q.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(c2i c2iVar, int i) {
            int i2 = c2iVar.f79480a;
            if (i2 == 3) {
                i4g0.m138492A("e_state_explore_fake_user", "p_state_explore", pf60.m172085a("receiver_user_id", c2iVar.f79481b.f39578id));
            } else {
                i4g0.m138492A("e_state", "p_state_explore", pf60.m172085a("state_id", i2 == 1 ? c2iVar.f79481b.f39578id : ""), pf60.m172085a("e_state_type", c2iVar.f79480a == 1 ? "state" : "audio_room"), pf60.m172085a("user_id", c2iVar.f79480a == 1 ? c2iVar.f79481b.owner.f39651id : ""), pf60.m172085a("owner_id", c2iVar.f79480a == 1 ? c2iVar.f79481b.owner.f39651id : ""));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo56879m(c2i c2iVar, int i, long j, View view) {
            if (NullChecker.m82486a(view) && cmg.m111236t0() && FeedModule.f39703d.m145534I7() == null && !((RecyclerView.C0580p) view.getLayoutParams()).m3421f()) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag.m66835A5(feedStatusSquareTabFrag.m66845M5())) {
                    FeedStatusSquareTabFrag.this.m66876v6();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$b */
    public class C11501b implements C11506a.a {
        public C11501b() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11506a.a
        /* JADX INFO: renamed from: b */
        public void mo66883b() {
            FeedStatusSquareTabFrag.this.m66870p6();
        }

        @Override // com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11506a.a
        /* JADX INFO: renamed from: c */
        public void mo66884c() {
            if (NullChecker.m82486a(FeedStatusSquareTabFrag.this.f43684F)) {
                FeedStatusSquareTabFrag.this.f43684F.m66790K();
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.C11506a.a
        /* JADX INFO: renamed from: d */
        public void mo66885d(View view, c2i c2iVar) {
            int i = c2iVar.f79480a;
            if (i == 1 || i == 3) {
                FeedStatusSquareTabFrag.this.m66837D5(c2iVar, false);
                return;
            }
            VoiceLiveStates voiceLiveStates = c2iVar.f79482c;
            if (voiceLiveStates == null) {
                return;
            }
            i4g0.m138523u("e_live_audio_room_enter", "p_state_explore", pf60.m172085a("anchorId", voiceLiveStates.userId), pf60.m172085a("liveId", voiceLiveStates.f40100id), pf60.m172085a("audio_card_type", "state_explore_bubble"), pf60.m172085a("topic_id", voiceLiveStates.topicId), pf60.m172085a("audio_room_label", ""), pf60.m172085a("voice_template", ""));
            i4g0.m138523u("e_state", "p_state_explore", pf60.m172085a("e_state_type", "audio_room"), pf60.m172085a("refer_source", FeedStatusSquareTabFrag.this.getArguments().getString("from")), pf60.m172085a("state_id", ""), pf60.m172085a("owner_id", voiceLiveStates.userId));
            FeedModule.m61407M().mo68412M6().mo127334e(FeedStatusSquareTabFrag.this.act(), voiceLiveStates.f40100id, "p_state_explore", "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$c */
    public class C11502c extends jv00 {
        public C11502c() {
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: a */
        public void mo66886a(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f43687G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f43685F0.m177165h(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }

        @Override // p153l.jv00
        /* JADX INFO: renamed from: c */
        public void mo66887c(Envelope envelope) {
            FeedStatusSquareTabFrag.this.f43687G0 = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
            if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
                FeedStatusSquareTabFrag.this.f43685F0.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$d */
    public class C11503d extends RecyclerView.AbstractC0584t {
        public C11503d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            FeedStatusSquareTabFrag.this.f43704P.m3542t(new int[FeedStatusSquareTabFrag.this.f43704P.m3501G()]);
            int[] iArr = new int[FeedStatusSquareTabFrag.this.f43704P.m3501G()];
            FeedStatusSquareTabFrag.this.f43704P.m3543u(iArr);
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag = FeedStatusSquareTabFrag.this;
                feedStatusSquareTabFrag.f43691I0 = feedStatusSquareTabFrag.m66848P5(iArr);
            }
            if (i == 0) {
                FeedStatusSquareTabFrag feedStatusSquareTabFrag2 = FeedStatusSquareTabFrag.this;
                if (feedStatusSquareTabFrag2.f43689H0 || feedStatusSquareTabFrag2.f43691I0 || !NullChecker.m82486a(feedStatusSquareTabFrag2.f43684F)) {
                    return;
                }
                FeedStatusSquareTabFrag.this.f43684F.m66789J();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FeedStatusSquareTabFrag.this.f43689H0 = i <= 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$e */
    public class C11504e extends RecyclerView.AbstractC0578n {
        public C11504e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.C0595c) {
                if (((StaggeredGridLayoutManager.C0595c) view.getLayoutParams()).m3576h()) {
                    rect.top = 0;
                    rect.left = 0;
                    rect.right = 0;
                } else {
                    rect.top = FeedStatusSquareTabFrag.this.f43710U - qa00.m175859d(7.0f);
                    rect.left = FeedStatusSquareTabFrag.this.f43710U;
                    rect.right = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag$f */
    public class C11505f {

        /* JADX INFO: renamed from: a */
        public int f43725a;

        /* JADX INFO: renamed from: b */
        public String f43726b;

        /* JADX INFO: renamed from: c */
        public String f43727c;

        /* JADX INFO: renamed from: d */
        public int f43728d;

        public C11505f() {
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f43725a), this.f43726b, this.f43727c);
        }
    }

    /* JADX INFO: renamed from: C5 */
    private boolean m66791C5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) pzi0.m174454o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: K5 */
    private void m66792K5(final boolean z) {
        this.f43695K0 = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(FeedModule.f39703d.m145646Y7(this.f43698M, this.f43683E0)).subscribe(psd0.m173597H(new y20() { // from class: l.g5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102330a.m66853U5(z, (Envelope) obj);
            }
        }, new y20() { // from class: l.h5i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedStatusSquareTabFrag.m66811b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y5 */
    public /* synthetic */ void m66806Y5(Boolean bool) {
        if (this.f43707R) {
            this.f43708S = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z5 */
    public /* synthetic */ void m66808Z5(C4470c c4470c) {
        if (c4470c == C4470c.f16266h) {
            this.pageHelper.m152781p(jyb.m147494Y("source", getArguments().getString("from")));
            this.pageHelper.m152781p(jyb.m147494Y("refer_source", getArguments().getString("from")));
        }
        if (c4470c == C4470c.f16267i) {
            if (FeedModule.m61406H().mo31785k4() && FeedModule.m61406H().mo31840yd("onlineSquarePassive") && !this.f43709T) {
                FeedModule.m61406H().mo31845z8(act(), "onlineSquarePassive");
                this.f43709T = true;
            } else {
                if (m66836B5() && FeedModule.f39703d.m145534I7() == null) {
                    m66876v6();
                }
                if (this.f43708S && FeedModule.f39703d.m145534I7() == null && !pzi0.m174439D(FeedModule.m61406H().mo31780ja().get().longValue())) {
                    m66876v6();
                }
            }
            this.f43708S = false;
            this.f43707R = false;
            m66875u6();
            if (NullChecker.m82486a(this.f43684F)) {
                this.f43684F.m66789J();
            }
        }
        if (c4470c == C4470c.f16268j) {
            m66838E5();
            if (NullChecker.m82486a(this.f43684F)) {
                this.f43684F.m66790K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public /* synthetic */ void m66810a6(pf60 pf60Var) {
        boolean zBooleanValue = ((Boolean) pf60Var.f152156a).booleanValue();
        FeedStateSquareRecycle feedStateSquareRecycle = this.f43684F;
        if (zBooleanValue) {
            if (NullChecker.m82486a(feedStateSquareRecycle)) {
                this.f43684F.m66789J();
            }
        } else if (NullChecker.m82486a(feedStateSquareRecycle)) {
            this.f43684F.m66790K();
        }
        if (((Boolean) pf60Var.f152157b).booleanValue() && NullChecker.m82486a(this.f43706Q)) {
            boolean zBooleanValue2 = ((Boolean) pf60Var.f152156a).booleanValue();
            DiscoveryPager discoveryPager = this.f43706Q;
            if (zBooleanValue2) {
                discoveryPager.setScrollble(TextUtils.isEmpty(this.f43698M));
            } else {
                discoveryPager.setScrollble(true);
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m66811b5(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public /* synthetic */ void m66822l6(View view) {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66789J();
        }
        i4g0.m138520r("e_meet_state_pop_cancel", "p_meet_state_pop");
    }

    /* JADX INFO: renamed from: y5 */
    public static FeedStatusSquareTabFrag m66834y5(BubbleInfo bubbleInfo, String str) {
        FeedStatusSquareTabFrag feedStatusSquareTabFrag = new FeedStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putString("from", str);
        feedStatusSquareTabFrag.setArguments(bundle);
        return feedStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m66835A5(int i) {
        int i2 = f43677Q0 + 1;
        f43677Q0 = i2;
        return i2 > i && !pzi0.m174439D(FeedModule.m61406H().mo31780ja().get().longValue());
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m66836B5() {
        if (pzi0.m174439D(FeedModule.m61406H().mo31780ja().get().longValue())) {
            return false;
        }
        return cmg.m111238u0();
    }

    /* JADX INFO: renamed from: D5 */
    public final void m66837D5(c2i c2iVar, boolean z) {
        BubbleInfo bubbleInfo = c2iVar.f79481b;
        if (bubbleInfo == null || FeedModule.m61405F().userId().equals(bubbleInfo.owner.f39651id)) {
            return;
        }
        List<pf60<String, String>> listM66846N5 = m66846N5(bubbleInfo, z);
        if (c2iVar.f79480a == 1) {
            tfj0.m190940c("e_state", "p_state_explore", (pf60[]) listM66846N5.toArray(new pf60[0]));
        } else {
            i4g0.m138523u("e_state_explore_fake_user", "p_state_explore", pf60.m172085a("receiver_user_id", c2iVar.f79481b.f39578id));
        }
        if (c2iVar.f79480a == 1 && !m66791C5(bubbleInfo)) {
            o1j0.m165636j("状态已结束");
        } else {
            this.f43707R = true;
            FeedModule.m61406H().mo31746aa(act(), bubbleInfo.owner.f39651id, c2iVar.f79480a == 3 ? null : bubbleInfo.f39578id, "p_state_explore", "p_quickchat,state", false, c2iVar.f79483d, "state");
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m66838E5() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152776k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final <T extends View> T m66839F5(Class<T> cls, View view) {
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
                    t = (T) m66839F5(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: G5 */
    public final List<C11505f> m66840G5() {
        ArrayList arrayList = new ArrayList();
        C11505f c11505f = new C11505f();
        c11505f.f43725a = lbc0.f131036f5;
        c11505f.f43726b = "在线闪聊";
        c11505f.f43727c = "蒙面文字闪聊";
        c11505f.f43728d = 1;
        C11505f c11505f2 = new C11505f();
        c11505f2.f43725a = lbc0.f131068j5;
        c11505f2.f43726b = "语音闪聊";
        c11505f2.f43727c = "对方递来耳机";
        c11505f2.f43728d = 2;
        C11505f c11505f3 = new C11505f();
        c11505f3.f43725a = lbc0.f131028e5;
        c11505f3.f43726b = "心动信号";
        c11505f3.f43727c = "附近颜值在线";
        c11505f3.f43728d = 3;
        C11505f c11505f4 = new C11505f();
        c11505f4.f43725a = lbc0.f131052h5;
        c11505f4.f43726b = "聊天室";
        c11505f4.f43727c = "匹配在线聊天";
        c11505f4.f43728d = 4;
        C11505f c11505f5 = new C11505f();
        c11505f5.f43725a = lbc0.f131044g5;
        c11505f5.f43726b = "拆盲盒";
        c11505f5.f43727c = "2s遇见心动";
        c11505f5.f43728d = 5;
        C11505f c11505f6 = new C11505f();
        c11505f6.f43725a = lbc0.f131020d5;
        c11505f6.f43726b = "聊聊信号";
        c11505f6.f43727c = "找个聊天搭子";
        c11505f6.f43728d = 6;
        arrayList.add(c11505f);
        arrayList.add(c11505f2);
        if (FeedModule.m61407M().mo68422Rh()) {
            C11505f c11505f7 = new C11505f();
            c11505f7.f43725a = lbc0.f131060i5;
            c11505f7.f43726b = "视频闪聊";
            c11505f7.f43727c = "面对面聊聊天";
            c11505f7.f43728d = 7;
            arrayList.add(c11505f7);
        }
        arrayList.add(c11505f3);
        arrayList.add(c11505f4);
        arrayList.add(c11505f5);
        arrayList.add(c11505f6);
        return arrayList;
    }

    /* JADX INFO: renamed from: H5 */
    public String m66841H5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.m82486a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!ksg.m151232u().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: I5 */
    public final void m66842I5(final boolean z, final List<BubbleInfo> list, final List<BubbleInfo> list2, final List<VoiceLiveStates> list3, final BubbleInfo bubbleInfo, final y20<List<c2i>> y20Var) {
        l51.m152919y(new Runnable() { // from class: l.q5i
            @Override // java.lang.Runnable
            public final void run() {
                this.f155715a.m66852T5(bubbleInfo, list2, z, y20Var, list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final RecyclerView.AbstractC0578n m66843J5() {
        return new C11504e();
    }

    /* JADX INFO: renamed from: L5 */
    public final String m66844L5(BubbleInfo bubbleInfo, qn00 qn00Var) {
        if (!NullChecker.m82486a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f39578id) || !NullChecker.m82486a(qn00Var)) {
            return null;
        }
        RawFeed rawFeedM177160c = qn00Var.m177160c(bubbleInfo.f39578id);
        if (!NullChecker.m82486a(rawFeedM177160c) || TextUtils.isEmpty(rawFeedM177160c.recommendReason)) {
            return null;
        }
        return rawFeedM177160c.recommendReason;
    }

    /* JADX INFO: renamed from: M5 */
    public int m66845M5() {
        StateGuide stateGuide;
        List<Configs> list;
        String str = owi.f149489h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || (list = stateGuide.configs) == null || list.size() == 0) {
            return -1;
        }
        return stateGuide.configs.get(0).swipeMomentCount;
    }

    /* JADX INFO: renamed from: N5 */
    public final List<pf60<String, String>> m66846N5(BubbleInfo bubbleInfo, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("state_id", bubbleInfo.f39578id));
        arrayList.add(pf60.m172085a("e_state_type", "state"));
        arrayList.add(pf60.m172085a("user_id", bubbleInfo.owner.f39651id));
        arrayList.add(pf60.m172085a("owner_id", bubbleInfo.owner.f39651id));
        if (z) {
            arrayList.add(pf60.m172085a("autosayhi", "1"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m66847O5() {
        if (jyb.m147479J(this.f43697L0) || this.f43699M0 >= this.f43697L0.size() || !pu20.m173806a()) {
            return;
        }
        final c2i c2iVar = this.f43697L0.get(this.f43699M0);
        if (c2iVar.f79481b == null) {
            return;
        }
        FeedModule.m61406H().mo31830ur(act(), c2iVar.f79481b.owner.f39651id, new y20() { // from class: l.z5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203060a.m66857b6(c2iVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P5 */
    public boolean m66848P5(int[] iArr) {
        if (this.f43702O.m66894K().size() <= 1 || iArr.length < 3) {
            return false;
        }
        int itemCount = this.f43704P.getItemCount() - 1;
        return (iArr.length > 3 && iArr[3] == itemCount) || iArr[0] == itemCount || iArr[1] == itemCount || iArr[2] == itemCount;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ Boolean m66849Q5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f39578id, this.f43687G0.get(i).f40091id));
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ Boolean m66850R5(int i, VoiceLiveStates voiceLiveStates) {
        return Boolean.valueOf(TextUtils.equals(voiceLiveStates.f40100id, this.f43687G0.get(i).f40091id));
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m66851S5(int i, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(bubbleInfo.f39578id, this.f43687G0.get(i).f40091id));
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m66852T5(BubbleInfo bubbleInfo, List list, boolean z, final y20 y20Var, List list2, List list3) {
        if (NullChecker.m82486a(bubbleInfo)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) list.get(i);
                if (TextUtils.equals(bubbleInfo2.f39578id, bubbleInfo.f39578id)) {
                    list.remove(bubbleInfo2);
                    break;
                }
            }
        }
        final ArrayList arrayListM147507f0 = jyb.m147507f0(new c2i[0]);
        if (jyb.m147479J(this.f43687G0)) {
            if (!z && NullChecker.m82486a(bubbleInfo)) {
                c2i c2iVar = new c2i();
                c2iVar.f79480a = 1;
                bubbleInfo.value = m66841H5(bubbleInfo);
                c2iVar.f79481b = bubbleInfo;
                arrayListM147507f0.add(c2iVar);
            }
            l51.m152893M(new Runnable() { // from class: l.t5i
                @Override // java.lang.Runnable
                public final void run() {
                    y20Var.call(arrayListM147507f0);
                }
            });
            return;
        }
        for (final int i2 = 0; i2 < this.f43687G0.size(); i2++) {
            if (TextUtils.equals(this.f43687G0.get(i2).type, "state")) {
                BubbleInfo bubbleInfo3 = (BubbleInfo) jyb.m147529r(list, new qcj() { // from class: l.u5i
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f177636a.m66849Q5(i2, (BubbleInfo) obj);
                    }
                });
                if ((!NullChecker.m82486a(bubbleInfo) || !NullChecker.m82486a(bubbleInfo3) || !TextUtils.equals(bubbleInfo.f39578id, bubbleInfo3.f39578id)) && NullChecker.m82486a(bubbleInfo3)) {
                    bubbleInfo3.value = m66841H5(bubbleInfo3);
                    c2i c2iVar2 = new c2i();
                    c2iVar2.f79480a = 1;
                    c2iVar2.f79483d = this.f43687G0.get(i2).recommendReason;
                    c2iVar2.f79484e = this.f43687G0.get(i2).locationName;
                    c2iVar2.f79481b = bubbleInfo3;
                    arrayListM147507f0.add(c2iVar2);
                }
            } else if (TextUtils.equals(this.f43687G0.get(i2).type, "voiceLiveState")) {
                VoiceLiveStates voiceLiveStates = (VoiceLiveStates) jyb.m147529r(list2, new qcj() { // from class: l.v5i
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f182540a.m66850R5(i2, (VoiceLiveStates) obj);
                    }
                });
                if (NullChecker.m82486a(voiceLiveStates)) {
                    c2i c2iVar3 = new c2i();
                    c2iVar3.f79480a = 2;
                    c2iVar3.f79483d = this.f43687G0.get(i2).recommendReason;
                    c2iVar3.f79484e = this.f43687G0.get(i2).locationName;
                    c2iVar3.f79482c = voiceLiveStates;
                    arrayListM147507f0.add(c2iVar3);
                }
            } else if (TextUtils.equals(this.f43687G0.get(i2).type, "fakeUserState")) {
                BubbleInfo bubbleInfo4 = (BubbleInfo) jyb.m147529r(list3, new qcj() { // from class: l.w5i
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f187517a.m66851S5(i2, (BubbleInfo) obj);
                    }
                });
                if (cmg.m111242w0() && NullChecker.m82486a(bubbleInfo4)) {
                    Owner ownerNew_ = Owner.new_();
                    ownerNew_.f39651id = bubbleInfo4.f39578id;
                    bubbleInfo4.owner = ownerNew_;
                    c2i c2iVar4 = new c2i();
                    c2iVar4.f79480a = 3;
                    c2iVar4.f79481b = bubbleInfo4;
                    arrayListM147507f0.add(c2iVar4);
                }
            }
        }
        if (!z && NullChecker.m82486a(bubbleInfo)) {
            c2i c2iVar5 = new c2i();
            c2iVar5.f79480a = 1;
            bubbleInfo.value = m66841H5(bubbleInfo);
            c2iVar5.f79481b = bubbleInfo;
            arrayListM147507f0.add(0, c2iVar5);
        }
        l51.m152893M(new Runnable() { // from class: l.x5i
            @Override // java.lang.Runnable
            public final void run() {
                y20Var.call(arrayListM147507f0);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m66853U5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f43698M = envelope.pagination.links.next;
        m66842I5(z, list2, list, list3, this.f43695K0, new y20() { // from class: l.m5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134900a.m66856X5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m66854V5(List list) {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66789J();
        }
        if (!jyb.m147479J(list) && cmg.m111234s0() && pu20.m173806a()) {
            this.f43697L0.clear();
            this.f43697L0 = list;
            m66847O5();
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m66855W5(final List list) {
        l51.m152888H(act(), new Runnable() { // from class: l.y5i
            @Override // java.lang.Runnable
            public final void run() {
                this.f197560a.m66854V5(list);
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m66856X5(final List list) {
        int size = list.size();
        FeedStateSquareRecycle feedStateSquareRecycle = this.f43684F;
        if (size <= 0) {
            bnl0.m105524M(feedStateSquareRecycle, false);
            bnl0.m105524M(this.f43686G, true);
            bnl0.m105524M(this.f43678A, false);
            return;
        }
        if (NullChecker.m82486a(feedStateSquareRecycle)) {
            this.f43684F.m66790K();
        }
        this.f43689H0 = false;
        this.f43691I0 = false;
        this.f43702O.m66901R(list, true, new x20() { // from class: l.s5i
            @Override // p153l.x20
            public final void call() {
                this.f166371a.m66855W5(list);
            }
        });
        bnl0.m105524M(this.f43678A, true);
        bnl0.m105524M(this.f43684F, true);
        bnl0.m105524M(this.f43686G, false);
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ void m66857b6(c2i c2iVar, Boolean bool) {
        if (bool.booleanValue()) {
            m66837D5(c2iVar, true);
            pu20.m173805J();
        } else {
            this.f43699M0++;
            m66847O5();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ void m66858c6(List list) {
        this.f43702O.m66901R(list, false, null);
        this.f43701N0 = false;
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m66859d6(Envelope envelope) {
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        List<BubbleInfo> list2 = ((FeedData) envelope.data.getModuleData(FeedData.class)).fakeUserStates;
        List<VoiceLiveStates> list3 = ((FeedData) envelope.data.getModuleData(FeedData.class)).voiceLiveStates;
        this.f43698M = envelope.pagination.links.next;
        m66842I5(true, list2, list, list3, this.f43695K0, new y20() { // from class: l.r5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161359a.m66858c6((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ void m66860e6(Throwable th) {
        this.f43701N0 = false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(FeedModule.m61406H().mo31764ef()).subscribe(psd0.m173596G(new y20() { // from class: l.e5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92217a.m66806Y5((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.p5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150655a.m66808Z5((C4470c) obj);
            }
        }));
        duringCreated(FeedStatusPageAct.f43597B).subscribe(psd0.m173596G(new y20() { // from class: l.a6i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68731a.m66810a6((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ void m66861f6(Integer num) {
        switch (num.intValue()) {
            case 1:
                i4g0.m138520r("e_quickchat_button", "p_state_explore");
                FeedModule.m61406H().mo31729Sa(act(), UnlockConversationType.quick_chat, "p_state_explore");
                break;
            case 2:
                i4g0.m138520r("e_voicechat_button", "p_state_explore");
                FeedModule.m61406H().mo31729Sa(act(), "voice_quick_chat", "p_state_explore");
                break;
            case 3:
                i4g0.m138523u("e_searchfunchat", "p_state_explore", pf60.m172085a("funchat_remainingtimes", "" + FeedModule.m61406H().mo31749b3()));
                FeedModule.m61406H().mo31729Sa(act(), "heart_beat_chat", "p_state_explore");
                break;
            case 4:
                i4g0.m138520r("e_voice_chat", "p_state_explore");
                ryh.m183607b(act(), Uri.parse("tantanapp://jumpVoiceSquare?tabId=0"));
                break;
            case 5:
                i4g0.m138520r("e_meet_greet", "p_state_explore");
                FeedStatusPageAct feedStatusPageAct = (FeedStatusPageAct) getActivity();
                if (NullChecker.m82486a(feedStatusPageAct)) {
                    if (NullChecker.m82486a(this.f43684F)) {
                        this.f43684F.m66790K();
                    }
                    feedStatusPageAct.m66753K2();
                }
                break;
            case 6:
                i4g0.m138520r("e_chatting_partner_signal", "p_state_explore");
                FeedModule.m61406H().mo31790kk(act());
                break;
            case 7:
                i4g0.m138520r("e_live_video_quickchat_button", "p_state_explore");
                FeedModule.m61407M().mo68458nf(act(), "source_second_floor_square");
                break;
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f43685F0 = new qn00(12);
        this.f43683E0 = new C11502c();
        this.f43682E.post(new Runnable() { // from class: l.f5i
            @Override // java.lang.Runnable
            public final void run() {
                this.f97226a.m66871q6();
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ void m66862g6(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m66863h6(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        this.f43703O0.mo149319a(act(), "p_meet_greet", null, this.f43705P0);
        i4g0.m138520r("e_set_dynamic", "p_meet_dynamic_pop");
        l94.m153309e().m153318j();
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ void m66864i6(View view) {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66789J();
        }
        i4g0.m138520r("e_meet_dynamic_pop_cancel", "p_meet_dynamic_pop");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (ViewGroup) m66878x5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ void m66865j6() {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66790K();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ void m66866k6(View view) {
        i4g0.m138523u("e_set_my_state", "p_meet_state_pop", pf60.m172085a("source_page", "p_meet_state_pop"));
        if (NullChecker.m82486a(FeedModule.f39704e.f138458H) && NullChecker.m82486a(FeedModule.f39704e.f138458H.m222761e()) && TEnum.equals(FeedModule.f39704e.f138458H.m222761e().status, "start")) {
            r1j0.m179420g("状态发布中...");
        } else {
            h3i.m133488f(act(), "p_meet_greet");
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ void m66867m6() {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66790K();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ void m66868n6(String str) {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66790K();
        }
        FeedModule.m61406H().mo31780ja().put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ void m66869o6(String str) {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66789J();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m66870p6() {
        this.f43701N0 = true;
        if (!TextUtils.isEmpty(this.f43698M)) {
            duringCreated(FeedModule.f39703d.m145646Y7(this.f43698M, this.f43683E0)).subscribe(psd0.m173597H(new y20() { // from class: l.n5i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140366a.m66859d6((Envelope) obj);
                }
            }, new y20() { // from class: l.o5i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145086a.m66860e6((Throwable) obj);
                }
            }));
        } else {
            this.f43702O.m66896M();
            this.f43701N0 = false;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q6 */
    public void m66871q6() {
        int measuredHeight = this.f43682E.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43684F.getLayoutParams();
        int i = 4;
        int iM175859d = (qa00.m175859d(131.0f) * 4) + (qa00.m175859d(16.0f) * 3) + qa00.m175859d(24.0f) + qa00.m175859d(24.0f);
        int i2 = 2;
        if (measuredHeight > iM175859d) {
            layoutParams.height = iM175859d;
        } else {
            layoutParams.height = ((qa00.m175859d(131.0f) * 3) + (this.f43710U * 2)) - qa00.m175859d(0.0f);
            i = 3;
        }
        if (measuredHeight < layoutParams.height) {
            if (layoutParams.height - measuredHeight < ((ViewGroup.MarginLayoutParams) this.f43690I.getLayoutParams()).bottomMargin + qa00.m175859d(5.0f)) {
                bnl0.m105537U(this.f43690I, 0);
                this.f43710U = qa00.m175859d(6.0f);
                layoutParams.height = ((qa00.m175859d(131.0f) * 3) + (this.f43710U * 2)) - qa00.m175859d(0.0f);
                i2 = i;
            } else {
                layoutParams.height = (qa00.m175859d(131.0f) * 2) + (this.f43710U * 3);
            }
        } else {
            i2 = i;
        }
        this.f43684F.setLayoutParams(layoutParams);
        this.f43700N = new C11500a();
        this.f43704P = new FeedCustomSGLayoutManager(i2, 0);
        this.f43704P.m66769f0(RemoteConfig.m80481x().m80517w("state_square_bubble_speed") * 0.2d);
        this.f43684F.setLayoutManager(this.f43704P);
        this.f43684F.setflingScale(3.0d);
        this.f43704P.m3514U(0);
        this.f43684F.addItemDecoration(m66843J5());
        C11506a c11506a = new C11506a(this, getContext(), this.f43696L, this.f43700N, new C11501b());
        this.f43702O = c11506a;
        this.f43684F.setAdapter(c11506a);
        this.f43684F.addOnScrollListener(this.f43693J0);
        List<C11505f> listM66840G5 = m66840G5();
        new ArrayList();
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("feed_state_square_bottom_view");
            if (!TextUtils.isEmpty(strM80485F)) {
                List<FeedStateSquareBottomViewParams> list = JsonParseHelper.parseList(strM80485F, FeedStateSquareBottomViewParams.JSON_ADAPTER);
                User userMe_ = FeedModule.m61406H().me_();
                if (userMe_ == null || userMe_.isFemale()) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (list.get(i3).viewType == 3) {
                            list.remove(i3);
                            break;
                        }
                    }
                }
                List<C11505f> listM66872r6 = m66872r6(list, listM66840G5);
                this.f43692J.setLayoutManager(new LinearLayoutManager(act(), 0, false));
                C11507b c11507b = new C11507b(act(), listM66872r6, new y20() { // from class: l.i5i
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f113073a.m66861f6((Integer) obj);
                    }
                });
                this.f43692J.setAdapter(c11507b);
                c11507b.notifyDataSetChanged();
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        m66792K5(false);
    }

    /* JADX INFO: renamed from: r6 */
    public final List<C11505f> m66872r6(List<FeedStateSquareBottomViewParams> list, List<C11505f> list2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            final FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = list.get(i);
            C11505f c11505f = (C11505f) jyb.m147529r(list2, new qcj() { // from class: l.k5i
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(feedStateSquareBottomViewParams.name, ((FeedStatusSquareTabFrag.C11505f) obj).f43726b));
                }
            });
            if (NullChecker.m82486a(c11505f)) {
                arrayList.add(c11505f);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s6 */
    public void m66873s6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            r1j0.m179420g("暂时没有遇到有趣的灵魂");
            return;
        }
        if (!TextUtils.equals(str, "moment")) {
            if (!TextUtils.equals(str, "state")) {
                r1j0.m179420g("暂时没有遇到有趣的灵魂");
                return;
            } else {
                BubbleInfo bubbleInfoM145829y7 = FeedModule.f39703d.m145829y7(str3);
                FeedModule.m61406H().mo31746aa(act(), bubbleInfoM145829y7.owner.f39651id, bubbleInfoM145829y7.f39578id, "p_meet_greet", "p_quickchat,chance", false, m66844L5(bubbleInfoM145829y7, this.f43685F0), "state");
                return;
            }
        }
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str2);
        if (TextUtils.isEmpty(str3)) {
            r1j0.m179420g("暂时没有遇到有趣的灵魂");
            return;
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(str3);
        if (userM145688e8 == null) {
            r1j0.m179420g("暂时没有遇到有趣的灵魂");
        } else {
            FeedModule.f39702c.m61908f3(act(), userM145688e8, momentM145813w7, "p_meet_greet", false);
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m66874t6(int i) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        if (i == 40351) {
            new th0.C20312a(act()).m191151j("今日偶遇次数已用尽，每日首次发布动态可获得 1 次新偶遇机会").m191159r("发动态").m191149h(false).m191156o(new View.OnClickListener() { // from class: l.c6i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79972a.m66863h6(view);
                }
            }).m191147f("取消").m191144c(new View.OnClickListener() { // from class: l.d6i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85328a.m66864i6(view);
                }
            }).m191142a().m191141g();
            l51.m152889I(this, new Runnable() { // from class: l.e6i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92279a.m66865j6();
                }
            }, 100L);
            w1e.m204402f(w1e.m204399c("p_meet_dynamic_pop", Dialog.class.getName()));
        }
        if (i == 40352) {
            new th0.C20312a(act()).m191151j("今日偶遇次数已用尽，分享心情状态可获得 1 次新偶遇机会").m191159r("发状态").m191149h(false).m191156o(new View.OnClickListener() { // from class: l.f6i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97402a.m66866k6(view);
                }
            }).m191147f("取消").m191144c(new View.OnClickListener() { // from class: l.g6i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102440a.m66822l6(view);
                }
            }).m191142a().m191141g();
            l51.m152889I(this, new Runnable() { // from class: l.h6i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108031a.m66867m6();
                }
            }, 100L);
            w1e.m204402f(w1e.m204399c("p_meet_state_pop", Dialog.class.getName()));
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m66875u6() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152777l();
    }

    /* JADX INFO: renamed from: v6 */
    public final void m66876v6() {
        if (act() == null || this.f43709T) {
            return;
        }
        m66877w6(act(), new y20() { // from class: l.j5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118441a.m66868n6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w6 */
    public void m66877w6(Act act, y20<String> y20Var) {
        StateGuide stateGuide;
        String str = owi.f149489h.get();
        if (TextUtils.isEmpty(str) || (stateGuide = (StateGuide) JSON.parseObject(str, StateGuide.class)) == null || stateGuide.configs.size() == 0 || FeedModule.m61406H().mo31693Gn()) {
            return;
        }
        this.f43709T = true;
        zzg.m222256h(act, stateGuide.configs.get(0).title, "state_explore", stateGuide.configs.get(0).defaultEmotionIndex, y20Var, new y20() { // from class: l.l5i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130121a.m66869o6((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public View m66878x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i6i.m138823b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x6 */
    public void m66879x6() {
        if (NullChecker.m82486a(this.f43684F)) {
            this.f43684F.m66789J();
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m66880z5() {
        this.f43695K0 = null;
        this.f43698M = null;
        m66792K5(true);
    }
}
