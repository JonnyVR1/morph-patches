package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.h7d0;
import l.lsi0;
import l.q2f;
import l.w14;
import l.xdl0;
import l.ypv;
import l.zcu;
import org.jetbrains.annotations.NotNull;
import p002l.bqq;
import p002l.cnp0;
import p002l.dfl;
import p002l.g5c0;
import p002l.gar;
import p002l.t6c0;
import p002l.wmp0;
import p002l.zel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class WeekLeaderBoardContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RadioGroup f6777a;

    /* JADX INFO: renamed from: b */
    public RadioButton f6778b;

    /* JADX INFO: renamed from: c */
    public RadioButton f6779c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f6780d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f6781e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f6782f;

    /* JADX INFO: renamed from: g */
    public WeekBoardMainlandItemView f6783g;

    /* JADX INFO: renamed from: h */
    public dfl f6784h;

    /* JADX INFO: renamed from: i */
    public wmp0 f6785i;

    /* JADX INFO: renamed from: j */
    public zel f6786j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView$a */
    public class C0450a implements dfl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zel f6787a;

        public C0450a(zel zelVar) {
            this.f6787a = zelVar;
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo8523C() {
            return this.f6787a.m25549H2();
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo8524D() {
            return this.f6787a.mo21430R2();
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: E */
        public void mo8525E(@NotNull String str, boolean z) {
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: F */
        public void mo8526F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            WeekLeaderBoardContentView.this.m8514d(bLiveHourLeaderBoardItem);
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: G */
        public void mo8527G() {
        }
    }

    public WeekLeaderBoardContentView(@NonNull Context context) {
        super(context);
        this.f6784h = null;
        this.f6785i = null;
    }

    /* JADX INFO: renamed from: c */
    public static WeekLeaderBoardContentView m8512c(LayoutInflater layoutInflater) {
        return (WeekLeaderBoardContentView) layoutInflater.inflate(t6c0.f20052vb, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m8513b(View view) {
        cnp0.m11131a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v25, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public final void m8514d(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.h(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).m(String.valueOf(bLiveHourLeaderBoardItem.rank)).w("e_hoursboard").t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), this.f6786j.mo21430R2());
        boolean zM25552L2 = this.f6786j.m25552L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM25552L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.y(ypv.e.getString(R$string.f2841L0));
                return;
            } else {
                m8522l(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || this.f6786j.m25547E2().m17239o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m8522l(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) this.f6786j.m14184F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            this.f6786j.mo9256O3();
            this.f6786j.m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(this.f6786j.m25547E2().mo14591o0()).m6552r(this.f6786j.m25547E2().m17235k()).m6553s(this.f6786j.m25547E2().m17234j().room.id).m6551q(this.f6786j.m25547E2().m14582l0().name).m6556v(bLiveHourLeaderBoardItem.liveId).m6557w(bLiveHourLeaderBoardItem.roomId).m6555u("hour-leader-boards").m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8515e(zel zelVar) {
        this.f6777a.check(g5c0.f10910N4);
        this.f6786j = zelVar;
        C0450a c0450a = new C0450a(zelVar);
        this.f6784h = c0450a;
        this.f6785i = new wmp0(c0450a);
        this.f6781e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f6781e.setAdapter(this.f6785i);
    }

    /* JADX INFO: renamed from: f */
    public void m8516f() {
        wmp0 wmp0Var = this.f6785i;
        if (wmp0Var == null) {
            return;
        }
        wmp0Var.m24711R();
    }

    /* JADX INFO: renamed from: g */
    public void m8517g(boolean z) {
        this.f6785i.m24712S(z);
    }

    /* JADX INFO: renamed from: h */
    public void m8518h(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        xdl0.M(this.f6781e, true);
        this.f6785i.m24714U(list);
    }

    /* JADX INFO: renamed from: i */
    public void m8519i(@NonNull List<BLiveCurrentHourNotices> list, boolean z) {
        this.f6785i.m24713T(list, z);
    }

    /* JADX INFO: renamed from: j */
    public void m8520j(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f6783g.setOnClickListener(null);
        this.f6783g.m8510n0(bLiveHourLeaderBoardItem, null, true);
    }

    /* JADX INFO: renamed from: k */
    public void m8521k() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f6781e.findViewWithTag(Integer.valueOf(g5c0.f10801B3));
        if (NullChecker.a(hourBoardHeaderView)) {
            hourBoardHeaderView.m8448t0();
            wmp0 wmp0Var = this.f6785i;
            if (wmp0Var == null) {
                return;
            }
            wmp0Var.m24709I();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public final void m8522l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        q2f.d dVarShow = this.f6786j.m25548F2().OpenUserCardDialogEvent.show();
        UserCardData.Builder source = UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live");
        zel zelVar = this.f6786j;
        UserCardData.Builder fromIdentity = source.setFromIdentity(bqq.m10554a(zelVar, ((DbObject) zelVar.m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100));
        zel zelVar2 = this.f6786j;
        dVarShow.j(fromIdentity.setTo(bqq.m10557d(zelVar2, ((DbObject) zelVar2.m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8513b(this);
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6784h = null;
        this.f6785i = null;
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6784h = null;
        this.f6785i = null;
    }
}
