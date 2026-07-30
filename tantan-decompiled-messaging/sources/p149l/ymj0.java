package p149l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGameResult;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class ymj0 extends ari0<xmj0> {

    /* JADX INFO: renamed from: i */
    public VRelative f199018i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f199019j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f199020k;

    /* JADX INFO: renamed from: l */
    public VText f199021l;

    /* JADX INFO: renamed from: m */
    public View f199022m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f199023n;

    /* JADX INFO: renamed from: o */
    public VText f199024o;

    /* JADX INFO: renamed from: p */
    public VText f199025p;

    /* JADX INFO: renamed from: q */
    public fnj0 f199026q;

    /* JADX INFO: renamed from: r */
    public fnj0 f199027r;

    /* JADX INFO: renamed from: l.ymj0$a */
    public class C21440a extends RecyclerView.AbstractC0576n {
        public C21440a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -t100.m186890d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.ymj0$b */
    public class C21441b extends RecyclerView.AbstractC0576n {
        public C21441b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -t100.m186890d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.ymj0$c */
    public class ViewOnClickListenerC21442c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverGame f199030a;

        public ViewOnClickListenerC21442c(BLiveUndercoverGame bLiveUndercoverGame) {
            this.f199030a = bLiveUndercoverGame;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = ymj0.this.f134450c;
            if (t != 0) {
                ((xmj0) t).m210142U3(this.f199030a.f44464id);
            }
        }
    }

    public ymj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m215364r() {
        this.f199026q = new fnj0();
        this.f199020k.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f199020k.addItemDecoration(new C21440a());
        this.f199020k.setAdapter(this.f199026q);
        this.f199027r = new fnj0();
        this.f199023n.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f199023n.addItemDecoration(new C21441b());
        this.f199023n.setAdapter(this.f199027r);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m215365y(this.f134449b);
        m215364r();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168447n6;
    }

    @Override // p149l.s7m
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f199019j;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
        m98403p();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100691F7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverGameResult bLiveUndercoverGameResult;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "resultAnnouncing") || (bLiveUndercoverGameResult = bLiveUndercoverGame.gameResult) == null) {
            return;
        }
        if (TextUtils.equals(bLiveUndercoverGameResult.winnerRole, "normal")) {
            this.f199019j.m68500j("https://auto.tancdn.com/v1/raw/53ad74a9-32e4-4cc7-8faf-0ba93dd9e2eb12.pdf", 1);
        } else if (TextUtils.equals(bLiveUndercoverGameResult.winnerRole, VirtualVoiceMotionType.undercover)) {
            this.f199019j.m68500j("https://auto.tancdn.com/v1/raw/d16e17b0-941e-47f2-bad6-0a8a95be176d12.pdf", 1);
        }
        this.f199026q.m122313A(bLiveUndercoverGameResult.normalMasks);
        this.f199027r.m122313A(bLiveUndercoverGameResult.undercoverMasks);
        this.f199021l.setText(String.format(getContext().getString(R$string.f46613Cc), bLiveUndercoverGameResult.normalWord));
        this.f199024o.setText(String.format(getContext().getString(R$string.f46635Dc), bLiveUndercoverGameResult.undercoverWord));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f199019j.getLayoutParams();
        boolean zMo97490p = ((nnn0) ((xmj0) this.f134450c).m206027E2()).mo97490p();
        VText vText = this.f199025p;
        if (zMo97490p) {
            vText.setVisibility(0);
        } else {
            vText.setVisibility(8);
            layoutParams.topMargin = t100.m186890d(20.0f);
        }
        this.f199019j.setLayoutParams(layoutParams);
        this.f199025p.setOnClickListener(new ViewOnClickListenerC21442c(bLiveUndercoverGame));
        m98408w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
    }

    @Override // p149l.ari0
    /* JADX INFO: renamed from: x */
    public void mo98409x() {
        super.mo98409x();
        if (getContext() != null) {
            int iM98405s = m98405s();
            VText vText = this.f199025p;
            if (iM98405s <= 0) {
                vText.setText(R$string.f46591Bc);
                return;
            }
            vText.setText(String.format(getContext().getString(R$string.f46591Bc) + " %ss", Integer.valueOf(m98405s())));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m215365y(View view) {
        zmj0.m219349a(this, view);
    }
}
