package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.LikesDetailAct;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ynr implements iam<xnr> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f200910a;

    /* JADX INFO: renamed from: b */
    public VText f200911b;

    /* JADX INFO: renamed from: c */
    public VList f200912c;

    /* JADX INFO: renamed from: d */
    public LikesDetailAct f200913d;

    /* JADX INFO: renamed from: e */
    public View f200914e;

    /* JADX INFO: renamed from: f */
    public tnr f200915f;

    public ynr(LikesDetailAct likesDetailAct) {
        this.f200913d = likesDetailAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f200913d;
    }

    /* JADX INFO: renamed from: a */
    public View m216951a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return znr.m220611b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f200913d;
    }

    /* JADX INFO: renamed from: b */
    public View m216952b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aor.m99222b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m216954d(Moment moment) {
        this.f200911b.setText(moment.likes.count + "");
        this.f200915f.m191960y(moment.likes.ids);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM216951a = m216951a(layoutInflater, viewGroup);
        m216952b(layoutInflater, this.f200912c);
        this.f200914e = layoutInflater.inflate(tec0.f173797z0, (ViewGroup) this.f200912c, false);
        return viewM216951a;
    }

    public void init() {
        this.f200913d.setTitle(R$string.f39839V3);
        this.f200915f = new tnr(this.f200913d);
        this.f200912c.addFooterView(this.f200913d.inflater().inflate(tec0.f173601W3, (ViewGroup) this.f200912c, false));
        this.f200912c.addHeaderView(this.f200910a, null, false);
        this.f200912c.setAdapter((ListAdapter) this.f200915f);
        this.f200912c.setRecyclerListener(this.f200915f);
        this.f200914e.setBackgroundColor(this.f200913d.getResources().getColor(k9c0.f124522n0));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xnr xnrVar) {
    }
}
