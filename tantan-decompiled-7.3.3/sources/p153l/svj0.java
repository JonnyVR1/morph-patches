package p153l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class svj0 extends puj0<rvj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f170844d;

    /* JADX INFO: renamed from: e */
    public VImage f170845e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f170846f;

    /* JADX INFO: renamed from: g */
    public VText f170847g;

    /* JADX INFO: renamed from: h */
    public VText f170848h;

    /* JADX INFO: renamed from: i */
    public VText f170849i;

    /* JADX INFO: renamed from: j */
    public iwj0 f170850j;

    /* JADX INFO: renamed from: l.svj0$a */
    public class C20160a extends RecyclerView.AbstractC0578n {
        public C20160a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -qa00.m175859d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.svj0$b */
    public class ViewOnClickListenerC20161b implements View.OnClickListener {
        public ViewOnClickListenerC20161b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = svj0.this.f154194c;
            if (t != 0) {
                cin0.m109906a(((rwn0) ((rvj0) t).m213810E2()).m202191k());
                ydn0.m215261n(svj0.this.f154194c);
            }
        }
    }

    public svj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m188210r() {
        this.f170850j = new iwj0();
        this.f170846f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f170846f.addItemDecoration(new C20160a());
        this.f170846f.setAdapter(this.f170850j);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m188211k(this.f154193b);
        m188210r();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199153l6;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135918D7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "questionAnnouncing")) {
            this.f170850j.m142385A(bLiveUndercoverGame.buildUserList());
            this.f170847g.setText(R$string.f48523zc);
            this.f170848h.setVisibility(8);
            VText vText = this.f170849i;
            if (i != 0) {
                vText.setVisibility(8);
                return;
            }
            vText.setText(R$string.f47637Kc);
            this.f170849i.setBackgroundResource(obc0.f146128N6);
            this.f170849i.setEnabled(true);
            this.f170849i.setTextColor(-14990989);
            this.f170849i.setOnClickListener(new ViewOnClickListenerC20161b());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m188211k(View view) {
        tvj0.m192809a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
