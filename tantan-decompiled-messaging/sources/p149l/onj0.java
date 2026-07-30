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
public class onj0 extends mlj0<nnj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f144788d;

    /* JADX INFO: renamed from: e */
    public VImage f144789e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f144790f;

    /* JADX INFO: renamed from: g */
    public VText f144791g;

    /* JADX INFO: renamed from: h */
    public VText f144792h;

    /* JADX INFO: renamed from: i */
    public VText f144793i;

    /* JADX INFO: renamed from: j */
    public fnj0 f144794j;

    /* JADX INFO: renamed from: l.onj0$a */
    public class C18981a extends RecyclerView.AbstractC0576n {
        public C18981a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -t100.m186890d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.onj0$b */
    public class ViewOnClickListenerC18982b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f144796a;

        public ViewOnClickListenerC18982b(String str) {
            this.f144796a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = onj0.this.f134450c;
            if (t != 0) {
                ((nnj0) t).m160209R3(this.f144796a);
            }
        }
    }

    /* JADX INFO: renamed from: l.onj0$c */
    public class ViewOnClickListenerC18983c implements View.OnClickListener {
        public ViewOnClickListenerC18983c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = onj0.this.f134450c;
            if (t != 0) {
                u4n0.m191755n(t);
            }
        }
    }

    public onj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m165212r() {
        this.f144794j = new fnj0();
        this.f144790f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f144790f.addItemDecoration(new C18981a());
        this.f144790f.setAdapter(this.f144794j);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m165213k(this.f134449b);
        m165212r();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168525t6;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100718I7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "waiting")) {
            int size = bLiveUndercoverGame.currentPlayers.size();
            this.f144794j.m122313A(bLiveUndercoverGame.buildUserList());
            int iM195743U3 = ypv.m215672k().m195743U3();
            VText vText = this.f144792h;
            if (size < iM195743U3) {
                vText.setText(String.format(getContext().getString(R$string.f46916Qc), Integer.valueOf(iM195743U3)));
            } else {
                vText.setText(String.format(getContext().getString(R$string.f46895Pc), Integer.valueOf(size)));
            }
            m165214l(bLiveUndercoverGame.f44464id, i, size >= iM195743U3);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m165213k(View view) {
        pnj0.m170438a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m165214l(String str, int i, boolean z) {
        this.f144793i.setOnClickListener(null);
        if (i == 2) {
            VText vText = this.f144793i;
            if (!z) {
                vText.setText(R$string.f46701Gc);
                this.f144793i.setBackgroundResource(i3c0.f110800N6);
                this.f144793i.setEnabled(false);
                this.f144793i.setTextColor(-14990989);
                return;
            }
            vText.setText(R$string.f46701Gc);
            this.f144793i.setBackgroundResource(i3c0.f110800N6);
            this.f144793i.setEnabled(true);
            this.f144793i.setTextColor(-14990989);
            this.f144793i.setOnClickListener(new ViewOnClickListenerC18982b(str));
            return;
        }
        VText vText2 = this.f144793i;
        if (i == 1) {
            vText2.setText(R$string.f46937Rc);
            this.f144793i.setBackgroundResource(0);
            this.f144793i.setEnabled(false);
            this.f144793i.setTextColor(-4956);
            return;
        }
        vText2.setText(R$string.f46767Jc);
        this.f144793i.setBackgroundResource(i3c0.f110800N6);
        this.f144793i.setEnabled(true);
        this.f144793i.setTextColor(-14990989);
        this.f144793i.setOnClickListener(new ViewOnClickListenerC18983c());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
