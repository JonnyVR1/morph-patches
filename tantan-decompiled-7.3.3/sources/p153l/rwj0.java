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
public class rwj0 extends puj0<qwj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f165144d;

    /* JADX INFO: renamed from: e */
    public VImage f165145e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f165146f;

    /* JADX INFO: renamed from: g */
    public VText f165147g;

    /* JADX INFO: renamed from: h */
    public VText f165148h;

    /* JADX INFO: renamed from: i */
    public VText f165149i;

    /* JADX INFO: renamed from: j */
    public iwj0 f165150j;

    /* JADX INFO: renamed from: l.rwj0$a */
    public class C19921a extends RecyclerView.AbstractC0578n {
        public C19921a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = -qa00.m175859d(8.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.rwj0$b */
    public class ViewOnClickListenerC19922b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f165152a;

        public ViewOnClickListenerC19922b(String str) {
            this.f165152a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = rwj0.this.f154194c;
            if (t != 0) {
                ((qwj0) t).m178502R3(this.f165152a);
            }
        }
    }

    /* JADX INFO: renamed from: l.rwj0$c */
    public class ViewOnClickListenerC19923c implements View.OnClickListener {
        public ViewOnClickListenerC19923c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = rwj0.this.f154194c;
            if (t != 0) {
                ydn0.m215261n(t);
            }
        }
    }

    public rwj0(VFrame vFrame) {
        super(vFrame);
    }

    /* JADX INFO: renamed from: r */
    private void m183356r() {
        this.f165150j = new iwj0();
        this.f165146f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f165146f.addItemDecoration(new C19921a());
        this.f165146f.setAdapter(this.f165150j);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m183357k(this.f154193b);
        m183356r();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199257t6;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135963I7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        if (bLiveUndercoverGame != null && TextUtils.equals(bLiveUndercoverGame.status, "waiting")) {
            int size = bLiveUndercoverGame.currentPlayers.size();
            this.f165150j.m142385A(bLiveUndercoverGame.buildUserList());
            int iM203530U3 = zrv.m221193k().m203530U3();
            VText vText = this.f165148h;
            if (size < iM203530U3) {
                vText.setText(String.format(getContext().getString(R$string.f47764Qc), Integer.valueOf(iM203530U3)));
            } else {
                vText.setText(String.format(getContext().getString(R$string.f47743Pc), Integer.valueOf(size)));
            }
            m183358l(bLiveUndercoverGame.f45312id, i, size >= iM203530U3);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m183357k(View view) {
        swj0.m188325a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public final void m183358l(String str, int i, boolean z) {
        this.f165149i.setOnClickListener(null);
        if (i == 2) {
            VText vText = this.f165149i;
            if (!z) {
                vText.setText(R$string.f47549Gc);
                this.f165149i.setBackgroundResource(obc0.f146128N6);
                this.f165149i.setEnabled(false);
                this.f165149i.setTextColor(-14990989);
                return;
            }
            vText.setText(R$string.f47549Gc);
            this.f165149i.setBackgroundResource(obc0.f146128N6);
            this.f165149i.setEnabled(true);
            this.f165149i.setTextColor(-14990989);
            this.f165149i.setOnClickListener(new ViewOnClickListenerC19922b(str));
            return;
        }
        VText vText2 = this.f165149i;
        if (i == 1) {
            vText2.setText(R$string.f47785Rc);
            this.f165149i.setBackgroundResource(0);
            this.f165149i.setEnabled(false);
            this.f165149i.setTextColor(-4956);
            return;
        }
        vText2.setText(R$string.f47615Jc);
        this.f165149i.setBackgroundResource(obc0.f146128N6);
        this.f165149i.setEnabled(true);
        this.f165149i.setTextColor(-14990989);
        this.f165149i.setOnClickListener(new ViewOnClickListenerC19923c());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
