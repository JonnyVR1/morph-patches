package com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.ffw;
import p149l.g6n0;
import p149l.hqs;
import p149l.l9s;
import p149l.nqs;
import p149l.rjn0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveGroupChatFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public LiveMaxHeightRecyclerView f46535A;

    /* JADX INFO: renamed from: B */
    public ConstraintLayout f46536B;

    /* JADX INFO: renamed from: C */
    public VImage f46537C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f46538D;

    /* JADX INFO: renamed from: E */
    public VText f46539E;

    /* JADX INFO: renamed from: F */
    public String f46540F;

    /* JADX INFO: renamed from: G */
    public String f46541G;

    /* JADX INFO: renamed from: H */
    public StaggeredGridLayoutManager f46542H;

    /* JADX INFO: renamed from: I */
    public hqs f46543I;

    /* JADX INFO: renamed from: J */
    public boolean f46544J = true;

    /* JADX INFO: renamed from: K */
    public boolean f46545K = true;

    /* JADX INFO: renamed from: z */
    public FrameLayout f46546z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag$a */
    public class C12608a extends RecyclerView.AbstractC0576n {
        public C12608a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.C0593c)) {
                return;
            }
            StaggeredGridLayoutManager.C0593c c0593c = (StaggeredGridLayoutManager.C0593c) view.getLayoutParams();
            if (c0593c.m3575h()) {
                rect.top = 0;
                rect.left = 0;
                rect.right = 0;
            } else {
                float f = c0593c.m3574g() % 2 == 0 ? 0.0f : 4.5f;
                float f2 = c0593c.m3574g() % 2 != 0 ? 0.0f : 4.5f;
                rect.top = xdl0.m208407w(9.0f);
                rect.left = xdl0.m208407w(f);
                rect.right = xdl0.m208407w(f2);
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ Boolean m71152P4(String str, g6n0 g6n0Var) {
        List<BLiveVoiceRoomFeed> list;
        return (g6n0Var == null || (list = g6n0Var.f101294a) == null || list.size() <= 0) ? Boolean.TRUE : Boolean.valueOf(str.equals(g6n0Var.f101294a.get(0).extraInfo.sourceName));
    }

    /* JADX INFO: renamed from: T4 */
    private RecyclerView.AbstractC0576n m71153T4() {
        return new C12608a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m71154V4(View view) {
        l9s.m149076g().mo30843ze(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m71155W4(Boolean bool) {
        if (bool.booleanValue()) {
            this.f46545K = true;
            return;
        }
        this.f46545K = false;
        if (this.f46544J) {
            return;
        }
        xdl0.m208344M(this.f46535A, false);
        xdl0.m208344M(this.f46536B, true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: Q4 */
    public View m71156Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nqs.m160693b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public void m71157R4(final String str) {
        if (!RemoteConfig.m79298x().m79330s("feed_group_chat_room_switch")) {
            m71160X4();
            return;
        }
        C22306c c22306cFilter = duringCreated(LiveVoiceApi.getLiveListInTopicInFeed(str, "0", -1L, 0, "", m71158S4(this.f46541G))).filter(new w9j() { // from class: l.kqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveGroupChatFrag.m71152P4(str, (g6n0) obj);
            }
        });
        e30 e30Var = new e30() { // from class: l.lqs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129376a.m71159U4((g6n0) obj);
            }
        };
        final rjn0 rjn0Var = rjn0.INSTANCE;
        Objects.requireNonNull(rjn0Var);
        c22306cFilter.subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.mqs
            @Override // p149l.e30
            public final void call(Object obj) {
                rjn0Var.m179657a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final String m71158S4(String str) {
        Map map;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("feed_group_keywords");
            if (TextUtils.isEmpty(strM79302F) || (map = (Map) JSON.parse(strM79302F)) == null) {
                return "";
            }
            for (String str2 : map.keySet()) {
                if (TextUtils.equals(str, str2)) {
                    List list = (List) map.get(str2);
                    if (!vwb.m200296J(list)) {
                        return (String) list.get(0);
                    }
                }
            }
            return "";
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m71159U4(g6n0 g6n0Var) {
        if (g6n0Var != null) {
            List<BLiveVoiceRoomFeed> list = g6n0Var.f101294a;
            if (list != null && list.size() == 0) {
                m71160X4();
            } else {
                this.f46544J = true;
                this.f46543I.m132511K(list);
            }
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final void m71160X4() {
        l9s.m149076g().mo30783k7().onNext(Boolean.TRUE);
        this.f46544J = false;
        if (this.f46545K) {
            return;
        }
        xdl0.m208344M(this.f46535A, false);
        xdl0.m208344M(this.f46536B, true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        xdl0.m208329E0(this.f46539E, new View.OnClickListener() { // from class: l.iqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114545a.m71154V4(view);
            }
        });
        this.f46540F = getArguments().getString("user_id");
        this.f46541G = getArguments().getString("groupId");
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.f46542H = staggeredGridLayoutManager;
        staggeredGridLayoutManager.m3513U(0);
        this.f46535A.setLayoutManager(this.f46542H);
        this.f46535A.addItemDecoration(m71153T4());
        this.f46535A.setItemAnimator(null);
        hqs hqsVar = new hqs(act(), l9s.m149076g().mo30702Kg(act(), getArguments().getString("group_name"), m71158S4(this.f46541G), new e30() { // from class: l.jqs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119323a.m71155W4((Boolean) obj);
            }
        }));
        this.f46543I = hqsVar;
        this.f46535A.setAdapter(hqsVar);
        xdl0.m208368c0(this.f46535A, t100.m186890d(156.0f));
        this.f46535A.setClipToPadding(false);
        m71157R4("group-related-room");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71156Q4(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
