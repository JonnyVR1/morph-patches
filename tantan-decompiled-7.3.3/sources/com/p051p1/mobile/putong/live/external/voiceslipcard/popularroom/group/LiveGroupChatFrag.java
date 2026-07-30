package com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.iss;
import p153l.jyb;
import p153l.kfn0;
import p153l.mbs;
import p153l.oss;
import p153l.qa00;
import p153l.qcj;
import p153l.vsn0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveGroupChatFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public LiveMaxHeightRecyclerView f47383A;

    /* JADX INFO: renamed from: B */
    public ConstraintLayout f47384B;

    /* JADX INFO: renamed from: C */
    public VImage f47385C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f47386D;

    /* JADX INFO: renamed from: E */
    public VText f47387E;

    /* JADX INFO: renamed from: F */
    public String f47388F;

    /* JADX INFO: renamed from: G */
    public String f47389G;

    /* JADX INFO: renamed from: H */
    public StaggeredGridLayoutManager f47390H;

    /* JADX INFO: renamed from: I */
    public iss f47391I;

    /* JADX INFO: renamed from: J */
    public boolean f47392J = true;

    /* JADX INFO: renamed from: K */
    public boolean f47393K = true;

    /* JADX INFO: renamed from: z */
    public FrameLayout f47394z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag$a */
    public class C12771a extends RecyclerView.AbstractC0578n {
        public C12771a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.C0595c)) {
                return;
            }
            StaggeredGridLayoutManager.C0595c c0595c = (StaggeredGridLayoutManager.C0595c) view.getLayoutParams();
            if (c0595c.m3576h()) {
                rect.top = 0;
                rect.left = 0;
                rect.right = 0;
            } else {
                float f = c0595c.m3575g() % 2 == 0 ? 0.0f : 4.5f;
                float f2 = c0595c.m3575g() % 2 != 0 ? 0.0f : 4.5f;
                rect.top = bnl0.m105587w(9.0f);
                rect.left = bnl0.m105587w(f);
                rect.right = bnl0.m105587w(f2);
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ Boolean m72335P4(String str, kfn0 kfn0Var) {
        List<BLiveVoiceRoomFeed> list;
        return (kfn0Var == null || (list = kfn0Var.f126460a) == null || list.size() <= 0) ? Boolean.TRUE : Boolean.valueOf(str.equals(kfn0Var.f126460a.get(0).extraInfo.sourceName));
    }

    /* JADX INFO: renamed from: T4 */
    private RecyclerView.AbstractC0578n m72336T4() {
        return new C12771a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m72337V4(View view) {
        mbs.m157853g().mo31846ze(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m72338W4(Boolean bool) {
        if (bool.booleanValue()) {
            this.f47393K = true;
            return;
        }
        this.f47393K = false;
        if (this.f47392J) {
            return;
        }
        bnl0.m105524M(this.f47383A, false);
        bnl0.m105524M(this.f47384B, true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: Q4 */
    public View m72339Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oss.m169061b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public void m72340R4(final String str) {
        if (!RemoteConfig.m80481x().m80513s("feed_group_chat_room_switch")) {
            m72343X4();
            return;
        }
        C22421c c22421cFilter = duringCreated(LiveVoiceApi.getLiveListInTopicInFeed(str, "0", -1L, 0, "", m72341S4(this.f47389G))).filter(new qcj() { // from class: l.lss
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveGroupChatFrag.m72335P4(str, (kfn0) obj);
            }
        });
        y20 y20Var = new y20() { // from class: l.mss
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138521a.m72342U4((kfn0) obj);
            }
        };
        final vsn0 vsn0Var = vsn0.INSTANCE;
        Objects.requireNonNull(vsn0Var);
        c22421cFilter.subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.nss
            @Override // p153l.y20
            public final void call(Object obj) {
                vsn0Var.m202641a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final String m72341S4(String str) {
        Map map;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("feed_group_keywords");
            if (TextUtils.isEmpty(strM80485F) || (map = (Map) JSON.parse(strM80485F)) == null) {
                return "";
            }
            for (String str2 : map.keySet()) {
                if (TextUtils.equals(str, str2)) {
                    List list = (List) map.get(str2);
                    if (!jyb.m147479J(list)) {
                        return (String) list.get(0);
                    }
                }
            }
            return "";
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m72342U4(kfn0 kfn0Var) {
        if (kfn0Var != null) {
            List<BLiveVoiceRoomFeed> list = kfn0Var.f126460a;
            if (list != null && list.size() == 0) {
                m72343X4();
            } else {
                this.f47392J = true;
                this.f47391I.m141896K(list);
            }
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final void m72343X4() {
        mbs.m157853g().mo31786k7().onNext(Boolean.TRUE);
        this.f47392J = false;
        if (this.f47393K) {
            return;
        }
        bnl0.m105524M(this.f47383A, false);
        bnl0.m105524M(this.f47384B, true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        bnl0.m105509E0(this.f47387E, new View.OnClickListener() { // from class: l.jss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122527a.m72337V4(view);
            }
        });
        this.f47388F = getArguments().getString("user_id");
        this.f47389G = getArguments().getString("groupId");
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.f47390H = staggeredGridLayoutManager;
        staggeredGridLayoutManager.m3514U(0);
        this.f47383A.setLayoutManager(this.f47390H);
        this.f47383A.addItemDecoration(m72336T4());
        this.f47383A.setItemAnimator(null);
        iss issVar = new iss(act(), mbs.m157853g().mo31705Kg(act(), getArguments().getString("group_name"), m72341S4(this.f47389G), new y20() { // from class: l.kss
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128601a.m72338W4((Boolean) obj);
            }
        }));
        this.f47391I = issVar;
        this.f47383A.setAdapter(issVar);
        bnl0.m105548c0(this.f47383A, qa00.m175859d(156.0f));
        this.f47383A.setClipToPadding(false);
        m72340R4("group-related-room");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m72339Q4(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
