package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class i120 implements iam<b120> {

    /* JADX INFO: renamed from: a */
    public final Act f112474a;

    /* JADX INFO: renamed from: b */
    public b120 f112475b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f112476c;

    /* JADX INFO: renamed from: d */
    public VText f112477d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f112478e;

    /* JADX INFO: renamed from: f */
    public Button f112479f;

    /* JADX INFO: renamed from: g */
    public List<IntlMusicBean> f112480g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public View f112481h;

    /* JADX INFO: renamed from: i */
    public View f112482i;

    public i120(Act act) {
        this.f112474a = act;
    }

    /* JADX INFO: renamed from: l */
    private void m138061l(View view) {
        bnl0.m105540X(view.findViewById(ldc0.f131539d1), bnl0.m105511F0());
        bnl0.m105509E0(view.findViewById(ldc0.f131617x), new View.OnClickListener() { // from class: l.f120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96763a.m138069n(view2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    private void m138062m(View view) {
        this.f112476c = (VRecyclerView) view.findViewById(ldc0.f131487N0);
        this.f112477d = (VText) view.findViewById(ldc0.f131611v1);
        this.f112479f = (Button) view.findViewById(ldc0.f131471J0);
        this.f112481h = view.findViewById(ldc0.f131546f0);
        this.f112482i = view.findViewById(ldc0.f131489O);
        bnl0.m105509E0(this.f112477d, new View.OnClickListener() { // from class: l.c120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79332a.m138063p(view2);
            }
        });
        this.f112476c.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f112478e = liveBaseAdapter;
        this.f112476c.setAdapter(liveBaseAdapter);
        bnl0.m105509E0(this.f112479f, new View.OnClickListener() { // from class: l.d120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f84632a.m138064q(view2);
            }
        });
        m138061l(view);
        m138068k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m138063p(View view) {
        m138065v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m138064q(View view) {
        m138066i();
    }

    /* JADX INFO: renamed from: v */
    private void m138065v() {
        this.f112475b.m101390y2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m138066i() {
        i4g0.m138520r("e_intl_local_music_play_add_music", "p_intl_local_music_play_main");
        xz10.m213668f1().m213679c1(this.f112480g, true);
        this.f112474a.m68056e2();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193802N, (ViewGroup) null);
        m138062m(viewInflate);
        return viewInflate;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b120 b120Var) {
        this.f112475b = b120Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m138068k() {
        boolean zM147479J = jyb.m147479J(this.f112480g);
        Button button = this.f112479f;
        if (zM147479J) {
            button.setEnabled(false);
            this.f112479f.setTextColor(Color.parseColor("#66FFFFFF"));
            this.f112479f.setBackgroundDrawable(fc2.m124971a(Color.parseColor("#7F4F2D"), qa00.m175859d(10.0f), false));
        } else {
            button.setEnabled(true);
            this.f112479f.setTextColor(Color.parseColor("#E5FFFFFF"));
            this.f112479f.setBackgroundResource(nbc0.f141175l);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m138069n(View view) {
        this.f112475b.m101389w2();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m138070s(boolean z, final w020 w020Var, View view) {
        if (z) {
            return;
        }
        boolean z2 = w020Var.f186535b;
        w020Var.f186535b = !z2;
        List<IntlMusicBean> list = this.f112480g;
        if (z2) {
            jyb.m147503d0(list, new qcj() { // from class: l.h120
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(w020Var.f186534a.filePath, ((IntlMusicBean) obj).filePath));
                }
            });
        } else {
            list.add(w020Var.f186534a);
        }
        m138068k();
        this.f112478e.m68543O(w020Var);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m138071u(ArrayList arrayList, IntlMusicBean intlMusicBean) {
        final w020 w020Var = new w020(intlMusicBean);
        final boolean zM213687k1 = xz10.m213668f1().m213687k1(intlMusicBean.filePath);
        w020Var.f186536c = !zM213687k1;
        w020Var.mo113881A(new View.OnClickListener() { // from class: l.g120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101710a.m138070s(zM213687k1, w020Var, view);
            }
        });
        arrayList.add(w020Var);
    }

    /* JADX INFO: renamed from: w */
    public void m138072w(List<IntlMusicBean> list) {
        this.f112480g.clear();
        boolean zM147479J = jyb.m147479J(list);
        View view = this.f112481h;
        if (zM147479J) {
            bnl0.m105524M(view, true);
            bnl0.m105524M(this.f112482i, false);
            return;
        }
        bnl0.m105524M(view, false);
        bnl0.m105524M(this.f112482i, true);
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.e120
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91561a.m138071u(arrayList, (IntlMusicBean) obj);
            }
        });
        arrayList.add(new ufs(qa00.m175859d(72.0f)));
        this.f112478e.m68554Z(arrayList);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
