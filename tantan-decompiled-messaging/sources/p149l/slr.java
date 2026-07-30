package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.api.C10735b;
import com.p046p1.mobile.putong.feed.p060ui.moments.LikeView;
import com.p046p1.mobile.putong.feed.p060ui.moments.LikesDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class slr extends wp1<String> {

    /* JADX INFO: renamed from: c */
    public int f165259c = 0;

    /* JADX INFO: renamed from: d */
    public int f165260d = 1;

    /* JADX INFO: renamed from: e */
    public List<String> f165261e = new ArrayList(0);

    /* JADX INFO: renamed from: f */
    public boolean f165262f = true;

    /* JADX INFO: renamed from: g */
    public LikesDetailAct f165263g;

    public slr(LikesDetailAct likesDetailAct) {
        this.f165263g = likesDetailAct;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m184850s(Throwable th) {
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        if (!this.f165262f || this.f165261e.size() - i >= 4) {
            return;
        }
        C10735b c10735b = FeedModule.f38854c;
        wlr wlrVar = this.f165263g.f43659c;
        c10735b.m60699S3(wlrVar.f186994b, wlrVar.f186993a).subscribe(mkd0.m154956H(new e30() { // from class: l.qlr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155250a.m184852w((Boolean) obj);
            }
        }, new e30() { // from class: l.rlr
            @Override // p149l.e30
            public final void call(Object obj) {
                slr.m184850s((Throwable) obj);
            }
        }));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        boolean z = this.f165262f;
        int size = this.f165261e.size();
        return z ? size + 1 : size;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i == this.f165261e.size()) {
            return null;
        }
        return this.f165261e.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i == this.f165261e.size() ? this.f165260d : this.f165259c;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        int i2 = this.f165259c;
        LikesDetailAct likesDetailAct = this.f165263g;
        return i == i2 ? likesDetailAct.inflater().inflate(o6c0.f142031F4, (ViewGroup) this.f165263g.f43660d.f193488c, false) : likesDetailAct.f43660d.f193490e;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, String str, int i, int i2) {
        if (i == this.f165259c) {
            ((LikeView) view).m66637e(this, str, i2 == this.f165261e.size() - 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m184852w(Boolean bool) {
        this.f165262f = bool.booleanValue();
        m184853y(this.f165261e);
    }

    /* JADX INFO: renamed from: y */
    public void m184853y(List<String> list) {
        this.f165261e = list;
        notifyDataSetChanged();
    }
}
