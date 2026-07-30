package p153l;

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
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class onn0 implements iam<lnn0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f148099a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f148100b;

    /* JADX INFO: renamed from: c */
    public VLinear f148101c;

    /* JADX INFO: renamed from: d */
    public ImageView f148102d;

    /* JADX INFO: renamed from: e */
    public TextView f148103e;

    /* JADX INFO: renamed from: f */
    public lnn0 f148104f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f148105g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f148106h;

    /* JADX INFO: renamed from: i */
    public HashSet<Integer> f148107i = new HashSet<>();

    /* JADX INFO: renamed from: l.onn0$a */
    public class C19169a extends RecyclerView.AbstractC0578n {
        public C19169a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            rect.bottom = qa00.m175859d(8.0f);
        }
    }

    /* JADX INFO: renamed from: l.onn0$b */
    public class C19170b extends RecyclerView.AbstractC0584t {
        public C19170b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                onn0.this.m168343k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m168338i(View view) {
        this.f148104f.m154989f0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m168339d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pnn0.m173074b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lnn0 lnn0Var) {
        this.f148104f = lnn0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m168341f() {
        this.f148099a.setTitle("喜欢的聊天室");
        this.f148099a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.mnn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137716a.m168338i(view);
            }
        });
        this.f148100b.addItemDecoration(new C19169a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f148100b.getContext(), 1, false);
        this.f148106h = linearLayoutManager;
        this.f148100b.setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f148105g = liveBaseAdapter;
        this.f148100b.setAdapter(liveBaseAdapter);
        this.f148100b.addOnScrollListener(new C19170b());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m168339d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m168342j(List<VirtualVoiceGroupConversationCell> list) {
        boolean zM147479J = jyb.m147479J(list);
        VLinear vLinear = this.f148101c;
        if (zM147479J) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f148100b, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f148100b, true);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new hnn0(i, list.get(i)));
            }
            this.f148105g.m68554Z(arrayList);
        }
        l51.m152887G(new Runnable() { // from class: l.nnn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142811a.m168343k();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m168343k() {
        int iFindFirstCompletelyVisibleItemPosition = this.f148106h.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = this.f148106h.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition < 0 || iFindLastCompletelyVisibleItemPosition < 0) {
            return;
        }
        while (iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
            if (!this.f148107i.contains(Integer.valueOf(iFindFirstCompletelyVisibleItemPosition))) {
                this.f148107i.add(Integer.valueOf(iFindFirstCompletelyVisibleItemPosition));
                hnn0 hnn0Var = (hnn0) this.f148105g.m68538J().get(iFindFirstCompletelyVisibleItemPosition);
                i4g0.m138523u("e_live_audio_room_enter", zeu.f204080g, jyb.m147494Y("anchorId", hnn0Var.m136264H().roomInfo.anchorId), jyb.m147494Y("roomId", hnn0Var.m136264H().roomInfo.roomId), jyb.m147494Y("liveId", hnn0Var.m136264H().roomInfo.liveId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(hnn0Var.m136265I())), jyb.m147494Y("audio_card_type", "liked_audio_room"), jyb.m147494Y("liveStatus", hnn0Var.m136264H().roomInfo.isLiving ? "onLive" : "endLive"));
            }
            iFindFirstCompletelyVisibleItemPosition++;
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
