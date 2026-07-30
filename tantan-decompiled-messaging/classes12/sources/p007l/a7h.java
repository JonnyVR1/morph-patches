package p007l;

import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a7h implements isl {

    /* JADX INFO: renamed from: a */
    public List<hsl> f5622a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f5623b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f5624c;

    /* JADX INFO: renamed from: d */
    public C2124a f5625d;

    public a7h(C2124a c2124a) {
        this.f5625d = c2124a;
        if (NullChecker.a(c2124a)) {
            this.f5623b = c2124a.f2841e;
            this.f5624c = c2124a.f2840d;
        }
        m8451a();
    }

    /* JADX INFO: renamed from: a */
    public final void m8451a() {
        this.f5622a.add(new srh());
        if (jlg.m11182f().m11196p()) {
            this.f5622a.add(new klg());
        }
        this.f5622a.add(new gue0());
    }

    /* JADX INFO: renamed from: b */
    public boolean m8452b() {
        if (vwb.J(this.f5622a)) {
            return false;
        }
        Iterator<hsl> it = this.f5622a.iterator();
        while (it.hasNext()) {
            if (it.next().mo10729d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m8453c(String str) {
        if (!m8452b() && !vwb.J(this.f5622a)) {
            Iterator<hsl> it = this.f5622a.iterator();
            while (it.hasNext()) {
                if (it.next().mo10498a(this.f5623b, str, this)) {
                    return true;
                }
            }
        }
        return false;
    }
}
