package p149l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class pmj0 extends mlj0<omj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f150231d;

    /* JADX INFO: renamed from: e */
    public VImage f150232e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f150233f;

    /* JADX INFO: renamed from: g */
    public VText f150234g;

    /* JADX INFO: renamed from: h */
    public VText f150235h;

    /* JADX INFO: renamed from: i */
    public VText f150236i;

    /* JADX INFO: renamed from: j */
    public fnj0 f150237j;

    /* JADX INFO: renamed from: l.pmj0$a */
    public class C19280a extends RecyclerView.AbstractC0576n {
        public C19280a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -t100.m186890d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.pmj0$b */
    public class ViewOnClickListenerC19281b implements View.OnClickListener {
        public ViewOnClickListenerC19281b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = pmj0.this.f134450c;
            if (t != 0) {
                y8n0.m213410a(((nnn0) ((omj0) t).m206027E2()).m149814k());
                u4n0.m191755n(pmj0.this.f134450c);
            }
        }
    }

    public pmj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m170335r() {
        this.f150237j = new fnj0();
        this.f150233f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f150233f.addItemDecoration(new C19280a());
        this.f150233f.setAdapter(this.f150237j);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m170336k(this.f134449b);
        m170335r();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168421l6;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100673D7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "questionAnnouncing")) {
            this.f150237j.m122313A(bLiveUndercoverGame.buildUserList());
            this.f150234g.setText(R$string.f47675zc);
            this.f150235h.setVisibility(8);
            VText vText = this.f150236i;
            if (i != 0) {
                vText.setVisibility(8);
                return;
            }
            vText.setText(R$string.f46789Kc);
            this.f150236i.setBackgroundResource(i3c0.f110800N6);
            this.f150236i.setEnabled(true);
            this.f150236i.setTextColor(-14990989);
            this.f150236i.setOnClickListener(new ViewOnClickListenerC19281b());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m170336k(View view) {
        qmj0.m175572a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
