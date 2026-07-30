package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.LikesDetailAct;
import com.p1.mobile.android.app.Act;
import l.s7m;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xlr implements s7m<wlr> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f15036a;

    /* JADX INFO: renamed from: b */
    public VText f15037b;

    /* JADX INFO: renamed from: c */
    public VList f15038c;

    /* JADX INFO: renamed from: d */
    public LikesDetailAct f15039d;

    /* JADX INFO: renamed from: e */
    public View f15040e;

    /* JADX INFO: renamed from: f */
    public slr f15041f;

    public xlr(LikesDetailAct likesDetailAct) {
        this.f15039d = likesDetailAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16790C0() {
        return this.f15039d;
    }

    /* JADX INFO: renamed from: a */
    public View m16791a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ylr.m17170b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f15039d;
    }

    /* JADX INFO: renamed from: b */
    public View m16792b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zlr.m17512b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m16794d(Moment moment) {
        this.f15037b.setText(moment.likes.count + "");
        this.f15041f.m14254y(moment.likes.ids);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16791a = m16791a(layoutInflater, viewGroup);
        m16792b(layoutInflater, this.f15038c);
        this.f15040e = layoutInflater.inflate(o6c0.f11347z0, (ViewGroup) this.f15038c, false);
        return viewM16791a;
    }

    public void init() {
        this.f15039d.setTitle(R$string.f452V3);
        this.f15041f = new slr(this.f15039d);
        this.f15038c.addFooterView(this.f15039d.inflater().inflate(o6c0.f11151W3, (ViewGroup) this.f15038c, false));
        this.f15038c.addHeaderView(this.f15036a, null, false);
        this.f15038c.setAdapter(this.f15041f);
        this.f15038c.setRecyclerListener(this.f15041f);
        this.f15040e.setBackgroundColor(this.f15039d.getResources().getColor(e1c0.f7155n0));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m16795i1(wlr wlrVar) {
    }
}
