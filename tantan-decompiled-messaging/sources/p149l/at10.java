package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class at10 implements s7m<ts10> {

    /* JADX INFO: renamed from: a */
    public final Act f71517a;

    /* JADX INFO: renamed from: b */
    public ts10 f71518b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f71519c;

    /* JADX INFO: renamed from: d */
    public VText f71520d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f71521e;

    /* JADX INFO: renamed from: f */
    public Button f71522f;

    /* JADX INFO: renamed from: g */
    public List<IntlMusicBean> f71523g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public View f71524h;

    /* JADX INFO: renamed from: i */
    public View f71525i;

    public at10(Act act) {
        this.f71517a = act;
    }

    /* JADX INFO: renamed from: l */
    private void m98655l(View view) {
        xdl0.m208360X(view.findViewById(f5c0.f95082d1), xdl0.m208331F0());
        xdl0.m208329E0(view.findViewById(f5c0.f95160x), new View.OnClickListener() { // from class: l.xs10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f194197a.m98663n(view2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    private void m98656m(View view) {
        this.f71519c = (VRecyclerView) view.findViewById(f5c0.f95030N0);
        this.f71520d = (VText) view.findViewById(f5c0.f95154v1);
        this.f71522f = (Button) view.findViewById(f5c0.f95014J0);
        this.f71524h = view.findViewById(f5c0.f95089f0);
        this.f71525i = view.findViewById(f5c0.f95032O);
        xdl0.m208329E0(this.f71520d, new View.OnClickListener() { // from class: l.us10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f177935a.m98657p(view2);
            }
        });
        this.f71519c.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f71521e = liveBaseAdapter;
        this.f71519c.setAdapter(liveBaseAdapter);
        xdl0.m208329E0(this.f71522f, new View.OnClickListener() { // from class: l.vs10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182795a.m98658q(view2);
            }
        });
        m98655l(view);
        m98662k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m98657p(View view) {
        m98659v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m98658q(View view) {
        m98660i();
    }

    /* JADX INFO: renamed from: v */
    private void m98659v() {
        this.f71518b.m190510y2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m98660i() {
        zvf0.m220396r("e_intl_local_music_play_add_music", "p_intl_local_music_play_main");
        pr10.m170951f1().m170962c1(this.f71523g, true);
        this.f71517a.m66873d2();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162688N, (ViewGroup) null);
        m98656m(viewInflate);
        return viewInflate;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ts10 ts10Var) {
        this.f71518b = ts10Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m98662k() {
        boolean zM200296J = vwb.m200296J(this.f71523g);
        Button button = this.f71522f;
        if (zM200296J) {
            button.setEnabled(false);
            this.f71522f.setTextColor(Color.parseColor("#66FFFFFF"));
            this.f71522f.setBackgroundDrawable(yb2.m213876a(Color.parseColor("#7F4F2D"), t100.m186890d(10.0f), false));
        } else {
            button.setEnabled(true);
            this.f71522f.setTextColor(Color.parseColor("#E5FFFFFF"));
            this.f71522f.setBackgroundResource(h3c0.f105684l);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m98663n(View view) {
        this.f71518b.m190509w2();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m98664s(boolean z, final os10 os10Var, View view) {
        if (z) {
            return;
        }
        boolean z2 = os10Var.f145371b;
        os10Var.f145371b = !z2;
        List<IntlMusicBean> list = this.f71523g;
        if (z2) {
            vwb.m200320d0(list, new w9j() { // from class: l.zs10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(os10Var.f145370a.filePath, ((IntlMusicBean) obj).filePath));
                }
            });
        } else {
            list.add(os10Var.f145370a);
        }
        m98662k();
        this.f71521e.m67360O(os10Var);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m98665u(ArrayList arrayList, IntlMusicBean intlMusicBean) {
        final os10 os10Var = new os10(intlMusicBean);
        final boolean zM170970k1 = pr10.m170951f1().m170970k1(intlMusicBean.filePath);
        os10Var.f145372c = !zM170970k1;
        os10Var.mo109662A(new View.OnClickListener() { // from class: l.ys10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199737a.m98664s(zM170970k1, os10Var, view);
            }
        });
        arrayList.add(os10Var);
    }

    /* JADX INFO: renamed from: w */
    public void m98666w(List<IntlMusicBean> list) {
        this.f71523g.clear();
        boolean zM200296J = vwb.m200296J(list);
        View view = this.f71524h;
        if (zM200296J) {
            xdl0.m208344M(view, true);
            xdl0.m208344M(this.f71525i, false);
            return;
        }
        xdl0.m208344M(view, false);
        xdl0.m208344M(this.f71525i, true);
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.ws10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187854a.m98665u(arrayList, (IntlMusicBean) obj);
            }
        });
        arrayList.add(new tds(t100.m186890d(72.0f)));
        this.f71521e.m67371Z(arrayList);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
