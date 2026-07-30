package com.p000p1.mobile.putong.core.p004ui.statussquare;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p000p1.mobile.putong.core.p004ui.statussquare.CoreStatusSquareTabFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Bubbles;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.StateEmotion;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import l.ahf0;
import l.d30;
import l.e30;
import l.e51;
import l.ed50;
import l.gf3;
import l.hnc0;
import l.j760;
import l.lsi0;
import l.me50;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.oya;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p006l.u4c0;
import rx.subjects.b;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VPullDownRefreshLayout;
import v.VRelative;
import v.VText;
import v.smart_refresh.constant.RefreshState;
import v.smart_refresh.wrapper.RefreshFooterWrapper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: X */
    public static b<Boolean> f6136X = b.b();

    /* JADX INFO: renamed from: Y */
    public static String f6137Y = "语聊中";

    /* JADX INFO: renamed from: A */
    public VImage f6138A;

    /* JADX INFO: renamed from: B */
    public VImage f6139B;

    /* JADX INFO: renamed from: C */
    public VImage f6140C;

    /* JADX INFO: renamed from: D */
    public VPullDownRefreshLayout f6141D;

    /* JADX INFO: renamed from: E */
    public CoreStateSquareRecycleView f6142E;

    /* JADX INFO: renamed from: F */
    public VLinear f6143F;

    /* JADX INFO: renamed from: H */
    public VText f6145H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f6146I;

    /* JADX INFO: renamed from: J */
    public String f6147J;

    /* JADX INFO: renamed from: O */
    public BaseBubbleItemView f6152O;

    /* JADX INFO: renamed from: P */
    public String f6153P;

    /* JADX INFO: renamed from: T */
    public BubbleInfo f6157T;

    /* JADX INFO: renamed from: U */
    public SquareDataWrapper f6158U;

    /* JADX INFO: renamed from: z */
    public VRelative f6161z;

    /* JADX INFO: renamed from: G */
    public final long f6144G = 86400000;

    /* JADX INFO: renamed from: K */
    public final Queue<SquareDataWrapper> f6148K = new LinkedList();

    /* JADX INFO: renamed from: L */
    public final Queue<SquareDataWrapper> f6149L = new LinkedList();

    /* JADX INFO: renamed from: M */
    public Runnable f6150M = new RunnableC0330a();

    /* JADX INFO: renamed from: N */
    public boolean f6151N = false;

    /* JADX INFO: renamed from: Q */
    public int f6154Q = 0;

    /* JADX INFO: renamed from: R */
    public boolean f6155R = true;

    /* JADX INFO: renamed from: S */
    public int f6156S = 0;

    /* JADX INFO: renamed from: V */
    public int f6159V = 4;

    /* JADX INFO: renamed from: W */
    public int f6160W = 3;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$a */
    public class RunnableC0330a implements Runnable {
        public RunnableC0330a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreStatusSquareTabFrag.this.f6159V = 1;
            if (!NullChecker.a(CoreStatusSquareTabFrag.this.f6158U)) {
                CoreStatusSquareTabFrag coreStatusSquareTabFrag = CoreStatusSquareTabFrag.this;
                coreStatusSquareTabFrag.m9140P5(coreStatusSquareTabFrag.f6147J, true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(CoreStatusSquareTabFrag.this.f6158U);
            CoreStatusSquareTabFrag.this.f6142E.J(arrayList);
            if (TextUtils.isEmpty(CoreStatusSquareTabFrag.this.f6147J) && CoreStatusSquareTabFrag.this.f6148K.size() == 0) {
                if (NullChecker.a(CoreStatusSquareTabFrag.this.f6145H)) {
                    CoreStatusSquareTabFrag.this.f6145H.setText("无更多状态");
                }
                if (NullChecker.a(CoreStatusSquareTabFrag.this.f6146I)) {
                    xdl0.M(CoreStatusSquareTabFrag.this.f6146I, false);
                }
                CoreStatusSquareTabFrag.this.f6141D.G(false);
            }
            CoreStatusSquareTabFrag.this.f6141D.o();
            CoreStatusSquareTabFrag.this.f6158U = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$b */
    public class C0331b extends ahf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f6163a;

        public C0331b(View view) {
            this.f6163a = view;
        }

        /* JADX INFO: renamed from: f */
        public void m9156f(@NonNull @NotNull hnc0 hnc0Var, @NonNull @NotNull RefreshState refreshState, @NonNull @NotNull RefreshState refreshState2) {
            super.f(hnc0Var, refreshState, refreshState2);
            RefreshState refreshState3 = RefreshState.None;
            if (refreshState2 == refreshState3) {
                CoreStatusSquareTabFrag.this.f6151N = true;
                e51.J(CoreStatusSquareTabFrag.this.f6150M);
                e51.H(CoreStatusSquareTabFrag.this.act(), CoreStatusSquareTabFrag.this.f6150M, 2000L);
            }
            xdl0.M0(this.f6163a, refreshState2 != refreshState3);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$c */
    public class C0332c extends RecyclerView.t {
        public C0332c() {
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                CoreStatusSquareTabFrag.this.f6151N = false;
                e51.J(CoreStatusSquareTabFrag.this.f6150M);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m9096E4(c cVar) {
        if (cVar == c.i) {
            m9142R5();
            if (this.f6151N) {
                e51.J(this.f6150M);
                e51.H(act(), this.f6150M, 2000L);
            }
        }
        if (cVar == c.j) {
            m9145p5();
            e51.J(this.f6150M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F5 */
    public /* synthetic */ void m9097F5(j760 j760Var) {
        if (!((Boolean) j760Var.a).booleanValue()) {
            e51.J(this.f6150M);
        } else if (this.f6151N) {
            e51.J(this.f6150M);
            e51.H(act(), this.f6150M, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public /* synthetic */ void m9098G5(boolean z) {
        this.f6151N = true;
        e51.J(this.f6150M);
        e51.H(act(), this.f6150M, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H5 */
    public /* synthetic */ void m9099H5() {
        xdl0.M(this.f6143F, true);
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m9107T4(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static PutongFrag m9126n5(String str, BubbleInfo bubbleInfo, int i) {
        CoreStatusSquareTabFrag coreStatusSquareTabFrag = new CoreStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putInt("footRes", i);
        bundle.putString("from", str);
        coreStatusSquareTabFrag.setArguments(bundle);
        return coreStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: o5 */
    private boolean m9127o5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.o()) > 0.0d;
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m9128A5(Envelope envelope) {
        if (NullChecker.a(envelope)) {
            List list = envelope.data.getModuleData(CoreData.class).stateEmotion;
            if (vwb.J(list) || vwb.J(((StateEmotion) list.get(0)).emotions)) {
                this.f6155R = false;
            } else {
                if (!TextUtils.isEmpty(((StateEmotion) list.get(0)).categoryName)) {
                    f6137Y = ((StateEmotion) list.get(0)).categoryName;
                }
                this.f6155R = ((StateEmotion) list.get(0)).emotions.size() != 0;
                m9141Q5(((StateEmotion) list.get(0)).emotions);
            }
        } else {
            this.f6155R = false;
        }
        m9154y5();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m9129B5(Throwable th) {
        m9154y5();
        this.f6155R = false;
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m9130C5(Envelope envelope) {
        if (!NullChecker.a(envelope)) {
            xdl0.M(this.f6161z, false);
            xdl0.M(this.f6143F, true);
            this.f6141D.G(false);
            return;
        }
        List<BubbleInfo> list = envelope.data.getModuleData(CoreData.class).states;
        if (NullChecker.a(this.f6157T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.id, this.f6157T.id)) {
                    list.remove(bubbleInfo);
                    break;
                }
            }
            list.add(this.f6157T);
        }
        m9155z5(m9153x5(envelope, list), new e30() { // from class: l.eya
            public final void call(Object obj) {
                this.f11502a.m9132E5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m9131D5(Throwable th) {
        List<SquareDataWrapper> data = this.f6142E.getData();
        if (data == null || data.size() == 0) {
            xdl0.M(this.f6143F, true);
            this.f6141D.G(false);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m9132E5(List list) {
        this.f6142E.setDataList(list);
        int size = list.size();
        VRelative vRelative = this.f6161z;
        if (size == 0) {
            xdl0.M(vRelative, false);
            xdl0.M(this.f6143F, true);
            this.f6141D.G(false);
        } else {
            xdl0.M(vRelative, true);
        }
        if (TextUtils.isEmpty(this.f6147J)) {
            if (NullChecker.a(this.f6145H)) {
                this.f6145H.setText("无更多状态");
            }
            if (NullChecker.a(this.f6146I)) {
                xdl0.M(this.f6146I, false);
            }
            this.f6141D.o();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m9133I5(BaseBubbleItemView baseBubbleItemView) {
        SquareDataWrapper dataWrapper = baseBubbleItemView.getDataWrapper();
        if (dataWrapper.e == SquareDataWrapper.Type.momentChatRoom) {
            zvf0.u("e_live_audio_room_enter", "p_state_explore", new j760[]{j760.a("anchorId", dataWrapper.i.userId), j760.a("liveId", dataWrapper.i.liveId), j760.a("audio_card_type", "state_explore_bubble"), j760.a("topic_id", dataWrapper.i.topicId), j760.a("audio_room_label", ""), j760.a("voice_template", "")});
            zvf0.u("e_state", "p_state_explore", new j760[]{j760.a("e_state_type", "audio_room"), j760.a("refer_source", this.f6153P), j760.a("state_id", ""), j760.a("owner_id", dataWrapper.i.userId)});
            CoreModule.m1855Q().M6().e(act(), dataWrapper.i.liveId, "p_state_explore", "");
            baseBubbleItemView.f();
            return;
        }
        if (CoreModule.m1850H().userId().equals(((gf3) dataWrapper).a.owner.id)) {
            return;
        }
        zvf0.u("e_state", "p_state_explore", new j760[]{j760.a("e_state_type", "state"), j760.a("state_id", ((gf3) dataWrapper).a.id), j760.a("owner_id", ((gf3) dataWrapper).a.owner.id)});
        BubbleInfo bubbleInfo = ((gf3) dataWrapper).a;
        if (!m9127o5(bubbleInfo)) {
            lsi0.j("状态已结束");
            this.f6142E.P(dataWrapper, new d30() { // from class: l.kya
                public final void call() {
                    this.f16088a.m9099H5();
                }
            });
        } else {
            this.f6152O = baseBubbleItemView;
            d.a aVar = new d.a(bubbleInfo.owner.id, "p_state_explore");
            aVar.o("p_quickchat,state");
            d.a(act(), aVar);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m9134J5(Boolean bool) {
        if (NullChecker.a(this.f6152O)) {
            this.f6152O.f();
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m9135K5(hnc0 hnc0Var) {
        this.f6151N = false;
        e51.J(this.f6150M);
        this.f6159V = m9150u5();
        m9140P5(this.f6147J, false);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m9136L5(List list, e30 e30Var, Envelope envelope) {
        List list2 = envelope.data.getModuleData(CoreData.class).stateEmotion;
        if (vwb.J(list2) || vwb.J(((StateEmotion) list2.get(0)).emotions)) {
            this.f6155R = false;
        } else {
            this.f6155R = ((StateEmotion) list2.get(0)).emotions.size() != 0;
            m9141Q5(((StateEmotion) list2.get(0)).emotions);
        }
        m9155z5(list, e30Var);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m9137M5(List list, e30 e30Var, Throwable th) {
        this.f6155R = false;
        m9155z5(list, e30Var);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m9138N5(boolean z, List list) {
        if (z && list.size() == 2) {
            this.f6158U = (SquareDataWrapper) list.get(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add((SquareDataWrapper) list.get(0));
            this.f6142E.J(arrayList);
        } else {
            if (z) {
                this.f6158U = null;
            }
            this.f6142E.J(list);
            if (TextUtils.isEmpty(this.f6147J) && this.f6148K.size() == 0) {
                if (NullChecker.a(this.f6145H)) {
                    this.f6145H.setText("无更多状态");
                }
                if (NullChecker.a(this.f6146I)) {
                    xdl0.M(this.f6146I, false);
                }
                this.f6141D.G(false);
            }
        }
        this.f6141D.o();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m9139O5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = envelope.data.getModuleData(CoreData.class).states;
        if (NullChecker.a(this.f6157T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.id, this.f6157T.id)) {
                    list.remove(bubbleInfo);
                }
            }
        }
        this.f6148K.addAll(m9153x5(envelope, list));
        m9140P5(this.f6147J, z);
    }

    /* JADX INFO: renamed from: P5 */
    public void m9140P5(String str, final boolean z) {
        if (this.f6148K.size() >= this.f6159V || (this.f6148K.size() > 0 && TextUtils.isEmpty(str))) {
            m9155z5(m9148s5(), new e30() { // from class: l.lya
                public final void call(Object obj) {
                    this.f16710a.m9138N5(z, (List) obj);
                }
            });
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            duringCreated(CoreModule.m1853N().gk(str)).subscribe(mkd0.H(new e30() { // from class: l.mya
                public final void call(Object obj) {
                    this.f17367a.m9139O5(z, (Envelope) obj);
                }
            }, new e30() { // from class: l.nya
                public final void call(Object obj) {
                    CoreStatusSquareTabFrag.m9107T4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m9141Q5(List<Emotion> list) {
        if (vwb.J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            squareDataWrapper.i = list.get(i);
            squareDataWrapper.e = SquareDataWrapper.Type.momentChatRoom;
            arrayList.add(squareDataWrapper);
        }
        this.f6149L.addAll(arrayList);
    }

    /* JADX INFO: renamed from: R5 */
    public void m9142R5() {
        this.pageHelper.q(pageId());
        this.pageHelper.l();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        duringCreated(lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.xxa
            public final void call(Object obj) {
                this.f27774a.m9096E4((c) obj);
            }
        }));
        duringCreated(CoreModule.m1853N().H7()).subscribe(mkd0.G(new e30() { // from class: l.fya
            public final void call(Object obj) {
                this.f12972a.m9097F5((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m9143g4(Bundle bundle) {
        super.g4(bundle);
        this.f6160W = m9149t5();
        String string = getArguments() == null ? "" : getArguments().getString("from");
        this.f6153P = string;
        this.f6142E.setReferSource(string);
        this.f6142E.setFrom("p_state_explore");
        this.f6142E.setBottomListener(new ed50() { // from class: l.gya
            /* JADX INFO: renamed from: a */
            public final void m16021a(boolean z) {
                this.f13586a.m9098G5(z);
            }
        });
        this.f6142E.setClickListener(new e30() { // from class: l.hya
            public final void call(Object obj) {
                this.f14130a.m9133I5((BaseBubbleItemView) obj);
            }
        });
        duringCreated(f6136X).subscribe(mkd0.G(new e30() { // from class: l.iya
            public final void call(Object obj) {
                this.f14876a.m9134J5((Boolean) obj);
            }
        }));
        this.f6141D.M(new me50() { // from class: l.jya
            /* JADX INFO: renamed from: a */
            public final void m17847a(hnc0 hnc0Var) {
                this.f15489a.m9135K5(hnc0Var);
            }
        });
        View viewInflate = o7r.a(act()).inflate(getArguments().getInt("footRes"), (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f22830Va);
        this.f6145H = m9152w5(linearLayout);
        this.f6146I = m9151v5(linearLayout);
        if (NullChecker.a(this.f6145H)) {
            this.f6145H.setText("正在加载更多状态...");
        }
        this.f6141D.Q(new RefreshFooterWrapper(viewInflate));
        xdl0.M0(viewInflate, false);
        this.f6141D.N(new C0331b(viewInflate));
        this.f6142E.addOnScrollListener(new C0332c());
        m9147r5();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9144m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m9144m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oya.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p5 */
    public void m9145p5() {
        this.pageHelper.q(pageId());
        this.pageHelper.k();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q5 */
    public String m9146q5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!CoreModule.m1853N().Sd().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    /* JADX INFO: renamed from: r5 */
    public final void m9147r5() {
        this.f6157T = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(CoreModule.f1534c.f3665q1.m5203u3()).subscribe(mkd0.H(new e30() { // from class: l.yxa
            public final void call(Object obj) {
                this.f28471a.m9128A5((Envelope) obj);
            }
        }, new e30() { // from class: l.zxa
            public final void call(Object obj) {
                this.f29021a.m9129B5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s5 */
    public final List<SquareDataWrapper> m9148s5() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f6159V; i++) {
            arrayList.add(this.f6148K.poll());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t5 */
    public int m9149t5() {
        try {
            String strF = RemoteConfig.x().F("moment_post_status_config");
            if (!TextUtils.isEmpty(strF)) {
                int i = new JSONObject(strF).getInt("insertCount");
                this.f6160W = i;
                if (i == 0) {
                    this.f6160W = 3;
                }
            }
        } catch (Exception unused) {
        }
        return this.f6160W;
    }

    /* JADX INFO: renamed from: u5 */
    public int m9150u5() {
        try {
            String strF = RemoteConfig.x().F("moment_post_status_config");
            if (TextUtils.isEmpty(strF)) {
                return 4;
            }
            return new JSONObject(strF).getInt("stateSquareLimit");
        } catch (Exception unused) {
            return 4;
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final VProgressBar m9151v5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            VProgressBar childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VProgressBar) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public VText m9152w5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            VText childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VText) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x5 */
    public final List<SquareDataWrapper> m9153x5(Envelope envelope, List<BubbleInfo> list) {
        this.f6147J = envelope.pagination.links.next;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            BubbleInfo bubbleInfo = list.get(i);
            bubbleInfo.value = m9146q5(bubbleInfo);
            Bubbles bubbles = new Bubbles();
            bubbles.userID = bubbleInfo.owner.id;
            User userById = CoreModule.m1853N().getUserById(bubbleInfo.owner.id);
            bubbles.photoURL = userById == null ? "" : userById.fp().profileSmall().formatted();
            squareDataWrapper.f = bubbles;
            ((gf3) squareDataWrapper).a = bubbleInfo;
            arrayList.add(squareDataWrapper);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y5 */
    public void m9154y5() {
        duringCreated(CoreModule.m1853N().gk(this.f6147J)).subscribe(mkd0.H(new e30() { // from class: l.aya
            public final void call(Object obj) {
                this.f8596a.m9130C5((Envelope) obj);
            }
        }, new e30() { // from class: l.bya
            public final void call(Object obj) {
                this.f9224a.m9131D5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z5 */
    public final void m9155z5(final List<SquareDataWrapper> list, final e30<List<SquareDataWrapper>> e30Var) {
        int i;
        if (vwb.J(list)) {
            e30Var.call(new ArrayList());
            return;
        }
        int size = list.size();
        int i2 = this.f6160W;
        if (((size - (i2 - this.f6154Q)) / i2) + 1 > this.f6149L.size() && this.f6155R) {
            duringCreated(CoreModule.f1534c.f3665q1.m5203u3()).subscribe(mkd0.H(new e30() { // from class: l.cya
                public final void call(Object obj) {
                    this.f9915a.m9136L5(list, e30Var, (Envelope) obj);
                }
            }, new e30() { // from class: l.dya
                public final void call(Object obj) {
                    this.f10649a.m9137M5(list, e30Var, (Throwable) obj);
                }
            }));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            int size2 = list.size();
            i = this.f6156S;
            if (i3 >= size2) {
                break;
            }
            this.f6156S = i + 1;
            arrayList2.add(list.get(i3));
            if (arrayList2.size() == this.f6160W - this.f6154Q) {
                if (this.f6149L.size() > 0) {
                    int iNextInt = new Random().nextInt(this.f6160W);
                    if (iNextInt == 0) {
                        iNextInt = 1;
                    }
                    if (this.f6154Q != 0) {
                        iNextInt = 0;
                    }
                    arrayList2.add(iNextInt, this.f6149L.poll());
                }
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                this.f6154Q = 0;
                this.f6156S = 0;
            }
            i3++;
        }
        this.f6154Q = i;
        if (arrayList2.size() != 0) {
            arrayList.addAll(arrayList2);
        }
        e30Var.call(arrayList);
    }
}
