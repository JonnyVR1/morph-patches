package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.api.C10898b;
import com.p051p1.mobile.putong.feed.p065ui.moments.LikeView;
import com.p051p1.mobile.putong.feed.p065ui.moments.LikesDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class tnr extends dq1<String> {

    /* JADX INFO: renamed from: c */
    public int f175304c = 0;

    /* JADX INFO: renamed from: d */
    public int f175305d = 1;

    /* JADX INFO: renamed from: e */
    public List<String> f175306e = new ArrayList(0);

    /* JADX INFO: renamed from: f */
    public boolean f175307f = true;

    /* JADX INFO: renamed from: g */
    public LikesDetailAct f175308g;

    public tnr(LikesDetailAct likesDetailAct) {
        this.f175308g = likesDetailAct;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m191957s(Throwable th) {
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        if (!this.f175307f || this.f175306e.size() - i >= 4) {
            return;
        }
        C10898b c10898b = FeedModule.f39702c;
        xnr xnrVar = this.f175308g.f44507c;
        c10898b.m61883S3(xnrVar.f195466b, xnrVar.f195465a).subscribe(psd0.m173597H(new y20() { // from class: l.rnr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164096a.m191959w((Boolean) obj);
            }
        }, new y20() { // from class: l.snr
            @Override // p153l.y20
            public final void call(Object obj) {
                tnr.m191957s((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        boolean z = this.f175307f;
        int size = this.f175306e.size();
        return z ? size + 1 : size;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i == this.f175306e.size()) {
            return null;
        }
        return this.f175306e.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i == this.f175306e.size() ? this.f175305d : this.f175304c;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        int i2 = this.f175304c;
        LikesDetailAct likesDetailAct = this.f175308g;
        return i == i2 ? likesDetailAct.inflater().inflate(tec0.f173500F4, (ViewGroup) this.f175308g.f44508d.f200912c, false) : likesDetailAct.f44508d.f200914e;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, String str, int i, int i2) {
        if (i == this.f175304c) {
            ((LikeView) view).m67820e(this, str, i2 == this.f175306e.size() - 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m191959w(Boolean bool) {
        this.f175307f = bool.booleanValue();
        m191960y(this.f175306e);
    }

    /* JADX INFO: renamed from: y */
    public void m191960y(List<String> list) {
        this.f175306e = list;
        notifyDataSetChanged();
    }
}
