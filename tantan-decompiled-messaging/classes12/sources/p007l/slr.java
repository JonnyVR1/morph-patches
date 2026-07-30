package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.api.C1579b;
import com.p000p1.mobile.putong.feed.p005ui.moments.LikeView;
import com.p000p1.mobile.putong.feed.p005ui.moments.LikesDetailAct;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.wp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class slr extends wp1<String> {

    /* JADX INFO: renamed from: c */
    public int f12998c = 0;

    /* JADX INFO: renamed from: d */
    public int f12999d = 1;

    /* JADX INFO: renamed from: e */
    public List<String> f13000e = new ArrayList(0);

    /* JADX INFO: renamed from: f */
    public boolean f13001f = true;

    /* JADX INFO: renamed from: g */
    public LikesDetailAct f13002g;

    public slr(LikesDetailAct likesDetailAct) {
        this.f13002g = likesDetailAct;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m14248s(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m14249e(int i) {
        if (!this.f13001f || this.f13000e.size() - i >= 4) {
            return;
        }
        C1579b c1579b = FeedModule.f315c;
        wlr wlrVar = this.f13002g.f5120c;
        c1579b.m1625S3(wlrVar.f14619b, wlrVar.f14618a).subscribe(mkd0.H(new e30() { // from class: l.qlr
            public final void call(Object obj) {
                this.f12272a.m14253w((Boolean) obj);
            }
        }, new e30() { // from class: l.rlr
            public final void call(Object obj) {
                slr.m14248s((Throwable) obj);
            }
        }));
    }

    public int getCount() {
        boolean z = this.f13001f;
        int size = this.f13000e.size();
        return z ? size + 1 : size;
    }

    public Object getItem(int i) {
        if (i == this.f13000e.size()) {
            return null;
        }
        return this.f13000e.get(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        return i == this.f13000e.size() ? this.f12999d : this.f12998c;
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* JADX INFO: renamed from: m */
    public View m14251m(ViewGroup viewGroup, int i) {
        int i2 = this.f12998c;
        LikesDetailAct likesDetailAct = this.f13002g;
        return i == i2 ? likesDetailAct.inflater().inflate(o6c0.f11050F4, (ViewGroup) this.f13002g.f5121d.f15038c, false) : likesDetailAct.f5121d.f15040e;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m14250j(View view, String str, int i, int i2) {
        if (i == this.f12998c) {
            ((LikeView) view).m7828e(this, str, i2 == this.f13000e.size() - 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m14253w(Boolean bool) {
        this.f13001f = bool.booleanValue();
        m14254y(this.f13000e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m14254y(List<String> list) {
        this.f13000e = list;
        notifyDataSetChanged();
    }
}
