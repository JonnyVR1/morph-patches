package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class txp implements s7m<rxp> {

    /* JADX INFO: renamed from: a */
    public View f172518a;

    /* JADX INFO: renamed from: b */
    public TextView f172519b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f172520c;

    /* JADX INFO: renamed from: d */
    public EmptyView f172521d;

    /* JADX INFO: renamed from: e */
    public rxp f172522e;

    /* JADX INFO: renamed from: f */
    public DialogC12611a f172523f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f172524g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m190966f(View view) {
        this.f172523f.dismiss();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172522e.act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f172522e.act();
    }

    /* JADX INFO: renamed from: b */
    public View m190967b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uxp.m196194b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rxp rxpVar) {
        this.f172522e = rxpVar;
    }

    /* JADX INFO: renamed from: d */
    public void m190969d() {
        uep0.m193327n(this.f172523f);
    }

    /* JADX INFO: renamed from: e */
    public List<d1q<?>> m190970e() {
        return this.f172524g.m67355J();
    }

    /* JADX INFO: renamed from: i */
    public void m190971i(List<d1q<?>> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f172521d, true);
            xdl0.m208344M(this.f172520c, false);
            this.f172521d.m68717b(i3c0.f110876U4).m68720e(R$string.f47400n1);
        } else {
            this.f172524g.m67371Z(list);
            xdl0.m208344M(this.f172521d, false);
            xdl0.m208344M(this.f172520c, true);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m190972j() {
        if (this.f172523f == null) {
            this.f172523f = new byr(this.f172522e, m190967b(act().inflater(), null));
            this.f172520c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            this.f172524g = liveBaseAdapter;
            this.f172520c.setAdapter(liveBaseAdapter);
            this.f172518a.setOnClickListener(new View.OnClickListener() { // from class: l.sxp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166813a.m190966f(view);
                }
            });
        }
        this.f172523f.show();
    }

    /* JADX INFO: renamed from: k */
    public void m190973k(hxp hxpVar) {
        this.f172524g.m67360O(hxpVar);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
