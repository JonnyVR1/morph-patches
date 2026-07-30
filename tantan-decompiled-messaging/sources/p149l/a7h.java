package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a7h implements isl {

    /* JADX INFO: renamed from: a */
    public List<hsl> f67925a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f67926b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f67927c;

    /* JADX INFO: renamed from: d */
    public C11280a f67928d;

    public a7h(C11280a c11280a) {
        this.f67928d = c11280a;
        if (NullChecker.m81303a(c11280a)) {
            this.f67926b = c11280a.f41380e;
            this.f67927c = c11280a.f41379d;
        }
        m95290a();
    }

    /* JADX INFO: renamed from: a */
    public final void m95290a() {
        this.f67925a.add(new srh());
        if (jlg.m142074f().m142088p()) {
            this.f67925a.add(new klg());
        }
        this.f67925a.add(new gue0());
    }

    /* JADX INFO: renamed from: b */
    public boolean m95291b() {
        if (vwb.m200296J(this.f67925a)) {
            return false;
        }
        Iterator<hsl> it = this.f67925a.iterator();
        while (it.hasNext()) {
            if (it.next().mo132784d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m95292c(String str) {
        if (!m95291b() && !vwb.m200296J(this.f67925a)) {
            Iterator<hsl> it = this.f67925a.iterator();
            while (it.hasNext()) {
                if (it.next().mo128028a(this.f67926b, str, this)) {
                    return true;
                }
            }
        }
        return false;
    }
}
