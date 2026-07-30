package p153l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGameResult;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class bwj0 extends d0j0<awj0> {

    /* JADX INFO: renamed from: i */
    public VRelative f78744i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f78745j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f78746k;

    /* JADX INFO: renamed from: l */
    public VText f78747l;

    /* JADX INFO: renamed from: m */
    public View f78748m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f78749n;

    /* JADX INFO: renamed from: o */
    public VText f78750o;

    /* JADX INFO: renamed from: p */
    public VText f78751p;

    /* JADX INFO: renamed from: q */
    public iwj0 f78752q;

    /* JADX INFO: renamed from: r */
    public iwj0 f78753r;

    /* JADX INFO: renamed from: l.bwj0$a */
    public class C16120a extends RecyclerView.AbstractC0578n {
        public C16120a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -qa00.m175859d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.bwj0$b */
    public class C16121b extends RecyclerView.AbstractC0578n {
        public C16121b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -qa00.m175859d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.bwj0$c */
    public class ViewOnClickListenerC16122c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverGame f78756a;

        public ViewOnClickListenerC16122c(BLiveUndercoverGame bLiveUndercoverGame) {
            this.f78756a = bLiveUndercoverGame;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = bwj0.this.f154194c;
            if (t != 0) {
                ((awj0) t).m100673U3(this.f78756a.f45312id);
            }
        }
    }

    public bwj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m106719r() {
        this.f78752q = new iwj0();
        this.f78746k.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f78746k.addItemDecoration(new C16120a());
        this.f78746k.setAdapter(this.f78752q);
        this.f78753r = new iwj0();
        this.f78749n.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f78749n.addItemDecoration(new C16121b());
        this.f78749n.setAdapter(this.f78753r);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m106725y(this.f154193b);
        m106719r();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199179n6;
    }

    @Override // p153l.iam
    public void destroy() {
        AnimEffectPlayer animEffectPlayer = this.f78745j;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
        m113404p();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135936F7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverGameResult bLiveUndercoverGameResult;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "resultAnnouncing") || (bLiveUndercoverGameResult = bLiveUndercoverGame.gameResult) == null) {
            return;
        }
        if (TextUtils.equals(bLiveUndercoverGameResult.winnerRole, "normal")) {
            this.f78745j.m69683j("https://auto.tancdn.com/v1/raw/53ad74a9-32e4-4cc7-8faf-0ba93dd9e2eb12.pdf", 1);
        } else if (TextUtils.equals(bLiveUndercoverGameResult.winnerRole, VirtualVoiceMotionType.undercover)) {
            this.f78745j.m69683j("https://auto.tancdn.com/v1/raw/d16e17b0-941e-47f2-bad6-0a8a95be176d12.pdf", 1);
        }
        this.f78752q.m142385A(bLiveUndercoverGameResult.normalMasks);
        this.f78753r.m142385A(bLiveUndercoverGameResult.undercoverMasks);
        this.f78747l.setText(String.format(getContext().getString(R$string.f47461Cc), bLiveUndercoverGameResult.normalWord));
        this.f78750o.setText(String.format(getContext().getString(R$string.f47483Dc), bLiveUndercoverGameResult.undercoverWord));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f78745j.getLayoutParams();
        boolean zMo118373p = ((rwn0) ((awj0) this.f154194c).m213810E2()).mo118373p();
        VText vText = this.f78751p;
        if (zMo118373p) {
            vText.setVisibility(0);
        } else {
            vText.setVisibility(8);
            layoutParams.topMargin = qa00.m175859d(20.0f);
        }
        this.f78745j.setLayoutParams(layoutParams);
        this.f78751p.setOnClickListener(new ViewOnClickListenerC16122c(bLiveUndercoverGame));
        m113409w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
    }

    @Override // p153l.d0j0
    /* JADX INFO: renamed from: x */
    public void mo106724x() {
        super.mo106724x();
        if (getContext() != null) {
            int iM113406s = m113406s();
            VText vText = this.f78751p;
            if (iM113406s <= 0) {
                vText.setText(R$string.f47439Bc);
                return;
            }
            vText.setText(String.format(getContext().getString(R$string.f47439Bc) + " %ss", Integer.valueOf(m113406s())));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m106725y(View view) {
        cwj0.m112923a(this, view);
    }
}
