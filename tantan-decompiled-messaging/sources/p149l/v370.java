package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class v370 extends wp1<User> {

    /* JADX INFO: renamed from: c */
    public String f179750c;

    /* JADX INFO: renamed from: d */
    public PutongAct f179751d;

    /* JADX INFO: renamed from: e */
    public List<User> f179752e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public u470 f179753f;

    public v370(PutongAct putongAct, String str, u470 u470Var) {
        this.f179751d = putongAct;
        this.f179750c = str;
        this.f179753f = u470Var;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        this.f179753f.m191719e(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f179752e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f179751d.inflater().inflate(o6c0.f142291t5, viewGroup, false);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, User user, int i, int i2) {
        ((PhotoAlbumFansView) view).m63644n(user, this.f179750c.equals("fans"), this.f179750c);
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f179752e.get(i);
    }

    /* JADX INFO: renamed from: t */
    public void m196833t(List<User> list) {
        this.f179752e = list;
        notifyDataSetChanged();
    }
}
