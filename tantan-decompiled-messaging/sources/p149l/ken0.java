package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class ken0 implements s7m<hen0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f122724a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f122725b;

    /* JADX INFO: renamed from: c */
    public VLinear f122726c;

    /* JADX INFO: renamed from: d */
    public ImageView f122727d;

    /* JADX INFO: renamed from: e */
    public TextView f122728e;

    /* JADX INFO: renamed from: f */
    public hen0 f122729f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f122730g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f122731h;

    /* JADX INFO: renamed from: i */
    public HashSet<Integer> f122732i = new HashSet<>();

    /* JADX INFO: renamed from: l.ken0$a */
    public class C17996a extends RecyclerView.AbstractC0576n {
        public C17996a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            rect.bottom = t100.m186890d(8.0f);
        }
    }

    /* JADX INFO: renamed from: l.ken0$b */
    public class C17997b extends RecyclerView.AbstractC0582t {
        public C17997b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                ken0.this.m145802k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m145797i(View view) {
        this.f122729f.m130660f0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m145798d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return len0.m149593b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hen0 hen0Var) {
        this.f122729f = hen0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m145800f() {
        this.f122724a.setTitle("喜欢的聊天室");
        this.f122724a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ien0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112816a.m145797i(view);
            }
        });
        this.f122725b.addItemDecoration(new C17996a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f122725b.getContext(), 1, false);
        this.f122731h = linearLayoutManager;
        this.f122725b.setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f122730g = liveBaseAdapter;
        this.f122725b.setAdapter(liveBaseAdapter);
        this.f122725b.addOnScrollListener(new C17997b());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m145798d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m145801j(List<VirtualVoiceGroupConversationCell> list) {
        boolean zM200296J = vwb.m200296J(list);
        VLinear vLinear = this.f122726c;
        if (zM200296J) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f122725b, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f122725b, true);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new den0(i, list.get(i)));
            }
            this.f122730g.m67371Z(arrayList);
        }
        e51.m114742G(new Runnable() { // from class: l.jen0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117589a.m145802k();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m145802k() {
        int iFindFirstCompletelyVisibleItemPosition = this.f122731h.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = this.f122731h.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition < 0 || iFindLastCompletelyVisibleItemPosition < 0) {
            return;
        }
        while (iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
            if (!this.f122732i.contains(Integer.valueOf(iFindFirstCompletelyVisibleItemPosition))) {
                this.f122732i.add(Integer.valueOf(iFindFirstCompletelyVisibleItemPosition));
                den0 den0Var = (den0) this.f122730g.m67355J().get(iFindFirstCompletelyVisibleItemPosition);
                zvf0.m220399u("e_live_audio_room_enter", ycu.f197489g, vwb.m200311Y("anchorId", den0Var.m111385H().roomInfo.anchorId), vwb.m200311Y("roomId", den0Var.m111385H().roomInfo.roomId), vwb.m200311Y("liveId", den0Var.m111385H().roomInfo.liveId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(den0Var.m111386I())), vwb.m200311Y("audio_card_type", "liked_audio_room"), vwb.m200311Y("liveStatus", den0Var.m111385H().roomInfo.isLiving ? "onLive" : "endLive"));
            }
            iFindFirstCompletelyVisibleItemPosition++;
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
