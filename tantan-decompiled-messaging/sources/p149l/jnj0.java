package p149l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class jnj0 extends ari0<inj0> implements f8m {

    /* JADX INFO: renamed from: i */
    public VRelative f118857i;

    /* JADX INFO: renamed from: j */
    public VText f118858j;

    /* JADX INFO: renamed from: k */
    public VText f118859k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f118860l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f118861m;

    /* JADX INFO: renamed from: n */
    public bep0 f118862n;

    /* JADX INFO: renamed from: o */
    public bep0 f118863o;

    /* JADX INFO: renamed from: p */
    public String f118864p;

    /* JADX INFO: renamed from: q */
    public RecyclerView.AbstractC0576n f118865q;

    /* JADX INFO: renamed from: r */
    public List<BLiveUndercoverCurrentPlayer> f118866r;

    /* JADX INFO: renamed from: l.jnj0$a */
    public class C17825a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f118867a;

        public C17825a(int i) {
            this.f118867a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int i = this.f118867a;
            rect.left = i / 2;
            rect.right = i / 2;
        }
    }

    public jnj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m142377r() {
        this.f118862n = new bep0(this, true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f118860l.setLayoutManager(linearLayoutManager);
        this.f118860l.setAdapter(this.f118862n);
        this.f118863o = new bep0(this, false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.setOrientation(0);
        this.f118861m.setLayoutManager(linearLayoutManager2);
        this.f118861m.setAdapter(this.f118863o);
    }

    @Override // p149l.f8m
    /* JADX INFO: renamed from: a */
    public void mo120025a(String str, String str2) {
        List<BLiveUndercoverCurrentPlayer> list;
        if (this.f134450c == 0 || (list = this.f118866r) == null) {
            return;
        }
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : list) {
            if (TextUtils.equals(bLiveUndercoverCurrentPlayer.userId, ypv.f199493a.m199309D0()) && !TextUtils.equals(bLiveUndercoverCurrentPlayer.role, "out")) {
                ((inj0) this.f134450c).m137146R3(this.f118864p, str, str2);
                return;
            }
        }
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m142378y(this.f134449b);
        m142377r();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168473p6;
    }

    @Override // p149l.s7m
    public void destroy() {
        m98403p();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100709H7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "voting")) {
            List<BLiveUndercoverCurrentPlayer> list2 = bLiveUndercoverGame.currentPlayers;
            this.f118866r = list2;
            this.f118864p = bLiveUndercoverGame.f44464id;
            boolean z = false;
            for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : list2) {
                if (TextUtils.equals(bLiveUndercoverCurrentPlayer.userId, ypv.f199493a.m199309D0()) && !TextUtils.equals(bLiveUndercoverCurrentPlayer.role, "out")) {
                    z = true;
                }
            }
            this.f118859k.setText(z ? R$string.f46832Mc : R$string.f46853Nc);
            RecyclerView.AbstractC0576n abstractC0576n = this.f118865q;
            if (abstractC0576n != null) {
                this.f118860l.removeItemDecoration(abstractC0576n);
                this.f118861m.removeItemDecoration(this.f118865q);
            }
            int iM208412y0 = ((xdl0.m208412y0() - xdl0.m208407w(24.0f)) - xdl0.m208407w(260.0f)) / 5;
            int iM208407w = xdl0.m208407w(31.0f);
            if (bLiveUndercoverGame.votes.size() < 9) {
                iM208412y0 = iM208407w;
            }
            C17825a c17825a = new C17825a(iM208412y0);
            this.f118865q = c17825a;
            this.f118860l.addItemDecoration(c17825a);
            this.f118861m.addItemDecoration(this.f118865q);
            if (bLiveUndercoverGame.votes.size() > 4) {
                int iCeil = (int) Math.ceil(((double) bLiveUndercoverGame.votes.size()) / 2.0d);
                this.f118862n.m101359D(bLiveUndercoverGame.votes.subList(0, iCeil));
                bep0 bep0Var = this.f118863o;
                List<BLiveUndercoverVote> list3 = bLiveUndercoverGame.votes;
                bep0Var.m101359D(list3.subList(iCeil, list3.size()));
                xdl0.m208344M(this.f118861m, true);
                xdl0.m208360X(this.f118860l, xdl0.m208407w(12.0f));
            } else {
                this.f118862n.m101359D(bLiveUndercoverGame.votes);
                xdl0.m208344M(this.f118861m, false);
                xdl0.m208360X(this.f118860l, xdl0.m208407w(52.0f));
            }
            m98408w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
        }
    }

    @Override // p149l.ari0
    /* JADX INFO: renamed from: x */
    public void mo98409x() {
        super.mo98409x();
        this.f118858j.setText(m98406u());
    }

    /* JADX INFO: renamed from: y */
    public final void m142378y(View view) {
        knj0.m146569a(this, view);
    }
}
