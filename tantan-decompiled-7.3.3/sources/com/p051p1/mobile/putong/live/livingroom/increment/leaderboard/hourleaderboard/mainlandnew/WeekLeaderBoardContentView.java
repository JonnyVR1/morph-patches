package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.afu;
import p153l.awp0;
import p153l.bnl0;
import p153l.csq;
import p153l.gwp0;
import p153l.icr;
import p153l.kfd0;
import p153l.mdc0;
import p153l.o1j0;
import p153l.qhl;
import p153l.uhl;
import p153l.v24;
import p153l.v3f;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class WeekLeaderBoardContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RadioGroup f51583a;

    /* JADX INFO: renamed from: b */
    public RadioButton f51584b;

    /* JADX INFO: renamed from: c */
    public RadioButton f51585c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f51586d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f51587e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51588f;

    /* JADX INFO: renamed from: g */
    public WeekBoardMainlandItemView f51589g;

    /* JADX INFO: renamed from: h */
    public uhl f51590h;

    /* JADX INFO: renamed from: i */
    public awp0 f51591i;

    /* JADX INFO: renamed from: j */
    public qhl f51592j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView$a */
    public class C13024a implements uhl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qhl f51593a;

        public C13024a(qhl qhlVar) {
            this.f51593a = qhlVar;
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo76104C() {
            return this.f51593a.m213812H2();
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo76105D() {
            return this.f51593a.mo78457R2();
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: E */
        public void mo76106E(@NotNull String str, boolean z) {
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: F */
        public void mo76107F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            WeekLeaderBoardContentView.this.m76095d(bLiveHourLeaderBoardItem);
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: G */
        public void mo76108G() {
        }
    }

    public WeekLeaderBoardContentView(@NonNull Context context) {
        super(context);
        this.f51590h = null;
        this.f51591i = null;
    }

    /* JADX INFO: renamed from: c */
    public static WeekLeaderBoardContentView m76093c(LayoutInflater layoutInflater) {
        return (WeekLeaderBoardContentView) layoutInflater.inflate(yec0.f199288vb, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m76094b(View view) {
        gwp0.m132687a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v25, types: [l.oo2] */
    /* JADX INFO: renamed from: d */
    public final void m76095d(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97559h(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149414w("e_hoursboard").m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), this.f51592j.mo78457R2());
        boolean zM213815L2 = this.f51592j.m213815L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM213815L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
                return;
            } else {
                m76103l(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || this.f51592j.m213810E2().m202194o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m76103l(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) this.f51592j.m138856F3(new v24(4100, 1))).booleanValue()) {
                return;
            }
            this.f51592j.mo96836O3();
            this.f51592j.m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(this.f51592j.m213810E2().mo160117o0()).m74212r(this.f51592j.m213810E2().m202191k()).m74213s(this.f51592j.m213810E2().mo183435j().room.f45267id).m74211q(this.f51592j.m213810E2().m168532l0().name).m74216v(bLiveHourLeaderBoardItem.liveId).m74217w(bLiveHourLeaderBoardItem.roomId).m74215u("hour-leader-boards").m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m76096e(qhl qhlVar) {
        this.f51583a.check(mdc0.f136005N4);
        this.f51592j = qhlVar;
        C13024a c13024a = new C13024a(qhlVar);
        this.f51590h = c13024a;
        this.f51591i = new awp0(c13024a);
        this.f51587e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f51587e.setAdapter(this.f51591i);
    }

    /* JADX INFO: renamed from: f */
    public void m76097f() {
        awp0 awp0Var = this.f51591i;
        if (awp0Var == null) {
            return;
        }
        awp0Var.m100701R();
    }

    /* JADX INFO: renamed from: g */
    public void m76098g(boolean z) {
        this.f51591i.m100702S(z);
    }

    /* JADX INFO: renamed from: h */
    public void m76099h(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        bnl0.m105524M(this.f51587e, true);
        this.f51591i.m100704U(list);
    }

    /* JADX INFO: renamed from: i */
    public void m76100i(@NonNull List<BLiveCurrentHourNotices> list, boolean z) {
        this.f51591i.m100703T(list, z);
    }

    /* JADX INFO: renamed from: j */
    public void m76101j(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f51589g.setOnClickListener(null);
        this.f51589g.m76091n0(bLiveHourLeaderBoardItem, null, true);
    }

    /* JADX INFO: renamed from: k */
    public void m76102k() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f51587e.findViewWithTag(Integer.valueOf(mdc0.f135896B3));
        if (NullChecker.m82486a(hourBoardHeaderView)) {
            hourBoardHeaderView.m76031t0();
            awp0 awp0Var = this.f51591i;
            if (awp0Var == null) {
                return;
            }
            awp0Var.m100699I();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.oo2] */
    /* JADX INFO: renamed from: l */
    public final void m76103l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        v3f.C20736d<UserCardData, C22421c<UserCardData>> c20736dShow = this.f51592j.m213811F2().OpenUserCardDialogEvent.show();
        UserCardData.Builder source = UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live");
        qhl qhlVar = this.f51592j;
        UserCardData.Builder fromIdentity = source.setFromIdentity(csq.m112227a(qhlVar, qhlVar.m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100));
        qhl qhlVar2 = this.f51592j;
        c20736dShow.mo199273j(fromIdentity.setTo(csq.m112230d(qhlVar2, qhlVar2.m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76094b(this);
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51590h = null;
        this.f51591i = null;
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51590h = null;
        this.f51591i = null;
    }
}
