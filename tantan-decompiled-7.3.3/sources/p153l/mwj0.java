package p153l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class mwj0 extends d0j0<lwj0> implements vam {

    /* JADX INFO: renamed from: i */
    public VRelative f139099i;

    /* JADX INFO: renamed from: j */
    public VText f139100j;

    /* JADX INFO: renamed from: k */
    public VText f139101k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f139102l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f139103m;

    /* JADX INFO: renamed from: n */
    public fnp0 f139104n;

    /* JADX INFO: renamed from: o */
    public fnp0 f139105o;

    /* JADX INFO: renamed from: p */
    public String f139106p;

    /* JADX INFO: renamed from: q */
    public RecyclerView.AbstractC0578n f139107q;

    /* JADX INFO: renamed from: r */
    public List<BLiveUndercoverCurrentPlayer> f139108r;

    /* JADX INFO: renamed from: l.mwj0$a */
    public class C18723a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f139109a;

        public C18723a(int i) {
            this.f139109a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int i = this.f139109a;
            rect.left = i / 2;
            rect.right = i / 2;
        }
    }

    public mwj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m160553r() {
        this.f139104n = new fnp0(this, true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f139102l.setLayoutManager(linearLayoutManager);
        this.f139102l.setAdapter(this.f139104n);
        this.f139105o = new fnp0(this, false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.setOrientation(0);
        this.f139103m.setLayoutManager(linearLayoutManager2);
        this.f139103m.setAdapter(this.f139105o);
    }

    @Override // p153l.vam
    /* JADX INFO: renamed from: a */
    public void mo160554a(String str, String str2) {
        List<BLiveUndercoverCurrentPlayer> list;
        if (this.f154194c == 0 || (list = this.f139108r) == null) {
            return;
        }
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : list) {
            if (TextUtils.equals(bLiveUndercoverCurrentPlayer.userId, zrv.f205799a.m207631D0()) && !TextUtils.equals(bLiveUndercoverCurrentPlayer.role, "out")) {
                ((lwj0) this.f154194c).m156056R3(this.f139106p, str, str2);
                return;
            }
        }
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m160555y(this.f154193b);
        m160553r();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199205p6;
    }

    @Override // p153l.iam
    public void destroy() {
        m113404p();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135954H7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "voting")) {
            List<BLiveUndercoverCurrentPlayer> list2 = bLiveUndercoverGame.currentPlayers;
            this.f139108r = list2;
            this.f139106p = bLiveUndercoverGame.f45312id;
            boolean z = false;
            for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : list2) {
                if (TextUtils.equals(bLiveUndercoverCurrentPlayer.userId, zrv.f205799a.m207631D0()) && !TextUtils.equals(bLiveUndercoverCurrentPlayer.role, "out")) {
                    z = true;
                }
            }
            this.f139101k.setText(z ? R$string.f47680Mc : R$string.f47701Nc);
            RecyclerView.AbstractC0578n abstractC0578n = this.f139107q;
            if (abstractC0578n != null) {
                this.f139102l.removeItemDecoration(abstractC0578n);
                this.f139103m.removeItemDecoration(this.f139107q);
            }
            int iM105592y0 = ((bnl0.m105592y0() - bnl0.m105587w(24.0f)) - bnl0.m105587w(260.0f)) / 5;
            int iM105587w = bnl0.m105587w(31.0f);
            if (bLiveUndercoverGame.votes.size() < 9) {
                iM105592y0 = iM105587w;
            }
            C18723a c18723a = new C18723a(iM105592y0);
            this.f139107q = c18723a;
            this.f139102l.addItemDecoration(c18723a);
            this.f139103m.addItemDecoration(this.f139107q);
            if (bLiveUndercoverGame.votes.size() > 4) {
                int iCeil = (int) Math.ceil(((double) bLiveUndercoverGame.votes.size()) / 2.0d);
                this.f139104n.m126373D(bLiveUndercoverGame.votes.subList(0, iCeil));
                fnp0 fnp0Var = this.f139105o;
                List<BLiveUndercoverVote> list3 = bLiveUndercoverGame.votes;
                fnp0Var.m126373D(list3.subList(iCeil, list3.size()));
                bnl0.m105524M(this.f139103m, true);
                bnl0.m105540X(this.f139102l, bnl0.m105587w(12.0f));
            } else {
                this.f139104n.m126373D(bLiveUndercoverGame.votes);
                bnl0.m105524M(this.f139103m, false);
                bnl0.m105540X(this.f139102l, bnl0.m105587w(52.0f));
            }
            m113409w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
        }
    }

    @Override // p153l.d0j0
    /* JADX INFO: renamed from: x */
    public void mo106724x() {
        super.mo106724x();
        this.f139100j.setText(m113407u());
    }

    /* JADX INFO: renamed from: y */
    public final void m160555y(View view) {
        nwj0.m164992a(this, view);
    }
}
