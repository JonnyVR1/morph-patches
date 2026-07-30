package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

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
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.bqq;
import p149l.cnp0;
import p149l.dfl;
import p149l.g5c0;
import p149l.gar;
import p149l.h7d0;
import p149l.lsi0;
import p149l.q2f;
import p149l.t6c0;
import p149l.w14;
import p149l.wmp0;
import p149l.xdl0;
import p149l.ypv;
import p149l.zcu;
import p149l.zel;

/* JADX INFO: loaded from: classes4.dex */
public class WeekLeaderBoardContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RadioGroup f50735a;

    /* JADX INFO: renamed from: b */
    public RadioButton f50736b;

    /* JADX INFO: renamed from: c */
    public RadioButton f50737c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f50738d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f50739e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f50740f;

    /* JADX INFO: renamed from: g */
    public WeekBoardMainlandItemView f50741g;

    /* JADX INFO: renamed from: h */
    public dfl f50742h;

    /* JADX INFO: renamed from: i */
    public wmp0 f50743i;

    /* JADX INFO: renamed from: j */
    public zel f50744j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView$a */
    public class C12861a implements dfl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zel f50745a;

        public C12861a(zel zelVar) {
            this.f50745a = zelVar;
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo74921C() {
            return this.f50745a.m206029H2();
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo74922D() {
            return this.f50745a.mo77274R2();
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: E */
        public void mo74923E(@NotNull String str, boolean z) {
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: F */
        public void mo74924F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            WeekLeaderBoardContentView.this.m74912d(bLiveHourLeaderBoardItem);
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: G */
        public void mo74925G() {
        }
    }

    public WeekLeaderBoardContentView(@NonNull Context context) {
        super(context);
        this.f50742h = null;
        this.f50743i = null;
    }

    /* JADX INFO: renamed from: c */
    public static WeekLeaderBoardContentView m74910c(LayoutInflater layoutInflater) {
        return (WeekLeaderBoardContentView) layoutInflater.inflate(t6c0.f168556vb, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m74911b(View view) {
        cnp0.m107821a(this, view);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v25, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public final void m74912d(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218093h(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129684w("e_hoursboard").m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), this.f50744j.mo77274R2());
        boolean zM206032L2 = this.f50744j.m206032L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM206032L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
                return;
            } else {
                m74920l(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || this.f50744j.m206027E2().m149818o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m74920l(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) this.f50744j.m129297F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            this.f50744j.mo94471O3();
            this.f50744j.m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(this.f50744j.m206027E2().mo132155o0()).m73029r(this.f50744j.m206027E2().m149814k()).m73030s(this.f50744j.m206027E2().mo149813j().room.f44419id).m73028q(this.f50744j.m206027E2().m132146l0().name).m73033v(bLiveHourLeaderBoardItem.liveId).m73034w(bLiveHourLeaderBoardItem.roomId).m73032u("hour-leader-boards").m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m74913e(zel zelVar) {
        this.f50735a.check(g5c0.f100760N4);
        this.f50744j = zelVar;
        C12861a c12861a = new C12861a(zelVar);
        this.f50742h = c12861a;
        this.f50743i = new wmp0(c12861a);
        this.f50739e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f50739e.setAdapter(this.f50743i);
    }

    /* JADX INFO: renamed from: f */
    public void m74914f() {
        wmp0 wmp0Var = this.f50743i;
        if (wmp0Var == null) {
            return;
        }
        wmp0Var.m204009R();
    }

    /* JADX INFO: renamed from: g */
    public void m74915g(boolean z) {
        this.f50743i.m204010S(z);
    }

    /* JADX INFO: renamed from: h */
    public void m74916h(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        xdl0.m208344M(this.f50739e, true);
        this.f50743i.m204012U(list);
    }

    /* JADX INFO: renamed from: i */
    public void m74917i(@NonNull List<BLiveCurrentHourNotices> list, boolean z) {
        this.f50743i.m204011T(list, z);
    }

    /* JADX INFO: renamed from: j */
    public void m74918j(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f50741g.setOnClickListener(null);
        this.f50741g.m74908n0(bLiveHourLeaderBoardItem, null, true);
    }

    /* JADX INFO: renamed from: k */
    public void m74919k() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f50739e.findViewWithTag(Integer.valueOf(g5c0.f100651B3));
        if (NullChecker.m81303a(hourBoardHeaderView)) {
            hourBoardHeaderView.m74848t0();
            wmp0 wmp0Var = this.f50743i;
            if (wmp0Var == null) {
                return;
            }
            wmp0Var.m204007I();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public final void m74920l(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        q2f.C19397d<UserCardData, C22306c<UserCardData>> c19397dShow = this.f50744j.m206028F2().OpenUserCardDialogEvent.show();
        UserCardData.Builder source = UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live");
        zel zelVar = this.f50744j;
        UserCardData.Builder fromIdentity = source.setFromIdentity(bqq.m103386a(zelVar, zelVar.m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100));
        zel zelVar2 = this.f50744j;
        c19397dShow.mo172463j(fromIdentity.setTo(bqq.m103389d(zelVar2, zelVar2.m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74911b(this);
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50742h = null;
        this.f50743i = null;
    }

    public WeekLeaderBoardContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50742h = null;
        this.f50743i = null;
    }
}
