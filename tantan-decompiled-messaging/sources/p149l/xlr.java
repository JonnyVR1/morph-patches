package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.LikesDetailAct;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xlr implements s7m<wlr> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f193486a;

    /* JADX INFO: renamed from: b */
    public VText f193487b;

    /* JADX INFO: renamed from: c */
    public VList f193488c;

    /* JADX INFO: renamed from: d */
    public LikesDetailAct f193489d;

    /* JADX INFO: renamed from: e */
    public View f193490e;

    /* JADX INFO: renamed from: f */
    public slr f193491f;

    public xlr(LikesDetailAct likesDetailAct) {
        this.f193489d = likesDetailAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f193489d;
    }

    /* JADX INFO: renamed from: a */
    public View m209968a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ylr.m215308b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f193489d;
    }

    /* JADX INFO: renamed from: b */
    public View m209969b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zlr.m219289b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m209971d(Moment moment) {
        this.f193487b.setText(moment.likes.count + "");
        this.f193491f.m184853y(moment.likes.ids);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM209968a = m209968a(layoutInflater, viewGroup);
        m209969b(layoutInflater, this.f193488c);
        this.f193490e = layoutInflater.inflate(o6c0.f142328z0, (ViewGroup) this.f193488c, false);
        return viewM209968a;
    }

    public void init() {
        this.f193489d.setTitle(R$string.f38991V3);
        this.f193491f = new slr(this.f193489d);
        this.f193488c.addFooterView(this.f193489d.inflater().inflate(o6c0.f142132W3, (ViewGroup) this.f193488c, false));
        this.f193488c.addHeaderView(this.f193486a, null, false);
        this.f193488c.setAdapter((ListAdapter) this.f193491f);
        this.f193488c.setRecyclerListener(this.f193491f);
        this.f193490e.setBackgroundColor(this.f193489d.getResources().getColor(e1c0.f88799n0));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wlr wlrVar) {
    }
}
